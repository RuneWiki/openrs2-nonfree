import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ft", name = "U", descriptor = "[Lclient!uo;")
	public static Class41_Sub1[] aClass41_Sub1Array1 = new Class41_Sub1[0];

	@OriginalMember(owner = "client!ft", name = "db", descriptor = "Ljava/lang/String;")
	public static String aString29 = "";

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/Object;ILclient!dq;)V")
	public static void method1944(@OriginalArg(0) Object arg0, @OriginalArg(2) Class51 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg1.anEventQueue1.peekEvent() != null; local19++) {
			Static83.method1499(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V")
	public static void method1945() {
		for (@Pc(15) Class3_Sub14 local15 = (Class3_Sub14) Static305.aClass193_49.method4519(); local15 != null; local15 = (Class3_Sub14) Static305.aClass193_49.method4525()) {
			if (local15.anInt1626 == -1) {
				local15.anInt1628 = 0;
				if (local15.anInt1627 >= 0 && local15.anInt1629 >= 0 && Static373.anInt6324 > local15.anInt1627 && local15.anInt1629 < Static291.anInt5062) {
					Static344.method4827(local15);
				}
			} else {
				local15.method6288();
			}
		}
	}
}
