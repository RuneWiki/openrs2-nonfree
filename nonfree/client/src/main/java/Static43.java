import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2 aClass6_Sub2_Sub2_Sub2_7;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "Lclient!pb;")
	public static Class40 aClass40_23;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Lclient!fc;")
	public static Class21 aClass21_11;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "[I")
	public static int[] anIntArray139;

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "Lclient!md;")
	public static Class40_Sub1 aClass40_Sub1_19;

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "[I")
	public static int[] anIntArray140;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
	public static int anInt1467;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!rc;")
	private static Class55 aClass55_557 = Static34.method846("Continue");

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!rc;")
	private static Class55 aClass55_562 = Static34.method846("Loading config )2 ");

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!rc;")
	public static Class55 aClass55_558 = aClass55_562;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[I")
	public static int[] anIntArray138 = new int[1000];

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8 = new byte[4][104][104];

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!rc;")
	public static Class55 aClass55_559 = aClass55_557;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Lclient!rc;")
	public static Class55 aClass55_560 = Static34.method846(":duelreq:");

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Lclient!rc;")
	public static Class55 aClass55_561 = Static34.method846("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
	public static int anInt1463 = 0;

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "[Lclient!md;")
	public static Class40_Sub1[] aClass40_Sub1Array1 = new Class40_Sub1[256];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZI)V")
	public static void method982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg1 * (arg1 - 32) / arg4;
		if (local7 < 8) {
			local7 = 8;
		}
		Static18.aClass6_Sub2_Sub2_Sub1Array16[0].method318(arg3, arg0);
		@Pc(42) int local42 = arg2 * (arg1 - local7 - 32) / (arg4 - arg1);
		Static18.aClass6_Sub2_Sub2_Sub1Array16[1].method318(arg3, arg1 + arg0 - 16);
		Static53.method1276(arg3, arg0 + 16, 16, arg1 - 32, Static75.anInt2132);
		Static53.method1276(arg3, local42 + arg0 + 16, 16, local7, Static65.anInt1930);
		Static53.method1290(arg3, arg0 + local42 + 16, local7, Static14.anInt807);
		Static53.method1290(arg3 + 1, local42 + arg0 + 16, local7, Static14.anInt807);
		Static53.method1285(arg3, arg0 + local42 + 16, 16, Static14.anInt807);
		Static53.method1285(arg3, arg0 + local42 + 17, 16, Static14.anInt807);
		Static53.method1290(arg3 + 15, local42 + 16 + arg0, local7, Static70.anInt2067);
		Static53.method1290(arg3 + 14, local42 + 17 + arg0, local7 - 1, Static70.anInt2067);
		Static53.method1285(arg3, local42 + arg0 + local7 + 15, 16, Static70.anInt2067);
		Static53.method1285(arg3 + 1, arg0 + 14 + local42 - -local7, 15, Static70.anInt2067);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 method984() {
		@Pc(7) Class6_Sub2_Sub2_Sub1 local7 = new Class6_Sub2_Sub2_Sub1();
		local7.anInt367 = Static94.anInt2642;
		local7.anInt365 = Static88.anInt3274;
		local7.anInt366 = Static34.anIntArray80[0];
		local7.anInt363 = Static94.anIntArray248[0];
		local7.anInt364 = Static72.anIntArray195[0];
		local7.anInt368 = Static38.anIntArray95[0];
		local7.anIntArray24 = Static44.anIntArray257;
		local7.aByteArray4 = Static67.aByteArrayArray6[0];
		Static6.method238();
		return local7;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(BI)Lclient!ha;")
	public static Class6_Sub2_Sub6 method985(@OriginalArg(1) int arg0) {
		@Pc(15) Class6_Sub2_Sub6 local15 = (Class6_Sub2_Sub6) Static4.aClass36_29.method1154((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static106.aClass40_31.method1243(arg0, 16);
		local15 = new Class6_Sub2_Sub6();
		if (local25 != null) {
			local15.method845(new Class6_Sub1(local25));
		}
		Static4.aClass36_29.method1161((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public static void method986() {
		aClass21_11 = null;
		aClass6_Sub2_Sub2_Sub2_7 = null;
		anIntArray138 = null;
		aClass55_560 = null;
		aClass55_561 = null;
		aClass40_Sub1_19 = null;
		aByteArrayArrayArray8 = null;
		aClass55_557 = null;
		aClass40_23 = null;
		anIntArray139 = null;
		aClass55_559 = null;
		aClass40_Sub1Array1 = null;
		anIntArray140 = null;
		aClass55_562 = null;
		aClass55_558 = null;
	}
}
