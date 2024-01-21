import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "[I")
	public static int[] anIntArray120;

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "[I")
	public static int[] anIntArray121;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Lclient!rd;")
	private static Class64 aClass64_495 = Static69.method1153("Loaded fonts");

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "J")
	public static long aLong27 = 0L;

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "Lclient!rd;")
	public static Class64 aClass64_501 = Static69.method1153("");

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Lclient!rd;")
	public static Class64 aClass64_496 = aClass64_501;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Lclient!rd;")
	public static Class64 aClass64_497 = aClass64_501;

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_498 = aClass64_501;

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_499 = aClass64_501;

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "Lclient!rd;")
	public static Class64 aClass64_500 = Static69.method1153("k");

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "Lclient!rd;")
	public static Class64 aClass64_502 = aClass64_501;

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "Lclient!rd;")
	public static Class64 aClass64_503 = aClass64_501;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "Lclient!rd;")
	public static Class64 aClass64_504 = Static69.method1153("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "Lclient!rd;")
	public static Class64 aClass64_505 = aClass64_495;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)I")
	public static int method561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 13;
		@Pc(30) int local30 = Integer.MAX_VALUE & local16 * (local16 * 15731 * local16 + 789221) + 1376312589;
		return local30 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZB)V")
	public static void method564(@OriginalArg(0) boolean arg0) {
		Static121.aBoolean170 = arg0;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(49) int local49;
		@Pc(151) int local151;
		@Pc(155) int local155;
		if (!Static121.aBoolean170) {
			local13 = Static64.aClass1_Sub6_Sub1_2.method1857();
			local17 = Static64.aClass1_Sub6_Sub1_2.method1842();
			local21 = Static64.aClass1_Sub6_Sub1_2.method1855();
			local25 = (Static62.anInt1454 - Static64.aClass1_Sub6_Sub1_2.anInt2574) / 16;
			Static23.anIntArrayArray5 = new int[local25][4];
			for (local29 = 0; local29 < local25; local29++) {
				for (local34 = 0; local34 < 4; local34++) {
					Static23.anIntArrayArray5[local29][local34] = Static64.aClass1_Sub6_Sub1_2.method1817();
				}
			}
			local34 = Static64.aClass1_Sub6_Sub1_2.method1842();
			@Pc(384) boolean local384 = false;
			local38 = Static64.aClass1_Sub6_Sub1_2.method1850();
			Static61.anIntArray222 = new int[local25];
			Static27.anIntArray137 = new int[local25];
			Static62.anIntArray226 = new int[local25];
			if ((local38 / 8 == 48 || local38 / 8 == 49) && local17 / 8 == 48) {
				local384 = true;
			}
			Static31.aByteArrayArray2 = new byte[local25][];
			if (local38 / 8 == 48 && local17 / 8 == 148) {
				local384 = true;
			}
			Static11.aByteArrayArray1 = new byte[local25][];
			local25 = 0;
			for (local49 = (local38 - 6) / 8; local49 <= (local38 + 6) / 8; local49++) {
				for (local151 = (local17 - 6) / 8; local151 <= (local17 + 6) / 8; local151++) {
					local155 = (local49 << 8) + local151;
					if (!local384 || local151 != 49 && local151 != 149 && local151 != 147 && local49 != 50 && (local49 != 49 || local151 != 47)) {
						Static62.anIntArray226[local25] = local155;
						Static61.anIntArray222[local25] = Static81.aClass41_Sub1_11.method1066(Static82.method1383(new Class64[] { Static17.aClass64_346, Static12.method1395(local49), Static51.aClass64_766, Static12.method1395(local151) }));
						Static27.anIntArray137[local25] = Static81.aClass41_Sub1_11.method1066(Static82.method1383(new Class64[] { Static91.aClass64_1294, Static12.method1395(local49), Static51.aClass64_766, Static12.method1395(local151) }));
						local25++;
					}
				}
			}
			Static21.method415(local34, local21, local13, local38, local17);
			return;
		}
		local13 = Static64.aClass1_Sub6_Sub1_2.method1857();
		local17 = Static64.aClass1_Sub6_Sub1_2.method1850();
		local21 = Static64.aClass1_Sub6_Sub1_2.method1850();
		local25 = Static64.aClass1_Sub6_Sub1_2.method1850();
		local29 = Static64.aClass1_Sub6_Sub1_2.method1855();
		Static64.aClass1_Sub6_Sub1_2.method1879();
		@Pc(42) int local42;
		for (local34 = 0; local34 < 4; local34++) {
			for (local38 = 0; local38 < 13; local38++) {
				for (local42 = 0; local42 < 13; local42++) {
					local49 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
					if (local49 == 1) {
						Static2.anIntArrayArrayArray1[local34][local38][local42] = Static64.aClass1_Sub6_Sub1_2.method1873(26);
					} else {
						Static2.anIntArrayArrayArray1[local34][local38][local42] = -1;
					}
				}
			}
		}
		Static64.aClass1_Sub6_Sub1_2.method1878();
		local38 = (Static62.anInt1454 - Static64.aClass1_Sub6_Sub1_2.anInt2574) / 16;
		Static23.anIntArrayArray5 = new int[local38][4];
		for (local42 = 0; local42 < local38; local42++) {
			for (local49 = 0; local49 < 4; local49++) {
				Static23.anIntArrayArray5[local42][local49] = Static64.aClass1_Sub6_Sub1_2.method1845();
			}
		}
		Static62.anIntArray226 = new int[local38];
		Static31.aByteArrayArray2 = new byte[local38][];
		Static11.aByteArrayArray1 = new byte[local38][];
		Static27.anIntArray137 = new int[local38];
		Static61.anIntArray222 = new int[local38];
		local38 = 0;
		for (local49 = 0; local49 < 4; local49++) {
			for (local151 = 0; local151 < 13; local151++) {
				for (local155 = 0; local155 < 13; local155++) {
					@Pc(165) int local165 = Static2.anIntArrayArrayArray1[local49][local151][local155];
					if (local165 != -1) {
						@Pc(174) int local174 = local165 >> 14 & 0x3FF;
						@Pc(180) int local180 = local165 >> 3 & 0x7FF;
						@Pc(190) int local190 = (local174 / 8 << 8) + local180 / 8;
						for (@Pc(192) int local192 = 0; local192 < local38; local192++) {
							if (local190 == Static62.anIntArray226[local192]) {
								local190 = -1;
								break;
							}
						}
						if (local190 != -1) {
							@Pc(224) int local224 = local190 >> 8 & 0xFF;
							@Pc(228) int local228 = local190 & 0xFF;
							Static62.anIntArray226[local38] = local190;
							Static61.anIntArray222[local38] = Static81.aClass41_Sub1_11.method1066(Static82.method1383(new Class64[] { Static17.aClass64_346, Static12.method1395(local224), Static51.aClass64_766, Static12.method1395(local228) }));
							Static27.anIntArray137[local38] = Static81.aClass41_Sub1_11.method1066(Static82.method1383(new Class64[] { Static91.aClass64_1294, Static12.method1395(local224), Static51.aClass64_766, Static12.method1395(local228) }));
							local38++;
						}
					}
				}
			}
		}
		Static21.method415(local21, local17, local13, local29, local25);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJ)Lclient!rd;")
	public static Class64 method565(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(35) long local35 = arg0;
			@Pc(37) int local37 = 0;
			while (local35 != 0L) {
				local35 /= 37L;
				local37++;
			}
			@Pc(53) byte[] local53 = new byte[local37];
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				local37--;
				local53[local37] = Static10.aByteArray3[(int) (local57 - arg0 * 37L)];
			}
			@Pc(84) Class64 local84 = new Class64();
			local84.aByteArray24 = local53;
			local84.anInt2086 = local53.length;
			return local84;
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
	public static void method566() {
		aClass64_503 = null;
		aClass64_496 = null;
		aClass64_498 = null;
		aClass64_501 = null;
		aClass64_502 = null;
		aClass64_504 = null;
		aClass64_497 = null;
		anIntArray120 = null;
		aClass64_500 = null;
		aClass64_495 = null;
		anIntArray121 = null;
		aClass64_505 = null;
		aClass64_499 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V")
	public static void method568(@OriginalArg(1) int arg0) {
		@Pc(8) int[] local8 = Static83.aClass1_Sub1_Sub5_Sub2_5.anIntArray150;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(42) int local42;
		@Pc(44) int local44;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local42 = (103 - local29) * 512 * 4 + 24628;
			for (local44 = 1; local44 < 103; local44++) {
				if ((Static18.aByteArrayArrayArray2[arg0][local44][local29] & 0x18) == 0) {
					Static82.aClass68_1.method1790(local8, local42, arg0, local44, local29);
				}
				if (arg0 < 3 && (Static18.aByteArrayArrayArray2[arg0 + 1][local44][local29] & 0x8) != 0) {
					Static82.aClass68_1.method1790(local8, local42, arg0 + 1, local44, local29);
				}
				local42 += 4;
			}
		}
		local42 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + -10 + 238 << 8) + 238 - 10;
		Static83.aClass1_Sub1_Sub5_Sub2_5.method771();
		local44 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(154) int local154;
		for (@Pc(150) int local150 = 1; local150 < 103; local150++) {
			for (local154 = 1; local154 < 103; local154++) {
				if ((Static18.aByteArrayArrayArray2[arg0][local154][local150] & 0x18) == 0) {
					Static44.method804(local150, local154, local42, local44, arg0);
				}
				if (arg0 < 3 && (Static18.aByteArrayArrayArray2[arg0 + 1][local154][local150] & 0x8) != 0) {
					Static44.method804(local150, local154, local42, local44, arg0 + 1);
				}
			}
		}
		Static64.anInt1483 = 0;
		for (local154 = 0; local154 < 104; local154++) {
			for (@Pc(224) int local224 = 0; local224 < 104; local224++) {
				@Pc(232) int local232 = Static82.aClass68_1.method1786(Static15.anInt463, local154, local224);
				if (local232 != 0) {
					local232 = local232 >> 14 & 0x7FFF;
					@Pc(245) int local245 = Static108.method1807(local232).anInt416;
					if (local245 >= 0) {
						@Pc(252) int local252 = local224;
						@Pc(254) int local254 = local154;
						if (local245 != 22 && local245 != 29 && local245 != 34 && local245 != 36 && local245 != 46 && local245 != 47 && local245 != 48) {
							@Pc(290) int[][] local290 = Static74.aClass52Array1[Static15.anInt463].anIntArrayArray22;
							for (@Pc(292) int local292 = 0; local292 < 10; local292++) {
								@Pc(299) int local299 = (int) (Math.random() * 4.0D);
								if (local299 == 0 && local254 > 0 && local154 - 3 < local254 && (local290[local254 - 1][local252] & 0x1280108) == 0) {
									local254--;
								}
								if (local299 == 1 && local254 < 103 && local154 + 3 > local254 && (local290[local254 + 1][local252] & 0x1280180) == 0) {
									local254++;
								}
								if (local299 == 2 && local252 > 0 && local252 > local224 - 3 && (local290[local254][local252 - 1] & 0x1280102) == 0) {
									local252--;
								}
								if (local299 == 3 && local252 < 103 && local224 + 3 > local252 && (local290[local254][local252 + 1] & 0x1280120) == 0) {
									local252++;
								}
							}
						}
						Static46.aClass1_Sub1_Sub5_Sub2Array3[Static64.anInt1483] = Static103.aClass1_Sub1_Sub5_Sub2Array12[local245];
						Static103.anIntArray346[Static64.anInt1483] = local254;
						Static99.anIntArray328[Static64.anInt1483] = local252;
						Static64.anInt1483++;
					}
				}
			}
		}
	}
}
