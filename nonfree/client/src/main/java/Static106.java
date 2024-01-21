import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static106 {

	@OriginalMember(owner = "client!na", name = "i", descriptor = "I")
	public static int anInt4184;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "Lclient!c;")
	public static Class10 aClass10_145;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "J")
	public static long aLong242;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "I")
	public static int anInt4180 = -2;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public static int anInt4182 = 0;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1266 = Static38.method685("Loading interfaces )2 ");

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1265 = aClass6_1266;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lclient!ai;")
	public static Class6 method2806(@OriginalArg(1) int arg0) {
		return Static135.method2098(false, arg0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method2807() {
		aClass6_1266 = null;
		aClass10_145 = null;
		aClass6_1265 = null;
	}
}
