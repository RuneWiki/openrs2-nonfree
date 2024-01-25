import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static501 {

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
	public static int anInt8524;

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "Z")
	public static boolean aBoolean615 = false;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZBZ)V")
	public static void method7248(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static191.anInt3130--;
			if (Static191.anInt3130 == 0) {
				Static254.anIntArray246 = null;
			}
		}
		if (arg1) {
			Static542.anInt8892--;
			if (Static542.anInt8892 == 0) {
				Static6.anIntArray6 = null;
			}
		}
	}
}
