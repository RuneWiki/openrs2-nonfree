import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static487 {

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
	public static int anInt8276 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZZI)V")
	public static void method7200(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static375.anInt6234--;
			if (Static375.anInt6234 == 0) {
				Static66.anIntArray97 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static441.anInt7552--;
		if (Static441.anInt7552 == 0) {
			Static349.anIntArray330 = null;
			return;
		}
	}
}
