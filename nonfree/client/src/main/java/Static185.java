import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!se", name = "w", descriptor = "I")
	public static int anInt4016;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "I")
	public static int anInt4011 = 0;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1376 = Static64.method1101("Versteckt");

	@OriginalMember(owner = "client!se", name = "q", descriptor = "I")
	public static int anInt4013 = 99;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "[I")
	public static int[] anIntArray302 = new int[500];

	@OriginalMember(owner = "client!se", name = "t", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1377 = Static64.method1101("cookieprefix");

	@OriginalMember(owner = "client!se", name = "v", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1378 = Static64.method1101("Angreifen");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZILclient!d;)V")
	public static void method3101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class27 arg3) {
		if (Static202.anInt4289 >= 400) {
			return;
		}
		if (arg3.anIntArray51 != null) {
			arg3 = arg3.method594();
		}
		if (arg3 == null || !arg3.aBoolean42) {
			return;
		}
		@Pc(31) Class51 local31 = arg3.aClass51_227;
		if (arg3.anInt808 != 0) {
			local31 = Static150.method2574(new Class51[] { local31, Static190.method3187(Static73.aClass5_Sub1_Sub1_1.anInt1941, arg3.anInt808), Static125.aClass51_1245, Static36.aClass51_245, Static27.method511(arg3.anInt808), Static92.aClass51_657 });
		}
		if (Static54.anInt1264 == 1) {
			Static151.method2611(Static150.method2574(new Class51[] { Static87.aClass51_640, Static49.aClass51_346, local31 }), Static25.aClass51_198, arg1, arg0, (short) 5, (long) arg2);
		} else if (!Static82.aBoolean82) {
			@Pc(122) Class51[] local122 = arg3.aClass51Array7;
			if (Static138.aBoolean138) {
				local122 = Static212.method3504(local122);
			}
			@Pc(132) int local132;
			if (local122 != null) {
				for (local132 = 4; local132 >= 0; local132--) {
					if (local122[local132] != null && (Static135.anInt3032 != 0 || !local122[local132].method1401(Static86.aClass51_637))) {
						@Pc(156) byte local156 = 0;
						if (local132 == 0) {
							local156 = 1;
						}
						if (local132 == 1) {
							local156 = 10;
						}
						if (local132 == 2) {
							local156 = 22;
						}
						if (local132 == 3) {
							local156 = 6;
						}
						if (local132 == 4) {
							local156 = 8;
						}
						Static151.method2611(Static150.method2574(new Class51[] { Static92.aClass51_659, local31 }), local122[local132], arg1, arg0, local156, (long) arg2);
					}
				}
			}
			if (Static135.anInt3032 == 0 && local122 != null) {
				for (local132 = 4; local132 >= 0; local132--) {
					if (local122[local132] != null && local122[local132].method1401(Static86.aClass51_637)) {
						@Pc(235) short local235 = 0;
						if (Static73.aClass5_Sub1_Sub1_1.anInt1941 < arg3.anInt808) {
							local235 = 2000;
						}
						@Pc(248) short local248 = 0;
						if (local132 == 0) {
							local248 = 1;
						}
						if (local132 == 1) {
							local248 = 10;
						}
						if (local132 == 2) {
							local248 = 22;
						}
						if (local132 == 3) {
							local248 = 6;
						}
						if (local132 == 4) {
							local248 = 8;
						}
						if (local248 != 0) {
							local248 += local235;
						}
						Static151.method2611(Static150.method2574(new Class51[] { Static92.aClass51_659, local31 }), local122[local132], arg1, arg0, local248, (long) arg2);
					}
				}
			}
			Static151.method2611(Static150.method2574(new Class51[] { Static92.aClass51_659, local31 }), Static168.aClass51_1282, arg1, arg0, (short) 1002, (long) arg2);
		} else if ((Static128.anInt4775 & 0x2) == 2) {
			Static151.method2611(Static150.method2574(new Class51[] { Static51.aClass51_374, Static49.aClass51_346, local31 }), Static87.aClass51_641, arg1, arg0, (short) 44, (long) arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZBI)V")
	public static void method3102(@OriginalArg(1) boolean arg0) {
		Static15.aBoolean12 = arg0;
		Static31.anInt702 = 22050;
		Static180.anInt3932 = 2;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method3103() {
		for (@Pc(7) int local7 = -1; local7 < Static118.anInt2542; local7++) {
			@Pc(14) int local14;
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static79.anIntArray111[local7];
			}
			@Pc(24) Class5_Sub1_Sub1 local24 = Static191.aClass5_Sub1_Sub1Array1[local14];
			if (local24 != null) {
				Static208.method3446(local24, local24.anInt3584);
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!mb;IIIIZI)V")
	public static void method3104(@OriginalArg(0) Class70 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static191.anInt4125 = arg2;
		Static4.anInt78 = 0;
		Static124.anInt4550 = arg1;
		Static21.aBoolean23 = false;
		Static198.anInt4222 = 1;
		Static3.aClass70_1 = arg0;
		Static93.anInt2065 = 2;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!k;)Lclient!bj;")
	public static Class15_Sub1 method3106(@OriginalArg(1) Class1_Sub16 arg0) {
		return new Class15_Sub1(arg0.method3817(), arg0.method3817(), arg0.method3817(), arg0.method3817(), arg0.method3817(), arg0.method3817(), arg0.method3817(), arg0.method3817(), arg0.method3806(), arg0.method3793());
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	public static void method3107(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		@Pc(21) Class1_Sub2_Sub8 local21 = (Class1_Sub2_Sub8) Static207.aClass102_21.method3093(local10);
		if (local21 != null) {
			Static2.aClass116_1.method3463(local21);
		}
	}
}
