import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_24;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "Lclient!ud;")
	public static Class5 aClass5_30;

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
	public static int anInt2493;

	@OriginalMember(owner = "client!vd", name = "y", descriptor = "[I")
	public static int[] anIntArray547;

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "Lclient!fc;")
	public static Class2_Sub2_Sub2_Sub2 aClass2_Sub2_Sub2_Sub2_5;

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
	public static int anInt2495;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Lclient!qc;")
	public static Class47 aClass47_22 = new Class47(64);

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
	public static int anInt2491 = 0;

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_714 = Static13.method257("Connection lost");

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "Lclient!o;")
	public static Class40 aClass40_715 = Static13.method257("On");

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
	public static int anInt2492 = -1;

	@OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
	public static volatile int anInt2494 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!o;Lclient!o;ILclient!ud;)Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4 method1644(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(8) int local8 = arg2.method80(arg0);
		@Pc(14) int local14 = arg2.method72(arg1, local8);
		return Static38.method732(arg2, local8, local14);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!cc;")
	public static RuntimeException_Sub1 method1645(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString7 = local12.aString7 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!vb;II)V")
	public static void method1646(@OriginalArg(1) Class2_Sub2_Sub2_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg1 * arg1 + arg2 * arg2;
		if (local11 <= 4225 || local11 >= 90000) {
			Static90.method1461(arg2, arg0, arg1);
			return;
		}
		@Pc(32) int local32 = Static84.anInt1978 + Static67.anInt1669 & 0x7FF;
		@Pc(36) int local36 = Static71.anIntArray386[local32];
		@Pc(44) int local44 = local36 * 256 / (Static15.anInt1857 + 256);
		@Pc(48) int local48 = Static71.anIntArray402[local32];
		@Pc(56) int local56 = local48 * 256 / (Static15.anInt1857 + 256);
		@Pc(67) int local67 = local44 * arg1 + arg2 * local56 >> 16;
		@Pc(78) int local78 = local56 * arg1 - arg2 * local44 >> 16;
		@Pc(84) double local84 = Math.atan2((double) local67, (double) local78);
		@Pc(90) int local90 = (int) (Math.sin(local84) * 63.0D);
		@Pc(96) int local96 = (int) (Math.cos(local84) * 57.0D);
		Static104.aClass2_Sub2_Sub2_Sub4_10.method1623(local90 + 94 + 4 - 10, -20 + 83 + -local96, local84);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public static void method1647() {
		@Pc(17) int local17;
		if (Static43.anInt1850 == 0) {
			Static93.aClass55_1 = new Class55(4, 104, 104, Static91.anIntArrayArrayArray8);
			for (local17 = 0; local17 < 4; local17++) {
				Static79.aClass20Array3[local17] = new Class20(104, 104);
			}
			Static93.aClass2_Sub2_Sub2_Sub4_8 = new Class2_Sub2_Sub2_Sub4(512, 512);
			Static98.aClass40_680 = Static61.aClass40_446;
			Static43.anInt1850 = 20;
			Static94.anInt2194 = 5;
			return;
		}
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(72) int local72;
		@Pc(66) int local66;
		if (Static43.anInt1850 == 20) {
			@Pc(52) int[] local52 = new int[9];
			for (local54 = 0; local54 < 9; local54++) {
				local62 = local54 * 32 + 143;
				local66 = Class2_Sub2_Sub2_Sub1.anIntArray59[local62];
				local72 = local62 * 3 + 600;
				local52[local54] = local72 * local66 >> 16;
			}
			Static89.method1422(local52);
			Static43.anInt1850 = 25;
			Static98.aClass40_680 = Static107.aClass40_721;
			Static94.anInt2194 = 10;
			return;
		}
		try {
			if (Static43.anInt1850 == 25) {
				if (Static10.aClass14_1 != null && Static66.aClass14_4 != null && Static66.aClass14_4.method351() < 60000L) {
					Static32.aClass11Array2 = new Class11[5];
					for (local17 = 0; local17 < 5; local17++) {
						Static32.aClass11Array2[local17] = new Class11(local17 + 1, Static10.aClass14_1, Static34.aClass14Array2[local17], 500000);
					}
					Static18.aClass11Array1 = new Class11[12];
					for (local54 = 0; local54 < 12; local54++) {
						Static18.aClass11Array1[local54] = new Class11(local54, Static66.aClass14_4, Static2.aClass14Array1[local54], 500000);
					}
					Static100.anInt2396 = 0;
					Static98.aClass40_680 = Static22.aClass40_736;
					Static94.anInt2194 = 15;
					Static43.anInt1850 = 26;
					return;
				}
				Static94.anInt2194 = 15;
				Static43.anInt1850 = 30;
				Static98.aClass40_680 = Static21.aClass40_140;
				return;
			}
			if (Static43.anInt1850 == 26) {
				while (Static100.anInt2396 < 65535) {
					Static27.method540(Static32.aClass11Array2[1], Static18.aClass11Array1[7], Static100.anInt2396++);
					if ((Static100.anInt2396 & 0xFF) == 0) {
						Static98.aClass40_680 = Static80.method1334(new Class40[] { Static106.aClass40_740, Static53.method859(Static100.anInt2396 * 100 / 65536), Static59.aClass40_430 });
						Static94.anInt2194 = 15;
						return;
					}
				}
				Static94.anInt2194 = 15;
				Static43.anInt1850 = 27;
				Static100.anInt2396 = 0;
				Static98.aClass40_680 = Static21.aClass40_139;
				return;
			}
			if (Static43.anInt1850 == 27) {
				while (Static100.anInt2396 < 65535) {
					Static27.method540(Static32.aClass11Array2[3], Static18.aClass11Array1[6], Static100.anInt2396++);
					if ((Static100.anInt2396 & 0xFF) == 0) {
						Static98.aClass40_680 = Static80.method1334(new Class40[] { Static88.aClass40_605, Static53.method859(Static100.anInt2396 * 100 / 65536), Static59.aClass40_430 });
						Static94.anInt2194 = 15;
						return;
					}
				}
				Static98.aClass40_680 = Static72.aClass40_507;
				Static94.anInt2194 = 15;
				Static43.anInt1850 = 28;
				Static100.anInt2396 = 0;
				return;
			}
			if (Static43.anInt1850 == 28) {
				while (Static100.anInt2396 < 65535) {
					Static27.method540(Static32.aClass11Array2[4], Static18.aClass11Array1[5], Static100.anInt2396++);
					if ((Static100.anInt2396 & 0xFF) == 0) {
						Static98.aClass40_680 = Static80.method1334(new Class40[] { Static85.aClass40_571, Static53.method859(Static100.anInt2396 * 100 / 65536), Static59.aClass40_430 });
						Static94.anInt2194 = 15;
						return;
					}
				}
				Static43.anInt1850 = 30;
				Static98.aClass40_680 = Static68.aClass40_105;
				Static94.anInt2194 = 15;
				return;
			}
		} catch (@Pc(368) Exception local368) {
			if (Static43.anInt1850 < 30) {
				Static43.anInt1850 = 30;
			}
		}
		if (Static43.anInt1850 == 30) {
			Static43.aClass5_Sub1_14 = Static72.method1188(false, 0, true, true);
			Static87.aClass5_Sub1_18 = Static72.method1188(false, 1, true, true);
			Static5.aClass5_Sub1_1 = Static72.method1188(true, 2, true, false);
			Static27.aClass5_Sub1_5 = Static72.method1188(false, 3, true, true);
			Static35.aClass5_Sub1_7 = Static72.method1188(false, 4, true, true);
			Static36.aClass5_Sub1_8 = Static72.method1188(true, 5, true, true);
			Static85.aClass5_Sub1_17 = Static72.method1188(true, 6, false, true);
			Static25.aClass5_Sub1_4 = Static72.method1188(false, 7, true, true);
			Static82.aClass5_Sub1_16 = Static72.method1188(false, 8, true, true);
			Static35.aClass5_Sub1_6 = Static72.method1188(false, 9, true, true);
			Static81.aClass5_Sub1_15 = Static72.method1188(false, 10, true, true);
			Static74.aClass5_Sub1_13 = Static72.method1188(false, 11, true, true);
			Static98.aClass40_680 = Static100.aClass40_691;
			Static94.anInt2194 = 20;
			Static43.anInt1850 = 40;
		} else if (Static43.anInt1850 == 40) {
			local17 = Static43.aClass5_Sub1_14.method89() * 5 / 100;
			local17 += Static87.aClass5_Sub1_18.method89() * 5 / 100;
			local17 += Static5.aClass5_Sub1_1.method89() * 5 / 100;
			local17 += Static27.aClass5_Sub1_5.method89() * 5 / 100;
			local17 += Static35.aClass5_Sub1_7.method89() * 5 / 100;
			local17 += Static36.aClass5_Sub1_8.method89() * 5 / 100;
			local17 += Static85.aClass5_Sub1_17.method89() * 5 / 100;
			local17 += Static25.aClass5_Sub1_4.method89() * 45 / 100;
			local17 += Static82.aClass5_Sub1_16.method89() * 5 / 100;
			local17 += Static35.aClass5_Sub1_6.method89() * 5 / 100;
			local17 += Static81.aClass5_Sub1_15.method89() * 5 / 100;
			local17 += Static74.aClass5_Sub1_13.method89() * 5 / 100;
			if (local17 == 100) {
				Static94.anInt2194 = 30;
				Static43.anInt1850 = 45;
				Static98.aClass40_680 = Static86.aClass40_584;
			} else {
				if (local17 != 0) {
					Static98.aClass40_680 = Static80.method1334(new Class40[] { Static81.aClass40_558, Static53.method859(local17), Static59.aClass40_430 });
				}
				Static94.anInt2194 = 30;
			}
		} else if (Static43.anInt1850 == 45) {
			Static87.method1400(Static99.aClass7_2, !Static1.aBoolean2);
			Static88.aClass2_Sub10_Sub2_1 = Static37.method717(Static99.aClass7_2, Static7.method185());
			Static11.aClass56_1 = new Class56(22050, Static12.anInt291);
			Static94.anInt2194 = 35;
			Static43.anInt1850 = 50;
			Static98.aClass40_680 = Static93.aClass40_625;
		} else if (Static43.anInt1850 == 50) {
			local17 = 0;
			if (Static76.aClass2_Sub2_Sub2_Sub2_4 == null) {
				Static76.aClass2_Sub2_Sub2_Sub2_4 = Static55.method941(Static82.aClass5_Sub1_16, Static61.aClass40_445, Static92.aClass40_620);
			} else {
				local17++;
			}
			if (aClass2_Sub2_Sub2_Sub2_5 == null) {
				aClass2_Sub2_Sub2_Sub2_5 = Static55.method941(Static82.aClass5_Sub1_16, Static61.aClass40_445, Static105.aClass40_726);
			} else {
				local17++;
			}
			if (Static14.aClass2_Sub2_Sub2_Sub2_1 == null) {
				Static14.aClass2_Sub2_Sub2_Sub2_1 = Static55.method941(Static82.aClass5_Sub1_16, Static61.aClass40_445, Static11.aClass40_69);
			} else {
				local17++;
			}
			if (Static42.aClass2_Sub2_Sub2_Sub2_2 == null) {
				Static42.aClass2_Sub2_Sub2_Sub2_2 = Static55.method941(Static82.aClass5_Sub1_16, Static61.aClass40_445, Static79.aClass40_543);
			} else {
				local17++;
			}
			if (local17 < 4) {
				Static98.aClass40_680 = Static80.method1334(new Class40[] { Static5.aClass40_47, Static53.method859(local17 * 100 / 4), Static59.aClass40_430 });
				Static94.anInt2194 = 40;
			} else {
				Static43.anInt1850 = 60;
				Static94.anInt2194 = 40;
				Static49.aClass2_Sub2_Sub2_Sub2Array9 = new Class2_Sub2_Sub2_Sub2[] { Static76.aClass2_Sub2_Sub2_Sub2_4, aClass2_Sub2_Sub2_Sub2_5, Static14.aClass2_Sub2_Sub2_Sub2_1, Static42.aClass2_Sub2_Sub2_Sub2_2 };
				Static98.aClass40_680 = Static102.aClass40_711;
			}
		} else if (Static43.anInt1850 == 60) {
			local17 = Static101.method1592(Static82.aClass5_Sub1_16, Static81.aClass5_Sub1_15);
			local54 = Static5.method120();
			if (local17 < local54) {
				Static98.aClass40_680 = Static80.method1334(new Class40[] { Static60.aClass40_434, Static53.method859(local17 * 100 / local54), Static59.aClass40_430 });
				Static94.anInt2194 = 50;
			} else {
				Static98.aClass40_680 = Static73.aClass40_516;
				Static94.anInt2194 = 50;
				Static7.method187(5);
				Static43.anInt1850 = 70;
			}
		} else if (Static43.anInt1850 == 70) {
			if (Static5.aClass5_Sub1_1.method78()) {
				Static99.method75(Static5.aClass5_Sub1_1);
				Static5.method117(Static5.aClass5_Sub1_1);
				Static32.method591(Static25.aClass5_Sub1_4, Static5.aClass5_Sub1_1);
				Static95.method1518(Static1.aBoolean2, Static25.aClass5_Sub1_4, Static5.aClass5_Sub1_1);
				method1651(Static5.aClass5_Sub1_1, Static25.aClass5_Sub1_4);
				Static106.method1741(Static25.aClass5_Sub1_4, Static5.aClass5_Sub1_1, Static18.aBoolean37);
				Static96.method1551(Static87.aClass5_Sub1_18, Static43.aClass5_Sub1_14, Static5.aClass5_Sub1_1);
				Static80.method1329(Static5.aClass5_Sub1_1, Static25.aClass5_Sub1_4);
				Static16.method340(Static5.aClass5_Sub1_1);
				Static92.method1483(Static5.aClass5_Sub1_1);
				Static91.method1471(Static82.aClass5_Sub1_16, Static27.aClass5_Sub1_5, Static25.aClass5_Sub1_4);
				Static98.aClass40_680 = Static63.aClass40_469;
				Static43.anInt1850 = 80;
				Static94.anInt2194 = 60;
			} else {
				Static98.aClass40_680 = Static80.method1334(new Class40[] { Static76.aClass40_616, Static53.method859(Static5.aClass5_Sub1_1.method87()), Static59.aClass40_430 });
				Static94.anInt2194 = 60;
			}
		} else if (Static43.anInt1850 == 80) {
			local17 = 0;
			if (Static13.aClass2_Sub2_Sub2_Sub4_2 == null) {
				Static13.aClass2_Sub2_Sub2_Sub4_2 = method1644(Static41.aClass40_307, Static61.aClass40_445, Static82.aClass5_Sub1_16);
			} else {
				local17++;
			}
			if (Static104.aClass2_Sub2_Sub2_Sub4_10 == null) {
				Static104.aClass2_Sub2_Sub2_Sub4_10 = method1644(Static95.aClass40_647, Static61.aClass40_445, Static82.aClass5_Sub1_16);
			} else {
				local17++;
			}
			if (Static56.aClass2_Sub2_Sub2_Sub3Array15 == null) {
				Static56.aClass2_Sub2_Sub2_Sub3Array15 = Static4.method85(Static82.aClass5_Sub1_16, Static73.aClass40_520, Static61.aClass40_445);
			} else {
				local17++;
			}
			if (Static99.aClass2_Sub2_Sub2_Sub4Array2 == null) {
				Static99.aClass2_Sub2_Sub2_Sub4Array2 = Static36.method638(Static82.aClass5_Sub1_16, Static96.aClass40_663, Static61.aClass40_445);
			} else {
				local17++;
			}
			if (Static29.aClass2_Sub2_Sub2_Sub4Array4 == null) {
				Static29.aClass2_Sub2_Sub2_Sub4Array4 = Static36.method638(Static82.aClass5_Sub1_16, Static99.aClass40_26, Static61.aClass40_445);
			} else {
				local17++;
			}
			if (Static44.aClass2_Sub2_Sub2_Sub4Array6 == null) {
				Static44.aClass2_Sub2_Sub2_Sub4Array6 = Static36.method638(Static82.aClass5_Sub1_16, Static88.aClass40_607, Static61.aClass40_445);
			} else {
				local17++;
			}
			if (Static58.aClass2_Sub2_Sub2_Sub4Array8 == null) {
				Static58.aClass2_Sub2_Sub2_Sub4Array8 = Static36.method638(Static82.aClass5_Sub1_16, Static60.aClass40_433, Static61.aClass40_445);
			} else {
				local17++;
			}
			if (Static101.aClass2_Sub2_Sub2_Sub4Array10 == null) {
				Static101.aClass2_Sub2_Sub2_Sub4Array10 = Static36.method638(Static82.aClass5_Sub1_16, Static97.aClass40_671, Static61.aClass40_445);
			} else {
				local17++;
			}
			if (Static43.aClass2_Sub2_Sub2_Sub4_7 == null) {
				Static43.aClass2_Sub2_Sub2_Sub4_7 = method1644(Static99.aClass40_25, Static61.aClass40_445, Static82.aClass5_Sub1_16);
			} else {
				local17++;
			}
			if (Static13.aClass2_Sub2_Sub2_Sub4Array3 == null) {
				Static13.aClass2_Sub2_Sub2_Sub4Array3 = Static36.method638(Static82.aClass5_Sub1_16, Static68.aClass40_101, Static61.aClass40_445);
			} else {
				local17++;
			}
			if (Static54.aClass2_Sub2_Sub2_Sub4Array7 == null) {
				Static54.aClass2_Sub2_Sub2_Sub4Array7 = Static36.method638(Static82.aClass5_Sub1_16, Static44.aClass40_332, Static61.aClass40_445);
			} else {
				local17++;
			}
			if (Static30.aClass2_Sub2_Sub2_Sub4Array5 == null) {
				Static30.aClass2_Sub2_Sub2_Sub4Array5 = Static36.method638(Static82.aClass5_Sub1_16, Static105.aClass40_727, Static61.aClass40_445);
			} else {
				local17++;
			}
			if (Static93.aClass2_Sub2_Sub2_Sub3Array12 == null) {
				Static93.aClass2_Sub2_Sub2_Sub3Array12 = Static4.method85(Static82.aClass5_Sub1_16, Static95.aClass40_643, Static61.aClass40_445);
			} else {
				local17++;
			}
			if (Static70.aClass2_Sub2_Sub2_Sub3Array8 == null) {
				Static70.aClass2_Sub2_Sub2_Sub3Array8 = Static4.method85(Static82.aClass5_Sub1_16, Static30.aClass40_222, Static61.aClass40_445);
			} else {
				local17++;
			}
			if (local17 < 14) {
				Static98.aClass40_680 = Static80.method1334(new Class40[] { Static15.aClass40_541, Static53.method859(local17 * 100 / 14), Static59.aClass40_430 });
				Static94.anInt2194 = 70;
			} else {
				Static104.aClass2_Sub2_Sub2_Sub4_10.method1620();
				local54 = (int) (Math.random() * 21.0D) - 10;
				local62 = (int) (Math.random() * 21.0D) - 10;
				local66 = (int) (Math.random() * 41.0D) - 20;
				local72 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(1134) int local1134 = 0; local1134 < Static99.aClass2_Sub2_Sub2_Sub4Array2.length; local1134++) {
					Static99.aClass2_Sub2_Sub2_Sub4Array2[local1134].method1621(local54 + local66, local62 + local66, local66 + local72);
				}
				Static56.aClass2_Sub2_Sub2_Sub3Array15[0].method1321(local66 + local54, local62 + local66, local72 + local66);
				Static98.aClass40_680 = Static63.aClass40_465;
				Static43.anInt1850 = 85;
				Static94.anInt2194 = 70;
			}
		} else if (Static43.anInt1850 == 85) {
			local17 = Static18.method358(Static82.aClass5_Sub1_16);
			local54 = Static10.method228();
			if (local54 > local17) {
				Static98.aClass40_680 = Static80.method1334(new Class40[] { Static11.aClass40_68, Static53.method859(local17 * 100 / local54), Static59.aClass40_430 });
				Static94.anInt2194 = 80;
			} else {
				Static94.anInt2194 = 80;
				Static43.anInt1850 = 90;
				Static98.aClass40_680 = Static17.aClass40_114;
			}
		} else if (Static43.anInt1850 == 90) {
			if (Static35.aClass5_Sub1_6.method78()) {
				@Pc(1269) Class19 local1269 = new Class19(Static35.aClass5_Sub1_6, Static82.aClass5_Sub1_16, 20, 0.8D, Static1.aBoolean2 ? 64 : 128);
				Static6.method173(local1269);
				Static6.method168(0.8D);
				Static94.anInt2194 = 90;
				Static43.anInt1850 = 110;
				Static98.aClass40_680 = Static73.aClass40_513;
			} else {
				Static98.aClass40_680 = Static80.method1334(new Class40[] { Static75.aClass40_527, Static53.method859(Static35.aClass5_Sub1_6.method87()), Static59.aClass40_430 });
				Static94.anInt2194 = 90;
			}
		} else if (Static43.anInt1850 == 110) {
			Static44.aClass52_1 = new Class52();
			Static99.aClass7_2.method207(10, Static44.aClass52_1);
			Static94.anInt2194 = 94;
			Static43.anInt1850 = 120;
			Static98.aClass40_680 = Static22.aClass40_737;
		} else if (Static43.anInt1850 == 120) {
			if (Static81.aClass5_Sub1_15.method73(Static61.aClass40_445, Static20.aClass40_131)) {
				@Pc(1325) Class42 local1325 = new Class42(Static81.aClass5_Sub1_15.method69(Static20.aClass40_131, Static61.aClass40_445));
				Static87.method1397(local1325);
				Static43.anInt1850 = 130;
				Static98.aClass40_680 = Static63.aClass40_470;
				Static94.anInt2194 = 96;
			} else {
				Static94.anInt2194 = 96;
				Static98.aClass40_680 = Static24.aClass40_180;
			}
		} else if (Static43.anInt1850 == 130) {
			if (Static27.aClass5_Sub1_5.method78()) {
				Static94.anInt2194 = 100;
				Static43.anInt1850 = 140;
				Static98.aClass40_680 = Static73.aClass40_517;
			} else {
				Static98.aClass40_680 = Static80.method1334(new Class40[] { Static92.aClass40_619, Static53.method859(Static27.aClass5_Sub1_5.method87()), Static59.aClass40_430 });
				Static94.anInt2194 = 100;
			}
		} else if (Static43.anInt1850 == 140) {
			Static7.method187(10);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	public static void method1648(@OriginalArg(0) int arg0) {
		if (!Static107.method1665(arg0)) {
			return;
		}
		@Pc(26) Class2_Sub2_Sub13[] local26 = Static51.aClass2_Sub2_Sub13ArrayArray1[arg0];
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) Class2_Sub2_Sub13 local34 = local26[local28];
			if (local34 != null) {
				local34.anInt1593 = 0;
				local34.anInt1569 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!ke;)V")
	public static void method1649(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub12_Sub1 arg1) {
		Static104.method1667(arg0, arg1.anInt2275, arg1.anInt2284);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)I")
	public static int method1650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(8) int local8 = arg4;
			arg4 = arg1;
			arg1 = local8;
		}
		@Pc(16) int local16 = arg3 & 0x3;
		if (local16 == 0) {
			return arg0;
		} else if (local16 == 1) {
			return arg2;
		} else if (local16 == 2) {
			return 8 - arg4 - arg0;
		} else {
			return 7 + 1 - arg2 - arg1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!ud;BLclient!ud;)V")
	private static void method1651(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		aClass5_30 = arg1;
		Static34.aClass5_11 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
	public static void method1652() {
		aClass47_22 = null;
		aClass2_Sub2_Sub2_Sub2_5 = null;
		aClass40_714 = null;
		aClass40_715 = null;
		aClass2_Sub2_Sub2_Sub3_24 = null;
		aClass5_30 = null;
		anIntArray547 = null;
	}
}
