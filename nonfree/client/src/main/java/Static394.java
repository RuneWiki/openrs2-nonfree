import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "([BIIIIII[BI)V")
	public static void method835(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = -(arg4 >> 2);
		@Pc(13) int local13 = -(arg4 & 0x3);
		for (@Pc(16) int local16 = -arg3; local16 < 0; local16++) {
			@Pc(21) int local21;
			@Pc(25) int local25;
			for (local21 = local8; local21 < 0; local21++) {
				local25 = arg1++;
				arg6[local25] = (byte) (arg6[local25] - arg0[arg5++]);
				@Pc(38) int local38 = arg1++;
				arg6[local38] = (byte) (arg6[local38] - arg0[arg5++]);
				@Pc(51) int local51 = arg1++;
				arg6[local51] = (byte) (arg6[local51] - arg0[arg5++]);
				@Pc(64) int local64 = arg1++;
				arg6[local64] = (byte) (arg6[local64] - arg0[arg5++]);
			}
			for (local21 = local13; local21 < 0; local21++) {
				local25 = arg1++;
				arg6[local25] = (byte) (arg6[local25] - arg0[arg5++]);
			}
			arg5 += arg7;
			arg1 += arg2;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[BIIIII)Z")
	public static boolean method840(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = arg3 % 8;
		@Pc(11) int local11;
		if (local3 == 0) {
			local11 = 0;
		} else {
			local11 = 8 - local3;
		}
		@Pc(24) int local24 = -((arg2 + 7) / 8);
		@Pc(33) int local33 = -((arg3 + 8 - 1) / 8);
		for (@Pc(35) int local35 = local24; local35 < 0; local35++) {
			for (@Pc(53) int local53 = local33; local53 < 0; local53++) {
				if (arg1[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local11;
			if (arg1[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIII[BII[B)V")
	public static void method842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(4) int local4 = -(arg0 >> 2);
		@Pc(9) int local9 = -(arg0 & 0x3);
		for (@Pc(12) int local12 = -arg4; local12 < 0; local12++) {
			@Pc(19) int local19;
			@Pc(23) int local23;
			for (local19 = local4; local19 < 0; local19++) {
				local23 = arg2++;
				arg5[local23] += arg7[arg6++];
				@Pc(35) int local35 = arg2++;
				arg5[local35] += arg7[arg6++];
				@Pc(47) int local47 = arg2++;
				arg5[local47] += arg7[arg6++];
				@Pc(59) int local59 = arg2++;
				arg5[local59] += arg7[arg6++];
			}
			for (local19 = local9; local19 < 0; local19++) {
				local23 = arg2++;
				arg5[local23] += arg7[arg6++];
			}
			arg2 += arg1;
			arg6 += arg3;
		}
	}
}
