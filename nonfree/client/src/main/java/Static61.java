import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!p;")
	public static Class45 aClass45_22;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!qd;")
	public static Class48 aClass48_6;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "Lclient!p;")
	public static Class45 aClass45_23;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "Lclient!p;")
	public static Class45 aClass45_24;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!o;")
	public static Class40 aClass40_445 = Static13.method257("");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_444 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!o;")
	public static Class40 aClass40_446 = Static13.method257("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!o;")
	public static Class40 aClass40_447 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_448 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Lclient!o;")
	public static Class40 aClass40_449 = Static13.method257("Use @lre@");

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
	public static int anInt1548 = -1;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_450 = Static13.method257("glow2:");

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "Lclient!qc;")
	public static Class47 aClass47_14 = new Class47(64);

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_451 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_452 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Lclient!o;")
	public static Class40 aClass40_453 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
	public static int anInt1550 = 0;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7 = new byte[4][104][104];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public static void method1039() {
		if (Static70.aClass25_36 != null) {
			Static70.aClass25_36.method730();
		}
		Static70.aClass25_36 = null;
		Static48.method820();
		Static93.aClass55_1.method1414();
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			Static79.aClass20Array3[local22].method534();
		}
		System.gc();
		Static94.method1490();
		Static20.anInt470 = 0;
		Static84.anInt1977 = -1;
		Static7.method187(10);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ke;)V")
	public static void method1040(@OriginalArg(1) Class2_Sub2_Sub12_Sub1 arg0) {
		if (arg0.anInt2285 == 0) {
			return;
		}
		@Pc(39) int local39;
		@Pc(32) int local32;
		if (arg0.anInt2324 != -1 && arg0.anInt2324 < 32768) {
			@Pc(23) Class2_Sub2_Sub12_Sub1_Sub2 local23 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[arg0.anInt2324];
			if (local23 != null) {
				local32 = arg0.anInt2284 - local23.anInt2284;
				local39 = arg0.anInt2275 - local23.anInt2275;
				if (local39 != 0 || local32 != 0) {
					arg0.anInt2283 = (int) (Math.atan2((double) local39, (double) local32) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(67) int local67;
		if (arg0.anInt2324 >= 32768) {
			local67 = arg0.anInt2324 - 32768;
			if (local67 == Static83.anInt1955) {
				local67 = 2047;
			}
			@Pc(76) Class2_Sub2_Sub12_Sub1_Sub1 local76 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local67];
			if (local76 != null) {
				local32 = arg0.anInt2275 - local76.anInt2275;
				@Pc(91) int local91 = arg0.anInt2284 - local76.anInt2284;
				if (local32 != 0 || local91 != 0) {
					arg0.anInt2283 = (int) (Math.atan2((double) local32, (double) local91) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2280 != 0 || arg0.anInt2292 != 0) && (arg0.anInt2309 == 0 || arg0.anInt2282 > 0)) {
			local39 = arg0.anInt2284 - (arg0.anInt2292 - Static30.anInt725 - Static30.anInt725) * 64;
			local67 = arg0.anInt2275 - (arg0.anInt2280 - Static87.anInt2058 - Static87.anInt2058) * 64;
			if (local67 != 0 || local39 != 0) {
				arg0.anInt2283 = (int) (Math.atan2((double) local67, (double) local39) * 325.949D) & 0x7FF;
			}
			arg0.anInt2280 = 0;
			arg0.anInt2292 = 0;
		}
		local67 = arg0.anInt2283 - arg0.anInt2305 & 0x7FF;
		if (local67 == 0) {
			return;
		}
		if (local67 < arg0.anInt2285 || local67 > 2048 - arg0.anInt2285) {
			arg0.anInt2305 = arg0.anInt2283;
		} else if (local67 > 1024) {
			arg0.anInt2305 -= arg0.anInt2285;
		} else {
			arg0.anInt2305 += arg0.anInt2285;
		}
		arg0.anInt2305 &= 0x7FF;
		if (arg0.anInt2318 != arg0.anInt2290 || arg0.anInt2305 == arg0.anInt2283) {
			return;
		}
		if (arg0.anInt2276 == -1) {
			arg0.anInt2318 = arg0.anInt2269;
			return;
		}
		arg0.anInt2318 = arg0.anInt2276;
		return;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public static void method1041() {
		aClass45_22 = null;
		aClass40_449 = null;
		aClass40_444 = null;
		aClass40_446 = null;
		aClass40_452 = null;
		aClass40_451 = null;
		aClass40_445 = null;
		aByteArrayArrayArray7 = null;
		aClass40_447 = null;
		aClass40_448 = null;
		aClass47_14 = null;
		aClass40_450 = null;
		aClass45_23 = null;
		aClass48_6 = null;
		aClass45_24 = null;
		aClass40_453 = null;
	}
}
