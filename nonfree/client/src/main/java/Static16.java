import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
	public static int anInt377;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "Lclient!ka;")
	public static Class4_Sub1_Sub3_Sub2_Sub1 aClass4_Sub1_Sub3_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!ec;")
	public static Class22 aClass22_124 = Static60.method1113("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!ec;")
	public static Class22 aClass22_125 = Static60.method1113(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "[I")
	public static int[] anIntArray42 = new int[100];

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	public static int anInt379 = 0;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_126 = Static60.method1113("::noclip");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public static void method283() {
		aClass22_125 = null;
		aClass22_124 = null;
		aClass4_Sub1_Sub2_Sub3_2 = null;
		anIntArray42 = null;
		aClass4_Sub1_Sub3_Sub2_Sub1_1 = null;
		aClass22_126 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!ec;)I")
	public static int method284(@OriginalArg(1) Class22 arg0) {
		if (anInt379 == 1) {
			return 7;
		} else if (arg0.method471(Static109.aClass22_72)) {
			return 1;
		} else if (arg0.method471(Static106.aClass22_790)) {
			return 1;
		} else if (arg0.method471(Static99.aClass22_759)) {
			return 2;
		} else if (arg0.method471(Static126.aClass22_934)) {
			return 2;
		} else if (arg0.method471(Static33.aClass22_233)) {
			return 3;
		} else if (arg0.method471(Static46.aClass22_316)) {
			return 4;
		} else if (arg0.method471(Static3.aClass22_8)) {
			return 4;
		} else if (arg0.method471(Static113.aClass22_866)) {
			return 5;
		} else if (arg0.method471(Static132.aClass22_962)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	public static void method285() {
		for (@Pc(14) int local14 = 0; local14 < Static120.anInt2929; local14++) {
			@Pc(20) int local20 = Static93.anIntArray281[local14]--;
			if (Static93.anIntArray281[local14] >= -10) {
				@Pc(93) Class65 local93 = Static54.aClass65Array1[local14];
				if (local93 == null) {
					local93 = Static141.method1716(Static1.aClass20_Sub1_1, Static45.anIntArray133[local14], 0);
					if (local93 == null) {
						continue;
					}
					Static93.anIntArray281[local14] += local93.method1713();
					Static54.aClass65Array1[local14] = local93;
				}
				if (Static93.anIntArray281[local14] < 0) {
					@Pc(131) int local131;
					if (Static95.anIntArray198[local14] == 0) {
						local131 = Static57.anInt1729;
					} else {
						@Pc(141) int local141 = (Static95.anIntArray198[local14] & 0xFF) * 128;
						@Pc(149) int local149 = Static95.anIntArray198[local14] >> 16 & 0xFF;
						@Pc(159) int local159 = local149 * 128 + 64 - aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500;
						if (local159 < 0) {
							local159 = -local159;
						}
						@Pc(175) int local175 = Static95.anIntArray198[local14] >> 8 & 0xFF;
						@Pc(185) int local185 = local175 * 128 + 64 - aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462;
						if (local185 < 0) {
							local185 = -local185;
						}
						@Pc(199) int local199 = local185 + local159 - 128;
						if (local141 < local199) {
							Static93.anIntArray281[local14] = -100;
							continue;
						}
						if (local199 < 0) {
							local199 = 0;
						}
						local131 = Static95.anInt1927 * (local141 - local199) / local141;
					}
					if (local131 > 0) {
						@Pc(238) Class4_Sub13_Sub1 local238 = local93.method1715().method935(Static108.aClass23_1);
						@Pc(243) Class4_Sub4_Sub3 local243 = Static140.method1234(local238, local131);
						local243.method1232(Static105.anIntArray296[local14] - 1);
						Static32.aClass4_Sub4_Sub4_1.method1647(local243);
					}
					Static93.anIntArray281[local14] = -100;
				}
			} else {
				Static120.anInt2929--;
				for (@Pc(36) int local36 = local14; local36 < Static120.anInt2929; local36++) {
					Static45.anIntArray133[local36] = Static45.anIntArray133[local36 + 1];
					Static54.aClass65Array1[local36] = Static54.aClass65Array1[local36 + 1];
					Static105.anIntArray296[local36] = Static105.anIntArray296[local36 + 1];
					Static93.anIntArray281[local36] = Static93.anIntArray281[local36 + 1];
					Static95.anIntArray198[local36] = Static95.anIntArray198[local36 + 1];
				}
				local14--;
			}
		}
		if (Static93.aBoolean223 && !Static25.method406()) {
			if (Static133.anInt3152 != 0 && Static10.anInt209 != -1) {
				Static130.method2009(Static103.aClass20_Sub1_66, Static10.anInt209, Static133.anInt3152, 0);
			}
			Static93.aBoolean223 = false;
		}
	}
}
