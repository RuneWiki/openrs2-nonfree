import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!kn", name = "H", descriptor = "I")
	public static int anInt3549;

	@OriginalMember(owner = "client!kn", name = "D", descriptor = "I")
	public static int anInt3546 = 100;

	@OriginalMember(owner = "client!kn", name = "G", descriptor = "Z")
	public static boolean aBoolean217 = false;

	@OriginalMember(owner = "client!kn", name = "J", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_118 = new Class102(29, 11);

	@OriginalMember(owner = "client!kn", name = "K", descriptor = "Z")
	public static boolean aBoolean218 = false;

	@OriginalMember(owner = "client!kn", name = "L", descriptor = "Lclient!dp;")
	public static Class2_Sub11 aClass2_Sub11_2 = null;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII[FIIIIF)V")
	public static void method2850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(5) int local5 = arg3 - arg2;
		@Pc(13) int local13 = arg1 - arg0;
		@Pc(17) int local17 = arg7 - arg6;
		@Pc(38) float local38 = arg4[2] * (float) local17 + (float) local5 * arg4[1] + (float) local13 * arg4[0];
		@Pc(59) float local59 = arg4[3] * (float) local13 + arg4[4] * (float) local5 + arg4[5] * (float) local17;
		@Pc(80) float local80 = (float) local17 * arg4[8] + arg4[6] * (float) local13 + (float) local5 * arg4[7];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = arg8 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(132) float local132;
		if (arg5 == 1) {
			local132 = local106;
			local106 = -local119;
			local119 = local132;
		} else if (arg5 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg5 == 3) {
			local132 = local106;
			local106 = local119;
			local119 = -local132;
		}
		Static53.aFloat11 = local119;
		Static142.aFloat27 = local106;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)Z")
	public static boolean method2851(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}
}
