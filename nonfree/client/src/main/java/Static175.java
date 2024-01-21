import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!v", name = "D", descriptor = "I")
	public static int anInt3997;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1378 = Static161.method2971(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!v", name = "w", descriptor = "I")
	public static int anInt3993 = 0;

	@OriginalMember(owner = "client!v", name = "x", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1379 = Static161.method2971("null");

	@OriginalMember(owner = "client!v", name = "z", descriptor = "I")
	public static int anInt3994 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBII)I")
	public static int method2921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg2;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg1;
		@Pc(28) int local28 = Static102.method2037(local17, local3);
		@Pc(35) int local35 = Static102.method2037(local17, local3 + 1);
		@Pc(42) int local42 = Static102.method2037(local17 + 1, local3);
		@Pc(56) int local56 = Static102.method2037(local17 + 1, local3 + 1);
		@Pc(63) int local63 = Static8.method305(local13, local35, local28, arg0);
		@Pc(70) int local70 = Static8.method305(local13, local56, local42, arg0);
		return Static8.method305(local23, local70, local63, arg0);
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
	public static void method2924() {
		aClass13_1378 = null;
		anImage3 = null;
		aClass13_1379 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BI[BI[Lclient!d;)V")
	public static void method2925(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class12[] arg3) {
		@Pc(14) Class1_Sub8 local14 = new Class1_Sub8(arg1);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method1631();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local14.method1645();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(47) int local47 = local28 & 0x3F;
				@Pc(53) int local53 = local28 >> 6 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(61) int local61 = local14.method1607();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = arg0 + local53;
				@Pc(77) int local77 = arg2 + local47;
				if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
					@Pc(94) Class12 local94 = null;
					@Pc(96) int local96 = local57;
					if ((Static35.aByteArrayArrayArray20[1][local73][local77] & 0x2) == 2) {
						local96 = local57 - 1;
					}
					if (local96 >= 0) {
						local94 = arg3[local96];
					}
					Static86.method1827(local65, local69, local94, local73, local16, local77, local57);
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIILclient!lc;IJIIII)Z")
	public static boolean method2932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static42.method1118(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
	public static void method2933() {
		@Pc(14) int local14;
		if (Static87.anInt2478 == 0) {
			Static91.method1918(Static183.anIntArrayArrayArray8);
			for (local14 = 0; local14 < 4; local14++) {
				Static149.aClass12Array1[local14] = new Class12(104, 104);
			}
			Static155.aClass1_Sub2_Sub1_Sub3_9 = new Class1_Sub2_Sub1_Sub3(512, 512);
			Static122.aClass13_1060 = Static65.aClass13_657;
			Static87.anInt2478 = 20;
			Static157.anInt3722 = 5;
			return;
		}
		@Pc(49) int local49;
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(67) int local67;
		if (Static87.anInt2478 == 20) {
			@Pc(47) int[] local47 = new int[9];
			for (local49 = 0; local49 < 9; local49++) {
				local57 = local49 * 32 + 143;
				local63 = local57 * 3 + 600;
				local67 = Class1_Sub2_Sub1_Sub2.anIntArray41[local57];
				local47[local49] = local63 * local67 >> 16;
			}
			Static12.method459(local47);
			Static87.anInt2478 = 30;
			Static122.aClass13_1060 = Static118.aClass13_1043;
			Static157.anInt3722 = 10;
		} else if (Static87.anInt2478 == 30) {
			Static147.aClass4_Sub1_48 = method2934(0, true, false, true);
			Static62.aClass4_Sub1_33 = method2934(1, true, false, true);
			Static71.aClass4_Sub1_28 = method2934(2, false, true, true);
			Static95.aClass4_Sub1_35 = method2934(3, true, false, true);
			Static51.aClass4_Sub1_24 = method2934(4, true, false, true);
			Static42.aClass4_Sub1_21 = method2934(5, true, true, true);
			Static144.aClass4_Sub1_47 = method2934(6, true, true, false);
			Static71.aClass4_Sub1_27 = method2934(7, true, false, true);
			Static69.aClass4_Sub1_25 = method2934(8, true, false, true);
			Static70.aClass4_Sub1_26 = method2934(9, false, true, true);
			Static170.aClass4_Sub1_53 = method2934(10, true, false, true);
			Static90.aClass4_Sub1_34 = method2934(11, true, false, true);
			Static122.aClass4_Sub1_40 = method2934(12, true, false, true);
			Static125.aClass4_Sub1_41 = method2934(13, false, true, true);
			Static176.aClass4_Sub1_54 = method2934(14, true, false, false);
			Static39.aClass4_Sub1_19 = method2934(15, true, false, true);
			Static122.aClass13_1060 = Static60.aClass13_635;
			Static157.anInt3722 = 20;
			Static87.anInt2478 = 40;
		} else if (Static87.anInt2478 == 40) {
			local14 = Static147.aClass4_Sub1_48.method2271() * 4 / 100;
			local14 += Static62.aClass4_Sub1_33.method2271() * 4 / 100;
			local14 += Static71.aClass4_Sub1_28.method2271() * 2 / 100;
			local14 += Static95.aClass4_Sub1_35.method2271() * 2 / 100;
			local14 += Static51.aClass4_Sub1_24.method2271() * 6 / 100;
			local14 += Static42.aClass4_Sub1_21.method2271() * 4 / 100;
			local14 += Static144.aClass4_Sub1_47.method2271() * 2 / 100;
			local14 += Static71.aClass4_Sub1_27.method2271() * 60 / 100;
			local14 += Static69.aClass4_Sub1_25.method2271() * 2 / 100;
			local14 += Static70.aClass4_Sub1_26.method2271() * 2 / 100;
			local14 += Static170.aClass4_Sub1_53.method2271() * 2 / 100;
			local14 += Static90.aClass4_Sub1_34.method2271() * 2 / 100;
			local14 += Static122.aClass4_Sub1_40.method2271() * 2 / 100;
			local14 += Static125.aClass4_Sub1_41.method2271() * 2 / 100;
			local14 += Static176.aClass4_Sub1_54.method2271() * 2 / 100;
			local14 += Static39.aClass4_Sub1_19.method2271() * 2 / 100;
			if (local14 == 100) {
				Static157.anInt3722 = 30;
				Static122.aClass13_1060 = Static60.aClass13_636;
				Static57.method1344(Static170.aClass4_Sub1_53, Static144.aClass4_Sub1_47, Static69.aClass4_Sub1_25);
				Static87.anInt2478 = 45;
			} else {
				if (local14 != 0) {
					Static122.aClass13_1060 = Static57.method1349(new Class13[] { Static78.aClass13_740, Static3.method75(local14), Static89.aClass13_831 });
				}
				Static157.anInt3722 = 30;
			}
		} else if (Static87.anInt2478 == 45) {
			Static134.method2403(!Static30.aBoolean72);
			@Pc(455) Class1_Sub12_Sub4 local455 = new Class1_Sub12_Sub4();
			local455.method2638();
			Static20.aClass53_1 = Static62.method1890(Static163.aClass16_5, 0, 22050, Static106.aCanvas1);
			Static20.aClass53_1.method3040(local455);
			Static115.method2199(Static51.aClass4_Sub1_24, Static39.aClass4_Sub1_19, local455, Static176.aClass4_Sub1_54);
			Static22.aClass53_3 = Static62.method1890(Static163.aClass16_5, 1, 2048, Static106.aCanvas1);
			Static77.aClass1_Sub12_Sub2_1 = new Class1_Sub12_Sub2();
			Static22.aClass53_3.method3040(Static77.aClass1_Sub12_Sub2_1);
			Static7.aClass43_2 = new Class43(22050, Static135.anInt3382);
			Static87.anInt2478 = 50;
			Static157.anInt3722 = 35;
			Static122.aClass13_1060 = Static34.aClass13_400;
		} else if (Static87.anInt2478 == 50) {
			local14 = 0;
			if (Static12.aClass1_Sub2_Sub1_Sub1_Sub1_2 == null) {
				Static12.aClass1_Sub2_Sub1_Sub1_Sub1_2 = Static148.method2598(Static125.aClass4_Sub1_41, Static16.aClass13_253, Static166.aClass13_1350, Static69.aClass4_Sub1_25);
			} else {
				local14++;
			}
			if (Static61.aClass1_Sub2_Sub1_Sub1_Sub1_4 == null) {
				Static61.aClass1_Sub2_Sub1_Sub1_Sub1_4 = Static12.aClass1_Sub2_Sub1_Sub1_Sub1_2;
			} else {
				local14++;
			}
			if (Static22.aClass1_Sub2_Sub1_Sub1_Sub1_5 == null) {
				Static22.aClass1_Sub2_Sub1_Sub1_Sub1_5 = Static148.method2598(Static125.aClass4_Sub1_41, Static16.aClass13_253, Static125.aClass13_1078, Static69.aClass4_Sub1_25);
			} else {
				local14++;
			}
			if (Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6 == null) {
				Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6 = Static148.method2598(Static125.aClass4_Sub1_41, Static16.aClass13_253, Static124.aClass13_1074, Static69.aClass4_Sub1_25);
			} else {
				local14++;
			}
			if (local14 < 4) {
				Static122.aClass13_1060 = Static57.method1349(new Class13[] { Static82.aClass13_771, Static3.method75(local14 * 100 / 4), Static89.aClass13_831 });
				Static157.anInt3722 = 40;
			} else {
				Static122.aClass13_1060 = Static8.aClass13_139;
				Static87.anInt2478 = 60;
				Static157.anInt3722 = 40;
			}
		} else if (Static87.anInt2478 == 60) {
			local14 = Static81.method1696(Static170.aClass4_Sub1_53, Static69.aClass4_Sub1_25);
			local49 = Static113.method2188();
			if (local49 > local14) {
				Static122.aClass13_1060 = Static57.method1349(new Class13[] { Static164.aClass13_1327, Static3.method75(local14 * 100 / local49), Static89.aClass13_831 });
				Static157.anInt3722 = 50;
			} else {
				Static157.anInt3722 = 50;
				Static122.aClass13_1060 = Static60.aClass13_634;
				Static53.method1293(5);
				Static87.anInt2478 = 70;
			}
		} else if (Static87.anInt2478 == 70) {
			if (Static71.aClass4_Sub1_28.method2242()) {
				Static41.method1071(Static71.aClass4_Sub1_28);
				Static2.method71(Static71.aClass4_Sub1_28);
				Static112.method2186(Static71.aClass4_Sub1_27, Static71.aClass4_Sub1_28);
				Static85.method1819(Static71.aClass4_Sub1_28, Static30.aBoolean72, Static71.aClass4_Sub1_27);
				Static123.method2286(Static71.aClass4_Sub1_28, Static71.aClass4_Sub1_27);
				Static77.method1586(Static71.aClass4_Sub1_27, Static61.aClass1_Sub2_Sub1_Sub1_Sub1_4, Static18.aBoolean52, Static71.aClass4_Sub1_28);
				Static69.method1460(Static147.aClass4_Sub1_48, Static62.aClass4_Sub1_33, Static71.aClass4_Sub1_28);
				Static80.method1682(Static71.aClass4_Sub1_27, Static71.aClass4_Sub1_28);
				Static184.method2993(Static71.aClass4_Sub1_28);
				Static8.method306(Static71.aClass4_Sub1_28);
				Static75.method1565(Static69.aClass4_Sub1_25, Static125.aClass4_Sub1_41, Static95.aClass4_Sub1_35, Static71.aClass4_Sub1_27);
				Static144.method2552(Static71.aClass4_Sub1_28);
				Static87.method1849(Static71.aClass4_Sub1_28);
				Static157.anInt3722 = 60;
				Static122.aClass13_1060 = Static125.aClass13_1080;
				Static14.method537();
				Static87.anInt2478 = 80;
			} else {
				Static122.aClass13_1060 = Static57.method1349(new Class13[] { Static69.aClass13_678, Static3.method75(Static71.aClass4_Sub1_28.method2264()), Static89.aClass13_831 });
				Static157.anInt3722 = 60;
			}
		} else if (Static87.anInt2478 == 80) {
			local14 = 0;
			if (Static38.aClass1_Sub2_Sub1_Sub3_2 == null) {
				Static38.aClass1_Sub2_Sub1_Sub3_2 = Static44.method1170(Static69.aClass4_Sub1_25, Static16.aClass13_253, Static6.aClass13_135);
			} else {
				local14++;
			}
			if (Static2.aClass1_Sub2_Sub1_Sub4Array1 == null) {
				Static2.aClass1_Sub2_Sub1_Sub4Array1 = Static28.method837(Static126.aClass13_1081, Static69.aClass4_Sub1_25, Static16.aClass13_253);
			} else {
				local14++;
			}
			if (Static167.aClass1_Sub2_Sub1_Sub3Array12 == null) {
				Static167.aClass1_Sub2_Sub1_Sub3Array12 = Static133.method2390(Static104.aClass13_955, Static16.aClass13_253, Static69.aClass4_Sub1_25);
			} else {
				local14++;
			}
			if (Static33.aClass1_Sub2_Sub1_Sub3Array5 == null) {
				Static33.aClass1_Sub2_Sub1_Sub3Array5 = Static133.method2390(Static178.aClass13_1384, Static16.aClass13_253, Static69.aClass4_Sub1_25);
			} else {
				local14++;
			}
			if (Static15.aClass1_Sub2_Sub1_Sub3Array1 == null) {
				Static15.aClass1_Sub2_Sub1_Sub3Array1 = Static133.method2390(Static122.aClass13_1059, Static16.aClass13_253, Static69.aClass4_Sub1_25);
			} else {
				local14++;
			}
			if (Static159.aClass1_Sub2_Sub1_Sub3Array11 == null) {
				Static159.aClass1_Sub2_Sub1_Sub3Array11 = Static133.method2390(Static154.aClass13_1257, Static16.aClass13_253, Static69.aClass4_Sub1_25);
			} else {
				local14++;
			}
			if (Static182.aClass1_Sub2_Sub1_Sub3Array3 == null) {
				Static182.aClass1_Sub2_Sub1_Sub3Array3 = Static133.method2390(Static38.aClass13_429, Static16.aClass13_253, Static69.aClass4_Sub1_25);
			} else {
				local14++;
			}
			if (Static40.aClass1_Sub2_Sub1_Sub3Array7 == null) {
				Static40.aClass1_Sub2_Sub1_Sub3Array7 = Static133.method2390(Static168.aClass13_1363, Static16.aClass13_253, Static69.aClass4_Sub1_25);
			} else {
				local14++;
			}
			if (Static88.aClass1_Sub2_Sub1_Sub3Array9 == null) {
				Static88.aClass1_Sub2_Sub1_Sub3Array9 = Static133.method2390(Static2.aClass13_26, Static16.aClass13_253, Static69.aClass4_Sub1_25);
			} else {
				local14++;
			}
			if (Static85.aClass1_Sub2_Sub1_Sub3_4 == null) {
				Static85.aClass1_Sub2_Sub1_Sub3_4 = Static44.method1170(Static69.aClass4_Sub1_25, Static16.aClass13_253, Static109.aClass13_986);
			} else {
				local14++;
			}
			if (Static103.aClass1_Sub2_Sub1_Sub3Array10 == null) {
				Static103.aClass1_Sub2_Sub1_Sub3Array10 = Static133.method2390(Static179.aClass13_1397, Static16.aClass13_253, Static69.aClass4_Sub1_25);
			} else {
				local14++;
			}
			if (Static38.aClass1_Sub2_Sub1_Sub3Array6 == null) {
				Static38.aClass1_Sub2_Sub1_Sub3Array6 = Static133.method2390(Static46.aClass13_525, Static16.aClass13_253, Static69.aClass4_Sub1_25);
			} else {
				local14++;
			}
			if (Static24.aClass1_Sub2_Sub1_Sub4Array4 == null) {
				Static24.aClass1_Sub2_Sub1_Sub4Array4 = Static28.method837(Static161.aClass13_1404, Static69.aClass4_Sub1_25, Static16.aClass13_253);
			} else {
				local14++;
			}
			if (Static45.aClass1_Sub2_Sub1_Sub4Array7 == null) {
				Static45.aClass1_Sub2_Sub1_Sub4Array7 = Static28.method837(Static118.aClass13_1044, Static69.aClass4_Sub1_25, Static16.aClass13_253);
			} else {
				local14++;
			}
			if (Static75.aClass1_Sub2_Sub1_Sub4Array8 == null) {
				Static75.aClass1_Sub2_Sub1_Sub4Array8 = Static28.method837(Static85.aClass13_807, Static69.aClass4_Sub1_25, Static16.aClass13_253);
			} else {
				local14++;
			}
			if (local14 < 15) {
				Static122.aClass13_1060 = Static57.method1349(new Class13[] { Static14.aClass13_210, Static3.method75(local14 * 100 / 13), Static89.aClass13_831 });
				Static157.anInt3722 = 70;
			} else {
				Static12.aClass1_Sub2_Sub1_Sub1_Sub1_2.method262(Static45.aClass1_Sub2_Sub1_Sub4Array7, null);
				Static22.aClass1_Sub2_Sub1_Sub1_Sub1_5.method262(Static45.aClass1_Sub2_Sub1_Sub4Array7, null);
				Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method262(Static45.aClass1_Sub2_Sub1_Sub4Array7, null);
				if (Static61.aClass1_Sub2_Sub1_Sub1_Sub1_4 != Static12.aClass1_Sub2_Sub1_Sub1_Sub1_2) {
					Static61.aClass1_Sub2_Sub1_Sub1_Sub1_4.method262(Static45.aClass1_Sub2_Sub1_Sub4Array7, null);
				}
				for (local49 = 0; local49 < Static88.aClass1_Sub2_Sub1_Sub3Array9.length; local49++) {
					Static88.aClass1_Sub2_Sub1_Sub3Array9[local49].method418();
				}
				for (local57 = 0; local57 < Static75.aClass1_Sub2_Sub1_Sub4Array8.length; local57++) {
					Static75.aClass1_Sub2_Sub1_Sub4Array8[local57].method572();
				}
				Static38.aClass1_Sub2_Sub1_Sub3_2.method418();
				local63 = (int) (Math.random() * 21.0D) - 10;
				local67 = (int) (Math.random() * 21.0D) - 10;
				@Pc(1038) int local1038 = (int) (Math.random() * 41.0D) - 20;
				@Pc(1045) int local1045 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(1047) int local1047 = 0; local1047 < Static167.aClass1_Sub2_Sub1_Sub3Array12.length; local1047++) {
					Static167.aClass1_Sub2_Sub1_Sub3Array12[local1047].method396(local63 + local1038, local1038 + local67, local1045 + local1038);
				}
				Static2.aClass1_Sub2_Sub1_Sub4Array1[0].method573(local63 + local1038, local1038 + local67, local1038 + local1045);
				Static122.aClass13_1060 = Static110.aClass13_996;
				Static87.anInt2478 = 90;
				Static157.anInt3722 = 70;
			}
		} else if (Static87.anInt2478 == 90) {
			if (Static70.aClass4_Sub1_26.method2242()) {
				@Pc(1133) Class49 local1133 = new Class49(Static70.aClass4_Sub1_26, Static69.aClass4_Sub1_25, 20, Static30.aBoolean72 ? 64 : 128);
				Static9.method358(local1133);
				Static9.method356(0.7F);
				Static122.aClass13_1060 = Static123.aClass13_1069;
				Static157.anInt3722 = 90;
				Static87.anInt2478 = 110;
			} else {
				Static122.aClass13_1060 = Static57.method1349(new Class13[] { Static165.aClass13_1343, Static3.method75(Static70.aClass4_Sub1_26.method2264()), Static89.aClass13_831 });
				Static157.anInt3722 = 90;
			}
		} else if (Static87.anInt2478 == 110) {
			Static187.aClass26_1 = new Class26();
			Static163.aClass16_5.method982(Static187.aClass26_1, 10);
			Static87.anInt2478 = 120;
			Static157.anInt3722 = 94;
			Static122.aClass13_1060 = Static16.aClass13_258;
		} else if (Static87.anInt2478 == 120) {
			if (Static170.aClass4_Sub1_53.method2254(Static140.aClass13_1192, Static16.aClass13_253)) {
				@Pc(1202) Class24 local1202 = new Class24(Static170.aClass4_Sub1_53.method2262(Static140.aClass13_1192, Static16.aClass13_253));
				Static12.method458(local1202);
				Static122.aClass13_1060 = Static171.aClass13_1367;
				Static157.anInt3722 = 96;
				Static87.anInt2478 = 130;
			} else {
				Static122.aClass13_1060 = Static57.method1349(new Class13[] { Static3.aClass13_32, Static46.aClass13_527 });
				Static157.anInt3722 = 96;
			}
		} else if (Static87.anInt2478 == 130) {
			if (!Static95.aClass4_Sub1_35.method2242()) {
				Static122.aClass13_1060 = Static57.method1349(new Class13[] { Static144.aClass13_1214, Static3.method75(Static95.aClass4_Sub1_35.method2264() * 4 / 5), Static89.aClass13_831 });
				Static157.anInt3722 = 100;
			} else if (!Static122.aClass4_Sub1_40.method2242()) {
				Static122.aClass13_1060 = Static57.method1349(new Class13[] { Static144.aClass13_1214, Static3.method75(Static122.aClass4_Sub1_40.method2264() / 6 + 80), Static89.aClass13_831 });
				Static157.anInt3722 = 100;
			} else if (Static125.aClass4_Sub1_41.method2242()) {
				Static157.anInt3722 = 100;
				Static87.anInt2478 = 140;
				Static122.aClass13_1060 = Static145.aClass13_1224;
			} else {
				Static122.aClass13_1060 = Static57.method1349(new Class13[] { Static144.aClass13_1214, Static3.method75(Static125.aClass4_Sub1_41.method2264() / 20 + 96), Static89.aClass13_831 });
				Static157.anInt3722 = 100;
			}
		} else if (Static87.anInt2478 == 140) {
			Static42.aClass4_Sub1_21.method2253(false);
			Static144.aClass4_Sub1_47.method2253(true);
			Static69.aClass4_Sub1_25.method2253(true);
			Static125.aClass4_Sub1_41.method2253(true);
			Static170.aClass4_Sub1_53.method2253(true);
			Static53.method1293(10);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZZZ)Lclient!o;")
	private static Class4_Sub1 method2934(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) Class28 local6 = null;
		if (Static14.aClass88_1 != null) {
			local6 = new Class28(arg0, Static14.aClass88_1, Static34.aClass88Array1[arg0], 1000000);
		}
		return new Class4_Sub1(local6, Static165.aClass28_4, arg0, arg2, arg1, arg3);
	}
}
