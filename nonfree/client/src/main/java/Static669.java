import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static669 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
	public static int anInt10397 = 500;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "Z")
	public static final boolean aBoolean900 = false;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
	public static void method9113() {
		Static618.method8402(Static650.aClass2_Sub30_29.aClass11_Sub13_1.method2809());
		@Pc(19) int local19 = (Static430.anInt7002 >> 12) + (Static243.anInt3820 >> 3);
		@Pc(27) int local27 = (Static218.anInt3475 >> 12) + (Static224.anInt11062 >> 3);
		Static684.anInt10516 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 = 0;
		Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.method736(8, 8);
		Static523.anIntArray462 = new int[18];
		Static671.aByteArrayArray26 = new byte[18][];
		Static152.anIntArrayArray15 = new int[18][4];
		Static453.aByteArrayArray13 = new byte[18][];
		Static336.aByteArrayArray10 = new byte[18][];
		Static148.anIntArray187 = new int[18];
		Static398.anIntArray452 = new int[18];
		Static608.anIntArray687 = new int[18];
		Static100.aByteArrayArray1 = new byte[18][];
		Static495.aByteArrayArray17 = new byte[18][];
		Static453.anIntArray534 = new int[18];
		Static9.anIntArray32 = new int[18];
		@Pc(78) int local78 = 0;
		@Pc(98) int local98;
		for (@Pc(87) int local87 = (local19 - (Static426.anInt6942 >> 4)) / 8; local87 <= ((Static426.anInt6942 >> 4) + local19) / 8; local87++) {
			for (local98 = (local27 - (Static280.anInt6752 >> 4)) / 8; local98 <= (local27 + (Static280.anInt6752 >> 4)) / 8; local98++) {
				@Pc(106) int local106 = (local87 << 8) + local98;
				Static148.anIntArray187[local78] = local106;
				Static398.anIntArray452[local78] = Static311.aClass254_96.method6077("m" + local87 + "_" + local98);
				Static9.anIntArray32[local78] = Static311.aClass254_96.method6077("l" + local87 + "_" + local98);
				Static608.anIntArray687[local78] = Static311.aClass254_96.method6077("n" + local87 + "_" + local98);
				Static523.anIntArray462[local78] = Static311.aClass254_96.method6077("um" + local87 + "_" + local98);
				Static453.anIntArray534[local78] = Static311.aClass254_96.method6077("ul" + local87 + "_" + local98);
				if (Static608.anIntArray687[local78] == -1) {
					Static398.anIntArray452[local78] = -1;
					Static9.anIntArray32[local78] = -1;
					Static523.anIntArray462[local78] = -1;
					Static453.anIntArray534[local78] = -1;
				}
				local78++;
			}
		}
		for (local98 = local78; local98 < Static608.anIntArray687.length; local98++) {
			Static608.anIntArray687[local98] = -1;
			Static398.anIntArray452[local98] = -1;
			Static9.anIntArray32[local98] = -1;
			Static523.anIntArray462[local98] = -1;
			Static453.anIntArray534[local98] = -1;
		}
		@Pc(298) byte local298;
		if (Static357.anInt5722 == 3) {
			local298 = 4;
		} else if (Static357.anInt5722 == 9) {
			local298 = 10;
		} else if (Static357.anInt5722 == 7) {
			local298 = 8;
		} else {
			throw new RuntimeException(String.valueOf(Static357.anInt5722));
		}
		Static63.method951(local19, local298, false, local27);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZZZ)V")
	public static void method9116(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static145.anInt2471++;
			Static708.method9452();
		}
		if (arg1) {
			Static388.anInt6468++;
			Static165.method2491();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII)Z")
	public static boolean method9119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
