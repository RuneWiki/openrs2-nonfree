import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_16 = new Class73(28, -1);

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZ)V")
	public static void method989(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static282.aClass6_Sub21_Sub2_1.method6081(Static177.anInt3710) >= 15) {
				@Pc(12) int local12 = Static282.aClass6_Sub21_Sub2_1.method6078(15);
				if (local12 != 32767) {
					@Pc(19) boolean local19 = false;
					@Pc(26) Class6_Sub34 local26 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local12);
					@Pc(32) Class4_Sub1_Sub1_Sub1 local32;
					if (local26 == null) {
						local32 = new Class4_Sub1_Sub1_Sub1();
						local32.anInt7126 = local12;
						local26 = new Class6_Sub34(local32);
						Static593.aClass128_43.method3267(local26, (long) local12);
						Static76.aClass6_Sub34Array7[Static535.anInt8885++] = local26;
						local19 = true;
					}
					local32 = local26.aClass4_Sub1_Sub1_Sub1_2;
					Static291.anIntArray405[Static464.anInt7995++] = local12;
					local32.anInt7080 = Static312.anInt5688;
					if (local32.aClass273_1 != null && local32.aClass273_1.method6161()) {
						Static105.method1888(local32);
					}
					@Pc(86) int local86 = Static282.aClass6_Sub21_Sub2_1.method6078(2);
					@Pc(93) int local93;
					if (arg0) {
						local93 = Static282.aClass6_Sub21_Sub2_1.method6078(8);
						if (local93 > 127) {
							local93 -= 256;
						}
					} else {
						local93 = Static282.aClass6_Sub21_Sub2_1.method6078(5);
						if (local93 > 15) {
							local93 -= 32;
						}
					}
					@Pc(115) int local115 = Static282.aClass6_Sub21_Sub2_1.method6078(1);
					local32.method152(Static577.aClass125_2.method3229(Static282.aClass6_Sub21_Sub2_1.method6078(14)));
					@Pc(130) int local130 = Static282.aClass6_Sub21_Sub2_1.method6078(1);
					if (local130 == 1) {
						Static150.anIntArray197[Static241.anInt4871++] = local12;
					}
					@Pc(148) int local148;
					if (arg0) {
						local148 = Static282.aClass6_Sub21_Sub2_1.method6078(8);
						if (local148 > 127) {
							local148 -= 256;
						}
					} else {
						local148 = Static282.aClass6_Sub21_Sub2_1.method6078(5);
						if (local148 > 15) {
							local148 -= 32;
						}
					}
					@Pc(176) int local176 = (Static282.aClass6_Sub21_Sub2_1.method6078(3) + 4 & 0xE1C00007) << 11;
					local32.method5905(local32.aClass273_1.anInt7439);
					local32.anInt7114 = local32.aClass273_1.anInt7451 << 3;
					if (local19) {
						local32.method5903(true, local176);
					}
					local32.method154(Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray522[0] + local148, local86, Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray521[0] + local93, local115 == 1, local32.method5892());
					if (local32.aClass273_1.method6161()) {
						Static588.method1990(null, local32.anIntArray521[0], local32, local32.aByte108, null, local32.anIntArray522[0], 0);
					}
					continue;
				}
			}
			Static282.aClass6_Sub21_Sub2_1.method6076();
			return;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method991(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg0 < 512 || arg2 < 512 || arg0 > (Static473.anInt8075 - 2) * 512 || arg2 > (Static165.anInt6749 - 2) * 512) {
			Static373.anIntArray490[0] = Static373.anIntArray490[1] = -1;
			return;
		}
		@Pc(43) int local43 = Static160.method2951(arg2, arg0, arg5) - arg4;
		Static21.aClass54_1.G(arg1, 0, 0);
		Static240.aClass14_7.method6829(Static21.aClass54_1);
		Static240.aClass14_7.na(arg0, local43, arg2, Static373.anIntArray490);
		Static21.aClass54_1.G(-arg1, 0, 0);
		Static240.aClass14_7.method6829(Static21.aClass54_1);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BII)Z")
	public static boolean method992(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static294.method4726(arg0, arg1) | Static167.method3163(arg0, arg1) | Static234.method4077(arg0, arg1)) & Static493.method6727(arg0, arg1);
	}
}
