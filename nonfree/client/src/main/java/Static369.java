import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II[BIII[BII)V")
	public static void method3502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg1 >> 2);
		@Pc(9) int local9 = -(arg1 & 0x3);
		for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
			@Pc(22) int local22;
			@Pc(29) int local29;
			for (local22 = local4; local22 < 0; local22++) {
				local29 = arg0++;
				arg2[local29] += arg5[arg3++];
				@Pc(41) int local41 = arg0++;
				arg2[local41] += arg5[arg3++];
				@Pc(53) int local53 = arg0++;
				arg2[local53] += arg5[arg3++];
				@Pc(65) int local65 = arg0++;
				arg2[local65] += arg5[arg3++];
			}
			for (local22 = local9; local22 < 0; local22++) {
				local29 = arg0++;
				arg2[local29] += arg5[arg3++];
			}
			arg3 += arg4;
			arg0 += arg7;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIII[BII)Z")
	public static boolean method3503(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = arg2 % 8;
		@Pc(11) int local11;
		if (local3 == 0) {
			local11 = 0;
		} else {
			local11 = 8 - local3;
		}
		@Pc(23) int local23 = -((arg4 + 7) / 8);
		@Pc(32) int local32 = -((arg2 + 8 - 1) / 8);
		for (@Pc(34) int local34 = local23; local34 < 0; local34++) {
			for (@Pc(41) int local41 = local32; local41 < 0; local41++) {
				if (arg3[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local11;
			if (arg3[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg0;
		}
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III[BIIII[B)V")
	public static void method3505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(8) int local8 = -(arg0 >> 2);
		@Pc(13) int local13 = -(arg0 & 0x3);
		for (@Pc(16) int local16 = -arg1; local16 < 0; local16++) {
			@Pc(20) int local20;
			@Pc(25) int local25;
			for (local20 = local8; local20 < 0; local20++) {
				local25 = arg2++;
				arg7[local25] = (byte) (arg7[local25] - arg3[arg6++]);
				@Pc(38) int local38 = arg2++;
				arg7[local38] = (byte) (arg7[local38] - arg3[arg6++]);
				@Pc(51) int local51 = arg2++;
				arg7[local51] = (byte) (arg7[local51] - arg3[arg6++]);
				@Pc(64) int local64 = arg2++;
				arg7[local64] = (byte) (arg7[local64] - arg3[arg6++]);
			}
			for (local20 = local13; local20 < 0; local20++) {
				local25 = arg2++;
				arg7[local25] = (byte) (arg7[local25] - arg3[arg6++]);
			}
			arg6 += arg4;
			arg2 += arg5;
		}
	}
}
