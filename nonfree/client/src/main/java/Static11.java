import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "Lclient!dk;")
	public static Class54 aClass54_3;

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_11 = new Class102(44, 3);

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
	public static int anInt160 = 0;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "[I")
	public static final int[] anIntArray13 = new int[25];

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	public static void method149() {
		Static21.method133(false);
		if (Static124.anInt1088 >= 0 && Static124.anInt1088 != 0) {
			Static424.method5112(Static124.anInt1088);
			Static124.anInt1088 = -1;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
	public static void method150() {
		if (Static142.anInt2523 == -1) {
			return;
		}
		@Pc(16) int local16 = Static376.aClass203_1.method4918();
		@Pc(20) int local20 = Static376.aClass203_1.method4925();
		@Pc(25) Class2_Sub14 local25 = (Class2_Sub14) Static57.aClass156_8.method3155();
		if (local25 != null) {
			local16 = local25.method5382();
			local20 = local25.method5383();
		}
		Static146.method2129(Static141.anInt2513, Static314.anInt5426, 0, local20, 0, 0, local16, 0, Static142.anInt2523);
		if (Static294.aClass16_5 != null) {
			Static21.method139(local20, local16);
		}
	}
}
