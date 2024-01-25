import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!uu", name = "ab", descriptor = "[Lclient!wi;")
	public static final Class262[] aClass262Array1 = new Class262[8];

	@OriginalMember(owner = "client!uu", name = "eb", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_137 = new Class254(31, 3);

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II[FIIFIIII)V")
	public static void method5646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg7 - arg6;
		@Pc(13) int local13 = arg8 - arg1;
		@Pc(17) int local17 = arg0 - arg3;
		@Pc(38) float local38 = (float) local13 * arg2[1] + (float) local17 * arg2[0] + arg2[2] * (float) local5;
		@Pc(59) float local59 = (float) local5 * arg2[5] + arg2[4] * (float) local13 + (float) local17 * arg2[3];
		@Pc(80) float local80 = (float) local17 * arg2[6] + arg2[7] * (float) local13 + (float) local5 * arg2[8];
		@Pc(100) float local100 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = arg5 + (float) Math.asin((double) (local59 / local100)) / 3.1415927F + 0.5F;
		@Pc(139) float local139;
		if (arg4 == 1) {
			local139 = local111;
			local111 = -local124;
			local124 = local139;
		} else if (arg4 == 2) {
			local111 = -local111;
			local124 = -local124;
		} else if (arg4 == 3) {
			local139 = local111;
			local111 = local124;
			local124 = -local139;
		}
		Static300.aFloat82 = local111;
		Static286.aFloat79 = local124;
	}
}
