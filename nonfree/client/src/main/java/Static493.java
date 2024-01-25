import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "[Lclient!f;")
	public static Class38[] aClass38Array25;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
	public static int anInt7808;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Z")
	public static boolean aBoolean661 = false;

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
	public static int anInt7809 = -1;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[100];

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
	public static void method6303() {
		Static589.method7515(Static257.aClass2_Sub35_Sub1_1.anInt7496);
		@Pc(17) int local17 = (Static485.anInt7725 >> 3) + (Static285.anInt2206 >> 12);
		Static402.anInt6620 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128 = 0;
		@Pc(30) int local30 = (Static310.anInt5129 >> 3) + (Static469.anInt7519 >> 12);
		Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.method4907(8, 8);
		Static396.aByteArrayArray15 = new byte[18][];
		Static491.anIntArray519 = new int[18];
		Static301.anIntArray349 = new int[18];
		Static210.aByteArrayArray9 = new byte[18][];
		Static418.aByteArrayArray17 = new byte[18][];
		Static327.anIntArray374 = new int[18];
		Static26.aByteArrayArray1 = new byte[18][];
		Static336.anIntArray377 = new int[18];
		Static420.anIntArray479 = new int[18];
		Static378.anIntArrayArray44 = new int[18][4];
		Static196.anIntArray240 = new int[18];
		Static571.aByteArrayArray23 = new byte[18][];
		@Pc(81) int local81 = 0;
		@Pc(100) int local100;
		for (@Pc(89) int local89 = (local17 - (Static281.anInt4822 >> 4)) / 8; local89 <= ((Static281.anInt4822 >> 4) + local17) / 8; local89++) {
			for (local100 = (local30 - (Static29.anInt491 >> 4)) / 8; local100 <= (local30 + (Static29.anInt491 >> 4)) / 8; local100++) {
				@Pc(108) int local108 = local100 + (local89 << 8);
				Static301.anIntArray349[local81] = local108;
				Static327.anIntArray374[local81] = Static372.aClass229_89.method4955("m" + local89 + "_" + local100);
				Static196.anIntArray240[local81] = Static372.aClass229_89.method4955("l" + local89 + "_" + local100);
				Static336.anIntArray377[local81] = Static372.aClass229_89.method4955("n" + local89 + "_" + local100);
				Static420.anIntArray479[local81] = Static372.aClass229_89.method4955("um" + local89 + "_" + local100);
				Static491.anIntArray519[local81] = Static372.aClass229_89.method4955("ul" + local89 + "_" + local100);
				if (Static336.anIntArray377[local81] == -1) {
					Static327.anIntArray374[local81] = -1;
					Static196.anIntArray240[local81] = -1;
					Static420.anIntArray479[local81] = -1;
					Static491.anIntArray519[local81] = -1;
				}
				local81++;
			}
		}
		for (local100 = local81; local100 < Static336.anIntArray377.length; local100++) {
			Static336.anIntArray377[local100] = -1;
			Static327.anIntArray374[local100] = -1;
			Static196.anIntArray240[local100] = -1;
			Static420.anIntArray479[local100] = -1;
			Static491.anIntArray519[local100] = -1;
		}
		@Pc(283) byte local283;
		if (Static540.anInt8912 == 3) {
			local283 = 4;
		} else {
			local283 = 8;
		}
		Static412.method5556(local30, local283, local17, false);
	}
}
