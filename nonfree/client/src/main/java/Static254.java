import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
	public static int anInt4979;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
	public static int anInt4980;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "Lclient!km;")
	public static Class91 aClass91_181;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "Lclient!qc;")
	public static Class135 aClass135_33 = new Class135(64);

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
	public static int anInt4975 = 0;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "Lclient!fm;")
	public static Class49 aClass49_10 = new Class49(64);

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "[Lclient!sc;")
	public static Class14_Sub2_Sub2[] aClass14_Sub2_Sub2Array1 = new Class14_Sub2_Sub2[32768];

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
	public static int anInt4981 = -1;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZC)Z")
	public static boolean method3886(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZ)I")
	public static int method3887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class1_Sub33 local17 = (Class1_Sub33) Static160.aClass70_9.method2075((long) arg0);
		if (local17 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < local17.anIntArray507.length; local34++) {
				if (arg1 == local17.anIntArray505[local34]) {
					local32 += local17.anIntArray507[local34];
				}
			}
			return local32;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
	public static void method3888() {
		Static180.aClass135_17.method3320(5);
		Static108.aClass135_10.method3320(5);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3889(@OriginalArg(1) String arg0) {
		Static253.aString292 = arg0;
		if (Static253.aClass175_4.anApplet1 == null) {
			return;
		}
		try {
			@Pc(16) String local16 = Static253.aClass175_4.anApplet1.getParameter("cookieprefix");
			@Pc(21) String local21 = Static253.aClass175_4.anApplet1.getParameter("cookiehost");
			@Pc(36) String local36 = local16 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local36 = local36 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local36 = local36 + "; Expires=" + Static156.method1240(Static294.method4413() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static309.method3981(Static253.aClass175_4.anApplet1, "document.cookie=\"" + local36 + "\"");
		} catch (@Pc(86) Throwable local86) {
		}
	}
}
