import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!eq", name = "H", descriptor = "Lclient!pd;")
	public static final Class276 aClass276_2 = new Class276(2);

	@OriginalMember(owner = "client!eq", name = "K", descriptor = "J")
	public static long aLong79 = 0L;

	@OriginalMember(owner = "client!eq", name = "M", descriptor = "I")
	public static int anInt2682 = -1;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public static void method2484() {
		Static255.method4446(Static230.aClass2_Sub54_15.aClass4_Sub25_1.method8512());
		@Pc(21) int local21 = (Static640.anInt11085 >> 3) + (Static108.anInt1987 >> 12);
		@Pc(30) int local30 = (Static598.anInt10387 >> 12) + (Static490.anInt8763 >> 3);
		Static547.anInt9550 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 = 0;
		Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.method2221(8, 8);
		Static424.aByteArrayArray16 = new byte[18][];
		Static617.aByteArrayArray24 = new byte[18][];
		Static375.anIntArray312 = new int[18];
		Static101.aByteArrayArray7 = new byte[18][];
		Static172.anIntArrayArray11 = new int[18][4];
		Static191.anIntArray190 = new int[18];
		Static37.aByteArrayArray3 = new byte[18][];
		Static448.anIntArray407 = new int[18];
		Static437.anIntArray399 = new int[18];
		Static71.aByteArrayArray4 = new byte[18][];
		Static533.anIntArray479 = new int[18];
		Static446.anIntArray403 = new int[18];
		@Pc(86) int local86 = 0;
		@Pc(106) int local106;
		for (@Pc(95) int local95 = (local21 - (Static222.anInt4533 >> 4)) / 8; local95 <= (local21 + (Static222.anInt4533 >> 4)) / 8; local95++) {
			for (local106 = (local30 - (Static668.anInt11370 >> 4)) / 8; local106 <= (local30 + (Static668.anInt11370 >> 4)) / 8; local106++) {
				@Pc(115) int local115 = (local95 << 8) + local106;
				Static437.anIntArray399[local86] = local115;
				Static191.anIntArray190[local86] = Static52.aClass124_14.method3638("m" + local95 + "_" + local106);
				Static446.anIntArray403[local86] = Static52.aClass124_14.method3638("l" + local95 + "_" + local106);
				Static375.anIntArray312[local86] = Static52.aClass124_14.method3638("n" + local95 + "_" + local106);
				Static448.anIntArray407[local86] = Static52.aClass124_14.method3638("um" + local95 + "_" + local106);
				Static533.anIntArray479[local86] = Static52.aClass124_14.method3638("ul" + local95 + "_" + local106);
				if (Static375.anIntArray312[local86] == -1) {
					Static191.anIntArray190[local86] = -1;
					Static446.anIntArray403[local86] = -1;
					Static448.anIntArray407[local86] = -1;
					Static533.anIntArray479[local86] = -1;
				}
				local86++;
			}
		}
		for (local106 = local86; local106 < Static375.anIntArray312.length; local106++) {
			Static375.anIntArray312[local106] = -1;
			Static191.anIntArray190[local106] = -1;
			Static446.anIntArray403[local106] = -1;
			Static448.anIntArray407[local106] = -1;
			Static533.anIntArray479[local106] = -1;
		}
		@Pc(291) byte local291;
		if (Static579.anInt10049 == 3) {
			local291 = 4;
		} else {
			local291 = 8;
		}
		Static285.method4770(local291, local30, local21, false);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "()V")
	public static void method2487() {
		for (@Pc(1) int local1 = 0; local1 < Static533.anInt9353; local1++) {
			@Pc(6) Class15_Sub3_Sub3 local6 = Static212.aClass15_Sub3_Sub3Array1[local1];
			Static395.method6570(local6, true);
			Static212.aClass15_Sub3_Sub3Array1[local1] = null;
		}
		Static533.anInt9353 = 0;
	}
}
