import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!dq", name = "r", descriptor = "Lclient!sc;")
	public static Class223 aClass223_1;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "[I")
	public static final int[] anIntArray97 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
	public static int anInt1270 = 0;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BIIIIFII[FI)V")
	public static void method1175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg3 - arg5;
		@Pc(9) int local9 = arg8 - arg0;
		@Pc(17) int local17 = arg6 - arg1;
		@Pc(38) float local38 = (float) local5 * arg7[2] + arg7[1] * (float) local9 + (float) local17 * arg7[0];
		@Pc(59) float local59 = (float) local5 * arg7[5] + (float) local9 * arg7[4] + (float) local17 * arg7[3];
		@Pc(80) float local80 = arg7[7] * (float) local9 + (float) local17 * arg7[6] + arg7[8] * (float) local5;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg4 + 0.5F;
		@Pc(129) float local129;
		if (arg2 == 1) {
			local129 = local111;
			local111 = -local124;
			local124 = local129;
		} else if (arg2 == 2) {
			local124 = -local124;
			local111 = -local111;
		} else if (arg2 == 3) {
			local129 = local111;
			local111 = local124;
			local124 = -local129;
		}
		Static396.aFloat90 = local124;
		Static213.aFloat27 = local111;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Z")
	public static boolean method1176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static298.method4273(arg0, arg1) || Static296.method4225(arg0, arg1);
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(IB)Z")
	public static boolean method1177(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(CI)Z")
	public static boolean method1178(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
