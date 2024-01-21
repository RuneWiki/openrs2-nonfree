import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "[Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4[] aClass4_Sub2_Sub3_Sub4Array2;

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "Lclient!ja;")
	private static Class39 aClass39_483 = Static28.method504("May");

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "Lclient!ja;")
	private static Class39 aClass39_484 = Static28.method504("Mar");

	@OriginalMember(owner = "client!ff", name = "ab", descriptor = "Lclient!ja;")
	private static Class39 aClass39_485 = Static28.method504("Feb");

	@OriginalMember(owner = "client!ff", name = "db", descriptor = "Lclient!ja;")
	private static Class39 aClass39_488 = Static28.method504("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_486 = aClass39_488;

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_487 = Static28.method504("<img=0>");

	@OriginalMember(owner = "client!ff", name = "eb", descriptor = "Lclient!c;")
	public static Class12 aClass12_24 = new Class12(20);

	@OriginalMember(owner = "client!ff", name = "ib", descriptor = "Lclient!ja;")
	private static Class39 aClass39_489 = Static28.method504("Jan");

	@OriginalMember(owner = "client!ff", name = "sb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_496 = Static28.method504("Apr");

	@OriginalMember(owner = "client!ff", name = "lb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_492 = Static28.method504("Jun");

	@OriginalMember(owner = "client!ff", name = "tb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_497 = Static28.method504("Jul");

	@OriginalMember(owner = "client!ff", name = "qb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_495 = Static28.method504("Aug");

	@OriginalMember(owner = "client!ff", name = "ob", descriptor = "Lclient!ja;")
	private static Class39 aClass39_494 = Static28.method504("Sep");

	@OriginalMember(owner = "client!ff", name = "jb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_490 = Static28.method504("Oct");

	@OriginalMember(owner = "client!ff", name = "kb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_491 = Static28.method504("Nov");

	@OriginalMember(owner = "client!ff", name = "nb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_493 = Static28.method504("Dec");

	@OriginalMember(owner = "client!ff", name = "fb", descriptor = "[Lclient!ja;")
	public static Class39[] aClass39Array5 = new Class39[] { aClass39_489, aClass39_485, aClass39_484, aClass39_496, aClass39_483, aClass39_492, aClass39_497, aClass39_495, aClass39_494, aClass39_490, aClass39_491, aClass39_493 };

	@OriginalMember(owner = "client!ff", name = "pb", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!ff", name = "ub", descriptor = "J")
	public static long aLong40 = 0L;

	@OriginalMember(owner = "client!ff", name = "vb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_498 = Static28.method504("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ff", name = "wb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_499 = aClass39_498;

	@OriginalMember(owner = "client!ff", name = "xb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_500 = Static28.method504("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!ff", name = "yb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_501 = Static28.method504(" seconds)3");

	@OriginalMember(owner = "client!ff", name = "zb", descriptor = "[I")
	public static int[] anIntArray103 = new int[1000];

	@OriginalMember(owner = "client!ff", name = "Ab", descriptor = "Lclient!ja;")
	public static Class39 aClass39_502 = aClass39_501;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ae;II)V")
	public static void method625(@OriginalArg(0) Class4_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static65.method1152(arg0.anInt2643, arg1, arg0.anInt2641);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)Lclient!te;")
	public static Class4_Sub2_Sub15 method627(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub2_Sub15 local10 = (Class4_Sub2_Sub15) Static59.aClass12_41.method235((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static51.aClass20_49.method474(8, arg0);
		local10 = new Class4_Sub2_Sub15();
		if (local27 != null) {
			local10.method2012(new Class4_Sub16(local27));
		}
		Static59.aClass12_41.method234(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V")
	public static void method628() {
		aClass39_493 = null;
		aClass12_24 = null;
		aClass39_492 = null;
		aClass39_499 = null;
		aClass39_496 = null;
		aBooleanArray9 = null;
		aClass39_489 = null;
		aClass39_491 = null;
		aClass39_487 = null;
		aClass39_483 = null;
		aClass39_498 = null;
		aClass39_497 = null;
		aClass39_484 = null;
		aClass39_494 = null;
		anIntArray103 = null;
		aClass39_501 = null;
		aClass4_Sub2_Sub3_Sub4Array2 = null;
		aClass39_490 = null;
		aClass39_488 = null;
		aClass39_486 = null;
		aClass39_502 = null;
		aClass39_485 = null;
		aClass39_500 = null;
		aClass39_495 = null;
		aClass39Array5 = null;
	}
}
