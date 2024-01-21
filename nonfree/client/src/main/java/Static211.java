import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	public static int anInt4416 = -1;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "[S")
	public static short[] aShortArray156 = new short[256];

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1520 = Static151.method2243("hint_headicons");

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "[J")
	public static final long[] aLongArray12 = new long[1000];

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIBIIII)V")
	public static void method3083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static124.method1934(arg0)) {
			Static109.method1691(Static89.aClass47ArrayArray1[arg0], arg3, arg2, -1, arg5, arg1, arg4, arg6);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIII)V")
	public static void method3084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg4; local7 <= arg1 + arg4; local7++) {
			for (local11 = arg2; local11 <= arg2 + arg3; local11++) {
				if (local11 >= 0 && local11 < 104 && local7 >= 0 && local7 < 104) {
					Static199.aByteArrayArrayArray17[arg0][local11][local7] = 127;
				}
			}
		}
		@Pc(60) int local60;
		for (local11 = arg4; local11 < arg4 + arg1; local11++) {
			for (local60 = arg2; local60 < arg3 + arg2; local60++) {
				if (local60 >= 0 && local60 < 104 && local11 >= 0 && local11 < 104) {
					Static171.anIntArrayArrayArray7[arg0][local60][local11] = arg0 > 0 ? Static171.anIntArrayArrayArray7[arg0 - 1][local60][local11] : 0;
				}
			}
		}
		if (arg2 > 0 && arg2 < 104) {
			for (local60 = arg4 + 1; local60 < arg4 + arg1; local60++) {
				if (local60 >= 0 && local60 < 104) {
					Static171.anIntArrayArrayArray7[arg0][arg2][local60] = Static171.anIntArrayArrayArray7[arg0][arg2 - 1][local60];
				}
			}
		}
		if (arg4 > 0 && arg4 < 104) {
			for (local60 = arg2 + 1; local60 < arg3 + arg2; local60++) {
				if (local60 >= 0 && local60 < 104) {
					Static171.anIntArrayArrayArray7[arg0][local60][arg4] = Static171.anIntArrayArrayArray7[arg0][local60][arg4 - 1];
				}
			}
		}
		if (arg2 < 0 || arg4 < 0 || arg2 >= 104 || arg4 >= 104) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 > 0 && Static171.anIntArrayArrayArray7[arg0][arg2 - 1][arg4] != 0) {
				Static171.anIntArrayArrayArray7[arg0][arg2][arg4] = Static171.anIntArrayArrayArray7[arg0][arg2 - 1][arg4];
				return;
			}
			if (arg4 > 0 && Static171.anIntArrayArrayArray7[arg0][arg2][arg4 - 1] != 0) {
				Static171.anIntArrayArrayArray7[arg0][arg2][arg4] = Static171.anIntArrayArrayArray7[arg0][arg2][arg4 - 1];
				return;
			}
			if (arg2 > 0 && arg4 > 0 && Static171.anIntArrayArrayArray7[arg0][arg2 - 1][arg4 - 1] != 0) {
				Static171.anIntArrayArrayArray7[arg0][arg2][arg4] = Static171.anIntArrayArrayArray7[arg0][arg2 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && Static171.anIntArrayArrayArray7[arg0][arg2 - 1][arg4] != Static171.anIntArrayArrayArray7[arg0 - 1][arg2 - 1][arg4]) {
			Static171.anIntArrayArrayArray7[arg0][arg2][arg4] = Static171.anIntArrayArrayArray7[arg0][arg2 - 1][arg4];
			return;
		}
		if (arg4 > 0 && Static171.anIntArrayArrayArray7[arg0 - 1][arg2][arg4 - 1] != Static171.anIntArrayArrayArray7[arg0][arg2][arg4 - 1]) {
			Static171.anIntArrayArrayArray7[arg0][arg2][arg4] = Static171.anIntArrayArrayArray7[arg0][arg2][arg4 - 1];
			return;
		}
		if (arg2 > 0 && arg4 > 0 && Static171.anIntArrayArrayArray7[arg0 - 1][arg2 - 1][arg4 - 1] != Static171.anIntArrayArrayArray7[arg0][arg2 - 1][arg4 - 1]) {
			Static171.anIntArrayArrayArray7[arg0][arg2][arg4] = Static171.anIntArrayArrayArray7[arg0][arg2 - 1][arg4 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!pb;B)V")
	public static void method3085(@OriginalArg(0) Class71 arg0) {
		Static13.aClass71_2 = arg0;
		Static111.anInt2434 = Static13.aClass71_2.method2117(16);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILclient!mb;)V")
	public static void method3086(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3) {
		@Pc(8) Class47 local8 = Static93.method1400(arg0, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray17 != null) {
			@Pc(18) Class2_Sub13 local18 = new Class2_Sub13();
			local18.aClass47_12 = local8;
			local18.aClass62_844 = arg3;
			local18.anInt2445 = arg1;
			local18.anObjectArray27 = local8.anObjectArray17;
			Static140.method2145(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt1893 > 0) {
			local36 = Static99.method1600(local8);
		}
		if (!local36 || !Static35.method607(arg1 - 1, Static155.method2304(local8))) {
			return;
		}
		if (arg1 == 1) {
			Static58.aClass2_Sub11_Sub1_2.method1595(147);
			Static58.aClass2_Sub11_Sub1_2.method1544(arg2);
			Static58.aClass2_Sub11_Sub1_2.method1533(arg0);
		}
		if (arg1 == 2) {
			Static58.aClass2_Sub11_Sub1_2.method1595(66);
			Static58.aClass2_Sub11_Sub1_2.method1544(arg2);
			Static58.aClass2_Sub11_Sub1_2.method1533(arg0);
		}
		if (arg1 == 3) {
			Static58.aClass2_Sub11_Sub1_2.method1595(36);
			Static58.aClass2_Sub11_Sub1_2.method1544(arg2);
			Static58.aClass2_Sub11_Sub1_2.method1533(arg0);
		}
		if (arg1 == 4) {
			Static58.aClass2_Sub11_Sub1_2.method1595(235);
			Static58.aClass2_Sub11_Sub1_2.method1544(arg2);
			Static58.aClass2_Sub11_Sub1_2.method1533(arg0);
		}
		if (arg1 == 5) {
			Static58.aClass2_Sub11_Sub1_2.method1595(1);
			Static58.aClass2_Sub11_Sub1_2.method1544(arg2);
			Static58.aClass2_Sub11_Sub1_2.method1533(arg0);
		}
		if (arg1 == 6) {
			Static58.aClass2_Sub11_Sub1_2.method1595(0);
			Static58.aClass2_Sub11_Sub1_2.method1544(arg2);
			Static58.aClass2_Sub11_Sub1_2.method1533(arg0);
		}
		if (arg1 == 7) {
			Static58.aClass2_Sub11_Sub1_2.method1595(159);
			Static58.aClass2_Sub11_Sub1_2.method1544(arg2);
			Static58.aClass2_Sub11_Sub1_2.method1533(arg0);
		}
		if (arg1 == 8) {
			Static58.aClass2_Sub11_Sub1_2.method1595(61);
			Static58.aClass2_Sub11_Sub1_2.method1544(arg2);
			Static58.aClass2_Sub11_Sub1_2.method1533(arg0);
		}
		if (arg1 == 9) {
			Static58.aClass2_Sub11_Sub1_2.method1595(133);
			Static58.aClass2_Sub11_Sub1_2.method1544(arg2);
			Static58.aClass2_Sub11_Sub1_2.method1533(arg0);
		}
		if (arg1 == 10) {
			Static58.aClass2_Sub11_Sub1_2.method1595(185);
			Static58.aClass2_Sub11_Sub1_2.method1544(arg2);
			Static58.aClass2_Sub11_Sub1_2.method1533(arg0);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Lclient!mb;")
	public static Class62 method3087(@OriginalArg(1) int arg0) {
		return Static169.method2460(new Class62[] { Static119.method1865(arg0 >> 24 & 0xFF), Static97.aClass62_778, Static119.method1865(arg0 >> 16 & 0xFF), Static97.aClass62_778, Static119.method1865(arg0 >> 8 & 0xFF), Static97.aClass62_778, Static119.method1865(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	public static void method3089(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static47.aDouble31 = 3.0D;
		} else if (arg0 == 50) {
			Static47.aDouble31 = 4.0D;
		} else if (arg0 == 75) {
			Static47.aDouble31 = 6.0D;
		} else {
			Static47.aDouble31 = 8.0D;
		}
		Static186.anInt3885 = -1;
		Static186.anInt3885 = -1;
	}
}
