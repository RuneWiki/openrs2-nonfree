import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static74 {

	@OriginalMember(owner = "client!eb", name = "tb", descriptor = "I")
	public static int anInt3404;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "J")
	public static long aLong117 = -1L;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "Lclient!ro;")
	public static Class181 aClass181_3 = new Class181();

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString131 = "Allocated memory";

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "(II)I")
	public static int method3131(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static160.method3021(arg0);
	}

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "(I)V")
	public static void method3136() {
		Static310.aClass140_157.method3819();
	}
}
