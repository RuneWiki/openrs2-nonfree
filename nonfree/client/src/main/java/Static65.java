import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "Lclient!of;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
	public static int anInt1451;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!e;")
	public static Class16 aClass16_53 = new Class16(200);

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt1443 = 0;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_1005 = Static72.method1077("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "Lclient!u;")
	private static Class74 aClass74_1019 = Static72.method1077("Please try using a different world)3");

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "Lclient!u;")
	public static Class74 aClass74_1006 = aClass74_1019;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "Lclient!u;")
	private static Class74 aClass74_1009 = Static72.method1077("wave2:");

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "Lclient!u;")
	public static Class74 aClass74_1007 = aClass74_1009;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Lclient!u;")
	public static Class74 aClass74_1008 = aClass74_1019;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "Lclient!u;")
	public static Class74 aClass74_1010 = aClass74_1019;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "Lclient!u;")
	public static Class74 aClass74_1011 = Static72.method1077("backbase1");

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "Lclient!u;")
	public static Class74 aClass74_1012 = Static72.method1077("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "Lclient!u;")
	public static Class74 aClass74_1013 = Static72.method1077("backvmid1");

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "Lclient!e;")
	public static Class16 aClass16_54 = new Class16(64);

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "Lclient!u;")
	public static Class74 aClass74_1014 = aClass74_1019;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "[I")
	public static int[] anIntArray178 = new int[2000];

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "Lclient!u;")
	public static Class74 aClass74_1015 = aClass74_1009;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "Lclient!u;")
	public static Class74 aClass74_1016 = aClass74_1019;

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
	public static int anInt1449 = 0;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
	public static int anInt1450 = 0;

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "[Lclient!pe;")
	public static Class26_Sub1[] aClass26_Sub1Array1 = new Class26_Sub1[256];

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "Lclient!u;")
	public static Class74 aClass74_1017 = Static72.method1077(":tradereq:");

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "Lclient!u;")
	public static Class74 aClass74_1018 = aClass74_1019;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method1009() {
		for (@Pc(6) Class2_Sub9 local6 = (Class2_Sub9) Static35.aClass13_69.method415(); local6 != null; local6 = (Class2_Sub9) Static35.aClass13_69.method414()) {
			if (local6.aClass2_Sub16_Sub1_3 != null) {
				Static55.aClass2_Sub16_Sub3_2.method1842(local6.aClass2_Sub16_Sub1_3);
				local6.aClass2_Sub16_Sub1_3 = null;
			}
			if (local6.aClass2_Sub16_Sub1_2 != null) {
				Static55.aClass2_Sub16_Sub3_2.method1842(local6.aClass2_Sub16_Sub1_2);
				local6.aClass2_Sub16_Sub1_2 = null;
			}
		}
		Static35.aClass13_69.method421();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!g;II)Z")
	public static boolean method1010(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) byte[] local14 = arg0.method1358(arg2, arg1);
		if (local14 == null) {
			return false;
		} else {
			Static85.method1296(local14);
			return true;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method1011() {
		aClass16_54 = null;
		anIntArray178 = null;
		aClass74_1013 = null;
		aClass74_1011 = null;
		aClass74_1016 = null;
		aClass7_1 = null;
		aClass74_1010 = null;
		aClass74_1006 = null;
		aClass74_1019 = null;
		aClass74_1008 = null;
		aClass74_1009 = null;
		aClass74_1007 = null;
		aClass16_53 = null;
		aClass74_1015 = null;
		aClass74_1018 = null;
		aClass26_Sub1Array1 = null;
		aClass74_1017 = null;
		aClass74_1005 = null;
		aClass74_1014 = null;
		aClass74_1012 = null;
	}
}
