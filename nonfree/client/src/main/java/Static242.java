import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!il", name = "r", descriptor = "[Lclient!lv;")
	public static Class209[] aClass209Array1;

	@OriginalMember(owner = "client!il", name = "v", descriptor = "Lclient!ap;")
	public static final Class21 aClass21_1 = new Class21("RC", 1);

	@OriginalMember(owner = "client!il", name = "B", descriptor = "[I")
	public static final int[] anIntArray326 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZLclient!vg;)V")
	public static void method3988(@OriginalArg(1) Class11_Sub1_Sub1_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt3220 - Static325.anInt5888;
		@Pc(20) int local20 = arg0.anInt3209 * 512 + arg0.method2778() * 256;
		@Pc(31) int local31 = arg0.anInt3261 * 512 + arg0.method2778() * 256;
		arg0.anInt9925 += (local20 - arg0.anInt9925) / local9;
		arg0.anInt9929 += (local31 - arg0.anInt9929) / local9;
		arg0.anInt3295 = 0;
		if (arg0.anInt3289 == 0) {
			arg0.method2771(8192);
		}
		if (arg0.anInt3289 == 1) {
			arg0.method2771(12288);
		}
		if (arg0.anInt3289 == 2) {
			arg0.method2771(0);
		}
		if (arg0.anInt3289 == 3) {
			arg0.method2771(4096);
		}
	}
}
