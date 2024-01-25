import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "[Lclient!cg;")
	public static Class53[] aClass53Array1;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	public static int anInt8004;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method6526(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static107.anInt1861; local11++) {
			if (arg0.equalsIgnoreCase(Static394.aStringArray33[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aString75);
	}
}
