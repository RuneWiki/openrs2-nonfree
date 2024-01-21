import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "Z")
	public static boolean aBoolean45;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Lclient!j;")
	public static Class1_Sub1_Sub1_Sub3 aClass1_Sub1_Sub1_Sub3_2;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
	public static int anInt910;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	public static int anInt917;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "[J")
	public static long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Lclient!mc;")
	public static Class42 aClass42_498 = Static23.method501("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "Lclient!mc;")
	public static Class42 aClass42_499 = Static23.method501("backleft1");

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Lclient!mc;")
	private static Class42 aClass42_500 = Static23.method501("flash3:");

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	public static int anInt909 = 0;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "Lclient!kc;")
	public static Class37 aClass37_14 = new Class37(200);

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
	public static int anInt921 = 0;

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "Lclient!mc;")
	public static Class42 aClass42_501 = aClass42_500;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
	public static void method621(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static1.anIntArray1[arg0];
		@Pc(16) int local16 = Static104.anIntArray398[arg0];
		@Pc(20) int local20 = Static70.anIntArray248[arg0];
		@Pc(24) int local24 = Static31.anIntArray347[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		if (Static106.anInt2737 != 0 && local12 != 1006) {
			Static106.anInt2737 = 0;
			Static28.aBoolean41 = true;
		}
		if (local12 == 51) {
			Static98.aClass1_Sub8_Sub1_3.method1236(135);
			Static98.aClass1_Sub8_Sub1_3.method1228(local24);
			Static98.aClass1_Sub8_Sub1_3.method1222(local16);
			Static98.aClass1_Sub8_Sub1_3.method1181(local20);
			Static63.anInt1525 = local16;
			anInt921 = 2;
			Static27.anInt778 = local20;
			if (Static108.anInt2743 == local20 >> 16) {
				anInt921 = 1;
			}
			if (local20 >> 16 == Static108.anInt2745) {
				anInt921 = 3;
			}
			Static68.anInt1666 = 0;
		}
		if (local12 == 1002) {
			Static56.anInt1426 = 0;
			Static88.anInt2319 = Static8.anInt247;
			Static103.anInt2676 = Static59.anInt1998;
			Static17.anInt592 = 2;
			Static98.aClass1_Sub8_Sub1_3.method1236(122);
			Static98.aClass1_Sub8_Sub1_3.method1222(local24 >> 14 & 0x7FFF);
		}
		@Pc(149) Class1_Sub1_Sub12 local149;
		@Pc(167) int local167;
		if (local12 == 15) {
			Static98.aClass1_Sub8_Sub1_3.method1236(41);
			Static98.aClass1_Sub8_Sub1_3.method1218(local20);
			local149 = Static33.method578(local20);
			if (local149.anIntArrayArray26 != null && local149.anIntArrayArray26[0][0] == 5) {
				local167 = local149.anIntArrayArray26[0][1];
				Static51.anIntArray200[local167] = 1 - Static51.anIntArray200[local167];
				Static107.method1829(local167);
				Static89.aBoolean132 = true;
			}
		}
		@Pc(188) Class1_Sub1_Sub8_Sub1_Sub2 local188;
		if (local12 == 19) {
			local188 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local24];
			if (local188 != null) {
				Static92.method1680(0, 0, local188.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local188.anIntArray393[0]);
				Static88.anInt2319 = Static8.anInt247;
				Static17.anInt592 = 2;
				Static103.anInt2676 = Static59.anInt1998;
				Static56.anInt1426 = 0;
				Static98.aClass1_Sub8_Sub1_3.method1236(208);
				Static98.aClass1_Sub8_Sub1_3.method1198(local24);
				Static98.aClass1_Sub8_Sub1_3.method1218(Static63.anInt1522);
			}
		}
		@Pc(269) boolean local269;
		if (local12 == 17) {
			local269 = Static92.method1680(0, 0, local16, 0, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 0, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local20);
			if (!local269) {
				Static92.method1680(0, 0, local16, 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local20);
			}
			Static103.anInt2676 = Static59.anInt1998;
			Static88.anInt2319 = Static8.anInt247;
			Static17.anInt592 = 2;
			Static56.anInt1426 = 0;
			Static98.aClass1_Sub8_Sub1_3.method1236(234);
			Static98.aClass1_Sub8_Sub1_3.method1222(local16 + Static51.anInt1373);
			Static98.aClass1_Sub8_Sub1_3.method1228(local20 + Static45.anInt1843);
			Static98.aClass1_Sub8_Sub1_3.method1181(Static63.anInt1522);
			Static98.aClass1_Sub8_Sub1_3.method1222(local24);
		}
		if (local12 == 38) {
			Static98.aClass1_Sub8_Sub1_3.method1236(59);
			Static98.aClass1_Sub8_Sub1_3.method1222(local16);
			Static98.aClass1_Sub8_Sub1_3.method1228(local24);
			Static98.aClass1_Sub8_Sub1_3.method1218(local20);
			anInt921 = 2;
			Static27.anInt778 = local20;
			Static68.anInt1666 = 0;
			if (Static108.anInt2743 == local20 >> 16) {
				anInt921 = 1;
			}
			if (local20 >> 16 == Static108.anInt2745) {
				anInt921 = 3;
			}
			Static63.anInt1525 = local16;
		}
		if (local12 == 54) {
			Static39.method308();
		}
		if (local12 == 11) {
			Static98.aClass1_Sub8_Sub1_3.method1236(43);
			Static98.aClass1_Sub8_Sub1_3.method1192(local20);
			Static98.aClass1_Sub8_Sub1_3.method1197(local16);
			Static98.aClass1_Sub8_Sub1_3.method1222(local24);
			Static27.anInt778 = local20;
			Static63.anInt1525 = local16;
			Static68.anInt1666 = 0;
			anInt921 = 2;
			if (Static108.anInt2743 == local20 >> 16) {
				anInt921 = 1;
			}
			if (local20 >> 16 == Static108.anInt2745) {
				anInt921 = 3;
			}
		}
		if (local12 == 39) {
			Static98.aClass1_Sub8_Sub1_3.method1236(108);
			Static98.aClass1_Sub8_Sub1_3.method1198(local16);
			Static98.aClass1_Sub8_Sub1_3.method1192(local20);
			Static98.aClass1_Sub8_Sub1_3.method1228(local24);
			anInt921 = 2;
			Static27.anInt778 = local20;
			Static63.anInt1525 = local16;
			Static68.anInt1666 = 0;
			if (Static108.anInt2743 == local20 >> 16) {
				anInt921 = 1;
			}
			if (local20 >> 16 == Static108.anInt2745) {
				anInt921 = 3;
			}
		}
		if (local12 == 35) {
			local188 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local24];
			if (local188 != null) {
				Static92.method1680(0, 0, local188.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local188.anIntArray393[0]);
				Static17.anInt592 = 2;
				Static88.anInt2319 = Static8.anInt247;
				Static103.anInt2676 = Static59.anInt1998;
				Static56.anInt1426 = 0;
				Static98.aClass1_Sub8_Sub1_3.method1236(117);
				Static98.aClass1_Sub8_Sub1_3.method1198(Static31.anInt2257);
				Static98.aClass1_Sub8_Sub1_3.method1181(Static99.anInt2515);
				Static98.aClass1_Sub8_Sub1_3.method1198(local24);
				Static98.aClass1_Sub8_Sub1_3.method1222(Static81.anInt2124);
			}
		}
		if (local12 == 13) {
			Static81.method1487(local20, local16, local24);
			Static98.aClass1_Sub8_Sub1_3.method1236(29);
			Static98.aClass1_Sub8_Sub1_3.method1198(local24 >> 14 & 0x7FFF);
			Static98.aClass1_Sub8_Sub1_3.method1222(Static45.anInt1843 + local20);
			Static98.aClass1_Sub8_Sub1_3.method1197(local16 + Static51.anInt1373);
		}
		@Pc(619) Class1_Sub1_Sub8_Sub1_Sub1 local619;
		if (local12 == 29) {
			local619 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local24];
			if (local619 != null) {
				Static92.method1680(0, 0, local619.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local619.anIntArray393[0]);
				Static103.anInt2676 = Static59.anInt1998;
				Static17.anInt592 = 2;
				Static88.anInt2319 = Static8.anInt247;
				Static56.anInt1426 = 0;
				Static98.aClass1_Sub8_Sub1_3.method1236(229);
				Static98.aClass1_Sub8_Sub1_3.method1228(local24);
			}
		}
		if (local12 == 28) {
			Static98.aClass1_Sub8_Sub1_3.method1236(147);
			Static98.aClass1_Sub8_Sub1_3.method1192(Static99.anInt2515);
			Static98.aClass1_Sub8_Sub1_3.method1222(local16);
			Static98.aClass1_Sub8_Sub1_3.method1183(local20);
			Static98.aClass1_Sub8_Sub1_3.method1197(Static31.anInt2257);
			Static98.aClass1_Sub8_Sub1_3.method1222(Static81.anInt2124);
			Static98.aClass1_Sub8_Sub1_3.method1222(local24);
			Static63.anInt1525 = local16;
			Static68.anInt1666 = 0;
			Static27.anInt778 = local20;
			anInt921 = 2;
			if (Static108.anInt2743 == local20 >> 16) {
				anInt921 = 1;
			}
			if (local20 >> 16 == Static108.anInt2745) {
				anInt921 = 3;
			}
		}
		@Pc(772) long local772;
		@Pc(752) Class42 local752;
		if (local12 == 3 || local12 == 12 || local12 == 33 || local12 == 25) {
			local752 = Static36.aClass42Array6[arg0];
			local167 = local752.method1050(Static19.aClass42_350);
			if (local167 != -1) {
				local772 = local752.method1051(local167 + 5).method1043().method1049();
				if (local12 == 3) {
					Static3.method98(local772);
				}
				if (local12 == 12) {
					Static20.method445(local772);
				}
				if (local12 == 33) {
					Static15.method398(local772);
				}
				if (local12 == 25) {
					Static27.method545(local772);
				}
			}
		}
		if (local12 == 27) {
			local269 = Static92.method1680(0, 0, local16, 0, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 0, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local20);
			if (!local269) {
				Static92.method1680(0, 0, local16, 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local20);
			}
			Static103.anInt2676 = Static59.anInt1998;
			Static17.anInt592 = 2;
			Static88.anInt2319 = Static8.anInt247;
			Static56.anInt1426 = 0;
			Static98.aClass1_Sub8_Sub1_3.method1236(116);
			Static98.aClass1_Sub8_Sub1_3.method1197(Static51.anInt1373 + local16);
			Static98.aClass1_Sub8_Sub1_3.method1198(local20 + Static45.anInt1843);
			Static98.aClass1_Sub8_Sub1_3.method1197(local24);
		}
		if (local12 == 44) {
			Static81.method1487(local20, local16, local24);
			Static98.aClass1_Sub8_Sub1_3.method1236(72);
			Static98.aClass1_Sub8_Sub1_3.method1222(local24 >> 14 & 0x7FFF);
			Static98.aClass1_Sub8_Sub1_3.method1228(Static51.anInt1373 + local16);
			Static98.aClass1_Sub8_Sub1_3.method1198(local20 + Static45.anInt1843);
		}
		if (local12 == 32) {
			local188 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local24];
			if (local188 != null) {
				Static92.method1680(0, 0, local188.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local188.anIntArray393[0]);
				Static56.anInt1426 = 0;
				Static17.anInt592 = 2;
				Static103.anInt2676 = Static59.anInt1998;
				Static88.anInt2319 = Static8.anInt247;
				Static98.aClass1_Sub8_Sub1_3.method1236(8);
				Static98.aClass1_Sub8_Sub1_3.method1197(local24);
			}
		}
		if (local12 == 20) {
			local619 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local24];
			if (local619 != null) {
				Static92.method1680(0, 0, local619.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local619.anIntArray393[0]);
				Static103.anInt2676 = Static59.anInt1998;
				Static88.anInt2319 = Static8.anInt247;
				Static17.anInt592 = 2;
				Static56.anInt1426 = 0;
				Static98.aClass1_Sub8_Sub1_3.method1236(64);
				Static98.aClass1_Sub8_Sub1_3.method1198(local24);
				Static98.aClass1_Sub8_Sub1_3.method1192(Static63.anInt1522);
			}
		}
		if (local12 == 26) {
			local188 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local24];
			if (local188 != null) {
				Static92.method1680(0, 0, local188.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local188.anIntArray393[0]);
				Static88.anInt2319 = Static8.anInt247;
				Static103.anInt2676 = Static59.anInt1998;
				Static56.anInt1426 = 0;
				Static17.anInt592 = 2;
				Static98.aClass1_Sub8_Sub1_3.method1236(138);
				Static98.aClass1_Sub8_Sub1_3.method1228(local24);
			}
		}
		if (local12 == 9) {
			Static98.aClass1_Sub8_Sub1_3.method1236(216);
			Static98.aClass1_Sub8_Sub1_3.method1183(local20);
			Static98.aClass1_Sub8_Sub1_3.method1198(local16);
			Static98.aClass1_Sub8_Sub1_3.method1197(local24);
			Static68.anInt1666 = 0;
			anInt921 = 2;
			Static27.anInt778 = local20;
			Static63.anInt1525 = local16;
			if (local20 >> 16 == Static108.anInt2743) {
				anInt921 = 1;
			}
			if (Static108.anInt2745 == local20 >> 16) {
				anInt921 = 3;
			}
		}
		if (local12 == 1) {
			local269 = Static92.method1680(0, 0, local16, 0, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 0, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local20);
			if (!local269) {
				Static92.method1680(0, 0, local16, 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local20);
			}
			Static103.anInt2676 = Static59.anInt1998;
			Static88.anInt2319 = Static8.anInt247;
			Static56.anInt1426 = 0;
			Static17.anInt592 = 2;
			Static98.aClass1_Sub8_Sub1_3.method1236(254);
			Static98.aClass1_Sub8_Sub1_3.method1197(local24);
			Static98.aClass1_Sub8_Sub1_3.method1222(local20 + Static45.anInt1843);
			Static98.aClass1_Sub8_Sub1_3.method1198(local16 + Static51.anInt1373);
		}
		if (local12 == 36 && Static81.method1487(local20, local16, local24)) {
			Static98.aClass1_Sub8_Sub1_3.method1236(101);
			Static98.aClass1_Sub8_Sub1_3.method1197(local24 >> 14 & 0x7FFF);
			Static98.aClass1_Sub8_Sub1_3.method1222(local20 + Static45.anInt1843);
			Static98.aClass1_Sub8_Sub1_3.method1183(Static63.anInt1522);
			Static98.aClass1_Sub8_Sub1_3.method1197(Static51.anInt1373 + local16);
		}
		if (local12 == 2) {
			if (Static10.aBoolean13) {
				Static88.aClass20_1.method459(local16 - 4, local20 + -4);
			} else {
				Static88.aClass20_1.method459(Static8.anInt247 - 4, Static59.anInt1998 - 4);
			}
		}
		if (local12 == 48) {
			local269 = Static92.method1680(0, 0, local16, 0, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 0, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local20);
			if (!local269) {
				Static92.method1680(0, 0, local16, 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local20);
			}
			Static88.anInt2319 = Static8.anInt247;
			Static17.anInt592 = 2;
			Static56.anInt1426 = 0;
			Static103.anInt2676 = Static59.anInt1998;
			Static98.aClass1_Sub8_Sub1_3.method1236(250);
			Static98.aClass1_Sub8_Sub1_3.method1198(local16 + Static51.anInt1373);
			Static98.aClass1_Sub8_Sub1_3.method1228(Static45.anInt1843 + local20);
			Static98.aClass1_Sub8_Sub1_3.method1197(local24);
		}
		@Pc(1394) int local1394;
		if (local12 == 23) {
			local752 = Static36.aClass42Array6[arg0];
			local167 = local752.method1050(Static19.aClass42_350);
			if (local167 != -1) {
				local1394 = -1;
				local772 = local752.method1051(local167 + 5).method1043().method1049();
				for (@Pc(1407) int local1407 = 0; local1407 < Static8.anInt239; local1407++) {
					if (Static87.aLongArray5[local1407] == local772) {
						local1394 = local1407;
						break;
					}
				}
				if (local1394 != -1 && Static109.anIntArray408[local1394] > 0) {
					Static11.aClass42_197 = Static11.aClass42_195;
					Static28.aBoolean41 = true;
					Static82.aBoolean117 = true;
					Static106.anInt2737 = 0;
					Static3.anInt113 = 3;
					Static95.aLong78 = Static87.aLongArray5[local1394];
					Static11.aClass42_192 = Static57.method1822(new Class42[] { Static53.aClass42_1431, Static8.aClass42Array3[local1394] });
				}
			}
		}
		if (local12 == 14 || local12 == 34) {
			local752 = Static36.aClass42Array6[arg0];
			local167 = local752.method1050(Static19.aClass42_350);
			if (local167 != -1) {
				local752 = local752.method1051(local167 + 5).method1043();
				@Pc(1503) Class42 local1503 = local752.method1038().method1058();
				@Pc(1505) boolean local1505 = false;
				for (local1394 = 0; local1394 < Static27.anInt770; local1394++) {
					@Pc(1515) Class1_Sub1_Sub8_Sub1_Sub2 local1515 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[Static68.anIntArray240[local1394]];
					if (local1515 != null && local1515.aClass42_1396 != null && local1515.aClass42_1396.method1040(local1503)) {
						Static92.method1680(0, 0, local1515.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local1515.anIntArray393[0]);
						if (local12 == 14) {
							Static98.aClass1_Sub8_Sub1_3.method1236(235);
							Static98.aClass1_Sub8_Sub1_3.method1228(Static68.anIntArray240[local1394]);
						}
						local1505 = true;
						if (local12 == 34) {
							Static98.aClass1_Sub8_Sub1_3.method1236(138);
							Static98.aClass1_Sub8_Sub1_3.method1228(Static68.anIntArray240[local1394]);
						}
						break;
					}
				}
				if (!local1505) {
					Static24.method509(Static11.aClass42_195, 0, Static57.method1822(new Class42[] { Static3.aClass42_79, local1503 }));
				}
			}
		}
		if (local12 == 46) {
			Static81.anInt2124 = local16;
			Static99.anInt2515 = local20;
			Static35.anInt874 = 1;
			Static31.anInt2257 = local24;
			Static53.aClass42_1432 = Static57.method1822(new Class42[] { Static28.aClass42_438, Static36.method617(local24).aClass42_120, Static19.aClass42_350 });
			if (Static53.aClass42_1432 == null) {
				Static53.aClass42_1432 = Static53.aClass42_1430;
			}
			Static12.anInt362 = 0;
			Static89.aBoolean132 = true;
			return;
		}
		if (local12 == 31) {
			local752 = Static36.aClass42Array6[arg0];
			local167 = local752.method1050(Static19.aClass42_350);
			if (local167 != -1) {
				if (Static108.anInt2743 == -1) {
					Static39.method308();
					if (Static25.anInt735 != -1) {
						Static11.aClass42_190 = local752.method1051(local167 + 5).method1043();
						Static48.aBoolean67 = false;
						Static13.anInt449 = Static108.anInt2743 = Static25.anInt735;
					}
				} else {
					Static24.method509(Static11.aClass42_195, 0, Static46.aClass42_664);
				}
			}
		}
		if (local12 == 5 && Static81.method1487(local20, local16, local24)) {
			Static98.aClass1_Sub8_Sub1_3.method1236(118);
			Static98.aClass1_Sub8_Sub1_3.method1198(Static81.anInt2124);
			Static98.aClass1_Sub8_Sub1_3.method1228(Static31.anInt2257);
			Static98.aClass1_Sub8_Sub1_3.method1222(Static45.anInt1843 + local20);
			Static98.aClass1_Sub8_Sub1_3.method1181(Static99.anInt2515);
			Static98.aClass1_Sub8_Sub1_3.method1228(local24 >> 14 & 0x7FFF);
			Static98.aClass1_Sub8_Sub1_3.method1228(local16 + Static51.anInt1373);
		}
		if (local12 == 1005) {
			Static88.anInt2319 = Static8.anInt247;
			Static103.anInt2676 = Static59.anInt1998;
			Static17.anInt592 = 2;
			Static56.anInt1426 = 0;
			local619 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local24];
			if (local619 != null) {
				@Pc(1779) Class1_Sub1_Sub6 local1779 = local619.aClass1_Sub1_Sub6_1;
				if (local1779.anIntArray90 != null) {
					local1779 = local1779.method551();
				}
				if (local1779 != null) {
					Static98.aClass1_Sub8_Sub1_3.method1236(132);
					Static98.aClass1_Sub8_Sub1_3.method1198(local1779.anInt771);
				}
			}
		}
		if (local12 == 7) {
			Static81.method1487(local20, local16, local24);
			Static98.aClass1_Sub8_Sub1_3.method1236(225);
			Static98.aClass1_Sub8_Sub1_3.method1198(local24 >> 14 & 0x7FFF);
			Static98.aClass1_Sub8_Sub1_3.method1198(Static45.anInt1843 + local20);
			Static98.aClass1_Sub8_Sub1_3.method1197(local16 + Static51.anInt1373);
		}
		if (local12 == 56) {
			Static98.aClass1_Sub8_Sub1_3.method1236(91);
			Static98.aClass1_Sub8_Sub1_3.method1222(local16);
			Static98.aClass1_Sub8_Sub1_3.method1228(local24);
			Static98.aClass1_Sub8_Sub1_3.method1218(local20);
			Static27.anInt778 = local20;
			Static68.anInt1666 = 0;
			Static63.anInt1525 = local16;
			anInt921 = 2;
			if (local20 >> 16 == Static108.anInt2743) {
				anInt921 = 1;
			}
			if (Static108.anInt2745 == local20 >> 16) {
				anInt921 = 3;
			}
		}
		if (local12 == 21) {
			local188 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local24];
			if (local188 != null) {
				Static92.method1680(0, 0, local188.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local188.anIntArray393[0]);
				Static56.anInt1426 = 0;
				Static88.anInt2319 = Static8.anInt247;
				Static103.anInt2676 = Static59.anInt1998;
				Static17.anInt592 = 2;
				Static98.aClass1_Sub8_Sub1_3.method1236(141);
				Static98.aClass1_Sub8_Sub1_3.method1228(local24);
			}
		}
		if (local12 == 41) {
			Static81.method1487(local20, local16, local24);
			Static98.aClass1_Sub8_Sub1_3.method1236(170);
			Static98.aClass1_Sub8_Sub1_3.method1222(Static45.anInt1843 + local20);
			Static98.aClass1_Sub8_Sub1_3.method1222(local24 >> 14 & 0x7FFF);
			Static98.aClass1_Sub8_Sub1_3.method1228(local16 + Static51.anInt1373);
		}
		if (local12 == 30) {
			local269 = Static92.method1680(0, 0, local16, 0, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 0, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local20);
			if (!local269) {
				Static92.method1680(0, 0, local16, 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local20);
			}
			Static17.anInt592 = 2;
			Static103.anInt2676 = Static59.anInt1998;
			Static56.anInt1426 = 0;
			Static88.anInt2319 = Static8.anInt247;
			Static98.aClass1_Sub8_Sub1_3.method1236(50);
			Static98.aClass1_Sub8_Sub1_3.method1197(local24);
			Static98.aClass1_Sub8_Sub1_3.method1222(Static45.anInt1843 + local20);
			Static98.aClass1_Sub8_Sub1_3.method1222(Static51.anInt1373 + local16);
		}
		if (local12 == 42) {
			local149 = Static33.method578(local20);
			@Pc(2073) boolean local2073 = true;
			if (local149.anInt2160 > 0) {
				local2073 = Static28.method561(local149);
			}
			if (local2073) {
				Static98.aClass1_Sub8_Sub1_3.method1236(41);
				Static98.aClass1_Sub8_Sub1_3.method1218(local20);
			}
		}
		if (local12 == 10) {
			local269 = Static92.method1680(0, 0, local16, 0, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 0, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local20);
			if (!local269) {
				Static92.method1680(0, 0, local16, 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local20);
			}
			Static17.anInt592 = 2;
			Static103.anInt2676 = Static59.anInt1998;
			Static88.anInt2319 = Static8.anInt247;
			Static56.anInt1426 = 0;
			Static98.aClass1_Sub8_Sub1_3.method1236(144);
			Static98.aClass1_Sub8_Sub1_3.method1228(Static51.anInt1373 + local16);
			Static98.aClass1_Sub8_Sub1_3.method1197(local24);
			Static98.aClass1_Sub8_Sub1_3.method1228(Static45.anInt1843 + local20);
		}
		if (local12 == 24) {
			local619 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local24];
			if (local619 != null) {
				Static92.method1680(0, 0, local619.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local619.anIntArray393[0]);
				Static17.anInt592 = 2;
				Static88.anInt2319 = Static8.anInt247;
				Static103.anInt2676 = Static59.anInt1998;
				Static56.anInt1426 = 0;
				Static98.aClass1_Sub8_Sub1_3.method1236(177);
				Static98.aClass1_Sub8_Sub1_3.method1228(local24);
			}
		}
		if (local12 == 1004) {
			Static88.anInt2319 = Static8.anInt247;
			Static17.anInt592 = 2;
			Static56.anInt1426 = 0;
			Static103.anInt2676 = Static59.anInt1998;
			Static98.aClass1_Sub8_Sub1_3.method1236(13);
			Static98.aClass1_Sub8_Sub1_3.method1228(local24);
		}
		if (local12 == 1003) {
			Static81.method1487(local20, local16, local24);
			Static98.aClass1_Sub8_Sub1_3.method1236(150);
			Static98.aClass1_Sub8_Sub1_3.method1222(local16 + Static51.anInt1373);
			Static98.aClass1_Sub8_Sub1_3.method1222(local24 >> 14 & 0x7FFF);
			Static98.aClass1_Sub8_Sub1_3.method1222(Static45.anInt1843 + local20);
		}
		if (local12 == 37) {
			local619 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local24];
			if (local619 != null) {
				Static92.method1680(0, 0, local619.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local619.anIntArray393[0]);
				Static17.anInt592 = 2;
				Static88.anInt2319 = Static8.anInt247;
				Static56.anInt1426 = 0;
				Static103.anInt2676 = Static59.anInt1998;
				Static98.aClass1_Sub8_Sub1_3.method1236(241);
				Static98.aClass1_Sub8_Sub1_3.method1198(local24);
			}
		}
		if (local12 == 53) {
			Static98.aClass1_Sub8_Sub1_3.method1236(111);
			Static98.aClass1_Sub8_Sub1_3.method1222(local24);
			Static98.aClass1_Sub8_Sub1_3.method1183(local20);
			Static98.aClass1_Sub8_Sub1_3.method1228(local16);
			Static27.anInt778 = local20;
			Static63.anInt1525 = local16;
			Static68.anInt1666 = 0;
			anInt921 = 2;
			if (Static108.anInt2743 == local20 >> 16) {
				anInt921 = 1;
			}
			if (Static108.anInt2745 == local20 >> 16) {
				anInt921 = 3;
			}
		}
		if (local12 == 16) {
			local619 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local24];
			if (local619 != null) {
				Static92.method1680(0, 0, local619.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local619.anIntArray393[0]);
				Static88.anInt2319 = Static8.anInt247;
				Static17.anInt592 = 2;
				Static56.anInt1426 = 0;
				Static103.anInt2676 = Static59.anInt1998;
				Static98.aClass1_Sub8_Sub1_3.method1236(153);
				Static98.aClass1_Sub8_Sub1_3.method1197(local24);
			}
		}
		if (local12 == 45) {
			local619 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local24];
			if (local619 != null) {
				Static92.method1680(0, 0, local619.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local619.anIntArray393[0]);
				Static88.anInt2319 = Static8.anInt247;
				Static103.anInt2676 = Static59.anInt1998;
				Static17.anInt592 = 2;
				Static56.anInt1426 = 0;
				Static98.aClass1_Sub8_Sub1_3.method1236(140);
				Static98.aClass1_Sub8_Sub1_3.method1228(Static31.anInt2257);
				Static98.aClass1_Sub8_Sub1_3.method1222(local24);
				Static98.aClass1_Sub8_Sub1_3.method1198(Static81.anInt2124);
				Static98.aClass1_Sub8_Sub1_3.method1183(Static99.anInt2515);
			}
		}
		if (local12 == 6) {
			local188 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local24];
			if (local188 != null) {
				Static92.method1680(0, 0, local188.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local188.anIntArray393[0]);
				Static17.anInt592 = 2;
				Static103.anInt2676 = Static59.anInt1998;
				Static88.anInt2319 = Static8.anInt247;
				Static56.anInt1426 = 0;
				Static98.aClass1_Sub8_Sub1_3.method1236(62);
				Static98.aClass1_Sub8_Sub1_3.method1228(local24);
			}
		}
		if (local12 == 18) {
			Static98.aClass1_Sub8_Sub1_3.method1236(120);
			Static98.aClass1_Sub8_Sub1_3.method1222(local24);
			Static98.aClass1_Sub8_Sub1_3.method1218(local20);
			Static98.aClass1_Sub8_Sub1_3.method1228(local16);
			Static63.anInt1525 = local16;
			anInt921 = 2;
			Static27.anInt778 = local20;
			if (local20 >> 16 == Static108.anInt2743) {
				anInt921 = 1;
			}
			if (local20 >> 16 == Static108.anInt2745) {
				anInt921 = 3;
			}
			Static68.anInt1666 = 0;
		}
		if (local12 == 22 && !Static62.aBoolean87) {
			Static98.aClass1_Sub8_Sub1_3.method1236(73);
			Static62.aBoolean87 = true;
		}
		if (local12 == 4) {
			local619 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local24];
			if (local619 != null) {
				Static92.method1680(0, 0, local619.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local619.anIntArray393[0]);
				Static56.anInt1426 = 0;
				Static103.anInt2676 = Static59.anInt1998;
				Static88.anInt2319 = Static8.anInt247;
				Static17.anInt592 = 2;
				Static98.aClass1_Sub8_Sub1_3.method1236(231);
				Static98.aClass1_Sub8_Sub1_3.method1197(local24);
			}
		}
		if (local12 == 55) {
			Static59.method1418(Static45.anInt1850);
			Static45.anInt1850 = -1;
			Static28.aBoolean41 = true;
		}
		if (local12 == 1001) {
			local149 = Static33.method578(local20);
			if (local149 == null || local149.anIntArray330[local16] < 100000) {
				Static98.aClass1_Sub8_Sub1_3.method1236(13);
				Static98.aClass1_Sub8_Sub1_3.method1228(local24);
			} else {
				Static24.method509(Static11.aClass42_195, 0, Static57.method1822(new Class42[] { Static38.method642(local149.anIntArray330[local16]), Static75.aClass42_762, Static36.method617(local24).aClass42_120 }));
			}
			Static27.anInt778 = local20;
			Static68.anInt1666 = 0;
			Static63.anInt1525 = local16;
			anInt921 = 2;
			if (Static108.anInt2743 == local20 >> 16) {
				anInt921 = 1;
			}
			if (Static108.anInt2745 == local20 >> 16) {
				anInt921 = 3;
			}
		}
		if (local12 == 8) {
			Static98.aClass1_Sub8_Sub1_3.method1236(41);
			Static98.aClass1_Sub8_Sub1_3.method1218(local20);
			local149 = Static33.method578(local20);
			if (local149.anIntArrayArray26 != null && local149.anIntArrayArray26[0][0] == 5) {
				local167 = local149.anIntArrayArray26[0][1];
				if (Static51.anIntArray200[local167] != local149.anIntArray329[0]) {
					Static51.anIntArray200[local167] = local149.anIntArray329[0];
					Static107.method1829(local167);
					Static89.aBoolean132 = true;
				}
			}
		}
		if (local12 == 49) {
			local149 = Static33.method578(local20);
			Static83.aClass42_1187 = local149.aClass42_1164;
			Static35.anInt874 = 0;
			Static82.anInt2193 = local149.anInt2179;
			Static12.anInt362 = 1;
			Static89.aBoolean132 = true;
			Static63.anInt1522 = local20;
			Static70.aClass42_916 = Static57.method1822(new Class42[] { Static45.aClass42_961, local149.aClass42_1162, Static19.aClass42_350 });
			if (Static82.anInt2193 == 16) {
				Static89.aBoolean132 = true;
				Static108.anInt2748 = 3;
				Static23.aBoolean33 = true;
			}
			return;
		}
		if (local12 == 52) {
			Static98.aClass1_Sub8_Sub1_3.method1236(255);
			Static98.aClass1_Sub8_Sub1_3.method1192(Static63.anInt1522);
			Static98.aClass1_Sub8_Sub1_3.method1228(local24);
			Static98.aClass1_Sub8_Sub1_3.method1197(local16);
			Static98.aClass1_Sub8_Sub1_3.method1183(local20);
			Static68.anInt1666 = 0;
			Static63.anInt1525 = local16;
			anInt921 = 2;
			if (local20 >> 16 == Static108.anInt2743) {
				anInt921 = 1;
			}
			if (Static108.anInt2745 == local20 >> 16) {
				anInt921 = 3;
			}
			Static27.anInt778 = local20;
		}
		if (local12 == 47) {
			local188 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local24];
			if (local188 != null) {
				Static92.method1680(0, 0, local188.anIntArray395[0], 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local188.anIntArray393[0]);
				Static56.anInt1426 = 0;
				Static88.anInt2319 = Static8.anInt247;
				Static103.anInt2676 = Static59.anInt1998;
				Static17.anInt592 = 2;
				Static98.aClass1_Sub8_Sub1_3.method1236(235);
				Static98.aClass1_Sub8_Sub1_3.method1228(local24);
			}
		}
		if (local12 == 43) {
			local269 = Static92.method1680(0, 0, local16, 0, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 0, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local20);
			if (!local269) {
				Static92.method1680(0, 0, local16, 1, 0, false, 2, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local20);
			}
			Static88.anInt2319 = Static8.anInt247;
			Static56.anInt1426 = 0;
			Static17.anInt592 = 2;
			Static103.anInt2676 = Static59.anInt1998;
			Static98.aClass1_Sub8_Sub1_3.method1236(9);
			Static98.aClass1_Sub8_Sub1_3.method1183(Static99.anInt2515);
			Static98.aClass1_Sub8_Sub1_3.method1228(Static45.anInt1843 + local20);
			Static98.aClass1_Sub8_Sub1_3.method1198(local24);
			Static98.aClass1_Sub8_Sub1_3.method1198(local16 + Static51.anInt1373);
			Static98.aClass1_Sub8_Sub1_3.method1222(Static81.anInt2124);
			Static98.aClass1_Sub8_Sub1_3.method1222(Static31.anInt2257);
		}
		if (local12 == 40) {
			Static98.aClass1_Sub8_Sub1_3.method1236(210);
			Static98.aClass1_Sub8_Sub1_3.method1181(local20);
			Static98.aClass1_Sub8_Sub1_3.method1198(local24);
			Static98.aClass1_Sub8_Sub1_3.method1222(local16);
			Static63.anInt1525 = local16;
			Static68.anInt1666 = 0;
			Static27.anInt778 = local20;
			anInt921 = 2;
			if (local20 >> 16 == Static108.anInt2743) {
				anInt921 = 1;
			}
			if (Static108.anInt2745 == local20 >> 16) {
				anInt921 = 3;
			}
		}
		if (local12 == 50) {
			Static98.aClass1_Sub8_Sub1_3.method1236(25);
			Static98.aClass1_Sub8_Sub1_3.method1181(local20);
			Static98.aClass1_Sub8_Sub1_3.method1228(local24);
			Static98.aClass1_Sub8_Sub1_3.method1228(local16);
			Static27.anInt778 = local20;
			Static68.anInt1666 = 0;
			Static63.anInt1525 = local16;
			anInt921 = 2;
			if (Static108.anInt2743 == local20 >> 16) {
				anInt921 = 1;
			}
			if (Static108.anInt2745 == local20 >> 16) {
				anInt921 = 3;
			}
		}
		if (Static35.anInt874 != 0) {
			Static89.aBoolean132 = true;
			Static35.anInt874 = 0;
		}
		if (Static12.anInt362 != 0) {
			Static89.aBoolean132 = true;
			Static12.anInt362 = 0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!ja;)I")
	public static int method625(@OriginalArg(1) Class33 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1313(Static31.aClass42_1209, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static24.aClass42_387, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static73.aClass42_975, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static5.aClass42_101, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static91.aClass42_1292, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static11.aClass42_196, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(aClass42_499, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static9.aClass42_140, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static87.aClass42_1222, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static51.aClass42_740, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static8.aClass42_134, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static75.aClass42_759, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static88.aClass42_1250, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static70.aClass42_920, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static72.aClass42_1059, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static43.aClass42_610, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static62.aClass42_799, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static7.aClass42_121, Static75.aClass42_760)) {
			local5++;
		}
		if (arg0.method1313(Static18.aClass42_326, Static75.aClass42_760)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!ja;I)[Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1[] method628(@OriginalArg(1) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2) {
		return Static67.method1153(arg2, arg1, arg0) ? Static19.method439() : null;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public static void method630() {
		Static34.aClass37_13.method976();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	public static void method631() {
		aClass42_498 = null;
		aClass42_500 = null;
		aLongArray2 = null;
		aClass42_499 = null;
		aClass1_Sub1_Sub1_Sub3_2 = null;
		aClass37_14 = null;
		aClass42_501 = null;
	}
}
