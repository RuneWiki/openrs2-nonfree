import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bga", name = "g", descriptor = "Lclient!ca;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!bga", name = "i", descriptor = "[Lclient!s;")
	public static Class259[] aClass259Array1;

	@OriginalMember(owner = "client!bga", name = "k", descriptor = "Z")
	public static volatile boolean aBoolean88 = true;

	@OriginalMember(owner = "client!bga", name = "e", descriptor = "[I")
	public static final int[] anIntArray78 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method1172(@OriginalArg(0) Class22 arg0) {
		Static607.aClass57_12 = Static99.method1979(arg0, true, Static109.anInt2309, true);
		Static286.aClass169_5 = Static279.method3944(Static109.anInt2309, arg0);
		Static480.aClass57_9 = Static99.method1979(arg0, true, Static506.anInt8059, true);
		Static52.aClass169_1 = Static279.method3944(Static506.anInt8059, arg0);
		Static561.aClass57_10 = Static99.method1979(arg0, true, Static643.anInt9935, true);
		Static677.aClass169_12 = Static279.method3944(Static643.anInt9935, arg0);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "([F[FFIIFIIIIIFII)V")
	public static void method1173(@OriginalArg(0) float[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(5) int local5 = arg7 - arg6;
		@Pc(9) int local9 = arg8 - arg5;
		@Pc(17) int local17 = arg11 - arg9;
		@Pc(38) float local38 = (float) local5 * arg0[1] + (float) local9 * arg0[0] + arg0[2] * (float) local17;
		@Pc(59) float local59 = (float) local17 * arg0[5] + arg0[4] * (float) local5 + arg0[3] * (float) local9;
		@Pc(80) float local80 = (float) local5 * arg0[7] + arg0[6] * (float) local9 + (float) local17 * arg0[8];
		@Pc(104) float local104;
		@Pc(98) float local98;
		if (arg3 == 0) {
			local104 = arg4 + local38 + 0.5F;
			local98 = arg10 + 0.5F - local80;
		} else if (arg3 == 1) {
			local98 = arg10 + local80 + 0.5F;
			local104 = local38 + arg4 + 0.5F;
		} else if (arg3 == 2) {
			local104 = arg4 + 0.5F - local38;
			local98 = arg2 + 0.5F - local59;
		} else if (arg3 == 3) {
			local98 = arg2 + 0.5F - local59;
			local104 = arg4 + local38 + 0.5F;
		} else if (arg3 == 4) {
			local98 = arg2 + 0.5F - local59;
			local104 = arg10 + local80 + 0.5F;
		} else {
			local98 = arg2 + 0.5F - local59;
			local104 = arg10 + 0.5F - local80;
		}
		@Pc(203) float local203;
		if (arg12 == 1) {
			local203 = local104;
			local104 = -local98;
			local98 = local203;
		} else if (arg12 == 2) {
			local98 = -local98;
			local104 = -local104;
		} else if (arg12 == 3) {
			local203 = local104;
			local104 = local98;
			local98 = -local203;
		}
		arg1[1] = local98;
		arg1[0] = local104;
	}
}
