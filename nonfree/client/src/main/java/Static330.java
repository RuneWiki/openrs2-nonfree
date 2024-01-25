import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!la", name = "D", descriptor = "[C")
	public static final char[] aCharArray10 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[[BB[BI[I[[B[I)I")
	public static int method5160(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg4[arg3];
		@Pc(15) int local15 = arg6[arg3] + local9;
		@Pc(25) int local25 = arg4[arg0];
		@Pc(31) int local31 = arg6[arg0] + local25;
		@Pc(33) int local33 = local9;
		if (local9 < local25) {
			local33 = local25;
		}
		@Pc(44) int local44 = local15;
		if (local15 > local31) {
			local44 = local31;
		}
		@Pc(59) int local59 = arg2[arg3] & 0xFF;
		if ((arg2[arg0] & 0xFF) < local59) {
			local59 = arg2[arg0] & 0xFF;
		}
		@Pc(80) byte[] local80 = arg1[arg3];
		@Pc(84) byte[] local84 = arg5[arg0];
		@Pc(89) int local89 = local33 - local9;
		@Pc(94) int local94 = local33 - local25;
		for (@Pc(96) int local96 = local33; local96 < local44; local96++) {
			@Pc(110) int local110 = local84[local94++] + local80[local89++];
			if (local59 > local110) {
				local59 = local110;
			}
		}
		return -local59;
	}
}
