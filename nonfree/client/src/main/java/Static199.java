import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!go", name = "r", descriptor = "I")
	public static int anInt3224;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "Lclient!go;")
	public static final Class137 aClass137_1 = new Class137(0, 3, Static314.aClass206_16);

	@OriginalMember(owner = "client!go", name = "j", descriptor = "Lclient!go;")
	public static final Class137 aClass137_2 = new Class137(1, 3, Static314.aClass206_16);

	@OriginalMember(owner = "client!go", name = "k", descriptor = "Lclient!go;")
	public static final Class137 aClass137_3 = new Class137(2, 4, Static314.aClass206_12);

	@OriginalMember(owner = "client!go", name = "l", descriptor = "Lclient!go;")
	public static final Class137 aClass137_4 = new Class137(3, 1, Static314.aClass206_16);

	@OriginalMember(owner = "client!go", name = "m", descriptor = "Lclient!go;")
	public static final Class137 aClass137_5 = new Class137(4, 2, Static314.aClass206_16);

	@OriginalMember(owner = "client!go", name = "n", descriptor = "Lclient!go;")
	public static final Class137 aClass137_6 = new Class137(5, 3, Static314.aClass206_16);

	@OriginalMember(owner = "client!go", name = "o", descriptor = "Lclient!go;")
	public static final Class137 aClass137_7 = new Class137(6, 4, Static314.aClass206_16);

	@OriginalMember(owner = "client!go", name = "p", descriptor = "I")
	public static final int anInt3223 = Static187.method2726(16);

	@OriginalMember(owner = "client!go", name = "q", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_123 = new Class196(69, 2);

	@OriginalMember(owner = "client!go", name = "s", descriptor = "Lclient!ofa;")
	public static final Class255 aClass255_10 = new Class255(1);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)Lclient!ot;")
	public static Class5_Sub2_Sub18 method2810() {
		return Static407.aClass5_Sub2_Sub18_2;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)Lclient!go;")
	public static Class137 method2812(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass137_1;
		} else if (arg0 == 1) {
			return aClass137_2;
		} else if (arg0 == 2) {
			return aClass137_3;
		} else if (arg0 == 3) {
			return aClass137_4;
		} else if (arg0 == 4) {
			return aClass137_5;
		} else if (arg0 == 5) {
			return aClass137_6;
		} else if (arg0 == 6) {
			return aClass137_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!ha;IB)V")
	public static void method2813(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static117.anInt2046 == 0 || Static85.anInt1444 == 0) {
			return;
		}
		@Pc(45) Class56 local45;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(36) int local36;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(55) int local55;
		if (Static305.aBoolean315) {
			Static611.method8212(false);
			local45 = arg1.method6257();
			@Pc(71) int[] local71 = arg1.Y();
			local36 = local71[2];
			local30 = local71[0];
			local34 = local71[1];
			local32 = local71[3];
			local60 = arg0 + Static240.method3454(false);
			local55 = Static504.method7252(false) + arg2;
		} else {
			arg1.DA(Static371.anInt6494, Static303.anInt4682, Static117.anInt2046, Static85.anInt1444);
			local30 = Static371.anInt6494;
			local32 = Static85.anInt1444;
			local34 = Static303.anInt4682;
			local36 = Static117.anInt2046;
			arg1.KA(Static271.anInt4279, Static465.anInt8114, Static117.anInt2046, Static85.anInt1444);
			local45 = arg1.method6232();
			local45.method8388(Static509.anInt5961, Static554.anInt3891, Static616.anInt9927, Static224.anInt3582, Static83.anInt1418, Static620.anInt9983);
			local55 = arg2;
			arg1.method6222(local45);
			local60 = arg0;
		}
		Static374.method6478(true);
		if (local36 == 0) {
			local36 = 1;
		}
		if (local32 == 0) {
			local32 = 1;
		}
		@Pc(139) int local139;
		@Pc(152) int local152;
		@Pc(162) int local162;
		@Pc(277) int local277;
		@Pc(286) int local286;
		@Pc(297) int local297;
		@Pc(308) int local308;
		@Pc(131) int local131;
		@Pc(357) int local357;
		if (Static230.aClass88Array2 != null && (!Static386.aBoolean482 || (Static2.anInt22 & 0x40) != 0)) {
			local131 = -1;
			@Pc(133) int local133 = -1;
			@Pc(136) int local136 = arg1.i();
			local139 = arg1.XA();
			@Pc(163) int local163;
			@Pc(151) int local151;
			if (Static426.aBoolean555) {
				local152 = local151 = Static663.anInt10391 * (local60 - local30) / local36;
				local163 = local162 = (local55 - local34) * Static663.anInt10391 / local32;
			} else {
				local163 = local136 * (local55 - local34) / local32;
				local152 = (local60 - local30) * local136 / local36;
				local151 = (local60 - local30) * local139 / local36;
				local162 = local139 * (local55 - local34) / local32;
			}
			@Pc(215) int[] local215 = new int[] { local152, local163, local136 };
			@Pc(230) int[] local230 = new int[] { local151, local162, local139 };
			local45.method8383(local215);
			local45.method8383(local230);
			@Pc(264) float local264 = Static271.method3791((float) local230[2], 4, (float) local215[2], (float) local215[0], (float) local215[1], (float) local230[1], (float) local230[0]);
			if (local264 > 0.0F) {
				local277 = local230[0] - local215[0];
				local286 = local230[2] - local215[2];
				local297 = (int) ((float) local215[0] + local264 * (float) local277);
				local308 = (int) ((float) local215[2] + local264 * (float) local286);
				local131 = local297 + (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.method7917() - 1 << 8) >> 9;
				local133 = local308 + (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.method7917() - 1 << 8) >> 9;
				@Pc(336) byte local336 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149;
				if (local336 < 3 && (Static317.aByteArrayArrayArray13[1][local297 >> 9][local308 >> 9] & 0x2) != 0) {
					local357 = local336 + 1;
				}
			}
			if (local131 != -1 && local133 != -1) {
				if (Static386.aBoolean482 && (Static2.anInt22 & 0x40) != 0) {
					@Pc(376) Class394 local376 = Static622.method7590(Static537.anInt10359, Static404.anInt6945);
					if (local376 == null) {
						Static355.method5247();
					} else {
						Static244.method3492(12, " ->", true, -1, Static11.aString1, Static476.anInt8267, (long) (local131 << 0 | local133), false, true, local131, local133, 0L);
					}
				} else {
					if (Static284.aBoolean295) {
						Static244.method3492(44, "", true, -1, Static49.aClass42_27.method730(Static259.anInt4113), -1, (long) (local133 | local131 << 0), false, true, local131, local133, 0L);
					}
					Static244.method3492(18, "", true, -1, Static90.aString13, Static14.anInt209, (long) (local133 | local131 << 0), false, true, local131, local133, 0L);
				}
			}
		}
		if (Static305.aBoolean315) {
			Static58.method877();
		}
		for (local131 = 0; (Static305.aBoolean315 ? 2 : 1) > local131; local131++) {
			@Pc(467) boolean local467 = local131 == 0;
			@Pc(473) Class89 local473 = local467 ? Static508.aClass89_1 : Static559.aClass89_3;
			local139 = arg0;
			local152 = arg2;
			if (Static305.aBoolean315) {
				Static611.method8212(local467);
				local139 = arg0 + Static240.method3454(local467);
				local152 = arg2 + Static504.method7252(local467);
			}
			@Pc(497) Class102 local497 = local473.aClass102_1;
			for (@Pc(502) Class41_Sub3 local502 = (Class41_Sub3) local497.method2062(); local502 != null; local502 = (Class41_Sub3) local497.method2054()) {
				if ((Static490.aBoolean609 || Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 == local502.aClass41_Sub1_10.aByte149) && local502.method3325(local139, local152, arg1)) {
					@Pc(537) int local537;
					if (local502.aClass41_Sub1_10 instanceof Class41_Sub1_Sub1) {
						local162 = ((Class41_Sub1_Sub1) local502.aClass41_Sub1_10).aShort109;
						local537 = ((Class41_Sub1_Sub1) local502.aClass41_Sub1_10).aShort108;
					} else {
						local537 = local502.aClass41_Sub1_10.anInt10367 >> 9;
						local162 = local502.aClass41_Sub1_10.anInt10366 >> 9;
					}
					@Pc(663) int local663;
					@Pc(674) int local674;
					@Pc(783) int local783;
					@Pc(567) int local567;
					if (local502.aClass41_Sub1_10 instanceof Class41_Sub1_Sub1_Sub3_Sub2) {
						@Pc(563) Class41_Sub1_Sub1_Sub3_Sub2 local563 = (Class41_Sub1_Sub1_Sub3_Sub2) local502.aClass41_Sub1_10;
						local567 = local563.method7917();
						if ((local567 & 0x1) == 0 && (local563.anInt10366 & 0x1FF) == 0 && (local563.anInt10367 & 0x1FF) == 0 || (local567 & 0x1) == 1 && (local563.anInt10366 & 0x1FF) == 256 && (local563.anInt10367 & 0x1FF) == 256) {
							local277 = local563.anInt10366 - (local563.method7917() - 1 << 8);
							local286 = local563.anInt10367 - (local563.method7917() - 1 << 8);
							for (local297 = 0; local297 < Static386.anInt6720; local297++) {
								@Pc(638) Class5_Sub34 local638 = (Class5_Sub34) Static223.aClass335_19.method7766((long) Static662.anIntArray600[local297]);
								if (local638 != null) {
									@Pc(643) Class41_Sub1_Sub1_Sub3_Sub1 local643 = local638.aClass41_Sub1_Sub1_Sub3_Sub1_1;
									if (local643.anInt9466 != Static421.anInt7434 && local643.aBoolean692) {
										local663 = local643.anInt10366 - (local643.aClass311_1.anInt8641 - 1 << 8);
										local674 = local643.anInt10367 - (local643.aClass311_1.anInt8641 - 1 << 8);
										if (local663 >= local277 && local643.aClass311_1.anInt8641 <= local563.method7917() - (local663 - local277 >> 9) && local286 <= local674 && local643.aClass311_1.anInt8641 <= local563.method7917() - (local674 - local286 >> 9)) {
											Static603.method8109(local643, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 != local502.aClass41_Sub1_10.aByte149);
											local643.anInt9466 = Static421.anInt7434;
										}
									}
								}
							}
							local308 = Static72.anInt9084;
							@Pc(744) int[] local744 = Static388.anIntArray381;
							for (local663 = 0; local663 < local308; local663++) {
								@Pc(754) Class41_Sub1_Sub1_Sub3_Sub2 local754 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local744[local663]];
								if (local754 != null && local754.anInt9466 != Static421.anInt7434 && local754 != local563 && local754.aBoolean692) {
									local783 = local754.anInt10366 - (local754.method7917() - 1 << 8);
									@Pc(794) int local794 = local754.anInt10367 - (local754.method7917() - 1 << 8);
									if (local783 >= local277 && local754.method7917() <= local563.method7917() - (local783 - local277 >> 9) && local286 <= local794 && local754.method7917() <= local563.method7917() - (local794 - local286 >> 9)) {
										Static238.method3424(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 != local502.aClass41_Sub1_10.aByte149, local754);
										local754.anInt9466 = Static421.anInt7434;
									}
								}
							}
						}
						if (Static421.anInt7434 == local563.anInt9466) {
							continue;
						}
						Static238.method3424(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 != local502.aClass41_Sub1_10.aByte149, local563);
						local563.anInt9466 = Static421.anInt7434;
					}
					if (local502.aClass41_Sub1_10 instanceof Class41_Sub1_Sub1_Sub3_Sub1) {
						@Pc(895) Class41_Sub1_Sub1_Sub3_Sub1 local895 = (Class41_Sub1_Sub1_Sub3_Sub1) local502.aClass41_Sub1_10;
						if (local895.aClass311_1 != null) {
							if ((local895.aClass311_1.anInt8641 & 0x1) == 0 && (local895.anInt10366 & 0x1FF) == 0 && (local895.anInt10367 & 0x1FF) == 0 || (local895.aClass311_1.anInt8641 & 0x1) == 1 && (local895.anInt10366 & 0x1FF) == 256 && (local895.anInt10367 & 0x1FF) == 256) {
								local567 = local895.anInt10366 - (local895.aClass311_1.anInt8641 - 1 << 8);
								local277 = local895.anInt10367 - (local895.aClass311_1.anInt8641 - 1 << 8);
								for (local286 = 0; local286 < Static386.anInt6720; local286++) {
									@Pc(980) Class5_Sub34 local980 = (Class5_Sub34) Static223.aClass335_19.method7766((long) Static662.anIntArray600[local286]);
									if (local980 != null) {
										@Pc(985) Class41_Sub1_Sub1_Sub3_Sub1 local985 = local980.aClass41_Sub1_Sub1_Sub3_Sub1_1;
										if (local985.anInt9466 != Static421.anInt7434 && local985 != local895 && local985.aBoolean692) {
											local357 = local985.anInt10366 - (local985.aClass311_1.anInt8641 - 1 << 8);
											local663 = local985.anInt10367 - (local985.aClass311_1.anInt8641 - 1 << 8);
											if (local567 <= local357 && local985.aClass311_1.anInt8641 <= local895.aClass311_1.anInt8641 - (local357 - local567 >> 9) && local277 <= local663 && local985.aClass311_1.anInt8641 <= local895.aClass311_1.anInt8641 - (local663 - local277 >> 9)) {
												Static603.method8109(local985, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 != local502.aClass41_Sub1_10.aByte149);
												local985.anInt9466 = Static421.anInt7434;
											}
										}
									}
								}
								local297 = Static72.anInt9084;
								@Pc(1091) int[] local1091 = Static388.anIntArray381;
								for (local357 = 0; local357 < local297; local357++) {
									@Pc(1101) Class41_Sub1_Sub1_Sub3_Sub2 local1101 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local1091[local357]];
									if (local1101 != null && Static421.anInt7434 != local1101.anInt9466 && local1101.aBoolean692) {
										local674 = local1101.anInt10366 - (local1101.method7917() - 1 << 8);
										local783 = local1101.anInt10367 - (local1101.method7917() - 1 << 8);
										if (local567 <= local674 && local1101.method7917() <= local895.aClass311_1.anInt8641 - (local674 - local567 >> 9) && local783 >= local277 && local1101.method7917() <= local895.aClass311_1.anInt8641 - (local783 - local277 >> 9)) {
											Static238.method3424(local502.aClass41_Sub1_10.aByte149 != Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149, local1101);
											local1101.anInt9466 = Static421.anInt7434;
										}
									}
								}
							}
							if (local895.anInt9466 == Static421.anInt7434) {
								continue;
							}
							Static603.method8109(local895, local502.aClass41_Sub1_10.aByte149 != Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149);
							local895.anInt9466 = Static421.anInt7434;
						}
					}
					if (local502.aClass41_Sub1_10 instanceof Class41_Sub1_Sub2_Sub1) {
						@Pc(1234) int local1234 = local162 + Static454.anInt7910;
						local567 = local537 + Static48.anInt750;
						@Pc(1256) Class5_Sub24 local1256 = (Class5_Sub24) Static109.aClass335_12.method7766((long) (local502.aClass41_Sub1_10.aByte149 << 28 | local567 << 14 | local1234));
						if (local1256 != null) {
							local286 = 0;
							for (@Pc(1266) Class5_Sub29 local1266 = (Class5_Sub29) local1256.aClass124_30.method2573(); local1266 != null; local1266 = (Class5_Sub29) local1256.aClass124_30.method2579()) {
								@Pc(1274) Class219 local1274 = Static259.aClass135_1.method2776(local1266.anInt3940);
								if (Static386.aBoolean482 && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 == local502.aClass41_Sub1_10.aByte149) {
									@Pc(1293) Class53 local1293 = Static350.anInt6210 == -1 ? null : Static522.aClass282_2.method6901(Static350.anInt6210);
									if ((Static2.anInt22 & 0x1) != 0 && (local1293 == null || local1274.method5168(local1293.anInt1028, Static350.anInt6210) != local1293.anInt1028)) {
										Static244.method3492(3, Static116.aString18 + " -> <col=ff9040>" + local1274.aString61, true, -1, Static11.aString1, Static476.anInt8267, (long) local286, false, false, local162, local537, (long) local1266.anInt3940);
									}
								}
								if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 == local502.aClass41_Sub1_10.aByte149) {
									@Pc(1355) String[] local1355 = local1274.aStringArray20;
									for (local663 = 4; local663 >= 0; local663--) {
										if (local1355 != null && local1355[local663] != null) {
											@Pc(1367) byte local1367 = 0;
											if (local663 == 0) {
												local1367 = 21;
											}
											local783 = Static478.anInt8275;
											if (local663 == 1) {
												local1367 = 15;
											}
											if (local663 == 2) {
												local1367 = 22;
											}
											if (local663 == 3) {
												local1367 = 50;
											}
											if (local663 == 4) {
												local1367 = 4;
											}
											if (local1274.lb == local663) {
												local783 = local1274.anInt6120;
											}
											if (local1274.anInt6143 == local663) {
												local783 = local1274.anInt6160;
											}
											Static244.method3492(local1367, "<col=ff9040>" + local1274.aString61, true, -1, local1355[local663], local783, (long) local286, false, false, local162, local537, (long) local1266.anInt3940);
										}
									}
								}
								Static244.method3492(1012, "<col=ff9040>" + local1274.aString61, true, -1, Static49.aClass42_22.method730(Static259.anInt4113), Static522.anInt8721, (long) local286, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 != local502.aClass41_Sub1_10.aByte149, false, local162, local537, (long) local1266.anInt3940);
								local286++;
							}
						}
					}
					if (local502.aClass41_Sub1_10 instanceof Interface10) {
						@Pc(1508) Interface10 local1508 = (Interface10) local502.aClass41_Sub1_10;
						@Pc(1515) Class81 local1515 = Static400.aClass140_4.method2839(local1508.method8668());
						if (local1515.anIntArray100 != null) {
							local1515 = local1515.method1760(Static413.aClass63_1);
						}
						if (local1515 != null) {
							if (Static386.aBoolean482 && local502.aClass41_Sub1_10.aByte149 == Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149) {
								@Pc(1544) Class53 local1544 = Static350.anInt6210 == -1 ? null : Static522.aClass282_2.method6901(Static350.anInt6210);
								if ((Static2.anInt22 & 0x4) != 0 && (local1544 == null || local1515.method1756(local1544.anInt1028, Static350.anInt6210) != local1544.anInt1028)) {
									Static244.method3492(25, Static116.aString18 + " -> <col=00ffff>" + local1515.aString14, true, -1, Static11.aString1, Static476.anInt8267, (long) local1508.hashCode(), false, false, local162, local537, Static50.method746(local1508, local162, local537));
								}
							}
							if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 == local502.aClass41_Sub1_10.aByte149) {
								@Pc(1613) String[] local1613 = local1515.aStringArray5;
								if (local1613 != null) {
									for (local286 = 4; local286 >= 0; local286--) {
										if (local1613[local286] != null) {
											@Pc(1625) short local1625 = 0;
											if (local286 == 0) {
												local1625 = 6;
											}
											local308 = Static478.anInt8275;
											if (local286 == 1) {
												local1625 = 59;
											}
											if (local286 == 2) {
												local1625 = 20;
											}
											if (local286 == 3) {
												local1625 = 53;
											}
											if (local1515.anInt1906 == local286) {
												local308 = local1515.anInt1932;
											}
											if (local286 == 4) {
												local1625 = 1010;
											}
											if (local1515.anInt1901 == local286) {
												local308 = local1515.anInt1895;
											}
											Static244.method3492(local1625, "<col=00ffff>" + local1515.aString14, true, -1, local1613[local286], local308, (long) local1508.hashCode(), false, false, local162, local537, Static50.method746(local1508, local162, local537));
										}
									}
								}
								Static244.method3492(1007, "<col=00ffff>" + local1515.aString14, true, -1, Static49.aClass42_22.method730(Static259.anInt4113), Static522.anInt8721, (long) local1508.hashCode(), Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 != local502.aClass41_Sub1_10.aByte149, false, local162, local537, (long) local1515.anInt1883);
							}
						}
					}
				}
			}
			if (Static305.aBoolean315) {
				Static58.method877();
			}
		}
		Static374.method6478(false);
	}
}
