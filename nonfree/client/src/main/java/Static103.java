import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!rf", name = "ab", descriptor = "[[I")
	public static int[][] anIntArrayArray74;

	@OriginalMember(owner = "client!rf", name = "bb", descriptor = "[Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array7;

	@OriginalMember(owner = "client!rf", name = "F", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1257 = Static59.method1195("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
	public static volatile int anInt2989 = -1;

	@OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
	public static final int anInt2992 = 20;

	@OriginalMember(owner = "client!rf", name = "M", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1258 = Static59.method1195("@cr2@");

	@OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
	public static int anInt2993 = 0;

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "[I")
	public static int[] anIntArray311 = new int[50];

	@OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
	public static int anInt2994 = 0;

	@OriginalMember(owner = "client!rf", name = "Q", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1259 = Static59.method1195("Neuer Benutzer");

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1260 = aClass60_1257;

	@OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
	public static volatile int anInt2998 = 0;

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1261 = Static59.method1195(":tradereq:");

	@OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
	public static int anInt2999 = -1;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
	public static void method2012() {
		Static113.aClass16_72.method1668();
		Static62.aClass3_Sub1_Sub2_Sub4_4.method1903(0, 0);
		Static7.method274();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILclient!qb;IILclient!td;IBI)V")
	public static void method2013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class72 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static14.aBoolean15 && (Static60.aByteArrayArrayArray4[0][arg3][arg1] & 0x2) == 0) {
			if ((Static60.aByteArrayArrayArray4[arg7][arg3][arg1] & 0x10) != 0) {
				return;
			}
			if (Static95.method1786(arg7, arg3, arg1) != Static54.anInt1750) {
				return;
			}
		}
		if (arg7 < Static15.anInt636) {
			Static15.anInt636 = arg7;
		}
		@Pc(53) int local53 = Static51.anIntArrayArrayArray3[arg7][arg3][arg1];
		@Pc(63) int local63 = Static51.anIntArrayArrayArray3[arg7][arg3 + 1][arg1];
		@Pc(75) int local75 = Static51.anIntArrayArrayArray3[arg7][arg3 + 1][arg1 + 1];
		@Pc(85) int local85 = Static51.anIntArrayArrayArray3[arg7][arg3][arg1 + 1];
		@Pc(96) int local96 = local63 + local53 + local75 + local85 >> 2;
		@Pc(108) int local108 = (arg1 << 7) + arg3 + (arg4 << 14) + 1073741824;
		@Pc(112) Class3_Sub1_Sub17 local112 = Static18.method517(arg4);
		@Pc(118) int local118 = arg6 + (arg0 << 6);
		if (local112.anInt3424 == 0) {
			local108 += Integer.MIN_VALUE;
		}
		if (local112.anInt3417 == 1) {
			local118 += 256;
		}
		if (local112.method2274()) {
			Static42.method967(arg3, local112, arg7, arg0, arg1);
		}
		@Pc(184) Class3_Sub1_Sub1 local184;
		if (arg6 != 22) {
			@Pc(281) int local281;
			if (arg6 == 10 || arg6 == 11) {
				if (local112.anInt3437 == -1 && local112.anIntArray387 == null) {
					local184 = local112.method2288(local85, arg0, local53, local75, 10, local63);
				} else {
					local184 = new Class3_Sub1_Sub1_Sub2(arg4, 10, arg0, local53, local63, local75, local85, local112.anInt3437, true, null);
				}
				if (local184 != null) {
					@Pc(278) int local278;
					if (arg0 == 1 || arg0 == 3) {
						local278 = local112.anInt3449;
						local281 = local112.anInt3441;
					} else {
						local281 = local112.anInt3449;
						local278 = local112.anInt3441;
					}
					@Pc(291) int local291 = 0;
					if (arg6 == 11) {
						local291 += 256;
					}
					if (arg2.method1748(arg7, arg3, arg1, local96, local281, local278, local184, local291, local108, local118) && local112.aBoolean124) {
						@Pc(313) int local313 = 15;
						if (local184 instanceof Class3_Sub1_Sub1_Sub4) {
							local313 = ((Class3_Sub1_Sub1_Sub4) local184).method630() / 4;
							if (local313 > 30) {
								local313 = 30;
							}
						}
						for (@Pc(329) int local329 = 0; local329 <= local281; local329++) {
							for (@Pc(333) int local333 = 0; local333 <= local278; local333++) {
								if (local313 > Static11.aByteArrayArrayArray1[arg7][local329 + arg3][arg1 + local333]) {
									Static11.aByteArrayArrayArray1[arg7][arg3 + local329][arg1 + local333] = (byte) local313;
								}
							}
						}
					}
				}
				if (local112.anInt3436 != 0 && arg5 != null) {
					arg5.method2100(local112.anInt3449, local112.aBoolean130, arg1, arg3, local112.anInt3441, arg0);
				}
			} else if (arg6 >= 12) {
				if (local112.anInt3437 == -1 && local112.anIntArray387 == null) {
					local184 = local112.method2288(local85, arg0, local53, local75, arg6, local63);
				} else {
					local184 = new Class3_Sub1_Sub1_Sub2(arg4, arg6, arg0, local53, local63, local75, local85, local112.anInt3437, true, null);
				}
				arg2.method1748(arg7, arg3, arg1, local96, 1, 1, local184, 0, local108, local118);
				if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg7 > 0) {
					Static27.anIntArrayArrayArray1[arg7][arg3][arg1] |= 0x924;
				}
				if (local112.anInt3436 != 0 && arg5 != null) {
					arg5.method2100(local112.anInt3449, local112.aBoolean130, arg1, arg3, local112.anInt3441, arg0);
				}
			} else if (arg6 == 0) {
				if (local112.anInt3437 == -1 && local112.anIntArray387 == null) {
					local184 = local112.method2288(local85, arg0, local53, local75, 0, local63);
				} else {
					local184 = new Class3_Sub1_Sub1_Sub2(arg4, 0, arg0, local53, local63, local75, local85, local112.anInt3437, true, null);
				}
				arg2.method1781(arg7, arg3, arg1, local96, local184, null, Static10.anIntArray48[arg0], 0, local108, local118);
				if (arg0 == 0) {
					if (local112.aBoolean124) {
						Static11.aByteArrayArrayArray1[arg7][arg3][arg1] = 50;
						Static11.aByteArrayArrayArray1[arg7][arg3][arg1 + 1] = 50;
					}
					if (local112.aBoolean132) {
						Static27.anIntArrayArrayArray1[arg7][arg3][arg1] |= 0x249;
					}
				} else if (arg0 == 1) {
					if (local112.aBoolean124) {
						Static11.aByteArrayArrayArray1[arg7][arg3][arg1 + 1] = 50;
						Static11.aByteArrayArrayArray1[arg7][arg3 + 1][arg1 + 1] = 50;
					}
					if (local112.aBoolean132) {
						Static27.anIntArrayArrayArray1[arg7][arg3][arg1 + 1] |= 0x492;
					}
				} else if (arg0 == 2) {
					if (local112.aBoolean124) {
						Static11.aByteArrayArrayArray1[arg7][arg3 + 1][arg1] = 50;
						Static11.aByteArrayArrayArray1[arg7][arg3 + 1][arg1 + 1] = 50;
					}
					if (local112.aBoolean132) {
						Static27.anIntArrayArrayArray1[arg7][arg3 + 1][arg1] |= 0x249;
					}
				} else if (arg0 == 3) {
					if (local112.aBoolean124) {
						Static11.aByteArrayArrayArray1[arg7][arg3][arg1] = 50;
						Static11.aByteArrayArrayArray1[arg7][arg3 + 1][arg1] = 50;
					}
					if (local112.aBoolean132) {
						Static27.anIntArrayArrayArray1[arg7][arg3][arg1] |= 0x492;
					}
				}
				if (local112.anInt3436 != 0 && arg5 != null) {
					arg5.method2109(local112.aBoolean130, arg3, arg0, arg1, arg6);
				}
				if (local112.anInt3446 != 16) {
					arg2.method1744(arg7, arg3, arg1, local112.anInt3446);
				}
			} else if (arg6 == 1) {
				if (local112.anInt3437 == -1 && local112.anIntArray387 == null) {
					local184 = local112.method2288(local85, arg0, local53, local75, 1, local63);
				} else {
					local184 = new Class3_Sub1_Sub1_Sub2(arg4, 1, arg0, local53, local63, local75, local85, local112.anInt3437, true, null);
				}
				arg2.method1781(arg7, arg3, arg1, local96, local184, null, Static56.anIntArray199[arg0], 0, local108, local118);
				if (local112.aBoolean124) {
					if (arg0 == 0) {
						Static11.aByteArrayArrayArray1[arg7][arg3][arg1 + 1] = 50;
					} else if (arg0 == 1) {
						Static11.aByteArrayArrayArray1[arg7][arg3 + 1][arg1 + 1] = 50;
					} else if (arg0 == 2) {
						Static11.aByteArrayArrayArray1[arg7][arg3 + 1][arg1] = 50;
					} else if (arg0 == 3) {
						Static11.aByteArrayArrayArray1[arg7][arg3][arg1] = 50;
					}
				}
				if (local112.anInt3436 != 0 && arg5 != null) {
					arg5.method2109(local112.aBoolean130, arg3, arg0, arg1, arg6);
				}
			} else {
				@Pc(926) int local926;
				@Pc(966) Class3_Sub1_Sub1 local966;
				if (arg6 == 2) {
					local926 = arg0 + 1 & 0x3;
					@Pc(951) Class3_Sub1_Sub1 local951;
					if (local112.anInt3437 == -1 && local112.anIntArray387 == null) {
						local951 = local112.method2288(local85, arg0 + 4, local53, local75, 2, local63);
						local966 = local112.method2288(local85, local926, local53, local75, 2, local63);
					} else {
						local951 = new Class3_Sub1_Sub1_Sub2(arg4, 2, arg0 + 4, local53, local63, local75, local85, local112.anInt3437, true, null);
						local966 = new Class3_Sub1_Sub1_Sub2(arg4, 2, local926, local53, local63, local75, local85, local112.anInt3437, true, null);
					}
					arg2.method1781(arg7, arg3, arg1, local96, local951, local966, Static10.anIntArray48[arg0], Static10.anIntArray48[local926], local108, local118);
					if (local112.aBoolean132) {
						if (arg0 == 0) {
							Static27.anIntArrayArrayArray1[arg7][arg3][arg1] |= 0x249;
							Static27.anIntArrayArrayArray1[arg7][arg3][arg1 + 1] |= 0x492;
						} else if (arg0 == 1) {
							Static27.anIntArrayArrayArray1[arg7][arg3][arg1 + 1] |= 0x492;
							Static27.anIntArrayArrayArray1[arg7][arg3 + 1][arg1] |= 0x249;
						} else if (arg0 == 2) {
							Static27.anIntArrayArrayArray1[arg7][arg3 + 1][arg1] |= 0x249;
							Static27.anIntArrayArrayArray1[arg7][arg3][arg1] |= 0x492;
						} else if (arg0 == 3) {
							Static27.anIntArrayArrayArray1[arg7][arg3][arg1] |= 0x492;
							Static27.anIntArrayArrayArray1[arg7][arg3][arg1] |= 0x249;
						}
					}
					if (local112.anInt3436 != 0 && arg5 != null) {
						arg5.method2109(local112.aBoolean130, arg3, arg0, arg1, arg6);
					}
					if (local112.anInt3446 != 16) {
						arg2.method1744(arg7, arg3, arg1, local112.anInt3446);
					}
				} else if (arg6 == 3) {
					if (local112.anInt3437 == -1 && local112.anIntArray387 == null) {
						local184 = local112.method2288(local85, arg0, local53, local75, 3, local63);
					} else {
						local184 = new Class3_Sub1_Sub1_Sub2(arg4, 3, arg0, local53, local63, local75, local85, local112.anInt3437, true, null);
					}
					arg2.method1781(arg7, arg3, arg1, local96, local184, null, Static56.anIntArray199[arg0], 0, local108, local118);
					if (local112.aBoolean124) {
						if (arg0 == 0) {
							Static11.aByteArrayArrayArray1[arg7][arg3][arg1 + 1] = 50;
						} else if (arg0 == 1) {
							Static11.aByteArrayArrayArray1[arg7][arg3 + 1][arg1 + 1] = 50;
						} else if (arg0 == 2) {
							Static11.aByteArrayArrayArray1[arg7][arg3 + 1][arg1] = 50;
						} else if (arg0 == 3) {
							Static11.aByteArrayArrayArray1[arg7][arg3][arg1] = 50;
						}
					}
					if (local112.anInt3436 != 0 && arg5 != null) {
						arg5.method2109(local112.aBoolean130, arg3, arg0, arg1, arg6);
					}
				} else if (arg6 == 9) {
					if (local112.anInt3437 == -1 && local112.anIntArray387 == null) {
						local184 = local112.method2288(local85, arg0, local53, local75, arg6, local63);
					} else {
						local184 = new Class3_Sub1_Sub1_Sub2(arg4, arg6, arg0, local53, local63, local75, local85, local112.anInt3437, true, null);
					}
					arg2.method1748(arg7, arg3, arg1, local96, 1, 1, local184, 0, local108, local118);
					if (local112.anInt3436 != 0 && arg5 != null) {
						arg5.method2100(local112.anInt3449, local112.aBoolean130, arg1, arg3, local112.anInt3441, arg0);
					}
				} else {
					if (local112.aBoolean131) {
						if (arg0 == 1) {
							local926 = local85;
							local85 = local75;
							local75 = local63;
							local63 = local53;
							local53 = local926;
						} else if (arg0 == 2) {
							local926 = local85;
							local85 = local63;
							local63 = local926;
							@Pc(1432) int local1432 = local75;
							local75 = local53;
							local53 = local1432;
						} else if (arg0 == 3) {
							local926 = local85;
							local85 = local53;
							local53 = local63;
							local63 = local75;
							local75 = local926;
						}
					}
					if (arg6 == 4) {
						if (local112.anInt3437 == -1 && local112.anIntArray387 == null) {
							local184 = local112.method2288(local85, 0, local53, local75, 4, local63);
						} else {
							local184 = new Class3_Sub1_Sub1_Sub2(arg4, 4, 0, local53, local63, local75, local85, local112.anInt3437, true, null);
						}
						arg2.method1763(arg7, arg3, arg1, local96, local184, Static10.anIntArray48[arg0], arg0 * 512, 0, 0, local108, local118);
					} else if (arg6 == 5) {
						local926 = 16;
						local281 = arg2.method1745(arg7, arg3, arg1);
						if (local281 != 0) {
							local926 = Static18.method517(local281 >> 14 & 0x7FFF).anInt3446;
						}
						if (local112.anInt3437 == -1 && local112.anIntArray387 == null) {
							local966 = local112.method2288(local85, 0, local53, local75, 4, local63);
						} else {
							local966 = new Class3_Sub1_Sub1_Sub2(arg4, 4, 0, local53, local63, local75, local85, local112.anInt3437, true, null);
						}
						arg2.method1763(arg7, arg3, arg1, local96, local966, Static10.anIntArray48[arg0], arg0 * 512, local926 * Static21.anIntArray86[arg0], local926 * Static84.anIntArray268[arg0], local108, local118);
					} else if (arg6 == 6) {
						if (local112.anInt3437 == -1 && local112.anIntArray387 == null) {
							local184 = local112.method2288(local85, 0, local53, local75, 4, local63);
						} else {
							local184 = new Class3_Sub1_Sub1_Sub2(arg4, 4, 0, local53, local63, local75, local85, local112.anInt3437, true, null);
						}
						arg2.method1763(arg7, arg3, arg1, local96, local184, 256, arg0, 0, 0, local108, local118);
					} else if (arg6 == 7) {
						if (local112.anInt3437 == -1 && local112.anIntArray387 == null) {
							local184 = local112.method2288(local85, 0, local53, local75, 4, local63);
						} else {
							local184 = new Class3_Sub1_Sub1_Sub2(arg4, 4, 0, local53, local63, local75, local85, local112.anInt3437, true, null);
						}
						arg2.method1763(arg7, arg3, arg1, local96, local184, 512, arg0, 0, 0, local108, local118);
					} else if (arg6 == 8) {
						if (local112.anInt3437 == -1 && local112.anIntArray387 == null) {
							local184 = local112.method2288(local85, 0, local53, local75, 4, local63);
						} else {
							local184 = new Class3_Sub1_Sub1_Sub2(arg4, 4, 0, local53, local63, local75, local85, local112.anInt3437, true, null);
						}
						arg2.method1763(arg7, arg3, arg1, local96, local184, 768, arg0, 0, 0, local108, local118);
					}
				}
			}
		} else if (!Static14.aBoolean15 || local112.anInt3424 != 0 || local112.anInt3436 == 1 || local112.aBoolean125) {
			if (local112.anInt3437 == -1 && local112.anIntArray387 == null) {
				local184 = local112.method2288(local85, arg0, local53, local75, 22, local63);
			} else {
				local184 = new Class3_Sub1_Sub1_Sub2(arg4, 22, arg0, local53, local63, local75, local85, local112.anInt3437, true, null);
			}
			arg2.method1776(arg7, arg3, arg1, local96, local184, local108, local118);
			if (local112.anInt3436 == 1 && arg5 != null) {
				arg5.method2101(arg3, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBLclient!jb;)Lclient!k;")
	public static Class3_Sub11 method2014(@OriginalArg(0) int arg0, @OriginalArg(2) Class25 arg1) {
		@Pc(8) byte[] local8 = arg1.method928(arg0);
		return local8 == null ? null : new Class3_Sub11(local8);
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
	public static void method2015() {
		if (Static105.aClass47_4 != null) {
			Static105.aClass47_4.method1564();
		}
	}

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)V")
	public static void method2016() {
		for (@Pc(14) Class3_Sub1_Sub1_Sub5 local14 = (Class3_Sub1_Sub1_Sub5) Static108.aClass5_20.method92(); local14 != null; local14 = (Class3_Sub1_Sub1_Sub5) Static108.aClass5_20.method90()) {
			if (local14.anInt2114 != Static119.anInt3243 || local14.aBoolean68) {
				local14.method2264();
			} else if (local14.anInt2122 <= Static34.anInt1183) {
				local14.method1377(Static69.anInt2153);
				if (local14.aBoolean68) {
					local14.method2264();
				} else {
					Static13.aClass58_1.method1767(local14.anInt2114, local14.anInt2109, local14.anInt2113, local14.anInt2123, 60, local14, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "(I)V")
	public static void method2017() {
		anIntArrayArray74 = null;
		aClass3_Sub1_Sub2_Sub3Array7 = null;
		aClass60_1257 = null;
		aClass60_1258 = null;
		anIntArray311 = null;
		aClass60_1261 = null;
		aClass60_1260 = null;
		aClass60_1259 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBLclient!md;)V")
	public static void method2018(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub1_Sub3 arg1) {
		if (arg1.anInt1535 > Static34.anInt1183) {
			Static66.method1352(arg1);
		} else if (Static34.anInt1183 <= arg1.anInt1506) {
			Static28.method2222(arg1);
		} else {
			Static53.method1135(arg1);
		}
		if (arg1.anInt1524 < 128 || arg1.anInt1494 < 128 || arg1.anInt1524 >= 13184 || arg1.anInt1494 >= 13184) {
			arg1.anInt1506 = 0;
			arg1.anInt1536 = -1;
			arg1.anInt1524 = arg1.anInt1532 * 64 + arg1.anIntArray184[0] * 128;
			arg1.anInt1535 = 0;
			arg1.anInt1538 = -1;
			arg1.anInt1494 = arg1.anInt1532 * 64 + arg1.anIntArray181[0] * 128;
			arg1.method1024();
		}
		if (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1 == arg1 && (arg1.anInt1524 < 1536 || arg1.anInt1494 < 1536 || arg1.anInt1524 >= 11776 || arg1.anInt1494 >= 11776)) {
			arg1.anInt1535 = 0;
			arg1.anInt1538 = -1;
			arg1.anInt1494 = arg1.anIntArray181[0] * 128 + arg1.anInt1532 * 64;
			arg1.anInt1536 = -1;
			arg1.anInt1524 = arg1.anInt1532 * 64 + arg1.anIntArray184[0] * 128;
			arg1.anInt1506 = 0;
			arg1.method1024();
		}
		Static12.method338(arg1);
		Static128.method2290(arg1);
	}
}
