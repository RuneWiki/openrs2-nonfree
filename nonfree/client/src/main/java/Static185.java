import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(III)Z")
	public static boolean method3503(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method3504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < 1 || arg1 < 1 || arg5 > Static118.anInt2527 - 2 || arg1 > Static549.anInt9482 - 2) {
			return;
		}
		@Pc(26) int local26 = arg4;
		if (arg4 < 3 && Static307.method4073(arg5, arg1)) {
			local26 = arg4 + 1;
		}
		if (!Static7.aClass3_Sub15_Sub1_1.method6954(Static382.anInt7091) && !Static151.method2599(arg5, arg1, Static445.anInt8174, local26)) {
			return;
		}
		if (Static279.aClass290ArrayArrayArray7 == null) {
			return;
		}
		Static143.aClass85_Sub1_1.method2294(Static121.aClass5_7, Static95.aClass306Array1[arg4], arg1, arg4, arg5, arg2);
		if (arg0 < 0) {
			return;
		}
		@Pc(69) boolean local69 = Static7.aClass3_Sub15_Sub1_1.aBoolean605;
		Static7.aClass3_Sub15_Sub1_1.aBoolean605 = true;
		Static143.aClass85_Sub1_1.method2299(Static121.aClass5_7, local26, arg7, arg0, arg6, arg1, arg5, arg3, Static95.aClass306Array1[arg4], arg4);
		Static7.aClass3_Sub15_Sub1_1.aBoolean605 = local69;
		return;
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V")
	public static void method3505() {
		@Pc(8) int local8 = Static521.aByteArrayArray29.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static521.aByteArrayArray29[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static112.anInt7489; local20++) {
					if (Static117.anIntArray256[local20] == Static467.anIntArray715[local10]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static117.anIntArray256[Static112.anInt7489] = Static467.anIntArray715[local10];
					local18 = Static112.anInt7489++;
				}
				@Pc(64) Class3_Sub27 local64 = new Class3_Sub27(Static521.aByteArrayArray29[local10]);
				@Pc(66) int local66 = 0;
				while (local64.anInt9191 < Static521.aByteArrayArray29[local10].length && local66 < 511 && Static221.anInt4798 < 1023) {
					@Pc(83) int local83 = local18 | local66++ << 6;
					@Pc(87) int local87 = local64.method7591();
					@Pc(91) int local91 = local87 >> 14;
					@Pc(97) int local97 = local87 >> 7 & 0x3F;
					@Pc(101) int local101 = local87 & 0x3F;
					@Pc(114) int local114 = (Static467.anIntArray715[local10] >> 8) * 64 + local97 - Static223.anInt4827;
					@Pc(127) int local127 = local101 + (Static467.anIntArray715[local10] & 0xFF) * 64 - Static150.anInt3027;
					@Pc(134) Class230 local134 = Static345.aClass154_1.method4157(local64.method7591());
					@Pc(141) Class3_Sub3 local141 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local83);
					if (local141 == null && (local134.aByte57 & 0x1) > 0 && local91 == Static445.anInt8174 && local114 >= 0 && Static118.anInt2527 > local134.anInt7040 + local114 && local127 >= 0 && local127 + local134.anInt7040 < Static549.anInt9482) {
						@Pc(182) Class6_Sub1_Sub2_Sub2 local182 = new Class6_Sub1_Sub2_Sub2();
						local182.anInt8587 = local83;
						@Pc(190) Class3_Sub3 local190 = new Class3_Sub3(local182);
						Static240.aClass267_20.method6640(local190, (long) local83);
						Static47.aClass3_Sub3Array4[Static183.anInt5938++] = local190;
						Static3.anIntArray80[Static221.anInt4798++] = local83;
						local182.lb = Static223.anInt4829;
						local182.method7096(local134);
						local182.method7087(local182.aClass230_1.anInt7040);
						local182.anInt8594 = local182.aClass230_1.anInt7057 << 3;
						local182.method7079((local182.aClass230_1.aByte58 + 4 & 0xF4600007) << 11, true);
						local182.method7092(local114, true, local182.method7083(), local127, local91);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILclient!d;)V")
	public static void method3506(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1) {
		Static511.aClass52Array3[arg0] = arg1;
	}
}
