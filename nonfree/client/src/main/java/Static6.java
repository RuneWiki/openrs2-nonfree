import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "[I")
	public static int[] anIntArray10;

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "Lclient!dn;")
	public static Class56 aClass56_4;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_6 = new Class92(19, 0);

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "Z")
	public static boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V")
	public static void method142(@OriginalArg(1) int arg0) {
		Static336.anInt6190 = -1;
		if (arg0 == 37) {
			Static210.aFloat98 = 3.0F;
		} else if (arg0 == 50) {
			Static210.aFloat98 = 4.0F;
		} else if (arg0 == 75) {
			Static210.aFloat98 = 6.0F;
		} else if (arg0 == 100) {
			Static210.aFloat98 = 8.0F;
		} else if (arg0 == 200) {
			Static210.aFloat98 = 16.0F;
		}
		Static336.anInt6190 = -1;
	}
}
