import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Lclient!nm;")
	public static Class119 aClass119_77;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Z")
	public static boolean aBoolean404;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
	public static int anInt4468;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIBLclient!nm;)Lclient!le;")
	public static Class1_Sub5_Sub6_Sub1 method3828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class119 arg2) {
		return Static114.method2083(arg1, arg2, arg0) ? Static16.method241() : null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[[I[I[[FILclient!hg;I[[FLclient!ni;I[[F)V")
	public static void method3830(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class73 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[][] arg7, @OriginalArg(8) Class118 arg8, @OriginalArg(10) float[][] arg9) {
		@Pc(37) int[] local37 = new int[arg2.length / 2];
		for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
			@Pc(54) int local54 = arg2[local39 + local39];
			@Pc(62) int local62 = arg2[local39 + local39 + 1];
			@Pc(69) int local69;
			if (arg4 == 1) {
				local69 = local54;
				local54 = local62;
				local62 = 128 - local69;
			} else if (arg4 == 2) {
				local62 = 128 - local62;
				local54 = 128 - local54;
			} else if (arg4 == 3) {
				local69 = local54;
				local54 = 128 - local62;
				local62 = local69;
			}
			@Pc(131) float local131;
			@Pc(147) float local147;
			@Pc(139) float local139;
			if (local54 == 0 && local62 == 0) {
				local139 = arg7[arg0][arg6];
				local147 = arg9[arg0][arg6];
				local131 = arg3[arg0][arg6];
			} else if (local54 == 128 && local62 == 0) {
				local131 = arg3[arg0 + 1][arg6];
				local139 = arg7[arg0 + 1][arg6];
				local147 = arg9[arg0 + 1][arg6];
			} else if (local54 == 128 && local62 == 128) {
				local131 = arg3[arg0 + 1][arg6 + 1];
				local147 = arg9[arg0 + 1][arg6 + 1];
				local139 = arg7[arg0 + 1][arg6 + 1];
			} else if (local54 == 0 && local62 == 128) {
				local147 = arg9[arg0][arg6 + 1];
				local131 = arg3[arg0][arg6 + 1];
				local139 = arg7[arg0][arg6 + 1];
			} else {
				local131 = arg3[arg0][arg6];
				local139 = arg7[arg0][arg6];
				local147 = arg9[arg0][arg6];
				@Pc(214) float local214 = (float) local62 / 128.0F;
				@Pc(219) float local219 = (float) local54 / 128.0F;
				@Pc(233) float local233 = local147 + (arg9[arg0 + 1][arg6] - local147) * local219;
				@Pc(247) float local247 = local131 + local219 * (arg3[arg0 + 1][arg6] - local131);
				@Pc(262) float local262 = local139 + local219 * (arg7[arg0 + 1][arg6] - local139);
				@Pc(270) float local270 = arg3[arg0][arg6 + 1];
				@Pc(278) float local278 = arg7[arg0][arg6 + 1];
				@Pc(295) float local295 = local270 + local219 * (arg3[arg0 + 1][arg6 + 1] - local270);
				@Pc(303) float local303 = arg9[arg0][arg6 + 1];
				@Pc(319) float local319 = local303 + local219 * (arg9[arg0 + 1][arg6 + 1] - local303);
				local147 = local233 + local214 * (local319 - local233);
				local131 = local247 + (local295 - local247) * local214;
				@Pc(353) float local353 = local278 + local219 * (arg7[arg0 + 1][arg6 + 1] - local278);
				local139 = local262 + local214 * (local353 - local262);
			}
			@Pc(419) int local419 = local54 + (arg0 << 7);
			@Pc(426) int local426 = (arg6 << 7) + local62;
			@Pc(434) int local434 = Static241.method3834(arg6, local62, arg1, local54, arg0);
			local37[local39] = arg5.method1946(arg8, local419, local434, local426, local139, local131, local147);
		}
		arg5.method1947(local37);
	}
}
