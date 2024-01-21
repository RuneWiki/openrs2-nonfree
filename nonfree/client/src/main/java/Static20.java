import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Z")
	public static boolean aBoolean31;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public static int anInt631 = 0;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!sg;")
	private static Class77 aClass77_276 = Static146.method2172("K");

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!sg;")
	public static Class77 aClass77_277 = aClass77_276;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "Lclient!sg;")
	private static Class77 aClass77_281 = Static146.method2172("Please use a different world)3");

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!sg;")
	public static Class77 aClass77_278 = aClass77_281;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	public static int anInt637 = 0;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!sg;")
	public static Class77 aClass77_279 = Static146.method2172("Titelbild geladen)3");

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!sg;")
	public static Class77 aClass77_280 = aClass77_276;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "[I")
	public static int[] anIntArray86 = new int[500];

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "Lclient!sg;")
	public static Class77 aClass77_282 = Static146.method2172("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "Lclient!sg;")
	public static Class77 aClass77_283 = aClass77_281;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Z")
	public static boolean method445() {
		try {
			if (Static176.anInt4481 == 2) {
				if (Static13.aClass2_Sub4_1 == null) {
					Static13.aClass2_Sub4_1 = Static182.method273(Static3.aClass43_1, Static42.anInt1180, Static71.anInt1924);
					if (Static13.aClass2_Sub4_1 == null) {
						return false;
					}
				}
				if (Static139.aClass33_1 == null) {
					Static139.aClass33_1 = new Class33(Static178.aClass43_45, Static4.aClass43_41);
				}
				if (Static136.aClass2_Sub9_Sub3_1.method2493(Static143.aClass43_33, Static13.aClass2_Sub4_1, Static139.aClass33_1)) {
					Static136.aClass2_Sub9_Sub3_1.method2477();
					Static136.aClass2_Sub9_Sub3_1.method2463(Static58.anInt1528);
					Static136.aClass2_Sub9_Sub3_1.method2479(Static120.aBoolean53, Static13.aClass2_Sub4_1);
					Static3.aClass43_1 = null;
					Static13.aClass2_Sub4_1 = null;
					Static176.anInt4481 = 0;
					Static139.aClass33_1 = null;
					return true;
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static136.aClass2_Sub9_Sub3_1.method2474();
			Static176.anInt4481 = 0;
			Static13.aClass2_Sub4_1 = null;
			Static139.aClass33_1 = null;
			Static3.aClass43_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[B)V")
	public static void method453(@OriginalArg(1) byte[] arg0) {
		@Pc(4) Class2_Sub18 local4 = new Class2_Sub18(arg0);
		local4.anInt3423 = arg0.length - 2;
		Static124.anInt3039 = local4.method2353();
		Static37.anIntArray175 = new int[Static124.anInt3039];
		Static170.aByteArrayArray10 = new byte[Static124.anInt3039][];
		Static178.anIntArray637 = new int[Static124.anInt3039];
		Static160.anIntArray642 = new int[Static124.anInt3039];
		Static2.anIntArray15 = new int[Static124.anInt3039];
		local4.anInt3423 = arg0.length - Static124.anInt3039 * 8 - 7;
		Static15.anInt483 = local4.method2353();
		Static138.anInt3346 = local4.method2353();
		@Pc(59) int local59 = (local4.method2387() & 0xFF) + 1;
		for (@Pc(61) int local61 = 0; local61 < Static124.anInt3039; local61++) {
			Static160.anIntArray642[local61] = local4.method2353();
		}
		for (@Pc(78) int local78 = 0; local78 < Static124.anInt3039; local78++) {
			Static37.anIntArray175[local78] = local4.method2353();
		}
		for (@Pc(95) int local95 = 0; local95 < Static124.anInt3039; local95++) {
			Static178.anIntArray637[local95] = local4.method2353();
		}
		for (@Pc(108) int local108 = 0; local108 < Static124.anInt3039; local108++) {
			Static2.anIntArray15[local108] = local4.method2353();
		}
		local4.anInt3423 = arg0.length + 3 - local59 * 3 - Static124.anInt3039 * 8 - 7;
		Static173.anIntArray623 = new int[local59];
		for (@Pc(145) int local145 = 1; local145 < local59; local145++) {
			Static173.anIntArray623[local145] = local4.method2341();
			if (Static173.anIntArray623[local145] == 0) {
				Static173.anIntArray623[local145] = 1;
			}
		}
		local4.anInt3423 = 0;
		for (@Pc(169) int local169 = 0; local169 < Static124.anInt3039; local169++) {
			@Pc(174) int local174 = Static178.anIntArray637[local169];
			@Pc(178) int local178 = Static2.anIntArray15[local169];
			@Pc(182) int local182 = local174 * local178;
			@Pc(185) byte[] local185 = new byte[local182];
			Static170.aByteArrayArray10[local169] = local185;
			@Pc(193) int local193 = local4.method2387();
			@Pc(200) int local200;
			if (local193 == 0) {
				for (local200 = 0; local200 < local182; local200++) {
					local185[local200] = local4.method2392();
				}
			} else if (local193 == 1) {
				for (local200 = 0; local200 < local174; local200++) {
					for (@Pc(203) int local203 = 0; local203 < local178; local203++) {
						local185[local200 + local174 * local203] = local4.method2392();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public static void method455() {
		aClass77_282 = null;
		aClass77_278 = null;
		aClass77_279 = null;
		aClass77_280 = null;
		aClass77_277 = null;
		aClass77_283 = null;
		anIntArray86 = null;
		aClass77_281 = null;
		aClass77_276 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B[B)[B")
	public static byte[] method456(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static186.method1561(arg0, 0, local14, 0, local6);
		return local14;
	}
}
