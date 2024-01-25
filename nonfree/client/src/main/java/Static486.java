import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "F")
	public static float aFloat159;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)Z")
	public static boolean method6619() {
		try {
			if (Static375.anInt6351 == 2) {
				if (Static375.aClass3_Sub32_2 == null) {
					Static375.aClass3_Sub32_2 = Static602.method4960(Static10.aClass246_11, Static487.anInt7851, Static262.anInt4939);
					if (Static375.aClass3_Sub32_2 == null) {
						return false;
					}
				}
				if (Static71.aClass326_1 == null) {
					Static71.aClass326_1 = new Class326(Static305.aClass246_146, Static143.aClass246_244);
				}
				if (Static142.aClass3_Sub6_Sub3_1.method2123(Static375.aClass3_Sub32_2, Static71.aClass326_1, Static203.aClass246_102)) {
					Static142.aClass3_Sub6_Sub3_1.method2122();
					if (Static526.anInt8323 <= 0) {
						Static375.anInt6351 = 0;
						Static142.aClass3_Sub6_Sub3_1.method2118(Static478.anInt7778);
					} else {
						Static375.anInt6351 = 3;
						Static142.aClass3_Sub6_Sub3_1.method2118(0);
					}
					if (Static588.aLong81 <= 0L) {
						Static142.aClass3_Sub6_Sub3_1.method2143(Static375.aClass3_Sub32_2, Static564.aBoolean704);
					} else {
						Static142.aClass3_Sub6_Sub3_1.method2127(Static564.aBoolean704, Static375.aClass3_Sub32_2, Static588.aLong81);
					}
					Static71.aClass326_1 = null;
					Static588.aLong81 = 0L;
					Static375.aClass3_Sub32_2 = null;
					Static10.aClass246_11 = null;
					return true;
				}
			}
		} catch (@Pc(93) Exception local93) {
			local93.printStackTrace();
			Static142.aClass3_Sub6_Sub3_1.method2131();
			Static10.aClass246_11 = null;
			Static375.aClass3_Sub32_2 = null;
			Static71.aClass326_1 = null;
			Static375.anInt6351 = 0;
		}
		return false;
	}
}
