import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
	public static int anInt2535;

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "Lclient!na;")
	public static Class53 aClass53_1277 = Static109.method1737("sl_stars");

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "Lclient!na;")
	public static Class53 aClass53_1278 = Static109.method1737(" ");

	@OriginalMember(owner = "client!sd", name = "P", descriptor = "Lclient!na;")
	private static Class53 aClass53_1280 = Static109.method1737("shake:");

	@OriginalMember(owner = "client!sd", name = "O", descriptor = "Lclient!na;")
	public static Class53 aClass53_1279 = aClass53_1280;

	@OriginalMember(owner = "client!sd", name = "U", descriptor = "Lclient!na;")
	public static Class53 aClass53_1281 = Static109.method1737("titlebutton");

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "Lclient!na;")
	public static Class53 aClass53_1282 = aClass53_1280;

	@OriginalMember(owner = "client!sd", name = "W", descriptor = "Lclient!na;")
	public static Class53 aClass53_1283 = Static109.method1737(":: (X");

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
	public static int anInt2534 = -1;

	@OriginalMember(owner = "client!sd", name = "cb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1284 = Static109.method1737("Members only world");

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)[Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3[] method1751() {
		@Pc(4) Class3_Sub1_Sub5_Sub3[] local4 = new Class3_Sub1_Sub5_Sub3[Static87.anInt2101];
		for (@Pc(10) int local10 = 0; local10 < Static87.anInt2101; local10++) {
			@Pc(20) Class3_Sub1_Sub5_Sub3 local20 = local4[local10] = new Class3_Sub1_Sub5_Sub3();
			local20.anInt1169 = Static95.anInt2272;
			local20.anInt1171 = Static39.anInt1179;
			local20.anInt1170 = Static32.anIntArray116[local10];
			local20.anInt1172 = Static32.anIntArray117[local10];
			local20.anInt1168 = Static103.anIntArray321[local10];
			local20.anInt1167 = Static53.anIntArray273[local10];
			local20.anIntArray132 = Static97.anIntArray312;
			local20.aByteArray22 = Static7.aByteArrayArray1[local10];
		}
		Static68.method1179();
		return local4;
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
	public static void method1752() {
		if (Static23.aClass43_1 != null) {
			@Pc(8) Class43 local8 = Static23.aClass43_1;
			synchronized (Static23.aClass43_1) {
				Static23.aClass43_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V")
	public static void method1754() {
		aClass53_1283 = null;
		aByteArrayArrayArray19 = null;
		aClass53_1278 = null;
		aClass53_1279 = null;
		aClass53_1282 = null;
		aClass53_1284 = null;
		aClass53_1281 = null;
		aClass53_1277 = null;
		aClass53_1280 = null;
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)V")
	public static void method1755() {
		@Pc(20) int local20;
		if (Static106.anInt2446 == 0) {
			Static120.aClass39_1 = new Class39(4, 104, 104, Static107.anIntArrayArrayArray7);
			for (local20 = 0; local20 < 4; local20++) {
				Static90.aClass9Array1[local20] = new Class9(104, 104);
			}
			Static124.aClass3_Sub1_Sub5_Sub4_38 = new Class3_Sub1_Sub5_Sub4(512, 512);
			Static106.anInt2446 = 20;
			Static122.aClass53_1404 = Static30.aClass53_403;
			Static113.anInt2601 = 5;
			return;
		}
		@Pc(55) int local55;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (Static106.anInt2446 == 20) {
			@Pc(53) int[] local53 = new int[9];
			for (local55 = 0; local55 < 9; local55++) {
				local65 = local55 * 32 + 15 + 128;
				local71 = local65 * 3 + 600;
				local75 = Class3_Sub1_Sub5_Sub1.anIntArray86[local65];
				local53[local55] = local71 * local75 >> 16;
			}
			Static55.method1012(local53);
			Static113.anInt2601 = 10;
			Static106.anInt2446 = 30;
			Static122.aClass53_1404 = Static38.aClass53_499;
		} else if (Static106.anInt2446 == 30) {
			Static98.aClass62_Sub1_13 = Static9.method151(true, 0, true, false);
			Static108.aClass62_Sub1_16 = Static9.method151(true, 1, true, false);
			Static68.aClass62_Sub1_11 = Static9.method151(true, 2, false, true);
			Static16.aClass62_Sub1_4 = Static9.method151(true, 3, true, false);
			Static125.aClass62_Sub1_18 = Static9.method151(true, 4, true, false);
			Static7.aClass62_Sub1_2 = Static9.method151(true, 5, true, true);
			Static109.aClass62_Sub1_17 = Static9.method151(false, 6, true, true);
			Static9.aClass62_Sub1_3 = Static9.method151(true, 7, true, false);
			Static58.aClass62_Sub1_9 = Static9.method151(true, 8, true, false);
			Static7.aClass62_Sub1_1 = Static9.method151(true, 9, true, false);
			Static69.aClass62_Sub1_12 = Static9.method151(true, 10, true, false);
			Static66.aClass62_Sub1_10 = Static9.method151(true, 11, true, false);
			Static103.aClass62_Sub1_15 = Static9.method151(true, 12, true, false);
			Static45.aClass62_Sub1_8 = Static9.method151(true, 13, false, true);
			Static38.aClass62_Sub1_7 = Static9.method151(false, 14, true, false);
			Static18.aClass62_Sub1_5 = Static9.method151(true, 15, true, false);
			Static122.aClass53_1404 = Static45.aClass53_570;
			Static113.anInt2601 = 20;
			Static106.anInt2446 = 40;
		} else if (Static106.anInt2446 == 40) {
			local20 = Static98.aClass62_Sub1_13.method1528() * 4 / 100;
			local20 += Static108.aClass62_Sub1_16.method1528() * 4 / 100;
			local20 += Static68.aClass62_Sub1_11.method1528() * 2 / 100;
			local20 += Static16.aClass62_Sub1_4.method1528() * 2 / 100;
			local20 += Static125.aClass62_Sub1_18.method1528() * 6 / 100;
			local20 += Static7.aClass62_Sub1_2.method1528() * 4 / 100;
			local20 += Static109.aClass62_Sub1_17.method1528() * 2 / 100;
			local20 += Static9.aClass62_Sub1_3.method1528() * 60 / 100;
			local20 += Static58.aClass62_Sub1_9.method1528() * 2 / 100;
			local20 += Static7.aClass62_Sub1_1.method1528() * 2 / 100;
			local20 += Static69.aClass62_Sub1_12.method1528() * 2 / 100;
			local20 += Static66.aClass62_Sub1_10.method1528() * 2 / 100;
			local20 += Static103.aClass62_Sub1_15.method1528() * 2 / 100;
			local20 += Static45.aClass62_Sub1_8.method1528() * 2 / 100;
			local20 += Static38.aClass62_Sub1_7.method1528() * 2 / 100;
			local20 += Static18.aClass62_Sub1_5.method1528() * 2 / 100;
			if (local20 == 100) {
				Static113.anInt2601 = 30;
				Static106.anInt2446 = 45;
				Static122.aClass53_1404 = Static25.aClass53_331;
			} else {
				if (local20 != 0) {
					Static122.aClass53_1404 = Static103.method1689(new Class53[] { Static41.aClass53_532, Static108.method1725(local20), Static88.aClass53_1009 });
				}
				Static113.anInt2601 = 30;
			}
		} else if (Static106.anInt2446 == 45) {
			Static15.method223(!Static45.aBoolean47);
			@Pc(445) Class3_Sub10_Sub4 local445 = new Class3_Sub10_Sub4();
			local445.method1886();
			Static42.aClass1_1 = Static65.method1127(22050, Static87.aCanvas1, 0, Static4.aClass6_1);
			Static42.aClass1_1.method1400(local445);
			Static30.method674(local445, Static18.aClass62_Sub1_5, Static125.aClass62_Sub1_18, Static38.aClass62_Sub1_7);
			Static95.aClass1_2 = Static65.method1127(2048, Static87.aCanvas1, 1, Static4.aClass6_1);
			Static36.aClass3_Sub10_Sub1_1 = new Class3_Sub10_Sub1();
			Static95.aClass1_2.method1400(Static36.aClass3_Sub10_Sub1_1);
			Static96.aClass14_3 = new Class14(22050, Static38.anInt1141);
			Static106.anInt2446 = 50;
			Static122.aClass53_1404 = Static95.aClass53_1100;
			Static113.anInt2601 = 35;
		} else if (Static106.anInt2446 == 50) {
			local20 = 0;
			if (Static90.aClass3_Sub1_Sub5_Sub2_4 == null) {
				Static90.aClass3_Sub1_Sub5_Sub2_4 = Static29.method657(Static4.aClass53_55, Static58.aClass62_Sub1_9, Static35.aClass53_476);
			} else {
				local20++;
			}
			if (Static89.aClass3_Sub1_Sub5_Sub2_3 == null) {
				Static89.aClass3_Sub1_Sub5_Sub2_3 = Static29.method657(Static45.aClass53_572, Static58.aClass62_Sub1_9, Static35.aClass53_476);
			} else {
				local20++;
			}
			if (Static43.aClass3_Sub1_Sub5_Sub2_1 == null) {
				Static43.aClass3_Sub1_Sub5_Sub2_1 = Static29.method657(Static102.aClass53_1172, Static58.aClass62_Sub1_9, Static35.aClass53_476);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static122.aClass53_1404 = Static103.method1689(new Class53[] { Static106.aClass53_1218, Static108.method1725(local20 * 100 / 3), Static88.aClass53_1009 });
				Static113.anInt2601 = 40;
			} else {
				Static122.aClass53_1404 = Static82.aClass53_386;
				Static106.anInt2446 = 60;
				Static113.anInt2601 = 40;
			}
		} else if (Static106.anInt2446 == 60) {
			local20 = Static33.method1393(Static69.aClass62_Sub1_12, Static58.aClass62_Sub1_9);
			local55 = Static41.method841();
			if (local55 > local20) {
				Static122.aClass53_1404 = Static103.method1689(new Class53[] { Static97.aClass53_1107, Static108.method1725(local20 * 100 / local55), Static88.aClass53_1009 });
				Static113.anInt2601 = 50;
			} else {
				Static113.anInt2601 = 50;
				Static122.aClass53_1404 = Static9.aClass53_94;
				Static103.method1692(5);
				Static106.anInt2446 = 70;
			}
		} else if (Static106.anInt2446 == 70) {
			if (Static68.aClass62_Sub1_11.method1499()) {
				Static52.method950(Static68.aClass62_Sub1_11);
				Static49.method937(Static68.aClass62_Sub1_11);
				Static125.method1970(Static68.aClass62_Sub1_11, Static9.aClass62_Sub1_3);
				Static120.method1921(Static68.aClass62_Sub1_11, Static9.aClass62_Sub1_3, Static45.aBoolean47);
				Static90.method1468(Static9.aClass62_Sub1_3, Static68.aClass62_Sub1_11);
				Static113.method1808(Static123.aBoolean129, Static68.aClass62_Sub1_11, Static90.aClass3_Sub1_Sub5_Sub2_4, Static9.aClass62_Sub1_3);
				Static70.method1201(Static108.aClass62_Sub1_16, Static68.aClass62_Sub1_11, Static98.aClass62_Sub1_13);
				Static65.method1128(Static68.aClass62_Sub1_11, Static9.aClass62_Sub1_3);
				Static101.method1670(Static68.aClass62_Sub1_11);
				Static111.method1786(Static68.aClass62_Sub1_11);
				Static39.method818(Static58.aClass62_Sub1_9, Static16.aClass62_Sub1_4, Static9.aClass62_Sub1_3);
				Static124.method1969(Static68.aClass62_Sub1_11);
				Static122.aClass53_1404 = Static93.aClass53_1070;
				Static113.anInt2601 = 60;
				Static106.anInt2446 = 80;
			} else {
				Static122.aClass53_1404 = Static103.method1689(new Class53[] { Static119.aClass53_172, Static108.method1725(Static68.aClass62_Sub1_11.method1527()), Static88.aClass53_1009 });
				Static113.anInt2601 = 60;
			}
		} else if (Static106.anInt2446 == 80) {
			local20 = 0;
			if (Static54.aClass3_Sub1_Sub5_Sub4_37 == null) {
				Static54.aClass3_Sub1_Sub5_Sub4_37 = Static40.method819(Static8.aClass53_89, Static58.aClass62_Sub1_9, Static35.aClass53_476);
			} else {
				local20++;
			}
			if (Static35.aClass3_Sub1_Sub5_Sub4_17 == null) {
				Static35.aClass3_Sub1_Sub5_Sub4_17 = Static40.method819(Static88.aClass53_1007, Static58.aClass62_Sub1_9, Static35.aClass53_476);
			} else {
				local20++;
			}
			if (Static31.aClass3_Sub1_Sub5_Sub3Array2 == null) {
				Static31.aClass3_Sub1_Sub5_Sub3Array2 = Static90.method1466(Static20.aClass53_258, Static58.aClass62_Sub1_9, Static35.aClass53_476);
			} else {
				local20++;
			}
			if (Static95.aClass3_Sub1_Sub5_Sub4Array13 == null) {
				Static95.aClass3_Sub1_Sub5_Sub4Array13 = Static89.method1460(Static99.aClass53_1138, Static35.aClass53_476, Static58.aClass62_Sub1_9);
			} else {
				local20++;
			}
			if (Static96.aClass3_Sub1_Sub5_Sub4Array9 == null) {
				Static96.aClass3_Sub1_Sub5_Sub4Array9 = Static89.method1460(Static29.aClass53_392, Static35.aClass53_476, Static58.aClass62_Sub1_9);
			} else {
				local20++;
			}
			if (Static9.aClass3_Sub1_Sub5_Sub4Array3 == null) {
				Static9.aClass3_Sub1_Sub5_Sub4Array3 = Static89.method1460(Static93.aClass53_1071, Static35.aClass53_476, Static58.aClass62_Sub1_9);
			} else {
				local20++;
			}
			if (Static12.aClass3_Sub1_Sub5_Sub4Array4 == null) {
				Static12.aClass3_Sub1_Sub5_Sub4Array4 = Static89.method1460(Static22.aClass53_278, Static35.aClass53_476, Static58.aClass62_Sub1_9);
			} else {
				local20++;
			}
			if (Static45.aClass3_Sub1_Sub5_Sub4Array8 == null) {
				Static45.aClass3_Sub1_Sub5_Sub4Array8 = Static89.method1460(Static35.aClass53_467, Static35.aClass53_476, Static58.aClass62_Sub1_9);
			} else {
				local20++;
			}
			if (Static82.aClass3_Sub1_Sub5_Sub4_13 == null) {
				Static82.aClass3_Sub1_Sub5_Sub4_13 = Static40.method819(Static43.aClass53_552, Static58.aClass62_Sub1_9, Static35.aClass53_476);
			} else {
				local20++;
			}
			if (Static89.aClass3_Sub1_Sub5_Sub4Array12 == null) {
				Static89.aClass3_Sub1_Sub5_Sub4Array12 = Static89.method1460(Static65.aClass53_740, Static35.aClass53_476, Static58.aClass62_Sub1_9);
			} else {
				local20++;
			}
			if (Static113.aClass3_Sub1_Sub5_Sub4Array14 == null) {
				Static113.aClass3_Sub1_Sub5_Sub4Array14 = Static89.method1460(Static30.aClass53_396, Static35.aClass53_476, Static58.aClass62_Sub1_9);
			} else {
				local20++;
			}
			if (Static13.aClass3_Sub1_Sub5_Sub4Array5 == null) {
				Static13.aClass3_Sub1_Sub5_Sub4Array5 = Static89.method1460(Static86.aClass53_960, Static35.aClass53_476, Static58.aClass62_Sub1_9);
			} else {
				local20++;
			}
			if (Static100.aClass3_Sub1_Sub5_Sub3Array9 == null) {
				Static100.aClass3_Sub1_Sub5_Sub3Array9 = Static90.method1466(Static15.aClass53_128, Static58.aClass62_Sub1_9, Static35.aClass53_476);
			} else {
				local20++;
			}
			if (Static53.aClass3_Sub1_Sub5_Sub3Array7 == null) {
				Static53.aClass3_Sub1_Sub5_Sub3Array7 = Static90.method1466(Static61.aClass53_710, Static58.aClass62_Sub1_9, Static35.aClass53_476);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static122.aClass53_1404 = Static103.method1689(new Class53[] { Static97.aClass53_1113, Static108.method1725(local20 * 100 / 14), Static88.aClass53_1009 });
				Static113.anInt2601 = 70;
			} else {
				Static35.aClass3_Sub1_Sub5_Sub4_17.method1341();
				local65 = (int) (Math.random() * 21.0D) - 10;
				local55 = (int) (Math.random() * 21.0D) - 10;
				local71 = (int) (Math.random() * 21.0D) - 10;
				local75 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(936) int local936 = 0; local936 < Static95.aClass3_Sub1_Sub5_Sub4Array13.length; local936++) {
					Static95.aClass3_Sub1_Sub5_Sub4Array13[local936].method1350(local55 + local75, local65 + local75, local75 + local71);
				}
				Static31.aClass3_Sub1_Sub5_Sub3Array2[0].method815(local55 + local75, local65 + local75, local71 + local75);
				Static122.aClass53_1404 = Static40.aClass53_515;
				Static113.anInt2601 = 70;
				Static106.anInt2446 = 85;
			}
		} else if (Static106.anInt2446 == 85) {
			local20 = Static29.method660(Static58.aClass62_Sub1_9);
			local55 = Static44.method870();
			if (local55 > local20) {
				Static122.aClass53_1404 = Static103.method1689(new Class53[] { Static122.aClass53_1414, Static108.method1725(local20 * 100 / local55), Static88.aClass53_1009 });
				Static113.anInt2601 = 80;
			} else {
				Static106.anInt2446 = 90;
				Static122.aClass53_1404 = Static94.aClass53_1088;
				Static113.anInt2601 = 80;
			}
		} else if (Static106.anInt2446 == 90) {
			if (Static7.aClass62_Sub1_1.method1499()) {
				@Pc(1083) Class19 local1083 = new Class19(Static7.aClass62_Sub1_1, Static58.aClass62_Sub1_9, 20, 0.8D, Static45.aBoolean47 ? 64 : 128);
				Static24.method474(local1083);
				Static24.method472(0.8D);
				Static113.anInt2601 = 90;
				Static122.aClass53_1404 = Static107.aClass53_1233;
				Static106.anInt2446 = 110;
			} else {
				Static122.aClass53_1404 = Static103.method1689(new Class53[] { Static123.aClass53_1428, Static108.method1725(Static7.aClass62_Sub1_1.method1527()), Static88.aClass53_1009 });
				Static113.anInt2601 = 90;
			}
		} else if (Static106.anInt2446 == 110) {
			Static90.aClass32_1 = new Class32();
			Static4.aClass6_1.method122(Static90.aClass32_1, 10);
			Static122.aClass53_1404 = Static103.aClass53_1202;
			Static113.anInt2601 = 94;
			Static106.anInt2446 = 120;
		} else if (Static106.anInt2446 == 120) {
			if (Static69.aClass62_Sub1_12.method1520(Static35.aClass53_476, Static27.aClass53_359)) {
				@Pc(1150) Class57 local1150 = new Class57(Static69.aClass62_Sub1_12.method1521(Static27.aClass53_359, Static35.aClass53_476));
				Static37.method1535(local1150);
				Static106.anInt2446 = 130;
				Static122.aClass53_1404 = Static27.aClass53_360;
				Static113.anInt2601 = 96;
			} else {
				Static122.aClass53_1404 = Static103.method1689(new Class53[] { Static76.aClass53_852, Static59.aClass53_690 });
				Static113.anInt2601 = 96;
			}
		} else if (Static106.anInt2446 == 130) {
			if (!Static16.aClass62_Sub1_4.method1499()) {
				Static122.aClass53_1404 = Static103.method1689(new Class53[] { Static125.aClass53_1452, Static108.method1725(Static16.aClass62_Sub1_4.method1527() * 4 / 5), Static88.aClass53_1009 });
				Static113.anInt2601 = 100;
			} else if (!Static103.aClass62_Sub1_15.method1499()) {
				Static122.aClass53_1404 = Static103.method1689(new Class53[] { Static125.aClass53_1452, Static108.method1725(Static103.aClass62_Sub1_15.method1527() / 6 + 80), Static88.aClass53_1009 });
				Static113.anInt2601 = 100;
			} else if (Static45.aClass62_Sub1_8.method1499()) {
				Static122.aClass53_1404 = Static3.aClass53_20;
				Static113.anInt2601 = 100;
				Static106.anInt2446 = 140;
			} else {
				Static122.aClass53_1404 = Static103.method1689(new Class53[] { Static125.aClass53_1452, Static108.method1725(Static45.aClass62_Sub1_8.method1527() / 20 + 96), Static88.aClass53_1009 });
				Static113.anInt2601 = 100;
			}
		} else if (Static106.anInt2446 == 140) {
			Static103.method1692(10);
		}
	}
}
