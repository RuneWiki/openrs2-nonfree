import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!um", name = "K", descriptor = "F")
	public static float aFloat101;

	@OriginalMember(owner = "client!um", name = "T", descriptor = "[I")
	public static int[] anIntArray448;

	@OriginalMember(owner = "client!um", name = "M", descriptor = "I")
	public static int anInt7030 = 100;

	@OriginalMember(owner = "client!um", name = "P", descriptor = "Z")
	public static boolean aBoolean477 = true;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V")
	public static void method5737() {
		try {
			if (Static63.anInt7101 == 1) {
				@Pc(10) int local10 = Static407.aClass3_Sub1_Sub4_3.method6323();
				if (local10 > 0 && Static407.aClass3_Sub1_Sub4_3.method6319()) {
					local10 -= Static111.anInt1973;
					if (local10 < 0) {
						local10 = 0;
					}
					Static407.aClass3_Sub1_Sub4_3.method6305(local10);
					return;
				}
				Static407.aClass3_Sub1_Sub4_3.method6317();
				Static407.aClass3_Sub1_Sub4_3.method6310();
				if (Static395.aClass250_95 == null) {
					Static63.anInt7101 = 0;
				} else {
					Static63.anInt7101 = 2;
				}
				Static155.aClass3_Sub37_1 = null;
				Static314.aClass67_1 = null;
			}
		} catch (@Pc(54) Exception local54) {
			local54.printStackTrace();
			Static407.aClass3_Sub1_Sub4_3.method6317();
			Static314.aClass67_1 = null;
			Static155.aClass3_Sub37_1 = null;
			Static63.anInt7101 = 0;
			Static395.aClass250_95 = null;
		}
	}
}
