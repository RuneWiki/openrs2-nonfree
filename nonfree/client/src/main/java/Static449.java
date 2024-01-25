import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "Lclient!sm;")
	public static final Class271 aClass271_4 = new Class271();

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "Z")
	public static boolean aBoolean553 = false;

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_113 = new Class306("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "Lclient!im;")
	public static final Class140 aClass140_123 = new Class140(69, 1);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!ge;)Ljava/lang/String;")
	public static String method6407(@OriginalArg(1) Class1_Sub6 arg0) {
		return Static530.method7339(arg0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method6409() {
		return Static15.aBoolean16 || Static46.aClass1_Sub24_1 == null ? "" : Static46.aClass1_Sub24_1.aString35;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!k;III[Z)Z")
	public static boolean method6410(@OriginalArg(0) Class1_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static544.aClass205Array3 != Static209.aClass205Array2) {
			@Pc(11) int local11 = Static16.aClass205Array1[arg1].aa(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class205 local18 = Static16.aClass205Array1[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.aa(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method6746(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.ya(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIII[Lclient!jq;)V")
	public static void method6412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class156[] arg8) {
		Static513.aClass122_10.N(arg7, arg2, arg0, arg5);
		for (@Pc(17) int local17 = 0; local17 < arg8.length; local17++) {
			@Pc(23) Class156 local23 = arg8[local17];
			if (local23 != null && (arg1 == local23.anInt4686 || arg1 == -1412584499 && local23 == Static86.aClass156_4)) {
				@Pc(48) int local48;
				if (arg6 == -1) {
					Class79.aRectangleArray1[Static422.anInt7388].setBounds(arg4 + local23.anInt4734, local23.anInt4702 + arg3, local23.anInt4732, local23.anInt4673);
					local48 = Static422.anInt7388++;
				} else {
					local48 = arg6;
				}
				local23.anInt4679 = local48;
				local23.anInt4701 = Static436.anInt6850;
				if (!Static67.method1236(local23)) {
					if (local23.anInt4729 != 0) {
						Static418.method6141(local23);
					}
					@Pc(95) int local95 = arg4 + local23.anInt4734;
					@Pc(100) int local100 = local23.anInt4702 + arg3;
					@Pc(103) int local103 = local23.anInt4738;
					if (Static54.aBoolean69 && (Static67.method1228(local23).anInt2505 != 0 || local23.anInt4735 == 0) && local103 > 127) {
						local103 = 127;
					}
					@Pc(154) int local154;
					@Pc(158) int local158;
					if (local23 == Static86.aClass156_4) {
						if (arg1 != -1412584499 && (local23.anInt4668 == Static106.anInt2138 || Static284.anInt5345 == local23.anInt4668)) {
							Static296.anInt4449 = arg4;
							Static326.aClass156Array2 = arg8;
							Static51.anInt1017 = arg3;
							continue;
						}
						if (Static341.aBoolean437 && Static206.aBoolean286) {
							local154 = Static498.aClass5_1.method7052();
							local158 = Static498.aClass5_1.method7042();
							local154 -= Static321.anInt5867;
							local158 -= Static127.anInt4394;
							if (local154 < Static45.anInt917) {
								local154 = Static45.anInt917;
							}
							if (Static293.anInt5490 > local158) {
								local158 = Static293.anInt5490;
							}
							if (Static197.aClass156_16.anInt4732 + Static45.anInt917 < local154 - -local23.anInt4732) {
								local154 = Static45.anInt917 + Static197.aClass156_16.anInt4732 - local23.anInt4732;
							}
							local95 = local154;
							if (Static293.anInt5490 + Static197.aClass156_16.anInt4673 < local158 - -local23.anInt4673) {
								local158 = Static293.anInt5490 + Static197.aClass156_16.anInt4673 - local23.anInt4673;
							}
							local100 = local158;
						}
						if (local23.anInt4668 == Static284.anInt5345) {
							local103 = 128;
						}
					}
					@Pc(243) int local243;
					@Pc(249) int local249;
					@Pc(257) int local257;
					@Pc(262) int local262;
					if (local23.anInt4735 == 2) {
						local243 = arg0;
						local158 = arg2;
						local154 = arg7;
						local249 = arg5;
					} else {
						local257 = local95 + local23.anInt4732;
						local262 = local23.anInt4673 + local100;
						if (local23.anInt4735 == 9) {
							local262++;
							local257++;
						}
						local154 = arg7 < local95 ? local95 : arg7;
						local158 = arg2 >= local100 ? arg2 : local100;
						local249 = arg5 <= local262 ? arg5 : local262;
						local243 = arg0 > local257 ? local257 : arg0;
					}
					if (local243 > local154 && local158 < local249) {
						@Pc(510) int local510;
						@Pc(545) int local545;
						@Pc(556) int local556;
						@Pc(650) int local650;
						@Pc(543) int local543;
						if (local23.anInt4729 != 0) {
							if (local23.anInt4729 == Static480.anInt7980 || local23.anInt4729 == Static477.anInt7963) {
								Static358.method7325(local23.anInt4673, local95, local100, Static477.anInt7963 == local23.anInt4729, local23.anInt4732);
								Static3.aBooleanArray1[local48] = true;
								Static513.aClass122_10.N(arg7, arg2, arg0, arg5);
								continue;
							}
							if (local23.anInt4729 == Static108.anInt2197) {
								if (local23.method4057(Static513.aClass122_10) != null) {
									Static63.method1142();
									Static21.method522(local23, Static513.aClass122_10, local95, local100);
									Static236.aBooleanArray29[local48] = true;
									Static513.aClass122_10.N(arg7, arg2, arg0, arg5);
								}
								continue;
							}
							if (Static93.anInt1901 == local23.anInt4729) {
								if (local23.method4057(Static513.aClass122_10) != null) {
									Static542.method7532(local95, local23, local100);
									Static236.aBooleanArray29[local48] = true;
									Static513.aClass122_10.N(arg7, arg2, arg0, arg5);
								}
								continue;
							}
							if (Static98.anInt8158 == local23.anInt4729) {
								Static64.method1151(Static227.anInterface8_11, local95, local100, local23.anInt4732, local23.anInt4673, Static513.aClass122_10);
								Static3.aBooleanArray1[local48] = true;
								Static513.aClass122_10.N(arg7, arg2, arg0, arg5);
								continue;
							}
							if (Static70.anInt6260 == local23.anInt4729) {
								Static233.method4041(Static513.aClass122_10, local95, local23.anInt4732, local100, local23.anInt4673);
								Static3.aBooleanArray1[local48] = true;
								Static513.aClass122_10.N(arg7, arg2, arg0, arg5);
								continue;
							}
							if (Static136.anInt2659 == local23.anInt4729) {
								if (!Static135.aBoolean172 && !Static343.aBoolean438) {
									continue;
								}
								local257 = local95 + local23.anInt4732;
								local262 = local100 + 15;
								if (Static135.aBoolean172) {
									local510 = -256;
									if (Static477.anInt7966 < 20) {
										local510 = -65536;
									}
									Static112.aClass67_3.method7495(local510, local262, local257, "Fps:" + Static477.anInt7966);
									local262 += 15;
									@Pc(534) Runtime local534 = Runtime.getRuntime();
									local543 = (int) ((local534.totalMemory() - local534.freeMemory()) / 1024L);
									local545 = -256;
									if (local543 > 65536) {
										local545 = -65536;
										if (Static5.aBoolean7) {
											Static32.method756();
											for (local556 = 0; local556 < 10; local556++) {
												System.gc();
											}
											local543 = (int) ((local534.totalMemory() - local534.freeMemory()) / 1024L);
											if (local543 > 65536) {
												Static324.method5022("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static112.aClass67_3.method7495(local545, local262, local257, "Mem:" + local543 + "k");
									local262 += 15;
									Static112.aClass67_3.method7495(-256, local262, local257, "In:" + Static17.anInt451 + "B/s Out:" + Static40.anInt858 + "B/s");
									local262 += 15;
									local556 = Static513.aClass122_10.U() / 1024;
									Static112.aClass67_3.method7495(local556 > 65536 ? -65536 : -256, local262, local257, "Offheap:" + local556 + "k");
									local262 += 15;
									local650 = 0;
									@Pc(652) int local652 = 0;
									@Pc(654) int local654 = 0;
									for (@Pc(656) int local656 = 0; local656 < 32; local656++) {
										local650 += Static527.aClass131_Sub1Array2[local656].method7015();
										local652 += Static527.aClass131_Sub1Array2[local656].method7011();
										local654 += Static527.aClass131_Sub1Array2[local656].method7018();
									}
									@Pc(694) int local694 = local654 * 100 / local650;
									@Pc(700) int local700 = local652 * 10000 / local650;
									@Pc(720) String local720 = "Cache:" + Static510.method6253(true, (long) local700, 0, 2) + "% (" + local694 + "%)";
									Static435.aClass67_11.method7495(-256, local262, local257, local720);
									local262 += 12;
								}
								if (Static382.anInt6971 > 0) {
									Static435.aClass67_11.method7495(-256, local262, local257, "Particles: " + Static56.anInt1113 + " / " + Static382.anInt6971);
								}
								local262 += 12;
								if (Static343.aBoolean438) {
									Static435.aClass67_11.method7495(-256, local262, local257, "Polys: " + Static513.aClass122_10.YA() + " Models: " + Static513.aClass122_10.ba());
									local262 += 12;
									Static435.aClass67_11.method7495(-256, local262, local257, "Ls: " + Static220.anInt4342 + " La: " + Static193.anInt7226 + " NPC: " + Static103.anInt2065 + " Pl: " + Static336.anInt6047);
									Static8.method311();
									local262 += 12;
								}
								Static3.aBooleanArray1[local48] = true;
								continue;
							}
						}
						if (local23.anInt4735 == 0) {
							if (Static492.anInt8157 == local23.anInt4729 && Static513.aClass122_10.method7215()) {
								Static513.aClass122_10.method7253(local95, local100, local23.anInt4732, local23.anInt4673);
							}
							method6412(local243, local23.anInt4677, local158, local100 - local23.anInt4707, local95 - local23.anInt4711, local249, local48, local154, arg8);
							if (local23.aClass156Array1 != null) {
								method6412(local243, local23.anInt4677, local158, local100 - local23.anInt4707, -local23.anInt4711 + local95, local249, local48, local154, local23.aClass156Array1);
							}
							@Pc(879) Class1_Sub35 local879 = (Class1_Sub35) Static468.aClass17_36.method738((long) local23.anInt4677);
							if (local879 != null) {
								Static347.method5282(local95, local158, local48, local249, local243, local879.anInt6103, local100, local154);
							}
							if (Static492.anInt8157 == local23.anInt4729 && Static513.aClass122_10.method7215()) {
								Static513.aClass122_10.method7214();
								Static305.aBoolean408 = true;
							}
							Static513.aClass122_10.N(arg7, arg2, arg0, arg5);
						}
						if (Static389.aBooleanArray42[local48] || Static503.anInt8507 > 1) {
							if (local23.anInt4735 == 3) {
								if (local103 == 0) {
									if (local23.aBoolean333) {
										Static513.aClass122_10.f(local95, local100, local23.anInt4732, local23.anInt4673, local23.anInt4662, 0);
									} else {
										Static513.aClass122_10.method7282(local95, local100, local23.anInt4732, local23.anInt4673, local23.anInt4662, 0);
									}
								} else if (local23.aBoolean333) {
									Static513.aClass122_10.f(local95, local100, local23.anInt4732, local23.anInt4673, local23.anInt4662 & 0xFFFFFF | 255 - (local103 & 0xFF) << 24, 1);
								} else {
									Static513.aClass122_10.method7282(local95, local100, local23.anInt4732, local23.anInt4673, local23.anInt4662 & 0xFFFFFF | 255 - (local103 & 0xFF) << 24, 1);
								}
							} else if (local23.anInt4735 == 4) {
								@Pc(1017) Class67 local1017 = local23.method4054(Static513.aClass122_10);
								if (local1017 != null) {
									local262 = local23.anInt4662;
									@Pc(1034) String local1034 = local23.aString42;
									if (local23.anInt4697 != -1) {
										@Pc(1044) Class133 local1044 = Static342.aClass250_2.method5980(local23.anInt4697);
										local1034 = local1044.aString38;
										if (local1034 == null) {
											local1034 = "null";
										}
										if ((local1044.anInt3914 == 1 || local23.anInt4728 != 1) && local23.anInt4728 != -1) {
											local1034 = "<col=ff9040>" + local1034 + "</col> x" + Static302.method4776(local23.anInt4728);
										}
									}
									if (local23 == Static64.aClass156_3) {
										local1034 = Static40.aClass306_13.method7165(Static179.anInt3168);
										local262 = local23.anInt4662;
									}
									if (Static440.aBoolean545) {
										Static513.aClass122_10.F(local95, local100, local95 + local23.anInt4732, local100 + local23.anInt4673);
									}
									local1017.method7483(255 - (local103 & 0xFF) << 24 | local262, 0, null, Static415.aClass2Array14, 0, local23.anInt4721, local23.anInt4730, local23.anInt4732, local23.anInt4692, null, local23.anInt4673, local1034, local23.aBoolean320 ? 255 - (local103 & 0xFF) << 24 : -1, local95, local100, local23.anInt4661);
									if (Static440.aBoolean545) {
										Static513.aClass122_10.N(arg7, arg2, arg0, arg5);
									}
								} else if (Static386.aBoolean507) {
									Static473.method6593(local23);
								}
							} else {
								@Pc(1272) int local1272;
								if (local23.anInt4735 == 5) {
									if (local23.anInt4656 >= 0) {
										local23.method4045(Static482.aClass82_1, Static335.aClass41_1).method2621(local23.anInt4673, local23.anInt4653 << 3, Static513.aClass122_10, local23.anInt4648 << 3, local100, local23.anInt4732, 0, 0, local95);
									} else {
										@Pc(1231) Class2 local1231;
										if (local23.anInt4697 == -1) {
											local1231 = local23.method4046(Static513.aClass122_10);
										} else {
											@Pc(1213) Class206 local1213 = local23.aBoolean328 ? Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1 : null;
											local1231 = Static342.aClass250_2.method5976(Static513.aClass122_10, local23.anInt4697, local23.anInt4672, local23.anInt4696, local1213, local23.anInt4728, local23.anInt4651 | 0xFF000000);
										}
										if (local1231 != null) {
											local262 = local1231.EA();
											local510 = local1231.ma();
											local1272 = (local23.anInt4662 == 0 ? 16777215 : local23.anInt4662 & 0xFFFFFF) | 255 - (local103 & 0xFF) << 24;
											if (local23.aBoolean324) {
												Static513.aClass122_10.F(local95, local100, local23.anInt4732 + local95, local100 + local23.anInt4673);
												if (local23.anInt4704 != 0) {
													local543 = (local23.anInt4732 + local262 - 1) / local262;
													local545 = (local23.anInt4673 + local510 - 1) / local510;
													for (local556 = 0; local556 < local543; local556++) {
														for (local650 = 0; local650 < local545; local650++) {
															if (local23.anInt4662 == 0) {
																local1231.method7359((float) (local95 + local262 * local556) + (float) local262 / 2.0F, (float) (local650 * local510 + local100) + (float) local510 / 2.0F, 4096, local23.anInt4704);
															} else {
																local1231.method7368((float) local262 / 2.0F + (float) (local95 + local262 * local556), (float) (local510 * local650 + local100) + (float) local510 / 2.0F, 4096, local23.anInt4704, local1272);
															}
														}
													}
												} else if (local23.anInt4662 == 0 && local103 == 0) {
													local1231.method7363(local95, local100, local23.anInt4732, local23.anInt4673);
												} else {
													local1231.i(local95, local100, local23.anInt4732, local23.anInt4673, 0, local1272, 1);
												}
												Static513.aClass122_10.N(arg7, arg2, arg0, arg5);
											} else if (local23.anInt4662 == 0 && local103 == 0) {
												if (local23.anInt4704 != 0) {
													local1231.method7359((float) local95 + (float) local23.anInt4732 / 2.0F, (float) local23.anInt4673 / 2.0F + (float) local100, local23.anInt4732 * 4096 / local262, local23.anInt4704);
												} else if (local23.anInt4732 == local262 && local510 == local23.anInt4673) {
													local1231.method7364(local95, local100);
												} else {
													local1231.method7367(local95, local100, local23.anInt4732, local23.anInt4673);
												}
											} else if (local23.anInt4704 != 0) {
												local1231.method7368((float) local95 + (float) local23.anInt4732 / 2.0F, (float) local23.anInt4673 / 2.0F + (float) local100, local23.anInt4732 * 4096 / local262, local23.anInt4704, local1272);
											} else if (local23.anInt4732 == local262 && local23.anInt4673 == local510) {
												local1231.DA(local95, local100, 0, local1272, 1);
											} else {
												local1231.ra(local95, local100, local23.anInt4732, local23.anInt4673, 0, local1272, 1);
											}
										} else if (Static386.aBoolean507) {
											Static473.method6593(local23);
										}
									}
								} else if (local23.anInt4735 == 6) {
									Static477.method6612();
									@Pc(1579) Class145 local1579 = null;
									local262 = 0;
									@Pc(1693) Class199 local1693;
									@Pc(1703) Class206 local1703;
									if (local23.anInt4697 != -1) {
										@Pc(1800) Class133 local1800 = Static342.aClass250_2.method5980(local23.anInt4697);
										if (local1800 != null) {
											local1800 = local1800.method3460(local23.anInt4728);
											local1693 = local23.anInt4693 == -1 ? null : Static182.aClass218_1.method5221(local23.anInt4693);
											local1703 = local23.aBoolean328 ? Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1 : null;
											local1579 = local1800.method3443(local1703, 2048, local1693, local23.anInt4680, local23.anInt4652, local23.anInt4670, Static513.aClass122_10, 1);
											if (local1579 == null) {
												Static473.method6593(local23);
											} else {
												local262 = -local1579.TA() >> 1;
											}
										}
									} else if (local23.anInt4718 == 5) {
										local510 = local23.anInt4657;
										if (local510 >= 0 && local510 < 2048) {
											@Pc(1607) Class49_Sub2_Sub2_Sub1 local1607 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local510];
											@Pc(1620) Class199 local1620 = local23.anInt4693 == -1 ? null : Static182.aClass218_1.method5221(local23.anInt4693);
											if (local1607 != null && (Static198.anInt3873 == local510 || Static305.method4808(local1607.aString16) == local23.anInt4660)) {
												local1579 = local1607.aClass206_1.method5027(Static513.aClass122_10, local23.anInt4670, -1, Static251.aClass119_1, 0, Static477.aClass15_1, local1620, Static351.aClass228_1, null, null, Static342.aClass250_2, Static182.aClass218_1, 0, local23.anInt4652, Static538.aClass242_2, 2048, local23.anInt4680);
											}
										}
									} else if (local23.anInt4718 == 8 || local23.anInt4718 == 9) {
										@Pc(1681) Class1_Sub18 local1681 = Static7.method282(false, local23.anInt4657);
										local1693 = local23.anInt4693 == -1 ? null : Static182.aClass218_1.method5221(local23.anInt4693);
										if (local1681 != null) {
											local1703 = local23.aBoolean328 ? Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1 : null;
											local1579 = local1681.method2247(local23.anInt4652, local1693, local23.anInt4670, local23.anInt4680, Static513.aClass122_10, local1703, local23.anInt4718 == 9, local23.anInt4660);
										}
									} else if (local23.anInt4693 == -1) {
										local1579 = local23.method4056(Static182.aClass218_1, Static351.aClass228_1, -1, -1, 2048, Static513.aClass122_10, Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1, 0, Static477.aClass15_1, Static538.aClass242_2, Static251.aClass119_1, Static342.aClass250_2, null);
										if (local1579 == null && Static386.aBoolean507) {
											Static473.method6593(local23);
										}
									} else {
										@Pc(1763) Class199 local1763 = Static182.aClass218_1.method5221(local23.anInt4693);
										local1579 = local23.method4056(Static182.aClass218_1, Static351.aClass228_1, local23.anInt4680, local23.anInt4652, 2048, Static513.aClass122_10, Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1, local23.anInt4670, Static477.aClass15_1, Static538.aClass242_2, Static251.aClass119_1, Static342.aClass250_2, local1763);
										if (local1579 == null && Static386.aBoolean507) {
											Static473.method6593(local23);
										}
									}
									if (local1579 != null) {
										if (local23.anInt4713 > 0) {
											local510 = (local23.anInt4732 << 9) / local23.anInt4713;
										} else {
											local510 = 512;
										}
										if (local23.anInt4663 <= 0) {
											local1272 = 512;
										} else {
											local1272 = (local23.anInt4673 << 9) / local23.anInt4663;
										}
										local543 = (local23.anInt4655 * local510 >> 9) + local23.anInt4732 / 2 + local95;
										local545 = (local23.anInt4674 * local1272 >> 9) + local100 + local23.anInt4673 / 2;
										Static37.aClass118_3.ha();
										Static513.aClass122_10.method7250(Static37.aClass118_3);
										Static513.aClass122_10.b(local543, local545, local510, local1272);
										Static513.aClass122_10.la((float) (local23.anInt4678 << 2), local23.aBoolean325 ? (float) (local23.anInt4665 << 2) : (float) (local23.anInt4665 << 2) * 1.5F);
										if (arg1 == -1412584499 || Static305.aBoolean408) {
											Static513.aClass122_10.n();
											Static513.aClass122_10.method7284();
											Static513.aClass122_10.N(arg7, arg2, arg0, arg5);
											Static305.aBoolean408 = false;
										}
										if (local23.aBoolean332) {
											Static513.aClass122_10.method7271(false);
										}
										local556 = Class310.anIntArray827[local23.anInt4733 << 3] * (local23.anInt4647 << 2) >> 14;
										local650 = Class310.anIntArray826[local23.anInt4733 << 3] * (local23.anInt4647 << 2) >> 14;
										Static158.aClass118_6.ta(-local23.anInt4726 << 3);
										Static158.aClass118_6.XA(local23.anInt4716 << 3);
										Static158.aClass118_6.TA(local23.anInt4658 << 2, local262 + (local23.anInt4736 << 2) + local556, local650 - -(local23.anInt4736 << 2));
										Static158.aClass118_6.k(local23.anInt4733 << 3);
										if (Static440.aBoolean545) {
											Static513.aClass122_10.F(local95, local100, local23.anInt4732 + local95, local100 + local23.anInt4673);
										}
										if (local23.aBoolean325) {
											local1579.method6676(Static158.aClass118_6, null, local23.anInt4647 << 2);
										} else {
											local1579.method6686(Static158.aClass118_6, null, 1);
										}
										if (Static440.aBoolean545) {
											Static513.aClass122_10.N(arg7, arg2, arg0, arg5);
										}
										if (local23.aBoolean332) {
											Static513.aClass122_10.method7271(true);
										}
										Static513.aClass122_10.la(0.0F, 0.0F);
									}
								} else if (local23.anInt4735 == 9) {
									if (local23.aBoolean334) {
										local510 = local95 + local23.anInt4732;
										local1272 = local100;
										local262 = local100 + local23.anInt4673;
									} else {
										local262 = local100;
										local1272 = local100 + local23.anInt4673;
										local510 = local23.anInt4732 + local95;
									}
									if (local23.anInt4687 == 1) {
										Static513.aClass122_10.method7237(local95, local262, local510, local1272, local23.anInt4662, 0);
									} else {
										Static513.aClass122_10.method7235(local95, local262, local510, local1272, local23.anInt4662, local23.anInt4687);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
