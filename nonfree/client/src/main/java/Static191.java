import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[I[[BBI[I[[B[B)I")
	public static int method3077(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(9) int local9 = arg1[arg0];
		@Pc(15) int local15 = local9 + arg4[arg0];
		@Pc(19) int local19 = arg1[arg3];
		@Pc(25) int local25 = local19 + arg4[arg3];
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local25 < local15) {
			local38 = local25;
		}
		@Pc(53) int local53 = arg6[arg0] & 0xFF;
		if (local53 > (arg6[arg3] & 0xFF)) {
			local53 = arg6[arg3] & 0xFF;
		}
		@Pc(74) byte[] local74 = arg2[arg0];
		@Pc(78) byte[] local78 = arg5[arg3];
		@Pc(83) int local83 = local27 - local9;
		@Pc(88) int local88 = local27 - local19;
		for (@Pc(95) int local95 = local27; local95 < local38; local95++) {
			@Pc(108) int local108 = local74[local83++] + local78[local88++];
			if (local108 < local53) {
				local53 = local108;
			}
		}
		return -local53;
	}
}
