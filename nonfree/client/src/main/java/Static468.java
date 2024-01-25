import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!os", name = "b", descriptor = "Lclient!cp;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!os", name = "e", descriptor = "Lclient!hfa;")
	public static final Class152 aClass152_5 = new Class152(2, 2);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method6727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		Static314.aClass252Array1[Static219.anInt3509++] = new Class252(4, arg0, arg6, arg3, arg3, arg6, arg5, arg2, arg2, arg5, arg1, arg1, arg4, arg4);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IJ)V")
	public static void method6729(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(10) InterruptedException local10) {
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)Z")
	public static boolean method6730(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}
}
