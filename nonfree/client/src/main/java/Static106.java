import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!w", name = "mb", descriptor = "[I")
	public static int[] anIntArray312;

	@OriginalMember(owner = "client!w", name = "Cb", descriptor = "Lclient!kb;")
	public static Class9 aClass9_54;

	@OriginalMember(owner = "client!w", name = "Vb", descriptor = "Lclient!v;")
	private static Class62 aClass62_1283 = Static45.method753("Enter amount:");

	@OriginalMember(owner = "client!w", name = "hb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1278 = aClass62_1283;

	@OriginalMember(owner = "client!w", name = "ib", descriptor = "I")
	public static int anInt2802 = 0;

	@OriginalMember(owner = "client!w", name = "jb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1279 = Static45.method753("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!w", name = "sb", descriptor = "[Lclient!lb;")
	public static Class3_Sub1_Sub3_Sub3[] aClass3_Sub1_Sub3_Sub3Array1 = new Class3_Sub1_Sub3_Sub3[4];

	@OriginalMember(owner = "client!w", name = "xb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1280 = Static45.method753("Icons redrawn");

	@OriginalMember(owner = "client!w", name = "Db", descriptor = "Z")
	public static boolean aBoolean167 = false;

	@OriginalMember(owner = "client!w", name = "Ib", descriptor = "Lclient!v;")
	public static Class62 aClass62_1281 = Static45.method753("gr\u001c1n:");

	@OriginalMember(owner = "client!w", name = "Mb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1282 = Static45.method753("cross");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0 && arg0 == Static23.anInt751) {
			return true;
		} else if (arg1 == 1 && arg0 == Static15.anInt575) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && Static63.anInt2394 == arg0;
		}
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
	public static void method1847() {
		aClass3_Sub1_Sub3_Sub3Array1 = null;
		aClass62_1280 = null;
		aClass62_1282 = null;
		aClass62_1283 = null;
		aClass62_1281 = null;
		anIntArray312 = null;
		aClass9_54 = null;
		aClass62_1279 = null;
		aClass62_1278 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)I")
	public static int method1848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg0 & arg1 - 1;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg1 - 1 & arg2;
		@Pc(28) int local28 = Static13.method321(local7, local17);
		@Pc(35) int local35 = Static13.method321(local7 + 1, local17);
		@Pc(42) int local42 = Static13.method321(local7, local17 + 1);
		@Pc(56) int local56 = Static13.method321(local7 + 1, local17 + 1);
		@Pc(63) int local63 = Static99.method1658(arg1, local28, local13, local35);
		@Pc(70) int local70 = Static99.method1658(arg1, local42, local13, local56);
		return Static99.method1658(arg1, local63, local23, local70);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!mb;B)V")
	public static void method1849(@OriginalArg(0) Class42 arg0) {
		Static104.aClass42_73 = arg0;
	}
}
