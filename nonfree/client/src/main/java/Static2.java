import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
	public static int anInt13;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	public static int anInt17;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_1 = new Class272(104, 20);

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "[I")
	public static final int[] anIntArray2 = new int[32];

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "J")
	public static long aLong1 = 0L;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
	public static void method12() {
		Static282.anInt5183 = Static187.aClass3_Sub11_Sub1_1.method3120();
		@Pc(20) boolean local20 = Static187.aClass3_Sub11_Sub1_1.method3099() == 1;
		@Pc(29) int local29 = Static187.aClass3_Sub11_Sub1_1.method3109();
		@Pc(33) int local33 = Static187.aClass3_Sub11_Sub1_1.method3115();
		@Pc(37) int local37 = Static187.aClass3_Sub11_Sub1_1.method3099();
		Static132.method2576();
		Static206.method3700(local37);
		Static187.aClass3_Sub11_Sub1_1.method992();
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(62) int local62;
		for (@Pc(47) int local47 = 0; local47 < 4; local47++) {
			for (local51 = 0; local51 < Static400.anInt6818 >> 3; local51++) {
				for (local55 = 0; local55 < Static271.anInt5050 >> 3; local55++) {
					local62 = Static187.aClass3_Sub11_Sub1_1.method990(1);
					if (local62 == 1) {
						Static73.anIntArrayArrayArray3[local47][local51][local55] = Static187.aClass3_Sub11_Sub1_1.method990(26);
					} else {
						Static73.anIntArrayArrayArray3[local47][local51][local55] = -1;
					}
				}
			}
		}
		Static187.aClass3_Sub11_Sub1_1.method989();
		local51 = (Static178.anInt8249 - Static187.aClass3_Sub11_Sub1_1.anInt3520) / 16;
		Static167.anIntArrayArray27 = new int[local51][4];
		for (local55 = 0; local55 < local51; local55++) {
			for (local62 = 0; local62 < 4; local62++) {
				Static167.anIntArrayArray27[local55][local62] = Static187.aClass3_Sub11_Sub1_1.method3116();
			}
		}
		Static548.anIntArray650 = new int[local51];
		Static240.aByteArrayArray13 = new byte[local51][];
		Static557.anIntArray656 = new int[local51];
		Static475.aByteArrayArray25 = new byte[local51][];
		Static113.anIntArray189 = new int[local51];
		Static259.aByteArrayArray29 = null;
		Static232.anIntArray358 = new int[local51];
		Static411.aByteArrayArray22 = new byte[local51][];
		Static531.anIntArray635 = null;
		Static147.anIntArray258 = new int[local51];
		Static101.aByteArrayArray6 = new byte[local51][];
		local51 = 0;
		for (local62 = 0; local62 < 4; local62++) {
			for (@Pc(196) int local196 = 0; local196 < Static400.anInt6818 >> 3; local196++) {
				for (@Pc(200) int local200 = 0; local200 < Static271.anInt5050 >> 3; local200++) {
					@Pc(210) int local210 = Static73.anIntArrayArrayArray3[local62][local196][local200];
					if (local210 != -1) {
						@Pc(219) int local219 = local210 >> 14 & 0x3FF;
						@Pc(225) int local225 = local210 >> 3 & 0x7FF;
						@Pc(235) int local235 = local225 / 8 + (local219 / 8 << 8);
						for (@Pc(237) int local237 = 0; local237 < local51; local237++) {
							if (local235 == Static548.anIntArray650[local237]) {
								local235 = -1;
								break;
							}
						}
						if (local235 != -1) {
							Static548.anIntArray650[local51] = local235;
							@Pc(269) int local269 = local235 >> 8 & 0xFF;
							@Pc(273) int local273 = local235 & 0xFF;
							Static147.anIntArray258[local51] = Static565.aClass246_261.method5665("m" + local269 + "_" + local273);
							Static557.anIntArray656[local51] = Static565.aClass246_261.method5665("l" + local269 + "_" + local273);
							Static113.anIntArray189[local51] = Static565.aClass246_261.method5665("um" + local269 + "_" + local273);
							Static232.anIntArray358[local51] = Static565.aClass246_261.method5665("ul" + local269 + "_" + local273);
							local51++;
						}
					}
				}
			}
		}
		Static23.method453(11, local20, local33, local29);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BII)Z")
	public static boolean method13(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB)Z")
	public static boolean method16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
