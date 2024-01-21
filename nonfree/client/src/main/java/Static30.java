import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4 aClass1_Sub2_Sub1_Sub4_1;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Lclient!ag;")
	public static Class4 aClass4_35;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
	public static int anInt1053;

	@OriginalMember(owner = "client!dd", name = "yb", descriptor = "I")
	public static int anInt1097;

	@OriginalMember(owner = "client!dd", name = "ib", descriptor = "Lclient!dd;")
	private static Class13 aClass13_358 = Static161.method2971("Jan");

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "Lclient!dd;")
	private static Class13 aClass13_353 = Static161.method2971("Feb");

	@OriginalMember(owner = "client!dd", name = "hb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_357 = Static161.method2971("Mar");

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Lclient!dd;")
	private static Class13 aClass13_349 = Static161.method2971("Apr");

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "Lclient!dd;")
	private static Class13 aClass13_354 = Static161.method2971("May");

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!dd;")
	private static Class13 aClass13_347 = Static161.method2971("Jun");

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "Lclient!dd;")
	private static Class13 aClass13_352 = Static161.method2971("Jul");

	@OriginalMember(owner = "client!dd", name = "wb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_362 = Static161.method2971("Aug");

	@OriginalMember(owner = "client!dd", name = "qb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_360 = Static161.method2971("Sep");

	@OriginalMember(owner = "client!dd", name = "Z", descriptor = "Lclient!dd;")
	private static Class13 aClass13_356 = Static161.method2971("Oct");

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "Lclient!dd;")
	private static Class13 aClass13_350 = Static161.method2971("Nov");

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "Lclient!dd;")
	private static Class13 aClass13_348 = Static161.method2971("Dec");

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "[Lclient!dd;")
	public static Class13[] aClass13Array6 = new Class13[] { aClass13_358, aClass13_353, aClass13_357, aClass13_349, aClass13_354, aClass13_347, aClass13_352, aClass13_362, aClass13_360, aClass13_356, aClass13_350, aClass13_348 };

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
	public static int anInt1052 = 0;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
	public static int anInt1069 = -1;

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "Lclient!dd;")
	private static Class13 aClass13_351 = Static161.method2971("Create a free account");

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "Lclient!l;")
	public static Class45 aClass45_6 = new Class45(32);

	@OriginalMember(owner = "client!dd", name = "Q", descriptor = "[I")
	public static int[] anIntArray116 = new int[2048];

	@OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
	public static int anInt1075 = 128;

	@OriginalMember(owner = "client!dd", name = "W", descriptor = "Lclient!dd;")
	public static Class13 aClass13_355 = Static161.method2971("leuchten1:");

	@OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
	public static int anInt1083 = 500;

	@OriginalMember(owner = "client!dd", name = "kb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_359 = Static161.method2971("(Y");

	@OriginalMember(owner = "client!dd", name = "tb", descriptor = "I")
	public static int anInt1095 = 0;

	@OriginalMember(owner = "client!dd", name = "ub", descriptor = "Lclient!dd;")
	public static Class13 aClass13_361 = aClass13_351;

	@OriginalMember(owner = "client!dd", name = "xb", descriptor = "Z")
	public static boolean aBoolean72 = false;

	@OriginalMember(owner = "client!dd", name = "zb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_363 = Static161.method2971("T");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)I")
	public static int method879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static35.aByteArrayArrayArray20[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static35.aByteArrayArrayArray20[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V")
	public static void method895() {
		aClass13_357 = null;
		aClass13_360 = null;
		aClass13_347 = null;
		aClass13_352 = null;
		aClass13_361 = null;
		aClass13_350 = null;
		aClass13_356 = null;
		aClass13_355 = null;
		aClass13_363 = null;
		anIntArray116 = null;
		aClass13Array6 = null;
		aClass13_354 = null;
		aClass13_349 = null;
		aClass4_35 = null;
		aClass13_353 = null;
		aClass1_Sub2_Sub1_Sub4_1 = null;
		aClass13_358 = null;
		aClass13_359 = null;
		aClass13_362 = null;
		aClass13_348 = null;
		aClass13_351 = null;
		aClass45_6 = null;
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(II)I")
	public static int method910(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0xF3333333) + (local13 & 0x33333333);
		@Pc(31) int local31 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}
}
