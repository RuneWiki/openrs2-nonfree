import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
	public static int anInt1895;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
	public static int anInt1899;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1168 = Static69.method1153("glow1:");

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1169 = Static69.method1153("wishes to duel with you)3");

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1170 = Static69.method1153("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1171 = aClass64_1169;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1172 = aClass64_1168;

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1173 = Static69.method1153("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
	public static int anInt1901 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 method1366() {
		@Pc(7) Class1_Sub1_Sub5_Sub3 local7 = new Class1_Sub1_Sub5_Sub3();
		local7.anInt1798 = Static1.anInt47;
		local7.anInt1796 = Static23.anIntArray95[0];
		local7.anInt1799 = Static91.anIntArray303[0];
		local7.anIntArray259 = Static25.anIntArray437;
		local7.anInt1797 = Static98.anIntArray327[0];
		local7.anInt1800 = Static116.anIntArray441[0];
		local7.aByteArray22 = Static116.aByteArrayArray8[0];
		local7.anInt1795 = Static65.anInt1495;
		Static27.method675();
		return local7;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!ua;B[Lclient!nc;)V")
	public static void method1367(@OriginalArg(0) Class68 arg0, @OriginalArg(2) Class52[] arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(28) int local28;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static18.aByteArrayArrayArray2[local3][local7][local11] & 0x1) == 1) {
						local28 = local3;
						if ((Static18.aByteArrayArrayArray2[1][local7][local11] & 0x2) == 2) {
							local28 = local3 - 1;
						}
						if (local28 >= 0) {
							arg1[local28].method1200(local7, local11);
						}
					}
				}
			}
		}
		Static50.anInt1193 += (int) (Math.random() * 5.0D) - 2;
		if (Static50.anInt1193 < -16) {
			Static50.anInt1193 = -16;
		}
		if (Static50.anInt1193 > 16) {
			Static50.anInt1193 = 16;
		}
		Static48.anInt2593 += (int) (Math.random() * 5.0D) - 2;
		if (Static48.anInt2593 < -8) {
			Static48.anInt2593 = -8;
		}
		if (Static48.anInt2593 > 8) {
			Static48.anInt2593 = 8;
		}
		@Pc(132) int local132;
		@Pc(134) int local134;
		@Pc(138) int local138;
		@Pc(161) int local161;
		@Pc(181) int local181;
		@Pc(194) int local194;
		@Pc(200) int local200;
		@Pc(210) int local210;
		@Pc(206) int local206;
		@Pc(228) int local228;
		@Pc(276) int local276;
		@Pc(507) int local507;
		@Pc(503) int local503;
		@Pc(641) int local641;
		@Pc(651) int local651;
		@Pc(666) int local666;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(122) byte[][] local122 = Static110.aByteArrayArrayArray7[local7];
			local28 = (int) Math.sqrt(5100.0D);
			local132 = local28 * 768 >> 8;
			for (local134 = 1; local134 < 103; local134++) {
				for (local138 = 1; local138 < 103; local138++) {
					local161 = Static102.anIntArrayArrayArray5[local7][local138 + 1][local134] - Static102.anIntArrayArrayArray5[local7][local138 - 1][local134];
					local181 = Static102.anIntArrayArrayArray5[local7][local138][local134 + 1] - Static102.anIntArrayArrayArray5[local7][local138][local134 - 1];
					local194 = (int) Math.sqrt((double) (local181 * local181 + local161 * local161 + 65536));
					local200 = (local161 << 8) / local194;
					local206 = (local181 << 8) / local194;
					local210 = 65536 / local194;
					local228 = (local210 * -10 + local200 * -50 + local206 * -50) / local132 + 96;
					local276 = (local122[local138][local134] >> 1) + (local122[local138][local134 + 1] >> 3) + (local122[local138][local134 + -1] >> 2) + (local122[local138 + -1][local134] >> 2) + (local122[local138 + 1][local134] >> 3);
					Static38.anIntArrayArray7[local138][local134] = local228 - local276;
				}
			}
			for (local138 = 0; local138 < 104; local138++) {
				Static96.anIntArray435[local138] = 0;
				Static48.anIntArray381[local138] = 0;
				Static94.anIntArray310[local138] = 0;
				Static79.anIntArray284[local138] = 0;
				Static28.anIntArray357[local138] = 0;
			}
			for (local161 = -5; local161 < 109; local161++) {
				for (local181 = 0; local181 < 104; local181++) {
					local194 = local161 + 5;
					@Pc(402) int local402;
					if (local194 >= 0 && local194 < 104) {
						local200 = Static75.aByteArrayArrayArray3[local7][local194][local181] & 0xFF;
						if (local200 > 0) {
							@Pc(366) Class1_Sub1_Sub14 local366 = Static3.method126(local200 - 1);
							Static96.anIntArray435[local181] += local366.anInt2179;
							Static48.anIntArray381[local181] += local366.anInt2165;
							Static94.anIntArray310[local181] += local366.anInt2174;
							Static79.anIntArray284[local181] += local366.anInt2163;
							local402 = Static28.anIntArray357[local181]++;
						}
					}
					local200 = local161 - 5;
					if (local200 >= 0 && local200 < 104) {
						local210 = Static75.aByteArrayArrayArray3[local7][local200][local181] & 0xFF;
						if (local210 > 0) {
							@Pc(432) Class1_Sub1_Sub14 local432 = Static3.method126(local210 - 1);
							Static96.anIntArray435[local181] -= local432.anInt2179;
							Static48.anIntArray381[local181] -= local432.anInt2165;
							Static94.anIntArray310[local181] -= local432.anInt2174;
							Static79.anIntArray284[local181] -= local432.anInt2163;
							local402 = Static28.anIntArray357[local181]--;
						}
					}
				}
				if (local161 >= 1 && local161 < 103) {
					local194 = 0;
					local210 = 0;
					local200 = 0;
					local206 = 0;
					local228 = 0;
					for (local276 = -5; local276 < 109; local276++) {
						local503 = local276 - 5;
						local507 = local276 + 5;
						if (local507 >= 0 && local507 < 104) {
							local194 += Static96.anIntArray435[local507];
							local206 += Static79.anIntArray284[local507];
							local210 += Static94.anIntArray310[local507];
							local200 += Static48.anIntArray381[local507];
							local228 += Static28.anIntArray357[local507];
						}
						if (local503 >= 0 && local503 < 104) {
							local194 -= Static96.anIntArray435[local503];
							local206 -= Static79.anIntArray284[local503];
							local228 -= Static28.anIntArray357[local503];
							local210 -= Static94.anIntArray310[local503];
							local200 -= Static48.anIntArray381[local503];
						}
						if (local276 >= 1 && local276 < 103 && (!Static52.aBoolean169 || (Static18.aByteArrayArrayArray2[0][local161][local276] & 0x2) != 0 || (Static18.aByteArrayArrayArray2[local7][local161][local276] & 0x10) == 0 && Static86.method1413(local161, local7, local276) == Static5.anInt125)) {
							if (Static17.anInt569 > local7) {
								Static17.anInt569 = local7;
							}
							local641 = Static75.aByteArrayArrayArray3[local7][local161][local276] & 0xFF;
							local651 = Static106.aByteArrayArrayArray6[local7][local161][local276] & 0xFF;
							if (local641 > 0 || local651 > 0) {
								local666 = Static102.anIntArrayArrayArray5[local7][local161][local276];
								@Pc(676) int local676 = Static102.anIntArrayArrayArray5[local7][local161 + 1][local276];
								@Pc(688) int local688 = Static102.anIntArrayArrayArray5[local7][local161 + 1][local276 + 1];
								@Pc(698) int local698 = Static102.anIntArrayArrayArray5[local7][local161][local276 + 1];
								@Pc(704) int local704 = Static38.anIntArrayArray7[local161][local276];
								@Pc(714) int local714 = Static38.anIntArrayArray7[local161 + 1][local276 + 1];
								@Pc(722) int local722 = Static38.anIntArrayArray7[local161 + 1][local276];
								@Pc(724) int local724 = -1;
								@Pc(726) int local726 = -1;
								@Pc(734) int local734 = Static38.anIntArrayArray7[local161][local276 + 1];
								@Pc(745) int local745;
								@Pc(749) int local749;
								if (local641 > 0) {
									local745 = local194 * 256 / local206;
									local749 = local200 / local228;
									@Pc(753) int local753 = local210 / local228;
									local726 = Static50.method913(local749, local753, local745);
									@Pc(765) int local765 = Static48.anInt2593 + local745 & 0xFF;
									local753 += Static50.anInt1193;
									if (local753 < 0) {
										local753 = 0;
									} else if (local753 > 255) {
										local753 = 255;
									}
									local724 = Static50.method913(local749, local753, local765);
								}
								if (local7 > 0) {
									@Pc(793) boolean local793 = true;
									if (local641 == 0 && Static101.aByteArrayArrayArray5[local7][local161][local276] != 0) {
										local793 = false;
									}
									if (local651 > 0 && !Static40.method689(local651 - 1).aBoolean65) {
										local793 = false;
									}
									if (local793 && local666 == local676 && local666 == local688 && local698 == local666) {
										Static5.anIntArrayArrayArray4[local7][local161][local276] |= 0x924;
									}
								}
								local745 = 0;
								if (local724 != -1) {
									local745 = Static112.anIntArray425[Static84.method1392(local724, 96)];
								}
								if (local651 == 0) {
									arg0.method1789(local7, local161, local276, 0, 0, -1, local666, local676, local688, local698, Static84.method1392(local726, local704), Static84.method1392(local726, local722), Static84.method1392(local726, local714), Static84.method1392(local726, local734), 0, 0, 0, 0, local745, 0);
								} else {
									local749 = Static101.aByteArrayArrayArray5[local7][local161][local276] + 1;
									@Pc(925) byte local925 = Static1.aByteArrayArrayArray1[local7][local161][local276];
									@Pc(931) Class1_Sub1_Sub7 local931 = Static40.method689(local651 - 1);
									@Pc(934) int local934 = local931.anInt1056;
									@Pc(946) int local946;
									@Pc(944) int local944;
									@Pc(968) int local968;
									@Pc(973) int local973;
									if (local934 >= 0) {
										local944 = Static112.anInterface2_1.method2090(local934);
										local946 = -1;
									} else if (local931.anInt1049 == 16711935) {
										local944 = -2;
										local934 = -1;
										local946 = -2;
									} else {
										local946 = Static50.method913(local931.anInt1044, local931.anInt1039, local931.anInt1043);
										local968 = local931.anInt1043 + Static48.anInt2593 & 0xFF;
										local973 = Static50.anInt1193 + local931.anInt1039;
										if (local973 < 0) {
											local973 = 0;
										} else if (local973 > 255) {
											local973 = 255;
										}
										local944 = Static50.method913(local931.anInt1044, local973, local968);
									}
									local968 = 0;
									if (local944 != -2) {
										local968 = Static112.anIntArray425[Static10.method259(96, local944)];
									}
									if (local931.anInt1057 != -1) {
										local973 = Static48.anInt2593 + local931.anInt1040 & 0xFF;
										@Pc(1030) int local1030 = Static50.anInt1193 + local931.anInt1052;
										if (local1030 < 0) {
											local1030 = 0;
										} else if (local1030 > 255) {
											local1030 = 255;
										}
										local944 = Static50.method913(local931.anInt1042, local1030, local973);
										local968 = Static112.anIntArray425[Static10.method259(96, local944)];
									}
									arg0.method1789(local7, local161, local276, local749, local925, local934, local666, local676, local688, local698, Static84.method1392(local726, local704), Static84.method1392(local726, local722), Static84.method1392(local726, local714), Static84.method1392(local726, local734), Static10.method259(local704, local946), Static10.method259(local722, local946), Static10.method259(local714, local946), Static10.method259(local734, local946), local745, local968);
								}
							}
						}
					}
				}
			}
			for (local181 = 1; local181 < 103; local181++) {
				for (local194 = 1; local194 < 103; local194++) {
					arg0.method1781(local7, local194, local181, Static86.method1413(local194, local7, local181));
				}
			}
			Static75.aByteArrayArrayArray3[local7] = null;
			Static106.aByteArrayArrayArray6[local7] = null;
			Static101.aByteArrayArrayArray5[local7] = null;
			Static1.aByteArrayArrayArray1[local7] = null;
			Static110.aByteArrayArrayArray7[local7] = null;
		}
		arg0.method1761();
		for (local11 = 0; local11 < 104; local11++) {
			for (local28 = 0; local28 < 104; local28++) {
				if ((Static18.aByteArrayArrayArray2[1][local11][local28] & 0x2) == 2) {
					arg0.method1749(local11, local28);
				}
			}
		}
		local28 = 1;
		local134 = 4;
		local132 = 2;
		for (local138 = 0; local138 < 4; local138++) {
			if (local138 > 0) {
				local132 <<= 0x3;
				local134 <<= 0x3;
				local28 <<= 0x3;
			}
			for (local161 = 0; local161 <= local138; local161++) {
				for (local181 = 0; local181 <= 104; local181++) {
					for (local194 = 0; local194 <= 104; local194++) {
						if ((local28 & Static5.anIntArrayArrayArray4[local161][local194][local181]) != 0) {
							for (local200 = local181; local200 > 0 && (Static5.anIntArrayArrayArray4[local161][local194][local200 - 1] & local28) != 0; local200--) {
							}
							for (local210 = local181; local210 < 104 && (Static5.anIntArrayArrayArray4[local161][local194][local210 + 1] & local28) != 0; local210++) {
							}
							local228 = local161;
							label347: for (local206 = local161; local206 > 0; local206--) {
								for (local276 = local200; local276 <= local210; local276++) {
									if ((Static5.anIntArrayArrayArray4[local206 - 1][local194][local276] & local28) == 0) {
										break label347;
									}
								}
							}
							label336: while (local228 < local138) {
								for (local276 = local200; local276 <= local210; local276++) {
									if ((local28 & Static5.anIntArrayArrayArray4[local228 + 1][local194][local276]) == 0) {
										break label336;
									}
								}
								local228++;
							}
							local276 = (local228 + 1 - local206) * (local210 + 1 - local200);
							if (local276 >= 8) {
								local503 = Static102.anIntArrayArrayArray5[local228][local194][local200] - 240;
								local641 = Static102.anIntArrayArrayArray5[local206][local194][local200];
								Static107.method1788(local138, 1, local194 * 128, local194 * 128, local200 * 128, local210 * 128 + 128, local503, local641);
								for (local651 = local206; local651 <= local228; local651++) {
									for (local666 = local200; local666 <= local210; local666++) {
										Static5.anIntArrayArrayArray4[local651][local194][local666] &= ~local28;
									}
								}
							}
						}
						if ((Static5.anIntArrayArrayArray4[local161][local194][local181] & local132) != 0) {
							for (local200 = local194; local200 > 0 && (Static5.anIntArrayArrayArray4[local161][local200 - 1][local181] & local132) != 0; local200--) {
							}
							local210 = local194;
							local206 = local161;
							while (local210 < 104 && (local132 & Static5.anIntArrayArrayArray4[local161][local210 + 1][local181]) != 0) {
								local210++;
							}
							local228 = local161;
							label402: while (local206 > 0) {
								for (local276 = local200; local276 <= local210; local276++) {
									if ((local132 & Static5.anIntArrayArrayArray4[local206 - 1][local276][local181]) == 0) {
										break label402;
									}
								}
								local206--;
							}
							label391: while (local228 < local138) {
								for (local276 = local200; local276 <= local210; local276++) {
									if ((local132 & Static5.anIntArrayArrayArray4[local228 + 1][local276][local181]) == 0) {
										break label391;
									}
								}
								local228++;
							}
							local276 = (local210 + 1 - local200) * (local228 + 1 - local206);
							if (local276 >= 8) {
								local641 = Static102.anIntArrayArrayArray5[local206][local200][local181];
								local503 = Static102.anIntArrayArrayArray5[local228][local200][local181] - 240;
								Static107.method1788(local138, 2, local200 * 128, local210 * 128 + 128, local181 * 128, local181 * 128, local503, local641);
								for (local651 = local206; local651 <= local228; local651++) {
									for (local666 = local200; local666 <= local210; local666++) {
										Static5.anIntArrayArrayArray4[local651][local666][local181] &= ~local132;
									}
								}
							}
						}
						if ((Static5.anIntArrayArrayArray4[local161][local194][local181] & local134) != 0) {
							local210 = local194;
							local200 = local194;
							local228 = local181;
							local206 = local181;
							while (local228 < 104 && (Static5.anIntArrayArrayArray4[local161][local194][local228 + 1] & local134) != 0) {
								local228++;
							}
							while (local206 > 0 && (local134 & Static5.anIntArrayArrayArray4[local161][local194][local206 - 1]) != 0) {
								local206--;
							}
							label457: while (local200 > 0) {
								for (local276 = local206; local276 <= local228; local276++) {
									if ((local134 & Static5.anIntArrayArrayArray4[local161][local200 - 1][local276]) == 0) {
										break label457;
									}
								}
								local200--;
							}
							label446: while (local210 < 104) {
								for (local276 = local206; local276 <= local228; local276++) {
									if ((Static5.anIntArrayArrayArray4[local161][local210 + 1][local276] & local134) == 0) {
										break label446;
									}
								}
								local210++;
							}
							if ((local210 + 1 - local200) * (-local206 + 1 + local228) >= 4) {
								local276 = Static102.anIntArrayArrayArray5[local161][local200][local206];
								Static107.method1788(local138, 4, local200 * 128, local210 * 128 + 128, local206 * 128, local228 * 128 + 128, local276, local276);
								for (local507 = local200; local507 <= local210; local507++) {
									for (local503 = local206; local503 <= local228; local503++) {
										Static5.anIntArrayArrayArray4[local161][local507][local503] &= ~local134;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public static void method1368() {
		try {
			@Pc(2) Graphics local2 = Static93.aCanvas1.getGraphics();
			Static99.aClass37_31.method1457(4, 4, local2);
		} catch (@Pc(16) Exception local16) {
			Static93.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)J")
	public static synchronized long method1369() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static121.aLong88) {
			Static46.aLong36 += Static121.aLong88 - local5;
		}
		Static121.aLong88 = local5;
		return Static46.aLong36 + local5;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	public static void method1370() {
		aClass64_1173 = null;
		aClass64_1169 = null;
		aClass64_1172 = null;
		aClass64_1168 = null;
		aClass64_1170 = null;
		aClass64_1171 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)I")
	public static int method1371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub14 local12 = (Class1_Sub14) Static110.aClass58_8.method1380((long) arg1);
		if (local12 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local12.anIntArray385.length) {
			return local12.anIntArray385[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!pb;I)V")
	public static void method1372(@OriginalArg(0) Class41 arg0) {
		Static84.aClass41_45 = arg0;
	}
}
