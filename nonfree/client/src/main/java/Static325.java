import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
	public static int anInt5063 = 0;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method4000(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static151.aStringArray46.length; local12++) {
			if (Static151.aStringArray46[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
