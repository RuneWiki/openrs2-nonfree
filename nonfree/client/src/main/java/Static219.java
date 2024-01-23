import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!sk", name = "P", descriptor = "[I")
	public static int[] anIntArray384 = new int[5];

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZB)V")
	public static void method3585(@OriginalArg(0) boolean arg0) {
		if (Static51.aBoolean83 != arg0) {
			Static51.aBoolean83 = arg0;
			Static160.method2813();
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLclient!gf;I)V")
	public static void method3586(@OriginalArg(1) Class1_Sub2_Sub7 arg0) {
		arg0.method1923(Static208.aString316, Static200.anInt4411 / 2, Static251.anInt5352 / 2 - 26, 16777215, -1);
		@Pc(54) int local54 = Static251.anInt5352 / 2 - 18;
		Static189.method3185(Static200.anInt4411 / 2 - 152, local54, 304, 34, 9179409);
		Static189.method3185(Static200.anInt4411 / 2 - 151, local54 + 1, 302, 32, 0);
		Static189.method3193(Static200.anInt4411 / 2 - 150, local54 - -2, Static16.anInt4949 * 3, 30, 9179409);
		Static189.method3193(Static16.anInt4949 * 3 + Static200.anInt4411 / 2 - 150, local54 + 2, 300 - Static16.anInt4949 * 3, 30, 0);
		arg0.method1923(Static175.aString270, Static200.anInt4411 / 2, Static251.anInt5352 / 2 + 4, 16777215, -1);
	}
}
