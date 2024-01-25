import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static306 {

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	public static int anInt4217;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_136 = new Class221(87, -2);

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_137 = new Class221(4, -1);

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	public static int anInt4214 = 99;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_138 = new Class221(75, 5);

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public static int anInt4216 = 0;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 >= Static108.anInt2266 && Static205.anInt4504 >= arg3 && arg7 >= Static108.anInt2266 && arg7 <= Static205.anInt4504 && Static108.anInt2266 <= arg1 && arg1 <= Static205.anInt4504 && arg2 >= Static108.anInt2266 && arg2 <= Static205.anInt4504 && arg8 >= Static197.anInt4298 && Static38.anInt553 >= arg8 && Static197.anInt4298 <= arg6 && Static38.anInt553 >= arg6 && arg4 >= Static197.anInt4298 && arg4 <= Static38.anInt553 && Static197.anInt4298 <= arg5 && Static38.anInt553 >= arg5) {
			Static318.method5284(arg3, arg6, arg2, arg7, arg0, arg4, arg1, arg8, arg5);
		} else {
			Static151.method3020(arg1, arg5, arg6, arg4, arg0, arg3, arg8, arg2, arg7);
		}
	}
}
