import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static425 {

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	public static int anInt7203;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!f;")
	public static Class10 aClass10_35;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZZZ)V")
	public static void method5943(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static212.anInt4156--;
			if (Static212.anInt4156 == 0) {
				Static279.anIntArray313 = null;
			}
		}
		if (arg0) {
			Static98.anInt2069--;
			if (Static98.anInt2069 == 0) {
				Static341.anIntArray409 = null;
			}
		}
	}
}
