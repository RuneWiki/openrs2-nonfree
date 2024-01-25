import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static456 {

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
	public static int anInt7940 = 0;

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "Lclient!mf;")
	public static final Class184 aClass184_37 = new Class184();

	@OriginalMember(owner = "client!ss", name = "k", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_402 = new Class305(4, -2);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)Z")
	public static boolean method6996(@OriginalArg(1) int arg0) {
		if (arg0 == 19 || arg0 == 8 || arg0 == 2 || arg0 == 57 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 44 || arg0 == 1010;
		}
	}
}
