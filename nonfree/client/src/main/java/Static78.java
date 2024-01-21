import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!fc;")
	public static Class24_Sub1 aClass24_Sub1_10;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "Lclient!oa;")
	public static Class7 aClass7_31;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public static int anInt948 = 0;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!vc;")
	public static Class71 aClass71_517 = Static38.method736("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Lclient!vc;")
	private static Class71 aClass71_518 = Static38.method736("Public chat");

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!vc;")
	private static Class71 aClass71_519 = Static38.method736("Offline");

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "Lclient!vc;")
	public static Class71 aClass71_520 = aClass71_519;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!vc;")
	public static Class71 aClass71_521 = null;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "[I")
	public static int[] anIntArray117 = new int[4000];

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Lclient!vc;")
	public static Class71 aClass71_522 = Static38.method736("Fps:");

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "Lclient!vc;")
	public static Class71 aClass71_523 = Static38.method736("redstone2");

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "Lclient!vc;")
	public static Class71 aClass71_524 = aClass71_518;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "Lclient!vc;")
	public static Class71 aClass71_525 = Static38.method736("null");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method694() {
		aClass71_519 = null;
		aClass7_31 = null;
		aClass71_522 = null;
		anIntArray117 = null;
		aClass71_520 = null;
		aClass71_524 = null;
		aClass71_518 = null;
		aClass71_521 = null;
		aClass24_Sub1_10 = null;
		aClass71_523 = null;
		aLongArray4 = null;
		aClass71_525 = null;
		aClass71_517 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BIILclient!tc;)V")
	public static void method696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub1_Sub1_Sub3_Sub2 arg2) {
		if (arg2.anInt2458 == arg0 && arg0 != -1) {
			@Pc(56) int local56 = Static57.method1017(arg0).anInt2944;
			if (local56 == 1) {
				arg2.anInt2482 = 0;
				arg2.anInt2450 = 0;
				arg2.anInt2471 = arg1;
				arg2.anInt2438 = 0;
			}
			if (local56 == 2) {
				arg2.anInt2450 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt2458 == -1 || Static57.method1017(arg0).anInt2941 >= Static57.method1017(arg2.anInt2458).anInt2941) {
			arg2.anInt2435 = arg2.anInt2440;
			arg2.anInt2450 = 0;
			arg2.anInt2471 = arg1;
			arg2.anInt2438 = 0;
			arg2.anInt2458 = arg0;
			arg2.anInt2482 = 0;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!vc;I)V")
	public static void method698(@OriginalArg(1) Class71 arg0, @OriginalArg(2) int arg1) {
		Static61.aClass5_Sub11_Sub1_8.method1553(115);
		Static61.aClass5_Sub11_Sub1_8.method1526(arg1);
		Static61.aClass5_Sub11_Sub1_8.method1523(arg0.method1817());
	}
}
