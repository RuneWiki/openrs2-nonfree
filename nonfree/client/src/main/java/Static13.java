import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!ae;")
	public static Class5 aClass5_187 = Static56.method972(")2");

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!ae;")
	public static Class5 aClass5_188 = Static56.method972(" )2> ");

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!ae;")
	public static Class5 aClass5_189 = Static56.method972("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	public static int anInt486 = -1;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!ae;")
	public static Class5 aClass5_190 = Static56.method972("Abbrechen");

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "[I")
	public static int[] anIntArray61 = new int[500];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method324() {
		@Pc(29) int local29;
		@Pc(41) int local41;
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(37) int local37;
		if (Static5.anInt353 == 79) {
			local14 = Static75.aClass3_Sub6_Sub1_2.method1587();
			local23 = Static60.anInt2984 + (local14 >> 4 & 0x7);
			local29 = (local14 & 0x7) + Static100.anInt2507;
			local33 = Static75.aClass3_Sub6_Sub1_2.method1603();
			local37 = Static75.aClass3_Sub6_Sub1_2.method1603();
			local41 = Static75.aClass3_Sub6_Sub1_2.method1603();
			if (local23 >= 0 && local29 >= 0 && local23 < 104 && local29 < 104) {
				@Pc(61) Class51 local61 = Static24.aClass51ArrayArrayArray1[Static12.anInt480][local23][local29];
				if (local61 != null) {
					for (@Pc(68) Class3_Sub1_Sub1_Sub4 local68 = (Class3_Sub1_Sub1_Sub4) local61.method1316(); local68 != null; local68 = (Class3_Sub1_Sub1_Sub4) local61.method1310()) {
						if ((local33 & 0x7FFF) == local68.anInt1194 && local37 == local68.anInt1191) {
							local68.anInt1191 = local41;
							break;
						}
					}
					Static109.method1896(local23, local29);
				}
			}
		} else if (Static5.anInt353 == 94) {
			local14 = Static75.aClass3_Sub6_Sub1_2.method1621();
			local23 = Static75.aClass3_Sub6_Sub1_2.method1621();
			local29 = Static75.aClass3_Sub6_Sub1_2.method1618();
			local33 = Static60.anInt2984 + (local29 >> 4 & 0x7);
			local37 = (local29 & 0x7) + Static100.anInt2507;
			local41 = Static75.aClass3_Sub6_Sub1_2.method1621();
			if (local33 >= 0 && local37 >= 0 && local33 < 104 && local37 < 104 && Static114.anInt2962 != local14) {
				@Pc(152) Class3_Sub1_Sub1_Sub4 local152 = new Class3_Sub1_Sub1_Sub4();
				local152.anInt1191 = local23;
				local152.anInt1194 = local41;
				if (Static24.aClass51ArrayArrayArray1[Static12.anInt480][local33][local37] == null) {
					Static24.aClass51ArrayArrayArray1[Static12.anInt480][local33][local37] = new Class51();
				}
				Static24.aClass51ArrayArrayArray1[Static12.anInt480][local33][local37].method1303(local152);
				Static109.method1896(local33, local37);
			}
		} else {
			@Pc(250) Class3_Sub1_Sub1_Sub4 local250;
			if (Static5.anInt353 == 84) {
				local14 = Static75.aClass3_Sub6_Sub1_2.method1604();
				local23 = Static75.aClass3_Sub6_Sub1_2.method1587();
				local33 = (local23 & 0x7) + Static100.anInt2507;
				local29 = Static60.anInt2984 + (local23 >> 4 & 0x7);
				if (local29 >= 0 && local33 >= 0 && local29 < 104 && local33 < 104) {
					@Pc(243) Class51 local243 = Static24.aClass51ArrayArrayArray1[Static12.anInt480][local29][local33];
					if (local243 != null) {
						for (local250 = (Class3_Sub1_Sub1_Sub4) local243.method1316(); local250 != null; local250 = (Class3_Sub1_Sub1_Sub4) local243.method1310()) {
							if (local250.anInt1194 == (local14 & 0x7FFF)) {
								local250.method1966();
								break;
							}
						}
						if (local243.method1316() == null) {
							Static24.aClass51ArrayArrayArray1[Static12.anInt480][local29][local33] = null;
						}
						Static109.method1896(local29, local33);
					}
				}
			} else {
				@Pc(332) int local332;
				if (Static5.anInt353 == 69) {
					local14 = Static75.aClass3_Sub6_Sub1_2.method1587();
					local23 = local14 >> 2;
					local29 = local14 & 0x3;
					local33 = Static49.anIntArray154[local23];
					local37 = Static75.aClass3_Sub6_Sub1_2.method1591();
					local41 = (local37 >> 4 & 0x7) + Static60.anInt2984;
					local332 = Static100.anInt2507 + (local37 & 0x7);
					if (local41 >= 0 && local332 >= 0 && local41 < 104 && local332 < 104) {
						Static87.method1481(0, local332, -1, Static12.anInt480, local29, local23, local33, -1, local41);
					}
				} else {
					@Pc(413) int local413;
					@Pc(419) int local419;
					@Pc(423) int local423;
					@Pc(427) int local427;
					@Pc(431) int local431;
					@Pc(435) int local435;
					if (Static5.anInt353 == 101) {
						local14 = Static75.aClass3_Sub6_Sub1_2.method1587();
						local29 = (local14 & 0x7) + Static100.anInt2507;
						local23 = Static60.anInt2984 + (local14 >> 4 & 0x7);
						local33 = local23 + Static75.aClass3_Sub6_Sub1_2.method1605();
						local37 = local29 + Static75.aClass3_Sub6_Sub1_2.method1605();
						local41 = Static75.aClass3_Sub6_Sub1_2.method1612();
						local332 = Static75.aClass3_Sub6_Sub1_2.method1603();
						local413 = Static75.aClass3_Sub6_Sub1_2.method1587() * 4;
						local419 = Static75.aClass3_Sub6_Sub1_2.method1587() * 4;
						local423 = Static75.aClass3_Sub6_Sub1_2.method1603();
						local427 = Static75.aClass3_Sub6_Sub1_2.method1603();
						local431 = Static75.aClass3_Sub6_Sub1_2.method1587();
						local435 = Static75.aClass3_Sub6_Sub1_2.method1587();
						if (local23 >= 0 && local29 >= 0 && local23 < 104 && local29 < 104 && local33 >= 0 && local37 >= 0 && local33 < 104 && local37 < 104 && local332 != 65535) {
							local37 = local37 * 128 + 64;
							local23 = local23 * 128 + 64;
							local29 = local29 * 128 + 64;
							local33 = local33 * 128 + 64;
							@Pc(521) Class3_Sub1_Sub1_Sub2 local521 = new Class3_Sub1_Sub1_Sub2(local332, Static12.anInt480, local23, local29, Static15.method358(local29, Static12.anInt480, local23) - local413, local423 + Static3.anInt289, Static3.anInt289 + local427, local431, local435, local41, local419);
							local521.method674(Static15.method358(local37, Static12.anInt480, local33) - local419, local37, local423 + Static3.anInt289, local33);
							Static32.aClass51_8.method1303(local521);
						}
					} else if (Static5.anInt353 == 207) {
						local14 = Static75.aClass3_Sub6_Sub1_2.method1621();
						local23 = Static75.aClass3_Sub6_Sub1_2.method1604();
						local29 = Static75.aClass3_Sub6_Sub1_2.method1587();
						local33 = (local29 >> 4 & 0x7) + Static60.anInt2984;
						local37 = Static100.anInt2507 + (local29 & 0x7);
						if (local33 >= 0 && local37 >= 0 && local33 < 104 && local37 < 104) {
							local250 = new Class3_Sub1_Sub1_Sub4();
							local250.anInt1194 = local23;
							local250.anInt1191 = local14;
							if (Static24.aClass51ArrayArrayArray1[Static12.anInt480][local33][local37] == null) {
								Static24.aClass51ArrayArrayArray1[Static12.anInt480][local33][local37] = new Class51();
							}
							Static24.aClass51ArrayArrayArray1[Static12.anInt480][local33][local37].method1303(local250);
							Static109.method1896(local33, local37);
						}
					} else {
						@Pc(752) int local752;
						if (Static5.anInt353 == 170) {
							local14 = Static75.aClass3_Sub6_Sub1_2.method1636();
							local23 = Static75.aClass3_Sub6_Sub1_2.method1591();
							local29 = local23 >> 2;
							local33 = local23 & 0x3;
							local37 = Static49.anIntArray154[local29];
							local41 = Static75.aClass3_Sub6_Sub1_2.method1607();
							local332 = (local41 >> 4 & 0x7) + Static60.anInt2984;
							local413 = (local41 & 0x7) + Static100.anInt2507;
							if (local332 >= 0 && local413 >= 0 && local332 < 103 && local413 < 103) {
								local419 = Static111.anIntArrayArrayArray7[Static12.anInt480][local332][local413];
								local423 = Static111.anIntArrayArrayArray7[Static12.anInt480][local332 + 1][local413];
								local427 = Static111.anIntArrayArrayArray7[Static12.anInt480][local332 + 1][local413 + 1];
								local431 = Static111.anIntArrayArrayArray7[Static12.anInt480][local332][local413 + 1];
								if (local37 == 0) {
									@Pc(743) Class40 local743 = Static73.aClass42_1.method1012(Static12.anInt480, local332, local413);
									if (local743 != null) {
										local752 = local743.anInt1416 >> 14 & 0x7FFF;
										if (local29 == 2) {
											local743.aClass3_Sub1_Sub1_3 = new Class3_Sub1_Sub1_Sub3(local752, 2, local33 + 4, local419, local423, local427, local431, local14, false, local743.aClass3_Sub1_Sub1_3);
											local743.aClass3_Sub1_Sub1_2 = new Class3_Sub1_Sub1_Sub3(local752, 2, local33 + 1 & 0x3, local419, local423, local427, local431, local14, false, local743.aClass3_Sub1_Sub1_2);
										} else {
											local743.aClass3_Sub1_Sub1_3 = new Class3_Sub1_Sub1_Sub3(local752, local29, local33, local419, local423, local427, local431, local14, false, local743.aClass3_Sub1_Sub1_3);
										}
									}
								}
								if (local37 == 1) {
									@Pc(821) Class47 local821 = Static73.aClass42_1.method1014(Static12.anInt480, local332, local413);
									if (local821 != null) {
										local821.aClass3_Sub1_Sub1_4 = new Class3_Sub1_Sub1_Sub3(local821.anInt1871 >> 14 & 0x7FFF, 4, 0, local419, local423, local427, local431, local14, false, local821.aClass3_Sub1_Sub1_4);
									}
								}
								if (local37 == 2) {
									if (local29 == 11) {
										local29 = 10;
									}
									@Pc(860) Class12 local860 = Static73.aClass42_1.method1030(Static12.anInt480, local332, local413);
									if (local860 != null) {
										local860.aClass3_Sub1_Sub1_1 = new Class3_Sub1_Sub1_Sub3(local860.anInt466 >> 14 & 0x7FFF, local29, local33, local419, local423, local427, local431, local14, false, local860.aClass3_Sub1_Sub1_1);
									}
								}
								if (local37 == 3) {
									@Pc(894) Class52 local894 = Static73.aClass42_1.method1056(Static12.anInt480, local332, local413);
									if (local894 != null) {
										local894.aClass3_Sub1_Sub1_5 = new Class3_Sub1_Sub1_Sub3(local894.anInt2064 >> 14 & 0x7FFF, 22, local33, local419, local423, local427, local431, local14, false, local894.aClass3_Sub1_Sub1_5);
									}
								}
							}
						} else if (Static5.anInt353 == 122) {
							local14 = Static75.aClass3_Sub6_Sub1_2.method1618();
							local29 = Static100.anInt2507 + (local14 & 0x7);
							local23 = (local14 >> 4 & 0x7) + Static60.anInt2984;
							local33 = Static75.aClass3_Sub6_Sub1_2.method1603();
							local37 = Static75.aClass3_Sub6_Sub1_2.method1591();
							local332 = local37 & 0x3;
							local41 = local37 >> 2;
							local413 = Static49.anIntArray154[local41];
							if (local23 >= 0 && local29 >= 0 && local23 < 104 && local29 < 104) {
								Static87.method1481(0, local29, -1, Static12.anInt480, local332, local41, local413, local33, local23);
							}
						} else if (Static5.anInt353 == 115) {
							local14 = Static75.aClass3_Sub6_Sub1_2.method1587();
							local23 = Static60.anInt2984 + (local14 >> 4 & 0x7);
							local29 = (local14 & 0x7) + Static100.anInt2507;
							local33 = Static75.aClass3_Sub6_Sub1_2.method1603();
							local37 = Static75.aClass3_Sub6_Sub1_2.method1587();
							local41 = Static75.aClass3_Sub6_Sub1_2.method1603();
							if (local23 >= 0 && local29 >= 0 && local23 < 104 && local29 < 104) {
								local29 = local29 * 128 + 64;
								local23 = local23 * 128 + 64;
								@Pc(1067) Class3_Sub1_Sub1_Sub5 local1067 = new Class3_Sub1_Sub1_Sub5(local33, Static12.anInt480, local23, local29, Static15.method358(local29, Static12.anInt480, local23) - local37, local41, Static3.anInt289);
								Static21.aClass51_6.method1303(local1067);
							}
						} else {
							if (Static5.anInt353 == 129) {
								@Pc(1081) byte local1081 = Static75.aClass3_Sub6_Sub1_2.method1613();
								@Pc(1085) byte local1085 = Static75.aClass3_Sub6_Sub1_2.method1602();
								local29 = Static75.aClass3_Sub6_Sub1_2.method1621();
								@Pc(1093) byte local1093 = Static75.aClass3_Sub6_Sub1_2.method1602();
								@Pc(1097) byte local1097 = Static75.aClass3_Sub6_Sub1_2.method1616();
								local41 = Static75.aClass3_Sub6_Sub1_2.method1621();
								local332 = Static75.aClass3_Sub6_Sub1_2.method1618();
								local413 = local332 >> 2;
								local423 = Static49.anIntArray154[local413];
								local419 = local332 & 0x3;
								local427 = Static75.aClass3_Sub6_Sub1_2.method1607();
								local431 = Static60.anInt2984 + (local427 >> 4 & 0x7);
								local435 = (local427 & 0x7) + Static100.anInt2507;
								local752 = Static75.aClass3_Sub6_Sub1_2.method1603();
								@Pc(1146) int local1146 = Static75.aClass3_Sub6_Sub1_2.method1636();
								@Pc(1151) Class3_Sub1_Sub1_Sub1_Sub2 local1151;
								if (local1146 == Static114.anInt2962) {
									local1151 = Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1;
								} else {
									local1151 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local1146];
								}
								if (local1151 != null) {
									@Pc(1163) Class3_Sub1_Sub15 local1163 = Static72.method1211(local29);
									@Pc(1173) int local1173 = Static111.anIntArrayArrayArray7[Static12.anInt480][local431][local435 + 1];
									@Pc(1181) int local1181 = Static111.anIntArrayArrayArray7[Static12.anInt480][local431][local435];
									@Pc(1191) int local1191 = Static111.anIntArrayArrayArray7[Static12.anInt480][local431 + 1][local435];
									@Pc(1203) int local1203 = Static111.anIntArrayArrayArray7[Static12.anInt480][local431 + 1][local435 + 1];
									@Pc(1213) Class3_Sub1_Sub1_Sub6 local1213 = local1163.method1531(local413, local1181, local419, local1173, local1203, local1191);
									if (local1213 != null) {
										Static87.method1481(local41 + 1, local435, local752 + 1, Static12.anInt480, 0, 0, local423, -1, local431);
										@Pc(1239) byte local1239;
										if (local1093 > local1085) {
											local1239 = local1093;
											local1093 = local1085;
											local1085 = local1239;
										}
										local1151.anInt1590 = Static3.anInt289 + local41;
										local1151.aClass3_Sub1_Sub1_Sub6_1 = local1213;
										if (local1081 < local1097) {
											local1239 = local1097;
											local1097 = local1081;
											local1081 = local1239;
										}
										local1151.anInt1598 = Static3.anInt289 + local752;
										@Pc(1268) int local1268 = local1163.anInt2312;
										@Pc(1271) int local1271 = local1163.anInt2331;
										if (local419 == 1 || local419 == 3) {
											local1271 = local1163.anInt2312;
											local1268 = local1163.anInt2331;
										}
										local1151.anInt1593 = local431 * 128 + local1268 * 64;
										local1151.anInt1595 = local435 * 128 + local1271 * 64;
										local1151.anInt1596 = Static15.method358(local1151.anInt1595, Static12.anInt480, local1151.anInt1593);
										local1151.anInt1591 = local431 + local1085;
										local1151.anInt1585 = local1097 + local435;
										local1151.anInt1587 = local1093 + local431;
										local1151.anInt1597 = local435 + local1081;
									}
								}
							}
							if (Static5.anInt353 == 109) {
								local14 = Static75.aClass3_Sub6_Sub1_2.method1587();
								local23 = (local14 >> 4 & 0x7) + Static60.anInt2984;
								local29 = Static100.anInt2507 + (local14 & 0x7);
								local33 = Static75.aClass3_Sub6_Sub1_2.method1603();
								local37 = Static75.aClass3_Sub6_Sub1_2.method1587();
								local41 = local37 >> 4 & 0xF;
								local413 = Static75.aClass3_Sub6_Sub1_2.method1587();
								local332 = local37 & 0x7;
								if (local23 >= 0 && local29 >= 0 && local23 < 104 && local29 < 104) {
									local419 = local41 + 1;
									if (Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0] >= local23 - local419 && local23 + local419 >= Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0] && Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0] >= local29 - local419 && local29 + local419 >= Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0] && Static10.anInt2842 != 0 && local332 > 0 && Static34.anInt966 < 50) {
										Static115.anIntArray380[Static34.anInt966] = local33;
										Static108.anIntArray370[Static34.anInt966] = local332;
										Static56.anIntArray173[Static34.anInt966] = local413;
										Static17.aClass54Array1[Static34.anInt966] = null;
										Static95.anIntArray274[Static34.anInt966] = local41 + (local29 << 8) + (local23 << 16);
										Static34.anInt966++;
										return;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public static void method325() {
		aClass5_190 = null;
		aClass5_188 = null;
		aClass5_189 = null;
		aClass5_187 = null;
		anIntArray61 = null;
	}
}
