import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static126 {

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!mc", name = "F", descriptor = "Lclient!oe;")
	public static Class72 aClass72_179;

	@OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
	public static int anInt2869;

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
	public static int anInt2866 = 0;

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "Lclient!qe;")
	public static Class78 aClass78_577 = Static199.method3560("Fps:");

	@OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
	public static int anInt2867 = 0;

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "[I")
	public static int[] anIntArray474 = new int[50];

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!mj;I)Lclient!qe;")
	public static Class78 method2302(@OriginalArg(0) Class64 arg0) {
		if (Static164.method2978(Static36.method473(arg0)) == 0) {
			return null;
		} else if (arg0.aClass78_590 == null || arg0.aClass78_590.method3018().method3041() == 0) {
			return Static57.aBoolean21 ? Static145.aClass78_616 : null;
		} else {
			return arg0.aClass78_590;
		}
	}
}
