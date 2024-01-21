import java.math.BigInteger;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4 aClass3_Sub1_Sub5_Sub4_17;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "I")
	public static int anInt1112;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public static int anInt1109 = 0;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Lclient!te;")
	public static Class75 aClass75_31 = new Class75(30);

	@OriginalMember(owner = "client!g", name = "i", descriptor = "Lclient!kb;")
	public static Class41 aClass41_1 = new Class41();

	@OriginalMember(owner = "client!g", name = "j", descriptor = "Lclient!na;")
	public static Class53 aClass53_465 = Static109.method1737("@yel@*V");

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!na;")
	public static Class53 aClass53_466 = Static109.method1737("backleft2");

	@OriginalMember(owner = "client!g", name = "o", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!na;")
	public static Class53 aClass53_467 = Static109.method1737("headicons_hint");

	@OriginalMember(owner = "client!g", name = "y", descriptor = "Lclient!na;")
	public static Class53 aClass53_476 = Static109.method1737("");

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_468 = aClass53_476;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "Lclient!na;")
	public static Class53 aClass53_469 = aClass53_476;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_470 = aClass53_476;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "Lclient!na;")
	public static Class53 aClass53_471 = Static109.method1737("(Y ");

	@OriginalMember(owner = "client!g", name = "u", descriptor = "Lclient!na;")
	private static Class53 aClass53_472 = Static109.method1737("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!g", name = "v", descriptor = "Lclient!na;")
	public static Class53 aClass53_473 = aClass53_476;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "Lclient!na;")
	public static Class53 aClass53_474 = aClass53_476;

	@OriginalMember(owner = "client!g", name = "x", descriptor = "Lclient!na;")
	public static Class53 aClass53_475 = aClass53_476;

	@OriginalMember(owner = "client!g", name = "z", descriptor = "I")
	public static volatile int anInt1113 = 0;

	@OriginalMember(owner = "client!g", name = "A", descriptor = "Lclient!na;")
	public static Class53 aClass53_477 = aClass53_472;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "Lclient!na;")
	public static Class53 aClass53_478 = aClass53_476;

	@OriginalMember(owner = "client!g", name = "D", descriptor = "I")
	public static int anInt1114 = 0;

	@OriginalMember(owner = "client!g", name = "E", descriptor = "Lclient!na;")
	public static Class53 aClass53_479 = aClass53_476;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIILclient!we;)Z")
	public static boolean method756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(18) byte[] local18 = arg2.method1512(arg0, arg1);
		if (local18 == null) {
			return false;
		} else {
			Static103.method1693(local18);
			return true;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIILclient!bd;Lclient!je;I)V")
	public static void method757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class9 arg5, @OriginalArg(7) Class39 arg6, @OriginalArg(8) int arg7) {
		if (Static45.aBoolean47 && (Static37.aByteArrayArrayArray17[0][arg2][arg0] & 0x2) == 0) {
			if ((Static37.aByteArrayArrayArray17[arg1][arg2][arg0] & 0x10) != 0) {
				return;
			}
			if (Static95.method1568(arg1, arg2, arg0) != Static90.anInt2123) {
				return;
			}
		}
		if (Static21.anInt706 > arg1) {
			Static21.anInt706 = arg1;
		}
		@Pc(49) int local49 = Static107.anIntArrayArrayArray7[arg1][arg2][arg0];
		@Pc(59) int local59 = Static107.anIntArrayArrayArray7[arg1][arg2 + 1][arg0];
		@Pc(69) int local69 = Static107.anIntArrayArrayArray7[arg1][arg2][arg0 + 1];
		@Pc(81) int local81 = Static107.anIntArrayArrayArray7[arg1][arg2 + 1][arg0 + 1];
		@Pc(91) int local91 = local81 + local59 + local49 + local69 >> 2;
		@Pc(95) Class3_Sub1_Sub2 local95 = Static12.method200(arg7);
		@Pc(111) int local111 = (arg7 << 14) + arg2 + (arg0 << 7) + 1073741824;
		if (local95.anInt279 == 0) {
			local111 += Integer.MIN_VALUE;
		}
		@Pc(127) int local127 = arg4 + (arg3 << 6);
		if (local95.anInt259 == 1) {
			local127 += 256;
		}
		if (local95.method171()) {
			Static37.method1534(local95, arg0, arg2, arg1, arg3);
		}
		@Pc(180) Class3_Sub1_Sub4 local180;
		if (arg4 != 22) {
			@Pc(282) int local282;
			if (arg4 == 10 || arg4 == 11) {
				if (local95.anInt298 == -1 && local95.anIntArray24 == null) {
					local180 = local95.method166(10, local59, local69, local49, arg3, local81);
				} else {
					local180 = new Class3_Sub1_Sub4_Sub3(arg7, 10, arg3, local49, local59, local81, local69, local95.anInt298, true, null);
				}
				if (local180 != null) {
					@Pc(279) int local279;
					if (arg3 == 1 || arg3 == 3) {
						local282 = local95.anInt282;
						local279 = local95.anInt270;
					} else {
						local279 = local95.anInt282;
						local282 = local95.anInt270;
					}
					@Pc(292) int local292 = 0;
					if (arg4 == 11) {
						local292 += 256;
					}
					if (arg6.method975(arg1, arg2, arg0, local91, local282, local279, local180, local292, local111, local127) && local95.aBoolean13) {
						@Pc(314) int local314 = 15;
						if (local180 instanceof Class3_Sub1_Sub4_Sub7) {
							local314 = ((Class3_Sub1_Sub4_Sub7) local180).method1778() / 4;
							if (local314 > 30) {
								local314 = 30;
							}
						}
						for (@Pc(332) int local332 = 0; local332 <= local282; local332++) {
							for (@Pc(336) int local336 = 0; local336 <= local279; local336++) {
								if (Static82.aByteArrayArrayArray6[arg1][local332 + arg2][arg0 + local336] < local314) {
									Static82.aByteArrayArrayArray6[arg1][arg2 + local332][arg0 + local336] = (byte) local314;
								}
							}
						}
					}
				}
				if (local95.aBoolean10 && arg5 != null) {
					arg5.method149(local95.anInt270, arg2, local95.aBoolean17, local95.anInt282, arg0, arg3);
				}
			} else if (arg4 >= 12) {
				if (local95.anInt298 == -1 && local95.anIntArray24 == null) {
					local180 = local95.method166(arg4, local59, local69, local49, arg3, local81);
				} else {
					local180 = new Class3_Sub1_Sub4_Sub3(arg7, arg4, arg3, local49, local59, local81, local69, local95.anInt298, true, null);
				}
				arg6.method975(arg1, arg2, arg0, local91, 1, 1, local180, 0, local111, local127);
				if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg1 > 0) {
					Static27.anIntArrayArrayArray1[arg1][arg2][arg0] |= 0x924;
				}
				if (local95.aBoolean10 && arg5 != null) {
					arg5.method149(local95.anInt270, arg2, local95.aBoolean17, local95.anInt282, arg0, arg3);
				}
			} else if (arg4 == 0) {
				if (local95.anInt298 == -1 && local95.anIntArray24 == null) {
					local180 = local95.method166(0, local59, local69, local49, arg3, local81);
				} else {
					local180 = new Class3_Sub1_Sub4_Sub3(arg7, 0, arg3, local49, local59, local81, local69, local95.anInt298, true, null);
				}
				arg6.method991(arg1, arg2, arg0, local91, local180, null, Static16.anIntArray36[arg3], 0, local111, local127);
				if (arg3 == 0) {
					if (local95.aBoolean13) {
						Static82.aByteArrayArrayArray6[arg1][arg2][arg0] = 50;
						Static82.aByteArrayArrayArray6[arg1][arg2][arg0 + 1] = 50;
					}
					if (local95.aBoolean16) {
						Static27.anIntArrayArrayArray1[arg1][arg2][arg0] |= 0x249;
					}
				} else if (arg3 == 1) {
					if (local95.aBoolean13) {
						Static82.aByteArrayArrayArray6[arg1][arg2][arg0 + 1] = 50;
						Static82.aByteArrayArrayArray6[arg1][arg2 + 1][arg0 + 1] = 50;
					}
					if (local95.aBoolean16) {
						Static27.anIntArrayArrayArray1[arg1][arg2][arg0 + 1] |= 0x492;
					}
				} else if (arg3 == 2) {
					if (local95.aBoolean13) {
						Static82.aByteArrayArrayArray6[arg1][arg2 + 1][arg0] = 50;
						Static82.aByteArrayArrayArray6[arg1][arg2 + 1][arg0 + 1] = 50;
					}
					if (local95.aBoolean16) {
						Static27.anIntArrayArrayArray1[arg1][arg2 + 1][arg0] |= 0x249;
					}
				} else if (arg3 == 3) {
					if (local95.aBoolean13) {
						Static82.aByteArrayArrayArray6[arg1][arg2][arg0] = 50;
						Static82.aByteArrayArrayArray6[arg1][arg2 + 1][arg0] = 50;
					}
					if (local95.aBoolean16) {
						Static27.anIntArrayArrayArray1[arg1][arg2][arg0] |= 0x492;
					}
				}
				if (local95.aBoolean10 && arg5 != null) {
					arg5.method141(arg4, arg2, local95.aBoolean17, arg0, arg3);
				}
				if (local95.anInt258 != 16) {
					arg6.method981(arg1, arg2, arg0, local95.anInt258);
				}
			} else if (arg4 == 1) {
				if (local95.anInt298 == -1 && local95.anIntArray24 == null) {
					local180 = local95.method166(1, local59, local69, local49, arg3, local81);
				} else {
					local180 = new Class3_Sub1_Sub4_Sub3(arg7, 1, arg3, local49, local59, local81, local69, local95.anInt298, true, null);
				}
				arg6.method991(arg1, arg2, arg0, local91, local180, null, Static45.anIntArray152[arg3], 0, local111, local127);
				if (local95.aBoolean13) {
					if (arg3 == 0) {
						Static82.aByteArrayArrayArray6[arg1][arg2][arg0 + 1] = 50;
					} else if (arg3 == 1) {
						Static82.aByteArrayArrayArray6[arg1][arg2 + 1][arg0 + 1] = 50;
					} else if (arg3 == 2) {
						Static82.aByteArrayArrayArray6[arg1][arg2 + 1][arg0] = 50;
					} else if (arg3 == 3) {
						Static82.aByteArrayArrayArray6[arg1][arg2][arg0] = 50;
					}
				}
				if (local95.aBoolean10 && arg5 != null) {
					arg5.method141(arg4, arg2, local95.aBoolean17, arg0, arg3);
				}
			} else {
				@Pc(914) int local914;
				@Pc(945) Class3_Sub1_Sub4 local945;
				if (arg4 == 2) {
					local914 = arg3 + 1 & 0x3;
					@Pc(935) Class3_Sub1_Sub4 local935;
					if (local95.anInt298 == -1 && local95.anIntArray24 == null) {
						local935 = local95.method166(2, local59, local69, local49, arg3 + 4, local81);
						local945 = local95.method166(2, local59, local69, local49, local914, local81);
					} else {
						local935 = new Class3_Sub1_Sub4_Sub3(arg7, 2, arg3 + 4, local49, local59, local81, local69, local95.anInt298, true, null);
						local945 = new Class3_Sub1_Sub4_Sub3(arg7, 2, local914, local49, local59, local81, local69, local95.anInt298, true, null);
					}
					arg6.method991(arg1, arg2, arg0, local91, local935, local945, Static16.anIntArray36[arg3], Static16.anIntArray36[local914], local111, local127);
					if (local95.aBoolean16) {
						if (arg3 == 0) {
							Static27.anIntArrayArrayArray1[arg1][arg2][arg0] |= 0x249;
							Static27.anIntArrayArrayArray1[arg1][arg2][arg0 + 1] |= 0x492;
						} else if (arg3 == 1) {
							Static27.anIntArrayArrayArray1[arg1][arg2][arg0 + 1] |= 0x492;
							Static27.anIntArrayArrayArray1[arg1][arg2 + 1][arg0] |= 0x249;
						} else if (arg3 == 2) {
							Static27.anIntArrayArrayArray1[arg1][arg2 + 1][arg0] |= 0x249;
							Static27.anIntArrayArrayArray1[arg1][arg2][arg0] |= 0x492;
						} else if (arg3 == 3) {
							Static27.anIntArrayArrayArray1[arg1][arg2][arg0] |= 0x492;
							Static27.anIntArrayArrayArray1[arg1][arg2][arg0] |= 0x249;
						}
					}
					if (local95.aBoolean10 && arg5 != null) {
						arg5.method141(arg4, arg2, local95.aBoolean17, arg0, arg3);
					}
					if (local95.anInt258 != 16) {
						arg6.method981(arg1, arg2, arg0, local95.anInt258);
					}
				} else if (arg4 == 3) {
					if (local95.anInt298 == -1 && local95.anIntArray24 == null) {
						local180 = local95.method166(3, local59, local69, local49, arg3, local81);
					} else {
						local180 = new Class3_Sub1_Sub4_Sub3(arg7, 3, arg3, local49, local59, local81, local69, local95.anInt298, true, null);
					}
					arg6.method991(arg1, arg2, arg0, local91, local180, null, Static45.anIntArray152[arg3], 0, local111, local127);
					if (local95.aBoolean13) {
						if (arg3 == 0) {
							Static82.aByteArrayArrayArray6[arg1][arg2][arg0 + 1] = 50;
						} else if (arg3 == 1) {
							Static82.aByteArrayArrayArray6[arg1][arg2 + 1][arg0 + 1] = 50;
						} else if (arg3 == 2) {
							Static82.aByteArrayArrayArray6[arg1][arg2 + 1][arg0] = 50;
						} else if (arg3 == 3) {
							Static82.aByteArrayArrayArray6[arg1][arg2][arg0] = 50;
						}
					}
					if (local95.aBoolean10 && arg5 != null) {
						arg5.method141(arg4, arg2, local95.aBoolean17, arg0, arg3);
					}
				} else if (arg4 == 9) {
					if (local95.anInt298 == -1 && local95.anIntArray24 == null) {
						local180 = local95.method166(arg4, local59, local69, local49, arg3, local81);
					} else {
						local180 = new Class3_Sub1_Sub4_Sub3(arg7, arg4, arg3, local49, local59, local81, local69, local95.anInt298, true, null);
					}
					arg6.method975(arg1, arg2, arg0, local91, 1, 1, local180, 0, local111, local127);
					if (local95.aBoolean10 && arg5 != null) {
						arg5.method149(local95.anInt270, arg2, local95.aBoolean17, local95.anInt282, arg0, arg3);
					}
				} else {
					if (local95.aBoolean14) {
						if (arg3 == 1) {
							local914 = local69;
							local69 = local81;
							local81 = local59;
							local59 = local49;
							local49 = local914;
						} else if (arg3 == 2) {
							local914 = local69;
							local69 = local59;
							local59 = local914;
							@Pc(1414) int local1414 = local81;
							local81 = local49;
							local49 = local1414;
						} else if (arg3 == 3) {
							local914 = local69;
							local69 = local49;
							local49 = local59;
							local59 = local81;
							local81 = local914;
						}
					}
					if (arg4 == 4) {
						if (local95.anInt298 == -1 && local95.anIntArray24 == null) {
							local180 = local95.method166(4, local59, local69, local49, 0, local81);
						} else {
							local180 = new Class3_Sub1_Sub4_Sub3(arg7, 4, 0, local49, local59, local81, local69, local95.anInt298, true, null);
						}
						arg6.method963(arg1, arg2, arg0, local91, local180, Static16.anIntArray36[arg3], arg3 * 512, 0, 0, local111, local127);
					} else if (arg4 == 5) {
						local914 = 16;
						local282 = arg6.method1010(arg1, arg2, arg0);
						if (local282 != 0) {
							local914 = Static12.method200(local282 >> 14 & 0x7FFF).anInt258;
						}
						if (local95.anInt298 == -1 && local95.anIntArray24 == null) {
							local945 = local95.method166(4, local59, local69, local49, 0, local81);
						} else {
							local945 = new Class3_Sub1_Sub4_Sub3(arg7, 4, 0, local49, local59, local81, local69, local95.anInt298, true, null);
						}
						arg6.method963(arg1, arg2, arg0, local91, local945, Static16.anIntArray36[arg3], arg3 * 512, Static5.anIntArray18[arg3] * local914, Static58.anIntArray188[arg3] * local914, local111, local127);
					} else if (arg4 == 6) {
						if (local95.anInt298 == -1 && local95.anIntArray24 == null) {
							local180 = local95.method166(4, local59, local69, local49, 0, local81);
						} else {
							local180 = new Class3_Sub1_Sub4_Sub3(arg7, 4, 0, local49, local59, local81, local69, local95.anInt298, true, null);
						}
						arg6.method963(arg1, arg2, arg0, local91, local180, 256, arg3, 0, 0, local111, local127);
					} else if (arg4 == 7) {
						if (local95.anInt298 == -1 && local95.anIntArray24 == null) {
							local180 = local95.method166(4, local59, local69, local49, 0, local81);
						} else {
							local180 = new Class3_Sub1_Sub4_Sub3(arg7, 4, 0, local49, local59, local81, local69, local95.anInt298, true, null);
						}
						arg6.method963(arg1, arg2, arg0, local91, local180, 512, arg3, 0, 0, local111, local127);
					} else if (arg4 == 8) {
						if (local95.anInt298 == -1 && local95.anIntArray24 == null) {
							local180 = local95.method166(4, local59, local69, local49, 0, local81);
						} else {
							local180 = new Class3_Sub1_Sub4_Sub3(arg7, 4, 0, local49, local59, local81, local69, local95.anInt298, true, null);
						}
						arg6.method963(arg1, arg2, arg0, local91, local180, 768, arg3, 0, 0, local111, local127);
					}
				}
			}
		} else if (!Static45.aBoolean47 || local95.anInt279 != 0 || local95.aBoolean12) {
			if (local95.anInt298 == -1 && local95.anIntArray24 == null) {
				local180 = local95.method166(22, local59, local69, local49, arg3, local81);
			} else {
				local180 = new Class3_Sub1_Sub4_Sub3(arg7, 22, arg3, local49, local59, local81, local69, local95.anInt298, true, null);
			}
			arg6.method993(arg1, arg2, arg0, local91, local180, local111, local127);
			if (local95.aBoolean10 && local95.anInt279 == 1 && arg5 != null) {
				arg5.method139(arg0, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BILclient!jf;I)V")
	public static void method758(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub4_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt1442 && arg0 != -1) {
			@Pc(12) int local12 = Static97.method1629(arg0).anInt2246;
			if (local12 == 1) {
				arg1.anInt1422 = 0;
				arg1.anInt1460 = arg2;
				arg1.anInt1466 = 0;
				arg1.anInt1456 = 0;
			}
			if (local12 == 2) {
				arg1.anInt1466 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt1442 == -1 || Static97.method1629(arg0).anInt2259 >= Static97.method1629(arg1.anInt1442).anInt2259) {
			arg1.anInt1456 = 0;
			arg1.anInt1460 = arg2;
			arg1.anInt1442 = arg0;
			arg1.anInt1420 = arg1.anInt1418;
			arg1.anInt1466 = 0;
			arg1.anInt1422 = 0;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!qc;IIII)V")
	public static void method759(@OriginalArg(0) Class3_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static40.anInt1185 >= 50 || Static56.anInt1508 == 0 || (arg0.anIntArray304 == null || arg0.anIntArray304.length <= arg1)) {
			return;
		}
		@Pc(29) int local29 = arg0.anIntArray304[arg1];
		if (local29 == 0) {
			return;
		}
		@Pc(36) int local36 = local29 >> 8;
		@Pc(42) int local42 = local29 >> 4 & 0x7;
		Static5.anIntArray17[Static40.anInt1185] = local36;
		@Pc(52) int local52 = (arg3 - 64) / 128;
		@Pc(63) int local63 = (arg2 - 64) / 128;
		@Pc(67) int local67 = local29 & 0xF;
		Static120.anIntArray404[Static40.anInt1185] = local42;
		Static69.anIntArray225[Static40.anInt1185] = 0;
		Static51.aClass72Array1[Static40.anInt1185] = null;
		Static98.anIntArray314[Static40.anInt1185] = (local63 << 8) + (local52 << 16) + local67;
		Static40.anInt1185++;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IJ)V")
	public static void method760(@OriginalArg(1) long arg0) {
		if ((long) 0 == arg0) {
			return;
		}
		if (Static68.anInt1724 >= 100 && Static46.anInt2869 != 1 || Static68.anInt1724 >= 200) {
			Static73.method1234(0, aClass53_476, Static99.aClass53_1137);
			return;
		}
		@Pc(36) Class53 local36 = Static106.method1712(arg0).method1263();
		for (@Pc(38) int local38 = 0; local38 < Static68.anInt1724; local38++) {
			if (Static2.aLongArray1[local38] == arg0) {
				Static73.method1234(0, aClass53_476, Static103.method1689(new Class53[] { local36, Static19.aClass53_1208 }));
				return;
			}
		}
		for (@Pc(77) int local77 = 0; local77 < Static23.anInt737; local77++) {
			if (Static39.aLongArray4[local77] == arg0) {
				Static73.method1234(0, aClass53_476, Static103.method1689(new Class53[] { Static118.aClass53_1373, local36, Static30.aClass53_399 }));
				return;
			}
		}
		if (local36.method1282(Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.aClass53_668)) {
			return;
		}
		Static52.aClass53Array11[Static68.anInt1724] = local36;
		Static2.aLongArray1[Static68.anInt1724] = arg0;
		Static120.anIntArray405[Static68.anInt1724] = 0;
		Static75.anIntArray250[Static68.anInt1724] = 0;
		Static68.anInt1724++;
		Static36.aBoolean40 = true;
		Static44.anInt1240 = Static27.anInt843 + 1;
		Static115.aClass3_Sub7_Sub1_3.method662(92);
		Static115.aClass3_Sub7_Sub1_3.method633(arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method761() {
		aClass53_474 = null;
		aClass41_1 = null;
		aClass53_472 = null;
		aCRC32_1 = null;
		aClass53_470 = null;
		aClass53_469 = null;
		aBigInteger1 = null;
		aClass53_479 = null;
		aClass53_468 = null;
		aClass53_477 = null;
		aClass75_31 = null;
		aClass53_471 = null;
		aClass53_478 = null;
		aClass53_473 = null;
		aClass53_465 = null;
		aClass3_Sub1_Sub5_Sub4_17 = null;
		aClass53_475 = null;
		aClass53_467 = null;
		aClass53_476 = null;
		aClass53_466 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public static void method762() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}
}
