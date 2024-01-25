import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!haa;")
	public static Class127 aClass127_13;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!sv;")
	public static Class315 aClass315_1;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Z")
	public static boolean aBoolean560 = false;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BIIII)V")
	public static void method5893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static491.anInt7787 / (float) Static491.anInt7789;
		@Pc(11) int local11 = arg1;
		@Pc(23) int local23 = arg3;
		if (local9 < 1.0F) {
			local23 = (int) ((float) arg1 * local9);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(50) int local50 = arg0 - (arg3 - local23) / 2;
		@Pc(59) int local59 = arg2 - (arg1 - local11) / 2;
		Static457.anInt8209 = Static491.anInt7787 - local50 * Static491.anInt7787 / local23;
		Static315.anInt6316 = -1;
		Static181.anInt3980 = -1;
		Static468.anInt8336 = local59 * Static491.anInt7789 / local11;
		Static226.method4129();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!jha;ZILclient!jha;)I")
	public static int method5895(@OriginalArg(0) int arg0, @OriginalArg(1) Class67_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class67_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg0 == 1) {
			local11 = arg1.anInt5765;
			local14 = arg3.anInt5765;
			if (!arg2) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg0 == 2) {
			return Static574.method8009(arg1.method4836().aString47, arg3.method4836().aString47, Static638.anInt10709);
		} else if (arg0 == 3) {
			if (arg1.aString58.equals("-")) {
				if (arg3.aString58.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString58.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static574.method8009(arg1.aString58, arg3.aString58, Static638.anInt10709);
			}
		} else if (arg0 == 4) {
			if (arg1.method4830()) {
				return arg3.method4830() ? 0 : 1;
			} else if (arg3.method4830()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg1.method4828()) {
				return arg3.method4828() ? 0 : 1;
			} else if (arg3.method4828()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg1.method4831()) {
				return arg3.method4831() ? 0 : 1;
			} else if (arg3.method4831()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg1.method4832()) {
				return arg3.method4832() ? 0 : 1;
			} else if (arg3.method4832()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local11 = arg1.anInt5771;
			local14 = arg3.anInt5771;
			if (arg2) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg1.anInt5773 - arg3.anInt5773;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILclient!ha;IBI)V")
	public static void method5896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg2.KA(arg0, arg3, arg0 + arg1, arg4 + arg3);
		arg2.method6123(arg1, arg4, arg3, -16777216, arg0);
		if (Static382.anInt7220 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static491.anInt7787 / (float) Static491.anInt7789;
		@Pc(37) int local37 = arg1;
		@Pc(39) int local39 = arg4;
		if (local35 < 1.0F) {
			local39 = (int) ((float) arg1 * local35);
		} else {
			local37 = (int) ((float) arg4 / local35);
		}
		@Pc(65) int local65 = arg0 + (arg1 - local37) / 2;
		@Pc(74) int local74 = arg3 + (arg4 - local39) / 2;
		if (Static291.aClass4_13 == null || Static291.aClass4_13.method7697() != arg1 || arg4 != Static291.aClass4_13.method7694()) {
			Static491.method6578(Static491.anInt7783, Static491.anInt7785 + Static491.anInt7787, Static491.anInt7789 + Static491.anInt7783, Static491.anInt7785, local65, local74, local65 + local37, local39 + local74);
			Static491.method6579(arg2);
			Static291.aClass4_13 = arg2.method6160(local65, local74, local37, local39, false);
		}
		Static291.aClass4_13.method7698(local65, local74);
		@Pc(126) int local126 = local37 * Static1.anInt7047 / Static491.anInt7789;
		@Pc(132) int local132 = Static560.anInt9628 * local39 / Static491.anInt7787;
		@Pc(140) int local140 = Static308.anInt6199 * local37 / Static491.anInt7789 + local65;
		@Pc(154) int local154 = local39 + local74 - local132 - Static411.anInt7649 * local39 / Static491.anInt7787;
		@Pc(156) int local156 = -1996554240;
		if (Static8.aClass290_1 == Static25.aClass290_5) {
			local156 = -1996488705;
		}
		arg2.aa(local140, local154, local126, local132, local156, 1);
		arg2.method6142(local140, local154, local126, local132, local156, 0);
		if (Static591.anInt9999 <= 0) {
			return;
		}
		@Pc(186) int local186;
		if (Static502.anInt7199 <= 50) {
			local186 = Static502.anInt7199 * 5;
		} else {
			local186 = 500 - Static502.anInt7199 * 5;
		}
		for (@Pc(200) Class6_Sub48 local200 = (Class6_Sub48) Static491.aClass163_49.method4966(); local200 != null; local200 = (Class6_Sub48) Static491.aClass163_49.method4965()) {
			@Pc(208) Class36 local208 = Static491.aClass345_4.method8044(local200.anInt9722);
			if (Static160.method3124(local208)) {
				@Pc(227) int local227;
				@Pc(240) int local240;
				if (Static246.anInt5375 == local200.anInt9722) {
					local227 = local65 + local37 * local200.anInt9726 / Static491.anInt7789;
					local240 = local74 + (Static491.anInt7787 - local200.anInt9721) * local39 / Static491.anInt7787;
					arg2.method6123(4, 4, local240 - 2, local186 << 24 | 0xFFFF00, local227 - 2);
				} else if (Static451.anInt9272 != -1 && Static451.anInt9272 == local208.anInt1754) {
					local227 = local37 * local200.anInt9726 / Static491.anInt7789 + local65;
					local240 = local39 * (Static491.anInt7787 - local200.anInt9721) / Static491.anInt7787 + local74;
					arg2.method6123(4, 4, local240 - 2, local186 << 24 | 0xFFFF00, local227 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
	public static void method5898() {
		if (Static161.aString37.toLowerCase().indexOf("microsoft") != -1) {
			Static160.anIntArray161[192] = 58;
			Static160.anIntArray161[191] = 73;
			Static160.anIntArray161[220] = 74;
			Static160.anIntArray161[221] = 43;
			Static160.anIntArray161[188] = 71;
			Static160.anIntArray161[190] = 72;
			Static160.anIntArray161[189] = 26;
			Static160.anIntArray161[223] = 28;
			Static160.anIntArray161[187] = 27;
			Static160.anIntArray161[219] = 42;
			Static160.anIntArray161[222] = 59;
			Static160.anIntArray161[186] = 57;
			return;
		}
		Static160.anIntArray161[45] = 26;
		Static160.anIntArray161[92] = 74;
		Static160.anIntArray161[46] = 72;
		Static160.anIntArray161[59] = 57;
		Static160.anIntArray161[47] = 73;
		Static160.anIntArray161[91] = 42;
		if (Static161.aMethod2 == null) {
			Static160.anIntArray161[222] = 59;
			Static160.anIntArray161[192] = 58;
		} else {
			Static160.anIntArray161[222] = 58;
			Static160.anIntArray161[520] = 59;
			Static160.anIntArray161[192] = 28;
		}
		Static160.anIntArray161[61] = 27;
		Static160.anIntArray161[93] = 43;
		Static160.anIntArray161[44] = 71;
	}
}
