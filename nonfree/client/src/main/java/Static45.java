import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Lclient!qn;")
	public static Class209 aClass209_127;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_421 = new Class123(26, -1);

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_422 = new Class123(1, 5);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)J")
	public static long method6526() {
		return Static47.aClass15_1.method6111();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)V")
	public static void method6528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 >= Static165.anInt3313 && arg2 <= Static152.anInt3132 && arg0 >= Static172.anInt3442 && Static324.anInt5590 >= arg1) {
			Static119.method5703(arg4, arg0, arg1, arg3, arg2);
		} else {
			Static404.method5975(arg4, arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
	public static void method6529() {
		if (Static126.aClass66_5.method4976()) {
			Static126.aClass66_5.method5006(Static280.aCanvas3);
			Static132.method2362();
			Static126.aClass66_5.method4980(Static280.aCanvas3);
			Static126.aClass66_5.method4968(Static280.aCanvas3);
		} else {
			Static436.method6326(Static294.anInt5208);
		}
		Static206.method3172();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([FIIIFIIFZII)V")
	public static void method6530(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg9 - arg2;
		@Pc(9) int local9 = arg5 - arg6;
		@Pc(13) int local13 = arg8 - arg1;
		@Pc(38) float local38 = arg0[0] * (float) local5 + arg0[1] * (float) local13 + (float) local9 * arg0[2];
		@Pc(64) float local64 = (float) local9 * arg0[5] + (float) local13 * arg0[4] + arg0[3] * (float) local5;
		@Pc(85) float local85 = (float) local5 * arg0[6] + (float) local13 * arg0[7] + (float) local9 * arg0[8];
		@Pc(96) float local96 = (float) Math.atan2((double) local38, (double) local85) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local96 *= arg7;
		}
		@Pc(110) float local110 = local64 + arg4 + 0.5F;
		@Pc(117) float local117;
		if (arg3 == 1) {
			local117 = local96;
			local96 = -local110;
			local110 = local117;
		} else if (arg3 == 2) {
			local96 = -local96;
			local110 = -local110;
		} else if (arg3 == 3) {
			local117 = local96;
			local96 = local110;
			local110 = -local117;
		}
		Static180.aFloat33 = local96;
		Static306.aFloat58 = local110;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)I")
	public static int method6532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22 = arg1 >>> 31;
		return (arg1 + local22) / arg0 - local22;
	}
}
