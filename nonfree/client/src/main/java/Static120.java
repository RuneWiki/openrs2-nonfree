import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
	public static int anInt2134;

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
	public static int anInt2137;

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "Lclient!qn;")
	public static Class211 aClass211_31;

	@OriginalMember(owner = "client!fs", name = "r", descriptor = "Lclient!hp;")
	public static Class115 aClass115_2;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_17 = new Class137(8);

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "Lclient!ud;")
	public static final Class245 aClass245_8 = new Class245(0, 2, 2, 1);

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "Lclient!up;")
	public static final Class250 aClass250_8 = new Class250(10, 4);

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(FIII[FFIIIII)V")
	public static void method1697(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg8 - arg3;
		@Pc(13) int local13 = arg9 - arg2;
		@Pc(17) int local17 = arg7 - arg6;
		@Pc(38) float local38 = (float) local5 * arg4[2] + (float) local13 * arg4[1] + arg4[0] * (float) local17;
		@Pc(59) float local59 = (float) local5 * arg4[5] + (float) local13 * arg4[4] + arg4[3] * (float) local17;
		@Pc(80) float local80 = (float) local5 * arg4[8] + (float) local17 * arg4[6] + arg4[7] * (float) local13;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local91 *= arg0;
		}
		@Pc(105) float local105 = arg5 + local59 + 0.5F;
		@Pc(112) float local112;
		if (arg1 == 1) {
			local112 = local91;
			local91 = -local105;
			local105 = local112;
		} else if (arg1 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg1 == 3) {
			local112 = local91;
			local91 = local105;
			local105 = -local112;
		}
		Static271.aFloat51 = local105;
		Static13.aFloat6 = local91;
	}
}
