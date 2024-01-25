import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "Lclient!kr;")
	public static Class1_Sub23 aClass1_Sub23_1;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_136 = new Class81(56, 28);

	@OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
	public static int anInt5789 = 0;

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)V")
	public static void method4889() {
		Static506.aBoolean624 = true;
	}

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "(B)V")
	public static void method4890() {
		Static480.aClass1_Sub20_Sub1_1.method3927();
		@Pc(13) int local13 = Static480.aClass1_Sub20_Sub1_1.method3924(8);
		@Pc(18) int local18;
		if (local13 < Static480.anInt8097) {
			for (local18 = local13; local18 < Static480.anInt8097; local18++) {
				Static440.anIntArray502[Static553.anInt9060++] = Static542.anIntArray599[local18];
			}
		}
		if (Static480.anInt8097 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static480.anInt8097 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(56) int local56 = Static542.anIntArray599[local18];
			@Pc(64) Class20_Sub2_Sub4_Sub1_Sub2 local64 = ((Class1_Sub39) Static131.aClass356_32.method7796((long) local56)).aClass20_Sub2_Sub4_Sub1_Sub2_2;
			@Pc(69) int local69 = Static480.aClass1_Sub20_Sub1_1.method3924(1);
			if (local69 == 0) {
				Static542.anIntArray599[Static480.anInt8097++] = local56;
				local64.anInt6399 = Static81.anInt1910;
			} else {
				@Pc(89) int local89 = Static480.aClass1_Sub20_Sub1_1.method3924(2);
				if (local89 == 0) {
					Static542.anIntArray599[Static480.anInt8097++] = local56;
					local64.anInt6399 = Static81.anInt1910;
					Static509.anIntArray582[Static474.anInt1075++] = local56;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local89 == 1) {
						Static542.anIntArray599[Static480.anInt8097++] = local56;
						local64.anInt6399 = Static81.anInt1910;
						local133 = Static480.aClass1_Sub20_Sub1_1.method3924(3);
						local64.method5360(local133, 1);
						local143 = Static480.aClass1_Sub20_Sub1_1.method3924(1);
						if (local143 == 1) {
							Static509.anIntArray582[Static474.anInt1075++] = local56;
						}
					} else if (local89 == 2) {
						Static542.anIntArray599[Static480.anInt8097++] = local56;
						local64.anInt6399 = Static81.anInt1910;
						if (Static480.aClass1_Sub20_Sub1_1.method3924(1) == 1) {
							local133 = Static480.aClass1_Sub20_Sub1_1.method3924(3);
							local64.method5360(local133, 2);
							local143 = Static480.aClass1_Sub20_Sub1_1.method3924(3);
							local64.method5360(local143, 2);
						} else {
							local133 = Static480.aClass1_Sub20_Sub1_1.method3924(3);
							local64.method5360(local133, 0);
						}
						local133 = Static480.aClass1_Sub20_Sub1_1.method3924(1);
						if (local133 == 1) {
							Static509.anIntArray582[Static474.anInt1075++] = local56;
						}
					} else if (local89 == 3) {
						Static440.anIntArray502[Static553.anInt9060++] = local56;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)V")
	public static void method4891(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static374.method5445(2, arg0);
		local8.method488();
	}
}
