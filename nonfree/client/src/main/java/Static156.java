import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static156 {

	@OriginalMember(owner = "client!fha", name = "Sc", descriptor = "Lclient!tf;")
	public static Class325 aClass325_1;

	@OriginalMember(owner = "client!fha", name = "pd", descriptor = "I")
	public static int anInt2730;

	@OriginalMember(owner = "client!fha", name = "Qd", descriptor = "I")
	public static int anInt2751;

	@OriginalMember(owner = "client!fha", name = "cd", descriptor = "Z")
	public static boolean aBoolean236 = false;

	@OriginalMember(owner = "client!fha", name = "d", descriptor = "(Z)[Lclient!mha;")
	public static Class228[] method2370() {
		return new Class228[] { Static588.aClass228_10, Static509.aClass228_9, Static274.aClass228_12, Static408.aClass228_7, Static146.aClass228_1, Static159.aClass228_2, Static599.aClass228_11, Static472.aClass228_8, Static289.aClass228_6, Static639.aClass228_13 };
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIBIII)V")
	public static void method2379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static514.anInt8603 && Static487.anInt8320 >= arg2 && arg3 >= Static304.anInt4824 && arg0 <= Static231.anInt3977) {
			Static446.method6621(arg2, arg3, arg0, arg4, arg1);
		} else {
			Static200.method3152(arg0, arg1, arg2, arg3, arg4);
		}
	}
}
