import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!eu", name = "C", descriptor = "[I")
	public static int[] anIntArray128;

	@OriginalMember(owner = "client!eu", name = "D", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_41 = new Class173(13, 8);

	@OriginalMember(owner = "client!eu", name = "E", descriptor = "[I")
	public static final int[] anIntArray129 = new int[13];

	@OriginalMember(owner = "client!eu", name = "J", descriptor = "Z")
	public static volatile boolean aBoolean210 = true;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILclient!r;)Z")
	public static boolean method2595(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1) {
		@Pc(11) int local11 = (Static428.anInt8046 - 104) / 2;
		@Pc(17) int local17 = (Static119.anInt2717 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(42) int local42;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static560.method8056(local21, arg0, local29, local25)) {
						local42 = local29;
						if (Static310.method5267(local21, local25)) {
							local42 = local29 - 1;
						}
						if (local42 >= 0) {
							local19 &= Static69.method1172(local25, local21, local42);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(85) int[] local85 = new int[262144];
		for (local29 = 0; local29 < local85.length; local29++) {
			local85[local29] = -16777216;
		}
		Static273.aClass78_29 = arg1.method4969(local85, 512, 512, 512);
		Static137.method2714();
		local42 = ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 228 | 0xFF000000;
		@Pc(158) int local158 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(177) int local177 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(185) boolean[][] local185 = new boolean[Static551.anInt9778 + 1][Static551.anInt9778 + 1];
		@Pc(191) int local191;
		@Pc(195) int local195;
		@Pc(197) int local197;
		@Pc(199) int local199;
		@Pc(208) int local208;
		@Pc(215) int local215;
		@Pc(225) int local225;
		@Pc(249) int local249;
		@Pc(253) int local253;
		@Pc(310) int local310;
		@Pc(316) int local316;
		@Pc(320) int local320;
		@Pc(335) int local335;
		for (@Pc(187) int local187 = local11; local187 < local11 + 104; local187 += Static551.anInt9778) {
			for (local191 = local17; local191 < local17 + 104; local191 += Static551.anInt9778) {
				local195 = 0;
				local197 = 0;
				local199 = local187;
				if (local187 > 0) {
					local199 = local187 - 1;
					local195 += 4;
				}
				local208 = local191;
				if (local191 > 0) {
					local208 = local191 - 1;
				}
				local215 = local187 + Static551.anInt9778;
				if (local215 < 104) {
					local215++;
				}
				local225 = Static551.anInt9778 + local191;
				if (local225 < 104) {
					local225++;
					local197 += 4;
				}
				arg1.da(0, 0, Static551.anInt9778 * 4 + local195, Static551.anInt9778 * 4 + local197);
				arg1.ja(-16777216);
				@Pc(257) int local257;
				for (local249 = arg0; local249 <= 3; local249++) {
					for (local253 = 0; local253 <= Static551.anInt9778; local253++) {
						for (local257 = 0; local257 <= Static551.anInt9778; local257++) {
							local185[local253][local257] = Static560.method8056(local199 + local253, arg0, local249, local257 + local208);
						}
					}
					Static444.aClass83Array7[local249].method7207(local199, local208, local215, local225, local185);
					if (!Static201.aBoolean296) {
						for (local257 = -4; local257 < Static551.anInt9778; local257++) {
							for (local310 = -4; local310 < Static551.anInt9778; local310++) {
								local316 = local187 + local257;
								local320 = local191 + local310;
								if (local11 <= local316 && local17 <= local320 && Static560.method8056(local316, arg0, local249, local320)) {
									local335 = local249;
									if (Static310.method5267(local316, local320)) {
										local335 = local249 - 1;
									}
									if (local335 >= 0) {
										Static176.method3191(arg1, (Static551.anInt9778 - local310) * 4 + local197 - 4, local316, local42, local158, local320, local195 + local257 * 4, local335);
									}
								}
							}
						}
					}
				}
				if (Static201.aBoolean296) {
					@Pc(390) Class111 local390 = Static86.aClass111Array1[arg0];
					for (local257 = 0; local257 < Static551.anInt9778; local257++) {
						for (local310 = 0; local310 < Static551.anInt9778; local310++) {
							local316 = local187 + local257;
							local320 = local310 + local191;
							local335 = local390.anIntArrayArray20[local316 - local390.anInt3180][local320 - local390.anInt3177];
							if ((local335 & 0x40240000) != 0) {
								arg1.method5006(local195 + local257 * 4, 4, local197 + (Static551.anInt9778 - local310) * 4 - 4, -1713569622, 4);
							} else if ((local335 & 0x800000) != 0) {
								arg1.method4974(4, -1713569622, local197 + (Static551.anInt9778 - local310) * 4 - 4, local195 - -(local257 * 4));
							} else if ((local335 & 0x2000000) != 0) {
								arg1.method5021(local257 * 4 + local195 + 3, 4, -1713569622, local197 + (Static551.anInt9778 - local310) * 4 - 4);
							} else if ((local335 & 0x8000000) != 0) {
								arg1.method4974(4, -1713569622, (Static551.anInt9778 - local310) * 4 + local197 + 3 - 4, local195 + local257 * 4);
							} else if ((local335 & 0x20000000) != 0) {
								arg1.method5021(local257 * 4 + local195, 4, -1713569622, (Static551.anInt9778 - local310) * 4 + local197 - 4);
							}
						}
					}
				}
				arg1.J(local195, local197, Static551.anInt9778 * 4, Static551.anInt9778 * 4, local177, 2);
				Static273.aClass78_29.da((local187 - local11) * 4 + 48, -((-local17 + local191) * 4) + (464 - Static551.anInt9778 * 4), Static551.anInt9778 * 4, Static551.anInt9778 * 4, local195, local197);
			}
		}
		arg1.JA();
		arg1.ja(-16777215);
		Static523.method7617();
		Static365.anInt7076 = 0;
		Static582.aClass244_61.method5962();
		if (!Static201.aBoolean296) {
			for (local191 = local11; local191 < local11 + 104; local191++) {
				for (local195 = local17; local195 < local17 + 104; local195++) {
					for (local197 = arg0; arg0 + 1 >= local197 && local197 <= 3; local197++) {
						if (Static560.method8056(local191, arg0, local197, local195)) {
							@Pc(673) Interface19 local673 = (Interface19) Static460.method7015(local197, local191, local195);
							if (local673 == null) {
								local673 = (Interface19) Static397.method6277(local197, local191, local195, pn.class);
							}
							if (local673 == null) {
								local673 = (Interface19) Static353.method5714(local197, local191, local195);
							}
							if (local673 == null) {
								local673 = (Interface19) Static135.method2682(local197, local191, local195);
							}
							if (local673 != null) {
								@Pc(714) Class101 local714 = Static204.aClass139_8.method3309(local673.method7827());
								if (!local714.aBoolean221 || Static475.aBoolean431) {
									local215 = local714.anInt2949;
									if (local714.anIntArray140 != null) {
										for (local225 = 0; local225 < local714.anIntArray140.length; local225++) {
											if (local714.anIntArray140[local225] != -1) {
												@Pc(744) Class101 local744 = Static204.aClass139_8.method3309(local714.anIntArray140[local225]);
												if (local744.anInt2949 >= 0) {
													local215 = local744.anInt2949;
												}
											}
										}
									}
									if (local215 >= 0) {
										@Pc(766) boolean local766 = false;
										if (local215 >= 0) {
											@Pc(776) Class338 local776 = Static182.aClass142_3.method3366(local215);
											if (local776 != null && local776.aBoolean682) {
												local766 = true;
											}
										}
										local249 = local191;
										local253 = local195;
										if (local766) {
											@Pc(794) int[][] local794 = Static86.aClass111Array1[local197].anIntArrayArray20;
											local310 = Static86.aClass111Array1[local197].anInt3180;
											local316 = Static86.aClass111Array1[local197].anInt3177;
											for (local320 = 0; local320 < 10; local320++) {
												local335 = (int) (Math.random() * 4.0D);
												if (local335 == 0 && local11 < local249 && local249 > local191 - 3 && (local794[local249 - local310 - 1][local253 - local316] & 0x2C0108) == 0) {
													local249--;
												}
												if (local335 == 1 && local249 < local11 + 104 - 1 && local191 + 3 > local249 && (local794[local249 + 1 - local310][local253 - local316] & 0x2C0180) == 0) {
													local249++;
												}
												if (local335 == 2 && local253 > local17 && local253 > local195 - 3 && (local794[local249 - local310][local253 - local316 - 1] & 0x2C0102) == 0) {
													local253--;
												}
												if (local335 == 3 && local17 + 104 - 1 > local253 && local195 + 3 > local253 && (local794[local249 - local310][local253 + 1 - local316] & 0x2C0120) == 0) {
													local253++;
												}
											}
										}
										Static192.anIntArray181[Static365.anInt7076] = local714.anInt2942;
										Static82.anIntArray79[Static365.anInt7076] = local249;
										Static314.anIntArray302[Static365.anInt7076] = local253;
										Static365.anInt7076++;
									}
								}
							}
						}
					}
				}
			}
			if (Static71.aClass59_1 != null) {
				Static93.aClass176_31.anInt4548 = 1;
				Static182.aClass142_3.method3365(1024, 64);
				for (local195 = 0; local195 < Static71.aClass59_1.anInt1365; local195++) {
					local197 = Static71.aClass59_1.anIntArray80[local195];
					if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 == local197 >> 28) {
						local199 = (local197 >> 14 & 0x3FFF) - Static552.anInt9805;
						local208 = (local197 & 0x3FFF) - Static254.anInt4667;
						if (local199 >= 0 && Static428.anInt8046 > local199 && local208 >= 0 && Static119.anInt2717 > local208) {
							Static582.aClass244_61.method5960(new Class4_Sub38(local195));
						} else {
							@Pc(1083) Class338 local1083 = Static182.aClass142_3.method3366(Static71.aClass59_1.anIntArray81[local195]);
							if (local1083.anIntArray522 != null && local1083.anInt9753 + local199 >= 0 && local199 + local1083.anInt9768 < Static428.anInt8046 && local1083.anInt9763 + local208 >= 0 && local208 + local1083.anInt9746 < Static119.anInt2717) {
								Static582.aClass244_61.method5960(new Class4_Sub38(local195));
							}
						}
					}
				}
				Static182.aClass142_3.method3365(128, 64);
				Static93.aClass176_31.anInt4548 = 2;
				Static93.aClass176_31.method3979();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!ec;)I")
	public static int method2596(@OriginalArg(1) Class1_Sub4_Sub2_Sub1 arg0) {
		if (arg0.anInt8394 == 0) {
			return 0;
		}
		@Pc(66) int local66;
		@Pc(59) int local59;
		if (arg0.anInt8405 != -1) {
			@Pc(17) Class1_Sub4_Sub2_Sub1 local17 = null;
			if (arg0.anInt8405 < 32768) {
				@Pc(45) Class4_Sub4 local45 = (Class4_Sub4) Static585.aClass350_41.method8207((long) arg0.anInt8405);
				if (local45 != null) {
					local17 = local45.aClass1_Sub4_Sub2_Sub1_Sub1_1;
				}
			} else if (arg0.anInt8405 >= 32768) {
				local17 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[arg0.anInt8405 - 32768];
			}
			if (local17 != null) {
				local59 = arg0.anInt9934 - local17.anInt9934;
				local66 = arg0.anInt9935 - local17.anInt9935;
				if (local59 != 0 || local66 != 0) {
					arg0.method6936((int) (Math.atan2((double) local59, (double) local66) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class1_Sub4_Sub2_Sub1_Sub2) {
			@Pc(89) Class1_Sub4_Sub2_Sub1_Sub2 local89 = (Class1_Sub4_Sub2_Sub1_Sub2) arg0;
			if (local89.anInt8461 != -1 && (local89.anInt8447 == 0 || local89.anInt8448 > 0)) {
				local89.method6936(local89.anInt8461);
				local89.anInt8461 = -1;
			}
		} else if (arg0 instanceof Class1_Sub4_Sub2_Sub1_Sub1) {
			@Pc(118) Class1_Sub4_Sub2_Sub1_Sub1 local118 = (Class1_Sub4_Sub2_Sub1_Sub1) arg0;
			if (local118.anInt5244 != -1 && (local118.anInt8447 == 0 || local118.anInt8448 > 0)) {
				local59 = local118.anInt9934 - (local118.anInt5244 - Static552.anInt9805 - Static552.anInt9805) * 256;
				local66 = local118.anInt9935 - (local118.anInt5258 - Static254.anInt4667 - Static254.anInt4667) * 256;
				if (local59 != 0 || local66 != 0) {
					local118.method6936((int) (Math.atan2((double) local59, (double) local66) * 2607.5945876176133D) & 0x3FFF);
				}
				local118.anInt5244 = -1;
			}
		}
		return arg0.method6933();
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIILclient!r;Lclient!n;)V")
	public static void method2597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class44 arg2, @OriginalArg(4) Class225 arg3) {
		@Pc(10) Class6 local10 = arg3.method5508(arg2);
		if (local10 == null) {
			return;
		}
		arg2.da(arg1, arg0, arg1 + arg3.anInt6529, arg3.anInt6521 + arg0);
		if (Static574.anInt10047 == 2 || Static574.anInt10047 == 5 || Static273.aClass78_29 == null) {
			arg2.FA(-16777216, local10, arg1, arg0);
			return;
		}
		@Pc(49) int local49;
		@Pc(67) int local67;
		@Pc(64) int local64;
		@Pc(56) int local56;
		if (Static166.anInt3419 == 4) {
			local67 = Static339.anInt6576;
			local56 = 4096;
			local49 = Static413.anInt8208;
			local64 = (int) -Static201.aFloat128 & 0x3FFF;
		} else {
			local49 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934;
			local56 = 4096 - Static595.anInt10298 * 16;
			local64 = (int) -Static201.aFloat128 + Static368.anInt7167 & 0x3FFF;
			local67 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935;
		}
		@Pc(94) int local94 = local49 / 128 + 208 + 48 - Static428.anInt8046 * 2;
		@Pc(111) int local111 = Static119.anInt2717 * 4 + 48 + 208 - local67 / 128 - Static119.anInt2717 * 2;
		Static273.aClass78_29.method8192((float) arg3.anInt6529 / 2.0F + (float) arg1, (float) arg3.anInt6521 / 2.0F + (float) arg0, (float) local94, (float) local111, local56, local64 << 2, local10, arg1, arg0);
		@Pc(162) int local162;
		@Pc(172) int local172;
		@Pc(183) int local183;
		@Pc(194) int local194;
		for (@Pc(145) Class4_Sub38 local145 = (Class4_Sub38) Static582.aClass244_61.method5963(); local145 != null; local145 = (Class4_Sub38) Static582.aClass244_61.method5965()) {
			@Pc(150) int local150 = local145.anInt8496;
			local162 = (Static71.aClass59_1.anIntArray80[local150] >> 14 & 0x3FFF) - Static552.anInt9805;
			local172 = (Static71.aClass59_1.anIntArray80[local150] & 0x3FFF) - Static254.anInt4667;
			local183 = local162 * 4 + 2 - local49 / 128;
			local194 = local172 * 4 + 2 - local67 / 128;
			Static311.method5269(local194, arg0, Static71.aClass59_1.anIntArray81[local150], local10, local183, arg2, arg1, arg3);
		}
		for (local162 = 0; local162 < Static365.anInt7076; local162++) {
			local172 = Static82.anIntArray79[local162] * 4 + 2 - local49 / 128;
			local183 = Static314.anIntArray302[local162] * 4 + 2 - local67 / 128;
			@Pc(255) Class101 local255 = Static204.aClass139_8.method3309(Static192.anIntArray181[local162]);
			if (local255.anIntArray140 != null) {
				local255 = local255.method2710(Static45.aClass148_1);
				if (local255 == null || local255.anInt2949 == -1) {
					continue;
				}
			}
			Static311.method5269(local183, arg0, local255.anInt2949, local10, local172, arg2, arg1, arg3);
		}
		@Pc(336) int local336;
		@Pc(346) int local346;
		for (@Pc(292) Class4_Sub13 local292 = (Class4_Sub13) Static251.aClass350_19.method8198(); local292 != null; local292 = (Class4_Sub13) Static251.aClass350_19.method8205()) {
			local183 = (int) (local292.aLong268 >> 28 & 0x3L);
			if (local183 == Static384.anInt7375) {
				local194 = (int) (local292.aLong268 & 0x3FFFL) - Static552.anInt9805;
				@Pc(325) int local325 = (int) (local292.aLong268 >> 14 & 0x3FFFL) - Static254.anInt4667;
				local336 = local194 * 4 + 2 - local49 / 128;
				local346 = local325 * 4 + 2 - local67 / 128;
				Static192.method3340(Static102.aClass78Array14[0], arg1, arg3, local346, local336, local10, arg0);
			}
		}
		@Pc(434) int local434;
		for (local183 = 0; local183 < Static418.anInt7866; local183++) {
			@Pc(379) Class4_Sub4 local379 = (Class4_Sub4) Static585.aClass350_41.method8207((long) Static43.anIntArray23[local183]);
			if (local379 != null) {
				@Pc(384) Class1_Sub4_Sub2_Sub1_Sub1 local384 = local379.aClass1_Sub4_Sub2_Sub1_Sub1_1;
				if (local384.method4517() && Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 == local384.aByte126) {
					@Pc(396) Class283 local396 = local384.aClass283_1;
					if (local396 != null && local396.anIntArray453 != null) {
						local396 = local396.method6834(Static45.aClass148_1);
					}
					if (local396 != null && local396.aBoolean578 && local396.aBoolean575) {
						local346 = local384.anInt9934 / 128 - local49 / 128;
						local434 = local384.anInt9935 / 128 - local67 / 128;
						if (local396.anInt8264 == -1) {
							Static192.method3340(Static102.aClass78Array14[1], arg1, arg3, local434, local346, local10, arg0);
						} else {
							Static311.method5269(local434, arg0, local396.anInt8264, local10, local346, arg2, arg1, arg3);
						}
					}
				}
			}
		}
		local194 = Static413.anInt8212;
		@Pc(470) int[] local470 = Static229.anIntArray201;
		@Pc(521) int local521;
		@Pc(525) int local525;
		@Pc(550) int local550;
		for (local336 = 0; local336 < local194; local336++) {
			@Pc(480) Class1_Sub4_Sub2_Sub1_Sub2 local480 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local470[local336]];
			if (local480 != null && local480.method6942() && !local480.aBoolean596 && local480 != Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 && local480.aByte126 == Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126) {
				local434 = local480.anInt9934 / 128 - local49 / 128;
				local521 = local480.anInt9935 / 128 - local67 / 128;
				@Pc(523) boolean local523 = false;
				for (local525 = 0; local525 < Static493.anInt8959; local525++) {
					if (local480.aString78.equals(Static220.aStringArray22[local525]) && Static471.anIntArray476[local525] != 0) {
						local523 = true;
						break;
					}
				}
				@Pc(548) boolean local548 = false;
				for (local550 = 0; local550 < Static247.anInt4517; local550++) {
					if (local480.aString78.equals(Static126.aClass181Array1[local550].aString50)) {
						local548 = true;
						break;
					}
				}
				@Pc(570) boolean local570 = false;
				if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8458 != 0 && local480.anInt8458 != 0 && local480.anInt8458 == Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8458) {
					local570 = true;
				}
				if (local480.aBoolean594) {
					Static192.method3340(Static102.aClass78Array14[6], arg1, arg3, local521, local434, local10, arg0);
				} else if (local523) {
					Static192.method3340(Static102.aClass78Array14[3], arg1, arg3, local521, local434, local10, arg0);
				} else if (local548) {
					Static192.method3340(Static102.aClass78Array14[5], arg1, arg3, local521, local434, local10, arg0);
				} else if (local570) {
					Static192.method3340(Static102.aClass78Array14[4], arg1, arg3, local521, local434, local10, arg0);
				} else {
					Static192.method3340(Static102.aClass78Array14[2], arg1, arg3, local521, local434, local10, arg0);
				}
			}
		}
		@Pc(671) Class366[] local671 = Static532.aClass366Array1;
		@Pc(756) int local756;
		for (local434 = 0; local434 < local671.length; local434++) {
			@Pc(679) Class366 local679 = local671[local434];
			if (local679 != null && local679.anInt10235 != 0 && Static106.anInt2418 % 20 < 10) {
				@Pc(721) int local721;
				if (local679.anInt10235 == 1) {
					@Pc(706) Class4_Sub4 local706 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local679.anInt10240);
					if (local706 != null) {
						@Pc(711) Class1_Sub4_Sub2_Sub1_Sub1 local711 = local706.aClass1_Sub4_Sub2_Sub1_Sub1_1;
						local721 = local711.anInt9934 / 128 - local49 / 128;
						local550 = local711.anInt9935 / 128 - local67 / 128;
						Static121.method2546(360000L, local10, local550, arg1, arg0, arg3, local721, local679.anInt10237);
					}
				}
				if (local679.anInt10235 == 2) {
					local756 = local679.anInt10231 / 128 - local49 / 128;
					local525 = local679.anInt10233 / 128 - local67 / 128;
					@Pc(772) long local772 = (long) (local679.anInt10236 << 7);
					@Pc(776) long local776 = local772 * local772;
					Static121.method2546(local776, local10, local525, arg1, arg0, arg3, local756, local679.anInt10237);
				}
				if (local679.anInt10235 == 10 && local679.anInt10240 >= 0 && Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1.length > local679.anInt10240) {
					@Pc(806) Class1_Sub4_Sub2_Sub1_Sub2 local806 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local679.anInt10240];
					if (local806 != null) {
						local525 = local806.anInt9934 / 128 - local49 / 128;
						local721 = local806.anInt9935 / 128 - local67 / 128;
						Static121.method2546(360000L, local10, local721, arg1, arg0, arg3, local525, local679.anInt10237);
					}
				}
			}
		}
		if (Static166.anInt3419 == 4) {
			return;
		}
		if (Static582.anInt10107 != 0) {
			local521 = Static582.anInt10107 * 4 + (-1 + Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.method6925()) * 2 + 2 - local49 / 128;
			local756 = Static8.anInt182 * 4 + Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.method6925() * 2 + 2 - local67 / 128 - 2;
			Static192.method3340(Static31.aClass78Array1[Static569.aBoolean704 ? 1 : 0], arg1, arg3, local756, local521, local10, arg0);
		}
		if (!Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aBoolean596) {
			arg2.method5006(arg1 + arg3.anInt6529 / 2 - 1, 3, arg3.anInt6521 / 2 + arg0 - 1, -1, 3);
		}
	}
}
