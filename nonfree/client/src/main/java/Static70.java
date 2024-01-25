import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static70 {

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "Lclient!ui;")
	public static Class230 aClass230_26;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "J")
	public static long aLong35 = 0L;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
	public static void method1140() {
		if (Static35.aBoolean62) {
			Static71.aClass51_2 = null;
			Static247.aClass51_11 = null;
			Static35.aBoolean62 = false;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZZ)V")
	public static void method1141(@OriginalArg(1) boolean arg0) {
		Static386.anInt6287--;
		if (Static386.anInt6287 == 0) {
			Static68.anIntArray184 = null;
		}
		if (!arg0) {
			return;
		}
		Static310.anInt5274--;
		if (Static310.anInt5274 == 0) {
			Static325.anIntArray638 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BI)Z")
	public static boolean method1142(@OriginalArg(1) int arg0) {
		if (arg0 == 8 || arg0 == 23 || arg0 == 25 || arg0 == 6 || arg0 == 3) {
			return true;
		} else {
			return arg0 == 57 || arg0 == 1012;
		}
	}
}
