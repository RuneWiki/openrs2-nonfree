import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I")
	public static int method2528() {
		return 46;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
	public static void method2529(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub2_Sub18 local16 = Static508.method6607(arg0, 4);
		local16.method6229();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/Object;Lclient!ew;)V")
	public static void method2530(@OriginalArg(1) Object arg0, @OriginalArg(2) Class99 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static263.method3671(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(39) Exception local39) {
		}
	}
}
