import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!vu", name = "Y", descriptor = "Lclient!rb;")
	public static final Class245 aClass245_21 = new Class245(1, 2, 2, 0);

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(BI)Z")
	public static boolean method7564(@OriginalArg(1) int arg0) {
		return arg0 == 9 || arg0 == 10 || arg0 == 11;
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V")
	public static void method7565() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static352.aBooleanArray29[local3] = false;
		}
		Static28.anInt525 = -1;
		Static284.anInt9395 = 0;
		Static401.anInt7597 = -1;
		Static537.anInt9322 = 0;
		Static427.anInt7875 = 1;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!kp;I)I")
	public static int method7566(@OriginalArg(0) Class165 arg0) {
		if (arg0 == Static99.aClass165_2) {
			return 7681;
		} else if (Static389.aClass165_3 == arg0) {
			return 8448;
		} else if (Static72.aClass165_1 == arg0) {
			return 34165;
		} else if (Static420.aClass165_4 == arg0) {
			return 260;
		} else if (arg0 == Static512.aClass165_5) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
