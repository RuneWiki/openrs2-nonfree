import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "Lclient!dk;")
	public static Class54 aClass54_24;

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "Lclient!vu;")
	public static Class260 aClass260_1;

	@OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
	public static int anInt1192;

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_35 = new Class211(95, -1);

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZIIII[[[Lclient!wr;)Z")
	public static boolean method959(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class270[][][] arg4) {
		@Pc(19) byte local19 = arg0 ? 1 : (byte) (Static197.anInt3347 & 0xFF);
		if (Static111.aByteArrayArrayArray1[Static61.anInt1129][arg3][arg1] == local19) {
			return false;
		} else if ((Static253.aByteArrayArrayArray11[Static61.anInt1129][arg3][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(48) byte local48 = 0;
			Static279.anIntArray547[0] = arg3;
			@Pc(54) int local54 = 0;
			@Pc(57) int local57 = local48 + 1;
			Static304.anIntArray426[0] = arg1;
			Static111.aByteArrayArrayArray1[Static61.anInt1129][arg3][arg1] = local19;
			while (local57 != local54) {
				@Pc(75) int local75 = Static279.anIntArray547[local54] & 0xFFFF;
				@Pc(83) int local83 = Static279.anIntArray547[local54] >> 16 & 0xFF;
				@Pc(91) int local91 = Static279.anIntArray547[local54] >> 24 & 0xFF;
				@Pc(97) int local97 = Static304.anIntArray426[local54] & 0xFFFF;
				@Pc(105) int local105 = Static304.anIntArray426[local54] >> 16 & 0xFF;
				local54 = local54 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static253.aByteArrayArrayArray11[Static61.anInt1129][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(172) int local172;
				@Pc(218) int local218;
				label231: for (@Pc(134) int local134 = Static61.anInt1129 + 1; local134 <= 3; local134++) {
					if ((Static253.aByteArrayArrayArray11[local134][local75][local97] & 0x8) == 0) {
						@Pc(313) Class3_Sub4 local313;
						@Pc(325) int local325;
						@Pc(302) Class270 local302;
						@Pc(308) Class241 local308;
						if (local113 && arg4[local134][local75][local97] != null) {
							if (arg4[local134][local75][local97].aClass3_Sub2_3 != null) {
								local172 = Static95.method1991(local83);
								if (local172 == arg4[local134][local75][local97].aClass3_Sub2_3.anInt6427 || arg4[local134][local75][local97].aClass3_Sub2_2 != null && local172 == arg4[local134][local75][local97].aClass3_Sub2_2.anInt6427) {
									continue;
								}
								if (local91 != 0) {
									local218 = Static95.method1991(local91);
									if (local218 == arg4[local134][local75][local97].aClass3_Sub2_3.anInt6427 || arg4[local134][local75][local97].aClass3_Sub2_2 != null && local218 == arg4[local134][local75][local97].aClass3_Sub2_2.anInt6427) {
										continue;
									}
								}
								if (local105 != 0) {
									local218 = Static95.method1991(local105);
									if (arg4[local134][local75][local97].aClass3_Sub2_3.anInt6427 == local218 || arg4[local134][local75][local97].aClass3_Sub2_2 != null && arg4[local134][local75][local97].aClass3_Sub2_2.anInt6427 == local218) {
										continue;
									}
								}
							}
							local302 = arg4[local134][local75][local97];
							if (local302.aClass241_2 != null) {
								for (local308 = local302.aClass241_2; local308 != null; local308 = local308.aClass241_1) {
									local313 = local308.aClass3_Sub4_2;
									if (local313 instanceof Interface2) {
										@Pc(319) Interface2 local319 = (Interface2) local313;
										local325 = local319.method5296();
										@Pc(329) int local329 = local319.method5298();
										if (local325 == 21) {
											local325 = 19;
										}
										@Pc(340) int local340 = local325 | local329 << 6;
										if (local83 == local340 || local91 != 0 && local340 == local91 || local105 != 0 && local105 == local340) {
											continue label231;
										}
									}
								}
							}
						}
						local302 = arg4[local134][local75][local97];
						if (local302 != null && local302.aClass241_2 != null) {
							for (local308 = local302.aClass241_2; local308 != null; local308 = local308.aClass241_1) {
								local313 = local308.aClass3_Sub4_2;
								if (local313.aShort91 != local313.aShort92 || local313.aShort89 != local313.aShort90) {
									for (@Pc(417) int local417 = local313.aShort92; local417 <= local313.aShort91; local417++) {
										for (local325 = local313.aShort89; local325 <= local313.aShort90; local325++) {
											Static111.aByteArrayArrayArray1[local134][local417][local325] = local19;
										}
									}
								}
							}
						}
						Static111.aByteArrayArrayArray1[local134][local75][local97] = local19;
						local130 = true;
					}
				}
				if (local130) {
					local172 = Static345.aClass162Array3[Static61.anInt1129 + 1].ua(local75, local97);
					if (local172 > Static90.anIntArray136[arg2]) {
						Static90.anIntArray136[arg2] = local172;
					}
					local218 = local75 << 7;
					@Pc(499) int local499 = local97 << 7;
					if (Static81.anIntArray127[arg2] > local218) {
						Static81.anIntArray127[arg2] = local218;
					} else if (local218 > Static120.anIntArray171[arg2]) {
						Static120.anIntArray171[arg2] = local218;
					}
					if (local499 < Static319.anIntArray480[arg2]) {
						Static319.anIntArray480[arg2] = local499;
					} else if (Static449.anIntArray635[arg2] < local499) {
						Static449.anIntArray635[arg2] = local499;
					}
				}
				if (!local113) {
					if (local75 >= 1 && Static111.aByteArrayArrayArray1[Static61.anInt1129][local75 - 1][local97] != local19) {
						Static279.anIntArray547[local57] = local75 - 1 | 0x120000 | 0xD3000000;
						Static304.anIntArray426[local57] = local97 | 0x130000;
						local57 = local57 + 1 & 0xFFF;
						Static111.aByteArrayArrayArray1[Static61.anInt1129][local75 - 1][local97] = local19;
					}
					@Pc(602) int local602 = ~Static426.anInt6923;
					local97++;
					if (local602 < ~local97) {
						if (local75 - 1 >= 0 && local19 != Static111.aByteArrayArrayArray1[Static61.anInt1129][local75 - 1][local97] && (Static253.aByteArrayArrayArray11[Static61.anInt1129][local75][local97] & 0x4) == 0 && (Static253.aByteArrayArrayArray11[Static61.anInt1129][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static279.anIntArray547[local57] = local75 - 1 | 0x52000000 | 0x120000;
							Static304.anIntArray426[local57] = local97 | 0x130000;
							Static111.aByteArrayArrayArray1[Static61.anInt1129][local75 - 1][local97] = local19;
							local57 = local57 + 1 & 0xFFF;
						}
						if (local19 != Static111.aByteArrayArrayArray1[Static61.anInt1129][local75][local97]) {
							Static279.anIntArray547[local57] = local75 | 0x13000000 | 0x520000;
							Static304.anIntArray426[local57] = local97 | 0x530000;
							Static111.aByteArrayArrayArray1[Static61.anInt1129][local75][local97] = local19;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static166.anInt2852 > local75 + 1 && Static111.aByteArrayArrayArray1[Static61.anInt1129][local75 + 1][local97] != local19 && (Static253.aByteArrayArrayArray11[Static61.anInt1129][local75][local97] & 0x4) == 0 && (Static253.aByteArrayArrayArray11[Static61.anInt1129][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static279.anIntArray547[local57] = local75 + 1 | 0x520000 | 0x92000000;
							Static304.anIntArray426[local57] = local97 | 0x530000;
							Static111.aByteArrayArrayArray1[Static61.anInt1129][local75 + 1][local97] = local19;
							local57 = local57 + 1 & 0xFFF;
						}
					}
					local97--;
					if (Static166.anInt2852 > local75 + 1 && Static111.aByteArrayArrayArray1[Static61.anInt1129][local75 + 1][local97] != local19) {
						Static279.anIntArray547[local57] = local75 + 1 | 0x920000 | 0x53000000;
						Static304.anIntArray426[local57] = local97 | 0x930000;
						Static111.aByteArrayArrayArray1[Static61.anInt1129][local75 + 1][local97] = local19;
						local57 = local57 + 1 & 0xFFF;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && Static111.aByteArrayArrayArray1[Static61.anInt1129][local75 - 1][local97] != local19 && (Static253.aByteArrayArrayArray11[Static61.anInt1129][local75][local97] & 0x4) == 0 && (Static253.aByteArrayArrayArray11[Static61.anInt1129][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static279.anIntArray547[local57] = local75 - 1 | 0xD20000 | 0x12000000;
							Static304.anIntArray426[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static111.aByteArrayArrayArray1[Static61.anInt1129][local75 - 1][local97] = local19;
						}
						if (local19 != Static111.aByteArrayArrayArray1[Static61.anInt1129][local75][local97]) {
							Static279.anIntArray547[local57] = local75 | 0xD20000 | 0x93000000;
							Static304.anIntArray426[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static111.aByteArrayArrayArray1[Static61.anInt1129][local75][local97] = local19;
						}
						if (local75 + 1 < Static166.anInt2852 && local19 != Static111.aByteArrayArrayArray1[Static61.anInt1129][local75 + 1][local97] && (Static253.aByteArrayArrayArray11[Static61.anInt1129][local75][local97] & 0x4) == 0 && (Static253.aByteArrayArrayArray11[Static61.anInt1129][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static279.anIntArray547[local57] = local75 + 1 | 0x920000 | 0xD2000000;
							Static304.anIntArray426[local57] = local97 | 0x930000;
							Static111.aByteArrayArrayArray1[Static61.anInt1129][local75 + 1][local97] = local19;
							local57 = local57 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static90.anIntArray136[arg2] != -1000000) {
				Static90.anIntArray136[arg2] += 10;
				Static81.anIntArray127[arg2] -= 50;
				Static120.anIntArray171[arg2] += 50;
				Static449.anIntArray635[arg2] += 50;
				Static319.anIntArray480[arg2] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "([ILclient!pg;II[II)Lclient!t;")
	public static Class35_Sub2 method962(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class163_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(15) byte[] local15 = new byte[arg3 * arg2];
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(28) int local28 = arg3 * local17 + arg4[local17];
			for (@Pc(30) int local30 = 0; local30 < arg0[local17]; local30++) {
				local15[local28++] = -1;
			}
		}
		return new Class35_Sub2(arg1, arg3, arg2, local15);
	}
}
