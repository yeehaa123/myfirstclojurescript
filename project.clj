(defproject perfection "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.908"]]
  :jvm-opts ["-Xmx1G"] ;; <- Sometimes ClojureScript compilation fails because available
  ;; JVM heap space it too low. This line gives it more space
  :plugins [[lein-cljsbuild "1.1.7"]]
  ;; This is the list of builds 'cljsbuild' will use to compile our ClojureScript
  ;; code into JavaScript. Here we add first build "dev", it will put resulting main
  ;; entry for JavaScript code to resources/public/perfection.js, and all dependencies
  ;; for it to resources/public/out
  :cljsbuild {
              :builds [{:id "dev"
                        :source-paths ["src/perfection"]
                        :compiler {
                                   :output-to "resources/public/perfection.js"
                                   :output-dir "resources/public/out"
                                   :optimizations :none
                                   :source-map true}}]})
