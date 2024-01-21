import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "J")
	public static long aLong94;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "Lclient!qd;")
	public static Class63 aClass63_11 = new Class63(20);

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	public static int anInt1848 = 1;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	public static int anInt1849 = 0;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
	public static int anInt1850 = 0;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Lclient!id;")
	private static Class34 aClass34_855 = Static9.method266("Loaded input handler");

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "Lclient!id;")
	public static Class34 aClass34_856 = aClass34_855;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "Lclient!id;")
	public static Class34 aClass34_857 = Static9.method266("Fallen lassen");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public static void method1197() {
		Static37.anInt1103 = -1;
		Static76.anInt2063 = 2;
		Static21.anInt756 = -1;
		Static98.aClass35_25 = null;
		Static12.anInt540 = 0;
		Static76.aBoolean109 = false;
		Static93.anInt2429 = 1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public static void method1198() {
		aClass34_855 = null;
		aClass63_11 = null;
		aClass34_857 = null;
		aClass34_856 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIZIIIII)Z")
	public static boolean method1199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static54.anIntArrayArray8[local3][local7] = 0;
				Static72.anIntArrayArray18[local3][local7] = 99999999;
			}
		}
		Static54.anIntArrayArray8[arg3][arg0] = 99;
		Static72.anIntArrayArray18[arg3][arg0] = 0;
		@Pc(47) int local47 = arg0;
		local7 = arg3;
		@Pc(51) int local51 = 0;
		@Pc(53) byte local53 = 0;
		Static123.anIntArray358[0] = arg3;
		@Pc(60) int local60 = local53 + 1;
		Static119.anIntArray353[0] = arg0;
		@Pc(67) int[][] local67 = Static114.aClass58Array1[Static42.anInt1208].anIntArrayArray26;
		@Pc(69) boolean local69 = false;
		@Pc(72) int local72 = Static123.anIntArray358.length;
		@Pc(183) int local183;
		while (local60 != local51) {
			local47 = Static119.anIntArray353[local51];
			local7 = Static123.anIntArray358[local51];
			local51 = (local51 + 1) % local72;
			if (arg5 == local7 && local47 == arg8) {
				local69 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && Static114.aClass58Array1[Static42.anInt1208].method1592(local7, arg8, arg5, local47, arg9, arg1 - 1)) {
					local69 = true;
					break;
				}
				if (arg1 < 10 && Static114.aClass58Array1[Static42.anInt1208].method1602(arg8, arg9, local7, arg5, local47, arg1 - 1)) {
					local69 = true;
					break;
				}
			}
			if (arg10 != 0 && arg2 != 0 && Static114.aClass58Array1[Static42.anInt1208].method1606(arg2, arg5, arg10, arg8, local47, arg7, local7)) {
				local69 = true;
				break;
			}
			local183 = Static72.anIntArrayArray18[local7][local47] + 1;
			if (local7 > 0 && Static54.anIntArrayArray8[local7 - 1][local47] == 0 && (local67[local7 - 1][local47] & 0x12C0108) == 0) {
				Static123.anIntArray358[local60] = local7 - 1;
				Static119.anIntArray353[local60] = local47;
				local60 = (local60 + 1) % local72;
				Static54.anIntArrayArray8[local7 - 1][local47] = 2;
				Static72.anIntArrayArray18[local7 - 1][local47] = local183;
			}
			if (local7 < 103 && Static54.anIntArrayArray8[local7 + 1][local47] == 0 && (local67[local7 + 1][local47] & 0x12C0180) == 0) {
				Static123.anIntArray358[local60] = local7 + 1;
				Static119.anIntArray353[local60] = local47;
				local60 = (local60 + 1) % local72;
				Static54.anIntArrayArray8[local7 + 1][local47] = 8;
				Static72.anIntArrayArray18[local7 + 1][local47] = local183;
			}
			if (local47 > 0 && Static54.anIntArrayArray8[local7][local47 - 1] == 0 && (local67[local7][local47 - 1] & 0x12C0102) == 0) {
				Static123.anIntArray358[local60] = local7;
				Static119.anIntArray353[local60] = local47 - 1;
				local60 = (local60 + 1) % local72;
				Static54.anIntArrayArray8[local7][local47 - 1] = 1;
				Static72.anIntArrayArray18[local7][local47 - 1] = local183;
			}
			if (local47 < 103 && Static54.anIntArrayArray8[local7][local47 + 1] == 0 && (local67[local7][local47 + 1] & 0x12C0120) == 0) {
				Static123.anIntArray358[local60] = local7;
				Static119.anIntArray353[local60] = local47 + 1;
				Static54.anIntArrayArray8[local7][local47 + 1] = 4;
				Static72.anIntArrayArray18[local7][local47 + 1] = local183;
				local60 = (local60 + 1) % local72;
			}
			if (local7 > 0 && local47 > 0 && Static54.anIntArrayArray8[local7 - 1][local47 - 1] == 0 && (local67[local7 - 1][local47 - 1] & 0x12C010E) == 0 && (local67[local7 - 1][local47] & 0x12C0108) == 0 && (local67[local7][local47 - 1] & 0x12C0102) == 0) {
				Static123.anIntArray358[local60] = local7 - 1;
				Static119.anIntArray353[local60] = local47 - 1;
				Static54.anIntArrayArray8[local7 - 1][local47 - 1] = 3;
				Static72.anIntArrayArray18[local7 - 1][local47 - 1] = local183;
				local60 = (local60 + 1) % local72;
			}
			if (local7 < 103 && local47 > 0 && Static54.anIntArrayArray8[local7 + 1][local47 - 1] == 0 && (local67[local7 + 1][local47 - 1] & 0x12C0183) == 0 && (local67[local7 + 1][local47] & 0x12C0180) == 0 && (local67[local7][local47 - 1] & 0x12C0102) == 0) {
				Static123.anIntArray358[local60] = local7 + 1;
				Static119.anIntArray353[local60] = local47 - 1;
				Static54.anIntArrayArray8[local7 + 1][local47 - 1] = 9;
				Static72.anIntArrayArray18[local7 + 1][local47 - 1] = local183;
				local60 = (local60 + 1) % local72;
			}
			if (local7 > 0 && local47 < 103 && Static54.anIntArrayArray8[local7 - 1][local47 + 1] == 0 && (local67[local7 - 1][local47 + 1] & 0x12C0138) == 0 && (local67[local7 - 1][local47] & 0x12C0108) == 0 && (local67[local7][local47 + 1] & 0x12C0120) == 0) {
				Static123.anIntArray358[local60] = local7 - 1;
				Static119.anIntArray353[local60] = local47 + 1;
				local60 = (local60 + 1) % local72;
				Static54.anIntArrayArray8[local7 - 1][local47 + 1] = 6;
				Static72.anIntArrayArray18[local7 - 1][local47 + 1] = local183;
			}
			if (local7 < 103 && local47 < 103 && Static54.anIntArrayArray8[local7 + 1][local47 + 1] == 0 && (local67[local7 + 1][local47 + 1] & 0x12C01E0) == 0 && (local67[local7 + 1][local47] & 0x12C0180) == 0 && (local67[local7][local47 + 1] & 0x12C0120) == 0) {
				Static123.anIntArray358[local60] = local7 + 1;
				Static119.anIntArray353[local60] = local47 + 1;
				local60 = (local60 + 1) % local72;
				Static54.anIntArrayArray8[local7 + 1][local47 + 1] = 12;
				Static72.anIntArrayArray18[local7 + 1][local47 + 1] = local183;
			}
		}
		Static31.anInt925 = 0;
		@Pc(797) int local797;
		@Pc(804) int local804;
		@Pc(811) int local811;
		if (!local69) {
			if (!arg6) {
				return false;
			}
			local183 = 1000;
			local797 = 100;
			for (local804 = arg5 - 10; local804 <= arg5 + 10; local804++) {
				for (local811 = arg8 - 10; local811 <= arg8 + 10; local811++) {
					if (local804 >= 0 && local811 >= 0 && local804 < 104 && local811 < 104 && Static72.anIntArrayArray18[local804][local811] < 100) {
						@Pc(834) int local834 = 0;
						@Pc(836) int local836 = 0;
						if (arg5 > local804) {
							local836 = arg5 - local804;
						} else if (local804 > arg5 + arg10 - 1) {
							local836 = local804 + 1 - arg10 - arg5;
						}
						if (arg8 > local811) {
							local834 = arg8 - local811;
						} else if (local811 > arg2 + arg8 - 1) {
							local834 = local811 + 1 - arg8 - arg2;
						}
						@Pc(903) int local903 = local836 * local836 + local834 * local834;
						if (local903 < local183 || local183 == local903 && Static72.anIntArrayArray18[local804][local811] < local797) {
							local7 = local804;
							local47 = local811;
							local797 = Static72.anIntArrayArray18[local804][local811];
							local183 = local903;
						}
					}
				}
			}
			if (local183 == 1000) {
				return false;
			}
			if (arg3 == local7 && arg0 == local47) {
				return false;
			}
			Static31.anInt925 = 1;
		}
		@Pc(969) byte local969 = 0;
		Static123.anIntArray358[0] = local7;
		local51 = local969 + 1;
		Static119.anIntArray353[0] = local47;
		local183 = local797 = Static54.anIntArrayArray8[local7][local47];
		while (local7 != arg3 || local47 != arg0) {
			if (local183 != local797) {
				Static123.anIntArray358[local51] = local7;
				Static119.anIntArray353[local51++] = local47;
				local797 = local183;
			}
			if ((local183 & 0x2) != 0) {
				local7++;
			} else if ((local183 & 0x8) != 0) {
				local7--;
			}
			if ((local183 & 0x1) != 0) {
				local47++;
			} else if ((local183 & 0x4) != 0) {
				local47--;
			}
			local183 = Static54.anIntArrayArray8[local7][local47];
		}
		if (local51 > 0) {
			local72 = local51--;
			if (local72 > 25) {
				local72 = 25;
			}
			@Pc(1064) int local1064 = Static123.anIntArray358[local51];
			local804 = Static119.anIntArray353[local51];
			if (arg4 == 0) {
				Static21.aClass1_Sub19_Sub1_1.method2105(41);
				Static21.aClass1_Sub19_Sub1_1.method2061(local72 + local72 + 3);
			}
			if (arg4 == 1) {
				Static21.aClass1_Sub19_Sub1_1.method2105(111);
				Static21.aClass1_Sub19_Sub1_1.method2061(local72 + local72 + 3 + 14);
			}
			if (arg4 == 2) {
				Static21.aClass1_Sub19_Sub1_1.method2105(52);
				Static21.aClass1_Sub19_Sub1_1.method2061(local72 + local72 + 3);
			}
			Static21.aClass1_Sub19_Sub1_1.method2067(Static37.anInt1098 + local1064);
			Static21.aClass1_Sub19_Sub1_1.method2088(local804 + Static121.anInt2871);
			Static21.aClass1_Sub19_Sub1_1.method2061(Static56.aBooleanArray15[82] ? 1 : 0);
			Static54.anInt1521 = Static119.anIntArray353[0];
			Static44.anInt1248 = Static123.anIntArray358[0];
			for (local811 = 1; local811 < local72; local811++) {
				local51--;
				Static21.aClass1_Sub19_Sub1_1.method2061(Static123.anIntArray358[local51] - local1064);
				Static21.aClass1_Sub19_Sub1_1.method2061(Static119.anIntArray353[local51] - local804);
			}
			return true;
		} else if (arg4 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)Lclient!id;")
	public static Class34 method1200(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static85.method1456(arg0) : Static85.aClass34_1122;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public static void method1201() {
		Static88.aClass63_15.method1665();
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(IB)Lclient!id;")
	public static Class34 method1202(@OriginalArg(0) int arg0) {
		@Pc(7) Class34 local7 = new Class34();
		local7.aByteArray20 = new byte[arg0];
		local7.anInt1553 = 0;
		return local7;
	}
}
