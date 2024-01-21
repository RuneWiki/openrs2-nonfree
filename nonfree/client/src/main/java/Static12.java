import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Lclient!rd;")
	public static Class42_Sub1 aClass42_Sub1_10;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
	public static int anInt461;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "Lclient!v;")
	private static Class62 aClass62_166 = Static45.method753("skill)2");

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!v;")
	public static Class62 aClass62_165 = aClass62_166;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
	public static int anInt451 = 0;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "Lclient!hd;")
	public static Class29 aClass29_1 = new Class29();

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "Lclient!v;")
	private static Class62 aClass62_168 = Static45.method753("World");

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "Lclient!v;")
	public static Class62 aClass62_167 = aClass62_168;

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "Lclient!v;")
	public static Class62 aClass62_169 = Static45.method753("Wen m\u001c1chten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method298() {
		aClass62_169 = null;
		aClass62_166 = null;
		aClass42_Sub1_10 = null;
		aClass62_167 = null;
		aClass29_1 = null;
		aClass62_165 = null;
		aClass62_168 = null;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
	public static void method301() {
		for (@Pc(10) Class3_Sub1_Sub3_Sub6 local10 = (Class3_Sub1_Sub3_Sub6) Static19.aClass24_83.method534(); local10 != null; local10 = (Class3_Sub1_Sub3_Sub6) Static19.aClass24_83.method525()) {
			if (Static27.anInt818 != local10.anInt2820 || anInt451 > local10.anInt2818) {
				local10.method1852();
			} else if (local10.anInt2822 <= anInt451) {
				if (local10.anInt2814 > 0) {
					@Pc(62) Class3_Sub1_Sub3_Sub1_Sub2 local62 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local10.anInt2814 - 1];
					if (local62 != null && local62.anInt1882 >= 0 && local62.anInt1882 < 13312 && local62.anInt1887 >= 0 && local62.anInt1887 < 13312) {
						local10.method1851(local62.anInt1882, local62.anInt1887, anInt451, Static91.method1541(local62.anInt1882, local62.anInt1887, local10.anInt2820) - local10.anInt2809);
					}
				}
				if (local10.anInt2814 < 0) {
					@Pc(115) int local115 = -local10.anInt2814 - 1;
					@Pc(126) Class3_Sub1_Sub3_Sub1_Sub1 local126;
					if (Static45.anInt1346 == local115) {
						local126 = Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1;
					} else {
						local126 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local115];
					}
					if (local126 != null && local126.anInt1882 >= 0 && local126.anInt1882 < 13312 && local126.anInt1887 >= 0 && local126.anInt1887 < 13312) {
						local10.method1851(local126.anInt1882, local126.anInt1887, anInt451, Static91.method1541(local126.anInt1882, local126.anInt1887, local10.anInt2820) - local10.anInt2809);
					}
				}
				local10.method1850(Static54.anInt2739);
				Static76.aClass1_1.method39(Static27.anInt818, (int) local10.aDouble9, (int) local10.aDouble2, (int) local10.aDouble5, 60, local10, local10.anInt2817, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method305() {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		if (Static109.anInt2854 == 145) {
			local12 = Static10.aClass3_Sub8_Sub1_5.method1803();
			local20 = (local12 >> 4 & 0x7) + Static62.anInt1700;
			local26 = Static38.anInt1136 + (local12 & 0x7);
			local30 = Static10.aClass3_Sub8_Sub1_5.method1789();
			local34 = Static10.aClass3_Sub8_Sub1_5.method1789();
			local38 = Static10.aClass3_Sub8_Sub1_5.method1789();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				@Pc(56) Class24 local56 = Static40.aClass24ArrayArrayArray1[Static27.anInt818][local20][local26];
				if (local56 != null) {
					for (@Pc(63) Class3_Sub1_Sub3_Sub5 local63 = (Class3_Sub1_Sub3_Sub5) local56.method534(); local63 != null; local63 = (Class3_Sub1_Sub3_Sub5) local56.method525()) {
						if ((local30 & 0x7FFF) == local63.anInt2268 && local34 == local63.anInt2274) {
							local63.anInt2274 = local38;
							break;
						}
					}
					Static92.method1553(local26, local20);
				}
			}
		} else if (Static109.anInt2854 == 244) {
			local12 = Static10.aClass3_Sub8_Sub1_5.method1791();
			local20 = Static10.aClass3_Sub8_Sub1_5.method1807();
			local26 = Static10.aClass3_Sub8_Sub1_5.method1785();
			local30 = Static10.aClass3_Sub8_Sub1_5.method1777();
			local34 = Static62.anInt1700 + (local30 >> 4 & 0x7);
			local38 = (local30 & 0x7) + Static38.anInt1136;
			if (local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local26 != Static45.anInt1346) {
				@Pc(159) Class3_Sub1_Sub3_Sub5 local159 = new Class3_Sub1_Sub3_Sub5();
				local159.anInt2274 = local20;
				local159.anInt2268 = local12;
				if (Static40.aClass24ArrayArrayArray1[Static27.anInt818][local34][local38] == null) {
					Static40.aClass24ArrayArrayArray1[Static27.anInt818][local34][local38] = new Class24();
				}
				Static40.aClass24ArrayArrayArray1[Static27.anInt818][local34][local38].method535(local159);
				Static92.method1553(local38, local34);
			}
		} else {
			@Pc(252) Class3_Sub1_Sub3_Sub5 local252;
			if (Static109.anInt2854 == 42) {
				local12 = Static10.aClass3_Sub8_Sub1_5.method1807();
				local20 = Static10.aClass3_Sub8_Sub1_5.method1813();
				local26 = (local20 >> 4 & 0x7) + Static62.anInt1700;
				local30 = (local20 & 0x7) + Static38.anInt1136;
				if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104) {
					@Pc(245) Class24 local245 = Static40.aClass24ArrayArrayArray1[Static27.anInt818][local26][local30];
					if (local245 != null) {
						for (local252 = (Class3_Sub1_Sub3_Sub5) local245.method534(); local252 != null; local252 = (Class3_Sub1_Sub3_Sub5) local245.method525()) {
							if ((local12 & 0x7FFF) == local252.anInt2268) {
								local252.method1852();
								break;
							}
						}
						if (local245.method534() == null) {
							Static40.aClass24ArrayArrayArray1[Static27.anInt818][local26][local30] = null;
						}
						Static92.method1553(local30, local26);
					}
				}
			} else {
				@Pc(336) int local336;
				@Pc(342) int local342;
				@Pc(348) int local348;
				@Pc(352) int local352;
				@Pc(364) int local364;
				@Pc(356) int local356;
				@Pc(360) int local360;
				if (Static109.anInt2854 == 169) {
					local12 = Static10.aClass3_Sub8_Sub1_5.method1803();
					local20 = Static62.anInt1700 + (local12 >> 4 & 0x7);
					local26 = Static38.anInt1136 + (local12 & 0x7);
					local30 = Static10.aClass3_Sub8_Sub1_5.method1765() + local20;
					local34 = local26 + Static10.aClass3_Sub8_Sub1_5.method1765();
					local38 = Static10.aClass3_Sub8_Sub1_5.method1784();
					local336 = Static10.aClass3_Sub8_Sub1_5.method1789();
					local342 = Static10.aClass3_Sub8_Sub1_5.method1803() * 4;
					local348 = Static10.aClass3_Sub8_Sub1_5.method1803() * 4;
					local352 = Static10.aClass3_Sub8_Sub1_5.method1789();
					local356 = Static10.aClass3_Sub8_Sub1_5.method1789();
					local360 = Static10.aClass3_Sub8_Sub1_5.method1803();
					local364 = Static10.aClass3_Sub8_Sub1_5.method1803();
					if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104 && local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104 && local336 != 65535) {
						local20 = local20 * 128 + 64;
						local30 = local30 * 128 + 64;
						local34 = local34 * 128 + 64;
						local26 = local26 * 128 + 64;
						@Pc(442) Class3_Sub1_Sub3_Sub6 local442 = new Class3_Sub1_Sub3_Sub6(local336, Static27.anInt818, local20, local26, Static91.method1541(local20, local26, Static27.anInt818) - local342, local352 + anInt451, anInt451 + local356, local360, local364, local38, local348);
						local442.method1851(local30, local34, local352 + anInt451, -local348 + Static91.method1541(local30, local34, Static27.anInt818));
						Static19.aClass24_83.method535(local442);
					}
				} else if (Static109.anInt2854 == 227) {
					local12 = Static10.aClass3_Sub8_Sub1_5.method1813();
					local20 = (local12 >> 4 & 0x7) + Static62.anInt1700;
					local26 = (local12 & 0x7) + Static38.anInt1136;
					local30 = Static10.aClass3_Sub8_Sub1_5.method1780();
					local38 = local30 & 0x3;
					local34 = local30 >> 2;
					local336 = Static61.anIntArray173[local34];
					if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
						Static6.method171(local26, local38, -1, 0, Static27.anInt818, local20, -1, local336, local34);
					}
				} else if (Static109.anInt2854 == 204) {
					local12 = Static10.aClass3_Sub8_Sub1_5.method1780();
					local20 = local12 >> 2;
					local30 = Static61.anIntArray173[local20];
					local26 = local12 & 0x3;
					local34 = Static10.aClass3_Sub8_Sub1_5.method1813();
					local336 = (local34 & 0x7) + Static38.anInt1136;
					local38 = (local34 >> 4 & 0x7) + Static62.anInt1700;
					local342 = Static10.aClass3_Sub8_Sub1_5.method1789();
					if (local38 >= 0 && local336 >= 0 && local38 < 103 && local336 < 103) {
						local348 = Static79.anIntArrayArrayArray4[Static27.anInt818][local38][local336];
						local352 = Static79.anIntArrayArrayArray4[Static27.anInt818][local38 + 1][local336];
						local356 = Static79.anIntArrayArrayArray4[Static27.anInt818][local38 + 1][local336 + 1];
						local360 = Static79.anIntArrayArrayArray4[Static27.anInt818][local38][local336 + 1];
						if (local30 == 0) {
							@Pc(640) Class7 local640 = Static76.aClass1_1.method16(Static27.anInt818, local38, local336);
							if (local640 != null) {
								@Pc(649) int local649 = local640.anInt212 >> 14 & 0x7FFF;
								if (local20 == 2) {
									local640.aClass3_Sub1_Sub3_2 = new Class3_Sub1_Sub3_Sub2(local649, 2, local26 + 4, local348, local352, local356, local360, local342, false);
									local640.aClass3_Sub1_Sub3_1 = new Class3_Sub1_Sub3_Sub2(local649, 2, local26 + 1 & 0x3, local348, local352, local356, local360, local342, false);
								} else {
									local640.aClass3_Sub1_Sub3_2 = new Class3_Sub1_Sub3_Sub2(local649, local20, local26, local348, local352, local356, local360, local342, false);
								}
							}
						}
						if (local30 == 1) {
							@Pc(711) Class45 local711 = Static76.aClass1_1.method11(Static27.anInt818, local38, local336);
							if (local711 != null) {
								local711.aClass3_Sub1_Sub3_8 = new Class3_Sub1_Sub3_Sub2(local711.anInt1899 >> 14 & 0x7FFF, 4, 0, local348, local352, local356, local360, local342, false);
							}
						}
						if (local30 == 2) {
							if (local20 == 11) {
								local20 = 10;
							}
							@Pc(746) Class25 local746 = Static76.aClass1_1.method46(Static27.anInt818, local38, local336);
							if (local746 != null) {
								local746.aClass3_Sub1_Sub3_4 = new Class3_Sub1_Sub3_Sub2(local746.anInt952 >> 14 & 0x7FFF, local20, local26, local348, local352, local356, local360, local342, false);
							}
						}
						if (local30 == 3) {
							@Pc(776) Class22 local776 = Static76.aClass1_1.method49(Static27.anInt818, local38, local336);
							if (local776 != null) {
								local776.aClass3_Sub1_Sub3_3 = new Class3_Sub1_Sub3_Sub2(local776.anInt770 >> 14 & 0x7FFF, 22, local26, local348, local352, local356, local360, local342, false);
							}
						}
					}
				} else {
					if (Static109.anInt2854 == 196) {
						local12 = Static10.aClass3_Sub8_Sub1_5.method1803();
						local20 = Static62.anInt1700 + (local12 >> 4 & 0x7);
						local26 = (local12 & 0x7) + Static38.anInt1136;
						local30 = Static10.aClass3_Sub8_Sub1_5.method1789();
						local34 = Static10.aClass3_Sub8_Sub1_5.method1803();
						local38 = local34 >> 4 & 0xF;
						local336 = local34 & 0x7;
						if (Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0] >= local20 - local38 && Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0] <= local20 + local38 && Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0] >= local26 - local38 && local38 + local26 >= Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0] && Static46.anInt1364 != 0 && local336 > 0 && Static71.anInt1938 < 50) {
							Static5.anIntArray19[Static71.anInt1938] = local30;
							Static22.anIntArray56[Static71.anInt1938] = local336;
							Static40.anIntArray82[Static71.anInt1938] = 0;
							Static8.aClass49Array1[Static71.anInt1938] = null;
							Static71.anInt1938++;
						}
					}
					if (Static109.anInt2854 == 249) {
						local12 = Static10.aClass3_Sub8_Sub1_5.method1803();
						local26 = Static38.anInt1136 + (local12 & 0x7);
						local20 = (local12 >> 4 & 0x7) + Static62.anInt1700;
						local30 = Static10.aClass3_Sub8_Sub1_5.method1789();
						local34 = Static10.aClass3_Sub8_Sub1_5.method1803();
						local38 = Static10.aClass3_Sub8_Sub1_5.method1789();
						if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
							local20 = local20 * 128 + 64;
							local26 = local26 * 128 + 64;
							@Pc(994) Class3_Sub1_Sub3_Sub4 local994 = new Class3_Sub1_Sub3_Sub4(local30, Static27.anInt818, local20, local26, Static91.method1541(local20, local26, Static27.anInt818) - local34, local38, anInt451);
							Static20.aClass24_22.method535(local994);
						}
					} else if (Static109.anInt2854 == 113) {
						local12 = Static10.aClass3_Sub8_Sub1_5.method1803();
						local26 = local12 & 0x3;
						local20 = local12 >> 2;
						local30 = Static61.anIntArray173[local20];
						local34 = Static10.aClass3_Sub8_Sub1_5.method1803();
						local38 = (local34 >> 4 & 0x7) + Static62.anInt1700;
						local336 = (local34 & 0x7) + Static38.anInt1136;
						local342 = Static10.aClass3_Sub8_Sub1_5.method1791();
						if (local38 >= 0 && local336 >= 0 && local38 < 104 && local336 < 104) {
							Static6.method171(local336, local26, local342, 0, Static27.anInt818, local38, -1, local30, local20);
						}
					} else {
						if (Static109.anInt2854 == 21) {
							local12 = Static10.aClass3_Sub8_Sub1_5.method1789();
							local20 = Static10.aClass3_Sub8_Sub1_5.method1813();
							local30 = local20 & 0x3;
							local26 = local20 >> 2;
							local34 = Static61.anIntArray173[local26];
							local38 = Static10.aClass3_Sub8_Sub1_5.method1807();
							local336 = Static10.aClass3_Sub8_Sub1_5.method1803();
							local348 = (local336 & 0x7) + Static38.anInt1136;
							local342 = Static62.anInt1700 + (local336 >> 4 & 0x7);
							local352 = Static10.aClass3_Sub8_Sub1_5.method1807();
							@Pc(1122) byte local1122 = Static10.aClass3_Sub8_Sub1_5.method1775();
							@Pc(1126) byte local1126 = Static10.aClass3_Sub8_Sub1_5.method1775();
							local364 = Static10.aClass3_Sub8_Sub1_5.method1807();
							@Pc(1134) byte local1134 = Static10.aClass3_Sub8_Sub1_5.method1797();
							@Pc(1138) byte local1138 = Static10.aClass3_Sub8_Sub1_5.method1797();
							@Pc(1147) Class3_Sub1_Sub3_Sub1_Sub1 local1147;
							if (local12 == Static45.anInt1346) {
								local1147 = Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1;
							} else {
								local1147 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local12];
							}
							if (local1147 != null) {
								@Pc(1159) Class3_Sub1_Sub9 local1159 = Static10.method1322(local364);
								@Pc(1167) int local1167 = Static79.anIntArrayArrayArray4[Static27.anInt818][local342][local348];
								@Pc(1179) int local1179 = Static79.anIntArrayArrayArray4[Static27.anInt818][local342 + 1][local348 + 1];
								@Pc(1189) int local1189 = Static79.anIntArrayArrayArray4[Static27.anInt818][local342 + 1][local348];
								@Pc(1199) int local1199 = Static79.anIntArrayArrayArray4[Static27.anInt818][local342][local348 + 1];
								@Pc(1209) Class3_Sub1_Sub3_Sub3 local1209 = local1159.method656(local1189, local1199, local1179, local26, local1167, local30);
								if (local1209 != null) {
									Static6.method171(local348, 0, -1, local38 + 1, Static27.anInt818, local342, local352 + 1, local34, 0);
									local1147.anInt1353 = local38 + anInt451;
									local1147.anInt1337 = anInt451 + local352;
									local1147.aClass3_Sub1_Sub3_Sub3_1 = local1209;
									@Pc(1242) int local1242 = local1159.anInt1068;
									@Pc(1247) byte local1247;
									if (local1122 > local1134) {
										local1247 = local1122;
										local1122 = local1134;
										local1134 = local1247;
									}
									@Pc(1254) int local1254 = local1159.anInt1061;
									if (local1138 > local1126) {
										local1247 = local1138;
										local1138 = local1126;
										local1126 = local1247;
									}
									if (local30 == 1 || local30 == 3) {
										local1242 = local1159.anInt1061;
										local1254 = local1159.anInt1068;
									}
									local1147.anInt1338 = local348 * 128 + local1254 * 64;
									local1147.anInt1344 = local1242 * 64 + local342 * 128;
									local1147.anInt1355 = Static91.method1541(local1147.anInt1344, local1147.anInt1338, Static27.anInt818);
									local1147.anInt1358 = local1122 + local342;
									local1147.anInt1342 = local1126 + local348;
									local1147.anInt1350 = local342 + local1134;
									local1147.anInt1336 = local348 + local1138;
								}
							}
						}
						if (Static109.anInt2854 == 121) {
							local12 = Static10.aClass3_Sub8_Sub1_5.method1785();
							local20 = Static10.aClass3_Sub8_Sub1_5.method1785();
							local26 = Static10.aClass3_Sub8_Sub1_5.method1777();
							local30 = Static62.anInt1700 + (local26 >> 4 & 0x7);
							local34 = (local26 & 0x7) + Static38.anInt1136;
							if (local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104) {
								local252 = new Class3_Sub1_Sub3_Sub5();
								local252.anInt2268 = local20;
								local252.anInt2274 = local12;
								if (Static40.aClass24ArrayArrayArray1[Static27.anInt818][local30][local34] == null) {
									Static40.aClass24ArrayArrayArray1[Static27.anInt818][local30][local34] = new Class24();
								}
								Static40.aClass24ArrayArrayArray1[Static27.anInt818][local30][local34].method535(local252);
								Static92.method1553(local34, local30);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)[Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1[] method311() {
		@Pc(8) Class3_Sub1_Sub1_Sub1[] local8 = new Class3_Sub1_Sub1_Sub1[Static99.anInt2603];
		for (@Pc(10) int local10 = 0; local10 < Static99.anInt2603; local10++) {
			@Pc(20) Class3_Sub1_Sub1_Sub1 local20 = local8[local10] = new Class3_Sub1_Sub1_Sub1();
			local20.anInt149 = Static14.anInt551;
			local20.anInt151 = Static39.anInt1163;
			local20.anInt153 = Static98.anIntArray281[local10];
			local20.anInt150 = Static36.anIntArray78[local10];
			local20.anInt152 = Static75.anIntArray228[local10];
			local20.anInt148 = Static50.anIntArray310[local10];
			local20.anIntArray17 = Static70.anIntArray201;
			local20.aByteArray3 = Static98.aByteArrayArray9[local10];
		}
		Static51.method1440();
		return local8;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
	public static void method312(@OriginalArg(1) int arg0) {
		Static42.method714(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)I")
	public static int method313(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) long local16 = (long) ((arg0 << 16) + arg1);
		return Static64.aClass3_Sub1_Sub10_1 != null && Static64.aClass3_Sub1_Sub10_1.aLong81 == local16 ? Static54.aClass3_Sub8_5.anInt2704 * 99 / (Static54.aClass3_Sub8_5.aByteArray26.length - Static64.aClass3_Sub1_Sub10_1.aByte2) + 1 : 0;
	}
}
