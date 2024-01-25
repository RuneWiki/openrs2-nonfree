import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "I")
	public static int anInt7947 = -1;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method6596(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static554.anInt9637 >= 100) {
			Static353.method5583(Static121.aClass84_39.method2710(Static372.anInt7083));
			return;
		}
		@Pc(25) String local25 = Static456.method6912(arg1);
		if (local25 == null) {
			return;
		}
		@Pc(69) String local69;
		for (@Pc(30) int local30 = 0; local30 < Static554.anInt9637; local30++) {
			@Pc(38) String local38 = Static456.method6912(Static525.aStringArray32[local30]);
			if (local38 != null && local38.equals(local25)) {
				Static353.method5583(arg1 + Static121.aClass84_40.method2710(Static372.anInt7083));
				return;
			}
			if (Static304.aStringArray18[local30] != null) {
				local69 = Static456.method6912(Static304.aStringArray18[local30]);
				if (local69 != null && local69.equals(local25)) {
					Static353.method5583(arg1 + Static121.aClass84_40.method2710(Static372.anInt7083));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static530.anInt9157; local100++) {
			local69 = Static456.method6912(Static54.aStringArray6[local100]);
			if (local69 != null && local69.equals(local25)) {
				Static353.method5583(Static121.aClass84_45.method2710(Static372.anInt7083) + arg1 + Static121.aClass84_46.method2710(Static372.anInt7083));
				return;
			}
			if (Static582.aStringArray36[local100] != null) {
				@Pc(144) String local144 = Static456.method6912(Static582.aStringArray36[local100]);
				if (local144 != null && local144.equals(local25)) {
					Static353.method5583(Static121.aClass84_45.method2710(Static372.anInt7083) + arg1 + Static121.aClass84_46.method2710(Static372.anInt7083));
					return;
				}
			}
		}
		if (Static456.method6912(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aString35).equals(local25)) {
			Static353.method5583(Static121.aClass84_42.method2710(Static372.anInt7083));
			return;
		}
		@Pc(205) Class8_Sub31 local205 = Static51.method1418(Static240.aClass257_46, Static608.aClass336_1);
		local205.aClass8_Sub8_Sub2_1.method8562(Static643.method8631(arg1) + 1);
		local205.aClass8_Sub8_Sub2_1.method8582(arg1);
		local205.aClass8_Sub8_Sub2_1.method8562(arg0 ? 1 : 0);
		Static262.method4604(local205);
	}
}
