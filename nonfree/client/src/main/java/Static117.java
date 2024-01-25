import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BLjava/lang/Object;Lclient!qg;)V")
	public static void method5171(@OriginalArg(1) Object arg0, @OriginalArg(2) Class286 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static440.method6322(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIII)I")
	public static int method5173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 <= arg1) {
			return arg1 <= arg2 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(IZ)V")
	public static void method5175(@OriginalArg(0) int arg0) {
		Static569.anInt9335 = arg0;
		Static571.aClass69_61.method1905();
	}
}
