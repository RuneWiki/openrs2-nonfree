import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	public static int anInt6199;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!ni;")
	public static Class223 aClass223_65;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Z")
	public static boolean aBoolean477 = false;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method5180() {
		Static456.anInt8191 = 0;
		Static369.anInt7055++;
		Static125.anInt3107 = 0;
		Static449.method6831();
		Static580.method8047();
		Static329.method5523();
		@Pc(21) boolean local21 = false;
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static456.anInt8191; local23++) {
			local29 = Static413.anIntArray383[local23];
			@Pc(36) Class6_Sub42 local36 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local29);
			@Pc(39) Class9_Sub4_Sub2_Sub1_Sub1 local39 = local36.aClass9_Sub4_Sub2_Sub1_Sub1_1;
			if (Static199.aBoolean358 && Static540.method7635(local29)) {
				Static549.method8087();
			}
			if (Static369.anInt7055 != local39.anInt4333) {
				if (local39.aClass158_1.method4869()) {
					Static626.method8555(local39);
				}
				local39.method1994((Class158) null);
				local36.method8792();
				local21 = true;
			}
		}
		if (local21) {
			Static337.anInt6701 = Static461.aClass380_35.method8756();
			Static461.aClass380_35.method8749(Static303.aClass6_Sub42Array1);
		}
		if (Static84.aClass6_Sub8_Sub1_1.anInt10061 != Static125.anInt3103) {
			throw new RuntimeException("gnp1 pos:" + Static84.aClass6_Sub8_Sub1_1.anInt10061 + " psize:" + Static125.anInt3103);
		}
		for (local29 = 0; local29 < Static288.anInt5977; local29++) {
			if (Static461.aClass380_35.method8747((long) Static562.anIntArray508[local29]) == null) {
				throw new RuntimeException("gnp2 pos:" + local29 + " size:" + Static288.anInt5977);
			}
		}
		if (Static337.anInt6701 - Static288.anInt5977 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static337.anInt6701 - Static288.anInt5977));
		}
		for (@Pc(170) int local170 = 0; local170 < Static337.anInt6701; local170++) {
			if (Static369.anInt7055 != Static303.aClass6_Sub42Array1[local170].aClass9_Sub4_Sub2_Sub1_Sub1_1.anInt4333) {
				throw new RuntimeException("gnp4 uk:" + Static303.aClass6_Sub42Array1[local170].aClass9_Sub4_Sub2_Sub1_Sub1_1.anInt4299);
			}
		}
	}
}
