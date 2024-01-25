import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!dp", name = "r", descriptor = "J")
	public static long aLong65;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!nb;Z)V")
	public static void method2112(@OriginalArg(0) Class28_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort125; local2 <= arg0.aShort124; local2++) {
			for (@Pc(6) int local6 = arg0.aShort123; local6 <= arg0.aShort122; local6++) {
				@Pc(16) Class164 local16 = Static15.aClass164ArrayArrayArray5[arg0.aByte174][local2][local6];
				if (local16 != null) {
					@Pc(21) Class125 local21 = local16.aClass125_2;
					@Pc(23) Class125 local23 = null;
					while (local21 != null) {
						if (local21.aClass28_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass125_2 = local21.aClass125_1;
							} else {
								local23.aClass125_1 = local21.aClass125_1;
							}
							local21.method3656();
							break;
						}
						local23 = local21;
						local21 = local21.aClass125_1;
					}
				}
			}
		}
		if (!arg1) {
			Static346.method5177(arg0);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIZIIII)V")
	public static void method2113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg2 < 512 || arg0 < 512 || Static158.anInt927 * 512 - 1024 < arg2 || (Static515.anInt8292 - 2) * 512 < arg0) {
			Static396.anIntArray551[0] = Static396.anIntArray551[1] = -1;
			return;
		}
		@Pc(49) int local49 = Static168.method3058(arg4, arg2, arg0) - arg1;
		if (Static82.aBoolean134) {
			Static60.method1290(true);
		} else {
			Static63.aClass239_1.method9244(arg5, 0, 0);
			Static674.aClass13_22.method8501(Static63.aClass239_1);
		}
		if (Static443.aBoolean515) {
			Static674.aClass13_22.HA(arg2, local49, arg0, Static675.anInt10880, Static396.anIntArray551);
		} else {
			Static674.aClass13_22.da(arg2, local49, arg0, Static396.anIntArray551);
		}
		if (Static82.aBoolean134) {
			Static439.method6264();
		} else {
			Static63.aClass239_1.method9244(-arg5, 0, 0);
			Static674.aClass13_22.method8501(Static63.aClass239_1);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2114(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static629.method8792(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static94.anInt1782; local25++) {
			@Pc(31) String local31 = Static134.aStringArray7[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static629.method8792(local31);
			if (local31 != null && local31.equals(local20)) {
				Static94.anInt1782--;
				for (@Pc(57) int local57 = local25; local57 < Static94.anInt1782; local57++) {
					Static134.aStringArray7[local57] = Static134.aStringArray7[local57 + 1];
					Static166.aStringArray8[local57] = Static166.aStringArray8[local57 + 1];
					Static271.aStringArray31[local57] = Static271.aStringArray31[local57 + 1];
					Static27.aStringArray1[local57] = Static27.aStringArray1[local57 + 1];
					Static119.aBooleanArray10[local57] = Static119.aBooleanArray10[local57 + 1];
				}
				Static68.anInt1315 = Static629.anInt10041;
				@Pc(118) Class3_Sub34 local118 = Static172.method3123(Static163.aClass375_1, Static575.aClass218_136);
				local118.aClass3_Sub25_Sub1_2.method8614(Static440.method6269(arg0));
				local118.aClass3_Sub25_Sub1_2.method8583(arg0);
				Static441.method6275(local118);
				return;
			}
		}
	}
}
