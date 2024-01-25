import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_188 = new Class272(76, 12);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)I")
	public static int method5305() {
		if (Static255.aBoolean352) {
			return 6;
		} else if (Static99.aClass3_Sub44_2 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static99.aClass3_Sub44_2.anInt7685;
			if (Static186.method3191(local19)) {
				return 1;
			} else if (Static336.method5142(local19)) {
				return 2;
			} else if (Static377.method5578(local19)) {
				return 3;
			} else if (Static505.method2637(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	public static void method5306() {
		Static282.anInt5183 = 0;
		@Pc(11) int local11 = Static187.aClass3_Sub11_Sub1_1.method3115();
		@Pc(15) int local15 = Static187.aClass3_Sub11_Sub1_1.method3117();
		@Pc(19) int local19 = Static187.aClass3_Sub11_Sub1_1.method3120();
		@Pc(30) boolean local30 = Static187.aClass3_Sub11_Sub1_1.method3110() == 1;
		Static132.method2576();
		Static206.method3700(local19);
		@Pc(43) int local43 = (Static178.anInt8249 - Static187.aClass3_Sub11_Sub1_1.anInt3520) / 16;
		Static167.anIntArrayArray27 = new int[local43][4];
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (@Pc(53) int local53 = 0; local53 < 4; local53++) {
				Static167.anIntArrayArray27[local49][local53] = Static187.aClass3_Sub11_Sub1_1.method3116();
			}
		}
		Static113.anIntArray189 = new int[local43];
		Static411.aByteArrayArray22 = new byte[local43][];
		Static147.anIntArray258 = new int[local43];
		Static101.aByteArrayArray6 = new byte[local43][];
		Static240.aByteArrayArray13 = new byte[local43][];
		Static548.anIntArray650 = new int[local43];
		Static557.anIntArray656 = new int[local43];
		Static475.aByteArrayArray25 = new byte[local43][];
		Static531.anIntArray635 = null;
		Static259.aByteArrayArray29 = null;
		Static232.anIntArray358 = new int[local43];
		local43 = 0;
		for (@Pc(125) int local125 = (local11 - (Static400.anInt6818 >> 4)) / 8; local125 <= ((Static400.anInt6818 >> 4) + local11) / 8; local125++) {
			for (@Pc(136) int local136 = (local15 - (Static271.anInt5050 >> 4)) / 8; local136 <= (local15 + (Static271.anInt5050 >> 4)) / 8; local136++) {
				Static548.anIntArray650[local43] = local136 + (local125 << 8);
				Static147.anIntArray258[local43] = Static565.aClass246_261.method5665("m" + local125 + "_" + local136);
				Static557.anIntArray656[local43] = Static565.aClass246_261.method5665("l" + local125 + "_" + local136);
				Static113.anIntArray189[local43] = Static565.aClass246_261.method5665("um" + local125 + "_" + local136);
				Static232.anIntArray358[local43] = Static565.aClass246_261.method5665("ul" + local125 + "_" + local136);
				local43++;
			}
		}
		Static23.method453(11, local30, local11, local15);
	}
}
