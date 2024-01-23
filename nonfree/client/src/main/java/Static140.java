import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static140 {

	@OriginalMember(owner = "client!oe", name = "L", descriptor = "Lclient!fi;")
	public static Class36 aClass36_7;

	@OriginalMember(owner = "client!oe", name = "Y", descriptor = "I")
	public static int anInt3131;

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
	public static int anInt3125 = 0;

	@OriginalMember(owner = "client!oe", name = "M", descriptor = "J")
	public static long aLong106 = 0L;

	@OriginalMember(owner = "client!oe", name = "cb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1104 = Static200.method3116("OFF");

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1102 = aClass60_1104;

	@OriginalMember(owner = "client!oe", name = "Q", descriptor = "[J")
	public static long[] aLongArray7 = new long[100];

	@OriginalMember(owner = "client!oe", name = "T", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1103 = Static200.method3116(" ");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIILclient!dd;IJIIII)Z")
	public static boolean method2398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static152.method2597(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
	public static void method2400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static199.method3112(arg0)) {
			Static8.method147(arg1, Static82.aClass6ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)I")
	public static int method2405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
