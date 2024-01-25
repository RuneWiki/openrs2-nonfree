import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "J")
	public static long aLong103 = 0L;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Z")
	public static boolean aBoolean292 = true;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_86 = new Class211(88, -2);

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
	public static int anInt3284 = -1;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method2678(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (Static314.aClass73_5 == Static96.aClass73_2 && Static284.anInt4919 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static260.aBoolean445 = true;
				Static192.method2752("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static260.aBoolean445 = false;
				Static192.method2752("fps debug disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static209.anInt3638 = 0;
				Static215.anInt3688 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static10.aClass208_1.method4657();
				Static192.method2752("Text coords cleared");
				return;
			}
			@Pc(71) int local71;
			@Pc(92) int local92;
			@Pc(82) Runtime local82;
			if (arg1.equalsIgnoreCase("gc")) {
				Static186.method2667();
				for (local71 = 0; local71 < 10; local71++) {
					System.gc();
				}
				local82 = Runtime.getRuntime();
				local92 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static192.method2752("mem=" + local92 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static186.method2667();
				for (local71 = 0; local71 < 10; local71++) {
					System.gc();
				}
				local82 = Runtime.getRuntime();
				local92 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static192.method2752("Memory before cleanup=" + local92 + "k");
				Static161.method2397();
				Static186.method2667();
				for (@Pc(151) int local151 = 0; local151 < 10; local151++) {
					System.gc();
				}
				local92 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static192.method2752("Memory after cleanup=" + local92 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static192.method2752("Number of player models in cache:" + Static278.method4117());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static192.method2752("Dropped client connection");
				if (Static142.anInt2665 == 30) {
					Static48.method744();
				} else if (Static142.anInt2665 == 25) {
					Static103.aBoolean155 = true;
					return;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static73.aClass92_1.method1778();
				Static192.method2752("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static73.aClass92_1.method1784();
				Static192.method2752("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static341.aClass162_5.method3264();
				Static6.aClass130_1.method2674();
				Static73.aClass92_1.method1788();
				Static192.method2752("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static2.method10();
				Static372.method1264();
				Static192.method2752("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static228.method3177(-1, 1, -1, false);
				if (Static254.method3903() == 1) {
					Static192.method2752("wm1 succeeded");
					return;
				}
				Static192.method2752("wm1 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static228.method3177(-1, 2, -1, false);
				if (Static254.method3903() != 2) {
					Static192.method2752("wm2 failed");
					return;
				}
				Static192.method2752("wm2 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static228.method3177(1024, 3, 768, false);
				if (Static254.method3903() == 3) {
					Static192.method2752("wm3 succeeded");
					return;
				}
				Static192.method2752("wm3 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static75.method1176(0);
				if (Static25.anInt394 == 0) {
					Static192.method2752("Entered tk0");
					Static188.aClass135_Sub1_1.anInt3375 = 0;
					Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
					Static247.aBoolean423 = false;
					return;
				}
				Static192.method2752("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static75.method1176(1);
				if (Static25.anInt394 == 1) {
					Static192.method2752("Entered tk1");
					Static188.aClass135_Sub1_1.anInt3375 = 1;
					Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
					Static247.aBoolean423 = false;
					return;
				}
				Static192.method2752("Failed to enter tk1");
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static75.method1176(2);
				if (Static25.anInt394 != 2) {
					Static192.method2752("Failed to enter tk2");
					return;
				}
				Static192.method2752("Entered tk2");
				Static188.aClass135_Sub1_1.anInt3375 = 2;
				Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
				Static247.aBoolean423 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static75.method1176(3);
				if (Static25.anInt394 == 3) {
					Static192.method2752("Entered tk3");
					return;
				}
				Static192.method2752("Failed to enter tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static188.aClass135_Sub1_1.aBoolean320 = !Static188.aClass135_Sub1_1.aBoolean320;
				Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
				Static247.aBoolean423 = false;
				Static2.method10();
				Static192.method2752("ot=" + Static188.aClass135_Sub1_1.aBoolean320);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static188.aClass135_Sub1_1.aBoolean330 = !Static188.aClass135_Sub1_1.aBoolean330;
				Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
				Static247.aBoolean423 = false;
				Static2.method10();
				Static192.method2752("gb=" + Static188.aClass135_Sub1_1.aBoolean330);
				return;
			}
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static192.method2752("Invalid shadows value");
					return;
				}
				@Pc(518) String local518 = arg1.substring(8);
				@Pc(528) int local528 = Static156.method2347(local518) ? Static147.method2202(local518) : -1;
				if (local528 >= 0 && local528 <= 2) {
					Static188.aClass135_Sub1_1.anInt3384 = local528;
					Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
					Static247.aBoolean423 = false;
					Static2.method10();
					Static192.method2752("shadows=" + local528);
					return;
				}
				Static192.method2752("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static192.method2752("Invalid buildarea value");
					return;
				}
				local71 = Static147.method2202(arg1.substring(6));
				if (local71 >= 0 && Static43.method680(Static294.anInt5063) >= local71) {
					Static188.aClass135_Sub1_1.anInt3383 = local71;
					Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
					Static247.aBoolean423 = false;
					Static192.method2752("maxbuildarea=" + Static188.aClass135_Sub1_1.anInt3383);
					return;
				}
				Static192.method2752("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static192.method2752("Invalid particles value");
					return;
				}
				Static310.method4626(Static147.method2202(arg1.substring(13)));
				Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
				Static247.aBoolean423 = false;
				Static192.method2752("particles=" + Static176.method2585());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static192.method2752("Invalid rect_debug value");
					return;
				}
				Static394.anInt6421 = Static147.method2202(arg1.substring(10).trim());
				Static192.method2752("rect_debug=" + Static394.anInt6421);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static274.aBoolean463 = true;
				Static192.method2752("qa_op_test=" + Static274.aBoolean463);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static359.aBoolean584 = !Static359.aBoolean584;
				Static192.method2752("clipcomponents=" + Static359.aBoolean584);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(722) boolean local722 = Static66.aClass164_2.method5317();
				if (Static233.method3208(!local722)) {
					if (!local722) {
						Static192.method2752("Bloom enabled");
						return;
					}
					Static192.method2752("Bloom disabled");
					return;
				}
				Static192.method2752("Failed to enable bloom");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (!Static261.aBoolean446) {
					Static261.aBoolean446 = true;
					Static192.method2752("Forced tweening ENABLED!");
					return;
				}
				Static261.aBoolean446 = false;
				Static192.method2752("Forced tweening disabled.");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (!Static327.aBoolean516) {
					Static192.method2752("Shift-click ENABLED!");
					Static327.aBoolean516 = true;
					return;
				}
				Static192.method2752("Shift-click disabled.");
				Static327.aBoolean516 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static192.method2752("x:" + (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 >> 7) + " z:" + (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static192.method2752("Height: " + Static229.aClass42Array3[Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70].method3060(Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 >> 7, Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static145.aClass230_41.method4984();
				Static145.aClass230_41.method4968();
				Static309.aClass184_3.method4220();
				Static16.aClass249_1.method5525();
				Static372.method1264();
				Static192.method2752("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (!Static66.aClass164_2.method5389()) {
					Static192.method2752("Current toolkit doesn't support multiple cores");
					return;
				}
				local71 = Integer.parseInt(arg1.substring(3));
				if (local71 < 1) {
					local71 = 1;
				} else if (local71 > 4) {
					local71 = 4;
				}
				Static37.anInt719 = local71;
				Static66.aClass164_2.method5366(Static37.anInt719);
				Static66.aClass164_2.method5377(0);
				Static192.method2752("Render cores now: " + Static37.anInt719);
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static192.method2752("I(s): " + Static258.aClass227_33.method4860() + "/" + Static258.aClass227_33.method4856());
				Static192.method2752("I(m): " + Static374.aClass227_47.method4860() + "/" + Static374.aClass227_47.method4856());
				Static192.method2752("O(s): " + Static263.aClass102_2.aClass64_1.method1207() + "/" + Static263.aClass102_2.aClass64_1.method1197());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static192.method2752("Pos: " + Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 + "," + (Static256.anInt4410 + (Static256.anInt4409 >> 7) >> 6) + "," + ((Static133.anInt2471 >> 7) + Static293.anInt5053 >> 6) + "," + ((Static256.anInt4409 >> 7) + Static256.anInt4410 & 0x3F) + "," + ((Static133.anInt2471 >> 7) + Static293.anInt5053 & 0x3F) + " Height: " + (Static236.method3260(Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70, Static133.anInt2471, Static256.anInt4409) - Static337.anInt5598));
				Static192.method2752("Look: " + Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 + "," + (Static391.anInt6384 + Static256.anInt4410 >> 6) + "," + (Static293.anInt5053 + Static226.anInt3832 >> 6) + "," + (Static391.anInt6384 + Static256.anInt4410 & 0x3F) + "," + (Static226.anInt3832 + Static293.anInt5053 & 0x3F) + " Height: " + (Static236.method3260(Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70, Static226.anInt3832, Static391.anInt6384) - Static18.anInt3503));
				return;
			}
			if (arg1.equals("showocc")) {
				Static306.aBoolean491 = !Static306.aBoolean491;
				Static2.method10();
				Static192.method2752("showocc=" + Static306.aBoolean491);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static186.aBoolean290 = !Static186.aBoolean290;
				Static2.method10();
				Static192.method2752("forcewallocc=" + Static186.aBoolean290);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static229.aBoolean379 = !Static229.aBoolean379;
				Static66.aClass164_2.method5326(Static229.aBoolean379);
				Static53.method871();
				Static192.method2752("showprofiling=" + Static229.aBoolean379);
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static280.aBoolean471 = !Static280.aBoolean471;
				Static192.method2752("nonpcs=" + Static280.aBoolean471);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static62.method1009();
				Static192.method2752("auto world selected");
				return;
			}
			if (arg1.equals("heap")) {
				Static192.method2752("Heap: " + Static294.anInt5063 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static251.method3883();
				Static192.method2752("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local71 = 0; local71 < Static158.anIntArray322.length; local71++) {
					if (Static105.aBooleanArray10[local71]) {
						Static158.anIntArray322[local71] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static158.anIntArray322[local71] *= -1;
						}
					}
				}
				Static251.method3883();
				Static192.method2752("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static297.aBoolean482 = true;
				Static372.method1264();
				Static192.method2752("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static297.aBoolean482 = false;
				Static372.method1264();
				Static192.method2752("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static81.method1214();
				Static192.method2752("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static192.method2752(Static130.method1906() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local71 = Integer.parseInt(arg1.substring(9));
				if (local71 >= 0 && local71 <= 4) {
					Static188.aClass135_Sub1_1.anInt3385 = local71;
				}
				Static192.method2752("cpuusage=" + Static188.aClass135_Sub1_1.anInt3385);
				return;
			}
			if (Static142.anInt2665 == 30) {
				Static177.method1119(Static46.aClass48_29);
				Static209.aClass1_Sub33_Sub2_2.method5165(arg1.length() + 2);
				Static209.aClass1_Sub33_Sub2_2.method5165(arg0 ? 1 : 0);
				Static209.aClass1_Sub33_Sub2_2.method5143(arg1);
			}
			if (arg1.startsWith("fps ") && Static314.aClass73_5 != Static96.aClass73_2) {
				Static82.method1218(Static147.method2202(arg1.substring(4)));
				return;
			}
			if (Static142.anInt2665 != 30) {
				Static192.method2752("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(1395) Exception local1395) {
			Static192.method2752("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
	public static void method2679() {
		if (Static344.anInt5589 <= 0) {
			Static110.aString69 = "";
			return;
		}
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static231.aStringArray79.length; local15++) {
			if (Static231.aStringArray79[local15].startsWith("--> ")) {
				local13++;
				if (local13 == Static344.anInt5589) {
					Static110.aString69 = Static231.aStringArray79[local15].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
	public static void method2680(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub6_Sub11 local13 = Static295.method4455(arg0, 7);
		local13.method2998();
	}
}
