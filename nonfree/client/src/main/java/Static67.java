import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!de", name = "w", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!de", name = "y", descriptor = "[[Lclient!qc;")
	public static Class206[][] aClass206ArrayArray1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ID)V")
	public static void method1123(@OriginalArg(1) double arg0) {
		if (arg0 == Static96.aDouble1) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(24) int local24 = (int) (Math.pow((double) local12 / 255.0D, arg0) * 255.0D);
			Static91.anIntArray130[local12] = local24 > 255 ? 255 : local24;
		}
		Static96.aDouble1 = arg0;
	}
}
