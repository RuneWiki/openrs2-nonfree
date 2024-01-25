import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
	public static int anInt1263 = 0;

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
	public static int anInt1275 = 104;

	@OriginalMember(owner = "client!bp", name = "z", descriptor = "[S")
	public static short[] aShortArray19 = new short[256];

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method1136() {
		@Pc(7) String local7 = "www";
		if (Static186.aClass123_6 == Static345.aClass123_12) {
			local7 = "www-wtrc";
		} else if (Static88.aClass123_2 == Static186.aClass123_6) {
			local7 = "www-wtqa";
		} else if (Static186.aClass123_6 == Static183.aClass123_5) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static166.aString38 != null) {
			local33 = "/p=" + Static166.aString38;
		}
		return "http://" + local7 + "." + Static38.aClass162_1.aString56 + ".com/l=" + Static286.anInt5468 + "/a=" + Static294.anInt5607 + local33 + "/";
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BII)Z")
	public static boolean method1138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static110.method2276(arg0, arg1) & Static204.method3803(arg1, arg0);
	}
}
