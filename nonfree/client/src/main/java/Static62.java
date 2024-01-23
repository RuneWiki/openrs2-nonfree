import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!oj;")
	public static Class131 aClass131_1;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "[Lclient!co;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "[B")
	public static byte[] aByteArray10;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	public static int anInt1221 = 7759444;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString75 = "shake:";

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!pm;Ljava/lang/Object;Z)V")
	public static void method1013(@OriginalArg(0) Class139 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 50 && arg0.anEventQueue1.peekEvent() != null; local12++) {
			Static303.method4677(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
