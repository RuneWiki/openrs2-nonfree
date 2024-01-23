import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!te", name = "r", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!te", name = "w", descriptor = "[I")
	public static int[] anIntArray600;

	@OriginalMember(owner = "client!te", name = "y", descriptor = "Lclient!ak;")
	public static Class7 aClass7_205;

	@OriginalMember(owner = "client!te", name = "C", descriptor = "[I")
	public static int[] anIntArray601;

	@OriginalMember(owner = "client!te", name = "G", descriptor = "I")
	public static int anInt5155;

	@OriginalMember(owner = "client!te", name = "S", descriptor = "[I")
	public static int[] anIntArray602 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([[F[[FIZLclient!rc;IIIB[[IBBIII[[F)V")
	public static void method3972(@OriginalArg(0) float[][] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class1_Sub25 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int[][] arg9, @OriginalArg(11) byte arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) float[][] arg14) {
		@Pc(7) int local7 = (arg6 << 8) + 255;
		@Pc(17) int local17 = (arg11 << 8) + 255;
		@Pc(21) int[] local21 = Static116.anIntArrayArray20[arg8];
		@Pc(27) int local27 = (arg13 << 8) + 255;
		@Pc(33) int local33 = (arg7 << 8) + 255;
		@Pc(35) int[] local35 = null;
		@Pc(45) int[] local45 = new int[local21.length >> 1];
		@Pc(47) int local47;
		for (local47 = 0; local47 < local45.length; local47++) {
			local45[local47] = Static55.method931(arg10, arg0, false, local27, local33, local21[local47 + local47 + 1], arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, local21[local47 + local47], arg4);
		}
		if (arg3) {
			@Pc(191) int local191;
			if (arg8 == 1) {
				local35 = new int[6];
				local47 = Static55.method931(arg10, arg0, true, local27, local33, 128, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 64, arg4);
				local191 = Static55.method931(arg10, arg0, true, local27, local33, 64, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 128, arg4);
				local35[0] = local191;
				local35[1] = local47;
				local35[3] = local47;
				local35[4] = local45[0];
				local35[2] = local45[2];
				local35[5] = local45[2];
			} else if (arg8 == 2) {
				local35 = new int[6];
				local47 = Static55.method931(arg10, arg0, true, local27, local33, 128, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 128, arg4);
				local191 = Static55.method931(arg10, arg0, true, local27, local33, 0, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 64, arg4);
				local35[0] = local45[0];
				local35[1] = local191;
				local35[5] = local45[0];
				local35[4] = local45[1];
				local35[2] = local47;
				local35[3] = local47;
			} else if (arg8 == 3) {
				local47 = Static55.method931(arg10, arg0, true, local27, local33, 128, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 0, arg4);
				local35 = new int[6];
				local191 = Static55.method931(arg10, arg0, true, local27, local33, 0, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 64, arg4);
				local35[1] = local45[1];
				local35[4] = local191;
				local35[3] = local47;
				local35[0] = local45[2];
				local35[2] = local47;
				local35[5] = local45[2];
			} else if (arg8 == 4) {
				local35 = new int[3];
				local47 = Static55.method931(arg10, arg0, true, local27, local33, 128, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 0, arg4);
				local35[1] = local47;
				local35[0] = local45[3];
				local35[2] = local45[0];
			} else if (arg8 == 5) {
				local35 = new int[3];
				local47 = Static55.method931(arg10, arg0, true, local27, local33, 128, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 128, arg4);
				local35[1] = local47;
				local35[0] = local45[2];
				local35[2] = local45[3];
			} else if (arg8 == 6) {
				local47 = Static55.method931(arg10, arg0, true, local27, local33, 0, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 128, arg4);
				local191 = Static55.method931(arg10, arg0, true, local27, local33, 128, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 128, arg4);
				local35 = new int[] { local45[3], local47, local191, local191, local45[0], local45[3] };
			} else if (arg8 == 7) {
				local35 = new int[6];
				local47 = Static55.method931(arg10, arg0, true, local27, local33, 128, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 0, arg4);
				local191 = Static55.method931(arg10, arg0, true, local27, local33, 0, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 128, arg4);
				local35[0] = local45[1];
				local35[1] = local191;
				local35[5] = local45[1];
				local35[2] = local47;
				local35[4] = local45[2];
				local35[3] = local47;
			} else if (arg8 == 8) {
				local35 = new int[3];
				local47 = Static55.method931(arg10, arg0, true, local27, local33, 0, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 0, arg4);
				local35[0] = local45[3];
				local35[2] = local45[4];
				local35[1] = local47;
			} else if (arg8 == 9) {
				local47 = Static55.method931(arg10, arg0, true, local27, local33, 64, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 128, arg4);
				local35 = new int[15];
				local191 = Static55.method931(arg10, arg0, true, local27, local33, 32, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 96, arg4);
				@Pc(715) int local715 = Static55.method931(arg10, arg0, true, local27, local33, 0, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 64, arg4);
				local35[0] = local191;
				local35[14] = local715;
				local35[2] = local45[4];
				local35[9] = local191;
				local35[10] = local45[2];
				local35[12] = local191;
				local35[4] = local45[4];
				local35[3] = local191;
				local35[1] = local47;
				local35[11] = local45[1];
				local35[13] = local45[1];
				local35[7] = local45[3];
				local35[6] = local191;
				local35[8] = local45[2];
				local35[5] = local45[3];
			} else if (arg8 == 10) {
				local35 = new int[9];
				local47 = Static55.method931(arg10, arg0, true, local27, local33, 128, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 0, arg4);
				local35[7] = local47;
				local35[4] = local47;
				local35[0] = local45[2];
				local35[6] = local45[4];
				local35[1] = local47;
				local35[5] = local45[4];
				local35[2] = local45[3];
				local35[3] = local45[3];
				local35[8] = local45[0];
			} else if (arg8 == 11) {
				local35 = new int[12];
				local47 = Static55.method931(arg10, arg0, true, local27, local33, 64, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 0, arg4);
				local191 = Static55.method931(arg10, arg0, true, local27, local33, 64, arg14, arg5, 0.0F, arg1, local17, arg9, null, local7, arg2, 128, arg4);
				local35[7] = local191;
				local35[0] = local45[3];
				local35[5] = local47;
				local35[1] = local47;
				local35[3] = local45[3];
				local35[10] = local45[1];
				local35[2] = local45[0];
				local35[4] = local45[2];
				local35[11] = local191;
				local35[8] = local47;
				local35[6] = local45[2];
				local35[9] = local45[2];
			}
		}
		arg4.method3601(arg12, arg5, arg2, local45, local35, false);
	}
}
