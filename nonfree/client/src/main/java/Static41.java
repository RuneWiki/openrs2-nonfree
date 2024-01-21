import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "[Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1[] aClass3_Sub3_Sub2_Sub1Array6;

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "Lclient!dh;")
	public static Class3_Sub3_Sub7 aClass3_Sub3_Sub7_1;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
	public static int anInt876;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_5 = new Class85(64);

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_429 = Static193.method3027("Use");

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Lclient!oc;")
	public static Class70 aClass70_428 = aClass70_429;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "Lclient!gj;")
	public static final Class40 aClass40_3 = new Class40(4096);

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "J")
	public static volatile long aLong26 = 0L;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public static void method679() {
		Static17.aClass10_13 = new Class10();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public static void method680() {
		if (!Static5.aBoolean7) {
			return;
		}
		@Pc(11) Class6 local11 = Static64.method982(Static113.anInt2287, Static6.anInt118);
		if (local11 != null && local11.anObjectArray24 != null) {
			@Pc(20) Class3_Sub26 local20 = new Class3_Sub26();
			local20.aClass6_116 = local11;
			local20.anObjectArray29 = local11.anObjectArray24;
			Static185.method2901(local20);
		}
		Static5.aBoolean7 = false;
		Static9.method237(local11);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)J")
	public static long method681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass36_1 == null ? 0L : local7.aClass36_1.aLong37;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
	public static void method682() {
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (Static155.anInt3189 == 198) {
			local14 = Static48.aClass3_Sub4_Sub1_43.method1278();
			local23 = Static14.anInt321 + (local14 >> 4 & 0x7);
			local30 = Static116.anInt3358 + (local14 & 0x7);
			local34 = Static48.aClass3_Sub4_Sub1_43.method1270();
			local38 = Static48.aClass3_Sub4_Sub1_43.method1278();
			local42 = Static48.aClass3_Sub4_Sub1_43.method1270();
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
				local23 = local23 * 128 + 64;
				local30 = local30 * 128 + 64;
				@Pc(84) Class26_Sub4 local84 = new Class26_Sub4(local34, Static137.anInt2795, local23, local30, Static107.method2399(local30, local23, Static137.anInt2795) - local38, local42, Static184.anInt3760);
				Static153.aClass10_85.method261(new Class3_Sub3_Sub8(local84));
			}
		} else if (Static155.anInt3189 == 64) {
			local14 = Static48.aClass3_Sub4_Sub1_43.method1286();
			local23 = (local14 >> 4 & 0x7) + Static14.anInt321;
			local30 = Static116.anInt3358 + (local14 & 0x7);
			local34 = Static48.aClass3_Sub4_Sub1_43.method1257();
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
				@Pc(145) Class10 local145 = Static29.aClass10ArrayArrayArray1[Static137.anInt2795][local23][local30];
				if (local145 != null) {
					for (@Pc(154) Class3_Sub3_Sub10 local154 = (Class3_Sub3_Sub10) local145.method267(); local154 != null; local154 = (Class3_Sub3_Sub10) local145.method268()) {
						if (local154.aClass26_Sub7_1.anInt3887 == (local34 & 0x7FFF)) {
							local154.method3320();
							break;
						}
					}
					if (local145.method267() == null) {
						Static29.aClass10ArrayArrayArray1[Static137.anInt2795][local23][local30] = null;
					}
					Static126.method1759(local23, local30);
				}
			}
		} else {
			@Pc(250) int local250;
			@Pc(254) int local254;
			@Pc(264) int local264;
			@Pc(272) int local272;
			if (Static155.anInt3189 == 207) {
				local14 = Static48.aClass3_Sub4_Sub1_43.method1278();
				local23 = local14 >> 2;
				local34 = Static96.anIntArray111[local23];
				local30 = local14 & 0x3;
				local38 = Static48.aClass3_Sub4_Sub1_43.method1257();
				local42 = Static48.aClass3_Sub4_Sub1_43.method1257();
				@Pc(240) byte local240 = Static48.aClass3_Sub4_Sub1_43.method1296();
				@Pc(244) byte local244 = Static48.aClass3_Sub4_Sub1_43.method1269();
				local250 = Static48.aClass3_Sub4_Sub1_43.method1295();
				local254 = Static48.aClass3_Sub4_Sub1_43.method1295();
				@Pc(258) byte local258 = Static48.aClass3_Sub4_Sub1_43.method1269();
				local264 = Static48.aClass3_Sub4_Sub1_43.method1278();
				local272 = (local264 >> 4 & 0x7) + Static14.anInt321;
				@Pc(278) int local278 = (local264 & 0x7) + Static116.anInt3358;
				@Pc(282) byte local282 = Static48.aClass3_Sub4_Sub1_43.method1248();
				@Pc(287) Class26_Sub2_Sub1 local287;
				if (local38 == Static64.anInt1360) {
					local287 = Static144.aClass26_Sub2_Sub1_1;
				} else {
					local287 = Static146.aClass26_Sub2_Sub1Array1[local38];
				}
				if (local287 != null) {
					@Pc(299) Class3_Sub3_Sub9 local299 = Static161.method2421(local254);
					@Pc(312) int local312;
					@Pc(315) int local315;
					if (local30 == 1 || local30 == 3) {
						local312 = local299.anInt1002;
						local315 = local299.anInt1010;
					} else {
						local312 = local299.anInt1010;
						local315 = local299.anInt1002;
					}
					@Pc(329) int local329 = (local312 >> 1) + local272;
					@Pc(337) int local337 = (local312 + 1 >> 1) + local272;
					@Pc(343) int local343 = (local315 >> 1) + local278;
					@Pc(352) int local352 = local278 + (local315 + 1 >> 1);
					@Pc(356) int[][] local356 = Static23.anIntArrayArrayArray4[Static137.anInt2795];
					@Pc(364) int local364 = (local312 << 6) + (local272 << 7);
					@Pc(390) int local390 = local356[local337][local352] + local356[local329][local343] + local356[local337][local343] + local356[local329][local352] >> 2;
					@Pc(398) int local398 = (local315 << 6) + (local278 << 7);
					@Pc(411) Class3_Sub3_Sub25 local411 = local299.method763(local398, local364, local390, local23, false, local30, local356);
					if (local411 != null) {
						Static209.method3301(Static137.anInt2795, 0, local272, local42 + 1, 0, -1, local250 + 1, local278, local34);
						local287.anInt1953 = local42 + Static184.anInt3760;
						@Pc(439) byte local439;
						if (local258 < local282) {
							local439 = local282;
							local282 = local258;
							local258 = local439;
						}
						if (local244 > local240) {
							local439 = local244;
							local244 = local240;
							local240 = local439;
						}
						local287.anInt1951 = local240 + local278;
						local287.anInt1954 = local272 + local258;
						local287.anInt1960 = local315 * 64 + local278 * 128;
						local287.aClass26_Sub6_1 = (Class26_Sub6) local411.aClass26_10;
						local287.anInt1961 = local278 + local244;
						local287.anInt1962 = local282 + local272;
						local287.anInt1963 = Static184.anInt3760 + local250;
						local287.anInt1950 = local390;
						local287.anInt1949 = local272 * 128 + local312 * 64;
					}
				}
			}
			@Pc(536) int local536;
			if (Static155.anInt3189 == 18) {
				local14 = Static48.aClass3_Sub4_Sub1_43.method1281();
				local30 = local14 & 0x3;
				local23 = local14 >> 2;
				local34 = Static96.anIntArray111[local23];
				local38 = Static48.aClass3_Sub4_Sub1_43.method1281();
				local536 = Static116.anInt3358 + (local38 & 0x7);
				local42 = Static14.anInt321 + (local38 >> 4 & 0x7);
				if (local42 >= 0 && local536 >= 0 && local42 < 104 && local536 < 104) {
					Static209.method3301(Static137.anInt2795, local30, local42, 0, local23, -1, -1, local536, local34);
				}
			} else if (Static155.anInt3189 == 223) {
				local14 = Static48.aClass3_Sub4_Sub1_43.method1257();
				local23 = Static48.aClass3_Sub4_Sub1_43.method1280();
				local30 = Static48.aClass3_Sub4_Sub1_43.method1281();
				local38 = Static116.anInt3358 + (local30 & 0x7);
				local34 = Static14.anInt321 + (local30 >> 4 & 0x7);
				local42 = Static48.aClass3_Sub4_Sub1_43.method1257();
				if (local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && Static64.anInt1360 != local42) {
					@Pc(636) Class26_Sub7 local636 = new Class26_Sub7();
					local636.anInt3887 = local14;
					local636.anInt3879 = local23;
					if (Static29.aClass10ArrayArrayArray1[Static137.anInt2795][local34][local38] == null) {
						Static29.aClass10ArrayArrayArray1[Static137.anInt2795][local34][local38] = new Class10();
					}
					Static29.aClass10ArrayArrayArray1[Static137.anInt2795][local34][local38].method261(new Class3_Sub3_Sub10(local636));
					Static126.method1759(local34, local38);
				}
			} else {
				@Pc(712) int local712;
				if (Static155.anInt3189 == 90) {
					local14 = Static48.aClass3_Sub4_Sub1_43.method1278();
					local23 = Static14.anInt321 + (local14 >> 4 & 0x7);
					local30 = (local14 & 0x7) + Static116.anInt3358;
					local34 = Static48.aClass3_Sub4_Sub1_43.method1270();
					local38 = Static48.aClass3_Sub4_Sub1_43.method1278();
					local712 = Static48.aClass3_Sub4_Sub1_43.method1278();
					local536 = local38 & 0x7;
					local42 = local38 >> 4 & 0xF;
					if (local34 == 65535) {
						local34 = -1;
					}
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
						local250 = local42 + 1;
						if (Static144.aClass26_Sub2_Sub1_1.anIntArray182[0] >= local23 - local250 && local23 + local250 >= Static144.aClass26_Sub2_Sub1_1.anIntArray182[0] && Static144.aClass26_Sub2_Sub1_1.anIntArray185[0] >= local30 - local250 && Static144.aClass26_Sub2_Sub1_1.anIntArray185[0] <= local250 + local30 && Static42.anInt879 != 0 && local536 > 0 && Static45.anInt953 < 50 && local34 != -1) {
							Static89.anIntArray35[Static45.anInt953] = local34;
							Static62.anIntArray72[Static45.anInt953] = local536;
							Static53.anIntArray63[Static45.anInt953] = local712;
							Static182.aClass7Array1[Static45.anInt953] = null;
							Static207.anIntArray373[Static45.anInt953] = local42 + (local23 << 16) + (local30 << 8);
							Static45.anInt953++;
						}
					}
				}
				if (Static155.anInt3189 == 211) {
					local14 = Static48.aClass3_Sub4_Sub1_43.method1278();
					local30 = Static116.anInt3358 + (local14 & 0x7);
					local23 = Static14.anInt321 + (local14 >> 4 & 0x7);
					local34 = Static48.aClass3_Sub4_Sub1_43.method1270();
					local38 = Static48.aClass3_Sub4_Sub1_43.method1270();
					local42 = Static48.aClass3_Sub4_Sub1_43.method1270();
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
						@Pc(893) Class10 local893 = Static29.aClass10ArrayArrayArray1[Static137.anInt2795][local23][local30];
						if (local893 != null) {
							for (@Pc(902) Class3_Sub3_Sub10 local902 = (Class3_Sub3_Sub10) local893.method267(); local902 != null; local902 = (Class3_Sub3_Sub10) local893.method268()) {
								@Pc(907) Class26_Sub7 local907 = local902.aClass26_Sub7_1;
								if (local907.anInt3887 == (local34 & 0x7FFF) && local907.anInt3879 == local38) {
									local907.anInt3879 = local42;
									break;
								}
							}
							Static126.method1759(local23, local30);
						}
					}
				} else if (Static155.anInt3189 == 238) {
					local14 = Static48.aClass3_Sub4_Sub1_43.method1270();
					local23 = Static48.aClass3_Sub4_Sub1_43.method1243();
					if (local14 == 65535) {
						local14 = -1;
					}
					local30 = (local23 >> 4 & 0x7) + Static14.anInt321;
					local34 = (local23 & 0x7) + Static116.anInt3358;
					local38 = Static48.aClass3_Sub4_Sub1_43.method1278();
					local42 = local38 >> 2;
					local536 = local38 & 0x3;
					local712 = Static96.anIntArray111[local42];
					if (local30 >= 0 && local34 >= 0 && local30 < 103 && local34 < 103) {
						if (local712 == 0) {
							@Pc(1016) Class36 local1016 = Static193.method3025(Static137.anInt2795, local30, local34);
							if (local1016 != null) {
								local254 = Integer.MAX_VALUE & (int) (local1016.aLong37 >>> 32);
								if (local42 == 2) {
									local1016.aClass26_4 = new Class26_Sub1(local254, 2, local536 + 4, Static137.anInt2795, local30, local34, local14, false, local1016.aClass26_4);
									local1016.aClass26_5 = new Class26_Sub1(local254, 2, local536 + 1 & 0x3, Static137.anInt2795, local30, local34, local14, false, local1016.aClass26_5);
								} else {
									local1016.aClass26_4 = new Class26_Sub1(local254, local42, local536, Static137.anInt2795, local30, local34, local14, false, local1016.aClass26_4);
								}
							}
						}
						if (local712 == 1) {
							@Pc(1092) Class83 local1092 = Static8.method217(Static137.anInt2795, local30, local34);
							if (local1092 != null) {
								local254 = Integer.MAX_VALUE & (int) (local1092.aLong111 >>> 32);
								if (local42 == 4 || local42 == 5) {
									local1092.aClass26_8 = new Class26_Sub1(local254, 4, local536, Static137.anInt2795, local30, local34, local14, false, local1092.aClass26_8);
								} else if (local42 == 6) {
									local1092.aClass26_8 = new Class26_Sub1(local254, 4, local536 + 4, Static137.anInt2795, local30, local34, local14, false, local1092.aClass26_8);
								} else if (local42 == 7) {
									local1092.aClass26_8 = new Class26_Sub1(local254, 4, (local536 + 2 & 0x3) + 4, Static137.anInt2795, local30, local34, local14, false, local1092.aClass26_8);
								} else if (local42 == 8) {
									local1092.aClass26_8 = new Class26_Sub1(local254, 4, local536 + 4, Static137.anInt2795, local30, local34, local14, false, local1092.aClass26_8);
									local1092.aClass26_9 = new Class26_Sub1(local254, 4, (local536 + 2 & 0x3) + 4, Static137.anInt2795, local30, local34, local14, false, local1092.aClass26_9);
								}
							}
						}
						if (local712 == 2) {
							@Pc(1226) Class99 local1226 = Static58.method919(Static137.anInt2795, local30, local34);
							if (local42 == 11) {
								local42 = 10;
							}
							if (local1226 != null) {
								local1226.aClass26_11 = new Class26_Sub1(Integer.MAX_VALUE & (int) (local1226.aLong144 >>> 32), local42, local536, Static137.anInt2795, local30, local34, local14, false, local1226.aClass26_11);
							}
						}
						if (local712 == 3) {
							@Pc(1264) Class64 local1264 = Static36.method637(Static137.anInt2795, local30, local34);
							if (local1264 != null) {
								local1264.aClass26_6 = new Class26_Sub1((int) (local1264.aLong78 >>> 32) & Integer.MAX_VALUE, 22, local536, Static137.anInt2795, local30, local34, local14, false, local1264.aClass26_6);
							}
						}
					}
				} else if (Static155.anInt3189 == 229) {
					local14 = Static48.aClass3_Sub4_Sub1_43.method1286();
					local23 = Static14.anInt321 + (local14 >> 4 & 0x7);
					local30 = Static116.anInt3358 + (local14 & 0x7);
					local34 = Static48.aClass3_Sub4_Sub1_43.method1280();
					local38 = Static48.aClass3_Sub4_Sub1_43.method1286();
					local536 = local38 & 0x3;
					local42 = local38 >> 2;
					local712 = Static96.anIntArray111[local42];
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
						Static209.method3301(Static137.anInt2795, local536, local23, 0, local42, local34, -1, local30, local712);
					}
				} else if (Static155.anInt3189 == 110) {
					local14 = Static48.aClass3_Sub4_Sub1_43.method1278();
					local23 = Static14.anInt321 + (local14 >> 4 & 0x7);
					local30 = Static116.anInt3358 + (local14 & 0x7);
					local34 = Static48.aClass3_Sub4_Sub1_43.method1257();
					local38 = Static48.aClass3_Sub4_Sub1_43.method1295();
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
						@Pc(1407) Class26_Sub7 local1407 = new Class26_Sub7();
						local1407.anInt3887 = local38;
						local1407.anInt3879 = local34;
						if (Static29.aClass10ArrayArrayArray1[Static137.anInt2795][local23][local30] == null) {
							Static29.aClass10ArrayArrayArray1[Static137.anInt2795][local23][local30] = new Class10();
						}
						Static29.aClass10ArrayArrayArray1[Static137.anInt2795][local23][local30].method261(new Class3_Sub3_Sub10(local1407));
						Static126.method1759(local23, local30);
					}
				} else if (Static155.anInt3189 == 189) {
					local14 = Static48.aClass3_Sub4_Sub1_43.method1278();
					local30 = (local14 & 0x7) + Static116.anInt3358;
					local23 = Static14.anInt321 + (local14 >> 4 & 0x7);
					local34 = local23 + Static48.aClass3_Sub4_Sub1_43.method1248();
					local38 = Static48.aClass3_Sub4_Sub1_43.method1248() + local30;
					local42 = Static48.aClass3_Sub4_Sub1_43.method1267();
					local536 = Static48.aClass3_Sub4_Sub1_43.method1270();
					local712 = Static48.aClass3_Sub4_Sub1_43.method1278() * 4;
					local250 = Static48.aClass3_Sub4_Sub1_43.method1278() * 4;
					local254 = Static48.aClass3_Sub4_Sub1_43.method1270();
					@Pc(1513) int local1513 = Static48.aClass3_Sub4_Sub1_43.method1270();
					local264 = Static48.aClass3_Sub4_Sub1_43.method1278();
					local272 = Static48.aClass3_Sub4_Sub1_43.method1278();
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local536 != 65535) {
						local23 = local23 * 128 + 64;
						local34 = local34 * 128 + 64;
						local30 = local30 * 128 + 64;
						local38 = local38 * 128 + 64;
						@Pc(1602) Class26_Sub3 local1602 = new Class26_Sub3(local536, Static137.anInt2795, local23, local30, Static107.method2399(local30, local23, Static137.anInt2795) - local712, Static184.anInt3760 + local254, local1513 + Static184.anInt3760, local264, local272, local42, local250);
						local1602.method1692(Static184.anInt3760 + local254, local38, Static107.method2399(local38, local34, Static137.anInt2795) - local250, local34);
						Static157.aClass10_90.method261(new Class3_Sub3_Sub13(local1602));
					}
				}
			}
		}
	}
}
