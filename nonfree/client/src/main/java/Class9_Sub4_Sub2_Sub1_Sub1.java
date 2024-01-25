import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class9_Sub4_Sub2_Sub1_Sub1 extends Class9_Sub4_Sub2_Sub1 {

	@OriginalMember(owner = "client!cea", name = "gd", descriptor = "Lclient!cr;")
	public Class54 aClass54_1;

	@OriginalMember(owner = "client!cea", name = "od", descriptor = "Lclient!jl;")
	public Class158 aClass158_1;

	@OriginalMember(owner = "client!cea", name = "fd", descriptor = "I")
	public int anInt2274 = 1;

	@OriginalMember(owner = "client!cea", name = "md", descriptor = "I")
	public int anInt2280 = 1;

	@OriginalMember(owner = "client!cea", name = "sd", descriptor = "I")
	public int anInt2285 = -1;

	@OriginalMember(owner = "client!cea", name = "Bd", descriptor = "I")
	public int anInt2291 = -1;

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class5 arg0) {
		if (this.aClass158_1 == null || !super.aBoolean351 && !this.method1988(arg0, 0)) {
			return;
		}
		@Pc(28) Class115 local28 = arg0.method6156();
		local28.method6291(super.aClass332_7.method7925());
		local28.method6296(super.anInt10360, super.anInt10365 - 20, super.anInt10357);
		this.method3622(arg0, super.aBoolean351, local28, super.aClass92Array3);
		super.aClass92Array3[0] = super.aClass92Array3[1] = super.aClass92Array3[2] = null;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!ha;II)Z")
	private boolean method1988(@OriginalArg(0) Class5 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class303 local11 = this.method3625();
		@Pc(36) Class113 local36 = super.anInt4341 != -1 && super.anInt4326 == 0 ? Static528.aClass198_2.method5706(super.anInt4341) : null;
		@Pc(54) Class113 local54 = super.anInt4312 == -1 || super.aBoolean349 && local36 != null ? null : Static528.aClass198_2.method5706(super.anInt4312);
		@Pc(57) int local57 = local11.anInt8944;
		@Pc(60) int local60 = local11.anInt8961;
		if (local57 != 0 || local60 != 0 || local11.anInt8974 != 0 || local11.anInt8945 != 0) {
			arg1 |= 0x7;
		}
		@Pc(105) boolean local105 = super.aByte44 != 0 && Static384.anInt7234 >= super.anInt4331 && Static384.anInt7234 < super.anInt4275;
		if (local105) {
			arg1 |= 0x80000;
		}
		@Pc(116) int local116 = super.aClass332_7.method7925();
		@Pc(152) Class92 local152 = super.aClass92Array3[0] = this.aClass158_1.method4868(super.anInt4319, local116, super.anIntArray188, super.anInt4276, local36, super.aClass241Array3, arg0, super.anInt4336, super.anInt4290, Static140.aClass157_1, this.aClass54_1, super.lb, Static629.aClass271_1, arg1, super.anInt4348, Static528.aClass198_2, local54);
		if (local152 == null) {
			return false;
		}
		super.anInt4278 = local152.fa();
		super.anInt4281 = local152.ma();
		this.method3632(local152);
		if (local57 == 0 && local60 == 0) {
			this.method3626(0, this.method3620() << 9, this.method3620() << 9, local116, 0);
		} else {
			this.method3626(local11.anInt8941, local57, local60, local116, local11.anInt8972);
			if (super.anInt4313 != 0) {
				super.aClass92Array3[0].FA(super.anInt4313);
			}
			if (super.anInt4302 != 0) {
				super.aClass92Array3[0].VA(super.anInt4302);
			}
			if (super.anInt4344 != 0) {
				super.aClass92Array3[0].H(0, super.anInt4344, 0);
			}
		}
		if (local105) {
			local152.method7065(super.aByte43, super.aByte42, super.aByte41, super.aByte44 & 0xFF);
		}
		@Pc(278) Class124 local278;
		@Pc(290) boolean local290;
		@Pc(292) int local292;
		@Pc(342) Class92 local342;
		@Pc(363) int local363;
		@Pc(365) int local365;
		@Pc(367) int local367;
		@Pc(454) int local454;
		@Pc(482) int local482;
		@Pc(491) int local491;
		@Pc(495) int local495;
		@Pc(505) int local505;
		if (super.anInt4306 == -1 || super.anInt4301 == -1) {
			super.aClass92Array3[1] = null;
		} else {
			local278 = Static360.aClass312_2.method7492(super.anInt4306);
			local290 = local278.aByte36 == 3 && (local57 != 0 || local60 != 0);
			local292 = local7;
			if (local290) {
				local292 = local7 | 0x7;
			} else {
				if (super.anInt4314 != 0) {
					local292 = local7 | 0x5;
				}
				if (super.anInt4310 != 0) {
					local292 |= 0x2;
				}
				if (super.anInt4337 >= 0) {
					local292 |= 0x7;
				}
			}
			local342 = super.aClass92Array3[1] = local278.method3529(super.anInt4301, Static528.aClass198_2, local292, super.anInt4323, super.anInt4296, arg0);
			if (local342 != null) {
				if (super.anInt4337 >= 0) {
					local363 = 0;
					local365 = 0;
					local367 = 0;
					if (local11.anIntArrayArray47 != null && local11.anIntArrayArray47[super.anInt4337] != null) {
						local365 = local11.anIntArrayArray47[super.anInt4337][1];
						local367 = local11.anIntArrayArray47[super.anInt4337][2];
						local363 = local11.anIntArrayArray47[super.anInt4337][0];
					}
					if (local11.anIntArrayArray46 != null && local11.anIntArrayArray46[super.anInt4337] != null) {
						local363 += local11.anIntArrayArray46[super.anInt4337][0];
						local365 += local11.anIntArrayArray46[super.anInt4337][1];
						local367 += local11.anIntArrayArray46[super.anInt4337][2];
					}
					if (local367 != 0 || local363 != 0) {
						local454 = local116;
						if (super.anIntArray188 != null && super.anIntArray188[super.anInt4337] != -1) {
							local454 = super.anIntArray188[super.anInt4337];
						}
						local482 = local454 + super.anInt4314 * 2048 - local116 & 0x3FFF;
						if (local482 != 0) {
							local342.a(local482);
						}
						local491 = Class78_Sub2_Sub2.anIntArray270[local482];
						local495 = Class78_Sub2_Sub2.anIntArray271[local482];
						local505 = local363 * local495 + local491 * local367 >> 14;
						local367 = local367 * local495 - local363 * local491 >> 14;
						local363 = local505;
					}
					local342.H(local363, local365, local367);
				} else if (super.anInt4314 != 0) {
					local342.a(super.anInt4314 * 2048);
				}
				if (super.anInt4310 != 0) {
					local342.H(0, -super.anInt4310 << 2, 0);
				}
				if (local290) {
					if (super.anInt4313 != 0) {
						local342.FA(super.anInt4313);
					}
					if (super.anInt4302 != 0) {
						local342.VA(super.anInt4302);
					}
					if (super.anInt4344 != 0) {
						local342.H(0, super.anInt4344, 0);
					}
				}
			}
		}
		if (super.anInt4294 == -1 || super.anInt4356 == -1) {
			super.aClass92Array3[2] = null;
		} else {
			local278 = Static360.aClass312_2.method7492(super.anInt4294);
			local290 = local278.aByte36 == 3 && (local57 != 0 || local60 != 0);
			local292 = local7;
			if (local290) {
				local292 = local7 | 0x7;
			} else {
				if (super.anInt4288 != 0) {
					local292 = local7 | 0x5;
				}
				if (super.anInt4292 != 0) {
					local292 |= 0x2;
				}
				if (super.anInt4279 >= 0) {
					local292 |= 0x7;
				}
			}
			local342 = super.aClass92Array3[2] = local278.method3522(arg0, super.anInt4350, local292, Static528.aClass198_2, super.anInt4353, super.anInt4356);
			if (local342 != null) {
				if (super.anInt4279 >= 0 && local11.anIntArrayArray47 != null && local11.anIntArrayArray47[super.anInt4279] != null) {
					local363 = 0;
					local365 = 0;
					local367 = 0;
					if (local11.anIntArrayArray47 != null && local11.anIntArrayArray47[super.anInt4279] != null) {
						local363 = local11.anIntArrayArray47[super.anInt4279][0];
						local365 = local11.anIntArrayArray47[super.anInt4279][1];
						local367 = local11.anIntArrayArray47[super.anInt4279][2];
					}
					if (local11.anIntArrayArray46 != null && local11.anIntArrayArray46[super.anInt4279] != null) {
						local365 += local11.anIntArrayArray46[super.anInt4279][1];
						local363 += local11.anIntArrayArray46[super.anInt4279][0];
						local367 += local11.anIntArrayArray46[super.anInt4279][2];
					}
					if (local367 != 0 || local363 != 0) {
						local454 = local116;
						if (super.anIntArray188 != null && super.anIntArray188[super.anInt4279] != -1) {
							local454 = super.anIntArray188[super.anInt4279];
						}
						local482 = local454 + super.anInt4288 * 2048 - local116 & 0x3FFF;
						if (local482 != 0) {
							local342.a(local482);
						}
						local491 = Class78_Sub2_Sub2.anIntArray270[local482];
						local495 = Class78_Sub2_Sub2.anIntArray271[local482];
						local505 = local367 * local491 + local363 * local495 >> 14;
						local367 = local495 * local367 - local363 * local491 >> 14;
						local363 = local505;
					}
					local342.H(local363, local365, local367);
				} else if (super.anInt4288 != 0) {
					local342.a(super.anInt4288 * 2048);
				}
				if (super.anInt4292 != 0) {
					local342.H(0, -super.anInt4292 << 2, 0);
				}
				if (local290) {
					if (super.anInt4313 != 0) {
						local342.FA(super.anInt4313);
					}
					if (super.anInt4302 != 0) {
						local342.VA(super.anInt4302);
					}
					if (super.anInt4344 != 0) {
						local342.H(0, super.anInt4344, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIZBII)V")
	public void method1989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte135 = super.aByte134 = (byte) arg4;
		if (Static3.method52(arg3, arg1)) {
			super.aByte134++;
		}
		if (super.anInt4341 != -1 && Static528.aClass198_2.method5706(super.anInt4341).anInt3847 == 1) {
			super.anIntArray189 = null;
			super.anInt4341 = -1;
		}
		@Pc(55) Class124 local55;
		if (super.anInt4306 != -1) {
			local55 = Static360.aClass312_2.method7492(super.anInt4306);
			if (local55.aBoolean336 && local55.anInt4155 != -1 && Static528.aClass198_2.method5706(local55.anInt4155).anInt3847 == 1) {
				super.anInt4306 = -1;
			}
		}
		if (super.anInt4294 != -1) {
			local55 = Static360.aClass312_2.method7492(super.anInt4294);
			if (local55.aBoolean336 && local55.anInt4155 != -1 && Static528.aClass198_2.method5706(local55.anInt4155).anInt3847 == 1) {
				super.anInt4294 = -1;
			}
		}
		if (!arg2) {
			@Pc(116) int local116 = arg1 - super.anIntArray197[0];
			@Pc(124) int local124 = arg3 - super.anIntArray198[0];
			if (local116 >= -8 && local116 <= 8 && local124 >= -8 && local124 <= 8) {
				if (super.anInt4359 < 9) {
					super.anInt4359++;
				}
				for (@Pc(157) int local157 = super.anInt4359; local157 > 0; local157--) {
					super.anIntArray197[local157] = super.anIntArray197[local157 - 1];
					super.anIntArray198[local157] = super.anIntArray198[local157 - 1];
					super.aByteArray31[local157] = super.aByteArray31[local157 - 1];
				}
				super.anIntArray197[0] = arg1;
				super.aByteArray31[0] = 1;
				super.anIntArray198[0] = arg3;
				return;
			}
		}
		super.anInt4359 = 0;
		super.anIntArray197[0] = arg1;
		super.anInt4361 = 0;
		super.anInt4358 = 0;
		super.anIntArray198[0] = arg3;
		super.anInt10357 = (arg0 << 8) + (super.anIntArray198[0] << 9);
		super.anInt10360 = (super.anIntArray197[0] << 9) + (arg0 << 8);
		if (super.aClass9_Sub5_3 != null) {
			super.aClass9_Sub5_3.method5233();
		}
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(III)V")
	public void method1990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray197[0];
		@Pc(15) int local15 = super.anIntArray198[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local10++;
			local15++;
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
			local10--;
			local15--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt4341 != -1 && Static528.aClass198_2.method5706(super.anInt4341).anInt3847 == 1) {
			super.anInt4341 = -1;
			super.anIntArray189 = null;
		}
		@Pc(90) Class124 local90;
		if (super.anInt4306 != -1) {
			local90 = Static360.aClass312_2.method7492(super.anInt4306);
			if (local90.aBoolean336 && local90.anInt4155 != -1 && Static528.aClass198_2.method5706(local90.anInt4155).anInt3847 == 1) {
				super.anInt4306 = -1;
			}
		}
		if (super.anInt4294 != -1) {
			local90 = Static360.aClass312_2.method7492(super.anInt4294);
			if (local90.aBoolean336 && local90.anInt4155 != -1 && Static528.aClass198_2.method5706(local90.anInt4155).anInt3847 == 1) {
				super.anInt4294 = -1;
			}
		}
		if (super.anInt4359 < 9) {
			super.anInt4359++;
		}
		for (@Pc(152) int local152 = super.anInt4359; local152 > 0; local152--) {
			super.anIntArray197[local152] = super.anIntArray197[local152 - 1];
			super.anIntArray198[local152] = super.anIntArray198[local152 - 1];
			super.aByteArray31[local152] = super.aByteArray31[local152 - 1];
		}
		super.anIntArray197[0] = local10;
		super.anIntArray198[0] = local15;
		super.aByteArray31[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Z)I")
	@Override
	public int method3630() {
		if (this.aClass158_1.anIntArray260 != null) {
			@Pc(19) Class158 local19 = this.aClass158_1.method4867(Static140.aClass157_1);
			if (local19 != null && local19.anInt5814 != -1) {
				return local19.anInt5814;
			}
		}
		return this.aClass158_1.anInt5814 == -1 ? super.method3630() : this.aClass158_1.anInt5814;
	}

	@OriginalMember(owner = "client!cea", name = "l", descriptor = "(I)Z")
	private boolean method1991() {
		return this.aClass158_1.aBoolean453;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!gg;BZILclient!ha;II)V")
	@Override
	public void method8416(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!ha;BI)Z")
	@Override
	public boolean method8411(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass158_1 == null || !this.method1988(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class115 local19 = arg1.method6156();
		@Pc(24) int local24 = super.aClass332_7.method7925();
		local19.method6291(local24);
		local19.method6296(super.anInt10360, super.anInt10365, super.anInt10357);
		@Pc(45) boolean local45 = false;
		for (@Pc(47) int local47 = 0; local47 < super.aClass92Array3.length; local47++) {
			if (super.aClass92Array3[local47] != null) {
				@Pc(73) boolean var10000;
				label41: {
					if (this.aClass158_1.anInt5836 <= 0) {
						label39: {
							if (this.aClass158_1.anInt5816 == -1) {
								if (this.aClass158_1.anInt5826 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass158_1.anInt5816 == 1) {
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
				@Pc(88) boolean local88 = var10000;
				@Pc(103) boolean local103;
				if (Static423.aBoolean622) {
					local103 = super.aClass92Array3[local47].method7061(arg0, arg2, local19, local88, this.aClass158_1.anInt5836, Static32.anInt849);
				} else {
					local103 = super.aClass92Array3[local47].method7067(arg0, arg2, local19, local88, this.aClass158_1.anInt5836);
				}
				if (local103) {
					local45 = true;
					break;
				}
			}
		}
		super.aClass92Array3[0] = super.aClass92Array3[1] = super.aClass92Array3[2] = null;
		return local45;
	}

	@OriginalMember(owner = "client!cea", name = "j", descriptor = "(I)I")
	@Override
	public int method3621() {
		if (this.aClass158_1.anIntArray260 != null) {
			@Pc(13) Class158 local13 = this.aClass158_1.method4867(Static140.aClass157_1);
			if (local13 != null && local13.anInt5815 != -1) {
				return local13.anInt5815;
			}
		}
		return this.aClass158_1.anInt5815;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLclient!ha;)Lclient!oia;")
	@Override
	public Class243 method8409(@OriginalArg(1) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "(B)Z")
	public boolean method1992() {
		return this.aClass158_1 != null;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!jl;I)V")
	public void method1994(@OriginalArg(0) Class158 arg0) {
		this.aClass158_1 = arg0;
		if (super.aClass9_Sub5_3 != null) {
			super.aClass9_Sub5_3.method5233();
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)I")
	@Override
	protected int method3616() {
		if (this.aClass158_1.anIntArray260 != null) {
			@Pc(18) Class158 local18 = this.aClass158_1.method4867(Static140.aClass157_1);
			if (local18 != null && local18.anInt5846 != -1) {
				return local18.anInt5846;
			}
		}
		return this.aClass158_1.anInt5846;
	}

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8417() {
		return false;
	}

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "(I)I")
	@Override
	public int method8421() {
		return this.aClass158_1 == null ? 0 : this.aClass158_1.anInt5836;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(Lclient!ha;I)Lclient!bd;")
	@Override
	public Class9_Sub2 method8410(@OriginalArg(0) Class5 arg0) {
		if (this.aClass158_1 == null || !this.method1988(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class115 local19 = arg0.method6156();
		@Pc(24) int local24 = super.aClass332_7.method7925();
		local19.method6291(local24);
		@Pc(42) Class186 local42 = Static26.aClass186ArrayArrayArray1[super.aByte135][super.anInt10360 >> Static606.anInt10280][super.anInt10357 >> Static606.anInt10280];
		if (local42 == null || local42.aClass9_Sub4_Sub3_1 == null) {
			super.anInt4277 = (int) ((float) super.anInt4277 - (float) super.anInt4277 / 10.0F);
		} else {
			@Pc(69) int local69 = super.anInt4277 - local42.aClass9_Sub4_Sub3_1.aShort96;
			super.anInt4277 = (int) ((float) super.anInt4277 - (float) local69 / 10.0F);
		}
		local19.method6296(super.anInt10360, -super.anInt4277 + super.anInt10365 - 20, super.anInt10357);
		@Pc(98) Class303 local98 = this.method3625();
		@Pc(111) Class158 local111 = this.aClass158_1.anIntArray260 == null ? this.aClass158_1 : this.aClass158_1.method4867(Static140.aClass157_1);
		super.aBoolean352 = false;
		@Pc(116) Class9_Sub2 local116 = null;
		if (Static87.aClass6_Sub33_6.aClass14_Sub26_1.method8192() == 1 && local111.aBoolean455 && local98.aBoolean726) {
			@Pc(148) Class113 local148 = super.anInt4341 != -1 && super.anInt4326 == 0 ? Static528.aClass198_2.method5706(super.anInt4341) : null;
			@Pc(165) Class113 local165 = super.anInt4312 == -1 || super.aBoolean349 && local148 != null ? null : Static528.aClass198_2.method5706(super.anInt4312);
			@Pc(215) Class92 local215 = Static185.method3445(local165 == null ? local148 : local165, super.anInt4302, this.aClass158_1.anInt5826, this.aClass158_1.aByte62 & 0xFF, super.aClass92Array3[0], super.anInt4313, local24, this.aClass158_1.aByte60 & 0xFF, this.aClass158_1.aShort51 & 0xFFFF, local165 == null ? super.anInt4319 : super.anInt4276, arg0, this.aClass158_1.aShort50 & 0xFFFF, super.anInt4344);
			if (local215 != null) {
				local116 = Static167.method3172(super.aClass92Array3.length + 1, this.method1991());
				super.aBoolean352 = true;
				arg0.C(false);
				if (Static423.aBoolean622) {
					local215.method7057(local19, local116.aClass9_Sub6Array1[super.aClass92Array3.length], Static32.anInt849, 0);
				} else {
					local215.method7053(local19, local116.aClass9_Sub6Array1[super.aClass92Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local19.method6291(local24);
		local19.method6296(super.anInt10360, super.anInt10365 - super.anInt4277 - 5, super.anInt10357);
		if (local116 == null) {
			local116 = Static167.method3172(super.aClass92Array3.length, this.method1991());
		}
		this.method3622(arg0, false, local19, super.aClass92Array3);
		@Pc(302) int local302;
		if (Static423.aBoolean622) {
			for (local302 = 0; local302 < super.aClass92Array3.length; local302++) {
				if (super.aClass92Array3[local302] != null) {
					super.aClass92Array3[local302].method7057(local19, local116.aClass9_Sub6Array1[local302], Static32.anInt849, 0);
				}
			}
		} else {
			for (local302 = 0; local302 < super.aClass92Array3.length; local302++) {
				if (super.aClass92Array3[local302] != null) {
					super.aClass92Array3[local302].method7053(local19, local116.aClass9_Sub6Array1[local302], 0);
				}
			}
		}
		if (super.aClass9_Sub5_3 != null) {
			@Pc(366) Class257 local366 = super.aClass9_Sub5_3.method5222();
			if (Static423.aBoolean622) {
				arg0.method6148(local366, Static32.anInt849);
			} else {
				arg0.method6183(local366);
			}
		}
		for (local302 = 0; super.aClass92Array3.length > local302; local302++) {
			if (super.aClass92Array3[local302] != null) {
				super.aBoolean352 |= super.aClass92Array3[local302].F();
			}
		}
		super.aClass92Array3[0] = super.aClass92Array3[1] = super.aClass92Array3[2] = null;
		super.anInt4345 = Static322.anInt6388;
		return local116;
	}

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "(B)V")
	@Override
	public void method8427() {
		throw new IllegalStateException();
	}
}
