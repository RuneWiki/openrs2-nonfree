import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "Lclient!tb;")
	public static Class189 aClass189_2;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)Lclient!cf;")
	public static Class36 method1242() {
		try {
			return (Class36) Class.forName("Class36_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)V")
	public static void method1243() {
		Static300.method5057(Static16.aClass157_14);
		Static197.aClass2_Sub12_Sub2_2.method3147(0);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZII)V")
	public static void method1244(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static51.aClass37_1 = Static67.method3720(Static95.aCanvas3, Static62.aClass179_2, Static181.anInt4031 * 2, Static358.anInterface3_7, arg1);
		} else {
			if (arg0) {
				Static51.aClass37_1 = Static67.method3720(Static95.aCanvas3, Static62.aClass179_2, 0, Static358.anInterface3_7, 0);
				Static51.aClass37_1.method3689(0);
				@Pc(24) Class82 local24 = Static145.method2833(Static283.aClass104_148, Static213.anInt4642);
				@Pc(33) Class71 local33 = Static51.aClass37_1.method3659(local24, Static368.method833(Static338.aClass104_184, Static213.anInt4642));
				Static105.method2078(local33, Static281.aClass140_135.method4155(Static239.anInt2803), true);
				Static51.aClass37_1.method3742();
				Static162.method3263();
				Static51.aClass37_1.method3699();
			}
			try {
				Static51.aClass37_1 = Static67.method3720(Static95.aCanvas3, Static62.aClass179_2, Static181.anInt4031 * 2, Static358.anInterface3_7, arg1);
			} catch (@Pc(60) Throwable local60) {
				Static51.aClass37_1 = Static67.method3720(Static95.aCanvas3, Static62.aClass179_2, 0, Static358.anInterface3_7, 0);
				arg1 = 0;
			}
		}
		if (Static51.aClass37_1.method3733()) {
			@Pc(89) Class2_Sub18 local89 = Static51.aClass37_1.method3732();
			Static51.aClass37_1.method3657(local89);
		}
		Static114.anInt2421 = arg1;
		Static114.method2244();
		if (!Static51.aClass37_1.method3683()) {
			Static323.anInt6326 = 1;
		}
		Static51.aClass37_1.method3650(Static323.anInt6326);
		Static51.aClass37_1.method3678(0);
		Static297.aClass38_4 = Static51.aClass37_1.method3736();
		Static218.aClass38_3 = Static51.aClass37_1.method3736();
		@Pc(123) int local123 = (int) ((double) Static66.anInt1177 * 34.46D);
		if (Static51.aClass37_1.method3727()) {
			local123 += 128;
		}
		Static51.aClass37_1.method3703(50, local123);
		Static51.aClass37_1.method3715(!Static205.aBoolean391);
		if (Static51.aClass37_1.method3663()) {
			Static140.method2722(Static363.aBoolean618);
		}
		Static304.aBoolean539 = !Static230.method4872();
		Static347.method5643(Static12.anInt213 >> 3, Static51.aClass37_1, Static66.anInt1177 >> 3);
		Static225.method4189();
		Static128.aBoolean263 = false;
	}
}
