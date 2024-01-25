import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public static void method2129(@OriginalArg(1) int arg0) {
		Static555.anInt9375 = arg0;
		@Pc(7) Class87 local7 = Static163.aClass87_242;
		synchronized (Static163.aClass87_242) {
			Static163.aClass87_242.method1801();
		}
		local7 = Static213.aClass87_107;
		synchronized (Static213.aClass87_107) {
			Static213.aClass87_107.method1801();
		}
	}
}
