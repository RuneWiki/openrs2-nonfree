import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Lclient!ul;")
	public static Class350 aClass350_2;

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "[I")
	public static final int[] anIntArray695 = new int[500];

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!paa;B)V")
	public static void method8601(@OriginalArg(0) Class261 arg0) {
		@Pc(12) Class261 local12 = Static83.method1185(arg0);
		@Pc(18) int local18;
		@Pc(16) int local16;
		if (local12 == null) {
			local16 = Static153.anInt2747;
			local18 = Static511.anInt8548;
		} else {
			local16 = local12.anInt6622;
			local18 = local12.anInt6595;
		}
		Static640.method8599(local18, false, arg0, local16);
		Static445.method6067(local18, local16, arg0);
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)V")
	public static void method8603() {
		Static222.method3035(Static234.aClass2_Sub5_48.aClass6_Sub9_1.method3047());
		@Pc(19) int local19 = (Static250.anInt4000 >> 12) + (Static132.anInt2246 >> 3);
		Static91.anInt1705 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 = 0;
		@Pc(32) int local32 = (Static123.anInt2176 >> 3) + (Static644.anInt10376 >> 12);
		Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.method3975(8, 8);
		Static439.anIntArray503 = new int[18];
		Static403.aByteArrayArray22 = new byte[18][];
		Static508.aByteArrayArray26 = new byte[18][];
		Static220.anIntArrayArray16 = new int[18][4];
		Static399.anIntArray466 = new int[18];
		Static352.anIntArray395 = new int[18];
		Static388.aByteArrayArray21 = new byte[18][];
		Static60.anIntArray91 = new int[18];
		Static407.anIntArray620 = new int[18];
		Static4.aByteArrayArray1 = new byte[18][];
		Static171.aByteArrayArray9 = new byte[18][];
		Static416.anIntArray474 = new int[18];
		@Pc(86) int local86 = 0;
		@Pc(104) int local104;
		for (@Pc(94) int local94 = (local19 - (Static228.anInt3704 >> 4)) / 8; local94 <= ((Static228.anInt3704 >> 4) + local19) / 8; local94++) {
			for (local104 = (local32 - (Static162.anInt2911 >> 4)) / 8; local104 <= ((Static162.anInt2911 >> 4) + local32) / 8; local104++) {
				@Pc(113) int local113 = (local94 << 8) + local104;
				Static407.anIntArray620[local86] = local113;
				Static60.anIntArray91[local86] = Static280.aClass380_67.method8609("m" + local94 + "_" + local104);
				Static439.anIntArray503[local86] = Static280.aClass380_67.method8609("l" + local94 + "_" + local104);
				Static399.anIntArray466[local86] = Static280.aClass380_67.method8609("n" + local94 + "_" + local104);
				Static352.anIntArray395[local86] = Static280.aClass380_67.method8609("um" + local94 + "_" + local104);
				Static416.anIntArray474[local86] = Static280.aClass380_67.method8609("ul" + local94 + "_" + local104);
				if (Static399.anIntArray466[local86] == -1) {
					Static60.anIntArray91[local86] = -1;
					Static439.anIntArray503[local86] = -1;
					Static352.anIntArray395[local86] = -1;
					Static416.anIntArray474[local86] = -1;
				}
				local86++;
			}
		}
		for (local104 = local86; local104 < Static399.anIntArray466.length; local104++) {
			Static399.anIntArray466[local104] = -1;
			Static60.anIntArray91[local104] = -1;
			Static439.anIntArray503[local104] = -1;
			Static352.anIntArray395[local104] = -1;
			Static416.anIntArray474[local104] = -1;
		}
		@Pc(283) byte local283;
		if (Static324.anInt5145 == 3) {
			local283 = 4;
		} else {
			local283 = 8;
		}
		Static599.method8102(local283, local19, local32, false);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILclient!wu;IZIIJ)V")
	public static void method8604(@OriginalArg(0) int arg0, @OriginalArg(2) Class380 arg1, @OriginalArg(3) int arg2, @OriginalArg(7) long arg3) {
		Static350.anInt5487 = 0;
		Static74.anInt1268 = arg0;
		Static527.aClass2_Sub13_Sub3_4 = null;
		Static575.anInt9354 = 10000;
		Static93.aClass380_31 = arg1;
		Static468.anInt7474 = 0;
		Static317.anInt5047 = 1;
		Static33.anInt738 = arg2;
		Static186.aLong141 = arg3;
		Static140.aBoolean200 = false;
	}
}
