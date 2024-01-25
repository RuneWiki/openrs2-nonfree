import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	public static int anInt3737;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "Lclient!ww;")
	public static final Class384 aClass384_32 = new Class384(7, 2);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([[B[I[B[IBII[[B)I")
	public static int method3188(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg3[arg5];
		@Pc(15) int local15 = arg1[arg5] + local9;
		@Pc(19) int local19 = arg3[arg4];
		@Pc(26) int local26 = local19 + arg1[arg4];
		@Pc(28) int local28 = local9;
		if (local19 > local9) {
			local28 = local19;
		}
		@Pc(44) int local44 = local15;
		if (local26 < local15) {
			local44 = local26;
		}
		@Pc(55) int local55 = arg2[arg5] & 0xFF;
		if (local55 > (arg2[arg4] & 0xFF)) {
			local55 = arg2[arg4] & 0xFF;
		}
		@Pc(72) byte[] local72 = arg0[arg5];
		@Pc(76) byte[] local76 = arg6[arg4];
		@Pc(81) int local81 = local28 - local9;
		@Pc(86) int local86 = local28 - local19;
		for (@Pc(88) int local88 = local28; local88 < local44; local88++) {
			@Pc(100) int local100 = local72[local81++] + local76[local86++];
			if (local55 > local100) {
				local55 = local100;
			}
		}
		return -local55;
	}
}
