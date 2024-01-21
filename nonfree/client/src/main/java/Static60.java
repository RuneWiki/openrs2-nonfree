import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!fc;")
	public static Class24_Sub1 aClass24_Sub1_14;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!qa;")
	public static Class54 aClass54_26 = new Class54(64);

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "Lclient!vc;")
	private static Class71 aClass71_782 = Static38.method736("Click to continue");

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Lclient!vc;")
	public static Class71 aClass71_781 = aClass71_782;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!vc;")
	private static Class71 aClass71_783 = Static38.method736("Loaded sprites");

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "Lclient!vc;")
	public static Class71 aClass71_784 = aClass71_783;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
	public static int anInt1551 = 0;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "Lclient!vc;")
	private static Class71 aClass71_787 = Static38.method736("Loaded update list");

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "Lclient!vc;")
	public static Class71 aClass71_785 = aClass71_787;

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "Lclient!vc;")
	private static Class71 aClass71_788 = Static38.method736("Message");

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_786 = aClass71_788;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!vc;")
	public static Class71 aClass71_789 = Static38.method736(" x ");

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)Lclient!vc;")
	public static Class71 method1037(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static51.method962(arg0);
		} else if (arg0 < 10000000) {
			return Static74.method677(new Class71[] { Static51.method962(arg0 / 1000), Static93.aClass71_1100 });
		} else {
			return Static74.method677(new Class71[] { Static51.method962(arg0 / 1000000), Static56.aClass71_737 });
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method1038() {
		aClass71_781 = null;
		aClass71_782 = null;
		aClass71_788 = null;
		aClass71_789 = null;
		aClass71_786 = null;
		aClass71_787 = null;
		aClass71_785 = null;
		aClass71_784 = null;
		aClass54_26 = null;
		aClass24_Sub1_14 = null;
		aClass71_783 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)Z")
	public static boolean method1039(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!vc;IIIILclient!vc;)V")
	public static void method1040(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class71 arg5) {
		if (Static49.anInt1394 >= 500) {
			return;
		}
		if (arg1.method1784() <= 0) {
			Static24.aClass71Array8[Static49.anInt1394] = arg5;
		} else {
			Static24.aClass71Array8[Static49.anInt1394] = Static74.method677(new Class71[] { arg5, Static91.aClass71_1058, arg1 });
		}
		Static66.anIntArray191[Static49.anInt1394] = arg0;
		Static116.anIntArray286[Static49.anInt1394] = arg2;
		Static47.anIntArray151[Static49.anInt1394] = arg3;
		Static49.anIntArray158[Static49.anInt1394] = arg4;
		Static49.anInt1394++;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	public static void method1041(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class5_Sub14 local10 = (Class5_Sub14) Static51.aClass57_7.method1579(); local10 != null; local10 = (Class5_Sub14) Static51.aClass57_7.method1582()) {
			if ((long) arg0 == (local10.aLong118 >> 48 & 0xFFFFL)) {
				local10.method2002();
			}
		}
	}
}
