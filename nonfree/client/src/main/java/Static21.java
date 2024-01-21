import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	public static int anInt567;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Lclient!cd;")
	public static Class15 aClass15_3;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	public static int anInt570;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_131 = Static181.method2795("Error connecting to server)3");

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!qe;")
	public static Class83 aClass83_127 = aClass83_131;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_128 = Static181.method2795("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_129 = Static181.method2795("null");

	@OriginalMember(owner = "client!c", name = "j", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_130 = Static181.method2795(" x ");

	@OriginalMember(owner = "client!c", name = "l", descriptor = "I")
	public static int anInt572 = 0;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLclient!td;)V")
	public static void method419(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static61.anInt1502 != 1) {
			return;
		}
		if (Static59.anInt1446 >= 280 && Static59.anInt1446 <= 294 && Static153.anInt3298 >= 4 && Static153.anInt3298 <= 18) {
			Static177.method2713(0, 0);
			return;
		}
		if (Static59.anInt1446 >= 295 && Static59.anInt1446 <= 360 && Static153.anInt3298 >= 4 && Static153.anInt3298 <= 18) {
			Static177.method2713(0, 1);
			return;
		}
		if (Static59.anInt1446 >= 390 && Static59.anInt1446 <= 404 && Static153.anInt3298 >= 4 && Static153.anInt3298 <= 18) {
			Static177.method2713(1, 0);
			return;
		}
		if (Static59.anInt1446 >= 405 && Static59.anInt1446 <= 470 && Static153.anInt3298 >= 4 && Static153.anInt3298 <= 18) {
			Static177.method2713(1, 1);
			return;
		}
		if (Static59.anInt1446 >= 500 && Static59.anInt1446 <= 514 && Static153.anInt3298 >= 4 && Static153.anInt3298 <= 18) {
			Static177.method2713(2, 0);
			return;
		}
		if (Static59.anInt1446 >= 515 && Static59.anInt1446 <= 580 && Static153.anInt3298 >= 4 && Static153.anInt3298 <= 18) {
			Static177.method2713(2, 1);
			return;
		}
		if (Static59.anInt1446 >= 610 && Static59.anInt1446 <= 624 && Static153.anInt3298 >= 4 && Static153.anInt3298 <= 18) {
			Static177.method2713(3, 0);
			return;
		}
		if (Static59.anInt1446 >= 625 && Static59.anInt1446 <= 690 && Static153.anInt3298 >= 4 && Static153.anInt3298 <= 18) {
			Static177.method2713(3, 1);
			return;
		}
		if (Static59.anInt1446 >= 700 && Static153.anInt3298 >= 4 && Static59.anInt1446 <= 758 && Static153.anInt3298 <= 20) {
			Static120.aBoolean135 = false;
			Static33.method681();
			return;
		}
		if (Static193.anInt3832 == -1) {
			return;
		}
		@Pc(265) Class75 local265 = Static13.aClass75Array1[Static193.anInt3832];
		if (local265.aBoolean142 == Static116.aBoolean127) {
			@Pc(289) byte[] local289 = Static67.method1268(new Class83[] { local265.aClass83_875, Static108.aClass83_724 }).method2418();
			Static196.aString6 = new String(local289, 0, local289.length);
			if (Static214.anInt4256 != 0) {
				Static214.anInt4256 = 0;
				Static208.anInt4116 = 43594;
				Static94.anInt2004 = 43594;
				Static80.anInt1792 = 443;
			}
			Static120.aBoolean135 = false;
			Static118.anInt2710 = local265.anInt2988;
			Static33.method681();
			return;
		}
		@Pc(373) Class83 local373 = Static67.method1268(new Class83[] { Static173.aClass83_1022, local265.aClass83_875, Static139.aClass83_867, Static129.method2179(Static98.anInt2134), Static111.aClass83_761, Static129.method2179(Static158.aBoolean148 ? 1 : 0), Static46.aClass83_345, Static129.method2179(Static52.anInt1333), Static100.aClass83_666, Static129.method2179(Static158.anInt3205) });
		try {
			arg0.getAppletContext().showDocument(local373.method2427(), "_self");
			return;
		} catch (@Pc(382) Exception local382) {
			return;
		}
	}
}
