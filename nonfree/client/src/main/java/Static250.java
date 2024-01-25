import org.openrs2.deob.annotation.OriginalMember;

public final class Static250 {

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
	public static int anInt4000;

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
	public static int anInt4005;

	@OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
	public static int anInt4004 = 1;

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
	public static void method3435() {
		if (Static111.aClass323_1 != null) {
			Static77.aClass252_2 = new Class252();
			Static77.aClass252_2.method5486(Static111.aClass323_1.anInt8662, Static111.aClass323_1, Static111.aClass323_1.aClass271_63.method5972(Static483.anInt7694), Static117.aLong64);
			Static235.aThread2 = new Thread(Static77.aClass252_2, "");
			Static235.aThread2.start();
		}
	}
}
