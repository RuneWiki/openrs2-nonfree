import jagex3.jagmisc.jagmisc;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!us", name = "J", descriptor = "Lclient!gb;")
	public static Class113 aClass113_2;

	@OriginalMember(owner = "client!us", name = "K", descriptor = "Lclient!ga;")
	public static Class111 aClass111_116;

	@OriginalMember(owner = "client!us", name = "F", descriptor = "I")
	public static int anInt8924 = -2;

	@OriginalMember(owner = "client!us", name = "L", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray12 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!ga;I)Lclient!f;")
	public static Class10 method7365(@OriginalArg(1) Class111 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class10 local18 = (Class10) Static406.aClass326_38.method7238((long) arg1);
		if (local18 == null) {
			if (Static402.aBoolean498) {
				local18 = Static136.aClass12_8.method6434(Static604.method7064(arg0, arg1), true);
			} else {
				local18 = Static503.method6986(arg0.method2449(arg1));
			}
			Static406.aClass326_38.method7236(local18, (long) arg1);
		}
		return local18;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method7366(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		Static326.anInt5840 = arg2;
		Static590.anInt9527 = 2;
		Static296.method4673(false, arg1, arg0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/lang/String;IZZ)V")
	public static void method7368(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Static374.method5444("commands - This command");
				Static374.method5444("cls - Clear console");
				Static374.method5444("displayfps - Toggle FPS and other information");
				Static374.method5444("renderer - Print graphics renderer information");
				Static374.method5444("heap - Print java memory information");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static486.anInt8201 = 0;
				Static78.anInt1871 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				Static115.aBoolean175 = !Static115.aBoolean175;
				if (!Static115.aBoolean175) {
					Static374.method5444("FPS off");
					return;
				}
				Static374.method5444("FPS on");
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(65) Class2 local65 = Static136.aClass12_8.method6419();
				Static374.method5444("Vendor: " + local65.anInt55);
				Static374.method5444("Name: " + local65.aString2);
				Static374.method5444("Version: " + local65.anInt56);
				Static374.method5444("Device: " + local65.aString1);
				Static374.method5444("Driver Version: " + local65.aLong7);
				return;
			}
			if (arg0.equals("heap")) {
				Static374.method5444("Heap: " + Static72.anInt1778 + "MB");
				return;
			}
		} catch (@Pc(139) Exception local139) {
			Static374.method5444(Static103.aClass77_4.method1864(Static562.anInt9127));
			return;
		}
		if (Static122.aClass218_4 != Static253.aClass218_6 || Static276.anInt5092 >= 2) {
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg0.equalsIgnoreCase("printfps")) {
					Static374.method5444("FPS: " + Static259.anInt4764);
					return;
				}
				if (arg0.equalsIgnoreCase("occlude")) {
					Static457.aBoolean566 = !Static457.aBoolean566;
					if (Static457.aBoolean566) {
						Static374.method5444("Occlsion now on!");
						return;
					}
					Static374.method5444("Occlsion now off!");
					return;
				}
				if (arg0.equalsIgnoreCase("fpson")) {
					Static115.aBoolean175 = true;
					Static374.method5444("fps debug enabled");
					return;
				}
				if (arg0.equalsIgnoreCase("fpsoff")) {
					Static115.aBoolean175 = false;
					Static374.method5444("fps debug disabled");
					return;
				}
				if (arg0.equals("systemmem")) {
					try {
						Static374.method5444("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
						return;
					} catch (@Pc(250) Throwable local250) {
						return;
					}
				}
				if (arg0.equalsIgnoreCase("cleartext")) {
					Static456.aClass349_13.method7661();
					Static374.method5444("Text coords cleared");
					return;
				}
				@Pc(291) int local291;
				@Pc(270) int local270;
				@Pc(281) Runtime local281;
				if (arg0.equalsIgnoreCase("gc")) {
					Static152.method2399();
					for (local270 = 0; local270 < 10; local270++) {
						System.gc();
					}
					local281 = Runtime.getRuntime();
					local291 = (int) ((local281.totalMemory() - local281.freeMemory()) / 1024L);
					Static374.method5444("mem=" + local291 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("compact")) {
					Static152.method2399();
					for (local270 = 0; local270 < 10; local270++) {
						System.gc();
					}
					local281 = Runtime.getRuntime();
					local291 = (int) ((local281.totalMemory() - local281.freeMemory()) / 1024L);
					Static374.method5444("Memory before cleanup=" + local291 + "k");
					Static567.method7641();
					Static152.method2399();
					for (@Pc(353) int local353 = 0; local353 < 10; local353++) {
						System.gc();
					}
					local291 = (int) ((local281.totalMemory() - local281.freeMemory()) / 1024L);
					Static374.method5444("Memory after cleanup=" + local291 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("unloadnatives")) {
					Static374.method5444(Static471.method6666() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					Static374.method5444("Dropped client connection");
					if (Static177.anInt2101 == 10) {
						Static509.method7019();
					} else if (Static177.anInt2101 == 11) {
						Static533.aBoolean650 = true;
						return;
					}
					return;
				}
				if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
					Static137.aClass174_1.method4003();
					Static374.method5444("Rotated connection methods");
					return;
				}
				if (arg0.equalsIgnoreCase("clientjs5drop")) {
					aClass113_2.method2488();
					Static374.method5444("Dropped client js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("serverjs5drop")) {
					aClass113_2.method2495();
					Static374.method5444("Dropped server js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("breakcon")) {
					Static246.aClass114_10.method2509();
					Static400.aClass75_3.method1857();
					aClass113_2.method2492();
					Static374.method5444("Breaking new connections for 5 seconds");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuild")) {
					Static499.method6958();
					Static233.method3823();
					Static374.method5444("Rebuilding map");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuildprofile")) {
					Static454.aLong340 = Static255.method4035();
					Static189.aBoolean321 = true;
					Static499.method6958();
					Static233.method3823();
					Static374.method5444("Rebuilding map (with profiling)");
					return;
				}
				if (arg0.equalsIgnoreCase("wm1")) {
					Static68.method1443(1, false, -1, -1);
					if (Static19.method541() != 1) {
						Static374.method5444("wm1 failed");
						return;
					}
					Static374.method5444("wm1 succeeded");
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Static68.method1443(2, false, -1, -1);
					if (Static19.method541() == 2) {
						Static374.method5444("wm2 succeeded");
						return;
					}
					Static374.method5444("wm2 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("wm3")) {
					Static68.method1443(3, false, 768, 1024);
					if (Static19.method541() == 3) {
						Static374.method5444("wm3 succeeded");
						return;
					}
					Static374.method5444("wm3 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Static69.method1449(0);
					if (Static375.anInt6609 != 0) {
						Static374.method5444("Failed to enter tk0");
						return;
					}
					Static374.method5444("Entered tk0");
					Static479.aClass1_Sub7_Sub1_1.anInt3115 = 0;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Static69.method1449(1);
					if (Static375.anInt6609 != 1) {
						Static374.method5444("Failed to enter tk1");
						return;
					}
					Static374.method5444("Entered tk1");
					Static479.aClass1_Sub7_Sub1_1.anInt3115 = 1;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk2")) {
					Static69.method1449(2);
					if (Static375.anInt6609 == 2) {
						Static374.method5444("Entered tk2");
						Static479.aClass1_Sub7_Sub1_1.anInt3115 = 2;
						Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
						Static392.aBoolean493 = false;
						return;
					}
					Static374.method5444("Failed to enter tk2");
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Static69.method1449(3);
					if (Static375.anInt6609 != 3) {
						Static374.method5444("Failed to enter tk3");
						return;
					}
					Static374.method5444("Entered tk3");
					Static479.aClass1_Sub7_Sub1_1.anInt3115 = 3;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Static69.method1449(5);
					if (Static375.anInt6609 == 5) {
						Static374.method5444("Entered tk5");
						Static479.aClass1_Sub7_Sub1_1.anInt3115 = 5;
						Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
						Static392.aBoolean493 = false;
						return;
					}
					Static374.method5444("Failed to enter tk5");
					return;
				}
				if (arg0.equalsIgnoreCase("ot")) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean234 = !Static479.aClass1_Sub7_Sub1_1.aBoolean234;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					Static499.method6958();
					Static374.method5444("ot=" + Static479.aClass1_Sub7_Sub1_1.aBoolean234);
					return;
				}
				if (arg0.equalsIgnoreCase("gb")) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean226 = !Static479.aClass1_Sub7_Sub1_1.aBoolean226;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					Static499.method6958();
					Static374.method5444("gb=" + Static479.aClass1_Sub7_Sub1_1.aBoolean226);
					return;
				}
				@Pc(808) int local808;
				if (arg0.startsWith("shadows")) {
					if (arg0.length() < 8) {
						Static374.method5444("Invalid shadows value");
						return;
					}
					@Pc(798) String local798 = arg0.substring(8);
					local808 = Static88.method1743(local798) ? Static480.method6741(local798) : -1;
					if (local808 >= 0 && local808 <= 2) {
						Static479.aClass1_Sub7_Sub1_1.method2614(local808, Static375.anInt6609);
						Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
						Static392.aBoolean493 = false;
						Static499.method6958();
						Static374.method5444("shadows=" + local808);
						return;
					}
					Static374.method5444("Invalid shadows value");
					return;
				}
				if (arg0.startsWith("textures")) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean223 = !Static479.aClass1_Sub7_Sub1_1.aBoolean223;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					Static89.method1753();
					Static499.method6958();
					Static374.method5444("textures=" + Static479.aClass1_Sub7_Sub1_1.aBoolean223);
					return;
				}
				if (arg0.startsWith("lighting")) {
					Static479.aClass1_Sub7_Sub1_1.method2616(!Static479.aClass1_Sub7_Sub1_1.method2618(Static375.anInt6609), Static375.anInt6609);
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					Static224.method3681();
					Static89.method1753();
					Static499.method6958();
					Static374.method5444("lighting=" + Static479.aClass1_Sub7_Sub1_1.method2618(Static375.anInt6609));
					return;
				}
				if (arg0.startsWith("setba")) {
					if (arg0.length() < 6) {
						Static374.method5444("Invalid buildarea value");
						return;
					}
					local270 = Static480.method6741(arg0.substring(6));
					if (local270 >= 0 && local270 <= Static77.method6749(Static72.anInt1778)) {
						Static479.aClass1_Sub7_Sub1_1.anInt3100 = local270;
						Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
						Static392.aBoolean493 = false;
						Static374.method5444("maxbuildarea=" + Static479.aClass1_Sub7_Sub1_1.anInt3100);
						return;
					}
					Static374.method5444("Invalid buildarea value");
					return;
				}
				if (arg0.startsWith("rect_debug")) {
					if (arg0.length() < 10) {
						Static374.method5444("Invalid rect_debug value");
						return;
					}
					Static401.anInt6896 = Static480.method6741(arg0.substring(10).trim());
					Static374.method5444("rect_debug=" + Static401.anInt6896);
					return;
				}
				if (arg0.equalsIgnoreCase("qa_op_test")) {
					Static484.aBoolean581 = true;
					Static374.method5444("qa_op_test=" + Static484.aBoolean581);
					return;
				}
				if (arg0.equalsIgnoreCase("clipcomponents")) {
					Static362.aBoolean450 = !Static362.aBoolean450;
					Static374.method5444("clipcomponents=" + Static362.aBoolean450);
					return;
				}
				if (arg0.startsWith("bloom")) {
					@Pc(1049) boolean local1049 = Static136.aClass12_8.method6451();
					if (Static412.method5783(!local1049)) {
						if (local1049) {
							Static374.method5444("Bloom disabled");
							return;
						}
						Static374.method5444("Bloom enabled");
						return;
					}
					Static374.method5444("Failed to enable bloom");
					return;
				}
				if (arg0.equalsIgnoreCase("tween")) {
					if (Static153.aBoolean202) {
						Static153.aBoolean202 = false;
						Static374.method5444("Forced tweening disabled.");
						return;
					}
					Static153.aBoolean202 = true;
					Static374.method5444("Forced tweening ENABLED!");
					return;
				}
				if (arg0.equalsIgnoreCase("shiftclick")) {
					if (!Static490.aBoolean598) {
						Static374.method5444("Shift-click ENABLED!");
						Static490.aBoolean598 = true;
						return;
					}
					Static374.method5444("Shift-click disabled.");
					Static490.aBoolean598 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("getcgcoord")) {
					Static374.method5444("x:" + (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796 >> 9) + " z:" + (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("getheight")) {
					Static374.method5444("Height: " + Static20.aClass17Array1[Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116].method6642(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796 >> 9, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("resetminimap")) {
					Static141.aClass111_32.method2461();
					Static141.aClass111_32.method2454();
					Static74.aClass184_1.method4075();
					Static299.aClass46_4.method1402();
					Static233.method3823();
					Static374.method5444("Minimap reset");
					return;
				}
				if (arg0.startsWith("mc")) {
					if (Static136.aClass12_8.method6415()) {
						local270 = Integer.parseInt(arg0.substring(3));
						if (local270 < 1) {
							local270 = 1;
						} else if (local270 > 4) {
							local270 = 4;
						}
						Static408.anInt7003 = local270;
						Static499.method6958();
						Static374.method5444("Render cores now: " + Static408.anInt7003);
						return;
					}
					Static374.method5444("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg0.startsWith("cachespace")) {
					Static374.method5444("I(s): " + Static419.aClass326_41.method7240() + "/" + Static419.aClass326_41.method7243());
					Static374.method5444("I(m): " + Static478.aClass326_48.method7240() + "/" + Static478.aClass326_48.method7243());
					Static374.method5444("O(s): " + Static46.aClass234_1.aClass334_1.method7348() + "/" + Static46.aClass234_1.aClass334_1.method7342());
					return;
				}
				if (arg0.equalsIgnoreCase("getcamerapos")) {
					Static374.method5444("Pos: " + Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 + "," + (Static376.anInt6631 + (Static333.anInt5940 >> 9) >> 6) + "," + ((Static216.anInt4203 >> 9) + Static24.anInt674 >> 6) + "," + ((Static333.anInt5940 >> 9) + Static376.anInt6631 & 0x3F) + "," + (Static24.anInt674 + (Static216.anInt4203 >> 9) & 0x3F) + " Height: " + (Static122.method2103(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116, Static333.anInt5940, Static216.anInt4203) - Static350.anInt6168));
					Static374.method5444("Look: " + Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 + "," + (Static376.anInt6631 + Static274.anInt5078 >> 6) + "," + (Static316.anInt5683 + Static24.anInt674 >> 6) + "," + (Static274.anInt5078 + Static376.anInt6631 & 0x3F) + "," + (Static24.anInt674 + Static316.anInt5683 & 0x3F) + " Height: " + (Static122.method2103(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116, Static274.anInt5078, Static316.anInt5683) - Static68.anInt1583));
					return;
				}
				if (arg0.equals("renderprofile") || arg0.equals("rp")) {
					Static297.aBoolean596 = !Static297.aBoolean596;
					Static136.aClass12_8.method6461(Static297.aBoolean596);
					Static509.method7015();
					Static374.method5444("showprofiling=" + Static297.aBoolean596);
					return;
				}
				if (arg0.startsWith("performancetest")) {
					local270 = -1;
					local808 = 1000;
					if (arg0.length() > 15) {
						@Pc(1449) String[] local1449 = Static46.method1116(' ', arg0);
						try {
							if (local1449.length > 1) {
								local808 = Integer.parseInt(local1449[1]);
							}
						} catch (@Pc(1462) Throwable local1462) {
						}
						try {
							if (local1449.length > 2) {
								local270 = Integer.parseInt(local1449[2]);
							}
						} catch (@Pc(1473) Throwable local1473) {
						}
					}
					if (local270 == -1) {
						Static374.method5444("Java toolkit: " + Static46.method1120(0, local808));
						Static374.method5444("SSE toolkit:  " + Static46.method1120(2, local808));
						Static374.method5444("D3D toolkit:  " + Static46.method1120(3, local808));
						Static374.method5444("GL toolkit:   " + Static46.method1120(1, local808));
						Static374.method5444("GLX toolkit:  " + Static46.method1120(5, local808));
						return;
					}
					Static374.method5444("Performance: " + Static46.method1120(Static375.anInt6609, local808));
					return;
				}
				if (arg0.equals("nonpcs")) {
					Static56.aBoolean106 = !Static56.aBoolean106;
					Static374.method5444("nonpcs=" + Static56.aBoolean106);
					return;
				}
				if (arg0.equals("autoworld")) {
					Static331.method4980();
					Static374.method5444("auto world selected");
					return;
				}
				if (arg0.startsWith("switchworld")) {
					local270 = Integer.parseInt(arg0.substring(12));
					Static473.method6674(Static520.method7105(local270).aString62, local270);
					Static374.method5444("switched");
					return;
				}
				if (arg0.equals("getworld")) {
					Static374.method5444("w: " + Static137.aClass174_1.anInt4666);
					return;
				}
				@Pc(1635) Class1_Sub48 local1635;
				if (arg0.startsWith("pc")) {
					local1635 = Static320.method4867(Static442.aClass170_2, Static538.aClass319_159);
					local1635.aClass1_Sub20_Sub1_2.method4378(0);
					local808 = local1635.aClass1_Sub20_Sub1_2.anInt5238;
					local291 = arg0.indexOf(" ", 4);
					local1635.aClass1_Sub20_Sub1_2.method4399(arg0.substring(3, local291));
					Static506.method7004(arg0.substring(local291), local1635.aClass1_Sub20_Sub1_2);
					local1635.aClass1_Sub20_Sub1_2.method4411(local1635.aClass1_Sub20_Sub1_2.anInt5238 - local808);
					Static34.method813(local1635);
					return;
				}
				if (arg0.equals("savevarcs")) {
					Static561.method5044();
					Static374.method5444("perm varcs saved");
					return;
				}
				if (arg0.equals("scramblevarcs")) {
					for (local270 = 0; local270 < Static475.anIntArray530.length; local270++) {
						if (Static412.aBooleanArray23[local270]) {
							Static475.anIntArray530[local270] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static475.anIntArray530[local270] *= -1;
							}
						}
					}
					Static561.method5044();
					Static374.method5444("perm varcs scrambled");
					return;
				}
				if (arg0.equals("showcolmap")) {
					Static494.aBoolean599 = true;
					Static233.method3823();
					Static374.method5444("colmap is shown");
					return;
				}
				if (arg0.equals("hidecolmap")) {
					Static494.aBoolean599 = false;
					Static233.method3823();
					Static374.method5444("colmap is hidden");
					return;
				}
				if (arg0.equals("resetcache")) {
					Static181.method2770();
					Static374.method5444("Caches reset");
					return;
				}
				if (arg0.equals("profilecpu")) {
					Static374.method5444(Static76.method1621() + "ms");
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local270 = Integer.parseInt(arg0.substring(17));
					Static374.method5444("varpbit=" + Static121.aClass148_1.method3531(local270));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local270 = Integer.parseInt(arg0.substring(14));
					Static374.method5444("varp=" + Static121.aClass148_1.method3530(local270));
					return;
				}
				if (arg0.startsWith("demologin")) {
					Static209.method3526(0, false);
					return;
				}
				if (arg0.startsWith("newdemologin")) {
					Static209.method3526(0, true);
					return;
				}
				if (arg0.startsWith("directlogin")) {
					@Pc(1861) String[] local1861 = Static46.method1116(' ', arg0.substring(12));
					if (local1861.length >= 2) {
						local808 = local1861.length <= 2 ? 0 : Integer.parseInt(local1861[2]);
						method7366(local1861[1], local1861[0], local808);
						return;
					}
				}
				if (arg0.startsWith("csprofileclear")) {
					Static145.method2350();
					return;
				}
				if (arg0.startsWith("csprofileoutputc")) {
					Static145.method2354();
					return;
				}
				if (arg0.startsWith("csprofileoutputt")) {
					Static145.method2354();
					return;
				}
				if (arg0.startsWith("texsize")) {
					local270 = Integer.parseInt(arg0.substring(8));
					Static136.aClass12_8.method6454(local270);
					return;
				}
				if (arg0.equals("soundstreamcount")) {
					Static374.method5444("Active streams: " + Static298.aClass1_Sub8_Sub4_2.method6031());
					return;
				}
				if (arg0.equals("autosetup")) {
					Static479.aClass1_Sub7_Sub1_1.method2635();
					Static374.method5444("Complete. Toolkit now: " + Static375.anInt6609);
					return;
				}
				if (arg0.equals("errormessage")) {
					Static374.method5444(Static550.aClient1.method1539());
					return;
				}
				if (arg0.equals("heapdump")) {
					if (Static162.aString37.startsWith("win")) {
						Static9.method137(new File("C:\\Temp\\heap.dump"));
					} else {
						Static9.method137(new File("/tmp/heap.dump"));
					}
					Static374.method5444("Done");
					return;
				}
				if (arg0.equals("os")) {
					Static374.method5444("Name: " + Static162.aString37);
					Static374.method5444("Arch: " + Static162.aString31);
					Static374.method5444("Ver: " + Static162.aString34);
					return;
				}
				if (arg0.equals("w2debug")) {
					Static18.aBoolean42 = !Static18.aBoolean42;
					Static499.method6958();
					Static374.method5444("Toggled!");
					return;
				}
				if (Static177.anInt2101 == 10) {
					local1635 = Static320.method4867(Static442.aClass170_2, Static17.aClass319_7);
					local1635.aClass1_Sub20_Sub1_2.method4378(arg0.length() + 3);
					local1635.aClass1_Sub20_Sub1_2.method4378(arg1 ? 1 : 0);
					local1635.aClass1_Sub20_Sub1_2.method4378(arg2 ? 1 : 0);
					local1635.aClass1_Sub20_Sub1_2.method4399(arg0);
					Static34.method813(local1635);
				}
				if (arg0.startsWith("fps ") && Static122.aClass218_4 != Static253.aClass218_6) {
					Static71.method1508(Static480.method6741(arg0.substring(4)));
					return;
				}
			} catch (@Pc(2108) Exception local2108) {
				Static374.method5444(Static103.aClass77_4.method1864(Static562.anInt9127));
				return;
			}
		}
		if (Static177.anInt2101 != 10) {
			Static374.method5444(Static103.aClass77_5.method1864(Static562.anInt9127) + arg0);
		}
	}
}
