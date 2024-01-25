import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
	public static int anInt5269;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	public static int anInt5270;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_84 = new Class242(9, 7);

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_199 = new Class67(90, 3);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public static void method4204() {
		@Pc(10) Class77 local10 = Static85.aClass77_52;
		synchronized (Static85.aClass77_52) {
			Static85.aClass77_52.method1395();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)Z")
	public static boolean method4209(@OriginalArg(0) int arg0) {
		if (arg0 == 45 || arg0 == 60 || arg0 == 4 || arg0 == 18 || arg0 == 1001) {
			return true;
		} else {
			return arg0 == 8 || arg0 == 1002;
		}
	}
}
