import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1578(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static450.anInt7035; local11++) {
			if (arg0.equalsIgnoreCase(Static289.aStringArray20[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aString37);
	}
}
