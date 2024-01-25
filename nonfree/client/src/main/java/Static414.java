import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!us", name = "T", descriptor = "Lclient!ok;")
	public static Class178 aClass178_126;

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(III)V")
	public static void method5212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class7_Sub4_Sub14 local12 = Static54.method750(arg0, 5);
		local12.method4716();
		local12.anInt5868 = arg1;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIBLclient!kh;I)V")
	public static void method5213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class26_Sub2_Sub4 arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class78 local14 = arg2.method5507();
		@Pc(24) int local24 = arg2.anInt7072 - arg2.aClass158_7.anInt4265 & 0x3FFF;
		if (arg3 == -1) {
			if (local24 != 0 || arg2.anInt7062 > 25) {
				arg2.aBoolean475 = false;
				if (arg0 < 0 && local14.anInt2298 != -1) {
					arg2.anInt7103 = local14.anInt2298;
				} else if (arg0 <= 0 || local14.anInt2280 == -1) {
					arg2.anInt7103 = local14.anInt2259;
				} else {
					arg2.anInt7103 = local14.anInt2280;
				}
			} else if (!arg2.aBoolean475 || !local14.method1922(arg2.anInt7103)) {
				arg2.anInt7103 = local14.method1925();
				arg2.aBoolean475 = arg2.anInt7103 != -1;
			}
		} else if (arg2.anInt7060 != -1 && (local24 >= 10240 || local24 <= 2048)) {
			@Pc(52) int local52 = Static110.anIntArray157[arg1] - arg2.aClass158_7.anInt4265 & 0x3FFF;
			if (arg3 == 2 && local14.anInt2289 != -1) {
				if (local52 > 2048 && local52 <= 6144 && local14.anInt2263 != -1) {
					arg2.anInt7103 = local14.anInt2263;
				} else if (local52 >= 10240 && local52 < 14336 && local14.anInt2274 != -1) {
					arg2.anInt7103 = local14.anInt2274;
				} else if (local52 <= 6144 || local52 >= 10240 || local14.anInt2291 == -1) {
					arg2.anInt7103 = local14.anInt2289;
				} else {
					arg2.anInt7103 = local14.anInt2291;
				}
			} else if (arg3 == 0 && local14.anInt2273 != -1) {
				if (local52 > 2048 && local52 <= 6144 && local14.anInt2272 != -1) {
					arg2.anInt7103 = local14.anInt2272;
				} else if (local52 >= 10240 && local52 < 14336 && local14.anInt2296 != -1) {
					arg2.anInt7103 = local14.anInt2296;
				} else if (local52 <= 6144 || local52 >= 10240 || local14.anInt2268 == -1) {
					arg2.anInt7103 = local14.anInt2273;
				} else {
					arg2.anInt7103 = local14.anInt2268;
				}
			} else if (local52 > 2048 && local52 <= 6144 && local14.anInt2260 != -1) {
				arg2.anInt7103 = local14.anInt2260;
			} else if (local52 >= 10240 && local52 < 14336 && local14.anInt2294 != -1) {
				arg2.anInt7103 = local14.anInt2294;
			} else if (local52 <= 6144 || local52 >= 10240 || local14.anInt2283 == -1) {
				arg2.anInt7103 = local14.anInt2259;
			} else {
				arg2.anInt7103 = local14.anInt2283;
			}
			arg2.aBoolean475 = false;
		} else if (local24 == 0 && arg2.anInt7062 <= 25) {
			arg2.aBoolean475 = false;
			if (arg3 == 2 && local14.anInt2289 != -1) {
				arg2.anInt7103 = local14.anInt2289;
			} else if (arg3 == 0 && local14.anInt2273 != -1) {
				arg2.anInt7103 = local14.anInt2273;
			} else {
				arg2.anInt7103 = local14.anInt2259;
			}
		} else {
			arg2.aBoolean475 = false;
			if (arg3 == 2 && local14.anInt2289 != -1) {
				if (arg0 < 0 && local14.anInt2256 != -1) {
					arg2.anInt7103 = local14.anInt2256;
				} else if (arg0 <= 0 || local14.anInt2288 == -1) {
					arg2.anInt7103 = local14.anInt2289;
				} else {
					arg2.anInt7103 = local14.anInt2288;
				}
			} else if (arg3 == 0 && local14.anInt2273 != -1) {
				if (arg0 < 0 && local14.anInt2297 != -1) {
					arg2.anInt7103 = local14.anInt2297;
				} else if (arg0 <= 0 || local14.anInt2265 == -1) {
					arg2.anInt7103 = local14.anInt2273;
				} else {
					arg2.anInt7103 = local14.anInt2265;
				}
			} else if (arg0 < 0 && local14.anInt2275 != -1) {
				arg2.anInt7103 = local14.anInt2275;
			} else if (arg0 <= 0 || local14.anInt2277 == -1) {
				arg2.anInt7103 = local14.anInt2259;
			} else {
				arg2.anInt7103 = local14.anInt2277;
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "f", descriptor = "(I)Lclient!rt;")
	public static Class131 method5215() {
		try {
			return (Class131) Class.forName("Class131_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
