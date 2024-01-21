import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2282 = Static107.method1838("me");

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2283 = Static107.method1838("null");

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2284 = Static107.method1838("Wordpack geladen)3");

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!l;")
	public static Class44 aClass44_1 = new Class44();

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2285 = Static107.method1838("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method2695() {
		aClass28_2285 = null;
		aClass28_2284 = null;
		aClass44_1 = null;
		aClass28_2282 = null;
		aClass28_2283 = null;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public static void method2696() {
		@Pc(14) int local14;
		if (Static17.anInt658 == 0) {
			Static67.method1222(Static78.anIntArrayArrayArray6);
			for (local14 = 0; local14 < 4; local14++) {
				Static141.aClass36Array1[local14] = new Class36(104, 104);
			}
			Static94.aClass2_Sub4_Sub3_Sub4_4 = new Class2_Sub4_Sub3_Sub4(512, 512);
			Static17.anInt658 = 20;
			Static107.anInt2609 = 5;
			Static138.aClass28_1857 = Static150.aClass28_1982;
			return;
		}
		@Pc(51) int local51;
		@Pc(62) int local62;
		@Pc(72) int local72;
		@Pc(66) int local66;
		if (Static17.anInt658 == 20) {
			@Pc(49) int[] local49 = new int[9];
			for (local51 = 0; local51 < 9; local51++) {
				local62 = local51 * 32 + 128 + 15;
				local66 = Class2_Sub4_Sub3_Sub1.anIntArray58[local62];
				local72 = local62 * 3 + 600;
				local49[local51] = local66 * local72 >> 16;
			}
			Static156.method2405(local49);
			Static138.aClass28_1857 = Static27.aClass28_1660;
			Static107.anInt2609 = 10;
			Static17.anInt658 = 30;
		} else if (Static17.anInt658 == 30) {
			Static140.aClass40_Sub1_98 = Static22.method476(false, true, 0, true);
			Static169.aClass40_Sub1_117 = Static22.method476(false, true, 1, true);
			Static160.aClass40_Sub1_107 = Static22.method476(true, true, 2, false);
			Static159.aClass40_Sub1_125 = Static22.method476(false, true, 3, true);
			Static99.aClass40_Sub1_73 = Static22.method476(false, true, 4, true);
			Static47.aClass40_Sub1_49 = Static22.method476(true, true, 5, true);
			Static10.aClass40_Sub1_18 = Static22.method476(true, false, 6, true);
			Static18.aClass40_Sub1_114 = Static22.method476(false, true, 7, true);
			Static101.aClass40_Sub1_16 = Static22.method476(false, true, 8, true);
			Static17.aClass40_Sub1_23 = Static22.method476(true, true, 9, false);
			Static29.aClass40_Sub1_30 = Static22.method476(false, true, 10, true);
			Static122.aClass40_Sub1_89 = Static22.method476(false, true, 11, true);
			Static102.aClass40_Sub1_74 = Static22.method476(false, true, 12, true);
			Static151.aClass40_Sub1_103 = Static22.method476(true, true, 13, false);
			Static131.aClass40_Sub1_94 = Static22.method476(false, false, 14, true);
			Static78.aClass40_Sub1_57 = Static22.method476(false, true, 15, true);
			Static17.anInt658 = 40;
			Static107.anInt2609 = 20;
			Static138.aClass28_1857 = Static176.aClass28_2325;
		} else if (Static17.anInt658 == 40) {
			local14 = Static140.aClass40_Sub1_98.method1793() * 4 / 100;
			local14 += Static169.aClass40_Sub1_117.method1793() * 4 / 100;
			local14 += Static160.aClass40_Sub1_107.method1793() * 2 / 100;
			local14 += Static159.aClass40_Sub1_125.method1793() * 2 / 100;
			local14 += Static99.aClass40_Sub1_73.method1793() * 6 / 100;
			local14 += Static47.aClass40_Sub1_49.method1793() * 4 / 100;
			local14 += Static10.aClass40_Sub1_18.method1793() * 2 / 100;
			local14 += Static18.aClass40_Sub1_114.method1793() * 60 / 100;
			local14 += Static101.aClass40_Sub1_16.method1793() * 2 / 100;
			local14 += Static17.aClass40_Sub1_23.method1793() * 2 / 100;
			local14 += Static29.aClass40_Sub1_30.method1793() * 2 / 100;
			local14 += Static122.aClass40_Sub1_89.method1793() * 2 / 100;
			local14 += Static102.aClass40_Sub1_74.method1793() * 2 / 100;
			local14 += Static151.aClass40_Sub1_103.method1793() * 2 / 100;
			local14 += Static131.aClass40_Sub1_94.method1793() * 2 / 100;
			local14 += Static78.aClass40_Sub1_57.method1793() * 2 / 100;
			if (local14 == 100) {
				Static138.aClass28_1857 = Static126.aClass28_1745;
				Static107.anInt2609 = 30;
				Static17.anInt658 = 45;
			} else {
				if (local14 != 0) {
					Static138.aClass28_1857 = Static83.method1481(new Class28[] { Static14.aClass28_409, Static158.method2411(local14), Static122.aClass28_1709 });
				}
				Static107.anInt2609 = 30;
			}
		} else if (Static17.anInt658 == 45) {
			Static9.method308(!Static177.aBoolean170);
			@Pc(442) Class2_Sub8_Sub1 local442 = new Class2_Sub8_Sub1();
			local442.method781();
			Static165.aClass21_2 = Static24.method482(22050, Static76.aClass66_2, 0, Static49.aCanvas1);
			Static165.aClass21_2.method1347(local442);
			Static180.method2869(Static78.aClass40_Sub1_57, Static99.aClass40_Sub1_73, Static131.aClass40_Sub1_94, local442);
			Static120.aClass21_1 = Static24.method482(2048, Static76.aClass66_2, 1, Static49.aCanvas1);
			Static113.aClass2_Sub8_Sub3_1 = new Class2_Sub8_Sub3();
			Static120.aClass21_1.method1347(Static113.aClass2_Sub8_Sub3_1);
			Static178.aClass61_1 = new Class61(22050, Static113.anInt2749);
			Static107.anInt2609 = 35;
			Static138.aClass28_1857 = Static84.aClass28_1256;
			Static17.anInt658 = 50;
		} else if (Static17.anInt658 == 50) {
			local14 = 0;
			if (Static165.aClass2_Sub4_Sub3_Sub2_Sub1_5 == null) {
				Static165.aClass2_Sub4_Sub3_Sub2_Sub1_5 = Static178.method2782(Static136.aClass28_1828, Static151.aClass40_Sub1_103, Static101.aClass40_Sub1_16, Static120.aClass28_1680);
			} else {
				local14++;
			}
			if (Static160.aClass2_Sub4_Sub3_Sub2_Sub1_4 == null) {
				Static160.aClass2_Sub4_Sub3_Sub2_Sub1_4 = Static165.aClass2_Sub4_Sub3_Sub2_Sub1_5;
			} else {
				local14++;
			}
			if (Static61.aClass2_Sub4_Sub3_Sub2_Sub1_3 == null) {
				Static61.aClass2_Sub4_Sub3_Sub2_Sub1_3 = Static178.method2782(Static136.aClass28_1828, Static151.aClass40_Sub1_103, Static101.aClass40_Sub1_16, Static74.aClass28_1149);
			} else {
				local14++;
			}
			if (Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2 == null) {
				Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2 = Static178.method2782(Static136.aClass28_1828, Static151.aClass40_Sub1_103, Static101.aClass40_Sub1_16, Static17.aClass28_425);
			} else {
				local14++;
			}
			if (local14 < 4) {
				Static138.aClass28_1857 = Static83.method1481(new Class28[] { Static55.aClass28_829, Static158.method2411(local14 * 100 / 4), Static122.aClass28_1709 });
				Static107.anInt2609 = 40;
			} else {
				Static138.aClass28_1857 = Static5.aClass28_90;
				Static17.anInt658 = 60;
				Static107.anInt2609 = 40;
			}
		} else if (Static17.anInt658 == 60) {
			local14 = Static170.method2896(Static101.aClass40_Sub1_16, Static29.aClass40_Sub1_30);
			local51 = Static123.method2011();
			if (local14 < local51) {
				Static138.aClass28_1857 = Static83.method1481(new Class28[] { Static88.aClass28_1353, Static158.method2411(local14 * 100 / local51), Static122.aClass28_1709 });
				Static107.anInt2609 = 50;
			} else {
				Static107.anInt2609 = 50;
				Static138.aClass28_1857 = Static34.aClass28_567;
				Static110.method1877(5);
				Static17.anInt658 = 70;
			}
		} else if (Static17.anInt658 == 70) {
			if (Static160.aClass40_Sub1_107.method1782()) {
				Static50.method939(Static160.aClass40_Sub1_107);
				Static170.method2902(Static160.aClass40_Sub1_107);
				Static116.method1946(Static18.aClass40_Sub1_114, Static160.aClass40_Sub1_107);
				Static179.method2884(Static18.aClass40_Sub1_114, Static160.aClass40_Sub1_107, Static177.aBoolean170);
				Static9.method312(Static160.aClass40_Sub1_107, Static18.aClass40_Sub1_114);
				Static24.method483(Static18.aClass40_Sub1_114, Static51.aBoolean96, Static160.aClass2_Sub4_Sub3_Sub2_Sub1_4, Static160.aClass40_Sub1_107);
				Static169.method2651(Static140.aClass40_Sub1_98, Static160.aClass40_Sub1_107, Static169.aClass40_Sub1_117);
				Static117.method1959(Static160.aClass40_Sub1_107, Static18.aClass40_Sub1_114);
				Static23.method477(Static160.aClass40_Sub1_107);
				Static148.method2320(Static160.aClass40_Sub1_107);
				Static59.method1057(Static101.aClass40_Sub1_16, Static18.aClass40_Sub1_114, Static151.aClass40_Sub1_103, Static159.aClass40_Sub1_125);
				Static66.method1218(Static160.aClass40_Sub1_107);
				Static46.method888(Static160.aClass40_Sub1_107);
				Static138.aClass28_1857 = Static155.aClass28_2044;
				Static107.anInt2609 = 60;
				Static175.method2730();
				Static17.anInt658 = 80;
			} else {
				Static138.aClass28_1857 = Static83.method1481(new Class28[] { Static22.aClass28_491, Static158.method2411(Static160.aClass40_Sub1_107.method1795()), Static122.aClass28_1709 });
				Static107.anInt2609 = 60;
			}
		} else if (Static17.anInt658 == 80) {
			local51 = 0;
			if (Static130.aClass2_Sub4_Sub3_Sub4_7 == null) {
				Static130.aClass2_Sub4_Sub3_Sub4_7 = Static64.method1172(Static101.aClass40_Sub1_16, Static69.aClass28_1083, Static136.aClass28_1828);
			} else {
				local51++;
			}
			if (Static56.aClass2_Sub4_Sub3_Sub4_1 == null) {
				Static56.aClass2_Sub4_Sub3_Sub4_1 = Static64.method1172(Static101.aClass40_Sub1_16, Static3.aClass28_1413, Static136.aClass28_1828);
			} else {
				local51++;
			}
			if (Static102.aClass2_Sub4_Sub3_Sub3Array4 == null) {
				Static102.aClass2_Sub4_Sub3_Sub3Array4 = Static38.method709(Static101.aClass40_Sub1_16, Static136.aClass28_1828, Static21.aClass28_483);
			} else {
				local51++;
			}
			if (Static8.aClass2_Sub4_Sub3_Sub4Array4 == null) {
				Static8.aClass2_Sub4_Sub3_Sub4Array4 = Static57.method1030(Static82.aClass28_1236, Static136.aClass28_1828, Static101.aClass40_Sub1_16);
			} else {
				local51++;
			}
			if (Static113.aClass2_Sub4_Sub3_Sub4Array9 == null) {
				Static113.aClass2_Sub4_Sub3_Sub4Array9 = Static57.method1030(Static78.aClass28_1186, Static136.aClass28_1828, Static101.aClass40_Sub1_16);
			} else {
				local51++;
			}
			if (Static3.aClass2_Sub4_Sub3_Sub4Array7 == null) {
				Static3.aClass2_Sub4_Sub3_Sub4Array7 = Static57.method1030(Static98.aClass28_1424, Static136.aClass28_1828, Static101.aClass40_Sub1_16);
			} else {
				local51++;
			}
			if (Static40.aClass2_Sub4_Sub3_Sub4Array5 == null) {
				Static40.aClass2_Sub4_Sub3_Sub4Array5 = Static57.method1030(Static19.aClass28_546, Static136.aClass28_1828, Static101.aClass40_Sub1_16);
			} else {
				local51++;
			}
			if (Static102.aClass2_Sub4_Sub3_Sub4Array8 == null) {
				Static102.aClass2_Sub4_Sub3_Sub4Array8 = Static57.method1030(Static172.aClass28_2277, Static136.aClass28_1828, Static101.aClass40_Sub1_16);
			} else {
				local51++;
			}
			if (Static152.aClass2_Sub4_Sub3_Sub4Array12 == null) {
				Static152.aClass2_Sub4_Sub3_Sub4Array12 = Static57.method1030(Static24.aClass28_500, Static136.aClass28_1828, Static101.aClass40_Sub1_16);
			} else {
				local51++;
			}
			if (Static47.aClass2_Sub4_Sub3_Sub4Array6 == null) {
				Static47.aClass2_Sub4_Sub3_Sub4Array6 = Static57.method1030(Static116.aClass28_1651, Static136.aClass28_1828, Static101.aClass40_Sub1_16);
			} else {
				local51++;
			}
			if (Static125.aClass2_Sub4_Sub3_Sub4Array10 == null) {
				Static125.aClass2_Sub4_Sub3_Sub4Array10 = Static57.method1030(Static104.aClass28_1534, Static136.aClass28_1828, Static101.aClass40_Sub1_16);
			} else {
				local51++;
			}
			if (Static174.aClass2_Sub4_Sub3_Sub3Array11 == null) {
				Static174.aClass2_Sub4_Sub3_Sub3Array11 = Static38.method709(Static101.aClass40_Sub1_16, Static136.aClass28_1828, Static154.aClass28_2014);
			} else {
				local51++;
			}
			if (Static81.aClass2_Sub4_Sub3_Sub3Array3 == null) {
				Static81.aClass2_Sub4_Sub3_Sub3Array3 = Static38.method709(Static101.aClass40_Sub1_16, Static136.aClass28_1828, Static67.aClass28_1047);
			} else {
				local51++;
			}
			if (local51 < 13) {
				Static138.aClass28_1857 = Static83.method1481(new Class28[] { Static89.aClass28_1362, Static158.method2411(local51 * 100 / 13), Static122.aClass28_1709 });
				Static107.anInt2609 = 70;
			} else {
				Static68.aClass2_Sub4_Sub3_Sub3Array8 = Static81.aClass2_Sub4_Sub3_Sub3Array3;
				Static56.aClass2_Sub4_Sub3_Sub4_1.method2835();
				Static130.aClass2_Sub4_Sub3_Sub4_7.method2835();
				local62 = (int) (Math.random() * 21.0D) - 10;
				local72 = (int) (Math.random() * 21.0D) - 10;
				@Pc(939) int local939 = (int) (Math.random() * 41.0D) - 20;
				local66 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(948) int local948 = 0; local948 < Static8.aClass2_Sub4_Sub3_Sub4Array4.length; local948++) {
					Static8.aClass2_Sub4_Sub3_Sub4Array4[local948].method2813(local62 + local939, local72 + local939, local939 + local66);
				}
				Static102.aClass2_Sub4_Sub3_Sub3Array4[0].method2243(local62 + local939, local72 - -local939, local939 + local66);
				Static17.anInt658 = 90;
				Static138.aClass28_1857 = Static38.aClass28_639;
				Static107.anInt2609 = 70;
			}
		} else if (Static17.anInt658 == 90) {
			if (Static17.aClass40_Sub1_23.method1782()) {
				@Pc(1034) Class84 local1034 = new Class84(Static17.aClass40_Sub1_23, Static101.aClass40_Sub1_16, 20, Static177.aBoolean170 ? 64 : 128);
				Static25.method555(local1034);
				Static25.method542(0.7F);
				Static138.aClass28_1857 = Static170.aClass28_2442;
				Static17.anInt658 = 110;
				Static107.anInt2609 = 90;
			} else {
				Static138.aClass28_1857 = Static83.method1481(new Class28[] { Static31.aClass28_2414, Static158.method2411(Static17.aClass40_Sub1_23.method1795()), Static122.aClass28_1709 });
				Static107.anInt2609 = 90;
			}
		} else if (Static17.anInt658 == 110) {
			Static105.aClass83_1 = new Class83();
			Static76.aClass66_2.method2127(Static105.aClass83_1, 10);
			Static17.anInt658 = 120;
			Static138.aClass28_1857 = Static72.aClass28_1112;
			Static107.anInt2609 = 94;
		} else if (Static17.anInt658 == 120) {
			if (Static29.aClass40_Sub1_30.method1787(Static136.aClass28_1828, Static178.aClass28_2358)) {
				@Pc(1101) Class60 local1101 = new Class60(Static29.aClass40_Sub1_30.method1769(Static136.aClass28_1828, Static178.aClass28_2358));
				Static126.method2044(local1101);
				Static138.aClass28_1857 = Static109.aClass28_1563;
				Static107.anInt2609 = 96;
				Static17.anInt658 = 130;
			} else {
				Static138.aClass28_1857 = Static83.method1481(new Class28[] { Static1.aClass28_1741, Static26.aClass28_520 });
				Static107.anInt2609 = 96;
			}
		} else if (Static17.anInt658 == 130) {
			if (!Static159.aClass40_Sub1_125.method1782()) {
				Static138.aClass28_1857 = Static83.method1481(new Class28[] { Static125.aClass28_1734, Static158.method2411(Static159.aClass40_Sub1_125.method1795() * 4 / 5), Static122.aClass28_1709 });
				Static107.anInt2609 = 100;
			} else if (!Static102.aClass40_Sub1_74.method1782()) {
				Static138.aClass28_1857 = Static83.method1481(new Class28[] { Static125.aClass28_1734, Static158.method2411(Static102.aClass40_Sub1_74.method1795() / 6 + 80), Static122.aClass28_1709 });
				Static107.anInt2609 = 100;
			} else if (Static151.aClass40_Sub1_103.method1782()) {
				Static138.aClass28_1857 = Static22.aClass28_487;
				Static17.anInt658 = 140;
				Static107.anInt2609 = 100;
			} else {
				Static138.aClass28_1857 = Static83.method1481(new Class28[] { Static125.aClass28_1734, Static158.method2411(Static151.aClass40_Sub1_103.method1795() / 20 + 96), Static122.aClass28_1709 });
				Static107.anInt2609 = 100;
			}
		} else if (Static17.anInt658 == 140) {
			Static110.method1877(10);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public static void method2697() {
		try {
			if (Static43.anInt1114 == 1) {
				@Pc(18) int local18 = Static164.aClass2_Sub8_Sub1_2.method797();
				if (local18 > 0 && Static164.aClass2_Sub8_Sub1_2.method791()) {
					local18 -= Static108.anInt2633;
					if (local18 < 0) {
						local18 = 0;
					}
					Static164.aClass2_Sub8_Sub1_2.method782(local18);
				} else {
					Static164.aClass2_Sub8_Sub1_2.method779();
					Static164.aClass2_Sub8_Sub1_2.method769();
					Static22.aClass2_Sub25_1 = null;
					Static99.aClass39_1 = null;
					if (Static49.aClass40_14 == null) {
						Static43.anInt1114 = 0;
					} else {
						Static43.anInt1114 = 2;
					}
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static164.aClass2_Sub8_Sub1_2.method779();
			Static22.aClass2_Sub25_1 = null;
			Static43.anInt1114 = 0;
			Static99.aClass39_1 = null;
			Static49.aClass40_14 = null;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
	public static void method2698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static166.anInt3704 == 0 && !Static163.aBoolean157) {
			Static75.method1358((short) 19, arg2 - arg3, Static135.aClass28_1827, arg1 - arg0, 0L, Static136.aClass28_1828);
		}
		@Pc(31) long local31 = -1L;
		for (@Pc(38) int local38 = 0; local38 < Static37.anInt1777; local38++) {
			@Pc(44) long local44 = Static37.aLongArray5[local38];
			@Pc(51) int local51 = (int) local44 >> 29 & 0x3;
			@Pc(56) int local56 = (int) local44 & 0x7F;
			@Pc(63) int local63 = (int) local44 >> 7 & 0x7F;
			@Pc(70) int local70 = Integer.MAX_VALUE & (int) (local44 >>> 32);
			if (local44 != local31) {
				local31 = local44;
				@Pc(185) int local185;
				if (local51 == 2 && Static119.method1969(Static103.anInt2568, local56, local63, local44)) {
					@Pc(89) Class2_Sub4_Sub6 local89 = Static151.method2339(local70);
					if (local89.anIntArray82 != null) {
						local89 = local89.method718();
					}
					if (local89 == null) {
						continue;
					}
					if (Static166.anInt3704 == 1) {
						Static75.method1358((short) 5, local63, Static28.aClass28_538, local56, local44, Static83.method1481(new Class28[] { Static61.aClass28_954, Static175.aClass28_2315, local89.aClass28_641 }));
					} else if (!Static163.aBoolean157) {
						@Pc(173) Class28[] local173 = local89.aClass28Array11;
						if (Static119.aBoolean129) {
							local173 = Static107.method1840(local173);
						}
						if (local173 != null) {
							for (local185 = 4; local185 >= 0; local185--) {
								if (local173[local185] != null) {
									@Pc(193) short local193 = 0;
									if (local185 == 0) {
										local193 = 2;
									}
									if (local185 == 1) {
										local193 = 4;
									}
									if (local185 == 2) {
										local193 = 32;
									}
									if (local185 == 3) {
										local193 = 24;
									}
									if (local185 == 4) {
										local193 = 1007;
									}
									Static75.method1358(local193, local63, local173[local185], local56, local44, Static83.method1481(new Class28[] { Static59.aClass28_886, local89.aClass28_641 }));
								}
							}
						}
						Static75.method1358((short) 1006, local63, Static82.aClass28_1233, local56, (long) local89.anInt1048, Static83.method1481(new Class28[] { Static59.aClass28_886, local89.aClass28_641 }));
					} else if ((Static151.anInt3386 & 0x4) == 4) {
						Static75.method1358((short) 36, local63, Static98.aClass28_1425, local56, local44, Static83.method1481(new Class28[] { Static24.aClass28_499, Static175.aClass28_2315, local89.aClass28_641 }));
					}
				}
				@Pc(316) int local316;
				@Pc(324) Class2_Sub4_Sub1_Sub1_Sub1 local324;
				@Pc(375) Class2_Sub4_Sub1_Sub1_Sub2 local375;
				if (local51 == 1) {
					@Pc(293) Class2_Sub4_Sub1_Sub1_Sub1 local293 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local70];
					if (local293.aClass2_Sub4_Sub4_1.anInt854 == 1 && (local293.anInt1633 & 0x7F) == 64 && (local293.anInt1635 & 0x7F) == 64) {
						for (local316 = 0; local316 < Static29.anInt884; local316++) {
							local324 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[Static129.anIntArray274[local316]];
							if (local324 != null && local324 != local293 && local324.aClass2_Sub4_Sub4_1.anInt854 == 1 && local293.anInt1633 == local324.anInt1633 && local324.anInt1635 == local293.anInt1635) {
								Static18.method2592(local63, Static129.anIntArray274[local316], local56, local324.aClass2_Sub4_Sub4_1);
							}
						}
						for (local185 = 0; local185 < Static35.anInt973; local185++) {
							local375 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[Static160.anIntArray327[local185]];
							if (local375 != null && local375.anInt1633 == local293.anInt1633 && local293.anInt1635 == local375.anInt1635) {
								Static175.method2731(local56, local375, Static160.anIntArray327[local185], local63);
							}
						}
					}
					Static18.method2592(local63, local70, local56, local293.aClass2_Sub4_Sub4_1);
				}
				if (local51 == 0) {
					@Pc(416) Class2_Sub4_Sub1_Sub1_Sub2 local416 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local70];
					if ((local416.anInt1633 & 0x7F) == 64 && (local416.anInt1635 & 0x7F) == 64) {
						for (local316 = 0; local316 < Static29.anInt884; local316++) {
							local324 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[Static129.anIntArray274[local316]];
							if (local324 != null && local324.aClass2_Sub4_Sub4_1.anInt854 == 1 && local324.anInt1633 == local416.anInt1633 && local416.anInt1635 == local324.anInt1635) {
								Static18.method2592(local63, Static129.anIntArray274[local316], local56, local324.aClass2_Sub4_Sub4_1);
							}
						}
						for (local185 = 0; local185 < Static35.anInt973; local185++) {
							local375 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[Static160.anIntArray327[local185]];
							if (local375 != null && local416 != local375 && local416.anInt1633 == local375.anInt1633 && local375.anInt1635 == local416.anInt1635) {
								Static175.method2731(local56, local375, Static160.anIntArray327[local185], local63);
							}
						}
					}
					Static175.method2731(local56, local416, local70, local63);
				}
				if (local51 == 3) {
					@Pc(544) Class65 local544 = Static147.aClass65ArrayArrayArray1[Static103.anInt2568][local56][local63];
					if (local544 != null) {
						for (@Pc(551) Class2_Sub4_Sub1_Sub6 local551 = (Class2_Sub4_Sub1_Sub6) local544.method2122(); local551 != null; local551 = (Class2_Sub4_Sub1_Sub6) local544.method2112()) {
							@Pc(558) Class2_Sub4_Sub12 local558 = Static58.method1034(local551.anInt2595);
							if (Static166.anInt3704 == 1) {
								Static75.method1358((short) 3, local63, Static28.aClass28_538, local56, (long) local551.anInt2595, Static83.method1481(new Class28[] { Static61.aClass28_954, Static31.aClass28_2398, local558.aClass28_1344 }));
							} else if (!Static163.aBoolean157) {
								@Pc(570) Class28[] local570 = local558.aClass28Array32;
								if (Static119.aBoolean129) {
									local570 = Static107.method1840(local570);
								}
								for (@Pc(578) int local578 = 4; local578 >= 0; local578--) {
									if (local570 != null && local570[local578] != null) {
										@Pc(625) byte local625 = 0;
										if (local578 == 0) {
											local625 = 34;
										}
										if (local578 == 1) {
											local625 = 45;
										}
										if (local578 == 2) {
											local625 = 57;
										}
										if (local578 == 3) {
											local625 = 15;
										}
										if (local578 == 4) {
											local625 = 50;
										}
										Static75.method1358(local625, local63, local570[local578], local56, (long) local551.anInt2595, Static83.method1481(new Class28[] { Static95.aClass28_1407, local558.aClass28_1344 }));
									} else if (local578 == 2) {
										Static75.method1358((short) 57, local63, Static96.aClass28_1421, local56, (long) local551.anInt2595, Static83.method1481(new Class28[] { Static95.aClass28_1407, local558.aClass28_1344 }));
									}
								}
								Static75.method1358((short) 1005, local63, Static82.aClass28_1233, local56, (long) local551.anInt2595, Static83.method1481(new Class28[] { Static95.aClass28_1407, local558.aClass28_1344 }));
							} else if ((Static151.anInt3386 & 0x1) == 1) {
								Static75.method1358((short) 51, local63, Static98.aClass28_1425, local56, (long) local551.anInt2595, Static83.method1481(new Class28[] { Static24.aClass28_499, Static31.aClass28_2398, local558.aClass28_1344 }));
							}
						}
					}
				}
			}
		}
	}
}
