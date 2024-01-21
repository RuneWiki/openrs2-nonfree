import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
	public static int anInt1589 = 0;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Lclient!r;")
	public static Class61 aClass61_497 = Static129.method2060(")1j");

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "[I")
	public static int[] anIntArray236 = new int[2048];

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	public static int anInt1591 = 0;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Lclient!r;")
	private static Class61 aClass61_498 = Static129.method2060("Please reload this page)3");

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "Lclient!r;")
	private static Class61 aClass61_501 = Static129.method2060("Members object");

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!r;")
	public static Class61 aClass61_499 = aClass61_501;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Lclient!r;")
	public static Class61 aClass61_500 = Static129.method2060("<col=ffff00>");

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
	public static int anInt1592 = 1;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "Lclient!r;")
	public static Class61 aClass61_502 = aClass61_498;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
	public static int method1105(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
	public static int method1106(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 2) {
			@Pc(17) int local17 = method1106(arg0 >> 1, arg1 * arg1);
			if ((arg0 & 0x1) != 0) {
				local17 *= arg1;
			}
			return local17;
		} else if (arg0 == 1) {
			return arg1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!ff;)V")
	public static void method1107(@OriginalArg(1) Class26 arg0) {
		Static80.aClass26_18 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method1108() {
		aClass61_499 = null;
		aClass61_497 = null;
		aClass61_502 = null;
		aClass61_498 = null;
		aClass61_501 = null;
		aClass61_500 = null;
		anIntArray236 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BILclient!ff;I)Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4 method1109(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		return Static8.method174(arg2, arg1, arg0) ? Static105.method2176() : null;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method1110() {
		Static52.aClass29_12.method765();
		Static28.aClass29_8.method765();
		Static87.aClass29_22.method765();
	}
}
