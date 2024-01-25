import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "Lclient!fs;")
	public static Class76 aClass76_65;

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "[I")
	public static final int[] anIntArray359 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "[Lclient!ck;")
	public static final Class38[] aClass38Array1 = new Class38[8];

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "[I")
	public static int[] anIntArray360 = new int[2];

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "Z")
	public static boolean aBoolean484 = false;

	@OriginalMember(owner = "client!pk", name = "w", descriptor = "[Lclient!vh;")
	public static final Class253[] aClass253Array1 = new Class253[2048];

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZIIIIII)V")
	public static void method4134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static352.method4768(arg1);
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg1 - arg3;
		if (local18 < 0) {
			local18 = 0;
		}
		@Pc(27) int local27 = arg1;
		@Pc(30) int local30 = -arg1;
		@Pc(32) int local32 = local18;
		@Pc(35) int local35 = -local18;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		@Pc(43) int[] local43 = Static96.anIntArrayArray21[arg5];
		@Pc(48) int local48 = arg2 - local18;
		Static251.method3640(arg2 - arg1, arg0, local48, local43);
		@Pc(65) int local65 = arg2 + local18;
		Static251.method3640(local48, arg4, local65, local43);
		Static251.method3640(local65, arg0, arg1 + arg2, local43);
		while (local27 > local14) {
			local37 += 2;
			local39 += 2;
			local30 += local37;
			local35 += local39;
			if (local35 >= 0 && local32 >= 1) {
				Static224.anIntArray288[local32] = local14;
				local32--;
				local35 -= local32 << 1;
			}
			local14++;
			@Pc(134) int[] local134;
			@Pc(141) int[] local141;
			@Pc(145) int local145;
			@Pc(149) int local149;
			@Pc(154) int local154;
			@Pc(158) int local158;
			@Pc(163) int local163;
			if (local30 >= 0) {
				local27--;
				local30 -= local27 << 1;
				if (local27 < local18) {
					local134 = Static96.anIntArrayArray21[local27 + arg5];
					local141 = Static96.anIntArrayArray21[arg5 - local27];
					local145 = Static224.anIntArray288[local27];
					local149 = local14 + arg2;
					local154 = arg2 - local14;
					local158 = local145 + arg2;
					local163 = arg2 - local145;
					Static251.method3640(local154, arg0, local163, local134);
					Static251.method3640(local163, arg4, local158, local134);
					Static251.method3640(local158, arg0, local149, local134);
					Static251.method3640(local154, arg0, local163, local141);
					Static251.method3640(local163, arg4, local158, local141);
					Static251.method3640(local158, arg0, local149, local141);
				} else {
					local134 = Static96.anIntArrayArray21[local27 + arg5];
					local141 = Static96.anIntArrayArray21[arg5 - local27];
					local145 = arg2 + local14;
					local149 = arg2 - local14;
					Static251.method3640(local149, arg0, local145, local134);
					Static251.method3640(local149, arg0, local145, local141);
				}
			}
			local134 = Static96.anIntArrayArray21[arg5 + local14];
			local141 = Static96.anIntArrayArray21[arg5 - local14];
			local145 = local27 + arg2;
			local149 = arg2 - local27;
			if (local18 <= local14) {
				Static251.method3640(local149, arg0, local145, local134);
				Static251.method3640(local149, arg0, local145, local141);
			} else {
				local154 = local32 >= local14 ? local32 : Static224.anIntArray288[local14];
				local158 = arg2 + local154;
				local163 = arg2 - local154;
				Static251.method3640(local149, arg0, local163, local134);
				Static251.method3640(local163, arg4, local158, local134);
				Static251.method3640(local158, arg0, local145, local134);
				Static251.method3640(local149, arg0, local163, local141);
				Static251.method3640(local163, arg4, local158, local141);
				Static251.method3640(local158, arg0, local145, local141);
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZIII[[[Lclient!nt;)Z")
	public static boolean method4135(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class164[][][] arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static361.anInt6264 & 0xFF);
		if (local14 == Static12.aByteArrayArrayArray1[Static263.anInt4963][arg0][arg2]) {
			return false;
		} else if ((Static79.aByteArrayArrayArray2[Static263.anInt4963][arg0][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(39) byte local39 = 0;
			@Pc(41) int local41 = 0;
			Static123.anIntArray442[0] = arg0;
			@Pc(53) int local53 = local39 + 1;
			Static407.anIntArray513[0] = arg2;
			Static12.aByteArrayArrayArray1[Static263.anInt4963][arg0][arg2] = local14;
			while (local53 != local41) {
				@Pc(71) int local71 = Static123.anIntArray442[local41] & 0xFFFF;
				@Pc(79) int local79 = Static123.anIntArray442[local41] >> 16 & 0xFF;
				@Pc(87) int local87 = Static123.anIntArray442[local41] >> 24 & 0xFF;
				@Pc(93) int local93 = Static407.anIntArray513[local41] & 0xFFFF;
				@Pc(101) int local101 = Static407.anIntArray513[local41] >> 16 & 0xFF;
				local41 = local41 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static79.aByteArrayArrayArray2[Static263.anInt4963][local71][local93] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(123) boolean local123 = false;
				@Pc(165) int local165;
				@Pc(210) int local210;
				label231: for (@Pc(127) int local127 = Static263.anInt4963 + 1; local127 <= 3; local127++) {
					if ((Static79.aByteArrayArrayArray2[local127][local71][local93] & 0x8) == 0) {
						@Pc(312) Class16_Sub1 local312;
						@Pc(322) int local322;
						@Pc(301) Class164 local301;
						@Pc(307) Class7 local307;
						if (local109 && arg4[local127][local71][local93] != null) {
							if (arg4[local127][local71][local93].aClass16_Sub5_3 != null) {
								local165 = Static265.method3818(local79);
								if (local165 == arg4[local127][local71][local93].aClass16_Sub5_3.anInt6551 || arg4[local127][local71][local93].aClass16_Sub5_2 != null && arg4[local127][local71][local93].aClass16_Sub5_2.anInt6551 == local165) {
									continue;
								}
								if (local87 != 0) {
									local210 = Static265.method3818(local87);
									if (arg4[local127][local71][local93].aClass16_Sub5_3.anInt6551 == local210 || arg4[local127][local71][local93].aClass16_Sub5_2 != null && arg4[local127][local71][local93].aClass16_Sub5_2.anInt6551 == local210) {
										continue;
									}
								}
								if (local101 != 0) {
									local210 = Static265.method3818(local101);
									if (local210 == arg4[local127][local71][local93].aClass16_Sub5_3.anInt6551 || arg4[local127][local71][local93].aClass16_Sub5_2 != null && local210 == arg4[local127][local71][local93].aClass16_Sub5_2.anInt6551) {
										continue;
									}
								}
							}
							local301 = arg4[local127][local71][local93];
							if (local301.aClass7_3 != null) {
								for (local307 = local301.aClass7_3; local307 != null; local307 = local307.aClass7_1) {
									local312 = local307.aClass16_Sub1_1;
									if (local312 instanceof Interface6) {
										@Pc(318) Interface6 local318 = (Interface6) local312;
										local322 = local318.method5354();
										@Pc(326) int local326 = local318.method5347();
										if (local322 == 21) {
											local322 = 19;
										}
										@Pc(337) int local337 = local322 | local326 << 6;
										if (local337 == local79 || local87 != 0 && local87 == local337 || local101 != 0 && local337 == local101) {
											continue label231;
										}
									}
								}
							}
						}
						local301 = arg4[local127][local71][local93];
						if (local301 != null && local301.aClass7_3 != null) {
							for (local307 = local301.aClass7_3; local307 != null; local307 = local307.aClass7_1) {
								local312 = local307.aClass16_Sub1_1;
								if (local312.aShort94 != local312.aShort97 || local312.aShort96 != local312.aShort95) {
									for (@Pc(399) int local399 = local312.aShort94; local399 <= local312.aShort97; local399++) {
										for (local322 = local312.aShort96; local322 <= local312.aShort95; local322++) {
											Static12.aByteArrayArrayArray1[local127][local399][local322] = local14;
										}
									}
								}
							}
						}
						local123 = true;
						Static12.aByteArrayArrayArray1[local127][local71][local93] = local14;
					}
				}
				if (local123) {
					local165 = Static417.aClass65Array4[Static263.anInt4963 + 1].l(local71, local93);
					if (anIntArray360[arg3] < local165) {
						anIntArray360[arg3] = local165;
					}
					local210 = local71 << 7;
					if (Static21.anIntArray19[arg3] > local210) {
						Static21.anIntArray19[arg3] = local210;
					} else if (Static443.anIntArray549[arg3] < local210) {
						Static443.anIntArray549[arg3] = local210;
					}
					@Pc(505) int local505 = local93 << 7;
					if (Static52.anIntArray53[arg3] > local505) {
						Static52.anIntArray53[arg3] = local505;
					} else if (Static316.anIntArray376[arg3] < local505) {
						Static316.anIntArray376[arg3] = local505;
					}
				}
				if (!local109) {
					if (local71 >= 1 && Static12.aByteArrayArrayArray1[Static263.anInt4963][local71 - 1][local93] != local14) {
						Static123.anIntArray442[local53] = local71 - 1 | 0x120000 | 0xD3000000;
						Static407.anIntArray513[local53] = local93 | 0x130000;
						local53 = local53 + 1 & 0xFFF;
						Static12.aByteArrayArrayArray1[Static263.anInt4963][local71 - 1][local93] = local14;
					}
					local93++;
					if (local93 < Static283.anInt5187) {
						if (local71 - 1 >= 0 && local14 != Static12.aByteArrayArrayArray1[Static263.anInt4963][local71 - 1][local93] && (Static79.aByteArrayArrayArray2[Static263.anInt4963][local71][local93] & 0x4) == 0 && (Static79.aByteArrayArrayArray2[Static263.anInt4963][local71 - 1][local93 - 1] & 0x4) == 0) {
							Static123.anIntArray442[local53] = local71 - 1 | 0x120000 | 0x52000000;
							Static407.anIntArray513[local53] = local93 | 0x130000;
							Static12.aByteArrayArrayArray1[Static263.anInt4963][local71 - 1][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local14 != Static12.aByteArrayArrayArray1[Static263.anInt4963][local71][local93]) {
							Static123.anIntArray442[local53] = 0x13000000 | 0x520000 | local71;
							Static407.anIntArray513[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static12.aByteArrayArrayArray1[Static263.anInt4963][local71][local93] = local14;
						}
						if (Static326.anInt5666 > local71 + 1 && local14 != Static12.aByteArrayArrayArray1[Static263.anInt4963][local71 + 1][local93] && (Static79.aByteArrayArrayArray2[Static263.anInt4963][local71][local93] & 0x4) == 0 && (Static79.aByteArrayArrayArray2[Static263.anInt4963][local71 + 1][local93 - 1] & 0x4) == 0) {
							Static123.anIntArray442[local53] = local71 + 1 | 0x520000 | 0x92000000;
							Static407.anIntArray513[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static12.aByteArrayArrayArray1[Static263.anInt4963][local71 + 1][local93] = local14;
						}
					}
					local93--;
					if (local71 + 1 < Static326.anInt5666 && local14 != Static12.aByteArrayArrayArray1[Static263.anInt4963][local71 + 1][local93]) {
						Static123.anIntArray442[local53] = local71 + 1 | 0x53000000 | 0x920000;
						Static407.anIntArray513[local53] = local93 | 0x930000;
						Static12.aByteArrayArrayArray1[Static263.anInt4963][local71 + 1][local93] = local14;
						local53 = local53 + 1 & 0xFFF;
					}
					local93--;
					if (local93 >= 0) {
						if (local71 - 1 >= 0 && local14 != Static12.aByteArrayArrayArray1[Static263.anInt4963][local71 - 1][local93] && (Static79.aByteArrayArrayArray2[Static263.anInt4963][local71][local93] & 0x4) == 0 && (Static79.aByteArrayArrayArray2[Static263.anInt4963][local71 - 1][local93 + 1] & 0x4) == 0) {
							Static123.anIntArray442[local53] = 0x12000000 | 0xD20000 | local71 - 1;
							Static407.anIntArray513[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static12.aByteArrayArrayArray1[Static263.anInt4963][local71 - 1][local93] = local14;
						}
						if (Static12.aByteArrayArrayArray1[Static263.anInt4963][local71][local93] != local14) {
							Static123.anIntArray442[local53] = local71 | 0xD20000 | 0x93000000;
							Static407.anIntArray513[local53] = local93 | 0xD30000;
							Static12.aByteArrayArrayArray1[Static263.anInt4963][local71][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local71 + 1 < Static326.anInt5666 && local14 != Static12.aByteArrayArrayArray1[Static263.anInt4963][local71 + 1][local93] && (Static79.aByteArrayArrayArray2[Static263.anInt4963][local71][local93] & 0x4) == 0 && (Static79.aByteArrayArrayArray2[Static263.anInt4963][local71 + 1][local93 + 1] & 0x4) == 0) {
							Static123.anIntArray442[local53] = 0xD2000000 | 0x920000 | local71 + 1;
							Static407.anIntArray513[local53] = local93 | 0x930000;
							local53 = local53 + 1 & 0xFFF;
							Static12.aByteArrayArrayArray1[Static263.anInt4963][local71 + 1][local93] = local14;
						}
					}
				}
			}
			if (anIntArray360[arg3] != -1000000) {
				anIntArray360[arg3] += 10;
				Static21.anIntArray19[arg3] -= 50;
				Static443.anIntArray549[arg3] += 50;
				Static316.anIntArray376[arg3] += 50;
				Static52.anIntArray53[arg3] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)I")
	public static int method4142(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
	public static void method4146() {
		if (Static238.anInt4506 == 5) {
			Static238.anInt4506 = 6;
		}
	}
}
