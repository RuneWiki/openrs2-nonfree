import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static74 {

	@OriginalMember(owner = "client!ob", name = "gc", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_85;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
	public static int anInt2071 = 0;

	@OriginalMember(owner = "client!ob", name = "cc", descriptor = "Lclient!hb;")
	private static Class27 aClass27_970 = Static87.method1648("Loading ignore list");

	@OriginalMember(owner = "client!ob", name = "Xb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_968 = aClass27_970;

	@OriginalMember(owner = "client!ob", name = "Zb", descriptor = "I")
	public static int anInt2074 = 0;

	@OriginalMember(owner = "client!ob", name = "ac", descriptor = "I")
	public static int anInt2075 = 0;

	@OriginalMember(owner = "client!ob", name = "bc", descriptor = "Lclient!hb;")
	public static Class27 aClass27_969 = Static87.method1648(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ob", name = "oc", descriptor = "Lclient!hb;")
	private static Class27 aClass27_975 = Static87.method1648("Please reload this page)3");

	@OriginalMember(owner = "client!ob", name = "ec", descriptor = "Lclient!hb;")
	public static Class27 aClass27_971 = aClass27_975;

	@OriginalMember(owner = "client!ob", name = "ic", descriptor = "Lclient!hb;")
	private static Class27 aClass27_973 = Static87.method1648("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ob", name = "fc", descriptor = "Lclient!hb;")
	public static Class27 aClass27_972 = aClass27_973;

	@OriginalMember(owner = "client!ob", name = "lc", descriptor = "Lclient!hb;")
	public static Class27 aClass27_974 = Static87.method1648("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ob", name = "mc", descriptor = "I")
	public static int anInt2080 = 0;

	@OriginalMember(owner = "client!ob", name = "wc", descriptor = "Lclient!hb;")
	public static Class27 aClass27_976 = Static87.method1648("backleft1");

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "(B)V")
	public static void method1473() {
		aClass3_Sub3_Sub2_Sub4_85 = null;
		aClass27_971 = null;
		aClass27_976 = null;
		aClass27_968 = null;
		aClass27_970 = null;
		aClass27_974 = null;
		aClass27_975 = null;
		aClass27_973 = null;
		aClass27_969 = null;
		aClass27_972 = null;
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(BI)V")
	public static void method1474(@OriginalArg(1) int arg0) {
		if (Static88.aClass5_1 == null) {
			return;
		}
		if (Static15.anInt297 != 0) {
			if (Static22.aByteArray7 == null) {
				return;
			}
			Static83.anInt2364 = arg0;
		} else if (Static39.anInt988 >= 0) {
			Static39.anInt988 = arg0;
			Static88.aClass5_1.method1226(0, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILclient!ja;)V")
	public static void method1481(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub1_Sub4 arg1) {
		Static28.method620(arg1.anInt2408, arg1.anInt2399, arg0);
	}
}
