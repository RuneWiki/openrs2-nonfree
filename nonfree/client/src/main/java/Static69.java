import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "Lclient!id;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_709 = Static177.method3050("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!jd;")
	public static Class46 aClass46_708 = aClass46_709;

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
	public static int anInt1852 = 0;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "[Lclient!fb;")
	public static final Class26[] aClass26Array1 = new Class26[50];

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "[I")
	public static final int[] anIntArray171 = new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, -2, -2, 0, 0, 0, 0, 6, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 6, 0, 0, 5, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 3, -2, 0, 12, 6, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, -2, 0, 6, 0, 0, 0, 0, 6, 0, 0, 5, 20, 0, 0, 0, 0, 0, 0, 0, 4, -2, -2, 7, 10, -2, -2, 6, 0, 0, 0, 0, 0, -2, 0, 0, -1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 6, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 10, 6, 0, 1, 0, 0, 1, 4, 4, 0, 2, 0, 14, 4, 0, 3, 0, -1, 0, 0, 0, 0, 0, 0, 4, -2, 7, 1, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 2, -1, 2, -1, 0, 0, 0, 0, -1, 0, 0, 0, 24, 0, 2, 0, 6, 0, 0, -2, 7, 0, 0, 0, -1, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -1, 3, 0, 0, 0, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "[I")
	public static final int[] anIntArray172 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_710 = Static177.method3050("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_711 = Static177.method3050("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
	public static int anInt1855 = 1;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "Z")
	public static boolean aBoolean83 = false;

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_712 = Static177.method3050("Welt");

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Z")
	public static boolean method1480(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
	public static void method1481() {
		for (@Pc(3) int local3 = -1; local3 < Static126.anInt3006; local3++) {
			@Pc(13) int local13;
			if (local3 == -1) {
				local13 = 2047;
			} else {
				local13 = Static167.anIntArray369[local3];
			}
			@Pc(21) Class4_Sub1_Sub1_Sub1_Sub1 local21 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local13];
			if (local21 != null) {
				Static45.method758(local21, 1);
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[Lclient!jd;)Lclient!jd;")
	public static Class46 method1482(@OriginalArg(1) Class46[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static116.method2123(arg0.length, arg0, 0);
	}
}
