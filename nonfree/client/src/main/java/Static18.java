import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_114;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
	public static int anInt3716;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	public static int anInt3710 = -1;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "Z")
	public static boolean aBoolean161 = true;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "[S")
	public static short[] aShortArray40 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIILclient!cg;Z)V")
	public static void method2592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub4_Sub4 arg3) {
		if (Static150.anInt3365 >= 400) {
			return;
		}
		if (arg3.anIntArray66 != null) {
			arg3 = arg3.method595();
		}
		if (arg3 == null || !arg3.aBoolean33) {
			return;
		}
		@Pc(28) Class28 local28 = arg3.aClass28_534;
		if (arg3.anInt870 != 0) {
			local28 = Static83.method1481(new Class28[] { local28, Static126.method2042(arg3.anInt870, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1669), Static135.aClass28_1824, Static118.aClass28_2378, Static158.method2411(arg3.anInt870), Static125.aClass28_1735 });
		}
		if (Static166.anInt3704 == 1) {
			Static75.method1358((short) 13, arg0, Static28.aClass28_538, arg2, (long) arg1, Static83.method1481(new Class28[] { Static61.aClass28_954, Static129.aClass28_1785, local28 }));
		} else if (!Static163.aBoolean157) {
			@Pc(150) Class28[] local150 = arg3.aClass28Array10;
			if (Static119.aBoolean129) {
				local150 = Static107.method1840(local150);
			}
			@Pc(160) int local160;
			if (local150 != null) {
				for (local160 = 4; local160 >= 0; local160--) {
					if (local150[local160] != null && !local150[local160].method1140(Static22.aClass28_488)) {
						@Pc(179) byte local179 = 0;
						if (local160 == 0) {
							local179 = 7;
						}
						if (local160 == 1) {
							local179 = 8;
						}
						if (local160 == 2) {
							local179 = 44;
						}
						if (local160 == 3) {
							local179 = 14;
						}
						if (local160 == 4) {
							local179 = 48;
						}
						Static75.method1358(local179, arg0, local150[local160], arg2, (long) arg1, Static83.method1481(new Class28[] { Static137.aClass28_1831, local28 }));
					}
				}
			}
			if (local150 != null) {
				for (local160 = 4; local160 >= 0; local160--) {
					if (local150[local160] != null && local150[local160].method1140(Static22.aClass28_488)) {
						@Pc(262) short local262 = 0;
						if (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1669 < arg3.anInt870) {
							local262 = 2000;
						}
						@Pc(271) short local271 = 0;
						if (local160 == 0) {
							local271 = 7;
						}
						if (local160 == 1) {
							local271 = 8;
						}
						if (local160 == 2) {
							local271 = 44;
						}
						if (local160 == 3) {
							local271 = 14;
						}
						if (local160 == 4) {
							local271 = 48;
						}
						if (local271 != 0) {
							local271 += local262;
						}
						Static75.method1358(local271, arg0, local150[local160], arg2, (long) arg1, Static83.method1481(new Class28[] { Static137.aClass28_1831, local28 }));
					}
				}
			}
			Static75.method1358((short) 1001, arg0, Static82.aClass28_1233, arg2, (long) arg1, Static83.method1481(new Class28[] { Static137.aClass28_1831, local28 }));
		} else if ((Static151.anInt3386 & 0x2) == 2) {
			Static75.method1358((short) 28, arg0, Static98.aClass28_1425, arg2, (long) arg1, Static83.method1481(new Class28[] { Static24.aClass28_499, Static129.aClass28_1785, local28 }));
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public static void method2594() {
		aShortArray40 = null;
		aByteArrayArrayArray9 = null;
		aClass40_Sub1_114 = null;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
	public static void method2596() {
		@Pc(7) Class59 local7 = Static45.aClass59_1;
		synchronized (Static45.aClass59_1) {
			Static47.anInt1604 = Static26.anInt812;
			@Pc(15) int local15;
			if (Static81.anInt2516 < 0) {
				for (local15 = 0; local15 < 112; local15++) {
					Static9.aBooleanArray6[local15] = false;
				}
				Static81.anInt2516 = Static107.anInt2606;
			} else {
				while (Static81.anInt2516 != Static107.anInt2606) {
					local15 = Static177.anIntArray362[Static107.anInt2606];
					Static107.anInt2606 = Static107.anInt2606 + 1 & 0x7F;
					if (local15 >= 0) {
						Static9.aBooleanArray6[local15] = true;
					} else {
						Static9.aBooleanArray6[~local15] = false;
					}
				}
			}
			Static26.anInt812 = Static95.anInt2367;
		}
	}
}
