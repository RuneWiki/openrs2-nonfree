import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "gb", descriptor = "I")
	public static int anInt172 = 127;

	@OriginalMember(owner = "client!af", name = "hb", descriptor = "I")
	public static int anInt173 = 0;

	@OriginalMember(owner = "client!af", name = "jb", descriptor = "I")
	public static int anInt175 = 0;

	@OriginalMember(owner = "client!af", name = "ob", descriptor = "I")
	public static volatile int anInt180 = 0;

	@OriginalMember(owner = "client!af", name = "pb", descriptor = "Lclient!wd;")
	public static Class97 aClass97_1 = null;

	@OriginalMember(owner = "client!af", name = "rb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_85 = Static118.method2249(" x ");

	@OriginalMember(owner = "client!af", name = "sb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_86 = Static118.method2249("<)4col> x");

	@OriginalMember(owner = "client!af", name = "ub", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_87 = Static118.method2249("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!sd;ZLclient!sd;)V")
	public static void method127(@OriginalArg(1) Class60 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class60 arg2) {
		Static47.aClass60_9 = arg2;
		Static84.aClass60_20 = arg0;
		Static37.aBoolean41 = arg1;
		Static197.aClass67_10 = new Class67(30);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([Lclient!n;B)V")
	public static void method128(@OriginalArg(0) Class57[] arg0) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local14 = 0; local14 < 104; local14++) {
					if ((Static106.aByteArrayArrayArray67[local5][local11][local14] & 0x1) == 1) {
						@Pc(30) int local30 = local5;
						if ((Static106.aByteArrayArrayArray67[1][local11][local14] & 0x2) == 2) {
							local30 = local5 - 1;
						}
						if (local30 >= 0) {
							arg0[local30].method2257(local14, local11);
						}
					}
				}
			}
		}
		Static156.anInt3580 += (int) (Math.random() * 5.0D) - 2;
		if (Static156.anInt3580 < -16) {
			Static156.anInt3580 = -16;
		}
		if (Static156.anInt3580 > 16) {
			Static156.anInt3580 = 16;
		}
		Static196.anInt4242 += (int) (Math.random() * 5.0D) - 2;
		if (Static196.anInt4242 < -8) {
			Static196.anInt4242 = -8;
		}
		if (Static196.anInt4242 > 8) {
			Static196.anInt4242 = 8;
		}
		local14 = Static156.anInt3580 >> 1;
		local11 = Static196.anInt4242 >> 2 << 10;
		@Pc(128) int[][] local128 = new int[104][104];
		@Pc(132) int[][] local132 = new int[104][104];
		@Pc(147) int local147;
		@Pc(153) int local153;
		@Pc(155) int local155;
		@Pc(158) int local158;
		@Pc(248) int local248;
		@Pc(182) int local182;
		@Pc(203) int local203;
		@Pc(216) int local216;
		@Pc(222) int local222;
		@Pc(226) int local226;
		@Pc(232) int local232;
		@Pc(298) int local298;
		@Pc(511) int local511;
		@Pc(548) int local548;
		@Pc(802) int local802;
		for (@Pc(134) int local134 = 0; local134 < 4; local134++) {
			@Pc(139) byte[][] local139 = Static70.aByteArrayArrayArray38[local134];
			local147 = (int) Math.sqrt(5100.0D);
			local153 = local147 * 768 >> 8;
			for (local155 = 1; local155 < 103; local155++) {
				for (local158 = 1; local158 < 103; local158++) {
					local182 = Static89.anIntArrayArrayArray3[local134][local158 + 1][local155] - Static89.anIntArrayArrayArray3[local134][local158 - 1][local155];
					local203 = Static89.anIntArrayArrayArray3[local134][local158][local155 + 1] - Static89.anIntArrayArrayArray3[local134][local158][local155 - 1];
					local216 = (int) Math.sqrt((double) (local182 * local182 + local203 * local203 + 65536));
					local222 = (local182 << 8) / local216;
					local226 = -65536 / local216;
					local232 = (local203 << 8) / local216;
					local248 = (local232 * -50 + local226 * -10 + local222 * -50) / local153 + 74;
					local298 = (local139[local158][local155 - 1] >> 2) + (local139[local158 - 1][local155] >> 2) + (local139[local158 - -1][local155] >> 3) + (local139[local158][local155 + 1] >> 3) + (local139[local158][local155] >> 1);
					local132[local158][local155] = local248 - local298;
				}
			}
			for (local158 = 0; local158 < 104; local158++) {
				Static122.anIntArray398[local158] = 0;
				Static88.anIntArray243[local158] = 0;
				Static196.anIntArray486[local158] = 0;
				Static93.anIntArray267[local158] = 0;
				Static154.anIntArray423[local158] = 0;
			}
			for (local248 = -5; local248 < 104; local248++) {
				for (local182 = 0; local182 < 104; local182++) {
					local203 = local248 + 5;
					@Pc(417) int local417;
					if (local203 < 104) {
						local216 = Static71.aByteArrayArrayArray40[local134][local203][local182] & 0xFF;
						if (local216 > 0) {
							@Pc(381) Class1_Sub2_Sub6 local381 = Static53.method944(local216 - 1);
							Static122.anIntArray398[local182] += local381.anInt889;
							Static88.anIntArray243[local182] += local381.anInt885;
							Static196.anIntArray486[local182] += local381.anInt888;
							Static93.anIntArray267[local182] += local381.anInt886;
							local417 = Static154.anIntArray423[local182]++;
						}
					}
					local216 = local248 - 5;
					if (local216 >= 0) {
						local222 = Static71.aByteArrayArrayArray40[local134][local216][local182] & 0xFF;
						if (local222 > 0) {
							@Pc(447) Class1_Sub2_Sub6 local447 = Static53.method944(local222 - 1);
							Static122.anIntArray398[local182] -= local447.anInt889;
							Static88.anIntArray243[local182] -= local447.anInt885;
							Static196.anIntArray486[local182] -= local447.anInt888;
							Static93.anIntArray267[local182] -= local447.anInt886;
							local417 = Static154.anIntArray423[local182]--;
						}
					}
				}
				if (local248 >= 0) {
					local216 = 0;
					local203 = 0;
					local226 = 0;
					local232 = 0;
					local222 = 0;
					for (local298 = -5; local298 < 104; local298++) {
						local511 = local298 + 5;
						if (local511 < 104) {
							local203 += Static122.anIntArray398[local511];
							local226 += Static93.anIntArray267[local511];
							local222 += Static196.anIntArray486[local511];
							local232 += Static154.anIntArray423[local511];
							local216 += Static88.anIntArray243[local511];
						}
						local548 = local298 - 5;
						if (local548 >= 0) {
							local232 -= Static154.anIntArray423[local548];
							local203 -= Static122.anIntArray398[local548];
							local226 -= Static93.anIntArray267[local548];
							local216 -= Static88.anIntArray243[local548];
							local222 -= Static196.anIntArray486[local548];
						}
						if (local298 >= 0 && local232 > 0) {
							local128[local248][local298] = Static97.method1847(local216 / local232, local203 * 256 / local226, local222 / local232);
						}
					}
				}
			}
			for (local182 = 1; local182 < 103; local182++) {
				for (local203 = 1; local203 < 103; local203++) {
					if (!Static13.aBoolean36 || (Static106.aByteArrayArrayArray67[0][local182][local203] & 0x2) != 0 || (Static106.aByteArrayArrayArray67[local134][local182][local203] & 0x10) == 0 && Static202.method1712(local134, local203, local182) == Static37.anInt1034) {
						if (local134 < Static49.anInt1297) {
							Static49.anInt1297 = local134;
						}
						local216 = Static71.aByteArrayArrayArray40[local134][local182][local203] & 0xFF;
						local222 = Static173.aByteArrayArrayArray104[local134][local182][local203] & 0xFF;
						if (local216 > 0 || local222 > 0) {
							local226 = Static89.anIntArrayArrayArray3[local134][local182][local203];
							local232 = Static89.anIntArrayArrayArray3[local134][local182 + 1][local203];
							local298 = Static89.anIntArrayArrayArray3[local134][local182 + 1][local203 + 1];
							local511 = Static89.anIntArrayArrayArray3[local134][local182][local203 + 1];
							if (local134 > 0) {
								@Pc(734) boolean local734 = true;
								if (local216 == 0 && Static162.aByteArrayArrayArray98[local134][local182][local203] != 0) {
									local734 = false;
								}
								if (local222 > 0 && !Static45.method757(local222 - 1).aBoolean74) {
									local734 = false;
								}
								if (local734 && local226 == local232 && local226 == local298 && local226 == local511) {
									Static204.anIntArrayArrayArray9[local134][local182][local203] |= 0x924;
								}
							}
							@Pc(817) int local817;
							@Pc(839) int local839;
							if (local216 <= 0) {
								local802 = 0;
								local548 = -1;
							} else {
								local548 = local128[local182][local203];
								local817 = (local548 & 0x7F) + local14;
								if (local817 < 0) {
									local817 = 0;
								} else if (local817 > 127) {
									local817 = 127;
								}
								local839 = local817 + (local548 & 0x380) + (local11 + local548 & 0xFC00);
								local802 = Static56.anIntArray141[Static153.method2678(96, local839)];
							}
							local817 = local132[local182][local203];
							@Pc(860) int local860 = local132[local182][local203 + 1];
							local839 = local132[local182 + 1][local203];
							@Pc(878) int local878 = local132[local182 + 1][local203 + 1];
							if (local222 == 0) {
								Static101.method1911(local134, local182, local203, 0, 0, -1, local226, local232, local298, local511, Static153.method2678(local817, local548), Static153.method2678(local839, local548), Static153.method2678(local878, local548), Static153.method2678(local860, local548), 0, 0, 0, 0, local802, 0);
							} else {
								@Pc(890) int local890 = Static162.aByteArrayArrayArray98[local134][local182][local203] + 1;
								@Pc(898) byte local898 = Static82.aByteArrayArrayArray51[local134][local182][local203];
								@Pc(904) Class1_Sub2_Sub12 local904 = Static45.method757(local222 - 1);
								@Pc(907) int local907 = local904.anInt1713;
								if (local907 >= 0 && !Static56.anInterface2_1.method1090(local907)) {
									local907 = -1;
								}
								@Pc(929) int local929;
								@Pc(927) int local927;
								@Pc(939) int local939;
								@Pc(966) int local966;
								if (local907 >= 0) {
									local927 = Static56.anIntArray141[Static139.method2606(Static56.anInterface2_1.method1092(local907), 96)];
									local929 = -1;
								} else if (local904.anInt1714 == -1) {
									local927 = 0;
									local929 = -2;
								} else {
									local929 = local904.anInt1714;
									local939 = (local929 & 0x7F) + local14;
									if (local939 < 0) {
										local939 = 0;
									} else if (local939 > 127) {
										local939 = 127;
									}
									local966 = local939 + (local929 & 0x380) + (local929 + local11 & 0xFC00);
									local927 = Static56.anIntArray141[Static139.method2606(local966, 96)];
								}
								if (local904.anInt1708 >= 0) {
									local939 = local904.anInt1708;
									local966 = (local939 & 0x7F) + local14;
									if (local966 < 0) {
										local966 = 0;
									} else if (local966 > 127) {
										local966 = 127;
									}
									@Pc(1025) int local1025 = (local939 + local11 & 0xFC00) + (local939 & 0x380) + local966;
									local927 = Static56.anIntArray141[Static139.method2606(local1025, 96)];
								}
								Static101.method1911(local134, local182, local203, local890, local898, local907, local226, local232, local298, local511, Static153.method2678(local817, local548), Static153.method2678(local839, local548), Static153.method2678(local878, local548), Static153.method2678(local860, local548), Static139.method2606(local929, local817), Static139.method2606(local929, local839), Static139.method2606(local929, local878), Static139.method2606(local929, local860), local802, local927);
							}
						}
					}
				}
			}
			for (local203 = 1; local203 < 103; local203++) {
				for (local216 = 1; local216 < 103; local216++) {
					Static13.method595(local134, local216, local203, Static202.method1712(local134, local203, local216));
				}
			}
			Static71.aByteArrayArrayArray40[local134] = null;
			Static173.aByteArrayArrayArray104[local134] = null;
			Static162.aByteArrayArrayArray98[local134] = null;
			Static82.aByteArrayArrayArray51[local134] = null;
			Static70.aByteArrayArrayArray38[local134] = null;
		}
		Static23.method418();
		@Pc(1187) int local1187;
		for (@Pc(1184) int local1184 = 0; local1184 < 104; local1184++) {
			for (local1187 = 0; local1187 < 104; local1187++) {
				if ((Static106.aByteArrayArrayArray67[1][local1184][local1187] & 0x2) == 2) {
					Static209.method3294(local1184, local1187);
				}
			}
		}
		local1187 = 1;
		@Pc(1216) int local1216 = 2;
		local147 = 4;
		for (local153 = 0; local153 < 4; local153++) {
			if (local153 > 0) {
				local1187 <<= 0x3;
				local1216 <<= 0x3;
				local147 <<= 0x3;
			}
			for (local155 = 0; local155 <= local153; local155++) {
				for (local158 = 0; local158 <= 104; local158++) {
					for (local248 = 0; local248 <= 104; local248++) {
						if ((local1187 & Static204.anIntArrayArrayArray9[local155][local248][local158]) != 0) {
							for (local182 = local158; local182 > 0 && (local1187 & Static204.anIntArrayArrayArray9[local155][local248][local182 - 1]) != 0; local182--) {
							}
							local216 = local155;
							local222 = local155;
							for (local203 = local158; local203 < 104 && (Static204.anIntArrayArrayArray9[local155][local248][local203 + 1] & local1187) != 0; local203++) {
							}
							label350: while (local216 > 0) {
								for (local226 = local182; local226 <= local203; local226++) {
									if ((Static204.anIntArrayArrayArray9[local216 - 1][local248][local226] & local1187) == 0) {
										break label350;
									}
								}
								local216--;
							}
							label339: while (local153 > local222) {
								for (local226 = local182; local226 <= local203; local226++) {
									if ((local1187 & Static204.anIntArrayArrayArray9[local222 + 1][local248][local226]) == 0) {
										break label339;
									}
								}
								local222++;
							}
							local226 = (local222 + 1 - local216) * (local203 + 1 - local182);
							if (local226 >= 8) {
								local511 = Static89.anIntArrayArrayArray3[local216][local248][local182];
								local298 = Static89.anIntArrayArrayArray3[local222][local248][local182] - 240;
								Static165.method2846(local153, 1, local248 * 128, local248 * 128, local182 * 128, local203 * 128 + 128, local298, local511);
								for (local548 = local216; local548 <= local222; local548++) {
									for (local802 = local182; local802 <= local203; local802++) {
										Static204.anIntArrayArrayArray9[local548][local248][local802] &= ~local1187;
									}
								}
							}
						}
						if ((Static204.anIntArrayArrayArray9[local155][local248][local158] & local1216) != 0) {
							local182 = local248;
							for (local203 = local248; local203 < 104 && (Static204.anIntArrayArrayArray9[local155][local203 + 1][local158] & local1216) != 0; local203++) {
							}
							local216 = local155;
							local222 = local155;
							while (local182 > 0 && (local1216 & Static204.anIntArrayArrayArray9[local155][local182 - 1][local158]) != 0) {
								local182--;
							}
							label404: while (local216 > 0) {
								for (local226 = local182; local226 <= local203; local226++) {
									if ((local1216 & Static204.anIntArrayArrayArray9[local216 - 1][local226][local158]) == 0) {
										break label404;
									}
								}
								local216--;
							}
							label393: while (local153 > local222) {
								for (local226 = local182; local226 <= local203; local226++) {
									if ((Static204.anIntArrayArrayArray9[local222 + 1][local226][local158] & local1216) == 0) {
										break label393;
									}
								}
								local222++;
							}
							local226 = (local222 + 1 - local216) * (local203 + 1 - local182);
							if (local226 >= 8) {
								local298 = Static89.anIntArrayArrayArray3[local222][local182][local158] - 240;
								local511 = Static89.anIntArrayArrayArray3[local216][local182][local158];
								Static165.method2846(local153, 2, local182 * 128, local203 * 128 + 128, local158 * 128, local158 * 128, local298, local511);
								for (local548 = local216; local548 <= local222; local548++) {
									for (local802 = local182; local802 <= local203; local802++) {
										Static204.anIntArrayArrayArray9[local548][local802][local158] &= ~local1216;
									}
								}
							}
						}
						if ((local147 & Static204.anIntArrayArrayArray9[local155][local248][local158]) != 0) {
							local203 = local248;
							local182 = local248;
							for (local216 = local158; local216 > 0 && (Static204.anIntArrayArrayArray9[local155][local248][local216 - 1] & local147) != 0; local216--) {
							}
							for (local222 = local158; local222 < 104 && (local147 & Static204.anIntArrayArrayArray9[local155][local248][local222 + 1]) != 0; local222++) {
							}
							label458: while (local182 > 0) {
								for (local226 = local216; local226 <= local222; local226++) {
									if ((Static204.anIntArrayArrayArray9[local155][local182 - 1][local226] & local147) == 0) {
										break label458;
									}
								}
								local182--;
							}
							label447: while (local203 < 104) {
								for (local226 = local216; local226 <= local222; local226++) {
									if ((local147 & Static204.anIntArrayArrayArray9[local155][local203 + 1][local226]) == 0) {
										break label447;
									}
								}
								local203++;
							}
							if ((local222 + 1 - local216) * (local203 + 1 - local182) >= 4) {
								local226 = Static89.anIntArrayArrayArray3[local155][local182][local216];
								Static165.method2846(local153, 4, local182 * 128, local203 * 128 + 128, local216 * 128, local222 * 128 + 128, local226, local226);
								for (local232 = local182; local232 <= local203; local232++) {
									for (local298 = local216; local298 <= local222; local298++) {
										Static204.anIntArrayArrayArray9[local155][local232][local298] &= ~local147;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZII)V")
	public static void method129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static45.aClass1_Sub14_Sub1_8.method1761(194);
		Static45.aClass1_Sub14_Sub1_8.method1724(arg0);
		Static45.aClass1_Sub14_Sub1_8.method1748(arg1);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)V")
	public static void method130() {
		Static145.aClass99_11 = new Class99(32);
	}
}
