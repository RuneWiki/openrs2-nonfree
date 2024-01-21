import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static105 {

	@OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
	public static int anInt2370;

	@OriginalMember(owner = "client!n", name = "jb", descriptor = "[Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3[] aClass3_Sub1_Sub3_Sub3Array33;

	@OriginalMember(owner = "client!n", name = "N", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1362 = Static122.method531(": ");

	@OriginalMember(owner = "client!n", name = "gb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1366 = Static122.method531("glow1:");

	@OriginalMember(owner = "client!n", name = "R", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1363 = aClass73_1366;

	@OriginalMember(owner = "client!n", name = "T", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1364 = Static122.method531("(U5");

	@OriginalMember(owner = "client!n", name = "V", descriptor = "Z")
	public static boolean aBoolean159 = false;

	@OriginalMember(owner = "client!n", name = "ab", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1365 = Static122.method531(")4l");

	@OriginalMember(owner = "client!n", name = "hb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1367 = Static122.method531("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!n", name = "ib", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1368 = aClass73_1366;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "(I)V")
	public static void method1827() {
		aClass73_1366 = null;
		aClass73_1364 = null;
		aClass3_Sub1_Sub3_Sub3Array33 = null;
		aClass73_1362 = null;
		aClass73_1368 = null;
		aClass73_1365 = null;
		aClass73_1363 = null;
		aClass73_1367 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)Z")
	public static boolean method1828(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}
}
