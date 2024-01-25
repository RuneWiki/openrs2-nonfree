import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
	public static int anInt5123;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "[[B")
	public static final byte[][] aByteArrayArray18 = new byte[50][];

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
	public static int anInt5133 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILclient!jq;I)V")
	public static void method4606(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub5_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class88 local11 = arg2.method4805();
		@Pc(20) int local20 = arg2.anInt5349 - arg2.aClass207_7.anInt6598 & 0x3FFF;
		if (arg0 == -1) {
			if (local20 != 0 || arg2.anInt5412 > 25) {
				arg2.aBoolean446 = false;
				if (arg3 < 0 && local11.anInt2284 != -1) {
					arg2.anInt5361 = local11.anInt2284;
				} else if (arg3 <= 0 || local11.anInt2271 == -1) {
					arg2.anInt5361 = local11.anInt2287;
				} else {
					arg2.anInt5361 = local11.anInt2271;
				}
			} else if (!arg2.aBoolean446 || !local11.method2143(arg2.anInt5361)) {
				arg2.anInt5361 = local11.method2144();
				arg2.aBoolean446 = arg2.anInt5361 != -1;
			}
		} else if (arg2.anInt5362 != -1 && (local20 >= 10240 || local20 <= 2048)) {
			@Pc(112) int local112 = Static124.anIntArray226[arg1] - arg2.aClass207_7.anInt6598 & 0x3FFF;
			if (arg0 == 2 && local11.anInt2272 != -1) {
				if (local112 > 2048 && local112 <= 6144 && local11.anInt2290 != -1) {
					arg2.anInt5361 = local11.anInt2290;
				} else if (local112 >= 10240 && local112 < 14336 && local11.anInt2275 != -1) {
					arg2.anInt5361 = local11.anInt2275;
				} else if (local112 <= 6144 || local112 >= 10240 || local11.anInt2286 == -1) {
					arg2.anInt5361 = local11.anInt2272;
				} else {
					arg2.anInt5361 = local11.anInt2286;
				}
			} else if (arg0 == 0 && local11.anInt2276 != -1) {
				if (local112 > 2048 && local112 <= 6144 && local11.anInt2314 != -1) {
					arg2.anInt5361 = local11.anInt2314;
				} else if (local112 >= 10240 && local112 < 14336 && local11.anInt2305 != -1) {
					arg2.anInt5361 = local11.anInt2305;
				} else if (local112 <= 6144 || local112 >= 10240 || local11.anInt2308 == -1) {
					arg2.anInt5361 = local11.anInt2276;
				} else {
					arg2.anInt5361 = local11.anInt2308;
				}
			} else if (local112 > 2048 && local112 <= 6144 && local11.anInt2281 != -1) {
				arg2.anInt5361 = local11.anInt2281;
			} else if (local112 >= 10240 && local112 < 14336 && local11.anInt2288 != -1) {
				arg2.anInt5361 = local11.anInt2288;
			} else if (local112 <= 6144 || local112 >= 10240 || local11.anInt2297 == -1) {
				arg2.anInt5361 = local11.anInt2287;
			} else {
				arg2.anInt5361 = local11.anInt2297;
			}
			arg2.aBoolean446 = false;
		} else if (local20 == 0 && arg2.anInt5412 <= 25) {
			if (arg0 == 2 && local11.anInt2272 != -1) {
				arg2.anInt5361 = local11.anInt2272;
			} else if (arg0 == 0 && local11.anInt2276 != -1) {
				arg2.anInt5361 = local11.anInt2276;
			} else {
				arg2.anInt5361 = local11.anInt2287;
			}
			arg2.aBoolean446 = false;
		} else {
			arg2.aBoolean446 = false;
			if (arg0 == 2 && local11.anInt2272 != -1) {
				if (arg3 < 0 && local11.anInt2279 != -1) {
					arg2.anInt5361 = local11.anInt2279;
				} else if (arg3 <= 0 || local11.anInt2301 == -1) {
					arg2.anInt5361 = local11.anInt2272;
				} else {
					arg2.anInt5361 = local11.anInt2301;
				}
			} else if (arg0 == 0 && local11.anInt2276 != -1) {
				if (arg3 < 0 && local11.anInt2280 != -1) {
					arg2.anInt5361 = local11.anInt2280;
				} else if (arg3 <= 0 || local11.anInt2309 == -1) {
					arg2.anInt5361 = local11.anInt2276;
				} else {
					arg2.anInt5361 = local11.anInt2309;
				}
			} else if (arg3 < 0 && local11.anInt2311 != -1) {
				arg2.anInt5361 = local11.anInt2311;
			} else if (arg3 <= 0 || local11.anInt2299 == -1) {
				arg2.anInt5361 = local11.anInt2287;
			} else {
				arg2.anInt5361 = local11.anInt2299;
			}
		}
	}
}
