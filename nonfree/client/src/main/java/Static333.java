import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
	public static int anInt5454;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
	public static int anInt5460;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method4259(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static308.method4010(arg0);
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(ZI)V")
	public static void method4260(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static154.aClass1_Sub11_Sub1_3.method3344(Static329.anInt5393) >= 15) {
				@Pc(14) int local14 = Static154.aClass1_Sub11_Sub1_3.method3347(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static98.aClass20_Sub3_Sub3_Sub2Array1[local14] == null) {
						Static98.aClass20_Sub3_Sub3_Sub2Array1[local14] = new Class20_Sub3_Sub3_Sub2();
						Static98.aClass20_Sub3_Sub3_Sub2Array1[local14].anInt6045 = local14;
						local19 = true;
					}
					@Pc(40) Class20_Sub3_Sub3_Sub2 local40 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local14];
					Static220.anIntArray193[Static411.anInt6695++] = local14;
					local40.anInt6043 = Static368.anInt6250;
					if (local40.aClass246_1 != null && local40.aClass246_1.method5258()) {
						Static176.method2361(local40);
					}
					@Pc(75) int local75 = (Static154.aClass1_Sub11_Sub1_3.method3347(3) + 4 & 0xED000007) << 11;
					local40.method4695(Static304.aClass27_1.method588(Static154.aClass1_Sub11_Sub1_3.method3347(14)));
					@Pc(92) int local92;
					if (arg0) {
						local92 = Static154.aClass1_Sub11_Sub1_3.method3347(8);
						if (local92 > 127) {
							local92 -= 256;
						}
					} else {
						local92 = Static154.aClass1_Sub11_Sub1_3.method3347(5);
						if (local92 > 15) {
							local92 -= 32;
						}
					}
					@Pc(114) int local114 = Static154.aClass1_Sub11_Sub1_3.method3347(1);
					@Pc(121) int local121;
					if (arg0) {
						local121 = Static154.aClass1_Sub11_Sub1_3.method3347(8);
						if (local121 > 127) {
							local121 -= 256;
						}
					} else {
						local121 = Static154.aClass1_Sub11_Sub1_3.method3347(5);
						if (local121 > 15) {
							local121 -= 32;
						}
					}
					@Pc(143) int local143 = Static154.aClass1_Sub11_Sub1_3.method3347(1);
					if (local143 == 1) {
						Static386.anIntArray396[Static158.anInt2643++] = local14;
					}
					@Pc(159) int local159 = Static154.aClass1_Sub11_Sub1_3.method3347(2);
					local40.method4691(local40.aClass246_1.anInt6830);
					local40.anInt6082 = local40.aClass246_1.anInt6851 << 3;
					if (local40.anInt6082 == 0) {
						local40.method4686(0);
					} else if (local19) {
						local40.method4686(local75);
					}
					local40.method4697(local121 + Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray369[0], local40.method4678(), Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray370[0] + local92, local114 == 1, local159);
					if (local40.aClass246_1.method5258()) {
						Static62.method970(null, null, 0, local40.anIntArray369[0], local40, local40.anIntArray370[0], local40.aByte89);
					}
					continue;
				}
			}
			Static154.aClass1_Sub11_Sub1_3.method3348();
			return;
		}
	}
}
