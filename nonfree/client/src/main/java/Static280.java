import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method4822(@OriginalArg(1) String arg0) {
		return Static239.method4253(arg0, 10);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method4824(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static123.anInt2380 == 0 && Static180.anInt3759 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static118.aBoolean403 = true;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static118.aBoolean403 = false;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static107.anInt2184 = 0;
				Static214.anInt4240 = 0;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static350.aClass175_8.method4667();
			}
			@Pc(62) int local62;
			@Pc(73) Runtime local73;
			@Pc(83) int local83;
			if (arg1.equalsIgnoreCase("gc")) {
				Static127.method2420();
				for (local62 = 0; local62 < 10; local62++) {
					System.gc();
				}
				local73 = Runtime.getRuntime();
				local83 = (int) ((local73.totalMemory() - local73.freeMemory()) / 1024L);
				Static276.method4789("mem=" + local83 + "k");
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static127.method2420();
				for (local62 = 0; local62 < 10; local62++) {
					System.gc();
				}
				local73 = Runtime.getRuntime();
				local83 = (int) ((local73.totalMemory() - local73.freeMemory()) / 1024L);
				Static276.method4789("Memory before cleanup=" + local83 + "k");
				Static125.method2403();
				Static127.method2420();
				for (@Pc(138) int local138 = 0; local138 < 10; local138++) {
					System.gc();
				}
				local83 = (int) ((local73.totalMemory() - local73.freeMemory()) / 1024L);
				Static276.method4789("Memory after cleanup=" + local83 + "k");
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static276.method4789("Number of player models in cache:" + Static61.method1283());
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static306.method5162();
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static253.aClass205_3.method5345();
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static253.aClass205_3.method5348();
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static180.aClass110_6.method3375();
				Static153.aClass158_2.method4336();
				Static253.aClass205_3.method5339();
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static326.method5479();
				Static227.method4127();
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static294.method5056(-1, false, 1, -1);
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static294.method5056(-1, false, 2, -1);
			}
			if (arg1.equalsIgnoreCase("::wm3")) {
				Static294.method5056(1024, false, 3, 768);
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static263.method4608(0);
				Static335.anInt6377 = 0;
				Static114.method2086(Static180.aClass110_6);
				Static7.aBoolean21 = false;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static263.method4608(1);
				Static335.anInt6377 = 1;
				Static114.method2086(Static180.aClass110_6);
				Static7.aBoolean21 = false;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static263.method4608(2);
				Static335.anInt6377 = 2;
				Static114.method2086(Static180.aClass110_6);
				Static7.aBoolean21 = false;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static263.method4608(3);
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static127.aBoolean226 = !Static127.aBoolean226;
				Static114.method2086(Static180.aClass110_6);
				Static7.aBoolean21 = false;
				Static326.method5479();
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static71.aBoolean129 = !Static71.aBoolean129;
				Static114.method2086(Static180.aClass110_6);
				Static7.aBoolean21 = false;
				Static326.method5479();
			}
			if (arg1.startsWith("shadows ")) {
				Static158.anInt3147 = method4822(arg1.substring(8));
				Static114.method2086(Static180.aClass110_6);
				Static7.aBoolean21 = false;
				Static326.method5479();
			}
			if (arg1.startsWith("setba")) {
				Static75.anInt1518 = method4822(arg1.substring(6));
				Static114.method2086(Static180.aClass110_6);
				Static7.aBoolean21 = false;
			}
			if (arg1.startsWith("setparticles")) {
				Static135.method2613(method4822(arg1.substring(13)));
				Static114.method2086(Static180.aClass110_6);
				Static7.aBoolean21 = false;
			}
			if (arg1.startsWith("fps ") && Static123.anInt2380 != 0) {
				Static220.method3996(method4822(arg1.substring(4)));
			}
			if (arg1.startsWith("rect_debug")) {
				Static142.anInt3156 = method4822(arg1.substring(10).trim());
				Static276.method4789("rect_debug=" + Static142.anInt3156);
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static25.aBoolean62 = true;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static201.aBoolean345 = !Static201.aBoolean345;
				Static276.method4789("clipcomponents=" + Static201.aBoolean345);
			}
			if (arg1.startsWith("bloom")) {
				@Pc(457) boolean local457 = Static34.aClass2_6.method3295();
				if (!Static155.method2949(!local457)) {
					Static276.method4789("Failed to enable bloom");
				} else if (local457) {
					Static276.method4789("Bloom disabled");
				} else {
					Static276.method4789("Bloom enabled");
				}
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static334.aBoolean559) {
					Static334.aBoolean559 = false;
					Static276.method4789("Forced tweening disabled.");
				} else {
					Static334.aBoolean559 = true;
					Static276.method4789("Forced tweening ENABLED!");
				}
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static93.aBoolean161) {
					Static276.method4789("Shift-click disabled.");
					Static93.aBoolean161 = false;
				} else {
					Static276.method4789("Shift-click ENABLED!");
					Static93.aBoolean161 = true;
				}
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static276.method4789("x:" + (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 >> 7) + " z:" + (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 >> 7));
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static276.method4789("Height: " + Static7.aClass41Array1[Static285.anInt5511].method5434(Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 >> 7, Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 >> 7));
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static297.aClass165_88.method4498();
				Static297.aClass165_88.method4495();
				Static344.method5506();
				Static227.method4127();
			}
			if (arg1.startsWith("mc")) {
				if (Static34.aClass2_6.method3293()) {
					local62 = Integer.parseInt(arg1.substring(3));
					if (local62 < 1) {
						local62 = 1;
					} else if (local62 > 4) {
						local62 = 4;
					}
					Static138.anInt2755 = local62;
					Static34.aClass2_6.method3316(Static138.anInt2755);
					Static34.aClass2_6.method3313(0);
					Static276.method4789("Render cores now: " + Static138.anInt2755);
				} else {
					Static276.method4789("Current toolkit doesn't support multiple cores");
				}
			}
			if (arg1.startsWith("cachespace")) {
				Static276.method4789("I(s): " + Static265.aClass140_135.method3814() + "/" + Static265.aClass140_135.method3825());
				Static276.method4789("I(m): " + Static158.aClass140_83.method3814() + "/" + Static158.aClass140_83.method3825());
				Static276.method4789("O(s): " + Static234.aClass33_1.method1161() + "/" + Static234.aClass33_1.method1151());
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static276.method4789("Pos: " + Static285.anInt5511 + "," + ((Static221.anInt4363 >> 7) + Static182.anInt3775 >> 6) + "," + ((Static164.anInt3425 >> 7) + Static161.anInt3315 >> 6) + "," + ((Static221.anInt4363 >> 7) + Static182.anInt3775 & 0x3F) + "," + (Static161.anInt3315 + (Static164.anInt3425 >> 7) & 0x3F) + " Height: " + (Static16.method362(Static221.anInt4363, Static164.anInt3425, Static285.anInt5511) - Static194.anInt3958));
				Static276.method4789("Look: " + Static285.anInt5511 + "," + (Static105.anInt2155 + Static182.anInt3775 >> 6) + "," + (Static132.anInt2569 + Static161.anInt3315 >> 6) + "," + (Static182.anInt3775 + Static105.anInt2155 & 0x3F) + "," + (Static161.anInt3315 + Static132.anInt2569 & 0x3F) + " Height: " + (Static16.method362(Static105.anInt2155, Static132.anInt2569, Static285.anInt5511) - Static8.anInt208));
			}
			if (arg1.equals("showocc")) {
				Static178.aBoolean309 = !Static178.aBoolean309;
				Static326.method5479();
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static89.aBoolean157 = !Static89.aBoolean157;
				Static34.aClass2_6.method3279(Static89.aBoolean157);
				Static85.method1626();
			}
			if (arg1.equals("nonpcs")) {
				Static139.aBoolean248 = !Static139.aBoolean248;
			}
			if (arg1.equals("autoworld")) {
				Static149.method2392();
			}
			if (arg1.equals("heap")) {
				Static276.method4789("Heap: " + Static157.anInt3131 + "MB");
			}
			if (arg1.equals("savevarcs")) {
				Static44.method1007();
			}
			if (arg1.equals("scramblevarcs")) {
				for (local62 = 0; local62 < Static302.anIntArray607.length; local62++) {
					if (Static162.aBooleanArray13[local62]) {
						Static302.anIntArray607[local62] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static302.anIntArray607[local62] *= -1;
						}
					}
				}
				Static44.method1007();
			}
			if (arg1.equals("showcolmap")) {
				Static35.aBoolean79 = true;
				Static227.method4127();
			}
			if (arg1.equals("hidecolmap")) {
				Static35.aBoolean79 = false;
				Static227.method4127();
			}
			if (arg1.equals("resetcache")) {
				Static328.method5502();
			}
			if (arg1.equals("profilecpu")) {
				Static276.method4789(Static315.method5322() + "ms");
			}
			if (Static239.anInt4649 == 30) {
				Static248.aClass1_Sub7_Sub1_2.method728(197);
				Static248.aClass1_Sub7_Sub1_2.method3108(arg1.length() + 2);
				Static248.aClass1_Sub7_Sub1_2.method3108(arg0 ? 1 : 0);
				Static248.aClass1_Sub7_Sub1_2.method3124(arg1);
				return;
			}
		} catch (@Pc(999) Exception local999) {
			Static276.method4789("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIII)V")
	public static void method4825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class177 local8 = Static323.method5412(arg0, arg4);
		if (local8 != null && local8.anObjectArray6 != null) {
			@Pc(17) Class1_Sub19 local17 = new Class1_Sub19();
			local17.aClass177_9 = local8;
			local17.anObjectArray3 = local8.anObjectArray6;
			Static98.method1797(local17);
		}
		Static89.aBoolean156 = true;
		Static181.anInt3761 = arg3;
		Static21.anInt502 = arg1;
		Static177.anInt3670 = arg2;
		Static95.anInt1903 = arg5;
		Static90.anInt1762 = arg0;
		Static99.anInt1953 = arg4;
		Static133.method2517(local8);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!rg;)Ljava/lang/String;")
	public static String method4827(@OriginalArg(1) Class177 arg0) {
		if (Static47.method1096(arg0).method4898() == 0) {
			return null;
		} else if (arg0.aString204 == null || arg0.aString204.trim().length() == 0) {
			return Static25.aBoolean62 ? "Hidden-use" : null;
		} else {
			return arg0.aString204;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!aa;)V")
	public static void method4828(@OriginalArg(1) Class2 arg0) {
		@Pc(7) int local7 = Static13.anInt269;
		@Pc(9) int local9 = Static288.anInt6178;
		@Pc(11) int local11 = Static139.anInt2759;
		@Pc(17) int local17 = Static115.anInt2299;
		arg0.method3277(local9, local17, local7, -10660793, local11);
		arg0.method3277(local9 + 1, 16, local7 + 1, -16777216, -2 + local11);
		arg0.method3269(-16777216, local9 + 18, local11 + -2, local7 + 1, local17 - 19);
		Static302.aClass13_7.method4456(-10660793, local9 + 14, -1, Static205.aString166, local7 + 3);
		@Pc(73) int local73 = Static179.anInt3693;
		@Pc(75) int local75 = Static295.anInt5742;
		@Pc(77) int local77 = 0;
		for (@Pc(82) Class1_Sub41 local82 = (Class1_Sub41) Static175.aClass195_36.method5029(); local82 != null; local82 = (Class1_Sub41) Static175.aClass195_36.method5021()) {
			@Pc(96) int local96 = (Static277.anInt6207 - local77 - 1) * 16 + local9 + 31;
			@Pc(98) short local98 = -1;
			if (local7 < local73 && local7 + local11 > local73 && local96 - 13 < local75 && local96 + 3 > local75) {
				local98 = -256;
			}
			@Pc(124) int[] local124 = null;
			if (Static295.method5059(local82.anInt6339)) {
				local124 = Static241.method4285((int) local82.aLong206).anIntArray228;
			} else if (Static171.method3408(local82.anInt6339)) {
				@Pc(140) Class5_Sub3_Sub3_Sub2 local140 = Static169.aClass5_Sub3_Sub3_Sub2Array2[(int) local82.aLong206];
				if (local140 != null) {
					local124 = local140.aClass122_1.anIntArray452;
				}
			} else if (Static210.method3850(local82.anInt6339)) {
				if (local82.anInt6339 == 1008) {
					local124 = Static126.method2405((int) local82.aLong206).anIntArray695;
				} else {
					local124 = Static126.method2405((int) (local82.aLong206 >>> 32 & 0x7FFFFFFFL)).anIntArray695;
				}
			}
			@Pc(187) String local187 = Static137.method2638(local82);
			if (local124 != null) {
				local187 = local187 + Static195.method3685(local124);
			}
			Static302.aClass13_7.method4451(0, local7 + 3, local187, local98, local96, Static335.aClass90Array16, Static6.anIntArray20);
			local77++;
		}
		Static36.method3156(Static288.anInt6178, Static115.anInt2299, Static13.anInt269, Static139.anInt2759);
	}
}
