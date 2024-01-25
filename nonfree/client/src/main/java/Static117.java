import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Lclient!gj;")
	public static Class31 aClass31_61;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "I")
	public static int anInt2590 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
	public static void method2497(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static111.anInt2471 != -1) {
				Static331.method2991(Static111.anInt2471);
			}
			for (@Pc(15) Class2_Sub8 local15 = (Class2_Sub8) Static273.aClass199_25.method5747(); local15 != null; local15 = (Class2_Sub8) Static273.aClass199_25.method5753()) {
				if (!local15.method5949()) {
					local15 = (Class2_Sub8) Static273.aClass199_25.method5747();
					if (local15 == null) {
						break;
					}
				}
				Static148.method2868(local15, true, false);
			}
			Static111.anInt2471 = -1;
			Static273.aClass199_25 = new Class199(8);
			Static8.method219();
			Static111.anInt2471 = Static20.anInt435;
			Static121.method2514(false);
			Static253.method5944();
			Static72.method1645(Static111.anInt2471);
		}
		Static346.method5936();
		Static256.anInt5081 = -1;
		Static70.method1578(Static264.anInt5425);
		Static41.aClass62_Sub1_Sub2_Sub2_2 = new Class62_Sub1_Sub2_Sub2();
		Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 = 6656;
		Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0] = 52;
		Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 = 6656;
		Static290.anInt5837 = 0;
		Static287.anInt5819 = 0;
		Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0] = 52;
		if (Static182.anInt3602 == 2) {
			Static287.anInt5819 = Static311.anInt6287 << 7;
			Static290.anInt5837 = Static88.anInt1903 << 7;
		} else {
			Static293.method5194();
		}
		Static349.method5959();
		if (Static287.anInt5819 == 0 || Static290.anInt5837 == 0) {
			Static125.method2616(10);
		} else {
			Static135.method2702();
			Static125.method2616(28);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!tq;)V")
	public static void method2498(@OriginalArg(1) Class191 arg0) {
		Static152.aClass191_97 = arg0;
	}
}
