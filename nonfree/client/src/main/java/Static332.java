import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "Z")
	public static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIZ)V")
	public static void method5029(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			@Pc(19) Class3_Sub34 local19 = Static172.method3123(Static163.aClass375_1, Static288.aClass218_70);
			local19.aClass3_Sub25_Sub1_2.method8649(arg0);
			Static441.method6275(local19);
		} else {
			Static565.method8018(Static45.aClass223_1, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)V")
	public static void method5033() {
		Static274.aClass338_121 = new Class338();
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V")
	public static void method5034() {
		@Pc(1) Class165 local1 = Static312.aClass165_36;
		synchronized (Static312.aClass165_36) {
			Static312.aClass165_36.method4403();
		}
	}
}
