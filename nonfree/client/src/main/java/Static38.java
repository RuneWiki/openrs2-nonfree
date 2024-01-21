import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "Lclient!od;")
	public static Class60 aClass60_388 = Static41.method597("Hidden)2use");

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
	public static final int anInt1038 = 50;

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "[Lclient!od;")
	public static Class60[] aClass60Array6 = new Class60[anInt1038];

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "[I")
	public static int[] anIntArray100 = new int[anInt1038];

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "[I")
	public static int[] anIntArray101 = new int[anInt1038];

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "Lclient!od;")
	private static Class60 aClass60_389 = Static41.method597("button near the top of that page)3");

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "[I")
	public static int[] anIntArray102 = new int[anInt1038];

	@OriginalMember(owner = "client!ff", name = "x", descriptor = "[I")
	public static int[] anIntArray103 = new int[anInt1038];

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "Lclient!od;")
	public static Class60 aClass60_390 = Static41.method597("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "Lclient!cb;")
	public static Class12 aClass12_8 = new Class12(100);

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "[I")
	public static int[] anIntArray104 = new int[anInt1038];

	@OriginalMember(owner = "client!ff", name = "D", descriptor = "Lclient!od;")
	public static Class60 aClass60_391 = aClass60_389;

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "[I")
	public static int[] anIntArray105 = new int[anInt1038];

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "[I")
	public static int[] anIntArray106 = new int[anInt1038];

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
	public static int anInt1041 = 2;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	public static void method574() {
		@Pc(9) int local9 = Static48.anInt1187 * 128 + 64;
		@Pc(15) int local15 = Static63.anInt1596 * 128 + 64;
		@Pc(24) int local24 = Static55.method882(local15, local9, Static77.anInt1866) - Static7.anInt84;
		if (Static109.anInt2592 < local15) {
			Static109.anInt2592 += Static110.anInt2613 * (local15 - Static109.anInt2592) / 1000 + Static118.anInt2736;
			if (local15 < Static109.anInt2592) {
				Static109.anInt2592 = local15;
			}
		}
		if (Static109.anInt2592 > local15) {
			Static109.anInt2592 -= Static110.anInt2613 * (Static109.anInt2592 - local15) / 1000 + Static118.anInt2736;
			if (local15 > Static109.anInt2592) {
				Static109.anInt2592 = local15;
			}
		}
		local15 = Static65.anInt1642 * 128 + 64;
		if (local24 > Static23.anInt816) {
			Static23.anInt816 += (local24 - Static23.anInt816) * Static110.anInt2613 / 1000 + Static118.anInt2736;
			if (local24 < Static23.anInt816) {
				Static23.anInt816 = local24;
			}
		}
		if (local24 < Static23.anInt816) {
			Static23.anInt816 -= Static110.anInt2613 * (Static23.anInt816 - local24) / 1000 + Static118.anInt2736;
			if (local24 > Static23.anInt816) {
				Static23.anInt816 = local24;
			}
		}
		if (local9 > Static98.anInt2286) {
			Static98.anInt2286 += Static118.anInt2736 + (local9 - Static98.anInt2286) * Static110.anInt2613 / 1000;
			if (Static98.anInt2286 > local9) {
				Static98.anInt2286 = local9;
			}
		}
		if (Static98.anInt2286 > local9) {
			Static98.anInt2286 -= (Static98.anInt2286 - local9) * Static110.anInt2613 / 1000 + Static118.anInt2736;
			if (Static98.anInt2286 < local9) {
				Static98.anInt2286 = local9;
			}
		}
		local9 = Static111.anInt2638 * 128 + 64;
		local24 = Static55.method882(local15, local9, Static77.anInt1866) - Static18.anInt620;
		@Pc(210) int local210 = local24 - Static23.anInt816;
		@Pc(214) int local214 = local9 - Static98.anInt2286;
		@Pc(219) int local219 = local15 - Static109.anInt2592;
		@Pc(230) int local230 = (int) Math.sqrt((double) (local214 * local214 + local219 * local219));
		@Pc(241) int local241 = (int) (Math.atan2((double) local210, (double) local230) * 325.949D) & 0x7FF;
		if (local241 < 128) {
			local241 = 128;
		}
		if (local241 > 383) {
			local241 = 383;
		}
		@Pc(262) int local262 = (int) (-325.949D * Math.atan2((double) local214, (double) local219)) & 0x7FF;
		@Pc(267) int local267 = local262 - Static108.anInt2581;
		if (Static23.anInt806 < local241) {
			Static23.anInt806 += Static68.anInt1707 + Static3.anInt44 * (local241 - Static23.anInt806) / 1000;
			if (local241 < Static23.anInt806) {
				Static23.anInt806 = local241;
			}
		}
		if (local241 < Static23.anInt806) {
			Static23.anInt806 -= (Static23.anInt806 - local241) * Static3.anInt44 / 1000 + Static68.anInt1707;
			if (Static23.anInt806 < local241) {
				Static23.anInt806 = local241;
			}
		}
		if (local267 > 1024) {
			local267 -= 2048;
		}
		if (local267 < -1024) {
			local267 += 2048;
		}
		if (local267 > 0) {
			Static108.anInt2581 += Static68.anInt1707 + Static3.anInt44 * local267 / 1000;
			Static108.anInt2581 &= 0x7FF;
		}
		if (local267 < 0) {
			Static108.anInt2581 -= Static68.anInt1707 + -local267 * Static3.anInt44 / 1000;
			Static108.anInt2581 &= 0x7FF;
		}
		@Pc(361) int local361 = local262 - Static108.anInt2581;
		if (local361 > 1024) {
			local361 -= 2048;
		}
		if (local361 < -1024) {
			local361 += 2048;
		}
		if (local361 < 0 && local267 > 0 || local361 > 0 && local267 < 0) {
			Static108.anInt2581 = local262;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!sa;B)I")
	public static int method575(@OriginalArg(0) Class4_Sub14 arg0) {
		@Pc(22) Class4_Sub8 local22 = (Class4_Sub8) Static128.aClass75_14.method1896((long) arg0.anInt2403 + ((long) arg0.anInt2388 << 32));
		return local22 == null ? arg0.anInt2433 : local22.anInt1034;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z")
	public static boolean method576(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public static void method577() {
		aClass60_390 = null;
		anIntArray104 = null;
		aClass12_8 = null;
		anIntArray103 = null;
		anIntArray105 = null;
		aClass60Array6 = null;
		aClass60_391 = null;
		anIntArray100 = null;
		anIntArray101 = null;
		anIntArray106 = null;
		aClass60_388 = null;
		aClass60_389 = null;
		anIntArray102 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJ)V")
	public static void method578(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static14.aClass4_Sub9_Sub1_1.method826(131);
			Static14.aClass4_Sub9_Sub1_1.method805(arg0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
	public static void method579() {
		Static22.aClass12_7.method284();
		Static128.aClass12_29.method284();
	}
}
