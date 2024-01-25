import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "Lclient!la;")
	public static Class207 aClass207_94;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "Lclient!tg;")
	public static final Class330 aClass330_44 = new Class330();

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public static void method6827() {
		@Pc(8) int local8 = Static598.aByteArrayArray28.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static598.aByteArrayArray28[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static395.anInt6579; local20++) {
					if (Static25.anIntArray12[local20] == Static312.anIntArray597[local10]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static25.anIntArray12[Static395.anInt6579] = Static312.anIntArray597[local10];
					local18 = Static395.anInt6579++;
				}
				@Pc(64) Class5_Sub22 local64 = new Class5_Sub22(Static598.aByteArrayArray28[local10]);
				@Pc(66) int local66 = 0;
				while (Static598.aByteArrayArray28[local10].length > local64.anInt6629 && local66 < 511 && Static280.anInt4989 < 1023) {
					@Pc(87) int local87 = local66++ << 6 | local18;
					@Pc(91) int local91 = local64.method5968();
					@Pc(95) int local95 = local91 >> 14;
					@Pc(101) int local101 = local91 >> 7 & 0x3F;
					@Pc(105) int local105 = local91 & 0x3F;
					@Pc(117) int local117 = local101 + (Static312.anIntArray597[local10] >> 8) * 64 - Static565.anInt9560;
					@Pc(130) int local130 = local105 + (Static312.anIntArray597[local10] & 0xFF) * 64 - Static567.anInt9589;
					@Pc(137) Class225 local137 = Static439.aClass92_2.method1914(local64.method5968());
					@Pc(144) Class5_Sub3 local144 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local87);
					if (local144 == null && (local137.aByte90 & 0x1) > 0 && Static173.anInt3110 == local95 && local117 >= 0 && Static326.anInt5541 > local137.anInt5618 + local117 && local130 >= 0 && Static448.anInt7637 > local137.anInt5618 + local130) {
						@Pc(185) Class4_Sub2_Sub1_Sub1_Sub2 local185 = new Class4_Sub2_Sub1_Sub1_Sub2();
						local185.anInt1225 = local87;
						@Pc(193) Class5_Sub3 local193 = new Class5_Sub3(local185);
						Static445.aClass273_29.method6585((long) local87, local193);
						Static467.aClass5_Sub3Array1[Static235.anInt4322++] = local193;
						Static209.anIntArray198[Static280.anInt4989++] = local87;
						local185.anInt1230 = Static631.anInt10493;
						local185.method1045(local137);
						local185.method1030(local185.aClass225_1.anInt5618);
						local185.anInt1207 = local185.aClass225_1.anInt5626 << 3;
						local185.method1024(true, (local185.aClass225_1.aByte88 + 4 & 0xC8A00007) << 11);
						local185.method1041(local95, true, local130, local117, local185.method1018());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!gba;)V")
	public static void method6828(@OriginalArg(1) Class5_Sub22_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static66.anInt1360; local7++) {
			@Pc(18) int local18 = Static523.anIntArray492[local7];
			@Pc(22) Class4_Sub2_Sub1_Sub1_Sub1 local22 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local18];
			@Pc(26) int local26 = arg0.method5966();
			if ((local26 & 0x1) != 0) {
				local26 += arg0.method5966() << 8;
			}
			if ((local26 & 0x400) != 0) {
				local26 += arg0.method5966() << 16;
			}
			Static198.method3506(local18, local26, arg0, local22);
		}
	}
}
