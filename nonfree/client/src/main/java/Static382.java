import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!on", name = "d", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_97 = new Class276(35, -1);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method6136(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static346.anInt7032; local14++) {
			if (arg0.equalsIgnoreCase(Static520.aStringArray34[local14])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static443.aClass2_Sub2_Sub1_Sub1_2.aString23);
	}
}
