import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "Lclient!vd;")
	public static Class353 aClass353_61;

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_122 = new Class268(74, 6);

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(II[I[IIII[F[FIIII)V")
	public static void method5913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		@Pc(11) int local11 = arg0 * arg11 + arg10;
		@Pc(23) int local23 = arg6 * arg4 + arg5;
		@Pc(27) int local27 = arg0 - arg9;
		@Pc(31) int local31 = arg4 - arg9;
		@Pc(35) int local35;
		@Pc(41) int local41;
		if (arg2 == null) {
			for (local35 = 0; local35 < arg1; local35++) {
				local41 = arg9 + local11;
				while (local11 < local41) {
					arg8[local23++] = arg7[local11++];
				}
				local11 += local27;
				local23 += local31;
			}
		} else if (arg7 == null) {
			for (local35 = 0; local35 < arg1; local35++) {
				local41 = local11 + arg9;
				while (local41 > local11) {
					arg3[local23++] = arg2[local11++];
				}
				local11 += local27;
				local23 += local31;
			}
		} else {
			for (local35 = 0; local35 < arg1; local35++) {
				local41 = local11 + arg9;
				while (local11 < local41) {
					arg3[local23] = arg2[local11];
					arg8[local23++] = arg7[local11++];
				}
				local23 += local31;
				local11 += local27;
			}
		}
	}
}
