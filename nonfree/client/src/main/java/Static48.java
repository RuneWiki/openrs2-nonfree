import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "Lclient!ud;")
	public static final Class245 aClass245_3 = new Class245(9, 0, 4, 1);

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
	public static int anInt759 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V")
	public static void method632(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static182.anInt3346 != -1) {
				Static107.method1600(Static182.anInt3346);
			}
			for (@Pc(14) Class4_Sub8 local14 = (Class4_Sub8) Static449.aClass67_37.method1428(); local14 != null; local14 = (Class4_Sub8) Static449.aClass67_37.method1424()) {
				if (!local14.method6060()) {
					local14 = (Class4_Sub8) Static449.aClass67_37.method1428();
					if (local14 == null) {
						break;
					}
				}
				Static242.method3223(local14, true, false);
			}
			Static182.anInt3346 = -1;
			Static449.aClass67_37 = new Class67(8);
			Static129.method1849();
			Static182.anInt3346 = Static343.anInt5688;
			Static31.method434(false);
			Static194.method5772();
			Static80.method1283(Static182.anInt3346);
		}
		Static261.aBoolean316 = false;
		Static160.aString55 = "";
		Static76.aString7 = "";
		Static101.method1517();
		Static340.anInt5535 = -1;
		Static322.method4261(Static373.anInt6115);
		Static401.aClass8_Sub3_Sub1_Sub1_2 = new Class8_Sub3_Sub1_Sub1();
		Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343 = Static282.anInt4644 * 128 / 2;
		Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray560[0] = Static337.anInt5497 / 2;
		Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339 = Static337.anInt5497 * 128 / 2;
		Static393.anInt7135 = 0;
		Static235.anInt4004 = 0;
		Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray559[0] = Static282.anInt4644 / 2;
		if (Static97.anInt1791 == 2) {
			Static393.anInt7135 = Static131.anInt2368 << 7;
			Static235.anInt4004 = Static64.anInt1159 << 7;
		} else {
			Static141.method1991();
		}
		Static458.method5376();
	}
}
