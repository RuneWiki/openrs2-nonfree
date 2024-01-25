import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
	public static int anInt3661;

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "Lclient!ok;")
	public static Class176 aClass176_2;

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "[S")
	public static short[] aShortArray48;

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "Lclient!la;")
	public static final Class136 aClass136_100 = new Class136(110, 0);

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
	public static int anInt3659 = -1;

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString45 = null;

	@OriginalMember(owner = "client!kc", name = "W", descriptor = "Z")
	public static boolean aBoolean274 = false;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)V")
	public static void method3154() {
		Static32.method580(Static39.aClass79_Sub1_1.anInt2159);
		@Pc(17) int local17 = (Static59.anInt1127 >> 3) + (Static266.anInt4433 >> 10);
		Static276.anInt4606 = Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 = 0;
		@Pc(30) int local30 = (Static152.anInt7561 >> 10) + (Static49.anInt873 >> 3);
		Static203.aClass1_Sub2_Sub6_Sub2_1.method6209(8, 8);
		Static457.aByteArrayArray34 = new byte[18][];
		Static192.anIntArray217 = new int[18];
		Static127.aByteArrayArray11 = new byte[18][];
		Static298.aByteArrayArray20 = new byte[18][];
		Static417.anIntArray447 = new int[18];
		Static165.anIntArray116 = new int[18];
		Static152.aByteArrayArray33 = new byte[18][];
		Static73.anIntArray70 = new int[18];
		Static95.anIntArray81 = new int[18];
		Static194.aByteArrayArray14 = new byte[18][];
		Static60.anIntArrayArray8 = new int[18][4];
		Static127.anIntArray115 = new int[18];
		@Pc(76) int local76 = 0;
		@Pc(95) int local95;
		for (@Pc(84) int local84 = (local17 - (Static373.anInt6324 >> 4)) / 8; local84 <= ((Static373.anInt6324 >> 4) + local17) / 8; local84++) {
			for (local95 = (local30 - (Static291.anInt5062 >> 4)) / 8; local95 <= ((Static291.anInt5062 >> 4) + local30) / 8; local95++) {
				@Pc(103) int local103 = local95 + (local84 << 8);
				Static127.anIntArray115[local76] = local103;
				Static95.anIntArray81[local76] = Static92.aClass250_31.method5790("m" + local84 + "_" + local95);
				Static417.anIntArray447[local76] = Static92.aClass250_31.method5790("l" + local84 + "_" + local95);
				Static192.anIntArray217[local76] = Static92.aClass250_31.method5790("n" + local84 + "_" + local95);
				Static165.anIntArray116[local76] = Static92.aClass250_31.method5790("um" + local84 + "_" + local95);
				Static73.anIntArray70[local76] = Static92.aClass250_31.method5790("ul" + local84 + "_" + local95);
				if (Static192.anIntArray217[local76] == -1) {
					Static95.anIntArray81[local76] = -1;
					Static417.anIntArray447[local76] = -1;
					Static165.anIntArray116[local76] = -1;
					Static73.anIntArray70[local76] = -1;
				}
				local76++;
			}
		}
		for (local95 = local76; local95 < Static192.anIntArray217.length; local95++) {
			Static192.anIntArray217[local95] = -1;
			Static95.anIntArray81[local95] = -1;
			Static417.anIntArray447[local95] = -1;
			Static165.anIntArray116[local95] = -1;
			Static73.anIntArray70[local95] = -1;
		}
		@Pc(279) byte local279;
		if (Static345.anInt5823 == 1 || Static345.anInt5823 == 2) {
			local279 = 3;
		} else {
			local279 = 7;
		}
		Static251.method5279(local30, local279, local17, false);
	}
}
