import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
	public static int anInt2852;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_12 = new Class38(8);

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "[I")
	public static final int[] anIntArray298 = new int[32];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!za;I)V")
	public static void method2104(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2) {
		Static134.aClass108ArrayArray1 = new Class108[arg0][arg2];
		Static194.aClass106_7 = arg1;
		if (Static258.anIntArray474 != null) {
			Static424.aClass86_4 = Static186.method3804(Static258.anIntArray474[1], Static258.anIntArray474[0], Static258.anIntArray474[4], Static258.anIntArray474[2], Static258.anIntArray474[3], Static258.anIntArray474[5]);
		}
		Static201.aClass108_2 = new Class108();
		Static391.method5431();
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method2105() {
		try {
			if (Static133.anInt2954 == 1) {
				@Pc(10) int local10 = Static26.aClass1_Sub19_Sub3_1.method5317();
				if (local10 > 0 && Static26.aClass1_Sub19_Sub3_1.method5328()) {
					local10 -= Static385.anInt7047;
					if (local10 < 0) {
						local10 = 0;
					}
					Static26.aClass1_Sub19_Sub3_1.method5304(local10);
					return;
				}
				Static26.aClass1_Sub19_Sub3_1.method5294();
				Static26.aClass1_Sub19_Sub3_1.method5302();
				if (Static225.aClass211_57 == null) {
					Static133.anInt2954 = 0;
				} else {
					Static133.anInt2954 = 2;
				}
				Static24.aClass1_Sub18_1 = null;
				Static142.aClass259_1 = null;
			}
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			Static26.aClass1_Sub19_Sub3_1.method5294();
			Static24.aClass1_Sub18_1 = null;
			Static142.aClass259_1 = null;
			Static133.anInt2954 = 0;
			Static225.aClass211_57 = null;
		}
	}
}
