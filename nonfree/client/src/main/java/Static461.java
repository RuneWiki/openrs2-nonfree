import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString90;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "Lclient!sea;")
	public static Class308 aClass308_163;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZ[[[Lclient!wg;II)Z")
	public static boolean method6446(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class360[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(23) byte local23 = arg1 ? 1 : (byte) (Static450.anInt7909 & 0xFF);
		if (local23 == Static368.aByteArrayArrayArray12[Static240.anInt4414][arg0][arg4]) {
			return false;
		} else if ((Static85.aByteArrayArrayArray1[Static240.anInt4414][arg0][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(51) byte local51 = 0;
			Static87.anIntArray73[0] = arg0;
			@Pc(57) int local57 = 0;
			@Pc(60) int local60 = local51 + 1;
			Static271.anIntArray274[0] = arg4;
			Static368.aByteArrayArrayArray12[Static240.anInt4414][arg0][arg4] = local23;
			while (local57 != local60) {
				@Pc(78) int local78 = Static87.anIntArray73[local57] & 0xFFFF;
				@Pc(86) int local86 = Static87.anIntArray73[local57] >> 16 & 0xFF;
				@Pc(94) int local94 = Static87.anIntArray73[local57] >> 24 & 0xFF;
				@Pc(100) int local100 = Static271.anIntArray274[local57] & 0xFFFF;
				@Pc(108) int local108 = Static271.anIntArray274[local57] >> 16 & 0xFF;
				local57 = local57 + 1 & 0xFFF;
				@Pc(116) boolean local116 = false;
				if ((Static85.aByteArrayArrayArray1[Static240.anInt4414][local78][local100] & 0x4) == 0) {
					local116 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(169) int local169;
				@Pc(212) int local212;
				label231: for (@Pc(134) int local134 = Static240.anInt4414 + 1; local134 <= 3; local134++) {
					if ((Static85.aByteArrayArrayArray1[local134][local78][local100] & 0x8) == 0) {
						@Pc(313) Class11_Sub1_Sub1 local313;
						@Pc(323) int local323;
						@Pc(302) Class360 local302;
						@Pc(308) Class21 local308;
						if (local116 && arg2[local134][local78][local100] != null) {
							if (arg2[local134][local78][local100].aClass11_Sub1_Sub3_1 != null) {
								local169 = Static472.method6506(local86);
								if (arg2[local134][local78][local100].aClass11_Sub1_Sub3_1.aShort33 == local169 || arg2[local134][local78][local100].aClass11_Sub1_Sub3_2 != null && local169 == arg2[local134][local78][local100].aClass11_Sub1_Sub3_2.aShort33) {
									continue;
								}
								if (local94 != 0) {
									local212 = Static472.method6506(local94);
									if (arg2[local134][local78][local100].aClass11_Sub1_Sub3_1.aShort33 == local212 || arg2[local134][local78][local100].aClass11_Sub1_Sub3_2 != null && arg2[local134][local78][local100].aClass11_Sub1_Sub3_2.aShort33 == local212) {
										continue;
									}
								}
								if (local108 != 0) {
									local212 = Static472.method6506(local108);
									if (local212 == arg2[local134][local78][local100].aClass11_Sub1_Sub3_1.aShort33 || arg2[local134][local78][local100].aClass11_Sub1_Sub3_2 != null && local212 == arg2[local134][local78][local100].aClass11_Sub1_Sub3_2.aShort33) {
										continue;
									}
								}
							}
							local302 = arg2[local134][local78][local100];
							if (local302.aClass21_4 != null) {
								for (local308 = local302.aClass21_4; local308 != null; local308 = local308.aClass21_1) {
									local313 = local308.aClass11_Sub1_Sub1_1;
									if (local313 instanceof Interface15) {
										@Pc(319) Interface15 local319 = (Interface15) local313;
										local323 = local319.method7227();
										@Pc(327) int local327 = local319.method7230();
										if (local323 == 21) {
											local323 = 19;
										}
										@Pc(338) int local338 = local323 | local327 << 6;
										if (local86 == local338 || local94 != 0 && local338 == local94 || local108 != 0 && local338 == local108) {
											continue label231;
										}
									}
								}
							}
						}
						local302 = arg2[local134][local78][local100];
						if (local302 != null && local302.aClass21_4 != null) {
							for (local308 = local302.aClass21_4; local308 != null; local308 = local308.aClass21_1) {
								local313 = local308.aClass11_Sub1_Sub1_1;
								if (local313.aShort90 != local313.aShort91 || local313.aShort89 != local313.aShort88) {
									for (@Pc(410) int local410 = local313.aShort90; local410 <= local313.aShort91; local410++) {
										for (local323 = local313.aShort88; local323 <= local313.aShort89; local323++) {
											Static368.aByteArrayArrayArray12[local134][local410][local323] = local23;
										}
									}
								}
							}
						}
						local130 = true;
						Static368.aByteArrayArrayArray12[local134][local78][local100] = local23;
					}
				}
				if (local130) {
					local169 = Static310.aClass129Array5[Static240.anInt4414 + 1].method6481(local100, local78);
					if (Static389.anIntArray408[arg3] < local169) {
						Static389.anIntArray408[arg3] = local169;
					}
					local212 = local78 << 9;
					@Pc(493) int local493 = local100 << 9;
					if (Static142.anIntArray123[arg3] > local212) {
						Static142.anIntArray123[arg3] = local212;
					} else if (local212 > Static527.anIntArray556[arg3]) {
						Static527.anIntArray556[arg3] = local212;
					}
					if (Static584.anIntArray615[arg3] > local493) {
						Static584.anIntArray615[arg3] = local493;
					} else if (Static146.anIntArray128[arg3] < local493) {
						Static146.anIntArray128[arg3] = local493;
					}
				}
				if (!local116) {
					if (local78 >= 1 && Static368.aByteArrayArrayArray12[Static240.anInt4414][local78 - 1][local100] != local23) {
						Static87.anIntArray73[local60] = local78 - 1 | 0x120000 | 0xD3000000;
						Static271.anIntArray274[local60] = local100 | 0x130000;
						Static368.aByteArrayArrayArray12[Static240.anInt4414][local78 - 1][local100] = local23;
						local60 = local60 + 1 & 0xFFF;
					}
					local100++;
					if (local100 < Static378.anInt6747) {
						if (local78 - 1 >= 0 && Static368.aByteArrayArrayArray12[Static240.anInt4414][local78 - 1][local100] != local23 && (Static85.aByteArrayArrayArray1[Static240.anInt4414][local78][local100] & 0x4) == 0 && (Static85.aByteArrayArrayArray1[Static240.anInt4414][local78 - 1][local100 - 1] & 0x4) == 0) {
							Static87.anIntArray73[local60] = local78 - 1 | 0x120000 | 0x52000000;
							Static271.anIntArray274[local60] = local100 | 0x130000;
							local60 = local60 + 1 & 0xFFF;
							Static368.aByteArrayArrayArray12[Static240.anInt4414][local78 - 1][local100] = local23;
						}
						if (Static368.aByteArrayArrayArray12[Static240.anInt4414][local78][local100] != local23) {
							Static87.anIntArray73[local60] = 0x13000000 | 0x520000 | local78;
							Static271.anIntArray274[local60] = local100 | 0x530000;
							local60 = local60 + 1 & 0xFFF;
							Static368.aByteArrayArrayArray12[Static240.anInt4414][local78][local100] = local23;
						}
						if (local78 + 1 < Static458.anInt9736 && local23 != Static368.aByteArrayArrayArray12[Static240.anInt4414][local78 + 1][local100] && (Static85.aByteArrayArrayArray1[Static240.anInt4414][local78][local100] & 0x4) == 0 && (Static85.aByteArrayArrayArray1[Static240.anInt4414][local78 + 1][local100 - 1] & 0x4) == 0) {
							Static87.anIntArray73[local60] = local78 + 1 | 0x92000000 | 0x520000;
							Static271.anIntArray274[local60] = local100 | 0x530000;
							local60 = local60 + 1 & 0xFFF;
							Static368.aByteArrayArrayArray12[Static240.anInt4414][local78 + 1][local100] = local23;
						}
					}
					local100--;
					if (Static458.anInt9736 > local78 + 1 && local23 != Static368.aByteArrayArrayArray12[Static240.anInt4414][local78 + 1][local100]) {
						Static87.anIntArray73[local60] = local78 + 1 | 0x53000000 | 0x920000;
						Static271.anIntArray274[local60] = local100 | 0x930000;
						Static368.aByteArrayArrayArray12[Static240.anInt4414][local78 + 1][local100] = local23;
						local60 = local60 + 1 & 0xFFF;
					}
					local100--;
					if (local100 >= 0) {
						if (local78 - 1 >= 0 && local23 != Static368.aByteArrayArrayArray12[Static240.anInt4414][local78 - 1][local100] && (Static85.aByteArrayArrayArray1[Static240.anInt4414][local78][local100] & 0x4) == 0 && (Static85.aByteArrayArrayArray1[Static240.anInt4414][local78 - 1][local100 + 1] & 0x4) == 0) {
							Static87.anIntArray73[local60] = local78 - 1 | 0xD20000 | 0x12000000;
							Static271.anIntArray274[local60] = local100 | 0xD30000;
							Static368.aByteArrayArrayArray12[Static240.anInt4414][local78 - 1][local100] = local23;
							local60 = local60 + 1 & 0xFFF;
						}
						if (Static368.aByteArrayArrayArray12[Static240.anInt4414][local78][local100] != local23) {
							Static87.anIntArray73[local60] = local78 | 0xD20000 | 0x93000000;
							Static271.anIntArray274[local60] = local100 | 0xD30000;
							Static368.aByteArrayArrayArray12[Static240.anInt4414][local78][local100] = local23;
							local60 = local60 + 1 & 0xFFF;
						}
						if (Static458.anInt9736 > local78 + 1 && Static368.aByteArrayArrayArray12[Static240.anInt4414][local78 + 1][local100] != local23 && (Static85.aByteArrayArrayArray1[Static240.anInt4414][local78][local100] & 0x4) == 0 && (Static85.aByteArrayArrayArray1[Static240.anInt4414][local78 + 1][local100 + 1] & 0x4) == 0) {
							Static87.anIntArray73[local60] = 0xD2000000 | 0x920000 | local78 + 1;
							Static271.anIntArray274[local60] = local100 | 0x930000;
							Static368.aByteArrayArrayArray12[Static240.anInt4414][local78 + 1][local100] = local23;
							local60 = local60 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static389.anIntArray408[arg3] != -1000000) {
				Static389.anIntArray408[arg3] += 40;
				Static142.anIntArray123[arg3] -= 512;
				Static527.anIntArray556[arg3] += 512;
				Static146.anIntArray128[arg3] += 512;
				Static584.anIntArray615[arg3] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	public static void method6447() {
		for (@Pc(15) Class1_Sub43 local15 = (Class1_Sub43) Static64.aClass111_5.method2547(); local15 != null; local15 = (Class1_Sub43) Static64.aClass111_5.method2554()) {
			if (local15.anInt8096 > 0) {
				local15.anInt8096--;
			}
			if (local15.anInt8096 != 0) {
				if (local15.anInt8104 > 0) {
					local15.anInt8104--;
				}
				if (local15.anInt8104 == 0 && local15.anInt8101 >= 1 && local15.anInt8102 >= 1 && Static458.anInt9736 - 2 >= local15.anInt8101 && local15.anInt8102 <= Static378.anInt6747 - 2 && (local15.anInt8097 < 0 || Static523.method6290(local15.anInt8098, local15.anInt8097))) {
					Static594.method7981(local15.anInt8101, -1, local15.anInt8109, local15.anInt8098, local15.anInt8103, local15.anInt8102, local15.anInt8107, local15.anInt8097);
					local15.anInt8104 = -1;
					if (local15.anInt8097 == local15.anInt8106 && local15.anInt8106 == -1) {
						local15.method7908();
					} else if (local15.anInt8097 == local15.anInt8106 && local15.anInt8099 == local15.anInt8103 && local15.anInt8098 == local15.anInt8108) {
						local15.method7908();
					}
				}
			} else if (local15.anInt8106 < 0 || Static523.method6290(local15.anInt8108, local15.anInt8106)) {
				Static594.method7981(local15.anInt8101, -1, local15.anInt8109, local15.anInt8108, local15.anInt8099, local15.anInt8102, local15.anInt8107, local15.anInt8106);
				local15.method7908();
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIII)I")
	public static int method6448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg1 & arg2 - 1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg2 - 1 & arg0;
		@Pc(28) int local28 = Static81.method1347(local7, local17);
		@Pc(37) int local37 = Static81.method1347(local7 + 1, local17);
		@Pc(44) int local44 = Static81.method1347(local7, local17 + 1);
		@Pc(53) int local53 = Static81.method1347(local7 + 1, local17 + 1);
		@Pc(60) int local60 = Static297.method4410(arg2, local28, local37, local13);
		@Pc(67) int local67 = Static297.method4410(arg2, local44, local53, local13);
		return Static297.method4410(arg2, local60, local67, local23);
	}
}
