import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[Lclient!ag;")
	public static Class7_Sub1[] aClass7_Sub1Array1;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	public static int anInt1133;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!tl;")
	public static Class155 aClass155_7 = new Class155(4);

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Ljava/lang/String;")
	public static String aString39 = "";

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	public static int anInt1132 = 0;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
	public static boolean aBoolean69 = true;

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method851(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ok;)Lclient!ok;")
	public static Class116 method852(@OriginalArg(0) Class116 arg0) {
		@Pc(4) int local4 = method866(arg0).method1099();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static115.method1897(arg0.anInt4344);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ok;)Z")
	public static boolean method854(@OriginalArg(0) Class116 arg0) {
		if (Static24.aBoolean27) {
			if (method866(arg0).anInt1450 != 0) {
				return false;
			}
			if (arg0.anInt4376 == 0) {
				return false;
			}
		}
		return arg0.aBoolean228;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	public static void method855(@OriginalArg(0) boolean arg0) {
		@Pc(19) byte local19;
		@Pc(21) byte[][] local21;
		if (Static296.aBoolean335 && arg0) {
			local19 = 1;
			local21 = Static105.aByteArrayArray138;
		} else {
			local21 = Static138.aByteArrayArray71;
			local19 = 4;
		}
		for (@Pc(29) int local29 = 0; local29 < local19; local29++) {
			Static96.method1648();
			for (@Pc(40) int local40 = 0; local40 < 13; local40++) {
				for (@Pc(45) int local45 = 0; local45 < 13; local45++) {
					@Pc(58) int local58 = Static130.anIntArrayArrayArray13[local29][local40][local45];
					if (local58 != -1) {
						@Pc(67) int local67 = local58 >> 24 & 0x3;
						if (!arg0 || local67 == 0) {
							@Pc(81) int local81 = local58 >> 1 & 0x3;
							@Pc(87) int local87 = local58 >> 3 & 0x7FF;
							@Pc(93) int local93 = local58 >> 14 & 0x3FF;
							@Pc(104) int local104 = (local93 / 8 << 8) + (local87 / 8);
							for (@Pc(106) int local106 = 0; local106 < Static8.anIntArray449.length; local106++) {
								if (Static8.anIntArray449[local106] == local104 && local21[local106] != null) {
									Static207.method3674((local87 & 0x7) * 8, local81, local45 * 8, local40 * 8, local21[local106], arg0, Static213.aClass36Array1, local67, local29, (local93 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([[B[[BI[[B[[F[[F[[F[[B[[[B[[I[[II)[Lclient!kd;")
	public static Class1_Sub20[] method856(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) byte[][][] arg8, @OriginalArg(9) int[][] arg9, @OriginalArg(10) int[][] arg10) {
		@Pc(10) Class117 local10 = new Class117(128);
		@Pc(12) int local12;
		@Pc(17) int local17;
		@Pc(36) int local36;
		@Pc(28) int local28;
		@Pc(135) int local135;
		@Pc(139) int local139;
		@Pc(149) int local149;
		@Pc(159) int local159;
		@Pc(169) int local169;
		@Pc(203) int local203;
		@Pc(181) int local181;
		@Pc(193) int local193;
		@Pc(227) int local227;
		@Pc(215) int local215;
		@Pc(276) byte local276;
		@Pc(301) int local301;
		@Pc(315) int local315;
		@Pc(128) int local128;
		@Pc(137) int local137;
		@Pc(755) int local755;
		@Pc(1023) int local1023;
		@Pc(1048) boolean[] local1048;
		@Pc(1061) boolean[] local1061;
		@Pc(1070) boolean[] local1070;
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				local28 = arg7[local12][local17] & 0xFF;
				local36 = arg3[local12][local17] & 0xFF;
				if (local28 != 0) {
					@Pc(47) Class159 local47 = Static50.method1056(local28 - 1);
					if (local47.anInt5803 == -1) {
						continue;
					}
					@Pc(60) Class1_Sub20 local60 = Static167.method3099(local10, local47);
					@Pc(66) byte local66 = arg1[local12][local17];
					@Pc(70) int[] local70 = Static58.anIntArrayArray11[local66];
					local60.anInt3097 += local70.length / 2;
					local60.anInt3100++;
					if (local47.aBoolean305 && local36 != 0) {
						local60.anInt3097 += Static213.anIntArray476[local66];
					}
				}
				if ((arg3[local12][local17] & 0xFF) != 0 || local28 != 0 && arg1[local12][local17] == 0) {
					local128 = 0;
					@Pc(131) int[] local131 = new int[8];
					@Pc(133) int local133 = 0;
					local135 = 0;
					local137 = 0;
					local139 = 0;
					local149 = arg7[local12][local17 + 1] & 0xFF;
					local159 = arg7[local12 - 1][local17] & 0xFF;
					local169 = arg7[local12][local17 - 1] & 0xFF;
					local181 = arg7[local12 - 1][local17 + 1] & 0xFF;
					local193 = arg7[local12 - 1][local17 - 1] & 0xFF;
					local203 = arg7[local12 + 1][local17] & 0xFF;
					local215 = arg7[local12 + 1][local17 + 1] & 0xFF;
					local227 = arg7[local12 + 1][local17 - 1] & 0xFF;
					@Pc(245) Class159 local245;
					@Pc(266) byte local266;
					@Pc(289) int local289;
					if (local181 != 0 && local28 != local181) {
						local245 = Static50.method1056(local181 - 1);
						if (local245.aBoolean305 && local245.anInt5803 != -1) {
							local266 = arg0[local12 - 1][local17 + 1];
							local276 = arg1[local12 - 1][local17 + 1];
							local289 = Static23.anIntArray49[local276 * 4 + (local266 + 2 & 0x3)];
							local301 = Static23.anIntArray49[(local266 + 3 & 0x3) + local276 * 4];
							if (!Static119.aBooleanArrayArray3[local301][1] || !Static119.aBooleanArrayArray3[local289][0]) {
								for (local315 = 0; local315 < 8; local315++) {
									if (local315 == 0) {
										local128++;
										local131[0] = local181;
										break;
									}
									if (local181 == local131[local315]) {
										break;
									}
								}
							}
						}
					}
					if (local193 != 0 && local193 != local28) {
						local245 = Static50.method1056(local193 - 1);
						if (local245.aBoolean305 && local245.anInt5803 != -1) {
							local266 = arg0[local12 - 1][local17 - 1];
							local276 = arg1[local12 - 1][local17 - 1];
							local289 = Static23.anIntArray49[(local266 & 0x3) + local276 * 4];
							local301 = Static23.anIntArray49[local276 * 4 + (local266 + 3 & 0x3)];
							if (!Static119.aBooleanArrayArray3[local289][1] || !Static119.aBooleanArrayArray3[local301][0]) {
								for (local315 = 0; local315 < 8; local315++) {
									if (local128 == local315) {
										local131[local128++] = local193;
										break;
									}
									if (local131[local315] == local193) {
										break;
									}
								}
							}
						}
					}
					if (local227 != 0 && local227 != local28) {
						local245 = Static50.method1056(local227 - 1);
						if (local245.aBoolean305 && local245.anInt5803 != -1) {
							local266 = arg0[local12 + 1][local17 - 1];
							local276 = arg1[local12 + 1][local17 - 1];
							local289 = Static23.anIntArray49[local276 * 4 + (local266 & 0x3)];
							local301 = Static23.anIntArray49[(local266 + 1 & 0x3) + local276 * 4];
							if (!Static119.aBooleanArrayArray3[local301][1] || !Static119.aBooleanArrayArray3[local289][0]) {
								for (local315 = 0; local315 < 8; local315++) {
									if (local128 == local315) {
										local131[local128++] = local227;
										break;
									}
									if (local227 == local131[local315]) {
										break;
									}
								}
							}
						}
					}
					if (local215 != 0 && local215 != local28) {
						local245 = Static50.method1056(local215 - 1);
						if (local245.aBoolean305 && local245.anInt5803 != -1) {
							local266 = arg0[local12 + 1][local17 + 1];
							local276 = arg1[local12 + 1][local17 + 1];
							local289 = Static23.anIntArray49[local276 * 4 + (local266 + 2 & 0x3)];
							local301 = Static23.anIntArray49[local276 * 4 + (local266 + 1 & 0x3)];
							if (!Static119.aBooleanArrayArray3[local289][1] || !Static119.aBooleanArrayArray3[local301][0]) {
								for (local315 = 0; local315 < 8; local315++) {
									if (local128 == local315) {
										local131[local128++] = local215;
										break;
									}
									if (local215 == local131[local315]) {
										break;
									}
								}
							}
						}
					}
					if (local149 != 0 && local149 != local28) {
						local245 = Static50.method1056(local149 - 1);
						if (local245.aBoolean305 && local245.anInt5803 != -1) {
							local133 = Static23.anIntArray49[arg1[local12][local17 + 1] * 4 + (arg0[local12][local17 + 1] + 2 & 0x3)];
							for (local755 = 0; local755 < 8; local755++) {
								if (local128 == local755) {
									local131[local128++] = local149;
									break;
								}
								if (local149 == local131[local755]) {
									break;
								}
							}
						}
					}
					if (local159 != 0 && local28 != local159) {
						local245 = Static50.method1056(local159 - 1);
						if (local245.aBoolean305 && local245.anInt5803 != -1) {
							local137 = Static23.anIntArray49[(arg0[local12 - 1][local17] + 3 & 0x3) + arg1[local12 - 1][local17] * 4];
							for (local755 = 0; local755 < 8; local755++) {
								if (local755 == local128) {
									local131[local128++] = local159;
									break;
								}
								if (local159 == local131[local755]) {
									break;
								}
							}
						}
					}
					if (local169 != 0 && local169 != local28) {
						local245 = Static50.method1056(local169 - 1);
						if (local245.aBoolean305 && local245.anInt5803 != -1) {
							local135 = Static23.anIntArray49[(arg0[local12][local17 - 1] & 0x3) + arg1[local12][local17 - 1] * 4];
							for (local755 = 0; local755 < 8; local755++) {
								if (local755 == local128) {
									local131[local128++] = local169;
									break;
								}
								if (local169 == local131[local755]) {
									break;
								}
							}
						}
					}
					if (local203 != 0 && local28 != local203) {
						local245 = Static50.method1056(local203 - 1);
						if (local245.aBoolean305 && local245.anInt5803 != -1) {
							local139 = Static23.anIntArray49[(arg0[local12 + 1][local17] + 1 & 0x3) + arg1[local12 + 1][local17] * 4];
							for (local755 = 0; local755 < 8; local755++) {
								if (local128 == local755) {
									local131[local128++] = local203;
									break;
								}
								if (local131[local755] == local203) {
									break;
								}
							}
						}
					}
					for (local1023 = 0; local1023 < local128; local1023++) {
						local755 = local131[local1023];
						@Pc(1039) boolean[] local1039 = Static119.aBooleanArrayArray3[local755 == local149 ? local133 : 0];
						local1048 = Static119.aBooleanArrayArray3[local755 == local159 ? local137 : 0];
						local1061 = Static119.aBooleanArrayArray3[local169 == local755 ? local135 : 0];
						local1070 = Static119.aBooleanArrayArray3[local755 == local203 ? local139 : 0];
						@Pc(1076) Class159 local1076 = Static50.method1056(local755 - 1);
						@Pc(1081) Class1_Sub20 local1081 = Static167.method3099(local10, local1076);
						local1081.anInt3097 += 5;
						local1081.anInt3097 += local1039.length - 2;
						local1081.anInt3097 += local1048.length - 2;
						local1081.anInt3097 += local1061.length - 2;
						local1081.anInt3097 += local1070.length - 2;
						local1081.anInt3100++;
					}
				}
			}
		}
		@Pc(1143) Class1_Sub20 local1143;
		for (local1143 = (Class1_Sub20) local10.method3441(); local1143 != null; local1143 = (Class1_Sub20) local10.method3444()) {
			local1143.method2361();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				if ((arg8[arg2][local12][local17] & 0x8) != 0) {
					local36 = 0;
				} else if ((arg8[1][local12][local17] & 0x2) == 2 && arg2 > 0) {
					local36 = arg2 - 1;
				} else {
					local36 = arg2;
				}
				local28 = arg3[local12][local17] & 0xFF;
				local128 = arg7[local12][local17] & 0xFF;
				if (local128 != 0) {
					@Pc(1230) Class159 local1230 = Static50.method1056(local128 - 1);
					if (local1230.anInt5803 == -1) {
						continue;
					}
					@Pc(1241) Class1_Sub20 local1241 = Static167.method3099(local10, local1230);
					@Pc(1247) byte local1247 = arg1[local12][local17];
					@Pc(1253) byte local1253 = arg0[local12][local17];
					local139 = Static216.method3796(local1230.anInt5801, arg10[local12][local17], local1230.anInt5803);
					local149 = Static216.method3796(local1230.anInt5801, arg10[local12 + 1][local17], local1230.anInt5803);
					local159 = Static216.method3796(local1230.anInt5801, arg10[local12 + 1][local17 + 1], local1230.anInt5803);
					local169 = Static216.method3796(local1230.anInt5801, arg10[local12][local17 + 1], local1230.anInt5803);
					Static58.method1142(local139, local1253, arg4, arg5, arg6, local1241, local1247, arg9, local12, local28 != 0 && local1230.aBoolean305, local169, local17, local149, local36, local159);
				}
				if ((arg3[local12][local17] & 0xFF) != 0 || local128 != 0 && arg1[local12][local17] == 0) {
					@Pc(1359) int local1359 = 0;
					local137 = 0;
					@Pc(1364) int[] local1364 = new int[8];
					local135 = 0;
					local139 = 0;
					local149 = 0;
					local169 = arg7[local12 - 1][local17] & 0xFF;
					local159 = arg7[local12][local17 + 1] & 0xFF;
					local193 = arg7[local12 - 1][local17 + 1] & 0xFF;
					local203 = arg7[local12][local17 - 1] & 0xFF;
					local215 = arg7[local12 + 1][local17 - 1] & 0xFF;
					local181 = arg7[local12 + 1][local17] & 0xFF;
					local1023 = arg7[local12 + 1][local17 + 1] & 0xFF;
					local227 = arg7[local12 - 1][local17 - 1] & 0xFF;
					@Pc(1505) byte local1505;
					@Pc(1476) Class159 local1476;
					@Pc(1543) int local1543;
					if (local193 == 0 || local128 == local193) {
						local193 = 0;
					} else {
						local1476 = Static50.method1056(local193 - 1);
						if (local1476.aBoolean305 && local1476.anInt5803 != -1) {
							local276 = arg0[local12 - 1][local17 + 1];
							local1505 = arg1[local12 - 1][local17 + 1];
							local301 = Static23.anIntArray49[(local276 + 2 & 0x3) + local1505 * 4];
							local315 = Static23.anIntArray49[local1505 * 4 + (local276 + 3 & 0x3)];
							if (Static119.aBooleanArrayArray3[local315][1] && Static119.aBooleanArrayArray3[local301][0]) {
								local193 = 0;
							} else {
								for (local1543 = 0; local1543 < 8; local1543++) {
									if (local1543 == 0) {
										local1359++;
										local1364[0] = local193;
										break;
									}
									if (local193 == local1364[local1543]) {
										break;
									}
								}
							}
						} else {
							local193 = 0;
						}
					}
					if (local227 == 0 || local128 == local227) {
						local227 = 0;
					} else {
						local1476 = Static50.method1056(local227 - 1);
						if (local1476.aBoolean305 && local1476.anInt5803 != -1) {
							local1505 = arg1[local12 - 1][local17 - 1];
							local276 = arg0[local12 - 1][local17 - 1];
							local301 = Static23.anIntArray49[(local276 & 0x3) + local1505 * 4];
							local315 = Static23.anIntArray49[(local276 + 3 & 0x3) + local1505 * 4];
							if (Static119.aBooleanArrayArray3[local301][1] && Static119.aBooleanArrayArray3[local315][0]) {
								local227 = 0;
							} else {
								for (local1543 = 0; local1543 < 8; local1543++) {
									if (local1543 == local1359) {
										local1364[local1359++] = local227;
										break;
									}
									if (local227 == local1364[local1543]) {
										break;
									}
								}
							}
						} else {
							local227 = 0;
						}
					}
					if (local215 == 0 || local215 == local128) {
						local215 = 0;
					} else {
						local1476 = Static50.method1056(local215 - 1);
						if (local1476.aBoolean305 && local1476.anInt5803 != -1) {
							local1505 = arg1[local12 + 1][local17 - 1];
							local276 = arg0[local12 + 1][local17 - 1];
							local315 = Static23.anIntArray49[(local276 + 1 & 0x3) + local1505 * 4];
							local301 = Static23.anIntArray49[local1505 * 4 + (local276 & 0x3)];
							if (Static119.aBooleanArrayArray3[local315][1] && Static119.aBooleanArrayArray3[local301][0]) {
								local215 = 0;
							} else {
								for (local1543 = 0; local1543 < 8; local1543++) {
									if (local1359 == local1543) {
										local1364[local1359++] = local215;
										break;
									}
									if (local215 == local1364[local1543]) {
										break;
									}
								}
							}
						} else {
							local215 = 0;
						}
					}
					if (local1023 == 0 || local1023 == local128) {
						local1023 = 0;
					} else {
						local1476 = Static50.method1056(local1023 - 1);
						if (local1476.aBoolean305 && local1476.anInt5803 != -1) {
							local276 = arg0[local12 + 1][local17 + 1];
							local1505 = arg1[local12 + 1][local17 + 1];
							local301 = Static23.anIntArray49[(local276 + 2 & 0x3) + local1505 * 4];
							local315 = Static23.anIntArray49[local1505 * 4 + (local276 + 1 & 0x3)];
							if (Static119.aBooleanArrayArray3[local301][1] && Static119.aBooleanArrayArray3[local315][0]) {
								local1023 = 0;
							} else {
								for (local1543 = 0; local1543 < 8; local1543++) {
									if (local1359 == local1543) {
										local1364[local1359++] = local1023;
										break;
									}
									if (local1023 == local1364[local1543]) {
										break;
									}
								}
							}
						} else {
							local1023 = 0;
						}
					}
					@Pc(2001) int local2001;
					if (local159 != 0 && local128 != local159) {
						local1476 = Static50.method1056(local159 - 1);
						if (local1476.aBoolean305 && local1476.anInt5803 != -1) {
							local137 = Static23.anIntArray49[(arg0[local12][local17 + 1] + 2 & 0x3) + arg1[local12][local17 + 1] * 4];
							for (local2001 = 0; local2001 < 8; local2001++) {
								if (local2001 == local1359) {
									local1364[local1359++] = local159;
									break;
								}
								if (local1364[local2001] == local159) {
									break;
								}
							}
						}
					}
					if (local169 != 0 && local169 != local128) {
						local1476 = Static50.method1056(local169 - 1);
						if (local1476.aBoolean305 && local1476.anInt5803 != -1) {
							local135 = Static23.anIntArray49[(arg0[local12 - 1][local17] + 3 & 0x3) + arg1[local12 - 1][local17] * 4];
							for (local2001 = 0; local2001 < 8; local2001++) {
								if (local1359 == local2001) {
									local1364[local1359++] = local169;
									break;
								}
								if (local169 == local1364[local2001]) {
									break;
								}
							}
						}
					}
					if (local203 != 0 && local203 != local128) {
						local1476 = Static50.method1056(local203 - 1);
						if (local1476.aBoolean305 && local1476.anInt5803 != -1) {
							local139 = Static23.anIntArray49[arg1[local12][local17 - 1] * 4 + (arg0[local12][local17 - 1] & 0x3)];
							for (local2001 = 0; local2001 < 8; local2001++) {
								if (local1359 == local2001) {
									local1364[local1359++] = local203;
									break;
								}
								if (local1364[local2001] == local203) {
									break;
								}
							}
						}
					}
					if (local181 != 0 && local181 != local128) {
						local1476 = Static50.method1056(local181 - 1);
						if (local1476.aBoolean305 && local1476.anInt5803 != -1) {
							local149 = Static23.anIntArray49[arg1[local12 + 1][local17] * 4 + (arg0[local12 + 1][local17] + 1 & 0x3)];
							for (local2001 = 0; local2001 < 8; local2001++) {
								if (local1359 == local2001) {
									local1364[local1359++] = local181;
									break;
								}
								if (local1364[local2001] == local181) {
									break;
								}
							}
						}
					}
					for (local755 = 0; local755 < local1359; local755++) {
						local2001 = local1364[local755];
						local1048 = Static119.aBooleanArrayArray3[local159 == local2001 ? local137 : 0];
						local1061 = Static119.aBooleanArrayArray3[local169 == local2001 ? local135 : 0];
						local1070 = Static119.aBooleanArrayArray3[local203 == local2001 ? local139 : 0];
						@Pc(2316) boolean[] local2316 = Static119.aBooleanArrayArray3[local181 == local2001 ? local149 : 0];
						@Pc(2322) Class159 local2322 = Static50.method1056(local2001 - 1);
						@Pc(2327) Class1_Sub20 local2327 = Static167.method3099(local10, local2322);
						@Pc(2343) int local2343 = Static216.method3796(local2322.anInt5801, arg10[local12][local17], local2322.anInt5803) << 8 | 0xFF;
						@Pc(2363) int local2363 = Static216.method3796(local2322.anInt5801, arg10[local12 + 1][local17], local2322.anInt5803) << 8 | 0xFF;
						@Pc(2383) int local2383 = Static216.method3796(local2322.anInt5801, arg10[local12 + 1][local17 + 1], local2322.anInt5803) << 8 | 0xFF;
						@Pc(2403) int local2403 = Static216.method3796(local2322.anInt5801, arg10[local12][local17 + 1], local2322.anInt5803) << 8 | 0xFF;
						@Pc(2422) boolean local2422 = local193 != local2001 && local1061[0] && local1048[1];
						@Pc(2441) boolean local2441 = local2001 != local215 && local2316[0] && local1070[1];
						@Pc(2456) boolean local2456 = local227 != local2001 && local1070[0] && local1061[1];
						@Pc(2463) int local2463 = local1048.length + 6 - 2;
						@Pc(2482) boolean local2482 = local2001 != local1023 && local1048[0] && local2316[1];
						@Pc(2489) int local2489 = local2463 + local1061.length - 2;
						@Pc(2496) int local2496 = local2489 + local1070.length - 2;
						@Pc(2503) int local2503 = local2496 + local2316.length - 2;
						@Pc(2506) int[] local2506 = new int[local2503];
						@Pc(2508) byte local2508 = 0;
						@Pc(2529) int local2529 = Static143.method2586(arg6, arg5, local12, arg4, null, true, 64, 0.0F, local17, local2327, local2383, 64, 0, arg9, local2343, local2403, local2363);
						@Pc(2552) int local2552 = Static143.method2586(arg6, arg5, local12, arg4, null, local2422, 0, 0.0F, local17, local2327, local2383, 128, 0, arg9, local2343, local2403, local2363);
						@Pc(2575) int local2575 = Static143.method2586(arg6, arg5, local12, arg4, null, local2482, 128, 0.0F, local17, local2327, local2383, 128, 0, arg9, local2343, local2403, local2363);
						@Pc(2598) int local2598 = Static143.method2586(arg6, arg5, local12, arg4, null, local2456, 0, 0.0F, local17, local2327, local2383, 0, 0, arg9, local2343, local2403, local2363);
						@Pc(2619) int local2619 = Static143.method2586(arg6, arg5, local12, arg4, null, local2441, 128, 0.0F, local17, local2327, local2383, 0, 0, arg9, local2343, local2403, local2363);
						@Pc(2622) int local2622 = local2508 + 1;
						local2506[0] = local2529;
						@Pc(2627) int local2627 = local2622 + 1;
						local2506[1] = local2575;
						if (local1048.length > 2) {
							local2627++;
							local2506[2] = Static143.method2586(arg6, arg5, local12, arg4, null, local1048[2], 64, 0.0F, local17, local2327, local2383, 128, 0, arg9, local2343, local2403, local2363);
						}
						local2506[local2627++] = local2552;
						if (local1061.length > 2) {
							local2506[local2627++] = Static143.method2586(arg6, arg5, local12, arg4, null, local1061[2], 0, 0.0F, local17, local2327, local2383, 64, 0, arg9, local2343, local2403, local2363);
						}
						local2506[local2627++] = local2598;
						if (local1070.length > 2) {
							local2506[local2627++] = Static143.method2586(arg6, arg5, local12, arg4, null, local1070[2], 64, 0.0F, local17, local2327, local2383, 0, 0, arg9, local2343, local2403, local2363);
						}
						local2506[local2627++] = local2619;
						if (local2316.length > 2) {
							local2506[local2627++] = Static143.method2586(arg6, arg5, local12, arg4, null, local2316[2], 128, 0.0F, local17, local2327, local2383, 64, 0, arg9, local2343, local2403, local2363);
						}
						local2506[local2627++] = local2575;
						local2327.method2362(local36, local12, local17, local2506, null, true);
					}
				}
			}
		}
		for (local1143 = (Class1_Sub20) local10.method3441(); local1143 != null; local1143 = (Class1_Sub20) local10.method3444()) {
			if (local1143.anInt3096 == 0) {
				local1143.method4742();
			} else {
				local1143.method2358();
			}
		}
		local12 = local10.method3439();
		@Pc(2825) long[] local2825 = new long[local12];
		@Pc(2828) Class1_Sub20[] local2828 = new Class1_Sub20[local12];
		local10.method3447(local2828);
		for (local28 = 0; local28 < local12; local28++) {
			local2825[local28] = local2828[local28].aLong201;
		}
		Static230.method4023(local2828, local2825);
		return local2828;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ok;IIIIIII)V")
	public static void method860(@OriginalArg(0) Class116[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class116 local9 = arg0[local1];
			if (local9 != null && local9.anInt4344 == arg1 && (!local9.aBoolean224 || local9.anInt4376 == 0 || local9.aBoolean227 || method866(local9).anInt1450 != 0 || local9 == Static143.aClass116_8 || local9.anInt4301 == 1338) && (!local9.aBoolean224 || !method854(local9))) {
				@Pc(50) int local50 = local9.anInt4366 + arg6;
				@Pc(55) int local55 = local9.anInt4371 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.anInt4376 == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt4299;
					@Pc(78) int local78 = local55 + local9.anInt4363;
					if (local9.anInt4376 == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static204.aClass116_11) {
					Static270.aBoolean307 = true;
					Static274.anInt2944 = local50;
					Static226.anInt4956 = local55;
				}
				if (!local9.aBoolean224 || local61 < local65 && local63 < local67) {
					if (local9.anInt4376 == 0) {
						if (!local9.aBoolean224 && method854(local9) && Static110.aClass116_6 != local9) {
							continue;
						}
						if (local9.aBoolean220 && Static84.anInt1989 >= local61 && Static212.anInt4711 >= local63 && Static84.anInt1989 < local65 && Static212.anInt4711 < local67) {
							for (@Pc(164) Class1_Sub27 local164 = (Class1_Sub27) Static131.aClass131_7.method3791(); local164 != null; local164 = (Class1_Sub27) Static131.aClass131_7.method3792()) {
								if (local164.aBoolean269) {
									local164.method4742();
									local164.aClass116_13.aBoolean231 = false;
								}
							}
							if (Static142.anInt3247 == 0) {
								Static204.aClass116_11 = null;
								Static143.aClass116_8 = null;
							}
							Static176.anInt3982 = 0;
						}
					}
					if (local9.aBoolean224) {
						@Pc(207) boolean local207;
						if (Static84.anInt1989 >= local61 && Static212.anInt4711 >= local63 && Static84.anInt1989 < local65 && Static212.anInt4711 < local67) {
							local207 = true;
						} else {
							local207 = false;
						}
						@Pc(212) boolean local212 = false;
						if (Static224.anInt4947 == 1 && local207) {
							local212 = true;
						}
						@Pc(221) boolean local221 = false;
						if (Static242.anInt5298 == 1 && Static182.anInt4419 >= local61 && Static279.anInt5967 >= local63 && Static182.anInt4419 < local65 && Static279.anInt5967 < local67) {
							local221 = true;
						}
						@Pc(243) int local243;
						@Pc(339) int local339;
						if (local9.aByteArray55 != null) {
							for (local243 = 0; local243 < local9.aByteArray55.length; local243++) {
								if (Static35.aBooleanArray2[local9.aByteArray55[local243]]) {
									if (local9.anIntArray403 == null || Static32.anInt809 >= local9.anIntArray403[local243]) {
										@Pc(279) byte local279 = local9.aByteArray56[local243];
										if (local279 == 0 || ((local279 & 0x8) == 0 || !Static35.aBooleanArray2[86] && !Static35.aBooleanArray2[82] && !Static35.aBooleanArray2[81]) && ((local279 & 0x2) == 0 || Static35.aBooleanArray2[86]) && ((local279 & 0x1) == 0 || Static35.aBooleanArray2[82]) && ((local279 & 0x4) == 0 || Static35.aBooleanArray2[81])) {
											Static101.method2285(-1, "", local9.anInt4290, local243 + 1);
											local339 = local9.anIntArray394[local243];
											if (local9.anIntArray403 == null) {
												local9.anIntArray403 = new int[local9.aByteArray55.length];
											}
											if (local339 == 0) {
												local9.anIntArray403[local243] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray403[local243] = Static32.anInt809 + local339;
											}
										}
									}
								} else if (local9.anIntArray403 != null) {
									local9.anIntArray403[local243] = 0;
								}
							}
						}
						if (local221) {
							Static255.method4318(Static182.anInt4419 - local50, local9, Static279.anInt5967 - local55);
						}
						if (Static204.aClass116_11 != null && Static204.aClass116_11 != local9 && local207 && method866(local9).method1096()) {
							Static157.aClass116_9 = local9;
						}
						if (local9 == Static143.aClass116_8) {
							Static228.aBoolean273 = true;
							Static231.anInt5455 = local50;
							Static250.anInt1874 = local55;
						}
						if (local9.aBoolean227 || local9.anInt4301 != 0) {
							@Pc(416) Class1_Sub27 local416;
							if (local207 && Static161.anInt3716 != 0 && local9.anObjectArray12 != null) {
								local416 = new Class1_Sub27();
								local416.aBoolean269 = true;
								local416.aClass116_13 = local9;
								local416.anInt4905 = Static161.anInt3716;
								local416.anObjectArray32 = local9.anObjectArray12;
								Static131.aClass131_7.method3799(local416);
							}
							if (Static204.aClass116_11 != null || Static117.aClass116_7 != null || Static218.aBoolean267 || local9.anInt4301 != 1400 && Static176.anInt3982 > 0) {
								local221 = false;
								local212 = false;
								local207 = false;
							}
							@Pc(522) int local522;
							if (local9.anInt4301 != 0) {
								if (local9.anInt4301 == 1337) {
									Static59.aClass116_2 = local9;
									continue;
								}
								if (local9.anInt4301 == 1338) {
									if (local221) {
										Static245.anInt5369 = Static182.anInt4419 - local50;
										Static230.anInt5100 = Static279.anInt5967 - local55;
									}
									continue;
								}
								if (local9.anInt4301 == 1400) {
									Static236.aClass116_15 = local9;
									if (local221) {
										if (Static35.aBooleanArray2[82] && Static76.anInt5428 > 0) {
											local243 = (int) ((double) (Static182.anInt4419 - local50 - local9.anInt4299 / 2) * 2.0D / (double) Static241.aFloat173);
											local522 = (int) ((double) (Static279.anInt5967 - local55 - local9.anInt4363 / 2) * 2.0D / (double) Static241.aFloat173);
											local339 = Static87.anInt2033 + local243;
											@Pc(530) int local530 = Static88.anInt2053 + local522;
											@Pc(534) int local534 = local339 + Static234.anInt5158;
											@Pc(542) int local542 = Static173.anInt3932 + Static48.anInt1347 - local530 - 1;
											@Pc(545) Class1_Sub2_Sub9 local545 = Static64.method1247();
											@Pc(551) int[] local551 = local545.method1635(local534, local542);
											if (local551 != null) {
												Static200.method2870(local551[0], local551[1], local551[2]);
												Static32.method665();
											}
											continue;
										}
										Static176.anInt3982 = 1;
										Static193.anInt4364 = Static84.anInt1989;
										Static265.anInt5771 = Static212.anInt4711;
										continue;
									}
									if (local212 && Static176.anInt3982 > 0) {
										if (Static176.anInt3982 == 1 && (Static193.anInt4364 != Static84.anInt1989 || Static265.anInt5771 != Static212.anInt4711)) {
											Static55.anInt1472 = Static87.anInt2033;
											Static283.anInt6027 = Static88.anInt2053;
											Static176.anInt3982 = 2;
										}
										if (Static176.anInt3982 == 2) {
											Static77.method1526(Static55.anInt1472 + (int) ((double) (Static193.anInt4364 - Static84.anInt1989) * 2.0D / (double) Static105.aFloat200));
											Static164.method3044(Static283.anInt6027 + (int) ((double) (Static265.anInt5771 - Static212.anInt4711) * 2.0D / (double) Static105.aFloat200));
										}
										continue;
									}
									Static176.anInt3982 = 0;
									continue;
								}
								if (local9.anInt4301 == 1401) {
									if (local212) {
										Static146.method2771(Static84.anInt1989 - local50, local9.anInt4363, local9.anInt4299, Static212.anInt4711 - local55);
									}
									continue;
								}
								if (local9.anInt4301 == 1402) {
									if (!Static296.aBoolean335) {
										Static189.method3378(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean230 && local221) {
								local9.aBoolean230 = true;
								if (local9.anObjectArray20 != null) {
									local416 = new Class1_Sub27();
									local416.aBoolean269 = true;
									local416.aClass116_13 = local9;
									local416.anInt4899 = Static182.anInt4419 - local50;
									local416.anInt4905 = Static279.anInt5967 - local55;
									local416.anObjectArray32 = local9.anObjectArray20;
									Static131.aClass131_7.method3799(local416);
								}
							}
							if (local9.aBoolean230 && local212 && local9.anObjectArray10 != null) {
								local416 = new Class1_Sub27();
								local416.aBoolean269 = true;
								local416.aClass116_13 = local9;
								local416.anInt4899 = Static84.anInt1989 - local50;
								local416.anInt4905 = Static212.anInt4711 - local55;
								local416.anObjectArray32 = local9.anObjectArray10;
								Static131.aClass131_7.method3799(local416);
							}
							if (local9.aBoolean230 && !local212) {
								local9.aBoolean230 = false;
								if (local9.anObjectArray22 != null) {
									local416 = new Class1_Sub27();
									local416.aBoolean269 = true;
									local416.aClass116_13 = local9;
									local416.anInt4899 = Static84.anInt1989 - local50;
									local416.anInt4905 = Static212.anInt4711 - local55;
									local416.anObjectArray32 = local9.anObjectArray22;
									Static227.aClass131_15.method3799(local416);
								}
							}
							if (local212 && local9.anObjectArray17 != null) {
								local416 = new Class1_Sub27();
								local416.aBoolean269 = true;
								local416.aClass116_13 = local9;
								local416.anInt4899 = Static84.anInt1989 - local50;
								local416.anInt4905 = Static212.anInt4711 - local55;
								local416.anObjectArray32 = local9.anObjectArray17;
								Static131.aClass131_7.method3799(local416);
							}
							if (!local9.aBoolean231 && local207) {
								local9.aBoolean231 = true;
								if (local9.anObjectArray4 != null) {
									local416 = new Class1_Sub27();
									local416.aBoolean269 = true;
									local416.aClass116_13 = local9;
									local416.anInt4899 = Static84.anInt1989 - local50;
									local416.anInt4905 = Static212.anInt4711 - local55;
									local416.anObjectArray32 = local9.anObjectArray4;
									Static131.aClass131_7.method3799(local416);
								}
							}
							if (local9.aBoolean231 && local207 && local9.anObjectArray21 != null) {
								local416 = new Class1_Sub27();
								local416.aBoolean269 = true;
								local416.aClass116_13 = local9;
								local416.anInt4899 = Static84.anInt1989 - local50;
								local416.anInt4905 = Static212.anInt4711 - local55;
								local416.anObjectArray32 = local9.anObjectArray21;
								Static131.aClass131_7.method3799(local416);
							}
							if (local9.aBoolean231 && !local207) {
								local9.aBoolean231 = false;
								if (local9.anObjectArray29 != null) {
									local416 = new Class1_Sub27();
									local416.aBoolean269 = true;
									local416.aClass116_13 = local9;
									local416.anInt4899 = Static84.anInt1989 - local50;
									local416.anInt4905 = Static212.anInt4711 - local55;
									local416.anObjectArray32 = local9.anObjectArray29;
									Static227.aClass131_15.method3799(local416);
								}
							}
							if (local9.anObjectArray14 != null) {
								local416 = new Class1_Sub27();
								local416.aClass116_13 = local9;
								local416.anObjectArray32 = local9.anObjectArray14;
								Static281.aClass131_26.method3799(local416);
							}
							@Pc(997) Class1_Sub27 local997;
							if (local9.anObjectArray26 != null && Static258.anInt5644 > local9.anInt4384) {
								if (local9.anIntArray395 == null || Static258.anInt5644 - local9.anInt4384 > 32) {
									local416 = new Class1_Sub27();
									local416.aClass116_13 = local9;
									local416.anObjectArray32 = local9.anObjectArray26;
									Static131.aClass131_7.method3799(local416);
								} else {
									label570: for (local243 = local9.anInt4384; local243 < Static258.anInt5644; local243++) {
										local522 = Static156.anIntArray329[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray395.length; local339++) {
											if (local9.anIntArray395[local339] == local522) {
												local997 = new Class1_Sub27();
												local997.aClass116_13 = local9;
												local997.anObjectArray32 = local9.anObjectArray26;
												Static131.aClass131_7.method3799(local997);
												break label570;
											}
										}
									}
								}
								local9.anInt4384 = Static258.anInt5644;
							}
							if (local9.anObjectArray6 != null && Static289.anInt6095 > local9.anInt4355) {
								if (local9.anIntArray391 == null || Static289.anInt6095 - local9.anInt4355 > 32) {
									local416 = new Class1_Sub27();
									local416.aClass116_13 = local9;
									local416.anObjectArray32 = local9.anObjectArray6;
									Static131.aClass131_7.method3799(local416);
								} else {
									label546: for (local243 = local9.anInt4355; local243 < Static289.anInt6095; local243++) {
										local522 = Static238.anIntArray540[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray391.length; local339++) {
											if (local9.anIntArray391[local339] == local522) {
												local997 = new Class1_Sub27();
												local997.aClass116_13 = local9;
												local997.anObjectArray32 = local9.anObjectArray6;
												Static131.aClass131_7.method3799(local997);
												break label546;
											}
										}
									}
								}
								local9.anInt4355 = Static289.anInt6095;
							}
							if (local9.anObjectArray3 != null && Static141.anInt3237 > local9.anInt4313) {
								if (local9.anIntArray389 == null || Static141.anInt3237 - local9.anInt4313 > 32) {
									local416 = new Class1_Sub27();
									local416.aClass116_13 = local9;
									local416.anObjectArray32 = local9.anObjectArray3;
									Static131.aClass131_7.method3799(local416);
								} else {
									label522: for (local243 = local9.anInt4313; local243 < Static141.anInt3237; local243++) {
										local522 = Static252.anIntArray557[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray389.length; local339++) {
											if (local9.anIntArray389[local339] == local522) {
												local997 = new Class1_Sub27();
												local997.aClass116_13 = local9;
												local997.anObjectArray32 = local9.anObjectArray3;
												Static131.aClass131_7.method3799(local997);
												break label522;
											}
										}
									}
								}
								local9.anInt4313 = Static141.anInt3237;
							}
							if (local9.anObjectArray7 != null && Static33.anInt864 > local9.anInt4288) {
								if (local9.anIntArray402 == null || Static33.anInt864 - local9.anInt4288 > 32) {
									local416 = new Class1_Sub27();
									local416.aClass116_13 = local9;
									local416.anObjectArray32 = local9.anObjectArray7;
									Static131.aClass131_7.method3799(local416);
								} else {
									label498: for (local243 = local9.anInt4288; local243 < Static33.anInt864; local243++) {
										local522 = Static80.anIntArray199[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray402.length; local339++) {
											if (local9.anIntArray402[local339] == local522) {
												local997 = new Class1_Sub27();
												local997.aClass116_13 = local9;
												local997.anObjectArray32 = local9.anObjectArray7;
												Static131.aClass131_7.method3799(local997);
												break label498;
											}
										}
									}
								}
								local9.anInt4288 = Static33.anInt864;
							}
							if (local9.anObjectArray24 != null && Static140.anInt3211 > local9.anInt4327) {
								if (local9.anIntArray396 == null || Static140.anInt3211 - local9.anInt4327 > 32) {
									local416 = new Class1_Sub27();
									local416.aClass116_13 = local9;
									local416.anObjectArray32 = local9.anObjectArray24;
									Static131.aClass131_7.method3799(local416);
								} else {
									label474: for (local243 = local9.anInt4327; local243 < Static140.anInt3211; local243++) {
										local522 = Static26.anIntArray72[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray396.length; local339++) {
											if (local9.anIntArray396[local339] == local522) {
												local997 = new Class1_Sub27();
												local997.aClass116_13 = local9;
												local997.anObjectArray32 = local9.anObjectArray24;
												Static131.aClass131_7.method3799(local997);
												break label474;
											}
										}
									}
								}
								local9.anInt4327 = Static140.anInt3211;
							}
							if (Static281.anInt6015 > local9.anInt4345 && local9.anObjectArray9 != null) {
								local416 = new Class1_Sub27();
								local416.aClass116_13 = local9;
								local416.anObjectArray32 = local9.anObjectArray9;
								Static131.aClass131_7.method3799(local416);
							}
							if (Static254.anInt5408 > local9.anInt4345 && local9.anObjectArray5 != null) {
								local416 = new Class1_Sub27();
								local416.aClass116_13 = local9;
								local416.anObjectArray32 = local9.anObjectArray5;
								Static131.aClass131_7.method3799(local416);
							}
							if (Static9.anInt272 > local9.anInt4345 && local9.anObjectArray27 != null) {
								local416 = new Class1_Sub27();
								local416.aClass116_13 = local9;
								local416.anObjectArray32 = local9.anObjectArray27;
								Static131.aClass131_7.method3799(local416);
							}
							if (Static154.anInt3555 > local9.anInt4345 && local9.anObjectArray18 != null) {
								local416 = new Class1_Sub27();
								local416.aClass116_13 = local9;
								local416.anObjectArray32 = local9.anObjectArray18;
								Static131.aClass131_7.method3799(local416);
							}
							if (Static80.anInt1915 > local9.anInt4345 && local9.anObjectArray15 != null) {
								local416 = new Class1_Sub27();
								local416.aClass116_13 = local9;
								local416.anObjectArray32 = local9.anObjectArray15;
								Static131.aClass131_7.method3799(local416);
							}
							local9.anInt4345 = Static27.anInt754;
							if (local9.anObjectArray30 != null) {
								for (local243 = 0; local243 < Static14.anInt379; local243++) {
									@Pc(1461) Class1_Sub27 local1461 = new Class1_Sub27();
									local1461.aClass116_13 = local9;
									local1461.anInt4903 = Static292.anIntArray610[local243];
									local1461.anInt4900 = Static101.anIntArray272[local243];
									local1461.anObjectArray32 = local9.anObjectArray30;
									Static131.aClass131_7.method3799(local1461);
								}
							}
							if (Static158.aBoolean189 && local9.anObjectArray13 != null) {
								local416 = new Class1_Sub27();
								local416.aClass116_13 = local9;
								local416.anObjectArray32 = local9.anObjectArray13;
								Static131.aClass131_7.method3799(local416);
							}
						}
					}
					if (!local9.aBoolean224 && Static204.aClass116_11 == null && Static117.aClass116_7 == null && !Static218.aBoolean267) {
						if ((local9.anInt4359 >= 0 || local9.anInt4296 != 0) && Static84.anInt1989 >= local61 && Static212.anInt4711 >= local63 && Static84.anInt1989 < local65 && Static212.anInt4711 < local67) {
							if (local9.anInt4359 >= 0) {
								Static110.aClass116_6 = arg0[local9.anInt4359];
							} else {
								Static110.aClass116_6 = local9;
							}
						}
						if (local9.anInt4376 == 8 && Static84.anInt1989 >= local61 && Static212.anInt4711 >= local63 && Static84.anInt1989 < local65 && Static212.anInt4711 < local67) {
							Static87.aClass116_4 = local9;
						}
						if (local9.anInt4320 > local9.anInt4363) {
							Static215.method3782(local55, local9, local50 + local9.anInt4299, local9.anInt4320, Static84.anInt1989, local9.anInt4363, Static212.anInt4711);
						}
					}
					if (local9.anInt4376 == 0) {
						method860(arg0, local9.anInt4290, local61, local63, local65, local67, local50 - local9.anInt4303, local55 - local9.anInt4307);
						if (local9.aClass116Array1 != null) {
							method860(local9.aClass116Array1, local9.anInt4290, local61, local63, local65, local67, local50 - local9.anInt4303, local55 - local9.anInt4307);
						}
						@Pc(1626) Class1_Sub12 local1626 = (Class1_Sub12) Static147.aClass117_12.method3438((long) local9.anInt4290);
						if (local1626 != null) {
							Static181.method3282(local61, local63, local67, local1626.anInt2230, local55, local65, local50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)I")
	public static int method862() {
		if ((double) Static105.aFloat200 == 3.0D) {
			return 37;
		} else if ((double) Static105.aFloat200 == 4.0D) {
			return 50;
		} else if ((double) Static105.aFloat200 == 6.0D) {
			return 75;
		} else if ((double) Static105.aFloat200 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	public static void method864(@OriginalArg(1) int arg0) {
		Static176.aClass1_Sub2_Sub9_2 = (Class1_Sub2_Sub9) Static146.aClass117_11.method3438((long) arg0);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ok;)Lclient!e;")
	public static Class1_Sub8 method866(@OriginalArg(0) Class116 arg0) {
		@Pc(13) Class1_Sub8 local13 = (Class1_Sub8) Static99.aClass117_7.method3438(((long) arg0.anInt4290 << 32) + (long) arg0.anInt4297);
		return local13 == null ? arg0.aClass1_Sub8_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIZI[BII[Lclient!de;)[I")
	public static int[] method867(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class36[] arg6) {
		@Pc(9) byte local9;
		if (arg1) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		@Pc(23) int local23;
		@Pc(28) int local28;
		if (!arg1) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				for (local23 = 0; local23 < 64; local23++) {
					for (local28 = 0; local28 < 64; local28++) {
						if (arg4 + local23 > 0 && arg4 + local23 < 103 && local28 + arg2 > 0 && local28 + arg2 < 103) {
							arg6[local18].anIntArrayArray7[arg4 + local23][arg2 + local28] &= 0xFFDFFFFF;
						}
					}
				}
			}
		}
		@Pc(101) Class1_Sub16 local101 = new Class1_Sub16(arg3);
		local23 = arg0 + arg4;
		local28 = arg5 + arg2;
		@Pc(131) int local131;
		for (@Pc(119) int local119 = 0; local119 < local9; local119++) {
			for (@Pc(124) int local124 = 0; local124 < 64; local124++) {
				for (local131 = 0; local131 < 64; local131++) {
					Static196.method3523(arg1, 0, local101, local124 + local23, 0, 0, arg2 + local131, local119, local131 + local28, local124 - -arg4, false);
				}
			}
		}
		@Pc(169) boolean local169 = false;
		@Pc(171) boolean local171 = false;
		@Pc(201) int local201;
		@Pc(219) int local219;
		@Pc(217) int local217;
		@Pc(252) int local252;
		@Pc(250) int local250;
		while (local101.aByteArray39.length > local101.anInt3328) {
			local131 = local101.method2655();
			if (local131 == 128) {
				Static225.anIntArray515[0] = local101.method2652();
				local169 = true;
				Static225.anIntArray515[1] = local101.method2645();
				Static225.anIntArray515[2] = local101.method2645();
				Static225.anIntArray515[3] = local101.method2645();
				Static225.anIntArray515[4] = local101.method2652();
			} else {
				if (local131 != 129) {
					local101.anInt3328--;
					break;
				}
				local171 = true;
				for (local201 = 0; local201 < 4; local201++) {
					@Pc(208) byte local208 = local101.method2633();
					if (local208 == 0) {
						local217 = arg4 + 64;
						local219 = arg4;
						if (arg4 < 0) {
							local219 = 0;
						} else if (arg4 >= 104) {
							local219 = 104;
						}
						if (local217 < 0) {
							local217 = 0;
						} else if (local217 >= 104) {
							local217 = 104;
						}
						local250 = arg2 + 64;
						local252 = arg2;
						if (arg2 < 0) {
							local252 = 0;
						} else if (arg2 >= 104) {
							local252 = 104;
						}
						if (local250 < 0) {
							local250 = 0;
						} else if (local250 >= 104) {
							local250 = 104;
						}
						while (local217 > local219) {
							while (local252 < local250) {
								Static75.aByteArrayArrayArray11[local201][local219][local252] = 0;
								local252++;
							}
							local219++;
						}
					} else if (local208 == 1) {
						for (local219 = 0; local219 < 64; local219 += 4) {
							for (local217 = 0; local217 < 64; local217 += 4) {
								@Pc(325) byte local325 = local101.method2633();
								for (local250 = local219 + arg4; local250 < local219 + arg4 + 4; local250++) {
									for (@Pc(340) int local340 = arg2 + local217; local340 < arg2 + local217 + 4; local340++) {
										if (local250 >= 0 && local250 < 104 && local340 >= 0 && local340 < 104) {
											Static75.aByteArrayArrayArray11[local201][local250][local340] = local325;
										}
									}
								}
							}
						}
					} else if (local208 == 2 && local201 > 0) {
						local219 = arg4;
						local252 = arg2;
						local250 = arg2 + 64;
						local217 = arg4 + 64;
						if (local217 < 0) {
							local217 = 0;
						} else if (local217 >= 104) {
							local217 = 104;
						}
						if (arg4 < 0) {
							local219 = 0;
						} else if (arg4 >= 104) {
							local219 = 104;
						}
						if (local250 < 0) {
							local250 = 0;
						} else if (local250 >= 104) {
							local250 = 104;
						}
						if (arg2 < 0) {
							local252 = 0;
						} else if (arg2 >= 104) {
							local252 = 104;
						}
						while (local219 < local217) {
							while (local252 < local250) {
								Static75.aByteArrayArrayArray11[local201][local219][local252] = Static75.aByteArrayArrayArray11[local201 - 1][local219][local252];
								local252++;
							}
							local219++;
						}
					}
				}
			}
		}
		@Pc(558) int local558;
		if (Static296.aBoolean335 && !arg1) {
			@Pc(537) Class59 local537 = null;
			label286: while (true) {
				label279: do {
					while (true) {
						while (local101.aByteArray39.length > local101.anInt3328) {
							local201 = local101.method2655();
							if (local201 == 0) {
								local537 = new Class59(local101);
							} else {
								if (local201 == 1) {
									local558 = local101.method2655();
									continue label279;
								}
								if (local201 != 2) {
									throw new IllegalStateException();
								}
								if (local537 == null) {
									local537 = new Class59();
								}
								local537.method1455(local101);
							}
						}
						if (local537 == null) {
							local537 = new Class59();
						}
						for (local201 = 0; local201 < 8; local201++) {
							for (local558 = 0; local558 < 8; local558++) {
								local219 = local201 + (arg4 >> 3);
								local217 = (arg2 >> 3) + local558;
								if (local219 >= 0 && local219 < 13 && local217 >= 0 && local217 < 13) {
									Static112.aClass59ArrayArray1[local219][local217] = local537;
								}
							}
						}
						break label286;
					}
				} while (local558 <= 0);
				for (local219 = 0; local219 < local558; local219++) {
					@Pc(570) Class103 local570 = new Class103(local101);
					if (local570.anInt3865 == 31) {
						@Pc(581) Class93 local581 = Static258.method4393(local101.method2652());
						local570.method3139(local581.anInt3539, local581.anInt3538, local581.anInt3546, local581.anInt3547);
					}
					local570.anInt3854 += arg2 << 7;
					local570.anInt3861 += arg4 << 7;
					local252 = local570.anInt3861 >> 7;
					local250 = local570.anInt3854 >> 7;
					if (local252 >= 0 && local250 >= 0 && local252 < 104 && local250 < 104) {
						local570.aBoolean197 = (Static126.aByteArrayArrayArray24[1][local252][local250] & 0x2) != 0;
						local570.anInt3849 = Static287.anIntArrayArrayArray18[local570.anInt3848][local252][local250] - local570.anInt3849;
						Static67.method1282(local570);
					}
				}
			}
		}
		if (!local171) {
			for (local131 = 0; local131 < 4; local131++) {
				for (local201 = 0; local201 < 16; local201++) {
					for (local558 = 0; local558 < 16; local558++) {
						local219 = (arg4 >> 2) + local201;
						local217 = local558 + (arg2 >> 2);
						if (local219 >= 0 && local219 < 26 && local217 >= 0 && local217 < 26) {
							Static75.aByteArrayArrayArray11[local131][local219][local217] = 0;
						}
					}
				}
			}
		}
		return local169 ? Static225.anIntArray515 : null;
	}
}
