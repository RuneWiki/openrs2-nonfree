import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
	public static int anInt2088;

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "Lclient!pq;")
	public static Class251 aClass251_41;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Lclient!nj;")
	public static final Class212 aClass212_5 = new Class212(8);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIBII[FIIFI)V")
	public static void method1812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg6 - arg8;
		@Pc(13) int local13 = arg0 - arg1;
		@Pc(17) int local17 = arg2 - arg3;
		@Pc(38) float local38 = (float) local13 * arg4[1] + arg4[0] * (float) local17 + (float) local5 * arg4[2];
		@Pc(67) float local67 = (float) local17 * arg4[3] + arg4[4] * (float) local13 + arg4[5] * (float) local5;
		@Pc(88) float local88 = arg4[8] * (float) local5 + (float) local13 * arg4[7] + arg4[6] * (float) local17;
		@Pc(103) float local103 = (float) Math.sqrt((double) (local88 * local88 + local38 * local38 + local67 * local67));
		@Pc(114) float local114 = (float) Math.atan2((double) local38, (double) local88) / 6.2831855F + 0.5F;
		@Pc(127) float local127 = (float) Math.asin((double) (local67 / local103)) / 3.1415927F + arg7 + 0.5F;
		@Pc(140) float local140;
		if (arg5 == 1) {
			local140 = local114;
			local114 = -local127;
			local127 = local140;
		} else if (arg5 == 2) {
			local127 = -local127;
			local114 = -local114;
		} else if (arg5 == 3) {
			local140 = local114;
			local114 = local127;
			local127 = -local140;
		}
		Static304.aFloat127 = local114;
		Static173.aFloat44 = local127;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)Lclient!wda;")
	public static Class29_Sub5 method1814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class9 local7 = Static208.aClass9ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass29_Sub5_1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "([SII)[S")
	public static short[] method1817(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static585.method3078(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	public static void method1818() {
		Static458.aClass332_175.method7512();
		Static303.aClass332_126.method7512();
		Static96.aClass332_45.method7512();
		Static333.aClass332_145.method7512();
		Static399.aClass332_162.method7512();
	}
}
