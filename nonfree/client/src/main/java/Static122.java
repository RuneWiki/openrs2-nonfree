import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "[I")
	public static int[] anIntArray142 = new int[5];

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!ec;")
	private static Class22 aClass22_340 = Static60.method1113("Unable to connect)3");

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Lclient!ec;")
	public static Class22 aClass22_339 = aClass22_340;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	public static int anInt1376 = 0;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	public static int anInt1377 = 0;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_341 = aClass22_340;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "Lclient!ec;")
	public static Class22 aClass22_342 = Static60.method1113("<img=1>");

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "Lclient!ec;")
	public static Class22 aClass22_343 = Static60.method1113(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "Lclient!ec;")
	public static Class22 aClass22_344 = Static60.method1113(":assist:");

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method944() {
		aClass22_340 = null;
		aBooleanArray7 = null;
		anIntArray142 = null;
		aClass22_342 = null;
		aClass22_341 = null;
		aClass22_343 = null;
		aClass22_344 = null;
		aClass22_339 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!qd;I)V")
	public static void method946(@OriginalArg(0) Class4_Sub1_Sub3_Sub2 arg0) {
		arg0.anInt2470 = arg0.anInt2452;
		if (arg0.anInt2460 == 0) {
			arg0.anInt2458 = 0;
			return;
		}
		if (arg0.anInt2474 != -1 && arg0.anInt2477 == 0) {
			@Pc(36) Class4_Sub1_Sub17 local36 = Static79.method1437(arg0.anInt2474);
			if (arg0.anInt2501 > 0 && local36.anInt2996 == 0) {
				arg0.anInt2458++;
				return;
			}
			if (arg0.anInt2501 <= 0 && local36.anInt2995 == 0) {
				arg0.anInt2458++;
				return;
			}
		}
		@Pc(68) int local68 = arg0.anInt2500;
		@Pc(71) int local71 = arg0.anInt2462;
		@Pc(86) int local86 = arg0.anInt2473 * 64 + arg0.anIntArray277[arg0.anInt2460 - 1] * 128;
		@Pc(101) int local101 = arg0.anInt2473 * 64 + arg0.anIntArray280[arg0.anInt2460 - 1] * 128;
		if (local101 - local68 > 256 || local101 - local68 < -256 || local86 - local71 > 256 || local86 - local71 < -256) {
			arg0.anInt2500 = local101;
			arg0.anInt2462 = local86;
			return;
		}
		if (local101 <= local68) {
			if (local101 >= local68) {
				if (local86 > local71) {
					arg0.anInt2496 = 1024;
				} else if (local86 < local71) {
					arg0.anInt2496 = 0;
				}
			} else if (local86 > local71) {
				arg0.anInt2496 = 768;
			} else if (local86 < local71) {
				arg0.anInt2496 = 256;
			} else {
				arg0.anInt2496 = 512;
			}
		} else if (local71 < local86) {
			arg0.anInt2496 = 1280;
		} else if (local71 <= local86) {
			arg0.anInt2496 = 1536;
		} else {
			arg0.anInt2496 = 1792;
		}
		@Pc(204) int local204 = 4;
		@Pc(206) boolean local206 = true;
		@Pc(215) int local215 = arg0.anInt2496 - arg0.anInt2499 & 0x7FF;
		if (local215 > 1024) {
			local215 -= 2048;
		}
		@Pc(224) int local224 = arg0.anInt2491;
		if (local215 >= -256 && local215 <= 256) {
			local224 = arg0.anInt2471;
		} else if (local215 >= 256 && local215 < 768) {
			local224 = arg0.anInt2487;
		} else if (local215 >= -768 && local215 <= -256) {
			local224 = arg0.anInt2481;
		}
		if (local224 == -1) {
			local224 = arg0.anInt2471;
		}
		arg0.anInt2470 = local224;
		if (arg0 instanceof Class4_Sub1_Sub3_Sub2_Sub2) {
			local206 = ((Class4_Sub1_Sub3_Sub2_Sub2) arg0).aClass4_Sub1_Sub10_1.aBoolean191;
		}
		if (local206) {
			if (arg0.anInt2499 != arg0.anInt2496 && arg0.anInt2509 == -1 && arg0.anInt2457 != 0) {
				local204 = 2;
			}
			if (arg0.anInt2460 > 2) {
				local204 = 6;
			}
			if (arg0.anInt2460 > 3) {
				local204 = 8;
			}
			if (arg0.anInt2458 > 0 && arg0.anInt2460 > 1) {
				local204 = 8;
				arg0.anInt2458--;
			}
		} else {
			if (arg0.anInt2460 > 1) {
				local204 = 6;
			}
			if (arg0.anInt2460 > 2) {
				local204 = 8;
			}
			if (arg0.anInt2458 > 0 && arg0.anInt2460 > 1) {
				local204 = 8;
				arg0.anInt2458--;
			}
		}
		if (arg0.aBooleanArray19[arg0.anInt2460 - 1]) {
			local204 <<= 0x1;
		}
		if (local68 < local101) {
			arg0.anInt2500 += local204;
			if (arg0.anInt2500 > local101) {
				arg0.anInt2500 = local101;
			}
		} else if (local68 > local101) {
			arg0.anInt2500 -= local204;
			if (arg0.anInt2500 < local101) {
				arg0.anInt2500 = local101;
			}
		}
		if (local204 >= 8 && arg0.anInt2471 == arg0.anInt2470 && arg0.anInt2467 != -1) {
			arg0.anInt2470 = arg0.anInt2467;
		}
		if (local86 > local71) {
			arg0.anInt2462 += local204;
			if (local86 < arg0.anInt2462) {
				arg0.anInt2462 = local86;
			}
		} else if (local86 < local71) {
			arg0.anInt2462 -= local204;
			if (local86 > arg0.anInt2462) {
				arg0.anInt2462 = local86;
			}
		}
		if (arg0.anInt2500 == local101 && arg0.anInt2462 == local86) {
			if (arg0.anInt2501 > 0) {
				arg0.anInt2501--;
			}
			arg0.anInt2460--;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!f;B)Lclient!f;")
	public static Class4_Sub7 method948(@OriginalArg(0) Class4_Sub7 arg0) {
		@Pc(7) Class4_Sub7 local7 = Static13.method225(arg0);
		if (local7 == null) {
			local7 = arg0.aClass4_Sub7_7;
		}
		return local7;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)Z")
	public static boolean method950() {
		@Pc(5) Class44 local5 = Static33.aClass44_1;
		synchronized (Static33.aClass44_1) {
			if (Static34.anInt856 == Static1.anInt2) {
				return false;
			} else {
				Static11.anInt2985 = Static121.anIntArray316[Static1.anInt2];
				Static90.anInt2393 = Static88.anIntArray271[Static1.anInt2];
				Static1.anInt2 = Static1.anInt2 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZB)Lclient!ec;")
	public static Class22 method951(@OriginalArg(0) int arg0) {
		return Static103.method1719(arg0, true);
	}
}
