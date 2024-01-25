import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!eha", name = "W", descriptor = "I")
	public static int anInt2052;

	@OriginalMember(owner = "client!eha", name = "S", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_37 = new Class156(139, 3);

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "(B)V")
	public static void method1849() {
		Static352.aClass155_16 = null;
		Static319.anInt5446 = -1;
	}

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "(III)I")
	public static int method1850(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static671.method9115(4, arg1 + 91923, arg0 + 45365) + (Static671.method9115(2, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (Static671.method9115(1, arg1, arg0) + -128 >> 2) - 128;
		local44 = (int) ((double) local44 * 0.3D) + 35;
		if (local44 < 10) {
			local44 = 10;
		} else if (local44 > 60) {
			local44 = 60;
		}
		return local44;
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IZI)V")
	public static void method1852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static532.aClass290_5 == Static536.aClass290_6) {
			if (!Static467.method6578(0, arg1, arg0, 1, 1, 0, false, -2)) {
				Static467.method6578(0, arg1, arg0, 1, 1, 0, false, -3);
			}
		} else if (!Static467.method6578(0, arg1, arg0, 1, 1, 0, false, -3)) {
			Static467.method6578(0, arg1, arg0, 1, 1, 0, false, -2);
		}
	}
}
