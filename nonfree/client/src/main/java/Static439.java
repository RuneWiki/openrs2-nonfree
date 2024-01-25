import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static439 {

	@OriginalMember(owner = "client!r", name = "d", descriptor = "Lclient!uf;")
	public static Class331 aClass331_7;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!vn;")
	public static Class352 aClass352_23;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Lclient!kl;")
	public static Class191 aClass191_14;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "I")
	public static int anInt8378 = 0;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "I")
	public static int anInt8379 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIILjava/awt/Canvas;Lclient!fa;Lclient!sea;)Lclient!r;")
	public static synchronized Class78 method6788(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface9 arg3, @OriginalArg(5) Class308 arg4) {
		if (arg1 == 0) {
			return Static364.method6711(arg2, arg3);
		} else if (arg1 == 2) {
			return Static447.method6285(arg3, arg2);
		} else if (arg1 == 1) {
			return Static377.method5459(arg2, arg0, arg3);
		} else if (arg1 == 5) {
			return Static488.method6723(arg0, arg2, arg3, arg4);
		} else if (arg1 == 3) {
			return Static601.method4808(arg3, arg2, arg0, arg4);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
