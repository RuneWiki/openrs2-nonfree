import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cp", name = "L", descriptor = "[I")
	public static int[] anIntArray48;

	@OriginalMember(owner = "client!cp", name = "Y", descriptor = "[[[Lclient!fl;")
	public static Class82[][][] aClass82ArrayArrayArray1;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIFIF[FIIFIIII)V")
	public static void method852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg3 - arg0;
		@Pc(9) int local9 = arg11 - arg10;
		@Pc(13) int local13 = arg1 - arg6;
		@Pc(38) float local38 = (float) local5 * arg5[1] + arg5[0] * (float) local9 + arg5[2] * (float) local13;
		@Pc(59) float local59 = (float) local13 * arg5[5] + (float) local5 * arg5[4] + (float) local9 * arg5[3];
		@Pc(80) float local80 = arg5[6] * (float) local9 + (float) local5 * arg5[7] + (float) local13 * arg5[8];
		@Pc(104) float local104;
		@Pc(97) float local97;
		if (arg7 == 0) {
			local97 = arg8 + 0.5F - local80;
			local104 = arg2 + local38 + 0.5F;
		} else if (arg7 == 1) {
			local104 = arg2 + local38 + 0.5F;
			local97 = local80 + arg8 + 0.5F;
		} else if (arg7 == 2) {
			local97 = arg4 + 0.5F - local59;
			local104 = arg2 + 0.5F - local38;
		} else if (arg7 == 3) {
			local97 = arg4 + 0.5F - local59;
			local104 = arg2 + local38 + 0.5F;
		} else if (arg7 == 4) {
			local97 = arg4 + 0.5F - local59;
			local104 = arg8 + local80 + 0.5F;
		} else {
			local97 = arg4 + 0.5F - local59;
			local104 = arg8 + 0.5F - local80;
		}
		@Pc(212) float local212;
		if (arg9 == 1) {
			local212 = local104;
			local104 = -local97;
			local97 = local212;
		} else if (arg9 == 2) {
			local97 = -local97;
			local104 = -local104;
		} else if (arg9 == 3) {
			local212 = local104;
			local104 = local97;
			local97 = -local212;
		}
		Static352.aFloat87 = local104;
		Static71.aFloat21 = local97;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIB)V")
	public static void method854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class1_Sub3_Sub13 local14 = Static397.method4998(11, arg0);
		local14.method3459();
		local14.anInt4301 = arg1;
		local14.anInt4297 = arg2;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BII)Z")
	public static boolean method855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static6.method102(arg0, arg1) & Static328.method4203(arg0, arg1);
	}
}
