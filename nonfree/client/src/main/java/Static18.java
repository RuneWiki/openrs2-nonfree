import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "[Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array12;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
	public static int anInt497;

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
	public static int anInt498;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
	public static int anInt493 = 0;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "Lclient!oa;")
	public static Class56 aClass56_238 = Static33.method650("redstone3");

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!oa;")
	public static Class56 aClass56_239 = Static33.method650("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "Lclient!n;")
	public static Class52 aClass52_11 = new Class52(100);

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "Lclient!oa;")
	public static Class56 aClass56_240 = Static33.method650("mapdots");

	@OriginalMember(owner = "client!cf", name = "D", descriptor = "Lclient!oa;")
	private static Class56 aClass56_246 = Static33.method650("slide:");

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "Lclient!oa;")
	public static Class56 aClass56_241 = aClass56_246;

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "Lclient!oa;")
	private static Class56 aClass56_242 = Static33.method650("Your account has been disabled)3");

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "Lclient!oa;")
	public static Class56 aClass56_243 = aClass56_246;

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "Lclient!oa;")
	public static Class56 aClass56_244 = aClass56_242;

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "Lclient!oa;")
	public static Class56 aClass56_245 = Static33.method650(":0");

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method349() {
		if (Static35.aClass18_1 != null) {
			Static35.aClass18_1.method1539();
		}
		if (Static70.aClass18_2 != null) {
			Static70.aClass18_2.method1539();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V")
	public static void method350(@OriginalArg(0) int arg0) {
		Static5.anInt74 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method352() {
		aClass56_245 = null;
		aClass56_244 = null;
		aByteArrayArrayArray1 = null;
		aClass56_239 = null;
		aClass56_242 = null;
		aClass56_243 = null;
		aClass56_240 = null;
		aClass56_241 = null;
		aClass56_238 = null;
		aClass52_11 = null;
		aClass56_246 = null;
		aClass3_Sub1_Sub1_Sub4Array12 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BZ)V")
	public static void method353(@OriginalArg(1) boolean arg0) {
		Static108.aBoolean134 = arg0;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(99) int local99;
		@Pc(103) int local103;
		@Pc(126) int local126;
		@Pc(134) int local134;
		@Pc(143) int local143;
		if (!Static108.aBoolean134) {
			local18 = Static31.aClass3_Sub2_Sub1_3.method299();
			local22 = Static31.aClass3_Sub2_Sub1_3.method276();
			local30 = (Static73.anInt2013 - Static31.aClass3_Sub2_Sub1_3.anInt413) / 16;
			Static44.anIntArrayArray9 = new int[local30][4];
			for (local36 = 0; local36 < local30; local36++) {
				for (local40 = 0; local40 < 4; local40++) {
					Static44.anIntArrayArray9[local36][local40] = Static31.aClass3_Sub2_Sub1_3.method298();
				}
			}
			@Pc(62) boolean local62 = false;
			if ((local22 / 8 == 48 || local22 / 8 == 49) && local18 / 8 == 48) {
				local62 = true;
			}
			local40 = Static31.aClass3_Sub2_Sub1_3.method312();
			if (local22 / 8 == 48 && local18 / 8 == 148) {
				local62 = true;
			}
			local99 = Static31.aClass3_Sub2_Sub1_3.method276();
			local103 = Static31.aClass3_Sub2_Sub1_3.method283();
			Static44.anIntArray78 = new int[local30];
			Static106.anIntArray225 = new int[local30];
			Static34.aByteArrayArray5 = new byte[local30][];
			Static57.anIntArray120 = new int[local30];
			Static5.aByteArrayArray1 = new byte[local30][];
			local30 = 0;
			for (local126 = (local22 - 6) / 8; local126 <= (local22 + 6) / 8; local126++) {
				for (local134 = (local18 - 6) / 8; local134 <= (local18 + 6) / 8; local134++) {
					local143 = (local126 << 8) + local134;
					if (!local62 || local134 != 49 && local134 != 149 && local134 != 147 && local126 != 50 && (local126 != 49 || local134 != 47)) {
						Static57.anIntArray120[local30] = local143;
						Static106.anIntArray225[local30] = Static2.aClass44_Sub1_2.method1148(Static84.method1524(new Class56[] { Static114.aClass56_1565, Static111.method1851(local126), Static21.aClass56_305, Static111.method1851(local134) }));
						Static44.anIntArray78[local30] = Static2.aClass44_Sub1_2.method1148(Static84.method1524(new Class56[] { Static32.aClass56_526, Static111.method1851(local126), Static21.aClass56_305, Static111.method1851(local134) }));
						local30++;
					}
				}
			}
			Static105.method1753(local18, local103, local22, local40, local99);
			return;
		}
		local18 = Static31.aClass3_Sub2_Sub1_3.method299();
		local22 = Static31.aClass3_Sub2_Sub1_3.method276();
		local30 = Static31.aClass3_Sub2_Sub1_3.method294();
		local36 = Static31.aClass3_Sub2_Sub1_3.method276();
		Static31.aClass3_Sub2_Sub1_3.method322();
		@Pc(300) int local300;
		for (local40 = 0; local40 < 4; local40++) {
			for (local99 = 0; local99 < 13; local99++) {
				for (local103 = 0; local103 < 13; local103++) {
					local300 = Static31.aClass3_Sub2_Sub1_3.method323(1);
					if (local300 == 1) {
						Static13.anIntArrayArrayArray1[local40][local99][local103] = Static31.aClass3_Sub2_Sub1_3.method323(26);
					} else {
						Static13.anIntArrayArrayArray1[local40][local99][local103] = -1;
					}
				}
			}
		}
		Static31.aClass3_Sub2_Sub1_3.method318();
		local99 = (Static73.anInt2013 - Static31.aClass3_Sub2_Sub1_3.anInt413) / 16;
		Static44.anIntArrayArray9 = new int[local99][4];
		for (local103 = 0; local103 < local99; local103++) {
			for (local300 = 0; local300 < 4; local300++) {
				Static44.anIntArrayArray9[local103][local300] = Static31.aClass3_Sub2_Sub1_3.method267();
			}
		}
		local300 = Static31.aClass3_Sub2_Sub1_3.method276();
		Static5.aByteArrayArray1 = new byte[local99][];
		Static106.anIntArray225 = new int[local99];
		Static44.anIntArray78 = new int[local99];
		Static34.aByteArrayArray5 = new byte[local99][];
		Static57.anIntArray120 = new int[local99];
		local99 = 0;
		for (local126 = 0; local126 < 4; local126++) {
			for (local134 = 0; local134 < 13; local134++) {
				for (local143 = 0; local143 < 13; local143++) {
					@Pc(424) int local424 = Static13.anIntArrayArrayArray1[local126][local134][local143];
					if (local424 != -1) {
						@Pc(434) int local434 = local424 >> 14 & 0x3FF;
						@Pc(440) int local440 = local424 >> 3 & 0x7FF;
						@Pc(450) int local450 = local440 / 8 + (local434 / 8 << 8);
						for (@Pc(452) int local452 = 0; local452 < local99; local452++) {
							if (Static57.anIntArray120[local452] == local450) {
								local450 = -1;
								break;
							}
						}
						if (local450 != -1) {
							Static57.anIntArray120[local99] = local450;
							@Pc(484) int local484 = local450 >> 8 & 0xFF;
							@Pc(488) int local488 = local450 & 0xFF;
							Static106.anIntArray225[local99] = Static2.aClass44_Sub1_2.method1148(Static84.method1524(new Class56[] { Static114.aClass56_1565, Static111.method1851(local484), Static21.aClass56_305, Static111.method1851(local488) }));
							Static44.anIntArray78[local99] = Static2.aClass44_Sub1_2.method1148(Static84.method1524(new Class56[] { Static32.aClass56_526, Static111.method1851(local484), Static21.aClass56_305, Static111.method1851(local488) }));
							local99++;
						}
					}
				}
			}
		}
		Static105.method1753(local18, local30, local22, local300, local36);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
	public static void method354(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static117.anIntArray303[arg0];
		@Pc(19) int local19 = Static93.anIntArray219[arg0];
		@Pc(23) int local23 = Static9.anIntArray9[arg0];
		if (local23 >= 2000) {
			local23 -= 2000;
		}
		@Pc(31) int local31 = Static22.anIntArray47[arg0];
		if (Static126.anInt3105 != 0 && local23 != 1001) {
			Static12.aBoolean17 = true;
			Static126.anInt3105 = 0;
		}
		if (local23 == 11) {
			Static109.method1156(local15, local31, local19);
			Static111.aClass3_Sub2_Sub1_4.method325(161);
			Static111.aClass3_Sub2_Sub1_4.method289(local31 >> 14 & 0x7FFF);
			Static111.aClass3_Sub2_Sub1_4.method262(local15 + anInt497);
			Static111.aClass3_Sub2_Sub1_4.method290(Static57.anInt1618 + local19);
		}
		@Pc(92) Class3_Sub1_Sub2_Sub4_Sub2 local92;
		if (local23 == 27) {
			local92 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local31];
			if (local92 != null) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local92.anIntArray336[0], local92.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
				Static69.anInt1924 = 2;
				Static91.anInt2390 = Static127.anInt3209;
				Static9.anInt224 = Static71.anInt1970;
				Static24.anInt705 = 0;
				Static111.aClass3_Sub2_Sub1_4.method325(230);
				Static111.aClass3_Sub2_Sub1_4.method285(local31);
			}
		}
		if (local23 == 10) {
			local92 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local31];
			if (local92 != null) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local92.anIntArray336[0], local92.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
				Static9.anInt224 = Static71.anInt1970;
				Static91.anInt2390 = Static127.anInt3209;
				Static24.anInt705 = 0;
				Static69.anInt1924 = 2;
				Static111.aClass3_Sub2_Sub1_4.method325(56);
				Static111.aClass3_Sub2_Sub1_4.method289(local31);
			}
		}
		@Pc(236) int local236;
		@Pc(216) Class3_Sub1_Sub16 local216;
		if (local23 == 49) {
			Static111.aClass3_Sub2_Sub1_4.method325(235);
			Static111.aClass3_Sub2_Sub1_4.method280(local19);
			local216 = Static96.method1688(local19);
			if (local216.anIntArrayArray26 != null && local216.anIntArrayArray26[0][0] == 5) {
				local236 = local216.anIntArrayArray26[0][1];
				Static115.anIntArray292[local236] = 1 - Static115.anIntArray292[local236];
				Static11.method234(local236);
				Static115.aBoolean157 = true;
			}
		}
		if (local23 == 14) {
			Static111.aClass3_Sub2_Sub1_4.method325(205);
			Static111.aClass3_Sub2_Sub1_4.method285(local31);
			Static111.aClass3_Sub2_Sub1_4.method297(local19);
			Static111.aClass3_Sub2_Sub1_4.method262(local15);
			Static1.anInt9 = 2;
			Static69.anInt1923 = local15;
			if (Static57.anInt1607 == local19 >> 16) {
				Static1.anInt9 = 1;
			}
			Static4.anInt60 = 0;
			if (Static57.anInt1609 == local19 >> 16) {
				Static1.anInt9 = 3;
			}
			Static23.anInt692 = local19;
		}
		if (local23 == 1 && Static79.anInt2107 == -1) {
			Static57.method1085(local15, local19);
			Static57.anInt1596 = local15;
			Static79.anInt2107 = local19;
		}
		@Pc(322) Class3_Sub1_Sub2_Sub4_Sub1 local322;
		if (local23 == 15) {
			local322 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local31];
			if (local322 != null) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local322.anIntArray336[0], local322.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
				Static9.anInt224 = Static71.anInt1970;
				Static24.anInt705 = 0;
				Static91.anInt2390 = Static127.anInt3209;
				Static69.anInt1924 = 2;
				Static111.aClass3_Sub2_Sub1_4.method325(254);
				Static111.aClass3_Sub2_Sub1_4.method285(Static34.anInt968);
				Static111.aClass3_Sub2_Sub1_4.method280(anInt498);
				Static111.aClass3_Sub2_Sub1_4.method289(local31);
			}
		}
		if (local23 == 29) {
			Static111.aClass3_Sub2_Sub1_4.method325(80);
			Static111.aClass3_Sub2_Sub1_4.method290(local15);
			Static111.aClass3_Sub2_Sub1_4.method290(local31);
			Static111.aClass3_Sub2_Sub1_4.method297(local19);
			Static4.anInt60 = 0;
			Static1.anInt9 = 2;
			Static69.anInt1923 = local15;
			if (local19 >> 16 == Static57.anInt1607) {
				Static1.anInt9 = 1;
			}
			if (Static57.anInt1609 == local19 >> 16) {
				Static1.anInt9 = 3;
			}
			Static23.anInt692 = local19;
		}
		if (local23 == 30) {
			Static109.method1156(local15, local31, local19);
			Static111.aClass3_Sub2_Sub1_4.method325(69);
			Static111.aClass3_Sub2_Sub1_4.method289(local31 >> 14 & 0x7FFF);
			Static111.aClass3_Sub2_Sub1_4.method289(local19 + Static57.anInt1618);
			Static111.aClass3_Sub2_Sub1_4.method262(anInt497 + local15);
		}
		if (local23 == 55) {
			local216 = Static42.method784(local19, local15);
			if (local216 != null) {
				Static73.method1329();
				Static97.method1709(local15, local19, Static126.method2013(Static34.method652(local216)));
				Static115.aBoolean157 = true;
				Static98.anInt2560 = 0;
				Static76.aClass56_1114 = Static108.method1822(local216);
				if (Static76.aClass56_1114 == null) {
					Static76.aClass56_1114 = Static63.aClass56_972;
				}
				if (local216.aBoolean149) {
					Static126.aClass56_1702 = Static84.method1524(new Class56[] { local216.aClass56_1545, Static123.aClass56_1664 });
				} else {
					Static126.aClass56_1702 = Static84.method1524(new Class56[] { Static50.aClass56_803, local216.aClass56_1548, Static123.aClass56_1664 });
				}
				if (Static63.anInt1819 == 16 && !local216.aBoolean149) {
					Static124.aBoolean167 = true;
					Static27.anInt798 = 3;
					Static115.aBoolean157 = true;
				}
			}
			return;
		}
		if (local23 == 39) {
			Static1.method1();
		}
		@Pc(601) long local601;
		@Pc(581) Class56 local581;
		if (local23 == 18 || local23 == 57 || local23 == 35 || local23 == 41) {
			local581 = Static28.aClass56Array2[arg0];
			local236 = local581.method1424(Static123.aClass56_1664);
			if (local236 != -1) {
				local601 = local581.method1417(local236 + 5).method1425().method1445();
				if (local23 == 18) {
					Static51.method980(local601);
				}
				if (local23 == 57) {
					Static46.method1521(local601);
				}
				if (local23 == 35) {
					Static97.method1707(local601);
				}
				if (local23 == 41) {
					Static17.method348(local601);
				}
			}
		}
		if (local23 == 56) {
			if (Static122.aBoolean163) {
				Static116.aClass14_1.method407(Static94.anInt2470, local15 - 4, local19 - 4);
			} else {
				Static116.aClass14_1.method407(Static94.anInt2470, Static127.anInt3209 - 4, Static71.anInt1970 + -4);
			}
		}
		if (local23 == 46) {
			Static73.method1329();
			Static7.anInt412 = local31;
			Static115.aBoolean157 = true;
			Static98.anInt2560 = 1;
			Static68.anInt1859 = local15;
			Static12.anInt307 = local19;
			Static84.aClass56_1217 = Static84.method1524(new Class56[] { Static1.aClass56_6, Static12.method239(local31).aClass56_944, Static123.aClass56_1664 });
			if (Static84.aClass56_1217 == null) {
				Static84.aClass56_1217 = Static117.aClass56_1616;
			}
			return;
		}
		if (local23 == 47) {
			@Pc(707) boolean local707 = true;
			local216 = Static96.method1688(local19);
			if (local216.anInt2811 > 0) {
				local707 = Static69.method1280(local216);
			}
			if (local707) {
				Static111.aClass3_Sub2_Sub1_4.method325(235);
				Static111.aClass3_Sub2_Sub1_4.method280(local19);
			}
		}
		if (local23 == 50) {
			local322 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local31];
			if (local322 != null) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local322.anIntArray336[0], local322.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
				Static9.anInt224 = Static71.anInt1970;
				Static91.anInt2390 = Static127.anInt3209;
				Static24.anInt705 = 0;
				Static69.anInt1924 = 2;
				Static111.aClass3_Sub2_Sub1_4.method325(70);
				Static111.aClass3_Sub2_Sub1_4.method285(local31);
			}
		}
		@Pc(821) boolean local821;
		if (local23 == 54) {
			local821 = Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 0, false, local19, local15, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 0);
			if (!local821) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local19, local15, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
			}
			Static24.anInt705 = 0;
			Static9.anInt224 = Static71.anInt1970;
			Static91.anInt2390 = Static127.anInt3209;
			Static69.anInt1924 = 2;
			Static111.aClass3_Sub2_Sub1_4.method325(229);
			Static111.aClass3_Sub2_Sub1_4.method289(local31);
			Static111.aClass3_Sub2_Sub1_4.method285(local19 + Static57.anInt1618);
			Static111.aClass3_Sub2_Sub1_4.method285(anInt497 + local15);
		}
		if (local23 == 31) {
			local821 = Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 0, false, local19, local15, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 0);
			if (!local821) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local19, local15, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
			}
			Static69.anInt1924 = 2;
			Static91.anInt2390 = Static127.anInt3209;
			Static9.anInt224 = Static71.anInt1970;
			Static24.anInt705 = 0;
			Static111.aClass3_Sub2_Sub1_4.method325(185);
			Static111.aClass3_Sub2_Sub1_4.method262(Static57.anInt1618 + local19);
			Static111.aClass3_Sub2_Sub1_4.method285(local31);
			Static111.aClass3_Sub2_Sub1_4.method289(local15 + anInt497);
		}
		if (local23 == 34) {
			Static109.method1156(local15, local31, local19);
			Static111.aClass3_Sub2_Sub1_4.method325(228);
			Static111.aClass3_Sub2_Sub1_4.method285(local31 >> 14 & 0x7FFF);
			Static111.aClass3_Sub2_Sub1_4.method290(local15 + anInt497);
			Static111.aClass3_Sub2_Sub1_4.method289(Static57.anInt1618 + local19);
		}
		if (local23 == 6) {
			Static111.aClass3_Sub2_Sub1_4.method325(28);
			Static111.aClass3_Sub2_Sub1_4.method274(local19);
			Static111.aClass3_Sub2_Sub1_4.method290(local15);
			Static111.aClass3_Sub2_Sub1_4.method285(local31);
			Static4.anInt60 = 0;
			Static69.anInt1923 = local15;
			Static1.anInt9 = 2;
			Static23.anInt692 = local19;
			if (local19 >> 16 == Static57.anInt1607) {
				Static1.anInt9 = 1;
			}
			if (local19 >> 16 == Static57.anInt1609) {
				Static1.anInt9 = 3;
			}
		}
		if (local23 == 17) {
			Static25.method532(Static69.anInt1918);
			Static12.aBoolean17 = true;
			Static69.anInt1918 = -1;
		}
		if (local23 == 42) {
			local821 = Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 0, false, local19, local15, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 0);
			if (!local821) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local19, local15, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
			}
			Static24.anInt705 = 0;
			Static69.anInt1924 = 2;
			Static91.anInt2390 = Static127.anInt3209;
			Static9.anInt224 = Static71.anInt1970;
			Static111.aClass3_Sub2_Sub1_4.method325(215);
			Static111.aClass3_Sub2_Sub1_4.method262(local19 + Static57.anInt1618);
			Static111.aClass3_Sub2_Sub1_4.method289(anInt497 + local15);
			Static111.aClass3_Sub2_Sub1_4.method289(local31);
		}
		if (local23 == 1005) {
			Static109.method1156(local15, local31, local19);
			Static111.aClass3_Sub2_Sub1_4.method325(248);
			Static111.aClass3_Sub2_Sub1_4.method289(local31 >> 14 & 0x7FFF);
			Static111.aClass3_Sub2_Sub1_4.method262(anInt497 + local15);
			Static111.aClass3_Sub2_Sub1_4.method262(local19 + Static57.anInt1618);
		}
		if (local23 == 45) {
			Static111.aClass3_Sub2_Sub1_4.method325(93);
			Static111.aClass3_Sub2_Sub1_4.method290(local31);
			Static111.aClass3_Sub2_Sub1_4.method297(local19);
			Static111.aClass3_Sub2_Sub1_4.method285(local15);
			Static23.anInt692 = local19;
			Static1.anInt9 = 2;
			Static4.anInt60 = 0;
			if (local19 >> 16 == Static57.anInt1607) {
				Static1.anInt9 = 1;
			}
			Static69.anInt1923 = local15;
			if (Static57.anInt1609 == local19 >> 16) {
				Static1.anInt9 = 3;
			}
		}
		@Pc(1263) int local1263;
		if (local23 == 20) {
			local581 = Static28.aClass56Array2[arg0];
			local236 = local581.method1424(Static123.aClass56_1664);
			if (local236 != -1) {
				local601 = local581.method1417(local236 + 5).method1425().method1445();
				local1263 = -1;
				for (@Pc(1265) int local1265 = 0; local1265 < Static42.anInt1124; local1265++) {
					if (local601 == Static3.aLongArray36[local1265]) {
						local1263 = local1265;
						break;
					}
				}
				if (local1263 != -1 && Static86.anIntArray195[local1263] > 0) {
					Static122.aClass56_1632 = Static122.aClass56_1633;
					Static76.anInt2064 = 3;
					Static126.anInt3105 = 0;
					Static105.aBoolean121 = true;
					Static12.aBoolean17 = true;
					Static28.aLong21 = Static3.aLongArray36[local1263];
					Static122.aClass56_1634 = Static84.method1524(new Class56[] { Static65.aClass56_980, Static113.aClass56Array15[local1263] });
				}
			}
		}
		if (local23 == 37) {
			local322 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local31];
			if (local322 != null) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local322.anIntArray336[0], local322.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
				Static69.anInt1924 = 2;
				Static9.anInt224 = Static71.anInt1970;
				Static91.anInt2390 = Static127.anInt3209;
				Static24.anInt705 = 0;
				Static111.aClass3_Sub2_Sub1_4.method325(138);
				Static111.aClass3_Sub2_Sub1_4.method285(local31);
			}
		}
		if (local23 == 21) {
			local322 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local31];
			if (local322 != null) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local322.anIntArray336[0], local322.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
				Static9.anInt224 = Static71.anInt1970;
				Static24.anInt705 = 0;
				Static69.anInt1924 = 2;
				Static91.anInt2390 = Static127.anInt3209;
				Static111.aClass3_Sub2_Sub1_4.method325(9);
				Static111.aClass3_Sub2_Sub1_4.method290(local31);
			}
		}
		if (local23 == 48) {
			local821 = Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 0, false, local19, local15, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 0);
			if (!local821) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local19, local15, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
			}
			Static69.anInt1924 = 2;
			Static9.anInt224 = Static71.anInt1970;
			Static91.anInt2390 = Static127.anInt3209;
			Static24.anInt705 = 0;
			Static111.aClass3_Sub2_Sub1_4.method325(85);
			Static111.aClass3_Sub2_Sub1_4.method290(Static68.anInt1859);
			Static111.aClass3_Sub2_Sub1_4.method285(anInt497 + local15);
			Static111.aClass3_Sub2_Sub1_4.method290(Static57.anInt1618 + local19);
			Static111.aClass3_Sub2_Sub1_4.method290(local31);
			Static111.aClass3_Sub2_Sub1_4.method297(Static12.anInt307);
			Static111.aClass3_Sub2_Sub1_4.method289(Static7.anInt412);
		}
		if (local23 == 32) {
			local821 = Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 0, false, local19, local15, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 0);
			if (!local821) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local19, local15, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
			}
			Static69.anInt1924 = 2;
			Static9.anInt224 = Static71.anInt1970;
			Static91.anInt2390 = Static127.anInt3209;
			Static24.anInt705 = 0;
			Static111.aClass3_Sub2_Sub1_4.method325(55);
			Static111.aClass3_Sub2_Sub1_4.method289(anInt497 + local15);
			Static111.aClass3_Sub2_Sub1_4.method285(local31);
			Static111.aClass3_Sub2_Sub1_4.method290(Static57.anInt1618 + local19);
		}
		if (local23 == 1004) {
			Static24.anInt705 = 0;
			Static9.anInt224 = Static71.anInt1970;
			Static69.anInt1924 = 2;
			Static91.anInt2390 = Static127.anInt3209;
			Static111.aClass3_Sub2_Sub1_4.method325(186);
			Static111.aClass3_Sub2_Sub1_4.method262(local31);
		}
		if (local23 == 8) {
			Static50.method907(local19, local15, local31);
		}
		if (local23 == 28) {
			local92 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local31];
			if (local92 != null) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local92.anIntArray336[0], local92.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
				Static91.anInt2390 = Static127.anInt3209;
				Static24.anInt705 = 0;
				Static9.anInt224 = Static71.anInt1970;
				Static69.anInt1924 = 2;
				Static111.aClass3_Sub2_Sub1_4.method325(198);
				Static111.aClass3_Sub2_Sub1_4.method262(local31);
			}
		}
		if (local23 == 33) {
			Static111.aClass3_Sub2_Sub1_4.method325(60);
			Static111.aClass3_Sub2_Sub1_4.method274(local19);
			Static111.aClass3_Sub2_Sub1_4.method289(Static34.anInt968);
			Static111.aClass3_Sub2_Sub1_4.method309(anInt498);
			Static111.aClass3_Sub2_Sub1_4.method285(local31);
			Static111.aClass3_Sub2_Sub1_4.method289(local15);
			Static23.anInt692 = local19;
			Static69.anInt1923 = local15;
			Static4.anInt60 = 0;
			Static1.anInt9 = 2;
			if (local19 >> 16 == Static57.anInt1607) {
				Static1.anInt9 = 1;
			}
			if (Static57.anInt1609 == local19 >> 16) {
				Static1.anInt9 = 3;
			}
		}
		if (local23 == 1003) {
			local216 = Static96.method1688(local19);
			if (local216 == null || local216.anIntArray265[local15] < 100000) {
				Static111.aClass3_Sub2_Sub1_4.method325(186);
				Static111.aClass3_Sub2_Sub1_4.method262(local31);
			} else {
				Static75.method1348(0, Static84.method1524(new Class56[] { Static111.method1851(local216.anIntArray265[local15]), Static99.aClass56_478, Static12.method239(local31).aClass56_944 }), Static122.aClass56_1633);
			}
			Static69.anInt1923 = local15;
			Static1.anInt9 = 2;
			Static23.anInt692 = local19;
			if (Static57.anInt1607 == local19 >> 16) {
				Static1.anInt9 = 1;
			}
			if (Static57.anInt1609 == local19 >> 16) {
				Static1.anInt9 = 3;
			}
			Static4.anInt60 = 0;
		}
		if (local23 == 38 && Static109.method1156(local15, local31, local19)) {
			Static111.aClass3_Sub2_Sub1_4.method325(110);
			Static111.aClass3_Sub2_Sub1_4.method289(local15 + anInt497);
			Static111.aClass3_Sub2_Sub1_4.method262(Static68.anInt1859);
			Static111.aClass3_Sub2_Sub1_4.method289(Static57.anInt1618 + local19);
			Static111.aClass3_Sub2_Sub1_4.method285(local31 >> 14 & 0x7FFF);
			Static111.aClass3_Sub2_Sub1_4.method297(Static12.anInt307);
			Static111.aClass3_Sub2_Sub1_4.method289(Static7.anInt412);
		}
		if (local23 == 12) {
			Static111.aClass3_Sub2_Sub1_4.method325(7);
			Static111.aClass3_Sub2_Sub1_4.method274(local19);
			Static111.aClass3_Sub2_Sub1_4.method290(local15);
			Static111.aClass3_Sub2_Sub1_4.method285(local31);
			Static4.anInt60 = 0;
			Static1.anInt9 = 2;
			Static69.anInt1923 = local15;
			if (local19 >> 16 == Static57.anInt1607) {
				Static1.anInt9 = 1;
			}
			if (Static57.anInt1609 == local19 >> 16) {
				Static1.anInt9 = 3;
			}
			Static23.anInt692 = local19;
		}
		if (local23 == 22) {
			Static111.aClass3_Sub2_Sub1_4.method325(235);
			Static111.aClass3_Sub2_Sub1_4.method280(local19);
			local216 = Static96.method1688(local19);
			if (local216.anIntArrayArray26 != null && local216.anIntArrayArray26[0][0] == 5) {
				local236 = local216.anIntArrayArray26[0][1];
				if (Static115.anIntArray292[local236] != local216.anIntArray270[0]) {
					Static115.anIntArray292[local236] = local216.anIntArray270[0];
					Static11.method234(local236);
					Static115.aBoolean157 = true;
				}
			}
		}
		if (local23 == 53) {
			Static111.aClass3_Sub2_Sub1_4.method325(87);
			Static111.aClass3_Sub2_Sub1_4.method297(local19);
			Static111.aClass3_Sub2_Sub1_4.method262(local15);
			Static111.aClass3_Sub2_Sub1_4.method262(local31);
			Static23.anInt692 = local19;
			Static4.anInt60 = 0;
			Static1.anInt9 = 2;
			if (local19 >> 16 == Static57.anInt1607) {
				Static1.anInt9 = 1;
			}
			Static69.anInt1923 = local15;
			if (Static57.anInt1609 == local19 >> 16) {
				Static1.anInt9 = 3;
			}
		}
		if (local23 == 1006) {
			Static24.anInt705 = 0;
			Static69.anInt1924 = 2;
			Static91.anInt2390 = Static127.anInt3209;
			Static9.anInt224 = Static71.anInt1970;
			Static111.aClass3_Sub2_Sub1_4.method325(204);
			Static111.aClass3_Sub2_Sub1_4.method285(local31 >> 14 & 0x7FFF);
		}
		if (local23 == 36) {
			Static111.aClass3_Sub2_Sub1_4.method325(174);
			Static111.aClass3_Sub2_Sub1_4.method297(local19);
			Static111.aClass3_Sub2_Sub1_4.method289(local15);
			Static111.aClass3_Sub2_Sub1_4.method289(local31);
			Static4.anInt60 = 0;
			Static69.anInt1923 = local15;
			Static1.anInt9 = 2;
			Static23.anInt692 = local19;
			if (local19 >> 16 == Static57.anInt1607) {
				Static1.anInt9 = 1;
			}
			if (local19 >> 16 == Static57.anInt1609) {
				Static1.anInt9 = 3;
			}
		}
		if (local23 == 5 && Static109.method1156(local15, local31, local19)) {
			Static111.aClass3_Sub2_Sub1_4.method325(47);
			Static111.aClass3_Sub2_Sub1_4.method285(local19 + Static57.anInt1618);
			Static111.aClass3_Sub2_Sub1_4.method285(local31 >> 14 & 0x7FFF);
			Static111.aClass3_Sub2_Sub1_4.method285(Static34.anInt968);
			Static111.aClass3_Sub2_Sub1_4.method274(anInt498);
			Static111.aClass3_Sub2_Sub1_4.method262(anInt497 + local15);
		}
		if (local23 == 24) {
			local92 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local31];
			if (local92 != null) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local92.anIntArray336[0], local92.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
				Static24.anInt705 = 0;
				Static91.anInt2390 = Static127.anInt3209;
				Static69.anInt1924 = 2;
				Static9.anInt224 = Static71.anInt1970;
				Static111.aClass3_Sub2_Sub1_4.method325(8);
				Static111.aClass3_Sub2_Sub1_4.method285(local31);
			}
		}
		if (local23 == 16) {
			Static111.aClass3_Sub2_Sub1_4.method325(167);
			Static111.aClass3_Sub2_Sub1_4.method297(local19);
			Static111.aClass3_Sub2_Sub1_4.method289(local31);
			Static111.aClass3_Sub2_Sub1_4.method262(local15);
			Static4.anInt60 = 0;
			Static23.anInt692 = local19;
			Static69.anInt1923 = local15;
			Static1.anInt9 = 2;
			if (Static57.anInt1607 == local19 >> 16) {
				Static1.anInt9 = 1;
			}
			if (local19 >> 16 == Static57.anInt1609) {
				Static1.anInt9 = 3;
			}
		}
		if (local23 == 44) {
			Static111.aClass3_Sub2_Sub1_4.method325(179);
			Static111.aClass3_Sub2_Sub1_4.method309(local19);
			Static111.aClass3_Sub2_Sub1_4.method285(local31);
			Static111.aClass3_Sub2_Sub1_4.method285(local15);
			Static4.anInt60 = 0;
			Static69.anInt1923 = local15;
			Static1.anInt9 = 2;
			if (local19 >> 16 == Static57.anInt1607) {
				Static1.anInt9 = 1;
			}
			Static23.anInt692 = local19;
			if (local19 >> 16 == Static57.anInt1609) {
				Static1.anInt9 = 3;
			}
		}
		if (local23 == 1002) {
			Static69.anInt1924 = 2;
			Static9.anInt224 = Static71.anInt1970;
			Static24.anInt705 = 0;
			Static91.anInt2390 = Static127.anInt3209;
			local92 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local31];
			if (local92 != null) {
				@Pc(2374) Class3_Sub1_Sub17 local2374 = local92.aClass3_Sub1_Sub17_1;
				if (local2374.anIntArray290 != null) {
					local2374 = local2374.method1901();
				}
				if (local2374 != null) {
					Static111.aClass3_Sub2_Sub1_4.method325(46);
					Static111.aClass3_Sub2_Sub1_4.method289(local2374.anInt2929);
				}
			}
		}
		if (local23 == 23) {
			Static111.aClass3_Sub2_Sub1_4.method325(99);
			Static111.aClass3_Sub2_Sub1_4.method289(local15);
			Static111.aClass3_Sub2_Sub1_4.method290(local31);
			Static111.aClass3_Sub2_Sub1_4.method280(local19);
			Static1.anInt9 = 2;
			Static4.anInt60 = 0;
			Static69.anInt1923 = local15;
			Static23.anInt692 = local19;
			if (local19 >> 16 == Static57.anInt1607) {
				Static1.anInt9 = 1;
			}
			if (local19 >> 16 == Static57.anInt1609) {
				Static1.anInt9 = 3;
			}
		}
		if (local23 == 13) {
			local322 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local31];
			if (local322 != null) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local322.anIntArray336[0], local322.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
				Static69.anInt1924 = 2;
				Static24.anInt705 = 0;
				Static9.anInt224 = Static71.anInt1970;
				Static91.anInt2390 = Static127.anInt3209;
				Static111.aClass3_Sub2_Sub1_4.method325(154);
				Static111.aClass3_Sub2_Sub1_4.method289(local31);
				Static111.aClass3_Sub2_Sub1_4.method285(Static68.anInt1859);
				Static111.aClass3_Sub2_Sub1_4.method289(Static7.anInt412);
				Static111.aClass3_Sub2_Sub1_4.method297(Static12.anInt307);
			}
		}
		if (local23 == 19) {
			local92 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local31];
			if (local92 != null) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local92.anIntArray336[0], local92.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
				Static91.anInt2390 = Static127.anInt3209;
				Static24.anInt705 = 0;
				Static9.anInt224 = Static71.anInt1970;
				Static69.anInt1924 = 2;
				Static111.aClass3_Sub2_Sub1_4.method325(86);
				Static111.aClass3_Sub2_Sub1_4.method262(local31);
			}
		}
		if (local23 == 3) {
			Static111.aClass3_Sub2_Sub1_4.method325(34);
			Static111.aClass3_Sub2_Sub1_4.method290(Static34.anInt968);
			Static111.aClass3_Sub2_Sub1_4.method289(local15);
			Static111.aClass3_Sub2_Sub1_4.method297(local19);
			Static111.aClass3_Sub2_Sub1_4.method280(anInt498);
		}
		if (local23 == 9) {
			local821 = Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 0, false, local19, local15, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 0);
			if (!local821) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local19, local15, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
			}
			Static9.anInt224 = Static71.anInt1970;
			Static69.anInt1924 = 2;
			Static91.anInt2390 = Static127.anInt3209;
			Static24.anInt705 = 0;
			Static111.aClass3_Sub2_Sub1_4.method325(192);
			Static111.aClass3_Sub2_Sub1_4.method309(anInt498);
			Static111.aClass3_Sub2_Sub1_4.method289(local19 + Static57.anInt1618);
			Static111.aClass3_Sub2_Sub1_4.method262(local31);
			Static111.aClass3_Sub2_Sub1_4.method285(local15 + anInt497);
			Static111.aClass3_Sub2_Sub1_4.method262(Static34.anInt968);
		}
		if (local23 == 7 || local23 == 40) {
			local581 = Static28.aClass56Array2[arg0];
			local236 = local581.method1424(Static123.aClass56_1664);
			if (local236 != -1) {
				@Pc(2717) boolean local2717 = false;
				local581 = local581.method1417(local236 + 5).method1425();
				@Pc(2736) Class56 local2736 = local581.method1431().method1421();
				for (local1263 = 0; local1263 < Static110.anInt2767; local1263++) {
					@Pc(2746) Class3_Sub1_Sub2_Sub4_Sub1 local2746 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[Static54.anIntArray108[local1263]];
					if (local2746 != null && local2746.aClass56_764 != null && local2746.aClass56_764.method1418(local2736)) {
						local2717 = true;
						Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local2746.anIntArray336[0], local2746.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
						if (local23 == 7) {
							Static111.aClass3_Sub2_Sub1_4.method325(244);
							Static111.aClass3_Sub2_Sub1_4.method289(Static54.anIntArray108[local1263]);
						}
						if (local23 == 40) {
							Static111.aClass3_Sub2_Sub1_4.method325(70);
							Static111.aClass3_Sub2_Sub1_4.method285(Static54.anIntArray108[local1263]);
						}
						break;
					}
				}
				if (!local2717) {
					Static75.method1348(0, Static84.method1524(new Class56[] { Static22.aClass56_335, local2736 }), Static122.aClass56_1633);
				}
			}
		}
		if (local23 == 51) {
			local821 = Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 0, false, local19, local15, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 0);
			if (!local821) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local19, local15, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
			}
			Static24.anInt705 = 0;
			Static9.anInt224 = Static71.anInt1970;
			Static91.anInt2390 = Static127.anInt3209;
			Static69.anInt1924 = 2;
			Static111.aClass3_Sub2_Sub1_4.method325(171);
			Static111.aClass3_Sub2_Sub1_4.method262(local31);
			Static111.aClass3_Sub2_Sub1_4.method290(anInt497 + local15);
			Static111.aClass3_Sub2_Sub1_4.method289(Static57.anInt1618 + local19);
		}
		if (local23 == 2) {
			local322 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local31];
			if (local322 != null) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local322.anIntArray336[0], local322.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
				Static91.anInt2390 = Static127.anInt3209;
				Static24.anInt705 = 0;
				Static69.anInt1924 = 2;
				Static9.anInt224 = Static71.anInt1970;
				Static111.aClass3_Sub2_Sub1_4.method325(135);
				Static111.aClass3_Sub2_Sub1_4.method289(local31);
			}
		}
		if (local23 == 58) {
			Static111.aClass3_Sub2_Sub1_4.method325(184);
			Static111.aClass3_Sub2_Sub1_4.method290(Static68.anInt1859);
			Static111.aClass3_Sub2_Sub1_4.method262(Static7.anInt412);
			Static111.aClass3_Sub2_Sub1_4.method297(local19);
			Static111.aClass3_Sub2_Sub1_4.method285(local31);
			Static111.aClass3_Sub2_Sub1_4.method285(local15);
			Static111.aClass3_Sub2_Sub1_4.method297(Static12.anInt307);
			Static4.anInt60 = 0;
			Static69.anInt1923 = local15;
			Static1.anInt9 = 2;
			if (Static57.anInt1607 == local19 >> 16) {
				Static1.anInt9 = 1;
			}
			Static23.anInt692 = local19;
			if (local19 >> 16 == Static57.anInt1609) {
				Static1.anInt9 = 3;
			}
		}
		if (local23 == 52) {
			local92 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local31];
			if (local92 != null) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local92.anIntArray336[0], local92.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
				Static9.anInt224 = Static71.anInt1970;
				Static24.anInt705 = 0;
				Static69.anInt1924 = 2;
				Static91.anInt2390 = Static127.anInt3209;
				Static111.aClass3_Sub2_Sub1_4.method325(188);
				Static111.aClass3_Sub2_Sub1_4.method290(Static68.anInt1859);
				Static111.aClass3_Sub2_Sub1_4.method285(Static7.anInt412);
				Static111.aClass3_Sub2_Sub1_4.method262(local31);
				Static111.aClass3_Sub2_Sub1_4.method297(Static12.anInt307);
			}
		}
		if (local23 == 25) {
			local92 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local31];
			if (local92 != null) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local92.anIntArray336[0], local92.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
				Static9.anInt224 = Static71.anInt1970;
				Static24.anInt705 = 0;
				Static91.anInt2390 = Static127.anInt3209;
				Static69.anInt1924 = 2;
				Static111.aClass3_Sub2_Sub1_4.method325(68);
				Static111.aClass3_Sub2_Sub1_4.method290(Static34.anInt968);
				Static111.aClass3_Sub2_Sub1_4.method280(anInt498);
				Static111.aClass3_Sub2_Sub1_4.method262(local31);
			}
		}
		if (local23 == 43) {
			local322 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local31];
			if (local322 != null) {
				Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 1, false, local322.anIntArray336[0], local322.anIntArray332[0], 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 1);
				Static9.anInt224 = Static71.anInt1970;
				Static69.anInt1924 = 2;
				Static24.anInt705 = 0;
				Static91.anInt2390 = Static127.anInt3209;
				Static111.aClass3_Sub2_Sub1_4.method325(244);
				Static111.aClass3_Sub2_Sub1_4.method289(local31);
			}
		}
		if (local23 == 26) {
			Static109.method1156(local15, local31, local19);
			Static111.aClass3_Sub2_Sub1_4.method325(49);
			Static111.aClass3_Sub2_Sub1_4.method290(anInt497 + local15);
			Static111.aClass3_Sub2_Sub1_4.method289(Static57.anInt1618 + local19);
			Static111.aClass3_Sub2_Sub1_4.method262(local31 >> 14 & 0x7FFF);
		}
		if (local23 == 4) {
			local581 = Static28.aClass56Array2[arg0];
			local236 = local581.method1424(Static123.aClass56_1664);
			if (local236 != -1) {
				if (Static57.anInt1607 == -1) {
					Static1.method1();
					if (Static25.anInt756 != -1) {
						Static122.aClass56_1631 = local581.method1417(local236 + 5).method1425();
						Static70.aBoolean87 = false;
						Static43.anInt1143 = Static57.anInt1607 = Static25.anInt756;
					}
				} else {
					Static75.method1348(0, Static38.aClass56_574, Static122.aClass56_1633);
					if (Static35.aClass56_550 != null) {
						Static75.method1348(0, Static35.aClass56_550, Static122.aClass56_1633);
					}
				}
			}
		}
		if (Static98.anInt2560 != 0) {
			Static115.aBoolean157 = true;
			Static98.anInt2560 = 0;
		}
		if (Static93.aBoolean114) {
			Static73.method1329();
			Static115.aBoolean157 = true;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!tb;)V")
	public static void method355(@OriginalArg(1) Class44 arg0) {
		Static50.aClass44_33 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!oa;II)V")
	public static void method357(@OriginalArg(0) Class56 arg0, @OriginalArg(2) int arg1) {
		Static111.aClass3_Sub2_Sub1_4.method325(226);
		Static111.aClass3_Sub2_Sub1_4.method308(arg1);
		Static111.aClass3_Sub2_Sub1_4.method314(arg0.method1445());
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method358(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static45.aClass48_1);
		arg0.removeMouseMotionListener(Static45.aClass48_1);
		arg0.removeFocusListener(Static45.aClass48_1);
	}
}
