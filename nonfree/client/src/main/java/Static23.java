import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static23 {

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!vg;")
	public static Class339 aClass339_7;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Z")
	public static boolean aBoolean715 = false;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
	public static int anInt8708 = -60;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!tc;II)I")
	public static int method7130(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		if (!Static68.method1694(arg0).method1758(arg1) && arg0.anObjectArray15 == null) {
			return -1;
		} else if (arg0.anIntArray605 == null || arg1 >= arg0.anIntArray605.length) {
			return -1;
		} else {
			return arg0.anIntArray605[arg1];
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method7140() {
		Static146.method8073();
		Static322.aClass15_10 = null;
		Static407.aClass108_7 = null;
		Static173.aClass108_1 = null;
		Static198.aClass167ArrayArray1 = null;
		Static300.aClass108_6 = null;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
	public static void method7146() {
		Static417.aClass37_33 = null;
		Static55.anInt1301 = -1;
	}
}
