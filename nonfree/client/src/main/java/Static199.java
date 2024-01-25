import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static199 {

	@OriginalMember(owner = "client!ica", name = "Oc", descriptor = "[S")
	public static final short[] aShortArray68 = new short[] { 44, 8, 48, 51, 50, 57, 17, 23 };

	@OriginalMember(owner = "client!ica", name = "j", descriptor = "(I)V")
	public static void method3701() {
		Static461.method6784();
		Static443.method6413();
	}

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "(II)Z")
	public static boolean method3703(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method3709(@OriginalArg(1) Class9 arg0) {
		if (Static25.aBoolean94) {
			Static458.method6748(arg0);
		} else {
			Static445.method6419(arg0);
		}
	}
}
