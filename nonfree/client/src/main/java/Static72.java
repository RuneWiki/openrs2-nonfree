import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Lclient!ud;")
	public static final Class245 aClass245_5 = new Class245(10, 2, 2, 0);

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[5];

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IFIIIII[FII)V")
	public static void method1175(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg3 - arg2;
		@Pc(9) int local9 = arg8 - arg0;
		@Pc(17) int local17 = arg5 - arg4;
		@Pc(38) float local38 = arg6[2] * (float) local9 + (float) local17 * arg6[0] + arg6[1] * (float) local5;
		@Pc(59) float local59 = (float) local9 * arg6[5] + arg6[4] * (float) local5 + (float) local17 * arg6[3];
		@Pc(80) float local80 = (float) local5 * arg6[7] + (float) local17 * arg6[6] + (float) local9 * arg6[8];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = arg1 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(134) float local134;
		if (arg7 == 1) {
			local134 = local106;
			local106 = -local119;
			local119 = local134;
		} else if (arg7 == 2) {
			local106 = -local106;
			local119 = -local119;
		} else if (arg7 == 3) {
			local134 = local106;
			local106 = local119;
			local119 = -local134;
		}
		Static269.aFloat48 = local119;
		Static111.aFloat23 = local106;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
	public static void method1176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class75 local7 = Static432.aClass75ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass8_Sub2_1 != null) {
			local7.aClass8_Sub2_1 = null;
		}
		if (local7.aClass8_Sub2_2 != null) {
			local7.aClass8_Sub2_2 = null;
		}
	}
}
