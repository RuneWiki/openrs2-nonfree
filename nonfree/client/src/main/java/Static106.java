import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
	public static int anInt2113;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Z")
	public static boolean aBoolean121 = true;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
	public static int anInt2115 = 0;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
	public static int anInt2119 = 0;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	public static void method1796() {
		while (true) {
			if (Static256.aClass4_Sub24_Sub1_3.method3127(Static31.anInt653) >= 11) {
				@Pc(20) int local20 = Static256.aClass4_Sub24_Sub1_3.method3132(11);
				if (local20 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static100.aClass13_Sub5_Sub1Array1[local20] == null) {
						Static100.aClass13_Sub5_Sub1Array1[local20] = new Class13_Sub5_Sub1();
						local25 = true;
						if (Static162.aClass4_Sub24Array1[local20] != null) {
							Static100.aClass13_Sub5_Sub1Array1[local20].method3497(Static162.aClass4_Sub24Array1[local20]);
						}
					}
					Static291.anIntArray457[Static85.anInt1730++] = local20;
					@Pc(62) Class13_Sub5_Sub1 local62 = Static100.aClass13_Sub5_Sub1Array1[local20];
					local62.anInt5329 = Static50.anInt1118;
					@Pc(70) int local70 = Static256.aClass4_Sub24_Sub1_3.method3132(5);
					@Pc(77) int local77 = Static219.anIntArray348[Static256.aClass4_Sub24_Sub1_3.method3132(3)];
					if (local70 > 15) {
						local70 -= 32;
					}
					if (local25) {
						local62.anInt5266 = local62.anInt5261 = local77;
					}
					@Pc(94) int local94 = Static256.aClass4_Sub24_Sub1_3.method3132(5);
					if (local94 > 15) {
						local94 -= 32;
					}
					@Pc(105) int local105 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
					if (local105 == 1) {
						Static148.anIntArray237[Static291.anInt5649++] = local20;
					}
					@Pc(122) int local122 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
					local62.method3496(Static72.aClass13_Sub5_Sub1_1.anIntArray411[0] + local70, local122 == 1, Static72.aClass13_Sub5_Sub1_1.anIntArray418[0] + local94);
					continue;
				}
			}
			Static256.aClass4_Sub24_Sub1_3.method3129();
			return;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)V")
	public static void method1797(@OriginalArg(1) boolean arg0) {
		Static255.aBoolean339 = arg0;
		@Pc(136) boolean local136;
		@Pc(22) int local22;
		@Pc(27) int local27;
		@Pc(34) int local34;
		@Pc(41) int local41;
		@Pc(49) int local49;
		@Pc(148) int local148;
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(207) int local207;
		if (!Static255.aBoolean339) {
			local22 = Static256.aClass4_Sub24_Sub1_3.method3074();
			local27 = Static256.aClass4_Sub24_Sub1_3.method3108();
			local136 = Static127.method2072(Static256.aClass4_Sub24_Sub1_3.method3101());
			local34 = Static256.aClass4_Sub24_Sub1_3.method3094();
			local41 = (Static31.anInt653 - Static256.aClass4_Sub24_Sub1_3.anInt3822) / 16;
			Static55.anIntArrayArray13 = new int[local41][4];
			for (local49 = 0; local49 < local41; local49++) {
				for (local148 = 0; local148 < 4; local148++) {
					Static55.anIntArrayArray13[local49][local148] = Static256.aClass4_Sub24_Sub1_3.method3121();
				}
			}
			local49 = Static256.aClass4_Sub24_Sub1_3.method3074();
			local148 = Static256.aClass4_Sub24_Sub1_3.method3074();
			Static37.anIntArray203 = new int[local41];
			Static204.anIntArray336 = new int[local41];
			Static3.aByteArrayArray1 = new byte[local41][];
			Static12.anIntArray8 = new int[local41];
			Static121.aByteArrayArray9 = new byte[local41][];
			Static162.anIntArray272 = new int[local41];
			Static13.aByteArrayArray2 = new byte[local41][];
			Static307.aByteArrayArray17 = null;
			Static212.anIntArray346 = null;
			@Pc(469) boolean local469 = false;
			Static256.anIntArray393 = new int[local41];
			if ((local22 / 8 == 48 || local22 / 8 == 49) && (local49 / 8) == 48) {
				local469 = true;
			}
			if (local22 / 8 == 48 && local49 / 8 == 148) {
				local469 = true;
			}
			Static218.aByteArrayArray11 = new byte[local41][];
			local41 = 0;
			for (local189 = (local22 - 6) / 8; local189 <= (local22 + 6) / 8; local189++) {
				for (local194 = (local49 - 6) / 8; local194 <= (local49 + 6) / 8; local194++) {
					local207 = local194 + (local189 << 8);
					if (local469 && (local194 == 49 || local194 == 149 || local194 == 147 || local189 == 50 || local189 == 49 && local194 == 47)) {
						Static162.anIntArray272[local41] = local207;
						Static204.anIntArray336[local41] = -1;
						Static12.anIntArray8[local41] = -1;
						Static37.anIntArray203[local41] = -1;
						Static256.anIntArray393[local41] = -1;
					} else {
						Static162.anIntArray272[local41] = local207;
						Static204.anIntArray336[local41] = Static296.aClass22_105.method661("m" + local189 + "_" + local194);
						Static12.anIntArray8[local41] = Static296.aClass22_105.method661("l" + local189 + "_" + local194);
						Static37.anIntArray203[local41] = Static296.aClass22_105.method661("um" + local189 + "_" + local194);
						Static256.anIntArray393[local41] = Static296.aClass22_105.method661("ul" + local189 + "_" + local194);
					}
					local41++;
				}
			}
			Static104.method1790(local148, local136, local49, local27, local22, local34, false);
			return;
		}
		local22 = Static256.aClass4_Sub24_Sub1_3.method3101();
		Static256.aClass4_Sub24_Sub1_3.method3126();
		for (local27 = 0; local27 < 4; local27++) {
			for (local34 = 0; local34 < 13; local34++) {
				for (local41 = 0; local41 < 13; local41++) {
					local49 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
					if (local49 == 1) {
						Static209.anIntArrayArrayArray11[local27][local34][local41] = Static256.aClass4_Sub24_Sub1_3.method3132(26);
					} else {
						Static209.anIntArrayArrayArray11[local27][local34][local41] = -1;
					}
				}
			}
		}
		Static256.aClass4_Sub24_Sub1_3.method3129();
		local27 = (Static31.anInt653 - Static256.aClass4_Sub24_Sub1_3.anInt3822) / 16;
		Static55.anIntArrayArray13 = new int[local27][4];
		for (local34 = 0; local34 < local27; local34++) {
			for (local41 = 0; local41 < 4; local41++) {
				Static55.anIntArrayArray13[local34][local41] = Static256.aClass4_Sub24_Sub1_3.method3084();
			}
		}
		local34 = Static256.aClass4_Sub24_Sub1_3.method3108();
		local136 = Static127.method2072(Static256.aClass4_Sub24_Sub1_3.method3101());
		local41 = Static256.aClass4_Sub24_Sub1_3.method3096();
		local49 = Static256.aClass4_Sub24_Sub1_3.method3108();
		local148 = Static256.aClass4_Sub24_Sub1_3.method3085();
		Static12.anIntArray8 = new int[local27];
		Static13.aByteArrayArray2 = new byte[local27][];
		Static3.aByteArrayArray1 = new byte[local27][];
		Static204.anIntArray336 = new int[local27];
		Static121.aByteArrayArray9 = new byte[local27][];
		Static212.anIntArray346 = null;
		Static256.anIntArray393 = new int[local27];
		Static37.anIntArray203 = new int[local27];
		Static218.aByteArrayArray11 = new byte[local27][];
		Static307.aByteArrayArray17 = null;
		Static162.anIntArray272 = new int[local27];
		local27 = 0;
		for (@Pc(184) int local184 = 0; local184 < 4; local184++) {
			for (local189 = 0; local189 < 13; local189++) {
				for (local194 = 0; local194 < 13; local194++) {
					local207 = Static209.anIntArrayArrayArray11[local184][local189][local194];
					if (local207 != -1) {
						@Pc(219) int local219 = local207 >> 14 & 0x3FF;
						@Pc(225) int local225 = local207 >> 3 & 0x7FF;
						@Pc(235) int local235 = local225 / 8 + (local219 / 8 << 8);
						@Pc(237) int local237;
						for (local237 = 0; local237 < local27; local237++) {
							if (local235 == Static162.anIntArray272[local237]) {
								local235 = -1;
								break;
							}
						}
						if (local235 != -1) {
							Static162.anIntArray272[local27] = local235;
							local237 = local235 >> 8 & 0xFF;
							@Pc(278) int local278 = local235 & 0xFF;
							Static204.anIntArray336[local27] = Static296.aClass22_105.method661("m" + local237 + "_" + local278);
							Static12.anIntArray8[local27] = Static296.aClass22_105.method661("l" + local237 + "_" + local278);
							Static37.anIntArray203[local27] = Static296.aClass22_105.method661("um" + local237 + "_" + local278);
							Static256.anIntArray393[local27] = Static296.aClass22_105.method661("ul" + local237 + "_" + local278);
							local27++;
						}
					}
				}
			}
		}
		Static104.method1790(local41, local136, local34, local148, local49, local22, false);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!uk;III)V")
	public static void method1798(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class4_Sub21 local12;
		if (arg2 < Static246.anInt4853) {
			local12 = Static261.aClass4_Sub21ArrayArrayArray4[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass67_1 != null && local12.aClass67_1.aClass13_3.method4264()) {
				arg0.method4261(local12.aClass67_1.aClass13_3, 128, 0, 0, true);
			}
		}
		if (arg3 < Static246.anInt4853) {
			local12 = Static261.aClass4_Sub21ArrayArrayArray4[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass67_1 != null && local12.aClass67_1.aClass13_3.method4264()) {
				arg0.method4261(local12.aClass67_1.aClass13_3, 0, 0, 128, true);
			}
		}
		if (arg2 < Static246.anInt4853 && arg3 < Static64.anInt1393) {
			local12 = Static261.aClass4_Sub21ArrayArrayArray4[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass67_1 != null && local12.aClass67_1.aClass13_3.method4264()) {
				arg0.method4261(local12.aClass67_1.aClass13_3, 128, 0, 128, true);
			}
		}
		if (arg2 < Static246.anInt4853 && arg3 > 0) {
			local12 = Static261.aClass4_Sub21ArrayArrayArray4[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass67_1 != null && local12.aClass67_1.aClass13_3.method4264()) {
				arg0.method4261(local12.aClass67_1.aClass13_3, 128, 0, -128, true);
			}
		}
	}
}
