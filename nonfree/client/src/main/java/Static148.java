import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static148 {

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!iu;")
	public static Class123 aClass123_1;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public static int anInt2821 = -1;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "[Lclient!ak;")
	public static Class9[] aClass9Array1 = new Class9[50];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIB)V")
	public static void method2187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static399.aClass167_Sub1_1.anInt5565 != 0 && arg3 != 0 && Static18.anInt404 < 50 && arg2 != -1) {
			aClass9Array1[Static18.anInt404++] = new Class9((byte) 2, arg2, arg3, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method2188() {
		Static452.aFont1 = null;
		Static441.anImage3 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
	public static void method2189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static331.anInt5894 <= arg1 - arg2 && Static351.anInt6176 >= arg2 + arg1 && arg0 - arg2 >= Static75.anInt1858 && arg0 + arg2 <= Static175.anInt3399) {
			Static153.method2330(arg0, arg3, arg2, arg1);
		} else {
			Static91.method1530(arg0, arg1, arg3, arg2);
		}
	}
}
