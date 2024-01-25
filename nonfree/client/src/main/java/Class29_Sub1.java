import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!qv", name = "O", descriptor = "I")
	public int anInt8901 = 99;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IIIZ)V")
	public Class29_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static424.aClass266_4, Static81.aClass359_2);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIBIILclient!kn;ILclient!ha;III)V")
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class200 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class101 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (Static230.aClass2_Sub54_15.aClass4_Sub9_1.method2556() == 0 && !Static586.method8860(arg5, Static578.anInt6963, arg1, arg3)) {
			return;
		}
		if (this.anInt8901 > arg2) {
			this.anInt8901 = arg2;
		}
		@Pc(34) Class331 local34 = Static251.aClass328_1.method8261(arg8);
		if (Static230.aClass2_Sub54_15.aClass4_Sub21_1.method6610() == 0 && local34.aBoolean692) {
			return;
		}
		@Pc(56) int local56;
		@Pc(59) int local59;
		if (arg9 == 1 || arg9 == 3) {
			local56 = local34.anInt9425;
			local59 = local34.anInt9454;
		} else {
			local59 = local34.anInt9425;
			local56 = local34.anInt9454;
		}
		@Pc(92) int local92;
		@Pc(85) int local85;
		if (super.anInt8880 >= local56 + arg5) {
			local85 = arg5 + (local56 + 1 >> 1);
			local92 = arg5 + (local56 >> 1);
		} else {
			local92 = arg5;
			local85 = arg5 + 1;
		}
		@Pc(108) int local108;
		@Pc(112) int local112;
		if (super.anInt8889 < local59 + arg1) {
			local108 = arg1;
			local112 = arg1 + 1;
		} else {
			local108 = arg1 + (local59 >> 1);
			local112 = (local59 + 1 >> 1) + arg1;
		}
		@Pc(133) Class18 local133 = Static245.aClass18Array14[arg3];
		@Pc(161) int local161 = local133.method8537(local108, local92) + local133.method8537(local108, local85) + local133.method8537(local112, local92) + local133.method8537(local112, local85) >> 2;
		@Pc(170) int local170 = (arg5 << 9) + (local56 << 8);
		@Pc(178) int local178 = (arg1 << 9) + (local59 << 8);
		@Pc(190) boolean local190 = Static326.aBoolean439 && !super.aBoolean642 && local34.aBoolean688;
		if (local34.method8303()) {
			Static225.method4155((Class15_Sub3_Sub3_Sub1_Sub2) null, (Class15_Sub3_Sub3_Sub1_Sub1) null, arg9, arg1, local34, arg2, arg5);
		}
		@Pc(227) boolean local227 = arg7 == -1 && local34.anInt9432 == -1 && local34.anIntArray484 == null && local34.anIntArray486 == null && !local34.aBoolean695 && !local34.aBoolean694;
		if (Static667.aBoolean773 && (Static264.method4551(arg0) && local34.anInt9459 != 1 || !(!Static660.method9145(arg0) || local34.anInt9459 != 0))) {
			return;
		}
		if (arg0 != 22) {
			@Pc(384) Class15_Sub3_Sub3 local384;
			@Pc(346) Class15_Sub3_Sub3_Sub4 local346;
			@Pc(382) int local382;
			@Pc(449) int local449;
			@Pc(445) int local445;
			if (arg0 == 10 || arg0 == 11) {
				local346 = null;
				if (local227) {
					@Pc(378) Class15_Sub3_Sub3_Sub4 local378 = new Class15_Sub3_Sub3_Sub4(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg5, arg5 + local56 - 1, arg1, arg1 + local59 - 1, arg0, arg9, local190);
					local382 = local378.method4999();
					local384 = local378;
					local346 = local378;
				} else {
					local382 = 15;
					local384 = new Class15_Sub3_Sub3_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg5, arg5 + local56 - 1, arg1, arg1 + local59 - 1, arg0, arg9, arg7);
				}
				if (Static69.method1291(local384, false)) {
					if (local346 != null && local346.method9448()) {
						local346.method9450(arg6);
					}
					if (local34.aBoolean687 && Static326.aBoolean439) {
						if (local382 > 30) {
							local382 = 30;
						}
						for (local445 = 0; local445 <= local56; local445++) {
							for (local449 = 0; local449 <= local59; local449++) {
								local133.ka(local445 + arg5, local449 + arg1, local382);
							}
						}
					}
				}
				if (local34.anInt9403 != 0 && arg4 != null) {
					arg4.method5295(!local34.aBoolean693, arg1, local34.aBoolean696, local56, local59, arg5);
				}
			} else if (arg0 >= 12 && arg0 <= 17 || arg0 >= 18 && arg0 <= 21) {
				if (local227) {
					local346 = new Class15_Sub3_Sub3_Sub4(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg5, local56 + arg5 - 1, arg1, local59 + arg1 - 1, arg0, arg9, local190);
					local384 = local346;
					if (local346.method9448()) {
						local346.method9450(arg6);
					}
				} else {
					local384 = new Class15_Sub3_Sub3_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg5, local56 + arg5 - 1, arg1, local59 + arg1 - 1, arg0, arg9, arg7);
				}
				Static69.method1291(local384, false);
				if (Static326.aBoolean439 && !super.aBoolean642 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg2 > 0 && local34.anInt9459 != 0) {
					super.aByteArrayArrayArray14[arg2][arg5][arg1] = (byte) (super.aByteArrayArrayArray14[arg2][arg5][arg1] | 0x4);
				}
				if (local34.anInt9403 != 0 && arg4 != null) {
					arg4.method5295(!local34.aBoolean693, arg1, local34.aBoolean696, local56, local59, arg5);
				}
			} else {
				@Pc(689) Class15_Sub3_Sub4 local689;
				if (arg0 == 0) {
					@Pc(663) int local663 = local34.anInt9459;
					if (Static342.aBoolean478 && local34.anInt9459 == -1) {
						local663 = 1;
					}
					if (local227) {
						@Pc(707) Class15_Sub3_Sub4_Sub2 local707 = new Class15_Sub3_Sub4_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg0, arg9, local190);
						local689 = local707;
						if (local707.method9448()) {
							local707.method9450(arg6);
						}
					} else {
						local689 = new Class15_Sub3_Sub4_Sub1(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg0, arg9, arg7);
					}
					Static175.method3432(arg2, arg5, arg1, local689, (Class15_Sub3_Sub4) null);
					if (arg9 == 0) {
						if (Static326.aBoolean439 && local34.aBoolean687) {
							local133.ka(arg5, arg1, 50);
							local133.ka(arg5, arg1 + 1, 50);
						}
						if (local663 == 1 && !super.aBoolean642) {
							Static139.method2440(arg2, arg1, local34.anInt9440, 1, arg5, local34.anInt9414);
						}
					} else if (arg9 == 1) {
						if (Static326.aBoolean439 && local34.aBoolean687) {
							local133.ka(arg5, arg1 + 1, 50);
							local133.ka(arg5 + 1, arg1 + 1, 50);
						}
						if (local663 == 1 && !super.aBoolean642) {
							Static139.method2440(arg2, arg1 + 1, -local34.anInt9440, 2, arg5, local34.anInt9414);
						}
					} else if (arg9 == 2) {
						if (Static326.aBoolean439 && local34.aBoolean687) {
							local133.ka(arg5 + 1, arg1, 50);
							local133.ka(arg5 + 1, arg1 + 1, 50);
						}
						if (local663 == 1 && !super.aBoolean642) {
							Static139.method2440(arg2, arg1, -local34.anInt9440, 1, arg5 + 1, local34.anInt9414);
						}
					} else if (arg9 == 3) {
						if (Static326.aBoolean439 && local34.aBoolean687) {
							local133.ka(arg5, arg1, 50);
							local133.ka(arg5 + 1, arg1, 50);
						}
						if (local663 == 1 && !super.aBoolean642) {
							Static139.method2440(arg2, arg1, local34.anInt9440, 2, arg5, local34.anInt9414);
						}
					}
					if (local34.anInt9403 != 0 && arg4 != null) {
						arg4.method5285(!local34.aBoolean693, arg1, arg9, arg0, local34.aBoolean696, arg5);
					}
					if (local34.anInt9402 != 64) {
						Static208.method8089(arg2, arg5, arg1, local34.anInt9402);
					}
				} else {
					@Pc(944) Class15_Sub3_Sub4 local944;
					@Pc(942) Class15_Sub3_Sub4_Sub2 local942;
					if (arg0 == 1) {
						if (local227) {
							local942 = new Class15_Sub3_Sub4_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg0, arg9, local190);
							local944 = local942;
							if (local942.method9448()) {
								local942.method9450(arg6);
							}
						} else {
							local944 = new Class15_Sub3_Sub4_Sub1(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg0, arg9, arg7);
						}
						Static175.method3432(arg2, arg5, arg1, local944, (Class15_Sub3_Sub4) null);
						if (local34.aBoolean687 && Static326.aBoolean439) {
							if (arg9 == 0) {
								local133.ka(arg5, arg1 + 1, 50);
							} else if (arg9 == 1) {
								local133.ka(arg5 + 1, arg1 + 1, 50);
							} else if (arg9 == 2) {
								local133.ka(arg5 + 1, arg1, 50);
							} else if (arg9 == 3) {
								local133.ka(arg5, arg1, 50);
							}
						}
						if (local34.anInt9403 != 0 && arg4 != null) {
							arg4.method5285(!local34.aBoolean693, arg1, arg9, arg0, local34.aBoolean696, arg5);
						}
					} else if (arg0 == 2) {
						local382 = arg9 + 1 & 0x3;
						if (local227) {
							@Pc(1114) Class15_Sub3_Sub4_Sub2 local1114 = new Class15_Sub3_Sub4_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg0, arg9 + 4, local190);
							@Pc(1130) Class15_Sub3_Sub4_Sub2 local1130 = new Class15_Sub3_Sub4_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg0, local382, local190);
							if (local1114.method9448()) {
								local1114.method9450(arg6);
							}
							local944 = local1114;
							if (local1130.method9448()) {
								local1130.method9450(arg6);
							}
							local689 = local1130;
						} else {
							local944 = new Class15_Sub3_Sub4_Sub1(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg0, arg9 + 4, arg7);
							local689 = new Class15_Sub3_Sub4_Sub1(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg0, local382, arg7);
						}
						Static175.method3432(arg2, arg5, arg1, local944, local689);
						if ((local34.anInt9459 == 1 || Static342.aBoolean478 && local34.anInt9459 == -1) && !super.aBoolean642) {
							if (arg9 == 0) {
								Static139.method2440(arg2, arg1, local34.anInt9440, 1, arg5, local34.anInt9414);
								Static139.method2440(arg2, arg1 + 1, local34.anInt9440, 2, arg5, local34.anInt9414);
							} else if (arg9 == 1) {
								Static139.method2440(arg2, arg1, local34.anInt9440, 1, arg5 + 1, local34.anInt9414);
								Static139.method2440(arg2, arg1 + 1, local34.anInt9440, 2, arg5, local34.anInt9414);
							} else if (arg9 == 2) {
								Static139.method2440(arg2, arg1, local34.anInt9440, 1, arg5 + 1, local34.anInt9414);
								Static139.method2440(arg2, arg1, local34.anInt9440, 2, arg5, local34.anInt9414);
							} else if (arg9 == 3) {
								Static139.method2440(arg2, arg1, local34.anInt9440, 1, arg5, local34.anInt9414);
								Static139.method2440(arg2, arg1, local34.anInt9440, 2, arg5, local34.anInt9414);
							}
						}
						if (local34.anInt9403 != 0 && arg4 != null) {
							arg4.method5285(!local34.aBoolean693, arg1, arg9, arg0, local34.aBoolean696, arg5);
						}
						if (local34.anInt9402 != 64) {
							Static208.method8089(arg2, arg5, arg1, local34.anInt9402);
						}
					} else if (arg0 == 3) {
						if (local227) {
							local942 = new Class15_Sub3_Sub4_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg0, arg9, local190);
							local944 = local942;
							if (local942.method9448()) {
								local942.method9450(arg6);
							}
						} else {
							local944 = new Class15_Sub3_Sub4_Sub1(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg0, arg9, arg7);
						}
						Static175.method3432(arg2, arg5, arg1, local944, (Class15_Sub3_Sub4) null);
						if (local34.aBoolean687 && Static326.aBoolean439) {
							if (arg9 == 0) {
								local133.ka(arg5, arg1 + 1, 50);
							} else if (arg9 == 1) {
								local133.ka(arg5 + 1, arg1 - -1, 50);
							} else if (arg9 == 2) {
								local133.ka(arg5 + 1, arg1, 50);
							} else if (arg9 == 3) {
								local133.ka(arg5, arg1, 50);
							}
						}
						if (local34.anInt9403 != 0 && arg4 != null) {
							arg4.method5285(!local34.aBoolean693, arg1, arg9, arg0, local34.aBoolean696, arg5);
						}
					} else if (arg0 == 9) {
						if (local227) {
							local346 = new Class15_Sub3_Sub3_Sub4(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg5, arg5, arg1, arg1, arg0, arg9, local190);
							if (local346.method9448()) {
								local346.method9450(arg6);
							}
							local384 = local346;
						} else {
							local384 = new Class15_Sub3_Sub3_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg5, local56 + arg5 - 1, arg1, local59 + arg1 - 1, arg0, arg9, arg7);
						}
						Static69.method1291(local384, false);
						if (local34.anInt9459 == 1 && !super.aBoolean642) {
							@Pc(1532) byte local1532;
							if ((arg9 & 0x1) == 0) {
								local1532 = 8;
							} else {
								local1532 = 16;
							}
							Static139.method2440(arg2, arg1, 0, local1532, arg5, local34.anInt9414);
						}
						if (local34.anInt9403 != 0 && arg4 != null) {
							arg4.method5295(!local34.aBoolean693, arg1, local34.aBoolean696, local56, local59, arg5);
						}
						if (local34.anInt9402 != 64) {
							Static208.method8089(arg2, arg5, arg1, local34.anInt9402);
						}
					} else {
						@Pc(1613) Class15_Sub3_Sub1 local1613;
						if (arg0 == 4) {
							if (local227) {
								@Pc(1603) Class15_Sub3_Sub1_Sub1 local1603 = new Class15_Sub3_Sub1_Sub1(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, 0, 0, arg0, arg9);
								if (local1603.method9448()) {
									local1603.method9450(arg6);
								}
								local1613 = local1603;
							} else {
								local1613 = new Class15_Sub3_Sub1_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, 0, 0, arg0, arg9, arg7);
							}
							Static300.method8642(arg2, arg5, arg1, local1613, (Class15_Sub3_Sub1) null);
						} else {
							@Pc(1645) int local1645;
							@Pc(1651) Interface23 local1651;
							@Pc(1718) Class15_Sub3_Sub1_Sub1 local1718;
							if (arg0 == 5) {
								local1645 = 65;
								local1651 = (Interface23) Static584.method4102(arg2, arg5, arg1);
								if (local1651 != null) {
									local1645 = Static251.aClass328_1.method8261(local1651.method9451()).anInt9402 + 1;
								}
								if (local227) {
									local1718 = new Class15_Sub3_Sub1_Sub1(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, Static532.anIntArray478[arg9] * local1645, Static471.anIntArray432[arg9] * local1645, arg0, arg9);
									local1613 = local1718;
									if (local1718.method9448()) {
										local1718.method9450(arg6);
									}
								} else {
									local1613 = new Class15_Sub3_Sub1_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, Static532.anIntArray478[arg9] * local1645, local1645 * Static471.anIntArray432[arg9], arg0, arg9, arg7);
								}
								Static300.method8642(arg2, arg5, arg1, local1613, (Class15_Sub3_Sub1) null);
							} else if (arg0 == 6) {
								local1645 = 33;
								local1651 = (Interface23) Static584.method4102(arg2, arg5, arg1);
								if (local1651 != null) {
									local1645 = Static251.aClass328_1.method8261(local1651.method9451()).anInt9402 / 2 + 1;
								}
								if (local227) {
									local1718 = new Class15_Sub3_Sub1_Sub1(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, Static532.anIntArray478[arg9] * local1645, local1645 * Static471.anIntArray432[arg9], arg0, arg9 + 4);
									if (local1718.method9448()) {
										local1718.method9450(arg6);
									}
									local1613 = local1718;
								} else {
									local1613 = new Class15_Sub3_Sub1_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, local1645 * Static659.anIntArray592[arg9], Static231.anIntArray214[arg9] * local1645, arg0, arg9 + 4, arg7);
								}
								Static300.method8642(arg2, arg5, arg1, local1613, (Class15_Sub3_Sub1) null);
							} else if (arg0 == 7) {
								local382 = arg9 + 2 & 0x3;
								@Pc(1877) Class15_Sub3_Sub1 local1877;
								if (local227) {
									local1718 = new Class15_Sub3_Sub1_Sub1(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, 0, 0, arg0, local382 + 4);
									local1877 = local1718;
									if (local1718.method9448()) {
										local1718.method9450(arg6);
									}
								} else {
									local1877 = new Class15_Sub3_Sub1_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, 0, 0, arg0, local382 + 4, arg7);
								}
								Static300.method8642(arg2, arg5, arg1, local1877, (Class15_Sub3_Sub1) null);
							} else if (arg0 == 8) {
								local445 = arg9 + 2 & 0x3;
								local449 = 33;
								@Pc(1934) Interface23 local1934 = (Interface23) Static584.method4102(arg2, arg5, arg1);
								if (local1934 != null) {
									local449 = Static251.aClass328_1.method8261(local1934.method9451()).anInt9402 / 2 + 1;
								}
								@Pc(1978) Class15_Sub3_Sub1 local1978;
								@Pc(2000) Class15_Sub3_Sub1 local2000;
								if (local227) {
									local1978 = new Class15_Sub3_Sub1_Sub1(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, Static659.anIntArray592[arg9] * local449, Static231.anIntArray214[arg9] * local449, arg0, arg9 + 4);
									local2000 = new Class15_Sub3_Sub1_Sub1(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, 0, 0, arg0, local445 + 4);
									if (local1978.method9448()) {
										local1978.method9450(arg6);
									}
									if (local2000.method9448()) {
										local2000.method9450(arg6);
									}
								} else {
									local1978 = new Class15_Sub3_Sub1_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, Static659.anIntArray592[arg9] * local449, local449 * Static231.anIntArray214[arg9], arg0, arg9 + 4, arg7);
									local2000 = new Class15_Sub3_Sub1_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, 0, 0, arg0, local445 + 4, arg7);
								}
								Static300.method8642(arg2, arg5, arg1, local1978, local2000);
							}
						}
					}
				}
			}
		} else if (Static230.aClass2_Sub54_15.aClass4_Sub4_1.method925() != 0 || local34.lb != 0 || local34.anInt9403 == 1 || local34.aBoolean700) {
			@Pc(290) Class15_Sub3_Sub5 local290;
			if (local227) {
				@Pc(307) Class15_Sub3_Sub5_Sub2 local307 = new Class15_Sub3_Sub5_Sub2(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg9, local190);
				if (local307.method9448()) {
					local307.method9450(arg6);
				}
				local290 = local307;
			} else {
				local290 = new Class15_Sub3_Sub5_Sub1(arg6, local34, arg2, arg3, local170, local161, local178, super.aBoolean642, arg9, arg7);
			}
			Static309.method5063(arg2, arg5, arg1, local290);
			if (local34.anInt9403 == 1 && arg4 != null) {
				arg4.method5293(arg5, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(III[Lclient!kn;II[BZIILclient!ha;)V")
	public void method7861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class200[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class101 arg9) {
		@Pc(10) Class2_Sub8 local10 = new Class2_Sub8(arg6);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method5168();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method5173();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(65) int local65 = local10.method5203();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (arg8 == local61 && local57 >= arg2 && arg2 + 8 > local57 && arg4 <= local51 && local51 < arg4 + 8) {
					@Pc(109) Class331 local109 = Static251.aClass328_1.method8261(local17);
					@Pc(126) int local126 = Static58.method1115(local73, local51 & 0x7, local109.anInt9454, arg7, local109.anInt9425, local57 & 0x7) + arg0;
					@Pc(144) int local144 = arg1 + Static229.method4169(local51 & 0x7, local109.anInt9454, arg7, local73, local109.anInt9425, local57 & 0x7);
					if (local126 > 0 && local144 > 0 && super.anInt8880 - 1 > local126 && local144 < super.anInt8889 - 1) {
						@Pc(168) Class200 local168 = null;
						if (!super.aBoolean642) {
							@Pc(173) int local173 = arg5;
							if ((Static96.aByteArrayArrayArray10[1][local126][local144] & 0x2) == 2) {
								local173 = arg5 - 1;
							}
							if (local173 >= 0) {
								local168 = arg3[local173];
							}
						}
						this.method7859(local69, local144, arg5, arg5, local168, local126, arg9, -1, local17, arg7 + local73 & 0x3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!ol;BLclient!ha;II[I)V")
	public void method7862(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(2) Class101 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (super.aBoolean642) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class363 local13 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		while (true) {
			@Pc(24) int local24;
			@Pc(45) int local45;
			@Pc(282) int local282;
			@Pc(286) int local286;
			@Pc(52) int local52;
			while (arg0.lb.length > arg0.anInt5725) {
				local24 = arg0.method5203();
				if (local24 == 0) {
					local13 = new Class363(arg0);
				} else {
					@Pc(100) int local100;
					@Pc(108) int local108;
					@Pc(112) int local112;
					if (local24 == 1) {
						local45 = arg0.method5203();
						if (local45 > 0) {
							for (local52 = 0; local52 < local45; local52++) {
								@Pc(61) Class84 local61 = new Class84(arg1, arg0, 2);
								if (local61.anInt2425 == 31) {
									@Pc(74) Class44 local74 = Static294.aClass378_1.method9483(arg0.method5211());
									local61.method2247(local74.anInt1232, local74.anInt1237, local74.anInt1235, local74.anInt1236);
								}
								if (arg1.method8109() > 0) {
									@Pc(91) Class2_Sub13 local91 = local61.aClass2_Sub13_1;
									local100 = local91.method9411() + (arg3 << 9);
									local108 = (arg2 << 9) + local91.method9406();
									local112 = local100 >> 9;
									@Pc(116) int local116 = local108 >> 9;
									if (local112 >= 0 && local116 >= 0 && local112 < super.anInt8880 && super.anInt8889 > local116) {
										local91.method9412(local100, super.anIntArrayArrayArray14[local61.anInt2418][local112][local116] - local91.method9410(), local108);
										Static527.method8201(local61);
									}
								}
							}
						}
					} else if (local24 == 2) {
						if (local13 == null) {
							local13 = new Class363();
						}
						local13.method9219(arg0);
					} else if (local24 != 128) {
						if (local24 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray17 == null) {
							super.aByteArrayArrayArray17 = new byte[4][][];
						}
						local11 = true;
						for (local45 = 0; local45 < 4; local45++) {
							@Pc(252) byte local252 = arg0.method5175();
							if (local252 == 0 && super.aByteArrayArrayArray17[local45] != null) {
								local282 = arg3;
								local286 = arg3 + 64;
								local100 = arg2;
								if (arg2 < 0) {
									local100 = 0;
								} else if (super.anInt8889 <= arg2) {
									local100 = super.anInt8889;
								}
								if (arg3 < 0) {
									local282 = 0;
								} else if (arg3 >= super.anInt8880) {
									local282 = super.anInt8880;
								}
								local108 = arg2 + 64;
								if (local286 < 0) {
									local286 = 0;
								} else if (local286 >= super.anInt8880) {
									local286 = super.anInt8880;
								}
								if (local108 < 0) {
									local108 = 0;
								} else if (super.anInt8889 <= local108) {
									local108 = super.anInt8889;
								}
								while (local286 > local282) {
									while (local108 > local100) {
										super.aByteArrayArrayArray17[local45][local282][local100] = 0;
										local100++;
									}
									local282++;
								}
							} else if (local252 == 1) {
								if (super.aByteArrayArrayArray17[local45] == null) {
									super.aByteArrayArrayArray17[local45] = new byte[super.anInt8880 + 1][super.anInt8889 + 1];
								}
								for (local282 = 0; local282 < 64; local282 += 4) {
									for (local286 = 0; local286 < 64; local286 += 4) {
										@Pc(292) byte local292 = arg0.method5175();
										for (local108 = arg3 + local282; local108 < arg3 + local282 + 4; local108++) {
											for (local112 = arg2 + local286; local112 < local286 + arg2 + 4; local112++) {
												if (local108 >= 0 && super.anInt8880 > local108 && local112 >= 0 && local112 < super.anInt8889) {
													super.aByteArrayArrayArray17[local45][local108][local112] = local292;
												}
											}
										}
									}
								}
							} else if (local252 == 2) {
								if (super.aByteArrayArrayArray17[local45] == null) {
									super.aByteArrayArrayArray17[local45] = new byte[super.anInt8880 + 1][super.anInt8889 + 1];
								}
								if (local45 > 0) {
									local282 = arg3;
									local286 = arg3 + 64;
									local100 = arg2;
									if (arg3 < 0) {
										local282 = 0;
									} else if (arg3 >= super.anInt8880) {
										local282 = super.anInt8880;
									}
									if (arg2 < 0) {
										local100 = 0;
									} else if (super.anInt8889 <= arg2) {
										local100 = super.anInt8889;
									}
									local108 = arg2 + 64;
									if (local286 < 0) {
										local286 = 0;
									} else if (local286 >= super.anInt8880) {
										local286 = super.anInt8880;
									}
									if (local108 < 0) {
										local108 = 0;
									} else if (super.anInt8889 <= local108) {
										local108 = super.anInt8889;
									}
									while (local282 < local286) {
										while (local100 < local108) {
											super.aByteArrayArrayArray17[local45][local282][local100] = super.aByteArrayArrayArray17[local45 - 1][local282][local100];
											local100++;
										}
										local282++;
									}
								}
							}
						}
					} else if (arg4 == null) {
						arg0.anInt5725 += 10;
					} else {
						arg4[0] = arg0.method5211();
						arg4[1] = arg0.method5174();
						arg4[2] = arg0.method5174();
						arg4[3] = arg0.method5174();
						arg4[4] = arg0.method5211();
					}
				}
			}
			if (local13 != null) {
				for (local24 = 0; local24 < 8; local24++) {
					for (local45 = 0; local45 < 8; local45++) {
						local52 = local24 + (arg3 >> 3);
						local282 = local45 + (arg2 >> 3);
						if (local52 >= 0 && local52 < super.anInt8880 >> 3 && local282 >= 0 && local282 < super.anInt8889 >> 3) {
							Static260.method4512(local282, local13, local52);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray17 != null) {
				for (local24 = 0; local24 < 4; local24++) {
					if (super.aByteArrayArrayArray17[local24] != null) {
						for (local45 = 0; local45 < 16; local45++) {
							for (local52 = 0; local52 < 16; local52++) {
								local282 = (arg3 >> 2) + local45;
								local286 = local52 + (arg2 >> 2);
								if (local282 >= 0 && local282 < 26 && local286 >= 0 && local286 < 26) {
									super.aByteArrayArrayArray17[local24][local282][local286] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!ha;I[Lclient!kn;I[BI)V")
	public void method7863(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class200[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class2_Sub8 local10 = new Class2_Sub8(arg3);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method5168();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local10.method5173();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 & 0x3F;
				@Pc(56) int local56 = local31 >> 6 & 0x3F;
				@Pc(60) int local60 = local31 >> 12;
				@Pc(66) int local66 = local10.method5203();
				@Pc(70) int local70 = local66 >> 2;
				@Pc(74) int local74 = local66 & 0x3;
				@Pc(78) int local78 = arg4 + local56;
				@Pc(83) int local83 = local50 + arg1;
				if (local78 > 0 && local83 > 0 && local78 < super.anInt8880 - 1 && super.anInt8889 - 1 > local83) {
					@Pc(107) Class200 local107 = null;
					if (!super.aBoolean642) {
						@Pc(112) int local112 = local60;
						if ((Static96.aByteArrayArrayArray10[1][local78][local83] & 0x2) == 2) {
							local112 = local60 - 1;
						}
						if (local112 >= 0) {
							local107 = arg2[local112];
						}
					}
					this.method7859(local70, local83, local60, local60, local107, local78, arg0, -1, local16, local74);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!ha;ZI)V")
	public void method7864(@OriginalArg(0) Class101 arg0, @OriginalArg(1) boolean arg1) {
		Static597.method8973();
		if (!arg1) {
			@Pc(14) int local14;
			@Pc(18) int local18;
			if (super.anInt8876 > 1) {
				for (local14 = 0; local14 < super.anInt8880; local14++) {
					for (local18 = 0; local18 < super.anInt8889; local18++) {
						if ((Static96.aByteArrayArrayArray10[1][local14][local18] & 0x2) == 2) {
							Static491.method7781(local14, local18);
						}
					}
				}
			}
			for (local14 = 0; super.anInt8876 > local14; local14++) {
				for (local18 = 0; super.anInt8889 >= local18; local18++) {
					for (@Pc(56) int local56 = 0; local56 <= super.anInt8880; local56++) {
						if ((super.aByteArrayArrayArray14[local14][local56][local18] & 0x4) != 0) {
							@Pc(74) int local74 = local56;
							@Pc(76) int local76 = local56;
							@Pc(78) int local78 = local18;
							@Pc(80) int local80 = local18;
							while (local78 > 0 && (super.aByteArrayArrayArray14[local14][local56][local78 - 1] & 0x4) != 0 && local18 - local78 < 10) {
								local78--;
							}
							while (super.anInt8889 > local80 && (super.aByteArrayArrayArray14[local14][local56][local80 + 1] & 0x4) != 0 && local80 - local78 < 10) {
								local80++;
							}
							@Pc(143) int local143;
							label111: while (local74 > 0 && local56 - local74 < 10) {
								for (local143 = local78; local143 <= local80; local143++) {
									if ((super.aByteArrayArrayArray14[local14][local74 - 1][local143] & 0x4) == 0) {
										break label111;
									}
								}
								local74--;
							}
							label98: while (super.anInt8880 > local76 && local76 - local74 < 10) {
								for (local143 = local78; local143 <= local80; local143++) {
									if ((super.aByteArrayArrayArray14[local14][local76 + 1][local143] & 0x4) == 0) {
										break label98;
									}
								}
								local76++;
							}
							if ((local80 + 1 - local78) * (local76 + 1 - local74) >= 4) {
								local143 = super.anIntArrayArrayArray14[local14][local74][local78];
								Static152.method3145(local143, (local76 << 9) + 512, local78 << 9, (local80 << 9) + 512, local14, local74 << 9, local143);
								for (@Pc(269) int local269 = local74; local269 <= local76; local269++) {
									for (@Pc(273) int local273 = local78; local273 <= local80; local273++) {
										super.aByteArrayArrayArray14[local14][local269][local273] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static657.method9645();
		}
		super.aByteArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIIILclient!ol;Lclient!ha;II[I)V")
	public void method7865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class2_Sub8 arg5, @OriginalArg(7) Class101 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		if (super.aBoolean642) {
			return;
		}
		@Pc(13) Class363 local13 = null;
		if (arg9 != null) {
			arg9[0] = -1;
		}
		@Pc(33) int local33 = (arg8 & 0x7) * 8;
		@Pc(39) int local39 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(53) int local53;
			@Pc(106) int local106;
			@Pc(152) int local152;
			@Pc(170) int local170;
			@Pc(57) int local57;
			@Pc(100) int local100;
			label233: do {
				while (true) {
					@Pc(44) int local44;
					@Pc(326) int local326;
					while (arg5.anInt5725 < arg5.lb.length) {
						local44 = arg5.method5203();
						if (local44 == 0) {
							local13 = new Class363(arg5);
						} else {
							if (local44 == 1) {
								local53 = arg5.method5203();
								continue label233;
							}
							if (local44 == 2) {
								if (local13 == null) {
									local13 = new Class363();
								}
								local13.method9219(arg5);
							} else if (local44 != 128) {
								if (local44 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray17 == null) {
									super.aByteArrayArrayArray17 = new byte[4][][];
								}
								for (local53 = 0; local53 < 4; local53++) {
									@Pc(307) byte local307 = arg5.method5175();
									@Pc(330) int local330;
									if (local307 == 0 && super.aByteArrayArrayArray17[arg1] != null) {
										if (local53 <= arg0) {
											local326 = arg4;
											local330 = arg4 + 7;
											local100 = arg2;
											if (arg4 < 0) {
												local326 = 0;
											} else if (super.anInt8880 <= arg4) {
												local326 = super.anInt8880;
											}
											if (arg2 < 0) {
												local100 = 0;
											} else if (arg2 >= super.anInt8889) {
												local100 = super.anInt8889;
											}
											local106 = arg2 + 7;
											if (local330 < 0) {
												local330 = 0;
											} else if (super.anInt8880 <= local330) {
												local330 = super.anInt8880;
											}
											if (local106 < 0) {
												local106 = 0;
											} else if (super.anInt8889 <= local106) {
												local106 = super.anInt8889;
											}
											while (local326 < local330) {
												while (local106 > local100) {
													super.aByteArrayArrayArray17[arg1][local326][local100] = 0;
													local100++;
												}
												local326++;
											}
										}
									} else if (local307 == 1) {
										if (super.aByteArrayArrayArray17[arg1] == null) {
											super.aByteArrayArrayArray17[arg1] = new byte[super.anInt8880 + 1][super.anInt8889 + 1];
										}
										for (local326 = 0; local326 < 64; local326 += 4) {
											for (local330 = 0; local330 < 64; local330 += 4) {
												@Pc(472) byte local472 = arg5.method5175();
												if (arg0 >= local53) {
													for (local106 = local326; local106 < local326 + 4; local106++) {
														for (local152 = local330; local152 < local330 + 4; local152++) {
															if (local33 <= local106 && local106 < local33 + 8 && local152 >= local39 && local39 < local39 + 8) {
																local170 = Static516.method8013(local152 & 0x7, arg3, local106 & 0x7) + arg4;
																@Pc(531) int local531 = Static196.method3781(arg3, local106 & 0x7, local152 & 0x7) + arg2;
																if (local170 >= 0 && local170 < super.anInt8880 && local531 >= 0 && local531 < super.anInt8889) {
																	super.aByteArrayArrayArray17[arg1][local170][local531] = local472;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else if (arg9 == null) {
								arg5.anInt5725 += 10;
							} else {
								arg9[0] = arg5.method5211();
								arg9[1] = arg5.method5174();
								arg9[2] = arg5.method5174();
								arg9[3] = arg5.method5174();
								arg9[4] = arg5.method5211();
							}
						}
					}
					if (local13 != null) {
						Static260.method4512(arg2 >> 3, local13, arg4 >> 3);
					}
					if (super.aByteArrayArrayArray17 != null && super.aByteArrayArrayArray17[arg1] != null) {
						local44 = arg4 + 7;
						local53 = arg2 + 7;
						for (local57 = arg4; local57 < local44; local57++) {
							for (local326 = arg2; local326 < local53; local326++) {
								super.aByteArrayArrayArray17[arg1][local57][local326] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local53 <= 0);
			for (local57 = 0; local57 < local53; local57++) {
				@Pc(66) Class84 local66 = new Class84(arg6, arg5, 2);
				if (local66.anInt2425 == 31) {
					@Pc(77) Class44 local77 = Static294.aClass378_1.method9483(arg5.method5211());
					local66.method2247(local77.anInt1232, local77.anInt1237, local77.anInt1235, local77.anInt1236);
				}
				if (arg6.method8109() > 0) {
					@Pc(94) Class2_Sub13 local94 = local66.aClass2_Sub13_1;
					local100 = local94.method9411() >> 9;
					local106 = local94.method9406() >> 9;
					if (local66.anInt2418 == arg0 && local33 <= local100 && local100 < local33 + 8 && local39 <= local106 && local106 < local39 + 8) {
						local152 = (arg4 << 9) + Static145.method2527(local94.method9406() & 0xFFF, local94.method9411() & 0xFFF, arg3);
						local170 = Static367.method6216(local94.method9411() & 0xFFF, local94.method9406() & 0xFFF, arg3) + (arg2 << 9);
						local100 = local152 >> 9;
						local106 = local170 >> 9;
						if (local100 >= 0 && local106 >= 0 && local100 < super.anInt8880 && super.anInt8889 > local106) {
							local94.method9412(local152, super.anIntArrayArrayArray14[arg0][local100][local106] - local94.method9410(), local170);
							Static527.method8201(local66);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(IIIII)Lclient!vu;")
	public Interface23 method7867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface23 local5 = null;
		if (arg1 == 0) {
			local5 = (Interface23) Static584.method4102(arg0, arg3, arg2);
		}
		if (arg1 == 1) {
			local5 = (Interface23) Static207.method3925(arg0, arg3, arg2);
		}
		if (arg1 == 2) {
			local5 = (Interface23) Static174.method3415(arg0, arg3, arg2, vu.class);
		}
		if (arg1 == 3) {
			local5 = (Interface23) Static428.method7017(arg0, arg3, arg2);
		}
		return local5;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IILclient!kn;IIILclient!ha;)V")
	public void method7868(@OriginalArg(0) int arg0, @OriginalArg(2) Class200 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class101 arg5) {
		@Pc(15) Interface23 local15 = this.method7867(arg0, arg4, arg3, arg2);
		if (local15 == null) {
			return;
		}
		@Pc(24) Class331 local24 = Static251.aClass328_1.method8261(local15.method9451());
		@Pc(30) int local30 = local15.method9452();
		@Pc(34) int local34 = local15.method9454();
		if (local24.method8303()) {
			Static65.method1187(arg2, arg3, local24, arg0);
		}
		if (local15.method9448()) {
			local15.method9449(arg5);
		}
		if (arg4 == 0) {
			Static77.method1384(arg0, arg2, arg3);
			if (local24.anInt9403 != 0) {
				arg1.method5288(local24.aBoolean696, local34, arg2, !local24.aBoolean693, arg3, local30);
			}
			if (local24.anInt9459 == 1) {
				if (local34 == 0) {
					Static14.method7648(1, arg2, arg3, arg0);
				} else if (local34 == 1) {
					Static14.method7648(2, arg2, arg3 + 1, arg0);
				} else if (local34 == 2) {
					Static14.method7648(1, arg2 + 1, arg3, arg0);
				} else if (local34 == 3) {
					Static14.method7648(2, arg2, arg3, arg0);
				}
			}
		} else if (arg4 == 1) {
			Static559.method8525(arg0, arg2, arg3);
		} else if (arg4 == 2) {
			Static261.method4515(arg0, arg2, arg3, vu.class);
			if (local24.anInt9403 != 0 && super.anInt8880 > local24.anInt9454 + arg2 && super.anInt8889 > arg3 + local24.anInt9454 && arg2 + local24.anInt9425 < super.anInt8880 && super.anInt8889 > local24.anInt9425 + arg3) {
				arg1.method5292(arg2, local24.anInt9425, !local24.aBoolean693, arg3, local24.anInt9454, local24.aBoolean696, local34);
			}
			if (local30 == 9) {
				if ((local34 & 0x1) == 0) {
					Static14.method7648(8, arg2, arg3, arg0);
				} else {
					Static14.method7648(16, arg2, arg3, arg0);
				}
			}
		} else if (arg4 == 3) {
			Static414.method6778(arg0, arg2, arg3);
			if (local24.anInt9403 == 1) {
				arg1.method5289(arg2, arg3);
			}
		}
	}
}
