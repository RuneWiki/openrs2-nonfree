import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!eia", name = "s", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!eia", name = "fb", descriptor = "[Lclient!tf;")
	public static Class17[] aClass17Array3;

	@OriginalMember(owner = "client!eia", name = "jb", descriptor = "I")
	public static int anInt2407;

	@OriginalMember(owner = "client!eia", name = "x", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_58 = new Class151(106, 4);

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Z)V")
	public static void method2300() {
		if (Static592.aClass281_8 == null) {
			return;
		}
		if (Static592.aClass281_8.anInt7338 == 1) {
			Static592.aClass281_8 = null;
			return;
		}
		if (Static592.aClass281_8.anInt7338 == 2) {
			Static464.method6460(2, Static340.aClass207_3, Static182.aString27);
			Static592.aClass281_8 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!eia", name = "i", descriptor = "(I)V")
	public static void method2305() {
		if (Static77.anInt1630 == -1) {
			return;
		}
		@Pc(11) int local11 = Static373.aClass161_1.method5903();
		@Pc(15) int local15 = Static373.aClass161_1.method5898();
		@Pc(20) Class4_Sub15 local20 = (Class4_Sub15) Static385.aClass163_35.method3639();
		if (local20 != null) {
			local11 = local20.method4789();
			local15 = local20.method4787();
		}
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		if (Static423.aBoolean517) {
			local32 = Static383.method8455();
			local34 = Static286.method4120();
		}
		Static653.method8705(local11, local34, local11 + local32, local32, local34 + Static357.anInt5421, local32, local15 + local34, local34, Static77.anInt1630, local32 + Static632.anInt9867, local15);
		if (Static277.aClass199_7 != null) {
			Static170.method2828(local11 + local32, local34 + local15);
		}
	}
}
