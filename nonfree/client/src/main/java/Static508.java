import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public static void method7318() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static338.anInt6508; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static390.anInt7654; local13++) {
				if (Static75.method1597(local9, Static571.aClass182ArrayArrayArray3, local7, local13, true)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
