import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "J")
	public static long aLong357;

	@OriginalMember(owner = "client!sba", name = "i", descriptor = "F")
	public static float aFloat208;

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
	public static int anInt8020 = 0;

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "Lclient!br;")
	public static final Class37 aClass37_6 = new Class37("", 11);

	@OriginalMember(owner = "client!sba", name = "l", descriptor = "I")
	public static int anInt8025 = 0;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method6674(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static246.aClass114_10.aBoolean212) {
			Static137.aClass174_1 = new Class174();
			Static137.aClass174_1.aString46 = arg0;
			Static137.aClass174_1.anInt4666 = arg1;
			if (Static253.aClass218_6 != Static122.aClass218_4) {
				Static137.aClass174_1.anInt4662 = Static137.aClass174_1.anInt4666 + 50000;
				Static137.aClass174_1.anInt4668 = Static137.aClass174_1.anInt4666 + 40000;
			}
			if (Static161.aClass208_Sub1Array1.length > arg1 && Static161.aClass208_Sub1Array1[arg1] != null) {
				Static526.anInt8706 = Static161.aClass208_Sub1Array1[arg1].anInt5554;
			}
			return true;
		}
		@Pc(53) String local53 = "";
		if (Static122.aClass218_4 != Static253.aClass218_6) {
			local53 = ":" + (arg1 + 7000);
		}
		@Pc(68) String local68 = "";
		if (Static74.aString17 != null) {
			local68 = "/p=" + Static74.aString17;
		}
		@Pc(116) String local116 = "http://" + arg0 + local53 + "/l=" + Static562.anInt9127 + "/a=" + Static208.anInt8805 + local68 + "/j" + (Static253.aBoolean365 ? "1" : "0") + ",o" + (Static527.aBoolean640 ? "1" : "0") + ",a2";
		try {
			Static550.aClient1.getAppletContext().showDocument(new URL(local116), "_self");
			return true;
		} catch (@Pc(126) Exception local126) {
			return false;
		}
	}
}
