import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_74 = new Class15("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_153 = new Class56(49, 6);

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_154 = new Class56(37, 7);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
	public static void method3375() {
		for (@Pc(18) Class4_Sub2_Sub1 local18 = (Class4_Sub2_Sub1) Static251.aClass244_19.method5263(); local18 != null; local18 = (Class4_Sub2_Sub1) Static251.aClass244_19.method5271()) {
			@Pc(23) Class8_Sub3_Sub5 local23 = local18.aClass8_Sub3_Sub5_1;
			if (local23.aByte99 != Static68.anInt1387 || Static265.anInt4371 > local23.anInt5790) {
				local18.method6059();
				local23.method4630();
			} else if (local23.anInt5814 <= Static265.anInt4371) {
				if (local23.anInt5794 > 0) {
					@Pc(61) Class8_Sub3_Sub1_Sub2 local61 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local23.anInt5794 - 1];
					if (local61 != null && local61.anInt7339 >= 0 && local61.anInt7339 < Static337.anInt5497 * 128 && local61.anInt7343 >= 0 && Static282.anInt4644 * 128 > local61.anInt7343) {
						local23.method4633(local61.anInt7339, Static94.method4425(local61.anInt7343, local23.aByte99, local61.anInt7339) - local23.anInt5806, Static265.anInt4371, local61.anInt7343);
					}
				}
				if (local23.anInt5794 < 0) {
					@Pc(122) int local122 = -local23.anInt5794 - 1;
					@Pc(131) Class8_Sub3_Sub1_Sub1 local131;
					if (local122 == Static12.anInt187) {
						local131 = Static401.aClass8_Sub3_Sub1_Sub1_2;
					} else {
						local131 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local122];
					}
					if (local131 != null && local131.anInt7339 >= 0 && Static337.anInt5497 * 128 > local131.anInt7339 && local131.anInt7343 >= 0 && local131.anInt7343 < Static282.anInt4644 * 128) {
						local23.method4633(local131.anInt7339, Static94.method4425(local131.anInt7343, local23.aByte99, local131.anInt7339) - local23.anInt5806, Static265.anInt4371, local131.anInt7343);
					}
				}
				local23.method4629(Static298.anInt4895);
				Static160.method3989(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!hd;I)Z")
	public static boolean method3376(@OriginalArg(0) Class110 arg0) {
		if (arg0.anInt2638 == Static367.anInt6054) {
			Static284.anInt4667 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method3377(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static125.anInt2196++;
		Static191.anInt3500 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static322.anInt5236; local7 < Static320.anInt5205; local7++) {
			@Pc(12) Class75[][] local12 = Static432.aClass75ArrayArrayArray6[local7];
			for (local14 = Static288.anInt4749; local14 < Static333.anInt5438; local14++) {
				for (@Pc(17) int local17 = Static431.anInt7346; local17 < Static217.anInt7222; local17++) {
					@Pc(24) Class75 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static458.aBooleanArrayArray8[local14 + Static387.anInt6326 - Static32.anInt531][local17 + Static387.anInt6326 - Static150.anInt2733] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean129 = true;
							local24.aBoolean128 = true;
							if (local24.aClass251_2 == null) {
								local24.aBoolean127 = false;
							} else {
								local24.aBoolean127 = true;
							}
							Static191.anInt3500++;
						} else {
							local24.aBoolean129 = false;
							local24.aBoolean128 = false;
							local24.aByte28 = 0;
							if (local14 >= Static32.anInt531 - 16 && local14 <= Static32.anInt531 + 16 && local17 >= Static150.anInt2733 - 16 && local17 <= Static150.anInt2733 + 16 && (local24.aClass8_Sub2_1 != null || local24.aClass8_Sub2_2 != null || local24.aClass8_Sub5_2 != null || local24.aClass8_Sub5_1 != null || local24.aClass8_Sub4_1 != null || local24.aClass251_2 != null)) {
								Static146.aClass28_1.method4502(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static169.aClass41Array1 == Static278.aClass41Array3;
		for (local14 = Static322.anInt5236; local14 < Static320.anInt5205; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static323.aClass135_12.method5367() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static458.aBooleanArrayArray8.length;
				if (Static288.anInt4749 + Static458.aBooleanArrayArray8.length > Static81.anInt1606) {
					local172 -= Static288.anInt4749 + Static458.aBooleanArrayArray8.length - Static81.anInt1606;
				}
				@Pc(192) int local192 = Static458.aBooleanArrayArray8[0].length;
				if (Static431.anInt7346 + Static458.aBooleanArrayArray8[0].length > Static18.anInt297) {
					local192 -= Static431.anInt7346 + Static458.aBooleanArrayArray8[0].length - Static18.anInt297;
				}
				@Pc(213) int local213 = Static442.anInt6884;
				while (true) {
					if (local213 >= local172) {
						Static146.aClass28_1.method4505(Static278.aClass41Array3[local14], local14, local161, true);
						break;
					}
					@Pc(220) int local220 = local213 + Static288.anInt4749 - Static442.anInt6884;
					for (@Pc(222) int local222 = Static182.anInt3335; local222 < local192; local222++) {
						Static399.aBooleanArrayArray7[local213][local222] = false;
						if (Static458.aBooleanArrayArray8[local213][local222]) {
							@Pc(241) int local241 = local222 + Static431.anInt7346 - Static182.anInt3335;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static432.aClass75ArrayArrayArray6[local243][local220][local241] != null && Static432.aClass75ArrayArrayArray6[local243][local220][local241].aByte29 == local14) {
									Static399.aBooleanArrayArray7[local213][local222] = Static432.aClass75ArrayArrayArray6[local243][local220][local241].aBoolean129;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static146.aClass28_1.method4505(Static278.aClass41Array3[local14], local14, local161, false);
			}
			Static146.aClass28_1.method4503();
		}
		if (!Static264.method3487(true)) {
			Static264.method3487(false);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!qn;ILclient!ya;Lclient!qn;)V")
	public static void method3379(@OriginalArg(0) Class211 arg0, @OriginalArg(2) Class135 arg1, @OriginalArg(3) Class211 arg2) {
		Static261.aClass158_9 = Static259.method3463(arg0, Static186.anInt3435);
		Static378.aClass123_7 = arg1.method5352(Static261.aClass158_9, Static465.method4468(arg2, Static186.anInt3435));
		Static221.aClass158_6 = Static259.method3463(arg0, Static433.anInt7157);
		Static283.aClass123_6 = arg1.method5352(Static221.aClass158_6, Static465.method4468(arg2, Static433.anInt7157));
		Static363.aClass158_11 = Static259.method3463(arg0, Static278.anInt4621);
		Static49.aClass123_1 = arg1.method5352(Static363.aClass158_11, Static465.method4468(arg2, Static278.anInt4621));
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V")
	public static void method3380(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static6.anInt97 == 1) {
			Static428.method5726(Static254.aClass4_Sub30_1, arg1, arg0);
		} else if (Static6.anInt97 == 2) {
			Static324.method4281(arg1, arg0);
		}
		Static6.anInt97 = 0;
		Static254.aClass4_Sub30_1 = null;
	}
}
