import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "Lclient!gd;")
	public static Class29_Sub1 aClass29_Sub1_8;

	@OriginalMember(owner = "client!ag", name = "V", descriptor = "Lclient!kh;")
	public static Class29 aClass29_6;

	@OriginalMember(owner = "client!ag", name = "mb", descriptor = "[Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array1;

	@OriginalMember(owner = "client!ag", name = "Z", descriptor = "Lclient!cd;")
	public static Class10 aClass10_126 = Static51.method932("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
	public static int anInt237 = 0;

	@OriginalMember(owner = "client!ag", name = "ib", descriptor = "[I")
	public static int[] anIntArray15 = new int[32768];

	@OriginalMember(owner = "client!ag", name = "ob", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ag", name = "pb", descriptor = "[[S")
	public static short[][] aShortArrayArray11 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V")
	public static void method156() {
		@Pc(9) int local9 = Static167.aClass2_Sub1_Sub4_Sub1_Sub1_4.method514(Static78.aClass10_339);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static46.anInt1135; local11++) {
			local19 = Static167.aClass2_Sub1_Sub4_Sub1_Sub1_4.method514(Static9.method163(local11));
			if (local9 < local19) {
				local9 = local19;
			}
		}
		Static119.aBoolean119 = true;
		Static167.anInt2027 = Static46.anInt1135 * 15 + 22;
		local9 += 8;
		@Pc(44) int local44 = Static62.anInt1534 - local9 / 2;
		if (local44 + local9 > 765) {
			local44 = 765 - local9;
		}
		local19 = Static46.anInt1135 * 15 + 21;
		if (local44 < 0) {
			local44 = 0;
		}
		Static159.anInt3393 = local9;
		@Pc(75) int local75 = Static40.anInt977;
		if (local75 + local19 > 503) {
			local75 = 503 - local19;
		}
		if (local75 < 0) {
			local75 = 0;
		}
		Static107.anInt2462 = local75;
		Static119.anInt2712 = local44;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)V")
	public static void method157(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static115.aBooleanArray13[arg0]) {
			return;
		}
		Static96.aClass29_71.method1037(arg0);
		if (Static90.aClass23ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static90.aClass23ArrayArray1[arg0].length; local28++) {
			if (Static90.aClass23ArrayArray1[arg0][local28] != null) {
				if (Static90.aClass23ArrayArray1[arg0][local28].anInt1090 == 2) {
					local26 = false;
				} else {
					Static90.aClass23ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static90.aClass23ArrayArray1[arg0] = null;
		}
		Static115.aBooleanArray13[arg0] = false;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BJ)V")
	public static void method158(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static141.aClass2_Sub11_Sub1_3.method1495(190);
			Static141.aClass2_Sub11_Sub1_3.method1458(arg0);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)Lclient!cd;")
	public static Class10 method159(@OriginalArg(1) int arg0) {
		@Pc(5) Class10 local5 = Static164.method2485(arg0);
		for (@Pc(20) int local20 = local5.method340() - 3; local20 > 0; local20 -= 3) {
			local5 = Static3.method36(new Class10[] { local5.method353(0, local20), Static100.aClass10_1012, local5.method333(local20) });
		}
		if (local5.method340() > 9) {
			return Static3.method36(new Class10[] { Static1.aClass10_2, local5.method353(0, local5.method340() - 8), Static63.aClass10_682, Static52.aClass10_568, local5, Static142.aClass10_1393 });
		} else if (local5.method340() > 6) {
			return Static3.method36(new Class10[] { Static19.aClass10_230, local5.method353(0, local5.method340() - 4), Static65.aClass10_692, Static52.aClass10_568, local5, Static142.aClass10_1393 });
		} else {
			return Static3.method36(new Class10[] { Static167.aClass10_867, local5, Static140.aClass10_1367 });
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ[Lclient!fa;)V")
	public static void method160(@OriginalArg(0) int arg0, @OriginalArg(2) Class23[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) Class23 local14 = arg1[local8];
			if (local14 != null && local14.anInt1045 == arg0 && (!local14.aBoolean37 || !Static86.method1370(local14))) {
				if (local14.anInt1090 == 0) {
					if (!local14.aBoolean37 && Static86.method1370(local14) && Static59.aClass23_4 != local14) {
						continue;
					}
					method160(local14.anInt1057, arg1);
					if (local14.aClass23Array1 != null) {
						method160(local14.anInt1057, local14.aClass23Array1);
					}
					@Pc(66) Class2_Sub15 local66 = (Class2_Sub15) Static30.aClass18_2.method683((long) local14.anInt1057);
					if (local66 != null) {
						Static70.method1184(local66.anInt2387);
					}
				}
				if (local14.anInt1090 == 6) {
					@Pc(93) int local93;
					if (local14.anInt1069 != -1 || local14.anInt1043 != -1) {
						@Pc(88) boolean local88 = Static88.method1023(local14);
						if (local88) {
							local93 = local14.anInt1043;
						} else {
							local93 = local14.anInt1069;
						}
						if (local93 != -1) {
							@Pc(106) Class2_Sub1_Sub9 local106 = Static19.method325(local93);
							local14.anInt1098 += Static123.anInt2778;
							while (local14.anInt1098 > local106.anIntArray217[local14.anInt1062]) {
								local14.anInt1098 -= local106.anIntArray217[local14.anInt1062];
								local14.anInt1062++;
								if (local106.anIntArray214.length <= local14.anInt1062) {
									local14.anInt1062 -= local106.anInt1929;
									if (local14.anInt1062 < 0 || local14.anInt1062 >= local106.anIntArray214.length) {
										local14.anInt1062 = 0;
									}
								}
								Static3.method34(local14);
							}
						}
					}
					if (local14.anInt1059 != 0 && !local14.aBoolean37) {
						local93 = local14.anInt1059 << 16 >> 16;
						@Pc(195) int local195 = local14.anInt1059 >> 16;
						local93 *= Static123.anInt2778;
						local14.anInt1044 = local93 + local14.anInt1044 & 0x7FF;
						@Pc(211) int local211 = local195 * Static123.anInt2778;
						local14.anInt1058 = local14.anInt1058 + local211 & 0x7FF;
						Static3.method34(local14);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V")
	public static void method162() {
		aShortArrayArray11 = null;
		aClass29_Sub1_8 = null;
		anIntArray15 = null;
		aClass29_6 = null;
		aClass10_126 = null;
		aClass2_Sub1_Sub4_Sub2Array1 = null;
	}
}
