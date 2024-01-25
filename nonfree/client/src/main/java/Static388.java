import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!wp", name = "E", descriptor = "Z")
	public static boolean aBoolean471;

	@OriginalMember(owner = "client!wp", name = "x", descriptor = "Z")
	public static boolean aBoolean470 = false;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 >= Static243.anInt4326 && arg8 <= Static235.anInt4193 && arg1 >= Static243.anInt4326 && Static235.anInt4193 >= arg1 && arg5 >= Static243.anInt4326 && arg5 <= Static235.anInt4193 && Static243.anInt4326 <= arg0 && arg0 <= Static235.anInt4193 && Static138.anInt932 <= arg6 && arg6 <= Static40.anInt818 && arg2 >= Static138.anInt932 && Static40.anInt818 >= arg2 && arg3 >= Static138.anInt932 && Static40.anInt818 >= arg3 && arg7 >= Static138.anInt932 && arg7 <= Static40.anInt818) {
			Static160.method2870(arg6, arg1, arg3, arg2, arg4, arg8, arg5, arg0, arg7);
		} else {
			Static43.method731(arg0, arg7, arg1, arg2, arg4, arg3, arg5, arg8, arg6);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BI)V")
	public static void method5657() {
		@Pc(1) Class160 local1 = Static28.aClass160_3;
		synchronized (Static28.aClass160_3) {
			Static28.aClass160_3.method3606(5);
		}
	}
}
