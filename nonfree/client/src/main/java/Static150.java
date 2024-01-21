import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	public static int anInt3362;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "[Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3[] aClass2_Sub4_Sub3_Sub3Array7;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1974 = Static107.method1838("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Lclient!ab;")
	public static Class2_Sub2 aClass2_Sub2_5 = new Class2_Sub2(new byte[5000]);

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1975 = Static107.method1838("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1976 = Static107.method1838("ams");

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	public static int anInt3365 = 0;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1977 = Static107.method1838("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "[Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4[] aClass2_Sub4_Sub3_Sub4Array11 = new Class2_Sub4_Sub3_Sub4[1000];

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1978 = Static107.method1838("blinken1:");

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1979 = Static107.method1838("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1980 = aClass28_1975;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1981 = Static107.method1838("sl_back");

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "[Lclient!gg;")
	public static Class28[] aClass28Array49 = new Class28[100];

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1982 = aClass28_1977;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Z")
	public static boolean method2328() {
		@Pc(10) Class59 local10 = Static45.aClass59_1;
		synchronized (Static45.aClass59_1) {
			if (Static47.anInt1604 == Static26.anInt812) {
				return false;
			} else {
				Static108.anInt2635 = Static26.anIntArray62[Static47.anInt1604];
				Static99.anInt2499 = Static104.anIntArray238[Static47.anInt1604];
				Static47.anInt1604 = Static47.anInt1604 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method2329() {
		if (Static165.anIntArray339 != null && Static31.anIntArray368 != null) {
			return;
		}
		Static31.anIntArray368 = new int[256];
		Static165.anIntArray339 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static165.anIntArray339[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static31.anIntArray368[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method2330() {
		aClass28Array49 = null;
		aClass28_1981 = null;
		aClass28_1975 = null;
		aClass28_1976 = null;
		aClass28_1979 = null;
		aClass28_1974 = null;
		aClass28_1977 = null;
		aClass2_Sub4_Sub3_Sub4Array11 = null;
		aClass2_Sub2_5 = null;
		aClass28_1978 = null;
		aClass28_1980 = null;
		aClass28_1982 = null;
		aClass2_Sub4_Sub3_Sub3Array7 = null;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	public static void method2331() {
		Static159.aClass14_207.method596();
		Static97.aClass14_125.method596();
		Static4.aClass14_7.method596();
		Static118.aClass14_205.method596();
		Static85.aClass14_107.method596();
	}
}
