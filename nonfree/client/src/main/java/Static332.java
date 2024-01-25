import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "Lclient!tq;")
	public static Class239 aClass239_11;

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
	public static int anInt5636 = 0;

	@OriginalMember(owner = "client!qp", name = "A", descriptor = "Lclient!tq;")
	public static Class239 aClass239_12 = null;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V")
	public static void method4751() {
		if (Static397.anInt6568 < 0) {
			return;
		}
		@Pc(12) long local12 = Static154.method2527();
		Static397.anInt6568 = (int) ((long) Static397.anInt6568 + Static350.aLong173 - local12);
		if (Static397.anInt6568 <= 0) {
			Static397.anInt6568 = -1;
			Static42.aFloat30 = Static11.aClass125_1.aFloat53;
			Static195.aFloat64 = Static11.aClass125_1.aFloat52;
			Static49.aFloat31 = Static11.aClass125_1.aFloat57;
			Static304.aFloat88 = Static11.aClass125_1.aFloat55;
			Static424.anInt179 = Static11.aClass125_1.anInt3077;
			Static118.anInt2067 = Static11.aClass125_1.anInt3079;
			Static298.anInt4945 = Static11.aClass125_1.anInt3070;
			Static307.aFloat45 = Static11.aClass125_1.aFloat54;
			Static151.aFloat49 = Static11.aClass125_1.aFloat56;
			Static435.aClass133_4 = Static11.aClass125_1.aClass133_2;
		} else {
			@Pc(66) int local66 = (Static397.anInt6568 << 8) / Static225.anInt3838;
			@Pc(71) int local71 = 255 - local66;
			@Pc(76) float local76 = (float) local66 / 255.0F;
			@Pc(81) float local81 = 1.0F - local76;
			Static424.anInt179 = ((Static11.aClass125_1.anInt3077 & 0xFF00) * local71 + (Static224.anInt3821 & 0xFF00) * local66 & 0xFF0000) + (local66 * (Static224.anInt3821 & 0xFF00FF) + ((Static11.aClass125_1.anInt3077 & 0xFF00FF) * local71) & 0xFF00FF00) >>> 8;
			Static195.aFloat64 = local81 * (Static11.aClass125_1.aFloat52 - Static411.aFloat103) + Static411.aFloat103;
			Static304.aFloat88 = Static204.aFloat90 + (Static11.aClass125_1.aFloat55 - Static204.aFloat90) * local81;
			Static298.anInt4945 = Static186.anInt3250 * local66 + Static11.aClass125_1.anInt3070 * local71 >> 8;
			Static307.aFloat45 = Static272.aFloat84 + (Static11.aClass125_1.aFloat54 - Static272.aFloat84) * local81;
			Static151.aFloat49 = Static104.aFloat42 + local81 * (Static11.aClass125_1.aFloat56 - Static104.aFloat42);
			Static49.aFloat31 = Static51.aFloat32 + local81 * (Static11.aClass125_1.aFloat57 - Static51.aFloat32);
			Static118.anInt2067 = (local66 * (Static220.anInt3788 & 0xFF00) + (Static11.aClass125_1.anInt3079 & 0xFF00) * local71 & 0xFF0000) + (local66 * (Static220.anInt3788 & 0xFF00FF) + ((Static11.aClass125_1.anInt3079 & 0xFF00FF) * local71) & 0xFF00FF00) >>> 8;
			Static42.aFloat30 = local81 * (Static11.aClass125_1.aFloat53 - Static220.aFloat68) + Static220.aFloat68;
			if (Static293.aClass133_3 != Static11.aClass125_1.aClass133_2) {
				Static435.aClass133_4 = Static307.aClass28_42.method3573(Static293.aClass133_3, Static11.aClass125_1.aClass133_2, local81, Static435.aClass133_4);
			}
		}
		Static350.aLong173 = local12;
	}
}
