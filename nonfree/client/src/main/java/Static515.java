import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!rn", name = "w", descriptor = "F")
	public static float aFloat161 = 1.0F;

	@OriginalMember(owner = "client!rn", name = "F", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_126 = new Class289(80, 2);

	@OriginalMember(owner = "client!rn", name = "G", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[6][];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	public static void method7286() {
		for (@Pc(15) Class6_Sub4_Sub12 local15 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8538(); local15 != null; local15 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8530()) {
			if (Static487.method7074(local15.anInt7577)) {
				Static418.method6242(local15);
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZII[Lclient!sha;IIIIII)V")
	public static void method7287(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class321[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static546.aClass132_13.KA(arg8, arg9, arg3, arg2);
		for (@Pc(13) int local13 = 0; local13 < arg4.length; local13++) {
			@Pc(19) Class321 local19 = arg4[local13];
			if (local19 != null && (arg0 == local19.anInt9033 || arg0 == -1412584499 && local19 == Static489.aClass321_39)) {
				@Pc(40) int local40 = arg6 + local19.anInt9016;
				@Pc(45) int local45 = arg7 + local19.anInt9072;
				@Pc(53) int local53 = local40 + local19.anInt9103 + 1;
				@Pc(61) int local61 = local45 + local19.anInt9077 + 1;
				@Pc(66) int local66;
				if (arg5 == -1) {
					Class6_Sub1_Sub7.aRectangleArray2[Static65.anInt1203].setBounds(local19.anInt9016 + arg6, arg7 + local19.anInt9072, local19.anInt9103, local19.anInt9077);
					local66 = Static65.anInt1203++;
				} else {
					local66 = arg5;
				}
				local19.anInt9043 = local66;
				local19.anInt9089 = Static90.anInt1698;
				if (!Static83.method1460(local19)) {
					if (local19.anInt9098 != 0) {
						Static594.method8177(local19);
					}
					@Pc(111) int local111 = local19.anInt9016 + arg6;
					@Pc(117) int local117 = local19.anInt9072 + arg7;
					@Pc(119) int local119 = 0;
					@Pc(121) int local121 = 0;
					if (Static594.aBoolean693) {
						local119 = Static234.method3562();
						local121 = Static314.method4504();
					}
					@Pc(134) int local134 = local19.anInt9028;
					if (Static383.aBoolean423 && (Static83.method1453(local19).anInt6747 != 0 || local19.anInt9105 == 0) && local134 > 127) {
						local134 = 127;
					}
					@Pc(191) int local191;
					@Pc(197) int local197;
					if (local19 == Static489.aClass321_39) {
						if (arg0 != -1412584499 && (Static136.anInt2382 == local19.anInt9060 || Static221.anInt3751 == local19.anInt9060)) {
							Static451.anInt7554 = arg7;
							Static371.anInt6311 = arg6;
							Static660.aClass321Array2 = arg4;
							continue;
						}
						if (Static266.aBoolean291 && Static418.aBoolean484) {
							local191 = Static193.aClass128_1.method5191() + local119;
							local197 = Static193.aClass128_1.method5188() + local121;
							local191 -= Static663.anInt9823;
							local197 -= Static464.anInt8031;
							if (local191 < Static171.anInt2876) {
								local191 = Static171.anInt2876;
							}
							if (local191 + local19.anInt9103 > Static171.anInt2876 + Static398.aClass321_30.anInt9103) {
								local191 = Static171.anInt2876 + Static398.aClass321_30.anInt9103 - local19.anInt9103;
							}
							if (local197 < Static292.anInt4923) {
								local197 = Static292.anInt4923;
							}
							local111 = local191;
							if (local19.anInt9077 + local197 > Static292.anInt4923 - -Static398.aClass321_30.anInt9077) {
								local197 = Static398.aClass321_30.anInt9077 + Static292.anInt4923 - local19.anInt9077;
							}
							local117 = local197;
						}
						if (Static221.anInt3751 == local19.anInt9060) {
							local134 = 128;
						}
					}
					@Pc(284) int local284;
					@Pc(278) int local278;
					@Pc(291) int local291;
					@Pc(296) int local296;
					if (local19.anInt9105 == 2) {
						local278 = arg2;
						local191 = arg8;
						local197 = arg9;
						local284 = arg3;
					} else {
						local291 = local111 + local19.anInt9103;
						local296 = local19.anInt9077 + local117;
						local197 = local117 <= arg9 ? arg9 : local117;
						if (local19.anInt9105 == 9) {
							local296++;
							local291++;
						}
						local191 = arg8 >= local111 ? arg8 : local111;
						local284 = arg3 <= local291 ? arg3 : local291;
						local278 = arg2 > local296 ? local296 : arg2;
					}
					if (local284 > local191 && local197 < local278) {
						@Pc(639) int local639;
						@Pc(683) int local683;
						@Pc(779) int local779;
						@Pc(781) int local781;
						@Pc(670) int local670;
						@Pc(672) int local672;
						if (local19.anInt9098 != 0) {
							if (local19.anInt9098 == Static353.anInt6022 || local19.anInt9098 == Static138.anInt2396) {
								Static159.method2243(local19, local117, local111);
								if (!Static594.aBoolean693) {
									Static660.method8977(local117, Static138.anInt2396 == local19.anInt9098, local19.anInt9103, local19.anInt9077, local111);
									Static546.aClass132_13.KA(arg8, arg9, arg3, arg2);
								}
								Static224.aBooleanArray12[local66] = true;
								continue;
							}
							if (Static212.anInt3631 == local19.anInt9098) {
								if (local19.method7689(Static546.aClass132_13) != null) {
									Static35.method857();
									Static597.method8268(local19, local117, Static546.aClass132_13, local111);
									Static504.aBooleanArray24[local66] = true;
									Static546.aClass132_13.KA(arg8, arg9, arg3, arg2);
									if (Static594.aBoolean693) {
										if (arg1) {
											Static629.method8681(local53, local45, local61, local40);
										} else {
											Static561.method7895(local45, local61, local53, local40);
										}
									}
								}
								continue;
							}
							if (local19.anInt9098 == Static518.anInt4461) {
								Static512.method7261(local19, Static546.aClass132_13, local117, local111);
								continue;
							}
							if (Static92.anInt1713 == local19.anInt9098) {
								Static287.method4142(local19.anInt9094 % 64, local117, Static546.aClass132_13, local111, local19);
								continue;
							}
							if (local19.anInt9098 == Static457.anInt7635) {
								if (local19.method7689(Static546.aClass132_13) != null) {
									Static393.method5578(local19, local111, local117);
									Static504.aBooleanArray24[local66] = true;
									Static546.aClass132_13.KA(arg8, arg9, arg3, arg2);
									if (Static594.aBoolean693) {
										if (arg1) {
											Static629.method8681(local53, local45, local61, local40);
										} else {
											Static561.method7895(local45, local61, local53, local40);
										}
									}
								}
								continue;
							}
							if (local19.anInt9098 == Static11.anInt372) {
								Static22.method543(local19.anInt9077, local117, Static251.anInterface6_5, Static546.aClass132_13, local19.anInt9103, local111);
								Static224.aBooleanArray12[local66] = true;
								Static546.aClass132_13.KA(arg8, arg9, arg3, arg2);
								continue;
							}
							if (Static144.anInt2472 == local19.anInt9098) {
								Static370.method5333(local19.anInt9103, Static546.aClass132_13, local111, local117, local19.anInt9077);
								Static224.aBooleanArray12[local66] = true;
								Static546.aClass132_13.KA(arg8, arg9, arg3, arg2);
								continue;
							}
							if (Static651.anInt10488 == local19.anInt9098) {
								if (!Static544.aBoolean667 && !Static268.aBoolean293) {
									continue;
								}
								local291 = local111 + local19.anInt9103;
								local296 = local117 + 15;
								if (Static594.aBoolean693) {
									if (arg1) {
										Static629.method8681(local53, local45, local61, local40);
									} else {
										Static561.method7895(local45, local61, local53, local40);
									}
								}
								if (Static544.aBoolean667) {
									local639 = -256;
									if (Static490.anInt8338 < 20) {
										local639 = -65536;
									}
									Static423.aClass19_9.method6319(local296, local639, "Fps:" + Static490.anInt8338, local291, -1);
									local296 += 15;
									@Pc(661) Runtime local661 = Runtime.getRuntime();
									local670 = (int) ((local661.totalMemory() - local661.freeMemory()) / 1024L);
									local672 = -256;
									if (local670 > 98304) {
										local672 = -65536;
										if (Static345.aBoolean392) {
											Static57.method1079();
											for (local683 = 0; local683 < 10; local683++) {
												System.gc();
											}
											local670 = (int) ((local661.totalMemory() - local661.freeMemory()) / 1024L);
											if (local670 > 65536) {
												Static270.method3991("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static423.aClass19_9.method6319(local296, local672, "Mem:" + local670 + "k", local291, -1);
									local296 += 15;
									Static423.aClass19_9.method6319(local296, -256, "In:" + Static13.anInt10826 + "B/s Out:" + Static441.anInt7472 + "B/s", local291, -1);
									local296 += 15;
									local683 = Static546.aClass132_13.E() / 1024;
									Static423.aClass19_9.method6319(local296, local683 > 65536 ? -65536 : -256, "Offheap:" + local683 + "k", local291, -1);
									local296 += 15;
									local779 = 0;
									local781 = 0;
									@Pc(783) int local783 = 0;
									for (@Pc(785) int local785 = 0; local785 < 37; local785++) {
										if (Static483.aClass222_Sub1Array1[local785] != null) {
											local779 += Static483.aClass222_Sub1Array1[local785].method5295();
											local781 += Static483.aClass222_Sub1Array1[local785].method5298();
											local783 += Static483.aClass222_Sub1Array1[local785].method5291();
										}
									}
									@Pc(827) int local827 = local783 * 100 / local779;
									@Pc(833) int local833 = local781 * 10000 / local779;
									@Pc(853) String local853 = "Cache:" + Static377.method5353(true, 2, 0, (long) local833) + "% (" + local827 + "%)";
									Static494.aClass19_12.method6319(local296, -256, local853, local291, -1);
									local296 += 12;
								}
								if (Static594.anInt9687 > 0) {
									Static494.aClass19_12.method6319(local296, -256, "Particles: " + Static264.anInt4577 + " / " + Static594.anInt9687, local291, -1);
								}
								local296 += 12;
								if (Static268.aBoolean293) {
									Static494.aClass19_12.method6319(local296, -256, "Polys: " + Static546.aClass132_13.I() + " Models: " + Static546.aClass132_13.M(), local291, -1);
									local296 += 12;
									Static494.aClass19_12.method6319(local296, -256, "Ls: " + Static266.anInt4658 + " La: " + Static661.anInt10597 + " NPC: " + Static564.anInt9386 + " Pl: " + Static196.anInt3437, local291, -1);
									local296 += 12;
									Static44.method935();
								}
								Static224.aBooleanArray12[local66] = true;
								continue;
							}
						}
						@Pc(1018) Class6_Sub51 local1018;
						if (local19.anInt9105 == 0) {
							if (local19.anInt9098 == Static388.anInt6536 && Static546.aClass132_13.method7466()) {
								Static546.aClass132_13.method7438(local111, local117, local19.anInt9103, local19.anInt9077);
							}
							method7287(local19.anInt9040, arg1, local278, local284, arg4, local66, local111 - local19.anInt9102, -local19.anInt9067 + local117, local191, local197);
							if (local19.aClass321Array1 != null) {
								method7287(local19.anInt9040, arg1, local278, local284, local19.aClass321Array1, local66, local111 - local19.anInt9102, -local19.anInt9067 + local117, local191, local197);
							}
							local1018 = (Class6_Sub51) Static262.aClass209_35.method5038((long) local19.anInt9040);
							if (local1018 != null) {
								Static653.method8879(local66, local111, local191, local1018.anInt9360, local117, local278, local284, local197);
							}
							if (Static388.anInt6536 == local19.anInt9098 && Static546.aClass132_13.method7466()) {
								Static546.aClass132_13.method7472();
							}
							Static546.aClass132_13.KA(arg8, arg9, arg3, arg2);
						}
						if (Static253.aBooleanArray15[local66] || Static49.anInt1033 > 1) {
							if (local19.anInt9105 == 3) {
								if (local134 == 0) {
									if (local19.aBoolean654) {
										Static546.aClass132_13.aa(local111, local117, local19.anInt9103, local19.anInt9077, local19.anInt9094, 0);
									} else {
										Static546.aClass132_13.method7481(local111, local117, local19.anInt9103, local19.anInt9077, local19.anInt9094, 0);
									}
								} else if (local19.aBoolean654) {
									Static546.aClass132_13.aa(local111, local117, local19.anInt9103, local19.anInt9077, 255 - (local134 & 0xFF) << 24 | local19.anInt9094 & 0xFFFFFF, 1);
								} else {
									Static546.aClass132_13.method7481(local111, local117, local19.anInt9103, local19.anInt9077, 255 - (local134 & 0xFF) << 24 | local19.anInt9094 & 0xFFFFFF, 1);
								}
								if (Static594.aBoolean693) {
									if (arg1) {
										Static629.method8681(local53, local45, local61, local40);
									} else {
										Static561.method7895(local45, local61, local53, local40);
									}
								}
							} else {
								@Pc(1193) Class216 local1193;
								if (local19.anInt9105 == 4) {
									@Pc(1168) Class19 local1168 = local19.method7667(Static546.aClass132_13);
									if (local1168 != null) {
										local296 = local19.anInt9094;
										@Pc(1183) String local1183 = local19.aString126;
										if (local19.anInt9048 != -1) {
											local1193 = Static340.aClass121_1.method2647(local19.anInt9048);
											local1183 = local1193.aString77;
											if (local1183 == null) {
												local1183 = "null";
											}
											if ((local1193.anInt6041 == 1 || local19.anInt9032 != 1) && local19.anInt9032 != -1) {
												local1183 = "<col=ff9040>" + local1183 + "</col> x" + Static505.method7217(local19.anInt9032);
											}
										}
										if (local19.anInt9045 != -1) {
											local1183 = Static279.method4091(local19.anInt9045);
											if (local1183 == null) {
												local1183 = "";
											}
										}
										if (Static590.aClass321_53 == local19) {
											local1183 = Static52.aClass41_31.method1007(Static616.anInt10077);
											local296 = local19.anInt9094;
										}
										if (Static433.aBoolean498) {
											Static546.aClass132_13.T(local111, local117, local19.anInt9103 + local111, local19.anInt9077 + local117);
										}
										local1168.method6330(local19.anInt9041, local19.anInt9031, (Class1) null, local1183, Static418.aClass9Array125, 0, local19.anInt9073, local117, 0, (int[]) null, local19.aBoolean663 ? 255 - (local134 & 0xFF) << 24 : -1, local19.anInt9103, 255 - (local134 & 0xFF) << 24 | local296, local19.anInt9077, local19.anInt9049, local111);
										if (Static433.aBoolean498) {
											Static546.aClass132_13.KA(arg8, arg9, arg3, arg2);
										}
										if (local1183.trim().length() > 0) {
											if (!Static433.aBoolean498) {
												@Pc(1355) Class151 local1355 = Static454.method6566(local19.anInt9059, Static546.aClass132_13);
												local670 = local1355.method3327(local19.anInt9103, Static418.aClass9Array125, local1183);
												local672 = local1355.method3324(local1183, local19.anInt9103, local19.anInt9049, Static418.aClass9Array125);
												if (Static594.aBoolean693) {
													if (arg1) {
														Static629.method8681(local670 + local111, local117, local672 + local117, local111);
													} else {
														Static561.method7895(local117, local117 + local672, local670 + local111, local111);
													}
												}
											} else if (Static594.aBoolean693) {
												if (arg1) {
													Static629.method8681(local53, local45, local61, local40);
												} else {
													Static561.method7895(local45, local61, local53, local40);
												}
											}
										}
									} else if (Static449.aBoolean502) {
										Static293.method4206(local19);
									}
								} else {
									@Pc(1521) int local1521;
									if (local19.anInt9105 == 5) {
										if (local19.anInt9071 >= 0) {
											local19.method7675(Static399.aClass194_1, Static186.aClass147_1).method2056(local111, local117, local19.anInt9103, 0, Static546.aClass132_13, local19.anInt9064 << 3, local19.anInt9077, local19.anInt9025 << 3, 0);
										} else {
											@Pc(1452) Class9 local1452;
											if (local19.anInt9048 != -1) {
												@Pc(1470) Class271 local1470 = local19.aBoolean660 ? Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1 : null;
												local1452 = Static340.aClass121_1.method2646(local19.anInt9100, local1470, local19.anInt9048, local19.anInt9032, local19.anInt9068, local19.anInt9069 | 0xFF000000, Static546.aClass132_13);
											} else if (local19.anInt9045 == -1) {
												local1452 = local19.method7671(Static546.aClass132_13);
											} else {
												local1452 = Static33.method811(local19.anInt9045, Static546.aClass132_13);
											}
											if (local1452 != null) {
												local296 = local1452.method8937();
												local639 = local1452.method8930();
												local1521 = 255 - (local134 & 0xFF) << 24 | (local19.anInt9094 == 0 ? 16777215 : local19.anInt9094 & 0xFFFFFF);
												if (local19.aBoolean653) {
													Static546.aClass132_13.T(local111, local117, local19.anInt9103 + local111, local117 + local19.anInt9077);
													if (local19.anInt9047 != 0) {
														local670 = (local19.anInt9103 + local296 - 1) / local296;
														local672 = (local19.anInt9077 + local639 - 1) / local639;
														for (local683 = 0; local683 < local670; local683++) {
															for (local779 = 0; local779 < local672; local779++) {
																if (local19.anInt9094 == 0) {
																	local1452.method8917((float) (local683 * local296 + local111) + (float) local296 / 2.0F, (float) (local639 * local779 + local117) + (float) local639 / 2.0F, 4096, local19.anInt9047);
																} else {
																	local1452.method8927((float) local296 / 2.0F + (float) (local683 * local296 + local111), (float) local639 / 2.0F + (float) (local779 * local639 + local117), 4096, local19.anInt9047, local1521);
																}
															}
														}
													} else if (local19.anInt9094 == 0 && local134 == 0) {
														local1452.method8928(local111, local117, local19.anInt9103, local19.anInt9077);
													} else {
														local1452.method8926(local111, local117, local19.anInt9103, local19.anInt9077, 0, local1521, 1);
													}
													Static546.aClass132_13.KA(arg8, arg9, arg3, arg2);
												} else if (local19.anInt9094 == 0 && local134 == 0) {
													if (local19.anInt9047 != 0) {
														local1452.method8917((float) local19.anInt9103 / 2.0F + (float) local111, (float) local117 + (float) local19.anInt9077 / 2.0F, local19.anInt9103 * 4096 / local296, local19.anInt9047);
													} else if (local296 == local19.anInt9103 && local19.anInt9077 == local639) {
														local1452.method8920(local111, local117);
													} else {
														local1452.method8936(local111, local117, local19.anInt9103, local19.anInt9077);
													}
												} else if (local19.anInt9047 != 0) {
													local1452.method8927((float) local19.anInt9103 / 2.0F + (float) local111, (float) local19.anInt9077 / 2.0F + (float) local117, local19.anInt9103 * 4096 / local296, local19.anInt9047, local1521);
												} else if (local296 == local19.anInt9103 && local639 == local19.anInt9077) {
													local1452.method8919(local111, local117, 0, local1521, 1);
												} else {
													local1452.method8924(local111, local117, local19.anInt9103, local19.anInt9077, 0, local1521, 1);
												}
											} else if (Static449.aBoolean502) {
												Static293.method4206(local19);
											}
										}
										if (Static594.aBoolean693) {
											if (arg1) {
												Static629.method8681(local53, local45, local61, local40);
											} else {
												Static561.method7895(local45, local61, local53, local40);
											}
										}
									} else if (local19.anInt9105 == 6) {
										Static27.method6637();
										local1018 = null;
										@Pc(1849) Class184 local1849 = null;
										local639 = 0;
										@Pc(1958) Class119 local1958;
										@Pc(1968) Class271 local1968;
										if (local19.anInt9048 != -1) {
											local1193 = Static340.aClass121_1.method2647(local19.anInt9048);
											if (local1193 != null) {
												local1193 = local1193.method5141(local19.anInt9032);
												local1958 = local19.anInt9018 == -1 ? null : Static334.aClass268_2.method6469(local19.anInt9018);
												local1968 = local19.aBoolean660 ? Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1 : null;
												local1849 = local1193.method5156(local19.anInt9012, 1, local19.anInt9010, Static546.aClass132_13, 2048, local19.anInt9099, local1958, local1968);
												if (local1849 == null) {
													Static293.method4206(local19);
												} else {
													local639 = -local1849.fa() >> 1;
												}
											}
										} else if (local19.anInt9058 == 5) {
											local1521 = local19.anInt9014;
											if (local1521 >= 0 && local1521 < 2048) {
												@Pc(1875) Class2_Sub1_Sub1_Sub3_Sub1 local1875 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local1521];
												@Pc(1888) Class119 local1888 = local19.anInt9018 == -1 ? null : Static334.aClass268_2.method6469(local19.anInt9018);
												if (local1875 != null && (local1521 == Static659.anInt7559 || Static55.method3550(local1875.aString45) == local19.anInt9046)) {
													local1849 = local1875.aClass271_1.method6479(2048, 0, local19.anInt9012, Static659.aClass363_3, local1888, (Class119) null, (Class245[]) null, Static334.aClass268_2, Static340.aClass121_1, -1, Static546.aClass132_13, Static95.aClass188_1, local19.anInt9099, Static12.aClass368_1, 0, Static416.aClass107_1, (int[]) null, 0, local19.anInt9010);
												}
											}
										} else if (local19.anInt9058 == 8 || local19.anInt9058 == 9) {
											@Pc(1945) Class6_Sub6 local1945 = Static249.method3626(false, local19.anInt9014);
											local1958 = local19.anInt9018 == -1 ? null : Static334.aClass268_2.method6469(local19.anInt9018);
											if (local1945 != null) {
												local1968 = local19.aBoolean660 ? Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1 : null;
												local1849 = local1945.method905(local1968, local19.anInt9012, local1958, local19.anInt9058 == 9, local19.anInt9046, local19.anInt9099, local19.anInt9010, Static546.aClass132_13);
											}
										} else if (local19.anInt9018 == -1) {
											local1849 = local19.method7682(Static334.aClass268_2, Static546.aClass132_13, 0, Static95.aClass188_1, Static659.aClass363_3, (Class119) null, Static12.aClass368_1, -1, Static416.aClass107_1, 2048, Static340.aClass121_1, -1, local1018, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1);
											if (local1849 == null && Static449.aBoolean502) {
												Static293.method4206(local19);
											}
										} else {
											@Pc(2030) Class119 local2030 = Static334.aClass268_2.method6469(local19.anInt9018);
											local1849 = local19.method7682(Static334.aClass268_2, Static546.aClass132_13, local19.anInt9010, Static95.aClass188_1, Static659.aClass363_3, local2030, Static12.aClass368_1, local19.anInt9099, Static416.aClass107_1, 2048, Static340.aClass121_1, local19.anInt9012, local1018, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1);
											if (local1849 == null && Static449.aBoolean502) {
												Static293.method4206(local19);
											}
										}
										if (local1849 != null) {
											if (local19.anInt9074 > 0) {
												local1521 = (local19.anInt9103 << 9) / local19.anInt9074;
											} else {
												local1521 = 512;
											}
											if (local19.anInt9107 <= 0) {
												local670 = 512;
											} else {
												local670 = (local19.anInt9077 << 9) / local19.anInt9107;
											}
											local672 = local19.anInt9103 / 2 + local111;
											local683 = local117 + local19.anInt9077 / 2;
											if (!local19.aBoolean664) {
												local672 += local19.anInt9076 * local1521 >> 9;
												local683 += local670 * local19.anInt9104 >> 9;
											}
											Static185.aClass207_13.method8204();
											Static546.aClass132_13.method7517(Static185.aClass207_13);
											Static546.aClass132_13.DA(local672, local683, local1521, local670);
											Static546.aClass132_13.ya();
											if (local19.aBoolean651) {
												Static546.aClass132_13.C(false);
											}
											if (local19.aBoolean664) {
												Static347.aClass207_39.method8202(local19.anInt9053);
												Static347.aClass207_39.method8213(local19.anInt9042);
												Static347.aClass207_39.method8207(local19.anInt9087);
												Static347.aClass207_39.method8209(local19.anInt9076, local19.anInt9104, local19.anInt9085);
											} else {
												local779 = Class6_Sub1_Sub3.anIntArray56[local19.anInt9053 << 3] * (local19.anInt9088 << 2) >> 14;
												local781 = Class6_Sub1_Sub3.anIntArray58[local19.anInt9053 << 3] * (local19.anInt9088 << 2) >> 14;
												Static347.aClass207_39.method8208(-local19.anInt9087 << 3);
												Static347.aClass207_39.method8213(local19.anInt9042 << 3);
												Static347.aClass207_39.method8209(local19.anInt9022 << 2, local779 + (local19.anInt9062 << 2) + local639, local781 + (local19.anInt9062 << 2));
												Static347.aClass207_39.method8214(local19.anInt9053 << 3);
											}
											local19.method7676(local1849, Static347.aClass207_39, Static90.anInt1698, Static546.aClass132_13);
											if (Static433.aBoolean498) {
												Static546.aClass132_13.T(local111, local117, local111 + local19.anInt9103, local117 + local19.anInt9077);
											}
											if (local19.aBoolean664) {
												if (local19.aBoolean658) {
													local1849.method8658(Static347.aClass207_39, (Class2_Sub5) null, local19.anInt9088, 1);
												} else {
													local1849.method8662(Static347.aClass207_39, (Class2_Sub5) null, 1);
													if (local19.aClass2_Sub8_7 != null) {
														Static546.aClass132_13.method7455(local19.aClass2_Sub8_7.method4172());
													}
												}
											} else if (local19.aBoolean658) {
												local1849.method8658(Static347.aClass207_39, (Class2_Sub5) null, local19.anInt9088 << 2, 1);
											} else {
												local1849.method8662(Static347.aClass207_39, (Class2_Sub5) null, 1);
												if (local19.aClass2_Sub8_7 != null) {
													Static546.aClass132_13.method7455(local19.aClass2_Sub8_7.method4172());
												}
											}
											if (Static433.aBoolean498) {
												Static546.aClass132_13.KA(arg8, arg9, arg3, arg2);
											}
											if (local19.aBoolean651) {
												Static546.aClass132_13.C(true);
											}
										}
										if (Static594.aBoolean693) {
											if (arg1) {
												Static629.method8681(local53, local45, local61, local40);
											} else {
												Static561.method7895(local45, local61, local53, local40);
											}
										}
									} else if (local19.anInt9105 == 9) {
										if (local19.aBoolean649) {
											local1521 = local117;
											local639 = local111 + local19.anInt9103;
											local296 = local19.anInt9077 + local117;
										} else {
											local639 = local19.anInt9103 + local111;
											local296 = local117;
											local1521 = local117 + local19.anInt9077;
										}
										if (local19.anInt9091 == 1) {
											Static546.aClass132_13.method7473(local111, local296, local639, local1521, local19.anInt9094, 0);
										} else {
											Static546.aClass132_13.method7468(local111, local296, local639, local1521, local19.anInt9094, local19.anInt9091);
										}
										if (Static594.aBoolean693) {
											if (arg1) {
												Static629.method8681(local53, local45, local61, local40);
											} else {
												Static561.method7895(local45, local61, local53, local40);
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
	}
}
