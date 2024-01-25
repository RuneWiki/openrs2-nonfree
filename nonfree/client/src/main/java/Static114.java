import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!dt", name = "D", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_39 = new Class322(132, 0);

	@OriginalMember(owner = "client!dt", name = "J", descriptor = "Z")
	public static boolean aBoolean194 = false;

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "Z")
	public static boolean aBoolean195 = true;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I[ILclient!qo;[I[I)V")
	public static void method2145(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class60_Sub1_Sub1_Sub3 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(15) int local15 = arg0[local7];
			@Pc(19) int local19 = arg3[local7];
			@Pc(23) int local23 = arg2[local7];
			@Pc(25) int local25 = 0;
			while (local19 != 0 && local25 < arg1.aClass104_Sub2_Sub1Array3.length) {
				if ((local19 & 0x1) != 0) {
					if (local15 == -1) {
						arg1.aClass104_Sub2_Sub1Array3[local25] = null;
					} else {
						@Pc(56) Class212 local56 = Static444.aClass68_3.method1286(local15);
						@Pc(59) int local59 = local56.anInt5520;
						@Pc(64) Class104_Sub2_Sub1 local64 = arg1.aClass104_Sub2_Sub1Array3[local25];
						if (local64 != null && local64.method9030()) {
							if (local64.method9032() == local15) {
								if (local59 == 0) {
									local64 = arg1.aClass104_Sub2_Sub1Array3[local25] = null;
								} else if (local59 == 1) {
									local64.method9022();
									local64.anInt10533 = local23;
								} else if (local59 == 2) {
									local64.method9034();
								}
							} else if (local56.anInt5523 >= local64.method9041().anInt5523) {
								local64 = arg1.aClass104_Sub2_Sub1Array3[local25] = null;
							}
						}
						if (local64 == null || !local64.method9030()) {
							local64 = arg1.aClass104_Sub2_Sub1Array3[local25] = new Class104_Sub2_Sub1(arg1);
							local64.method9035(local15);
							local64.anInt10533 = local23;
						}
					}
				}
				local25++;
				local19 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZIIIIIIIII)V")
	public static void method2146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg7 && arg0 == arg8 && arg4 == arg1 && arg5 == arg6) {
			Static659.method8789(arg5, arg2, arg8, arg1, arg3);
			return;
		}
		@Pc(37) int local37 = arg2;
		@Pc(39) int local39 = arg8;
		@Pc(43) int local43 = arg2 * 3;
		@Pc(47) int local47 = arg8 * 3;
		@Pc(51) int local51 = arg7 * 3;
		@Pc(55) int local55 = arg0 * 3;
		@Pc(59) int local59 = arg4 * 3;
		@Pc(63) int local63 = arg6 * 3;
		@Pc(73) int local73 = local51 + arg1 - local59 - arg2;
		@Pc(84) int local84 = arg5 + local55 - arg8 - local63;
		@Pc(94) int local94 = local59 + local43 - local51 - local51;
		@Pc(104) int local104 = local47 + local63 - local55 - local55;
		@Pc(108) int local108 = local51 - local43;
		@Pc(113) int local113 = local55 - local47;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(123) int local123 = local115 * local115 >> 12;
			@Pc(129) int local129 = local115 * local123 >> 12;
			@Pc(133) int local133 = local129 * local73;
			@Pc(137) int local137 = local129 * local84;
			@Pc(141) int local141 = local94 * local123;
			@Pc(145) int local145 = local123 * local104;
			@Pc(149) int local149 = local115 * local108;
			@Pc(153) int local153 = local113 * local115;
			@Pc(163) int local163 = (local149 + local141 + local133 >> 12) + arg2;
			@Pc(173) int local173 = (local145 + local137 + local153 >> 12) + arg8;
			Static659.method8789(local173, local37, local39, local163, arg3);
			local37 = local163;
			local39 = local173;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)I")
	public static int method2147(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(52) char local52;
			if (local17 == '\u0000') {
				local52 = arg1.charAt(local13++);
			} else {
				local52 = local17;
			}
			@Pc(68) char local68;
			if (local19 == '\u0000') {
				local68 = arg2.charAt(local15++);
			} else {
				local68 = local19;
			}
			local17 = Static177.method3391(local52);
			local19 = Static177.method3391(local68);
			local52 = Static48.method6013(local52, arg0);
			local68 = Static48.method6013(local68, arg0);
			if (local52 != local68 && Character.toUpperCase(local52) != Character.toUpperCase(local68)) {
				local52 = Character.toLowerCase(local52);
				local68 = Character.toLowerCase(local68);
				if (local52 != local68) {
					return Static275.method4634(local52, arg0) - Static275.method4634(local68, arg0);
				}
			}
		}
		@Pc(126) int local126 = Math.min(local8, local11);
		for (@Pc(138) int local138 = 0; local138 < local126; local138++) {
			if (arg0 == 2) {
				local13 = local8 - local138 - 1;
				local15 = local11 - local138 - 1;
			} else {
				local15 = local138;
				local13 = local138;
			}
			@Pc(170) char local170 = arg1.charAt(local13);
			@Pc(174) char local174 = arg2.charAt(local15);
			if (local174 != local170 && Character.toUpperCase(local170) != Character.toUpperCase(local174)) {
				local170 = Character.toLowerCase(local170);
				local174 = Character.toLowerCase(local174);
				if (local170 != local174) {
					return Static275.method4634(local170, arg0) - Static275.method4634(local174, arg0);
				}
			}
		}
		@Pc(221) int local221 = local8 - local11;
		if (local221 != 0) {
			return local221;
		}
		for (@Pc(233) int local233 = 0; local233 < local126; local233++) {
			@Pc(241) char local241 = arg1.charAt(local233);
			@Pc(245) char local245 = arg2.charAt(local233);
			if (local241 != local245) {
				return Static275.method4634(local241, arg0) - Static275.method4634(local245, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBI)Z")
	public static boolean method2148(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static465.method7031(arg0, arg1) | Static4.method25(arg1, arg0) | Static447.method6916(arg1, arg0)) & Static435.method6609(arg1, arg0);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIILclient!ha;)V")
	public static void method2151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static481.anInt8152 == 0 || Static54.anInt675 == 0) {
			return;
		}
		@Pc(55) Class109 local55;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(70) int local70;
		@Pc(65) int local65;
		if (Static93.aBoolean113) {
			Static124.method2320(false);
			local55 = arg2.method6636();
			@Pc(83) int[] local83 = arg2.Y();
			local46 = local83[3];
			local42 = local83[2];
			local44 = local83[1];
			local40 = local83[0];
			local70 = Static46.method560(false) + arg1;
			local65 = Static127.method2488(false) + arg0;
		} else {
			arg2.DA(Static274.anInt3228, Static398.anInt6884, Static481.anInt8152, Static54.anInt675);
			local40 = Static274.anInt3228;
			local42 = Static481.anInt8152;
			local44 = Static398.anInt6884;
			local46 = Static54.anInt675;
			arg2.KA(Static388.anInt6713, Static154.anInt3258, Static481.anInt8152, Static54.anInt675);
			local55 = arg2.method6709();
			local55.method4601(Static309.anInt5363, Static557.anInt9009, Static314.anInt5451, Static562.anInt9084, Static254.anInt4897, Static675.anInt5500);
			local65 = arg0;
			arg2.method6695(local55);
			local70 = arg1;
		}
		if (local42 == 0) {
			local42 = 1;
		}
		Static220.method4009(true);
		if (local46 == 0) {
			local46 = 1;
		}
		@Pc(147) int local147;
		@Pc(166) int local166;
		@Pc(184) int local184;
		@Pc(283) int local283;
		@Pc(292) int local292;
		@Pc(303) int local303;
		@Pc(314) int local314;
		@Pc(139) int local139;
		@Pc(365) int local365;
		if (Static524.aClass96Array2 != null && (!Static162.aBoolean266 || (Static109.anInt2151 & 0x40) != 0)) {
			local139 = -1;
			@Pc(141) int local141 = -1;
			@Pc(144) int local144 = arg2.i();
			local147 = arg2.XA();
			@Pc(158) int local158;
			@Pc(175) int local175;
			if (Static490.aBoolean634) {
				local158 = local184 = Static377.anInt6468 * (local65 - local44) / local46;
				local166 = local175 = Static377.anInt6468 * (local70 - local40) / local42;
			} else {
				local158 = (local65 - local44) * local144 / local46;
				local166 = (local70 - local40) * local144 / local42;
				local175 = (local70 - local40) * local147 / local42;
				local184 = local147 * (local65 - local44) / local46;
			}
			@Pc(222) int[] local222 = new int[] { local166, local158, local144 };
			@Pc(237) int[] local237 = new int[] { local175, local184, local147 };
			local55.method4603(local222);
			local55.method4603(local237);
			@Pc(271) float local271 = Static163.method3218((float) local237[0], 4, (float) local222[1], (float) local222[0], (float) local237[1], (float) local237[2], (float) local222[2]);
			if (local271 > 0.0F) {
				local283 = local237[0] - local222[0];
				local292 = local237[2] - local222[2];
				local303 = (int) ((float) local222[0] + (float) local283 * local271);
				local314 = (int) ((float) local222[2] + (float) local292 * local271);
				local139 = local303 + (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.method4424((byte) -28) - 1 << 8) >> 9;
				local141 = (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.method4424((byte) -28) - 1 << 8) + local314 >> 9;
				@Pc(342) byte local342 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135;
				if (local342 < 3 && (Static272.aByteArrayArrayArray2[1][local303 >> 9][local314 >> 9] & 0x2) != 0) {
					local365 = local342 + 1;
				}
			}
			if (local139 != -1 && local141 != -1) {
				if (Static162.aBoolean266 && (Static109.anInt2151 & 0x40) != 0) {
					@Pc(444) Class381 local444 = Static347.method5333(Static607.anInt9574, Static227.anInt4416);
					if (local444 == null) {
						Static565.method7967();
					} else {
						Static541.method8078(Static607.anInt9573, " ->", local139, (long) (local139 << 0 | local141), true, Static185.aString41, -1, true, local141, false, 44, 0L);
					}
				} else {
					if (Static438.aBoolean554) {
						Static541.method8078(-1, "", local139, (long) (local139 << 0 | local141), true, Static50.aClass43_26.method596(Static601.anInt9518), -1, true, local141, false, 49, 0L);
					}
					Static541.method8078(Static631.anInt9892, "", local139, (long) (local139 << 0 | local141), true, Static324.aString64, -1, true, local141, false, 17, 0L);
				}
			}
		}
		if (Static93.aBoolean113) {
			Static43.method538();
		}
		for (local139 = 0; local139 < (Static93.aBoolean113 ? 2 : 1); local139++) {
			@Pc(496) boolean local496 = local139 == 0;
			@Pc(503) Class284 local503 = local496 ? Static667.aClass284_3 : Static23.aClass284_1;
			local147 = arg1;
			local166 = arg0;
			if (Static93.aBoolean113) {
				Static124.method2320(local496);
				local147 = arg1 + Static46.method560(local496);
				local166 = arg0 + Static127.method2488(local496);
			}
			@Pc(527) Class385 local527 = local503.aClass385_7;
			for (@Pc(532) Class60_Sub9 local532 = (Class60_Sub9) local527.method8778(); local532 != null; local532 = (Class60_Sub9) local527.method8773()) {
				if ((Static110.aBoolean186 || Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 == local532.aClass60_Sub1_21.aByte135) && local532.method7678(arg2, local147, local166)) {
					@Pc(575) int local575;
					if (local532.aClass60_Sub1_21 instanceof Class60_Sub1_Sub1) {
						local575 = ((Class60_Sub1_Sub1) local532.aClass60_Sub1_21).aShort102;
						local184 = ((Class60_Sub1_Sub1) local532.aClass60_Sub1_21).aShort100;
					} else {
						local184 = local532.aClass60_Sub1_21.anInt9048 >> 9;
						local575 = local532.aClass60_Sub1_21.anInt9057 >> 9;
					}
					@Pc(715) int local715;
					@Pc(727) int local727;
					@Pc(841) int local841;
					@Pc(599) int local599;
					if (local532.aClass60_Sub1_21 instanceof Class60_Sub1_Sub1_Sub3_Sub1) {
						@Pc(595) Class60_Sub1_Sub1_Sub3_Sub1 local595 = (Class60_Sub1_Sub1_Sub3_Sub1) local532.aClass60_Sub1_21;
						local599 = local595.method4424((byte) -28);
						if ((local599 & 0x1) == 0 && (local595.anInt9048 & 0x1FF) == 0 && (local595.anInt9057 & 0x1FF) == 0 || (local599 & 0x1) == 1 && (local595.anInt9048 & 0x1FF) == 256 && (local595.anInt9057 & 0x1FF) == 256) {
							local283 = local595.anInt9048 - (local595.method4424((byte) -28) - 1 << 8);
							local292 = local595.anInt9057 - (local595.method4424((byte) -28) - 1 << 8);
							for (local303 = 0; local303 < Static201.anInt4069; local303++) {
								@Pc(685) Class6_Sub11 local685 = (Class6_Sub11) Static419.aClass74_45.method1401((long) Static531.anIntArray580[local303]);
								if (local685 != null) {
									@Pc(690) Class60_Sub1_Sub1_Sub3_Sub2 local690 = local685.aClass60_Sub1_Sub1_Sub3_Sub2_1;
									if (Static141.anInt8737 != local690.anInt4859 && local690.aBoolean370) {
										local715 = local690.anInt9048 - (local690.aClass294_1.anInt8169 - 1 << 8);
										local727 = local690.anInt9057 - (local690.aClass294_1.anInt8169 - 1 << 8);
										if (local715 >= local283 && local690.aClass294_1.anInt8169 <= local595.method4424((byte) -28) - (local715 - local283 >> 9) && local727 >= local292 && local690.aClass294_1.anInt8169 <= local595.method4424((byte) -28) - (local727 - local292 >> 9)) {
											Static4.method27(local532.aClass60_Sub1_21.aByte135 != Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135, local690);
											local690.anInt4859 = Static141.anInt8737;
										}
									}
								}
							}
							local314 = Static661.anInt10532;
							@Pc(798) int[] local798 = Static591.anIntArray611;
							for (local715 = 0; local715 < local314; local715++) {
								@Pc(808) Class60_Sub1_Sub1_Sub3_Sub1 local808 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local798[local715]];
								if (local808 != null && Static141.anInt8737 != local808.anInt4859 && local595 != local808 && local808.aBoolean370) {
									local841 = local808.anInt9048 - (local808.method4424((byte) -28) - 1 << 8);
									@Pc(852) int local852 = local808.anInt9057 - (local808.method4424((byte) -28) - 1 << 8);
									if (local841 >= local283 && local808.method4424((byte) -28) <= local595.method4424((byte) -28) - (local841 - local283 >> 9) && local852 >= local292 && local808.method4424((byte) -28) <= local595.method4424((byte) -28) - (local852 - local292 >> 9)) {
										Static288.method4729(local808, local532.aClass60_Sub1_21.aByte135 != Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135);
										local808.anInt4859 = Static141.anInt8737;
									}
								}
							}
						}
						if (local595.anInt4859 == Static141.anInt8737) {
							continue;
						}
						Static288.method4729(local595, local532.aClass60_Sub1_21.aByte135 != Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135);
						local595.anInt4859 = Static141.anInt8737;
					}
					if (local532.aClass60_Sub1_21 instanceof Class60_Sub1_Sub1_Sub3_Sub2) {
						@Pc(959) Class60_Sub1_Sub1_Sub3_Sub2 local959 = (Class60_Sub1_Sub1_Sub3_Sub2) local532.aClass60_Sub1_21;
						if (local959.aClass294_1 != null) {
							if ((local959.aClass294_1.anInt8169 & 0x1) == 0 && (local959.anInt9048 & 0x1FF) == 0 && (local959.anInt9057 & 0x1FF) == 0 || (local959.aClass294_1.anInt8169 & 0x1) == 1 && (local959.anInt9048 & 0x1FF) == 256 && (local959.anInt9057 & 0x1FF) == 256) {
								local599 = local959.anInt9048 - (local959.aClass294_1.anInt8169 - 1 << 8);
								local283 = local959.anInt9057 - (local959.aClass294_1.anInt8169 - 1 << 8);
								for (local292 = 0; local292 < Static201.anInt4069; local292++) {
									@Pc(1056) Class6_Sub11 local1056 = (Class6_Sub11) Static419.aClass74_45.method1401((long) Static531.anIntArray580[local292]);
									if (local1056 != null) {
										@Pc(1061) Class60_Sub1_Sub1_Sub3_Sub2 local1061 = local1056.aClass60_Sub1_Sub1_Sub3_Sub2_1;
										if (Static141.anInt8737 != local1061.anInt4859 && local959 != local1061 && local1061.aBoolean370) {
											local365 = local1061.anInt9048 - (local1061.aClass294_1.anInt8169 - 1 << 8);
											local715 = local1061.anInt9057 - (local1061.aClass294_1.anInt8169 - 1 << 8);
											if (local365 >= local599 && local1061.aClass294_1.anInt8169 <= local959.aClass294_1.anInt8169 - (local365 - local599 >> 9) && local283 <= local715 && local1061.aClass294_1.anInt8169 <= local959.aClass294_1.anInt8169 - (local715 - local283 >> 9)) {
												Static4.method27(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 != local532.aClass60_Sub1_21.aByte135, local1061);
												local1061.anInt4859 = Static141.anInt8737;
											}
										}
									}
								}
								local303 = Static661.anInt10532;
								@Pc(1172) int[] local1172 = Static591.anIntArray611;
								for (local365 = 0; local365 < local303; local365++) {
									@Pc(1182) Class60_Sub1_Sub1_Sub3_Sub1 local1182 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local1172[local365]];
									if (local1182 != null && Static141.anInt8737 != local1182.anInt4859 && local1182.aBoolean370) {
										local727 = local1182.anInt9048 - (local1182.method4424((byte) -28) - 1 << 8);
										local841 = local1182.anInt9057 - (local1182.method4424((byte) -28) - 1 << 8);
										if (local727 >= local599 && local1182.method4424((byte) -28) <= local959.aClass294_1.anInt8169 - (local727 - local599 >> 9) && local283 <= local841 && local1182.method4424((byte) -28) <= local959.aClass294_1.anInt8169 - (local841 - local283 >> 9)) {
											Static288.method4729(local1182, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 != local532.aClass60_Sub1_21.aByte135);
											local1182.anInt4859 = Static141.anInt8737;
										}
									}
								}
							}
							if (Static141.anInt8737 == local959.anInt4859) {
								continue;
							}
							Static4.method27(local532.aClass60_Sub1_21.aByte135 != Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135, local959);
							local959.anInt4859 = Static141.anInt8737;
						}
					}
					if (local532.aClass60_Sub1_21 instanceof Class60_Sub1_Sub4_Sub1) {
						@Pc(1342) int local1342 = local184 + Static50.anInt606;
						local599 = Static404.anInt7039 + local575;
						@Pc(1363) Class6_Sub36 local1363 = (Class6_Sub36) Static650.aClass74_72.method1401((long) (local532.aClass60_Sub1_21.aByte135 << 28 | local599 << 14 | local1342));
						if (local1363 != null) {
							local292 = 0;
							for (@Pc(1373) Class6_Sub23 local1373 = (Class6_Sub23) local1363.aClass340_42.method8133(); local1373 != null; local1373 = (Class6_Sub23) local1363.aClass340_42.method8125()) {
								@Pc(1383) Class282 local1383 = Static149.aClass244_1.method5958(local1373.anInt4411);
								if (Static162.aBoolean266 && local532.aClass60_Sub1_21.aByte135 == Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135) {
									@Pc(1407) Class302 local1407 = Static417.anInt7211 == -1 ? null : Static521.aClass20_21.method250(Static417.anInt7211);
									if ((Static109.anInt2151 & 0x1) != 0 && (local1407 == null || local1383.method6975(Static417.anInt7211, local1407.anInt8386) != local1407.anInt8386)) {
										Static541.method8078(Static607.anInt9573, Static6.aString5 + " -> <col=ff9040>" + local1383.aString87, local184, (long) local292, true, Static185.aString41, -1, false, local575, false, 47, (long) local1373.anInt4411);
									}
								}
								if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 == local532.aClass60_Sub1_21.aByte135) {
									@Pc(1476) String[] local1476 = local1383.aStringArray33;
									for (local715 = local1476.length - 1; local715 >= 0; local715--) {
										if (local1476[local715] != null) {
											@Pc(1491) short local1491 = 0;
											if (local715 == 0) {
												local1491 = 57;
											}
											local841 = Static295.anInt5252;
											if (local715 == 1) {
												local1491 = 52;
											}
											if (local715 == 2) {
												local1491 = 16;
											}
											if (local715 == 3) {
												local1491 = 2;
											}
											if (local715 == 4) {
												local1491 = 18;
											}
											if (local715 == local1383.anInt7875) {
												local841 = local1383.anInt7903;
											}
											if (local715 == 5) {
												local1491 = 1008;
											}
											if (local1383.anInt7908 == local715) {
												local841 = local1383.anInt7912;
											}
											Static541.method8078(local841, "<col=ff9040>" + local1383.aString87, local184, (long) local292, true, local1476[local715], -1, false, local575, false, local1491, (long) local1373.anInt4411);
										}
									}
								}
								local292++;
							}
						}
					}
					if (local532.aClass60_Sub1_21 instanceof Interface23) {
						@Pc(1601) Interface23 local1601 = (Interface23) local532.aClass60_Sub1_21;
						@Pc(1608) Class125 local1608 = Static290.aClass163_5.method4124(125, local1601.method7934());
						if (local1608.anIntArray198 != null) {
							local1608 = local1608.method3383(Static303.aClass55_2);
						}
						if (local1608 != null) {
							if (Static162.aBoolean266 && local532.aClass60_Sub1_21.aByte135 == Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135) {
								@Pc(1644) Class302 local1644 = Static417.anInt7211 == -1 ? null : Static521.aClass20_21.method250(Static417.anInt7211);
								if ((Static109.anInt2151 & 0x4) != 0 && (local1644 == null || local1608.method3374(local1644.anInt8386, Static417.anInt7211) != local1644.anInt8386)) {
									Static541.method8078(Static607.anInt9573, Static6.aString5 + " -> <col=00ffff>" + local1608.aString40, local184, (long) local1601.hashCode(), true, Static185.aString41, -1, false, local575, false, 3, Static422.method6435(local184, local1601, local575));
								}
							}
							if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 == local532.aClass60_Sub1_21.aByte135) {
								@Pc(1713) String[] local1713 = local1608.aStringArray13;
								if (local1713 != null) {
									for (local292 = local1713.length - 1; local292 >= 0; local292--) {
										if (local1713[local292] != null) {
											@Pc(1730) short local1730 = 0;
											local314 = Static295.anInt5252;
											if (local292 == 0) {
												local1730 = 50;
											}
											if (local292 == 1) {
												local1730 = 12;
											}
											if (local292 == 2) {
												local1730 = 9;
											}
											if (local292 == 3) {
												local1730 = 51;
											}
											if (local292 == 4) {
												local1730 = 1002;
											}
											if (local292 == local1608.anInt3603) {
												local314 = local1608.anInt3595;
											}
											if (local292 == 5) {
												local1730 = 1009;
											}
											if (local292 == local1608.anInt3582) {
												local314 = local1608.anInt3618;
											}
											Static541.method8078(local314, "<col=00ffff>" + local1608.aString40, local184, (long) local1601.hashCode(), true, local1713[local292], -1, false, local575, false, local1730, Static422.method6435(local184, local1601, local575));
										}
									}
								}
							}
						}
					}
				}
			}
			if (Static93.aBoolean113) {
				Static43.method538();
			}
		}
		Static220.method4009(false);
	}
}
