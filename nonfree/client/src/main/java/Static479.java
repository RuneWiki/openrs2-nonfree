import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!pr", name = "Hb", descriptor = "Z")
	public static boolean aBoolean587 = false;

	@OriginalMember(owner = "client!pr", name = "Jb", descriptor = "I")
	public static int anInt8315 = 0;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "(Z)V")
	public static void method7247() {
		@Pc(8) Class14_Sub21_Sub2 local8 = Static277.aClass347_2.aClass14_Sub21_Sub2_1;
		@Pc(17) int local17 = local8.method7708();
		Static627.anInt10289 = local8.method7695(112);
		@Pc(25) int local25 = local8.method7717(-1978450544);
		@Pc(37) boolean local37 = local8.method7738(1275460792) == 1;
		@Pc(41) int local41 = local8.method7695(122);
		Static116.method1821();
		Static120.method1873(local41);
		local8.method7766();
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(66) int local66;
		for (@Pc(51) int local51 = 0; local51 < 4; local51++) {
			for (local55 = 0; local55 < Static380.anInt6689 >> 3; local55++) {
				for (local59 = 0; local59 < Static542.anInt9214 >> 3; local59++) {
					local66 = local8.method7764(1);
					if (local66 == 1) {
						Static646.anIntArrayArrayArray20[local51][local55][local59] = local8.method7764(26);
					} else {
						Static646.anIntArrayArrayArray20[local51][local55][local59] = -1;
					}
				}
			}
		}
		local8.method7768();
		local55 = (Static277.aClass347_2.anInt9628 - local8.anInt8936) / 16;
		Static157.anIntArrayArray16 = new int[local55][4];
		for (local59 = 0; local59 < local55; local59++) {
			for (local66 = 0; local66 < 4; local66++) {
				Static157.anIntArrayArray16[local59][local66] = local8.method7748();
			}
		}
		Static495.anIntArray447 = new int[local55];
		Static47.anIntArray50 = null;
		Static634.anIntArray558 = new int[local55];
		Static535.anIntArray475 = new int[local55];
		Static103.aByteArrayArray3 = new byte[local55][];
		Static73.aByteArrayArray2 = new byte[local55][];
		Static601.aByteArrayArray29 = new byte[local55][];
		Static511.aByteArrayArray23 = null;
		Static365.anIntArray336 = new int[local55];
		Static475.aByteArrayArray20 = new byte[local55][];
		Static250.anIntArray238 = new int[local55];
		local55 = 0;
		for (local66 = 0; local66 < 4; local66++) {
			for (@Pc(218) int local218 = 0; local218 < Static380.anInt6689 >> 3; local218++) {
				for (@Pc(222) int local222 = 0; local222 < Static542.anInt9214 >> 3; local222++) {
					@Pc(232) int local232 = Static646.anIntArrayArrayArray20[local66][local218][local222];
					if (local232 != -1) {
						@Pc(241) int local241 = local232 >> 14 & 0x3FF;
						@Pc(247) int local247 = local232 >> 3 & 0x7FF;
						@Pc(257) int local257 = local247 / 8 + (local241 / 8 << 8);
						for (@Pc(259) int local259 = 0; local259 < local55; local259++) {
							if (local257 == Static365.anIntArray336[local259]) {
								local257 = -1;
								break;
							}
						}
						if (local257 != -1) {
							Static365.anIntArray336[local55] = local257;
							@Pc(299) int local299 = local257 >> 8 & 0xFF;
							@Pc(303) int local303 = local257 & 0xFF;
							Static535.anIntArray475[local55] = Static655.aClass310_132.method7794("m" + local299 + "_" + local303);
							Static634.anIntArray558[local55] = Static655.aClass310_132.method7794("l" + local299 + "_" + local303);
							Static495.anIntArray447[local55] = Static655.aClass310_132.method7794("um" + local299 + "_" + local303);
							Static250.anIntArray238[local55] = Static655.aClass310_132.method7794("ul" + local299 + "_" + local303);
							local55++;
						}
					}
				}
			}
		}
		Static333.method8696(local37, 12, local17, local25);
	}
}
