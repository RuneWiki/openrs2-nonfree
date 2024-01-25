import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
	public static int anInt5129;

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "[[Lclient!caa;")
	public static Class12_Sub2[][] aClass12_Sub2ArrayArray2;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "Lclient!ps;")
	public static Class273 aClass273_7 = null;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BI)V")
	public static void method4442(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static313.anInt5212 = arg0;
		Static316.aClass12_Sub4Array1 = new Class12_Sub4[Static115.anIntArray171[Static313.anInt5212] + 1];
		Static211.anInt3063 = 0;
		Static424.anInt6908 = 0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)Z")
	public static boolean method4443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static157.method2132(arg1, arg0) & (Static503.method6531(arg0, arg1) | (arg1 & 0x2000) != 0 | Static416.method2252(arg1, arg0));
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!eda;Lclient!eda;ZIIZ)I")
	public static int method4444(@OriginalArg(1) Class86_Sub1 arg0, @OriginalArg(2) Class86_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(15) int local15 = Static473.method6135(arg5, arg0, arg1, arg3);
		if (local15 != 0) {
			return arg5 ? -local15 : local15;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(37) int local37 = Static473.method6135(arg2, arg0, arg1, arg4);
			return arg2 ? -local37 : local37;
		}
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(BI)I")
	public static int method4445(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
