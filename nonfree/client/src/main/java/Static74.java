import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static74 {

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
	public static int anInt145 = 0;

	@OriginalMember(owner = "client!dj", name = "D", descriptor = "F")
	public static float aFloat6 = 0.0F;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ja;II)V")
	public static void method118(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1) {
		if (Static408.aBoolean463) {
			arg1 = 0;
			Static408.aBoolean463 = false;
		}
		if (Static11.aClass125_1 != null && Static11.aClass125_1.method2772(arg0)) {
			return;
		}
		Static11.aClass125_1 = arg0;
		Static350.aLong173 = Static154.method2527();
		Static397.anInt6568 = arg1;
		Static225.anInt3838 = arg1;
		if (Static225.anInt3838 == 0) {
			Static332.method4751();
			return;
		}
		Static220.aFloat68 = Static42.aFloat30;
		Static411.aFloat103 = Static195.aFloat64;
		Static186.anInt3250 = Static298.anInt4945;
		Static204.aFloat90 = Static304.aFloat88;
		Static293.aClass133_3 = Static435.aClass133_4;
		Static272.aFloat84 = Static307.aFloat45;
		Static220.anInt3788 = Static118.anInt2067;
		Static224.anInt3821 = Static424.anInt179;
		Static51.aFloat32 = Static49.aFloat31;
		Static104.aFloat42 = Static151.aFloat49;
	}
}
