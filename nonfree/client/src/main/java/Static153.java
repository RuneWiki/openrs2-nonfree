import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "[Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3[] aClass3_Sub2_Sub2_Sub3Array9;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "Lclient!mh;")
	public static Class54 aClass54_1 = new Class54();

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1270 = Static170.method3101("b12_full");

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
	public static volatile int anInt3782 = 0;

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "[S")
	public static short[] aShortArray36 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1272 = Static170.method3101("Loaded fonts");

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1271 = aClass28_1272;

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1273 = Static170.method3101("Cabbage");

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
	public static int anInt3786 = 0;

	@OriginalMember(owner = "client!tg", name = "N", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1274 = Static170.method3101(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1275 = Static170.method3101("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
	public static int anInt3787 = 0;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V")
	public static void method2892() {
		@Pc(14) int local14;
		if (Static126.anInt3244 == 0) {
			Static26.method684(Static90.anIntArrayArrayArray31);
			for (local14 = 0; local14 < 4; local14++) {
				Static45.aClass21Array1[local14] = new Class21(104, 104);
			}
			Static4.aClass3_Sub2_Sub2_Sub4_1 = new Class3_Sub2_Sub2_Sub4(512, 512);
			Static126.anInt3244 = 20;
			Static141.anInt3626 = 5;
			Static140.aClass28_1185 = Static57.aClass28_482;
			return;
		}
		@Pc(53) int local53;
		@Pc(61) int local61;
		@Pc(72) int local72;
		@Pc(65) int local65;
		if (Static126.anInt3244 == 20) {
			@Pc(51) int[] local51 = new int[9];
			for (local53 = 0; local53 < 9; local53++) {
				local61 = local53 * 32 + 143;
				local65 = Class3_Sub2_Sub2_Sub2.anIntArray127[local61];
				local72 = local61 * 3 + 600;
				local51[local53] = local72 * local65 >> 16;
			}
			Static60.method1400(local51);
			Static140.aClass28_1185 = Static51.aClass28_441;
			Static126.anInt3244 = 30;
			Static141.anInt3626 = 10;
		} else if (Static126.anInt3244 == 30) {
			Static181.aClass7_Sub1_19 = Static66.method1604(true, false, true, 0);
			Static79.aClass7_Sub1_11 = Static66.method1604(true, false, true, 1);
			Static108.aClass7_Sub1_12 = Static66.method1604(true, true, false, 2);
			Static144.aClass7_Sub1_7 = Static66.method1604(true, false, true, 3);
			Static127.aClass7_Sub1_14 = Static66.method1604(true, false, true, 4);
			Static76.aClass7_Sub1_10 = Static66.method1604(true, true, true, 5);
			Static164.aClass7_Sub1_17 = Static66.method1604(false, true, true, 6);
			Static41.aClass7_Sub1_5 = Static66.method1604(true, false, true, 7);
			Static2.aClass7_Sub1_1 = Static66.method1604(true, false, true, 8);
			Static177.aClass7_Sub1_18 = Static66.method1604(true, true, false, 9);
			Static21.aClass7_Sub1_3 = Static66.method1604(true, false, true, 10);
			Static61.aClass7_Sub1_8 = Static66.method1604(true, false, true, 11);
			Static127.aClass7_Sub1_13 = Static66.method1604(true, false, true, 12);
			Static7.aClass7_Sub1_2 = Static66.method1604(true, true, false, 13);
			Static68.aClass7_Sub1_9 = Static66.method1604(false, false, true, 14);
			Static132.aClass7_Sub1_15 = Static66.method1604(true, false, true, 15);
			Static126.anInt3244 = 40;
			Static140.aClass28_1185 = Static181.aClass28_1503;
			Static141.anInt3626 = 20;
		} else if (Static126.anInt3244 == 40) {
			local14 = Static181.aClass7_Sub1_19.method1040() * 4 / 100;
			local14 += Static79.aClass7_Sub1_11.method1040() * 4 / 100;
			local14 += Static108.aClass7_Sub1_12.method1040() * 2 / 100;
			local14 += Static144.aClass7_Sub1_7.method1040() * 2 / 100;
			local14 += Static127.aClass7_Sub1_14.method1040() * 6 / 100;
			local14 += Static76.aClass7_Sub1_10.method1040() * 4 / 100;
			local14 += Static164.aClass7_Sub1_17.method1040() * 2 / 100;
			local14 += Static41.aClass7_Sub1_5.method1040() * 60 / 100;
			local14 += Static2.aClass7_Sub1_1.method1040() * 2 / 100;
			local14 += Static177.aClass7_Sub1_18.method1040() * 2 / 100;
			local14 += Static21.aClass7_Sub1_3.method1040() * 2 / 100;
			local14 += Static61.aClass7_Sub1_8.method1040() * 2 / 100;
			local14 += Static127.aClass7_Sub1_13.method1040() * 2 / 100;
			local14 += Static7.aClass7_Sub1_2.method1040() * 2 / 100;
			local14 += Static68.aClass7_Sub1_9.method1040() * 2 / 100;
			local14 += Static132.aClass7_Sub1_15.method1040() * 2 / 100;
			if (local14 == 100) {
				Static140.aClass28_1185 = Static59.aClass28_498;
				Static126.anInt3244 = 45;
				Static141.anInt3626 = 30;
			} else {
				if (local14 != 0) {
					Static140.aClass28_1185 = Static4.method96(new Class28[] { Static141.aClass28_1203, Static146.method2793(local14), Static22.aClass28_244 });
				}
				Static141.anInt3626 = 30;
			}
		} else if (Static126.anInt3244 == 45) {
			Static119.method2400(!Static179.aBoolean202);
			@Pc(455) Class3_Sub3_Sub2 local455 = new Class3_Sub3_Sub2();
			local455.method1899();
			Static166.aClass30_2 = Static180.method3210(0, Static41.aCanvas1, Static123.aClass68_4, 22050);
			Static166.aClass30_2.method2676(local455);
			Static7.method216(Static132.aClass7_Sub1_15, Static127.aClass7_Sub1_14, Static68.aClass7_Sub1_9, local455);
			Static45.aClass30_1 = Static180.method3210(1, Static41.aCanvas1, Static123.aClass68_4, 2048);
			Static157.aClass3_Sub3_Sub4_2 = new Class3_Sub3_Sub4();
			Static45.aClass30_1.method2676(Static157.aClass3_Sub3_Sub4_2);
			Static35.aClass83_1 = new Class83(22050, Static96.anInt4194);
			Static126.anInt3244 = 50;
			Static141.anInt3626 = 35;
			Static140.aClass28_1185 = Static92.aClass28_1473;
		} else if (Static126.anInt3244 == 50) {
			local14 = 0;
			if (Static146.aClass3_Sub2_Sub2_Sub1_Sub1_5 == null) {
				Static146.aClass3_Sub2_Sub2_Sub1_Sub1_5 = Static124.method2462(Static2.aClass7_Sub1_1, Static156.aClass28_1306, Static7.aClass7_Sub1_2, Static79.aClass28_732);
			} else {
				local14++;
			}
			if (Static85.aClass3_Sub2_Sub2_Sub1_Sub1_4 == null) {
				Static85.aClass3_Sub2_Sub2_Sub1_Sub1_4 = Static146.aClass3_Sub2_Sub2_Sub1_Sub1_5;
			} else {
				local14++;
			}
			if (Static41.aClass3_Sub2_Sub2_Sub1_Sub1_1 == null) {
				Static41.aClass3_Sub2_Sub2_Sub1_Sub1_1 = Static124.method2462(Static2.aClass7_Sub1_1, Static156.aClass28_1306, Static7.aClass7_Sub1_2, Static63.aClass28_580);
			} else {
				local14++;
			}
			if (Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2 == null) {
				Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2 = Static124.method2462(Static2.aClass7_Sub1_1, Static156.aClass28_1306, Static7.aClass7_Sub1_2, aClass28_1270);
			} else {
				local14++;
			}
			if (local14 < 4) {
				Static140.aClass28_1185 = Static4.method96(new Class28[] { Static71.aClass28_642, Static146.method2793(local14 * 100 / 4), Static22.aClass28_244 });
				Static141.anInt3626 = 40;
			} else {
				Static140.aClass28_1185 = aClass28_1271;
				Static141.anInt3626 = 40;
				Static126.anInt3244 = 60;
			}
		} else if (Static126.anInt3244 == 60) {
			local14 = Static180.method3209(Static21.aClass7_Sub1_3, Static2.aClass7_Sub1_1);
			local53 = Static175.method3160();
			if (local14 < local53) {
				Static140.aClass28_1185 = Static4.method96(new Class28[] { Static74.aClass28_671, Static146.method2793(local14 * 100 / local53), Static22.aClass28_244 });
				Static141.anInt3626 = 50;
			} else {
				Static141.anInt3626 = 50;
				Static140.aClass28_1185 = Static164.aClass28_1387;
				Static173.method3141(5);
				Static126.anInt3244 = 70;
			}
		} else if (Static126.anInt3244 == 70) {
			if (Static108.aClass7_Sub1_12.method1012()) {
				Static51.method1194(Static108.aClass7_Sub1_12);
				Static62.method1464(Static108.aClass7_Sub1_12);
				Static135.method2645(Static108.aClass7_Sub1_12, Static41.aClass7_Sub1_5);
				Static80.method2757(Static108.aClass7_Sub1_12, Static41.aClass7_Sub1_5, Static179.aBoolean202);
				Static160.method2980(Static108.aClass7_Sub1_12, Static41.aClass7_Sub1_5);
				Static173.method3148(Static85.aClass3_Sub2_Sub2_Sub1_Sub1_4, Static86.aBoolean127, Static41.aClass7_Sub1_5, Static108.aClass7_Sub1_12);
				Static1.method12(Static108.aClass7_Sub1_12, Static79.aClass7_Sub1_11, Static181.aClass7_Sub1_19);
				Static138.method2703(Static41.aClass7_Sub1_5, Static108.aClass7_Sub1_12);
				Static179.method3197(Static108.aClass7_Sub1_12);
				Static137.method2689(Static108.aClass7_Sub1_12);
				Static48.method1148(Static41.aClass7_Sub1_5, Static144.aClass7_Sub1_7, Static7.aClass7_Sub1_2, Static2.aClass7_Sub1_1);
				Static120.method2407(Static108.aClass7_Sub1_12);
				Static44.method3005(Static108.aClass7_Sub1_12);
				Static141.anInt3626 = 60;
				Static140.aClass28_1185 = Static168.aClass28_1422;
				Static114.method2283();
				Static126.anInt3244 = 80;
			} else {
				Static140.aClass28_1185 = Static4.method96(new Class28[] { Static142.aClass28_1210, Static146.method2793(Static108.aClass7_Sub1_12.method1044()), Static22.aClass28_244 });
				Static141.anInt3626 = 60;
			}
		} else if (Static126.anInt3244 == 80) {
			local14 = 0;
			if (Static156.aClass3_Sub2_Sub2_Sub4_7 == null) {
				Static156.aClass3_Sub2_Sub2_Sub4_7 = Static73.method1681(Static132.aClass28_1094, Static2.aClass7_Sub1_1, Static156.aClass28_1306);
			} else {
				local14++;
			}
			if (Static177.aClass3_Sub2_Sub2_Sub4_8 == null) {
				Static177.aClass3_Sub2_Sub2_Sub4_8 = Static73.method1681(Static84.aClass28_768, Static2.aClass7_Sub1_1, Static156.aClass28_1306);
			} else {
				local14++;
			}
			if (Static122.aClass3_Sub2_Sub2_Sub3Array8 == null) {
				Static122.aClass3_Sub2_Sub2_Sub3Array8 = Static58.method1528(Static156.aClass28_1306, Static2.aClass7_Sub1_1, Static174.aClass28_1460);
			} else {
				local14++;
			}
			if (Static118.aClass3_Sub2_Sub2_Sub4Array3 == null) {
				Static118.aClass3_Sub2_Sub2_Sub4Array3 = Static76.method1734(Static156.aClass28_1306, Static28.aClass28_301, Static2.aClass7_Sub1_1);
			} else {
				local14++;
			}
			if (Static128.aClass3_Sub2_Sub2_Sub4Array6 == null) {
				Static128.aClass3_Sub2_Sub2_Sub4Array6 = Static76.method1734(Static156.aClass28_1306, Static125.aClass28_1059, Static2.aClass7_Sub1_1);
			} else {
				local14++;
			}
			if (Static106.aClass3_Sub2_Sub2_Sub4Array2 == null) {
				Static106.aClass3_Sub2_Sub2_Sub4Array2 = Static76.method1734(Static156.aClass28_1306, Static45.aClass28_394, Static2.aClass7_Sub1_1);
			} else {
				local14++;
			}
			if (Static118.aClass3_Sub2_Sub2_Sub4Array5 == null) {
				Static118.aClass3_Sub2_Sub2_Sub4Array5 = Static76.method1734(Static156.aClass28_1306, Static57.aClass28_481, Static2.aClass7_Sub1_1);
			} else {
				local14++;
			}
			if (Static118.aClass3_Sub2_Sub2_Sub4Array4 == null) {
				Static118.aClass3_Sub2_Sub2_Sub4Array4 = Static76.method1734(Static156.aClass28_1306, Static27.aClass28_297, Static2.aClass7_Sub1_1);
			} else {
				local14++;
			}
			if (Static75.aClass3_Sub2_Sub2_Sub4Array1 == null) {
				Static75.aClass3_Sub2_Sub2_Sub4Array1 = Static76.method1734(Static156.aClass28_1306, Static44.aClass28_1369, Static2.aClass7_Sub1_1);
			} else {
				local14++;
			}
			if (Static155.aClass3_Sub2_Sub2_Sub4Array8 == null) {
				Static155.aClass3_Sub2_Sub2_Sub4Array8 = Static76.method1734(Static156.aClass28_1306, Static105.aClass28_875, Static2.aClass7_Sub1_1);
			} else {
				local14++;
			}
			if (Static146.aClass3_Sub2_Sub2_Sub4Array7 == null) {
				Static146.aClass3_Sub2_Sub2_Sub4Array7 = Static76.method1734(Static156.aClass28_1306, Static69.aClass28_629, Static2.aClass7_Sub1_1);
			} else {
				local14++;
			}
			if (Static60.aClass3_Sub2_Sub2_Sub3Array5 == null) {
				Static60.aClass3_Sub2_Sub2_Sub3Array5 = Static58.method1528(Static156.aClass28_1306, Static2.aClass7_Sub1_1, Static177.aClass28_1482);
			} else {
				local14++;
			}
			if (Static110.aClass3_Sub2_Sub2_Sub3Array7 == null) {
				Static110.aClass3_Sub2_Sub2_Sub3Array7 = Static58.method1528(Static156.aClass28_1306, Static2.aClass7_Sub1_1, Static2.aClass28_28);
			} else {
				local14++;
			}
			if (local14 < 13) {
				Static140.aClass28_1185 = Static4.method96(new Class28[] { Static102.aClass28_847, Static146.method2793(local14 * 100 / 13), Static22.aClass28_244 });
				Static141.anInt3626 = 70;
			} else {
				Static10.aClass3_Sub2_Sub2_Sub3Array6 = Static110.aClass3_Sub2_Sub2_Sub3Array7;
				Static177.aClass3_Sub2_Sub2_Sub4_8.method990();
				local53 = (int) (Math.random() * 21.0D) - 10;
				Static156.aClass3_Sub2_Sub2_Sub4_7.method990();
				local61 = (int) (Math.random() * 21.0D) - 10;
				local72 = (int) (Math.random() * 21.0D) - 10;
				local65 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(965) int local965 = 0; local965 < Static118.aClass3_Sub2_Sub2_Sub4Array3.length; local965++) {
					Static118.aClass3_Sub2_Sub2_Sub4Array3[local965].method980(local65 + local53, local65 + local61, local65 + local72);
				}
				Static122.aClass3_Sub2_Sub2_Sub3Array8[0].method838(local53 + local65, local61 - -local65, local65 + local72);
				Static140.aClass28_1185 = Static68.aClass28_626;
				Static141.anInt3626 = 70;
				Static126.anInt3244 = 90;
			}
		} else if (Static126.anInt3244 == 90) {
			if (Static177.aClass7_Sub1_18.method1012()) {
				@Pc(1054) Class44 local1054 = new Class44(Static177.aClass7_Sub1_18, Static2.aClass7_Sub1_1, 20, Static179.aBoolean202 ? 64 : 128);
				Static13.method524(local1054);
				Static13.method523(0.7F);
				Static141.anInt3626 = 90;
				Static126.anInt3244 = 110;
				Static140.aClass28_1185 = Static132.aClass28_1095;
			} else {
				Static140.aClass28_1185 = Static4.method96(new Class28[] { Static76.aClass28_689, Static146.method2793(Static177.aClass7_Sub1_18.method1044()), Static22.aClass28_244 });
				Static141.anInt3626 = 90;
			}
		} else if (Static126.anInt3244 == 110) {
			Static12.aClass24_1 = new Class24();
			Static123.aClass68_4.method2525(10, Static12.aClass24_1);
			Static141.anInt3626 = 94;
			Static140.aClass28_1185 = Static19.aClass28_216;
			Static126.anInt3244 = 120;
		} else if (Static126.anInt3244 == 120) {
			if (Static21.aClass7_Sub1_3.method1028(Static156.aClass28_1306, Static161.aClass28_1342)) {
				@Pc(1121) Class80 local1121 = new Class80(Static21.aClass7_Sub1_3.method1032(Static156.aClass28_1306, Static161.aClass28_1342));
				Static28.method747(local1121);
				Static140.aClass28_1185 = Static158.aClass28_248;
				Static126.anInt3244 = 130;
				Static141.anInt3626 = 96;
			} else {
				Static140.aClass28_1185 = Static4.method96(new Class28[] { Static31.aClass28_319, Static28.aClass28_303 });
				Static141.anInt3626 = 96;
			}
		} else if (Static126.anInt3244 == 130) {
			if (!Static144.aClass7_Sub1_7.method1012()) {
				Static140.aClass28_1185 = Static4.method96(new Class28[] { Static178.aClass28_1489, Static146.method2793(Static144.aClass7_Sub1_7.method1044() * 4 / 5), Static22.aClass28_244 });
				Static141.anInt3626 = 100;
			} else if (!Static127.aClass7_Sub1_13.method1012()) {
				Static140.aClass28_1185 = Static4.method96(new Class28[] { Static178.aClass28_1489, Static146.method2793(Static127.aClass7_Sub1_13.method1044() / 6 + 80), Static22.aClass28_244 });
				Static141.anInt3626 = 100;
			} else if (Static7.aClass7_Sub1_2.method1012()) {
				Static140.aClass28_1185 = Static82.aClass28_753;
				Static141.anInt3626 = 100;
				Static126.anInt3244 = 140;
			} else {
				Static140.aClass28_1185 = Static4.method96(new Class28[] { Static178.aClass28_1489, Static146.method2793(Static7.aClass7_Sub1_2.method1044() / 20 + 96), Static22.aClass28_244 });
				Static141.anInt3626 = 100;
			}
		} else if (Static126.anInt3244 == 140) {
			Static173.method3141(10);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)V")
	public static void method2893(@OriginalArg(0) boolean arg0) {
		Static29.aBoolean49 = arg0;
		@Pc(15) int local15;
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(35) int local35;
		@Pc(38) int local38;
		@Pc(147) int local147;
		@Pc(150) int local150;
		@Pc(153) int local153;
		if (!Static29.aBoolean49) {
			local15 = Static18.aClass3_Sub8_Sub1_1.method1517();
			local19 = (Static11.anInt410 - Static18.aClass3_Sub8_Sub1_1.anInt1948) / 16;
			Static151.anIntArrayArray28 = new int[local19][4];
			for (local23 = 0; local23 < local19; local23++) {
				for (local27 = 0; local27 < 4; local27++) {
					Static151.anIntArrayArray28[local23][local27] = Static18.aClass3_Sub8_Sub1_1.method1536();
				}
			}
			local27 = Static18.aClass3_Sub8_Sub1_1.method1505();
			local32 = Static18.aClass3_Sub8_Sub1_1.method1527();
			@Pc(366) boolean local366 = false;
			local35 = Static18.aClass3_Sub8_Sub1_1.method1527();
			local38 = Static18.aClass3_Sub8_Sub1_1.method1510();
			Static45.aByteArrayArray33 = new byte[local19][];
			Static173.anIntArray691 = new int[local19];
			Static101.anIntArray465 = new int[local19];
			Static37.aByteArrayArray30 = new byte[local19][];
			if ((local32 / 8 == 48 || local32 / 8 == 49) && (local38 / 8) == 48) {
				local366 = true;
			}
			Static2.anIntArray16 = new int[local19];
			if (local32 / 8 == 48 && local38 / 8 == 148) {
				local366 = true;
			}
			local19 = 0;
			for (local147 = (local32 - 6) / 8; local147 <= (local32 + 6) / 8; local147++) {
				for (local150 = (local38 - 6) / 8; local150 <= (local38 + 6) / 8; local150++) {
					local153 = local150 + (local147 << 8);
					if (!local366 || local150 != 49 && local150 != 149 && local150 != 147 && local147 != 50 && (local147 != 49 || local150 != 47)) {
						Static173.anIntArray691[local19] = local153;
						Static2.anIntArray16[local19] = Static76.aClass7_Sub1_10.method1029(Static4.method96(new Class28[] { Static80.aClass28_1201, Static146.method2793(local147), Static103.aClass28_851, Static146.method2793(local150) }));
						Static101.anIntArray465[local19] = Static76.aClass7_Sub1_10.method1029(Static4.method96(new Class28[] { Static31.aClass28_314, Static146.method2793(local147), Static103.aClass28_851, Static146.method2793(local150) }));
						local19++;
					}
				}
			}
			Static94.method2075(local15, local32, local35, local27, local38);
			return;
		}
		local15 = Static18.aClass3_Sub8_Sub1_1.method1527();
		local19 = Static18.aClass3_Sub8_Sub1_1.method1517();
		local23 = Static18.aClass3_Sub8_Sub1_1.method1527();
		local27 = Static18.aClass3_Sub8_Sub1_1.method1545();
		Static18.aClass3_Sub8_Sub1_1.method1560();
		@Pc(44) int local44;
		for (local32 = 0; local32 < 4; local32++) {
			for (local35 = 0; local35 < 13; local35++) {
				for (local38 = 0; local38 < 13; local38++) {
					local44 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
					if (local44 == 1) {
						Static19.anIntArrayArrayArray11[local32][local35][local38] = Static18.aClass3_Sub8_Sub1_1.method1557(26);
					} else {
						Static19.anIntArrayArrayArray11[local32][local35][local38] = -1;
					}
				}
			}
		}
		Static18.aClass3_Sub8_Sub1_1.method1563();
		local35 = (Static11.anInt410 - Static18.aClass3_Sub8_Sub1_1.anInt1948) / 16;
		Static151.anIntArrayArray28 = new int[local35][4];
		for (local38 = 0; local38 < local35; local38++) {
			for (local44 = 0; local44 < 4; local44++) {
				Static151.anIntArrayArray28[local38][local44] = Static18.aClass3_Sub8_Sub1_1.method1551();
			}
		}
		local44 = Static18.aClass3_Sub8_Sub1_1.method1549();
		Static173.anIntArray691 = new int[local35];
		Static2.anIntArray16 = new int[local35];
		Static45.aByteArrayArray33 = new byte[local35][];
		Static101.anIntArray465 = new int[local35];
		Static37.aByteArrayArray30 = new byte[local35][];
		local35 = 0;
		for (local147 = 0; local147 < 4; local147++) {
			for (local150 = 0; local150 < 13; local150++) {
				for (local153 = 0; local153 < 13; local153++) {
					@Pc(162) int local162 = Static19.anIntArrayArrayArray11[local147][local150][local153];
					if (local162 != -1) {
						@Pc(171) int local171 = local162 >> 14 & 0x3FF;
						@Pc(177) int local177 = local162 >> 3 & 0x7FF;
						@Pc(187) int local187 = (local171 / 8 << 8) + local177 / 8;
						for (@Pc(189) int local189 = 0; local189 < local35; local189++) {
							if (local187 == Static173.anIntArray691[local189]) {
								local187 = -1;
								break;
							}
						}
						if (local187 != -1) {
							Static173.anIntArray691[local35] = local187;
							@Pc(219) int local219 = local187 >> 8 & 0xFF;
							@Pc(223) int local223 = local187 & 0xFF;
							Static2.anIntArray16[local35] = Static76.aClass7_Sub1_10.method1029(Static4.method96(new Class28[] { Static80.aClass28_1201, Static146.method2793(local219), Static103.aClass28_851, Static146.method2793(local223) }));
							Static101.anIntArray465[local35] = Static76.aClass7_Sub1_10.method1029(Static4.method96(new Class28[] { Static31.aClass28_314, Static146.method2793(local219), Static103.aClass28_851, Static146.method2793(local223) }));
							local35++;
						}
					}
				}
			}
		}
		Static94.method2075(local44, local19, local15, local27, local23);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V")
	public static void method2895() {
		aShortArray36 = null;
		aClass3_Sub2_Sub2_Sub3Array9 = null;
		aClass28_1270 = null;
		aClass28_1271 = null;
		aClass28_1274 = null;
		aClass28_1275 = null;
		aClass28_1273 = null;
		aClass54_1 = null;
		aClass28_1272 = null;
	}
}
