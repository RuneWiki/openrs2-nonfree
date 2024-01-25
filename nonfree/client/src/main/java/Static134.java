import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
	public static int anInt2209;

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "Z")
	public static boolean aBoolean151 = false;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1971(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < Static645.anInt10557; local20++) {
			if (arg0.equalsIgnoreCase(Static167.aStringArray13[local20])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aString44);
	}
}
