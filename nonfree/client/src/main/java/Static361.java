import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[BI[BIIBI)V")
	public static void method3380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(19) int local19 = -(arg1 >> 2);
		@Pc(24) int local24 = -(arg1 & 0x3);
		for (@Pc(27) int local27 = -arg3; local27 < 0; local27++) {
			@Pc(31) int local31;
			@Pc(38) int local38;
			for (local31 = local19; local31 < 0; local31++) {
				local38 = arg0++;
				arg4[local38] += arg2[arg5++];
				@Pc(50) int local50 = arg0++;
				arg4[local50] += arg2[arg5++];
				@Pc(62) int local62 = arg0++;
				arg4[local62] += arg2[arg5++];
				@Pc(74) int local74 = arg0++;
				arg4[local74] += arg2[arg5++];
			}
			for (local31 = local24; local31 < 0; local31++) {
				local38 = arg0++;
				arg4[local38] += arg2[arg5++];
			}
			arg5 += arg6;
			arg0 += arg7;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[BZIII)Z")
	public static boolean method3383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = arg3 % 8;
		@Pc(7) int local7;
		if (local3 == 0) {
			local7 = 0;
		} else {
			local7 = 8 - local3;
		}
		@Pc(22) int local22 = -((arg4 + 7) / 8);
		@Pc(31) int local31 = -((arg3 + 8 - 1) / 8);
		for (@Pc(37) int local37 = local22; local37 < 0; local37++) {
			for (@Pc(44) int local44 = local31; local44 < 0; local44++) {
				if (arg2[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local7;
			if (arg2[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg0;
		}
		return false;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BIIIII[BI)V")
	public static void method3388(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = -(arg4 >> 2);
		@Pc(13) int local13 = -(arg4 & 0x3);
		for (@Pc(16) int local16 = -arg3; local16 < 0; local16++) {
			@Pc(23) int local23;
			@Pc(28) int local28;
			for (local23 = local8; local23 < 0; local23++) {
				local28 = arg0++;
				arg1[local28] = (byte) (arg1[local28] - arg6[arg2++]);
				@Pc(41) int local41 = arg0++;
				arg1[local41] = (byte) (arg1[local41] - arg6[arg2++]);
				@Pc(54) int local54 = arg0++;
				arg1[local54] = (byte) (arg1[local54] - arg6[arg2++]);
				@Pc(67) int local67 = arg0++;
				arg1[local67] = (byte) (arg1[local67] - arg6[arg2++]);
			}
			for (local23 = local13; local23 < 0; local23++) {
				local28 = arg0++;
				arg1[local28] = (byte) (arg1[local28] - arg6[arg2++]);
			}
			arg2 += arg7;
			arg0 += arg5;
		}
	}
}
