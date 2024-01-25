import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!pe", name = "Oc", descriptor = "Lclient!en;")
	public static Class93 aClass93_3;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)Z")
	public static boolean method1027() {
		if (Static12.aBoolean9) {
			try {
				if ((Boolean) Static653.method5177(Static7.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "(I)V")
	public static void method1031() {
		if (Static337.anInt5727 == -1) {
			return;
		}
		@Pc(13) int local13 = Static3.aClass3_3.method8875();
		@Pc(17) int local17 = Static3.aClass3_3.method8879();
		@Pc(22) Class5_Sub13 local22 = (Class5_Sub13) Static75.aClass330_5.method7908();
		if (local22 != null) {
			local13 = local22.method5403();
			local17 = local22.method5401();
		}
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		if (Static428.aBoolean526) {
			local34 = Static584.method8436();
			local36 = Static88.method1487();
		}
		Static243.method4022(local17, local36 + local17, local13 - -local34, local13, local36, Static408.anInt7118 + local36, local34, local34 + Static345.anInt5827, Static337.anInt5727, local34, local36);
		if (Static135.aClass295_7 != null) {
			Static465.method6898(local17 + local36, local34 + local13);
		}
	}
}
