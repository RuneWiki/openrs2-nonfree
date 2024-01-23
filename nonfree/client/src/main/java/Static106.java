import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
	public static int anInt1988;

	@OriginalMember(owner = "client!hn", name = "J", descriptor = "[I")
	public static int[] anIntArray264 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	@OriginalMember(owner = "client!hn", name = "N", descriptor = "Lclient!hh;")
	public static Class69 aClass69_9 = new Class69();

	@OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
	public static int anInt1990 = 0;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)[Lclient!df;")
	public static Class34[] method1677() {
		if (Static254.aClass34Array113 == null) {
			@Pc(8) Class34[] local8 = Static33.method617(Static13.aClass84_3);
			@Pc(12) Class34[] local12 = new Class34[local8.length];
			@Pc(14) int local14 = 0;
			label54: for (@Pc(16) int local16 = 0; local16 < local8.length; local16++) {
				@Pc(24) Class34 local24 = local8[local16];
				if ((local24.anInt1119 <= 0 || local24.anInt1119 >= 24) && local24.anInt1118 >= 800 && local24.anInt1121 >= 600) {
					for (@Pc(47) int local47 = 0; local47 < local14; local47++) {
						@Pc(54) Class34 local54 = local12[local47];
						if (local54.anInt1118 == local24.anInt1118 && local24.anInt1121 == local54.anInt1121) {
							if (local24.anInt1119 > local54.anInt1119) {
								local12[local47] = local24;
							}
							continue label54;
						}
					}
					local12[local14] = local24;
					local14++;
				}
			}
			Static254.aClass34Array113 = new Class34[local14];
			Static300.method486(local12, 0, Static254.aClass34Array113, 0, local14);
			@Pc(108) int[] local108 = new int[Static254.aClass34Array113.length];
			for (@Pc(110) int local110 = 0; local110 < Static254.aClass34Array113.length; local110++) {
				@Pc(118) Class34 local118 = Static254.aClass34Array113[local110];
				local108[local110] = local118.anInt1118 * local118.anInt1121;
			}
			Static210.method3346(local108, Static254.aClass34Array113);
		}
		return Static254.aClass34Array113;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)Lclient!wn;")
	public static Class182 method1680(@OriginalArg(1) int arg0) {
		@Pc(15) Class182 local15 = (Class182) Static133.aClass31_21.method852((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(27) byte[] local27 = Static186.aClass7_152.method253(arg0, 4);
		local15 = new Class182();
		if (local27 != null) {
			local15.method4555(arg0, new Class1_Sub18(local27));
		}
		Static133.aClass31_21.method851(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!jh;Ljava/awt/Frame;I)V")
	public static void method1682(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(10) Class118 local10 = arg0.method1963(arg1);
			while (local10.anInt3187 == 0) {
				Static275.method4233(10L);
			}
			if (local10.anInt3187 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static275.method4233(100L);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([Lclient!ac;Z[[[II)V")
	public static void method1683(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][][] arg2) {
		@Pc(9) byte local9;
		if (arg1) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		@Pc(17) int local17;
		@Pc(24) int local24;
		if (!arg1) {
			for (local17 = 0; local17 < 4; local17++) {
				for (local24 = 0; local24 < 104; local24++) {
					for (@Pc(31) int local31 = 0; local31 < 104; local31++) {
						if ((Static242.aByteArrayArrayArray23[local17][local24][local31] & 0x1) == 1) {
							@Pc(50) int local50 = local17;
							if ((Static242.aByteArrayArrayArray23[1][local24][local31] & 0x2) == 2) {
								local50 = local17 - 1;
							}
							if (local50 >= 0) {
								arg0[local50].method114(local31, local24);
							}
						}
					}
				}
			}
			Static294.anInt5838 += (int) (Math.random() * 5.0D) - 2;
			if (Static294.anInt5838 < -8) {
				Static294.anInt5838 = -8;
			}
			if (Static294.anInt5838 > 8) {
				Static294.anInt5838 = 8;
			}
			Static233.anInt4880 += (int) (Math.random() * 5.0D) - 2;
			if (Static233.anInt4880 < -16) {
				Static233.anInt4880 = -16;
			}
			if (Static233.anInt4880 > 16) {
				Static233.anInt4880 = 16;
			}
		}
		local17 = Static294.anInt5838 >> 2 << 10;
		@Pc(141) int[][] local141 = new int[104][104];
		@Pc(145) int[][] local145 = new int[104][104];
		local24 = Static233.anInt4880 >> 1;
		@Pc(157) int local157;
		@Pc(173) int local173;
		@Pc(178) int local178;
		@Pc(183) int local183;
		@Pc(198) int local198;
		@Pc(204) int local204;
		@Pc(206) int local206;
		@Pc(211) int local211;
		@Pc(354) int local354;
		@Pc(237) int local237;
		@Pc(260) int local260;
		@Pc(273) int local273;
		for (local157 = 0; local157 < local9; local157++) {
			@Pc(164) byte[][] local164 = Static38.aByteArrayArrayArray5[local157];
			@Pc(279) int local279;
			@Pc(283) int local283;
			@Pc(289) int local289;
			@Pc(338) int local338;
			if (!Static240.aBoolean369) {
				local173 = (int) Math.sqrt(5100.0D);
				local178 = local173 * 768 >> 8;
				for (local183 = 1; local183 < 103; local183++) {
					for (local198 = 1; local198 < 103; local198++) {
						local206 = Static163.anIntArrayArrayArray16[local157][local198 + 1][local183] - Static163.anIntArrayArrayArray16[local157][local198 - 1][local183];
						local211 = Static163.anIntArrayArrayArray16[local157][local198][local183 + 1] - Static163.anIntArrayArrayArray16[local157][local198][local183 - 1];
						local354 = (int) Math.sqrt((double) (local206 * local206 + local211 * local211 + 65536));
						local260 = -65536 / local354;
						local237 = (local206 << 8) / local354;
						local279 = (local164[local198][local183] >> 1) + (local164[local198][local183 + 1] >> 3) + (local164[local198][local183 - 1] >> 2) + (local164[local198 + -1][local183] >> 2) + (local164[local198 + 1][local183] >> 3);
						local273 = (local211 << 8) / local354;
						local204 = (local237 * -50 + local260 * -10 + local273 * -50) / local178 + 74;
						local145[local198][local183] = local204 - local279;
					}
				}
			} else if (Static294.aBoolean445) {
				for (local173 = 1; local173 < 103; local173++) {
					for (local178 = 1; local178 < 103; local178++) {
						local198 = (local164[local178][local173] >> 1) + (local164[local178][local173 - 1] >> 2) + (local164[local178 - 1][local173] >> 2) + (local164[local178 + 1][local173] >> 3) + (local164[local178][local173 + 1] >> 3);
						local145[local178][local173] = 74 - local198;
					}
				}
			} else {
				local173 = (int) Static34.aFloatArray10[0];
				local178 = (int) Static34.aFloatArray10[1];
				local183 = (int) Static34.aFloatArray10[2];
				local198 = (int) Math.sqrt((double) (local173 * local173 + local178 * local178 + local183 * local183));
				local204 = local198 * 1024 >> 8;
				for (local206 = 1; local206 < 103; local206++) {
					for (local211 = 1; local211 < 103; local211++) {
						local237 = Static163.anIntArrayArrayArray16[local157][local211 + 1][local206] - Static163.anIntArrayArrayArray16[local157][local211 - 1][local206];
						local260 = Static163.anIntArrayArrayArray16[local157][local211][local206 + 1] - Static163.anIntArrayArrayArray16[local157][local211][local206 - 1];
						local273 = (int) Math.sqrt((double) (local260 * local260 + local237 * local237 + 65536));
						local279 = (local237 << 8) / local273;
						local283 = -65536 / local273;
						local289 = (local260 << 8) / local273;
						local338 = (local164[local211][local206] >> 1) + ((local164[local211][local206 + 1] >> 3) + (local164[local211 + 1][local206] >> 3) + (local164[local211 - 1][local206] >> 2) + (local164[local211][local206 - 1] >> 2));
						local354 = (local289 * local183 + local283 * local178 + local279 * local173) / local204 + 96;
						local145[local211][local206] = local354 - (int) ((float) local338 * 1.7F);
					}
				}
			}
			for (local173 = 0; local173 < 104; local173++) {
				Static140.anIntArray315[local173] = 0;
				Static75.anIntArray175[local173] = 0;
				Static224.anIntArray534[local173] = 0;
				Static143.anIntArray326[local173] = 0;
				Static103.anIntArray260[local173] = 0;
			}
			for (local173 = -5; local173 < 104; local173++) {
				for (local178 = 0; local178 < 104; local178++) {
					local183 = local173 + 5;
					@Pc(740) int local740;
					if (local183 < 104) {
						local198 = Static97.aByteArrayArrayArray11[local157][local183][local178] & 0xFF;
						if (local198 > 0) {
							@Pc(704) Class130 local704 = Static33.method619(local198 - 1);
							Static140.anIntArray315[local178] += local704.anInt3769;
							Static75.anIntArray175[local178] += local704.anInt3774;
							Static224.anIntArray534[local178] += local704.anInt3783;
							Static143.anIntArray326[local178] += local704.anInt3772;
							local740 = Static103.anIntArray260[local178]++;
						}
					}
					local198 = local173 - 5;
					if (local198 >= 0) {
						local204 = Static97.aByteArrayArrayArray11[local157][local198][local178] & 0xFF;
						if (local204 > 0) {
							@Pc(774) Class130 local774 = Static33.method619(local204 - 1);
							Static140.anIntArray315[local178] -= local774.anInt3769;
							Static75.anIntArray175[local178] -= local774.anInt3774;
							Static224.anIntArray534[local178] -= local774.anInt3783;
							Static143.anIntArray326[local178] -= local774.anInt3772;
							local740 = Static103.anIntArray260[local178]--;
						}
					}
				}
				if (local173 >= 0) {
					local183 = 0;
					local198 = 0;
					local178 = 0;
					local204 = 0;
					local206 = 0;
					for (local211 = -5; local211 < 104; local211++) {
						local237 = local211 - 5;
						local354 = local211 + 5;
						if (local354 < 104) {
							local178 += Static140.anIntArray315[local354];
							local183 += Static75.anIntArray175[local354];
							local198 += Static224.anIntArray534[local354];
							local204 += Static143.anIntArray326[local354];
							local206 += Static103.anIntArray260[local354];
						}
						if (local237 >= 0) {
							local204 -= Static143.anIntArray326[local237];
							local198 -= Static224.anIntArray534[local237];
							local183 -= Static75.anIntArray175[local237];
							local206 -= Static103.anIntArray260[local237];
							local178 -= Static140.anIntArray315[local237];
						}
						if (local211 >= 0 && local206 > 0) {
							local141[local173][local211] = Static73.method1189(local198 / local206, local183 / local206, local178 * 256 / local204);
						}
					}
				}
			}
			for (local173 = 1; local173 < 103; local173++) {
				label757: for (local178 = 1; local178 < 103; local178++) {
					if (arg1 || Static39.method718() || (Static242.aByteArrayArrayArray23[0][local173][local178] & 0x2) != 0 || (Static242.aByteArrayArrayArray23[local157][local173][local178] & 0x10) == 0 && Static173.method2621(local157, local173, local178) == Static92.anInt1754) {
						if (Static297.anInt5897 > local157) {
							Static297.anInt5897 = local157;
						}
						local183 = Static97.aByteArrayArrayArray11[local157][local173][local178] & 0xFF;
						local198 = Static249.aByteArrayArrayArray24[local157][local173][local178] & 0xFF;
						if (local183 > 0 || local198 > 0) {
							local204 = Static163.anIntArrayArrayArray16[local157][local173][local178];
							local206 = Static163.anIntArrayArrayArray16[local157][local173 + 1][local178];
							local211 = Static163.anIntArrayArrayArray16[local157][local173 + 1][local178 + 1];
							local354 = Static163.anIntArrayArrayArray16[local157][local173][local178 + 1];
							if (local157 > 0) {
								@Pc(1075) boolean local1075 = true;
								if (local183 == 0 && Static84.aByteArrayArrayArray9[local157][local173][local178] != 0) {
									local1075 = false;
								}
								if (local198 > 0 && !method1680(local198 - 1).aBoolean452) {
									local1075 = false;
								}
								if (local1075 && local206 == local204 && local211 == local204 && local354 == local204) {
									Static253.anIntArrayArrayArray19[local157][local173][local178] |= 0x4;
								}
							}
							if (local183 > 0) {
								local237 = local141[local173][local178];
								local273 = (local237 & 0x7F) + local24;
								if (local273 < 0) {
									local273 = 0;
								} else if (local273 > 127) {
									local273 = 127;
								}
								local279 = local273 + (local237 + local17 & 0xFC00) + (local237 & 0x380);
								local260 = Static208.anIntArray476[Static102.method1650(local279, 96)];
							} else {
								local237 = -1;
								local260 = 0;
							}
							local289 = local145[local173][local178 + 1];
							local283 = local145[local173 + 1][local178 + 1];
							local273 = local145[local173][local178];
							local279 = local145[local173 + 1][local178];
							if (local198 == 0) {
								Static65.method1077(local157, local173, local178, 0, 0, -1, local204, local206, local211, local354, Static102.method1650(local237, local273), Static102.method1650(local237, local279), Static102.method1650(local237, local283), Static102.method1650(local237, local289), 0, 0, 0, 0, local260, 0);
								if (Static240.aBoolean369 && local157 > 0 && local237 != -1 && Static33.method619(local183 - 1).aBoolean292) {
									Static78.method1329(0, 0, true, false, local173, local178, local204 - Static163.anIntArrayArrayArray16[0][local173][local178], -Static163.anIntArrayArrayArray16[0][local173 + 1][local178] + local206, local211 - Static163.anIntArrayArrayArray16[0][local173 + 1][local178 + 1], -Static163.anIntArrayArrayArray16[0][local173][local178 - -1] + local354);
								}
								if (Static240.aBoolean369 && !arg1 && Static46.anIntArrayArray10 != null && local157 == 0) {
									for (local338 = local173 - 1; local338 <= local173 + 1; local338++) {
										for (@Pc(1356) int local1356 = local178 - 1; local1356 <= local178 + 1; local1356++) {
											if ((local338 != local173 || local178 != local1356) && local338 >= 0 && local338 < 104 && local1356 >= 0 && local1356 < 104) {
												@Pc(1403) int local1403 = Static249.aByteArrayArrayArray24[local157][local338][local1356] & 0xFF;
												if (local1403 != 0) {
													@Pc(1414) Class182 local1414 = method1680(local1403 - 1);
													if (local1414.anInt5922 != -1 && Static165.method2524(Static208.anInterface4_1.method995(local1414.anInt5922))) {
														Static46.anIntArrayArray10[local173][local178] = (local1414.anInt5915 << 24) + local1414.anInt5920;
														continue label757;
													}
												}
											}
										}
									}
								}
							} else {
								local338 = Static84.aByteArrayArrayArray9[local157][local173][local178] + 1;
								@Pc(1469) byte local1469 = Static40.aByteArrayArrayArray6[local157][local173][local178];
								@Pc(1475) Class182 local1475 = method1680(local198 - 1);
								@Pc(1517) int local1517;
								@Pc(1530) int local1530;
								@Pc(1576) int local1576;
								if (Static240.aBoolean369 && !arg1 && Static46.anIntArrayArray10 != null && local157 == 0) {
									if (local1475.anInt5922 != -1 && Static165.method2524(Static208.anInterface4_1.method995(local1475.anInt5922))) {
										Static46.anIntArrayArray10[local173][local178] = (local1475.anInt5915 << 24) + local1475.anInt5920;
									} else {
										label738: for (local1517 = local173 - 1; local1517 <= local173 + 1; local1517++) {
											for (local1530 = local178 - 1; local1530 <= local178 + 1; local1530++) {
												if ((local1517 != local173 || local1530 != local178) && local1517 >= 0 && local1517 < 104 && local1530 >= 0 && local1530 < 104) {
													local1576 = Static249.aByteArrayArrayArray24[local157][local1517][local1530] & 0xFF;
													if (local1576 != 0) {
														@Pc(1589) Class182 local1589 = method1680(local1576 - 1);
														if (local1589.anInt5922 != -1 && Static165.method2524(Static208.anInterface4_1.method995(local1589.anInt5922))) {
															Static46.anIntArrayArray10[local173][local178] = local1589.anInt5920 + (local1589.anInt5915 << 24);
															break label738;
														}
													}
												}
											}
										}
									}
								}
								local1517 = local1475.anInt5922;
								if (local1517 >= 0 && !Static208.anInterface4_1.method990(local1517)) {
									local1517 = -1;
								}
								@Pc(1679) int local1679;
								@Pc(1652) int local1652;
								if (local1517 >= 0) {
									local1530 = -1;
									local1576 = Static208.anIntArray476[Static189.method2841(96, Static208.anInterface4_1.method991(local1517))];
								} else if (local1475.anInt5910 == -1) {
									local1530 = -2;
									local1576 = 0;
								} else {
									local1530 = local1475.anInt5910;
									local1652 = (local1530 & 0x7F) + local24;
									if (local1652 < 0) {
										local1652 = 0;
									} else if (local1652 > 127) {
										local1652 = 127;
									}
									local1679 = (local1530 + local17 & 0xFC00) - (-(local1530 & 0x380) - local1652);
									local1576 = Static208.anIntArray476[Static189.method2841(96, local1679)];
								}
								if (local1475.anInt5918 >= 0) {
									local1652 = local1475.anInt5918;
									local1679 = local24 + (local1652 & 0x7F);
									if (local1679 < 0) {
										local1679 = 0;
									} else if (local1679 > 127) {
										local1679 = 127;
									}
									@Pc(1749) int local1749 = (local1652 & 0x380) + (local17 + local1652 & 0xFC00) + local1679;
									local1576 = Static208.anIntArray476[Static189.method2841(96, local1749)];
								}
								Static65.method1077(local157, local173, local178, local338, local1469, local1517, local204, local206, local211, local354, Static102.method1650(local237, local273), Static102.method1650(local237, local279), Static102.method1650(local237, local283), Static102.method1650(local237, local289), Static189.method2841(local273, local1530), Static189.method2841(local279, local1530), Static189.method2841(local283, local1530), Static189.method2841(local289, local1530), local260, local1576);
								if (Static240.aBoolean369 && local157 > 0) {
									Static78.method1329(local338, local1469, local1530 == -2 || !local1475.aBoolean451, local237 == -1 || !Static33.method619(local183 - 1).aBoolean292, local173, local178, local204 - Static163.anIntArrayArrayArray16[0][local173][local178], -Static163.anIntArrayArrayArray16[0][local173 - -1][local178] + local206, local211 - Static163.anIntArrayArrayArray16[0][local173 + 1][local178 + 1], -Static163.anIntArrayArrayArray16[0][local173][local178 + 1] + local354);
								}
							}
						}
					}
				}
			}
			if (Static240.aBoolean369) {
				@Pc(1896) float[][] local1896 = new float[105][105];
				@Pc(1900) float[][] local1900 = new float[105][105];
				@Pc(1904) float[][] local1904 = new float[105][105];
				@Pc(1908) int[][] local1908 = Static163.anIntArrayArrayArray16[local157];
				local204 = 1;
				while (true) {
					if (local204 > 103) {
						@Pc(2033) Class1_Sub25[] local2033;
						if (arg1) {
							local2033 = Static203.method3157(local1896, Static46.anIntArrayArray10, Static84.aByteArrayArrayArray9[local157], local1904, Static249.aByteArrayArrayArray24[local157], Static152.anIntArrayArrayArray11[0], Static163.anIntArrayArrayArray16[local157], local145, Static40.aByteArrayArrayArray6[local157], arg2, Static97.aByteArrayArrayArray11[local157], local141, local157, Static242.aByteArrayArrayArray23, local1900);
							Static149.method2335(local157, local2033);
							break;
						}
						local2033 = Static203.method3157(local1896, null, Static84.aByteArrayArrayArray9[local157], local1904, Static249.aByteArrayArrayArray24[local157], null, Static163.anIntArrayArrayArray16[local157], local145, Static40.aByteArrayArrayArray6[local157], arg2, Static97.aByteArrayArrayArray11[local157], local141, local157, Static242.aByteArrayArrayArray23, local1900);
						@Pc(2091) Class1_Sub25[] local2091 = Static267.method4110(local157, local1896, Static242.aByteArrayArrayArray23, Static97.aByteArrayArrayArray11[local157], local145, Static40.aByteArrayArrayArray6[local157], Static84.aByteArrayArrayArray9[local157], Static163.anIntArrayArrayArray16[local157], local1900, local1904, Static249.aByteArrayArrayArray24[local157]);
						@Pc(2099) Class1_Sub25[] local2099 = new Class1_Sub25[local2033.length + local2091.length];
						for (local354 = 0; local354 < local2033.length; local354++) {
							local2099[local354] = local2033[local354];
						}
						for (local354 = 0; local354 < local2091.length; local354++) {
							local2099[local2033.length + local354] = local2091[local354];
						}
						Static149.method2335(local157, local2099);
						Static212.method3962(local157, local1900, Static194.anInt3733, Static163.anIntArrayArrayArray16[local157], Static97.aByteArrayArrayArray11[local157], local1904, Static249.aByteArrayArrayArray24[local157], Static84.aByteArrayArrayArray9[local157], Static40.aByteArrayArrayArray6[local157], Static194.aClass72Array1, local1896);
						break;
					}
					for (local206 = 1; local206 <= 103; local206++) {
						local211 = local1908[local206 + 1][local204] - local1908[local206 - 1][local204];
						local354 = local1908[local206][local204 + 1] - local1908[local206][local204 - 1];
						@Pc(1967) float local1967 = (float) Math.sqrt((double) (local354 * local354 + local211 * local211 + 65536));
						local1896[local206][local204] = (float) local211 / local1967;
						local1904[local206][local204] = -256.0F / local1967;
						local1900[local206][local204] = (float) local354 / local1967;
					}
					local204++;
				}
			}
			Static97.aByteArrayArrayArray11[local157] = null;
			Static249.aByteArrayArrayArray24[local157] = null;
			Static84.aByteArrayArrayArray9[local157] = null;
			Static40.aByteArrayArrayArray6[local157] = null;
			Static38.aByteArrayArrayArray5[local157] = null;
		}
		Static295.method4513();
		if (arg1) {
			return;
		}
		@Pc(2212) int local2212;
		for (local157 = 0; local157 < 104; local157++) {
			for (local2212 = 0; local2212 < 104; local2212++) {
				if ((Static242.aByteArrayArrayArray23[1][local157][local2212] & 0x2) == 2) {
					Static265.method4067(local157, local2212);
				}
			}
		}
		for (local157 = 0; local157 < 4; local157++) {
			for (local2212 = 0; local2212 <= 104; local2212++) {
				for (local173 = 0; local173 <= 104; local173++) {
					if ((Static253.anIntArrayArrayArray19[local157][local173][local2212] & 0x1) != 0) {
						for (local178 = local2212; local178 > 0 && (Static253.anIntArrayArrayArray19[local157][local173][local178 - 1] & 0x1) != 0; local178--) {
						}
						local204 = local157;
						local198 = local157;
						for (local183 = local2212; local183 < 104 && (Static253.anIntArrayArrayArray19[local157][local173][local183 + 1] & 0x1) != 0; local183++) {
						}
						label441: while (local198 > 0) {
							for (local206 = local178; local206 <= local183; local206++) {
								if ((Static253.anIntArrayArrayArray19[local198 - 1][local173][local206] & 0x1) == 0) {
									break label441;
								}
							}
							local198--;
						}
						label430: while (local204 < 3) {
							for (local206 = local178; local206 <= local183; local206++) {
								if ((Static253.anIntArrayArrayArray19[local204 + 1][local173][local206] & 0x1) == 0) {
									break label430;
								}
							}
							local204++;
						}
						local206 = (local204 + 1 - local198) * (local183 - (local178 + -1));
						if (local206 >= 8) {
							local354 = Static163.anIntArrayArrayArray16[local204][local173][local178] - 240;
							local237 = Static163.anIntArrayArrayArray16[local198][local173][local178];
							Static234.method3732(1, local173 * 128, local173 * 128, local178 * 128, local183 * 128 + 128, local354, local237);
							for (local260 = local198; local260 <= local204; local260++) {
								for (local273 = local178; local273 <= local183; local273++) {
									Static253.anIntArrayArrayArray19[local260][local173][local273] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static253.anIntArrayArrayArray19[local157][local173][local2212] & 0x2) != 0) {
						local178 = local173;
						local183 = local173;
						while (local178 > 0 && (Static253.anIntArrayArrayArray19[local157][local178 - 1][local2212] & 0x2) != 0) {
							local178--;
						}
						local198 = local157;
						local204 = local157;
						while (local183 < 104 && (Static253.anIntArrayArrayArray19[local157][local183 + 1][local2212] & 0x2) != 0) {
							local183++;
						}
						label495: while (local198 > 0) {
							for (local206 = local178; local206 <= local183; local206++) {
								if ((Static253.anIntArrayArrayArray19[local198 - 1][local206][local2212] & 0x2) == 0) {
									break label495;
								}
							}
							local198--;
						}
						label484: while (local204 < 3) {
							for (local206 = local178; local206 <= local183; local206++) {
								if ((Static253.anIntArrayArrayArray19[local204 + 1][local206][local2212] & 0x2) == 0) {
									break label484;
								}
							}
							local204++;
						}
						local206 = (local183 + 1 - local178) * (-local198 + 1 + local204);
						if (local206 >= 8) {
							local237 = Static163.anIntArrayArrayArray16[local198][local178][local2212];
							local354 = Static163.anIntArrayArrayArray16[local204][local178][local2212] - 240;
							Static234.method3732(2, local178 * 128, local183 * 128 + 128, local2212 * 128, local2212 * 128, local354, local237);
							for (local260 = local198; local260 <= local204; local260++) {
								for (local273 = local178; local273 <= local183; local273++) {
									Static253.anIntArrayArrayArray19[local260][local273][local2212] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static253.anIntArrayArrayArray19[local157][local173][local2212] & 0x4) != 0) {
						local178 = local173;
						local183 = local173;
						local198 = local2212;
						local204 = local2212;
						while (local198 > 0 && (Static253.anIntArrayArrayArray19[local157][local173][local198 - 1] & 0x4) != 0) {
							local198--;
						}
						while (local204 < 104 && (Static253.anIntArrayArrayArray19[local157][local173][local204 + 1] & 0x4) != 0) {
							local204++;
						}
						label549: while (local178 > 0) {
							for (local206 = local198; local206 <= local204; local206++) {
								if ((Static253.anIntArrayArrayArray19[local157][local178 - 1][local206] & 0x4) == 0) {
									break label549;
								}
							}
							local178--;
						}
						label538: while (local183 < 104) {
							for (local206 = local198; local206 <= local204; local206++) {
								if ((Static253.anIntArrayArrayArray19[local157][local183 + 1][local206] & 0x4) == 0) {
									break label538;
								}
							}
							local183++;
						}
						if ((local183 + 1 - local178) * (local204 + 1 + -local198) >= 4) {
							local206 = Static163.anIntArrayArrayArray16[local157][local178][local198];
							Static234.method3732(4, local178 * 128, local183 * 128 + 128, local198 * 128, local204 * 128 + 128, local206, local206);
							for (local211 = local178; local211 <= local183; local211++) {
								for (local354 = local198; local354 <= local204; local354++) {
									Static253.anIntArrayArrayArray19[local157][local211][local354] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}
}
