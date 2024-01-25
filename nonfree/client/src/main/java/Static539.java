import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!up", name = "j", descriptor = "I")
	public static int anInt9099;

	@OriginalMember(owner = "client!up", name = "o", descriptor = "[I")
	public static final int[] anIntArray693 = new int[4096];

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(B)V")
	public static void method7485() {
		if (Static384.aClass202Array1 == null) {
			Static384.aClass202Array1 = Static280.method4435();
			Static118.aClass202_1 = Static384.aClass202Array1[0];
			Static23.aLong15 = Static184.method3422();
		}
		if (Static466.aClass276_1 == null) {
			Static262.method4306();
		}
		@Pc(23) Class202 local23 = Static118.aClass202_1;
		@Pc(28) int local28 = Static482.method6707();
		if (Static118.aClass202_1 == local23) {
			Static578.aString97 = Static118.aClass202_1.aClass198_62.method4407(Static56.anInt953);
			if (Static118.aClass202_1.aBoolean394) {
				Static101.anInt2483 = local28 * (Static118.aClass202_1.anInt5248 - Static118.aClass202_1.anInt5246) / 100 + Static118.aClass202_1.anInt5246;
			}
			if (Static118.aClass202_1.aBoolean395) {
				Static578.aString97 = Static578.aString97 + Static101.anInt2483 + "%";
			}
		} else if (Static118.aClass202_1 == Static280.aClass202_23) {
			Static466.aClass276_1 = null;
			Static33.method600(3);
		} else {
			Static578.aString97 = local23.aClass198_63.method4407(Static56.anInt953);
			Static101.anInt2483 = local23.anInt5248;
			if (Static118.aClass202_1.aBoolean395) {
				Static578.aString97 = Static578.aString97 + local23.anInt5248 + "%";
			}
			if (Static118.aClass202_1.aBoolean394 || local23.aBoolean394) {
				Static23.aLong15 = Static184.method3422();
			}
		}
		if (Static466.aClass276_1 == null) {
			return;
		}
		Static466.aClass276_1.method6057(Static578.aString97, Static118.aClass202_1, Static101.anInt2483, Static23.aLong15);
		if (Static346.anInterface7Array1 == null) {
			return;
		}
		for (@Pc(133) int local133 = Static194.anInt4184 + 1; local133 < Static346.anInterface7Array1.length; local133++) {
			if (Static346.anInterface7Array1[local133].method7202() >= 100 && local133 - 1 == Static194.anInt4184 && Static598.anInt9831 >= 1 && Static466.aClass276_1.method6053()) {
				try {
					Static346.anInterface7Array1[local133].method7204();
				} catch (@Pc(169) Exception local169) {
					Static346.anInterface7Array1 = null;
					return;
				}
				Static466.aClass276_1.method6055(Static346.anInterface7Array1[local133]);
				Static194.anInt4184++;
				if (Static346.anInterface7Array1.length - 1 <= Static194.anInt4184 && Static346.anInterface7Array1.length > 1) {
					Static194.anInt4184 = Static457.aClass166_1.method3995() ? 0 : -1;
				}
			}
		}
		return;
	}
}
