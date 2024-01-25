import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!km", name = "o", descriptor = "I")
	public static int anInt3863;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "Z")
	public static boolean aBoolean333 = false;

	@OriginalMember(owner = "client!km", name = "r", descriptor = "I")
	public static final int anInt3866 = 1401;

	@OriginalMember(owner = "client!km", name = "s", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_19 = new Class107(2);

	@OriginalMember(owner = "client!km", name = "t", descriptor = "[I")
	public static final int[] anIntArray292 = new int[1024];

	@OriginalMember(owner = "client!km", name = "u", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_92 = new Class140("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!km", name = "v", descriptor = "[I")
	public static final int[] anIntArray293 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)V")
	public static void method3371(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1007) {
			Static367.method5886(Static25.aClass102_11, arg0, arg1);
		} else if (arg2 == 1011) {
			Static367.method5886(Static64.aClass102_21, arg0, arg1);
		} else if (arg2 == 1012) {
			Static367.method5886(Static222.aClass102_133, arg0, arg1);
		} else if (arg2 == 1008) {
			Static367.method5886(Static132.aClass102_56, arg0, arg1);
		} else if (arg2 == 1001) {
			Static367.method5886(Static126.aClass102_52, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3373(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static209.anInt6939 >= 100 && !Static328.aBoolean597 || Static209.anInt6939 >= 200) {
			Static225.method4191(Static34.aClass140_12.method4155(Static239.anInt2803));
			return;
		}
		@Pc(29) String local29 = Static343.method3354(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(34) int local34 = 0; local34 < Static209.anInt6939; local34++) {
			@Pc(42) String local42 = Static343.method3354(Static190.aStringArray42[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static225.method4191(arg0 + Static88.aClass140_39.method4155(Static239.anInt2803));
				return;
			}
			if (Static287.aStringArray38[local34] != null) {
				local72 = Static343.method3354(Static287.aStringArray38[local34]);
				if (local72 != null && local72.equals(local29)) {
					Static225.method4191(arg0 + Static88.aClass140_39.method4155(Static239.anInt2803));
					return;
				}
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static221.anInt4878; local98++) {
			local72 = Static343.method3354(Static363.aStringArray44[local98]);
			if (local72 != null && local72.equals(local29)) {
				Static225.method4191(Static342.aClass140_155.method4155(Static239.anInt2803) + arg0 + Static275.aClass140_134.method4155(Static239.anInt2803));
				return;
			}
			if (Static213.aStringArray31[local98] != null) {
				@Pc(141) String local141 = Static343.method3354(Static213.aStringArray31[local98]);
				if (local141 != null && local141.equals(local29)) {
					Static225.method4191(Static342.aClass140_155.method4155(Static239.anInt2803) + arg0 + Static275.aClass140_134.method4155(Static239.anInt2803));
					return;
				}
			}
		}
		if (Static343.method3354(Static177.aClass1_Sub2_Sub3_Sub1_1.aString34).equals(local29)) {
			Static225.method4191(Static103.aClass140_86.method4155(Static239.anInt2803));
		} else {
			Static300.method5057(Static7.aClass157_9);
			Static197.aClass2_Sub12_Sub2_2.method3147(Static217.method4134(arg0));
			Static197.aClass2_Sub12_Sub2_2.method3156(arg0);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public static void method3374() {
		if (Static177.method3423() != 2) {
			return;
		}
		@Pc(17) byte local17 = (byte) (Static31.anInt512 - 4 & 0xFF);
		@Pc(21) int local21 = Static31.anInt512 % Static66.anInt1177;
		@Pc(27) int local27;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			for (local27 = 0; local27 < Static12.anInt213; local27++) {
				Static332.aByteArrayArrayArray12[local23][local21][local27] = local17;
			}
		}
		if (Static291.anInt5263 == 3) {
			return;
		}
		for (local27 = 0; local27 < 2; local27++) {
			Static95.anIntArray148[local27] = -1000000;
			Static129.anIntArray224[local27] = 1000000;
			Static116.anIntArray200[local27] = 0;
			Static233.anIntArray395[local27] = 1000000;
			Static247.anIntArray404[local27] = 0;
		}
		@Pc(122) int local122;
		if (Static135.anInt2910 != 1) {
			local122 = Static97.method1899(Static291.anInt5263, Static51.anInt879, Static166.anInt3804);
			if (local122 - Static23.anInt356 >= 800 || (Static243.aByteArrayArrayArray10[Static291.anInt5263][Static166.anInt3804 >> 7][Static51.anInt879 >> 7] & 0x4) == 0) {
				return;
			}
			Static53.method1173(Static196.aClass51ArrayArrayArray3, 1, false, Static166.anInt3804 >> 7, Static51.anInt879 >> 7);
			return;
		}
		if ((Static243.aByteArrayArrayArray10[Static291.anInt5263][Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 >> 7][Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 >> 7] & 0x4) != 0) {
			Static53.method1173(Static196.aClass51ArrayArrayArray3, 0, false, Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 >> 7, Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 >> 7);
		}
		if (Static168.anInt3820 >= 2560) {
			return;
		}
		local122 = Static166.anInt3804 >> 7;
		@Pc(126) int local126 = Static51.anInt879 >> 7;
		@Pc(131) int local131 = Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 >> 7;
		@Pc(136) int local136 = Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 >> 7;
		@Pc(148) int local148;
		if (local122 < local131) {
			local148 = local131 - local122;
		} else {
			local148 = local122 - local131;
		}
		@Pc(162) int local162;
		if (local126 >= local136) {
			local162 = local126 - local136;
		} else {
			local162 = local136 - local126;
		}
		if ((local148 != 0 || local162 != 0) && local148 > (-Static66.anInt1177) && local148 < Static66.anInt1177 && -Static12.anInt213 < local162 && local162 < Static12.anInt213) {
			@Pc(249) int local249;
			@Pc(251) int local251;
			if (local162 >= local148) {
				local249 = local148 * 65536 / local162;
				local251 = 32768;
				while (local126 != local136) {
					if (local126 < local136) {
						local126++;
					} else if (local136 < local126) {
						local126--;
					}
					if ((Static243.aByteArrayArrayArray10[Static291.anInt5263][local122][local126] & 0x4) != 0) {
						Static53.method1173(Static196.aClass51ArrayArrayArray3, 1, false, local122, local126);
						return;
					}
					local251 += local249;
					if (local251 >= 65536) {
						if (local122 < local131) {
							local122++;
						} else if (local122 > local131) {
							local122--;
						}
						local251 -= 65536;
						if ((Static243.aByteArrayArrayArray10[Static291.anInt5263][local122][local126] & 0x4) != 0) {
							Static53.method1173(Static196.aClass51ArrayArrayArray3, 1, false, local122, local126);
							return;
						}
					}
				}
				return;
			}
			local249 = local162 * 65536 / local148;
			local251 = 32768;
			while (local122 != local131) {
				if (local131 > local122) {
					local122++;
				} else if (local122 > local131) {
					local122--;
				}
				if ((Static243.aByteArrayArrayArray10[Static291.anInt5263][local122][local126] & 0x4) != 0) {
					Static53.method1173(Static196.aClass51ArrayArrayArray3, 1, false, local122, local126);
					return;
				}
				local251 += local249;
				if (local251 >= 65536) {
					local251 -= 65536;
					if (local126 < local136) {
						local126++;
					} else if (local126 > local136) {
						local126--;
					}
					if ((Static243.aByteArrayArrayArray10[Static291.anInt5263][local122][local126] & 0x4) != 0) {
						Static53.method1173(Static196.aClass51ArrayArrayArray3, 1, false, local122, local126);
						return;
					}
				}
			}
			return;
		}
		Static40.method506("RC: " + local122 + "," + local126 + " " + local131 + "," + local136 + " " + Static150.anInt3453 + "," + Static287.anInt5776, null);
		return;
	}
}
