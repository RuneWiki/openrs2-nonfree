import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!qb", name = "ub", descriptor = "Lclient!pb;")
	public static Class40 aClass40_29;

	@OriginalMember(owner = "client!qb", name = "wb", descriptor = "Lclient!gd;")
	public static Class25 aClass25_7;

	@OriginalMember(owner = "client!qb", name = "Cb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_923 = Static34.method846("purple:");

	@OriginalMember(owner = "client!qb", name = "nb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_919 = aClass55_923;

	@OriginalMember(owner = "client!qb", name = "ob", descriptor = "Lclient!rc;")
	private static Class55 aClass55_920 = Static34.method846("Welcome to RuneScape");

	@OriginalMember(owner = "client!qb", name = "rb", descriptor = "I")
	public static int anInt2289 = 0;

	@OriginalMember(owner = "client!qb", name = "sb", descriptor = "I")
	public static int anInt2290 = 0;

	@OriginalMember(owner = "client!qb", name = "tb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_921 = aClass55_920;

	@OriginalMember(owner = "client!qb", name = "xb", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!qb", name = "yb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_922 = Static34.method846("backright2");

	@OriginalMember(owner = "client!qb", name = "Bb", descriptor = "[I")
	public static int[] anIntArray221 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!qb", name = "Db", descriptor = "I")
	public static int anInt2294 = 0;

	@OriginalMember(owner = "client!qb", name = "Eb", descriptor = "Z")
	public static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "(I)V")
	public static void method1559() {
		aClass55_922 = null;
		aClass55_920 = null;
		aClass55_923 = null;
		aClass25_7 = null;
		aClass55_921 = null;
		aClass40_29 = null;
		anIntArray221 = null;
		aClass55_919 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)I")
	public static int method1560(@OriginalArg(1) int arg0) {
		@Pc(7) Class6_Sub2_Sub12 local7 = Static112.method2068(arg0);
		@Pc(18) int local18 = local7.anInt2649;
		@Pc(21) int local21 = local7.anInt2651;
		@Pc(24) int local24 = local7.anInt2652;
		@Pc(31) int local31 = Class54.anIntArray233[local21 - local24];
		return Static11.anIntArray44[local18] >> local24 & local31;
	}
}
