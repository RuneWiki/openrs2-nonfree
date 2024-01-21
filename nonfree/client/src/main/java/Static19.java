import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!db", name = "x", descriptor = "Lclient!pb;")
	public static Class41 aClass41_11;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "Lclient!pb;")
	public static Class41 aClass41_12;

	@OriginalMember(owner = "client!db", name = "T", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_3;

	@OriginalMember(owner = "client!db", name = "hb", descriptor = "Lclient!pb;")
	public static Class41 aClass41_13;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "Lclient!rd;")
	public static Class64 aClass64_372 = Static69.method1153("@lre@");

	@OriginalMember(owner = "client!db", name = "A", descriptor = "Lclient!rd;")
	public static Class64 aClass64_373 = Static69.method1153("compass");

	@OriginalMember(owner = "client!db", name = "F", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "I")
	public static final int anInt612 = 32;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	public static int anInt613 = 0;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "[I")
	public static int[] anIntArray78 = new int[5];

	@OriginalMember(owner = "client!db", name = "L", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!db", name = "X", descriptor = "Lclient!rd;")
	public static Class64 aClass64_374 = Static69.method1153("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_375 = Static69.method1153("On");

	@OriginalMember(owner = "client!db", name = "db", descriptor = "Lclient!rd;")
	public static Class64 aClass64_376 = aClass64_375;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLclient!f;)V")
	public static void method388(@OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg0) {
		arg0.anInt2371 = 0;
		@Pc(13) int local13 = arg0.anInt2403 - Static15.anInt471;
		if (arg0.anInt2388 == 0) {
			arg0.anInt2386 = 1024;
		}
		if (arg0.anInt2388 == 1) {
			arg0.anInt2386 = 1536;
		}
		if (arg0.anInt2388 == 2) {
			arg0.anInt2386 = 0;
		}
		if (arg0.anInt2388 == 3) {
			arg0.anInt2386 = 512;
		}
		@Pc(58) int local58 = arg0.anInt2385 * 128 + arg0.anInt2395 * 64;
		@Pc(68) int local68 = arg0.anInt2395 * 64 + arg0.anInt2366 * 128;
		arg0.anInt2375 += (local58 - arg0.anInt2375) / local13;
		arg0.anInt2412 += (local68 - arg0.anInt2412) / local13;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)I")
	public static int method389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg4 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(16) int local16 = arg0;
			arg0 = arg1;
			arg1 = local16;
		}
		if (local7 == 0) {
			return arg5;
		} else if (local7 == 1) {
			return 1 + 7 - arg0 - arg3;
		} else if (local7 == 2) {
			return 7 + 1 - arg5 - arg1;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
	public static void method390(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static60.anIntArray207[arg0];
		@Pc(19) int local19 = Static95.anIntArray315[arg0];
		@Pc(23) int local23 = Static96.anIntArray434[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		@Pc(31) int local31 = Static84.anIntArray287[arg0];
		if (Static118.anInt2834 != 0 && local19 != 1004) {
			Static116.aBoolean166 = true;
			Static118.anInt2834 = 0;
		}
		@Pc(52) Class1_Sub1_Sub2_Sub1_Sub2 local52;
		if (local19 == 11) {
			local52 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local31];
			if (local52 != null) {
				Static8.method224(local52.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local52.anIntArray355[0], 1, 0, 0, 0, 1);
				Static6.anInt318 = 0;
				Static51.anInt1210 = Static96.anInt2745;
				Static85.anInt2752 = 2;
				Static57.anInt1293 = Static118.anInt2842;
				Static49.aClass1_Sub6_Sub1_1.method1877(31);
				Static49.aClass1_Sub6_Sub1_1.method1840(local31);
			}
		}
		@Pc(112) Class1_Sub1_Sub11 local112;
		if (local19 == 4) {
			local112 = Static75.method1258(local23, local15);
			if (local112 != null) {
				Static77.method1333();
				Static7.method218(Static99.method1599(Static31.method548(local112)), local15, local23);
				Static121.anInt2872 = 0;
				aBoolean41 = true;
				Static98.aClass64_1399 = Static16.method305(local112);
				if (Static98.aClass64_1399 == null) {
					Static98.aClass64_1399 = Static86.aClass64_1258;
				}
				if (local112.aBoolean95) {
					Static27.aClass64_579 = Static82.method1383(new Class64[] { local112.aClass64_1068, Static106.aClass64_1610 });
				} else {
					Static27.aClass64_579 = Static82.method1383(new Class64[] { Static70.aClass64_987, local112.aClass64_1065, Static106.aClass64_1610 });
				}
				if (Static18.anInt582 == 16 && !local112.aBoolean95) {
					aBoolean41 = true;
					Static83.anInt1922 = 3;
					Static84.aBoolean118 = true;
				}
			}
			return;
		}
		if (local19 == 51 && Static18.method359(local23, local31, local15)) {
			Static49.aClass1_Sub6_Sub1_1.method1877(174);
			Static49.aClass1_Sub6_Sub1_1.method1854(Static67.anInt1531);
			Static49.aClass1_Sub6_Sub1_1.method1816(Static54.anInt2050);
			Static49.aClass1_Sub6_Sub1_1.method1816(local15 + Static60.anInt1350);
			Static49.aClass1_Sub6_Sub1_1.method1839(local31 >> 14 & 0x7FFF);
			Static49.aClass1_Sub6_Sub1_1.method1871(Static53.anInt1236 + local23);
			Static49.aClass1_Sub6_Sub1_1.method1816(Static43.anInt969);
		}
		if (local19 == 57) {
			Static49.aClass1_Sub6_Sub1_1.method1877(29);
			Static49.aClass1_Sub6_Sub1_1.method1871(local31);
			Static49.aClass1_Sub6_Sub1_1.method1851(local23);
			Static49.aClass1_Sub6_Sub1_1.method1871(local15);
			Static95.anInt2170 = 0;
			Static51.anInt1207 = local15;
			Static117.anInt2816 = 2;
			if (Static95.anInt2177 == local23 >> 16) {
				Static117.anInt2816 = 1;
			}
			if (local23 >> 16 == Static101.anInt2272) {
				Static117.anInt2816 = 3;
			}
			Static101.anInt2269 = local23;
		}
		if (local19 == 1002) {
			Static18.method359(local23, local31, local15);
			Static49.aClass1_Sub6_Sub1_1.method1877(248);
			Static49.aClass1_Sub6_Sub1_1.method1839(Static53.anInt1236 + local23);
			Static49.aClass1_Sub6_Sub1_1.method1816(local31 >> 14 & 0x7FFF);
			Static49.aClass1_Sub6_Sub1_1.method1816(local15 + Static60.anInt1350);
		}
		@Pc(359) boolean local359;
		if (local19 == 44) {
			local359 = Static8.method224(local15, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local23, 0, 0, 0, 0, 0);
			if (!local359) {
				Static8.method224(local15, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local23, 1, 0, 0, 0, 1);
			}
			Static85.anInt2752 = 2;
			Static57.anInt1293 = Static118.anInt2842;
			Static51.anInt1210 = Static96.anInt2745;
			Static6.anInt318 = 0;
			Static49.aClass1_Sub6_Sub1_1.method1877(234);
			Static49.aClass1_Sub6_Sub1_1.method1816(local31);
			Static49.aClass1_Sub6_Sub1_1.method1871(Static60.anInt1350 + local15);
			Static49.aClass1_Sub6_Sub1_1.method1816(local23 + Static53.anInt1236);
		}
		@Pc(436) int local436;
		@Pc(452) long local452;
		@Pc(431) Class64 local431;
		if (local19 == 7 || local19 == 2 || local19 == 9 || local19 == 21) {
			local431 = Static101.aClass64Array16[arg0];
			local436 = local431.method1473(Static106.aClass64_1610);
			if (local436 != -1) {
				local452 = local431.method1481(local436 + 5).method1477().method1492();
				if (local19 == 7) {
					Static99.method1602(local452);
				}
				if (local19 == 2) {
					Static54.method1461(local452);
				}
				if (local19 == 9) {
					Static74.method1236(local452);
				}
				if (local19 == 21) {
					Static45.method816(local452);
				}
			}
		}
		if (local19 == 1003) {
			Static51.anInt1210 = Static96.anInt2745;
			Static57.anInt1293 = Static118.anInt2842;
			Static85.anInt2752 = 2;
			Static6.anInt318 = 0;
			Static49.aClass1_Sub6_Sub1_1.method1877(246);
			Static49.aClass1_Sub6_Sub1_1.method1871(local31 >> 14 & 0x7FFF);
		}
		if (local19 == 26) {
			local52 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local31];
			if (local52 != null) {
				Static8.method224(local52.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local52.anIntArray355[0], 1, 0, 0, 0, 1);
				Static51.anInt1210 = Static96.anInt2745;
				Static6.anInt318 = 0;
				Static85.anInt2752 = 2;
				Static57.anInt1293 = Static118.anInt2842;
				Static49.aClass1_Sub6_Sub1_1.method1877(138);
				Static49.aClass1_Sub6_Sub1_1.method1840(local31);
			}
		}
		if (local19 == 43) {
			local52 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local31];
			if (local52 != null) {
				Static8.method224(local52.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local52.anIntArray355[0], 1, 0, 0, 0, 1);
				Static6.anInt318 = 0;
				Static51.anInt1210 = Static96.anInt2745;
				Static85.anInt2752 = 2;
				Static57.anInt1293 = Static118.anInt2842;
				Static49.aClass1_Sub6_Sub1_1.method1877(51);
				Static49.aClass1_Sub6_Sub1_1.method1839(local31);
			}
		}
		@Pc(638) Class1_Sub1_Sub2_Sub1_Sub1 local638;
		if (local19 == 54) {
			local638 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local638 != null) {
				Static8.method224(local638.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local638.anIntArray355[0], 1, 0, 0, 0, 1);
				Static85.anInt2752 = 2;
				Static51.anInt1210 = Static96.anInt2745;
				Static6.anInt318 = 0;
				Static57.anInt1293 = Static118.anInt2842;
				Static49.aClass1_Sub6_Sub1_1.method1877(161);
				Static49.aClass1_Sub6_Sub1_1.method1871(local31);
			}
		}
		if (local19 == 53) {
			Static49.aClass1_Sub6_Sub1_1.method1877(224);
			Static49.aClass1_Sub6_Sub1_1.method1851(local23);
			local112 = Static12.method1397(local23);
			if (local112.anIntArrayArray23 != null && local112.anIntArrayArray23[0][0] == 5) {
				local436 = local112.anIntArrayArray23[0][1];
				if (Static101.anIntArray333[local436] != local112.anIntArray247[0]) {
					Static101.anIntArray333[local436] = local112.anIntArray247[0];
					Static60.method1020(local436);
					aBoolean41 = true;
				}
			}
		}
		if (local19 == 5) {
			Static18.method359(local23, local31, local15);
			Static49.aClass1_Sub6_Sub1_1.method1877(98);
			Static49.aClass1_Sub6_Sub1_1.method1816(local23 + Static53.anInt1236);
			Static49.aClass1_Sub6_Sub1_1.method1840(local15 + Static60.anInt1350);
			Static49.aClass1_Sub6_Sub1_1.method1816(local31 >> 14 & 0x7FFF);
		}
		if (local19 == 46) {
			Static18.method359(local23, local31, local15);
			Static49.aClass1_Sub6_Sub1_1.method1877(226);
			Static49.aClass1_Sub6_Sub1_1.method1871(local15 + Static60.anInt1350);
			Static49.aClass1_Sub6_Sub1_1.method1840(Static53.anInt1236 + local23);
			Static49.aClass1_Sub6_Sub1_1.method1839(local31 >> 14 & 0x7FFF);
		}
		if (local19 == 28) {
			Static49.aClass1_Sub6_Sub1_1.method1877(21);
			Static49.aClass1_Sub6_Sub1_1.method1840(local31);
			Static49.aClass1_Sub6_Sub1_1.method1839(local15);
			Static49.aClass1_Sub6_Sub1_1.method1854(local23);
			Static101.anInt2269 = local23;
			Static117.anInt2816 = 2;
			if (local23 >> 16 == Static95.anInt2177) {
				Static117.anInt2816 = 1;
			}
			Static51.anInt1207 = local15;
			Static95.anInt2170 = 0;
			if (local23 >> 16 == Static101.anInt2272) {
				Static117.anInt2816 = 3;
			}
		}
		if (local19 == 42) {
			local112 = Static12.method1397(local23);
			@Pc(904) boolean local904 = true;
			if (local112.anInt1709 > 0) {
				local904 = Static62.method1088(local112);
			}
			if (local904) {
				Static49.aClass1_Sub6_Sub1_1.method1877(224);
				Static49.aClass1_Sub6_Sub1_1.method1851(local23);
			}
		}
		if (local19 == 8 && Static18.method359(local23, local31, local15)) {
			Static49.aClass1_Sub6_Sub1_1.method1877(7);
			Static49.aClass1_Sub6_Sub1_1.method1840(Static60.anInt1350 + local15);
			Static49.aClass1_Sub6_Sub1_1.method1816(local31 >> 14 & 0x7FFF);
			Static49.aClass1_Sub6_Sub1_1.method1863(Static114.anInt2740);
			Static49.aClass1_Sub6_Sub1_1.method1839(local23 + Static53.anInt1236);
			Static49.aClass1_Sub6_Sub1_1.method1871(Static64.anInt1482);
		}
		if (local19 == 10) {
			Static49.aClass1_Sub6_Sub1_1.method1877(6);
			Static49.aClass1_Sub6_Sub1_1.method1839(local15);
			Static49.aClass1_Sub6_Sub1_1.method1840(local31);
			Static49.aClass1_Sub6_Sub1_1.method1854(local23);
			Static117.anInt2816 = 2;
			Static51.anInt1207 = local15;
			if (local23 >> 16 == Static95.anInt2177) {
				Static117.anInt2816 = 1;
			}
			Static101.anInt2269 = local23;
			Static95.anInt2170 = 0;
			if (Static101.anInt2272 == local23 >> 16) {
				Static117.anInt2816 = 3;
			}
		}
		if (local19 == 47) {
			local638 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local638 != null) {
				Static8.method224(local638.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local638.anIntArray355[0], 1, 0, 0, 0, 1);
				Static51.anInt1210 = Static96.anInt2745;
				Static6.anInt318 = 0;
				Static57.anInt1293 = Static118.anInt2842;
				Static85.anInt2752 = 2;
				Static49.aClass1_Sub6_Sub1_1.method1877(168);
				Static49.aClass1_Sub6_Sub1_1.method1840(local31);
			}
		}
		if (local19 == 35) {
			local638 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local638 != null) {
				Static8.method224(local638.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local638.anIntArray355[0], 1, 0, 0, 0, 1);
				Static57.anInt1293 = Static118.anInt2842;
				Static51.anInt1210 = Static96.anInt2745;
				Static6.anInt318 = 0;
				Static85.anInt2752 = 2;
				Static49.aClass1_Sub6_Sub1_1.method1877(109);
				Static49.aClass1_Sub6_Sub1_1.method1839(local31);
			}
		}
		if (local19 == 20) {
			local638 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local638 != null) {
				Static8.method224(local638.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local638.anIntArray355[0], 1, 0, 0, 0, 1);
				Static85.anInt2752 = 2;
				Static57.anInt1293 = Static118.anInt2842;
				Static51.anInt1210 = Static96.anInt2745;
				Static6.anInt318 = 0;
				Static49.aClass1_Sub6_Sub1_1.method1877(113);
				Static49.aClass1_Sub6_Sub1_1.method1871(local31);
			}
		}
		if (local19 == 45 && Static15.anInt468 == -1) {
			Static51.method920(local23, local15);
			Static71.anInt1617 = local15;
			Static15.anInt468 = local23;
		}
		if (local19 == 14) {
			local52 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local31];
			if (local52 != null) {
				Static8.method224(local52.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local52.anIntArray355[0], 1, 0, 0, 0, 1);
				Static51.anInt1210 = Static96.anInt2745;
				Static6.anInt318 = 0;
				Static57.anInt1293 = Static118.anInt2842;
				Static85.anInt2752 = 2;
				Static49.aClass1_Sub6_Sub1_1.method1877(30);
				Static49.aClass1_Sub6_Sub1_1.method1840(Static43.anInt969);
				Static49.aClass1_Sub6_Sub1_1.method1864(Static67.anInt1531);
				Static49.aClass1_Sub6_Sub1_1.method1839(local31);
				Static49.aClass1_Sub6_Sub1_1.method1840(Static54.anInt2050);
			}
		}
		if (local19 == 25) {
			Static49.aClass1_Sub6_Sub1_1.method1877(224);
			Static49.aClass1_Sub6_Sub1_1.method1851(local23);
			local112 = Static12.method1397(local23);
			if (local112.anIntArrayArray23 != null && local112.anIntArrayArray23[0][0] == 5) {
				local436 = local112.anIntArrayArray23[0][1];
				Static101.anIntArray333[local436] = 1 - Static101.anIntArray333[local436];
				Static60.method1020(local436);
				aBoolean41 = true;
			}
		}
		if (local19 == 37) {
			Static49.aClass1_Sub6_Sub1_1.method1877(181);
			Static49.aClass1_Sub6_Sub1_1.method1864(local23);
			Static49.aClass1_Sub6_Sub1_1.method1871(local31);
			Static49.aClass1_Sub6_Sub1_1.method1840(local15);
			Static51.anInt1207 = local15;
			Static101.anInt2269 = local23;
			Static117.anInt2816 = 2;
			if (Static95.anInt2177 == local23 >> 16) {
				Static117.anInt2816 = 1;
			}
			if (Static101.anInt2272 == local23 >> 16) {
				Static117.anInt2816 = 3;
			}
			Static95.anInt2170 = 0;
		}
		if (local19 == 58) {
			local359 = Static8.method224(local15, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local23, 0, 0, 0, 0, 0);
			if (!local359) {
				Static8.method224(local15, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local23, 1, 0, 0, 0, 1);
			}
			Static6.anInt318 = 0;
			Static51.anInt1210 = Static96.anInt2745;
			Static85.anInt2752 = 2;
			Static57.anInt1293 = Static118.anInt2842;
			Static49.aClass1_Sub6_Sub1_1.method1877(48);
			Static49.aClass1_Sub6_Sub1_1.method1816(local15 + Static60.anInt1350);
			Static49.aClass1_Sub6_Sub1_1.method1816(local23 + Static53.anInt1236);
			Static49.aClass1_Sub6_Sub1_1.method1839(local31);
		}
		if (local19 == 1001) {
			Static6.anInt318 = 0;
			Static51.anInt1210 = Static96.anInt2745;
			Static57.anInt1293 = Static118.anInt2842;
			Static85.anInt2752 = 2;
			Static49.aClass1_Sub6_Sub1_1.method1877(215);
			Static49.aClass1_Sub6_Sub1_1.method1840(local31);
		}
		@Pc(1542) int local1542;
		if (local19 == 22 || local19 == 27) {
			local431 = Static101.aClass64Array16[arg0];
			local436 = local431.method1473(Static106.aClass64_1610);
			if (local436 != -1) {
				local431 = local431.method1481(local436 + 5).method1477();
				@Pc(1538) Class64 local1538 = local431.method1471().method1478();
				@Pc(1540) boolean local1540 = false;
				for (local1542 = 0; local1542 < Static6.anInt319; local1542++) {
					@Pc(1550) Class1_Sub1_Sub2_Sub1_Sub2 local1550 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[Static90.anIntArray69[local1542]];
					if (local1550 != null && local1550.aClass64_1543 != null && local1550.aClass64_1543.method1501(local1538)) {
						Static8.method224(local1550.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local1550.anIntArray355[0], 1, 0, 0, 0, 1);
						if (local19 == 22) {
							Static49.aClass1_Sub6_Sub1_1.method1877(210);
							Static49.aClass1_Sub6_Sub1_1.method1816(Static90.anIntArray69[local1542]);
						}
						if (local19 == 27) {
							Static49.aClass1_Sub6_Sub1_1.method1877(51);
							Static49.aClass1_Sub6_Sub1_1.method1839(Static90.anIntArray69[local1542]);
						}
						local1540 = true;
						break;
					}
				}
				if (!local1540) {
					Static71.method1178(Static60.aClass64_862, Static82.method1383(new Class64[] { Static15.aClass64_314, local1538 }), 0);
				}
			}
		}
		if (local19 == 49) {
			local638 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local638 != null) {
				Static8.method224(local638.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local638.anIntArray355[0], 1, 0, 0, 0, 1);
				Static6.anInt318 = 0;
				Static51.anInt1210 = Static96.anInt2745;
				Static85.anInt2752 = 2;
				Static57.anInt1293 = Static118.anInt2842;
				Static49.aClass1_Sub6_Sub1_1.method1877(218);
				Static49.aClass1_Sub6_Sub1_1.method1840(local31);
			}
		}
		if (local19 == 16) {
			local52 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local31];
			if (local52 != null) {
				Static8.method224(local52.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local52.anIntArray355[0], 1, 0, 0, 0, 1);
				Static51.anInt1210 = Static96.anInt2745;
				Static6.anInt318 = 0;
				Static57.anInt1293 = Static118.anInt2842;
				Static85.anInt2752 = 2;
				Static49.aClass1_Sub6_Sub1_1.method1877(99);
				Static49.aClass1_Sub6_Sub1_1.method1864(Static114.anInt2740);
				Static49.aClass1_Sub6_Sub1_1.method1840(local31);
				Static49.aClass1_Sub6_Sub1_1.method1840(Static64.anInt1482);
			}
		}
		if (local19 == 18) {
			local359 = Static8.method224(local15, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local23, 0, 0, 0, 0, 0);
			if (!local359) {
				Static8.method224(local15, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local23, 1, 0, 0, 0, 1);
			}
			Static85.anInt2752 = 2;
			Static6.anInt318 = 0;
			Static51.anInt1210 = Static96.anInt2745;
			Static57.anInt1293 = Static118.anInt2842;
			Static49.aClass1_Sub6_Sub1_1.method1877(192);
			Static49.aClass1_Sub6_Sub1_1.method1816(local15 + Static60.anInt1350);
			Static49.aClass1_Sub6_Sub1_1.method1871(Static53.anInt1236 + local23);
			Static49.aClass1_Sub6_Sub1_1.method1840(local31);
		}
		if (local19 == 30) {
			local638 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local638 != null) {
				Static8.method224(local638.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local638.anIntArray355[0], 1, 0, 0, 0, 1);
				Static57.anInt1293 = Static118.anInt2842;
				Static6.anInt318 = 0;
				Static51.anInt1210 = Static96.anInt2745;
				Static85.anInt2752 = 2;
				Static49.aClass1_Sub6_Sub1_1.method1877(103);
				Static49.aClass1_Sub6_Sub1_1.method1839(local31);
				Static49.aClass1_Sub6_Sub1_1.method1840(Static43.anInt969);
				Static49.aClass1_Sub6_Sub1_1.method1864(Static67.anInt1531);
				Static49.aClass1_Sub6_Sub1_1.method1816(Static54.anInt2050);
			}
		}
		if (local19 == 13) {
			Static18.method359(local23, local31, local15);
			Static49.aClass1_Sub6_Sub1_1.method1877(136);
			Static49.aClass1_Sub6_Sub1_1.method1871(Static53.anInt1236 + local23);
			Static49.aClass1_Sub6_Sub1_1.method1840(local31 >> 14 & 0x7FFF);
			Static49.aClass1_Sub6_Sub1_1.method1839(Static60.anInt1350 + local15);
		}
		if (local19 == 23) {
			Static77.method1333();
			Static43.anInt969 = local15;
			aBoolean41 = true;
			Static54.anInt2050 = local31;
			Static67.anInt1531 = local23;
			Static121.anInt2872 = 1;
			Static13.aClass64_304 = Static82.method1383(new Class64[] { aClass64_372, Static106.method1739(local31).aClass64_646, Static106.aClass64_1610 });
			if (Static13.aClass64_304 == null) {
				Static13.aClass64_304 = Static121.aClass64_1850;
			}
			return;
		}
		if (local19 == 1) {
			Static49.aClass1_Sub6_Sub1_1.method1877(229);
			Static49.aClass1_Sub6_Sub1_1.method1839(local15);
			Static49.aClass1_Sub6_Sub1_1.method1864(local23);
			Static49.aClass1_Sub6_Sub1_1.method1871(local31);
			Static95.anInt2170 = 0;
			Static51.anInt1207 = local15;
			Static117.anInt2816 = 2;
			if (local23 >> 16 == Static95.anInt2177) {
				Static117.anInt2816 = 1;
			}
			Static101.anInt2269 = local23;
			if (local23 >> 16 == Static101.anInt2272) {
				Static117.anInt2816 = 3;
			}
		}
		if (local19 == 33) {
			local359 = Static8.method224(local15, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local23, 0, 0, 0, 0, 0);
			if (!local359) {
				Static8.method224(local15, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local23, 1, 0, 0, 0, 1);
			}
			Static57.anInt1293 = Static118.anInt2842;
			Static51.anInt1210 = Static96.anInt2745;
			Static85.anInt2752 = 2;
			Static6.anInt318 = 0;
			Static49.aClass1_Sub6_Sub1_1.method1877(57);
			Static49.aClass1_Sub6_Sub1_1.method1839(Static64.anInt1482);
			Static49.aClass1_Sub6_Sub1_1.method1816(local31);
			Static49.aClass1_Sub6_Sub1_1.method1871(Static53.anInt1236 + local23);
			Static49.aClass1_Sub6_Sub1_1.method1839(Static60.anInt1350 + local15);
			Static49.aClass1_Sub6_Sub1_1.method1863(Static114.anInt2740);
		}
		if (local19 == 1005) {
			Static85.anInt2752 = 2;
			Static57.anInt1293 = Static118.anInt2842;
			Static51.anInt1210 = Static96.anInt2745;
			Static6.anInt318 = 0;
			local638 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local638 != null) {
				@Pc(2179) Class1_Sub1_Sub15 local2179 = local638.aClass1_Sub1_Sub15_1;
				if (local2179.anIntArray339 != null) {
					local2179 = local2179.method1648();
				}
				if (local2179 != null) {
					Static49.aClass1_Sub6_Sub1_1.method1877(105);
					Static49.aClass1_Sub6_Sub1_1.method1871(local2179.anInt2306);
				}
			}
		}
		if (local19 == 15) {
			Static49.aClass1_Sub6_Sub1_1.method1877(106);
			Static49.aClass1_Sub6_Sub1_1.method1840(Static64.anInt1482);
			Static49.aClass1_Sub6_Sub1_1.method1851(local23);
			Static49.aClass1_Sub6_Sub1_1.method1854(Static114.anInt2740);
			Static49.aClass1_Sub6_Sub1_1.method1871(local15);
		}
		if (local19 == 17) {
			local431 = Static101.aClass64Array16[arg0];
			local436 = local431.method1473(Static106.aClass64_1610);
			if (local436 != -1) {
				if (Static95.anInt2177 == -1) {
					Static105.method1719();
					if (Static106.anInt2497 != -1) {
						Static60.aClass64_867 = local431.method1481(local436 + 5).method1477();
						Static15.aBoolean34 = false;
						Static99.anInt2208 = Static95.anInt2177 = Static106.anInt2497;
					}
				} else {
					Static71.method1178(Static60.aClass64_862, Static7.aClass64_242, 0);
					if (Static40.aClass64_612 != null) {
						Static71.method1178(Static60.aClass64_862, Static40.aClass64_612, 0);
					}
				}
			}
		}
		if (local19 == 24) {
			Static18.method358(local15, local23, local31);
		}
		if (local19 == 34) {
			local52 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local31];
			if (local52 != null) {
				Static8.method224(local52.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local52.anIntArray355[0], 1, 0, 0, 0, 1);
				Static57.anInt1293 = Static118.anInt2842;
				Static85.anInt2752 = 2;
				Static51.anInt1210 = Static96.anInt2745;
				Static6.anInt318 = 0;
				Static49.aClass1_Sub6_Sub1_1.method1877(210);
				Static49.aClass1_Sub6_Sub1_1.method1816(local31);
			}
		}
		if (local19 == 38) {
			local359 = Static8.method224(local15, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local23, 0, 0, 0, 0, 0);
			if (!local359) {
				Static8.method224(local15, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local23, 1, 0, 0, 0, 1);
			}
			Static57.anInt1293 = Static118.anInt2842;
			Static6.anInt318 = 0;
			Static51.anInt1210 = Static96.anInt2745;
			Static85.anInt2752 = 2;
			Static49.aClass1_Sub6_Sub1_1.method1877(159);
			Static49.aClass1_Sub6_Sub1_1.method1839(Static54.anInt2050);
			Static49.aClass1_Sub6_Sub1_1.method1839(Static60.anInt1350 + local15);
			Static49.aClass1_Sub6_Sub1_1.method1871(Static43.anInt969);
			Static49.aClass1_Sub6_Sub1_1.method1840(Static53.anInt1236 + local23);
			Static49.aClass1_Sub6_Sub1_1.method1863(Static67.anInt1531);
			Static49.aClass1_Sub6_Sub1_1.method1840(local31);
		}
		if (local19 == 50) {
			Static49.aClass1_Sub6_Sub1_1.method1877(117);
			Static49.aClass1_Sub6_Sub1_1.method1871(local15);
			Static49.aClass1_Sub6_Sub1_1.method1854(local23);
			Static49.aClass1_Sub6_Sub1_1.method1840(local31);
			Static117.anInt2816 = 2;
			Static95.anInt2170 = 0;
			if (local23 >> 16 == Static95.anInt2177) {
				Static117.anInt2816 = 1;
			}
			Static51.anInt1207 = local15;
			if (Static101.anInt2272 == local23 >> 16) {
				Static117.anInt2816 = 3;
			}
			Static101.anInt2269 = local23;
		}
		if (local19 == 6) {
			Static49.aClass1_Sub6_Sub1_1.method1877(243);
			Static49.aClass1_Sub6_Sub1_1.method1864(local23);
			Static49.aClass1_Sub6_Sub1_1.method1839(local31);
			Static49.aClass1_Sub6_Sub1_1.method1839(local15);
			Static101.anInt2269 = local23;
			Static51.anInt1207 = local15;
			Static117.anInt2816 = 2;
			Static95.anInt2170 = 0;
			if (local23 >> 16 == Static95.anInt2177) {
				Static117.anInt2816 = 1;
			}
			if (Static101.anInt2272 == local23 >> 16) {
				Static117.anInt2816 = 3;
			}
		}
		if (local19 == 40) {
			local431 = Static101.aClass64Array16[arg0];
			local436 = local431.method1473(Static106.aClass64_1610);
			if (local436 != -1) {
				local452 = local431.method1481(local436 + 5).method1477().method1492();
				local1542 = -1;
				for (@Pc(2586) int local2586 = 0; local2586 < Static106.anInt2498; local2586++) {
					if (local452 == Static14.aLongArray1[local2586]) {
						local1542 = local2586;
						break;
					}
				}
				if (local1542 != -1 && Static27.anIntArray139[local1542] > 0) {
					Static116.aBoolean166 = true;
					Static3.aBoolean9 = true;
					Static60.aClass64_869 = Static60.aClass64_862;
					Static118.anInt2834 = 0;
					Static42.anInt930 = 3;
					Static34.aLong27 = Static14.aLongArray1[local1542];
					Static60.aClass64_865 = Static82.method1383(new Class64[] { Static114.aClass64_1747, Static3.aClass64Array1[local1542] });
				}
			}
		}
		if (local19 == 36) {
			Static49.aClass1_Sub6_Sub1_1.method1877(33);
			Static49.aClass1_Sub6_Sub1_1.method1871(local31);
			Static49.aClass1_Sub6_Sub1_1.method1851(local23);
			Static49.aClass1_Sub6_Sub1_1.method1840(local15);
			Static95.anInt2170 = 0;
			Static101.anInt2269 = local23;
			Static51.anInt1207 = local15;
			Static117.anInt2816 = 2;
			if (local23 >> 16 == Static95.anInt2177) {
				Static117.anInt2816 = 1;
			}
			if (local23 >> 16 == Static101.anInt2272) {
				Static117.anInt2816 = 3;
			}
		}
		if (local19 == 39) {
			Static105.method1719();
		}
		if (local19 == 55) {
			Static85.method2013(Static6.anInt322);
			Static116.aBoolean166 = true;
			Static6.anInt322 = -1;
		}
		if (local19 == 32) {
			local638 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local638 != null) {
				Static8.method224(local638.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local638.anIntArray355[0], 1, 0, 0, 0, 1);
				Static51.anInt1210 = Static96.anInt2745;
				Static57.anInt1293 = Static118.anInt2842;
				Static85.anInt2752 = 2;
				Static6.anInt318 = 0;
				Static49.aClass1_Sub6_Sub1_1.method1877(176);
				Static49.aClass1_Sub6_Sub1_1.method1863(Static114.anInt2740);
				Static49.aClass1_Sub6_Sub1_1.method1871(Static64.anInt1482);
				Static49.aClass1_Sub6_Sub1_1.method1839(local31);
			}
		}
		if (local19 == 52) {
			Static18.method359(local23, local31, local15);
			Static49.aClass1_Sub6_Sub1_1.method1877(70);
			Static49.aClass1_Sub6_Sub1_1.method1871(local31 >> 14 & 0x7FFF);
			Static49.aClass1_Sub6_Sub1_1.method1840(local23 + Static53.anInt1236);
			Static49.aClass1_Sub6_Sub1_1.method1816(Static60.anInt1350 + local15);
		}
		if (local19 == 29) {
			Static49.aClass1_Sub6_Sub1_1.method1877(184);
			Static49.aClass1_Sub6_Sub1_1.method1839(local15);
			Static49.aClass1_Sub6_Sub1_1.method1863(Static67.anInt1531);
			Static49.aClass1_Sub6_Sub1_1.method1840(Static43.anInt969);
			Static49.aClass1_Sub6_Sub1_1.method1816(Static54.anInt2050);
			Static49.aClass1_Sub6_Sub1_1.method1871(local31);
			Static49.aClass1_Sub6_Sub1_1.method1854(local23);
			Static51.anInt1207 = local15;
			Static95.anInt2170 = 0;
			Static117.anInt2816 = 2;
			if (Static95.anInt2177 == local23 >> 16) {
				Static117.anInt2816 = 1;
			}
			if (Static101.anInt2272 == local23 >> 16) {
				Static117.anInt2816 = 3;
			}
			Static101.anInt2269 = local23;
		}
		if (local19 == 31) {
			Static49.aClass1_Sub6_Sub1_1.method1877(74);
			Static49.aClass1_Sub6_Sub1_1.method1871(local31);
			Static49.aClass1_Sub6_Sub1_1.method1840(local15);
			Static49.aClass1_Sub6_Sub1_1.method1864(local23);
			Static51.anInt1207 = local15;
			Static101.anInt2269 = local23;
			Static95.anInt2170 = 0;
			Static117.anInt2816 = 2;
			if (local23 >> 16 == Static95.anInt2177) {
				Static117.anInt2816 = 1;
			}
			if (Static101.anInt2272 == local23 >> 16) {
				Static117.anInt2816 = 3;
			}
		}
		if (local19 == 12) {
			local52 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local31];
			if (local52 != null) {
				Static8.method224(local52.anIntArray354[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local52.anIntArray355[0], 1, 0, 0, 0, 1);
				Static85.anInt2752 = 2;
				Static51.anInt1210 = Static96.anInt2745;
				Static6.anInt318 = 0;
				Static57.anInt1293 = Static118.anInt2842;
				Static49.aClass1_Sub6_Sub1_1.method1877(183);
				Static49.aClass1_Sub6_Sub1_1.method1839(local31);
			}
		}
		if (local19 == 56) {
			local359 = Static8.method224(local15, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local23, 0, 0, 0, 0, 0);
			if (!local359) {
				Static8.method224(local15, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local23, 1, 0, 0, 0, 1);
			}
			Static51.anInt1210 = Static96.anInt2745;
			Static85.anInt2752 = 2;
			Static6.anInt318 = 0;
			Static57.anInt1293 = Static118.anInt2842;
			Static49.aClass1_Sub6_Sub1_1.method1877(62);
			Static49.aClass1_Sub6_Sub1_1.method1816(local15 + Static60.anInt1350);
			Static49.aClass1_Sub6_Sub1_1.method1816(local23 + Static53.anInt1236);
			Static49.aClass1_Sub6_Sub1_1.method1871(local31);
		}
		if (local19 == 1006) {
			local112 = Static12.method1397(local23);
			if (local112 == null || local112.anIntArray248[local15] < 100000) {
				Static49.aClass1_Sub6_Sub1_1.method1877(215);
				Static49.aClass1_Sub6_Sub1_1.method1840(local31);
			} else {
				Static71.method1178(Static60.aClass64_862, Static82.method1383(new Class64[] { Static12.method1395(local112.anIntArray248[local15]), Static5.aClass64_125, Static106.method1739(local31).aClass64_646 }), 0);
			}
			Static101.anInt2269 = local23;
			Static95.anInt2170 = 0;
			Static51.anInt1207 = local15;
			Static117.anInt2816 = 2;
			if (Static95.anInt2177 == local23 >> 16) {
				Static117.anInt2816 = 1;
			}
			if (Static101.anInt2272 == local23 >> 16) {
				Static117.anInt2816 = 3;
			}
		}
		if (local19 == 48) {
			Static49.aClass1_Sub6_Sub1_1.method1877(25);
			Static49.aClass1_Sub6_Sub1_1.method1840(local31);
			Static49.aClass1_Sub6_Sub1_1.method1839(local15);
			Static49.aClass1_Sub6_Sub1_1.method1864(local23);
			Static117.anInt2816 = 2;
			Static51.anInt1207 = local15;
			Static101.anInt2269 = local23;
			Static95.anInt2170 = 0;
			if (local23 >> 16 == Static95.anInt2177) {
				Static117.anInt2816 = 1;
			}
			if (local23 >> 16 == Static101.anInt2272) {
				Static117.anInt2816 = 3;
			}
		}
		if (local19 == 41) {
			Static49.aClass1_Sub6_Sub1_1.method1877(84);
			Static49.aClass1_Sub6_Sub1_1.method1871(local15);
			Static49.aClass1_Sub6_Sub1_1.method1864(local23);
			Static49.aClass1_Sub6_Sub1_1.method1840(Static64.anInt1482);
			Static49.aClass1_Sub6_Sub1_1.method1839(local31);
			Static49.aClass1_Sub6_Sub1_1.method1851(Static114.anInt2740);
			Static101.anInt2269 = local23;
			Static117.anInt2816 = 2;
			if (local23 >> 16 == Static95.anInt2177) {
				Static117.anInt2816 = 1;
			}
			Static51.anInt1207 = local15;
			Static95.anInt2170 = 0;
			if (local23 >> 16 == Static101.anInt2272) {
				Static117.anInt2816 = 3;
			}
		}
		if (local19 == 19) {
			if (Static94.aBoolean132) {
				Static82.aClass68_1.method1794(Static15.anInt463, local15 - 4, local23 - 4);
			} else {
				Static82.aClass68_1.method1794(Static15.anInt463, Static118.anInt2842 - 4, Static96.anInt2745 + -4);
			}
		}
		if (local19 == 3) {
			local359 = Static8.method224(local15, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local23, 0, 0, 0, 0, 0);
			if (!local359) {
				Static8.method224(local15, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, false, local23, 1, 0, 0, 0, 1);
			}
			Static85.anInt2752 = 2;
			Static57.anInt1293 = Static118.anInt2842;
			Static51.anInt1210 = Static96.anInt2745;
			Static6.anInt318 = 0;
			Static49.aClass1_Sub6_Sub1_1.method1877(13);
			Static49.aClass1_Sub6_Sub1_1.method1839(local15 + Static60.anInt1350);
			Static49.aClass1_Sub6_Sub1_1.method1840(local31);
			Static49.aClass1_Sub6_Sub1_1.method1816(local23 + Static53.anInt1236);
		}
		if (Static121.anInt2872 != 0) {
			aBoolean41 = true;
			Static121.anInt2872 = 0;
		}
		if (Static103.aBoolean143) {
			Static77.method1333();
			aBoolean41 = true;
		}
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
	public static void method391() {
		@Pc(7) int local7 = Static109.anInt2635;
		@Pc(9) int local9 = Static110.anInt2655;
		@Pc(11) int local11 = Static71.anInt1611;
		@Pc(13) int local13 = Static119.anInt2852;
		Static47.method1957(local7, local11, local9, local13, 6116423);
		Static47.method1957(local7 + 1, local11 - -1, local9 - 2, 16, 0);
		Static47.method1950(local7 + 1, local11 + 18, local9 - 2, local13 + -19, 0);
		Static17.aClass1_Sub1_Sub5_Sub1_2.method661(Static52.aClass64_1827, local7 + 3, local11 - -14, 6116423);
		@Pc(59) int local59 = Static81.anInt1404;
		@Pc(61) int local61 = Static63.anInt1474;
		if (Static12.anInt1938 == 0) {
			local59 -= 4;
			local61 -= 4;
		}
		if (Static12.anInt1938 == 1) {
			local59 -= 553;
			local61 -= 205;
		}
		if (Static12.anInt1938 == 2) {
			local61 -= 357;
			local59 -= 17;
		}
		for (@Pc(77) int local77 = 0; local77 < Static48.anInt2603; local77++) {
			@Pc(93) int local93 = local11 + (Static48.anInt2603 - local77 - 1) * 15 + 31;
			@Pc(95) int local95 = 16777215;
			if (local7 < local59 && local59 < local7 + local9 && local93 - 13 < local61 && local61 < local93 + 3) {
				local95 = 16776960;
			}
			Static17.aClass1_Sub1_Sub5_Sub1_2.method666(Static101.aClass64Array16[local77], local7 + 3, local93, local95, true);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BI[IIZ)V")
	public static void method392(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static57.aClass37_18.method1459();
		Static84.aClass1_Sub1_Sub5_Sub3_15.method1290(0, 0);
		if (arg3) {
			if (arg1[arg0] != -1) {
				if (arg0 == 0) {
					Static82.aClass1_Sub1_Sub5_Sub3_14.method1290(22, 10);
				}
				if (arg0 == 1) {
					Static48.aClass1_Sub1_Sub5_Sub3_18.method1290(54, 8);
				}
				if (arg0 == 2) {
					Static48.aClass1_Sub1_Sub5_Sub3_18.method1290(82, 8);
				}
				if (arg0 == 3) {
					Static66.aClass1_Sub1_Sub5_Sub3_12.method1290(110, 8);
				}
				if (arg0 == 4) {
					Static2.aClass1_Sub1_Sub5_Sub3_1.method1290(153, 8);
				}
				if (arg0 == 5) {
					Static2.aClass1_Sub1_Sub5_Sub3_1.method1290(181, 8);
				}
				if (arg0 == 6) {
					Static99.aClass1_Sub1_Sub5_Sub3_17.method1290(209, 9);
				}
			}
			if (arg1[0] != -1 && arg2 != 0) {
				Static20.aClass1_Sub1_Sub5_Sub3Array2[0].method1290(29, 13);
			}
			if (arg1[1] != -1 && arg2 != 1) {
				Static20.aClass1_Sub1_Sub5_Sub3Array2[1].method1290(53, 11);
			}
			if (arg1[2] != -1 && arg2 != 2) {
				Static20.aClass1_Sub1_Sub5_Sub3Array2[2].method1290(82, 11);
			}
			if (arg1[3] != -1 && arg2 != 3) {
				Static20.aClass1_Sub1_Sub5_Sub3Array2[3].method1290(115, 12);
			}
			if (arg1[4] != -1 && arg2 != 4) {
				Static20.aClass1_Sub1_Sub5_Sub3Array2[4].method1290(153, 13);
			}
			if (arg1[5] != -1 && arg2 != 5) {
				Static20.aClass1_Sub1_Sub5_Sub3Array2[5].method1290(180, 11);
			}
			if (arg1[6] != -1 && arg2 != 6) {
				Static20.aClass1_Sub1_Sub5_Sub3Array2[6].method1290(208, 13);
			}
		}
		Static20.aClass37_10.method1459();
		Static61.aClass1_Sub1_Sub5_Sub3_11.method1290(0, 0);
		if (arg3) {
			if (arg1[arg0] != -1) {
				if (arg0 == 7) {
					Static44.aClass1_Sub1_Sub5_Sub3_7.method1290(42, 0);
				}
				if (arg0 == 8) {
					Static46.aClass1_Sub1_Sub5_Sub3_8.method1290(74, 0);
				}
				if (arg0 == 9) {
					Static46.aClass1_Sub1_Sub5_Sub3_8.method1290(102, 0);
				}
				if (arg0 == 10) {
					Static7.aClass1_Sub1_Sub5_Sub3_2.method1290(130, 1);
				}
				if (arg0 == 11) {
					Static31.aClass1_Sub1_Sub5_Sub3_5.method1290(173, 0);
				}
				if (arg0 == 12) {
					Static31.aClass1_Sub1_Sub5_Sub3_5.method1290(201, 0);
				}
				if (arg0 == 13) {
					Static49.aClass1_Sub1_Sub5_Sub3_10.method1290(229, 0);
				}
			}
			if (arg1[8] != -1 && arg2 != 8) {
				Static20.aClass1_Sub1_Sub5_Sub3Array2[7].method1290(74, 2);
			}
			if (arg1[9] != -1 && arg2 != 9) {
				Static20.aClass1_Sub1_Sub5_Sub3Array2[8].method1290(102, 3);
			}
			if (arg1[10] != -1 && arg2 != 10) {
				Static20.aClass1_Sub1_Sub5_Sub3Array2[9].method1290(137, 4);
			}
			if (arg1[11] != -1 && arg2 != 11) {
				Static20.aClass1_Sub1_Sub5_Sub3Array2[10].method1290(174, 2);
			}
			if (arg1[12] != -1 && arg2 != 12) {
				Static20.aClass1_Sub1_Sub5_Sub3Array2[11].method1290(201, 2);
			}
			if (arg1[13] != -1 && arg2 != 13) {
				Static20.aClass1_Sub1_Sub5_Sub3Array2[12].method1290(226, 2);
			}
		}
		try {
			@Pc(337) Graphics local337 = Static93.aCanvas1.getGraphics();
			Static57.aClass37_18.method1457(516, 160, local337);
			Static20.aClass37_10.method1457(496, 466, local337);
		} catch (@Pc(355) Exception local355) {
			Static93.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
	public static void method393() {
		aClass41_13 = null;
		aLongArray2 = null;
		aClass64_375 = null;
		aClass64_372 = null;
		aClass64_374 = null;
		aClass41_12 = null;
		anIntArray78 = null;
		aClass41_11 = null;
		aClass64_373 = null;
		aClass64_376 = null;
		aClass1_Sub1_Sub5_Sub3_3 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!rd;)Z")
	public static boolean method394(@OriginalArg(1) Class64 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static106.anInt2498; local16++) {
			if (arg0.method1501(Static3.aClass64Array1[local16])) {
				return true;
			}
		}
		return arg0.method1501(Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass64_1543);
	}

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
	public static void method395() {
		Static66.aClass19_54.method416();
		Static26.aClass19_27.method416();
		Static104.aClass19_94.method416();
		Static87.aClass19_72.method416();
	}

	@OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
	public static void method396() {
		@Pc(10) int local10 = Static108.anInt2557 + Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2375;
		if (Static82.aBooleanArray9[96]) {
			Static95.anInt2181 += (-Static95.anInt2181 - 24) / 2;
		} else if (Static82.aBooleanArray9[97]) {
			Static95.anInt2181 += (24 - Static95.anInt2181) / 2;
		} else {
			Static95.anInt2181 /= 2;
		}
		if (Static82.aBooleanArray9[98]) {
			Static53.anInt1221 += (12 - Static53.anInt1221) / 2;
		} else if (Static82.aBooleanArray9[99]) {
			Static53.anInt1221 += (-Static53.anInt1221 - 12) / 2;
		} else {
			Static53.anInt1221 /= 2;
		}
		Static75.anInt1770 = Static95.anInt2181 / 2 + Static75.anInt1770 & 0x7FF;
		Static72.anInt1640 += Static53.anInt1221 / 2;
		@Pc(104) int local104 = Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2412 + Static37.anInt879;
		if (Static72.anInt1640 < 128) {
			Static72.anInt1640 = 128;
		}
		if (Static101.anInt2273 - local10 < -500 || Static101.anInt2273 - local10 > 500 || Static90.anInt545 - local104 < -500 || Static90.anInt545 - local104 > 500) {
			Static90.anInt545 = local104;
			Static101.anInt2273 = local10;
		}
		if (Static72.anInt1640 > 383) {
			Static72.anInt1640 = 383;
		}
		@Pc(148) int local148 = 0;
		if (local10 != Static101.anInt2273) {
			Static101.anInt2273 += (local10 - Static101.anInt2273) / 16;
		}
		if (local104 != Static90.anInt545) {
			Static90.anInt545 += (local104 - Static90.anInt545) / 16;
		}
		@Pc(176) int local176 = Static101.anInt2273 >> 7;
		@Pc(180) int local180 = Static90.anInt545 >> 7;
		@Pc(186) int local186 = Static114.method1996(Static15.anInt463, Static101.anInt2273, Static90.anInt545);
		@Pc(208) int local208;
		if (local176 > 3 && local180 > 3 && local176 < 100 && local180 < 100) {
			for (local208 = local176 - 4; local208 <= local176 + 4; local208++) {
				for (@Pc(214) int local214 = local180 - 4; local214 <= local180 + 4; local214++) {
					@Pc(218) int local218 = Static15.anInt463;
					if (local218 < 3 && (Static18.aByteArrayArrayArray2[1][local208][local214] & 0x2) == 2) {
						local218++;
					}
					@Pc(248) int local248 = local186 - Static102.anIntArrayArrayArray5[local218][local208][local214];
					if (local248 > local148) {
						local148 = local248;
					}
				}
			}
		}
		local208 = local148 * 192;
		if (local208 > 98048) {
			local208 = 98048;
		}
		if (local208 < 32768) {
			local208 = 32768;
		}
		if (local208 > Static75.anInt1773) {
			Static75.anInt1773 += (local208 - Static75.anInt1773) / 24;
		} else if (Static75.anInt1773 > local208) {
			Static75.anInt1773 += (local208 - Static75.anInt1773) / 80;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!rd;Z)V")
	public static void method397(@OriginalArg(0) Class64 arg0) {
		if (arg0 == null || arg0.method1469() == 0) {
			Static21.anInt655 = 0;
			return;
		}
		@Pc(20) Class64[] local20 = new Class64[100];
		@Pc(22) Class64 local22 = arg0;
		@Pc(28) int local28 = 0;
		while (true) {
			@Pc(33) int local33 = local22.method1490();
			if (local33 == -1) {
				local22 = local22.method1477();
				if (local22.method1469() > 0) {
					local20[local28++] = local22.method1503();
				}
				Static21.anInt655 = 0;
				label46: for (local33 = 0; local33 < Static5.anInt129; local33++) {
					@Pc(93) Class1_Sub1_Sub6 local93 = Static106.method1739(local33);
					if (local93.anInt967 == -1 && local93.aClass64_646 != null) {
						@Pc(106) Class64 local106 = local93.aClass64_646.method1503();
						for (@Pc(108) int local108 = 0; local108 < local28; local108++) {
							if (local106.method1473(local20[local108]) == -1) {
								continue label46;
							}
						}
						Static6.aClass64Array2[Static21.anInt655] = local106;
						Static98.anIntArray323[Static21.anInt655] = local33;
						Static21.anInt655++;
						if (Static21.anInt655 >= Static6.aClass64Array2.length) {
							return;
						}
					}
				}
				return;
			}
			@Pc(44) Class64 local44 = local22.method1475(local33, 0).method1477();
			if (local44.method1469() > 0) {
				local20[local28++] = local44.method1503();
			}
			local22 = local22.method1481(local33 + 1);
		}
	}
}
