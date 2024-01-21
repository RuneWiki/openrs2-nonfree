import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!fd;")
	public static Class24 aClass24_7;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
	public static int anInt612;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "Lclient!na;")
	public static Class2_Sub9 aClass2_Sub9_2;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "[I")
	public static int[] anIntArray71;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!ac;")
	public static Class3 aClass3_4 = new Class3();

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
	public static int[] anIntArray70 = new int[128];

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "[S")
	public static short[] aShortArray3 = new short[] { -1, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	public static int anInt613 = 0;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "Lclient!je;")
	public static Class40 aClass40_328 = Static69.method1231("Konfig geladen)3");

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	public static int anInt615 = 0;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "Lclient!je;")
	public static Class40 aClass40_329 = Static69.method1231("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
	public static int anInt616 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	public static void method375(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static129.anIntArray354[arg0];
		@Pc(14) int local14 = Static83.anIntArray236[arg0];
		@Pc(18) int local18 = Static38.anIntArray98[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		@Pc(26) int local26 = Static103.anIntArray284[arg0];
		@Pc(35) Class2_Sub13 local35;
		if (local14 == 37) {
			Static125.method2080();
			local35 = Static55.method972(local10);
			Static112.anInt2612 = local18;
			Static111.anInt2597 = 1;
			Static65.anInt1729 = local26;
			Static73.anInt1924 = local10;
			Static17.method316(local35);
			Static2.aClass40_72 = Static40.method722(new Class40[] { Static112.aClass40_1411, Static102.method1800(local26).aClass40_1161, Static41.aClass40_565 });
			if (Static2.aClass40_72 == null) {
				Static2.aClass40_72 = Static12.aClass40_1633;
			}
			return;
		}
		if (local14 == 3) {
			Static129.method2141(local18, local26, local10);
			Static57.aClass2_Sub9_Sub1_2.method673(48);
			Static57.aClass2_Sub9_Sub1_2.method616(local26 >> 14 & 0x7FFF);
			Static57.aClass2_Sub9_Sub1_2.method646(local10 + Static29.anInt720);
			Static57.aClass2_Sub9_Sub1_2.method646(local18 + Static107.anInt2546);
		}
		@Pc(125) Class2_Sub1_Sub1_Sub3_Sub1 local125;
		if (local14 == 47) {
			local125 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local26];
			if (local125 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local125.anIntArray180[0], local125.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static12.anInt3049 = Static41.anInt1096;
				Static124.anInt2881 = 0;
				Static74.anInt920 = 2;
				Static65.anInt1730 = Static103.anInt2511;
				Static57.aClass2_Sub9_Sub1_2.method673(187);
				Static57.aClass2_Sub9_Sub1_2.method657(local26);
			}
		}
		@Pc(208) int local208;
		if (local14 == 5) {
			Static57.aClass2_Sub9_Sub1_2.method673(121);
			Static57.aClass2_Sub9_Sub1_2.method620(local10);
			local35 = Static55.method972(local10);
			if (local35.anIntArrayArray15 != null && local35.anIntArrayArray15[0][0] == 5) {
				local208 = local35.anIntArrayArray15[0][1];
				if (local35.anIntArray155[0] != Static35.anIntArray96[local208]) {
					Static35.anIntArray96[local208] = local35.anIntArray155[0];
					Static48.method871(local208);
				}
			}
		}
		if (local14 == 1007) {
			Static124.anInt2881 = 0;
			Static74.anInt920 = 2;
			Static12.anInt3049 = Static41.anInt1096;
			Static65.anInt1730 = Static103.anInt2511;
			Static57.aClass2_Sub9_Sub1_2.method673(217);
			Static57.aClass2_Sub9_Sub1_2.method616(local26);
		}
		if (local14 == 15 && Static129.method2141(local18, local26, local10)) {
			Static57.aClass2_Sub9_Sub1_2.method673(175);
			Static57.aClass2_Sub9_Sub1_2.method616(Static32.anInt773);
			Static57.aClass2_Sub9_Sub1_2.method624(Static8.anInt206);
			Static57.aClass2_Sub9_Sub1_2.method646(local10 + Static29.anInt720);
			Static57.aClass2_Sub9_Sub1_2.method616(Static107.anInt2546 + local18);
			Static57.aClass2_Sub9_Sub1_2.method657(local26 >> 14 & 0x7FFF);
		}
		if (local14 == 1002) {
			Static129.method2141(local18, local26, local10);
			Static57.aClass2_Sub9_Sub1_2.method673(10);
			Static57.aClass2_Sub9_Sub1_2.method657(Static107.anInt2546 + local18);
			Static57.aClass2_Sub9_Sub1_2.method646(Static29.anInt720 + local10);
			Static57.aClass2_Sub9_Sub1_2.method616(local26 >> 14 & 0x7FFF);
		}
		if (local14 == 36) {
			local35 = Static87.method894(local18, local10);
			if (local35 != null) {
				Static125.method2080();
				Static83.method1494(local10, Static100.method1793(Static116.method1945(local35)), local18);
				Static111.anInt2597 = 0;
				Static34.aClass40_471 = Static28.method440(local35);
				if (Static34.aClass40_471 == null) {
					Static34.aClass40_471 = Static134.aClass40_807;
				}
				if (!local35.aBoolean112) {
					Static118.aClass40_1491 = Static40.method722(new Class40[] { Static84.aClass40_1163, local35.aClass40_775, Static41.aClass40_565 });
					return;
				}
				Static118.aClass40_1491 = Static40.method722(new Class40[] { local35.aClass40_777, Static41.aClass40_565 });
			}
			return;
		}
		@Pc(432) Class2_Sub1_Sub1_Sub3_Sub2 local432;
		if (local14 == 23) {
			local432 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local26];
			if (local432 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local432.anIntArray180[0], local432.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static12.anInt3049 = Static41.anInt1096;
				Static124.anInt2881 = 0;
				Static74.anInt920 = 2;
				Static65.anInt1730 = Static103.anInt2511;
				Static57.aClass2_Sub9_Sub1_2.method673(186);
				Static57.aClass2_Sub9_Sub1_2.method657(local26);
				Static57.aClass2_Sub9_Sub1_2.method629(Static8.anInt206);
				Static57.aClass2_Sub9_Sub1_2.method657(Static32.anInt773);
			}
		}
		if (local14 == 11 && Static56.aClass2_Sub13_7 == null) {
			Static51.method920(local10, local18);
			Static56.aClass2_Sub13_7 = Static87.method894(local18, local10);
			Static17.method316(Static56.aClass2_Sub13_7);
		}
		if (local14 == 43) {
			Static57.aClass2_Sub9_Sub1_2.method673(60);
			Static57.aClass2_Sub9_Sub1_2.method645(local18);
			Static57.aClass2_Sub9_Sub1_2.method631(Static8.anInt206);
			Static57.aClass2_Sub9_Sub1_2.method616(Static32.anInt773);
			Static57.aClass2_Sub9_Sub1_2.method631(local10);
		}
		if (local14 == 16) {
			Static57.aClass2_Sub9_Sub1_2.method673(53);
			Static57.aClass2_Sub9_Sub1_2.method620(local10);
			Static57.aClass2_Sub9_Sub1_2.method657(Static65.anInt1729);
			Static57.aClass2_Sub9_Sub1_2.method631(Static73.anInt1924);
			Static57.aClass2_Sub9_Sub1_2.method657(local18);
			Static57.aClass2_Sub9_Sub1_2.method657(Static112.anInt2612);
			Static57.aClass2_Sub9_Sub1_2.method646(local26);
			Static124.anInt2887 = 0;
			Static115.aClass2_Sub13_15 = Static55.method972(local10);
			Static7.anInt199 = local18;
		}
		if (local14 == 13) {
			Static65.method1143();
		}
		if (local14 == 7) {
			Static129.method2141(local18, local26, local10);
			Static57.aClass2_Sub9_Sub1_2.method673(96);
			Static57.aClass2_Sub9_Sub1_2.method646(local26 >> 14 & 0x7FFF);
			Static57.aClass2_Sub9_Sub1_2.method616(local18 + Static107.anInt2546);
			Static57.aClass2_Sub9_Sub1_2.method646(Static29.anInt720 + local10);
		}
		if (local14 == 30) {
			Static129.method2141(local18, local26, local10);
			Static57.aClass2_Sub9_Sub1_2.method673(169);
			Static57.aClass2_Sub9_Sub1_2.method645(local10 + Static29.anInt720);
			Static57.aClass2_Sub9_Sub1_2.method646(Static107.anInt2546 + local18);
			Static57.aClass2_Sub9_Sub1_2.method646(local26 >> 14 & 0x7FFF);
		}
		@Pc(704) boolean local704;
		if (local14 == 49) {
			local704 = Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 0, 0, 0, local10, local18, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
			if (!local704) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local10, local18, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
			}
			Static74.anInt920 = 2;
			Static124.anInt2881 = 0;
			Static65.anInt1730 = Static103.anInt2511;
			Static12.anInt3049 = Static41.anInt1096;
			Static57.aClass2_Sub9_Sub1_2.method673(98);
			Static57.aClass2_Sub9_Sub1_2.method657(Static107.anInt2546 + local18);
			Static57.aClass2_Sub9_Sub1_2.method645(Static29.anInt720 + local10);
			Static57.aClass2_Sub9_Sub1_2.method645(local26);
		}
		if (local14 == 17) {
			local432 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local26];
			if (local432 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local432.anIntArray180[0], local432.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static65.anInt1730 = Static103.anInt2511;
				Static124.anInt2881 = 0;
				Static74.anInt920 = 2;
				Static12.anInt3049 = Static41.anInt1096;
				Static57.aClass2_Sub9_Sub1_2.method673(168);
				Static57.aClass2_Sub9_Sub1_2.method616(local26);
			}
		}
		if (local14 == 6) {
			Static57.aClass2_Sub9_Sub1_2.method673(13);
			Static57.aClass2_Sub9_Sub1_2.method646(local26);
			Static57.aClass2_Sub9_Sub1_2.method616(local18);
			Static57.aClass2_Sub9_Sub1_2.method624(local10);
			Static124.anInt2887 = 0;
			Static115.aClass2_Sub13_15 = Static55.method972(local10);
			Static7.anInt199 = local18;
		}
		if (local14 == 22) {
			Static111.aClass30_1.method763(Static105.anInt2531, local18, local10);
		}
		if (local14 == 26) {
			local704 = Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 0, 0, 0, local10, local18, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
			if (!local704) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local10, local18, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
			}
			Static124.anInt2881 = 0;
			Static12.anInt3049 = Static41.anInt1096;
			Static65.anInt1730 = Static103.anInt2511;
			Static74.anInt920 = 2;
			Static57.aClass2_Sub9_Sub1_2.method673(59);
			Static57.aClass2_Sub9_Sub1_2.method657(Static107.anInt2546 + local18);
			Static57.aClass2_Sub9_Sub1_2.method616(local26);
			Static57.aClass2_Sub9_Sub1_2.method657(Static29.anInt720 + local10);
		}
		if (local14 == 19) {
			local432 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local26];
			if (local432 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local432.anIntArray180[0], local432.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static74.anInt920 = 2;
				Static12.anInt3049 = Static41.anInt1096;
				Static124.anInt2881 = 0;
				Static65.anInt1730 = Static103.anInt2511;
				Static57.aClass2_Sub9_Sub1_2.method673(83);
				Static57.aClass2_Sub9_Sub1_2.method616(local26);
			}
		}
		if (local14 == 39) {
			local125 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local26];
			if (local125 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local125.anIntArray180[0], local125.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static65.anInt1730 = Static103.anInt2511;
				Static12.anInt3049 = Static41.anInt1096;
				Static124.anInt2881 = 0;
				Static74.anInt920 = 2;
				Static57.aClass2_Sub9_Sub1_2.method673(106);
				Static57.aClass2_Sub9_Sub1_2.method646(local26);
			}
		}
		if (local14 == 24) {
			local704 = Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 0, 0, 0, local10, local18, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
			if (!local704) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local10, local18, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
			}
			Static124.anInt2881 = 0;
			Static65.anInt1730 = Static103.anInt2511;
			Static12.anInt3049 = Static41.anInt1096;
			Static74.anInt920 = 2;
			Static57.aClass2_Sub9_Sub1_2.method673(140);
			Static57.aClass2_Sub9_Sub1_2.method657(Static107.anInt2546 + local18);
			Static57.aClass2_Sub9_Sub1_2.method645(local26);
			Static57.aClass2_Sub9_Sub1_2.method645(local10 + Static29.anInt720);
		}
		if (local14 == 31) {
			local432 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local26];
			if (local432 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local432.anIntArray180[0], local432.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static124.anInt2881 = 0;
				Static12.anInt3049 = Static41.anInt1096;
				Static74.anInt920 = 2;
				Static65.anInt1730 = Static103.anInt2511;
				Static57.aClass2_Sub9_Sub1_2.method673(241);
				Static57.aClass2_Sub9_Sub1_2.method645(local26);
			}
		}
		if (local14 == 40) {
			local125 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local26];
			if (local125 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local125.anIntArray180[0], local125.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static65.anInt1730 = Static103.anInt2511;
				Static124.anInt2881 = 0;
				Static12.anInt3049 = Static41.anInt1096;
				Static74.anInt920 = 2;
				Static57.aClass2_Sub9_Sub1_2.method673(123);
				Static57.aClass2_Sub9_Sub1_2.method657(local26);
			}
		}
		if (local14 == 9) {
			Static57.aClass2_Sub9_Sub1_2.method673(112);
			Static57.aClass2_Sub9_Sub1_2.method616(local18);
			Static57.aClass2_Sub9_Sub1_2.method657(local26);
			Static57.aClass2_Sub9_Sub1_2.method620(local10);
			Static124.anInt2887 = 0;
			Static115.aClass2_Sub13_15 = Static55.method972(local10);
			Static7.anInt199 = local18;
		}
		if (local14 == 57) {
			local432 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local26];
			if (local432 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local432.anIntArray180[0], local432.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static124.anInt2881 = 0;
				Static12.anInt3049 = Static41.anInt1096;
				Static65.anInt1730 = Static103.anInt2511;
				Static74.anInt920 = 2;
				Static57.aClass2_Sub9_Sub1_2.method673(178);
				Static57.aClass2_Sub9_Sub1_2.method616(local26);
			}
		}
		if (local14 == 41) {
			Static57.aClass2_Sub9_Sub1_2.method673(116);
			Static57.aClass2_Sub9_Sub1_2.method616(local18);
			Static57.aClass2_Sub9_Sub1_2.method624(local10);
			Static57.aClass2_Sub9_Sub1_2.method657(local26);
			Static124.anInt2887 = 0;
			Static115.aClass2_Sub13_15 = Static55.method972(local10);
			Static7.anInt199 = local18;
		}
		if (local14 == 35) {
			local432 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local26];
			if (local432 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local432.anIntArray180[0], local432.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static124.anInt2881 = 0;
				Static74.anInt920 = 2;
				Static65.anInt1730 = Static103.anInt2511;
				Static12.anInt3049 = Static41.anInt1096;
				Static57.aClass2_Sub9_Sub1_2.method673(63);
				Static57.aClass2_Sub9_Sub1_2.method645(local26);
			}
		}
		if (local14 == 14) {
			Static57.aClass2_Sub9_Sub1_2.method673(243);
			Static57.aClass2_Sub9_Sub1_2.method646(local18);
			Static57.aClass2_Sub9_Sub1_2.method620(local10);
			Static57.aClass2_Sub9_Sub1_2.method645(local26);
			Static124.anInt2887 = 0;
			Static115.aClass2_Sub13_15 = Static55.method972(local10);
			Static7.anInt199 = local18;
		}
		if (local14 == 50) {
			local432 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local26];
			if (local432 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local432.anIntArray180[0], local432.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static12.anInt3049 = Static41.anInt1096;
				Static124.anInt2881 = 0;
				Static74.anInt920 = 2;
				Static65.anInt1730 = Static103.anInt2511;
				Static57.aClass2_Sub9_Sub1_2.method673(102);
				Static57.aClass2_Sub9_Sub1_2.method657(local26);
			}
		}
		if (local14 == 51) {
			Static57.aClass2_Sub9_Sub1_2.method673(108);
			Static57.aClass2_Sub9_Sub1_2.method657(local18);
			Static57.aClass2_Sub9_Sub1_2.method620(local10);
			Static57.aClass2_Sub9_Sub1_2.method646(local26);
			Static124.anInt2887 = 0;
			Static115.aClass2_Sub13_15 = Static55.method972(local10);
			Static7.anInt199 = local18;
		}
		if (local14 == 48) {
			local125 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local26];
			if (local125 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local125.anIntArray180[0], local125.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static74.anInt920 = 2;
				Static65.anInt1730 = Static103.anInt2511;
				Static12.anInt3049 = Static41.anInt1096;
				Static124.anInt2881 = 0;
				Static57.aClass2_Sub9_Sub1_2.method673(236);
				Static57.aClass2_Sub9_Sub1_2.method616(local26);
			}
		}
		if (local14 == 28) {
			Static57.aClass2_Sub9_Sub1_2.method673(164);
			Static57.aClass2_Sub9_Sub1_2.method646(local26);
			Static57.aClass2_Sub9_Sub1_2.method616(local18);
			Static57.aClass2_Sub9_Sub1_2.method624(local10);
			Static124.anInt2887 = 0;
			Static115.aClass2_Sub13_15 = Static55.method972(local10);
			Static7.anInt199 = local18;
		}
		if (local14 == 4 && Static129.method2141(local18, local26, local10)) {
			Static57.aClass2_Sub9_Sub1_2.method673(75);
			Static57.aClass2_Sub9_Sub1_2.method645(local26 >> 14 & 0x7FFF);
			Static57.aClass2_Sub9_Sub1_2.method645(local10 + Static29.anInt720);
			Static57.aClass2_Sub9_Sub1_2.method657(Static112.anInt2612);
			Static57.aClass2_Sub9_Sub1_2.method657(local18 + Static107.anInt2546);
			Static57.aClass2_Sub9_Sub1_2.method616(Static65.anInt1729);
			Static57.aClass2_Sub9_Sub1_2.method631(Static73.anInt1924);
		}
		if (local14 == 18) {
			Static57.aClass2_Sub9_Sub1_2.method673(23);
			Static57.aClass2_Sub9_Sub1_2.method646(local18);
			Static57.aClass2_Sub9_Sub1_2.method631(local10);
			Static57.aClass2_Sub9_Sub1_2.method616(local26);
			Static124.anInt2887 = 0;
			Static115.aClass2_Sub13_15 = Static55.method972(local10);
			Static7.anInt199 = local18;
		}
		if (local14 == 2) {
			local125 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local26];
			if (local125 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local125.anIntArray180[0], local125.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static74.anInt920 = 2;
				Static124.anInt2881 = 0;
				Static12.anInt3049 = Static41.anInt1096;
				Static65.anInt1730 = Static103.anInt2511;
				Static57.aClass2_Sub9_Sub1_2.method673(58);
				Static57.aClass2_Sub9_Sub1_2.method645(local26);
				Static57.aClass2_Sub9_Sub1_2.method645(Static65.anInt1729);
				Static57.aClass2_Sub9_Sub1_2.method657(Static112.anInt2612);
				Static57.aClass2_Sub9_Sub1_2.method631(Static73.anInt1924);
			}
		}
		if (local14 == 21) {
			Static57.aClass2_Sub9_Sub1_2.method673(176);
			Static57.aClass2_Sub9_Sub1_2.method620(local10);
			Static57.aClass2_Sub9_Sub1_2.method645(local26);
			Static57.aClass2_Sub9_Sub1_2.method616(local18);
			Static124.anInt2887 = 0;
			Static115.aClass2_Sub13_15 = Static55.method972(local10);
			Static7.anInt199 = local18;
		}
		if (local14 == 33) {
			Static57.aClass2_Sub9_Sub1_2.method673(31);
			Static57.aClass2_Sub9_Sub1_2.method616(local26);
			Static57.aClass2_Sub9_Sub1_2.method631(local10);
			Static57.aClass2_Sub9_Sub1_2.method645(Static32.anInt773);
			Static57.aClass2_Sub9_Sub1_2.method616(local18);
			Static57.aClass2_Sub9_Sub1_2.method631(Static8.anInt206);
			Static124.anInt2887 = 0;
			Static115.aClass2_Sub13_15 = Static55.method972(local10);
			Static7.anInt199 = local18;
		}
		if (local14 == 45) {
			local125 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local26];
			if (local125 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local125.anIntArray180[0], local125.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static65.anInt1730 = Static103.anInt2511;
				Static124.anInt2881 = 0;
				Static12.anInt3049 = Static41.anInt1096;
				Static74.anInt920 = 2;
				Static57.aClass2_Sub9_Sub1_2.method673(174);
				Static57.aClass2_Sub9_Sub1_2.method616(Static32.anInt773);
				Static57.aClass2_Sub9_Sub1_2.method624(Static8.anInt206);
				Static57.aClass2_Sub9_Sub1_2.method645(local26);
			}
		}
		if (local14 == 29) {
			local704 = Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 0, 0, 0, local10, local18, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
			if (!local704) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local10, local18, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
			}
			Static12.anInt3049 = Static41.anInt1096;
			Static74.anInt920 = 2;
			Static65.anInt1730 = Static103.anInt2511;
			Static124.anInt2881 = 0;
			Static57.aClass2_Sub9_Sub1_2.method673(94);
			Static57.aClass2_Sub9_Sub1_2.method646(local10 + Static29.anInt720);
			Static57.aClass2_Sub9_Sub1_2.method616(local26);
			Static57.aClass2_Sub9_Sub1_2.method616(local18 + Static107.anInt2546);
		}
		if (local14 == 12) {
			local704 = Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 0, 0, 0, local10, local18, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
			if (!local704) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local10, local18, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
			}
			Static65.anInt1730 = Static103.anInt2511;
			Static124.anInt2881 = 0;
			Static74.anInt920 = 2;
			Static12.anInt3049 = Static41.anInt1096;
			Static57.aClass2_Sub9_Sub1_2.method673(105);
			Static57.aClass2_Sub9_Sub1_2.method616(Static112.anInt2612);
			Static57.aClass2_Sub9_Sub1_2.method624(Static73.anInt1924);
			Static57.aClass2_Sub9_Sub1_2.method646(local26);
			Static57.aClass2_Sub9_Sub1_2.method616(local18 + Static107.anInt2546);
			Static57.aClass2_Sub9_Sub1_2.method645(Static29.anInt720 + local10);
			Static57.aClass2_Sub9_Sub1_2.method616(Static65.anInt1729);
		}
		if (local14 == 25) {
			local125 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local26];
			if (local125 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local125.anIntArray180[0], local125.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static124.anInt2881 = 0;
				Static74.anInt920 = 2;
				Static65.anInt1730 = Static103.anInt2511;
				Static12.anInt3049 = Static41.anInt1096;
				Static57.aClass2_Sub9_Sub1_2.method673(28);
				Static57.aClass2_Sub9_Sub1_2.method657(local26);
			}
		}
		if (local14 == 34) {
			Static57.aClass2_Sub9_Sub1_2.method673(233);
			Static57.aClass2_Sub9_Sub1_2.method657(local18);
			Static57.aClass2_Sub9_Sub1_2.method657(local26);
			Static57.aClass2_Sub9_Sub1_2.method620(local10);
			Static124.anInt2887 = 0;
			Static115.aClass2_Sub13_15 = Static55.method972(local10);
			Static7.anInt199 = local18;
		}
		if (local14 == 44) {
			local704 = Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 0, 0, 0, local10, local18, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
			if (!local704) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local10, local18, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
			}
			Static74.anInt920 = 2;
			Static65.anInt1730 = Static103.anInt2511;
			Static12.anInt3049 = Static41.anInt1096;
			Static124.anInt2881 = 0;
			Static57.aClass2_Sub9_Sub1_2.method673(185);
			Static57.aClass2_Sub9_Sub1_2.method616(local26);
			Static57.aClass2_Sub9_Sub1_2.method616(local10 + Static29.anInt720);
			Static57.aClass2_Sub9_Sub1_2.method657(Static107.anInt2546 + local18);
		}
		if (local14 == 32) {
			Static57.aClass2_Sub9_Sub1_2.method673(145);
			Static57.aClass2_Sub9_Sub1_2.method616(local18);
			Static57.aClass2_Sub9_Sub1_2.method645(local26);
			Static57.aClass2_Sub9_Sub1_2.method620(local10);
			Static124.anInt2887 = 0;
			Static115.aClass2_Sub13_15 = Static55.method972(local10);
			Static7.anInt199 = local18;
		}
		if (local14 == 58) {
			local704 = Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 0, 0, 0, local10, local18, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
			if (!local704) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local10, local18, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
			}
			Static65.anInt1730 = Static103.anInt2511;
			Static74.anInt920 = 2;
			Static12.anInt3049 = Static41.anInt1096;
			Static124.anInt2881 = 0;
			Static57.aClass2_Sub9_Sub1_2.method673(101);
			Static57.aClass2_Sub9_Sub1_2.method646(local10 + Static29.anInt720);
			Static57.aClass2_Sub9_Sub1_2.method657(local26);
			Static57.aClass2_Sub9_Sub1_2.method646(local18 + Static107.anInt2546);
			Static57.aClass2_Sub9_Sub1_2.method657(Static32.anInt773);
			Static57.aClass2_Sub9_Sub1_2.method631(Static8.anInt206);
		}
		if (local14 == 1006) {
			Static74.anInt920 = 2;
			Static124.anInt2881 = 0;
			Static65.anInt1730 = Static103.anInt2511;
			Static12.anInt3049 = Static41.anInt1096;
			Static57.aClass2_Sub9_Sub1_2.method673(242);
			Static57.aClass2_Sub9_Sub1_2.method616(local26 >> 14 & 0x7FFF);
		}
		if (local14 == 46) {
			local35 = Static55.method972(local10);
			@Pc(2442) boolean local2442 = true;
			if (local35.anInt1586 > 0) {
				local2442 = Static86.method2170(local35);
			}
			if (local2442) {
				Static57.aClass2_Sub9_Sub1_2.method673(121);
				Static57.aClass2_Sub9_Sub1_2.method620(local10);
			}
		}
		if (local14 == 8) {
			local432 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local26];
			if (local432 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local432.anIntArray180[0], local432.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static12.anInt3049 = Static41.anInt1096;
				Static74.anInt920 = 2;
				Static65.anInt1730 = Static103.anInt2511;
				Static124.anInt2881 = 0;
				Static57.aClass2_Sub9_Sub1_2.method673(237);
				Static57.aClass2_Sub9_Sub1_2.method645(Static112.anInt2612);
				Static57.aClass2_Sub9_Sub1_2.method646(Static65.anInt1729);
				Static57.aClass2_Sub9_Sub1_2.method624(Static73.anInt1924);
				Static57.aClass2_Sub9_Sub1_2.method646(local26);
			}
		}
		if (local14 == 1003) {
			local35 = Static55.method972(local10);
			if (local35 == null || local35.anIntArray154[local18] < 100000) {
				Static57.aClass2_Sub9_Sub1_2.method673(217);
				Static57.aClass2_Sub9_Sub1_2.method616(local26);
			} else {
				Static72.method1228(Static40.method722(new Class40[] { Static49.method886(local35.anIntArray154[local18]), Static23.aClass40_371, Static102.method1800(local26).aClass40_1161 }), Static43.aClass40_568, 0);
			}
			Static124.anInt2887 = 0;
			Static115.aClass2_Sub13_15 = Static55.method972(local10);
			Static7.anInt199 = local18;
		}
		if (local14 == 20) {
			local432 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local26];
			if (local432 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local432.anIntArray180[0], local432.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static124.anInt2881 = 0;
				Static12.anInt3049 = Static41.anInt1096;
				Static74.anInt920 = 2;
				Static65.anInt1730 = Static103.anInt2511;
				Static57.aClass2_Sub9_Sub1_2.method673(244);
				Static57.aClass2_Sub9_Sub1_2.method646(local26);
			}
		}
		if (local14 == 10 || local14 == 1004) {
			Static69.method1238(local18, Static25.aClass40Array1[arg0], local10, local26);
		}
		if (local14 == 38) {
			Static57.aClass2_Sub9_Sub1_2.method673(121);
			Static57.aClass2_Sub9_Sub1_2.method620(local10);
			local35 = Static55.method972(local10);
			if (local35.anIntArrayArray15 != null && local35.anIntArrayArray15[0][0] == 5) {
				local208 = local35.anIntArrayArray15[0][1];
				Static35.anIntArray96[local208] = 1 - Static35.anIntArray96[local208];
				Static48.method871(local208);
			}
		}
		if (local14 == 42) {
			local432 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local26];
			if (local432 != null) {
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local432.anIntArray180[0], local432.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				Static12.anInt3049 = Static41.anInt1096;
				Static124.anInt2881 = 0;
				Static74.anInt920 = 2;
				Static65.anInt1730 = Static103.anInt2511;
				Static57.aClass2_Sub9_Sub1_2.method673(225);
				Static57.aClass2_Sub9_Sub1_2.method616(local26);
			}
		}
		if (local14 == 1) {
			Static129.method2141(local18, local26, local10);
			Static57.aClass2_Sub9_Sub1_2.method673(255);
			Static57.aClass2_Sub9_Sub1_2.method657(Static29.anInt720 + local10);
			Static57.aClass2_Sub9_Sub1_2.method657(local18 + Static107.anInt2546);
			Static57.aClass2_Sub9_Sub1_2.method657(local26 >> 14 & 0x7FFF);
		}
		if (local14 == 1001) {
			Static65.anInt1730 = Static103.anInt2511;
			Static124.anInt2881 = 0;
			Static74.anInt920 = 2;
			Static12.anInt3049 = Static41.anInt1096;
			local125 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local26];
			if (local125 != null) {
				@Pc(2848) Class2_Sub1_Sub11 local2848 = local125.aClass2_Sub1_Sub11_1;
				if (local2848.anIntArray255 != null) {
					local2848 = local2848.method1665();
				}
				if (local2848 != null) {
					Static57.aClass2_Sub9_Sub1_2.method673(38);
					Static57.aClass2_Sub9_Sub1_2.method657(local2848.anInt2344);
				}
			}
		}
		if (Static111.anInt2597 != 0) {
			Static111.anInt2597 = 0;
			Static17.method316(Static55.method972(Static73.anInt1924));
		}
		if (Static31.aBoolean53) {
			Static125.method2080();
		}
		if (Static115.aClass2_Sub13_15 != null && Static124.anInt2887 == 0) {
			Static17.method316(Static115.aClass2_Sub13_15);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BILclient!fd;)Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1 method376(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		return Static67.method1180(arg1, arg0) ? Static25.method420() : null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method377() {
		aClass3_4 = null;
		aClass24_7 = null;
		anIntArray70 = null;
		aClass40_329 = null;
		aClass2_Sub9_2 = null;
		anIntArray71 = null;
		aShortArray3 = null;
		aClass40_328 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ta;I)V")
	public static void method378(@OriginalArg(0) Class2_Sub1_Sub1_Sub3 arg0) {
		arg0.aBoolean134 = false;
		@Pc(22) Class2_Sub1_Sub7 local22;
		if (arg0.anInt1790 != -1) {
			local22 = Static40.method724(arg0.anInt1790);
			if (local22 == null || local22.anIntArray212 == null) {
				arg0.anInt1790 = -1;
			} else {
				arg0.anInt1809++;
				if (arg0.anInt1802 < local22.anIntArray212.length && local22.anIntArray210[arg0.anInt1802] < arg0.anInt1809) {
					arg0.anInt1809 = 1;
					arg0.anInt1802++;
					Static10.method2134(arg0.anInt1802, arg0.anInt1788, arg0.anInt1792, local22);
				}
				if (local22.anIntArray212.length <= arg0.anInt1802) {
					arg0.anInt1809 = 0;
					arg0.anInt1802 = 0;
					Static10.method2134(arg0.anInt1802, arg0.anInt1788, arg0.anInt1792, local22);
				}
			}
		}
		if (arg0.anInt1816 != -1 && arg0.anInt1811 <= Static28.anInt704) {
			if (arg0.anInt1774 < 0) {
				arg0.anInt1774 = 0;
			}
			@Pc(123) int local123 = Static63.method291(arg0.anInt1816).anInt2810;
			if (local123 == -1) {
				arg0.anInt1816 = -1;
			} else {
				@Pc(135) Class2_Sub1_Sub7 local135 = Static40.method724(local123);
				if (local135 == null || local135.anIntArray212 == null) {
					arg0.anInt1816 = -1;
				} else {
					arg0.anInt1795++;
					if (local135.anIntArray212.length > arg0.anInt1774 && arg0.anInt1795 > local135.anIntArray210[arg0.anInt1774]) {
						arg0.anInt1795 = 1;
						arg0.anInt1774++;
						Static10.method2134(arg0.anInt1774, arg0.anInt1788, arg0.anInt1792, local135);
					}
					if (local135.anIntArray212.length <= arg0.anInt1774 && (arg0.anInt1774 < 0 || arg0.anInt1774 >= local135.anIntArray212.length)) {
						arg0.anInt1816 = -1;
					}
				}
			}
		}
		if (arg0.anInt1817 != -1 && arg0.anInt1814 <= 1) {
			local22 = Static40.method724(arg0.anInt1817);
			if (local22.anInt1980 == 1 && arg0.anInt1782 > 0 && arg0.anInt1787 <= Static28.anInt704 && arg0.anInt1784 < Static28.anInt704) {
				arg0.anInt1814 = 1;
				return;
			}
		}
		if (arg0.anInt1817 != -1 && arg0.anInt1814 == 0) {
			local22 = Static40.method724(arg0.anInt1817);
			if (local22 == null || local22.anIntArray212 == null) {
				arg0.anInt1817 = -1;
			} else {
				arg0.anInt1769++;
				if (arg0.anInt1804 < local22.anIntArray212.length && local22.anIntArray210[arg0.anInt1804] < arg0.anInt1769) {
					arg0.anInt1769 = 1;
					arg0.anInt1804++;
					Static10.method2134(arg0.anInt1804, arg0.anInt1788, arg0.anInt1792, local22);
				}
				if (arg0.anInt1804 >= local22.anIntArray212.length) {
					arg0.anInt1804 -= local22.anInt1974;
					arg0.anInt1776++;
					if (arg0.anInt1776 >= local22.anInt1975) {
						arg0.anInt1817 = -1;
					} else if (arg0.anInt1804 >= 0 && local22.anIntArray212.length > arg0.anInt1804) {
						Static10.method2134(arg0.anInt1804, arg0.anInt1788, arg0.anInt1792, local22);
					} else {
						arg0.anInt1817 = -1;
					}
				}
				arg0.aBoolean134 = local22.aBoolean146;
			}
		}
		if (arg0.anInt1814 > 0) {
			arg0.anInt1814--;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method379() {
		if (Static34.aBoolean60 && Static105.anInt2531 != Static1.anInt8) {
			Static133.method2219(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], Static105.anInt2531, Static134.anInt1646, Static134.anInt1648, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0]);
		} else if (Static105.anInt2531 != Static46.anInt1215) {
			Static46.anInt1215 = Static105.anInt2531;
			Static129.method2135(Static105.anInt2531);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)I")
	public static int method380(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}
}
