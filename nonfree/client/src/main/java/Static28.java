import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!d", name = "d", descriptor = "[[[Lclient!eb;")
	public static Class4_Sub7[][][] aClass4_Sub7ArrayArrayArray1;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	public static int anInt745;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_22;

	@OriginalMember(owner = "client!d", name = "r", descriptor = "[S")
	public static short[] aShortArray6;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_237 = Static177.method3050("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_238 = Static177.method3050("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!d", name = "g", descriptor = "I")
	public static int anInt746 = 0;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!bi;")
	public static final Class4_Sub4 aClass4_Sub4_1 = new Class4_Sub4(0, 0);

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_239 = Static177.method3050(": ");

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_240 = Static177.method3050("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!d", name = "k", descriptor = "I")
	public static int anInt747 = 0;

	@OriginalMember(owner = "client!d", name = "n", descriptor = "I")
	public static int anInt750 = -1;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "I")
	public static int anInt752 = 0;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!jd;")
	public static Class46 aClass46_241 = aClass46_240;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "Lclient!jd;")
	public static Class46 aClass46_242 = aClass46_237;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "Z")
	public static boolean aBoolean38 = false;

	@OriginalMember(owner = "client!d", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray5 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!d", name = "x", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_243 = Static177.method3050("Benutzen");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(DI)V")
	public static void method493(@OriginalArg(0) double arg0) {
		if (arg0 == Static12.aDouble1) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static100.anIntArray236[local7] = local19 <= 255 ? local19 : 255;
		}
		Static12.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)I")
	public static int method494(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(III)V")
	public static void method495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static3.anInt86 < 2 && Static53.anInt1331 == 0 && !Static86.aBoolean97) {
			return;
		}
		@Pc(51) Class46 local51;
		if (Static53.anInt1331 == 1 && Static3.anInt86 < 2) {
			local51 = Static69.method1482(new Class46[] { Static21.aClass46_188, Static122.aClass46_1083, Static1.aClass46_1, Static153.aClass46_1302 });
		} else if (Static86.aBoolean97 && Static3.anInt86 < 2) {
			local51 = Static69.method1482(new Class46[] { Static111.aClass46_1005, Static122.aClass46_1083, Static30.aClass46_250, Static153.aClass46_1302 });
		} else {
			local51 = Static180.method3091(Static3.anInt86 - 1);
		}
		if (Static3.anInt86 > 2) {
			local51 = Static69.method1482(new Class46[] { local51, Static123.aClass46_1091, Static127.method2240(Static3.anInt86 - 2), Static88.aClass46_825 });
		}
		@Pc(128) int local128 = Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method883(local51, arg0 + 4, arg1 - -15, Static39.aRandom1, Static137.anInt3251);
		Static149.method2557(local128 + Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method903(local51), arg0 + 4, 15, arg1);
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public static void method496() {
		@Pc(7) Class88 local7 = Static71.aClass88_1;
		synchronized (Static71.aClass88_1) {
			Static170.anInt3816 = Static19.anInt546;
			@Pc(18) int local18;
			if (Static69.anInt1852 < 0) {
				for (local18 = 0; local18 < 112; local18++) {
					Static14.aBooleanArray2[local18] = false;
				}
				Static69.anInt1852 = Static181.anInt4074;
			} else {
				while (Static69.anInt1852 != Static181.anInt4074) {
					local18 = Static24.anIntArray60[Static181.anInt4074];
					Static181.anInt4074 = Static181.anInt4074 + 1 & 0x7F;
					if (local18 >= 0) {
						Static14.aBooleanArray2[local18] = true;
					} else {
						Static14.aBooleanArray2[~local18] = false;
					}
				}
			}
			Static19.anInt546 = Static131.anInt3137;
		}
	}
}
