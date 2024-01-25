import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static280 {

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "[S")
	public static short[] aShortArray71;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "Lclient!gga;")
	public static Class124 aClass124_60;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	public static int anInt5182 = 0;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!ow;")
	public static final Class271 aClass271_27 = new Class271();

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Z")
	public static boolean aBoolean388 = false;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)Z")
	public static boolean method4709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static144.method2525(arg0, arg1) || Static39.method9318(arg0, arg1);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIILclient!fm;BI)V")
	public static void method4713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class15_Sub3_Sub3_Sub1 arg2, @OriginalArg(6) int arg3) {
		Static605.method9059(arg3, arg1, arg2.anInt11024, arg2.aByte142, 0, arg0, arg2.anInt11022);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BII)I")
	public static int method4714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static613.anIntArray559[arg0 & 0x3] : Static561.anIntArray492[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLclient!vt;)I")
	public static int method4715(@OriginalArg(1) Class381 arg0) {
		if (Static512.aClass381_5 == arg0) {
			return 7681;
		} else if (arg0 == Static175.aClass381_3) {
			return 8448;
		} else if (arg0 == Static98.aClass381_1) {
			return 34165;
		} else if (arg0 == Static238.aClass381_4) {
			return 260;
		} else if (Static136.aClass381_2 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
