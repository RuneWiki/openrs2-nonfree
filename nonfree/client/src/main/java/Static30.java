import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
	public static int anInt6417 = 0;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([[B[I[I[[B[BIII)I")
	public static int method5578(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1[arg6];
		@Pc(15) int local15 = arg2[arg6] + local9;
		@Pc(19) int local19 = arg1[arg5];
		@Pc(25) int local25 = arg2[arg5] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local15 > local25) {
			local38 = local25;
		}
		@Pc(49) int local49 = arg4[arg6] & 0xFF;
		if ((arg4[arg5] & 0xFF) < local49) {
			local49 = arg4[arg5] & 0xFF;
		}
		@Pc(66) byte[] local66 = arg0[arg6];
		@Pc(75) byte[] local75 = arg3[arg5];
		@Pc(80) int local80 = local27 - local9;
		@Pc(85) int local85 = local27 - local19;
		for (@Pc(87) int local87 = local27; local87 < local38; local87++) {
			@Pc(99) int local99 = local75[local85++] + local66[local80++];
			if (local49 > local99) {
				local49 = local99;
			}
		}
		return -local49;
	}
}
