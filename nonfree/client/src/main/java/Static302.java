import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
	public static int anInt5360;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "[I")
	public static int[] anIntArray470 = new int[50];

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	public static volatile int anInt5358 = -1;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "Lclient!qb;")
	public static Class142 aClass142_26 = new Class142(8);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZI)V")
	public static void method4562(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static270.anInt4897 != -1) {
				Static125.method2193(Static270.anInt4897);
			}
			for (@Pc(17) Class1_Sub25 local17 = (Class1_Sub25) aClass142_26.method3534(); local17 != null; local17 = (Class1_Sub25) aClass142_26.method3530()) {
				Static261.method4118(true, local17);
			}
			Static270.anInt4897 = -1;
			aClass142_26 = new Class142(8);
			Static178.method2965();
			Static270.anInt4897 = Static69.anInt4978;
			Static113.method2024(false);
			Static11.method155();
			Static244.method3822(Static270.anInt4897);
		}
		Static41.anInt850 = -1;
		Static268.method4202(Static133.anInt2677);
		Static90.aClass15_Sub5_Sub2_2 = new Class15_Sub5_Sub2();
		Static90.aClass15_Sub5_Sub2_2.anInt5557 = 3000;
		Static90.aClass15_Sub5_Sub2_2.anInt5559 = 3000;
		if (!Static156.aBoolean211 && Static118.anInt2486 == 0) {
			Static197.method3201(Static258.aClass121_114);
			Static65.method1215(10);
			return;
		}
		if (Static167.anInt3292 == 2) {
			Static94.anInt3434 = Static90.anInt1746 << 7;
			Static233.anInt4252 = Static307.anInt5433 << 7;
		} else {
			Static157.method1369();
		}
		if (Static156.aBoolean211) {
			Static243.method4742();
		}
		Static116.method2100();
		Static65.method1215(28);
	}
}
