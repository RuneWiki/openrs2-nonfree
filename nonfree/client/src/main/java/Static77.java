import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static77 {

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
	public static int anInt1384;

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
	public static int anInt1385 = 0;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)Z")
	public static boolean method1220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static143.method5992(arg1, arg0) | (arg0 & 0x60000) != 0 || Static540.method7100(arg1, arg0) || Static198.method2498(arg1, arg0);
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)[Lclient!cq;")
	public static Class63[] method1221() {
		return new Class63[] { Static147.aClass63_14, Static265.aClass63_22, Static573.aClass63_43, Static577.aClass63_44, Static150.aClass63_15, Static489.aClass63_37, Static97.aClass63_9, Static252.aClass63_21, Static455.aClass63_35, Static334.aClass63_46, Static499.aClass63_39, Static274.aClass63_23, Static129.aClass63_10, Static251.aClass63_20 };
	}
}
