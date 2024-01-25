import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII[BI[BI)V")
	public static void method4833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg3 >> 2);
		@Pc(9) int local9 = -(arg3 & 0x3);
		for (@Pc(12) int local12 = -arg7; local12 < 0; local12++) {
			@Pc(21) int local21;
			@Pc(28) int local28;
			for (local21 = local4; local21 < 0; local21++) {
				local28 = arg2++;
				arg4[local28] = (byte) (arg4[local28] - arg6[arg1++]);
				@Pc(41) int local41 = arg2++;
				arg4[local41] = (byte) (arg4[local41] - arg6[arg1++]);
				@Pc(54) int local54 = arg2++;
				arg4[local54] = (byte) (arg4[local54] - arg6[arg1++]);
				@Pc(67) int local67 = arg2++;
				arg4[local67] = (byte) (arg4[local67] - arg6[arg1++]);
			}
			for (local21 = local9; local21 < 0; local21++) {
				local28 = arg2++;
				arg4[local28] = (byte) (arg4[local28] - arg6[arg1++]);
			}
			arg1 += arg0;
			arg2 += arg5;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([BZIIIII)Z")
	public static boolean method4834(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(8) int local8 = arg3 % 8;
		@Pc(12) int local12;
		if (local8 == 0) {
			local12 = 0;
		} else {
			local12 = 8 - local8;
		}
		@Pc(26) int local26 = -((arg1 + 8 - 1) / 8);
		@Pc(35) int local35 = -((arg3 + 8 - 1) / 8);
		for (@Pc(37) int local37 = local26; local37 < 0; local37++) {
			for (@Pc(44) int local44 = local35; local44 < 0; local44++) {
				if (arg0[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local12;
			if (arg0[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[BIIIIBI[B)V")
	public static void method4837(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(4) int local4 = -(arg3 >> 2);
		@Pc(9) int local9 = -(arg3 & 0x3);
		for (@Pc(16) int local16 = -arg5; local16 < 0; local16++) {
			@Pc(23) int local23;
			@Pc(27) int local27;
			for (local23 = local4; local23 < 0; local23++) {
				local27 = arg4++;
				arg1[local27] += arg7[arg0++];
				@Pc(39) int local39 = arg4++;
				arg1[local39] += arg7[arg0++];
				@Pc(51) int local51 = arg4++;
				arg1[local51] += arg7[arg0++];
				@Pc(63) int local63 = arg4++;
				arg1[local63] += arg7[arg0++];
			}
			for (local23 = local9; local23 < 0; local23++) {
				local27 = arg4++;
				arg1[local27] += arg7[arg0++];
			}
			arg4 += arg6;
			arg0 += arg2;
		}
	}
}
