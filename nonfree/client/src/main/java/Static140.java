import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!rb", name = "sb", descriptor = "I")
	public static int anInt3211;

	@OriginalMember(owner = "client!rb", name = "ub", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_98;

	@OriginalMember(owner = "client!rb", name = "hb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1890 = Static107.method1838("Please reload this page)3");

	@OriginalMember(owner = "client!rb", name = "gb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1889 = aClass28_1890;

	@OriginalMember(owner = "client!rb", name = "ib", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1891 = Static107.method1838("Please use a different world)3");

	@OriginalMember(owner = "client!rb", name = "jb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1892 = Static107.method1838("::fps ");

	@OriginalMember(owner = "client!rb", name = "lb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1894 = Static107.method1838("wishes to trade with you)3");

	@OriginalMember(owner = "client!rb", name = "kb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1893 = aClass28_1894;

	@OriginalMember(owner = "client!rb", name = "mb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1895 = Static107.method1838("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!rb", name = "nb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1896 = aClass28_1891;

	@OriginalMember(owner = "client!rb", name = "pb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1897 = aClass28_1891;

	@OriginalMember(owner = "client!rb", name = "wb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1898 = Static107.method1838("::fpson");

	@OriginalMember(owner = "client!rb", name = "yb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1899 = Static107.method1838("<col=ffffff>");

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)V")
	public static void method2210() {
		aClass28_1894 = null;
		aClass28_1895 = null;
		aClass28_1893 = null;
		aClass28_1891 = null;
		aClass28_1897 = null;
		aClass28_1890 = null;
		aClass28_1892 = null;
		aClass28_1896 = null;
		aClass28_1889 = null;
		aClass40_Sub1_98 = null;
		aClass28_1899 = null;
		aClass28_1898 = null;
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)V")
	public static void method2211() {
		for (@Pc(14) Class2_Sub22 local14 = (Class2_Sub22) Static121.aClass35_35.method1359(); local14 != null; local14 = (Class2_Sub22) Static121.aClass35_35.method1361()) {
			@Pc(19) int local19 = local14.anInt2866;
			if (Static131.method2109(local19)) {
				@Pc(25) boolean local25 = true;
				@Pc(29) Class24[] local29 = Static23.aClass24ArrayArray1[local19];
				for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
					if (local29[local31] != null) {
						local25 = local29[local31].aBoolean63;
						break;
					}
				}
				if (!local25) {
					@Pc(59) int local59 = (int) local14.aLong145;
					@Pc(65) Class24 local65 = Static58.method1035(local59);
					if (local65 != null) {
						Static104.method1828(local65);
					}
				}
			}
		}
	}
}
