import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	public static int anInt1797;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!rb;")
	public static Class60 aClass60_54 = new Class60(64);

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "Lclient!sc;")
	public static Class66 aClass66_936 = Static106.method1849("<)4col>");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method1249() {
		@Pc(25) int local25;
		if (Static126.anInt2877 == 0) {
			Static129.aClass9_1 = new Class9(4, 104, 104, Static44.anIntArrayArrayArray3);
			for (local25 = 0; local25 < 4; local25++) {
				Static83.aClass13Array1[local25] = new Class13(104, 104);
			}
			Static131.aClass1_Sub1_Sub2_Sub1_14 = new Class1_Sub1_Sub2_Sub1(512, 512);
			Static126.anInt2877 = 20;
			Static109.aClass66_1462 = Static3.aClass66_120;
			Static11.anInt397 = 5;
			return;
		}
		@Pc(62) int local62;
		@Pc(73) int local73;
		@Pc(79) int local79;
		@Pc(83) int local83;
		if (Static126.anInt2877 == 20) {
			@Pc(60) int[] local60 = new int[9];
			for (local62 = 0; local62 < 9; local62++) {
				local73 = local62 * 32 + 128 + 15;
				local79 = local73 * 3 + 600;
				local83 = Class1_Sub1_Sub2_Sub4.anIntArray399[local73];
				local60[local62] = local79 * local83 >> 16;
			}
			Static10.method310(local60);
			Static109.aClass66_1462 = Static56.aClass66_930;
			Static11.anInt397 = 10;
			Static126.anInt2877 = 30;
		} else if (Static126.anInt2877 == 30) {
			Static97.aClass5_Sub1_25 = Static129.method2038(true, false, true, 0);
			Static68.aClass5_Sub1_19 = Static129.method2038(true, false, true, 1);
			Static53.aClass5_Sub1_17 = Static129.method2038(true, true, false, 2);
			Static122.aClass5_Sub1_29 = Static129.method2038(true, false, true, 3);
			Static86.aClass5_Sub1_23 = Static129.method2038(true, false, true, 4);
			Static1.aClass5_Sub1_3 = Static129.method2038(true, true, true, 5);
			Static28.aClass5_Sub1_8 = Static129.method2038(false, true, true, 6);
			Static96.aClass5_Sub1_24 = Static129.method2038(true, false, true, 7);
			Static112.aClass5_Sub1_26 = Static129.method2038(true, false, true, 8);
			Static43.aClass5_Sub1_16 = Static129.method2038(true, false, true, 9);
			Static9.aClass5_Sub1_6 = Static129.method2038(true, false, true, 10);
			Static121.aClass5_Sub1_28 = Static129.method2038(true, false, true, 11);
			Static76.aClass5_Sub1_20 = Static129.method2038(true, false, true, 12);
			Static73.aClass5_Sub1_21 = Static129.method2038(true, true, false, 13);
			Static8.aClass5_Sub1_5 = Static129.method2038(false, false, true, 14);
			Static131.aClass5_Sub1_27 = Static129.method2038(true, false, true, 15);
			Static109.aClass66_1462 = Static97.aClass66_1376;
			Static126.anInt2877 = 40;
			Static11.anInt397 = 20;
		} else if (Static126.anInt2877 == 40) {
			local25 = Static97.aClass5_Sub1_25.method141() * 4 / 100;
			local25 += Static68.aClass5_Sub1_19.method141() * 4 / 100;
			local25 += Static53.aClass5_Sub1_17.method141() * 2 / 100;
			local25 += Static122.aClass5_Sub1_29.method141() * 2 / 100;
			local25 += Static86.aClass5_Sub1_23.method141() * 6 / 100;
			local25 += Static1.aClass5_Sub1_3.method141() * 4 / 100;
			local25 += Static28.aClass5_Sub1_8.method141() * 2 / 100;
			local25 += Static96.aClass5_Sub1_24.method141() * 60 / 100;
			local25 += Static112.aClass5_Sub1_26.method141() * 2 / 100;
			local25 += Static43.aClass5_Sub1_16.method141() * 2 / 100;
			local25 += Static9.aClass5_Sub1_6.method141() * 2 / 100;
			local25 += Static121.aClass5_Sub1_28.method141() * 2 / 100;
			local25 += Static76.aClass5_Sub1_20.method141() * 2 / 100;
			local25 += Static73.aClass5_Sub1_21.method141() * 2 / 100;
			local25 += Static8.aClass5_Sub1_5.method141() * 2 / 100;
			local25 += Static131.aClass5_Sub1_27.method141() * 2 / 100;
			if (local25 == 100) {
				Static11.anInt397 = 30;
				Static109.aClass66_1462 = Static105.aClass66_1435;
				Static126.anInt2877 = 45;
			} else {
				if (local25 != 0) {
					Static109.aClass66_1462 = Static41.method897(new Class66[] { Static23.aClass66_420, Static88.method1632(local25), Static101.aClass66_1395 });
				}
				Static11.anInt397 = 30;
			}
		} else if (Static126.anInt2877 == 45) {
			Static4.method133(!Static87.aBoolean96);
			@Pc(449) Class1_Sub9_Sub1 local449 = new Class1_Sub9_Sub1();
			local449.method841();
			Static20.aClass24_1 = Static45.method1021(Static104.aCanvas1, 22050, Static120.aClass7_4, 0);
			Static20.aClass24_1.method1471(local449);
			Static82.method1502(Static86.aClass5_Sub1_23, Static131.aClass5_Sub1_27, Static8.aClass5_Sub1_5, local449);
			Static101.aClass24_2 = Static45.method1021(Static104.aCanvas1, 2048, Static120.aClass7_4, 1);
			Static73.aClass1_Sub9_Sub2_3 = new Class1_Sub9_Sub2();
			Static101.aClass24_2.method1471(Static73.aClass1_Sub9_Sub2_3);
			Static58.aClass12_1 = new Class12(22050, Static39.anInt1014);
			Static11.anInt397 = 35;
			Static109.aClass66_1462 = Static2.aClass66_92;
			Static126.anInt2877 = 50;
		} else if (Static126.anInt2877 == 50) {
			local25 = 0;
			if (Static101.aClass1_Sub1_Sub2_Sub2_Sub1_3 == null) {
				Static101.aClass1_Sub1_Sub2_Sub2_Sub1_3 = Static59.method1280(Static73.aClass5_Sub1_21, Static13.aClass66_284, Static112.aClass5_Sub1_26, Static38.aClass66_1675);
			} else {
				local25++;
			}
			if (Static114.aClass1_Sub1_Sub2_Sub2_Sub1_4 == null) {
				Static114.aClass1_Sub1_Sub2_Sub2_Sub1_4 = Static59.method1280(Static73.aClass5_Sub1_21, Static13.aClass66_284, Static112.aClass5_Sub1_26, Static111.aClass66_1517);
			} else {
				local25++;
			}
			if (Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1 == null) {
				Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1 = Static59.method1280(Static73.aClass5_Sub1_21, Static13.aClass66_284, Static112.aClass5_Sub1_26, Static121.aClass66_1648);
			} else {
				local25++;
			}
			if (local25 < 3) {
				Static109.aClass66_1462 = Static41.method897(new Class66[] { Static76.aClass66_1133, Static88.method1632(local25 * 100 / 3), Static101.aClass66_1395 });
				Static11.anInt397 = 40;
			} else {
				Static126.anInt2877 = 60;
				Static109.aClass66_1462 = Static29.aClass66_463;
				Static11.anInt397 = 40;
			}
		} else if (Static126.anInt2877 == 60) {
			local25 = Static40.method928(Static9.aClass5_Sub1_6, Static112.aClass5_Sub1_26);
			local62 = Static111.method1871();
			if (local62 > local25) {
				Static109.aClass66_1462 = Static41.method897(new Class66[] { Static45.aClass66_771, Static88.method1632(local25 * 100 / local62), Static101.aClass66_1395 });
				Static11.anInt397 = 50;
			} else {
				Static109.aClass66_1462 = Static52.aClass66_858;
				Static11.anInt397 = 50;
				Static18.method468(5);
				Static126.anInt2877 = 70;
			}
		} else if (Static126.anInt2877 == 70) {
			if (Static53.aClass5_Sub1_17.method112()) {
				Static108.method125(Static53.aClass5_Sub1_17);
				Static129.method2037(Static53.aClass5_Sub1_17);
				Static17.method451(Static53.aClass5_Sub1_17, Static96.aClass5_Sub1_24);
				Static75.method1444(Static96.aClass5_Sub1_24, Static53.aClass5_Sub1_17, Static87.aBoolean96);
				Static85.method1541(Static53.aClass5_Sub1_17, Static96.aClass5_Sub1_24);
				Static65.method1368(Static96.aClass5_Sub1_24, Static101.aClass1_Sub1_Sub2_Sub2_Sub1_3, Static32.aBoolean35, Static53.aClass5_Sub1_17);
				Static114.method1927(Static68.aClass5_Sub1_19, Static97.aClass5_Sub1_25, Static53.aClass5_Sub1_17);
				Static127.method2025(Static96.aClass5_Sub1_24, Static53.aClass5_Sub1_17);
				Static44.method966(Static53.aClass5_Sub1_17);
				Static22.method506(Static53.aClass5_Sub1_17);
				Static120.method1966(Static73.aClass5_Sub1_21, Static96.aClass5_Sub1_24, Static122.aClass5_Sub1_29, Static112.aClass5_Sub1_26);
				Static70.method538(Static53.aClass5_Sub1_17);
				Static61.method1304(Static53.aClass5_Sub1_17);
				Static109.aClass66_1462 = Static24.aClass66_426;
				Static11.anInt397 = 60;
				Static126.anInt2877 = 80;
			} else {
				Static109.aClass66_1462 = Static41.method897(new Class66[] { Static101.aClass66_1398, Static88.method1632(Static53.aClass5_Sub1_17.method135()), Static101.aClass66_1395 });
				Static11.anInt397 = 60;
			}
		} else if (Static126.anInt2877 == 80) {
			local25 = 0;
			if (Static99.aClass1_Sub1_Sub2_Sub1_11 == null) {
				Static99.aClass1_Sub1_Sub2_Sub1_11 = Static86.method1612(Static13.aClass66_284, Static98.aClass66_1387, Static112.aClass5_Sub1_26);
			} else {
				local25++;
			}
			if (Static35.aClass1_Sub1_Sub2_Sub1_8 == null) {
				Static35.aClass1_Sub1_Sub2_Sub1_8 = Static86.method1612(Static13.aClass66_284, Static133.aClass66_1742, Static112.aClass5_Sub1_26);
			} else {
				local25++;
			}
			if (Static77.aClass1_Sub1_Sub2_Sub3Array8 == null) {
				Static77.aClass1_Sub1_Sub2_Sub3Array8 = Static40.method932(Static5.aClass66_158, Static112.aClass5_Sub1_26, Static13.aClass66_284);
			} else {
				local25++;
			}
			if (Static102.aClass1_Sub1_Sub2_Sub1Array61 == null) {
				Static102.aClass1_Sub1_Sub2_Sub1Array61 = Static51.method1091(Static76.aClass66_1137, Static13.aClass66_284, Static112.aClass5_Sub1_26);
			} else {
				local25++;
			}
			if (Static17.aClass1_Sub1_Sub2_Sub1Array15 == null) {
				Static17.aClass1_Sub1_Sub2_Sub1Array15 = Static51.method1091(Static28.aClass66_457, Static13.aClass66_284, Static112.aClass5_Sub1_26);
			} else {
				local25++;
			}
			if (Static45.aClass1_Sub1_Sub2_Sub1Array31 == null) {
				Static45.aClass1_Sub1_Sub2_Sub1Array31 = Static51.method1091(Static89.aClass66_1301, Static13.aClass66_284, Static112.aClass5_Sub1_26);
			} else {
				local25++;
			}
			if (Static92.aClass1_Sub1_Sub2_Sub1Array57 == null) {
				Static92.aClass1_Sub1_Sub2_Sub1Array57 = Static51.method1091(Static18.aClass66_346, Static13.aClass66_284, Static112.aClass5_Sub1_26);
			} else {
				local25++;
			}
			if (Static83.aClass1_Sub1_Sub2_Sub1Array48 == null) {
				Static83.aClass1_Sub1_Sub2_Sub1Array48 = Static51.method1091(Static133.aClass66_1735, Static13.aClass66_284, Static112.aClass5_Sub1_26);
			} else {
				local25++;
			}
			if (Static84.aClass1_Sub1_Sub2_Sub1Array50 == null) {
				Static84.aClass1_Sub1_Sub2_Sub1Array50 = Static51.method1091(Static70.aClass66_444, Static13.aClass66_284, Static112.aClass5_Sub1_26);
			} else {
				local25++;
			}
			if (Static134.aClass1_Sub1_Sub2_Sub1Array71 == null) {
				Static134.aClass1_Sub1_Sub2_Sub1Array71 = Static51.method1091(Static133.aClass66_1737, Static13.aClass66_284, Static112.aClass5_Sub1_26);
			} else {
				local25++;
			}
			if (Static16.aClass1_Sub1_Sub2_Sub1Array14 == null) {
				Static16.aClass1_Sub1_Sub2_Sub1Array14 = Static51.method1091(Static39.aClass66_616, Static13.aClass66_284, Static112.aClass5_Sub1_26);
			} else {
				local25++;
			}
			if (Static96.aClass1_Sub1_Sub2_Sub3Array10 == null) {
				Static96.aClass1_Sub1_Sub2_Sub3Array10 = Static40.method932(Static61.aClass66_974, Static112.aClass5_Sub1_26, Static13.aClass66_284);
			} else {
				local25++;
			}
			if (Static56.aClass1_Sub1_Sub2_Sub3Array6 == null) {
				Static56.aClass1_Sub1_Sub2_Sub3Array6 = Static40.method932(Static66.aClass66_320, Static112.aClass5_Sub1_26, Static13.aClass66_284);
			} else {
				local25++;
			}
			if (Static92.aClass1_Sub1_Sub2_Sub3_3 == null) {
				Static92.aClass1_Sub1_Sub2_Sub3_3 = Static124.method2009(Static112.aClass5_Sub1_26, Static13.aClass66_284, Static127.aClass66_1695);
			} else {
				local25++;
			}
			if (local25 < 14) {
				Static109.aClass66_1462 = Static41.method897(new Class66[] { Static132.aClass66_1729, Static88.method1632(local25 * 100 / 14), Static101.aClass66_1395 });
				Static11.anInt397 = 70;
			} else {
				local73 = (int) (Math.random() * 21.0D) - 10;
				local62 = (int) (Math.random() * 21.0D) - 10;
				Static110.aClass1_Sub1_Sub2_Sub3Array5 = Static56.aClass1_Sub1_Sub2_Sub3Array6;
				local79 = (int) (Math.random() * 21.0D) - 10;
				Static35.aClass1_Sub1_Sub2_Sub1_8.method240();
				local83 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(949) int local949 = 0; local949 < Static102.aClass1_Sub1_Sub2_Sub1Array61.length; local949++) {
					Static102.aClass1_Sub1_Sub2_Sub1Array61[local949].method239(local83 + local62, local73 + local83, local79 + local83);
				}
				Static77.aClass1_Sub1_Sub2_Sub3Array8[0].method1000(local83 + local62, local73 - -local83, local79 + local83);
				Static108.method117();
				Static126.anInt2877 = 90;
				Static11.anInt397 = 70;
				Static109.aClass66_1462 = Static89.aClass66_1304;
			}
		} else if (Static126.anInt2877 == 90) {
			if (Static43.aClass5_Sub1_16.method112()) {
				@Pc(1041) Class57 local1041 = new Class57(Static43.aClass5_Sub1_16, Static112.aClass5_Sub1_26, 20, 0.8D, Static87.aBoolean96 ? 64 : 128);
				Static91.method1688(local1041);
				Static91.method1680(0.8D);
				Static126.anInt2877 = 110;
				Static11.anInt397 = 90;
				Static109.aClass66_1462 = Static16.aClass66_308;
			} else {
				Static109.aClass66_1462 = Static41.method897(new Class66[] { Static119.aClass66_1609, Static88.method1632(Static43.aClass5_Sub1_16.method135()), Static101.aClass66_1395 });
				Static11.anInt397 = 90;
			}
		} else if (Static126.anInt2877 == 110) {
			Static59.aClass58_1 = new Class58();
			Static120.aClass7_4.method285(Static59.aClass58_1, 10);
			Static109.aClass66_1462 = Static3.aClass66_118;
			Static126.anInt2877 = 120;
			Static11.anInt397 = 94;
		} else if (Static126.anInt2877 == 120) {
			if (Static9.aClass5_Sub1_6.method123(Static23.aClass66_415, Static13.aClass66_284)) {
				@Pc(1108) Class64 local1108 = new Class64(Static9.aClass5_Sub1_6.method113(Static13.aClass66_284, Static23.aClass66_415));
				Static80.method1491(local1108);
				Static11.anInt397 = 96;
				Static126.anInt2877 = 130;
				Static109.aClass66_1462 = Static67.aClass66_903;
			} else {
				Static109.aClass66_1462 = Static41.method897(new Class66[] { Static124.aClass66_1679, Static6.aClass66_195 });
				Static11.anInt397 = 96;
			}
		} else if (Static126.anInt2877 == 130) {
			if (!Static122.aClass5_Sub1_29.method112()) {
				Static109.aClass66_1462 = Static41.method897(new Class66[] { Static114.aClass66_1547, Static88.method1632(Static122.aClass5_Sub1_29.method135() * 4 / 5), Static101.aClass66_1395 });
				Static11.anInt397 = 100;
			} else if (!Static76.aClass5_Sub1_20.method112()) {
				Static109.aClass66_1462 = Static41.method897(new Class66[] { Static114.aClass66_1547, Static88.method1632(Static76.aClass5_Sub1_20.method135() / 6 + 80), Static101.aClass66_1395 });
				Static11.anInt397 = 100;
			} else if (Static73.aClass5_Sub1_21.method112()) {
				Static126.anInt2877 = 140;
				Static11.anInt397 = 100;
				Static109.aClass66_1462 = Static17.aClass66_343;
			} else {
				Static109.aClass66_1462 = Static41.method897(new Class66[] { Static114.aClass66_1547, Static88.method1632(Static73.aClass5_Sub1_21.method135() / 20 + 96), Static101.aClass66_1395 });
				Static11.anInt397 = 100;
			}
		} else if (Static126.anInt2877 == 140) {
			Static18.method468(10);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!he;III)V")
	public static void method1250(@OriginalArg(0) Class1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static35.aClass1_Sub10_6 != null || Static112.aBoolean113 || (arg0 == null || Static15.method2051(arg0) == null)) {
			return;
		}
		Static35.aClass1_Sub10_6 = arg0;
		Static29.aClass1_Sub10_5 = Static15.method2051(arg0);
		Static17.anInt566 = 0;
		Static19.aBoolean28 = false;
		Static19.anInt607 = arg1;
		Static120.anInt2784 = arg2;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
	public static void method1252() {
		aClass66_936 = null;
		aClass60_54 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!sf;II)[Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3[] method1253(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static80.method1490(arg0, arg2, arg1) ? Static28.method553() : null;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)V")
	public static void method1254() {
		if (Static92.aClass1_Sub10_11 != null || Static35.aClass1_Sub10_6 != null) {
			return;
		}
		@Pc(19) int local19 = Static97.anInt2474;
		@Pc(28) int local28;
		@Pc(30) int local30;
		@Pc(77) int local77;
		if (Static112.aBoolean113) {
			if (local19 != 1) {
				local28 = Static50.anInt1542;
				local30 = Static13.anInt462;
				if (local28 < Static79.anInt2166 - 10 || local28 > Static124.anInt2863 + Static79.anInt2166 + 10 || local30 < Static80.anInt2176 - 10 || Static73.anInt2120 + Static80.anInt2176 + 10 < local30) {
					Static112.aBoolean113 = false;
					Static14.method408(Static79.anInt2166, Static124.anInt2863, Static73.anInt2120, Static80.anInt2176);
				}
			}
			if (local19 == 1) {
				local28 = Static79.anInt2166;
				local30 = Static80.anInt2176;
				local77 = Static124.anInt2863;
				@Pc(79) int local79 = Static35.anInt866;
				@Pc(81) int local81 = Static6.anInt308;
				@Pc(83) int local83 = -1;
				for (@Pc(85) int local85 = 0; local85 < Static5.anInt228; local85++) {
					@Pc(99) int local99 = local30 + (Static5.anInt228 + -1 - local85) * 15 + 31;
					if (local28 < local79 && local28 + local77 > local79 && local81 > local99 - 13 && local81 < local99 + 3) {
						local83 = local85;
					}
				}
				if (local83 != -1) {
					Static19.method487(local83);
				}
				Static112.aBoolean113 = false;
				Static14.method408(Static79.anInt2166, Static124.anInt2863, Static73.anInt2120, Static80.anInt2176);
				return;
			}
			return;
		}
		if (local19 == 1 && Static5.anInt228 > 0) {
			local28 = Static98.anIntArray419[Static5.anInt228 - 1];
			if (local28 == 31 || local28 == 17 || local28 == 29 || local28 == 30 || local28 == 16 || local28 == 22 || local28 == 57 || local28 == 44 || local28 == 11 || local28 == 28 || local28 == 9 || local28 == 1002) {
				local30 = Static65.anIntArray311[Static5.anInt228 - 1];
				local77 = Static53.anIntArray247[Static5.anInt228 - 1];
				@Pc(227) Class1_Sub10 local227 = Static38.method2002(local77);
				if (Static112.method1882(Static61.method1301(local227)) || Static27.method548(Static61.method1301(local227))) {
					Static58.aBoolean72 = false;
					Static104.anInt2555 = 0;
					if (Static92.aClass1_Sub10_11 != null) {
						Static70.method537(Static92.aClass1_Sub10_11);
					}
					Static92.aClass1_Sub10_11 = Static38.method2002(local77);
					Static66.anInt538 = local30;
					Static2.anInt87 = Static6.anInt308;
					Static82.anInt2193 = Static35.anInt866;
					Static70.method537(Static92.aClass1_Sub10_11);
					return;
				}
			}
		}
		if (local19 == 1 && (Static39.anInt1007 == 1 && Static5.anInt228 > 2 || Static111.method1878(Static5.anInt228 - 1))) {
			local19 = 2;
		}
		if (local19 == 1 && Static5.anInt228 > 0) {
			Static19.method487(Static5.anInt228 - 1);
		}
		if (local19 != 2 || Static5.anInt228 <= 0) {
			return;
		}
		Static5.method160();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method1255() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(17) int local17 = 0; local17 < Static5.anInt228 - 1; local17++) {
				if (Static98.anIntArray419[local17] < 1000 && Static98.anIntArray419[local17 + 1] > 1000) {
					local7 = false;
					@Pc(37) Class66 local37 = Static84.aClass66Array18[local17];
					Static84.aClass66Array18[local17] = Static84.aClass66Array18[local17 + 1];
					Static84.aClass66Array18[local17 + 1] = local37;
					@Pc(55) Class66 local55 = Static97.aClass66Array21[local17];
					Static97.aClass66Array21[local17] = Static97.aClass66Array21[local17 + 1];
					Static97.aClass66Array21[local17 + 1] = local55;
					@Pc(73) int local73 = Static98.anIntArray419[local17];
					Static98.anIntArray419[local17] = Static98.anIntArray419[local17 + 1];
					Static98.anIntArray419[local17 + 1] = local73;
					@Pc(91) int local91 = Static65.anIntArray311[local17];
					Static65.anIntArray311[local17] = Static65.anIntArray311[local17 + 1];
					Static65.anIntArray311[local17 + 1] = local91;
					@Pc(109) int local109 = Static53.anIntArray247[local17];
					Static53.anIntArray247[local17] = Static53.anIntArray247[local17 + 1];
					Static53.anIntArray247[local17 + 1] = local109;
					@Pc(127) int local127 = Static33.anIntArray114[local17];
					Static33.anIntArray114[local17] = Static33.anIntArray114[local17 + 1];
					Static33.anIntArray114[local17 + 1] = local127;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public static void method1261() {
		@Pc(15) int local15 = Static133.aClass1_Sub12_Sub1_3.method1232(8);
		@Pc(20) int local20;
		if (local15 < Static111.anInt2653) {
			for (local20 = local15; local20 < Static111.anInt2653; local20++) {
				Static101.anIntArray421[Static77.anInt2149++] = Static51.anIntArray239[local20];
			}
		}
		if (local15 > Static111.anInt2653) {
			throw new RuntimeException("gppov1");
		}
		Static111.anInt2653 = 0;
		for (local20 = 0; local20 < local15; local20++) {
			@Pc(58) int local58 = Static51.anIntArray239[local20];
			@Pc(62) Class1_Sub1_Sub1_Sub5_Sub2 local62 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local58];
			@Pc(67) int local67 = Static133.aClass1_Sub12_Sub1_3.method1232(1);
			if (local67 == 0) {
				Static51.anIntArray239[Static111.anInt2653++] = local58;
				local62.anInt1285 = Static22.anInt636;
			} else {
				@Pc(90) int local90 = Static133.aClass1_Sub12_Sub1_3.method1232(2);
				if (local90 == 0) {
					Static51.anIntArray239[Static111.anInt2653++] = local58;
					local62.anInt1285 = Static22.anInt636;
					Static44.anIntArray207[Static101.anInt2503++] = local58;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local90 == 1) {
						Static51.anIntArray239[Static111.anInt2653++] = local58;
						local62.anInt1285 = Static22.anInt636;
						local135 = Static133.aClass1_Sub12_Sub1_3.method1232(3);
						local62.method926(false, local135);
						local145 = Static133.aClass1_Sub12_Sub1_3.method1232(1);
						if (local145 == 1) {
							Static44.anIntArray207[Static101.anInt2503++] = local58;
						}
					} else if (local90 == 2) {
						Static51.anIntArray239[Static111.anInt2653++] = local58;
						local62.anInt1285 = Static22.anInt636;
						local135 = Static133.aClass1_Sub12_Sub1_3.method1232(3);
						local62.method926(true, local135);
						local145 = Static133.aClass1_Sub12_Sub1_3.method1232(3);
						local62.method926(true, local145);
						@Pc(199) int local199 = Static133.aClass1_Sub12_Sub1_3.method1232(1);
						if (local199 == 1) {
							Static44.anIntArray207[Static101.anInt2503++] = local58;
						}
					} else if (local90 == 3) {
						Static101.anIntArray421[Static77.anInt2149++] = local58;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	public static void method1262(@OriginalArg(1) int arg0) {
		Static3.method76();
		Static117.method1944();
		@Pc(18) int local18 = Static66.method441(arg0).anInt1815;
		if (local18 == 0) {
			return;
		}
		@Pc(28) int local28 = Static103.anIntArray429[arg0];
		if (local18 == 1) {
			if (local28 == 1) {
				Static91.method1680(0.9D);
				((Class57) Static91.anInterface2_1).method1705(0.9D);
			}
			if (local28 == 2) {
				Static91.method1680(0.8D);
				((Class57) Static91.anInterface2_1).method1705(0.8D);
			}
			if (local28 == 3) {
				Static91.method1680(0.7D);
				((Class57) Static91.anInterface2_1).method1705(0.7D);
			}
			if (local28 == 4) {
				Static91.method1680(0.6D);
				((Class57) Static91.anInterface2_1).method1705(0.6D);
			}
			Static11.method363();
		}
		if (local18 == 3) {
			@Pc(86) short local86 = 0;
			if (local28 == 0) {
				local86 = 255;
			}
			if (local28 == 1) {
				local86 = 192;
			}
			if (local28 == 2) {
				local86 = 128;
			}
			if (local28 == 3) {
				local86 = 64;
			}
			if (local28 == 4) {
				local86 = 0;
			}
			if (Static124.anInt2862 != local86) {
				if (Static124.anInt2862 == 0 && Static117.anInt2749 != -1) {
					Static63.method1352(0, Static28.aClass5_Sub1_8, Static117.anInt2749, local86);
					Static53.aBoolean68 = false;
				} else if (local86 == 0) {
					Static27.method547();
					Static53.aBoolean68 = false;
				} else {
					Static28.method555(local86);
				}
				Static124.anInt2862 = local86;
			}
		}
		if (local18 == 4) {
			if (local28 == 0) {
				Static40.anInt1254 = 127;
			}
			if (local28 == 1) {
				Static40.anInt1254 = 96;
			}
			if (local28 == 2) {
				Static40.anInt1254 = 64;
			}
			if (local28 == 3) {
				Static40.anInt1254 = 32;
			}
			if (local28 == 4) {
				Static40.anInt1254 = 0;
			}
		}
		if (local18 == 10) {
			if (local28 == 0) {
				Static119.anInt2780 = 127;
			}
			if (local28 == 1) {
				Static119.anInt2780 = 96;
			}
			if (local28 == 2) {
				Static119.anInt2780 = 64;
			}
			if (local28 == 3) {
				Static119.anInt2780 = 32;
			}
			if (local28 == 4) {
				Static119.anInt2780 = 0;
			}
		}
		if (local18 == 6) {
			Static84.anInt2216 = local28;
		}
		if (local18 == 5) {
			Static39.anInt1007 = local28;
		}
		if (local18 == 9) {
			Static83.anInt2202 = local28;
		}
	}
}
