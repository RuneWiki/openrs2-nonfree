import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "Lclient!rea;")
	public static Class299 aClass299_2;

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "Lclient!kr;")
	public static Class204 aClass204_1;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Lclient!qk;")
	public static final Class290 aClass290_1 = new Class290();

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "[I")
	public static final int[] anIntArray137 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
	public static int anInt1828 = 16777215;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)V")
	public static void method1557() {
		@Pc(9) int[] local9 = new int[Static470.aClass250_1.anInt6847];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < Static470.aClass250_1.anInt6847; local21++) {
			@Pc(28) Class327 local28 = Static470.aClass250_1.method5960(local21);
			if (local28.anInt8729 >= 0 || local28.anInt8701 >= 0) {
				local9[local19++] = local21;
			}
		}
		Static260.anIntArray297 = new int[local19];
		for (@Pc(59) int local59 = 0; local59 < local19; local59++) {
			Static260.anIntArray297[local59] = local9[local59];
		}
	}
}
