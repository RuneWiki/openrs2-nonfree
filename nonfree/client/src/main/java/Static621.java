import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!va", name = "c", descriptor = "I")
	public static int anInt10814 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[FIIFIIFBIIF[FI)V")
	public static void method9242(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) float[] arg11, @OriginalArg(13) int arg12) {
		@Pc(5) int local5 = arg3 - arg2;
		@Pc(9) int local9 = arg12 - arg5;
		@Pc(17) int local17 = arg0 - arg9;
		@Pc(56) float local56 = arg1[0] * (float) local17 + arg1[1] * (float) local9 + arg1[2] * (float) local5;
		@Pc(77) float local77 = (float) local5 * arg1[5] + (float) local9 * arg1[4] + arg1[3] * (float) local17;
		@Pc(98) float local98 = (float) local5 * arg1[8] + arg1[7] * (float) local9 + arg1[6] * (float) local17;
		@Pc(116) float local116;
		@Pc(110) float local110;
		if (arg8 == 0) {
			local110 = arg7 + 0.5F - local98;
			local116 = arg4 + local56 + 0.5F;
		} else if (arg8 == 1) {
			local110 = local98 + arg7 + 0.5F;
			local116 = arg4 + local56 + 0.5F;
		} else if (arg8 == 2) {
			local110 = arg10 + 0.5F - local77;
			local116 = arg4 + 0.5F - local56;
		} else if (arg8 == 3) {
			local110 = arg10 + 0.5F - local77;
			local116 = arg4 + local56 + 0.5F;
		} else if (arg8 == 4) {
			local116 = arg7 + local98 + 0.5F;
			local110 = arg10 + 0.5F - local77;
		} else {
			local110 = arg10 + 0.5F - local77;
			local116 = arg7 + 0.5F - local98;
		}
		@Pc(229) float local229;
		if (arg6 == 1) {
			local229 = local116;
			local116 = -local110;
			local110 = local229;
		} else if (arg6 == 2) {
			local116 = -local116;
			local110 = -local110;
		} else if (arg6 == 3) {
			local229 = local116;
			local116 = local110;
			local110 = -local229;
		}
		arg11[0] = local116;
		arg11[1] = local110;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!td;B)I")
	public static int method9246(@OriginalArg(0) Class2_Sub1_Sub19 arg0) {
		@Pc(25) String local25 = Static299.method4949(arg0);
		return Static648.aClass324_12.method8179(local25, Static251.aClass71Array25);
	}
}
