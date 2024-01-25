import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static101 {

	@OriginalMember(owner = "client!dp", name = "K", descriptor = "Lclient!bi;")
	public static Class31 aClass31_23;

	@OriginalMember(owner = "client!dp", name = "N", descriptor = "I")
	public static int anInt2483;

	@OriginalMember(owner = "client!dp", name = "S", descriptor = "[I")
	public static int[] anIntArray236;

	@OriginalMember(owner = "client!dp", name = "H", descriptor = "Lclient!mga;")
	public static final Class223 aClass223_13 = new Class223(64);

	@OriginalMember(owner = "client!dp", name = "I", descriptor = "I")
	public static int anInt2479 = 0;

	@OriginalMember(owner = "client!dp", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIB)Z")
	public static boolean method2202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static354.method5231(arg1, arg0) | (arg0 & 0x70000) != 0 || Static442.method6257(arg1, arg0);
	}
}
