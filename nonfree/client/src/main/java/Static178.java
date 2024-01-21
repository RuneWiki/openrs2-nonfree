import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
	public static int anInt3989;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
	public static int anInt3990 = 0;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1465 = Static177.method3050("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1466 = Static177.method3050("Passwort: ");

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!la;IILclient!ud;)V")
	public static void method3061(@OriginalArg(0) Class52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62_Sub1 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class11 local9 = Static166.aClass11_15;
		synchronized (Static166.aClass11_15) {
			for (@Pc(22) Class4_Sub19 local22 = (Class4_Sub19) Static166.aClass11_15.method274(); local22 != null; local22 = (Class4_Sub19) Static166.aClass11_15.method271()) {
				if ((long) arg1 == local22.aLong148 && arg0 == local22.aClass52_2 && local22.anInt3183 == 0) {
					local7 = local22.aByteArray37;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(75) byte[] local75 = arg0.method1893(arg1);
			arg2.method2886(true, local75, arg1, arg0);
		} else {
			arg2.method2886(true, local7, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	public static void method3062() {
		@Pc(1) Object local1 = Static124.anObject2;
		synchronized (Static124.anObject2) {
			if (Static28.anInt746 != 0) {
				Static28.anInt746 = 1;
				try {
					Static124.anObject2.wait();
				} catch (@Pc(11) InterruptedException local11) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!nh;I)Z")
	public static boolean method3063(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		@Pc(4) byte[] local4 = arg1.method2852(arg0);
		if (local4 == null) {
			return false;
		} else {
			Static117.method2131(local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BIILclient!ji;I)V")
	public static void method3064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub1_Sub11 arg2, @OriginalArg(4) int arg3) {
		if (Static3.anInt86 >= 400) {
			return;
		}
		if (arg2.anIntArray210 != null) {
			arg2 = arg2.method1742();
		}
		if (arg2 == null || !arg2.aBoolean98) {
			return;
		}
		@Pc(28) Class46 local28 = arg2.aClass46_827;
		if (arg2.anInt2263 != 0) {
			local28 = Static69.method1482(new Class46[] { local28, Static155.method2670(arg2.anInt2263, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2107), Static71.aClass46_715, Static119.aClass46_1070, Static127.method2240(arg2.anInt2263), Static1.aClass46_8 });
		}
		if (Static53.anInt1331 == 1) {
			Static40.method695((short) 47, arg3, (long) arg1, Static69.method1482(new Class46[] { Static1.aClass46_1, Static68.aClass46_707, local28 }), arg0, Static21.aClass46_188);
		} else if (!Static86.aBoolean97) {
			@Pc(114) Class46[] local114 = arg2.aClass46Array17;
			if (Static107.aBoolean115) {
				local114 = Static148.method2489(local114);
			}
			@Pc(124) int local124;
			if (local114 != null) {
				for (local124 = 4; local124 >= 0; local124--) {
					if (local114[local124] != null && (Static41.anInt1061 != 0 || !local114[local124].method1683(Static180.aClass46_1479))) {
						@Pc(145) byte local145 = 0;
						if (local124 == 0) {
							local145 = 19;
						}
						if (local124 == 1) {
							local145 = 18;
						}
						if (local124 == 2) {
							local145 = 48;
						}
						if (local124 == 3) {
							local145 = 10;
						}
						if (local124 == 4) {
							local145 = 40;
						}
						Static40.method695(local145, arg3, (long) arg1, Static69.method1482(new Class46[] { Static102.aClass46_941, local28 }), arg0, local114[local124]);
					}
				}
			}
			if (Static41.anInt1061 == 0 && local114 != null) {
				for (local124 = 4; local124 >= 0; local124--) {
					if (local114[local124] != null && local114[local124].method1683(Static180.aClass46_1479)) {
						@Pc(222) short local222 = 0;
						if (arg2.anInt2263 > Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2107) {
							local222 = 2000;
						}
						@Pc(239) short local239 = 0;
						if (local124 == 0) {
							local239 = 19;
						}
						if (local124 == 1) {
							local239 = 18;
						}
						if (local124 == 2) {
							local239 = 48;
						}
						if (local124 == 3) {
							local239 = 10;
						}
						if (local124 == 4) {
							local239 = 40;
						}
						if (local239 != 0) {
							local239 += local222;
						}
						Static40.method695(local239, arg3, (long) arg1, Static69.method1482(new Class46[] { Static102.aClass46_941, local28 }), arg0, local114[local124]);
					}
				}
			}
			Static40.method695((short) 1005, arg3, (long) arg1, Static69.method1482(new Class46[] { Static102.aClass46_941, local28 }), arg0, Static49.aClass46_485);
		} else if ((Static38.anInt1000 & 0x2) == 2) {
			Static40.method695((short) 1, arg3, (long) arg1, Static69.method1482(new Class46[] { Static30.aClass46_250, Static68.aClass46_707, local28 }), arg0, Static111.aClass46_1005);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)Z")
	public static boolean method3066(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}
}
