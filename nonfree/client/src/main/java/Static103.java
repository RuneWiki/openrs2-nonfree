import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!jg", name = "R", descriptor = "J")
	public static long aLong88;

	@OriginalMember(owner = "client!jg", name = "A", descriptor = "Lclient!ug;")
	public static Class102 aClass102_21 = new Class102();

	@OriginalMember(owner = "client!jg", name = "N", descriptor = "Lclient!qe;")
	public static Class78 aClass78_493 = Static199.method3560("hitbar_default");

	@OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
	public static int anInt2272 = 0;

	@OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
	public static int anInt2274 = 0;

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "[Lclient!rd;")
	public static Class72_Sub1[] aClass72_Sub1Array1 = new Class72_Sub1[256];

	@OriginalMember(owner = "client!jg", name = "U", descriptor = "[I")
	public static int[] anIntArray391 = new int[5];

	@OriginalMember(owner = "client!jg", name = "V", descriptor = "Lclient!qe;")
	public static Class78 aClass78_494 = Static199.method3560("");

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZILclient!oe;)Lclient!fe;")
	public static Class2_Sub3_Sub8_Sub1 method1781(@OriginalArg(2) int arg0, @OriginalArg(3) Class72 arg1) {
		return Static55.method713(arg0, arg1) ? Static17.method260() : null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V")
	public static void method1783(@OriginalArg(0) boolean arg0) {
		Static160.aBoolean160 = arg0;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(157) int local157;
		@Pc(161) int local161;
		@Pc(165) int local165;
		if (!Static160.aBoolean160) {
			local17 = Static139.aClass2_Sub23_Sub1_4.method2130();
			local21 = Static139.aClass2_Sub23_Sub1_4.method2130();
			local25 = (Static145.anInt3288 - Static139.aClass2_Sub23_Sub1_4.anInt2703) / 16;
			Static13.anIntArrayArray6 = new int[local25][4];
			for (local29 = 0; local29 < local25; local29++) {
				for (local34 = 0; local34 < 4; local34++) {
					Static13.anIntArrayArray6[local29][local34] = Static139.aClass2_Sub23_Sub1_4.method2131();
				}
			}
			local34 = Static139.aClass2_Sub23_Sub1_4.method2142();
			local38 = Static139.aClass2_Sub23_Sub1_4.method2092();
			@Pc(385) boolean local385 = false;
			local42 = Static139.aClass2_Sub23_Sub1_4.method2095();
			Static150.aByteArrayArray10 = new byte[local25][];
			Static69.anIntArray244 = null;
			if ((local21 / 8 == 48 || local21 / 8 == 49) && (local42 / 8) == 48) {
				local385 = true;
			}
			Static171.anIntArray653 = new int[local25];
			Static114.anIntArray434 = new int[local25];
			Static7.aByteArrayArray2 = new byte[local25][];
			Static143.aByteArrayArray9 = null;
			if (local21 / 8 == 48 && local42 / 8 == 148) {
				local385 = true;
			}
			Static220.anIntArray771 = new int[local25];
			local25 = 0;
			for (local157 = (local21 - 6) / 8; local157 <= (local21 + 6) / 8; local157++) {
				for (local161 = (local42 - 6) / 8; local161 <= (local42 + 6) / 8; local161++) {
					local165 = (local157 << 8) + local161;
					if (local385 && (local161 == 49 || local161 == 149 || local161 == 147 || local157 == 50 || local157 == 49 && local161 == 47)) {
						Static171.anIntArray653[local25] = local165;
						Static114.anIntArray434[local25] = -1;
						Static220.anIntArray771[local25] = -1;
					} else {
						Static171.anIntArray653[local25] = local165;
						Static114.anIntArray434[local25] = Static95.aClass72_Sub1_18.method3190(Static94.method1640(new Class78[] { Static201.aClass78_797, Static19.method268(local157), Static6.aClass78_16, Static19.method268(local161) }));
						Static220.anIntArray771[local25] = Static95.aClass72_Sub1_18.method3190(Static94.method1640(new Class78[] { Static4.aClass78_12, Static19.method268(local157), Static6.aClass78_16, Static19.method268(local161) }));
					}
					local25++;
				}
			}
			Static149.method1486(local38, local21, local17, local34, local42);
			return;
		}
		local17 = Static139.aClass2_Sub23_Sub1_4.method2126();
		local21 = Static139.aClass2_Sub23_Sub1_4.method2130();
		local25 = Static139.aClass2_Sub23_Sub1_4.method2095();
		local29 = Static139.aClass2_Sub23_Sub1_4.method2095();
		Static139.aClass2_Sub23_Sub1_4.method2144();
		@Pc(51) int local51;
		for (local34 = 0; local34 < 4; local34++) {
			for (local38 = 0; local38 < 13; local38++) {
				for (local42 = 0; local42 < 13; local42++) {
					local51 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
					if (local51 == 1) {
						Static128.anIntArrayArrayArray6[local34][local38][local42] = Static139.aClass2_Sub23_Sub1_4.method2154(26);
					} else {
						Static128.anIntArrayArrayArray6[local34][local38][local42] = -1;
					}
				}
			}
		}
		Static139.aClass2_Sub23_Sub1_4.method2149();
		local38 = (Static145.anInt3288 - Static139.aClass2_Sub23_Sub1_4.anInt2703) / 16;
		Static13.anIntArrayArray6 = new int[local38][4];
		for (local42 = 0; local42 < local38; local42++) {
			for (local51 = 0; local51 < 4; local51++) {
				Static13.anIntArrayArray6[local42][local51] = Static139.aClass2_Sub23_Sub1_4.method2131();
			}
		}
		local51 = Static139.aClass2_Sub23_Sub1_4.method2130();
		Static69.anIntArray244 = null;
		Static114.anIntArray434 = new int[local38];
		Static143.aByteArrayArray9 = null;
		Static150.aByteArrayArray10 = new byte[local38][];
		Static220.anIntArray771 = new int[local38];
		Static7.aByteArrayArray2 = new byte[local38][];
		Static171.anIntArray653 = new int[local38];
		local38 = 0;
		for (local157 = 0; local157 < 4; local157++) {
			for (local161 = 0; local161 < 13; local161++) {
				for (local165 = 0; local165 < 13; local165++) {
					@Pc(175) int local175 = Static128.anIntArrayArrayArray6[local157][local161][local165];
					if (local175 != -1) {
						@Pc(185) int local185 = local175 >> 14 & 0x3FF;
						@Pc(191) int local191 = local175 >> 3 & 0x7FF;
						@Pc(201) int local201 = local191 / 8 + (local185 / 8 << 8);
						for (@Pc(203) int local203 = 0; local203 < local38; local203++) {
							if (local201 == Static171.anIntArray653[local203]) {
								local201 = -1;
								break;
							}
						}
						if (local201 != -1) {
							Static171.anIntArray653[local38] = local201;
							@Pc(239) int local239 = local201 >> 8 & 0xFF;
							@Pc(243) int local243 = local201 & 0xFF;
							Static114.anIntArray434[local38] = Static95.aClass72_Sub1_18.method3190(Static94.method1640(new Class78[] { Static201.aClass78_797, Static19.method268(local239), Static6.aClass78_16, Static19.method268(local243) }));
							Static220.anIntArray771[local38] = Static95.aClass72_Sub1_18.method3190(Static94.method1640(new Class78[] { Static4.aClass78_12, Static19.method268(local239), Static6.aClass78_16, Static19.method268(local243) }));
							local38++;
						}
					}
				}
			}
		}
		Static149.method1486(local25, local29, local51, local17, local21);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)I")
	public static int method1784(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub3_Sub28 local15 = Static203.method3592(arg0);
		@Pc(18) int local18 = local15.anInt4641;
		@Pc(21) int local21 = local15.anInt4635;
		@Pc(24) int local24 = local15.anInt4637;
		@Pc(31) int local31 = Class109.anIntArray770[local24 - local21];
		return local31 & Static198.anIntArray724[local18] >> local21;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(JB)Lclient!qe;")
	public static Class78 method1785(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(35) int local35 = 0;
			for (@Pc(37) long local37 = arg0; local37 != 0L; local37 /= 37L) {
				local35++;
			}
			@Pc(50) byte[] local50 = new byte[local35];
			while (arg0 != 0L) {
				@Pc(53) long local53 = arg0;
				arg0 /= 37L;
				local35--;
				local50[local35] = Static165.aByteArray47[(int) (local53 - arg0 * 37L)];
			}
			@Pc(80) Class78 local80 = new Class78();
			local80.aByteArray48 = local50;
			local80.anInt3831 = local50.length;
			return local80;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIB)Lclient!ih;")
	public static Class2_Sub3_Sub15 method1787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class2_Sub3_Sub15 local15 = (Class2_Sub3_Sub15) Static2.aClass103_1.method3659((long) arg0 << 32 | (long) arg1);
		if (local15 == null) {
			local15 = new Class2_Sub3_Sub15(arg0, arg1);
			Static2.aClass103_1.method3665(local15.aLong188, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BII[B)Z")
	public static boolean method1789(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(16) boolean local16 = true;
		@Pc(21) Class2_Sub23 local21 = new Class2_Sub23(arg2);
		@Pc(23) int local23 = -1;
		label70: while (true) {
			@Pc(27) int local27 = local21.method2106();
			if (local27 == 0) {
				return local16;
			}
			local23 += local27;
			@Pc(35) int local35 = 0;
			@Pc(37) boolean local37 = false;
			while (true) {
				@Pc(72) int local72;
				@Pc(95) Class2_Sub3_Sub17 local95;
				do {
					@Pc(76) int local76;
					@Pc(66) int local66;
					do {
						do {
							do {
								do {
									@Pc(43) int local43;
									while (local37) {
										local43 = local21.method2111();
										if (local43 == 0) {
											continue label70;
										}
										local21.method2122();
									}
									local43 = local21.method2111();
									if (local43 == 0) {
										continue label70;
									}
									local35 += local43 - 1;
									@Pc(57) int local57 = local35 >> 6 & 0x3F;
									@Pc(61) int local61 = local35 & 0x3F;
									local66 = local61 + arg0;
									local72 = local21.method2122() >> 2;
									local76 = local57 + arg1;
								} while (local76 <= 0);
							} while (local66 <= 0);
						} while (local76 >= 103);
					} while (local66 >= 103);
					local95 = Static121.method3984(local23);
				} while (local72 == 22 && !Static112.aBoolean105 && local95.anInt2380 == 0 && local95.anInt2373 != 1 && !local95.aBoolean90);
				if (!local95.method1870()) {
					local16 = false;
					Static144.anInt3273++;
				}
				local37 = true;
			}
		}
	}
}
