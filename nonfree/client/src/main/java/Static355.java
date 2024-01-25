import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
	public static final int anInt5754 = -1;

	@OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
	public static int anInt5755 = 0;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
	public static void method5242() {
		Static553.method7892(11);
		Static91.method1704();
		System.gc();
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
	public static void method5243() {
		if (Static202.aClass147_5 != Static56.aClass147_1) {
			try {
				Static686.method8109(Static200.aClient1, "tbrefresh");
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}
}
