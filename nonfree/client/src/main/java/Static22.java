import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!cd", name = "H", descriptor = "J")
	public static long aLong20;

	@OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
	public static int anInt549;

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "Lclient!cd;")
	private static Class10 aClass10_254 = Static51.method932(" from your ignore list first)3");

	@OriginalMember(owner = "client!cd", name = "I", descriptor = "Lclient!dh;")
	public static Class18 aClass18_1 = new Class18(32);

	@OriginalMember(owner = "client!cd", name = "V", descriptor = "Lclient!cd;")
	public static Class10 aClass10_255 = aClass10_254;

	@OriginalMember(owner = "client!cd", name = "Y", descriptor = "Lclient!g;")
	public static Class28 aClass28_1 = new Class28();

	@OriginalMember(owner = "client!cd", name = "Z", descriptor = "Lclient!cd;")
	public static Class10 aClass10_256 = Static51.method932("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!cd", name = "cb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_258 = Static51.method932("Error connecting to server)3");

	@OriginalMember(owner = "client!cd", name = "ab", descriptor = "Lclient!cd;")
	public static Class10 aClass10_257 = aClass10_258;

	@OriginalMember(owner = "client!cd", name = "eb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_259 = Static51.method932("::gc");

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public static void method330() {
		aClass10_259 = null;
		aClass10_257 = null;
		aClass18_1 = null;
		aClass10_256 = null;
		aClass10_254 = null;
		aClass10_258 = null;
		aClass28_1 = null;
		aClass10_255 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public static void method342() {
		Static16.method267();
		Static21.method329();
		Static126.method2069();
		Static116.method1883();
		Static141.method2235();
		Static120.method1931();
		Static180.method2716();
		Static68.method1158();
		Static79.method1283();
		Static49.method909();
		Static162.method2469();
		Static85.method1363();
		((Class7) Static125.anInterface2_1).method260();
		Static36.aClass72_9.method2261();
		Static117.aClass29_Sub1_39.method1025();
		Static20.aClass29_Sub1_13.method1025();
		Static14.aClass29_Sub1_10.method1025();
		Static102.aClass29_Sub1_50.method1025();
		Static76.aClass29_Sub1_27.method1025();
		Static170.aClass29_Sub1_51.method1025();
		Static56.aClass29_Sub1_23.method1025();
		Static26.aClass29_Sub1_17.method1025();
		Static101.aClass29_Sub1_34.method1025();
		Static115.aClass29_Sub1_37.method1025();
		Static7.aClass29_Sub1_7.method1025();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBILclient!fa;)V")
	public static void method346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class23 arg2) {
		if (Static16.aClass23_1 != null || Static119.aBoolean119 || (arg2 == null || Static25.method552(arg2) == null)) {
			return;
		}
		Static16.aClass23_1 = arg2;
		Static169.aClass23_13 = Static25.method552(arg2);
		Static41.anInt986 = arg1;
		Static143.anInt3171 = arg0;
		Static117.anInt2670 = 0;
		Static139.aBoolean137 = false;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)I")
	public static int method366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(20) int local20 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local20;
		}
		return arg0;
	}
}
