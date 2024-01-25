import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hha", name = "j", descriptor = "I")
	public static int anInt4122;

	@OriginalMember(owner = "client!hha", name = "k", descriptor = "I")
	public static int anInt4123;

	@OriginalMember(owner = "client!hha", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)V")
	public static void method3421() {
		if (Static292.aClass360_1 != null) {
			Static292.aClass360_1.method8666();
		}
		if (Static278.aThread1 == null) {
			return;
		}
		while (true) {
			try {
				Static278.aThread1.join();
				return;
			} catch (@Pc(18) InterruptedException local18) {
			}
		}
	}
}
