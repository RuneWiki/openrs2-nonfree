import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!qi", name = "I", descriptor = "Z")
	public static boolean aBoolean509;

	@OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
	public static int anInt5665;

	@OriginalMember(owner = "client!qi", name = "F", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!qi", name = "J", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_75 = new Class215(11, 7);

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "[I")
	public static final int[] anIntArray395 = new int[13];

	@OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
	public static int anInt5666 = 104;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([FZFFIFIIIIIII)V")
	public static void method4413(@OriginalArg(0) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg11 - arg6;
		@Pc(16) int local16 = arg3 - arg9;
		@Pc(24) int local24 = arg5 - arg10;
		@Pc(45) float local45 = (float) local5 * arg0[2] + (float) local24 * arg0[1] + (float) local16 * arg0[0];
		@Pc(66) float local66 = (float) local24 * arg0[4] + arg0[3] * (float) local16 + arg0[5] * (float) local5;
		@Pc(87) float local87 = (float) local16 * arg0[6] + (float) local24 * arg0[7] + (float) local5 * arg0[8];
		@Pc(102) float local102;
		@Pc(96) float local96;
		if (arg7 == 0) {
			local96 = arg4 + 0.5F - local87;
			local102 = local45 + arg2 + 0.5F;
		} else if (arg7 == 1) {
			local102 = local45 + arg2 + 0.5F;
			local96 = arg4 + local87 + 0.5F;
		} else if (arg7 == 2) {
			local102 = arg2 + 0.5F - local45;
			local96 = arg1 + 0.5F - local66;
		} else if (arg7 == 3) {
			local96 = arg1 + 0.5F - local66;
			local102 = local45 + arg2 + 0.5F;
		} else if (arg7 == 4) {
			local102 = arg4 + local87 + 0.5F;
			local96 = arg1 + 0.5F - local66;
		} else {
			local102 = arg4 + 0.5F - local87;
			local96 = arg1 + 0.5F - local66;
		}
		@Pc(197) float local197;
		if (arg8 == 1) {
			local197 = local102;
			local102 = -local96;
			local96 = local197;
		} else if (arg8 == 2) {
			local96 = -local96;
			local102 = -local102;
		} else if (arg8 == 3) {
			local197 = local102;
			local102 = local96;
			local96 = -local197;
		}
		Static204.aFloat127 = local102;
		Static332.aFloat180 = local96;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
	public static boolean method4415(@OriginalArg(0) int arg0) {
		Static183.anInt3512 = arg0 + 1 & 0xFFFF;
		Static83.aBoolean159 = true;
		return true;
	}
}
