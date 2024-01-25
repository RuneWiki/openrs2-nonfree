import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static19 {

	@OriginalMember(owner = "client!am", name = "b", descriptor = "Z")
	public static final boolean aBoolean16 = false;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIII)V")
	public static void method261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static474.anInt8118 <= arg3 && Static576.anInt9425 >= arg2 && Static298.anInt5919 <= arg0 && Static596.anInt9703 >= arg4) {
			Static436.method6607(arg2, arg3, arg4, arg0, arg1);
		} else {
			Static499.method7251(arg4, arg2, arg0, arg1, arg3);
		}
	}
}
