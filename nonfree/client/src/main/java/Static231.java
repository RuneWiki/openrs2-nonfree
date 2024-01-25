import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "[I")
	public static final int[] anIntArray214 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "[I")
	public static final int[] anIntArray215 = new int[2048];

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
	public static void method4178() {
		@Pc(5) int local5 = 0;
		if (Static230.aClass2_Sub54_15.aClass4_Sub28_1.method8732() == 1) {
			local5 = 55;
		}
		if (Static230.aClass2_Sub54_15.aClass4_Sub21_1.method6610() == 0) {
			local5 |= 0x40;
		}
		Static438.method7126(local5);
		Static251.aClass328_1.method8265(local5);
		Static372.aClass343_1.method8551(local5);
		Static522.aClass272_2.method7202(local5);
		Static391.aClass319_1.method8039(local5);
		Static619.method9238(local5);
		Static168.method3687(local5);
		Static445.method7195(local5);
		Static57.method1093(local5);
		Static150.method2593();
	}
}
