import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Lclient!he;")
	public static Class4_Sub5 aClass4_Sub5_16;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "[I")
	public static int[] anIntArray100;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "Lclient!pd;")
	public static Class20 aClass20_21;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
	public static int anInt904;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!o;")
	public static Class4_Sub16_Sub1 aClass4_Sub16_Sub1_1 = new Class4_Sub16_Sub1(5000);

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!ja;")
	public static Class39 aClass39_455 = Static28.method504(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
	public static int[] anIntArray99 = new int[25];

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!ja;")
	public static Class39 aClass39_456 = Static28.method504("sl_flags");

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "Lclient!ja;")
	public static Class39 aClass39_457 = Static28.method504("sch-Utteln:");

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!ja;")
	private static Class39 aClass39_458 = Static28.method504(" from your ignore list first");

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!ja;")
	public static Class39 aClass39_459 = aClass39_458;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!ja;")
	public static Class39 aClass39_460 = Static28.method504("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "[I")
	public static int[] anIntArray101 = new int[2048];

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Lclient!ja;")
	public static Class39 aClass39_461 = Static28.method504("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
	public static boolean method589(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lclient!rc;")
	public static Class4_Sub2_Sub13 method590(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub2_Sub13 local10 = (Class4_Sub2_Sub13) Static108.aClass12_74.method235((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static130.aClass20_63.method474(13, arg0);
		local10 = new Class4_Sub2_Sub13();
		local10.anInt2549 = arg0;
		if (local20 != null) {
			local10.method1839(new Class4_Sub16(local20));
		}
		Static108.aClass12_74.method234(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method591() {
		aClass39_457 = null;
		aClass39_460 = null;
		aString1 = null;
		aClass4_Sub5_16 = null;
		anIntArray99 = null;
		aClass4_Sub16_Sub1_1 = null;
		aClass39_455 = null;
		aClass39_459 = null;
		anIntArray101 = null;
		aClass39_456 = null;
		anIntArray100 = null;
		aClass39_458 = null;
		aClass39_461 = null;
		aClass20_21 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method592() {
		@Pc(20) int local20;
		if (Static74.anInt1780 == 0) {
			Static101.aClass43_1 = new Class43(4, 104, 104, Static6.anIntArrayArrayArray1);
			for (local20 = 0; local20 < 4; local20++) {
				Static109.aClass81Array1[local20] = new Class81(104, 104);
			}
			Static110.aClass4_Sub2_Sub3_Sub1_7 = new Class4_Sub2_Sub3_Sub1(512, 512);
			Static6.aClass39_177 = Static32.aClass39_438;
			Static72.anInt802 = 5;
			Static74.anInt1780 = 20;
			return;
		}
		@Pc(55) int local55;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (Static74.anInt1780 == 20) {
			@Pc(53) int[] local53 = new int[9];
			for (local55 = 0; local55 < 9; local55++) {
				local65 = local55 * 32 + 128 + 15;
				local71 = local65 * 3 + 600;
				local75 = Class4_Sub2_Sub3_Sub2.anIntArray152[local65];
				local53[local55] = local71 * local75 >> 16;
			}
			Static61.method1096(local53);
			Static74.anInt1780 = 30;
			Static72.anInt802 = 10;
			Static6.aClass39_177 = Static18.aClass39_287;
		} else if (Static74.anInt1780 == 30) {
			Static120.aClass20_Sub1_17 = Static16.method259(true, false, 0, true);
			Static41.aClass20_Sub1_6 = Static16.method259(true, false, 1, true);
			Static94.aClass20_Sub1_14 = Static16.method259(true, true, 2, false);
			Static55.aClass20_Sub1_9 = Static16.method259(true, false, 3, true);
			Static75.aClass20_Sub1_13 = Static16.method259(true, false, 4, true);
			Static16.aClass20_Sub1_2 = Static16.method259(true, true, 5, true);
			Static29.aClass20_Sub1_3 = Static16.method259(false, true, 6, true);
			Static65.aClass20_Sub1_11 = Static16.method259(true, false, 7, true);
			Static127.aClass20_Sub1_20 = Static16.method259(true, false, 8, true);
			Static113.aClass20_Sub1_16 = Static16.method259(true, false, 9, true);
			Static67.aClass20_Sub1_12 = Static16.method259(true, false, 10, true);
			Static47.aClass20_Sub1_8 = Static16.method259(true, false, 11, true);
			Static62.aClass20_Sub1_10 = Static16.method259(true, false, 12, true);
			Static51.aClass20_Sub1_15 = Static16.method259(true, true, 13, false);
			Static125.aClass20_Sub1_19 = Static16.method259(false, false, 14, true);
			Static4.aClass20_Sub1_1 = Static16.method259(true, false, 15, true);
			Static72.anInt802 = 20;
			Static6.aClass39_177 = Static51.aClass39_1282;
			Static74.anInt1780 = 40;
		} else if (Static74.anInt1780 == 40) {
			local20 = Static120.aClass20_Sub1_17.method495() * 4 / 100;
			local20 += Static41.aClass20_Sub1_6.method495() * 4 / 100;
			local20 += Static94.aClass20_Sub1_14.method495() * 2 / 100;
			local20 += Static55.aClass20_Sub1_9.method495() * 2 / 100;
			local20 += Static75.aClass20_Sub1_13.method495() * 6 / 100;
			local20 += Static16.aClass20_Sub1_2.method495() * 4 / 100;
			local20 += Static29.aClass20_Sub1_3.method495() * 2 / 100;
			local20 += Static65.aClass20_Sub1_11.method495() * 60 / 100;
			local20 += Static127.aClass20_Sub1_20.method495() * 2 / 100;
			local20 += Static113.aClass20_Sub1_16.method495() * 2 / 100;
			local20 += Static67.aClass20_Sub1_12.method495() * 2 / 100;
			local20 += Static47.aClass20_Sub1_8.method495() * 2 / 100;
			local20 += Static62.aClass20_Sub1_10.method495() * 2 / 100;
			local20 += Static51.aClass20_Sub1_15.method495() * 2 / 100;
			local20 += Static125.aClass20_Sub1_19.method495() * 2 / 100;
			local20 += Static4.aClass20_Sub1_1.method495() * 2 / 100;
			if (local20 == 100) {
				Static6.aClass39_177 = Static31.aClass39_430;
				Static72.anInt802 = 30;
				Static74.anInt1780 = 45;
			} else {
				if (local20 != 0) {
					Static6.aClass39_177 = Static62.method1123(new Class39[] { Static11.aClass39_241, Static29.method510(local20), Static44.aClass39_668 });
				}
				Static72.anInt802 = 30;
			}
		} else if (Static74.anInt1780 == 45) {
			Static23.method428(!Static123.aBoolean150);
			@Pc(445) Class4_Sub1_Sub1 local445 = new Class4_Sub1_Sub1();
			local445.method75();
			Static74.aClass26_2 = Static80.method1328(Static8.aCanvas1, Static126.aClass29_63, 0, 22050);
			Static74.aClass26_2.method1803(local445);
			Static67.method1163(Static125.aClass20_Sub1_19, Static75.aClass20_Sub1_13, local445, Static4.aClass20_Sub1_1);
			Static70.aClass26_1 = Static80.method1328(Static8.aCanvas1, Static126.aClass29_63, 1, 2048);
			Static85.aClass4_Sub1_Sub2_2 = new Class4_Sub1_Sub2();
			Static70.aClass26_1.method1803(Static85.aClass4_Sub1_Sub2_2);
			Static83.aClass52_1 = new Class52(22050, Static123.anInt3048);
			Static74.anInt1780 = 50;
			Static6.aClass39_177 = Static58.aClass39_829;
			Static72.anInt802 = 35;
		} else if (Static74.anInt1780 == 50) {
			local20 = 0;
			if (Static53.aClass4_Sub2_Sub3_Sub3_2 == null) {
				Static53.aClass4_Sub2_Sub3_Sub3_2 = Static84.method1517(Static72.aClass39_423, Static40.aClass39_577, Static127.aClass20_Sub1_20);
			} else {
				local20++;
			}
			if (Static71.aClass4_Sub2_Sub3_Sub3_4 == null) {
				Static71.aClass4_Sub2_Sub3_Sub3_4 = Static84.method1517(Static72.aClass39_423, Static103.aClass39_1335, Static127.aClass20_Sub1_20);
			} else {
				local20++;
			}
			if (Static62.aClass4_Sub2_Sub3_Sub3_3 == null) {
				Static62.aClass4_Sub2_Sub3_Sub3_3 = Static84.method1517(Static72.aClass39_423, Static24.aClass39_298, Static127.aClass20_Sub1_20);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static6.aClass39_177 = Static62.method1123(new Class39[] { Static58.aClass39_835, Static29.method510(local20 * 100 / 3), Static44.aClass39_668 });
				Static72.anInt802 = 40;
			} else {
				Static6.aClass39_177 = Static39.aClass39_511;
				Static72.anInt802 = 40;
				Static74.anInt1780 = 60;
			}
		} else if (Static74.anInt1780 == 60) {
			local20 = Static125.method2173(Static67.aClass20_Sub1_12, Static127.aClass20_Sub1_20);
			local55 = Static71.method1196();
			if (local55 > local20) {
				Static6.aClass39_177 = Static62.method1123(new Class39[] { Static55.aClass39_813, Static29.method510(local20 * 100 / local55), Static44.aClass39_668 });
				Static72.anInt802 = 50;
			} else {
				Static6.aClass39_177 = Static103.aClass39_1329;
				Static72.anInt802 = 50;
				Static54.method966(5);
				Static74.anInt1780 = 70;
			}
		} else if (Static74.anInt1780 == 70) {
			if (Static94.aClass20_Sub1_14.method466()) {
				Static109.method1930(Static94.aClass20_Sub1_14);
				Static45.method764(Static94.aClass20_Sub1_14);
				Static48.method790(Static94.aClass20_Sub1_14, Static65.aClass20_Sub1_11);
				Static94.method1697(Static123.aBoolean150, Static94.aClass20_Sub1_14, Static65.aClass20_Sub1_11);
				Static128.method2180(Static65.aClass20_Sub1_11, Static94.aClass20_Sub1_14);
				Static32.method549(Static99.aBoolean121, Static94.aClass20_Sub1_14, Static53.aClass4_Sub2_Sub3_Sub3_2, Static65.aClass20_Sub1_11);
				Static26.method432(Static120.aClass20_Sub1_17, Static41.aClass20_Sub1_6, Static94.aClass20_Sub1_14);
				Static50.method822(Static94.aClass20_Sub1_14, Static65.aClass20_Sub1_11);
				Static111.method1970(Static94.aClass20_Sub1_14);
				Static36.method597(Static94.aClass20_Sub1_14);
				Static129.method2183(Static65.aClass20_Sub1_11, Static55.aClass20_Sub1_9, Static127.aClass20_Sub1_20);
				Static25.method2200(Static94.aClass20_Sub1_14);
				Static46.method769(Static94.aClass20_Sub1_14);
				Static74.anInt1780 = 80;
				Static72.anInt802 = 60;
				Static6.aClass39_177 = Static47.aClass39_710;
			} else {
				Static6.aClass39_177 = Static62.method1123(new Class39[] { Static48.aClass39_728, Static29.method510(Static94.aClass20_Sub1_14.method500()), Static44.aClass39_668 });
				Static72.anInt802 = 60;
			}
		} else if (Static74.anInt1780 == 80) {
			local20 = 0;
			if (Static99.aClass4_Sub2_Sub3_Sub1_6 == null) {
				Static99.aClass4_Sub2_Sub3_Sub1_6 = Static93.method2210(Static72.aClass39_423, Static127.aClass20_Sub1_20, Static55.aClass39_814);
			} else {
				local20++;
			}
			if (Static113.aClass4_Sub2_Sub3_Sub1_8 == null) {
				Static113.aClass4_Sub2_Sub3_Sub1_8 = Static93.method2210(Static72.aClass39_423, Static127.aClass20_Sub1_20, Static129.aClass39_1773);
			} else {
				local20++;
			}
			if (Static38.aClass4_Sub2_Sub3_Sub4Array2 == null) {
				Static38.aClass4_Sub2_Sub3_Sub4Array2 = Static45.method761(Static72.aClass39_423, Static39.aClass39_510, Static127.aClass20_Sub1_20);
			} else {
				local20++;
			}
			if (Static108.aClass4_Sub2_Sub3_Sub1Array10 == null) {
				Static108.aClass4_Sub2_Sub3_Sub1Array10 = Static87.method1645(Static127.aClass20_Sub1_20, Static72.aClass39_423, Static22.aClass39_358);
			} else {
				local20++;
			}
			if (Static8.aClass4_Sub2_Sub3_Sub1Array2 == null) {
				Static8.aClass4_Sub2_Sub3_Sub1Array2 = Static87.method1645(Static127.aClass20_Sub1_20, Static72.aClass39_423, Static100.aClass39_1294);
			} else {
				local20++;
			}
			if (Static9.aClass4_Sub2_Sub3_Sub1Array3 == null) {
				Static9.aClass4_Sub2_Sub3_Sub1Array3 = Static87.method1645(Static127.aClass20_Sub1_20, Static72.aClass39_423, Static58.aClass39_832);
			} else {
				local20++;
			}
			if (Static36.aClass4_Sub2_Sub3_Sub1Array4 == null) {
				Static36.aClass4_Sub2_Sub3_Sub1Array4 = Static87.method1645(Static127.aClass20_Sub1_20, Static72.aClass39_423, Static69.aClass39_910);
			} else {
				local20++;
			}
			if (Static97.aClass4_Sub2_Sub3_Sub1Array9 == null) {
				Static97.aClass4_Sub2_Sub3_Sub1Array9 = Static87.method1645(Static127.aClass20_Sub1_20, Static72.aClass39_423, Static11.aClass39_242);
			} else {
				local20++;
			}
			if (Static69.aClass4_Sub2_Sub3_Sub1Array5 == null) {
				Static69.aClass4_Sub2_Sub3_Sub1Array5 = Static87.method1645(Static127.aClass20_Sub1_20, Static72.aClass39_423, Static15.aClass39_258);
			} else {
				local20++;
			}
			if (Static93.aClass4_Sub2_Sub3_Sub1Array12 == null) {
				Static93.aClass4_Sub2_Sub3_Sub1Array12 = Static87.method1645(Static127.aClass20_Sub1_20, Static72.aClass39_423, Static127.aClass39_1757);
			} else {
				local20++;
			}
			if (Static3.aClass4_Sub2_Sub3_Sub1Array1 == null) {
				Static3.aClass4_Sub2_Sub3_Sub1Array1 = Static87.method1645(Static127.aClass20_Sub1_20, Static72.aClass39_423, Static16.aClass39_268);
			} else {
				local20++;
			}
			if (Static58.aClass4_Sub2_Sub3_Sub4Array3 == null) {
				Static58.aClass4_Sub2_Sub3_Sub4Array3 = Static45.method761(Static72.aClass39_423, Static97.aClass39_1273, Static127.aClass20_Sub1_20);
			} else {
				local20++;
			}
			if (Static125.aClass4_Sub2_Sub3_Sub4Array8 == null) {
				Static125.aClass4_Sub2_Sub3_Sub4Array8 = Static45.method761(Static72.aClass39_423, Static101.aClass39_1307, Static127.aClass20_Sub1_20);
			} else {
				local20++;
			}
			if (Static108.aClass4_Sub2_Sub3_Sub4_6 == null) {
				Static108.aClass4_Sub2_Sub3_Sub4_6 = Static77.method1296(Static127.aClass20_Sub1_20, Static72.aClass39_423, Static60.aClass39_849);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static6.aClass39_177 = Static62.method1123(new Class39[] { Static45.aClass39_689, Static29.method510(local20 * 100 / 14), Static44.aClass39_668 });
				Static72.anInt802 = 70;
			} else {
				Static76.aClass4_Sub2_Sub3_Sub4Array4 = Static125.aClass4_Sub2_Sub3_Sub4Array8;
				local55 = (int) (Math.random() * 21.0D) - 10;
				Static113.aClass4_Sub2_Sub3_Sub1_8.method877();
				local65 = (int) (Math.random() * 21.0D) - 10;
				local75 = (int) (Math.random() * 41.0D) - 20;
				local71 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(962) int local962 = 0; local962 < Static108.aClass4_Sub2_Sub3_Sub1Array10.length; local962++) {
					Static108.aClass4_Sub2_Sub3_Sub1Array10[local962].method868(local55 + local75, local65 + local75, local71 + local75);
				}
				Static38.aClass4_Sub2_Sub3_Sub4Array2[0].method1689(local75 + local55, local65 + local75, local71 + local75);
				Static3.method16();
				Static74.anInt1780 = 90;
				Static72.anInt802 = 70;
				Static6.aClass39_177 = Static36.aClass39_467;
			}
		} else if (Static74.anInt1780 == 90) {
			if (Static113.aClass20_Sub1_16.method466()) {
				@Pc(1054) Class10 local1054 = new Class10(Static113.aClass20_Sub1_16, Static127.aClass20_Sub1_20, 20, 0.8D, Static123.aBoolean150 ? 64 : 128);
				Static57.method1040(local1054);
				Static57.method1028(0.8D);
				Static72.anInt802 = 90;
				Static74.anInt1780 = 110;
				Static6.aClass39_177 = Static58.aClass39_837;
			} else {
				Static6.aClass39_177 = Static62.method1123(new Class39[] { Static46.aClass39_708, Static29.method510(Static113.aClass20_Sub1_16.method500()), Static44.aClass39_668 });
				Static72.anInt802 = 90;
			}
		} else if (Static74.anInt1780 == 110) {
			Static104.aClass70_1 = new Class70();
			Static126.aClass29_63.method607(Static104.aClass70_1, 10);
			Static74.anInt1780 = 120;
			Static6.aClass39_177 = Static122.aClass39_1622;
			Static72.anInt802 = 94;
		} else if (Static74.anInt1780 == 120) {
			if (Static67.aClass20_Sub1_12.method487(Static72.aClass39_423, Static129.aClass39_1772)) {
				@Pc(1119) Class44 local1119 = new Class44(Static67.aClass20_Sub1_12.method477(Static129.aClass39_1772, Static72.aClass39_423));
				Static20.method391(local1119);
				Static6.aClass39_177 = Static50.aClass39_746;
				Static72.anInt802 = 96;
				Static74.anInt1780 = 130;
			} else {
				Static6.aClass39_177 = Static62.method1123(new Class39[] { Static115.aClass39_1508, Static4.aClass39_40 });
				Static72.anInt802 = 96;
			}
		} else if (Static74.anInt1780 == 130) {
			if (!Static55.aClass20_Sub1_9.method466()) {
				Static6.aClass39_177 = Static62.method1123(new Class39[] { Static38.aClass39_486, Static29.method510(Static55.aClass20_Sub1_9.method500() * 4 / 5), Static44.aClass39_668 });
				Static72.anInt802 = 100;
			} else if (!Static62.aClass20_Sub1_10.method466()) {
				Static6.aClass39_177 = Static62.method1123(new Class39[] { Static38.aClass39_486, Static29.method510(Static62.aClass20_Sub1_10.method500() / 6 + 80), Static44.aClass39_668 });
				Static72.anInt802 = 100;
			} else if (Static51.aClass20_Sub1_15.method466()) {
				Static74.anInt1780 = 140;
				Static6.aClass39_177 = Static33.aClass39_445;
				Static72.anInt802 = 100;
			} else {
				Static6.aClass39_177 = Static62.method1123(new Class39[] { Static38.aClass39_486, Static29.method510(Static51.aClass20_Sub1_15.method500() / 20 + 96), Static44.aClass39_668 });
				Static72.anInt802 = 100;
			}
		} else if (Static74.anInt1780 == 140) {
			Static54.method966(10);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ea;IB)V")
	public static void method593(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (Static52.aClass4_Sub16_3 == null) {
			Static74.method1215(0, 255, 255, null, true, (byte) 0);
			Static27.aClass20_Sub1Array1[arg1] = arg0;
		} else {
			Static52.aClass4_Sub16_3.anInt2019 = arg1 * 8 + 5;
			@Pc(21) int local21 = Static52.aClass4_Sub16_3.method1486();
			@Pc(25) int local25 = Static52.aClass4_Sub16_3.method1486();
			arg0.method501(local21, local25);
		}
	}
}
