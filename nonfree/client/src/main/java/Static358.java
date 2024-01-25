import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!la;Lclient!la;II)V")
	public static void method5877(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class196 arg1) {
		Static626.aClass196_130 = arg0;
		Static383.aClass196_75 = arg1;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILclient!hga;Ljava/lang/Object;)V")
	public static void method5878(@OriginalArg(1) Class138 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static258.method4293(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(45) Exception local45) {
		}
	}
}
