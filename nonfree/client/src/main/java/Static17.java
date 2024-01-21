import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!d", name = "Lb", descriptor = "[I")
	public static int[] anIntArray67;

	@OriginalMember(owner = "client!d", name = "dc", descriptor = "I")
	public static int anInt596;

	@OriginalMember(owner = "client!d", name = "T", descriptor = "I")
	public static int anInt559 = 0;

	@OriginalMember(owner = "client!d", name = "V", descriptor = "Lclient!va;")
	private static Class61 aClass61_189 = Static88.method1421("Please remove ");

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "I")
	public static int anInt568 = 0;

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "Lclient!va;")
	public static Class61 aClass61_191 = aClass61_189;

	@OriginalMember(owner = "client!d", name = "ib", descriptor = "J")
	public static long aLong18 = 0L;

	@OriginalMember(owner = "client!d", name = "Ib", descriptor = "I")
	public static int anInt584 = 0;

	@OriginalMember(owner = "client!d", name = "Jb", descriptor = "I")
	public static int anInt585 = 0;

	@OriginalMember(owner = "client!d", name = "Wb", descriptor = "Lclient!va;")
	public static Class61 aClass61_196 = Static88.method1421(":duelreq:");

	@OriginalMember(owner = "client!d", name = "bc", descriptor = "Lclient!va;")
	public static Class61 aClass61_197 = aClass61_189;

	@OriginalMember(owner = "client!d", name = "ec", descriptor = "I")
	public static int anInt597 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!va;Lclient!tc;I)I")
	public static int method394(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class10_Sub10 arg1) {
		@Pc(6) int local6 = arg1.anInt1957;
		arg1.method1155(arg0.anInt2559);
		arg1.anInt1957 += Static35.aClass18_1.method494(arg1.aByteArray9, 0, arg0.aByteArray18, arg1.anInt1957, arg0.anInt2559);
		return arg1.anInt1957 - local6;
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(B)V")
	public static void method398() {
		aClass61_197 = null;
		anIntArray67 = null;
		aClass61_196 = null;
		aClass61_189 = null;
		aClass61_191 = null;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)V")
	public static void method399() {
		@Pc(20) int local20;
		if (Static21.anInt688 == 0) {
			Static48.aClass54_1 = new Class54(4, 104, 104, Static37.anIntArrayArrayArray1);
			for (local20 = 0; local20 < 4; local20++) {
				Static15.aClass12Array1[local20] = new Class12(104, 104);
			}
			Static53.aClass10_Sub1_Sub1_Sub1_33 = new Class10_Sub1_Sub1_Sub1(512, 512);
			Static15.aClass61_148 = Static67.aClass61_734;
			Static21.anInt688 = 20;
			Static42.anInt2376 = 5;
			return;
		}
		@Pc(57) int local57;
		@Pc(67) int local67;
		@Pc(78) int local78;
		@Pc(71) int local71;
		if (Static21.anInt688 == 20) {
			@Pc(55) int[] local55 = new int[9];
			for (local57 = 0; local57 < 9; local57++) {
				local67 = local57 * 32 + 128 + 15;
				local71 = Class10_Sub1_Sub1_Sub3.anIntArray201[local67];
				local78 = local67 * 3 + 600;
				local55[local57] = local78 * local71 >> 16;
			}
			Static85.method1350(local55);
			Static21.anInt688 = 30;
			Static15.aClass61_148 = Static74.aClass61_781;
			Static42.anInt2376 = 10;
		} else if (Static21.anInt688 == 30) {
			Static50.aClass11_Sub1_9 = Static44.method713(false, true, 0, true);
			Static9.aClass11_Sub1_1 = Static44.method713(false, true, 1, true);
			Static27.aClass11_Sub1_5 = Static44.method713(true, true, 2, false);
			Static35.aClass11_Sub1_7 = Static44.method713(false, true, 3, true);
			Static103.aClass11_Sub1_6 = Static44.method713(false, true, 4, true);
			Static57.aClass11_Sub1_10 = Static44.method713(true, true, 5, true);
			Static106.aClass11_Sub1_16 = Static44.method713(true, false, 6, true);
			Static104.aClass11_Sub1_14 = Static44.method713(false, true, 7, true);
			Static60.aClass11_Sub1_11 = Static44.method713(false, true, 8, true);
			Static22.aClass11_Sub1_4 = Static44.method713(false, true, 9, true);
			Static106.aClass11_Sub1_15 = Static44.method713(false, true, 10, true);
			Static99.aClass11_Sub1_13 = Static44.method713(false, true, 11, true);
			Static15.aClass61_148 = Static50.aClass61_575;
			Static21.anInt688 = 40;
			Static42.anInt2376 = 20;
		} else if (Static21.anInt688 == 40) {
			local20 = Static50.aClass11_Sub1_9.method237() * 5 / 100;
			local20 += Static9.aClass11_Sub1_1.method237() * 5 / 100;
			local20 += Static27.aClass11_Sub1_5.method237() * 5 / 100;
			local20 += Static35.aClass11_Sub1_7.method237() * 5 / 100;
			local20 += Static103.aClass11_Sub1_6.method237() * 5 / 100;
			local20 += Static57.aClass11_Sub1_10.method237() * 5 / 100;
			local20 += Static106.aClass11_Sub1_16.method237() * 5 / 100;
			local20 += Static104.aClass11_Sub1_14.method237() * 45 / 100;
			local20 += Static60.aClass11_Sub1_11.method237() * 5 / 100;
			local20 += Static22.aClass11_Sub1_4.method237() * 5 / 100;
			local20 += Static106.aClass11_Sub1_15.method237() * 5 / 100;
			local20 += Static99.aClass11_Sub1_13.method237() * 5 / 100;
			if (local20 == 100) {
				Static42.anInt2376 = 30;
				Static15.aClass61_148 = Static58.aClass61_647;
				Static21.anInt688 = 45;
			} else {
				if (local20 != 0) {
					Static15.aClass61_148 = Static93.method1156(new Class61[] { Static40.aClass61_451, Static29.method529(local20), Static43.aClass61_502 });
				}
				Static42.anInt2376 = 30;
			}
		} else if (Static21.anInt688 == 45) {
			Static38.method637(!Static31.aBoolean43, Static1.aClass55_1);
			Static81.aClass10_Sub5_Sub1_1 = Static83.method1294(Static38.aCanvas1, Static1.aClass55_1);
			Static46.aClass35_1 = new Class35(22050, Static29.anInt894);
			Static21.anInt688 = 50;
			Static42.anInt2376 = 35;
			Static15.aClass61_148 = Static23.aClass61_290;
		} else if (Static21.anInt688 == 50) {
			local20 = 0;
			if (Static8.aClass10_Sub1_Sub1_Sub4_1 == null) {
				Static8.aClass10_Sub1_Sub1_Sub4_1 = Static78.method1240(Static15.aClass61_166, Static102.aClass61_1037, Static60.aClass11_Sub1_11);
			} else {
				local20++;
			}
			if (Static99.aClass10_Sub1_Sub1_Sub4_4 == null) {
				Static99.aClass10_Sub1_Sub1_Sub4_4 = Static78.method1240(Static15.aClass61_166, Static24.aClass61_921, Static60.aClass11_Sub1_11);
			} else {
				local20++;
			}
			if (Static50.aClass10_Sub1_Sub1_Sub4_3 == null) {
				Static50.aClass10_Sub1_Sub1_Sub4_3 = Static78.method1240(Static15.aClass61_166, Static69.aClass61_750, Static60.aClass11_Sub1_11);
			} else {
				local20++;
			}
			if (Static37.aClass10_Sub1_Sub1_Sub4_2 == null) {
				Static37.aClass10_Sub1_Sub1_Sub4_2 = Static78.method1240(Static15.aClass61_166, Static31.aClass61_372, Static60.aClass11_Sub1_11);
			} else {
				local20++;
			}
			if (local20 < 4) {
				Static15.aClass61_148 = Static93.method1156(new Class61[] { Static96.aClass61_981, Static29.method529(local20 * 100 / 4), Static43.aClass61_502 });
				Static42.anInt2376 = 40;
			} else {
				Static15.aClass61_148 = Static104.aClass61_1060;
				Static107.aClass10_Sub1_Sub1_Sub4Array5 = new Class10_Sub1_Sub1_Sub4[] { Static8.aClass10_Sub1_Sub1_Sub4_1, Static99.aClass10_Sub1_Sub1_Sub4_4, Static50.aClass10_Sub1_Sub1_Sub4_3, Static37.aClass10_Sub1_Sub1_Sub4_2 };
				Static21.anInt688 = 60;
				Static42.anInt2376 = 40;
			}
		} else if (Static21.anInt688 == 60) {
			local20 = Static88.method1423(Static60.aClass11_Sub1_11, Static106.aClass11_Sub1_15);
			local57 = Static78.method1244();
			if (local20 < local57) {
				Static15.aClass61_148 = Static93.method1156(new Class61[] { Static53.aClass61_606, Static29.method529(local20 * 100 / local57), Static43.aClass61_502 });
				Static42.anInt2376 = 50;
			} else {
				Static42.anInt2376 = 50;
				Static15.aClass61_148 = Static36.aClass61_414;
				Static50.method780(5);
				Static21.anInt688 = 70;
			}
		} else if (Static21.anInt688 == 70) {
			if (Static27.aClass11_Sub1_5.method207()) {
				Static44.method712(Static27.aClass11_Sub1_5);
				Static88.method1419(Static27.aClass11_Sub1_5);
				Static74.method1041(Static27.aClass11_Sub1_5, Static104.aClass11_Sub1_14);
				Static21.method446(Static104.aClass11_Sub1_14, Static31.aBoolean43, Static27.aClass11_Sub1_5);
				Static51.method787(Static104.aClass11_Sub1_14, Static27.aClass11_Sub1_5);
				Static98.method1559(Static104.aClass11_Sub1_14, Static27.aClass11_Sub1_5, Static106.aBoolean121);
				Static54.method807(Static9.aClass11_Sub1_1, Static50.aClass11_Sub1_9, Static27.aClass11_Sub1_5);
				Static21.method445(Static104.aClass11_Sub1_14, Static27.aClass11_Sub1_5);
				Static83.method1293(Static27.aClass11_Sub1_5);
				Static9.method240(Static27.aClass11_Sub1_5);
				Static24.method1429(Static60.aClass11_Sub1_11, Static35.aClass11_Sub1_7, Static104.aClass11_Sub1_14);
				Static42.anInt2376 = 60;
				Static21.anInt688 = 80;
				Static15.aClass61_148 = Static40.aClass61_454;
			} else {
				Static15.aClass61_148 = Static93.method1156(new Class61[] { Static30.aClass61_363, Static29.method529(Static27.aClass11_Sub1_5.method238()), Static43.aClass61_502 });
				Static42.anInt2376 = 60;
			}
		} else if (Static21.anInt688 == 80) {
			local20 = 0;
			if (Static53.aClass10_Sub1_Sub1_Sub1_34 == null) {
				Static53.aClass10_Sub1_Sub1_Sub1_34 = Static27.method524(Static15.aClass61_166, Static60.aClass11_Sub1_11, Static22.aClass61_283);
			} else {
				local20++;
			}
			if (Static20.aClass10_Sub1_Sub1_Sub1_57 == null) {
				Static20.aClass10_Sub1_Sub1_Sub1_57 = Static27.method524(Static15.aClass61_166, Static60.aClass11_Sub1_11, Static69.aClass61_752);
			} else {
				local20++;
			}
			if (Static31.aClass10_Sub1_Sub1_Sub2Array3 == null) {
				Static31.aClass10_Sub1_Sub1_Sub2Array3 = Static75.method1168(Static60.aClass11_Sub1_11, Static63.aClass61_177, Static15.aClass61_166);
			} else {
				local20++;
			}
			if (Static60.aClass10_Sub1_Sub1_Sub1Array8 == null) {
				Static60.aClass10_Sub1_Sub1_Sub1Array8 = Static101.method1610(Static60.aClass11_Sub1_11, Static15.aClass61_166, Static41.aClass61_488);
			} else {
				local20++;
			}
			if (Static34.aClass10_Sub1_Sub1_Sub1Array4 == null) {
				Static34.aClass10_Sub1_Sub1_Sub1Array4 = Static101.method1610(Static60.aClass11_Sub1_11, Static15.aClass61_166, Static88.aClass61_914);
			} else {
				local20++;
			}
			if (Static1.aClass10_Sub1_Sub1_Sub1Array1 == null) {
				Static1.aClass10_Sub1_Sub1_Sub1Array1 = Static101.method1610(Static60.aClass11_Sub1_11, Static15.aClass61_166, Static28.aClass61_341);
			} else {
				local20++;
			}
			if (Static15.aClass10_Sub1_Sub1_Sub1Array2 == null) {
				Static15.aClass10_Sub1_Sub1_Sub1Array2 = Static101.method1610(Static60.aClass11_Sub1_11, Static15.aClass61_166, Static40.aClass61_450);
			} else {
				local20++;
			}
			if (Static78.aClass10_Sub1_Sub1_Sub1Array9 == null) {
				Static78.aClass10_Sub1_Sub1_Sub1Array9 = Static101.method1610(Static60.aClass11_Sub1_11, Static15.aClass61_166, Static78.aClass61_852);
			} else {
				local20++;
			}
			if (Static70.aClass10_Sub1_Sub1_Sub1_58 == null) {
				Static70.aClass10_Sub1_Sub1_Sub1_58 = Static27.method524(Static15.aClass61_166, Static60.aClass11_Sub1_11, Static89.aClass61_920);
			} else {
				local20++;
			}
			if (Static50.aClass10_Sub1_Sub1_Sub1Array6 == null) {
				Static50.aClass10_Sub1_Sub1_Sub1Array6 = Static101.method1610(Static60.aClass11_Sub1_11, Static15.aClass61_166, Static11.aClass61_84);
			} else {
				local20++;
			}
			if (Static35.aClass10_Sub1_Sub1_Sub1Array5 == null) {
				Static35.aClass10_Sub1_Sub1_Sub1Array5 = Static101.method1610(Static60.aClass11_Sub1_11, Static15.aClass61_166, Static5.aClass61_10);
			} else {
				local20++;
			}
			if (Static16.aClass10_Sub1_Sub1_Sub1Array3 == null) {
				Static16.aClass10_Sub1_Sub1_Sub1Array3 = Static101.method1610(Static60.aClass11_Sub1_11, Static15.aClass61_166, Static69.aClass61_747);
			} else {
				local20++;
			}
			if (Static25.aClass10_Sub1_Sub1_Sub2Array2 == null) {
				Static25.aClass10_Sub1_Sub1_Sub2Array2 = Static75.method1168(Static60.aClass11_Sub1_11, Static53.aClass61_608, Static15.aClass61_166);
			} else {
				local20++;
			}
			if (Static25.aClass10_Sub1_Sub1_Sub2Array1 == null) {
				Static25.aClass10_Sub1_Sub1_Sub2Array1 = Static75.method1168(Static60.aClass11_Sub1_11, Static21.aClass61_257, Static15.aClass61_166);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static15.aClass61_148 = Static93.method1156(new Class61[] { Static33.aClass61_394, Static29.method529(local20 * 100 / 14), Static43.aClass61_502 });
				Static42.anInt2376 = 70;
			} else {
				Static20.aClass10_Sub1_Sub1_Sub1_57.method152();
				local57 = (int) (Math.random() * 21.0D) - 10;
				local67 = (int) (Math.random() * 21.0D) - 10;
				local71 = (int) (Math.random() * 41.0D) - 20;
				local78 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(856) int local856 = 0; local856 < Static60.aClass10_Sub1_Sub1_Sub1Array8.length; local856++) {
					Static60.aClass10_Sub1_Sub1_Sub1Array8[local856].method154(local57 + local71, local67 - -local71, local78 + local71);
				}
				Static31.aClass10_Sub1_Sub1_Sub2Array3[0].method868(local57 + local71, local67 - -local71, local78 + local71);
				Static42.anInt2376 = 70;
				Static21.anInt688 = 85;
				Static15.aClass61_148 = Static71.aClass61_756;
			}
		} else if (Static21.anInt688 == 85) {
			local20 = Static13.method283(Static60.aClass11_Sub1_11);
			local57 = Static31.method557();
			if (local20 < local57) {
				Static15.aClass61_148 = Static93.method1156(new Class61[] { Static66.aClass61_729, Static29.method529(local20 * 100 / local57), Static43.aClass61_502 });
				Static42.anInt2376 = 80;
			} else {
				Static21.anInt688 = 90;
				Static15.aClass61_148 = Static28.aClass61_340;
				Static42.anInt2376 = 80;
			}
		} else if (Static21.anInt688 == 90) {
			if (Static22.aClass11_Sub1_4.method207()) {
				@Pc(1003) Class8 local1003 = new Class8(Static22.aClass11_Sub1_4, Static60.aClass11_Sub1_11, 20, 0.8D, Static31.aBoolean43 ? 64 : 128);
				Static68.method1008(local1003);
				Static68.method995(0.8D);
				Static15.aClass61_148 = Static62.aClass61_701;
				Static21.anInt688 = 110;
				Static42.anInt2376 = 90;
			} else {
				Static15.aClass61_148 = Static93.method1156(new Class61[] { Static67.aClass61_732, Static29.method529(Static22.aClass11_Sub1_4.method238()), Static43.aClass61_502 });
				Static42.anInt2376 = 90;
			}
		} else if (Static21.anInt688 == 110) {
			Static1.aClass22_1 = new Class22();
			Static1.aClass55_1.method1404(Static1.aClass22_1, 10);
			Static15.aClass61_148 = Static52.aClass61_603;
			Static21.anInt688 = 120;
			Static42.anInt2376 = 94;
		} else if (Static21.anInt688 == 120) {
			if (Static106.aClass11_Sub1_15.method224(Static36.aClass61_419, Static15.aClass61_166)) {
				@Pc(1072) Class18 local1072 = new Class18(Static106.aClass11_Sub1_15.method215(Static36.aClass61_419, Static15.aClass61_166));
				Static64.method945(local1072);
				Static15.aClass61_148 = Static107.aClass61_969;
				Static21.anInt688 = 130;
				Static42.anInt2376 = 96;
			} else {
				Static15.aClass61_148 = Static93.method1156(new Class61[] { Static94.aClass61_964, Static24.aClass61_924 });
				Static42.anInt2376 = 96;
			}
		} else if (Static21.anInt688 == 130) {
			if (Static35.aClass11_Sub1_7.method207()) {
				Static15.aClass61_148 = Static12.aClass61_89;
				Static42.anInt2376 = 100;
				Static21.anInt688 = 140;
			} else {
				Static15.aClass61_148 = Static93.method1156(new Class61[] { Static96.aClass61_980, Static29.method529(Static35.aClass11_Sub1_7.method238()), Static43.aClass61_502 });
				Static42.anInt2376 = 100;
			}
		} else if (Static21.anInt688 == 140) {
			Static50.method780(10);
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(Z)V")
	public static void method400() {
		if (Static94.anInt2408 == 0 && Static20.anInt2651 == 0) {
			Static107.method1502(anInt597, Static28.anInt889, 13, 0, Static24.aClass61_926);
		}
		@Pc(30) int local30 = -1;
		for (@Pc(32) int local32 = 0; local32 < Static84.anInt2268; local32++) {
			@Pc(38) int local38 = Static84.anIntArray274[local32];
			@Pc(44) int local44 = local38 >> 14 & 0x7FFF;
			@Pc(50) int local50 = local38 >> 7 & 0x7F;
			@Pc(56) int local56 = local38 >> 29 & 0x3;
			@Pc(60) int local60 = local38 & 0x7F;
			if (local30 != local38) {
				local30 = local38;
				@Pc(193) int local193;
				if (local56 == 2 && Static48.aClass54_1.method1365(Static101.anInt2582, local60, local50, local38) >= 0) {
					@Pc(86) Class10_Sub1_Sub10 local86 = Static18.method405(local44);
					if (local86.anIntArray146 != null) {
						local86 = local86.method765();
					}
					if (local86 == null) {
						continue;
					}
					if (Static94.anInt2408 == 1) {
						Static107.method1502(local50, local60, 37, local38, Static93.method1156(new Class61[] { Static101.aClass61_1035, Static24.aClass61_925, Static37.aClass61_435, Static94.aClass61_962, local86.aClass61_567 }));
					} else if (Static20.anInt2651 != 1) {
						@Pc(183) Class61[] local183 = local86.aClass61Array9;
						if (Static19.aBoolean32) {
							local183 = Static40.method645(local183);
						}
						if (local183 != null) {
							for (local193 = 4; local193 >= 0; local193--) {
								if (local183[local193] != null) {
									@Pc(205) short local205 = 0;
									if (local193 == 0) {
										local205 = 53;
									}
									if (local193 == 1) {
										local205 = 2;
									}
									if (local193 == 2) {
										local205 = 26;
									}
									if (local193 == 3) {
										local205 = 56;
									}
									if (local193 == 4) {
										local205 = 1004;
									}
									Static107.method1502(local50, local60, local205, local38, Static93.method1156(new Class61[] { local183[local193], Static12.aClass61_88, local86.aClass61_567 }));
								}
							}
						}
						Static107.method1502(local50, local60, 1001, local86.anInt1368 << 14, Static93.method1156(new Class61[] { Static54.aClass61_616, Static12.aClass61_88, local86.aClass61_567 }));
					} else if ((Static88.anInt2310 & 0x4) == 4) {
						Static107.method1502(local50, local60, 40, local38, Static93.method1156(new Class61[] { Static49.aClass61_568, Static94.aClass61_962, local86.aClass61_567 }));
					}
				}
				@Pc(315) int local315;
				@Pc(323) Class10_Sub1_Sub5_Sub2_Sub1 local323;
				@Pc(376) Class10_Sub1_Sub5_Sub2_Sub2 local376;
				if (local56 == 1) {
					@Pc(294) Class10_Sub1_Sub5_Sub2_Sub1 local294 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local44];
					if (local294.aClass10_Sub1_Sub3_1.anInt397 == 1 && (local294.anInt1654 & 0x7F) == 64 && (local294.anInt1649 & 0x7F) == 64) {
						for (local315 = 0; local315 < Static34.anInt1005; local315++) {
							local323 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[Static1.anIntArray3[local315]];
							if (local323 != null && local294 != local323 && local323.aClass10_Sub1_Sub3_1.anInt397 == 1 && local294.anInt1654 == local323.anInt1654 && local323.anInt1649 == local294.anInt1649) {
								Static40.method643(local323.aClass10_Sub1_Sub3_1, Static1.anIntArray3[local315], local60, local50);
							}
						}
						for (local193 = 0; local193 < Static10.anInt305; local193++) {
							local376 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[Static58.anIntArray170[local193]];
							if (local376 != null && local376.anInt1654 == local294.anInt1654 && local294.anInt1649 == local376.anInt1649) {
								Static74.method1040(local60, local376, local50, Static58.anIntArray170[local193]);
							}
						}
					}
					Static40.method643(local294.aClass10_Sub1_Sub3_1, local44, local60, local50);
				}
				if (local56 == 0) {
					@Pc(417) Class10_Sub1_Sub5_Sub2_Sub2 local417 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local44];
					if ((local417.anInt1654 & 0x7F) == 64 && (local417.anInt1649 & 0x7F) == 64) {
						for (local315 = 0; local315 < Static34.anInt1005; local315++) {
							local323 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[Static1.anIntArray3[local315]];
							if (local323 != null && local323.aClass10_Sub1_Sub3_1.anInt397 == 1 && local417.anInt1654 == local323.anInt1654 && local323.anInt1649 == local417.anInt1649) {
								Static40.method643(local323.aClass10_Sub1_Sub3_1, Static1.anIntArray3[local315], local60, local50);
							}
						}
						for (local193 = 0; local193 < Static10.anInt305; local193++) {
							local376 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[Static58.anIntArray170[local193]];
							if (local376 != null && local376 != local417 && local417.anInt1654 == local376.anInt1654 && local417.anInt1649 == local376.anInt1649) {
								Static74.method1040(local60, local376, local50, Static58.anIntArray170[local193]);
							}
						}
					}
					Static74.method1040(local60, local417, local50, local44);
				}
				if (local56 == 3) {
					@Pc(525) Class9 local525 = Static11.aClass9ArrayArrayArray1[Static101.anInt2582][local60][local50];
					if (local525 != null) {
						for (@Pc(532) Class10_Sub1_Sub5_Sub1 local532 = (Class10_Sub1_Sub5_Sub1) local525.method70(); local532 != null; local532 = (Class10_Sub1_Sub5_Sub1) local525.method84()) {
							@Pc(539) Class10_Sub1_Sub15 local539 = Static94.method1491(local532.anInt689);
							if (Static94.anInt2408 == 1) {
								Static107.method1502(local50, local60, 14, local532.anInt689, Static93.method1156(new Class61[] { Static101.aClass61_1035, Static24.aClass61_925, Static37.aClass61_435, Static18.aClass61_206, local539.aClass61_1029 }));
							} else if (Static20.anInt2651 != 1) {
								@Pc(629) Class61[] local629 = local539.aClass61Array13;
								if (Static19.aBoolean32) {
									local629 = Static40.method645(local629);
								}
								for (@Pc(637) int local637 = 4; local637 >= 0; local637--) {
									if (local629 != null && local629[local637] != null) {
										@Pc(651) byte local651 = 0;
										if (local637 == 0) {
											local651 = 34;
										}
										if (local637 == 1) {
											local651 = 21;
										}
										if (local637 == 2) {
											local651 = 10;
										}
										if (local637 == 3) {
											local651 = 46;
										}
										if (local637 == 4) {
											local651 = 23;
										}
										Static107.method1502(local50, local60, local651, local532.anInt689, Static93.method1156(new Class61[] { local629[local637], Static56.aClass61_624, local539.aClass61_1029 }));
									} else if (local637 == 2) {
										Static107.method1502(local50, local60, 10, local532.anInt689, Static93.method1156(new Class61[] { Static50.aClass61_574, Static56.aClass61_624, local539.aClass61_1029 }));
									}
								}
								Static107.method1502(local50, local60, 1005, local532.anInt689, Static93.method1156(new Class61[] { Static54.aClass61_616, Static56.aClass61_624, local539.aClass61_1029 }));
							} else if ((Static88.anInt2310 & 0x1) == 1) {
								Static107.method1502(local50, local60, 7, local532.anInt689, Static93.method1156(new Class61[] { Static49.aClass61_568, Static18.aClass61_206, local539.aClass61_1029 }));
							}
						}
					}
				}
			}
		}
	}
}
