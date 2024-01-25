import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "l", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array1;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ci;BLjava/lang/Object;)V")
	public static void method230(@OriginalArg(0) Class42 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg0.anEventQueue1.peekEvent() != null; local15++) {
			Static366.method5214(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
