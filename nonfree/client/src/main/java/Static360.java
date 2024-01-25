import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "[Lclient!mv;")
	public static Class176_Sub1[] aClass176_Sub1Array2 = new Class176_Sub1[0];

	@OriginalMember(owner = "client!sd", name = "I", descriptor = "[I")
	public static final int[] anIntArray469 = new int[2048];

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "[I")
	public static final int[] anIntArray470 = new int[14];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BZ)V")
	public static void method4757(@OriginalArg(1) boolean arg0) {
		Static252.anInt4173 = 0;
		Static119.anInt5695 = 0;
		Static149.method2106();
		Static47.method618(arg0);
		Static298.method3886();
		@Pc(32) int local32;
		for (@Pc(26) int local26 = 0; local26 < Static252.anInt4173; local26++) {
			local32 = Static10.anIntArray6[local26];
			if (Static367.aClass8_Sub3_Sub1_Sub2Array1[local32].anInt7354 != Static265.anInt4371) {
				if (Static367.aClass8_Sub3_Sub1_Sub2Array1[local32].aClass78_1.method1552()) {
					Static277.method3671(Static367.aClass8_Sub3_Sub1_Sub2Array1[local32]);
				}
				Static367.aClass8_Sub3_Sub1_Sub2Array1[local32].method5907(null);
				Static367.aClass8_Sub3_Sub1_Sub2Array1[local32] = null;
			}
		}
		if (Static56.aClass4_Sub9_Sub2_1.anInt6207 != Static313.anInt5082) {
			throw new RuntimeException("gnp1 pos:" + Static56.aClass4_Sub9_Sub2_1.anInt6207 + " psize:" + Static313.anInt5082);
		}
		for (local32 = 0; local32 < Static148.anInt2692; local32++) {
			if (Static367.aClass8_Sub3_Sub1_Sub2Array1[Static106.anIntArray150[local32]] == null) {
				throw new RuntimeException("gnp2 pos:" + local32 + " size:" + Static148.anInt2692);
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
	public static void method4758() {
		Static284.method3714(false);
		if (Static129.anInt2329 >= 0 && Static129.anInt2329 != 0) {
			Static398.method4984(Static129.anInt2329);
			Static129.anInt2329 = -1;
		}
	}
}
