import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!si", name = "t", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray9;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "[I")
	public static final int[] anIntArray200 = new int[14];

	@OriginalMember(owner = "client!si", name = "s", descriptor = "[I")
	public static final int[] anIntArray201 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!si", name = "u", descriptor = "[I")
	public static int[] anIntArray202 = new int[1];

	@OriginalMember(owner = "client!si", name = "v", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_36 = new Class186(4, 0);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V")
	public static void method2399(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static85.anInt2201 != -1) {
				Static257.method7981(Static85.anInt2201);
			}
			for (@Pc(23) Class1_Sub5 local23 = (Class1_Sub5) Static484.aClass174_32.method4421(); local23 != null; local23 = (Class1_Sub5) Static484.aClass174_32.method4429()) {
				if (!local23.method7979()) {
					local23 = (Class1_Sub5) Static484.aClass174_32.method4421();
					if (local23 == null) {
						break;
					}
				}
				Static82.method2049(false, local23, true);
			}
			Static85.anInt2201 = -1;
			Static484.aClass174_32 = new Class174(8);
			Static366.method6077();
			Static85.anInt2201 = Static90.anInt2328;
			Static204.method3768(false);
			Static278.method4744();
			Static387.method5827(Static85.anInt2201);
		}
		Static152.aBoolean209 = true;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
	public static void method2400() {
		for (@Pc(1) int local1 = 0; local1 < 5; local1++) {
			Static385.aBooleanArray27[local1] = false;
		}
		Static464.anInt8003 = 5;
		Static492.anInt8389 = Static416.anInt7252;
		Static341.anInt6385 = -1;
		Static97.anInt6559 = 0;
		Static494.anInt8411 = Static308.anInt5918;
		Static547.anInt9478 = -1;
		Static224.anInt4517 = Static520.anInt8842;
		Static457.anInt7744 = Static347.anInt6404;
		Static211.anInt4381 = Static339.anInt6337;
		Static203.anInt4295 = Static411.anInt7178;
		Static501.anInt8508 = 0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public static void method2402(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static309.anInt5935 = arg0;
		Static202.aClass2_Sub3Array3 = new Class2_Sub3[Static144.anIntArray263[Static309.anInt5935] + 1];
		Static476.anInt7308 = 0;
		Static275.anInt5397 = 0;
	}
}
