import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Lclient!et;")
	public static Class66 aClass66_6;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "[I")
	public static int[] anIntArray303;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_53 = new Class215(16, 15);

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
	public static void method3623() {
		if (Static403.anInt6667 == 10 || Static403.anInt6667 == 28) {
			Static149.method2558(Static163.anInt3197 >> 10, Static145.anInt2906 >> 10, 5000);
		} else {
			@Pc(16) int local16 = Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray426[0] >> 3;
			@Pc(23) int local23 = Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray427[0] >> 3;
			if (local16 >= 0 && Static326.anInt5666 >> 3 > local16 && local23 >= 0 && local23 < Static283.anInt5187 >> 3) {
				Static149.method2558(local16, local23, 5000);
			} else {
				Static149.method2558(Static326.anInt5666 >> 4, Static283.anInt5187 >> 4, 0);
			}
		}
		Static235.method3519();
		Static12.method127();
		Static175.method2833();
		Static317.method4231();
	}
}
