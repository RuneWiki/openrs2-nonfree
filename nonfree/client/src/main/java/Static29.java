import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method769(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static437.anInt7955; local11++) {
			if (arg0.equalsIgnoreCase(Static448.aStringArray27[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static202.aStringArray12[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I")
	public static int method770() {
		return Static240.anInt5322++;
	}
}
