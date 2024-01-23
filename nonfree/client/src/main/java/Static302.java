import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "F")
	public static float aFloat60;

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "Lclient!ph;")
	public static Class138 aClass138_86;

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
	public static int anInt5720;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "[I")
	public static int[] anIntArray522;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "Lclient!ph;")
	public static Class138 aClass138_87;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "Z")
	public static boolean aBoolean419 = true;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "Z")
	public static boolean aBoolean420 = false;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "[C")
	public static char[] aCharArray10 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
	public static int anInt5717 = 0;

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
	public static volatile int anInt5719 = -1;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)I")
	public static int method4512(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = arg0 >>> 1;
		@Pc(17) int local17 = local11 | local11 >>> 1;
		@Pc(27) int local27 = local17 | local17 >>> 2;
		@Pc(33) int local33 = local27 | local27 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return ~local45 & arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4513(@OriginalArg(1) String arg0) {
		if (Static95.anInt5251 >= 2) {
			@Pc(19) int local19;
			@Pc(39) int local39;
			@Pc(30) Runtime local30;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static131.method2057();
				for (local19 = 0; local19 < 10; local19++) {
					System.gc();
				}
				local30 = Runtime.getRuntime();
				local39 = (int) ((local30.totalMemory() - local30.freeMemory()) / 1024L);
				Static199.method3219("mem=" + local39 + "k");
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static131.method2057();
				for (local19 = 0; local19 < 10; local19++) {
					System.gc();
				}
				local30 = Runtime.getRuntime();
				local39 = (int) ((local30.totalMemory() - local30.freeMemory()) / 1024L);
				Static199.method3219("Memory before cleanup=" + local39 + "k");
				Static276.method2813();
				Static131.method2057();
				for (@Pc(96) int local96 = 0; local96 < 10; local96++) {
					System.gc();
				}
				local39 = (int) ((local30.totalMemory() - local30.freeMemory()) / 1024L);
				Static199.method3219("Memory after cleanup=" + local39 + "k");
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static199.method3219("Number of player models in cache:" + Static2.method32());
			}
			if (Static291.aBoolean404 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static74.anInt1416);
				System.out.println("oncard_2d:" + Static74.anInt1417);
				System.out.println("oncard_texture:" + Static74.anInt1418);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static274.method4065();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static272.aClass40_2.method860();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static272.aClass40_2.method857();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static117.aClass117_3.method2995();
				Static81.aClass7_2.method111();
				Static272.aClass40_2.method854();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static85.aBoolean122 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static176.method4598(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static13.aBoolean13 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static13.aBoolean13 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static214.method3390(-1, false, -1, 0);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static214.method3390(-1, false, -1, 1);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static214.method3390(-1, false, -1, 2);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static214.method3390(768, false, 1024, 3);
			}
			if (arg0.startsWith("::setba")) {
				Static157.anInt3329 = Static199.method3218(arg0.substring(8));
				Static80.method1224(Static117.aClass117_3);
				Static152.aBoolean228 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static149.method2407(Static199.method3218(arg0.substring(15)));
				Static80.method1224(Static117.aClass117_3);
				Static152.aBoolean228 = false;
			}
			if (arg0.startsWith("::fps ") && Static210.anInt4148 != 0) {
				Static159.method2695(Static199.method3218(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static16.anInt245 = Static199.method3218(arg0.substring(12).trim());
				Static199.method3219("rect_debug=" + Static16.anInt245);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static250.aBoolean231 = true;
			}
			if (arg0.startsWith("::hdr") && Static291.aBoolean404 && !Static54.method932(!Static266.method3963())) {
				Static199.method3219("Failed to enable hdr");
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static110.aBoolean163) {
					Static110.aBoolean163 = false;
					Static199.method3219("Forced tweening disabled.");
				} else {
					Static110.aBoolean163 = true;
					Static199.method3219("Forced tweening ENABLED!");
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static49.aBoolean74) {
					System.out.println("Shift-click disabled.");
					Static49.aBoolean74 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static49.aBoolean74 = true;
				}
			}
			if (arg0.equalsIgnoreCase("::getcgcoord")) {
				Static199.method3219("x:" + (Static229.aClass22_Sub3_Sub2_2.anInt4601 >> 7) + " z:" + (Static229.aClass22_Sub3_Sub2_2.anInt4623 >> 7) + " groundh:" + Static208.anIntArrayArrayArray11[Static295.anInt5586][Static229.aClass22_Sub3_Sub2_2.anInt4601 >> 7][Static229.aClass22_Sub3_Sub2_2.anInt4623 >> 7]);
			}
			if (arg0.equalsIgnoreCase("::getheight")) {
				Static199.method3219("Height: " + Static208.anIntArrayArrayArray11[Static295.anInt5586][Static229.aClass22_Sub3_Sub2_2.anInt4601 >> 7][Static229.aClass22_Sub3_Sub2_2.anInt4623 >> 7]);
			}
		}
		Static137.aClass1_Sub14_Sub1_6.method2661(66);
		Static137.aClass1_Sub14_Sub1_6.method2631(arg0.length() - 1);
		Static137.aClass1_Sub14_Sub1_6.method2619(arg0.substring(2));
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!lg;IIIIIIZ)V")
	public static void method4514(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray260.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray260[local5] - Static16.anInt247;
			local22 = arg0.anIntArray258[local5] - Static273.anInt5205;
			local29 = arg0.anIntArray253[local5] - Static245.anInt2378;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray262 != null) {
				Static155.anIntArray259[local5] = local39;
				Static155.anIntArray254[local5] = local61;
				Static155.anIntArray263[local5] = local71;
			}
			Static155.anIntArray264[local5] = Static18.anInt303 + (local39 << 9) / local71;
			Static155.anIntArray265[local5] = Static18.anInt302 + (local61 << 9) / local71;
		}
		Static18.anInt301 = 0;
		local3 = arg0.anIntArray256.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray256[local5];
			local22 = arg0.anIntArray261[local5];
			local29 = arg0.anIntArray255[local5];
			local39 = Static155.anIntArray264[local15];
			@Pc(148) int local148 = Static155.anIntArray264[local22];
			@Pc(152) int local152 = Static155.anIntArray264[local29];
			@Pc(156) int local156 = Static155.anIntArray265[local15];
			@Pc(160) int local160 = Static155.anIntArray265[local22];
			@Pc(164) int local164 = Static155.anIntArray265[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static303.aBoolean421 && Static106.method1770(Static306.anInt5528 + Static18.anInt303, Static272.anInt5176 + Static18.anInt302, local156, local160, local164, local39, local148, local152)) {
					Static211.anInt4150 = arg5;
					Static127.anInt2547 = arg6;
				}
				if (!Static291.aBoolean404 && !arg7) {
					Static18.aBoolean18 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Static18.anInt305 || local148 > Static18.anInt305 || local152 > Static18.anInt305) {
						Static18.aBoolean18 = true;
					}
					if (arg0.anIntArray262 == null || arg0.anIntArray262[local5] == -1) {
						if (arg0.anIntArray266[local5] != 12345678) {
							Static18.method308(local156, local160, local164, local39, local148, local152, arg0.anIntArray266[local5], arg0.anIntArray257[local5], arg0.anIntArray267[local5]);
						}
					} else if (!Static215.aBoolean288) {
						@Pc(373) int local373 = Static18.anInterface1_1.method1625(arg0.anIntArray262[local5]);
						Static18.method308(local156, local160, local164, local39, local148, local152, Static223.method3509(local373, arg0.anIntArray266[local5]), Static223.method3509(local373, arg0.anIntArray257[local5]), Static223.method3509(local373, arg0.anIntArray267[local5]));
					} else if (arg0.aBoolean232) {
						Static18.method307(local156, local160, local164, local39, local148, local152, arg0.anIntArray266[local5], arg0.anIntArray257[local5], arg0.anIntArray267[local5], Static155.anIntArray259[0], Static155.anIntArray259[1], Static155.anIntArray259[3], Static155.anIntArray254[0], Static155.anIntArray254[1], Static155.anIntArray254[3], Static155.anIntArray263[0], Static155.anIntArray263[1], Static155.anIntArray263[3], arg0.anIntArray262[local5]);
					} else {
						Static18.method307(local156, local160, local164, local39, local148, local152, arg0.anIntArray266[local5], arg0.anIntArray257[local5], arg0.anIntArray267[local5], Static155.anIntArray259[local15], Static155.anIntArray259[local22], Static155.anIntArray259[local29], Static155.anIntArray254[local15], Static155.anIntArray254[local22], Static155.anIntArray254[local29], Static155.anIntArray263[local15], Static155.anIntArray263[local22], Static155.anIntArray263[local29], arg0.anIntArray262[local5]);
					}
				}
			}
		}
	}
}
