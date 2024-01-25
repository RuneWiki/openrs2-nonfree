import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "Lclient!ek;")
	public static Class6_Sub2_Sub6 aClass6_Sub2_Sub6_3;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_134 = new Class73(10, 12);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method5942(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static362.anInt6352 >= 100) {
			Static273.method4517(Static230.aClass156_38.method4065(Static25.anInt769));
			return;
		}
		@Pc(23) String local23 = Static575.method7408(arg0);
		if (local23 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(28) int local28 = 0; local28 < Static362.anInt6352; local28++) {
			@Pc(36) String local36 = Static575.method7408(Static488.aStringArray16[local28]);
			if (local36 != null && local36.equals(local23)) {
				Static273.method4517(arg0 + Static230.aClass156_39.method4065(Static25.anInt769));
				return;
			}
			if (Static378.aStringArray27[local28] != null) {
				local67 = Static575.method7408(Static378.aStringArray27[local28]);
				if (local67 != null && local67.equals(local23)) {
					Static273.method4517(arg0 + Static230.aClass156_39.method4065(Static25.anInt769));
					return;
				}
			}
		}
		for (@Pc(94) int local94 = 0; local94 < Static574.anInt9426; local94++) {
			local67 = Static575.method7408(Static398.aStringArray29[local94]);
			if (local67 != null && local67.equals(local23)) {
				Static273.method4517(Static230.aClass156_44.method4065(Static25.anInt769) + arg0 + Static230.aClass156_45.method4065(Static25.anInt769));
				return;
			}
			if (Static183.aStringArray8[local94] != null) {
				@Pc(138) String local138 = Static575.method7408(Static183.aStringArray8[local94]);
				if (local138 != null && local138.equals(local23)) {
					Static273.method4517(Static230.aClass156_44.method4065(Static25.anInt769) + arg0 + Static230.aClass156_45.method4065(Static25.anInt769));
					return;
				}
			}
		}
		if (Static575.method7408(Static328.aClass4_Sub1_Sub1_Sub2_2.aString63).equals(local23)) {
			Static273.method4517(Static230.aClass156_41.method4065(Static25.anInt769));
			return;
		}
		@Pc(197) Class6_Sub31 local197 = Static114.method2007(Static279.aClass47_83, Static337.aClass324_1);
		local197.aClass6_Sub21_Sub2_2.method6062(Static391.method5746(arg0) + 1);
		local197.aClass6_Sub21_Sub2_2.method6022(arg0);
		local197.aClass6_Sub21_Sub2_2.method6062(arg1 ? 1 : 0);
		Static534.method7251(local197);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IC)Z")
	public static boolean method5946(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
