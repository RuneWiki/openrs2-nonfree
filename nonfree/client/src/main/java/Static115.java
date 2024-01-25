import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static115 {

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "Lclient!nc;")
	public static Class227 aClass227_1;

	@OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
	public static int anInt2494;

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "[I")
	public static final int[] anIntArray102 = new int[3];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLclient!bm;)Z")
	public static boolean method2359(@OriginalArg(1) Class36 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean88) {
			return false;
		} else if (!arg0.method1413(Static110.anInterface1_2)) {
			return false;
		} else if (Static291.aClass280_25.method7107((long) arg0.anInt1354) == null) {
			return Static524.aClass280_38.method7107((long) arg0.anInt1351) == null;
		} else {
			return false;
		}
	}
}
