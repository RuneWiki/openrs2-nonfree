import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!v", name = "R", descriptor = "I")
	public static int anInt2594;

	@OriginalMember(owner = "client!v", name = "Lb", descriptor = "Lclient!ve;")
	public static Class2_Sub2_Sub17 aClass2_Sub2_Sub17_4;

	@OriginalMember(owner = "client!v", name = "Vb", descriptor = "Lclient!pe;")
	public static Class26_Sub1 aClass26_Sub1_71;

	@OriginalMember(owner = "client!v", name = "I", descriptor = "Lclient!u;")
	private static Class74 aClass74_1616 = Static72.method1077("Message");

	@OriginalMember(owner = "client!v", name = "Ob", descriptor = "Lclient!u;")
	private static Class74 aClass74_1622 = Static72.method1077("Loaded wordpack");

	@OriginalMember(owner = "client!v", name = "V", descriptor = "Lclient!u;")
	public static Class74 aClass74_1617 = aClass74_1622;

	@OriginalMember(owner = "client!v", name = "X", descriptor = "Lclient!u;")
	public static Class74 aClass74_1618 = Static72.method1077("Hier wechseln");

	@OriginalMember(owner = "client!v", name = "hb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1619 = null;

	@OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
	public static int anInt2602 = 0;

	@OriginalMember(owner = "client!v", name = "pb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1620 = aClass74_1616;

	@OriginalMember(owner = "client!v", name = "Ib", descriptor = "Lclient!u;")
	public static Class74 aClass74_1621 = Static72.method1077("Abbrechen");

	@OriginalMember(owner = "client!v", name = "Sb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1623 = Static72.method1077("::qa_op_test");

	@OriginalMember(owner = "client!v", name = "Ub", descriptor = "Z")
	public static boolean aBoolean113 = false;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
	public static void method1782(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class13 local17 = Static41.aClass13ArrayArrayArray1[Static117.anInt2529][arg1][arg0];
		if (local17 == null) {
			Static84.aClass69_1.method1658(Static117.anInt2529, arg1, arg0);
			return;
		}
		@Pc(27) int local27 = -99999999;
		@Pc(29) Class2_Sub2_Sub2_Sub6 local29 = null;
		@Pc(34) Class2_Sub2_Sub2_Sub6 local34;
		for (local34 = (Class2_Sub2_Sub2_Sub6) local17.method415(); local34 != null; local34 = (Class2_Sub2_Sub2_Sub6) local17.method414()) {
			@Pc(40) Class2_Sub2_Sub12 local40 = Static35.method1934(local34.anInt1889);
			@Pc(43) int local43 = local40.anInt1728;
			if (local40.anInt1727 == 1) {
				local43 *= local34.anInt1884 + 1;
			}
			if (local43 > local27) {
				local29 = local34;
				local27 = local43;
			}
		}
		if (local29 == null) {
			Static84.aClass69_1.method1658(Static117.anInt2529, arg1, arg0);
			return;
		}
		@Pc(78) Class2_Sub2_Sub2_Sub6 local78 = null;
		local17.method428(local29);
		@Pc(91) int local91 = arg1 + (arg0 << 7) + 1610612736;
		local34 = (Class2_Sub2_Sub2_Sub6) local17.method415();
		@Pc(98) Class2_Sub2_Sub2_Sub6 local98 = null;
		while (local34 != null) {
			if (local34.anInt1889 != local29.anInt1889) {
				if (local78 == null) {
					local78 = local34;
				}
				if (local34.anInt1889 != local78.anInt1889 && local98 == null) {
					local98 = local34;
				}
			}
			local34 = (Class2_Sub2_Sub2_Sub6) local17.method414();
		}
		Static84.aClass69_1.method1641(Static117.anInt2529, arg1, arg0, Static15.method348(arg1 * 128 + 64, arg0 * 128 + 64, Static117.anInt2529), local29, local91, local78, local98);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
	public static void method1785() {
		aClass74_1620 = null;
		aClass2_Sub2_Sub17_4 = null;
		aClass74_1619 = null;
		aClass74_1621 = null;
		aClass74_1617 = null;
		aClass74_1623 = null;
		aClass74_1622 = null;
		aClass26_Sub1_71 = null;
		aClass74_1616 = null;
		aClass74_1618 = null;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)V")
	public static void method1787() {
		Static87.aClass16_46.method485();
		Static35.aClass16_93.method485();
		Static123.aClass16_89.method485();
		Static90.aClass16_67.method485();
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
	public static void method1788() {
		if (Static78.aBooleanArray5[98]) {
			Static88.anInt1858 += (12 - Static88.anInt1858) / 2;
		} else if (Static78.aBooleanArray5[99]) {
			Static88.anInt1858 += (-Static88.anInt1858 - 12) / 2;
		} else {
			Static88.anInt1858 /= 2;
		}
		Static86.anInt1843 += Static88.anInt1858 / 2;
		if (Static86.anInt1843 < 128) {
			Static86.anInt1843 = 128;
		}
		@Pc(53) int local53 = Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 + Static39.anInt948;
		@Pc(59) int local59 = Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 + Static5.anInt63;
		if (Static86.anInt1842 - local59 < -500 || Static86.anInt1842 - local59 > 500 || Static17.anInt536 - local53 < -500 || Static17.anInt536 - local53 > 500) {
			Static17.anInt536 = local53;
			Static86.anInt1842 = local59;
		}
		if (Static86.anInt1843 > 383) {
			Static86.anInt1843 = 383;
		}
		if (local59 != Static86.anInt1842) {
			Static86.anInt1842 += (local59 - Static86.anInt1842) / 16;
		}
		if (Static17.anInt536 != local53) {
			Static17.anInt536 += (local53 - Static17.anInt536) / 16;
		}
		@Pc(132) int local132 = Static86.anInt1842 >> 7;
		if (Static78.aBooleanArray5[96]) {
			Static119.anInt2550 += (-Static119.anInt2550 - 24) / 2;
		} else if (Static78.aBooleanArray5[97]) {
			Static119.anInt2550 += (24 - Static119.anInt2550) / 2;
		} else {
			Static119.anInt2550 /= 2;
		}
		@Pc(169) int local169 = Static17.anInt536 >> 7;
		Static18.anInt562 = Static18.anInt562 + Static119.anInt2550 / 2 & 0x7FF;
		@Pc(184) int local184 = Static15.method348(Static86.anInt1842, Static17.anInt536, Static117.anInt2529);
		@Pc(186) int local186 = 0;
		@Pc(206) int local206;
		if (local132 > 3 && local169 > 3 && local132 < 100 && local169 < 100) {
			for (local206 = local132 - 4; local206 <= local132 + 4; local206++) {
				for (@Pc(212) int local212 = local169 - 4; local212 <= local169 + 4; local212++) {
					@Pc(216) int local216 = Static117.anInt2529;
					if (local216 < 3 && (Static17.aByteArrayArrayArray1[1][local206][local212] & 0x2) == 2) {
						local216++;
					}
					@Pc(244) int local244 = local184 - Static56.anIntArrayArrayArray2[local216][local206][local212];
					if (local186 < local244) {
						local186 = local244;
					}
				}
			}
		}
		local206 = local186 * 192;
		if (local206 > 98048) {
			local206 = 98048;
		}
		if (local206 < 32768) {
			local206 = 32768;
		}
		if (local206 > Static97.anInt2891) {
			Static97.anInt2891 += (local206 - Static97.anInt2891) / 24;
		} else if (Static97.anInt2891 > local206) {
			Static97.anInt2891 += (local206 - Static97.anInt2891) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ve;II)I")
	public static int method1793(@OriginalArg(0) Class2_Sub2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArrayArray30 == null || arg0.anIntArrayArray30.length <= arg1) {
			return -2;
		}
		try {
			@Pc(29) int[] local29 = arg0.anIntArrayArray30[arg1];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(35) byte local35 = 0;
			while (true) {
				@Pc(40) int local40 = local29[local33++];
				@Pc(42) int local42 = 0;
				@Pc(44) byte local44 = 0;
				if (local40 == 0) {
					return local31;
				}
				if (local40 == 1) {
					local42 = Static70.anIntArray193[local29[local33++]];
				}
				if (local40 == 15) {
					local44 = 1;
				}
				if (local40 == 16) {
					local44 = 2;
				}
				if (local40 == 2) {
					local42 = Static102.anIntArray323[local29[local33++]];
				}
				if (local40 == 17) {
					local44 = 3;
				}
				if (local40 == 3) {
					local42 = Static109.anIntArray344[local29[local33++]];
				}
				@Pc(110) int local110;
				@Pc(121) Class2_Sub2_Sub17 local121;
				@Pc(126) int local126;
				@Pc(139) int local139;
				if (local40 == 4) {
					local110 = local29[local33++] << 16;
					@Pc(117) int local117 = local110 + local29[local33++];
					local121 = Static41.method668(local117);
					local126 = local29[local33++];
					if (local126 != -1 && (!Static35.method1934(local126).aBoolean69 || Static1.aBoolean86)) {
						for (local139 = 0; local139 < local121.anIntArray402.length; local139++) {
							if (local121.anIntArray402[local139] == local126 + 1) {
								local42 += local121.anIntArray406[local139];
							}
						}
					}
				}
				if (local40 == 5) {
					local42 = Static88.anIntArray260[local29[local33++]];
				}
				if (local40 == 6) {
					local42 = Class55.anIntArray256[Static102.anIntArray323[local29[local33++]] - 1];
				}
				if (local40 == 7) {
					local42 = Static88.anIntArray260[local29[local33++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local42 = Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2734;
				}
				if (local40 == 9) {
					for (local110 = 0; local110 < 25; local110++) {
						if (Static98.aBooleanArray9[local110]) {
							local42 += Static102.anIntArray323[local110];
						}
					}
				}
				if (local40 == 10) {
					local110 = local29[local33++] << 16;
					local110 += local29[local33++];
					local121 = Static41.method668(local110);
					local126 = local29[local33++];
					if (local126 != -1 && (!Static35.method1934(local126).aBoolean69 || Static1.aBoolean86)) {
						for (local139 = 0; local139 < local121.anIntArray402.length; local139++) {
							if (local121.anIntArray402[local139] == local126 + 1) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local42 = Static21.anInt612;
				}
				if (local40 == 12) {
					local42 = Static64.anInt1441;
				}
				if (local40 == 13) {
					local110 = Static88.anIntArray260[local29[local33++]];
					@Pc(322) int local322 = local29[local33++];
					local42 = (0x1 << local322 & local110) == 0 ? 0 : 1;
				}
				if (local40 == 14) {
					local110 = local29[local33++];
					local42 = Static116.method1730(local110);
				}
				if (local40 == 18) {
					local42 = (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 >> 7) + Static107.anInt2343;
				}
				if (local40 == 19) {
					local42 = Static62.anInt1413 + (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 >> 7);
				}
				if (local40 == 20) {
					local42 = local29[local33++];
				}
				if (local44 == 0) {
					if (local35 == 0) {
						local31 += local42;
					}
					if (local35 == 1) {
						local31 -= local42;
					}
					if (local35 == 2 && local42 != 0) {
						local31 /= local42;
					}
					if (local35 == 3) {
						local31 *= local42;
					}
					local35 = 0;
				} else {
					local35 = local44;
				}
			}
		} catch (@Pc(428) Exception local428) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
	public static void method1812() {
		try {
			if (Static2.anInt40 == 0) {
				if (Static88.aClass62_4 != null) {
					Static88.aClass62_4.method1347();
					Static88.aClass62_4 = null;
				}
				Static21.aClass37_2 = null;
				Static42.aBoolean37 = false;
				Static2.anInt40 = 1;
				Static8.anInt255 = 0;
			}
			if (Static2.anInt40 == 1) {
				if (Static21.aClass37_2 == null) {
					Static21.aClass37_2 = Static35.aClass15_59.method462(Static53.anInt1292, Static88.aString4);
				}
				if (Static21.aClass37_2.anInt1337 == 2) {
					throw new IOException();
				}
				if (Static21.aClass37_2.anInt1337 == 1) {
					Static88.aClass62_4 = new Class62((Socket) Static21.aClass37_2.anObject3, Static35.aClass15_59);
					Static21.aClass37_2 = null;
					Static2.anInt40 = 2;
				}
			}
			if (Static2.anInt40 == 2) {
				@Pc(72) long local72 = Static84.aLong71 = Static49.aClass74_842.method1696();
				@Pc(79) int local79 = (int) (local72 >> 16 & 0x1FL);
				Static128.aClass2_Sub10_Sub1_3.anInt2187 = 0;
				Static128.aClass2_Sub10_Sub1_3.method1486(14);
				Static128.aClass2_Sub10_Sub1_3.method1486(local79);
				Static88.aClass62_4.method1343(2, Static128.aClass2_Sub10_Sub1_3.aByteArray27);
				Static2.anInt40 = 3;
				Static19.aClass2_Sub10_Sub1_1.anInt2187 = 0;
			}
			@Pc(119) int local119;
			if (Static2.anInt40 == 3) {
				if (Static79.aClass22_1 != null) {
					Static79.aClass22_1.method1082();
				}
				if (Static98.aClass22_2 != null) {
					Static98.aClass22_2.method1082();
				}
				local119 = Static88.aClass62_4.method1348();
				if (Static79.aClass22_1 != null) {
					Static79.aClass22_1.method1082();
				}
				if (Static98.aClass22_2 != null) {
					Static98.aClass22_2.method1082();
				}
				if (local119 != 0) {
					Static2.method20(local119);
					return;
				}
				Static19.aClass2_Sub10_Sub1_1.anInt2187 = 0;
				Static2.anInt40 = 4;
			}
			if (Static2.anInt40 == 4) {
				if (Static19.aClass2_Sub10_Sub1_1.anInt2187 < 8) {
					local119 = Static88.aClass62_4.method1350();
					if (8 - Static19.aClass2_Sub10_Sub1_1.anInt2187 < local119) {
						local119 = 8 - Static19.aClass2_Sub10_Sub1_1.anInt2187;
					}
					if (local119 > 0) {
						Static88.aClass62_4.method1345(Static19.aClass2_Sub10_Sub1_1.aByteArray27, local119, Static19.aClass2_Sub10_Sub1_1.anInt2187);
						Static19.aClass2_Sub10_Sub1_1.anInt2187 += local119;
					}
				}
				if (Static19.aClass2_Sub10_Sub1_1.anInt2187 == 8) {
					Static19.aClass2_Sub10_Sub1_1.anInt2187 = 0;
					Static71.aLong61 = Static19.aClass2_Sub10_Sub1_1.method1478();
					Static2.anInt40 = 5;
				}
			}
			if (Static2.anInt40 == 5) {
				Static128.aClass2_Sub10_Sub1_3.anInt2187 = 0;
				@Pc(214) int[] local214 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static71.aLong61 >> 32), (int) Static71.aLong61 };
				Static128.aClass2_Sub10_Sub1_3.method1486(10);
				Static128.aClass2_Sub10_Sub1_3.method1497(local214[0]);
				Static128.aClass2_Sub10_Sub1_3.method1497(local214[1]);
				Static128.aClass2_Sub10_Sub1_3.method1497(local214[2]);
				Static128.aClass2_Sub10_Sub1_3.method1497(local214[3]);
				Static128.aClass2_Sub10_Sub1_3.method1497(Static35.aClass15_59.anInt621);
				Static128.aClass2_Sub10_Sub1_3.method1495(Static49.aClass74_842.method1696());
				Static128.aClass2_Sub10_Sub1_3.method1494(Static49.aClass74_853);
				Static128.aClass2_Sub10_Sub1_3.method1491(Static12.aBigInteger1, Static127.aBigInteger2);
				Static42.aClass2_Sub10_Sub1_2.anInt2187 = 0;
				if (Static68.anInt1490 == 40) {
					Static42.aClass2_Sub10_Sub1_2.method1486(18);
				} else {
					Static42.aClass2_Sub10_Sub1_2.method1486(16);
				}
				Static42.aClass2_Sub10_Sub1_2.method1486(Static128.aClass2_Sub10_Sub1_3.anInt2187 + 69);
				Static42.aClass2_Sub10_Sub1_2.method1497(456);
				Static42.aClass2_Sub10_Sub1_2.method1486(Static84.aBoolean73 ? 1 : 0);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static31.aClass26_Sub1_26.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static23.aClass26_Sub1_24.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static66.aClass26_Sub1_46.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static93.aClass26_Sub1_56.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static82.aClass26_Sub1_54.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(aClass26_Sub1_71.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static35.aClass26_Sub1_77.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static11.aClass26_Sub1_14.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static50.aClass26_Sub1_35.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static103.aClass26_Sub1_63.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static55.aClass26_Sub1_20.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static56.aClass26_Sub1_41.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static53.aClass26_Sub1_38.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static3.aClass26_Sub1_3.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static110.aClass26_Sub1_67.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1497(Static126.aClass26_Sub1_76.anInt1957);
				Static42.aClass2_Sub10_Sub1_2.method1515(Static128.aClass2_Sub10_Sub1_3.aByteArray27, Static128.aClass2_Sub10_Sub1_3.anInt2187);
				Static88.aClass62_4.method1343(Static42.aClass2_Sub10_Sub1_2.anInt2187, Static42.aClass2_Sub10_Sub1_2.aByteArray27);
				Static128.aClass2_Sub10_Sub1_3.method1541(local214);
				for (@Pc(427) int local427 = 0; local427 < 4; local427++) {
					local214[local427] += 50;
				}
				Static19.aClass2_Sub10_Sub1_1.method1541(local214);
				Static2.anInt40 = 6;
			}
			if (Static2.anInt40 == 6 && Static88.aClass62_4.method1350() > 0) {
				local119 = Static88.aClass62_4.method1348();
				if (local119 == 21 && Static68.anInt1490 == 20) {
					Static2.anInt40 = 7;
				} else if (local119 == 2) {
					Static2.anInt40 = 9;
				} else if (local119 == 15 && Static68.anInt1490 == 40) {
					Static91.method1337();
					return;
				} else if (local119 == 23 && Static61.anInt1572 < 1) {
					Static61.anInt1572++;
					Static2.anInt40 = 0;
				} else {
					Static2.method20(local119);
					return;
				}
			}
			if (Static2.anInt40 == 7 && Static88.aClass62_4.method1350() > 0) {
				Static56.anInt1362 = Static88.aClass62_4.method1348() * 60 + 180;
				Static2.anInt40 = 8;
			}
			if (Static2.anInt40 == 8) {
				Static8.anInt255 = 0;
				Static52.method874(Static78.aClass74_1179, Static91.method1340(new Class74[] { Static56.method940(Static56.anInt1362 / 60), Static93.aClass74_1331 }), Static11.aClass74_301);
				if (--Static56.anInt1362 <= 0) {
					Static2.anInt40 = 0;
				}
			} else {
				if (Static2.anInt40 == 9 && Static88.aClass62_4.method1350() >= 8) {
					Static5.anInt64 = Static88.aClass62_4.method1348();
					aBoolean113 = Static88.aClass62_4.method1348() == 1;
					Static39.anInt949 = Static88.aClass62_4.method1348();
					Static39.anInt949 <<= 0x8;
					Static39.anInt949 += Static88.aClass62_4.method1348();
					Static29.anInt691 = Static88.aClass62_4.method1348();
					Static88.aClass62_4.method1345(Static19.aClass2_Sub10_Sub1_1.aByteArray27, 1, 0);
					Static19.aClass2_Sub10_Sub1_1.anInt2187 = 0;
					Static35.anInt2888 = Static19.aClass2_Sub10_Sub1_1.method1536();
					Static88.aClass62_4.method1345(Static19.aClass2_Sub10_Sub1_1.aByteArray27, 2, 0);
					Static19.aClass2_Sub10_Sub1_1.anInt2187 = 0;
					Static16.anInt463 = Static19.aClass2_Sub10_Sub1_1.method1517();
					Static2.anInt40 = 10;
				}
				if (Static2.anInt40 != 10) {
					Static8.anInt255++;
					if (Static8.anInt255 > 2000) {
						if (Static61.anInt1572 < 1) {
							Static61.anInt1572++;
							if (Static53.anInt1292 == Static109.anInt2397) {
								Static53.anInt1292 = Static8.anInt252;
							} else {
								Static53.anInt1292 = Static109.anInt2397;
							}
							Static2.anInt40 = 0;
						} else {
							Static2.method20(-3);
						}
					}
				} else if (Static88.aClass62_4.method1350() >= Static16.anInt463) {
					Static19.aClass2_Sub10_Sub1_1.anInt2187 = 0;
					Static88.aClass62_4.method1345(Static19.aClass2_Sub10_Sub1_1.aByteArray27, Static16.anInt463, 0);
					Static101.method1565();
					Static113.anInt2442 = -1;
					Static48.method793(false);
					Static35.anInt2888 = -1;
				}
			}
		} catch (@Pc(704) IOException local704) {
			if (Static61.anInt1572 < 1) {
				Static61.anInt1572++;
				Static2.anInt40 = 0;
				if (Static53.anInt1292 == Static109.anInt2397) {
					Static53.anInt1292 = Static8.anInt252;
				} else {
					Static53.anInt1292 = Static109.anInt2397;
				}
			} else {
				Static2.method20(-2);
			}
		}
	}
}
