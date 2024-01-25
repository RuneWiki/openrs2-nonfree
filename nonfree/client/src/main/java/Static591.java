import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!ws", name = "H", descriptor = "Lclient!rf;")
	public static final Class288 aClass288_7 = new Class288();

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "(I)V")
	public static void method8353() {
		Static353.aClass78Array15 = null;
		Static32.aClass78_1 = null;
		Static454.aClass58_13 = null;
		Static410.aClass78Array17 = null;
		Static188.aClass78Array10 = null;
		Static163.aClass78Array9 = null;
		Static102.aClass78Array14 = null;
		Static45.aClass78Array4 = null;
		Static31.aClass78Array1 = null;
		Static299.aClass78_11 = null;
		Static272.aClass58_5 = null;
		Static565.aClass78Array19 = null;
		Static552.aClass58_14 = null;
		Static273.aClass78Array16 = null;
		Static32.aClass78Array3 = null;
		Static31.aClass78Array2 = null;
		client.lb = null;
		Static156.aClass78Array7 = null;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(FFBF)I")
	public static int method8354(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local26 > local12 && local26 > local35) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local12 < local35 && local35 > local26) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method8355(@OriginalArg(0) Class1_Sub4 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(37) int local37;
			for (@Pc(7) int local7 = 0; local7 < Static156.anIntArray148[local4]; local7++) {
				if (Static124.aClass1_Sub4ArrayArray4[local4][local7] == arg0) {
					Static597.method3725(Static124.aClass1_Sub4ArrayArray4[local4], local7 + 1, Static124.aClass1_Sub4ArrayArray4[local4], local7, Static156.anIntArray148[local4] - local7 - 1);
					local37 = Static156.anIntArray148[local4]--;
					return;
				}
			}
			for (@Pc(49) int local49 = 0; local49 < Static291.anIntArray291[local4]; local49++) {
				if (Static343.aClass1_Sub4ArrayArray3[local4][local49] == arg0) {
					Static597.method3725(Static343.aClass1_Sub4ArrayArray3[local4], local49 + 1, Static343.aClass1_Sub4ArrayArray3[local4], local49, Static291.anIntArray291[local4] - local49 - 1);
					local37 = Static291.anIntArray291[local4]--;
					return;
				}
			}
			for (@Pc(91) int local91 = 0; local91 < Static2.anIntArray3[local4]; local91++) {
				if (Static27.aClass1_Sub4ArrayArray1[local4][local91] == arg0) {
					Static597.method3725(Static27.aClass1_Sub4ArrayArray1[local4], local91 + 1, Static27.aClass1_Sub4ArrayArray1[local4], local91, Static2.anIntArray3[local4] - local91 - 1);
					local37 = Static2.anIntArray3[local4]--;
					return;
				}
			}
		}
	}
}
