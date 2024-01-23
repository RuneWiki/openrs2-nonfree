import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString29 = "rating: ";

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "Z")
	public static volatile boolean aBoolean18 = false;

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "[Lclient!t;")
	public static Class163[] aClass163Array1 = new Class163[6];

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString30 = "Loading config - ";

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZZI[[[Lclient!nh;)Z")
	public static boolean method279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4_Sub19[][][] arg4) {
		@Pc(14) byte local14 = arg2 ? 1 : (byte) (Static86.anInt1997 & 0xFF);
		if (Static9.aByteArrayArrayArray2[Static281.anInt5335][arg1][arg3] == local14) {
			return false;
		} else if ((Static174.aByteArrayArrayArray17[Static281.anInt5335][arg1][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(40) byte local40 = 0;
			Static237.anIntArray479[0] = arg1;
			@Pc(55) int local55 = 0;
			@Pc(58) int local58 = local40 + 1;
			Static141.anIntArray653[0] = arg3;
			Static9.aByteArrayArrayArray2[Static281.anInt5335][arg1][arg3] = local14;
			while (local58 != local55) {
				@Pc(77) int local77 = Static237.anIntArray479[local55] & 0xFFFF;
				@Pc(85) int local85 = Static237.anIntArray479[local55] >> 16 & 0xFF;
				@Pc(93) int local93 = Static237.anIntArray479[local55] >> 24 & 0xFF;
				@Pc(101) int local101 = Static141.anIntArray653[local55] >> 16 & 0xFF;
				@Pc(103) boolean local103 = false;
				@Pc(109) int local109 = Static141.anIntArray653[local55] & 0xFFFF;
				@Pc(111) boolean local111 = false;
				local55 = local55 + 1 & 0xFFF;
				if ((Static174.aByteArrayArrayArray17[Static281.anInt5335][local77][local109] & 0x4) == 0) {
					local103 = true;
				}
				@Pc(137) int local137;
				@Pc(176) int local176;
				label241: for (local137 = Static281.anInt5335 + 1; local137 <= 3; local137++) {
					if ((Static174.aByteArrayArrayArray17[local137][local77][local109] & 0x8) == 0) {
						@Pc(211) int local211;
						@Pc(344) int local344;
						if (local103 && arg4[local137][local77][local109] != null) {
							if (arg4[local137][local77][local109].aClass182_1 != null) {
								local176 = Static179.method2825(local85);
								if (arg4[local137][local77][local109].aClass182_1.anInt5494 == local176 || local176 == arg4[local137][local77][local109].aClass182_1.anInt5489) {
									continue;
								}
								if (local93 != 0) {
									local211 = Static179.method2825(local93);
									if (local211 == arg4[local137][local77][local109].aClass182_1.anInt5494 || arg4[local137][local77][local109].aClass182_1.anInt5489 == local211) {
										continue;
									}
								}
								if (local101 != 0) {
									local211 = Static179.method2825(local101);
									if (arg4[local137][local77][local109].aClass182_1.anInt5494 == local211 || local211 == arg4[local137][local77][local109].aClass182_1.anInt5489) {
										continue;
									}
								}
							}
							if (arg4[local137][local77][local109].aClass33Array3 != null) {
								for (local176 = 0; local176 < arg4[local137][local77][local109].anInt3554; local176++) {
									local211 = (int) (arg4[local137][local77][local109].aClass33Array3[local176].aLong38 >> 14 & 0x3FL);
									@Pc(333) int local333 = (int) (arg4[local137][local77][local109].aClass33Array3[local176].aLong38 >> 20 & 0x3L);
									if (local211 == 21) {
										local211 = 19;
									}
									local344 = local333 << 6 | local211;
									if (local85 == local344 || local93 != 0 && local344 == local93 || local101 != 0 && local101 == local344) {
										continue label241;
									}
								}
							}
						}
						local111 = true;
						@Pc(385) Class4_Sub19 local385 = arg4[local137][local77][local109];
						if (local385 != null && local385.anInt3554 > 0) {
							for (local211 = 0; local211 < local385.anInt3554; local211++) {
								@Pc(403) Class33 local403 = local385.aClass33Array3[local211];
								if (local403.anInt825 != local403.anInt824 || local403.anInt817 != local403.anInt826) {
									for (local344 = local403.anInt824; local344 <= local403.anInt825; local344++) {
										for (@Pc(432) int local432 = local403.anInt826; local432 <= local403.anInt817; local432++) {
											Static9.aByteArrayArrayArray2[local137][local344][local432] = local14;
										}
									}
								}
							}
						}
						Static9.aByteArrayArrayArray2[local137][local77][local109] = local14;
					}
				}
				if (local111) {
					if (Static212.anIntArray440[arg0] < Static243.anIntArrayArrayArray13[Static281.anInt5335 + 1][local77][local109]) {
						Static212.anIntArray440[arg0] = Static243.anIntArrayArrayArray13[Static281.anInt5335 + 1][local77][local109];
					}
					local137 = local77 << 7;
					local176 = local109 << 7;
					if (Static89.anIntArray164[arg0] > local137) {
						Static89.anIntArray164[arg0] = local137;
					} else if (local137 > Static291.anIntArray620[arg0]) {
						Static291.anIntArray620[arg0] = local137;
					}
					if (local176 < Static242.anIntArray492[arg0]) {
						Static242.anIntArray492[arg0] = local176;
					} else if (local176 > Static241.anIntArray489[arg0]) {
						Static241.anIntArray489[arg0] = local176;
					}
				}
				if (!local103) {
					if (local77 >= 1 && Static9.aByteArrayArrayArray2[Static281.anInt5335][local77 - 1][local109] != local14) {
						Static237.anIntArray479[local58] = local77 - 1 | 0x120000 | 0xD3000000;
						Static141.anIntArray653[local58] = local109 | 0x130000;
						local58 = local58 + 1 & 0xFFF;
						Static9.aByteArrayArrayArray2[Static281.anInt5335][local77 - 1][local109] = local14;
					}
					local109++;
					if (local109 < 104) {
						if (local77 - 1 >= 0 && local14 != Static9.aByteArrayArrayArray2[Static281.anInt5335][local77 - 1][local109] && (Static174.aByteArrayArrayArray17[Static281.anInt5335][local77][local109] & 0x4) == 0 && (Static174.aByteArrayArrayArray17[Static281.anInt5335][local77 - 1][local109 - 1] & 0x4) == 0) {
							Static237.anIntArray479[local58] = local77 - 1 | 0x52000000 | 0x120000;
							Static141.anIntArray653[local58] = local109 | 0x130000;
							Static9.aByteArrayArrayArray2[Static281.anInt5335][local77 - 1][local109] = local14;
							local58 = local58 + 1 & 0xFFF;
						}
						if (local14 != Static9.aByteArrayArrayArray2[Static281.anInt5335][local77][local109]) {
							Static237.anIntArray479[local58] = local77 | 0x520000 | 0x13000000;
							Static141.anIntArray653[local58] = local109 | 0x530000;
							Static9.aByteArrayArrayArray2[Static281.anInt5335][local77][local109] = local14;
							local58 = local58 + 1 & 0xFFF;
						}
						if (local77 + 1 < 104 && local14 != Static9.aByteArrayArrayArray2[Static281.anInt5335][local77 + 1][local109] && (Static174.aByteArrayArrayArray17[Static281.anInt5335][local77][local109] & 0x4) == 0 && (Static174.aByteArrayArrayArray17[Static281.anInt5335][local77 + 1][local109 - 1] & 0x4) == 0) {
							Static237.anIntArray479[local58] = local77 + 1 | 0x520000 | 0x92000000;
							Static141.anIntArray653[local58] = local109 | 0x530000;
							Static9.aByteArrayArrayArray2[Static281.anInt5335][local77 + 1][local109] = local14;
							local58 = local58 + 1 & 0xFFF;
						}
					}
					local109--;
					if (local77 + 1 < 104 && Static9.aByteArrayArrayArray2[Static281.anInt5335][local77 + 1][local109] != local14) {
						Static237.anIntArray479[local58] = local77 + 1 | 0x53000000 | 0x920000;
						Static141.anIntArray653[local58] = local109 | 0x930000;
						local58 = local58 + 1 & 0xFFF;
						Static9.aByteArrayArrayArray2[Static281.anInt5335][local77 + 1][local109] = local14;
					}
					local109--;
					if (local109 >= 0) {
						if (local77 - 1 >= 0 && Static9.aByteArrayArrayArray2[Static281.anInt5335][local77 - 1][local109] != local14 && (Static174.aByteArrayArrayArray17[Static281.anInt5335][local77][local109] & 0x4) == 0 && (Static174.aByteArrayArrayArray17[Static281.anInt5335][local77 - 1][local109 + 1] & 0x4) == 0) {
							Static237.anIntArray479[local58] = 0x12000000 | 0xD20000 | local77 - 1;
							Static141.anIntArray653[local58] = local109 | 0xD30000;
							local58 = local58 + 1 & 0xFFF;
							Static9.aByteArrayArrayArray2[Static281.anInt5335][local77 - 1][local109] = local14;
						}
						if (local14 != Static9.aByteArrayArrayArray2[Static281.anInt5335][local77][local109]) {
							Static237.anIntArray479[local58] = 0x93000000 | 0xD20000 | local77;
							Static141.anIntArray653[local58] = local109 | 0xD30000;
							local58 = local58 + 1 & 0xFFF;
							Static9.aByteArrayArrayArray2[Static281.anInt5335][local77][local109] = local14;
						}
						if (local77 + 1 < 104 && Static9.aByteArrayArrayArray2[Static281.anInt5335][local77 + 1][local109] != local14 && (Static174.aByteArrayArrayArray17[Static281.anInt5335][local77][local109] & 0x4) == 0 && (Static174.aByteArrayArrayArray17[Static281.anInt5335][local77 + 1][local109 + 1] & 0x4) == 0) {
							Static237.anIntArray479[local58] = local77 + 1 | 0xD2000000 | 0x920000;
							Static141.anIntArray653[local58] = local109 | 0x930000;
							local58 = local58 + 1 & 0xFFF;
							Static9.aByteArrayArrayArray2[Static281.anInt5335][local77 + 1][local109] = local14;
						}
					}
				}
			}
			if (Static212.anIntArray440[arg0] != -1000000) {
				Static212.anIntArray440[arg0] += 10;
				Static89.anIntArray164[arg0] -= 50;
				Static291.anIntArray620[arg0] += 50;
				Static241.anIntArray489[arg0] += 50;
				Static242.anIntArray492[arg0] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(IIIIII)V")
	public static void method280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg2;
		@Pc(15) int local15 = arg4 - arg1;
		if (local15 == 0) {
			if (local10 != 0) {
				Static22.method306(arg1, arg3, arg0, arg2);
			}
		} else if (local10 == 0) {
			Static130.method1976(arg1, arg4, arg3, arg2);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(70) boolean local70 = local10 > local15;
			@Pc(74) int local74;
			@Pc(80) int local80;
			if (local70) {
				local74 = arg1;
				arg1 = arg2;
				arg2 = local74;
				local80 = arg4;
				arg4 = arg0;
				arg0 = local80;
			}
			if (arg4 < arg1) {
				local74 = arg1;
				arg1 = arg4;
				local80 = arg2;
				arg2 = arg0;
				arg0 = local80;
				arg4 = local74;
			}
			local74 = arg2;
			local80 = arg4 - arg1;
			@Pc(115) int local115 = arg0 - arg2;
			@Pc(126) int local126 = arg0 > arg2 ? 1 : -1;
			if (local115 < 0) {
				local115 = -local115;
			}
			@Pc(137) int local137 = -(local80 >> 1);
			@Pc(141) int local141;
			if (local70) {
				for (local141 = arg1; local141 <= arg4; local141++) {
					local137 += local115;
					Static220.anIntArrayArray36[local141][local74] = arg3;
					if (local137 > 0) {
						local74 += local126;
						local137 -= local80;
					}
				}
			} else {
				for (local141 = arg1; local141 <= arg4; local141++) {
					local137 += local115;
					Static220.anIntArrayArray36[local74][local141] = arg3;
					if (local137 > 0) {
						local74 += local126;
						local137 -= local80;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILclient!fd;)V")
	public static void method281(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		if (Static12.aClass193_1 == null) {
			return;
		}
		try {
			Static12.aClass193_1.method4835(0L);
			Static12.aClass193_1.method4832(arg0, arg1.aByteArray71, 24);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIIIZ)V")
	public static void method283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg8 == arg4 && arg2 == arg7 && arg5 == arg6 && arg1 == arg0) {
			method280(arg0, arg8, arg2, arg3, arg6);
			return;
		}
		@Pc(36) int local36 = arg8;
		@Pc(38) int local38 = arg2;
		@Pc(42) int local42 = arg8 * 3;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(54) int local54 = arg5 * 3;
		@Pc(58) int local58 = arg7 * 3;
		@Pc(62) int local62 = arg1 * 3;
		@Pc(72) int local72 = local50 + arg6 - arg8 - local54;
		@Pc(81) int local81 = local58 + arg0 - local62 - arg2;
		@Pc(92) int local92 = local54 + local42 - local50 - local50;
		@Pc(103) int local103 = local62 + local46 - local58 - local58;
		@Pc(108) int local108 = local58 - local46;
		@Pc(113) int local113 = local50 - local42;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(126) int local126 = local115 * local115 >> 12;
			@Pc(132) int local132 = local115 * local126 >> 12;
			@Pc(136) int local136 = local132 * local72;
			@Pc(140) int local140 = local126 * local92;
			@Pc(144) int local144 = local113 * local115;
			@Pc(148) int local148 = local103 * local126;
			@Pc(158) int local158 = (local144 + local140 + local136 >> 12) + arg8;
			@Pc(162) int local162 = local81 * local132;
			@Pc(166) int local166 = local108 * local115;
			@Pc(176) int local176 = (local166 + local162 + local148 >> 12) + arg2;
			method280(local176, local36, local38, arg3, local158);
			local36 = local158;
			local38 = local176;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BC)B")
	public static byte method284(@OriginalArg(1) char arg0) {
		@Pc(36) byte local36;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local36 = (byte) arg0;
		} else if (arg0 == '€') {
			local36 = -128;
		} else if (arg0 == '‚') {
			local36 = -126;
		} else if (arg0 == 'ƒ') {
			local36 = -125;
		} else if (arg0 == '„') {
			local36 = -124;
		} else if (arg0 == '…') {
			local36 = -123;
		} else if (arg0 == '†') {
			local36 = -122;
		} else if (arg0 == '‡') {
			local36 = -121;
		} else if (arg0 == 'ˆ') {
			local36 = -120;
		} else if (arg0 == '‰') {
			local36 = -119;
		} else if (arg0 == 'Š') {
			local36 = -118;
		} else if (arg0 == '‹') {
			local36 = -117;
		} else if (arg0 == 'Œ') {
			local36 = -116;
		} else if (arg0 == 'Ž') {
			local36 = -114;
		} else if (arg0 == '‘') {
			local36 = -111;
		} else if (arg0 == '’') {
			local36 = -110;
		} else if (arg0 == '“') {
			local36 = -109;
		} else if (arg0 == '”') {
			local36 = -108;
		} else if (arg0 == '•') {
			local36 = -107;
		} else if (arg0 == '–') {
			local36 = -106;
		} else if (arg0 == '—') {
			local36 = -105;
		} else if (arg0 == '˜') {
			local36 = -104;
		} else if (arg0 == '™') {
			local36 = -103;
		} else if (arg0 == 'š') {
			local36 = -102;
		} else if (arg0 == '›') {
			local36 = -101;
		} else if (arg0 == 'œ') {
			local36 = -100;
		} else if (arg0 == 'ž') {
			local36 = -98;
		} else if (arg0 == 'Ÿ') {
			local36 = -97;
		} else {
			local36 = 63;
		}
		return local36;
	}
}
