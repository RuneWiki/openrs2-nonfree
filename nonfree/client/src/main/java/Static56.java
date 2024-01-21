import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_16;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!re;")
	public static Class60 aClass60_1;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!kc;")
	private static Class36 aClass36_703 = Static14.method2017("wishes to duel with you)3");

	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	public static volatile int anInt1487 = 0;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Lclient!gd;")
	public static Class22 aClass22_22 = new Class22(64);

	@OriginalMember(owner = "client!l", name = "l", descriptor = "I")
	public static int anInt1491 = 1;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!kc;")
	public static Class36 aClass36_704 = aClass36_703;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Lclient!kc;")
	public static Class36 aClass36_705 = Static14.method2017(")1");

	@OriginalMember(owner = "client!l", name = "p", descriptor = "Lclient!kc;")
	public static Class36 aClass36_706 = Static14.method2017("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Lclient!kc;")
	public static Class36 aClass36_707 = Static14.method2017("Regelversto-8 melden");

	@OriginalMember(owner = "client!l", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray23 = new byte[50][];

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Lclient!kc;")
	public static Class36 aClass36_708 = Static14.method2017("l");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IILclient!sa;IIIZIILclient!ad;)V")
	public static void method1043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class4 arg8) {
		@Pc(13) int local13 = Static27.anIntArrayArrayArray4[arg5][arg7][arg3];
		@Pc(23) int local23 = Static27.anIntArrayArrayArray4[arg5][arg7 + 1][arg3];
		@Pc(33) int local33 = Static27.anIntArrayArrayArray4[arg5][arg7][arg3 + 1];
		@Pc(45) int local45 = Static27.anIntArrayArrayArray4[arg5][arg7 + 1][arg3 + 1];
		@Pc(67) int local67 = (arg6 << 14) + arg7 + (arg3 << 7) + 1073741824;
		@Pc(71) Class2_Sub1_Sub13 local71 = Static2.method2072(arg6);
		if (local71.anInt2303 == 0) {
			local67 += Integer.MIN_VALUE;
		}
		@Pc(88) int local88 = (arg0 << 6) + arg1;
		@Pc(98) int local98 = local13 + local23 + local45 + local33 >> 2;
		if (local71.anInt2314 == 1) {
			local88 += 256;
		}
		@Pc(125) Class2_Sub1_Sub4 local125;
		if (arg1 == 22) {
			if (local71.anInt2300 == -1 && local71.anIntArray275 == null) {
				local125 = local71.method1629(local45, arg0, local23, local13, 22, local33);
			} else {
				local125 = new Class2_Sub1_Sub4_Sub6(arg6, 22, arg0, local13, local23, local45, local33, local71.anInt2300, true, null);
			}
			arg2.method1706(arg4, arg7, arg3, local98, local125, local67, local88);
			if (local71.aBoolean95 && local71.anInt2303 == 1) {
				arg8.method138(arg7, arg3);
			}
			return;
		}
		@Pc(229) int local229;
		if (arg1 == 10 || arg1 == 11) {
			if (local71.anInt2300 == -1 && local71.anIntArray275 == null) {
				local125 = local71.method1629(local45, arg0, local23, local13, 10, local33);
			} else {
				local125 = new Class2_Sub1_Sub4_Sub6(arg6, 10, arg0, local13, local23, local45, local33, local71.anInt2300, true, null);
			}
			if (local125 != null) {
				@Pc(210) int local210 = 0;
				if (arg1 == 11) {
					local210 += 256;
				}
				@Pc(232) int local232;
				if (arg0 == 1 || arg0 == 3) {
					local229 = local71.anInt2288;
					local232 = local71.anInt2326;
				} else {
					local232 = local71.anInt2288;
					local229 = local71.anInt2326;
				}
				arg2.method1731(arg4, arg7, arg3, local98, local229, local232, local125, local210, local67, local88);
			}
			if (local71.aBoolean95) {
				arg8.method137(local71.anInt2288, arg0, local71.aBoolean103, local71.anInt2326, arg7, arg3);
			}
		} else if (arg1 >= 12) {
			if (local71.anInt2300 == -1 && local71.anIntArray275 == null) {
				local125 = local71.method1629(local45, arg0, local23, local13, arg1, local33);
			} else {
				local125 = new Class2_Sub1_Sub4_Sub6(arg6, arg1, arg0, local13, local23, local45, local33, local71.anInt2300, true, null);
			}
			arg2.method1731(arg4, arg7, arg3, local98, 1, 1, local125, 0, local67, local88);
			if (local71.aBoolean95) {
				arg8.method137(local71.anInt2288, arg0, local71.aBoolean103, local71.anInt2326, arg7, arg3);
			}
		} else if (arg1 == 0) {
			if (local71.anInt2300 == -1 && local71.anIntArray275 == null) {
				local125 = local71.method1629(local45, arg0, local23, local13, 0, local33);
			} else {
				local125 = new Class2_Sub1_Sub4_Sub6(arg6, 0, arg0, local13, local23, local45, local33, local71.anInt2300, true, null);
			}
			arg2.method1692(arg4, arg7, arg3, local98, local125, null, Static88.anIntArray268[arg0], 0, local67, local88);
			if (local71.aBoolean95) {
				arg8.method127(local71.aBoolean103, arg7, arg1, arg3, arg0);
			}
		} else if (arg1 == 1) {
			if (local71.anInt2300 == -1 && local71.anIntArray275 == null) {
				local125 = local71.method1629(local45, arg0, local23, local13, 1, local33);
			} else {
				local125 = new Class2_Sub1_Sub4_Sub6(arg6, 1, arg0, local13, local23, local45, local33, local71.anInt2300, true, null);
			}
			arg2.method1692(arg4, arg7, arg3, local98, local125, null, Static97.anIntArray315[arg0], 0, local67, local88);
			if (local71.aBoolean95) {
				arg8.method127(local71.aBoolean103, arg7, arg1, arg3, arg0);
			}
		} else {
			@Pc(486) int local486;
			@Pc(519) Class2_Sub1_Sub4 local519;
			if (arg1 == 2) {
				local486 = arg0 + 1 & 0x3;
				@Pc(509) Class2_Sub1_Sub4 local509;
				if (local71.anInt2300 == -1 && local71.anIntArray275 == null) {
					local509 = local71.method1629(local45, arg0 + 4, local23, local13, 2, local33);
					local519 = local71.method1629(local45, local486, local23, local13, 2, local33);
				} else {
					local509 = new Class2_Sub1_Sub4_Sub6(arg6, 2, arg0 + 4, local13, local23, local45, local33, local71.anInt2300, true, null);
					local519 = new Class2_Sub1_Sub4_Sub6(arg6, 2, local486, local13, local23, local45, local33, local71.anInt2300, true, null);
				}
				arg2.method1692(arg4, arg7, arg3, local98, local509, local519, Static88.anIntArray268[arg0], Static88.anIntArray268[local486], local67, local88);
				if (local71.aBoolean95) {
					arg8.method127(local71.aBoolean103, arg7, arg1, arg3, arg0);
				}
			} else if (arg1 == 3) {
				if (local71.anInt2300 == -1 && local71.anIntArray275 == null) {
					local125 = local71.method1629(local45, arg0, local23, local13, 3, local33);
				} else {
					local125 = new Class2_Sub1_Sub4_Sub6(arg6, 3, arg0, local13, local23, local45, local33, local71.anInt2300, true, null);
				}
				arg2.method1692(arg4, arg7, arg3, local98, local125, null, Static97.anIntArray315[arg0], 0, local67, local88);
				if (local71.aBoolean95) {
					arg8.method127(local71.aBoolean103, arg7, arg1, arg3, arg0);
				}
			} else if (arg1 == 9) {
				if (local71.anInt2300 == -1 && local71.anIntArray275 == null) {
					local125 = local71.method1629(local45, arg0, local23, local13, arg1, local33);
				} else {
					local125 = new Class2_Sub1_Sub4_Sub6(arg6, arg1, arg0, local13, local23, local45, local33, local71.anInt2300, true, null);
				}
				arg2.method1731(arg4, arg7, arg3, local98, 1, 1, local125, 0, local67, local88);
				if (local71.aBoolean95) {
					arg8.method137(local71.anInt2288, arg0, local71.aBoolean103, local71.anInt2326, arg7, arg3);
				}
			} else {
				if (local71.aBoolean101) {
					if (arg0 == 1) {
						local486 = local33;
						local33 = local45;
						local45 = local23;
						local23 = local13;
						local13 = local486;
					} else if (arg0 == 2) {
						local486 = local33;
						local33 = local23;
						local23 = local486;
						local486 = local45;
						local45 = local13;
						local13 = local486;
					} else if (arg0 == 3) {
						local486 = local33;
						local33 = local13;
						local13 = local23;
						local23 = local45;
						local45 = local486;
					}
				}
				if (arg1 == 4) {
					if (local71.anInt2300 == -1 && local71.anIntArray275 == null) {
						local125 = local71.method1629(local45, 0, local23, local13, 4, local33);
					} else {
						local125 = new Class2_Sub1_Sub4_Sub6(arg6, 4, 0, local13, local23, local45, local33, local71.anInt2300, true, null);
					}
					arg2.method1701(arg4, arg7, arg3, local98, local125, Static88.anIntArray268[arg0], arg0 * 512, 0, 0, local67, local88);
				} else if (arg1 == 5) {
					local486 = 16;
					local229 = arg2.method1710(arg4, arg7, arg3);
					if (local229 > 0) {
						local486 = Static2.method2072(local229 >> 14 & 0x7FFF).anInt2302;
					}
					if (local71.anInt2300 == -1 && local71.anIntArray275 == null) {
						local519 = local71.method1629(local45, 0, local23, local13, 4, local33);
					} else {
						local519 = new Class2_Sub1_Sub4_Sub6(arg6, 4, 0, local13, local23, local45, local33, local71.anInt2300, true, null);
					}
					arg2.method1701(arg4, arg7, arg3, local98, local519, Static88.anIntArray268[arg0], arg0 * 512, local486 * Static38.anIntArray145[arg0], Static92.anIntArray285[arg0] * local486, local67, local88);
				} else if (arg1 == 6) {
					if (local71.anInt2300 == -1 && local71.anIntArray275 == null) {
						local125 = local71.method1629(local45, 0, local23, local13, 4, local33);
					} else {
						local125 = new Class2_Sub1_Sub4_Sub6(arg6, 4, 0, local13, local23, local45, local33, local71.anInt2300, true, null);
					}
					arg2.method1701(arg4, arg7, arg3, local98, local125, 256, arg0, 0, 0, local67, local88);
				} else if (arg1 == 7) {
					if (local71.anInt2300 == -1 && local71.anIntArray275 == null) {
						local125 = local71.method1629(local45, 0, local23, local13, 4, local33);
					} else {
						local125 = new Class2_Sub1_Sub4_Sub6(arg6, 4, 0, local13, local23, local45, local33, local71.anInt2300, true, null);
					}
					arg2.method1701(arg4, arg7, arg3, local98, local125, 512, arg0, 0, 0, local67, local88);
				} else if (arg1 == 8) {
					if (local71.anInt2300 == -1 && local71.anIntArray275 == null) {
						local125 = local71.method1629(local45, 0, local23, local13, 4, local33);
					} else {
						local125 = new Class2_Sub1_Sub4_Sub6(arg6, 4, 0, local13, local23, local45, local33, local71.anInt2300, true, null);
					}
					arg2.method1701(arg4, arg7, arg3, local98, local125, 768, arg0, 0, 0, local67, local88);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)I")
	public static int method1044(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local3 < 0 || local11 < 0 || local3 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(34) int local34 = arg1 & 0x7F;
		@Pc(36) int local36 = arg2;
		if (arg2 < 3 && (Static16.aByteArrayArrayArray3[1][local3][local11] & 0x2) == 2) {
			local36 = arg2 + 1;
		}
		@Pc(55) int local55 = arg0 & 0x7F;
		@Pc(82) int local82 = local34 * Static27.anIntArrayArrayArray4[local36][local3 + 1][local11] + (128 - local34) * Static27.anIntArrayArrayArray4[local36][local3][local11] >> 7;
		@Pc(114) int local114 = Static27.anIntArrayArrayArray4[local36][local3][local11 + 1] * (128 - local34) + local34 * Static27.anIntArrayArrayArray4[local36][local3 + 1][local11 + 1] >> 7;
		return local55 * local114 + local82 * (128 - local55) >> 7;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lclient!s;")
	public static Class2_Sub1_Sub14 method1045(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub1_Sub14 local15 = (Class2_Sub1_Sub14) aClass22_22.method711((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static43.aClass3_10.method928(arg0, 12);
		local15 = new Class2_Sub1_Sub14();
		if (local25 != null) {
			local15.method1686(new Class2_Sub12(local25));
		}
		local15.method1677();
		aClass22_22.method712(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method1046() {
		aClass2_Sub1_Sub1_Sub1_16 = null;
		aByteArrayArray23 = null;
		aClass22_22 = null;
		aClass36_703 = null;
		aClass60_1 = null;
		aClass36_704 = null;
		aClass36_706 = null;
		aClass36_705 = null;
		aClass36_707 = null;
		aClass36_708 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ac;Lclient!ac;ILclient!ac;)V")
	public static void method1047(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(3) Class3 arg2) {
		Static90.aClass3_21 = arg0;
		Static43.aClass3_10 = arg1;
		Static67.aClass3_16 = arg2;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	public static void method1048() {
		if (Static43.anInt1141 < 2 && Static20.anInt500 == 0 && !aBoolean70) {
			return;
		}
		@Pc(45) Class36 local45;
		if (Static20.anInt500 == 1 && Static43.anInt1141 < 2) {
			local45 = Static49.method949(new Class36[] { Static27.aClass36_397, Static89.aClass36_1084, Static78.aClass36_958, Static74.aClass36_910 });
		} else if (aBoolean70 && Static43.anInt1141 < 2) {
			local45 = Static49.method949(new Class36[] { Static55.aClass36_1328, Static89.aClass36_1084, Static73.aClass36_890, Static74.aClass36_910 });
		} else {
			local45 = Static90.aClass36Array40[Static43.anInt1141 - 1];
		}
		if (Static43.anInt1141 > 2) {
			local45 = Static49.method949(new Class36[] { local45, Static103.aClass36_1308, Static57.method1055(Static43.anInt1141 - 2), Static77.aClass36_946 });
		}
		Static97.aClass2_Sub1_Sub1_Sub2_4.method453(local45, 4, 16777215, Static113.anInt2952 / 1000);
	}
}
