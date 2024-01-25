import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!pp", name = "kd", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_133 = new Class73(76, 6);

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(B)Z")
	public static boolean method5918() {
		if (Static557.anInt9206 < 1) {
			return false;
		} else {
			return Static542.aClass194_5 != Static580.aClass194_7 || Static582.anInt9457 >= 2;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5921(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static574.anInt9426 >= 200 && !Static318.aBoolean406 || Static574.anInt9426 >= 200) {
			Static273.method4517(Static230.aClass156_9.method4065(Static25.anInt769));
			local30 = Static230.aClass156_10.method4065(Static25.anInt769);
			if (local30 != null) {
				Static273.method4517(local30);
			}
			return;
		}
		local30 = Static575.method7408(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(85) String local85;
		for (@Pc(46) int local46 = 0; local46 < Static574.anInt9426; local46++) {
			@Pc(54) String local54 = Static575.method7408(Static398.aStringArray29[local46]);
			if (local54 != null && local54.equals(local30)) {
				Static273.method4517(arg0 + Static230.aClass156_37.method4065(Static25.anInt769));
				return;
			}
			if (Static183.aStringArray8[local46] != null) {
				local85 = Static575.method7408(Static183.aStringArray8[local46]);
				if (local85 != null && local85.equals(local30)) {
					Static273.method4517(arg0 + Static230.aClass156_37.method4065(Static25.anInt769));
					return;
				}
			}
		}
		for (@Pc(112) int local112 = 0; local112 < Static362.anInt6352; local112++) {
			local85 = Static575.method7408(Static488.aStringArray16[local112]);
			if (local85 != null && local85.equals(local30)) {
				Static273.method4517(Static230.aClass156_42.method4065(Static25.anInt769) + arg0 + Static230.aClass156_43.method4065(Static25.anInt769));
				return;
			}
			if (Static378.aStringArray27[local112] != null) {
				@Pc(156) String local156 = Static575.method7408(Static378.aStringArray27[local112]);
				if (local156 != null && local156.equals(local30)) {
					Static273.method4517(Static230.aClass156_42.method4065(Static25.anInt769) + arg0 + Static230.aClass156_43.method4065(Static25.anInt769));
					return;
				}
			}
		}
		if (Static575.method7408(Static328.aClass4_Sub1_Sub1_Sub2_2.aString63).equals(local30)) {
			Static273.method4517(Static230.aClass156_40.method4065(Static25.anInt769));
		} else {
			@Pc(210) Class6_Sub31 local210 = Static114.method2007(Static500.aClass47_131, Static337.aClass324_1);
			local210.aClass6_Sub21_Sub2_2.method6062(Static391.method5746(arg0));
			local210.aClass6_Sub21_Sub2_2.method6022(arg0);
			Static534.method7251(local210);
		}
	}

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "(B)V")
	public static void method5923() {
		@Pc(5) Class136 local5 = Static367.aClass136_73;
		synchronized (Static367.aClass136_73) {
			Static367.aClass136_73.method3470();
		}
		local5 = Static183.aClass136_44;
		synchronized (Static183.aClass136_44) {
			Static183.aClass136_44.method3470();
		}
	}
}
