import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
	public static int anInt5345;

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_104 = new Class225(100, 6);

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "Lclient!lba;")
	public static final Class218 aClass218_24 = new Class218(512);

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
	public static int anInt5346 = 0;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII)V")
	public static void method4786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static682.anInt11017 == arg1 && Static642.anInt9853 == arg2 && Static470.anInt7566 == arg0) {
			return;
		}
		Static415.aBoolean615 = true;
		Static642.anInt9853 = arg2;
		Static470.anInt7566 = arg0;
		Static682.anInt11017 = arg1;
		@Pc(48) double local48 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(58) double local58 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(61) double local61 = Math.cos(local58);
		@Pc(64) double local64 = Math.sin(local58);
		@Pc(67) double local67 = Math.cos(local48);
		@Pc(70) double local70 = Math.sin(local48);
		Static495.aDouble42 = local61;
		Static305.aDouble14 = local67;
		Static399.aDouble34 = local64;
		Static205.aDouble19 = local64 * local70;
		Static433.aDouble59 = 0.0D;
		Static68.aDouble8 = -local61 * local70;
		Static360.aDouble33 = -local64 * local67;
		Static337.aDouble30 = local61 * local67;
		Static181.aDouble17 = local70;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Z")
	public static boolean method4787() {
		return Static357.anInt5722 >= 1;
	}
}
