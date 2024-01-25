import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII[BBI)Z")
	public static boolean method3110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(3) int local3 = arg1 % 8;
		@Pc(13) int local13;
		if (local3 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local3;
		}
		@Pc(25) int local25 = -((arg4 + 8 - 1) / 8);
		@Pc(34) int local34 = -((arg1 + 8 - 1) / 8);
		for (@Pc(36) int local36 = local25; local36 < 0; local36++) {
			for (@Pc(58) int local58 = local34; local58 < 0; local58++) {
				if (arg3[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local13;
			if (arg3[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg0;
		}
		return false;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([BIIIBII[BI)V")
	public static void method3112(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg7 >> 2);
		@Pc(13) int local13 = -(arg7 & 0x3);
		for (@Pc(16) int local16 = -arg1; local16 < 0; local16++) {
			@Pc(21) int local21;
			@Pc(28) int local28;
			for (local21 = local4; local21 < 0; local21++) {
				local28 = arg4++;
				arg6[local28] += arg0[arg2++];
				@Pc(40) int local40 = arg4++;
				arg6[local40] += arg0[arg2++];
				@Pc(52) int local52 = arg4++;
				arg6[local52] += arg0[arg2++];
				@Pc(64) int local64 = arg4++;
				arg6[local64] += arg0[arg2++];
			}
			for (local21 = local13; local21 < 0; local21++) {
				local28 = arg4++;
				arg6[local28] += arg0[arg2++];
			}
			arg2 += arg5;
			arg4 += arg3;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([BBIIIII[BI)V")
	public static void method3114(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg7 >> 2);
		@Pc(9) int local9 = -(arg7 & 0x3);
		for (@Pc(27) int local27 = -arg1; local27 < 0; local27++) {
			@Pc(34) int local34;
			@Pc(41) int local41;
			for (local34 = local4; local34 < 0; local34++) {
				local41 = arg4++;
				arg6[local41] = (byte) (arg6[local41] - arg0[arg5++]);
				@Pc(54) int local54 = arg4++;
				arg6[local54] = (byte) (arg6[local54] - arg0[arg5++]);
				@Pc(67) int local67 = arg4++;
				arg6[local67] = (byte) (arg6[local67] - arg0[arg5++]);
				@Pc(80) int local80 = arg4++;
				arg6[local80] = (byte) (arg6[local80] - arg0[arg5++]);
			}
			for (local34 = local9; local34 < 0; local34++) {
				local41 = arg4++;
				arg6[local41] = (byte) (arg6[local41] - arg0[arg5++]);
			}
			arg4 += arg3;
			arg5 += arg2;
		}
	}
}
