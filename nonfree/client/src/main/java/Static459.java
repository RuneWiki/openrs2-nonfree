import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static459 {

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "Lclient!sg;")
	public static Class264 aClass264_1;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "F")
	public static float aFloat175;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "Lclient!qi;")
	public static Class240 aClass240_1;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
	public static final int anInt7942 = 1400;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Z")
	public static boolean aBoolean536 = false;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
	public static void method6750(@OriginalArg(1) int arg0) {
		if (Static195.anIntArray315 == null || arg0 > Static195.anIntArray315.length) {
			Static195.anIntArray315 = new int[arg0];
		}
	}
}
