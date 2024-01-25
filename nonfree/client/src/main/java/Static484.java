import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "[I")
	public static int[] anIntArray561;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "[I")
	public static final int[] anIntArray560 = new int[2];

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Z")
	public static boolean aBoolean511 = false;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(III)I")
	public static int method6533(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static523.method7011(arg1 + 91923, arg0 + 45365, 4) + (Static523.method7011(arg1 + 37821, arg0 + 10294, 2) - 128 >> 1) + (Static523.method7011(arg1, arg0, 1) - 128 >> 2) - 128;
		local47 = (int) ((double) local47 * 0.3D) + 35;
		if (local47 < 10) {
			local47 = 10;
		} else if (local47 > 60) {
			local47 = 60;
		}
		return local47;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([BBIII[BIII)V")
	public static void method6535(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(25) int local25 = -(arg3 & 0x3);
		for (@Pc(28) int local28 = -arg1; local28 < 0; local28++) {
			@Pc(36) int local36;
			for (@Pc(32) int local32 = local10; local32 < 0; local32++) {
				local36 = arg6++;
				arg0[local36] = (byte) (arg0[local36] - arg4[arg5++]);
				@Pc(49) int local49 = arg6++;
				arg0[local49] = (byte) (arg0[local49] - arg4[arg5++]);
				@Pc(62) int local62 = arg6++;
				arg0[local62] = (byte) (arg0[local62] - arg4[arg5++]);
				@Pc(75) int local75 = arg6++;
				arg0[local75] = (byte) (arg0[local75] - arg4[arg5++]);
			}
			for (@Pc(96) int local96 = local25; local96 < 0; local96++) {
				local36 = arg6++;
				arg0[local36] = (byte) (arg0[local36] - arg4[arg5++]);
			}
			arg6 += arg7;
			arg5 += arg2;
		}
	}
}
