import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_1;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "I")
	public static int anInt10;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1 = Static119.method1462("blinken2:");

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!pe;")
	public static Class65 aClass65_2 = Static119.method1462("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	public static int anInt16 = 0;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "Lclient!pe;")
	public static Class65 aClass65_3 = Static119.method1462("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method10() {
		@Pc(17) int local17;
		if (Static127.anInt2728 == 0) {
			Static124.aClass49_1 = new Class49(4, 104, 104, Static67.anIntArrayArrayArray8);
			for (local17 = 0; local17 < 4; local17++) {
				Static90.aClass46Array1[local17] = new Class46(104, 104);
			}
			Static114.aClass2_Sub1_Sub4_Sub1_5 = new Class2_Sub1_Sub4_Sub1(512, 512);
			Static127.anInt2728 = 20;
			Static57.aClass65_626 = Static36.aClass65_381;
			Static9.anInt256 = 5;
			return;
		}
		@Pc(54) int local54;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (Static127.anInt2728 == 20) {
			@Pc(52) int[] local52 = new int[9];
			for (local54 = 0; local54 < 9; local54++) {
				local65 = local54 * 32 + 128 + 15;
				local71 = local65 * 3 + 600;
				local75 = Class2_Sub1_Sub4_Sub4.anIntArray251[local65];
				local52[local54] = local75 * local71 >> 16;
			}
			Static65.method1171(local52);
			Static9.anInt256 = 10;
			Static57.aClass65_626 = Static106.aClass65_1005;
			Static127.anInt2728 = 30;
		} else if (Static127.anInt2728 == 30) {
			Static15.aClass56_Sub1_7 = Static53.method888(true, true, 0, false);
			Static68.aClass56_Sub1_31 = Static53.method888(true, true, 1, false);
			Static52.aClass56_Sub1_15 = Static53.method888(false, true, 2, true);
			Static90.aClass56_Sub1_21 = Static53.method888(true, true, 3, false);
			Static16.aClass56_Sub1_25 = Static53.method888(true, true, 4, false);
			Static95.aClass56_Sub1_22 = Static53.method888(true, true, 5, true);
			Static88.aClass56_Sub1_19 = Static53.method888(true, false, 6, true);
			Static57.aClass56_Sub1_16 = Static53.method888(true, true, 7, false);
			Static16.aClass56_Sub1_24 = Static53.method888(true, true, 8, false);
			Static41.aClass56_Sub1_14 = Static53.method888(true, true, 9, false);
			Static17.aClass56_Sub1_8 = Static53.method888(true, true, 10, false);
			Static83.aClass56_Sub1_17 = Static53.method888(true, true, 11, false);
			Static35.aClass56_Sub1_11 = Static53.method888(true, true, 12, false);
			Static86.aClass56_Sub1_18 = Static53.method888(false, true, 13, true);
			Static105.aClass56_Sub1_26 = Static53.method888(true, false, 14, false);
			Static115.aClass56_Sub1_29 = Static53.method888(true, true, 15, false);
			Static57.aClass65_626 = Static46.aClass65_507;
			Static127.anInt2728 = 40;
			Static9.anInt256 = 20;
		} else if (Static127.anInt2728 == 40) {
			local17 = Static15.aClass56_Sub1_7.method1695() * 4 / 100;
			local17 += Static68.aClass56_Sub1_31.method1695() * 4 / 100;
			local17 += Static52.aClass56_Sub1_15.method1695() * 2 / 100;
			local17 += Static90.aClass56_Sub1_21.method1695() * 2 / 100;
			local17 += Static16.aClass56_Sub1_25.method1695() * 6 / 100;
			local17 += Static95.aClass56_Sub1_22.method1695() * 4 / 100;
			local17 += Static88.aClass56_Sub1_19.method1695() * 2 / 100;
			local17 += Static57.aClass56_Sub1_16.method1695() * 60 / 100;
			local17 += Static16.aClass56_Sub1_24.method1695() * 2 / 100;
			local17 += Static41.aClass56_Sub1_14.method1695() * 2 / 100;
			local17 += Static17.aClass56_Sub1_8.method1695() * 2 / 100;
			local17 += Static83.aClass56_Sub1_17.method1695() * 2 / 100;
			local17 += Static35.aClass56_Sub1_11.method1695() * 2 / 100;
			local17 += Static86.aClass56_Sub1_18.method1695() * 2 / 100;
			local17 += Static105.aClass56_Sub1_26.method1695() * 2 / 100;
			local17 += Static115.aClass56_Sub1_29.method1695() * 2 / 100;
			if (local17 == 100) {
				Static57.aClass65_626 = Static70.aClass65_698;
				Static9.anInt256 = 30;
				Static127.anInt2728 = 45;
			} else {
				if (local17 != 0) {
					Static57.aClass65_626 = Static35.method647(new Class65[] { Static112.aClass65_1067, Static120.method1871(local17), Static93.aClass65_872 });
				}
				Static9.anInt256 = 30;
			}
		} else if (Static127.anInt2728 == 45) {
			Static115.method1836(!Static48.aBoolean47);
			@Pc(447) Class2_Sub2_Sub2 local447 = new Class2_Sub2_Sub2();
			local447.method822();
			Static40.aClass4_1 = Static132.method2031(Static115.aCanvas1, 22050, Static28.aClass20_2, 0);
			Static40.aClass4_1.method859(local447);
			Static113.method1828(Static16.aClass56_Sub1_25, Static115.aClass56_Sub1_29, local447, Static105.aClass56_Sub1_26);
			Static124.aClass4_2 = Static132.method2031(Static115.aCanvas1, 2048, Static28.aClass20_2, 1);
			Static104.aClass2_Sub2_Sub4_33 = new Class2_Sub2_Sub4();
			Static124.aClass4_2.method859(Static104.aClass2_Sub2_Sub4_33);
			Static72.aClass64_1 = new Class64(22050, Static107.anInt2405);
			Static9.anInt256 = 35;
			Static57.aClass65_626 = Static124.aClass65_1154;
			Static127.anInt2728 = 50;
		} else if (Static127.anInt2728 == 50) {
			local17 = 0;
			if (Static107.aClass2_Sub1_Sub4_Sub3_Sub1_3 == null) {
				Static107.aClass2_Sub1_Sub4_Sub3_Sub1_3 = Static57.method1076(Static110.aClass65_1038, Static16.aClass56_Sub1_24, Static40.aClass65_412, Static86.aClass56_Sub1_18);
			} else {
				local17++;
			}
			if (Static127.aClass2_Sub1_Sub4_Sub3_Sub1_4 == null) {
				Static127.aClass2_Sub1_Sub4_Sub3_Sub1_4 = Static57.method1076(Static110.aClass65_1038, Static16.aClass56_Sub1_24, Static99.aClass65_943, Static86.aClass56_Sub1_18);
			} else {
				local17++;
			}
			if (Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1 == null) {
				Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1 = Static57.method1076(Static110.aClass65_1038, Static16.aClass56_Sub1_24, Static89.aClass65_842, Static86.aClass56_Sub1_18);
			} else {
				local17++;
			}
			if (local17 < 3) {
				Static57.aClass65_626 = Static35.method647(new Class65[] { Static103.aClass65_986, Static120.method1871(local17 * 100 / 3), Static93.aClass65_872 });
				Static9.anInt256 = 40;
			} else {
				Static57.aClass65_626 = Static76.aClass65_729;
				Static9.anInt256 = 40;
				Static127.anInt2728 = 60;
			}
		} else if (Static127.anInt2728 == 60) {
			local17 = Static83.method1349(Static17.aClass56_Sub1_8, Static16.aClass56_Sub1_24);
			local54 = Static106.method1716();
			if (local17 < local54) {
				Static57.aClass65_626 = Static35.method647(new Class65[] { Static93.aClass65_878, Static120.method1871(local17 * 100 / local54), Static93.aClass65_872 });
				Static9.anInt256 = 50;
			} else {
				Static57.aClass65_626 = Static86.aClass65_808;
				Static9.anInt256 = 50;
				Static98.method1604(5);
				Static127.anInt2728 = 70;
			}
		} else if (Static127.anInt2728 == 70) {
			if (Static52.aClass56_Sub1_15.method1668()) {
				Static62.method1123(Static52.aClass56_Sub1_15);
				Static119.method1464(Static52.aClass56_Sub1_15);
				Static126.method1925(Static52.aClass56_Sub1_15, Static57.aClass56_Sub1_16);
				Static98.method1615(Static57.aClass56_Sub1_16, Static52.aClass56_Sub1_15, Static48.aBoolean47);
				Static67.method1210(Static57.aClass56_Sub1_16, Static52.aClass56_Sub1_15);
				Static104.method2061(Static49.aBoolean48, Static57.aClass56_Sub1_16, Static107.aClass2_Sub1_Sub4_Sub3_Sub1_3, Static52.aClass56_Sub1_15);
				Static134.method2049(Static68.aClass56_Sub1_31, Static52.aClass56_Sub1_15, Static15.aClass56_Sub1_7);
				Static107.method1732(Static57.aClass56_Sub1_16, Static52.aClass56_Sub1_15);
				Static83.method1358(Static52.aClass56_Sub1_15);
				Static8.method156(Static52.aClass56_Sub1_15);
				Static120.method1873(Static86.aClass56_Sub1_18, Static57.aClass56_Sub1_16, Static90.aClass56_Sub1_21, Static16.aClass56_Sub1_24);
				Static121.method1874(Static52.aClass56_Sub1_15);
				Static96.method1590(Static52.aClass56_Sub1_15);
				Static127.anInt2728 = 80;
				Static9.anInt256 = 60;
				Static57.aClass65_626 = Static34.aClass65_368;
			} else {
				Static57.aClass65_626 = Static35.method647(new Class65[] { Static43.aClass65_477, Static120.method1871(Static52.aClass56_Sub1_15.method1699()), Static93.aClass65_872 });
				Static9.anInt256 = 60;
			}
		} else if (Static127.anInt2728 == 80) {
			local17 = 0;
			if (Static22.aClass2_Sub1_Sub4_Sub1_2 == null) {
				Static22.aClass2_Sub1_Sub4_Sub1_2 = Static84.method1367(Static72.aClass65_709, Static16.aClass56_Sub1_24, Static110.aClass65_1038);
			} else {
				local17++;
			}
			if (Static5.aClass2_Sub1_Sub4_Sub1_1 == null) {
				Static5.aClass2_Sub1_Sub4_Sub1_1 = Static84.method1367(Static60.aClass65_195, Static16.aClass56_Sub1_24, Static110.aClass65_1038);
			} else {
				local17++;
			}
			if (Static48.aClass2_Sub1_Sub4_Sub2Array3 == null) {
				Static48.aClass2_Sub1_Sub4_Sub2Array3 = Static41.method729(Static16.aClass56_Sub1_24, Static23.aClass65_760, Static110.aClass65_1038);
			} else {
				local17++;
			}
			if (Static108.aClass2_Sub1_Sub4_Sub1Array11 == null) {
				Static108.aClass2_Sub1_Sub4_Sub1Array11 = Static117.method1858(Static54.aClass65_576, Static110.aClass65_1038, Static16.aClass56_Sub1_24);
			} else {
				local17++;
			}
			if (Static46.aClass2_Sub1_Sub4_Sub1Array6 == null) {
				Static46.aClass2_Sub1_Sub4_Sub1Array6 = Static117.method1858(Static129.aClass65_1216, Static110.aClass65_1038, Static16.aClass56_Sub1_24);
			} else {
				local17++;
			}
			if (Static40.aClass2_Sub1_Sub4_Sub1Array5 == null) {
				Static40.aClass2_Sub1_Sub4_Sub1Array5 = Static117.method1858(Static86.aClass65_810, Static110.aClass65_1038, Static16.aClass56_Sub1_24);
			} else {
				local17++;
			}
			if (Static17.aClass2_Sub1_Sub4_Sub1Array3 == null) {
				Static17.aClass2_Sub1_Sub4_Sub1Array3 = Static117.method1858(Static32.aClass65_354, Static110.aClass65_1038, Static16.aClass56_Sub1_24);
			} else {
				local17++;
			}
			if (Static84.aClass2_Sub1_Sub4_Sub1Array8 == null) {
				Static84.aClass2_Sub1_Sub4_Sub1Array8 = Static117.method1858(Static91.aClass65_857, Static110.aClass65_1038, Static16.aClass56_Sub1_24);
			} else {
				local17++;
			}
			if (Static16.aClass2_Sub1_Sub4_Sub1Array9 == null) {
				Static16.aClass2_Sub1_Sub4_Sub1Array9 = Static117.method1858(Static102.aClass65_971, Static110.aClass65_1038, Static16.aClass56_Sub1_24);
			} else {
				local17++;
			}
			if (Static69.aClass2_Sub1_Sub4_Sub1Array7 == null) {
				Static69.aClass2_Sub1_Sub4_Sub1Array7 = Static117.method1858(Static46.aClass65_512, Static110.aClass65_1038, Static16.aClass56_Sub1_24);
			} else {
				local17++;
			}
			if (Static34.aClass2_Sub1_Sub4_Sub1Array4 == null) {
				Static34.aClass2_Sub1_Sub4_Sub1Array4 = Static117.method1858(Static119.aClass65_839, Static110.aClass65_1038, Static16.aClass56_Sub1_24);
			} else {
				local17++;
			}
			if (Static52.aClass2_Sub1_Sub4_Sub2Array4 == null) {
				Static52.aClass2_Sub1_Sub4_Sub2Array4 = Static41.method729(Static16.aClass56_Sub1_24, Static114.aClass65_1082, Static110.aClass65_1038);
			} else {
				local17++;
			}
			if (Static99.aClass2_Sub1_Sub4_Sub2Array8 == null) {
				Static99.aClass2_Sub1_Sub4_Sub2Array8 = Static41.method729(Static16.aClass56_Sub1_24, Static32.aClass65_347, Static110.aClass65_1038);
			} else {
				local17++;
			}
			if (Static68.aClass2_Sub1_Sub4_Sub2_43 == null) {
				Static68.aClass2_Sub1_Sub4_Sub2_43 = Static56.method1073(Static16.aClass56_Sub1_24, Static110.aClass65_1038, Static56.aClass65_622);
			} else {
				local17++;
			}
			if (local17 < 14) {
				Static57.aClass65_626 = Static35.method647(new Class65[] { Static120.aClass65_1129, Static120.method1871(local17 * 100 / 14), Static93.aClass65_872 });
				Static9.anInt256 = 70;
			} else {
				Static55.aClass2_Sub1_Sub4_Sub2Array11 = Static99.aClass2_Sub1_Sub4_Sub2Array8;
				local54 = (int) (Math.random() * 21.0D) - 10;
				Static5.aClass2_Sub1_Sub4_Sub1_1.method448();
				local65 = (int) (Math.random() * 21.0D) - 10;
				local71 = (int) (Math.random() * 21.0D) - 10;
				local75 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(961) int local961 = 0; local961 < Static108.aClass2_Sub1_Sub4_Sub1Array11.length; local961++) {
					Static108.aClass2_Sub1_Sub4_Sub1Array11[local961].method460(local75 + local54, local65 - -local75, local71 + local75);
				}
				Static48.aClass2_Sub1_Sub4_Sub2Array3[0].method994(local75 + local54, local65 - -local75, local75 + local71);
				Static93.method1539();
				Static127.anInt2728 = 90;
				Static9.anInt256 = 70;
				Static57.aClass65_626 = Static73.aClass65_713;
			}
		} else if (Static127.anInt2728 == 90) {
			if (Static41.aClass56_Sub1_14.method1668()) {
				@Pc(1049) Class1 local1049 = new Class1(Static41.aClass56_Sub1_14, Static16.aClass56_Sub1_24, 20, 0.8D, Static48.aBoolean47 ? 64 : 128);
				Static87.method1436(local1049);
				Static87.method1432(0.8D);
				Static127.anInt2728 = 110;
				Static9.anInt256 = 90;
				Static57.aClass65_626 = Static129.aClass65_1215;
			} else {
				Static57.aClass65_626 = Static35.method647(new Class65[] { Static90.aClass65_846, Static120.method1871(Static41.aClass56_Sub1_14.method1699()), Static93.aClass65_872 });
				Static9.anInt256 = 90;
			}
		} else if (Static127.anInt2728 == 110) {
			Static17.aClass33_1 = new Class33();
			Static28.aClass20_2.method374(10, Static17.aClass33_1);
			Static57.aClass65_626 = Static102.aClass65_975;
			Static9.anInt256 = 94;
			Static127.anInt2728 = 120;
		} else if (Static127.anInt2728 == 120) {
			if (Static17.aClass56_Sub1_8.method1669(Static110.aClass65_1038, Static39.aClass65_406)) {
				@Pc(1114) Class14 local1114 = new Class14(Static17.aClass56_Sub1_8.method1682(Static110.aClass65_1038, Static39.aClass65_406));
				Static95.method1571(local1114);
				Static57.aClass65_626 = Static86.aClass65_801;
				Static9.anInt256 = 96;
				Static127.anInt2728 = 130;
			} else {
				Static57.aClass65_626 = Static35.method647(new Class65[] { Static37.aClass65_389, Static89.aClass65_840 });
				Static9.anInt256 = 96;
			}
		} else if (Static127.anInt2728 == 130) {
			if (!Static90.aClass56_Sub1_21.method1668()) {
				Static57.aClass65_626 = Static35.method647(new Class65[] { Static68.aClass65_1240, Static120.method1871(Static90.aClass56_Sub1_21.method1699() * 4 / 5), Static93.aClass65_872 });
				Static9.anInt256 = 100;
			} else if (!Static35.aClass56_Sub1_11.method1668()) {
				Static57.aClass65_626 = Static35.method647(new Class65[] { Static68.aClass65_1240, Static120.method1871(Static35.aClass56_Sub1_11.method1699() / 6 + 80), Static93.aClass65_872 });
				Static9.anInt256 = 100;
			} else if (Static86.aClass56_Sub1_18.method1668()) {
				Static127.anInt2728 = 140;
				Static9.anInt256 = 100;
				Static57.aClass65_626 = Static127.aClass65_1186;
			} else {
				Static57.aClass65_626 = Static35.method647(new Class65[] { Static68.aClass65_1240, Static120.method1871(Static86.aClass56_Sub1_18.method1699() / 20 + 96), Static93.aClass65_872 });
				Static9.anInt256 = 100;
			}
		} else if (Static127.anInt2728 == 140) {
			Static98.method1604(10);
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	public static void method13() {
		aClass65_2 = null;
		aClass2_Sub1_Sub4_Sub2_1 = null;
		aClass65_3 = null;
		aClass65_1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!wa;)Lclient!wa;")
	public static Class2_Sub22 method14(@OriginalArg(1) Class2_Sub22 arg0) {
		@Pc(12) Class2_Sub22 local12 = Static95.method1568(arg0);
		if (local12 == null) {
			local12 = arg0.aClass2_Sub22_18;
		}
		return local12;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BIII)Z")
	public static boolean method15(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg1 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static124.aClass49_1.method1159(Static59.anInt1479, arg2, arg0, arg1);
		if (local18 == -1) {
			return false;
		}
		@Pc(29) int local29 = local18 >> 6 & 0x3;
		@Pc(33) int local33 = local18 & 0x1F;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(70) Class2_Sub1_Sub15 local70 = Static73.method1248(local11);
			@Pc(80) int local80;
			@Pc(83) int local83;
			if (local29 == 0 || local29 == 2) {
				local83 = local70.anInt2689;
				local80 = local70.anInt2671;
			} else {
				local80 = local70.anInt2689;
				local83 = local70.anInt2671;
			}
			@Pc(94) int local94 = local70.anInt2660;
			if (local29 != 0) {
				local94 = (local94 << local29 & 0xF) + (local94 >> 4 - local29);
			}
			Static70.method1234(arg0, local83, 0, local80, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], local94, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], arg2, true);
		} else {
			Static70.method1234(arg0, 0, local29, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, local33 + 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], arg2, true);
		}
		Static14.anInt355 = 0;
		Static49.anInt1206 = Static96.anInt2190;
		Static97.anInt2215 = Static100.anInt2282;
		Static14.anInt351 = 2;
		return true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	public static void method16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static26.anInt631 == 2) {
			Static129.method1960(Static75.anInt2328 + (Static26.anInt630 - Static66.anInt1577 << 7), Static6.anInt186 * 2, Static88.anInt1888 + (Static76.anInt1703 - Static34.anInt791 << 7));
			if (Static112.anInt2513 > -1 && Static10.anInt2951 % 20 < 10) {
				Static84.aClass2_Sub1_Sub4_Sub1Array8[0].method461(Static112.anInt2513 + arg0 - 12, arg1 + Static84.anInt1814 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)V")
	public static void method17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static124.aClass49_1.method1175(arg3, arg2, arg0);
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(27) int local27;
		@Pc(55) int local55;
		@Pc(53) int local53;
		@Pc(68) int local68;
		if (local11 != 0) {
			local23 = Static124.aClass49_1.method1159(arg3, arg2, arg0, local11);
			local27 = local23 & 0x1F;
			local33 = local23 >> 6 & 0x3;
			@Pc(36) int[] local36 = Static114.aClass2_Sub1_Sub4_Sub1_5.anIntArray54;
			local53 = arg2 * 4 + (-(arg0 * 512) + 52736) * 4 + 24624;
			local55 = arg4;
			if (local11 > 0) {
				local55 = arg1;
			}
			local68 = local11 >> 14 & 0x7FFF;
			@Pc(72) Class2_Sub1_Sub15 local72 = Static73.method1248(local68);
			if (local72.anInt2691 == -1) {
				if (local27 == 0 || local27 == 2) {
					if (local33 == 0) {
						local36[local53] = local55;
						local36[local53 + 512] = local55;
						local36[local53 + 1024] = local55;
						local36[local53 + 1536] = local55;
					} else if (local33 == 1) {
						local36[local53] = local55;
						local36[local53 + 1] = local55;
						local36[local53 + 2] = local55;
						local36[local53 + 3] = local55;
					} else if (local33 == 2) {
						local36[local53 + 3] = local55;
						local36[local53 + 515] = local55;
						local36[local53 + 3 + 1024] = local55;
						local36[local53 + 1536 + 3] = local55;
					} else if (local33 == 3) {
						local36[local53 + 1536] = local55;
						local36[local53 + 1 + 1536] = local55;
						local36[local53 + 1536 + 2] = local55;
						local36[local53 + 1539] = local55;
					}
				}
				if (local27 == 3) {
					if (local33 == 0) {
						local36[local53] = local55;
					} else if (local33 == 1) {
						local36[local53 + 3] = local55;
					} else if (local33 == 2) {
						local36[local53 + 1539] = local55;
					} else if (local33 == 3) {
						local36[local53 + 1536] = local55;
					}
				}
				if (local27 == 2) {
					if (local33 == 3) {
						local36[local53] = local55;
						local36[local53 + 512] = local55;
						local36[local53 + 1024] = local55;
						local36[local53 + 1536] = local55;
					} else if (local33 == 0) {
						local36[local53] = local55;
						local36[local53 + 1] = local55;
						local36[local53 + 2] = local55;
						local36[local53 + 3] = local55;
					} else if (local33 == 1) {
						local36[local53 + 3] = local55;
						local36[local53 + 3 + 512] = local55;
						local36[local53 + 3 + 1024] = local55;
						local36[local53 + 3 + 1536] = local55;
					} else if (local33 == 2) {
						local36[local53 + 1536] = local55;
						local36[local53 + 1 + 1536] = local55;
						local36[local53 + 2 + 1536] = local55;
						local36[local53 + 1536 + 3] = local55;
					}
				}
			} else {
				@Pc(388) Class2_Sub1_Sub4_Sub2 local388 = Static48.aClass2_Sub1_Sub4_Sub2Array3[local72.anInt2691];
				if (local388 != null) {
					@Pc(401) int local401 = (local72.anInt2671 * 4 - local388.anInt1370) / 2;
					@Pc(412) int local412 = (local72.anInt2689 * 4 - local388.anInt1367) / 2;
					local388.method996(arg2 * 4 + local401 + 48, (-arg0 + 104 + -local72.anInt2689) * 4 + 48 + local412);
				}
			}
		}
		local11 = Static124.aClass49_1.method1176(arg3, arg2, arg0);
		if (local11 != 0) {
			local23 = Static124.aClass49_1.method1159(arg3, arg2, arg0, local11);
			local33 = local23 >> 6 & 0x3;
			local27 = local23 & 0x1F;
			local55 = local11 >> 14 & 0x7FFF;
			@Pc(472) Class2_Sub1_Sub15 local472 = Static73.method1248(local55);
			@Pc(494) int local494;
			if (local472.anInt2691 != -1) {
				@Pc(482) Class2_Sub1_Sub4_Sub2 local482 = Static48.aClass2_Sub1_Sub4_Sub2Array3[local472.anInt2691];
				if (local482 != null) {
					local494 = (local472.anInt2689 * 4 - local482.anInt1367) / 2;
					local68 = (local472.anInt2671 * 4 - local482.anInt1370) / 2;
					local482.method996(arg2 * 4 + local68 + 48, 48 - (-((-local472.anInt2689 + -arg0 + 104) * 4) - local494));
				}
			} else if (local27 == 9) {
				@Pc(538) int[] local538 = Static114.aClass2_Sub1_Sub4_Sub1_5.anIntArray54;
				local53 = 15658734;
				local494 = (52736 - arg0 * 512) * 4 + arg2 * 4 + 24624;
				if (local11 > 0) {
					local53 = 15597568;
				}
				if (local33 == 0 || local33 == 2) {
					local538[local494 + 1536] = local53;
					local538[local494 + 1024 + 1] = local53;
					local538[local494 + 512 + 2] = local53;
					local538[local494 + 3] = local53;
				} else {
					local538[local494] = local53;
					local538[local494 + 512 + 1] = local53;
					local538[local494 + 1026] = local53;
					local538[local494 + 1539] = local53;
				}
			}
		}
		local11 = Static124.aClass49_1.method1170(arg3, arg2, arg0);
		if (local11 == 0) {
			return;
		}
		local23 = local11 >> 14 & 0x7FFF;
		@Pc(649) Class2_Sub1_Sub15 local649 = Static73.method1248(local23);
		if (local649.anInt2691 == -1) {
			return;
		}
		@Pc(659) Class2_Sub1_Sub4_Sub2 local659 = Static48.aClass2_Sub1_Sub4_Sub2Array3[local649.anInt2691];
		if (local659 != null) {
			@Pc(672) int local672 = (local649.anInt2689 * 4 - local659.anInt1367) / 2;
			local55 = (local649.anInt2671 * 4 - local659.anInt1370) / 2;
			local659.method996(local55 + arg2 * 4 + 48, (-arg0 + 104 + -local649.anInt2689) * 4 + 48 + local672);
			return;
		}
	}
}
