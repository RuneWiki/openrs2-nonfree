import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([BIIIIII[BI)V")
	public static void method223(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg7 >> 2);
		@Pc(9) int local9 = -(arg7 & 0x3);
		for (@Pc(12) int local12 = -arg1; local12 < 0; local12++) {
			@Pc(19) int local19;
			@Pc(26) int local26;
			for (local19 = local4; local19 < 0; local19++) {
				local26 = arg5++;
				arg6[local26] = (byte) (arg6[local26] - arg0[arg2++]);
				@Pc(39) int local39 = arg5++;
				arg6[local39] = (byte) (arg6[local39] - arg0[arg2++]);
				@Pc(52) int local52 = arg5++;
				arg6[local52] = (byte) (arg6[local52] - arg0[arg2++]);
				@Pc(65) int local65 = arg5++;
				arg6[local65] = (byte) (arg6[local65] - arg0[arg2++]);
			}
			for (local19 = local9; local19 < 0; local19++) {
				local26 = arg5++;
				arg6[local26] = (byte) (arg6[local26] - arg0[arg2++]);
			}
			arg5 += arg3;
			arg2 += arg4;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IBII[BII)Z")
	public static boolean method225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(8) int local8 = arg4 % 8;
		@Pc(13) int local13;
		if (local8 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local8;
		}
		@Pc(28) int local28 = -((arg3 + 8 - 1) / 8);
		@Pc(37) int local37 = -((arg4 + 8 - 1) / 8);
		for (@Pc(39) int local39 = local28; local39 < 0; local39++) {
			for (@Pc(44) int local44 = local37; local44 < 0; local44++) {
				if (arg2[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local13;
			if (arg2[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I[BIIII[BII)V")
	public static void method228(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg6 >> 2);
		@Pc(9) int local9 = -(arg6 & 0x3);
		for (@Pc(16) int local16 = -arg1; local16 < 0; local16++) {
			@Pc(23) int local23;
			@Pc(27) int local27;
			for (local23 = local4; local23 < 0; local23++) {
				local27 = arg4++;
				arg0[local27] += arg5[arg7++];
				@Pc(39) int local39 = arg4++;
				arg0[local39] += arg5[arg7++];
				@Pc(51) int local51 = arg4++;
				arg0[local51] += arg5[arg7++];
				@Pc(63) int local63 = arg4++;
				arg0[local63] += arg5[arg7++];
			}
			for (local23 = local9; local23 < 0; local23++) {
				local27 = arg4++;
				arg0[local27] += arg5[arg7++];
			}
			arg7 += arg3;
			arg4 += arg2;
		}
	}
}
