import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!qw", name = "j", descriptor = "Lclient!gja;")
	public static Class139 aClass139_3;

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "[I")
	public static final int[] anIntArray603 = new int[3];

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IBI)Z")
	public static boolean method7522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ZIII)V")
	public static void method7523(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static426.aClass218_29.method5095((long) arg1, 0) != null) {
			return;
		}
		if (Static527.aBoolean722) {
			@Pc(36) Class2_Sub44 local36 = new Class2_Sub44(arg1, new Class156_Sub1(4096, Static161.aClass254_61, arg1), arg2, arg0);
			local36.aClass156_Sub1_1.method3424(Static198.aStringArray15[Static414.anInt9485]);
			Static426.aClass218_29.method5099(local36, (long) arg1);
		} else {
			Static604.method8254(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "(I)I")
	public static int method7524() {
		return Static413.anInt6772++;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IB[FIFIIFI[FFIII)V")
	public static void method7525(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(5) int local5 = arg10 - arg7;
		@Pc(9) int local9 = arg11 - arg0;
		@Pc(13) int local13 = arg4 - arg2;
		@Pc(38) float local38 = arg1[0] * (float) local13 + arg1[1] * (float) local5 + arg1[2] * (float) local9;
		@Pc(59) float local59 = arg1[5] * (float) local9 + arg1[4] * (float) local5 + arg1[3] * (float) local13;
		@Pc(87) float local87 = (float) local5 * arg1[7] + (float) local13 * arg1[6] + (float) local9 * arg1[8];
		@Pc(105) float local105;
		@Pc(99) float local99;
		if (arg12 == 0) {
			local99 = arg6 + 0.5F - local87;
			local105 = local38 + arg9 + 0.5F;
		} else if (arg12 == 1) {
			local105 = local38 + arg9 + 0.5F;
			local99 = local87 + arg6 + 0.5F;
		} else if (arg12 == 2) {
			local105 = arg9 + 0.5F - local38;
			local99 = arg3 + 0.5F - local59;
		} else if (arg12 == 3) {
			local105 = local38 + arg9 + 0.5F;
			local99 = arg3 + 0.5F - local59;
		} else if (arg12 == 4) {
			local105 = arg6 + local87 + 0.5F;
			local99 = arg3 + 0.5F - local59;
		} else {
			local105 = arg6 + 0.5F - local87;
			local99 = arg3 + 0.5F - local59;
		}
		@Pc(228) float local228;
		if (arg5 == 1) {
			local228 = local105;
			local105 = -local99;
			local99 = local228;
		} else if (arg5 == 2) {
			local99 = -local99;
			local105 = -local105;
		} else if (arg5 == 3) {
			local228 = local105;
			local105 = local99;
			local99 = -local228;
		}
		arg8[0] = local105;
		arg8[1] = local99;
	}
}
