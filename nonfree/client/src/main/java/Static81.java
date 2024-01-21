import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static81 {

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public static int anInt2064;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!gd;")
	public static Class22 aClass22_28 = new Class22(64);

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
	public static int anInt2062 = 0;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!kc;")
	public static Class36 aClass36_972 = Static14.method2017("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "Lclient!kc;")
	public static Class36 aClass36_973 = Static14.method2017("@gr3@");

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	public static int anInt2065 = 0;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Lclient!kc;")
	public static Class36 aClass36_974 = Static14.method2017("::errortest");

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Lclient!kc;")
	private static Class36 aClass36_976 = Static14.method2017("white:");

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!kc;")
	public static Class36 aClass36_975 = aClass36_976;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Lclient!gd;")
	public static Class22 aClass22_29 = new Class22(20);

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Lclient!kc;")
	public static Class36 aClass36_977 = Static14.method2017("backright2");

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!ed;)Z")
	public static boolean method1492(@OriginalArg(1) Class2_Sub1_Sub6 arg0) {
		if (Static117.aBoolean84) {
			if (Static67.method1163(arg0) != 0) {
				return false;
			}
			if (arg0.anInt676 == 0) {
				return false;
			}
		}
		return arg0.aBoolean29;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public static void method1493() {
		aClass36_974 = null;
		aClass36_975 = null;
		aClass36_976 = null;
		aClass36_977 = null;
		aClass22_29 = null;
		aClass36_973 = null;
		aClass22_28 = null;
		aClass36_972 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIZI)Z")
	public static boolean method1494(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		return Static33.method328(arg3) ? Static11.method227(Static42.aClass2_Sub1_Sub6ArrayArray1[arg3], 0, 0, -1, arg0, 0, arg1, 0, arg2) : false;
	}
}
