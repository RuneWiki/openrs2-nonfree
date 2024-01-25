import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "[I")
	public static final int[] anIntArray339 = new int[25];

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Z")
	public static boolean aBoolean304 = true;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	public static final int anInt4349 = 1338;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
	public static int anInt4355 = 0;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLclient!wia;)V")
	public static void method3597(@OriginalArg(1) Class386 arg0) {
		Static45.anInt1109 = arg0.method9213("p11_full");
		Static335.anInt6336 = arg0.method9213("p12_full");
		Static602.anInt10183 = arg0.method9213("b12_full");
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIII[FF[F)V")
	public static void method3605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) float arg8, @OriginalArg(10) float[] arg9) {
		@Pc(9) int local9 = arg3 - arg4;
		@Pc(13) int local13 = arg5 - arg2;
		@Pc(17) int local17 = arg0 - arg1;
		@Pc(38) float local38 = (float) local17 * arg7[2] + (float) local13 * arg7[0] + (float) local9 * arg7[1];
		@Pc(59) float local59 = (float) local17 * arg7[5] + arg7[4] * (float) local9 + (float) local13 * arg7[3];
		@Pc(80) float local80 = arg7[6] * (float) local13 + (float) local9 * arg7[7] + (float) local17 * arg7[8];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local59 * local59 + local38 * local38));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = arg8 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(130) float local130;
		if (arg6 == 1) {
			local130 = local106;
			local106 = -local119;
			local119 = local130;
		} else if (arg6 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg6 == 3) {
			local130 = local106;
			local106 = local119;
			local119 = -local130;
		}
		arg9[1] = local119;
		arg9[0] = local106;
	}
}
