import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_20;

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
	public static int anInt2357;

	@OriginalMember(owner = "client!ae", name = "V", descriptor = "J")
	public static long aLong82;

	@OriginalMember(owner = "client!ae", name = "Z", descriptor = "Lclient!me;")
	public static Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_6;

	@OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
	public static int anInt2363;

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "Lclient!le;")
	public static Class36 aClass36_29 = new Class36(64);

	@OriginalMember(owner = "client!ae", name = "Q", descriptor = "Lclient!rc;")
	public static Class55 aClass55_982 = Static34.method846(":tradereq:");

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	public static int anInt2356 = -1;

	@OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
	public static int anInt2360 = 0;

	@OriginalMember(owner = "client!ae", name = "Y", descriptor = "Lclient!rc;")
	public static Class55 aClass55_983 = Static34.method846("sideicons");

	@OriginalMember(owner = "client!ae", name = "ab", descriptor = "Lclient!rc;")
	public static Class55 aClass55_984 = Static34.method846("Welt");

	@OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
	public static int anInt2362 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Lclient!tb;")
	public static Class6_Sub2_Sub13 method1608(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub2_Sub13 local10 = (Class6_Sub2_Sub13) Static23.aClass36_12.method1154((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static46.aClass40_39.method1243(arg0, 12);
		local10 = new Class6_Sub2_Sub13();
		if (local25 != null) {
			local10.method1860(new Class6_Sub1(local25));
		}
		local10.method1858();
		Static23.aClass36_12.method1161((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)I")
	public static int method1610(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static96.anIntArray263[arg0];
		@Pc(11) int local11 = (local3 * Static56.anInt1711 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
	public static void method1612() {
		@Pc(13) int local13;
		if (Static104.anInt3066 > 0) {
			for (local13 = 0; local13 < 256; local13++) {
				if (Static104.anInt3066 > 768) {
					Static92.anIntArray245[local13] = Static56.method1175(Static57.anIntArray165[local13], 1024 - Static104.anInt3066, Static59.anIntArray179[local13]);
				} else if (Static104.anInt3066 <= 256) {
					Static92.anIntArray245[local13] = Static56.method1175(Static59.anIntArray179[local13], 256 - Static104.anInt3066, Static57.anIntArray165[local13]);
				} else {
					Static92.anIntArray245[local13] = Static57.anIntArray165[local13];
				}
			}
		} else if (Static111.anInt3169 <= 0) {
			for (local13 = 0; local13 < 256; local13++) {
				Static92.anIntArray245[local13] = Static59.anIntArray179[local13];
			}
		} else {
			for (local13 = 0; local13 < 256; local13++) {
				if (Static111.anInt3169 > 768) {
					Static92.anIntArray245[local13] = Static56.method1175(Static54.anIntArray162[local13], 1024 - Static111.anInt3169, Static59.anIntArray179[local13]);
				} else if (Static111.anInt3169 > 256) {
					Static92.anIntArray245[local13] = Static54.anIntArray162[local13];
				} else {
					Static92.anIntArray245[local13] = Static56.method1175(Static59.anIntArray179[local13], 256 - Static111.anInt3169, Static54.anIntArray162[local13]);
				}
			}
		}
		for (local13 = 0; local13 < 33920; local13++) {
			Static35.aClass21_10.anIntArray212[local13] = Static74.aClass6_Sub2_Sub2_Sub2_11.anIntArray62[local13];
		}
		@Pc(159) int local159 = 0;
		@Pc(161) int local161 = 1152;
		@Pc(176) int local176;
		@Pc(180) int local180;
		@Pc(200) int local200;
		@Pc(208) int local208;
		@Pc(206) int local206;
		@Pc(213) int local213;
		for (@Pc(163) int local163 = 1; local163 < 255; local163++) {
			local176 = (256 - local163) * Static78.anIntArray217[local163] / 256;
			local180 = local176 + 22;
			if (local180 < 0) {
				local180 = 0;
			}
			local159 += local180;
			for (@Pc(193) int local193 = local180; local193 < 128; local193++) {
				local200 = Static32.anIntArray79[local159++];
				if (local200 == 0) {
					local161++;
				} else {
					local206 = 256 - local200;
					local208 = local200;
					local213 = Static35.aClass21_10.anIntArray212[local161];
					local200 = Static92.anIntArray245[local200];
					Static35.aClass21_10.anIntArray212[local161++] = ((local213 & 0xFF00) * local206 + local208 * (local200 & 0xFF00) & 0xFF0000) + (local206 * (local213 & 0xFF00FF) + (local200 & 0xFF00FF) * local208 & 0xFF00FF00) >> 8;
				}
			}
			local161 += local180;
		}
		local161 = 1176;
		for (local176 = 0; local176 < 33920; local176++) {
			Static111.aClass21_27.anIntArray212[local176] = Static27.aClass6_Sub2_Sub2_Sub2_6.anIntArray62[local176];
		}
		local159 = 0;
		for (local180 = 1; local180 < 255; local180++) {
			local200 = Static78.anIntArray217[local180] * (256 - local180) / 256;
			local161 += local200;
			local208 = 103 - local200;
			for (local206 = 0; local206 < local208; local206++) {
				local213 = Static32.anIntArray79[local159++];
				if (local213 == 0) {
					local161++;
				} else {
					@Pc(335) int local335 = local213;
					@Pc(339) int local339 = 256 - local213;
					local213 = Static92.anIntArray245[local213];
					@Pc(348) int local348 = Static111.aClass21_27.anIntArray212[local161];
					Static111.aClass21_27.anIntArray212[local161++] = (local339 * (local348 & 0xFF00FF) + (local213 & 0xFF00FF) * local335 & 0xFF00FF00) + ((local348 & 0xFF00) * local339 + local335 * (local213 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local161 += 128 - local200 - local208;
			local159 += 128 - local208;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
	public static void method1613() {
		aClass6_Sub2_Sub2_Sub4_6 = null;
		aClass55_983 = null;
		aClass55_982 = null;
		aClass36_29 = null;
		aClass6_Sub2_Sub2_Sub1_20 = null;
		aClass55_984 = null;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)I")
	public static int method1615() {
		return Static9.anInt416++;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILclient!kb;IIILclient!sb;II)V")
	public static void method1618(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class57 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static90.aBoolean119 && (Static43.aByteArrayArrayArray8[0][arg2][arg6] & 0x2) == 0) {
			if ((Static43.aByteArrayArrayArray8[arg7][arg2][arg6] & 0x10) != 0) {
				return;
			}
			if (Static91.method1730(arg6, arg2, arg7) != Static28.anInt1138) {
				return;
			}
		}
		if (arg7 < Static110.anInt3162) {
			Static110.anInt3162 = arg7;
		}
		@Pc(62) int local62 = Static6.anIntArrayArrayArray1[arg7][arg2 + 1][arg6];
		@Pc(74) int local74 = Static6.anIntArrayArrayArray1[arg7][arg2 + 1][arg6 + 1];
		@Pc(87) int local87 = Static6.anIntArrayArrayArray1[arg7][arg2][arg6];
		@Pc(99) int local99 = arg2 + (arg6 << 7) + (arg3 << 14) + 1073741824;
		@Pc(109) int local109 = Static6.anIntArrayArrayArray1[arg7][arg2][arg6 + 1];
		@Pc(113) Class6_Sub2_Sub15 local113 = Static8.method333(arg3);
		@Pc(125) int local125 = local74 + local87 + local62 + local109 >> 2;
		@Pc(131) int local131 = (arg4 << 6) + arg0;
		if (local113.anInt3004 == 0) {
			local99 += Integer.MIN_VALUE;
		}
		if (local113.anInt2982 == 1) {
			local131 += 256;
		}
		if (local113.method1946()) {
			Static49.method1084(arg6, local113, arg4, arg2, arg7);
		}
		@Pc(193) Class6_Sub2_Sub3 local193;
		if (arg0 != 22) {
			@Pc(285) int local285;
			if (arg0 == 10 || arg0 == 11) {
				if (local113.anInt3011 == -1 && local113.anIntArray278 == null) {
					local193 = local113.method1942(local74, local109, local62, local87, arg4, 10);
				} else {
					local193 = new Class6_Sub2_Sub3_Sub4(arg3, 10, arg4, local87, local62, local74, local109, local113.anInt3011, true, null);
				}
				if (local193 != null) {
					@Pc(288) int local288;
					if (arg4 == 1 || arg4 == 3) {
						local285 = local113.anInt2984;
						local288 = local113.anInt2981;
					} else {
						local288 = local113.anInt2984;
						local285 = local113.anInt2981;
					}
					@Pc(298) int local298 = 0;
					if (arg0 == 11) {
						local298 += 256;
					}
					if (arg1.method1051(arg7, arg2, arg6, local125, local285, local288, local193, local298, local99, local131) && local113.aBoolean147) {
						@Pc(331) Class6_Sub2_Sub3_Sub3 local331;
						if (local193 instanceof Class6_Sub2_Sub3_Sub3) {
							local331 = (Class6_Sub2_Sub3_Sub3) local193;
						} else {
							local331 = local113.method1942(local74, local109, local62, local87, arg4, 10);
						}
						if (local331 != null) {
							for (@Pc(340) int local340 = 0; local340 <= local285; local340++) {
								for (@Pc(344) int local344 = 0; local344 <= local288; local344++) {
									@Pc(351) int local351 = local331.method972() / 4;
									if (local351 > 30) {
										local351 = 30;
									}
									if (Static106.aByteArrayArrayArray14[arg7][arg2 + local340][local344 + arg6] < local351) {
										Static106.aByteArrayArrayArray14[arg7][local340 + arg2][arg6 + local344] = (byte) local351;
									}
								}
							}
						}
					}
				}
				if (local113.aBoolean150 && arg5 != null) {
					arg5.method1732(arg2, local113.anInt2984, local113.anInt2981, arg4, local113.aBoolean151, arg6);
				}
			} else if (arg0 >= 12) {
				if (local113.anInt3011 == -1 && local113.anIntArray278 == null) {
					local193 = local113.method1942(local74, local109, local62, local87, arg4, arg0);
				} else {
					local193 = new Class6_Sub2_Sub3_Sub4(arg3, arg0, arg4, local87, local62, local74, local109, local113.anInt3011, true, null);
				}
				arg1.method1051(arg7, arg2, arg6, local125, 1, 1, local193, 0, local99, local131);
				if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg7 > 0) {
					Static14.anIntArrayArrayArray2[arg7][arg2][arg6] |= 0x924;
				}
				if (local113.aBoolean150 && arg5 != null) {
					arg5.method1732(arg2, local113.anInt2984, local113.anInt2981, arg4, local113.aBoolean151, arg6);
				}
			} else if (arg0 == 0) {
				if (local113.anInt3011 == -1 && local113.anIntArray278 == null) {
					local193 = local113.method1942(local74, local109, local62, local87, arg4, 0);
				} else {
					local193 = new Class6_Sub2_Sub3_Sub4(arg3, 0, arg4, local87, local62, local74, local109, local113.anInt3011, true, null);
				}
				arg1.method1070(arg7, arg2, arg6, local125, local193, null, Static79.anIntArray221[arg4], 0, local99, local131);
				if (arg4 == 0) {
					if (local113.aBoolean147) {
						Static106.aByteArrayArrayArray14[arg7][arg2][arg6] = 50;
						Static106.aByteArrayArrayArray14[arg7][arg2][arg6 + 1] = 50;
					}
					if (local113.aBoolean148) {
						Static14.anIntArrayArrayArray2[arg7][arg2][arg6] |= 0x249;
					}
				} else if (arg4 == 1) {
					if (local113.aBoolean147) {
						Static106.aByteArrayArrayArray14[arg7][arg2][arg6 + 1] = 50;
						Static106.aByteArrayArrayArray14[arg7][arg2 + 1][arg6 + 1] = 50;
					}
					if (local113.aBoolean148) {
						Static14.anIntArrayArrayArray2[arg7][arg2][arg6 + 1] |= 0x492;
					}
				} else if (arg4 == 2) {
					if (local113.aBoolean147) {
						Static106.aByteArrayArrayArray14[arg7][arg2 + 1][arg6] = 50;
						Static106.aByteArrayArrayArray14[arg7][arg2 + 1][arg6 + 1] = 50;
					}
					if (local113.aBoolean148) {
						Static14.anIntArrayArrayArray2[arg7][arg2 + 1][arg6] |= 0x249;
					}
				} else if (arg4 == 3) {
					if (local113.aBoolean147) {
						Static106.aByteArrayArrayArray14[arg7][arg2][arg6] = 50;
						Static106.aByteArrayArrayArray14[arg7][arg2 + 1][arg6] = 50;
					}
					if (local113.aBoolean148) {
						Static14.anIntArrayArrayArray2[arg7][arg2][arg6] |= 0x492;
					}
				}
				if (local113.aBoolean150 && arg5 != null) {
					arg5.method1739(local113.aBoolean151, arg0, arg2, arg4, arg6);
				}
				if (local113.anInt2991 != 16) {
					arg1.method1030(arg7, arg2, arg6, local113.anInt2991);
				}
			} else if (arg0 == 1) {
				if (local113.anInt3011 == -1 && local113.anIntArray278 == null) {
					local193 = local113.method1942(local74, local109, local62, local87, arg4, 1);
				} else {
					local193 = new Class6_Sub2_Sub3_Sub4(arg3, 1, arg4, local87, local62, local74, local109, local113.anInt3011, true, null);
				}
				arg1.method1070(arg7, arg2, arg6, local125, local193, null, Static81.anIntArray231[arg4], 0, local99, local131);
				if (local113.aBoolean147) {
					if (arg4 == 0) {
						Static106.aByteArrayArrayArray14[arg7][arg2][arg6 + 1] = 50;
					} else if (arg4 == 1) {
						Static106.aByteArrayArrayArray14[arg7][arg2 + 1][arg6 + 1] = 50;
					} else if (arg4 == 2) {
						Static106.aByteArrayArrayArray14[arg7][arg2 + 1][arg6] = 50;
					} else if (arg4 == 3) {
						Static106.aByteArrayArrayArray14[arg7][arg2][arg6] = 50;
					}
				}
				if (local113.aBoolean150 && arg5 != null) {
					arg5.method1739(local113.aBoolean151, arg0, arg2, arg4, arg6);
				}
			} else {
				@Pc(928) int local928;
				@Pc(959) Class6_Sub2_Sub3 local959;
				if (arg0 == 2) {
					local928 = arg4 + 1 & 0x3;
					@Pc(949) Class6_Sub2_Sub3 local949;
					if (local113.anInt3011 == -1 && local113.anIntArray278 == null) {
						local949 = local113.method1942(local74, local109, local62, local87, arg4 + 4, 2);
						local959 = local113.method1942(local74, local109, local62, local87, local928, 2);
					} else {
						local949 = new Class6_Sub2_Sub3_Sub4(arg3, 2, arg4 + 4, local87, local62, local74, local109, local113.anInt3011, true, null);
						local959 = new Class6_Sub2_Sub3_Sub4(arg3, 2, local928, local87, local62, local74, local109, local113.anInt3011, true, null);
					}
					arg1.method1070(arg7, arg2, arg6, local125, local949, local959, Static79.anIntArray221[arg4], Static79.anIntArray221[local928], local99, local131);
					if (local113.aBoolean148) {
						if (arg4 == 0) {
							Static14.anIntArrayArrayArray2[arg7][arg2][arg6] |= 0x249;
							Static14.anIntArrayArrayArray2[arg7][arg2][arg6 + 1] |= 0x492;
						} else if (arg4 == 1) {
							Static14.anIntArrayArrayArray2[arg7][arg2][arg6 + 1] |= 0x492;
							Static14.anIntArrayArrayArray2[arg7][arg2 + 1][arg6] |= 0x249;
						} else if (arg4 == 2) {
							Static14.anIntArrayArrayArray2[arg7][arg2 + 1][arg6] |= 0x249;
							Static14.anIntArrayArrayArray2[arg7][arg2][arg6] |= 0x492;
						} else if (arg4 == 3) {
							Static14.anIntArrayArrayArray2[arg7][arg2][arg6] |= 0x492;
							Static14.anIntArrayArrayArray2[arg7][arg2][arg6] |= 0x249;
						}
					}
					if (local113.aBoolean150 && arg5 != null) {
						arg5.method1739(local113.aBoolean151, arg0, arg2, arg4, arg6);
					}
					if (local113.anInt2991 != 16) {
						arg1.method1030(arg7, arg2, arg6, local113.anInt2991);
					}
				} else if (arg0 == 3) {
					if (local113.anInt3011 == -1 && local113.anIntArray278 == null) {
						local193 = local113.method1942(local74, local109, local62, local87, arg4, 3);
					} else {
						local193 = new Class6_Sub2_Sub3_Sub4(arg3, 3, arg4, local87, local62, local74, local109, local113.anInt3011, true, null);
					}
					arg1.method1070(arg7, arg2, arg6, local125, local193, null, Static81.anIntArray231[arg4], 0, local99, local131);
					if (local113.aBoolean147) {
						if (arg4 == 0) {
							Static106.aByteArrayArrayArray14[arg7][arg2][arg6 + 1] = 50;
						} else if (arg4 == 1) {
							Static106.aByteArrayArrayArray14[arg7][arg2 + 1][arg6 + 1] = 50;
						} else if (arg4 == 2) {
							Static106.aByteArrayArrayArray14[arg7][arg2 + 1][arg6] = 50;
						} else if (arg4 == 3) {
							Static106.aByteArrayArrayArray14[arg7][arg2][arg6] = 50;
						}
					}
					if (local113.aBoolean150 && arg5 != null) {
						arg5.method1739(local113.aBoolean151, arg0, arg2, arg4, arg6);
					}
				} else if (arg0 == 9) {
					if (local113.anInt3011 == -1 && local113.anIntArray278 == null) {
						local193 = local113.method1942(local74, local109, local62, local87, arg4, arg0);
					} else {
						local193 = new Class6_Sub2_Sub3_Sub4(arg3, arg0, arg4, local87, local62, local74, local109, local113.anInt3011, true, null);
					}
					arg1.method1051(arg7, arg2, arg6, local125, 1, 1, local193, 0, local99, local131);
					if (local113.aBoolean150 && arg5 != null) {
						arg5.method1732(arg2, local113.anInt2984, local113.anInt2981, arg4, local113.aBoolean151, arg6);
					}
				} else {
					if (local113.aBoolean152) {
						if (arg4 == 1) {
							local928 = local109;
							local109 = local74;
							local74 = local62;
							local62 = local87;
							local87 = local928;
						} else if (arg4 == 2) {
							local928 = local109;
							local109 = local62;
							local62 = local928;
							local928 = local74;
							local74 = local87;
							local87 = local928;
						} else if (arg4 == 3) {
							local928 = local109;
							local109 = local87;
							local87 = local62;
							local62 = local74;
							local74 = local928;
						}
					}
					if (arg0 == 4) {
						if (local113.anInt3011 == -1 && local113.anIntArray278 == null) {
							local193 = local113.method1942(local74, local109, local62, local87, 0, 4);
						} else {
							local193 = new Class6_Sub2_Sub3_Sub4(arg3, 4, 0, local87, local62, local74, local109, local113.anInt3011, true, null);
						}
						arg1.method1032(arg7, arg2, arg6, local125, local193, Static79.anIntArray221[arg4], arg4 * 512, 0, 0, local99, local131);
					} else if (arg0 == 5) {
						local285 = arg1.method1027(arg7, arg2, arg6);
						local928 = 16;
						if (local285 > 0) {
							local928 = Static8.method333(local285 >> 14 & 0x7FFF).anInt2991;
						}
						if (local113.anInt3011 == -1 && local113.anIntArray278 == null) {
							local959 = local113.method1942(local74, local109, local62, local87, 0, 4);
						} else {
							local959 = new Class6_Sub2_Sub3_Sub4(arg3, 4, 0, local87, local62, local74, local109, local113.anInt3011, true, null);
						}
						arg1.method1032(arg7, arg2, arg6, local125, local959, Static79.anIntArray221[arg4], arg4 * 512, Static102.anIntArray287[arg4] * local928, local928 * Static108.anIntArray293[arg4], local99, local131);
					} else if (arg0 == 6) {
						if (local113.anInt3011 == -1 && local113.anIntArray278 == null) {
							local193 = local113.method1942(local74, local109, local62, local87, 0, 4);
						} else {
							local193 = new Class6_Sub2_Sub3_Sub4(arg3, 4, 0, local87, local62, local74, local109, local113.anInt3011, true, null);
						}
						arg1.method1032(arg7, arg2, arg6, local125, local193, 256, arg4, 0, 0, local99, local131);
					} else if (arg0 == 7) {
						if (local113.anInt3011 == -1 && local113.anIntArray278 == null) {
							local193 = local113.method1942(local74, local109, local62, local87, 0, 4);
						} else {
							local193 = new Class6_Sub2_Sub3_Sub4(arg3, 4, 0, local87, local62, local74, local109, local113.anInt3011, true, null);
						}
						arg1.method1032(arg7, arg2, arg6, local125, local193, 512, arg4, 0, 0, local99, local131);
					} else if (arg0 == 8) {
						if (local113.anInt3011 == -1 && local113.anIntArray278 == null) {
							local193 = local113.method1942(local74, local109, local62, local87, 0, 4);
						} else {
							local193 = new Class6_Sub2_Sub3_Sub4(arg3, 4, 0, local87, local62, local74, local109, local113.anInt3011, true, null);
						}
						arg1.method1032(arg7, arg2, arg6, local125, local193, 768, arg4, 0, 0, local99, local131);
					}
				}
			}
		} else if (!Static90.aBoolean119 || local113.anInt3004 != 0 || local113.aBoolean153) {
			if (local113.anInt3011 == -1 && local113.anIntArray278 == null) {
				local193 = local113.method1942(local74, local109, local62, local87, arg4, 22);
			} else {
				local193 = new Class6_Sub2_Sub3_Sub4(arg3, 22, arg4, local87, local62, local74, local109, local113.anInt3011, true, null);
			}
			arg1.method1046(arg7, arg2, arg6, local125, local193, local99, local131);
			if (local113.aBoolean150 && local113.anInt3004 == 1 && arg5 != null) {
				arg5.method1733(arg2, arg6);
			}
		}
	}
}
