import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	public static int anInt7643;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)Z")
	public static boolean method5973() {
		return Static409.anInt1461 >= 1;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)V")
	public static void method5975() {
		Static369.method5228(Static348.aClass3_Sub51_Sub1_5.anInt9946);
		@Pc(17) int local17 = (Static407.anInt7345 >> 12) + (Static321.anInt5874 >> 3);
		@Pc(25) int local25 = (Static137.anInt3293 >> 3) + (Static418.anInt7466 >> 12);
		Static594.anInt10310 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 = 0;
		Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.method5675(8, 8);
		Static260.aByteArrayArray25 = new byte[18][];
		Static402.aByteArrayArray34 = new byte[18][];
		Static320.anIntArray288 = new int[18];
		Static208.anIntArrayArray39 = new int[18][4];
		Static566.aByteArrayArray50 = new byte[18][];
		Static178.anIntArray159 = new int[18];
		Static243.anIntArray529 = new int[18];
		Static481.anIntArray497 = new int[18];
		Static562.anIntArray563 = new int[18];
		Static575.anIntArray575 = new int[18];
		Static4.aByteArrayArray1 = new byte[18][];
		Static403.aByteArrayArray35 = new byte[18][];
		@Pc(84) int local84 = 0;
		@Pc(103) int local103;
		for (@Pc(93) int local93 = (local17 - (Static345.anInt6228 >> 4)) / 8; local93 <= (local17 + (Static345.anInt6228 >> 4)) / 8; local93++) {
			for (local103 = (local25 - (Static535.anInt9341 >> 4)) / 8; local103 <= ((Static535.anInt9341 >> 4) + local25) / 8; local103++) {
				@Pc(111) int local111 = local103 + (local93 << 8);
				Static178.anIntArray159[local84] = local111;
				Static320.anIntArray288[local84] = Static295.aClass284_92.method6333("m" + local93 + "_" + local103);
				Static481.anIntArray497[local84] = Static295.aClass284_92.method6333("l" + local93 + "_" + local103);
				Static243.anIntArray529[local84] = Static295.aClass284_92.method6333("n" + local93 + "_" + local103);
				Static562.anIntArray563[local84] = Static295.aClass284_92.method6333("um" + local93 + "_" + local103);
				Static575.anIntArray575[local84] = Static295.aClass284_92.method6333("ul" + local93 + "_" + local103);
				if (Static243.anIntArray529[local84] == -1) {
					Static320.anIntArray288[local84] = -1;
					Static481.anIntArray497[local84] = -1;
					Static562.anIntArray563[local84] = -1;
					Static575.anIntArray575[local84] = -1;
				}
				local84++;
			}
		}
		for (local103 = local84; local103 < Static243.anIntArray529.length; local103++) {
			Static243.anIntArray529[local103] = -1;
			Static320.anIntArray288[local103] = -1;
			Static481.anIntArray497[local103] = -1;
			Static562.anIntArray563[local103] = -1;
			Static575.anIntArray575[local103] = -1;
		}
		@Pc(289) byte local289;
		if (Static409.anInt1461 == 3) {
			local289 = 4;
		} else {
			local289 = 8;
		}
		Static148.method2817(false, local25, local289, local17);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!ri;)I")
	public static int method5976(@OriginalArg(1) Class284 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method6347(Static596.anInt10329)) {
			local5++;
		}
		if (arg0.method6347(Static481.anInt8355)) {
			local5++;
		}
		if (arg0.method6347(Static503.anInt8664)) {
			local5++;
		}
		if (arg0.method6347(Static478.anInt8327)) {
			local5++;
		}
		if (arg0.method6347(Static596.anInt10324)) {
			local5++;
		}
		if (arg0.method6347(Static361.anInt6365)) {
			local5++;
		}
		if (arg0.method6347(Static490.anInt8424)) {
			local5++;
		}
		if (arg0.method6347(Static428.anInt7573)) {
			local5++;
		}
		if (arg0.method6347(Static507.anInt8781)) {
			local5++;
		}
		if (arg0.method6347(Static478.anInt8315)) {
			local5++;
		}
		if (arg0.method6347(Static376.anInt6529)) {
			local5++;
		}
		if (arg0.method6347(Static151.anInt3499)) {
			local5++;
		}
		if (arg0.method6347(Static295.anInt5517)) {
			local5++;
		}
		if (arg0.method6347(Static292.anInt5479)) {
			local5++;
		}
		if (arg0.method6347(Static182.anInt3992)) {
			local5++;
		}
		if (arg0.method6347(Static142.anInt3360)) {
			local5++;
		}
		return local5;
	}
}
