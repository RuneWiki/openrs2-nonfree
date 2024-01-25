import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString33;

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "Lclient!ks;")
	public static final Class141 aClass141_5 = new Class141();

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
	public static int anInt4143 = -1;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
	public static void method3481(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static450.aString71 = arg0;
		Static338.aString57 = arg1;
		if (Static164.anInt3043 != 3 && (Static450.aString71.equals("") || Static338.aString57.equals(""))) {
			Static172.method2765(3);
			return;
		}
		Static418.aBoolean473 = false;
		if (Static164.anInt3043 != 1) {
			Static371.anInt7102 = 0;
			Static141.anInt2741 = -1;
		}
		Static172.method2765(-3);
		Static90.anInt1905 = 1;
		Static198.anInt3589 = 0;
		Static237.anInt5950 = 0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method3483() {
		@Pc(5) String local5 = "www";
		if (Static35.aClass137_11 == Static64.aClass137_3) {
			local5 = "www-wtrc";
		} else if (Static176.aClass137_8 == Static35.aClass137_11) {
			local5 = "www-wtqa";
		} else if (Static312.aClass137_9 == Static35.aClass137_11) {
			local5 = "www-wtwip";
		}
		@Pc(29) String local29 = "";
		if (Static164.aString23 != null) {
			local29 = "/p=" + Static164.aString23;
		}
		return "http://" + local5 + "." + Static337.aClass61_5.aString16 + ".com/l=" + Static341.anInt5770 + "/a=" + Static209.anInt3932 + local29 + "/";
	}
}
