import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static208 {

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray12;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!ke;")
	public static Class199 aClass199_11 = new Class199();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
	public static int anInt7849 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILclient!rg;IIILclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static synchronized Class144 method6919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Interface4 arg5, @OriginalArg(7) Canvas arg6) {
		if (arg1 == 0) {
			return Static281.method4723(arg3, arg5, arg4, arg6);
		} else if (arg1 == 2) {
			return Static266.method8781(arg5, arg6, arg4, arg3);
		} else if (arg1 == 1) {
			return Static393.method5986(arg0, arg5, arg6);
		} else if (arg1 == 5) {
			return Static678.method9366(arg6, arg2, arg0, arg5);
		} else if (arg1 == 3) {
			return Static694.method1853(arg2, arg6, arg5, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
