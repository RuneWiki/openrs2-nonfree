import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_144 = new Class254(46, 5);

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILjava/lang/Object;Lclient!pe;)V")
	public static void method6734(@OriginalArg(1) Object arg0, @OriginalArg(2) Class246 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static566.method8004(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!co;BLclient!jo;Lclient!jo;Lclient!jo;)Z")
	public static boolean method6735(@OriginalArg(0) Class6_Sub10_Sub1 arg0, @OriginalArg(2) Class168 arg1, @OriginalArg(3) Class168 arg2, @OriginalArg(4) Class168 arg3) {
		Static518.aClass168_119 = arg2;
		Static554.aClass168_120 = arg1;
		Static316.aClass168_75 = arg3;
		Static258.aClass6_Sub10_Sub1_2 = arg0;
		return true;
	}
}
