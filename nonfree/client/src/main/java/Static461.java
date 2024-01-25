import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!rn", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[5];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!gba;Ljava/lang/Object;Z)V")
	public static void method6558(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg0.anEventQueue1.peekEvent() != null; local16++) {
			Static423.method5918(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(44) Exception local44) {
		}
	}
}
