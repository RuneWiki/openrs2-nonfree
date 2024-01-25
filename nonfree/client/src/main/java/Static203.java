import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static203 {

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_98 = new Class131(36, 7);

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "Z")
	public static boolean aBoolean253 = false;

	@OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
	public static int anInt3696 = 0;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIIII)V")
	public static void method3075(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static83.anInt7380 && Static221.anInt4001 >= arg3 && Static305.anInt5429 <= arg4 && Static212.anInt452 >= arg2) {
			Static268.method4068(arg3, arg0, arg2, arg4, arg1);
		} else {
			Static63.method1108(arg0, arg2, arg1, arg4, arg3);
		}
	}
}
