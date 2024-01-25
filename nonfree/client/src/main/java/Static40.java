import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
	public static int anInt1256 = 0;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_6 = new Class200(44, 2);

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
	public static int anInt1258 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)Lclient!ra;")
	public static Class285 method1341() {
		return new Class285(1, false);
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
	public static void method1343() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static477.aBooleanArray21[local7] = true;
		}
	}
}
