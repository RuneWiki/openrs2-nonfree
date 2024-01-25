import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_89 = new Class15("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
	public static int anInt5038 = 0;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public static int anInt5041 = 0;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method4031() {
		@Pc(7) String local7 = "www";
		if (Static193.aClass178_9 == Static194.aClass178_19) {
			local7 = "www-wtrc";
		} else if (Static193.aClass178_9 == Static219.aClass178_13) {
			local7 = "www-wtqa";
		} else if (Static26.aClass178_6 == Static193.aClass178_9) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static7.aString2 != null) {
			local33 = "/p=" + Static7.aString2;
		}
		return "http://" + local7 + "." + Static231.aClass6_7.aString1 + ".com/l=" + Static429.anInt6999 + "/a=" + Static400.anInt6511 + local33 + "/";
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZILclient!fh;)Ljava/lang/String;")
	public static String method4032(@OriginalArg(2) Class4_Sub9 arg0) {
		try {
			@Pc(7) int local7 = arg0.method5033();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt6207 += Static439.aClass236_1.method5083(arg0.anInt6207, local7, arg0.aByteArray81, 0, local15);
			return Static383.method5080(local7, 0, local15);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}
}
