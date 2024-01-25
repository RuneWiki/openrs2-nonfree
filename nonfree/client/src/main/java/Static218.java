import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Lclient!gu;")
	public static Class107 aClass107_3;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Lclient!nj;")
	private static final Class202 aClass202_126 = new Class202("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "Lclient!ud;")
	public static final Class281 aClass281_3 = new Class281();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII[Lclient!wca;IIII)V")
	public static void method3455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class310[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static103.aClass39_3.N(arg8, arg0, arg1, arg6);
		for (@Pc(13) int local13 = 0; local13 < arg5.length; local13++) {
			@Pc(27) Class310 local27 = arg5[local13];
			if (local27 != null && (local27.anInt9167 == arg7 || arg7 == -1412584499 && Static72.aClass310_4 == local27)) {
				@Pc(66) int local66;
				if (arg3 == -1) {
					Class96.aRectangleArray1[Static528.anInt9120].setBounds(arg4 + local27.anInt9184, arg2 + local27.anInt9175, local27.anInt9163, local27.anInt9198);
					local66 = Static528.anInt9120++;
				} else {
					local66 = arg3;
				}
				local27.anInt9211 = local66;
				local27.anInt9236 = Static115.anInt2326;
				if (!Static67.method1256(local27)) {
					if (local27.anInt9234 != 0) {
						Static170.method2867(local27);
					}
					@Pc(93) int local93 = local27.anInt9184 + arg4;
					@Pc(98) int local98 = arg2 + local27.anInt9175;
					@Pc(101) int local101 = local27.anInt9219;
					if (Static372.aBoolean522 && (Static67.method1257(local27).anInt7446 != 0 || local27.anInt9220 == 0) && local101 > 127) {
						local101 = 127;
					}
					@Pc(152) int local152;
					@Pc(156) int local156;
					if (Static72.aClass310_4 == local27) {
						if (arg7 != -1412584499 && (local27.anInt9199 == Static289.anInt5335 || local27.anInt9199 == Static464.anInt8376)) {
							Static308.aClass310Array1 = arg5;
							Static194.anInt1960 = arg2;
							Static8.anInt213 = arg4;
							continue;
						}
						if (Static277.aBoolean382 && Static161.aBoolean238) {
							local152 = Static61.aClass214_1.method7241();
							local156 = Static61.aClass214_1.method7240();
							local156 -= Static376.anInt6978;
							local152 -= Static203.anInt3701;
							if (Static327.anInt6051 > local152) {
								local152 = Static327.anInt6051;
							}
							if (Static540.anInt9345 > local156) {
								local156 = Static540.anInt9345;
							}
							if (Static325.aClass310_15.anInt9163 + Static327.anInt6051 < local152 - -local27.anInt9163) {
								local152 = Static325.aClass310_15.anInt9163 + Static327.anInt6051 - local27.anInt9163;
							}
							if (local27.anInt9198 + local156 > Static540.anInt9345 + Static325.aClass310_15.anInt9198) {
								local156 = Static540.anInt9345 + Static325.aClass310_15.anInt9198 - local27.anInt9198;
							}
							local93 = local152;
							local98 = local156;
						}
						if (Static464.anInt8376 == local27.anInt9199) {
							local101 = 128;
						}
					}
					@Pc(237) int local237;
					@Pc(239) int local239;
					@Pc(248) int local248;
					@Pc(253) int local253;
					if (local27.anInt9220 == 2) {
						local152 = arg8;
						local237 = arg1;
						local239 = arg6;
						local156 = arg0;
					} else {
						local248 = local93 + local27.anInt9163;
						local253 = local27.anInt9198 + local98;
						if (local27.anInt9220 == 9) {
							local253++;
							local248++;
						}
						local152 = arg8 >= local93 ? arg8 : local93;
						local156 = local98 <= arg0 ? arg0 : local98;
						local239 = arg6 > local253 ? local253 : arg6;
						local237 = arg1 <= local248 ? arg1 : local248;
					}
					if (local152 < local237 && local156 < local239) {
						@Pc(523) int local523;
						@Pc(532) int local532;
						@Pc(627) int local627;
						@Pc(487) int local487;
						@Pc(521) int local521;
						if (local27.anInt9234 != 0) {
							if (Static249.anInt4562 == local27.anInt9234 || Static231.anInt4165 == local27.anInt9234) {
								Static182.method3006(local27.anInt9198, local98, local93, Static231.anInt4165 == local27.anInt9234, local27.anInt9163);
								Static368.aBooleanArray32[local66] = true;
								Static103.aClass39_3.N(arg8, arg0, arg1, arg6);
								continue;
							}
							if (Static403.anInt7608 == local27.anInt9234) {
								if (local27.method7649(Static103.aClass39_3) != null) {
									Static491.method6549();
									Static188.method248(local93, local27, Static103.aClass39_3, local98);
									Static36.aBooleanArray6[local66] = true;
									Static103.aClass39_3.N(arg8, arg0, arg1, arg6);
								}
								continue;
							}
							if (local27.anInt9234 == Static497.anInt8731) {
								if (local27.method7649(Static103.aClass39_3) != null) {
									Static536.method7740(local93, local98, local27);
									Static36.aBooleanArray6[local66] = true;
									Static103.aClass39_3.N(arg8, arg0, arg1, arg6);
								}
								continue;
							}
							if (local27.anInt9234 == Static23.anInt475) {
								Static168.method2829(local98, local27.anInt9163, local27.anInt9198, local93, Static103.aClass39_3, Static11.anInterface12_10);
								Static368.aBooleanArray32[local66] = true;
								Static103.aClass39_3.N(arg8, arg0, arg1, arg6);
								continue;
							}
							if (Static199.anInt3598 == local27.anInt9234) {
								Static413.method6459(Static103.aClass39_3, local93, local27.anInt9163, local27.anInt9198, local98);
								Static368.aBooleanArray32[local66] = true;
								Static103.aClass39_3.N(arg8, arg0, arg1, arg6);
								continue;
							}
							if (Static413.anInt7702 == local27.anInt9234) {
								if (!Static382.aBoolean529 && !Static325.aBoolean410) {
									continue;
								}
								local248 = local93 + local27.anInt9163;
								local253 = local98 + 15;
								if (Static382.aBoolean529) {
									local487 = -256;
									if (Static441.anInt8032 < 20) {
										local487 = -65536;
									}
									Static477.aClass47_4.method7603("Fps:" + Static441.anInt8032, local253, local487, local248);
									local253 += 15;
									@Pc(511) Runtime local511 = Runtime.getRuntime();
									local521 = (int) ((local511.totalMemory() - local511.freeMemory()) / 1024L);
									local523 = -256;
									if (local521 > 65536) {
										if (Static287.aBoolean391) {
											Static234.method3654();
											for (local532 = 0; local532 < 10; local532++) {
												System.gc();
											}
											local521 = (int) ((local511.totalMemory() - local511.freeMemory()) / 1024L);
											if (local521 > 65536) {
												Static215.method6797("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local523 = -65536;
									}
									Static477.aClass47_4.method7603("Mem:" + local521 + "k", local253, local523, local248);
									local253 += 15;
									Static477.aClass47_4.method7603("In:" + Static233.anInt8026 + "B/s Out:" + Static431.anInt7911 + "B/s", local253, -256, local248);
									local253 += 15;
									local532 = Static103.aClass39_3.U() / 1024;
									Static477.aClass47_4.method7603("Offheap:" + local532 + "k", local253, local532 <= 65536 ? -256 : -65536, local248);
									local253 += 15;
									local627 = 0;
									@Pc(629) int local629 = 0;
									@Pc(631) int local631 = 0;
									for (@Pc(633) int local633 = 0; local633 < 32; local633++) {
										local627 += Static107.aClass164_Sub1Array1[local633].method4005();
										local629 += Static107.aClass164_Sub1Array1[local633].method4001();
										local631 += Static107.aClass164_Sub1Array1[local633].method4006();
									}
									@Pc(669) int local669 = local631 * 100 / local627;
									@Pc(675) int local675 = local629 * 10000 / local627;
									@Pc(695) String local695 = "Cache:" + Static186.method3044(true, (long) local675, 0, 2) + "% (" + local669 + "%)";
									Static301.aClass47_3.method7603(local695, local253, -256, local248);
									local253 += 12;
								}
								if (Static160.anInt2910 > 0) {
									Static301.aClass47_3.method7603("Particles: " + Static252.anInt4585 + " / " + Static160.anInt2910, local253, -256, local248);
								}
								local253 += 12;
								if (Static325.aBoolean410) {
									Static301.aClass47_3.method7603("Polys: " + Static103.aClass39_3.YA() + " Models: " + Static103.aClass39_3.ba(), local253, -256, local248);
									local253 += 12;
									Static301.aClass47_3.method7603("Ls: " + Static119.anInt2431 + " La: " + Static477.anInt8527 + " NPC: " + Static153.anInt9010 + " Pl: " + Static185.anInt3397, local253, -256, local248);
									local253 += 12;
									Static516.method7510();
								}
								Static368.aBooleanArray32[local66] = true;
								continue;
							}
						}
						if (local27.anInt9220 == 0) {
							if (Static199.anInt3600 == local27.anInt9234 && Static103.aClass39_3.method6043()) {
								Static103.aClass39_3.method6016(local93, local98, local27.anInt9163, local27.anInt9198);
							}
							method3455(local156, local237, local98 - local27.anInt9227, local66, local93 - local27.anInt9230, arg5, local239, local27.anInt9226, local152);
							if (local27.aClass310Array2 != null) {
								method3455(local156, local237, local98 - local27.anInt9227, local66, local93 - local27.anInt9230, local27.aClass310Array2, local239, local27.anInt9226, local152);
							}
							@Pc(859) Class2_Sub9 local859 = (Class2_Sub9) Static110.aClass127_21.method3205((long) local27.anInt9226);
							if (local859 != null) {
								Static289.method4599(local93, local98, local237, local156, local859.anInt833, local152, local66, local239);
							}
							if (Static199.anInt3600 == local27.anInt9234 && Static103.aClass39_3.method6043()) {
								Static103.aClass39_3.method6041();
								Static338.aBoolean472 = true;
							}
							Static103.aClass39_3.N(arg8, arg0, arg1, arg6);
						}
						if (Static503.aBooleanArray37[local66] || Static10.anInt227 > 1) {
							if (local27.anInt9220 == 3) {
								if (local101 == 0) {
									if (local27.aBoolean665) {
										Static103.aClass39_3.f(local93, local98, local27.anInt9163, local27.anInt9198, local27.anInt9172, 0);
									} else {
										Static103.aClass39_3.method6060(local93, local98, local27.anInt9163, local27.anInt9198, local27.anInt9172, 0);
									}
								} else if (local27.aBoolean665) {
									Static103.aClass39_3.f(local93, local98, local27.anInt9163, local27.anInt9198, 255 - (local101 & 0xFF) << 24 | local27.anInt9172 & 0xFFFFFF, 1);
								} else {
									Static103.aClass39_3.method6060(local93, local98, local27.anInt9163, local27.anInt9198, local27.anInt9172 & 0xFFFFFF | 255 - (local101 & 0xFF) << 24, 1);
								}
							} else if (local27.anInt9220 == 4) {
								@Pc(1000) Class47 local1000 = local27.method7639(Static103.aClass39_3);
								if (local1000 != null) {
									local253 = local27.anInt9172;
									@Pc(1015) String local1015 = local27.aString204;
									if (local27.anInt9224 != -1) {
										@Pc(1026) Class300 local1026 = Static464.aClass115_1.method2970(local27.anInt9224);
										local1015 = local1026.aString197;
										if (local1015 == null) {
											local1015 = "null";
										}
										if ((local1026.anInt8930 == 1 || local27.anInt9153 != 1) && local27.anInt9153 != -1) {
											local1015 = "<col=ff9040>" + local1015 + "</col> x" + Static167.method2825(local27.anInt9153);
										}
									}
									if (Static126.aClass310_16 == local27) {
										local1015 = aClass202_126.method5139(Static172.anInt6352);
										local253 = local27.anInt9172;
									}
									if (Static101.aBoolean613) {
										Static103.aClass39_3.F(local93, local98, local27.anInt9163 + local93, local98 - -local27.anInt9198);
									}
									local1000.method7599(Static42.aClass35Array3, local27.aBoolean651 ? 255 - (local101 & 0xFF) << 24 : -1, 0, null, local27.anInt9163, 255 - (local101 & 0xFF) << 24 | local253, local27.anInt9198, local27.anInt9151, 0, local27.anInt9197, local27.anInt9168, local1015, local98, null, local93, local27.anInt9174);
									if (Static101.aBoolean613) {
										Static103.aClass39_3.N(arg8, arg0, arg1, arg6);
									}
								} else if (Static436.aBoolean587) {
									Static273.method4342(local27);
								}
							} else {
								@Pc(1247) int local1247;
								if (local27.anInt9220 == 5) {
									if (local27.anInt9235 >= 0) {
										local27.method7643(Static171.aClass131_1, Static222.aClass299_2).method4744(local27.anInt9198, local27.anInt9163, 0, local27.anInt9147 << 3, local98, Static103.aClass39_3, local27.anInt9206 << 3, local93, 0);
									} else {
										@Pc(1189) Class35 local1189;
										if (local27.anInt9224 == -1) {
											local1189 = local27.method7640(Static103.aClass39_3);
										} else {
											@Pc(1199) Class146 local1199 = local27.aBoolean660 ? Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1 : null;
											local1189 = Static464.aClass115_1.method2977(Static103.aClass39_3, local27.anInt9224, local27.anInt9153, local27.anInt9169 | 0xFF000000, local27.anInt9185, local27.anInt9152, local1199);
										}
										if (local1189 != null) {
											local253 = local1189.EA();
											local487 = local1189.ma();
											local1247 = 255 - (local101 & 0xFF) << 24 | (local27.anInt9172 == 0 ? 16777215 : local27.anInt9172 & 0xFFFFFF);
											if (local27.aBoolean657) {
												Static103.aClass39_3.F(local93, local98, local93 + local27.anInt9163, local27.anInt9198 + local98);
												if (local27.anInt9187 != 0) {
													local521 = (local27.anInt9163 + local253 - 1) / local253;
													local523 = (local27.anInt9198 + local487 - 1) / local487;
													for (local532 = 0; local532 < local521; local532++) {
														for (local627 = 0; local627 < local523; local627++) {
															if (local27.anInt9172 == 0) {
																local1189.method7348((float) local253 / 2.0F + (float) (local93 + local532 * local253), (float) (local98 - -(local627 * local487)) + (float) local487 / 2.0F, 4096, local27.anInt9187);
															} else {
																local1189.method7343((float) (local93 + local532 * local253) + (float) local253 / 2.0F, (float) (local98 + local627 * local487) + (float) local487 / 2.0F, 4096, local27.anInt9187, local1247);
															}
														}
													}
												} else if (local27.anInt9172 == 0 && local101 == 0) {
													local1189.method7349(local93, local98, local27.anInt9163, local27.anInt9198);
												} else {
													local1189.i(local93, local98, local27.anInt9163, local27.anInt9198, 0, local1247, 1);
												}
												Static103.aClass39_3.N(arg8, arg0, arg1, arg6);
											} else if (local27.anInt9172 == 0 && local101 == 0) {
												if (local27.anInt9187 != 0) {
													local1189.method7348((float) local27.anInt9163 / 2.0F + (float) local93, (float) local98 + (float) local27.anInt9198 / 2.0F, local27.anInt9163 * 4096 / local253, local27.anInt9187);
												} else if (local27.anInt9163 == local253 && local487 == local27.anInt9198) {
													local1189.method7351(local93, local98);
												} else {
													local1189.method7347(local93, local98, local27.anInt9163, local27.anInt9198);
												}
											} else if (local27.anInt9187 != 0) {
												local1189.method7343((float) local27.anInt9163 / 2.0F + (float) local93, (float) local27.anInt9198 / 2.0F + (float) local98, local27.anInt9163 * 4096 / local253, local27.anInt9187, local1247);
											} else if (local253 == local27.anInt9163 && local27.anInt9198 == local487) {
												local1189.DA(local93, local98, 0, local1247, 1);
											} else {
												local1189.ra(local93, local98, local27.anInt9163, local27.anInt9198, 0, local1247, 1);
											}
										} else if (Static436.aBoolean587) {
											Static273.method4342(local27);
										}
									}
								} else if (local27.anInt9220 == 6) {
									Static472.method6912();
									@Pc(1570) Class63 local1570 = null;
									local253 = 0;
									@Pc(1611) Class4 local1611;
									@Pc(1621) Class146 local1621;
									if (local27.anInt9224 != -1) {
										@Pc(1783) Class300 local1783 = Static464.aClass115_1.method2970(local27.anInt9224);
										if (local1783 != null) {
											local1783 = local1783.method7484(local27.anInt9153);
											local1611 = local27.anInt9203 == -1 ? null : Static396.aClass157_2.method3745(local27.anInt9203);
											local1621 = local27.aBoolean660 ? Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1 : null;
											local1570 = local1783.method7480(local27.anInt9162, local1621, local27.anInt9196, local27.anInt9146, 2048, 1, local1611, Static103.aClass39_3);
											if (local1570 == null) {
												Static273.method4342(local27);
											} else {
												local253 = -local1570.TA() >> 1;
											}
										}
									} else if (local27.anInt9158 == 5) {
										local487 = local27.anInt9218;
										if (local487 >= 0 && local487 < 2048) {
											@Pc(1726) Class1_Sub1_Sub2_Sub1 local1726 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local487];
											@Pc(1738) Class4 local1738 = local27.anInt9203 == -1 ? null : Static396.aClass157_2.method3745(local27.anInt9203);
											if (local1726 != null && (Static174.anInt3154 == local487 || Static177.method2963(local1726.aString83) == local27.anInt9200)) {
												local1570 = local1726.aClass146_1.method3577(0, null, local27.anInt9146, local1738, -1, Static396.aClass157_2, Static84.aClass302_1, Static464.aClass115_1, 0, Static492.aClass218_1, Static289.aClass125_1, null, local27.anInt9196, Static103.aClass39_3, 2048, local27.anInt9162, Static21.aClass255_2);
											}
										}
									} else if (local27.anInt9158 == 8 || local27.anInt9158 == 9) {
										@Pc(1599) Class2_Sub16 local1599 = method3456(false, local27.anInt9218);
										local1611 = local27.anInt9203 == -1 ? null : Static396.aClass157_2.method3745(local27.anInt9203);
										if (local1599 != null) {
											local1621 = local27.aBoolean660 ? Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1 : null;
											local1570 = local1599.method1496(local27.anInt9162, local27.anInt9196, local1621, Static103.aClass39_3, local27.anInt9146, local27.anInt9200, local1611, local27.anInt9158 == 9);
										}
									} else if (local27.anInt9203 == -1) {
										local1570 = local27.method7645(Static21.aClass255_2, 0, Static84.aClass302_1, Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1, Static396.aClass157_2, null, 2048, Static289.aClass125_1, -1, -1, Static464.aClass115_1, Static492.aClass218_1, Static103.aClass39_3);
										if (local1570 == null && Static436.aBoolean587) {
											Static273.method4342(local27);
										}
									} else {
										@Pc(1683) Class4 local1683 = Static396.aClass157_2.method3745(local27.anInt9203);
										local1570 = local27.method7645(Static21.aClass255_2, local27.anInt9162, Static84.aClass302_1, Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1, Static396.aClass157_2, local1683, 2048, Static289.aClass125_1, local27.anInt9146, local27.anInt9196, Static464.aClass115_1, Static492.aClass218_1, Static103.aClass39_3);
										if (local1570 == null && Static436.aBoolean587) {
											Static273.method4342(local27);
										}
									}
									if (local1570 != null) {
										if (local27.anInt9195 > 0) {
											local487 = (local27.anInt9163 << 9) / local27.anInt9195;
										} else {
											local487 = 512;
										}
										if (local27.anInt9216 > 0) {
											local1247 = (local27.anInt9198 << 9) / local27.anInt9216;
										} else {
											local1247 = 512;
										}
										local521 = local27.anInt9163 / 2 + local93 + (local487 * local27.anInt9212 >> 9);
										local523 = (local27.anInt9225 * local1247 >> 9) + local98 + local27.anInt9198 / 2;
										Static338.aClass181_13.ha();
										Static103.aClass39_3.method6015(Static338.aClass181_13);
										Static103.aClass39_3.b(local521, local523, local487, local1247);
										Static103.aClass39_3.la((float) (local27.anInt9188 << 0), local27.aBoolean652 ? (float) (local27.anInt9189 << 0) : (float) (local27.anInt9189 << 0) * 1.5F);
										if (arg7 == -1412584499 || Static338.aBoolean472) {
											Static103.aClass39_3.n();
											Static103.aClass39_3.method6056();
											Static103.aClass39_3.N(arg8, arg0, arg1, arg6);
											Static338.aBoolean472 = false;
										}
										if (local27.aBoolean656) {
											Static103.aClass39_3.method6058(false);
										}
										local532 = Class125.anIntArray381[local27.anInt9154 << 3] * (local27.anInt9215 << 0) >> 15;
										local627 = (local27.anInt9215 << 0) * Class125.anIntArray382[local27.anInt9154 << 3] >> 15;
										Static267.aClass181_14.ta(-local27.anInt9190 << 3);
										Static267.aClass181_14.XA(local27.anInt9183 << 3);
										Static267.aClass181_14.TA(local27.anInt9173 << 0, local253 + (local27.anInt9160 << 0) + local532, local627 + (local27.anInt9160 << 0));
										Static267.aClass181_14.k(local27.anInt9154 << 3);
										if (Static101.aBoolean613) {
											Static103.aClass39_3.F(local93, local98, local27.anInt9163 + local93, local98 + local27.anInt9198);
										}
										if (local27.aBoolean652) {
											local1570.method7703(Static267.aClass181_14, null, local27.anInt9215 << 0);
										} else {
											local1570.method7700(Static267.aClass181_14, null, 1);
										}
										if (Static101.aBoolean613) {
											Static103.aClass39_3.N(arg8, arg0, arg1, arg6);
										}
										if (local27.aBoolean656) {
											Static103.aClass39_3.method6058(true);
										}
										Static103.aClass39_3.la(0.0F, 0.0F);
									}
								} else if (local27.anInt9220 == 9) {
									if (local27.aBoolean650) {
										local487 = local93 + local27.anInt9163;
										local253 = local27.anInt9198 + local98;
										local1247 = local98;
									} else {
										local1247 = local27.anInt9198 + local98;
										local487 = local27.anInt9163 + local93;
										local253 = local98;
									}
									if (local27.anInt9179 == 1) {
										Static103.aClass39_3.method6083(local93, local253, local487, local1247, local27.anInt9172, 0);
									} else {
										Static103.aClass39_3.method6068(local93, local253, local487, local1247, local27.anInt9172, local27.anInt9179);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZI)Lclient!cv;")
	public static Class2_Sub16 method3456(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class2_Sub16) Static127.aClass127_23.method3205(local17);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public static void method3457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg1, 7);
		local8.method6968();
		local8.anInt8318 = arg0;
	}
}
