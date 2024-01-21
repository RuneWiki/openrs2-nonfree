import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "J")
	public static long aLong179;

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "[I")
	public static int[] anIntArray397;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "[I")
	public static int[] anIntArray396 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "Lclient!sc;")
	public static Class72 aClass72_49 = new Class72();

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
	public static int anInt3783 = 0;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2018 = Static122.method531("title_mute");

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "Lclient!sd;")
	private static Class73 aClass73_2019 = Static122.method531("Select a world");

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "Lclient!sd;")
	private static Class73 aClass73_2022 = Static122.method531("yellow:");

	@OriginalMember(owner = "client!bh", name = "H", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2020 = aClass73_2022;

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2021 = aClass73_2022;

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2023 = aClass73_2019;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
	public static void method2682() {
		try {
			if (Static76.aClass27_1 == null) {
				Static76.aClass27_1 = new Class27(Static32.aClass39_2, Static19.method372(new Class73[] { Static151.aClass73_1829, Static173.aClass73_2031, Static45.aClass73_616 }).method2441());
			} else {
				@Pc(40) byte[] local40 = Static76.aClass27_1.method971();
				if (local40 != null) {
					@Pc(47) Class3_Sub12 local47 = new Class3_Sub12(local40);
					Static94.anInt2073 = local47.method1359();
					Static9.aClass62Array1 = new Class62[Static94.anInt2073];
					for (@Pc(56) int local56 = 0; local56 < Static94.anInt2073; local56++) {
						@Pc(66) Class62 local66 = Static9.aClass62Array1[local56] = new Class62();
						@Pc(70) int local70 = local47.method1359();
						local66.aBoolean196 = (local70 & 0x8000) != 0;
						local66.anInt2963 = local70 & 0x7FFF;
						local66.aClass73_1658 = local47.method1390();
						local66.anInt2970 = local47.method1375();
						local66.anInt2972 = local56;
						local66.anInt2962 = Static155.method2492(local66.aClass73_1658);
					}
					Static69.method1226(Static9.aClass62Array1, Static9.aClass62Array1.length - 1, 0, Static148.anIntArray363, Static12.anIntArray13);
					Static76.aClass27_1 = null;
					Static105.aBoolean159 = true;
				}
			}
		} catch (@Pc(130) Exception local130) {
			local130.printStackTrace();
			Static76.aClass27_1 = null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
	public static void method2683() {
		Static129.aClass7_21.method190();
	}

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V")
	public static void method2684() {
		@Pc(20) int local20;
		if (Static142.anInt3266 == 0) {
			Static119.aClass35_1 = new Class35(4, 104, 104, Static65.anIntArrayArrayArray5);
			for (local20 = 0; local20 < 4; local20++) {
				Static41.aClass60Array1[local20] = new Class60(104, 104);
			}
			Static8.aClass3_Sub1_Sub3_Sub4_3 = new Class3_Sub1_Sub3_Sub4(512, 512);
			Static142.anInt3266 = 20;
			Static12.aClass73_173 = Static138.aClass73_1750;
			Static135.anInt3086 = 5;
			return;
		}
		@Pc(57) int local57;
		@Pc(67) int local67;
		@Pc(78) int local78;
		@Pc(71) int local71;
		if (Static142.anInt3266 == 20) {
			@Pc(55) int[] local55 = new int[9];
			for (local57 = 0; local57 < 9; local57++) {
				local67 = local57 * 32 + 128 + 15;
				local71 = Class3_Sub1_Sub3_Sub2.anIntArray87[local67];
				local78 = local67 * 3 + 600;
				local55[local57] = local78 * local71 >> 16;
			}
			Static64.method1153(local55);
			Static12.aClass73_173 = Static166.aClass73_1958;
			Static135.anInt3086 = 10;
			Static142.anInt3266 = 30;
		} else if (Static142.anInt3266 == 30) {
			Static150.aClass13_Sub1_19 = Static142.method2362(true, false, 0, true);
			Static153.aClass13_Sub1_18 = Static142.method2362(true, false, 1, true);
			Static84.aClass13_Sub1_9 = Static142.method2362(true, true, 2, false);
			Static57.aClass13_Sub1_6 = Static142.method2362(true, false, 3, true);
			Static129.aClass13_Sub1_16 = Static142.method2362(true, false, 4, true);
			Static125.aClass13_Sub1_15 = Static142.method2362(true, true, 5, true);
			Static11.aClass13_Sub1_4 = Static142.method2362(false, true, 6, true);
			Static86.aClass13_Sub1_10 = Static142.method2362(true, false, 7, true);
			Static3.aClass13_Sub1_1 = Static142.method2362(true, false, 8, true);
			Static108.aClass13_Sub1_12 = Static142.method2362(true, true, 9, false);
			Static58.aClass13_Sub1_7 = Static142.method2362(true, false, 10, true);
			Static16.aClass13_Sub1_5 = Static142.method2362(true, false, 11, true);
			Static117.aClass13_Sub1_13 = Static142.method2362(true, false, 12, true);
			Static179.aClass13_Sub1_20 = Static142.method2362(true, true, 13, false);
			Static121.aClass13_Sub1_14 = Static142.method2362(false, false, 14, true);
			Static93.aClass13_Sub1_11 = Static142.method2362(true, false, 15, true);
			Static142.anInt3266 = 40;
			Static135.anInt3086 = 20;
			Static12.aClass73_173 = Static112.aClass73_1532;
		} else if (Static142.anInt3266 == 40) {
			local20 = Static150.aClass13_Sub1_19.method378() * 4 / 100;
			local20 += Static153.aClass13_Sub1_18.method378() * 4 / 100;
			local20 += Static84.aClass13_Sub1_9.method378() * 2 / 100;
			local20 += Static57.aClass13_Sub1_6.method378() * 2 / 100;
			local20 += Static129.aClass13_Sub1_16.method378() * 6 / 100;
			local20 += Static125.aClass13_Sub1_15.method378() * 4 / 100;
			local20 += Static11.aClass13_Sub1_4.method378() * 2 / 100;
			local20 += Static86.aClass13_Sub1_10.method378() * 60 / 100;
			local20 += Static3.aClass13_Sub1_1.method378() * 2 / 100;
			local20 += Static108.aClass13_Sub1_12.method378() * 2 / 100;
			local20 += Static58.aClass13_Sub1_7.method378() * 2 / 100;
			local20 += Static16.aClass13_Sub1_5.method378() * 2 / 100;
			local20 += Static117.aClass13_Sub1_13.method378() * 2 / 100;
			local20 += Static179.aClass13_Sub1_20.method378() * 2 / 100;
			local20 += Static121.aClass13_Sub1_14.method378() * 2 / 100;
			local20 += Static93.aClass13_Sub1_11.method378() * 2 / 100;
			if (local20 == 100) {
				Static142.anInt3266 = 45;
				Static12.aClass73_173 = Static19.aClass73_288;
				Static135.anInt3086 = 30;
			} else {
				if (local20 != 0) {
					Static12.aClass73_173 = Static19.method372(new Class73[] { Static47.aClass73_961, Static154.method2485(local20), Static30.aClass73_446 });
				}
				Static135.anInt3086 = 30;
			}
		} else if (Static142.anInt3266 == 45) {
			Static85.method1508(!Static85.aBoolean127);
			@Pc(444) Class3_Sub9_Sub2 local444 = new Class3_Sub9_Sub2();
			local444.method908();
			Static79.aClass5_1 = Static22.method471(22050, Static102.aCanvas1, 0, Static32.aClass39_2);
			Static79.aClass5_1.method2605(local444);
			Static35.method621(Static93.aClass13_Sub1_11, Static129.aClass13_Sub1_16, Static121.aClass13_Sub1_14, local444);
			Static137.aClass5_2 = Static22.method471(2048, Static102.aCanvas1, 1, Static32.aClass39_2);
			Static11.aClass3_Sub9_Sub4_1 = new Class3_Sub9_Sub4();
			Static137.aClass5_2.method2605(Static11.aClass3_Sub9_Sub4_1);
			Static127.aClass44_2 = new Class44(22050, Static143.anInt3288);
			Static12.aClass73_173 = Static164.aClass73_1943;
			Static135.anInt3086 = 35;
			Static142.anInt3266 = 50;
		} else if (Static142.anInt3266 == 50) {
			local20 = 0;
			if (Static142.aClass3_Sub1_Sub3_Sub1_Sub1_5 == null) {
				Static142.aClass3_Sub1_Sub3_Sub1_Sub1_5 = Static20.method398(Static179.aClass13_Sub1_20, Static97.aClass73_1240, Static173.aClass73_2030, Static3.aClass13_Sub1_1);
			} else {
				local20++;
			}
			if (Static138.aClass3_Sub1_Sub3_Sub1_Sub1_4 == null) {
				Static138.aClass3_Sub1_Sub3_Sub1_Sub1_4 = Static142.aClass3_Sub1_Sub3_Sub1_Sub1_5;
			} else {
				local20++;
			}
			if (Static82.aClass3_Sub1_Sub3_Sub1_Sub1_1 == null) {
				Static82.aClass3_Sub1_Sub3_Sub1_Sub1_1 = Static20.method398(Static179.aClass13_Sub1_20, Static168.aClass73_1974, Static173.aClass73_2030, Static3.aClass13_Sub1_1);
			} else {
				local20++;
			}
			if (Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2 == null) {
				Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2 = Static20.method398(Static179.aClass13_Sub1_20, Static130.aClass73_1659, Static173.aClass73_2030, Static3.aClass13_Sub1_1);
			} else {
				local20++;
			}
			if (local20 < 4) {
				Static12.aClass73_173 = Static19.method372(new Class73[] { Static176.aClass73_2056, Static154.method2485(local20 * 100 / 4), Static30.aClass73_446 });
				Static135.anInt3086 = 40;
			} else {
				Static12.aClass73_173 = Static91.aClass73_1157;
				Static135.anInt3086 = 40;
				Static142.anInt3266 = 60;
			}
		} else if (Static142.anInt3266 == 60) {
			local20 = Static54.method970(Static58.aClass13_Sub1_7, Static3.aClass13_Sub1_1);
			local57 = Static125.method2122();
			if (local20 < local57) {
				Static12.aClass73_173 = Static19.method372(new Class73[] { Static8.aClass73_133, Static154.method2485(local20 * 100 / local57), Static30.aClass73_446 });
				Static135.anInt3086 = 50;
			} else {
				Static12.aClass73_173 = Static149.aClass73_1827;
				Static135.anInt3086 = 50;
				Static78.method1320(5);
				Static142.anInt3266 = 70;
			}
		} else if (Static142.anInt3266 == 70) {
			if (Static84.aClass13_Sub1_9.method346()) {
				Static146.method2393(Static84.aClass13_Sub1_9);
				Static163.method2268(Static84.aClass13_Sub1_9);
				Static103.method1796(Static86.aClass13_Sub1_10, Static84.aClass13_Sub1_9);
				Static45.method807(Static85.aBoolean127, Static84.aClass13_Sub1_9, Static86.aClass13_Sub1_10);
				Static160.method2531(Static86.aClass13_Sub1_10, Static84.aClass13_Sub1_9);
				Static32.method602(Static84.aClass13_Sub1_9, Static138.aClass3_Sub1_Sub3_Sub1_Sub1_4, Static109.aBoolean173, Static86.aClass13_Sub1_10);
				Static4.method48(Static153.aClass13_Sub1_18, Static150.aClass13_Sub1_19, Static84.aClass13_Sub1_9);
				Static92.method1596(Static84.aClass13_Sub1_9, Static86.aClass13_Sub1_10);
				Static10.method178(Static84.aClass13_Sub1_9);
				Static115.method2040(Static84.aClass13_Sub1_9);
				Static71.method1257(Static3.aClass13_Sub1_1, Static86.aClass13_Sub1_10, Static179.aClass13_Sub1_20, Static57.aClass13_Sub1_6);
				Static31.method596(Static84.aClass13_Sub1_9);
				Static12.method193(Static84.aClass13_Sub1_9);
				Static12.aClass73_173 = Static69.aClass73_866;
				Static142.anInt3266 = 80;
				Static135.anInt3086 = 60;
			} else {
				Static12.aClass73_173 = Static19.method372(new Class73[] { Static148.aClass73_1814, Static154.method2485(Static84.aClass13_Sub1_9.method374()), Static30.aClass73_446 });
				Static135.anInt3086 = 60;
			}
		} else if (Static142.anInt3266 == 80) {
			local20 = 0;
			if (Static94.aClass3_Sub1_Sub3_Sub4_22 == null) {
				Static94.aClass3_Sub1_Sub3_Sub4_22 = Static6.method101(Static172.aClass73_2026, Static173.aClass73_2030, Static3.aClass13_Sub1_1);
			} else {
				local20++;
			}
			if (Static110.aClass3_Sub1_Sub3_Sub4_32 == null) {
				Static110.aClass3_Sub1_Sub3_Sub4_32 = Static6.method101(Static97.aClass73_1236, Static173.aClass73_2030, Static3.aClass13_Sub1_1);
			} else {
				local20++;
			}
			if (Static170.aClass3_Sub1_Sub3_Sub3Array44 == null) {
				Static170.aClass3_Sub1_Sub3_Sub3Array44 = Static74.method1287(Static3.aClass13_Sub1_1, Static173.aClass73_2030, Static48.aClass73_648);
			} else {
				local20++;
			}
			if (Static104.aClass3_Sub1_Sub3_Sub4Array8 == null) {
				Static104.aClass3_Sub1_Sub3_Sub4Array8 = Static158.method2523(Static173.aClass73_2030, Static155.aClass73_1862, Static3.aClass13_Sub1_1);
			} else {
				local20++;
			}
			if (Static173.aClass3_Sub1_Sub3_Sub4Array11 == null) {
				Static173.aClass3_Sub1_Sub3_Sub4Array11 = Static158.method2523(Static173.aClass73_2030, Static100.aClass73_1264, Static3.aClass13_Sub1_1);
			} else {
				local20++;
			}
			if (Static100.aClass3_Sub1_Sub3_Sub4Array7 == null) {
				Static100.aClass3_Sub1_Sub3_Sub4Array7 = Static158.method2523(Static173.aClass73_2030, Static55.aClass73_713, Static3.aClass13_Sub1_1);
			} else {
				local20++;
			}
			if (Static108.aClass3_Sub1_Sub3_Sub4Array9 == null) {
				Static108.aClass3_Sub1_Sub3_Sub4Array9 = Static158.method2523(Static173.aClass73_2030, Static97.aClass73_1239, Static3.aClass13_Sub1_1);
			} else {
				local20++;
			}
			if (Static141.aClass3_Sub1_Sub3_Sub4Array10 == null) {
				Static141.aClass3_Sub1_Sub3_Sub4Array10 = Static158.method2523(Static173.aClass73_2030, Static80.aClass73_966, Static3.aClass13_Sub1_1);
			} else {
				local20++;
			}
			if (Static12.aClass3_Sub1_Sub3_Sub4Array2 == null) {
				Static12.aClass3_Sub1_Sub3_Sub4Array2 = Static158.method2523(Static173.aClass73_2030, Static164.aClass73_1939, Static3.aClass13_Sub1_1);
			} else {
				local20++;
			}
			if (Static99.aClass3_Sub1_Sub3_Sub4Array6 == null) {
				Static99.aClass3_Sub1_Sub3_Sub4Array6 = Static158.method2523(Static173.aClass73_2030, Static134.aClass73_1700, Static3.aClass13_Sub1_1);
			} else {
				local20++;
			}
			if (Static5.aClass3_Sub1_Sub3_Sub4Array1 == null) {
				Static5.aClass3_Sub1_Sub3_Sub4Array1 = Static158.method2523(Static173.aClass73_2030, Static117.aClass73_1569, Static3.aClass13_Sub1_1);
			} else {
				local20++;
			}
			if (Static105.aClass3_Sub1_Sub3_Sub3Array33 == null) {
				Static105.aClass3_Sub1_Sub3_Sub3Array33 = Static74.method1287(Static3.aClass13_Sub1_1, Static173.aClass73_2030, Static171.aClass73_2009);
			} else {
				local20++;
			}
			if (Static53.aClass3_Sub1_Sub3_Sub3Array49 == null) {
				Static53.aClass3_Sub1_Sub3_Sub3Array49 = Static74.method1287(Static3.aClass13_Sub1_1, Static173.aClass73_2030, Static32.aClass73_478);
			} else {
				local20++;
			}
			if (Static84.aClass3_Sub1_Sub3_Sub3_6 == null) {
				Static84.aClass3_Sub1_Sub3_Sub3_6 = Static16.method298(Static173.aClass73_2030, Static3.aClass13_Sub1_1, Static157.aClass73_1885);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static12.aClass73_173 = Static19.method372(new Class73[] { Static84.aClass73_1015, Static154.method2485(local20 * 100 / 14), Static30.aClass73_446 });
				Static135.anInt3086 = 70;
			} else {
				Static21.aClass3_Sub1_Sub3_Sub3Array14 = Static53.aClass3_Sub1_Sub3_Sub3Array49;
				local57 = (int) (Math.random() * 21.0D) - 10;
				local67 = (int) (Math.random() * 21.0D) - 10;
				local78 = (int) (Math.random() * 21.0D) - 10;
				local71 = (int) (Math.random() * 41.0D) - 20;
				Static110.aClass3_Sub1_Sub3_Sub4_32.method2327();
				for (@Pc(949) int local949 = 0; local949 < Static104.aClass3_Sub1_Sub3_Sub4Array8.length; local949++) {
					Static104.aClass3_Sub1_Sub3_Sub4Array8[local949].method2328(local57 + local71, local67 - -local71, local71 + local78);
				}
				Static170.aClass3_Sub1_Sub3_Sub3Array44[0].method1492(local57 + local71, local71 + local67, local78 + local71);
				Static111.method2020();
				Static135.anInt3086 = 70;
				Static12.aClass73_173 = Static27.aClass73_420;
				Static142.anInt3266 = 90;
			}
		} else if (Static142.anInt3266 == 90) {
			if (Static108.aClass13_Sub1_12.method346()) {
				@Pc(1046) Class53 local1046 = new Class53(Static108.aClass13_Sub1_12, Static3.aClass13_Sub1_1, 20, Static85.aBoolean127 ? 64 : 128);
				Static36.method656(local1046);
				Static36.method663(0.7F);
				Static142.anInt3266 = 110;
				Static135.anInt3086 = 90;
				Static12.aClass73_173 = Static50.aClass73_657;
			} else {
				Static12.aClass73_173 = Static19.method372(new Class73[] { Static129.aClass73_1657, Static154.method2485(Static108.aClass13_Sub1_12.method374()), Static30.aClass73_446 });
				Static135.anInt3086 = 90;
			}
		} else if (Static142.anInt3266 == 110) {
			Static87.aClass54_1 = new Class54();
			Static32.aClass39_2.method1232(Static87.aClass54_1, 10);
			Static142.anInt3266 = 120;
			Static12.aClass73_173 = Static2.aClass73_3;
			Static135.anInt3086 = 94;
		} else if (Static142.anInt3266 == 120) {
			if (Static58.aClass13_Sub1_7.method365(Static173.aClass73_2030, Static50.aClass73_658)) {
				@Pc(1113) Class58 local1113 = new Class58(Static58.aClass13_Sub1_7.method354(Static50.aClass73_658, Static173.aClass73_2030));
				Static148.method2427(local1113);
				Static135.anInt3086 = 96;
				Static12.aClass73_173 = Static109.aClass73_1465;
				Static142.anInt3266 = 130;
			} else {
				Static12.aClass73_173 = Static19.method372(new Class73[] { Static3.aClass73_43, Static95.aClass73_1199 });
				Static135.anInt3086 = 96;
			}
		} else if (Static142.anInt3266 == 130) {
			if (!Static57.aClass13_Sub1_6.method346()) {
				Static12.aClass73_173 = Static19.method372(new Class73[] { Static69.aClass73_868, Static154.method2485(Static57.aClass13_Sub1_6.method374() * 4 / 5), Static30.aClass73_446 });
				Static135.anInt3086 = 100;
			} else if (!Static117.aClass13_Sub1_13.method346()) {
				Static12.aClass73_173 = Static19.method372(new Class73[] { Static69.aClass73_868, Static154.method2485(Static117.aClass13_Sub1_13.method374() / 6 + 80), Static30.aClass73_446 });
				Static135.anInt3086 = 100;
			} else if (Static179.aClass13_Sub1_20.method346()) {
				Static12.aClass73_173 = Static81.aClass73_968;
				Static142.anInt3266 = 140;
				Static135.anInt3086 = 100;
			} else {
				Static12.aClass73_173 = Static19.method372(new Class73[] { Static69.aClass73_868, Static154.method2485(Static179.aClass13_Sub1_20.method374() / 20 + 96), Static30.aClass73_446 });
				Static135.anInt3086 = 100;
			}
		} else if (Static142.anInt3266 == 140) {
			Static78.method1320(10);
		}
	}

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)V")
	public static void method2685() {
		aClass73_2020 = null;
		anIntArray397 = null;
		aClass73_2019 = null;
		aClass73_2022 = null;
		aClass73_2021 = null;
		anIntArray396 = null;
		aClass73_2023 = null;
		aClass73_2018 = null;
		aClass72_49 = null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Z")
	public static boolean method2686(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!i;IIIIILclient!pf;III)V")
	public static void method2687(@OriginalArg(0) Class35 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class60 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) Class3_Sub1_Sub15 local9 = Static151.method2466(arg6);
		@Pc(23) int local23;
		@Pc(20) int local20;
		if (arg7 == 1 || arg7 == 3) {
			local20 = local9.anInt3012;
			local23 = local9.anInt3014;
		} else {
			local23 = local9.anInt3012;
			local20 = local9.anInt3014;
		}
		@Pc(40) int local40;
		@Pc(44) int local44;
		if (local23 + arg8 > 104) {
			local40 = arg8;
			local44 = arg8 + 1;
		} else {
			local40 = (local23 >> 1) + arg8;
			local44 = (local23 + 1 >> 1) + arg8;
		}
		@Pc(64) int[][] local64 = Static65.anIntArrayArrayArray5[arg2];
		@Pc(85) int local85;
		@Pc(79) int local79;
		if (arg4 + local20 <= 104) {
			local79 = (local20 + 1 >> 1) + arg4;
			local85 = (local20 >> 1) + arg4;
		} else {
			local79 = arg4 + 1;
			local85 = arg4;
		}
		@Pc(119) int local119 = local64[local44][local79] + local64[local40][local79] + local64[local40][local85] + local64[local44][local85] >> 2;
		@Pc(127) int local127 = (local23 << 6) + (arg8 << 7);
		@Pc(135) int local135 = (local20 << 6) + (arg4 << 7);
		@Pc(141) int local141 = arg3 + (arg7 << 6);
		if (local9.anInt3032 == 1) {
			local141 += 256;
		}
		@Pc(161) int local161 = (arg4 << 7) + arg8 + (arg6 << 14) + 1073741824;
		if (local9.anInt3017 == 0) {
			local161 += Integer.MIN_VALUE;
		}
		@Pc(197) Class3_Sub1_Sub4 local197;
		if (arg3 == 22) {
			if (local9.anInt3022 == -1 && local9.anIntArray314 == null) {
				local197 = local9.method2194(local64, local127, local119, arg7, 22, local135);
			} else {
				local197 = new Class3_Sub1_Sub4_Sub6(arg6, 22, arg7, arg2, arg8, arg4, local9.anInt3022, true, null);
			}
			arg0.method1145(arg1, arg8, arg4, local119, local197, local161, local141);
			if (local9.anInt3008 == 1) {
				arg5.method2148(arg4, arg8);
			}
		} else if (arg3 == 10 || arg3 == 11) {
			if (local9.anInt3022 == -1 && local9.anIntArray314 == null) {
				local197 = local9.method2194(local64, local127, local119, arg7, 10, local135);
			} else {
				local197 = new Class3_Sub1_Sub4_Sub6(arg6, 10, arg7, arg2, arg8, arg4, local9.anInt3022, true, null);
			}
			if (local197 != null) {
				arg0.method1161(arg1, arg8, arg4, local119, local23, local20, local197, arg3 == 11 ? 256 : 0, local161, local141);
			}
			if (local9.anInt3008 != 0) {
				arg5.method2160(arg4, local9.aBoolean205, local20, local23, arg8);
			}
		} else if (arg3 >= 12) {
			if (local9.anInt3022 == -1 && local9.anIntArray314 == null) {
				local197 = local9.method2194(local64, local127, local119, arg7, arg3, local135);
			} else {
				local197 = new Class3_Sub1_Sub4_Sub6(arg6, arg3, arg7, arg2, arg8, arg4, local9.anInt3022, true, null);
			}
			arg0.method1161(arg1, arg8, arg4, local119, 1, 1, local197, 0, local161, local141);
			if (local9.anInt3008 != 0) {
				arg5.method2160(arg4, local9.aBoolean205, local20, local23, arg8);
			}
		} else if (arg3 == 0) {
			if (local9.anInt3022 == -1 && local9.anIntArray314 == null) {
				local197 = local9.method2194(local64, local127, local119, arg7, 0, local135);
			} else {
				local197 = new Class3_Sub1_Sub4_Sub6(arg6, 0, arg7, arg2, arg8, arg4, local9.anInt3022, true, null);
			}
			arg0.method1146(arg1, arg8, arg4, local119, local197, null, Static50.anIntArray116[arg7], 0, local161, local141);
			if (local9.anInt3008 != 0) {
				arg5.method2154(arg3, local9.aBoolean205, arg8, arg7, arg4);
			}
		} else if (arg3 == 1) {
			if (local9.anInt3022 == -1 && local9.anIntArray314 == null) {
				local197 = local9.method2194(local64, local127, local119, arg7, 1, local135);
			} else {
				local197 = new Class3_Sub1_Sub4_Sub6(arg6, 1, arg7, arg2, arg8, arg4, local9.anInt3022, true, null);
			}
			arg0.method1146(arg1, arg8, arg4, local119, local197, null, Static138.anIntArray332[arg7], 0, local161, local141);
			if (local9.anInt3008 != 0) {
				arg5.method2154(arg3, local9.aBoolean205, arg8, arg7, arg4);
			}
		} else {
			@Pc(547) Class3_Sub1_Sub4 local547;
			@Pc(509) int local509;
			if (arg3 == 2) {
				local509 = arg7 + 1 & 0x3;
				@Pc(533) Class3_Sub1_Sub4 local533;
				if (local9.anInt3022 == -1 && local9.anIntArray314 == null) {
					local533 = local9.method2194(local64, local127, local119, arg7 + 4, 2, local135);
					local547 = local9.method2194(local64, local127, local119, local509, 2, local135);
				} else {
					local533 = new Class3_Sub1_Sub4_Sub6(arg6, 2, arg7 + 4, arg2, arg8, arg4, local9.anInt3022, true, null);
					local547 = new Class3_Sub1_Sub4_Sub6(arg6, 2, local509, arg2, arg8, arg4, local9.anInt3022, true, null);
				}
				arg0.method1146(arg1, arg8, arg4, local119, local533, local547, Static50.anIntArray116[arg7], Static50.anIntArray116[local509], local161, local141);
				if (local9.anInt3008 != 0) {
					arg5.method2154(arg3, local9.aBoolean205, arg8, arg7, arg4);
				}
			} else if (arg3 == 3) {
				if (local9.anInt3022 == -1 && local9.anIntArray314 == null) {
					local197 = local9.method2194(local64, local127, local119, arg7, 3, local135);
				} else {
					local197 = new Class3_Sub1_Sub4_Sub6(arg6, 3, arg7, arg2, arg8, arg4, local9.anInt3022, true, null);
				}
				arg0.method1146(arg1, arg8, arg4, local119, local197, null, Static138.anIntArray332[arg7], 0, local161, local141);
				if (local9.anInt3008 != 0) {
					arg5.method2154(arg3, local9.aBoolean205, arg8, arg7, arg4);
				}
			} else if (arg3 == 9) {
				if (local9.anInt3022 == -1 && local9.anIntArray314 == null) {
					local197 = local9.method2194(local64, local127, local119, arg7, arg3, local135);
				} else {
					local197 = new Class3_Sub1_Sub4_Sub6(arg6, arg3, arg7, arg2, arg8, arg4, local9.anInt3022, true, null);
				}
				arg0.method1161(arg1, arg8, arg4, local119, 1, 1, local197, 0, local161, local141);
				if (local9.anInt3008 != 0) {
					arg5.method2160(arg4, local9.aBoolean205, local20, local23, arg8);
				}
			} else if (arg3 == 4) {
				if (local9.anInt3022 == -1 && local9.anIntArray314 == null) {
					local197 = local9.method2194(local64, local127, local119, arg7, 4, local135);
				} else {
					local197 = new Class3_Sub1_Sub4_Sub6(arg6, 4, arg7, arg2, arg8, arg4, local9.anInt3022, true, null);
				}
				arg0.method1170(arg1, arg8, arg4, local119, local197, null, Static50.anIntArray116[arg7], 0, 0, 0, local161, local141);
			} else {
				@Pc(806) int local806;
				if (arg3 == 5) {
					local806 = arg0.method1149(arg1, arg8, arg4);
					local509 = 16;
					if (local806 != 0) {
						local509 = Static151.method2466(local806 >> 14 & 0x7FFF).anInt3011;
					}
					if (local9.anInt3022 == -1 && local9.anIntArray314 == null) {
						local547 = local9.method2194(local64, local127, local119, arg7, 4, local135);
					} else {
						local547 = new Class3_Sub1_Sub4_Sub6(arg6, 4, arg7, arg2, arg8, arg4, local9.anInt3022, true, null);
					}
					arg0.method1170(arg1, arg8, arg4, local119, local547, null, Static50.anIntArray116[arg7], 0, Static111.anIntArray300[arg7] * local509, Static41.anIntArray93[arg7] * local509, local161, local141);
				} else if (arg3 == 6) {
					local509 = 8;
					local806 = arg0.method1149(arg1, arg8, arg4);
					if (local806 != 0) {
						local509 = Static151.method2466(local806 >> 14 & 0x7FFF).anInt3011 / 2;
					}
					if (local9.anInt3022 == -1 && local9.anIntArray314 == null) {
						local547 = local9.method2194(local64, local127, local119, arg7 + 4, 4, local135);
					} else {
						local547 = new Class3_Sub1_Sub4_Sub6(arg6, 4, arg7 + 4, arg2, arg8, arg4, local9.anInt3022, true, null);
					}
					arg0.method1170(arg1, arg8, arg4, local119, local547, null, 256, arg7, local509 * anIntArray396[arg7], local509 * Static46.anIntArray98[arg7], local161, local141);
				} else if (arg3 == 7) {
					local806 = arg7 + 2 & 0x3;
					if (local9.anInt3022 == -1 && local9.anIntArray314 == null) {
						local197 = local9.method2194(local64, local127, local119, local806 + 4, 4, local135);
					} else {
						local197 = new Class3_Sub1_Sub4_Sub6(arg6, 4, local806 + 4, arg2, arg8, arg4, local9.anInt3022, true, null);
					}
					arg0.method1170(arg1, arg8, arg4, local119, local197, null, 256, local806, 0, 0, local161, local141);
				} else if (arg3 == 8) {
					local509 = 8;
					local806 = arg0.method1149(arg1, arg8, arg4);
					if (local806 != 0) {
						local509 = Static151.method2466(local806 >> 14 & 0x7FFF).anInt3011 / 2;
					}
					@Pc(1056) int local1056 = arg7 + 2 & 0x3;
					@Pc(1087) Class3_Sub1_Sub4 local1087;
					if (local9.anInt3022 == -1 && local9.anIntArray314 == null) {
						local547 = local9.method2194(local64, local127, local119, arg7 + 4, 4, local135);
						local1087 = local9.method2194(local64, local127, local119, local1056 + 4, 4, local135);
					} else {
						local547 = new Class3_Sub1_Sub4_Sub6(arg6, 4, arg7 + 4, arg2, arg8, arg4, local9.anInt3022, true, null);
						local1087 = new Class3_Sub1_Sub4_Sub6(arg6, 4, local1056 + 4, arg2, arg8, arg4, local9.anInt3022, true, null);
					}
					arg0.method1170(arg1, arg8, arg4, local119, local547, local1087, 256, arg7, anIntArray396[arg7] * local509, local509 * Static46.anIntArray98[arg7], local161, local141);
				}
			}
		}
	}
}
