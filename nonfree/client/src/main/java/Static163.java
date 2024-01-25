import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "[Lclient!d;")
	public static Class43[] aClass43Array1;

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
	public static int anInt3276;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray21 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "[I")
	public static final int[] anIntArray228 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
	public static void method3006() {
		if (Static46.aClass98_1 != null) {
			@Pc(9) Class98 local9 = Static46.aClass98_1;
			synchronized (Static46.aClass98_1) {
				Static46.aClass98_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!bk;)V")
	public static void method3007(@OriginalArg(1) Class5_Sub1 arg0) {
		if (arg0.aByteArray18.length - arg0.anInt2029 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method1832();
		if (local21 < 0 || local21 > 14) {
			return;
		}
		@Pc(40) byte local40;
		if (local21 == 14) {
			local40 = 36;
		} else if (local21 == 13) {
			local40 = 35;
		} else if (local21 == 12) {
			local40 = 34;
		} else if (local21 == 11) {
			local40 = 33;
		} else if (local21 == 10) {
			local40 = 32;
		} else if (local21 == 9) {
			local40 = 31;
		} else if (local21 == 8) {
			local40 = 30;
		} else if (local21 == 7) {
			local40 = 29;
		} else if (local21 == 6) {
			local40 = 28;
		} else if (local21 == 5) {
			local40 = 28;
		} else if (local21 == 4) {
			local40 = 24;
		} else if (local21 == 3) {
			local40 = 23;
		} else if (local21 == 2) {
			local40 = 22;
		} else if (local21 == 1) {
			local40 = 23;
		} else {
			local40 = 19;
		}
		if (local40 > arg0.aByteArray18.length - arg0.anInt2029) {
			return;
		}
		Static190.anInt3772 = arg0.method1832();
		if (Static190.anInt3772 < 1) {
			Static190.anInt3772 = 1;
		} else if (Static190.anInt3772 > 4) {
			Static190.anInt3772 = 4;
		}
		Static249.method4371(arg0.method1832() == 1);
		Static114.aBoolean158 = arg0.method1832() == 1;
		Static22.aBoolean43 = arg0.method1832() == 1;
		Static262.aBoolean384 = arg0.method1832() == 1;
		Static332.anInt6258 = arg0.method1832() == 1 ? 1 : 0;
		Static263.aBoolean385 = arg0.method1832() == 1;
		Static67.aBoolean110 = arg0.method1832() == 1;
		Static267.aBoolean391 = arg0.method1832() == 1;
		Static134.anInt2750 = arg0.method1832();
		if (Static134.anInt2750 > 2) {
			Static134.anInt2750 = 2;
		}
		if (local21 >= 2) {
			Static8.aBoolean7 = arg0.method1832() == 1;
		} else {
			Static8.aBoolean7 = arg0.method1832() == 1;
			arg0.method1832();
		}
		Static322.aBoolean457 = arg0.method1832() == 1;
		Static18.aBoolean39 = arg0.method1832() == 1;
		Static32.anInt866 = arg0.method1832();
		if (Static32.anInt866 > 2) {
			Static32.anInt866 = 2;
		}
		Static275.anInt5386 = Static32.anInt866;
		Static29.aBoolean56 = arg0.method1832() == 1;
		Static126.anInt2647 = arg0.method1832();
		if (Static126.anInt2647 > 127) {
			Static126.anInt2647 = 127;
		}
		Static111.anInt2405 = arg0.method1832();
		Static123.anInt2600 = arg0.method1832();
		if (Static123.anInt2600 > 127) {
			Static123.anInt2600 = 127;
		}
		if (local21 >= 1) {
			Static229.anInt4486 = arg0.method1845();
			Static45.anInt1175 = arg0.method1845();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method1832();
		}
		@Pc(393) int local393;
		if (local21 >= 4) {
			local393 = arg0.method1832();
			if (local393 < 0 || local393 > 2) {
				local393 = 0;
			}
			if (Static46.anInt1196 < 96) {
				local393 = 0;
			}
			Static144.method2704(local393);
		}
		if (local21 >= 5) {
			Static216.anInt4318 = arg0.method1826();
		}
		local393 = 0;
		if (local21 >= 6) {
			Static326.anInt6197 = local393 = arg0.method1832();
		}
		if (Static326.anInt6197 != 1 && Static326.anInt6197 != 2) {
			Static326.anInt6197 = 2;
		}
		if (local21 >= 7) {
			Static140.aBoolean186 = arg0.method1832() == 1;
		}
		if (local21 >= 8) {
			Static139.aBoolean462 = arg0.method1832() == 1;
		}
		if (local21 >= 9) {
			Static335.anInt6338 = arg0.method1832();
		}
		if (Static335.anInt6338 < 0 || Static335.anInt6338 > 3) {
			Static335.anInt6338 = 0;
		}
		if (local21 >= 10) {
			Static91.aBoolean135 = arg0.method1832() != 0;
		}
		if (local21 >= 11) {
			Static183.aBoolean261 = arg0.method1832() != 0;
		}
		if (local21 >= 12) {
			Static332.anInt6258 = arg0.method1832();
		}
		if (Static332.anInt6258 < 0 || Static332.anInt6258 > 2) {
			Static332.anInt6258 = 1;
		}
		if (local21 >= 13) {
			Static90.aBoolean316 = arg0.method1832() == 1;
		}
		if (local21 >= 14) {
			Static355.anInt6625 = arg0.method1832();
		} else if (local393 == 0) {
			Static355.anInt6625 = 2;
		} else {
			Static355.anInt6625 = 1;
		}
		if (Static355.anInt6625 < 0 || Static355.anInt6625 > 3) {
			Static355.anInt6625 = 2;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZ)V")
	public static void method3009() {
		@Pc(5) Class66 local5 = Static48.aClass66_15;
		synchronized (Static48.aClass66_15) {
			Static48.aClass66_15.method1944(5);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIB)V")
	public static void method3010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class27 local15 = Static140.method2608(arg0);
		@Pc(18) int local18 = local15.anInt828;
		@Pc(21) int local21 = local15.anInt833;
		@Pc(24) int local24 = local15.anInt826;
		@Pc(31) int local31 = Class107.anIntArray216[local24 - local21];
		if (arg1 < 0 || local31 < arg1) {
			arg1 = 0;
		}
		local31 <<= local21;
		Static168.method3163(local18, ~local31 & Static2.anIntArray2[local18] | local31 & arg1 << local21);
	}
}
