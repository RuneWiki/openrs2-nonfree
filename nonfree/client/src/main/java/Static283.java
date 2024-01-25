import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!jk", name = "F", descriptor = "[I")
	public static final int[] anIntArray347 = new int[2];

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "(I)V")
	public static void method4092() {
		Static159.aClass4_Sub11_Sub1_1.method986();
		@Pc(13) int local13 = Static159.aClass4_Sub11_Sub1_1.method988(8);
		@Pc(22) int local22;
		if (local13 < Static105.anInt2131) {
			for (local22 = local13; local22 < Static105.anInt2131; local22++) {
				Static242.anIntArray294[Static148.anInt2697++] = Static526.anIntArray558[local22];
			}
		}
		if (Static105.anInt2131 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static105.anInt2131 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(65) int local65 = Static526.anIntArray558[local22];
			@Pc(73) Class3_Sub1_Sub2_Sub2_Sub2 local73 = ((Class4_Sub45) Static597.aClass66_41.method1994((long) local65)).aClass3_Sub1_Sub2_Sub2_Sub2_2;
			@Pc(78) int local78 = Static159.aClass4_Sub11_Sub1_1.method988(1);
			if (local78 == 0) {
				Static526.anIntArray558[Static105.anInt2131++] = local65;
				local73.anInt9983 = Static101.anInt2078;
			} else {
				@Pc(98) int local98 = Static159.aClass4_Sub11_Sub1_1.method988(2);
				if (local98 == 0) {
					Static526.anIntArray558[Static105.anInt2131++] = local65;
					local73.anInt9983 = Static101.anInt2078;
					Static259.anIntArray307[Static277.anInt4479++] = local65;
				} else {
					@Pc(142) int local142;
					@Pc(152) int local152;
					if (local98 == 1) {
						Static526.anIntArray558[Static105.anInt2131++] = local65;
						local73.anInt9983 = Static101.anInt2078;
						local142 = Static159.aClass4_Sub11_Sub1_1.method988(3);
						local73.method8535(1, local142);
						local152 = Static159.aClass4_Sub11_Sub1_1.method988(1);
						if (local152 == 1) {
							Static259.anIntArray307[Static277.anInt4479++] = local65;
						}
					} else if (local98 == 2) {
						Static526.anIntArray558[Static105.anInt2131++] = local65;
						local73.anInt9983 = Static101.anInt2078;
						if (Static159.aClass4_Sub11_Sub1_1.method988(1) == 1) {
							local142 = Static159.aClass4_Sub11_Sub1_1.method988(3);
							local73.method8535(2, local142);
							local152 = Static159.aClass4_Sub11_Sub1_1.method988(3);
							local73.method8535(2, local152);
						} else {
							local142 = Static159.aClass4_Sub11_Sub1_1.method988(3);
							local73.method8535(0, local142);
						}
						local142 = Static159.aClass4_Sub11_Sub1_1.method988(1);
						if (local142 == 1) {
							Static259.anIntArray307[Static277.anInt4479++] = local65;
						}
					} else if (local98 == 3) {
						Static242.anIntArray294[Static148.anInt2697++] = local65;
					}
				}
			}
		}
	}
}
