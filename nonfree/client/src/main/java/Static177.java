import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!iv", name = "s", descriptor = "[I")
	public static int[] anIntArray188;

	@OriginalMember(owner = "client!iv", name = "eb", descriptor = "I")
	public static int anInt2985;

	@OriginalMember(owner = "client!iv", name = "S", descriptor = "I")
	public static int anInt2973 = -1;

	@OriginalMember(owner = "client!iv", name = "n", descriptor = "(I)V")
	public static void method2527() {
		for (@Pc(7) int local7 = 0; local7 < Static109.anInt6886; local7++) {
			@Pc(13) Class269 local13 = Static86.aClass269Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(131) int local131;
			if (local13.aClass4_Sub15_Sub3_4 == null) {
				local13.anInt7336--;
				if (local13.anInt7336 < (local13.aByte104 == 2 ? -1500 : -10)) {
					local15 = true;
				} else {
					if (local13.aByte104 == 1 && local13.aClass241_1 == null) {
						local13.aClass241_1 = Static464.method5244(Static67.aClass76_19, local13.anInt7340, 0);
						if (local13.aClass241_1 == null) {
							continue;
						}
						local13.anInt7336 += local13.aClass241_1.method5246();
					} else if (local13.aByte104 == 2 && (local13.aClass4_Sub13_1 == null || local13.aClass4_Sub4_Sub1_2 == null)) {
						if (local13.aClass4_Sub13_1 == null) {
							local13.aClass4_Sub13_1 = Static68.method1316(Static312.aClass76_66, local13.anInt7340);
						}
						if (local13.aClass4_Sub13_1 == null) {
							continue;
						}
						if (local13.aClass4_Sub4_Sub1_2 == null) {
							local13.aClass4_Sub4_Sub1_2 = local13.aClass4_Sub13_1.method1322(new int[] { 22050 });
							if (local13.aClass4_Sub4_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local13.anInt7336 < 0) {
						if (local13.anInt7341 == 0) {
							local131 = local13.anInt7337 * Static323.aClass50_Sub1_1.anInt3448 >> 8;
						} else {
							@Pc(140) int local140 = local13.anInt7341 >> 24 & 0x3;
							if (local140 == Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82) {
								@Pc(159) int local159 = (local13.anInt7341 & 0xFF) << 7;
								@Pc(166) int local166 = local13.anInt7341 >> 16 & 0xFF;
								@Pc(176) int local176 = (local166 << 7) + 64 - Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893;
								if (local176 < 0) {
									local176 = -local176;
								}
								@Pc(188) int local188 = local13.anInt7341 >> 8 & 0xFF;
								@Pc(198) int local198 = (local188 << 7) + 64 - Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892;
								if (local198 < 0) {
									local198 = -local198;
								}
								@Pc(212) int local212 = local198 + local176 - 128;
								if (local212 > local159) {
									local13.anInt7336 = -99999;
									continue;
								}
								if (local212 < 0) {
									local212 = 0;
								}
								local131 = (local159 - local212) * Static323.aClass50_Sub1_1.anInt3449 * local13.anInt7337 / local159 >> 8;
							} else {
								local131 = 0;
							}
						}
						if (local131 > 0) {
							@Pc(246) Class4_Sub4_Sub1 local246 = null;
							if (local13.aByte104 == 1) {
								local246 = local13.aClass241_1.method5245().method3079(Static275.aClass261_1);
							} else if (local13.aByte104 == 2) {
								local246 = local13.aClass4_Sub4_Sub1_2;
							}
							@Pc(274) Class4_Sub15_Sub3 local274 = local13.aClass4_Sub15_Sub3_4 = Static462.method4489(local246, local131);
							local274.method4461(local13.anInt7342 - 1);
							Static360.aClass4_Sub15_Sub2_2.method2954(local274);
						}
					}
				}
			} else if (!local13.aClass4_Sub15_Sub3_4.method5683()) {
				local15 = true;
			}
			if (local15) {
				Static109.anInt6886--;
				for (local131 = local7; local131 < Static109.anInt6886; local131++) {
					Static86.aClass269Array1[local131] = Static86.aClass269Array1[local131 + 1];
				}
				local7--;
			}
		}
		if (Static436.aBoolean666 && !Static109.method5336()) {
			if (Static323.aClass50_Sub1_1.anInt3439 != 0 && Static62.anInt1117 != -1) {
				Static32.method625(Static323.aClass50_Sub1_1.anInt3439, Static62.anInt1117, Static46.aClass76_54);
			}
			Static436.aBoolean666 = false;
		} else if (Static323.aClass50_Sub1_1.anInt3439 != 0 && Static62.anInt1117 != -1 && !Static109.method5336()) {
			Static429.method5476(Static309.aClass215_67);
			Static3.aClass4_Sub12_Sub1_5.method2531(Static62.anInt1117);
			Static62.anInt1117 = -1;
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(IB)I")
	public static int method2530(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BII)I")
	public static int method2539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 24;
		@Pc(16) int local16 = 255 - local12;
		@Pc(34) int local34 = ((arg1 & 0xFF00FF) * local12 & 0xFF00FF00 | local12 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return local34 + (((arg0 & 0xFF00) * local16 & 0xFF0000 | local16 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}
}
