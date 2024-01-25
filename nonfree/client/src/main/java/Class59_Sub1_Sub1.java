import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class59_Sub1_Sub1 extends Class59_Sub1 {

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!lea;IIII[[I[[II)V")
	public Class59_Sub1_Sub1(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "([I[IZ[IIII[ILclient!lca;)V")
	private void method4612(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) Class188 arg7) {
		@Pc(16) Class52 local16 = super.aClass52ArrayArray3[arg5][arg4];
		@Pc(37) int local37;
		@Pc(42) int local42;
		@Pc(47) int local47;
		@Pc(315) int local315;
		@Pc(372) int local372;
		@Pc(429) int local429;
		@Pc(505) int local505;
		@Pc(344) int local344;
		@Pc(418) int local418;
		@Pc(477) int local477;
		@Pc(516) int local516;
		@Pc(299) int local299;
		@Pc(361) int local361;
		@Pc(407) int local407;
		@Pc(466) int local466;
		@Pc(333) int local333;
		@Pc(389) int local389;
		@Pc(448) int local448;
		@Pc(494) int local494;
		@Pc(99) int local99;
		@Pc(127) int local127;
		@Pc(152) int local152;
		@Pc(177) int local177;
		@Pc(49) int local49;
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(55) int local55;
		@Pc(207) int local207;
		@Pc(72) int local72;
		@Pc(82) int local82;
		@Pc(304) int local304;
		@Pc(554) int local554;
		@Pc(782) int local782;
		if (local16 == null) {
			@Pc(1644) Class347 local1644 = super.aClass347ArrayArray3[arg5][arg4];
			if (local1644 != null) {
				if (super.anInt9237 == -1) {
					for (local505 = 0; local505 < local1644.aShort116; local505++) {
						local37 = local1644.aShortArray148[local505] + (arg5 << super.anInt9638);
						local42 = local1644.aShortArray144[local505];
						local47 = local1644.aShortArray149[local505] + (arg4 << super.anInt9638);
						local429 = super.anInt9236 + (local47 * super.anInt9235 + local37 * super.anInt9234 + super.anInt9232 * local42 >> 14);
						if (local429 <= super.aClass14_Sub1_16.anInt5826) {
							return;
						}
						arg6[local505] = 0;
						if (arg2) {
							local344 = local429 - super.aClass14_Sub1_16.anInt5845;
							if (local344 > 255) {
								local344 = 255;
							}
							if (local344 > 0) {
								arg6[local505] = local344;
								local418 = local1644.aShortArray146[local505] * local344 / 255;
								if (local418 > 0) {
									local42 -= local418;
								}
							}
						} else if (super.aClass14_Sub1_16.aBoolean411) {
							local344 = local429 - super.aClass14_Sub1_16.anInt5845;
							if (local344 > 0) {
								arg6[local505] = local344;
								if (arg6[local505] > 255) {
									arg6[local505] = 255;
								}
							}
						}
						local315 = super.anInt9231 + (super.anInt9229 * local47 + super.anInt9227 * local37 + super.anInt9228 * local42 >> 14);
						local372 = (local47 * super.anInt9238 + super.anInt9239 * local37 + super.anInt9230 * local42 >> 14) + super.anInt9233;
						arg1[local505] = arg7.anInt5285 + local315 * super.aClass14_Sub1_16.anInt5818 / local429;
						arg0[local505] = arg7.anInt5282 + local372 * super.aClass14_Sub1_16.anInt5835 / local429;
						arg3[local505] = local429;
					}
				} else {
					for (local505 = 0; local505 < local1644.aShort116; local505++) {
						local37 = local1644.aShortArray148[local505] + (arg5 << super.anInt9638);
						local42 = local1644.aShortArray144[local505];
						local47 = local1644.aShortArray149[local505] + (arg4 << super.anInt9638);
						arg6[local505] = 0;
						if (arg2) {
							local344 = -super.aClass14_Sub1_16.anInt5845 + super.anInt9237;
							if (local344 > 255) {
								local344 = 255;
							}
							if (local344 > 0) {
								arg6[local505] = local344;
								local418 = local344 * local1644.aShortArray146[local505] / 255;
								if (local418 > 0) {
									local42 -= local418;
								}
							}
						} else if (super.aClass14_Sub1_16.aBoolean411) {
							local344 = super.anInt9237 - super.aClass14_Sub1_16.anInt5845;
							if (local344 > 0) {
								arg6[local505] = local344;
								if (arg6[local505] > 255) {
									arg6[local505] = 255;
								}
							}
						}
						local372 = super.anInt9233 + (super.anInt9230 * local42 + super.anInt9239 * local37 + local47 * super.anInt9238 >> 14);
						local315 = super.anInt9231 + (super.anInt9229 * local47 + local42 * super.anInt9228 + super.anInt9227 * local37 >> 14);
						arg1[local505] = arg7.anInt5285 + super.aClass14_Sub1_16.anInt5818 * local315 / super.anInt9237;
						arg0[local505] = local372 * super.aClass14_Sub1_16.anInt5835 / super.anInt9237 + arg7.anInt5282;
						arg3[local505] = super.anInt9237;
					}
				}
				if (local1644.aShortArray147 == null) {
					for (local505 = 0; local505 < local1644.aShort115; local505++) {
						local344 = local505 * 3;
						local418 = local344 + 1;
						local477 = local418 + 1;
						local516 = arg1[local344];
						local299 = arg1[local418];
						local361 = arg1[local477];
						local407 = arg0[local344];
						local466 = arg0[local418];
						local333 = arg0[local477];
						local389 = arg6[local477] + arg6[local418] + arg6[local344];
						if (-((local407 - local466) * (local361 + -local299)) + (local333 - local466) * (-local299 + local516) > 0) {
							arg7.aBoolean378 = local516 < 0 || local299 < 0 || local361 < 0 || local516 > arg7.anInt5281 || arg7.anInt5281 < local299 || arg7.anInt5281 < local361;
							if (local389 >= 765) {
								arg7.method4567(local407, local466, local333, local516, local299, local361, arg3[local344], arg3[local418], arg3[local477], super.aClass14_Sub1_16.anInt5842);
							} else if (local389 > 0) {
								if ((local1644.anIntArray702[local344] & 0xFFFFFF) != 0) {
									arg7.method4585(local407, local466, local333, local516, local299, local361, arg3[local344], arg3[local418], arg3[local477], Static305.method1156(local1644.anIntArray702[local344], arg6[local344], super.aClass14_Sub1_16.anInt5842), Static305.method1156(local1644.anIntArray702[local418], arg6[local418], super.aClass14_Sub1_16.anInt5842), Static305.method1156(local1644.anIntArray702[local477], arg6[local477], super.aClass14_Sub1_16.anInt5842));
								}
							} else if ((local1644.anIntArray702[local344] & 0xFFFFFF) != 0) {
								arg7.method4585(local407, local466, local333, local516, local299, local361, arg3[local344], arg3[local418], arg3[local477], local1644.anIntArray702[local344], local1644.anIntArray702[local418], local1644.anIntArray702[local477]);
							}
						}
					}
				} else {
					local505 = super.anIntArrayArray86[arg5][arg4];
					local344 = super.anIntArrayArray86[arg5 + 1][arg4];
					local418 = super.anIntArrayArray86[arg5][arg4 + 1];
					local477 = super.anInt9641 * arg5;
					local516 = local477 + super.anInt9641;
					local299 = arg4 * super.anInt9641;
					local361 = local299 + super.anInt9641;
					local407 = super.anInt9231 + (local505 * super.anInt9228 + local477 * super.anInt9227 + super.anInt9229 * local299 >> 14);
					local466 = (local299 * super.anInt9238 + local477 * super.anInt9239 + local505 * super.anInt9230 >> 14) + super.anInt9233;
					local333 = (super.anInt9232 * local505 + super.anInt9234 * local477 + local299 * super.anInt9235 >> 14) + super.anInt9236;
					local389 = (super.anInt9227 * local516 + local344 * super.anInt9228 + local299 * super.anInt9229 >> 14) + super.anInt9231;
					local448 = (super.anInt9238 * local299 + super.anInt9239 * local516 + super.anInt9230 * local344 >> 14) + super.anInt9233;
					local494 = (local299 * super.anInt9235 + local516 * super.anInt9234 + super.anInt9232 * local344 >> 14) + super.anInt9236;
					local99 = (local477 * super.anInt9227 + super.anInt9228 * local418 + local361 * super.anInt9229 >> 14) + super.anInt9231;
					local127 = (super.anInt9239 * local477 + local418 * super.anInt9230 + super.anInt9238 * local361 >> 14) + super.anInt9233;
					local152 = (local361 * super.anInt9235 + local418 * super.anInt9232 + super.anInt9234 * local477 >> 14) + super.anInt9236;
					for (local177 = 0; local177 < local1644.aShort115; local177++) {
						local49 = local177 * 3;
						local51 = local49 + 1;
						local53 = local51 + 1;
						local55 = arg1[local49];
						local207 = arg1[local51];
						local72 = arg1[local53];
						local82 = arg0[local49];
						local304 = arg0[local51];
						local554 = arg0[local53];
						local782 = arg6[local49] + arg6[local51] + arg6[local53];
						if (-((local82 - local304) * (-local207 + local72)) + (local554 - local304) * (local55 + -local207) > 0) {
							arg7.aBoolean378 = local55 < 0 || local207 < 0 || local72 < 0 || arg7.anInt5281 < local55 || local207 > arg7.anInt5281 || local72 > arg7.anInt5281;
							@Pc(2396) short local2396 = local1644.aShortArray147[local177];
							if (local782 >= 765) {
								arg7.method4567(local82, local304, local554, local55, local207, local72, arg3[local49], arg3[local51], arg3[local53], super.aClass14_Sub1_16.anInt5842);
							} else {
								if (local2396 != -1 && this.method7559(super.aClass14_Sub1_16.anInterface4_15.method4234(local2396).aByte98)) {
									arg7.anInt5283 = 100;
								}
								if (local782 <= 0) {
									if (local2396 != -1) {
										arg7.method4571(local82, local304, local554, local55, local207, local72, arg3[local49], arg3[local51], arg3[local53], local1644.anIntArray702[local49], local1644.anIntArray702[local51], local1644.anIntArray702[local53], local407, local389, local99, local466, local448, local127, local333, local494, local152, local2396);
									} else if ((local1644.anIntArray702[local49] & 0xFFFFFF) != 0) {
										arg7.method4585(local82, local304, local554, local55, local207, local72, arg3[local49], arg3[local51], arg3[local53], local1644.anIntArray702[local49], local1644.anIntArray702[local51], local1644.anIntArray702[local53]);
									}
								} else if (local2396 != -1) {
									arg7.method4572(local82, local304, local554, local55, local207, local72, arg3[local49], arg3[local51], arg3[local53], super.aClass14_Sub1_16.anInt5842, arg6[local49], arg6[local51], arg6[local53], local1644.anIntArray702[local49], local1644.anIntArray702[local51], local1644.anIntArray702[local53], local407, local389, local99, local466, local448, local127, local333, local494, local152, local2396);
								} else if ((local1644.anIntArray702[local49] & 0xFFFFFF) != 0) {
									arg7.method4585(local82, local304, local554, local55, local207, local72, arg3[local49], arg3[local51], arg3[local53], Static412.method5964(arg6[local49] << 24 | super.aClass14_Sub1_16.anInt5842, local1644.anIntArray702[local49]), Static412.method5964(super.aClass14_Sub1_16.anInt5842 | arg6[local51] << 24, local1644.anIntArray702[local51]), Static412.method5964(arg6[local53] << 24 | super.aClass14_Sub1_16.anInt5842, local1644.anIntArray702[local53]));
								}
								arg7.anInt5283 = 0;
							}
						}
					}
				}
			}
		} else if ((local16.aByte24 & 0x2) == 0) {
			@Pc(32) int local32 = arg5 * super.anInt9641;
			local37 = super.anInt9641 + local32;
			local42 = super.anInt9641 * arg4;
			local47 = super.anInt9641 + local42;
			local49 = 0;
			local51 = 0;
			local53 = 0;
			local55 = 0;
			if ((local16.aByte24 & 0x1) == 0 || arg2) {
				local72 = super.anIntArrayArray86[arg5][arg4];
				local82 = super.anIntArrayArray86[arg5 + 1][arg4];
				local304 = super.anIntArrayArray86[arg5 + 1][arg4 + 1];
				local554 = super.anIntArrayArray86[arg5][arg4 + 1];
				if (super.anInt9237 == -1) {
					local99 = (super.anInt9235 * local42 + local32 * super.anInt9234 + local72 * super.anInt9232 >> 14) + super.anInt9236;
					if (super.aClass14_Sub1_16.anInt5826 >= local99) {
						return;
					}
					local127 = (super.anInt9234 * local37 + local82 * super.anInt9232 + local42 * super.anInt9235 >> 14) + super.anInt9236;
					if (super.aClass14_Sub1_16.anInt5826 >= local127) {
						return;
					}
					local152 = super.anInt9236 + (local37 * super.anInt9234 + super.anInt9232 * local304 + super.anInt9235 * local47 >> 14);
					if (local152 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
					local177 = (local47 * super.anInt9235 + local32 * super.anInt9234 + local554 * super.anInt9232 >> 14) + super.anInt9236;
					if (local177 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
				} else {
					local177 = super.anInt9237;
					local152 = super.anInt9237;
					local127 = super.anInt9237;
					local99 = super.anInt9237;
				}
				if (arg2) {
					local207 = local99 - super.aClass14_Sub1_16.anInt5845;
					if (local207 > 255) {
						local207 = 255;
					}
					if (local207 > 0) {
						local49 = local207;
						local782 = local16.aShort23 * local207 / 255;
						if (local782 > 0) {
							local72 -= local782;
						}
					}
					local207 = local127 - super.aClass14_Sub1_16.anInt5845;
					if (local207 > 255) {
						local207 = 255;
					}
					if (local207 > 0) {
						local51 = local207;
						local782 = local16.aShort19 * local207 / 255;
						if (local782 > 0) {
							local82 -= local782;
						}
					}
					local207 = local152 - super.aClass14_Sub1_16.anInt5845;
					if (local207 > 255) {
						local207 = 255;
					}
					if (local207 > 0) {
						local53 = local207;
						local782 = local207 * local16.aShort21 / 255;
						if (local782 > 0) {
							local304 -= local782;
						}
					}
					local207 = local177 - super.aClass14_Sub1_16.anInt5845;
					if (local207 > 255) {
						local207 = 255;
					}
					if (local207 > 0) {
						local55 = local207;
						local782 = local207 * local16.aShort22 / 255;
						if (local782 > 0) {
							local554 -= local782;
						}
					}
				} else if (super.aClass14_Sub1_16.aBoolean411) {
					local207 = local99 - super.aClass14_Sub1_16.anInt5845;
					if (local207 > 0) {
						local49 = local207;
						if (local207 > 255) {
							local49 = 255;
						}
					}
					local207 = local127 - super.aClass14_Sub1_16.anInt5845;
					if (local207 > 0) {
						local51 = local207;
						if (local207 > 255) {
							local51 = 255;
						}
					}
					local207 = local152 - super.aClass14_Sub1_16.anInt5845;
					if (local207 > 0) {
						local53 = local207;
						if (local207 > 255) {
							local53 = 255;
						}
					}
					local207 = local177 - super.aClass14_Sub1_16.anInt5845;
					if (local207 > 0) {
						local55 = local207;
						if (local207 > 255) {
							local55 = 255;
						}
					}
				}
				local299 = (super.anInt9229 * local42 + local32 * super.anInt9227 + local72 * super.anInt9228 >> 14) + super.anInt9231;
				local333 = super.anInt9233 + (super.anInt9238 * local42 + local72 * super.anInt9230 + super.anInt9239 * local32 >> 14);
				local315 = local299 * super.aClass14_Sub1_16.anInt5818 / local99 + arg7.anInt5285;
				local344 = super.aClass14_Sub1_16.anInt5835 * local333 / local99 + arg7.anInt5282;
				local361 = (local42 * super.anInt9229 + local37 * super.anInt9227 + local82 * super.anInt9228 >> 14) + super.anInt9231;
				local372 = super.aClass14_Sub1_16.anInt5818 * local361 / local127 + arg7.anInt5285;
				local389 = super.anInt9233 + (local37 * super.anInt9239 + local82 * super.anInt9230 + super.anInt9238 * local42 >> 14);
				local418 = super.aClass14_Sub1_16.anInt5835 * local389 / local127 + arg7.anInt5282;
				local407 = (super.anInt9227 * local37 + local304 * super.anInt9228 + local47 * super.anInt9229 >> 14) + super.anInt9231;
				local448 = (local47 * super.anInt9238 + local304 * super.anInt9230 + local37 * super.anInt9239 >> 14) + super.anInt9233;
				local429 = arg7.anInt5285 + local407 * super.aClass14_Sub1_16.anInt5818 / local152;
				local477 = arg7.anInt5282 + super.aClass14_Sub1_16.anInt5835 * local448 / local152;
				local466 = super.anInt9231 + (super.anInt9229 * local47 + local32 * super.anInt9227 + local554 * super.anInt9228 >> 14);
				local505 = local466 * super.aClass14_Sub1_16.anInt5818 / local177 + arg7.anInt5285;
				local494 = super.anInt9233 + (super.anInt9239 * local32 + local554 * super.anInt9230 + super.anInt9238 * local47 >> 14);
				local516 = arg7.anInt5282 + super.aClass14_Sub1_16.anInt5835 * local494 / local177;
			} else {
				local72 = super.anIntArrayArray86[arg5][arg4];
				if (super.anInt9237 == -1) {
					local82 = local72 * super.anInt9232;
					local99 = (local42 * super.anInt9235 + local82 + local32 * super.anInt9234 >> 14) + super.anInt9236;
					if (super.aClass14_Sub1_16.anInt5826 >= local99) {
						return;
					}
					local127 = super.anInt9236 + (super.anInt9235 * local42 + local82 + super.anInt9234 * local37 >> 14);
					if (super.aClass14_Sub1_16.anInt5826 >= local127) {
						return;
					}
					local152 = super.anInt9236 + (local82 + super.anInt9234 * local37 + local47 * super.anInt9235 >> 14);
					if (super.aClass14_Sub1_16.anInt5826 >= local152) {
						return;
					}
					local177 = super.anInt9236 + (local32 * super.anInt9234 + local82 + local47 * super.anInt9235 >> 14);
					if (super.aClass14_Sub1_16.anInt5826 >= local177) {
						return;
					}
				} else {
					local177 = super.anInt9237;
					local152 = super.anInt9237;
					local127 = super.anInt9237;
					local99 = super.anInt9237;
				}
				if (super.aClass14_Sub1_16.aBoolean411) {
					local207 = local99 - super.aClass14_Sub1_16.anInt5845;
					if (local207 > 0) {
						local49 = local207;
						if (local207 > 255) {
							local49 = 255;
						}
					}
					local207 = local127 - super.aClass14_Sub1_16.anInt5845;
					if (local207 > 0) {
						local51 = local207;
						if (local207 > 255) {
							local51 = 255;
						}
					}
					local207 = local152 - super.aClass14_Sub1_16.anInt5845;
					if (local207 > 0) {
						local53 = local207;
						if (local207 > 255) {
							local53 = 255;
						}
					}
					local207 = local177 - super.aClass14_Sub1_16.anInt5845;
					if (local207 > 0) {
						local55 = local207;
						if (local207 > 255) {
							local55 = 255;
						}
					}
				}
				local82 = super.anInt9228 * local72;
				local299 = super.anInt9231 + (local82 + super.anInt9227 * local32 + super.anInt9229 * local42 >> 14);
				local304 = super.anInt9230 * local72;
				local315 = arg7.anInt5285 + super.aClass14_Sub1_16.anInt5818 * local299 / local99;
				local333 = (local304 + super.anInt9239 * local32 + super.anInt9238 * local42 >> 14) + super.anInt9233;
				local344 = arg7.anInt5282 + super.aClass14_Sub1_16.anInt5835 * local333 / local99;
				local361 = (super.anInt9227 * local37 + local82 + super.anInt9229 * local42 >> 14) + super.anInt9231;
				local372 = super.aClass14_Sub1_16.anInt5818 * local361 / local127 + arg7.anInt5285;
				local389 = (local37 * super.anInt9239 + local304 + super.anInt9238 * local42 >> 14) + super.anInt9233;
				local407 = super.anInt9231 + (local82 + super.anInt9227 * local37 + super.anInt9229 * local47 >> 14);
				local418 = local389 * super.aClass14_Sub1_16.anInt5835 / local127 + arg7.anInt5282;
				local429 = super.aClass14_Sub1_16.anInt5818 * local407 / local152 + arg7.anInt5285;
				local448 = super.anInt9233 + (local304 + local37 * super.anInt9239 + local47 * super.anInt9238 >> 14);
				local466 = (local32 * super.anInt9227 + local82 + super.anInt9229 * local47 >> 14) + super.anInt9231;
				local477 = super.aClass14_Sub1_16.anInt5835 * local448 / local152 + arg7.anInt5282;
				local494 = super.anInt9233 + (super.anInt9238 * local47 + local304 + local32 * super.anInt9239 >> 14);
				local505 = super.aClass14_Sub1_16.anInt5818 * local466 / local177 + arg7.anInt5285;
				local516 = super.aClass14_Sub1_16.anInt5835 * local494 / local177 + arg7.anInt5282;
			}
			@Pc(1163) boolean local1163 = local16.aShort20 != -1 && this.method7559(super.aClass14_Sub1_16.anInterface4_15.method4234(local16.aShort20).aByte98);
			local82 = local51 + local53 + local55;
			if (-((local477 - local516) * (-local505 + local372)) + (local429 - local505) * (-local516 + local418) > 0) {
				arg7.aBoolean378 = local429 < 0 || local505 < 0 || local372 < 0 || local429 > arg7.anInt5281 || arg7.anInt5281 < local505 || local372 > arg7.anInt5281;
				if (local82 >= 765) {
					arg7.method4567(local477, local516, local418, local429, local505, local372, local152, local177, local127, super.aClass14_Sub1_16.anInt5842);
				} else {
					if (local1163) {
						arg7.anInt5283 = 100;
					}
					if (local82 > 0) {
						if (local16.aShort20 < 0) {
							arg7.method4585(local477, local516, local418, local429, local505, local372, local152, local177, local127, Static412.method5964(super.aClass14_Sub1_16.anInt5842 | local53 << 24, local16.anInt1482), Static412.method5964(super.aClass14_Sub1_16.anInt5842 | local55 << 24, local16.anInt1483), Static412.method5964(local51 << 24 | super.aClass14_Sub1_16.anInt5842, local16.anInt1486));
						} else {
							arg7.method4572(local477, local516, local418, local429, local505, local372, local152, local177, local127, super.aClass14_Sub1_16.anInt5842, local53, local55, local51, local16.anInt1482, local16.anInt1483, local16.anInt1486, local407, local466, local361, local448, local494, local389, local152, local177, local127, local16.aShort20);
						}
					} else if (local16.aShort20 >= 0) {
						arg7.method4571(local477, local516, local418, local429, local505, local372, local152, local177, local127, local16.anInt1482, local16.anInt1483, local16.anInt1486, local407, local466, local361, local448, local494, local389, local152, local177, local127, local16.aShort20);
					} else {
						arg7.method4585(local477, local516, local418, local429, local505, local372, local152, local177, local127, local16.anInt1482, local16.anInt1483, local16.anInt1486);
					}
					arg7.anInt5283 = 0;
				}
			}
			local82 = local55 + local49 + local51;
			if (-((local505 - local372) * (local344 + -local418)) + (local516 - local418) * (-local372 + local315) > 0) {
				arg7.aBoolean378 = local315 < 0 || local372 < 0 || local505 < 0 || arg7.anInt5281 < local315 || local372 > arg7.anInt5281 || arg7.anInt5281 < local505;
				if (local82 < 765) {
					if (local1163) {
						arg7.anInt5283 = 100;
					}
					if (local82 > 0) {
						if (local16.aShort20 < 0) {
							arg7.method4585(local344, local418, local516, local315, local372, local505, local99, local127, local177, Static412.method5964(local49 << 24 | super.aClass14_Sub1_16.anInt5842, local16.anInt1484), Static412.method5964(super.aClass14_Sub1_16.anInt5842 | local51 << 24, local16.anInt1486), Static412.method5964(local55 << 24 | super.aClass14_Sub1_16.anInt5842, local16.anInt1483));
						} else {
							arg7.method4572(local344, local418, local516, local315, local372, local505, local99, local127, local177, super.aClass14_Sub1_16.anInt5842, local49, local51, local55, local16.anInt1484, local16.anInt1486, local16.anInt1483, local299, local361, local466, local333, local389, local494, local99, local127, local177, local16.aShort20);
						}
					} else if (local16.aShort20 < 0) {
						arg7.method4585(local344, local418, local516, local315, local372, local505, local99, local127, local177, local16.anInt1484, local16.anInt1486, local16.anInt1483);
					} else {
						arg7.method4571(local344, local418, local516, local315, local372, local505, local99, local127, local177, local16.anInt1484, local16.anInt1486, local16.anInt1483, local299, local361, local466, local333, local389, local494, local99, local127, local177, local16.aShort20);
					}
					arg7.anInt5283 = 0;
					return;
				}
				arg7.method4567(local344, local418, local516, local315, local372, local505, local99, local127, local177, super.aClass14_Sub1_16.anInt5842);
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)V")
	@Override
	public void method7862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class44_Sub1 local9 = (Class44_Sub1) super.aClass14_Sub1_16.method5048(Thread.currentThread());
		local9.aClass188_1.anInt5283 = 0;
		if (super.aClass52ArrayArray3 != null) {
			this.method4612(local9.anIntArray623, local9.anIntArray610, super.aClass14_Sub1_16.aBoolean409, local9.anIntArray615, arg1, arg0, local9.anIntArray612, local9.aClass188_1);
		} else if (super.aClass150ArrayArray3 != null) {
			this.method4616(arg0, local9.aClass188_1, local9.anIntArray623, local9.anIntArray612, local9.anIntArray615, local9.anIntArray610, arg1);
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7864(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class44_Sub1 local9 = (Class44_Sub1) super.aClass14_Sub1_16.method5048(Thread.currentThread());
		@Pc(12) Class188 local12 = local9.aClass188_1;
		local12.anInt5283 = 0;
		local12.aBoolean378 = false;
		super.aClass14_Sub1_16.method6892();
		if (super.aClass52ArrayArray3 != null) {
			this.method4615(arg0, local9.anIntArray610, arg2, arg1, arg3, arg4, local12, local9.anIntArray623);
		} else if (super.aClass150ArrayArray3 != null) {
			this.method4618(arg0, arg3, local9.anIntArray610, local12, arg2, arg4, local9.anIntArray623, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(9) Class54_Sub1 local9 = super.aClass14_Sub1_16.aClass54_Sub1_7;
		super.anInt9237 = -1;
		super.anInt9229 = local9.anInt1506;
		super.anInt9230 = local9.anInt1511;
		super.anInt9228 = local9.anInt1505;
		super.anInt9235 = local9.anInt1507;
		super.anInt9231 = local9.anInt1510;
		super.anInt9233 = local9.anInt1501;
		super.anInt9227 = local9.anInt1500;
		super.anInt9234 = local9.anInt1508;
		super.anInt9236 = local9.anInt1509;
		super.anInt9232 = local9.anInt1504;
		super.anInt9239 = local9.anInt1503;
		super.anInt9238 = local9.anInt1502;
		for (@Pc(62) int local62 = 0; local62 < arg2 + arg2; local62++) {
			for (@Pc(66) int local66 = 0; local66 < arg2 + arg2; local66++) {
				if (arg3[local62][local66]) {
					@Pc(81) int local81 = local62 + arg0 - arg2;
					@Pc(89) int local89 = arg1 + local66 - arg2;
					if (local81 >= 0 && local81 < super.anInt9640 && local89 >= 0 && local89 < super.anInt9639) {
						this.method7862(local81, local89);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II[IBIIII[[ZILclient!lca;[I)V")
	private void method4615(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) boolean[][] arg5, @OriginalArg(10) Class188 arg6, @OriginalArg(11) int[] arg7) {
		@Pc(14) int local14 = (arg4 - arg3) * 1024 / 256;
		@Pc(23) boolean local23 = ((Class14_Sub1_Sub2) super.aClass14_Sub1_16).aBoolean412;
		super.aClass14_Sub1_16.method6880(false);
		arg6.aBoolean377 = false;
		arg6.aBoolean376 = false;
		@Pc(40) int local40 = 0;
		@Pc(44) int local44 = local14;
		for (@Pc(46) int local46 = arg0; local46 < arg2; local46++) {
			for (@Pc(50) int local50 = arg3; local50 < arg4; local50++) {
				if (arg5[local46 - arg0][local50 - arg3]) {
					@Pc(105) int local105;
					if (super.aClass52ArrayArray3[local46][local50] != null) {
						@Pc(78) Class52 local78 = super.aClass52ArrayArray3[local46][local50];
						if (local78.aShort20 != -1 && (local78.aByte24 & 0x2) == 0 && local78.anInt1485 == 0) {
							local105 = super.aClass14_Sub1_16.method5050(local78.aShort20);
							arg6.method4568(local44 - 4, local44 + -4, local44, local40 + 4, local40, local40 + 4, 100, 100, 100, Static85.method1643(local105, local78.anInt1482), Static85.method1643(local105, local78.anInt1483), Static85.method1643(local105, local78.anInt1486));
							arg6.method4568(local44, local44, local44 - 4, local40, local40 + 4, local40, 100, 100, 100, Static85.method1643(local105, local78.anInt1484), Static85.method1643(local105, local78.anInt1486), Static85.method1643(local105, local78.anInt1483));
						} else if (local78.anInt1485 == 0) {
							arg6.method4585(local44 - 4, local44 + -4, local44, local40 + 4, local40, local40 + 4, 100, 100, 100, local78.anInt1482, local78.anInt1483, local78.anInt1486);
							arg6.method4585(local44, local44, local44 - 4, local40, local40 + 4, local40, 100, 100, 100, local78.anInt1484, local78.anInt1486, local78.anInt1483);
						} else {
							local105 = local78.anInt1485;
							arg6.method4585(local44 - 4, local44 + -4, local44, local40 + 4, local40, local40 + 4, 100, 100, 100, Static412.method5964(local78.anInt1482 & 0xFF000000, local105), Static412.method5964(local78.anInt1483 & 0xFF000000, local105), Static412.method5964(local78.anInt1486 & 0xFF000000, local105));
							arg6.method4585(local44, local44, local44 - 4, local40, local40 + 4, local40, 100, 100, 100, Static412.method5964(local78.anInt1484 & 0xFF000000, local105), Static412.method5964(local78.anInt1486 & 0xFF000000, local105), Static412.method5964(local78.anInt1483 & 0xFF000000, local105));
						}
					} else if (super.aClass347ArrayArray3[local46][local50] != null) {
						@Pc(324) Class347 local324 = super.aClass347ArrayArray3[local46][local50];
						for (local105 = 0; local105 < local324.aShort116; local105++) {
							arg1[local105] = local324.aShortArray148[local105] * 4 / super.anInt9641 + local40;
							arg7[local105] = local44 - local324.aShortArray149[local105] * 4 / super.anInt9641;
						}
						for (@Pc(364) int local364 = 0; local364 < local324.aShort115; local364++) {
							@Pc(370) int local370 = local364 * 3;
							@Pc(374) int local374 = local370 + 1;
							@Pc(378) int local378 = local374 + 1;
							@Pc(382) int local382 = arg1[local370];
							@Pc(386) int local386 = arg1[local374];
							@Pc(390) int local390 = arg1[local378];
							@Pc(394) int local394 = arg7[local370];
							@Pc(398) int local398 = arg7[local374];
							@Pc(402) int local402 = arg7[local378];
							@Pc(440) int local440;
							if (local324.anIntArray701 != null && local324.anIntArray701[local364] != 0 && (local324.aShortArray147 == null || local324.aShortArray147 != null && local324.aShortArray147[local364] == -1)) {
								local440 = local324.anIntArray701[local364];
								arg6.method4585(local394, local398, local402, local382, local386, local390, 100, 100, 100, Static412.method5964(-(local324.anIntArray702[local370] & -16777216) - 16777216, local440), Static412.method5964(-(local324.anIntArray702[local374] & 0xFF000000) - 16777216, local440), Static412.method5964(-(local324.anIntArray702[local378] & 0xFF000000) - 16777216, local440));
							} else if (local324.aShortArray147 == null || local324.aShortArray147[local364] == -1) {
								arg6.method4585(local394, local398, local402, local382, local386, local390, 100, 100, 100, local324.anIntArray702[local370], local324.anIntArray702[local374], local324.anIntArray702[local378]);
							} else {
								local440 = super.aClass14_Sub1_16.method5050(local324.aShortArray147[local364]);
								arg6.method4568(local394, local398, local402, local382, local386, local390, 100, 100, 100, local440, local440, local440);
							}
						}
					}
				}
				local44 -= 4;
			}
			local44 = local14;
			local40 += 4;
		}
		arg6.aBoolean376 = true;
		super.aClass14_Sub1_16.method6880(local23);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILclient!lca;[I[I[I[IZI)V")
	private void method4616(@OriginalArg(0) int arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class150 local12 = super.aClass150ArrayArray3[arg0][arg6];
		@Pc(30) int local30;
		@Pc(40) int local40;
		@Pc(214) int local214;
		@Pc(291) int local291;
		@Pc(347) int local347;
		@Pc(386) int local386;
		@Pc(414) int local414;
		@Pc(198) int local198;
		@Pc(261) int local261;
		@Pc(308) int local308;
		@Pc(375) int local375;
		@Pc(232) int local232;
		@Pc(280) int local280;
		@Pc(336) int local336;
		@Pc(403) int local403;
		@Pc(79) int local79;
		@Pc(108) int local108;
		@Pc(132) int local132;
		@Pc(159) int local159;
		@Pc(452) int local452;
		@Pc(243) int local243;
		@Pc(319) int local319;
		@Pc(358) int local358;
		if (local12 == null) {
			@Pc(1109) Class82 local1109 = super.aClass82ArrayArray3[arg0][arg6];
			if (local1109 != null) {
				@Pc(1135) short local1135;
				if (super.anInt9237 == -1) {
					for (local386 = 0; local386 < local1109.aShort28; local386++) {
						local30 = local1109.aShortArray20[local386] + (arg0 << super.anInt9638);
						local1135 = local1109.aShortArray23[local386];
						local40 = local1109.aShortArray19[local386] + (arg6 << super.anInt9638);
						local347 = (local40 * super.anInt9235 + super.anInt9232 * local1135 + super.anInt9234 * local30 >> 14) + super.anInt9236;
						if (local347 <= super.aClass14_Sub1_16.anInt5826) {
							return;
						}
						local214 = (super.anInt9227 * local30 + local1135 * super.anInt9228 + local40 * super.anInt9229 >> 14) + super.anInt9231;
						local291 = super.anInt9233 + (super.anInt9230 * local1135 + local30 * super.anInt9239 + super.anInt9238 * local40 >> 14);
						arg5[local386] = local214 * super.aClass14_Sub1_16.anInt5818 / local347 + arg1.anInt5285;
						arg2[local386] = local291 * super.aClass14_Sub1_16.anInt5835 / local347 + arg1.anInt5282;
						arg4[local386] = local347;
					}
				} else {
					for (local386 = 0; local386 < local1109.aShort28; local386++) {
						local30 = local1109.aShortArray20[local386] + (arg0 << super.anInt9638);
						local1135 = local1109.aShortArray23[local386];
						local40 = local1109.aShortArray19[local386] + (arg6 << super.anInt9638);
						local214 = (local40 * super.anInt9229 + local30 * super.anInt9227 + super.anInt9228 * local1135 >> 14) + super.anInt9231;
						local291 = super.anInt9233 + (super.anInt9239 * local30 + super.anInt9230 * local1135 + local40 * super.anInt9238 >> 14);
						arg5[local386] = arg1.anInt5285 + local214 * super.aClass14_Sub1_16.anInt5818 / super.anInt9237;
						arg2[local386] = arg1.anInt5282 + super.aClass14_Sub1_16.anInt5835 * local291 / super.anInt9237;
						arg4[local386] = super.anInt9237;
					}
				}
				if (local1109.aShortArray17 == null) {
					for (local386 = 0; local386 < local1109.aShort27; local386++) {
						@Pc(1822) short local1822 = local1109.aShortArray21[local386];
						@Pc(1827) short local1827 = local1109.aShortArray18[local386];
						@Pc(1832) short local1832 = local1109.aShortArray15[local386];
						local414 = arg5[local1822];
						local198 = arg5[local1827];
						local261 = arg5[local1832];
						local308 = arg2[local1822];
						local375 = arg2[local1827];
						local232 = arg2[local1832];
						if ((local414 - local198) * (local232 - local375) - (local261 - local198) * (local308 - local375) > 0) {
							local280 = local1109.anIntArray165[local386];
							if (local280 != -1) {
								arg1.aBoolean378 = local414 < 0 || local198 < 0 || local261 < 0 || arg1.anInt5281 < local414 || local198 > arg1.anInt5281 || local261 > arg1.anInt5281;
								arg1.method4568(local308, local375, local232, local414, local198, local261, arg4[local1822], arg4[local1827], arg4[local1832], Static85.method1643(local280, local1109.aShortArray22[local1822]), Static85.method1643(local280, local1109.aShortArray22[local1827]), Static85.method1643(local280, local1109.aShortArray22[local1832]));
							}
						}
					}
				} else {
					local386 = super.anIntArrayArray86[arg0][arg6];
					local243 = super.anIntArrayArray86[arg0 + 1][arg6];
					local319 = super.anIntArrayArray86[arg0][arg6 + 1];
					local358 = arg0 * super.anInt9641;
					local414 = local358 + super.anInt9641;
					local198 = arg6 * super.anInt9641;
					local261 = super.anInt9641 + local198;
					local308 = (local386 * super.anInt9228 + super.anInt9227 * local358 + super.anInt9229 * local198 >> 14) + super.anInt9231;
					local375 = (local198 * super.anInt9238 + local386 * super.anInt9230 + super.anInt9239 * local358 >> 14) + super.anInt9233;
					local232 = (super.anInt9235 * local198 + local358 * super.anInt9234 + local386 * super.anInt9232 >> 14) + super.anInt9236;
					local280 = (local243 * super.anInt9228 + local414 * super.anInt9227 + local198 * super.anInt9229 >> 14) + super.anInt9231;
					local336 = (local198 * super.anInt9238 + local243 * super.anInt9230 + super.anInt9239 * local414 >> 14) + super.anInt9233;
					local403 = (local243 * super.anInt9232 + super.anInt9234 * local414 + local198 * super.anInt9235 >> 14) + super.anInt9236;
					local79 = (super.anInt9229 * local261 + local358 * super.anInt9227 + local319 * super.anInt9228 >> 14) + super.anInt9231;
					local108 = (local319 * super.anInt9230 + local358 * super.anInt9239 + local261 * super.anInt9238 >> 14) + super.anInt9233;
					local132 = (super.anInt9235 * local261 + local319 * super.anInt9232 + super.anInt9234 * local358 >> 14) + super.anInt9236;
					for (local159 = 0; local159 < local1109.aShort27; local159++) {
						@Pc(1604) short local1604 = local1109.aShortArray21[local159];
						@Pc(1609) short local1609 = local1109.aShortArray18[local159];
						@Pc(1614) short local1614 = local1109.aShortArray15[local159];
						local452 = arg5[local1604];
						@Pc(1622) int local1622 = arg5[local1609];
						@Pc(1626) int local1626 = arg5[local1614];
						@Pc(1630) int local1630 = arg2[local1604];
						@Pc(1634) int local1634 = arg2[local1609];
						@Pc(1638) int local1638 = arg2[local1614];
						if ((local1638 - local1634) * (-local1622 + local452) - (local1626 - local1622) * (local1630 - local1634) > 0) {
							arg1.aBoolean378 = local452 < 0 || local1622 < 0 || local1626 < 0 || local452 > arg1.anInt5281 || arg1.anInt5281 < local1622 || local1626 > arg1.anInt5281;
							@Pc(1700) short local1700 = local1109.aShortArray17[local159];
							if (local1700 == -1) {
								@Pc(1765) int local1765 = local1109.anIntArray165[local159];
								if (local1765 != -1) {
									arg1.method4568(local1630, local1634, local1638, local452, local1622, local1626, arg4[local1604], arg4[local1609], arg4[local1614], Static85.method1643(local1765, local1109.aShortArray22[local1604]), Static85.method1643(local1765, local1109.aShortArray22[local1609]), Static85.method1643(local1765, local1109.aShortArray22[local1614]));
								}
							} else {
								if (this.method7559(super.aClass14_Sub1_16.anInterface4_15.method4234(local1700).aByte98)) {
									arg1.anInt5283 = 100;
								}
								arg1.method4571(local1630, local1634, local1638, local452, local1622, local1626, arg4[local1604], arg4[local1609], arg4[local1614], local1109.aShortArray22[local1604], local1109.aShortArray22[local1609], local1109.aShortArray22[local1614], local308, local280, local79, local375, local336, local108, local232, local403, local132, local1700);
								arg1.anInt5283 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte37 & 0x2) == 0) {
			@Pc(25) int local25 = arg0 * super.anInt9641;
			local30 = super.anInt9641 + local25;
			@Pc(35) int local35 = super.anInt9641 * arg6;
			local40 = super.anInt9641 + local35;
			@Pc(52) int local52;
			@Pc(61) int local61;
			@Pc(203) int local203;
			if ((local12.aByte37 & 0x1) == 0) {
				local52 = super.anIntArrayArray86[arg0][arg6];
				local61 = super.anIntArrayArray86[arg0 + 1][arg6];
				local203 = super.anIntArrayArray86[arg0 + 1][arg6 + 1];
				local452 = super.anIntArrayArray86[arg0][arg6 + 1];
				if (super.anInt9237 == -1) {
					local79 = super.anInt9236 + (local35 * super.anInt9235 + local25 * super.anInt9234 + super.anInt9232 * local52 >> 14);
					if (local79 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
					local108 = super.anInt9236 + (super.anInt9234 * local30 + local61 * super.anInt9232 + local35 * super.anInt9235 >> 14);
					if (local108 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
					local132 = (super.anInt9235 * local40 + super.anInt9234 * local30 + local203 * super.anInt9232 >> 14) + super.anInt9236;
					if (super.aClass14_Sub1_16.anInt5826 >= local132) {
						return;
					}
					local159 = super.anInt9236 + (super.anInt9235 * local40 + local452 * super.anInt9232 + local25 * super.anInt9234 >> 14);
					if (local159 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
				} else {
					local159 = super.anInt9237;
					local132 = super.anInt9237;
					local108 = super.anInt9237;
					local79 = super.anInt9237;
				}
				local198 = (local52 * super.anInt9228 + super.anInt9227 * local25 + super.anInt9229 * local35 >> 14) + super.anInt9231;
				local214 = arg1.anInt5285 + super.aClass14_Sub1_16.anInt5818 * local198 / local79;
				local232 = super.anInt9233 + (super.anInt9239 * local25 + super.anInt9230 * local52 + super.anInt9238 * local35 >> 14);
				local261 = (super.anInt9228 * local61 + local30 * super.anInt9227 + super.anInt9229 * local35 >> 14) + super.anInt9231;
				local243 = arg1.anInt5282 + local232 * super.aClass14_Sub1_16.anInt5835 / local79;
				local280 = (super.anInt9238 * local35 + super.anInt9230 * local61 + local30 * super.anInt9239 >> 14) + super.anInt9233;
				local291 = local261 * super.aClass14_Sub1_16.anInt5818 / local108 + arg1.anInt5285;
				local319 = super.aClass14_Sub1_16.anInt5835 * local280 / local108 + arg1.anInt5282;
				local308 = super.anInt9231 + (super.anInt9229 * local40 + super.anInt9227 * local30 + local203 * super.anInt9228 >> 14);
				local336 = (local40 * super.anInt9238 + local203 * super.anInt9230 + local30 * super.anInt9239 >> 14) + super.anInt9233;
				local347 = arg1.anInt5285 + local308 * super.aClass14_Sub1_16.anInt5818 / local132;
				local375 = super.anInt9231 + (local40 * super.anInt9229 + super.anInt9228 * local452 + local25 * super.anInt9227 >> 14);
				local358 = arg1.anInt5282 + local336 * super.aClass14_Sub1_16.anInt5835 / local132;
				local403 = super.anInt9233 + (super.anInt9230 * local452 + super.anInt9239 * local25 + super.anInt9238 * local40 >> 14);
				local386 = arg1.anInt5285 + super.aClass14_Sub1_16.anInt5818 * local375 / local159;
				local414 = arg1.anInt5282 + local403 * super.aClass14_Sub1_16.anInt5835 / local159;
			} else {
				local52 = super.anIntArrayArray86[arg0][arg6];
				if (super.anInt9237 == -1) {
					local61 = local52 * super.anInt9232;
					local79 = super.anInt9236 + (local35 * super.anInt9235 + local61 + super.anInt9234 * local25 >> 14);
					if (local79 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
					local108 = super.anInt9236 + (super.anInt9234 * local30 + local61 + super.anInt9235 * local35 >> 14);
					if (super.aClass14_Sub1_16.anInt5826 >= local108) {
						return;
					}
					local132 = (local40 * super.anInt9235 + local30 * super.anInt9234 + local61 >> 14) + super.anInt9236;
					if (local132 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
					local159 = (super.anInt9234 * local25 + local61 + super.anInt9235 * local40 >> 14) + super.anInt9236;
					if (local159 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
				} else {
					local159 = super.anInt9237;
					local132 = super.anInt9237;
					local108 = super.anInt9237;
					local79 = super.anInt9237;
				}
				local61 = super.anInt9228 * local52;
				local198 = (super.anInt9227 * local25 + local61 + local35 * super.anInt9229 >> 14) + super.anInt9231;
				local203 = super.anInt9230 * local52;
				local214 = super.aClass14_Sub1_16.anInt5818 * local198 / local79 + arg1.anInt5285;
				local232 = super.anInt9233 + (local203 + local25 * super.anInt9239 + local35 * super.anInt9238 >> 14);
				local243 = local232 * super.aClass14_Sub1_16.anInt5835 / local79 + arg1.anInt5282;
				local261 = super.anInt9231 + (local61 + local30 * super.anInt9227 + super.anInt9229 * local35 >> 14);
				local280 = super.anInt9233 + (local30 * super.anInt9239 + local203 + super.anInt9238 * local35 >> 14);
				local291 = arg1.anInt5285 + super.aClass14_Sub1_16.anInt5818 * local261 / local108;
				local308 = (super.anInt9229 * local40 + super.anInt9227 * local30 + local61 >> 14) + super.anInt9231;
				local319 = super.aClass14_Sub1_16.anInt5835 * local280 / local108 + arg1.anInt5282;
				local336 = (local40 * super.anInt9238 + local203 + super.anInt9239 * local30 >> 14) + super.anInt9233;
				local347 = arg1.anInt5285 + local308 * super.aClass14_Sub1_16.anInt5818 / local132;
				local358 = local336 * super.aClass14_Sub1_16.anInt5835 / local132 + arg1.anInt5282;
				local375 = super.anInt9231 + (super.anInt9229 * local40 + local61 + super.anInt9227 * local25 >> 14);
				local386 = local375 * super.aClass14_Sub1_16.anInt5818 / local159 + arg1.anInt5285;
				local403 = (super.anInt9238 * local40 + local203 + local25 * super.anInt9239 >> 14) + super.anInt9233;
				local414 = super.aClass14_Sub1_16.anInt5835 * local403 / local159 + arg1.anInt5282;
			}
			if (-((local291 - local386) * (local358 - local414)) + (local319 - local414) * (local347 - local386) > 0) {
				arg1.aBoolean378 = local347 < 0 || local386 < 0 || local291 < 0 || arg1.anInt5281 < local347 || arg1.anInt5281 < local386 || arg1.anInt5281 < local291;
				if (local12.aShort39 >= 0) {
					if (this.method7559(super.aClass14_Sub1_16.anInterface4_15.method4234(local12.aShort39).aByte98)) {
						arg1.anInt5283 = 100;
					}
					arg1.method4571(local358, local414, local319, local347, local386, local291, local132, local159, local108, local12.aShort42 & 0xFFFF, local12.aShort38 & 0xFFFF, local12.aShort41 & 0xFFFF, local198, local261, local375, local232, local280, local403, local79, local108, local159, local12.aShort39);
					arg1.anInt5283 = 0;
				} else {
					arg1.method4568(local358, local414, local319, local347, local386, local291, local132, local159, local108, local12.aShort42 & 0xFFFF, local12.aShort38 & 0xFFFF, local12.aShort41 & 0xFFFF);
				}
			}
			if ((local214 - local291) * (-local319 + local414) - (local243 - local319) * (local386 + -local291) > 0) {
				arg1.aBoolean378 = local214 < 0 || local291 < 0 || local386 < 0 || arg1.anInt5281 < local214 || arg1.anInt5281 < local291 || local386 > arg1.anInt5281;
				if (local12.aShort39 >= 0) {
					if (this.method7559(super.aClass14_Sub1_16.anInterface4_15.method4234(local12.aShort39).aByte98)) {
						arg1.anInt5283 = 100;
					}
					arg1.method4571(local243, local319, local414, local214, local291, local386, local79, local108, local159, local12.aShort40 & 0xFFFF, local12.aShort41 & 0xFFFF, local12.aShort38 & 0xFFFF, local198, local261, local375, local232, local280, local403, local79, local108, local159, local12.aShort39);
					arg1.anInt5283 = 0;
					return;
				}
				arg1.method4568(local243, local319, local414, local214, local291, local386, local79, local108, local159, local12.aShort40 & 0xFFFF, local12.aShort41 & 0xFFFF, local12.aShort38 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIII[ILclient!lca;II[[Z[III)V")
	private void method4618(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) Class188 arg3, @OriginalArg(6) int arg4, @OriginalArg(8) boolean[][] arg5, @OriginalArg(9) int[] arg6, @OriginalArg(11) int arg7) {
		@Pc(14) int local14 = (arg1 - arg7) * 1024 / 256;
		@Pc(23) boolean local23 = ((Class14_Sub1_Sub2) super.aClass14_Sub1_16).aBoolean412;
		super.aClass14_Sub1_16.method6880(false);
		arg3.aBoolean377 = false;
		arg3.aBoolean376 = false;
		@Pc(35) int local35 = 0;
		@Pc(49) int local49 = local14;
		for (@Pc(51) int local51 = arg0; local51 < arg4; local51++) {
			for (@Pc(55) int local55 = arg7; local55 < arg1; local55++) {
				if (arg5[local51 - arg0][local55 - arg7]) {
					@Pc(91) int local91;
					if (super.aClass150ArrayArray3[local51][local55] != null) {
						@Pc(337) Class150 local337 = super.aClass150ArrayArray3[local51][local55];
						if (local337.aShort39 != -1 && (local337.aByte37 & 0x2) == 0 && local337.anInt4322 == -1) {
							local91 = super.aClass14_Sub1_16.method5050(local337.aShort39);
							arg3.method4568(local49 - 4, local49 + -4, local49, local35 + 4, local35, local35 + 4, 100, 100, 100, Static85.method1643(local91, local337.aShort42 & 0xFFFF), Static85.method1643(local91, local337.aShort38 & 0xFFFF), Static85.method1643(local91, local337.aShort41 & 0xFFFF));
							arg3.method4568(local49, local49, local49 - 4, local35, local35 + 4, local35, 100, 100, 100, Static85.method1643(local91, local337.aShort40 & 0xFFFF), Static85.method1643(local91, local337.aShort41 & 0xFFFF), Static85.method1643(local91, local337.aShort38 & 0xFFFF));
						} else if (local337.anInt4322 == -1) {
							arg3.method4568(local49 - 4, local49 + -4, local49, local35 + 4, local35, local35 + 4, 100, 100, 100, local337.aShort42 & 0xFFFF, local337.aShort38 & 0xFFFF, local337.aShort41 & 0xFFFF);
							arg3.method4568(local49, local49, local49 - 4, local35, local35 + 4, local35, 100, 100, 100, local337.aShort40 & 0xFFFF, local337.aShort41 & 0xFFFF, local337.aShort38 & 0xFFFF);
						} else {
							local91 = local337.anInt4322;
							arg3.method4568(local49 - 4, local49 - 4, local49, local35 + 4, local35, local35 + 4, 100, 100, 100, local91, local91, local91);
							arg3.method4568(local49, local49, local49 - 4, local35, local35 + 4, local35, 100, 100, 100, local91, local91, local91);
						}
					} else if (super.aClass82ArrayArray3[local51][local55] != null) {
						@Pc(89) Class82 local89 = super.aClass82ArrayArray3[local51][local55];
						for (local91 = 0; local91 < local89.aShort28; local91++) {
							arg2[local91] = local35 + local89.aShortArray20[local91] * 4 / super.anInt9641;
							arg6[local91] = local49 - local89.aShortArray19[local91] * 4 / super.anInt9641;
						}
						for (@Pc(133) int local133 = 0; local133 < local89.aShort27; local133++) {
							@Pc(140) short local140 = local89.aShortArray21[local133];
							@Pc(145) short local145 = local89.aShortArray18[local133];
							@Pc(150) short local150 = local89.aShortArray15[local133];
							@Pc(154) int local154 = arg2[local140];
							@Pc(158) int local158 = arg2[local145];
							@Pc(162) int local162 = arg2[local150];
							@Pc(166) int local166 = arg6[local140];
							@Pc(170) int local170 = arg6[local145];
							@Pc(174) int local174 = arg6[local150];
							@Pc(201) int local201;
							if (local89.anIntArray166 != null && local89.anIntArray166[local133] != -1) {
								local201 = local89.anIntArray166[local133];
								arg3.method4568(local166, local170, local174, local154, local158, local162, 100, 100, 100, Static85.method1643(local201, local89.aShortArray22[local140]), Static85.method1643(local201, local89.aShortArray22[local145]), Static85.method1643(local201, local89.aShortArray22[local150]));
							} else if (local89.aShortArray17 == null || local89.aShortArray17[local133] == -1) {
								local201 = local89.anIntArray165[local133];
								arg3.method4568(local166, local170, local174, local154, local158, local162, 100, 100, 100, Static85.method1643(local201, local89.aShortArray22[local140]), Static85.method1643(local201, local89.aShortArray22[local145]), Static85.method1643(local201, local89.aShortArray22[local150]));
							} else {
								local201 = super.aClass14_Sub1_16.method5050(local89.aShortArray17[local133]);
								arg3.method4568(local166, local170, local174, local154, local158, local162, 100, 100, 100, Static85.method1643(local201, local89.aShortArray22[local140]), Static85.method1643(local201, local89.aShortArray22[local145]), Static85.method1643(local201, local89.aShortArray22[local150]));
							}
						}
					}
				}
				local49 -= 4;
			}
			local35 += 4;
			local49 = local14;
		}
		arg3.aBoolean376 = true;
		super.aClass14_Sub1_16.method6880(local23);
	}
}
