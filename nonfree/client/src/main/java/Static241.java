import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
	public static int anInt4874 = -1;

	@OriginalMember(owner = "client!pj", name = "E", descriptor = "Z")
	public static boolean aBoolean366 = true;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[[[Lclient!ls;)V")
	public static void method4294(@OriginalArg(1) Class128[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class128[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class128 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass8_Sub5_1 instanceof Interface7) {
							((Interface7) local27.aClass8_Sub5_1).method5587();
						}
						if (local27.aClass8_Sub2_1 instanceof Interface7) {
							((Interface7) local27.aClass8_Sub2_1).method5587();
						}
						if (local27.aClass8_Sub2_2 instanceof Interface7) {
							((Interface7) local27.aClass8_Sub2_2).method5587();
						}
						if (local27.aClass8_Sub4_1 instanceof Interface7) {
							((Interface7) local27.aClass8_Sub4_1).method5587();
						}
						if (local27.aClass8_Sub4_2 instanceof Interface7) {
							((Interface7) local27.aClass8_Sub4_2).method5587();
						}
						for (@Pc(81) Class117 local81 = local27.aClass117_2; local81 != null; local81 = local81.aClass117_1) {
							@Pc(86) Class8_Sub1 local86 = local81.aClass8_Sub1_1;
							if (local86 instanceof Interface7) {
								((Interface7) local86).method5587();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)I")
	public static int method4295() {
		return 15;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method4296(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(19) char local19 = arg0.charAt(local13);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				local11[local13] = (byte) local19;
			} else if (local19 == '€') {
				local11[local13] = -128;
			} else if (local19 == '‚') {
				local11[local13] = -126;
			} else if (local19 == 'ƒ') {
				local11[local13] = -125;
			} else if (local19 == '„') {
				local11[local13] = -124;
			} else if (local19 == '…') {
				local11[local13] = -123;
			} else if (local19 == '†') {
				local11[local13] = -122;
			} else if (local19 == '‡') {
				local11[local13] = -121;
			} else if (local19 == 'ˆ') {
				local11[local13] = -120;
			} else if (local19 == '‰') {
				local11[local13] = -119;
			} else if (local19 == 'Š') {
				local11[local13] = -118;
			} else if (local19 == '‹') {
				local11[local13] = -117;
			} else if (local19 == 'Œ') {
				local11[local13] = -116;
			} else if (local19 == 'Ž') {
				local11[local13] = -114;
			} else if (local19 == '‘') {
				local11[local13] = -111;
			} else if (local19 == '’') {
				local11[local13] = -110;
			} else if (local19 == '“') {
				local11[local13] = -109;
			} else if (local19 == '”') {
				local11[local13] = -108;
			} else if (local19 == '•') {
				local11[local13] = -107;
			} else if (local19 == '–') {
				local11[local13] = -106;
			} else if (local19 == '—') {
				local11[local13] = -105;
			} else if (local19 == '˜') {
				local11[local13] = -104;
			} else if (local19 == '™') {
				local11[local13] = -103;
			} else if (local19 == 'š') {
				local11[local13] = -102;
			} else if (local19 == '›') {
				local11[local13] = -101;
			} else if (local19 == 'œ') {
				local11[local13] = -100;
			} else if (local19 == 'ž') {
				local11[local13] = -98;
			} else if (local19 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(B)V")
	public static void method4297() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static340.anInt6520 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	public static void method4298() {
		@Pc(13) Class198 local13 = Static91.aClass198_215;
		synchronized (Static91.aClass198_215) {
			Static91.aClass198_215.method5209();
		}
		local13 = Static334.aClass198_141;
		synchronized (Static334.aClass198_141) {
			Static334.aClass198_141.method5209();
		}
		@Pc(39) Class103 local39 = Static160.aClass103_1;
		synchronized (Static160.aClass103_1) {
			Static160.aClass103_1.method2974();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III[BIIIZLclient!vq;[Lclient!qr;)[I")
	public static int[] method4299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class47 arg7, @OriginalArg(9) Class170[] arg8) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		if (!arg6) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				@Pc(15) Class170 local15 = arg8[local9];
				for (local17 = 0; local17 < 64; local17++) {
					for (local21 = 0; local21 < 64; local21++) {
						local27 = local17 + arg2;
						local31 = local21 + arg0;
						if (local27 >= 0 && local27 < Static350.anInt6637 && local31 >= 0 && local31 < Static105.anInt2647) {
							local15.method4595(local27, local31);
						}
					}
				}
			}
		}
		@Pc(75) Class4_Sub11 local75 = new Class4_Sub11(arg3);
		@Pc(79) int local79 = arg1 + arg2;
		local17 = arg4 + arg0;
		for (local21 = 0; local21 < arg5; local21++) {
			for (local27 = 0; local27 < 64; local27++) {
				for (local31 = 0; local31 < 64; local31++) {
					Static291.method4885(0, local17 + local31, 0, arg0 + local31, local75, arg6, local21, false, arg2 + local27, 0, local79 + local27);
				}
			}
		}
		@Pc(135) boolean local135 = false;
		@Pc(137) boolean local137 = false;
		@Pc(143) int local143;
		@Pc(160) int local160;
		@Pc(194) int local194;
		@Pc(198) int local198;
		@Pc(312) int local312;
		@Pc(208) int local208;
		while (local75.aByteArray55.length > local75.anInt3768) {
			local143 = local75.method3440();
			if (local143 == 128) {
				Static76.anIntArray115[0] = local75.method3401();
				Static76.anIntArray115[1] = local75.method3447();
				Static76.anIntArray115[2] = local75.method3447();
				Static76.anIntArray115[3] = local75.method3447();
				local135 = true;
				Static76.anIntArray115[4] = local75.method3401();
			} else {
				if (local143 != 129) {
					local75.anInt3768--;
					break;
				}
				if (Static139.aByteArrayArrayArray10 == null) {
					Static139.aByteArrayArrayArray10 = new byte[4][][];
				}
				for (local160 = 0; local160 < 4; local160++) {
					@Pc(166) byte local166 = local75.method3426();
					if (local166 == 0 && Static139.aByteArrayArrayArray10[local160] != null) {
						local194 = arg2;
						local198 = arg2 + 64;
						local312 = arg0;
						local208 = arg0 + 64;
						if (local198 < 0) {
							local198 = 0;
						} else if (Static350.anInt6637 <= local198) {
							local198 = Static350.anInt6637;
						}
						if (arg2 < 0) {
							local194 = 0;
						} else if (Static350.anInt6637 <= arg2) {
							local194 = Static350.anInt6637;
						}
						if (arg0 < 0) {
							local312 = 0;
						} else if (Static105.anInt2647 <= arg0) {
							local312 = Static105.anInt2647;
						}
						if (local208 < 0) {
							local208 = 0;
						} else if (local208 >= Static105.anInt2647) {
							local208 = Static105.anInt2647;
						}
						while (local194 < local198) {
							while (local208 > local312) {
								Static139.aByteArrayArrayArray10[local160][local194][local312] = 0;
								local312++;
							}
							local194++;
						}
					} else if (local166 == 1) {
						if (Static139.aByteArrayArrayArray10[local160] == null) {
							Static139.aByteArrayArrayArray10[local160] = new byte[Static350.anInt6637 + 1][Static105.anInt2647 + 1];
						}
						for (local194 = 0; local194 < 64; local194 += 4) {
							for (local198 = 0; local198 < 64; local198 += 4) {
								@Pc(204) byte local204 = local75.method3426();
								for (local208 = arg2 + local194; local208 < arg2 + local194 + 4; local208++) {
									for (@Pc(214) int local214 = arg0 + local198; local214 < local198 + arg0 + 4; local214++) {
										if (local208 >= 0 && local208 < Static350.anInt6637 && local214 >= 0 && Static105.anInt2647 > local214) {
											Static139.aByteArrayArrayArray10[local160][local208][local214] = local204;
										}
									}
								}
							}
						}
					} else if (local166 == 2) {
						if (Static139.aByteArrayArrayArray10[local160] == null) {
							Static139.aByteArrayArrayArray10[local160] = new byte[Static350.anInt6637 + 1][Static105.anInt2647 + 1];
						}
						if (local160 > 0) {
							local194 = arg2;
							local198 = arg2 + 64;
							local312 = arg0;
							local208 = arg0 + 64;
							if (arg0 < 0) {
								local312 = 0;
							} else if (Static105.anInt2647 <= arg0) {
								local312 = Static105.anInt2647;
							}
							if (arg2 < 0) {
								local194 = 0;
							} else if (arg2 >= Static350.anInt6637) {
								local194 = Static350.anInt6637;
							}
							if (local198 < 0) {
								local198 = 0;
							} else if (Static350.anInt6637 <= local198) {
								local198 = Static350.anInt6637;
							}
							if (local208 < 0) {
								local208 = 0;
							} else if (Static105.anInt2647 <= local208) {
								local208 = Static105.anInt2647;
							}
							while (local198 > local194) {
								while (local208 > local312) {
									Static139.aByteArrayArrayArray10[local160][local194][local312] = Static139.aByteArrayArrayArray10[local160 - 1][local194][local312];
									local312++;
								}
								local194++;
							}
						}
					}
				}
				local137 = true;
			}
		}
		@Pc(595) int local595;
		if (!arg6) {
			@Pc(558) Class50 local558 = null;
			label278: while (true) {
				while (true) {
					while (local75.aByteArray55.length > local75.anInt3768) {
						local160 = local75.method3440();
						if (local160 == 0) {
							local558 = new Class50(local75);
						} else if (local160 == 1) {
							local595 = local75.method3440();
							if (local595 > 0) {
								for (local194 = 0; local194 < local595; local194++) {
									@Pc(609) Class4_Sub33_Sub1 local609 = new Class4_Sub33_Sub1(local75);
									if (local609.anInt5303 == 31) {
										@Pc(619) Class173 local619 = Static33.method569(local75.method3401());
										local609.method4564(local619.anInt5379, local619.anInt5376, local619.anInt5380, local619.anInt5378);
									}
									local609.anInt5295 += arg2 << 7;
									local609.anInt5298 += arg0 << 7;
									local312 = local609.anInt5295 >> 7;
									local208 = local609.anInt5298 >> 7;
									if (local312 >= 0 && local208 >= 0 && Static350.anInt6637 > local312 && local208 < Static105.anInt2647) {
										local609.anInt5294 = Static338.anIntArrayArrayArray40[local609.anInt5312][local312][local208] - local609.anInt5294;
										if (arg7.method2745() > 0) {
											Static116.method2421(local609);
										}
									}
								}
							}
						} else if (local160 == 2) {
							if (local558 == null) {
								local558 = new Class50();
							}
							local558.method1650(local75);
						} else {
							throw new IllegalStateException();
						}
					}
					if (local558 != null) {
						for (local160 = 0; local160 < 8; local160++) {
							for (local595 = 0; local595 < 8; local595++) {
								local194 = local160 + (arg2 >> 3);
								local198 = (arg0 >> 3) + local595;
								if (local194 >= 0 && local194 < Static350.anInt6637 >> 3 && local198 >= 0 && Static105.anInt2647 >> 3 > local198) {
									Static196.method5562(local558, local198, local194);
								}
							}
						}
					}
					break label278;
				}
			}
		}
		if (!local137 && Static139.aByteArrayArrayArray10 != null) {
			for (local143 = 0; local143 < 4; local143++) {
				if (Static139.aByteArrayArrayArray10[local143] != null) {
					for (local160 = 0; local160 < 16; local160++) {
						for (local595 = 0; local595 < 16; local595++) {
							local194 = local160 + (arg2 >> 2);
							local198 = local595 + (arg0 >> 2);
							if (local194 >= 0 && local194 < 26 && local198 >= 0 && local198 < 26) {
								Static139.aByteArrayArrayArray10[local143][local194][local198] = 0;
							}
						}
					}
				}
			}
		}
		if (local135) {
			return Static76.anIntArray115;
		} else {
			return null;
		}
	}
}
