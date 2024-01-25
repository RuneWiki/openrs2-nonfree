import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "Z")
	public static final boolean aBoolean661 = true;

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "Z")
	public static boolean aBoolean662 = false;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBI)I")
	public static int method7859(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(30) int local30 = (local12 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local12 * (arg0 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(35) int local35 = 255 - local12;
		return ((local35 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local35 * (arg1 & 0xFF00) & 0xFF0000) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)I")
	public static int method7860() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(25) boolean local25 = false;
		if (Static470.aClass100_14.aBoolean194 && !Static470.aClass100_14.aBoolean192) {
			local7 = true;
			if (Static399.aClass5_Sub28_1.anInt4840 < 512 && Static399.aClass5_Sub28_1.anInt4840 != 0) {
				local7 = false;
			}
			if (Static144.aString33.startsWith("win")) {
				local9 = true;
				local25 = true;
			} else {
				local9 = true;
			}
		}
		if (Static378.aBoolean448) {
			local9 = false;
		}
		if (Static579.aBoolean699) {
			local7 = false;
		}
		if (Static122.aBoolean166) {
			local25 = false;
		}
		if (!local7 && !local9 && !local25) {
			return Static556.method8106();
		}
		@Pc(82) int local82 = -1;
		@Pc(84) int local84 = -1;
		if (local7) {
			try {
				local82 = Static468.method6941(2, 1000);
			} catch (@Pc(93) Exception local93) {
			}
		}
		@Pc(96) int local96 = -1;
		if (local25) {
			try {
				local96 = Static468.method6941(3, 1000);
				if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() == 3) {
					@Pc(114) Class294 local114 = Static213.aClass133_5.method7281();
					@Pc(119) long local119 = local114.aLong198 & 0xFFFFFFFFFFFFL;
					@Pc(122) int local122 = local114.anInt7777;
					if (local122 == 4318) {
						local9 &= local119 >= 64425238954L;
					} else if (local122 == 4098) {
						local9 &= local119 >= 60129613779L;
					}
				}
			} catch (@Pc(154) Exception local154) {
			}
		}
		if (local9) {
			try {
				local84 = Static468.method6941(1, 1000);
			} catch (@Pc(164) Exception local164) {
			}
		}
		if (local82 == -1 && local84 == -1 && local96 == -1) {
			return Static556.method8106();
		}
		local96 = (int) ((float) local96 * 1.1F);
		local84 = (int) ((float) local84 * 1.1F);
		if (local82 > local96 && local82 > local84) {
			return Static249.method4128(local82);
		} else if (local96 > local84) {
			return Static263.method4269(3, local96);
		} else {
			return Static263.method4269(1, local84);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZIIB[[[Lclient!lo;)Z")
	public static boolean method7861(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class217[][][] arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static96.anInt1932 & 0xFF);
		if (local14 == Static105.aByteArrayArrayArray3[Static636.anInt10567][arg2][arg0]) {
			return false;
		} else if ((Static305.aByteArrayArrayArray18[Static636.anInt10567][arg2][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			Static190.anIntArray184[0] = arg2;
			@Pc(53) int local53 = local44 + 1;
			Static387.anIntArray353[0] = arg0;
			Static105.aByteArrayArrayArray3[Static636.anInt10567][arg2][arg0] = local14;
			while (local53 != local46) {
				@Pc(71) int local71 = Static190.anIntArray184[local46] & 0xFFFF;
				@Pc(79) int local79 = Static190.anIntArray184[local46] >> 16 & 0xFF;
				@Pc(87) int local87 = Static190.anIntArray184[local46] >> 24 & 0xFF;
				@Pc(93) int local93 = Static387.anIntArray353[local46] & 0xFFFF;
				@Pc(101) int local101 = Static387.anIntArray353[local46] >> 16 & 0xFF;
				local46 = local46 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static305.aByteArrayArrayArray18[Static636.anInt10567][local71][local93] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(123) boolean local123 = false;
				@Pc(129) int local129;
				@Pc(168) int local168;
				@Pc(218) int local218;
				if (arg4 != null) {
					label237: for (local129 = Static636.anInt10567 + 1; local129 <= 3; local129++) {
						if (arg4[local129] != null && (Static305.aByteArrayArrayArray18[local129][local71][local93] & 0x8) == 0) {
							@Pc(321) Class4_Sub2_Sub1 local321;
							@Pc(331) int local331;
							@Pc(310) Class217 local310;
							@Pc(316) Class290 local316;
							if (local109 && arg4[local129][local71][local93] != null) {
								if (arg4[local129][local71][local93].aClass4_Sub2_Sub4_1 != null) {
									local168 = Static527.method7825(local79);
									if (local168 == arg4[local129][local71][local93].aClass4_Sub2_Sub4_1.aShort89 || arg4[local129][local71][local93].aClass4_Sub2_Sub4_2 != null && local168 == arg4[local129][local71][local93].aClass4_Sub2_Sub4_2.aShort89) {
										continue;
									}
									if (local87 != 0) {
										local218 = Static527.method7825(local87);
										if (arg4[local129][local71][local93].aClass4_Sub2_Sub4_1.aShort89 == local218 || arg4[local129][local71][local93].aClass4_Sub2_Sub4_2 != null && local218 == arg4[local129][local71][local93].aClass4_Sub2_Sub4_2.aShort89) {
											continue;
										}
									}
									if (local101 != 0) {
										local218 = Static527.method7825(local101);
										if (local218 == arg4[local129][local71][local93].aClass4_Sub2_Sub4_1.aShort89 || arg4[local129][local71][local93].aClass4_Sub2_Sub4_2 != null && arg4[local129][local71][local93].aClass4_Sub2_Sub4_2.aShort89 == local218) {
											continue;
										}
									}
								}
								local310 = arg4[local129][local71][local93];
								if (local310.aClass290_2 != null) {
									for (local316 = local310.aClass290_2; local316 != null; local316 = local316.aClass290_3) {
										local321 = local316.aClass4_Sub2_Sub1_1;
										if (local321 instanceof Interface22) {
											@Pc(327) Interface22 local327 = (Interface22) local321;
											local331 = local327.method8493();
											if (local331 == 21) {
												local331 = 19;
											}
											@Pc(342) int local342 = local327.method8488();
											@Pc(348) int local348 = local331 | local342 << 6;
											if (local348 == local79 || local87 != 0 && local348 == local87 || local101 != 0 && local348 == local101) {
												continue label237;
											}
										}
									}
								}
							}
							local310 = arg4[local129][local71][local93];
							if (local310 != null && local310.aClass290_2 != null) {
								for (local316 = local310.aClass290_2; local316 != null; local316 = local316.aClass290_3) {
									local321 = local316.aClass4_Sub2_Sub1_1;
									if (local321.aShort109 != local321.aShort107 || local321.aShort110 != local321.aShort108) {
										for (@Pc(421) int local421 = local321.aShort107; local421 <= local321.aShort109; local421++) {
											for (local331 = local321.aShort108; local331 <= local321.aShort110; local331++) {
												Static105.aByteArrayArrayArray3[local129][local421][local331] = local14;
											}
										}
									}
								}
							}
							local123 = true;
							Static105.aByteArrayArrayArray3[local129][local71][local93] = local14;
						}
					}
				}
				if (local123) {
					local129 = Static11.aClass61Array1[Static636.anInt10567 + 1].method8580(local93, local71);
					if (Static588.anIntArray559[arg3] < local129) {
						Static588.anIntArray559[arg3] = local129;
					}
					local168 = local71 << 9;
					if (local168 < Static406.anIntArray376[arg3]) {
						Static406.anIntArray376[arg3] = local168;
					} else if (Static344.anIntArray323[arg3] < local168) {
						Static344.anIntArray323[arg3] = local168;
					}
					local218 = local93 << 9;
					if (local218 < Static502.anIntArray485[arg3]) {
						Static502.anIntArray485[arg3] = local218;
					} else if (Static194.anIntArray188[arg3] < local218) {
						Static194.anIntArray188[arg3] = local218;
					}
				}
				if (!local109) {
					if (local71 >= 1 && Static105.aByteArrayArrayArray3[Static636.anInt10567][local71 - 1][local93] != local14) {
						Static190.anIntArray184[local53] = 0xD3000000 | 0x120000 | local71 - 1;
						Static387.anIntArray353[local53] = local93 | 0x130000;
						Static105.aByteArrayArrayArray3[Static636.anInt10567][local71 - 1][local93] = local14;
						local53 = local53 + 1 & 0xFFF;
					}
					local93++;
					if (local93 < Static448.anInt7637) {
						if (local71 - 1 >= 0 && local14 != Static105.aByteArrayArrayArray3[Static636.anInt10567][local71 - 1][local93] && (Static305.aByteArrayArrayArray18[Static636.anInt10567][local71][local93] & 0x4) == 0 && (Static305.aByteArrayArrayArray18[Static636.anInt10567][local71 - 1][local93 - 1] & 0x4) == 0) {
							Static190.anIntArray184[local53] = local71 - 1 | 0x52000000 | 0x120000;
							Static387.anIntArray353[local53] = local93 | 0x130000;
							Static105.aByteArrayArrayArray3[Static636.anInt10567][local71 - 1][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (Static105.aByteArrayArrayArray3[Static636.anInt10567][local71][local93] != local14) {
							Static190.anIntArray184[local53] = local71 | 0x13000000 | 0x520000;
							Static387.anIntArray353[local53] = local93 | 0x530000;
							Static105.aByteArrayArrayArray3[Static636.anInt10567][local71][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (Static326.anInt5541 > local71 + 1 && Static105.aByteArrayArrayArray3[Static636.anInt10567][local71 + 1][local93] != local14 && (Static305.aByteArrayArrayArray18[Static636.anInt10567][local71][local93] & 0x4) == 0 && (Static305.aByteArrayArrayArray18[Static636.anInt10567][local71 + 1][local93 - 1] & 0x4) == 0) {
							Static190.anIntArray184[local53] = local71 + 1 | 0x520000 | 0x92000000;
							Static387.anIntArray353[local53] = local93 | 0x530000;
							Static105.aByteArrayArrayArray3[Static636.anInt10567][local71 + 1][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
					}
					local93--;
					if (Static326.anInt5541 > local71 + 1 && local14 != Static105.aByteArrayArrayArray3[Static636.anInt10567][local71 + 1][local93]) {
						Static190.anIntArray184[local53] = local71 + 1 | 0x920000 | 0x53000000;
						Static387.anIntArray353[local53] = local93 | 0x930000;
						local53 = local53 + 1 & 0xFFF;
						Static105.aByteArrayArrayArray3[Static636.anInt10567][local71 + 1][local93] = local14;
					}
					local93--;
					if (local93 >= 0) {
						if (local71 - 1 >= 0 && local14 != Static105.aByteArrayArrayArray3[Static636.anInt10567][local71 - 1][local93] && (Static305.aByteArrayArrayArray18[Static636.anInt10567][local71][local93] & 0x4) == 0 && (Static305.aByteArrayArrayArray18[Static636.anInt10567][local71 - 1][local93 + 1] & 0x4) == 0) {
							Static190.anIntArray184[local53] = local71 - 1 | 0xD20000 | 0x12000000;
							Static387.anIntArray353[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static105.aByteArrayArrayArray3[Static636.anInt10567][local71 - 1][local93] = local14;
						}
						if (Static105.aByteArrayArrayArray3[Static636.anInt10567][local71][local93] != local14) {
							Static190.anIntArray184[local53] = 0x93000000 | 0xD20000 | local71;
							Static387.anIntArray353[local53] = local93 | 0xD30000;
							Static105.aByteArrayArrayArray3[Static636.anInt10567][local71][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local71 + 1 < Static326.anInt5541 && Static105.aByteArrayArrayArray3[Static636.anInt10567][local71 + 1][local93] != local14 && (Static305.aByteArrayArrayArray18[Static636.anInt10567][local71][local93] & 0x4) == 0 && (Static305.aByteArrayArrayArray18[Static636.anInt10567][local71 + 1][local93 + 1] & 0x4) == 0) {
							Static190.anIntArray184[local53] = local71 + 1 | 0x920000 | 0xD2000000;
							Static387.anIntArray353[local53] = local93 | 0x930000;
							local53 = local53 + 1 & 0xFFF;
							Static105.aByteArrayArrayArray3[Static636.anInt10567][local71 + 1][local93] = local14;
						}
					}
				}
			}
			if (Static588.anIntArray559[arg3] != -1000000) {
				Static588.anIntArray559[arg3] += 40;
				Static406.anIntArray376[arg3] -= 512;
				Static344.anIntArray323[arg3] += 512;
				Static194.anIntArray188[arg3] += 512;
				Static502.anIntArray485[arg3] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILclient!la;I)Lclient!pia;")
	public static Class272 method7862(@OriginalArg(1) Class207 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method4690(arg1);
		return local8 == null ? null : new Class272(local8);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIILclient!pe;BIILclient!pe;II)V")
	public static void method7863(@OriginalArg(2) int arg0, @OriginalArg(3) Class4_Sub2_Sub1_Sub1 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class4_Sub2_Sub1_Sub1 arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg4.method1019();
		if (local7 == -1) {
			return;
		}
		@Pc(35) Class28 local35 = (Class28) Static107.aClass87_254.method1805((long) local7);
		if (local35 == null) {
			@Pc(42) Class131[] local42 = Static649.method2892(Static441.aClass207_89, local7);
			if (local42 == null) {
				return;
			}
			local35 = Static213.aClass133_5.method7297(local42[0], true);
			Static107.aClass87_254.method1792((long) local7, local35);
		}
		Static551.method8046(arg0 >> 1, arg1.anInt10229, arg1.anInt10231, arg6 >> 1, 0, arg1.method1018() * 256, arg1.aByte132);
		@Pc(90) int local90 = Static120.anIntArray136[0] + arg3 - 18;
		@Pc(100) int local100 = Static120.anIntArray136[1] + arg2 - 16 - 54;
		@Pc(108) int local108 = local90 + arg5 / 4 * 18;
		@Pc(116) int local116 = local100 + arg5 % 4 * 18;
		local35.method4040(local108, local116);
		if (arg4 == arg1) {
			Static213.aClass133_5.method7243(local108 - 1, -256, 18, local116 - 1, 18);
		}
		Static562.method5062(local116 - 1, local116 + 18, local108 + 18, local108 + -1);
		@Pc(154) Class4_Sub10 local154 = Static30.method327();
		local154.anInt8176 = local116;
		local154.anInt8178 = local116 + 16;
		local154.anInt8179 = local108 + 16;
		local154.anInt8177 = local108;
		local154.aClass4_Sub2_Sub1_Sub1_1 = arg4;
		Static609.aClass99_10.method2039(local154);
	}
}
