import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
	public static int anInt2469;

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_38 = new Class84("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_45 = new Class237(89, 7);

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_39 = new Class84("K", "T", "K", "K");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IF[FIBIIIII)V")
	public static void method2174(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = arg8 - arg7;
		@Pc(21) int local21 = arg3 - arg4;
		@Pc(25) int local25 = arg0 - arg6;
		@Pc(46) float local46 = arg2[0] * (float) local13 + arg2[1] * (float) local21 + (float) local25 * arg2[2];
		@Pc(67) float local67 = arg2[5] * (float) local25 + arg2[3] * (float) local13 + (float) local21 * arg2[4];
		@Pc(88) float local88 = arg2[8] * (float) local25 + arg2[6] * (float) local13 + arg2[7] * (float) local21;
		@Pc(103) float local103 = (float) Math.sqrt((double) (local67 * local67 + local46 * local46 + local88 * local88));
		@Pc(114) float local114 = (float) Math.atan2((double) local46, (double) local88) / 6.2831855F + 0.5F;
		@Pc(127) float local127 = arg1 + (float) Math.asin((double) (local67 / local103)) / 3.1415927F + 0.5F;
		@Pc(134) float local134;
		if (arg5 == 1) {
			local134 = local114;
			local114 = -local127;
			local127 = local134;
		} else if (arg5 == 2) {
			local114 = -local114;
			local127 = -local127;
		} else if (arg5 == 3) {
			local134 = local114;
			local114 = local127;
			local127 = -local134;
		}
		Static452.aFloat97 = local127;
		Static288.aFloat80 = local114;
	}
}
