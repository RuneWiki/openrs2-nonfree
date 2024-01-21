import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Lclient!d;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
	public static int anInt2950;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	public static final int anInt2945 = 7759444;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1596 = Static33.method650("Message");

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1595 = aClass56_1596;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1597 = Static33.method650("Regelversto-8 melden");

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1601 = Static33.method650("Hide");

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1598 = aClass56_1601;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1599 = Static33.method650("Error connecting to server)3");

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1600 = aClass56_1599;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "[I")
	public static int[] anIntArray294 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)I")
	public static int method1908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 2) {
			@Pc(20) int local20 = method1908(arg0 * arg0, arg1 >> 1);
			if ((arg1 & 0x1) != 0) {
				local20 *= arg0;
			}
			return local20;
		} else if (arg1 == 1) {
			return arg0;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method1909() {
		aClass56_1595 = null;
		aClass56_1600 = null;
		aClass56_1596 = null;
		aByteArrayArrayArray7 = null;
		aClass56_1598 = null;
		aClass56_1597 = null;
		aClass56_1601 = null;
		anIntArray294 = null;
		aByteArrayArray10 = null;
		aClass14_1 = null;
		aClass56_1599 = null;
	}
}
