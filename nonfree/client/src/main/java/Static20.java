import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static20 {

	@OriginalMember(owner = "client!at", name = "c", descriptor = "I")
	public static int anInt1992 = -1;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
	public static void method1511() {
		Static421.anInt7104 = 0;
		Static416.anInt7072 = -1;
		Static454.anInt7591 = -1;
		Static52.anInt1390 = -1;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(JB)V")
	public static void method1515(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static316.method4648(arg0 - 1L);
			Static316.method4648(1L);
		} else {
			Static316.method4648(arg0);
		}
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(I)Z")
	public static boolean method1516() {
		return Static83.anInt1893 > 0;
	}
}
