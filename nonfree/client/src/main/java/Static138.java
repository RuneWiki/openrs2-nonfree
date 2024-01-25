import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
	public static int anInt2879;

	@OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
	public static int anInt2875 = 0;

	@OriginalMember(owner = "client!ik", name = "Q", descriptor = "[Lclient!fp;")
	public static final Class69[] aClass69Array1 = new Class69[128];

	@OriginalMember(owner = "client!ik", name = "X", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_56 = new Class93("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)I")
	public static int method2745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static301.aClass73Array31 == null) {
			return 0;
		}
		@Pc(15) int local15 = arg1 >> 7;
		@Pc(19) int local19 = arg2 >> 7;
		if (local15 < 0 || local19 < 0 || local15 > Static95.anInt6381 - 1 || local19 > Static237.anInt4532 - 1) {
			return 0;
		}
		@Pc(48) int local48 = arg0;
		if (arg0 < 3 && (Static313.aByteArrayArrayArray12[1][local15][local19] & 0x2) != 0) {
			local48 = arg0 + 1;
		}
		return Static301.aClass73Array31[local48].method4932(arg1, arg2);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BII)I")
	public static int method2746(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static290.anIntArray423[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIII)I")
	public static int method2747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg1 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLclient!on;Lclient!on;)V")
	public static void method2748(@OriginalArg(1) Class146 arg0, @OriginalArg(2) Class146 arg1) {
		Static74.aClass2_Sub10_Sub1_2.method2049(251);
		Static74.aClass2_Sub10_Sub1_2.method4450(arg1.anInt4450);
		Static74.aClass2_Sub10_Sub1_2.method4410(arg1.anInt4478);
		Static74.aClass2_Sub10_Sub1_2.method4410(arg0.anInt4478);
		Static74.aClass2_Sub10_Sub1_2.method4435(arg0.anInt4493);
		Static74.aClass2_Sub10_Sub1_2.method4411(arg0.anInt4450);
		Static74.aClass2_Sub10_Sub1_2.method4410(arg1.anInt4493);
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V")
	public static void method2749() {
		for (@Pc(7) int local7 = 0; local7 < Static99.anInt2257; local7++) {
			@Pc(22) int local22 = Static71.anIntArray160[local7]--;
			if (Static71.anIntArray160[local7] >= -10) {
				@Pc(97) Class134 local97 = Static285.aClass134Array1[local7];
				if (local97 == null) {
					local97 = Static367.method3758(Static299.aClass191_164, Static135.anIntArray240[local7], 0);
					if (local97 == null) {
						continue;
					}
					Static71.anIntArray160[local7] += local97.method3761();
					Static285.aClass134Array1[local7] = local97;
				}
				if (Static71.anIntArray160[local7] < 0) {
					@Pc(224) int local224;
					if (Static333.anIntArray497[local7] == 0) {
						local224 = Static2.anInt65 * Static163.anIntArray156[local7] >> 8;
					} else {
						@Pc(143) int local143 = (Static333.anIntArray497[local7] & 0xFF) * 128;
						@Pc(151) int local151 = Static333.anIntArray497[local7] >> 16 & 0xFF;
						@Pc(160) int local160 = local151 * 128 + 64 - Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289;
						if (local160 < 0) {
							local160 = -local160;
						}
						@Pc(176) int local176 = Static333.anIntArray497[local7] >> 8 & 0xFF;
						@Pc(186) int local186 = local176 * 128 + 64 - Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280;
						if (local186 < 0) {
							local186 = -local186;
						}
						@Pc(197) int local197 = local160 + local186 - 128;
						if (local197 > local143) {
							Static71.anIntArray160[local7] = -100;
							continue;
						}
						if (local197 < 0) {
							local197 = 0;
						}
						local224 = Static303.anInt6082 * (local143 - local197) * Static163.anIntArray156[local7] / local143 >> 8;
					}
					if (local224 > 0) {
						@Pc(244) Class2_Sub12_Sub1 local244 = local97.method3760().method5838(Static351.aClass46_8);
						@Pc(249) Class2_Sub3_Sub2 local249 = Static360.method1696(local244, local224);
						local249.method1716(Static99.anIntArray216[local7] - 1);
						Static313.aClass2_Sub3_Sub1_2.method367(local249);
					}
					Static71.anIntArray160[local7] = -100;
				}
			} else {
				Static99.anInt2257--;
				for (@Pc(36) int local36 = local7; local36 < Static99.anInt2257; local36++) {
					Static135.anIntArray240[local36] = Static135.anIntArray240[local36 + 1];
					Static285.aClass134Array1[local36] = Static285.aClass134Array1[local36 + 1];
					Static99.anIntArray216[local36] = Static99.anIntArray216[local36 + 1];
					Static71.anIntArray160[local36] = Static71.anIntArray160[local36 + 1];
					Static333.anIntArray497[local36] = Static333.anIntArray497[local36 + 1];
					Static163.anIntArray156[local36] = Static163.anIntArray156[local36 + 1];
				}
				local7--;
			}
		}
		if (Static8.aBoolean11 && !Static185.method3334()) {
			if (Static287.anInt5818 != 0 && Static216.anInt4152 != -1) {
				Static304.method5347(Static287.anInt5818, Static216.anInt4152, Static91.aClass191_59);
			}
			Static8.aBoolean11 = false;
		} else if (Static287.anInt5818 != 0 && Static216.anInt4152 != -1 && !Static185.method3334()) {
			Static74.aClass2_Sub10_Sub1_2.method2049(49);
			Static74.aClass2_Sub10_Sub1_2.method4450(Static216.anInt4152);
			Static216.anInt4152 = -1;
		}
	}
}
