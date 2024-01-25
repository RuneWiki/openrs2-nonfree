import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BII[BIIII)V")
	public static void method710(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg2 >> 2);
		@Pc(17) int local17 = -(arg2 & 0x3);
		for (@Pc(20) int local20 = -arg6; local20 < 0; local20++) {
			@Pc(25) int local25;
			@Pc(32) int local32;
			for (local25 = local4; local25 < 0; local25++) {
				local32 = arg3++;
				arg4[local32] += arg1[arg0++];
				@Pc(44) int local44 = arg3++;
				arg4[local44] += arg1[arg0++];
				@Pc(56) int local56 = arg3++;
				arg4[local56] += arg1[arg0++];
				@Pc(68) int local68 = arg3++;
				arg4[local68] += arg1[arg0++];
			}
			for (local25 = local17; local25 < 0; local25++) {
				local32 = arg3++;
				arg4[local32] += arg1[arg0++];
			}
			arg3 += arg5;
			arg0 += arg7;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BI[BIIIIII)V")
	public static void method717(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg6 >> 2);
		@Pc(9) int local9 = -(arg6 & 0x3);
		for (@Pc(16) int local16 = -arg5; local16 < 0; local16++) {
			@Pc(21) int local21;
			@Pc(25) int local25;
			for (local21 = local4; local21 < 0; local21++) {
				local25 = arg7++;
				arg0[local25] = (byte) (arg0[local25] - arg2[arg1++]);
				@Pc(38) int local38 = arg7++;
				arg0[local38] = (byte) (arg0[local38] - arg2[arg1++]);
				@Pc(51) int local51 = arg7++;
				arg0[local51] = (byte) (arg0[local51] - arg2[arg1++]);
				@Pc(64) int local64 = arg7++;
				arg0[local64] = (byte) (arg0[local64] - arg2[arg1++]);
			}
			for (local21 = local9; local21 < 0; local21++) {
				local25 = arg7++;
				arg0[local25] = (byte) (arg0[local25] - arg2[arg1++]);
			}
			arg7 += arg3;
			arg1 += arg4;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III[BIII)Z")
	public static boolean method718(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(3) int local3 = arg2 % 8;
		@Pc(10) int local10;
		if (local3 == 0) {
			local10 = 0;
		} else {
			local10 = 8 - local3;
		}
		@Pc(25) int local25 = -((arg0 + 8 - 1) / 8);
		@Pc(34) int local34 = -((arg2 + 7) / 8);
		for (@Pc(36) int local36 = local25; local36 < 0; local36++) {
			for (@Pc(43) int local43 = local34; local43 < 0; local43++) {
				if (arg1[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local10;
			if (arg1[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg4;
		}
		return false;
	}
}
