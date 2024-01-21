import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!id", name = "db", descriptor = "I")
	public static int anInt2057;

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "[I")
	public static int[] anIntArray342 = new int[] { 0, 0, 0, 0, -2, 0, 2, 0, -1, 0, 8, 0, 0, 0, 0, 0, 0, 3, 7, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0, 0, 0, 0, 2, 0, -2, 0, 4, 0, 0, 0, 0, 0, -2, 5, -2, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 7, 0, 15, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, -2, 0, 12, 0, 6, 0, 6, 0, 0, 0, 0, 0, 0, 0, 6, 6, 0, 0, 0, -1, 0, -2, 0, 0, 5, 0, 0, 0, 0, 0, -2, 1, 0, 0, 0, 0, -1, 0, 0, 6, 0, 0, -2, 3, 0, 0, 8, 0, 0, 0, 0, 2, 0, 20, 0, 0, 0, 4, 4, 0, 0, 0, 11, 0, 2, -2, 0, 0, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 2, 0, 0, 1, 6, 0, 0, 0, 0, 0, 4, 0, 14, 0, 0, 0, 0, 6, 0, 0, 0, 0, -2, 0, 1, -2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 11, 0, 6, 6, 0, 0, -1, 3, 0, 0, -1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 6, 0, 0, 0, 0, 24, 0, 0, 0, 0, 0, 0, 4, 0, -2, 0, 0, 0, 0, 0, 0, 6, 0, -2, 0 };

	@OriginalMember(owner = "client!id", name = "hb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_605 = Static170.method3101("::rect_debug");

	@OriginalMember(owner = "client!id", name = "nb", descriptor = "Lclient!pa;")
	public static Class63 aClass63_10 = new Class63(64);

	@OriginalMember(owner = "client!id", name = "qb", descriptor = "I")
	public static int anInt2068 = 0;

	@OriginalMember(owner = "client!id", name = "rb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_606 = Static170.method3101("Sprites geladen)3");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!gf;Z)I")
	public static int method1601(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1) {
		if (arg1.anIntArrayArray19 == null || arg0 >= arg1.anIntArrayArray19.length) {
			return -2;
		}
		try {
			@Pc(22) int[] local22 = arg1.anIntArrayArray19[arg0];
			@Pc(29) int local29 = 0;
			@Pc(31) byte local31 = 0;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(38) int local38 = local22[local33++];
				@Pc(40) byte local40 = 0;
				@Pc(42) int local42 = 0;
				if (local38 == 0) {
					return local29;
				}
				if (local38 == 15) {
					local40 = 1;
				}
				if (local38 == 16) {
					local40 = 2;
				}
				if (local38 == 1) {
					local42 = Static18.anIntArray144[local22[local33++]];
				}
				if (local38 == 17) {
					local40 = 3;
				}
				if (local38 == 2) {
					local42 = Static95.anIntArray451[local22[local33++]];
				}
				if (local38 == 3) {
					local42 = Static111.anIntArray498[local22[local33++]];
				}
				@Pc(108) int local108;
				@Pc(119) Class33 local119;
				@Pc(124) int local124;
				@Pc(137) int local137;
				if (local38 == 4) {
					local108 = local22[local33++] << 16;
					@Pc(115) int local115 = local108 + local22[local33++];
					local119 = Static19.method576(local115);
					local124 = local22[local33++];
					if (local124 != -1 && (!Static76.method1736(local124).aBoolean103 || Static86.aBoolean127)) {
						for (local137 = 0; local137 < local119.anIntArray261.length; local137++) {
							if (local124 + 1 == local119.anIntArray261[local137]) {
								local42 += local119.anIntArray266[local137];
							}
						}
					}
				}
				if (local38 == 5) {
					local42 = Static72.anIntArray354[local22[local33++]];
				}
				if (local38 == 6) {
					local42 = Class3_Sub2_Sub13.anIntArray450[Static95.anIntArray451[local22[local33++]] - 1];
				}
				if (local38 == 7) {
					local42 = Static72.anIntArray354[local22[local33++]] * 100 / 46875;
				}
				if (local38 == 8) {
					local42 = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt877;
				}
				if (local38 == 9) {
					for (local108 = 0; local108 < 25; local108++) {
						if (Static50.aBooleanArray10[local108]) {
							local42 += Static95.anIntArray451[local108];
						}
					}
				}
				if (local38 == 10) {
					local108 = local22[local33++] << 16;
					local108 += local22[local33++];
					local119 = Static19.method576(local108);
					local124 = local22[local33++];
					if (local124 != -1 && (!Static76.method1736(local124).aBoolean103 || Static86.aBoolean127)) {
						for (local137 = 0; local137 < local119.anIntArray261.length; local137++) {
							if (local119.anIntArray261[local137] == local124 + 1) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local38 == 11) {
					local42 = Static139.anInt3674;
				}
				if (local38 == 12) {
					local42 = Static35.anInt1048;
				}
				if (local38 == 13) {
					local108 = Static72.anIntArray354[local22[local33++]];
					@Pc(317) int local317 = local22[local33++];
					local42 = (local108 & 0x1 << local317) == 0 ? 0 : 1;
				}
				if (local38 == 14) {
					local108 = local22[local33++];
					local42 = Static138.method2708(local108);
				}
				if (local38 == 18) {
					local42 = Static111.anInt2843 + (Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 >> 7);
				}
				if (local38 == 19) {
					local42 = (Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 >> 7) + Static29.anInt907;
				}
				if (local38 == 20) {
					local42 = local22[local33++];
				}
				if (local40 == 0) {
					if (local31 == 0) {
						local29 += local42;
					}
					if (local31 == 1) {
						local29 -= local42;
					}
					if (local31 == 2 && local42 != 0) {
						local29 /= local42;
					}
					if (local31 == 3) {
						local29 *= local42;
					}
					local31 = 0;
				} else {
					local31 = local40;
				}
			}
		} catch (@Pc(420) Exception local420) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
	public static void method1602() {
		aClass28_605 = null;
		aClass63_10 = null;
		anIntArray342 = null;
		aClass28_606 = null;
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
	public static void method1603() {
		Static18.aClass3_Sub8_Sub1_1.method1560();
		@Pc(11) int local11 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
		if (local11 == 0) {
			return;
		}
		@Pc(27) int local27 = Static18.aClass3_Sub8_Sub1_1.method1557(2);
		if (local27 == 0) {
			Static171.anIntArray684[Static81.anInt2370++] = 2047;
			return;
		}
		@Pc(46) int local46;
		@Pc(58) int local58;
		if (local27 == 1) {
			local46 = Static18.aClass3_Sub8_Sub1_1.method1557(3);
			Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.method1437(local46, false);
			local58 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
			if (local58 == 1) {
				Static171.anIntArray684[Static81.anInt2370++] = 2047;
			}
			return;
		}
		@Pc(108) int local108;
		if (local27 == 2) {
			local46 = Static18.aClass3_Sub8_Sub1_1.method1557(3);
			Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.method1437(local46, true);
			local58 = Static18.aClass3_Sub8_Sub1_1.method1557(3);
			Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.method1437(local58, true);
			local108 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
			if (local108 == 1) {
				Static171.anIntArray684[Static81.anInt2370++] = 2047;
			}
		} else if (local27 == 3) {
			local46 = Static18.aClass3_Sub8_Sub1_1.method1557(7);
			local58 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
			if (local58 == 1) {
				Static171.anIntArray684[Static81.anInt2370++] = 2047;
			}
			local108 = Static18.aClass3_Sub8_Sub1_1.method1557(7);
			Static171.anInt4109 = Static18.aClass3_Sub8_Sub1_1.method1557(2);
			@Pc(167) int local167 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
			Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.method1431(local108, local167 == 1, local46);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZZZI)Lclient!fd;")
	public static Class7_Sub1 method1604(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class34 local9 = null;
		if (Static128.aClass19_5 != null) {
			local9 = new Class34(arg3, Static128.aClass19_5, Static69.aClass19Array1[arg3], 1000000);
		}
		return new Class7_Sub1(local9, Static33.aClass34_1, arg3, arg1, arg2, arg0);
	}
}
