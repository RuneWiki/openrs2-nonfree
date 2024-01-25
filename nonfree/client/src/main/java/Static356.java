import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!wb;")
	public static Class259 aClass259_2;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "I")
	public static int anInt6043 = 0;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "I")
	public static int anInt6044 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method4859() {
		try {
			if (Static237.anInt4548 == 1) {
				@Pc(16) int local16 = Static335.aClass2_Sub3_Sub4_2.method4641();
				if (local16 > 0 && Static335.aClass2_Sub3_Sub4_2.method4628()) {
					local16 -= Static332.anInt5719;
					if (local16 < 0) {
						local16 = 0;
					}
					Static335.aClass2_Sub3_Sub4_2.method4648(local16);
				} else {
					Static335.aClass2_Sub3_Sub4_2.method4626();
					Static335.aClass2_Sub3_Sub4_2.method4634();
					Static281.aClass105_10 = null;
					if (Static74.aClass160_9 == null) {
						Static237.anInt4548 = 0;
					} else {
						Static237.anInt4548 = 2;
					}
					Static167.aClass2_Sub27_1 = null;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static335.aClass2_Sub3_Sub4_2.method4626();
			Static237.anInt4548 = 0;
			Static167.aClass2_Sub27_1 = null;
			Static74.aClass160_9 = null;
			Static281.aClass105_10 = null;
		}
	}
}
