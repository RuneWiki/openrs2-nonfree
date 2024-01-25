import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "[I")
	public static final int[] anIntArray182 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_145 = new Class137(18, -1);

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
	public static final int anInt3369 = 2;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "Lclient!ne;")
	public static final Class166 aClass166_6 = new Class166("LIVE", 0);

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	public static void method2810() {
		Static381.method4865(Static336.aClass106_Sub1_1.anInt5684);
		@Pc(20) int local20 = (Static278.anInt4391 >> 10) + (Static101.anInt6646 >> 3);
		@Pc(28) int local28 = (Static8.anInt7337 >> 10) + (Static278.anInt4392 >> 3);
		Static138.anInt3548 = Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 = 0;
		Static239.aClass20_Sub3_Sub3_Sub1_1.method3877(8, 8);
		Static356.anIntArray348 = new int[18];
		Static383.aByteArrayArray44 = new byte[18][];
		Static346.anIntArray341 = new int[18];
		Static288.anIntArray250 = new int[18];
		Static7.anIntArray394 = new int[18];
		Static137.anIntArray112 = new int[18];
		Static207.aByteArrayArray28 = new byte[18][];
		Static334.anIntArray331 = new int[18];
		Static59.aByteArrayArray9 = new byte[18][];
		Static342.aByteArrayArray41 = new byte[18][];
		Static109.aByteArrayArray15 = new byte[18][];
		Static148.anIntArrayArray62 = new int[18][4];
		@Pc(79) int local79 = 0;
		@Pc(99) int local99;
		for (@Pc(88) int local88 = (local20 - (Static425.anInt6922 >> 4)) / 8; local88 <= (local20 + (Static425.anInt6922 >> 4)) / 8; local88++) {
			for (local99 = (local28 - (Static251.anInt4072 >> 4)) / 8; local99 <= ((Static251.anInt4072 >> 4) + local28) / 8; local99++) {
				@Pc(107) int local107 = local99 + (local88 << 8);
				Static334.anIntArray331[local79] = local107;
				Static346.anIntArray341[local79] = Static310.aClass113_97.method2269("m" + local88 + "_" + local99);
				Static137.anIntArray112[local79] = Static310.aClass113_97.method2269("l" + local88 + "_" + local99);
				Static356.anIntArray348[local79] = Static310.aClass113_97.method2269("n" + local88 + "_" + local99);
				Static7.anIntArray394[local79] = Static310.aClass113_97.method2269("um" + local88 + "_" + local99);
				Static288.anIntArray250[local79] = Static310.aClass113_97.method2269("ul" + local88 + "_" + local99);
				if (Static356.anIntArray348[local79] == -1) {
					Static346.anIntArray341[local79] = -1;
					Static137.anIntArray112[local79] = -1;
					Static7.anIntArray394[local79] = -1;
					Static288.anIntArray250[local79] = -1;
				}
				local79++;
			}
		}
		for (local99 = local79; local99 < Static356.anIntArray348.length; local99++) {
			Static356.anIntArray348[local99] = -1;
			Static346.anIntArray341[local99] = -1;
			Static137.anIntArray112[local99] = -1;
			Static7.anIntArray394[local99] = -1;
			Static288.anIntArray250[local99] = -1;
		}
		Static369.method3951(local28, local20, true, false);
	}
}
