import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!va", name = "I", descriptor = "I")
	public static int anInt6339;

	@OriginalMember(owner = "client!va", name = "M", descriptor = "Lclient!l;")
	public static Class57 aClass57_24;

	@OriginalMember(owner = "client!va", name = "L", descriptor = "[I")
	public static final int[] anIntArray528 = new int[5];

	@OriginalMember(owner = "client!va", name = "O", descriptor = "I")
	public static int anInt6343 = 0;

	@OriginalMember(owner = "client!va", name = "P", descriptor = "I")
	public static int anInt6344 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IC)Z")
	public static boolean method5374(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static331.method5463(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static330.aCharArray11;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (arg0 == local26) {
					return true;
				}
			}
			@Pc(42) char[] local42 = Static268.aCharArray7;
			for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
				@Pc(50) char local50 = local42[local44];
				if (local50 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZZ)V")
	public static void method5376(@OriginalArg(1) boolean arg0) {
		Static297.aBoolean407 = arg0;
		@Pc(17) int local17;
		@Pc(38) int local38;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(168) int local168;
		@Pc(179) int local179;
		@Pc(187) int local187;
		if (!Static297.aBoolean407) {
			local17 = Static20.aClass3_Sub4_Sub2_1.method3640();
			@Pc(21) int local21 = Static20.aClass3_Sub4_Sub2_1.method3675();
			@Pc(30) boolean local30 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
			local38 = (Static306.anInt6046 - Static20.aClass3_Sub4_Sub2_1.anInt4268) / 16;
			Static149.anIntArrayArray20 = new int[local38][4];
			for (local44 = 0; local44 < local38; local44++) {
				for (local48 = 0; local48 < 4; local48++) {
					Static149.anIntArrayArray20[local44][local48] = Static20.aClass3_Sub4_Sub2_1.method3636();
				}
			}
			local48 = Static20.aClass3_Sub4_Sub2_1.method3648();
			local74 = Static20.aClass3_Sub4_Sub2_1.method3638();
			local78 = Static20.aClass3_Sub4_Sub2_1.method3675();
			local82 = Static20.aClass3_Sub4_Sub2_1.method3648();
			Static151.method2441(local48);
			Static169.anIntArray239 = new int[local38];
			Static54.anIntArray76 = null;
			Static76.aByteArrayArray8 = null;
			Static81.aByteArrayArray9 = new byte[local38][];
			Static73.aByteArrayArray7 = new byte[local38][];
			Static277.anIntArray439 = new int[local38];
			Static290.aByteArrayArray19 = new byte[local38][];
			Static269.anIntArray432 = new int[local38];
			Static314.anIntArray512 = new int[local38];
			Static314.anIntArray511 = new int[local38];
			Static112.aByteArrayArray12 = new byte[local38][];
			@Pc(118) boolean local118 = false;
			if ((local74 / 8 == 48 || local74 / 8 == 49) && (local17 / 8) == 48) {
				local118 = true;
			}
			local38 = 0;
			if (local74 / 8 == 48 && local17 / 8 == 148) {
				local118 = true;
			}
			for (local168 = (local74 - (Static162.anInt2152 >> 4)) / 8; local168 <= (local74 + (Static162.anInt2152 >> 4)) / 8; local168++) {
				for (local179 = (local17 - (Static122.anInt2632 >> 4)) / 8; local179 <= ((Static122.anInt2632 >> 4) + local17) / 8; local179++) {
					local187 = local179 + (local168 << 8);
					if (local118 && (local179 == 49 || local179 == 149 || local179 == 147 || local168 == 50 || local168 == 49 && local179 == 47)) {
						Static169.anIntArray239[local38] = local187;
						Static314.anIntArray511[local38] = -1;
						Static314.anIntArray512[local38] = -1;
						Static277.anIntArray439[local38] = -1;
						Static269.anIntArray432[local38] = -1;
					} else {
						Static169.anIntArray239[local38] = local187;
						Static314.anIntArray511[local38] = Static50.aClass100_20.method2304("m" + local168 + "_" + local179);
						Static314.anIntArray512[local38] = Static50.aClass100_20.method2304("l" + local168 + "_" + local179);
						Static277.anIntArray439[local38] = Static50.aClass100_20.method2304("um" + local168 + "_" + local179);
						Static269.anIntArray432[local38] = Static50.aClass100_20.method2304("ul" + local168 + "_" + local179);
					}
					local38++;
				}
			}
			Static243.method4157(false, local78, local30, local82, local17, local74, local21);
			return;
		}
		local17 = Static20.aClass3_Sub4_Sub2_1.method3643();
		@Pc(362) boolean local362 = Static20.aClass3_Sub4_Sub2_1.method3617() == 1;
		@Pc(366) int local366 = Static20.aClass3_Sub4_Sub2_1.method3675();
		local38 = Static20.aClass3_Sub4_Sub2_1.method3675();
		local44 = Static20.aClass3_Sub4_Sub2_1.method3649();
		local48 = Static20.aClass3_Sub4_Sub2_1.method3638();
		local74 = Static20.aClass3_Sub4_Sub2_1.method3648();
		Static151.method2441(local74);
		Static20.aClass3_Sub4_Sub2_1.method3688();
		@Pc(398) int local398;
		for (local78 = 0; local78 < 4; local78++) {
			for (local82 = 0; local82 < Static162.anInt2152 >> 3; local82++) {
				for (local398 = 0; local398 < Static122.anInt2632 >> 3; local398++) {
					local168 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
					if (local168 == 1) {
						Static94.anIntArrayArrayArray1[local78][local82][local398] = Static20.aClass3_Sub4_Sub2_1.method3681(26);
					} else {
						Static94.anIntArrayArrayArray1[local78][local82][local398] = -1;
					}
				}
			}
		}
		Static20.aClass3_Sub4_Sub2_1.method3680();
		local82 = (Static306.anInt6046 - Static20.aClass3_Sub4_Sub2_1.anInt4268) / 16;
		Static149.anIntArrayArray20 = new int[local82][4];
		for (local398 = 0; local398 < local82; local398++) {
			for (local168 = 0; local168 < 4; local168++) {
				Static149.anIntArrayArray20[local398][local168] = Static20.aClass3_Sub4_Sub2_1.method3642();
			}
		}
		Static112.aByteArrayArray12 = new byte[local82][];
		Static76.aByteArrayArray8 = null;
		Static269.anIntArray432 = new int[local82];
		Static290.aByteArrayArray19 = new byte[local82][];
		Static169.anIntArray239 = new int[local82];
		Static277.anIntArray439 = new int[local82];
		Static81.aByteArrayArray9 = new byte[local82][];
		Static54.anIntArray76 = null;
		Static73.aByteArrayArray7 = new byte[local82][];
		Static314.anIntArray511 = new int[local82];
		Static314.anIntArray512 = new int[local82];
		local82 = 0;
		for (local168 = 0; local168 < 4; local168++) {
			for (local179 = 0; local179 < Static162.anInt2152 >> 3; local179++) {
				for (local187 = 0; local187 < Static122.anInt2632 >> 3; local187++) {
					@Pc(539) int local539 = Static94.anIntArrayArrayArray1[local168][local179][local187];
					if (local539 != -1) {
						@Pc(548) int local548 = local539 >> 14 & 0x3FF;
						@Pc(554) int local554 = local539 >> 3 & 0x7FF;
						@Pc(564) int local564 = local554 / 8 + (local548 / 8 << 8);
						for (@Pc(566) int local566 = 0; local566 < local82; local566++) {
							if (local564 == Static169.anIntArray239[local566]) {
								local564 = -1;
								break;
							}
						}
						if (local564 != -1) {
							Static169.anIntArray239[local82] = local564;
							@Pc(602) int local602 = local564 >> 8 & 0xFF;
							@Pc(606) int local606 = local564 & 0xFF;
							Static314.anIntArray511[local82] = Static50.aClass100_20.method2304("m" + local602 + "_" + local606);
							Static314.anIntArray512[local82] = Static50.aClass100_20.method2304("l" + local602 + "_" + local606);
							Static277.anIntArray439[local82] = Static50.aClass100_20.method2304("um" + local602 + "_" + local606);
							Static269.anIntArray432[local82] = Static50.aClass100_20.method2304("ul" + local602 + "_" + local606);
							local82++;
						}
					}
				}
			}
		}
		Static243.method4157(false, local44, local362, local17, local38, local366, local48);
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(II)I")
	public static int method5377(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}
}
