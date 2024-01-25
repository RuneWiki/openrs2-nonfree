import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static362 {

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Z")
	public static boolean aBoolean542;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pe;ILjava/awt/Canvas;Lclient!e;II)Lclient!oa;")
	public static synchronized Class15 method5283(@OriginalArg(0) Class254 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return Static65.method1642(arg2, arg1, false);
		} else if (arg4 == 2) {
			return Static177.method3150(arg1, arg2);
		} else if (arg4 == 4) {
			return Static65.method1642(arg2, arg1, true);
		} else if (arg4 == 1) {
			return Static556.method8096(arg3, arg2, arg1);
		} else if (arg4 == 5) {
			return Static152.method2970(arg3, arg2, arg1, arg0);
		} else if (arg4 == 3) {
			return Static610.method8098(arg2, arg1, arg0, arg3);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([ILclient!ji;IIIZ)Lclient!ch;")
	public static Class11_Sub2_Sub1 method5320(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class15_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1.aBoolean457 || Static282.method4863(arg3) && Static282.method4863(arg2)) {
			return new Class11_Sub2_Sub1(arg1, 3553, arg3, arg2, false, arg0);
		} else if (arg1.aBoolean446) {
			return new Class11_Sub2_Sub1(arg1, 34037, arg3, arg2, false, arg0);
		} else {
			return new Class11_Sub2_Sub1(arg1, arg3, arg2, Static178.method3152(arg3), Static178.method3152(arg2), arg0);
		}
	}
}
