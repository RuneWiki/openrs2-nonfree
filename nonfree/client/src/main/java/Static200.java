import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
	public static int anInt4361 = -1;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
	public static int anInt4363 = 0;

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "[I")
	public static int[] anIntArray390 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!jh;[I[I[IZ)V")
	public static void method3201(@OriginalArg(0) Class2_Sub4_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(11) int local11 = arg1[local3];
			@Pc(15) int local15 = arg3[local3];
			@Pc(19) int local19 = arg2[local3];
			for (@Pc(21) int local21 = 0; local15 != 0 && local21 < arg0.aClass36Array3.length; local21++) {
				if ((local15 & 0x1) != 0) {
					if (local11 == -1) {
						arg0.aClass36Array3[local21] = null;
					} else {
						@Pc(45) Class32 local45 = Static202.method3231(local11);
						@Pc(48) int local48 = local45.anInt972;
						@Pc(53) Class36 local53 = arg0.aClass36Array3[local21];
						if (local53 != null) {
							if (local11 == local53.anInt1069) {
								if (local48 == 0) {
									local53 = arg0.aClass36Array3[local21] = null;
								} else if (local48 == 1) {
									local53.anInt1067 = local19;
									local53.anInt1068 = 0;
									local53.anInt1065 = 0;
									local53.anInt1066 = 0;
									local53.anInt1064 = 1;
									Static154.method2507(Static56.aClass2_Sub4_Sub2_1 == arg0, arg0.anInt2846, arg0.anInt2794, 0, local45);
								} else if (local48 == 2) {
									local53.anInt1065 = 0;
								}
							} else if (local45.anInt967 >= Static202.method3231(local53.anInt1069).anInt967) {
								local53 = arg0.aClass36Array3[local21] = null;
							}
						}
						if (local53 == null) {
							local53 = arg0.aClass36Array3[local21] = new Class36();
							local53.anInt1064 = 1;
							local53.anInt1066 = 0;
							local53.anInt1065 = 0;
							local53.anInt1068 = 0;
							local53.anInt1067 = local19;
							local53.anInt1069 = local11;
							Static154.method2507(arg0 == Static56.aClass2_Sub4_Sub2_1, arg0.anInt2846, arg0.anInt2794, 0, local45);
						}
					}
				}
				local15 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	public static void method3203() {
		@Pc(2) Class185 local2 = Static253.aClass185_1;
		synchronized (Static253.aClass185_1) {
			Static245.anInt5017++;
			Static202.anInt4403 = Static252.anInt5112;
			Static89.anInt5974 = Static199.anInt6293;
			Static289.anInt5816 = Static157.anInt3508;
			Static17.anInt472 = Static131.anInt3039;
			Static89.anInt5976 = Static132.anInt3052;
			Static94.anInt2165 = Static109.anInt2412;
			Static160.aLong112 = Static280.aLong217;
			Static131.anInt3039 = 0;
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)I")
	public static int method3204() {
		return Static240.aClass89_37.method2270();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[[B[[F[[B[[F[[B[[II[[B[[[B[[I[[F)[Lclient!ua;")
	public static Class1_Sub28[] method3205(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][][] arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) float[][] arg10) {
		@Pc(10) Class186 local10 = new Class186(128);
		@Pc(12) int local12;
		@Pc(19) int local19;
		@Pc(38) int local38;
		@Pc(30) int local30;
		@Pc(133) int local133;
		@Pc(135) int local135;
		@Pc(145) int local145;
		@Pc(155) int local155;
		@Pc(165) int local165;
		@Pc(175) int local175;
		@Pc(187) int local187;
		@Pc(199) int local199;
		@Pc(223) int local223;
		@Pc(211) int local211;
		@Pc(264) byte local264;
		@Pc(299) int local299;
		@Pc(313) int local313;
		@Pc(124) int local124;
		@Pc(129) int local129;
		@Pc(750) int local750;
		@Pc(1023) int local1023;
		@Pc(1060) boolean[] local1060;
		@Pc(1069) boolean[] local1069;
		@Pc(1078) boolean[] local1078;
		for (local12 = 1; local12 <= 102; local12++) {
			for (local19 = 1; local19 <= 102; local19++) {
				local30 = arg1[local12][local19] & 0xFF;
				local38 = arg7[local12][local19] & 0xFF;
				if (local30 != 0) {
					@Pc(51) Class62 local51 = Static148.method2407(local30 - 1);
					if (local51.anInt1980 == -1) {
						continue;
					}
					@Pc(61) Class1_Sub28 local61 = Static41.method826(local51, local10);
					@Pc(67) byte local67 = arg5[local12][local19];
					@Pc(71) int[] local71 = Static162.anIntArrayArray41[local67];
					local61.anInt5506 += local71.length / 2;
					local61.anInt5510++;
					if (local51.aBoolean136 && local38 != 0) {
						local61.anInt5506 += Static279.anIntArray506[local67];
					}
				}
				if ((arg7[local12][local19] & 0xFF) != 0 || local30 != 0 && arg5[local12][local19] == 0) {
					local124 = 0;
					@Pc(127) int[] local127 = new int[8];
					local129 = 0;
					@Pc(131) int local131 = 0;
					local133 = 0;
					local135 = 0;
					local145 = arg1[local12][local19 + 1] & 0xFF;
					local155 = arg1[local12 - 1][local19] & 0xFF;
					local165 = arg1[local12][local19 - 1] & 0xFF;
					local175 = arg1[local12 + 1][local19] & 0xFF;
					local187 = arg1[local12 - 1][local19 + 1] & 0xFF;
					local199 = arg1[local12 - 1][local19 - 1] & 0xFF;
					local211 = arg1[local12 + 1][local19 + 1] & 0xFF;
					local223 = arg1[local12 + 1][local19 - 1] & 0xFF;
					@Pc(241) Class62 local241;
					@Pc(274) byte local274;
					@Pc(286) int local286;
					if (local187 != 0 && local30 != local187) {
						local241 = Static148.method2407(local187 - 1);
						if (local241.aBoolean136 && local241.anInt1980 != -1) {
							local264 = arg5[local12 - 1][local19 + 1];
							local274 = arg3[local12 - 1][local19 + 1];
							local286 = Static279.anIntArray508[local264 * 4 + (local274 + 2 & 0x3)];
							local299 = Static279.anIntArray508[local264 * 4 + (local274 + 3 & 0x3)];
							if (!Static90.aBooleanArrayArray1[local299][1] || !Static90.aBooleanArrayArray1[local286][0]) {
								for (local313 = 0; local313 < 8; local313++) {
									if (local313 == 0) {
										local124++;
										local127[0] = local187;
										break;
									}
									if (local187 == local127[local313]) {
										break;
									}
								}
							}
						}
					}
					if (local199 != 0 && local199 != local30) {
						local241 = Static148.method2407(local199 - 1);
						if (local241.aBoolean136 && local241.anInt1980 != -1) {
							local274 = arg3[local12 - 1][local19 - 1];
							local264 = arg5[local12 - 1][local19 - 1];
							local286 = Static279.anIntArray508[(local274 & 0x3) + local264 * 4];
							local299 = Static279.anIntArray508[local264 * 4 + (local274 + 3 & 0x3)];
							if (!Static90.aBooleanArrayArray1[local286][1] || !Static90.aBooleanArrayArray1[local299][0]) {
								for (local313 = 0; local313 < 8; local313++) {
									if (local124 == local313) {
										local127[local124++] = local199;
										break;
									}
									if (local199 == local127[local313]) {
										break;
									}
								}
							}
						}
					}
					if (local223 != 0 && local223 != local30) {
						local241 = Static148.method2407(local223 - 1);
						if (local241.aBoolean136 && local241.anInt1980 != -1) {
							local274 = arg3[local12 + 1][local19 - 1];
							local264 = arg5[local12 + 1][local19 - 1];
							local286 = Static279.anIntArray508[(local274 & 0x3) + local264 * 4];
							local299 = Static279.anIntArray508[local264 * 4 + (local274 + 1 & 0x3)];
							if (!Static90.aBooleanArrayArray1[local299][1] || !Static90.aBooleanArrayArray1[local286][0]) {
								for (local313 = 0; local313 < 8; local313++) {
									if (local124 == local313) {
										local127[local124++] = local223;
										break;
									}
									if (local223 == local127[local313]) {
										break;
									}
								}
							}
						}
					}
					if (local211 != 0 && local30 != local211) {
						local241 = Static148.method2407(local211 - 1);
						if (local241.aBoolean136 && local241.anInt1980 != -1) {
							local274 = arg3[local12 + 1][local19 + 1];
							local264 = arg5[local12 + 1][local19 + 1];
							local286 = Static279.anIntArray508[(local274 + 2 & 0x3) + local264 * 4];
							local299 = Static279.anIntArray508[local264 * 4 + (local274 + 1 & 0x3)];
							if (!Static90.aBooleanArrayArray1[local286][1] || !Static90.aBooleanArrayArray1[local299][0]) {
								for (local313 = 0; local313 < 8; local313++) {
									if (local124 == local313) {
										local127[local124++] = local211;
										break;
									}
									if (local127[local313] == local211) {
										break;
									}
								}
							}
						}
					}
					if (local145 != 0 && local30 != local145) {
						local241 = Static148.method2407(local145 - 1);
						if (local241.aBoolean136 && local241.anInt1980 != -1) {
							local131 = Static279.anIntArray508[arg5[local12][local19 + 1] * 4 + (arg3[local12][local19 + 1] + 2 & 0x3)];
							for (local750 = 0; local750 < 8; local750++) {
								if (local750 == local124) {
									local127[local124++] = local145;
									break;
								}
								if (local127[local750] == local145) {
									break;
								}
							}
						}
					}
					if (local155 != 0 && local155 != local30) {
						local241 = Static148.method2407(local155 - 1);
						if (local241.aBoolean136 && local241.anInt1980 != -1) {
							local129 = Static279.anIntArray508[(arg3[local12 - 1][local19] + 3 & 0x3) + arg5[local12 - 1][local19] * 4];
							for (local750 = 0; local750 < 8; local750++) {
								if (local750 == local124) {
									local127[local124++] = local155;
									break;
								}
								if (local127[local750] == local155) {
									break;
								}
							}
						}
					}
					if (local165 != 0 && local165 != local30) {
						local241 = Static148.method2407(local165 - 1);
						if (local241.aBoolean136 && local241.anInt1980 != -1) {
							local133 = Static279.anIntArray508[(arg3[local12][local19 - 1] & 0x3) + arg5[local12][local19 - 1] * 4];
							for (local750 = 0; local750 < 8; local750++) {
								if (local750 == local124) {
									local127[local124++] = local165;
									break;
								}
								if (local127[local750] == local165) {
									break;
								}
							}
						}
					}
					if (local175 != 0 && local30 != local175) {
						local241 = Static148.method2407(local175 - 1);
						if (local241.aBoolean136 && local241.anInt1980 != -1) {
							local135 = Static279.anIntArray508[(arg3[local12 + 1][local19] + 1 & 0x3) + arg5[local12 + 1][local19] * 4];
							for (local750 = 0; local750 < 8; local750++) {
								if (local750 == local124) {
									local127[local124++] = local175;
									break;
								}
								if (local127[local750] == local175) {
									break;
								}
							}
						}
					}
					for (local1023 = 0; local1023 < local124; local1023++) {
						local750 = local127[local1023];
						@Pc(1047) boolean[] local1047 = Static90.aBooleanArrayArray1[local750 == local145 ? local131 : 0];
						local1060 = Static90.aBooleanArrayArray1[local155 == local750 ? local129 : 0];
						local1069 = Static90.aBooleanArrayArray1[local165 == local750 ? local133 : 0];
						local1078 = Static90.aBooleanArrayArray1[local175 == local750 ? local135 : 0];
						@Pc(1084) Class62 local1084 = Static148.method2407(local750 - 1);
						@Pc(1089) Class1_Sub28 local1089 = Static41.method826(local1084, local10);
						local1089.anInt5506 += 5;
						local1089.anInt5506 += local1047.length - 2;
						local1089.anInt5506 += local1060.length - 2;
						local1089.anInt5506 += local1069.length - 2;
						local1089.anInt5506 += local1078.length - 2;
						local1089.anInt5510++;
					}
				}
			}
		}
		@Pc(1151) Class1_Sub28 local1151;
		for (local1151 = (Class1_Sub28) local10.method4567(); local1151 != null; local1151 = (Class1_Sub28) local10.method4579()) {
			local1151.method4168();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local19 = 1; local19 <= 102; local19++) {
				local30 = arg7[local12][local19] & 0xFF;
				local124 = arg1[local12][local19] & 0xFF;
				if ((arg8[arg0][local12][local19] & 0x8) != 0) {
					local38 = 0;
				} else if ((arg8[1][local12][local19] & 0x2) == 2 && arg0 > 0) {
					local38 = arg0 - 1;
				} else {
					local38 = arg0;
				}
				if (local124 != 0) {
					@Pc(1247) Class62 local1247 = Static148.method2407(local124 - 1);
					if (local1247.anInt1980 == -1) {
						continue;
					}
					@Pc(1258) Class1_Sub28 local1258 = Static41.method826(local1247, local10);
					@Pc(1264) byte local1264 = arg5[local12][local19];
					@Pc(1270) byte local1270 = arg3[local12][local19];
					local135 = Static114.method1846(local1247.anInt1980, local1247.anInt1983, arg9[local12][local19]);
					local145 = Static114.method1846(local1247.anInt1980, local1247.anInt1983, arg9[local12 + 1][local19]);
					local155 = Static114.method1846(local1247.anInt1980, local1247.anInt1983, arg9[local12 + 1][local19 + 1]);
					local165 = Static114.method1846(local1247.anInt1980, local1247.anInt1983, arg9[local12][local19 + 1]);
					Static296.method4533(local1270, local12, local135, arg10, local30 != 0 && local1247.aBoolean136, local155, arg6, local38, arg4, local145, local165, local19, local1258, local1264, arg2);
				}
				if ((arg7[local12][local19] & 0xFF) != 0 || local124 != 0 && arg5[local12][local19] == 0) {
					local129 = 0;
					@Pc(1383) int[] local1383 = new int[8];
					@Pc(1385) int local1385 = 0;
					local133 = 0;
					local135 = 0;
					local145 = 0;
					local155 = arg1[local12][local19 + 1] & 0xFF;
					local165 = arg1[local12 - 1][local19] & 0xFF;
					local199 = arg1[local12 - 1][local19 + 1] & 0xFF;
					local187 = arg1[local12 + 1][local19] & 0xFF;
					local223 = arg1[local12 - 1][local19 - 1] & 0xFF;
					local1023 = arg1[local12 + 1][local19 + 1] & 0xFF;
					local211 = arg1[local12 + 1][local19 - 1] & 0xFF;
					local175 = arg1[local12][local19 - 1] & 0xFF;
					@Pc(1525) byte local1525;
					@Pc(1498) Class62 local1498;
					@Pc(1567) int local1567;
					if (local199 == 0 || local124 == local199) {
						local199 = 0;
					} else {
						local1498 = Static148.method2407(local199 - 1);
						if (local1498.aBoolean136 && local1498.anInt1980 != -1) {
							local264 = arg3[local12 - 1][local19 + 1];
							local1525 = arg5[local12 - 1][local19 + 1];
							local299 = Static279.anIntArray508[local1525 * 4 + (local264 + 2 & 0x3)];
							local313 = Static279.anIntArray508[(local264 + 3 & 0x3) + local1525 * 4];
							if (Static90.aBooleanArrayArray1[local313][1] && Static90.aBooleanArrayArray1[local299][0]) {
								local199 = 0;
							} else {
								for (local1567 = 0; local1567 < 8; local1567++) {
									if (local1567 == 0) {
										local1385++;
										local1383[0] = local199;
										break;
									}
									if (local1383[local1567] == local199) {
										break;
									}
								}
							}
						} else {
							local199 = 0;
						}
					}
					if (local223 == 0 || local223 == local124) {
						local223 = 0;
					} else {
						local1498 = Static148.method2407(local223 - 1);
						if (local1498.aBoolean136 && local1498.anInt1980 != -1) {
							local264 = arg3[local12 - 1][local19 - 1];
							local1525 = arg5[local12 - 1][local19 - 1];
							local313 = Static279.anIntArray508[(local264 + 3 & 0x3) + local1525 * 4];
							local299 = Static279.anIntArray508[(local264 & 0x3) + local1525 * 4];
							if (Static90.aBooleanArrayArray1[local299][1] && Static90.aBooleanArrayArray1[local313][0]) {
								local223 = 0;
							} else {
								for (local1567 = 0; local1567 < 8; local1567++) {
									if (local1567 == local1385) {
										local1383[local1385++] = local223;
										break;
									}
									if (local223 == local1383[local1567]) {
										break;
									}
								}
							}
						} else {
							local223 = 0;
						}
					}
					if (local211 == 0 || local211 == local124) {
						local211 = 0;
					} else {
						local1498 = Static148.method2407(local211 - 1);
						if (local1498.aBoolean136 && local1498.anInt1980 != -1) {
							local264 = arg3[local12 + 1][local19 - 1];
							local1525 = arg5[local12 + 1][local19 - 1];
							local299 = Static279.anIntArray508[(local264 & 0x3) + local1525 * 4];
							local313 = Static279.anIntArray508[(local264 + 1 & 0x3) + local1525 * 4];
							if (Static90.aBooleanArrayArray1[local313][1] && Static90.aBooleanArrayArray1[local299][0]) {
								local211 = 0;
							} else {
								for (local1567 = 0; local1567 < 8; local1567++) {
									if (local1567 == local1385) {
										local1383[local1385++] = local211;
										break;
									}
									if (local1383[local1567] == local211) {
										break;
									}
								}
							}
						} else {
							local211 = 0;
						}
					}
					if (local1023 == 0 || local1023 == local124) {
						local1023 = 0;
					} else {
						local1498 = Static148.method2407(local1023 - 1);
						if (local1498.aBoolean136 && local1498.anInt1980 != -1) {
							local264 = arg3[local12 + 1][local19 + 1];
							local1525 = arg5[local12 + 1][local19 + 1];
							local299 = Static279.anIntArray508[(local264 + 2 & 0x3) + local1525 * 4];
							local313 = Static279.anIntArray508[(local264 + 1 & 0x3) + local1525 * 4];
							if (Static90.aBooleanArrayArray1[local299][1] && Static90.aBooleanArrayArray1[local313][0]) {
								local1023 = 0;
							} else {
								for (local1567 = 0; local1567 < 8; local1567++) {
									if (local1567 == local1385) {
										local1383[local1385++] = local1023;
										break;
									}
									if (local1023 == local1383[local1567]) {
										break;
									}
								}
							}
						} else {
							local1023 = 0;
						}
					}
					@Pc(2013) int local2013;
					if (local155 != 0 && local155 != local124) {
						local1498 = Static148.method2407(local155 - 1);
						if (local1498.aBoolean136 && local1498.anInt1980 != -1) {
							local129 = Static279.anIntArray508[(arg3[local12][local19 + 1] + 2 & 0x3) + arg5[local12][local19 + 1] * 4];
							for (local2013 = 0; local2013 < 8; local2013++) {
								if (local2013 == local1385) {
									local1383[local1385++] = local155;
									break;
								}
								if (local155 == local1383[local2013]) {
									break;
								}
							}
						}
					}
					if (local165 != 0 && local165 != local124) {
						local1498 = Static148.method2407(local165 - 1);
						if (local1498.aBoolean136 && local1498.anInt1980 != -1) {
							local133 = Static279.anIntArray508[arg5[local12 - 1][local19] * 4 + (arg3[local12 - 1][local19] + 3 & 0x3)];
							for (local2013 = 0; local2013 < 8; local2013++) {
								if (local2013 == local1385) {
									local1383[local1385++] = local165;
									break;
								}
								if (local165 == local1383[local2013]) {
									break;
								}
							}
						}
					}
					if (local175 != 0 && local124 != local175) {
						local1498 = Static148.method2407(local175 - 1);
						if (local1498.aBoolean136 && local1498.anInt1980 != -1) {
							local135 = Static279.anIntArray508[(arg3[local12][local19 - 1] & 0x3) + arg5[local12][local19 - 1] * 4];
							for (local2013 = 0; local2013 < 8; local2013++) {
								if (local1385 == local2013) {
									local1383[local1385++] = local175;
									break;
								}
								if (local1383[local2013] == local175) {
									break;
								}
							}
						}
					}
					if (local187 != 0 && local187 != local124) {
						local1498 = Static148.method2407(local187 - 1);
						if (local1498.aBoolean136 && local1498.anInt1980 != -1) {
							local145 = Static279.anIntArray508[arg5[local12 + 1][local19] * 4 + (arg3[local12 + 1][local19] + 1 & 0x3)];
							for (local2013 = 0; local2013 < 8; local2013++) {
								if (local2013 == local1385) {
									local1383[local1385++] = local187;
									break;
								}
								if (local1383[local2013] == local187) {
									break;
								}
							}
						}
					}
					for (local750 = 0; local750 < local1385; local750++) {
						local2013 = local1383[local750];
						local1060 = Static90.aBooleanArrayArray1[local2013 == local155 ? local129 : 0];
						local1069 = Static90.aBooleanArrayArray1[local2013 == local165 ? local133 : 0];
						@Pc(2310) boolean[] local2310 = Static90.aBooleanArrayArray1[local187 == local2013 ? local145 : 0];
						local1078 = Static90.aBooleanArrayArray1[local2013 == local175 ? local135 : 0];
						@Pc(2325) Class62 local2325 = Static148.method2407(local2013 - 1);
						@Pc(2330) Class1_Sub28 local2330 = Static41.method826(local2325, local10);
						@Pc(2346) int local2346 = Static114.method1846(local2325.anInt1980, local2325.anInt1983, arg9[local12][local19]) << 8 | 0xFF;
						@Pc(2368) int local2368 = Static114.method1846(local2325.anInt1980, local2325.anInt1983, arg9[local12 + 1][local19]) << 8 | 0xFF;
						@Pc(2388) int local2388 = Static114.method1846(local2325.anInt1980, local2325.anInt1983, arg9[local12 + 1][local19 + 1]) << 8 | 0xFF;
						@Pc(2406) int local2406 = Static114.method1846(local2325.anInt1980, local2325.anInt1983, arg9[local12][local19 + 1]) << 8 | 0xFF;
						@Pc(2421) boolean local2421 = local1023 != local2013 && local1060[0] && local2310[1];
						@Pc(2428) int local2428 = local1060.length + 6 - 2;
						@Pc(2447) boolean local2447 = local2013 != local199 && local1069[0] && local1060[1];
						@Pc(2454) int local2454 = local2428 + local1069.length - 2;
						@Pc(2461) int local2461 = local2454 + local1078.length - 2;
						@Pc(2468) int local2468 = local2461 + local2310.length - 2;
						@Pc(2483) boolean local2483 = local211 != local2013 && local2310[0] && local1078[1];
						@Pc(2486) int[] local2486 = new int[local2468];
						@Pc(2488) byte local2488 = 0;
						@Pc(2507) boolean local2507 = local2013 != local223 && local1078[0] && local1069[1];
						@Pc(2528) int local2528 = Static292.method4469(arg10, local2330, local2368, arg2, local2388, arg4, 64, local19, local2406, 0, 0.0F, true, null, 64, local2346, local12, arg6);
						@Pc(2549) int local2549 = Static292.method4469(arg10, local2330, local2368, arg2, local2388, arg4, 0, local19, local2406, 0, 0.0F, local2447, null, 128, local2346, local12, arg6);
						@Pc(2570) int local2570 = Static292.method4469(arg10, local2330, local2368, arg2, local2388, arg4, 128, local19, local2406, 0, 0.0F, local2421, null, 128, local2346, local12, arg6);
						@Pc(2591) int local2591 = Static292.method4469(arg10, local2330, local2368, arg2, local2388, arg4, 0, local19, local2406, 0, 0.0F, local2507, null, 0, local2346, local12, arg6);
						@Pc(2612) int local2612 = Static292.method4469(arg10, local2330, local2368, arg2, local2388, arg4, 128, local19, local2406, 0, 0.0F, local2483, null, 0, local2346, local12, arg6);
						@Pc(2615) int local2615 = local2488 + 1;
						local2486[0] = local2528;
						@Pc(2620) int local2620 = local2615 + 1;
						local2486[1] = local2570;
						if (local1060.length > 2) {
							local2620++;
							local2486[2] = Static292.method4469(arg10, local2330, local2368, arg2, local2388, arg4, 64, local19, local2406, 0, 0.0F, local1060[2], null, 128, local2346, local12, arg6);
						}
						local2486[local2620++] = local2549;
						if (local1069.length > 2) {
							local2486[local2620++] = Static292.method4469(arg10, local2330, local2368, arg2, local2388, arg4, 0, local19, local2406, 0, 0.0F, local1069[2], null, 64, local2346, local12, arg6);
						}
						local2486[local2620++] = local2591;
						if (local1078.length > 2) {
							local2486[local2620++] = Static292.method4469(arg10, local2330, local2368, arg2, local2388, arg4, 64, local19, local2406, 0, 0.0F, local1078[2], null, 0, local2346, local12, arg6);
						}
						local2486[local2620++] = local2612;
						if (local2310.length > 2) {
							local2486[local2620++] = Static292.method4469(arg10, local2330, local2368, arg2, local2388, arg4, 128, local19, local2406, 0, 0.0F, local2310[2], null, 64, local2346, local12, arg6);
						}
						local2486[local2620++] = local2570;
						local2330.method4174(local38, local12, local19, local2486, null, true);
					}
				}
			}
		}
		for (local1151 = (Class1_Sub28) local10.method4567(); local1151 != null; local1151 = (Class1_Sub28) local10.method4579()) {
			if (local1151.anInt5505 == 0) {
				local1151.method4767();
			} else {
				local1151.method4169();
			}
		}
		local12 = local10.method4576();
		@Pc(2826) long[] local2826 = new long[local12];
		@Pc(2829) Class1_Sub28[] local2829 = new Class1_Sub28[local12];
		local10.method4571(local2829);
		for (local30 = 0; local30 < local12; local30++) {
			local2826[local30] = local2829[local30].aLong247;
		}
		Static149.method2418(local2829, local2826);
		return local2829;
	}
}
