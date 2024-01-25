import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static344 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_104 = new Class6(97, 4);

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	public static int anInt6400 = 2;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIIIIB)V")
	public static void method5544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg8 >= Static95.anInt2358 && Static299.anInt4491 >= arg8 && arg1 >= Static95.anInt2358 && Static299.anInt4491 >= arg1 && arg4 >= Static95.anInt2358 && Static299.anInt4491 >= arg4 && arg6 >= Static95.anInt2358 && arg6 <= Static299.anInt4491 && arg3 >= Static92.anInt2338 && Static341.anInt6379 >= arg3 && Static92.anInt2338 <= arg7 && Static341.anInt6379 >= arg7 && arg2 >= Static92.anInt2338 && arg2 <= Static341.anInt6379 && Static92.anInt2338 <= arg0 && arg0 <= Static341.anInt6379) {
			Static352.method3440(arg8, arg2, arg3, arg4, arg6, arg0, arg5, arg7, arg1);
		} else {
			Static538.method7878(arg7, arg6, arg8, arg1, arg2, arg0, arg4, arg5, arg3);
		}
	}
}
