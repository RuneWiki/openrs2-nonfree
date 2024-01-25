import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
	public static void method1976() {
		if (Static38.aClass135_Sub1_1.method4244(Static143.anInt2766) || Static357.anInt5881 == Static170.anInt3116) {
			Static93.method1690(Static415.aClass39_11);
			if (Static39.anInt791 != Static357.anInt5881) {
				Static99.method1780();
			}
		} else {
			Static410.method5509(Static307.anInt5295, false, Static303.anInt5255, 10);
		}
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public static void method1978() {
		Static23.anInt5194 = Static206.aClass1_Sub5_Sub1_2.method5374();
		@Pc(13) int local13 = Static206.aClass1_Sub5_Sub1_2.method5400();
		@Pc(17) int local17 = Static206.aClass1_Sub5_Sub1_2.method5362();
		@Pc(23) int local23 = Static206.aClass1_Sub5_Sub1_2.method5374();
		@Pc(32) boolean local32 = Static206.aClass1_Sub5_Sub1_2.method5383() == 1;
		Static444.method5854(local23);
		Static206.aClass1_Sub5_Sub1_2.method312();
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(59) int local59;
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			for (local48 = 0; local48 < Static195.anInt3537 >> 3; local48++) {
				for (local52 = 0; local52 < Static118.anInt2419 >> 3; local52++) {
					local59 = Static206.aClass1_Sub5_Sub1_2.method316(1);
					if (local59 == 1) {
						Static411.anIntArrayArrayArray14[local44][local48][local52] = Static206.aClass1_Sub5_Sub1_2.method316(26);
					} else {
						Static411.anIntArrayArrayArray14[local44][local48][local52] = -1;
					}
				}
			}
		}
		Static206.aClass1_Sub5_Sub1_2.method313();
		local48 = (Static167.anInt3076 - Static206.aClass1_Sub5_Sub1_2.anInt6475) / 16;
		Static44.anIntArrayArray7 = new int[local48][4];
		for (local52 = 0; local52 < local48; local52++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static44.anIntArrayArray7[local52][local59] = Static206.aClass1_Sub5_Sub1_2.method5407();
			}
		}
		Static175.aByteArrayArray8 = new byte[local48][];
		Static18.anIntArray306 = new int[local48];
		Static111.anIntArray183 = new int[local48];
		Static390.aByteArrayArray18 = new byte[local48][];
		Static407.aByteArrayArray20 = new byte[local48][];
		Static266.anIntArray627 = new int[local48];
		Static72.aByteArrayArray3 = null;
		Static136.aByteArrayArray6 = new byte[local48][];
		Static431.anIntArray632 = new int[local48];
		Static92.anIntArray162 = null;
		Static181.anIntArray293 = new int[local48];
		local48 = 0;
		for (local59 = 0; local59 < 4; local59++) {
			for (@Pc(191) int local191 = 0; local191 < Static195.anInt3537 >> 3; local191++) {
				for (@Pc(195) int local195 = 0; local195 < Static118.anInt2419 >> 3; local195++) {
					@Pc(205) int local205 = Static411.anIntArrayArrayArray14[local59][local191][local195];
					if (local205 != -1) {
						@Pc(214) int local214 = local205 >> 14 & 0x3FF;
						@Pc(220) int local220 = local205 >> 3 & 0x7FF;
						@Pc(231) int local231 = (local214 / 8 << 8) + (local220 / 8);
						for (@Pc(233) int local233 = 0; local233 < local48; local233++) {
							if (local231 == Static266.anIntArray627[local233]) {
								local231 = -1;
								break;
							}
						}
						if (local231 != -1) {
							Static266.anIntArray627[local48] = local231;
							@Pc(269) int local269 = local231 >> 8 & 0xFF;
							@Pc(273) int local273 = local231 & 0xFF;
							Static111.anIntArray183[local48] = Static334.aClass246_179.method5478("m" + local269 + "_" + local273);
							Static431.anIntArray632[local48] = Static334.aClass246_179.method5478("l" + local269 + "_" + local273);
							Static18.anIntArray306[local48] = Static334.aClass246_179.method5478("um" + local269 + "_" + local273);
							Static181.anIntArray293[local48] = Static334.aClass246_179.method5478("ul" + local269 + "_" + local273);
							local48++;
						}
					}
				}
			}
		}
		Static410.method5509(local13, local32, local17, 10);
	}
}
