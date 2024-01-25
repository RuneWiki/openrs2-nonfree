import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!he", name = "A", descriptor = "I")
	public static int anInt3047;

	@OriginalMember(owner = "client!he", name = "B", descriptor = "[I")
	public static int[] anIntArray270;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "Lclient!mn;")
	public static final Class163 aClass163_14 = new Class163(8);

	@OriginalMember(owner = "client!he", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray27 = new int[128][128];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([I[[B[IIII[[B[B)I")
	public static int method2403(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(9) int local9 = arg0[arg4];
		@Pc(15) int local15 = arg2[arg4] + local9;
		@Pc(19) int local19 = arg0[arg3];
		@Pc(25) int local25 = arg2[arg3] + local19;
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local25 < local15) {
			local38 = local25;
		}
		@Pc(53) int local53 = arg6[arg4] & 0xFF;
		if (local53 > (arg6[arg3] & 0xFF)) {
			local53 = arg6[arg3] & 0xFF;
		}
		@Pc(74) byte[] local74 = arg5[arg4];
		@Pc(78) byte[] local78 = arg1[arg3];
		@Pc(83) int local83 = local27 - local9;
		@Pc(88) int local88 = local27 - local19;
		for (@Pc(90) int local90 = local27; local90 < local38; local90++) {
			@Pc(102) int local102 = local78[local88++] + local74[local83++];
			if (local53 > local102) {
				local53 = local102;
			}
		}
		return -local53;
	}
}
