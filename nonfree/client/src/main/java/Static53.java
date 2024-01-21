import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Lclient!gd;")
	public static Class31 aClass31_6;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1357 = Static75.method1216("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!bb;")
	public static Class8 aClass8_29 = new Class8(64);

	@OriginalMember(owner = "client!je", name = "h", descriptor = "I")
	public static int anInt2474 = 0;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "[Lclient!ee;")
	public static Class24[] aClass24Array3 = new Class24[13];

	@OriginalMember(owner = "client!je", name = "j", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1358 = Static75.method1216("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1359 = Static75.method1216("backleft2");

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1360 = Static75.method1216("k");

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1361 = aClass4_1358;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1364 = Static75.method1216("Classic");

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1362 = aClass4_1364;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1363 = Static75.method1216("@yel@*V");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZLclient!ub;)V")
	public static void method1653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub1_Sub4_Sub2 arg2) {
		@Pc(12) int local12 = arg1 * arg1 + arg0 * arg0;
		if (local12 <= 4225 || local12 >= 90000) {
			Static87.method988(arg0, arg2, arg1);
			return;
		}
		@Pc(24) int local24 = Static111.anInt2786 + Static109.anInt2749 & 0x7FF;
		@Pc(28) int local28 = Static41.anIntArray149[local24];
		@Pc(36) int local36 = local28 * 256 / (Static89.anInt2041 + 256);
		@Pc(40) int local40 = Static41.anIntArray142[local24];
		@Pc(48) int local48 = local40 * 256 / (Static89.anInt2041 + 256);
		@Pc(58) int local58 = local48 * arg0 - arg1 * local36 >> 16;
		@Pc(68) int local68 = local48 * arg1 + local36 * arg0 >> 16;
		@Pc(74) double local74 = Math.atan2((double) local68, (double) local58);
		@Pc(80) int local80 = (int) (Math.sin(local74) * 63.0D);
		@Pc(86) int local86 = (int) (Math.cos(local74) * 57.0D);
		Static74.aClass3_Sub1_Sub4_Sub2_26.method1738(local80 + 98 - 10, 83 - local86 - 20, local74);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method1654() {
		Static58.anInt1430 = 0;
		@Pc(12) int local12 = (Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342 >> 7) + Static43.anInt1144;
		@Pc(27) int local27 = Static93.anInt2429 + (Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local27 >= 3056 && local27 <= 3136) {
			Static58.anInt1430 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local27 >= 9492 && local27 <= 9535) {
			Static58.anInt1430 = 1;
		}
		if (Static58.anInt1430 == 1 && local12 >= 3139 && local12 <= 3199 && local27 >= 3008 && local27 <= 3062) {
			Static58.anInt1430 = 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)Z")
	public static boolean method1656(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
	public static void method1658() {
		aClass4_1357 = null;
		aClass4_1364 = null;
		aClass4_1363 = null;
		aClass4_1359 = null;
		aClass8_29 = null;
		aClass24Array3 = null;
		aClass4_1358 = null;
		aClass4_1360 = null;
		aClass31_6 = null;
		aClass4_1362 = null;
		aClass4_1361 = null;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(B)V")
	public static void method1659() {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = -1; local7 < Static11.anInt2841; local7++) {
			if (local7 == -1) {
				local15 = 2047;
			} else {
				local15 = Static92.anIntArray270[local7];
			}
			@Pc(25) Class3_Sub1_Sub1_Sub1_Sub2 local25 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local15];
			if (local25 != null && local25.anInt2330 > 0) {
				local25.anInt2330--;
				if (local25.anInt2330 == 0) {
					local25.aClass4_1294 = null;
				}
			}
		}
		for (local15 = 0; local15 < Static29.anInt905; local15++) {
			@Pc(62) int local62 = Static24.anIntArray40[local15];
			@Pc(66) Class3_Sub1_Sub1_Sub1_Sub1 local66 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local62];
			if (local66 != null && local66.anInt2330 > 0) {
				local66.anInt2330--;
				if (local66.anInt2330 == 0) {
					local66.aClass4_1294 = null;
				}
			}
		}
	}
}
