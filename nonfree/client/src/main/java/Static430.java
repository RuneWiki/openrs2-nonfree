import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "I")
	public static int anInt7862;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V")
	public static void method6637() {
		@Pc(5) Class94 local5 = Static378.aClass94_34;
		synchronized (Static378.aClass94_34) {
			Static378.aClass94_34.method2964();
		}
		local5 = Static403.aClass94_38;
		synchronized (Static403.aClass94_38) {
			Static403.aClass94_38.method2964();
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "([FIII[FIIFIII)V")
	public static void method6638(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(10) int local10 = arg5 - arg3;
		@Pc(14) int local14 = arg1 - arg6;
		@Pc(18) int local18 = arg8 - arg9;
		@Pc(43) float local43 = (float) local14 * arg4[1] + arg4[0] * (float) local18 + (float) local10 * arg4[2];
		@Pc(64) float local64 = (float) local10 * arg4[5] + arg4[3] * (float) local18 + arg4[4] * (float) local14;
		@Pc(85) float local85 = (float) local18 * arg4[6] + arg4[7] * (float) local14 + arg4[8] * (float) local10;
		@Pc(100) float local100 = (float) Math.sqrt((double) (local64 * local64 + local43 * local43 + local85 * local85));
		@Pc(111) float local111 = (float) Math.atan2((double) local43, (double) local85) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = (float) Math.asin((double) (local64 / local100)) / 3.1415927F + arg7 + 0.5F;
		@Pc(129) float local129;
		if (arg2 == 1) {
			local129 = local111;
			local111 = -local124;
			local124 = local129;
		} else if (arg2 == 2) {
			local111 = -local111;
			local124 = -local124;
		} else if (arg2 == 3) {
			local129 = local111;
			local111 = local124;
			local124 = -local129;
		}
		arg0[0] = local111;
		arg0[1] = local124;
	}
}
