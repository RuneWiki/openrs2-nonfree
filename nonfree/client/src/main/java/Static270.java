import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
	public static void method4441() {
		Static424.aClass69_43.method1904();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)V")
	public static void method4442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1011) {
			Static156.method2739(Static277.aClass312_3, arg0, arg2);
		} else if (arg1 == 1012) {
			Static156.method2739(Static419.aClass312_10, arg0, arg2);
		} else if (arg1 == 1006) {
			Static156.method2739(Static455.aClass312_12, arg0, arg2);
		} else if (arg1 == 1010) {
			Static156.method2739(Static390.aClass312_5, arg0, arg2);
		} else if (arg1 == 1004) {
			Static156.method2739(Static45.aClass312_2, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILclient!ria;)Ljava/lang/String;")
	public static String method4444(@OriginalArg(1) Class303 arg0) {
		if (Static79.method1734(arg0).method2650() == 0) {
			return null;
		} else if (arg0.aString77 == null || arg0.aString77.trim().length() == 0) {
			return Static179.aBoolean273 ? "Hidden-use" : null;
		} else {
			return arg0.aString77;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I")
	public static int method4445(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (local19 * arg0 >> 12) + 40960;
		return local27 * local13 >> 12;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!cs;ILclient!up;Lclient!cv;ILclient!ha;IIZ)V")
	public static void method4446(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2, @OriginalArg(3) Class63 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class13 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(16) int local16 = arg1 - arg4 / 2 - 5;
		@Pc(20) int local20 = arg6 + 2;
		if (arg2.anInt9809 != 0) {
			arg5.method8164(arg2.anInt9809, arg7 * arg3.method1824() + arg6 + 1 - local20, local16, arg4 + 10, local20);
		}
		if (arg2.anInt9814 != 0) {
			arg5.method8155(arg6 + arg7 * arg3.method1824() + 1 - local20, arg4 - -10, local16, local20, arg2.anInt9814);
		}
		@Pc(76) int local76 = arg2.anInt9822;
		if (arg0.aBoolean182 && arg2.anInt9820 != -1) {
			local76 = arg2.anInt9820;
		}
		for (@Pc(89) int local89 = 0; local89 < arg7; local89++) {
			@Pc(94) String local94 = Static53.aStringArray3[local89];
			if (arg7 - 1 > local89) {
				local94 = local94.substring(0, local94.length() - 4);
			}
			arg3.method1825(arg5, local94, arg1, arg6, local76);
			arg6 += arg3.method1824();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)I")
	public static int method4447(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
