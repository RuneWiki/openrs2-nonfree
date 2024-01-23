import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "Z")
	public static boolean aBoolean278 = false;

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "[Lclient!tc;")
	public static Class167[] aClass167Array1 = new Class167[14];

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "[I")
	public static int[] anIntArray331 = new int[5];

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
	public static void method3258() {
		Static88.aClass169_57.method4014();
		Static267.aClass169_139.method4014();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIILclient!h;IJ)Z")
	public static boolean method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class22 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static300.method4500(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)V")
	public static void method3261(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub1_Sub2 local14 = Static46.method824(11, arg0);
		local14.method299();
	}
}
