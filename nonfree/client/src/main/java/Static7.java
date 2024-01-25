import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Lclient!wo;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_5 = new Class123(99, 3);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!k;Ljava/lang/Object;)V")
	public static void method63(@OriginalArg(1) Class168 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg0.anEventQueue1.peekEvent() != null; local16++) {
			Static373.method5240(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(44) Exception local44) {
		}
	}
}
