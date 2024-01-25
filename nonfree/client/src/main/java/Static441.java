import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static441 {

	@OriginalMember(owner = "client!vm", name = "V", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_226 = new Class214(60, -2);

	@OriginalMember(owner = "client!vm", name = "qb", descriptor = "[F")
	public static final float[] aFloatArray43 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!vm", name = "tb", descriptor = "I")
	public static int anInt7552 = -1;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	public static void method6048() {
		if (Static178.aClass55_2 != null) {
			Static178.aClass55_2.method5678();
		}
		if (Static1.aClass55_1 != null) {
			Static1.aClass55_1.method5678();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!tf;B)I")
	public static int method6052(@OriginalArg(0) int arg0, @OriginalArg(1) Class240 arg1) {
		if (!Static50.method1146(arg1).method5904(arg0) && arg1.anObjectArray31 == null) {
			return -1;
		} else if (arg1.anIntArray548 == null || arg0 >= arg1.anIntArray548.length) {
			return -1;
		} else {
			return arg1.anIntArray548[arg0];
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
	public static void method6053() {
		if (Static227.anInt4510 == 1 || Static227.anInt4510 == 3 || Static227.anInt4510 != Static33.anInt549 && (Static227.anInt4510 == 0 || Static33.anInt549 == 0)) {
			Static77.anInt1870 = 0;
			Static328.anInt5871 = 0;
			Static80.aClass96_8.method2799();
		}
		Static33.anInt549 = Static227.anInt4510;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!db;Lclient!ci;Lclient!ci;Lclient!ci;)Z")
	public static boolean method6055(@OriginalArg(1) Class4_Sub7_Sub2 arg0, @OriginalArg(2) Class38 arg1, @OriginalArg(3) Class38 arg2, @OriginalArg(4) Class38 arg3) {
		Static196.aClass4_Sub7_Sub2_6 = arg0;
		Static89.aClass38_19 = arg1;
		Static459.aClass38_90 = arg2;
		Static58.aClass38_13 = arg3;
		return true;
	}
}
