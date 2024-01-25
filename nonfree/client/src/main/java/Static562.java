import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static562 {

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
	public static int anInt9125 = 0;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "J")
	public static long aLong403 = 0L;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
	public static int anInt9126 = -1;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
	public static int anInt9127 = 0;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
	public static int anInt9131 = 0;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZLclient!kt;)Z")
	public static boolean method7553(@OriginalArg(1) Class196 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean393) {
			return false;
		} else if (!arg0.method4334(Static313.anInterface15_2)) {
			return false;
		} else if (Static106.aClass356_8.method7796((long) arg0.anInt5164) == null) {
			return Static268.aClass356_22.method7796((long) arg0.anInt5173) == null;
		} else {
			return false;
		}
	}
}
