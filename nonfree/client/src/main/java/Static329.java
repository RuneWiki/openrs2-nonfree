import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
	public static int anInt6018 = 0;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIII)V")
	public static void method4869(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1_Sub8_Sub9 local13 = Static465.method6470(arg2, 9);
		local13.method4833();
		local13.anInt5968 = arg1;
		local13.anInt5970 = arg0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	public static void method4870() {
		if (Static86.aClass1_Sub30_Sub1_1.method5033(Static286.anInt5239) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static450.anInt7909 - 4 & 0xFF);
		@Pc(25) int local25 = Static450.anInt7909 % Static458.anInt9736;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static378.anInt6747; local31++) {
				Static368.aByteArrayArrayArray12[local27][local25][local31] = local21;
			}
		}
		if (Static240.anInt4414 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static389.anIntArray408[local31] = -1000000;
			Static142.anIntArray123[local31] = 1000000;
			Static527.anIntArray556[local31] = 0;
			Static584.anIntArray615[local31] = 1000000;
			Static146.anIntArray128[local31] = 0;
		}
		@Pc(100) int local100 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902;
		@Pc(103) int local103 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906;
		@Pc(117) int local117;
		if (Static358.anInt9363 != 1 && Static469.anInt8080 == -1) {
			local117 = Static538.method6114(Static240.anInt4414, Static78.anInt1534, Static393.anInt6978);
			if (local117 - Static20.anInt542 < 3200 && (Static85.aByteArrayArrayArray1[Static240.anInt4414][Static393.anInt6978 >> 9][Static78.anInt1534 >> 9] & 0x4) != 0) {
				Static461.method6446(Static393.anInt6978 >> 9, false, Static568.aClass360ArrayArrayArray22, 1, Static78.anInt1534 >> 9);
				return;
			}
			return;
		}
		if (Static358.anInt9363 != 1) {
			local103 = Static434.anInt7761;
			local100 = Static469.anInt8080;
		}
		if ((Static85.aByteArrayArrayArray1[Static240.anInt4414][local100 >> 9][local103 >> 9] & 0x4) != 0) {
			Static461.method6446(local100 >> 9, false, Static568.aClass360ArrayArrayArray22, 0, local103 >> 9);
		}
		if (Static428.anInt7673 >= 2560) {
			return;
		}
		local117 = Static393.anInt6978 >> 9;
		@Pc(201) int local201 = Static78.anInt1534 >> 9;
		@Pc(205) int local205 = local100 >> 9;
		@Pc(209) int local209 = local103 >> 9;
		@Pc(217) int local217;
		if (local205 > local117) {
			local217 = local205 - local117;
		} else {
			local217 = local117 - local205;
		}
		@Pc(232) int local232;
		if (local201 >= local209) {
			local232 = local201 - local209;
		} else {
			local232 = local209 - local201;
		}
		if (local217 == 0 && local232 == 0 || -Static458.anInt9736 >= local217 || Static458.anInt9736 <= local217 || -Static378.anInt6747 >= local232 || Static378.anInt6747 <= local232) {
			Static419.method5957("RC: " + local117 + "," + local201 + " " + local205 + "," + local209 + " " + Static539.anInt9045 + "," + Static311.anInt5708, null);
			return;
		}
		@Pc(319) int local319;
		@Pc(321) int local321;
		if (local232 < local217) {
			local319 = local232 * 65536 / local217;
			local321 = 32768;
			while (local205 != local117) {
				if (local117 < local205) {
					local117++;
				} else if (local117 > local205) {
					local117--;
				}
				if ((Static85.aByteArrayArrayArray1[Static240.anInt4414][local117][local201] & 0x4) != 0) {
					Static461.method6446(local117, false, Static568.aClass360ArrayArrayArray22, 1, local201);
					return;
				}
				local321 += local319;
				if (local321 >= 65536) {
					local321 -= 65536;
					if (local209 > local201) {
						local201++;
					} else if (local209 < local201) {
						local201--;
					}
					if ((Static85.aByteArrayArrayArray1[Static240.anInt4414][local117][local201] & 0x4) != 0) {
						Static461.method6446(local117, false, Static568.aClass360ArrayArrayArray22, 1, local201);
						return;
					}
				}
			}
			return;
		}
		local319 = local217 * 65536 / local232;
		local321 = 32768;
		while (local201 != local209) {
			if (local201 < local209) {
				local201++;
			} else if (local209 < local201) {
				local201--;
			}
			if ((Static85.aByteArrayArrayArray1[Static240.anInt4414][local117][local201] & 0x4) != 0) {
				Static461.method6446(local117, false, Static568.aClass360ArrayArrayArray22, 1, local201);
				return;
			}
			local321 += local319;
			if (local321 >= 65536) {
				local321 -= 65536;
				if (local205 > local117) {
					local117++;
				} else if (local117 > local205) {
					local117--;
				}
				if ((Static85.aByteArrayArrayArray1[Static240.anInt4414][local117][local201] & 0x4) != 0) {
					Static461.method6446(local117, false, Static568.aClass360ArrayArrayArray22, 1, local201);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II[IBI)V")
	public static void method4871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		arg0--;
		@Pc(16) int local16 = arg1 - 1;
		@Pc(20) int local20 = local16 - 7;
		while (arg0 < local20) {
			@Pc(24) int local24 = arg0 + 1;
			arg2[local24] = arg3;
			@Pc(29) int local29 = local24 + 1;
			arg2[local29] = arg3;
			@Pc(34) int local34 = local29 + 1;
			arg2[local34] = arg3;
			@Pc(39) int local39 = local34 + 1;
			arg2[local39] = arg3;
			@Pc(44) int local44 = local39 + 1;
			arg2[local44] = arg3;
			@Pc(49) int local49 = local44 + 1;
			arg2[local49] = arg3;
			@Pc(54) int local54 = local49 + 1;
			arg2[local54] = arg3;
			arg0 = local54 + 1;
			arg2[arg0] = arg3;
		}
		while (arg0 < local16) {
			arg0++;
			arg2[arg0] = arg3;
		}
	}
}
