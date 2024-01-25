import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "Lclient!rt;")
	public static Class6_Sub42 aClass6_Sub42_3;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_140 = new Class254(47, 5);

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "Lclient!oh;")
	public static final Class238 aClass238_3 = new Class238();

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
	public static int anInt7667 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method6401(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static241.anInt4921; local11++) {
			if (arg0.equalsIgnoreCase(Static381.aStringArray42[local11])) {
				return local11;
			}
		}
		return -1;
	}
}
