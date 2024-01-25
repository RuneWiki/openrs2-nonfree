import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!jaa", name = "s", descriptor = "[I")
	public static int[] anIntArray561;

	@OriginalMember(owner = "client!jaa", name = "r", descriptor = "I")
	public static final int anInt10471 = Static220.method3803(1600);

	@OriginalMember(owner = "client!jaa", name = "u", descriptor = "[Lclient!gg;")
	public static final Class4_Sub3_Sub3_Sub3_Sub2[] aClass4_Sub3_Sub3_Sub3_Sub2Array4 = new Class4_Sub3_Sub3_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZII)Lclient!pka;")
	public static Class289 method8946(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class289 local13 = new Class289();
		local13.anInt8132 = arg0 + 6;
		local13.anInt8117 = -1;
		local13.anInt8126 = arg1 + 5 + 1;
		local13.anInt8133 = -1;
		local13.anIntArrayArray52 = new int[local13.anInt8126][local13.anInt8132];
		local13.method7082();
		return local13;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method8950(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static181.aClass14_Sub26_9.aClass43_Sub11_3.method3829() != 0 && arg5 != 0 && Static208.anInt7849 < 50 && arg0 != -1) {
			Static314.aClass106Array1[Static208.anInt7849++] = new Class106((byte) 2, arg0, arg5, arg4, arg1, arg3, arg2, (Class4_Sub3) null);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method8957(@OriginalArg(0) String arg0) {
		if (Class275.aString86.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class275.aString86.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class275.aString86.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(B)V")
	public static void method8966() {
		Static105.aClient4.method1354();
		Static591.aClass347_3.method8304();
		Static591.aClass347_3.aClass160_243 = null;
		Static132.anInt2081 = 0;
		Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 = 0;
		Static591.aClass347_3.aClass160_242 = null;
		Static591.aClass347_3.aClass160_245 = null;
		Static591.aClass347_3.anInt9630 = 0;
		Static334.method5153();
		Static686.aClass23_3 = null;
		Static67.anInt1036 = 0;
		Static261.anInt4885 = 0;
		Static466.aClass23_1 = null;
		Static293.aClass165Array1 = null;
		Static360.aString77 = null;
		Static187.anInt3100 = 0;
	}
}
