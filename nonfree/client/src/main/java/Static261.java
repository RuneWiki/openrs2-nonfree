import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
	public static int anInt5023;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
	public static int anInt5024 = 0;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[6][];

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!ri;IIIIIZ)V")
	public static void method4017(@OriginalArg(0) Class284 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= 0) {
			Static293.method4412(arg0, arg2, arg1);
			return;
		}
		Static38.aBoolean94 = false;
		Static213.anInt4459 = arg2;
		Static530.anInt9251 = 1;
		Static533.aClass3_Sub16_Sub3_3 = null;
		Static130.aClass284_126 = arg0;
		Static508.anInt8798 = arg1;
		Static530.anInt9247 = 0;
		Static426.anInt7533 = Static548.aClass3_Sub16_Sub3_4.method6121() / arg3;
		if (Static426.anInt7533 < 1) {
			Static426.anInt7533 = 1;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIII)V")
	public static void method4018(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static157.anInt2663 / (float) Static157.anInt2673;
		@Pc(11) int local11 = arg0;
		@Pc(13) int local13 = arg2;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg0);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(39) int local39 = arg1 - (arg0 - local11) / 2;
		@Pc(47) int local47 = arg3 - (arg2 - local13) / 2;
		Static79.anInt2117 = Static157.anInt2673 * local39 / local11;
		Static461.anInt8061 = Static157.anInt2663 - Static157.anInt2663 * local47 / local13;
		Static82.anInt9708 = -1;
		Static466.anInt8098 = -1;
		Static277.method4203();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!eq;Z)V")
	public static void method4019(@OriginalArg(0) Class3_Sub16 arg0) {
		arg0.aBoolean650 = false;
		if (arg0.aClass3_Sub17_5 != null) {
			arg0.aClass3_Sub17_5.anInt7873 = 0;
		}
		for (@Pc(27) Class3_Sub16 local27 = arg0.method7752(); local27 != null; local27 = arg0.method7748()) {
			method4019(local27);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZIIF[FIIIIF)V")
	public static void method4020(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(5) int local5 = arg0 - arg7;
		@Pc(13) int local13 = arg2 - arg1;
		@Pc(17) int local17 = arg8 - arg5;
		@Pc(38) float local38 = arg4[1] * (float) local13 + arg4[0] * (float) local17 + arg4[2] * (float) local5;
		@Pc(59) float local59 = arg4[5] * (float) local5 + arg4[4] * (float) local13 + arg4[3] * (float) local17;
		@Pc(80) float local80 = (float) local5 * arg4[8] + arg4[7] * (float) local13 + arg4[6] * (float) local17;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg9 != 1.0F) {
			local91 *= arg9;
		}
		@Pc(110) float local110 = local59 + arg3 + 0.5F;
		@Pc(117) float local117;
		if (arg6 == 1) {
			local117 = local91;
			local91 = -local110;
			local110 = local117;
		} else if (arg6 == 2) {
			local110 = -local110;
			local91 = -local91;
		} else if (arg6 == 3) {
			local117 = local91;
			local91 = local110;
			local110 = -local117;
		}
		Static496.aFloat184 = local91;
		Static401.aFloat156 = local110;
	}
}
