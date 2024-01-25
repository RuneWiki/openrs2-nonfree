import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static390 {

	@OriginalMember(owner = "client!pea", name = "H", descriptor = "I")
	public static int anInt7315;

	@OriginalMember(owner = "client!pea", name = "K", descriptor = "I")
	public static int anInt7318;

	@OriginalMember(owner = "client!pea", name = "G", descriptor = "Z")
	public static boolean aBoolean536 = false;

	@OriginalMember(owner = "client!pea", name = "L", descriptor = "J")
	public static long aLong165 = -1L;

	@OriginalMember(owner = "client!pea", name = "M", descriptor = "S")
	public static short aShort76 = 32767;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BI)Z")
	public static boolean method6166(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2 || arg0 == 4;
	}

	@OriginalMember(owner = "client!pea", name = "i", descriptor = "(I)V")
	public static void method6167() {
		Static242.aClass245_39.method6079();
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(BI)Z")
	public static boolean method6168(@OriginalArg(1) int arg0) {
		if (arg0 == 12 || arg0 == 25 || arg0 == 15 || arg0 == 22 || arg0 == 10) {
			return true;
		} else {
			return arg0 == 23 || arg0 == 1012;
		}
	}
}
