import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "Lclient!in;")
	public static Class71 aClass71_19;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public static int anInt4393;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString262 = "white:";

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([ZZII[ILclient!tk;[[F[[FZZI[[II[[III[[FIIZBI)V")
	public static void method3483(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class1_Sub32 arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(7) float[][] arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[][] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int[][] arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) float[][] arg16, @OriginalArg(18) int arg17, @OriginalArg(19) boolean arg18, @OriginalArg(20) byte arg19, @OriginalArg(21) int arg20) {
		@Pc(15) int local15 = (arg8 ? 255 : 0) + (arg17 << 8);
		@Pc(25) int local25 = (arg1 ? 255 : 0) + (arg15 << 8);
		@Pc(35) int local35 = (arg9 ? 255 : 0) + (arg10 << 8);
		@Pc(41) int[] local41 = new int[arg4.length / 2];
		@Pc(51) int local51 = (arg2 << 8) + (arg18 ? 255 : 0);
		for (@Pc(53) int local53 = 0; local53 < local41.length; local53++) {
			@Pc(63) int local63 = arg4[local53 + local53];
			@Pc(75) int[][] local75 = arg13 == null || arg0 == null || !arg0[local53] ? arg11 : arg13;
			@Pc(83) int local83 = arg4[local53 + local53 + 1];
			local41[local53] = Static90.method1586(arg14, false, local75, arg16, arg13, arg19, arg12, local63, arg5, local51, local83, local25, arg7, local15, (float) arg20, local35, arg6);
		}
		arg5.method3948(arg3, arg12, arg14, local41, null, false);
	}
}
