import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!ph;")
	public static Class138 aClass138_68;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString163 = "Use";

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!th;")
	public static Class169 aClass169_133 = new Class169(64);

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
	public static int[] anIntArray446 = new int[500];

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!qf;)I")
	public static int method3832(@OriginalArg(1) int arg0, @OriginalArg(2) Class146 arg1) {
		if (!Static36.method643(arg1).method3243(arg0) && arg1.anObjectArray29 == null) {
			return -1;
		} else if (arg1.anIntArray359 == null || arg1.anIntArray359.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray359[arg0];
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
	public static void method3833() {
		Static270.aClass169_140.method4018();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[[IZIII[[FIBI[[FZ[[F[[I[ILclient!nk;I[ZZIZ)V")
	public static void method3834(@OriginalArg(0) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float[][] arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int[][] arg13, @OriginalArg(15) int[] arg14, @OriginalArg(16) Class1_Sub20 arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean[] arg17, @OriginalArg(19) boolean arg18, @OriginalArg(20) int arg19, @OriginalArg(21) boolean arg20) {
		@Pc(21) int local21 = (arg7 << 8) + (arg2 ? 255 : 0);
		@Pc(32) int local32 = (arg4 << 8) + (arg20 ? 255 : 0);
		@Pc(42) int local42 = (arg3 << 8) + (arg18 ? 255 : 0);
		@Pc(52) int local52 = (arg11 ? 255 : 0) + (arg16 << 8);
		@Pc(58) int[] local58 = new int[arg14.length / 2];
		for (@Pc(60) int local60 = 0; local60 < local58.length; local60++) {
			@Pc(75) int local75 = arg14[local60 + local60];
			@Pc(83) int local83 = arg14[local60 + local60 + 1];
			@Pc(96) int[][] local96 = arg13 == null || arg17 == null || !arg17[local60] ? arg1 : arg13;
			local58[local60] = Static97.method1399(arg8, false, arg6, arg12, (float) arg19, arg15, arg10, local42, local96, arg9, local75, arg13, local83, local52, local32, local21, arg5);
		}
		arg15.method3046(arg0, arg5, arg9, local58, null, false);
	}
}
