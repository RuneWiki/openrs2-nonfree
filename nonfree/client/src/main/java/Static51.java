import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!jd", name = "V", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_18;

	@OriginalMember(owner = "client!jd", name = "X", descriptor = "Lclient!pa;")
	public static Class51 aClass51_50;

	@OriginalMember(owner = "client!jd", name = "ab", descriptor = "[B")
	public static byte[] aByteArray22;

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1125 = Static2.method66("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!jd", name = "I", descriptor = "Lclient!mb;")
	public static Class2_Sub5_Sub1 aClass2_Sub5_Sub1_4 = new Class2_Sub5_Sub1(5000);

	@OriginalMember(owner = "client!jd", name = "T", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1126 = Static2.method66("@lre@");

	@OriginalMember(owner = "client!jd", name = "W", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!jd", name = "bb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1128 = Static2.method66("wishes to duel with you)3");

	@OriginalMember(owner = "client!jd", name = "Y", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1127 = aClass39_1128;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(JI)V")
	private static void method1757(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V")
	public static void method1764(@OriginalArg(0) int arg0) {
		@Pc(6) int[] local6 = Static42.aClass2_Sub1_Sub4_Sub2_4.anIntArray209;
		@Pc(9) int local9 = local6.length;
		for (@Pc(11) int local11 = 0; local11 < local9; local11++) {
			local6[local11] = 0;
		}
		@Pc(34) int local34;
		@Pc(36) int local36;
		for (@Pc(22) int local22 = 1; local22 < 103; local22++) {
			local34 = (52736 - local22 * 512) * 4 + 24628;
			for (local36 = 1; local36 < 103; local36++) {
				if ((Static96.aByteArrayArrayArray8[arg0][local36][local22] & 0x18) == 0) {
					Static77.aClass43_1.method1188(local6, local34, arg0, local36, local22);
				}
				if (arg0 < 3 && (Static96.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
					Static77.aClass43_1.method1188(local6, local34, arg0 + 1, local36, local22);
				}
				local34 += 4;
			}
		}
		local36 = (int) (Math.random() * 20.0D) + 228 << 16;
		local34 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10;
		Static42.aClass2_Sub1_Sub4_Sub2_4.method1041();
		@Pc(146) int local146;
		for (@Pc(143) int local143 = 1; local143 < 103; local143++) {
			for (local146 = 1; local146 < 103; local146++) {
				if ((Static96.aByteArrayArrayArray8[arg0][local146][local143] & 0x18) == 0) {
					Static15.method2042(arg0, local146, local143, local36, local34);
				}
				if (arg0 < 3 && (Static96.aByteArrayArrayArray8[arg0 + 1][local146][local143] & 0x8) != 0) {
					Static15.method2042(arg0 + 1, local146, local143, local36, local34);
				}
			}
		}
		Static40.anInt1184 = 0;
		for (local146 = 0; local146 < 104; local146++) {
			for (@Pc(211) int local211 = 0; local211 < 104; local211++) {
				@Pc(218) int local218 = Static77.aClass43_1.method1166(Static18.anInt560, local146, local211);
				if (local218 != 0) {
					local218 = local218 >> 14 & 0x7FFF;
					@Pc(234) int local234 = Static48.method916(local218).anInt535;
					if (local234 >= 0) {
						@Pc(241) int local241 = local146;
						@Pc(243) int local243 = local211;
						if (local234 != 22 && local234 != 29 && local234 != 34 && local234 != 36 && local234 != 46 && local234 != 47 && local234 != 48) {
							@Pc(279) int[][] local279 = Static5.aClass47Array1[Static18.anInt560].anIntArrayArray20;
							for (@Pc(281) int local281 = 0; local281 < 10; local281++) {
								@Pc(287) int local287 = (int) (Math.random() * 4.0D);
								if (local287 == 0 && local241 > 0 && local241 > local146 - 3 && (local279[local241 - 1][local243] & 0x1280108) == 0) {
									local241--;
								}
								if (local287 == 1 && local241 < 103 && local146 + 3 > local241 && (local279[local241 + 1][local243] & 0x1280180) == 0) {
									local241++;
								}
								if (local287 == 2 && local243 > 0 && local211 - 3 < local243 && (local279[local241][local243 - 1] & 0x1280102) == 0) {
									local243--;
								}
								if (local287 == 3 && local243 < 103 && local243 < local211 + 3 && (local279[local241][local243 + 1] & 0x1280120) == 0) {
									local243++;
								}
							}
						}
						Static41.aClass2_Sub1_Sub4_Sub2Array6[Static40.anInt1184] = Static75.aClass2_Sub1_Sub4_Sub2Array3[local234];
						Static16.anIntArray54[Static40.anInt1184] = local241;
						Static55.anIntArray213[Static40.anInt1184] = local243;
						Static40.anInt1184++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z")
	public static boolean method1771(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0 && Static40.anInt1179 == arg0) {
			return true;
		} else if (arg1 == 1 && Static7.anInt165 == arg0) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && arg0 == Static7.anInt141;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method1777() {
		aByteArray22 = null;
		aClass2_Sub5_Sub1_4 = null;
		aClass2_Sub1_Sub4_Sub3_18 = null;
		aClass39_1126 = null;
		aClass39_1127 = null;
		aByteArrayArray10 = null;
		aClass39_1128 = null;
		aClass51_50 = null;
		aClass39_1125 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZI)I")
	public static int method1779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 >> 7;
		@Pc(7) int local7 = arg0 >> 7;
		if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(32) int local32 = arg2;
		if (arg2 < 3 && (Static96.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
			local32 = arg2 + 1;
		}
		@Pc(53) int local53 = arg1 & 0x7F;
		@Pc(57) int local57 = arg0 & 0x7F;
		@Pc(88) int local88 = local53 * Static22.anIntArrayArrayArray3[local32][local3 + 1][local7 + 1] + Static22.anIntArrayArrayArray3[local32][local3][local7 + 1] * (128 - local53) >> 7;
		@Pc(115) int local115 = Static22.anIntArrayArrayArray3[local32][local3 + 1][local7] * local53 + Static22.anIntArrayArrayArray3[local32][local3][local7] * (128 - local53) >> 7;
		return local57 * local88 + local115 * (128 - local57) >> 7;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIILclient!le;IIILclient!ne;)V")
	public static void method1780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class43 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class47 arg7) {
		if (Static35.aBoolean136 && (Static96.aByteArrayArrayArray8[0][arg3][arg0] & 0x2) == 0) {
			if ((Static96.aByteArrayArrayArray8[arg1][arg3][arg0] & 0x10) != 0) {
				return;
			}
			if (Static2.method63(arg1, arg0, arg3) != Static28.anInt815) {
				return;
			}
		}
		if (Static83.anInt2274 > arg1) {
			Static83.anInt2274 = arg1;
		}
		@Pc(64) int local64 = Static22.anIntArrayArrayArray3[arg1][arg3][arg0];
		@Pc(76) int local76 = Static22.anIntArrayArrayArray3[arg1][arg3 + 1][arg0 + 1];
		@Pc(86) int local86 = Static22.anIntArrayArrayArray3[arg1][arg3 + 1][arg0];
		@Pc(96) int local96 = Static22.anIntArrayArrayArray3[arg1][arg3][arg0 + 1];
		@Pc(106) int local106 = local96 + local64 + local86 + local76 >> 2;
		@Pc(119) int local119 = (arg6 << 14) + arg3 + (arg0 << 7) + 1073741824;
		@Pc(123) Class2_Sub1_Sub5 local123 = Static48.method916(arg6);
		if (local123.anInt551 == 0) {
			local119 += Integer.MIN_VALUE;
		}
		@Pc(140) int local140 = (arg5 << 6) + arg2;
		if (local123.anInt529 == 1) {
			local140 += 256;
		}
		if (local123.method416()) {
			Static97.method1858(arg3, local123, arg5, arg1, arg0);
		}
		@Pc(196) Class2_Sub1_Sub2 local196;
		if (arg2 != 22) {
			@Pc(287) int local287;
			if (arg2 == 10 || arg2 == 11) {
				if (local123.anInt544 == -1 && local123.anIntArray61 == null) {
					local196 = local123.method415(arg5, local96, local86, 10, local64, local76);
				} else {
					local196 = new Class2_Sub1_Sub2_Sub6(arg6, 10, arg5, local64, local86, local76, local96, local123.anInt544, true);
				}
				if (local196 != null) {
					@Pc(278) int local278 = 0;
					@Pc(290) int local290;
					if (arg5 == 1 || arg5 == 3) {
						local287 = local123.anInt537;
						local290 = local123.anInt528;
					} else {
						local287 = local123.anInt528;
						local290 = local123.anInt537;
					}
					if (arg2 == 11) {
						local278 += 256;
					}
					if (arg4.method1201(arg1, arg3, arg0, local106, local287, local290, local196, local278, local119, local140) && local123.aBoolean33) {
						@Pc(324) Class2_Sub1_Sub2_Sub2 local324;
						if (local196 instanceof Class2_Sub1_Sub2_Sub2) {
							local324 = (Class2_Sub1_Sub2_Sub2) local196;
						} else {
							local324 = local123.method415(arg5, local96, local86, 10, local64, local76);
						}
						if (local324 != null) {
							for (@Pc(340) int local340 = 0; local340 <= local287; local340++) {
								for (@Pc(344) int local344 = 0; local344 <= local290; local344++) {
									@Pc(351) int local351 = local324.method703() / 4;
									if (local351 > 30) {
										local351 = 30;
									}
									if (Static64.aByteArrayArrayArray3[arg1][local340 + arg3][arg0 + local344] < local351) {
										Static64.aByteArrayArrayArray3[arg1][arg3 + local340][arg0 + local344] = (byte) local351;
									}
								}
							}
						}
					}
				}
				if (local123.aBoolean30 && arg7 != null) {
					arg7.method1466(local123.anInt537, arg5, arg0, local123.anInt528, local123.aBoolean31, arg3);
				}
			} else if (arg2 >= 12) {
				if (local123.anInt544 == -1 && local123.anIntArray61 == null) {
					local196 = local123.method415(arg5, local96, local86, arg2, local64, local76);
				} else {
					local196 = new Class2_Sub1_Sub2_Sub6(arg6, arg2, arg5, local64, local86, local76, local96, local123.anInt544, true);
				}
				arg4.method1201(arg1, arg3, arg0, local106, 1, 1, local196, 0, local119, local140);
				if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg1 > 0) {
					Static62.anIntArrayArrayArray7[arg1][arg3][arg0] |= 0x924;
				}
				if (local123.aBoolean30 && arg7 != null) {
					arg7.method1466(local123.anInt537, arg5, arg0, local123.anInt528, local123.aBoolean31, arg3);
				}
			} else if (arg2 == 0) {
				if (local123.anInt544 == -1 && local123.anIntArray61 == null) {
					local196 = local123.method415(arg5, local96, local86, 0, local64, local76);
				} else {
					local196 = new Class2_Sub1_Sub2_Sub6(arg6, 0, arg5, local64, local86, local76, local96, local123.anInt544, true);
				}
				arg4.method1206(arg1, arg3, arg0, local106, local196, null, Static20.anIntArray64[arg5], 0, local119, local140);
				if (arg5 == 0) {
					if (local123.aBoolean33) {
						Static64.aByteArrayArrayArray3[arg1][arg3][arg0] = 50;
						Static64.aByteArrayArrayArray3[arg1][arg3][arg0 + 1] = 50;
					}
					if (local123.aBoolean29) {
						Static62.anIntArrayArrayArray7[arg1][arg3][arg0] |= 0x249;
					}
				} else if (arg5 == 1) {
					if (local123.aBoolean33) {
						Static64.aByteArrayArrayArray3[arg1][arg3][arg0 + 1] = 50;
						Static64.aByteArrayArrayArray3[arg1][arg3 + 1][arg0 + 1] = 50;
					}
					if (local123.aBoolean29) {
						Static62.anIntArrayArrayArray7[arg1][arg3][arg0 + 1] |= 0x492;
					}
				} else if (arg5 == 2) {
					if (local123.aBoolean33) {
						Static64.aByteArrayArrayArray3[arg1][arg3 + 1][arg0] = 50;
						Static64.aByteArrayArrayArray3[arg1][arg3 + 1][arg0 + 1] = 50;
					}
					if (local123.aBoolean29) {
						Static62.anIntArrayArrayArray7[arg1][arg3 + 1][arg0] |= 0x249;
					}
				} else if (arg5 == 3) {
					if (local123.aBoolean33) {
						Static64.aByteArrayArrayArray3[arg1][arg3][arg0] = 50;
						Static64.aByteArrayArrayArray3[arg1][arg3 + 1][arg0] = 50;
					}
					if (local123.aBoolean29) {
						Static62.anIntArrayArrayArray7[arg1][arg3][arg0] |= 0x492;
					}
				}
				if (local123.aBoolean30 && arg7 != null) {
					arg7.method1459(local123.aBoolean31, arg5, arg0, arg2, arg3);
				}
				if (local123.anInt539 != 16) {
					arg4.method1174(arg1, arg3, arg0, local123.anInt539);
				}
			} else if (arg2 == 1) {
				if (local123.anInt544 == -1 && local123.anIntArray61 == null) {
					local196 = local123.method415(arg5, local96, local86, 1, local64, local76);
				} else {
					local196 = new Class2_Sub1_Sub2_Sub6(arg6, 1, arg5, local64, local86, local76, local96, local123.anInt544, true);
				}
				arg4.method1206(arg1, arg3, arg0, local106, local196, null, Static77.anIntArray276[arg5], 0, local119, local140);
				if (local123.aBoolean33) {
					if (arg5 == 0) {
						Static64.aByteArrayArrayArray3[arg1][arg3][arg0 + 1] = 50;
					} else if (arg5 == 1) {
						Static64.aByteArrayArrayArray3[arg1][arg3 + 1][arg0 + 1] = 50;
					} else if (arg5 == 2) {
						Static64.aByteArrayArrayArray3[arg1][arg3 + 1][arg0] = 50;
					} else if (arg5 == 3) {
						Static64.aByteArrayArrayArray3[arg1][arg3][arg0] = 50;
					}
				}
				if (local123.aBoolean30 && arg7 != null) {
					arg7.method1459(local123.aBoolean31, arg5, arg0, arg2, arg3);
				}
			} else {
				@Pc(936) int local936;
				@Pc(966) Class2_Sub1_Sub2 local966;
				if (arg2 == 2) {
					local936 = arg5 + 1 & 0x3;
					@Pc(956) Class2_Sub1_Sub2 local956;
					if (local123.anInt544 == -1 && local123.anIntArray61 == null) {
						local956 = local123.method415(arg5 + 4, local96, local86, 2, local64, local76);
						local966 = local123.method415(local936, local96, local86, 2, local64, local76);
					} else {
						local956 = new Class2_Sub1_Sub2_Sub6(arg6, 2, arg5 + 4, local64, local86, local76, local96, local123.anInt544, true);
						local966 = new Class2_Sub1_Sub2_Sub6(arg6, 2, local936, local64, local86, local76, local96, local123.anInt544, true);
					}
					arg4.method1206(arg1, arg3, arg0, local106, local956, local966, Static20.anIntArray64[arg5], Static20.anIntArray64[local936], local119, local140);
					if (local123.aBoolean29) {
						if (arg5 == 0) {
							Static62.anIntArrayArrayArray7[arg1][arg3][arg0] |= 0x249;
							Static62.anIntArrayArrayArray7[arg1][arg3][arg0 + 1] |= 0x492;
						} else if (arg5 == 1) {
							Static62.anIntArrayArrayArray7[arg1][arg3][arg0 + 1] |= 0x492;
							Static62.anIntArrayArrayArray7[arg1][arg3 + 1][arg0] |= 0x249;
						} else if (arg5 == 2) {
							Static62.anIntArrayArrayArray7[arg1][arg3 + 1][arg0] |= 0x249;
							Static62.anIntArrayArrayArray7[arg1][arg3][arg0] |= 0x492;
						} else if (arg5 == 3) {
							Static62.anIntArrayArrayArray7[arg1][arg3][arg0] |= 0x492;
							Static62.anIntArrayArrayArray7[arg1][arg3][arg0] |= 0x249;
						}
					}
					if (local123.aBoolean30 && arg7 != null) {
						arg7.method1459(local123.aBoolean31, arg5, arg0, arg2, arg3);
					}
					if (local123.anInt539 != 16) {
						arg4.method1174(arg1, arg3, arg0, local123.anInt539);
					}
				} else if (arg2 == 3) {
					if (local123.anInt544 == -1 && local123.anIntArray61 == null) {
						local196 = local123.method415(arg5, local96, local86, 3, local64, local76);
					} else {
						local196 = new Class2_Sub1_Sub2_Sub6(arg6, 3, arg5, local64, local86, local76, local96, local123.anInt544, true);
					}
					arg4.method1206(arg1, arg3, arg0, local106, local196, null, Static77.anIntArray276[arg5], 0, local119, local140);
					if (local123.aBoolean33) {
						if (arg5 == 0) {
							Static64.aByteArrayArrayArray3[arg1][arg3][arg0 + 1] = 50;
						} else if (arg5 == 1) {
							Static64.aByteArrayArrayArray3[arg1][arg3 + 1][arg0 + 1] = 50;
						} else if (arg5 == 2) {
							Static64.aByteArrayArrayArray3[arg1][arg3 + 1][arg0] = 50;
						} else if (arg5 == 3) {
							Static64.aByteArrayArrayArray3[arg1][arg3][arg0] = 50;
						}
					}
					if (local123.aBoolean30 && arg7 != null) {
						arg7.method1459(local123.aBoolean31, arg5, arg0, arg2, arg3);
					}
				} else if (arg2 == 9) {
					if (local123.anInt544 == -1 && local123.anIntArray61 == null) {
						local196 = local123.method415(arg5, local96, local86, arg2, local64, local76);
					} else {
						local196 = new Class2_Sub1_Sub2_Sub6(arg6, arg2, arg5, local64, local86, local76, local96, local123.anInt544, true);
					}
					arg4.method1201(arg1, arg3, arg0, local106, 1, 1, local196, 0, local119, local140);
					if (local123.aBoolean30 && arg7 != null) {
						arg7.method1466(local123.anInt537, arg5, arg0, local123.anInt528, local123.aBoolean31, arg3);
					}
				} else {
					if (local123.aBoolean26) {
						if (arg5 == 1) {
							local936 = local96;
							local96 = local76;
							local76 = local86;
							local86 = local64;
							local64 = local936;
						} else if (arg5 == 2) {
							local936 = local96;
							local96 = local86;
							local86 = local936;
							local936 = local76;
							local76 = local64;
							local64 = local936;
						} else if (arg5 == 3) {
							local936 = local96;
							local96 = local64;
							local64 = local86;
							local86 = local76;
							local76 = local936;
						}
					}
					if (arg2 == 4) {
						if (local123.anInt544 == -1 && local123.anIntArray61 == null) {
							local196 = local123.method415(0, local96, local86, 4, local64, local76);
						} else {
							local196 = new Class2_Sub1_Sub2_Sub6(arg6, 4, 0, local64, local86, local76, local96, local123.anInt544, true);
						}
						arg4.method1176(arg1, arg3, arg0, local106, local196, Static20.anIntArray64[arg5], arg5 * 512, 0, 0, local119, local140);
					} else if (arg2 == 5) {
						local287 = arg4.method1195(arg1, arg3, arg0);
						local936 = 16;
						if (local287 > 0) {
							local936 = Static48.method916(local287 >> 14 & 0x7FFF).anInt539;
						}
						if (local123.anInt544 == -1 && local123.anIntArray61 == null) {
							local966 = local123.method415(0, local96, local86, 4, local64, local76);
						} else {
							local966 = new Class2_Sub1_Sub2_Sub6(arg6, 4, 0, local64, local86, local76, local96, local123.anInt544, true);
						}
						arg4.method1176(arg1, arg3, arg0, local106, local966, Static20.anIntArray64[arg5], arg5 * 512, local936 * Static69.anIntArray248[arg5], local936 * Static39.anIntArray166[arg5], local119, local140);
					} else if (arg2 == 6) {
						if (local123.anInt544 == -1 && local123.anIntArray61 == null) {
							local196 = local123.method415(0, local96, local86, 4, local64, local76);
						} else {
							local196 = new Class2_Sub1_Sub2_Sub6(arg6, 4, 0, local64, local86, local76, local96, local123.anInt544, true);
						}
						arg4.method1176(arg1, arg3, arg0, local106, local196, 256, arg5, 0, 0, local119, local140);
					} else if (arg2 == 7) {
						if (local123.anInt544 == -1 && local123.anIntArray61 == null) {
							local196 = local123.method415(0, local96, local86, 4, local64, local76);
						} else {
							local196 = new Class2_Sub1_Sub2_Sub6(arg6, 4, 0, local64, local86, local76, local96, local123.anInt544, true);
						}
						arg4.method1176(arg1, arg3, arg0, local106, local196, 512, arg5, 0, 0, local119, local140);
					} else if (arg2 == 8) {
						if (local123.anInt544 == -1 && local123.anIntArray61 == null) {
							local196 = local123.method415(0, local96, local86, 4, local64, local76);
						} else {
							local196 = new Class2_Sub1_Sub2_Sub6(arg6, 4, 0, local64, local86, local76, local96, local123.anInt544, true);
						}
						arg4.method1176(arg1, arg3, arg0, local106, local196, 768, arg5, 0, 0, local119, local140);
					}
				}
			}
		} else if (!Static35.aBoolean136 || local123.anInt551 != 0 || local123.aBoolean32) {
			if (local123.anInt544 == -1 && local123.anIntArray61 == null) {
				local196 = local123.method415(arg5, local96, local86, 22, local64, local76);
			} else {
				local196 = new Class2_Sub1_Sub2_Sub6(arg6, 22, arg5, local64, local86, local76, local96, local123.anInt544, true);
			}
			arg4.method1197(arg1, arg3, arg0, local106, local196, local119, local140);
			if (local123.aBoolean30 && local123.anInt551 == 1 && arg7 != null) {
				arg7.method1470(arg3, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(JI)V")
	public static void method1782(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % (long) 10 == 0L) {
			method1757(arg0 - 1L);
			method1757(1L);
		} else {
			method1757(arg0);
		}
	}
}
