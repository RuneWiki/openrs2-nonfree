import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "I")
	public static int anInt5554 = 0;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V")
	public static void method4988() {
		if (Static182.aClass90_1 != null) {
			Static182.aClass90_1.method1826();
		}
		if (Static362.aThread5 == null) {
			return;
		}
		while (true) {
			try {
				Static362.aThread5.join();
				return;
			} catch (@Pc(18) InterruptedException local18) {
			}
		}
	}
}
