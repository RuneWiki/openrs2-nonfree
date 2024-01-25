import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_55 = new Class211(17, 15);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III[IILclient!tf;I[IIBIIIZI)I")
	public static int method1835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class222 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static364.anIntArrayArray61[local7][local11] = 0;
				Static324.anIntArrayArray32[local7][local11] = 99999999;
			}
		}
		@Pc(57) boolean local57;
		if (arg1 == 1) {
			local57 = Static272.method4180(arg9, arg5, arg10, arg4, arg0, arg6, arg8, arg2, arg11, arg13);
		} else if (arg1 == 2) {
			local57 = Static188.method2681(arg2, arg6, arg11, arg5, arg0, arg4, arg10, arg8, arg9, arg13);
		} else {
			local57 = Static265.method4068(arg0, arg8, arg5, arg13, arg1, arg6, arg9, arg11, arg2, arg10, arg4);
		}
		@Pc(95) int local95 = arg2 - 64;
		@Pc(99) int local99 = arg10 - 64;
		@Pc(101) int local101 = Static143.anInt2675;
		@Pc(103) int local103 = Static92.anInt1673;
		@Pc(109) int local109;
		@Pc(111) int local111;
		@Pc(117) int local117;
		if (!local57) {
			if (!arg12) {
				return -1;
			}
			local109 = Integer.MAX_VALUE;
			local111 = Integer.MAX_VALUE;
			for (local117 = arg8 - 10; local117 <= arg8 + 10; local117++) {
				for (@Pc(124) int local124 = arg6 - 10; local124 <= arg6 + 10; local124++) {
					@Pc(131) int local131 = local117 - local95;
					@Pc(136) int local136 = local124 - local99;
					if (local131 >= 0 && local136 >= 0 && local131 < 128 && local136 < 128 && Static324.anIntArrayArray32[local131][local136] < 100) {
						@Pc(157) int local157 = 0;
						if (local117 < arg8) {
							local157 = arg8 - local117;
						} else if (arg13 + arg8 - 1 < local117) {
							local157 = local117 + 1 - arg8 - arg13;
						}
						@Pc(185) int local185 = 0;
						if (arg6 > local124) {
							local185 = arg6 - local124;
						} else if (local124 > arg4 + arg6 - 1) {
							local185 = local124 + 1 - arg4 - arg6;
						}
						@Pc(222) int local222 = local185 * local185 + local157 * local157;
						if (local222 < local109 || local222 == local109 && Static324.anIntArrayArray32[local131][local136] < local111) {
							local111 = Static324.anIntArrayArray32[local131][local136];
							local109 = local222;
							local103 = local124;
							local101 = local117;
						}
					}
				}
			}
			if (~local109 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local101 == arg2 && arg10 == local103) {
			return 0;
		}
		@Pc(294) byte local294 = 0;
		Static296.anIntArray604[0] = local101;
		local109 = local294 + 1;
		Static225.anIntArray493[0] = local103;
		@Pc(316) int local316;
		local111 = local316 = Static364.anIntArrayArray61[local101 - local95][local103 - local99];
		while (arg2 != local101 || arg10 != local103) {
			if (local111 != local316) {
				local316 = local111;
				Static296.anIntArray604[local109] = local101;
				Static225.anIntArray493[local109++] = local103;
			}
			if ((local111 & 0x2) != 0) {
				local101++;
			} else if ((local111 & 0x8) != 0) {
				local101--;
			}
			if ((local111 & 0x1) != 0) {
				local103++;
			} else if ((local111 & 0x4) != 0) {
				local103--;
			}
			local111 = Static364.anIntArrayArray61[local101 - local95][local103 - local99];
		}
		local117 = 0;
		while (local109-- > 0) {
			arg7[local117] = Static296.anIntArray604[local109];
			arg3[local117++] = Static225.anIntArray493[local109];
			if (arg7.length <= local117) {
				break;
			}
		}
		return local117;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)I")
	public static int method1841(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static91.method1356(arg0);
	}
}
