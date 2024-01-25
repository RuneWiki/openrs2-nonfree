import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
	public static int anInt8090;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
	public static int anInt8093 = -1;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIII[I[IIILclient!uda;IZIII)I")
	public static int method7128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class356 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
				Static2.anIntArrayArray1[local7][local13] = 0;
				Static311.anIntArrayArray30[local7][local13] = 99999999;
			}
		}
		@Pc(63) boolean local63;
		if (arg1 == 1) {
			local63 = Static162.method3211(arg3, arg0, arg9, arg4, arg7, arg11, arg2, arg13, arg12, arg8);
		} else if (arg1 == 2) {
			local63 = Static116.method2164(arg13, arg8, arg4, arg3, arg2, arg0, arg12, arg9, arg7, arg11);
		} else {
			local63 = Static326.method5119(arg2, arg11, arg13, arg12, arg0, arg1, arg4, arg9, arg3, arg8, arg7);
		}
		@Pc(103) int local103 = arg3 - 64;
		@Pc(107) int local107 = arg2 - 64;
		@Pc(109) int local109 = Static150.anInt3124;
		@Pc(111) int local111 = Static322.anInt5560;
		@Pc(122) int local122;
		@Pc(124) int local124;
		@Pc(131) int local131;
		if (!local63) {
			if (!arg10) {
				return -1;
			}
			local122 = Integer.MAX_VALUE;
			local124 = Integer.MAX_VALUE;
			for (local131 = arg4 - 10; local131 <= arg4 + 10; local131++) {
				for (@Pc(139) int local139 = arg13 - 10; local139 <= arg13 + 10; local139++) {
					@Pc(146) int local146 = local131 - local103;
					@Pc(151) int local151 = local139 - local107;
					if (local146 >= 0 && local151 >= 0 && local146 < 128 && local151 < 128 && Static311.anIntArrayArray30[local146][local151] < 100) {
						@Pc(183) int local183 = 0;
						if (local131 < arg4) {
							local183 = arg4 - local131;
						} else if (arg0 + arg4 - 1 < local131) {
							local183 = local131 + 1 - arg0 - arg4;
						}
						@Pc(217) int local217 = 0;
						if (arg13 > local139) {
							local217 = arg13 - local139;
						} else if (arg13 + arg12 - 1 < local139) {
							local217 = local139 + 1 - arg13 - arg12;
						}
						@Pc(258) int local258 = local183 * local183 + local217 * local217;
						if (local258 < local122 || local122 == local258 && local124 > Static311.anIntArrayArray30[local146][local151]) {
							local111 = local139;
							local122 = local258;
							local124 = Static311.anIntArrayArray30[local146][local151];
							local109 = local131;
						}
					}
				}
			}
			if (~local122 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg3 == local109 && local111 == arg2) {
			return 0;
		}
		@Pc(350) byte local350 = 0;
		Static173.anIntArray191[0] = local109;
		local122 = local350 + 1;
		Static313.anIntArray315[0] = local111;
		@Pc(372) int local372;
		local124 = local372 = Static2.anIntArrayArray1[local109 - local103][local111 - local107];
		while (arg3 != local109 || local111 != arg2) {
			if (local124 != local372) {
				local372 = local124;
				Static173.anIntArray191[local122] = local109;
				Static313.anIntArray315[local122++] = local111;
			}
			if ((local124 & 0x1) != 0) {
				local111++;
			} else if ((local124 & 0x4) != 0) {
				local111--;
			}
			if ((local124 & 0x2) != 0) {
				local109++;
			} else if ((local124 & 0x8) != 0) {
				local109--;
			}
			local124 = Static2.anIntArrayArray1[local109 - local103][local111 - local107];
		}
		local131 = 0;
		while (local122-- > 0) {
			arg5[local131] = Static173.anIntArray191[local122];
			arg6[local131++] = Static313.anIntArray315[local122];
			if (arg5.length <= local131) {
				break;
			}
		}
		return local131;
	}
}
