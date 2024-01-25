import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class10_Sub1_Sub2 extends Class10_Sub1 {

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!aw;IIII[[I[[II)V")
	public Class10_Sub1_Sub2(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I[ILclient!gj;I[I[IIZ[I)V")
	private void method3324(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int[] arg7) {
		@Pc(20) Class45 local20 = super.aClass45ArrayArray3[arg5][arg0];
		@Pc(41) int local41;
		@Pc(46) int local46;
		@Pc(52) int local52;
		@Pc(490) int local490;
		@Pc(552) int local552;
		@Pc(595) int local595;
		@Pc(679) int local679;
		@Pc(501) int local501;
		@Pc(584) int local584;
		@Pc(646) int local646;
		@Pc(690) int local690;
		@Pc(459) int local459;
		@Pc(521) int local521;
		@Pc(573) int local573;
		@Pc(635) int local635;
		@Pc(479) int local479;
		@Pc(541) int local541;
		@Pc(615) int local615;
		@Pc(668) int local668;
		@Pc(129) int local129;
		@Pc(155) int local155;
		@Pc(182) int local182;
		@Pc(208) int local208;
		@Pc(54) int local54;
		@Pc(56) int local56;
		@Pc(58) int local58;
		@Pc(60) int local60;
		@Pc(236) int local236;
		@Pc(74) int local74;
		@Pc(83) int local83;
		@Pc(94) int local94;
		@Pc(103) int local103;
		@Pc(330) int local330;
		if (local20 == null) {
			@Pc(1616) Class158 local1616 = super.aClass158ArrayArray3[arg5][arg0];
			if (local1616 != null) {
				if (super.anInt3730 == -1) {
					for (local679 = 0; local679 < local1616.aShort75; local679++) {
						local41 = local1616.aShortArray76[local679] + (arg5 << super.anInt7411);
						local46 = local1616.aShortArray77[local679];
						local52 = local1616.aShortArray75[local679] + (arg0 << super.anInt7411);
						local595 = (super.anInt3729 * local52 + super.anInt3728 * local46 + super.anInt3732 * local41 >> 15) + super.anInt3738;
						if (local595 <= super.aClass9_Sub2_10.anInt5338) {
							return;
						}
						arg7[local679] = 0;
						if (arg6) {
							local501 = local595 - super.aClass9_Sub2_10.anInt5331;
							if (local501 > 255) {
								local501 = 255;
							}
							if (local501 > 0) {
								arg7[local679] = local501;
								local584 = local501 * local1616.aShortArray74[local679] / 255;
								if (local584 > 0) {
									local46 -= local584;
								}
							}
						} else if (super.aClass9_Sub2_10.aBoolean370) {
							local501 = local595 - super.aClass9_Sub2_10.anInt5331;
							if (local501 > 0) {
								arg7[local679] = local501;
								if (arg7[local679] > 255) {
									arg7[local679] = 255;
								}
							}
						}
						local552 = super.anInt3731 + (local52 * super.anInt3734 + local41 * super.anInt3736 + local46 * super.anInt3726 >> 15);
						local490 = super.anInt3733 + (local52 * super.anInt3727 + local41 * super.anInt3735 + super.anInt3725 * local46 >> 15);
						arg1[local679] = super.aClass9_Sub2_10.anInt5337 * local490 / local595 + arg2.anInt3530;
						arg3[local679] = super.aClass9_Sub2_10.anInt5322 * local552 / local595 + arg2.anInt3531;
						arg4[local679] = local595;
					}
				} else {
					for (local679 = 0; local679 < local1616.aShort75; local679++) {
						local41 = local1616.aShortArray76[local679] + (arg5 << super.anInt7411);
						local46 = local1616.aShortArray77[local679];
						local52 = local1616.aShortArray75[local679] + (arg0 << super.anInt7411);
						arg7[local679] = 0;
						if (arg6) {
							local501 = -super.aClass9_Sub2_10.anInt5331 + super.anInt3730;
							if (local501 > 255) {
								local501 = 255;
							}
							if (local501 > 0) {
								arg7[local679] = local501;
								local584 = local1616.aShortArray74[local679] * local501 / 255;
								if (local584 > 0) {
									local46 -= local584;
								}
							}
						} else if (super.aClass9_Sub2_10.aBoolean370) {
							local501 = -super.aClass9_Sub2_10.anInt5331 + super.anInt3730;
							if (local501 > 0) {
								arg7[local679] = local501;
								if (arg7[local679] > 255) {
									arg7[local679] = 255;
								}
							}
						}
						local552 = (local52 * super.anInt3734 + local46 * super.anInt3726 + super.anInt3736 * local41 >> 15) + super.anInt3731;
						local490 = (super.anInt3735 * local41 + super.anInt3725 * local46 + super.anInt3727 * local52 >> 15) + super.anInt3733;
						arg1[local679] = local490 * super.aClass9_Sub2_10.anInt5337 / super.anInt3730 + arg2.anInt3530;
						arg3[local679] = arg2.anInt3531 + local552 * super.aClass9_Sub2_10.anInt5322 / super.anInt3730;
						arg4[local679] = super.anInt3730;
					}
				}
				if (local1616.aShortArray79 == null) {
					for (local679 = 0; local679 < local1616.aShort74; local679++) {
						local501 = local679 * 3;
						local584 = local501 + 1;
						local646 = local584 + 1;
						local690 = arg1[local501];
						local459 = arg1[local584];
						local521 = arg1[local646];
						local573 = arg3[local501];
						local635 = arg3[local584];
						local479 = arg3[local646];
						local541 = arg7[local646] + arg7[local584] + arg7[local501];
						if (-((local573 - local635) * (local521 - local459)) + (local479 - local635) * (-local459 + local690) > 0) {
							arg2.aBoolean220 = local690 < 0 || local459 < 0 || local521 < 0 || local690 > arg2.anInt3527 || arg2.anInt3527 < local459 || local521 > arg2.anInt3527;
							if (local541 >= 765) {
								arg2.method3178(local573, local635, local479, local690, local459, local521, arg4[local501], arg4[local584], arg4[local646], super.aClass9_Sub2_10.anInt5344);
							} else if (local541 > 0) {
								if ((local1616.anIntArray337[local501] & 0xFFFFFF) != 0) {
									arg2.method3173(local573, local635, local479, local690, local459, local521, arg4[local501], arg4[local584], arg4[local646], Static99.method2251(local1616.anIntArray337[local501], super.aClass9_Sub2_10.anInt5344, arg7[local501]), Static99.method2251(local1616.anIntArray337[local584], super.aClass9_Sub2_10.anInt5344, arg7[local584]), Static99.method2251(local1616.anIntArray337[local646], super.aClass9_Sub2_10.anInt5344, arg7[local646]));
								}
							} else if ((local1616.anIntArray337[local501] & 0xFFFFFF) != 0) {
								arg2.method3173(local573, local635, local479, local690, local459, local521, arg4[local501], arg4[local584], arg4[local646], local1616.anIntArray337[local501], local1616.anIntArray337[local584], local1616.anIntArray337[local646]);
							}
						}
					}
				} else {
					local679 = super.anIntArrayArray31[arg5][arg0];
					local501 = super.anIntArrayArray31[arg5 + 1][arg0];
					local584 = super.anIntArrayArray31[arg5][arg0 + 1];
					local646 = super.anInt7410 * arg5;
					local690 = local646 + super.anInt7410;
					local459 = arg0 * super.anInt7410;
					local521 = local459 + super.anInt7410;
					local573 = super.anInt3733 + (local679 * super.anInt3725 + super.anInt3735 * local646 + local459 * super.anInt3727 >> 15);
					local635 = super.anInt3731 + (local459 * super.anInt3734 + local646 * super.anInt3736 + local679 * super.anInt3726 >> 15);
					local479 = (local646 * super.anInt3732 + super.anInt3728 * local679 + local459 * super.anInt3729 >> 15) + super.anInt3738;
					local541 = (super.anInt3735 * local690 + local501 * super.anInt3725 + local459 * super.anInt3727 >> 15) + super.anInt3733;
					local615 = (local459 * super.anInt3734 + local501 * super.anInt3726 + local690 * super.anInt3736 >> 15) + super.anInt3731;
					local668 = super.anInt3738 + (local501 * super.anInt3728 + local690 * super.anInt3732 + local459 * super.anInt3729 >> 15);
					local129 = (local521 * super.anInt3727 + super.anInt3725 * local584 + super.anInt3735 * local646 >> 15) + super.anInt3733;
					local155 = (local521 * super.anInt3734 + super.anInt3736 * local646 + local584 * super.anInt3726 >> 15) + super.anInt3731;
					local182 = super.anInt3738 + (local521 * super.anInt3729 + local584 * super.anInt3728 + local646 * super.anInt3732 >> 15);
					for (local208 = 0; local208 < local1616.aShort74; local208++) {
						local54 = local208 * 3;
						local56 = local54 + 1;
						local58 = local56 + 1;
						local60 = arg1[local54];
						local236 = arg1[local56];
						local74 = arg1[local58];
						local83 = arg3[local54];
						local94 = arg3[local56];
						local103 = arg3[local58];
						local330 = arg7[local54] + arg7[local56] + arg7[local58];
						if (-((local74 - local236) * (-local94 + local83)) + (local103 - local94) * (local60 + -local236) > 0) {
							arg2.aBoolean220 = local60 < 0 || local236 < 0 || local74 < 0 || local60 > arg2.anInt3527 || local236 > arg2.anInt3527 || local74 > arg2.anInt3527;
							@Pc(2613) short local2613 = local1616.aShortArray79[local208];
							if (local330 >= 765) {
								arg2.method3178(local83, local94, local103, local60, local236, local74, arg4[local54], arg4[local56], arg4[local58], super.aClass9_Sub2_10.anInt5344);
							} else {
								if (local2613 != -1 && this.method3322(super.aClass9_Sub2_10.anInterface8_13.method7085(local2613).aByte54)) {
									arg2.anInt3529 = 100;
								}
								if (local330 <= 0) {
									if (local2613 != -1) {
										arg2.method3177(local83, local94, local103, local60, local236, local74, local1616.anIntArray337[local54], local1616.anIntArray337[local56], local1616.anIntArray337[local58], local573, local541, local129, local635, local615, local155, local479, local668, local182, local2613);
									} else if ((local1616.anIntArray337[local54] & 0xFFFFFF) != 0) {
										arg2.method3173(local83, local94, local103, local60, local236, local74, arg4[local54], arg4[local56], arg4[local58], local1616.anIntArray337[local54], local1616.anIntArray337[local56], local1616.anIntArray337[local58]);
									}
								} else if (local2613 != -1) {
									arg2.method3171(local83, local94, local103, local60, local236, local74, arg4[local54], arg4[local56], arg4[local58], super.aClass9_Sub2_10.anInt5344, arg7[local54], arg7[local56], arg7[local58], local1616.anIntArray337[local54], local1616.anIntArray337[local56], local1616.anIntArray337[local58], local573, local541, local129, local635, local615, local155, local479, local668, local182, local2613);
								} else if ((local1616.anIntArray337[local54] & 0xFFFFFF) != 0) {
									arg2.method3173(local83, local94, local103, local60, local236, local74, arg4[local54], arg4[local56], arg4[local58], Static102.method2277(arg7[local54] << 24 | super.aClass9_Sub2_10.anInt5344, local1616.anIntArray337[local54]), Static102.method2277(super.aClass9_Sub2_10.anInt5344 | arg7[local56] << 24, local1616.anIntArray337[local56]), Static102.method2277(super.aClass9_Sub2_10.anInt5344 | arg7[local58] << 24, local1616.anIntArray337[local58]));
								}
								arg2.anInt3529 = 0;
							}
						}
					}
				}
			}
		} else if ((local20.aByte3 & 0x2) == 0) {
			@Pc(36) int local36 = arg5 * super.anInt7410;
			local41 = super.anInt7410 + local36;
			local46 = super.anInt7410 * arg0;
			local52 = local46 + super.anInt7410;
			local54 = 0;
			local56 = 0;
			local58 = 0;
			local60 = 0;
			if ((local20.aByte3 & 0x1) == 0 || arg6) {
				local74 = super.anIntArrayArray31[arg5][arg0];
				local83 = super.anIntArrayArray31[arg5 + 1][arg0];
				local94 = super.anIntArrayArray31[arg5 + 1][arg0 + 1];
				local103 = super.anIntArrayArray31[arg5][arg0 + 1];
				if (super.anInt3730 == -1) {
					local129 = super.anInt3738 + (local74 * super.anInt3728 + local36 * super.anInt3732 + super.anInt3729 * local46 >> 15);
					if (local129 <= super.aClass9_Sub2_10.anInt5338) {
						return;
					}
					local155 = super.anInt3738 + (super.anInt3728 * local83 + local41 * super.anInt3732 + local46 * super.anInt3729 >> 15);
					if (local155 <= super.aClass9_Sub2_10.anInt5338) {
						return;
					}
					local182 = (local41 * super.anInt3732 + super.anInt3728 * local94 + super.anInt3729 * local52 >> 15) + super.anInt3738;
					if (local182 <= super.aClass9_Sub2_10.anInt5338) {
						return;
					}
					local208 = super.anInt3738 + (local103 * super.anInt3728 + local36 * super.anInt3732 + super.anInt3729 * local52 >> 15);
					if (super.aClass9_Sub2_10.anInt5338 >= local208) {
						return;
					}
				} else {
					local208 = super.anInt3730;
					local182 = super.anInt3730;
					local155 = super.anInt3730;
					local129 = super.anInt3730;
				}
				if (arg6) {
					local236 = local129 - super.aClass9_Sub2_10.anInt5331;
					if (local236 > 255) {
						local236 = 255;
					}
					if (local236 > 0) {
						local54 = local236;
						local330 = local236 * local20.aShort18 / 255;
						if (local330 > 0) {
							local74 -= local330;
						}
					}
					local236 = local155 - super.aClass9_Sub2_10.anInt5331;
					if (local236 > 255) {
						local236 = 255;
					}
					if (local236 > 0) {
						local56 = local236;
						local330 = local236 * local20.aShort21 / 255;
						if (local330 > 0) {
							local83 -= local330;
						}
					}
					local236 = local182 - super.aClass9_Sub2_10.anInt5331;
					if (local236 > 255) {
						local236 = 255;
					}
					if (local236 > 0) {
						local58 = local236;
						local330 = local236 * local20.aShort17 / 255;
						if (local330 > 0) {
							local94 -= local330;
						}
					}
					local236 = local208 - super.aClass9_Sub2_10.anInt5331;
					if (local236 > 255) {
						local236 = 255;
					}
					if (local236 > 0) {
						local60 = local236;
						local330 = local20.aShort20 * local236 / 255;
						if (local330 > 0) {
							local103 -= local330;
						}
					}
				} else if (super.aClass9_Sub2_10.aBoolean370) {
					local236 = local129 - super.aClass9_Sub2_10.anInt5331;
					if (local236 > 0) {
						local54 = local236;
						if (local236 > 255) {
							local54 = 255;
						}
					}
					local236 = local155 - super.aClass9_Sub2_10.anInt5331;
					if (local236 > 0) {
						local56 = local236;
						if (local236 > 255) {
							local56 = 255;
						}
					}
					local236 = local182 - super.aClass9_Sub2_10.anInt5331;
					if (local236 > 0) {
						local58 = local236;
						if (local236 > 255) {
							local58 = 255;
						}
					}
					local236 = local208 - super.aClass9_Sub2_10.anInt5331;
					if (local236 > 0) {
						local60 = local236;
						if (local236 > 255) {
							local60 = 255;
						}
					}
				}
				local459 = super.anInt3733 + (super.anInt3725 * local74 + local36 * super.anInt3735 + local46 * super.anInt3727 >> 15);
				local479 = (super.anInt3734 * local46 + super.anInt3726 * local74 + super.anInt3736 * local36 >> 15) + super.anInt3731;
				local490 = local459 * super.aClass9_Sub2_10.anInt5337 / local129 + arg2.anInt3530;
				local501 = arg2.anInt3531 + local479 * super.aClass9_Sub2_10.anInt5322 / local129;
				local521 = super.anInt3733 + (local46 * super.anInt3727 + local41 * super.anInt3735 + local83 * super.anInt3725 >> 15);
				local541 = super.anInt3731 + (super.anInt3734 * local46 + local41 * super.anInt3736 + local83 * super.anInt3726 >> 15);
				local552 = local521 * super.aClass9_Sub2_10.anInt5337 / local155 + arg2.anInt3530;
				local573 = (local52 * super.anInt3727 + super.anInt3735 * local41 + local94 * super.anInt3725 >> 15) + super.anInt3733;
				local584 = arg2.anInt3531 + super.aClass9_Sub2_10.anInt5322 * local541 / local155;
				local595 = super.aClass9_Sub2_10.anInt5337 * local573 / local182 + arg2.anInt3530;
				local615 = (super.anInt3734 * local52 + super.anInt3736 * local41 + local94 * super.anInt3726 >> 15) + super.anInt3731;
				local635 = (local52 * super.anInt3727 + super.anInt3725 * local103 + super.anInt3735 * local36 >> 15) + super.anInt3733;
				local646 = super.aClass9_Sub2_10.anInt5322 * local615 / local182 + arg2.anInt3531;
				local668 = super.anInt3731 + (super.anInt3734 * local52 + local36 * super.anInt3736 + super.anInt3726 * local103 >> 15);
				local679 = arg2.anInt3530 + super.aClass9_Sub2_10.anInt5337 * local635 / local208;
				local690 = super.aClass9_Sub2_10.anInt5322 * local668 / local208 + arg2.anInt3531;
			} else {
				local74 = super.anIntArrayArray31[arg5][arg0];
				if (super.anInt3730 == -1) {
					local83 = local74 * super.anInt3728;
					local129 = (super.anInt3732 * local36 + local83 + super.anInt3729 * local46 >> 15) + super.anInt3738;
					if (local129 <= super.aClass9_Sub2_10.anInt5338) {
						return;
					}
					local155 = (local83 + super.anInt3732 * local41 + local46 * super.anInt3729 >> 15) + super.anInt3738;
					if (super.aClass9_Sub2_10.anInt5338 >= local155) {
						return;
					}
					local182 = (local83 + local41 * super.anInt3732 + super.anInt3729 * local52 >> 15) + super.anInt3738;
					if (local182 <= super.aClass9_Sub2_10.anInt5338) {
						return;
					}
					local208 = super.anInt3738 + (super.anInt3729 * local52 + local83 + local36 * super.anInt3732 >> 15);
					if (super.aClass9_Sub2_10.anInt5338 >= local208) {
						return;
					}
				} else {
					local208 = super.anInt3730;
					local182 = super.anInt3730;
					local155 = super.anInt3730;
					local129 = super.anInt3730;
				}
				if (super.aClass9_Sub2_10.aBoolean370) {
					local236 = local129 - super.aClass9_Sub2_10.anInt5331;
					if (local236 > 0) {
						local54 = local236;
						if (local236 > 255) {
							local54 = 255;
						}
					}
					local236 = local155 - super.aClass9_Sub2_10.anInt5331;
					if (local236 > 0) {
						local56 = local236;
						if (local236 > 255) {
							local56 = 255;
						}
					}
					local236 = local182 - super.aClass9_Sub2_10.anInt5331;
					if (local236 > 0) {
						local58 = local236;
						if (local236 > 255) {
							local58 = 255;
						}
					}
					local236 = local208 - super.aClass9_Sub2_10.anInt5331;
					if (local236 > 0) {
						local60 = local236;
						if (local236 > 255) {
							local60 = 255;
						}
					}
				}
				local83 = super.anInt3725 * local74;
				local459 = (local83 + super.anInt3735 * local36 + local46 * super.anInt3727 >> 15) + super.anInt3733;
				local94 = super.anInt3726 * local74;
				local490 = arg2.anInt3530 + local459 * super.aClass9_Sub2_10.anInt5337 / local129;
				local479 = (local94 + local36 * super.anInt3736 + super.anInt3734 * local46 >> 15) + super.anInt3731;
				local521 = (local83 + super.anInt3735 * local41 + local46 * super.anInt3727 >> 15) + super.anInt3733;
				local501 = super.aClass9_Sub2_10.anInt5322 * local479 / local129 + arg2.anInt3531;
				local552 = local521 * super.aClass9_Sub2_10.anInt5337 / local155 + arg2.anInt3530;
				local541 = (local46 * super.anInt3734 + local41 * super.anInt3736 + local94 >> 15) + super.anInt3731;
				local584 = arg2.anInt3531 + super.aClass9_Sub2_10.anInt5322 * local541 / local155;
				local573 = super.anInt3733 + (super.anInt3727 * local52 + local83 + super.anInt3735 * local41 >> 15);
				local615 = (local52 * super.anInt3734 + local94 + super.anInt3736 * local41 >> 15) + super.anInt3731;
				local595 = arg2.anInt3530 + local573 * super.aClass9_Sub2_10.anInt5337 / local182;
				local646 = arg2.anInt3531 + super.aClass9_Sub2_10.anInt5322 * local615 / local182;
				local635 = (super.anInt3727 * local52 + local83 + super.anInt3735 * local36 >> 15) + super.anInt3733;
				local679 = super.aClass9_Sub2_10.anInt5337 * local635 / local208 + arg2.anInt3530;
				local668 = (local94 + super.anInt3736 * local36 + super.anInt3734 * local52 >> 15) + super.anInt3731;
				local690 = local668 * super.aClass9_Sub2_10.anInt5322 / local208 + arg2.anInt3531;
			}
			@Pc(1161) boolean local1161 = local20.aShort19 != -1 && this.method3322(super.aClass9_Sub2_10.anInterface8_13.method7085(local20.aShort19).aByte54);
			local83 = local60 + local56 + local58;
			if (-((local646 - local690) * (local552 - local679)) + (local595 - local679) * (-local690 + local584) > 0) {
				arg2.aBoolean220 = local595 < 0 || local679 < 0 || local552 < 0 || arg2.anInt3527 < local595 || local679 > arg2.anInt3527 || local552 > arg2.anInt3527;
				if (local83 >= 765) {
					arg2.method3178(local646, local690, local584, local595, local679, local552, local182, local208, local155, super.aClass9_Sub2_10.anInt5344);
				} else {
					if (local1161) {
						arg2.anInt3529 = 100;
					}
					if (local83 <= 0) {
						if (local20.aShort19 < 0) {
							arg2.method3173(local646, local690, local584, local595, local679, local552, local182, local208, local155, local20.anInt1730, local20.anInt1729, local20.anInt1726);
						} else {
							arg2.method3177(local646, local690, local584, local595, local679, local552, local20.anInt1730, local20.anInt1729, local20.anInt1726, local573, local635, local521, local615, local668, local541, local182, local208, local155, local20.aShort19);
						}
					} else if (local20.aShort19 >= 0) {
						arg2.method3171(local646, local690, local584, local595, local679, local552, local182, local208, local155, super.aClass9_Sub2_10.anInt5344, local58, local60, local56, local20.anInt1730, local20.anInt1729, local20.anInt1726, local573, local635, local521, local615, local668, local541, local182, local208, local155, local20.aShort19);
					} else {
						arg2.method3173(local646, local690, local584, local595, local679, local552, local182, local208, local155, Static102.method2277(super.aClass9_Sub2_10.anInt5344 | local58 << 24, local20.anInt1730), Static102.method2277(super.aClass9_Sub2_10.anInt5344 | local60 << 24, local20.anInt1729), Static102.method2277(super.aClass9_Sub2_10.anInt5344 | local56 << 24, local20.anInt1726));
					}
					arg2.anInt3529 = 0;
				}
			}
			local83 = local60 + local54 + local56;
			if ((local490 - local552) * (local690 + -local584) - (local501 - local584) * (local679 - local552) > 0) {
				arg2.aBoolean220 = local490 < 0 || local552 < 0 || local679 < 0 || arg2.anInt3527 < local490 || arg2.anInt3527 < local552 || arg2.anInt3527 < local679;
				if (local83 < 765) {
					if (local1161) {
						arg2.anInt3529 = 100;
					}
					if (local83 > 0) {
						if (local20.aShort19 >= 0) {
							arg2.method3171(local501, local584, local690, local490, local552, local679, local129, local155, local208, super.aClass9_Sub2_10.anInt5344, local54, local56, local60, local20.anInt1727, local20.anInt1726, local20.anInt1729, local459, local521, local635, local479, local541, local668, local129, local155, local208, local20.aShort19);
						} else {
							arg2.method3173(local501, local584, local690, local490, local552, local679, local129, local155, local208, Static102.method2277(local54 << 24 | super.aClass9_Sub2_10.anInt5344, local20.anInt1727), Static102.method2277(local56 << 24 | super.aClass9_Sub2_10.anInt5344, local20.anInt1726), Static102.method2277(super.aClass9_Sub2_10.anInt5344 | local60 << 24, local20.anInt1729));
						}
					} else if (local20.aShort19 >= 0) {
						arg2.method3177(local501, local584, local690, local490, local552, local679, local20.anInt1727, local20.anInt1726, local20.anInt1729, local459, local521, local635, local479, local541, local668, local129, local155, local208, local20.aShort19);
					} else {
						arg2.method3173(local501, local584, local690, local490, local552, local679, local129, local155, local208, local20.anInt1727, local20.anInt1726, local20.anInt1729);
					}
					arg2.anInt3529 = 0;
					return;
				}
				arg2.method3178(local501, local584, local690, local490, local552, local679, local129, local155, local208, super.aClass9_Sub2_10.anInt5344);
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "([II[ILclient!gj;I[IB[I)V")
	private void method3326(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class105 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(29) Class94 local29 = super.aClass94ArrayArray3[arg1][arg4];
		@Pc(47) int local47;
		@Pc(57) int local57;
		@Pc(255) int local255;
		@Pc(295) int local295;
		@Pc(371) int local371;
		@Pc(413) int local413;
		@Pc(284) int local284;
		@Pc(341) int local341;
		@Pc(383) int local383;
		@Pc(442) int local442;
		@Pc(225) int local225;
		@Pc(273) int local273;
		@Pc(330) int local330;
		@Pc(402) int local402;
		@Pc(244) int local244;
		@Pc(313) int local313;
		@Pc(360) int local360;
		@Pc(431) int local431;
		@Pc(100) int local100;
		@Pc(123) int local123;
		@Pc(151) int local151;
		@Pc(179) int local179;
		@Pc(480) int local480;
		if (local29 == null) {
			@Pc(1125) Class176 local1125 = super.aClass176ArrayArray3[arg1][arg4];
			if (local1125 != null) {
				@Pc(1151) short local1151;
				if (super.anInt3730 == -1) {
					for (local413 = 0; local413 < local1125.aShort83; local413++) {
						local47 = local1125.aShortArray84[local413] + (arg1 << super.anInt7411);
						local1151 = local1125.aShortArray91[local413];
						local57 = local1125.aShortArray89[local413] + (arg4 << super.anInt7411);
						local371 = super.anInt3738 + (super.anInt3732 * local47 + super.anInt3728 * local1151 + local57 * super.anInt3729 >> 15);
						if (super.aClass9_Sub2_10.anInt5338 >= local371) {
							return;
						}
						local295 = (super.anInt3736 * local47 + local1151 * super.anInt3726 + local57 * super.anInt3734 >> 15) + super.anInt3731;
						local255 = (local1151 * super.anInt3725 + super.anInt3735 * local47 + local57 * super.anInt3727 >> 15) + super.anInt3733;
						arg0[local413] = arg3.anInt3530 + local255 * super.aClass9_Sub2_10.anInt5337 / local371;
						arg5[local413] = local295 * super.aClass9_Sub2_10.anInt5322 / local371 + arg3.anInt3531;
						arg6[local413] = local371;
					}
				} else {
					for (local413 = 0; local413 < local1125.aShort83; local413++) {
						local47 = local1125.aShortArray84[local413] + (arg1 << super.anInt7411);
						local1151 = local1125.aShortArray91[local413];
						local57 = local1125.aShortArray89[local413] + (arg4 << super.anInt7411);
						local255 = super.anInt3733 + (local57 * super.anInt3727 + super.anInt3725 * local1151 + super.anInt3735 * local47 >> 15);
						local295 = (local1151 * super.anInt3726 + super.anInt3736 * local47 + local57 * super.anInt3734 >> 15) + super.anInt3731;
						arg0[local413] = arg3.anInt3530 + local255 * super.aClass9_Sub2_10.anInt5337 / super.anInt3730;
						arg5[local413] = arg3.anInt3531 + local295 * super.aClass9_Sub2_10.anInt5322 / super.anInt3730;
						arg6[local413] = super.anInt3730;
					}
				}
				if (local1125.aShortArray83 == null) {
					for (local413 = 0; local413 < local1125.aShort82; local413++) {
						@Pc(1398) short local1398 = local1125.aShortArray88[local413];
						@Pc(1403) short local1403 = local1125.aShortArray86[local413];
						@Pc(1408) short local1408 = local1125.aShortArray90[local413];
						local442 = arg0[local1398];
						local225 = arg0[local1403];
						local273 = arg0[local1408];
						local330 = arg5[local1398];
						local402 = arg5[local1403];
						local244 = arg5[local1408];
						if (-((local330 - local402) * (-local225 + local273)) + (local244 - local402) * (local442 + -local225) > 0) {
							local313 = local1125.anIntArray377[local413];
							if (local313 != -1) {
								arg3.aBoolean220 = local442 < 0 || local225 < 0 || local273 < 0 || arg3.anInt3527 < local442 || local225 > arg3.anInt3527 || arg3.anInt3527 < local273;
								arg3.method3187(local330, local402, local244, local442, local225, local273, arg6[1], arg6[2], arg6[3], Static222.method3938(local313, local1125.aShortArray85[local1398]), Static222.method3938(local313, local1125.aShortArray85[local1403]), Static222.method3938(local313, local1125.aShortArray85[local1408]));
							}
						}
					}
				} else {
					local413 = super.anIntArrayArray31[arg1][arg4];
					local284 = super.anIntArrayArray31[arg1 + 1][arg4];
					local341 = super.anIntArrayArray31[arg1][arg4 + 1];
					local383 = super.anInt7410 * arg1;
					local442 = local383 + super.anInt7410;
					local225 = arg4 * super.anInt7410;
					local273 = super.anInt7410 + local225;
					local330 = super.anInt3733 + (local225 * super.anInt3727 + super.anInt3725 * local413 + super.anInt3735 * local383 >> 15);
					local402 = super.anInt3731 + (super.anInt3734 * local225 + super.anInt3726 * local413 + local383 * super.anInt3736 >> 15);
					local244 = (local225 * super.anInt3729 + super.anInt3728 * local413 + super.anInt3732 * local383 >> 15) + super.anInt3738;
					local313 = (super.anInt3727 * local225 + local442 * super.anInt3735 + local284 * super.anInt3725 >> 15) + super.anInt3733;
					local360 = (super.anInt3726 * local284 + local442 * super.anInt3736 + local225 * super.anInt3734 >> 15) + super.anInt3731;
					local431 = (local284 * super.anInt3728 + super.anInt3732 * local442 + local225 * super.anInt3729 >> 15) + super.anInt3738;
					local100 = (super.anInt3727 * local273 + local341 * super.anInt3725 + super.anInt3735 * local383 >> 15) + super.anInt3733;
					local123 = (local383 * super.anInt3736 + local341 * super.anInt3726 + local273 * super.anInt3734 >> 15) + super.anInt3731;
					local151 = (super.anInt3729 * local273 + local383 * super.anInt3732 + super.anInt3728 * local341 >> 15) + super.anInt3738;
					for (local179 = 0; local179 < local1125.aShort82; local179++) {
						@Pc(1776) short local1776 = local1125.aShortArray88[local179];
						@Pc(1781) short local1781 = local1125.aShortArray86[local179];
						@Pc(1786) short local1786 = local1125.aShortArray90[local179];
						local480 = arg0[local1776];
						@Pc(1794) int local1794 = arg0[local1781];
						@Pc(1798) int local1798 = arg0[local1786];
						@Pc(1802) int local1802 = arg5[local1776];
						@Pc(1806) int local1806 = arg5[local1781];
						@Pc(1810) int local1810 = arg5[local1786];
						if (-((local1802 - local1806) * (-local1794 + local1798)) + (local480 - local1794) * (-local1806 + local1810) > 0) {
							arg3.aBoolean220 = local480 < 0 || local1794 < 0 || local1798 < 0 || local480 > arg3.anInt3527 || arg3.anInt3527 < local1794 || local1798 > arg3.anInt3527;
							@Pc(1868) short local1868 = local1125.aShortArray83[local179];
							if (local1868 == -1) {
								@Pc(1925) int local1925 = local1125.anIntArray377[local179];
								if (local1925 != -1) {
									arg3.method3187(local1802, local1806, local1810, local480, local1794, local1798, arg6[1], arg6[2], arg6[3], Static222.method3938(local1925, local1125.aShortArray85[local1776]), Static222.method3938(local1925, local1125.aShortArray85[local1781]), Static222.method3938(local1925, local1125.aShortArray85[local1786]));
								}
							} else {
								if (this.method3322(super.aClass9_Sub2_10.anInterface8_13.method7085(local1868).aByte54)) {
									arg3.anInt3529 = 100;
								}
								arg3.method3177(local1802, local1806, local1810, local480, local1794, local1798, local1125.aShortArray85[local1776], local1125.aShortArray85[local1781], local1125.aShortArray85[local1786], local330, local313, local100, local402, local360, local123, local244, local431, local151, local1868);
								arg3.anInt3529 = 0;
							}
						}
					}
				}
			}
		} else if ((local29.aByte24 & 0x2) == 0) {
			@Pc(42) int local42 = super.anInt7410 * arg1;
			local47 = local42 + super.anInt7410;
			@Pc(52) int local52 = super.anInt7410 * arg4;
			local57 = super.anInt7410 + local52;
			@Pc(72) int local72;
			@Pc(82) int local82;
			@Pc(208) int local208;
			if ((local29.aByte24 & 0x1) == 0) {
				local72 = super.anIntArrayArray31[arg1][arg4];
				local82 = super.anIntArrayArray31[arg1 + 1][arg4];
				local208 = super.anIntArrayArray31[arg1 + 1][arg4 + 1];
				local480 = super.anIntArrayArray31[arg1][arg4 + 1];
				if (super.anInt3730 == -1) {
					local100 = (super.anInt3729 * local52 + super.anInt3732 * local42 + super.anInt3728 * local72 >> 15) + super.anInt3738;
					if (super.aClass9_Sub2_10.anInt5338 >= local100) {
						return;
					}
					local123 = (super.anInt3729 * local52 + super.anInt3728 * local82 + super.anInt3732 * local47 >> 15) + super.anInt3738;
					if (local123 <= super.aClass9_Sub2_10.anInt5338) {
						return;
					}
					local151 = super.anInt3738 + (local208 * super.anInt3728 + super.anInt3732 * local47 + local57 * super.anInt3729 >> 15);
					if (super.aClass9_Sub2_10.anInt5338 >= local151) {
						return;
					}
					local179 = super.anInt3738 + (super.anInt3729 * local57 + local42 * super.anInt3732 + super.anInt3728 * local480 >> 15);
					if (super.aClass9_Sub2_10.anInt5338 >= local179) {
						return;
					}
				} else {
					local179 = super.anInt3730;
					local151 = super.anInt3730;
					local123 = super.anInt3730;
					local100 = super.anInt3730;
				}
				local225 = super.anInt3733 + (local52 * super.anInt3727 + super.anInt3735 * local42 + local72 * super.anInt3725 >> 15);
				local255 = arg3.anInt3530 + local225 * super.aClass9_Sub2_10.anInt5337 / local100;
				local244 = super.anInt3731 + (super.anInt3734 * local52 + local72 * super.anInt3726 + super.anInt3736 * local42 >> 15);
				local284 = arg3.anInt3531 + local244 * super.aClass9_Sub2_10.anInt5322 / local100;
				local273 = (super.anInt3727 * local52 + super.anInt3725 * local82 + local47 * super.anInt3735 >> 15) + super.anInt3733;
				local295 = local273 * super.aClass9_Sub2_10.anInt5337 / local123 + arg3.anInt3530;
				local313 = (super.anInt3736 * local47 + super.anInt3726 * local82 + super.anInt3734 * local52 >> 15) + super.anInt3731;
				local330 = super.anInt3733 + (local208 * super.anInt3725 + local47 * super.anInt3735 + super.anInt3727 * local57 >> 15);
				local341 = super.aClass9_Sub2_10.anInt5322 * local313 / local123 + arg3.anInt3531;
				local360 = super.anInt3731 + (super.anInt3734 * local57 + local47 * super.anInt3736 + super.anInt3726 * local208 >> 15);
				local371 = super.aClass9_Sub2_10.anInt5337 * local330 / local151 + arg3.anInt3530;
				local402 = super.anInt3733 + (local42 * super.anInt3735 + super.anInt3725 * local480 + super.anInt3727 * local57 >> 15);
				local383 = arg3.anInt3531 + super.aClass9_Sub2_10.anInt5322 * local360 / local151;
				local413 = local402 * super.aClass9_Sub2_10.anInt5337 / local179 + arg3.anInt3530;
				local431 = super.anInt3731 + (local42 * super.anInt3736 + local480 * super.anInt3726 + local57 * super.anInt3734 >> 15);
				local442 = local431 * super.aClass9_Sub2_10.anInt5322 / local179 + arg3.anInt3531;
			} else {
				local72 = super.anIntArrayArray31[arg1][arg4];
				if (super.anInt3730 == -1) {
					local82 = super.anInt3728 * local72;
					local100 = super.anInt3738 + (local82 + super.anInt3732 * local42 + local52 * super.anInt3729 >> 15);
					if (super.aClass9_Sub2_10.anInt5338 >= local100) {
						return;
					}
					local123 = (super.anInt3729 * local52 + local47 * super.anInt3732 + local82 >> 15) + super.anInt3738;
					if (local123 <= super.aClass9_Sub2_10.anInt5338) {
						return;
					}
					local151 = super.anInt3738 + (local47 * super.anInt3732 + local82 + local57 * super.anInt3729 >> 15);
					if (super.aClass9_Sub2_10.anInt5338 >= local151) {
						return;
					}
					local179 = super.anInt3738 + (super.anInt3732 * local42 + local82 + super.anInt3729 * local57 >> 15);
					if (super.aClass9_Sub2_10.anInt5338 >= local179) {
						return;
					}
				} else {
					local179 = super.anInt3730;
					local151 = super.anInt3730;
					local123 = super.anInt3730;
					local100 = super.anInt3730;
				}
				local82 = super.anInt3725 * local72;
				local208 = super.anInt3726 * local72;
				local225 = super.anInt3733 + (local82 + super.anInt3735 * local42 + local52 * super.anInt3727 >> 15);
				local244 = super.anInt3731 + (super.anInt3734 * local52 + local42 * super.anInt3736 + local208 >> 15);
				local255 = local225 * super.aClass9_Sub2_10.anInt5337 / local100 + arg3.anInt3530;
				local273 = super.anInt3733 + (super.anInt3727 * local52 + super.anInt3735 * local47 + local82 >> 15);
				local284 = local244 * super.aClass9_Sub2_10.anInt5322 / local100 + arg3.anInt3531;
				local295 = local273 * super.aClass9_Sub2_10.anInt5337 / local123 + arg3.anInt3530;
				local313 = super.anInt3731 + (local208 + local47 * super.anInt3736 + local52 * super.anInt3734 >> 15);
				local330 = super.anInt3733 + (local57 * super.anInt3727 + local82 + super.anInt3735 * local47 >> 15);
				local341 = local313 * super.aClass9_Sub2_10.anInt5322 / local123 + arg3.anInt3531;
				local360 = super.anInt3731 + (local208 + local47 * super.anInt3736 + super.anInt3734 * local57 >> 15);
				local371 = local330 * super.aClass9_Sub2_10.anInt5337 / local151 + arg3.anInt3530;
				local383 = arg3.anInt3531 + super.aClass9_Sub2_10.anInt5322 * local360 / local151;
				local402 = super.anInt3733 + (local82 + local42 * super.anInt3735 + super.anInt3727 * local57 >> 15);
				local413 = local402 * super.aClass9_Sub2_10.anInt5337 / local179 + arg3.anInt3530;
				local431 = super.anInt3731 + (super.anInt3736 * local42 + local208 + local57 * super.anInt3734 >> 15);
				local442 = arg3.anInt3531 + local431 * super.aClass9_Sub2_10.anInt5322 / local179;
			}
			if (-((local383 - local442) * (-local413 + local295)) + (local341 - local442) * (local371 - local413) > 0) {
				arg3.aBoolean220 = local371 < 0 || local413 < 0 || local295 < 0 || arg3.anInt3527 < local371 || local413 > arg3.anInt3527 || local295 > arg3.anInt3527;
				if (local29.aShort50 < 0) {
					arg3.method3187(local383, local442, local341, local371, local413, local295, local151, local179, local123, local29.aShort53 & 0xFFFF, local29.aShort52 & 0xFFFF, local29.aShort51 & 0xFFFF);
				} else {
					if (this.method3322(super.aClass9_Sub2_10.anInterface8_13.method7085(local29.aShort50).aByte54)) {
						arg3.anInt3529 = 100;
					}
					arg3.method3177(local383, local442, local341, local371, local413, local295, local29.aShort53 & 0xFFFF, local29.aShort52 & 0xFFFF, local29.aShort51 & 0xFFFF, local225, local273, local402, local244, local313, local431, local100, local123, local179, local29.aShort50);
					arg3.anInt3529 = 0;
				}
			}
			if ((local442 - local341) * (-local295 + local255) - (local413 - local295) * (local284 - local341) > 0) {
				arg3.aBoolean220 = local255 < 0 || local295 < 0 || local413 < 0 || arg3.anInt3527 < local255 || local295 > arg3.anInt3527 || arg3.anInt3527 < local413;
				if (local29.aShort50 < 0) {
					arg3.method3187(local284, local341, local442, local255, local295, local413, local100, local123, local179, local29.aShort54 & 0xFFFF, local29.aShort51 & 0xFFFF, local29.aShort52 & 0xFFFF);
					return;
				}
				if (this.method3322(super.aClass9_Sub2_10.anInterface8_13.method7085(local29.aShort50).aByte54)) {
					arg3.anInt3529 = 100;
				}
				arg3.method3177(local284, local341, local442, local255, local295, local413, local29.aShort54 & 0xFFFF, local29.aShort51 & 0xFFFF, local29.aShort52 & 0xFFFF, local225, local273, local402, local244, local313, local431, local100, local123, local179, local29.aShort50);
				arg3.anInt3529 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6337(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class253_Sub2 local9 = (Class253_Sub2) super.aClass9_Sub2_10.method4655(Thread.currentThread());
		@Pc(12) Class105 local12 = local9.aClass105_2;
		local12.aBoolean220 = false;
		local12.anInt3529 = 0;
		if (super.aClass45ArrayArray3 != null) {
			this.method3328(local12, arg2, arg1, local9.anIntArray802, local9.anIntArray792, arg0, arg4, arg3);
		} else if (super.aClass94ArrayArray3 != null) {
			this.method3327(arg2, local12, local9.anIntArray792, arg4, arg3, arg1, arg0, local9.anIntArray802);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILclient!gj;[I[[ZIII[IIIII)V")
	private void method3327(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(14) int local14 = (arg4 - arg5) * 1024 / 256;
		arg1.aBoolean221 = false;
		arg1.aBoolean219 = false;
		@Pc(30) int local30 = 0;
		@Pc(35) int local35 = local14;
		for (@Pc(37) int local37 = arg6; local37 < arg0; local37++) {
			for (@Pc(41) int local41 = arg5; local41 < arg4; local41++) {
				if (arg3[local37 - arg6][local41 - arg5]) {
					@Pc(89) int local89;
					if (super.aClass94ArrayArray3[local37][local41] != null) {
						@Pc(69) Class94 local69 = super.aClass94ArrayArray3[local37][local41];
						if (local69.aShort50 != -1 && (local69.aByte24 & 0x2) == 0 && local69.anInt3319 == -1) {
							local89 = super.aClass9_Sub2_10.method4652(local69.aShort50);
							arg1.method3187(local35 - 4, local35 - 4, local35, local30 + 4, local30, local30 + 4, 0, 0, 0, Static222.method3938(local89, local69.aShort53 & 0xFFFF), Static222.method3938(local89, local69.aShort52 & 0xFFFF), Static222.method3938(local89, local69.aShort51 & 0xFFFF));
							arg1.method3187(local35, local35, local35 - 4, local30, local30 + 4, local30, 0, 0, 0, Static222.method3938(local89, local69.aShort54 & 0xFFFF), Static222.method3938(local89, local69.aShort51 & 0xFFFF), Static222.method3938(local89, local69.aShort52 & 0xFFFF));
						} else if (local69.anInt3319 == -1) {
							arg1.method3187(local35 - 4, local35 - 4, local35, local30 + 4, local30, local30 + 4, 0, 0, 0, local69.aShort53 & 0xFFFF, local69.aShort52 & 0xFFFF, local69.aShort51 & 0xFFFF);
							arg1.method3187(local35, local35, local35 - 4, local30, local30 + 4, local30, 0, 0, 0, local69.aShort54 & 0xFFFF, local69.aShort51 & 0xFFFF, local69.aShort52 & 0xFFFF);
						} else {
							local89 = local69.anInt3319;
							arg1.method3187(local35 - 4, local35 + -4, local35, local30 + 4, local30, local30 + 4, 0, 0, 0, local89, local89, local89);
							arg1.method3187(local35, local35, local35 - 4, local30, local30 + 4, local30, 0, 0, 0, local89, local89, local89);
						}
					} else if (super.aClass176ArrayArray3[local37][local41] != null) {
						@Pc(300) Class176 local300 = super.aClass176ArrayArray3[local37][local41];
						for (local89 = 0; local89 < local300.aShort83; local89++) {
							arg2[local89] = local300.aShortArray84[local89] * 4 / super.anInt7410 + local30;
							arg7[local89] = local35 - local300.aShortArray89[local89] * 4 / super.anInt7410;
						}
						for (@Pc(340) int local340 = 0; local340 < local300.aShort82; local340++) {
							@Pc(347) short local347 = local300.aShortArray88[local340];
							@Pc(352) short local352 = local300.aShortArray86[local340];
							@Pc(357) short local357 = local300.aShortArray90[local340];
							@Pc(361) int local361 = arg2[local347];
							@Pc(365) int local365 = arg2[local352];
							@Pc(369) int local369 = arg2[local357];
							@Pc(373) int local373 = arg7[local347];
							@Pc(377) int local377 = arg7[local352];
							@Pc(381) int local381 = arg7[local357];
							@Pc(395) int local395;
							if (local300.anIntArray378 != null && local300.anIntArray378[local340] != -1) {
								local395 = local300.anIntArray378[local340];
								arg1.method3187(local373, local377, local381, local361, local365, local369, 0, 0, 0, Static222.method3938(local395, local300.aShortArray85[local347]), Static222.method3938(local395, local300.aShortArray85[local352]), Static222.method3938(local395, local300.aShortArray85[local357]));
							} else if (local300.aShortArray83 == null || local300.aShortArray83[local340] == -1) {
								local395 = local300.anIntArray377[local340];
								arg1.method3187(local373, local377, local381, local361, local365, local369, 0, 0, 0, Static222.method3938(local395, local300.aShortArray85[local347]), Static222.method3938(local395, local300.aShortArray85[local352]), Static222.method3938(local395, local300.aShortArray85[local357]));
							} else {
								local395 = super.aClass9_Sub2_10.method4652(local300.aShortArray83[local340]);
								arg1.method3187(local373, local377, local381, local361, local365, local369, 0, 0, 0, Static222.method3938(local395, local300.aShortArray85[local347]), Static222.method3938(local395, local300.aShortArray85[local352]), Static222.method3938(local395, local300.aShortArray85[local357]));
							}
						}
					}
				}
				local35 -= 4;
			}
			local35 = local14;
			local30 += 4;
		}
		arg1.aBoolean219 = true;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V")
	@Override
	public void method6333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class253_Sub2 local9 = (Class253_Sub2) super.aClass9_Sub2_10.method4655(Thread.currentThread());
		local9.aClass105_2.anInt3529 = 0;
		if (super.aClass45ArrayArray3 != null) {
			this.method3324(arg1, local9.anIntArray792, local9.aClass105_2, local9.anIntArray802, local9.anIntArray796, arg0, super.aClass9_Sub2_10.aBoolean368, local9.anIntArray813);
		} else if (super.aClass94ArrayArray3 != null) {
			this.method3326(local9.anIntArray792, arg0, local9.anIntArray813, local9.aClass105_2, arg1, local9.anIntArray802, local9.anIntArray796);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!gj;IIII[I[IIII[[ZI)V")
	private void method3328(@OriginalArg(0) Class105 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int[] arg4, @OriginalArg(9) int arg5, @OriginalArg(10) boolean[][] arg6, @OriginalArg(11) int arg7) {
		@Pc(17) int local17 = (arg7 - arg2) * 1024 / 256;
		arg0.aBoolean221 = false;
		arg0.aBoolean219 = false;
		@Pc(29) int local29 = 0;
		@Pc(33) int local33 = local17;
		for (@Pc(35) int local35 = arg5; local35 < arg1; local35++) {
			for (@Pc(39) int local39 = arg2; local39 < arg7; local39++) {
				if (arg6[local35 - arg5][local39 - arg2]) {
					@Pc(76) int local76;
					if (super.aClass45ArrayArray3[local35][local39] != null) {
						@Pc(306) Class45 local306 = super.aClass45ArrayArray3[local35][local39];
						if (local306.aShort19 != -1 && (local306.aByte3 & 0x2) == 0 && local306.anInt1728 == 0) {
							local76 = super.aClass9_Sub2_10.method4652(local306.aShort19);
							arg0.method3187(local33 - 4, local33 + -4, local33, local29 + 4, local29, local29 + 4, 0, 0, 0, Static222.method3938(local76, local306.anInt1730), Static222.method3938(local76, local306.anInt1729), Static222.method3938(local76, local306.anInt1726));
							arg0.method3187(local33, local33, local33 - 4, local29, local29 + 4, local29, 0, 0, 0, Static222.method3938(local76, local306.anInt1727), Static222.method3938(local76, local306.anInt1726), Static222.method3938(local76, local306.anInt1729));
						} else if (local306.anInt1728 == 0) {
							arg0.method3173(local33 - 4, local33 + -4, local33, local29 + 4, local29, local29 + 4, 0, 0, 0, local306.anInt1730, local306.anInt1729, local306.anInt1726);
							arg0.method3173(local33, local33, local33 - 4, local29, local29 + 4, local29, 0, 0, 0, local306.anInt1727, local306.anInt1726, local306.anInt1729);
						} else {
							local76 = local306.anInt1728;
							arg0.method3173(local33 - 4, local33 + -4, local33, local29 + 4, local29, local29 + 4, 0, 0, 0, Static102.method2277(local306.anInt1730 & 0xFF000000, local76), Static102.method2277(local306.anInt1729 & 0xFF000000, local76), Static102.method2277(local306.anInt1726 & 0xFF000000, local76));
							arg0.method3173(local33, local33, local33 - 4, local29, local29 + 4, local29, 0, 0, 0, Static102.method2277(local306.anInt1727 & 0xFF000000, local76), Static102.method2277(local306.anInt1726 & 0xFF000000, local76), Static102.method2277(local306.anInt1729 & 0xFF000000, local76));
						}
					} else if (super.aClass158ArrayArray3[local35][local39] != null) {
						@Pc(74) Class158 local74 = super.aClass158ArrayArray3[local35][local39];
						for (local76 = 0; local76 < local74.aShort75; local76++) {
							arg4[local76] = local29 + local74.aShortArray76[local76] * 4 / super.anInt7410;
							arg3[local76] = local33 - local74.aShortArray75[local76] * 4 / super.anInt7410;
						}
						for (@Pc(118) int local118 = 0; local118 < local74.aShort74; local118++) {
							@Pc(124) int local124 = local118 * 3;
							@Pc(128) int local128 = local124 + 1;
							@Pc(132) int local132 = local128 + 1;
							@Pc(136) int local136 = arg4[local124];
							@Pc(140) int local140 = arg4[local128];
							@Pc(144) int local144 = arg4[local132];
							@Pc(148) int local148 = arg3[local124];
							@Pc(152) int local152 = arg3[local128];
							@Pc(156) int local156 = arg3[local132];
							@Pc(184) int local184;
							if (local74.anIntArray336 != null && local74.anIntArray336[local118] != 0 && (local74.aShortArray79 == null || local74.aShortArray79 != null && local74.aShortArray79[local118] == -1)) {
								local184 = local74.anIntArray336[local118];
								arg0.method3173(local148, local152, local156, local136, local140, local144, 0, 0, 0, Static102.method2277(-(local74.anIntArray337[local124] & -16777216) - 16777216, local184), Static102.method2277(-(local74.anIntArray337[local128] & 0xFF000000) - 16777216, local184), Static102.method2277(-(local74.anIntArray337[local132] & -16777216) - 16777216, local184));
							} else if (local74.aShortArray79 == null || local74.aShortArray79[local118] == -1) {
								arg0.method3173(local148, local152, local156, local136, local140, local144, 0, 0, 0, local74.anIntArray337[local124], local74.anIntArray337[local128], local74.anIntArray337[local132]);
							} else {
								local184 = super.aClass9_Sub2_10.method4652(local74.aShortArray79[local118]);
								arg0.method3187(local148, local152, local156, local136, local140, local144, 0, 0, 0, local184, local184, local184);
							}
						}
					}
				}
				local33 -= 4;
			}
			local29 += 4;
			local33 = local17;
		}
		arg0.aBoolean219 = true;
	}
}
