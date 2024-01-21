import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Z")
	public static boolean aBoolean131;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1781 = Static118.method2249("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1782 = Static118.method2249(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "Z")
	public static boolean aBoolean132 = false;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
	public static int anInt3157 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!qe;IIIIII)V")
	public static void method2419(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = Static56.anInt1519;
		@Pc(3) int local3 = Static56.anInt1525;
		@Pc(7) int local7 = arg0.anIntArray418.length;
		@Pc(17) int local17;
		@Pc(24) int local24;
		@Pc(31) int local31;
		@Pc(41) int local41;
		for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
			local17 = arg0.anIntArray418[local9] - Static1.anInt4460;
			local24 = arg0.anIntArray409[local9] - Static100.anInt2513;
			local31 = arg0.anIntArray417[local9] - Static66.anInt1691;
			local41 = local31 * arg3 + local17 * arg4 >> 16;
			@Pc(51) int local51 = local31 * arg4 - local17 * arg3 >> 16;
			@Pc(63) int local63 = local24 * arg2 - local51 * arg1 >> 16;
			@Pc(73) int local73 = local24 * arg1 + local51 * arg2 >> 16;
			if (local73 < 50) {
				return;
			}
			if (arg0.anIntArray413 != null) {
				Static152.anIntArray416[local9] = local41;
				Static152.anIntArray411[local9] = local63;
				Static152.anIntArray419[local9] = local73;
			}
			Static152.anIntArray408[local9] = local1 + (local41 << 9) / local73;
			Static152.anIntArray407[local9] = local3 + (local63 << 9) / local73;
		}
		Static56.anInt1522 = 0;
		local7 = arg0.anIntArray410.length;
		for (local17 = 0; local17 < local7; local17++) {
			local24 = arg0.anIntArray410[local17];
			local31 = arg0.anIntArray412[local17];
			local41 = arg0.anIntArray415[local17];
			@Pc(146) int local146 = Static152.anIntArray408[local24];
			@Pc(150) int local150 = Static152.anIntArray408[local31];
			@Pc(154) int local154 = Static152.anIntArray408[local41];
			@Pc(158) int local158 = Static152.anIntArray407[local24];
			@Pc(162) int local162 = Static152.anIntArray407[local31];
			@Pc(166) int local166 = Static152.anIntArray407[local41];
			if ((local146 - local150) * (local166 - local162) - (local158 - local162) * (local154 - local150) > 0) {
				if (Static119.aBoolean120 && Static204.method3261(Static2.anInt73, Static15.anInt416, local158, local162, local166, local146, local150, local154)) {
					Static108.anInt2645 = arg5;
					Static11.anInt260 = arg6;
				}
				Static56.aBoolean61 = false;
				if (local146 < 0 || local150 < 0 || local154 < 0 || local146 > Static56.anInt1524 || local150 > Static56.anInt1524 || local154 > Static56.anInt1524) {
					Static56.aBoolean61 = true;
				}
				if (arg0.anIntArray413 == null || arg0.anIntArray413[local17] == -1) {
					if (arg0.anIntArray414[local17] != 12345678) {
						Static56.method1026(local158, local162, local166, local146, local150, local154, arg0.anIntArray414[local17], arg0.anIntArray420[local17], arg0.anIntArray406[local17]);
					}
				} else if (Static16.aBoolean20) {
					@Pc(367) int local367 = Static56.anInterface2_1.method1092(arg0.anIntArray413[local17]);
					Static56.method1026(local158, local162, local166, local146, local150, local154, Static106.method1971(local367, arg0.anIntArray414[local17]), Static106.method1971(local367, arg0.anIntArray420[local17]), Static106.method1971(local367, arg0.anIntArray406[local17]));
				} else if (arg0.aBoolean140) {
					Static56.method1033(local158, local162, local166, local146, local150, local154, arg0.anIntArray414[local17], arg0.anIntArray420[local17], arg0.anIntArray406[local17], Static152.anIntArray416[0], Static152.anIntArray416[1], Static152.anIntArray416[3], Static152.anIntArray411[0], Static152.anIntArray411[1], Static152.anIntArray411[3], Static152.anIntArray419[0], Static152.anIntArray419[1], Static152.anIntArray419[3], arg0.anIntArray413[local17]);
				} else {
					Static56.method1033(local158, local162, local166, local146, local150, local154, arg0.anIntArray414[local17], arg0.anIntArray420[local17], arg0.anIntArray406[local17], Static152.anIntArray416[local24], Static152.anIntArray416[local31], Static152.anIntArray416[local41], Static152.anIntArray411[local24], Static152.anIntArray411[local31], Static152.anIntArray411[local41], Static152.anIntArray419[local24], Static152.anIntArray419[local31], Static152.anIntArray419[local41], arg0.anIntArray413[local17]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILclient!bh;I)V")
	public static void method2420(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub4_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt3945 == arg2 && arg2 != -1) {
			@Pc(26) Class1_Sub2_Sub14 local26 = Static173.method2924(arg2);
			@Pc(29) int local29 = local26.anInt2493;
			if (local29 == 1) {
				arg1.anInt3970 = 0;
				arg1.anInt3986 = 0;
				arg1.anInt3968 = 0;
				arg1.anInt3956 = arg0;
				Static18.method348(local26, arg1.anInt3976, arg1.anInt3934, Static201.aClass6_Sub4_Sub1_3 == arg1, arg1.anInt3968);
			}
			if (local29 == 2) {
				arg1.anInt3986 = 0;
				return;
			}
		} else if (arg2 == -1 || arg1.anInt3945 == -1 || Static173.method2924(arg2).anInt2501 >= Static173.method2924(arg1.anInt3945).anInt2501) {
			arg1.anInt3945 = arg2;
			arg1.anInt3986 = 0;
			arg1.anInt3970 = 0;
			arg1.anInt3953 = arg1.anInt3951;
			arg1.anInt3956 = arg0;
			arg1.anInt3968 = 0;
			if (arg1.anInt3945 == -1) {
				return;
			}
			Static18.method348(Static173.method2924(arg1.anInt3945), arg1.anInt3976, arg1.anInt3934, arg1 == Static201.aClass6_Sub4_Sub1_3, arg1.anInt3968);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)Lclient!oc;")
	public static Class65 method2421(@OriginalArg(0) int arg0) {
		return Static198.aClass65Array62[arg0].method2482() <= 0 ? Static161.aClass65Array51[arg0] : Static109.method2004(new Class65[] { Static161.aClass65Array51[arg0], Static62.aClass65_972, Static198.aClass65Array62[arg0] });
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BII)I")
	public static int method2422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(36) int local36 = Static65.method1143(arg0 + 45365, 4, arg1 + 91923) + (Static65.method1143(arg0 + 10294, 2, arg1 + 37821) - 128 >> 1) + (Static65.method1143(arg0, 1, arg1) - 128 >> 2) - 128;
		local36 = (int) ((double) local36 * 0.3D) + 35;
		if (local36 < 10) {
			local36 = 10;
		} else if (local36 > 60) {
			local36 = 60;
		}
		return local36;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
	public static void method2423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static108.anInt2648 < 100) {
			Static200.method3241();
		}
		Static194.method3107(arg0, arg1, arg3 + arg0, arg1 + arg2);
		Static56.method1025();
		Static194.method3096(arg0, arg1, arg3, arg2, 0);
		@Pc(39) int local39;
		@Pc(50) int local50;
		if (Static108.anInt2648 < 100) {
			local39 = arg0 + arg3 / 2;
			local50 = arg2 / 2 + arg1 - 18 - 20;
			Static194.method3095(local39 - 152, local50, 304, 34, 9179409);
			Static194.method3095(local39 - 151, local50 + 1, 302, 32, 0);
			Static194.method3096(local39 - 150, local50 - -2, Static108.anInt2648 * 3, 30, 9179409);
			Static194.method3096(local39 + Static108.anInt2648 * 3 - 150, local50 - -2, 300 - Static108.anInt2648 * 3, 30, 0);
			Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1595(Static208.aClass65_2329, local39, local50 + 20, 16777215, -1);
			return;
		}
		Static49.anInt1304 = (int) ((double) (arg2 * 2) / Static164.aDouble11);
		Static54.anInt3672 = Static94.anInt2345 - (int) ((double) arg3 / Static164.aDouble11);
		Static93.anInt2329 = (int) ((double) (arg3 * 2) / Static164.aDouble11);
		@Pc(148) int local148 = Static94.anInt2345 - (int) ((double) arg3 / Static164.aDouble11);
		local39 = Static23.anInt692 - (int) ((double) arg2 / Static164.aDouble11);
		Static206.anInt4387 = Static23.anInt692 - (int) ((double) arg2 / Static164.aDouble11);
		local50 = Static94.anInt2345 + (int) ((double) arg3 / Static164.aDouble11);
		@Pc(183) int local183 = Static23.anInt692 + (int) ((double) arg2 / Static164.aDouble11);
		Static159.method2757(local50, local148, local183, local39, arg0 + arg3, arg1, arg0, arg1 + arg2);
		Static81.method1435(local148, arg2 + arg1, arg1, local50, local39, local183, arg0, arg3 + arg0);
		if (Static148.anInt3490 > 0) {
			Static148.anInt3490--;
		}
		if (!Static172.aBoolean154) {
			return;
		}
		@Pc(225) int local225 = arg3 + arg0 - 5;
		@Pc(231) int local231 = arg1 + arg2 - 8;
		Static200.aClass1_Sub2_Sub5_Sub4_Sub1_5.method1602(Static109.method2004(new Class65[] { Static125.aClass65_1747, Static118.method2250(Static81.anInt2015) }), local225, local231, 16776960, -1);
		@Pc(253) Runtime local253 = Runtime.getRuntime();
		@Pc(254) int local254 = local231 - 15;
		@Pc(256) int local256 = 16776960;
		@Pc(266) int local266 = (int) ((local253.totalMemory() - local253.freeMemory()) / 1024L);
		if (local266 > 32768 && Static13.aBoolean36) {
			local256 = 16711680;
		}
		if (local266 > 65536 && !Static13.aBoolean36) {
			local256 = 16711680;
		}
		Static200.aClass1_Sub2_Sub5_Sub4_Sub1_5.method1602(Static109.method2004(new Class65[] { Static135.aClass65_1871, Static118.method2250(local266), Static18.aClass65_375 }), local225, local254, local256, -1);
		local231 = local254 - 15;
	}
}
