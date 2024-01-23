import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "Lclient!ha;")
	public static Class1_Sub2_Sub9 aClass1_Sub2_Sub9_2;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public static int anInt3984;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
	public static int anInt3982 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ[Z[[F[[IZILclient!kd;Z[[FI[IZIBII[[IZI[[F)V")
	public static void method3219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean[] arg2, @OriginalArg(4) float[][] arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1_Sub20 arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int arg13, @OriginalArg(15) byte arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) int[][] arg17, @OriginalArg(19) boolean arg18, @OriginalArg(20) int arg19, @OriginalArg(21) float[][] arg20) {
		@Pc(16) int local16 = (arg6 << 8) + (arg18 ? 255 : 0);
		@Pc(26) int local26 = (arg12 ? 255 : 0) + (arg0 << 8);
		@Pc(36) int local36 = (arg5 ? 255 : 0) + (arg16 << 8);
		@Pc(46) int local46 = (arg15 << 8) + (arg8 ? 255 : 0);
		@Pc(52) int[] local52 = new int[arg11.length / 2];
		for (@Pc(54) int local54 = 0; local54 < local52.length; local54++) {
			@Pc(67) int local67 = arg11[local54 + local54 + 1];
			@Pc(79) int[][] local79 = arg4 == null || arg2 == null || !arg2[local54] ? arg17 : arg4;
			@Pc(86) int local86 = arg11[local54 + local54];
			local52[local54] = Static143.method2586(arg9, arg20, arg10, arg3, arg4, false, local86, (float) arg19, arg13, arg7, local36, local67, arg14, local79, local16, local46, local26);
		}
		arg7.method2362(arg1, arg10, arg13, local52, null, false);
	}
}
