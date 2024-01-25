import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!jba", name = "l", descriptor = "Lclient!db;")
	public static final Class57 aClass57_6 = new Class57(2, 4, 4, 0);

	@OriginalMember(owner = "client!jba", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString35 = null;

	@OriginalMember(owner = "client!jba", name = "p", descriptor = "Lclient!kp;")
	public static final Class167 aClass167_8 = new Class167(1);

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZB)V")
	public static void method3982(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static422.anInt8667 != -1) {
				Static102.method4938(Static422.anInt8667);
			}
			for (@Pc(15) Class3_Sub29 local15 = (Class3_Sub29) Static156.aClass267_14.method6643(); local15 != null; local15 = (Class3_Sub29) Static156.aClass267_14.method6650()) {
				if (!local15.method7821()) {
					local15 = (Class3_Sub29) Static156.aClass267_14.method6643();
					if (local15 == null) {
						break;
					}
				}
				Static361.method5656(false, true, local15);
			}
			Static422.anInt8667 = -1;
			Static156.aClass267_14 = new Class267(8);
			Static104.method2058();
			Static422.anInt8667 = Static194.anInt4422;
			Static47.method7753(false);
			Static403.method6133();
			Static60.method1219(Static422.anInt8667);
		}
		Static179.aString36 = "";
		Static494.aString82 = "";
		Static501.aBoolean654 = false;
		Static219.method4010();
		Static7.anInt488 = -1;
		Static234.method4162(Static395.anInt7316);
		Static111.aClass6_Sub1_Sub2_Sub1_3 = new Class6_Sub1_Sub2_Sub1();
		Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 = Static118.anInt2527 * 512 / 2;
		Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray733[0] = Static118.anInt2527 / 2;
		Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 = Static549.anInt9482 * 512 / 2;
		Static329.anInt6297 = 0;
		Static311.anInt6050 = 0;
		Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray734[0] = Static549.anInt9482 / 2;
		if (Static305.anInt5998 == 2) {
			Static329.anInt6297 = Static346.anInt6595 << 9;
			Static311.anInt6050 = Static192.anInt4400 << 9;
		} else {
			Static531.method7629();
		}
		Static245.method4229();
	}
}
