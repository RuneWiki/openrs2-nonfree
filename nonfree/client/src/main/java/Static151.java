import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!q", name = "X", descriptor = "Z")
	public static boolean aBoolean177;

	@OriginalMember(owner = "client!q", name = "Z", descriptor = "Lclient!ab;")
	public static Class3 aClass3_27;

	@OriginalMember(owner = "client!q", name = "db", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1468 = Static187.method3089("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!q", name = "eb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1469 = Static187.method3089("(U(Y");

	@OriginalMember(owner = "client!q", name = "hb", descriptor = "Z")
	public static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZBLclient!bj;)V")
	public static void method2294(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub4 arg1) {
		@Pc(2) int local2 = arg1.anInt490;
		@Pc(10) int local10 = (int) arg1.aLong251;
		arg1.method3414();
		if (arg0) {
			Static172.method2717(local2);
		}
		Static201.method3328(local2);
		@Pc(25) Class11 local25 = Static9.method2342(local10);
		if (local25 != null) {
			Static73.method1118(local25);
		}
		Static152.anInt3135 = 0;
		Static35.aBoolean61 = false;
		Static70.method1085(Static192.anInt4179, Static31.anInt737, Static170.anInt3552, Static196.anInt4260);
		if (Static22.anInt555 != -1) {
			Static7.method125(Static22.anInt555, 1);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!ge;I)V")
	public static void method2296(@OriginalArg(0) Class8_Sub3 arg0) {
		arg0.aBoolean200 = false;
		@Pc(23) Class1_Sub3_Sub20 local23;
		if (arg0.anInt3616 != -1) {
			local23 = Static84.method1279(arg0.anInt3616);
			if (local23 == null || local23.anIntArray300 == null) {
				arg0.anInt3616 = -1;
			} else {
				arg0.anInt3586++;
				if (local23.anIntArray300.length > arg0.anInt3566 && local23.anIntArray298[arg0.anInt3566] < arg0.anInt3586) {
					arg0.anInt3566++;
					arg0.anInt3586 = 1;
					Static109.method1646(local23, arg0.anInt3566, arg0 == Static15.aClass8_Sub3_Sub1_1, arg0.anInt3600, arg0.anInt3606);
				}
				if (arg0.anInt3566 >= local23.anIntArray300.length) {
					arg0.anInt3586 = 0;
					arg0.anInt3566 = 0;
					Static109.method1646(local23, arg0.anInt3566, Static15.aClass8_Sub3_Sub1_1 == arg0, arg0.anInt3600, arg0.anInt3606);
				}
			}
		}
		if (arg0.anInt3564 != -1 && Static155.anInt2981 >= arg0.anInt3579) {
			if (arg0.anInt3608 < 0) {
				arg0.anInt3608 = 0;
			}
			@Pc(136) int local136 = Static116.method1724(arg0.anInt3564).anInt1908;
			if (local136 == -1) {
				arg0.anInt3564 = -1;
			} else {
				@Pc(148) Class1_Sub3_Sub20 local148 = Static84.method1279(local136);
				if (local148 == null || local148.anIntArray300 == null) {
					arg0.anInt3564 = -1;
				} else {
					arg0.anInt3619++;
					if (local148.anIntArray300.length > arg0.anInt3608 && arg0.anInt3619 > local148.anIntArray298[arg0.anInt3608]) {
						arg0.anInt3619 = 1;
						arg0.anInt3608++;
						Static109.method1646(local148, arg0.anInt3608, Static15.aClass8_Sub3_Sub1_1 == arg0, arg0.anInt3600, arg0.anInt3606);
					}
					if (arg0.anInt3608 >= local148.anIntArray300.length) {
						arg0.anInt3564 = -1;
					}
				}
			}
		}
		if (arg0.anInt3575 != -1 && arg0.anInt3589 <= 1) {
			local23 = Static84.method1279(arg0.anInt3575);
			if (local23.anInt3387 == 1 && arg0.anInt3609 > 0 && Static155.anInt2981 >= arg0.anInt3613 && Static155.anInt2981 > arg0.anInt3593) {
				arg0.anInt3589 = 1;
				return;
			}
		}
		if (arg0.anInt3575 != -1 && arg0.anInt3589 == 0) {
			local23 = Static84.method1279(arg0.anInt3575);
			if (local23 == null || local23.anIntArray300 == null) {
				arg0.anInt3575 = -1;
			} else {
				arg0.anInt3605++;
				if (local23.anIntArray300.length > arg0.anInt3570 && arg0.anInt3605 > local23.anIntArray298[arg0.anInt3570]) {
					arg0.anInt3605 = 1;
					arg0.anInt3570++;
					Static109.method1646(local23, arg0.anInt3570, arg0 == Static15.aClass8_Sub3_Sub1_1, arg0.anInt3600, arg0.anInt3606);
				}
				if (arg0.anInt3570 >= local23.anIntArray300.length) {
					arg0.anInt3620++;
					arg0.anInt3570 -= local23.anInt3390;
					if (local23.anInt3389 <= arg0.anInt3620) {
						arg0.anInt3575 = -1;
					} else if (arg0.anInt3570 >= 0 && local23.anIntArray300.length > arg0.anInt3570) {
						Static109.method1646(local23, arg0.anInt3570, arg0 == Static15.aClass8_Sub3_Sub1_1, arg0.anInt3600, arg0.anInt3606);
					} else {
						arg0.anInt3575 = -1;
					}
				}
				arg0.aBoolean200 = local23.aBoolean190;
			}
		}
		if (arg0.anInt3589 > 0) {
			arg0.anInt3589--;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIBLclient!de;I)V")
	public static void method2298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8_Sub3_Sub1 arg2, @OriginalArg(4) int arg3) {
		if (arg2 == Static15.aClass8_Sub3_Sub1_1 || Static152.anInt3135 >= 400) {
			return;
		}
		@Pc(56) Class92 local56;
		if (arg2.anInt982 == 0) {
			local56 = Static208.method787(new Class92[] { arg2.aClass92_374, Static178.method2909(Static15.aClass8_Sub3_Sub1_1.anInt975, arg2.anInt975), Static138.aClass92_1348, Static17.aClass92_1689, Static49.method872(arg2.anInt975), Static167.aClass92_1685 });
		} else {
			local56 = Static208.method787(new Class92[] { arg2.aClass92_374, Static138.aClass92_1348, Static187.aClass92_1916, Static49.method872(arg2.anInt982), Static167.aClass92_1685 });
		}
		@Pc(126) int local126;
		if (Static189.anInt4128 == 1) {
			Static116.method1722((long) arg3, Static208.method787(new Class92[] { Static186.aClass92_1900, Static68.aClass92_627, local56 }), arg1, arg0, (short) 5, Static140.aClass92_1352);
		} else if (!Static72.aBoolean100) {
			for (local126 = 7; local126 >= 0; local126--) {
				if (Static145.aClass92Array20[local126] != null) {
					@Pc(138) short local138 = 0;
					if (Static63.anInt3580 == 0 && Static145.aClass92Array20[local126].method3241(Static159.aClass92_1614)) {
						if (Static15.aClass8_Sub3_Sub1_1.anInt975 < arg2.anInt975) {
							local138 = 2000;
						}
						if (Static15.aClass8_Sub3_Sub1_1.anInt986 != 0 && arg2.anInt986 != 0) {
							if (arg2.anInt986 == Static15.aClass8_Sub3_Sub1_1.anInt986) {
								local138 = 2000;
							} else {
								local138 = 0;
							}
						}
					} else if (Static192.aBooleanArray17[local126]) {
						local138 = 2000;
					}
					@Pc(195) short local195 = Static113.aShortArray20[local126];
					@Pc(200) short local200 = (short) (local195 + local138);
					Static116.method1722((long) arg3, Static208.method787(new Class92[] { Static89.aClass92_833, local56 }), arg1, arg0, local200, Static145.aClass92Array20[local126]);
				}
			}
		} else if ((Static19.anInt529 & 0x8) == 8) {
			Static116.method1722((long) arg3, Static208.method787(new Class92[] { Static15.aClass92_135, Static68.aClass92_627, local56 }), arg1, arg0, (short) 57, Static48.aClass92_516);
		}
		for (local126 = 0; local126 < Static152.anInt3135; local126++) {
			if (Static120.aShortArray21[local126] == 4) {
				Static65.aClass92Array9[local126] = Static208.method787(new Class92[] { Static89.aClass92_833, local56 });
				return;
			}
		}
	}
}
