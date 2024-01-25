import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "Lclient!oe;")
	public static Class186 aClass186_44 = null;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method2513() {
		@Pc(7) String local7 = "www";
		if (Static449.aClass207_11 == Static162.aClass207_3) {
			local7 = "www-wtrc";
		} else if (Static312.aClass207_7 == Static449.aClass207_11) {
			local7 = "www-wtqa";
		} else if (Static449.aClass207_11 == Static388.aClass207_10) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static300.aString70 != null) {
			local28 = "/p=" + Static300.aString70;
		}
		return "http://" + local7 + "." + Static323.aClass44_4.aString10 + ".com/l=" + Static382.anInt6289 + "/a=" + Static441.anInt7213 + local28 + "/";
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2515(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub1_Sub12 local8 = Static449.method5975(arg1, 2);
		local8.method3043();
		local8.aString32 = arg0;
	}
}
