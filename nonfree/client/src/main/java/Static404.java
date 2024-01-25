import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIIIIII[BI)V")
	public static void method5698(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg1; local12 < 0; local12++) {
			@Pc(19) int local19;
			@Pc(26) int local26;
			for (local19 = local4; local19 < 0; local19++) {
				local26 = arg3++;
				arg6[local26] += arg0[arg7++];
				@Pc(38) int local38 = arg3++;
				arg6[local38] += arg0[arg7++];
				@Pc(50) int local50 = arg3++;
				arg6[local50] += arg0[arg7++];
				@Pc(62) int local62 = arg3++;
				arg6[local62] += arg0[arg7++];
			}
			for (local19 = local9; local19 < 0; local19++) {
				local26 = arg3++;
				arg6[local26] += arg0[arg7++];
			}
			arg3 += arg2;
			arg7 += arg5;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIII[BIIBI)V")
	public static void method5701(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = -(arg5 >> 2);
		@Pc(13) int local13 = -(arg5 & 0x3);
		for (@Pc(16) int local16 = -arg6; local16 < 0; local16++) {
			@Pc(20) int local20;
			@Pc(24) int local24;
			for (local20 = local8; local20 < 0; local20++) {
				local24 = arg3++;
				arg4[local24] = (byte) (arg4[local24] - arg0[arg2++]);
				@Pc(37) int local37 = arg3++;
				arg4[local37] = (byte) (arg4[local37] - arg0[arg2++]);
				@Pc(50) int local50 = arg3++;
				arg4[local50] = (byte) (arg4[local50] - arg0[arg2++]);
				@Pc(63) int local63 = arg3++;
				arg4[local63] = (byte) (arg4[local63] - arg0[arg2++]);
			}
			for (local20 = local13; local20 < 0; local20++) {
				local24 = arg3++;
				arg4[local24] = (byte) (arg4[local24] - arg0[arg2++]);
			}
			arg3 += arg7;
			arg2 += arg1;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII[BI)Z")
	public static boolean method5702(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(3) int local3 = arg1 % 8;
		@Pc(10) int local10;
		if (local3 == 0) {
			local10 = 0;
		} else {
			local10 = 8 - local3;
		}
		@Pc(22) int local22 = -((arg2 + 8 - 1) / 8);
		@Pc(31) int local31 = -((arg1 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local22; local48 < 0; local48++) {
			for (@Pc(53) int local53 = local31; local53 < 0; local53++) {
				if (arg3[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local10;
			if (arg3[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg4;
		}
		return false;
	}
}
