import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	public static int anInt1557;

	@OriginalMember(owner = "client!fd", name = "mb", descriptor = "Lclient!l;")
	public static Class45 aClass45_7;

	@OriginalMember(owner = "client!fd", name = "qb", descriptor = "Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4 aClass1_Sub2_Sub1_Sub4_2;

	@OriginalMember(owner = "client!fd", name = "Tb", descriptor = "I")
	public static int anInt1605;

	@OriginalMember(owner = "client!fd", name = "xc", descriptor = "Lclient!dd;")
	private static Class13 aClass13_547 = Static161.method2971("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Lclient!dd;")
	public static Class13 aClass13_539 = aClass13_547;

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "Lclient!dd;")
	public static Class13 aClass13_541 = Static161.method2971("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
	public static int anInt1575 = 0;

	@OriginalMember(owner = "client!fd", name = "xb", descriptor = "I")
	public static int anInt1593 = 0;

	@OriginalMember(owner = "client!fd", name = "Ic", descriptor = "Lclient!dd;")
	private static Class13 aClass13_550 = Static161.method2971("Login server offline)3");

	@OriginalMember(owner = "client!fd", name = "ac", descriptor = "Lclient!dd;")
	public static Class13 aClass13_545 = aClass13_550;

	@OriginalMember(owner = "client!fd", name = "bc", descriptor = "Lclient!dd;")
	public static Class13 aClass13_546 = Static161.method2971("title)3jpg");

	@OriginalMember(owner = "client!fd", name = "lc", descriptor = "I")
	public static int anInt1616 = 0;

	@OriginalMember(owner = "client!fd", name = "Fc", descriptor = "I")
	public static final int anInt1624 = 3353893;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIIIZIIIIIII)Z")
	public static boolean method1224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static46.anIntArrayArray8[local7][local11] = 0;
				Static80.anIntArrayArray18[local7][local11] = 99999999;
			}
		}
		Static46.anIntArrayArray8[arg8][arg0] = 99;
		Static80.anIntArrayArray18[arg8][arg0] = 0;
		local11 = arg8;
		@Pc(49) int local49 = arg0;
		@Pc(51) byte local51 = 0;
		@Pc(53) int local53 = 0;
		@Pc(55) boolean local55 = false;
		Static63.anIntArray197[0] = arg8;
		@Pc(62) int local62 = local51 + 1;
		Static163.anIntArray432[0] = arg0;
		@Pc(69) int[][] local69 = Static149.aClass12Array1[Static156.anInt3696].anIntArrayArray7;
		@Pc(72) int local72 = Static63.anIntArray197.length;
		@Pc(184) int local184;
		while (local62 != local53) {
			local49 = Static163.anIntArray432[local53];
			local11 = Static63.anIntArray197[local53];
			local53 = (local53 + 1) % local72;
			if (local11 == arg4 && local49 == arg5) {
				local55 = true;
				break;
			}
			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && Static149.aClass12Array1[Static156.anInt3696].method814(arg5, arg4, local49, local11, arg7, arg2 - 1)) {
					local55 = true;
					break;
				}
				if (arg2 < 10 && Static149.aClass12Array1[Static156.anInt3696].method820(local49, arg7, arg4, arg5, arg2 - 1, local11)) {
					local55 = true;
					break;
				}
			}
			if (arg10 != 0 && arg1 != 0 && Static149.aClass12Array1[Static156.anInt3696].method822(local11, local49, arg4, arg9, arg1, arg5, arg10)) {
				local55 = true;
				break;
			}
			local184 = Static80.anIntArrayArray18[local11][local49] + 1;
			if (local11 > 0 && Static46.anIntArrayArray8[local11 - 1][local49] == 0 && (local69[local11 - 1][local49] & 0x12C0108) == 0) {
				Static63.anIntArray197[local62] = local11 - 1;
				Static163.anIntArray432[local62] = local49;
				Static46.anIntArrayArray8[local11 - 1][local49] = 2;
				Static80.anIntArrayArray18[local11 - 1][local49] = local184;
				local62 = (local62 + 1) % local72;
			}
			if (local11 < 103 && Static46.anIntArrayArray8[local11 + 1][local49] == 0 && (local69[local11 + 1][local49] & 0x12C0180) == 0) {
				Static63.anIntArray197[local62] = local11 + 1;
				Static163.anIntArray432[local62] = local49;
				Static46.anIntArrayArray8[local11 + 1][local49] = 8;
				local62 = (local62 + 1) % local72;
				Static80.anIntArrayArray18[local11 + 1][local49] = local184;
			}
			if (local49 > 0 && Static46.anIntArrayArray8[local11][local49 - 1] == 0 && (local69[local11][local49 - 1] & 0x12C0102) == 0) {
				Static63.anIntArray197[local62] = local11;
				Static163.anIntArray432[local62] = local49 - 1;
				Static46.anIntArrayArray8[local11][local49 - 1] = 1;
				local62 = (local62 + 1) % local72;
				Static80.anIntArrayArray18[local11][local49 - 1] = local184;
			}
			if (local49 < 103 && Static46.anIntArrayArray8[local11][local49 + 1] == 0 && (local69[local11][local49 + 1] & 0x12C0120) == 0) {
				Static63.anIntArray197[local62] = local11;
				Static163.anIntArray432[local62] = local49 + 1;
				Static46.anIntArrayArray8[local11][local49 + 1] = 4;
				local62 = (local62 + 1) % local72;
				Static80.anIntArrayArray18[local11][local49 + 1] = local184;
			}
			if (local11 > 0 && local49 > 0 && Static46.anIntArrayArray8[local11 - 1][local49 - 1] == 0 && (local69[local11 - 1][local49 - 1] & 0x12C010E) == 0 && (local69[local11 - 1][local49] & 0x12C0108) == 0 && (local69[local11][local49 - 1] & 0x12C0102) == 0) {
				Static63.anIntArray197[local62] = local11 - 1;
				Static163.anIntArray432[local62] = local49 - 1;
				local62 = (local62 + 1) % local72;
				Static46.anIntArrayArray8[local11 - 1][local49 - 1] = 3;
				Static80.anIntArrayArray18[local11 - 1][local49 - 1] = local184;
			}
			if (local11 < 103 && local49 > 0 && Static46.anIntArrayArray8[local11 + 1][local49 - 1] == 0 && (local69[local11 + 1][local49 - 1] & 0x12C0183) == 0 && (local69[local11 + 1][local49] & 0x12C0180) == 0 && (local69[local11][local49 - 1] & 0x12C0102) == 0) {
				Static63.anIntArray197[local62] = local11 + 1;
				Static163.anIntArray432[local62] = local49 - 1;
				Static46.anIntArrayArray8[local11 + 1][local49 - 1] = 9;
				local62 = (local62 + 1) % local72;
				Static80.anIntArrayArray18[local11 + 1][local49 - 1] = local184;
			}
			if (local11 > 0 && local49 < 103 && Static46.anIntArrayArray8[local11 - 1][local49 + 1] == 0 && (local69[local11 - 1][local49 + 1] & 0x12C0138) == 0 && (local69[local11 - 1][local49] & 0x12C0108) == 0 && (local69[local11][local49 + 1] & 0x12C0120) == 0) {
				Static63.anIntArray197[local62] = local11 - 1;
				Static163.anIntArray432[local62] = local49 + 1;
				Static46.anIntArrayArray8[local11 - 1][local49 + 1] = 6;
				local62 = (local62 + 1) % local72;
				Static80.anIntArrayArray18[local11 - 1][local49 + 1] = local184;
			}
			if (local11 < 103 && local49 < 103 && Static46.anIntArrayArray8[local11 + 1][local49 + 1] == 0 && (local69[local11 + 1][local49 + 1] & 0x12C01E0) == 0 && (local69[local11 + 1][local49] & 0x12C0180) == 0 && (local69[local11][local49 + 1] & 0x12C0120) == 0) {
				Static63.anIntArray197[local62] = local11 + 1;
				Static163.anIntArray432[local62] = local49 + 1;
				Static46.anIntArrayArray8[local11 + 1][local49 + 1] = 12;
				Static80.anIntArrayArray18[local11 + 1][local49 + 1] = local184;
				local62 = (local62 + 1) % local72;
			}
		}
		Static64.anInt1926 = 0;
		@Pc(796) int local796;
		@Pc(803) int local803;
		@Pc(810) int local810;
		if (!local55) {
			if (!arg3) {
				return false;
			}
			local184 = 1000;
			local796 = 100;
			for (local803 = arg4 - 10; local803 <= arg4 + 10; local803++) {
				for (local810 = arg5 - 10; local810 <= arg5 + 10; local810++) {
					if (local803 >= 0 && local810 >= 0 && local803 < 104 && local810 < 104 && Static80.anIntArrayArray18[local803][local810] < 100) {
						@Pc(838) int local838 = 0;
						@Pc(840) int local840 = 0;
						if (local803 < arg4) {
							local838 = arg4 - local803;
						} else if (local803 > arg4 + arg10 - 1) {
							local838 = local803 + 1 - arg10 - arg4;
						}
						if (local810 < arg5) {
							local840 = arg5 - local810;
						} else if (arg5 + arg1 - 1 < local810) {
							local840 = local810 + 1 - arg1 - arg5;
						}
						@Pc(903) int local903 = local840 * local840 + local838 * local838;
						if (local903 < local184 || local184 == local903 && Static80.anIntArrayArray18[local803][local810] < local796) {
							local796 = Static80.anIntArrayArray18[local803][local810];
							local49 = local810;
							local184 = local903;
							local11 = local803;
						}
					}
				}
			}
			if (local184 == 1000) {
				return false;
			}
			if (local11 == arg8 && arg0 == local49) {
				return false;
			}
			Static64.anInt1926 = 1;
		}
		@Pc(969) byte local969 = 0;
		Static63.anIntArray197[0] = local11;
		local53 = local969 + 1;
		Static163.anIntArray432[0] = local49;
		local184 = local796 = Static46.anIntArrayArray8[local11][local49];
		while (local11 != arg8 || arg0 != local49) {
			if (local796 != local184) {
				local796 = local184;
				Static63.anIntArray197[local53] = local11;
				Static163.anIntArray432[local53++] = local49;
			}
			if ((local184 & 0x2) != 0) {
				local11++;
			} else if ((local184 & 0x8) != 0) {
				local11--;
			}
			if ((local184 & 0x1) != 0) {
				local49++;
			} else if ((local184 & 0x4) != 0) {
				local49--;
			}
			local184 = Static46.anIntArrayArray8[local11][local49];
		}
		if (local53 > 0) {
			local72 = local53--;
			if (local72 > 25) {
				local72 = 25;
			}
			@Pc(1070) int local1070 = Static63.anIntArray197[local53];
			local803 = Static163.anIntArray432[local53];
			if (arg6 == 0) {
				Static1.aClass1_Sub8_Sub1_1.method1654(216);
				Static1.aClass1_Sub8_Sub1_1.method1643(local72 + local72 + 3);
			}
			if (arg6 == 1) {
				Static1.aClass1_Sub8_Sub1_1.method1654(244);
				Static1.aClass1_Sub8_Sub1_1.method1643(local72 + local72 + 14 + 3);
			}
			if (arg6 == 2) {
				Static1.aClass1_Sub8_Sub1_1.method1654(65);
				Static1.aClass1_Sub8_Sub1_1.method1643(local72 + local72 + 3);
			}
			Static1.aClass1_Sub8_Sub1_1.method1632(Static60.anInt1864 + local803);
			Static1.aClass1_Sub8_Sub1_1.method1614(local1070 + Static153.anInt3629);
			Static70.anInt2008 = Static163.anIntArray432[0];
			anInt1616 = Static63.anIntArray197[0];
			for (local810 = 1; local810 < local72; local810++) {
				local53--;
				Static1.aClass1_Sub8_Sub1_1.method1643(Static63.anIntArray197[local53] - local1070);
				Static1.aClass1_Sub8_Sub1_1.method1643(Static163.anIntArray432[local53] - local803);
			}
			Static1.aClass1_Sub8_Sub1_1.method1633(Static176.aBooleanArray53[82] ? 1 : 0);
			return true;
		} else if (arg6 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method1226() {
		aClass13_545 = null;
		aClass13_539 = null;
		aClass13_547 = null;
		aClass13_546 = null;
		aClass45_7 = null;
		aClass13_550 = null;
		aClass13_541 = null;
		aClass1_Sub2_Sub1_Sub4_2 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)J")
	public static long method1232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		return local7 == null || local7.aClass69_1 == null ? 0L : local7.aClass69_1.aLong114;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BZ)V")
	public static void method1233(@OriginalArg(1) boolean arg0) {
		for (@Pc(14) int local14 = 0; local14 < Static74.anInt2127; local14++) {
			@Pc(22) Class1_Sub2_Sub2_Sub2_Sub1 local22 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[Static66.anIntArray202[local14]];
			@Pc(31) long local31 = (long) Static66.anIntArray202[local14] << 32 | 0x20000000L;
			if (local22 != null && local22.method1882() && arg0 == local22.aClass1_Sub2_Sub19_1.aBoolean298 && local22.aClass1_Sub2_Sub19_1.method2797()) {
				@Pc(56) int local56 = local22.anInt2606 >> 7;
				@Pc(61) int local61 = local22.anInt2596 >> 7;
				if (local61 >= 0 && local61 < 104 && local56 >= 0 && local56 < 104) {
					if (local22.anInt2583 == 1 && (local22.anInt2596 & 0x7F) == 64 && (local22.anInt2606 & 0x7F) == 64) {
						if (Static83.anIntArrayArray19[local61][local56] == Static35.anInt1195) {
							continue;
						}
						Static83.anIntArrayArray19[local61][local56] = Static35.anInt1195;
					}
					if (!local22.aClass1_Sub2_Sub19_1.aBoolean297) {
						local31 |= Long.MIN_VALUE;
					}
					local22.anInt2564 = Static66.method1449(Static156.anInt3696, local22.anInt2606 + local22.anInt2583 * 64 - 64, -64 - (-(local22.anInt2583 * 64) - local22.anInt2596));
					Static42.method1117(Static156.anInt3696, local22.anInt2596, local22.anInt2606, local22.anInt2564, local22.anInt2583 * 64 + 60 - 64, local22, local22.anInt2560, local31, local22.aBoolean191);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public static void method1235() {
		Static185.aClass68_1.method2974();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static20.aLongArray2[local6] = 0L;
		}
		for (@Pc(20) int local20 = 0; local20 < 32; local20++) {
			Static137.aLongArray7[local20] = 0L;
		}
		Static69.anInt1978 = 0;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)V")
	public static void method1237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass44_1 = null;
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public static void method1238() {
		if (Static70.anInt2004 > 0) {
			Static44.method1171();
		} else {
			Static53.method1293(40);
			Static58.aClass62_3 = Static96.aClass62_4;
			Static96.aClass62_4 = null;
		}
	}
}
