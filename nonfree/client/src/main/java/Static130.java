import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!p", name = "i", descriptor = "[I")
	public static int[] anIntArray324;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1095 = Static161.method2971(":duelstake:");

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1096 = Static161.method2971("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1097 = Static161.method2971("(Z");

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1098 = Static161.method2971("gr-Un:");

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1104 = Static161.method2971("glow2:");

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1099 = aClass13_1104;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "[J")
	public static long[] aLongArray6 = new long[500];

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1100 = aClass13_1104;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1102 = Static161.method2971("World");

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1101 = aClass13_1102;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1103 = aClass13_1102;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1105 = Static161.method2971("Fertigkeit)2");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III)I")
	public static int method2340(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method2341() {
		anIntArray324 = null;
		aClass13_1097 = null;
		aClass13_1099 = null;
		aClass13_1098 = null;
		aClass13_1095 = null;
		aClass13_1104 = null;
		aLongArray6 = null;
		aClass13_1101 = null;
		aClass13_1105 = null;
		aClass13_1100 = null;
		aClass13_1096 = null;
		aClass13_1103 = null;
		aClass13_1102 = null;
	}
}
