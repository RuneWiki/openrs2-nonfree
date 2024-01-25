import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
	public static int anInt6349;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)V")
	public static void method5310(@OriginalArg(1) int arg0) {
		Static118.method1904();
		Static389.method5359();
		Static301.method2521(true, arg0);
		Static46.method4884(Static241.aClass158_55, Static44.aClass28_14, Static76.aClass158_17);
		Static339.method4786(Static44.aClass28_14, Static76.aClass158_17);
		Static111.method1828(Static205.aClass12Array3);
		Static255.method3943();
		Static207.method3239();
		if (Static54.anInt1123 == 10) {
			Static65.method1236(false);
		} else if (Static54.anInt1123 == 30) {
			Static260.method4007(25);
		} else if (Static54.anInt1123 == 5) {
			Static446.method5953(Static76.aClass158_17, Static44.aClass28_14);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIII)V")
	public static void method5311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class6_Sub1_Sub12 local8 = Static449.method5975(arg1, 9);
		local8.method3043();
		local8.anInt3403 = arg0;
		local8.anInt3397 = arg2;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)Z")
	public static boolean method5312(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
