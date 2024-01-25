import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static462 {

	@OriginalMember(owner = "client!rp", name = "I", descriptor = "I")
	public static int anInt7550;

	@OriginalMember(owner = "client!rp", name = "M", descriptor = "Lclient!om;")
	public static Class246 aClass246_218;

	@OriginalMember(owner = "client!rp", name = "P", descriptor = "I")
	public static int anInt7556;

	@OriginalMember(owner = "client!rp", name = "K", descriptor = "I")
	public static int anInt7552 = -1;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)I")
	public static int method6403(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
