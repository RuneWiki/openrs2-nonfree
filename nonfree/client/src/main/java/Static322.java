import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!lia", name = "t", descriptor = "I")
	public static int anInt6055;

	@OriginalMember(owner = "client!lia", name = "e", descriptor = "I")
	public static int anInt6043 = -1;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(FI[FIIIIIII[F)V")
	public static void method5266(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9) {
		@Pc(9) int local9 = arg8 - arg4;
		@Pc(13) int local13 = arg5 - arg1;
		@Pc(17) int local17 = arg3 - arg6;
		@Pc(38) float local38 = (float) local9 * arg9[0] + (float) local13 * arg9[1] + arg9[2] * (float) local17;
		@Pc(59) float local59 = arg9[5] * (float) local17 + arg9[3] * (float) local9 + arg9[4] * (float) local13;
		@Pc(80) float local80 = arg9[7] * (float) local13 + (float) local9 * arg9[6] + arg9[8] * (float) local17;
		@Pc(100) float local100 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = (float) Math.asin((double) (local59 / local100)) / 3.1415927F + arg0 + 0.5F;
		@Pc(137) float local137;
		if (arg7 == 1) {
			local137 = local111;
			local111 = -local124;
			local124 = local137;
		} else if (arg7 == 2) {
			local124 = -local124;
			local111 = -local111;
		} else if (arg7 == 3) {
			local137 = local111;
			local111 = local124;
			local124 = -local137;
		}
		arg2[1] = local124;
		arg2[0] = local111;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(III)V")
	public static void method5268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static564.anInt9411 == 1) {
			Static517.method7721(arg0, arg1, Static639.aClass3_Sub4_Sub13_4);
		} else if (Static564.anInt9411 == 2) {
			if (Static219.aBoolean285) {
				Static611.method8468(Static166.method2921() + arg0, Static30.method1089() + arg1);
			} else {
				Static611.method8468(arg0, arg1);
			}
		}
		Static639.aClass3_Sub4_Sub13_4 = null;
		Static564.anInt9411 = 0;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIBII)Z")
	public static boolean method5269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static500.aBoolean598 || !Static378.aBoolean511) {
			return false;
		} else if (Static127.anInt2678 < 100) {
			return false;
		} else if (Static69.method1704(arg3, arg1, arg2)) {
			@Pc(31) int local31 = arg3 << Static308.anInt5834;
			@Pc(35) int local35 = arg1 << Static308.anInt5834;
			if (Static34.method1254(Static364.aClass51Array3[arg2].method7835(arg3, arg1), local31, Static384.anInt7200, Static384.anInt7200, arg0, local35)) {
				Static343.anInt6701++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
