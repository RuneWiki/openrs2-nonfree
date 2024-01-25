import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class116_Sub1 extends Class116 {

	@OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
	public int anInt3506 = 99;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIZ)V")
	public Class116_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static158.aClass245_1, Static471.aClass255_5);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!uda;Lclient!ha;IIIBIIII)V")
	public void method3289(@OriginalArg(0) int arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (Static687.aClass6_Sub44_33.aClass7_Sub6_1.method926() == 0 && !Static596.method8244(arg9, arg3, Static621.anInt9796, arg0)) {
			return;
		}
		if (this.anInt3506 > arg4) {
			this.anInt3506 = arg4;
		}
		@Pc(39) Class125 local39 = Static290.aClass163_5.method4124(122, arg6);
		if (Static687.aClass6_Sub44_33.aClass7_Sub2_1.method236() == 0 && local39.aBoolean299) {
			return;
		}
		@Pc(68) int local68;
		@Pc(65) int local65;
		if (arg8 == 1 || arg8 == 3) {
			local68 = local39.lb;
			local65 = local39.anInt3614;
		} else {
			local65 = local39.lb;
			local68 = local39.anInt3614;
		}
		@Pc(96) int local96;
		@Pc(100) int local100;
		if (super.anInt3492 < arg3 + local68) {
			local96 = arg3;
			local100 = arg3 + 1;
		} else {
			local100 = (local68 + 1 >> 1) + arg3;
			local96 = (local68 >> 1) + arg3;
		}
		@Pc(129) int local129;
		@Pc(137) int local137;
		if (local65 + arg9 <= super.anInt3494) {
			local129 = arg9 + (local65 >> 1);
			local137 = arg9 + (local65 + 1 >> 1);
		} else {
			local129 = arg9;
			local137 = arg9 + 1;
		}
		@Pc(149) Class96 local149 = Static555.aClass96Array3[arg0];
		@Pc(176) int local176 = local149.method8080(local96, local129) + local149.method8080(local100, local129) + local149.method8080(local96, local137) + local149.method8080(local100, local137) >> 2;
		@Pc(184) int local184 = (local68 << 8) + (arg3 << 9);
		@Pc(192) int local192 = (arg9 << 9) + (local65 << 8);
		@Pc(209) boolean local209 = Static36.aBoolean37 && !super.aBoolean278 && local39.aBoolean298;
		if (local39.method3370()) {
			Static268.method4558((Class60_Sub1_Sub1_Sub3_Sub1) null, arg9, arg8, arg3, (Class60_Sub1_Sub1_Sub3_Sub2) null, local39, arg4);
		}
		@Pc(254) boolean local254 = arg5 == -1 && !local39.method3386() && local39.anIntArray198 == null && !local39.aBoolean285 && !local39.aBoolean289;
		if (Static288.aBoolean393 && (Static37.method486(arg7) && local39.anInt3609 != 1 || !(!Static241.method4233(arg7) || local39.anInt3609 != 0))) {
			return;
		}
		if (arg7 != 22) {
			@Pc(431) Class60_Sub1_Sub1 local431;
			@Pc(393) Class60_Sub1_Sub1_Sub1 local393;
			@Pc(429) int local429;
			@Pc(498) int local498;
			if (arg7 == 10 || arg7 == 11) {
				local393 = null;
				if (local254) {
					@Pc(423) Class60_Sub1_Sub1_Sub1 local423 = new Class60_Sub1_Sub1_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg3, local68 + arg3 - 1, arg9, local65 + arg9 - 1, arg7, arg8, local209);
					local393 = local423;
					local429 = local423.method1182();
					local431 = local423;
				} else {
					local431 = new Class60_Sub1_Sub1_Sub4(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg3, local68 + arg3 - 1, arg9, local65 + arg9 - 1, arg7, arg8, arg5);
					local429 = 15;
				}
				if (Static610.method8414(local431, false)) {
					if (local393 != null && local393.method7930()) {
						local393.method7931(arg2);
					}
					if (local39.aBoolean291 && Static36.aBoolean37) {
						if (local429 > 30) {
							local429 = 30;
						}
						for (local498 = 0; local498 <= local68; local498++) {
							for (@Pc(502) int local502 = 0; local502 <= local65; local502++) {
								local149.ka(local498 + arg3, local502 + arg9, local429);
							}
						}
					}
				}
				if (local39.anInt3631 != 0 && arg1 != null) {
					arg1.method8397(arg9, local68, local65, local39.aBoolean286, !local39.aBoolean297, arg3);
				}
			} else if (arg7 >= 12 && arg7 <= 17 || arg7 >= 18 && arg7 <= 21) {
				if (local254) {
					local393 = new Class60_Sub1_Sub1_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg3, local68 + arg3 - 1, arg9, arg9 + local65 - 1, arg7, arg8, local209);
					if (local393.method7930()) {
						local393.method7931(arg2);
					}
					local431 = local393;
				} else {
					local431 = new Class60_Sub1_Sub1_Sub4(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg3, local68 + arg3 - 1, arg9, local65 + arg9 - 1, arg7, arg8, arg5);
				}
				Static610.method8414(local431, false);
				if (Static36.aBoolean37 && !super.aBoolean278 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg4 > 0 && local39.anInt3609 != 0) {
					super.aByteArrayArrayArray12[arg4][arg3][arg9] = (byte) (super.aByteArrayArrayArray12[arg4][arg3][arg9] | 0x4);
				}
				if (local39.anInt3631 != 0 && arg1 != null) {
					arg1.method8397(arg9, local68, local65, local39.aBoolean286, !local39.aBoolean297, arg3);
				}
			} else {
				@Pc(786) Class60_Sub1_Sub3 local786;
				if (arg7 == 0) {
					@Pc(758) int local758 = local39.anInt3609;
					if (Static470.aBoolean605 && local39.anInt3609 == -1) {
						local758 = 1;
					}
					if (local254) {
						@Pc(804) Class60_Sub1_Sub3_Sub1 local804 = new Class60_Sub1_Sub3_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg7, arg8, local209);
						local786 = local804;
						if (local804.method7930()) {
							local804.method7931(arg2);
						}
					} else {
						local786 = new Class60_Sub1_Sub3_Sub2(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg7, arg8, arg5);
					}
					Static504.method7359(arg4, arg3, arg9, local786, (Class60_Sub1_Sub3) null);
					if (arg8 == 0) {
						if (Static36.aBoolean37 && local39.aBoolean291) {
							local149.ka(arg3, arg9, 50);
							local149.ka(arg3, arg9 + 1, 50);
						}
						if (local758 == 1 && !super.aBoolean278) {
							Static57.method681(local39.anInt3630, arg4, arg9, arg3, local39.anInt3577, 1);
						}
					} else if (arg8 == 1) {
						if (Static36.aBoolean37 && local39.aBoolean291) {
							local149.ka(arg3, arg9 + 1, 50);
							local149.ka(arg3 + 1, arg9 + 1, 50);
						}
						if (local758 == 1 && !super.aBoolean278) {
							Static57.method681(-local39.anInt3630, arg4, arg9 + 1, arg3, local39.anInt3577, 2);
						}
					} else if (arg8 == 2) {
						if (Static36.aBoolean37 && local39.aBoolean291) {
							local149.ka(arg3 + 1, arg9, 50);
							local149.ka(arg3 + 1, arg9 + 1, 50);
						}
						if (local758 == 1 && !super.aBoolean278) {
							Static57.method681(-local39.anInt3630, arg4, arg9, arg3 + 1, local39.anInt3577, 1);
						}
					} else if (arg8 == 3) {
						if (Static36.aBoolean37 && local39.aBoolean291) {
							local149.ka(arg3, arg9, 50);
							local149.ka(arg3 + 1, arg9, 50);
						}
						if (local758 == 1 && !super.aBoolean278) {
							Static57.method681(local39.anInt3630, arg4, arg9, arg3, local39.anInt3577, 2);
						}
					}
					if (local39.anInt3631 != 0 && arg1 != null) {
						arg1.method8396(arg7, arg8, local39.aBoolean286, arg3, arg9, !local39.aBoolean297);
					}
					if (local39.anInt3590 != 64) {
						Static180.method3413(arg4, arg3, arg9, local39.anInt3590);
					}
				} else {
					@Pc(1106) Class60_Sub1_Sub3 local1106;
					@Pc(1124) Class60_Sub1_Sub3_Sub1 local1124;
					if (arg7 == 1) {
						if (local254) {
							local1124 = new Class60_Sub1_Sub3_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg7, arg8, local209);
							local1106 = local1124;
							if (local1124.method7930()) {
								local1124.method7931(arg2);
							}
						} else {
							local1106 = new Class60_Sub1_Sub3_Sub2(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg7, arg8, arg5);
						}
						Static504.method7359(arg4, arg3, arg9, local1106, (Class60_Sub1_Sub3) null);
						if (local39.aBoolean291 && Static36.aBoolean37) {
							if (arg8 == 0) {
								local149.ka(arg3, arg9 + 1, 50);
							} else if (arg8 == 1) {
								local149.ka(arg3 + 1, arg9 + 1, 50);
							} else if (arg8 == 2) {
								local149.ka(arg3 + 1, arg9, 50);
							} else if (arg8 == 3) {
								local149.ka(arg3, arg9, 50);
							}
						}
						if (local39.anInt3631 != 0 && arg1 != null) {
							arg1.method8396(arg7, arg8, local39.aBoolean286, arg3, arg9, !local39.aBoolean297);
						}
					} else if (arg7 == 2) {
						local429 = arg8 + 1 & 0x3;
						if (local254) {
							@Pc(1275) Class60_Sub1_Sub3_Sub1 local1275 = new Class60_Sub1_Sub3_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg7, arg8 + 4, local209);
							@Pc(1291) Class60_Sub1_Sub3_Sub1 local1291 = new Class60_Sub1_Sub3_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg7, local429, local209);
							if (local1275.method7930()) {
								local1275.method7931(arg2);
							}
							if (local1291.method7930()) {
								local1291.method7931(arg2);
							}
							local1106 = local1275;
							local786 = local1291;
						} else {
							local1106 = new Class60_Sub1_Sub3_Sub2(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg7, arg8 + 4, arg5);
							local786 = new Class60_Sub1_Sub3_Sub2(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg7, local429, arg5);
						}
						Static504.method7359(arg4, arg3, arg9, local1106, local786);
						if ((local39.anInt3609 == 1 || Static470.aBoolean605 && local39.anInt3609 == -1) && !super.aBoolean278) {
							if (arg8 == 0) {
								Static57.method681(local39.anInt3630, arg4, arg9, arg3, local39.anInt3577, 1);
								Static57.method681(local39.anInt3630, arg4, arg9 + 1, arg3, local39.anInt3577, 2);
							} else if (arg8 == 1) {
								Static57.method681(local39.anInt3630, arg4, arg9, arg3 + 1, local39.anInt3577, 1);
								Static57.method681(local39.anInt3630, arg4, arg9 + 1, arg3, local39.anInt3577, 2);
							} else if (arg8 == 2) {
								Static57.method681(local39.anInt3630, arg4, arg9, arg3 + 1, local39.anInt3577, 1);
								Static57.method681(local39.anInt3630, arg4, arg9, arg3, local39.anInt3577, 2);
							} else if (arg8 == 3) {
								Static57.method681(local39.anInt3630, arg4, arg9, arg3, local39.anInt3577, 1);
								Static57.method681(local39.anInt3630, arg4, arg9, arg3, local39.anInt3577, 2);
							}
						}
						if (local39.anInt3631 != 0 && arg1 != null) {
							arg1.method8396(arg7, arg8, local39.aBoolean286, arg3, arg9, !local39.aBoolean297);
						}
						if (local39.anInt3590 != 64) {
							Static180.method3413(arg4, arg3, arg9, local39.anInt3590);
						}
					} else if (arg7 == 3) {
						if (local254) {
							local1124 = new Class60_Sub1_Sub3_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg7, arg8, local209);
							local1106 = local1124;
							if (local1124.method7930()) {
								local1124.method7931(arg2);
							}
						} else {
							local1106 = new Class60_Sub1_Sub3_Sub2(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg7, arg8, arg5);
						}
						Static504.method7359(arg4, arg3, arg9, local1106, (Class60_Sub1_Sub3) null);
						if (local39.aBoolean291 && Static36.aBoolean37) {
							if (arg8 == 0) {
								local149.ka(arg3, arg9 + 1, 50);
							} else if (arg8 == 1) {
								local149.ka(arg3 + 1, arg9 - -1, 50);
							} else if (arg8 == 2) {
								local149.ka(arg3 + 1, arg9, 50);
							} else if (arg8 == 3) {
								local149.ka(arg3, arg9, 50);
							}
						}
						if (local39.anInt3631 != 0 && arg1 != null) {
							arg1.method8396(arg7, arg8, local39.aBoolean286, arg3, arg9, !local39.aBoolean297);
						}
					} else if (arg7 == 9) {
						if (local254) {
							local393 = new Class60_Sub1_Sub1_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg3, arg3, arg9, arg9, arg7, arg8, local209);
							local431 = local393;
							if (local393.method7930()) {
								local393.method7931(arg2);
							}
						} else {
							local431 = new Class60_Sub1_Sub1_Sub4(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg3, arg3 + local68 - 1, arg9, local65 + arg9 - 1, arg7, arg8, arg5);
						}
						Static610.method8414(local431, false);
						if (local39.anInt3609 == 1 && !super.aBoolean278) {
							@Pc(1795) byte local1795;
							if ((arg8 & 0x1) == 0) {
								local1795 = 8;
							} else {
								local1795 = 16;
							}
							Static57.method681(0, arg4, arg9, arg3, local39.anInt3577, local1795);
						}
						if (local39.anInt3631 != 0 && arg1 != null) {
							arg1.method8397(arg9, local68, local65, local39.aBoolean286, !local39.aBoolean297, arg3);
						}
						if (local39.anInt3590 != 64) {
							Static180.method3413(arg4, arg3, arg9, local39.anInt3590);
						}
					} else {
						@Pc(1871) Class60_Sub1_Sub5 local1871;
						if (arg7 == 4) {
							if (local254) {
								@Pc(1890) Class60_Sub1_Sub5_Sub2 local1890 = new Class60_Sub1_Sub5_Sub2(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, 0, 0, arg7, arg8);
								local1871 = local1890;
								if (local1890.method7930()) {
									local1890.method7931(arg2);
								}
							} else {
								local1871 = new Class60_Sub1_Sub5_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, 0, 0, arg7, arg8, arg5);
							}
							Static423.method6438(arg4, arg3, arg9, local1871, (Class60_Sub1_Sub5) null);
						} else {
							@Pc(1916) int local1916;
							@Pc(1922) Interface23 local1922;
							@Pc(1961) Class60_Sub1_Sub5_Sub2 local1961;
							if (arg7 == 5) {
								local1916 = 65;
								local1922 = (Interface23) Static593.method8225(arg4, arg3, arg9);
								if (local1922 != null) {
									local1916 = Static290.aClass163_5.method4124(126, local1922.method7934()).anInt3590 + 1;
								}
								if (local254) {
									local1961 = new Class60_Sub1_Sub5_Sub2(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, Static259.anIntArray270[arg8] * local1916, local1916 * Static69.anIntArray67[arg8], arg7, arg8);
									local1871 = local1961;
									if (local1961.method7930()) {
										local1961.method7931(arg2);
									}
								} else {
									local1871 = new Class60_Sub1_Sub5_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, Static259.anIntArray270[arg8] * local1916, Static69.anIntArray67[arg8] * local1916, arg7, arg8, arg5);
								}
								Static423.method6438(arg4, arg3, arg9, local1871, (Class60_Sub1_Sub5) null);
							} else if (arg7 == 6) {
								local1916 = 33;
								local1922 = (Interface23) Static593.method8225(arg4, arg3, arg9);
								if (local1922 != null) {
									local1916 = Static290.aClass163_5.method4124(126, local1922.method7934()).anInt3590 / 2 + 1;
								}
								if (local254) {
									local1961 = new Class60_Sub1_Sub5_Sub2(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, local1916 * Static259.anIntArray270[arg8], Static69.anIntArray67[arg8] * local1916, arg7, arg8 + 4);
									if (local1961.method7930()) {
										local1961.method7931(arg2);
									}
									local1871 = local1961;
								} else {
									local1871 = new Class60_Sub1_Sub5_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, local1916 * Static584.anIntArray605[arg8], Static48.anIntArray405[arg8] * local1916, arg7, arg8 + 4, arg5);
								}
								Static423.method6438(arg4, arg3, arg9, local1871, (Class60_Sub1_Sub5) null);
							} else if (arg7 == 7) {
								local1916 = arg8 + 2 & 0x3;
								if (local254) {
									@Pc(2143) Class60_Sub1_Sub5_Sub2 local2143 = new Class60_Sub1_Sub5_Sub2(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, 0, 0, arg7, local1916 + 4);
									if (local2143.method7930()) {
										local2143.method7931(arg2);
									}
									local1871 = local2143;
								} else {
									local1871 = new Class60_Sub1_Sub5_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, 0, 0, arg7, local1916 + 4, arg5);
								}
								Static423.method6438(arg4, arg3, arg9, local1871, (Class60_Sub1_Sub5) null);
							} else if (arg7 == 8) {
								local429 = arg8 + 2 & 0x3;
								local498 = 33;
								@Pc(2203) Interface23 local2203 = (Interface23) Static593.method8225(arg4, arg3, arg9);
								if (local2203 != null) {
									local498 = Static290.aClass163_5.method4124(119, local2203.method7934()).anInt3590 / 2 + 1;
								}
								@Pc(2246) Class60_Sub1_Sub5 local2246;
								@Pc(2265) Class60_Sub1_Sub5 local2265;
								if (local254) {
									local2246 = new Class60_Sub1_Sub5_Sub2(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, Static584.anIntArray605[arg8] * local498, Static48.anIntArray405[arg8] * local498, arg7, arg8 + 4);
									local2265 = new Class60_Sub1_Sub5_Sub2(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, 0, 0, arg7, local429 + 4);
									if (local2246.method7930()) {
										local2246.method7931(arg2);
									}
									if (local2265.method7930()) {
										local2265.method7931(arg2);
									}
								} else {
									local2246 = new Class60_Sub1_Sub5_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, Static584.anIntArray605[arg8] * local498, local498 * Static48.anIntArray405[arg8], arg7, arg8 + 4, arg5);
									local2265 = new Class60_Sub1_Sub5_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, 0, 0, arg7, local429 + 4, arg5);
								}
								Static423.method6438(arg4, arg3, arg9, local2246, local2265);
							}
						}
					}
				}
			}
		} else if (Static687.aClass6_Sub44_33.aClass7_Sub8_1.method1416() != 0 || local39.anInt3587 != 0 || local39.anInt3631 == 1 || local39.aBoolean296) {
			@Pc(331) Class60_Sub1_Sub2 local331;
			if (local254) {
				@Pc(329) Class60_Sub1_Sub2_Sub2 local329 = new Class60_Sub1_Sub2_Sub2(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg8, local209);
				local331 = local329;
				if (local329.method7930()) {
					local329.method7931(arg2);
				}
			} else {
				local331 = new Class60_Sub1_Sub2_Sub1(arg2, local39, arg4, arg0, local184, local176, local192, super.aBoolean278, arg8, arg5);
			}
			Static488.method7228(arg4, arg3, arg9, local331);
			if (local39.anInt3631 == 1 && arg1 != null) {
				arg1.method8385(arg9, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!jc;IIIIILclient!ha;BII)V")
	public void method3290(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class75 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (super.aBoolean278) {
			return;
		}
		@Pc(20) boolean local20 = false;
		@Pc(22) Class304 local22 = null;
		@Pc(28) int local28 = (arg2 & 0x7) * 8;
		@Pc(34) int local34 = (arg3 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(39) int local39;
						@Pc(80) int local80;
						@Pc(467) int local467;
						@Pc(106) int local106;
						while (arg0.anInt3174 < arg0.aByteArray20.length) {
							local39 = arg0.method3030();
							if (local39 != 0) {
								@Pc(112) int local112;
								@Pc(156) int local156;
								@Pc(290) int local290;
								@Pc(336) int local336;
								if (local39 == 1) {
									local80 = arg0.method3030();
									if (local80 > 0) {
										for (local467 = 0; local467 < local80; local467++) {
											@Pc(476) Class256 local476 = new Class256(arg6, arg0, 2);
											if (local476.anInt7108 == 31) {
												@Pc(489) Class178 local489 = Static378.aClass90_1.method2207(arg0.method3018());
												local476.method6258(local489.anInt5020, local489.anInt5016, local489.anInt5015, local489.anInt5018);
											}
											if (arg6.method6689() > 0) {
												@Pc(509) Class6_Sub10 local509 = local476.aClass6_Sub10_3;
												local112 = local509.method8332() >> 9;
												local156 = local509.method8329() >> 9;
												if (arg4 == local476.anInt7105 && local112 >= local28 && local28 + 8 > local112 && local34 <= local156 && local156 < local34 + 8) {
													local290 = Static222.method4017(local509.method8329() & 0xFFF, local509.method8332() & 0xFFF, arg1) + (arg5 << 9);
													local336 = Static565.method7968(local509.method8329() & 0xFFF, local509.method8332() & 0xFFF, arg1) + (arg8 << 9);
													local112 = local290 >> 9;
													local156 = local336 >> 9;
													if (local112 >= 0 && local156 >= 0 && local112 < super.anInt3492 && local156 < super.anInt3494) {
														local509.method8333(local336, super.anIntArrayArrayArray10[arg4][local112][local156] - local509.method8327(), local290);
														Static199.method3723(local476);
													}
												}
											}
										}
									}
								} else if (local39 == 2) {
									if (local22 == null) {
										local22 = new Class304();
									}
									local22.method7334(arg0);
								} else if (local39 == 128) {
									if (local22 == null) {
										local22 = new Class304();
									}
									local22.method7336(arg0);
								} else if (local39 == 129) {
									if (super.aByteArrayArrayArray13 == null) {
										super.aByteArrayArrayArray13 = new byte[4][][];
									}
									for (local80 = 0; local80 < 4; local80++) {
										@Pc(86) byte local86 = arg0.method3027();
										@Pc(110) int local110;
										if (local86 == 0 && super.aByteArrayArrayArray13[arg7] != null) {
											if (local80 <= arg4) {
												local106 = arg5;
												local110 = arg5 + 7;
												local112 = arg8;
												if (arg8 < 0) {
													local112 = 0;
												} else if (arg8 >= super.anInt3494) {
													local112 = super.anInt3494;
												}
												if (arg5 < 0) {
													local106 = 0;
												} else if (arg5 >= super.anInt3492) {
													local106 = super.anInt3492;
												}
												local156 = arg8 + 7;
												if (local110 < 0) {
													local110 = 0;
												} else if (local110 >= super.anInt3492) {
													local110 = super.anInt3492;
												}
												if (local156 < 0) {
													local156 = 0;
												} else if (super.anInt3494 <= local156) {
													local156 = super.anInt3494;
												}
												while (local106 < local110) {
													while (local112 < local156) {
														super.aByteArrayArrayArray13[arg7][local106][local112] = 0;
														local112++;
													}
													local106++;
												}
											}
										} else if (local86 == 1) {
											if (super.aByteArrayArrayArray13[arg7] == null) {
												super.aByteArrayArrayArray13[arg7] = new byte[super.anInt3492 + 1][super.anInt3494 + 1];
											}
											for (local106 = 0; local106 < 64; local106 += 4) {
												for (local110 = 0; local110 < 64; local110 += 4) {
													@Pc(277) byte local277 = arg0.method3027();
													if (arg4 >= local80) {
														for (local156 = local106; local156 < local106 + 4; local156++) {
															for (local290 = local110; local290 < local110 + 4; local290++) {
																if (local156 >= local28 && local156 < local28 + 8 && local290 >= local34 && local290 < local34 + 8) {
																	local336 = Static438.method6630(local290 & 0x7, local156 & 0x7, arg1) + arg5;
																	@Pc(348) int local348 = Static658.method8769(local156 & 0x7, local290 & 0x7, arg1) + arg8;
																	if (local336 >= 0 && local336 < super.anInt3492 && local348 >= 0 && super.anInt3494 > local348) {
																		super.aByteArrayArrayArray13[arg7][local336][local348] = local277;
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
								local22 = new Class304(arg0);
							} else {
								local22.method7339(arg0);
							}
						}
						if (local22 != null) {
							Static115.method2161(arg8 >> 3, local22, arg5 >> 3);
						}
						if (!local20 && super.aByteArrayArrayArray13 != null && super.aByteArrayArrayArray13[arg7] != null) {
							local39 = arg5 + 7;
							local80 = arg8 + 7;
							for (local467 = arg5; local467 < local39; local467++) {
								for (local106 = arg8; local106 < local80; local106++) {
									super.aByteArrayArrayArray13[arg7][local467][local106] = 0;
								}
							}
							return;
						}
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZIIII)Lclient!rt;")
	public Interface23 method3292(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface23 local5 = null;
		if (arg3 == 0) {
			local5 = (Interface23) Static593.method8225(arg0, arg2, arg1);
		}
		if (arg3 == 1) {
			local5 = (Interface23) Static382.method5910(arg0, arg2, arg1);
		}
		if (arg3 == 2) {
			local5 = (Interface23) Static122.method2204(arg0, arg2, arg1, Static166.aClass6 == null ? (Static166.aClass6 = a("rt")) : Static166.aClass6);
		}
		if (arg3 == 3) {
			local5 = (Interface23) Static64.method787(arg0, arg2, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[Lclient!uda;[BLclient!ha;BI)V")
	public void method3294(@OriginalArg(0) int arg0, @OriginalArg(1) Class356[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(5) int arg4) {
		@Pc(14) Class6_Sub15 local14 = new Class6_Sub15(arg2);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method3007();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local14.method2992();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 & 0x3F;
				@Pc(56) int local56 = local31 >> 6 & 0x3F;
				@Pc(60) int local60 = local31 >> 12;
				@Pc(64) int local64 = local14.method3030();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				@Pc(76) int local76 = arg4 + local56;
				@Pc(81) int local81 = local50 + arg0;
				if (local76 > 0 && local81 > 0 && super.anInt3492 - 1 > local76 && super.anInt3494 - 1 > local81) {
					@Pc(109) Class356 local109 = null;
					if (!super.aBoolean278) {
						@Pc(114) int local114 = local60;
						if ((Static272.aByteArrayArrayArray2[1][local76][local81] & 0x2) == 2) {
							local114 = local60 - 1;
						}
						if (local114 >= 0) {
							local109 = arg1[local114];
						}
					}
					this.method3289(local60, local109, arg3, local76, local60, -1, local16, local68, local72, local81);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLclient!ha;Z)V")
	public void method3295(@OriginalArg(1) Class75 arg0, @OriginalArg(2) boolean arg1) {
		Static37.method485();
		if (!arg1) {
			@Pc(24) int local24;
			@Pc(28) int local28;
			if (super.anInt3486 > 1) {
				for (local24 = 0; local24 < super.anInt3492; local24++) {
					for (local28 = 0; super.anInt3494 > local28; local28++) {
						if ((Static272.aByteArrayArrayArray2[1][local24][local28] & 0x2) == 2) {
							Static539.method7690(local24, local28);
						}
					}
				}
			}
			for (local24 = 0; local24 < super.anInt3486; local24++) {
				for (local28 = 0; local28 <= super.anInt3494; local28++) {
					for (@Pc(78) int local78 = 0; super.anInt3492 >= local78; local78++) {
						if ((super.aByteArrayArrayArray12[local24][local78][local28] & 0x4) != 0) {
							@Pc(95) int local95 = local78;
							@Pc(97) int local97 = local78;
							@Pc(99) int local99 = local28;
							@Pc(101) int local101 = local28;
							while (local99 > 0 && (super.aByteArrayArrayArray12[local24][local78][local99 - 1] & 0x4) != 0 && local28 - local99 < 10) {
								local99--;
							}
							while (super.anInt3494 > local101 && (super.aByteArrayArrayArray12[local24][local78][local101 + 1] & 0x4) != 0 && local101 - local99 < 10) {
								local101++;
							}
							@Pc(185) int local185;
							label111: while (local95 > 0 && local78 - local95 < 10) {
								for (local185 = local99; local185 <= local101; local185++) {
									if ((super.aByteArrayArrayArray12[local24][local95 - 1][local185] & 0x4) == 0) {
										break label111;
									}
								}
								local95--;
							}
							label98: while (local97 < super.anInt3492 && local97 - local95 < 10) {
								for (local185 = local99; local185 <= local101; local185++) {
									if ((super.aByteArrayArrayArray12[local24][local97 + 1][local185] & 0x4) == 0) {
										break label98;
									}
								}
								local97++;
							}
							if ((local97 + 1 - local95) * (local101 - local99 - -1) >= 4) {
								local185 = super.anIntArrayArrayArray10[local24][local95][local99];
								Static384.method5926((local97 << 9) + 512, (local101 << 9) + 512, local95 << 9, local185, local99 << 9, local185, local24);
								for (@Pc(334) int local334 = local95; local334 <= local97; local334++) {
									for (@Pc(338) int local338 = local99; local338 <= local101; local338++) {
										super.aByteArrayArrayArray12[local24][local334][local338] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static145.method2852();
		}
		super.aByteArrayArrayArray12 = null;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILclient!uda;IILclient!ha;)V")
	public void method3297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class356 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5) {
		@Pc(13) Interface23 local13 = this.method3292(arg0, arg1, arg3, arg4);
		if (local13 == null) {
			return;
		}
		@Pc(24) Class125 local24 = Static290.aClass163_5.method4124(126, local13.method7934());
		@Pc(30) int local30 = local13.method7929(91);
		@Pc(34) int local34 = local13.method7932();
		if (local24.method3370()) {
			Static525.method7547(arg1, local24, arg3, arg0);
		}
		if (local13.method7930()) {
			local13.method7935(-18864, arg5);
		}
		if (arg4 == 0) {
			Static96.method1397(arg0, arg3, arg1);
			if (local24.anInt3631 != 0) {
				arg2.method8399(local34, local30, arg1, local24.aBoolean286, 134217728, !local24.aBoolean297, arg3);
			}
			if (local24.anInt3609 == 1) {
				if (local34 == 0) {
					Static70.method930(arg3, arg0, 1, arg1);
				} else if (local34 == 1) {
					Static70.method930(arg3, arg0, 2, arg1 + 1);
				} else if (local34 == 2) {
					Static70.method930(arg3 + 1, arg0, 1, arg1);
				} else if (local34 == 3) {
					Static70.method930(arg3, arg0, 2, arg1);
				}
			}
		} else if (arg4 == 1) {
			Static679.method5498(arg0, arg3, arg1);
		} else if (arg4 == 2) {
			Static337.method5202(arg0, arg3, arg1, Static166.aClass6 == null ? (Static166.aClass6 = a("rt")) : Static166.aClass6);
			if (local24.anInt3631 != 0 && super.anInt3492 > local24.anInt3614 + arg3 && super.anInt3494 > local24.anInt3614 + arg1 && super.anInt3492 > arg3 + local24.lb && arg1 + local24.lb < super.anInt3494) {
				arg2.method8389(arg1, local34, local24.aBoolean286, local24.anInt3614, !local24.aBoolean297, local24.lb, arg3);
			}
			if (local30 == 9) {
				if ((local34 & 0x1) == 0) {
					Static70.method930(arg3, arg0, 8, arg1);
				} else {
					Static70.method930(arg3, arg0, 16, arg1);
				}
			}
		} else if (arg4 == 3) {
			Static618.method8512(arg0, arg3, arg1);
			if (local24.anInt3631 == 1) {
				arg2.method8391(arg3, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([Lclient!uda;ILclient!ha;IIIIII[BI)V")
	public void method3298(@OriginalArg(0) Class356[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		@Pc(18) Class6_Sub15 local18 = new Class6_Sub15(arg8);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method3007();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local18.method2992();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(65) int local65 = local18.method3030();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (local61 == arg9 && arg1 <= local57 && local57 < arg1 + 8 && local51 >= arg6 && arg6 + 8 > local51) {
					@Pc(111) Class125 local111 = Static290.aClass163_5.method4124(123, local20);
					@Pc(128) int local128 = Static388.method5969(local51 & 0x7, arg3, local57 & 0x7, local73, local111.lb, local111.anInt3614) + arg5;
					@Pc(145) int local145 = Static502.method7337(local57 & 0x7, local51 & 0x7, local111.anInt3614, local111.lb, local73, arg3) + arg4;
					if (local128 > 0 && local145 > 0 && local128 < super.anInt3492 - 1 && super.anInt3494 - 1 > local145) {
						@Pc(171) Class356 local171 = null;
						if (!super.aBoolean278) {
							@Pc(176) int local176 = arg7;
							if ((Static272.aByteArrayArrayArray2[1][local128][local145] & 0x2) == 2) {
								local176 = arg7 - 1;
							}
							if (local176 >= 0) {
								local171 = arg0[local176];
							}
						}
						this.method3289(arg7, local171, arg2, local128, arg7, -1, local20, local69, arg3 + local73 & 0x3, local145);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILclient!ha;Lclient!jc;)V")
	public void method3299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2, @OriginalArg(4) Class6_Sub15 arg3) {
		if (super.aBoolean278) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(14) Class304 local14 = null;
		while (true) {
			@Pc(26) int local26;
			@Pc(58) int local58;
			@Pc(264) int local264;
			@Pc(268) int local268;
			@Pc(62) int local62;
			while (arg3.anInt3174 < arg3.aByteArray20.length) {
				local26 = arg3.method3030();
				if (local26 != 0) {
					@Pc(109) int local109;
					@Pc(117) int local117;
					@Pc(121) int local121;
					if (local26 == 1) {
						local58 = arg3.method3030();
						if (local58 > 0) {
							for (local62 = 0; local62 < local58; local62++) {
								@Pc(71) Class256 local71 = new Class256(arg2, arg3, 2);
								if (local71.anInt7108 == 31) {
									@Pc(84) Class178 local84 = Static378.aClass90_1.method2207(arg3.method3018());
									local71.method6258(local84.anInt5020, local84.anInt5016, local84.anInt5015, local84.anInt5018);
								}
								if (arg2.method6689() > 0) {
									@Pc(101) Class6_Sub10 local101 = local71.aClass6_Sub10_3;
									local109 = local101.method8332() + (arg0 << 9);
									local117 = (arg1 << 9) + local101.method8329();
									local121 = local109 >> 9;
									@Pc(125) int local125 = local117 >> 9;
									if (local121 >= 0 && local125 >= 0 && local121 < super.anInt3492 && local125 < super.anInt3494) {
										local101.method8333(local117, super.anIntArrayArrayArray10[local71.anInt7105][local121][local125] - local101.method8327(), local109);
										Static199.method3723(local71);
									}
								}
							}
						}
					} else if (local26 == 2) {
						if (local14 == null) {
							local14 = new Class304();
						}
						local14.method7334(arg3);
					} else if (local26 == 128) {
						if (local14 == null) {
							local14 = new Class304();
						}
						local14.method7336(arg3);
					} else if (local26 == 129) {
						if (super.aByteArrayArrayArray13 == null) {
							super.aByteArrayArrayArray13 = new byte[4][][];
						}
						for (local58 = 0; local58 < 4; local58++) {
							@Pc(253) byte local253 = arg3.method3027();
							if (local253 == 0 && super.aByteArrayArrayArray13[local58] != null) {
								local264 = arg0;
								local268 = arg0 + 64;
								local109 = arg1;
								if (local268 < 0) {
									local268 = 0;
								} else if (local268 >= super.anInt3492) {
									local268 = super.anInt3492;
								}
								if (arg0 < 0) {
									local264 = 0;
								} else if (arg0 >= super.anInt3492) {
									local264 = super.anInt3492;
								}
								local117 = arg1 + 64;
								if (arg1 < 0) {
									local109 = 0;
								} else if (super.anInt3494 <= arg1) {
									local109 = super.anInt3494;
								}
								if (local117 < 0) {
									local117 = 0;
								} else if (local117 >= super.anInt3494) {
									local117 = super.anInt3494;
								}
								while (local268 > local264) {
									while (local109 < local117) {
										super.aByteArrayArrayArray13[local58][local264][local109] = 0;
										local109++;
									}
									local264++;
								}
							} else if (local253 == 1) {
								if (super.aByteArrayArrayArray13[local58] == null) {
									super.aByteArrayArrayArray13[local58] = new byte[super.anInt3492 + 1][super.anInt3494 + 1];
								}
								for (local264 = 0; local264 < 64; local264 += 4) {
									for (local268 = 0; local268 < 64; local268 += 4) {
										@Pc(425) byte local425 = arg3.method3027();
										for (local117 = local264 + arg0; local117 < local264 + arg0 + 4; local117++) {
											for (local121 = arg1 + local268; local121 < arg1 + local268 + 4; local121++) {
												if (local117 >= 0 && super.anInt3492 > local117 && local121 >= 0 && super.anInt3494 > local121) {
													super.aByteArrayArrayArray13[local58][local117][local121] = local425;
												}
											}
										}
									}
								}
							} else if (local253 == 2) {
								if (super.aByteArrayArrayArray13[local58] == null) {
									super.aByteArrayArrayArray13[local58] = new byte[super.anInt3492 + 1][super.anInt3494 + 1];
								}
								if (local58 > 0) {
									local264 = arg0;
									local268 = arg0 + 64;
									local109 = arg1;
									if (arg0 < 0) {
										local264 = 0;
									} else if (super.anInt3492 <= arg0) {
										local264 = super.anInt3492;
									}
									local117 = arg1 + 64;
									if (local268 < 0) {
										local268 = 0;
									} else if (local268 >= super.anInt3492) {
										local268 = super.anInt3492;
									}
									if (arg1 < 0) {
										local109 = 0;
									} else if (arg1 >= super.anInt3494) {
										local109 = super.anInt3494;
									}
									if (local117 < 0) {
										local117 = 0;
									} else if (super.anInt3494 <= local117) {
										local117 = super.anInt3494;
									}
									while (local264 < local268) {
										while (local109 < local117) {
											super.aByteArrayArrayArray13[local58][local264][local109] = super.aByteArrayArrayArray13[local58 - 1][local264][local109];
											local109++;
										}
										local264++;
									}
								}
							}
						}
						local12 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local14 == null) {
					local14 = new Class304(arg3);
				} else {
					local14.method7339(arg3);
				}
			}
			if (local14 != null) {
				for (local26 = 0; local26 < 8; local26++) {
					for (local58 = 0; local58 < 8; local58++) {
						local62 = (arg0 >> 3) + local26;
						local264 = (arg1 >> 3) + local58;
						if (local62 >= 0 && super.anInt3492 >> 3 > local62 && local264 >= 0 && super.anInt3494 >> 3 > local264) {
							Static115.method2161(local264, local14, local62);
						}
					}
				}
			}
			if (!local12 && super.aByteArrayArrayArray13 != null) {
				for (local26 = 0; local26 < 4; local26++) {
					if (super.aByteArrayArrayArray13[local26] != null) {
						for (local58 = 0; local58 < 16; local58++) {
							for (local62 = 0; local62 < 16; local62++) {
								local264 = (arg0 >> 2) + local58;
								local268 = local62 + (arg1 >> 2);
								if (local264 >= 0 && local264 < 26 && local268 >= 0 && local268 < 26) {
									super.aByteArrayArrayArray13[local26][local264][local268] = 0;
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
}
