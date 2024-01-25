import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	public static int anInt3951;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	public static int anInt3950 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([Lclient!mq;IIIIIIIII)V")
	public static void method3167(@OriginalArg(0) Class156[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static121.aClass172_3.pa(arg8, arg2, arg3, arg7);
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(19) Class156 local19 = arg0[local13];
			if (local19 != null && (local19.anInt4839 == arg5 || arg5 == -1412584499 && Static238.aClass156_9 == local19)) {
				@Pc(63) int local63;
				if (arg6 == -1) {
					Class7_Sub5_Sub1.aRectangleArray1[Static246.anInt4693].setBounds(local19.anInt4800 + arg1, local19.anInt4806 - -arg4, local19.anInt4853, local19.anInt4823);
					local63 = Static246.anInt4693++;
				} else {
					local63 = arg6;
				}
				local19.anInt4857 = local63;
				local19.anInt4829 = Static253.anInt4787;
				if (!Static53.method1110(local19)) {
					if (local19.anInt4794 != 0) {
						Static403.method5202(local19);
					}
					@Pc(88) int local88 = local19.anInt4800 + arg1;
					@Pc(93) int local93 = local19.anInt4806 + arg4;
					@Pc(96) int local96 = local19.anInt4872;
					if (Static63.aBoolean138 && (Static53.method1118(local19).anInt7660 != 0 || local19.anInt4792 == 0) && local96 > 127) {
						local96 = 127;
					}
					@Pc(145) int local145;
					@Pc(149) int local149;
					if (local19 == Static238.aClass156_9) {
						if (arg5 != -1412584499 && (local19.anInt4828 == Static290.anInt5241 || Static374.anInt6291 == local19.anInt4828)) {
							Static123.aClass156Array1 = arg0;
							Static422.anInt6888 = arg1;
							Static187.anInt3747 = arg4;
							continue;
						}
						if (Static255.aBoolean429 && Static337.aBoolean491) {
							local145 = Static290.aClass100_1.method3218();
							local149 = Static290.aClass100_1.method3213();
							local149 -= Static371.anInt6244;
							local145 -= Static123.anInt2620;
							if (Static431.anInt6735 > local145) {
								local145 = Static431.anInt6735;
							}
							if (local149 < Static351.anInt5971) {
								local149 = Static351.anInt5971;
							}
							if (local145 + local19.anInt4853 > Static431.anInt6735 + Static89.aClass156_3.anInt4853) {
								local145 = Static89.aClass156_3.anInt4853 + Static431.anInt6735 - local19.anInt4853;
							}
							local88 = local145;
							if (Static89.aClass156_3.anInt4823 + Static351.anInt5971 < local149 - -local19.anInt4823) {
								local149 = Static351.anInt5971 + Static89.aClass156_3.anInt4823 - local19.anInt4823;
							}
							local93 = local149;
						}
						if (Static374.anInt6291 == local19.anInt4828) {
							local96 = 128;
						}
					}
					@Pc(239) int local239;
					@Pc(237) int local237;
					@Pc(250) int local250;
					@Pc(255) int local255;
					if (local19.anInt4792 == 2) {
						local237 = arg7;
						local239 = arg3;
						local149 = arg2;
						local145 = arg8;
					} else {
						local250 = local19.anInt4853 + local88;
						local255 = local19.anInt4823 + local93;
						local149 = local93 > arg2 ? local93 : arg2;
						if (local19.anInt4792 == 9) {
							local255++;
							local250++;
						}
						local145 = arg8 < local88 ? local88 : arg8;
						local239 = local250 >= arg3 ? arg3 : local250;
						local237 = arg7 > local255 ? local255 : arg7;
					}
					if (local145 < local239 && local149 < local237) {
						@Pc(563) int local563;
						@Pc(591) int local591;
						@Pc(593) int local593;
						@Pc(511) int local511;
						@Pc(513) int local513;
						if (local19.anInt4794 != 0) {
							if (Static311.anInt5509 == local19.anInt4794 || Static46.anInt1170 == local19.anInt4794) {
								Static193.method3085(local88, local19.anInt4853, local19.anInt4823, local93, Static46.anInt1170 == local19.anInt4794);
								Static55.aBooleanArray8[local63] = true;
								Static121.aClass172_3.pa(arg8, arg2, arg3, arg7);
								continue;
							}
							if (local19.anInt4794 == Static99.anInt2267) {
								if (local19.method3762(Static121.aClass172_3) != null) {
									Static170.method2751();
									Static382.method1458(local93, local19, Static121.aClass172_3, local88);
									Static78.aBooleanArray11[local63] = true;
									Static121.aClass172_3.pa(arg8, arg2, arg3, arg7);
								}
								continue;
							}
							if (Static201.anInt5252 == local19.anInt4794) {
								if (local19.method3762(Static121.aClass172_3) != null) {
									Static72.method1422(local93, local88, local19);
									Static78.aBooleanArray11[local63] = true;
									Static121.aClass172_3.pa(arg8, arg2, arg3, arg7);
								}
								continue;
							}
							if (Static143.anInt1880 == local19.anInt4794) {
								Static286.method1092(Static180.anInterface5_4, local19.anInt4853, local88, Static121.aClass172_3, local19.anInt4823, local93);
								Static55.aBooleanArray8[local63] = true;
								Static121.aClass172_3.pa(arg8, arg2, arg3, arg7);
								continue;
							}
							if (local19.anInt4794 == Static423.anInt6893) {
								Static373.method4870(local93, local19.anInt4853, local88, Static121.aClass172_3, local19.anInt4823);
								Static55.aBooleanArray8[local63] = true;
								Static121.aClass172_3.pa(arg8, arg2, arg3, arg7);
								continue;
							}
							if (local19.anInt4794 == Static158.anInt3165) {
								if (!Static188.aBoolean323 && !Static76.aBoolean161) {
									continue;
								}
								local250 = local88 + local19.anInt4853;
								local255 = local93 + 15;
								if (Static188.aBoolean323) {
									Static299.aClass59_3.method5781(local250, -256, local255, "Fps:" + Static320.anInt5587);
									local255 += 15;
									@Pc(502) Runtime local502 = Runtime.getRuntime();
									local511 = (int) ((local502.totalMemory() - local502.freeMemory()) / 1024L);
									local513 = -256;
									if (local511 > 65536) {
										local513 = -65536;
									}
									Static299.aClass59_3.method5781(local250, local513, local255, "Mem:" + local511 + "k");
									local255 += 15;
									Static299.aClass59_3.method5781(local250, -256, local255, "In:" + Static420.anInt6876 + "B/s Out:" + Static293.anInt5277 + "B/s");
									local255 += 15;
									local563 = Static121.aClass172_3.FA() / 1024;
									Static299.aClass59_3.method5781(local250, local563 <= 65536 ? -256 : -65536, local255, "Offheap:" + local563 + "k");
									local255 += 15;
									local591 = 0;
									local593 = 0;
									@Pc(595) int local595 = 0;
									for (@Pc(597) int local597 = 0; local597 < 30; local597++) {
										local591 += Static438.aClass25_Sub1Array2[local597].method673();
										local593 += Static438.aClass25_Sub1Array2[local597].method672();
										local595 += Static438.aClass25_Sub1Array2[local597].method676();
									}
									@Pc(635) int local635 = local595 * 100 / local591;
									@Pc(641) int local641 = local593 * 10000 / local591;
									@Pc(661) String local661 = "Cache:" + Static102.method1789(0, (long) local641, 2, true) + "% (" + local635 + "%)";
									Static271.aClass59_2.method5781(local250, -256, local255, local661);
									local255 += 12;
								}
								if (Static434.anInt7261 > 0) {
									Static271.aClass59_2.method5781(local250, -256, local255, "Particles: " + Static161.anInt3312 + " / " + Static434.anInt7261);
								}
								local255 += 12;
								if (Static76.aBoolean161) {
									Static271.aClass59_2.method5781(local250, -256, local255, "Polys: " + Static121.aClass172_3.xa() + " Models: " + Static121.aClass172_3.g());
									local255 += 12;
									Static271.aClass59_2.method5781(local250, -256, local255, "Ls: " + Static382.anInt1873 + " La: " + Static186.anInt3735 + " NPC: " + Static358.anInt6085 + " Pl: " + Static85.anInt2106);
									local255 += 12;
									Static86.method1646();
								}
								Static55.aBooleanArray8[local63] = true;
								continue;
							}
						}
						if (local19.anInt4792 == 0) {
							if (Static172.anInt3432 == local19.anInt4794 && Static121.aClass172_3.method5539()) {
								Static121.aClass172_3.method5479(local88, local93, local19.anInt4853, local19.anInt4823);
							}
							method3167(arg0, local88 - local19.anInt4821, local149, local239, local93 - local19.anInt4801, local19.anInt4850, local63, local237, local145);
							if (local19.aClass156Array2 != null) {
								method3167(local19.aClass156Array2, local88 - local19.anInt4821, local149, local239, local93 - local19.anInt4801, local19.anInt4850, local63, local237, local145);
							}
							@Pc(825) Class3_Sub9 local825 = (Class3_Sub9) Static318.aClass11_42.method324((long) local19.anInt4850);
							if (local825 != null) {
								Static316.method4359(local88, local93, local239, local825.anInt1804, local63, local145, local237, local149);
							}
							if (local19.anInt4794 == Static172.anInt3432 && Static121.aClass172_3.method5539()) {
								Static121.aClass172_3.method5470();
								Static284.aBoolean456 = true;
							}
							Static121.aClass172_3.pa(arg8, arg2, arg3, arg7);
						}
						if (Static128.aBooleanArray12[local63] || Static350.anInt3652 > 1) {
							if (local19.anInt4792 == 3) {
								if (local96 == 0) {
									if (local19.aBoolean424) {
										Static121.aClass172_3.NA(local88, local93, local19.anInt4853, local19.anInt4823, local19.anInt4847, 0);
									} else {
										Static121.aClass172_3.method5484(local88, local93, local19.anInt4853, local19.anInt4823, local19.anInt4847, 0);
									}
								} else if (local19.aBoolean424) {
									Static121.aClass172_3.NA(local88, local93, local19.anInt4853, local19.anInt4823, 255 - (local96 & 0xFF) << 24 | local19.anInt4847 & 0xFFFFFF, 1);
								} else {
									Static121.aClass172_3.method5484(local88, local93, local19.anInt4853, local19.anInt4823, local19.anInt4847 & 0xFFFFFF | 255 - (local96 & 0xFF) << 24, 1);
								}
							} else if (local19.anInt4792 == 4) {
								@Pc(961) Class59 local961 = local19.method3759(Static121.aClass172_3);
								if (local961 != null) {
									local255 = local19.anInt4847;
									@Pc(976) String local976 = local19.aString43;
									if (local19.anInt4826 != -1) {
										@Pc(986) Class81 local986 = Static314.aClass12_2.method327(local19.anInt4826);
										local976 = local986.aString17;
										if (local976 == null) {
											local976 = "null";
										}
										if ((local986.anInt2535 == 1 || local19.anInt4838 != 1) && local19.anInt4838 != -1) {
											local976 = "<col=ff9040>" + local976 + "</col> x" + Static276.method3917(local19.anInt4838);
										}
									}
									if (local19 == Static318.aClass156_17) {
										local976 = Static248.aClass189_150.method4262(Static53.anInt1454);
										local255 = local19.anInt4847;
									}
									if (Static330.aBoolean488) {
										Static121.aClass172_3.Z(local88, local93, local19.anInt4853 + local88, local93 + local19.anInt4823);
									}
									local961.method5786(local19.anInt4819, local93, 255 - (local96 & 0xFF) << 24 | local255, local88, 0, local19.aBoolean428 ? 255 - (local96 & 0xFF) << 24 : -1, local976, 0, null, local19.anInt4841, local19.anInt4809, null, local19.anInt4853, local19.anInt4803, local19.anInt4823, Static260.aClass8Array170);
									if (Static330.aBoolean488) {
										Static121.aClass172_3.pa(arg8, arg2, arg3, arg7);
									}
								} else if (Static166.aBoolean288) {
									Static386.method5010(local19);
								}
							} else {
								@Pc(1198) int local1198;
								if (local19.anInt4792 == 5) {
									if (local19.anInt4805 >= 0) {
										local19.method3767(Static353.aClass212_1, Static212.aClass184_1).method2711(local93, 0, local19.anInt4846 << 3, local19.anInt4823, 0, local19.anInt4853, Static121.aClass172_3, local19.anInt4799 << 3, local88);
									} else {
										@Pc(1155) Class8 local1155;
										if (local19.anInt4826 == -1) {
											local1155 = local19.method3760(Static121.aClass172_3);
										} else {
											@Pc(1165) Class206 local1165 = local19.aBoolean419 ? Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1 : null;
											local1155 = Static314.aClass12_2.method326(local19.anInt4876 | 0xFF000000, local19.anInt4810, local19.anInt4791, local19.anInt4838, Static121.aClass172_3, local19.anInt4826, local1165);
										}
										if (local1155 != null) {
											local255 = local1155.ja();
											local1198 = local1155.JA();
											local511 = (local19.anInt4847 == 0 ? 16777215 : local19.anInt4847 & 0xFFFFFF) | 255 - (local96 & 0xFF) << 24;
											if (local19.aBoolean420) {
												Static121.aClass172_3.Z(local88, local93, local88 + local19.anInt4853, local93 + local19.anInt4823);
												if (local19.anInt4865 != 0) {
													local513 = (local19.anInt4853 + local255 - 1) / local255;
													local563 = (local19.anInt4823 + local1198 - 1) / local1198;
													for (local591 = 0; local591 < local513; local591++) {
														for (local593 = 0; local593 < local563; local593++) {
															if (local19.anInt4847 == 0) {
																local1155.method6004((float) (local591 * local255 + local88) + (float) local255 / 2.0F, (float) local1198 / 2.0F + (float) (local93 + local593 * local1198), 4096, local19.anInt4865);
															} else {
																local1155.method5998((float) local255 / 2.0F + (float) (local255 * local591 + local88), (float) (local1198 * local593 + local93) + (float) local1198 / 2.0F, 4096, local19.anInt4865, local511);
															}
														}
													}
												} else if (local19.anInt4847 == 0 && local96 == 0) {
													local1155.method5997(local88, local93, local19.anInt4853, local19.anInt4823);
												} else {
													local1155.D(local88, local93, local19.anInt4853, local19.anInt4823, 0, local511, 1);
												}
												Static121.aClass172_3.pa(arg8, arg2, arg3, arg7);
											} else if (local19.anInt4847 == 0 && local96 == 0) {
												if (local19.anInt4865 != 0) {
													local1155.method6004((float) local88 + (float) local19.anInt4853 / 2.0F, (float) local93 + (float) local19.anInt4823 / 2.0F, local19.anInt4853 * 4096 / local255, local19.anInt4865);
												} else if (local255 == local19.anInt4853 && local1198 == local19.anInt4823) {
													local1155.method6001(local88, local93);
												} else {
													local1155.method5999(local88, local93, local19.anInt4853, local19.anInt4823);
												}
											} else if (local19.anInt4865 != 0) {
												local1155.method5998((float) local19.anInt4853 / 2.0F + (float) local88, (float) local19.anInt4823 / 2.0F + (float) local93, local19.anInt4853 * 4096 / local255, local19.anInt4865, local511);
											} else if (local255 == local19.anInt4853 && local19.anInt4823 == local1198) {
												local1155.YA(local88, local93, 0, local511, 1);
											} else {
												local1155.M(local88, local93, local19.anInt4853, local19.anInt4823, 0, local511, 1);
											}
										} else if (Static166.aBoolean288) {
											Static386.method5010(local19);
										}
									}
								} else if (local19.anInt4792 == 6) {
									Static373.method4873();
									@Pc(1534) Class9 local1534 = null;
									local255 = 0;
									@Pc(1644) Class128 local1644;
									@Pc(1654) Class206 local1654;
									if (local19.anInt4826 != -1) {
										@Pc(1751) Class81 local1751 = Static314.aClass12_2.method327(local19.anInt4826);
										if (local1751 != null) {
											local1751 = local1751.method1940(local19.anInt4838);
											local1644 = local19.lb == -1 ? null : Static301.aClass170_3.method3936(local19.lb);
											local1654 = local19.aBoolean419 ? Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1 : null;
											local1534 = local1751.method1942(local19.anInt4860, 1, local1644, local1654, local19.anInt4851, local19.anInt4795, 2048, Static121.aClass172_3);
											if (local1534 == null) {
												Static386.method5010(local19);
											} else {
												local255 = -local1534.b() >> 1;
											}
										}
									} else if (local19.anInt4832 == 5) {
										local1198 = local19.anInt4816;
										if (local1198 >= 0 && local1198 < 2048) {
											@Pc(1558) Class7_Sub2_Sub3_Sub2 local1558 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local1198];
											@Pc(1571) Class128 local1571 = local19.lb == -1 ? null : Static301.aClass170_3.method3936(local19.lb);
											if (local1558 != null && (Static319.anInt1936 == local1198 || Static48.method867(local1558.aString36) == local19.anInt4815)) {
												local1534 = local1558.aClass206_1.method4459(Static314.aClass12_2, -1, local19.anInt4860, Static85.aClass49_1, local1571, null, local19.anInt4795, Static24.aClass69_1, local19.anInt4851, Static432.aClass73_1, Static121.aClass172_3, Static301.aClass170_3, 2048, null, 0, 0, Static364.aClass96_2);
											}
										}
									} else if (local19.anInt4832 == 8 || local19.anInt4832 == 9) {
										@Pc(1632) Class3_Sub32 local1632 = Static238.method3609(local19.anInt4816, false);
										local1644 = local19.lb == -1 ? null : Static301.aClass170_3.method3936(local19.lb);
										if (local1632 != null) {
											local1654 = local19.aBoolean419 ? Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1 : null;
											local1534 = local1632.method3881(local19.anInt4851, local19.anInt4832 == 9, local19.anInt4860, local1654, local1644, local19.anInt4795, Static121.aClass172_3, local19.anInt4815);
										}
									} else if (local19.lb == -1) {
										local1534 = local19.method3772(Static121.aClass172_3, Static432.aClass73_1, 2048, Static85.aClass49_1, Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1, 0, Static364.aClass96_2, Static301.aClass170_3, Static314.aClass12_2, -1, Static24.aClass69_1, -1, null);
										if (local1534 == null && Static166.aBoolean288) {
											Static386.method5010(local19);
										}
									} else {
										@Pc(1690) Class128 local1690 = Static301.aClass170_3.method3936(local19.lb);
										local1534 = local19.method3772(Static121.aClass172_3, Static432.aClass73_1, 2048, Static85.aClass49_1, Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1, local19.anInt4795, Static364.aClass96_2, Static301.aClass170_3, Static314.aClass12_2, local19.anInt4851, Static24.aClass69_1, local19.anInt4860, local1690);
										if (local1534 == null && Static166.aBoolean288) {
											Static386.method5010(local19);
										}
									}
									if (local1534 != null) {
										if (local19.anInt4870 > 0) {
											local1198 = (local19.anInt4853 << 9) / local19.anInt4870;
										} else {
											local1198 = 512;
										}
										if (local19.anInt4802 <= 0) {
											local511 = 512;
										} else {
											local511 = (local19.anInt4823 << 9) / local19.anInt4802;
										}
										local513 = local88 + local19.anInt4853 / 2 + (local19.anInt4867 * local1198 >> 9);
										local563 = local19.anInt4823 / 2 + local93 + (local511 * local19.anInt4862 >> 9);
										Static303.aClass107_4.HA();
										Static121.aClass172_3.m(Static303.aClass107_4);
										Static121.aClass172_3.GA(local513, local563, local1198, local511);
										Static121.aClass172_3.o((float) (local19.anInt4858 << 0), local19.aBoolean421 ? (float) (local19.anInt4835 << 0) : (float) (local19.anInt4835 << 0) * 1.5F);
										if (arg5 == -1412584499 || Static284.aBoolean456) {
											Static121.aClass172_3.va();
											Static121.aClass172_3.method5518();
											Static121.aClass172_3.pa(arg8, arg2, arg3, arg7);
											Static284.aBoolean456 = false;
										}
										if (local19.aBoolean415) {
											Static121.aClass172_3.method5527(false);
										}
										local591 = (local19.anInt4811 << 0) * Class3_Sub2_Sub17.anIntArray289[local19.anInt4817 << 3] >> 15;
										local593 = Class3_Sub2_Sub17.anIntArray290[local19.anInt4817 << 3] * (local19.anInt4811 << 0) >> 15;
										Static407.aClass107_5.ma(-local19.anInt4849 << 3);
										Static407.aClass107_5.c(local19.anInt4873 << 3);
										Static407.aClass107_5.ZA(local19.anInt4844 << 0, (local19.anInt4834 << 0) + (local591 + local255), (local19.anInt4834 << 0) + local593);
										Static407.aClass107_5.na(local19.anInt4817 << 3);
										if (Static330.aBoolean488) {
											Static121.aClass172_3.Z(local88, local93, local88 + local19.anInt4853, local19.anInt4823 + local93);
										}
										if (local19.aBoolean421) {
											local1534.method5683(Static407.aClass107_5, null, local19.anInt4811 << 0);
										} else {
											local1534.method5695(Static407.aClass107_5, null, 1);
										}
										if (Static330.aBoolean488) {
											Static121.aClass172_3.pa(arg8, arg2, arg3, arg7);
										}
										if (local19.aBoolean415) {
											Static121.aClass172_3.method5527(true);
										}
										Static121.aClass172_3.o(0.0F, 0.0F);
									}
								} else if (local19.anInt4792 == 9) {
									if (local19.aBoolean425) {
										local1198 = local88 + local19.anInt4853;
										local255 = local93 + local19.anInt4823;
										local511 = local93;
									} else {
										local255 = local93;
										local1198 = local88 + local19.anInt4853;
										local511 = local93 + local19.anInt4823;
									}
									if (local19.anInt4852 == 1) {
										Static121.aClass172_3.method5528(local88, local255, local1198, local511, local19.anInt4847, 0);
									} else {
										Static121.aClass172_3.method5535(local88, local255, local1198, local511, local19.anInt4847, local19.anInt4852);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)I")
	public static int method3168(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static276.anIntArray343[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)I")
	public static int method3169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 >>> 31;
		return (arg0 + local15) / arg1 - local15;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!ck;)V")
	public static void method3170(@OriginalArg(1) Class3_Sub7_Sub1 arg0) {
		@Pc(5) int local5 = 0;
		arg0.method1064();
		@Pc(15) int local15;
		@Pc(39) int local39;
		for (@Pc(10) int local10 = 0; local10 < Static160.anInt3271; local10++) {
			local15 = Static162.anIntArray212[local10];
			if ((Static170.aByteArray47[local15] & 0x1) == 0) {
				if (local5 > 0) {
					Static170.aByteArray47[local15] = (byte) (Static170.aByteArray47[local15] | 0x2);
					local5--;
				} else {
					local39 = arg0.method1063(1);
					if (local39 == 0) {
						local5 = Static371.method4867(arg0);
						Static170.aByteArray47[local15] = (byte) (Static170.aByteArray47[local15] | 0x2);
					} else {
						Static330.method4450(local15, arg0);
					}
				}
			}
		}
		arg0.method1065();
		if (local5 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method1064();
		@Pc(121) int local121;
		for (local15 = 0; local15 < Static160.anInt3271; local15++) {
			local39 = Static162.anIntArray212[local15];
			if ((Static170.aByteArray47[local39] & 0x1) != 0) {
				if (local5 > 0) {
					Static170.aByteArray47[local39] = (byte) (Static170.aByteArray47[local39] | 0x2);
					local5--;
				} else {
					local121 = arg0.method1063(1);
					if (local121 == 0) {
						local5 = Static371.method4867(arg0);
						Static170.aByteArray47[local39] = (byte) (Static170.aByteArray47[local39] | 0x2);
					} else {
						Static330.method4450(local39, arg0);
					}
				}
			}
		}
		arg0.method1065();
		if (local5 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method1064();
		@Pc(200) int local200;
		for (local39 = 0; local39 < Static207.anInt4005; local39++) {
			local121 = Static131.anIntArray168[local39];
			if ((Static170.aByteArray47[local121] & 0x1) != 0) {
				if (local5 > 0) {
					Static170.aByteArray47[local121] = (byte) (Static170.aByteArray47[local121] | 0x2);
					local5--;
				} else {
					local200 = arg0.method1063(1);
					if (local200 == 0) {
						local5 = Static371.method4867(arg0);
						Static170.aByteArray47[local121] = (byte) (Static170.aByteArray47[local121] | 0x2);
					} else if (Static119.method1945(arg0, local121)) {
						Static170.aByteArray47[local121] = (byte) (Static170.aByteArray47[local121] | 0x2);
					}
				}
			}
		}
		arg0.method1065();
		if (local5 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method1064();
		for (local121 = 0; local121 < Static207.anInt4005; local121++) {
			local200 = Static131.anIntArray168[local121];
			if ((Static170.aByteArray47[local200] & 0x1) == 0) {
				if (local5 > 0) {
					local5--;
					Static170.aByteArray47[local200] = (byte) (Static170.aByteArray47[local200] | 0x2);
				} else {
					@Pc(300) int local300 = arg0.method1063(1);
					if (local300 == 0) {
						local5 = Static371.method4867(arg0);
						Static170.aByteArray47[local200] = (byte) (Static170.aByteArray47[local200] | 0x2);
					} else if (Static119.method1945(arg0, local200)) {
						Static170.aByteArray47[local200] = (byte) (Static170.aByteArray47[local200] | 0x2);
					}
				}
			}
		}
		arg0.method1065();
		if (local5 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static207.anInt4005 = 0;
		Static160.anInt3271 = 0;
		for (local200 = 1; local200 < 2048; local200++) {
			Static170.aByteArray47[local200] = (byte) (Static170.aByteArray47[local200] >> 1);
			@Pc(368) Class7_Sub2_Sub3_Sub2 local368 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local200];
			if (local368 == null) {
				Static131.anIntArray168[Static207.anInt4005++] = local200;
			} else {
				Static162.anIntArray212[Static160.anInt3271++] = local200;
			}
		}
	}
}
