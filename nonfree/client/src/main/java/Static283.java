import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)V")
	public static void method4691() {
		Static378.anInt6595 = 0;
		Static97.anInt1434 = -1;
		Static208.anInt4167 = -1;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZB)V")
	public static void method4692(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static635.anInt9910 != -1) {
				Static333.method5172(Static635.anInt9910);
			}
			for (@Pc(21) Class6_Sub25 local21 = (Class6_Sub25) Static477.aClass74_31.method1404(); local21 != null; local21 = (Class6_Sub25) Static477.aClass74_31.method1405()) {
				if (!local21.method9050()) {
					local21 = (Class6_Sub25) Static477.aClass74_31.method1404();
					if (local21 == null) {
						break;
					}
				}
				Static133.method2562(local21, true, false);
			}
			Static635.anInt9910 = -1;
			Static477.aClass74_31 = new Class74(8);
			Static210.method3843();
			Static635.anInt9910 = Static94.anInt1386;
			Static623.method8541(false);
			Static35.method456();
			Static301.method4834(Static635.anInt9910);
		}
		Static567.method7974();
		Static624.aBoolean726 = false;
		Static594.method8232();
		Static475.anInt8093 = -1;
		Static608.method8373(Static269.anInt5037);
		Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 = new Class60_Sub1_Sub1_Sub3_Sub1();
		Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray263[0] = Static29.anInt380 / 2;
		Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057 = Static327.anInt5650 * 512 / 2;
		Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048 = Static29.anInt380 * 512 / 2;
		Static365.anInt6155 = 0;
		Static475.anInt8090 = 0;
		Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray264[0] = Static327.anInt5650 / 2;
		if (Static526.anInt8626 == 2) {
			Static365.anInt6155 = Static675.anInt5495 << 9;
			Static475.anInt8090 = Static438.anInt7455 << 9;
		} else {
			Static231.method4108();
		}
		Static433.method6599();
	}
}
