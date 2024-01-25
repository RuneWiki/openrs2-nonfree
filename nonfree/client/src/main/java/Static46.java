import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_13 = new Class154(64);

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_14 = new Class154(8);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method871() {
		for (@Pc(1) int local1 = 0; local1 < Static92.anInt2048; local1++) {
			@Pc(6) int[] local6 = Static251.anIntArrayArray49[local1];
			for (@Pc(8) int local8 = 0; local8 < Static290.anInt5893; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!fd;IIIIIII)V")
	private static void method872(@OriginalArg(0) Class72[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class72 local6 = arg0[local1];
			if (local6 != null && local6.anInt1813 == arg1) {
				@Pc(17) int local17 = local6.anInt1861 + arg6;
				@Pc(22) int local22 = local6.anInt1854 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt1825 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt1829;
					@Pc(45) int local45 = local22 + local6.anInt1806;
					if (local6.anInt1825 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (!local6.aBoolean159 || local6.anInt1825 == 0 || local6.aBoolean158 || method876(local6).anInt269 != 0 || local6 == Static352.aClass72_20 || local6.anInt1804 == 1338) {
					if (!local6.aBoolean159 || !method886(local6)) {
						if (local6 == Static301.aClass72_19) {
							Static182.aBoolean332 = true;
							Static240.anInt5023 = local17;
							Static89.anInt1953 = local22;
						}
						if (!local6.aBoolean159 || local6.aBoolean149 || local28 < local32 && local30 < local34) {
							if (local6.anInt1825 == 0) {
								if (!local6.aBoolean159 && method886(local6) && Static55.aClass72_4 != local6) {
									continue;
								}
								if (local6.aBoolean156 && Static38.anInt830 >= local28 && Static184.anInt4055 >= local30 && Static38.anInt830 < local32 && Static184.anInt4055 < local34) {
									for (@Pc(175) Class4_Sub22 local175 = (Class4_Sub22) Static238.aClass130_107.method3499(); local175 != null; local175 = (Class4_Sub22) Static238.aClass130_107.method3512()) {
										if (local175.aBoolean264) {
											local175.method5667();
											local175.aClass72_12.aBoolean155 = false;
										}
									}
									if (Static203.anInt4288 == 0) {
										Static301.aClass72_19 = null;
										Static352.aClass72_20 = null;
									}
									Static109.anInt2407 = 0;
									Static109.aBoolean207 = false;
									Static206.aBoolean369 = false;
									if (!Static173.aBoolean319) {
										Static67.method1256();
									}
								}
							}
							@Pc(223) boolean local223;
							if (Static38.anInt830 >= local28 && Static184.anInt4055 >= local30 && Static38.anInt830 < local32 && Static184.anInt4055 < local34) {
								local223 = true;
							} else {
								local223 = false;
							}
							if (!Static173.aBoolean319 && local223) {
								Static69.method1294(local6, Static184.anInt4055 - local22, Static38.anInt830 - local17);
							}
							if (local6.aBoolean159) {
								@Pc(244) boolean local244 = false;
								if (Static136.anInt3094 == 1 && local223) {
									local244 = true;
								}
								@Pc(253) boolean local253 = false;
								if (Static9.anInt6461 == 1 && Static65.anInt1361 >= local28 && Static237.anInt4924 >= local30 && Static65.anInt1361 < local32 && Static237.anInt4924 < local34) {
									local253 = true;
								}
								@Pc(275) int local275;
								@Pc(364) int local364;
								if (local6.aByteArray27 != null) {
									for (local275 = 0; local275 < local6.aByteArray27.length; local275++) {
										if (Static77.aBooleanArray13[local6.aByteArray27[local275]]) {
											if (local6.anIntArray187 == null || Static342.anInt6706 >= local6.anIntArray187[local275]) {
												@Pc(306) byte local306 = local6.aByteArray26[local275];
												if (local306 == 0 || ((local306 & 0x8) == 0 || !Static77.aBooleanArray13[86] && !Static77.aBooleanArray13[82] && !Static77.aBooleanArray13[81]) && ((local306 & 0x2) == 0 || Static77.aBooleanArray13[86]) && ((local306 & 0x1) == 0 || Static77.aBooleanArray13[82]) && ((local306 & 0x4) == 0 || Static77.aBooleanArray13[81])) {
													Static9.method5407(local275 + 1, local6.anInt1830, -1, "");
													local364 = local6.anIntArray180[local275];
													if (local6.anIntArray187 == null) {
														local6.anIntArray187 = new int[local6.aByteArray27.length];
													}
													if (local364 == 0) {
														local6.anIntArray187[local275] = Integer.MAX_VALUE;
													} else {
														local6.anIntArray187[local275] = Static342.anInt6706 + local364;
													}
												}
											}
										} else if (local6.anIntArray187 != null) {
											local6.anIntArray187[local275] = 0;
										}
									}
								}
								if (local253) {
									Static333.method73(Static65.anInt1361 - local17, local6, Static237.anInt4924 - local22);
								}
								if (Static301.aClass72_19 != null && Static301.aClass72_19 != local6 && local223 && method876(local6).method266()) {
									Static57.aClass72_5 = local6;
								}
								if (local6 == Static352.aClass72_20) {
									Static205.aBoolean368 = true;
									Static277.anInt5631 = local17;
									Static310.anInt6218 = local22;
								}
								if (local6.aBoolean158 || local6.anInt1804 != 0) {
									@Pc(445) Class4_Sub22 local445;
									if (local223 && Static32.anInt3682 != 0 && local6.anObjectArray20 != null) {
										local445 = new Class4_Sub22();
										local445.aBoolean264 = true;
										local445.aClass72_12 = local6;
										local445.anInt3125 = Static32.anInt3682;
										local445.anObjectArray34 = local6.anObjectArray20;
										Static238.aClass130_107.method3510(local445);
									}
									if (Static301.aClass72_19 != null || Static215.aClass72_15 != null || Static173.aBoolean319 || local6.anInt1804 != 1400 && Static109.anInt2407 > 0) {
										local253 = false;
										local244 = false;
										local223 = false;
									}
									@Pc(580) int local580;
									if (local6.anInt1804 != 0) {
										if (local6.anInt1804 == 1337 || local6.anInt1804 == 1403) {
											Static191.aClass72_14 = local6;
											if (Static93.aClass155_1 != null) {
												Static93.aClass155_1.method4227(Static164.aClass92_7, local6.anInt1806);
											}
											if (local6.anInt1804 == 1337) {
												if (!Static173.aBoolean319 && local223) {
													Static11.method259(Static164.aClass92_7);
													for (@Pc(518) Class17_Sub4 local518 = (Class17_Sub4) Static145.aClass204_7.method5359(); local518 != null; local518 = (Class17_Sub4) Static145.aClass204_7.method5357()) {
														if (Static38.anInt830 >= local518.anInt2757 && Static38.anInt830 < local518.anInt2755 && Static184.anInt4055 >= local518.anInt2758 && Static184.anInt4055 < local518.anInt2754) {
															Static67.method1256();
															Static170.method3197(local518.aClass2_Sub2_Sub1_1);
														}
													}
												}
												Static279.method4784(local22, local6, local17);
												continue;
											}
										}
										@Pc(619) int local619;
										if (local6.anInt1804 == 1338) {
											if (local6.method1506(Static164.aClass92_7) == null || Static27.anInt450 != 0 && Static27.anInt450 != 3 || Static173.aBoolean319 || !local223) {
												continue;
											}
											local275 = Static38.anInt830 - local17;
											local580 = Static184.anInt4055 - local22;
											local364 = local6.anIntArray182[local580];
											if (local275 < local364 || local275 > local364 + local6.anIntArray184[local580]) {
												continue;
											}
											local275 -= local6.anInt1829 / 2;
											local580 -= local6.anInt1806 / 2;
											if (Static303.anInt3065 == 4) {
												local619 = (int) Static138.aFloat35 & 0x3FFF;
											} else {
												local619 = (int) Static138.aFloat35 + Static222.anInt4620 & 0x3FFF;
											}
											@Pc(631) int local631 = Class4_Sub4_Sub25.anIntArray384[local619];
											@Pc(635) int local635 = Class4_Sub4_Sub25.anIntArray383[local619];
											if (Static303.anInt3065 != 4) {
												local631 = local631 * (Static48.anInt1082 + 256) >> 8;
												local635 = local635 * (Static48.anInt1082 + 256) >> 8;
											}
											@Pc(664) int local664 = local580 * local631 + local275 * local635 >> 15;
											@Pc(674) int local674 = local580 * local635 - local275 * local631 >> 15;
											@Pc(685) int local685;
											@Pc(693) int local693;
											if (Static303.anInt3065 == 4) {
												local685 = (Static2.anInt5073 >> 7) + (local664 >> 2);
												local693 = (Static331.anInt6556 >> 7) - (local674 >> 2);
											} else {
												@Pc(702) int local702 = (Static110.aClass2_Sub2_Sub1_Sub1_1.method5425() - 1) * 64;
												local685 = (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 - local702 >> 7) + (local664 >> 2);
												local693 = (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 - local702 >> 7) - (local674 >> 2);
											}
											if (Static247.aBoolean436 && (Static184.anInt4052 & 0x40) != 0) {
												@Pc(735) Class72 local735 = Static289.method4934(Static301.anInt6084, Static58.anInt1259);
												if (local735 == null) {
													Static138.method2738();
												} else {
													Static285.method4888(local685, " ->", 1L, Static232.anInt4817, Static316.aString197, local693, 17);
												}
												continue;
											}
											if (Static269.anInt5508 == 1) {
												Static285.method4888(local685, "", 1L, -1, Static167.aString122, local693, 23);
											}
											Static285.method4888(local685, "", 1L, -1, Static131.aString98, local693, 33);
											continue;
										}
										if (local6.anInt1804 == 1400) {
											Static142.aClass72_13 = local6;
											if (local223) {
												Static109.aBoolean207 = true;
											}
											if (local253) {
												local275 = (int) ((double) (Static65.anInt1361 - local17 - local6.anInt1829 / 2) * 2.0D / (double) Static42.aFloat26);
												local580 = (int) -((double) (Static237.anInt4924 - local22 - local6.anInt1806 / 2) * 2.0D / (double) Static42.aFloat26);
												local364 = Static307.anInt3771 + local275 + Static42.anInt2446;
												local619 = Static35.anInt732 + local580 + Static42.anInt2441;
												@Pc(832) Class4_Sub1_Sub11 local832 = Static131.method2636();
												if (local832 == null) {
													continue;
												}
												@Pc(837) int[] local837 = new int[3];
												local832.method2689(local364, local619, local837);
												if (local837 != null) {
													if (Static77.aBooleanArray13[82] && Static98.anInt6644 > 0) {
														Static284.method4850(local837[1], local837[0], local837[2]);
														continue;
													}
													Static206.aBoolean369 = true;
													Static186.anInt5634 = local837[0];
													Static120.anInt2713 = local837[1];
													Static171.anInt3791 = local837[2];
												}
												Static109.anInt2407 = 1;
												Static249.aBoolean440 = false;
												Static72.anInt1627 = Static38.anInt830;
												Static345.anInt6765 = Static184.anInt4055;
												continue;
											}
											if (local244 && Static109.anInt2407 > 0) {
												if (Static109.anInt2407 == 1 && (Static72.anInt1627 != Static38.anInt830 || Static345.anInt6765 != Static184.anInt4055)) {
													Static32.anInt3683 = Static307.anInt3771;
													Static71.anInt1617 = Static35.anInt732;
													Static109.anInt2407 = 2;
												}
												if (Static109.anInt2407 == 2) {
													Static249.aBoolean440 = true;
													Static115.method2090(Static32.anInt3683 + (int) ((double) (Static72.anInt1627 - Static38.anInt830) * 2.0D / (double) Static42.aFloat25));
													Static15.method315(Static71.anInt1617 - (int) ((double) (Static345.anInt6765 - Static184.anInt4055) * 2.0D / (double) Static42.aFloat25));
												}
												continue;
											}
											if (Static109.anInt2407 > 0 && !Static249.aBoolean440) {
												if ((Static82.anInt1737 == 1 || Static72.method1364()) && Static282.anInt5713 > 2) {
													Static170.method3195(2);
												} else if (Static282.method4832()) {
													Static170.method3195(1);
												}
											}
											Static109.anInt2407 = 0;
											continue;
										}
										if (local6.anInt1804 == 1401) {
											if (local244) {
												Static180.method3346(Static38.anInt830 - local17, local6.anInt1806, local6.anInt1829, Static184.anInt4055 - local22);
											}
											continue;
										}
										if (local6.anInt1804 == 1402) {
											Static238.method4097(local6);
											continue;
										}
										if (local6.anInt1804 == 1406) {
											Static59.method1050(local6, local22, local17);
											continue;
										}
									}
									if (!local6.aBoolean153 && local253) {
										local6.aBoolean153 = true;
										if (local6.anObjectArray25 != null) {
											local445 = new Class4_Sub22();
											local445.aBoolean264 = true;
											local445.aClass72_12 = local6;
											local445.anInt3116 = Static65.anInt1361 - local17;
											local445.anInt3125 = Static237.anInt4924 - local22;
											local445.anObjectArray34 = local6.anObjectArray25;
											Static238.aClass130_107.method3510(local445);
										}
									}
									if (local6.aBoolean153 && local244 && local6.anObjectArray26 != null) {
										local445 = new Class4_Sub22();
										local445.aBoolean264 = true;
										local445.aClass72_12 = local6;
										local445.anInt3116 = Static38.anInt830 - local17;
										local445.anInt3125 = Static184.anInt4055 - local22;
										local445.anObjectArray34 = local6.anObjectArray26;
										Static238.aClass130_107.method3510(local445);
									}
									if (local6.aBoolean153 && !local244) {
										local6.aBoolean153 = false;
										if (local6.anObjectArray30 != null) {
											local445 = new Class4_Sub22();
											local445.aBoolean264 = true;
											local445.aClass72_12 = local6;
											local445.anInt3116 = Static38.anInt830 - local17;
											local445.anInt3125 = Static184.anInt4055 - local22;
											local445.anObjectArray34 = local6.anObjectArray30;
											Static344.aClass130_154.method3510(local445);
										}
									}
									if (local244 && local6.anObjectArray18 != null) {
										local445 = new Class4_Sub22();
										local445.aBoolean264 = true;
										local445.aClass72_12 = local6;
										local445.anInt3116 = Static38.anInt830 - local17;
										local445.anInt3125 = Static184.anInt4055 - local22;
										local445.anObjectArray34 = local6.anObjectArray18;
										Static238.aClass130_107.method3510(local445);
									}
									if (!local6.aBoolean155 && local223) {
										local6.aBoolean155 = true;
										if (local6.anObjectArray31 != null) {
											local445 = new Class4_Sub22();
											local445.aBoolean264 = true;
											local445.aClass72_12 = local6;
											local445.anInt3116 = Static38.anInt830 - local17;
											local445.anInt3125 = Static184.anInt4055 - local22;
											local445.anObjectArray34 = local6.anObjectArray31;
											Static238.aClass130_107.method3510(local445);
										}
									}
									if (local6.aBoolean155 && local223 && local6.anObjectArray11 != null) {
										local445 = new Class4_Sub22();
										local445.aBoolean264 = true;
										local445.aClass72_12 = local6;
										local445.anInt3116 = Static38.anInt830 - local17;
										local445.anInt3125 = Static184.anInt4055 - local22;
										local445.anObjectArray34 = local6.anObjectArray11;
										Static238.aClass130_107.method3510(local445);
									}
									if (local6.aBoolean155 && !local223) {
										local6.aBoolean155 = false;
										if (local6.anObjectArray24 != null) {
											local445 = new Class4_Sub22();
											local445.aBoolean264 = true;
											local445.aClass72_12 = local6;
											local445.anInt3116 = Static38.anInt830 - local17;
											local445.anInt3125 = Static184.anInt4055 - local22;
											local445.anObjectArray34 = local6.anObjectArray24;
											Static344.aClass130_154.method3510(local445);
										}
									}
									if (local6.anObjectArray10 != null) {
										local445 = new Class4_Sub22();
										local445.aClass72_12 = local6;
										local445.anObjectArray34 = local6.anObjectArray10;
										Static152.aClass130_72.method3510(local445);
									}
									@Pc(1337) Class4_Sub22 local1337;
									if (local6.anObjectArray3 != null && Static15.anInt317 > local6.anInt1843) {
										if (local6.anIntArray183 == null || Static15.anInt317 - local6.anInt1843 > 32) {
											local445 = new Class4_Sub22();
											local445.aClass72_12 = local6;
											local445.anObjectArray34 = local6.anObjectArray3;
											Static238.aClass130_107.method3510(local445);
										} else {
											label675: for (local275 = local6.anInt1843; local275 < Static15.anInt317; local275++) {
												local580 = Static171.anIntArray332[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray183.length; local364++) {
													if (local6.anIntArray183[local364] == local580) {
														local1337 = new Class4_Sub22();
														local1337.aClass72_12 = local6;
														local1337.anObjectArray34 = local6.anObjectArray3;
														Static238.aClass130_107.method3510(local1337);
														break label675;
													}
												}
											}
										}
										local6.anInt1843 = Static15.anInt317;
									}
									if (local6.anObjectArray9 != null && Static143.anInt3195 > local6.anInt1798) {
										if (local6.anIntArray185 == null || Static143.anInt3195 - local6.anInt1798 > 32) {
											local445 = new Class4_Sub22();
											local445.aClass72_12 = local6;
											local445.anObjectArray34 = local6.anObjectArray9;
											Static238.aClass130_107.method3510(local445);
										} else {
											label655: for (local275 = local6.anInt1798; local275 < Static143.anInt3195; local275++) {
												local580 = Static18.anIntArray51[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray185.length; local364++) {
													if (local6.anIntArray185[local364] == local580) {
														local1337 = new Class4_Sub22();
														local1337.aClass72_12 = local6;
														local1337.anObjectArray34 = local6.anObjectArray9;
														Static238.aClass130_107.method3510(local1337);
														break label655;
													}
												}
											}
										}
										local6.anInt1798 = Static143.anInt3195;
									}
									if (local6.anObjectArray7 != null && Static289.anInt5852 > local6.anInt1886) {
										if (local6.anIntArray194 == null || Static289.anInt5852 - local6.anInt1886 > 32) {
											local445 = new Class4_Sub22();
											local445.aClass72_12 = local6;
											local445.anObjectArray34 = local6.anObjectArray7;
											Static238.aClass130_107.method3510(local445);
										} else {
											label635: for (local275 = local6.anInt1886; local275 < Static289.anInt5852; local275++) {
												local580 = Static291.anIntArray487[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray194.length; local364++) {
													if (local6.anIntArray194[local364] == local580) {
														local1337 = new Class4_Sub22();
														local1337.aClass72_12 = local6;
														local1337.anObjectArray34 = local6.anObjectArray7;
														Static238.aClass130_107.method3510(local1337);
														break label635;
													}
												}
											}
										}
										local6.anInt1886 = Static289.anInt5852;
									}
									if (local6.anObjectArray21 != null && Static2.anInt5070 > local6.anInt1883) {
										if (local6.anIntArray191 == null || Static2.anInt5070 - local6.anInt1883 > 32) {
											local445 = new Class4_Sub22();
											local445.aClass72_12 = local6;
											local445.anObjectArray34 = local6.anObjectArray21;
											Static238.aClass130_107.method3510(local445);
										} else {
											label615: for (local275 = local6.anInt1883; local275 < Static2.anInt5070; local275++) {
												local580 = Static121.anIntArray256[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray191.length; local364++) {
													if (local6.anIntArray191[local364] == local580) {
														local1337 = new Class4_Sub22();
														local1337.aClass72_12 = local6;
														local1337.anObjectArray34 = local6.anObjectArray21;
														Static238.aClass130_107.method3510(local1337);
														break label615;
													}
												}
											}
										}
										local6.anInt1883 = Static2.anInt5070;
									}
									if (local6.anObjectArray13 != null && Static169.anInt3755 > local6.anInt1858) {
										if (local6.anIntArray190 == null || Static169.anInt3755 - local6.anInt1858 > 32) {
											local445 = new Class4_Sub22();
											local445.aClass72_12 = local6;
											local445.anObjectArray34 = local6.anObjectArray13;
											Static238.aClass130_107.method3510(local445);
										} else {
											label595: for (local275 = local6.anInt1858; local275 < Static169.anInt3755; local275++) {
												local580 = Static153.anIntArray308[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray190.length; local364++) {
													if (local6.anIntArray190[local364] == local580) {
														local1337 = new Class4_Sub22();
														local1337.aClass72_12 = local6;
														local1337.anObjectArray34 = local6.anObjectArray13;
														Static238.aClass130_107.method3510(local1337);
														break label595;
													}
												}
											}
										}
										local6.anInt1858 = Static169.anInt3755;
									}
									if (Static213.anInt4435 > local6.anInt1855 && local6.anObjectArray23 != null) {
										local445 = new Class4_Sub22();
										local445.aClass72_12 = local6;
										local445.anObjectArray34 = local6.anObjectArray23;
										Static238.aClass130_107.method3510(local445);
									}
									if (Static345.anInt6764 > local6.anInt1855 && local6.anObjectArray22 != null) {
										local445 = new Class4_Sub22();
										local445.aClass72_12 = local6;
										local445.anObjectArray34 = local6.anObjectArray22;
										Static238.aClass130_107.method3510(local445);
									}
									if (Static211.anInt4419 > local6.anInt1855 && local6.anObjectArray4 != null) {
										local445 = new Class4_Sub22();
										local445.aClass72_12 = local6;
										local445.anObjectArray34 = local6.anObjectArray4;
										Static238.aClass130_107.method3510(local445);
									}
									if (Static3.anInt40 > local6.anInt1855 && local6.anObjectArray19 != null) {
										local445 = new Class4_Sub22();
										local445.aClass72_12 = local6;
										local445.anObjectArray34 = local6.anObjectArray19;
										Static238.aClass130_107.method3510(local445);
									}
									if (Static113.anInt6473 > local6.anInt1855 && local6.anObjectArray29 != null) {
										local445 = new Class4_Sub22();
										local445.aClass72_12 = local6;
										local445.anObjectArray34 = local6.anObjectArray29;
										Static238.aClass130_107.method3510(local445);
									}
									local6.anInt1855 = Static344.anInt6736;
									if (local6.anObjectArray16 != null) {
										for (local275 = 0; local275 < Static352.anInt6604; local275++) {
											@Pc(1805) Class4_Sub22 local1805 = new Class4_Sub22();
											local1805.aClass72_12 = local6;
											local1805.anInt3123 = Static129.anIntArray269[local275];
											local1805.anInt3120 = Static305.anIntArray501[local275];
											local1805.anObjectArray34 = local6.anObjectArray16;
											Static238.aClass130_107.method3510(local1805);
										}
									}
									if (Static268.aBoolean485 && local6.anObjectArray5 != null) {
										local445 = new Class4_Sub22();
										local445.aClass72_12 = local6;
										local445.anObjectArray34 = local6.anObjectArray5;
										Static238.aClass130_107.method3510(local445);
									}
								}
								if (local6.anInt1825 == 5 && local6.anInt1865 != -1) {
									local6.method1514().method4227(Static164.aClass92_7, local6.anInt1806);
								}
							}
							if (!local6.aBoolean159 && Static301.aClass72_19 == null && Static215.aClass72_15 == null && !Static173.aBoolean319) {
								if ((local6.anInt1884 >= 0 || local6.anInt1868 != 0) && Static38.anInt830 >= local28 && Static184.anInt4055 >= local30 && Static38.anInt830 < local32 && Static184.anInt4055 < local34) {
									if (local6.anInt1884 >= 0) {
										Static55.aClass72_4 = arg0[local6.anInt1884];
									} else {
										Static55.aClass72_4 = local6;
									}
								}
								if (local6.anInt1825 == 8 && Static38.anInt830 >= local28 && Static184.anInt4055 >= local30 && Static38.anInt830 < local32 && Static184.anInt4055 < local34) {
									Static346.aClass72_21 = local6;
								}
								if (local6.anInt1795 > local6.anInt1806) {
									Static44.method808(local6, Static38.anInt830, local22, local17 + local6.anInt1829, local6.anInt1806, Static184.anInt4055, local6.anInt1795);
								}
							}
							Static8.method241(arg5, arg2, local6, arg4, arg3, local17, local22);
							if (local6.anInt1825 == 0) {
								method872(arg0, local6.anInt1830, local28, local30, local32, local34, local17 - local6.anInt1841, local22 - local6.anInt1864);
								if (local6.aClass72Array1 != null) {
									method872(local6.aClass72Array1, local6.anInt1830, local28, local30, local32, local34, local17 - local6.anInt1841, local22 - local6.anInt1864);
								}
								@Pc(1998) Class4_Sub8 local1998 = (Class4_Sub8) Static38.aClass198_5.method5261((long) local6.anInt1830);
								if (local1998 != null) {
									if (local1998.anInt1671 == 0 && !Static173.aBoolean319 && local223 && !Static93.aBoolean179) {
										Static67.method1256();
									}
									method881(local1998.anInt1670, local30, local22, local34, local17, local28, local32);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static8.method241(arg5, arg2, local6, arg4, arg3, local17, local22);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!fd;)Lclient!fd;")
	public static Class72 method874(@OriginalArg(0) Class72 arg0) {
		@Pc(4) int local4 = method876(arg0).method256();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static66.method1243(arg0.anInt1813);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method875(@OriginalArg(1) int[] arg0) {
		@Pc(17) StringBuffer local17 = new StringBuffer();
		@Pc(19) int local19 = Static118.anInt2542;
		for (@Pc(21) int local21 = 0; local21 < arg0.length; local21++) {
			@Pc(29) Class65 local29 = Static268.method4669(arg0[local21]);
			if (local29.anInt1657 != -1) {
				@Pc(42) Class60 local42 = (Class60) Static83.aClass154_27.method4222((long) local29.anInt1657);
				if (local42 == null) {
					@Pc(50) Class206 local50 = Static367.method5452(Static292.aClass11_130, local29.anInt1657, 0);
					if (local50 != null) {
						local42 = Static164.aClass92_7.method4506(local50);
						Static83.aClass154_27.method4221((long) local29.anInt1657, local42);
					}
				}
				if (local42 != null) {
					Static229.aClass60Array12[local19] = local42;
					local17.append(" <img=").append(local19).append(">");
					local19++;
				}
			}
		}
		return local17.toString();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!fd;)Lclient!ak;")
	public static Class4_Sub2 method876(@OriginalArg(0) Class72 arg0) {
		@Pc(13) Class4_Sub2 local13 = (Class4_Sub2) Static18.aClass198_2.method5261(((long) arg0.anInt1830 << 32) + (long) arg0.anInt1849);
		return local13 == null ? arg0.aClass4_Sub2_3 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!tq;)Lclient!od;")
	public static Class122_Sub1 method877(@OriginalArg(1) Class4_Sub7 arg0) {
		return new Class122_Sub1(arg0.method2396(), arg0.method2396(), arg0.method2396(), arg0.method2396(), arg0.method2396(), arg0.method2396(), arg0.method2396(), arg0.method2396(), arg0.method2402(), arg0.method2380());
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method878() {
		Static304.anInt6131 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static282.anInt5712; local3++) {
			@Pc(10) Class2_Sub2_Sub1_Sub2 local10 = Static101.aClass2_Sub2_Sub1_Sub2Array6[Static332.anIntArray523[local3]];
			if (local10.aBoolean568 && local10.method5436() != -1) {
				@Pc(28) int local28 = (local10.method5425() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6465 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6466 - local28 >> 7;
				@Pc(48) Class2_Sub2_Sub1 local48 = Static123.method2466(local42, local35, Static279.anInt5645);
				if (local48 != null) {
					@Pc(53) int local53 = local48.anInt6535;
					if (local48 instanceof Class2_Sub2_Sub1_Sub2) {
						local53 += 2048;
					}
					if (local48.anInt6508 == 0 && local48.method5436() != -1) {
						Static13.anIntArray45[Static304.anInt6131] = local53;
						Static139.anIntArray282[Static304.anInt6131] = local53;
						Static304.anInt6131++;
						local48.anInt6508++;
					}
					Static13.anIntArray45[Static304.anInt6131] = local53;
					Static139.anIntArray282[Static304.anInt6131] = local10.anInt6535 + 2048;
					Static304.anInt6131++;
					local48.anInt6508++;
				}
			}
		}
		Static282.method4833(Static139.anIntArray282, Static13.anIntArray45, 0, Static304.anInt6131 - 1);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method879() {
		@Pc(14) boolean local14 = Static235.anInt6712 == 1 && Static156.anInt3506 > 200 || Static235.anInt6712 == 0 && Static156.anInt3506 > 50;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static156.anInt3506; local16++) {
			@Pc(23) Class2_Sub2_Sub1_Sub1 local23 = Static253.aClass2_Sub2_Sub1_Sub1Array1[Static39.anIntArray105[local16]];
			if (local23.method651()) {
				local23.method5415();
				if (local23.aShort85 >= 0 && local23.aShort84 >= 0 && local23.aShort83 < Static92.anInt2048 && local23.aShort82 < Static290.anInt5893) {
					local23.aBoolean44 = local23.aBoolean569 ? local14 : false;
					local62 = 0;
					if (!local23.aBoolean568) {
						local62++;
					}
					if (local23.anInt6488 > Static342.anInt6706) {
						local62 += 2;
					}
					local62 += 5 - local23.method5425() << 2;
					if (Static294.anInt4001 == 0) {
						local62 += 32;
					} else {
						local62 += 128;
					}
					local62 += 256;
					local23.anInt6476 = local62 + 1;
				} else {
					local23.anInt6476 = -1;
				}
			} else {
				local23.anInt6476 = -1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static282.anInt5712; local98++) {
			@Pc(105) Class2_Sub2_Sub1_Sub2 local105 = Static101.aClass2_Sub2_Sub1_Sub2Array6[Static332.anIntArray523[local98]];
			if (local105.method5441() && local105.aClass34_1.method742()) {
				local105.method5415();
				if (local105.aShort85 >= 0 && local105.aShort84 >= 0 && local105.aShort83 < Static92.anInt2048 && local105.aShort82 < Static290.anInt5893) {
					@Pc(141) int local141 = 0;
					if (!local105.aBoolean568) {
						local141++;
					}
					if (local105.anInt6488 > Static342.anInt6706) {
						local141 += 2;
					}
					local141 += 5 - local105.method5425() << 2;
					if (Static294.anInt4001 == 0) {
						if (local105.aClass34_1.aBoolean58) {
							local141 += 64;
						} else {
							local141 += 128;
						}
					} else if (Static294.anInt4001 == 1) {
						if (local105.aClass34_1.aBoolean58) {
							local141 += 32;
						} else {
							local141 += 64;
						}
					}
					if (local105.aClass34_1.aBoolean59) {
						local141 += 512;
					} else if (!local105.aClass34_1.aBoolean55) {
						local141 += 256;
					}
					local105.anInt6476 = local141 + 1;
				} else {
					local105.anInt6476 = -1;
				}
			} else {
				local105.anInt6476 = -1;
			}
		}
		for (local62 = 0; local62 < Static190.aClass121Array1.length; local62++) {
			@Pc(207) Class121 local207 = Static190.aClass121Array1[local62];
			if (local207 != null) {
				if (local207.anInt3844 == 1) {
					@Pc(218) Class2_Sub2_Sub1_Sub2 local218 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local207.anInt3846];
					if (local218 != null && local218.anInt6476 >= 0) {
						local218.anInt6476 += 1024;
					}
				} else if (local207.anInt3844 == 10) {
					@Pc(239) Class2_Sub2_Sub1_Sub1 local239 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local207.anInt3846];
					if (local239 != null && local239.anInt6476 >= 0) {
						local239.anInt6476 += 1024;
					}
				}
			}
		}
		Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6476 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIZILclient!qs;IIIILclient!vm;I)V")
	public static void method880(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class174 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class92 arg10, @OriginalArg(12) int arg11) {
		if (!Static313.method5257() && !Static213.method3693(arg1, arg9, Static45.anInt5654, arg2)) {
			return;
		}
		if (Static68.anInt1532 > arg9) {
			Static68.anInt1532 = arg9;
		}
		@Pc(31) Class56 local31 = Static320.method5290(arg7);
		if (Static6.anInt1971 == 1 && local31.aBoolean101) {
			return;
		}
		@Pc(47) int local47;
		@Pc(50) int local50;
		if (arg11 == 1 || arg11 == 3) {
			local47 = local31.anInt1330;
			local50 = local31.anInt1313;
		} else {
			local50 = local31.anInt1330;
			local47 = local31.anInt1313;
		}
		@Pc(70) int local70;
		@Pc(68) int local68;
		if (Static92.anInt2048 < arg2 + local47) {
			local68 = arg2 + 1;
			local70 = arg2;
		} else {
			local70 = (local47 >> 1) + arg2;
			local68 = arg2 + (local47 + 1 >> 1);
		}
		@Pc(98) int local98;
		@Pc(102) int local102;
		if (local50 + arg1 > Static290.anInt5893) {
			local98 = arg1;
			local102 = arg1 + 1;
		} else {
			local98 = arg1 + (local50 >> 1);
			local102 = (local50 + 1 >> 1) + arg1;
		}
		@Pc(123) Class26 local123 = Static307.aClass26Array3[arg3];
		@Pc(148) int local148 = local123.method4996(local70, local98) + local123.method4996(local68, local98) + local123.method4996(local70, local102) + local123.method4996(local68, local102) >> 2;
		@Pc(157) int local157 = (arg2 << 7) + (local47 << 6);
		@Pc(165) int local165 = (local50 << 6) + (arg1 << 7);
		@Pc(176) boolean local176 = arg4 && !arg0 && local31.aBoolean113;
		if (local31.method1080()) {
			Static55.method1013(arg11, arg1, arg2, null, null, arg9, local31);
		}
		@Pc(212) boolean local212 = arg5 == -1 && local31.anInt1348 == -1 && local31.anIntArray145 == null && local31.anIntArray151 == null && !local31.aBoolean112;
		if (Static291.aBoolean520 && local31.anInt1337 != 1) {
			return;
		}
		if (arg8 != 22) {
			@Pc(340) Class2_Sub2 local340;
			@Pc(308) Class2_Sub2_Sub2 local308;
			@Pc(312) int local312;
			@Pc(404) int local404;
			if (arg8 == 10 || arg8 == 11) {
				local308 = null;
				if (local212) {
					@Pc(370) Class2_Sub2_Sub2 local370 = new Class2_Sub2_Sub2(arg10, local31, arg9, arg3, local157, local148, local165, arg0, arg2, arg2 + local47 - 1, arg1, local50 + arg1 - 1, arg8, arg11, local176);
					local308 = local370;
					local312 = local370.method985();
					local340 = local370;
				} else {
					local312 = 15;
					local340 = new Class2_Sub2_Sub3(arg10, local31, arg8, arg11, arg9, arg3, local157, local148, local165, arg0, arg2, arg2 + local47 - 1, arg1, local50 + arg1 - 1, arg5);
				}
				if (Static242.method4205(local340, false)) {
					if (local308 != null && local308.method4728()) {
						local308.method4730(arg10);
					}
					if (local31.aBoolean102 && arg4) {
						if (local312 > 30) {
							local312 = 30;
						}
						for (local404 = 0; local404 <= local47; local404++) {
							for (@Pc(408) int local408 = 0; local408 <= local50; local408++) {
								local123.method5002(local404 + arg2, arg1 + local408, local312);
							}
						}
					}
				}
				if (local31.anInt1350 != 0 && arg6 != null) {
					arg6.method4663(arg2, !local31.aBoolean105, local47, local50, arg1, local31.aBoolean100);
				}
			} else if (arg8 >= 12 && arg8 <= 17 || arg8 >= 18 && arg8 <= 21) {
				if (local212) {
					local308 = new Class2_Sub2_Sub2(arg10, local31, arg9, arg3, local157, local148, local165, arg0, arg2, local47 + arg2 - 1, arg1, local50 + arg1 - 1, arg8, arg11, local176);
					if (local308.method4728()) {
						local308.method4730(arg10);
					}
					local340 = local308;
				} else {
					local340 = new Class2_Sub2_Sub3(arg10, local31, arg8, arg11, arg9, arg3, local157, local148, local165, arg0, arg2, arg2 + local47 - 1, arg1, arg1 + local50 - 1, arg5);
				}
				Static242.method4205(local340, false);
				if (arg4 && !arg0 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg9 > 0 && local31.anInt1337 != 0) {
					Static83.aByteArrayArrayArray2[arg9][arg2][arg1] = (byte) (Static83.aByteArrayArrayArray2[arg9][arg2][arg1] | 0x4);
				}
				if (local31.anInt1350 != 0 && arg6 != null) {
					arg6.method4663(arg2, !local31.aBoolean105, local47, local50, arg1, local31.aBoolean100);
				}
			} else {
				@Pc(643) Class2_Sub4_Sub1 local643;
				@Pc(627) Class2_Sub4 local627;
				if (arg8 == 0) {
					if (local212) {
						local643 = new Class2_Sub4_Sub1(arg10, local31, arg3, local157, local148, local165, arg0, arg8, arg11, local176);
						if (local643.method4728()) {
							local643.method4730(arg10);
						}
						local627 = local643;
					} else {
						local627 = new Class2_Sub4_Sub2(arg10, local31, 0, arg11, arg9, arg3, local157, local148, local165, arg0, arg5);
					}
					Static282.method4834(arg9, arg2, arg1, local627, null);
					if (arg4) {
						if (arg11 == 0) {
							if (local31.aBoolean102) {
								local123.method5002(arg2, arg1, 50);
								local123.method5002(arg2, arg1 + 1, 50);
							}
							if (local31.anInt1337 == 1 && !arg0) {
								Static83.aByteArrayArrayArray2[arg9][arg2][arg1] = (byte) (Static83.aByteArrayArrayArray2[arg9][arg2][arg1] | 0x1);
							}
						} else if (arg11 == 1) {
							if (local31.aBoolean102) {
								local123.method5002(arg2, arg1 + 1, 50);
								local123.method5002(arg2 + 1, arg1 - -1, 50);
							}
							if (local31.anInt1337 == 1 && !arg0) {
								Static83.aByteArrayArrayArray2[arg9][arg2][arg1 + 1] = (byte) (Static83.aByteArrayArrayArray2[arg9][arg2][arg1 + 1] | 0x2);
							}
						} else if (arg11 == 2) {
							if (local31.aBoolean102) {
								local123.method5002(arg2 + 1, arg1, 50);
								local123.method5002(arg2 + 1, arg1 + 1, 50);
							}
							if (local31.anInt1337 == 1 && !arg0) {
								Static83.aByteArrayArrayArray2[arg9][arg2 + 1][arg1] = (byte) (Static83.aByteArrayArrayArray2[arg9][arg2 + 1][arg1] | 0x1);
							}
						} else if (arg11 == 3) {
							if (local31.aBoolean102) {
								local123.method5002(arg2, arg1, 50);
								local123.method5002(arg2 + 1, arg1, 50);
							}
							if (local31.anInt1337 == 1 && !arg0) {
								Static83.aByteArrayArrayArray2[arg9][arg2][arg1] = (byte) (Static83.aByteArrayArrayArray2[arg9][arg2][arg1] | 0x2);
							}
						}
					}
					if (local31.anInt1350 != 0 && arg6 != null) {
						arg6.method4662(arg8, arg11, arg1, arg2, local31.aBoolean100, !local31.aBoolean105);
					}
					if (local31.anInt1343 != 16) {
						Static321.method5310(arg9, arg2, arg1, local31.anInt1343);
					}
				} else if (arg8 == 1) {
					if (local212) {
						local643 = new Class2_Sub4_Sub1(arg10, local31, arg3, local157, local148, local165, arg0, arg8, arg11, local176);
						local627 = local643;
						if (local643.method4728()) {
							local643.method4730(arg10);
						}
					} else {
						local627 = new Class2_Sub4_Sub2(arg10, local31, 1, arg11, arg9, arg3, local157, local148, local165, arg0, arg5);
					}
					Static282.method4834(arg9, arg2, arg1, local627, null);
					if (local31.aBoolean102 && arg4) {
						if (arg11 == 0) {
							local123.method5002(arg2, arg1 + 1, 50);
						} else if (arg11 == 1) {
							local123.method5002(arg2 + 1, arg1 + 1, 50);
						} else if (arg11 == 2) {
							local123.method5002(arg2 + 1, arg1, 50);
						} else if (arg11 == 3) {
							local123.method5002(arg2, arg1, 50);
						}
					}
					if (local31.anInt1350 != 0 && arg6 != null) {
						arg6.method4662(arg8, arg11, arg1, arg2, local31.aBoolean100, !local31.aBoolean105);
					}
				} else if (arg8 == 2) {
					local312 = arg11 + 1 & 0x3;
					@Pc(1067) Class2_Sub4 local1067;
					if (local212) {
						@Pc(1085) Class2_Sub4_Sub1 local1085 = new Class2_Sub4_Sub1(arg10, local31, arg3, local157, local148, local165, arg0, arg8, arg11 + 4, local176);
						@Pc(1099) Class2_Sub4_Sub1 local1099 = new Class2_Sub4_Sub1(arg10, local31, arg3, local157, local148, local165, arg0, arg8, local312, local176);
						if (local1085.method4728()) {
							local1085.method4730(arg10);
						}
						if (local1099.method4728()) {
							local1099.method4730(arg10);
						}
						local1067 = local1099;
						local627 = local1085;
					} else {
						local627 = new Class2_Sub4_Sub2(arg10, local31, 2, arg11 + 4, arg9, arg3, local157, local148, local165, arg0, arg5);
						local1067 = new Class2_Sub4_Sub2(arg10, local31, 2, local312, arg9, arg3, local157, local148, local165, arg0, arg5);
					}
					Static282.method4834(arg9, arg2, arg1, local627, local1067);
					if (local31.anInt1337 == 1 && arg4 && !arg0) {
						if (arg11 == 0) {
							Static83.aByteArrayArrayArray2[arg9][arg2][arg1] = (byte) (Static83.aByteArrayArrayArray2[arg9][arg2][arg1] | 0x1);
							Static83.aByteArrayArrayArray2[arg9][arg2][arg1 + 1] = (byte) (Static83.aByteArrayArrayArray2[arg9][arg2][arg1 + 1] | 0x2);
						} else if (arg11 == 1) {
							Static83.aByteArrayArrayArray2[arg9][arg2][arg1 + 1] = (byte) (Static83.aByteArrayArrayArray2[arg9][arg2][arg1 + 1] | 0x2);
							Static83.aByteArrayArrayArray2[arg9][arg2 + 1][arg1] = (byte) (Static83.aByteArrayArrayArray2[arg9][arg2 + 1][arg1] | 0x1);
						} else if (arg11 == 2) {
							Static83.aByteArrayArrayArray2[arg9][arg2 + 1][arg1] = (byte) (Static83.aByteArrayArrayArray2[arg9][arg2 + 1][arg1] | 0x1);
							Static83.aByteArrayArrayArray2[arg9][arg2][arg1] = (byte) (Static83.aByteArrayArrayArray2[arg9][arg2][arg1] | 0x2);
						} else if (arg11 == 3) {
							Static83.aByteArrayArrayArray2[arg9][arg2][arg1] = (byte) (Static83.aByteArrayArrayArray2[arg9][arg2][arg1] | 0x2);
							Static83.aByteArrayArrayArray2[arg9][arg2][arg1] = (byte) (Static83.aByteArrayArrayArray2[arg9][arg2][arg1] | 0x1);
						}
					}
					if (local31.anInt1350 != 0 && arg6 != null) {
						arg6.method4662(arg8, arg11, arg1, arg2, local31.aBoolean100, !local31.aBoolean105);
					}
					if (local31.anInt1343 != 16) {
						Static321.method5310(arg9, arg2, arg1, local31.anInt1343);
					}
				} else if (arg8 == 3) {
					if (local212) {
						local643 = new Class2_Sub4_Sub1(arg10, local31, arg3, local157, local148, local165, arg0, arg8, arg11, local176);
						if (local643.method4728()) {
							local643.method4730(arg10);
						}
						local627 = local643;
					} else {
						local627 = new Class2_Sub4_Sub2(arg10, local31, 3, arg11, arg9, arg3, local157, local148, local165, arg0, arg5);
					}
					Static282.method4834(arg9, arg2, arg1, local627, null);
					if (local31.aBoolean102 && arg4) {
						if (arg11 == 0) {
							local123.method5002(arg2, arg1 + 1, 50);
						} else if (arg11 == 1) {
							local123.method5002(arg2 + 1, arg1 + 1, 50);
						} else if (arg11 == 2) {
							local123.method5002(arg2 + 1, arg1, 50);
						} else if (arg11 == 3) {
							local123.method5002(arg2, arg1, 50);
						}
					}
					if (local31.anInt1350 != 0 && arg6 != null) {
						arg6.method4662(arg8, arg11, arg1, arg2, local31.aBoolean100, !local31.aBoolean105);
					}
				} else if (arg8 == 9) {
					if (local212) {
						local308 = new Class2_Sub2_Sub2(arg10, local31, arg9, arg3, local157, local148, local165, arg0, arg2, arg2, arg1, arg1, arg8, arg11, local176);
						if (local308.method4728()) {
							local308.method4730(arg10);
						}
						local340 = local308;
					} else {
						local340 = new Class2_Sub2_Sub3(arg10, local31, arg8, arg11, arg9, arg3, local157, local148, local165, arg0, arg2, arg2 + local47 - 1, arg1, arg1 + local50 - 1, arg5);
					}
					Static242.method4205(local340, false);
					if (local31.anInt1350 != 0 && arg6 != null) {
						arg6.method4663(arg2, !local31.aBoolean105, local47, local50, arg1, local31.aBoolean100);
					}
					if (local31.anInt1343 != 16) {
						Static321.method5310(arg9, arg2, arg1, local31.anInt1343);
					}
				} else {
					@Pc(1600) Class2_Sub1 local1600;
					if (arg8 == 4) {
						if (local212) {
							@Pc(1618) Class2_Sub1_Sub2 local1618 = new Class2_Sub1_Sub2(arg10, local31, arg3, local157, local148, local165, arg0, 0, 0, 0, arg8, arg11);
							if (local1618.method4728()) {
								local1618.method4730(arg10);
							}
							local1600 = local1618;
						} else {
							local1600 = new Class2_Sub1_Sub1(arg10, local31, arg8, arg11, arg9, arg3, local157, local148, local165, arg0, 0, 0, 0, arg5);
						}
						Static224.method3844(arg9, arg2, arg1, local1600, null);
					} else {
						@Pc(1642) int local1642;
						@Pc(1648) Interface5 local1648;
						@Pc(1711) Class2_Sub1_Sub2 local1711;
						if (arg8 == 5) {
							local1642 = 16;
							local1648 = (Interface5) Static122.method2458(arg9, arg2, arg1);
							if (local1648 != null) {
								local1642 = Static320.method5290(local1648.method4729()).anInt1343;
							}
							if (local212) {
								local1711 = new Class2_Sub1_Sub2(arg10, local31, arg3, local157, local148, local165, arg0, 0, Static254.anIntArray431[arg11] * local1642, Static279.anIntArray459[arg11] * local1642, arg8, arg11);
								if (local1711.method4728()) {
									local1711.method4730(arg10);
								}
								local1600 = local1711;
							} else {
								local1600 = new Class2_Sub1_Sub1(arg10, local31, arg8, arg11, arg9, arg3, local157, local148, local165, arg0, 0, local1642 * Static254.anIntArray431[arg11], Static279.anIntArray459[arg11] * local1642, arg5);
							}
							Static224.method3844(arg9, arg2, arg1, local1600, null);
						} else if (arg8 == 6) {
							local1642 = 8;
							local1648 = (Interface5) Static122.method2458(arg9, arg2, arg1);
							if (local1648 != null) {
								local1642 = Static320.method5290(local1648.method4729()).anInt1343 / 2;
							}
							if (local212) {
								local1711 = new Class2_Sub1_Sub2(arg10, local31, arg3, local157, local148, local165, arg0, arg11, Static254.anIntArray431[arg11] * local1642, local1642 * Static279.anIntArray459[arg11], arg8, arg11 + 4);
								local1600 = local1711;
								if (local1711.method4728()) {
									local1711.method4730(arg10);
								}
							} else {
								local1600 = new Class2_Sub1_Sub1(arg10, local31, arg8, arg11 + 4, arg9, arg3, local157, local148, local165, arg0, arg11, Static87.anIntArray195[arg11] * local1642, local1642 * Static57.anIntArray141[arg11], arg5);
							}
							Static224.method3844(arg9, arg2, arg1, local1600, null);
						} else if (arg8 == 7) {
							local1642 = arg11 + 2 & 0x3;
							if (local212) {
								@Pc(1880) Class2_Sub1_Sub2 local1880 = new Class2_Sub1_Sub2(arg10, local31, arg3, local157, local148, local165, arg0, local1642, 0, 0, arg8, local1642 + 4);
								if (local1880.method4728()) {
									local1880.method4730(arg10);
								}
								local1600 = local1880;
							} else {
								local1600 = new Class2_Sub1_Sub1(arg10, local31, arg8, local1642 + 4, arg9, arg3, local157, local148, local165, arg0, local1642, 0, 0, arg5);
							}
							Static224.method3844(arg9, arg2, arg1, local1600, null);
						} else if (arg8 == 8) {
							local312 = arg11 + 2 & 0x3;
							local404 = 8;
							@Pc(1916) Interface5 local1916 = (Interface5) Static122.method2458(arg9, arg2, arg1);
							if (local1916 != null) {
								local404 = Static320.method5290(local1916.method4729()).anInt1343 / 2;
							}
							@Pc(1955) Class2_Sub1 local1955;
							@Pc(1973) Class2_Sub1 local1973;
							if (local212) {
								local1955 = new Class2_Sub1_Sub2(arg10, local31, arg3, local157, local148, local165, arg0, arg11, local404 * Static87.anIntArray195[arg11], local404 * Static57.anIntArray141[arg11], arg8, arg11 + 4);
								local1973 = new Class2_Sub1_Sub2(arg10, local31, arg3, local157, local148, local165, arg0, arg11, 0, 0, arg8, local312 + 4);
								if (local1955.method4728()) {
									local1955.method4730(arg10);
								}
								if (local1973.method4728()) {
									local1973.method4730(arg10);
								}
							} else {
								local1955 = new Class2_Sub1_Sub1(arg10, local31, arg8, arg11, arg9, arg3, local157, local148, local165, arg0, arg11, local404 * Static87.anIntArray195[arg11], local404 * Static57.anIntArray141[arg11], arg5);
								local1973 = new Class2_Sub1_Sub1(arg10, local31, arg8, arg11, arg9, arg3, local157, local148, local165, arg0, arg11, 0, 0, arg5);
							}
							Static224.method3844(arg9, arg2, arg1, local1955, local1973);
						}
					}
				}
			}
		} else if (Static135.aBoolean261 || local31.anInt1336 != 0 || local31.anInt1350 == 1 || local31.aBoolean114) {
			@Pc(254) Class2_Sub5 local254;
			if (local212) {
				@Pc(269) Class2_Sub5_Sub1 local269 = new Class2_Sub5_Sub1(arg10, local31, arg3, local157, local148, local165, arg0, arg11, local176);
				local254 = local269;
				if (local269.method4728()) {
					local269.method4730(arg10);
				}
			} else {
				local254 = new Class2_Sub5_Sub2(arg10, local31, arg11, arg9, arg3, local157, local148, local165, arg0, arg5);
			}
			Static248.method4310(arg9, arg2, arg1, local254);
			if (local31.anInt1350 == 1 && arg6 != null) {
				arg6.method4666(arg2, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	public static void method881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static266.method4641(arg0)) {
			method872(Static158.aClass72ArrayArray1[arg0], -1, arg5, arg1, arg6, arg3, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method884() {
		for (@Pc(1) int local1 = -1; local1 < Static156.anInt3506 + Static282.anInt5712; local1++) {
			@Pc(6) Class2_Sub2_Sub1 local6;
			if (local1 < 0) {
				local6 = Static110.aClass2_Sub2_Sub1_Sub1_1;
			} else if (local1 < Static156.anInt3506) {
				local6 = Static253.aClass2_Sub2_Sub1_Sub1Array1[Static39.anIntArray105[local1]];
			} else {
				local6 = Static101.aClass2_Sub2_Sub1_Sub2Array6[Static332.anIntArray523[local1 - Static156.anInt3506]];
			}
			if (local6.anInt6476 >= 0) {
				@Pc(32) int local32 = local6.method5425();
				if ((local32 & 0x1) == 0) {
					if ((local6.anInt6465 & 0x7F) != 0 || (local6.anInt6466 & 0x7F) != 0) {
						continue;
					}
				} else if ((local6.anInt6465 & 0x7F) != 64 || (local6.anInt6466 & 0x7F) != 64) {
					continue;
				}
				@Pc(109) int local109;
				@Pc(68) int local68;
				@Pc(73) int local73;
				if (local32 == 1) {
					local68 = local6.anInt6465 >> 7;
					local73 = local6.anInt6466 >> 7;
					if (local6.anInt6476 > Static251.anIntArrayArray49[local68][local73]) {
						Static251.anIntArrayArray49[local68][local73] = local6.anInt6476;
						Static116.anIntArrayArray16[local68][local73] = 1;
					} else if (local6.anInt6476 == Static251.anIntArrayArray49[local68][local73]) {
						local109 = Static116.anIntArrayArray16[local68][local73]++;
					}
				} else {
					local68 = (local32 - 1) * 64 + 60;
					local73 = local6.anInt6465 - local68 >> 7;
					@Pc(135) int local135 = local6.anInt6466 - local68 >> 7;
					@Pc(142) int local142 = local6.anInt6465 + local68 >> 7;
					@Pc(149) int local149 = local6.anInt6466 + local68 >> 7;
					for (@Pc(151) int local151 = local73; local151 <= local142; local151++) {
						for (@Pc(154) int local154 = local135; local154 <= local149; local154++) {
							if (local6.anInt6476 > Static251.anIntArrayArray49[local151][local154]) {
								Static251.anIntArrayArray49[local151][local154] = local6.anInt6476;
								Static116.anIntArrayArray16[local151][local154] = 1;
							} else if (local6.anInt6476 == Static251.anIntArrayArray49[local151][local154]) {
								local109 = Static116.anIntArrayArray16[local151][local154]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!fd;)Z")
	public static boolean method886(@OriginalArg(0) Class72 arg0) {
		if (Static93.aBoolean179) {
			if (method876(arg0).anInt269 != 0) {
				return false;
			}
			if (arg0.anInt1825 == 0) {
				return false;
			}
		}
		return arg0.aBoolean148;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method890() {
		@Pc(7) int local7 = Static144.aBoolean272 ? Static156.anInt3506 : Static156.anInt3506 + Static282.anInt5712;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class2_Sub2_Sub1 local14;
			if (local9 < 0) {
				local14 = Static110.aClass2_Sub2_Sub1_Sub1_1;
			} else if (local9 < Static156.anInt3506) {
				local14 = Static253.aClass2_Sub2_Sub1_Sub1Array1[Static39.anIntArray105[local9]];
			} else {
				local14 = Static101.aClass2_Sub2_Sub1_Sub2Array6[Static332.anIntArray523[local9 - Static156.anInt3506]];
			}
			local14.anInt6508 = 0;
			if (local14.anInt6476 < 0) {
				local14.aBoolean568 = false;
			} else {
				@Pc(47) int local47 = local14.method5425();
				if ((local47 & 0x1) == 0) {
					if ((local14.anInt6465 & 0x7F) != 0 || (local14.anInt6466 & 0x7F) != 0) {
						local14.aBoolean568 = false;
						continue;
					}
				} else if ((local14.anInt6465 & 0x7F) != 64 || (local14.anInt6466 & 0x7F) != 64) {
					local14.aBoolean568 = false;
					continue;
				}
				@Pc(119) int local119;
				@Pc(89) int local89;
				@Pc(94) int local94;
				if (local47 == 1) {
					local89 = local14.anInt6465 >> 7;
					local94 = local14.anInt6466 >> 7;
					if (local14.anInt6476 != Static251.anIntArrayArray49[local89][local94]) {
						local14.aBoolean568 = true;
						continue;
					}
					if (Static116.anIntArrayArray16[local89][local94] > 1) {
						local119 = Static116.anIntArrayArray16[local89][local94]--;
						local14.aBoolean568 = true;
						continue;
					}
				} else {
					local89 = (local47 - 1) * 64 + 60;
					local94 = local14.anInt6465 - local89 >> 7;
					@Pc(148) int local148 = local14.anInt6466 - local89 >> 7;
					@Pc(155) int local155 = local14.anInt6465 + local89 >> 7;
					@Pc(162) int local162 = local14.anInt6466 + local89 >> 7;
					if (!Static213.method3695(local14.anInt6476, local155, local94, local162, local148)) {
						for (@Pc(173) int local173 = local94; local173 <= local155; local173++) {
							for (@Pc(176) int local176 = local148; local176 <= local162; local176++) {
								if (local14.anInt6476 == Static251.anIntArrayArray49[local173][local176]) {
									local119 = Static116.anIntArrayArray16[local173][local176]--;
								}
							}
						}
						local14.aBoolean568 = true;
						continue;
					}
				}
				if (local14 instanceof Class2_Sub2_Sub1_Sub1 && local14.anInterface5_3 != null && Static342.anInt6706 >= local14.anInt6546 && Static342.anInt6706 < local14.anInt6554) {
					((Class2_Sub2_Sub1_Sub1) local14).aBoolean44 = false;
				}
				local14.aBoolean568 = false;
				local14.anInt6464 = Static119.method2125(local14.anInt6465, local14.anInt6466, Static279.anInt5645);
				Static242.method4205(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class57 local7 = Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class95 local13 = local7.aClass95_2; local13 != null; local13 = local13.aClass95_3) {
			@Pc(17) Class2_Sub2 local17 = local13.aClass2_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort85 == arg1 && local17.aShort84 == arg2) {
				Static37.method720(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method892() {
		@Pc(7) int local7 = Static144.aBoolean272 ? Static156.anInt3506 : Static156.anInt3506 + Static282.anInt5712;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class2_Sub2_Sub1 local14;
			if (local9 < 0) {
				local14 = Static110.aClass2_Sub2_Sub1_Sub1_1;
			} else if (local9 < Static156.anInt3506) {
				local14 = Static253.aClass2_Sub2_Sub1_Sub1Array1[Static39.anIntArray105[local9]];
			} else {
				local14 = Static101.aClass2_Sub2_Sub1_Sub2Array6[Static332.anIntArray523[local9 - Static156.anInt3506]];
			}
			if (local14.anInt6476 >= 0) {
				@Pc(40) int local40 = local14.method5425();
				if ((local40 & 0x1) == 0) {
					if ((local14.anInt6465 & 0x7F) == 0 && (local14.anInt6466 & 0x7F) == 0) {
						continue;
					}
				} else if ((local14.anInt6465 & 0x7F) == 64 && (local14.anInt6466 & 0x7F) == 64) {
					continue;
				}
				if (local14 instanceof Class2_Sub2_Sub1_Sub1 && local14.anInterface5_3 != null && Static342.anInt6706 >= local14.anInt6546 && Static342.anInt6706 < local14.anInt6554) {
					((Class2_Sub2_Sub1_Sub1) local14).aBoolean44 = false;
				}
				local14.anInt6464 = Static119.method2125(local14.anInt6465, local14.anInt6466, Static279.anInt5645);
				Static242.method4205(local14, true);
			}
		}
	}
}
