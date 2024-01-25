import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "Lclient!ln;")
	public static Class6_Sub26 aClass6_Sub26_1;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_57 = new Class98(107, -1);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)I")
	public static int method3512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
	public static void method3515() {
		if (Static58.aClass6_Sub17_Sub1_1.method7360(Static79.anInt2700) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static114.anInt1963 - 4 & 0xFF);
		@Pc(23) int local23 = Static114.anInt1963 % Static18.anInt5706;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static80.anInt1367; local29++) {
				Static289.aByteArrayArrayArray7[local25][local23][local29] = local19;
			}
		}
		if (Static391.anInt7128 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static471.anIntArray579[local29] = -1000000;
			Static443.anIntArray562[local29] = 1000000;
			Static103.anIntArray152[local29] = 0;
			Static435.anIntArray555[local29] = 1000000;
			Static249.anIntArray376[local29] = 0;
		}
		@Pc(100) int local100;
		if (Static60.anInt1008 != 1) {
			local100 = Static37.method631(Static208.anInt3949, Static378.anInt6923, Static391.anInt7128);
			if (local100 - Static12.anInt183 < 3200 && (Static267.aByteArrayArrayArray8[Static391.anInt7128][Static378.anInt6923 >> 9][Static208.anInt3949 >> 9] & 0x4) != 0) {
				Static173.method2707(Static208.anInt3949 >> 9, Static113.aClass133ArrayArrayArray1, false, Static378.anInt6923 >> 9, 1);
				return;
			}
			return;
		}
		if ((Static267.aByteArrayArrayArray8[Static391.anInt7128][Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 >> 9][Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 >> 9] & 0x4) != 0) {
			Static173.method2707(Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 >> 9, Static113.aClass133ArrayArrayArray1, false, Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 >> 9, 0);
		}
		if (Static38.anInt742 >= 2560) {
			return;
		}
		local100 = Static378.anInt6923 >> 9;
		@Pc(177) int local177 = Static208.anInt3949 >> 9;
		@Pc(182) int local182 = Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 >> 9;
		@Pc(187) int local187 = Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 >> 9;
		@Pc(195) int local195;
		if (local182 <= local100) {
			local195 = local100 - local182;
		} else {
			local195 = local182 - local100;
		}
		@Pc(209) int local209;
		if (local187 > local177) {
			local209 = local187 - local177;
		} else {
			local209 = local177 - local187;
		}
		if (local195 == 0 && local209 == 0 || -Static18.anInt5706 >= local195 || Static18.anInt5706 <= local195 || -Static80.anInt1367 >= local209 || local209 >= Static80.anInt1367) {
			Static214.method5693("RC: " + local100 + "," + local177 + " " + local182 + "," + local187 + " " + Static150.anInt2792 + "," + Static154.anInt2878, null);
			return;
		}
		@Pc(281) int local281;
		@Pc(283) int local283;
		if (local209 >= local195) {
			local281 = local195 * 65536 / local209;
			local283 = 32768;
			while (local177 != local187) {
				if (local177 < local187) {
					local177++;
				} else if (local187 < local177) {
					local177--;
				}
				if ((Static267.aByteArrayArrayArray8[Static391.anInt7128][local100][local177] & 0x4) != 0) {
					Static173.method2707(local177, Static113.aClass133ArrayArrayArray1, false, local100, 1);
					return;
				}
				local283 += local281;
				if (local283 >= 65536) {
					local283 -= 65536;
					if (local182 > local100) {
						local100++;
					} else if (local100 > local182) {
						local100--;
					}
					if ((Static267.aByteArrayArrayArray8[Static391.anInt7128][local100][local177] & 0x4) != 0) {
						Static173.method2707(local177, Static113.aClass133ArrayArrayArray1, false, local100, 1);
						return;
					}
				}
			}
			return;
		}
		local281 = local209 * 65536 / local195;
		local283 = 32768;
		while (local182 != local100) {
			if (local100 < local182) {
				local100++;
			} else if (local100 > local182) {
				local100--;
			}
			if ((Static267.aByteArrayArrayArray8[Static391.anInt7128][local100][local177] & 0x4) != 0) {
				Static173.method2707(local177, Static113.aClass133ArrayArrayArray1, false, local100, 1);
				return;
			}
			local283 += local281;
			if (local283 >= 65536) {
				if (local187 > local177) {
					local177++;
				} else if (local177 > local187) {
					local177--;
				}
				local283 -= 65536;
				if ((Static267.aByteArrayArrayArray8[Static391.anInt7128][local100][local177] & 0x4) != 0) {
					Static173.method2707(local177, Static113.aClass133ArrayArrayArray1, false, local100, 1);
					return;
				}
			}
		}
	}
}
