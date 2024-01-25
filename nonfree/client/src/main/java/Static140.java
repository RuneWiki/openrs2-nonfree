import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
	public static int anInt2359 = -1;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V")
	public static void method1962() {
		if (Static162.anInt2970 <= 0) {
			Static295.aString39 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Static35.aStringArray21.length; local7++) {
			if (Static35.aStringArray21[local7].startsWith("--> ")) {
				local5++;
				if (local5 == Static162.anInt2970) {
					Static295.aString39 = Static35.aStringArray21[local7].substring(4);
					break;
				}
			}
		}
	}
}
