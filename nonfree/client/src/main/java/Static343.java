import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!oe", name = "gb", descriptor = "Ljava/lang/String;")
	public static String aString137;

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_128 = new Class239(59, 8);

	@OriginalMember(owner = "client!oe", name = "X", descriptor = "I")
	public static int anInt6345 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[IIIII[IIIIIILclient!gea;Z)I")
	public static int method5390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class99 arg12, @OriginalArg(14) boolean arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static198.anIntArrayArray43[local7][local11] = 0;
				Static78.anIntArrayArray8[local7][local11] = 99999999;
			}
		}
		@Pc(49) boolean local49;
		if (arg4 == 1) {
			local49 = Static259.method2140(arg1, arg7, arg8, arg0, arg10, arg5, arg3, arg12, arg9, arg11);
		} else if (arg4 == 2) {
			local49 = Static154.method2638(arg9, arg8, arg11, arg1, arg0, arg10, arg12, arg5, arg3, arg7);
		} else {
			local49 = Static227.method3578(arg7, arg3, arg5, arg8, arg12, arg9, arg0, arg11, arg1, arg4, arg10);
		}
		@Pc(87) int local87 = arg3 - 64;
		@Pc(91) int local91 = arg9 - 64;
		@Pc(93) int local93 = Static184.anInt3393;
		@Pc(95) int local95 = Static274.anInt4977;
		@Pc(101) int local101;
		@Pc(103) int local103;
		@Pc(109) int local109;
		if (!local49) {
			if (!arg13) {
				return -1;
			}
			local101 = Integer.MAX_VALUE;
			local103 = Integer.MAX_VALUE;
			for (local109 = arg11 - 10; local109 <= arg11 + 10; local109++) {
				for (@Pc(116) int local116 = arg5 - 10; local116 <= arg5 + 10; local116++) {
					@Pc(123) int local123 = local109 - local87;
					@Pc(127) int local127 = local116 - local91;
					if (local123 >= 0 && local127 >= 0 && local123 < 128 && local127 < 128 && Static78.anIntArrayArray8[local123][local127] < 100) {
						@Pc(149) int local149 = 0;
						if (local109 < arg11) {
							local149 = arg11 - local109;
						} else if (local109 > arg10 + arg11 - 1) {
							local149 = local109 + 1 - arg11 - arg10;
						}
						@Pc(182) int local182 = 0;
						if (arg5 > local116) {
							local182 = arg5 - local116;
						} else if (arg1 + arg5 - 1 < local116) {
							local182 = local116 + 1 - arg5 - arg1;
						}
						@Pc(220) int local220 = local182 * local182 + local149 * local149;
						if (local220 < local101 || local101 == local220 && local103 > Static78.anIntArrayArray8[local123][local127]) {
							local93 = local109;
							local95 = local116;
							local101 = local220;
							local103 = Static78.anIntArrayArray8[local123][local127];
						}
					}
				}
			}
			if (local101 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg3 == local93 && local95 == arg9) {
			return 0;
		}
		@Pc(298) byte local298 = 0;
		Static541.anIntArray764[0] = local93;
		local101 = local298 + 1;
		Static523.anIntArray696[0] = local95;
		@Pc(324) int local324;
		local103 = local324 = Static198.anIntArrayArray43[local93 - local87][local95 - local91];
		while (local93 != arg3 || local95 != arg9) {
			if (local324 != local103) {
				local324 = local103;
				Static541.anIntArray764[local101] = local93;
				Static523.anIntArray696[local101++] = local95;
			}
			if ((local103 & 0x1) != 0) {
				local95++;
			} else if ((local103 & 0x4) != 0) {
				local95--;
			}
			if ((local103 & 0x2) != 0) {
				local93++;
			} else if ((local103 & 0x8) != 0) {
				local93--;
			}
			local103 = Static198.anIntArrayArray43[local93 - local87][local95 - local91];
		}
		local109 = 0;
		while (local101-- > 0) {
			arg6[local109] = Static541.anIntArray764[local101];
			arg2[local109++] = Static523.anIntArray696[local101];
			if (arg6.length <= local109) {
				break;
			}
		}
		return local109;
	}
}
