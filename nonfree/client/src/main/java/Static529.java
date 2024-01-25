import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	public static int anInt9508 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IFFIII[FIIII[F)V")
	public static void method7861(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) float[] arg10) {
		@Pc(5) int local5 = arg9 - arg3;
		@Pc(13) int local13 = arg0 - arg5;
		@Pc(17) int local17 = arg4 - arg8;
		@Pc(38) float local38 = arg10[0] * (float) local5 + arg10[1] * (float) local17 + (float) local13 * arg10[2];
		@Pc(59) float local59 = (float) local5 * arg10[3] + (float) local17 * arg10[4] + arg10[5] * (float) local13;
		@Pc(80) float local80 = (float) local13 * arg10[8] + arg10[7] * (float) local17 + (float) local5 * arg10[6];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg1 != 1.0F) {
			local91 *= arg1;
		}
		@Pc(105) float local105 = arg2 + local59 + 0.5F;
		@Pc(128) float local128;
		if (arg7 == 1) {
			local128 = local91;
			local91 = -local105;
			local105 = local128;
		} else if (arg7 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg7 == 3) {
			local128 = local91;
			local91 = local105;
			local105 = -local128;
		}
		arg6[1] = local105;
		arg6[0] = local91;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method7862() {
		if (Static469.method9286(Static430.anInt7691) || Static25.method478(Static430.anInt7691)) {
			Static123.method2083(Static233.anInt4273 >> 12, 5000, Static74.anInt1618 >> 12);
		} else {
			@Pc(27) int local27 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray241[0] >> 3;
			@Pc(34) int local34 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray242[0] >> 3;
			if (local27 >= 0 && Static26.anInt462 >> 3 > local27 && local34 >= 0 && local34 < Static445.anInt6140 >> 3) {
				Static123.method2083(local27, 5000, local34);
			} else {
				Static123.method2083(Static26.anInt462 >> 4, 0, Static445.anInt6140 >> 4);
			}
		}
		Static122.method2077();
		Static405.method6011();
		Static311.method4977();
		Static277.method4032();
	}
}
