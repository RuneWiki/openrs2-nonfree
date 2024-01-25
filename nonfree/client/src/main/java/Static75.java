import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!el", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "Lclient!fi;")
	public static final Class74 aClass74_7 = new Class74();

	@OriginalMember(owner = "client!el", name = "u", descriptor = "I")
	public static int anInt1865 = 0;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!bi;)Z")
	public static boolean method1496(@OriginalArg(1) Class26 arg0) {
		if (arg0.anIntArray70 == null) {
			return false;
		}
		for (@Pc(15) int local15 = 0; local15 < arg0.anIntArray70.length; local15++) {
			@Pc(23) int local23 = Static164.method3152(local15, arg0);
			@Pc(28) int local28 = arg0.anIntArray58[local15];
			if (arg0.anIntArray70[local15] == 2) {
				if (local28 <= local23) {
					return false;
				}
			} else if (arg0.anIntArray70[local15] == 3) {
				if (local23 <= local28) {
					return false;
				}
			} else if (arg0.anIntArray70[local15] == 4) {
				if (local28 == local23) {
					return false;
				}
			} else if (local28 != local23) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V")
	public static void method1498() {
		Static29.aClass7_Sub3_Sub2_1.method2799(193);
		Static29.aClass7_Sub3_Sub2_1.method2788(Static168.anInt3502);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IZIILclient!sb;)V")
	public static void method1500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class22_Sub2_Sub1 arg3) {
		@Pc(7) Class79 local7 = arg3.method4417();
		@Pc(20) int local20 = arg3.anInt5106 - arg3.aClass54_7.anInt1603 & 0x3FFF;
		if (arg1 == -1) {
			if (local20 != 0 || arg3.anInt5141 > 25) {
				arg3.aBoolean378 = false;
				if (arg0 < 0 && local7.anInt2354 != -1) {
					arg3.anInt5100 = local7.anInt2354;
				} else if (arg0 <= 0 || local7.anInt2382 == -1) {
					arg3.anInt5100 = local7.anInt2352;
				} else {
					arg3.anInt5100 = local7.anInt2382;
				}
			} else if (!arg3.aBoolean378 || !local7.method1984(arg3.anInt5100)) {
				arg3.anInt5100 = local7.method1986();
				arg3.aBoolean378 = arg3.anInt5100 != -1;
			}
		} else if (arg3.anInt5140 != -1 && (local20 >= 10240 || local20 <= 2048)) {
			@Pc(46) int local46 = Static354.anIntArray852[arg2] - arg3.aClass54_7.anInt1603 & 0x3FFF;
			if (arg1 == 2 && local7.anInt2385 != -1) {
				if (local46 > 2048 && local46 <= 6144 && local7.anInt2376 != -1) {
					arg3.anInt5100 = local7.anInt2376;
				} else if (local46 >= 10240 && local46 < 14336 && local7.anInt2357 != -1) {
					arg3.anInt5100 = local7.anInt2357;
				} else if (local46 <= 6144 || local46 >= 10240 || local7.anInt2351 == -1) {
					arg3.anInt5100 = local7.anInt2385;
				} else {
					arg3.anInt5100 = local7.anInt2351;
				}
			} else if (arg1 == 0 && local7.anInt2374 != -1) {
				if (local46 > 2048 && local46 <= 6144 && local7.anInt2372 != -1) {
					arg3.anInt5100 = local7.anInt2372;
				} else if (local46 >= 10240 && local46 < 14336 && local7.anInt2390 != -1) {
					arg3.anInt5100 = local7.anInt2390;
				} else if (local46 <= 6144 || local46 >= 10240 || local7.anInt2356 == -1) {
					arg3.anInt5100 = local7.anInt2374;
				} else {
					arg3.anInt5100 = local7.anInt2356;
				}
			} else if (local46 > 2048 && local46 <= 6144 && local7.anInt2368 != -1) {
				arg3.anInt5100 = local7.anInt2368;
			} else if (local46 >= 10240 && local46 < 14336 && local7.anInt2370 != -1) {
				arg3.anInt5100 = local7.anInt2370;
			} else if (local46 <= 6144 || local46 >= 10240 || local7.anInt2353 == -1) {
				arg3.anInt5100 = local7.anInt2352;
			} else {
				arg3.anInt5100 = local7.anInt2353;
			}
			arg3.aBoolean378 = false;
		} else if (local20 == 0 && arg3.anInt5141 <= 25) {
			if (arg1 == 2 && local7.anInt2385 != -1) {
				arg3.anInt5100 = local7.anInt2385;
			} else if (arg1 == 0 && local7.anInt2374 != -1) {
				arg3.anInt5100 = local7.anInt2374;
			} else {
				arg3.anInt5100 = local7.anInt2352;
			}
			arg3.aBoolean378 = false;
		} else {
			if (arg1 == 2 && local7.anInt2385 != -1) {
				if (arg0 < 0 && local7.anInt2377 != -1) {
					arg3.anInt5100 = local7.anInt2377;
				} else if (arg0 <= 0 || local7.anInt2380 == -1) {
					arg3.anInt5100 = local7.anInt2385;
				} else {
					arg3.anInt5100 = local7.anInt2380;
				}
			} else if (arg1 == 0 && local7.anInt2374 != -1) {
				if (arg0 < 0 && local7.anInt2384 != -1) {
					arg3.anInt5100 = local7.anInt2384;
				} else if (arg0 <= 0 || local7.anInt2365 == -1) {
					arg3.anInt5100 = local7.anInt2374;
				} else {
					arg3.anInt5100 = local7.anInt2365;
				}
			} else if (arg0 < 0 && local7.anInt2378 != -1) {
				arg3.anInt5100 = local7.anInt2378;
			} else if (arg0 <= 0 || local7.anInt2363 == -1) {
				arg3.anInt5100 = local7.anInt2352;
			} else {
				arg3.anInt5100 = local7.anInt2363;
			}
			arg3.aBoolean378 = false;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V")
	public static void method1501(@OriginalArg(1) int arg0) {
		Static189.method3448();
		Static310.method5005();
		@Pc(14) int local14 = Static243.method4200(arg0).anInt5649;
		if (local14 == 0) {
			return;
		}
		@Pc(24) int local24 = Static212.anIntArray579[arg0];
		if (local14 == 5) {
			Static214.anInt4265 = local24;
		}
		if (local14 == 6) {
			Static233.anInt4646 = local24;
		}
		if (local14 == 9) {
			Static57.anInt1470 = local24;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
	public static void method1502() {
		Static298.aClass26ArrayArray1 = new Class26[Static85.aClass180_22.method4576()][];
		Static57.aBooleanArray11 = new boolean[Static85.aClass180_22.method4576()];
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIBII)V")
	public static void method1503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static154.anInt3271 == 1) {
			Static44.aClass52Array4[Static342.anInt6494 / 100].method4123(Static160.anInt3333 - 8, Static275.anInt5445 + -8);
		}
		if (Static154.anInt3271 == 2) {
			Static44.aClass52Array4[Static342.anInt6494 / 100 + 4].method4123(Static160.anInt3333 - 8, Static275.anInt5445 - 8);
		}
		Static287.method4747();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII)V")
	public static void method1504(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class7_Sub1_Sub15 local15 = Static315.method5104(4, arg0);
		local15.method4790();
		local15.anInt5692 = arg3;
		local15.anInt5687 = arg1;
		local15.anInt5696 = arg2;
	}
}
