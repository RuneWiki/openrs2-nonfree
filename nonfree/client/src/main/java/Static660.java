import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static660 {

	@OriginalMember(owner = "client!wfa", name = "p", descriptor = "Lclient!da;")
	public static Class80 aClass80_13;

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V")
	public static void method9140() {
		for (@Pc(7) int local7 = 0; local7 < Static21.anInt322; local7++) {
			@Pc(13) Class50 local13 = Static377.aClass50Array1[local7];
			if (local13.aByte16 == 3) {
				if (local13.aClass5_Sub16_Sub3_1 == null) {
					local13.anInt847 = Integer.MIN_VALUE;
				} else {
					Static91.aClass5_Sub16_Sub1_1.method2554(local13.aClass5_Sub16_Sub3_1);
				}
			}
		}
	}
}
