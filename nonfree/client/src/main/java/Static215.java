import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hea", name = "u", descriptor = "I")
	public static int anInt3475;

	@OriginalMember(owner = "client!hea", name = "D", descriptor = "I")
	public static int anInt3479;

	@OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
	public static int anInt3481;

	@OriginalMember(owner = "client!hea", name = "Q", descriptor = "I")
	public static int anInt3488;

	@OriginalMember(owner = "client!hea", name = "Z", descriptor = "I")
	public static int anInt3495;

	@OriginalMember(owner = "client!hea", name = "ab", descriptor = "Lclient!hba;")
	public static Class144 aClass144_3;

	@OriginalMember(owner = "client!hea", name = "T", descriptor = "Lclient!de;")
	public static final Class60 aClass60_4 = new Class60("LIVE", "", "", 0);

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZB)V")
	public static void method3217(@OriginalArg(0) boolean arg0) {
		for (@Pc(10) Class4_Sub23 local10 = (Class4_Sub23) Static328.aClass163_30.method3639(); local10 != null; local10 = (Class4_Sub23) Static328.aClass163_30.method3640()) {
			if (local10.aClass4_Sub3_Sub3_2 != null) {
				Static162.aClass4_Sub3_Sub5_3.method7723(local10.aClass4_Sub3_Sub3_2);
				local10.aClass4_Sub3_Sub3_2 = null;
			}
			if (local10.aClass4_Sub3_Sub3_3 != null) {
				Static162.aClass4_Sub3_Sub5_3.method7723(local10.aClass4_Sub3_Sub3_3);
				local10.aClass4_Sub3_Sub3_3 = null;
			}
			local10.method9000();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(51) Class4_Sub23 local51 = (Class4_Sub23) Static611.aClass163_65.method3639(); local51 != null; local51 = (Class4_Sub23) Static611.aClass163_65.method3640()) {
			if (local51.aClass4_Sub3_Sub3_2 != null) {
				Static162.aClass4_Sub3_Sub5_3.method7723(local51.aClass4_Sub3_Sub3_2);
				local51.aClass4_Sub3_Sub3_2 = null;
			}
			local51.method9000();
		}
		for (@Pc(84) Class4_Sub23 local84 = (Class4_Sub23) Static124.aClass66_10.method1992(); local84 != null; local84 = (Class4_Sub23) Static124.aClass66_10.method1984()) {
			if (local84.aClass4_Sub3_Sub3_2 != null) {
				Static162.aClass4_Sub3_Sub5_3.method7723(local84.aClass4_Sub3_Sub3_2);
				local84.aClass4_Sub3_Sub3_2 = null;
			}
			local84.method9000();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method3223(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static518.anInt10290;
		@Pc(9) int[] local9 = Static489.anIntArray519;
		@Pc(11) boolean local11 = false;
		for (@Pc(18) int local18 = 0; local18 < local7; local18++) {
			@Pc(26) Class3_Sub1_Sub2_Sub2_Sub1 local26 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local9[local18]];
			if (local26 != null && Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 != local26 && local26.aString37 != null && local26.aString37.equalsIgnoreCase(arg0)) {
				@Pc(69) Class4_Sub48 local69;
				if (arg1 == 1) {
					local69 = Static335.method4615(Static253.aClass216_76, Static669.aClass196_2);
					local69.aClass4_Sub11_Sub1_2.method8877(0);
					local69.aClass4_Sub11_Sub1_2.method8891(local9[local18]);
					Static410.method5170(local69);
				} else if (arg1 == 4) {
					local69 = Static335.method4615(Static679.aClass216_159, Static669.aClass196_2);
					local69.aClass4_Sub11_Sub1_2.method8889(0);
					local69.aClass4_Sub11_Sub1_2.method8838(local9[local18]);
					Static410.method5170(local69);
				} else if (arg1 == 5) {
					local69 = Static335.method4615(Static601.aClass216_138, Static669.aClass196_2);
					local69.aClass4_Sub11_Sub1_2.method8866(0);
					local69.aClass4_Sub11_Sub1_2.method8849(local9[local18]);
					Static410.method5170(local69);
				} else if (arg1 == 6) {
					local69 = Static335.method4615(Static231.aClass216_132, Static669.aClass196_2);
					local69.aClass4_Sub11_Sub1_2.method8866(0);
					local69.aClass4_Sub11_Sub1_2.method8891(local9[local18]);
					Static410.method5170(local69);
				} else if (arg1 == 7) {
					local69 = Static335.method4615(Static490.aClass216_156, Static669.aClass196_2);
					local69.aClass4_Sub11_Sub1_2.method8877(0);
					local69.aClass4_Sub11_Sub1_2.method8849(local9[local18]);
					Static410.method5170(local69);
				} else if (arg1 == 9) {
					local69 = Static335.method4615(Static416.aClass216_106, Static669.aClass196_2);
					local69.aClass4_Sub11_Sub1_2.method8849(local9[local18]);
					local69.aClass4_Sub11_Sub1_2.method8889(0);
					Static410.method5170(local69);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static417.method5293(Static279.aClass179_21.method4066(Static164.anInt2984) + arg0);
		}
	}
}
