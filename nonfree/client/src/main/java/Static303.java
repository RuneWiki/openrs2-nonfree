import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	public static int anInt3065;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	public static int anInt3066 = 0;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
	public static int anInt3067 = 0;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
	public static void method2701() {
		@Pc(5) Class154 local5 = Static154.aClass154_55;
		synchronized (Static154.aClass154_55) {
			Static154.aClass154_55.method4212();
		}
		local5 = Static13.aClass154_5;
		synchronized (Static13.aClass154_5) {
			Static13.aClass154_5.method4212();
		}
		@Pc(35) Class85 local35 = Static234.aClass85_1;
		synchronized (Static234.aClass85_1) {
			Static234.aClass85_1.method2013();
		}
	}
}
