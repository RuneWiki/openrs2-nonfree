import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_161 = new Class81(11, 0);

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "[I")
	public static final int[] anIntArray428 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
	public static void method5048() {
		Static143.aClass98_4 = new Class98(8);
		Static387.anInt6831 = 0;
		for (@Pc(25) Class38_Sub6 local25 = (Class38_Sub6) Static384.aClass184_7.method4212(); local25 != null; local25 = (Class38_Sub6) Static384.aClass184_7.method4215()) {
			local25.method3550();
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIII[FIF)V")
	public static void method5050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(5) int local5 = arg7 - arg2;
		@Pc(9) int local9 = arg0 - arg5;
		@Pc(17) int local17 = arg3 - arg4;
		@Pc(38) float local38 = (float) local9 * arg6[2] + arg6[1] * (float) local17 + (float) local5 * arg6[0];
		@Pc(59) float local59 = (float) local9 * arg6[5] + (float) local5 * arg6[3] + arg6[4] * (float) local17;
		@Pc(80) float local80 = arg6[8] * (float) local9 + arg6[6] * (float) local5 + (float) local17 * arg6[7];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg8 + 0.5F;
		@Pc(138) float local138;
		if (arg1 == 1) {
			local138 = local106;
			local106 = -local119;
			local119 = local138;
		} else if (arg1 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg1 == 3) {
			local138 = local106;
			local106 = local119;
			local119 = -local138;
		}
		Static159.aFloat96 = local106;
		Static233.aFloat144 = local119;
	}
}
