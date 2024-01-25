import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static466 {

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "Lclient!gaa;")
	public static Class102 aClass102_4;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "Lclient!gg;")
	public static final Class106 aClass106_1 = new Class106();

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_118 = new Class306("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIII)V")
	public static void method6541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static358.anInt8908 <= arg4 - arg1 && Static216.anInt4203 >= arg1 + arg4 && Static99.anInt1988 <= arg3 - arg1 && Static205.anInt4042 >= arg1 + arg3) {
			Static131.method2184(arg1, arg3, arg2, arg4, arg0, arg5);
		} else {
			Static109.method3478(arg3, arg0, arg1, arg4, arg5, arg2);
		}
	}
}
