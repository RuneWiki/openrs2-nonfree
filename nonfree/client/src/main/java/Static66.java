import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
	public static int[] anIntArray202 = new int[32768];

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Lclient!dd;")
	private static Class13 aClass13_668 = Static161.method2971("Please wait)3)3)3");

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_667 = aClass13_668;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
	public static int anInt1948 = -1;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Lclient!dd;")
	public static Class13 aClass13_669 = Static161.method2971("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V")
	public static void method1446(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == Static26.anInt960 && Static82.anInt2315 == arg4 && (arg1 == Static136.anInt3397 || !Static30.aBoolean72)) {
			return;
		}
		Static136.anInt3397 = arg1;
		if (!Static30.aBoolean72) {
			Static136.anInt3397 = 0;
		}
		Static26.anInt960 = arg3;
		Static82.anInt2315 = arg4;
		Static53.method1293(25);
		Static144.method2550(Static153.aClass13_1250, true);
		@Pc(48) int local48 = Static153.anInt3629;
		Static153.anInt3629 = (arg3 - 6) * 8;
		@Pc(59) int local59 = Static153.anInt3629 - local48;
		@Pc(63) int local63 = Static60.anInt1864;
		Static60.anInt1864 = (arg4 - 6) * 8;
		@Pc(74) int local74 = Static60.anInt1864 - local63;
		for (@Pc(78) int local78 = 0; local78 < 32768; local78++) {
			@Pc(84) Class1_Sub2_Sub2_Sub2_Sub1 local84 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local78];
			if (local84 != null) {
				for (@Pc(88) int local88 = 0; local88 < 10; local88++) {
					local84.anIntArray246[local88] -= local59;
					local84.anIntArray247[local88] -= local74;
				}
				local84.anInt2596 -= local59 * 128;
				local84.anInt2606 -= local74 * 128;
			}
		}
		for (@Pc(134) int local134 = 0; local134 < 2048; local134++) {
			@Pc(140) Class1_Sub2_Sub2_Sub2_Sub2 local140 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local134];
			if (local140 != null) {
				for (@Pc(144) int local144 = 0; local144 < 10; local144++) {
					local140.anIntArray246[local144] -= local59;
					local140.anIntArray247[local144] -= local74;
				}
				local140.anInt2596 -= local59 * 128;
				local140.anInt2606 -= local74 * 128;
			}
		}
		Static156.anInt3696 = arg1;
		@Pc(192) byte local192 = 0;
		Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.method1884(false, arg2, arg0);
		@Pc(200) byte local200 = 104;
		@Pc(202) byte local202 = 1;
		@Pc(204) byte local204 = 0;
		@Pc(206) byte local206 = 104;
		if (local59 < 0) {
			local192 = 103;
			local200 = -1;
			local202 = -1;
		}
		@Pc(219) byte local219 = 1;
		if (local74 < 0) {
			local204 = 103;
			local219 = -1;
			local206 = -1;
		}
		for (@Pc(233) int local233 = local192; local233 != local200; local233 += local202) {
			for (@Pc(237) int local237 = local204; local237 != local206; local237 += local219) {
				@Pc(243) int local243 = local237 + local74;
				@Pc(248) int local248 = local233 + local59;
				for (@Pc(250) int local250 = 0; local250 < 4; local250++) {
					if (local248 >= 0 && local243 >= 0 && local248 < 104 && local243 < 104) {
						Static131.aClass82ArrayArrayArray1[local250][local233][local237] = Static131.aClass82ArrayArrayArray1[local250][local248][local243];
					} else {
						Static131.aClass82ArrayArrayArray1[local250][local233][local237] = null;
					}
				}
			}
		}
		for (@Pc(315) Class1_Sub7 local315 = (Class1_Sub7) Static124.aClass82_9.method2849(); local315 != null; local315 = (Class1_Sub7) Static124.aClass82_9.method2855()) {
			local315.anInt727 -= local74;
			local315.anInt718 -= local59;
			if (local315.anInt718 < 0 || local315.anInt727 < 0 || local315.anInt718 >= 104 || local315.anInt727 >= 104) {
				local315.method3056();
			}
		}
		if (Static49.anInt1616 != 0) {
			Static49.anInt1616 -= local59;
			Static70.anInt2008 -= local74;
		}
		Static87.anInt2472 = -1;
		Static175.anInt3994 = 0;
		Static2.aBoolean11 = false;
		Static21.aClass82_3.method2847();
		Static4.aClass82_1.method2847();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4 method1447() {
		@Pc(13) Class1_Sub2_Sub1_Sub4 local13 = new Class1_Sub2_Sub1_Sub4();
		local13.anInt511 = Static184.anIntArray449[0];
		local13.anInt513 = Static32.anInt4094;
		local13.anInt514 = Static12.anIntArray51[0];
		local13.anInt515 = Static51.anInt1673;
		local13.anInt512 = Static106.anIntArray285[0];
		local13.aByteArray17 = Static180.aByteArrayArray10[0];
		local13.anInt516 = Static130.anIntArray324[0];
		local13.anIntArray76 = Static104.anIntArray268;
		Static111.method2163();
		return local13;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!o;ILclient!hb;)V")
	public static void method1448(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(3) Class28 arg2) {
		@Pc(3) Class1_Sub18 local3 = new Class1_Sub18();
		local3.anInt3531 = 1;
		local3.aClass28_3 = arg2;
		local3.aLong158 = arg0;
		local3.aClass4_Sub1_46 = arg1;
		@Pc(26) Class82 local26 = Static64.aClass82_5;
		synchronized (Static64.aClass82_5) {
			Static64.aClass82_5.method2853(local3);
		}
		Static58.method1368();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIB)I")
	public static int method1449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local3 < 0 || local11 < 0 || local3 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(29) int local29 = arg0;
		if (arg0 < 3 && (Static35.aByteArrayArrayArray20[1][local3][local11] & 0x2) == 2) {
			local29 = arg0 + 1;
		}
		@Pc(50) int local50 = arg2 & 0x7F;
		@Pc(54) int local54 = arg1 & 0x7F;
		@Pc(85) int local85 = Static183.anIntArrayArrayArray8[local29][local3 + 1][local11 + 1] * local50 + Static183.anIntArrayArrayArray8[local29][local3][local11 + 1] * (128 - local50) >> 7;
		@Pc(113) int local113 = Static183.anIntArrayArrayArray8[local29][local3][local11] * (128 - local50) + local50 * Static183.anIntArrayArrayArray8[local29][local3 + 1][local11] >> 7;
		return local113 * (128 - local54) + local54 * local85 >> 7;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public static void method1450() {
		while (true) {
			if (Static153.aClass1_Sub8_Sub1_2.method1659(Static89.anInt2506) >= 11) {
				@Pc(23) int local23 = Static153.aClass1_Sub8_Sub1_2.method1656(11);
				if (local23 != 2047) {
					@Pc(30) boolean local30 = false;
					if (Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local23] == null) {
						Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local23] = new Class1_Sub2_Sub2_Sub2_Sub2();
						local30 = true;
						if (Static134.aClass1_Sub8Array1[local23] != null) {
							Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local23].method1894(Static134.aClass1_Sub8Array1[local23]);
						}
					}
					Static30.anIntArray116[Static65.anInt1929++] = local23;
					@Pc(66) Class1_Sub2_Sub2_Sub2_Sub2 local66 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local23];
					local66.anInt2597 = Static78.anInt2168;
					@Pc(74) int local74 = Static153.aClass1_Sub8_Sub1_2.method1656(1);
					if (local74 == 1) {
						Static147.anIntArray350[Static156.anInt3694++] = local23;
					}
					@Pc(92) int local92 = Static153.aClass1_Sub8_Sub1_2.method1656(1);
					@Pc(97) int local97 = Static153.aClass1_Sub8_Sub1_2.method1656(5);
					@Pc(102) int local102 = Static153.aClass1_Sub8_Sub1_2.method1656(5);
					if (local102 > 15) {
						local102 -= 32;
					}
					if (local97 > 15) {
						local97 -= 32;
					}
					@Pc(119) int local119 = Static173.anIntArray443[Static153.aClass1_Sub8_Sub1_2.method1656(3)];
					if (local30) {
						local66.anInt2555 = local66.anInt2560 = local119;
					}
					local66.method1884(local92 == 1, local97 + Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], local102 + Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0]);
					continue;
				}
			}
			Static153.aClass1_Sub8_Sub1_2.method1662();
			return;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!gi;)V")
	public static void method1451(@OriginalArg(1) Class1_Sub2_Sub2_Sub2 arg0) {
		arg0.anInt2593 = arg0.anInt2584;
		if (arg0.anInt2586 == 0) {
			arg0.anInt2559 = 0;
			return;
		}
		if (arg0.anInt2553 != -1 && arg0.anInt2585 == 0) {
			@Pc(35) Class1_Sub2_Sub8 local35 = Static142.method2538(arg0.anInt2553);
			if (arg0.anInt2572 > 0 && local35.anInt1517 == 0) {
				arg0.anInt2559++;
				return;
			}
			if (arg0.anInt2572 <= 0 && local35.anInt1519 == 0) {
				arg0.anInt2559++;
				return;
			}
		}
		@Pc(67) int local67 = arg0.anInt2596;
		@Pc(83) int local83 = arg0.anIntArray246[arg0.anInt2586 - 1] * 128 + arg0.anInt2583 * 64;
		@Pc(86) int local86 = arg0.anInt2606;
		@Pc(102) int local102 = arg0.anIntArray247[arg0.anInt2586 - 1] * 128 + arg0.anInt2583 * 64;
		if (local83 - local67 > 256 || local83 - local67 < -256 || local102 - local86 > 256 || local102 - local86 < -256) {
			arg0.anInt2596 = local83;
			arg0.anInt2606 = local102;
			return;
		}
		if (local67 >= local83) {
			if (local83 < local67) {
				if (local102 > local86) {
					arg0.anInt2555 = 768;
				} else if (local86 > local102) {
					arg0.anInt2555 = 256;
				} else {
					arg0.anInt2555 = 512;
				}
			} else if (local102 > local86) {
				arg0.anInt2555 = 1024;
			} else if (local86 > local102) {
				arg0.anInt2555 = 0;
			}
		} else if (local102 > local86) {
			arg0.anInt2555 = 1280;
		} else if (local102 >= local86) {
			arg0.anInt2555 = 1536;
		} else {
			arg0.anInt2555 = 1792;
		}
		@Pc(221) int local221 = arg0.anInt2555 - arg0.anInt2560 & 0x7FF;
		if (local221 > 1024) {
			local221 -= 2048;
		}
		@Pc(230) int local230 = arg0.anInt2552;
		if (local221 >= -256 && local221 <= 256) {
			local230 = arg0.anInt2550;
		} else if (local221 >= 256 && local221 < 768) {
			local230 = arg0.anInt2581;
		} else if (local221 >= -768 && local221 <= -256) {
			local230 = arg0.anInt2582;
		}
		@Pc(273) int local273 = 4;
		if (local230 == -1) {
			local230 = arg0.anInt2550;
		}
		arg0.anInt2593 = local230;
		@Pc(284) boolean local284 = true;
		if (arg0 instanceof Class1_Sub2_Sub2_Sub2_Sub1) {
			local284 = ((Class1_Sub2_Sub2_Sub2_Sub1) arg0).aClass1_Sub2_Sub19_1.aBoolean296;
		}
		if (local284) {
			if (arg0.anInt2560 != arg0.anInt2555 && arg0.anInt2575 == -1 && arg0.anInt2577 != 0) {
				local273 = 2;
			}
			if (arg0.anInt2586 > 2) {
				local273 = 6;
			}
			if (arg0.anInt2586 > 3) {
				local273 = 8;
			}
			if (arg0.anInt2559 > 0 && arg0.anInt2586 > 1) {
				local273 = 8;
				arg0.anInt2559--;
			}
		} else {
			if (arg0.anInt2586 > 1) {
				local273 = 6;
			}
			if (arg0.anInt2586 > 2) {
				local273 = 8;
			}
			if (arg0.anInt2559 > 0 && arg0.anInt2586 > 1) {
				arg0.anInt2559--;
				local273 = 8;
			}
		}
		if (arg0.aBooleanArray34[arg0.anInt2586 - 1]) {
			local273 <<= 0x1;
		}
		if (local67 < local83) {
			arg0.anInt2596 += local273;
			if (local83 < arg0.anInt2596) {
				arg0.anInt2596 = local83;
			}
		} else if (local83 < local67) {
			arg0.anInt2596 -= local273;
			if (local83 > arg0.anInt2596) {
				arg0.anInt2596 = local83;
			}
		}
		if (local86 < local102) {
			arg0.anInt2606 += local273;
			if (local102 < arg0.anInt2606) {
				arg0.anInt2606 = local102;
			}
		} else if (local102 < local86) {
			arg0.anInt2606 -= local273;
			if (arg0.anInt2606 < local102) {
				arg0.anInt2606 = local102;
			}
		}
		if (arg0.anInt2596 == local83 && arg0.anInt2606 == local102) {
			if (arg0.anInt2572 > 0) {
				arg0.anInt2572--;
			}
			arg0.anInt2586--;
		}
		if (local273 >= 8 && arg0.anInt2550 == arg0.anInt2593 && arg0.anInt2562 != -1) {
			arg0.anInt2593 = arg0.anInt2562;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method1452() {
		aClass13_669 = null;
		aClass13_667 = null;
		anIntArray201 = null;
		anIntArray202 = null;
		aClass13_668 = null;
	}
}
