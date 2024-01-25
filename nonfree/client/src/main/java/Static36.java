import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Lclient!ra;")
	public static Class170 aClass170_6;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
	public static volatile int anInt923 = -1;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
	public static void method859() {
		Static292.method4956();
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	public static void method861() {
		for (@Pc(7) int local7 = 0; local7 < Static63.anInt1486; local7++) {
			@Pc(18) int local18 = Static331.anIntArray535[local7];
			@Pc(22) Class25_Sub1_Sub1_Sub2 local22 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local18];
			if (local22 != null) {
				Static344.method957(local22.aClass216_1.anInt6566, local22);
			}
		}
	}
}
