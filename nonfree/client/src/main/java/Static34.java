import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static34 {

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
	public static int anInt937 = 0;

	@OriginalMember(owner = "client!dg", name = "J", descriptor = "Lclient!md;")
	public static Class54 aClass54_3 = new Class54(512);

	@OriginalMember(owner = "client!dg", name = "Y", descriptor = "Lclient!kb;")
	private static Class46 aClass46_262 = Static65.method1172("Loading)3)3)3");

	@OriginalMember(owner = "client!dg", name = "W", descriptor = "Lclient!kb;")
	public static Class46 aClass46_261 = aClass46_262;

	@OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
	public static int anInt954 = 0;

	@OriginalMember(owner = "client!dg", name = "eb", descriptor = "Lclient!kb;")
	private static Class46 aClass46_265 = Static65.method1172("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!dg", name = "Z", descriptor = "Lclient!kb;")
	public static Class46 aClass46_263 = aClass46_265;

	@OriginalMember(owner = "client!dg", name = "fb", descriptor = "Lclient!kb;")
	private static Class46 aClass46_266 = Static65.method1172("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!dg", name = "ab", descriptor = "Lclient!kb;")
	public static Class46 aClass46_264 = aClass46_266;

	@OriginalMember(owner = "client!dg", name = "bb", descriptor = "[I")
	public static int[] anIntArray76 = new int[5];

	@OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
	public static int anInt955 = 0;

	@OriginalMember(owner = "client!dg", name = "gb", descriptor = "[I")
	public static int[] anIntArray78 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)I")
	public static int method600(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V")
	public static void method601() {
		anIntArray76 = null;
		anIntArray78 = null;
		aClass46_261 = null;
		aClass46_263 = null;
		aClass46_266 = null;
		aClass54_3 = null;
		aClass46_264 = null;
		aClass46_265 = null;
		aClass46_262 = null;
	}
}
