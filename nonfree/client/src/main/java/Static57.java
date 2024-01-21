import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	public static int anInt1361;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!tg;")
	private static Class81 aClass81_473 = Static120.method2057("Username: ");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!tg;")
	public static Class81 aClass81_472 = aClass81_473;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
	public static int anInt1360 = 0;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!tg;")
	private static Class81 aClass81_475 = Static120.method2057("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!tg;")
	public static Class81 aClass81_474 = aClass81_475;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "Lclient!tg;")
	public static Class81 aClass81_476 = Static120.method2057("mod_icons");

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
	public static int anInt1370 = 0;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method1011() {
		Static104.aClass1_Sub8_Sub1_2.method366(204);
		Static104.aClass1_Sub8_Sub1_2.method355(0L);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method1012() {
		aClass81_475 = null;
		aClass81_474 = null;
		aByteArrayArray3 = null;
		aClass81_473 = null;
		aClass81_476 = null;
		aClass81_472 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)I")
	public static int method1015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13 = 256 - arg0;
		return ((arg2 & 0xFF00FF) * arg0 + local13 * (arg1 & 0xFF00FF) & 0xFF00FF00) + (arg0 * (arg2 & 0xFF00) + (arg1 & 0xFF00) * local13 & 0xFF0000) >> 8;
	}
}
