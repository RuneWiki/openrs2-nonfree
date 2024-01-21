import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!i", name = "i", descriptor = "Lclient!hb;")
	public static Class27 aClass27_2;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "I")
	public static int anInt1090;

	@OriginalMember(owner = "client!i", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!i", name = "y", descriptor = "[B")
	public static byte[] aByteArray4;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	public static int anInt1085 = 0;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!va;")
	public static Class61 aClass61_450 = Static88.method1421("headicons_prayer");

	@OriginalMember(owner = "client!i", name = "C", descriptor = "Lclient!va;")
	private static Class61 aClass61_458 = Static88.method1421("Checking for updates )2 ");

	@OriginalMember(owner = "client!i", name = "k", descriptor = "Lclient!va;")
	public static Class61 aClass61_451 = aClass61_458;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "Z")
	public static volatile boolean aBoolean51 = true;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!va;")
	private static Class61 aClass61_452 = Static88.method1421("This computers address has been blocked");

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!va;")
	public static Class61 aClass61_453 = Static88.method1421("Side panel redrawn");

	@OriginalMember(owner = "client!i", name = "v", descriptor = "Lclient!va;")
	private static Class61 aClass61_455 = Static88.method1421("Loaded config");

	@OriginalMember(owner = "client!i", name = "r", descriptor = "Lclient!va;")
	public static Class61 aClass61_454 = aClass61_455;

	@OriginalMember(owner = "client!i", name = "z", descriptor = "Lclient!va;")
	public static Class61 aClass61_456 = aClass61_452;

	@OriginalMember(owner = "client!i", name = "B", descriptor = "Lclient!va;")
	public static Class61 aClass61_457 = Static88.method1421("backhmid1");

	@OriginalMember(owner = "client!i", name = "D", descriptor = "Lclient!va;")
	public static Class61 aClass61_459 = Static88.method1421("backleft1");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!d;I)Z")
	public static boolean method641(@OriginalArg(0) Class10_Sub1_Sub4 arg0) {
		if (arg0.anIntArray66 == null) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < arg0.anIntArray66.length; local20++) {
			@Pc(27) int local27 = Static4.method30(arg0, local20);
			@Pc(32) int local32 = arg0.anIntArray62[local20];
			if (arg0.anIntArray66[local20] == 2) {
				if (local27 >= local32) {
					return false;
				}
			} else if (arg0.anIntArray66[local20] == 3) {
				if (local32 >= local27) {
					return false;
				}
			} else if (arg0.anIntArray66[local20] == 4) {
				if (local27 == local32) {
					return false;
				}
			} else if (local32 != local27) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)V")
	public static void method642(@OriginalArg(0) boolean arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static34.anInt1005; local15++) {
			@Pc(23) Class10_Sub1_Sub5_Sub2_Sub1 local23 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[Static1.anIntArray3[local15]];
			@Pc(32) int local32 = (Static1.anIntArray3[local15] << 14) + 536870912;
			if (local23 != null && local23.method927() && arg0 == local23.aClass10_Sub1_Sub3_1.aBoolean15 && local23.aClass10_Sub1_Sub3_1.method276()) {
				@Pc(53) int local53 = local23.anInt1654 >> 7;
				@Pc(58) int local58 = local23.anInt1649 >> 7;
				if (local53 >= 0 && local53 < 104 && local58 >= 0 && local58 < 104) {
					if (local23.anInt1681 == 1 && (local23.anInt1654 & 0x7F) == 64 && (local23.anInt1649 & 0x7F) == 64) {
						if (Static101.anInt2558 == Static51.anIntArrayArray12[local53][local58]) {
							continue;
						}
						Static51.anIntArrayArray12[local53][local58] = Static101.anInt2558;
					}
					if (!local23.aClass10_Sub1_Sub3_1.aBoolean14) {
						local32 += Integer.MIN_VALUE;
					}
					Static48.aClass54_1.method1354(Static101.anInt2582, local23.anInt1654, local23.anInt1649, Static39.method230((local23.anInt1681 - 1) * 64 + local23.anInt1654, Static101.anInt2582, local23.anInt1649 + (local23.anInt1681 - 1) * 64), (local23.anInt1681 - 1) * 64 + 60, local23, local23.anInt1646, local32, local23.aBoolean80);
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!cc;IIIB)V")
	public static void method643(@OriginalArg(0) Class10_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static23.anInt747 >= 400) {
			return;
		}
		if (arg0.anIntArray48 != null) {
			arg0 = arg0.method278();
		}
		if (arg0 == null || !arg0.aBoolean14) {
			return;
		}
		@Pc(26) Class61 local26 = arg0.aClass61_107;
		if (arg0.anInt390 != 0) {
			local26 = Static93.method1156(new Class61[] { local26, Static39.method228(arg0.anInt390, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1702), Static69.aClass61_749, Static25.aClass61_301, Static29.method529(arg0.anInt390), Static54.aClass61_614 });
		}
		if (Static94.anInt2408 == 1) {
			Static107.method1502(arg3, arg2, 1, arg1, Static93.method1156(new Class61[] { Static101.aClass61_1035, Static24.aClass61_925, Static37.aClass61_435, Static99.aClass61_1031, local26 }));
		} else if (Static20.anInt2651 != 1) {
			@Pc(152) Class61[] local152 = arg0.aClass61Array3;
			if (Static19.aBoolean32) {
				local152 = method645(local152);
			}
			@Pc(166) int local166;
			if (local152 != null) {
				for (local166 = 4; local166 >= 0; local166--) {
					if (local152[local166] != null && !local152[local166].method1594(Static37.aClass61_425)) {
						@Pc(185) byte local185 = 0;
						if (local166 == 0) {
							local185 = 45;
						}
						if (local166 == 1) {
							local185 = 9;
						}
						if (local166 == 2) {
							local185 = 41;
						}
						if (local166 == 3) {
							local185 = 39;
						}
						if (local166 == 4) {
							local185 = 33;
						}
						Static107.method1502(arg3, arg2, local185, arg1, Static93.method1156(new Class61[] { local152[local166], Static63.aClass61_176, local26 }));
					}
				}
			}
			if (local152 != null) {
				for (local166 = 4; local166 >= 0; local166--) {
					if (local152[local166] != null && local152[local166].method1594(Static37.aClass61_425)) {
						@Pc(268) short local268 = 0;
						@Pc(270) int local270 = 0;
						if (Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1702 < arg0.anInt390) {
							local268 = 2000;
						}
						if (local166 == 0) {
							local270 = local268 + 45;
						}
						if (local166 == 1) {
							local270 = local268 + 9;
						}
						if (local166 == 2) {
							local270 = local268 + 41;
						}
						if (local166 == 3) {
							local270 = local268 + 39;
						}
						if (local166 == 4) {
							local270 = local268 + 33;
						}
						Static107.method1502(arg3, arg2, local270, arg1, Static93.method1156(new Class61[] { local152[local166], Static63.aClass61_176, local26 }));
					}
				}
			}
			Static107.method1502(arg3, arg2, 1003, arg1, Static93.method1156(new Class61[] { Static54.aClass61_616, Static63.aClass61_176, local26 }));
		} else if ((Static88.anInt2310 & 0x2) == 2) {
			Static107.method1502(arg3, arg2, 50, arg1, Static93.method1156(new Class61[] { Static49.aClass61_568, Static99.aClass61_1031, local26 }));
			return;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[Lclient!va;)[Lclient!va;")
	public static Class61[] method645(@OriginalArg(1) Class61[] arg0) {
		@Pc(8) Class61[] local8 = new Class61[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local8[local18] = Static93.method1156(new Class61[] { Static29.method529(local18), Static79.aClass61_855 });
			if (arg0 != null && arg0[local18] != null) {
				local8[local18] = Static93.method1156(new Class61[] { local8[local18], arg0[local18] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)Lclient!na;")
	public static Class10_Sub1_Sub11 method647(@OriginalArg(1) int arg0) {
		@Pc(15) Class10_Sub1_Sub11 local15 = (Class10_Sub1_Sub11) Static104.aClass29_74.method644((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static100.aClass11_64.method203(14, arg0);
		local15 = new Class10_Sub1_Sub11();
		if (local25 != null) {
			local15.method943(new Class10_Sub10(local25));
		}
		Static104.aClass29_74.method649(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method648() {
		if (Static31.aBoolean43 && Static101.anInt2582 != Static61.anInt1599) {
			Static80.method1257(Static101.anInt2582, Static50.anInt1408, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], Static82.anInt2199, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
		} else if (Static101.anInt2582 != Static19.anInt624) {
			Static19.anInt624 = Static101.anInt2582;
			Static8.method171(Static101.anInt2582);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IBLclient!bc;I)V")
	public static void method650(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(16) int local16 = Static57.anInt1509 + Static79.anInt2144 & 0x7FF;
		@Pc(25) int local25 = arg0 * arg0 + arg2 * arg2;
		if (local25 > 6400) {
			return;
		}
		@Pc(35) int local35 = Static84.anIntArray280[local16];
		@Pc(43) int local43 = local35 * 256 / (Static25.anInt776 + 256);
		@Pc(47) int local47 = Static84.anIntArray281[local16];
		@Pc(55) int local55 = local47 * 256 / (Static25.anInt776 + 256);
		@Pc(66) int local66 = arg2 * local55 - arg0 * local43 >> 16;
		@Pc(76) int local76 = arg0 * local55 + arg2 * local43 >> 16;
		if (local25 > 2500) {
			arg1.method143(Static102.aClass10_Sub1_Sub1_Sub2_25, local76 + 4 + 94 - arg1.anInt174 / 2, -(arg1.anInt176 / 2) + -4 + 83 + -local66);
		} else {
			arg1.method142(local76 + 98 - arg1.anInt174 / 2, -local66 + -4 + 83 + -(arg1.anInt176 / 2));
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method651() {
		aClass61_453 = null;
		aByteArrayArrayArray7 = null;
		aClass61_450 = null;
		aClass61_458 = null;
		aClass61_457 = null;
		aByteArray4 = null;
		aClass61_452 = null;
		aClass61_455 = null;
		aClass27_2 = null;
		aClass61_451 = null;
		aClass61_459 = null;
		aClass61_456 = null;
		aClass61_454 = null;
	}
}
