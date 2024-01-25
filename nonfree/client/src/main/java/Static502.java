import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)Z")
	public static boolean method6762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static230.method3587(arg1, arg0) | (arg0 & 0x70000) != 0 || Static429.method6065(arg1, arg0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method6763(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static579.anInt9370 >= 100) {
			Static550.method7295(Static544.aClass343_43.method7222(Static256.anInt4535));
			return;
		}
		@Pc(27) String local27 = Static131.method2611(arg0);
		if (local27 == null) {
			return;
		}
		@Pc(71) String local71;
		for (@Pc(32) int local32 = 0; local32 < Static579.anInt9370; local32++) {
			@Pc(40) String local40 = Static131.method2611(Static483.aStringArray33[local32]);
			if (local40 != null && local40.equals(local27)) {
				Static550.method7295(arg0 + Static544.aClass343_44.method7222(Static256.anInt4535));
				return;
			}
			if (Static527.aStringArray36[local32] != null) {
				local71 = Static131.method2611(Static527.aStringArray36[local32]);
				if (local71 != null && local71.equals(local27)) {
					Static550.method7295(arg0 + Static544.aClass343_44.method7222(Static256.anInt4535));
					return;
				}
			}
		}
		for (@Pc(102) int local102 = 0; local102 < Static591.anInt9675; local102++) {
			local71 = Static131.method2611(Static22.aStringArray1[local102]);
			if (local71 != null && local71.equals(local27)) {
				Static550.method7295(Static544.aClass343_49.method7222(Static256.anInt4535) + arg0 + Static544.aClass343_50.method7222(Static256.anInt4535));
				return;
			}
			if (Static91.aStringArray6[local102] != null) {
				@Pc(146) String local146 = Static131.method2611(Static91.aStringArray6[local102]);
				if (local146 != null && local146.equals(local27)) {
					Static550.method7295(Static544.aClass343_49.method7222(Static256.anInt4535) + arg0 + Static544.aClass343_50.method7222(Static256.anInt4535));
					return;
				}
			}
		}
		if (Static131.method2611(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aString95).equals(local27)) {
			Static550.method7295(Static544.aClass343_46.method7222(Static256.anInt4535));
			return;
		}
		@Pc(204) Class3_Sub42 local204 = Static591.method7910(Static9.aClass199_3, Static95.aClass303_25);
		local204.aClass3_Sub11_Sub1_1.method5213(Static325.method4707(arg0) + 1);
		local204.aClass3_Sub11_Sub1_1.method5227(arg0);
		local204.aClass3_Sub11_Sub1_1.method5213(arg1 ? 1 : 0);
		Static511.method6885(local204);
	}
}
