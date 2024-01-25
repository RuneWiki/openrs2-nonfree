import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_103 = new Class73(112, 12);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZ)V")
	public static void method4754(@OriginalArg(0) int arg0) {
		Static88.anInt1744 = arg0;
		@Pc(11) Class136 local11 = Static579.aClass136_107;
		synchronized (Static579.aClass136_107) {
			Static579.aClass136_107.method3470();
		}
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V")
	public static void method4755() {
		Static361.method6651(Static140.aClass6_Sub48_Sub1_1.anInt9002);
		@Pc(17) int local17 = (Static39.anInt4952 >> 3) + (Static371.anInt6572 >> 12);
		Static97.anInt1863 = Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 = 0;
		@Pc(30) int local30 = (Static138.anInt3088 >> 3) + (Static322.anInt5904 >> 12);
		Static328.aClass4_Sub1_Sub1_Sub2_2.method5913(8, 8);
		Static334.aByteArrayArray19 = new byte[18][];
		Static64.aByteArrayArray18 = new byte[18][];
		Static542.aByteArrayArray30 = new byte[18][];
		Static380.aByteArrayArray22 = new byte[18][];
		Static220.anIntArray273 = new int[18];
		Static30.aByteArrayArray2 = new byte[18][];
		Static486.anIntArrayArray73 = new int[18][4];
		Static378.anIntArray493 = new int[18];
		Static228.anIntArray281 = new int[18];
		Static347.anIntArray461 = new int[18];
		Static365.anIntArray477 = new int[18];
		Static98.anIntArray154 = new int[18];
		@Pc(82) int local82 = 0;
		@Pc(101) int local101;
		for (@Pc(91) int local91 = (local17 - (Static473.anInt8075 >> 4)) / 8; local91 <= (local17 + (Static473.anInt8075 >> 4)) / 8; local91++) {
			for (local101 = (local30 - (Static165.anInt6749 >> 4)) / 8; local101 <= ((Static165.anInt6749 >> 4) + local30) / 8; local101++) {
				@Pc(109) int local109 = local101 + (local91 << 8);
				Static365.anIntArray477[local82] = local109;
				Static220.anIntArray273[local82] = Static70.aClass251_58.method5764("m" + local91 + "_" + local101);
				Static228.anIntArray281[local82] = Static70.aClass251_58.method5764("l" + local91 + "_" + local101);
				Static378.anIntArray493[local82] = Static70.aClass251_58.method5764("n" + local91 + "_" + local101);
				Static98.anIntArray154[local82] = Static70.aClass251_58.method5764("um" + local91 + "_" + local101);
				Static347.anIntArray461[local82] = Static70.aClass251_58.method5764("ul" + local91 + "_" + local101);
				if (Static378.anIntArray493[local82] == -1) {
					Static220.anIntArray273[local82] = -1;
					Static228.anIntArray281[local82] = -1;
					Static98.anIntArray154[local82] = -1;
					Static347.anIntArray461[local82] = -1;
				}
				local82++;
			}
		}
		for (local101 = local82; local101 < Static378.anIntArray493.length; local101++) {
			Static378.anIntArray493[local101] = -1;
			Static220.anIntArray273[local101] = -1;
			Static228.anIntArray281[local101] = -1;
			Static98.anIntArray154[local101] = -1;
			Static347.anIntArray461[local101] = -1;
		}
		@Pc(280) byte local280;
		if (Static557.anInt9206 == 3) {
			local280 = 4;
		} else {
			local280 = 8;
		}
		Static66.method1315(false, local280, local30, local17);
	}
}
