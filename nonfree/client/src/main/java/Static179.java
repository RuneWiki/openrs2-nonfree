import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "Lclient!tf;")
	public static Class240 aClass240_9 = null;

	@OriginalMember(owner = "client!iw", name = "l", descriptor = "I")
	public static int anInt3678 = 0;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method3296() {
		@Pc(12) String local12 = "www";
		if (Static432.aClass219_6 == Static42.aClass219_1) {
			local12 = "www-wtrc";
		} else if (Static463.aClass219_7 == Static42.aClass219_1) {
			local12 = "www-wtqa";
		} else if (Static357.aClass219_5 == Static42.aClass219_1) {
			local12 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static230.aString35 != null) {
			local33 = "/p=" + Static230.aString35;
		}
		return "http://" + local12 + "." + Static332.aClass235_6.aString57 + ".com/l=" + Static168.anInt3290 + "/a=" + Static399.anInt7070 + local33 + "/";
	}
}
