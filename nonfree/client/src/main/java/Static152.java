import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!p", name = "zb", descriptor = "I")
	public static int anInt3504;

	@OriginalMember(owner = "client!p", name = "I", descriptor = "Lclient!qe;")
	public static Class78 aClass78_637 = Static199.method3560(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!p", name = "J", descriptor = "I")
	public static int anInt3472 = 0;

	@OriginalMember(owner = "client!p", name = "Db", descriptor = "Lclient!qe;")
	private static Class78 aClass78_641 = Static199.method3560("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!p", name = "K", descriptor = "Lclient!qe;")
	public static Class78 aClass78_638 = aClass78_641;

	@OriginalMember(owner = "client!p", name = "S", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!p", name = "cb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_639 = Static199.method3560("Lade Texturen )2 ");

	@OriginalMember(owner = "client!p", name = "Ub", descriptor = "I")
	public static int anInt3520 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)Lclient!qe;")
	public static Class78 method2725(@OriginalArg(1) int arg0) {
		@Pc(9) Class78 local9 = Static19.method268(arg0);
		for (@Pc(15) int local15 = local9.method3041() - 3; local15 > 0; local15 -= 3) {
			local9 = Static94.method1640(new Class78[] { local9.method3010(0, local15), Static198.aClass78_786, local9.method3052(local15) });
		}
		if (local9.method3041() > 9) {
			return Static94.method1640(new Class78[] { Static202.aClass78_805, local9.method3010(0, local9.method3041() - 8), Static43.aClass78_150, Static174.aClass78_699, local9, Static171.aClass78_687 });
		} else if (local9.method3041() > 6) {
			return Static94.method1640(new Class78[] { Static160.aClass78_655, local9.method3010(0, local9.method3041() - 4), Static89.aClass78_439, Static174.aClass78_699, local9, Static171.aClass78_687 });
		} else {
			return Static94.method1640(new Class78[] { Static92.aClass78_451, local9, Static173.aClass78_689 });
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!oe;)V")
	public static void method2733(@OriginalArg(1) Class72 arg0) {
		Static223.aClass72_282 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)I")
	public static int method2738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return (arg1 >> 1) + ((arg2 >> 2 << 10) + (arg0 >> 5 << 7));
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)I")
	public static int method2739(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
