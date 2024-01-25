import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static132 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!vl;")
	public static Class263 aClass263_32;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!du;")
	public static final Class62 aClass62_37 = new Class62(0, 2);

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
	public static void method5176() {
		Static178.method2589(Static216.aClass242_58);
		Static426.aClass1_Sub19_Sub2_2.method2934(Static208.method3017());
		Static426.aClass1_Sub19_Sub2_2.method2930(Static192.anInt3532);
		Static426.aClass1_Sub19_Sub2_2.method2930(Static40.anInt597);
		Static426.aClass1_Sub19_Sub2_2.method2934(Static126.aClass19_Sub1_1.anInt4218);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method5178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 + arg5 > arg3 && arg6 + arg3 > arg4) {
			return arg7 < arg0 + arg2 && arg1 + arg7 > arg2;
		} else {
			return false;
		}
	}
}
