import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
	public static int anInt7347;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "Lclient!el;")
	public static final Class109 aClass109_157 = new Class109(31, -1);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public static void method6333() {
		if (!Static201.aBoolean265) {
			Static201.aBoolean265 = true;
			Static258.aBoolean347 = true;
			Static149.aFloat23 += (12.0F - Static149.aFloat23) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method6334(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static453.anInt7761; local19++) {
			if (arg0.equalsIgnoreCase(Static30.aStringArray4[local19])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static546.aStringArray71[local19])) {
				return true;
			}
		}
		return false;
	}
}
