import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
	public static int anInt9815;

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "Lclient!fw;")
	public static Class120 aClass120_9;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	public static void method8196() {
		if (Static368.aClass349_2 != null) {
			Static368.aClass349_2.method8070();
		}
		if (Static3.aThread1 == null) {
			return;
		}
		while (true) {
			try {
				Static3.aThread1.join();
				return;
			} catch (@Pc(19) InterruptedException local19) {
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)I")
	public static int method8198() {
		return Static244.anInt4841 == 1 ? Static250.anInt8280 : Static312.anInt5689;
	}
}
