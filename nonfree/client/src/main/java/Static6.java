import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!kc;")
	public static Class130 aClass130_1;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
	public static int anInt74;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
	public static int anInt85;

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
	public static int anInt93;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
	public static int anInt90 = 0;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
	public static int anInt91 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZIIIIIIIII)V")
	public static void method59(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) Class1_Sub14 local7 = null;
		for (@Pc(12) Class1_Sub14 local12 = (Class1_Sub14) Static271.aClass17_53.method202(); local12 != null; local12 = (Class1_Sub14) Static271.aClass17_53.method207()) {
			if (local12.anInt1833 == arg1 && local12.anInt1831 == arg5 && arg3 == local12.anInt1823 && local12.anInt1826 == arg6) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub14();
			local7.anInt1833 = arg1;
			local7.anInt1831 = arg5;
			local7.anInt1826 = arg6;
			local7.anInt1823 = arg3;
			Static161.method2395(local7);
			Static271.aClass17_53.method199(local7);
		}
		local7.anInt1834 = arg2;
		local7.anInt1835 = arg4;
		local7.anInt1829 = -1;
		local7.anInt1832 = 0;
		local7.anInt1825 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method60(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static345.method4878(arg6)) {
			if (Static286.aClass117ArrayArray2[arg6] == null) {
				Static200.method2861(arg7, arg5, -1, arg2, arg0, arg4, arg1, Static137.aClass117ArrayArray1[arg6], arg3);
			} else {
				Static200.method2861(arg7, arg5, -1, arg2, arg0, arg4, arg1, Static286.aClass117ArrayArray2[arg6], arg3);
			}
		} else if (arg7 == -1) {
			for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
				Static96.aBooleanArray9[local17] = true;
			}
		} else {
			Static96.aBooleanArray9[arg7] = true;
		}
	}
}
