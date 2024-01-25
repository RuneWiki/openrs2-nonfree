import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!fp", name = "u", descriptor = "Lclient!an;")
	public static final Class20 aClass20_7 = new Class20(10, 8);

	@OriginalMember(owner = "client!fp", name = "y", descriptor = "Z")
	public static boolean aBoolean329 = true;

	@OriginalMember(owner = "client!fp", name = "z", descriptor = "Z")
	public static boolean aBoolean330 = true;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)Z")
	public static boolean method3403(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static219.method4263(arg1, arg0) || Static30.method570(arg0, arg1);
	}

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "(B)I")
	public static int method3404() {
		@Pc(12) int local12 = Static531.aClass251_22.method6446();
		if (Static453.aClass251Array1.length - 1 > local12) {
			Static531.aClass251_22 = Static453.aClass251Array1[local12 + 1];
		}
		return 100;
	}
}
