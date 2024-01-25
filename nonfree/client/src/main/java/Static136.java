import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!mk;B)Ljava/lang/String;")
	public static String method1990(@OriginalArg(0) Class2_Sub26 arg0) {
		return arg0.aString41 == null || arg0.aString41.length() <= 0 ? arg0.aString40 : arg0.aString40 + Static258.aClass256_79.method5720(Static272.anInt7537) + arg0.aString41;
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
	public static void method1991() {
		if (Static297.anInt5339 == 10 || Static297.anInt5339 == 28) {
			Static270.method4018(Static225.anInt4310 >> 10, 5000, Static293.anInt5621 >> 10);
		} else {
			@Pc(16) int local16 = Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray436[0] >> 3;
			@Pc(23) int local23 = Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray437[0] >> 3;
			if (local16 >= 0 && local16 < Static81.anInt1950 >> 3 && local23 >= 0 && local23 < Static171.anInt3288 >> 3) {
				Static270.method4018(local16, 5000, local23);
			} else {
				Static270.method4018(Static81.anInt1950 >> 4, 0, Static171.anInt3288 >> 4);
			}
		}
		Static417.method5648();
		Static348.method4896();
		Static417.method5647();
		Static346.method4860();
	}
}
