import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!maa", name = "v", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_172 = new Class272(9, -2);

	@OriginalMember(owner = "client!maa", name = "g", descriptor = "(I)V")
	public static void method4912() {
		Static187.aClass3_Sub11_Sub1_1.method992();
		@Pc(18) int local18 = Static187.aClass3_Sub11_Sub1_1.method990(8);
		@Pc(27) int local27;
		if (local18 < Static49.anInt1058) {
			for (local27 = local18; local27 < Static49.anInt1058; local27++) {
				Static58.anIntArray105[Static17.anInt272++] = Static480.anIntArray603[local27];
			}
		}
		if (local18 > Static49.anInt1058) {
			throw new RuntimeException("gnpov1");
		}
		Static49.anInt1058 = 0;
		for (local27 = 0; local27 < local18; local27++) {
			@Pc(69) int local69 = Static480.anIntArray603[local27];
			@Pc(77) Class9_Sub1_Sub1_Sub2_Sub1 local77 = ((Class3_Sub39) Static243.aClass310_16.method6601((long) local69)).aClass9_Sub1_Sub1_Sub2_Sub1_2;
			@Pc(82) int local82 = Static187.aClass3_Sub11_Sub1_1.method990(1);
			if (local82 == 0) {
				Static480.anIntArray603[Static49.anInt1058++] = local69;
				local77.anInt6391 = Static305.anInt5560;
			} else {
				@Pc(107) int local107 = Static187.aClass3_Sub11_Sub1_1.method990(2);
				if (local107 == 0) {
					Static480.anIntArray603[Static49.anInt1058++] = local69;
					local77.anInt6391 = Static305.anInt5560;
					Static4.anIntArray7[Static321.anInt5791++] = local69;
				} else {
					@Pc(152) int local152;
					@Pc(164) int local164;
					if (local107 == 1) {
						Static480.anIntArray603[Static49.anInt1058++] = local69;
						local77.anInt6391 = Static305.anInt5560;
						local152 = Static187.aClass3_Sub11_Sub1_1.method990(3);
						local77.method420(local152, 1);
						local164 = Static187.aClass3_Sub11_Sub1_1.method990(1);
						if (local164 == 1) {
							Static4.anIntArray7[Static321.anInt5791++] = local69;
						}
					} else if (local107 == 2) {
						Static480.anIntArray603[Static49.anInt1058++] = local69;
						local77.anInt6391 = Static305.anInt5560;
						if (Static187.aClass3_Sub11_Sub1_1.method990(1) == 1) {
							local152 = Static187.aClass3_Sub11_Sub1_1.method990(3);
							local77.method420(local152, 2);
							local164 = Static187.aClass3_Sub11_Sub1_1.method990(3);
							local77.method420(local164, 2);
						} else {
							local152 = Static187.aClass3_Sub11_Sub1_1.method990(3);
							local77.method420(local152, 0);
						}
						local152 = Static187.aClass3_Sub11_Sub1_1.method990(1);
						if (local152 == 1) {
							Static4.anIntArray7[Static321.anInt5791++] = local69;
						}
					} else if (local107 == 3) {
						Static58.anIntArray105[Static17.anInt272++] = local69;
					}
				}
			}
		}
	}
}
