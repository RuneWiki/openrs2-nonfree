import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static673 {

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
	public static int anInt10817 = -1;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZLjava/lang/Object;Lclient!oq;)V")
	public static void method8995(@OriginalArg(1) Object arg0, @OriginalArg(2) Class268 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static579.method8004(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(42) Exception local42) {
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)V")
	public static void method8996(@OriginalArg(0) int arg0) {
		@Pc(15) Class5_Sub3_Sub17 local15 = Static358.method5408(2, (long) arg0);
		local15.method7288();
	}
}
