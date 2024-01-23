This repo is a collection of clients deobfuscated using my additions to `openrs2 deob`. Hopefully it saves someone time.

## Inspect a specific revision

Fresh clones: `git clone https://github.com/RuneWiki/openrs2-nonfree -b 555`

Already cloned: `git checkout 555` OR `git fetch origin 555 && git reset --hard FETCH_HEAD` depending on your needs.

The latter may come in handy as this repo force-writes over revision branches when there have been deob process improvements.

If you've cloned and you're reading this file currently... change your branch!

## Failure Log

### RT3

Failed:  
Missing: 185, 187-193, 195-203, 205-216, 218, 220, 221, 223, 224, 226-233, 235, 236, 238-244, 246-248, 250, 251, 255, 256, 258-269, 271-273, 275-281, 283-288, 290-293, 296, 301, 302, 304, 305, 307, 309-316, 319, 320, 322-236, 328, 329, 331, 334, 335, 337, 338, 341-344, 348, 349, 351-354, 361, 370, 400-402, 404-409, 411-413, 415, 416, 420-422, 424-426, 428-432, 434, 436-438, 440, 442, 444, 446, 447, 450, 482, 486, 491

### RT4

Failed: 502, 504, 505, 508-534, 536-539  
Missing: 547

### RT5

Failed: 583, 586, 590, 598, 626, 639, 651, 653-655, 657, 659, 660, 662, 666, 668  
Missing: 557, 576, 579, 580, 584, 628
