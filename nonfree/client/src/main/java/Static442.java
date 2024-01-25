import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "F")
	public static float aFloat194;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "[I")
	public static int[] anIntArray535;

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "Lclient!eq;")
	public static Class97 aClass97_110;

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "Lclient!naa;")
	public static Class2_Sub35 aClass2_Sub35_1;

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_124 = new Class274(27, -1);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ID)V")
	public static void method6556(@OriginalArg(1) double arg0) {
		if (Static274.aDouble11 == arg0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(29) int local29 = (int) (Math.pow((double) local17 / 255.0D, arg0) * 255.0D);
			Static503.anIntArray586[local17] = local29 > 255 ? 255 : local29;
		}
		Static274.aDouble11 = arg0;
	}
}
