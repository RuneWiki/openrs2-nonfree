import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static178 {

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "D")
	public static double aDouble94;

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "[I")
	public static int[] anIntArray305;

	@OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
	public static int anInt3620;

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1750 = Static193.method3027("Attack");

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1749 = aClass70_1750;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)Lclient!oc;")
	public static Class70 method2792(@OriginalArg(1) int arg0) {
		return Static207.method3296(new Class70[] { Static107.method2404(arg0 >> 24 & 0xFF), Static47.aClass70_478, Static107.method2404(arg0 >> 16 & 0xFF), Static47.aClass70_478, Static107.method2404(arg0 >> 8 & 0xFF), Static47.aClass70_478, Static107.method2404(arg0 & 0xFF) });
	}
}
