import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
	public static int anInt4207;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString247 = "glow1:";

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "[Lclient!te;")
	public static Class4_Sub3_Sub19[] aClass4_Sub3_Sub19Array4 = new Class4_Sub3_Sub19[14];

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "Lclient!ai;")
	public static Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!pl", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString249 = " has logged in.";

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
	public static int anInt4210 = 0;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIB)V")
	public static void method3484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) Class4_Sub3_Sub9 local18 = Static43.method2329(4, arg2);
		local18.method1520();
		local18.anInt1993 = arg0;
		local18.anInt2001 = arg3;
		local18.anInt1994 = arg1;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method3486(@OriginalArg(0) String arg0) {
		return Static201.method3242(arg0);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLclient!fh;Lclient!fh;)V")
	public static void method3487(@OriginalArg(1) Class58 arg0, @OriginalArg(2) Class58 arg1) {
		Static47.aClass58_23 = arg0;
		Static135.aClass58_60 = arg1;
		Static47.aClass58_23.method1371(36);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IJ)V")
	public static void method3488(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static110.aClass4_Sub10_Sub1_1.method4687(218);
			Static110.aClass4_Sub10_Sub1_1.method4619(arg0);
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
	public static void method3489() {
		if (Static225.anInt4330 > 1) {
			Static16.anInt925 = Static261.anInt4980;
			Static225.anInt4330--;
		}
		if (Static47.anInt885 > 0) {
			Static47.anInt885--;
		}
		if (Static40.aBoolean38) {
			Static40.aBoolean38 = false;
			Static154.method2462();
			return;
		}
		@Pc(32) int local32;
		for (local32 = 0; local32 < 100 && Static296.method4479(); local32++) {
		}
		if (Static169.anInt3304 != 30) {
			return;
		}
		Static243.method3790(Static110.aClass4_Sub10_Sub1_1);
		@Pc(58) Object local58 = Static170.aClass100_1.anObject4;
		@Pc(86) int local86;
		@Pc(91) int local91;
		@Pc(118) int local118;
		@Pc(113) int local113;
		@Pc(201) int local201;
		@Pc(195) int local195;
		synchronized (Static170.aClass100_1.anObject4) {
			if (!Static204.aBoolean277) {
				Static170.aClass100_1.anInt2670 = 0;
			} else if (Static252.anInt4803 != 0 || Static170.aClass100_1.anInt2670 >= 40) {
				Static110.aClass4_Sub10_Sub1_1.method4687(199);
				Static110.aClass4_Sub10_Sub1_1.method4618(0);
				local86 = 0;
				@Pc(89) int local89 = Static110.aClass4_Sub10_Sub1_1.anInt5713;
				for (local91 = 0; local91 < Static170.aClass100_1.anInt2670 && Static110.aClass4_Sub10_Sub1_1.anInt5713 - local89 < 240; local91++) {
					local86++;
					local113 = Static170.aClass100_1.anIntArray236[local91];
					local118 = Static170.aClass100_1.anIntArray235[local91];
					if (local118 < 0) {
						local118 = 0;
					} else if (local118 > 65534) {
						local118 = 65534;
					}
					@Pc(136) boolean local136 = false;
					if (local113 < 0) {
						local113 = 0;
					} else if (local113 > 65534) {
						local113 = 65534;
					}
					if (Static170.aClass100_1.anIntArray235[local91] == -1 && Static170.aClass100_1.anIntArray236[local91] == -1) {
						local136 = true;
						local113 = -1;
						local118 = -1;
					}
					if (Static128.anInt2505 != local113 || local118 != Static253.anInt4836) {
						local195 = local118 - Static253.anInt4836;
						Static253.anInt4836 = local118;
						local201 = local113 - Static128.anInt2505;
						Static128.anInt2505 = local113;
						if (Static110.anInt2235 < 8 && local201 >= -32 && local201 <= 31 && local195 >= -32 && local195 <= 31) {
							local201 += 32;
							local195 += 32;
							Static110.aClass4_Sub10_Sub1_1.method4668((Static110.anInt2235 << 12) - (-(local201 << 6) - local195));
							Static110.anInt2235 = 0;
						} else if (Static110.anInt2235 < 32 && local201 >= -128 && local201 <= 127 && local195 >= -128 && local195 <= 127) {
							Static110.aClass4_Sub10_Sub1_1.method4618(Static110.anInt2235 + 128);
							local195 += 128;
							local201 += 128;
							Static110.aClass4_Sub10_Sub1_1.method4668((local201 << 8) + local195);
							Static110.anInt2235 = 0;
						} else if (Static110.anInt2235 < 32) {
							Static110.aClass4_Sub10_Sub1_1.method4618(Static110.anInt2235 + 192);
							if (local136) {
								Static110.aClass4_Sub10_Sub1_1.method4654(Integer.MIN_VALUE);
							} else {
								Static110.aClass4_Sub10_Sub1_1.method4654(local113 | local118 << 16);
							}
							Static110.anInt2235 = 0;
						} else {
							Static110.aClass4_Sub10_Sub1_1.method4668(Static110.anInt2235 + 57344);
							if (local136) {
								Static110.aClass4_Sub10_Sub1_1.method4654(Integer.MIN_VALUE);
							} else {
								Static110.aClass4_Sub10_Sub1_1.method4654(local113 | local118 << 16);
							}
							Static110.anInt2235 = 0;
						}
					} else if (Static110.anInt2235 < 2047) {
						Static110.anInt2235++;
					}
				}
				Static110.aClass4_Sub10_Sub1_1.method4675(Static110.aClass4_Sub10_Sub1_1.anInt5713 - local89);
				if (local86 < Static170.aClass100_1.anInt2670) {
					Static170.aClass100_1.anInt2670 -= local86;
					for (local91 = 0; local91 < Static170.aClass100_1.anInt2670; local91++) {
						Static170.aClass100_1.anIntArray236[local91] = Static170.aClass100_1.anIntArray236[local86 + local91];
						Static170.aClass100_1.anIntArray235[local91] = Static170.aClass100_1.anIntArray235[local86 + local91];
					}
				} else {
					Static170.aClass100_1.anInt2670 = 0;
				}
			}
		}
		if (Static252.anInt4803 != 0) {
			local86 = Static278.anInt5313;
			if (local86 < 0) {
				local86 = 0;
			} else if (local86 > 65535) {
				local86 = 65535;
			}
			@Pc(436) long local436 = (Static25.aLong20 - Static39.aLong32) / 50L;
			if (local436 > 32767L) {
				local436 = 32767L;
			}
			Static39.aLong32 = Static25.aLong20;
			local91 = Static79.anInt1797;
			if (local91 < 0) {
				local91 = 0;
			} else if (local91 > 65535) {
				local91 = 65535;
			}
			@Pc(466) byte local466 = 0;
			if (Static252.anInt4803 == 2) {
				local466 = 1;
			}
			Static110.aClass4_Sub10_Sub1_1.method4687(200);
			Static110.aClass4_Sub10_Sub1_1.method4628(local86 << 16 | local91);
			local113 = (int) local436;
			Static110.aClass4_Sub10_Sub1_1.method4651(local466 << 15 | local113);
		}
		if (Static276.anInt5270 > 0) {
			Static276.anInt5270--;
		}
		if (Static182.aBoolean248 && Static276.anInt5270 <= 0) {
			Static182.aBoolean248 = false;
			Static276.anInt5270 = 20;
			Static110.aClass4_Sub10_Sub1_1.method4687(140);
			Static110.aClass4_Sub10_Sub1_1.method4650((int) Static198.aFloat147);
			Static110.aClass4_Sub10_Sub1_1.method4673((int) Static202.aFloat97);
		}
		if (Static115.aBoolean158 && !Static292.aBoolean368) {
			Static292.aBoolean368 = true;
			Static110.aClass4_Sub10_Sub1_1.method4687(248);
			Static110.aClass4_Sub10_Sub1_1.method4618(1);
		}
		if (!Static115.aBoolean158 && Static292.aBoolean368) {
			Static292.aBoolean368 = false;
			Static110.aClass4_Sub10_Sub1_1.method4687(248);
			Static110.aClass4_Sub10_Sub1_1.method4618(0);
		}
		if (!Static78.aBoolean104) {
			Static110.aClass4_Sub10_Sub1_1.method4687(120);
			Static110.aClass4_Sub10_Sub1_1.method4654(Static179.method2819());
			Static78.aBoolean104 = true;
		}
		if (Static307.aBoolean402) {
			Static307.aBoolean402 = false;
		} else {
			Static168.aFloat79 /= 2.0F;
		}
		if (Static250.aBoolean331) {
			Static250.aBoolean331 = false;
		} else {
			Static35.aFloat20 /= 2.0F;
		}
		Static268.method4239();
		if (Static169.anInt3304 != 30) {
			return;
		}
		Static141.method4729();
		Static306.method4750();
		Static198.method4741();
		Static135.anInt2583++;
		if (Static135.anInt2583 > 750) {
			Static154.method2462();
			return;
		}
		Static92.method1576();
		Static3.method8();
		Static315.method4862();
		for (local32 = Static47.method735(true); local32 != -1; local32 = Static47.method735(false)) {
			Static221.method3571(local32);
			Static135.anIntArray225[Static42.anInt788++ & 0x1F] = local32;
		}
		@Pc(738) int local738;
		for (@Pc(683) Class4_Sub3_Sub9 local683 = Static187.method2997(); local683 != null; local683 = Static187.method2997()) {
			local86 = local683.method1515();
			local91 = local683.method1516();
			if (local86 == 1) {
				Static227.anIntArray462[local91] = local683.anInt1993;
				Static126.anIntArray218[Static213.anInt4197++ & 0x1F] = local91;
			} else if (local86 == 2) {
				Static16.aStringArray3[local91] = local683.aString109;
				Static126.anIntArray219[Static172.anInt3327++ & 0x1F] = local91;
			} else {
				@Pc(732) Class189 local732;
				if (local86 == 3) {
					local732 = Static114.method1814(local91);
					if (!local683.aString109.equals(local732.aString358)) {
						local732.aString358 = local683.aString109;
						Static205.method3283(local732);
					}
				} else if (local86 == 4) {
					local732 = Static114.method1814(local91);
					local113 = local683.anInt1993;
					local738 = local683.anInt2001;
					local201 = local683.anInt1994;
					if (local732.anInt5943 != local113 || local738 != local732.anInt5899 || local732.anInt5917 != local201) {
						local732.anInt5899 = local738;
						local732.anInt5917 = local201;
						local732.anInt5943 = local113;
						Static205.method3283(local732);
					}
				} else if (local86 == 5) {
					local732 = Static114.method1814(local91);
					if (local732.anInt5895 != local683.anInt1993 || local683.anInt1993 == -1) {
						local732.anInt5896 = 0;
						local732.anInt5895 = local683.anInt1993;
						local732.anInt5983 = 1;
						local732.anInt5901 = 0;
						Static205.method3283(local732);
					}
				} else if (local86 == 6) {
					local118 = local683.anInt1993;
					local738 = local118 >> 5 & 0x1F;
					@Pc(1094) Class189 local1094 = Static114.method1814(local91);
					local113 = local118 >> 10 & 0x1F;
					local201 = local118 & 0x1F;
					local195 = (local201 << 3) + ((local113 << 19) + (local738 << 11));
					if (local1094.anInt5937 != local195) {
						local1094.anInt5937 = local195;
						Static205.method3283(local1094);
					}
				} else if (local86 == 7) {
					local732 = Static114.method1814(local91);
					@Pc(800) boolean local800 = local683.anInt1993 == 1;
					if (local732.aBoolean418 != local800) {
						local732.aBoolean418 = local800;
						Static205.method3283(local732);
					}
				} else if (local86 == 8) {
					local732 = Static114.method1814(local91);
					if (local732.anInt5948 != local683.anInt1993 || local683.anInt2001 != local732.anInt5980 || local683.anInt1994 != local732.anInt5922) {
						local732.anInt5980 = local683.anInt2001;
						local732.anInt5922 = local683.anInt1994;
						if (local732.anInt5942 != -1) {
							if (local732.anInt5961 > 0) {
								local732.anInt5922 = local732.anInt5922 * 32 / local732.anInt5961;
							} else if (local732.anInt5931 > 0) {
								local732.anInt5922 = local732.anInt5922 * 32 / local732.anInt5931;
							}
						}
						local732.anInt5948 = local683.anInt1993;
						Static205.method3283(local732);
					}
				} else if (local86 == 9) {
					local732 = Static114.method1814(local91);
					if (local732.anInt5942 != local683.anInt1993 || local732.anInt5966 != local683.anInt2001) {
						local732.anInt5966 = local683.anInt2001;
						local732.anInt5942 = local683.anInt1993;
						Static205.method3283(local732);
					}
				} else if (local86 == 10) {
					local732 = Static114.method1814(local91);
					if (local732.anInt5967 != local683.anInt1993 || local683.anInt2001 != local732.anInt5910 || local732.anInt5890 != local683.anInt1994) {
						local732.anInt5910 = local683.anInt2001;
						local732.anInt5967 = local683.anInt1993;
						local732.anInt5890 = local683.anInt1994;
						Static205.method3283(local732);
					}
				} else if (local86 == 11) {
					local732 = Static114.method1814(local91);
					local732.anInt5964 = local732.anInt5932 = local683.anInt1993;
					local732.anInt5892 = local732.anInt5955 = local683.anInt2001;
					local732.aByte25 = 0;
					local732.aByte26 = 0;
					Static205.method3283(local732);
				} else if (local86 == 12) {
					local732 = Static114.method1814(local91);
					local113 = local683.anInt1993;
					if (local732 != null && local732.anInt5915 == 0) {
						if (local732.anInt5891 - local732.anInt5953 < local113) {
							local113 = local732.anInt5891 - local732.anInt5953;
						}
						if (local113 < 0) {
							local113 = 0;
						}
						if (local732.anInt5935 != local113) {
							local732.anInt5935 = local113;
							Static205.method3283(local732);
						}
					}
				} else if (local86 == 13) {
					local732 = Static114.method1814(local91);
					local732.anInt5905 = local683.anInt1993;
				}
			}
		}
		if (Static309.anInt6012 != 0) {
			Static73.anInt1629 += 20;
			if (Static73.anInt1629 >= 400) {
				Static309.anInt6012 = 0;
			}
		}
		Static211.anInt4156++;
		if (Static48.aClass189_3 != null) {
			Static52.anInt2246++;
			if (Static52.anInt2246 >= 15) {
				Static205.method3283(Static48.aClass189_3);
				Static48.aClass189_3 = null;
			}
		}
		@Pc(1306) Class189 local1306;
		if (Static195.aClass189_10 != null) {
			Static205.method3283(Static195.aClass189_10);
			if (Static34.anInt547 + 5 < Static286.anInt5358 || Static286.anInt5358 < Static34.anInt547 - 5 || Static312.anInt6042 > Static42.anInt789 + 5 || Static312.anInt6042 < Static42.anInt789 - 5) {
				Static201.aBoolean276 = true;
			}
			Static65.anInt1267++;
			if (Static86.anInt1991 == 0) {
				if (Static201.aBoolean276 && Static65.anInt1267 >= 5) {
					if (Static195.aClass189_10 == Static246.aClass189_13 && Static152.anInt2989 != Static5.anInt91) {
						local1306 = Static195.aClass189_10;
						@Pc(1312) byte local1312 = 0;
						if (Static308.anInt5939 == 1 && local1306.anInt5908 == 206) {
							local1312 = 1;
						}
						if (local1306.anIntArray660[Static152.anInt2989] <= 0) {
							local1312 = 0;
						}
						if (Static41.method687(local1306).method3292()) {
							local113 = Static152.anInt2989;
							local118 = Static5.anInt91;
							local1306.anIntArray660[local113] = local1306.anIntArray660[local118];
							local1306.anIntArray661[local113] = local1306.anIntArray661[local118];
							local1306.anIntArray660[local118] = -1;
							local1306.anIntArray661[local118] = 0;
						} else if (local1312 == 1) {
							local118 = Static5.anInt91;
							local113 = Static152.anInt2989;
							while (local113 != local118) {
								if (local113 < local118) {
									local1306.method4770(local118, local118 - 1);
									local118--;
								} else if (local118 < local113) {
									local1306.method4770(local118, local118 + 1);
									local118++;
								}
							}
						} else {
							local1306.method4770(Static5.anInt91, Static152.anInt2989);
						}
						Static110.aClass4_Sub10_Sub1_1.method4687(6);
						Static110.aClass4_Sub10_Sub1_1.method4673(Static152.anInt2989);
						Static110.aClass4_Sub10_Sub1_1.method4623(local1312);
						Static110.aClass4_Sub10_Sub1_1.method4621(Static195.aClass189_10.anInt5918);
						Static110.aClass4_Sub10_Sub1_1.method4650(Static5.anInt91);
					}
				} else if ((Static107.anInt5401 == 1 || Static60.method1005(Static300.anInt5638 - 1)) && Static300.anInt5638 > 2) {
					Static244.method3820();
				} else if (Static300.anInt5638 > 0) {
					Static312.method4821();
				}
				Static52.anInt2246 = 10;
				Static195.aClass189_10 = null;
				Static252.anInt4803 = 0;
			}
		}
		Static171.aBoolean232 = false;
		Static298.aClass189_16 = null;
		Static265.anInt5089 = 0;
		local1306 = Static208.aClass189_11;
		Static208.aClass189_11 = null;
		@Pc(1487) Class189 local1487 = Static77.aClass189_4;
		Static77.aClass189_4 = null;
		Static238.aBoolean311 = false;
		while (Static148.method2368() && Static265.anInt5089 < 128) {
			Static212.anIntArray441[Static265.anInt5089] = Static54.anInt1042;
			Static203.anIntArray419[Static265.anInt5089] = Static265.aChar4;
			Static265.anInt5089++;
		}
		Static224.aClass189_12 = null;
		if (Static107.anInt5399 != -1) {
			Static66.method1060(Static107.anInt5399, Static31.anInt526, 0, 0, 0, 0, Static40.anInt690);
		}
		Static261.anInt4980++;
		if (Static224.aClass189_12 != null) {
			Static177.method2783();
		}
		while (true) {
			@Pc(1562) Class189 local1562;
			@Pc(1550) Class189 local1550;
			@Pc(1542) Class4_Sub13 local1542;
			do {
				local1542 = (Class4_Sub13) Static57.aClass114_6.method2621();
				if (local1542 == null) {
					while (true) {
						do {
							local1542 = (Class4_Sub13) Static83.aClass114_10.method2621();
							if (local1542 == null) {
								while (true) {
									do {
										local1542 = (Class4_Sub13) Static135.aClass114_14.method2621();
										if (local1542 == null) {
											if (Static224.aClass189_12 == null) {
												Static39.anInt640 = 0;
											}
											if (Static35.aClass189_1 != null) {
												Static65.method1047();
											}
											if (Static133.anInt2576 > 0 && Static54.aBooleanArray4[82] && Static54.aBooleanArray4[81] && Static103.anInt2885 != 0) {
												local118 = Static281.anInt5335 - Static103.anInt2885;
												if (local118 < 0) {
													local118 = 0;
												} else if (local118 > 3) {
													local118 = 3;
												}
												Static167.method2958(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0] + Static220.anInt3983, Static295.anInt5480 + Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], local118);
											}
											if (Static133.anInt2576 > 0 && Static54.aBooleanArray4[82] && Static54.aBooleanArray4[81]) {
												if (Static32.anInt528 != -1) {
													Static167.method2958(Static32.anInt528 + Static220.anInt3983, Static28.anInt420 + Static295.anInt5480, Static281.anInt5335);
												}
												Static259.anInt4947 = 0;
												Static78.anInt1767 = 0;
											} else if (Static78.anInt1767 == 2) {
												if (Static32.anInt528 != -1) {
													Static110.aClass4_Sub10_Sub1_1.method4687(204);
													Static110.aClass4_Sub10_Sub1_1.method4651(Static28.anInt420 + Static295.anInt5480);
													Static110.aClass4_Sub10_Sub1_1.method4651(Static71.anInt1367);
													Static110.aClass4_Sub10_Sub1_1.method4621(Static21.anInt1053);
													Static110.aClass4_Sub10_Sub1_1.method4650(Static32.anInt528 + Static220.anInt3983);
													Static268.anInt5178 = Static79.anInt1797;
													Static309.anInt6012 = 1;
													Static73.anInt1629 = 0;
													Static165.anInt3275 = Static278.anInt5313;
												}
												Static78.anInt1767 = 0;
											} else if (Static259.anInt4947 == 2) {
												if (Static32.anInt528 != -1) {
													Static110.aClass4_Sub10_Sub1_1.method4687(85);
													Static110.aClass4_Sub10_Sub1_1.method4673(Static220.anInt3983 + Static32.anInt528);
													Static110.aClass4_Sub10_Sub1_1.method4650(Static295.anInt5480 + Static28.anInt420);
													Static309.anInt6012 = 1;
													Static73.anInt1629 = 0;
													Static165.anInt3275 = Static278.anInt5313;
													Static268.anInt5178 = Static79.anInt1797;
												}
												Static259.anInt4947 = 0;
											} else if (Static32.anInt528 != -1 && Static78.anInt1767 == 0 && Static259.anInt4947 == 0) {
												local118 = (Static32.anInt528 << 1) + 1 - Static154.aClass53_Sub1_Sub1_2.method3324() >> 1;
												local113 = (Static28.anInt420 << 1) + 1 - Static154.aClass53_Sub1_Sub1_2.method3324() >> 1;
												Static304.method4698(local118, 0, local113);
												Static268.anInt5178 = Static79.anInt1797;
												Static165.anInt3275 = Static278.anInt5313;
												Static309.anInt6012 = 1;
												Static73.anInt1629 = 0;
												Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local113, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local118);
											}
											Static32.anInt528 = -1;
											Static208.method3413();
											if (local1306 != Static208.aClass189_11) {
												if (local1306 != null) {
													Static205.method3283(local1306);
												}
												if (Static208.aClass189_11 != null) {
													Static205.method3283(Static208.aClass189_11);
												}
											}
											if (local1487 != Static77.aClass189_4 && Static198.anInt5844 == Static167.anInt3493) {
												if (local1487 != null) {
													Static205.method3283(local1487);
												}
												if (Static77.aClass189_4 != null) {
													Static205.method3283(Static77.aClass189_4);
												}
											}
											if (Static77.aClass189_4 == null) {
												if (Static167.anInt3493 > 0) {
													Static167.anInt3493--;
												}
											} else if (Static167.anInt3493 < Static198.anInt5844) {
												Static167.anInt3493++;
												if (Static198.anInt5844 == Static167.anInt3493) {
													Static205.method3283(Static77.aClass189_4);
												}
											}
											for (local118 = 0; local118 < 5; local118++) {
												@Pc(2019) int local2019 = Static6.anIntArray14[local118]++;
											}
											local118 = Static296.method4478();
											local113 = Static111.method1795();
											if (local118 > 15000 && local113 > 15000) {
												Static47.anInt885 = 250;
												Static301.method4590(14500);
												Static110.aClass4_Sub10_Sub1_1.method4687(91);
											}
											if (Static3.aClass185_1 != null && Static3.aClass185_1.anInt5623 == 1) {
												if (Static3.aClass185_1.anObject7 != null) {
													Static307.method4756(Static238.aString276, Static151.aBoolean206);
												}
												Static238.aString276 = null;
												Static3.aClass185_1 = null;
												Static151.aBoolean206 = false;
											}
											Static73.anInt1634++;
											Static102.anInt2142++;
											Static315.anInt6098++;
											if (Static73.anInt1634 > 500) {
												Static73.anInt1634 = 0;
												local738 = (int) (Math.random() * 8.0D);
												if ((local738 & 0x2) == 2) {
													Static45.anInt837 += Static27.anInt402;
												}
												if ((local738 & 0x1) == 1) {
													Static34.anInt548 += Static309.anInt6001;
												}
												if ((local738 & 0x4) == 4) {
													Static15.anInt242 += Static46.anInt873;
												}
											}
											if (Static45.anInt837 < -55) {
												Static27.anInt402 = 2;
											}
											if (Static45.anInt837 > 55) {
												Static27.anInt402 = -2;
											}
											if (Static34.anInt548 < -50) {
												Static309.anInt6001 = 2;
											}
											if (Static315.anInt6098 > 500) {
												Static315.anInt6098 = 0;
												local738 = (int) (Math.random() * 8.0D);
												if ((local738 & 0x1) == 1) {
													Static269.anInt3585 += Static226.anInt441;
												}
												if ((local738 & 0x2) == 2) {
													Static250.anInt4762 += Static58.anInt1121;
												}
											}
											if (Static250.anInt4762 < -20) {
												Static58.anInt1121 = 1;
											}
											if (Static34.anInt548 > 50) {
												Static309.anInt6001 = -2;
											}
											if (Static269.anInt3585 < -60) {
												Static226.anInt441 = 2;
											}
											if (Static269.anInt3585 > 60) {
												Static226.anInt441 = -2;
											}
											if (Static15.anInt242 < -40) {
												Static46.anInt873 = 1;
											}
											if (Static15.anInt242 > 40) {
												Static46.anInt873 = -1;
											}
											if (Static250.anInt4762 > 10) {
												Static58.anInt1121 = -1;
											}
											if (Static102.anInt2142 > 50) {
												Static110.aClass4_Sub10_Sub1_1.method4687(137);
											}
											if (Static46.aBoolean50) {
												Static302.method4604();
												Static46.aBoolean50 = false;
											}
											try {
												if (Static134.aClass52_7 != null && Static110.aClass4_Sub10_Sub1_1.anInt5713 > 0) {
													Static134.aClass52_7.method1107(Static110.aClass4_Sub10_Sub1_1.aByteArray71, Static110.aClass4_Sub10_Sub1_1.anInt5713);
													Static110.aClass4_Sub10_Sub1_1.anInt5713 = 0;
													Static102.anInt2142 = 0;
												}
											} catch (@Pc(2285) IOException local2285) {
												Static154.method2462();
											}
											return;
										}
										local1550 = local1542.aClass189_7;
										if (local1550.anInt5972 < 0) {
											break;
										}
										local1562 = Static114.method1814(local1550.anInt5941);
									} while (local1562 == null || local1562.aClass189Array4 == null || local1550.anInt5972 >= local1562.aClass189Array4.length || local1562.aClass189Array4[local1550.anInt5972] != local1550);
									Static135.method2020(local1542);
								}
							}
							local1550 = local1542.aClass189_7;
							if (local1550.anInt5972 < 0) {
								break;
							}
							local1562 = Static114.method1814(local1550.anInt5941);
						} while (local1562 == null || local1562.aClass189Array4 == null || local1562.aClass189Array4.length <= local1550.anInt5972 || local1550 != local1562.aClass189Array4[local1550.anInt5972]);
						Static135.method2020(local1542);
					}
				}
				local1550 = local1542.aClass189_7;
				if (local1550.anInt5972 < 0) {
					break;
				}
				local1562 = Static114.method1814(local1550.anInt5941);
			} while (local1562 == null || local1562.aClass189Array4 == null || local1562.aClass189Array4.length <= local1550.anInt5972 || local1562.aClass189Array4[local1550.anInt5972] != local1550);
			Static135.method2020(local1542);
		}
	}
}
