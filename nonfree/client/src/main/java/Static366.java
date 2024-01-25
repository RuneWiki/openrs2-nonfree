import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "Lclient!fj;")
	public static Class116 aClass116_2;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
	public static int anInt6507;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
	public static int anInt6510;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "[Lclient!ae;")
	public static final Class7_Sub1[] aClass7_Sub1Array2 = new Class7_Sub1[37];

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!kj;ILjava/lang/Object;)V")
	public static void method5464(@OriginalArg(0) Class202 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg0.anEventQueue1.peekEvent() != null; local15++) {
			Static127.method1985(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(43) Exception local43) {
		}
	}
}
