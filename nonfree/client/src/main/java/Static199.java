import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
	public static int anInt4035;

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
	public static int anInt4037;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31 = null;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
	public static int anInt4036 = 0;

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "[B")
	public static final byte[] aByteArray59 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	public static void method3600() {
		Static226.aClass26_44.method333();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)V")
	public static void method3601(@OriginalArg(0) int arg0) {
		@Pc(8) Class11_Sub4_Sub12 local8 = Static35.method512(3, arg0);
		local8.method3864();
	}
}
