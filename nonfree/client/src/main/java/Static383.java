import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "[I")
	public static final int[] anIntArray352 = new int[13];

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "([BIII[[B[I[[B[I)I")
	public static int method5615(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg6[arg1];
		@Pc(15) int local15 = local9 + arg4[arg1];
		@Pc(19) int local19 = arg6[arg2];
		@Pc(25) int local25 = arg4[arg2] + local19;
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local15 > local25) {
			local38 = local25;
		}
		@Pc(53) int local53 = arg0[arg1] & 0xFF;
		if (local53 > (arg0[arg2] & 0xFF)) {
			local53 = arg0[arg2] & 0xFF;
		}
		@Pc(70) byte[] local70 = arg3[arg1];
		@Pc(74) byte[] local74 = arg5[arg2];
		@Pc(79) int local79 = local27 - local9;
		@Pc(84) int local84 = local27 - local19;
		for (@Pc(86) int local86 = local27; local86 < local38; local86++) {
			@Pc(99) int local99 = local70[local79++] + local74[local84++];
			if (local53 > local99) {
				local53 = local99;
			}
		}
		return -local53;
	}
}
