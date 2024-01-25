import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!uu", name = "R", descriptor = "Lclient!lda;")
	public static Class173 aClass173_2;

	@OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
	public static final int anInt8731 = 1339;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!uf;BLjava/lang/Object;)V")
	public static void method7322(@OriginalArg(0) Class283 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg0.anEventQueue1.peekEvent() != null; local15++) {
			Static379.method5233(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
