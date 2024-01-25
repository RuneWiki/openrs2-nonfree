import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
	public static void method3417() {
		if (Static133.anInt4003 <= 0) {
			Static356.aString59 = "";
			return;
		}
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < Static514.aStringArray35.length; local10++) {
			if (Static514.aStringArray35[local10].indexOf("--> ") != -1) {
				local8++;
				if (local8 == Static133.anInt4003) {
					Static356.aString59 = Static514.aStringArray35[local10].substring(Static514.aStringArray35[local10].indexOf(">") + 2);
					break;
				}
			}
		}
	}
}
