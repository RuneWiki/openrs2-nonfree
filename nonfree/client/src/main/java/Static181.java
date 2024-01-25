import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "Lclient!ma;")
	public static Class67 aClass67_2;

	@OriginalMember(owner = "client!lk", name = "X", descriptor = "I")
	public static int anInt3757;

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "Z")
	public static boolean aBoolean237 = false;

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[200];

	@OriginalMember(owner = "client!lk", name = "S", descriptor = "[I")
	public static final int[] anIntArray325 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!lk", name = "Y", descriptor = "Z")
	public static boolean aBoolean239 = true;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!tm;II)V")
	public static void method3498(@OriginalArg(1) Class10_Sub3_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt5961 == arg2 && arg2 != -1) {
			@Pc(94) Class79 local94 = Static233.method4080(arg2);
			@Pc(97) int local97 = local94.anInt2361;
			if (local97 == 1) {
				arg0.anInt5945 = 0;
				arg0.anInt5975 = 1;
				arg0.anInt5933 = 0;
				arg0.anInt5963 = arg1;
				arg0.anInt5968 = 0;
				Static273.method4631(arg0.anInt5908, arg0.anInt5933, arg0.anInt5910, arg0 == Static173.aClass10_Sub3_Sub3_Sub2_1, local94);
			}
			if (local97 == 2) {
				arg0.anInt5945 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt5961 == -1 || Static233.method4080(arg2).anInt2357 >= Static233.method4080(arg0.anInt5961).anInt2357) {
			arg0.anInt5945 = 0;
			arg0.anInt5933 = 0;
			arg0.anInt5961 = arg2;
			arg0.anInt5963 = arg1;
			arg0.anInt5968 = 0;
			arg0.anInt5988 = arg0.anInt5986;
			arg0.anInt5975 = 1;
			if (arg0.anInt5961 == -1) {
				return;
			}
			Static273.method4631(arg0.anInt5908, arg0.anInt5933, arg0.anInt5910, arg0 == Static173.aClass10_Sub3_Sub3_Sub2_1, Static233.method4080(arg0.anInt5961));
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
	public static void method3500() {
		Static4.aClass11_1.method213();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!mo;B)I")
	public static int method3502(@OriginalArg(0) Class143 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3736(Static210.anInt4220)) {
			local5++;
		}
		if (arg0.method3736(Static348.anInt5328)) {
			local5++;
		}
		if (arg0.method3736(Static188.anInt3870)) {
			local5++;
		}
		if (arg0.method3736(Static222.anInt4459)) {
			local5++;
		}
		if (arg0.method3736(Static133.anInt4651)) {
			local5++;
		}
		if (arg0.method3736(Static155.anInt3309)) {
			local5++;
		}
		if (arg0.method3736(Static45.anInt1146)) {
			local5++;
		}
		if (arg0.method3736(Static233.anInt4557)) {
			local5++;
		}
		if (arg0.method3736(Static155.anInt3304)) {
			local5++;
		}
		if (arg0.method3736(Static131.anInt1772)) {
			local5++;
		}
		if (arg0.method3736(Static315.anInt6454)) {
			local5++;
		}
		if (arg0.method3736(Static114.anInt2521)) {
			local5++;
		}
		if (arg0.method3736(Static137.anInt2903)) {
			local5++;
		}
		if (arg0.method3736(Static288.anInt5580)) {
			local5++;
		}
		if (arg0.method3736(Static235.anInt4621)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
	public static void method3506() {
		for (@Pc(8) int local8 = 0; local8 < Static58.anInt1401; local8++) {
			@Pc(14) int local14 = Static275.anIntArray475[local8]--;
			if (Static275.anIntArray475[local8] >= -10) {
				@Pc(95) Class91 local95 = Static251.aClass91Array2[local8];
				if (local95 == null) {
					local95 = Static359.method2708(Static54.aClass143_38, Static354.anIntArray649[local8], 0);
					if (local95 == null) {
						continue;
					}
					Static275.anIntArray475[local8] += local95.method2707();
					Static251.aClass91Array2[local8] = local95;
				}
				if (Static275.anIntArray475[local8] < 0) {
					@Pc(221) int local221;
					if (Static15.anIntArray544[local8] == 0) {
						local221 = Static282.anInt5377 * Static252.anIntArray439[local8] >> 8;
					} else {
						@Pc(138) int local138 = (Static15.anIntArray544[local8] & 0xFF) * 128;
						@Pc(146) int local146 = Static15.anIntArray544[local8] >> 16 & 0xFF;
						@Pc(156) int local156 = local146 * 128 + 64 - Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910;
						if (local156 < 0) {
							local156 = -local156;
						}
						@Pc(169) int local169 = Static15.anIntArray544[local8] >> 8 & 0xFF;
						@Pc(179) int local179 = local169 * 128 + 64 - Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908;
						if (local179 < 0) {
							local179 = -local179;
						}
						@Pc(193) int local193 = local179 + local156 - 128;
						if (local138 < local193) {
							Static275.anIntArray475[local8] = -100;
							continue;
						}
						if (local193 < 0) {
							local193 = 0;
						}
						local221 = Static252.anIntArray439[local8] * (local138 - local193) * Static78.anInt1894 / local138 >> 8;
					}
					if (local221 > 0) {
						@Pc(238) Class14_Sub11_Sub1 local238 = local95.method2706().method3344(Static290.aClass204_1);
						@Pc(243) Class14_Sub19_Sub3 local243 = Static365.method4842(local238, local221);
						local243.method4840(Static162.anIntArray300[local8] - 1);
						Static49.aClass14_Sub19_Sub2_1.method4248(local243);
					}
					Static275.anIntArray475[local8] = -100;
				}
			} else {
				Static58.anInt1401--;
				for (@Pc(30) int local30 = local8; local30 < Static58.anInt1401; local30++) {
					Static354.anIntArray649[local30] = Static354.anIntArray649[local30 + 1];
					Static251.aClass91Array2[local30] = Static251.aClass91Array2[local30 + 1];
					Static162.anIntArray300[local30] = Static162.anIntArray300[local30 + 1];
					Static275.anIntArray475[local30] = Static275.anIntArray475[local30 + 1];
					Static15.anIntArray544[local30] = Static15.anIntArray544[local30 + 1];
					Static252.anIntArray439[local30] = Static252.anIntArray439[local30 + 1];
				}
				local8--;
			}
		}
		if (Static134.aBoolean192 && !Static68.method1674()) {
			if (Static345.anInt6584 != 0 && Static313.anInt6044 != -1) {
				Static116.method2446(Static345.anInt6584, Static313.anInt6044, Static304.aClass143_106);
			}
			Static134.aBoolean192 = false;
		} else if (Static345.anInt6584 != 0 && Static313.anInt6044 != -1 && !Static68.method1674()) {
			Static164.aClass14_Sub4_Sub2_3.method2557(211);
			Static164.aClass14_Sub4_Sub2_3.method2541(Static313.anInt6044);
			Static313.anInt6044 = -1;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B[B)[B")
	public static byte[] method3507(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class14_Sub4 local13 = new Class14_Sub4(arg0);
		@Pc(17) int local17 = local13.method2548();
		@Pc(21) int local21 = local13.method2510();
		if (local21 < 0 || Static28.anInt652 != 0 && local21 > Static28.anInt652) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(37) byte[] local37 = new byte[local21];
			local13.method2518(local37, local21);
			return local37;
		} else {
			@Pc(49) int local49 = local13.method2510();
			if (local49 < 0 || Static28.anInt652 != 0 && local49 > Static28.anInt652) {
				throw new RuntimeException();
			}
			@Pc(66) byte[] local66 = new byte[local49];
			if (local17 == 1) {
				Static177.method3443(local66, local49, arg0, local21);
			} else {
				Static80.aClass124_1.method3378(local13, local66);
			}
			return local66;
		}
	}
}
