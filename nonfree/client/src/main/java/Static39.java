import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!he", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!he", name = "I", descriptor = "Lclient!w;")
	public static Class15 aClass15_6;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "[Lclient!va;")
	public static Class61[] aClass61Array2 = new Class61[100];

	@OriginalMember(owner = "client!he", name = "s", descriptor = "I")
	public static int anInt262 = 0;

	@OriginalMember(owner = "client!he", name = "K", descriptor = "Lclient!va;")
	public static Class61 aClass61_77 = Static88.method1421(")1");

	@OriginalMember(owner = "client!he", name = "M", descriptor = "I")
	public static int anInt276 = -1;

	@OriginalMember(owner = "client!he", name = "N", descriptor = "Lclient!va;")
	public static Class61 aClass61_78 = Static88.method1421("logo");

	@OriginalMember(owner = "client!he", name = "U", descriptor = "[I")
	public static int[] anIntArray43 = new int[256];

	@OriginalMember(owner = "client!he", name = "W", descriptor = "I")
	public static int anInt280 = -1;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method202() {
		aClass61Array2 = null;
		aByteArrayArray3 = null;
		aClass15_6 = null;
		aClass61_78 = null;
		anIntArray43 = null;
		aClass61_77 = null;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	public static void method205() {
		@Pc(13) Object local13 = Static89.anObject4;
		synchronized (Static89.anObject4) {
			if (Static74.anInt1869 == 0) {
				Static1.aClass55_1.method1404(new Class30(), 5);
			}
			Static74.anInt1869 = 600;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIII)V")
	public static void method213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = 2048 - arg3 & 0x7FF;
		@Pc(23) int local23 = 2048 - arg0 & 0x7FF;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = arg4;
		@Pc(42) int local42;
		@Pc(38) int local38;
		@Pc(52) int local52;
		if (local16 != 0) {
			local38 = Static84.anIntArray281[local16];
			local42 = Static84.anIntArray280[local16];
			local52 = local38 * 0 - arg4 * local42 >> 16;
			local29 = local42 * 0 + local38 * arg4 >> 16;
			local27 = local52;
		}
		if (local23 != 0) {
			local42 = Static84.anIntArray280[local23];
			local38 = Static84.anIntArray281[local23];
			local52 = local38 * 0 + local42 * local29 >> 16;
			local29 = local29 * local38 - local42 * 0 >> 16;
			local25 = local52;
		}
		Static96.anInt2449 = arg5 - local27;
		Static30.anInt918 = arg1 - local29;
		Static12.anInt349 = arg2 - local25;
		Static75.anInt2015 = arg3;
		Static40.anInt1090 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method214(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static57.aClass51_1);
		arg0.removeFocusListener(Static57.aClass51_1);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(III)Lclient!va;")
	public static Class61 method228(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - arg0;
		if (local4 < -9) {
			return Static71.aClass61_757;
		} else if (local4 < -6) {
			return Static10.aClass61_82;
		} else if (local4 < -3) {
			return Static75.aClass61_810;
		} else if (local4 < 0) {
			return Static30.aClass61_369;
		} else if (local4 > 9) {
			return Static20.aClass61_1075;
		} else if (local4 > 6) {
			return Static98.aClass61_1014;
		} else if (local4 > 3) {
			return Static60.aClass61_666;
		} else if (local4 > 0) {
			return Static69.aClass61_751;
		} else {
			return Static76.aClass61_815;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIB)Lclient!bc;")
	public static Class10_Sub1_Sub1_Sub1 method229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class10_Sub1_Sub1_Sub1 local14;
		if (arg1 == 0) {
			local14 = (Class10_Sub1_Sub1_Sub1) Static20.aClass29_75.method644((long) arg2);
			if (local14 != null && local14.anInt176 != arg0 && local14.anInt176 != -1) {
				local14.method1654();
				local14 = null;
			}
			if (local14 != null) {
				return local14;
			}
		}
		@Pc(37) Class10_Sub1_Sub15 local37 = Static94.method1491(arg2);
		if (local37.anIntArray329 == null) {
			arg0 = -1;
		}
		if (arg0 > 1) {
			@Pc(47) int local47 = -1;
			for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
				if (local37.anIntArray330[local49] <= arg0 && local37.anIntArray330[local49] != 0) {
					local47 = local37.anIntArray329[local49];
				}
			}
			if (local47 != -1) {
				local37 = Static94.method1491(local47);
			}
		}
		@Pc(93) Class10_Sub1_Sub5_Sub4 local93 = local37.method1578(1, true);
		if (local93 == null) {
			return null;
		}
		@Pc(99) Class10_Sub1_Sub1_Sub1 local99 = null;
		if (local37.anInt2518 != -1) {
			local99 = method229(10, -1, local37.anInt2523);
			if (local99 == null) {
				return null;
			}
		}
		@Pc(116) int local116 = Static45.anInt2475;
		@Pc(118) int[] local118 = Static45.anIntArray323;
		@Pc(120) int local120 = Static45.anInt2471;
		@Pc(122) int local122 = Static45.anInt2474;
		@Pc(124) int local124 = Static45.anInt2472;
		@Pc(126) int local126 = Static45.anInt2473;
		@Pc(128) int local128 = Static45.anInt2470;
		@Pc(138) int[] local138 = Static68.method997();
		@Pc(140) int local140 = Static68.anInt1812;
		@Pc(142) int local142 = Static68.anInt1807;
		local14 = new Class10_Sub1_Sub1_Sub1(32, 32);
		Static45.method1529(local14.anIntArray31, 32, 32);
		Static56.anIntArray160 = Static68.method998(Static56.anIntArray160);
		Static45.method1531(0, 0, 32, 32, 0);
		Static68.aBoolean84 = false;
		@Pc(167) int local167 = local37.anInt2531;
		if (arg1 == -1) {
			local167 = (int) ((double) local167 * 1.5D);
		}
		if (arg1 > 0) {
			local167 = (int) ((double) local167 * 1.04D);
		}
		@Pc(193) int local193 = local167 * Class10_Sub1_Sub1_Sub3.anIntArray203[local37.anInt2510] >> 16;
		@Pc(202) int local202 = Class10_Sub1_Sub1_Sub3.anIntArray201[local37.anInt2510] * local167 >> 16;
		local93.method1338();
		local93.method1331(local37.anInt2524, local37.anInt2528, local37.anInt2510, local37.anInt2541, local93.anInt2674 / 2 + local202 + local37.anInt2515, local193 + local37.anInt2515);
		for (@Pc(230) int local230 = 31; local230 >= 0; local230--) {
			for (local193 = 31; local193 >= 0; local193--) {
				if (local14.anIntArray31[local193 * 32 + local230] == 0) {
					if (local230 > 0 && local14.anIntArray31[local193 * 32 + local230 - 1] > 1) {
						local14.anIntArray31[local193 * 32 + local230] = 1;
					} else if (local193 > 0 && local14.anIntArray31[local193 * 32 + local230 - 32] > 1) {
						local14.anIntArray31[local193 * 32 + local230] = 1;
					} else if (local230 < 31 && local14.anIntArray31[local230 + local193 * 32 + 1] > 1) {
						local14.anIntArray31[local230 + local193 * 32] = 1;
					} else if (local193 < 31 && local14.anIntArray31[local230 + local193 * 32 + 32] > 1) {
						local14.anIntArray31[local193 * 32 + local230] = 1;
					}
				}
			}
		}
		@Pc(377) int local377;
		if (arg1 > 0) {
			for (local377 = 31; local377 >= 0; local377--) {
				for (local193 = 31; local193 >= 0; local193--) {
					if (local14.anIntArray31[local193 * 32 + local377] == 0) {
						if (local377 > 0 && local14.anIntArray31[local193 * 32 + local377 - 1] == 1) {
							local14.anIntArray31[local193 * 32 + local377] = arg1;
						} else if (local193 > 0 && local14.anIntArray31[local377 + (local193 - 1) * 32] == 1) {
							local14.anIntArray31[local193 * 32 + local377] = arg1;
						} else if (local377 < 31 && local14.anIntArray31[local193 * 32 + local377 + 1] == 1) {
							local14.anIntArray31[local377 + local193 * 32] = arg1;
						} else if (local193 < 31 && local14.anIntArray31[local377 + (local193 + 1) * 32] == 1) {
							local14.anIntArray31[local193 * 32 + local377] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (local377 = 31; local377 >= 0; local377--) {
				for (local193 = 31; local193 >= 0; local193--) {
					if (local14.anIntArray31[local377 + local193 * 32] == 0 && local377 > 0 && local193 > 0 && local14.anIntArray31[(local193 - 1) * 32 + local377 - 1] > 0) {
						local14.anIntArray31[local193 * 32 + local377] = 3153952;
					}
				}
			}
		}
		if (local37.anInt2518 != -1) {
			local377 = local99.anInt174;
			local99.anInt174 = 32;
			@Pc(582) int local582 = local99.anInt176;
			local99.anInt176 = 32;
			local99.method142(0, 0);
			local99.anInt176 = local582;
			local99.anInt174 = local377;
		}
		if (arg1 == 0) {
			Static20.aClass29_75.method649(local14, (long) arg2);
		}
		Static45.method1529(local118, local116, local120);
		Static45.method1530(local122, local126, local124, local128);
		Static68.method998(local138);
		Static68.anInt1812 = local140;
		Static68.anInt1807 = local142;
		Static68.method1006();
		Static68.aBoolean84 = true;
		local14.anInt176 = arg0;
		if (local37.aBoolean116) {
			local14.anInt174 = 33;
		} else {
			local14.anInt174 = 32;
		}
		return local14;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)I")
	public static int method230(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 >> 7;
		@Pc(11) int local11 = arg2 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(28) int local28 = arg1;
		if (arg1 < 3 && (Static21.aByteArrayArrayArray4[1][local7][local11] & 0x2) == 2) {
			local28 = arg1 + 1;
		}
		@Pc(51) int local51 = arg0 & 0x7F;
		@Pc(83) int local83 = local51 * Static37.anIntArrayArrayArray1[local28][local7 + 1][local11] + Static37.anIntArrayArrayArray1[local28][local7][local11] * (128 - local51) >> 7;
		@Pc(113) int local113 = (128 - local51) * Static37.anIntArrayArrayArray1[local28][local7][local11 + 1] + Static37.anIntArrayArrayArray1[local28][local7 + 1][local11 + 1] * local51 >> 7;
		@Pc(117) int local117 = arg2 & 0x7F;
		return local117 * local113 + local83 * (128 - local117) >> 7;
	}
}
