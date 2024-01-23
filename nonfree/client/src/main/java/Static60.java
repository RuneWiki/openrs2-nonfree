import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	public static int anInt1298;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
	public static int anInt1301;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "Lclient!tk;")
	public static Class159 aClass159_5;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
	public static int anInt1300 = 0;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
	public static int anInt1302 = -1;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "F")
	public static float aFloat13 = 0.0F;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString51 = "flash2:";

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([Z[[F[[F[I[[IIIBIZZII[[IZIIZI[[FLclient!td;I)V")
	public static void method940(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int[][] arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) int arg15, @OriginalArg(17) boolean arg16, @OriginalArg(18) int arg17, @OriginalArg(19) float[][] arg18, @OriginalArg(20) Class8_Sub29 arg19, @OriginalArg(21) int arg20) {
		@Pc(12) int local12 = (arg8 << 8) + (arg14 ? 255 : 0);
		@Pc(23) int local23 = (arg11 << 8) + (arg16 ? 255 : 0);
		@Pc(38) int local38 = (arg12 << 8) + (arg9 ? 255 : 0);
		@Pc(53) int local53 = (arg10 ? 255 : 0) + (arg17 << 8);
		@Pc(59) int[] local59 = new int[arg3.length / 2];
		for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
			@Pc(71) int local71 = arg3[local61 + local61];
			@Pc(84) int[][] local84 = arg4 == null || arg0 == null || !arg0[local61] ? arg13 : arg4;
			@Pc(92) int local92 = arg3[local61 + local61 + 1];
			local59[local61] = Static22.method400(local38, local53, (float) arg5, arg2, arg19, arg6, local12, local92, local71, arg4, local84, arg7, false, arg15, arg1, arg18, local23);
		}
		arg19.method3784(arg20, arg15, arg6, local59, null, false);
	}
}
