import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!cc", name = "Sb", descriptor = "I")
	public static int anInt590;

	@OriginalMember(owner = "client!cc", name = "Cc", descriptor = "I")
	public static int anInt609 = 1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method458() {
		for (@Pc(7) int local7 = 0; local7 < Static7.anInt173; local7++) {
			@Pc(14) int local14 = Static262.anIntArray440[local7]--;
			if (Static262.anIntArray440[local7] >= -10) {
				@Pc(93) Class60 local93 = Static211.aClass60Array1[local7];
				if (local93 == null) {
					local93 = Static303.method1647(Static35.aClass98_22, Static92.anIntArray205[local7], 0);
					if (local93 == null) {
						continue;
					}
					Static262.anIntArray440[local7] += local93.method1645();
					Static211.aClass60Array1[local7] = local93;
				}
				if (Static262.anIntArray440[local7] < 0) {
					@Pc(227) int local227;
					if (Static200.anIntArray336[local7] == 0) {
						local227 = Static10.anIntArray23[local7] * Static150.anInt3043 >> 8;
					} else {
						@Pc(136) int local136 = (Static200.anIntArray336[local7] & 0xFF) * 128;
						@Pc(144) int local144 = Static200.anIntArray336[local7] >> 16 & 0xFF;
						@Pc(154) int local154 = local144 * 128 + 64 - Static239.aClass12_Sub3_Sub2_2.anInt4141;
						if (local154 < 0) {
							local154 = -local154;
						}
						@Pc(170) int local170 = Static200.anIntArray336[local7] >> 8 & 0xFF;
						@Pc(179) int local179 = local170 * 128 + 64 - Static239.aClass12_Sub3_Sub2_2.anInt4113;
						if (local179 < 0) {
							local179 = -local179;
						}
						@Pc(194) int local194 = local179 + local154 - 128;
						if (local136 < local194) {
							Static262.anIntArray440[local7] = -100;
							continue;
						}
						if (local194 < 0) {
							local194 = 0;
						}
						local227 = (local136 - local194) * Static71.anInt1312 * Static10.anIntArray23[local7] / local136 >> 8;
					}
					if (local227 > 0) {
						@Pc(245) Class4_Sub15_Sub1 local245 = local93.method1646().method1487(Static254.aClass56_1);
						@Pc(250) Class4_Sub9_Sub1 local250 = Static302.method809(local245, local227);
						local250.method781(Static66.anIntArray137[local7] - 1);
						Static219.aClass4_Sub9_Sub4_2.method1473(local250);
					}
					Static262.anIntArray440[local7] = -100;
				}
			} else {
				Static7.anInt173--;
				for (@Pc(28) int local28 = local7; local28 < Static7.anInt173; local28++) {
					Static92.anIntArray205[local28] = Static92.anIntArray205[local28 + 1];
					Static211.aClass60Array1[local28] = Static211.aClass60Array1[local28 + 1];
					Static66.anIntArray137[local28] = Static66.anIntArray137[local28 + 1];
					Static262.anIntArray440[local28] = Static262.anIntArray440[local28 + 1];
					Static200.anIntArray336[local28] = Static200.anIntArray336[local28 + 1];
					Static10.anIntArray23[local28] = Static10.anIntArray23[local28 + 1];
				}
				local7--;
			}
		}
		if (Static190.aBoolean244 && !Static259.method3921()) {
			if (Static52.anInt1043 != 0 && Static67.anInt1256 != -1) {
				Static119.method2037(Static52.anInt1043, Static94.aClass98_56, Static67.anInt1256);
			}
			Static190.aBoolean244 = false;
		} else if (Static52.anInt1043 != 0 && Static67.anInt1256 != -1 && !Static259.method3921()) {
			Static142.aClass4_Sub17_Sub1_3.method1905(7);
			Static142.aClass4_Sub17_Sub1_3.method1854(Static67.anInt1256);
			Static67.anInt1256 = -1;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	public static void method460() {
		Static105.aClass33_17.method843();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Z")
	public static boolean method462(@OriginalArg(0) int arg0) {
		Static187.aBoolean243 = true;
		Static44.anInt886 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
