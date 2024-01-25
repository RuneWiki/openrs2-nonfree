import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	public static void method145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static524.method7315()) {
			return;
		}
		if (Static252.anInt4525 != arg1) {
			Static342.aString58 = "";
		}
		Static41.anInt961 = arg0;
		Static252.anInt4525 = arg1;
		Static553.method7892(6);
	}
}
