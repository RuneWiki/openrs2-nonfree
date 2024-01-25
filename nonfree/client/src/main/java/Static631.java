import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static631 {

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_159 = new Class225(59, 2);

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
	public static void method7521() {
		for (@Pc(7) int local7 = 0; local7 < Static66.anInt1152; local7++) {
			@Pc(20) Class177 local20 = Static461.aClass177Array1[local7];
			if (local20.aByte76 == 3) {
				if (local20.aClass2_Sub23_Sub2_1 == null) {
					local20.anInt4167 = Integer.MIN_VALUE;
				} else {
					Static130.aClass2_Sub23_Sub3_1.method6797(local20.aClass2_Sub23_Sub2_1);
				}
			}
		}
	}
}
