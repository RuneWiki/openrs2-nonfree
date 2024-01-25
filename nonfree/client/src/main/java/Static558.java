import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "Z")
	public static boolean aBoolean641 = false;

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_144 = new Class287(16, 8);

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "[I")
	public static final int[] anIntArray560 = new int[1];

	@OriginalMember(owner = "client!vba", name = "g", descriptor = "Z")
	public static boolean aBoolean642 = false;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method7651(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIFIII[FIBI)V")
	public static void method7652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg0 - arg5;
		@Pc(18) int local18 = arg7 - arg3;
		@Pc(22) int local22 = arg8 - arg1;
		@Pc(43) float local43 = arg6[2] * (float) local18 + (float) local22 * arg6[1] + arg6[0] * (float) local5;
		@Pc(64) float local64 = arg6[4] * (float) local22 + arg6[3] * (float) local5 + arg6[5] * (float) local18;
		@Pc(85) float local85 = (float) local18 * arg6[8] + arg6[7] * (float) local22 + (float) local5 * arg6[6];
		@Pc(100) float local100 = (float) Math.sqrt((double) (local43 * local43 + local64 * local64 + local85 * local85));
		@Pc(111) float local111 = (float) Math.atan2((double) local43, (double) local85) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = arg2 + (float) Math.asin((double) (local64 / local100)) / 3.1415927F + 0.5F;
		@Pc(129) float local129;
		if (arg4 == 1) {
			local129 = local111;
			local111 = -local124;
			local124 = local129;
		} else if (arg4 == 2) {
			local124 = -local124;
			local111 = -local111;
		} else if (arg4 == 3) {
			local129 = local111;
			local111 = local124;
			local124 = -local129;
		}
		Static290.aFloat128 = local124;
		Static340.aFloat147 = local111;
	}
}
