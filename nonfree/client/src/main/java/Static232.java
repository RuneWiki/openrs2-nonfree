import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	public static int anInt4336;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_129 = new Class235(108, 3);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method3509(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static281.anInt4916; local16++) {
			if (arg0.equalsIgnoreCase(Static308.aStringArray24[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aString16);
	}
}
