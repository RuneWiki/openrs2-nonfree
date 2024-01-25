import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "([I[BI[II[[BI[[B)I")
	public static int method4339(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg0[arg4];
		@Pc(15) int local15 = local9 + arg3[arg4];
		@Pc(19) int local19 = arg0[arg2];
		@Pc(25) int local25 = arg3[arg2] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local15 > local25) {
			local34 = local25;
		}
		@Pc(49) int local49 = arg1[arg4] & 0xFF;
		if (local49 > (arg1[arg2] & 0xFF)) {
			local49 = arg1[arg2] & 0xFF;
		}
		@Pc(70) byte[] local70 = arg6[arg4];
		@Pc(74) byte[] local74 = arg5[arg2];
		@Pc(79) int local79 = local27 - local9;
		@Pc(84) int local84 = local27 - local19;
		for (@Pc(86) int local86 = local27; local86 < local34; local86++) {
			@Pc(98) int local98 = local74[local84++] + local70[local79++];
			if (local49 > local98) {
				local49 = local98;
			}
		}
		return -local49;
	}
}
