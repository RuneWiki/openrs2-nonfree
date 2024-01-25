import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "S")
	public static short aShort104 = 32767;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!ufa;ILjava/lang/Object;)V")
	public static void method7090(@OriginalArg(0) Class326 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static1.method125(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(39) Exception local39) {
		}
	}
}
