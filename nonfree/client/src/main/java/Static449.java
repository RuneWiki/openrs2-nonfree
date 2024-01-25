import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "D")
	public static double aDouble11;

	@OriginalMember(owner = "client!pw", name = "n", descriptor = "[F")
	public static final float[] aFloatArray67 = new float[4];

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V")
	public static void method6831() {
		Static84.aClass6_Sub8_Sub1_1.method1511();
		@Pc(15) int local15 = Static84.aClass6_Sub8_Sub1_1.method1512(8);
		@Pc(24) int local24;
		if (local15 < Static288.anInt5977) {
			for (local24 = local15; local24 < Static288.anInt5977; local24++) {
				Static413.anIntArray383[Static456.anInt8191++] = Static562.anIntArray508[local24];
			}
		}
		if (Static288.anInt5977 < local15) {
			throw new RuntimeException("gnpov1");
		}
		Static288.anInt5977 = 0;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(58) int local58 = Static562.anIntArray508[local24];
			@Pc(66) Class9_Sub4_Sub2_Sub1_Sub1 local66 = ((Class6_Sub42) Static461.aClass380_35.method8747((long) local58)).aClass9_Sub4_Sub2_Sub1_Sub1_1;
			@Pc(71) int local71 = Static84.aClass6_Sub8_Sub1_1.method1512(1);
			if (local71 == 0) {
				Static562.anIntArray508[Static288.anInt5977++] = local58;
				local66.anInt4333 = Static369.anInt7055;
			} else {
				@Pc(94) int local94 = Static84.aClass6_Sub8_Sub1_1.method1512(2);
				if (local94 == 0) {
					Static562.anIntArray508[Static288.anInt5977++] = local58;
					local66.anInt4333 = Static369.anInt7055;
					Static635.anIntArray570[Static125.anInt3107++] = local58;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local94 == 1) {
						Static562.anIntArray508[Static288.anInt5977++] = local58;
						local66.anInt4333 = Static369.anInt7055;
						local139 = Static84.aClass6_Sub8_Sub1_1.method1512(3);
						local66.method1990(1, local139);
						local149 = Static84.aClass6_Sub8_Sub1_1.method1512(1);
						if (local149 == 1) {
							Static635.anIntArray570[Static125.anInt3107++] = local58;
						}
					} else if (local94 == 2) {
						Static562.anIntArray508[Static288.anInt5977++] = local58;
						local66.anInt4333 = Static369.anInt7055;
						if (Static84.aClass6_Sub8_Sub1_1.method1512(1) == 1) {
							local139 = Static84.aClass6_Sub8_Sub1_1.method1512(3);
							local66.method1990(2, local139);
							local149 = Static84.aClass6_Sub8_Sub1_1.method1512(3);
							local66.method1990(2, local149);
						} else {
							local139 = Static84.aClass6_Sub8_Sub1_1.method1512(3);
							local66.method1990(0, local139);
						}
						local139 = Static84.aClass6_Sub8_Sub1_1.method1512(1);
						if (local139 == 1) {
							Static635.anIntArray570[Static125.anInt3107++] = local58;
						}
					} else if (local94 == 3) {
						Static413.anIntArray383[Static456.anInt8191++] = local58;
					}
				}
			}
		}
	}
}
