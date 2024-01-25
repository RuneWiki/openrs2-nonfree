import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static430 {

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_19 = new Class33(11, -1);

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_101 = new Class186(53, -1);

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "[I")
	public static final int[] anIntArray587 = new int[2048];

	@OriginalMember(owner = "client!sba", name = "g", descriptor = "I")
	public static int anInt7441 = 0;

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V")
	public static void method6344() {
		if (Static51.anInt7926 == 8) {
			Static265.method4401(4);
		} else if (Static51.anInt7926 == 4 || Static51.anInt7926 == 5) {
			Static265.method4401(2);
		} else if (Static51.anInt7926 == 11) {
			Static265.method4401(2);
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IBI)I")
	public static int method6345(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static538.anIntArray787[arg0 & 0x3] : Static280.anIntArray395[arg0 & 0x3];
	}
}
