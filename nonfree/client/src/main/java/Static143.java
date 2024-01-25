import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!f", name = "i", descriptor = "[Lclient!fja;")
	public static Class2_Sub6_Sub1_Sub1[] aClass2_Sub6_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!ha;IIIII)Lclient!ka;")
	public static Class184 method2098(@OriginalArg(1) Class132 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg2;
		@Pc(14) Class184 local14 = (Class184) Static151.aClass10_12.method373(local6);
		if (local14 == null) {
			@Pc(29) Class22 local29 = Static308.method4413(arg2, Static286.aClass8_76);
			if (local29 == null) {
				return null;
			}
			if (local29.anInt512 < 13) {
				local29.method534();
			}
			local14 = arg0.method7475(local29, 2055, Static110.anInt1996, 64, 768);
			Static151.aClass10_12.method366(local14, local6);
		}
		local14 = local14.method8660((byte) 2, 2055, true);
		if (arg1 != 0) {
			local14.a(arg1);
		}
		if (arg4 != 0) {
			local14.FA(arg4);
		}
		if (arg3 != 0) {
			local14.VA(arg3);
		}
		if (arg5 != 0) {
			local14.H(0, arg5, 0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)I")
	public static int method2104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = 65536 - Class6_Sub1_Sub3.anIntArray58[arg1 * 8192 / arg3] >> 1;
		return (local20 * arg0 >> 16) + (arg2 * (65536 - local20) >> 16);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V")
	public static void method2106(@OriginalArg(1) int arg0) {
		if (arg0 == Static556.anInt9319) {
			return;
		}
		if (arg0 == 13) {
			if (Static259.aString53 == null) {
				Static547.method7777(Static12.aString10, Static633.aString140, Static595.anInt9707);
			} else {
				Static387.method5525(Static595.anInt9707);
			}
		}
		if (arg0 != 13 && Static263.aClass170_2 != null) {
			Static263.aClass170_2.method8770();
			Static263.aClass170_2 = null;
		}
		if (arg0 == 3) {
			Static412.method6205(Static561.anInt9357 != Static474.anInt7340);
		}
		if (arg0 == 7) {
			Static398.method5741(Static609.anInt9947 != Static561.anInt9357);
		}
		if (arg0 == 5) {
			if (Static259.aString53 == null) {
				Static273.method4027(Static633.aString140, Static12.aString10);
			} else {
				Static452.method6555();
			}
		} else if (arg0 == 6) {
			if (Static259.aString53 == null) {
				Static547.method7777(Static12.aString10, Static633.aString140, Static595.anInt9707);
			} else {
				Static387.method5525(Static595.anInt9707);
			}
		} else if (arg0 == 9) {
			if (Static259.aString53 == null) {
				Static547.method7777(Static12.aString10, Static633.aString140, Static595.anInt9707);
			} else {
				Static387.method5525(Static595.anInt9707);
			}
		} else if (arg0 == 12) {
			if (Static259.aString53 == null) {
				Static273.method4027(Static633.aString140, Static12.aString10);
			} else {
				Static452.method6555();
			}
		}
		if (Static224.method3273(Static556.anInt9319)) {
			Static307.aClass8_83.anInt268 = 2;
			Static49.aClass8_13.anInt268 = 2;
			Static593.aClass8_131.anInt268 = 2;
			Static5.aClass8_1.anInt268 = 2;
			Static169.aClass8_53.anInt268 = 2;
			Static112.aClass8_30.anInt268 = 2;
			Static43.aClass8_12.anInt268 = 2;
		}
		if (Static224.method3273(arg0)) {
			Static104.anInt1932 = 0;
			Static109.anInt1989 = 1;
			Static59.anInt1156 = 1;
			Static180.anInt9944 = 0;
			Static604.anInt4517 = 0;
			Static617.method8513(true);
			Static307.aClass8_83.anInt268 = 1;
			Static49.aClass8_13.anInt268 = 1;
			Static593.aClass8_131.anInt268 = 1;
			Static5.aClass8_1.anInt268 = 1;
			Static169.aClass8_53.anInt268 = 1;
			Static112.aClass8_30.anInt268 = 1;
			Static43.aClass8_12.anInt268 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static105.method1717();
		}
		@Pc(234) boolean local234 = arg0 == 2 || Static625.method8609(arg0) || Static261.method3800(arg0);
		@Pc(249) boolean local249 = Static556.anInt9319 == 2 || Static625.method8609(Static556.anInt9319) || Static261.method3800(Static556.anInt9319);
		if (local234 != local249) {
			if (local234) {
				Static278.anInt9800 = Static93.anInt7373;
				if (Static96.aClass6_Sub22_7.aClass29_Sub5_3.method1502() == 0) {
					Static597.method8267();
				} else {
					Static465.method6878(Static365.aClass8_98, Static96.aClass6_Sub22_7.aClass29_Sub5_3.method1502(), Static93.anInt7373);
					Static189.method2689();
				}
				Static424.aClass73_2.method1807(false);
			} else {
				Static597.method8267();
				Static424.aClass73_2.method1807(true);
			}
		}
		if (Static224.method3273(arg0) || arg0 == 13) {
			Static546.aClass132_13.method7477();
		}
		Static556.anInt9319 = arg0;
	}
}
