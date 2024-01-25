import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
	public static int anInt4934;

	@OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
	public static int anInt4935 = 0;

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(B)V")
	public static void method4254() {
		for (@Pc(12) int local12 = 0; local12 < Static521.anInt9062; local12++) {
			@Pc(18) Class161 local18 = Static360.aClass161Array1[local12];
			if (local18.aByte46 == 3) {
				if (local18.aClass6_Sub10_Sub2_3 == null) {
					local18.anInt4835 = Integer.MIN_VALUE;
				} else {
					Static35.aClass6_Sub10_Sub3_1.method4742(local18.aClass6_Sub10_Sub2_3);
				}
			}
		}
	}
}
