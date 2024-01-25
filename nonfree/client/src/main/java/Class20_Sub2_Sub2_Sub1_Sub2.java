import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class20_Sub2_Sub2_Sub1_Sub2 extends Class20_Sub2_Sub2_Sub1 {

	@OriginalMember(owner = "client!kd", name = "od", descriptor = "Ljava/lang/String;")
	public String aString62;

	@OriginalMember(owner = "client!kd", name = "pd", descriptor = "Lclient!bc;")
	public Class30 aClass30_1;

	@OriginalMember(owner = "client!kd", name = "Bd", descriptor = "Lclient!ow;")
	public Class247 aClass247_1;

	@OriginalMember(owner = "client!kd", name = "Cd", descriptor = "I")
	public int anInt5598;

	@OriginalMember(owner = "client!kd", name = "gd", descriptor = "I")
	public int anInt5582 = -1;

	@OriginalMember(owner = "client!kd", name = "qd", descriptor = "I")
	public int anInt5590 = 1;

	@OriginalMember(owner = "client!kd", name = "yd", descriptor = "I")
	public int anInt5596 = -1;

	@OriginalMember(owner = "client!kd", name = "ud", descriptor = "I")
	public int anInt5594 = 1;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)I")
	@Override
	protected int method4910() {
		if (this.aClass247_1.anIntArray467 != null) {
			@Pc(19) Class247 local19 = this.aClass247_1.method6613(Static279.aClass294_1);
			if (local19 != null && local19.anInt7692 != -1) {
				return local19.anInt7692;
			}
		}
		return this.aClass247_1.anInt7692;
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(B)I")
	@Override
	public int method9013() {
		return this.aClass247_1 == null ? 0 : this.aClass247_1.anInt7688;
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)I")
	@Override
	public int method4917() {
		if (this.aClass247_1.anIntArray467 != null) {
			@Pc(13) Class247 local13 = this.aClass247_1.method6613(Static279.aClass294_1);
			if (local13 != null && local13.anInt7664 != -1) {
				return local13.anInt7664;
			}
		}
		return this.aClass247_1.anInt7664;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBLclient!ha;I)Z")
	@Override
	public boolean method9014(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass247_1 == null || !this.method4925(131072, arg1)) {
			return false;
		}
		@Pc(19) Class154 local19 = arg1.method8785();
		@Pc(24) int local24 = super.aClass278_7.method7147();
		local19.method6571(local24);
		local19.method6570(super.anInt10725, super.anInt10724, super.anInt10729);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass24Array3.length > local39; local39++) {
			if (super.aClass24Array3[local39] != null) {
				@Pc(65) boolean var10000;
				label41: {
					if (this.aClass247_1.anInt7688 <= 0) {
						label39: {
							if (this.aClass247_1.anInt7676 == -1) {
								if (this.aClass247_1.anInt7681 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass247_1.anInt7676 == 1) {
									break label39;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label41;
							}
						}
					}
					var10000 = true;
				}
				@Pc(78) boolean local78 = var10000;
				@Pc(93) boolean local93;
				if (Static591.aBoolean675) {
					local93 = super.aClass24Array3[local39].method6867(arg0, arg2, local19, local78, this.aClass247_1.anInt7688, Static419.anInt7660);
				} else {
					local93 = super.aClass24Array3[local39].method6855(arg0, arg2, local19, local78, this.aClass247_1.anInt7688);
				}
				if (local93) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass24Array3[0] = super.aClass24Array3[1] = super.aClass24Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)Z")
	private boolean method4923() {
		return this.aClass247_1.aBoolean512;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZIII)V")
	public void method4924(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte131 = super.aByte130 = (byte) arg0;
		if (Static492.method7384(arg3, arg2)) {
			super.aByte130++;
		}
		if (super.anInt5549 != -1 && Static294.aClass373_2.method8738(super.anInt5549).anInt361 == 1) {
			super.anIntArray327 = null;
			super.anInt5549 = -1;
		}
		@Pc(53) Class93 local53;
		if (super.anInt5519 != -1) {
			local53 = Static436.aClass292_2.method7401(super.anInt5519);
			if (local53.aBoolean189 && local53.anInt2750 != -1 && Static294.aClass373_2.method8738(local53.anInt2750).anInt361 == 1) {
				super.anInt5519 = -1;
			}
		}
		if (super.anInt5558 != -1) {
			local53 = Static436.aClass292_2.method7401(super.anInt5558);
			if (local53.aBoolean189 && local53.anInt2750 != -1 && Static294.aClass373_2.method8738(local53.anInt2750).anInt361 == 1) {
				super.anInt5558 = -1;
			}
		}
		if (!arg1) {
			@Pc(116) int local116 = arg3 - super.anIntArray335[0];
			@Pc(124) int local124 = arg2 - super.anIntArray336[0];
			if (local116 >= -8 && local116 <= 8 && local124 >= -8 && local124 <= 8) {
				if (super.anInt5574 < 9) {
					super.anInt5574++;
				}
				for (@Pc(151) int local151 = super.anInt5574; local151 > 0; local151--) {
					super.anIntArray335[local151] = super.anIntArray335[local151 - 1];
					super.anIntArray336[local151] = super.anIntArray336[local151 - 1];
					super.aByteArray60[local151] = super.aByteArray60[local151 - 1];
				}
				super.anIntArray335[0] = arg3;
				super.anIntArray336[0] = arg2;
				super.aByteArray60[0] = 1;
				return;
			}
		}
		super.anInt5576 = 0;
		super.anInt5574 = 0;
		super.anIntArray335[0] = arg3;
		super.anInt5575 = 0;
		super.anIntArray336[0] = arg2;
		super.anInt10725 = (arg4 << 8) + (super.anIntArray335[0] << 9);
		super.anInt10729 = (super.anIntArray336[0] << 9) + (arg4 << 8);
		if (super.aClass20_Sub8_4 != null) {
			super.aClass20_Sub8_4.method6630();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9016(@OriginalArg(0) Class100 arg0) {
		if (this.aClass247_1 == null || !super.aBoolean379 && !this.method4925(0, arg0)) {
			return;
		}
		@Pc(20) Class154 local20 = arg0.method8785();
		local20.method6571(super.aClass278_7.method7147());
		local20.method6570(super.anInt10725, super.anInt10724 - 20, super.anInt10729);
		this.method4916(super.aClass24Array3, arg0, local20, super.aBoolean379);
		super.aClass24Array3[0] = super.aClass24Array3[1] = super.aClass24Array3[2] = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!vs;ZILclient!ha;II)V")
	@Override
	public void method9018(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILclient!ha;)Z")
	private boolean method4925(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class201 local11 = this.method4911();
		@Pc(26) Class21 local26 = super.anInt5549 != -1 && super.anInt5516 == 0 ? Static294.aClass373_2.method8738(super.anInt5549) : null;
		@Pc(43) Class21 local43 = super.anInt5571 == -1 || super.aBoolean375 && local26 != null ? null : Static294.aClass373_2.method8738(super.anInt5571);
		@Pc(46) int local46 = local11.anInt6348;
		@Pc(49) int local49 = local11.anInt6341;
		if (local46 != 0 || local49 != 0 || local11.anInt6309 != 0 || local11.anInt6343 != 0) {
			arg0 |= 0x7;
		}
		@Pc(91) boolean local91 = super.aByte67 != 0 && Static113.anInt2243 >= super.anInt5536 && super.anInt5528 > Static113.anInt2243;
		if (local91) {
			arg0 |= 0x80000;
		}
		@Pc(102) int local102 = super.aClass278_7.method7147();
		@Pc(138) Class24 local138 = super.aClass24Array3[0] = this.aClass247_1.method6607(local102, arg1, this.aClass30_1, super.anInt5532, local26, Static279.aClass294_1, super.anInt5502, super.aClass113Array3, super.anInt5503, super.anInt5533, arg0, Static511.aClass34_1, super.anInt5499, local43, super.anInt5546, super.anIntArray328, Static294.aClass373_2);
		if (local138 == null) {
			return false;
		}
		super.anInt5523 = local138.fa();
		super.anInt5573 = local138.ma();
		this.method4903(local138);
		if (local46 == 0 && local49 == 0) {
			this.method4915(0, this.method4913() << 9, 0, local102, this.method4913() << 9);
		} else {
			this.method4915(local11.anInt6310, local49, local11.anInt6326, local102, local46);
			if (super.anInt5517 != 0) {
				super.aClass24Array3[0].FA(super.anInt5517);
			}
			if (super.anInt5535 != 0) {
				super.aClass24Array3[0].VA(super.anInt5535);
			}
			if (super.anInt5492 != 0) {
				super.aClass24Array3[0].H(0, super.anInt5492, 0);
			}
		}
		if (local91) {
			local138.method6849(super.aByte64, super.aByte65, super.aByte66, super.aByte67 & 0xFF);
		}
		@Pc(267) Class93 local267;
		@Pc(281) boolean local281;
		@Pc(283) int local283;
		@Pc(330) Class24 local330;
		@Pc(351) int local351;
		@Pc(353) int local353;
		@Pc(355) int local355;
		@Pc(442) int local442;
		@Pc(471) int local471;
		@Pc(483) int local483;
		@Pc(487) int local487;
		@Pc(497) int local497;
		if (super.anInt5519 == -1 || super.lb == -1) {
			super.aClass24Array3[1] = null;
		} else {
			local267 = Static436.aClass292_2.method7401(super.anInt5519);
			local281 = local267.aByte51 == 3 && (local46 != 0 || local49 != 0);
			local283 = local7;
			if (local281) {
				local283 = local7 | 0x7;
			} else {
				if (super.anInt5491 != 0) {
					local283 = local7 | 0x5;
				}
				if (super.anInt5527 != 0) {
					local283 |= 0x2;
				}
				if (super.anInt5505 >= 0) {
					local283 |= 0x7;
				}
			}
			local330 = super.aClass24Array3[1] = local267.method2366(super.anInt5509, super.anInt5515, arg1, local283, Static294.aClass373_2, super.lb);
			if (local330 != null) {
				if (super.anInt5505 >= 0) {
					local351 = 0;
					local353 = 0;
					local355 = 0;
					if (local11.anIntArrayArray25 != null && local11.anIntArrayArray25[super.anInt5505] != null) {
						local355 = local11.anIntArrayArray25[super.anInt5505][2];
						local353 = local11.anIntArrayArray25[super.anInt5505][1];
						local351 = local11.anIntArrayArray25[super.anInt5505][0];
					}
					if (local11.anIntArrayArray26 != null && local11.anIntArrayArray26[super.anInt5505] != null) {
						local355 += local11.anIntArrayArray26[super.anInt5505][2];
						local353 += local11.anIntArrayArray26[super.anInt5505][1];
						local351 += local11.anIntArrayArray26[super.anInt5505][0];
					}
					if (local355 != 0 || local351 != 0) {
						local442 = local102;
						if (super.anIntArray328 != null && super.anIntArray328[super.anInt5505] != -1) {
							local442 = super.anIntArray328[super.anInt5505];
						}
						local471 = local442 + super.anInt5491 * 2048 - local102 & 0x3FFF;
						if (local471 != 0) {
							local330.a(local471);
						}
						local483 = Class100_Sub1.anIntArray428[local471];
						local487 = Class100_Sub1.anIntArray429[local471];
						local497 = local487 * local351 + local483 * local355 >> 14;
						local355 = local355 * local487 - local483 * local351 >> 14;
						local351 = local497;
					}
					local330.H(local351, local353, local355);
				} else if (super.anInt5491 != 0) {
					local330.a(super.anInt5491 * 2048);
				}
				if (super.anInt5527 != 0) {
					local330.H(0, -super.anInt5527 << 2, 0);
				}
				if (local281) {
					if (super.anInt5517 != 0) {
						local330.FA(super.anInt5517);
					}
					if (super.anInt5535 != 0) {
						local330.VA(super.anInt5535);
					}
					if (super.anInt5492 != 0) {
						local330.H(0, super.anInt5492, 0);
					}
				}
			}
		}
		if (super.anInt5558 == -1 || super.anInt5543 == -1) {
			super.aClass24Array3[2] = null;
		} else {
			local267 = Static436.aClass292_2.method7401(super.anInt5558);
			local281 = local267.aByte51 == 3 && (local46 != 0 || local49 != 0);
			local283 = local7;
			if (local281) {
				local283 = local7 | 0x7;
			} else {
				if (super.anInt5570 != 0) {
					local283 = local7 | 0x5;
				}
				if (super.anInt5568 != 0) {
					local283 |= 0x2;
				}
				if (super.anInt5495 >= 0) {
					local283 |= 0x7;
				}
			}
			local330 = super.aClass24Array3[2] = local267.method2365(arg1, Static294.aClass373_2, super.anInt5540, super.anInt5494, super.anInt5543, local283);
			if (local330 != null) {
				if (super.anInt5495 >= 0 && local11.anIntArrayArray25 != null && local11.anIntArrayArray25[super.anInt5495] != null) {
					local351 = 0;
					local353 = 0;
					local355 = 0;
					if (local11.anIntArrayArray25 != null && local11.anIntArrayArray25[super.anInt5495] != null) {
						local351 = local11.anIntArrayArray25[super.anInt5495][0];
						local355 = local11.anIntArrayArray25[super.anInt5495][2];
						local353 = local11.anIntArrayArray25[super.anInt5495][1];
					}
					if (local11.anIntArrayArray26 != null && local11.anIntArrayArray26[super.anInt5495] != null) {
						local351 += local11.anIntArrayArray26[super.anInt5495][0];
						local353 += local11.anIntArrayArray26[super.anInt5495][1];
						local355 += local11.anIntArrayArray26[super.anInt5495][2];
					}
					if (local355 != 0 || local351 != 0) {
						local442 = local102;
						if (super.anIntArray328 != null && super.anIntArray328[super.anInt5495] != -1) {
							local442 = super.anIntArray328[super.anInt5495];
						}
						local471 = super.anInt5570 * 2048 + local442 - local102 & 0x3FFF;
						if (local471 != 0) {
							local330.a(local471);
						}
						local483 = Class100_Sub1.anIntArray428[local471];
						local487 = Class100_Sub1.anIntArray429[local471];
						local497 = local355 * local483 + local351 * local487 >> 14;
						local355 = local355 * local487 - local351 * local483 >> 14;
						local351 = local497;
					}
					local330.H(local351, local353, local355);
				} else if (super.anInt5570 != 0) {
					local330.a(super.anInt5570 * 2048);
				}
				if (super.anInt5568 != 0) {
					local330.H(0, -super.anInt5568 << 2, 0);
				}
				if (local281) {
					if (super.anInt5517 != 0) {
						local330.FA(super.anInt5517);
					}
					if (super.anInt5535 != 0) {
						local330.VA(super.anInt5535);
					}
					if (super.anInt5492 != 0) {
						local330.H(0, super.anInt5492, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lclient!ha;B)Lclient!c;")
	@Override
	public Class20_Sub3 method9020(@OriginalArg(0) Class100 arg0) {
		if (this.aClass247_1 == null || !this.method4925(2048, arg0)) {
			return null;
		}
		@Pc(19) Class154 local19 = arg0.method8785();
		@Pc(24) int local24 = super.aClass278_7.method7147();
		local19.method6571(local24);
		@Pc(42) Class97 local42 = Static272.aClass97ArrayArrayArray3[super.aByte131][super.anInt10725 >> Static643.anInt10682][super.anInt10729 >> Static643.anInt10682];
		if (local42 == null || local42.aClass20_Sub2_Sub5_1 == null) {
			super.anInt5508 = (int) ((float) super.anInt5508 - (float) super.anInt5508 / 10.0F);
		} else {
			@Pc(54) int local54 = super.anInt5508 - local42.aClass20_Sub2_Sub5_1.aShort94;
			super.anInt5508 = (int) ((float) super.anInt5508 - (float) local54 / 10.0F);
		}
		local19.method6570(super.anInt10725, super.anInt10724 - super.anInt5508 - 20, super.anInt10729);
		@Pc(96) Class201 local96 = this.method4911();
		@Pc(117) Class247 local117 = this.aClass247_1.anIntArray467 == null ? this.aClass247_1 : this.aClass247_1.method6613(Static279.aClass294_1);
		super.aBoolean378 = false;
		@Pc(122) Class20_Sub3 local122 = null;
		if (Static348.aClass6_Sub22_19.aClass15_Sub8_1.method2004() == 1 && local117.aBoolean515 && local96.aBoolean417) {
			@Pc(155) Class21 local155 = super.anInt5549 != -1 && super.anInt5516 == 0 ? Static294.aClass373_2.method8738(super.anInt5549) : null;
			@Pc(173) Class21 local173 = super.anInt5571 == -1 || super.aBoolean375 && local155 != null ? null : Static294.aClass373_2.method8738(super.anInt5571);
			@Pc(223) Class24 local223 = Static190.method3385(super.anInt5535, local24, this.aClass247_1.aShort82 & 0xFFFF, this.aClass247_1.anInt7681, super.anInt5492, super.aClass24Array3[0], arg0, this.aClass247_1.aShort81 & 0xFFFF, super.anInt5517, local173 == null ? local155 : local173, local173 == null ? super.anInt5503 : super.anInt5533, this.aClass247_1.aByte84 & 0xFF, this.aClass247_1.aByte88 & 0xFF);
			if (local223 != null) {
				local122 = Static307.method5201(this.method4923(), super.aClass24Array3.length + 1);
				super.aBoolean378 = true;
				arg0.C(false);
				if (Static591.aBoolean675) {
					local223.method6845(local19, local122.aClass20_Sub4Array1[super.aClass24Array3.length], Static419.anInt7660, 0);
				} else {
					local223.method6862(local19, local122.aClass20_Sub4Array1[super.aClass24Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local19.method6571(local24);
		local19.method6570(super.anInt10725, super.anInt10724 - super.anInt5508 - 5, super.anInt10729);
		if (local122 == null) {
			local122 = Static307.method5201(this.method4923(), super.aClass24Array3.length);
		}
		this.method4916(super.aClass24Array3, arg0, local19, false);
		@Pc(310) int local310;
		if (Static591.aBoolean675) {
			for (local310 = 0; local310 < super.aClass24Array3.length; local310++) {
				if (super.aClass24Array3[local310] != null) {
					super.aClass24Array3[local310].method6845(local19, local122.aClass20_Sub4Array1[local310], Static419.anInt7660, 0);
				}
			}
		} else {
			for (local310 = 0; super.aClass24Array3.length > local310; local310++) {
				if (super.aClass24Array3[local310] != null) {
					super.aClass24Array3[local310].method6862(local19, local122.aClass20_Sub4Array1[local310], 0);
				}
			}
		}
		if (super.aClass20_Sub8_4 != null) {
			@Pc(374) Class236 local374 = super.aClass20_Sub8_4.method6631();
			if (Static591.aBoolean675) {
				arg0.method8831(local374, Static419.anInt7660);
			} else {
				arg0.method8844(local374);
			}
		}
		for (local310 = 0; super.aClass24Array3.length > local310; local310++) {
			if (super.aClass24Array3[local310] != null) {
				super.aBoolean378 |= super.aClass24Array3[local310].F();
			}
		}
		super.aClass24Array3[0] = super.aClass24Array3[1] = super.aClass24Array3[2] = null;
		super.anInt5496 = Static167.anInt3480;
		return local122;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
	public void method4927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray335[0];
		@Pc(15) int local15 = super.anIntArray336[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local15++;
			local10++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local10++;
			local15--;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local15--;
			local10--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt5549 != -1 && Static294.aClass373_2.method8738(super.anInt5549).anInt361 == 1) {
			super.anIntArray327 = null;
			super.anInt5549 = -1;
		}
		@Pc(86) Class93 local86;
		if (super.anInt5519 != -1) {
			local86 = Static436.aClass292_2.method7401(super.anInt5519);
			if (local86.aBoolean189 && local86.anInt2750 != -1 && Static294.aClass373_2.method8738(local86.anInt2750).anInt361 == 1) {
				super.anInt5519 = -1;
			}
		}
		if (super.anInt5558 != -1) {
			local86 = Static436.aClass292_2.method7401(super.anInt5558);
			if (local86.aBoolean189 && local86.anInt2750 != -1 && Static294.aClass373_2.method8738(local86.anInt2750).anInt361 == 1) {
				super.anInt5558 = -1;
			}
		}
		if (super.anInt5574 < 9) {
			super.anInt5574++;
		}
		for (@Pc(151) int local151 = super.anInt5574; local151 > 0; local151--) {
			super.anIntArray335[local151] = super.anIntArray335[local151 - 1];
			super.anIntArray336[local151] = super.anIntArray336[local151 - 1];
			super.aByteArray60[local151] = super.aByteArray60[local151 - 1];
		}
		super.anIntArray335[0] = local10;
		super.anIntArray336[0] = local15;
		super.aByteArray60[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!ow;)V")
	public void method4928(@OriginalArg(1) Class247 arg0) {
		this.aClass247_1 = arg0;
		if (this.aClass247_1 != null) {
			this.anInt5598 = this.aClass247_1.anInt7671;
			this.aString62 = this.aClass247_1.aString89;
		}
		if (super.aClass20_Sub8_4 != null) {
			super.aClass20_Sub8_4.method6630();
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method9011() {
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)Z")
	public boolean method4929() {
		return this.aClass247_1 != null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ha;I)Lclient!ria;")
	@Override
	public Class290 method9007(@OriginalArg(0) Class100 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
	@Override
	public void method9017() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I")
	@Override
	public int method4905() {
		if (this.aClass247_1.anIntArray467 != null) {
			@Pc(19) Class247 local19 = this.aClass247_1.method6613(Static279.aClass294_1);
			if (local19 != null && local19.anInt7682 != -1) {
				return local19.anInt7682;
			}
		}
		return this.aClass247_1.anInt7682 == -1 ? super.method4905() : this.aClass247_1.anInt7682;
	}
}
