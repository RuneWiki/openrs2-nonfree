import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "Lclient!tj;")
	public static Class352 aClass352_1;

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
	public static int anInt7530 = 100;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6551(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static274.anInt4921;
		@Pc(9) int[] local9 = Static605.anIntArray544;
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local7; local18++) {
			@Pc(26) Class4_Sub1_Sub1_Sub2_Sub1 local26 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local9[local18]];
			if (local26 != null && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 != local26 && local26.aString44 != null && local26.aString44.equalsIgnoreCase(arg1)) {
				local16 = true;
				@Pc(64) Class5_Sub41 local64;
				if (arg0 == 1) {
					local64 = Static647.method8905(Static246.aClass381_110, Static4.aClass389_17.aClass393_2);
					local64.aClass5_Sub36_Sub2_1.method7309(0);
					local64.aClass5_Sub36_Sub2_1.method7285(local9[local18]);
					Static4.aClass389_17.method9079(local64);
				} else if (arg0 == 4) {
					local64 = Static647.method8905(Static116.aClass381_228, Static4.aClass389_17.aClass393_2);
					local64.aClass5_Sub36_Sub2_1.method7288(0);
					local64.aClass5_Sub36_Sub2_1.method7277(local9[local18]);
					Static4.aClass389_17.method9079(local64);
				} else if (arg0 == 5) {
					local64 = Static647.method8905(Static369.aClass381_157, Static4.aClass389_17.aClass393_2);
					local64.aClass5_Sub36_Sub2_1.method7285(local9[local18]);
					local64.aClass5_Sub36_Sub2_1.method7288(0);
					Static4.aClass389_17.method9079(local64);
				} else if (arg0 == 6) {
					local64 = Static647.method8905(Static165.aClass381_77, Static4.aClass389_17.aClass393_2);
					local64.aClass5_Sub36_Sub2_1.method7285(local9[local18]);
					local64.aClass5_Sub36_Sub2_1.method7288(0);
					Static4.aClass389_17.method9079(local64);
				} else if (arg0 == 7) {
					local64 = Static647.method8905(Static187.aClass381_82, Static4.aClass389_17.aClass393_2);
					local64.aClass5_Sub36_Sub2_1.method7324(0);
					local64.aClass5_Sub36_Sub2_1.method7285(local9[local18]);
					Static4.aClass389_17.method9079(local64);
				} else if (arg0 == 9) {
					local64 = Static647.method8905(Static570.aClass381_237, Static4.aClass389_17.aClass393_2);
					local64.aClass5_Sub36_Sub2_1.method7285(local9[local18]);
					local64.aClass5_Sub36_Sub2_1.method7293(0);
					Static4.aClass389_17.method9079(local64);
				}
				break;
			}
		}
		if (!local16) {
			Static218.method3476(Static184.aClass131_22.method3168(Static375.anInt7800) + arg1);
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)Z")
	public static boolean method6552(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}
}
