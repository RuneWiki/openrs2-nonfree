import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!jha", name = "n", descriptor = "I")
	public static int anInt5198;

	@OriginalMember(owner = "client!jha", name = "i", descriptor = "S")
	public static short aShort60 = 205;

	@OriginalMember(owner = "client!jha", name = "c", descriptor = "(I)V")
	public static void method4650() {
		if (Static645.aClass121_1 != null) {
			Static645.aClass121_1.method3462();
		}
		if (Static493.aThread6 == null) {
			return;
		}
		while (true) {
			try {
				Static493.aThread6.join();
				return;
			} catch (@Pc(19) InterruptedException local19) {
			}
		}
	}
}
