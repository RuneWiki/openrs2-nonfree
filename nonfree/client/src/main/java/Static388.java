import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!te", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "[I")
	public static int[] anIntArray542;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "Lclient!cc;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_113 = new Class231("M", "M", "M", "M");

	@OriginalMember(owner = "client!te", name = "m", descriptor = "[[F")
	public static final float[][] aFloatArrayArray6 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!te", name = "n", descriptor = "Z")
	public static boolean aBoolean455 = false;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIF[FIIIBF)V")
	public static void method5381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) float arg9) {
		@Pc(5) int local5 = arg7 - arg6;
		@Pc(9) int local9 = arg3 - arg0;
		@Pc(13) int local13 = arg8 - arg2;
		@Pc(46) float local46 = arg5[2] * (float) local9 + arg5[1] * (float) local5 + arg5[0] * (float) local13;
		@Pc(67) float local67 = arg5[4] * (float) local5 + arg5[3] * (float) local13 + (float) local9 * arg5[5];
		@Pc(88) float local88 = (float) local9 * arg5[8] + (float) local5 * arg5[7] + (float) local13 * arg5[6];
		@Pc(99) float local99 = (float) Math.atan2((double) local46, (double) local88) / 6.2831855F + 0.5F;
		if (arg9 != 1.0F) {
			local99 *= arg9;
		}
		@Pc(113) float local113 = local67 + arg4 + 0.5F;
		@Pc(136) float local136;
		if (arg1 == 1) {
			local136 = local99;
			local99 = -local113;
			local113 = local136;
		} else if (arg1 == 2) {
			local113 = -local113;
			local99 = -local99;
		} else if (arg1 == 3) {
			local136 = local99;
			local99 = local113;
			local113 = -local136;
		}
		Static141.aFloat92 = local113;
		Static19.aFloat5 = local99;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
	public static void method5383() {
		Static80.anInt6192 = -1;
		Static214.aClass41_10 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIB)V")
	public static void method5385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static267.method3705(arg1, 10);
		local8.method2574();
		local8.anInt3131 = arg2;
		local8.anInt3128 = arg0;
		local8.anInt3130 = arg3;
	}
}
