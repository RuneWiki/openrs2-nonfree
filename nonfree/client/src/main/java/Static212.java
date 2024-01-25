import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB)Lclient!kf;")
	public static Class23_Sub1 method4973(@OriginalArg(0) int arg0) {
		return Static122.aBoolean230 && arg0 >= Static131.anInt2991 && Static136.anInt3074 >= arg0 ? Static502.aClass23_Sub1Array2[arg0 - Static131.anInt2991] : null;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(FIIIII[FIIIF)V")
	public static void method4975(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) float arg9) {
		@Pc(5) int local5 = arg2 - arg8;
		@Pc(9) int local9 = arg7 - arg5;
		@Pc(13) int local13 = arg1 - arg4;
		@Pc(38) float local38 = arg6[0] * (float) local5 + arg6[1] * (float) local9 + (float) local13 * arg6[2];
		@Pc(59) float local59 = arg6[3] * (float) local5 + (float) local9 * arg6[4] + arg6[5] * (float) local13;
		@Pc(80) float local80 = arg6[8] * (float) local13 + (float) local9 * arg6[7] + (float) local5 * arg6[6];
		@Pc(95) float local95 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local95 *= arg0;
		}
		@Pc(109) float local109 = local59 + arg9 + 0.5F;
		@Pc(116) float local116;
		if (arg3 == 1) {
			local116 = local95;
			local95 = -local109;
			local109 = local116;
		} else if (arg3 == 2) {
			local109 = -local109;
			local95 = -local95;
		} else if (arg3 == 3) {
			local116 = local95;
			local95 = local109;
			local109 = -local116;
		}
		Static280.aFloat118 = local109;
		Static11.aFloat4 = local95;
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(B)V")
	public static void method4976() {
		Static332.method5312(Static449.aClass77_76);
		Static383.aClass12_Sub8_Sub2_1.method5214(0);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Z")
	public static boolean method4977() {
		return Static530.aBoolean673;
	}
}
