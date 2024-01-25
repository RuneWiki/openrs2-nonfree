import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public static int anInt7774 = 1;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public static void method6188(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static445.aBooleanArray151[arg0]) {
			Static434.aClass38_89.method1027(arg0);
			Static122.aClass240ArrayArray2[arg0] = null;
			Static110.aClass240ArrayArray1[arg0] = null;
			Static445.aBooleanArray151[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static349.method5093(arg1, arg0) | Static266.method4280(arg1, arg0) | Static395.method5579(arg0, arg1)) & Static78.method1655(arg1, arg0);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIILclient!ib;)V")
	public static void method6190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub1 arg3) {
		@Pc(4) Class162 local4 = Static408.method5689(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub1_2 = arg3;
		}
	}
}
