import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static206 {

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "I")
	public static int anInt3921;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "Lclient!br;")
	public static Class47 aClass47_4;

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[100];

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)I")
	public static int method3542(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BLclient!ika;)Ljava/lang/String;")
	public static String method3543(@OriginalArg(1) Class3_Sub2 arg0) {
		return Static10.method359(arg0);
	}
}
