import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "[Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array1;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "[Lclient!q;")
	public static Class4_Sub1_Sub3_Sub2_Sub2[] aClass4_Sub1_Sub3_Sub2_Sub2Array1 = new Class4_Sub1_Sub3_Sub2_Sub2[32768];

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	public static int anInt215 = 0;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_80 = null;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_81 = Static60.method1113("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "[I")
	public static int[] anIntArray19 = new int[2000];

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "[Lclient!ec;")
	public static Class22[] aClass22Array1 = new Class22[200];

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "[Lclient!ec;")
	public static Class22[] aClass22Array2 = new Class22[100];

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ec;IZ)V")
	public static void method165(@OriginalArg(0) Class22 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(14) int local14 = Static101.aClass4_Sub1_Sub2_Sub4_Sub1_4.method1413(arg0, 250);
		@Pc(21) int local21 = Static101.aClass4_Sub1_Sub2_Sub4_Sub1_4.method1398(arg0, 250) * 13;
		Static118.method1373(6, 6, local14 + 4 + 4, local21 - -4 + 4, 0);
		Static118.method1378(6, 6, local14 + 8, local21 - -4 + 4, 16777215);
		Static101.aClass4_Sub1_Sub2_Sub4_Sub1_4.method1391(arg0, 10, 10, local14, local21, 16777215, -1, 1, 1, 0);
		Static51.method989(6, 6, local14 + 4 + 4, 4 + 4 + local21);
		if (!arg1) {
			Static28.method474(local14, 10, 10, local21);
			return;
		}
		try {
			@Pc(112) Graphics local112 = Static89.aCanvas1.getGraphics();
			Static43.aClass11_1.method578(local112);
		} catch (@Pc(120) Exception local120) {
			Static89.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!jd;)V")
	public static void method167(@OriginalArg(1) Class4_Sub11 arg0) {
		if (Static111.aClass79_2 != null) {
			try {
				Static111.aClass79_2.method1988(0L);
				Static111.aClass79_2.method1979(arg0.aByteArray9, 24, arg0.anInt1099);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt1099 += 24;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ[BI)Z")
	public static boolean method169(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class4_Sub11 local10 = new Class4_Sub11(arg1);
		@Pc(12) int local12 = -1;
		@Pc(14) boolean local14 = true;
		label54: while (true) {
			@Pc(18) int local18 = local10.method692();
			if (local18 == 0) {
				return local14;
			}
			local12 += local18;
			@Pc(29) boolean local29 = false;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(37) int local37;
				while (!local29) {
					local37 = local10.method692();
					if (local37 == 0) {
						continue label54;
					}
					local31 += local37 - 1;
					@Pc(69) int local69 = local31 >> 6 & 0x3F;
					@Pc(74) int local74 = local69 + arg0;
					@Pc(80) int local80 = local10.method719() >> 2;
					@Pc(84) int local84 = local31 & 0x3F;
					@Pc(89) int local89 = local84 + arg2;
					if (local74 > 0 && local89 > 0 && local74 < 103 && local89 < 103) {
						@Pc(110) Class4_Sub1_Sub5 local110 = Static5.method45(local12);
						if (local80 != 22 || !Static130.aBoolean279 || local110.anInt1242 != 0 || local110.anInt1268 == 1 || local110.aBoolean117) {
							local29 = true;
							if (!local110.method877()) {
								Static129.anInt3052++;
								local14 = false;
							}
						}
					}
				}
				local37 = local10.method692();
				if (local37 == 0) {
					break;
				}
				local10.method719();
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	public static void method170() {
		aClass4_Sub1_Sub3_Sub2_Sub2Array1 = null;
		aClass22_81 = null;
		aClass22_80 = null;
		aClass22Array2 = null;
		anIntArray19 = null;
		aClass22Array1 = null;
		aClass4_Sub1_Sub2_Sub3Array1 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)Z")
	public static boolean method171(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	public static void method172(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static101.anIntArray290[arg0];
		@Pc(14) int local14 = Static133.anIntArray344[arg0];
		@Pc(18) int local18 = Static38.anIntArray111[arg0];
		if (local18 >= 2000) {
			local18 -= 2000;
		}
		@Pc(26) int local26 = Static113.anIntArray306[arg0];
		if (local18 == 7) {
			Static38.aClass4_Sub11_Sub1_1.method752(252);
			Static38.aClass4_Sub11_Sub1_1.method743(local14);
			Static38.aClass4_Sub11_Sub1_1.method700(local10);
			Static38.aClass4_Sub11_Sub1_1.method733(local26);
			Static114.anInt2821 = 0;
			Static5.aClass4_Sub7_1 = Static106.method1749(local14);
			Static30.anInt722 = local10;
		}
		@Pc(66) Class4_Sub1_Sub3_Sub2_Sub1 local66;
		if (local18 == 50) {
			local66 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local26];
			if (local66 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local66.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local66.anIntArray277[0], 1, 2);
				Static23.anInt555 = Static8.anInt2382;
				Static113.anInt2788 = 2;
				Static130.anInt3102 = Static55.anInt1118;
				Static130.anInt3100 = 0;
				Static38.aClass4_Sub11_Sub1_1.method752(31);
				Static38.aClass4_Sub11_Sub1_1.method735(local26);
			}
		}
		@Pc(121) Class4_Sub1_Sub3_Sub2_Sub2 local121;
		if (local18 == 10) {
			local121 = aClass4_Sub1_Sub3_Sub2_Sub2Array1[local26];
			if (local121 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local121.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local121.anIntArray277[0], 1, 2);
				Static23.anInt555 = Static8.anInt2382;
				Static130.anInt3100 = 0;
				Static113.anInt2788 = 2;
				Static130.anInt3102 = Static55.anInt1118;
				Static38.aClass4_Sub11_Sub1_1.method752(185);
				Static38.aClass4_Sub11_Sub1_1.method700(local26);
			}
		}
		if (local18 == 22) {
			local66 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local26];
			if (local66 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local66.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local66.anIntArray277[0], 1, 2);
				Static130.anInt3102 = Static55.anInt1118;
				Static113.anInt2788 = 2;
				Static130.anInt3100 = 0;
				Static23.anInt555 = Static8.anInt2382;
				Static38.aClass4_Sub11_Sub1_1.method752(29);
				Static38.aClass4_Sub11_Sub1_1.method743(Static37.anInt903);
				Static38.aClass4_Sub11_Sub1_1.method691(Static123.anInt3082);
				Static38.aClass4_Sub11_Sub1_1.method735(local26);
			}
		}
		@Pc(240) Class4_Sub7 local240;
		if (local18 == 8) {
			local240 = Static108.method1767(local10, local14);
			if (local240 != null) {
				Static87.method1540();
				Static66.method1157(local10, local14, Static80.method1450(Static124.method1890(local240)));
				Static104.anInt2636 = 0;
				Static124.aClass22_927 = Static50.method963(local240);
				if (Static124.aClass22_927 == null) {
					Static124.aClass22_927 = Static75.aClass22_554;
				}
				if (!local240.aBoolean79) {
					aClass22_80 = Static44.method856(new Class22[] { Static112.aClass22_865, local240.aClass22_208, Static108.aClass22_805 });
					return;
				}
				aClass22_80 = Static44.method856(new Class22[] { local240.aClass22_205, Static108.aClass22_805 });
			}
			return;
		}
		if (local18 == 15) {
			Static38.aClass4_Sub11_Sub1_1.method752(44);
			Static38.aClass4_Sub11_Sub1_1.method733(local10);
			Static38.aClass4_Sub11_Sub1_1.method743(local14);
			Static38.aClass4_Sub11_Sub1_1.method700(local26);
			Static114.anInt2821 = 0;
			Static5.aClass4_Sub7_1 = Static106.method1749(local14);
			Static30.anInt722 = local10;
		}
		@Pc(358) boolean local358;
		if (local18 == 36) {
			local358 = Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 0, local10, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local14, 0, 2);
			if (!local358) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local10, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local14, 1, 2);
			}
			Static113.anInt2788 = 2;
			Static23.anInt555 = Static8.anInt2382;
			Static130.anInt3100 = 0;
			Static130.anInt3102 = Static55.anInt1118;
			Static38.aClass4_Sub11_Sub1_1.method752(80);
			Static38.aClass4_Sub11_Sub1_1.method735(Static59.anInt1769 + local10);
			Static38.aClass4_Sub11_Sub1_1.method735(Static98.anInt2584 + local14);
			Static38.aClass4_Sub11_Sub1_1.method733(local26);
		}
		if (local18 == 43) {
			Static38.aClass4_Sub11_Sub1_1.method752(204);
			Static38.aClass4_Sub11_Sub1_1.method717(Static37.anInt903);
			Static38.aClass4_Sub11_Sub1_1.method713(local14);
			Static38.aClass4_Sub11_Sub1_1.method735(local26);
			Static38.aClass4_Sub11_Sub1_1.method691(Static123.anInt3082);
			Static38.aClass4_Sub11_Sub1_1.method691(local10);
			Static114.anInt2821 = 0;
			Static5.aClass4_Sub7_1 = Static106.method1749(local14);
			Static30.anInt722 = local10;
		}
		if (local18 == 16) {
			local66 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local26];
			if (local66 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local66.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local66.anIntArray277[0], 1, 2);
				Static130.anInt3100 = 0;
				Static23.anInt555 = Static8.anInt2382;
				Static113.anInt2788 = 2;
				Static130.anInt3102 = Static55.anInt1118;
				Static38.aClass4_Sub11_Sub1_1.method752(138);
				Static38.aClass4_Sub11_Sub1_1.method735(local26);
			}
		}
		if (local18 == 45) {
			local66 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local26];
			if (local66 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local66.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local66.anIntArray277[0], 1, 2);
				Static113.anInt2788 = 2;
				Static23.anInt555 = Static8.anInt2382;
				Static130.anInt3100 = 0;
				Static130.anInt3102 = Static55.anInt1118;
				Static38.aClass4_Sub11_Sub1_1.method752(35);
				Static38.aClass4_Sub11_Sub1_1.method733(local26);
			}
		}
		if (local18 == 1002) {
			Static130.anInt3102 = Static55.anInt1118;
			Static113.anInt2788 = 2;
			Static23.anInt555 = Static8.anInt2382;
			Static130.anInt3100 = 0;
			Static38.aClass4_Sub11_Sub1_1.method752(32);
			Static38.aClass4_Sub11_Sub1_1.method735(local26 >> 14 & 0x7FFF);
		}
		if (local18 == 24) {
			local121 = aClass4_Sub1_Sub3_Sub2_Sub2Array1[local26];
			if (local121 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local121.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local121.anIntArray277[0], 1, 2);
				Static130.anInt3100 = 0;
				Static113.anInt2788 = 2;
				Static130.anInt3102 = Static55.anInt1118;
				Static23.anInt555 = Static8.anInt2382;
				Static38.aClass4_Sub11_Sub1_1.method752(37);
				Static38.aClass4_Sub11_Sub1_1.method691(local26);
			}
		}
		if (local18 == 58) {
			local121 = aClass4_Sub1_Sub3_Sub2_Sub2Array1[local26];
			if (local121 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local121.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local121.anIntArray277[0], 1, 2);
				Static130.anInt3102 = Static55.anInt1118;
				Static23.anInt555 = Static8.anInt2382;
				Static130.anInt3100 = 0;
				Static113.anInt2788 = 2;
				Static38.aClass4_Sub11_Sub1_1.method752(238);
				Static38.aClass4_Sub11_Sub1_1.method740(Static38.anInt951);
				Static38.aClass4_Sub11_Sub1_1.method691(Static35.anInt879);
				Static38.aClass4_Sub11_Sub1_1.method691(local26);
				Static38.aClass4_Sub11_Sub1_1.method691(Static107.anInt2694);
			}
		}
		if (local18 == 3) {
			Static134.aClass77_1.method1934(Static37.anInt895, local10, local14);
		}
		@Pc(757) int local757;
		if (local18 == 40) {
			Static38.aClass4_Sub11_Sub1_1.method752(218);
			Static38.aClass4_Sub11_Sub1_1.method717(local14);
			local240 = Static106.method1749(local14);
			if (local240.anIntArrayArray6 != null && local240.anIntArrayArray6[0][0] == 5) {
				local757 = local240.anIntArrayArray6[0][1];
				Static23.anIntArray61[local757] = 1 - Static23.anIntArray61[local757];
				Static93.method1624(local757);
			}
		}
		if (local18 == 25) {
			Static38.aClass4_Sub11_Sub1_1.method752(231);
			Static38.aClass4_Sub11_Sub1_1.method691(Static107.anInt2694);
			Static38.aClass4_Sub11_Sub1_1.method740(Static38.anInt951);
			Static38.aClass4_Sub11_Sub1_1.method733(local26);
			Static38.aClass4_Sub11_Sub1_1.method733(local10);
			Static38.aClass4_Sub11_Sub1_1.method700(Static35.anInt879);
			Static38.aClass4_Sub11_Sub1_1.method713(local14);
			Static114.anInt2821 = 0;
			Static5.aClass4_Sub7_1 = Static106.method1749(local14);
			Static30.anInt722 = local10;
		}
		if (local18 == 1001) {
			Static130.anInt3100 = 0;
			Static130.anInt3102 = Static55.anInt1118;
			Static113.anInt2788 = 2;
			Static23.anInt555 = Static8.anInt2382;
			Static38.aClass4_Sub11_Sub1_1.method752(43);
			Static38.aClass4_Sub11_Sub1_1.method691(local26);
		}
		if (local18 == 41) {
			Static38.aClass4_Sub11_Sub1_1.method752(9);
			Static38.aClass4_Sub11_Sub1_1.method735(local26);
			Static38.aClass4_Sub11_Sub1_1.method743(local14);
			Static38.aClass4_Sub11_Sub1_1.method691(local10);
			Static114.anInt2821 = 0;
			Static5.aClass4_Sub7_1 = Static106.method1749(local14);
			Static30.anInt722 = local10;
		}
		if (local18 == 44) {
			local66 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local26];
			if (local66 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local66.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local66.anIntArray277[0], 1, 2);
				Static113.anInt2788 = 2;
				Static23.anInt555 = Static8.anInt2382;
				Static130.anInt3100 = 0;
				Static130.anInt3102 = Static55.anInt1118;
				Static38.aClass4_Sub11_Sub1_1.method752(10);
				Static38.aClass4_Sub11_Sub1_1.method735(local26);
			}
		}
		if (local18 == 21) {
			Static87.method1540();
			local240 = Static106.method1749(local14);
			Static107.anInt2694 = local26;
			Static35.anInt879 = local10;
			Static38.anInt951 = local14;
			Static104.anInt2636 = 1;
			Static110.method1772(local240);
			Static43.aClass22_290 = Static44.method856(new Class22[] { Static33.aClass22_221, Static123.method2000(local26).aClass22_359, Static108.aClass22_805 });
			if (Static43.aClass22_290 == null) {
				Static43.aClass22_290 = Static75.aClass22_558;
			}
			return;
		}
		if (local18 == 4) {
			Static91.method1589();
		}
		if (local18 == 38) {
			Static38.aClass4_Sub11_Sub1_1.method752(215);
			Static38.aClass4_Sub11_Sub1_1.method733(local10);
			Static38.aClass4_Sub11_Sub1_1.method717(local14);
			Static38.aClass4_Sub11_Sub1_1.method691(local26);
			Static114.anInt2821 = 0;
			Static5.aClass4_Sub7_1 = Static106.method1749(local14);
			Static30.anInt722 = local10;
		}
		if (local18 == 13) {
			local358 = Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 0, local10, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local14, 0, 2);
			if (!local358) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local10, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local14, 1, 2);
			}
			Static113.anInt2788 = 2;
			Static130.anInt3100 = 0;
			Static130.anInt3102 = Static55.anInt1118;
			Static23.anInt555 = Static8.anInt2382;
			Static38.aClass4_Sub11_Sub1_1.method752(120);
			Static38.aClass4_Sub11_Sub1_1.method735(local26);
			Static38.aClass4_Sub11_Sub1_1.method735(Static59.anInt1769 + local10);
			Static38.aClass4_Sub11_Sub1_1.method735(local14 + Static98.anInt2584);
		}
		if (local18 == 18) {
			Static38.aClass4_Sub11_Sub1_1.method752(241);
			Static38.aClass4_Sub11_Sub1_1.method700(local26);
			Static38.aClass4_Sub11_Sub1_1.method691(local10);
			Static38.aClass4_Sub11_Sub1_1.method713(local14);
			Static114.anInt2821 = 0;
			Static5.aClass4_Sub7_1 = Static106.method1749(local14);
			Static30.anInt722 = local10;
		}
		if (local18 == 6) {
			local66 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local26];
			if (local66 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local66.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local66.anIntArray277[0], 1, 2);
				Static23.anInt555 = Static8.anInt2382;
				Static113.anInt2788 = 2;
				Static130.anInt3102 = Static55.anInt1118;
				Static130.anInt3100 = 0;
				Static38.aClass4_Sub11_Sub1_1.method752(73);
				Static38.aClass4_Sub11_Sub1_1.method733(local26);
			}
		}
		if (local18 == 39 && Static43.aClass4_Sub7_9 == null) {
			Static119.method1857(local10, local14);
			Static43.aClass4_Sub7_9 = Static108.method1767(local10, local14);
			Static110.method1772(Static43.aClass4_Sub7_9);
		}
		if (local18 == 1) {
			Static131.method2014(local14, local10, local26);
			Static38.aClass4_Sub11_Sub1_1.method752(174);
			Static38.aClass4_Sub11_Sub1_1.method733(local26 >> 14 & 0x7FFF);
			Static38.aClass4_Sub11_Sub1_1.method691(local10 + Static59.anInt1769);
			Static38.aClass4_Sub11_Sub1_1.method735(Static98.anInt2584 + local14);
		}
		if (local18 == 1006) {
			Static130.anInt3102 = Static55.anInt1118;
			Static23.anInt555 = Static8.anInt2382;
			Static113.anInt2788 = 2;
			Static130.anInt3100 = 0;
			local121 = aClass4_Sub1_Sub3_Sub2_Sub2Array1[local26];
			if (local121 != null) {
				@Pc(1249) Class4_Sub1_Sub10 local1249 = local121.aClass4_Sub1_Sub10_1;
				if (local1249.anIntArray221 != null) {
					local1249 = local1249.method1434();
				}
				if (local1249 != null) {
					Static38.aClass4_Sub11_Sub1_1.method752(50);
					Static38.aClass4_Sub11_Sub1_1.method691(local1249.anInt2174);
				}
			}
		}
		if (local18 == 42) {
			Static38.aClass4_Sub11_Sub1_1.method752(96);
			Static38.aClass4_Sub11_Sub1_1.method717(local14);
			Static38.aClass4_Sub11_Sub1_1.method733(local10);
			Static38.aClass4_Sub11_Sub1_1.method713(Static37.anInt903);
			Static38.aClass4_Sub11_Sub1_1.method735(Static123.anInt3082);
		}
		if (local18 == 19) {
			Static38.aClass4_Sub11_Sub1_1.method752(117);
			Static38.aClass4_Sub11_Sub1_1.method700(local26);
			Static38.aClass4_Sub11_Sub1_1.method700(local10);
			Static38.aClass4_Sub11_Sub1_1.method717(local14);
			Static114.anInt2821 = 0;
			Static5.aClass4_Sub7_1 = Static106.method1749(local14);
			Static30.anInt722 = local10;
		}
		if (local18 == 49 && Static131.method2014(local14, local10, local26)) {
			Static38.aClass4_Sub11_Sub1_1.method752(75);
			Static38.aClass4_Sub11_Sub1_1.method691(Static107.anInt2694);
			Static38.aClass4_Sub11_Sub1_1.method700(local26 >> 14 & 0x7FFF);
			Static38.aClass4_Sub11_Sub1_1.method691(Static35.anInt879);
			Static38.aClass4_Sub11_Sub1_1.method735(Static59.anInt1769 + local10);
			Static38.aClass4_Sub11_Sub1_1.method733(Static98.anInt2584 + local14);
			Static38.aClass4_Sub11_Sub1_1.method717(Static38.anInt951);
		}
		if (local18 == 2 && Static131.method2014(local14, local10, local26)) {
			Static38.aClass4_Sub11_Sub1_1.method752(208);
			Static38.aClass4_Sub11_Sub1_1.method735(local26 >> 14 & 0x7FFF);
			Static38.aClass4_Sub11_Sub1_1.method733(Static98.anInt2584 + local14);
			Static38.aClass4_Sub11_Sub1_1.method740(Static37.anInt903);
			Static38.aClass4_Sub11_Sub1_1.method691(Static59.anInt1769 + local10);
			Static38.aClass4_Sub11_Sub1_1.method691(Static123.anInt3082);
		}
		if (local18 == 1003) {
			Static131.method2014(local14, local10, local26);
			Static38.aClass4_Sub11_Sub1_1.method752(182);
			Static38.aClass4_Sub11_Sub1_1.method700(Static59.anInt1769 + local10);
			Static38.aClass4_Sub11_Sub1_1.method700(Static98.anInt2584 + local14);
			Static38.aClass4_Sub11_Sub1_1.method735(local26 >> 14 & 0x7FFF);
		}
		if (local18 == 34) {
			Static38.aClass4_Sub11_Sub1_1.method752(218);
			Static38.aClass4_Sub11_Sub1_1.method717(local14);
			local240 = Static106.method1749(local14);
			if (local240.anIntArrayArray6 != null && local240.anIntArrayArray6[0][0] == 5) {
				local757 = local240.anIntArrayArray6[0][1];
				if (local240.anIntArray86[0] != Static23.anIntArray61[local757]) {
					Static23.anIntArray61[local757] = local240.anIntArray86[0];
					Static93.method1624(local757);
				}
			}
		}
		if (local18 == 29) {
			local66 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local26];
			if (local66 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local66.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local66.anIntArray277[0], 1, 2);
				Static113.anInt2788 = 2;
				Static130.anInt3100 = 0;
				Static130.anInt3102 = Static55.anInt1118;
				Static23.anInt555 = Static8.anInt2382;
				Static38.aClass4_Sub11_Sub1_1.method752(81);
				Static38.aClass4_Sub11_Sub1_1.method691(local26);
			}
		}
		if (local18 == 20) {
			local358 = Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 0, local10, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local14, 0, 2);
			if (!local358) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local10, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local14, 1, 2);
			}
			Static130.anInt3102 = Static55.anInt1118;
			Static23.anInt555 = Static8.anInt2382;
			Static113.anInt2788 = 2;
			Static130.anInt3100 = 0;
			Static38.aClass4_Sub11_Sub1_1.method752(97);
			Static38.aClass4_Sub11_Sub1_1.method691(Static35.anInt879);
			Static38.aClass4_Sub11_Sub1_1.method735(Static98.anInt2584 + local14);
			Static38.aClass4_Sub11_Sub1_1.method743(Static38.anInt951);
			Static38.aClass4_Sub11_Sub1_1.method691(Static107.anInt2694);
			Static38.aClass4_Sub11_Sub1_1.method700(local26);
			Static38.aClass4_Sub11_Sub1_1.method735(Static59.anInt1769 + local10);
		}
		if (local18 == 26) {
			local240 = Static106.method1749(local14);
			@Pc(1684) boolean local1684 = true;
			if (local240.anInt793 > 0) {
				local1684 = Static18.method357(local240);
			}
			if (local1684) {
				Static38.aClass4_Sub11_Sub1_1.method752(218);
				Static38.aClass4_Sub11_Sub1_1.method717(local14);
			}
		}
		if (local18 == 46 || local18 == 1005) {
			Static64.method1141(local26, local14, Static48.aClass22Array9[arg0], local10);
		}
		if (local18 == 48) {
			local66 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local26];
			if (local66 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local66.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local66.anIntArray277[0], 1, 2);
				Static113.anInt2788 = 2;
				Static23.anInt555 = Static8.anInt2382;
				Static130.anInt3102 = Static55.anInt1118;
				Static130.anInt3100 = 0;
				Static38.aClass4_Sub11_Sub1_1.method752(193);
				Static38.aClass4_Sub11_Sub1_1.method700(local26);
			}
		}
		if (local18 == 51) {
			Static38.aClass4_Sub11_Sub1_1.method752(195);
			Static38.aClass4_Sub11_Sub1_1.method735(local26);
			Static38.aClass4_Sub11_Sub1_1.method743(local14);
			Static38.aClass4_Sub11_Sub1_1.method691(local10);
			Static114.anInt2821 = 0;
			Static5.aClass4_Sub7_1 = Static106.method1749(local14);
			Static30.anInt722 = local10;
		}
		if (local18 == 28) {
			local121 = aClass4_Sub1_Sub3_Sub2_Sub2Array1[local26];
			if (local121 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local121.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local121.anIntArray277[0], 1, 2);
				Static113.anInt2788 = 2;
				Static23.anInt555 = Static8.anInt2382;
				Static130.anInt3102 = Static55.anInt1118;
				Static130.anInt3100 = 0;
				Static38.aClass4_Sub11_Sub1_1.method752(45);
				Static38.aClass4_Sub11_Sub1_1.method733(local26);
			}
		}
		if (local18 == 30) {
			Static38.aClass4_Sub11_Sub1_1.method752(130);
			Static38.aClass4_Sub11_Sub1_1.method700(local10);
			Static38.aClass4_Sub11_Sub1_1.method713(local14);
			Static38.aClass4_Sub11_Sub1_1.method735(local26);
			Static114.anInt2821 = 0;
			Static5.aClass4_Sub7_1 = Static106.method1749(local14);
			Static30.anInt722 = local10;
		}
		if (local18 == 57) {
			local358 = Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 0, local10, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local14, 0, 2);
			if (!local358) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local10, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local14, 1, 2);
			}
			Static130.anInt3102 = Static55.anInt1118;
			Static113.anInt2788 = 2;
			Static23.anInt555 = Static8.anInt2382;
			Static130.anInt3100 = 0;
			Static38.aClass4_Sub11_Sub1_1.method752(250);
			Static38.aClass4_Sub11_Sub1_1.method735(Static59.anInt1769 + local10);
			Static38.aClass4_Sub11_Sub1_1.method735(local26);
			Static38.aClass4_Sub11_Sub1_1.method735(Static98.anInt2584 + local14);
		}
		if (local18 == 11) {
			Static131.method2014(local14, local10, local26);
			Static38.aClass4_Sub11_Sub1_1.method752(144);
			Static38.aClass4_Sub11_Sub1_1.method691(Static59.anInt1769 + local10);
			Static38.aClass4_Sub11_Sub1_1.method733(Static98.anInt2584 + local14);
			Static38.aClass4_Sub11_Sub1_1.method700(local26 >> 14 & 0x7FFF);
		}
		if (local18 == 14) {
			local121 = aClass4_Sub1_Sub3_Sub2_Sub2Array1[local26];
			if (local121 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local121.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local121.anIntArray277[0], 1, 2);
				Static130.anInt3100 = 0;
				Static23.anInt555 = Static8.anInt2382;
				Static130.anInt3102 = Static55.anInt1118;
				Static113.anInt2788 = 2;
				Static38.aClass4_Sub11_Sub1_1.method752(6);
				Static38.aClass4_Sub11_Sub1_1.method735(local26);
			}
		}
		if (local18 == 23) {
			local66 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local26];
			if (local66 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local66.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local66.anIntArray277[0], 1, 2);
				Static130.anInt3102 = Static55.anInt1118;
				Static23.anInt555 = Static8.anInt2382;
				Static113.anInt2788 = 2;
				Static130.anInt3100 = 0;
				Static38.aClass4_Sub11_Sub1_1.method752(158);
				Static38.aClass4_Sub11_Sub1_1.method735(local26);
			}
		}
		if (local18 == 1004) {
			local240 = Static106.method1749(local14);
			if (local240 == null || local240.anIntArray83[local10] < 100000) {
				Static38.aClass4_Sub11_Sub1_1.method752(43);
				Static38.aClass4_Sub11_Sub1_1.method691(local26);
			} else {
				Static65.method1153(Static44.method856(new Class22[] { Static134.method2042(local240.anIntArray83[local10]), Static58.aClass22_449, Static123.method2000(local26).aClass22_359 }), 0, Static64.aClass22_485);
			}
			Static114.anInt2821 = 0;
			Static5.aClass4_Sub7_1 = Static106.method1749(local14);
			Static30.anInt722 = local10;
		}
		if (local18 == 5) {
			local66 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local26];
			if (local66 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local66.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local66.anIntArray277[0], 1, 2);
				Static113.anInt2788 = 2;
				Static130.anInt3102 = Static55.anInt1118;
				Static23.anInt555 = Static8.anInt2382;
				Static130.anInt3100 = 0;
				Static38.aClass4_Sub11_Sub1_1.method752(67);
				Static38.aClass4_Sub11_Sub1_1.method740(Static38.anInt951);
				Static38.aClass4_Sub11_Sub1_1.method691(Static35.anInt879);
				Static38.aClass4_Sub11_Sub1_1.method733(local26);
				Static38.aClass4_Sub11_Sub1_1.method700(Static107.anInt2694);
			}
		}
		if (local18 == 31) {
			local358 = Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 0, local10, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local14, 0, 2);
			if (!local358) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local10, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local14, 1, 2);
			}
			Static130.anInt3100 = 0;
			Static113.anInt2788 = 2;
			Static23.anInt555 = Static8.anInt2382;
			Static130.anInt3102 = Static55.anInt1118;
			Static38.aClass4_Sub11_Sub1_1.method752(137);
			Static38.aClass4_Sub11_Sub1_1.method700(Static59.anInt1769 + local10);
			Static38.aClass4_Sub11_Sub1_1.method733(local26);
			Static38.aClass4_Sub11_Sub1_1.method700(Static98.anInt2584 + local14);
		}
		if (local18 == 35) {
			Static38.aClass4_Sub11_Sub1_1.method752(115);
			Static38.aClass4_Sub11_Sub1_1.method717(local14);
			Static38.aClass4_Sub11_Sub1_1.method733(local10);
			Static38.aClass4_Sub11_Sub1_1.method735(local26);
			Static114.anInt2821 = 0;
			Static5.aClass4_Sub7_1 = Static106.method1749(local14);
			Static30.anInt722 = local10;
		}
		if (local18 == 33) {
			local358 = Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 0, local10, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local14, 0, 2);
			if (!local358) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local10, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local14, 1, 2);
			}
			Static130.anInt3102 = Static55.anInt1118;
			Static130.anInt3100 = 0;
			Static23.anInt555 = Static8.anInt2382;
			Static113.anInt2788 = 2;
			Static38.aClass4_Sub11_Sub1_1.method752(122);
			Static38.aClass4_Sub11_Sub1_1.method700(local14 + Static98.anInt2584);
			Static38.aClass4_Sub11_Sub1_1.method691(local10 + Static59.anInt1769);
			Static38.aClass4_Sub11_Sub1_1.method740(Static37.anInt903);
			Static38.aClass4_Sub11_Sub1_1.method700(Static123.anInt3082);
			Static38.aClass4_Sub11_Sub1_1.method733(local26);
		}
		if (local18 == 47) {
			local358 = Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 0, local10, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local14, 0, 2);
			if (!local358) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local10, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local14, 1, 2);
			}
			Static130.anInt3100 = 0;
			Static23.anInt555 = Static8.anInt2382;
			Static113.anInt2788 = 2;
			Static130.anInt3102 = Static55.anInt1118;
			Static38.aClass4_Sub11_Sub1_1.method752(112);
			Static38.aClass4_Sub11_Sub1_1.method700(local14 + Static98.anInt2584);
			Static38.aClass4_Sub11_Sub1_1.method700(local26);
			Static38.aClass4_Sub11_Sub1_1.method700(local10 + Static59.anInt1769);
		}
		if (local18 == 32) {
			Static131.method2014(local14, local10, local26);
			Static38.aClass4_Sub11_Sub1_1.method752(170);
			Static38.aClass4_Sub11_Sub1_1.method733(local14 + Static98.anInt2584);
			Static38.aClass4_Sub11_Sub1_1.method691(local26 >> 14 & 0x7FFF);
			Static38.aClass4_Sub11_Sub1_1.method691(local10 + Static59.anInt1769);
		}
		if (local18 == 12) {
			local121 = aClass4_Sub1_Sub3_Sub2_Sub2Array1[local26];
			if (local121 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local121.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local121.anIntArray277[0], 1, 2);
				Static130.anInt3100 = 0;
				Static23.anInt555 = Static8.anInt2382;
				Static113.anInt2788 = 2;
				Static130.anInt3102 = Static55.anInt1118;
				Static38.aClass4_Sub11_Sub1_1.method752(253);
				Static38.aClass4_Sub11_Sub1_1.method700(Static123.anInt3082);
				Static38.aClass4_Sub11_Sub1_1.method740(Static37.anInt903);
				Static38.aClass4_Sub11_Sub1_1.method735(local26);
			}
		}
		if (local18 == 17) {
			Static38.aClass4_Sub11_Sub1_1.method752(214);
			Static38.aClass4_Sub11_Sub1_1.method733(local10);
			Static38.aClass4_Sub11_Sub1_1.method717(local14);
			Static38.aClass4_Sub11_Sub1_1.method700(local26);
			Static114.anInt2821 = 0;
			Static5.aClass4_Sub7_1 = Static106.method1749(local14);
			Static30.anInt722 = local10;
		}
		if (local18 == 9) {
			local121 = aClass4_Sub1_Sub3_Sub2_Sub2Array1[local26];
			if (local121 != null) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local121.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local121.anIntArray277[0], 1, 2);
				Static130.anInt3100 = 0;
				Static130.anInt3102 = Static55.anInt1118;
				Static23.anInt555 = Static8.anInt2382;
				Static113.anInt2788 = 2;
				Static38.aClass4_Sub11_Sub1_1.method752(149);
				Static38.aClass4_Sub11_Sub1_1.method700(local26);
			}
		}
		if (local18 == 37) {
			Static131.method2014(local14, local10, local26);
			Static38.aClass4_Sub11_Sub1_1.method752(229);
			Static38.aClass4_Sub11_Sub1_1.method700(local14 + Static98.anInt2584);
			Static38.aClass4_Sub11_Sub1_1.method700(Static59.anInt1769 + local10);
			Static38.aClass4_Sub11_Sub1_1.method700(local26 >> 14 & 0x7FFF);
		}
		if (Static104.anInt2636 != 0) {
			Static104.anInt2636 = 0;
			Static110.method1772(Static106.method1749(Static38.anInt951));
		}
		if (Static128.aBoolean274) {
			Static87.method1540();
		}
		if (Static5.aClass4_Sub7_1 != null && Static114.anInt2821 == 0) {
			Static110.method1772(Static5.aClass4_Sub7_1);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZII)I")
	public static int method173(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static3.method9(arg0 + 91923, 4, arg1 + 45365) + (Static3.method9(arg0 + 37821, 2, arg1 + 10294) - 128 >> 1) + (Static3.method9(arg0, 1, arg1) - 128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
