import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!rda", name = "n", descriptor = "Lclient!lf;")
	public static Class204 aClass204_6;

	@OriginalMember(owner = "client!rda", name = "t", descriptor = "I")
	public static int anInt7838;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIBI)V")
	public static void method6247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(12) int local12 = arg1 << 3;
		Static331.aFloat172 = local3;
		if (Static358.anInt9363 == 2) {
			Static175.anInt3256 = local3;
			Static76.anInt6369 = 0;
			Static428.anInt7673 = local12;
		}
		Static487.aFloat206 = local12;
		Static220.method4685();
		Static539.aBoolean676 = true;
	}
}
