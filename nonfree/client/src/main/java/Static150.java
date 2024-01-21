import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "[I")
	public static int[] anIntArray287;

	@OriginalMember(owner = "client!sd", name = "U", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1450 = null;

	@OriginalMember(owner = "client!sd", name = "wb", descriptor = "Lclient!rc;")
	public static Class74 aClass74_82 = new Class74(30);

	@OriginalMember(owner = "client!sd", name = "Bb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1451 = Static32.method683("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!sd", name = "Cb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1452 = Static32.method683(":chalreq:");

	@OriginalMember(owner = "client!sd", name = "Db", descriptor = "I")
	public static int anInt3220 = 127;

	@OriginalMember(owner = "client!sd", name = "Eb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1453 = Static32.method683("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!sd", name = "Fb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1454 = Static32.method683("null");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLclient!lf;)V")
	public static void method2470(@OriginalArg(1) Class49 arg0) {
		if (Static169.aClass2_Sub15Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(18) long local18 = arg0.method1651();
		if (local18 == 0L) {
			return;
		}
		while (local10 < Static169.aClass2_Sub15Array1.length && Static169.aClass2_Sub15Array1[local10].aLong157 != local18) {
			local10++;
		}
		if (Static169.aClass2_Sub15Array1.length > local10 && Static169.aClass2_Sub15Array1[local10] != null) {
			Static176.aClass2_Sub13_Sub1_14.method2976(1);
			Static176.aClass2_Sub13_Sub1_14.method2956(Static169.aClass2_Sub15Array1[local10].aLong157);
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	public static void method2474() {
		aClass49_1452 = null;
		aClass49_1451 = null;
		aClass49_1450 = null;
		anIntArray287 = null;
		aClass49_1453 = null;
		aClass49_1454 = null;
		aClass74_82 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!bg;Lclient!bg;Lclient!bg;Lclient!bg;)V")
	private static void method2476(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) Class11 arg3) {
		Static23.aClass11_25 = arg2;
		Static51.aClass11_47 = arg0;
		Static151.aClass11_117 = arg3;
		Static110.aClass11_90 = arg1;
		Static149.aClass85ArrayArray1 = new Class85[Static51.aClass11_47.method2070()][];
		Static33.aBooleanArray4 = new boolean[Static51.aClass11_47.method2070()];
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
	public static void method2477() {
		@Pc(17) int local17;
		if (Static167.anInt3638 == 0) {
			Static22.method406(Static162.anIntArrayArrayArray7);
			for (local17 = 0; local17 < 4; local17++) {
				Static148.aClass48Array1[local17] = new Class48(104, 104);
			}
			Static120.aClass2_Sub2_Sub2_Sub3_5 = new Class2_Sub2_Sub2_Sub3(512, 512);
			Static129.aClass49_1270 = Static175.aClass49_1704;
			Static80.anInt3951 = 5;
			Static167.anInt3638 = 20;
			return;
		}
		@Pc(57) int local57;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (Static167.anInt3638 == 20) {
			@Pc(55) int[] local55 = new int[9];
			for (local57 = 0; local57 < 9; local57++) {
				local65 = local57 * 32 + 143;
				local71 = local65 * 3 + 600;
				local75 = Class2_Sub2_Sub2_Sub4.anIntArray217[local65];
				local55[local57] = local71 * local75 >> 16;
			}
			Static101.method1739(local55);
			Static80.anInt3951 = 10;
			Static167.anInt3638 = 30;
			Static129.aClass49_1270 = Static84.aClass49_896;
		} else if (Static167.anInt3638 == 30) {
			Static57.aClass11_Sub1_12 = Static4.method53(true, false, 0, true);
			Static42.aClass11_Sub1_8 = Static4.method53(true, false, 1, true);
			Static46.aClass11_Sub1_10 = Static4.method53(false, true, 2, true);
			Static53.aClass11_Sub1_11 = Static4.method53(true, false, 3, true);
			Static120.aClass11_Sub1_27 = Static4.method53(true, false, 4, true);
			Static151.aClass11_Sub1_34 = Static4.method53(true, true, 5, true);
			Static91.aClass11_Sub1_23 = Static4.method53(true, true, 6, false);
			Static154.aClass11_Sub1_35 = Static4.method53(true, false, 7, true);
			Static67.aClass11_Sub1_22 = Static4.method53(true, false, 8, true);
			Static117.aClass11_Sub1_24 = Static4.method53(false, true, 9, true);
			Static35.aClass11_Sub1_7 = Static4.method53(true, false, 10, true);
			Static86.aClass11_Sub1_37 = Static4.method53(true, false, 11, true);
			Static46.aClass11_Sub1_9 = Static4.method53(true, false, 12, true);
			Static62.aClass11_Sub1_19 = Static4.method53(false, true, 13, true);
			Static86.aClass11_Sub1_38 = Static4.method53(true, false, 14, false);
			Static123.aClass11_Sub1_33 = Static4.method53(true, false, 15, true);
			Static80.anInt3951 = 20;
			Static129.aClass49_1270 = Static14.aClass49_160;
			Static167.anInt3638 = 40;
		} else if (Static167.anInt3638 == 40) {
			local17 = Static57.aClass11_Sub1_12.method2087() * 4 / 100;
			local17 += Static42.aClass11_Sub1_8.method2087() * 4 / 100;
			local17 += Static46.aClass11_Sub1_10.method2087() * 2 / 100;
			local17 += Static53.aClass11_Sub1_11.method2087() * 2 / 100;
			local17 += Static120.aClass11_Sub1_27.method2087() * 6 / 100;
			local17 += Static151.aClass11_Sub1_34.method2087() * 4 / 100;
			local17 += Static91.aClass11_Sub1_23.method2087() * 2 / 100;
			local17 += Static154.aClass11_Sub1_35.method2087() * 60 / 100;
			local17 += Static67.aClass11_Sub1_22.method2087() * 2 / 100;
			local17 += Static117.aClass11_Sub1_24.method2087() * 2 / 100;
			local17 += Static35.aClass11_Sub1_7.method2087() * 2 / 100;
			local17 += Static86.aClass11_Sub1_37.method2087() * 2 / 100;
			local17 += Static46.aClass11_Sub1_9.method2087() * 2 / 100;
			local17 += Static62.aClass11_Sub1_19.method2087() * 2 / 100;
			local17 += Static86.aClass11_Sub1_38.method2087() * 2 / 100;
			local17 += Static123.aClass11_Sub1_33.method2087() * 2 / 100;
			if (local17 == 100) {
				Static167.anInt3638 = 45;
				Static80.anInt3951 = 30;
				Static129.aClass49_1270 = Static116.aClass49_1120;
			} else {
				if (local17 != 0) {
					Static129.aClass49_1270 = Static33.method692(new Class49[] { Static184.aClass49_1753, Static48.method882(local17), Static22.aClass49_276 });
				}
				Static80.anInt3951 = 30;
			}
		} else if (Static167.anInt3638 == 45) {
			Static29.method547(!Static159.aBoolean148);
			@Pc(444) Class2_Sub14_Sub3 local444 = new Class2_Sub14_Sub3();
			local444.method2570();
			Static146.aClass5_2 = Static28.method504(Static5.aCanvas1, Static45.aClass45_1, 0, 22050);
			Static146.aClass5_2.method1802(local444);
			Static12.method186(local444, Static123.aClass11_Sub1_33, Static120.aClass11_Sub1_27, Static86.aClass11_Sub1_38);
			Static37.aClass5_1 = Static28.method504(Static5.aCanvas1, Static45.aClass45_1, 1, 2048);
			Static128.aClass2_Sub14_Sub4_2 = new Class2_Sub14_Sub4();
			Static37.aClass5_1.method1802(Static128.aClass2_Sub14_Sub4_2);
			Static6.aClass64_1 = new Class64(22050, Static22.anInt472);
			Static129.aClass49_1270 = Static162.aClass49_1614;
			Static80.anInt3951 = 35;
			Static167.anInt3638 = 50;
		} else if (Static167.anInt3638 == 50) {
			local17 = 0;
			if (Static68.aClass2_Sub2_Sub2_Sub1_Sub1_2 == null) {
				Static68.aClass2_Sub2_Sub2_Sub1_Sub1_2 = Static17.method2078(Static67.aClass11_Sub1_22, Static154.aClass49_1489, Static62.aClass11_Sub1_19, Static136.aClass49_1322);
			} else {
				local17++;
			}
			if (Static85.aClass2_Sub2_Sub2_Sub1_Sub1_5 == null) {
				Static85.aClass2_Sub2_Sub2_Sub1_Sub1_5 = Static68.aClass2_Sub2_Sub2_Sub1_Sub1_2;
			} else {
				local17++;
			}
			if (Static84.aClass2_Sub2_Sub2_Sub1_Sub1_4 == null) {
				Static84.aClass2_Sub2_Sub2_Sub1_Sub1_4 = Static17.method2078(Static67.aClass11_Sub1_22, Static154.aClass49_1489, Static62.aClass11_Sub1_19, Static51.aClass49_584);
			} else {
				local17++;
			}
			if (Static42.aClass2_Sub2_Sub2_Sub1_Sub1_1 == null) {
				Static42.aClass2_Sub2_Sub2_Sub1_Sub1_1 = Static17.method2078(Static67.aClass11_Sub1_22, Static154.aClass49_1489, Static62.aClass11_Sub1_19, Static168.aClass49_1647);
			} else {
				local17++;
			}
			if (local17 < 4) {
				Static129.aClass49_1270 = Static33.method692(new Class49[] { Static131.aClass49_1670, Static48.method882(local17 * 100 / 4), Static22.aClass49_276 });
				Static80.anInt3951 = 40;
			} else {
				Static129.aClass49_1270 = Static165.aClass49_1601;
				Static80.anInt3951 = 40;
				Static167.anInt3638 = 60;
			}
		} else if (Static167.anInt3638 == 60) {
			local17 = Static80.method2927(Static35.aClass11_Sub1_7, Static67.aClass11_Sub1_22);
			local57 = Static132.method2212();
			if (local57 > local17) {
				Static129.aClass49_1270 = Static33.method692(new Class49[] { Static120.aClass49_1158, Static48.method882(local17 * 100 / local57), Static22.aClass49_276 });
				Static80.anInt3951 = 50;
			} else {
				Static129.aClass49_1270 = Static145.aClass49_1401;
				Static80.anInt3951 = 50;
				Static33.method691(5);
				Static167.anInt3638 = 70;
			}
		} else if (Static167.anInt3638 == 70) {
			if (Static46.aClass11_Sub1_10.method2072()) {
				Static110.method1893(Static46.aClass11_Sub1_10);
				Static36.method755(Static46.aClass11_Sub1_10);
				Static50.method897(Static154.aClass11_Sub1_35, Static46.aClass11_Sub1_10);
				Static18.method344(Static159.aBoolean148, Static154.aClass11_Sub1_35, Static46.aClass11_Sub1_10);
				Static21.method396(Static154.aClass11_Sub1_35, Static46.aClass11_Sub1_10);
				Static146.method2401(Static46.aClass11_Sub1_10, Static62.aBoolean56, Static85.aClass2_Sub2_Sub2_Sub1_Sub1_5, Static154.aClass11_Sub1_35);
				Static157.method2660(Static57.aClass11_Sub1_12, Static42.aClass11_Sub1_8, Static46.aClass11_Sub1_10);
				Static57.method962(Static46.aClass11_Sub1_10, Static154.aClass11_Sub1_35);
				Static120.method2044(Static46.aClass11_Sub1_10);
				Static88.method1476(Static46.aClass11_Sub1_10);
				method2476(Static53.aClass11_Sub1_11, Static67.aClass11_Sub1_22, Static154.aClass11_Sub1_35, Static62.aClass11_Sub1_19);
				Static17.method2052(Static46.aClass11_Sub1_10);
				Static47.method860(Static46.aClass11_Sub1_10);
				Static129.aClass49_1270 = Static113.aClass49_1094;
				Static80.anInt3951 = 60;
				Static98.method1703();
				Static167.anInt3638 = 80;
			} else {
				Static129.aClass49_1270 = Static33.method692(new Class49[] { Static22.aClass49_284, Static48.method882(Static46.aClass11_Sub1_10.method2079()), Static22.aClass49_276 });
				Static80.anInt3951 = 60;
			}
		} else if (Static167.anInt3638 == 80) {
			local17 = 0;
			if (Static38.aClass2_Sub2_Sub2_Sub3_1 == null) {
				Static38.aClass2_Sub2_Sub2_Sub3_1 = Static14.method203(Static110.aClass49_1067, Static154.aClass49_1489, Static67.aClass11_Sub1_22);
			} else {
				local17++;
			}
			if (Static146.aClass2_Sub2_Sub2_Sub3_7 == null) {
				Static146.aClass2_Sub2_Sub2_Sub3_7 = Static14.method203(Static33.aClass49_444, Static154.aClass49_1489, Static67.aClass11_Sub1_22);
			} else {
				local17++;
			}
			if (Static43.aClass2_Sub2_Sub2_Sub2Array4 == null) {
				Static43.aClass2_Sub2_Sub2_Sub2Array4 = Static125.method2152(Static154.aClass49_1489, Static176.aClass49_1714, Static67.aClass11_Sub1_22);
			} else {
				local17++;
			}
			if (Static130.aClass2_Sub2_Sub2_Sub3Array11 == null) {
				Static130.aClass2_Sub2_Sub2_Sub3Array11 = Static104.method1769(Static19.aClass49_260, Static67.aClass11_Sub1_22, Static154.aClass49_1489);
			} else {
				local17++;
			}
			if (Static124.aClass2_Sub2_Sub2_Sub3Array7 == null) {
				Static124.aClass2_Sub2_Sub2_Sub3Array7 = Static104.method1769(Static163.aClass49_365, Static67.aClass11_Sub1_22, Static154.aClass49_1489);
			} else {
				local17++;
			}
			if (Static107.aClass2_Sub2_Sub2_Sub3Array5 == null) {
				Static107.aClass2_Sub2_Sub2_Sub3Array5 = Static104.method1769(Static22.aClass49_280, Static67.aClass11_Sub1_22, Static154.aClass49_1489);
			} else {
				local17++;
			}
			if (Static135.aClass2_Sub2_Sub2_Sub3Array9 == null) {
				Static135.aClass2_Sub2_Sub2_Sub3Array9 = Static104.method1769(Static61.aClass49_670, Static67.aClass11_Sub1_22, Static154.aClass49_1489);
			} else {
				local17++;
			}
			if (Static121.aClass2_Sub2_Sub2_Sub3Array6 == null) {
				Static121.aClass2_Sub2_Sub2_Sub3Array6 = Static104.method1769(Static7.aClass49_84, Static67.aClass11_Sub1_22, Static154.aClass49_1489);
			} else {
				local17++;
			}
			if (Static85.aClass2_Sub2_Sub2_Sub3Array3 == null) {
				Static85.aClass2_Sub2_Sub2_Sub3Array3 = Static104.method1769(Static175.aClass49_1706, Static67.aClass11_Sub1_22, Static154.aClass49_1489);
			} else {
				local17++;
			}
			if (Static29.aClass2_Sub2_Sub2_Sub3Array2 == null) {
				Static29.aClass2_Sub2_Sub2_Sub3Array2 = Static104.method1769(Static55.aClass49_606, Static67.aClass11_Sub1_22, Static154.aClass49_1489);
			} else {
				local17++;
			}
			if (Static13.aClass2_Sub2_Sub2_Sub3Array1 == null) {
				Static13.aClass2_Sub2_Sub2_Sub3Array1 = Static104.method1769(Static88.aClass49_917, Static67.aClass11_Sub1_22, Static154.aClass49_1489);
			} else {
				local17++;
			}
			if (Static34.aClass2_Sub2_Sub2_Sub2Array3 == null) {
				Static34.aClass2_Sub2_Sub2_Sub2Array3 = Static125.method2152(Static154.aClass49_1489, Static91.aClass49_946, Static67.aClass11_Sub1_22);
			} else {
				local17++;
			}
			if (Static129.aClass2_Sub2_Sub2_Sub2Array8 == null) {
				Static129.aClass2_Sub2_Sub2_Sub2Array8 = Static125.method2152(Static154.aClass49_1489, Static41.aClass49_506, Static67.aClass11_Sub1_22);
			} else {
				local17++;
			}
			if (local17 < 13) {
				Static129.aClass49_1270 = Static33.method692(new Class49[] { Static76.aClass49_814, Static48.method882(local17 * 100 / 13), Static22.aClass49_276 });
				Static80.anInt3951 = 70;
			} else {
				local57 = (int) (Math.random() * 21.0D) - 10;
				local71 = (int) (Math.random() * 21.0D) - 10;
				local65 = (int) (Math.random() * 21.0D) - 10;
				local75 = (int) (Math.random() * 41.0D) - 20;
				Static68.aClass2_Sub2_Sub2_Sub1_Sub1_2.method637(Static129.aClass2_Sub2_Sub2_Sub2Array8, null);
				Static84.aClass2_Sub2_Sub2_Sub1_Sub1_4.method637(Static129.aClass2_Sub2_Sub2_Sub2Array8, null);
				Static42.aClass2_Sub2_Sub2_Sub1_Sub1_1.method637(Static129.aClass2_Sub2_Sub2_Sub2Array8, null);
				if (Static68.aClass2_Sub2_Sub2_Sub1_Sub1_2 != Static85.aClass2_Sub2_Sub2_Sub1_Sub1_5) {
					Static85.aClass2_Sub2_Sub2_Sub1_Sub1_5.method637(Static129.aClass2_Sub2_Sub2_Sub2Array8, null);
				}
				Static146.aClass2_Sub2_Sub2_Sub3_7.method1528();
				Static38.aClass2_Sub2_Sub2_Sub3_1.method1528();
				for (@Pc(961) int local961 = 0; local961 < Static130.aClass2_Sub2_Sub2_Sub3Array11.length; local961++) {
					Static130.aClass2_Sub2_Sub2_Sub3Array11[local961].method1521(local57 + local75, local65 + local75, local75 + local71);
				}
				Static43.aClass2_Sub2_Sub2_Sub2Array4[0].method724(local75 + local57, local65 + local75, local75 + local71);
				Static167.anInt3638 = 90;
				Static129.aClass49_1270 = Static135.aClass49_1317;
				Static80.anInt3951 = 70;
			}
		} else if (Static167.anInt3638 == 90) {
			if (Static117.aClass11_Sub1_24.method2072()) {
				@Pc(1050) Class8 local1050 = new Class8(Static117.aClass11_Sub1_24, Static67.aClass11_Sub1_22, 20, Static159.aBoolean148 ? 64 : 128);
				Static109.method1878(local1050);
				Static109.method1874(0.7F);
				Static129.aClass49_1270 = Static65.aClass49_1746;
				Static80.anInt3951 = 90;
				Static167.anInt3638 = 110;
			} else {
				Static129.aClass49_1270 = Static33.method692(new Class49[] { Static22.aClass49_286, Static48.method882(Static117.aClass11_Sub1_24.method2079()), Static22.aClass49_276 });
				Static80.anInt3951 = 90;
			}
		} else if (Static167.anInt3638 == 110) {
			Static82.aClass72_1 = new Class72();
			Static45.aClass45_1.method1479(Static82.aClass72_1, 10);
			Static80.anInt3951 = 94;
			Static129.aClass49_1270 = Static38.aClass49_486;
			Static167.anInt3638 = 120;
		} else if (Static167.anInt3638 == 120) {
			if (Static35.aClass11_Sub1_7.method2062(Static4.aClass49_49, Static154.aClass49_1489)) {
				@Pc(1117) Class3 local1117 = new Class3(Static35.aClass11_Sub1_7.method2058(Static154.aClass49_1489, Static4.aClass49_49));
				Static62.method1091(local1117);
				Static80.anInt3951 = 96;
				Static129.aClass49_1270 = Static47.aClass49_542;
				Static167.anInt3638 = 130;
			} else {
				Static129.aClass49_1270 = Static33.method692(new Class49[] { Static76.aClass49_815, Static168.aClass49_1644 });
				Static80.anInt3951 = 96;
			}
		} else if (Static167.anInt3638 == 130) {
			if (!Static53.aClass11_Sub1_11.method2072()) {
				Static129.aClass49_1270 = Static33.method692(new Class49[] { Static93.aClass49_949, Static48.method882(Static53.aClass11_Sub1_11.method2079() * 4 / 5), Static22.aClass49_276 });
				Static80.anInt3951 = 100;
			} else if (!Static46.aClass11_Sub1_9.method2072()) {
				Static129.aClass49_1270 = Static33.method692(new Class49[] { Static93.aClass49_949, Static48.method882(Static46.aClass11_Sub1_9.method2079() / 6 + 80), Static22.aClass49_276 });
				Static80.anInt3951 = 100;
			} else if (Static62.aClass11_Sub1_19.method2072()) {
				Static80.anInt3951 = 100;
				Static167.anInt3638 = 140;
				Static129.aClass49_1270 = Static94.aClass49_961;
			} else {
				Static129.aClass49_1270 = Static33.method692(new Class49[] { Static93.aClass49_949, Static48.method882(Static62.aClass11_Sub1_19.method2079() / 20 + 96), Static22.aClass49_276 });
				Static80.anInt3951 = 100;
			}
		} else if (Static167.anInt3638 == 140) {
			Static33.method691(10);
		}
	}
}
