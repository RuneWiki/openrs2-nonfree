import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class46_Sub1_Sub2 extends Class46_Sub1 {

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!fv;IIII[[I[[II)V")
	public Class46_Sub1_Sub2(@OriginalArg(0) Class90_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(9) Class93_Sub1 local9 = super.aClass90_Sub2_15.aClass93_Sub1_8;
		super.anInt7673 = -1;
		super.anInt7671 = local9.anInt2527;
		super.anInt7663 = local9.anInt2518;
		super.anInt7660 = local9.anInt2519;
		super.anInt7664 = local9.anInt2526;
		super.anInt7672 = local9.anInt2516;
		super.anInt7666 = local9.anInt2520;
		super.anInt7670 = local9.anInt2525;
		super.anInt7669 = local9.anInt2522;
		super.anInt7667 = local9.anInt2524;
		super.anInt7661 = local9.anInt2521;
		super.anInt7662 = local9.anInt2517;
		super.anInt7665 = local9.anInt2523;
		for (@Pc(62) int local62 = 0; local62 < arg2 + arg2; local62++) {
			for (@Pc(66) int local66 = 0; local66 < arg2 + arg2; local66++) {
				if (arg3[local62][local66]) {
					@Pc(82) int local82 = arg0 + local62 - arg2;
					@Pc(88) int local88 = arg1 + local66 - arg2;
					if (local82 >= 0 && super.anInt9997 > local82 && local88 >= 0 && local88 < super.anInt9995) {
						this.method7970(local82, local88);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7964(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class38_Sub2 local9 = (Class38_Sub2) super.aClass90_Sub2_15.method6761(Thread.currentThread());
		@Pc(12) Class28 local12 = local9.aClass28_2;
		local12.aBoolean38 = false;
		local12.anInt648 = 0;
		super.aClass90_Sub2_15.method7521();
		if (super.aClass308ArrayArray3 != null) {
			this.method6116(local9.anIntArray523, arg2, arg3, local9.anIntArray534, local12, arg0, arg1, arg4);
		} else if (super.aClass105ArrayArray3 != null) {
			this.method6120(local9.anIntArray523, arg3, local9.anIntArray534, arg0, arg4, arg1, local12, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V")
	@Override
	public void method7970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class38_Sub2 local9 = (Class38_Sub2) super.aClass90_Sub2_15.method6761(Thread.currentThread());
		local9.aClass28_2.anInt648 = 0;
		if (super.aClass308ArrayArray3 != null) {
			this.method6118(local9.anIntArray519, local9.anIntArray534, arg0, local9.aClass28_2, local9.anIntArray526, arg1, local9.anIntArray523, super.aClass90_Sub2_15.aBoolean551);
		} else if (super.aClass105ArrayArray3 != null) {
			this.method6119(local9.anIntArray534, local9.aClass28_2, arg0, arg1, local9.anIntArray526, local9.anIntArray523, local9.anIntArray519);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[IIIII[ILclient!bd;III[[Z)V")
	private void method6116(@OriginalArg(1) int[] arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int[] arg3, @OriginalArg(7) Class28 arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6, @OriginalArg(11) boolean[][] arg7) {
		@Pc(14) int local14 = (arg2 - arg6) * 1024 / 256;
		@Pc(23) boolean local23 = ((Class90_Sub2_Sub2) super.aClass90_Sub2_15).aBoolean553;
		super.aClass90_Sub2_15.method7500(false);
		arg4.aBoolean41 = false;
		arg4.aBoolean42 = false;
		@Pc(40) int local40 = 0;
		@Pc(44) int local44 = local14;
		for (@Pc(46) int local46 = arg5; local46 < arg1; local46++) {
			for (@Pc(50) int local50 = arg6; local50 < arg2; local50++) {
				if (arg7[local46 - arg5][local50 - arg6]) {
					@Pc(87) int local87;
					if (super.aClass308ArrayArray3[local46][local50] != null) {
						@Pc(308) Class308 local308 = super.aClass308ArrayArray3[local46][local50];
						if (local308.aShort106 != -1 && (local308.aByte91 & 0x2) == 0 && local308.anInt8713 == 0) {
							local87 = super.aClass90_Sub2_15.method6763(local308.aShort106);
							arg4.method559(local44 - 4, local44 + -4, local44, local40 + 4, local40, local40 + 4, 100, 100, 100, Static222.method3512(local308.anInt8716, local87), Static222.method3512(local308.anInt8714, local87), Static222.method3512(local308.anInt8717, local87));
							arg4.method559(local44, local44, local44 - 4, local40, local40 + 4, local40, 100, 100, 100, Static222.method3512(local308.anInt8715, local87), Static222.method3512(local308.anInt8717, local87), Static222.method3512(local308.anInt8714, local87));
						} else if (local308.anInt8713 == 0) {
							arg4.method554(local44 - 4, local44 - 4, local44, local40 + 4, local40, local40 + 4, 100, 100, 100, local308.anInt8716, local308.anInt8714, local308.anInt8717);
							arg4.method554(local44, local44, local44 - 4, local40, local40 + 4, local40, 100, 100, 100, local308.anInt8715, local308.anInt8717, local308.anInt8714);
						} else {
							local87 = local308.anInt8713;
							arg4.method554(local44 - 4, local44 + -4, local44, local40 + 4, local40, local40 + 4, 100, 100, 100, Static277.method4166(local308.anInt8716 & 0xFF000000, local87), Static277.method4166(local308.anInt8714 & 0xFF000000, local87), Static277.method4166(local308.anInt8717 & 0xFF000000, local87));
							arg4.method554(local44, local44, local44 - 4, local40, local40 + 4, local40, 100, 100, 100, Static277.method4166(local308.anInt8715 & 0xFF000000, local87), Static277.method4166(local308.anInt8717 & 0xFF000000, local87), Static277.method4166(local308.anInt8714 & 0xFF000000, local87));
						}
					} else if (super.aClass232ArrayArray3[local46][local50] != null) {
						@Pc(85) Class232 local85 = super.aClass232ArrayArray3[local46][local50];
						for (local87 = 0; local87 < local85.aShort87; local87++) {
							arg0[local87] = local85.aShortArray101[local87] * 4 / super.anInt9998 + local40;
							arg3[local87] = local44 - local85.aShortArray104[local87] * 4 / super.anInt9998;
						}
						for (@Pc(124) int local124 = 0; local124 < local85.aShort88; local124++) {
							@Pc(130) int local130 = local124 * 3;
							@Pc(134) int local134 = local130 + 1;
							@Pc(138) int local138 = local134 + 1;
							@Pc(142) int local142 = arg0[local130];
							@Pc(146) int local146 = arg0[local134];
							@Pc(150) int local150 = arg0[local138];
							@Pc(154) int local154 = arg3[local130];
							@Pc(158) int local158 = arg3[local134];
							@Pc(162) int local162 = arg3[local138];
							@Pc(226) int local226;
							if (local85.anIntArray479 != null && local85.anIntArray479[local124] != 0 && (local85.aShortArray103 == null || local85.aShortArray103 != null && local85.aShortArray103[local124] == -1)) {
								local226 = local85.anIntArray479[local124];
								arg4.method554(local154, local158, local162, local142, local146, local150, 100, 100, 100, Static277.method4166(-(-16777216 & local85.anIntArray480[local130]) - 16777216, local226), Static277.method4166(-(local85.anIntArray480[local134] & 0xFF000000) - 16777216, local226), Static277.method4166(-(local85.anIntArray480[local138] & 0xFF000000) - 16777216, local226));
							} else if (local85.aShortArray103 == null || local85.aShortArray103[local124] == -1) {
								arg4.method554(local154, local158, local162, local142, local146, local150, 100, 100, 100, local85.anIntArray480[local130], local85.anIntArray480[local134], local85.anIntArray480[local138]);
							} else {
								local226 = super.aClass90_Sub2_15.method6763(local85.aShortArray103[local124]);
								arg4.method559(local154, local158, local162, local142, local146, local150, 100, 100, 100, local226, local226, local226);
							}
						}
					}
				}
				local44 -= 4;
			}
			local40 += 4;
			local44 = local14;
		}
		arg4.aBoolean41 = true;
		super.aClass90_Sub2_15.method7500(local23);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([I[IILclient!bd;[III[IZ)V")
	private void method6118(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) boolean arg7) {
		@Pc(12) Class308 local12 = super.aClass308ArrayArray3[arg2][arg5];
		@Pc(44) int local44;
		@Pc(49) int local49;
		@Pc(54) int local54;
		@Pc(346) int local346;
		@Pc(406) int local406;
		@Pc(447) int local447;
		@Pc(521) int local521;
		@Pc(358) int local358;
		@Pc(418) int local418;
		@Pc(476) int local476;
		@Pc(532) int local532;
		@Pc(312) int local312;
		@Pc(377) int local377;
		@Pc(436) int local436;
		@Pc(493) int local493;
		@Pc(335) int local335;
		@Pc(395) int local395;
		@Pc(465) int local465;
		@Pc(510) int local510;
		@Pc(93) int local93;
		@Pc(92) int local92;
		@Pc(90) int local90;
		@Pc(88) int local88;
		@Pc(56) int local56;
		@Pc(58) int local58;
		@Pc(60) int local60;
		@Pc(62) int local62;
		@Pc(218) int local218;
		@Pc(79) int local79;
		@Pc(100) int local100;
		@Pc(317) int local317;
		@Pc(570) int local570;
		@Pc(804) int local804;
		if (local12 == null) {
			@Pc(1643) Class232 local1643 = super.aClass232ArrayArray3[arg2][arg5];
			if (local1643 != null) {
				if (super.anInt7673 == -1) {
					for (local521 = 0; local521 < local1643.aShort87; local521++) {
						local44 = local1643.aShortArray101[local521] + (arg2 << super.anInt10000);
						local49 = local1643.aShortArray105[local521];
						local54 = local1643.aShortArray104[local521] + (arg5 << super.anInt10000);
						local447 = (super.anInt7666 * local54 + super.anInt7665 * local49 + super.anInt7671 * local44 >> 14) + super.anInt7664;
						if (local447 <= super.aClass90_Sub2_15.anInt8496) {
							return;
						}
						arg4[local521] = 0;
						if (arg7) {
							local358 = local447 - super.aClass90_Sub2_15.anInt8505;
							if (local358 > 255) {
								local358 = 255;
							}
							if (local358 > 0) {
								arg4[local521] = local358;
								local418 = local1643.aShortArray106[local521] * local358 / 255;
								if (local418 > 0) {
									local49 -= local418;
								}
							}
						} else if (super.aClass90_Sub2_15.aBoolean550) {
							local358 = local447 - super.aClass90_Sub2_15.anInt8505;
							if (local358 > 0) {
								arg4[local521] = local358;
								if (arg4[local521] > 255) {
									arg4[local521] = 255;
								}
							}
						}
						local406 = super.anInt7662 + (local44 * super.anInt7672 + super.anInt7660 * local49 + local54 * super.anInt7661 >> 14);
						local346 = super.anInt7663 + (local49 * super.anInt7667 + super.anInt7669 * local44 + super.anInt7670 * local54 >> 14);
						arg6[local521] = super.aClass90_Sub2_15.anInt8507 * local346 / local447 + arg3.anInt645;
						arg1[local521] = super.aClass90_Sub2_15.anInt8503 * local406 / local447 + arg3.anInt646;
						arg0[local521] = local447;
					}
				} else {
					for (local521 = 0; local521 < local1643.aShort87; local521++) {
						local44 = local1643.aShortArray101[local521] + (arg2 << super.anInt10000);
						local49 = local1643.aShortArray105[local521];
						local54 = local1643.aShortArray104[local521] + (arg5 << super.anInt10000);
						arg4[local521] = 0;
						if (arg7) {
							local358 = -super.aClass90_Sub2_15.anInt8505 + super.anInt7673;
							if (local358 > 255) {
								local358 = 255;
							}
							if (local358 > 0) {
								arg4[local521] = local358;
								local418 = local1643.aShortArray106[local521] * local358 / 255;
								if (local418 > 0) {
									local49 -= local418;
								}
							}
						} else if (super.aClass90_Sub2_15.aBoolean550) {
							local358 = super.anInt7673 - super.aClass90_Sub2_15.anInt8505;
							if (local358 > 0) {
								arg4[local521] = local358;
								if (arg4[local521] > 255) {
									arg4[local521] = 255;
								}
							}
						}
						local406 = super.anInt7662 + (local44 * super.anInt7672 + super.anInt7660 * local49 + super.anInt7661 * local54 >> 14);
						local346 = super.anInt7663 + (super.anInt7669 * local44 + super.anInt7667 * local49 + super.anInt7670 * local54 >> 14);
						arg6[local521] = super.aClass90_Sub2_15.anInt8507 * local346 / super.anInt7673 + arg3.anInt645;
						arg1[local521] = arg3.anInt646 + local406 * super.aClass90_Sub2_15.anInt8503 / super.anInt7673;
						arg0[local521] = super.anInt7673;
					}
				}
				if (local1643.aShortArray103 == null) {
					for (local521 = 0; local521 < local1643.aShort88; local521++) {
						local358 = local521 * 3;
						local418 = local358 + 1;
						local476 = local418 + 1;
						local532 = arg6[local358];
						local312 = arg6[local418];
						local377 = arg6[local476];
						local436 = arg1[local358];
						local493 = arg1[local418];
						local335 = arg1[local476];
						local395 = arg4[local476] + arg4[local418] + arg4[local358];
						if (-((local436 - local493) * (local377 - local312)) + (local532 - local312) * (local335 - local493) > 0) {
							arg3.aBoolean38 = local532 < 0 || local312 < 0 || local377 < 0 || arg3.anInt643 < local532 || arg3.anInt643 < local312 || arg3.anInt643 < local377;
							if (local395 >= 765) {
								arg3.method548(local436, local493, local335, local532, local312, local377, arg0[local358], arg0[local418], arg0[local476], super.aClass90_Sub2_15.anInt8499);
							} else if (local395 <= 0) {
								if ((local1643.anIntArray480[local358] & 0xFFFFFF) != 0) {
									arg3.method554(local436, local493, local335, local532, local312, local377, arg0[local358], arg0[local418], arg0[local476], local1643.anIntArray480[local358], local1643.anIntArray480[local418], local1643.anIntArray480[local476]);
								}
							} else if ((local1643.anIntArray480[local358] & 0xFFFFFF) != 0) {
								arg3.method554(local436, local493, local335, local532, local312, local377, arg0[local358], arg0[local418], arg0[local476], Static125.method1935(local1643.anIntArray480[local358], super.aClass90_Sub2_15.anInt8499, arg4[local358]), Static125.method1935(local1643.anIntArray480[local418], super.aClass90_Sub2_15.anInt8499, arg4[local418]), Static125.method1935(local1643.anIntArray480[local476], super.aClass90_Sub2_15.anInt8499, arg4[local476]));
							}
						}
					}
				} else {
					local521 = super.anIntArrayArray66[arg2][arg5];
					local358 = super.anIntArrayArray66[arg2 + 1][arg5];
					local418 = super.anIntArrayArray66[arg2][arg5 + 1];
					local476 = arg2 * super.anInt9998;
					local532 = super.anInt9998 + local476;
					local312 = arg5 * super.anInt9998;
					local377 = local312 + super.anInt9998;
					local436 = (local312 * super.anInt7670 + super.anInt7667 * local521 + local476 * super.anInt7669 >> 14) + super.anInt7663;
					local493 = super.anInt7662 + (local476 * super.anInt7672 + super.anInt7660 * local521 + local312 * super.anInt7661 >> 14);
					local335 = super.anInt7664 + (super.anInt7666 * local312 + local521 * super.anInt7665 + local476 * super.anInt7671 >> 14);
					local395 = (local312 * super.anInt7670 + local532 * super.anInt7669 + local358 * super.anInt7667 >> 14) + super.anInt7663;
					local465 = (local532 * super.anInt7672 + super.anInt7660 * local358 + local312 * super.anInt7661 >> 14) + super.anInt7662;
					local510 = super.anInt7664 + (local358 * super.anInt7665 + local532 * super.anInt7671 + local312 * super.anInt7666 >> 14);
					local93 = (super.anInt7670 * local377 + local476 * super.anInt7669 + local418 * super.anInt7667 >> 14) + super.anInt7663;
					local92 = (super.anInt7660 * local418 + super.anInt7672 * local476 + local377 * super.anInt7661 >> 14) + super.anInt7662;
					local90 = super.anInt7664 + (super.anInt7666 * local377 + super.anInt7671 * local476 + local418 * super.anInt7665 >> 14);
					for (local88 = 0; local88 < local1643.aShort88; local88++) {
						local56 = local88 * 3;
						local58 = local56 + 1;
						local60 = local58 + 1;
						local62 = arg6[local56];
						local218 = arg6[local58];
						local79 = arg6[local60];
						local100 = arg1[local56];
						local317 = arg1[local58];
						local570 = arg1[local60];
						local804 = arg4[local58] + arg4[local56] + arg4[local60];
						if ((local570 - local317) * (local62 + -local218) - (local100 - local317) * (local79 + -local218) > 0) {
							arg3.aBoolean38 = local62 < 0 || local218 < 0 || local79 < 0 || arg3.anInt643 < local62 || local218 > arg3.anInt643 || local79 > arg3.anInt643;
							@Pc(2637) short local2637 = local1643.aShortArray103[local88];
							if (local804 >= 765) {
								arg3.method548(local100, local317, local570, local62, local218, local79, arg0[local56], arg0[local58], arg0[local60], super.aClass90_Sub2_15.anInt8499);
							} else {
								if (local2637 != -1 && this.method6115(super.aClass90_Sub2_15.anInterface2_15.method3085(local2637).aByte34)) {
									arg3.anInt648 = 100;
								}
								if (local804 <= 0) {
									if (local2637 != -1) {
										arg3.method560(local100, local317, local570, local62, local218, local79, arg0[local56], arg0[local58], arg0[local60], local1643.anIntArray480[local56], local1643.anIntArray480[local58], local1643.anIntArray480[local60], local436, local395, local93, local493, local465, local92, local335, local510, local90, local2637);
									} else if ((local1643.anIntArray480[local56] & 0xFFFFFF) != 0) {
										arg3.method554(local100, local317, local570, local62, local218, local79, arg0[local56], arg0[local58], arg0[local60], local1643.anIntArray480[local56], local1643.anIntArray480[local58], local1643.anIntArray480[local60]);
									}
								} else if (local2637 != -1) {
									arg3.method563(local100, local317, local570, local62, local218, local79, arg0[local56], arg0[local58], arg0[local60], super.aClass90_Sub2_15.anInt8499, arg4[local56], arg4[local58], arg4[local60], local1643.anIntArray480[local56], local1643.anIntArray480[local58], local1643.anIntArray480[local60], local436, local395, local93, local493, local465, local92, local335, local510, local90, local2637);
								} else if ((local1643.anIntArray480[local56] & 0xFFFFFF) != 0) {
									arg3.method554(local100, local317, local570, local62, local218, local79, arg0[local56], arg0[local58], arg0[local60], Static277.method4166(super.aClass90_Sub2_15.anInt8499 | arg4[local56] << 24, local1643.anIntArray480[local56]), Static277.method4166(super.aClass90_Sub2_15.anInt8499 | arg4[local58] << 24, local1643.anIntArray480[local58]), Static277.method4166(arg4[local60] << 24 | super.aClass90_Sub2_15.anInt8499, local1643.anIntArray480[local60]));
								}
								arg3.anInt648 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte91 & 0x2) == 0) {
			@Pc(39) int local39 = arg2 * super.anInt9998;
			local44 = local39 + super.anInt9998;
			local49 = super.anInt9998 * arg5;
			local54 = super.anInt9998 + local49;
			local56 = 0;
			local58 = 0;
			local60 = 0;
			local62 = 0;
			if ((local12.aByte91 & 0x1) == 0 || arg7) {
				local79 = super.anIntArrayArray66[arg2][arg5];
				local100 = super.anIntArrayArray66[arg2 + 1][arg5];
				local317 = super.anIntArrayArray66[arg2 + 1][arg5 + 1];
				local570 = super.anIntArrayArray66[arg2][arg5 + 1];
				if (super.anInt7673 == -1) {
					local93 = (super.anInt7671 * local39 + local79 * super.anInt7665 + local49 * super.anInt7666 >> 14) + super.anInt7664;
					if (local93 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
					local92 = (local49 * super.anInt7666 + super.anInt7665 * local100 + local44 * super.anInt7671 >> 14) + super.anInt7664;
					if (local92 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
					local90 = (local54 * super.anInt7666 + local317 * super.anInt7665 + super.anInt7671 * local44 >> 14) + super.anInt7664;
					if (local90 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
					local88 = super.anInt7664 + (local570 * super.anInt7665 + super.anInt7671 * local39 + local54 * super.anInt7666 >> 14);
					if (super.aClass90_Sub2_15.anInt8496 >= local88) {
						return;
					}
				} else {
					local88 = super.anInt7673;
					local90 = super.anInt7673;
					local92 = super.anInt7673;
					local93 = super.anInt7673;
				}
				if (arg7) {
					local218 = local93 - super.aClass90_Sub2_15.anInt8505;
					if (local218 > 255) {
						local218 = 255;
					}
					if (local218 > 0) {
						local56 = local218;
						local804 = local12.aShort110 * local218 / 255;
						if (local804 > 0) {
							local79 -= local804;
						}
					}
					local218 = local92 - super.aClass90_Sub2_15.anInt8505;
					if (local218 > 255) {
						local218 = 255;
					}
					if (local218 > 0) {
						local58 = local218;
						local804 = local12.aShort107 * local218 / 255;
						if (local804 > 0) {
							local100 -= local804;
						}
					}
					local218 = local90 - super.aClass90_Sub2_15.anInt8505;
					if (local218 > 255) {
						local218 = 255;
					}
					if (local218 > 0) {
						local60 = local218;
						local804 = local218 * local12.aShort109 / 255;
						if (local804 > 0) {
							local317 -= local804;
						}
					}
					local218 = local88 - super.aClass90_Sub2_15.anInt8505;
					if (local218 > 255) {
						local218 = 255;
					}
					if (local218 > 0) {
						local62 = local218;
						local804 = local218 * local12.aShort108 / 255;
						if (local804 > 0) {
							local570 -= local804;
						}
					}
				} else if (super.aClass90_Sub2_15.aBoolean550) {
					local218 = local93 - super.aClass90_Sub2_15.anInt8505;
					if (local218 > 0) {
						local56 = local218;
						if (local218 > 255) {
							local56 = 255;
						}
					}
					local218 = local92 - super.aClass90_Sub2_15.anInt8505;
					if (local218 > 0) {
						local58 = local218;
						if (local218 > 255) {
							local58 = 255;
						}
					}
					local218 = local90 - super.aClass90_Sub2_15.anInt8505;
					if (local218 > 0) {
						local60 = local218;
						if (local218 > 255) {
							local60 = 255;
						}
					}
					local218 = local88 - super.aClass90_Sub2_15.anInt8505;
					if (local218 > 0) {
						local62 = local218;
						if (local218 > 255) {
							local62 = 255;
						}
					}
				}
				local312 = (local79 * super.anInt7667 + super.anInt7669 * local39 + local49 * super.anInt7670 >> 14) + super.anInt7663;
				local346 = arg3.anInt645 + super.aClass90_Sub2_15.anInt8507 * local312 / local93;
				local335 = super.anInt7662 + (super.anInt7660 * local79 + local39 * super.anInt7672 + local49 * super.anInt7661 >> 14);
				local358 = arg3.anInt646 + super.aClass90_Sub2_15.anInt8503 * local335 / local93;
				local377 = (local44 * super.anInt7669 + local100 * super.anInt7667 + super.anInt7670 * local49 >> 14) + super.anInt7663;
				local395 = (local100 * super.anInt7660 + super.anInt7672 * local44 + super.anInt7661 * local49 >> 14) + super.anInt7662;
				local406 = arg3.anInt645 + local377 * super.aClass90_Sub2_15.anInt8507 / local92;
				local436 = (local54 * super.anInt7670 + super.anInt7669 * local44 + local317 * super.anInt7667 >> 14) + super.anInt7663;
				local418 = arg3.anInt646 + super.aClass90_Sub2_15.anInt8503 * local395 / local92;
				local465 = super.anInt7662 + (super.anInt7661 * local54 + local44 * super.anInt7672 + local317 * super.anInt7660 >> 14);
				local447 = arg3.anInt645 + local436 * super.aClass90_Sub2_15.anInt8507 / local90;
				local493 = super.anInt7663 + (super.anInt7669 * local39 + super.anInt7667 * local570 + local54 * super.anInt7670 >> 14);
				local476 = arg3.anInt646 + super.aClass90_Sub2_15.anInt8503 * local465 / local90;
				local521 = super.aClass90_Sub2_15.anInt8507 * local493 / local88 + arg3.anInt645;
				local510 = (super.anInt7661 * local54 + super.anInt7660 * local570 + super.anInt7672 * local39 >> 14) + super.anInt7662;
				local532 = arg3.anInt646 + local510 * super.aClass90_Sub2_15.anInt8503 / local88;
			} else {
				local79 = super.anIntArrayArray66[arg2][arg5];
				if (super.anInt7673 == -1) {
					local100 = super.anInt7665 * local79;
					local93 = super.anInt7664 + (super.anInt7666 * local49 + local100 + local39 * super.anInt7671 >> 14);
					if (super.aClass90_Sub2_15.anInt8496 >= local93) {
						return;
					}
					local92 = super.anInt7664 + (local49 * super.anInt7666 + super.anInt7671 * local44 + local100 >> 14);
					if (super.aClass90_Sub2_15.anInt8496 >= local92) {
						return;
					}
					local90 = super.anInt7664 + (super.anInt7666 * local54 + local44 * super.anInt7671 + local100 >> 14);
					if (super.aClass90_Sub2_15.anInt8496 >= local90) {
						return;
					}
					local88 = super.anInt7664 + (super.anInt7666 * local54 + local100 + local39 * super.anInt7671 >> 14);
					if (super.aClass90_Sub2_15.anInt8496 >= local88) {
						return;
					}
				} else {
					local88 = super.anInt7673;
					local90 = super.anInt7673;
					local92 = super.anInt7673;
					local93 = super.anInt7673;
				}
				if (super.aClass90_Sub2_15.aBoolean550) {
					local218 = local93 - super.aClass90_Sub2_15.anInt8505;
					if (local218 > 0) {
						local56 = local218;
						if (local218 > 255) {
							local56 = 255;
						}
					}
					local218 = local92 - super.aClass90_Sub2_15.anInt8505;
					if (local218 > 0) {
						local58 = local218;
						if (local218 > 255) {
							local58 = 255;
						}
					}
					local218 = local90 - super.aClass90_Sub2_15.anInt8505;
					if (local218 > 0) {
						local60 = local218;
						if (local218 > 255) {
							local60 = 255;
						}
					}
					local218 = local88 - super.aClass90_Sub2_15.anInt8505;
					if (local218 > 0) {
						local62 = local218;
						if (local218 > 255) {
							local62 = 255;
						}
					}
				}
				local100 = local79 * super.anInt7667;
				local312 = super.anInt7663 + (local49 * super.anInt7670 + super.anInt7669 * local39 + local100 >> 14);
				local317 = super.anInt7660 * local79;
				local335 = super.anInt7662 + (local39 * super.anInt7672 + local317 + super.anInt7661 * local49 >> 14);
				local346 = arg3.anInt645 + super.aClass90_Sub2_15.anInt8507 * local312 / local93;
				local358 = arg3.anInt646 + super.aClass90_Sub2_15.anInt8503 * local335 / local93;
				local377 = super.anInt7663 + (local100 + super.anInt7669 * local44 + local49 * super.anInt7670 >> 14);
				local395 = super.anInt7662 + (super.anInt7672 * local44 + local317 + super.anInt7661 * local49 >> 14);
				local406 = local377 * super.aClass90_Sub2_15.anInt8507 / local92 + arg3.anInt645;
				local418 = arg3.anInt646 + local395 * super.aClass90_Sub2_15.anInt8503 / local92;
				local436 = super.anInt7663 + (super.anInt7670 * local54 + local100 + local44 * super.anInt7669 >> 14);
				local447 = local436 * super.aClass90_Sub2_15.anInt8507 / local90 + arg3.anInt645;
				local465 = super.anInt7662 + (super.anInt7672 * local44 + local317 + local54 * super.anInt7661 >> 14);
				local476 = super.aClass90_Sub2_15.anInt8503 * local465 / local90 + arg3.anInt646;
				local493 = (super.anInt7670 * local54 + local100 + local39 * super.anInt7669 >> 14) + super.anInt7663;
				local510 = super.anInt7662 + (super.anInt7661 * local54 + local39 * super.anInt7672 + local317 >> 14);
				local521 = super.aClass90_Sub2_15.anInt8507 * local493 / local88 + arg3.anInt645;
				local532 = super.aClass90_Sub2_15.anInt8503 * local510 / local88 + arg3.anInt646;
			}
			@Pc(1188) boolean local1188 = local12.aShort106 != -1 && this.method6115(super.aClass90_Sub2_15.anInterface2_15.method3085(local12.aShort106).aByte34);
			local100 = local60 + local58 + local62;
			if (-((local476 - local532) * (-local521 + local406)) + (local447 - local521) * (-local532 + local418) > 0) {
				arg3.aBoolean38 = local447 < 0 || local521 < 0 || local406 < 0 || local447 > arg3.anInt643 || arg3.anInt643 < local521 || local406 > arg3.anInt643;
				if (local100 >= 765) {
					arg3.method548(local476, local532, local418, local447, local521, local406, local90, local88, local92, super.aClass90_Sub2_15.anInt8499);
				} else {
					if (local1188) {
						arg3.anInt648 = 100;
					}
					if (local100 > 0) {
						if (local12.aShort106 >= 0) {
							arg3.method563(local476, local532, local418, local447, local521, local406, local90, local88, local92, super.aClass90_Sub2_15.anInt8499, local60, local62, local58, local12.anInt8716, local12.anInt8714, local12.anInt8717, local436, local493, local377, local465, local510, local395, local90, local88, local92, local12.aShort106);
						} else {
							arg3.method554(local476, local532, local418, local447, local521, local406, local90, local88, local92, Static277.method4166(local60 << 24 | super.aClass90_Sub2_15.anInt8499, local12.anInt8716), Static277.method4166(local62 << 24 | super.aClass90_Sub2_15.anInt8499, local12.anInt8714), Static277.method4166(local58 << 24 | super.aClass90_Sub2_15.anInt8499, local12.anInt8717));
						}
					} else if (local12.aShort106 < 0) {
						arg3.method554(local476, local532, local418, local447, local521, local406, local90, local88, local92, local12.anInt8716, local12.anInt8714, local12.anInt8717);
					} else {
						arg3.method560(local476, local532, local418, local447, local521, local406, local90, local88, local92, local12.anInt8716, local12.anInt8714, local12.anInt8717, local436, local493, local377, local465, local510, local395, local90, local88, local92, local12.aShort106);
					}
					arg3.anInt648 = 0;
				}
			}
			local100 = local58 + local56 + local62;
			if ((local532 - local418) * (-local406 + local346) - (local521 - local406) * (-local418 + local358) > 0) {
				arg3.aBoolean38 = local346 < 0 || local406 < 0 || local521 < 0 || arg3.anInt643 < local346 || local406 > arg3.anInt643 || local521 > arg3.anInt643;
				if (local100 < 765) {
					if (local1188) {
						arg3.anInt648 = 100;
					}
					if (local100 > 0) {
						if (local12.aShort106 < 0) {
							arg3.method554(local358, local418, local532, local346, local406, local521, local93, local92, local88, Static277.method4166(super.aClass90_Sub2_15.anInt8499 | local56 << 24, local12.anInt8715), Static277.method4166(super.aClass90_Sub2_15.anInt8499 | local58 << 24, local12.anInt8717), Static277.method4166(local62 << 24 | super.aClass90_Sub2_15.anInt8499, local12.anInt8714));
						} else {
							arg3.method563(local358, local418, local532, local346, local406, local521, local93, local92, local88, super.aClass90_Sub2_15.anInt8499, local56, local58, local62, local12.anInt8715, local12.anInt8717, local12.anInt8714, local312, local377, local493, local335, local395, local510, local93, local92, local88, local12.aShort106);
						}
					} else if (local12.aShort106 >= 0) {
						arg3.method560(local358, local418, local532, local346, local406, local521, local93, local92, local88, local12.anInt8715, local12.anInt8717, local12.anInt8714, local312, local377, local493, local335, local395, local510, local93, local92, local88, local12.aShort106);
					} else {
						arg3.method554(local358, local418, local532, local346, local406, local521, local93, local92, local88, local12.anInt8715, local12.anInt8717, local12.anInt8714);
					}
					arg3.anInt648 = 0;
					return;
				}
				arg3.method548(local358, local418, local532, local346, local406, local521, local93, local92, local88, super.aClass90_Sub2_15.anInt8499);
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([ILclient!bd;IBI[I[I[I)V")
	private void method6119(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(20) Class105 local20 = super.aClass105ArrayArray3[arg2][arg3];
		@Pc(42) int local42;
		@Pc(52) int local52;
		@Pc(246) int local246;
		@Pc(288) int local288;
		@Pc(365) int local365;
		@Pc(422) int local422;
		@Pc(433) int local433;
		@Pc(213) int local213;
		@Pc(265) int local265;
		@Pc(336) int local336;
		@Pc(383) int local383;
		@Pc(235) int local235;
		@Pc(306) int local306;
		@Pc(353) int local353;
		@Pc(411) int local411;
		@Pc(80) int local80;
		@Pc(79) int local79;
		@Pc(77) int local77;
		@Pc(75) int local75;
		@Pc(471) int local471;
		@Pc(276) int local276;
		@Pc(318) int local318;
		@Pc(394) int local394;
		if (local20 == null) {
			@Pc(1161) Class326 local1161 = super.aClass326ArrayArray3[arg2][arg3];
			if (local1161 != null) {
				@Pc(1186) short local1186;
				if (super.anInt7673 == -1) {
					for (local422 = 0; local422 < local1161.aShort118; local422++) {
						local42 = local1161.aShortArray147[local422] + (arg2 << super.anInt10000);
						local1186 = local1161.aShortArray154[local422];
						local52 = local1161.aShortArray153[local422] + (arg3 << super.anInt10000);
						local365 = (local42 * super.anInt7671 + super.anInt7665 * local1186 + local52 * super.anInt7666 >> 14) + super.anInt7664;
						if (local365 <= super.aClass90_Sub2_15.anInt8496) {
							return;
						}
						local288 = (local42 * super.anInt7672 + local1186 * super.anInt7660 + super.anInt7661 * local52 >> 14) + super.anInt7662;
						local246 = (local52 * super.anInt7670 + super.anInt7669 * local42 + local1186 * super.anInt7667 >> 14) + super.anInt7663;
						arg5[local422] = arg1.anInt645 + super.aClass90_Sub2_15.anInt8507 * local246 / local365;
						arg0[local422] = arg1.anInt646 + super.aClass90_Sub2_15.anInt8503 * local288 / local365;
						arg6[local422] = local365;
					}
				} else {
					for (local422 = 0; local422 < local1161.aShort118; local422++) {
						local42 = local1161.aShortArray147[local422] + (arg2 << super.anInt10000);
						local1186 = local1161.aShortArray154[local422];
						local52 = local1161.aShortArray153[local422] + (arg3 << super.anInt10000);
						local246 = (local1186 * super.anInt7667 + local42 * super.anInt7669 + local52 * super.anInt7670 >> 14) + super.anInt7663;
						local288 = (local52 * super.anInt7661 + super.anInt7672 * local42 + local1186 * super.anInt7660 >> 14) + super.anInt7662;
						arg5[local422] = local246 * super.aClass90_Sub2_15.anInt8507 / super.anInt7673 + arg1.anInt645;
						arg0[local422] = super.aClass90_Sub2_15.anInt8503 * local288 / super.anInt7673 + arg1.anInt646;
						arg6[local422] = super.anInt7673;
					}
				}
				if (local1161.aShortArray150 == null) {
					for (local422 = 0; local422 < local1161.aShort119; local422++) {
						@Pc(1876) short local1876 = local1161.aShortArray151[local422];
						@Pc(1881) short local1881 = local1161.aShortArray152[local422];
						@Pc(1886) short local1886 = local1161.aShortArray148[local422];
						local433 = arg5[local1876];
						local213 = arg5[local1881];
						local265 = arg5[local1886];
						local336 = arg0[local1876];
						local383 = arg0[local1881];
						local235 = arg0[local1886];
						if (-((local265 - local213) * (local336 - local383)) + (local235 - local383) * (local433 + -local213) > 0) {
							local306 = local1161.anIntArray654[local422];
							if (local306 != -1) {
								arg1.aBoolean38 = local433 < 0 || local213 < 0 || local265 < 0 || arg1.anInt643 < local433 || local213 > arg1.anInt643 || arg1.anInt643 < local265;
								arg1.method559(local336, local383, local235, local433, local213, local265, arg6[local1876], arg6[local1881], arg6[local1886], Static222.method3512(local1161.aShortArray149[local1876], local306), Static222.method3512(local1161.aShortArray149[local1881], local306), Static222.method3512(local1161.aShortArray149[local1886], local306));
							}
						}
					}
				} else {
					local422 = super.anIntArrayArray66[arg2][arg3];
					local276 = super.anIntArrayArray66[arg2 + 1][arg3];
					local318 = super.anIntArrayArray66[arg2][arg3 + 1];
					local394 = arg2 * super.anInt9998;
					local433 = super.anInt9998 + local394;
					local213 = super.anInt9998 * arg3;
					local265 = super.anInt9998 + local213;
					local336 = (local213 * super.anInt7670 + super.anInt7667 * local422 + super.anInt7669 * local394 >> 14) + super.anInt7663;
					local383 = super.anInt7662 + (local213 * super.anInt7661 + local394 * super.anInt7672 + super.anInt7660 * local422 >> 14);
					local235 = super.anInt7664 + (super.anInt7666 * local213 + local394 * super.anInt7671 + local422 * super.anInt7665 >> 14);
					local306 = super.anInt7663 + (super.anInt7670 * local213 + local276 * super.anInt7667 + local433 * super.anInt7669 >> 14);
					local353 = super.anInt7662 + (local213 * super.anInt7661 + local433 * super.anInt7672 + super.anInt7660 * local276 >> 14);
					local411 = (super.anInt7666 * local213 + local433 * super.anInt7671 + local276 * super.anInt7665 >> 14) + super.anInt7664;
					local80 = super.anInt7663 + (super.anInt7670 * local265 + super.anInt7667 * local318 + super.anInt7669 * local394 >> 14);
					local79 = super.anInt7662 + (super.anInt7660 * local318 + local394 * super.anInt7672 + super.anInt7661 * local265 >> 14);
					local77 = (super.anInt7666 * local265 + super.anInt7671 * local394 + super.anInt7665 * local318 >> 14) + super.anInt7664;
					for (local75 = 0; local75 < local1161.aShort119; local75++) {
						@Pc(1661) short local1661 = local1161.aShortArray151[local75];
						@Pc(1666) short local1666 = local1161.aShortArray152[local75];
						@Pc(1671) short local1671 = local1161.aShortArray148[local75];
						local471 = arg5[local1661];
						@Pc(1679) int local1679 = arg5[local1666];
						@Pc(1683) int local1683 = arg5[local1671];
						@Pc(1687) int local1687 = arg0[local1661];
						@Pc(1691) int local1691 = arg0[local1666];
						@Pc(1695) int local1695 = arg0[local1671];
						if ((local471 - local1679) * (-local1691 + local1695) - (local1683 - local1679) * (local1687 + -local1691) > 0) {
							arg1.aBoolean38 = local471 < 0 || local1679 < 0 || local1683 < 0 || arg1.anInt643 < local471 || arg1.anInt643 < local1679 || arg1.anInt643 < local1683;
							@Pc(1750) short local1750 = local1161.aShortArray150[local75];
							if (local1750 == -1) {
								@Pc(1759) int local1759 = local1161.anIntArray654[local75];
								if (local1759 != -1) {
									arg1.method559(local1687, local1691, local1695, local471, local1679, local1683, arg6[local1661], arg6[local1666], arg6[local1671], Static222.method3512(local1161.aShortArray149[local1661], local1759), Static222.method3512(local1161.aShortArray149[local1666], local1759), Static222.method3512(local1161.aShortArray149[local1671], local1759));
								}
							} else {
								if (this.method6115(super.aClass90_Sub2_15.anInterface2_15.method3085(local1750).aByte34)) {
									arg1.anInt648 = 100;
								}
								arg1.method560(local1687, local1691, local1695, local471, local1679, local1683, arg6[local1661], arg6[local1666], arg6[local1671], local1161.aShortArray149[local1661], local1161.aShortArray149[local1666], local1161.aShortArray149[local1671], local336, local306, local80, local383, local353, local79, local235, local411, local77, local1750);
								arg1.anInt648 = 0;
							}
						}
					}
				}
			}
		} else if ((local20.aByte33 & 0x2) == 0) {
			@Pc(36) int local36 = super.anInt9998 * arg2;
			local42 = local36 + super.anInt9998;
			@Pc(47) int local47 = super.anInt9998 * arg3;
			local52 = super.anInt9998 + local47;
			@Pc(67) int local67;
			@Pc(87) int local87;
			@Pc(218) int local218;
			if ((local20.aByte33 & 0x1) == 0) {
				local67 = super.anIntArrayArray66[arg2][arg3];
				local87 = super.anIntArrayArray66[arg2 + 1][arg3];
				local218 = super.anIntArrayArray66[arg2 + 1][arg3 + 1];
				local471 = super.anIntArrayArray66[arg2][arg3 + 1];
				if (super.anInt7673 == -1) {
					local80 = (super.anInt7666 * local47 + local67 * super.anInt7665 + local36 * super.anInt7671 >> 14) + super.anInt7664;
					if (local80 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
					local79 = super.anInt7664 + (super.anInt7671 * local42 + local87 * super.anInt7665 + super.anInt7666 * local47 >> 14);
					if (super.aClass90_Sub2_15.anInt8496 >= local79) {
						return;
					}
					local77 = super.anInt7664 + (super.anInt7666 * local52 + local42 * super.anInt7671 + super.anInt7665 * local218 >> 14);
					if (super.aClass90_Sub2_15.anInt8496 >= local77) {
						return;
					}
					local75 = super.anInt7664 + (local52 * super.anInt7666 + super.anInt7671 * local36 + local471 * super.anInt7665 >> 14);
					if (local75 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
				} else {
					local75 = super.anInt7673;
					local77 = super.anInt7673;
					local79 = super.anInt7673;
					local80 = super.anInt7673;
				}
				local213 = super.anInt7663 + (super.anInt7667 * local67 + super.anInt7669 * local36 + local47 * super.anInt7670 >> 14);
				local246 = local213 * super.aClass90_Sub2_15.anInt8507 / local80 + arg1.anInt645;
				local235 = super.anInt7662 + (super.anInt7661 * local47 + super.anInt7660 * local67 + super.anInt7672 * local36 >> 14);
				local265 = super.anInt7663 + (super.anInt7667 * local87 + super.anInt7669 * local42 + super.anInt7670 * local47 >> 14);
				local276 = arg1.anInt646 + super.aClass90_Sub2_15.anInt8503 * local235 / local80;
				local288 = arg1.anInt645 + super.aClass90_Sub2_15.anInt8507 * local265 / local79;
				local306 = (local47 * super.anInt7661 + super.anInt7660 * local87 + local42 * super.anInt7672 >> 14) + super.anInt7662;
				local336 = (super.anInt7667 * local218 + local42 * super.anInt7669 + local52 * super.anInt7670 >> 14) + super.anInt7663;
				local318 = super.aClass90_Sub2_15.anInt8503 * local306 / local79 + arg1.anInt646;
				local365 = arg1.anInt645 + local336 * super.aClass90_Sub2_15.anInt8507 / local77;
				local353 = (local42 * super.anInt7672 + super.anInt7660 * local218 + super.anInt7661 * local52 >> 14) + super.anInt7662;
				local383 = super.anInt7663 + (local52 * super.anInt7670 + local36 * super.anInt7669 + super.anInt7667 * local471 >> 14);
				local394 = super.aClass90_Sub2_15.anInt8503 * local353 / local77 + arg1.anInt646;
				local422 = local383 * super.aClass90_Sub2_15.anInt8507 / local75 + arg1.anInt645;
				local411 = super.anInt7662 + (super.anInt7661 * local52 + super.anInt7672 * local36 + super.anInt7660 * local471 >> 14);
				local433 = arg1.anInt646 + super.aClass90_Sub2_15.anInt8503 * local411 / local75;
			} else {
				local67 = super.anIntArrayArray66[arg2][arg3];
				if (super.anInt7673 == -1) {
					local87 = super.anInt7665 * local67;
					local80 = (super.anInt7671 * local36 + local87 + local47 * super.anInt7666 >> 14) + super.anInt7664;
					if (local80 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
					local79 = (local47 * super.anInt7666 + local87 + local42 * super.anInt7671 >> 14) + super.anInt7664;
					if (local79 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
					local77 = super.anInt7664 + (super.anInt7666 * local52 + local42 * super.anInt7671 + local87 >> 14);
					if (local77 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
					local75 = (local36 * super.anInt7671 + local87 + super.anInt7666 * local52 >> 14) + super.anInt7664;
					if (super.aClass90_Sub2_15.anInt8496 >= local75) {
						return;
					}
				} else {
					local75 = super.anInt7673;
					local77 = super.anInt7673;
					local79 = super.anInt7673;
					local80 = super.anInt7673;
				}
				local87 = super.anInt7667 * local67;
				local213 = super.anInt7663 + (local36 * super.anInt7669 + local87 + super.anInt7670 * local47 >> 14);
				local218 = super.anInt7660 * local67;
				local235 = (super.anInt7672 * local36 + local218 + local47 * super.anInt7661 >> 14) + super.anInt7662;
				local246 = super.aClass90_Sub2_15.anInt8507 * local213 / local80 + arg1.anInt645;
				local265 = (local42 * super.anInt7669 + local87 + super.anInt7670 * local47 >> 14) + super.anInt7663;
				local276 = local235 * super.aClass90_Sub2_15.anInt8503 / local80 + arg1.anInt646;
				local288 = arg1.anInt645 + super.aClass90_Sub2_15.anInt8507 * local265 / local79;
				local306 = super.anInt7662 + (super.anInt7661 * local47 + local218 + super.anInt7672 * local42 >> 14);
				local318 = arg1.anInt646 + local306 * super.aClass90_Sub2_15.anInt8503 / local79;
				local336 = super.anInt7663 + (local52 * super.anInt7670 + local42 * super.anInt7669 + local87 >> 14);
				local353 = super.anInt7662 + (local218 + super.anInt7672 * local42 + super.anInt7661 * local52 >> 14);
				local365 = arg1.anInt645 + local336 * super.aClass90_Sub2_15.anInt8507 / local77;
				local383 = super.anInt7663 + (local87 + local36 * super.anInt7669 + super.anInt7670 * local52 >> 14);
				local394 = super.aClass90_Sub2_15.anInt8503 * local353 / local77 + arg1.anInt646;
				local411 = (super.anInt7661 * local52 + local218 + local36 * super.anInt7672 >> 14) + super.anInt7662;
				local422 = local383 * super.aClass90_Sub2_15.anInt8507 / local75 + arg1.anInt645;
				local433 = super.aClass90_Sub2_15.anInt8503 * local411 / local75 + arg1.anInt646;
			}
			if ((local365 - local422) * (local318 - local433) - (local288 - local422) * (local394 + -local433) > 0) {
				arg1.aBoolean38 = local365 < 0 || local422 < 0 || local288 < 0 || arg1.anInt643 < local365 || local422 > arg1.anInt643 || local288 > arg1.anInt643;
				if (local20.aShort53 >= 0) {
					if (this.method6115(super.aClass90_Sub2_15.anInterface2_15.method3085(local20.aShort53).aByte34)) {
						arg1.anInt648 = 100;
					}
					arg1.method560(local394, local433, local318, local365, local422, local288, local77, local75, local79, local20.aShort51 & 0xFFFF, local20.aShort52 & 0xFFFF, local20.aShort50 & 0xFFFF, local213, local265, local383, local235, local306, local411, local80, local79, local75, local20.aShort53);
					arg1.anInt648 = 0;
				} else {
					arg1.method559(local394, local433, local318, local365, local422, local288, local77, local75, local79, local20.aShort51 & 0xFFFF, local20.aShort52 & 0xFFFF, local20.aShort50 & 0xFFFF);
				}
			}
			if (-((local276 - local318) * (-local288 + local422)) + (local433 - local318) * (-local288 + local246) > 0) {
				arg1.aBoolean38 = local246 < 0 || local288 < 0 || local422 < 0 || local246 > arg1.anInt643 || local288 > arg1.anInt643 || local422 > arg1.anInt643;
				if (local20.aShort53 < 0) {
					arg1.method559(local276, local318, local433, local246, local288, local422, local80, local79, local75, local20.aShort54 & 0xFFFF, local20.aShort50 & 0xFFFF, local20.aShort52 & 0xFFFF);
					return;
				}
				if (this.method6115(super.aClass90_Sub2_15.anInterface2_15.method3085(local20.aShort53).aByte34)) {
					arg1.anInt648 = 100;
				}
				arg1.method560(local276, local318, local433, local246, local288, local422, local80, local79, local75, local20.aShort54 & 0xFFFF, local20.aShort50 & 0xFFFF, local20.aShort52 & 0xFFFF, local213, local265, local383, local235, local306, local411, local80, local79, local75, local20.aShort53);
				arg1.anInt648 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BII[III[II[[ZILclient!bd;I)V")
	private void method6120(@OriginalArg(3) int[] arg0, @OriginalArg(4) int arg1, @OriginalArg(6) int[] arg2, @OriginalArg(7) int arg3, @OriginalArg(8) boolean[][] arg4, @OriginalArg(9) int arg5, @OriginalArg(10) Class28 arg6, @OriginalArg(11) int arg7) {
		@Pc(14) int local14 = (arg1 - arg5) * 1024 / 256;
		@Pc(40) boolean local40 = ((Class90_Sub2_Sub2) super.aClass90_Sub2_15).aBoolean553;
		super.aClass90_Sub2_15.method7500(false);
		arg6.aBoolean42 = false;
		arg6.aBoolean41 = false;
		@Pc(52) int local52 = 0;
		@Pc(56) int local56 = local14;
		for (@Pc(58) int local58 = arg3; local58 < arg7; local58++) {
			for (@Pc(62) int local62 = arg5; local62 < arg1; local62++) {
				if (arg4[local58 - arg3][local62 - arg5]) {
					@Pc(173) int local173;
					if (super.aClass105ArrayArray3[local58][local62] != null) {
						@Pc(90) Class105 local90 = super.aClass105ArrayArray3[local58][local62];
						if (local90.aShort53 != -1 && (local90.aByte33 & 0x2) == 0 && local90.anInt2791 == -1) {
							local173 = super.aClass90_Sub2_15.method6763(local90.aShort53);
							arg6.method559(local56 - 4, local56 + -4, local56, local52 + 4, local52, local52 + 4, 100, 100, 100, Static222.method3512(local90.aShort51 & 0xFFFF, local173), Static222.method3512(local90.aShort52 & 0xFFFF, local173), Static222.method3512(local90.aShort50 & 0xFFFF, local173));
							arg6.method559(local56, local56, local56 - 4, local52, local52 + 4, local52, 100, 100, 100, Static222.method3512(local90.aShort54 & 0xFFFF, local173), Static222.method3512(local90.aShort50 & 0xFFFF, local173), Static222.method3512(local90.aShort52 & 0xFFFF, local173));
						} else if (local90.anInt2791 == -1) {
							arg6.method559(local56 - 4, local56 + -4, local56, local52 + 4, local52, local52 + 4, 100, 100, 100, local90.aShort51 & 0xFFFF, local90.aShort52 & 0xFFFF, local90.aShort50 & 0xFFFF);
							arg6.method559(local56, local56, local56 - 4, local52, local52 + 4, local52, 100, 100, 100, local90.aShort54 & 0xFFFF, local90.aShort50 & 0xFFFF, local90.aShort52 & 0xFFFF);
						} else {
							local173 = local90.anInt2791;
							arg6.method559(local56 - 4, local56 - 4, local56, local52 + 4, local52, local52 + 4, 100, 100, 100, local173, local173, local173);
							arg6.method559(local56, local56, local56 - 4, local52, local52 + 4, local52, 100, 100, 100, local173, local173, local173);
						}
					} else if (super.aClass326ArrayArray3[local58][local62] != null) {
						@Pc(323) Class326 local323 = super.aClass326ArrayArray3[local58][local62];
						for (local173 = 0; local173 < local323.aShort118; local173++) {
							arg0[local173] = local323.aShortArray147[local173] * 4 / super.anInt9998 + local52;
							arg2[local173] = local56 - local323.aShortArray153[local173] * 4 / super.anInt9998;
						}
						for (@Pc(363) int local363 = 0; local363 < local323.aShort119; local363++) {
							@Pc(370) short local370 = local323.aShortArray151[local363];
							@Pc(375) short local375 = local323.aShortArray152[local363];
							@Pc(380) short local380 = local323.aShortArray148[local363];
							@Pc(384) int local384 = arg0[local370];
							@Pc(388) int local388 = arg0[local375];
							@Pc(392) int local392 = arg0[local380];
							@Pc(396) int local396 = arg2[local370];
							@Pc(400) int local400 = arg2[local375];
							@Pc(404) int local404 = arg2[local380];
							@Pc(431) int local431;
							if (local323.anIntArray655 != null && local323.anIntArray655[local363] != -1) {
								local431 = local323.anIntArray655[local363];
								arg6.method559(local396, local400, local404, local384, local388, local392, 100, 100, 100, Static222.method3512(local323.aShortArray149[local370], local431), Static222.method3512(local323.aShortArray149[local375], local431), Static222.method3512(local323.aShortArray149[local380], local431));
							} else if (local323.aShortArray150 == null || local323.aShortArray150[local363] == -1) {
								local431 = local323.anIntArray654[local363];
								arg6.method559(local396, local400, local404, local384, local388, local392, 100, 100, 100, Static222.method3512(local323.aShortArray149[local370], local431), Static222.method3512(local323.aShortArray149[local375], local431), Static222.method3512(local323.aShortArray149[local380], local431));
							} else {
								local431 = super.aClass90_Sub2_15.method6763(local323.aShortArray150[local363]);
								arg6.method559(local396, local400, local404, local384, local388, local392, 100, 100, 100, Static222.method3512(local323.aShortArray149[local370], local431), Static222.method3512(local323.aShortArray149[local375], local431), Static222.method3512(local323.aShortArray149[local380], local431));
							}
						}
					}
				}
				local56 -= 4;
			}
			local52 += 4;
			local56 = local14;
		}
		arg6.aBoolean41 = true;
		super.aClass90_Sub2_15.method7500(local40);
	}
}
