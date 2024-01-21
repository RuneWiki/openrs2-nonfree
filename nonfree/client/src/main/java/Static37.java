import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
	public static int anInt2216;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!na;")
	public static Class53 aClass53_1059 = Static109.method1737("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	public static int anInt2211 = 0;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17 = new byte[4][104][104];

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!na;")
	public static Class53 aClass53_1060 = Static109.method1737("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!na;")
	private static Class53 aClass53_1061 = Static109.method1737("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
	public static int anInt2215 = 0;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!na;")
	public static Class53 aClass53_1062 = aClass53_1061;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[112];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!be;IIIII)V")
	public static void method1534(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class3_Sub19 local7 = new Class3_Sub19();
		local7.anInt2873 = arg0.anInt273 * 128;
		local7.anInt2870 = arg0.anInt265;
		local7.anInt2883 = arg2 * 128;
		local7.anInt2877 = arg3;
		local7.anIntArray418 = arg0.anIntArray28;
		local7.anInt2881 = arg0.anInt276;
		local7.anInt2872 = arg0.anInt287;
		local7.anInt2874 = arg1 * 128;
		@Pc(53) int local53 = arg0.anInt270;
		@Pc(56) int local56 = arg0.anInt282;
		if (arg4 == 1 || arg4 == 3) {
			local53 = arg0.anInt282;
			local56 = arg0.anInt270;
		}
		local7.anInt2878 = (arg1 + local56) * 128;
		local7.anInt2885 = (local53 + arg2) * 128;
		if (arg0.anIntArray24 != null) {
			local7.aClass3_Sub1_Sub2_1 = arg0;
			local7.method1968();
		}
		Static94.aClass11_10.method190(local7);
		if (local7.anIntArray418 != null) {
			local7.anInt2876 = local7.anInt2870 + (int) ((double) (local7.anInt2881 - local7.anInt2870) * Math.random());
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!p;B)V")
	public static void method1535(@OriginalArg(0) Class57 arg0) {
		Static95.aClass57_1 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method1537() {
		aClass53_1060 = null;
		aByteArrayArrayArray17 = null;
		aBooleanArray11 = null;
		aClass53_1062 = null;
		aClass53_1059 = null;
		aClass53_1061 = null;
	}
}
