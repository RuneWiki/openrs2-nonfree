import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!gba", name = "i", descriptor = "Z")
	public static boolean aBoolean274 = false;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "([IBLclient!ld;IIIIIIII[IIZI)I")
	public static int method3020(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class184 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static315.anIntArrayArray56[local3][local7] = 0;
				Static412.anIntArrayArray71[local3][local7] = 99999999;
			}
		}
		@Pc(51) boolean local51;
		if (arg7 == 1) {
			local51 = Static60.method1446(arg2, arg9, arg13, arg5, arg11, arg1, arg6, arg4, arg8, arg3);
		} else if (arg7 == 2) {
			local51 = Static483.method7238(arg2, arg5, arg3, arg9, arg1, arg4, arg6, arg11, arg8, arg13);
		} else {
			local51 = Static128.method2693(arg6, arg3, arg7, arg5, arg2, arg13, arg8, arg4, arg9, arg1, arg11);
		}
		@Pc(91) int local91 = arg4 - 64;
		@Pc(100) int local100 = arg6 - 64;
		@Pc(102) int local102 = Static288.anInt5601;
		@Pc(104) int local104 = Static429.anInt7947;
		@Pc(110) int local110;
		@Pc(112) int local112;
		@Pc(118) int local118;
		if (!local51) {
			if (!arg12) {
				return -1;
			}
			local110 = Integer.MAX_VALUE;
			local112 = Integer.MAX_VALUE;
			for (local118 = arg11 - 10; local118 <= arg11 + 10; local118++) {
				for (@Pc(125) int local125 = arg3 - 10; local125 <= arg3 + 10; local125++) {
					@Pc(132) int local132 = local118 - local91;
					@Pc(136) int local136 = local125 - local100;
					if (local132 >= 0 && local136 >= 0 && local132 < 128 && local136 < 128 && Static412.anIntArrayArray71[local132][local136] < 100) {
						@Pc(159) int local159 = 0;
						if (local118 < arg11) {
							local159 = arg11 - local118;
						} else if (local118 > arg11 + arg2 - 1) {
							local159 = local118 + 1 - arg2 - arg11;
						}
						@Pc(186) int local186 = 0;
						if (local125 < arg3) {
							local186 = arg3 - local125;
						} else if (arg13 + arg3 - 1 < local125) {
							local186 = local125 + 1 - arg3 - arg13;
						}
						@Pc(221) int local221 = local186 * local186 + local159 * local159;
						if (local221 < local110 || local110 == local221 && Static412.anIntArrayArray71[local132][local136] < local112) {
							local102 = local118;
							local110 = local221;
							local104 = local125;
							local112 = Static412.anIntArrayArray71[local132][local136];
						}
					}
				}
			}
			if (local110 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local102 == arg4 && local104 == arg6) {
			return 0;
		}
		@Pc(280) byte local280 = 0;
		Static449.anIntArray613[0] = local102;
		local110 = local280 + 1;
		Static97.anIntArray199[0] = local104;
		@Pc(302) int local302;
		local112 = local302 = Static315.anIntArrayArray56[local102 - local91][local104 - local100];
		while (local102 != arg4 || local104 != arg6) {
			if (local112 != local302) {
				Static449.anIntArray613[local110] = local102;
				local302 = local112;
				Static97.anIntArray199[local110++] = local104;
			}
			if ((local112 & 0x2) != 0) {
				local102++;
			} else if ((local112 & 0x8) != 0) {
				local102--;
			}
			if ((local112 & 0x1) != 0) {
				local104++;
			} else if ((local112 & 0x4) != 0) {
				local104--;
			}
			local112 = Static315.anIntArrayArray56[local102 - local91][local104 - local100];
		}
		local118 = 0;
		while (local110-- > 0) {
			arg0[local118] = Static449.anIntArray613[local110];
			arg10[local118++] = Static97.anIntArray199[local110];
			if (arg0.length <= local118) {
				break;
			}
		}
		return local118;
	}
}
