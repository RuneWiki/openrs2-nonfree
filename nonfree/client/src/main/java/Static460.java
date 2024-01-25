import jagex3.jagmisc.jagmisc;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!rw", name = "z", descriptor = "Lclient!pj;")
	public static Class248 aClass248_89;

	@OriginalMember(owner = "client!rw", name = "G", descriptor = "I")
	public static int anInt8100;

	@OriginalMember(owner = "client!rw", name = "J", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!rw", name = "B", descriptor = "I")
	public static int anInt8096 = 0;

	@OriginalMember(owner = "client!rw", name = "X", descriptor = "I")
	public static int anInt8109 = 0;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZLjava/lang/String;ZI)V")
	public static void method6443(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (Static101.aClass45_4 == Static338.aClass45_6 && Static113.anInt1927 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		if (arg1.equals("nativememerror")) {
			throw new OutOfMemoryError("native(MPR");
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static32.aBoolean33 = true;
				Static257.method5660("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static32.aBoolean33 = false;
				Static257.method5660("fps debug disabled");
				return;
			}
			if (arg1.equals("systemmem")) {
				try {
					Static257.method5660("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(79) Throwable local79) {
					return;
				}
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static446.anInt7893 = 0;
				Static112.anInt1887 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static500.aClass349_15.method7897();
				Static257.method5660("Text coords cleared");
				return;
			}
			@Pc(108) int local108;
			@Pc(129) int local129;
			@Pc(119) Runtime local119;
			if (arg1.equalsIgnoreCase("gc")) {
				Static436.method6187();
				for (local108 = 0; local108 < 10; local108++) {
					System.gc();
				}
				local119 = Runtime.getRuntime();
				local129 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static257.method5660("mem=" + local129 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static436.method6187();
				for (local108 = 0; local108 < 10; local108++) {
					System.gc();
				}
				local119 = Runtime.getRuntime();
				local129 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static257.method5660("Memory before cleanup=" + local129 + "k");
				Static456.method6373();
				Static436.method6187();
				for (@Pc(184) int local184 = 0; local184 < 10; local184++) {
					System.gc();
				}
				local129 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static257.method5660("Memory after cleanup=" + local129 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("unloadnatives")) {
				Static257.method5660(Static328.method5050() ? "Libraries unloaded" : "Library unloading failed!");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static257.method5660("Number of player models in cache:" + Static149.method4031());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static257.method5660("Dropped client connection");
				if (Static375.anInt9162 == 10) {
					Static164.method2621();
				} else if (Static375.anInt9162 == 11) {
					Static476.aBoolean540 = true;
					return;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
				Static65.aClass297_1.method6804();
				Static257.method5660("Rotated connection methods");
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static469.aClass180_3.method4355();
				Static257.method5660("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static469.aClass180_3.method4346();
				Static257.method5660("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static174.aClass313_24.method6984();
				Static354.aClass1_1.method47();
				Static469.aClass180_3.method4357();
				Static257.method5660("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static272.method4086();
				Static299.method4522();
				Static257.method5660("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static192.method3260(1, false, -1, -1);
				if (Static278.method4179() != 1) {
					Static257.method5660("wm1 failed");
					return;
				}
				Static257.method5660("wm1 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static192.method3260(2, false, -1, -1);
				if (Static278.method4179() == 2) {
					Static257.method5660("wm2 succeeded");
					return;
				}
				Static257.method5660("wm2 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static192.method3260(3, false, 768, 1024);
				if (Static278.method4179() != 3) {
					Static257.method5660("wm3 failed");
					return;
				}
				Static257.method5660("wm3 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static584.method7942(0);
				if (Static79.anInt2700 == 0) {
					Static257.method5660("Entered tk0");
					Static58.aClass6_Sub17_Sub1_1.anInt9281 = 0;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				Static257.method5660("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static584.method7942(1);
				if (Static79.anInt2700 == 1) {
					Static257.method5660("Entered tk1");
					Static58.aClass6_Sub17_Sub1_1.anInt9281 = 1;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				Static257.method5660("Failed to enter tk1");
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static584.method7942(2);
				if (Static79.anInt2700 == 2) {
					Static257.method5660("Entered tk2");
					Static58.aClass6_Sub17_Sub1_1.anInt9281 = 2;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				Static257.method5660("Failed to enter tk2");
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static584.method7942(3);
				if (Static79.anInt2700 == 3) {
					Static257.method5660("Entered tk3");
					Static58.aClass6_Sub17_Sub1_1.anInt9281 = 3;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				Static257.method5660("Failed to enter tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("tk4")) {
				Static584.method7942(4);
				if (Static79.anInt2700 != 4) {
					Static257.method5660("Failed to enter tk4");
					return;
				}
				Static257.method5660("Entered tk4");
				Static58.aClass6_Sub17_Sub1_1.anInt9281 = 4;
				Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
				Static252.aBoolean341 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk5")) {
				Static584.method7942(5);
				if (Static79.anInt2700 != 5) {
					Static257.method5660("Failed to enter tk5");
					return;
				}
				Static257.method5660("Entered tk5");
				Static58.aClass6_Sub17_Sub1_1.anInt9281 = 5;
				Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
				Static252.aBoolean341 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static58.aClass6_Sub17_Sub1_1.aBoolean606 = !Static58.aClass6_Sub17_Sub1_1.aBoolean606;
				Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
				Static252.aBoolean341 = false;
				Static272.method4086();
				Static257.method5660("ot=" + Static58.aClass6_Sub17_Sub1_1.aBoolean606);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static58.aClass6_Sub17_Sub1_1.aBoolean599 = !Static58.aClass6_Sub17_Sub1_1.aBoolean599;
				Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
				Static252.aBoolean341 = false;
				Static272.method4086();
				Static257.method5660("gb=" + Static58.aClass6_Sub17_Sub1_1.aBoolean599);
				return;
			}
			@Pc(661) int local661;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static257.method5660("Invalid shadows value");
					return;
				}
				@Pc(651) String local651 = arg1.substring(8);
				local661 = Static166.method3816(local651) ? Static443.method6265(local651) : -1;
				if (local661 >= 0 && local661 <= 2) {
					Static58.aClass6_Sub17_Sub1_1.method7349(Static79.anInt2700, local661);
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					Static272.method4086();
					Static257.method5660("shadows=" + local661);
					return;
				}
				Static257.method5660("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static58.aClass6_Sub17_Sub1_1.aBoolean605 = !Static58.aClass6_Sub17_Sub1_1.aBoolean605;
				Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
				Static252.aBoolean341 = false;
				Static28.method407();
				Static272.method4086();
				Static257.method5660("textures=" + Static58.aClass6_Sub17_Sub1_1.aBoolean605);
				return;
			}
			if (arg1.startsWith("lighting")) {
				Static58.aClass6_Sub17_Sub1_1.method7347(Static79.anInt2700, !Static58.aClass6_Sub17_Sub1_1.method7351(Static79.anInt2700));
				Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
				Static252.aBoolean341 = false;
				Static323.method4986();
				Static28.method407();
				Static272.method4086();
				Static257.method5660("lighting=" + Static58.aClass6_Sub17_Sub1_1.method7351(Static79.anInt2700));
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static257.method5660("Invalid buildarea value");
					return;
				}
				local108 = Static443.method6265(arg1.substring(6));
				if (local108 >= 0 && local108 <= Static371.method6427(Static355.anInt6598)) {
					Static58.aClass6_Sub17_Sub1_1.anInt9291 = local108;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					Static257.method5660("maxbuildarea=" + Static58.aClass6_Sub17_Sub1_1.anInt9291);
					return;
				}
				Static257.method5660("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static257.method5660("Invalid particles value");
					return;
				}
				Static282.method4301(Static443.method6265(arg1.substring(13)));
				Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
				Static252.aBoolean341 = false;
				Static257.method5660("particles=" + Static58.method836());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static257.method5660("Invalid rect_debug value");
					return;
				}
				Static365.anInt6688 = Static443.method6265(arg1.substring(10).trim());
				Static257.method5660("rect_debug=" + Static365.anInt6688);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static37.aBoolean48 = true;
				Static257.method5660("qa_op_test=" + Static37.aBoolean48);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static543.aBoolean621 = !Static543.aBoolean621;
				Static257.method5660("clipcomponents=" + Static543.aBoolean621);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(934) boolean local934 = Static554.aClass90_12.method7496();
				if (!Static287.method4362(!local934)) {
					Static257.method5660("Failed to enable bloom");
					return;
				}
				if (local934) {
					Static257.method5660("Bloom disabled");
					return;
				}
				Static257.method5660("Bloom enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (!Static38.aBoolean50) {
					Static38.aBoolean50 = true;
					Static257.method5660("Forced tweening ENABLED!");
					return;
				}
				Static38.aBoolean50 = false;
				Static257.method5660("Forced tweening disabled.");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (!Static9.aBoolean9) {
					Static257.method5660("Shift-click ENABLED!");
					Static9.aBoolean9 = true;
					return;
				}
				Static257.method5660("Shift-click disabled.");
				Static9.aBoolean9 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static257.method5660("x:" + (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 >> 9) + " z:" + (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 >> 9));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static257.method5660("Height: " + Static205.aClass46Array1[Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98].JA(Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 >> 7, Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static114.aClass248_20.method5785();
				Static114.aClass248_20.method5775();
				Static242.aClass274_3.method6287();
				Static358.aClass320_3.method7208();
				Static299.method4522();
				Static257.method5660("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (!Static554.aClass90_12.method7513()) {
					Static257.method5660("Current toolkit doesn't support multiple cores");
					return;
				}
				local108 = Integer.parseInt(arg1.substring(3));
				if (local108 < 1) {
					local108 = 1;
				} else if (local108 > 4) {
					local108 = 4;
				}
				Static202.anInt3848 = local108;
				Static554.aClass90_12.method7478(Static202.anInt3848);
				Static554.aClass90_12.method7491(0);
				Static257.method5660("Render cores now: " + Static202.anInt3848);
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static257.method5660("I(s): " + Static14.aClass330_51.method7679() + "/" + Static14.aClass330_51.method7674());
				Static257.method5660("I(m): " + Static407.aClass330_49.method7679() + "/" + Static407.aClass330_49.method7674());
				Static257.method5660("O(s): " + Static119.aClass244_4.aClass67_1.method1379() + "/" + Static119.aClass244_4.aClass67_1.method1384());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static257.method5660("Pos: " + Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 + "," + (Static150.anInt2792 + (Static378.anInt6923 >> 9) >> 6) + "," + ((Static208.anInt3949 >> 9) + Static154.anInt2878 >> 6) + "," + ((Static378.anInt6923 >> 9) + Static150.anInt2792 & 0x3F) + "," + (Static154.anInt2878 + (Static208.anInt3949 >> 9) & 0x3F) + " Height: " + (Static37.method631(Static208.anInt3949, Static378.anInt6923, Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98) - Static12.anInt183));
				Static257.method5660("Look: " + Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 + "," + (Static150.anInt2792 + Static48.anInt8831 >> 6) + "," + (Static154.anInt2878 + Static342.anInt6506 >> 6) + "," + (Static48.anInt8831 + Static150.anInt2792 & 0x3F) + "," + (Static154.anInt2878 + Static342.anInt6506 & 0x3F) + " Height: " + (Static37.method631(Static342.anInt6506, Static48.anInt8831, Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98) - Static531.anInt9137));
				return;
			}
			if (arg1.equals("showocc")) {
				Static406.aBoolean497 = !Static406.aBoolean497;
				Static272.method4086();
				Static257.method5660("showocc=" + Static406.aBoolean497);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static191.aBoolean296 = !Static191.aBoolean296;
				Static272.method4086();
				Static257.method5660("forcewallocc=" + Static191.aBoolean296);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static542.aBoolean620 = !Static542.aBoolean620;
				Static554.aClass90_12.method7489(Static542.aBoolean620);
				Static437.method6194();
				Static257.method5660("showprofiling=" + Static542.aBoolean620);
				return;
			}
			if (arg1.startsWith("performancetest")) {
				local108 = -1;
				local661 = 1000;
				if (arg1.length() > 15) {
					@Pc(1387) String[] local1387 = Static395.method5728(arg1, ' ');
					try {
						if (local1387.length > 1) {
							local661 = Integer.parseInt(local1387[1]);
						}
					} catch (@Pc(1400) Throwable local1400) {
					}
					try {
						if (local1387.length > 2) {
							local108 = Integer.parseInt(local1387[2]);
						}
					} catch (@Pc(1411) Throwable local1411) {
					}
				}
				if (local108 == -1) {
					Static257.method5660("Java toolkit: " + Static500.method6914(local661, 0));
					Static257.method5660("SSE toolkit:  " + Static500.method6914(local661, 2));
					Static257.method5660("D3D toolkit:  " + Static500.method6914(local661, 3));
					Static257.method5660("GL toolkit:   " + Static500.method6914(local661, 1));
					Static257.method5660("GLX toolkit:  " + Static500.method6914(local661, 5));
					return;
				}
				Static257.method5660("Performance: " + Static500.method6914(local661, Static79.anInt2700));
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(1502) Class102 local1502 = Static554.aClass90_12.method7450();
				Static257.method5660("Vendor: " + local1502.anInt2764);
				Static257.method5660("Name: " + local1502.aString23);
				Static257.method5660("Version: " + local1502.anInt2766);
				Static257.method5660("Device: " + local1502.aString24);
				Static257.method5660("Driver Version: " + local1502.aLong49);
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static228.aBoolean315 = !Static228.aBoolean315;
				Static257.method5660("nonpcs=" + Static228.aBoolean315);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static262.method3998();
				Static257.method5660("auto world selected");
				return;
			}
			if (arg1.startsWith("switchworld")) {
				local108 = Integer.parseInt(arg1.substring(12));
				Static550.method7685(local108, Static246.method7301(local108).aString56);
				Static257.method5660("switched");
				return;
			}
			if (arg1.equals("getworld")) {
				Static257.method5660("w: " + Static65.aClass297_1.anInt8579);
				return;
			}
			if (arg1.startsWith("pc")) {
				Static534.method7063(Static35.aClass316_12);
				Static340.aClass6_Sub12_Sub2_1.method6047(0);
				local108 = Static340.aClass6_Sub12_Sub2_1.anInt7556;
				local661 = arg1.indexOf(" ", 4);
				Static340.aClass6_Sub12_Sub2_1.method6009(arg1.substring(3, local661));
				Static107.method1668(arg1.substring(local661), Static340.aClass6_Sub12_Sub2_1);
				Static340.aClass6_Sub12_Sub2_1.method6056(Static340.aClass6_Sub12_Sub2_1.anInt7556 - local108);
				return;
			}
			if (arg1.equals("heap")) {
				Static257.method5660("Heap: " + Static355.anInt6598 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static112.method1708();
				Static257.method5660("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local108 = 0; local108 < Static2.anIntArray4.length; local108++) {
					if (Static224.aBooleanArray14[local108]) {
						Static2.anIntArray4[local108] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static2.anIntArray4[local108] *= -1;
						}
					}
				}
				Static112.method1708();
				Static257.method5660("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static446.aBoolean517 = true;
				Static299.method4522();
				Static257.method5660("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static446.aBoolean517 = false;
				Static299.method4522();
				Static257.method5660("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static113.method1759();
				Static257.method5660("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static257.method5660(Static31.method504() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local108 = Integer.parseInt(arg1.substring(9));
				if (local108 >= 0 && local108 <= 4) {
					Static58.aClass6_Sub17_Sub1_1.anInt9271 = local108;
				}
				Static257.method5660("cpuusage=" + Static58.aClass6_Sub17_Sub1_1.anInt9271);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local108 = Integer.parseInt(arg1.substring(17));
				Static257.method5660("varpbit=" + Static65.aClass51_1.method958(local108));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local108 = Integer.parseInt(arg1.substring(14));
				Static257.method5660("varp=" + Static65.aClass51_1.method957(local108));
				return;
			}
			if (arg1.startsWith("demologin")) {
				Static77.method1111(0, false);
				return;
			}
			if (arg1.startsWith("newdemologin")) {
				Static77.method1111(0, true);
				return;
			}
			if (arg1.startsWith("directlogin")) {
				@Pc(1896) String[] local1896 = Static395.method5728(arg1.substring(12), ' ');
				if (local1896.length >= 2) {
					local661 = local1896.length > 2 ? Integer.parseInt(local1896[2]) : 0;
					Static478.method6623(local661, local1896[1], local1896[0]);
					return;
				}
			}
			if (arg1.startsWith("csprofileclear")) {
				Static199.method3323();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static199.method3326();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static199.method3326();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local108 = Integer.parseInt(arg1.substring(8));
				Static554.aClass90_12.method7510(local108);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static257.method5660("Active streams: " + Static204.aClass6_Sub15_Sub1_1.method2418());
				return;
			}
			if (arg1.equals("autosetup")) {
				Static58.aClass6_Sub17_Sub1_1.method7356();
				Static257.method5660("Complete. Toolkit now: " + Static79.anInt2700);
				return;
			}
			if (arg1.equals("errormessage")) {
				Static257.method5660(Static536.aClient1.method1018());
				return;
			}
			if (Static375.anInt9162 == 10) {
				Static534.method7063(Static488.aClass316_121);
				Static340.aClass6_Sub12_Sub2_1.method6047(arg1.length() + 3);
				Static340.aClass6_Sub12_Sub2_1.method6047(arg2 ? 1 : 0);
				Static340.aClass6_Sub12_Sub2_1.method6047(arg0 ? 1 : 0);
				Static340.aClass6_Sub12_Sub2_1.method6009(arg1);
			}
			if (arg1.startsWith("fps ") && Static338.aClass45_6 != Static101.aClass45_4) {
				Static502.method6953(Static443.method6265(arg1.substring(4)));
				return;
			}
			if (Static375.anInt9162 != 10) {
				Static257.method5660("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(2069) Exception local2069) {
			Static257.method5660("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!qda;")
	public static Class262 method6445(@OriginalArg(0) Component arg0) {
		return new Class262_Sub1(arg0);
	}
}
