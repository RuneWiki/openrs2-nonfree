import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static21 {

	@OriginalMember(owner = "client!aw", name = "E", descriptor = "I")
	public static int anInt339;

	@OriginalMember(owner = "client!aw", name = "x", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!aw", name = "D", descriptor = "Lclient!sa;")
	public static final Class228 aClass228_1 = new Class228();

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIII)V")
	public static void method338(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 - arg0 >= Static281.anInt4757 && Static457.anInt7264 >= arg2 + arg0 && arg3 - arg0 >= Static142.anInt2163 && arg0 + arg3 <= Static182.anInt3402) {
			Static438.method5499(arg4, arg1, arg0, arg5, arg2, arg3);
		} else {
			Static135.method1729(arg1, arg2, arg4, arg0, arg3, arg5);
		}
	}
}
