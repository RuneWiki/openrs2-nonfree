import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "[Lclient!hu;")
	public static Class21[] aClass21Array19;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "Lclient!jt;")
	public static final Class165 aClass165_8 = new Class165("", 10);

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V")
	public static void method7143() {
		Static442.aClass8_Sub8_Sub2_2.method8592();
		@Pc(13) int local13 = Static442.aClass8_Sub8_Sub2_2.method8586(8);
		@Pc(18) int local18;
		if (Static59.anInt1906 > local13) {
			for (local18 = local13; local18 < Static59.anInt1906; local18++) {
				Static214.anIntArray272[Static128.anInt3421++] = Static620.anIntArray609[local18];
			}
		}
		if (local13 > Static59.anInt1906) {
			throw new RuntimeException("gnpov1");
		}
		Static59.anInt1906 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(52) int local52 = Static620.anIntArray609[local18];
			@Pc(60) Class15_Sub1_Sub2_Sub2_Sub2 local60 = ((Class8_Sub50) Static278.aClass253_20.method6594((long) local52)).aClass15_Sub1_Sub2_Sub2_Sub2_2;
			@Pc(65) int local65 = Static442.aClass8_Sub8_Sub2_2.method8586(1);
			if (local65 == 0) {
				Static620.anIntArray609[Static59.anInt1906++] = local52;
				local60.anInt8089 = Static226.anInt5177;
			} else {
				@Pc(88) int local88 = Static442.aClass8_Sub8_Sub2_2.method8586(2);
				if (local88 == 0) {
					Static620.anIntArray609[Static59.anInt1906++] = local52;
					local60.anInt8089 = Static226.anInt5177;
					Static151.anIntArray192[Static91.anInt2547++] = local52;
				} else {
					@Pc(130) int local130;
					@Pc(140) int local140;
					if (local88 == 1) {
						Static620.anIntArray609[Static59.anInt1906++] = local52;
						local60.anInt8089 = Static226.anInt5177;
						local130 = Static442.aClass8_Sub8_Sub2_2.method8586(3);
						local60.method6707(local130, 1);
						local140 = Static442.aClass8_Sub8_Sub2_2.method8586(1);
						if (local140 == 1) {
							Static151.anIntArray192[Static91.anInt2547++] = local52;
						}
					} else if (local88 == 2) {
						Static620.anIntArray609[Static59.anInt1906++] = local52;
						local60.anInt8089 = Static226.anInt5177;
						if (Static442.aClass8_Sub8_Sub2_2.method8586(1) == 1) {
							local130 = Static442.aClass8_Sub8_Sub2_2.method8586(3);
							local60.method6707(local130, 2);
							local140 = Static442.aClass8_Sub8_Sub2_2.method8586(3);
							local60.method6707(local140, 2);
						} else {
							local130 = Static442.aClass8_Sub8_Sub2_2.method8586(3);
							local60.method6707(local130, 0);
						}
						local130 = Static442.aClass8_Sub8_Sub2_2.method8586(1);
						if (local130 == 1) {
							Static151.anIntArray192[Static91.anInt2547++] = local52;
						}
					} else if (local88 == 3) {
						Static214.anIntArray272[Static128.anInt3421++] = local52;
					}
				}
			}
		}
	}
}
