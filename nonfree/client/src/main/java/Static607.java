import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!vp", name = "G", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_150 = new Class337(60, 6);

	@OriginalMember(owner = "client!vp", name = "J", descriptor = "[I")
	public static int[] anIntArray518 = new int[1];

	@OriginalMember(owner = "client!vp", name = "N", descriptor = "I")
	public static int anInt9468 = 0;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ofa;I)Lclient!nda;")
	public static Class177 method8163(@OriginalArg(0) Class5_Sub22 arg0) {
		@Pc(7) int local7 = arg0.method5968();
		@Pc(19) Class245 local19 = Static116.method4813()[arg0.method5966()];
		@Pc(26) Class183 local26 = Static1.method7584()[arg0.method5966()];
		@Pc(30) int local30 = arg0.method5956();
		@Pc(34) int local34 = arg0.method5956();
		return new Class177(local7, local19, local26, local30, local34);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!cca;ZZ)V")
	public static void method8166(@OriginalArg(0) Class4_Sub2_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static491.anInt8293 >= 400) {
			return;
		}
		@Pc(14) Class225 local14 = arg0.aClass225_1;
		if (local14.anIntArray304 != null) {
			local14 = local14.method4990(Static301.aClass59_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean409) {
			return;
		}
		@Pc(32) String local32 = local14.aString56;
		if (local14.anInt5639 != 0) {
			@Pc(48) String local48 = Static156.aClass63_2 == Static265.aClass63_4 ? Static174.aClass120_30.method2690(Static266.anInt4796) : Static174.aClass120_28.method2690(Static266.anInt4796);
			local32 = local32 + Static478.method7057(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt905, local14.anInt5639) + " (" + local48 + local14.anInt5639 + ")";
		}
		if (Static285.aBoolean378 && !arg1) {
			@Pc(85) Class16 local85 = Static229.anInt4250 == -1 ? null : Static302.aClass291_1.method6836(Static229.anInt4250);
			if ((Static427.anInt7391 & 0x2) != 0 && (local85 == null || local14.method4984(Static229.anInt4250, local85.anInt256) != local85.anInt256)) {
				Static150.method2214(0, Static92.aString22 + " -> <col=ffff00>" + local32, true, false, Static83.anInt6737, 0, -1, (long) arg0.anInt1225, false, Static493.aString96, 45, (long) arg0.anInt1225);
			}
		}
		if (!arg1) {
			@Pc(140) String[] local140 = local14.aStringArray37;
			if (Static438.aBoolean758) {
				local140 = Static62.method1038(local140);
			}
			@Pc(150) int local150;
			if (local140 != null) {
				for (local150 = 4; local150 >= 0; local150--) {
					if (local140[local150] != null && (local14.aByte92 == 0 || !local140[local150].equalsIgnoreCase(Static174.aClass120_23.method2690(Static266.anInt4796)))) {
						@Pc(170) byte local170 = 0;
						if (local150 == 0) {
							local170 = 58;
						}
						@Pc(176) int local176 = Static113.anInt2114;
						if (local150 == 1) {
							local170 = 30;
						}
						if (local150 == 2) {
							local170 = 23;
						}
						if (local150 == 3) {
							local170 = 15;
						}
						if (local14.anInt5648 == local150) {
							local176 = local14.anInt5610;
						}
						if (local150 == 4) {
							local170 = 2;
						}
						if (local14.anInt5616 == local150) {
							local176 = local14.anInt5635;
						}
						Static150.method2214(0, "<col=ffff00>" + local32, true, false, local140[local150].equalsIgnoreCase(Static174.aClass120_23.method2690(Static266.anInt4796)) ? local14.anInt5636 : local176, 0, -1, (long) arg0.anInt1225, false, local140[local150], local170, (long) arg0.anInt1225);
					}
				}
			}
			if (local14.aByte92 == 1 && local140 != null) {
				for (local150 = 4; local150 >= 0; local150--) {
					if (local140[local150] != null && local140[local150].equalsIgnoreCase(Static174.aClass120_23.method2690(Static266.anInt4796))) {
						@Pc(293) short local293 = 0;
						if (local14.anInt5639 > Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt905) {
							local293 = 2000;
						}
						@Pc(302) short local302 = 0;
						if (local150 == 0) {
							local302 = 58;
						}
						if (local150 == 1) {
							local302 = 30;
						}
						if (local150 == 2) {
							local302 = 23;
						}
						if (local150 == 3) {
							local302 = 15;
						}
						if (local150 == 4) {
							local302 = 2;
						}
						if (local302 != 0) {
							local302 += local293;
						}
						Static150.method2214(0, "<col=ffff00>" + local32, true, false, local14.anInt5636, 0, -1, (long) arg0.anInt1225, false, local140[local150], local302, (long) arg0.anInt1225);
					}
				}
			}
		}
		Static150.method2214(0, "<col=ffff00>" + local32, true, false, Static59.anInt1158, 0, -1, (long) arg0.anInt1225, arg1, Static174.aClass120_22.method2690(Static266.anInt4796), 1004, (long) arg0.anInt1225);
	}
}
