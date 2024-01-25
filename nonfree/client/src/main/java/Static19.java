import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_24 = new Class159("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_25 = new Class159("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "[I")
	public static final int[] anIntArray13 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!lf;B)V")
	public static void method318(@OriginalArg(0) Class4_Sub11 arg0) {
		if (arg0.aByteArray55.length - arg0.anInt3768 < 1) {
			return;
		}
		@Pc(18) int local18 = arg0.method3440();
		if (local18 < 0 || local18 > 1 || arg0.aByteArray55.length - arg0.anInt3768 < 2) {
			return;
		}
		@Pc(47) int local47 = arg0.method3401();
		if (arg0.aByteArray55.length - arg0.anInt3768 != local47 * 6) {
			return;
		}
		while (true) {
			@Pc(63) int local63;
			@Pc(67) int local67;
			do {
				do {
					do {
						if (arg0.aByteArray55.length <= arg0.anInt3768) {
							return;
						}
						local63 = arg0.method3401();
						local67 = arg0.method3418();
					} while (Static118.anIntArray244.length <= local63);
				} while (!Static169.aBooleanArray18[local63]);
			} while (Static198.method3730(local63).aChar3 == '1' && (local67 < -1 || local67 > 1));
			Static118.anIntArray244[local63] = local67;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V")
	public static void method320() {
		Static16.anInt334 = 0;
		Static235.anInt4754 = -1;
		Static261.anInt5280 = 1;
		Static23.anInt458 = -1;
		Static254.anInt2745 = 2;
		Static51.aBoolean100 = false;
		Static317.aClass193_100 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[I)[I")
	public static int[] method321(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int[] local8 = new int[1152];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 32; local20++) {
			for (@Pc(24) int local24 = 0; local24 < 36; local24++) {
				@Pc(30) int local30 = arg1[local18];
				if (local30 == 0) {
					if (local24 > 0 && arg1[local18 - 1] != 0) {
						local30 = arg0;
					} else if (local20 > 0 && arg1[local18 - 36] != 0) {
						local30 = arg0;
					} else if (local24 < 35 && arg1[local18 + 1] != 0) {
						local30 = arg0;
					} else if (local20 < 31 && arg1[local18 + 36] != 0) {
						local30 = arg0;
					}
				}
				local8[local18++] = local30;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)I")
	public static int method329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg2;
		}
		@Pc(13) int local13 = 128 - arg0;
		@Pc(27) int local27 = local13 * (arg2 & 0x7F) + (arg1 & 0x7F) * arg0 >> 7;
		@Pc(41) int local41 = local13 * (arg2 & 0x380) + (arg1 & 0x380) * arg0 >> 7;
		@Pc(56) int local56 = local13 * (arg2 & 0xFC00) + arg0 * (arg1 & 0xFC00) >> 7;
		return local27 & 0x7F | local56 & 0xFC00 | local41 & 0x380;
	}
}
