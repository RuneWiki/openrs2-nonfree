import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static19 {

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	public static int anInt634;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	public static int anInt631 = 0;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!rd;")
	private static Class63 aClass63_404 = Static80.method1463("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_408 = Static80.method1463("wishes to trade with you)3");

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!rd;")
	public static Class63 aClass63_405 = aClass63_408;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!rd;")
	public static Class63 aClass63_406 = Static80.method1463("(U");

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_407 = Static80.method1463("0(U");

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "J")
	public static long aLong22 = 0L;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	public static int anInt642 = 0;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_409 = aClass63_404;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!rd;")
	private static Class63 aClass63_411 = Static80.method1463("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_410 = aClass63_411;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[I")
	public static int[] anIntArray63 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	public static void method499() {
		aClass63_405 = null;
		aClass63_411 = null;
		aClass63_407 = null;
		aClass63_406 = null;
		aClass63_409 = null;
		anIntArray63 = null;
		aClass63_404 = null;
		aClass63_408 = null;
		aClass63_410 = null;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)I")
	public static int method500() {
		return 19;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!rd;IIIILclient!rd;)V")
	public static void method501(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class63 arg5) {
		if (Static18.anInt569 >= 500) {
			return;
		}
		if (arg1.method1811() > 0) {
			Static31.aClass63Array7[Static18.anInt569] = Static15.method374(new Class63[] { arg5, Static33.aClass63_608, arg1 });
		} else {
			Static31.aClass63Array7[Static18.anInt569] = arg5;
		}
		Static69.anIntArray225[Static18.anInt569] = arg4;
		Static79.anIntArray243[Static18.anInt569] = arg2;
		Static61.anIntArray193[Static18.anInt569] = arg3;
		Static124.anIntArray372[Static18.anInt569] = arg0;
		Static18.anInt569++;
	}
}
