import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bk", name = "P", descriptor = "Lclient!ak;")
	public static Class7 aClass7_29;

	@OriginalMember(owner = "client!bk", name = "R", descriptor = "Lclient!ak;")
	public static Class7 aClass7_30;

	@OriginalMember(owner = "client!bk", name = "F", descriptor = "Lclient!hh;")
	public static Class69 aClass69_4 = new Class69();

	@OriginalMember(owner = "client!bk", name = "M", descriptor = "[Lclient!ac;")
	public static Class2[] aClass2Array1 = new Class2[4];

	@OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
	public static int anInt597 = 7759444;

	@OriginalMember(owner = "client!bk", name = "O", descriptor = "[I")
	public static int[] anIntArray62 = new int[14];

	@OriginalMember(owner = "client!bk", name = "Q", descriptor = "J")
	public static long aLong23 = 0L;

	@OriginalMember(owner = "client!bk", name = "S", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
	public static void method455() {
		if (Static188.aClass1_Sub2_Sub13_2 == null) {
			return;
		}
		if (Static91.anInt1713 < 10) {
			if (!Static241.aClass7_198.method251(Static188.aClass1_Sub2_Sub13_2.aString118)) {
				Static91.anInt1713 = Static133.aClass7_117.method255(Static188.aClass1_Sub2_Sub13_2.aString118) / 10;
				return;
			}
			Static256.method3982();
			Static91.anInt1713 = 10;
		}
		if (Static91.anInt1713 == 10) {
			Static198.anInt3851 = Static188.aClass1_Sub2_Sub13_2.anInt3479 >> 6 << 6;
			Static77.anInt1559 = (Static188.aClass1_Sub2_Sub13_2.anInt3476 >> 6 << 6) + 64 - Static198.anInt3851;
			Static219.anInt4487 = Static188.aClass1_Sub2_Sub13_2.anInt3475 >> 6 << 6;
			Static93.anInt1769 = (Static188.aClass1_Sub2_Sub13_2.anInt3486 >> 6 << 6) + 64 - Static219.anInt4487;
			@Pc(92) int[] local92 = Static188.aClass1_Sub2_Sub13_2.method2813((Static28.aClass6_Sub6_Sub2_1.anInt4562 >> 7) + Static224.anInt4695, Static159.anInt2978, Static158.anInt2961 + (Static28.aClass6_Sub6_Sub2_1.anInt4569 >> 7));
			@Pc(94) int local94 = -1;
			@Pc(96) int local96 = -1;
			if (local92 != null) {
				local96 = local92[1] - Static219.anInt4487;
				local94 = Static198.anInt3851 + Static77.anInt1559 - local92[2] - 1;
			}
			if (local96 >= 0 && Static93.anInt1769 > local96 && local94 >= 0 && Static77.anInt1559 > local94) {
				local94 += (int) (Math.random() * 10.0D) - 5;
				local96 += (int) (Math.random() * 10.0D) - 5;
				Static36.anInt4790 = local96;
				Static33.anInt717 = local94;
			} else {
				@Pc(173) int[] local173;
				if (Static61.anInt1270 == -1 || Static207.anInt4126 == -1) {
					local173 = Static188.aClass1_Sub2_Sub13_2.method2807(Static188.aClass1_Sub2_Sub13_2.anInt3483 >> 14 & 0x3FFF, Static188.aClass1_Sub2_Sub13_2.anInt3483 & 0x3FFF);
					Static36.anInt4790 = local173[1] - Static219.anInt4487;
					Static33.anInt717 = Static198.anInt3851 + Static77.anInt1559 - local173[2] - 1;
				} else {
					local173 = Static188.aClass1_Sub2_Sub13_2.method2807(Static61.anInt1270, Static207.anInt4126);
					if (local173 != null) {
						Static36.anInt4790 = local173[1] - Static219.anInt4487;
						Static33.anInt717 = Static198.anInt3851 + Static77.anInt1559 - local173[2] - 1;
					}
					Static207.anInt4126 = -1;
					Static61.anInt1270 = -1;
				}
			}
			if (Static188.aClass1_Sub2_Sub13_2.anInt3487 == 37) {
				Static243.aFloat145 = 3.0F;
				Static57.aFloat32 = 3.0F;
			} else if (Static188.aClass1_Sub2_Sub13_2.anInt3487 == 50) {
				Static243.aFloat145 = 4.0F;
				Static57.aFloat32 = 4.0F;
			} else if (Static188.aClass1_Sub2_Sub13_2.anInt3487 == 75) {
				Static243.aFloat145 = 6.0F;
				Static57.aFloat32 = 6.0F;
			} else if (Static188.aClass1_Sub2_Sub13_2.anInt3487 == 100) {
				Static243.aFloat145 = 8.0F;
				Static57.aFloat32 = 8.0F;
			} else if (Static188.aClass1_Sub2_Sub13_2.anInt3487 == 200) {
				Static243.aFloat145 = 16.0F;
				Static57.aFloat32 = 16.0F;
			} else {
				Static243.aFloat145 = 8.0F;
				Static57.aFloat32 = 8.0F;
			}
			Static125.method1921();
			Static163.anIntArray529 = new int[Static47.anInt5867 + 1];
			@Pc(303) int local303 = Static77.anInt1559 >> 6;
			@Pc(307) int local307 = Static93.anInt1769 >> 6;
			Static242.aByteArrayArrayArray22 = new byte[local307][local303][];
			Static276.aByteArrayArrayArray26 = new byte[local307][local303][];
			@Pc(321) int local321 = Static294.anInt5838 >> 2 << 10;
			Static84.anIntArrayArrayArray9 = new int[local307][local303][];
			Static175.aByteArrayArrayArray15 = new byte[local307][local303][];
			Static38.anIntArrayArrayArray6 = new int[local307][local303][];
			@Pc(337) int local337 = Static233.anInt4880 >> 1;
			Static18.anIntArrayArrayArray3 = new int[local307][local303][];
			Static46.aByteArrayArrayArray7 = new byte[local307][local303][];
			Static212.aByteArrayArrayArray25 = new byte[local307][local303][];
			Static80.method1360(local321, local337);
			Static91.anInt1713 = 20;
		} else if (Static91.anInt1713 == 20) {
			Static120.method1887(new Class1_Sub18(Static241.aClass7_198.method260("underlay", Static188.aClass1_Sub2_Sub13_2.aString118)));
			Static91.anInt1713 = 30;
			Static90.method3587(true);
			Static81.method1390();
		} else if (Static91.anInt1713 == 30) {
			Static97.method1597(new Class1_Sub18(Static241.aClass7_198.method260("overlay", Static188.aClass1_Sub2_Sub13_2.aString118)));
			Static91.anInt1713 = 40;
			Static81.method1390();
		} else if (Static91.anInt1713 == 40) {
			Static133.method2133(new Class1_Sub18(Static241.aClass7_198.method260("overlay2", Static188.aClass1_Sub2_Sub13_2.aString118)));
			Static91.anInt1713 = 50;
			Static81.method1390();
		} else if (Static91.anInt1713 == 50) {
			Static175.method2662(new Class1_Sub18(Static241.aClass7_198.method260("loc", Static188.aClass1_Sub2_Sub13_2.aString118)));
			Static91.anInt1713 = 60;
			Static90.method3587(true);
			Static81.method1390();
		} else if (Static91.anInt1713 == 60) {
			if (Static241.aClass7_198.method244(Static188.aClass1_Sub2_Sub13_2.aString118 + "_labels")) {
				if (!Static241.aClass7_198.method251(Static188.aClass1_Sub2_Sub13_2.aString118 + "_labels")) {
					return;
				}
				Static166.aClass50_2 = Static33.method615(Static188.aClass1_Sub2_Sub13_2.aString118 + "_labels", Static241.aClass7_198);
			} else {
				Static166.aClass50_2 = new Class50(0);
			}
			Static91.anInt1713 = 70;
			Static81.method1390();
		} else if (Static91.anInt1713 == 70) {
			Static49.aClass62_1 = new Class62(11, true, Static189.aCanvas1);
			Static91.anInt1713 = 73;
			Static90.method3587(true);
			Static81.method1390();
		} else if (Static91.anInt1713 == 73) {
			Static190.aClass62_8 = new Class62(12, true, Static189.aCanvas1);
			Static91.anInt1713 = 76;
			Static90.method3587(true);
			Static81.method1390();
		} else if (Static91.anInt1713 == 76) {
			Static149.aClass62_6 = new Class62(14, true, Static189.aCanvas1);
			Static91.anInt1713 = 79;
			Static90.method3587(true);
			Static81.method1390();
		} else if (Static91.anInt1713 == 79) {
			Static168.aClass62_7 = new Class62(17, true, Static189.aCanvas1);
			Static91.anInt1713 = 82;
			Static90.method3587(true);
			Static81.method1390();
		} else if (Static91.anInt1713 == 82) {
			Static103.aClass62_4 = new Class62(19, true, Static189.aCanvas1);
			Static91.anInt1713 = 85;
			Static90.method3587(true);
			Static81.method1390();
		} else if (Static91.anInt1713 == 85) {
			Static65.aClass62_3 = new Class62(22, true, Static189.aCanvas1);
			Static91.anInt1713 = 88;
			Static90.method3587(true);
			Static81.method1390();
		} else if (Static91.anInt1713 == 88) {
			Static145.aClass62_5 = new Class62(26, true, Static189.aCanvas1);
			Static91.anInt1713 = 91;
			Static90.method3587(true);
			Static81.method1390();
		} else {
			Static60.aClass62_2 = new Class62(30, true, Static189.aCanvas1);
			Static91.anInt1713 = 100;
			Static90.method3587(true);
			Static81.method1390();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)I")
	public static int method456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIILclient!j;IZJ)Z")
	public static boolean method458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class6 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static163.anIntArrayArrayArray16 == Static165.anIntArrayArrayArray13;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static44.anInt996 || local17 >= Static14.anInt369) {
					return false;
				}
				@Pc(42) Class1_Sub19 local42 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][local10][local17];
				if (local42 != null && local42.anInt2570 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class124 local58 = new Class124();
		local58.aLong114 = arg11;
		local58.anInt3412 = arg0;
		local58.anInt3413 = arg5;
		local58.anInt3404 = arg6;
		local58.anInt3417 = arg7;
		local58.aClass6_6 = arg8;
		local58.anInt3414 = arg9;
		local58.anInt3416 = arg1;
		local58.anInt3411 = arg2;
		local58.anInt3401 = arg1 + arg3 - 1;
		local58.anInt3406 = arg2 + arg4 - 1;
		@Pc(108) int local108;
		for (local17 = arg1; local17 < arg1 + arg3; local17++) {
			for (local108 = arg2; local108 < arg2 + arg4; local108++) {
				@Pc(115) int local115 = 0;
				if (local17 > arg1) {
					local115++;
				}
				if (local17 < arg1 + arg3 - 1) {
					local115 += 4;
				}
				if (local108 > arg2) {
					local115 += 8;
				}
				if (local108 < arg2 + arg4 - 1) {
					local115 += 2;
				}
				for (@Pc(141) int local141 = arg0; local141 >= 0; local141--) {
					if (Static130.aClass1_Sub19ArrayArrayArray1[local141][local17][local108] == null) {
						Static130.aClass1_Sub19ArrayArrayArray1[local141][local17][local108] = new Class1_Sub19(local141, local17, local108);
					}
				}
				@Pc(174) Class1_Sub19 local174 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][local17][local108];
				local174.aClass124Array2[local174.anInt2570] = local58;
				local174.anIntArray309[local174.anInt2570] = local115;
				local174.anInt2567 |= local115;
				local174.anInt2570++;
				if (local6 && Static46.anIntArrayArray10[local17][local108] != 0) {
					local8 = Static46.anIntArrayArray10[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (Static46.anIntArrayArray10[local17][local108] == 0) {
						Static46.anIntArrayArray10[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static189.aClass124Array3[Static289.anInt5737++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([BI)Lclient!q;")
	public static Class1_Sub2_Sub12_Sub1 method459(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) Class1_Sub2_Sub12_Sub1 local19 = new Class1_Sub2_Sub12_Sub1(arg0, Static227.anIntArray557, Static134.anIntArray306, Static49.anIntArray135, Static113.anIntArray273, Static299.aByteArrayArray15);
			Static247.method3867();
			return local19;
		}
	}
}
