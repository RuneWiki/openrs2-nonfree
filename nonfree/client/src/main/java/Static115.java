import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static115 {

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "Lclient!ae;")
	public static Class8 aClass8_31;

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
	public static int anInt2065;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "[I")
	public static int[] anIntArray123;

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "[I")
	public static int[] anIntArray125;

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
	public static int anInt2066 = 0;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "[I")
	public static final int[] anIntArray124 = new int[1000];

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)Z")
	public static boolean method1817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static210.method3100(arg0, arg1) || Static233.method3521(arg0, arg1);
	}
}
