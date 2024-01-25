import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static646 {

	@OriginalMember(owner = "client!za", name = "l", descriptor = "Lclient!ee;")
	public static final Class79 aClass79_25 = new Class79();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I")
	public static int method8795(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method8796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 == arg0) {
			Static470.method7004(arg3, arg6, arg5, arg4, arg0, arg1);
		} else if (arg5 - arg0 >= Static309.anInt6227 && arg5 + arg0 <= Static7.anInt464 && Static633.anInt10644 <= arg3 - arg2 && arg3 + arg2 <= Static389.anInt7300) {
			Static393.method6212(arg6, arg5, arg1, arg0, arg3, arg4, arg2);
		} else {
			Static126.method2628(arg3, arg1, arg5, arg2, arg4, arg0, arg6);
		}
	}
}
