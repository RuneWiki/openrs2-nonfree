import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!at", name = "K", descriptor = "Lclient!ap;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!at", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString3 = null;

	@OriginalMember(owner = "client!at", name = "I", descriptor = "I")
	public static int anInt449 = 0;

	@OriginalMember(owner = "client!at", name = "M", descriptor = "[Lclient!fh;")
	public static final Class5_Sub15[] aClass5_Sub15Array1 = new Class5_Sub15[2048];

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILclient!tt;BI[BZII)Lclient!f;")
	public static Class31_Sub1_Sub1 method353(@OriginalArg(1) Class200_Sub2 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) int arg3) {
		if (arg0.aBoolean429 || Static147.method2135(arg3) && Static147.method2135(arg1)) {
			return new Class31_Sub1_Sub1(arg0, 3553, 6406, arg3, arg1, false, arg2, 6406);
		} else if (arg0.aBoolean432) {
			return new Class31_Sub1_Sub1(arg0, 34037, 6406, arg3, arg1, false, arg2, 6406);
		} else {
			return new Class31_Sub1_Sub1(arg0, 6406, arg3, arg1, Static331.method4084(arg3), Static331.method4084(arg1), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method354() {
		@Pc(7) String local7 = "www";
		if (Static350.aClass170_10 == Static381.aClass170_7) {
			local7 = "www-wtrc";
		} else if (Static350.aClass170_10 == Static23.aClass170_1) {
			local7 = "www-wtqa";
		} else if (Static350.aClass170_10 == Static163.aClass170_6) {
			local7 = "www-wtwip";
		}
		@Pc(35) String local35 = "";
		if (Static452.aString74 != null) {
			local35 = "/p=" + Static452.aString74;
		}
		return "http://" + local7 + "." + Static217.aClass197_2.aString57 + ".com/l=" + Static38.anInt4834 + "/a=" + Static250.anInt4070 + local35 + "/";
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method357(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}
}
