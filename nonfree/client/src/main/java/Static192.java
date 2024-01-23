import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "[I")
	public static int[] anIntArray318;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "Lclient!am;")
	public static Class9 aClass9_2;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
	public static int anInt3794 = 0;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
	public static void method3015() {
		anIntArray318 = null;
		aClass9_2 = null;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([[F[[ILclient!wc;ILclient!sj;I[[FB[[F[II)V")
	public static void method3016(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class179 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class155 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(8) float[][] arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		@Pc(11) int[] local11 = new int[arg8.length / 2];
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(27) int local27 = arg8[local13 + local13];
			@Pc(35) int local35 = arg8[local13 + local13 + 1];
			@Pc(47) int local47;
			if (arg3 == 1) {
				local47 = local27;
				local27 = local35;
				local35 = 128 - local47;
			} else if (arg3 == 2) {
				local27 = 128 - local27;
				local35 = 128 - local35;
			} else if (arg3 == 3) {
				local47 = local27;
				local27 = 128 - local35;
				local35 = local47;
			}
			@Pc(135) float local135;
			@Pc(125) float local125;
			@Pc(115) float local115;
			if (local27 == 0 && local35 == 0) {
				local125 = arg6[arg5][arg9];
				local135 = arg7[arg5][arg9];
				local115 = arg0[arg5][arg9];
			} else if (local27 == 128 && local35 == 0) {
				local125 = arg6[arg5 + 1][arg9];
				local135 = arg7[arg5 + 1][arg9];
				local115 = arg0[arg5 + 1][arg9];
			} else if (local27 == 128 && local35 == 128) {
				local115 = arg0[arg5 + 1][arg9 + 1];
				local125 = arg6[arg5 + 1][arg9 + 1];
				local135 = arg7[arg5 + 1][arg9 + 1];
			} else if (local27 == 0 && local35 == 128) {
				local115 = arg0[arg5][arg9 + 1];
				local135 = arg7[arg5][arg9 + 1];
				local125 = arg6[arg5][arg9 + 1];
			} else {
				local135 = arg7[arg5][arg9];
				local115 = arg0[arg5][arg9];
				@Pc(162) float local162 = (float) local27 / 128.0F;
				@Pc(170) float local170 = arg0[arg5][arg9 + 1];
				local125 = arg6[arg5][arg9];
				@Pc(191) float local191 = local135 + local162 * (arg7[arg5 + 1][arg9] - local135);
				@Pc(199) float local199 = arg6[arg5][arg9 + 1];
				@Pc(207) float local207 = arg7[arg5][arg9 + 1];
				@Pc(224) float local224 = local199 + (arg6[arg5 + 1][arg9 + 1] - local199) * local162;
				@Pc(229) float local229 = (float) local35 / 128.0F;
				@Pc(243) float local243 = local125 + local162 * (arg6[arg5 + 1][arg9] - local125);
				@Pc(259) float local259 = local207 + (arg7[arg5 + 1][arg9 + 1] - local207) * local162;
				local135 = local191 + (local259 - local191) * local229;
				@Pc(283) float local283 = local115 + (arg0[arg5 + 1][arg9] - local115) * local162;
				local125 = local243 + local229 * (local224 - local243);
				@Pc(308) float local308 = local170 + local162 * (arg0[arg5 + 1][arg9 + 1] - local170);
				local115 = local283 + (local308 - local283) * local229;
			}
			@Pc(396) int local396 = (arg5 << 7) + local27;
			@Pc(404) int local404 = Static52.method863(arg5, local27, arg9, arg1, local35);
			@Pc(410) int local410 = local35 + (arg9 << 7);
			local11[local13] = arg2.method4303(arg4, local396, local404, local410, local115, local135, local125);
		}
		arg2.method4301(local11);
	}
}
