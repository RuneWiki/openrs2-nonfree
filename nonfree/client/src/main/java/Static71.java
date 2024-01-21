import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!md", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "Lclient!oa;")
	public static Class7 aClass7_54;

	@OriginalMember(owner = "client!md", name = "D", descriptor = "Lclient!uc;")
	public static Class4 aClass4_1;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!vc;")
	public static Class71 aClass71_854 = Static38.method736(":0");

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	public static final int anInt1726 = 7759444;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!vc;")
	public static Class71 aClass71_855 = Static38.method736("::noclip");

	@OriginalMember(owner = "client!md", name = "r", descriptor = "Lclient!qa;")
	public static Class54 aClass54_27 = new Class54(64);

	@OriginalMember(owner = "client!md", name = "y", descriptor = "Lclient!vc;")
	private static Class71 aClass71_858 = Static38.method736("Loading interfaces )2 ");

	@OriginalMember(owner = "client!md", name = "u", descriptor = "Lclient!vc;")
	public static Class71 aClass71_856 = aClass71_858;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "Lclient!vc;")
	public static Class71 aClass71_857 = Static38.method736("runes");

	@OriginalMember(owner = "client!md", name = "w", descriptor = "Lclient!rb;")
	public static Class57 aClass57_10 = new Class57(32);

	@OriginalMember(owner = "client!md", name = "x", descriptor = "I")
	public static int anInt1738 = 0;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "Lclient!vc;")
	public static Class71 aClass71_859 = Static38.method736("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!md", name = "B", descriptor = "I")
	private static int anInt1739 = 0;

	@OriginalMember(owner = "client!md", name = "C", descriptor = "Lclient!vc;")
	public static Class71 aClass71_860 = Static38.method736("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!md", name = "E", descriptor = "Lclient!vc;")
	public static Class71 aClass71_861 = Static38.method736("@cr2@");

	@OriginalMember(owner = "client!md", name = "F", descriptor = "Lclient!vc;")
	public static Class71 aClass71_862 = Static38.method736("Entfernen");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	public static void method1176() {
		@Pc(21) int local21;
		if (anInt1739 == 0) {
			Static7.aClass43_1 = new Class43(4, 104, 104, Static51.anIntArrayArrayArray3);
			for (local21 = 0; local21 < 4; local21++) {
				Static111.aClass33Array3[local21] = new Class33(104, 104);
			}
			Static79.aClass5_Sub1_Sub10_Sub3_35 = new Class5_Sub1_Sub10_Sub3(512, 512);
			Static56.anInt1452 = 5;
			Static98.aClass71_944 = Static40.aClass71_411;
			anInt1739 = 20;
			return;
		}
		@Pc(60) int local60;
		@Pc(71) int local71;
		@Pc(77) int local77;
		@Pc(81) int local81;
		if (anInt1739 == 20) {
			@Pc(58) int[] local58 = new int[9];
			for (local60 = 0; local60 < 9; local60++) {
				local71 = local60 * 32 + 128 + 15;
				local77 = local71 * 3 + 600;
				local81 = Class5_Sub1_Sub10_Sub2.anIntArray241[local71];
				local58[local60] = local77 * local81 >> 16;
			}
			Static63.method1077(local58);
			anInt1739 = 30;
			Static56.anInt1452 = 10;
			Static98.aClass71_944 = Static1.aClass71_5;
		} else if (anInt1739 == 30) {
			Static16.aClass24_Sub1_4 = Static91.method1430(0, false, true, true);
			Static88.aClass24_Sub1_18 = Static91.method1430(1, false, true, true);
			Static70.aClass24_Sub1_15 = Static91.method1430(2, true, false, true);
			Static60.aClass24_Sub1_14 = Static91.method1430(3, false, true, true);
			Static88.aClass24_Sub1_19 = Static91.method1430(4, false, true, true);
			Static18.aClass24_Sub1_5 = Static91.method1430(5, true, true, true);
			Static19.aClass24_Sub1_6 = Static91.method1430(6, true, true, false);
			Static81.aClass24_Sub1_17 = Static91.method1430(7, false, true, true);
			Static48.aClass24_Sub1_13 = Static91.method1430(8, false, true, true);
			Static64.aClass24_Sub1_20 = Static91.method1430(9, false, true, true);
			Static30.aClass24_Sub1_7 = Static91.method1430(10, false, true, true);
			Static78.aClass24_Sub1_10 = Static91.method1430(11, false, true, true);
			Static4.aClass24_Sub1_1 = Static91.method1430(12, false, true, true);
			Static32.aClass24_Sub1_9 = Static91.method1430(13, true, false, true);
			anInt1739 = 40;
			Static56.anInt1452 = 20;
			Static98.aClass71_944 = Static16.aClass71_310;
		} else if (anInt1739 == 40) {
			local21 = Static16.aClass24_Sub1_4.method688() * 5 / 100;
			local21 += Static88.aClass24_Sub1_18.method688() * 5 / 100;
			local21 += Static70.aClass24_Sub1_15.method688() * 5 / 100;
			local21 += Static60.aClass24_Sub1_14.method688() * 5 / 100;
			local21 += Static88.aClass24_Sub1_19.method688() * 5 / 100;
			local21 += Static18.aClass24_Sub1_5.method688() * 5 / 100;
			local21 += Static19.aClass24_Sub1_6.method688() * 5 / 100;
			local21 += Static81.aClass24_Sub1_17.method688() * 40 / 100;
			local21 += Static48.aClass24_Sub1_13.method688() * 5 / 100;
			local21 += Static64.aClass24_Sub1_20.method688() * 3 / 100;
			local21 += Static30.aClass24_Sub1_7.method688() * 5 / 100;
			local21 += Static78.aClass24_Sub1_10.method688() * 5 / 100;
			local21 += Static4.aClass24_Sub1_1.method688() * 5 / 100;
			local21 += Static32.aClass24_Sub1_9.method688() * 2 / 100;
			if (local21 == 100) {
				Static98.aClass71_944 = Static60.aClass71_785;
				Static56.anInt1452 = 30;
				anInt1739 = 45;
			} else {
				if (local21 != 0) {
					Static98.aClass71_944 = Static74.method677(new Class71[] { Static18.aClass71_347, Static51.method962(local21), Static97.aClass71_1144 });
				}
				Static56.anInt1452 = 30;
			}
		} else if (anInt1739 == 45) {
			Static85.method1391(Static111.aClass29_3, !Static21.aBoolean28);
			Static19.aClass5_Sub2_Sub2_1 = Static91.method1434(Static105.aCanvas1, Static111.aClass29_3);
			Static24.aClass51_1 = new Class51(22050, Static72.anInt1825);
			Static98.aClass71_944 = Static83.aClass71_998;
			anInt1739 = 50;
			Static56.anInt1452 = 35;
		} else if (anInt1739 == 50) {
			local21 = 0;
			if (Static7.aClass5_Sub1_Sub10_Sub4_1 == null) {
				Static7.aClass5_Sub1_Sub10_Sub4_1 = Static66.method1131(Static48.aClass24_Sub1_13, Static118.aClass71_1376, Static38.aClass71_568);
			} else {
				local21++;
			}
			if (Static64.aClass5_Sub1_Sub10_Sub4_6 == null) {
				Static64.aClass5_Sub1_Sub10_Sub4_6 = Static66.method1131(Static48.aClass24_Sub1_13, Static26.aClass71_734, Static38.aClass71_568);
			} else {
				local21++;
			}
			if (Static35.aClass5_Sub1_Sub10_Sub4_2 == null) {
				Static35.aClass5_Sub1_Sub10_Sub4_2 = Static66.method1131(Static48.aClass24_Sub1_13, Static102.aClass71_1198, Static38.aClass71_568);
			} else {
				local21++;
			}
			if (local21 < 3) {
				Static98.aClass71_944 = Static74.method677(new Class71[] { Static107.aClass71_1250, Static51.method962(local21 * 100 / 3), Static97.aClass71_1144 });
				Static56.anInt1452 = 40;
			} else {
				Static98.aClass71_944 = Static106.aClass71_1232;
				anInt1739 = 60;
				Static56.anInt1452 = 40;
			}
		} else if (anInt1739 == 60) {
			local21 = Static14.method407(Static48.aClass24_Sub1_13, Static30.aClass24_Sub1_7);
			local60 = Static3.method63();
			if (local21 < local60) {
				Static98.aClass71_944 = Static74.method677(new Class71[] { Static87.aClass71_1026, Static51.method962(local21 * 100 / local60), Static97.aClass71_1144 });
				Static56.anInt1452 = 50;
			} else {
				Static98.aClass71_944 = Static82.aClass71_994;
				Static56.anInt1452 = 50;
				Static27.method571(5);
				anInt1739 = 70;
			}
		} else if (anInt1739 == 70) {
			if (Static70.aClass24_Sub1_15.method673()) {
				Static94.method1569(Static70.aClass24_Sub1_15);
				Static38.method742(Static70.aClass24_Sub1_15);
				Static9.method202(Static70.aClass24_Sub1_15, Static81.aClass24_Sub1_17);
				Static34.method701(Static70.aClass24_Sub1_15, Static81.aClass24_Sub1_17, Static21.aBoolean28);
				Static69.method1161(Static81.aClass24_Sub1_17, Static70.aClass24_Sub1_15);
				Static98.method1276(Static81.aClass24_Sub1_17, Static7.aClass5_Sub1_Sub10_Sub4_1, Static62.aBoolean67, Static70.aClass24_Sub1_15);
				Static65.method1128(Static16.aClass24_Sub1_4, Static70.aClass24_Sub1_15, Static88.aClass24_Sub1_18);
				Static103.method1654(Static81.aClass24_Sub1_17, Static70.aClass24_Sub1_15);
				Static35.method711(Static70.aClass24_Sub1_15);
				Static5.method142(Static70.aClass24_Sub1_15);
				Static97.method1609(Static60.aClass24_Sub1_14, Static81.aClass24_Sub1_17, Static48.aClass24_Sub1_13);
				Static31.method599(Static70.aClass24_Sub1_15);
				Static56.anInt1452 = 60;
				Static98.aClass71_944 = Static57.aClass71_758;
				anInt1739 = 80;
			} else {
				Static98.aClass71_944 = Static74.method677(new Class71[] { Static48.aClass71_707, Static51.method962(Static70.aClass24_Sub1_15.method692()), Static97.aClass71_1144 });
				Static56.anInt1452 = 60;
			}
		} else if (anInt1739 == 80) {
			local21 = 0;
			if (Static37.aClass5_Sub1_Sub10_Sub3_12 == null) {
				Static37.aClass5_Sub1_Sub10_Sub3_12 = Static81.method1340(Static38.aClass71_568, Static90.aClass71_1421, Static48.aClass24_Sub1_13);
			} else {
				local21++;
			}
			if (Static85.aClass5_Sub1_Sub10_Sub3_39 == null) {
				Static85.aClass5_Sub1_Sub10_Sub3_39 = Static81.method1340(Static38.aClass71_568, Static81.aClass71_979, Static48.aClass24_Sub1_13);
			} else {
				local21++;
			}
			if (Static68.aClass5_Sub1_Sub10_Sub1Array7 == null) {
				Static68.aClass5_Sub1_Sub10_Sub1Array7 = Static110.method1744(Static48.aClass24_Sub1_13, Static38.aClass71_568, Static26.aClass71_735);
			} else {
				local21++;
			}
			if (Static6.aClass5_Sub1_Sub10_Sub3Array1 == null) {
				Static6.aClass5_Sub1_Sub10_Sub3Array1 = Static34.method702(Static48.aClass24_Sub1_13, Static38.aClass71_568, Static65.aClass71_812);
			} else {
				local21++;
			}
			if (Static26.aClass5_Sub1_Sub10_Sub3Array8 == null) {
				Static26.aClass5_Sub1_Sub10_Sub3Array8 = Static34.method702(Static48.aClass24_Sub1_13, Static38.aClass71_568, Static65.aClass71_808);
			} else {
				local21++;
			}
			if (Static115.aClass5_Sub1_Sub10_Sub3Array11 == null) {
				Static115.aClass5_Sub1_Sub10_Sub3Array11 = Static34.method702(Static48.aClass24_Sub1_13, Static38.aClass71_568, Static109.aClass71_1278);
			} else {
				local21++;
			}
			if (Static91.aClass5_Sub1_Sub10_Sub3Array10 == null) {
				Static91.aClass5_Sub1_Sub10_Sub3Array10 = Static34.method702(Static48.aClass24_Sub1_13, Static38.aClass71_568, Static28.aClass71_444);
			} else {
				local21++;
			}
			if (Static74.aClass5_Sub1_Sub10_Sub3Array7 == null) {
				Static74.aClass5_Sub1_Sub10_Sub3Array7 = Static34.method702(Static48.aClass24_Sub1_13, Static38.aClass71_568, Static77.aClass71_933);
			} else {
				local21++;
			}
			if (Static27.aClass5_Sub1_Sub10_Sub3_15 == null) {
				Static27.aClass5_Sub1_Sub10_Sub3_15 = Static81.method1340(Static38.aClass71_568, Static85.aClass71_1015, Static48.aClass24_Sub1_13);
			} else {
				local21++;
			}
			if (Static8.aClass5_Sub1_Sub10_Sub3Array2 == null) {
				Static8.aClass5_Sub1_Sub10_Sub3Array2 = Static34.method702(Static48.aClass24_Sub1_13, Static38.aClass71_568, Static104.aClass71_1431);
			} else {
				local21++;
			}
			if (Static19.aClass5_Sub1_Sub10_Sub3Array4 == null) {
				Static19.aClass5_Sub1_Sub10_Sub3Array4 = Static34.method702(Static48.aClass24_Sub1_13, Static38.aClass71_568, Static68.aClass71_828);
			} else {
				local21++;
			}
			if (Static9.aClass5_Sub1_Sub10_Sub3Array3 == null) {
				Static9.aClass5_Sub1_Sub10_Sub3Array3 = Static34.method702(Static48.aClass24_Sub1_13, Static38.aClass71_568, Static19.aClass71_365);
			} else {
				local21++;
			}
			if (Static25.aClass5_Sub1_Sub10_Sub1Array5 == null) {
				Static25.aClass5_Sub1_Sub10_Sub1Array5 = Static110.method1744(Static48.aClass24_Sub1_13, Static38.aClass71_568, Static103.aClass71_1203);
			} else {
				local21++;
			}
			if (Static73.aClass5_Sub1_Sub10_Sub1Array8 == null) {
				Static73.aClass5_Sub1_Sub10_Sub1Array8 = Static110.method1744(Static48.aClass24_Sub1_13, Static38.aClass71_568, Static79.aClass71_957);
			} else {
				local21++;
			}
			if (local21 < 14) {
				Static98.aClass71_944 = Static74.method677(new Class71[] { Static68.aClass71_829, Static51.method962(local21 * 100 / 14), Static97.aClass71_1144 });
				Static56.anInt1452 = 70;
			} else {
				Static85.aClass5_Sub1_Sub10_Sub3_39.method1854();
				local77 = (int) (Math.random() * 21.0D) - 10;
				local81 = (int) (Math.random() * 41.0D) - 20;
				local60 = (int) (Math.random() * 21.0D) - 10;
				local71 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(874) int local874 = 0; local874 < Static6.aClass5_Sub1_Sub10_Sub3Array1.length; local874++) {
					Static6.aClass5_Sub1_Sub10_Sub3Array1[local874].method1866(local81 + local60, local81 + local71, local77 + local81);
				}
				Static68.aClass5_Sub1_Sub10_Sub1Array7[0].method922(local60 + local81, local71 + local81, local77 + local81);
				anInt1739 = 85;
				Static98.aClass71_944 = Static60.aClass71_784;
				Static56.anInt1452 = 70;
			}
		} else if (anInt1739 == 85) {
			local21 = Static112.method1746(Static48.aClass24_Sub1_13);
			local60 = Static6.method154();
			if (local60 > local21) {
				Static98.aClass71_944 = Static74.method677(new Class71[] { Static97.aClass71_1138, Static51.method962(local21 * 100 / local60), Static97.aClass71_1144 });
				Static56.anInt1452 = 80;
			} else {
				anInt1739 = 90;
				Static98.aClass71_944 = Static97.aClass71_1148;
				Static56.anInt1452 = 80;
			}
		} else if (anInt1739 == 90) {
			if (Static64.aClass24_Sub1_20.method673()) {
				@Pc(1014) Class1 local1014 = new Class1(Static64.aClass24_Sub1_20, Static48.aClass24_Sub1_13, 20, 0.8D, Static21.aBoolean28 ? 64 : 128);
				Static80.method1321(local1014);
				Static80.method1318(0.8D);
				Static56.anInt1452 = 90;
				Static98.aClass71_944 = Static14.aClass71_301;
				anInt1739 = 110;
			} else {
				Static98.aClass71_944 = Static74.method677(new Class71[] { Static118.aClass71_1375, Static51.method962(Static64.aClass24_Sub1_20.method692()), Static97.aClass71_1144 });
				Static56.anInt1452 = 90;
			}
		} else if (anInt1739 == 110) {
			Static40.aClass13_3 = new Class13();
			Static111.aClass29_3.method774(Static40.aClass13_3, 10);
			Static56.anInt1452 = 94;
			anInt1739 = 120;
			Static98.aClass71_944 = Static102.aClass71_1194;
		} else if (anInt1739 == 120) {
			if (Static30.aClass24_Sub1_7.method670(Static34.aClass71_526, Static38.aClass71_568)) {
				@Pc(1079) Class23 local1079 = new Class23(Static30.aClass24_Sub1_7.method680(Static38.aClass71_568, Static34.aClass71_526));
				Static95.method1576(local1079);
				Static98.aClass71_944 = Static118.aClass71_1377;
				Static56.anInt1452 = 96;
				anInt1739 = 130;
			} else {
				Static98.aClass71_944 = Static74.method677(new Class71[] { Static79.aClass71_956, Static59.aClass71_771 });
				Static56.anInt1452 = 96;
			}
		} else if (anInt1739 == 130) {
			if (!Static60.aClass24_Sub1_14.method673()) {
				Static98.aClass71_944 = Static74.method677(new Class71[] { aClass71_856, Static51.method962(Static60.aClass24_Sub1_14.method692() * 4 / 5), Static97.aClass71_1144 });
				Static56.anInt1452 = 100;
			} else if (!Static4.aClass24_Sub1_1.method673()) {
				Static98.aClass71_944 = Static74.method677(new Class71[] { aClass71_856, Static51.method962(Static4.aClass24_Sub1_1.method692() / 6 + 80), Static97.aClass71_1144 });
				Static56.anInt1452 = 100;
			} else if (Static32.aClass24_Sub1_9.method673()) {
				Static56.anInt1452 = 100;
				Static98.aClass71_944 = Static8.aClass71_207;
				anInt1739 = 140;
			} else {
				Static98.aClass71_944 = Static74.method677(new Class71[] { aClass71_856, Static51.method962(Static32.aClass24_Sub1_9.method692() / 20 + 96), Static97.aClass71_1144 });
				Static56.anInt1452 = 100;
			}
		} else if (anInt1739 == 140) {
			Static27.method571(10);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method1177() {
		aClass71_862 = null;
		aClass71_857 = null;
		aClass71_861 = null;
		aClass71_854 = null;
		aClass71_856 = null;
		aClass57_10 = null;
		aClass71_855 = null;
		aClass71_859 = null;
		aClass71_860 = null;
		aClass71_858 = null;
		aClass7_54 = null;
		aByteArrayArrayArray4 = null;
		aClass54_27 = null;
		aClass4_1 = null;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public static void method1178() {
		Static21.aBoolean28 = false;
		Static63.aBoolean69 = false;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/Component;Lclient!nb;)V")
	public static void method1179(@OriginalArg(1) Component arg0, @OriginalArg(2) Class24 arg1) {
		if (Static5.aBoolean5) {
			return;
		}
		Static41.aClass5_Sub1_Sub10_Sub1_11 = Static82.method1350(arg1, Static89.aClass71_1043, Static119.aClass71_1402);
		Static61.aClass5_Sub1_Sub10_Sub1_15 = Static82.method1350(arg1, Static9.aClass71_216, Static119.aClass71_1402);
		Static4.aClass5_Sub1_Sub10_Sub1_3 = Static82.method1350(arg1, Static2.aClass71_904, Static119.aClass71_1402);
		Static82.aClass5_Sub1_Sub10_Sub1_20 = Static82.method1350(arg1, Static74.aClass71_511, Static119.aClass71_1402);
		Static8.aClass5_Sub1_Sub10_Sub1_4 = Static82.method1350(arg1, Static75.aClass71_897, Static119.aClass71_1402);
		Static49.aClass5_Sub1_Sub10_Sub1_13 = Static82.method1350(arg1, Static118.aClass71_1382, Static119.aClass71_1402);
		Static23.aClass7_25 = Static37.method463(479, 96, arg0);
		Static61.aClass5_Sub1_Sub10_Sub1_15.method921(0, 0);
		aClass7_54 = Static37.method463(172, 156, arg0);
		Static52.method2021();
		Static4.aClass5_Sub1_Sub10_Sub1_3.method921(0, 0);
		Static7.aClass7_14 = Static37.method463(190, 261, arg0);
		Static41.aClass5_Sub1_Sub10_Sub1_11.method921(0, 0);
		Static3.aClass7_2 = Static37.method463(512, 334, arg0);
		Static52.method2021();
		Static78.aClass7_31 = Static37.method463(496, 50, arg0);
		Static16.aClass7_22 = Static37.method463(269, 37, arg0);
		Static64.aClass7_76 = Static37.method463(249, 45, arg0);
		@Pc(108) Class5_Sub1_Sub10_Sub3 local108 = Static81.method1340(Static119.aClass71_1402, Static41.aClass71_603, arg1);
		Static90.aClass7_90 = Static37.method463(local108.anInt2772, local108.anInt2769, arg0);
		local108.method1871(0, 0);
		@Pc(126) Class5_Sub1_Sub10_Sub3 local126 = Static81.method1340(Static119.aClass71_1402, Static92.aClass71_1085, arg1);
		Static62.aClass7_49 = Static37.method463(local126.anInt2772, local126.anInt2769, arg0);
		local126.method1871(0, 0);
		@Pc(144) Class5_Sub1_Sub10_Sub3 local144 = Static81.method1340(Static119.aClass71_1402, Static33.aClass71_516, arg1);
		Static42.aClass7_34 = Static37.method463(local144.anInt2772, local144.anInt2769, arg0);
		local144.method1871(0, 0);
		@Pc(162) Class5_Sub1_Sub10_Sub3 local162 = Static81.method1340(Static119.aClass71_1402, Static53.aClass71_729, arg1);
		Static10.aClass7_15 = Static37.method463(local162.anInt2772, local162.anInt2769, arg0);
		local162.method1871(0, 0);
		@Pc(180) Class5_Sub1_Sub10_Sub3 local180 = Static81.method1340(Static119.aClass71_1402, Static87.aClass71_1031, arg1);
		Static101.aClass7_73 = Static37.method463(local180.anInt2772, local180.anInt2769, arg0);
		local180.method1871(0, 0);
		@Pc(198) Class5_Sub1_Sub10_Sub3 local198 = Static81.method1340(Static119.aClass71_1402, Static92.aClass71_1090, arg1);
		Static88.aClass7_63 = Static37.method463(local198.anInt2772, local198.anInt2769, arg0);
		local198.method1871(0, 0);
		@Pc(216) Class5_Sub1_Sub10_Sub3 local216 = Static81.method1340(Static119.aClass71_1402, Static50.aClass71_718, arg1);
		Static86.aClass7_89 = Static37.method463(local216.anInt2772, local216.anInt2769, arg0);
		local216.method1871(0, 0);
		@Pc(236) Class5_Sub1_Sub10_Sub3 local236 = Static81.method1340(Static119.aClass71_1402, Static100.aClass71_1176, arg1);
		Static14.aClass7_20 = Static37.method463(local236.anInt2772, local236.anInt2769, arg0);
		local236.method1871(0, 0);
		@Pc(254) Class5_Sub1_Sub10_Sub3 local254 = Static81.method1340(Static119.aClass71_1402, Static112.aClass71_1291, arg1);
		Static99.aClass7_69 = Static37.method463(local254.anInt2772, local254.anInt2769, arg0);
		local254.method1871(0, 0);
		Static88.aClass5_Sub1_Sub10_Sub1_21 = Static82.method1350(arg1, Static53.aClass71_727, Static119.aClass71_1402);
		Static36.aClass5_Sub1_Sub10_Sub1_10 = Static82.method1350(arg1, Static78.aClass71_523, Static119.aClass71_1402);
		Static17.aClass5_Sub1_Sub10_Sub1_8 = Static82.method1350(arg1, Static38.aClass71_574, Static119.aClass71_1402);
		Static3.aClass5_Sub1_Sub10_Sub1_1 = Static88.aClass5_Sub1_Sub10_Sub1_21.method916();
		Static3.aClass5_Sub1_Sub10_Sub1_1.method918();
		Static98.aClass5_Sub1_Sub10_Sub1_17 = Static36.aClass5_Sub1_Sub10_Sub1_10.method916();
		Static98.aClass5_Sub1_Sub10_Sub1_17.method918();
		Static79.aClass5_Sub1_Sub10_Sub1_18 = Static88.aClass5_Sub1_Sub10_Sub1_21.method916();
		Static79.aClass5_Sub1_Sub10_Sub1_18.method920();
		Static77.aClass5_Sub1_Sub10_Sub1_16 = Static36.aClass5_Sub1_Sub10_Sub1_10.method916();
		Static77.aClass5_Sub1_Sub10_Sub1_16.method920();
		Static93.aClass5_Sub1_Sub10_Sub1_22 = Static17.aClass5_Sub1_Sub10_Sub1_8.method916();
		Static93.aClass5_Sub1_Sub10_Sub1_22.method920();
		Static81.aClass5_Sub1_Sub10_Sub1_19 = Static88.aClass5_Sub1_Sub10_Sub1_21.method916();
		Static81.aClass5_Sub1_Sub10_Sub1_19.method918();
		Static81.aClass5_Sub1_Sub10_Sub1_19.method920();
		Static4.aClass5_Sub1_Sub10_Sub1_2 = Static36.aClass5_Sub1_Sub10_Sub1_10.method916();
		Static4.aClass5_Sub1_Sub10_Sub1_2.method918();
		Static4.aClass5_Sub1_Sub10_Sub1_2.method920();
		Static114.aClass5_Sub1_Sub10_Sub1Array9 = Static110.method1744(arg1, Static119.aClass71_1402, Static66.aClass71_815);
		Static41.anIntArray122 = new int[151];
		Static76.anIntArray233 = new int[33];
		Static27.anIntArray93 = new int[151];
		Static6.anIntArray10 = new int[33];
		@Pc(356) int local356;
		@Pc(358) int local358;
		@Pc(360) int local360;
		for (@Pc(352) int local352 = 0; local352 < 33; local352++) {
			local356 = 999;
			local358 = 0;
			for (local360 = 0; local360 < 34; local360++) {
				if (Static4.aClass5_Sub1_Sub10_Sub1_3.aByteArray8[local352 * Static4.aClass5_Sub1_Sub10_Sub1_3.anInt1350 + local360] == 0) {
					if (local356 == 999) {
						local356 = local360;
					}
				} else if (local356 != 999) {
					local358 = local360;
					break;
				}
			}
			Static6.anIntArray10[local352] = local356;
			Static76.anIntArray233[local352] = local358 - local356;
		}
		for (local356 = 5; local356 < 156; local356++) {
			local358 = 999;
			local360 = 0;
			for (@Pc(420) int local420 = 25; local420 < 172; local420++) {
				if (Static4.aClass5_Sub1_Sub10_Sub1_3.aByteArray8[Static4.aClass5_Sub1_Sub10_Sub1_3.anInt1350 * local356 + local420] == 0 && (local420 > 34 || local356 > 34)) {
					if (local358 == 999) {
						local358 = local420;
					}
				} else if (local358 != 999) {
					local360 = local420;
					break;
				}
			}
			Static41.anIntArray122[local356 - 5] = local358 - 25;
			Static27.anIntArray93[local356 - 5] = local360 - local358;
		}
		Static5.aBoolean5 = true;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Z")
	public static boolean method1180(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZIII)V")
	public static void method1181(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class5_Sub1_Sub11 local15 = Static23.method550(arg2, arg0);
		if (local15 != null && local15.anObjectArray4 != null) {
			Static53.method972(0, null, local15.anObjectArray4, 0, 0, local15);
		}
		Static10.anInt308 = arg0;
		Static33.aBoolean40 = true;
		Static24.anInt741 = arg1;
		Static100.anInt2363 = arg2;
	}
}
