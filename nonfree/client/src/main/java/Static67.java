import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Lclient!w;")
	public static Class15 aClass15_26;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "[I")
	public static int[] anIntArray194;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!w;")
	public static Class15 aClass15_27;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public static int anInt1769;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	public static int anInt1771;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!va;")
	private static Class61 aClass61_733 = Static88.method1421("Loading textures )2 ");

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "Lclient!va;")
	public static Class61 aClass61_732 = aClass61_733;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!i;")
	public static Class29 aClass29_48 = new Class29(200);

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "[I")
	public static int[] anIntArray195 = new int[5];

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "Lclient!va;")
	private static Class61 aClass61_735 = Static88.method1421("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "Lclient!va;")
	public static Class61 aClass61_734 = aClass61_735;

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
	public static int anInt1776 = 0;

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
	public static int anInt1779 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method959() {
		if (Static74.anInt1876 != 0) {
			return;
		}
		@Pc(17) int local17 = Static19.anInt630;
		if (Static20.anInt2651 == 1 && Static12.anInt333 >= 516 && anInt1776 >= 160 && Static12.anInt333 <= 765 && anInt1776 <= 205) {
			local17 = 0;
		}
		@Pc(55) int local55;
		@Pc(113) int local113;
		@Pc(119) int local119;
		if (!Static82.aBoolean97) {
			if (local17 == 1 && Static23.anInt747 > 0) {
				local55 = Static29.anIntArray96[Static23.anInt747 - 1];
				if (local55 == 3 || local55 == 6 || local55 == 38 || local55 == 29 || local55 == 42 || local55 == 16 || local55 == 11 || local55 == 20 || local55 == 18 || local55 == 36 || local55 == 27 || local55 == 1006) {
					local113 = Static38.anIntArray121[Static23.anInt747 - 1];
					local119 = Static22.anIntArray78[Static23.anInt747 - 1];
					@Pc(123) Class10_Sub1_Sub4 local123 = Static103.method591(local119);
					if (local123.aBoolean30 || local123.aBoolean27) {
						Static64.anInt1734 = 0;
						Static105.anInt2626 = anInt1776;
						Static37.anInt1052 = Static12.anInt333;
						Static74.anInt1876 = 2;
						Static48.anInt1330 = local113;
						Static103.anInt993 = local119;
						if (local119 >> 16 == Static23.anInt752) {
							Static74.anInt1876 = 1;
						}
						Static39.aBoolean8 = false;
						if (Static74.anInt1871 == local119 >> 16) {
							Static74.anInt1876 = 3;
						}
						return;
					}
				}
			}
			if (local17 == 1 && (Static69.anInt1817 == 1 || Static38.method635(Static23.anInt747 - 1)) && Static23.anInt747 > 2) {
				local17 = 2;
			}
			if (local17 == 1 && Static23.anInt747 > 0) {
				Static58.method839(Static23.anInt747 - 1);
			}
			if (local17 == 2 && Static23.anInt747 > 0) {
				Static55.method814();
			}
			return;
		}
		if (local17 != 1) {
			local55 = Static28.anInt889;
			local113 = Static17.anInt597;
			if (Static10.anInt311 == 0) {
				local113 -= 4;
				local55 -= 4;
			}
			if (Static10.anInt311 == 1) {
				local55 -= 553;
				local113 -= 205;
			}
			if (Static10.anInt311 == 2) {
				local113 -= 357;
				local55 -= 17;
			}
			if (local55 < Static75.anInt2014 - 10 || local55 > Static80.anInt2153 + Static75.anInt2014 + 10 || local113 < Static32.anInt942 - 10 || local113 > anInt1771 + Static32.anInt942 + 10) {
				Static82.aBoolean97 = false;
				if (Static10.anInt311 == 2) {
					Static7.aBoolean1 = true;
				}
				if (Static10.anInt311 == 1) {
					Static80.aBoolean94 = true;
				}
			}
		}
		if (local17 != 1) {
			return;
		}
		local55 = Static75.anInt2014;
		local113 = Static32.anInt942;
		local119 = Static80.anInt2153;
		@Pc(290) int local290 = Static12.anInt333;
		@Pc(292) int local292 = anInt1776;
		if (Static10.anInt311 == 0) {
			local290 -= 4;
			local292 -= 4;
		}
		if (Static10.anInt311 == 1) {
			local290 -= 553;
			local292 -= 205;
		}
		if (Static10.anInt311 == 2) {
			local292 -= 357;
			local290 -= 17;
		}
		@Pc(310) int local310 = -1;
		for (@Pc(312) int local312 = 0; local312 < Static23.anInt747; local312++) {
			@Pc(327) int local327 = local113 + (-local312 + Static23.anInt747 + -1) * 15 + 31;
			if (local55 < local290 && local290 < local55 + local119 && local292 > local327 - 13 && local327 + 3 > local292) {
				local310 = local312;
			}
		}
		if (local310 != -1) {
			Static58.method839(local310);
		}
		Static82.aBoolean97 = false;
		if (Static10.anInt311 == 2) {
			Static7.aBoolean1 = true;
		}
		if (Static10.anInt311 == 1) {
			Static80.aBoolean94 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public static void method963() {
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(46) int local46;
		if (Static96.anInt2447 == 61) {
			local14 = Static55.aClass10_Sub10_Sub1_4.method1111();
			local22 = Static29.anInt897 + (local14 >> 4 & 0x7);
			local28 = Static65.anInt1747 + (local14 & 0x7);
			local32 = Static55.aClass10_Sub10_Sub1_4.method1160();
			local36 = Static55.aClass10_Sub10_Sub1_4.method1111();
			local42 = local36 >> 4 & 0xF;
			local46 = local36 & 0x7;
			if (Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0] >= local22 - local42 && Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0] <= local42 + local22 && Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0] >= local28 - local42 && Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0] <= local42 + local28 && Static88.anInt2323 != 0 && local46 > 0 && Static41.anInt1196 < 50) {
				Static63.anIntArray56[Static41.anInt1196] = local32;
				Static94.anIntArray318[Static41.anInt1196] = local46;
				Static98.anIntArray327[Static41.anInt1196] = 0;
				Static74.aClass36Array1[Static41.anInt1196] = null;
				Static41.anInt1196++;
			}
		}
		if (Static96.anInt2447 == 209) {
			local14 = Static55.aClass10_Sub10_Sub1_4.method1135();
			local22 = local14 >> 2;
			local28 = local14 & 0x3;
			local32 = Static18.anIntArray70[local22];
			local36 = Static55.aClass10_Sub10_Sub1_4.method1111();
			local46 = (local36 & 0x7) + Static65.anInt1747;
			local42 = Static29.anInt897 + (local36 >> 4 & 0x7);
			if (local42 >= 0 && local46 >= 0 && local42 < 104 && local46 < 104) {
				Static78.method1235(local32, local42, -1, -1, 0, Static101.anInt2582, local22, local28, local46);
			}
			return;
		}
		@Pc(219) int local219;
		@Pc(251) int local251;
		@Pc(263) int local263;
		@Pc(283) int local283;
		@Pc(300) int local300;
		@Pc(273) int local273;
		if (Static96.anInt2447 == 18) {
			local14 = Static55.aClass10_Sub10_Sub1_4.method1143();
			local22 = local14 >> 2;
			local28 = local14 & 0x3;
			local32 = Static18.anIntArray70[local22];
			local36 = Static55.aClass10_Sub10_Sub1_4.method1119();
			local42 = Static55.aClass10_Sub10_Sub1_4.method1135();
			local219 = (local42 & 0x7) + Static65.anInt1747;
			local46 = (local42 >> 4 & 0x7) + Static29.anInt897;
			if (local46 >= 0 && local219 >= 0 && local46 < 103 && local219 < 103) {
				local251 = Static37.anIntArrayArrayArray1[Static101.anInt2582][local46][local219];
				local263 = Static37.anIntArrayArrayArray1[Static101.anInt2582][local46 + 1][local219 + 1];
				local273 = Static37.anIntArrayArrayArray1[Static101.anInt2582][local46 + 1][local219];
				local283 = Static37.anIntArrayArrayArray1[Static101.anInt2582][local46][local219 + 1];
				if (local32 == 0) {
					@Pc(291) Class57 local291 = Static48.aClass54_1.method1357(Static101.anInt2582, local46, local219);
					if (local291 != null) {
						local300 = local291.anInt2316 >> 14 & 0x7FFF;
						if (local22 == 2) {
							local291.aClass10_Sub1_Sub5_7 = new Class10_Sub1_Sub5_Sub6(local300, 2, local28 + 4, local251, local273, local263, local283, local36, false);
							local291.aClass10_Sub1_Sub5_8 = new Class10_Sub1_Sub5_Sub6(local300, 2, local28 + 1 & 0x3, local251, local273, local263, local283, local36, false);
						} else {
							local291.aClass10_Sub1_Sub5_7 = new Class10_Sub1_Sub5_Sub6(local300, local22, local28, local251, local273, local263, local283, local36, false);
						}
					}
				}
				if (local32 == 1) {
					@Pc(362) Class4 local362 = Static48.aClass54_1.method1360(Static101.anInt2582, local46, local219);
					if (local362 != null) {
						local362.aClass10_Sub1_Sub5_1 = new Class10_Sub1_Sub5_Sub6(local362.anInt20 >> 14 & 0x7FFF, 4, 0, local251, local273, local263, local283, local36, false);
					}
				}
				if (local32 == 2) {
					if (local22 == 11) {
						local22 = 10;
					}
					@Pc(401) Class34 local401 = Static48.aClass54_1.method1390(Static101.anInt2582, local46, local219);
					if (local401 != null) {
						local401.aClass10_Sub1_Sub5_5 = new Class10_Sub1_Sub5_Sub6(local401.anInt1464 >> 14 & 0x7FFF, local22, local28, local251, local273, local263, local283, local36, false);
					}
				}
				if (local32 == 3) {
					@Pc(433) Class46 local433 = Static48.aClass54_1.method1349(Static101.anInt2582, local46, local219);
					if (local433 != null) {
						local433.aClass10_Sub1_Sub5_6 = new Class10_Sub1_Sub5_Sub6(local433.anInt1829 >> 14 & 0x7FFF, 22, local28, local251, local273, local263, local283, local36, false);
					}
				}
			}
			return;
		}
		@Pc(527) int local527;
		if (Static96.anInt2447 == 100) {
			local14 = Static55.aClass10_Sub10_Sub1_4.method1111();
			local22 = Static29.anInt897 + (local14 >> 4 & 0x7);
			local28 = Static65.anInt1747 + (local14 & 0x7);
			local32 = local22 + Static55.aClass10_Sub10_Sub1_4.method1131();
			local36 = Static55.aClass10_Sub10_Sub1_4.method1131() + local28;
			local42 = Static55.aClass10_Sub10_Sub1_4.method1117();
			local46 = Static55.aClass10_Sub10_Sub1_4.method1160();
			local219 = Static55.aClass10_Sub10_Sub1_4.method1111() * 4;
			local251 = Static55.aClass10_Sub10_Sub1_4.method1111() * 4;
			local273 = Static55.aClass10_Sub10_Sub1_4.method1160();
			local263 = Static55.aClass10_Sub10_Sub1_4.method1160();
			local283 = Static55.aClass10_Sub10_Sub1_4.method1111();
			local527 = Static55.aClass10_Sub10_Sub1_4.method1111();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104 && local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104 && local46 != 65535) {
				local32 = local32 * 128 + 64;
				local36 = local36 * 128 + 64;
				local22 = local22 * 128 + 64;
				local28 = local28 * 128 + 64;
				@Pc(611) Class10_Sub1_Sub5_Sub3 local611 = new Class10_Sub1_Sub5_Sub3(local46, Static101.anInt2582, local22, local28, Static39.method230(local22, Static101.anInt2582, local28) - local219, Static95.anInt2442 + local273, local263 + Static95.anInt2442, local283, local527, local42, local251);
				local611.method737(Static39.method230(local32, Static101.anInt2582, local36) - local251, local36, local32, Static95.anInt2442 + local273);
				Static89.aClass9_9.method79(local611);
			}
		} else if (Static96.anInt2447 == 108) {
			local14 = Static55.aClass10_Sub10_Sub1_4.method1141();
			local22 = Static55.aClass10_Sub10_Sub1_4.method1160();
			local28 = Static55.aClass10_Sub10_Sub1_4.method1141();
			local32 = Static55.aClass10_Sub10_Sub1_4.method1135();
			local36 = Static29.anInt897 + (local32 >> 4 & 0x7);
			local42 = Static65.anInt1747 + (local32 & 0x7);
			if (local36 >= 0 && local42 >= 0 && local36 < 104 && local42 < 104 && local28 != Static83.anInt2226) {
				@Pc(692) Class10_Sub1_Sub5_Sub1 local692 = new Class10_Sub1_Sub5_Sub1();
				local692.anInt689 = local22;
				local692.anInt686 = local14;
				if (Static11.aClass9ArrayArrayArray1[Static101.anInt2582][local36][local42] == null) {
					Static11.aClass9ArrayArrayArray1[Static101.anInt2582][local36][local42] = new Class9();
				}
				Static11.aClass9ArrayArrayArray1[Static101.anInt2582][local36][local42].method79(local692);
				Static78.method1241(local36, local42);
			}
		} else if (Static96.anInt2447 == 158) {
			local14 = Static55.aClass10_Sub10_Sub1_4.method1141();
			local22 = Static55.aClass10_Sub10_Sub1_4.method1135();
			local28 = local22 >> 2;
			local36 = Static18.anIntArray70[local28];
			local42 = Static55.aClass10_Sub10_Sub1_4.method1111();
			local32 = local22 & 0x3;
			local46 = Static29.anInt897 + (local42 >> 4 & 0x7);
			local219 = Static65.anInt1747 + (local42 & 0x7);
			if (local46 >= 0 && local219 >= 0 && local46 < 104 && local219 < 104) {
				Static78.method1235(local36, local46, -1, local14, 0, Static101.anInt2582, local28, local32, local219);
			}
		} else if (Static96.anInt2447 == 238) {
			local14 = Static55.aClass10_Sub10_Sub1_4.method1111();
			local28 = (local14 & 0x7) + Static65.anInt1747;
			local22 = (local14 >> 4 & 0x7) + Static29.anInt897;
			local32 = Static55.aClass10_Sub10_Sub1_4.method1160();
			local36 = Static55.aClass10_Sub10_Sub1_4.method1111();
			local42 = Static55.aClass10_Sub10_Sub1_4.method1160();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				local28 = local28 * 128 + 64;
				local22 = local22 * 128 + 64;
				@Pc(891) Class10_Sub1_Sub5_Sub5 local891 = new Class10_Sub1_Sub5_Sub5(local32, Static101.anInt2582, local22, local28, Static39.method230(local22, Static101.anInt2582, local28) - local36, local42, Static95.anInt2442);
				Static12.aClass9_3.method79(local891);
			}
		} else {
			@Pc(949) Class10_Sub1_Sub5_Sub1 local949;
			if (Static96.anInt2447 == 92) {
				local14 = Static55.aClass10_Sub10_Sub1_4.method1119();
				local22 = Static55.aClass10_Sub10_Sub1_4.method1111();
				local28 = (local22 >> 4 & 0x7) + Static29.anInt897;
				local32 = Static65.anInt1747 + (local22 & 0x7);
				local36 = Static55.aClass10_Sub10_Sub1_4.method1132();
				if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104) {
					local949 = new Class10_Sub1_Sub5_Sub1();
					local949.anInt686 = local14;
					local949.anInt689 = local36;
					if (Static11.aClass9ArrayArrayArray1[Static101.anInt2582][local28][local32] == null) {
						Static11.aClass9ArrayArrayArray1[Static101.anInt2582][local28][local32] = new Class9();
					}
					Static11.aClass9ArrayArrayArray1[Static101.anInt2582][local28][local32].method79(local949);
					Static78.method1241(local28, local32);
				}
			} else {
				if (Static96.anInt2447 == 136) {
					local14 = Static55.aClass10_Sub10_Sub1_4.method1111();
					local28 = Static65.anInt1747 + (local14 & 0x7);
					local22 = (local14 >> 4 & 0x7) + Static29.anInt897;
					local32 = Static55.aClass10_Sub10_Sub1_4.method1119();
					@Pc(1019) byte local1019 = Static55.aClass10_Sub10_Sub1_4.method1133();
					local42 = Static55.aClass10_Sub10_Sub1_4.method1119();
					@Pc(1027) byte local1027 = Static55.aClass10_Sub10_Sub1_4.method1142();
					local219 = Static55.aClass10_Sub10_Sub1_4.method1119();
					local251 = Static55.aClass10_Sub10_Sub1_4.method1132();
					@Pc(1039) byte local1039 = Static55.aClass10_Sub10_Sub1_4.method1133();
					local263 = Static55.aClass10_Sub10_Sub1_4.method1111();
					local283 = local263 >> 2;
					local300 = Static18.anIntArray70[local283];
					@Pc(1055) byte local1055 = Static55.aClass10_Sub10_Sub1_4.method1133();
					@Pc(1066) Class10_Sub1_Sub5_Sub2_Sub2 local1066;
					if (Static83.anInt2226 == local32) {
						local1066 = Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1;
					} else {
						local1066 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local32];
					}
					local527 = local263 & 0x3;
					if (local1066 != null) {
						@Pc(1080) Class10_Sub1_Sub10 local1080 = Static18.method405(local42);
						@Pc(1088) int local1088 = Static37.anIntArrayArrayArray1[Static101.anInt2582][local22][local28];
						@Pc(1098) int local1098 = Static37.anIntArrayArrayArray1[Static101.anInt2582][local22 + 1][local28];
						@Pc(1108) int local1108 = Static37.anIntArrayArrayArray1[Static101.anInt2582][local22][local28 + 1];
						@Pc(1120) int local1120 = Static37.anIntArrayArrayArray1[Static101.anInt2582][local22 + 1][local28 + 1];
						@Pc(1130) Class10_Sub1_Sub5_Sub4 local1130 = local1080.method776(local1088, local1108, local527, local283, local1098, local1120);
						if (local1130 != null) {
							Static78.method1235(local300, local22, local251 + 1, -1, local219 + 1, Static101.anInt2582, 0, 0, local28);
							@Pc(1150) int local1150 = local1080.anInt1369;
							@Pc(1159) byte local1159;
							if (local1039 > local1055) {
								local1159 = local1039;
								local1039 = local1055;
								local1055 = local1159;
							}
							@Pc(1166) int local1166 = local1080.anInt1378;
							local1066.anInt1706 = local251 + Static95.anInt2442;
							if (local527 == 1 || local527 == 3) {
								local1166 = local1080.anInt1369;
								local1150 = local1080.anInt1378;
							}
							local1066.anInt1694 = local28 * 128 + local1166 * 64;
							local1066.anInt1700 = local22 * 128 + local1150 * 64;
							local1066.aClass10_Sub1_Sub5_Sub4_1 = local1130;
							if (local1019 < local1027) {
								local1159 = local1027;
								local1027 = local1019;
								local1019 = local1159;
							}
							local1066.anInt1695 = local219 + Static95.anInt2442;
							local1066.anInt1708 = Static39.method230(local1066.anInt1700, Static101.anInt2582, local1066.anInt1694);
							local1066.anInt1689 = local28 + local1019;
							local1066.anInt1691 = local1027 + local28;
							local1066.anInt1705 = local22 + local1039;
							local1066.anInt1699 = local22 + local1055;
						}
					}
				}
				if (Static96.anInt2447 == 249) {
					local14 = Static55.aClass10_Sub10_Sub1_4.method1111();
					local28 = Static65.anInt1747 + (local14 & 0x7);
					local22 = (local14 >> 4 & 0x7) + Static29.anInt897;
					local32 = Static55.aClass10_Sub10_Sub1_4.method1160();
					local36 = Static55.aClass10_Sub10_Sub1_4.method1160();
					local42 = Static55.aClass10_Sub10_Sub1_4.method1160();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
						@Pc(1309) Class9 local1309 = Static11.aClass9ArrayArrayArray1[Static101.anInt2582][local22][local28];
						if (local1309 != null) {
							for (@Pc(1316) Class10_Sub1_Sub5_Sub1 local1316 = (Class10_Sub1_Sub5_Sub1) local1309.method72(); local1316 != null; local1316 = (Class10_Sub1_Sub5_Sub1) local1309.method81()) {
								if ((local32 & 0x7FFF) == local1316.anInt689 && local36 == local1316.anInt686) {
									local1316.anInt686 = local42;
									break;
								}
							}
							Static78.method1241(local22, local28);
						}
					}
				} else if (Static96.anInt2447 == 184) {
					local14 = Static55.aClass10_Sub10_Sub1_4.method1111();
					local22 = (local14 >> 4 & 0x7) + Static29.anInt897;
					local28 = Static65.anInt1747 + (local14 & 0x7);
					local32 = Static55.aClass10_Sub10_Sub1_4.method1141();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
						@Pc(1401) Class9 local1401 = Static11.aClass9ArrayArrayArray1[Static101.anInt2582][local22][local28];
						if (local1401 != null) {
							for (local949 = (Class10_Sub1_Sub5_Sub1) local1401.method72(); local949 != null; local949 = (Class10_Sub1_Sub5_Sub1) local1401.method81()) {
								if ((local32 & 0x7FFF) == local949.anInt689) {
									local949.method1654();
									break;
								}
							}
							if (local1401.method72() == null) {
								Static11.aClass9ArrayArrayArray1[Static101.anInt2582][local22][local28] = null;
							}
							Static78.method1241(local22, local28);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public static void method966() {
		aClass15_26 = null;
		anIntArray194 = null;
		aClass29_48 = null;
		aClass61_735 = null;
		aClass61_732 = null;
		aClass15_27 = null;
		anIntArray195 = null;
		aClass61_734 = null;
		aClass61_733 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBILclient!he;)Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 method970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2) {
		return Static5.method36(arg1, arg2, arg0) ? Static22.method468() : null;
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
	public static void method971() {
		if (Static86.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static1.anIntArray1[186] = 57;
			Static1.anIntArray1[187] = 27;
			Static1.anIntArray1[188] = 71;
			Static1.anIntArray1[189] = 26;
			Static1.anIntArray1[190] = 72;
			Static1.anIntArray1[191] = 73;
			Static1.anIntArray1[192] = 58;
			Static1.anIntArray1[219] = 42;
			Static1.anIntArray1[220] = 74;
			Static1.anIntArray1[221] = 43;
			Static1.anIntArray1[222] = 59;
			Static1.anIntArray1[223] = 28;
			return;
		}
		Static1.anIntArray1[44] = 71;
		Static1.anIntArray1[45] = 26;
		Static1.anIntArray1[46] = 72;
		Static1.anIntArray1[47] = 73;
		Static1.anIntArray1[59] = 57;
		Static1.anIntArray1[61] = 27;
		Static1.anIntArray1[91] = 42;
		Static1.anIntArray1[92] = 74;
		Static1.anIntArray1[93] = 43;
		if (Static86.aMethod1 == null) {
			Static1.anIntArray1[192] = 58;
			Static1.anIntArray1[222] = 59;
		} else {
			Static1.anIntArray1[192] = 28;
			Static1.anIntArray1[222] = 58;
			Static1.anIntArray1[520] = 59;
		}
	}
}
