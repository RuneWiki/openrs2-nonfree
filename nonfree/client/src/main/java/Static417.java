import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!nu", name = "F", descriptor = "Lclient!nm;")
	public static Interface18 anInterface18_1;

	@OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
	public static int anInt6041;

	@OriginalMember(owner = "client!nu", name = "J", descriptor = "I")
	public static int anInt6044 = 0;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!wj;IIIIIIIIII)Z")
	public static boolean method5289(@OriginalArg(0) Class389 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg9;
		@Pc(17) int local17 = arg8 - 64;
		Static410.anIntArrayArray38[64][64] = 99;
		@Pc(28) int local28 = arg9 - 64;
		Static32.anIntArrayArray2[64][64] = 0;
		@Pc(36) byte local36 = 0;
		@Pc(43) int local43 = 0;
		Static219.anIntArray249[0] = arg8;
		@Pc(50) int local50 = local36 + 1;
		Static555.anIntArray598[0] = arg9;
		@Pc(55) int[][] local55 = arg0.anIntArrayArray64;
		while (local43 != local50) {
			local9 = Static555.anIntArray598[local43];
			local7 = Static219.anIntArray249[local43];
			local43 = local43 + 1 & 0xFFF;
			@Pc(77) int local77 = local7 - arg0.anInt10446;
			@Pc(82) int local82 = local9 - arg0.anInt10431;
			@Pc(87) int local87 = local7 - local17;
			@Pc(92) int local92 = local9 - local28;
			if (arg5 == -4) {
				if (local7 == arg2 && local9 == arg1) {
					Static437.anInt10168 = local9;
					Static54.anInt1253 = local7;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static65.method1433(local9, 1, arg7, arg2, 1, arg6, arg1, local7)) {
					Static54.anInt1253 = local7;
					Static437.anInt10168 = local9;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg0.method8812(arg7, arg6, 1, 1, local9, arg1, local7, arg4, arg2)) {
					Static437.anInt10168 = local9;
					Static54.anInt1253 = local7;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg0.method8808(arg7, 1, arg1, arg2, local7, arg6, local9, arg4)) {
					Static54.anInt1253 = local7;
					Static437.anInt10168 = local9;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg0.method8809(arg1, arg5, local9, arg2, local7, arg3, 1)) {
					Static54.anInt1253 = local7;
					Static437.anInt10168 = local9;
					return true;
				}
			} else if (arg0.method8804(arg2, local9, arg1, arg5, arg3, local7, 1)) {
				Static437.anInt10168 = local9;
				Static54.anInt1253 = local7;
				return true;
			}
			@Pc(251) int local251 = Static32.anIntArrayArray2[local87][local92] + 1;
			if (local87 > 0 && Static410.anIntArrayArray38[local87 - 1][local92] == 0 && (local55[local77 - 1][local82] & 0x42240000) == 0) {
				Static219.anIntArray249[local50] = local7 - 1;
				Static555.anIntArray598[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static410.anIntArrayArray38[local87 - 1][local92] = 2;
				Static32.anIntArrayArray2[local87 - 1][local92] = local251;
			}
			if (local87 < 127 && Static410.anIntArrayArray38[local87 + 1][local92] == 0 && (local55[local77 + 1][local82] & 0x60240000) == 0) {
				Static219.anIntArray249[local50] = local7 + 1;
				Static555.anIntArray598[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static410.anIntArrayArray38[local87 + 1][local92] = 8;
				Static32.anIntArrayArray2[local87 + 1][local92] = local251;
			}
			if (local92 > 0 && Static410.anIntArrayArray38[local87][local92 - 1] == 0 && (local55[local77][local82 - 1] & 0x40A40000) == 0) {
				Static219.anIntArray249[local50] = local7;
				Static555.anIntArray598[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static410.anIntArrayArray38[local87][local92 - 1] = 1;
				Static32.anIntArrayArray2[local87][local92 - 1] = local251;
			}
			if (local92 < 127 && Static410.anIntArrayArray38[local87][local92 + 1] == 0 && (local55[local77][local82 + 1] & 0x48240000) == 0) {
				Static219.anIntArray249[local50] = local7;
				Static555.anIntArray598[local50] = local9 + 1;
				Static410.anIntArrayArray38[local87][local92 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static32.anIntArrayArray2[local87][local92 + 1] = local251;
			}
			if (local87 > 0 && local92 > 0 && Static410.anIntArrayArray38[local87 - 1][local92 - 1] == 0 && (local55[local77 - 1][local82 - 1] & 0x43A40000) == 0 && (local55[local77 - 1][local82] & 0x42240000) == 0 && (local55[local77][local82 - 1] & 0x40A40000) == 0) {
				Static219.anIntArray249[local50] = local7 - 1;
				Static555.anIntArray598[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static410.anIntArrayArray38[local87 - 1][local92 - 1] = 3;
				Static32.anIntArrayArray2[local87 - 1][local92 - 1] = local251;
			}
			if (local87 < 127 && local92 > 0 && Static410.anIntArrayArray38[local87 + 1][local92 - 1] == 0 && (local55[local77 + 1][local82 - 1] & 0x60E40000) == 0 && (local55[local77 + 1][local82] & 0x60240000) == 0 && (local55[local77][local82 - 1] & 0x40A40000) == 0) {
				Static219.anIntArray249[local50] = local7 + 1;
				Static555.anIntArray598[local50] = local9 - 1;
				Static410.anIntArrayArray38[local87 + 1][local92 - 1] = 9;
				local50 = local50 + 1 & 0xFFF;
				Static32.anIntArrayArray2[local87 + 1][local92 - 1] = local251;
			}
			if (local87 > 0 && local92 < 127 && Static410.anIntArrayArray38[local87 - 1][local92 + 1] == 0 && (local55[local77 - 1][local82 + 1] & 0x4E240000) == 0 && (local55[local77 - 1][local82] & 0x42240000) == 0 && (local55[local77][local82 + 1] & 0x48240000) == 0) {
				Static219.anIntArray249[local50] = local7 - 1;
				Static555.anIntArray598[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static410.anIntArrayArray38[local87 - 1][local92 + 1] = 6;
				Static32.anIntArrayArray2[local87 - 1][local92 + 1] = local251;
			}
			if (local87 < 127 && local92 < 127 && Static410.anIntArrayArray38[local87 + 1][local92 + 1] == 0 && (local55[local77 + 1][local82 + 1] & 0x78240000) == 0 && (local55[local77 + 1][local82] & 0x60240000) == 0 && (local55[local77][local82 + 1] & 0x48240000) == 0) {
				Static219.anIntArray249[local50] = local7 + 1;
				Static555.anIntArray598[local50] = local9 + 1;
				Static410.anIntArrayArray38[local87 + 1][local92 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static32.anIntArrayArray2[local87 + 1][local92 + 1] = local251;
			}
		}
		Static437.anInt10168 = local9;
		Static54.anInt1253 = local7;
		return false;
	}

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)I")
	public static int method5291() {
		if (Static507.aClass199_12 == null) {
			if (!Static333.aBoolean400 && Static111.aClass4_Sub5_Sub17_2 != null) {
				return Static111.aClass4_Sub5_Sub17_2.anInt7672;
			}
			@Pc(27) int local27 = Static373.aClass161_1.method5903();
			@Pc(31) int local31 = Static373.aClass161_1.method5898();
			@Pc(47) int local47;
			@Pc(49) int local49;
			@Pc(61) int local61;
			@Pc(244) Class4_Sub5_Sub17 local244;
			if (Static19.aBoolean35) {
				@Pc(114) Class46 local114;
				if (local27 > Static357.anInt5417 && Static506.anInt7915 + Static357.anInt5417 > local27) {
					local47 = -1;
					for (local49 = 0; local49 < Static579.anInt8938; local49++) {
						if (Static523.aBoolean633) {
							local61 = local49 * 16 + Static430.anInt6771 + 33;
							if (local31 > local61 - 13 && local31 <= local61 + 3) {
								local47 = local49;
							}
						} else {
							local61 = local49 * 16 + Static430.anInt6771 + 31;
							if (local61 - 13 < local31 && local31 <= local61 + 3) {
								local47 = local49;
							}
						}
					}
					if (local47 != -1) {
						local61 = 0;
						local114 = new Class46(Static256.aClass367_3);
						for (@Pc(119) Class4_Sub5_Sub12 local119 = (Class4_Sub5_Sub12) local114.method1495(); local119 != null; local119 = (Class4_Sub5_Sub12) local114.method1496()) {
							if (local47 == local61++) {
								return ((Class4_Sub5_Sub17) local119.aClass367_5.aClass4_Sub5_58.aClass4_Sub5_67).anInt7672;
							}
						}
					}
				} else if (Static581.aClass4_Sub5_Sub12_1 != null && Static398.anInt5803 < local27 && local27 < Static4.anInt76 + Static398.anInt5803) {
					local47 = -1;
					for (local49 = 0; local49 < Static581.aClass4_Sub5_Sub12_1.anInt4687; local49++) {
						if (Static523.aBoolean633) {
							local61 = local49 * 16 + Static587.anInt9057 + 33;
							if (local31 > local61 - 13 && local61 + 3 >= local31) {
								local47 = local49;
							}
						} else {
							local61 = Static587.anInt9057 + local49 * 16 + 31;
							if (local61 - 13 < local31 && local61 + 3 >= local31) {
								local47 = local49;
							}
						}
					}
					if (local47 != -1) {
						local61 = 0;
						local114 = new Class46(Static581.aClass4_Sub5_Sub12_1.aClass367_5);
						for (local244 = (Class4_Sub5_Sub17) local114.method1495(); local244 != null; local244 = (Class4_Sub5_Sub17) local114.method1496()) {
							if (local61++ == local47) {
								return local244.anInt7672;
							}
						}
					}
				}
			} else if (Static357.anInt5417 < local27 && local27 < Static357.anInt5417 + Static506.anInt7915) {
				local47 = -1;
				for (local49 = 0; local49 < Static574.anInt8895; local49++) {
					if (Static523.aBoolean633) {
						local61 = Static430.anInt6771 + (-local49 + -1 + Static574.anInt8895) * 16 + 33;
						if (local31 > local61 - 13 && local31 <= local61 + 3) {
							local47 = local49;
						}
					} else {
						local61 = Static430.anInt6771 + (Static574.anInt8895 - local49 - 1) * 16 + 31;
						if (local61 - 13 < local31 && local31 <= local61 + 3) {
							local47 = local49;
						}
					}
				}
				if (local47 != -1) {
					local61 = 0;
					@Pc(358) Class232 local358 = new Class232(Static87.aClass163_14);
					for (local244 = (Class4_Sub5_Sub17) local358.method4933(); local244 != null; local244 = (Class4_Sub5_Sub17) local358.method4932()) {
						if (local47 == local61++) {
							return local244.anInt7672;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIILclient!bga;Lclient!bga;)V")
	public static void method5292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub3 arg3, @OriginalArg(4) Class3_Sub1_Sub3 arg4) {
		@Pc(4) Class73 local4 = Static558.method7416(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass3_Sub1_Sub3_1 = arg3;
		local4.aClass3_Sub1_Sub3_2 = arg4;
		@Pc(19) int local19 = Static140.aClass42Array4 == Static146.aClass42Array3 ? 1 : 0;
		if (!arg3.method8500()) {
			arg3.aClass3_Sub1_23 = Static596.aClass3_Sub1Array4[local19];
			Static596.aClass3_Sub1Array4[local19] = arg3;
		} else if (arg3.method8501()) {
			arg3.aClass3_Sub1_23 = Static506.aClass3_Sub1Array3[local19];
			Static506.aClass3_Sub1Array3[local19] = arg3;
		} else {
			arg3.aClass3_Sub1_23 = Static114.aClass3_Sub1Array1[local19];
			Static114.aClass3_Sub1Array1[local19] = arg3;
			Static42.aBoolean73 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8500()) {
			if (arg4.method8501()) {
				arg4.aClass3_Sub1_23 = Static506.aClass3_Sub1Array3[local19];
				Static506.aClass3_Sub1Array3[local19] = arg4;
				return;
			}
			arg4.aClass3_Sub1_23 = Static114.aClass3_Sub1Array1[local19];
			Static114.aClass3_Sub1Array1[local19] = arg4;
			Static42.aBoolean73 = true;
			return;
		}
		arg4.aClass3_Sub1_23 = Static596.aClass3_Sub1Array4[local19];
		Static596.aClass3_Sub1Array4[local19] = arg4;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method5293(@OriginalArg(0) String arg0) {
		Static388.method5002("", arg0, "", "", 4, 0);
	}
}
