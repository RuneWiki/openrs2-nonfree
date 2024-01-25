import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!sfa", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[5];

	@OriginalMember(owner = "client!sfa", name = "i", descriptor = "(I)Ljava/lang/String;")
	public static String method8017() {
		@Pc(7) String local7 = "www";
		if (Static351.aClass59_12 == Static548.aClass59_10) {
			local7 = "www-wtrc";
		} else if (Static548.aClass59_10 == Static268.aClass59_7) {
			local7 = "www-wtqa";
		} else if (Static548.aClass59_10 == Static530.aClass59_8) {
			local7 = "www-wtwip";
		}
		@Pc(42) String local42 = "";
		if (Static130.aString30 != null) {
			local42 = "/p=" + Static130.aString30;
		}
		return "http://" + local7 + "." + Static161.aClass80_6.aString28 + ".com/l=" + Static26.anInt352 + "/a=" + Static449.anInt7513 + local42 + "/";
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(II)V")
	public static void method8018(@OriginalArg(0) int arg0) {
		Static70.anInt1087 = 3;
		Static417.anInt7161 = arg0;
		Static349.anInt5983 = 100;
		Static474.anInt8161 = -1;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III)Z")
	public static boolean method8019(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(29) boolean local29 = (arg0 & 0x37) == 0 ? Static190.method2832(-1, arg1, arg0) : Static47.method798(arg0, arg1);
		return local29 | (arg1 & 0x10000) != 0 | Static238.method3986(arg1, arg0);
	}
}
