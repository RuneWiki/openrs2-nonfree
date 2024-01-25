import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class322_Sub1 extends Class322 {

	@OriginalMember(owner = "client!vaa", name = "N", descriptor = "I")
	public int anInt10435 = 99;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(IIIZ)V")
	public Class322_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static517.aClass49_3, Static151.aClass275_3);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIILclient!ha;IIIIIILclient!fe;)V")
	public void method8706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class104 arg9) {
		if (Static74.aClass2_Sub13_5.aClass14_Sub7_2.method3523() == 0 && !Static267.method4913(arg6, arg0, Static425.anInt8001, arg4)) {
			return;
		}
		if (arg1 < this.anInt10435) {
			this.anInt10435 = arg1;
		}
		@Pc(36) Class161 local36 = Static27.aClass342_3.method8534(arg2);
		if (Static74.aClass2_Sub13_5.aClass14_Sub4_1.method2491() == 0 && local36.aBoolean408) {
			return;
		}
		@Pc(64) int local64;
		@Pc(61) int local61;
		if (arg8 == 1 || arg8 == 3) {
			local61 = local36.anInt5411;
			local64 = local36.anInt5389;
		} else {
			local61 = local36.anInt5389;
			local64 = local36.anInt5411;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (super.anInt10420 >= arg0 + local64) {
			local100 = (local64 >> 1) + arg0;
			local108 = arg0 + (local64 + 1 >> 1);
		} else {
			local100 = arg0;
			local108 = arg0 + 1;
		}
		@Pc(128) int local128;
		@Pc(126) int local126;
		if (super.anInt10417 < local61 + arg6) {
			local126 = arg6 + 1;
			local128 = arg6;
		} else {
			local126 = (local61 + 1 >> 1) + arg6;
			local128 = (local61 >> 1) + arg6;
		}
		@Pc(148) Class65 local148 = Static9.aClass65Array1[arg4];
		@Pc(175) int local175 = local148.method7995(local128, local100) + local148.method7995(local128, local108) + local148.method7995(local126, local100) + local148.method7995(local126, local108) >> 2;
		@Pc(184) int local184 = (arg0 << 9) + (local64 << 8);
		@Pc(192) int local192 = (local61 << 8) + (arg6 << 9);
		@Pc(204) boolean local204 = Static328.aBoolean493 && !super.aBoolean715 && local36.aBoolean402;
		if (local36.method4600()) {
			Static5.method117(null, arg1, arg6, arg0, null, local36, arg8);
		}
		@Pc(238) boolean local238 = arg7 == -1 && local36.anInt5358 == -1 && local36.anIntArray287 == null && local36.anIntArray288 == null && !local36.aBoolean407;
		if (Static249.aBoolean395 && (Static390.method6426(arg5) && local36.anInt5406 != 1 || !(!Static519.method7863(arg5) || local36.anInt5406 != 0))) {
			return;
		}
		if (arg5 != 22) {
			@Pc(389) Class3_Sub1_Sub3 local389;
			@Pc(357) Class3_Sub1_Sub3_Sub1 local357;
			@Pc(361) int local361;
			@Pc(455) int local455;
			if (arg5 == 10 || arg5 == 11) {
				local357 = null;
				if (local238) {
					@Pc(419) Class3_Sub1_Sub3_Sub1 local419 = new Class3_Sub1_Sub3_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg0, local64 + arg0 - 1, arg6, local61 + arg6 - 1, arg5, arg8, local204);
					local389 = local419;
					local357 = local419;
					local361 = local419.method2753();
				} else {
					local361 = 15;
					local389 = new Class3_Sub1_Sub3_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg0, local64 + arg0 - 1, arg6, arg6 + local61 - 1, arg5, arg8, arg7);
				}
				if (Static324.method5602(local389, false)) {
					if (local357 != null && local357.method8621()) {
						local357.method8627(arg3);
					}
					if (local36.aBoolean404 && Static328.aBoolean493) {
						if (local361 > 30) {
							local361 = 30;
						}
						for (local455 = 0; local455 <= local64; local455++) {
							for (@Pc(459) int local459 = 0; local459 <= local61; local459++) {
								local148.ka(local455 + arg0, arg6 + local459, local361);
							}
						}
					}
				}
				if (local36.anInt5386 != 0 && arg9 != null) {
					arg9.method3260(!local36.aBoolean396, local64, arg6, arg0, local36.aBoolean399, local61);
				}
			} else if ((arg5 < 12 || arg5 > 17) && (arg5 < 18 || arg5 > 21)) {
				@Pc(701) Class3_Sub1_Sub5 local701;
				if (arg5 == 0) {
					@Pc(674) int local674 = local36.anInt5406;
					if (Static304.aBoolean473 && local36.anInt5406 == -1) {
						local674 = 1;
					}
					if (local238) {
						@Pc(719) Class3_Sub1_Sub5_Sub1 local719 = new Class3_Sub1_Sub5_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg5, arg8, local204);
						if (local719.method8621()) {
							local719.method8627(arg3);
						}
						local701 = local719;
					} else {
						local701 = new Class3_Sub1_Sub5_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg5, arg8, arg7);
					}
					Static150.method7139(arg1, arg0, arg6, local701, null);
					if (arg8 == 0) {
						if (Static328.aBoolean493 && local36.aBoolean404) {
							local148.ka(arg0, arg6, 50);
							local148.ka(arg0, arg6 + 1, 50);
						}
						if (local674 == 1 && !super.aBoolean715) {
							Static613.method8963(arg0, local36.anInt5404, local36.anInt5380, arg6, arg1, 1);
						}
					} else if (arg8 == 1) {
						if (Static328.aBoolean493 && local36.aBoolean404) {
							local148.ka(arg0, arg6 + 1, 50);
							local148.ka(arg0 + 1, arg6 + 1, 50);
						}
						if (local674 == 1 && !super.aBoolean715) {
							Static613.method8963(arg0, -local36.anInt5404, local36.anInt5380, arg6 + 1, arg1, 2);
						}
					} else if (arg8 == 2) {
						if (Static328.aBoolean493 && local36.aBoolean404) {
							local148.ka(arg0 + 1, arg6, 50);
							local148.ka(arg0 + 1, arg6 + 1, 50);
						}
						if (local674 == 1 && !super.aBoolean715) {
							Static613.method8963(arg0 + 1, -local36.anInt5404, local36.anInt5380, arg6, arg1, 1);
						}
					} else if (arg8 == 3) {
						if (Static328.aBoolean493 && local36.aBoolean404) {
							local148.ka(arg0, arg6, 50);
							local148.ka(arg0 + 1, arg6, 50);
						}
						if (local674 == 1 && !super.aBoolean715) {
							Static613.method8963(arg0, local36.anInt5404, local36.anInt5380, arg6, arg1, 2);
						}
					}
					if (local36.anInt5386 != 0 && arg9 != null) {
						arg9.method3265(arg6, arg0, arg5, arg8, !local36.aBoolean396, local36.aBoolean399);
					}
					if (local36.anInt5369 != 64) {
						Static529.method8006(arg1, arg0, arg6, local36.anInt5369);
					}
				} else {
					@Pc(963) Class3_Sub1_Sub5 local963;
					@Pc(981) Class3_Sub1_Sub5_Sub1 local981;
					if (arg5 == 1) {
						if (local238) {
							local981 = new Class3_Sub1_Sub5_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg5, arg8, local204);
							if (local981.method8621()) {
								local981.method8627(arg3);
							}
							local963 = local981;
						} else {
							local963 = new Class3_Sub1_Sub5_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg5, arg8, arg7);
						}
						Static150.method7139(arg1, arg0, arg6, local963, null);
						if (local36.aBoolean404 && Static328.aBoolean493) {
							if (arg8 == 0) {
								local148.ka(arg0, arg6 + 1, 50);
							} else if (arg8 == 1) {
								local148.ka(arg0 + 1, arg6 + 1, 50);
							} else if (arg8 == 2) {
								local148.ka(arg0 + 1, arg6, 50);
							} else if (arg8 == 3) {
								local148.ka(arg0, arg6, 50);
							}
						}
						if (local36.anInt5386 != 0 && arg9 != null) {
							arg9.method3265(arg6, arg0, arg5, arg8, !local36.aBoolean396, local36.aBoolean399);
						}
					} else if (arg5 == 2) {
						local361 = arg8 + 1 & 0x3;
						if (local238) {
							@Pc(1104) Class3_Sub1_Sub5_Sub1 local1104 = new Class3_Sub1_Sub5_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg5, arg8 + 4, local204);
							@Pc(1120) Class3_Sub1_Sub5_Sub1 local1120 = new Class3_Sub1_Sub5_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg5, local361, local204);
							if (local1104.method8621()) {
								local1104.method8627(arg3);
							}
							local701 = local1120;
							local963 = local1104;
							if (local1120.method8621()) {
								local1120.method8627(arg3);
							}
						} else {
							local963 = new Class3_Sub1_Sub5_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg5, arg8 + 4, arg7);
							local701 = new Class3_Sub1_Sub5_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg5, local361, arg7);
						}
						Static150.method7139(arg1, arg0, arg6, local963, local701);
						if ((local36.anInt5406 == 1 || Static304.aBoolean473 && local36.anInt5406 == -1) && !super.aBoolean715) {
							if (arg8 == 0) {
								Static613.method8963(arg0, local36.anInt5404, local36.anInt5380, arg6, arg1, 1);
								Static613.method8963(arg0, local36.anInt5404, local36.anInt5380, arg6 + 1, arg1, 2);
							} else if (arg8 == 1) {
								Static613.method8963(arg0 + 1, local36.anInt5404, local36.anInt5380, arg6, arg1, 1);
								Static613.method8963(arg0, local36.anInt5404, local36.anInt5380, arg6 + 1, arg1, 2);
							} else if (arg8 == 2) {
								Static613.method8963(arg0 + 1, local36.anInt5404, local36.anInt5380, arg6, arg1, 1);
								Static613.method8963(arg0, local36.anInt5404, local36.anInt5380, arg6, arg1, 2);
							} else if (arg8 == 3) {
								Static613.method8963(arg0, local36.anInt5404, local36.anInt5380, arg6, arg1, 1);
								Static613.method8963(arg0, local36.anInt5404, local36.anInt5380, arg6, arg1, 2);
							}
						}
						if (local36.anInt5386 != 0 && arg9 != null) {
							arg9.method3265(arg6, arg0, arg5, arg8, !local36.aBoolean396, local36.aBoolean399);
						}
						if (local36.anInt5369 != 64) {
							Static529.method8006(arg1, arg0, arg6, local36.anInt5369);
						}
					} else if (arg5 == 3) {
						if (local238) {
							local981 = new Class3_Sub1_Sub5_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg5, arg8, local204);
							if (local981.method8621()) {
								local981.method8627(arg3);
							}
							local963 = local981;
						} else {
							local963 = new Class3_Sub1_Sub5_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg5, arg8, arg7);
						}
						Static150.method7139(arg1, arg0, arg6, local963, null);
						if (local36.aBoolean404 && Static328.aBoolean493) {
							if (arg8 == 0) {
								local148.ka(arg0, arg6 + 1, 50);
							} else if (arg8 == 1) {
								local148.ka(arg0 + 1, arg6 + 1, 50);
							} else if (arg8 == 2) {
								local148.ka(arg0 + 1, arg6, 50);
							} else if (arg8 == 3) {
								local148.ka(arg0, arg6, 50);
							}
						}
						if (local36.anInt5386 != 0 && arg9 != null) {
							arg9.method3265(arg6, arg0, arg5, arg8, !local36.aBoolean396, local36.aBoolean399);
						}
					} else if (arg5 == 9) {
						if (local238) {
							local357 = new Class3_Sub1_Sub3_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg0, arg0, arg6, arg6, arg5, arg8, local204);
							if (local357.method8621()) {
								local357.method8627(arg3);
							}
							local389 = local357;
						} else {
							local389 = new Class3_Sub1_Sub3_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg0, arg0 + local64 - 1, arg6, arg6 + local61 - 1, arg5, arg8, arg7);
						}
						Static324.method5602(local389, false);
						if (local36.anInt5406 == 1 && !super.aBoolean715) {
							@Pc(1570) byte local1570;
							if ((arg8 & 0x1) == 0) {
								local1570 = 8;
							} else {
								local1570 = 16;
							}
							Static613.method8963(arg0, 0, local36.anInt5380, arg6, arg1, local1570);
						}
						if (local36.anInt5386 != 0 && arg9 != null) {
							arg9.method3260(!local36.aBoolean396, local64, arg6, arg0, local36.aBoolean399, local61);
						}
						if (local36.anInt5369 != 64) {
							Static529.method8006(arg1, arg0, arg6, local36.anInt5369);
						}
					} else {
						@Pc(1639) Class3_Sub1_Sub2 local1639;
						if (arg5 == 4) {
							if (local238) {
								@Pc(1658) Class3_Sub1_Sub2_Sub1 local1658 = new Class3_Sub1_Sub2_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, 0, 0, arg5, arg8);
								if (local1658.method8621()) {
									local1658.method8627(arg3);
								}
								local1639 = local1658;
							} else {
								local1639 = new Class3_Sub1_Sub2_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, 0, 0, arg5, arg8, arg7);
							}
							Static244.method4520(arg1, arg0, arg6, local1639, null);
						} else {
							@Pc(1684) int local1684;
							@Pc(1690) Interface21 local1690;
							@Pc(1729) Class3_Sub1_Sub2_Sub1 local1729;
							if (arg5 == 5) {
								local1684 = 65;
								local1690 = (Interface21) Static563.method8458(arg1, arg0, arg6);
								if (local1690 != null) {
									local1684 = Static27.aClass342_3.method8534(local1690.method8625()).anInt5369 + 1;
								}
								if (local238) {
									local1729 = new Class3_Sub1_Sub2_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, local1684 * Static396.anIntArray485[arg8], Static420.anIntArray507[arg8] * local1684, arg5, arg8);
									if (local1729.method8621()) {
										local1729.method8627(arg3);
									}
									local1639 = local1729;
								} else {
									local1639 = new Class3_Sub1_Sub2_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, Static396.anIntArray485[arg8] * local1684, local1684 * Static420.anIntArray507[arg8], arg5, arg8, arg7);
								}
								Static244.method4520(arg1, arg0, arg6, local1639, null);
							} else if (arg5 == 6) {
								local1684 = 33;
								local1690 = (Interface21) Static563.method8458(arg1, arg0, arg6);
								if (local1690 != null) {
									local1684 = Static27.aClass342_3.method8534(local1690.method8625()).anInt5369 / 2 + 1;
								}
								if (local238) {
									local1729 = new Class3_Sub1_Sub2_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, local1684 * Static396.anIntArray485[arg8], Static420.anIntArray507[arg8] * local1684, arg5, arg8 + 4);
									if (local1729.method8621()) {
										local1729.method8627(arg3);
									}
									local1639 = local1729;
								} else {
									local1639 = new Class3_Sub1_Sub2_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, Static507.anIntArray606[arg8] * local1684, local1684 * Static586.anIntArray667[arg8], arg5, arg8 + 4, arg7);
								}
								Static244.method4520(arg1, arg0, arg6, local1639, null);
							} else if (arg5 == 7) {
								local1684 = arg8 + 2 & 0x3;
								if (local238) {
									@Pc(1929) Class3_Sub1_Sub2_Sub1 local1929 = new Class3_Sub1_Sub2_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, 0, 0, arg5, local1684 + 4);
									if (local1929.method8621()) {
										local1929.method8627(arg3);
									}
									local1639 = local1929;
								} else {
									local1639 = new Class3_Sub1_Sub2_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, 0, 0, arg5, local1684 + 4, arg7);
								}
								Static244.method4520(arg1, arg0, arg6, local1639, null);
							} else if (arg5 == 8) {
								local361 = arg8 + 2 & 0x3;
								local455 = 33;
								@Pc(1965) Interface21 local1965 = (Interface21) Static563.method8458(arg1, arg0, arg6);
								if (local1965 != null) {
									local455 = Static27.aClass342_3.method8534(local1965.method8625()).anInt5369 / 2 + 1;
								}
								@Pc(2011) Class3_Sub1_Sub2 local2011;
								@Pc(2031) Class3_Sub1_Sub2 local2031;
								if (local238) {
									local2011 = new Class3_Sub1_Sub2_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, local455 * Static507.anIntArray606[arg8], Static586.anIntArray667[arg8] * local455, arg5, arg8 + 4);
									local2031 = new Class3_Sub1_Sub2_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, 0, 0, arg5, local361 + 4);
									if (local2011.method8621()) {
										local2011.method8627(arg3);
									}
									if (local2031.method8621()) {
										local2031.method8627(arg3);
									}
								} else {
									local2011 = new Class3_Sub1_Sub2_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, local455 * Static507.anIntArray606[arg8], local455 * Static586.anIntArray667[arg8], arg5, arg8 + 4, arg7);
									local2031 = new Class3_Sub1_Sub2_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, 0, 0, arg5, local361 + 4, arg7);
								}
								Static244.method4520(arg1, arg0, arg6, local2011, local2031);
							}
						}
					}
				}
			} else {
				if (local238) {
					local357 = new Class3_Sub1_Sub3_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg0, local64 + arg0 - 1, arg6, arg6 + local61 - 1, arg5, arg8, local204);
					local389 = local357;
					if (local357.method8621()) {
						local357.method8627(arg3);
					}
				} else {
					local389 = new Class3_Sub1_Sub3_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg0, arg0 + local64 - 1, arg6, arg6 + local61 - 1, arg5, arg8, arg7);
				}
				Static324.method5602(local389, false);
				if (Static328.aBoolean493 && !super.aBoolean715 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg1 > 0 && local36.anInt5406 != 0) {
					super.aByteArrayArrayArray13[arg1][arg0][arg6] = (byte) (super.aByteArrayArrayArray13[arg1][arg0][arg6] | 0x4);
				}
				if (local36.anInt5386 != 0 && arg9 != null) {
					arg9.method3260(!local36.aBoolean396, local64, arg6, arg0, local36.aBoolean399, local61);
				}
			}
		} else if (Static74.aClass2_Sub13_5.aClass14_Sub12_1.method5129() != 0 || local36.anInt5363 != 0 || local36.anInt5386 == 1 || local36.aBoolean410) {
			@Pc(301) Class3_Sub1_Sub1 local301;
			if (local238) {
				@Pc(318) Class3_Sub1_Sub1_Sub2 local318 = new Class3_Sub1_Sub1_Sub2(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg8, local204);
				local301 = local318;
				if (local318.method8621()) {
					local318.method8627(arg3);
				}
			} else {
				local301 = new Class3_Sub1_Sub1_Sub1(arg3, local36, arg1, arg4, local184, local175, local192, super.aBoolean715, arg8, arg7);
			}
			Static6.method167(arg1, arg0, arg6, local301);
			if (local36.anInt5386 == 1 && arg9 != null) {
				arg9.method3251(arg6, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(IIIII)Lclient!se;")
	private Interface21 method8707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Interface21 local5 = null;
		if (arg0 == 0) {
			local5 = (Interface21) Static563.method8458(arg3, arg2, arg1);
		}
		if (arg0 == 1) {
			local5 = (Interface21) Static629.method9130(arg3, arg2, arg1);
		}
		if (arg0 == 2) {
			local5 = (Interface21) Static440.method6961(arg3, arg2, arg1, se.class);
		}
		if (arg0 == 3) {
			local5 = (Interface21) Static336.method5820(arg3, arg2, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!ha;Lclient!cea;[IIB)V")
	public void method8708(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class2_Sub11 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if (super.aBoolean715) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class41 local13 = null;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		while (true) {
			@Pc(32) int local32;
			@Pc(83) int local83;
			@Pc(129) int local129;
			@Pc(133) int local133;
			@Pc(510) int local510;
			while (arg2.aByteArray128.length > arg2.anInt10066) {
				local32 = arg2.method8383();
				if (local32 == 0) {
					local13 = new Class41(arg2);
				} else {
					@Pc(168) int local168;
					@Pc(276) int local276;
					@Pc(135) int local135;
					if (local32 == 1) {
						local83 = arg2.method8383();
						if (local83 > 0) {
							for (local510 = 0; local510 < local83; local510++) {
								@Pc(519) Class300 local519 = new Class300(arg1, arg2, 2);
								if (local519.anInt9118 == 31) {
									@Pc(530) Class334 local530 = Static2.aClass277_4.method7114(arg2.method8326());
									local519.method7669(local530.anInt9996, local530.anInt9994, local530.anInt9990, local530.anInt9989);
								}
								if (arg1.method7307() > 0) {
									@Pc(547) Class2_Sub1 local547 = local519.aClass2_Sub1_2;
									local135 = (arg4 << 9) + local547.method3969();
									local168 = local547.method3962() + (arg0 << 9);
									local276 = local135 >> 9;
									@Pc(571) int local571 = local168 >> 9;
									if (local276 >= 0 && local571 >= 0 && super.anInt10420 > local276 && super.anInt10417 > local571) {
										local547.method3970(local135, local168, super.anIntArrayArrayArray19[local519.anInt9115][local276][local571] - local547.method3967());
										Static266.method4906(local519);
									}
								}
							}
						}
					} else if (local32 == 2) {
						if (local13 == null) {
							local13 = new Class41();
						}
						local13.method1769(arg2);
					} else if (local32 != 128) {
						if (local32 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray12 == null) {
							super.aByteArrayArrayArray12 = new byte[4][][];
						}
						for (local83 = 0; local83 < 4; local83++) {
							@Pc(89) byte local89 = arg2.method8384();
							if (local89 == 0 && super.aByteArrayArrayArray12[local83] != null) {
								local129 = arg4;
								local133 = arg4 + 64;
								local135 = arg0;
								if (arg0 < 0) {
									local135 = 0;
								} else if (arg0 >= super.anInt10417) {
									local135 = super.anInt10417;
								}
								if (arg4 < 0) {
									local129 = 0;
								} else if (arg4 >= super.anInt10420) {
									local129 = super.anInt10420;
								}
								local168 = arg0 + 64;
								if (local133 < 0) {
									local133 = 0;
								} else if (local133 >= super.anInt10420) {
									local133 = super.anInt10420;
								}
								if (local168 < 0) {
									local168 = 0;
								} else if (local168 >= super.anInt10417) {
									local168 = super.anInt10417;
								}
								while (local129 < local133) {
									while (local168 > local135) {
										super.aByteArrayArrayArray12[local83][local129][local135] = 0;
										local135++;
									}
									local129++;
								}
							} else if (local89 == 1) {
								if (super.aByteArrayArrayArray12[local83] == null) {
									super.aByteArrayArrayArray12[local83] = new byte[super.anInt10420 + 1][super.anInt10417 + 1];
								}
								for (local129 = 0; local129 < 64; local129 += 4) {
									for (local133 = 0; local133 < 64; local133 += 4) {
										@Pc(266) byte local266 = arg2.method8384();
										for (local168 = local129 + arg4; local168 < local129 + arg4 + 4; local168++) {
											for (local276 = arg0 + local133; local276 < arg0 + local133 + 4; local276++) {
												if (local168 >= 0 && local168 < super.anInt10420 && local276 >= 0 && local276 < super.anInt10417) {
													super.aByteArrayArrayArray12[local83][local168][local276] = local266;
												}
											}
										}
									}
								}
							} else if (local89 == 2) {
								if (super.aByteArrayArrayArray12[local83] == null) {
									super.aByteArrayArrayArray12[local83] = new byte[super.anInt10420 + 1][super.anInt10417 + 1];
								}
								if (local83 > 0) {
									local129 = arg4;
									local133 = arg4 + 64;
									local135 = arg0;
									if (local133 < 0) {
										local133 = 0;
									} else if (super.anInt10420 <= local133) {
										local133 = super.anInt10420;
									}
									if (arg0 < 0) {
										local135 = 0;
									} else if (super.anInt10417 <= arg0) {
										local135 = super.anInt10417;
									}
									local168 = arg0 + 64;
									if (arg4 < 0) {
										local129 = 0;
									} else if (arg4 >= super.anInt10420) {
										local129 = super.anInt10420;
									}
									if (local168 < 0) {
										local168 = 0;
									} else if (local168 >= super.anInt10417) {
										local168 = super.anInt10417;
									}
									while (local129 < local133) {
										while (local135 < local168) {
											super.aByteArrayArrayArray12[local83][local129][local135] = super.aByteArrayArrayArray12[local83 - 1][local129][local135];
											local135++;
										}
										local129++;
									}
								}
							}
						}
						local11 = true;
					} else if (arg3 == null) {
						arg2.anInt10066 += 10;
					} else {
						arg3[0] = arg2.method8326();
						arg3[1] = arg2.method8368();
						arg3[2] = arg2.method8368();
						arg3[3] = arg2.method8368();
						arg3[4] = arg2.method8326();
					}
				}
			}
			if (local13 != null) {
				for (local32 = 0; local32 < 8; local32++) {
					for (local83 = 0; local83 < 8; local83++) {
						local510 = local32 + (arg4 >> 3);
						local129 = (arg0 >> 3) + local83;
						if (local510 >= 0 && local510 < super.anInt10420 >> 3 && local129 >= 0 && super.anInt10417 >> 3 > local129) {
							Static327.method5620(local13, local510, local129);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray12 != null) {
				for (local32 = 0; local32 < 4; local32++) {
					if (super.aByteArrayArrayArray12[local32] != null) {
						for (local83 = 0; local83 < 16; local83++) {
							for (local510 = 0; local510 < 16; local510++) {
								local129 = (arg4 >> 2) + local83;
								local133 = local510 + (arg0 >> 2);
								if (local129 >= 0 && local129 < 26 && local133 >= 0 && local133 < 26) {
									super.aByteArrayArrayArray12[local32][local129][local133] = 0;
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

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II[BIILclient!ha;III[Lclient!fe;I)V")
	public void method8709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class20 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class104[] arg8, @OriginalArg(10) int arg9) {
		@Pc(17) Class2_Sub11 local17 = new Class2_Sub11(arg2);
		@Pc(19) int local19 = -1;
		while (true) {
			@Pc(23) int local23 = local17.method8330();
			if (local23 == 0) {
				return;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			while (true) {
				@Pc(38) int local38 = local17.method8378();
				if (local38 == 0) {
					break;
				}
				local34 += local38 - 1;
				@Pc(50) int local50 = local34 & 0x3F;
				@Pc(56) int local56 = local34 >> 6 & 0x3F;
				@Pc(60) int local60 = local34 >> 12;
				@Pc(64) int local64 = local17.method8383();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				if (arg3 == local60 && local56 >= arg0 && arg0 + 8 > local56 && local50 >= arg4 && local50 < arg4 + 8) {
					@Pc(108) Class161 local108 = Static27.aClass342_3.method8534(local19);
					@Pc(125) int local125 = Static545.method8160(local50 & 0x7, local56 & 0x7, arg1, local108.anInt5389, local108.anInt5411, local72) + arg7;
					@Pc(142) int local142 = arg6 + Static357.method6060(local56 & 0x7, local108.anInt5389, local72, local108.anInt5411, local50 & 0x7, arg1);
					if (local125 > 0 && local142 > 0 && local125 < super.anInt10420 - 1 && super.anInt10417 - 1 > local142) {
						@Pc(160) Class104 local160 = null;
						if (!super.aBoolean715) {
							@Pc(165) int local165 = arg9;
							if ((Static476.aByteArrayArrayArray5[1][local125][local142] & 0x2) == 2) {
								local165 = arg9 - 1;
							}
							if (local165 >= 0) {
								local160 = arg8[local165];
							}
						}
						this.method8706(local125, arg9, local19, arg5, arg9, local68, local142, -1, local72 + arg1 & 0x3, local160);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!fe;IILclient!ha;IIB)V")
	public void method8711(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) Interface21 local11 = this.method8707(arg1, arg5, arg4, arg2);
		if (local11 == null) {
			return;
		}
		@Pc(25) Class161 local25 = Static27.aClass342_3.method8534(local11.method8625());
		@Pc(29) int local29 = local11.method8622();
		@Pc(33) int local33 = local11.method8624();
		if (local25.method4600()) {
			Static72.method1658(local25, arg4, arg5, arg2);
		}
		if (local11.method8621()) {
			local11.method8626(arg3);
		}
		if (arg1 == 0) {
			Static216.method4211(arg2, arg4, arg5);
			if (local25.anInt5386 != 0) {
				arg0.method3261(local25.aBoolean399, local33, arg4, local29, arg5, !local25.aBoolean396);
			}
			if (local25.anInt5406 == 1) {
				if (local33 != 0) {
					if (local33 != 1) {
						if (local33 == 2) {
							Static554.method8267(arg2, 1, arg5, arg4 + 1);
						} else if (local33 == 3) {
							Static554.method8267(arg2, 2, arg5, arg4);
							return;
						}
						return;
					}
					Static554.method8267(arg2, 2, arg5 + 1, arg4);
					return;
				}
				Static554.method8267(arg2, 1, arg5, arg4);
				return;
			}
		} else if (arg1 == 1) {
			Static549.method8194(arg2, arg4, arg5);
		} else if (arg1 == 2) {
			Static150.method7138(arg2, arg4, arg5, se.class);
			if (local25.anInt5386 != 0 && local25.anInt5411 + arg4 < super.anInt10420 && arg5 + local25.anInt5411 < super.anInt10417 && local25.anInt5389 + arg4 < super.anInt10420 && super.anInt10417 > arg5 + local25.anInt5389) {
				arg0.method3264(local33, !local25.aBoolean396, local25.aBoolean399, arg4, arg5, local25.anInt5389, local25.anInt5411);
			}
			if (local29 == 9) {
				if ((local33 & 0x1) != 0) {
					Static554.method8267(arg2, 16, arg5, arg4);
					return;
				}
				Static554.method8267(arg2, 8, arg5, arg4);
				return;
			}
		} else {
			if (arg1 == 3) {
				Static336.method5821(arg2, arg4, arg5);
				if (local25.anInt5386 == 1) {
					arg0.method3254(arg4, arg5);
					return;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "([B[Lclient!fe;ILclient!ha;II)V")
	public void method8712(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class104[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) int arg4) {
		@Pc(14) Class2_Sub11 local14 = new Class2_Sub11(arg0);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method8330();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local14.method8378();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(47) int local47 = local28 & 0x3F;
				@Pc(53) int local53 = local28 >> 6 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(61) int local61 = local14.method8383();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = arg4 + local53;
				@Pc(77) int local77 = arg2 + local47;
				if (local73 > 0 && local77 > 0 && super.anInt10420 - 1 > local73 && local77 < super.anInt10417 - 1) {
					@Pc(102) Class104 local102 = null;
					if (!super.aBoolean715) {
						@Pc(107) int local107 = local57;
						if ((Static476.aByteArrayArrayArray5[1][local73][local77] & 0x2) == 2) {
							local107 = local57 - 1;
						}
						if (local107 >= 0) {
							local102 = arg1[local107];
						}
					}
					this.method8706(local73, local57, local16, arg3, local57, local65, local77, -1, local69, local102);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!cea;ZIIIIIILclient!ha;[II)V")
	public void method8713(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class20 arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean715) {
			return;
		}
		@Pc(13) Class41 local13 = null;
		if (arg8 != null) {
			arg8[0] = -1;
		}
		@Pc(25) int local25 = (arg2 & 0x7) * 8;
		@Pc(31) int local31 = (arg1 & 0x7) * 8;
		while (true) {
			@Pc(48) int local48;
			@Pc(104) int local104;
			@Pc(158) int local158;
			@Pc(176) int local176;
			@Pc(52) int local52;
			@Pc(98) int local98;
			label233: do {
				while (true) {
					@Pc(36) int local36;
					@Pc(327) int local327;
					while (arg0.aByteArray128.length > arg0.anInt10066) {
						local36 = arg0.method8383();
						if (local36 == 0) {
							local13 = new Class41(arg0);
						} else {
							if (local36 == 1) {
								local48 = arg0.method8383();
								continue label233;
							}
							if (local36 == 2) {
								if (local13 == null) {
									local13 = new Class41();
								}
								local13.method1769(arg0);
							} else if (local36 != 128) {
								if (local36 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray12 == null) {
									super.aByteArrayArrayArray12 = new byte[4][][];
								}
								for (local48 = 0; local48 < 4; local48++) {
									@Pc(312) byte local312 = arg0.method8384();
									@Pc(331) int local331;
									if (local312 == 0 && super.aByteArrayArrayArray12[arg4] != null) {
										if (arg9 >= local48) {
											local327 = arg3;
											local331 = arg3 + 7;
											local98 = arg6;
											if (local331 < 0) {
												local331 = 0;
											} else if (super.anInt10420 <= local331) {
												local331 = super.anInt10420;
											}
											if (arg3 < 0) {
												local327 = 0;
											} else if (super.anInt10420 <= arg3) {
												local327 = super.anInt10420;
											}
											local104 = arg6 + 7;
											if (arg6 < 0) {
												local98 = 0;
											} else if (arg6 >= super.anInt10417) {
												local98 = super.anInt10417;
											}
											if (local104 < 0) {
												local104 = 0;
											} else if (local104 >= super.anInt10417) {
												local104 = super.anInt10417;
											}
											while (local331 > local327) {
												while (local98 < local104) {
													super.aByteArrayArrayArray12[arg4][local327][local98] = 0;
													local98++;
												}
												local327++;
											}
										}
									} else if (local312 == 1) {
										if (super.aByteArrayArrayArray12[arg4] == null) {
											super.aByteArrayArrayArray12[arg4] = new byte[super.anInt10420 + 1][super.anInt10417 + 1];
										}
										for (local327 = 0; local327 < 64; local327 += 4) {
											for (local331 = 0; local331 < 64; local331 += 4) {
												@Pc(466) byte local466 = arg0.method8384();
												if (local48 <= arg9) {
													for (local104 = local327; local104 < local327 + 4; local104++) {
														for (local158 = local331; local158 < local331 + 4; local158++) {
															if (local25 <= local104 && local104 < local25 + 8 && local31 <= local158 && local31 < local31 + 8) {
																local176 = arg3 + Static619.method9024(local158 & 0x7, arg5, local104 & 0x7);
																@Pc(526) int local526 = arg6 + Static321.method5575(local104 & 0x7, local158 & 0x7, arg5);
																if (local176 >= 0 && local176 < super.anInt10420 && local526 >= 0 && super.anInt10417 > local526) {
																	super.aByteArrayArrayArray12[arg4][local176][local526] = local466;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else if (arg8 == null) {
								arg0.anInt10066 += 10;
							} else {
								arg8[0] = arg0.method8326();
								arg8[1] = arg0.method8368();
								arg8[2] = arg0.method8368();
								arg8[3] = arg0.method8368();
								arg8[4] = arg0.method8326();
							}
						}
					}
					if (local13 != null) {
						Static327.method5620(local13, arg3 >> 3, arg6 >> 3);
					}
					if (super.aByteArrayArrayArray12 != null && super.aByteArrayArrayArray12[arg4] != null) {
						local36 = arg3 + 7;
						local48 = arg6 + 7;
						for (local52 = arg3; local52 < local36; local52++) {
							for (local327 = arg6; local327 < local48; local327++) {
								super.aByteArrayArrayArray12[arg4][local52][local327] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local48 <= 0);
			for (local52 = 0; local52 < local48; local52++) {
				@Pc(61) Class300 local61 = new Class300(arg7, arg0, 2);
				if (local61.anInt9118 == 31) {
					@Pc(72) Class334 local72 = Static2.aClass277_4.method7114(arg0.method8326());
					local61.method7669(local72.anInt9996, local72.anInt9994, local72.anInt9990, local72.anInt9989);
				}
				if (arg7.method7307() > 0) {
					@Pc(92) Class2_Sub1 local92 = local61.aClass2_Sub1_2;
					local98 = local92.method3969() >> 9;
					local104 = local92.method3962() >> 9;
					if (local61.anInt9115 == arg9 && local98 >= local25 && local98 < local25 + 8 && local31 <= local104 && local104 < local31 + 8) {
						local158 = (arg3 << 9) + Static397.method6496(local92.method3962() & 0xFFF, local92.method3969() & 0xFFF, arg5);
						local176 = (arg6 << 9) + Static643.method9230(arg5, local92.method3962() & 0xFFF, local92.method3969() & 0xFFF);
						local98 = local158 >> 9;
						local104 = local176 >> 9;
						if (local98 >= 0 && local104 >= 0 && local98 < super.anInt10420 && local104 < super.anInt10417) {
							local92.method3970(local158, local176, super.anIntArrayArrayArray19[arg9][local98][local104] - local92.method3967());
							Static266.method4906(local61);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZLclient!ha;I)V")
	public void method8714(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1) {
		Static118.method2910();
		if (!arg0) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			if (super.anInt10425 > 1) {
				for (local16 = 0; super.anInt10420 > local16; local16++) {
					for (local20 = 0; super.anInt10417 > local20; local20++) {
						if ((Static476.aByteArrayArrayArray5[1][local16][local20] & 0x2) == 2) {
							Static207.method4088(local16, local20);
						}
					}
				}
			}
			for (local16 = 0; local16 < super.anInt10425; local16++) {
				for (local20 = 0; super.anInt10417 >= local20; local20++) {
					for (@Pc(56) int local56 = 0; local56 <= super.anInt10420; local56++) {
						if ((super.aByteArrayArrayArray13[local16][local56][local20] & 0x4) != 0) {
							@Pc(74) int local74 = local56;
							@Pc(76) int local76 = local56;
							@Pc(78) int local78 = local20;
							@Pc(80) int local80 = local20;
							while (local78 > 0 && (super.aByteArrayArrayArray13[local16][local56][local78 - 1] & 0x4) != 0 && local20 - local78 < 10) {
								local78--;
							}
							while (super.anInt10417 > local80 && (super.aByteArrayArrayArray13[local16][local56][local80 + 1] & 0x4) != 0 && local80 - local78 < 10) {
								local80++;
							}
							@Pc(138) int local138;
							label111: while (local74 > 0 && local56 - local74 < 10) {
								for (local138 = local78; local138 <= local80; local138++) {
									if ((super.aByteArrayArrayArray13[local16][local74 - 1][local138] & 0x4) == 0) {
										break label111;
									}
								}
								local74--;
							}
							label98: while (local76 < super.anInt10420 && local76 - local74 < 10) {
								for (local138 = local78; local138 <= local80; local138++) {
									if ((super.aByteArrayArrayArray13[local16][local76 + 1][local138] & 0x4) == 0) {
										break label98;
									}
								}
								local76++;
							}
							if ((local80 + 1 - local78) * (local76 + 1 - local74) >= 4) {
								local138 = super.anIntArrayArrayArray19[local16][local74][local78];
								Static551.method2894((local76 << 9) + 512, local138, local78 << 9, local138, (local80 << 9) + 512, local16, local74 << 9);
								for (@Pc(266) int local266 = local74; local266 <= local76; local266++) {
									for (@Pc(270) int local270 = local78; local270 <= local80; local270++) {
										super.aByteArrayArrayArray13[local16][local266][local270] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static492.method7634();
		}
		super.aByteArrayArrayArray13 = null;
	}
}
