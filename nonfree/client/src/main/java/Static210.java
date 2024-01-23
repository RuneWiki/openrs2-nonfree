import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
	public static int anInt3764;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "Lclient!fh;")
	public static Class58 aClass58_78;

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
	public static int anInt3774;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString224 = " has logged out.";

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "Lclient!cc;")
	public static Class26 aClass26_41 = new Class26(64);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIII)I")
	public static int method3160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg4 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(17) int local17 = arg0;
			arg0 = arg5;
			arg5 = local17;
		}
		if (local7 == 0) {
			return arg3;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return 7 + 1 - arg1 - arg5;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([[[BB[[B[[I[[FI[[B[[B[[I[[B[[F[[F)[Lclient!ih;")
	public static Class4_Sub12[] method3162(@OriginalArg(0) byte[][][] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) float[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) float[][] arg10) {
		@Pc(10) Class85 local10 = new Class85(128);
		@Pc(12) int local12;
		@Pc(17) int local17;
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(134) int local134;
		@Pc(136) int local136;
		@Pc(146) int local146;
		@Pc(156) int local156;
		@Pc(166) int local166;
		@Pc(176) int local176;
		@Pc(188) int local188;
		@Pc(200) int local200;
		@Pc(212) int local212;
		@Pc(224) int local224;
		@Pc(256) byte local256;
		@Pc(290) int local290;
		@Pc(304) int local304;
		@Pc(125) int local125;
		@Pc(132) int local132;
		@Pc(749) int local749;
		@Pc(999) int local999;
		@Pc(1019) boolean[] local1019;
		@Pc(1028) boolean[] local1028;
		@Pc(1037) boolean[] local1037;
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				local30 = arg8[local12][local17] & 0xFF;
				local38 = arg1[local12][local17] & 0xFF;
				if (local38 != 0) {
					@Pc(48) Class129 local48 = Static182.method2948(local38 - 1);
					if (local48.anInt3869 == -1) {
						continue;
					}
					@Pc(60) Class4_Sub12 local60 = Static194.method4274(local10, local48);
					@Pc(66) byte local66 = arg5[local12][local17];
					@Pc(70) int[] local70 = Static35.anIntArrayArray5[local66];
					local60.anInt2352 += local70.length / 2;
					local60.anInt2355++;
					if (local48.aBoolean275 && local30 != 0) {
						local60.anInt2352 += Static172.anIntArray318[local66];
					}
				}
				if ((arg8[local12][local17] & 0xFF) != 0 || local38 != 0 && arg5[local12][local17] == 0) {
					local125 = 0;
					@Pc(127) int local127 = 0;
					@Pc(130) int[] local130 = new int[8];
					local132 = 0;
					local134 = 0;
					local136 = 0;
					local146 = arg1[local12][local17 + 1] & 0xFF;
					local156 = arg1[local12 - 1][local17] & 0xFF;
					local166 = arg1[local12][local17 - 1] & 0xFF;
					local176 = arg1[local12 + 1][local17] & 0xFF;
					local188 = arg1[local12 - 1][local17 + 1] & 0xFF;
					local200 = arg1[local12 - 1][local17 - 1] & 0xFF;
					local212 = arg1[local12 + 1][local17 - 1] & 0xFF;
					local224 = arg1[local12 + 1][local17 + 1] & 0xFF;
					@Pc(239) Class129 local239;
					@Pc(266) byte local266;
					@Pc(278) int local278;
					if (local188 != 0 && local38 != local188) {
						local239 = Static182.method2948(local188 - 1);
						if (local239.aBoolean275 && local239.anInt3869 != -1) {
							local256 = arg5[local12 - 1][local17 + 1];
							local266 = arg6[local12 - 1][local17 + 1];
							local278 = Static234.anIntArray474[local256 * 4 + (local266 + 2 & 0x3)];
							local290 = Static234.anIntArray474[(local266 + 3 & 0x3) + local256 * 4];
							if (!Static58.aBooleanArrayArray2[local290][1] || !Static58.aBooleanArrayArray2[local278][0]) {
								for (local304 = 0; local304 < 8; local304++) {
									if (local304 == 0) {
										local125++;
										local130[0] = local188;
										break;
									}
									if (local188 == local130[local304]) {
										break;
									}
								}
							}
						}
					}
					if (local200 != 0 && local38 != local200) {
						local239 = Static182.method2948(local200 - 1);
						if (local239.aBoolean275 && local239.anInt3869 != -1) {
							local266 = arg6[local12 - 1][local17 - 1];
							local256 = arg5[local12 - 1][local17 - 1];
							local290 = Static234.anIntArray474[local256 * 4 + (local266 + 3 & 0x3)];
							local278 = Static234.anIntArray474[(local266 & 0x3) + local256 * 4];
							if (!Static58.aBooleanArrayArray2[local278][1] || !Static58.aBooleanArrayArray2[local290][0]) {
								for (local304 = 0; local304 < 8; local304++) {
									if (local304 == local125) {
										local130[local125++] = local200;
										break;
									}
									if (local200 == local130[local304]) {
										break;
									}
								}
							}
						}
					}
					if (local212 != 0 && local38 != local212) {
						local239 = Static182.method2948(local212 - 1);
						if (local239.aBoolean275 && local239.anInt3869 != -1) {
							local266 = arg6[local12 + 1][local17 - 1];
							local256 = arg5[local12 + 1][local17 - 1];
							local290 = Static234.anIntArray474[local256 * 4 + (local266 + 1 & 0x3)];
							local278 = Static234.anIntArray474[(local266 & 0x3) + local256 * 4];
							if (!Static58.aBooleanArrayArray2[local290][1] || !Static58.aBooleanArrayArray2[local278][0]) {
								for (local304 = 0; local304 < 8; local304++) {
									if (local125 == local304) {
										local130[local125++] = local212;
										break;
									}
									if (local212 == local130[local304]) {
										break;
									}
								}
							}
						}
					}
					if (local224 != 0 && local38 != local224) {
						local239 = Static182.method2948(local224 - 1);
						if (local239.aBoolean275 && local239.anInt3869 != -1) {
							local266 = arg6[local12 + 1][local17 + 1];
							local256 = arg5[local12 + 1][local17 + 1];
							local278 = Static234.anIntArray474[local256 * 4 + (local266 + 2 & 0x3)];
							local290 = Static234.anIntArray474[(local266 + 1 & 0x3) + local256 * 4];
							if (!Static58.aBooleanArrayArray2[local278][1] || !Static58.aBooleanArrayArray2[local290][0]) {
								for (local304 = 0; local304 < 8; local304++) {
									if (local125 == local304) {
										local130[local125++] = local224;
										break;
									}
									if (local130[local304] == local224) {
										break;
									}
								}
							}
						}
					}
					if (local146 != 0 && local146 != local38) {
						local239 = Static182.method2948(local146 - 1);
						if (local239.aBoolean275 && local239.anInt3869 != -1) {
							local127 = Static234.anIntArray474[(arg6[local12][local17 + 1] + 2 & 0x3) + arg5[local12][local17 + 1] * 4];
							for (local749 = 0; local749 < 8; local749++) {
								if (local749 == local125) {
									local130[local125++] = local146;
									break;
								}
								if (local146 == local130[local749]) {
									break;
								}
							}
						}
					}
					if (local156 != 0 && local156 != local38) {
						local239 = Static182.method2948(local156 - 1);
						if (local239.aBoolean275 && local239.anInt3869 != -1) {
							local132 = Static234.anIntArray474[(arg6[local12 - 1][local17] + 3 & 0x3) + arg5[local12 - 1][local17] * 4];
							for (local749 = 0; local749 < 8; local749++) {
								if (local749 == local125) {
									local130[local125++] = local156;
									break;
								}
								if (local130[local749] == local156) {
									break;
								}
							}
						}
					}
					if (local166 != 0 && local166 != local38) {
						local239 = Static182.method2948(local166 - 1);
						if (local239.aBoolean275 && local239.anInt3869 != -1) {
							local134 = Static234.anIntArray474[arg5[local12][local17 - 1] * 4 + (arg6[local12][local17 - 1] & 0x3)];
							for (local749 = 0; local749 < 8; local749++) {
								if (local125 == local749) {
									local130[local125++] = local166;
									break;
								}
								if (local166 == local130[local749]) {
									break;
								}
							}
						}
					}
					if (local176 != 0 && local176 != local38) {
						local239 = Static182.method2948(local176 - 1);
						if (local239.aBoolean275 && local239.anInt3869 != -1) {
							local136 = Static234.anIntArray474[arg5[local12 + 1][local17] * 4 + (arg6[local12 + 1][local17] + 1 & 0x3)];
							for (local749 = 0; local749 < 8; local749++) {
								if (local749 == local125) {
									local130[local125++] = local176;
									break;
								}
								if (local176 == local130[local749]) {
									break;
								}
							}
						}
					}
					for (local999 = 0; local999 < local125; local999++) {
						local749 = local130[local999];
						local1019 = Static58.aBooleanArrayArray2[local749 == local156 ? local132 : 0];
						local1028 = Static58.aBooleanArrayArray2[local166 == local749 ? local134 : 0];
						local1037 = Static58.aBooleanArrayArray2[local749 == local176 ? local136 : 0];
						@Pc(1050) boolean[] local1050 = Static58.aBooleanArrayArray2[local146 == local749 ? local127 : 0];
						@Pc(1056) Class129 local1056 = Static182.method2948(local749 - 1);
						@Pc(1061) Class4_Sub12 local1061 = Static194.method4274(local10, local1056);
						local1061.anInt2352 += 5;
						local1061.anInt2352 += local1050.length - 2;
						local1061.anInt2352 += local1019.length - 2;
						local1061.anInt2352 += local1028.length - 2;
						local1061.anInt2352 += local1037.length - 2;
						local1061.anInt2355++;
					}
				}
			}
		}
		@Pc(1123) Class4_Sub12 local1123;
		for (local1123 = (Class4_Sub12) local10.method1843(); local1123 != null; local1123 = (Class4_Sub12) local10.method1844()) {
			local1123.method1873();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				if ((arg0[arg4][local12][local17] & 0x8) != 0) {
					local30 = 0;
				} else if ((arg0[1][local12][local17] & 0x2) == 2 && arg4 > 0) {
					local30 = arg4 - 1;
				} else {
					local30 = arg4;
				}
				local125 = arg1[local12][local17] & 0xFF;
				local38 = arg8[local12][local17] & 0xFF;
				if (local125 != 0) {
					@Pc(1215) Class129 local1215 = Static182.method2948(local125 - 1);
					if (local1215.anInt3869 == -1) {
						continue;
					}
					@Pc(1227) Class4_Sub12 local1227 = Static194.method4274(local10, local1215);
					@Pc(1233) byte local1233 = arg5[local12][local17];
					@Pc(1239) byte local1239 = arg6[local12][local17];
					local136 = Static83.method1474(arg2[local12][local17], local1215.anInt3877, local1215.anInt3869);
					local146 = Static83.method1474(arg2[local12 + 1][local17], local1215.anInt3877, local1215.anInt3869);
					local156 = Static83.method1474(arg2[local12 + 1][local17 + 1], local1215.anInt3877, local1215.anInt3869);
					local166 = Static83.method1474(arg2[local12][local17 + 1], local1215.anInt3877, local1215.anInt3869);
					Static33.method521(arg10, local146, local30, local166, local156, arg3, local136, local1233, local1239, local1227, local38 != 0 && local1215.aBoolean275, arg9, arg7, local12, local17);
				}
				if ((arg8[local12][local17] & 0xFF) != 0 || local125 != 0 && arg5[local12][local17] == 0) {
					@Pc(1341) int local1341 = 0;
					@Pc(1344) int[] local1344 = new int[8];
					local132 = 0;
					local134 = 0;
					local136 = 0;
					local146 = 0;
					local166 = arg1[local12 - 1][local17] & 0xFF;
					local188 = arg1[local12 + 1][local17] & 0xFF;
					local176 = arg1[local12][local17 - 1] & 0xFF;
					local156 = arg1[local12][local17 + 1] & 0xFF;
					local212 = arg1[local12 - 1][local17 - 1] & 0xFF;
					local200 = arg1[local12 - 1][local17 + 1] & 0xFF;
					local224 = arg1[local12 + 1][local17 - 1] & 0xFF;
					local999 = arg1[local12 + 1][local17 + 1] & 0xFF;
					@Pc(1486) byte local1486;
					@Pc(1454) Class129 local1454;
					@Pc(1528) int local1528;
					if (local200 == 0 || local125 == local200) {
						local200 = 0;
					} else {
						local1454 = Static182.method2948(local200 - 1);
						if (local1454.aBoolean275 && local1454.anInt3869 != -1) {
							local256 = arg6[local12 - 1][local17 + 1];
							local1486 = arg5[local12 - 1][local17 + 1];
							local304 = Static234.anIntArray474[local1486 * 4 + (local256 + 3 & 0x3)];
							local290 = Static234.anIntArray474[(local256 + 2 & 0x3) + local1486 * 4];
							if (Static58.aBooleanArrayArray2[local304][1] && Static58.aBooleanArrayArray2[local290][0]) {
								local200 = 0;
							} else {
								for (local1528 = 0; local1528 < 8; local1528++) {
									if (local1528 == 0) {
										local1341++;
										local1344[0] = local200;
										break;
									}
									if (local200 == local1344[local1528]) {
										break;
									}
								}
							}
						} else {
							local200 = 0;
						}
					}
					if (local212 == 0 || local125 == local212) {
						local212 = 0;
					} else {
						local1454 = Static182.method2948(local212 - 1);
						if (local1454.aBoolean275 && local1454.anInt3869 != -1) {
							local256 = arg6[local12 - 1][local17 - 1];
							local1486 = arg5[local12 - 1][local17 - 1];
							local290 = Static234.anIntArray474[local1486 * 4 + (local256 & 0x3)];
							local304 = Static234.anIntArray474[(local256 + 3 & 0x3) + local1486 * 4];
							if (Static58.aBooleanArrayArray2[local290][1] && Static58.aBooleanArrayArray2[local304][0]) {
								local212 = 0;
							} else {
								for (local1528 = 0; local1528 < 8; local1528++) {
									if (local1341 == local1528) {
										local1344[local1341++] = local212;
										break;
									}
									if (local1344[local1528] == local212) {
										break;
									}
								}
							}
						} else {
							local212 = 0;
						}
					}
					if (local224 == 0 || local224 == local125) {
						local224 = 0;
					} else {
						local1454 = Static182.method2948(local224 - 1);
						if (local1454.aBoolean275 && local1454.anInt3869 != -1) {
							local256 = arg6[local12 + 1][local17 - 1];
							local1486 = arg5[local12 + 1][local17 - 1];
							local290 = Static234.anIntArray474[local1486 * 4 + (local256 & 0x3)];
							local304 = Static234.anIntArray474[(local256 + 1 & 0x3) + local1486 * 4];
							if (Static58.aBooleanArrayArray2[local304][1] && Static58.aBooleanArrayArray2[local290][0]) {
								local224 = 0;
							} else {
								for (local1528 = 0; local1528 < 8; local1528++) {
									if (local1341 == local1528) {
										local1344[local1341++] = local224;
										break;
									}
									if (local224 == local1344[local1528]) {
										break;
									}
								}
							}
						} else {
							local224 = 0;
						}
					}
					if (local999 == 0 || local999 == local125) {
						local999 = 0;
					} else {
						local1454 = Static182.method2948(local999 - 1);
						if (local1454.aBoolean275 && local1454.anInt3869 != -1) {
							local256 = arg6[local12 + 1][local17 + 1];
							local1486 = arg5[local12 + 1][local17 + 1];
							local304 = Static234.anIntArray474[(local256 + 1 & 0x3) + local1486 * 4];
							local290 = Static234.anIntArray474[(local256 + 2 & 0x3) + local1486 * 4];
							if (Static58.aBooleanArrayArray2[local290][1] && Static58.aBooleanArrayArray2[local304][0]) {
								local999 = 0;
							} else {
								for (local1528 = 0; local1528 < 8; local1528++) {
									if (local1528 == local1341) {
										local1344[local1341++] = local999;
										break;
									}
									if (local999 == local1344[local1528]) {
										break;
									}
								}
							}
						} else {
							local999 = 0;
						}
					}
					@Pc(1960) int local1960;
					if (local156 != 0 && local156 != local125) {
						local1454 = Static182.method2948(local156 - 1);
						if (local1454.aBoolean275 && local1454.anInt3869 != -1) {
							local132 = Static234.anIntArray474[arg5[local12][local17 + 1] * 4 + (arg6[local12][local17 + 1] + 2 & 0x3)];
							for (local1960 = 0; local1960 < 8; local1960++) {
								if (local1960 == local1341) {
									local1344[local1341++] = local156;
									break;
								}
								if (local1344[local1960] == local156) {
									break;
								}
							}
						}
					}
					if (local166 != 0 && local125 != local166) {
						local1454 = Static182.method2948(local166 - 1);
						if (local1454.aBoolean275 && local1454.anInt3869 != -1) {
							local134 = Static234.anIntArray474[arg5[local12 - 1][local17] * 4 + (arg6[local12 - 1][local17] + 3 & 0x3)];
							for (local1960 = 0; local1960 < 8; local1960++) {
								if (local1960 == local1341) {
									local1344[local1341++] = local166;
									break;
								}
								if (local166 == local1344[local1960]) {
									break;
								}
							}
						}
					}
					if (local176 != 0 && local125 != local176) {
						local1454 = Static182.method2948(local176 - 1);
						if (local1454.aBoolean275 && local1454.anInt3869 != -1) {
							local136 = Static234.anIntArray474[arg5[local12][local17 - 1] * 4 + (arg6[local12][local17 - 1] & 0x3)];
							for (local1960 = 0; local1960 < 8; local1960++) {
								if (local1960 == local1341) {
									local1344[local1341++] = local176;
									break;
								}
								if (local1344[local1960] == local176) {
									break;
								}
							}
						}
					}
					if (local188 != 0 && local125 != local188) {
						local1454 = Static182.method2948(local188 - 1);
						if (local1454.aBoolean275 && local1454.anInt3869 != -1) {
							local146 = Static234.anIntArray474[arg5[local12 + 1][local17] * 4 + (arg6[local12 + 1][local17] + 1 & 0x3)];
							for (local1960 = 0; local1960 < 8; local1960++) {
								if (local1341 == local1960) {
									local1344[local1341++] = local188;
									break;
								}
								if (local188 == local1344[local1960]) {
									break;
								}
							}
						}
					}
					for (local749 = 0; local749 < local1341; local749++) {
						local1960 = local1344[local749];
						local1019 = Static58.aBooleanArrayArray2[local156 == local1960 ? local132 : 0];
						local1028 = Static58.aBooleanArrayArray2[local1960 == local166 ? local134 : 0];
						local1037 = Static58.aBooleanArrayArray2[local1960 == local176 ? local136 : 0];
						@Pc(2266) boolean[] local2266 = Static58.aBooleanArrayArray2[local1960 == local188 ? local146 : 0];
						@Pc(2272) Class129 local2272 = Static182.method2948(local1960 - 1);
						@Pc(2277) Class4_Sub12 local2277 = Static194.method4274(local10, local2272);
						@Pc(2293) int local2293 = Static83.method1474(arg2[local12][local17], local2272.anInt3877, local2272.anInt3869) << 8 | 0xFF;
						@Pc(2311) int local2311 = Static83.method1474(arg2[local12 + 1][local17], local2272.anInt3877, local2272.anInt3869) << 8 | 0xFF;
						@Pc(2331) int local2331 = Static83.method1474(arg2[local12 + 1][local17 + 1], local2272.anInt3877, local2272.anInt3869) << 8 | 0xFF;
						@Pc(2351) int local2351 = Static83.method1474(arg2[local12][local17 + 1], local2272.anInt3877, local2272.anInt3869) << 8 | 0xFF;
						@Pc(2358) int local2358 = local1019.length + 6 - 2;
						@Pc(2365) int local2365 = local2358 + local1028.length - 2;
						@Pc(2384) boolean local2384 = local1960 != local200 && local1028[0] && local1019[1];
						@Pc(2391) int local2391 = local2365 + local1037.length - 2;
						@Pc(2398) int local2398 = local2391 + local2266.length - 2;
						@Pc(2413) boolean local2413 = local1960 != local224 && local2266[0] && local1037[1];
						@Pc(2432) boolean local2432 = local212 != local1960 && local1037[0] && local1028[1];
						@Pc(2435) int[] local2435 = new int[local2398];
						@Pc(2454) boolean local2454 = local1960 != local999 && local1019[0] && local2266[1];
						@Pc(2456) byte local2456 = 0;
						@Pc(2477) int local2477 = Static309.method4794(arg3, 64, local17, arg7, arg9, null, local2277, local2311, local12, true, 0.0F, arg10, 0, 64, local2351, local2331, local2293);
						@Pc(2498) int local2498 = Static309.method4794(arg3, 128, local17, arg7, arg9, null, local2277, local2311, local12, local2384, 0.0F, arg10, 0, 0, local2351, local2331, local2293);
						@Pc(2519) int local2519 = Static309.method4794(arg3, 128, local17, arg7, arg9, null, local2277, local2311, local12, local2454, 0.0F, arg10, 0, 128, local2351, local2331, local2293);
						@Pc(2540) int local2540 = Static309.method4794(arg3, 0, local17, arg7, arg9, null, local2277, local2311, local12, local2432, 0.0F, arg10, 0, 0, local2351, local2331, local2293);
						@Pc(2561) int local2561 = Static309.method4794(arg3, 0, local17, arg7, arg9, null, local2277, local2311, local12, local2413, 0.0F, arg10, 0, 128, local2351, local2331, local2293);
						@Pc(2564) int local2564 = local2456 + 1;
						local2435[0] = local2477;
						@Pc(2569) int local2569 = local2564 + 1;
						local2435[1] = local2519;
						if (local1019.length > 2) {
							local2569++;
							local2435[2] = Static309.method4794(arg3, 128, local17, arg7, arg9, null, local2277, local2311, local12, local1019[2], 0.0F, arg10, 0, 64, local2351, local2331, local2293);
						}
						local2435[local2569++] = local2498;
						if (local1028.length > 2) {
							local2435[local2569++] = Static309.method4794(arg3, 64, local17, arg7, arg9, null, local2277, local2311, local12, local1028[2], 0.0F, arg10, 0, 0, local2351, local2331, local2293);
						}
						local2435[local2569++] = local2540;
						if (local1037.length > 2) {
							local2435[local2569++] = Static309.method4794(arg3, 0, local17, arg7, arg9, null, local2277, local2311, local12, local1037[2], 0.0F, arg10, 0, 64, local2351, local2331, local2293);
						}
						local2435[local2569++] = local2561;
						if (local2266.length > 2) {
							local2435[local2569++] = Static309.method4794(arg3, 64, local17, arg7, arg9, null, local2277, local2311, local12, local2266[2], 0.0F, arg10, 0, 128, local2351, local2331, local2293);
						}
						local2435[local2569++] = local2519;
						local2277.method1871(local30, local12, local17, local2435, null, true);
					}
				}
			}
		}
		for (local1123 = (Class4_Sub12) local10.method1843(); local1123 != null; local1123 = (Class4_Sub12) local10.method1844()) {
			if (local1123.anInt2357 == 0) {
				local1123.method4854();
			} else {
				local1123.method1867();
			}
		}
		local12 = local10.method1842();
		@Pc(2774) Class4_Sub12[] local2774 = new Class4_Sub12[local12];
		@Pc(2777) long[] local2777 = new long[local12];
		local10.method1846(local2774);
		for (local38 = 0; local38 < local12; local38++) {
			local2777[local38] = local2774[local38].aLong217;
		}
		Static36.method563(local2777, local2774);
		return local2774;
	}
}
