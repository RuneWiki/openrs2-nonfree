import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static336 {

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
	public static int anInt6503 = -1;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString255 = null;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!lm;Lclient!lm;)V")
	public static void method5589(@OriginalArg(1) Class134 arg0, @OriginalArg(2) Class134 arg1) {
		Static91.aClass134_40 = arg1;
		Static41.aClass134_20 = arg0;
		Static91.aClass134_40.method3020(36);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIIII)V")
	public static void method5590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static60.anInt1399 <= arg0 && Static138.anInt6334 >= arg1 && arg2 >= Static41.anInt1131 && Static165.anInt3409 >= arg5) {
			if (arg3 == 1) {
				Static276.method4931(arg4, arg0, arg5, arg1, arg2);
			} else {
				Static173.method3110(arg5, arg0, arg2, arg4, arg3, arg1);
			}
		} else if (arg3 == 1) {
			Static235.method5303(arg2, arg0, arg4, arg1, arg5);
		} else {
			Static262.method1692(arg1, arg4, arg0, arg5, arg3, arg2);
		}
	}
}
