import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!uw", name = "B", descriptor = "Z")
	public static boolean aBoolean644 = false;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIII)V")
	public static void method7477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static507.anInt9124 && Static234.anInt4897 >= arg1) {
			@Pc(11) int local11 = Static108.method2267(arg0, Static251.anInt5168, Static341.anInt6481);
			@Pc(17) int local17 = Static108.method2267(arg3, Static251.anInt5168, Static341.anInt6481);
			Static389.method6145(local11, local17, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(BI)V")
	public static void method7478(@OriginalArg(1) int arg0) {
		@Pc(8) Class12_Sub4_Sub1 local8 = Static389.method6156(1, arg0);
		local8.method823();
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "([I[Ljava/lang/Object;B)V")
	public static void method7479(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static519.method7727(arg1, arg0, 0, arg0.length - 1);
	}
}
