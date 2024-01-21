import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!i", name = "U", descriptor = "[I")
	public static int[] anIntArray178;

	@OriginalMember(owner = "client!i", name = "M", descriptor = "Lclient!fa;")
	public static Class23 aClass23_6 = null;

	@OriginalMember(owner = "client!i", name = "O", descriptor = "I")
	public static int anInt1626 = -1;

	@OriginalMember(owner = "client!i", name = "P", descriptor = "Lclient!cd;")
	public static Class10 aClass10_710 = Static51.method932("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!i", name = "S", descriptor = "[Lclient!fe;")
	public static Class26[] aClass26Array1 = new Class26[16];

	@OriginalMember(owner = "client!i", name = "X", descriptor = "Lclient!cd;")
	public static Class10 aClass10_711 = Static51.method932("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
	public static int anInt1630 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!fa;B)Lclient!fa;")
	public static Class23 method1155(@OriginalArg(0) Class23 arg0) {
		@Pc(16) int local16 = Static16.method269(Static126.method2068(arg0));
		if (local16 == 0) {
			return null;
		}
		for (@Pc(22) int local22 = 0; local22 < local16; local22++) {
			arg0 = Static102.method2541(arg0.anInt1045);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
	public static void method1158() {
		Static144.aClass72_24.method2261();
		Static64.aClass72_14.method2261();
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
	public static void method1159() {
		aClass10_711 = null;
		aClass23_6 = null;
		aClass10_710 = null;
		anIntArray178 = null;
		aClass26Array1 = null;
	}
}
