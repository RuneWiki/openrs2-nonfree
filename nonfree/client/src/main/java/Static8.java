import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "[I")
	public static final int[] anIntArray50 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
	public static int anInt492 = -1;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public static void method372() {
		if (Static34.anInt588 != -1) {
			Static205.method3761(Static34.anInt588, -1, -1, false);
			Static34.anInt588 = -1;
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
	public static void method375() {
		if (Static306.aClass49_7 != Static348.aClass49_8) {
			try {
				Static406.method5995(Static12.aClient1, "tbrefresh");
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}
}
