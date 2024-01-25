import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
	public static int anInt956 = 0;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_7 = new Class179(9, 7);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method879(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static313.anInt5409; local9++) {
			if (arg0.equalsIgnoreCase(Static22.aStringArray6[local9])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static452.aClass31_Sub2_Sub1_Sub1_2.aString10);
	}
}
