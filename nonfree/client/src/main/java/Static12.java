import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "X", descriptor = "[Lclient!lda;")
	public static Class187[] aClass187Array2;

	@OriginalMember(owner = "client!ag", name = "eb", descriptor = "Z")
	public static boolean aBoolean593;

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "Lclient!gk;")
	public static final Class112 aClass112_54 = new Class112();

	@OriginalMember(owner = "client!ag", name = "db", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_152 = new Class56(78, 0);

	@OriginalMember(owner = "client!ag", name = "gb", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_57 = new Class6(8);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIIFI[F)V")
	public static void method6300(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8) {
		@Pc(5) int local5 = arg2 - arg4;
		@Pc(13) int local13 = arg3 - arg1;
		@Pc(17) int local17 = arg5 - arg0;
		@Pc(38) float local38 = (float) local5 * arg8[1] + (float) local17 * arg8[0] + arg8[2] * (float) local13;
		@Pc(59) float local59 = (float) local13 * arg8[5] + arg8[4] * (float) local5 + arg8[3] * (float) local17;
		@Pc(80) float local80 = arg8[8] * (float) local13 + (float) local5 * arg8[7] + (float) local17 * arg8[6];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = arg6 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(124) float local124;
		if (arg7 == 1) {
			local124 = local106;
			local106 = -local119;
			local119 = local124;
		} else if (arg7 == 2) {
			local106 = -local106;
			local119 = -local119;
		} else if (arg7 == 3) {
			local124 = local106;
			local106 = local119;
			local119 = -local124;
		}
		Static452.aFloat144 = local119;
		Static590.aFloat206 = local106;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Lclient!ru;")
	public static Class299 method6301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static309.aClass299ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static309.aClass299ArrayArrayArray3[0][arg1][arg2] != null && Static309.aClass299ArrayArrayArray3[0][arg1][arg2].aClass299_1 != null;
			if (local28 && arg0 >= Static459.anInt7698 - 1) {
				return null;
			}
			Static407.method5867(arg0, arg1, arg2);
		}
		return Static309.aClass299ArrayArrayArray3[arg0][arg1][arg2];
	}
}
