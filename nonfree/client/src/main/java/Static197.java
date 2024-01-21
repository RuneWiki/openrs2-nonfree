import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
	public static int anInt3849;

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "Lclient!pj;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!ug", name = "P", descriptor = "Lclient!wa;")
	public static Class23 aClass23_75;

	@OriginalMember(owner = "client!ug", name = "Q", descriptor = "Z")
	public static boolean aBoolean175;

	@OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
	public static int anInt3852;

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "[S")
	public static final short[] aShortArray59 = new short[] { 2, 4, 25, 44, 3, 22, 16, 41 };

	@OriginalMember(owner = "client!ug", name = "K", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1452 = Static161.method2452("null");

	@OriginalMember(owner = "client!ug", name = "S", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1453 = Static161.method2452("Lade Sprites )2 ");

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BZ)V")
	public static void method2917(@OriginalArg(1) boolean arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static83.anInt1850; local7++) {
			@Pc(15) Class1_Sub2_Sub1 local15 = Static61.aClass1_Sub2_Sub1Array1[Static80.anIntArray175[local7]];
			@Pc(24) long local24 = (long) Static80.anIntArray175[local7] << 32 | 0x20000000L;
			if (local15 != null && local15.method1741() && local15.aClass5_Sub2_Sub20_1.aBoolean164 == arg0 && local15.aClass5_Sub2_Sub20_1.method2724()) {
				@Pc(49) int local49 = local15.anInt2241 >> 7;
				@Pc(54) int local54 = local15.anInt2234 >> 7;
				if (local49 >= 0 && local49 < 104 && local54 >= 0 && local54 < 104) {
					if (local15.anInt2238 == 1 && (local15.anInt2241 & 0x7F) == 64 && (local15.anInt2234 & 0x7F) == 64) {
						if (Static203.anInt3983 == Static57.anIntArrayArray13[local49][local54]) {
							continue;
						}
						Static57.anIntArrayArray13[local49][local54] = Static203.anInt3983;
					}
					if (!local15.aClass5_Sub2_Sub20_1.aBoolean165) {
						local24 |= Long.MIN_VALUE;
					}
					local15.anInt2231 = Static128.method1999(Static111.anInt2327, (local15.anInt2238 - 1) * 64 + local15.anInt2241, -64 - (-(local15.anInt2238 * 64) - local15.anInt2234));
					Static77.method2443(Static111.anInt2327, local15.anInt2241, local15.anInt2234, local15.anInt2231, local15.anInt2238 * 64 - 4, local15, local15.anInt2244, local24, local15.aBoolean96);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!re;)V")
	public static void method2918(@OriginalArg(1) Class1_Sub2 arg0) {
		arg0.anInt2215 = arg0.anInt2216;
		if (arg0.anInt2235 == 0) {
			arg0.anInt2213 = 0;
			return;
		}
		if (arg0.anInt2254 != -1 && arg0.anInt2262 == 0) {
			@Pc(32) Class5_Sub2_Sub22 local32 = Static14.method253(arg0.anInt2254);
			if (arg0.anInt2220 > 0 && local32.anInt3661 == 0) {
				arg0.anInt2213++;
				return;
			}
			if (arg0.anInt2220 <= 0 && local32.anInt3654 == 0) {
				arg0.anInt2213++;
				return;
			}
		}
		@Pc(67) int local67 = arg0.anInt2241;
		@Pc(70) int local70 = arg0.anInt2234;
		@Pc(85) int local85 = arg0.anInt2238 * 64 + arg0.anIntArray250[arg0.anInt2235 - 1] * 128;
		@Pc(100) int local100 = arg0.anInt2238 * 64 + arg0.anIntArray253[arg0.anInt2235 - 1] * 128;
		if (local85 - local67 > 256 || local85 - local67 < -256 || local100 - local70 > 256 || local100 - local70 < -256) {
			arg0.anInt2234 = local100;
			arg0.anInt2241 = local85;
			return;
		}
		if (local85 <= local67) {
			if (local67 > local85) {
				if (local100 > local70) {
					arg0.anInt2246 = 768;
				} else if (local100 >= local70) {
					arg0.anInt2246 = 512;
				} else {
					arg0.anInt2246 = 256;
				}
			} else if (local100 > local70) {
				arg0.anInt2246 = 1024;
			} else if (local100 < local70) {
				arg0.anInt2246 = 0;
			}
		} else if (local70 < local100) {
			arg0.anInt2246 = 1280;
		} else if (local70 <= local100) {
			arg0.anInt2246 = 1536;
		} else {
			arg0.anInt2246 = 1792;
		}
		@Pc(206) int local206 = arg0.anInt2230;
		@Pc(208) int local208 = 4;
		@Pc(217) int local217 = arg0.anInt2246 - arg0.anInt2244 & 0x7FF;
		if (local217 > 1024) {
			local217 -= 2048;
		}
		if (local217 >= -256 && local217 <= 256) {
			local206 = arg0.anInt2221;
		} else if (local217 >= 256 && local217 < 768) {
			local206 = arg0.anInt2243;
		} else if (local217 >= -768 && local217 <= -256) {
			local206 = arg0.anInt2259;
		}
		if (local206 == -1) {
			local206 = arg0.anInt2221;
		}
		@Pc(266) boolean local266 = true;
		arg0.anInt2215 = local206;
		if (arg0 instanceof Class1_Sub2_Sub1) {
			local266 = ((Class1_Sub2_Sub1) arg0).aClass5_Sub2_Sub20_1.aBoolean166;
		}
		if (local266) {
			if (arg0.anInt2244 != arg0.anInt2246 && arg0.anInt2249 == -1 && arg0.anInt2211 != 0) {
				local208 = 2;
			}
			if (arg0.anInt2235 > 2) {
				local208 = 6;
			}
			if (arg0.anInt2235 > 3) {
				local208 = 8;
			}
			if (arg0.anInt2213 > 0 && arg0.anInt2235 > 1) {
				arg0.anInt2213--;
				local208 = 8;
			}
		} else {
			if (arg0.anInt2235 > 1) {
				local208 = 6;
			}
			if (arg0.anInt2235 > 2) {
				local208 = 8;
			}
			if (arg0.anInt2213 > 0 && arg0.anInt2235 > 1) {
				local208 = 8;
				arg0.anInt2213--;
			}
		}
		if (arg0.aBooleanArray26[arg0.anInt2235 - 1]) {
			local208 <<= 0x1;
		}
		if (local100 > local70) {
			arg0.anInt2234 += local208;
			if (arg0.anInt2234 > local100) {
				arg0.anInt2234 = local100;
			}
		} else if (local70 > local100) {
			arg0.anInt2234 -= local208;
			if (arg0.anInt2234 < local100) {
				arg0.anInt2234 = local100;
			}
		}
		if (local208 >= 8 && arg0.anInt2221 == arg0.anInt2215 && arg0.anInt2240 != -1) {
			arg0.anInt2215 = arg0.anInt2240;
		}
		if (local85 > local67) {
			arg0.anInt2241 += local208;
			if (local85 < arg0.anInt2241) {
				arg0.anInt2241 = local85;
			}
		} else if (local85 < local67) {
			arg0.anInt2241 -= local208;
			if (arg0.anInt2241 < local85) {
				arg0.anInt2241 = local85;
			}
		}
		if (local85 != arg0.anInt2241 || arg0.anInt2234 != local100) {
			return;
		}
		arg0.anInt2235--;
		if (arg0.anInt2220 > 0) {
			arg0.anInt2220--;
			return;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!p;IIIII)V")
	public static void method2920(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) long local10 = 0L;
		if (arg2 == 0) {
			local10 = Static31.method509(arg5, arg0, arg4);
		}
		if (arg2 == 1) {
			local10 = Static7.method165(arg5, arg0, arg4);
		}
		if (arg2 == 2) {
			local10 = Static178.method2696(arg5, arg0, arg4);
		}
		if (arg2 == 3) {
			local10 = Static216.method3183(arg5, arg0, arg4);
		}
		if (local10 == 0L) {
			return;
		}
		@Pc(58) int local58 = Integer.MAX_VALUE & (int) (local10 >>> 32);
		@Pc(62) Class5_Sub2_Sub7 local62 = Static63.method1046(local58);
		@Pc(69) int local69 = (int) local10 >> 14 & 0x1F;
		@Pc(76) int local76 = (int) local10 >> 20 & 0x3;
		if (arg2 == 0) {
			Static105.method1713(arg5, arg0, arg4);
			if (local62.anInt548 != 0) {
				arg1.method2220(local62.aBoolean27, arg0, local69, local76, arg4);
			}
		}
		if (arg2 == 1) {
			Static88.method1472(arg5, arg0, arg4);
		}
		if (arg2 == 2) {
			Static111.method1772(arg5, arg0, arg4);
			if (local62.anInt548 != 0 && arg0 + local62.anInt517 < 104 && arg4 + local62.anInt517 < 104 && arg0 + local62.anInt519 < 104 && arg4 + local62.anInt519 < 104) {
				arg1.method2224(arg0, local62.anInt517, local62.aBoolean27, local62.anInt519, local76, arg4);
			}
		}
		if (arg2 != 3) {
			return;
		}
		Static94.method1541(arg5, arg0, arg4);
		if (local62.anInt548 == 1) {
			arg1.method2233(arg0, arg4);
			return;
		}
	}
}
