import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!kb", name = "Vc", descriptor = "Lclient!ac;")
	public static Class3 aClass3_14;

	@OriginalMember(owner = "client!kb", name = "hd", descriptor = "Lclient!ta;")
	public static Class14 aClass14_20;

	@OriginalMember(owner = "client!kb", name = "id", descriptor = "I")
	public static int anInt1434;

	@OriginalMember(owner = "client!kb", name = "Pc", descriptor = "Lclient!jb;")
	public static Class32 aClass32_1 = new Class32();

	@OriginalMember(owner = "client!kb", name = "Qc", descriptor = "[I")
	public static int[] anIntArray186 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!kb", name = "Rc", descriptor = "Lclient!kc;")
	private static Class36 aClass36_689 = Static14.method2017("This computers address has been blocked");

	@OriginalMember(owner = "client!kb", name = "Uc", descriptor = "Lclient!kc;")
	public static Class36 aClass36_690 = aClass36_689;

	@OriginalMember(owner = "client!kb", name = "Xc", descriptor = "Lclient!kc;")
	public static Class36 aClass36_691 = Static14.method2017("Absender:");

	@OriginalMember(owner = "client!kb", name = "Yc", descriptor = "I")
	public static int anInt1431 = 0;

	@OriginalMember(owner = "client!kb", name = "bd", descriptor = "Lclient!kc;")
	private static Class36 aClass36_693 = Static14.method2017("Error loading your profile)3");

	@OriginalMember(owner = "client!kb", name = "Zc", descriptor = "Lclient!kc;")
	public static Class36 aClass36_692 = aClass36_693;

	@OriginalMember(owner = "client!kb", name = "ad", descriptor = "I")
	public static int anInt1432 = -1;

	@OriginalMember(owner = "client!kb", name = "cd", descriptor = "Lclient!kc;")
	private static Class36 aClass36_694 = Static14.method2017("slide:");

	@OriginalMember(owner = "client!kb", name = "dd", descriptor = "Lclient!kc;")
	public static Class36 aClass36_695 = Static14.method2017("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!kb", name = "ed", descriptor = "I")
	public static int anInt1433 = 0;

	@OriginalMember(owner = "client!kb", name = "jd", descriptor = "Lclient!kc;")
	private static Class36 aClass36_698 = Static14.method2017("Public chat");

	@OriginalMember(owner = "client!kb", name = "fd", descriptor = "Lclient!kc;")
	public static Class36 aClass36_696 = aClass36_698;

	@OriginalMember(owner = "client!kb", name = "gd", descriptor = "Lclient!kc;")
	public static Class36 aClass36_697 = aClass36_694;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(B)V")
	public static void method1000() {
		aClass36_696 = null;
		aClass36_697 = null;
		aClass36_694 = null;
		aClass36_691 = null;
		aClass36_693 = null;
		aClass32_1 = null;
		aClass36_690 = null;
		aClass36_689 = null;
		aClass36_698 = null;
		aClass36_695 = null;
		aClass14_20 = null;
		aClass36_692 = null;
		anIntArray186 = null;
		aClass3_14 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Z")
	public static boolean method1001(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Static55.anIntArray329[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 11;
	}
}
