import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
	public static int anInt6290;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "Lclient!io;")
	public static final Class148 aClass148_10 = new Class148(14, 0, 4, 1);

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "[Lclient!mb;")
	public static final Class5_Sub2_Sub16[] aClass5_Sub2_Sub16Array2 = new Class5_Sub2_Sub16[14];

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	public static int anInt6296 = 0;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method5223(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static103.anInt992;
		@Pc(9) int[] local9 = Static523.anIntArray682;
		@Pc(11) boolean local11 = false;
		for (@Pc(18) int local18 = 0; local18 < local7; local18++) {
			@Pc(26) Class15_Sub2_Sub1_Sub1 local26 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local9[local18]];
			if (local26 != null && Static35.aClass15_Sub2_Sub1_Sub1_1 != local26 && local26.aString18 != null && local26.aString18.equalsIgnoreCase(arg0)) {
				local11 = true;
				if (arg1 == 1) {
					Static415.method5995(Static460.aClass236_78);
					Static164.aClass5_Sub3_Sub1_2.method4200(local9[local18]);
					Static164.aClass5_Sub3_Sub1_2.method4219(0);
				} else if (arg1 == 4) {
					Static415.method5995(Static238.aClass236_46);
					Static164.aClass5_Sub3_Sub1_2.method4229(local9[local18]);
					Static164.aClass5_Sub3_Sub1_2.method4180(0);
				} else if (arg1 == 5) {
					Static415.method5995(Static37.aClass236_4);
					Static164.aClass5_Sub3_Sub1_2.method4200(local9[local18]);
					Static164.aClass5_Sub3_Sub1_2.method4192(0);
				} else if (arg1 == 6) {
					Static415.method5995(Static109.aClass236_19);
					Static164.aClass5_Sub3_Sub1_2.method4219(0);
					Static164.aClass5_Sub3_Sub1_2.method4181(local9[local18]);
				} else if (arg1 == 7) {
					Static415.method5995(Static546.aClass236_101);
					Static164.aClass5_Sub3_Sub1_2.method4219(0);
					Static164.aClass5_Sub3_Sub1_2.method4229(local9[local18]);
				}
				break;
			}
		}
		if (!local11) {
			Static340.method5291(Static161.aClass40_51.method1063(Static194.anInt3737) + arg0);
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Lclient!hca;")
	public static Class125 method5225(@OriginalArg(0) int arg0) {
		@Pc(8) Class125[] local8 = Static132.method2502();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(21) Class125 local21 = local8[local10];
			if (local21.anInt3483 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
