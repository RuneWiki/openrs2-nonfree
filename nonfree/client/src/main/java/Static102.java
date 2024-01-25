import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static102 {

	@OriginalMember(owner = "client!es", name = "C", descriptor = "Lclient!kl;")
	public static final Class137 aClass137_5 = new Class137("LOCAL", 4);

	@OriginalMember(owner = "client!es", name = "D", descriptor = "I")
	public static int anInt2165 = -1;

	@OriginalMember(owner = "client!es", name = "F", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_25 = new Class179(30, 3);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(III)Z")
	public static boolean method1860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BF)F")
	public static float method1861(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}
}
