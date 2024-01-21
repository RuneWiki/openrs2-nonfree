import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!id", name = "gb", descriptor = "Lclient!be;")
	public static Class10 aClass10_5;

	@OriginalMember(owner = "client!id", name = "fb", descriptor = "Lclient!ic;")
	private static Class34 aClass34_721 = Static56.method816("Loaded fonts");

	@OriginalMember(owner = "client!id", name = "z", descriptor = "Lclient!ic;")
	public static Class34 aClass34_718 = aClass34_721;

	@OriginalMember(owner = "client!id", name = "K", descriptor = "I")
	public static int anInt1478 = 0;

	@OriginalMember(owner = "client!id", name = "U", descriptor = "Lclient!ic;")
	public static Class34 aClass34_719 = Static56.method816("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!id", name = "db", descriptor = "Lclient!ic;")
	public static Class34 aClass34_720 = Static56.method816("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!id", name = "Kb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_722 = Static56.method816("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
	public static void method884() {
		Static29.aClass48_18.method1101();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!q;[Lclient!kd;)V")
	public static void method885(@OriginalArg(1) Class64 arg0, @OriginalArg(2) Class42[] arg1) {
		@Pc(8) int local8;
		@Pc(11) int local11;
		@Pc(27) int local27;
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			for (local8 = 0; local8 < 104; local8++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static105.aByteArrayArrayArray5[local5][local8][local11] & 0x1) == 1) {
						local27 = local5;
						if ((Static105.aByteArrayArrayArray5[1][local8][local11] & 0x2) == 2) {
							local27 = local5 - 1;
						}
						if (local27 >= 0) {
							arg1[local27].method1032(local11, local8);
						}
					}
				}
			}
		}
		Static23.anInt722 += (int) (Math.random() * 5.0D) - 2;
		if (Static23.anInt722 < -8) {
			Static23.anInt722 = -8;
		}
		Static111.anInt3029 += (int) (Math.random() * 5.0D) - 2;
		if (Static23.anInt722 > 8) {
			Static23.anInt722 = 8;
		}
		if (Static111.anInt3029 < -16) {
			Static111.anInt3029 = -16;
		}
		if (Static111.anInt3029 > 16) {
			Static111.anInt3029 = 16;
		}
		@Pc(132) int local132;
		@Pc(134) int local134;
		@Pc(137) int local137;
		@Pc(159) int local159;
		@Pc(180) int local180;
		@Pc(194) int local194;
		@Pc(200) int local200;
		@Pc(204) int local204;
		@Pc(210) int local210;
		@Pc(227) int local227;
		@Pc(277) int local277;
		@Pc(503) int local503;
		@Pc(507) int local507;
		@Pc(651) int local651;
		@Pc(661) int local661;
		@Pc(673) int local673;
		for (local8 = 0; local8 < 4; local8++) {
			@Pc(122) byte[][] local122 = Static107.aByteArrayArrayArray6[local8];
			local27 = (int) Math.sqrt(5100.0D);
			local132 = local27 * 768 >> 8;
			for (local134 = 1; local134 < 103; local134++) {
				for (local137 = 1; local137 < 103; local137++) {
					local159 = Static24.anIntArrayArrayArray4[local8][local137 + 1][local134] - Static24.anIntArrayArrayArray4[local8][local137 - 1][local134];
					local180 = Static24.anIntArrayArrayArray4[local8][local137][local134 + 1] - Static24.anIntArrayArrayArray4[local8][local137][local134 - 1];
					local194 = (int) Math.sqrt((double) (local159 * local159 + local180 * local180 + 65536));
					local200 = (local159 << 8) / local194;
					local204 = 65536 / local194;
					local210 = (local180 << 8) / local194;
					local227 = (local200 * -50 + local204 * -10 + local210 * -50) / local132 + 96;
					local277 = (local122[local137][local134] >> 1) + (local122[local137][local134 - 1] >> 2) + (local122[local137 - 1][local134] >> 2) + (local122[local137 + 1][local134] >> 3) + (local122[local137][local134 - -1] >> 3);
					Static130.anIntArrayArray28[local137][local134] = local227 - local277;
				}
			}
			for (local137 = 0; local137 < 104; local137++) {
				Static101.anIntArray326[local137] = 0;
				Static18.anIntArray64[local137] = 0;
				Static1.anIntArray1[local137] = 0;
				Static130.anIntArray404[local137] = 0;
				Static77.anIntArray233[local137] = 0;
			}
			for (local159 = -5; local159 < 109; local159++) {
				for (local180 = 0; local180 < 104; local180++) {
					local194 = local159 + 5;
					@Pc(398) int local398;
					if (local194 >= 0 && local194 < 104) {
						local200 = Static6.aByteArrayArrayArray1[local8][local194][local180] & 0xFF;
						if (local200 > 0) {
							@Pc(362) Class8_Sub1_Sub12 local362 = Static29.method513(local200 - 1);
							Static101.anIntArray326[local180] += local362.anInt1559;
							Static18.anIntArray64[local180] += local362.anInt1563;
							Static1.anIntArray1[local180] += local362.anInt1555;
							Static130.anIntArray404[local180] += local362.anInt1560;
							local398 = Static77.anIntArray233[local180]++;
						}
					}
					local200 = local159 - 5;
					if (local200 >= 0 && local200 < 104) {
						local204 = Static6.aByteArrayArrayArray1[local8][local200][local180] & 0xFF;
						if (local204 > 0) {
							@Pc(433) Class8_Sub1_Sub12 local433 = Static29.method513(local204 - 1);
							Static101.anIntArray326[local180] -= local433.anInt1559;
							Static18.anIntArray64[local180] -= local433.anInt1563;
							Static1.anIntArray1[local180] -= local433.anInt1555;
							Static130.anIntArray404[local180] -= local433.anInt1560;
							local398 = Static77.anIntArray233[local180]--;
						}
					}
				}
				if (local159 >= 1 && local159 < 103) {
					local194 = 0;
					local210 = 0;
					local227 = 0;
					local204 = 0;
					local200 = 0;
					for (local277 = -5; local277 < 109; local277++) {
						local503 = local277 + 5;
						local507 = local277 - 5;
						if (local503 >= 0 && local503 < 104) {
							local200 += Static18.anIntArray64[local503];
							local204 += Static1.anIntArray1[local503];
							local227 += Static77.anIntArray233[local503];
							local194 += Static101.anIntArray326[local503];
							local210 += Static130.anIntArray404[local503];
						}
						if (local507 >= 0 && local507 < 104) {
							local227 -= Static77.anIntArray233[local507];
							local200 -= Static18.anIntArray64[local507];
							local194 -= Static101.anIntArray326[local507];
							local204 -= Static1.anIntArray1[local507];
							local210 -= Static130.anIntArray404[local507];
						}
						if (local277 >= 1 && local277 < 103 && (!Static108.aBoolean98 || (Static105.aByteArrayArrayArray5[0][local159][local277] & 0x2) != 0 || (Static105.aByteArrayArrayArray5[local8][local159][local277] & 0x10) == 0 && Static105.method1479(local277, local159, local8) == Static88.anInt2344)) {
							if (local8 < Static41.anInt996) {
								Static41.anInt996 = local8;
							}
							local651 = Static6.aByteArrayArrayArray1[local8][local159][local277] & 0xFF;
							local661 = Static60.aByteArrayArrayArray4[local8][local159][local277] & 0xFF;
							if (local651 > 0 || local661 > 0) {
								local673 = Static24.anIntArrayArrayArray4[local8][local159][local277];
								@Pc(683) int local683 = Static24.anIntArrayArrayArray4[local8][local159 + 1][local277];
								@Pc(695) int local695 = Static24.anIntArrayArrayArray4[local8][local159 + 1][local277 + 1];
								@Pc(701) int local701 = Static130.anIntArrayArray28[local159][local277];
								@Pc(711) int local711 = Static24.anIntArrayArrayArray4[local8][local159][local277 + 1];
								@Pc(719) int local719 = Static130.anIntArrayArray28[local159 + 1][local277];
								@Pc(729) int local729 = Static130.anIntArrayArray28[local159 + 1][local277 + 1];
								@Pc(737) int local737 = Static130.anIntArrayArray28[local159][local277 + 1];
								@Pc(739) int local739 = -1;
								@Pc(741) int local741 = -1;
								@Pc(749) int local749;
								@Pc(757) int local757;
								if (local651 > 0) {
									local749 = local194 * 256 / local210;
									@Pc(753) int local753 = local204 / local227;
									local757 = local200 / local227;
									local741 = Static58.method902(local757, local753, local749);
									@Pc(769) int local769 = Static23.anInt722 + local749 & 0xFF;
									local753 += Static111.anInt3029;
									if (local753 < 0) {
										local753 = 0;
									} else if (local753 > 255) {
										local753 = 255;
									}
									local739 = Static58.method902(local757, local753, local769);
								}
								if (local8 > 0) {
									@Pc(795) boolean local795 = true;
									if (local651 == 0 && Static53.aByteArrayArrayArray3[local8][local159][local277] != 0) {
										local795 = false;
									}
									if (local661 > 0 && !Static24.method1147(local661 - 1).aBoolean48) {
										local795 = false;
									}
									if (local795 && local683 == local673 && local673 == local695 && local673 == local711) {
										Static97.anIntArrayArrayArray5[local8][local159][local277] |= 0x924;
									}
								}
								local749 = 0;
								if (local739 != -1) {
									local749 = Static11.anIntArray37[Static128.method1986(96, local739)];
								}
								if (local661 == 0) {
									arg0.method1406(local8, local159, local277, 0, 0, -1, local673, local683, local695, local711, Static128.method1986(local701, local741), Static128.method1986(local719, local741), Static128.method1986(local729, local741), Static128.method1986(local737, local741), 0, 0, 0, 0, local749, 0);
								} else {
									local757 = Static53.aByteArrayArrayArray3[local8][local159][local277] + 1;
									@Pc(881) byte local881 = Static113.aByteArrayArrayArray7[local8][local159][local277];
									@Pc(887) Class8_Sub1_Sub10 local887 = Static24.method1147(local661 - 1);
									@Pc(890) int local890 = local887.anInt1068;
									if (local890 >= 0 && !Static11.anInterface3_1.method619(local890)) {
										local890 = -1;
									}
									@Pc(919) int local919;
									@Pc(948) int local948;
									@Pc(931) int local931;
									@Pc(924) int local924;
									if (local890 >= 0) {
										local948 = Static11.anInterface3_1.method616(local890);
										local919 = -1;
									} else if (local887.anInt1070 == 16711935) {
										local919 = -2;
										local890 = -1;
										local948 = -2;
									} else {
										local919 = Static58.method902(local887.anInt1077, local887.anInt1074, local887.anInt1063);
										local924 = Static111.anInt3029 + local887.anInt1074;
										local931 = Static23.anInt722 + local887.anInt1063 & 0xFF;
										if (local924 < 0) {
											local924 = 0;
										} else if (local924 > 255) {
											local924 = 255;
										}
										local948 = Static58.method902(local887.anInt1077, local924, local931);
									}
									local931 = 0;
									if (local948 != -2) {
										local931 = Static11.anIntArray37[Static21.method384(local948, 96)];
									}
									if (local887.anInt1067 != -1) {
										@Pc(985) int local985 = local887.anInt1075 + Static111.anInt3029;
										if (local985 < 0) {
											local985 = 0;
										} else if (local985 > 255) {
											local985 = 255;
										}
										local924 = Static23.anInt722 + local887.anInt1057 & 0xFF;
										local948 = Static58.method902(local887.anInt1062, local985, local924);
										local931 = Static11.anIntArray37[Static21.method384(local948, 96)];
									}
									arg0.method1406(local8, local159, local277, local757, local881, local890, local673, local683, local695, local711, Static128.method1986(local701, local741), Static128.method1986(local719, local741), Static128.method1986(local729, local741), Static128.method1986(local737, local741), Static21.method384(local919, local701), Static21.method384(local919, local719), Static21.method384(local919, local729), Static21.method384(local919, local737), local749, local931);
								}
							}
						}
					}
				}
			}
			for (local180 = 1; local180 < 103; local180++) {
				for (local194 = 1; local194 < 103; local194++) {
					arg0.method1429(local8, local194, local180, Static105.method1479(local180, local194, local8));
				}
			}
			Static6.aByteArrayArrayArray1[local8] = null;
			Static60.aByteArrayArrayArray4[local8] = null;
			Static53.aByteArrayArrayArray3[local8] = null;
			Static113.aByteArrayArrayArray7[local8] = null;
			Static107.aByteArrayArrayArray6[local8] = null;
		}
		arg0.method1405();
		for (local11 = 0; local11 < 104; local11++) {
			for (local27 = 0; local27 < 104; local27++) {
				if ((Static105.aByteArrayArrayArray5[1][local11][local27] & 0x2) == 2) {
					arg0.method1400(local11, local27);
				}
			}
		}
		local27 = 1;
		local134 = 4;
		local132 = 2;
		for (local137 = 0; local137 < 4; local137++) {
			if (local137 > 0) {
				local132 <<= 0x3;
				local27 <<= 0x3;
				local134 <<= 0x3;
			}
			for (local159 = 0; local159 <= local137; local159++) {
				for (local180 = 0; local180 <= 104; local180++) {
					for (local194 = 0; local194 <= 104; local194++) {
						if ((Static97.anIntArrayArrayArray5[local159][local194][local180] & local27) != 0) {
							local200 = local180;
							local204 = local180;
							local227 = local159;
							local210 = local159;
							while (local204 < 104 && (local27 & Static97.anIntArrayArrayArray5[local159][local194][local204 + 1]) != 0) {
								local204++;
							}
							while (local200 > 0 && (local27 & Static97.anIntArrayArrayArray5[local159][local194][local200 - 1]) != 0) {
								local200--;
							}
							label353: while (local210 > 0) {
								for (local277 = local200; local277 <= local204; local277++) {
									if ((Static97.anIntArrayArrayArray5[local210 - 1][local194][local277] & local27) == 0) {
										break label353;
									}
								}
								local210--;
							}
							label342: while (local227 < local137) {
								for (local277 = local200; local277 <= local204; local277++) {
									if ((local27 & Static97.anIntArrayArrayArray5[local227 + 1][local194][local277]) == 0) {
										break label342;
									}
								}
								local227++;
							}
							local277 = (local227 + 1 - local210) * (local204 + 1 - local200);
							if (local277 >= 8) {
								local651 = Static24.anIntArrayArrayArray4[local210][local194][local200];
								local507 = Static24.anIntArrayArrayArray4[local227][local194][local200] - 240;
								Static98.method1426(local137, 1, local194 * 128, local194 * 128, local200 * 128, local204 * 128 + 128, local507, local651);
								for (local661 = local210; local661 <= local227; local661++) {
									for (local673 = local200; local673 <= local204; local673++) {
										Static97.anIntArrayArrayArray5[local661][local194][local673] &= ~local27;
									}
								}
							}
						}
						if ((local132 & Static97.anIntArrayArrayArray5[local159][local194][local180]) != 0) {
							for (local200 = local194; local200 > 0 && (Static97.anIntArrayArrayArray5[local159][local200 - 1][local180] & local132) != 0; local200--) {
							}
							local210 = local159;
							for (local204 = local194; local204 < 104 && (local132 & Static97.anIntArrayArrayArray5[local159][local204 + 1][local180]) != 0; local204++) {
							}
							label407: while (local210 > 0) {
								for (local277 = local200; local277 <= local204; local277++) {
									if ((local132 & Static97.anIntArrayArrayArray5[local210 - 1][local277][local180]) == 0) {
										break label407;
									}
								}
								local210--;
							}
							label395: for (local227 = local159; local227 < local137; local227++) {
								for (local277 = local200; local277 <= local204; local277++) {
									if ((local132 & Static97.anIntArrayArrayArray5[local227 + 1][local277][local180]) == 0) {
										break label395;
									}
								}
							}
							local277 = (local227 + 1 - local210) * (local204 + 1 - local200);
							if (local277 >= 8) {
								local651 = Static24.anIntArrayArrayArray4[local210][local200][local180];
								local507 = Static24.anIntArrayArrayArray4[local227][local200][local180] - 240;
								Static98.method1426(local137, 2, local200 * 128, local204 * 128 + 128, local180 * 128, local180 * 128, local507, local651);
								for (local661 = local210; local661 <= local227; local661++) {
									for (local673 = local200; local673 <= local204; local673++) {
										Static97.anIntArrayArrayArray5[local661][local673][local180] &= ~local132;
									}
								}
							}
						}
						if ((Static97.anIntArrayArrayArray5[local159][local194][local180] & local134) != 0) {
							local200 = local194;
							local204 = local194;
							for (local210 = local180; local210 > 0 && (local134 & Static97.anIntArrayArrayArray5[local159][local194][local210 - 1]) != 0; local210--) {
							}
							for (local227 = local180; local227 < 104 && (local134 & Static97.anIntArrayArrayArray5[local159][local194][local227 + 1]) != 0; local227++) {
							}
							label461: while (local200 > 0) {
								for (local277 = local210; local277 <= local227; local277++) {
									if ((local134 & Static97.anIntArrayArrayArray5[local159][local200 - 1][local277]) == 0) {
										break label461;
									}
								}
								local200--;
							}
							label450: while (local204 < 104) {
								for (local277 = local210; local277 <= local227; local277++) {
									if ((local134 & Static97.anIntArrayArrayArray5[local159][local204 + 1][local277]) == 0) {
										break label450;
									}
								}
								local204++;
							}
							if ((local227 + 1 - local210) * (-local200 + 1 + local204) >= 4) {
								local277 = Static24.anIntArrayArrayArray4[local159][local200][local210];
								Static98.method1426(local137, 4, local200 * 128, local204 * 128 + 128, local210 * 128, local227 * 128 + 128, local277, local277);
								for (local503 = local200; local503 <= local204; local503++) {
									for (local507 = local210; local507 <= local227; local507++) {
										Static97.anIntArrayArrayArray5[local159][local503][local507] &= ~local134;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
	public static void method893() {
		Static130.aClass48_58.method1101();
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
	public static void method895() {
		aClass34_722 = null;
		aClass34_720 = null;
		aClass10_5 = null;
		aClass34_718 = null;
		aClass34_721 = null;
		aClass34_719 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILclient!wf;)V")
	public static void method896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8_Sub24 arg2) {
		if (arg2.anInt3140 == 1) {
			Static72.method1076(0, Static36.aClass34_504, 0, arg2.aClass34_1434, 40, arg2.anInt3124);
		}
		if (arg2.anInt3140 == 2 && !Static32.aBoolean41) {
			@Pc(35) Class34 local35 = Static38.method590(arg2);
			if (local35 != null) {
				Static72.method1076(0, Static44.method669(new Class34[] { Static96.aClass34_279, arg2.aClass34_1433 }), -1, local35, 15, arg2.anInt3124);
			}
		}
		if (arg2.anInt3140 == 3) {
			Static72.method1076(0, Static36.aClass34_504, 0, Static107.aClass34_1148, 10, arg2.anInt3124);
		}
		if (arg2.anInt3140 == 4) {
			Static72.method1076(0, Static36.aClass34_504, 0, arg2.aClass34_1434, 12, arg2.anInt3124);
		}
		if (arg2.anInt3140 == 5) {
			Static72.method1076(0, Static36.aClass34_504, 0, arg2.aClass34_1434, 33, arg2.anInt3124);
		}
		if (arg2.anInt3140 == 6 && Static126.aClass8_Sub24_8 == null) {
			Static72.method1076(0, Static36.aClass34_504, -1, arg2.aClass34_1434, 5, arg2.anInt3124);
		}
		@Pc(158) int local158;
		@Pc(152) int local152;
		if (arg2.anInt3145 == 2) {
			local152 = 0;
			for (@Pc(154) int local154 = 0; local154 < arg2.anInt3111; local154++) {
				for (local158 = 0; local158 < arg2.anInt3154; local158++) {
					@Pc(167) int local167 = local158 * (arg2.anInt3127 + 32);
					@Pc(175) int local175 = local154 * (arg2.anInt3161 + 32);
					if (local152 < 20) {
						local175 += arg2.anIntArray418[local152];
						local167 += arg2.anIntArray409[local152];
					}
					if (local167 <= arg1 && local175 <= arg0 && arg1 < local167 + 32 && arg0 < local175 + 32) {
						Static51.aClass8_Sub24_5 = arg2;
						Static38.anInt928 = local152;
						if (arg2.anIntArray414[local152] > 0) {
							@Pc(236) Class8_Sub1_Sub13 local236 = Static7.method49(arg2.anIntArray414[local152] - 1);
							if (Static88.anInt2340 == 1 && Static70.method1053(Static99.method1445(arg2))) {
								if (Static120.anInt2878 != arg2.anInt3124 || Static23.anInt712 != local152) {
									Static72.method1076(local236.anInt1741, Static44.method669(new Class34[] { Static88.aClass34_1100, Static18.aClass34_267, local236.aClass34_812 }), local152, Static22.aClass34_1204, 28, arg2.anInt3124);
								}
							} else if (!Static32.aBoolean41 || !Static70.method1053(Static99.method1445(arg2))) {
								@Pc(260) Class34[] local260 = local236.aClass34Array12;
								if (Static59.aBoolean61) {
									local260 = Static113.method1620(local260);
								}
								@Pc(274) int local274;
								@Pc(322) byte local322;
								if (Static70.method1053(Static99.method1445(arg2))) {
									for (local274 = 4; local274 >= 3; local274--) {
										if (local260 != null && local260[local274] != null) {
											if (local274 == 3) {
												local322 = 8;
											} else {
												local322 = 16;
											}
											Static72.method1076(local236.anInt1741, Static44.method669(new Class34[] { Static111.aClass34_1398, local236.aClass34_812 }), local152, local260[local274], local322, arg2.anInt3124);
										} else if (local274 == 4) {
											Static72.method1076(local236.anInt1741, Static44.method669(new Class34[] { Static111.aClass34_1398, local236.aClass34_812 }), local152, Static132.aClass34_1320, 16, arg2.anInt3124);
										}
									}
								}
								if (Static82.method1194(Static99.method1445(arg2))) {
									Static72.method1076(local236.anInt1741, Static44.method669(new Class34[] { Static111.aClass34_1398, local236.aClass34_812 }), local152, Static22.aClass34_1204, 51, arg2.anInt3124);
								}
								if (Static70.method1053(Static99.method1445(arg2)) && local260 != null) {
									for (local274 = 2; local274 >= 0; local274--) {
										if (local260[local274] != null) {
											local322 = 0;
											if (local274 == 0) {
												local322 = 34;
											}
											if (local274 == 1) {
												local322 = 30;
											}
											if (local274 == 2) {
												local322 = 24;
											}
											Static72.method1076(local236.anInt1741, Static44.method669(new Class34[] { Static111.aClass34_1398, local236.aClass34_812 }), local152, local260[local274], local322, arg2.anInt3124);
										}
									}
								}
								local260 = arg2.aClass34Array24;
								if (Static59.aBoolean61) {
									local260 = Static113.method1620(local260);
								}
								if (local260 != null) {
									for (local274 = 4; local274 >= 0; local274--) {
										if (local260[local274] != null) {
											local322 = 0;
											if (local274 == 0) {
												local322 = 32;
											}
											if (local274 == 1) {
												local322 = 1;
											}
											if (local274 == 2) {
												local322 = 42;
											}
											if (local274 == 3) {
												local322 = 48;
											}
											if (local274 == 4) {
												local322 = 3;
											}
											Static72.method1076(local236.anInt1741, Static44.method669(new Class34[] { Static111.aClass34_1398, local236.aClass34_812 }), local152, local260[local274], local322, arg2.anInt3124);
										}
									}
								}
								Static72.method1076(local236.anInt1741, Static44.method669(new Class34[] { Static111.aClass34_1398, local236.aClass34_812 }), local152, Static19.aClass34_295, 1007, arg2.anInt3124);
							} else if ((Static120.anInt2889 & 0x10) == 16) {
								Static72.method1076(local236.anInt1741, Static44.method669(new Class34[] { Static120.aClass34_1321, Static18.aClass34_267, local236.aClass34_812 }), local152, Static49.aClass34_652, 37, arg2.anInt3124);
							}
						}
					}
					local152++;
				}
			}
		}
		if (!arg2.aBoolean117) {
			return;
		}
		if (Static32.aBoolean41) {
			if (Static84.method1253(Static99.method1445(arg2)) && (Static120.anInt2889 & 0x20) == 32) {
				Static72.method1076(0, Static44.method669(new Class34[] { Static120.aClass34_1321, Static127.aClass34_1378, arg2.aClass34_1435 }), arg2.anInt3122, Static49.aClass34_652, 35, arg2.anInt3124);
				return;
			}
			return;
		}
		@Pc(709) Class34 local709;
		for (local152 = 9; local152 >= 5; local152--) {
			local709 = Static28.method501(local152, arg2);
			if (local709 != null) {
				Static72.method1076(local152 + 1, arg2.aClass34_1435, arg2.anInt3122, local709, 1004, arg2.anInt3124);
			}
		}
		local709 = Static38.method590(arg2);
		if (local709 != null) {
			Static72.method1076(0, arg2.aClass34_1435, arg2.anInt3122, local709, 15, arg2.anInt3124);
		}
		for (local158 = 4; local158 >= 0; local158--) {
			@Pc(764) Class34 local764 = Static28.method501(local158, arg2);
			if (local764 != null) {
				Static72.method1076(local158 + 1, arg2.aClass34_1435, arg2.anInt3122, local764, 41, arg2.anInt3124);
			}
		}
		if (Static31.method534(Static99.method1445(arg2))) {
			Static72.method1076(0, Static36.aClass34_504, arg2.anInt3122, Static94.aClass34_1031, 5, arg2.anInt3124);
			return;
		}
	}
}
