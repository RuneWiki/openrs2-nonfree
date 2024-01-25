import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class10_Sub1_Sub1 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!aw;IIII[[I[[II)V")
	public Class10_Sub1_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
	@Override
	public void method6333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class253_Sub1 local9 = (Class253_Sub1) super.aClass9_Sub2_10.method4655(Thread.currentThread());
		local9.aClass221_2.anInt6421 = 0;
		if (super.aClass45ArrayArray3 != null) {
			this.method706(local9.anIntArray813, arg1, super.aClass9_Sub2_10.aBoolean368, arg0, local9.anIntArray792, local9.aClass221_2, local9.anIntArray802);
		} else if (super.aClass94ArrayArray3 != null) {
			this.method712(local9.anIntArray813, arg0, local9.aClass221_2, arg1, local9.anIntArray792, local9.anIntArray802);
			return;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([IIIZI[ILclient!oo;[I)V")
	private void method706(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class221 arg5, @OriginalArg(7) int[] arg6) {
		@Pc(12) Class45 local12 = super.aClass45ArrayArray3[arg3][arg1];
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(465) int local465;
		@Pc(529) int local529;
		@Pc(611) int local611;
		@Pc(653) int local653;
		@Pc(518) int local518;
		@Pc(560) int local560;
		@Pc(642) int local642;
		@Pc(684) int local684;
		@Pc(453) int local453;
		@Pc(507) int local507;
		@Pc(580) int local580;
		@Pc(631) int local631;
		@Pc(487) int local487;
		@Pc(549) int local549;
		@Pc(600) int local600;
		@Pc(673) int local673;
		@Pc(107) int local107;
		@Pc(106) int local106;
		@Pc(104) int local104;
		@Pc(102) int local102;
		@Pc(44) int local44;
		@Pc(46) int local46;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(241) int local241;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(84) int local84;
		@Pc(93) int local93;
		@Pc(332) int local332;
		if (local12 == null) {
			@Pc(1598) Class158 local1598 = super.aClass158ArrayArray3[arg3][arg1];
			if (local1598 != null) {
				if (super.anInt3730 == -1) {
					for (local653 = 0; local653 < local1598.aShort75; local653++) {
						local31 = local1598.aShortArray76[local653] + (arg3 << super.anInt7411);
						local36 = local1598.aShortArray77[local653];
						local42 = local1598.aShortArray75[local653] + (arg1 << super.anInt7411);
						local611 = super.anInt3738 + (super.anInt3732 * local31 + super.anInt3728 * local36 + local42 * super.anInt3729 >> 15);
						if (super.aClass9_Sub2_10.anInt5338 >= local611) {
							return;
						}
						arg0[local653] = 0;
						if (arg2) {
							local518 = local611 - super.aClass9_Sub2_10.anInt5331;
							if (local518 > 255) {
								local518 = 255;
							}
							if (local518 > 0) {
								arg0[local653] = local518;
								local560 = local1598.aShortArray74[local653] * local518 / 255;
								if (local560 > 0) {
									local36 -= local560;
								}
							}
						} else if (super.aClass9_Sub2_10.aBoolean370) {
							local518 = local611 - super.aClass9_Sub2_10.anInt5331;
							if (local518 > 0) {
								arg0[local653] = local518;
								if (arg0[local653] > 255) {
									arg0[local653] = 255;
								}
							}
						}
						local465 = (super.anInt3727 * local42 + super.anInt3735 * local31 + super.anInt3725 * local36 >> 15) + super.anInt3733;
						local529 = super.anInt3731 + (super.anInt3734 * local42 + super.anInt3736 * local31 + local36 * super.anInt3726 >> 15);
						arg4[local653] = local465 * super.aClass9_Sub2_10.anInt5337 / local611 + arg5.anInt6422;
						arg6[local653] = arg5.anInt6424 + local529 * super.aClass9_Sub2_10.anInt5322 / local611;
					}
				} else {
					for (local653 = 0; local653 < local1598.aShort75; local653++) {
						local31 = local1598.aShortArray76[local653] + (arg3 << super.anInt7411);
						local36 = local1598.aShortArray77[local653];
						local42 = local1598.aShortArray75[local653] + (arg1 << super.anInt7411);
						arg0[local653] = 0;
						if (arg2) {
							local518 = super.anInt3730 - super.aClass9_Sub2_10.anInt5331;
							if (local518 > 255) {
								local518 = 255;
							}
							if (local518 > 0) {
								arg0[local653] = local518;
								local560 = local518 * local1598.aShortArray74[local653] / 255;
								if (local560 > 0) {
									local36 -= local560;
								}
							}
						} else if (super.aClass9_Sub2_10.aBoolean370) {
							local518 = -super.aClass9_Sub2_10.anInt5331 + super.anInt3730;
							if (local518 > 0) {
								arg0[local653] = local518;
								if (arg0[local653] > 255) {
									arg0[local653] = 255;
								}
							}
						}
						local465 = (local31 * super.anInt3735 + super.anInt3725 * local36 + local42 * super.anInt3727 >> 15) + super.anInt3733;
						local529 = super.anInt3731 + (super.anInt3734 * local42 + local31 * super.anInt3736 + super.anInt3726 * local36 >> 15);
						arg4[local653] = local465 * super.aClass9_Sub2_10.anInt5337 / super.anInt3730 + arg5.anInt6422;
						arg6[local653] = local529 * super.aClass9_Sub2_10.anInt5322 / super.anInt3730 + arg5.anInt6424;
					}
				}
				if (local1598.aShortArray79 == null) {
					for (local653 = 0; local653 < local1598.aShort74; local653++) {
						local518 = local653 * 3;
						local560 = local518 + 1;
						local642 = local560 + 1;
						local684 = arg4[local518];
						local453 = arg4[local560];
						local507 = arg4[local642];
						local580 = arg6[local518];
						local631 = arg6[local560];
						local487 = arg6[local642];
						local549 = arg0[local642] + arg0[local560] + arg0[local518];
						if (-((local507 - local453) * (local580 - local631)) + (local684 - local453) * (-local631 + local487) > 0) {
							arg5.aBoolean429 = local684 < 0 || local453 < 0 || local507 < 0 || arg5.anInt6419 < local684 || arg5.anInt6419 < local453 || arg5.anInt6419 < local507;
							if (local549 >= 765) {
								arg5.method5582(local580, local631, local487, local684, local453, local507, super.aClass9_Sub2_10.anInt5344);
							} else if (local549 > 0) {
								if ((local1598.anIntArray337[local518] & 0xFFFFFF) != 0) {
									arg5.method5574(local580, local631, local487, local684, local453, local507, Static99.method2251(local1598.anIntArray337[local518], super.aClass9_Sub2_10.anInt5344, arg0[local518]), Static99.method2251(local1598.anIntArray337[local560], super.aClass9_Sub2_10.anInt5344, arg0[local560]), Static99.method2251(local1598.anIntArray337[local642], super.aClass9_Sub2_10.anInt5344, arg0[local642]));
								}
							} else if ((local1598.anIntArray337[local518] & 0xFFFFFF) != 0) {
								arg5.method5574(local580, local631, local487, local684, local453, local507, local1598.anIntArray337[local518], local1598.anIntArray337[local560], local1598.anIntArray337[local642]);
							}
						}
					}
				} else {
					local653 = super.anIntArrayArray31[arg3][arg1];
					local518 = super.anIntArrayArray31[arg3 + 1][arg1];
					local560 = super.anIntArrayArray31[arg3][arg1 + 1];
					local642 = arg3 * super.anInt7410;
					local684 = super.anInt7410 + local642;
					local453 = arg1 * super.anInt7410;
					local507 = super.anInt7410 + local453;
					local580 = super.anInt3733 + (local453 * super.anInt3727 + super.anInt3725 * local653 + super.anInt3735 * local642 >> 15);
					local631 = super.anInt3731 + (super.anInt3736 * local642 + local653 * super.anInt3726 + super.anInt3734 * local453 >> 15);
					local487 = (super.anInt3729 * local453 + local653 * super.anInt3728 + local642 * super.anInt3732 >> 15) + super.anInt3738;
					local549 = super.anInt3733 + (local518 * super.anInt3725 + super.anInt3735 * local684 + local453 * super.anInt3727 >> 15);
					local600 = (super.anInt3734 * local453 + local518 * super.anInt3726 + local684 * super.anInt3736 >> 15) + super.anInt3731;
					local673 = super.anInt3738 + (local453 * super.anInt3729 + super.anInt3732 * local684 + local518 * super.anInt3728 >> 15);
					local107 = super.anInt3733 + (local507 * super.anInt3727 + super.anInt3735 * local642 + local560 * super.anInt3725 >> 15);
					local106 = super.anInt3731 + (super.anInt3726 * local560 + super.anInt3736 * local642 + super.anInt3734 * local507 >> 15);
					local104 = (super.anInt3729 * local507 + local642 * super.anInt3732 + local560 * super.anInt3728 >> 15) + super.anInt3738;
					for (local102 = 0; local102 < local1598.aShort74; local102++) {
						local44 = local102 * 3;
						local46 = local44 + 1;
						local48 = local46 + 1;
						local50 = arg4[local44];
						local241 = arg4[local46];
						local64 = arg4[local48];
						local73 = arg6[local44];
						local84 = arg6[local46];
						local93 = arg6[local48];
						local332 = arg0[local48] + arg0[local46] + arg0[local44];
						if ((local50 - local241) * (local93 - local84) - (local73 - local84) * (-local241 + local64) > 0) {
							arg5.aBoolean429 = local50 < 0 || local241 < 0 || local64 < 0 || local50 > arg5.anInt6419 || local241 > arg5.anInt6419 || local64 > arg5.anInt6419;
							@Pc(2556) short local2556 = local1598.aShortArray79[local102];
							if (local332 < 765) {
								if (local2556 != -1 && this.method3322(super.aClass9_Sub2_10.anInterface8_13.method7085(local2556).aByte54)) {
									arg5.anInt6421 = 100;
								}
								if (local332 <= 0) {
									if (local2556 != -1) {
										arg5.method5580(local73, local84, local93, local50, local241, local64, local1598.anIntArray337[local44], local1598.anIntArray337[local46], local1598.anIntArray337[local48], local580, local549, local107, local631, local600, local106, local487, local673, local104, local2556);
									} else if ((local1598.anIntArray337[local44] & 0xFFFFFF) != 0) {
										arg5.method5574(local73, local84, local93, local50, local241, local64, local1598.anIntArray337[local44], local1598.anIntArray337[local46], local1598.anIntArray337[local48]);
									}
								} else if (local2556 != -1) {
									arg5.method5571(local73, local84, local93, local50, local241, local64, super.aClass9_Sub2_10.anInt5344, arg0[local44], arg0[local46], arg0[local48], local1598.anIntArray337[local44], local1598.anIntArray337[local46], local1598.anIntArray337[local48], local580, local549, local107, local631, local600, local106, local487, local673, local104, local2556);
								} else if ((local1598.anIntArray337[local44] & 0xFFFFFF) != 0) {
									arg5.method5574(local73, local84, local93, local50, local241, local64, Static102.method2277(super.aClass9_Sub2_10.anInt5344 | arg0[local44] << 24, local1598.anIntArray337[local44]), Static102.method2277(super.aClass9_Sub2_10.anInt5344 | arg0[local46] << 24, local1598.anIntArray337[local46]), Static102.method2277(arg0[local48] << 24 | super.aClass9_Sub2_10.anInt5344, local1598.anIntArray337[local48]));
								}
								arg5.anInt6421 = 0;
							} else {
								arg5.method5582(local73, local84, local93, local50, local241, local64, super.aClass9_Sub2_10.anInt5344);
							}
						}
					}
				}
			}
		} else if ((local12.aByte3 & 0x2) == 0) {
			@Pc(25) int local25 = arg3 * super.anInt7410;
			local31 = local25 + super.anInt7410;
			local36 = super.anInt7410 * arg1;
			local42 = local36 + super.anInt7410;
			local44 = 0;
			local46 = 0;
			local48 = 0;
			local50 = 0;
			if ((local12.aByte3 & 0x1) == 0 || arg2) {
				local64 = super.anIntArrayArray31[arg3][arg1];
				local73 = super.anIntArrayArray31[arg3 + 1][arg1];
				local84 = super.anIntArrayArray31[arg3 + 1][arg1 + 1];
				local93 = super.anIntArrayArray31[arg3][arg1 + 1];
				if (super.anInt3730 == -1) {
					local107 = super.anInt3738 + (local36 * super.anInt3729 + local25 * super.anInt3732 + local64 * super.anInt3728 >> 15);
					if (super.aClass9_Sub2_10.anInt5338 >= local107) {
						return;
					}
					local106 = super.anInt3738 + (super.anInt3728 * local73 + super.anInt3732 * local31 + super.anInt3729 * local36 >> 15);
					if (local106 <= super.aClass9_Sub2_10.anInt5338) {
						return;
					}
					local104 = super.anInt3738 + (local84 * super.anInt3728 + local31 * super.anInt3732 + local42 * super.anInt3729 >> 15);
					if (super.aClass9_Sub2_10.anInt5338 >= local104) {
						return;
					}
					local102 = super.anInt3738 + (local25 * super.anInt3732 + super.anInt3728 * local93 + local42 * super.anInt3729 >> 15);
					if (local102 <= super.aClass9_Sub2_10.anInt5338) {
						return;
					}
				} else {
					local102 = super.anInt3730;
					local104 = super.anInt3730;
					local106 = super.anInt3730;
					local107 = super.anInt3730;
				}
				if (arg2) {
					local241 = local107 - super.aClass9_Sub2_10.anInt5331;
					if (local241 > 255) {
						local241 = 255;
					}
					if (local241 > 0) {
						local44 = local241;
						local332 = local241 * local12.aShort18 / 255;
						if (local332 > 0) {
							local64 -= local332;
						}
					}
					local241 = local106 - super.aClass9_Sub2_10.anInt5331;
					if (local241 > 255) {
						local241 = 255;
					}
					if (local241 > 0) {
						local46 = local241;
						local332 = local241 * local12.aShort21 / 255;
						if (local332 > 0) {
							local73 -= local332;
						}
					}
					local241 = local104 - super.aClass9_Sub2_10.anInt5331;
					if (local241 > 255) {
						local241 = 255;
					}
					if (local241 > 0) {
						local48 = local241;
						local332 = local12.aShort17 * local241 / 255;
						if (local332 > 0) {
							local84 -= local332;
						}
					}
					local241 = local102 - super.aClass9_Sub2_10.anInt5331;
					if (local241 > 255) {
						local241 = 255;
					}
					if (local241 > 0) {
						local50 = local241;
						local332 = local241 * local12.aShort20 / 255;
						if (local332 > 0) {
							local93 -= local332;
						}
					}
				} else if (super.aClass9_Sub2_10.aBoolean370) {
					local241 = local107 - super.aClass9_Sub2_10.anInt5331;
					if (local241 > 0) {
						local44 = local241;
						if (local241 > 255) {
							local44 = 255;
						}
					}
					local241 = local106 - super.aClass9_Sub2_10.anInt5331;
					if (local241 > 0) {
						local46 = local241;
						if (local241 > 255) {
							local46 = 255;
						}
					}
					local241 = local104 - super.aClass9_Sub2_10.anInt5331;
					if (local241 > 0) {
						local48 = local241;
						if (local241 > 255) {
							local48 = 255;
						}
					}
					local241 = local102 - super.aClass9_Sub2_10.anInt5331;
					if (local241 > 0) {
						local50 = local241;
						if (local241 > 255) {
							local50 = 255;
						}
					}
				}
				local453 = super.anInt3733 + (super.anInt3725 * local64 + local25 * super.anInt3735 + super.anInt3727 * local36 >> 15);
				local465 = arg5.anInt6422 + local453 * super.aClass9_Sub2_10.anInt5337 / local107;
				local487 = super.anInt3731 + (super.anInt3736 * local25 + super.anInt3726 * local64 + local36 * super.anInt3734 >> 15);
				local507 = (super.anInt3725 * local73 + super.anInt3735 * local31 + super.anInt3727 * local36 >> 15) + super.anInt3733;
				local518 = arg5.anInt6424 + local487 * super.aClass9_Sub2_10.anInt5322 / local107;
				local529 = local507 * super.aClass9_Sub2_10.anInt5337 / local106 + arg5.anInt6422;
				local549 = (super.anInt3734 * local36 + super.anInt3726 * local73 + super.anInt3736 * local31 >> 15) + super.anInt3731;
				local560 = super.aClass9_Sub2_10.anInt5322 * local549 / local106 + arg5.anInt6424;
				local580 = (super.anInt3727 * local42 + local31 * super.anInt3735 + super.anInt3725 * local84 >> 15) + super.anInt3733;
				local600 = (local42 * super.anInt3734 + super.anInt3726 * local84 + super.anInt3736 * local31 >> 15) + super.anInt3731;
				local611 = local580 * super.aClass9_Sub2_10.anInt5337 / local104 + arg5.anInt6422;
				local631 = (local42 * super.anInt3727 + super.anInt3735 * local25 + local93 * super.anInt3725 >> 15) + super.anInt3733;
				local642 = local600 * super.aClass9_Sub2_10.anInt5322 / local104 + arg5.anInt6424;
				local653 = local631 * super.aClass9_Sub2_10.anInt5337 / local102 + arg5.anInt6422;
				local673 = super.anInt3731 + (super.anInt3734 * local42 + local93 * super.anInt3726 + local25 * super.anInt3736 >> 15);
				local684 = super.aClass9_Sub2_10.anInt5322 * local673 / local102 + arg5.anInt6424;
			} else {
				local64 = super.anIntArrayArray31[arg3][arg1];
				if (super.anInt3730 == -1) {
					local73 = super.anInt3728 * local64;
					local107 = (local36 * super.anInt3729 + local73 + super.anInt3732 * local25 >> 15) + super.anInt3738;
					if (super.aClass9_Sub2_10.anInt5338 >= local107) {
						return;
					}
					local106 = super.anInt3738 + (local36 * super.anInt3729 + super.anInt3732 * local31 + local73 >> 15);
					if (super.aClass9_Sub2_10.anInt5338 >= local106) {
						return;
					}
					local104 = super.anInt3738 + (super.anInt3729 * local42 + local31 * super.anInt3732 + local73 >> 15);
					if (super.aClass9_Sub2_10.anInt5338 >= local104) {
						return;
					}
					local102 = super.anInt3738 + (super.anInt3729 * local42 + local73 + local25 * super.anInt3732 >> 15);
					if (super.aClass9_Sub2_10.anInt5338 >= local102) {
						return;
					}
				} else {
					local102 = super.anInt3730;
					local104 = super.anInt3730;
					local106 = super.anInt3730;
					local107 = super.anInt3730;
				}
				if (super.aClass9_Sub2_10.aBoolean370) {
					local241 = local107 - super.aClass9_Sub2_10.anInt5331;
					if (local241 > 0) {
						local44 = local241;
						if (local241 > 255) {
							local44 = 255;
						}
					}
					local241 = local106 - super.aClass9_Sub2_10.anInt5331;
					if (local241 > 0) {
						local46 = local241;
						if (local241 > 255) {
							local46 = 255;
						}
					}
					local241 = local104 - super.aClass9_Sub2_10.anInt5331;
					if (local241 > 0) {
						local48 = local241;
						if (local241 > 255) {
							local48 = 255;
						}
					}
					local241 = local102 - super.aClass9_Sub2_10.anInt5331;
					if (local241 > 0) {
						local50 = local241;
						if (local241 > 255) {
							local50 = 255;
						}
					}
				}
				local73 = super.anInt3725 * local64;
				local84 = local64 * super.anInt3726;
				local453 = super.anInt3733 + (super.anInt3727 * local36 + local73 + super.anInt3735 * local25 >> 15);
				local487 = super.anInt3731 + (super.anInt3736 * local25 + local84 + super.anInt3734 * local36 >> 15);
				local465 = arg5.anInt6422 + super.aClass9_Sub2_10.anInt5337 * local453 / local107;
				local518 = local487 * super.aClass9_Sub2_10.anInt5322 / local107 + arg5.anInt6424;
				local507 = super.anInt3733 + (super.anInt3727 * local36 + local31 * super.anInt3735 + local73 >> 15);
				local549 = (local36 * super.anInt3734 + local31 * super.anInt3736 + local84 >> 15) + super.anInt3731;
				local529 = arg5.anInt6422 + local507 * super.aClass9_Sub2_10.anInt5337 / local106;
				local580 = super.anInt3733 + (local42 * super.anInt3727 + local73 + local31 * super.anInt3735 >> 15);
				local560 = local549 * super.aClass9_Sub2_10.anInt5322 / local106 + arg5.anInt6424;
				local600 = (super.anInt3734 * local42 + local31 * super.anInt3736 + local84 >> 15) + super.anInt3731;
				local611 = local580 * super.aClass9_Sub2_10.anInt5337 / local104 + arg5.anInt6422;
				local642 = local600 * super.aClass9_Sub2_10.anInt5322 / local104 + arg5.anInt6424;
				local631 = super.anInt3733 + (super.anInt3727 * local42 + local73 + super.anInt3735 * local25 >> 15);
				local653 = super.aClass9_Sub2_10.anInt5337 * local631 / local102 + arg5.anInt6422;
				local673 = (local25 * super.anInt3736 + local84 + super.anInt3734 * local42 >> 15) + super.anInt3731;
				local684 = arg5.anInt6424 + super.aClass9_Sub2_10.anInt5322 * local673 / local102;
			}
			@Pc(1157) boolean local1157 = local12.aShort19 != -1 && this.method3322(super.aClass9_Sub2_10.anInterface8_13.method7085(local12.aShort19).aByte54);
			local73 = local46 + local48 + local50;
			if ((local611 - local653) * (-local684 + local560) - (local529 - local653) * (-local684 + local642) > 0) {
				arg5.aBoolean429 = local611 < 0 || local653 < 0 || local529 < 0 || arg5.anInt6419 < local611 || arg5.anInt6419 < local653 || local529 > arg5.anInt6419;
				if (local73 >= 765) {
					arg5.method5582(local642, local684, local560, local611, local653, local529, super.aClass9_Sub2_10.anInt5344);
				} else {
					if (local1157) {
						arg5.anInt6421 = 100;
					}
					if (local73 <= 0) {
						if (local12.aShort19 >= 0) {
							arg5.method5580(local642, local684, local560, local611, local653, local529, local12.anInt1730, local12.anInt1729, local12.anInt1726, local580, local631, local507, local600, local673, local549, local104, local102, local106, local12.aShort19);
						} else {
							arg5.method5574(local642, local684, local560, local611, local653, local529, local12.anInt1730, local12.anInt1729, local12.anInt1726);
						}
					} else if (local12.aShort19 >= 0) {
						arg5.method5571(local642, local684, local560, local611, local653, local529, super.aClass9_Sub2_10.anInt5344, local48, local50, local46, local12.anInt1730, local12.anInt1729, local12.anInt1726, local580, local631, local507, local600, local673, local549, local104, local102, local106, local12.aShort19);
					} else {
						arg5.method5574(local642, local684, local560, local611, local653, local529, Static102.method2277(super.aClass9_Sub2_10.anInt5344 | local48 << 24, local12.anInt1730), Static102.method2277(super.aClass9_Sub2_10.anInt5344 | local50 << 24, local12.anInt1729), Static102.method2277(local46 << 24 | super.aClass9_Sub2_10.anInt5344, local12.anInt1726));
					}
					arg5.anInt6421 = 0;
				}
			}
			local73 = local46 + local44 + local50;
			if (-((local653 - local529) * (-local560 + local518)) + (local465 - local529) * (local684 + -local560) > 0) {
				arg5.aBoolean429 = local465 < 0 || local529 < 0 || local653 < 0 || local465 > arg5.anInt6419 || arg5.anInt6419 < local529 || arg5.anInt6419 < local653;
				if (local73 < 765) {
					if (local1157) {
						arg5.anInt6421 = 100;
					}
					if (local73 <= 0) {
						if (local12.aShort19 < 0) {
							arg5.method5574(local518, local560, local684, local465, local529, local653, local12.anInt1727, local12.anInt1726, local12.anInt1729);
						} else {
							arg5.method5580(local518, local560, local684, local465, local529, local653, local12.anInt1727, local12.anInt1726, local12.anInt1729, local453, local507, local631, local487, local549, local673, local107, local106, local102, local12.aShort19);
						}
					} else if (local12.aShort19 < 0) {
						arg5.method5574(local518, local560, local684, local465, local529, local653, Static102.method2277(super.aClass9_Sub2_10.anInt5344 | local44 << 24, local12.anInt1727), Static102.method2277(local46 << 24 | super.aClass9_Sub2_10.anInt5344, local12.anInt1726), Static102.method2277(super.aClass9_Sub2_10.anInt5344 | local50 << 24, local12.anInt1729));
					} else {
						arg5.method5571(local518, local560, local684, local465, local529, local653, super.aClass9_Sub2_10.anInt5344, local44, local46, local50, local12.anInt1727, local12.anInt1726, local12.anInt1729, local453, local507, local631, local487, local549, local673, local107, local106, local102, local12.aShort19);
					}
					arg5.anInt6421 = 0;
					return;
				}
				arg5.method5582(local518, local560, local684, local465, local529, local653, super.aClass9_Sub2_10.anInt5344);
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZII[I[IIILclient!oo;[[ZIII)V")
	private void method707(@OriginalArg(3) int[] arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Class221 arg3, @OriginalArg(8) boolean[][] arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6, @OriginalArg(11) int arg7) {
		@Pc(14) int local14 = (arg2 - arg7) * 1024 / 256;
		arg3.aBoolean427 = false;
		arg3.aBoolean426 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local14;
		for (@Pc(32) int local32 = arg5; local32 < arg6; local32++) {
			for (@Pc(36) int local36 = arg7; local36 < arg2; local36++) {
				if (arg4[local32 - arg5][local36 - arg7]) {
					@Pc(87) int local87;
					if (super.aClass94ArrayArray3[local32][local36] != null) {
						@Pc(63) Class94 local63 = super.aClass94ArrayArray3[local32][local36];
						if (local63.aShort50 != -1 && (local63.aByte24 & 0x2) == 0 && local63.anInt3319 == -1) {
							local87 = super.aClass9_Sub2_10.method4652(local63.aShort50);
							arg3.method5577(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, Static222.method3938(local87, local63.aShort53 & 0xFFFF), Static222.method3938(local87, local63.aShort52 & 0xFFFF), Static222.method3938(local87, local63.aShort51 & 0xFFFF));
							arg3.method5577(local30, local30, local30 - 4, local26, local26 + 4, local26, Static222.method3938(local87, local63.aShort54 & 0xFFFF), Static222.method3938(local87, local63.aShort51 & 0xFFFF), Static222.method3938(local87, local63.aShort52 & 0xFFFF));
						} else if (local63.anInt3319 == -1) {
							arg3.method5577(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, local63.aShort53 & 0xFFFF, local63.aShort52 & 0xFFFF, local63.aShort51 & 0xFFFF);
							arg3.method5577(local30, local30, local30 - 4, local26, local26 + 4, local26, local63.aShort54 & 0xFFFF, local63.aShort51 & 0xFFFF, local63.aShort52 & 0xFFFF);
						} else {
							local87 = local63.anInt3319;
							arg3.method5577(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, local87, local87, local87);
							arg3.method5577(local30, local30, local30 - 4, local26, local26 + 4, local26, local87, local87, local87);
						}
					} else if (super.aClass176ArrayArray3[local32][local36] != null) {
						@Pc(279) Class176 local279 = super.aClass176ArrayArray3[local32][local36];
						for (local87 = 0; local87 < local279.aShort83; local87++) {
							arg1[local87] = local279.aShortArray84[local87] * 4 / super.anInt7410 + local26;
							arg0[local87] = local30 - local279.aShortArray89[local87] * 4 / super.anInt7410;
						}
						for (@Pc(319) int local319 = 0; local319 < local279.aShort82; local319++) {
							@Pc(326) short local326 = local279.aShortArray88[local319];
							@Pc(331) short local331 = local279.aShortArray86[local319];
							@Pc(336) short local336 = local279.aShortArray90[local319];
							@Pc(340) int local340 = arg1[local326];
							@Pc(344) int local344 = arg1[local331];
							@Pc(348) int local348 = arg1[local336];
							@Pc(352) int local352 = arg0[local326];
							@Pc(356) int local356 = arg0[local331];
							@Pc(360) int local360 = arg0[local336];
							@Pc(384) int local384;
							if (local279.anIntArray378 != null && local279.anIntArray378[local319] != -1) {
								local384 = local279.anIntArray378[local319];
								arg3.method5577(local352, local356, local360, local340, local344, local348, Static222.method3938(local384, local279.aShortArray85[local326]), Static222.method3938(local384, local279.aShortArray85[local331]), Static222.method3938(local384, local279.aShortArray85[local336]));
							} else if (local279.aShortArray83 == null || local279.aShortArray83[local319] == -1) {
								local384 = local279.anIntArray377[local319];
								arg3.method5577(local352, local356, local360, local340, local344, local348, Static222.method3938(local384, local279.aShortArray85[local326]), Static222.method3938(local384, local279.aShortArray85[local331]), Static222.method3938(local384, local279.aShortArray85[local336]));
							} else {
								local384 = super.aClass9_Sub2_10.method4652(local279.aShortArray83[local319]);
								arg3.method5577(local352, local356, local360, local340, local344, local348, Static222.method3938(local384, local279.aShortArray85[local326]), Static222.method3938(local384, local279.aShortArray85[local331]), Static222.method3938(local384, local279.aShortArray85[local336]));
							}
						}
					}
				}
				local30 -= 4;
			}
			local26 += 4;
			local30 = local14;
		}
		arg3.aBoolean427 = true;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6337(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class253_Sub1 local9 = (Class253_Sub1) super.aClass9_Sub2_10.method4655(Thread.currentThread());
		@Pc(12) Class221 local12 = local9.aClass221_2;
		local12.aBoolean429 = false;
		local12.anInt6421 = 0;
		if (super.aClass45ArrayArray3 != null) {
			this.method711(arg3, local9.anIntArray792, arg1, arg0, arg4, local12, local9.anIntArray802, arg2);
		} else if (super.aClass94ArrayArray3 != null) {
			this.method707(local9.anIntArray802, local9.anIntArray792, arg3, local12, arg4, arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII[III[[ZILclient!oo;[II)V")
	private void method711(@OriginalArg(0) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(9) Class221 arg5, @OriginalArg(10) int[] arg6, @OriginalArg(11) int arg7) {
		@Pc(18) int local18 = (arg0 - arg2) * 1024 / 256;
		arg5.aBoolean427 = false;
		arg5.aBoolean426 = false;
		@Pc(30) int local30 = 0;
		@Pc(34) int local34 = local18;
		for (@Pc(36) int local36 = arg3; local36 < arg7; local36++) {
			for (@Pc(40) int local40 = arg2; local40 < arg0; local40++) {
				if (arg4[local36 - arg3][local40 - arg2]) {
					@Pc(77) int local77;
					if (super.aClass45ArrayArray3[local36][local40] != null) {
						@Pc(295) Class45 local295 = super.aClass45ArrayArray3[local36][local40];
						if (local295.aShort19 != -1 && (local295.aByte3 & 0x2) == 0 && local295.anInt1728 == 0) {
							local77 = super.aClass9_Sub2_10.method4652(local295.aShort19);
							arg5.method5577(local34 - 4, local34 + -4, local34, local30 + 4, local30, local30 + 4, Static222.method3938(local77, local295.anInt1730), Static222.method3938(local77, local295.anInt1729), Static222.method3938(local77, local295.anInt1726));
							arg5.method5577(local34, local34, local34 - 4, local30, local30 + 4, local30, Static222.method3938(local77, local295.anInt1727), Static222.method3938(local77, local295.anInt1726), Static222.method3938(local77, local295.anInt1729));
						} else if (local295.anInt1728 == 0) {
							arg5.method5574(local34 - 4, local34 + -4, local34, local30 + 4, local30, local30 + 4, local295.anInt1730, local295.anInt1729, local295.anInt1726);
							arg5.method5574(local34, local34, local34 - 4, local30, local30 + 4, local30, local295.anInt1727, local295.anInt1726, local295.anInt1729);
						} else {
							local77 = local295.anInt1728;
							arg5.method5574(local34 - 4, local34 + -4, local34, local30 + 4, local30, local30 + 4, Static102.method2277(local295.anInt1730 & 0xFF000000, local77), Static102.method2277(local295.anInt1729 & 0xFF000000, local77), Static102.method2277(local295.anInt1726 & 0xFF000000, local77));
							arg5.method5574(local34, local34, local34 - 4, local30, local30 + 4, local30, Static102.method2277(local295.anInt1727 & 0xFF000000, local77), Static102.method2277(local295.anInt1726 & 0xFF000000, local77), Static102.method2277(local295.anInt1729 & 0xFF000000, local77));
						}
					} else if (super.aClass158ArrayArray3[local36][local40] != null) {
						@Pc(75) Class158 local75 = super.aClass158ArrayArray3[local36][local40];
						for (local77 = 0; local77 < local75.aShort75; local77++) {
							arg1[local77] = local30 + local75.aShortArray76[local77] * 4 / super.anInt7410;
							arg6[local77] = local34 - local75.aShortArray75[local77] * 4 / super.anInt7410;
						}
						for (@Pc(116) int local116 = 0; local116 < local75.aShort74; local116++) {
							@Pc(122) int local122 = local116 * 3;
							@Pc(126) int local126 = local122 + 1;
							@Pc(130) int local130 = local126 + 1;
							@Pc(134) int local134 = arg1[local122];
							@Pc(138) int local138 = arg1[local126];
							@Pc(142) int local142 = arg1[local130];
							@Pc(146) int local146 = arg6[local122];
							@Pc(150) int local150 = arg6[local126];
							@Pc(154) int local154 = arg6[local130];
							@Pc(195) int local195;
							if (local75.anIntArray336 != null && local75.anIntArray336[local116] != 0 && (local75.aShortArray79 == null || local75.aShortArray79 != null && local75.aShortArray79[local116] == -1)) {
								local195 = local75.anIntArray336[local116];
								arg5.method5574(local146, local150, local154, local134, local138, local142, Static102.method2277(-(local75.anIntArray337[local122] & 0xFF000000) - 16777216, local195), Static102.method2277(-(local75.anIntArray337[local126] & -16777216) - 16777216, local195), Static102.method2277(-(local75.anIntArray337[local130] & -16777216) - 16777216, local195));
							} else if (local75.aShortArray79 == null || local75.aShortArray79[local116] == -1) {
								arg5.method5574(local146, local150, local154, local134, local138, local142, local75.anIntArray337[local122], local75.anIntArray337[local126], local75.anIntArray337[local130]);
							} else {
								local195 = super.aClass9_Sub2_10.method4652(local75.aShortArray79[local116]);
								arg5.method5577(local146, local150, local154, local134, local138, local142, local195, local195, local195);
							}
						}
					}
				}
				local34 -= 4;
			}
			local34 = local18;
			local30 += 4;
		}
		arg5.aBoolean427 = true;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[IILclient!oo;I[I[I)V")
	private void method712(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class221 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		@Pc(12) Class94 local12 = super.aClass94ArrayArray3[arg1][arg3];
		@Pc(33) int local33;
		@Pc(43) int local43;
		@Pc(235) int local235;
		@Pc(276) int local276;
		@Pc(350) int local350;
		@Pc(409) int local409;
		@Pc(265) int local265;
		@Pc(305) int local305;
		@Pc(361) int local361;
		@Pc(420) int local420;
		@Pc(200) int local200;
		@Pc(254) int local254;
		@Pc(322) int local322;
		@Pc(379) int local379;
		@Pc(223) int local223;
		@Pc(294) int local294;
		@Pc(339) int local339;
		@Pc(398) int local398;
		@Pc(82) int local82;
		@Pc(105) int local105;
		@Pc(130) int local130;
		@Pc(158) int local158;
		@Pc(458) int local458;
		if (local12 == null) {
			@Pc(1126) Class176 local1126 = super.aClass176ArrayArray3[arg1][arg3];
			if (local1126 != null) {
				@Pc(1158) short local1158;
				if (super.anInt3730 == -1) {
					for (local409 = 0; local409 < local1126.aShort83; local409++) {
						local33 = local1126.aShortArray84[local409] + (arg1 << super.anInt7411);
						local1158 = local1126.aShortArray91[local409];
						local43 = local1126.aShortArray89[local409] + (arg3 << super.anInt7411);
						local350 = super.anInt3738 + (super.anInt3729 * local43 + super.anInt3732 * local33 + super.anInt3728 * local1158 >> 15);
						if (super.aClass9_Sub2_10.anInt5338 >= local350) {
							return;
						}
						local276 = super.anInt3731 + (super.anInt3734 * local43 + super.anInt3736 * local33 + local1158 * super.anInt3726 >> 15);
						local235 = (local43 * super.anInt3727 + local1158 * super.anInt3725 + super.anInt3735 * local33 >> 15) + super.anInt3733;
						arg4[local409] = local235 * super.aClass9_Sub2_10.anInt5337 / local350 + arg2.anInt6422;
						arg5[local409] = arg2.anInt6424 + local276 * super.aClass9_Sub2_10.anInt5322 / local350;
					}
				} else {
					for (local409 = 0; local409 < local1126.aShort83; local409++) {
						local33 = local1126.aShortArray84[local409] + (arg1 << super.anInt7411);
						local1158 = local1126.aShortArray91[local409];
						local43 = local1126.aShortArray89[local409] + (arg3 << super.anInt7411);
						local276 = super.anInt3731 + (local43 * super.anInt3734 + super.anInt3736 * local33 + super.anInt3726 * local1158 >> 15);
						local235 = super.anInt3733 + (super.anInt3727 * local43 + local33 * super.anInt3735 + local1158 * super.anInt3725 >> 15);
						arg4[local409] = local235 * super.aClass9_Sub2_10.anInt5337 / super.anInt3730 + arg2.anInt6422;
						arg5[local409] = local276 * super.aClass9_Sub2_10.anInt5322 / super.anInt3730 + arg2.anInt6424;
					}
				}
				if (local1126.aShortArray83 == null) {
					for (local409 = 0; local409 < local1126.aShort82; local409++) {
						@Pc(1395) short local1395 = local1126.aShortArray88[local409];
						@Pc(1400) short local1400 = local1126.aShortArray86[local409];
						@Pc(1405) short local1405 = local1126.aShortArray90[local409];
						local420 = arg4[local1395];
						local200 = arg4[local1400];
						local254 = arg4[local1405];
						local322 = arg5[local1395];
						local379 = arg5[local1400];
						local223 = arg5[local1405];
						if ((local420 - local200) * (local223 + -local379) - (local254 - local200) * (local322 + -local379) > 0) {
							local294 = local1126.anIntArray377[local409];
							if (local294 != -1) {
								arg2.aBoolean429 = local420 < 0 || local200 < 0 || local254 < 0 || local420 > arg2.anInt6419 || local200 > arg2.anInt6419 || arg2.anInt6419 < local254;
								arg2.method5577(local322, local379, local223, local420, local200, local254, Static222.method3938(local294, local1126.aShortArray85[local1395]), Static222.method3938(local294, local1126.aShortArray85[local1400]), Static222.method3938(local294, local1126.aShortArray85[local1405]));
							}
						}
					}
				} else {
					local409 = super.anIntArrayArray31[arg1][arg3];
					local265 = super.anIntArrayArray31[arg1 + 1][arg3];
					local305 = super.anIntArrayArray31[arg1][arg3 + 1];
					local361 = super.anInt7410 * arg1;
					local420 = local361 + super.anInt7410;
					local200 = arg3 * super.anInt7410;
					local254 = local200 + super.anInt7410;
					local322 = (super.anInt3735 * local361 + local409 * super.anInt3725 + super.anInt3727 * local200 >> 15) + super.anInt3733;
					local379 = super.anInt3731 + (local409 * super.anInt3726 + local361 * super.anInt3736 + super.anInt3734 * local200 >> 15);
					local223 = (local409 * super.anInt3728 + super.anInt3732 * local361 + local200 * super.anInt3729 >> 15) + super.anInt3738;
					local294 = super.anInt3733 + (local265 * super.anInt3725 + local420 * super.anInt3735 + super.anInt3727 * local200 >> 15);
					local339 = super.anInt3731 + (local200 * super.anInt3734 + super.anInt3726 * local265 + super.anInt3736 * local420 >> 15);
					local398 = super.anInt3738 + (super.anInt3729 * local200 + local420 * super.anInt3732 + local265 * super.anInt3728 >> 15);
					local82 = super.anInt3733 + (local254 * super.anInt3727 + super.anInt3735 * local361 + super.anInt3725 * local305 >> 15);
					local105 = super.anInt3731 + (super.anInt3734 * local254 + super.anInt3726 * local305 + super.anInt3736 * local361 >> 15);
					local130 = super.anInt3738 + (super.anInt3728 * local305 + local361 * super.anInt3732 + local254 * super.anInt3729 >> 15);
					for (local158 = 0; local158 < local1126.aShort82; local158++) {
						@Pc(1772) short local1772 = local1126.aShortArray88[local158];
						@Pc(1777) short local1777 = local1126.aShortArray86[local158];
						@Pc(1782) short local1782 = local1126.aShortArray90[local158];
						local458 = arg4[local1772];
						@Pc(1790) int local1790 = arg4[local1777];
						@Pc(1794) int local1794 = arg4[local1782];
						@Pc(1798) int local1798 = arg5[local1772];
						@Pc(1802) int local1802 = arg5[local1777];
						@Pc(1806) int local1806 = arg5[local1782];
						if (-((local1798 - local1802) * (local1794 - local1790)) + (local1806 - local1802) * (local458 - local1790) > 0) {
							arg2.aBoolean429 = local458 < 0 || local1790 < 0 || local1794 < 0 || arg2.anInt6419 < local458 || local1790 > arg2.anInt6419 || arg2.anInt6419 < local1794;
							@Pc(1863) short local1863 = local1126.aShortArray83[local158];
							if (local1863 == -1) {
								@Pc(1919) int local1919 = local1126.anIntArray377[local158];
								if (local1919 != -1) {
									arg2.method5577(local1798, local1802, local1806, local458, local1790, local1794, Static222.method3938(local1919, local1126.aShortArray85[local1772]), Static222.method3938(local1919, local1126.aShortArray85[local1777]), Static222.method3938(local1919, local1126.aShortArray85[local1782]));
								}
							} else {
								if (this.method3322(super.aClass9_Sub2_10.anInterface8_13.method7085(local1863).aByte54)) {
									arg2.anInt6421 = 100;
								}
								arg2.method5580(local1798, local1802, local1806, local458, local1790, local1794, local1126.aShortArray85[local1772], local1126.aShortArray85[local1777], local1126.aShortArray85[local1782], local322, local294, local82, local379, local339, local105, local223, local398, local130, local1863);
								arg2.anInt6421 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte24 & 0x2) == 0) {
			@Pc(28) int local28 = arg1 * super.anInt7410;
			local33 = super.anInt7410 + local28;
			@Pc(38) int local38 = arg3 * super.anInt7410;
			local43 = local38 + super.anInt7410;
			@Pc(55) int local55;
			@Pc(64) int local64;
			@Pc(205) int local205;
			if ((local12.aByte24 & 0x1) == 0) {
				local55 = super.anIntArrayArray31[arg1][arg3];
				local64 = super.anIntArrayArray31[arg1 + 1][arg3];
				local205 = super.anIntArrayArray31[arg1 + 1][arg3 + 1];
				local458 = super.anIntArrayArray31[arg1][arg3 + 1];
				if (super.anInt3730 == -1) {
					local82 = super.anInt3738 + (super.anInt3729 * local38 + super.anInt3728 * local55 + super.anInt3732 * local28 >> 15);
					if (local82 <= super.aClass9_Sub2_10.anInt5338) {
						return;
					}
					local105 = super.anInt3738 + (super.anInt3728 * local64 + local33 * super.anInt3732 + super.anInt3729 * local38 >> 15);
					if (local105 <= super.aClass9_Sub2_10.anInt5338) {
						return;
					}
					local130 = super.anInt3738 + (local33 * super.anInt3732 + super.anInt3728 * local205 + super.anInt3729 * local43 >> 15);
					if (local130 <= super.aClass9_Sub2_10.anInt5338) {
						return;
					}
					local158 = super.anInt3738 + (super.anInt3732 * local28 + local458 * super.anInt3728 + super.anInt3729 * local43 >> 15);
					if (super.aClass9_Sub2_10.anInt5338 >= local158) {
						return;
					}
				} else {
					local158 = super.anInt3730;
					local130 = super.anInt3730;
					local105 = super.anInt3730;
					local82 = super.anInt3730;
				}
				local200 = super.anInt3733 + (super.anInt3727 * local38 + super.anInt3735 * local28 + local55 * super.anInt3725 >> 15);
				local223 = super.anInt3731 + (local55 * super.anInt3726 + local28 * super.anInt3736 + local38 * super.anInt3734 >> 15);
				local235 = local200 * super.aClass9_Sub2_10.anInt5337 / local82 + arg2.anInt6422;
				local254 = (local38 * super.anInt3727 + super.anInt3735 * local33 + super.anInt3725 * local64 >> 15) + super.anInt3733;
				local265 = arg2.anInt6424 + super.aClass9_Sub2_10.anInt5322 * local223 / local82;
				local294 = super.anInt3731 + (local64 * super.anInt3726 + local33 * super.anInt3736 + local38 * super.anInt3734 >> 15);
				local276 = arg2.anInt6422 + local254 * super.aClass9_Sub2_10.anInt5337 / local105;
				local305 = arg2.anInt6424 + super.aClass9_Sub2_10.anInt5322 * local294 / local105;
				local322 = super.anInt3733 + (local33 * super.anInt3735 + super.anInt3725 * local205 + super.anInt3727 * local43 >> 15);
				local350 = arg2.anInt6422 + local322 * super.aClass9_Sub2_10.anInt5337 / local130;
				local339 = super.anInt3731 + (local43 * super.anInt3734 + super.anInt3736 * local33 + local205 * super.anInt3726 >> 15);
				local379 = super.anInt3733 + (super.anInt3727 * local43 + super.anInt3735 * local28 + super.anInt3725 * local458 >> 15);
				local361 = arg2.anInt6424 + local339 * super.aClass9_Sub2_10.anInt5322 / local130;
				local409 = arg2.anInt6422 + super.aClass9_Sub2_10.anInt5337 * local379 / local158;
				local398 = super.anInt3731 + (super.anInt3736 * local28 + super.anInt3726 * local458 + super.anInt3734 * local43 >> 15);
				local420 = arg2.anInt6424 + local398 * super.aClass9_Sub2_10.anInt5322 / local158;
			} else {
				local55 = super.anIntArrayArray31[arg1][arg3];
				if (super.anInt3730 == -1) {
					local64 = local55 * super.anInt3728;
					local82 = super.anInt3738 + (super.anInt3729 * local38 + local28 * super.anInt3732 + local64 >> 15);
					if (local82 <= super.aClass9_Sub2_10.anInt5338) {
						return;
					}
					local105 = (local64 + super.anInt3732 * local33 + local38 * super.anInt3729 >> 15) + super.anInt3738;
					if (super.aClass9_Sub2_10.anInt5338 >= local105) {
						return;
					}
					local130 = super.anInt3738 + (super.anInt3729 * local43 + super.anInt3732 * local33 + local64 >> 15);
					if (super.aClass9_Sub2_10.anInt5338 >= local130) {
						return;
					}
					local158 = (local28 * super.anInt3732 + local64 + local43 * super.anInt3729 >> 15) + super.anInt3738;
					if (local158 <= super.aClass9_Sub2_10.anInt5338) {
						return;
					}
				} else {
					local158 = super.anInt3730;
					local130 = super.anInt3730;
					local105 = super.anInt3730;
					local82 = super.anInt3730;
				}
				local64 = local55 * super.anInt3725;
				local200 = super.anInt3733 + (super.anInt3727 * local38 + local64 + super.anInt3735 * local28 >> 15);
				local205 = local55 * super.anInt3726;
				local223 = (local205 + super.anInt3736 * local28 + super.anInt3734 * local38 >> 15) + super.anInt3731;
				local235 = arg2.anInt6422 + super.aClass9_Sub2_10.anInt5337 * local200 / local82;
				local254 = super.anInt3733 + (local64 + local33 * super.anInt3735 + super.anInt3727 * local38 >> 15);
				local265 = local223 * super.aClass9_Sub2_10.anInt5322 / local82 + arg2.anInt6424;
				local276 = arg2.anInt6422 + local254 * super.aClass9_Sub2_10.anInt5337 / local105;
				local294 = (local205 + super.anInt3736 * local33 + local38 * super.anInt3734 >> 15) + super.anInt3731;
				local305 = arg2.anInt6424 + local294 * super.aClass9_Sub2_10.anInt5322 / local105;
				local322 = super.anInt3733 + (super.anInt3727 * local43 + super.anInt3735 * local33 + local64 >> 15);
				local339 = super.anInt3731 + (local43 * super.anInt3734 + local205 + local33 * super.anInt3736 >> 15);
				local350 = arg2.anInt6422 + local322 * super.aClass9_Sub2_10.anInt5337 / local130;
				local361 = arg2.anInt6424 + local339 * super.aClass9_Sub2_10.anInt5322 / local130;
				local379 = super.anInt3733 + (super.anInt3735 * local28 + local64 + super.anInt3727 * local43 >> 15);
				local398 = super.anInt3731 + (local205 + local28 * super.anInt3736 + local43 * super.anInt3734 >> 15);
				local409 = local379 * super.aClass9_Sub2_10.anInt5337 / local158 + arg2.anInt6422;
				local420 = super.aClass9_Sub2_10.anInt5322 * local398 / local158 + arg2.anInt6424;
			}
			if ((local350 - local409) * (-local420 + local305) - (local361 - local420) * (-local409 + local276) > 0) {
				arg2.aBoolean429 = local350 < 0 || local409 < 0 || local276 < 0 || arg2.anInt6419 < local350 || arg2.anInt6419 < local409 || local276 > arg2.anInt6419;
				if (local12.aShort50 >= 0) {
					if (this.method3322(super.aClass9_Sub2_10.anInterface8_13.method7085(local12.aShort50).aByte54)) {
						arg2.anInt6421 = 100;
					}
					arg2.method5580(local361, local420, local305, local350, local409, local276, local12.aShort53 & 0xFFFF, local12.aShort52 & 0xFFFF, local12.aShort51 & 0xFFFF, local200, local254, local379, local223, local294, local398, local82, local105, local158, local12.aShort50);
					arg2.anInt6421 = 0;
				} else {
					arg2.method5577(local361, local420, local305, local350, local409, local276, local12.aShort53 & 0xFFFF, local12.aShort52 & 0xFFFF, local12.aShort51 & 0xFFFF);
				}
			}
			if ((local420 - local305) * (-local276 + local235) - (local265 - local305) * (local409 - local276) > 0) {
				arg2.aBoolean429 = local235 < 0 || local276 < 0 || local409 < 0 || arg2.anInt6419 < local235 || local276 > arg2.anInt6419 || arg2.anInt6419 < local409;
				if (local12.aShort50 >= 0) {
					if (this.method3322(super.aClass9_Sub2_10.anInterface8_13.method7085(local12.aShort50).aByte54)) {
						arg2.anInt6421 = 100;
					}
					arg2.method5580(local265, local305, local420, local235, local276, local409, local12.aShort54 & 0xFFFF, local12.aShort51 & 0xFFFF, local12.aShort52 & 0xFFFF, local200, local254, local379, local223, local294, local398, local82, local105, local158, local12.aShort50);
					arg2.anInt6421 = 0;
					return;
				}
				arg2.method5577(local265, local305, local420, local235, local276, local409, local12.aShort54 & 0xFFFF, local12.aShort51 & 0xFFFF, local12.aShort52 & 0xFFFF);
			}
		}
	}
}
