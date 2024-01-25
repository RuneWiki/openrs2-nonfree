import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[S")
	public static short[] aShortArray21;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_24 = new Class276(18, -1);

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	public static int anInt1810 = -1;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[Lclient!ga;")
	public static final Class3_Sub4_Sub12[] aClass3_Sub4_Sub12Array1 = new Class3_Sub4_Sub12[14];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!tc;)Lclient!cr;")
	public static Class3_Sub11 method1694(@OriginalArg(0) Class305 arg0) {
		@Pc(13) Class3_Sub11 local13 = (Class3_Sub11) Static258.aClass25_22.method946(((long) arg0.anInt9167 << 32) + (long) arg0.anInt9159);
		return local13 == null ? arg0.aClass3_Sub11_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!tc;)Lclient!tc;")
	public static Class305 method1696(@OriginalArg(0) Class305 arg0) {
		@Pc(4) int local4 = method1694(arg0).method1761();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static220.method3786(arg0.anInt9199);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1698(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static455.anInt8611;
		@Pc(3) int[] local3 = Static492.anIntArray589;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static268.anInt5680; local5++) {
			@Pc(15) Class2_Sub2_Sub1 local15;
			if (local5 < local1) {
				local15 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local3[local5]];
			} else {
				local15 = ((Class3_Sub46) Static331.aClass25_25.method946((long) Static304.anIntArray377[local5 - local1])).aClass2_Sub2_Sub1_Sub2_2;
			}
			if (local15.aByte103 == arg0 && local15.anInt7606 >= 0) {
				@Pc(39) int local39 = local15.method6311();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt9398 & 0x1FF) != 0 || (local15.anInt9396 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt9398 & 0x1FF) != 256 || (local15.anInt9396 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt9398 >> 9;
					local80 = local15.anInt9396 >> 9;
					if (local15.anInt7606 > Static534.anIntArrayArray79[local75][local80]) {
						Static534.anIntArrayArray79[local75][local80] = local15.anInt7606;
						Static206.anIntArrayArray70[local75][local80] = 1;
					} else if (local15.anInt7606 == Static534.anIntArrayArray79[local75][local80]) {
						local116 = Static206.anIntArrayArray70[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt9398 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt9396 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt9398 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt9396 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt7606 > Static534.anIntArrayArray79[local158][local161]) {
								Static534.anIntArrayArray79[local158][local161] = local15.anInt7606;
								Static206.anIntArrayArray70[local158][local161] = 1;
							} else if (local15.anInt7606 == Static534.anIntArrayArray79[local158][local161]) {
								local116 = Static206.anIntArrayArray70[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1699() {
		Static471.anInt8842 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static268.anInt5680; local3++) {
			@Pc(14) Class2_Sub2_Sub1_Sub2 local14 = ((Class3_Sub46) Static331.aClass25_25.method946((long) Static304.anIntArray377[local3])).aClass2_Sub2_Sub1_Sub2_2;
			if (local14.aBoolean647 && local14.method6300() != -1) {
				@Pc(32) int local32 = (local14.method6311() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt9398 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt9396 - local32 >> 9;
				@Pc(53) Class2_Sub2_Sub1 local53 = Static214.method3736(local14.aByte103, local39, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt7603;
					if (local53 instanceof Class2_Sub2_Sub1_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt7642 == 0 && local53.method6300() != -1) {
						Static527.anIntArray508[Static471.anInt8842] = local58;
						Static55.anIntArray77[Static471.anInt8842] = local58;
						Static471.anInt8842++;
						local53.anInt7642++;
					}
					Static527.anIntArray508[Static471.anInt8842] = local58;
					Static55.anIntArray77[Static471.anInt8842] = local14.anInt7603 + 2048;
					Static471.anInt8842++;
					local53.anInt7642++;
				}
			}
		}
		Static547.method8003(0, Static471.anInt8842 - 1, Static55.anIntArray77, Static527.anIntArray508);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1700() {
		for (@Pc(1) int local1 = 0; local1 < Static460.anInt8640; local1++) {
			@Pc(6) int[] local6 = Static534.anIntArrayArray79[local1];
			for (@Pc(8) int local8 = 0; local8 < Static292.anInt7682; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1701() {
		@Pc(1) int local1 = Static455.anInt8611;
		@Pc(3) int[] local3 = Static492.anIntArray589;
		@Pc(20) boolean local20 = Static455.aClass3_Sub27_Sub1_1.anInt4789 == 1 && local1 > 200 || Static455.aClass3_Sub27_Sub1_1.anInt4789 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class2_Sub2_Sub1_Sub1 local29 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local3[local22]];
			if (local29.method2040()) {
				local29.method7630();
				if (local29.aShort120 >= 0 && local29.aShort122 >= 0 && local29.aShort121 < Static460.anInt8640 && local29.aShort123 < Static292.anInt7682) {
					local29.aBoolean174 = local29.aBoolean645 ? local20 : false;
					if (local29 == Static443.aClass2_Sub2_Sub1_Sub1_2) {
						local29.anInt7606 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean647) {
							local75++;
						}
						if (local29.anInt7647 > Static129.anInt10429) {
							local75 += 2;
						}
						local75 += 5 - local29.method6311() << 2;
						if (local29.aBoolean171) {
							local75 += 512;
						} else {
							if (Static427.anInt9470 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt7606 = local75 + 1;
					}
				} else {
					local29.anInt7606 = -1;
				}
			} else {
				local29.anInt7606 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static268.anInt5680; local116++) {
			@Pc(127) Class2_Sub2_Sub1_Sub2 local127 = ((Class3_Sub46) Static331.aClass25_25.method946((long) Static304.anIntArray377[local116])).aClass2_Sub2_Sub1_Sub2_2;
			if (local127.method6321() && local127.aClass169_1.method4184(Static588.aClass322_1)) {
				local127.method7630();
				if (local127.aShort120 >= 0 && local127.aShort122 >= 0 && local127.aShort121 < Static460.anInt8640 && local127.aShort123 < Static292.anInt7682) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean647) {
						local164++;
					}
					if (local127.anInt7647 > Static129.anInt10429) {
						local164 += 2;
					}
					local164 += 5 - local127.method6311() << 2;
					if (Static427.anInt9470 == 0) {
						if (local127.aClass169_1.aBoolean417) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static427.anInt9470 == 1) {
						if (local127.aClass169_1.aBoolean417) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass169_1.aBoolean419) {
						local164 += 1024;
					} else if (!local127.aClass169_1.aBoolean422) {
						local164 += 256;
					}
					local127.anInt7606 = local164 + 1;
				} else {
					local127.anInt7606 = -1;
				}
			} else {
				local127.anInt7606 = -1;
			}
		}
		for (local75 = 0; local75 < Static516.aClass357Array3.length; local75++) {
			@Pc(230) Class357 local230 = Static516.aClass357Array3[local75];
			if (local230 != null) {
				if (local230.anInt10299 == 1) {
					@Pc(244) Class3_Sub46 local244 = (Class3_Sub46) Static331.aClass25_25.method946((long) local230.anInt10302);
					if (local244 != null) {
						@Pc(249) Class2_Sub2_Sub1_Sub2 local249 = local244.aClass2_Sub2_Sub1_Sub2_2;
						if (local249.anInt7606 >= 0) {
							local249.anInt7606 += 2048;
						}
					}
				} else if (local230.anInt10299 == 10) {
					@Pc(268) Class2_Sub2_Sub1_Sub1 local268 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local230.anInt10302];
					if (local268 != null && local268 != Static443.aClass2_Sub2_Sub1_Sub1_2 && local268.anInt7606 >= 0) {
						local268.anInt7606 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!tc;)Z")
	public static boolean method1702(@OriginalArg(0) Class305 arg0) {
		if (Static230.aBoolean352) {
			if (method1694(arg0).anInt1877 != 0) {
				return false;
			}
			if (arg0.anInt9211 == 0) {
				return false;
			}
		}
		return arg0.aBoolean773;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method1703(@OriginalArg(0) String arg0) {
		return Static484.method7400(go.class, arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!tc;IIIIIIIII)V")
	public static void method1705(@OriginalArg(0) Class305[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class305 local6 = arg0[local1];
			if (local6 != null && local6.anInt9199 == arg1) {
				@Pc(17) int local17 = local6.anInt9197 + arg6;
				@Pc(22) int local22 = local6.anInt9206 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt9211 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt9242;
					@Pc(45) int local45 = local22 + local6.anInt9160;
					if (local6.anInt9211 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt9211 == 0 || local6.aBoolean767 || method1694(local6).anInt1877 != 0 || local6 == Static327.aClass305_9 || local6.anInt9218 == Static593.anInt10389) {
					if (!method1702(local6)) {
						if (local6 == Static360.aClass305_3 && Static380.method6129(Static360.aClass305_3) != null) {
							Static522.aBoolean797 = true;
							Static119.anInt2739 = local17;
							Static537.anInt9851 = local22;
						}
						if (local6.aBoolean763 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean762 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(152) Class3_Sub38 local152 = (Class3_Sub38) Static319.aClass183_40.method4795(); local152 != null; local152 = (Class3_Sub38) Static319.aClass183_40.method4793()) {
									if (local152.aBoolean600) {
										local152.method8412();
										local152.aClass305_11.aBoolean776 = false;
									}
								}
								if (Static394.anInt7571 == 0) {
									Static360.aClass305_3 = null;
									Static327.aClass305_9 = null;
								}
								Static510.anInt9429 = 0;
								Static193.aBoolean188 = false;
								Static204.aBoolean305 = false;
								if (!Static256.aBoolean474) {
									Static271.method4718();
								}
							}
							@Pc(208) boolean local208;
							if (Static258.aClass116_1.method8249() >= local28 && Static258.aClass116_1.method8250() >= local30 && Static258.aClass116_1.method8249() < local32 && Static258.aClass116_1.method8250() < local34) {
								local208 = true;
							} else {
								local208 = false;
							}
							if (!Static594.aBoolean851 && local208) {
								if (local6.anInt9164 >= 0) {
									anInt1810 = local6.anInt9164;
								} else if (local6.aBoolean762) {
									anInt1810 = -1;
								}
							}
							if (!Static256.aBoolean474 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static454.method7044(arg8 - local17, arg9 - local22, local6);
							}
							@Pc(252) boolean local252 = false;
							if (Static258.aClass116_1.method8247() && local208) {
								local252 = true;
							}
							@Pc(262) boolean local262 = false;
							@Pc(267) Class3_Sub21 local267 = (Class3_Sub21) Static283.aClass183_38.method4795();
							if (local267 != null && local267.method3914() == 0 && local267.method3917() >= local28 && local267.method3916() >= local30 && local267.method3917() < local32 && local267.method3916() < local34) {
								local262 = true;
							}
							@Pc(303) int local303;
							@Pc(437) int local437;
							if (local6.aByteArray105 != null && !Static379.method6127()) {
								for (local303 = 0; local303 < local6.aByteArray105.length; local303++) {
									if (Static212.aClass193_1.method6323(local6.aByteArray105[local303])) {
										if (local6.anIntArray596 == null || Static129.anInt10429 >= local6.anIntArray596[local303]) {
											@Pc(335) byte local335 = local6.aByteArray106[local303];
											if (local335 == 0 || ((local335 & 0x8) == 0 || !Static212.aClass193_1.method6323(86) && !Static212.aClass193_1.method6323(82) && !Static212.aClass193_1.method6323(81)) && ((local335 & 0x2) == 0 || Static212.aClass193_1.method6323(86)) && ((local335 & 0x1) == 0 || Static212.aClass193_1.method6323(82)) && ((local335 & 0x4) == 0 || Static212.aClass193_1.method6323(81))) {
												if (local303 < 10) {
													Static128.method6030(-1, "", local6.anInt9167, local303 + 1);
												} else if (local303 == 10) {
													Static583.method7888();
													@Pc(406) Class3_Sub11 local406 = method1694(local6);
													Static199.method3361(local406.method1757(), local6, local406.anInt1876);
													Static590.aString133 = Static574.method8202(local6);
													if (Static590.aString133 == null) {
														Static590.aString133 = "Null";
													}
													Static569.aString131 = local6.aString110 + "<col=ffffff>";
												}
												local437 = local6.anIntArray598[local303];
												if (local6.anIntArray596 == null) {
													local6.anIntArray596 = new int[local6.aByteArray105.length];
												}
												if (local437 == 0) {
													local6.anIntArray596[local303] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray596[local303] = Static129.anInt10429 + local437;
												}
											}
										}
									} else if (local6.anIntArray596 != null) {
										local6.anIntArray596[local303] = 0;
									}
								}
							}
							if (local262) {
								Static421.method6749(local6, local267.method3916() - local22, local267.method3917() - local17);
							}
							if (Static360.aClass305_3 != null && Static360.aClass305_3 != local6 && local208 && method1694(local6).method1762()) {
								Static86.aClass305_4 = local6;
							}
							if (local6 == Static327.aClass305_9) {
								Static484.aBoolean752 = true;
								Static63.anInt1628 = local17;
								Static49.anInt1211 = local22;
							}
							if (local6.aBoolean767 || local6.anInt9218 != 0) {
								@Pc(522) Class3_Sub38 local522;
								if (local208 && Static554.anInt9953 != 0 && local6.anObjectArray30 != null) {
									local522 = new Class3_Sub38();
									local522.aBoolean600 = true;
									local522.aClass305_11 = local6;
									local522.anInt7106 = Static554.anInt9953;
									local522.anObjectArray4 = local6.anObjectArray30;
									Static319.aClass183_40.method4792(local522);
								}
								if (Static360.aClass305_3 != null || Static256.aBoolean474 || local6.anInt9218 != Static514.anInt9449 && Static510.anInt9429 > 0) {
									local262 = false;
									local252 = false;
									local208 = false;
								}
								@Pc(677) int local677;
								if (local6.anInt9218 != 0) {
									if (local6.anInt9218 == Static58.anInt1503 || local6.anInt9218 == Static195.anInt3799) {
										Static528.aClass305_13 = local6;
										if (Static429.aClass140_1 != null) {
											Static429.aClass140_1.method3295(Static546.aClass15_16, local6.anInt9160);
										}
										if (local6.anInt9218 == Static58.anInt1503) {
											if (!Static256.aBoolean474 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static364.method6006(arg9, arg8, Static546.aClass15_16);
												for (@Pc(605) Class55_Sub1 local605 = (Class55_Sub1) Static220.aClass134_6.method3233(); local605 != null; local605 = (Class55_Sub1) Static220.aClass134_6.method3230()) {
													if (arg8 >= local605.anInt1899 && arg8 < local605.anInt1896 && arg9 >= local605.anInt1900 && arg9 < local605.anInt1898) {
														Static271.method4718();
														Static501.method7560(local605.aClass2_Sub2_Sub1_1);
													}
												}
											}
											Static149.method2486(local22, local17, local6);
											continue;
										}
									}
									@Pc(716) int local716;
									if (local6.anInt9218 == Static593.anInt10389) {
										if (local6.method7501(Static546.aClass15_16) == null || Static327.anInt6815 != 0 && Static327.anInt6815 != 3 || Static256.aBoolean474 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local303 = arg8 - local17;
										local677 = arg9 - local22;
										local437 = local6.anIntArray599[local677];
										if (local303 < local437 || local303 > local437 + local6.anIntArray601[local677]) {
											continue;
										}
										local303 -= local6.anInt9242 / 2;
										local677 -= local6.anInt9160 / 2;
										if (Static267.anInt5668 == 4) {
											local716 = (int) Static533.aFloat188 & 0x3FFF;
										} else {
											local716 = (int) Static533.aFloat188 + Static288.anInt5964 & 0x3FFF;
										}
										@Pc(728) int local728 = Class2_Sub3.anIntArray620[local716];
										@Pc(732) int local732 = Class2_Sub3.anIntArray621[local716];
										if (Static267.anInt5668 != 4) {
											local728 = local728 * (Static66.anInt1706 + 256) >> 8;
											local732 = local732 * (Static66.anInt1706 + 256) >> 8;
										}
										@Pc(761) int local761 = local677 * local728 + local303 * local732 >> 14;
										@Pc(771) int local771 = local677 * local732 - local303 * local728 >> 14;
										@Pc(782) int local782;
										@Pc(790) int local790;
										if (Static267.anInt5668 == 4) {
											local782 = (Static531.anInt9619 >> 9) + (local761 >> 2);
											local790 = (Static166.anInt3526 >> 9) - (local771 >> 2);
										} else {
											@Pc(799) int local799 = (Static443.aClass2_Sub2_Sub1_Sub1_2.method6311() - 1) * 256;
											local782 = (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 - local799 >> 9) + (local761 >> 2);
											local790 = (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396 - local799 >> 9) - (local771 >> 2);
										}
										if (Static594.aBoolean851 && (Static564.anInt10012 & 0x40) != 0) {
											@Pc(832) Class305 local832 = Static282.method4864(Static352.anInt7064, Static317.anInt9395);
											if (local832 == null) {
												Static583.method7888();
											} else {
												Static200.method3365(local790, " ->", 1L, Static590.aString133, 19, local6.anInt9216, false, Static120.anInt2749, local782, true);
											}
											continue;
										}
										if (Static581.aClass335_4 == Static329.aClass335_3) {
											Static200.method3365(local790, "", 1L, Static139.aClass101_26.method2841(Static126.anInt2904), 3, -1, false, -1, local782, true);
										}
										Static200.method3365(local790, "", 1L, Static591.aString134, 30, -1, false, Static446.anInt8510, local782, true);
										continue;
									}
									if (local6.anInt9218 == Static514.anInt9449) {
										Static112.aClass305_5 = local6;
										if (local208) {
											Static193.aBoolean188 = true;
										}
										if (local262) {
											local303 = (int) ((double) (local267.method3917() - local17 - local6.anInt9242 / 2) * 2.0D / (double) Static87.aFloat148);
											local677 = (int) -((double) (local267.method3916() - local22 - local6.anInt9160 / 2) * 2.0D / (double) Static87.aFloat148);
											local437 = Static185.anInt3726 + local303 + Static87.anInt6928;
											local716 = Static18.anInt597 + local677 + Static87.anInt6924;
											@Pc(946) Class3_Sub4_Sub7 local946 = Static461.method7089();
											if (local946 == null) {
												continue;
											}
											@Pc(951) int[] local951 = new int[3];
											local946.method2057(local951, local716, local437);
											if (local951 != null) {
												if (Static212.aClass193_1.method6323(82) && Static158.anInt3421 > 0) {
													Static432.method4774(local951[1], local951[0], local951[2]);
													continue;
												}
												Static204.aBoolean305 = true;
												Static258.anInt5536 = local951[0];
												Static289.anInt6779 = local951[1];
												Static199.anInt3895 = local951[2];
											}
											Static510.anInt9429 = 1;
											Static230.aBoolean353 = false;
											Static337.anInt6958 = Static258.aClass116_1.method8249();
											Static99.anInt2399 = Static258.aClass116_1.method8250();
											continue;
										}
										if (local252 && Static510.anInt9429 > 0) {
											if (Static510.anInt9429 == 1 && (Static337.anInt6958 != Static258.aClass116_1.method8249() || Static99.anInt2399 != Static258.aClass116_1.method8250())) {
												Static520.anInt9517 = Static185.anInt3726;
												Static185.anInt3727 = Static18.anInt597;
												Static510.anInt9429 = 2;
											}
											if (Static510.anInt9429 == 2) {
												Static230.aBoolean353 = true;
												Static220.method3784(Static520.anInt9517 + (int) ((double) (Static337.anInt6958 - Static258.aClass116_1.method8249()) * 2.0D / (double) Static87.aFloat149));
												Static234.method4088(Static185.anInt3727 - (int) ((double) (Static99.anInt2399 - Static258.aClass116_1.method8250()) * 2.0D / (double) Static87.aFloat149));
											}
											continue;
										}
										if (Static510.anInt9429 > 0 && !Static230.aBoolean353) {
											if ((Static539.anInt9736 == 1 || Static392.method6253()) && Static309.anInt6170 > 2) {
												Static314.method5269(Static337.anInt6958, Static99.anInt2399);
											} else if (Static420.method6744()) {
												Static314.method5269(Static337.anInt6958, Static99.anInt2399);
											}
										}
										Static510.anInt9429 = 0;
										continue;
									}
									if (local6.anInt9218 == Static298.anInt6041) {
										if (local252) {
											Static56.method1330(local6.anInt9160, Static258.aClass116_1.method8249() - local17, local6.anInt9242, Static258.aClass116_1.method8250() - local22);
										}
										continue;
									}
									if (local6.anInt9218 == Static421.anInt8200) {
										Static255.method4559(local22, local17, local6);
										continue;
									}
								}
								if (!local6.aBoolean768 && local262) {
									local6.aBoolean768 = true;
									if (local6.anObjectArray33 != null) {
										local522 = new Class3_Sub38();
										local522.aBoolean600 = true;
										local522.aClass305_11 = local6;
										local522.anInt7107 = local267.method3917() - local17;
										local522.anInt7106 = local267.method3916() - local22;
										local522.anObjectArray4 = local6.anObjectArray33;
										Static319.aClass183_40.method4792(local522);
									}
								}
								if (local6.aBoolean768 && local252 && local6.anObjectArray26 != null) {
									local522 = new Class3_Sub38();
									local522.aBoolean600 = true;
									local522.aClass305_11 = local6;
									local522.anInt7107 = Static258.aClass116_1.method8249() - local17;
									local522.anInt7106 = Static258.aClass116_1.method8250() - local22;
									local522.anObjectArray4 = local6.anObjectArray26;
									Static319.aClass183_40.method4792(local522);
								}
								if (local6.aBoolean768 && !local252) {
									local6.aBoolean768 = false;
									if (local6.anObjectArray36 != null) {
										local522 = new Class3_Sub38();
										local522.aBoolean600 = true;
										local522.aClass305_11 = local6;
										local522.anInt7107 = Static258.aClass116_1.method8249() - local17;
										local522.anInt7106 = Static258.aClass116_1.method8250() - local22;
										local522.anObjectArray4 = local6.anObjectArray36;
										Static171.aClass183_17.method4792(local522);
									}
								}
								if (local252 && local6.anObjectArray19 != null) {
									local522 = new Class3_Sub38();
									local522.aBoolean600 = true;
									local522.aClass305_11 = local6;
									local522.anInt7107 = Static258.aClass116_1.method8249() - local17;
									local522.anInt7106 = Static258.aClass116_1.method8250() - local22;
									local522.anObjectArray4 = local6.anObjectArray19;
									Static319.aClass183_40.method4792(local522);
								}
								if (!local6.aBoolean776 && local208) {
									local6.aBoolean776 = true;
									if (local6.anObjectArray21 != null) {
										local522 = new Class3_Sub38();
										local522.aBoolean600 = true;
										local522.aClass305_11 = local6;
										local522.anInt7107 = Static258.aClass116_1.method8249() - local17;
										local522.anInt7106 = Static258.aClass116_1.method8250() - local22;
										local522.anObjectArray4 = local6.anObjectArray21;
										Static319.aClass183_40.method4792(local522);
									}
								}
								if (local6.aBoolean776 && local208 && local6.anObjectArray17 != null) {
									local522 = new Class3_Sub38();
									local522.aBoolean600 = true;
									local522.aClass305_11 = local6;
									local522.anInt7107 = Static258.aClass116_1.method8249() - local17;
									local522.anInt7106 = Static258.aClass116_1.method8250() - local22;
									local522.anObjectArray4 = local6.anObjectArray17;
									Static319.aClass183_40.method4792(local522);
								}
								if (local6.aBoolean776 && !local208) {
									local6.aBoolean776 = false;
									if (local6.anObjectArray31 != null) {
										local522 = new Class3_Sub38();
										local522.aBoolean600 = true;
										local522.aClass305_11 = local6;
										local522.anInt7107 = Static258.aClass116_1.method8249() - local17;
										local522.anInt7106 = Static258.aClass116_1.method8250() - local22;
										local522.anObjectArray4 = local6.anObjectArray31;
										Static171.aClass183_17.method4792(local522);
									}
								}
								if (local6.anObjectArray20 != null) {
									local522 = new Class3_Sub38();
									local522.aClass305_11 = local6;
									local522.anObjectArray4 = local6.anObjectArray20;
									Static517.aClass183_57.method4792(local522);
								}
								@Pc(1490) Class3_Sub38 local1490;
								if (local6.anObjectArray13 != null && Static273.anInt5811 > local6.anInt9224) {
									if (local6.anIntArray603 == null || Static273.anInt5811 - local6.anInt9224 > 32) {
										local522 = new Class3_Sub38();
										local522.aClass305_11 = local6;
										local522.anObjectArray4 = local6.anObjectArray13;
										Static319.aClass183_40.method4792(local522);
									} else {
										label681: for (local303 = local6.anInt9224; local303 < Static273.anInt5811; local303++) {
											local677 = Static393.anIntArray482[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray603.length; local437++) {
												if (local6.anIntArray603[local437] == local677) {
													local1490 = new Class3_Sub38();
													local1490.aClass305_11 = local6;
													local1490.anObjectArray4 = local6.anObjectArray13;
													Static319.aClass183_40.method4792(local1490);
													break label681;
												}
											}
										}
									}
									local6.anInt9224 = Static273.anInt5811;
								}
								if (local6.anObjectArray11 != null && Static5.anInt273 > local6.anInt9239) {
									if (local6.anIntArray600 == null || Static5.anInt273 - local6.anInt9239 > 32) {
										local522 = new Class3_Sub38();
										local522.aClass305_11 = local6;
										local522.anObjectArray4 = local6.anObjectArray11;
										Static319.aClass183_40.method4792(local522);
									} else {
										label657: for (local303 = local6.anInt9239; local303 < Static5.anInt273; local303++) {
											local677 = Static194.anIntArray266[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray600.length; local437++) {
												if (local6.anIntArray600[local437] == local677) {
													local1490 = new Class3_Sub38();
													local1490.aClass305_11 = local6;
													local1490.anObjectArray4 = local6.anObjectArray11;
													Static319.aClass183_40.method4792(local1490);
													break label657;
												}
											}
										}
									}
									local6.anInt9239 = Static5.anInt273;
								}
								if (local6.anObjectArray8 != null && Static141.anInt3259 > local6.anInt9203) {
									if (local6.anIntArray602 == null || Static141.anInt3259 - local6.anInt9203 > 32) {
										local522 = new Class3_Sub38();
										local522.aClass305_11 = local6;
										local522.anObjectArray4 = local6.anObjectArray8;
										Static319.aClass183_40.method4792(local522);
									} else {
										label633: for (local303 = local6.anInt9203; local303 < Static141.anInt3259; local303++) {
											local677 = Static207.anIntArray275[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray602.length; local437++) {
												if (local6.anIntArray602[local437] == local677) {
													local1490 = new Class3_Sub38();
													local1490.aClass305_11 = local6;
													local1490.anObjectArray4 = local6.anObjectArray8;
													Static319.aClass183_40.method4792(local1490);
													break label633;
												}
											}
										}
									}
									local6.anInt9203 = Static141.anInt3259;
								}
								if (local6.anObjectArray23 != null && Static140.anInt9492 > local6.anInt9220) {
									if (local6.anIntArray604 == null || Static140.anInt9492 - local6.anInt9220 > 32) {
										local522 = new Class3_Sub38();
										local522.aClass305_11 = local6;
										local522.anObjectArray4 = local6.anObjectArray23;
										Static319.aClass183_40.method4792(local522);
									} else {
										label609: for (local303 = local6.anInt9220; local303 < Static140.anInt9492; local303++) {
											local677 = Static312.anIntArray430[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray604.length; local437++) {
												if (local6.anIntArray604[local437] == local677) {
													local1490 = new Class3_Sub38();
													local1490.aClass305_11 = local6;
													local1490.anObjectArray4 = local6.anObjectArray23;
													Static319.aClass183_40.method4792(local1490);
													break label609;
												}
											}
										}
									}
									local6.anInt9220 = Static140.anInt9492;
								}
								if (local6.anObjectArray6 != null && Static19.anInt609 > local6.anInt9223) {
									if (local6.anIntArray597 == null || Static19.anInt609 - local6.anInt9223 > 32) {
										local522 = new Class3_Sub38();
										local522.aClass305_11 = local6;
										local522.anObjectArray4 = local6.anObjectArray6;
										Static319.aClass183_40.method4792(local522);
									} else {
										label585: for (local303 = local6.anInt9223; local303 < Static19.anInt609; local303++) {
											local677 = Static48.anIntArray71[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray597.length; local437++) {
												if (local6.anIntArray597[local437] == local677) {
													local1490 = new Class3_Sub38();
													local1490.aClass305_11 = local6;
													local1490.anObjectArray4 = local6.anObjectArray6;
													Static319.aClass183_40.method4792(local1490);
													break label585;
												}
											}
										}
									}
									local6.anInt9223 = Static19.anInt609;
								}
								if (Static350.anInt7049 > local6.anInt9226 && local6.anObjectArray7 != null) {
									local522 = new Class3_Sub38();
									local522.aClass305_11 = local6;
									local522.anObjectArray4 = local6.anObjectArray7;
									Static319.aClass183_40.method4792(local522);
								}
								if (Static257.anInt5521 > local6.anInt9226 && local6.anObjectArray34 != null) {
									local522 = new Class3_Sub38();
									local522.aClass305_11 = local6;
									local522.anObjectArray4 = local6.anObjectArray34;
									Static319.aClass183_40.method4792(local522);
								}
								if (Static188.anInt3750 > local6.anInt9226 && local6.anObjectArray10 != null) {
									local522 = new Class3_Sub38();
									local522.aClass305_11 = local6;
									local522.anObjectArray4 = local6.anObjectArray10;
									Static319.aClass183_40.method4792(local522);
								}
								if (Static155.anInt3389 > local6.anInt9226 && local6.anObjectArray35 != null) {
									local522 = new Class3_Sub38();
									local522.aClass305_11 = local6;
									local522.anObjectArray4 = local6.anObjectArray35;
									Static319.aClass183_40.method4792(local522);
								}
								if (Static596.anInt10437 > local6.anInt9226 && local6.anObjectArray16 != null) {
									local522 = new Class3_Sub38();
									local522.aClass305_11 = local6;
									local522.anObjectArray4 = local6.anObjectArray16;
									Static319.aClass183_40.method4792(local522);
								}
								local6.anInt9226 = Static509.anInt9418;
								if (local6.anObjectArray9 != null) {
									for (local303 = 0; local303 < Static110.anInt2599; local303++) {
										@Pc(1958) Class3_Sub38 local1958 = new Class3_Sub38();
										local1958.aClass305_11 = local6;
										local1958.anInt7102 = Static348.anInterface23Array3[local303].method5041();
										local1958.anInt7105 = Static348.anInterface23Array3[local303].method5038();
										local1958.anObjectArray4 = local6.anObjectArray9;
										Static319.aClass183_40.method4792(local1958);
									}
								}
								if (Static129.aBoolean853 && local6.anObjectArray22 != null) {
									local522 = new Class3_Sub38();
									local522.aClass305_11 = local6;
									local522.anObjectArray4 = local6.anObjectArray22;
									Static319.aClass183_40.method4792(local522);
								}
							}
							if (local6.anInt9211 == 5 && local6.anInt9180 != -1) {
								local6.method7484(Static136.aClass272_1, Static271.aClass176_1).method3295(Static546.aClass15_16, local6.anInt9160);
							}
							Static277.method4824(local6);
							if (local6.anInt9211 == 0) {
								method1705(arg0, local6.anInt9167, local28, local30, local32, local34, local17 - local6.anInt9215, local22 - local6.anInt9233, arg8, arg9);
								if (local6.aClass305Array2 != null) {
									method1705(local6.aClass305Array2, local6.anInt9167, local28, local30, local32, local34, local17 - local6.anInt9215, local22 - local6.anInt9233, arg8, arg9);
								}
								@Pc(2080) Class3_Sub18 local2080 = (Class3_Sub18) Static283.aClass25_23.method946((long) local6.anInt9167);
								if (local2080 != null) {
									if (Static581.aClass335_4 == Static318.aClass335_2 && local2080.anInt3964 == 0 && !Static256.aBoolean474 && local208 && !Static230.aBoolean352) {
										Static271.method4718();
									}
									Static197.method3343(local34, local17, local32, arg9, local30, local2080.anInt3962, local28, local22, arg8);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static277.method4824(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1707() {
		@Pc(1) int local1 = Static455.anInt8611;
		@Pc(3) int[] local3 = Static492.anIntArray589;
		@Pc(11) int local11 = Static281.aBoolean507 ? local1 : local1 + Static268.anInt5680;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class2_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local3[local13]];
			} else {
				local23 = ((Class3_Sub46) Static331.aClass25_25.method946((long) Static304.anIntArray377[local13 - local1])).aClass2_Sub2_Sub1_Sub2_2;
			}
			if (local23.anInt7606 >= 0) {
				@Pc(43) int local43 = local23.method6311();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt9398 & 0x1FF) == 0 && (local23.anInt9396 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt9398 & 0x1FF) == 256 && (local23.anInt9396 & 0x1FF) == 256) {
					continue;
				}
				if (local23 instanceof Class2_Sub2_Sub1_Sub1 && local23.aClass3_Sub25_3 != null && Static129.anInt10429 >= local23.aClass3_Sub25_3.anInt4615 && Static129.anInt10429 < local23.aClass3_Sub25_3.anInt4617) {
					((Class2_Sub2_Sub1_Sub1) local23).aBoolean174 = false;
				}
				local23.anInt9400 = Static274.method4782(local23.anInt9396, local23.aByte103, local23.anInt9398);
				Static319.method5520(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method1708(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static455.anInt8611;
		@Pc(3) int[] local3 = Static492.anIntArray589;
		@Pc(11) int local11 = Static281.aBoolean507 ? local1 : local1 + Static268.anInt5680;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class2_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local3[local13]];
			} else {
				local23 = ((Class3_Sub46) Static331.aClass25_25.method946((long) Static304.anIntArray377[local13 - local1])).aClass2_Sub2_Sub1_Sub2_2;
			}
			if (local23.aByte103 == arg0) {
				local23.anInt7642 = 0;
				if (local23.anInt7606 < 0) {
					local23.aBoolean647 = false;
				} else {
					@Pc(54) int local54 = local23.method6311();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt9398 & 0x1FF) != 0 || (local23.anInt9396 & 0x1FF) != 0) {
							local23.aBoolean647 = false;
							continue;
						}
					} else if ((local23.anInt9398 & 0x1FF) != 256 || (local23.anInt9396 & 0x1FF) != 256) {
						local23.aBoolean647 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt9398 >> 9;
						local101 = local23.anInt9396 >> 9;
						if (local23.anInt7606 != Static534.anIntArrayArray79[local96][local101]) {
							local23.aBoolean647 = true;
							continue;
						}
						if (Static206.anIntArrayArray70[local96][local101] > 1) {
							local126 = Static206.anIntArrayArray70[local96][local101]--;
							local23.aBoolean647 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt9398 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt9396 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt9398 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt9396 + local96 >> 9;
						if (!Static521.method7717(local101, local169, local162, local155, local23.anInt7606)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt7606 == Static534.anIntArrayArray79[local180][local183]) {
										local126 = Static206.anIntArrayArray70[local180][local183]--;
									}
								}
							}
							local23.aBoolean647 = true;
							continue;
						}
					}
					if (local23 instanceof Class2_Sub2_Sub1_Sub1 && local23.aClass3_Sub25_3 != null && Static129.anInt10429 >= local23.aClass3_Sub25_3.anInt4615 && Static129.anInt10429 < local23.aClass3_Sub25_3.anInt4617) {
						((Class2_Sub2_Sub1_Sub1) local23).aBoolean174 = false;
					}
					local23.aBoolean647 = false;
					local23.anInt9400 = Static274.method4782(local23.anInt9396, local23.aByte103, local23.anInt9398);
					Static319.method5520(local23, true);
				}
			}
		}
	}
}
