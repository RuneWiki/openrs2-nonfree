import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "Lclient!pt;")
	public static final Class197 aClass197_4 = new Class197("stellardawn", 1);

	@OriginalMember(owner = "client!sd", name = "Fb", descriptor = "I")
	public static int anInt6043 = 2;

	@OriginalMember(owner = "client!sd", name = "Jb", descriptor = "[I")
	public static final int[] anIntArray428 = new int[32];

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "(B)V")
	public static void method4830() {
		for (@Pc(14) int local14 = 0; local14 < Static344.anInt5625; local14++) {
			@Pc(20) Class75 local20 = Static113.aClass75Array1[local14];
			@Pc(22) boolean local22 = false;
			@Pc(138) int local138;
			if (local20.aClass5_Sub22_Sub2_1 == null) {
				local20.anInt1970--;
				if ((local20.aByte16 == 2 ? -1500 : -10) <= local20.anInt1970) {
					if (local20.aByte16 == 1 && local20.aClass90_1 == null) {
						local20.aClass90_1 = Static465.method1968(Static318.aClass243_176, local20.anInt1971, 0);
						if (local20.aClass90_1 == null) {
							continue;
						}
						local20.anInt1970 += local20.aClass90_1.method1967();
					} else if (local20.aByte16 == 2 && (local20.aClass5_Sub43_1 == null || local20.aClass5_Sub5_Sub1_1 == null)) {
						if (local20.aClass5_Sub43_1 == null) {
							local20.aClass5_Sub43_1 = Static416.method5496(Static448.aClass243_248, local20.anInt1971);
						}
						if (local20.aClass5_Sub43_1 == null) {
							continue;
						}
						if (local20.aClass5_Sub5_Sub1_1 == null) {
							local20.aClass5_Sub5_Sub1_1 = local20.aClass5_Sub43_1.method5492(new int[] { 22050 });
							if (local20.aClass5_Sub5_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local20.anInt1970 < 0) {
						if (local20.anInt1969 == 0) {
							local138 = local20.anInt1974 * Static216.aClass1_Sub1_1.anInt4512 >> 8;
						} else {
							@Pc(147) int local147 = local20.anInt1969 >> 24 & 0x3;
							if (local147 == Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105) {
								@Pc(162) int local162 = (local20.anInt1969 & 0xFF) << 7;
								@Pc(169) int local169 = local20.anInt1969 >> 16 & 0xFF;
								@Pc(178) int local178 = (local169 << 7) + 64 - Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500;
								if (local178 < 0) {
									local178 = -local178;
								}
								@Pc(193) int local193 = local20.anInt1969 >> 8 & 0xFF;
								@Pc(203) int local203 = (local193 << 7) + 64 - Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502;
								if (local203 < 0) {
									local203 = -local203;
								}
								@Pc(217) int local217 = local203 + local178 - 128;
								if (local217 > local162) {
									local20.anInt1970 = -99999;
									continue;
								}
								if (local217 < 0) {
									local217 = 0;
								}
								local138 = local20.anInt1974 * (local162 - local217) * Static216.aClass1_Sub1_1.anInt4521 / local162 >> 8;
							} else {
								local138 = 0;
							}
						}
						if (local138 > 0) {
							@Pc(247) Class5_Sub5_Sub1 local247 = null;
							if (local20.aByte16 == 1) {
								local247 = local20.aClass90_1.method1965().method4649(Static202.aClass251_1);
							} else if (local20.aByte16 == 2) {
								local247 = local20.aClass5_Sub5_Sub1_1;
							}
							@Pc(275) Class5_Sub22_Sub2 local275 = local20.aClass5_Sub22_Sub2_1 = Static467.method3103(local247, local138);
							local275.method3128(local20.anInt1973 - 1);
							Static119.aClass5_Sub22_Sub3_3.method3641(local275);
						}
					}
				} else {
					local22 = true;
				}
			} else if (!local20.aClass5_Sub22_Sub2_1.method6005()) {
				local22 = true;
			}
			if (local22) {
				Static344.anInt5625--;
				for (local138 = local14; local138 < Static344.anInt5625; local138++) {
					Static113.aClass75Array1[local138] = Static113.aClass75Array1[local138 + 1];
				}
				local14--;
			}
		}
		if (Static180.aBoolean201 && !Static94.method1327()) {
			if (Static216.aClass1_Sub1_1.anInt4509 != 0 && Static172.anInt3753 != -1) {
				Static124.method1752(Static172.anInt3753, Static216.aClass1_Sub1_1.anInt4509, Static451.aClass243_252);
			}
			Static180.aBoolean201 = false;
		} else if (Static216.aClass1_Sub1_1.anInt4509 != 0 && Static172.anInt3753 != -1 && !Static94.method1327()) {
			Static288.method3576(Static99.aClass194_24);
			Static281.aClass5_Sub15_Sub2_13.method5550(Static172.anInt3753);
			Static172.anInt3753 = -1;
		}
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(IB)I")
	public static int method4832(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
