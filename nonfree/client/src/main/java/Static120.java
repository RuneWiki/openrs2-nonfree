import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
	public static int anInt2562;

	@OriginalMember(owner = "client!mg", name = "B", descriptor = "Lclient!wa;")
	public static Class23 aClass23_46;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_930 = Static161.method2452("The server is being updated)3");

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "Lclient!qb;")
	public static final Class84 aClass84_16 = new Class84(50);

	@OriginalMember(owner = "client!mg", name = "F", descriptor = "Lclient!dc;")
	public static Class20 aClass20_931 = aClass20_930;

	@OriginalMember(owner = "client!mg", name = "H", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_932 = Static161.method2452("<col=00ffff>");

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!dc;B)Lclient!dc;")
	public static Class20 method1907(@OriginalArg(0) Class20 arg0) {
		@Pc(7) Class5_Sub21 local7 = Static22.method2108(arg0);
		return local7 == null ? Static61.aClass20_463 : local7.aClass20_953;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)Lclient!pd;")
	public static Class5_Sub2_Sub16 method1908(@OriginalArg(0) int arg0) {
		@Pc(15) Class5_Sub2_Sub16 local15 = (Class5_Sub2_Sub16) Static127.aClass8_27.method227((long) arg0);
		if (local15 != null) {
			return local15;
		}
		local15 = Static129.method2011(arg0, Static141.aClass23_53, Static84.aClass23_34);
		if (local15 != null) {
			Static127.aClass8_27.method232((long) arg0, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IB)I")
	public static int method1909(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
