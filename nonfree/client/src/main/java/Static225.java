import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
	public static int anInt3735;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[200];

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "[I")
	public static final int[] anIntArray235 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
	public static void method2955() {
		Static218.aClass44_42.method1031();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!ms;)V")
	public static void method2957(@OriginalArg(1) Class5_Sub22 arg0) {
		arg0.aBoolean497 = false;
		if (arg0.aClass5_Sub5_5 != null) {
			arg0.aClass5_Sub5_5.anInt5861 = 0;
		}
		for (@Pc(21) Class5_Sub22 local21 = arg0.method5929(); local21 != null; local21 = arg0.method5928()) {
			method2957(local21);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIII)V")
	public static void method2959(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		Static3.anInt45 = 0;
		Static356.anInt5817 = 0;
		Static112.anInt1900 = arg0;
		Static3.anInt46 = arg1;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!fi;)V")
	public static void method2960(@OriginalArg(1) Class76 arg0) {
		@Pc(7) Class76 local7 = Static30.method477(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local7 == null) {
			local15 = Static102.anInt1723;
			local12 = Static178.anInt5792;
		} else {
			local12 = local7.anInt2127;
			local15 = local7.anInt2106;
		}
		Static177.method2451(local12, arg0, local15, false);
		Static341.method4440(arg0, local15, local12);
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(IIIII)V")
	public static void method2962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(6) Class5_Sub31 local6 = (Class5_Sub31) Static207.aClass177_20.method3618(); local6 != null; local6 = (Class5_Sub31) Static207.aClass177_20.method3619()) {
			Static437.method5774(arg1, arg0, local6, arg2, arg3);
		}
		for (@Pc(31) Class5_Sub31 local31 = (Class5_Sub31) Static45.aClass177_2.method3618(); local31 != null; local31 = (Class5_Sub31) Static45.aClass177_2.method3619()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class133 local40 = local31.aClass2_Sub1_Sub3_Sub1_2.method4910();
			if (local31.aClass2_Sub1_Sub3_Sub1_2.aBoolean410) {
				local35 = 0;
			} else if (local31.aClass2_Sub1_Sub3_Sub1_2.lb == local40.anInt3510 || local31.aClass2_Sub1_Sub3_Sub1_2.lb == local40.anInt3515 || local40.anInt3526 == local31.aClass2_Sub1_Sub3_Sub1_2.lb || local31.aClass2_Sub1_Sub3_Sub1_2.lb == local40.anInt3544) {
				local35 = 2;
			} else if (local40.anInt3507 == local31.aClass2_Sub1_Sub3_Sub1_2.lb || local31.aClass2_Sub1_Sub3_Sub1_2.lb == local40.anInt3542 || local31.aClass2_Sub1_Sub3_Sub1_2.lb == local40.anInt3513 || local31.aClass2_Sub1_Sub3_Sub1_2.lb == local40.anInt3532) {
				local35 = 3;
			}
			if (local31.anInt4929 != local35) {
				@Pc(139) int local139 = Static166.method2331(local31.aClass2_Sub1_Sub3_Sub1_2);
				if (local139 != local31.anInt4923) {
					if (local31.aClass5_Sub22_Sub2_4 != null) {
						Static119.aClass5_Sub22_Sub3_3.method3636(local31.aClass5_Sub22_Sub2_4);
						local31.aClass5_Sub22_Sub2_4 = null;
					}
					local31.anInt4923 = local139;
				}
				local31.anInt4929 = local35;
			}
			local31.anInt4921 = local31.aClass2_Sub1_Sub3_Sub1_2.anInt7500;
			local31.anInt4925 = local31.aClass2_Sub1_Sub3_Sub1_2.anInt7500 + (local31.aClass2_Sub1_Sub3_Sub1_2.method4913() << 6);
			local31.anInt4918 = local31.aClass2_Sub1_Sub3_Sub1_2.anInt7502;
			local31.anInt4930 = local31.aClass2_Sub1_Sub3_Sub1_2.anInt7502 + (local31.aClass2_Sub1_Sub3_Sub1_2.method4913() << 6);
			Static437.method5774(arg1, arg0, local31, arg2, arg3);
		}
		for (@Pc(222) Class5_Sub31 local222 = (Class5_Sub31) Static464.aClass252_39.method5660(); local222 != null; local222 = (Class5_Sub31) Static464.aClass252_39.method5666()) {
			@Pc(226) byte local226 = 1;
			@Pc(231) Class133 local231 = local222.aClass2_Sub1_Sub3_Sub2_2.method4910();
			if (local222.aClass2_Sub1_Sub3_Sub2_2.aBoolean410) {
				local226 = 0;
			} else if (local231.anInt3510 == local222.aClass2_Sub1_Sub3_Sub2_2.lb || local231.anInt3515 == local222.aClass2_Sub1_Sub3_Sub2_2.lb || local222.aClass2_Sub1_Sub3_Sub2_2.lb == local231.anInt3526 || local222.aClass2_Sub1_Sub3_Sub2_2.lb == local231.anInt3544) {
				local226 = 2;
			} else if (local222.aClass2_Sub1_Sub3_Sub2_2.lb == local231.anInt3507 || local222.aClass2_Sub1_Sub3_Sub2_2.lb == local231.anInt3542 || local231.anInt3513 == local222.aClass2_Sub1_Sub3_Sub2_2.lb || local231.anInt3532 == local222.aClass2_Sub1_Sub3_Sub2_2.lb) {
				local226 = 3;
			}
			if (local222.anInt4929 != local226) {
				@Pc(326) int local326 = Static132.method454(local222.aClass2_Sub1_Sub3_Sub2_2);
				if (local222.anInt4923 != local326) {
					if (local222.aClass5_Sub22_Sub2_4 != null) {
						Static119.aClass5_Sub22_Sub3_3.method3636(local222.aClass5_Sub22_Sub2_4);
						local222.aClass5_Sub22_Sub2_4 = null;
					}
					local222.anInt4923 = local326;
				}
				local222.anInt4929 = local226;
			}
			local222.anInt4921 = local222.aClass2_Sub1_Sub3_Sub2_2.anInt7500;
			local222.anInt4925 = local222.aClass2_Sub1_Sub3_Sub2_2.anInt7500 + (local222.aClass2_Sub1_Sub3_Sub2_2.method4913() << 6);
			local222.anInt4918 = local222.aClass2_Sub1_Sub3_Sub2_2.anInt7502;
			local222.anInt4930 = local222.aClass2_Sub1_Sub3_Sub2_2.anInt7502 + (local222.aClass2_Sub1_Sub3_Sub2_2.method4913() << 6);
			Static437.method5774(arg1, arg0, local222, arg2, arg3);
		}
	}
}
