import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
	public static int anInt1441;

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "Lclient!ir;")
	public static Class100 aClass100_29;

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "Z")
	public static boolean aBoolean73 = false;

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "Lclient!bo;")
	public static final Class24 aClass24_7 = new Class24(512);

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "Z")
	public static boolean aBoolean74 = true;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIBIIIII)V")
	public static void method1128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg0 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(37) int local37 = local7 * (Static85.aShort12 - Static200.aShort58) / 100 + Static200.aShort58;
		@Pc(43) int local43 = local37 * arg5 >> 8;
		@Pc(49) int local49 = 16384 - arg1 & 0x3FFF;
		@Pc(56) int local56 = 16384 - arg4 & 0x3FFF;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = local43;
		if (local49 != 0) {
			local60 = -local43 * Class19.anIntArray20[local49] >> 15;
			local62 = local43 * Class19.anIntArray21[local49] >> 15;
		}
		if (local56 != 0) {
			local58 = Class19.anIntArray20[local56] * local62 >> 15;
			local62 = Class19.anIntArray21[local56] * local62 >> 15;
		}
		Static350.anInt6797 = arg4;
		Static210.anInt4317 = arg3 - local62;
		Static110.anInt2324 = arg6 - local58;
		Static154.anInt6368 = arg1;
		Static175.anInt3631 = arg2 - local60;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)Z")
	public static boolean method1129() throws IOException {
		if (Static76.aClass16_2 == null) {
			return false;
		}
		@Pc(13) int local13 = Static76.aClass16_2.method391();
		if (local13 == 0) {
			return false;
		}
		if (Static92.anInt1818 == -1) {
			Static76.aClass16_2.method398(Static20.aClass3_Sub4_Sub2_1.aByteArray70, 0, 1);
			Static20.aClass3_Sub4_Sub2_1.anInt4268 = 0;
			Static92.anInt1818 = Static20.aClass3_Sub4_Sub2_1.method3686();
			local13--;
			Static306.anInt6046 = Static219.anIntArray367[Static92.anInt1818];
		}
		if (Static306.anInt6046 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static76.aClass16_2.method398(Static20.aClass3_Sub4_Sub2_1.aByteArray70, 0, 1);
			local13--;
			Static306.anInt6046 = Static20.aClass3_Sub4_Sub2_1.aByteArray70[0] & 0xFF;
		}
		if (Static306.anInt6046 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static76.aClass16_2.method398(Static20.aClass3_Sub4_Sub2_1.aByteArray70, 0, 2);
			Static20.aClass3_Sub4_Sub2_1.anInt4268 = 0;
			Static306.anInt6046 = Static20.aClass3_Sub4_Sub2_1.method3649();
			local13 -= 2;
		}
		if (Static306.anInt6046 > local13) {
			return false;
		}
		Static20.aClass3_Sub4_Sub2_1.anInt4268 = 0;
		Static76.aClass16_2.method398(Static20.aClass3_Sub4_Sub2_1.aByteArray70, 0, Static306.anInt6046);
		Static37.anInt6453 = 0;
		Static170.anInt6276 = Static307.anInt6101;
		Static307.anInt6101 = Static312.anInt6287;
		Static312.anInt6287 = Static92.anInt1818;
		@Pc(125) int local125;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(139) int local139;
		@Pc(161) int local161;
		@Pc(561) int local561;
		@Pc(568) int local568;
		@Pc(331) int local331;
		@Pc(594) int local594;
		@Pc(216) int local216;
		@Pc(183) boolean local183;
		if (Static92.anInt1818 == 93) {
			local125 = Static20.aClass3_Sub4_Sub2_1.method3623();
			local129 = Static20.aClass3_Sub4_Sub2_1.method3638();
			local133 = Static20.aClass3_Sub4_Sub2_1.method3649();
			local139 = Static20.aClass3_Sub4_Sub2_1.method3640();
			if (local125 >> 30 == 0) {
				@Pc(198) Class2 local198;
				@Pc(260) Class131 local260;
				@Pc(265) Class131 local265;
				@Pc(246) Class2 local246;
				@Pc(213) Class131 local213;
				if (local125 >> 29 != 0) {
					local161 = local125 & 0xFFFF;
					@Pc(370) Class5_Sub4_Sub4_Sub2 local370 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local161];
					if (local370 != null) {
						if (local133 == 65535) {
							local133 = -1;
						}
						local183 = true;
						if (local133 != -1 && local370.anInt4910 != -1) {
							if (local133 == local370.anInt4910) {
								local198 = Static155.method1566(local133);
								if (local198.aBoolean5 && local198.anInt22 != -1) {
									local213 = Static343.method5604(local198.anInt22);
									local216 = local213.anInt3986;
									if (local216 == 0 || local216 == 2) {
										local183 = false;
									} else if (local216 == 1) {
										local183 = true;
									}
								}
							} else {
								local198 = Static155.method1566(local133);
								local246 = Static155.method1566(local370.anInt4910);
								if (local198.anInt22 != -1 && local246.anInt22 != -1) {
									local260 = Static343.method5604(local198.anInt22);
									local265 = Static343.method5604(local246.anInt22);
									if (local260.anInt3993 < local265.anInt3993) {
										local183 = false;
									}
								}
							}
						}
						if (local183) {
							local370.anInt4930 = 1;
							local370.anInt4891 = 0;
							local370.anInt4926 = Static51.anInt1101 + local139;
							local370.anInt4906 = local129;
							local370.anInt4910 = local133;
							local370.anInt4887 = 0;
							if (local370.anInt4926 > Static51.anInt1101) {
								local370.anInt4887 = -1;
							}
							if (local370.anInt4910 != -1 && Static51.anInt1101 == local370.anInt4926) {
								local331 = Static155.method1566(local370.anInt4910).anInt22;
								if (local331 != -1) {
									local213 = Static343.method5604(local331);
									if (local213 != null && local213.anIntArray335 != null) {
										Static161.method2570(0, false, local370.anInt5905, local213, local370.anInt5901);
									}
								}
							}
						}
					}
				} else if (local125 >> 28 != 0) {
					local161 = local125 & 0xFFFF;
					@Pc(166) Class5_Sub4_Sub4_Sub1 local166;
					if (Static312.anInt6280 == local161) {
						local166 = Static349.aClass5_Sub4_Sub4_Sub1_2;
					} else {
						local166 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local161];
					}
					if (local166 != null) {
						if (local133 == 65535) {
							local133 = -1;
						}
						local183 = true;
						if (local133 != -1 && local166.anInt4910 != -1) {
							if (local166.anInt4910 == local133) {
								local198 = Static155.method1566(local133);
								if (local198.aBoolean5 && local198.anInt22 != -1) {
									local213 = Static343.method5604(local198.anInt22);
									local216 = local213.anInt3986;
									if (local216 == 0 || local216 == 2) {
										local183 = false;
									} else if (local216 == 1) {
										local183 = true;
									}
								}
							} else {
								local198 = Static155.method1566(local133);
								local246 = Static155.method1566(local166.anInt4910);
								if (local198.anInt22 != -1 && local246.anInt22 != -1) {
									local260 = Static343.method5604(local198.anInt22);
									local265 = Static343.method5604(local246.anInt22);
									if (local260.anInt3993 < local265.anInt3993) {
										local183 = false;
									}
								}
							}
						}
						if (local183) {
							local166.anInt4926 = Static51.anInt1101 + local139;
							local166.anInt4910 = local133;
							local166.anInt4906 = local129;
							local166.anInt4887 = 0;
							local166.anInt4930 = 1;
							local166.anInt4891 = 0;
							if (Static51.anInt1101 < local166.anInt4926) {
								local166.anInt4887 = -1;
							}
							if (local166.anInt4910 == 65535) {
								local166.anInt4910 = -1;
							}
							if (local166.anInt4910 != -1 && local166.anInt4926 == Static51.anInt1101) {
								local331 = Static155.method1566(local166.anInt4910).anInt22;
								if (local331 != -1) {
									local213 = Static343.method5604(local331);
									if (local213 != null && local213.anIntArray335 != null) {
										Static161.method2570(0, local166 == Static349.aClass5_Sub4_Sub4_Sub1_2, local166.anInt5905, local213, local166.anInt5901);
									}
								}
							}
						}
					}
				}
			} else {
				local161 = local125 >> 28 & 0x3;
				local561 = (local125 >> 14 & 0x3FFF) - Static186.anInt3094;
				local568 = (local125 & 0x3FFF) - Static296.anInt5889;
				if (local561 >= 0 && local568 >= 0 && Static162.anInt2152 > local561 && Static122.anInt2632 > local568) {
					local331 = local561 * 128 + 64;
					local594 = local568 * 128 + 64;
					@Pc(615) Class5_Sub4_Sub1 local615 = new Class5_Sub4_Sub1(local133, 0, Static51.anInt1101, local161, local331, Static286.method4919(local331, local594, local161) - local129, local594, local561, local561, local568, local568);
					Static254.aClass127_27.method3387(new Class3_Sub7_Sub2(local615));
				}
			}
			Static92.anInt1818 = -1;
			return true;
		} else if (Static92.anInt1818 == 80) {
			Static260.method4396(Static353.aClass42_5, Static20.aClass3_Sub4_Sub2_1, Static306.anInt6046);
			Static92.anInt1818 = -1;
			return true;
		} else if (Static92.anInt1818 == 148) {
			local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
			if (Static343.method5603(local125)) {
				Static271.method4581();
			}
			Static92.anInt1818 = -1;
			return true;
		} else {
			@Pc(680) String local680;
			@Pc(678) String local678;
			@Pc(710) String local710;
			if (Static92.anInt1818 == 101) {
				local125 = Static20.aClass3_Sub4_Sub2_1.method3633();
				local129 = Static20.aClass3_Sub4_Sub2_1.method3642();
				local133 = Static20.aClass3_Sub4_Sub2_1.method3643();
				local678 = "";
				local680 = local678;
				if ((local133 & 0x1) != 0) {
					local678 = Static20.aClass3_Sub4_Sub2_1.method3671();
					if ((local133 & 0x2) == 0) {
						local680 = local678;
					} else {
						local680 = Static20.aClass3_Sub4_Sub2_1.method3671();
					}
				}
				local710 = Static20.aClass3_Sub4_Sub2_1.method3671();
				if (local125 == 99) {
					Static104.method1768(local710);
				} else if (local680.equals("") || !Static323.method5295(local680)) {
					Static306.method5148(local129, local125, local710, local678, local680);
				} else {
					Static92.anInt1818 = -1;
					return true;
				}
				Static92.anInt1818 = -1;
				return true;
			}
			@Pc(779) boolean local779;
			@Pc(932) Class116 local932;
			if (Static92.anInt1818 == 46) {
				Static9.anInt240 = Static293.anInt6247;
				if (Static306.anInt6046 == 0) {
					Static132.aString105 = null;
					Static92.anInt1818 = -1;
					Static170.anInt6278 = 0;
					Static339.aClass116Array3 = null;
					Static92.aString64 = null;
					return true;
				}
				Static132.aString105 = Static20.aClass3_Sub4_Sub2_1.method3671();
				local779 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
				if (local779) {
					Static20.aClass3_Sub4_Sub2_1.method3671();
				}
				@Pc(789) long local789 = Static20.aClass3_Sub4_Sub2_1.method3641();
				Static92.aString64 = Static232.method4000(local789);
				Static298.aByte73 = Static20.aClass3_Sub4_Sub2_1.method3621();
				local139 = Static20.aClass3_Sub4_Sub2_1.method3643();
				if (local139 == 255) {
					Static92.anInt1818 = -1;
					return true;
				}
				Static170.anInt6278 = local139;
				@Pc(813) Class116[] local813 = new Class116[100];
				for (local561 = 0; local561 < Static170.anInt6278; local561++) {
					local813[local561] = new Class116();
					local813[local561].aString135 = Static20.aClass3_Sub4_Sub2_1.method3671();
					local779 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
					if (local779) {
						local813[local561].aString132 = Static20.aClass3_Sub4_Sub2_1.method3671();
					} else {
						local813[local561].aString132 = local813[local561].aString135;
					}
					local813[local561].anInt3626 = Static20.aClass3_Sub4_Sub2_1.method3649();
					local813[local561].aByte33 = Static20.aClass3_Sub4_Sub2_1.method3621();
					local813[local561].aString134 = Static20.aClass3_Sub4_Sub2_1.method3671();
					if (local813[local561].aString132.equals(Static349.aClass5_Sub4_Sub4_Sub1_2.aString126)) {
						Static330.aByte74 = local813[local561].aByte33;
					}
				}
				local594 = Static170.anInt6278;
				while (local594 > 0) {
					local183 = true;
					local594--;
					for (local216 = 0; local216 < local594; local216++) {
						if (local813[local216].aString135.compareTo(local813[local216 + 1].aString135) > 0) {
							local932 = local813[local216];
							local813[local216] = local813[local216 + 1];
							local183 = false;
							local813[local216 + 1] = local932;
						}
					}
					if (local183) {
						break;
					}
				}
				Static339.aClass116Array3 = local813;
				Static92.anInt1818 = -1;
				return true;
			} else if (Static92.anInt1818 == 60) {
				local125 = Static20.aClass3_Sub4_Sub2_1.method3643();
				if (Static20.aClass3_Sub4_Sub2_1.method3643() == 0) {
					Static162.aClass64Array2[local125] = new Class64();
				} else {
					Static20.aClass3_Sub4_Sub2_1.anInt4268--;
					Static162.aClass64Array2[local125] = new Class64(Static20.aClass3_Sub4_Sub2_1);
				}
				Static152.anInt2974 = Static293.anInt6247;
				Static92.anInt1818 = -1;
				return true;
			} else if (Static92.anInt1818 == 32) {
				local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
				if (local125 == 65535) {
					local125 = -1;
				}
				local129 = Static20.aClass3_Sub4_Sub2_1.method3640();
				local133 = Static20.aClass3_Sub4_Sub2_1.method3666();
				if (Static343.method5603(local129)) {
					Static164.method5313(-1, local133, local125, 1);
				}
				Static92.anInt1818 = -1;
				return true;
			} else if (Static92.anInt1818 == 44) {
				Static56.method929();
				Static250.anInt4794 = Static20.aClass3_Sub4_Sub2_1.method3622();
				Static316.anInt6202 = Static293.anInt6247;
				Static92.anInt1818 = -1;
				return true;
			} else if (Static92.anInt1818 == 37) {
				local125 = Static20.aClass3_Sub4_Sub2_1.method3675();
				local129 = Static20.aClass3_Sub4_Sub2_1.method3638();
				local133 = Static20.aClass3_Sub4_Sub2_1.method3675();
				if (Static343.method5603(local129)) {
					Static232.method3997(local125, local133);
				}
				Static92.anInt1818 = -1;
				return true;
			} else if (Static92.anInt1818 == 182 || Static92.anInt1818 == 167 || Static92.anInt1818 == 184 || Static92.anInt1818 == 164 || Static92.anInt1818 == 233 || Static92.anInt1818 == 24 || Static92.anInt1818 == 5 || Static92.anInt1818 == 81 || Static92.anInt1818 == 122 || Static92.anInt1818 == 7 || Static92.anInt1818 == 172 || Static92.anInt1818 == 204 || Static92.anInt1818 == 227 || Static92.anInt1818 == 196 || Static92.anInt1818 == 200) {
				Static135.method2254();
				Static92.anInt1818 = -1;
				return true;
			} else if (Static92.anInt1818 == 25) {
				local125 = Static20.aClass3_Sub4_Sub2_1.method3642();
				local129 = Static20.aClass3_Sub4_Sub2_1.method3642();
				local133 = Static20.aClass3_Sub4_Sub2_1.method3649();
				local139 = Static20.aClass3_Sub4_Sub2_1.method3640();
				if (Static343.method5603(local139)) {
					Static164.method5313(local125, local129, local133, 5);
				}
				Static92.anInt1818 = -1;
				return true;
			} else if (Static92.anInt1818 == 90) {
				local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
				if (local125 == 65535) {
					local125 = -1;
				}
				local129 = Static20.aClass3_Sub4_Sub2_1.method3643();
				local133 = Static20.aClass3_Sub4_Sub2_1.method3649();
				local139 = Static20.aClass3_Sub4_Sub2_1.method3643();
				Static157.method2489(local139, local125, local129, local133);
				Static92.anInt1818 = -1;
				return true;
			} else {
				@Pc(1289) long local1289;
				@Pc(1304) Class3_Sub15 local1304;
				@Pc(1295) Class3_Sub15 local1295;
				if (Static92.anInt1818 == 92) {
					local125 = Static20.aClass3_Sub4_Sub2_1.method3675();
					local129 = Static20.aClass3_Sub4_Sub2_1.method3640();
					if (local129 == 65535) {
						local129 = -1;
					}
					local133 = Static20.aClass3_Sub4_Sub2_1.method3636();
					local139 = Static20.aClass3_Sub4_Sub2_1.method3642();
					local161 = Static20.aClass3_Sub4_Sub2_1.method3675();
					if (local161 == 65535) {
						local161 = -1;
					}
					if (Static343.method5603(local125)) {
						for (local561 = local161; local561 <= local129; local561++) {
							local1289 = ((long) local139 << 32) + ((long) local561);
							local1295 = (Class3_Sub15) aClass24_7.method609(local1289);
							if (local1295 != null) {
								local1304 = new Class3_Sub15(local133, local1295.anInt1465);
								local1295.method5717();
							} else if (local561 == -1) {
								local1304 = new Class3_Sub15(local133, Static20.method415(local139).aClass3_Sub15_4.anInt1465);
							} else {
								local1304 = new Class3_Sub15(local133, -1);
							}
							aClass24_7.method598(local1289, local1304);
						}
					}
					Static92.anInt1818 = -1;
					return true;
				} else if (Static92.anInt1818 == 178) {
					local125 = Static20.aClass3_Sub4_Sub2_1.method3675();
					local129 = Static20.aClass3_Sub4_Sub2_1.method3675();
					local133 = Static20.aClass3_Sub4_Sub2_1.method3638();
					local139 = Static20.aClass3_Sub4_Sub2_1.method3623();
					local161 = Static20.aClass3_Sub4_Sub2_1.method3649();
					if (Static343.method5603(local125)) {
						Static78.method1187(local133, local139, local161, local129);
					}
					Static92.anInt1818 = -1;
					return true;
				} else if (Static92.anInt1818 == 216) {
					local125 = Static20.aClass3_Sub4_Sub2_1.method3643();
					local129 = Static20.aClass3_Sub4_Sub2_1.method3643();
					if (local125 == 255) {
						local129 = -1;
						local125 = -1;
					}
					Static283.method3805(local125, local129);
					Static92.anInt1818 = -1;
					return true;
				} else if (Static92.anInt1818 == 39) {
					Static251.method4218();
					Static92.anInt1818 = -1;
					return false;
				} else if (Static92.anInt1818 == 102) {
					if (Static191.anInt3991 != -1) {
						Static82.method1278(Static191.anInt3991, 0);
					}
					Static92.anInt1818 = -1;
					return true;
				} else if (Static92.anInt1818 == 203) {
					local125 = Static20.aClass3_Sub4_Sub2_1.method3640();
					local129 = Static20.aClass3_Sub4_Sub2_1.method3666();
					local133 = Static20.aClass3_Sub4_Sub2_1.method3643();
					if (Static343.method5603(local125)) {
						Static118.method2059(local129, local133);
					}
					Static92.anInt1818 = -1;
					return true;
				} else if (Static92.anInt1818 == 150) {
					local125 = Static20.aClass3_Sub4_Sub2_1.method3623();
					local129 = Static20.aClass3_Sub4_Sub2_1.method3675();
					if (local129 == 65535) {
						local129 = -1;
					}
					local133 = Static20.aClass3_Sub4_Sub2_1.method3649();
					local139 = Static20.aClass3_Sub4_Sub2_1.method3638();
					local161 = Static20.aClass3_Sub4_Sub2_1.method3649();
					if (local161 == 65535) {
						local161 = -1;
					}
					if (Static343.method5603(local139)) {
						for (local561 = local161; local561 <= local129; local561++) {
							local1289 = ((long) local125 << 32) + ((long) local561);
							local1295 = (Class3_Sub15) aClass24_7.method609(local1289);
							if (local1295 != null) {
								local1304 = new Class3_Sub15(local1295.anInt1455, local133);
								local1295.method5717();
							} else if (local561 == -1) {
								local1304 = new Class3_Sub15(Static20.method415(local125).aClass3_Sub15_4.anInt1455, local133);
							} else {
								local1304 = new Class3_Sub15(0, local133);
							}
							aClass24_7.method598(local1289, local1304);
						}
					}
					Static92.anInt1818 = -1;
					return true;
				} else if (Static92.anInt1818 == 198) {
					local125 = Static20.aClass3_Sub4_Sub2_1.method3638();
					local129 = Static20.aClass3_Sub4_Sub2_1.method3649();
					@Pc(1600) byte local1600 = Static20.aClass3_Sub4_Sub2_1.method3621();
					if (Static343.method5603(local125)) {
						Static30.method604(local1600, local129);
					}
					Static92.anInt1818 = -1;
					return true;
				} else if (Static92.anInt1818 == 161) {
					local125 = Static20.aClass3_Sub4_Sub2_1.method3666();
					local129 = Static20.aClass3_Sub4_Sub2_1.method3675();
					local133 = Static20.aClass3_Sub4_Sub2_1.method3640();
					if (Static343.method5603(local129)) {
						Static130.method2228(local133, local125);
					}
					Static92.anInt1818 = -1;
					return true;
				} else if (Static92.anInt1818 == 72) {
					local125 = Static20.aClass3_Sub4_Sub2_1.method3666();
					@Pc(1652) Class181 local1652 = Static20.method415(local125);
					for (local133 = 0; local133 < local1652.anIntArray469.length; local133++) {
						local1652.anIntArray469[local133] = -1;
						local1652.anIntArray469[local133] = 0;
					}
					Static316.method5250(local1652);
					Static92.anInt1818 = -1;
					return true;
				} else {
					@Pc(1690) String local1690;
					@Pc(1701) String local1701;
					if (Static92.anInt1818 == 50) {
						local1690 = Static20.aClass3_Sub4_Sub2_1.method3671();
						local129 = Static20.aClass3_Sub4_Sub2_1.method3649();
						local1701 = Static7.method151(local129).method2266(Static20.aClass3_Sub4_Sub2_1);
						Static232.method3992(null, local1701, local1690, local129, 19, 0, local1690);
						Static92.anInt1818 = -1;
						return true;
					} else if (Static92.anInt1818 == 71) {
						local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
						local129 = Static20.aClass3_Sub4_Sub2_1.method3648();
						local133 = Static20.aClass3_Sub4_Sub2_1.method3640();
						@Pc(1733) Class5_Sub4_Sub4_Sub2 local1733 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local125];
						if (local1733 != null) {
							Static126.method3741(local1733, local133, local129);
						}
						Static92.anInt1818 = -1;
						return true;
					} else {
						@Pc(1945) int local1945;
						@Pc(1762) String local1762;
						@Pc(1981) int local1981;
						@Pc(1999) String local1999;
						@Pc(2035) String local2035;
						@Pc(2017) String local2017;
						if (Static92.anInt1818 == 65) {
							local779 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
							local1762 = Static20.aClass3_Sub4_Sub2_1.method3671();
							local1701 = Static20.aClass3_Sub4_Sub2_1.method3671();
							local139 = Static20.aClass3_Sub4_Sub2_1.method3649();
							local161 = Static20.aClass3_Sub4_Sub2_1.method3643();
							local710 = "";
							local183 = false;
							if (local139 > 0) {
								local710 = Static20.aClass3_Sub4_Sub2_1.method3671();
								local183 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
							}
							for (local331 = 0; local331 < Static220.anInt4548; local331++) {
								if (local779) {
									if (local1701.equals(Static12.aStringArray1[local331])) {
										Static12.aStringArray1[local331] = local1762;
										local1762 = null;
										Static25.aStringArray5[local331] = local1701;
										break;
									}
								} else if (local1762.equals(Static12.aStringArray1[local331])) {
									if (local139 != Static267.anIntArray430[local331]) {
										Static267.anIntArray430[local331] = local139;
										if (local139 > 0) {
											Static306.method5148(0, 5, local1762 + Static137.aString91, "", "");
										}
										if (local139 == 0) {
											Static306.method5148(0, 5, local1762 + Static292.aString216, "", "");
										}
									}
									Static25.aStringArray5[local331] = local1701;
									Static123.aStringArray14[local331] = local710;
									Static46.anIntArray61[local331] = local161;
									local1762 = null;
									Static63.aBooleanArray6[local331] = local183;
									break;
								}
							}
							if (local1762 != null && Static220.anInt4548 < 200) {
								Static12.aStringArray1[Static220.anInt4548] = local1762;
								Static25.aStringArray5[Static220.anInt4548] = local1701;
								Static267.anIntArray430[Static220.anInt4548] = local139;
								Static123.aStringArray14[Static220.anInt4548] = local710;
								Static46.anIntArray61[Static220.anInt4548] = local161;
								Static63.aBooleanArray6[Static220.anInt4548] = local183;
								Static220.anInt4548++;
							}
							Static294.anInt6362 = Static293.anInt6247;
							local216 = Static220.anInt4548;
							while (local216 > 0) {
								@Pc(1942) boolean local1942 = true;
								local216--;
								for (local1945 = 0; local1945 < local216; local1945++) {
									if (Static267.anIntArray430[local1945] != Static287.anInt5784 && Static287.anInt5784 == Static267.anIntArray430[local1945 + 1] || Static267.anIntArray430[local1945] == 0 && Static267.anIntArray430[local1945 + 1] != 0) {
										local1981 = Static267.anIntArray430[local1945];
										Static267.anIntArray430[local1945] = Static267.anIntArray430[local1945 + 1];
										Static267.anIntArray430[local1945 + 1] = local1981;
										local1999 = Static123.aStringArray14[local1945];
										Static123.aStringArray14[local1945] = Static123.aStringArray14[local1945 + 1];
										Static123.aStringArray14[local1945 + 1] = local1999;
										local2017 = Static12.aStringArray1[local1945];
										Static12.aStringArray1[local1945] = Static12.aStringArray1[local1945 + 1];
										Static12.aStringArray1[local1945 + 1] = local2017;
										local2035 = Static25.aStringArray5[local1945];
										Static25.aStringArray5[local1945] = Static25.aStringArray5[local1945 + 1];
										Static25.aStringArray5[local1945 + 1] = local2035;
										@Pc(2053) int local2053 = Static46.anIntArray61[local1945];
										Static46.anIntArray61[local1945] = Static46.anIntArray61[local1945 + 1];
										Static46.anIntArray61[local1945 + 1] = local2053;
										@Pc(2071) boolean local2071 = Static63.aBooleanArray6[local1945];
										Static63.aBooleanArray6[local1945] = Static63.aBooleanArray6[local1945 + 1];
										Static63.aBooleanArray6[local1945 + 1] = local2071;
										local1942 = false;
									}
								}
								if (local1942) {
									break;
								}
							}
							Static92.anInt1818 = -1;
							return true;
						}
						@Pc(2136) long local2136;
						@Pc(2141) long local2141;
						if (Static92.anInt1818 == 230) {
							local779 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
							local1762 = Static20.aClass3_Sub4_Sub2_1.method3671();
							local1701 = local1762;
							if (local779) {
								local1701 = Static20.aClass3_Sub4_Sub2_1.method3671();
							}
							local2136 = Static20.aClass3_Sub4_Sub2_1.method3649();
							local2141 = Static20.aClass3_Sub4_Sub2_1.method3659();
							local331 = Static20.aClass3_Sub4_Sub2_1.method3643();
							@Pc(2151) long local2151 = (local2136 << 32) + local2141;
							@Pc(2153) boolean local2153 = false;
							local1981 = 0;
							while (true) {
								if (local1981 >= 100) {
									if (local331 <= 1) {
										if (Static284.aBoolean376 && !Static161.aBoolean170 || Static160.aBoolean168) {
											local2153 = true;
										} else if (Static323.method5295(local1701)) {
											local2153 = true;
										}
									}
									break;
								}
								if (local2151 == Static19.aLongArray1[local1981]) {
									local2153 = true;
									break;
								}
								local1981++;
							}
							if (!local2153 && Static172.anInt3608 == 0) {
								Static19.aLongArray1[Static104.anInt2182] = local2151;
								Static104.anInt2182 = (Static104.anInt2182 + 1) % 100;
								@Pc(2225) String local2225 = Static339.method4906(Static237.method4025(Static340.method5564(Static20.aClass3_Sub4_Sub2_1)));
								if (local331 == 2) {
									Static232.method3992(null, local2225, "<img=1>" + local1762, -1, 7, 0, "<img=1>" + local1701);
								} else if (local331 == 1) {
									Static232.method3992(null, local2225, "<img=0>" + local1762, -1, 7, 0, "<img=0>" + local1701);
								} else {
									Static232.method3992(null, local2225, local1762, -1, 3, 0, local1701);
								}
							}
							Static92.anInt1818 = -1;
							return true;
						} else if (Static92.anInt1818 == 194) {
							local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
							local129 = Static20.aClass3_Sub4_Sub2_1.method3675();
							local133 = Static20.aClass3_Sub4_Sub2_1.method3642();
							if (Static343.method5603(local125)) {
								Static85.method1374(local129, local133);
							}
							Static92.anInt1818 = -1;
							return true;
						} else if (Static92.anInt1818 == 117) {
							local125 = Static20.aClass3_Sub4_Sub2_1.method3675();
							local129 = Static20.aClass3_Sub4_Sub2_1.method3636();
							local133 = Static20.aClass3_Sub4_Sub2_1.method3649();
							if (local133 == 65535) {
								local133 = -1;
							}
							if (Static343.method5603(local125)) {
								Static164.method5313(-1, local129, local133, 2);
							}
							Static92.anInt1818 = -1;
							return true;
						} else if (Static92.anInt1818 == 211) {
							local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
							local129 = Static20.aClass3_Sub4_Sub2_1.method3649();
							local133 = Static20.aClass3_Sub4_Sub2_1.method3638();
							local139 = Static20.aClass3_Sub4_Sub2_1.method3623();
							local161 = Static20.aClass3_Sub4_Sub2_1.method3675();
							if (Static343.method5603(local161)) {
								Static164.method5313(local125, local139, local133 << 16 | local129, 7);
							}
							Static92.anInt1818 = -1;
							return true;
						} else if (Static92.anInt1818 == 82) {
							local125 = Static20.aClass3_Sub4_Sub2_1.method3643();
							local129 = local125 >> 5;
							local133 = local125 & 0x1F;
							if (local133 == 0) {
								Static108.aClass125Array11[local129] = null;
								Static92.anInt1818 = -1;
								return true;
							}
							@Pc(2431) Class125 local2431 = new Class125();
							local2431.anInt3931 = local133;
							local2431.anInt3924 = Static20.aClass3_Sub4_Sub2_1.method3643();
							if (local2431.anInt3924 >= 0 && local2431.anInt3924 < Static6.aClass57Array23.length) {
								if (local2431.anInt3931 == 1 || local2431.anInt3931 == 10) {
									local2431.anInt3922 = Static20.aClass3_Sub4_Sub2_1.method3649();
									Static20.aClass3_Sub4_Sub2_1.anInt4268 += 5;
								} else if (local2431.anInt3931 >= 2 && local2431.anInt3931 <= 6) {
									if (local2431.anInt3931 == 2) {
										local2431.anInt3930 = 64;
										local2431.anInt3928 = 64;
									}
									if (local2431.anInt3931 == 3) {
										local2431.anInt3930 = 64;
										local2431.anInt3928 = 0;
									}
									if (local2431.anInt3931 == 4) {
										local2431.anInt3930 = 64;
										local2431.anInt3928 = 128;
									}
									if (local2431.anInt3931 == 5) {
										local2431.anInt3930 = 0;
										local2431.anInt3928 = 64;
									}
									if (local2431.anInt3931 == 6) {
										local2431.anInt3930 = 128;
										local2431.anInt3928 = 64;
									}
									local2431.anInt3931 = 2;
									local2431.anInt3929 = Static20.aClass3_Sub4_Sub2_1.method3649();
									local2431.anInt3926 = Static20.aClass3_Sub4_Sub2_1.method3649();
									local2431.anInt3927 = Static20.aClass3_Sub4_Sub2_1.method3643();
									local2431.anInt3925 = Static20.aClass3_Sub4_Sub2_1.method3649();
								}
								local2431.anInt3923 = Static20.aClass3_Sub4_Sub2_1.method3649();
								if (local2431.anInt3923 == 65535) {
									local2431.anInt3923 = -1;
								}
								Static108.aClass125Array11[local129] = local2431;
							}
							Static92.anInt1818 = -1;
							return true;
						} else if (Static92.anInt1818 == 252) {
							local125 = Static20.aClass3_Sub4_Sub2_1.method3672();
							local129 = Static20.aClass3_Sub4_Sub2_1.method3640();
							if (Static343.method5603(local129)) {
								Static172.anInt3604 = local125;
							}
							Static92.anInt1818 = -1;
							return true;
						} else if (Static92.anInt1818 == 135) {
							local1690 = Static20.aClass3_Sub4_Sub2_1.method3671();
							@Pc(2625) boolean local2625 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
							if (local2625) {
								local1762 = Static20.aClass3_Sub4_Sub2_1.method3671();
							} else {
								local1762 = local1690;
							}
							local139 = Static20.aClass3_Sub4_Sub2_1.method3649();
							@Pc(2643) byte local2643 = Static20.aClass3_Sub4_Sub2_1.method3621();
							@Pc(2645) boolean local2645 = false;
							if (local2643 == -128) {
								local2645 = true;
							}
							if (local2645) {
								if (Static170.anInt6278 == 0) {
									Static92.anInt1818 = -1;
									return true;
								}
								for (local568 = 0; Static170.anInt6278 > local568 && (!Static339.aClass116Array3[local568].aString132.equals(local1762) || Static339.aClass116Array3[local568].anInt3626 != local139); local568++) {
								}
								if (local568 < Static170.anInt6278) {
									while (Static170.anInt6278 - 1 > local568) {
										Static339.aClass116Array3[local568] = Static339.aClass116Array3[local568 + 1];
										local568++;
									}
									Static170.anInt6278--;
									Static339.aClass116Array3[Static170.anInt6278] = null;
								}
							} else {
								@Pc(2656) String local2656 = Static20.aClass3_Sub4_Sub2_1.method3671();
								local932 = new Class116();
								local932.aByte33 = local2643;
								local932.aString135 = local1690;
								local932.aString134 = local2656;
								local932.anInt3626 = local139;
								local932.aString132 = local1762;
								for (local594 = Static170.anInt6278 - 1; local594 >= 0; local594--) {
									local216 = Static339.aClass116Array3[local594].aString132.compareTo(local932.aString132);
									if (local216 == 0) {
										Static339.aClass116Array3[local594].anInt3626 = local139;
										Static339.aClass116Array3[local594].aByte33 = local2643;
										Static339.aClass116Array3[local594].aString134 = local2656;
										if (local1762.equals(Static349.aClass5_Sub4_Sub4_Sub1_2.aString126)) {
											Static330.aByte74 = local2643;
										}
										Static9.anInt240 = Static293.anInt6247;
										Static92.anInt1818 = -1;
										return true;
									}
									if (local216 < 0) {
										break;
									}
								}
								if (Static339.aClass116Array3.length <= Static170.anInt6278) {
									Static92.anInt1818 = -1;
									return true;
								}
								for (local216 = Static170.anInt6278 - 1; local216 > local594; local216--) {
									Static339.aClass116Array3[local216 + 1] = Static339.aClass116Array3[local216];
								}
								if (Static170.anInt6278 == 0) {
									Static339.aClass116Array3 = new Class116[100];
								}
								Static339.aClass116Array3[local594 + 1] = local932;
								Static170.anInt6278++;
								if (local1762.equals(Static349.aClass5_Sub4_Sub4_Sub1_2.aString126)) {
									Static330.aByte74 = local2643;
								}
							}
							Static92.anInt1818 = -1;
							Static9.anInt240 = Static293.anInt6247;
							return true;
						} else if (Static92.anInt1818 == 255) {
							for (local125 = 0; local125 < Static38.anIntArray55.length; local125++) {
								if (Static38.anIntArray55[local125] != Static288.anIntArray471[local125]) {
									Static38.anIntArray55[local125] = Static288.anIntArray471[local125];
									Static231.method3988(local125);
									Static54.anIntArray71[Static345.anInt6709++ & 0x1F] = local125;
								}
							}
							Static92.anInt1818 = -1;
							return true;
						} else if (Static92.anInt1818 == 68) {
							local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
							local129 = Static20.aClass3_Sub4_Sub2_1.method3643();
							local133 = Static20.aClass3_Sub4_Sub2_1.method3643();
							local139 = Static20.aClass3_Sub4_Sub2_1.method3649();
							local161 = Static20.aClass3_Sub4_Sub2_1.method3643();
							local561 = Static20.aClass3_Sub4_Sub2_1.method3643();
							if (Static343.method5603(local125)) {
								Static26.method562(local161, local133, local561, local139, local129);
							}
							Static92.anInt1818 = -1;
							return true;
						} else if (Static92.anInt1818 == 189) {
							local779 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
							local1762 = Static20.aClass3_Sub4_Sub2_1.method3671();
							local1701 = local1762;
							if (local779) {
								local1701 = Static20.aClass3_Sub4_Sub2_1.method3671();
							}
							local2136 = Static20.aClass3_Sub4_Sub2_1.method3649();
							local2141 = Static20.aClass3_Sub4_Sub2_1.method3659();
							local331 = Static20.aClass3_Sub4_Sub2_1.method3643();
							local594 = Static20.aClass3_Sub4_Sub2_1.method3649();
							@Pc(3007) long local3007 = (local2136 << 32) + local2141;
							@Pc(3009) boolean local3009 = false;
							@Pc(3011) int local3011 = 0;
							while (true) {
								if (local3011 >= 100) {
									if (local331 <= 1 && Static323.method5295(local1701)) {
										local3009 = true;
									}
									break;
								}
								if (Static19.aLongArray1[local3011] == local3007) {
									local3009 = true;
									break;
								}
								local3011++;
							}
							if (!local3009 && Static172.anInt3608 == 0) {
								Static19.aLongArray1[Static104.anInt2182] = local3007;
								Static104.anInt2182 = (Static104.anInt2182 + 1) % 100;
								local1999 = Static7.method151(local594).method2266(Static20.aClass3_Sub4_Sub2_1);
								if (local331 == 2) {
									Static232.method3992(null, local1999, "<img=1>" + local1762, local594, 18, 0, "<img=1>" + local1701);
								} else if (local331 == 1) {
									Static232.method3992(null, local1999, "<img=0>" + local1762, local594, 18, 0, "<img=0>" + local1701);
								} else {
									Static232.method3992(null, local1999, local1762, local594, 18, 0, local1701);
								}
							}
							Static92.anInt1818 = -1;
							return true;
						} else if (Static92.anInt1818 == 12) {
							Static191.anInt3980 = Static20.aClass3_Sub4_Sub2_1.method3672();
							Static290.anInt5806 = Static20.aClass3_Sub4_Sub2_1.method3617();
							Static92.anInt1818 = -1;
							return true;
						} else {
							@Pc(3185) Class3_Sub32 local3185;
							if (Static92.anInt1818 == 174) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3636();
								local129 = Static20.aClass3_Sub4_Sub2_1.method3636();
								local133 = Static20.aClass3_Sub4_Sub2_1.method3675();
								if (Static343.method5603(local133)) {
									@Pc(3178) Class3_Sub32 local3178 = (Class3_Sub32) Static188.aClass24_21.method609((long) local129);
									local3185 = (Class3_Sub32) Static188.aClass24_21.method609((long) local125);
									if (local3185 != null) {
										Static42.method732(local3185, local3178 == null || local3185.anInt4348 != local3178.anInt4348, false);
									}
									if (local3178 != null) {
										local3178.method5717();
										Static188.aClass24_21.method598((long) local125, local3178);
									}
									@Pc(3220) Class181 local3220 = Static20.method415(local129);
									if (local3220 != null) {
										Static316.method5250(local3220);
									}
									local3220 = Static20.method415(local125);
									if (local3220 != null) {
										Static316.method5250(local3220);
										Static140.method2299(true, local3220);
									}
									if (Static191.anInt3991 != -1) {
										Static82.method1278(Static191.anInt3991, 1);
									}
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 154) {
								Static58.method957();
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 76) {
								Static330.anInt6398 = Static20.aClass3_Sub4_Sub2_1.method3643();
								Static92.anInt1818 = -1;
								Static294.anInt6362 = Static293.anInt6247;
								return true;
							} else if (Static92.anInt1818 == 78) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
								local1762 = Static20.aClass3_Sub4_Sub2_1.method3671();
								@Pc(3292) Object[] local3292 = new Object[local1762.length() + 1];
								for (local139 = local1762.length() - 1; local139 >= 0; local139--) {
									if (local1762.charAt(local139) == 's') {
										local3292[local139 + 1] = Static20.aClass3_Sub4_Sub2_1.method3671();
									} else {
										local3292[local139 + 1] = Integer.valueOf(Static20.aClass3_Sub4_Sub2_1.method3642());
									}
								}
								local3292[0] = Integer.valueOf(Static20.aClass3_Sub4_Sub2_1.method3642());
								if (Static343.method5603(local125)) {
									@Pc(3347) Class3_Sub41 local3347 = new Class3_Sub41();
									local3347.anObjectArray34 = local3292;
									Static139.method2275(local3347);
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 126) {
								Static20.aClass3_Sub4_Sub2_1.anInt4268 += 28;
								if (Static20.aClass3_Sub4_Sub2_1.method3653()) {
									Static13.method236(Static20.aClass3_Sub4_Sub2_1, Static20.aClass3_Sub4_Sub2_1.anInt4268 - 28);
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 1) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
								Static172.method2854(local125);
								Static92.anIntArray104[Static295.anInt5871++ & 0x1F] = local125 & 0x7FFF;
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 219) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
								local129 = Static20.aClass3_Sub4_Sub2_1.method3643();
								local133 = Static20.aClass3_Sub4_Sub2_1.method3643();
								local139 = Static20.aClass3_Sub4_Sub2_1.method3649();
								local161 = Static20.aClass3_Sub4_Sub2_1.method3643();
								local561 = Static20.aClass3_Sub4_Sub2_1.method3643();
								if (Static343.method5603(local125)) {
									Static240.method4142(local129, true, local161, local561, local133, local139);
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 207) {
								Static277.anInt5542 = Static20.aClass3_Sub4_Sub2_1.method3643();
								for (local125 = 0; local125 < Static277.anInt5542; local125++) {
									Static152.aStringArray21[local125] = Static20.aClass3_Sub4_Sub2_1.method3671();
									Static350.aStringArray43[local125] = Static20.aClass3_Sub4_Sub2_1.method3671();
									if (Static350.aStringArray43[local125].equals("")) {
										Static350.aStringArray43[local125] = Static152.aStringArray21[local125];
									}
									Static253.aStringArray31[local125] = Static20.aClass3_Sub4_Sub2_1.method3671();
									Static223.aStringArray25[local125] = Static20.aClass3_Sub4_Sub2_1.method3671();
									if (Static223.aStringArray25[local125].equals("")) {
										Static223.aStringArray25[local125] = Static253.aStringArray31[local125];
									}
									Static312.aBooleanArray29[local125] = false;
								}
								Static294.anInt6362 = Static293.anInt6247;
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 112) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
								local129 = Static20.aClass3_Sub4_Sub2_1.method3643();
								Static67.method1065(local125, local129);
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 253) {
								Static63.method1016();
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 95) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3623();
								Static80.aClass207_6 = Static353.aClass42_5.method973(local125);
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 228) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3675();
								local1762 = Static20.aClass3_Sub4_Sub2_1.method3671();
								local133 = Static20.aClass3_Sub4_Sub2_1.method3638();
								if (Static343.method5603(local125)) {
									Static38.method678(local133, local1762);
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 214) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3675();
								local129 = Static20.aClass3_Sub4_Sub2_1.method3649();
								local133 = Static20.aClass3_Sub4_Sub2_1.method3623();
								if (Static343.method5603(local129)) {
									Static30.method604(local133, local125);
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 222) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3675();
								local129 = Static20.aClass3_Sub4_Sub2_1.method3675();
								local133 = Static20.aClass3_Sub4_Sub2_1.method3617();
								if (Static343.method5603(local129)) {
									if (local133 == 2) {
										Static89.method5621();
									}
									Static191.anInt3991 = local125;
									Static38.method679(local125);
									Static30.method596(false);
									Static139.method2274(Static191.anInt3991);
									for (local139 = 0; local139 < 100; local139++) {
										Static159.aBooleanArray13[local139] = true;
									}
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 51) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3648();
								local129 = Static20.aClass3_Sub4_Sub2_1.method3649();
								if (local129 == 65535) {
									local129 = -1;
								}
								Static129.method2218(local125, local129);
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 187) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3638();
								if (local125 == 65535) {
									local125 = -1;
								}
								local129 = Static20.aClass3_Sub4_Sub2_1.method3659();
								local133 = Static20.aClass3_Sub4_Sub2_1.method3643();
								Static67.method1067(local133, local125, local129);
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 166) {
								if (Static306.anInt6046 == 0) {
									Static340.aString251 = Static264.aString189;
								} else {
									Static340.aString251 = Static20.aClass3_Sub4_Sub2_1.method3671();
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 142) {
								local1690 = Static20.aClass3_Sub4_Sub2_1.method3671();
								local129 = Static20.aClass3_Sub4_Sub2_1.method3649();
								local133 = Static20.aClass3_Sub4_Sub2_1.method3623();
								if (Static343.method5603(local129)) {
									Static32.method623(local133, local1690);
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 66) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
								local129 = Static20.aClass3_Sub4_Sub2_1.method3643();
								local133 = Static20.aClass3_Sub4_Sub2_1.method3643();
								local139 = Static20.aClass3_Sub4_Sub2_1.method3643();
								local161 = Static20.aClass3_Sub4_Sub2_1.method3643();
								local561 = Static20.aClass3_Sub4_Sub2_1.method3649();
								if (Static343.method5603(local125)) {
									Static80.aBooleanArray7[local129] = true;
									Static180.anIntArray265[local129] = local133;
									Static97.anIntArray121[local129] = local139;
									Static200.anIntArray343[local129] = local161;
									Static27.anIntArray35[local129] = local561;
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 41) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3675();
								local129 = Static20.aClass3_Sub4_Sub2_1.method3666();
								if (Static343.method5603(local125)) {
									Static164.method5313(0, local129, 2047, 5);
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 128) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3638();
								local129 = Static20.aClass3_Sub4_Sub2_1.method3636();
								if (Static343.method5603(local125)) {
									Static164.method5313(-1, local129, -1, 3);
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 243) {
								Static102.method1721();
								Static56.method929();
								Static92.anInt1818 = -1;
								Static345.anInt6709 += 32;
								return true;
							} else if (Static92.anInt1818 == 130) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3674();
								local129 = Static20.aClass3_Sub4_Sub2_1.method3666();
								local133 = Static20.aClass3_Sub4_Sub2_1.method3675();
								local139 = Static20.aClass3_Sub4_Sub2_1.method3629();
								if (Static343.method5603(local133)) {
									Static98.method1679(local139, local125, local129);
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 105) {
								Static290.anInt5806 = Static20.aClass3_Sub4_Sub2_1.method3648();
								Static191.anInt3980 = Static20.aClass3_Sub4_Sub2_1.method3643();
								for (@Pc(3995) Class3_Sub40 local3995 = (Class3_Sub40) Static128.aClass24_18.method595(); local3995 != null; local3995 = (Class3_Sub40) Static128.aClass24_18.method602()) {
									local129 = (int) (local3995.aLong211 & 0x3FFFL);
									local133 = (int) (local3995.aLong211 >> 14 & 0x3FFFL);
									local139 = (int) (local3995.aLong211 >> 28 & 0x3L);
									if (Static163.anInt3184 == local139 && Static290.anInt5806 <= local129 && local129 < Static290.anInt5806 + 8 && local133 >= Static191.anInt3980 && Static191.anInt3980 + 8 > local133) {
										local3995.method5717();
										Static301.method5085(Static163.anInt3184, local129, local133);
									}
								}
								for (@Pc(4070) Class3_Sub42 local4070 = (Class3_Sub42) Static83.aClass127_3.method3402(); local4070 != null; local4070 = (Class3_Sub42) Static83.aClass127_3.method3400()) {
									if (local4070.anInt6544 >= Static290.anInt5806 && Static290.anInt5806 + 8 > local4070.anInt6544 && Static191.anInt3980 <= local4070.anInt6546 && Static191.anInt3980 + 8 > local4070.anInt6546 && Static163.anInt3184 == local4070.anInt6538) {
										local4070.anInt6536 = 0;
									}
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 20) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3642();
								local129 = Static20.aClass3_Sub4_Sub2_1.method3640();
								local133 = Static20.aClass3_Sub4_Sub2_1.method3640();
								local139 = Static20.aClass3_Sub4_Sub2_1.method3675();
								if (Static343.method5603(local139)) {
									Static197.method3456(local129 + (local133 << 16), local125);
								}
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 145) {
								@Pc(4178) byte local4178 = Static20.aClass3_Sub4_Sub2_1.method3619();
								local129 = Static20.aClass3_Sub4_Sub2_1.method3675();
								Static305.method5099(local129, local4178);
								Static92.anInt1818 = -1;
								return true;
							} else if (Static92.anInt1818 == 217) {
								local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
								if (Static343.method5603(local125)) {
									Static116.method2028();
								}
								Static92.anInt1818 = -1;
								return true;
							} else {
								@Pc(4251) long local4251;
								if (Static92.anInt1818 == 221) {
									local779 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
									local1762 = Static20.aClass3_Sub4_Sub2_1.method3671();
									local1701 = local1762;
									if (local779) {
										local1701 = Static20.aClass3_Sub4_Sub2_1.method3671();
									}
									local2136 = Static20.aClass3_Sub4_Sub2_1.method3641();
									local2141 = Static20.aClass3_Sub4_Sub2_1.method3649();
									local4251 = Static20.aClass3_Sub4_Sub2_1.method3659();
									local216 = Static20.aClass3_Sub4_Sub2_1.method3643();
									@Pc(4262) long local4262 = (local2141 << 32) + local4251;
									@Pc(4264) boolean local4264 = false;
									@Pc(4266) int local4266 = 0;
									while (true) {
										if (local4266 >= 100) {
											if (local216 <= 1) {
												if (Static284.aBoolean376 && !Static161.aBoolean170 || Static160.aBoolean168) {
													local4264 = true;
												} else if (Static323.method5295(local1701)) {
													local4264 = true;
												}
											}
											break;
										}
										if (local4262 == Static19.aLongArray1[local4266]) {
											local4264 = true;
											break;
										}
										local4266++;
									}
									if (!local4264 && Static172.anInt3608 == 0) {
										Static19.aLongArray1[Static104.anInt2182] = local4262;
										Static104.anInt2182 = (Static104.anInt2182 + 1) % 100;
										local2017 = Static339.method4906(Static237.method4025(Static340.method5564(Static20.aClass3_Sub4_Sub2_1)));
										if (local216 == 2 || local216 == 3) {
											Static232.method3992(Static232.method3990(local2136), local2017, "<img=1>" + local1762, -1, 9, 0, "<img=1>" + local1701);
										} else if (local216 == 1) {
											Static232.method3992(Static232.method3990(local2136), local2017, "<img=0>" + local1762, -1, 9, 0, "<img=0>" + local1701);
										} else {
											Static232.method3992(Static232.method3990(local2136), local2017, local1762, -1, 9, 0, local1701);
										}
									}
									Static92.anInt1818 = -1;
									return true;
								} else if (Static92.anInt1818 == 206) {
									local125 = Static20.aClass3_Sub4_Sub2_1.method3666();
									local129 = Static20.aClass3_Sub4_Sub2_1.method3640();
									Static67.method1065(local129, local125);
									Static92.anInt1818 = -1;
									return true;
								} else if (Static92.anInt1818 == 104) {
									local125 = Static20.aClass3_Sub4_Sub2_1.method3670();
									local129 = Static20.aClass3_Sub4_Sub2_1.method3649();
									local133 = Static20.aClass3_Sub4_Sub2_1.method3636();
									if (Static343.method5603(local129)) {
										Static11.method173(local133, local125);
									}
									Static92.anInt1818 = -1;
									return true;
								} else if (Static92.anInt1818 == 175) {
									local125 = Static20.aClass3_Sub4_Sub2_1.method3643();
									@Pc(4475) boolean local4475 = (local125 & 0x1) == 1;
									local1701 = Static20.aClass3_Sub4_Sub2_1.method3671();
									local678 = Static20.aClass3_Sub4_Sub2_1.method3671();
									local680 = Static20.aClass3_Sub4_Sub2_1.method3671();
									local710 = Static20.aClass3_Sub4_Sub2_1.method3671();
									if (local4475) {
										for (local568 = 0; local568 < Static277.anInt5542; local568++) {
											if (Static350.aStringArray43[local568].equals(local710)) {
												Static152.aStringArray21[local568] = local1701;
												if (local678.equals("")) {
													Static350.aStringArray43[local568] = local1701;
												} else {
													Static350.aStringArray43[local568] = local678;
												}
												Static253.aStringArray31[local568] = local680;
												if (local710.equals("")) {
													Static223.aStringArray25[local568] = local680;
												} else {
													Static223.aStringArray25[local568] = local710;
												}
												break;
											}
										}
									} else {
										Static152.aStringArray21[Static277.anInt5542] = local1701;
										if (local678.equals("")) {
											Static350.aStringArray43[Static277.anInt5542] = local1701;
										} else {
											Static350.aStringArray43[Static277.anInt5542] = local678;
										}
										Static253.aStringArray31[Static277.anInt5542] = local680;
										if (local710.equals("")) {
											Static223.aStringArray25[Static277.anInt5542] = local680;
										} else {
											Static223.aStringArray25[Static277.anInt5542] = local710;
										}
										Static312.aBooleanArray29[Static277.anInt5542] = (local125 & 0x2) == 2;
										Static277.anInt5542++;
									}
									Static92.anInt1818 = -1;
									Static294.anInt6362 = Static293.anInt6247;
									return true;
								} else if (Static92.anInt1818 == 48) {
									local125 = Static20.aClass3_Sub4_Sub2_1.method3638();
									local129 = Static20.aClass3_Sub4_Sub2_1.method3642();
									Static305.method5099(local125, local129);
									Static92.anInt1818 = -1;
									return true;
								} else if (Static92.anInt1818 == 168) {
									for (local125 = 0; local125 < Static254.aClass5_Sub4_Sub4_Sub1Array1.length; local125++) {
										if (Static254.aClass5_Sub4_Sub4_Sub1Array1[local125] != null) {
											Static254.aClass5_Sub4_Sub4_Sub1Array1[local125].anInt4915 = -1;
										}
									}
									for (local129 = 0; local129 < Static244.aClass5_Sub4_Sub4_Sub2Array1.length; local129++) {
										if (Static244.aClass5_Sub4_Sub4_Sub2Array1[local129] != null) {
											Static244.aClass5_Sub4_Sub4_Sub2Array1[local129].anInt4915 = -1;
										}
									}
									Static92.anInt1818 = -1;
									return true;
								} else {
									@Pc(4709) Class181 local4709;
									if (Static92.anInt1818 == 118) {
										local125 = Static20.aClass3_Sub4_Sub2_1.method3642();
										local129 = Static20.aClass3_Sub4_Sub2_1.method3649();
										if (local125 < -70000) {
											local129 += 32768;
										}
										if (local125 < 0) {
											local4709 = null;
										} else {
											local4709 = Static20.method415(local125);
										}
										if (local4709 != null) {
											for (local139 = 0; local139 < local4709.anIntArray469.length; local139++) {
												local4709.anIntArray469[local139] = 0;
												local4709.anIntArray456[local139] = 0;
											}
										}
										Static223.method3897(local129);
										local139 = Static20.aClass3_Sub4_Sub2_1.method3649();
										for (local161 = 0; local161 < local139; local161++) {
											local561 = Static20.aClass3_Sub4_Sub2_1.method3648();
											if (local561 == 255) {
												local561 = Static20.aClass3_Sub4_Sub2_1.method3666();
											}
											local568 = Static20.aClass3_Sub4_Sub2_1.method3638();
											if (local4709 != null && local4709.anIntArray469.length > local161) {
												local4709.anIntArray469[local161] = local568;
												local4709.anIntArray456[local161] = local561;
											}
											Static197.method3455(local561, local129, local568 - 1, local161);
										}
										if (local4709 != null) {
											Static316.method5250(local4709);
										}
										Static56.method929();
										Static92.anIntArray104[Static295.anInt5871++ & 0x1F] = local129 & 0x7FFF;
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 180) {
										local125 = Static20.aClass3_Sub4_Sub2_1.method3640();
										local1762 = Static20.aClass3_Sub4_Sub2_1.method3671();
										local133 = Static20.aClass3_Sub4_Sub2_1.method3649();
										if (Static343.method5603(local133)) {
											Static38.method678(local125, local1762);
										}
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 47) {
										local779 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
										local1762 = Static20.aClass3_Sub4_Sub2_1.method3671();
										local1701 = local1762;
										if (local779) {
											local1701 = Static20.aClass3_Sub4_Sub2_1.method3671();
										}
										local2136 = Static20.aClass3_Sub4_Sub2_1.method3641();
										local2141 = Static20.aClass3_Sub4_Sub2_1.method3649();
										local4251 = Static20.aClass3_Sub4_Sub2_1.method3659();
										local216 = Static20.aClass3_Sub4_Sub2_1.method3643();
										local1945 = Static20.aClass3_Sub4_Sub2_1.method3649();
										@Pc(4908) long local4908 = local4251 + (local2141 << 32);
										@Pc(4910) boolean local4910 = false;
										@Pc(4912) int local4912 = 0;
										while (true) {
											if (local4912 >= 100) {
												if (local216 <= 1 && Static323.method5295(local1701)) {
													local4910 = true;
												}
												break;
											}
											if (local4908 == Static19.aLongArray1[local4912]) {
												local4910 = true;
												break;
											}
											local4912++;
										}
										if (!local4910 && Static172.anInt3608 == 0) {
											Static19.aLongArray1[Static104.anInt2182] = local4908;
											Static104.anInt2182 = (Static104.anInt2182 + 1) % 100;
											local2035 = Static7.method151(local1945).method2266(Static20.aClass3_Sub4_Sub2_1);
											if (local216 == 2) {
												Static232.method3992(Static232.method3990(local2136), local2035, "<img=1>" + local1762, local1945, 20, 0, "<img=1>" + local1701);
											} else if (local216 == 1) {
												Static232.method3992(Static232.method3990(local2136), local2035, "<img=0>" + local1762, local1945, 20, 0, "<img=0>" + local1701);
											} else {
												Static232.method3992(Static232.method3990(local2136), local2035, local1762, local1945, 20, 0, local1701);
											}
										}
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 205) {
										Static191.anInt3980 = Static20.aClass3_Sub4_Sub2_1.method3672();
										Static290.anInt5806 = Static20.aClass3_Sub4_Sub2_1.method3672();
										while (Static306.anInt6046 > Static20.aClass3_Sub4_Sub2_1.anInt4268) {
											Static92.anInt1818 = Static20.aClass3_Sub4_Sub2_1.method3643();
											Static135.method2254();
										}
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 9) {
										local125 = Static20.aClass3_Sub4_Sub2_1.method3636();
										local129 = local125 >> 28 & 0x3;
										local133 = local125 >> 14 & 0x3FFF;
										local139 = local125 & 0x3FFF;
										local161 = Static20.aClass3_Sub4_Sub2_1.method3648();
										local561 = local161 >> 2;
										local568 = local161 & 0x3;
										local331 = Static247.anIntArray402[local561];
										local594 = Static20.aClass3_Sub4_Sub2_1.method3649();
										local133 -= Static186.anInt3094;
										if (local594 == 65535) {
											local594 = -1;
										}
										local139 -= Static296.anInt5889;
										Static38.method677(local331, local129, local568, local594, local133, local561, local139);
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 10) {
										Static251.anInt4974 = Static20.aClass3_Sub4_Sub2_1.method3643();
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 141) {
										local125 = Static20.aClass3_Sub4_Sub2_1.method3642();
										local129 = Static20.aClass3_Sub4_Sub2_1.method3649();
										if (local125 < -70000) {
											local129 += 32768;
										}
										if (local125 >= 0) {
											local4709 = Static20.method415(local125);
										} else {
											local4709 = null;
										}
										while (Static20.aClass3_Sub4_Sub2_1.anInt4268 < Static306.anInt6046) {
											local139 = Static20.aClass3_Sub4_Sub2_1.method3633();
											local161 = Static20.aClass3_Sub4_Sub2_1.method3649();
											local561 = 0;
											if (local161 != 0) {
												local561 = Static20.aClass3_Sub4_Sub2_1.method3643();
												if (local561 == 255) {
													local561 = Static20.aClass3_Sub4_Sub2_1.method3642();
												}
											}
											if (local4709 != null && local139 >= 0 && local139 < local4709.anIntArray469.length) {
												local4709.anIntArray469[local139] = local161;
												local4709.anIntArray456[local139] = local561;
											}
											Static197.method3455(local561, local129, local161 - 1, local139);
										}
										if (local4709 != null) {
											Static316.method5250(local4709);
										}
										Static56.method929();
										Static92.anIntArray104[Static295.anInt5871++ & 0x1F] = local129 & 0x7FFF;
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 3) {
										Static56.method929();
										local125 = Static20.aClass3_Sub4_Sub2_1.method3623();
										local129 = Static20.aClass3_Sub4_Sub2_1.method3648();
										local133 = Static20.aClass3_Sub4_Sub2_1.method3672();
										Static38.anIntArray54[local129] = local125;
										Static334.anIntArray541[local129] = local133;
										Static107.anIntArray133[local129] = 1;
										local139 = Static260.anIntArray419[local129] - 1;
										for (local161 = 0; local161 < local139; local161++) {
											if (local125 >= Class3_Sub18.anIntArray103[local161]) {
												Static107.anIntArray133[local129] = local161 + 2;
											}
										}
										Static290.anIntArray475[Static132.anInt2758++ & 0x1F] = local129;
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 98) {
										local1690 = Static20.aClass3_Sub4_Sub2_1.method3671();
										local129 = Static20.aClass3_Sub4_Sub2_1.method3672();
										local133 = Static20.aClass3_Sub4_Sub2_1.method3675();
										if (local133 == 65535) {
											local133 = -1;
										}
										local139 = Static20.aClass3_Sub4_Sub2_1.method3617();
										if (local129 >= 1 && local129 <= 8) {
											if (local1690.equalsIgnoreCase("null")) {
												local1690 = null;
											}
											Static277.aStringArray36[local129 - 1] = local1690;
											Static340.anIntArray554[local129 - 1] = local133;
											Static33.aBooleanArray3[local129 - 1] = local139 == 0;
										}
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 149) {
										Static1.anInt8 = Static20.aClass3_Sub4_Sub2_1.method3675() * 30;
										Static316.anInt6202 = Static293.anInt6247;
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 213) {
										local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
										local129 = Static20.aClass3_Sub4_Sub2_1.method3642();
										if (Static343.method5603(local125)) {
											@Pc(5464) Class3_Sub32 local5464 = (Class3_Sub32) Static188.aClass24_21.method609((long) local129);
											if (local5464 != null) {
												Static42.method732(local5464, true, false);
											}
											if (Static346.aClass181_57 != null) {
												Static316.method5250(Static346.aClass181_57);
												Static346.aClass181_57 = null;
											}
										}
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 163) {
										local125 = Static20.aClass3_Sub4_Sub2_1.method3649();
										local129 = Static20.aClass3_Sub4_Sub2_1.method3649();
										local133 = Static20.aClass3_Sub4_Sub2_1.method3649();
										local139 = Static20.aClass3_Sub4_Sub2_1.method3649();
										if (Static343.method5603(local125) && Static311.aClass181ArrayArray1[local129] != null) {
											for (local161 = local133; local161 < local139; local161++) {
												local561 = Static20.aClass3_Sub4_Sub2_1.method3659();
												if (Static311.aClass181ArrayArray1[local129].length > local161 && Static311.aClass181ArrayArray1[local129][local161] != null) {
													Static311.aClass181ArrayArray1[local129][local161].anInt5722 = local561;
												}
											}
										}
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 57) {
										local125 = Static20.aClass3_Sub4_Sub2_1.method3617();
										local129 = Static20.aClass3_Sub4_Sub2_1.method3649();
										local133 = Static20.aClass3_Sub4_Sub2_1.method3623();
										local139 = Static20.aClass3_Sub4_Sub2_1.method3638();
										if (Static343.method5603(local129)) {
											local3185 = (Class3_Sub32) Static188.aClass24_21.method609((long) local133);
											if (local3185 != null) {
												Static42.method732(local3185, local3185.anInt4348 != local139, false);
											}
											Static330.method5421(false, local125, local133, local139);
										}
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 86) {
										local125 = Static20.aClass3_Sub4_Sub2_1.method3617();
										local129 = Static20.aClass3_Sub4_Sub2_1.method3648();
										local133 = Static20.aClass3_Sub4_Sub2_1.method3643();
										Static163.anInt3184 = local125 >> 1;
										Static349.aClass5_Sub4_Sub4_Sub1_2.method2675(local129, local133, Static163.anInt3184, (local125 & 0x1) == 1);
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 125) {
										Static329.method5376(false);
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 115) {
										local125 = Static20.aClass3_Sub4_Sub2_1.method3642();
										local129 = Static20.aClass3_Sub4_Sub2_1.method3649();
										local133 = Static20.aClass3_Sub4_Sub2_1.method3640();
										if (Static343.method5603(local129)) {
											Static256.method4298(local133, local125);
										}
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 197) {
										Static344.anInt6696 = Static20.aClass3_Sub4_Sub2_1.method3643();
										Static272.anInt5453 = Static20.aClass3_Sub4_Sub2_1.method3643();
										Static283.anInt4482 = Static20.aClass3_Sub4_Sub2_1.method3643();
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 251) {
										Static56.method929();
										Static338.anInt6576 = Static20.aClass3_Sub4_Sub2_1.method3643();
										Static92.anInt1818 = -1;
										Static316.anInt6202 = Static293.anInt6247;
										return true;
									} else if (Static92.anInt1818 == 173) {
										local125 = Static20.aClass3_Sub4_Sub2_1.method3666();
										local129 = Static20.aClass3_Sub4_Sub2_1.method3636();
										local133 = Static20.aClass3_Sub4_Sub2_1.method3675();
										local139 = Static20.aClass3_Sub4_Sub2_1.method3640();
										if (local139 == 65535) {
											local139 = -1;
										}
										if (Static343.method5603(local133)) {
											@Pc(5774) Class181 local5774 = Static20.method415(local129);
											@Pc(5793) Class41 local5793;
											if (local5774.aBoolean381) {
												Static178.method2916(local125, local139, local129);
												local5793 = Static230.method5537(local139);
												Static78.method1187(local5793.anInt1223, local129, local5793.anInt1184, local5793.anInt1235);
												Static222.method3877(local129, local5793.anInt1195, local5793.anInt1186, local5793.anInt1192);
											} else if (local139 == -1) {
												local5774.anInt5706 = 0;
												Static92.anInt1818 = -1;
												return true;
											} else {
												local5793 = Static230.method5537(local139);
												local5774.anInt5706 = 4;
												local5774.anInt5762 = local139;
												local5774.anInt5712 = local5793.anInt1235;
												local5774.anInt5700 = local5793.anInt1223 * 100 / local125;
												local5774.anInt5745 = local5793.anInt1184;
												Static316.method5250(local5774);
											}
										}
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 103) {
										Static329.method5376(true);
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 54) {
										Static219.method3809(Static20.aClass3_Sub4_Sub2_1.method3671());
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 120) {
										local1690 = Static20.aClass3_Sub4_Sub2_1.method3671();
										local1762 = Static339.method4906(Static237.method4025(Static340.method5564(Static20.aClass3_Sub4_Sub2_1)));
										Static306.method5148(0, 6, local1762, local1690, local1690);
										Static92.anInt1818 = -1;
										return true;
									} else if (Static92.anInt1818 == 220) {
										if (Static67.aFrame1 != null) {
											Static85.method1382(false, Static37.anInt6452, -1, -1);
										}
										@Pc(5913) byte[] local5913 = new byte[Static306.anInt6046];
										Static20.aClass3_Sub4_Sub2_1.method3676(local5913, Static306.anInt6046);
										local1762 = Static149.method2424(0, local5913, Static306.anInt6046);
										Static93.method1569(Static352.anInt6827 == 1, Static353.aClass42_5, local1762, true);
										Static92.anInt1818 = -1;
										return true;
									} else {
										Static69.method1091("T1 - " + Static92.anInt1818 + "," + Static307.anInt6101 + "," + Static170.anInt6276 + " - " + Static306.anInt6046, null);
										Static251.method4218();
										return true;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZLclient!tj;)V")
	public static void method1130(@OriginalArg(1) Class122 arg0) {
		@Pc(7) int local7 = Static277.anInt5536;
		@Pc(9) int local9 = Static86.anInt4285;
		@Pc(11) int local11 = Static260.anInt5197;
		@Pc(13) int local13 = Static257.anInt5150;
		arg0.method4801(local13, local7, local9, local11, -10660793);
		arg0.method4801(16, local7 + 1, local9 + 1, local11 - 2, -16777216);
		arg0.method4719(local9 + 18, -16777216, local7 - -1, local11 - 2, local13 + -19);
		Static243.aClass120_6.method5528(Static334.aString244, -1, local9 + 14, -10660793, local7 + 3);
		@Pc(71) int local71 = Static192.anInt4000;
		@Pc(73) int local73 = Static221.anInt4562;
		@Pc(75) int local75 = 0;
		for (@Pc(80) Class3_Sub26 local80 = (Class3_Sub26) Static116.aClass127_12.method3402(); local80 != null; local80 = (Class3_Sub26) Static116.aClass127_12.method3400()) {
			@Pc(95) int local95 = (Static170.anInt6279 - local75 - 1) * 16 + local9 + 31;
			@Pc(97) short local97 = -1;
			if (local7 < local71 && local7 + local11 > local71 && local73 > local95 - 13 && local73 < local95 + 3) {
				local97 = -256;
			}
			@Pc(135) int[] local135 = null;
			if (Static128.method2209(local80.anInt2734)) {
				local135 = Static230.method5537((int) local80.aLong100).anIntArray79;
			} else if (Static72.method1116(local80.anInt2734)) {
				@Pc(180) Class5_Sub4_Sub4_Sub2 local180 = Static244.aClass5_Sub4_Sub4_Sub2Array1[(int) local80.aLong100];
				if (local180 != null) {
					local135 = local180.aClass119_1.anIntArray249;
				}
			} else if (Static85.method1379(local80.anInt2734)) {
				if (local80.anInt2734 == 1011) {
					local135 = Static268.method4553((int) local80.aLong100).anIntArray422;
				} else {
					local135 = Static268.method4553((int) (local80.aLong100 >>> 32 & 0x7FFFFFFFL)).anIntArray422;
				}
			}
			@Pc(198) String local198 = Static23.method436(local80);
			if (local135 != null) {
				local198 = local198 + Static48.method840(local135);
			}
			Static243.aClass120_6.method5524(local7 + 3, Static327.anIntArray527, 0, local97, Static274.aClass57Array22, local95, local198);
			local75++;
		}
		Static314.method5233(Static260.anInt5197, Static86.anInt4285, Static277.anInt5536, Static257.anInt5150);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public static void method1133() {
		for (@Pc(11) Class8_Sub5 local11 = (Class8_Sub5) Static223.aClass65_7.method1462(); local11 != null; local11 = (Class8_Sub5) Static223.aClass65_7.method1461()) {
			local11.method3579();
		}
	}
}
