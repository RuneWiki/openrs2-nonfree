import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!jd", name = "Z", descriptor = "[I")
	public static int[] anIntArray189;

	@OriginalMember(owner = "client!jd", name = "hb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_934 = Static80.method1463(" seconds)3");

	@OriginalMember(owner = "client!jd", name = "cb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_932 = aClass63_934;

	@OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
	public static int anInt1765 = 0;

	@OriginalMember(owner = "client!jd", name = "fb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_933 = Static80.method1463("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!jd", name = "gb", descriptor = "I")
	public static int anInt1766 = 0;

	@OriginalMember(owner = "client!jd", name = "jb", descriptor = "I")
	public static int anInt1768 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!wa;B)Z")
	public static boolean method1158(@OriginalArg(0) Class6_Sub3_Sub17 arg0) {
		@Pc(13) int local13 = arg0.anInt3248;
		if (local13 >= 1 && local13 <= 200 || !(local13 < 701 || local13 > 900)) {
			if (local13 >= 801) {
				local13 -= 701;
			} else if (local13 >= 701) {
				local13 -= 601;
			} else if (local13 >= 101) {
				local13 -= 101;
			} else {
				local13--;
			}
			Static19.method501(0, Static15.method374(new Class63[] { Static102.aClass63_1535, Static65.aClass63Array16[local13] }), 0, 0, 17, Static74.aClass63_1081);
			Static19.method501(0, Static15.method374(new Class63[] { Static102.aClass63_1535, Static65.aClass63Array16[local13] }), 0, 0, 24, Static111.aClass63_1656);
			return true;
		} else if (local13 >= 401 && local13 <= 500) {
			Static19.method501(0, Static15.method374(new Class63[] { Static102.aClass63_1535, arg0.aClass63_1765 }), 0, 0, 22, Static74.aClass63_1081);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!ge;Lclient!ge;IZ)Lclient!jd;")
	public static Class6_Sub3_Sub11 method1159(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class7 arg2) {
		@Pc(10) int[] local10 = arg2.method113(arg0);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local10.length; local14++) {
			@Pc(24) byte[] local24 = arg2.method114(local10[local14], arg0);
			if (local24 == null) {
				local12 = false;
			} else {
				@Pc(44) int local44 = local24[1] & 0xFF | (local24[0] & 0xFF) << 8;
				@Pc(60) byte[] local60 = arg1.method114(0, local44);
				if (local60 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class6_Sub3_Sub11(arg2, arg1, arg0, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
	public static void method1160() {
		aClass63_933 = null;
		anIntArray189 = null;
		aClass63_932 = null;
		aClass63_934 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!dc;)V")
	public static void method1163(@OriginalArg(1) Class6_Sub3_Sub1_Sub2 arg0) {
		arg0.anInt2308 = arg0.anInt2328;
		if (arg0.anInt2337 == 0) {
			arg0.anInt2302 = 0;
			return;
		}
		if (arg0.anInt2307 != -1 && arg0.anInt2314 == 0) {
			@Pc(28) Class6_Sub3_Sub7 local28 = Static30.method721(arg0.anInt2307);
			if (arg0.anInt2299 > 0 && local28.anInt1325 == 0) {
				arg0.anInt2302++;
				return;
			}
			if (arg0.anInt2299 <= 0 && local28.anInt1312 == 0) {
				arg0.anInt2302++;
				return;
			}
		}
		@Pc(66) int local66 = arg0.anInt2319;
		@Pc(82) int local82 = arg0.anIntArray273[arg0.anInt2337 - 1] * 128 + arg0.anInt2296 * 64;
		@Pc(97) int local97 = arg0.anInt2296 * 64 + arg0.anIntArray271[arg0.anInt2337 - 1] * 128;
		@Pc(100) int local100 = arg0.anInt2347;
		if (local82 - local66 > 256 || local82 - local66 < -256 || local97 - local100 > 256 || local97 - local100 < -256) {
			arg0.anInt2347 = local97;
			arg0.anInt2319 = local82;
			return;
		}
		@Pc(141) int local141 = arg0.anInt2317;
		if (local66 >= local82) {
			if (local66 > local82) {
				if (local97 > local100) {
					arg0.anInt2309 = 768;
				} else if (local100 > local97) {
					arg0.anInt2309 = 256;
				} else {
					arg0.anInt2309 = 512;
				}
			} else if (local97 > local100) {
				arg0.anInt2309 = 1024;
			} else if (local97 < local100) {
				arg0.anInt2309 = 0;
			}
		} else if (local100 < local97) {
			arg0.anInt2309 = 1280;
		} else if (local100 > local97) {
			arg0.anInt2309 = 1792;
		} else {
			arg0.anInt2309 = 1536;
		}
		@Pc(231) int local231 = arg0.anInt2309 - arg0.anInt2301 & 0x7FF;
		if (local231 > 1024) {
			local231 -= 2048;
		}
		@Pc(237) boolean local237 = true;
		@Pc(239) int local239 = 4;
		if (local231 >= -256 && local231 <= 256) {
			local141 = arg0.anInt2330;
		} else if (local231 >= 256 && local231 < 768) {
			local141 = arg0.anInt2321;
		} else if (local231 >= -768 && local231 <= -256) {
			local141 = arg0.anInt2293;
		}
		if (local141 == -1) {
			local141 = arg0.anInt2330;
		}
		arg0.anInt2308 = local141;
		if (arg0 instanceof Class6_Sub3_Sub1_Sub2_Sub1) {
			local237 = ((Class6_Sub3_Sub1_Sub2_Sub1) arg0).aClass6_Sub3_Sub2_1.aBoolean27;
		}
		if (local237) {
			if (arg0.anInt2301 != arg0.anInt2309 && arg0.anInt2300 == -1 && arg0.anInt2320 != 0) {
				local239 = 2;
			}
			if (arg0.anInt2337 > 2) {
				local239 = 6;
			}
			if (arg0.anInt2337 > 3) {
				local239 = 8;
			}
			if (arg0.anInt2302 > 0 && arg0.anInt2337 > 1) {
				local239 = 8;
				arg0.anInt2302--;
			}
		} else {
			if (arg0.anInt2337 > 1) {
				local239 = 6;
			}
			if (arg0.anInt2337 > 2) {
				local239 = 8;
			}
			if (arg0.anInt2302 > 0 && arg0.anInt2337 > 1) {
				arg0.anInt2302--;
				local239 = 8;
			}
		}
		if (arg0.aBooleanArray12[arg0.anInt2337 - 1]) {
			local239 <<= 0x1;
		}
		if (local239 >= 8 && arg0.anInt2330 == arg0.anInt2308 && arg0.anInt2351 != -1) {
			arg0.anInt2308 = arg0.anInt2351;
		}
		if (local66 < local82) {
			arg0.anInt2319 += local239;
			if (local82 < arg0.anInt2319) {
				arg0.anInt2319 = local82;
			}
		} else if (local66 > local82) {
			arg0.anInt2319 -= local239;
			if (arg0.anInt2319 < local82) {
				arg0.anInt2319 = local82;
			}
		}
		if (local100 < local97) {
			arg0.anInt2347 += local239;
			if (arg0.anInt2347 > local97) {
				arg0.anInt2347 = local97;
			}
		} else if (local100 > local97) {
			arg0.anInt2347 -= local239;
			if (arg0.anInt2347 < local97) {
				arg0.anInt2347 = local97;
			}
		}
		if (arg0.anInt2319 == local82 && arg0.anInt2347 == local97) {
			if (arg0.anInt2299 > 0) {
				arg0.anInt2299--;
			}
			arg0.anInt2337--;
		}
	}
}
