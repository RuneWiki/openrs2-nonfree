import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "Lclient!hu;")
	public static Class21 aClass21_9;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "Lclient!oh;")
	public static Class237 aClass237_80;

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
	public static int anInt5942 = 100;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "Lclient!so;")
	public static final Class314 aClass314_10 = new Class314(1, 7);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method4861() {
		@Pc(7) String local7 = "www";
		if (Static277.aClass313_9 == Static190.aClass313_12) {
			local7 = "www-wtrc";
		} else if (Static141.aClass313_6 == Static277.aClass313_9) {
			local7 = "www-wtqa";
		} else if (Static78.aClass313_4 == Static277.aClass313_9) {
			local7 = "www-wtwip";
		}
		@Pc(34) String local34 = "";
		if (Static254.aString54 != null) {
			local34 = "/p=" + Static254.aString54;
		}
		return "http://" + local7 + "." + Static18.aClass217_1.aString71 + ".com/l=" + Static372.anInt7083 + "/a=" + Static60.anInt1930 + local34 + "/";
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([BIZ)I")
	public static int method4863(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static386.method6172(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([SI)[S")
	public static short[] method4864(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static649.method5533(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
