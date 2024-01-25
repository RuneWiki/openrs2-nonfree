import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!tba", name = "v", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_174 = new Class322(31, 2);

	@OriginalMember(owner = "client!tba", name = "t", descriptor = "I")
	public static int anInt9220 = 0;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(BII)Z")
	public static boolean method8048(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(B)V")
	public static void method8049() {
		@Pc(15) Class6_Sub15_Sub1 local15 = Static525.aClass260_4.aClass6_Sub15_Sub1_2;
		@Pc(19) int local19 = local15.method3018();
		@Pc(23) int local23 = local15.method3021();
		Static541.anInt9249 = local15.method3030();
		@Pc(41) boolean local41 = local15.method3034() == 1;
		@Pc(45) int local45 = local15.method3018();
		Static272.method975();
		Static593.method8224(local23);
		local15.method2469();
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(72) int local72;
		for (@Pc(55) int local55 = 0; local55 < 4; local55++) {
			for (local59 = 0; local59 < Static29.anInt380 >> 3; local59++) {
				for (local63 = 0; local63 < Static327.anInt5650 >> 3; local63++) {
					local72 = local15.method2468(1);
					if (local72 == 1) {
						Static146.anIntArrayArrayArray8[local55][local59][local63] = local15.method2468(26);
					} else {
						Static146.anIntArrayArrayArray8[local55][local59][local63] = -1;
					}
				}
			}
		}
		local15.method2472();
		local59 = (Static525.aClass260_4.anInt7198 - local15.anInt3174) / 16;
		Static222.anIntArrayArray21 = new int[local59][4];
		for (local63 = 0; local63 < local59; local63++) {
			for (local72 = 0; local72 < 4; local72++) {
				Static222.anIntArrayArray21[local63][local72] = local15.method3015();
			}
		}
		Static293.anIntArray289 = null;
		Static346.anIntArray343 = new int[local59];
		Static384.aByteArrayArray119 = new byte[local59][];
		Static364.anIntArray363 = new int[local59];
		Static173.aByteArrayArray61 = new byte[local59][];
		Static89.aByteArrayArray29 = new byte[local59][];
		Static224.anIntArray221 = new int[local59];
		Static432.aByteArrayArray134 = new byte[local59][];
		Static504.anIntArray530 = new int[local59];
		Static76.aByteArrayArray27 = null;
		Static617.anIntArray642 = new int[local59];
		local59 = 0;
		for (local72 = 0; local72 < 4; local72++) {
			for (@Pc(221) int local221 = 0; local221 < Static29.anInt380 >> 3; local221++) {
				for (@Pc(225) int local225 = 0; local225 < Static327.anInt5650 >> 3; local225++) {
					@Pc(235) int local235 = Static146.anIntArrayArrayArray8[local72][local221][local225];
					if (local235 != -1) {
						@Pc(245) int local245 = local235 >> 14 & 0x3FF;
						@Pc(251) int local251 = local235 >> 3 & 0x7FF;
						@Pc(261) int local261 = local251 / 8 + (local245 / 8 << 8);
						for (@Pc(263) int local263 = 0; local263 < local59; local263++) {
							if (local261 == Static617.anIntArray642[local263]) {
								local261 = -1;
								break;
							}
						}
						if (local261 != -1) {
							Static617.anIntArray642[local59] = local261;
							@Pc(303) int local303 = local261 >> 8 & 0xFF;
							@Pc(307) int local307 = local261 & 0xFF;
							Static224.anIntArray221[local59] = Static194.aClass223_39.method5257("m" + local303 + "_" + local307);
							Static346.anIntArray343[local59] = Static194.aClass223_39.method5257("l" + local303 + "_" + local307);
							Static504.anIntArray530[local59] = Static194.aClass223_39.method5257("um" + local303 + "_" + local307);
							Static364.anIntArray363[local59] = Static194.aClass223_39.method5257("ul" + local303 + "_" + local307);
							local59++;
						}
					}
				}
			}
		}
		Static472.method7116(12, local41, local19, local45);
	}
}
