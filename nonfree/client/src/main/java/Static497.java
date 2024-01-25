import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!rq", name = "w", descriptor = "Lclient!ss;")
	public static Class116 aClass116_2;

	@OriginalMember(owner = "client!rq", name = "M", descriptor = "J")
	public static long aLong227;

	@OriginalMember(owner = "client!rq", name = "V", descriptor = "I")
	public static int anInt9200 = 0;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "([IIII[F[IIIIIII[F)V")
	public static void method7714(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[] arg11) {
		@Pc(17) int local17 = arg1 * arg9 + arg2;
		@Pc(23) int local23 = arg10 + arg8 * arg3;
		@Pc(28) int local28 = arg9 - arg6;
		@Pc(33) int local33 = arg8 - arg6;
		@Pc(37) int local37;
		@Pc(44) int local44;
		if (arg5 == null) {
			for (local37 = 0; local37 < arg7; local37++) {
				local44 = local17 + arg6;
				while (local44 > local17) {
					arg4[local23++] = arg11[local17++];
				}
				local17 += local28;
				local23 += local33;
			}
		} else if (arg11 == null) {
			for (local37 = 0; local37 < arg7; local37++) {
				local44 = arg6 + local17;
				while (local44 > local17) {
					arg0[local23++] = arg5[local17++];
				}
				local17 += local28;
				local23 += local33;
			}
		} else {
			for (local37 = 0; local37 < arg7; local37++) {
				local44 = local17 + arg6;
				while (local44 > local17) {
					arg0[local23] = arg5[local17];
					arg4[local23++] = arg11[local17++];
				}
				local17 += local28;
				local23 += local33;
			}
		}
	}
}
