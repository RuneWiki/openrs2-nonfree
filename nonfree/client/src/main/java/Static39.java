import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
	public static int anInt742 = 0;

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[200];

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
	public static void method721() {
		if (Static261.aClass91_3 != null) {
			Static261.aClass91_3.method2302();
			Static261.aClass91_3 = null;
		}
		Static160.method2578();
		Static242.method3716();
		@Pc(18) int local18;
		for (local18 = 0; local18 < 4; local18++) {
			Static223.aClass12Array1[local18].method270();
		}
		Static284.method4439(false);
		System.gc();
		Static44.method847();
		Static111.anInt2209 = -1;
		Static64.aBoolean80 = false;
		Static243.method3737(true);
		Static255.aBoolean339 = false;
		Static50.anInt1120 = 0;
		Static105.anInt2105 = 0;
		Static218.anInt4196 = 0;
		Static269.anInt5357 = 0;
		for (local18 = 0; local18 < Static56.aClass171Array1.length; local18++) {
			Static56.aClass171Array1[local18] = null;
		}
		Static85.anInt1730 = 0;
		Static99.anInt1950 = 0;
		for (local18 = 0; local18 < 2048; local18++) {
			Static100.aClass13_Sub5_Sub1Array1[local18] = null;
			Static162.aClass4_Sub24Array1[local18] = null;
		}
		for (local18 = 0; local18 < 32768; local18++) {
			Static260.aClass13_Sub5_Sub2Array114[local18] = null;
		}
		for (local18 = 0; local18 < 4; local18++) {
			for (@Pc(113) int local113 = 0; local113 < 104; local113++) {
				for (@Pc(120) int local120 = 0; local120 < 104; local120++) {
					Static216.aClass17ArrayArrayArray1[local18][local113][local120] = null;
				}
			}
		}
		Static183.method2968();
		Static188.anInt5752 = 0;
		Static209.method3293();
		Static58.method2509(true);
		try {
			Static311.method1064("loggedout", Static95.aClass184_3.anApplet1);
		} catch (@Pc(159) Throwable local159) {
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)[F")
	public static float[] method722() {
		@Pc(7) float local7 = Static290.method4520() + Static290.method4522();
		@Pc(9) int local9 = Static290.method4521();
		@Pc(16) float local16 = (float) (local9 & 0xFF) / 255.0F;
		Static51.aFloatArray14[3] = 1.0F;
		@Pc(29) float local29 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(31) float local31 = 0.58823526F;
		@Pc(40) float local40 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		Static51.aFloatArray14[0] = local31 * Static292.aFloatArray28[0] * local29 * local7;
		Static51.aFloatArray14[1] = local7 * Static292.aFloatArray28[1] * local40 * local31;
		Static51.aFloatArray14[2] = local7 * local31 * local16 * Static292.aFloatArray28[2];
		return Static51.aFloatArray14;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)V")
	public static void method723(@OriginalArg(0) int arg0) {
		if (arg0 == Static108.anInt2152) {
			@Pc(12) Interface2 local12 = Static133.anInterface2Array1[arg0];
			local12.method4567(Static100.anInt1978);
		}
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
	public static void method725() {
		if (Static165.aBoolean213) {
			return;
		}
		Static82.aBoolean100 = true;
		if (Static115.aBoolean148) {
			Static276.aFloat156 = (int) Static276.aFloat156 + 47 & 0xFFFFFFF0;
		} else {
			Static12.aFloat9 += (12.0F - Static12.aFloat9) / 2.0F;
		}
		Static165.aBoolean213 = true;
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
	public static void method726() {
		for (@Pc(7) int local7 = 0; local7 < Static111.anInt2210; local7++) {
			@Pc(18) int local18 = Static32.anIntArray84[local7]--;
			if (Static32.anIntArray84[local7] >= -10) {
				@Pc(95) Class56 local95 = Static68.aClass56Array2[local7];
				if (local95 == null) {
					local95 = Static313.method1431(Static137.aClass22_47, Static246.anIntArray384[local7], 0);
					if (local95 == null) {
						continue;
					}
					Static32.anIntArray84[local7] += local95.method1433();
					Static68.aClass56Array2[local7] = local95;
				}
				if (Static32.anIntArray84[local7] < 0) {
					@Pc(143) int local143;
					if (Static97.anIntArray371[local7] == 0) {
						local143 = Static173.anIntArray293[local7] * Static265.anInt5214 >> 8;
					} else {
						@Pc(153) int local153 = (Static97.anIntArray371[local7] & 0xFF) * 128;
						@Pc(161) int local161 = Static97.anIntArray371[local7] >> 16 & 0xFF;
						@Pc(171) int local171 = local161 * 128 + 64 - Static72.aClass13_Sub5_Sub1_1.anInt5334;
						if (local171 < 0) {
							local171 = -local171;
						}
						@Pc(186) int local186 = Static97.anIntArray371[local7] >> 8 & 0xFF;
						@Pc(196) int local196 = local186 * 128 + 64 - Static72.aClass13_Sub5_Sub1_1.anInt5294;
						if (local196 < 0) {
							local196 = -local196;
						}
						@Pc(210) int local210 = local196 + local171 - 128;
						if (local210 > local153) {
							Static32.anIntArray84[local7] = -100;
							continue;
						}
						if (local210 < 0) {
							local210 = 0;
						}
						local143 = Static173.anIntArray293[local7] * Static192.anInt815 * (local153 - local210) / local153 >> 8;
					}
					if (local143 > 0) {
						@Pc(257) Class4_Sub5_Sub1 local257 = local95.method1434().method3689(Static93.aClass16_2);
						@Pc(262) Class4_Sub6_Sub1 local262 = Static310.method486(local257, local143);
						local262.method492(Static161.anIntArray270[local7] - 1);
						Static10.aClass4_Sub6_Sub4_1.method3731(local262);
					}
					Static32.anIntArray84[local7] = -100;
				}
			} else {
				Static111.anInt2210--;
				for (@Pc(34) int local34 = local7; local34 < Static111.anInt2210; local34++) {
					Static246.anIntArray384[local34] = Static246.anIntArray384[local34 + 1];
					Static68.aClass56Array2[local34] = Static68.aClass56Array2[local34 + 1];
					Static161.anIntArray270[local34] = Static161.anIntArray270[local34 + 1];
					Static32.anIntArray84[local34] = Static32.anIntArray84[local34 + 1];
					Static97.anIntArray371[local34] = Static97.anIntArray371[local34 + 1];
					Static173.anIntArray293[local34] = Static173.anIntArray293[local34 + 1];
				}
				local7--;
			}
		}
		if (Static64.aBoolean80 && !Static191.method3154()) {
			if (Static279.anInt5471 != 0 && Static111.anInt2209 != -1) {
				Static94.method1557(Static111.anInt2209, Static279.anInt5471, Static145.aClass22_101);
			}
			Static64.aBoolean80 = false;
		} else if (Static279.anInt5471 != 0 && Static111.anInt2209 != -1 && !Static191.method3154()) {
			Static175.aClass4_Sub24_Sub1_1.method3123(155);
			Static175.aClass4_Sub24_Sub1_1.method3066(Static111.anInt2209);
			Static111.anInt2209 = -1;
		}
	}
}
