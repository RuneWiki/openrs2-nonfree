import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!b", name = "u", descriptor = "J")
	public static long aLong16;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "[Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array3;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "Z")
	public static boolean aBoolean20;

	@OriginalMember(owner = "client!b", name = "x", descriptor = "[Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array4;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "Lclient!da;")
	public static Class15 aClass15_7;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "Lclient!wb;")
	public static Class65 aClass65_117 = Static24.method441("@cr2@");

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Lclient!ge;")
	public static Class21 aClass21_3 = new Class21(64);

	@OriginalMember(owner = "client!b", name = "o", descriptor = "Lclient!ge;")
	public static Class21 aClass21_4 = new Class21(50);

	@OriginalMember(owner = "client!b", name = "p", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!b", name = "s", descriptor = "Lclient!wb;")
	private static Class65 aClass65_120 = Static24.method441("Please wait)3)3)3");

	@OriginalMember(owner = "client!b", name = "q", descriptor = "Lclient!wb;")
	public static Class65 aClass65_118 = aClass65_120;

	@OriginalMember(owner = "client!b", name = "r", descriptor = "Lclient!wb;")
	public static Class65 aClass65_119 = Static24.method441("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!b", name = "t", descriptor = "Lclient!wb;")
	public static Class65 aClass65_121 = Static24.method441("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method128() {
		aClass65_117 = null;
		aClass65_118 = null;
		aClass2_Sub1_Sub4_Sub2Array3 = null;
		aClass65_119 = null;
		aClass15_7 = null;
		aClass21_3 = null;
		aClass21_4 = null;
		aClass65_120 = null;
		aClass65_121 = null;
		aClass2_Sub1_Sub4_Sub2Array4 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Lclient!wb;")
	public static Class65 method129(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static93.method1617(arg0);
		} else if (arg0 < 10000000) {
			return Static13.method282(new Class65[] { Static93.method1617(arg0 / 1000), Static63.aClass65_859 });
		} else {
			return Static13.method282(new Class65[] { Static93.method1617(arg0 / 1000000), Static12.aClass65_217 });
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(II)Lclient!wb;")
	public static Class65 method131(@OriginalArg(1) int arg0) {
		@Pc(11) Class65 local11 = Static93.method1617(arg0);
		for (@Pc(17) int local17 = local11.method1760() - 3; local17 > 0; local17 -= 3) {
			local11 = Static13.method282(new Class65[] { local11.method1772(local17, 0), Static106.aClass65_1295, local11.method1779(local17) });
		}
		if (local11.method1760() > 8) {
			local11 = Static13.method282(new Class65[] { Static47.aClass65_621, local11.method1772(local11.method1760() - 8, 0), Static108.aClass65_1325, Static96.aClass65_1202, local11, Static52.aClass65_720 });
		} else if (local11.method1760() > 4) {
			local11 = Static13.method282(new Class65[] { Static8.aClass65_143, local11.method1772(local11.method1760() - 4, 0), Static63.aClass65_860, Static96.aClass65_1202, local11, Static52.aClass65_720 });
		}
		return Static13.method282(new Class65[] { Static22.aClass65_305, local11 });
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BLclient!k;)V")
	public static void method132(@OriginalArg(1) Class33 arg0) {
		Static17.aClass33_6 = arg0;
		Static56.anInt1694 = Static17.aClass33_6.method1153(16);
	}
}
