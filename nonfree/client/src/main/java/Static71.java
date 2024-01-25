import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cga", name = "E", descriptor = "[I")
	public static final int[] anIntArray108 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!cga", name = "F", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(II)V")
	public static void method1265(@OriginalArg(1) int arg0) {
		@Pc(14) Class6_Sub2_Sub9 local14 = Static144.method2332(14, arg0);
		local14.method3722();
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZZ)V")
	public static void method1267(@OriginalArg(0) boolean arg0) {
		Static232.method4003(Static554.anInt1822, arg0, Static321.anInt6137, Static356.anInt6630);
	}
}
