import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "[I")
	public static final int[] anIntArray157 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZII)V")
	public static void method1901(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class164 local10 = new Class164(16);
		for (@Pc(15) Class7_Sub34 local15 = (Class7_Sub34) Static345.aClass164_33.method3514(); local15 != null; local15 = (Class7_Sub34) Static345.aClass164_33.method3519()) {
			local15.method5802();
			@Pc(31) int local31 = (int) (local15.aLong230 >> 28);
			@Pc(42) int local42 = (int) (local15.aLong230 >> 14 & 0x3FFFL) - arg1;
			@Pc(50) int local50 = (int) (local15.aLong230 & 0x3FFFL) - arg0;
			if (local50 >= 0 && local42 >= 0 && local50 < Static333.anInt3375 && Static102.anInt2086 > local42) {
				local10.method3508((long) (local31 << 28 | local42 << 14 | local50), local15);
			}
		}
		Static345.aClass164_33 = local10;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([SII)[S")
	public static short[] method1906(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static464.method3635(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)I")
	public static int method1907(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(BI)V")
	public static void method1910() {
		Static226.aClass126_26.method2828(50);
		Static303.aClass126_42.method2828(50);
		Static364.aClass126_18.method2828(50);
		Static68.aClass126_11.method2828(50);
		Static57.aClass126_8.method2828(50);
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public static void method1911() {
		Static210.aClass7_Sub14_Sub1_4.method1361();
		@Pc(17) int local17 = Static210.aClass7_Sub14_Sub1_4.method1358(8);
		@Pc(22) int local22;
		if (local17 < Static56.anInt943) {
			for (local22 = local17; local22 < Static56.anInt943; local22++) {
				Static46.anIntArray68[Static457.anInt7524++] = Static228.anIntArray347[local22];
			}
		}
		if (local17 > Static56.anInt943) {
			throw new RuntimeException("gnpov1");
		}
		Static56.anInt943 = 0;
		for (local22 = 0; local22 < local17; local22++) {
			@Pc(64) int local64 = Static228.anIntArray347[local22];
			@Pc(68) Class26_Sub2_Sub4_Sub1 local68 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local64];
			@Pc(73) int local73 = Static210.aClass7_Sub14_Sub1_4.method1358(1);
			if (local73 == 0) {
				Static228.anIntArray347[Static56.anInt943++] = local64;
				local68.anInt7098 = Static274.anInt4617;
			} else {
				@Pc(93) int local93 = Static210.aClass7_Sub14_Sub1_4.method1358(2);
				if (local93 == 0) {
					Static228.anIntArray347[Static56.anInt943++] = local64;
					local68.anInt7098 = Static274.anInt4617;
					Static209.anIntArray328[Static42.anInt690++] = local64;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local93 == 1) {
						Static228.anIntArray347[Static56.anInt943++] = local64;
						local68.anInt7098 = Static274.anInt4617;
						local137 = Static210.aClass7_Sub14_Sub1_4.method1358(3);
						local68.method4825(local137, 1);
						local147 = Static210.aClass7_Sub14_Sub1_4.method1358(1);
						if (local147 == 1) {
							Static209.anIntArray328[Static42.anInt690++] = local64;
						}
					} else if (local93 == 2) {
						Static228.anIntArray347[Static56.anInt943++] = local64;
						local68.anInt7098 = Static274.anInt4617;
						if (Static210.aClass7_Sub14_Sub1_4.method1358(1) == 1) {
							local137 = Static210.aClass7_Sub14_Sub1_4.method1358(3);
							local68.method4825(local137, 2);
							local147 = Static210.aClass7_Sub14_Sub1_4.method1358(3);
							local68.method4825(local147, 2);
						} else {
							local137 = Static210.aClass7_Sub14_Sub1_4.method1358(3);
							local68.method4825(local137, 0);
						}
						local137 = Static210.aClass7_Sub14_Sub1_4.method1358(1);
						if (local137 == 1) {
							Static209.anIntArray328[Static42.anInt690++] = local64;
						}
					} else if (local93 == 3) {
						Static46.anIntArray68[Static457.anInt7524++] = local64;
					}
				}
			}
		}
	}
}
