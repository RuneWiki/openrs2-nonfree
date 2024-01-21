import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
	public static int anInt2080;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "Lclient!v;")
	private static Class76 aClass76_922 = Static134.method2017("purple:");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!v;")
	public static Class76 aClass76_916 = aClass76_922;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "Lclient!v;")
	private static Class76 aClass76_917 = Static134.method2017("cyan:");

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	public static int anInt2078 = 0;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!v;")
	private static Class76 aClass76_918 = Static134.method2017(" more options");

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "[Lclient!v;")
	public static Class76[] aClass76Array23 = new Class76[200];

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!v;")
	public static Class76 aClass76_919 = aClass76_918;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "Lclient!v;")
	public static Class76 aClass76_920 = aClass76_917;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!v;")
	public static Class76 aClass76_921 = aClass76_922;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_923 = aClass76_917;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!la;ILclient!la;)V")
	public static void method1456(@OriginalArg(0) Class17 arg0, @OriginalArg(2) Class17 arg1) {
		Static111.aClass17_34 = arg1;
		Static48.aClass17_18 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
	public static void method1458() {
		aClass76_919 = null;
		aClass76_916 = null;
		aClass76_920 = null;
		aClass76_917 = null;
		aClass76_921 = null;
		aClass76_922 = null;
		aClass76_918 = null;
		aClass76_923 = null;
		aClass76Array23 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I")
	public static int method1459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 2) {
			@Pc(22) int local22 = method1459(arg0 >> 1, arg1 * arg1);
			if ((arg0 & 0x1) != 0) {
				local22 *= arg1;
			}
			return local22;
		} else if (arg0 == 1) {
			return arg1;
		} else {
			return 1;
		}
	}
}
