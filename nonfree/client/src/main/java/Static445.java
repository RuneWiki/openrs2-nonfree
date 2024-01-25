import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
	public static int anInt7791 = 0;

	@OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
	public static int anInt7798 = 0;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method6905() {
		@Pc(7) String local7 = "www";
		if (Static392.aClass139_6 == Static190.aClass139_1) {
			local7 = "www-wtrc";
		} else if (Static190.aClass139_1 == Static347.aClass139_5) {
			local7 = "www-wtqa";
		} else if (Static291.aClass139_3 == Static190.aClass139_1) {
			local7 = "www-wtwip";
		}
		@Pc(34) String local34 = "";
		if (Static18.aString9 != null) {
			local34 = "/p=" + Static18.aString9;
		}
		return "http://" + local7 + "." + Static332.aClass250_4.aString182 + ".com/l=" + Static544.anInt7853 + "/a=" + Static27.anInt767 + local34 + "/";
	}
}
