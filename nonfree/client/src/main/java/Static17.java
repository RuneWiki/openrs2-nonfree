import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!ie;")
	public static Class35 aClass35_4;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public static int anInt644 = 0;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public static volatile int anInt645 = -1;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Z")
	public static boolean aBoolean30 = false;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "Lclient!id;")
	private static Class34 aClass34_348 = Static9.method266("Loading )2 please wait)3");

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "Lclient!id;")
	public static Class34 aClass34_347 = aClass34_348;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "[I")
	public static int[] anIntArray64 = new int[100];

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	public static int anInt649 = 0;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "[I")
	public static int[] anIntArray65 = new int[2048];

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "[I")
	public static int[] anIntArray66 = new int[50];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lclient!id;I)[Lclient!id;")
	public static Class34[] method385(@OriginalArg(0) Class34[] arg0) {
		@Pc(9) Class34[] local9 = new Class34[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local9[local15] = Static91.method1554(new Class34[] { Static85.method1456(local15), Static84.aClass34_1105 });
			if (arg0 != null && arg0[local15] != null) {
				local9[local15] = Static91.method1554(new Class34[] { local9[local15], arg0[local15] });
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BII)V")
	public static void method386(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static93.anInt2428 == 2) {
			Static40.method686((Static126.anInt3000 - Static121.anInt2871 << 7) + Static87.anInt2261, Static6.anInt389 * 2, Static128.anInt3014 + (Static10.anInt486 - Static37.anInt1098 << 7));
			if (Static123.anInt2916 > -1 && Static73.anInt1947 % 20 < 10) {
				Static24.aClass1_Sub1_Sub2_Sub1Array3[0].method182(Static123.anInt2916 + arg1 - 12, arg0 + -28 - -Static95.anInt2447);
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBII)V")
	public static void method387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static118.method1873();
		Static111.method1753(arg2, arg1, Static45.aClass1_Sub1_Sub2_Sub2_14.anInt883 + arg2, arg1 - -Static45.aClass1_Sub1_Sub2_Sub2_14.anInt880);
		if (Static42.anInt1195 == 2 || Static42.anInt1195 == 5) {
			Static111.method1760(arg2 + 25, arg1 + 5, Static57.anIntArray171, Static77.anIntArray243);
		} else {
			@Pc(41) int local41 = Static132.anInt3154 + Static126.anInt2999 & 0x7FF;
			@Pc(48) int local48 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 / 32 + 48;
			@Pc(56) int local56 = 464 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 / 32;
			Static27.aClass1_Sub1_Sub2_Sub1_2.method189(arg2 + 25, arg1 - -5, 146, 151, local48, local56, local41, Static122.anInt2890 + 256, Static57.anIntArray171, Static77.anIntArray243);
			@Pc(92) int local92;
			@Pc(106) int local106;
			for (@Pc(76) int local76 = 0; local76 < Static59.anInt1637; local76++) {
				local92 = Static78.anIntArray246[local76] * 4 + 2 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 / 32;
				local106 = Static66.anIntArray213[local76] * 4 + 2 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 / 32;
				Static59.method1031(arg1, arg2, Static38.aClass1_Sub1_Sub2_Sub1Array5[local76], local92, local106);
			}
			@Pc(165) int local165;
			@Pc(153) int local153;
			for (local92 = 0; local92 < 104; local92++) {
				for (local106 = 0; local106 < 104; local106++) {
					@Pc(139) Class38 local139 = Static94.aClass38ArrayArrayArray1[Static42.anInt1208][local92][local106];
					if (local139 != null) {
						local153 = local106 * 4 + 2 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 / 32;
						local165 = local92 * 4 + 2 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 / 32;
						Static59.method1031(arg1, arg2, Static95.aClass1_Sub1_Sub2_Sub1Array8[0], local165, local153);
					}
				}
			}
			@Pc(244) int local244;
			for (local106 = 0; local106 < Static64.anInt1731; local106++) {
				@Pc(196) Class1_Sub1_Sub1_Sub1_Sub2 local196 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[Static1.anIntArray19[local106]];
				if (local196 != null && local196.method901()) {
					@Pc(205) Class1_Sub1_Sub17 local205 = local196.aClass1_Sub1_Sub17_1;
					if (local205 != null && local205.anIntArray375 != null) {
						local205 = local205.method2010();
					}
					if (local205 != null && local205.aBoolean181 && local205.aBoolean182) {
						local153 = local196.anInt1428 / 32 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 / 32;
						local244 = local196.anInt1405 / 32 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 / 32;
						Static59.method1031(arg1, arg2, Static95.aClass1_Sub1_Sub2_Sub1Array8[1], local153, local244);
					}
				}
			}
			@Pc(271) Class1_Sub1_Sub1_Sub1_Sub1 local271;
			for (@Pc(263) int local263 = 0; local263 < Static40.anInt1154; local263++) {
				local271 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static102.anIntArray321[local263]];
				if (local271 != null && local271.method901()) {
					local153 = local271.anInt1428 / 32 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 / 32;
					local244 = local271.anInt1405 / 32 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 / 32;
					@Pc(301) boolean local301 = false;
					@Pc(306) long local306 = local271.aClass34_97.method965();
					for (@Pc(308) int local308 = 0; local308 < Static90.anInt3112; local308++) {
						if (local306 == Static116.aLongArray6[local308] && Static77.anIntArray242[local308] != 0) {
							local301 = true;
							break;
						}
					}
					@Pc(341) boolean local341 = false;
					if (Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt248 != 0 && local271.anInt248 != 0 && local271.anInt248 == Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt248) {
						local341 = true;
					}
					if (local301) {
						Static59.method1031(arg1, arg2, Static95.aClass1_Sub1_Sub2_Sub1Array8[3], local153, local244);
					} else if (local341) {
						Static59.method1031(arg1, arg2, Static95.aClass1_Sub1_Sub2_Sub1Array8[4], local153, local244);
					} else {
						Static59.method1031(arg1, arg2, Static95.aClass1_Sub1_Sub2_Sub1Array8[2], local153, local244);
					}
				}
			}
			if (Static93.anInt2428 != 0 && Static73.anInt1947 % 20 < 10) {
				if (Static93.anInt2428 == 1 && Static67.anInt1766 >= 0 && Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length > Static67.anInt1766) {
					@Pc(441) Class1_Sub1_Sub1_Sub1_Sub2 local441 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[Static67.anInt1766];
					if (local441 != null) {
						local153 = local441.anInt1428 / 32 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 / 32;
						local244 = local441.anInt1405 / 32 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 / 32;
						Static120.method1910(arg2, local244, Static64.aClass1_Sub1_Sub2_Sub1Array6[1], local153, arg1);
					}
				}
				if (Static93.anInt2428 == 2) {
					local165 = (Static10.anInt486 - Static37.anInt1098) * 4 + 2 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 / 32;
					local153 = (Static126.anInt3000 - Static121.anInt2871) * 4 + 2 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 / 32;
					Static120.method1910(arg2, local153, Static64.aClass1_Sub1_Sub2_Sub1Array6[1], local165, arg1);
				}
				if (Static93.anInt2428 == 10 && Static122.anInt2886 >= 0 && Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length > Static122.anInt2886) {
					local271 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static122.anInt2886];
					if (local271 != null) {
						local244 = local271.anInt1405 / 32 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 / 32;
						local153 = local271.anInt1428 / 32 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 / 32;
						Static120.method1910(arg2, local244, Static64.aClass1_Sub1_Sub2_Sub1Array6[1], local153, arg1);
					}
				}
			}
			if (Static44.anInt1248 != 0) {
				local165 = Static44.anInt1248 * 4 + 2 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 / 32;
				local153 = Static54.anInt1521 * 4 + 2 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 / 32;
				Static59.method1031(arg1, arg2, Static64.aClass1_Sub1_Sub2_Sub1Array6[0], local165, local153);
			}
			Static111.method1747(arg2 + 4 + 93, arg1 + 82 + -4, 3, 3, 16777215);
		}
		if (Static42.anInt1195 < 3) {
			Static55.aClass1_Sub1_Sub2_Sub1_3.method189(arg2, arg1, 33, 33, 25, 25, Static132.anInt3154, 256, Static105.anIntArray324, Static56.anIntArray305);
		} else {
			Static111.method1760(arg2, arg1, Static105.anIntArray324, Static56.anIntArray305);
		}
		if (Static29.aBooleanArray6[arg0]) {
			Static45.aClass1_Sub1_Sub2_Sub2_14.method542(arg2, arg1);
		}
		Static43.aBooleanArray8[arg0] = true;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public static void method388() {
		for (@Pc(7) int local7 = 0; local7 < Static32.anInt1453; local7++) {
			@Pc(18) int local18 = anIntArray65[local7];
			@Pc(22) Class1_Sub1_Sub1_Sub1_Sub2 local22 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local18];
			@Pc(26) int local26 = Static51.aClass1_Sub19_Sub1_4.method2072();
			@Pc(34) int local34;
			@Pc(40) int local40;
			if ((local26 & 0x8) != 0) {
				local34 = Static51.aClass1_Sub19_Sub1_4.method2066();
				local40 = Static51.aClass1_Sub19_Sub1_4.method2092();
				local22.method906(local40, local34, Static73.anInt1947);
				local22.anInt1397 = Static73.anInt1947 + 300;
				local22.anInt1413 = Static51.aClass1_Sub19_Sub1_4.method2066();
				local22.anInt1450 = Static51.aClass1_Sub19_Sub1_4.method2066();
			}
			if ((local26 & 0x20) != 0) {
				local22.aClass1_Sub1_Sub17_1 = Static65.method1119(Static51.aClass1_Sub19_Sub1_4.method2093());
				local22.anInt1409 = local22.aClass1_Sub1_Sub17_1.anInt3036;
				local22.anInt1392 = local22.aClass1_Sub1_Sub17_1.anInt3040;
				local22.anInt1432 = local22.aClass1_Sub1_Sub17_1.anInt3057;
				local22.anInt1442 = local22.aClass1_Sub1_Sub17_1.anInt3062;
				local22.anInt1398 = local22.aClass1_Sub1_Sub17_1.anInt3044;
				local22.anInt1447 = local22.aClass1_Sub1_Sub17_1.anInt3046;
				local22.anInt1395 = local22.aClass1_Sub1_Sub17_1.anInt3056;
				local22.anInt1404 = local22.aClass1_Sub1_Sub17_1.anInt3063;
				local22.anInt1443 = local22.aClass1_Sub1_Sub17_1.anInt3042;
			}
			if ((local26 & 0x80) != 0) {
				local34 = Static51.aClass1_Sub19_Sub1_4.method2074();
				local40 = Static51.aClass1_Sub19_Sub1_4.method2074();
				local22.method906(local40, local34, Static73.anInt1947);
				local22.anInt1397 = Static73.anInt1947 + 300;
				local22.anInt1413 = Static51.aClass1_Sub19_Sub1_4.method2072();
				local22.anInt1450 = Static51.aClass1_Sub19_Sub1_4.method2092();
			}
			if ((local26 & 0x10) != 0) {
				local34 = Static51.aClass1_Sub19_Sub1_4.method2093();
				if (local34 == 65535) {
					local34 = -1;
				}
				local40 = Static51.aClass1_Sub19_Sub1_4.method2074();
				if (local22.anInt1388 == local34 && local34 != -1) {
					@Pc(232) int local232 = Static40.method687(local34).anInt1200;
					if (local232 == 1) {
						local22.anInt1393 = 0;
						local22.anInt1427 = 0;
						local22.anInt1431 = 0;
						local22.anInt1416 = local40;
					}
					if (local232 == 2) {
						local22.anInt1427 = 0;
					}
				} else if (local34 == -1 || local22.anInt1388 == -1 || Static40.method687(local34).anInt1194 >= Static40.method687(local22.anInt1388).anInt1194) {
					local22.anInt1416 = local40;
					local22.anInt1393 = 0;
					local22.anInt1388 = local34;
					local22.anInt1427 = 0;
					local22.anInt1431 = 0;
					local22.anInt1418 = local22.anInt1417;
				}
			}
			if ((local26 & 0x4) != 0) {
				local22.aClass34_701 = Static51.aClass1_Sub19_Sub1_4.method2084();
				local22.anInt1408 = 100;
			}
			if ((local26 & 0x2) != 0) {
				local22.anInt1389 = Static51.aClass1_Sub19_Sub1_4.method2053();
				if (local22.anInt1389 == 65535) {
					local22.anInt1389 = -1;
				}
			}
			if ((local26 & 0x1) != 0) {
				local22.anInt1455 = Static51.aClass1_Sub19_Sub1_4.method2051();
				local22.anInt1422 = Static51.aClass1_Sub19_Sub1_4.method2051();
			}
			if ((local26 & 0x40) != 0) {
				local22.anInt1414 = Static51.aClass1_Sub19_Sub1_4.method2051();
				local34 = Static51.aClass1_Sub19_Sub1_4.method2083();
				local22.anInt1420 = Static73.anInt1947 + (local34 & 0xFFFF);
				local22.anInt1433 = 0;
				if (local22.anInt1414 == 65535) {
					local22.anInt1414 = -1;
				}
				local22.anInt1424 = 0;
				if (local22.anInt1420 > Static73.anInt1947) {
					local22.anInt1424 = -1;
				}
				local22.anInt1407 = local34 >> 16;
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public static void method389() {
		aClass35_4 = null;
		anIntArray64 = null;
		anIntArray66 = null;
		aClass34_347 = null;
		aClass34_348 = null;
		anIntArray65 = null;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V")
	public static void method390() {
		Static97.aClass38_21 = new Class38();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
	public static void method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) long local6 = (long) (arg1 + (arg0 << 16));
		@Pc(16) Class1_Sub1_Sub9 local16 = (Class1_Sub1_Sub9) Static29.aClass48_3.method1340(local6);
		if (local16 != null) {
			Static91.aClass80_1.method1983(local16);
		}
	}
}
