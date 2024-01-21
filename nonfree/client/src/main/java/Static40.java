import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "Lclient!mb;")
	public static Class42 aClass42_30;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "[[[Lclient!fc;")
	public static Class24[][][] aClass24ArrayArrayArray1 = new Class24[4][104][104];

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Z")
	public static boolean aBoolean66 = false;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
	public static int[] anIntArray82 = new int[50];

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
	public static int anInt1168 = 0;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "Lclient!v;")
	private static Class62 aClass62_501 = Static45.method753("Welcome to RuneScape");

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!v;")
	public static Class62 aClass62_500 = aClass62_501;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "J")
	public static volatile long aLong34 = 0L;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "Lclient!v;")
	public static Class62 aClass62_502 = Static45.method753("@yel@");

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
	public static int anInt1176 = 1;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
	public static int anInt1177 = 0;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Lclient!v;")
	public static Class62 aClass62_503 = Static45.method753("title)3jpg");

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V")
	public static void method692() {
		Static61.method1028(false, 10, null, 0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method693() {
		aClass62_502 = null;
		anIntArrayArray7 = null;
		aClass62_503 = null;
		aClass42_30 = null;
		aClass24ArrayArrayArray1 = null;
		aClass62_501 = null;
		aClass62_500 = null;
		anIntArray82 = null;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public static void method694() {
		if (Static63.anInt2365 > 0) {
			Static28.method570();
		} else {
			Static65.method1089(40);
			Static69.aClass41_3 = Static55.aClass41_2;
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)Lclient!rc;")
	public static Class3_Sub1_Sub1_Sub3 method695() {
		@Pc(17) Class3_Sub1_Sub1_Sub3 local17 = new Class3_Sub1_Sub1_Sub3(Static36.anIntArray78, Static75.anIntArray228, Static50.anIntArray310, Static70.anIntArray201, Static98.aByteArrayArray9);
		Static51.method1440();
		return local17;
	}
}
