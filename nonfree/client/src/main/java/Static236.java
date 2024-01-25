import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
	public static int anInt4336;

	@OriginalMember(owner = "client!ni", name = "K", descriptor = "Lclient!wg;")
	public static Class246 aClass246_5;

	@OriginalMember(owner = "client!ni", name = "P", descriptor = "J")
	public static long aLong142 = 0L;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BZ)V")
	public static void method3857(@OriginalArg(1) boolean arg0) {
		Static213.aBoolean293 = arg0;
		@Pc(13) int local13;
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(53) int local53;
		if (!Static213.aBoolean293) {
			local13 = Static85.aClass2_Sub13_Sub2_11.method4237();
			@Pc(367) boolean local367 = Static85.aClass2_Sub13_Sub2_11.method4249() == 1;
			@Pc(371) int local371 = Static85.aClass2_Sub13_Sub2_11.method4220();
			local30 = Static85.aClass2_Sub13_Sub2_11.method4196();
			Static37.method813(local30);
			local38 = (Static327.anInt5773 - Static85.aClass2_Sub13_Sub2_11.anInt4788) / 16;
			Static249.anIntArrayArray33 = new int[local38][4];
			for (local42 = 0; local42 < local38; local42++) {
				for (local46 = 0; local46 < 4; local46++) {
					Static249.anIntArrayArray33[local42][local46] = Static85.aClass2_Sub13_Sub2_11.method4239();
				}
			}
			Static345.anIntArray727 = new int[local38];
			Static135.aByteArrayArray9 = new byte[local38][];
			Static371.aByteArrayArray22 = new byte[local38][];
			Static67.aByteArrayArray7 = null;
			Static304.anIntArray254 = null;
			Static383.anIntArray805 = new int[local38];
			Static272.aByteArrayArray17 = new byte[local38][];
			Static37.anIntArray118 = new int[local38];
			Static372.anIntArray785 = new int[local38];
			Static255.anIntArray231 = new int[local38];
			Static385.aByteArrayArray24 = new byte[local38][];
			local38 = 0;
			for (local46 = (local371 - (Static392.anInt6751 >> 4)) / 8; local46 <= ((Static392.anInt6751 >> 4) + local371) / 8; local46++) {
				for (local53 = (local13 - (Static307.anInt5484 >> 4)) / 8; local53 <= ((Static307.anInt5484 >> 4) + local13) / 8; local53++) {
					Static372.anIntArray785[local38] = (local46 << 8) + local53;
					Static255.anIntArray231[local38] = Static200.aClass71_48.method1568("m" + local46 + "_" + local53);
					Static345.anIntArray727[local38] = Static200.aClass71_48.method1568("l" + local46 + "_" + local53);
					Static37.anIntArray118[local38] = Static200.aClass71_48.method1568("um" + local46 + "_" + local53);
					Static383.anIntArray805[local38] = Static200.aClass71_48.method1568("ul" + local46 + "_" + local53);
					local38++;
				}
			}
			Static386.method1339(local371, local13, false, local367);
			return;
		}
		local13 = Static85.aClass2_Sub13_Sub2_11.method4193();
		@Pc(17) int local17 = Static85.aClass2_Sub13_Sub2_11.method4220();
		@Pc(26) boolean local26 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
		local30 = Static85.aClass2_Sub13_Sub2_11.method4245();
		Static37.method813(local13);
		Static85.aClass2_Sub13_Sub2_11.method4252();
		for (local38 = 0; local38 < 4; local38++) {
			for (local42 = 0; local42 < Static392.anInt6751 >> 3; local42++) {
				for (local46 = 0; local46 < Static307.anInt5484 >> 3; local46++) {
					local53 = Static85.aClass2_Sub13_Sub2_11.method4257(1);
					if (local53 == 1) {
						Static32.anIntArrayArrayArray14[local38][local42][local46] = Static85.aClass2_Sub13_Sub2_11.method4257(26);
					} else {
						Static32.anIntArrayArrayArray14[local38][local42][local46] = -1;
					}
				}
			}
		}
		Static85.aClass2_Sub13_Sub2_11.method4262();
		local42 = (Static327.anInt5773 - Static85.aClass2_Sub13_Sub2_11.anInt4788) / 16;
		Static249.anIntArrayArray33 = new int[local42][4];
		for (local46 = 0; local46 < local42; local46++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static249.anIntArrayArray33[local46][local53] = Static85.aClass2_Sub13_Sub2_11.method4239();
			}
		}
		Static272.aByteArrayArray17 = new byte[local42][];
		Static135.aByteArrayArray9 = new byte[local42][];
		Static37.anIntArray118 = new int[local42];
		Static255.anIntArray231 = new int[local42];
		Static383.anIntArray805 = new int[local42];
		Static304.anIntArray254 = null;
		Static372.anIntArray785 = new int[local42];
		Static385.aByteArrayArray24 = new byte[local42][];
		Static67.aByteArrayArray7 = null;
		Static371.aByteArrayArray22 = new byte[local42][];
		Static345.anIntArray727 = new int[local42];
		local42 = 0;
		for (local53 = 0; local53 < 4; local53++) {
			for (@Pc(185) int local185 = 0; local185 < Static392.anInt6751 >> 3; local185++) {
				for (@Pc(189) int local189 = 0; local189 < Static307.anInt5484 >> 3; local189++) {
					@Pc(199) int local199 = Static32.anIntArrayArrayArray14[local53][local185][local189];
					if (local199 != -1) {
						@Pc(208) int local208 = local199 >> 14 & 0x3FF;
						@Pc(214) int local214 = local199 >> 3 & 0x7FF;
						@Pc(224) int local224 = local214 / 8 + (local208 / 8 << 8);
						for (@Pc(226) int local226 = 0; local226 < local42; local226++) {
							if (Static372.anIntArray785[local226] == local224) {
								local224 = -1;
								break;
							}
						}
						if (local224 != -1) {
							Static372.anIntArray785[local42] = local224;
							@Pc(255) int local255 = local224 >> 8 & 0xFF;
							@Pc(259) int local259 = local224 & 0xFF;
							Static255.anIntArray231[local42] = Static200.aClass71_48.method1568("m" + local255 + "_" + local259);
							Static345.anIntArray727[local42] = Static200.aClass71_48.method1568("l" + local255 + "_" + local259);
							Static37.anIntArray118[local42] = Static200.aClass71_48.method1568("um" + local255 + "_" + local259);
							Static383.anIntArray805[local42] = Static200.aClass71_48.method1568("ul" + local255 + "_" + local259);
							local42++;
						}
					}
				}
			}
		}
		Static386.method1339(local17, local30, false, local26);
	}

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)V")
	public static void method3858() {
		Static93.aClass155Array1 = null;
		Static204.method3414(Static335.anInt5875, Static263.anInt4662, 0, 0, -1, 0, Static226.anInt4223, 0);
		if (Static93.aClass155Array1 != null) {
			Static137.method2400(0, Static93.aClass155Array1, Static263.anInt4662, Static335.anInt5875, Static8.anInt188, Static380.aClass155_38.anInt4215, Static98.anInt1948, 0, -1412584499);
			Static93.aClass155Array1 = null;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!qr;[I[IB[I)V")
	public static void method3860(@OriginalArg(0) Class12_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg3.length; local8++) {
			@Pc(14) int local14 = arg3[local8];
			@Pc(18) int local18 = arg2[local8];
			@Pc(22) int local22 = arg1[local8];
			@Pc(24) int local24 = 0;
			while (local18 != 0 && local24 < arg0.aClass95Array3.length) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg0.aClass95Array3[local24] = null;
					} else {
						@Pc(41) Class189 local41 = Static351.aClass175_3.method4107(local14);
						@Pc(44) int local44 = local41.anInt5165;
						@Pc(49) Class95 local49 = arg0.aClass95Array3[local24];
						if (local49 != null) {
							if (local49.anInt2400 == local14) {
								if (local44 == 0) {
									local49 = arg0.aClass95Array3[local24] = null;
								} else if (local44 == 1) {
									local49.anInt2398 = 1;
									local49.anInt2397 = 0;
									local49.anInt2394 = 0;
									local49.anInt2399 = 0;
									local49.anInt2392 = local22;
									Static369.method5563(arg0.aByte74, local41, Static267.aClass12_Sub1_Sub2_Sub2_1 == arg0, arg0.anInt6328, arg0.anInt6317, 0);
								} else if (local44 == 2) {
									local49.anInt2394 = 0;
								}
							} else if (local41.anInt5157 >= Static351.aClass175_3.method4107(local49.anInt2400).anInt5157) {
								local49 = arg0.aClass95Array3[local24] = null;
							}
						}
						if (local49 == null) {
							local49 = arg0.aClass95Array3[local24] = new Class95();
							local49.anInt2394 = 0;
							local49.anInt2400 = local14;
							local49.anInt2392 = local22;
							local49.anInt2399 = 0;
							local49.anInt2397 = 0;
							local49.anInt2398 = 1;
							Static369.method5563(arg0.aByte74, local41, arg0 == Static267.aClass12_Sub1_Sub2_Sub2_1, arg0.anInt6328, arg0.anInt6317, 0);
						}
					}
				}
				local24++;
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method3861(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static344.method5464(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static344.method5464(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(62) StringBuffer local62 = new StringBuffer(local49);
		for (@Pc(64) int local64 = local11; local64 < local14; local64++) {
			@Pc(70) char local70 = arg0.charAt(local64);
			if (Static111.method2142(local70)) {
				@Pc(78) char local78 = Static203.method3382(local70);
				if (local78 != '\u0000') {
					local62.append(local78);
				}
			}
		}
		if (local62.length() == 0) {
			return null;
		} else {
			return local62.toString();
		}
	}
}
