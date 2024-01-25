import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!taa", name = "d", descriptor = "Lclient!nq;")
	public static Class6_Sub37_Sub1 aClass6_Sub37_Sub1_1;

	@OriginalMember(owner = "client!taa", name = "f", descriptor = "I")
	public static int anInt8070 = 0;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
	public static void method6664() {
		@Pc(7) Class133 local7 = null;
		try {
			local7 = Static70.method926("2");
			@Pc(24) Class6_Sub14 local24 = new Class6_Sub14(Static247.anInt4097 * 6 + 3);
			local24.method6035(1);
			local24.method5999(Static247.anInt4097);
			for (@Pc(34) int local34 = 0; local34 < Static402.anIntArray568.length; local34++) {
				if (Static248.aBooleanArray25[local34]) {
					local24.method5999(local34);
					local24.method5990(Static402.anIntArray568[local34]);
				}
			}
			local7.method2786(local24.aByteArray88, 0, local24.anInt7244);
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (local7 != null) {
				local7.method2788();
			}
		} catch (@Pc(76) Exception local76) {
		}
		Static97.aLong54 = Static137.method2058();
		Static362.aBoolean433 = false;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method6666(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static199.anInt3448;
		@Pc(9) int[] local9 = Static272.anIntArray443;
		@Pc(11) boolean local11 = false;
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			@Pc(25) Class29_Sub2_Sub1_Sub2 local25 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local9[local17]];
			if (local25 != null && Static426.aClass29_Sub2_Sub1_Sub2_2 != local25 && local25.aString108 != null && local25.aString108.equalsIgnoreCase(arg0)) {
				local11 = true;
				if (arg1 == 1) {
					Static136.method2051(Static119.aClass160_104);
					Static218.aClass6_Sub14_Sub2_1.method5980(local9[local17]);
					Static218.aClass6_Sub14_Sub2_1.method6004(0);
				} else if (arg1 == 4) {
					Static136.method2051(Static276.aClass160_59);
					Static218.aClass6_Sub14_Sub2_1.method5999(local9[local17]);
					Static218.aClass6_Sub14_Sub2_1.method6040(0);
				} else if (arg1 == 5) {
					Static136.method2051(Static47.aClass160_121);
					Static218.aClass6_Sub14_Sub2_1.method6035(0);
					Static218.aClass6_Sub14_Sub2_1.method5997(local9[local17]);
				} else if (arg1 == 6) {
					Static136.method2051(Static160.aClass160_42);
					Static218.aClass6_Sub14_Sub2_1.method5997(local9[local17]);
					Static218.aClass6_Sub14_Sub2_1.method6004(0);
				} else if (arg1 == 7) {
					Static136.method2051(Static89.aClass160_28);
					Static218.aClass6_Sub14_Sub2_1.method6035(0);
					Static218.aClass6_Sub14_Sub2_1.method5997(local9[local17]);
				}
				break;
			}
		}
		if (!local11) {
			Static418.method6132(Static141.aClass104_66.method2145(Static470.anInt7957) + arg0);
		}
	}
}
