import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "Lclient!pk;")
	public static Class132 aClass132_79;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
	public static int anInt4685;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "Lclient!ka;")
	public static Class8_Sub8_Sub2 aClass8_Sub8_Sub2_3;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "Z")
	public static boolean aBoolean376 = false;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!pf;)V")
	public static void method3534(@OriginalArg(1) Class36_Sub3_Sub1 arg0) {
		@Pc(16) Class8_Sub12 local16 = (Class8_Sub12) Static247.aClass129_29.method3043(Static31.method513(arg0.aString144));
		if (local16 == null) {
			Static213.method3340(arg0.anIntArray308[0], 0, null, arg0, null, arg0.anIntArray310[0], Static34.anInt770);
		} else {
			local16.method1700();
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
	public static void method3535() {
		Static229.aClass61_43.method1378();
		Static65.aClass61_52.method1378();
		Static288.aClass61_12.method1378();
		Static177.aClass61_14.method1378();
	}
}
