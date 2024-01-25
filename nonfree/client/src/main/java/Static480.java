import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!rea", name = "D", descriptor = "[I")
	public static int[] anIntArray460;

	@OriginalMember(owner = "client!rea", name = "H", descriptor = "I")
	public static int anInt8171 = 1;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "([II[FI[FIIIII[III)V")
	public static void method7088(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(15) int local15 = arg11 + arg10 * arg1;
		@Pc(21) int local21 = arg6 + arg8 * arg5;
		@Pc(26) int local26 = arg10 - arg7;
		@Pc(31) int local31 = arg8 - arg7;
		@Pc(37) int local37;
		@Pc(44) int local44;
		if (arg0 == null) {
			for (local37 = 0; local37 < arg3; local37++) {
				local44 = arg7 + local15;
				while (local15 < local44) {
					arg2[local21++] = arg4[local15++];
				}
				local21 += local31;
				local15 += local26;
			}
		} else if (arg4 == null) {
			for (local37 = 0; local37 < arg3; local37++) {
				local44 = arg7 + local15;
				while (local44 > local15) {
					arg9[local21++] = arg0[local15++];
				}
				local21 += local31;
				local15 += local26;
			}
		} else {
			for (local37 = 0; local37 < arg3; local37++) {
				local44 = local15 + arg7;
				while (local44 > local15) {
					arg9[local21] = arg0[local15];
					arg2[local21++] = arg4[local15++];
				}
				local15 += local26;
				local21 += local31;
			}
		}
	}
}
