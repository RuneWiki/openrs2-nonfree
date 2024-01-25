import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
	public static int anInt5997;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "Lclient!qa;")
	public static Class121 aClass121_9;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_290 = new Class12(45, 3);

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_92 = new Class96("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
	public static void method4744() {
		Static116.aClass1_Sub14_Sub2_1.method4567();
		@Pc(17) int local17 = Static116.aClass1_Sub14_Sub2_1.method4557(8);
		@Pc(26) int local26;
		if (Static47.anInt760 > local17) {
			for (local26 = local17; local26 < Static47.anInt760; local26++) {
				Static402.anIntArray554[Static218.anInt3861++] = Static151.anIntArray211[local26];
			}
		}
		if (Static47.anInt760 < local17) {
			throw new RuntimeException("gnpov1");
		}
		Static47.anInt760 = 0;
		for (local26 = 0; local26 < local17; local26++) {
			@Pc(60) int local60 = Static151.anIntArray211[local26];
			@Pc(64) Class47_Sub1_Sub5_Sub1 local64 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local60];
			@Pc(69) int local69 = Static116.aClass1_Sub14_Sub2_1.method4557(1);
			if (local69 == 0) {
				Static151.anIntArray211[Static47.anInt760++] = local60;
				local64.anInt5343 = Static123.anInt2333;
			} else {
				@Pc(92) int local92 = Static116.aClass1_Sub14_Sub2_1.method4557(2);
				if (local92 == 0) {
					Static151.anIntArray211[Static47.anInt760++] = local60;
					local64.anInt5343 = Static123.anInt2333;
					Static295.anIntArray380[Static186.anInt3458++] = local60;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local92 == 1) {
						Static151.anIntArray211[Static47.anInt760++] = local60;
						local64.anInt5343 = Static123.anInt2333;
						local134 = Static116.aClass1_Sub14_Sub2_1.method4557(3);
						local64.method3159(1, local134);
						local144 = Static116.aClass1_Sub14_Sub2_1.method4557(1);
						if (local144 == 1) {
							Static295.anIntArray380[Static186.anInt3458++] = local60;
						}
					} else if (local92 == 2) {
						Static151.anIntArray211[Static47.anInt760++] = local60;
						local64.anInt5343 = Static123.anInt2333;
						if (Static116.aClass1_Sub14_Sub2_1.method4557(1) == 1) {
							local134 = Static116.aClass1_Sub14_Sub2_1.method4557(3);
							local64.method3159(2, local134);
							local144 = Static116.aClass1_Sub14_Sub2_1.method4557(3);
							local64.method3159(2, local144);
						} else {
							local134 = Static116.aClass1_Sub14_Sub2_1.method4557(3);
							local64.method3159(0, local134);
						}
						local134 = Static116.aClass1_Sub14_Sub2_1.method4557(1);
						if (local134 == 1) {
							Static295.anIntArray380[Static186.anInt3458++] = local60;
						}
					} else if (local92 == 3) {
						Static402.anIntArray554[Static218.anInt3861++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!ei;)V")
	public static void method4747(@OriginalArg(1) Class1_Sub5 arg0) {
		if (arg0.aClass1_Sub6_5 != null) {
			arg0.aClass1_Sub6_5.anInt642 = 0;
		}
		arg0.aBoolean451 = false;
		for (@Pc(23) Class1_Sub5 local23 = arg0.method4442(); local23 != null; local23 = arg0.method4447()) {
			method4747(local23);
		}
	}
}
