import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!th", name = "k", descriptor = "I")
	public static int anInt8570 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method6995(@OriginalArg(0) Class134 arg0) {
		if (Static554.aBoolean708) {
			Static73.method592(arg0);
		} else {
			Static279.method3931(arg0);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZIII[[[Lclient!bt;)Z")
	public static boolean method7000(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class39[][][] arg4) {
		@Pc(19) byte local19 = arg0 ? 1 : (byte) (Static350.anInt5818 & 0xFF);
		if (local19 == Static165.aByteArrayArrayArray13[Static433.anInt7592][arg1][arg2]) {
			return false;
		} else if ((Static455.aByteArrayArrayArray17[Static433.anInt7592][arg1][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			Static194.anIntArray312[0] = arg1;
			@Pc(50) int local50 = 0;
			@Pc(53) int local53 = local44 + 1;
			Static577.anIntArray721[0] = arg2;
			Static165.aByteArrayArrayArray13[Static433.anInt7592][arg1][arg2] = local19;
			while (local53 != local50) {
				@Pc(71) int local71 = Static194.anIntArray312[local50] & 0xFFFF;
				@Pc(79) int local79 = Static194.anIntArray312[local50] >> 16 & 0xFF;
				@Pc(87) int local87 = Static194.anIntArray312[local50] >> 24 & 0xFF;
				@Pc(93) int local93 = Static577.anIntArray721[local50] & 0xFFFF;
				@Pc(101) int local101 = Static577.anIntArray721[local50] >> 16 & 0xFF;
				local50 = local50 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static455.aByteArrayArrayArray17[Static433.anInt7592][local71][local93] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(123) boolean local123 = false;
				@Pc(162) int local162;
				@Pc(209) int local209;
				label231: for (@Pc(127) int local127 = Static433.anInt7592 + 1; local127 <= 3; local127++) {
					if ((Static455.aByteArrayArrayArray17[local127][local71][local93] & 0x8) == 0) {
						@Pc(315) Class8_Sub3_Sub3 local315;
						@Pc(325) int local325;
						@Pc(304) Class39 local304;
						@Pc(310) Class111 local310;
						if (local109 && arg4[local127][local71][local93] != null) {
							if (arg4[local127][local71][local93].aClass8_Sub3_Sub4_1 != null) {
								local162 = Static98.method5018(local79);
								if (arg4[local127][local71][local93].aClass8_Sub3_Sub4_1.aShort116 == local162 || arg4[local127][local71][local93].aClass8_Sub3_Sub4_2 != null && local162 == arg4[local127][local71][local93].aClass8_Sub3_Sub4_2.aShort116) {
									continue;
								}
								if (local87 != 0) {
									local209 = Static98.method5018(local87);
									if (arg4[local127][local71][local93].aClass8_Sub3_Sub4_1.aShort116 == local209 || arg4[local127][local71][local93].aClass8_Sub3_Sub4_2 != null && arg4[local127][local71][local93].aClass8_Sub3_Sub4_2.aShort116 == local209) {
										continue;
									}
								}
								if (local101 != 0) {
									local209 = Static98.method5018(local101);
									if (arg4[local127][local71][local93].aClass8_Sub3_Sub4_1.aShort116 == local209 || arg4[local127][local71][local93].aClass8_Sub3_Sub4_2 != null && arg4[local127][local71][local93].aClass8_Sub3_Sub4_2.aShort116 == local209) {
										continue;
									}
								}
							}
							local304 = arg4[local127][local71][local93];
							if (local304.aClass111_1 != null) {
								for (local310 = local304.aClass111_1; local310 != null; local310 = local310.aClass111_2) {
									local315 = local310.aClass8_Sub3_Sub3_1;
									if (local315 instanceof Interface19) {
										@Pc(321) Interface19 local321 = (Interface19) local315;
										local325 = local321.method7638();
										@Pc(331) int local331 = local321.method7637();
										if (local325 == 21) {
											local325 = 19;
										}
										@Pc(344) int local344 = local325 | local331 << 6;
										if (local344 == local79 || local87 != 0 && local344 == local87 || local101 != 0 && local101 == local344) {
											continue label231;
										}
									}
								}
							}
						}
						local304 = arg4[local127][local71][local93];
						if (local304 != null && local304.aClass111_1 != null) {
							for (local310 = local304.aClass111_1; local310 != null; local310 = local310.aClass111_2) {
								local315 = local310.aClass8_Sub3_Sub3_1;
								if (local315.aShort133 != local315.aShort132 || local315.aShort131 != local315.aShort130) {
									for (@Pc(413) int local413 = local315.aShort132; local413 <= local315.aShort133; local413++) {
										for (local325 = local315.aShort131; local325 <= local315.aShort130; local325++) {
											Static165.aByteArrayArrayArray13[local127][local413][local325] = local19;
										}
									}
								}
							}
						}
						Static165.aByteArrayArrayArray13[local127][local71][local93] = local19;
						local123 = true;
					}
				}
				if (local123) {
					local162 = Static199.aClass47Array1[Static433.anInt7592 + 1].method7545(local71, local93);
					if (local162 > Static441.anIntArray644[arg3]) {
						Static441.anIntArray644[arg3] = local162;
					}
					local209 = local71 << 9;
					if (local209 < Static401.anIntArray539[arg3]) {
						Static401.anIntArray539[arg3] = local209;
					} else if (Static164.anIntArray688[arg3] < local209) {
						Static164.anIntArray688[arg3] = local209;
					}
					@Pc(524) int local524 = local93 << 9;
					if (Static109.anIntArray265[arg3] > local524) {
						Static109.anIntArray265[arg3] = local524;
					} else if (Static409.anIntArray543[arg3] < local524) {
						Static409.anIntArray543[arg3] = local524;
					}
				}
				if (!local109) {
					if (local71 >= 1 && local19 != Static165.aByteArrayArrayArray13[Static433.anInt7592][local71 - 1][local93]) {
						Static194.anIntArray312[local53] = local71 - 1 | 0x120000 | 0xD3000000;
						Static577.anIntArray721[local53] = local93 | 0x130000;
						local53 = local53 + 1 & 0xFFF;
						Static165.aByteArrayArrayArray13[Static433.anInt7592][local71 - 1][local93] = local19;
					}
					local93++;
					if (Static471.anInt8012 > local93) {
						if (local71 - 1 >= 0 && local19 != Static165.aByteArrayArrayArray13[Static433.anInt7592][local71 - 1][local93] && (Static455.aByteArrayArrayArray17[Static433.anInt7592][local71][local93] & 0x4) == 0 && (Static455.aByteArrayArrayArray17[Static433.anInt7592][local71 - 1][local93 - 1] & 0x4) == 0) {
							Static194.anIntArray312[local53] = 0x52000000 | 0x120000 | local71 - 1;
							Static577.anIntArray721[local53] = local93 | 0x130000;
							local53 = local53 + 1 & 0xFFF;
							Static165.aByteArrayArrayArray13[Static433.anInt7592][local71 - 1][local93] = local19;
						}
						if (Static165.aByteArrayArrayArray13[Static433.anInt7592][local71][local93] != local19) {
							Static194.anIntArray312[local53] = 0x13000000 | 0x520000 | local71;
							Static577.anIntArray721[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static165.aByteArrayArrayArray13[Static433.anInt7592][local71][local93] = local19;
						}
						if (local71 + 1 < Static71.anInt1410 && Static165.aByteArrayArrayArray13[Static433.anInt7592][local71 + 1][local93] != local19 && (Static455.aByteArrayArrayArray17[Static433.anInt7592][local71][local93] & 0x4) == 0 && (Static455.aByteArrayArrayArray17[Static433.anInt7592][local71 + 1][local93 - 1] & 0x4) == 0) {
							Static194.anIntArray312[local53] = local71 + 1 | 0x520000 | 0x92000000;
							Static577.anIntArray721[local53] = local93 | 0x530000;
							Static165.aByteArrayArrayArray13[Static433.anInt7592][local71 + 1][local93] = local19;
							local53 = local53 + 1 & 0xFFF;
						}
					}
					local93--;
					if (Static71.anInt1410 > local71 + 1 && local19 != Static165.aByteArrayArrayArray13[Static433.anInt7592][local71 + 1][local93]) {
						Static194.anIntArray312[local53] = local71 + 1 | 0x920000 | 0x53000000;
						Static577.anIntArray721[local53] = local93 | 0x930000;
						local53 = local53 + 1 & 0xFFF;
						Static165.aByteArrayArrayArray13[Static433.anInt7592][local71 + 1][local93] = local19;
					}
					local93--;
					if (local93 >= 0) {
						if (local71 - 1 >= 0 && local19 != Static165.aByteArrayArrayArray13[Static433.anInt7592][local71 - 1][local93] && (Static455.aByteArrayArrayArray17[Static433.anInt7592][local71][local93] & 0x4) == 0 && (Static455.aByteArrayArrayArray17[Static433.anInt7592][local71 - 1][local93 + 1] & 0x4) == 0) {
							Static194.anIntArray312[local53] = 0x12000000 | 0xD20000 | local71 - 1;
							Static577.anIntArray721[local53] = local93 | 0xD30000;
							Static165.aByteArrayArrayArray13[Static433.anInt7592][local71 - 1][local93] = local19;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local19 != Static165.aByteArrayArrayArray13[Static433.anInt7592][local71][local93]) {
							Static194.anIntArray312[local53] = local71 | 0x93000000 | 0xD20000;
							Static577.anIntArray721[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static165.aByteArrayArrayArray13[Static433.anInt7592][local71][local93] = local19;
						}
						if (Static71.anInt1410 > local71 + 1 && Static165.aByteArrayArrayArray13[Static433.anInt7592][local71 + 1][local93] != local19 && (Static455.aByteArrayArrayArray17[Static433.anInt7592][local71][local93] & 0x4) == 0 && (Static455.aByteArrayArrayArray17[Static433.anInt7592][local71 + 1][local93 + 1] & 0x4) == 0) {
							Static194.anIntArray312[local53] = local71 + 1 | 0x920000 | 0xD2000000;
							Static577.anIntArray721[local53] = local93 | 0x930000;
							Static165.aByteArrayArrayArray13[Static433.anInt7592][local71 + 1][local93] = local19;
							local53 = local53 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static441.anIntArray644[arg3] != -1000000) {
				Static441.anIntArray644[arg3] += 40;
				Static401.anIntArray539[arg3] -= 512;
				Static164.anIntArray688[arg3] += 512;
				Static409.anIntArray543[arg3] += 512;
				Static109.anIntArray265[arg3] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII)V")
	public static void method7002(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = arg2 * arg2;
		@Pc(25) int local25 = local21 << 1;
		@Pc(29) int local29 = local17 << 1;
		@Pc(33) int local33 = arg2 << 1;
		@Pc(42) int local42 = local25 + local17 * (1 - local33);
		@Pc(51) int local51 = local21 - local29 * (local33 - 1);
		@Pc(55) int local55 = local17 << 2;
		@Pc(59) int local59 = local21 << 2;
		@Pc(67) int local67 = local25 * 3;
		@Pc(75) int local75 = local29 * ((arg2 << 1) - 3);
		@Pc(81) int local81 = local59;
		@Pc(87) int local87 = (arg2 - 1) * local55;
		@Pc(102) int local102;
		@Pc(111) int local111;
		if (Static514.anInt8722 <= arg0 && Static451.anInt7775 >= arg0) {
			local102 = Static176.method2504(arg1 + arg4, Static162.anInt2935, Static270.anInt4759);
			local111 = Static176.method2504(arg1 - arg4, Static162.anInt2935, Static270.anInt4759);
			Static433.method6039(arg3, local102, Static171.anIntArrayArray79[arg0], local111);
		}
		while (local13 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local51 += local81;
					local42 += local67;
					local7++;
					local81 += local59;
					local67 += local59;
				}
			}
			if (local51 < 0) {
				local42 += local67;
				local51 += local81;
				local81 += local59;
				local7++;
				local67 += local59;
			}
			local42 += -local87;
			local51 += -local75;
			local13--;
			local87 -= local55;
			local75 -= local55;
			local102 = arg0 - local13;
			local111 = arg0 + local13;
			if (Static514.anInt8722 <= local111 && Static451.anInt7775 >= local102) {
				@Pc(221) int local221 = Static176.method2504(local7 + arg1, Static162.anInt2935, Static270.anInt4759);
				@Pc(232) int local232 = Static176.method2504(arg1 - local7, Static162.anInt2935, Static270.anInt4759);
				if (Static514.anInt8722 <= local102) {
					Static433.method6039(arg3, local221, Static171.anIntArrayArray79[local102], local232);
				}
				if (local111 <= Static451.anInt7775) {
					Static433.method6039(arg3, local221, Static171.anIntArrayArray79[local111], local232);
				}
			}
		}
	}
}
