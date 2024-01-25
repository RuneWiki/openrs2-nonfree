import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ica", name = "y", descriptor = "Lclient!in;")
	public static Class157 aClass157_116;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method4437(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static604.anInt10620; local11++) {
			if (arg0.equalsIgnoreCase(Static314.aStringArray29[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aString64);
	}
}
