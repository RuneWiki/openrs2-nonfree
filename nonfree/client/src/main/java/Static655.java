import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!uja", name = "x", descriptor = "I")
	public static int anInt10078 = -1;

	@OriginalMember(owner = "client!uja", name = "d", descriptor = "(I)V")
	public static void method8594() {
		Static539.method7146(Static334.aClass270_10);
		Static331.anInt5332++;
		if (Static633.aBoolean655 && Static512.aBoolean721) {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			if (Static347.aBoolean360) {
				local32 = Static308.method4570();
				local34 = Static541.method7180();
			}
			@Pc(51) int local51 = Static334.aClass18_1.method4192() + local32;
			@Pc(59) int local59 = local34 + Static334.aClass18_1.method4196();
			local51 -= Static323.anInt5198;
			local59 -= Static720.anInt11175;
			if (local51 < Static570.anInt8655) {
				local51 = Static570.anInt8655;
			}
			if (Static725.anInt11253 > local59) {
				local59 = Static725.anInt11253;
			}
			if (Static570.anInt8655 + Static309.aClass270_9.anInt7015 < Static334.aClass270_10.anInt7015 + local51) {
				local51 = Static309.aClass270_9.anInt7015 + Static570.anInt8655 - Static334.aClass270_10.anInt7015;
			}
			if (Static334.aClass270_10.anInt7045 + local59 > Static725.anInt11253 - -Static309.aClass270_9.anInt7045) {
				local59 = Static725.anInt11253 + Static309.aClass270_9.anInt7045 - Static334.aClass270_10.anInt7045;
			}
			@Pc(138) int local138 = Static309.aClass270_9.anInt6982 + local51 - Static570.anInt8655;
			@Pc(146) int local146 = Static309.aClass270_9.lb + local59 - Static725.anInt11253;
			@Pc(165) Class3_Sub41 local165;
			if (Static334.aClass18_1.method4194()) {
				if (Static331.anInt5332 > Static334.aClass270_10.anInt6979) {
					@Pc(253) int local253 = local51 - Static528.anInt8245;
					@Pc(258) int local258 = local59 - Static516.anInt8131;
					if (Static334.aClass270_10.anInt6999 < local253 || -Static334.aClass270_10.anInt6999 > local253 || Static334.aClass270_10.anInt6999 < local258 || -Static334.aClass270_10.anInt6999 > local258) {
						Static634.aBoolean657 = true;
					}
				}
				if (Static334.aClass270_10.anObjectArray6 != null && Static634.aBoolean657) {
					local165 = new Class3_Sub41();
					local165.anObjectArray4 = Static334.aClass270_10.anObjectArray6;
					local165.anInt6143 = local146;
					local165.anInt6145 = local138;
					local165.aClass270_12 = Static334.aClass270_10;
					Static540.method7160(local165);
				}
			} else {
				if (Static634.aBoolean657) {
					Static443.method5872();
					if (Static334.aClass270_10.anObjectArray24 != null) {
						local165 = new Class3_Sub41();
						local165.aClass270_12 = Static334.aClass270_10;
						local165.anInt6143 = local146;
						local165.aClass270_13 = Static21.aClass270_1;
						local165.anObjectArray4 = Static334.aClass270_10.anObjectArray24;
						local165.anInt6145 = local138;
						Static540.method7160(local165);
					}
					if (Static21.aClass270_1 != null && Static85.method1873(Static334.aClass270_10) != null) {
						Static279.method3943(Static21.aClass270_1, Static334.aClass270_10);
					}
				} else if ((Static639.anInt9892 == 1 || Static535.method9060()) && Static716.anInt11158 > 2) {
					Static498.method6804(Static528.anInt8245 + Static323.anInt5198, Static516.anInt8131 + Static720.anInt11175);
				} else if (Static557.method7275()) {
					Static498.method6804(Static528.anInt8245 + Static323.anInt5198, Static720.anInt11175 + Static516.anInt8131);
				}
				Static334.aClass270_10 = null;
			}
		} else if (Static331.anInt5332 > 1) {
			Static334.aClass270_10 = null;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIIII[B)V")
	public static void method8595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		arg2 += arg1;
		@Pc(26) int local26 = arg0 - arg1 >> 2;
		while (true) {
			local26--;
			if (local26 < 0) {
				local26 = arg0 - arg1 & 0x3;
				while (true) {
					local26--;
					if (local26 < 0) {
						return;
					}
					arg3[arg2++] = 1;
				}
			}
			@Pc(31) int local31 = arg2 + 1;
			arg3[arg2] = 1;
			@Pc(36) int local36 = local31 + 1;
			arg3[local31] = 1;
			@Pc(41) int local41 = local36 + 1;
			arg3[local36] = 1;
			arg2 = local41 + 1;
			arg3[local41] = 1;
		}
	}

	@OriginalMember(owner = "client!uja", name = "h", descriptor = "(I)V")
	public static void method8598() {
		Static607.anInt9201 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static718.aClass3_Sub2Array1[local9] = null;
			Static503.aByteArray80[local9] = 1;
			Static447.aClass121Array1[local9] = null;
		}
	}
}
