import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_42 = new Class397(139, 6);

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	public static int anInt2752 = 0;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
	public static void method2522() {
		Static175.method2821();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZLjava/lang/Object;Lclient!br;)V")
	public static void method2524(@OriginalArg(1) Object arg0, @OriginalArg(2) Class47 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 50 && arg1.anEventQueue1.peekEvent() != null; local12++) {
			Static550.method7219(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(55) Exception local55) {
		}
	}
}
