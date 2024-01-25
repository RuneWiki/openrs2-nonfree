import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!lh", name = "Og", descriptor = "I")
	public static int anInt5718;

	@OriginalMember(owner = "client!lh", name = "Ih", descriptor = "[Lclient!ha;")
	public static Class25[] aClass25Array12;

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "(B)V")
	public static void method4789() {
		Static131.aClass5_Sub3_Sub1_1.method519();
		@Pc(17) int local17 = Static131.aClass5_Sub3_Sub1_1.method524(8);
		@Pc(26) int local26;
		if (Static438.anInt7689 > local17) {
			for (local26 = local17; local26 < Static438.anInt7689; local26++) {
				Static359.anIntArray506[Static370.anInt7928++] = Static547.anIntArray731[local26];
			}
		}
		if (local17 > Static438.anInt7689) {
			throw new RuntimeException("gnpov1");
		}
		Static438.anInt7689 = 0;
		for (local26 = 0; local26 < local17; local26++) {
			@Pc(68) int local68 = Static547.anIntArray731[local26];
			@Pc(76) Class15_Sub2_Sub1_Sub2 local76 = ((Class5_Sub51) Static521.aClass42_42.method1109((long) local68)).aClass15_Sub2_Sub1_Sub2_2;
			@Pc(81) int local81 = Static131.aClass5_Sub3_Sub1_1.method524(1);
			if (local81 == 0) {
				Static547.anIntArray731[Static438.anInt7689++] = local68;
				local76.anInt4749 = Static481.anInt8318;
			} else {
				@Pc(104) int local104 = Static131.aClass5_Sub3_Sub1_1.method524(2);
				if (local104 == 0) {
					Static547.anIntArray731[Static438.anInt7689++] = local68;
					local76.anInt4749 = Static481.anInt8318;
					Static146.anIntArray243[Static144.anInt3037++] = local68;
				} else {
					@Pc(148) int local148;
					@Pc(158) int local158;
					if (local104 == 1) {
						Static547.anIntArray731[Static438.anInt7689++] = local68;
						local76.anInt4749 = Static481.anInt8318;
						local148 = Static131.aClass5_Sub3_Sub1_1.method524(3);
						local76.method4048(1, local148);
						local158 = Static131.aClass5_Sub3_Sub1_1.method524(1);
						if (local158 == 1) {
							Static146.anIntArray243[Static144.anInt3037++] = local68;
						}
					} else if (local104 == 2) {
						Static547.anIntArray731[Static438.anInt7689++] = local68;
						local76.anInt4749 = Static481.anInt8318;
						if (Static131.aClass5_Sub3_Sub1_1.method524(1) == 1) {
							local148 = Static131.aClass5_Sub3_Sub1_1.method524(3);
							local76.method4048(2, local148);
							local158 = Static131.aClass5_Sub3_Sub1_1.method524(3);
							local76.method4048(2, local158);
						} else {
							local148 = Static131.aClass5_Sub3_Sub1_1.method524(3);
							local76.method4048(0, local148);
						}
						local148 = Static131.aClass5_Sub3_Sub1_1.method524(1);
						if (local148 == 1) {
							Static146.anIntArray243[Static144.anInt3037++] = local68;
						}
					} else if (local104 == 3) {
						Static359.anIntArray506[Static370.anInt7928++] = local68;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIBLclient!oh;)V")
	public static void method4791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class220 arg2) {
		Static303.anInt5998 = arg0;
		Static290.aClass220_14 = arg2;
		Static274.anInt5370 = arg1;
	}

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "(II)V")
	public static void method4795(@OriginalArg(0) int arg0) {
		Static84.anInt1589 = arg0;
		@Pc(7) Class288 local7 = Static229.aClass288_33;
		synchronized (Static229.aClass288_33) {
			Static229.aClass288_33.method6744();
		}
		local7 = Static240.aClass288_34;
		synchronized (Static240.aClass288_34) {
			Static240.aClass288_34.method6744();
		}
	}
}
