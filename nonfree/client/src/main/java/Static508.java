import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static508 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZZ)V")
	public static void method7933(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static435.anInt7920--;
			if (Static435.anInt7920 == 0) {
				Static454.anIntArray310 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static8.anInt147--;
		if (Static8.anInt147 == 0) {
			Static101.anIntArray92 = null;
			return;
		}
	}
}
