import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "Lclient!la;")
	public static Class117 aClass117_12;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "[I")
	public static final int[] anIntArray701 = new int[6];

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(B)V")
	public static void method7791() {
		try {
			@Pc(10) int local10;
			if (Static375.anInt6351 == 1) {
				local10 = Static142.aClass3_Sub6_Sub3_1.method2147();
				if (local10 > 0 && Static142.aClass3_Sub6_Sub3_1.method2142()) {
					local10 -= Static206.anInt4170;
					if (local10 < 0) {
						local10 = 0;
					}
					Static142.aClass3_Sub6_Sub3_1.method2118(local10);
					return;
				}
				Static142.aClass3_Sub6_Sub3_1.method2131();
				Static142.aClass3_Sub6_Sub3_1.method2134();
				Static71.aClass326_1 = null;
				if (Static10.aClass246_11 == null) {
					Static375.anInt6351 = 0;
				} else {
					Static375.anInt6351 = 2;
				}
				Static375.aClass3_Sub32_2 = null;
			}
			if (Static375.anInt6351 == 3) {
				local10 = Static142.aClass3_Sub6_Sub3_1.method2147();
				if (local10 < Static478.anInt7778 && Static142.aClass3_Sub6_Sub3_1.method2142()) {
					local10 += Static526.anInt8323;
					if (Static478.anInt7778 < local10) {
						local10 = Static478.anInt7778;
					}
					Static142.aClass3_Sub6_Sub3_1.method2118(local10);
					return;
				}
				Static526.anInt8323 = 0;
				Static375.anInt6351 = 0;
			}
		} catch (@Pc(92) Exception local92) {
			local92.printStackTrace();
			Static142.aClass3_Sub6_Sub3_1.method2131();
			Static375.aClass3_Sub32_2 = null;
			Static375.anInt6351 = 0;
			Static71.aClass326_1 = null;
			Static10.aClass246_11 = null;
		}
	}
}
