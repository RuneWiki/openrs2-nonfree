import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class131_Sub1 extends Class131 {

	@OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
	public int anInt3602 = 99;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIZ)V")
	public Class131_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static74.aClass140_2, Static321.aClass124_7);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIBIIILclient!tq;IILclient!ha;I)V")
	public void method3081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class360 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class67 arg8, @OriginalArg(10) int arg9) {
		if (Static713.aClass3_Sub55_31.aClass15_Sub25_1.method8268() == 0 && !Static467.method6925(arg4, arg6, Static715.anInt7793, arg7)) {
			return;
		}
		if (this.anInt3602 > arg3) {
			this.anInt3602 = arg3;
		}
		@Pc(49) Class144 local49 = Static70.aClass323_1.method7792(arg1);
		if (Static713.aClass3_Sub55_31.aClass15_Sub26_1.method8908() == 0 && local49.aBoolean378) {
			return;
		}
		@Pc(76) int local76;
		@Pc(79) int local79;
		if (arg9 == 1 || arg9 == 3) {
			local76 = local49.anInt4410;
			local79 = local49.anInt4444;
		} else {
			local76 = local49.anInt4444;
			local79 = local49.anInt4410;
		}
		@Pc(99) int local99;
		@Pc(97) int local97;
		if (arg6 + local76 > super.anInt3577) {
			local97 = arg6 + 1;
			local99 = arg6;
		} else {
			local97 = (local76 + 1 >> 1) + arg6;
			local99 = (local76 >> 1) + arg6;
		}
		@Pc(139) int local139;
		@Pc(133) int local133;
		if (local79 + arg7 <= super.anInt3582) {
			local133 = (local79 + 1 >> 1) + arg7;
			local139 = (local79 >> 1) + arg7;
		} else {
			local133 = arg7 + 1;
			local139 = arg7;
		}
		@Pc(151) Class313 local151 = Static639.aClass313Array2[arg4];
		@Pc(181) int local181 = local151.method9095(local139, local99) + local151.method9095(local139, local97) + local151.method9095(local133, local99) + local151.method9095(local133, local97) >> 2;
		@Pc(190) int local190 = (arg6 << 9) + (local76 << 8);
		@Pc(198) int local198 = (arg7 << 9) + (local79 << 8);
		@Pc(215) boolean local215 = Static335.aBoolean471 && !super.aBoolean291 && local49.aBoolean380;
		if (local49.method3639()) {
			Static119.method2062((Class19_Sub1_Sub3_Sub2_Sub2) null, arg6, local49, arg7, (Class19_Sub1_Sub3_Sub2_Sub1) null, arg9, arg3);
		}
		@Pc(259) boolean local259 = arg0 == -1 && !local49.method3626() && local49.anIntArray239 == null && !local49.aBoolean371 && !local49.aBoolean373;
		if (Static163.aBoolean246 && (Static87.method1177(arg2) && local49.anInt4431 != 1 || !(!Static285.method4304(arg2) || local49.anInt4431 != 0))) {
			return;
		}
		if (arg2 != 22) {
			@Pc(432) Class19_Sub1_Sub3 local432;
			@Pc(400) Class19_Sub1_Sub3_Sub5 local400;
			@Pc(404) int local404;
			@Pc(508) int local508;
			if (arg2 == 10 || arg2 == 11) {
				local400 = null;
				if (local259) {
					@Pc(462) Class19_Sub1_Sub3_Sub5 local462 = new Class19_Sub1_Sub3_Sub5(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg6, local76 + arg6 - 1, arg7, local79 + arg7 - 1, arg2, arg9, local215);
					local404 = local462.method8200();
					local400 = local462;
					local432 = local462;
				} else {
					local404 = 15;
					local432 = new Class19_Sub1_Sub3_Sub3(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg6, local76 + arg6 - 1, arg7, arg7 + local79 - 1, arg2, arg9, arg0);
				}
				if (Static137.method2240(local432, false)) {
					if (local400 != null && local400.method9383()) {
						local400.method9382(arg8);
					}
					if (local49.aBoolean372 && Static335.aBoolean471) {
						if (local404 > 30) {
							local404 = 30;
						}
						for (local508 = 0; local508 <= local76; local508++) {
							for (@Pc(512) int local512 = 0; local512 <= local79; local512++) {
								local151.ka(arg6 + local508, arg7 - -local512, local404);
							}
						}
					}
				}
				if (local49.anInt4411 != 0 && arg5 != null) {
					arg5.method8482(local79, arg6, local76, arg7, !local49.aBoolean376, local49.aBoolean374);
				}
			} else if (arg2 >= 12 && arg2 <= 17 || arg2 >= 18 && arg2 <= 21) {
				if (local259) {
					local400 = new Class19_Sub1_Sub3_Sub5(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg6, arg6 + local76 - 1, arg7, local79 + arg7 - 1, arg2, arg9, local215);
					if (local400.method9383()) {
						local400.method9382(arg8);
					}
					local432 = local400;
				} else {
					local432 = new Class19_Sub1_Sub3_Sub3(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg6, arg6 + local76 - 1, arg7, arg7 + local79 - 1, arg2, arg9, arg0);
				}
				Static137.method2240(local432, false);
				if (Static335.aBoolean471 && !super.aBoolean291 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg3 > 0 && local49.anInt4431 != 0) {
					super.aByteArrayArrayArray11[arg3][arg6][arg7] = (byte) (super.aByteArrayArrayArray11[arg3][arg6][arg7] | 0x4);
				}
				if (local49.anInt4411 != 0 && arg5 != null) {
					arg5.method8482(local79, arg6, local76, arg7, !local49.aBoolean376, local49.aBoolean374);
				}
			} else {
				@Pc(786) Class19_Sub1_Sub2 local786;
				if (arg2 == 0) {
					@Pc(757) int local757 = local49.anInt4431;
					if (Static311.aBoolean455 && local49.anInt4431 == -1) {
						local757 = 1;
					}
					if (local259) {
						@Pc(804) Class19_Sub1_Sub2_Sub1 local804 = new Class19_Sub1_Sub2_Sub1(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg2, arg9, local215);
						if (local804.method9383()) {
							local804.method9382(arg8);
						}
						local786 = local804;
					} else {
						local786 = new Class19_Sub1_Sub2_Sub2(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg2, arg9, arg0);
					}
					Static470.method6955(arg3, arg6, arg7, local786, (Class19_Sub1_Sub2) null);
					if (arg9 == 0) {
						if (Static335.aBoolean471 && local49.aBoolean372) {
							local151.ka(arg6, arg7, 50);
							local151.ka(arg6, arg7 + 1, 50);
						}
						if (local757 == 1 && !super.aBoolean291) {
							Static230.method3622(1, arg7, arg6, local49.anInt4395, arg3, local49.anInt4443);
						}
					} else if (arg9 == 1) {
						if (Static335.aBoolean471 && local49.aBoolean372) {
							local151.ka(arg6, arg7 + 1, 50);
							local151.ka(arg6 + 1, arg7 + 1, 50);
						}
						if (local757 == 1 && !super.aBoolean291) {
							Static230.method3622(2, arg7 + 1, arg6, local49.anInt4395, arg3, -local49.anInt4443);
						}
					} else if (arg9 == 2) {
						if (Static335.aBoolean471 && local49.aBoolean372) {
							local151.ka(arg6 + 1, arg7, 50);
							local151.ka(arg6 + 1, arg7 - -1, 50);
						}
						if (local757 == 1 && !super.aBoolean291) {
							Static230.method3622(1, arg7, arg6 + 1, local49.anInt4395, arg3, -local49.anInt4443);
						}
					} else if (arg9 == 3) {
						if (Static335.aBoolean471 && local49.aBoolean372) {
							local151.ka(arg6, arg7, 50);
							local151.ka(arg6 + 1, arg7, 50);
						}
						if (local757 == 1 && !super.aBoolean291) {
							Static230.method3622(2, arg7, arg6, local49.anInt4395, arg3, local49.anInt4443);
						}
					}
					if (local49.anInt4411 != 0 && arg5 != null) {
						arg5.method8483(!local49.aBoolean376, arg6, arg7, arg2, arg9, local49.aBoolean374);
					}
					if (local49.anInt4398 != 64) {
						Static361.method5178(arg3, arg6, arg7, local49.anInt4398);
					}
				} else {
					@Pc(1101) Class19_Sub1_Sub2 local1101;
					@Pc(1119) Class19_Sub1_Sub2_Sub1 local1119;
					if (arg2 == 1) {
						if (local259) {
							local1119 = new Class19_Sub1_Sub2_Sub1(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg2, arg9, local215);
							if (local1119.method9383()) {
								local1119.method9382(arg8);
							}
							local1101 = local1119;
						} else {
							local1101 = new Class19_Sub1_Sub2_Sub2(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg2, arg9, arg0);
						}
						Static470.method6955(arg3, arg6, arg7, local1101, (Class19_Sub1_Sub2) null);
						if (local49.aBoolean372 && Static335.aBoolean471) {
							if (arg9 == 0) {
								local151.ka(arg6, arg7 + 1, 50);
							} else if (arg9 == 1) {
								local151.ka(arg6 + 1, arg7 + 1, 50);
							} else if (arg9 == 2) {
								local151.ka(arg6 + 1, arg7, 50);
							} else if (arg9 == 3) {
								local151.ka(arg6, arg7, 50);
							}
						}
						if (local49.anInt4411 != 0 && arg5 != null) {
							arg5.method8483(!local49.aBoolean376, arg6, arg7, arg2, arg9, local49.aBoolean374);
						}
					} else if (arg2 == 2) {
						local404 = arg9 + 1 & 0x3;
						if (local259) {
							@Pc(1307) Class19_Sub1_Sub2_Sub1 local1307 = new Class19_Sub1_Sub2_Sub1(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg2, arg9 + 4, local215);
							@Pc(1323) Class19_Sub1_Sub2_Sub1 local1323 = new Class19_Sub1_Sub2_Sub1(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg2, local404, local215);
							if (local1307.method9383()) {
								local1307.method9382(arg8);
							}
							local786 = local1323;
							local1101 = local1307;
							if (local1323.method9383()) {
								local1323.method9382(arg8);
							}
						} else {
							local1101 = new Class19_Sub1_Sub2_Sub2(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg2, arg9 + 4, arg0);
							local786 = new Class19_Sub1_Sub2_Sub2(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg2, local404, arg0);
						}
						Static470.method6955(arg3, arg6, arg7, local1101, local786);
						if ((local49.anInt4431 == 1 || Static311.aBoolean455 && local49.anInt4431 == -1) && !super.aBoolean291) {
							if (arg9 == 0) {
								Static230.method3622(1, arg7, arg6, local49.anInt4395, arg3, local49.anInt4443);
								Static230.method3622(2, arg7 + 1, arg6, local49.anInt4395, arg3, local49.anInt4443);
							} else if (arg9 == 1) {
								Static230.method3622(1, arg7, arg6 + 1, local49.anInt4395, arg3, local49.anInt4443);
								Static230.method3622(2, arg7 + 1, arg6, local49.anInt4395, arg3, local49.anInt4443);
							} else if (arg9 == 2) {
								Static230.method3622(1, arg7, arg6 + 1, local49.anInt4395, arg3, local49.anInt4443);
								Static230.method3622(2, arg7, arg6, local49.anInt4395, arg3, local49.anInt4443);
							} else if (arg9 == 3) {
								Static230.method3622(1, arg7, arg6, local49.anInt4395, arg3, local49.anInt4443);
								Static230.method3622(2, arg7, arg6, local49.anInt4395, arg3, local49.anInt4443);
							}
						}
						if (local49.anInt4411 != 0 && arg5 != null) {
							arg5.method8483(!local49.aBoolean376, arg6, arg7, arg2, arg9, local49.aBoolean374);
						}
						if (local49.anInt4398 != 64) {
							Static361.method5178(arg3, arg6, arg7, local49.anInt4398);
						}
					} else if (arg2 == 3) {
						if (local259) {
							local1119 = new Class19_Sub1_Sub2_Sub1(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg2, arg9, local215);
							if (local1119.method9383()) {
								local1119.method9382(arg8);
							}
							local1101 = local1119;
						} else {
							local1101 = new Class19_Sub1_Sub2_Sub2(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg2, arg9, arg0);
						}
						Static470.method6955(arg3, arg6, arg7, local1101, (Class19_Sub1_Sub2) null);
						if (local49.aBoolean372 && Static335.aBoolean471) {
							if (arg9 == 0) {
								local151.ka(arg6, arg7 + 1, 50);
							} else if (arg9 == 1) {
								local151.ka(arg6 + 1, arg7 + 1, 50);
							} else if (arg9 == 2) {
								local151.ka(arg6 + 1, arg7, 50);
							} else if (arg9 == 3) {
								local151.ka(arg6, arg7, 50);
							}
						}
						if (local49.anInt4411 != 0 && arg5 != null) {
							arg5.method8483(!local49.aBoolean376, arg6, arg7, arg2, arg9, local49.aBoolean374);
						}
					} else if (arg2 == 9) {
						if (local259) {
							local400 = new Class19_Sub1_Sub3_Sub5(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg6, arg6, arg7, arg7, arg2, arg9, local215);
							if (local400.method9383()) {
								local400.method9382(arg8);
							}
							local432 = local400;
						} else {
							local432 = new Class19_Sub1_Sub3_Sub3(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg6, arg6 + local76 - 1, arg7, local79 + arg7 - 1, arg2, arg9, arg0);
						}
						Static137.method2240(local432, false);
						if (local49.anInt4431 == 1 && !super.aBoolean291) {
							@Pc(1803) byte local1803;
							if ((arg9 & 0x1) == 0) {
								local1803 = 8;
							} else {
								local1803 = 16;
							}
							Static230.method3622(local1803, arg7, arg6, local49.anInt4395, arg3, 0);
						}
						if (local49.anInt4411 != 0 && arg5 != null) {
							arg5.method8482(local79, arg6, local76, arg7, !local49.aBoolean376, local49.aBoolean374);
						}
						if (local49.anInt4398 != 64) {
							Static361.method5178(arg3, arg6, arg7, local49.anInt4398);
						}
					} else {
						@Pc(1892) Class19_Sub1_Sub1 local1892;
						if (arg2 == 4) {
							if (local259) {
								@Pc(1880) Class19_Sub1_Sub1_Sub1 local1880 = new Class19_Sub1_Sub1_Sub1(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, 0, 0, arg2, arg9);
								if (local1880.method9383()) {
									local1880.method9382(arg8);
								}
								local1892 = local1880;
							} else {
								local1892 = new Class19_Sub1_Sub1_Sub2(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, 0, 0, arg2, arg9, arg0);
							}
							Static573.method7944(arg3, arg6, arg7, local1892, (Class19_Sub1_Sub1) null);
						} else {
							@Pc(1926) int local1926;
							@Pc(1932) Interface19 local1932;
							@Pc(1971) Class19_Sub1_Sub1_Sub1 local1971;
							if (arg2 == 5) {
								local1926 = 65;
								local1932 = (Interface19) Static32.method476(arg3, arg6, arg7);
								if (local1932 != null) {
									local1926 = Static70.aClass323_1.method7792(local1932.method9384()).anInt4398 + 1;
								}
								if (local259) {
									local1971 = new Class19_Sub1_Sub1_Sub1(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, local1926 * Static155.anIntArray137[arg9], local1926 * Static106.anIntArray98[arg9], arg2, arg9);
									local1892 = local1971;
									if (local1971.method9383()) {
										local1971.method9382(arg8);
									}
								} else {
									local1892 = new Class19_Sub1_Sub1_Sub2(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, Static155.anIntArray137[arg9] * local1926, Static106.anIntArray98[arg9] * local1926, arg2, arg9, arg0);
								}
								Static573.method7944(arg3, arg6, arg7, local1892, (Class19_Sub1_Sub1) null);
							} else if (arg2 == 6) {
								local1926 = 33;
								local1932 = (Interface19) Static32.method476(arg3, arg6, arg7);
								if (local1932 != null) {
									local1926 = Static70.aClass323_1.method7792(local1932.method9384()).anInt4398 / 2 + 1;
								}
								if (local259) {
									local1971 = new Class19_Sub1_Sub1_Sub1(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, local1926 * Static155.anIntArray137[arg9], Static106.anIntArray98[arg9] * local1926, arg2, arg9 + 4);
									if (local1971.method9383()) {
										local1971.method9382(arg8);
									}
									local1892 = local1971;
								} else {
									local1892 = new Class19_Sub1_Sub1_Sub2(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, Static245.anIntArray375[arg9] * local1926, local1926 * Static624.anIntArray579[arg9], arg2, arg9 + 4, arg0);
								}
								Static573.method7944(arg3, arg6, arg7, local1892, (Class19_Sub1_Sub1) null);
							} else if (arg2 == 7) {
								local1926 = arg9 + 2 & 0x3;
								if (local259) {
									@Pc(2159) Class19_Sub1_Sub1_Sub1 local2159 = new Class19_Sub1_Sub1_Sub1(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, 0, 0, arg2, local1926 + 4);
									if (local2159.method9383()) {
										local2159.method9382(arg8);
									}
									local1892 = local2159;
								} else {
									local1892 = new Class19_Sub1_Sub1_Sub2(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, 0, 0, arg2, local1926 + 4, arg0);
								}
								Static573.method7944(arg3, arg6, arg7, local1892, (Class19_Sub1_Sub1) null);
							} else if (arg2 == 8) {
								local404 = arg9 + 2 & 0x3;
								local508 = 33;
								@Pc(2219) Interface19 local2219 = (Interface19) Static32.method476(arg3, arg6, arg7);
								if (local2219 != null) {
									local508 = Static70.aClass323_1.method7792(local2219.method9384()).anInt4398 / 2 + 1;
								}
								@Pc(2263) Class19_Sub1_Sub1 local2263;
								@Pc(2285) Class19_Sub1_Sub1 local2285;
								if (local259) {
									local2263 = new Class19_Sub1_Sub1_Sub1(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, local508 * Static245.anIntArray375[arg9], Static624.anIntArray579[arg9] * local508, arg2, arg9 + 4);
									local2285 = new Class19_Sub1_Sub1_Sub1(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, 0, 0, arg2, local404 + 4);
									if (local2263.method9383()) {
										local2263.method9382(arg8);
									}
									if (local2285.method9383()) {
										local2285.method9382(arg8);
									}
								} else {
									local2263 = new Class19_Sub1_Sub1_Sub2(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, Static245.anIntArray375[arg9] * local508, Static624.anIntArray579[arg9] * local508, arg2, arg9 + 4, arg0);
									local2285 = new Class19_Sub1_Sub1_Sub2(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, 0, 0, arg2, local404 + 4, arg0);
								}
								Static573.method7944(arg3, arg6, arg7, local2263, local2285);
							}
						}
					}
				}
			}
		} else if (Static713.aClass3_Sub55_31.aClass15_Sub29_1.method9292() != 0 || local49.anInt4425 != 0 || local49.anInt4411 == 1 || local49.aBoolean382) {
			@Pc(334) Class19_Sub1_Sub5 local334;
			if (local259) {
				@Pc(351) Class19_Sub1_Sub5_Sub1 local351 = new Class19_Sub1_Sub5_Sub1(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg9, local215);
				local334 = local351;
				if (local351.method9383()) {
					local351.method9382(arg8);
				}
			} else {
				local334 = new Class19_Sub1_Sub5_Sub2(arg8, local49, arg3, arg4, local190, local181, local198, super.aBoolean291, arg9, arg0);
			}
			Static343.method5024(arg3, arg6, arg7, local334);
			if (local49.anInt4411 == 1 && arg5 != null) {
				arg5.method8499(arg7, arg6);
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ha;IZ)V")
	public void method3082(@OriginalArg(0) Class67 arg0, @OriginalArg(2) boolean arg1) {
		Static633.method2952();
		if (!arg1) {
			@Pc(31) int local31;
			@Pc(35) int local35;
			if (super.anInt3589 > 1) {
				for (local31 = 0; local31 < super.anInt3577; local31++) {
					for (local35 = 0; local35 < super.anInt3582; local35++) {
						if ((Static6.aByteArrayArrayArray1[1][local31][local35] & 0x2) == 2) {
							Static251.method3929(local31, local35);
						}
					}
				}
			}
			for (local31 = 0; local31 < super.anInt3589; local31++) {
				for (local35 = 0; local35 <= super.anInt3582; local35++) {
					for (@Pc(85) int local85 = 0; super.anInt3577 >= local85; local85++) {
						if ((super.aByteArrayArrayArray11[local31][local85][local35] & 0x4) != 0) {
							@Pc(102) int local102 = local85;
							@Pc(104) int local104 = local85;
							@Pc(106) int local106 = local35;
							@Pc(108) int local108 = local35;
							while (local106 > 0 && (super.aByteArrayArrayArray11[local31][local85][local106 - 1] & 0x4) != 0 && local35 - local106 < 10) {
								local106--;
							}
							while (super.anInt3582 > local108 && (super.aByteArrayArrayArray11[local31][local85][local108 + 1] & 0x4) != 0 && local108 - local106 < 10) {
								local108++;
							}
							@Pc(190) int local190;
							label111: while (local102 > 0 && local85 - local102 < 10) {
								for (local190 = local106; local190 <= local108; local190++) {
									if ((super.aByteArrayArrayArray11[local31][local102 - 1][local190] & 0x4) == 0) {
										break label111;
									}
								}
								local102--;
							}
							label98: while (local104 < super.anInt3577 && local104 - local102 < 10) {
								for (local190 = local106; local190 <= local108; local190++) {
									if ((super.aByteArrayArrayArray11[local31][local104 + 1][local190] & 0x4) == 0) {
										break label98;
									}
								}
								local104++;
							}
							if ((local104 + 1 - local102) * (local108 + 1 - local106) >= 4) {
								local190 = super.anIntArrayArrayArray4[local31][local102][local106];
								Static63.method795((local108 << 9) + 512, local31, local106 << 9, local190, local190, local102 << 9, (local104 << 9) + 512);
								for (@Pc(344) int local344 = local102; local344 <= local104; local344++) {
									for (@Pc(348) int local348 = local106; local348 <= local108; local348++) {
										super.aByteArrayArrayArray11[local31][local344][local348] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static361.method5175();
		}
		super.aByteArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(IIIII)Lclient!pe;")
	public Interface19 method3083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Interface19 local13 = null;
		if (arg1 == 0) {
			local13 = (Interface19) Static32.method476(arg2, arg3, arg0);
		}
		if (arg1 == 1) {
			local13 = (Interface19) Static117.method2043(arg2, arg3, arg0);
		}
		if (arg1 == 2) {
			local13 = (Interface19) Static89.method1199(arg2, arg3, arg0, Static207.aClass11 == null ? (Static207.aClass11 = a("pe")) : Static207.aClass11);
		}
		if (arg1 == 3) {
			local13 = (Interface19) Static724.method9433(arg2, arg3, arg0);
		}
		return local13;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ha;IILclient!rba;I)V")
	public void method3084(@OriginalArg(0) Class67 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub28 arg2, @OriginalArg(4) int arg3) {
		if (super.aBoolean291) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(14) Class28 local14 = null;
		while (true) {
			@Pc(19) int local19;
			@Pc(54) int local54;
			@Pc(299) int local299;
			@Pc(303) int local303;
			@Pc(58) int local58;
			while (arg2.aByteArray50.length > arg2.anInt6241) {
				local19 = arg2.method5322(-44);
				if (local19 != 0) {
					@Pc(115) int local115;
					@Pc(119) int local119;
					@Pc(106) int local106;
					if (local19 == 1) {
						local54 = arg2.method5322(-29);
						if (local54 > 0) {
							for (local58 = 0; local58 < local54; local58++) {
								@Pc(67) Class246 local67 = new Class246(arg0, arg2, 2);
								if (local67.anInt7226 == 31) {
									@Pc(78) Class82 local78 = Static605.aClass122_1.method2901(arg2.method5272());
									local67.method6062(local78.anInt2425, local78.anInt2423, local78.anInt2429, local78.anInt2424);
								}
								if (arg0.method7634() > 0) {
									@Pc(98) Class3_Sub16 local98 = local67.aClass3_Sub16_3;
									local106 = (arg1 << 9) + local98.method6323();
									local115 = local98.method6320() + (arg3 << 9);
									local119 = local106 >> 9;
									@Pc(123) int local123 = local115 >> 9;
									if (local119 >= 0 && local123 >= 0 && super.anInt3577 > local119 && local123 < super.anInt3582) {
										local98.method6327(local115, super.anIntArrayArrayArray4[local67.anInt7230][local119][local123] - local98.method6322(), local106);
										Static214.method3436(local67);
									}
								}
							}
						}
					} else if (local19 == 2) {
						if (local14 == null) {
							local14 = new Class28();
						}
						local14.method635(arg2);
					} else if (local19 == 128) {
						if (local14 == null) {
							local14 = new Class28();
						}
						local14.method641(arg2);
					} else if (local19 == 129) {
						if (super.aByteArrayArrayArray12 == null) {
							super.aByteArrayArrayArray12 = new byte[4][][];
						}
						for (local54 = 0; local54 < 4; local54++) {
							@Pc(249) byte local249 = arg2.method5288();
							if (local249 == 0 && super.aByteArrayArrayArray12[local54] != null) {
								local299 = arg1;
								local303 = arg1 + 64;
								local106 = arg3;
								local115 = arg3 + 64;
								if (arg3 < 0) {
									local106 = 0;
								} else if (arg3 >= super.anInt3582) {
									local106 = super.anInt3582;
								}
								if (arg1 < 0) {
									local299 = 0;
								} else if (arg1 >= super.anInt3577) {
									local299 = super.anInt3577;
								}
								if (local303 < 0) {
									local303 = 0;
								} else if (local303 >= super.anInt3577) {
									local303 = super.anInt3577;
								}
								if (local115 < 0) {
									local115 = 0;
								} else if (super.anInt3582 <= local115) {
									local115 = super.anInt3582;
								}
								while (local303 > local299) {
									while (local115 > local106) {
										super.aByteArrayArrayArray12[local54][local299][local106] = 0;
										local106++;
									}
									local299++;
								}
							} else if (local249 == 1) {
								if (super.aByteArrayArrayArray12[local54] == null) {
									super.aByteArrayArrayArray12[local54] = new byte[super.anInt3577 + 1][super.anInt3582 + 1];
								}
								for (local299 = 0; local299 < 64; local299 += 4) {
									for (local303 = 0; local303 < 64; local303 += 4) {
										@Pc(456) byte local456 = arg2.method5288();
										for (local115 = arg1 + local299; local115 < local299 + arg1 + 4; local115++) {
											for (local119 = local303 + arg3; local119 < arg3 + local303 + 4; local119++) {
												if (local115 >= 0 && super.anInt3577 > local115 && local119 >= 0 && local119 < super.anInt3582) {
													super.aByteArrayArrayArray12[local54][local115][local119] = local456;
												}
											}
										}
									}
								}
							} else if (local249 == 2) {
								if (super.aByteArrayArrayArray12[local54] == null) {
									super.aByteArrayArrayArray12[local54] = new byte[super.anInt3577 + 1][super.anInt3582 + 1];
								}
								if (local54 > 0) {
									local299 = arg1;
									local303 = arg1 + 64;
									local106 = arg3;
									if (arg1 < 0) {
										local299 = 0;
									} else if (arg1 >= super.anInt3577) {
										local299 = super.anInt3577;
									}
									if (local303 < 0) {
										local303 = 0;
									} else if (local303 >= super.anInt3577) {
										local303 = super.anInt3577;
									}
									if (arg3 < 0) {
										local106 = 0;
									} else if (arg3 >= super.anInt3582) {
										local106 = super.anInt3582;
									}
									local115 = arg3 + 64;
									if (local115 < 0) {
										local115 = 0;
									} else if (super.anInt3582 <= local115) {
										local115 = super.anInt3582;
									}
									while (local299 < local303) {
										while (local106 < local115) {
											super.aByteArrayArrayArray12[local54][local299][local106] = super.aByteArrayArrayArray12[local54 - 1][local299][local106];
											local106++;
										}
										local299++;
									}
								}
							}
						}
						local12 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local14 == null) {
					local14 = new Class28(arg2);
				} else {
					local14.method639(arg2);
				}
			}
			if (local14 != null) {
				for (local19 = 0; local19 < 8; local19++) {
					for (local54 = 0; local54 < 8; local54++) {
						local58 = (arg1 >> 3) + local19;
						local299 = local54 + (arg3 >> 3);
						if (local58 >= 0 && local58 < super.anInt3577 >> 3 && local299 >= 0 && super.anInt3582 >> 3 > local299) {
							Static230.method3623(local58, local299, local14);
						}
					}
				}
			}
			if (!local12 && super.aByteArrayArrayArray12 != null) {
				for (local19 = 0; local19 < 4; local19++) {
					if (super.aByteArrayArrayArray12[local19] != null) {
						for (local54 = 0; local54 < 16; local54++) {
							for (local58 = 0; local58 < 16; local58++) {
								local299 = local54 + (arg1 >> 2);
								local303 = (arg3 >> 2) + local58;
								if (local299 >= 0 && local299 < 26 && local303 >= 0 && local303 < 26) {
									super.aByteArrayArrayArray12[local19][local299][local303] = 0;
								}
							}
						}
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIILclient!ha;IIII[Lclient!tq;[BI)V")
	public void method3085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class67 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class360[] arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class3_Sub28 local10 = new Class3_Sub28(arg8);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local10.method5277();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local10.method5331();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(54) int local54 = local35 & 0x3F;
				@Pc(60) int local60 = local35 >> 6 & 0x3F;
				@Pc(64) int local64 = local35 >> 12;
				@Pc(68) int local68 = local10.method5322(-20);
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				if (local64 == arg5 && local60 >= arg9 && arg9 + 8 > local60 && local54 >= arg2 && arg2 + 8 > local54) {
					@Pc(118) Class144 local118 = Static70.aClass323_1.method7792(local20);
					@Pc(136) int local136 = arg6 + Static596.method8209(arg0, local118.anInt4410, local118.anInt4444, local60 & 0x7, local76, local54 & 0x7);
					@Pc(153) int local153 = Static160.method2556(arg0, local76, local118.anInt4444, local118.anInt4410, local54 & 0x7, local60 & 0x7) + arg4;
					if (local136 > 0 && local153 > 0 && super.anInt3577 - 1 > local136 && local153 < super.anInt3582 - 1) {
						@Pc(174) Class360 local174 = null;
						if (!super.aBoolean291) {
							@Pc(179) int local179 = arg1;
							if ((Static6.aByteArrayArrayArray1[1][local136][local153] & 0x2) == 2) {
								local179 = arg1 - 1;
							}
							if (local179 >= 0) {
								local174 = arg7[local179];
							}
						}
						this.method3081(-1, local20, local72, arg1, arg1, local174, local136, local153, arg3, local76 + arg0 & 0x3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II[BLclient!ha;[Lclient!tq;B)V")
	public void method3086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class67 arg3, @OriginalArg(4) Class360[] arg4) {
		@Pc(18) Class3_Sub28 local18 = new Class3_Sub28(arg2);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method5277();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local18.method5331();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(51) int local51 = local35 & 0x3F;
				@Pc(57) int local57 = local35 >> 6 & 0x3F;
				@Pc(61) int local61 = local35 >> 12;
				@Pc(65) int local65 = local18.method5322(-119);
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				@Pc(78) int local78 = local57 + arg0;
				@Pc(83) int local83 = local51 + arg1;
				if (local78 > 0 && local83 > 0 && local78 < super.anInt3577 - 1 && super.anInt3582 - 1 > local83) {
					@Pc(110) Class360 local110 = null;
					if (!super.aBoolean291) {
						@Pc(115) int local115 = local61;
						if ((Static6.aByteArrayArrayArray1[1][local78][local83] & 0x2) == 2) {
							local115 = local61 - 1;
						}
						if (local115 >= 0) {
							local110 = arg4[local115];
						}
					}
					this.method3081(-1, local20, local69, local61, local61, local110, local78, local83, arg3, local73);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!ha;IIIILclient!tq;)V")
	public void method3087(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class360 arg5) {
		@Pc(11) Interface19 local11 = this.method3083(arg3, arg4, arg0, arg2);
		if (local11 == null) {
			return;
		}
		@Pc(28) Class144 local28 = Static70.aClass323_1.method7792(local11.method9384());
		@Pc(32) int local32 = local11.method9381();
		@Pc(36) int local36 = local11.method9385();
		if (local28.method3639()) {
			Static564.method7850(arg0, arg3, arg2, local28);
		}
		if (local11.method9383()) {
			local11.method9380(arg1);
		}
		if (arg4 != 0) {
			if (arg4 == 1) {
				Static552.method7778(arg0, arg2, arg3);
				return;
			}
			if (arg4 == 2) {
				Static593.method8154(arg0, arg2, arg3, Static207.aClass11 == null ? (Static207.aClass11 = a("pe")) : Static207.aClass11);
				if (local28.anInt4411 != 0 && super.anInt3577 > arg2 + local28.anInt4444 && super.anInt3582 > arg3 + local28.anInt4444 && arg2 + local28.anInt4410 < super.anInt3577 && super.anInt3582 > arg3 + local28.anInt4410) {
					arg5.method8491(!local28.aBoolean376, local28.anInt4410, arg3, arg2, local36, local28.aBoolean374, local28.anInt4444);
				}
				if (local32 != 9) {
					return;
				}
				if ((local36 & 0x1) != 0) {
					Static198.method2979(arg3, 16, arg2, arg0);
					return;
				}
				Static198.method2979(arg3, 8, arg2, arg0);
			} else if (arg4 == 3) {
				Static545.method5921(arg0, arg2, arg3);
				if (local28.anInt4411 == 1) {
					arg5.method8492(arg3, arg2);
					return;
				}
			}
			return;
		}
		Static127.method2132(arg0, arg2, arg3);
		if (local28.anInt4411 != 0) {
			arg5.method8489(arg3, local32, !local28.aBoolean376, local28.aBoolean374, arg2, local36);
		}
		if (local28.anInt4431 != 1) {
			return;
		}
		if (local36 == 0) {
			Static198.method2979(arg3, 1, arg2, arg0);
			return;
		}
		if (local36 == 1) {
			Static198.method2979(arg3 + 1, 2, arg2, arg0);
			return;
		}
		if (local36 == 2) {
			Static198.method2979(arg3, 1, arg2 + 1, arg0);
		} else if (local36 == 3) {
			Static198.method2979(arg3, 2, arg2, arg0);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILclient!rba;Lclient!ha;IIIIII)V")
	public void method3088(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub28 arg1, @OriginalArg(3) Class67 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (super.aBoolean291) {
			return;
		}
		@Pc(20) boolean local20 = false;
		@Pc(22) Class28 local22 = null;
		@Pc(28) int local28 = (arg3 & 0x7) * 8;
		@Pc(34) int local34 = (arg5 & 0x7) * 8;
		while (true) {
			@Pc(50) int local50;
			@Pc(108) int local108;
			@Pc(174) int local174;
			@Pc(196) int local196;
			@Pc(57) int local57;
			@Pc(102) int local102;
			label235: do {
				while (true) {
					@Pc(39) int local39;
					@Pc(350) int local350;
					while (arg1.aByteArray50.length > arg1.anInt6241) {
						local39 = arg1.method5322(-101);
						if (local39 != 0) {
							if (local39 == 1) {
								local50 = arg1.method5322(-65);
								continue label235;
							}
							if (local39 == 2) {
								if (local22 == null) {
									local22 = new Class28();
								}
								local22.method635(arg1);
							} else if (local39 == 128) {
								if (local22 == null) {
									local22 = new Class28();
								}
								local22.method641(arg1);
							} else if (local39 == 129) {
								if (super.aByteArrayArrayArray12 == null) {
									super.aByteArrayArrayArray12 = new byte[4][][];
								}
								for (local50 = 0; local50 < 4; local50++) {
									@Pc(309) byte local309 = arg1.method5288();
									@Pc(354) int local354;
									if (local309 == 0 && super.aByteArrayArrayArray12[arg8] != null) {
										if (arg0 >= local50) {
											local350 = arg7;
											local354 = arg7 + 7;
											local102 = arg6;
											if (local354 < 0) {
												local354 = 0;
											} else if (local354 >= super.anInt3577) {
												local354 = super.anInt3577;
											}
											local108 = arg6 + 7;
											if (arg7 < 0) {
												local350 = 0;
											} else if (super.anInt3577 <= arg7) {
												local350 = super.anInt3577;
											}
											if (arg6 < 0) {
												local102 = 0;
											} else if (arg6 >= super.anInt3582) {
												local102 = super.anInt3582;
											}
											if (local108 < 0) {
												local108 = 0;
											} else if (local108 >= super.anInt3582) {
												local108 = super.anInt3582;
											}
											while (local354 > local350) {
												while (local102 < local108) {
													super.aByteArrayArrayArray12[arg8][local350][local102] = 0;
													local102++;
												}
												local350++;
											}
										}
									} else if (local309 == 1) {
										if (super.aByteArrayArrayArray12[arg8] == null) {
											super.aByteArrayArrayArray12[arg8] = new byte[super.anInt3577 + 1][super.anInt3582 + 1];
										}
										for (local350 = 0; local350 < 64; local350 += 4) {
											for (local354 = 0; local354 < 64; local354 += 4) {
												@Pc(360) byte local360 = arg1.method5288();
												if (local50 <= arg0) {
													for (local108 = local350; local108 < local350 + 4; local108++) {
														for (local174 = local354; local174 < local354 + 4; local174++) {
															if (local108 >= local28 && local108 < local28 + 8 && local34 <= local174 && local174 < local34 + 8) {
																local196 = Static497.method7170(local108 & 0x7, local174 & 0x7, arg4) + arg7;
																@Pc(429) int local429 = Static659.method8820(local108 & 0x7, local174 & 0x7, arg4) + arg6;
																if (local196 >= 0 && local196 < super.anInt3577 && local429 >= 0 && super.anInt3582 > local429) {
																	super.aByteArrayArrayArray12[arg8][local196][local429] = local360;
																	local20 = true;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else {
								throw new IllegalStateException("");
							}
						} else if (local22 == null) {
							local22 = new Class28(arg1);
						} else {
							local22.method639(arg1);
						}
					}
					if (local22 != null) {
						Static230.method3623(arg7 >> 3, arg6 >> 3, local22);
					}
					if (!local20 && super.aByteArrayArrayArray12 != null && super.aByteArrayArrayArray12[arg8] != null) {
						local39 = arg7 + 7;
						local50 = arg6 + 7;
						for (local57 = arg7; local57 < local39; local57++) {
							for (local350 = arg6; local350 < local50; local350++) {
								super.aByteArrayArrayArray12[arg8][local57][local350] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local50 <= 0);
			for (local57 = 0; local57 < local50; local57++) {
				@Pc(66) Class246 local66 = new Class246(arg2, arg1, 2);
				if (local66.anInt7226 == 31) {
					@Pc(77) Class82 local77 = Static605.aClass122_1.method2901(arg1.method5272());
					local66.method6062(local77.anInt2425, local77.anInt2423, local77.anInt2429, local77.anInt2424);
				}
				if (arg2.method7634() > 0) {
					@Pc(96) Class3_Sub16 local96 = local66.aClass3_Sub16_3;
					local102 = local96.method6323() >> 9;
					local108 = local96.method6320() >> 9;
					if (arg0 == local66.anInt7230 && local28 <= local102 && local102 < local28 + 8 && local34 <= local108 && local108 < local34 + 8) {
						local174 = Static415.method6180(local96.method6320() & 0xFFF, arg4, local96.method6323() & 0xFFF) + (arg7 << 9);
						local102 = local174 >> 9;
						local196 = (arg6 << 9) + Static551.method7772(arg4, local96.method6320() & 0xFFF, local96.method6323() & 0xFFF);
						local108 = local196 >> 9;
						if (local102 >= 0 && local108 >= 0 && super.anInt3577 > local102 && local108 < super.anInt3582) {
							local96.method6327(local196, super.anIntArrayArrayArray4[arg0][local102][local108] - local96.method6322(), local174);
							Static214.method3436(local66);
						}
					}
				}
			}
		}
	}
}
