import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "Lclient!nk;")
	public static Class237 aClass237_1;

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
	public static int anInt9118 = 0;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V")
	public static void method7430() {
		Static158.aClass1_Sub3_Sub1_2.method4996();
		@Pc(18) int local18 = Static158.aClass1_Sub3_Sub1_2.method4994(8);
		@Pc(23) int local23;
		if (local18 < Static306.anInt4911) {
			for (local23 = local18; local23 < Static306.anInt4911; local23++) {
				Static347.anIntArray383[Static329.anInt6018++] = Static11.anIntArray12[local23];
			}
		}
		if (local18 > Static306.anInt4911) {
			throw new RuntimeException("gnpov1");
		}
		Static306.anInt4911 = 0;
		for (local23 = 0; local23 < local18; local23++) {
			@Pc(61) int local61 = Static11.anIntArray12[local23];
			@Pc(69) Class11_Sub1_Sub1_Sub3_Sub2 local69 = ((Class1_Sub33) Static372.aClass91_30.method2271((long) local61)).aClass11_Sub1_Sub1_Sub3_Sub2_2;
			@Pc(74) int local74 = Static158.aClass1_Sub3_Sub1_2.method4994(1);
			if (local74 == 0) {
				Static11.anIntArray12[Static306.anInt4911++] = local61;
				local69.anInt7540 = Static518.anInt9331;
			} else {
				@Pc(97) int local97 = Static158.aClass1_Sub3_Sub1_2.method4994(2);
				if (local97 == 0) {
					Static11.anIntArray12[Static306.anInt4911++] = local61;
					local69.anInt7540 = Static518.anInt9331;
					Static423.anIntArray444[Static386.anInt6908++] = local61;
				} else {
					@Pc(144) int local144;
					@Pc(154) int local154;
					if (local97 == 1) {
						Static11.anIntArray12[Static306.anInt4911++] = local61;
						local69.anInt7540 = Static518.anInt9331;
						local144 = Static158.aClass1_Sub3_Sub1_2.method4994(3);
						local69.method6081(1, local144);
						local154 = Static158.aClass1_Sub3_Sub1_2.method4994(1);
						if (local154 == 1) {
							Static423.anIntArray444[Static386.anInt6908++] = local61;
						}
					} else if (local97 == 2) {
						Static11.anIntArray12[Static306.anInt4911++] = local61;
						local69.anInt7540 = Static518.anInt9331;
						if (Static158.aClass1_Sub3_Sub1_2.method4994(1) == 1) {
							local144 = Static158.aClass1_Sub3_Sub1_2.method4994(3);
							local69.method6081(2, local144);
							local154 = Static158.aClass1_Sub3_Sub1_2.method4994(3);
							local69.method6081(2, local154);
						} else {
							local144 = Static158.aClass1_Sub3_Sub1_2.method4994(3);
							local69.method6081(0, local144);
						}
						local144 = Static158.aClass1_Sub3_Sub1_2.method4994(1);
						if (local144 == 1) {
							Static423.anIntArray444[Static386.anInt6908++] = local61;
						}
					} else if (local97 == 3) {
						Static347.anIntArray383[Static329.anInt6018++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(Z)V")
	public static void method7435() {
		if (!Static80.aBoolean98) {
			return;
		}
		while (true) {
			while (Static332.aClass248_Sub1Array1.length > Static524.anInt1399) {
				@Pc(25) Class248_Sub1 local25 = Static332.aClass248_Sub1Array1[Static524.anInt1399];
				if (local25 != null && local25.anInt8306 == -1) {
					if (Static531.aClass1_Sub46_2 == null) {
						Static531.aClass1_Sub46_2 = Static225.aClass72_1.method1499(local25.aString92);
					}
					@Pc(49) int local49 = Static531.aClass1_Sub46_2.anInt8973;
					if (local49 == -1) {
						return;
					}
					Static531.aClass1_Sub46_2 = null;
					Static524.anInt1399++;
					local25.anInt8306 = local49;
				} else {
					Static524.anInt1399++;
				}
			}
			return;
		}
	}
}
