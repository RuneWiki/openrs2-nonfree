import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!ha;")
	public static Class95 aClass95_11;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "Lclient!hg;")
	public static Interface10 anInterface10_1;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II[F[II[FIII[IIII)V")
	public static void method6459(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(11) int local11 = arg0 + arg11 * arg7;
		@Pc(21) int local21 = arg3 * arg5 + arg6;
		@Pc(26) int local26 = arg7 - arg10;
		@Pc(31) int local31 = arg3 - arg10;
		@Pc(37) int local37;
		@Pc(44) int local44;
		if (arg2 == null) {
			for (local37 = 0; local37 < arg9; local37++) {
				local44 = arg10 + local11;
				while (local11 < local44) {
					arg1[local21++] = arg4[local11++];
				}
				local21 += local31;
				local11 += local26;
			}
		} else if (arg4 == null) {
			for (local37 = 0; local37 < arg9; local37++) {
				local44 = local11 + arg10;
				while (local44 > local11) {
					arg8[local21++] = arg2[local11++];
				}
				local11 += local26;
				local21 += local31;
			}
		} else {
			for (local37 = 0; local37 < arg9; local37++) {
				local44 = local11 + arg10;
				while (local11 < local44) {
					arg8[local21] = arg2[local11];
					arg1[local21++] = arg4[local11++];
				}
				local21 += local31;
				local11 += local26;
			}
		}
	}
}
