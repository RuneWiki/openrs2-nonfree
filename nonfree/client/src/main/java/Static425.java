import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!oea", name = "o", descriptor = "I")
	public static int anInt6802 = -1;

	@OriginalMember(owner = "client!oea", name = "q", descriptor = "Z")
	public static boolean aBoolean485 = false;

	@OriginalMember(owner = "client!oea", name = "t", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_103 = new Class218(14, 8);

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)V")
	public static void method6144(@OriginalArg(0) int arg0) {
		if (Static46.anInt1071 == 1) {
			Static466.anInt7667 = arg0;
		} else if (Static46.anInt1071 == 2) {
			Static498.anInt10141 = arg0;
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I[FIFIIFII[FII)V")
	public static void method6145(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(5) int local5 = arg5 - arg4;
		@Pc(9) int local9 = arg8 - arg7;
		@Pc(17) int local17 = arg10 - arg0;
		@Pc(38) float local38 = arg1[0] * (float) local17 + arg1[1] * (float) local5 + arg1[2] * (float) local9;
		@Pc(59) float local59 = arg1[5] * (float) local9 + (float) local17 * arg1[3] + arg1[4] * (float) local5;
		@Pc(80) float local80 = (float) local9 * arg1[8] + (float) local17 * arg1[6] + (float) local5 * arg1[7];
		@Pc(97) float local97 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local97 *= arg6;
		}
		@Pc(111) float local111 = local59 + arg3 + 0.5F;
		@Pc(136) float local136;
		if (arg2 == 1) {
			local136 = local97;
			local97 = -local111;
			local111 = local136;
		} else if (arg2 == 2) {
			local111 = -local111;
			local97 = -local97;
		} else if (arg2 == 3) {
			local136 = local97;
			local97 = local111;
			local111 = -local136;
		}
		arg9[0] = local97;
		arg9[1] = local111;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z)I")
	public static int method6146() {
		return Static223.anInt4198;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(II)V")
	public static void method6147(@OriginalArg(1) int arg0) {
		if (!Static524.method7315()) {
			return;
		}
		if (arg0 != Static252.anInt4525) {
			Static342.aString58 = "";
		}
		Static252.anInt4525 = arg0;
		if (Static559.aClass269_1 != null) {
			Static559.aClass269_1.method6697();
			Static559.aClass269_1 = null;
		}
		Static553.method7892(5);
	}
}
