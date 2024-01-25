import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "[S")
	public static short[] aShortArray59;

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "J")
	public static long aLong98 = -1L;

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "[I")
	public static final int[] anIntArray197 = new int[5];

	@OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
	public static int anInt2710 = 0;

	@OriginalMember(owner = "client!hn", name = "I", descriptor = "[I")
	public static final int[] anIntArray198 = new int[50];

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Lclient!kp;")
	public static Class116 method2594(@OriginalArg(1) int arg0) {
		@Pc(5) Class21 local5 = Static10.aClass21_10;
		@Pc(14) Class116 local14;
		synchronized (Static10.aClass21_10) {
			local14 = (Class116) Static10.aClass21_10.method854((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static86.aClass30_26.method1161(arg0, 16);
		local14 = new Class116();
		if (local30 != null) {
			local14.method3180(new Class1_Sub7(local30));
		}
		@Pc(45) Class21 local45 = Static10.aClass21_10;
		synchronized (Static10.aClass21_10) {
			Static10.aClass21_10.method843(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)V")
	public static void method2595() {
		Static280.method5009(Static289.aClass18_190);
		for (@Pc(17) Class1_Sub15 local17 = (Class1_Sub15) Static281.aClass38_30.method1474(); local17 != null; local17 = (Class1_Sub15) Static281.aClass38_30.method1470()) {
			if (!local17.method6047()) {
				local17 = (Class1_Sub15) Static281.aClass38_30.method1474();
				if (local17 == null) {
					break;
				}
			}
			if (local17.anInt1494 == 0) {
				Static15.method343(true, true, local17);
			}
		}
		if (Static323.aClass112_13 != null) {
			Static133.method2725(Static323.aClass112_13);
			Static323.aClass112_13 = null;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!uq;)V")
	public static void method2596(@OriginalArg(1) Class32_Sub7 arg0) {
		arg0.aClass11_1 = null;
		@Pc(12) int local12 = arg0.aClass32_Sub4Array1.length;
		for (@Pc(21) int local21 = 0; local21 < local12; local21++) {
			arg0.aClass32_Sub4Array1[local21].aBoolean353 = false;
		}
		@Pc(39) Class195[] local39 = Class118_Sub2.aClass195Array1;
		synchronized (Class118_Sub2.aClass195Array1) {
			if (Class118_Sub2.aClass195Array1.length > local12 && Static43.anIntArray413[local12] < 200) {
				Class118_Sub2.aClass195Array1[local12].method5300(arg0);
				@Pc(60) int local60 = Static43.anIntArray413[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!ia;Z)Ljava/lang/String;")
	public static String method2597(@OriginalArg(0) Class1_Sub22 arg0) {
		return arg0.aString22 == null || arg0.aString22.length() <= 0 ? arg0.aString21 : arg0.aString21 + Static102.aClass106_238.method2927(Static254.anInt5172) + arg0.aString22;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)V")
	public static void method2599() {
		Static226.aClass21_123.method844(5);
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V")
	public static void method2600() {
		@Pc(9) int local9 = Static319.anInt6112 * 128 + 64;
		@Pc(15) int local15 = Static129.anInt2807 * 128 + 64;
		@Pc(23) int local23 = Static8.method288(Static284.anInt6477, local9, local15) - Static101.anInt2315;
		if (Static301.anInt5792 >= 100) {
			Static260.anInt5192 = Static129.anInt2807 * 128 + 64;
			Static14.anInt4971 = Static319.anInt6112 * 128 + 64;
			Static294.anInt5665 = Static8.method288(Static284.anInt6477, Static14.anInt4971, Static260.anInt5192) - Static101.anInt2315;
		} else {
			if (local9 > Static14.anInt4971) {
				Static14.anInt4971 += Static12.anInt292 + Static301.anInt5792 * (local9 - Static14.anInt4971) / 1000;
				if (local9 < Static14.anInt4971) {
					Static14.anInt4971 = local9;
				}
			}
			if (Static14.anInt4971 > local9) {
				Static14.anInt4971 -= (Static14.anInt4971 - local9) * Static301.anInt5792 / 1000 + Static12.anInt292;
				if (Static14.anInt4971 < local9) {
					Static14.anInt4971 = local9;
				}
			}
			if (Static294.anInt5665 < local23) {
				Static294.anInt5665 += Static12.anInt292 + Static301.anInt5792 * (local23 - Static294.anInt5665) / 1000;
				if (local23 < Static294.anInt5665) {
					Static294.anInt5665 = local23;
				}
			}
			if (Static294.anInt5665 > local23) {
				Static294.anInt5665 -= Static12.anInt292 + (Static294.anInt5665 - local23) * Static301.anInt5792 / 1000;
				if (local23 > Static294.anInt5665) {
					Static294.anInt5665 = local23;
				}
			}
			if (Static260.anInt5192 < local15) {
				Static260.anInt5192 += Static12.anInt292 + (local15 - Static260.anInt5192) * Static301.anInt5792 / 1000;
				if (Static260.anInt5192 > local15) {
					Static260.anInt5192 = local15;
				}
			}
			if (local15 < Static260.anInt5192) {
				Static260.anInt5192 -= Static301.anInt5792 * (Static260.anInt5192 - local15) / 1000 + Static12.anInt292;
				if (local15 > Static260.anInt5192) {
					Static260.anInt5192 = local15;
				}
			}
		}
		local15 = Static116.anInt2536 * 128 + 64;
		local9 = Static144.anInt3083 * 128 + 64;
		local23 = Static8.method288(Static284.anInt6477, local9, local15) - Static363.anInt6978;
		@Pc(231) int local231 = local9 - Static14.anInt4971;
		@Pc(236) int local236 = local23 - Static294.anInt5665;
		@Pc(241) int local241 = local15 - Static260.anInt5192;
		@Pc(252) int local252 = (int) Math.sqrt((double) (local241 * local241 + local231 * local231));
		@Pc(263) int local263 = (int) (Math.atan2((double) local236, (double) local252) * 2607.5945876176133D) & 0x3FFF;
		@Pc(274) int local274 = (int) (Math.atan2((double) local231, (double) local241) * -2607.5945876176133D) & 0x3FFF;
		if (local263 < 1024) {
			local263 = 1024;
		}
		if (local263 > 3072) {
			local263 = 3072;
		}
		if (local263 > Static272.anInt5295) {
			Static272.anInt5295 += Static133.anInt2876 + Static31.anInt789 * (local263 - Static272.anInt5295 >> 3) / 1000 << 3;
			if (local263 < Static272.anInt5295) {
				Static272.anInt5295 = local263;
			}
		}
		if (Static272.anInt5295 > local263) {
			Static272.anInt5295 -= Static133.anInt2876 + (Static272.anInt5295 - local263 >> 3) * Static31.anInt789 / 1000 << 3;
			if (Static272.anInt5295 < local263) {
				Static272.anInt5295 = local263;
			}
		}
		@Pc(345) int local345 = local274 - Static320.anInt4362;
		if (local345 > 8192) {
			local345 -= 16384;
		}
		if (local345 < -8192) {
			local345 += 16384;
		}
		local345 >>= 0x3;
		if (local345 > 0) {
			Static320.anInt4362 += Static133.anInt2876 + Static31.anInt789 * local345 / 1000 << 3;
			Static320.anInt4362 &= 0x3FFF;
		}
		if (local345 < 0) {
			Static320.anInt4362 -= Static31.anInt789 * -local345 / 1000 + Static133.anInt2876 << 3;
			Static320.anInt4362 &= 0x3FFF;
		}
		@Pc(406) int local406 = local274 - Static320.anInt4362;
		if (local406 > 8192) {
			local406 -= 16384;
		}
		if (local406 < -8192) {
			local406 += 16384;
		}
		Static129.anInt2810 = 0;
		if (local406 < 0 && local345 > 0 || local406 > 0 && local345 < 0) {
			Static320.anInt4362 = local274;
		}
	}
}
