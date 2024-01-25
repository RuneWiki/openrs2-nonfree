import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class4_Sub2_Sub2_Sub2 extends Class4_Sub2_Sub2 {

	@OriginalMember(owner = "client!sq", name = "Hc", descriptor = "Lclient!rl;")
	public Class215 aClass215_1;

	@OriginalMember(owner = "client!sq", name = "Rc", descriptor = "I")
	public int anInt6540 = -1;

	@OriginalMember(owner = "client!sq", name = "Ec", descriptor = "I")
	public int anInt6529 = -1;

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)I")
	@Override
	public int method5129() {
		if (this.aClass215_1.anIntArray400 != null) {
			@Pc(19) Class215 local19 = this.aClass215_1.method4795(Static215.aClass225_1);
			if (local19 != null && local19.anInt6027 != -1) {
				return local19.anInt6027;
			}
		}
		return this.aClass215_1.anInt6027 == -1 ? super.method5129() : this.aClass215_1.anInt6027;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZIIII)V")
	public void method5132(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte92 = (byte) arg4;
		if (super.anInt6469 != -1 && Static9.aClass194_1.method4371(super.anInt6469).anInt1772 == 1) {
			super.anInt6469 = -1;
		}
		@Pc(35) Class77 local35;
		if (super.anInt6449 != -1) {
			local35 = Static137.aClass16_2.method251(super.anInt6449);
			if (local35.aBoolean191 && local35.anInt2238 != -1 && Static9.aClass194_1.method4371(local35.anInt2238).anInt1772 == 1) {
				super.anInt6449 = -1;
			}
		}
		if (super.anInt6509 != -1) {
			local35 = Static137.aClass16_2.method251(super.anInt6509);
			if (local35.aBoolean191 && local35.anInt2238 != -1 && Static9.aClass194_1.method4371(local35.anInt2238).anInt1772 == 1) {
				super.anInt6509 = -1;
			}
		}
		if (!arg0) {
			@Pc(96) int local96 = arg3 - super.anIntArray436[0];
			@Pc(103) int local103 = arg1 - super.anIntArray437[0];
			if (local96 >= -8 && local96 <= 8 && local103 >= -8 && local103 <= 8) {
				if (super.anInt6524 < 9) {
					super.anInt6524++;
				}
				for (@Pc(128) int local128 = super.anInt6524; local128 > 0; local128--) {
					super.anIntArray436[local128] = super.anIntArray436[local128 - 1];
					super.anIntArray437[local128] = super.anIntArray437[local128 - 1];
					super.aByteArray181[local128] = super.aByteArray181[local128 - 1];
				}
				super.anIntArray436[0] = arg3;
				super.aByteArray181[0] = 1;
				super.anIntArray437[0] = arg1;
				return;
			}
		}
		super.anInt6525 = 0;
		super.anInt6524 = 0;
		super.anIntArray436[0] = arg3;
		super.anInt6526 = 0;
		super.anIntArray437[0] = arg1;
		super.anInt7117 = (super.anIntArray436[0] << 7) + (arg2 << 6);
		super.anInt7111 = (arg2 << 6) + (super.anIntArray437[0] << 7);
		if (super.aClass38_Sub6_5 != null) {
			super.aClass38_Sub6_5.method3553();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method5893(@OriginalArg(0) Class26 arg0) {
		if (this.aClass215_1 != null && (super.aBoolean563 || this.method5136(arg0, 0))) {
			this.method5127(arg0, super.aBoolean563, super.aClass32Array3);
		}
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)I")
	@Override
	public int method5562() {
		return super.anInt6486;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5891() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(B)Z")
	public boolean method5133() {
		return this.aClass215_1 != null;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	@Override
	public Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0) {
		if (this.aClass215_1 == null || !this.method5136(arg0, 2048)) {
			return null;
		}
		@Pc(17) Class102 local17 = arg0.method2223();
		@Pc(22) int local22 = super.aClass157_7.method3616();
		local17.O(local22);
		local17.ZA(super.anInt7117, super.anInt7109, super.anInt7111);
		@Pc(44) Class12 local44 = this.method5131();
		@Pc(57) Class215 local57 = this.aClass215_1.anIntArray400 == null ? this.aClass215_1 : this.aClass215_1.method4795(Static215.aClass225_1);
		if (Static399.aClass167_Sub1_1.aBoolean493 && local57.aBoolean532 && local44.aBoolean32) {
			@Pc(85) Class46 local85 = super.anInt6469 != -1 && super.anInt6517 == 0 ? Static9.aClass194_1.method4371(super.anInt6469) : null;
			@Pc(103) Class46 local103 = super.anInt6458 == -1 || super.aBoolean561 && local85 != null ? null : Static9.aClass194_1.method4371(super.anInt6458);
			@Pc(155) Class32 local155 = Static335.method1104(local103 == null ? super.anInt6483 : super.anInt6452, super.anInt6490, super.anInt6519, local103 == null ? local85 : local103, this.aClass215_1.aShort74 & 0xFFFF, arg0, this.aClass215_1.aByte80 & 0xFF, this.aClass215_1.anInt5998, super.aClass32Array3[0], this.aClass215_1.aShort75 & 0xFFFF, this.aClass215_1.lb & 0xFF, local22, super.anInt6482, super.aBoolean560);
			if (local155 != null) {
				@Pc(160) float local160 = arg0.la();
				@Pc(163) float local163 = arg0.w();
				arg0.method2253(false);
				arg0.o(local160, local163 - 150.0F);
				local155.method5675(local17, null, 0);
				arg0.o(local160, local163);
				arg0.method2253(true);
			}
		}
		@Pc(186) Class38_Sub3 local186 = null;
		if (this.method5137()) {
			local186 = Static313.method4433(super.aClass32Array3.length);
		}
		if (super.aClass38_Sub6_5 == null) {
			arg0.method2291(super.aClass32Array3, local17, local186 == null ? null : local186.aClass38_Sub4Array1, 0);
		} else {
			@Pc(203) Class192 local203 = super.aClass38_Sub6_5.method3549();
			arg0.method2241(super.aClass32Array3, local203, local17, local186 == null ? null : local186.aClass38_Sub4Array1, 0);
		}
		this.method5127(arg0, false, super.aClass32Array3);
		if (super.aClass32Array3[2] != null) {
			if (local22 != 0) {
				super.aClass32Array3[2].k(local22);
			}
			super.aClass32Array3[2].ja(-super.aClass2_Sub24_3.anInt3886 + super.anInt7117, super.anInt7109 - super.aClass2_Sub24_3.anInt3892, -super.aClass2_Sub24_3.anInt3891 + super.anInt7111);
		}
		super.anInt6474 = Static41.anInt1082;
		return local186;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5889() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!rl;B)V")
	public void method5135(@OriginalArg(0) Class215 arg0) {
		this.aClass215_1 = arg0;
		if (super.aClass38_Sub6_5 != null) {
			super.aClass38_Sub6_5.method3553();
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)I")
	@Override
	protected int method5120() {
		if (this.aClass215_1.anIntArray400 != null) {
			@Pc(20) Class215 local20 = this.aClass215_1.method4795(Static215.aClass225_1);
			if (local20 != null && local20.anInt6026 != -1) {
				return local20.anInt6026;
			}
		}
		return this.aClass215_1.anInt6026;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BLclient!qa;I)Z")
	private boolean method5136(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class12 local11 = this.method5131();
		@Pc(27) Class46 local27 = super.anInt6469 != -1 && super.anInt6517 == 0 ? Static9.aClass194_1.method4371(super.anInt6469) : null;
		@Pc(44) Class46 local44 = super.anInt6458 == -1 || super.aBoolean561 && local27 != null ? null : Static9.aClass194_1.method4371(super.anInt6458);
		@Pc(47) int local47 = local11.anInt332;
		@Pc(50) int local50 = local11.anInt348;
		if (local47 != 0 || local50 != 0 || local11.anInt337 != 0 || local11.anInt355 != 0) {
			arg1 |= 0x7;
		}
		@Pc(92) boolean local92 = super.aByte87 != 0 && Static164.anInt3206 >= super.anInt6495 && Static164.anInt3206 < super.anInt6468;
		if (local92) {
			arg1 |= 0x80000;
		}
		@Pc(129) Class32 local129 = super.aClass32Array3[0] = this.aClass215_1.method4797(super.aClass268Array3, super.anInt6483, super.anInt6520, local44, Static9.aClass194_1, super.anInt6452, super.anInt6501, Static4.aClass136_1, local27, super.anInt6460, arg0, super.anInt6494, Static215.aClass225_1, arg1);
		if (local129 == null) {
			return false;
		}
		super.anInt6486 = local129.b();
		this.method5123(local129);
		@Pc(146) int local146 = super.aClass157_7.method3616();
		if (local47 == 0 && local50 == 0) {
			this.method5121(this.method5118() << 7, 0, this.method5118() << 7, 0, local146);
		} else {
			this.method5121(local47, local11.anInt344, local50, local11.anInt339, local146);
			if (super.anInt6519 != 0) {
				super.aClass32Array3[0].WA(super.anInt6519);
			}
			if (super.anInt6482 != 0) {
				super.aClass32Array3[0].o(super.anInt6482);
			}
			if (super.anInt6490 != 0) {
				super.aClass32Array3[0].ja(0, super.anInt6490, 0);
			}
		}
		if (local92) {
			local129.method5684(super.aByte85, super.aByte86, super.aByte88, super.aByte87 & 0xFF);
		}
		if (super.anInt6449 == -1 || super.anInt6515 == -1) {
			super.aClass32Array3[1] = null;
		} else {
			@Pc(252) Class77 local252 = Static137.aClass16_2.method251(super.anInt6449);
			@Pc(272) boolean local272 = local252.aByte17 == 3 && (local47 != 0 || local50 != 0);
			@Pc(274) int local274 = local7;
			if (local272) {
				local274 = local7 | 0x7;
			} else {
				if (super.anInt6493 != 0) {
					local274 = local7 | 0x5;
				}
				if (super.anInt6467 != 0) {
					local274 |= 0x2;
				}
			}
			@Pc(314) Class32 local314 = super.aClass32Array3[1] = local252.method1670(arg0, super.anInt6521, local274, super.anInt6480, Static9.aClass194_1, super.anInt6515);
			if (local314 != null) {
				if (super.anInt6467 != 0) {
					local314.ja(0, -super.anInt6467 << 0, 0);
				}
				if (super.anInt6493 != 0) {
					local314.k(super.anInt6493 * 2048);
				}
				if (local272) {
					if (super.anInt6519 != 0) {
						local314.WA(super.anInt6519);
					}
					if (super.anInt6482 != 0) {
						local314.o(super.anInt6482);
					}
					if (super.anInt6490 != 0) {
						local314.ja(0, super.anInt6490, 0);
					}
				}
			}
		}
		if (super.anInt6509 == -1 || super.anInt6459 == -1) {
			super.aClass32Array3[3] = null;
		} else {
			@Pc(390) Class77 local390 = Static137.aClass16_2.method251(super.anInt6509);
			@Pc(404) boolean local404 = local390.aByte17 == 3 && (local47 != 0 || local50 != 0);
			@Pc(406) int local406 = local7;
			if (local404) {
				local406 = local7 | 0x7;
			} else {
				if (super.anInt6478 != 0) {
					local406 = local7 | 0x5;
				}
				if (super.anInt6472 != 0) {
					local406 |= 0x2;
				}
			}
			@Pc(449) Class32 local449 = super.aClass32Array3[3] = local390.method1663(arg0, local406, super.anInt6459, super.anInt6499, Static9.aClass194_1, super.anInt6477);
			if (local449 != null) {
				if (super.anInt6472 != 0) {
					local449.ja(0, -super.anInt6472 << 0, 0);
				}
				if (super.anInt6478 != 0) {
					local449.k(super.anInt6478 * 2048);
				}
				if (local404) {
					if (super.anInt6519 != 0) {
						local449.WA(super.anInt6519);
					}
					if (super.anInt6482 != 0) {
						local449.o(super.anInt6482);
					}
					if (super.anInt6490 != 0) {
						local449.ja(0, super.anInt6490, 0);
					}
				}
			}
		}
		super.aClass32Array3[2] = null;
		if (super.aClass2_Sub24_3 != null) {
			if (super.aClass2_Sub24_3.anInt3898 <= Static164.anInt3206) {
				super.aClass2_Sub24_3 = null;
			} else if (Static164.anInt3206 >= super.aClass2_Sub24_3.anInt3890) {
				@Pc(547) Class32 local547 = super.aClass2_Sub24_3.method3138(arg0, local7 | 0x7);
				if (local547 != null) {
					local547.ja(-super.anInt7117 + super.aClass2_Sub24_3.anInt3886, -super.anInt7109 + super.aClass2_Sub24_3.anInt3892, -super.anInt7111 + super.aClass2_Sub24_3.anInt3891);
					if (local146 != 0) {
						local547.k(local146);
					}
					super.aClass32Array3[2] = local547;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "(B)Z")
	private boolean method5137() {
		return this.aClass215_1.aBoolean530;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)I")
	@Override
	public int method5125() {
		if (this.aClass215_1.anIntArray400 != null) {
			@Pc(13) Class215 local13 = this.aClass215_1.method4795(Static215.aClass225_1);
			if (local13 != null && local13.anInt6021 != -1) {
				return local13.anInt6021;
			}
		}
		return this.aClass215_1.anInt6021;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass215_1 == null || !this.method5136(arg1, 131072)) {
			return false;
		}
		@Pc(24) Class102 local24 = arg1.method2223();
		@Pc(29) int local29 = super.aClass157_7.method3616();
		local24.O(local29);
		local24.ZA(super.anInt7117, super.anInt7109, super.anInt7111);
		for (@Pc(42) int local42 = 0; super.aClass32Array3.length > local42; local42++) {
			if (super.aClass32Array3[local42] != null && super.aClass32Array3[local42].method5671(arg2, arg0, local24, this.aClass215_1.anInt5998 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIZ)V")
	public void method5138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray436[0];
		@Pc(15) int local15 = super.anIntArray437[0];
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
		if (super.anInt6469 != -1 && Static9.aClass194_1.method4371(super.anInt6469).anInt1772 == 1) {
			super.anInt6469 = -1;
		}
		@Pc(88) Class77 local88;
		if (super.anInt6449 != -1) {
			local88 = Static137.aClass16_2.method251(super.anInt6449);
			if (local88.aBoolean191 && local88.anInt2238 != -1 && Static9.aClass194_1.method4371(local88.anInt2238).anInt1772 == 1) {
				super.anInt6449 = -1;
			}
		}
		if (super.anInt6509 != -1) {
			local88 = Static137.aClass16_2.method251(super.anInt6509);
			if (local88.aBoolean191 && local88.anInt2238 != -1 && Static9.aClass194_1.method4371(local88.anInt2238).anInt1772 == 1) {
				super.anInt6509 = -1;
			}
		}
		if (super.anInt6524 < 9) {
			super.anInt6524++;
		}
		for (@Pc(152) int local152 = super.anInt6524; local152 > 0; local152--) {
			super.anIntArray436[local152] = super.anIntArray436[local152 - 1];
			super.anIntArray437[local152] = super.anIntArray437[local152 - 1];
			super.aByteArray181[local152] = super.aByteArray181[local152 - 1];
		}
		super.anIntArray436[0] = local10;
		super.aByteArray181[0] = (byte) arg1;
		super.anIntArray437[0] = local15;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILclient!qa;Lclient!eq;IIZ)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}
}
