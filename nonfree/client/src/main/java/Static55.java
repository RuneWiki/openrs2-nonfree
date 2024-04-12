import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!le", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 5)
	public static void method998() {
		Class47.aClass2_Sub3_Sub1_4.method1736(255);
		if (Class37.anInt1654 != -1) {
			Static75.method1350(Class37.anInt1654);
			Class2_Sub2_Sub7.aBoolean59 = true;
			Class18_Sub1.aBoolean40 = false;
			Class2_Sub3.aBoolean184 = true;
			Class37.anInt1654 = -1;
		}
		if (Class53.anInt1994 != -1) {
			Static75.method1350(Class53.anInt1994);
			Class18_Sub1.aBoolean40 = false;
			Class53.anInt1994 = -1;
			Class41.aBoolean144 = true;
		}
		if (Class52.anInt1971 != -1) {
			Static75.method1350(Class52.anInt1971);
			Class52.anInt1971 = -1;
			Static7.method187(30);
		}
		if (Class58.anInt2175 != -1) {
			Static75.method1350(Class58.anInt2175);
			Class58.anInt2175 = -1;
		}
		if (Class2_Sub3.anInt2585 != -1) {
			Static75.method1350(Class2_Sub3.anInt2585);
			Class2_Sub3.anInt2585 = -1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)Lclient!vb;", line = 159)
	public static Class2_Sub2_Sub2_Sub4 method1000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class2_Sub2_Sub2_Sub4 local14;
		if (arg0 == 0) {
			local14 = (Class2_Sub2_Sub2_Sub4) Class2_Sub2_Sub6.aClass47_7.method1325((long) arg2);
			if (local14 != null && local14.anInt2443 != arg1 && local14.anInt2443 != -1) {
				local14.method1677();
				local14 = null;
			}
			if (local14 != null) {
				return local14;
			}
		}
		@Pc(40) Class2_Sub2_Sub8 local40 = Static97.method1669(arg2);
		if (local40.anIntArray183 == null) {
			arg1 = -1;
		}
		if (arg1 > 1) {
			@Pc(57) int local57 = -1;
			for (@Pc(59) int local59 = 0; local59 < 10; local59++) {
				if (arg1 >= local40.anIntArray180[local59] && local40.anIntArray180[local59] != 0) {
					local57 = local40.anIntArray183[local59];
				}
			}
			if (local57 != -1) {
				local40 = Static97.method1669(local57);
			}
		}
		@Pc(101) Class2_Sub2_Sub12_Sub4 local101 = local40.method713(1, true);
		if (local101 == null) {
			return null;
		}
		@Pc(107) Class2_Sub2_Sub2_Sub4 local107 = null;
		if (local40.anInt932 != -1) {
			local107 = method1000(-1, 10, local40.anInt956);
			if (local107 == null) {
				return null;
			}
		}
		@Pc(125) int[] local125 = Static6.method167();
		@Pc(127) int local127 = Static25.anInt2440;
		@Pc(129) int[] local129 = Static25.anIntArray533;
		@Pc(131) int local131 = Static25.anInt2435;
		@Pc(133) int local133 = Class2_Sub2_Sub2.anInt2437;
		@Pc(135) int local135 = Class2_Sub2_Sub2.anInt2439;
		@Pc(137) int local137 = Class2_Sub2_Sub2.anInt2436;
		@Pc(139) int local139 = Class2_Sub2_Sub2.anInt2438;
		local14 = new Class2_Sub2_Sub2_Sub4(32, 32);
		Static25.method1604(local14.anIntArray534, 32, 32);
		Static43.anIntArray536 = Static6.method175(Static43.anIntArray536);
		Static25.method1612(0, 0, 32, 32, 0);
		Class2_Sub2_Sub2_Sub1.aBoolean18 = false;
		@Pc(164) int local164 = local40.anInt926;
		if (arg0 == -1) {
			local164 = (int) ((double) local164 * 1.5D);
		}
		if (arg0 > 0) {
			local164 = (int) ((double) local164 * 1.04D);
		}
		@Pc(193) int local193 = Class2_Sub2_Sub2_Sub1.anIntArray58[local40.anInt952] * local164 >> 16;
		@Pc(202) int local202 = local164 * Class2_Sub2_Sub2_Sub1.anIntArray59[local40.anInt952] >> 16;
		local101.method1135();
		local101.method1151(local40.anInt918, local40.anInt937, local40.anInt952, local40.anInt946, local202 + local101.anInt2265 / 2 + local40.anInt960, local193 + local40.anInt960);
		for (@Pc(230) int local230 = 31; local230 >= 0; local230--) {
			for (local193 = 31; local193 >= 0; local193--) {
				if (local14.anIntArray534[local193 * 32 + local230] == 0) {
					if (local230 > 0 && local14.anIntArray534[local193 * 32 + local230 - 1] > 1) {
						local14.anIntArray534[local193 * 32 + local230] = 1;
					} else if (local193 > 0 && local14.anIntArray534[local193 * 32 + local230 - 32] > 1) {
						local14.anIntArray534[local193 * 32 + local230] = 1;
					} else if (local230 < 31 && local14.anIntArray534[local230 + local193 * 32 + 1] > 1) {
						local14.anIntArray534[local193 * 32 + local230] = 1;
					} else if (local193 < 31 && local14.anIntArray534[local230 + local193 * 32 + 32] > 1) {
						local14.anIntArray534[local193 * 32 + local230] = 1;
					}
				}
			}
		}
		@Pc(379) int local379;
		if (arg0 > 0) {
			for (local379 = 31; local379 >= 0; local379--) {
				for (local193 = 31; local193 >= 0; local193--) {
					if (local14.anIntArray534[local379 + local193 * 32] == 0) {
						if (local379 > 0 && local14.anIntArray534[local193 * 32 + local379 - 1] == 1) {
							local14.anIntArray534[local379 + local193 * 32] = arg0;
						} else if (local193 > 0 && local14.anIntArray534[(local193 - 1) * 32 + local379] == 1) {
							local14.anIntArray534[local193 * 32 + local379] = arg0;
						} else if (local379 < 31 && local14.anIntArray534[local193 * 32 + local379 + 1] == 1) {
							local14.anIntArray534[local193 * 32 + local379] = arg0;
						} else if (local193 < 31 && local14.anIntArray534[local193 * 32 + local379 + 32] == 1) {
							local14.anIntArray534[local193 * 32 + local379] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (local379 = 31; local379 >= 0; local379--) {
				for (local193 = 31; local193 >= 0; local193--) {
					if (local14.anIntArray534[local193 * 32 + local379] == 0 && local379 > 0 && local193 > 0 && local14.anIntArray534[local379 + local193 * 32 - 1 - 32] > 0) {
						local14.anIntArray534[local379 + local193 * 32] = 3153952;
					}
				}
			}
		}
		if (local40.anInt932 != -1) {
			local379 = local107.anInt2445;
			@Pc(586) int local586 = local107.anInt2443;
			local107.anInt2443 = 32;
			local107.anInt2445 = 32;
			local107.method1624(0, 0);
			local107.anInt2443 = local586;
			local107.anInt2445 = local379;
		}
		if (arg0 == 0) {
			Class2_Sub2_Sub6.aClass47_7.method1332((long) arg2, local14);
		}
		Static25.method1604(local129, local127, local131);
		Static25.method1613(local133, local135, local137, local139);
		Static6.method175(local125);
		Class2_Sub2_Sub2_Sub1.aBoolean18 = true;
		if (local40.aBoolean67) {
			local14.anInt2445 = 33;
		} else {
			local14.anInt2445 = 32;
		}
		local14.anInt2443 = arg1;
		return local14;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 461)
	public static void method1003() {
		Class33.aClass40_431 = null;
		aByteArrayArrayArray6 = null;
		Class33.aClass40_434 = null;
		Class33.aClass40_435 = null;
		Class33.aClass40_432 = null;
		Class33.aClass40_433 = null;
	}
}
