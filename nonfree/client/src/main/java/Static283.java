import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
	public static int anInt5554;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
	public static int anInt5551 = 0;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!bk;ILjava/lang/Object;)V")
	public static void method4211(@OriginalArg(0) Class17 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 50 && arg0.anEventQueue1.peekEvent() != null; local17++) {
			Static162.method2645(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
