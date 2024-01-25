import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
	public static int anInt9279;

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "Z")
	public static boolean aBoolean632 = false;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILclient!sca;)V")
	public static void method7899(@OriginalArg(1) Class302 arg0) {
		if (arg0.anInt8816 == 5 && arg0.anInt8877 != -1) {
			Static605.method8492(arg0, Static162.aClass100_7);
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
	public static void method7900() {
		@Pc(12) Class6_Sub6 local12;
		for (local12 = (Class6_Sub6) Static26.aClass8_7.method149(); local12 != null; local12 = (Class6_Sub6) Static26.aClass8_7.method155()) {
			Static111.method1826(local12, false);
		}
		for (local12 = (Class6_Sub6) Static69.aClass8_9.method149(); local12 != null; local12 = (Class6_Sub6) Static69.aClass8_9.method155()) {
			Static111.method1826(local12, true);
		}
	}
}
