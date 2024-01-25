import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!tda", name = "u", descriptor = "Lclient!au;")
	public static Class23 aClass23_5;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "Lclient!ri;")
	public static final Class303 aClass303_5 = new Class303();

	@OriginalMember(owner = "client!tda", name = "q", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_99 = new Class46(18, 3);

	@OriginalMember(owner = "client!tda", name = "t", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!tda", name = "w", descriptor = "[I")
	public static final int[] anIntArray501 = new int[14];

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)V")
	public static void method7869() {
		for (@Pc(3) int local3 = 0; local3 < Static44.anInt945; local3++) {
			@Pc(11) Class166 local11 = Static13.aClass166Array1[local3];
			@Pc(13) boolean local13 = false;
			@Pc(141) int local141;
			if (local11.aClass5_Sub1_Sub4_4 == null) {
				local11.anInt4328--;
				if (local11.anInt4328 >= (local11.method3916() ? -1500 : -10)) {
					if (local11.aByte69 == 1 && local11.aClass117_1 == null) {
						local11.aClass117_1 = Static648.method2664(Static503.aClass207_106, local11.anInt4332, 0);
						if (local11.aClass117_1 == null) {
							continue;
						}
						local11.anInt4328 += local11.aClass117_1.method2665();
					} else if (local11.method3916() && (local11.aClass5_Sub29_3 == null || local11.aClass5_Sub37_Sub1_4 == null)) {
						if (local11.aClass5_Sub29_3 == null) {
							local11.aClass5_Sub29_3 = Static279.method4459(Static610.aClass207_123, local11.anInt4332);
						}
						if (local11.aClass5_Sub29_3 == null) {
							continue;
						}
						if (local11.aClass5_Sub37_Sub1_4 == null) {
							local11.aClass5_Sub37_Sub1_4 = local11.aClass5_Sub29_3.method4449(new int[] { 22050 });
							if (local11.aClass5_Sub37_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local11.anInt4328 < 0) {
						@Pc(122) int local122 = 8192;
						if (local11.anInt4327 == 0) {
							local141 = local11.anInt4335 * (local11.aByte69 == 3 ? Static97.aClass5_Sub25_8.aClass6_Sub18_3.method5120() : Static97.aClass5_Sub25_8.aClass6_Sub18_5.method5120()) >> 2;
						} else {
							@Pc(135) int local135 = local11.anInt4327 >> 24 & 0x3;
							if (local135 == Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132) {
								@Pc(150) int local150 = (local11.anInt4327 & 0xFF) << 9;
								@Pc(158) int local158 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.method1018() << 8;
								@Pc(165) int local165 = local11.anInt4327 >> 16 & 0xFF;
								@Pc(178) int local178 = (local165 << 9) + local158 + 256 - Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231;
								@Pc(185) int local185 = local11.anInt4327 >> 8 & 0xFF;
								@Pc(197) int local197 = local158 + (local185 << 9) + 256 - Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229;
								@Pc(205) int local205 = Math.abs(local178) + Math.abs(local197) - 512;
								if (local150 < local205) {
									local11.anInt4328 = -99999;
									continue;
								}
								if (local205 < 0) {
									local205 = 0;
								}
								local141 = Static97.aClass5_Sub25_8.aClass6_Sub18_4.method5120() * (local150 - local205) * local11.anInt4335 / local150 >> 2;
								if (local11.aClass4_Sub2_12 != null && local11.aClass4_Sub2_12 instanceof Class4_Sub2_Sub1) {
									@Pc(251) Class4_Sub2_Sub1 local251 = (Class4_Sub2_Sub1) local11.aClass4_Sub2_12;
									@Pc(254) short local254 = local251.aShort108;
									@Pc(257) short local257 = local251.aShort107;
								}
								if (local178 != 0 || local197 != 0) {
									@Pc(281) int local281 = -Static491.anInt8292 - (int) (Math.atan2((double) local178, (double) local197) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local281 > 8192) {
										local281 = 16384 - local281;
									}
									@Pc(297) int local297;
									if (local205 <= 0) {
										local297 = 8192;
									} else if (local205 >= 4096) {
										local297 = 16384;
									} else {
										local297 = (8192 - local205) / 4096 + 8192;
									}
									local122 = local281 * local297 / 8192 + (16384 - local297 >> 1);
								}
							} else {
								local141 = 0;
							}
						}
						if (local141 > 0) {
							@Pc(356) Class5_Sub37_Sub1 local356 = null;
							if (local11.aByte69 == 1) {
								local356 = local11.aClass117_1.method2663().method7692(Static73.aClass114_4);
							} else if (local11.method3916()) {
								local356 = local11.aClass5_Sub37_Sub1_4;
							}
							@Pc(386) Class5_Sub1_Sub4 local386 = local11.aClass5_Sub1_Sub4_4 = Static654.method7784(local356, local11.anInt4333, local141, local122);
							local386.method7765(local11.anInt4334 - 1);
							Static26.aClass5_Sub1_Sub2_1.method5055(local386);
						}
					}
				} else {
					local13 = true;
				}
			} else if (!local11.aClass5_Sub1_Sub4_4.method9048()) {
				local13 = true;
			}
			if (local13) {
				Static44.anInt945--;
				for (local141 = local3; local141 < Static44.anInt945; local141++) {
					Static13.aClass166Array1[local141] = Static13.aClass166Array1[local141 + 1];
				}
				local3--;
			}
		}
		if (Static327.aBoolean403 && !Static32.method414()) {
			if (Static97.aClass5_Sub25_8.aClass6_Sub18_1.method5120() != 0 && Static407.anInt7117 != -1) {
				if (Static503.aClass5_Sub1_Sub5_3 == null) {
					Static308.method6299(Static407.anInt7117, Static97.aClass5_Sub25_8.aClass6_Sub18_1.method5120(), Static151.aClass207_34);
				} else {
					Static342.method5123(Static407.anInt7117, Static503.aClass5_Sub1_Sub5_3, Static97.aClass5_Sub25_8.aClass6_Sub18_1.method5120(), Static151.aClass207_34);
				}
			}
			Static327.aBoolean403 = false;
			Static503.aClass5_Sub1_Sub5_3 = null;
		} else if (Static97.aClass5_Sub25_8.aClass6_Sub18_1.method5120() != 0 && Static407.anInt7117 != -1 && !Static32.method414()) {
			@Pc(460) Class5_Sub48 local460 = Static16.method232(Static101.aClass46_22, Static276.aClass251_2);
			local460.aClass5_Sub22_Sub1_2.method5949(Static407.anInt7117);
			Static277.method4436(local460);
			Static407.anInt7117 = -1;
		}
	}
}
