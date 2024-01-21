import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ea", name = "xb", descriptor = "Lclient!rf;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!ea", name = "bb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_391 = Static28.method504("<col=00ff80>");

	@OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
	public static volatile int anInt738 = 0;

	@OriginalMember(owner = "client!ea", name = "db", descriptor = "[Lclient!ea;")
	public static Class20_Sub1[] aClass20_Sub1Array1 = new Class20_Sub1[256];

	@OriginalMember(owner = "client!ea", name = "fb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_392 = Static28.method504("<col=00ff00>");

	@OriginalMember(owner = "client!ea", name = "ib", descriptor = "Lclient!ja;")
	public static Class39 aClass39_393 = Static28.method504(" <col=ffffff>");

	@OriginalMember(owner = "client!ea", name = "jb", descriptor = "I")
	public static int anInt741 = 0;

	@OriginalMember(owner = "client!ea", name = "Eb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_395 = Static28.method504("Too many connections from your address)3");

	@OriginalMember(owner = "client!ea", name = "Cb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_394 = aClass39_395;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
	public static void method493() {
		@Pc(12) int local12;
		@Pc(26) int local26;
		@Pc(18) int local18;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(46) int local46;
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (Static103.anInt2562 == 48) {
			local12 = Static35.aClass4_Sub16_Sub1_1.method1438();
			local18 = (local12 & 0x7) + Static14.anInt366;
			local26 = (local12 >> 4 & 0x7) + Static52.anInt1358;
			local30 = Static35.aClass4_Sub16_Sub1_1.method1438();
			local34 = local30 >> 2;
			local38 = Static63.anIntArray176[local34];
			local42 = Static35.aClass4_Sub16_Sub1_1.method1471();
			local46 = local30 & 0x3;
			if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
				Static97.method1791(local26, local42, local18, local46, local34, -1, local38, 0, Static131.anInt3202);
			}
			return;
		}
		@Pc(133) int local133;
		@Pc(141) int local141;
		@Pc(145) int local145;
		@Pc(149) int local149;
		@Pc(137) int local137;
		if (Static103.anInt2562 == 92) {
			local12 = Static35.aClass4_Sub16_Sub1_1.method1474();
			local26 = Static52.anInt1358 + (local12 >> 4 & 0x7);
			local18 = Static14.anInt366 + (local12 & 0x7);
			local30 = local26 + Static35.aClass4_Sub16_Sub1_1.method1477();
			local34 = local18 + Static35.aClass4_Sub16_Sub1_1.method1477();
			local46 = Static35.aClass4_Sub16_Sub1_1.method1476();
			local38 = Static35.aClass4_Sub16_Sub1_1.method1490();
			local42 = Static35.aClass4_Sub16_Sub1_1.method1474() * 4;
			local133 = Static35.aClass4_Sub16_Sub1_1.method1474() * 4;
			local137 = Static35.aClass4_Sub16_Sub1_1.method1490();
			local141 = Static35.aClass4_Sub16_Sub1_1.method1490();
			local145 = Static35.aClass4_Sub16_Sub1_1.method1474();
			local149 = Static35.aClass4_Sub16_Sub1_1.method1474();
			if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104 && local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104 && local38 != 65535) {
				local18 = local18 * 128 + 64;
				local34 = local34 * 128 + 64;
				local26 = local26 * 128 + 64;
				local30 = local30 * 128 + 64;
				@Pc(229) Class4_Sub2_Sub1_Sub3 local229 = new Class4_Sub2_Sub1_Sub3(local38, Static131.anInt3202, local26, local18, Static94.method1708(local26, local18, Static131.anInt3202) - local42, Static71.anInt1738 + local137, local141 + Static71.anInt1738, local145, local149, local46, local133);
				local229.method735(Static71.anInt1738 + local137, local30, Static94.method1708(local30, local34, Static131.anInt3202) - local133, local34);
				Static114.aClass61_13.method1635(local229);
			}
			return;
		}
		@Pc(300) Class4_Sub2_Sub1_Sub7 local300;
		if (Static103.anInt2562 == 132) {
			local12 = Static35.aClass4_Sub16_Sub1_1.method1490();
			local26 = Static35.aClass4_Sub16_Sub1_1.method1472();
			local18 = Static52.anInt1358 + (local26 >> 4 & 0x7);
			local30 = (local26 & 0x7) + Static14.anInt366;
			if (local18 >= 0 && local30 >= 0 && local18 < 104 && local30 < 104) {
				@Pc(293) Class61 local293 = Static26.aClass61ArrayArrayArray1[Static131.anInt3202][local18][local30];
				if (local293 != null) {
					for (local300 = (Class4_Sub2_Sub1_Sub7) local293.method1628(); local300 != null; local300 = (Class4_Sub2_Sub1_Sub7) local293.method1629()) {
						if ((local12 & 0x7FFF) == local300.anInt3125) {
							local300.method2189();
							break;
						}
					}
					if (local293.method1628() == null) {
						Static26.aClass61ArrayArrayArray1[Static131.anInt3202][local18][local30] = null;
					}
					Static77.method1293(local18, local30);
				}
			}
			return;
		}
		@Pc(454) int local454;
		if (Static103.anInt2562 == 252) {
			local12 = Static35.aClass4_Sub16_Sub1_1.method1474();
			local26 = local12 >> 2;
			local18 = local12 & 0x3;
			local30 = Static63.anIntArray176[local26];
			local34 = Static35.aClass4_Sub16_Sub1_1.method1444();
			local38 = (local34 & 0x7) + Static14.anInt366;
			local46 = (local34 >> 4 & 0x7) + Static52.anInt1358;
			local42 = Static35.aClass4_Sub16_Sub1_1.method1453();
			if (local46 >= 0 && local38 >= 0 && local46 < 103 && local38 < 103) {
				local145 = Static6.anIntArrayArrayArray1[Static131.anInt3202][local46][local38 + 1];
				local137 = Static6.anIntArrayArrayArray1[Static131.anInt3202][local46 + 1][local38];
				local133 = Static6.anIntArrayArrayArray1[Static131.anInt3202][local46][local38];
				local141 = Static6.anIntArrayArrayArray1[Static131.anInt3202][local46 + 1][local38 + 1];
				if (local30 == 0) {
					@Pc(445) Class78 local445 = Static101.aClass43_1.method1091(Static131.anInt3202, local46, local38);
					if (local445 != null) {
						local454 = local445.anInt3135 >> 14 & 0x7FFF;
						if (local26 == 2) {
							local445.aClass4_Sub2_Sub1_7 = new Class4_Sub2_Sub1_Sub2(local454, 2, local18 + 4, local133, local137, local141, local145, local42, false, local445.aClass4_Sub2_Sub1_7);
							local445.aClass4_Sub2_Sub1_8 = new Class4_Sub2_Sub1_Sub2(local454, 2, local18 + 1 & 0x3, local133, local137, local141, local145, local42, false, local445.aClass4_Sub2_Sub1_8);
						} else {
							local445.aClass4_Sub2_Sub1_7 = new Class4_Sub2_Sub1_Sub2(local454, local26, local18, local133, local137, local141, local145, local42, false, local445.aClass4_Sub2_Sub1_7);
						}
					}
				}
				if (local30 == 1) {
					@Pc(522) Class23 local522 = Static101.aClass43_1.method1104(Static131.anInt3202, local46, local38);
					if (local522 != null) {
						local522.aClass4_Sub2_Sub1_3 = new Class4_Sub2_Sub1_Sub2(local522.anInt784 >> 14 & 0x7FFF, 4, 0, local133, local137, local141, local145, local42, false, local522.aClass4_Sub2_Sub1_3);
					}
				}
				if (local30 == 2) {
					if (local26 == 11) {
						local26 = 10;
					}
					@Pc(561) Class19 local561 = Static101.aClass43_1.method1085(Static131.anInt3202, local46, local38);
					if (local561 != null) {
						local561.aClass4_Sub2_Sub1_2 = new Class4_Sub2_Sub1_Sub2(local561.anInt669 >> 14 & 0x7FFF, local26, local18, local133, local137, local141, local145, local42, false, local561.aClass4_Sub2_Sub1_2);
					}
				}
				if (local30 == 3) {
					@Pc(595) Class3 local595 = Static101.aClass43_1.method1100(Static131.anInt3202, local46, local38);
					if (local595 != null) {
						local595.aClass4_Sub2_Sub1_1 = new Class4_Sub2_Sub1_Sub2(local595.anInt22 >> 14 & 0x7FFF, 22, local18, local133, local137, local141, local145, local42, false, local595.aClass4_Sub2_Sub1_1);
					}
				}
			}
		} else if (Static103.anInt2562 == 113) {
			local12 = Static35.aClass4_Sub16_Sub1_1.method1474();
			local26 = Static52.anInt1358 + (local12 >> 4 & 0x7);
			local18 = (local12 & 0x7) + Static14.anInt366;
			local30 = Static35.aClass4_Sub16_Sub1_1.method1490();
			local34 = Static35.aClass4_Sub16_Sub1_1.method1490();
			local46 = Static35.aClass4_Sub16_Sub1_1.method1490();
			if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
				@Pc(675) Class61 local675 = Static26.aClass61ArrayArrayArray1[Static131.anInt3202][local26][local18];
				if (local675 != null) {
					for (@Pc(682) Class4_Sub2_Sub1_Sub7 local682 = (Class4_Sub2_Sub1_Sub7) local675.method1628(); local682 != null; local682 = (Class4_Sub2_Sub1_Sub7) local675.method1629()) {
						if ((local30 & 0x7FFF) == local682.anInt3125 && local682.anInt3128 == local34) {
							local682.anInt3128 = local46;
							break;
						}
					}
					Static77.method1293(local26, local18);
				}
			}
		} else {
			if (Static103.anInt2562 == 22) {
				local12 = Static35.aClass4_Sub16_Sub1_1.method1474();
				local26 = (local12 >> 4 & 0x7) + Static52.anInt1358;
				local18 = (local12 & 0x7) + Static14.anInt366;
				local30 = Static35.aClass4_Sub16_Sub1_1.method1490();
				local34 = Static35.aClass4_Sub16_Sub1_1.method1474();
				local46 = local34 >> 4 & 0xF;
				local42 = Static35.aClass4_Sub16_Sub1_1.method1474();
				local38 = local34 & 0x7;
				if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
					local133 = local46 + 1;
					if (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0] >= local26 - local133 && Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0] <= local26 + local133 && Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0] >= local18 - local133 && Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0] <= local133 + local18 && Static72.anInt794 != 0 && local38 > 0 && Static125.anInt3122 < 50) {
						Static31.anIntArray91[Static125.anInt3122] = local30;
						Static84.anIntArray221[Static125.anInt3122] = local38;
						Static68.anIntArray193[Static125.anInt3122] = local42;
						Static14.aClass62Array1[Static125.anInt3122] = null;
						Static30.anIntArray87[Static125.anInt3122] = (local18 << 8) + ((local26 << 16) + local46);
						Static125.anInt3122++;
					}
				}
			}
			if (Static103.anInt2562 == 144) {
				local12 = Static35.aClass4_Sub16_Sub1_1.method1472();
				local26 = (local12 >> 4 & 0x7) + Static52.anInt1358;
				local18 = Static14.anInt366 + (local12 & 0x7);
				local30 = Static35.aClass4_Sub16_Sub1_1.method1471();
				local34 = Static35.aClass4_Sub16_Sub1_1.method1467();
				if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
					local300 = new Class4_Sub2_Sub1_Sub7();
					local300.anInt3125 = local34;
					local300.anInt3128 = local30;
					if (Static26.aClass61ArrayArrayArray1[Static131.anInt3202][local26][local18] == null) {
						Static26.aClass61ArrayArrayArray1[Static131.anInt3202][local26][local18] = new Class61();
					}
					Static26.aClass61ArrayArrayArray1[Static131.anInt3202][local26][local18].method1635(local300);
					Static77.method1293(local26, local18);
				}
			} else {
				if (Static103.anInt2562 == 8) {
					@Pc(964) byte local964 = Static35.aClass4_Sub16_Sub1_1.method1477();
					@Pc(968) byte local968 = Static35.aClass4_Sub16_Sub1_1.method1477();
					local18 = Static35.aClass4_Sub16_Sub1_1.method1471();
					local30 = Static35.aClass4_Sub16_Sub1_1.method1467();
					local34 = Static35.aClass4_Sub16_Sub1_1.method1444();
					local46 = local34 >> 2;
					local38 = local34 & 0x3;
					local42 = Static63.anIntArray176[local46];
					@Pc(996) byte local996 = Static35.aClass4_Sub16_Sub1_1.method1485();
					@Pc(1000) byte local1000 = Static35.aClass4_Sub16_Sub1_1.method1449();
					local141 = Static35.aClass4_Sub16_Sub1_1.method1471();
					local145 = Static35.aClass4_Sub16_Sub1_1.method1474();
					local454 = Static14.anInt366 + (local145 & 0x7);
					local149 = (local145 >> 4 & 0x7) + Static52.anInt1358;
					@Pc(1027) int local1027 = Static35.aClass4_Sub16_Sub1_1.method1467();
					@Pc(1038) Class4_Sub2_Sub1_Sub1_Sub1 local1038;
					if (Static30.anInt783 == local141) {
						local1038 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1;
					} else {
						local1038 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local141];
					}
					if (local1038 != null) {
						@Pc(1048) Class4_Sub2_Sub10 local1048 = Static73.method1207(local18);
						@Pc(1058) int local1058 = Static6.anIntArrayArrayArray1[Static131.anInt3202][local149 + 1][local454];
						@Pc(1066) int local1066 = Static6.anIntArrayArrayArray1[Static131.anInt3202][local149][local454];
						@Pc(1078) int local1078 = Static6.anIntArrayArrayArray1[Static131.anInt3202][local149 + 1][local454 + 1];
						@Pc(1088) int local1088 = Static6.anIntArrayArrayArray1[Static131.anInt3202][local149][local454 + 1];
						@Pc(1098) Class4_Sub2_Sub1_Sub6 local1098 = local1048.method926(local46, local1058, local1088, local1078, local38, local1066);
						if (local1098 != null) {
							@Pc(1109) byte local1109;
							if (local964 > local996) {
								local1109 = local964;
								local964 = local996;
								local996 = local1109;
							}
							if (local1000 > local968) {
								local1109 = local1000;
								local1000 = local968;
								local968 = local1109;
							}
							Static97.method1791(local149, -1, local454, 0, 0, local1027 + 1, local42, local30 + 1, Static131.anInt3202);
							@Pc(1144) int local1144 = local1048.anInt1410;
							local1038.anInt2450 = local30 + Static71.anInt1738;
							local1038.anInt2435 = Static71.anInt1738 + local1027;
							local1038.aClass4_Sub2_Sub1_Sub6_1 = local1098;
							@Pc(1161) int local1161 = local1048.anInt1413;
							if (local38 == 1 || local38 == 3) {
								local1161 = local1048.anInt1410;
								local1144 = local1048.anInt1413;
							}
							local1038.anInt2442 = local454 * 128 + local1161 * 64;
							local1038.anInt2443 = local1144 * 64 + local149 * 128;
							local1038.anInt2444 = Static94.method1708(local1038.anInt2443, local1038.anInt2442, Static131.anInt3202);
							local1038.anInt2453 = local1000 + local454;
							local1038.anInt2430 = local968 + local454;
							local1038.anInt2436 = local149 + local964;
							local1038.anInt2455 = local996 + local149;
						}
					}
				}
				if (Static103.anInt2562 == 27) {
					local12 = Static35.aClass4_Sub16_Sub1_1.method1444();
					local18 = Static14.anInt366 + (local12 & 0x7);
					local26 = (local12 >> 4 & 0x7) + Static52.anInt1358;
					local30 = Static35.aClass4_Sub16_Sub1_1.method1444();
					local34 = local30 >> 2;
					local46 = local30 & 0x3;
					local38 = Static63.anIntArray176[local34];
					if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
						Static97.method1791(local26, -1, local18, local46, local34, -1, local38, 0, Static131.anInt3202);
					}
				} else if (Static103.anInt2562 == 148) {
					local12 = Static35.aClass4_Sub16_Sub1_1.method1438();
					local26 = (local12 >> 4 & 0x7) + Static52.anInt1358;
					local18 = (local12 & 0x7) + Static14.anInt366;
					local30 = Static35.aClass4_Sub16_Sub1_1.method1471();
					local34 = Static35.aClass4_Sub16_Sub1_1.method1453();
					local46 = Static35.aClass4_Sub16_Sub1_1.method1490();
					if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104 && local34 != Static30.anInt783) {
						@Pc(1347) Class4_Sub2_Sub1_Sub7 local1347 = new Class4_Sub2_Sub1_Sub7();
						local1347.anInt3125 = local30;
						local1347.anInt3128 = local46;
						if (Static26.aClass61ArrayArrayArray1[Static131.anInt3202][local26][local18] == null) {
							Static26.aClass61ArrayArrayArray1[Static131.anInt3202][local26][local18] = new Class61();
						}
						Static26.aClass61ArrayArrayArray1[Static131.anInt3202][local26][local18].method1635(local1347);
						Static77.method1293(local26, local18);
					}
				} else if (Static103.anInt2562 == 9) {
					local12 = Static35.aClass4_Sub16_Sub1_1.method1474();
					local26 = (local12 >> 4 & 0x7) + Static52.anInt1358;
					local18 = Static14.anInt366 + (local12 & 0x7);
					local30 = Static35.aClass4_Sub16_Sub1_1.method1490();
					local34 = Static35.aClass4_Sub16_Sub1_1.method1474();
					local46 = Static35.aClass4_Sub16_Sub1_1.method1490();
					if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
						local26 = local26 * 128 + 64;
						local18 = local18 * 128 + 64;
						@Pc(1469) Class4_Sub2_Sub1_Sub5 local1469 = new Class4_Sub2_Sub1_Sub5(local30, Static131.anInt3202, local26, local18, Static94.method1708(local26, local18, Static131.anInt3202) - local34, local46, Static71.anInt1738);
						Static85.aClass61_11.method1635(local1469);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
	public static void method494() {
		@Pc(12) boolean local12 = false;
		while (!local12) {
			local12 = true;
			for (@Pc(18) int local18 = 0; local18 < Static105.anInt2033 - 1; local18++) {
				if (Static125.anIntArray358[local18] < 1000 && Static125.anIntArray358[local18 + 1] > 1000) {
					@Pc(38) Class39 local38 = Static52.aClass39Array11[local18];
					local12 = false;
					Static52.aClass39Array11[local18] = Static52.aClass39Array11[local18 + 1];
					Static52.aClass39Array11[local18 + 1] = local38;
					@Pc(58) Class39 local58 = Static47.aClass39Array8[local18];
					Static47.aClass39Array8[local18] = Static47.aClass39Array8[local18 + 1];
					Static47.aClass39Array8[local18 + 1] = local58;
					@Pc(76) int local76 = Static125.anIntArray358[local18];
					Static125.anIntArray358[local18] = Static125.anIntArray358[local18 + 1];
					Static125.anIntArray358[local18 + 1] = local76;
					@Pc(94) int local94 = Static10.anIntArray36[local18];
					Static10.anIntArray36[local18] = Static10.anIntArray36[local18 + 1];
					Static10.anIntArray36[local18 + 1] = local94;
					@Pc(112) int local112 = Static49.anIntArray136[local18];
					Static49.anIntArray136[local18] = Static49.anIntArray136[local18 + 1];
					Static49.anIntArray136[local18 + 1] = local112;
					@Pc(130) int local130 = Static104.anIntArray287[local18];
					Static104.anIntArray287[local18] = Static104.anIntArray287[local18 + 1];
					Static104.anIntArray287[local18 + 1] = local130;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	public static void method497() {
		aClass20_Sub1Array1 = null;
		aClass39_393 = null;
		aClass39_394 = null;
		aClass39_391 = null;
		aClass69_1 = null;
		aClass39_392 = null;
		aClass39_395 = null;
	}

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "(II)Z")
	public static boolean method502(@OriginalArg(0) int arg0) {
		if (Static24.aBooleanArray7[arg0]) {
			return true;
		} else if (Static105.aClass20_42.method472(arg0)) {
			@Pc(23) int local23 = Static105.aClass20_42.method471(arg0);
			if (local23 == 0) {
				Static24.aBooleanArray7[arg0] = true;
				return true;
			}
			if (Static109.aClass4_Sub5ArrayArray1[arg0] == null) {
				Static109.aClass4_Sub5ArrayArray1[arg0] = new Class4_Sub5[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (Static109.aClass4_Sub5ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static105.aClass20_42.method474(arg0, local47);
					if (local61 != null) {
						Static109.aClass4_Sub5ArrayArray1[arg0][local47] = new Class4_Sub5();
						Static109.aClass4_Sub5ArrayArray1[arg0][local47].anInt1230 = (arg0 << 16) + local47;
						if (local61[0] == -1) {
							Static109.aClass4_Sub5ArrayArray1[arg0][local47].method786(new Class4_Sub16(local61));
						} else {
							Static109.aClass4_Sub5ArrayArray1[arg0][local47].method792(new Class4_Sub16(local61));
						}
					}
				}
			}
			Static24.aBooleanArray7[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!ea;ILclient!u;)V")
	public static void method503(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub1 arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class61 local9 = Static33.aClass61_5;
		synchronized (Static33.aClass61_5) {
			for (@Pc(16) Class4_Sub23 local16 = (Class4_Sub23) Static33.aClass61_5.method1628(); local16 != null; local16 = (Class4_Sub23) Static33.aClass61_5.method1629()) {
				if ((long) arg0 == local16.aLong155 && local16.aClass75_4 == arg2 && local16.anInt3043 == 0) {
					local7 = local16.aByteArray34;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(63) byte[] local63 = arg2.method2018(arg0);
			arg1.method492(true, arg2, local63, arg0);
		} else {
			arg1.method492(true, arg2, local7, arg0);
		}
	}
}
