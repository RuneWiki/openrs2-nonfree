import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static110 {

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Lclient!fc;")
	public static Class71 aClass71_23;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
	public static int anInt2201;

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_54 = new Class41(66, 7);

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
	public static int anInt2197 = 0;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
	public static int anInt2200 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!fc;Lclient!fc;BLclient!kp;)V")
	public static void method2122(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(3) Interface6 arg2) {
		Static338.aClass71_81 = arg0;
		Static252.anInterface6_1 = arg2;
		Static217.aClass71_52 = arg1;
		if (Static217.aClass71_52 != null) {
			Static371.anInt6500 = Static217.aClass71_52.method1580(1);
		}
		if (Static338.aClass71_81 != null) {
			Static155.anInt2781 = Static338.aClass71_81.method1580(1);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)I")
	public static int method2123(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
