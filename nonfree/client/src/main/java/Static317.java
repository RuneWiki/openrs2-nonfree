import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
	public static int anInt9284 = 0;

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray37 = new boolean[200];

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IBILclient!sea;)Lclient!nba;")
	public static Class231 method7563(@OriginalArg(2) int arg0, @OriginalArg(3) Class308 arg1) {
		@Pc(17) byte[] local17 = arg1.method6569(arg0, 0);
		return local17 == null ? null : new Class231(local17);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III[IIIIILclient!nn;IIZ[III)I")
	public static int method7566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class240 arg8, @OriginalArg(9) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static69.anIntArrayArray6[local7][local11] = 0;
				Static581.anIntArrayArray56[local7][local11] = 99999999;
			}
		}
		@Pc(51) boolean local51;
		if (arg0 == 1) {
			local51 = Static165.method2702(arg2, arg1, arg8, arg6, arg13, arg5, arg12, arg9, arg7, arg4);
		} else if (arg0 == 2) {
			local51 = Static485.method6696(arg13, arg9, arg1, arg8, arg12, arg7, arg5, arg6, arg2, arg4);
		} else {
			local51 = Static217.method3241(arg6, arg4, arg13, arg2, arg1, arg12, arg9, arg8, arg5, arg7, arg0);
		}
		@Pc(96) int local96 = arg5 - 64;
		@Pc(100) int local100 = arg2 - 64;
		@Pc(102) int local102 = Static146.anInt2805;
		@Pc(104) int local104 = Static427.anInt7668;
		@Pc(112) int local112;
		@Pc(114) int local114;
		@Pc(121) int local121;
		if (!local51) {
			if (!arg10) {
				return -1;
			}
			local112 = Integer.MAX_VALUE;
			local114 = Integer.MAX_VALUE;
			for (local121 = arg13 - 10; local121 <= arg13 + 10; local121++) {
				for (@Pc(128) int local128 = arg9 - 10; local128 <= arg9 + 10; local128++) {
					@Pc(135) int local135 = local121 - local96;
					@Pc(140) int local140 = local128 - local100;
					if (local135 >= 0 && local140 >= 0 && local135 < 128 && local140 < 128 && Static581.anIntArrayArray56[local135][local140] < 100) {
						@Pc(169) int local169 = 0;
						if (arg13 > local121) {
							local169 = arg13 - local121;
						} else if (arg13 + arg12 - 1 < local121) {
							local169 = local121 + 1 - arg12 - arg13;
						}
						@Pc(201) int local201 = 0;
						if (local128 < arg9) {
							local201 = arg9 - local128;
						} else if (local128 > arg4 + arg9 - 1) {
							local201 = local128 + 1 - arg9 - arg4;
						}
						@Pc(244) int local244 = local169 * local169 + local201 * local201;
						if (local244 < local112 || local112 == local244 && local114 > Static581.anIntArrayArray56[local135][local140]) {
							local104 = local128;
							local112 = local244;
							local102 = local121;
							local114 = Static581.anIntArrayArray56[local135][local140];
						}
					}
				}
			}
			if (local112 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local102 == arg5 && arg2 == local104) {
			return 0;
		}
		@Pc(308) byte local308 = 0;
		Static379.anIntArray393[0] = local102;
		local112 = local308 + 1;
		Static181.anIntArray160[0] = local104;
		@Pc(330) int local330;
		local114 = local330 = Static69.anIntArrayArray6[local102 - local96][local104 - local100];
		while (arg5 != local102 || arg2 != local104) {
			if (local114 != local330) {
				Static379.anIntArray393[local112] = local102;
				local330 = local114;
				Static181.anIntArray160[local112++] = local104;
			}
			if ((local114 & 0x1) != 0) {
				local104++;
			} else if ((local114 & 0x4) != 0) {
				local104--;
			}
			if ((local114 & 0x2) != 0) {
				local102++;
			} else if ((local114 & 0x8) != 0) {
				local102--;
			}
			local114 = Static69.anIntArrayArray6[local102 - local96][local104 - local100];
		}
		local121 = 0;
		while (local112-- > 0) {
			arg11[local121] = Static379.anIntArray393[local112];
			arg3[local121++] = Static181.anIntArray160[local112];
			if (local121 >= arg11.length) {
				break;
			}
		}
		return local121;
	}
}
