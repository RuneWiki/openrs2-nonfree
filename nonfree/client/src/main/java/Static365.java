import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III[BIIZ)Z")
	public static boolean method5049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = arg2 % 8;
		@Pc(8) int local8;
		if (local3 == 0) {
			local8 = 0;
		} else {
			local8 = 8 - local3;
		}
		@Pc(23) int local23 = -((arg4 + 8 - 1) / 8);
		@Pc(32) int local32 = -((arg2 + 8 - 1) / 8);
		for (@Pc(46) int local46 = local23; local46 < 0; local46++) {
			for (@Pc(50) int local50 = local32; local50 < 0; local50++) {
				if (arg3[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local8;
			if (arg3[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "([BII[BIIIII)V")
	public static void method5052(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg1 >> 2);
		@Pc(9) int local9 = -(arg1 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(17) int local17;
			@Pc(24) int local24;
			for (local17 = local4; local17 < 0; local17++) {
				local24 = arg7++;
				arg3[local24] += arg0[arg6++];
				@Pc(36) int local36 = arg7++;
				arg3[local36] += arg0[arg6++];
				@Pc(48) int local48 = arg7++;
				arg3[local48] += arg0[arg6++];
				@Pc(60) int local60 = arg7++;
				arg3[local60] += arg0[arg6++];
			}
			for (local17 = local9; local17 < 0; local17++) {
				local24 = arg7++;
				arg3[local24] += arg0[arg6++];
			}
			arg7 += arg2;
			arg6 += arg4;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II[BI[BIIII)V")
	public static void method5056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg1 >> 2);
		@Pc(9) int local9 = -(arg1 & 0x3);
		for (@Pc(12) int local12 = -arg3; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(21) int local21;
			for (local16 = local4; local16 < 0; local16++) {
				local21 = arg6++;
				arg2[local21] = (byte) (arg2[local21] - arg4[arg7++]);
				@Pc(34) int local34 = arg6++;
				arg2[local34] = (byte) (arg2[local34] - arg4[arg7++]);
				@Pc(47) int local47 = arg6++;
				arg2[local47] = (byte) (arg2[local47] - arg4[arg7++]);
				@Pc(60) int local60 = arg6++;
				arg2[local60] = (byte) (arg2[local60] - arg4[arg7++]);
			}
			for (local16 = local9; local16 < 0; local16++) {
				local21 = arg6++;
				arg2[local21] = (byte) (arg2[local21] - arg4[arg7++]);
			}
			arg6 += arg0;
			arg7 += arg5;
		}
	}
}
