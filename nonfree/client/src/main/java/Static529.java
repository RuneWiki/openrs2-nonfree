import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static529 {

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
	public static int anInt9137;

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "Lclient!of;")
	public static final Class236 aClass236_87 = new Class236(50);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BI)Z")
	public static boolean method7476(@OriginalArg(1) int arg0) {
		if (arg0 == 44 || arg0 == 51 || arg0 == 25 || arg0 == 48 || arg0 == 2) {
			return true;
		} else {
			return arg0 == 45 || arg0 == 1010;
		}
	}
}
