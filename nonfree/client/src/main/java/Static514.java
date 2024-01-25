import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
	public static int anInt9028;

	@OriginalMember(owner = "client!ufa", name = "j", descriptor = "F")
	public static float aFloat190;

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_161 = new Class254(72, 0);

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_162 = new Class254(51, 6);

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZI)Z")
	public static boolean method7576(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(15) Class31 local15 = Static480.aClass57_11.method1469(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local15.method1024(arg0);
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)V")
	public static void method7577() {
		Static307.aClass66_16 = null;
		Static85.anInt2084 = -1;
	}
}
