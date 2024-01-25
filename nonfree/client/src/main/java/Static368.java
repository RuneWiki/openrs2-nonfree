import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Lclient!uc;")
	public static Class347 aClass347_2;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
	public static int anInt6667;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)I")
	public static int method5559(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!ha;IIIIILclient!qf;IIII)V")
	public static void method5562(@OriginalArg(1) Class65 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class5_Sub3_Sub15 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg9 > arg10 && arg10 + arg1 > arg9 && arg4 - 13 < arg8 && arg4 + 3 > arg8) {
			arg2 = arg3;
		}
		@Pc(51) String local51 = Static545.method7614(arg6);
		Static231.aClass73_8.method5784(local51, arg2, Static364.aClass50Array8, arg10 + 3, arg4, Static5.anIntArray4);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	public static void method5563(@OriginalArg(1) int arg0) {
		if (Static107.method2043(arg0)) {
			Static179.method2887(Static648.aClass345ArrayArray2[arg0], -1);
		}
	}
}
