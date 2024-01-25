import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "Lclient!ofa;")
	public static Class240 aClass240_4;

	@OriginalMember(owner = "client!pp", name = "L", descriptor = "I")
	public static int anInt8036;

	@OriginalMember(owner = "client!pp", name = "M", descriptor = "Lclient!ha;")
	public static Class5 aClass5_12;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_88 = new Class185(80, 3);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIII[FFIIF[F)V")
	public static void method6756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) float[] arg10) {
		@Pc(9) int local9 = arg4 - arg3;
		@Pc(13) int local13 = arg2 - arg1;
		@Pc(17) int local17 = arg0 - arg8;
		@Pc(38) float local38 = arg5[0] * (float) local17 + (float) local9 * arg5[1] + (float) local13 * arg5[2];
		@Pc(59) float local59 = arg5[5] * (float) local13 + (float) local9 * arg5[4] + arg5[3] * (float) local17;
		@Pc(80) float local80 = (float) local9 * arg5[7] + arg5[6] * (float) local17 + (float) local13 * arg5[8];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local91 *= arg6;
		}
		@Pc(105) float local105 = local59 + arg9 + 0.5F;
		@Pc(110) float local110;
		if (arg7 == 1) {
			local110 = local91;
			local91 = -local105;
			local105 = local110;
		} else if (arg7 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg7 == 3) {
			local110 = local91;
			local91 = local105;
			local105 = -local110;
		}
		arg10[0] = local91;
		arg10[1] = local105;
	}
}
