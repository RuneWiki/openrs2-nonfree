import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!ub", name = "Y", descriptor = "[I")
	public static int[] anIntArray328;

	@OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
	public static int anInt3997 = 127;

	@OriginalMember(owner = "client!ub", name = "lb", descriptor = "[I")
	public static final int[] anIntArray329 = new int[2000];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILclient!ab;I)[Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5[] method2996(@OriginalArg(0) int arg0, @OriginalArg(2) Class3 arg1, @OriginalArg(3) int arg2) {
		return Static42.method736(arg1, arg2, arg0) ? Static201.method3331() : null;
	}

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)V")
	public static void method2999() {
		for (@Pc(3) int local3 = 0; local3 < Static45.anInt1163; local3++) {
			@Pc(9) int local9 = Static87.anIntArray158[local3]--;
			if (Static87.anIntArray158[local3] >= -10) {
				@Pc(82) Class4 local82 = Static82.aClass4Array1[local3];
				if (local82 == null) {
					local82 = Static211.method91(Static140.aClass3_Sub1_20, Static110.anIntArray177[local3], 0);
					if (local82 == null) {
						continue;
					}
					Static87.anIntArray158[local3] += local82.method90();
					Static82.aClass4Array1[local3] = local82;
				}
				if (Static87.anIntArray158[local3] < 0) {
					@Pc(204) int local204;
					if (Static63.anIntArray307[local3] == 0) {
						local204 = Static123.anInt2601;
					} else {
						@Pc(128) int local128 = Static63.anIntArray307[local3] >> 16 & 0xFF;
						@Pc(136) int local136 = (Static63.anIntArray307[local3] & 0xFF) * 128;
						@Pc(146) int local146 = local128 * 128 + 64 - Static15.aClass8_Sub3_Sub1_1.anInt3600;
						if (local146 < 0) {
							local146 = -local146;
						}
						@Pc(159) int local159 = Static63.anIntArray307[local3] >> 8 & 0xFF;
						@Pc(169) int local169 = local159 * 128 + 64 - Static15.aClass8_Sub3_Sub1_1.anInt3606;
						if (local169 < 0) {
							local169 = -local169;
						}
						@Pc(183) int local183 = local169 + local146 - 128;
						if (local136 < local183) {
							Static87.anIntArray158[local3] = -100;
							continue;
						}
						if (local183 < 0) {
							local183 = 0;
						}
						local204 = anInt3997 * (local136 - local183) / local136;
					}
					if (local204 > 0) {
						@Pc(218) Class1_Sub22_Sub1 local218 = local82.method88().method2312(Static163.aClass18_3);
						@Pc(223) Class1_Sub12_Sub4 local223 = Static217.method2762(local218, local204);
						local223.method2772(Static105.anIntArray172[local3] - 1);
						Static16.aClass1_Sub12_Sub2_2.method1609(local223);
					}
					Static87.anIntArray158[local3] = -100;
				}
			} else {
				Static45.anInt1163--;
				for (@Pc(25) int local25 = local3; local25 < Static45.anInt1163; local25++) {
					Static110.anIntArray177[local25] = Static110.anIntArray177[local25 + 1];
					Static82.aClass4Array1[local25] = Static82.aClass4Array1[local25 + 1];
					Static105.anIntArray172[local25] = Static105.anIntArray172[local25 + 1];
					Static87.anIntArray158[local25] = Static87.anIntArray158[local25 + 1];
					Static63.anIntArray307[local25] = Static63.anIntArray307[local25 + 1];
				}
				local3--;
			}
		}
		if (Static156.aBoolean183 && !Static77.method1167()) {
			if (Static22.anInt552 != 0 && Static170.anInt3548 != -1) {
				Static99.method3061(Static22.anInt552, Static170.anInt3548, Static166.aClass3_Sub1_23);
			}
			Static156.aBoolean183 = false;
		} else if (Static22.anInt552 != 0 && Static170.anInt3548 != -1 && !Static77.method1167()) {
			Static38.aClass1_Sub14_Sub1_3.method3067(175);
			Static38.aClass1_Sub14_Sub1_3.method3032(Static170.anInt3548);
			Static170.anInt3548 = -1;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIBI)I")
	public static int method3000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg3 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(21) int local21 = arg4;
			arg4 = arg5;
			arg5 = local21;
		}
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return 1 + 7 - arg4 - arg1;
		} else if (local12 == 2) {
			return 7 + 1 - arg0 - arg5;
		} else {
			return arg1;
		}
	}
}
