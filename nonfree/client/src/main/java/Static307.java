import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array45;

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_221 = new Class214(62, 1);

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_222 = new Class214(39, 6);

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "[[F")
	public static final float[][] aFloatArrayArray35 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V")
	public static void method5980(@OriginalArg(0) int arg0) {
		Static355.anInt6248 = 3;
		Static9.anInt194 = -1;
		Static209.anInt4256 = arg0;
		Static399.anInt7064 = 100;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII[Lclient!tf;IIIII)V")
	public static void method5981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class240[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static30.aClass30_3.w(arg1, arg7, arg4, arg2);
		for (@Pc(13) int local13 = 0; local13 < arg3.length; local13++) {
			@Pc(19) Class240 local19 = arg3[local13];
			if (local19 != null && (arg5 == local19.anInt6917 || arg5 == -1412584499 && local19 == Static65.aClass240_4)) {
				@Pc(42) int local42;
				if (arg6 == -1) {
					Class267.aRectangleArray2[Static171.anInt3372].setBounds(local19.anInt6862 + arg0, arg8 + local19.anInt6879, local19.anInt6904, local19.anInt6894);
					local42 = Static171.anInt3372++;
				} else {
					local42 = arg6;
				}
				local19.anInt6840 = Static277.anInt2834;
				local19.anInt6843 = local42;
				if (!Static50.method1133(local19)) {
					if (local19.anInt6882 != 0) {
						Static203.method3628(local19);
					}
					@Pc(90) int local90 = local19.anInt6862 + arg0;
					@Pc(95) int local95 = local19.anInt6879 + arg8;
					@Pc(98) int local98 = local19.anInt6838;
					if (Static341.aBoolean453 && (Static50.method1146(local19).anInt7357 != 0 || local19.anInt6873 == 0) && local98 > 127) {
						local98 = 127;
					}
					@Pc(158) int local158;
					@Pc(162) int local162;
					if (local19 == Static65.aClass240_4) {
						if (arg5 != -1412584499 && (Static467.anInt8017 == local19.anInt6868 || Static69.anInt1697 == local19.anInt6868)) {
							Static175.anInt3442 = arg0;
							Static28.anInt484 = arg8;
							Static342.aClass240Array1 = arg3;
							continue;
						}
						if (Static149.aBoolean207 && Static77.aBoolean131) {
							local158 = Static329.aClass95_1.method5170();
							local162 = Static329.aClass95_1.method5175();
							local158 -= Static255.anInt4930;
							local162 -= Static270.anInt5898;
							if (local158 < Static458.anInt7818) {
								local158 = Static458.anInt7818;
							}
							if (Static186.aClass240_10.anInt6904 + Static458.anInt7818 < local158 + local19.anInt6904) {
								local158 = Static186.aClass240_10.anInt6904 + Static458.anInt7818 - local19.anInt6904;
							}
							if (Static4.anInt49 > local162) {
								local162 = Static4.anInt49;
							}
							if (Static4.anInt49 + Static186.aClass240_10.anInt6894 < local162 - -local19.anInt6894) {
								local162 = Static186.aClass240_10.anInt6894 + Static4.anInt49 - local19.anInt6894;
							}
							local90 = local158;
							local95 = local162;
						}
						if (Static69.anInt1697 == local19.anInt6868) {
							local98 = 128;
						}
					}
					@Pc(247) int local247;
					@Pc(249) int local249;
					@Pc(258) int local258;
					@Pc(264) int local264;
					if (local19.anInt6873 == 2) {
						local162 = arg7;
						local247 = arg4;
						local249 = arg2;
						local158 = arg1;
					} else {
						local258 = local19.anInt6904 + local90;
						local264 = local95 + local19.anInt6894;
						local162 = local95 > arg7 ? local95 : arg7;
						if (local19.anInt6873 == 9) {
							local264++;
							local258++;
						}
						local158 = local90 <= arg1 ? arg1 : local90;
						local247 = arg4 > local258 ? local258 : arg4;
						local249 = local264 < arg2 ? local264 : arg2;
					}
					if (local247 > local158 && local162 < local249) {
						@Pc(543) int local543;
						@Pc(554) int local554;
						@Pc(650) int local650;
						@Pc(508) int local508;
						@Pc(541) int local541;
						if (local19.anInt6882 != 0) {
							if (local19.anInt6882 == Static431.anInt7389 || Static76.anInt1858 == local19.anInt6882) {
								Static455.method6193(Static76.anInt1858 == local19.anInt6882, local19.anInt6904, local19.anInt6894, local90, local95);
								Static353.aBooleanArray124[local42] = true;
								Static30.aClass30_3.w(arg1, arg7, arg4, arg2);
								continue;
							}
							if (Static34.anInt596 == local19.anInt6882) {
								if (local19.method5528(Static30.aClass30_3) != null) {
									Static256.method4185();
									Static340.method4982(local19, local95, Static30.aClass30_3, local90);
									Static237.aBooleanArray88[local42] = true;
									Static30.aClass30_3.w(arg1, arg7, arg4, arg2);
								}
								continue;
							}
							if (Static111.anInt2411 == local19.anInt6882) {
								if (local19.method5528(Static30.aClass30_3) != null) {
									Static288.method4459(local95, local90, local19);
									Static237.aBooleanArray88[local42] = true;
									Static30.aClass30_3.w(arg1, arg7, arg4, arg2);
								}
								continue;
							}
							if (local19.anInt6882 == Static367.anInt7458) {
								Static384.method5417(local19.anInt6904, Static357.anInterface4_8, Static30.aClass30_3, local19.anInt6894, local90, local95);
								Static353.aBooleanArray124[local42] = true;
								Static30.aClass30_3.w(arg1, arg7, arg4, arg2);
								continue;
							}
							if (local19.anInt6882 == Static160.anInt3258) {
								Static306.method4711(Static30.aClass30_3, local90, local19.anInt6904, local19.anInt6894, local95);
								Static353.aBooleanArray124[local42] = true;
								Static30.aClass30_3.w(arg1, arg7, arg4, arg2);
								continue;
							}
							if (local19.anInt6882 == Static139.anInt2875) {
								if (!Static244.aBoolean318 && !Static32.aBoolean28) {
									continue;
								}
								local258 = local19.anInt6904 + local90;
								local264 = local95 + 15;
								if (Static244.aBoolean318) {
									local508 = -256;
									if (Static286.anInt5318 < 20) {
										local508 = -65536;
									}
									Static330.aClass18_3.method5759("Fps:" + Static286.anInt5318, local264, local508, local258);
									local264 += 15;
									@Pc(532) Runtime local532 = Runtime.getRuntime();
									local541 = (int) ((local532.totalMemory() - local532.freeMemory()) / 1024L);
									local543 = -256;
									if (local541 > 65536) {
										local543 = -65536;
										if (Static401.aBoolean525) {
											Static116.method2235();
											for (local554 = 0; local554 < 10; local554++) {
												System.gc();
											}
											local541 = (int) ((local532.totalMemory() - local532.freeMemory()) / 1024L);
											if (local541 > 65536) {
												Static200.method3529("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static330.aClass18_3.method5759("Mem:" + local541 + "k", local264, local543, local258);
									local264 += 15;
									Static330.aClass18_3.method5759("In:" + Static270.anInt5901 + "B/s Out:" + Static400.anInt7075 + "B/s", local264, -256, local258);
									local264 += 15;
									local554 = Static30.aClass30_3.xa() / 1024;
									Static330.aClass18_3.method5759("Offheap:" + local554 + "k", local264, local554 <= 65536 ? -256 : -65536, local258);
									local264 += 15;
									local650 = 0;
									@Pc(652) int local652 = 0;
									@Pc(654) int local654 = 0;
									for (@Pc(656) int local656 = 0; local656 < 30; local656++) {
										local650 += Static296.aClass79_Sub1Array3[local656].method2230();
										local652 += Static296.aClass79_Sub1Array3[local656].method2227();
										local654 += Static296.aClass79_Sub1Array3[local656].method2232();
									}
									@Pc(694) int local694 = local654 * 100 / local650;
									@Pc(700) int local700 = local652 * 10000 / local650;
									@Pc(720) String local720 = "Cache:" + Static214.method3761(2, (long) local700, true, 0) + "% (" + local694 + "%)";
									Static142.aClass18_1.method5759(local720, local264, -256, local258);
									local264 += 12;
								}
								if (Static368.anInt6382 > 0) {
									Static142.aClass18_1.method5759("Particles: " + Static103.anInt2184 + " / " + Static368.anInt6382, local264, -256, local258);
								}
								local264 += 12;
								if (Static32.aBoolean28) {
									Static142.aClass18_1.method5759("Polys: " + Static30.aClass30_3.Z() + " Models: " + Static30.aClass30_3.U(), local264, -256, local258);
									local264 += 12;
									Static142.aClass18_1.method5759("Ls: " + Static9.anInt192 + " La: " + Static117.anInt4907 + " NPC: " + Static157.anInt3219 + " Pl: " + Static266.anInt5060, local264, -256, local258);
									local264 += 12;
									Static204.method3632();
								}
								Static353.aBooleanArray124[local42] = true;
								continue;
							}
						}
						if (local19.anInt6873 == 0) {
							if (local19.anInt6882 == Static256.anInt4941 && Static30.aClass30_3.method2040()) {
								Static30.aClass30_3.method2063(local90, local95, local19.anInt6904, local19.anInt6894);
							}
							method5981(local90 - local19.anInt6897, local158, local249, arg3, local247, local19.anInt6909, local42, local162, local95 - local19.anInt6845);
							if (local19.aClass240Array2 != null) {
								method5981(local90 - local19.anInt6897, local158, local249, local19.aClass240Array2, local247, local19.anInt6909, local42, local162, local95 - local19.anInt6845);
							}
							@Pc(880) Class4_Sub39 local880 = (Class4_Sub39) Static157.aClass96_22.method2797((long) local19.anInt6909);
							if (local880 != null) {
								Static110.method2179(local95, local247, local880.anInt6721, local158, local90, local42, local249, local162);
							}
							if (Static256.anInt4941 == local19.anInt6882 && Static30.aClass30_3.method2040()) {
								Static30.aClass30_3.method2098();
								Static345.aBoolean455 = true;
							}
							Static30.aClass30_3.w(arg1, arg7, arg4, arg2);
						}
						if (Static122.aBooleanArray51[local42] || Static265.anInt5027 > 1) {
							if (local19.anInt6873 == 3) {
								if (local98 == 0) {
									if (local19.aBoolean500) {
										Static30.aClass30_3.M(local90, local95, local19.anInt6904, local19.anInt6894, local19.anInt6883, 0);
									} else {
										Static30.aClass30_3.method2074(local90, local95, local19.anInt6904, local19.anInt6894, local19.anInt6883, 0);
									}
								} else if (local19.aBoolean500) {
									Static30.aClass30_3.M(local90, local95, local19.anInt6904, local19.anInt6894, 255 - (local98 & 0xFF) << 24 | local19.anInt6883 & 0xFFFFFF, 1);
								} else {
									Static30.aClass30_3.method2074(local90, local95, local19.anInt6904, local19.anInt6894, 255 - (local98 & 0xFF) << 24 | local19.anInt6883 & 0xFFFFFF, 1);
								}
							} else if (local19.anInt6873 == 4) {
								@Pc(1020) Class18 local1020 = local19.method5542(Static30.aClass30_3);
								if (local1020 != null) {
									local264 = local19.anInt6883;
									@Pc(1035) String local1035 = local19.aString61;
									if (local19.anInt6876 != -1) {
										@Pc(1045) Class274 local1045 = Static139.aClass193_1.method4650(local19.anInt6876);
										local1035 = local1045.aString82;
										if (local1035 == null) {
											local1035 = "null";
										}
										if ((local1045.anInt7881 == 1 || local19.anInt6881 != 1) && local19.anInt6881 != -1) {
											local1035 = "<col=ff9040>" + local1035 + "</col> x" + Static225.method3845(local19.anInt6881);
										}
									}
									if (Static341.aClass240_13 == local19) {
										local1035 = Static70.aClass21_22.method362(Static168.anInt3290);
										local264 = local19.anInt6883;
									}
									if (Static18.aBoolean18) {
										Static30.aClass30_3.IA(local90, local95, local90 + local19.anInt6904, local95 - -local19.anInt6894);
									}
									local1020.method5773(local19.anInt6850, 255 - (local98 & 0xFF) << 24 | local264, local19.anInt6915, local19.anInt6894, null, null, local19.anInt6878, local19.aBoolean501 ? 255 - (local98 & 0xFF) << 24 : -1, local1035, 0, local95, local90, local19.anInt6904, 0, aClass2Array45, local19.anInt6877);
									if (Static18.aBoolean18) {
										Static30.aClass30_3.w(arg1, arg7, arg4, arg2);
									}
								} else if (Static236.aBoolean304) {
									Static273.method4374(local19);
								}
							} else {
								@Pc(1248) int local1248;
								if (local19.anInt6873 == 5) {
									if (local19.anInt6925 < 0) {
										@Pc(1183) Class2 local1183;
										if (local19.anInt6876 == -1) {
											local1183 = local19.method5545(Static30.aClass30_3);
										} else {
											@Pc(1193) Class90 local1193 = local19.aBoolean505 ? Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1 : null;
											local1183 = Static139.aClass193_1.method4655(local19.anInt6856, local1193, local19.anInt6916, local19.anInt6853 | 0xFF000000, local19.anInt6881, local19.anInt6876, Static30.aClass30_3);
										}
										if (local1183 != null) {
											local264 = local1183.d();
											local508 = local1183.ga();
											local1248 = 255 - (local98 & 0xFF) << 24 | (local19.anInt6883 == 0 ? 16777215 : local19.anInt6883 & 0xFFFFFF);
											if (local19.aBoolean503) {
												Static30.aClass30_3.IA(local90, local95, local19.anInt6904 + local90, local19.anInt6894 + local95);
												if (local19.anInt6928 != 0) {
													local541 = (local19.anInt6904 + local264 - 1) / local264;
													local543 = (local508 + local19.anInt6894 - 1) / local508;
													for (local554 = 0; local554 < local541; local554++) {
														for (local650 = 0; local650 < local543; local650++) {
															if (local19.anInt6883 == 0) {
																local1183.method5920((float) (local90 + local264 * local554) + (float) local264 / 2.0F, (float) local508 / 2.0F + (float) (local650 * local508 + local95), 4096, local19.anInt6928);
															} else {
																local1183.method5919((float) local264 / 2.0F + (float) (local90 + local264 * local554), (float) (local95 - -(local650 * local508)) + (float) local508 / 2.0F, 4096, local19.anInt6928, local1248);
															}
														}
													}
												} else if (local19.anInt6883 == 0 && local98 == 0) {
													local1183.method5918(local90, local95, local19.anInt6904, local19.anInt6894);
												} else {
													local1183.PA(local90, local95, local19.anInt6904, local19.anInt6894, 0, local1248, 1);
												}
												Static30.aClass30_3.w(arg1, arg7, arg4, arg2);
											} else if (local19.anInt6883 == 0 && local98 == 0) {
												if (local19.anInt6928 != 0) {
													local1183.method5920((float) local90 + (float) local19.anInt6904 / 2.0F, (float) local19.anInt6894 / 2.0F + (float) local95, local19.anInt6904 * 4096 / local264, local19.anInt6928);
												} else if (local264 == local19.anInt6904 && local508 == local19.anInt6894) {
													local1183.method5921(local90, local95);
												} else {
													local1183.method5914(local90, local95, local19.anInt6904, local19.anInt6894);
												}
											} else if (local19.anInt6928 != 0) {
												local1183.method5919((float) local19.anInt6904 / 2.0F + (float) local90, (float) local95 + (float) local19.anInt6894 / 2.0F, local19.anInt6904 * 4096 / local264, local19.anInt6928, local1248);
											} else if (local19.anInt6904 == local264 && local19.anInt6894 == local508) {
												local1183.E(local90, local95, 0, local1248, 1);
											} else {
												local1183.XA(local90, local95, local19.anInt6904, local19.anInt6894, 0, local1248, 1);
											}
										} else if (Static236.aBoolean304) {
											Static273.method4374(local19);
										}
									} else {
										local19.method5527(Static348.aClass237_1, Static104.aClass180_1).method6063(local19.anInt6905 << 3, 0, 0, local19.anInt6854 << 3, local90, Static30.aClass30_3, local19.anInt6894, local19.anInt6904, local95);
									}
								} else if (local19.anInt6873 == 6) {
									Static464.method6293();
									@Pc(1578) Class57 local1578 = null;
									local264 = 0;
									@Pc(1611) Class130 local1611;
									@Pc(1619) Class90 local1619;
									if (local19.anInt6876 != -1) {
										@Pc(1590) Class274 local1590 = Static139.aClass193_1.method4650(local19.anInt6876);
										if (local1590 != null) {
											local1590 = local1590.method6257(local19.anInt6881);
											local1611 = local19.anInt6858 == -1 ? null : Static143.aClass85_1.method2406(local19.anInt6858);
											local1619 = local19.aBoolean505 ? Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1 : null;
											local1578 = local1590.method6259(local19.anInt6867, local1619, 2048, 1, local19.anInt6847, Static30.aClass30_3, local1611, local19.anInt6890);
											if (local1578 == null) {
												Static273.method4374(local19);
											} else {
												local264 = -local1578.ja() >> 1;
											}
										}
									} else if (local19.anInt6880 == 5) {
										local508 = local19.anInt6902;
										if (local508 >= 0 && local508 < 2048) {
											@Pc(1669) Class11_Sub5_Sub2_Sub1 local1669 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local508];
											@Pc(1682) Class130 local1682 = local19.anInt6858 == -1 ? null : Static143.aClass85_1.method2406(local19.anInt6858);
											if (local1669 != null && (local508 == Static147.anInt3062 || Static72.method1583(local1669.aString31) == local19.anInt6869)) {
												local1578 = local1669.aClass90_1.method2563(local1682, 0, Static30.aClass30_3, Static123.aClass223_1, -1, Static383.aClass126_2, 0, Static143.aClass85_1, local19.anInt6867, Static67.aClass224_1, 2048, local19.anInt6890, Static220.aClass247_1, null, null, local19.anInt6847, Static139.aClass193_1);
											}
										}
									} else if (local19.anInt6880 == 8 || local19.anInt6880 == 9) {
										@Pc(1741) Class4_Sub38 local1741 = Static351.method5112(false, local19.anInt6902);
										local1611 = local19.anInt6858 == -1 ? null : Static143.aClass85_1.method2406(local19.anInt6858);
										if (local1741 != null) {
											local1619 = local19.aBoolean505 ? Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1 : null;
											local1578 = local1741.method5415(local19.anInt6869, local19.anInt6890, local19.anInt6880 == 9, local19.anInt6847, local1611, local19.anInt6867, Static30.aClass30_3, local1619);
										}
									} else if (local19.anInt6858 == -1) {
										local1578 = local19.method5532(Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1, Static67.aClass224_1, Static143.aClass85_1, null, Static30.aClass30_3, -1, Static383.aClass126_2, -1, 0, 2048, Static139.aClass193_1, Static123.aClass223_1, Static220.aClass247_1);
										if (local1578 == null && Static236.aBoolean304) {
											Static273.method4374(local19);
										}
									} else {
										@Pc(1800) Class130 local1800 = Static143.aClass85_1.method2406(local19.anInt6858);
										local1578 = local19.method5532(Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1, Static67.aClass224_1, Static143.aClass85_1, local1800, Static30.aClass30_3, local19.anInt6847, Static383.aClass126_2, local19.anInt6867, local19.anInt6890, 2048, Static139.aClass193_1, Static123.aClass223_1, Static220.aClass247_1);
										if (local1578 == null && Static236.aBoolean304) {
											Static273.method4374(local19);
										}
									}
									if (local1578 != null) {
										if (local19.anInt6841 <= 0) {
											local508 = 512;
										} else {
											local508 = (local19.anInt6904 << 9) / local19.anInt6841;
										}
										if (local19.anInt6896 > 0) {
											local1248 = (local19.anInt6894 << 9) / local19.anInt6896;
										} else {
											local1248 = 512;
										}
										local541 = local19.anInt6904 / 2 + local90 + (local508 * local19.anInt6870 >> 9);
										local543 = local95 + local19.anInt6894 / 2 + (local1248 * local19.anInt6900 >> 9);
										Static117.aClass72_5.K();
										Static30.aClass30_3.method2064(Static117.aClass72_5);
										Static30.aClass30_3.b(local541, local543, local508, local1248);
										Static30.aClass30_3.PA((float) (local19.anInt6855 << 0), local19.aBoolean499 ? (float) (local19.anInt6861 << 0) : (float) (local19.anInt6861 << 0) * 1.5F);
										if (arg5 == -1412584499 || Static345.aBoolean455) {
											Static30.aClass30_3.H();
											Static30.aClass30_3.method2083();
											Static30.aClass30_3.w(arg1, arg7, arg4, arg2);
											Static345.aBoolean455 = false;
										}
										if (local19.aBoolean498) {
											Static30.aClass30_3.method2106(false);
										}
										local554 = Class4_Sub13.anIntArray497[local19.anInt6875 << 3] * (local19.anInt6851 << 0) >> 15;
										local650 = (local19.anInt6851 << 0) * Class4_Sub13.anIntArray496[local19.anInt6875 << 3] >> 15;
										Static113.aClass72_2.WA(-local19.anInt6903 << 3);
										Static113.aClass72_2.CA(local19.anInt6887 << 3);
										Static113.aClass72_2.J(local19.anInt6849 << 0, local264 + local554 + (local19.anInt6912 << 0), local650 - -(local19.anInt6912 << 0));
										Static113.aClass72_2.ba(local19.anInt6875 << 3);
										if (Static18.aBoolean18) {
											Static30.aClass30_3.IA(local90, local95, local90 + local19.anInt6904, local19.anInt6894 + local95);
										}
										if (local19.aBoolean499) {
											local1578.method6087(Static113.aClass72_2, null, local19.anInt6851 << 0);
										} else {
											local1578.method6073(Static113.aClass72_2, null, 1);
										}
										if (Static18.aBoolean18) {
											Static30.aClass30_3.w(arg1, arg7, arg4, arg2);
										}
										if (local19.aBoolean498) {
											Static30.aClass30_3.method2106(true);
										}
										Static30.aClass30_3.PA(0.0F, 0.0F);
									}
								} else if (local19.anInt6873 == 9) {
									if (local19.aBoolean496) {
										local264 = local19.anInt6894 + local95;
										local1248 = local95;
										local508 = local19.anInt6904 + local90;
									} else {
										local1248 = local19.anInt6894 + local95;
										local264 = local95;
										local508 = local19.anInt6904 + local90;
									}
									if (local19.anInt6901 == 1) {
										Static30.aClass30_3.method2097(local90, local264, local508, local1248, local19.anInt6883, 0);
									} else {
										Static30.aClass30_3.method2061(local90, local264, local508, local1248, local19.anInt6883, local19.anInt6901);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBIIZ)V")
	public static void method5984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) (arg1 | (arg4 ? Integer.MIN_VALUE : 0));
		@Pc(24) Class4_Sub38 local24 = (Class4_Sub38) Static201.aClass96_28.method2797(local14);
		if (local24 == null) {
			local24 = new Class4_Sub38();
			Static201.aClass96_28.method2805(local14, local24);
		}
		if (arg0 >= local24.anIntArray540.length) {
			@Pc(45) int[] local45 = new int[arg0 + 1];
			@Pc(50) int[] local50 = new int[arg0 + 1];
			for (@Pc(52) int local52 = 0; local52 < local24.anIntArray540.length; local52++) {
				local45[local52] = local24.anIntArray540[local52];
				local50[local52] = local24.anIntArray541[local52];
			}
			for (@Pc(78) int local78 = local24.anIntArray540.length; local78 < arg0; local78++) {
				local45[local78] = -1;
				local50[local78] = 0;
			}
			local24.anIntArray541 = local50;
			local24.anIntArray540 = local45;
		}
		local24.anIntArray540[arg0] = arg2;
		local24.anIntArray541[arg0] = arg3;
	}
}
