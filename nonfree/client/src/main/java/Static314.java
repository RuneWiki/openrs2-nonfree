import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Lclient!pt;")
	public static Class267 aClass267_2;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!wr;")
	public static final Class380 aClass380_23 = new Class380(512);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method5260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg1 < 512 || arg4 < 512 || Static306.anInt6176 * 512 - 1024 < arg1 || Static108.anInt2930 * 512 - 1024 < arg4) {
			Static456.anIntArray426[0] = Static456.anIntArray426[1] = -1;
			return;
		}
		@Pc(57) int local57 = Static150.method2982(arg5, arg4, arg1) - arg6;
		if (Static238.aBoolean425) {
			Static252.method4480(true);
		} else {
			Static469.aClass115_8.method6296(arg3, 0, 0);
			Static467.aClass5_13.method6122(Static469.aClass115_8);
		}
		if (Static423.aBoolean622) {
			Static467.aClass5_13.HA(arg1, local57, arg4, Static32.anInt849, Static456.anIntArray426);
		} else {
			Static467.aClass5_13.da(arg1, local57, arg4, Static456.anIntArray426);
		}
		if (Static238.aBoolean425) {
			Static375.method5974();
		} else {
			Static469.aClass115_8.method6296(-arg3, 0, 0);
			Static467.aClass5_13.method6122(Static469.aClass115_8);
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(B)Z")
	public static boolean method5261() {
		return Static453.anInt8163 != 0;
	}
}
