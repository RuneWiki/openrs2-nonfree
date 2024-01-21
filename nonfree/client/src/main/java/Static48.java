import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ie", name = "Q", descriptor = "[Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3[] aClass3_Sub1_Sub4_Sub3Array3;

	@OriginalMember(owner = "client!ie", name = "db", descriptor = "Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_15;

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "Lclient!ad;")
	private static Class4 aClass4_625 = Static75.method1216("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "Lclient!ad;")
	public static Class4 aClass4_620 = aClass4_625;

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "Lclient!ad;")
	private static Class4 aClass4_624 = Static75.method1216("as it was used to break our rules)3");

	@OriginalMember(owner = "client!ie", name = "J", descriptor = "Lclient!ad;")
	public static Class4 aClass4_621 = aClass4_624;

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "Lclient!ad;")
	private static Class4 aClass4_622 = Static75.method1216("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_632 = Static75.method1216("Please use a different world)3");

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "Lclient!ad;")
	public static Class4 aClass4_623 = aClass4_632;

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "Lclient!ad;")
	public static Class4 aClass4_626 = Static75.method1216("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "Lclient!ad;")
	public static Class4 aClass4_627 = aClass4_622;

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
	public static int anInt1201 = -1;

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "Lclient!ad;")
	public static Class4 aClass4_628 = Static75.method1216("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lclient!ad;")
	public static Class4 aClass4_629 = Static75.method1216("runes");

	@OriginalMember(owner = "client!ie", name = "Z", descriptor = "Lclient!ad;")
	public static Class4 aClass4_630 = null;

	@OriginalMember(owner = "client!ie", name = "ab", descriptor = "Lclient!ad;")
	public static Class4 aClass4_631 = Static75.method1216("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!rd;Lclient!rd;)I")
	public static int method837(@OriginalArg(1) Class64 arg0, @OriginalArg(2) Class64 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1614(Static23.aClass4_259, Static95.aClass4_1258)) {
			local5++;
		}
		if (arg1.method1614(Static107.aClass4_1497, Static95.aClass4_1258)) {
			local5++;
		}
		if (arg1.method1614(Static86.aClass4_1130, Static95.aClass4_1258)) {
			local5++;
		}
		if (arg1.method1614(Static56.aClass4_720, Static95.aClass4_1258)) {
			local5++;
		}
		if (arg1.method1614(aClass4_629, Static95.aClass4_1258)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
	public static void method838() {
		aClass4_625 = null;
		aClass4_620 = null;
		aClass4_631 = null;
		aClass4_629 = null;
		aClass3_Sub1_Sub4_Sub3_15 = null;
		aClass4_626 = null;
		aClass4_630 = null;
		aClass3_Sub1_Sub4_Sub3Array3 = null;
		aClass4_632 = null;
		aClass4_624 = null;
		aClass4_628 = null;
		aClass4_622 = null;
		aClass4_621 = null;
		aClass4_627 = null;
		aClass4_623 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ab;Z)V")
	public static void method839(@OriginalArg(0) Class3_Sub1_Sub1_Sub1 arg0) {
		arg0.anInt2295 = arg0.anInt2291;
		if (arg0.anInt2317 == 0) {
			arg0.anInt2337 = 0;
			return;
		}
		if (arg0.anInt2320 != -1 && arg0.anInt2318 == 0) {
			@Pc(28) Class3_Sub1_Sub6 local28 = Static67.method1107(arg0.anInt2320);
			if (arg0.anInt2315 > 0 && local28.anInt1588 == 0) {
				arg0.anInt2337++;
				return;
			}
			if (arg0.anInt2315 <= 0 && local28.anInt1601 == 0) {
				arg0.anInt2337++;
				return;
			}
		}
		@Pc(65) int local65 = arg0.anInt2342;
		@Pc(68) int local68 = arg0.anInt2348;
		@Pc(84) int local84 = arg0.anIntArray289[arg0.anInt2317 - 1] * 128 + arg0.anInt2319 * 64;
		@Pc(99) int local99 = arg0.anIntArray286[arg0.anInt2317 - 1] * 128 + arg0.anInt2319 * 64;
		if (local84 - local65 > 256 || local84 - local65 < -256 || local99 - local68 > 256 || local99 - local68 < -256) {
			arg0.anInt2342 = local84;
			arg0.anInt2348 = local99;
			return;
		}
		if (local65 < local84) {
			if (local99 > local68) {
				arg0.anInt2290 = 1280;
			} else if (local68 <= local99) {
				arg0.anInt2290 = 1536;
			} else {
				arg0.anInt2290 = 1792;
			}
		} else if (local65 > local84) {
			if (local99 > local68) {
				arg0.anInt2290 = 768;
			} else if (local68 > local99) {
				arg0.anInt2290 = 256;
			} else {
				arg0.anInt2290 = 512;
			}
		} else if (local99 > local68) {
			arg0.anInt2290 = 1024;
		} else if (local99 < local68) {
			arg0.anInt2290 = 0;
		}
		@Pc(230) int local230 = arg0.anInt2290 - arg0.anInt2293 & 0x7FF;
		if (local230 > 1024) {
			local230 -= 2048;
		}
		@Pc(237) int local237 = arg0.anInt2322;
		if (local230 >= -256 && local230 <= 256) {
			local237 = arg0.anInt2305;
		} else if (local230 >= 256 && local230 < 768) {
			local237 = arg0.anInt2314;
		} else if (local230 >= -768 && local230 <= -256) {
			local237 = arg0.anInt2307;
		}
		if (local237 == -1) {
			local237 = arg0.anInt2305;
		}
		arg0.anInt2295 = local237;
		@Pc(289) int local289 = 4;
		if (arg0.anInt2290 != arg0.anInt2293 && arg0.anInt2288 == -1 && arg0.anInt2347 != 0) {
			local289 = 2;
		}
		if (arg0.anInt2317 > 2) {
			local289 = 6;
		}
		if (arg0.anInt2317 > 3) {
			local289 = 8;
		}
		if (arg0.anInt2337 > 0 && arg0.anInt2317 > 1) {
			arg0.anInt2337--;
			local289 = 8;
		}
		if (arg0.aBooleanArray13[arg0.anInt2317 - 1]) {
			local289 <<= 0x1;
		}
		if (local65 < local84) {
			arg0.anInt2342 += local289;
			if (arg0.anInt2342 > local84) {
				arg0.anInt2342 = local84;
			}
		} else if (local84 < local65) {
			arg0.anInt2342 -= local289;
			if (arg0.anInt2342 < local84) {
				arg0.anInt2342 = local84;
			}
		}
		if (local68 < local99) {
			arg0.anInt2348 += local289;
			if (local99 < arg0.anInt2348) {
				arg0.anInt2348 = local99;
			}
		} else if (local68 > local99) {
			arg0.anInt2348 -= local289;
			if (local99 > arg0.anInt2348) {
				arg0.anInt2348 = local99;
			}
		}
		if (local84 == arg0.anInt2342 && arg0.anInt2348 == local99) {
			if (arg0.anInt2315 > 0) {
				arg0.anInt2315--;
			}
			arg0.anInt2317--;
		}
		if (local289 >= 8 && arg0.anInt2305 == arg0.anInt2295 && arg0.anInt2332 != -1) {
			arg0.anInt2295 = arg0.anInt2332;
		}
	}
}
