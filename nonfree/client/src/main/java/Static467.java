import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!tda", name = "K", descriptor = "S")
	public static short aShort101 = 256;

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "(I)V")
	public static void method7013() {
		@Pc(9) int local9 = Static394.aClass12_Sub8_Sub2_2.method5199();
		Static184.anInt4228 = Static394.aClass12_Sub8_Sub2_2.method5216();
		@Pc(17) int local17 = Static394.aClass12_Sub8_Sub2_2.method5202();
		@Pc(26) boolean local26 = Static394.aClass12_Sub8_Sub2_2.method5216() == 1;
		@Pc(30) int local30 = Static394.aClass12_Sub8_Sub2_2.method5210();
		Static300.method4833();
		Static305.method4966(local17);
		Static394.aClass12_Sub8_Sub2_2.method5241();
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(55) int local55;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local44 = 0; local44 < Static37.anInt7512 >> 3; local44++) {
				for (local48 = 0; local48 < Static329.anInt6247 >> 3; local48++) {
					local55 = Static394.aClass12_Sub8_Sub2_2.method5238(1);
					if (local55 == 1) {
						Static116.anIntArrayArrayArray2[local40][local44][local48] = Static394.aClass12_Sub8_Sub2_2.method5238(26);
					} else {
						Static116.anIntArrayArrayArray2[local40][local44][local48] = -1;
					}
				}
			}
		}
		Static394.aClass12_Sub8_Sub2_2.method5240();
		local44 = (Static331.anInt6307 - Static394.aClass12_Sub8_Sub2_2.anInt6217) / 16;
		Static174.anIntArrayArray38 = new int[local44][4];
		for (local48 = 0; local48 < local44; local48++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static174.anIntArrayArray38[local48][local55] = Static394.aClass12_Sub8_Sub2_2.method5225();
			}
		}
		Static143.anIntArray236 = new int[local44];
		Static13.anIntArray19 = null;
		Static100.anIntArray203 = new int[local44];
		Static120.anIntArray222 = new int[local44];
		Static73.aByteArrayArray4 = new byte[local44][];
		Static344.aByteArrayArray18 = new byte[local44][];
		Static395.anIntArray494 = new int[local44];
		Static28.aByteArrayArray10 = new byte[local44][];
		Static443.anIntArray607 = new int[local44];
		Static230.aByteArrayArray9 = null;
		Static427.aByteArrayArray26 = new byte[local44][];
		local44 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(180) int local180 = 0; local180 < Static37.anInt7512 >> 3; local180++) {
				for (@Pc(184) int local184 = 0; local184 < Static329.anInt6247 >> 3; local184++) {
					@Pc(194) int local194 = Static116.anIntArrayArrayArray2[local55][local180][local184];
					if (local194 != -1) {
						@Pc(204) int local204 = local194 >> 14 & 0x3FF;
						@Pc(210) int local210 = local194 >> 3 & 0x7FF;
						@Pc(220) int local220 = local210 / 8 + (local204 / 8 << 8);
						for (@Pc(222) int local222 = 0; local222 < local44; local222++) {
							if (local220 == Static443.anIntArray607[local222]) {
								local220 = -1;
								break;
							}
						}
						if (local220 != -1) {
							Static443.anIntArray607[local44] = local220;
							@Pc(254) int local254 = local220 >> 8 & 0xFF;
							@Pc(258) int local258 = local220 & 0xFF;
							Static120.anIntArray222[local44] = Static129.aClass16_119.method420("m" + local254 + "_" + local258);
							Static100.anIntArray203[local44] = Static129.aClass16_119.method420("l" + local254 + "_" + local258);
							Static395.anIntArray494[local44] = Static129.aClass16_119.method420("um" + local254 + "_" + local258);
							Static143.anIntArray236[local44] = Static129.aClass16_119.method420("ul" + local254 + "_" + local258);
							local44++;
						}
					}
				}
			}
		}
		Static253.method4365(local9, 10, local30, local26);
	}

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "(III)I")
	public static int method7014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static382.anIntArray485[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7015(@OriginalArg(0) String arg0) {
		return Static468.method7048(arg0, 10);
	}
}
