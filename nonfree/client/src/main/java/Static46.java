import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "Lclient!ai;")
	private static Class6 aClass6_350 = Static38.method685("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!ai;")
	public static Class6 aClass6_344 = aClass6_350;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "Lclient!ai;")
	private static Class6 aClass6_355 = Static38.method685("Create a free account");

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!ai;")
	public static Class6 aClass6_345 = aClass6_355;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!ai;")
	private static Class6 aClass6_346 = Static38.method685("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!ai;")
	private static Class6 aClass6_347 = Static38.method685("flash2:");

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray2 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "[Lclient!me;")
	public static Class2_Sub13[] aClass2_Sub13Array1 = new Class2_Sub13[2048];

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Lclient!ai;")
	private static Class6 aClass6_348 = Static38.method685("This computers address has been blocked");

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
	public static int anInt1322 = 0;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "Lclient!ai;")
	public static Class6 aClass6_349 = aClass6_348;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray21 = new int[104][104];

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
	public static int anInt1324 = 0;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "Lclient!ai;")
	public static Class6 aClass6_351 = aClass6_346;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "Lclient!ai;")
	public static Class6 aClass6_352 = Static38.method685("Weiter");

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "Lclient!ai;")
	public static Class6 aClass6_353 = aClass6_347;

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "Lclient!ai;")
	public static Class6 aClass6_354 = aClass6_347;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
	public static void method856() {
		aClass6_344 = null;
		aClass6_345 = null;
		aClass6_349 = null;
		anIntArrayArray21 = null;
		aClass6_355 = null;
		aShortArrayArray2 = null;
		aClass6_350 = null;
		aClass6_347 = null;
		aClass6_352 = null;
		aClass6_353 = null;
		aClass6_346 = null;
		aClass6_348 = null;
		aClass6_354 = null;
		aClass6_351 = null;
		aClass2_Sub13Array1 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)I")
	public static int method858(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local9 += 16;
		}
		if (arg0 >= 256) {
			local9 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local9 += 4;
		}
		if (arg0 >= 4) {
			local9 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local9++;
		}
		return local9 + arg0;
	}
}
