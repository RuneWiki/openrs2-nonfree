import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!od", name = "z", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_105 = new Class200(111, 10);

	@OriginalMember(owner = "client!od", name = "F", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_106 = new Class200(94, 8);

	@OriginalMember(owner = "client!od", name = "H", descriptor = "I")
	public static int anInt7316 = 16777215;

	@OriginalMember(owner = "client!od", name = "I", descriptor = "I")
	public static int anInt7317 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([BIZFFILclient!qi;FIFIFI)V")
	public static void method6366(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(6) Class234 arg4, @OriginalArg(7) float arg5, @OriginalArg(9) float arg6, @OriginalArg(11) float arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static565.method5464(arg0, arg6, arg1, arg4, local3, arg2, arg3, arg5, arg7);
			arg1 += 16384;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!la;)I")
	public static int method6368(@OriginalArg(1) Class196 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5111(Static75.anInt1784)) {
			local5++;
		}
		if (arg0.method5111(Static626.anInt10074)) {
			local5++;
		}
		if (arg0.method5111(Static470.anInt8243)) {
			local5++;
		}
		if (arg0.method5111(Static417.anInt7578)) {
			local5++;
		}
		if (arg0.method5111(Static445.anInt7955)) {
			local5++;
		}
		if (arg0.method5111(Static613.anInt9932)) {
			local5++;
		}
		if (arg0.method5111(Static202.anInt3188)) {
			local5++;
		}
		if (arg0.method5111(Static509.anInt8813)) {
			local5++;
		}
		if (arg0.method5111(Static643.anInt10223)) {
			local5++;
		}
		if (arg0.method5111(Static596.anInt9746)) {
			local5++;
		}
		if (arg0.method5111(Static103.anInt2270)) {
			local5++;
		}
		if (arg0.method5111(Static379.anInt7091)) {
			local5++;
		}
		if (arg0.method5111(Static635.anInt10140)) {
			local5++;
		}
		if (arg0.method5111(Static609.anInt9881)) {
			local5++;
		}
		if (arg0.method5111(Static252.anInt4623)) {
			local5++;
		}
		if (arg0.method5111(Static166.anInt3242)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(III)Z")
	public static boolean method6369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
