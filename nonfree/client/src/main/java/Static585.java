import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!uu", name = "w", descriptor = "[I")
	public static int[] anIntArray616;

	@OriginalMember(owner = "client!uu", name = "y", descriptor = "F")
	public static float aFloat278;

	@OriginalMember(owner = "client!uu", name = "z", descriptor = "D")
	public static double aDouble64;

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
	public static void method8330() {
		Static164.anInt8855 = 0;
		Static43.anInt770 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static158.anInt3847; local15++) {
			@Pc(21) int local21 = Static87.anInt2288 * local15;
			for (@Pc(23) int local23 = 0; local23 < Static87.anInt2288; local23++) {
				@Pc(29) int local29 = local23 + local21;
				Static235.anInterface16Array1[local29].method8389(local23 * Static246.anInt5504, Static584.anInt9762 * local15, Static246.anInt5504, Static584.anInt9762, true);
			}
		}
	}
}
