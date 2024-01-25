import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static216 {

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
	public static int anInt3440;

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "[I")
	public static final int[] anIntArray272 = new int[1000];

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZLclient!nja;)Z")
	public static boolean method3013(@OriginalArg(1) Class259 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean582) {
			return false;
		} else if (!arg0.method6247(Static90.anInterface26_2)) {
			return false;
		} else if (Static413.aClass218_27.method5095((long) arg0.anInt6972, 0) == null) {
			return Static440.aClass218_32.method5095((long) arg0.anInt6981, 0) == null;
		} else {
			return false;
		}
	}
}
