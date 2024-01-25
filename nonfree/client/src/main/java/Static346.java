import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!om", name = "Q", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_277 = new Class296(69, 3);

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/Object;Lclient!gaa;)V")
	public static void method5259(@OriginalArg(1) Object arg0, @OriginalArg(2) Class102 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg1.anEventQueue1.peekEvent() != null; local19++) {
			Static209.method3565(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
