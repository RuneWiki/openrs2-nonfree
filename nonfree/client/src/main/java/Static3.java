import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aba", name = "m", descriptor = "F")
	public static float aFloat163;

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
	public static int anInt7083;

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
	public static int anInt7080 = -1;

	@OriginalMember(owner = "client!aba", name = "j", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_109 = new Class98(114, -1);

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_42 = new Class330(64);

	@OriginalMember(owner = "client!aba", name = "l", descriptor = "Lclient!faa;")
	public static Class97 aClass97_17 = null;

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "(B)V")
	public static void method5663() {
		aClass330_42.method7688();
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)Lclient!jd;")
	public static Class6_Sub22 method5664() {
		if (Static490.aClass298_38 == null || Static43.aClass95_1 == null) {
			return null;
		}
		Static43.aClass95_1.method2271(Static490.aClass298_38);
		@Pc(18) Class6_Sub22 local18 = (Class6_Sub22) Static43.aClass95_1.method2270();
		if (local18 == null) {
			return null;
		} else {
			@Pc(28) Class336 local28 = Static490.aClass320_2.method7209(local18.anInt4399);
			return local28 != null && local28.aBoolean662 && local28.method7783(Static490.anInterface17_2) ? local18 : Static256.method3973();
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIII[FIFIIFI)V")
	public static void method5665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg1 - arg2;
		@Pc(13) int local13 = arg0 - arg6;
		@Pc(17) int local17 = arg9 - arg4;
		@Pc(38) float local38 = (float) local9 * arg3[1] + arg3[0] * (float) local17 + arg3[2] * (float) local13;
		@Pc(59) float local59 = arg3[5] * (float) local13 + (float) local17 * arg3[3] + (float) local9 * arg3[4];
		@Pc(80) float local80 = (float) local9 * arg3[7] + arg3[6] * (float) local17 + (float) local13 * arg3[8];
		@Pc(99) float local99 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg8 != 1.0F) {
			local99 *= arg8;
		}
		@Pc(113) float local113 = arg5 + local59 + 0.5F;
		@Pc(118) float local118;
		if (arg7 == 1) {
			local118 = local99;
			local99 = -local113;
			local113 = local118;
		} else if (arg7 == 2) {
			local99 = -local99;
			local113 = -local113;
		} else if (arg7 == 3) {
			local118 = local99;
			local99 = local113;
			local113 = -local118;
		}
		Static23.aFloat18 = local99;
		Static301.aFloat130 = local113;
	}
}
