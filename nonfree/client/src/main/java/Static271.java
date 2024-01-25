import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!jg", name = "P", descriptor = "Ljava/lang/Object;")
	public static Object anObject25;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "(I)V")
	public static void method7757() {
		if (Static42.aClass252_1 != null) {
			Static42.aClass252_1.method6252();
		}
		if (Static152.aThread3 == null) {
			return;
		}
		while (true) {
			try {
				Static152.aThread3.join();
				return;
			} catch (@Pc(19) InterruptedException local19) {
			}
		}
	}
}
