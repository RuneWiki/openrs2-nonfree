import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "Lclient!gm;")
	public static Class128 aClass128_3;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(JJ)J")
	public static long method4391(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "(B)V")
	public static void method4392() {
		@Pc(14) boolean local14 = Static30.aClass3_Sub3_Sub2_1.method4243() == 1;
		@Pc(18) int local18 = Static30.aClass3_Sub3_Sub2_1.method4243();
		@Pc(22) int local22 = Static30.aClass3_Sub3_Sub2_1.method4231();
		@Pc(26) int local26 = Static30.aClass3_Sub3_Sub2_1.method4236();
		Static402.anInt7435 = Static30.aClass3_Sub3_Sub2_1.method4225();
		Static315.method5161();
		Static327.method5315(local18);
		Static30.aClass3_Sub3_Sub2_1.method4273();
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(55) int local55;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local44 = 0; local44 < Static634.anInt10129 >> 3; local44++) {
				for (local48 = 0; local48 < Static638.anInt10172 >> 3; local48++) {
					local55 = Static30.aClass3_Sub3_Sub2_1.method4276(1);
					if (local55 == 1) {
						Static193.anIntArrayArrayArray10[local40][local44][local48] = Static30.aClass3_Sub3_Sub2_1.method4276(26);
					} else {
						Static193.anIntArrayArrayArray10[local40][local44][local48] = -1;
					}
				}
			}
		}
		Static30.aClass3_Sub3_Sub2_1.method4278();
		local44 = (Static272.anInt4948 - Static30.aClass3_Sub3_Sub2_1.anInt4736) / 16;
		Static559.anIntArrayArray59 = new int[local44][4];
		for (local48 = 0; local48 < local44; local48++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static559.anIntArrayArray59[local48][local55] = Static30.aClass3_Sub3_Sub2_1.method4207();
			}
		}
		Static276.anIntArray264 = null;
		Static351.anIntArray405 = new int[local44];
		Static419.aByteArrayArray26 = new byte[local44][];
		Static145.aByteArrayArray5 = new byte[local44][];
		Static349.aByteArrayArray19 = null;
		Static29.aByteArrayArray1 = new byte[local44][];
		Static593.anIntArray631 = new int[local44];
		Static156.aByteArrayArray17 = new byte[local44][];
		Static238.anIntArray235 = new int[local44];
		Static363.anIntArray57 = new int[local44];
		Static438.anIntArray481 = new int[local44];
		local44 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(186) int local186 = 0; local186 < Static634.anInt10129 >> 3; local186++) {
				for (@Pc(190) int local190 = 0; local190 < Static638.anInt10172 >> 3; local190++) {
					@Pc(200) int local200 = Static193.anIntArrayArrayArray10[local55][local186][local190];
					if (local200 != -1) {
						@Pc(210) int local210 = local200 >> 14 & 0x3FF;
						@Pc(216) int local216 = local200 >> 3 & 0x7FF;
						@Pc(226) int local226 = local216 / 8 + (local210 / 8 << 8);
						for (@Pc(228) int local228 = 0; local228 < local44; local228++) {
							if (local226 == Static351.anIntArray405[local228]) {
								local226 = -1;
								break;
							}
						}
						if (local226 != -1) {
							Static351.anIntArray405[local44] = local226;
							@Pc(256) int local256 = local226 >> 8 & 0xFF;
							@Pc(260) int local260 = local226 & 0xFF;
							Static593.anIntArray631[local44] = Static395.aClass196_80.method5104("m" + local256 + "_" + local260);
							Static363.anIntArray57[local44] = Static395.aClass196_80.method5104("l" + local256 + "_" + local260);
							Static438.anIntArray481[local44] = Static395.aClass196_80.method5104("um" + local256 + "_" + local260);
							Static238.anIntArray235[local44] = Static395.aClass196_80.method5104("ul" + local256 + "_" + local260);
							local44++;
						}
					}
				}
			}
		}
		Static607.method8701(local22, 11, local26, local14);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
	public static void method4393(@OriginalArg(1) int arg0) {
		Static307.aLong177 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(Z)V")
	public static void method4397() {
		Static605.aClass102_62.method2681();
		Static174.aClass102_21.method2681();
		Static402.aClass102_43.method2681();
		Static434.aClass102_45.method2681();
	}
}
