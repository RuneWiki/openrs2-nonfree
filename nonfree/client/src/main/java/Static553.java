import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "[Lclient!ro;")
	public static final Class292[] aClass292Array1 = new Class292[8];

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "[I")
	public static final int[] anIntArray569 = new int[1];

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "([[BB[BI[II[[B[I)I")
	public static int method7776(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg3[arg4];
		@Pc(15) int local15 = arg6[arg4] + local9;
		@Pc(19) int local19 = arg3[arg2];
		@Pc(25) int local25 = arg6[arg2] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local25 < local15) {
			local34 = local25;
		}
		@Pc(49) int local49 = arg1[arg4] & 0xFF;
		if ((arg1[arg2] & 0xFF) < local49) {
			local49 = arg1[arg2] & 0xFF;
		}
		@Pc(70) byte[] local70 = arg0[arg4];
		@Pc(74) byte[] local74 = arg5[arg2];
		@Pc(79) int local79 = local27 - local9;
		@Pc(84) int local84 = local27 - local19;
		for (@Pc(86) int local86 = local27; local86 < local34; local86++) {
			@Pc(103) int local103 = local74[local84++] + local70[local79++];
			if (local49 > local103) {
				local49 = local103;
			}
		}
		return -local49;
	}
}
