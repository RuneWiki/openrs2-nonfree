import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "D")
	public static double aDouble9;

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
	public static int anInt4545;

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "Z")
	public static boolean aBoolean336 = false;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILclient!ha;IIIIIILclient!gea;IZ)V")
	public static void method4164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class3_Sub11_Sub8 arg9, @OriginalArg(10) int arg10) {
		if (arg3 < arg8 && arg8 < arg3 + arg6 && arg10 - 13 < arg0 && arg10 + 3 > arg0) {
			arg5 = arg4;
		}
		@Pc(44) String local44 = Static53.method1179(arg9);
		Static303.aClass69_6.method8859(arg5, arg10, Static502.anIntArray361, Static561.aClass33Array25, arg3 + 3, local44);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)I")
	public static int method4167(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
