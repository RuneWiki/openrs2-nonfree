import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
	public static int anInt1578;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
	public static int anInt1579;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!sc;")
	public static Class107 aClass107_446 = Static231.method3737("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "Lclient!sc;")
	public static Class107 aClass107_447 = Static231.method3737("runes");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!jb;)V")
	public static void method1241(@OriginalArg(1) Class28 arg0) {
		Static218.anInt4762 = arg0.method837(Static80.aClass107_514);
		Static47.anInt1068 = arg0.method837(Static180.aClass107_1349);
		Static77.anInt1731 = arg0.method837(Static192.aClass107_1108);
		Static90.anInt1965 = arg0.method837(Static57.aClass107_1340);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/lang/Object;Lclient!ej;)V")
	public static void method1242(@OriginalArg(1) Object arg0, @OriginalArg(2) Class34 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static148.method2431(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
