import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_71 = new Class268(119, -1);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public static void method3666() {
		@Pc(9) int local9;
		if (Static337.aClass226Array3 != null) {
			for (local9 = 0; local9 < Static57.anInt1238; local9++) {
				Static337.aClass226Array3[local9] = null;
			}
			Static337.aClass226Array3 = null;
		}
		if (Static542.aClass226Array4 != null) {
			for (local9 = 0; local9 < Static496.anInt8600; local9++) {
				Static542.aClass226Array4[local9] = null;
			}
			Static542.aClass226Array4 = null;
		}
		if (Static65.aClass226Array1 != null) {
			for (local9 = 0; local9 < Static572.anInt9600; local9++) {
				Static65.aClass226Array1[local9] = null;
			}
			Static65.aClass226Array1 = null;
		}
		Static441.anInt7959 = -1;
		Static497.anInt8615 = -1;
		Static284.anIntArray483 = null;
		Static518.anIntArrayArrayArray19 = null;
		Static147.aClass226Array2 = null;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Z")
	public static boolean method3668(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static356.method5696(arg1, arg0)) {
			return Static217.method3687(arg0, arg1) | (arg0 & 0xB000) != 0 | Static385.method6197(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static596.method8369(arg1, arg0) | Static453.method6982(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(III)Z")
	public static boolean method3671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static395.method6364(arg0, arg1) | Static413.method6509(arg0, arg1) | Static495.method7405(arg0, arg1)) & Static161.method3024(arg1, arg0);
	}
}
