import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
	public static int anInt244 = -2;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBI)V")
	public static void method227(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static265.aClass63_4 == Static156.aClass63_2) {
			if (!Static552.method8051(arg0, 1, false, 1, 0, -2, arg1, 0)) {
				Static552.method8051(arg0, 1, false, 1, 0, -3, arg1, 0);
			}
		} else if (!Static552.method8051(arg0, 1, false, 1, 0, -3, arg1, 0)) {
			Static552.method8051(arg0, 1, false, 1, 0, -2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
	public static void method228() {
		Static412.anInt7175 = Static257.aClass5_Sub22_Sub1_1.method5967();
		@Pc(18) int local18 = Static257.aClass5_Sub22_Sub1_1.method5968();
		@Pc(22) int local22 = Static257.aClass5_Sub22_Sub1_1.method5903();
		@Pc(26) int local26 = Static257.aClass5_Sub22_Sub1_1.method5917();
		@Pc(35) boolean local35 = Static257.aClass5_Sub22_Sub1_1.method5903() == 1;
		Static256.method4232();
		Static623.method8836(local22);
		Static257.aClass5_Sub22_Sub1_1.method2658();
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(60) int local60;
		for (@Pc(45) int local45 = 0; local45 < 4; local45++) {
			for (local49 = 0; local49 < Static326.anInt5541 >> 3; local49++) {
				for (local53 = 0; local53 < Static448.anInt7637 >> 3; local53++) {
					local60 = Static257.aClass5_Sub22_Sub1_1.method2655(1);
					if (local60 == 1) {
						Static269.anIntArrayArrayArray4[local45][local49][local53] = Static257.aClass5_Sub22_Sub1_1.method2655(26);
					} else {
						Static269.anIntArrayArrayArray4[local45][local49][local53] = -1;
					}
				}
			}
		}
		Static257.aClass5_Sub22_Sub1_1.method2659();
		local49 = (Static50.anInt1005 - Static257.aClass5_Sub22_Sub1_1.anInt6629) / 16;
		Static275.anIntArrayArray30 = new int[local49][4];
		for (local53 = 0; local53 < local49; local53++) {
			for (local60 = 0; local60 < 4; local60++) {
				Static275.anIntArrayArray30[local53][local60] = Static257.aClass5_Sub22_Sub1_1.method5913();
			}
		}
		Static499.anIntArray574 = new int[local49];
		Static641.aByteArrayArray31 = new byte[local49][];
		Static172.aByteArrayArray8 = new byte[local49][];
		Static108.anIntArray127 = new int[local49];
		Static511.aByteArrayArray22 = new byte[local49][];
		Static518.anIntArray491 = new int[local49];
		Static136.anIntArray144 = null;
		Static239.anIntArray219 = new int[local49];
		Static312.anIntArray597 = new int[local49];
		Static499.aByteArrayArray26 = new byte[local49][];
		Static598.aByteArrayArray28 = null;
		local49 = 0;
		for (local60 = 0; local60 < 4; local60++) {
			for (@Pc(184) int local184 = 0; local184 < Static326.anInt5541 >> 3; local184++) {
				for (@Pc(188) int local188 = 0; local188 < Static448.anInt7637 >> 3; local188++) {
					@Pc(198) int local198 = Static269.anIntArrayArrayArray4[local60][local184][local188];
					if (local198 != -1) {
						@Pc(207) int local207 = local198 >> 14 & 0x3FF;
						@Pc(213) int local213 = local198 >> 3 & 0x7FF;
						@Pc(223) int local223 = local213 / 8 + (local207 / 8 << 8);
						for (@Pc(225) int local225 = 0; local225 < local49; local225++) {
							if (Static312.anIntArray597[local225] == local223) {
								local223 = -1;
								break;
							}
						}
						if (local223 != -1) {
							Static312.anIntArray597[local49] = local223;
							@Pc(258) int local258 = local223 >> 8 & 0xFF;
							@Pc(262) int local262 = local223 & 0xFF;
							Static518.anIntArray491[local49] = Static17.aClass207_6.method4686("m" + local258 + "_" + local262);
							Static499.anIntArray574[local49] = Static17.aClass207_6.method4686("l" + local258 + "_" + local262);
							Static239.anIntArray219[local49] = Static17.aClass207_6.method4686("um" + local258 + "_" + local262);
							Static108.anIntArray127[local49] = Static17.aClass207_6.method4686("ul" + local258 + "_" + local262);
							local49++;
						}
					}
				}
			}
		}
		Static303.method4735(local35, 11, local18, local26);
	}
}
