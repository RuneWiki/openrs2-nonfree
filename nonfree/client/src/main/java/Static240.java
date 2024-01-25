import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!ej;")
	public static Class93 aClass93_4;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!uu;")
	public static Class343 aClass343_120;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
	public static int anInt4751;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "[I")
	public static final int[] anIntArray261 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Lclient!vha;")
	public static Class353 aClass353_1 = new Class353(8);

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
	public static int anInt4752 = 0;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII[FFB[FFII)V")
	public static void method4049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg10 - arg9;
		@Pc(13) int local13 = arg0 - arg1;
		@Pc(17) int local17 = arg4 - arg3;
		@Pc(42) float local42 = (float) local5 * arg7[0] + arg7[1] * (float) local17 + arg7[2] * (float) local13;
		@Pc(63) float local63 = (float) local17 * arg7[4] + arg7[3] * (float) local5 + (float) local13 * arg7[5];
		@Pc(84) float local84 = (float) local13 * arg7[8] + (float) local5 * arg7[6] + (float) local17 * arg7[7];
		@Pc(95) float local95 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		if (arg8 != 1.0F) {
			local95 *= arg8;
		}
		@Pc(109) float local109 = arg6 + local63 + 0.5F;
		@Pc(114) float local114;
		if (arg2 == 1) {
			local114 = local95;
			local95 = -local109;
			local109 = local114;
		} else if (arg2 == 2) {
			local109 = -local109;
			local95 = -local95;
		} else if (arg2 == 3) {
			local114 = local95;
			local95 = local109;
			local109 = -local114;
		}
		arg5[0] = local95;
		arg5[1] = local109;
	}
}
