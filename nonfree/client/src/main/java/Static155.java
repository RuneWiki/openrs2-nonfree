import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!t", name = "lb", descriptor = "Lclient!jc;")
	public static Class40 aClass40_34;

	@OriginalMember(owner = "client!t", name = "rb", descriptor = "Lclient!fd;")
	public static Class22 aClass22_4;

	@OriginalMember(owner = "client!t", name = "gb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2039 = Static107.method1838("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!t", name = "ib", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2040 = Static107.method1838("Loaded config");

	@OriginalMember(owner = "client!t", name = "ob", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2043 = Static107.method1838("slide:");

	@OriginalMember(owner = "client!t", name = "mb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2041 = aClass28_2043;

	@OriginalMember(owner = "client!t", name = "nb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2042 = aClass28_2043;

	@OriginalMember(owner = "client!t", name = "qb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2044 = aClass28_2040;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public static void method2398() {
		for (@Pc(6) Class2_Sub19 local6 = (Class2_Sub19) Static29.aClass65_2.method2115(); local6 != null; local6 = (Class2_Sub19) Static29.aClass65_2.method2117()) {
			if (local6.anInt2722 == -1) {
				local6.anInt2714 = 0;
				Static168.method2644(local6);
			} else {
				local6.method2888();
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(B)V")
	public static void method2399() {
		aClass28_2039 = null;
		aClass28_2040 = null;
		aClass28_2041 = null;
		aClass22_4 = null;
		aClass28_2042 = null;
		aClass28_2044 = null;
		aClass40_34 = null;
		aClass28_2043 = null;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(III)V")
	public static void method2400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static150.anInt3365 < 2 && Static166.anInt3704 == 0 && !Static163.aBoolean157) {
			return;
		}
		@Pc(47) Class28 local47;
		if (Static166.anInt3704 == 1 && Static150.anInt3365 < 2) {
			local47 = Static83.method1481(new Class28[] { Static28.aClass28_538, Static180.aClass28_2425, Static61.aClass28_954, Static160.aClass28_2059 });
		} else if (Static163.aBoolean157 && Static150.anInt3365 < 2) {
			local47 = Static83.method1481(new Class28[] { Static98.aClass28_1425, Static180.aClass28_2425, Static24.aClass28_499, Static160.aClass28_2059 });
		} else {
			local47 = Static136.method2141(Static150.anInt3365 - 1);
		}
		if (Static150.anInt3365 > 2) {
			local47 = Static83.method1481(new Class28[] { local47, Static44.aClass28_719, Static158.method2411(Static150.anInt3365 - 2), Static69.aClass28_1085 });
		}
		@Pc(127) int local127 = Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2453(local47, arg1 + 4, arg0 + 15, Static109.aRandom1, Static43.anInt1123);
		Static19.method609(15, arg0, arg1 + 4, Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2475(local47) + local127);
	}
}
