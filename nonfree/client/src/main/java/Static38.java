import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static38 {

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "Lclient!haa;")
	public static Class153_Sub1 aClass153_Sub1_1;

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "[I")
	public static final int[] anIntArray36 = new int[3];

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V")
	public static void method658() {
		Static405.aClass391_35.method9276(0);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(III)Z")
	public static boolean method660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static432.method6393(arg0, arg1) | Static196.method2833(arg0, arg1) | Static114.method1638(arg1, arg0)) & Static22.method317(arg1, arg0);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method661(@OriginalArg(0) Class57 arg0) {
		if (Static526.aBoolean669) {
			Static580.method8318(arg0);
		} else {
			Static125.method1770(arg0);
		}
	}
}
