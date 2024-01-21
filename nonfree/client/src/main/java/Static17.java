import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!be", name = "N", descriptor = "I")
	public static int anInt497;

	@OriginalMember(owner = "client!be", name = "T", descriptor = "I")
	public static int anInt498;

	@OriginalMember(owner = "client!be", name = "M", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_95 = Static181.method2795("settings");

	@OriginalMember(owner = "client!be", name = "O", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_96 = Static181.method2795("blaugr-Un:");

	@OriginalMember(owner = "client!be", name = "P", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_97 = Static181.method2795(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_98 = Static181.method2795("Unable to find ");

	@OriginalMember(owner = "client!be", name = "R", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_99 = Static181.method2795("Connecting to update server");

	@OriginalMember(owner = "client!be", name = "Y", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_102 = Static181.method2795("Type");

	@OriginalMember(owner = "client!be", name = "S", descriptor = "Lclient!qe;")
	public static Class83 aClass83_100 = aClass83_102;

	@OriginalMember(owner = "client!be", name = "V", descriptor = "Lclient!qe;")
	public static Class83 aClass83_101 = aClass83_99;

	@OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
	public static int anInt503 = 0;

	@OriginalMember(owner = "client!be", name = "db", descriptor = "Lclient!qe;")
	public static Class83 aClass83_103 = aClass83_98;

	@OriginalMember(owner = "client!be", name = "eb", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_104 = Static181.method2795("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!be", name = "hb", descriptor = "Lclient!qe;")
	public static Class83 aClass83_105 = aClass83_104;

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)V")
	public static void method372() {
		Static124.anIntArray251 = null;
		Static131.anIntArray284 = null;
		Static153.anIntArray317 = null;
		Static151.aByteArrayArray14 = null;
		Static28.anIntArray61 = null;
		Static163.anIntArray314 = null;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V")
	public static void method373() {
		for (@Pc(10) Class2_Sub15 local10 = (Class2_Sub15) Static51.aClass19_4.method691(); local10 != null; local10 = (Class2_Sub15) Static51.aClass19_4.method686()) {
			if (local10.anInt2079 > 0) {
				local10.anInt2079--;
			}
			if (local10.anInt2079 != 0) {
				if (local10.anInt2077 > 0) {
					local10.anInt2077--;
				}
				if (local10.anInt2077 == 0 && local10.anInt2084 >= 1 && local10.anInt2082 >= 1 && local10.anInt2084 <= 102 && local10.anInt2082 <= 102 && (local10.anInt2086 < 0 || Static165.method2550(local10.anInt2083, local10.anInt2086))) {
					Static153.method2523(local10.anInt2074, local10.anInt2084, local10.anInt2083, local10.anInt2076, local10.anInt2082, local10.anInt2080, local10.anInt2086);
					local10.anInt2077 = -1;
					if (local10.anInt2078 == local10.anInt2086 && local10.anInt2078 == -1) {
						local10.method3254();
					} else if (local10.anInt2078 == local10.anInt2086 && local10.anInt2087 == local10.anInt2074 && local10.anInt2083 == local10.anInt2075) {
						local10.method3254();
					}
				}
			} else if (local10.anInt2078 < 0 || Static165.method2550(local10.anInt2075, local10.anInt2078)) {
				Static153.method2523(local10.anInt2087, local10.anInt2084, local10.anInt2075, local10.anInt2076, local10.anInt2082, local10.anInt2080, local10.anInt2078);
				local10.method3254();
			}
		}
	}
}
