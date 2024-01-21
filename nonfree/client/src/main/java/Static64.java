import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!la", name = "A", descriptor = "I")
	public static final int anInt1713 = 50;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "[I")
	public static int[] anIntArray170 = new int[anInt1713];

	@OriginalMember(owner = "client!la", name = "s", descriptor = "I")
	public static int anInt1709 = 0;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "[I")
	public static int[] anIntArray171 = new int[anInt1713];

	@OriginalMember(owner = "client!la", name = "u", descriptor = "[I")
	public static int[] anIntArray172 = new int[anInt1713];

	@OriginalMember(owner = "client!la", name = "x", descriptor = "[I")
	public static int[] anIntArray173 = new int[anInt1713];

	@OriginalMember(owner = "client!la", name = "y", descriptor = "[I")
	public static int[] anIntArray174 = new int[anInt1713];

	@OriginalMember(owner = "client!la", name = "B", descriptor = "I")
	public static int anInt1714 = 255;

	@OriginalMember(owner = "client!la", name = "C", descriptor = "[I")
	public static int[] anIntArray175 = new int[anInt1713];

	@OriginalMember(owner = "client!la", name = "N", descriptor = "[I")
	public static int[] anIntArray176 = new int[anInt1713];

	@OriginalMember(owner = "client!la", name = "O", descriptor = "Lclient!qc;")
	public static Class60 aClass60_605 = Static121.method2047(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!la", name = "R", descriptor = "[Lclient!qc;")
	public static Class60[] aClass60Array13 = new Class60[anInt1713];

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method1279() {
		anIntArray172 = null;
		anIntArray174 = null;
		anIntArray173 = null;
		anIntArray175 = null;
		aClass60Array13 = null;
		aClass60_605 = null;
		anIntArray171 = null;
		anIntArray170 = null;
		anIntArray176 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII)V")
	public static void method1280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static14.anInt3005 == 1) {
			Static78.aClass4_Sub4_Sub3_Sub2Array7[Static35.anInt914 / 100].method912(Static120.anInt1936 - 8, Static94.anInt2308 + -8);
		}
		if (Static14.anInt3005 == 2) {
			Static78.aClass4_Sub4_Sub3_Sub2Array7[Static35.anInt914 / 100 + 4].method912(Static120.anInt1936 - 8, Static94.anInt2308 + -8);
		}
		Static46.method831();
		if (!Static112.aBoolean117) {
			return;
		}
		@Pc(50) int local50 = arg1 + 507;
		@Pc(52) int local52 = 16776960;
		@Pc(56) int local56 = arg0 + 20;
		Static2.aClass4_Sub4_Sub3_Sub4_3.method1732(Static125.method2072(new Class60[] { Static27.aClass60_311, Static120.method1450(Static107.anInt2523) }), local50, local56, 16776960, -1);
		@Pc(78) Runtime local78 = Runtime.getRuntime();
		@Pc(88) int local88 = (int) ((local78.totalMemory() - local78.freeMemory()) / 1024L);
		@Pc(89) int local89 = local56 + 15;
		if (local88 > 32768 && Static61.aBoolean57) {
			local52 = 16711680;
		}
		if (local88 > 65536 && !Static61.aBoolean57) {
			local52 = 16711680;
		}
		Static2.aClass4_Sub4_Sub3_Sub4_3.method1732(Static125.method2072(new Class60[] { Static1.aClass60_3, Static120.method1450(local88), Static72.aClass60_712 }), local50, local89, local52, -1);
		local56 = local89 + 15;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(B)V")
	public static void method1281() {
		for (@Pc(7) int local7 = 0; local7 < Static85.anInt2030; local7++) {
			@Pc(13) int local13 = Static35.anIntArray68[local7];
			@Pc(17) Class4_Sub4_Sub1_Sub2_Sub2 local17 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local13];
			@Pc(21) int local21 = Static105.aClass4_Sub13_Sub1_3.method1223();
			if ((local21 & 0x40) != 0) {
				local21 += Static105.aClass4_Sub13_Sub1_3.method1223() << 8;
			}
			Static51.method972(local13, local21, local17);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method1282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg1 < 1 || arg2 < 1 || arg1 > 102 || arg2 > 102) {
			return;
		}
		if (Static61.aBoolean57 && arg6 != Static129.anInt3003) {
			return;
		}
		@Pc(36) int local36 = 0;
		if (arg3 == 0) {
			local36 = Static7.aClass28_3.method796(arg6, arg1, arg2);
		}
		if (arg3 == 1) {
			local36 = Static7.aClass28_3.method804(arg6, arg1, arg2);
		}
		if (arg3 == 2) {
			local36 = Static7.aClass28_3.method783(arg6, arg1, arg2);
		}
		if (arg3 == 3) {
			local36 = Static7.aClass28_3.method759(arg6, arg1, arg2);
		}
		@Pc(98) int local98;
		if (local36 != 0) {
			@Pc(91) int local91 = local36 >> 14 & 0x7FFF;
			local98 = Static7.aClass28_3.method760(arg6, arg1, arg2, local36);
			@Pc(104) int local104 = local98 >> 6 & 0x3;
			@Pc(108) int local108 = local98 & 0x1F;
			@Pc(122) Class4_Sub4_Sub5 local122;
			if (arg3 == 0) {
				Static7.aClass28_3.method771(arg6, arg1, arg2);
				local122 = Static24.method477(local91);
				if (local122.anInt1080 != 0) {
					Static119.aClass45Array1[arg6].method1324(local104, local122.aBoolean38, arg2, arg1, local108);
				}
			}
			if (arg3 == 1) {
				Static7.aClass28_3.method757(arg6, arg1, arg2);
			}
			if (arg3 == 2) {
				Static7.aClass28_3.method806(arg6, arg1, arg2);
				local122 = Static24.method477(local91);
				if (local122.anInt1075 + arg1 > 103 || local122.anInt1075 + arg2 > 103 || arg1 + local122.anInt1085 > 103 || arg2 + local122.anInt1085 > 103) {
					return;
				}
				if (local122.anInt1080 != 0) {
					Static119.aClass45Array1[arg6].method1335(arg1, arg2, local104, local122.anInt1075, local122.anInt1085, local122.aBoolean38);
				}
			}
			if (arg3 == 3) {
				Static7.aClass28_3.method788(arg6, arg1, arg2);
				local122 = Static24.method477(local91);
				if (local122.anInt1080 == 1) {
					Static119.aClass45Array1[arg6].method1328(arg2, arg1);
				}
			}
		}
		if (arg0 < 0) {
			return;
		}
		local98 = arg6;
		if (arg6 < 3 && (Static95.aByteArrayArrayArray5[1][arg1][arg2] & 0x2) == 2) {
			local98 = arg6 + 1;
		}
		Static98.method1754(arg4, arg6, arg1, arg5, local98, Static7.aClass28_3, arg2, arg0, Static119.aClass45Array1[arg6]);
		return;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)V")
	public static void method1283() {
		@Pc(20) int local20;
		if (Static120.anInt1939 == 0) {
			Static7.aClass28_3 = new Class28(4, 104, 104, Static58.anIntArrayArrayArray5);
			for (local20 = 0; local20 < 4; local20++) {
				Static119.aClass45Array1[local20] = new Class45(104, 104);
			}
			Static131.aClass4_Sub4_Sub3_Sub2_5 = new Class4_Sub4_Sub3_Sub2(512, 512);
			Static111.anInt2691 = 5;
			Static33.aClass60_369 = Static4.aClass60_20;
			Static120.anInt1939 = 20;
			return;
		}
		@Pc(55) int local55;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(73) int local73;
		if (Static120.anInt1939 == 20) {
			@Pc(53) int[] local53 = new int[9];
			for (local55 = 0; local55 < 9; local55++) {
				local63 = local55 * 32 + 143;
				local69 = local63 * 3 + 600;
				local73 = Class4_Sub4_Sub3_Sub3.anIntArray214[local63];
				local53[local55] = local73 * local69 >> 16;
			}
			Static44.method786(local53);
			Static33.aClass60_369 = Static125.aClass60_1174;
			Static111.anInt2691 = 10;
			Static120.anInt1939 = 30;
		} else if (Static120.anInt1939 == 30) {
			Static120.aClass40_Sub1_15 = Static37.method643(true, 0, false, true);
			Static10.aClass40_Sub1_5 = Static37.method643(true, 1, false, true);
			Static63.aClass40_Sub1_10 = Static37.method643(true, 2, true, false);
			Static119.aClass40_Sub1_19 = Static37.method643(true, 3, false, true);
			Static2.aClass40_Sub1_9 = Static37.method643(true, 4, false, true);
			Static119.aClass40_Sub1_20 = Static37.method643(true, 5, true, true);
			Static5.aClass40_Sub1_3 = Static37.method643(false, 6, true, true);
			Static88.aClass40_Sub1_17 = Static37.method643(true, 7, false, true);
			Static1.aClass40_Sub1_1 = Static37.method643(true, 8, false, true);
			Static120.aClass40_Sub1_16 = Static37.method643(true, 9, false, true);
			Static110.aClass40_Sub1_18 = Static37.method643(true, 10, false, true);
			Static23.aClass40_Sub1_7 = Static37.method643(true, 11, false, true);
			Static72.aClass40_Sub1_11 = Static37.method643(true, 12, false, true);
			Static76.aClass40_Sub1_12 = Static37.method643(true, 13, true, false);
			Static39.aClass40_Sub1_8 = Static37.method643(false, 14, false, true);
			Static122.aClass40_Sub1_22 = Static37.method643(true, 15, false, true);
			Static120.anInt1939 = 40;
			Static33.aClass60_369 = Static106.aClass60_1018;
			Static111.anInt2691 = 20;
		} else if (Static120.anInt1939 == 40) {
			local20 = Static120.aClass40_Sub1_15.method1124() * 4 / 100;
			local20 += Static10.aClass40_Sub1_5.method1124() * 4 / 100;
			local20 += Static63.aClass40_Sub1_10.method1124() * 2 / 100;
			local20 += Static119.aClass40_Sub1_19.method1124() * 2 / 100;
			local20 += Static2.aClass40_Sub1_9.method1124() * 6 / 100;
			local20 += Static119.aClass40_Sub1_20.method1124() * 4 / 100;
			local20 += Static5.aClass40_Sub1_3.method1124() * 2 / 100;
			local20 += Static88.aClass40_Sub1_17.method1124() * 60 / 100;
			local20 += Static1.aClass40_Sub1_1.method1124() * 2 / 100;
			local20 += Static120.aClass40_Sub1_16.method1124() * 2 / 100;
			local20 += Static110.aClass40_Sub1_18.method1124() * 2 / 100;
			local20 += Static23.aClass40_Sub1_7.method1124() * 2 / 100;
			local20 += Static72.aClass40_Sub1_11.method1124() * 2 / 100;
			local20 += Static76.aClass40_Sub1_12.method1124() * 2 / 100;
			local20 += Static39.aClass40_Sub1_8.method1124() * 2 / 100;
			local20 += Static122.aClass40_Sub1_22.method1124() * 2 / 100;
			if (local20 == 100) {
				Static33.aClass60_369 = Static108.aClass60_1032;
				Static111.anInt2691 = 30;
				Static120.anInt1939 = 45;
			} else {
				if (local20 != 0) {
					Static33.aClass60_369 = Static125.method2072(new Class60[] { Static127.aClass60_1195, Static120.method1450(local20), Static56.aClass60_541 });
				}
				Static111.anInt2691 = 30;
			}
		} else if (Static120.anInt1939 == 45) {
			Static110.method1893(!Static61.aBoolean57);
			@Pc(442) Class4_Sub2_Sub2 local442 = new Class4_Sub2_Sub2();
			local442.method541();
			Static110.aClass39_2 = Static6.method41(Static129.aClass35_3, Static83.aCanvas1, 22050, 0);
			Static110.aClass39_2.method1683(local442);
			Static103.method1251(local442, Static39.aClass40_Sub1_8, Static2.aClass40_Sub1_9, Static122.aClass40_Sub1_22);
			Static46.aClass39_1 = Static6.method41(Static129.aClass35_3, Static83.aCanvas1, 2048, 1);
			Static119.aClass4_Sub2_Sub3_2 = new Class4_Sub2_Sub3();
			Static46.aClass39_1.method1683(Static119.aClass4_Sub2_Sub3_2);
			Static37.aClass77_1 = new Class77(22050, Static31.anInt846);
			Static120.anInt1939 = 50;
			Static111.anInt2691 = 35;
			Static33.aClass60_369 = Static5.aClass60_28;
		} else if (Static120.anInt1939 == 50) {
			local20 = 0;
			if (Static71.aClass4_Sub4_Sub3_Sub4_4 == null) {
				Static71.aClass4_Sub4_Sub3_Sub4_4 = Static127.method2100(Static1.aClass40_Sub1_1, Static37.aClass60_395, Static22.aClass60_241);
			} else {
				local20++;
			}
			if (Static2.aClass4_Sub4_Sub3_Sub4_3 == null) {
				Static2.aClass4_Sub4_Sub3_Sub4_3 = Static127.method2100(Static1.aClass40_Sub1_1, Static54.aClass60_525, Static22.aClass60_241);
			} else {
				local20++;
			}
			if (Static87.aClass4_Sub4_Sub3_Sub4_5 == null) {
				Static87.aClass4_Sub4_Sub3_Sub4_5 = Static127.method2100(Static1.aClass40_Sub1_1, Static4.aClass60_21, Static22.aClass60_241);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static33.aClass60_369 = Static125.method2072(new Class60[] { Static35.aClass60_379, Static120.method1450(local20 * 100 / 3), Static56.aClass60_541 });
				Static111.anInt2691 = 40;
			} else {
				Static111.anInt2691 = 40;
				Static33.aClass60_369 = Static112.aClass60_1088;
				Static120.anInt1939 = 60;
			}
		} else if (Static120.anInt1939 == 60) {
			local20 = Static17.method295(Static1.aClass40_Sub1_1, Static110.aClass40_Sub1_18);
			local55 = Static126.method2082();
			if (local55 > local20) {
				Static33.aClass60_369 = Static125.method2072(new Class60[] { Static83.aClass60_816, Static120.method1450(local20 * 100 / local55), Static56.aClass60_541 });
				Static111.anInt2691 = 50;
			} else {
				Static111.anInt2691 = 50;
				Static33.aClass60_369 = Static120.aClass60_777;
				Static4.method32(5);
				Static120.anInt1939 = 70;
			}
		} else if (Static120.anInt1939 == 70) {
			if (Static63.aClass40_Sub1_10.method1098()) {
				Static130.method2135(Static63.aClass40_Sub1_10);
				Static131.method2141(Static63.aClass40_Sub1_10);
				Static15.method2095(Static63.aClass40_Sub1_10, Static88.aClass40_Sub1_17);
				Static85.method1496(Static88.aClass40_Sub1_17, Static61.aBoolean57, Static63.aClass40_Sub1_10);
				Static102.method1814(Static88.aClass40_Sub1_17, Static63.aClass40_Sub1_10);
				Static89.method1526(Static76.aBoolean76, Static63.aClass40_Sub1_10, Static71.aClass4_Sub4_Sub3_Sub4_4, Static88.aClass40_Sub1_17);
				Static117.method1956(Static10.aClass40_Sub1_5, Static63.aClass40_Sub1_10, Static120.aClass40_Sub1_15);
				Static14.method2127(Static63.aClass40_Sub1_10, Static88.aClass40_Sub1_17);
				Static67.method1981(Static63.aClass40_Sub1_10);
				Static102.method1810(Static63.aClass40_Sub1_10);
				Static11.method205(Static88.aClass40_Sub1_17, Static119.aClass40_Sub1_19, Static1.aClass40_Sub1_1);
				Static59.method1054(Static63.aClass40_Sub1_10);
				Static92.method1609(Static63.aClass40_Sub1_10);
				Static120.anInt1939 = 80;
				Static33.aClass60_369 = Static78.aClass60_753;
				Static111.anInt2691 = 60;
			} else {
				Static33.aClass60_369 = Static125.method2072(new Class60[] { Static110.aClass60_1070, Static120.method1450(Static63.aClass40_Sub1_10.method1130()), Static56.aClass60_541 });
				Static111.anInt2691 = 60;
			}
		} else if (Static120.anInt1939 == 80) {
			local20 = 0;
			if (Static116.aClass4_Sub4_Sub3_Sub2_4 == null) {
				Static116.aClass4_Sub4_Sub3_Sub2_4 = Static34.method628(Static1.aClass40_Sub1_1, Static43.aClass60_452, Static22.aClass60_241);
			} else {
				local20++;
			}
			if (Static31.aClass4_Sub4_Sub3_Sub2_2 == null) {
				Static31.aClass4_Sub4_Sub3_Sub2_2 = Static34.method628(Static1.aClass40_Sub1_1, Static130.aClass60_1217, Static22.aClass60_241);
			} else {
				local20++;
			}
			if (Static122.aClass4_Sub4_Sub3_Sub1Array11 == null) {
				Static122.aClass4_Sub4_Sub3_Sub1Array11 = Static28.method545(Static22.aClass60_241, Static32.aClass60_353, Static1.aClass40_Sub1_1);
			} else {
				local20++;
			}
			if (Static130.aClass4_Sub4_Sub3_Sub2Array9 == null) {
				Static130.aClass4_Sub4_Sub3_Sub2Array9 = Static55.method1030(Static22.aClass60_241, Static1.aClass40_Sub1_1, Static26.aClass60_302);
			} else {
				local20++;
			}
			if (Static11.aClass4_Sub4_Sub3_Sub2Array1 == null) {
				Static11.aClass4_Sub4_Sub3_Sub2Array1 = Static55.method1030(Static22.aClass60_241, Static1.aClass40_Sub1_1, Static74.aClass60_724);
			} else {
				local20++;
			}
			if (Static130.aClass4_Sub4_Sub3_Sub2Array10 == null) {
				Static130.aClass4_Sub4_Sub3_Sub2Array10 = Static55.method1030(Static22.aClass60_241, Static1.aClass40_Sub1_1, Static108.aClass60_1035);
			} else {
				local20++;
			}
			if (Static65.aClass4_Sub4_Sub3_Sub2Array4 == null) {
				Static65.aClass4_Sub4_Sub3_Sub2Array4 = Static55.method1030(Static22.aClass60_241, Static1.aClass40_Sub1_1, Static6.aClass60_35);
			} else {
				local20++;
			}
			if (Static70.aClass4_Sub4_Sub3_Sub2Array5 == null) {
				Static70.aClass4_Sub4_Sub3_Sub2Array5 = Static55.method1030(Static22.aClass60_241, Static1.aClass40_Sub1_1, Static94.aClass60_917);
			} else {
				local20++;
			}
			if (Static30.aClass4_Sub4_Sub3_Sub2Array2 == null) {
				Static30.aClass4_Sub4_Sub3_Sub2Array2 = Static55.method1030(Static22.aClass60_241, Static1.aClass40_Sub1_1, Static46.aClass60_469);
			} else {
				local20++;
			}
			if (Static78.aClass4_Sub4_Sub3_Sub2Array7 == null) {
				Static78.aClass4_Sub4_Sub3_Sub2Array7 = Static55.method1030(Static22.aClass60_241, Static1.aClass40_Sub1_1, Static37.aClass60_397);
			} else {
				local20++;
			}
			if (Static77.aClass4_Sub4_Sub3_Sub2Array6 == null) {
				Static77.aClass4_Sub4_Sub3_Sub2Array6 = Static55.method1030(Static22.aClass60_241, Static1.aClass40_Sub1_1, Static9.aClass60_63);
			} else {
				local20++;
			}
			if (Static121.aClass4_Sub4_Sub3_Sub1Array10 == null) {
				Static121.aClass4_Sub4_Sub3_Sub1Array10 = Static28.method545(Static22.aClass60_241, Static52.aClass60_516, Static1.aClass40_Sub1_1);
			} else {
				local20++;
			}
			if (Static7.aClass4_Sub4_Sub3_Sub1Array12 == null) {
				Static7.aClass4_Sub4_Sub3_Sub1Array12 = Static28.method545(Static22.aClass60_241, Static93.aClass60_908, Static1.aClass40_Sub1_1);
			} else {
				local20++;
			}
			if (Static89.aClass4_Sub4_Sub3_Sub1_5 == null) {
				Static89.aClass4_Sub4_Sub3_Sub1_5 = Static123.method2066(Static1.aClass40_Sub1_1, Static108.aClass60_1045, Static22.aClass60_241);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static33.aClass60_369 = Static125.method2072(new Class60[] { Static11.aClass60_105, Static120.method1450(local20 * 100 / 14), Static56.aClass60_541 });
				Static111.anInt2691 = 70;
			} else {
				Static97.aClass4_Sub4_Sub3_Sub1Array8 = Static7.aClass4_Sub4_Sub3_Sub1Array12;
				local55 = (int) (Math.random() * 21.0D) - 10;
				Static31.aClass4_Sub4_Sub3_Sub2_2.method895();
				local73 = (int) (Math.random() * 41.0D) - 20;
				local63 = (int) (Math.random() * 21.0D) - 10;
				local69 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(942) int local942 = 0; local942 < Static130.aClass4_Sub4_Sub3_Sub2Array9.length; local942++) {
					Static130.aClass4_Sub4_Sub3_Sub2Array9[local942].method919(local55 + local73, local73 + local63, local73 + local69);
				}
				Static122.aClass4_Sub4_Sub3_Sub1Array11[0].method432(local55 + local73, local63 + local73, local69 + local73);
				Static122.method2059();
				Static120.anInt1939 = 90;
				Static111.anInt2691 = 70;
				Static33.aClass60_369 = Static114.aClass60_1101;
			}
		} else if (Static120.anInt1939 == 90) {
			if (Static120.aClass40_Sub1_16.method1098()) {
				@Pc(1036) Class21 local1036 = new Class21(Static120.aClass40_Sub1_16, Static1.aClass40_Sub1_1, 20, 0.8D, Static61.aBoolean57 ? 64 : 128);
				Static91.method1588(local1036);
				Static91.method1597(0.8D);
				Static120.anInt1939 = 110;
				Static33.aClass60_369 = Static31.aClass60_344;
				Static111.anInt2691 = 90;
			} else {
				Static33.aClass60_369 = Static125.method2072(new Class60[] { Static19.aClass60_190, Static120.method1450(Static120.aClass40_Sub1_16.method1130()), Static56.aClass60_541 });
				Static111.anInt2691 = 90;
			}
		} else if (Static120.anInt1939 == 110) {
			Static30.aClass22_1 = new Class22();
			Static129.aClass35_3.method981(10, Static30.aClass22_1);
			Static120.anInt1939 = 120;
			Static111.anInt2691 = 94;
			Static33.aClass60_369 = Static69.aClass60_628;
		} else if (Static120.anInt1939 == 120) {
			if (Static110.aClass40_Sub1_18.method1118(Static22.aClass60_241, Static73.aClass60_717)) {
				@Pc(1103) Class80 local1103 = new Class80(Static110.aClass40_Sub1_18.method1112(Static73.aClass60_717, Static22.aClass60_241));
				Static3.method10(local1103);
				Static111.anInt2691 = 96;
				Static120.anInt1939 = 130;
				Static33.aClass60_369 = Static74.aClass60_727;
			} else {
				Static33.aClass60_369 = Static125.method2072(new Class60[] { Static70.aClass60_646, Static39.aClass60_419 });
				Static111.anInt2691 = 96;
			}
		} else if (Static120.anInt1939 == 130) {
			if (!Static119.aClass40_Sub1_19.method1098()) {
				Static33.aClass60_369 = Static125.method2072(new Class60[] { Static29.aClass60_325, Static120.method1450(Static119.aClass40_Sub1_19.method1130() * 4 / 5), Static56.aClass60_541 });
				Static111.anInt2691 = 100;
			} else if (!Static72.aClass40_Sub1_11.method1098()) {
				Static33.aClass60_369 = Static125.method2072(new Class60[] { Static29.aClass60_325, Static120.method1450(Static72.aClass40_Sub1_11.method1130() / 6 + 80), Static56.aClass60_541 });
				Static111.anInt2691 = 100;
			} else if (Static76.aClass40_Sub1_12.method1098()) {
				Static33.aClass60_369 = Static73.aClass60_715;
				Static120.anInt1939 = 140;
				Static111.anInt2691 = 100;
			} else {
				Static33.aClass60_369 = Static125.method2072(new Class60[] { Static29.aClass60_325, Static120.method1450(Static76.aClass40_Sub1_12.method1130() / 20 + 96), Static56.aClass60_541 });
				Static111.anInt2691 = 100;
			}
		} else if (Static120.anInt1939 == 140) {
			Static4.method32(10);
		}
	}
}
