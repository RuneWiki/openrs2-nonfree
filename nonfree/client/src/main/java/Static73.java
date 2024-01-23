import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "[[Lclient!hl;")
	public static Class62[][] aClass62ArrayArray1;

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
	public static int anInt1538 = 0;

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
	public static int anInt1550 = 0;

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
	public static int anInt1551 = 0;

	@OriginalMember(owner = "client!ff", name = "eb", descriptor = "I")
	public static int anInt1564 = 0;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method1270() {
		if (!Static87.aBoolean139 && Static111.anInt2557 != 2) {
			try {
				Static309.method3982(Static237.aClient1, "tbrefresh");
			} catch (@Pc(21) Throwable local21) {
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1275(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static48.aClass138_1);
		arg0.removeMouseMotionListener(Static48.aClass138_1);
		arg0.removeFocusListener(Static48.aClass138_1);
		Static113.anInt2604 = 0;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public static void method1277() {
		Static191.aClass135_19.method3317();
	}
}
