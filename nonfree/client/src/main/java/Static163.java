import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
	public static int anInt1490;

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString16;

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "[[[Lclient!ak;")
	public static Class8[][][] aClass8ArrayArrayArray2;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
	public static int anInt1495;

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "[I")
	public static final int[] anIntArray156 = new int[50];

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "Lclient!on;")
	public static Class146 aClass146_5 = null;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
	public static int anInt1496 = -1;

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "[I")
	public static final int[] anIntArray157 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)Z")
	public static boolean method1558() {
		return Static117.anInt2590 > 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIILclient!p;IIIIB)Z")
	public static boolean method1561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class151 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg7 - 64;
		Static350.anIntArrayArray185[64][64] = 99;
		@Pc(29) int local29 = arg4 - 64;
		Static130.anIntArrayArray137[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static256.anIntArray386[0] = arg7;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static104.anIntArray408[0] = arg4;
		@Pc(51) int[][] local51 = arg5.anIntArrayArray128;
		while (local43 != local46) {
			local7 = Static256.anIntArray386[local43];
			local9 = Static104.anIntArray408[local43];
			local43 = local43 + 1 & 0xFFF;
			@Pc(77) int local77 = local9 - local29;
			@Pc(82) int local82 = local7 - local18;
			@Pc(88) int local88 = local7 - arg5.anInt4563;
			@Pc(94) int local94 = local9 - arg5.anInt4572;
			if (arg9 == -4) {
				if (arg3 == local7 && local9 == arg2) {
					Static81.anInt1750 = local7;
					Static251.anInt4951 = local9;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static263.method4787(arg8, local9, 2, arg3, arg0, 2, local7, arg2)) {
					Static81.anInt1750 = local7;
					Static251.anInt4951 = local9;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg5.method4098(arg0, arg6, arg8, 2, arg3, local9, 2, local7, arg2)) {
					Static251.anInt4951 = local9;
					Static81.anInt1750 = local7;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg5.method4103(arg6, arg3, arg8, arg0, 2, local7, local9, arg2)) {
					Static251.anInt4951 = local9;
					Static81.anInt1750 = local7;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg5.method4105(local7, local9, arg2, 2, arg3, arg9, arg1)) {
					Static251.anInt4951 = local9;
					Static81.anInt1750 = local7;
					return true;
				}
			} else if (arg5.method4100(arg2, local9, arg9, arg3, 2, local7, arg1)) {
				Static81.anInt1750 = local7;
				Static251.anInt4951 = local9;
				return true;
			}
			@Pc(243) int local243 = Static130.anIntArrayArray137[local82][local77] + 1;
			if (local82 > 0 && Static350.anIntArrayArray185[local82 - 1][local77] == 0 && (local51[local88 - 1][local94] & 0x43A40000) == 0 && (local51[local88 - 1][local94 + 1] & 0x4E240000) == 0) {
				Static256.anIntArray386[local46] = local7 - 1;
				Static104.anIntArray408[local46] = local9;
				Static350.anIntArrayArray185[local82 - 1][local77] = 2;
				local46 = local46 + 1 & 0xFFF;
				Static130.anIntArrayArray137[local82 - 1][local77] = local243;
			}
			if (local82 < 126 && Static350.anIntArrayArray185[local82 + 1][local77] == 0 && (local51[local88 + 2][local94] & 0x60E40000) == 0 && (local51[local88 + 2][local94 + 1] & 0x78240000) == 0) {
				Static256.anIntArray386[local46] = local7 + 1;
				Static104.anIntArray408[local46] = local9;
				Static350.anIntArrayArray185[local82 + 1][local77] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static130.anIntArrayArray137[local82 + 1][local77] = local243;
			}
			if (local77 > 0 && Static350.anIntArrayArray185[local82][local77 - 1] == 0 && (local51[local88][local94 - 1] & 0x43A40000) == 0 && (local51[local88 + 1][local94 - 1] & 0x60E40000) == 0) {
				Static256.anIntArray386[local46] = local7;
				Static104.anIntArray408[local46] = local9 - 1;
				Static350.anIntArrayArray185[local82][local77 - 1] = 1;
				local46 = local46 + 1 & 0xFFF;
				Static130.anIntArrayArray137[local82][local77 - 1] = local243;
			}
			if (local77 < 126 && Static350.anIntArrayArray185[local82][local77 + 1] == 0 && (local51[local88][local94 + 2] & 0x4E240000) == 0 && (local51[local88 + 1][local94 + 2] & 0x78240000) == 0) {
				Static256.anIntArray386[local46] = local7;
				Static104.anIntArray408[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static350.anIntArrayArray185[local82][local77 + 1] = 4;
				Static130.anIntArrayArray137[local82][local77 + 1] = local243;
			}
			if (local82 > 0 && local77 > 0 && Static350.anIntArrayArray185[local82 - 1][local77 - 1] == 0 && (local51[local88 - 1][local94] & 0x4FA40000) == 0 && (local51[local88 - 1][local94 - 1] & 0x43A40000) == 0 && (local51[local88][local94 - 1] & 0x63E40000) == 0) {
				Static256.anIntArray386[local46] = local7 - 1;
				Static104.anIntArray408[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static350.anIntArrayArray185[local82 - 1][local77 - 1] = 3;
				Static130.anIntArrayArray137[local82 - 1][local77 - 1] = local243;
			}
			if (local82 < 126 && local77 > 0 && Static350.anIntArrayArray185[local82 + 1][local77 - 1] == 0 && (local51[local88 + 1][local94 - 1] & 0x63E40000) == 0 && (local51[local88 + 2][local94 - 1] & 0x60E40000) == 0 && (local51[local88 + 2][local94] & 0x78E40000) == 0) {
				Static256.anIntArray386[local46] = local7 + 1;
				Static104.anIntArray408[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static350.anIntArrayArray185[local82 + 1][local77 - 1] = 9;
				Static130.anIntArrayArray137[local82 + 1][local77 - 1] = local243;
			}
			if (local82 > 0 && local77 < 126 && Static350.anIntArrayArray185[local82 - 1][local77 + 1] == 0 && (local51[local88 - 1][local94 + 1] & 0x4FA40000) == 0 && (local51[local88 - 1][local94 + 2] & 0x4E240000) == 0 && (local51[local88][local94 + 2] & 0x7E240000) == 0) {
				Static256.anIntArray386[local46] = local7 - 1;
				Static104.anIntArray408[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static350.anIntArrayArray185[local82 - 1][local77 + 1] = 6;
				Static130.anIntArrayArray137[local82 - 1][local77 + 1] = local243;
			}
			if (local82 < 126 && local77 < 126 && Static350.anIntArrayArray185[local82 + 1][local77 + 1] == 0 && (local51[local88 + 1][local94 + 2] & 0x7E240000) == 0 && (local51[local88 + 2][local94 + 2] & 0x78240000) == 0 && (local51[local88 + 2][local94 + 1] & 0x78E40000) == 0) {
				Static256.anIntArray386[local46] = local7 + 1;
				Static104.anIntArray408[local46] = local9 + 1;
				Static350.anIntArrayArray185[local82 + 1][local77 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static130.anIntArrayArray137[local82 + 1][local77 + 1] = local243;
			}
		}
		Static81.anInt1750 = local7;
		Static251.anInt4951 = local9;
		return false;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)I")
	public static int method1563(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(20) int local20 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local20;
		}
		return arg1;
	}
}
