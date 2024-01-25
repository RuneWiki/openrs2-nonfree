import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "Z")
	public static boolean aBoolean94;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
	public static int anInt1095 = 0;

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
	public static int anInt1096 = 0;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)[Lclient!vj;")
	public static Class305[] method1110() {
		return new Class305[] { Static453.aClass305_397, Static453.aClass305_398, Static317.aClass305_297, Static149.aClass305_374, Static456.aClass305_402, Static77.aClass305_77, Static425.aClass305_382, Static25.aClass305_26, Static84.aClass305_84, Static191.aClass305_454, Static285.aClass305_274, Static522.aClass305_448, Static370.aClass305_346, Static542.aClass305_466, Static4.aClass305_5, Static62.aClass305_65, Static529.aClass305_464, Static479.aClass305_419, Static184.aClass305_159, Static108.aClass305_107, Static367.aClass305_343, Static131.aClass305_120, Static284.aClass305_269, Static355.aClass305_331, Static367.aClass305_344, Static492.aClass305_427, Static317.aClass305_298, Static127.aClass305_116, Static28.aClass305_27, Static337.aClass305_318, Static46.aClass305_49, Static282.aClass305_266, Static81.aClass305_83, Static440.aClass305_393, Static93.aClass305_91, Static397.aClass305_369, Static248.aClass305_235, Static214.aClass305_202, Static39.aClass305_37, Static43.aClass305_342, Static430.aClass305_457, Static338.aClass305_160, Static330.aClass305_310, Static48.aClass305_51, Static80.aClass305_81, Static274.aClass305_261, Static410.aClass305_389, Static320.aClass305_299, Static43.aClass305_341, Static8.aClass305_6, Static190.aClass305_172, Static198.aClass305_183, Static529.aClass305_465, Static485.aClass305_368, Static509.aClass305_440, Static94.aClass305_92, Static224.aClass305_207, Static212.aClass305_198, Static67.aClass305_70, Static344.aClass305_321, Static433.aClass305_387, Static534.aClass305_456, Static142.aClass305_126, Static510.aClass305_441, Static431.aClass305_386, Static11.aClass305_17, Static473.aClass305_413, Static299.aClass305_282, Static78.aClass305_80, Static373.aClass305_349, Static70.aClass305_73, Static81.aClass305_82, Static46.aClass305_50, Static236.aClass305_224, Static541.aClass305_463, Static438.aClass305_390, Static534.aClass305_455, Static183.aClass305_158, Static344.aClass305_322, Static16.aClass305_462, Static89.aClass305_89, Static333.aClass305_314, Static544.aClass305_396, Static93.aClass305_90, Static495.aClass305_428, Static419.aClass305_381, Static483.aClass305_421, Static253.aClass305_239, Static381.aClass305_359, Static454.aClass305_401, Static297.aClass305_281, Static226.aClass305_210, Static363.aClass305_339, Static369.aClass305_345, Static210.aClass305_196, Static361.aClass305_335, Static114.aClass305_111, Static408.aClass305_377, Static348.aClass305_323, Static482.aClass305_420, Static257.aClass305_245, Static320.aClass305_300, Static211.aClass305_197, Static543.aClass305_467, Static244.aClass305_230, Static208.aClass305_190, Static137.aClass305_123, Static176.aClass305_157, Static327.aClass305_307, Static208.aClass305_189, Static75.aClass305_74, Static63.aClass305_66, Static15.aClass305_21, Static385.aClass305_361 };
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIIIII)V")
	public static void method1111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(20) int local20 = arg4 - arg0;
		@Pc(24) int local24 = arg1 - arg3;
		if (local20 == 0) {
			if (local24 != 0) {
				Static506.method7744(arg1, arg3, arg0, arg2);
			}
		} else if (local24 == 0) {
			Static179.method3512(arg3, arg4, arg0, arg2);
		} else {
			@Pc(56) int local56 = (local24 << 12) / local20;
			@Pc(65) int local65 = arg3 - (local56 * arg0 >> 12);
			@Pc(78) int local78;
			@Pc(76) int local76;
			if (Static325.anInt6148 > arg4) {
				local76 = (local56 * Static325.anInt6148 >> 12) + local65;
				local78 = Static325.anInt6148;
			} else if (arg4 <= Static119.anInt2469) {
				local76 = arg1;
				local78 = arg4;
			} else {
				local78 = Static119.anInt2469;
				local76 = local65 + (local56 * Static119.anInt2469 >> 12);
			}
			@Pc(108) int local108;
			@Pc(116) int local116;
			if (arg0 < Static325.anInt6148) {
				local108 = Static325.anInt6148;
				local116 = (Static325.anInt6148 * local56 >> 12) + local65;
			} else if (Static119.anInt2469 >= arg0) {
				local108 = arg0;
				local116 = arg3;
			} else {
				local108 = Static119.anInt2469;
				local116 = local65 + (Static119.anInt2469 * local56 >> 12);
			}
			if (Static94.anInt2057 > local116) {
				local116 = Static94.anInt2057;
				local108 = (Static94.anInt2057 - local65 << 12) / local56;
			} else if (Static187.anInt3872 < local116) {
				local116 = Static187.anInt3872;
				local108 = (Static187.anInt3872 - local65 << 12) / local56;
			}
			if (Static94.anInt2057 > local76) {
				local78 = (Static94.anInt2057 - local65 << 12) / local56;
				local76 = Static94.anInt2057;
			} else if (Static187.anInt3872 < local76) {
				local78 = (Static187.anInt3872 - local65 << 12) / local56;
				local76 = Static187.anInt3872;
			}
			Static271.method4830(local78, local116, local76, arg2, local108);
		}
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
	public static void method1112() {
		@Pc(9) int[] local9 = new int[Static181.aClass316_1.anInt9398];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static181.aClass316_1.anInt9398; local13++) {
			@Pc(20) Class180 local20 = Static181.aClass316_1.method8107(local13);
			if (local20.anInt5410 >= 0 || local20.anInt5439 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static388.anIntArray669 = new int[local11];
		for (@Pc(41) int local41 = 0; local41 < local11; local41++) {
			Static388.anIntArray669[local41] = local9[local41];
		}
	}
}
