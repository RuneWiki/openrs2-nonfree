import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!g", name = "k", descriptor = "I")
	public static int anInt3303 = 999999;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method2998(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static544.anInt9946; local19++) {
			if (arg0.equalsIgnoreCase(Static636.aStringArray41[local19])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aString4);
	}
}
