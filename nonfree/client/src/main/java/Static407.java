import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIII[BI)Z")
	public static boolean method4706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(3) int local3 = arg1 % 8;
		@Pc(12) int local12;
		if (local3 == 0) {
			local12 = 0;
		} else {
			local12 = 8 - local3;
		}
		@Pc(24) int local24 = -((arg4 + 8 - 1) / 8);
		@Pc(33) int local33 = -((arg1 + 8 - 1) / 8);
		for (@Pc(35) int local35 = local24; local35 < 0; local35++) {
			for (@Pc(40) int local40 = local33; local40 < 0; local40++) {
				if (arg3[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local12;
			if (arg3[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg2;
		}
		return false;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([BIII[BIIII)V")
	public static void method4707(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg1 >> 2);
		@Pc(9) int local9 = -(arg1 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(34) int local34;
			@Pc(39) int local39;
			for (local34 = local4; local34 < 0; local34++) {
				local39 = arg5++;
				arg3[local39] += arg0[arg4++];
				@Pc(51) int local51 = arg5++;
				arg3[local51] += arg0[arg4++];
				@Pc(63) int local63 = arg5++;
				arg3[local63] += arg0[arg4++];
				@Pc(75) int local75 = arg5++;
				arg3[local75] += arg0[arg4++];
			}
			for (local34 = local9; local34 < 0; local34++) {
				local39 = arg5++;
				arg3[local39] += arg0[arg4++];
			}
			arg5 += arg7;
			arg4 += arg2;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIII[B[BI)V")
	public static void method4711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg3 >> 2);
		@Pc(9) int local9 = -(arg3 & 0x3);
		for (@Pc(16) int local16 = -arg2; local16 < 0; local16++) {
			@Pc(23) int local23;
			@Pc(30) int local30;
			for (local23 = local4; local23 < 0; local23++) {
				local30 = arg4++;
				arg6[local30] = (byte) (arg6[local30] - arg5[arg7++]);
				@Pc(43) int local43 = arg4++;
				arg6[local43] = (byte) (arg6[local43] - arg5[arg7++]);
				@Pc(56) int local56 = arg4++;
				arg6[local56] = (byte) (arg6[local56] - arg5[arg7++]);
				@Pc(69) int local69 = arg4++;
				arg6[local69] = (byte) (arg6[local69] - arg5[arg7++]);
			}
			for (local23 = local9; local23 < 0; local23++) {
				local30 = arg4++;
				arg6[local30] = (byte) (arg6[local30] - arg5[arg7++]);
			}
			arg4 += arg0;
			arg7 += arg1;
		}
	}
}
