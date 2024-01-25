import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "[Lclient!qda;")
	public static Class59[] aClass59Array15;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_75 = new Class187(14, 8);

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "[Lclient!du;")
	public static final Class85[] aClass85Array1 = new Class85[37];

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_76 = new Class187(25, -1);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[FFIIIFF[FIIIII)V")
	public static void method7008(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(5) int local5 = arg11 - arg0;
		@Pc(13) int local13 = arg10 - arg4;
		@Pc(17) int local17 = arg9 - arg12;
		@Pc(38) float local38 = (float) local5 * arg8[2] + (float) local13 * arg8[1] + arg8[0] * (float) local17;
		@Pc(59) float local59 = arg8[4] * (float) local13 + (float) local17 * arg8[3] + arg8[5] * (float) local5;
		@Pc(80) float local80 = arg8[7] * (float) local13 + arg8[6] * (float) local17 + arg8[8] * (float) local5;
		@Pc(98) float local98;
		@Pc(92) float local92;
		if (arg5 == 0) {
			local92 = arg2 + 0.5F - local80;
			local98 = local38 + arg7 + 0.5F;
		} else if (arg5 == 1) {
			local92 = local80 + arg2 + 0.5F;
			local98 = arg7 + local38 + 0.5F;
		} else if (arg5 == 2) {
			local98 = arg7 + 0.5F - local38;
			local92 = arg6 + 0.5F - local59;
		} else if (arg5 == 3) {
			local98 = arg7 + local38 + 0.5F;
			local92 = arg6 + 0.5F - local59;
		} else if (arg5 == 4) {
			local98 = local80 + arg2 + 0.5F;
			local92 = arg6 + 0.5F - local59;
		} else {
			local92 = arg6 + 0.5F - local59;
			local98 = arg2 + 0.5F - local80;
		}
		@Pc(195) float local195;
		if (arg3 == 1) {
			local195 = local98;
			local98 = -local92;
			local92 = local195;
		} else if (arg3 == 2) {
			local98 = -local98;
			local92 = -local92;
		} else if (arg3 == 3) {
			local195 = local98;
			local98 = local92;
			local92 = -local195;
		}
		arg1[0] = local98;
		arg1[1] = local92;
	}
}
