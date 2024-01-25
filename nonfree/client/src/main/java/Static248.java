import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	public static int anInt4508;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "[I")
	public static final int[] anIntArray223 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)Lclient!cc;")
	public static Class47 method4099() {
		try {
			return new Class47_Sub3();
		} catch (@Pc(16) Throwable local16) {
			try {
				return (Class47) Class.forName("Class47_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(22) Throwable local22) {
				return new Class47_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
	public static void method4100() {
		if (Static299.aClass347_1 != null) {
			Static299.aClass347_1.method8225();
		}
		if (Static37.aThread1 == null) {
			return;
		}
		while (true) {
			try {
				Static37.aThread1.join();
				return;
			} catch (@Pc(22) InterruptedException local22) {
			}
		}
	}
}
