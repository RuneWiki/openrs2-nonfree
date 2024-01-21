import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static11 {

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Lclient!qe;")
	public static Class3_Sub9_Sub4 aClass3_Sub9_Sub4_1;

	@OriginalMember(owner = "client!b", name = "s", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_4;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array3 = new Class73[500];

	@OriginalMember(owner = "client!b", name = "d", descriptor = "Lclient!sd;")
	public static Class73 aClass73_158 = null;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Lclient!sd;")
	private static Class73 aClass73_160 = Static122.method531("Members only world");

	@OriginalMember(owner = "client!b", name = "f", descriptor = "Lclient!sd;")
	public static Class73 aClass73_159 = aClass73_160;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Lclient!vd;")
	public static Class83 aClass83_3 = null;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "Lclient!sd;")
	public static Class73 aClass73_161 = Static122.method531("Clientscript error in: ");

	@OriginalMember(owner = "client!b", name = "p", descriptor = "Lclient!sd;")
	public static Class73 aClass73_162 = Static122.method531("Passwort: ");

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!vd;I)Z")
	public static boolean method184(@OriginalArg(0) Class83 arg0) {
		if (Static8.aBoolean16) {
			if (Static127.method484(arg0) != 0) {
				return false;
			}
			if (arg0.anInt3722 == 0) {
				return false;
			}
		}
		return arg0.aBoolean249;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method185() {
		Static97.anImage3 = null;
		Static5.aFont1 = null;
		Static140.aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
	public static void method188() {
		aClass73_161 = null;
		aClass83_3 = null;
		aClass73_162 = null;
		aClass73_160 = null;
		aClass73_159 = null;
		aClass73_158 = null;
		aClass3_Sub9_Sub4_1 = null;
		aClass73Array3 = null;
		aClass13_Sub1_4 = null;
	}
}
