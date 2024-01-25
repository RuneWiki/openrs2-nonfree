import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
	public static int anInt4820;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
	public static int anInt4822;

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "[B")
	public static final byte[] aByteArray69 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString284 = "Attack";

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)V")
	public static void method4357(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub9_Sub16 local8 = Static239.method4052(7, arg0);
		local8.method4138();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)Lclient!gf;")
	public static Class71 method4359(@OriginalArg(1) int arg0) {
		@Pc(10) Class71 local10 = (Class71) Static354.aClass66_109.method1939((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static318.aClass170_105.method4584(1, arg0);
		local10 = new Class71();
		if (local20 != null) {
			local10.method2035(new Class5_Sub1(local20), arg0);
		}
		Static354.aClass66_109.method1936((long) arg0, local10);
		return local10;
	}
}
