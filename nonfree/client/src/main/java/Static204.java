import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static204 {

	@OriginalMember(owner = "client!hi", name = "T", descriptor = "I")
	public static int anInt4698;

	@OriginalMember(owner = "client!hi", name = "L", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_42 = new Class257(81, 4);

	@OriginalMember(owner = "client!hi", name = "Q", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_51 = new Class71(113, 3);

	@OriginalMember(owner = "client!hi", name = "R", descriptor = "Lclient!mo;")
	public static final Class211 aClass211_4 = new Class211();

	@OriginalMember(owner = "client!hi", name = "S", descriptor = "[I")
	public static final int[] anIntArray258 = new int[8];

	@OriginalMember(owner = "client!hi", name = "U", descriptor = "[Lclient!caa;")
	public static final Class48[] aClass48Array1 = new Class48[4];

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)V")
	public static void method3778() {
		Static527.aClass236_86.method6245();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BII)Z")
	public static boolean method3779(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static304.method4968(arg0, arg1) || Static108.method2411(arg1, arg0);
	}
}
