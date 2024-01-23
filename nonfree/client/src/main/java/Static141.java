import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
	public static int anInt2720;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!ie;")
	public static Class78 aClass78_4;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!rn;")
	public static Class155 aClass155_61;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
	public static volatile int anInt2718 = 0;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Z")
	public static boolean aBoolean201 = true;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2394(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < Static285.anInt5735; local17++) {
			if (arg0.equalsIgnoreCase(Static286.aStringArray37[local17])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static136.aClass10_Sub5_Sub1_1.aString124)) {
			return true;
		} else {
			return false;
		}
	}
}
