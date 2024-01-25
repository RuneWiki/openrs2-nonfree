import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class31_Sub2_Sub1_Sub2 extends Class31_Sub2_Sub1 {

	@OriginalMember(owner = "client!wq", name = "Kc", descriptor = "Lclient!dm;")
	public Class53 aClass53_1;

	@OriginalMember(owner = "client!wq", name = "Mc", descriptor = "I")
	public int anInt7394 = -1;

	@OriginalMember(owner = "client!wq", name = "Qc", descriptor = "I")
	public int anInt7397 = -1;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZIIIII)V")
	public void method5996(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		super.aByte100 = (byte) arg2;
		if (super.anInt7365 != -1 && Static293.aClass127_1.method2975(super.anInt7365).anInt6040 == 1) {
			super.anInt7365 = -1;
		}
		@Pc(36) Class38 local36;
		if (super.anInt7321 != -1) {
			local36 = Static67.aClass263_2.method5782(super.anInt7321);
			if (local36.aBoolean50 && local36.anInt1014 != -1 && Static293.aClass127_1.method2975(local36.anInt1014).anInt6040 == 1) {
				super.anInt7321 = -1;
			}
		}
		if (super.anInt7368 != -1) {
			local36 = Static67.aClass263_2.method5782(super.anInt7368);
			if (local36.aBoolean50 && local36.anInt1014 != -1 && Static293.aClass127_1.method2975(local36.anInt1014).anInt6040 == 1) {
				super.anInt7368 = -1;
			}
		}
		if (!arg0) {
			@Pc(96) int local96 = arg3 - super.anIntArray658[0];
			@Pc(103) int local103 = arg4 - super.anIntArray657[0];
			if (local96 >= -8 && local96 <= 8 && local103 >= -8 && local103 <= 8) {
				if (super.anInt7378 < 9) {
					super.anInt7378++;
				}
				for (@Pc(134) int local134 = super.anInt7378; local134 > 0; local134--) {
					super.anIntArray658[local134] = super.anIntArray658[local134 - 1];
					super.anIntArray657[local134] = super.anIntArray657[local134 - 1];
					super.aByteArray96[local134] = super.aByteArray96[local134 - 1];
				}
				super.anIntArray658[0] = arg3;
				super.anIntArray657[0] = arg4;
				super.aByteArray96[0] = 1;
				return;
			}
		}
		super.anInt7378 = 0;
		super.anIntArray658[0] = arg3;
		super.anInt7380 = 0;
		super.anInt7379 = 0;
		super.anIntArray657[0] = arg4;
		super.anInt7300 = (arg1 << 6) + (super.anIntArray658[0] << 7);
		super.anInt7298 = (super.anIntArray657[0] << 7) + (arg1 << 6);
		if (super.aClass4_Sub7_7 != null) {
			super.aClass4_Sub7_7.method3773();
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!dm;I)V")
	public void method5997(@OriginalArg(0) Class53 arg0) {
		this.aClass53_1 = arg0;
		if (super.aClass4_Sub7_7 != null) {
			super.aClass4_Sub7_7.method3773();
		}
	}

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "(B)Z")
	private boolean method5998() {
		return this.aClass53_1.aBoolean95;
	}

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "(I)I")
	@Override
	public int method5976() {
		return super.anInt7309;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
		if (this.aClass53_1 != null && (super.aBoolean508 || this.method6002(arg0, 0))) {
			this.method5986(super.aClass105Array3, super.aBoolean508, arg0);
			super.aClass105Array3[0] = super.aClass105Array3[1] = super.aClass105Array3[2] = super.aClass105Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5971() {
		return false;
	}

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "(B)Z")
	public boolean method6001() {
		return this.aClass53_1 != null;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	@Override
	public void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!ya;II)Z")
	private boolean method6002(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class21 local11 = this.method5982();
		@Pc(29) Class223 local29 = super.anInt7365 != -1 && super.anInt7323 == 0 ? Static293.aClass127_1.method2975(super.anInt7365) : null;
		@Pc(46) Class223 local46 = super.anInt7338 == -1 || super.aBoolean505 && local29 != null ? null : Static293.aClass127_1.method2975(super.anInt7338);
		@Pc(49) int local49 = local11.anInt613;
		@Pc(52) int local52 = local11.anInt593;
		if (local49 != 0 || local52 != 0 || local11.anInt633 != 0 || local11.anInt630 != 0) {
			arg1 |= 0x7;
		}
		@Pc(91) boolean local91 = super.aByte103 != 0 && Static378.anInt4244 >= super.anInt7360 && Static378.anInt4244 < super.anInt7339;
		if (local91) {
			arg1 |= 0x80000;
		}
		@Pc(128) Class105 local128 = super.aClass105Array3[0] = this.aClass53_1.method1512(super.anInt7350, super.aClass225Array3, local46, arg1, super.anInt7335, super.anInt7320, Static293.aClass127_1, arg0, super.anInt7317, local29, super.anInt7370, super.anInt7334, Static394.aClass23_1, Static117.aClass75_1);
		if (local128 == null) {
			return false;
		}
		super.anInt7309 = local128.MA();
		this.method5994(local128);
		@Pc(145) int local145 = super.aClass98_7.method2351();
		if (local49 == 0 && local52 == 0) {
			this.method5990(local145, this.method5989() << 7, this.method5989() << 7, 0, 0);
		} else {
			this.method5990(local145, local49, local52, local11.anInt618, local11.anInt604);
			if (super.anInt7373 != 0) {
				super.aClass105Array3[0].Z(super.anInt7373);
			}
			if (super.anInt7346 != 0) {
				super.aClass105Array3[0].R(super.anInt7346);
			}
			if (super.anInt7355 != 0) {
				super.aClass105Array3[0].JA(0, super.anInt7355, 0);
			}
		}
		if (local91) {
			local128.method3537(super.aByte102, super.aByte104, super.aByte105, super.aByte103 & 0xFF);
		}
		@Pc(254) Class38 local254;
		@Pc(271) boolean local271;
		@Pc(273) int local273;
		@Pc(319) Class105 local319;
		if (super.anInt7321 == -1 || super.anInt7357 == -1) {
			super.aClass105Array3[1] = null;
		} else {
			local254 = Static67.aClass263_2.method5782(super.anInt7321);
			local271 = local254.aByte3 == 3 && (local49 != 0 || local52 != 0);
			local273 = local7;
			if (local271) {
				local273 = local7 | 0x7;
			} else {
				if (super.anInt7307 != 0) {
					local273 = local7 | 0x5;
				}
				if (super.anInt7374 != 0) {
					local273 |= 0x2;
				}
			}
			local319 = super.aClass105Array3[1] = local254.method918(super.anInt7357, super.anInt7314, super.anInt7367, local273, arg0, Static293.aClass127_1);
			if (local319 != null) {
				if (super.anInt7374 != 0) {
					local319.JA(0, -super.anInt7374 << 0, 0);
				}
				if (super.anInt7307 != 0) {
					local319.Q(super.anInt7307 * 2048);
				}
				if (local271) {
					if (super.anInt7373 != 0) {
						local319.Z(super.anInt7373);
					}
					if (super.anInt7346 != 0) {
						local319.R(super.anInt7346);
					}
					if (super.anInt7355 != 0) {
						local319.JA(0, super.anInt7355, 0);
					}
				}
			}
		}
		if (super.anInt7368 == -1 || super.anInt7371 == -1) {
			super.aClass105Array3[3] = null;
		} else {
			local254 = Static67.aClass263_2.method5782(super.anInt7368);
			local271 = local254.aByte3 == 3 && (local49 != 0 || local52 != 0);
			local273 = local7;
			if (local271) {
				local273 = local7 | 0x7;
			} else {
				if (super.anInt7318 != 0) {
					local273 = local7 | 0x5;
				}
				if (super.anInt7311 != 0) {
					local273 |= 0x2;
				}
			}
			local319 = super.aClass105Array3[3] = local254.method913(super.anInt7315, local273, Static293.aClass127_1, super.anInt7371, arg0, super.anInt7356);
			if (local319 != null) {
				if (super.anInt7311 != 0) {
					local319.JA(0, -super.anInt7311 << 0, 0);
				}
				if (super.anInt7318 != 0) {
					local319.Q(super.anInt7318 * 2048);
				}
				if (local271) {
					if (super.anInt7373 != 0) {
						local319.Z(super.anInt7373);
					}
					if (super.anInt7346 != 0) {
						local319.R(super.anInt7346);
					}
					if (super.anInt7355 != 0) {
						local319.JA(0, super.anInt7355, 0);
					}
				}
			}
		}
		super.aClass105Array3[2] = null;
		if (super.aClass1_Sub28_3 != null) {
			if (super.aClass1_Sub28_3.anInt4397 <= Static378.anInt4244) {
				super.aClass1_Sub28_3 = null;
			} else if (super.aClass1_Sub28_3.anInt4383 <= Static378.anInt4244) {
				@Pc(546) Class105 local546 = super.aClass1_Sub28_3.method3622(arg0, local7 | 0x7);
				if (local546 != null) {
					local546.JA(super.aClass1_Sub28_3.anInt4392 - super.anInt7300, super.aClass1_Sub28_3.anInt4386 - super.anInt7296, super.aClass1_Sub28_3.anInt4393 - super.anInt7298);
					if (local145 != 0) {
						local546.Q(local145);
					}
					super.aClass105Array3[2] = local546;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "(B)I")
	@Override
	public int method5987() {
		if (this.aClass53_1.anIntArray131 != null) {
			@Pc(19) Class53 local19 = this.aClass53_1.method1508(Static394.aClass23_1);
			if (local19 != null && local19.anInt1706 != -1) {
				return local19.anInt1706;
			}
		}
		return this.aClass53_1.anInt1706 == -1 ? super.method5987() : this.aClass53_1.anInt1706;
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)I")
	@Override
	protected int method5992() {
		if (this.aClass53_1.anIntArray131 != null) {
			@Pc(13) Class53 local13 = this.aClass53_1.method1508(Static394.aClass23_1);
			if (local13 != null && local13.anInt1723 != -1) {
				return local13.anInt1723;
			}
		}
		return this.aClass53_1.anInt1723;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5970() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)I")
	@Override
	public int method5983() {
		if (this.aClass53_1.anIntArray131 != null) {
			@Pc(13) Class53 local13 = this.aClass53_1.method1508(Static394.aClass23_1);
			if (local13 != null && local13.anInt1729 != -1) {
				return local13.anInt1729;
			}
		}
		return this.aClass53_1.anInt1729;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		if (this.aClass53_1 == null || !this.method6002(arg0, 2048)) {
			return null;
		}
		@Pc(24) Class33 local24 = arg0.method4516();
		@Pc(29) int local29 = super.aClass98_7.method2351();
		local24.ra(local29);
		local24.o(super.anInt7300, super.anInt7296, super.anInt7298);
		@Pc(44) Class21 local44 = this.method5982();
		@Pc(57) Class53 local57 = this.aClass53_1.anIntArray131 == null ? this.aClass53_1 : this.aClass53_1.method1508(Static394.aClass23_1);
		if (Static38.aClass135_Sub1_1.aBoolean364 && local57.aBoolean94 && local44.aBoolean27) {
			@Pc(81) Class223 local81 = super.anInt7365 != -1 && super.anInt7323 == 0 ? Static293.aClass127_1.method2975(super.anInt7365) : null;
			@Pc(98) Class223 local98 = super.anInt7338 == -1 || super.aBoolean505 && local81 != null ? null : Static293.aClass127_1.method2975(super.anInt7338);
			@Pc(150) Class105 local150 = Static155.method2550(this.aClass53_1.anInt1728, super.anInt7355, super.aBoolean507, this.aClass53_1.aByte30 & 0xFF, this.aClass53_1.aByte27 & 0xFF, super.anInt7373, local98 == null ? local81 : local98, arg0, local98 == null ? super.anInt7350 : super.anInt7335, local29, super.anInt7346, super.aClass105Array3[0], this.aClass53_1.aShort20 & 0xFFFF, this.aClass53_1.aShort21 & 0xFFFF);
			if (local150 != null) {
				@Pc(155) float local155 = arg0.W();
				@Pc(158) float local158 = arg0.xa();
				arg0.method4504(false);
				arg0.g(local155, local158 - 150.0F);
				local150.method3534(local24, null, 0);
				arg0.g(local155, local158);
				arg0.method4504(true);
			}
		}
		@Pc(181) Class4_Sub1 local181 = null;
		if (this.method5998()) {
			local181 = Static241.method3635(super.aClass105Array3.length);
		}
		if (super.aClass4_Sub7_7 == null) {
			arg0.method4497(super.aClass105Array3, local24, local181 == null ? null : local181.aClass4_Sub5Array1, 0);
		} else {
			@Pc(212) Class140 local212 = super.aClass4_Sub7_7.method3777();
			arg0.method4502(super.aClass105Array3, local212, local24, local181 == null ? null : local181.aClass4_Sub5Array1, 0);
		}
		this.method5986(super.aClass105Array3, false, arg0);
		if (super.aClass105Array3[2] != null) {
			if (local29 != 0) {
				super.aClass105Array3[2].Q(local29);
			}
			super.aClass105Array3[2].JA(super.anInt7300 - super.aClass1_Sub28_3.anInt4392, -super.aClass1_Sub28_3.anInt4386 + super.anInt7296, -super.aClass1_Sub28_3.anInt4393 + super.anInt7298);
		}
		super.aClass105Array3[0] = super.aClass105Array3[1] = super.aClass105Array3[2] = super.aClass105Array3[3] = null;
		super.anInt7343 = Static244.anInt4494;
		return local181;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)V")
	public void method6003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray658[0];
		@Pc(15) int local15 = super.anIntArray657[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local10++;
			local15++;
		}
		if (arg0 == 2) {
			local10++;
		}
		if (arg0 == 3) {
			local10++;
			local15--;
		}
		if (arg0 == 4) {
			local15--;
		}
		if (arg0 == 5) {
			local15--;
			local10--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt7365 != -1 && Static293.aClass127_1.method2975(super.anInt7365).anInt6040 == 1) {
			super.anInt7365 = -1;
		}
		@Pc(88) Class38 local88;
		if (super.anInt7321 != -1) {
			local88 = Static67.aClass263_2.method5782(super.anInt7321);
			if (local88.aBoolean50 && local88.anInt1014 != -1 && Static293.aClass127_1.method2975(local88.anInt1014).anInt6040 == 1) {
				super.anInt7321 = -1;
			}
		}
		if (super.anInt7368 != -1) {
			local88 = Static67.aClass263_2.method5782(super.anInt7368);
			if (local88.aBoolean50 && local88.anInt1014 != -1 && Static293.aClass127_1.method2975(local88.anInt1014).anInt6040 == 1) {
				super.anInt7368 = -1;
			}
		}
		if (super.anInt7378 < 9) {
			super.anInt7378++;
		}
		for (@Pc(156) int local156 = super.anInt7378; local156 > 0; local156--) {
			super.anIntArray658[local156] = super.anIntArray658[local156 - 1];
			super.anIntArray657[local156] = super.anIntArray657[local156 - 1];
			super.aByteArray96[local156] = super.aByteArray96[local156 - 1];
		}
		super.anIntArray658[0] = local10;
		super.anIntArray657[0] = local15;
		super.aByteArray96[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass53_1 == null || !this.method6002(arg0, 131072)) {
			return false;
		}
		@Pc(24) Class33 local24 = arg0.method4516();
		@Pc(29) int local29 = super.aClass98_7.method2351();
		local24.ra(local29);
		local24.o(super.anInt7300, super.anInt7296, super.anInt7298);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; local44 < super.aClass105Array3.length; local44++) {
			if (super.aClass105Array3[local44] != null && super.aClass105Array3[local44].method3526(arg2, arg1, local24, this.aClass53_1.anInt1728 == 1)) {
				local42 = true;
				break;
			}
		}
		super.aClass105Array3[0] = super.aClass105Array3[1] = super.aClass105Array3[2] = super.aClass105Array3[3] = null;
		return local42;
	}
}
