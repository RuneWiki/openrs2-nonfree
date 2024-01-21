import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "[[Lclient!fd;")
	public static Class1_Sub9[][] aClass1_Sub9ArrayArray1;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "Lclient!hf;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
	public static int anInt1170;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "Lclient!fd;")
	public static Class1_Sub9 aClass1_Sub9_8;

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "Lclient!id;")
	private static Class34 aClass34_554 = Static9.method266("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "Lclient!id;")
	public static Class34 aClass34_551 = aClass34_554;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "Lclient!id;")
	public static Class34 aClass34_552 = Static9.method266("titlebox");

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "Lclient!id;")
	private static Class34 aClass34_553 = Static9.method266("M");

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "[I")
	public static int[] anIntArray117 = new int[] { 39, 35, 15, 13, 51, 29, 7, 32 };

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
	public static volatile int anInt1172 = 0;

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "Lclient!id;")
	public static Class34 aClass34_555 = aClass34_553;

	@OriginalMember(owner = "client!gb", name = "Q", descriptor = "Lclient!id;")
	public static Class34 aClass34_556 = aClass34_553;

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "J")
	public static long aLong68 = 0L;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)V")
	public static void method695(@OriginalArg(1) int arg0) {
		if (arg0 == Static44.anInt1247) {
			return;
		}
		if (Static44.anInt1247 == 0) {
			Static110.method1680();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static46.anInt1326 = 0;
			Static50.anInt1470 = 0;
			Static38.anInt1131 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static128.aClass51_4 != null) {
			Static128.aClass51_4.method1361();
			Static128.aClass51_4 = null;
		}
		if (Static44.anInt1247 == 25) {
			Static116.anInt2802 = 0;
			Static89.anInt1975 = 0;
			Static124.anInt2987 = 0;
			Static11.anInt490 = 1;
			Static101.anInt2546 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static119.method1880(Static128.aClass35_Sub1_28, Static51.aClass35_Sub1_13, Static7.aCanvas1);
		} else {
			Static16.method379();
		}
		Static44.anInt1247 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
	public static void method696() {
		aClass34_553 = null;
		anIntArray117 = null;
		aClass30_1 = null;
		aClass34_555 = null;
		aClass34_554 = null;
		aClass34_552 = null;
		aClass1_Sub9ArrayArray1 = null;
		aClass1_Sub9_8 = null;
		aClass34_556 = null;
		aClass34_551 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIBI)V")
	public static void method697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub9 local8 = Static133.method2109(arg2, arg0);
		if (local8 != null && local8.anObjectArray10 != null) {
			@Pc(17) Class1_Sub5 local17 = new Class1_Sub5();
			local17.anObjectArray1 = local8.anObjectArray10;
			local17.aClass1_Sub9_3 = local8;
			Static56.method1567(local17);
		}
		Static115.anInt2779 = arg0;
		Static1.aBoolean14 = true;
		Static5.anInt362 = arg1;
		Static8.anInt436 = arg2;
		Static10.method277(local8);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!fd;I)Z")
	public static boolean method698(@OriginalArg(0) Class1_Sub9 arg0) {
		if (Static36.aBoolean60) {
			if (Static84.method1448(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1013 == 0) {
				return false;
			}
		}
		return arg0.aBoolean63;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!wa;II)V")
	public static void method699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub17 arg2, @OriginalArg(3) int arg3) {
		if (Static71.anInt1876 >= 400) {
			return;
		}
		if (arg2.anIntArray375 != null) {
			arg2 = arg2.method2010();
		}
		if (arg2 == null || !arg2.aBoolean182) {
			return;
		}
		@Pc(31) Class34 local31 = arg2.aClass34_1561;
		if (arg2.anInt3065 != 0) {
			local31 = Static91.method1554(new Class34[] { local31, Static16.method380(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt253, arg2.anInt3065), Static109.aClass34_1580, Static102.aClass34_1288, Static85.method1456(arg2.anInt3065), Static11.aClass34_250 });
		}
		if (Static130.anInt1509 == 1) {
			Static73.method1286(arg3, 16, Static91.method1554(new Class34[] { Static74.aClass34_1001, Static120.aClass34_1471, local31 }), arg1, arg0, Static72.aClass34_922);
		} else if (!Static1.aBoolean14) {
			@Pc(88) Class34[] local88 = arg2.aClass34Array25;
			if (Static11.aBoolean25) {
				local88 = Static17.method385(local88);
			}
			@Pc(100) int local100;
			if (local88 != null) {
				for (local100 = 4; local100 >= 0; local100--) {
					if (local88[local100] != null && !local88[local100].method961(Static7.aClass34_213)) {
						@Pc(115) byte local115 = 0;
						if (local100 == 0) {
							local115 = 22;
						}
						if (local100 == 1) {
							local115 = 8;
						}
						if (local100 == 2) {
							local115 = 14;
						}
						if (local100 == 3) {
							local115 = 10;
						}
						if (local100 == 4) {
							local115 = 3;
						}
						Static73.method1286(arg3, local115, Static91.method1554(new Class34[] { Static31.aClass34_451, local31 }), arg1, arg0, local88[local100]);
					}
				}
			}
			if (local88 != null) {
				for (local100 = 4; local100 >= 0; local100--) {
					if (local88[local100] != null && local88[local100].method961(Static7.aClass34_213)) {
						@Pc(199) short local199 = 0;
						if (arg2.anInt3065 > Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt253) {
							local199 = 2000;
						}
						@Pc(212) int local212 = 0;
						if (local100 == 0) {
							local212 = local199 + 22;
						}
						if (local100 == 1) {
							local212 = local199 + 8;
						}
						if (local100 == 2) {
							local212 = local199 + 14;
						}
						if (local100 == 3) {
							local212 = local199 + 10;
						}
						if (local100 == 4) {
							local212 = local199 + 3;
						}
						Static73.method1286(arg3, local212, Static91.method1554(new Class34[] { Static31.aClass34_451, local31 }), arg1, arg0, local88[local100]);
					}
				}
			}
			Static73.method1286(arg3, 1002, Static91.method1554(new Class34[] { Static31.aClass34_451, local31 }), arg1, arg0, Static128.aClass34_1545);
			return;
		} else if ((Static5.anInt362 & 0x2) == 2) {
			Static73.method1286(arg3, 33, Static91.method1554(new Class34[] { Static51.aClass34_719, Static120.aClass34_1471, local31 }), arg1, arg0, Static32.aClass34_700);
			return;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method700() {
		for (@Pc(12) int local12 = 0; local12 < Static32.anInt1453; local12++) {
			@Pc(18) int local18 = Static17.anIntArray65[local12];
			@Pc(22) Class1_Sub1_Sub1_Sub1_Sub1 local22 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local18];
			@Pc(26) int local26 = Static51.aClass1_Sub19_Sub1_4.method2072();
			if ((local26 & 0x10) != 0) {
				local26 += Static51.aClass1_Sub19_Sub1_4.method2072() << 8;
			}
			Static126.method1986(local22, local26, local18);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)I")
	public static int method701(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}
}
