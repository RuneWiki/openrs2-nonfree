import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method8847(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static48.anInt995; local16++) {
			if (arg0.equalsIgnoreCase(Static400.aStringArray55[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aString17);
	}
}
