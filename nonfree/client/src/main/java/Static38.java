import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ga", name = "rb", descriptor = "Lclient!ea;")
	public static Class20 aClass20_21;

	@OriginalMember(owner = "client!ga", name = "sb", descriptor = "Lclient!vf;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!ga", name = "yb", descriptor = "I")
	public static int anInt951;

	@OriginalMember(owner = "client!ga", name = "ab", descriptor = "Lclient!ja;")
	public static Class33 aClass33_14 = new Class33(64);

	@OriginalMember(owner = "client!ga", name = "mb", descriptor = "Lclient!ge;")
	public static Class4_Sub11_Sub1 aClass4_Sub11_Sub1_1 = new Class4_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!ga", name = "pb", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!ga", name = "tb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_266 = Static60.method1113("Sprites geladen)3");

	@OriginalMember(owner = "client!ga", name = "ub", descriptor = "[I")
	public static int[] anIntArray111 = new int[500];

	@OriginalMember(owner = "client!ga", name = "vb", descriptor = "I")
	public static int anInt949 = 0;

	@OriginalMember(owner = "client!ga", name = "wb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_267 = Static60.method1113("M");

	@OriginalMember(owner = "client!ga", name = "xb", descriptor = "I")
	public static volatile int anInt950 = -1;

	@OriginalMember(owner = "client!ga", name = "Bb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_268 = aClass22_267;

	@OriginalMember(owner = "client!ga", name = "Cb", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[8];

	@OriginalMember(owner = "client!ga", name = "Eb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_269 = aClass22_267;

	@OriginalMember(owner = "client!ga", name = "Fb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_270 = Static60.method1113("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	public static void method615() {
		aBooleanArray3 = null;
		aClass22_270 = null;
		aClass4_Sub11_Sub1_1 = null;
		aClass79_1 = null;
		aClass33_14 = null;
		anIntArray111 = null;
		aClass22_267 = null;
		aClass20_21 = null;
		aClass22_266 = null;
		aClass22_268 = null;
		aClass22_269 = null;
		aLongArray2 = null;
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(II)I")
	public static int method620(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
