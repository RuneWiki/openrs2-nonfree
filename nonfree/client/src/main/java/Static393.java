import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!pfa", name = "y", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_107 = new Class47(37, 4);

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIFIIIII[F)V")
	public static void method5750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8) {
		@Pc(9) int local9 = arg5 - arg2;
		@Pc(13) int local13 = arg4 - arg0;
		@Pc(17) int local17 = arg1 - arg7;
		@Pc(38) float local38 = (float) local13 * arg8[2] + (float) local9 * arg8[1] + arg8[0] * (float) local17;
		@Pc(59) float local59 = arg8[3] * (float) local17 + arg8[4] * (float) local9 + (float) local13 * arg8[5];
		@Pc(84) float local84 = arg8[8] * (float) local13 + (float) local17 * arg8[6] + (float) local9 * arg8[7];
		@Pc(99) float local99 = (float) Math.sqrt((double) (local84 * local84 + local38 * local38 + local59 * local59));
		@Pc(110) float local110 = (float) Math.atan2((double) local38, (double) local84) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = arg3 + (float) Math.asin((double) (local59 / local99)) / 3.1415927F + 0.5F;
		@Pc(128) float local128;
		if (arg6 == 1) {
			local128 = local110;
			local110 = -local123;
			local123 = local128;
		} else if (arg6 == 2) {
			local110 = -local110;
			local123 = -local123;
		} else if (arg6 == 3) {
			local128 = local110;
			local110 = local123;
			local123 = -local128;
		}
		Static550.aFloat193 = local123;
		Static524.aFloat187 = local110;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILclient!ji;)V")
	public static void method5767(@OriginalArg(1) Class6_Sub21 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static255.anInt4966; local7++) {
			@Pc(27) int local27 = arg0.method6005();
			@Pc(31) int local31 = arg0.method6003();
			if (local31 == 65535) {
				local31 = -1;
			}
			if (Static109.aClass299_Sub1Array1[local27] != null) {
				Static109.aClass299_Sub1Array1[local27].anInt8028 = local31;
			}
		}
	}
}
