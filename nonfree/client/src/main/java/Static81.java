import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ds", name = "G", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!ds", name = "I", descriptor = "I")
	public static int anInt1126;

	@OriginalMember(owner = "client!ds", name = "L", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!ds", name = "F", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_54 = new Class67(32, 8);

	@OriginalMember(owner = "client!ds", name = "H", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_55 = new Class67(11, 7);

	@OriginalMember(owner = "client!ds", name = "J", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_21 = new Class242(31, -1);

	@OriginalMember(owner = "client!ds", name = "K", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_56 = new Class67(85, 3);

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZLclient!za;)V")
	public static void method991(@OriginalArg(1) Class117 arg0) {
		if (Static51.aBoolean102) {
			Static26.method381(arg0);
		} else {
			Static25.method360(arg0);
		}
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)[Lclient!nh;")
	public static Class170[] method992() {
		return new Class170[] { Static268.aClass170_5, Static85.aClass170_9, Static362.aClass170_7, Static374.aClass170_8, Static293.aClass170_6, Static82.aClass170_1 };
	}

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "(I)Ljava/lang/String;")
	public static String method993() {
		@Pc(7) String local7 = "www";
		if (Static254.aClass170_4 == Static85.aClass170_9) {
			local7 = "www-wtrc";
		} else if (Static254.aClass170_4 == Static362.aClass170_7) {
			local7 = "www-wtqa";
		} else if (Static374.aClass170_8 == Static254.aClass170_4) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static448.aString68 != null) {
			local28 = "/p=" + Static448.aString68;
		}
		return "http://" + local7 + "." + Static94.aClass148_3.aString42 + ".com/l=" + Static63.anInt981 + "/a=" + Static209.anInt3892 + local28 + "/";
	}
}
