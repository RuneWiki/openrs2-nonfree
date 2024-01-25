import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static262 {

	@OriginalMember(owner = "client!ju", name = "C", descriptor = "I")
	public static int anInt4615 = 0;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZZI)V")
	public static void method4019(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		Static570.anInt9273 = 3;
		Static61.anInt1462 = arg1;
		Static323.method4687(Static399.aClass51_4.anInt1589, Static399.aClass51_4.aString8);
		if (arg0) {
			Static259.method3987(false, "", "");
		} else {
			Static214.method3432();
			Static259.method3987(false, Static501.aString78, Static423.aString64);
		}
	}
}
