import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
	public static int anInt5095 = 0;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V")
	public static void method4664() {
		if (Static616.aClass339_1 != null) {
			Static616.aClass339_1.method8117();
		}
		if (Static203.aThread7 == null) {
			return;
		}
		while (true) {
			try {
				Static203.aThread7.join();
				return;
			} catch (@Pc(23) InterruptedException local23) {
			}
		}
	}
}
