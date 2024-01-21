import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!te", name = "I", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1563 = Static32.method683("Standort");

	@OriginalMember(owner = "client!te", name = "J", descriptor = "I")
	public static int anInt3451 = -1;

	@OriginalMember(owner = "client!te", name = "M", descriptor = "I")
	public static int anInt3454 = 0;

	@OriginalMember(owner = "client!te", name = "N", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1564 = Static32.method683("Please enter your username)3");

	@OriginalMember(owner = "client!te", name = "P", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1565 = aClass49_1564;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ua;B)V")
	public static void method2675(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static118.aBoolean110) {
			Static59.method988(arg0);
			return;
		}
		if (Static63.anInt1351 == 1 && Static114.anInt2394 >= 715 && Static61.anInt1320 >= 453) {
			Static43.aBoolean37 = !Static43.aBoolean37;
			if (Static43.aBoolean37) {
				Static127.method2155();
			} else {
				Static23.method427(Static121.aClass49_1163, Static129.aClass49_1268, Static91.aClass11_Sub1_23);
			}
		}
		if (Static95.anInt2009 == 5) {
			return;
		}
		Static141.anInt3005++;
		if (Static95.anInt2009 != 10) {
			return;
		}
		if (Static177.anInt3895 != 2 && Static45.anInt1056 == 0) {
			if (Static63.anInt1351 == 1 && Static114.anInt2394 >= 5 && Static114.anInt2394 <= 105 && Static61.anInt1320 >= 463 && Static61.anInt1320 <= 498) {
				Static36.method756();
				return;
			}
			if (Static105.aClass40_1 != null) {
				Static36.method756();
			}
		}
		@Pc(120) int local120 = Static114.anInt2394;
		@Pc(122) int local122 = Static63.anInt1351;
		@Pc(124) int local124 = Static61.anInt1320;
		if (Static96.anInt2050 == 0) {
			@Pc(502) boolean local502 = false;
			if (local122 == 1 && local120 >= 227 && local120 <= 377 && local124 >= 271 && local124 <= 311) {
				Static130.anInt3790 = 0;
				Static96.anInt2050 = 3;
			}
			if (Static27.anInt594 != 0) {
				while (Static92.method1585()) {
					if (Static180.anInt3987 == 84) {
						local502 = true;
						break;
					}
				}
			}
			if (local502 || local122 == 1 && local120 >= 387 && local120 <= 537 && local124 >= 271 && local124 <= 311) {
				Static129.aClass49_1267 = Static13.aClass49_157;
				Static130.anInt3790 = 0;
				Static96.anInt2050 = 2;
				Static129.aClass49_1274 = Static134.aClass49_1313;
				Static129.aClass49_1275 = Static13.aClass49_131;
			}
			return;
		}
		if (Static96.anInt2050 == 2) {
			@Pc(131) short local131 = 231;
			@Pc(132) int local132 = local131 + 30;
			if (local122 == 1 && local124 >= 246 && local124 < 261) {
				Static130.anInt3790 = 0;
			}
			local132 += 15;
			if (local122 == 1 && local124 >= 261 && local124 < 276) {
				Static130.anInt3790 = 1;
			}
			local132 += 15;
			if (local122 == 1 && local120 >= 227 && local120 <= 377 && local124 >= 301 && local124 <= 341) {
				Static129.aClass49_1264 = Static129.aClass49_1264.method1664().method1677();
				if (Static129.aClass49_1264.method1653() == 0) {
					Static61.method1068(Static13.aClass49_122, aClass49_1565, Static13.aClass49_141);
					return;
				}
				if (Static129.aClass49_1276.method1653() == 0) {
					Static61.method1068(Static13.aClass49_125, Static152.aClass49_1479, Static13.aClass49_119);
					return;
				}
				Static61.method1068(Static13.aClass49_128, Static174.aClass49_1695, Static13.aClass49_154);
				Static33.method691(20);
				return;
			}
			if (local122 == 1 && local120 >= 387 && local120 <= 537 && local124 >= 301 && local124 <= 341) {
				Static129.aClass49_1264 = Static129.aClass49_1268;
				Static96.anInt2050 = 0;
				Static129.aClass49_1276 = Static129.aClass49_1268;
			}
			while (true) {
				while (Static92.method1585()) {
					@Pc(284) boolean local284 = false;
					for (@Pc(286) int local286 = 0; local286 < Static78.aClass49_840.method1653(); local286++) {
						if (Static72.anInt1492 == Static78.aClass49_840.method1646(local286)) {
							local284 = true;
							break;
						}
					}
					if (Static130.anInt3790 == 0) {
						if (Static180.anInt3987 == 85 && Static129.aClass49_1264.method1653() > 0) {
							Static129.aClass49_1264 = Static129.aClass49_1264.method1661(Static129.aClass49_1264.method1653() - 1, 0);
						}
						if (Static180.anInt3987 == 84 || Static180.anInt3987 == 80) {
							Static130.anInt3790 = 1;
						}
						if (local284 && Static129.aClass49_1264.method1653() < 12) {
							Static129.aClass49_1264 = Static129.aClass49_1264.method1667(Static72.anInt1492);
						}
					} else if (Static130.anInt3790 == 1) {
						if (Static180.anInt3987 == 85 && Static129.aClass49_1276.method1653() > 0) {
							Static129.aClass49_1276 = Static129.aClass49_1276.method1661(Static129.aClass49_1276.method1653() - 1, 0);
						}
						if (Static180.anInt3987 == 84 || Static180.anInt3987 == 80) {
							Static130.anInt3790 = 0;
						}
						if (Static27.anInt594 != 0 && Static180.anInt3987 == 84) {
							Static129.aClass49_1264 = Static129.aClass49_1264.method1664().method1677();
							if (Static129.aClass49_1264.method1653() == 0) {
								Static61.method1068(Static13.aClass49_122, aClass49_1565, Static13.aClass49_141);
								return;
							}
							if (Static129.aClass49_1276.method1653() == 0) {
								Static61.method1068(Static13.aClass49_125, Static152.aClass49_1479, Static13.aClass49_119);
								return;
							}
							Static61.method1068(Static13.aClass49_128, Static174.aClass49_1695, Static13.aClass49_154);
							Static33.method691(20);
							return;
						}
						if (local284 && Static129.aClass49_1276.method1653() < 20) {
							Static129.aClass49_1276 = Static129.aClass49_1276.method1667(Static72.anInt1492);
						}
					}
				}
				return;
			}
		}
		if (Static96.anInt2050 == 3 && local122 == 1 && local120 >= 307 && local120 <= 457 && local124 >= 301 && local124 <= 341) {
			Static96.anInt2050 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!uc;)V")
	public static void method2676(@OriginalArg(1) Class2_Sub2_Sub3_Sub7 arg0) {
		if (Static127.anInt2757 == arg0.anInt3533 || arg0.anInt3568 == -1 || arg0.anInt3548 != 0 || arg0.anInt3566 + 1 > Static29.method543(arg0.anInt3568).anIntArray36[arg0.anInt3538]) {
			@Pc(41) int local41 = arg0.anInt3533 - arg0.anInt3526;
			@Pc(47) int local47 = Static127.anInt2757 - arg0.anInt3526;
			@Pc(57) int local57 = arg0.anInt3576 * 128 + arg0.anInt3581 * 64;
			@Pc(67) int local67 = arg0.anInt3581 * 64 + arg0.anInt3532 * 128;
			@Pc(77) int local77 = arg0.anInt3549 * 128 + arg0.anInt3581 * 64;
			arg0.anInt3529 = (local57 * (local41 - local47) + local47 * local77) / local41;
			@Pc(102) int local102 = arg0.anInt3579 * 128 + arg0.anInt3581 * 64;
			arg0.anInt3578 = ((local41 - local47) * local67 + local47 * local102) / local41;
		}
		arg0.anInt3530 = 0;
		if (arg0.anInt3541 == 0) {
			arg0.anInt3571 = 1024;
		}
		if (arg0.anInt3541 == 1) {
			arg0.anInt3571 = 1536;
		}
		if (arg0.anInt3541 == 2) {
			arg0.anInt3571 = 0;
		}
		if (arg0.anInt3541 == 3) {
			arg0.anInt3571 = 512;
		}
		arg0.anInt3536 = arg0.anInt3571;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
	public static void method2677() {
		aClass49_1565 = null;
		aClass49_1563 = null;
		aClass49_1564 = null;
	}
}
