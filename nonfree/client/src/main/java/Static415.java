import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!oda", name = "h", descriptor = "I")
	public static int anInt7233;

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "(I)V")
	public static void method6234() {
		Static204.aClass6_Sub23_Sub1_1.method2877();
		@Pc(13) int local13 = Static204.aClass6_Sub23_Sub1_1.method2878(8);
		@Pc(22) int local22;
		if (Static133.anInt2316 > local13) {
			for (local22 = local13; local22 < Static133.anInt2316; local22++) {
				Static274.anIntArray268[Static480.anInt8235++] = Static74.anIntArray80[local22];
			}
		}
		if (local13 > Static133.anInt2316) {
			throw new RuntimeException("gnpov1");
		}
		Static133.anInt2316 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(64) int local64 = Static74.anIntArray80[local22];
			@Pc(72) Class2_Sub1_Sub1_Sub3_Sub2 local72 = ((Class6_Sub44) Static349.aClass209_32.method5038((long) local64)).aClass2_Sub1_Sub1_Sub3_Sub2_2;
			@Pc(79) int local79 = Static204.aClass6_Sub23_Sub1_1.method2878(1);
			if (local79 == 0) {
				Static74.anIntArray80[Static133.anInt2316++] = local64;
				local72.anInt5062 = Static352.anInt6014;
			} else {
				@Pc(102) int local102 = Static204.aClass6_Sub23_Sub1_1.method2878(2);
				if (local102 == 0) {
					Static74.anIntArray80[Static133.anInt2316++] = local64;
					local72.anInt5062 = Static352.anInt6014;
					Static69.anIntArray70[Static105.anInt1939++] = local64;
				} else {
					@Pc(148) int local148;
					@Pc(160) int local160;
					if (local102 == 1) {
						Static74.anIntArray80[Static133.anInt2316++] = local64;
						local72.anInt5062 = Static352.anInt6014;
						local148 = Static204.aClass6_Sub23_Sub1_1.method2878(3);
						local72.method4343(local148, 1);
						local160 = Static204.aClass6_Sub23_Sub1_1.method2878(1);
						if (local160 == 1) {
							Static69.anIntArray70[Static105.anInt1939++] = local64;
						}
					} else if (local102 == 2) {
						Static74.anIntArray80[Static133.anInt2316++] = local64;
						local72.anInt5062 = Static352.anInt6014;
						if (Static204.aClass6_Sub23_Sub1_1.method2878(1) == 1) {
							local148 = Static204.aClass6_Sub23_Sub1_1.method2878(3);
							local72.method4343(local148, 2);
							local160 = Static204.aClass6_Sub23_Sub1_1.method2878(3);
							local72.method4343(local160, 2);
						} else {
							local148 = Static204.aClass6_Sub23_Sub1_1.method2878(3);
							local72.method4343(local148, 0);
						}
						local148 = Static204.aClass6_Sub23_Sub1_1.method2878(1);
						if (local148 == 1) {
							Static69.anIntArray70[Static105.anInt1939++] = local64;
						}
					} else if (local102 == 3) {
						Static274.anIntArray268[Static480.anInt8235++] = local64;
					}
				}
			}
		}
	}
}
