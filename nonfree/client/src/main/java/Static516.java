import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!rga", name = "G", descriptor = "I")
	public static int anInt8033;

	@OriginalMember(owner = "client!rga", name = "x", descriptor = "I")
	public static int anInt8026 = 0;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!pt;IILclient!ha;)V")
	public static void method6994(@OriginalArg(0) Class292 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(17) int local17;
		if (Static400.anIntArray443 != null && arg0.aByte106 >= arg1) {
			for (local17 = 0; local17 < Static400.anIntArray443.length; local17++) {
				if (Static400.anIntArray443[local17] != -1000000 && (arg0.anIntArray508[0] <= Static400.anIntArray443[local17] || Static400.anIntArray443[local17] >= arg0.anIntArray508[1] || arg0.anIntArray508[2] <= Static400.anIntArray443[local17] || arg0.anIntArray508[3] <= Static400.anIntArray443[local17]) && (Static54.anIntArray79[local17] >= arg0.anIntArray507[0] || Static54.anIntArray79[local17] >= arg0.anIntArray507[1] || arg0.anIntArray507[2] <= Static54.anIntArray79[local17] || Static54.anIntArray79[local17] >= arg0.anIntArray507[3]) && (Static153.anIntArray203[local17] <= arg0.anIntArray507[0] || Static153.anIntArray203[local17] <= arg0.anIntArray507[1] || arg0.anIntArray507[2] >= Static153.anIntArray203[local17] || Static153.anIntArray203[local17] <= arg0.anIntArray507[3]) && (Static152.anIntArray202[local17] >= arg0.anIntArray506[0] || arg0.anIntArray506[1] <= Static152.anIntArray202[local17] || Static152.anIntArray202[local17] >= arg0.anIntArray506[2] || Static152.anIntArray202[local17] >= arg0.anIntArray506[3]) && (arg0.anIntArray506[0] >= Static603.anIntArray653[local17] || Static603.anIntArray653[local17] <= arg0.anIntArray506[1] || arg0.anIntArray506[2] >= Static603.anIntArray653[local17] || Static603.anIntArray653[local17] <= arg0.anIntArray506[3])) {
					return;
				}
			}
		}
		@Pc(247) int local247;
		@Pc(266) int local266;
		@Pc(286) boolean local286;
		@Pc(314) float local314;
		if (arg0.aByte107 == 1) {
			local17 = arg0.aShort102 + Static112.anInt2200 - Static323.anInt5049;
			if (local17 >= 0 && local17 <= Static112.anInt2200 + Static112.anInt2200) {
				local247 = Static112.anInt2200 + arg0.aShort104 - Static417.anInt6041;
				if (local247 < 0) {
					local247 = 0;
				} else if (local247 > Static112.anInt2200 + Static112.anInt2200) {
					return;
				}
				local266 = arg0.aShort101 + Static112.anInt2200 - Static417.anInt6041;
				if (local266 > Static112.anInt2200 + Static112.anInt2200) {
					local266 = Static112.anInt2200 + Static112.anInt2200;
				} else if (local266 < 0) {
					return;
				}
				local286 = false;
				while (local266 >= local247) {
					if (Static537.aBooleanArrayArray32[local17][local247++]) {
						local286 = true;
						break;
					}
				}
				if (local286) {
					local314 = (float) (Static279.anInt4497 - arg0.anIntArray507[0]);
					if (local314 < 0.0F) {
						local314 *= -1.0F;
					}
					if (!local314 < (float) Static513.anInt8007 && (Static343.method4654(0, arg0) && (Static343.method4654(1, arg0) && (Static343.method4654(2, arg0) && Static343.method4654(3, arg0))))) {
						Static441.aClass292Array170[Static604.anInt9296++] = arg0;
					}
				}
			}
		} else if (arg0.aByte107 == 2) {
			local17 = Static112.anInt2200 + arg0.aShort104 - Static417.anInt6041;
			if (local17 >= 0 && Static112.anInt2200 + Static112.anInt2200 >= local17) {
				local247 = Static112.anInt2200 + arg0.aShort102 - Static323.anInt5049;
				if (local247 < 0) {
					local247 = 0;
				} else if (Static112.anInt2200 + Static112.anInt2200 < local247) {
					return;
				}
				local266 = Static112.anInt2200 + arg0.aShort103 - Static323.anInt5049;
				if (local266 > Static112.anInt2200 + Static112.anInt2200) {
					local266 = Static112.anInt2200 + Static112.anInt2200;
				} else if (local266 < 0) {
					return;
				}
				local286 = false;
				while (local247 <= local266) {
					if (Static537.aBooleanArrayArray32[local247++][local17]) {
						local286 = true;
						break;
					}
				}
				if (local286) {
					local314 = (float) (Static398.anInt5802 - arg0.anIntArray506[0]);
					if (local314 < 0.0F) {
						local314 *= -1.0F;
					}
					if (!(local314 < (float) Static513.anInt8007) && (Static343.method4654(0, arg0) && (Static343.method4654(1, arg0) && (Static343.method4654(2, arg0) && Static343.method4654(3, arg0))))) {
						Static441.aClass292Array170[Static604.anInt9296++] = arg0;
					}
				}
			}
		} else if (arg0.aByte107 == 16 || arg0.aByte107 == 8) {
			local17 = Static112.anInt2200 + arg0.aShort102 - Static323.anInt5049;
			if (local17 >= 0 && Static112.anInt2200 + Static112.anInt2200 >= local17) {
				local247 = Static112.anInt2200 + arg0.aShort104 - Static417.anInt6041;
				if (local247 >= 0 && local247 <= Static112.anInt2200 + Static112.anInt2200 && Static537.aBooleanArrayArray32[local17][local247]) {
					@Pc(579) float local579 = (float) (Static279.anInt4497 - arg0.anIntArray507[0]);
					if (local579 < 0.0F) {
						local579 *= -1.0F;
					}
					@Pc(596) float local596 = (float) (Static398.anInt5802 - arg0.anIntArray506[0]);
					if (local596 < 0.0F) {
						local596 *= -1.0F;
					}
					if ((!(local579 < (float) Static513.anInt8007) || !((float) Static513.anInt8007 > local596)) && (Static343.method4654(0, arg0) && (Static343.method4654(1, arg0) && (Static343.method4654(2, arg0) && Static343.method4654(3, arg0))))) {
						Static441.aClass292Array170[Static604.anInt9296++] = arg0;
					}
				}
			}
		} else if (arg0.aByte107 == 4) {
			@Pc(662) float local662 = (float) (arg0.anIntArray508[0] - Static336.anInt10628);
			if (!((float) Static127.anInt2360 >= local662)) {
				local247 = Static112.anInt2200 + arg0.aShort104 - Static417.anInt6041;
				if (local247 < 0) {
					local247 = 0;
				} else if (Static112.anInt2200 + Static112.anInt2200 < local247) {
					return;
				}
				local266 = arg0.aShort101 + Static112.anInt2200 - Static417.anInt6041;
				if (local266 > Static112.anInt2200 + Static112.anInt2200) {
					local266 = Static112.anInt2200 + Static112.anInt2200;
				} else if (local266 < 0) {
					return;
				}
				@Pc(719) int local719 = Static112.anInt2200 + arg0.aShort102 - Static323.anInt5049;
				if (local719 < 0) {
					local719 = 0;
				} else if (Static112.anInt2200 + Static112.anInt2200 < local719) {
					return;
				}
				@Pc(743) int local743 = Static112.anInt2200 + arg0.aShort103 - Static323.anInt5049;
				if (local743 > Static112.anInt2200 + Static112.anInt2200) {
					local743 = Static112.anInt2200 + Static112.anInt2200;
				} else if (local743 < 0) {
					return;
				}
				@Pc(759) boolean local759 = false;
				label283: for (@Pc(761) int local761 = local719; local761 <= local743; local761++) {
					for (@Pc(765) int local765 = local247; local765 <= local266; local765++) {
						if (Static537.aBooleanArrayArray32[local761][local765]) {
							local759 = true;
							break label283;
						}
					}
				}
				if (local759 && (Static343.method4654(0, arg0) && (Static343.method4654(1, arg0) && (Static343.method4654(2, arg0) && Static343.method4654(3, arg0))))) {
					Static441.aClass292Array170[Static604.anInt9296++] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)V")
	public static void method6996() {
		if (Static124.aClass4_Sub20_4.aClass8_Sub3_1.method2884() == 0 && Static296.anInt4684 != Static431.anInt6799) {
			Static561.method7434(11, false, Static564.anInt8658, Static390.anInt5705);
		} else {
			Static25.method572(Static582.aClass33_13);
			if (Static366.anInt5498 != Static296.anInt4684) {
				Static115.method2144();
			}
		}
	}
}
