import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class29_Sub2_Sub1_Sub2 extends Class29_Sub2_Sub1 {

	@OriginalMember(owner = "client!ud", name = "zc", descriptor = "I")
	private int anInt8590;

	@OriginalMember(owner = "client!ud", name = "Dc", descriptor = "I")
	public int anInt8593;

	@OriginalMember(owner = "client!ud", name = "Ec", descriptor = "Ljava/lang/String;")
	public String aString107;

	@OriginalMember(owner = "client!ud", name = "cd", descriptor = "I")
	public int anInt8612;

	@OriginalMember(owner = "client!ud", name = "md", descriptor = "Ljava/lang/String;")
	public String aString108;

	@OriginalMember(owner = "client!ud", name = "od", descriptor = "Lclient!ph;")
	public Class246 aClass246_1;

	@OriginalMember(owner = "client!ud", name = "Hc", descriptor = "I")
	public int anInt8594 = -1;

	@OriginalMember(owner = "client!ud", name = "Oc", descriptor = "I")
	public int anInt8601 = -1;

	@OriginalMember(owner = "client!ud", name = "Rc", descriptor = "I")
	public int anInt8604 = 0;

	@OriginalMember(owner = "client!ud", name = "Zc", descriptor = "B")
	private byte aByte101 = 0;

	@OriginalMember(owner = "client!ud", name = "Wc", descriptor = "Z")
	public boolean aBoolean602 = false;

	@OriginalMember(owner = "client!ud", name = "ed", descriptor = "I")
	public int anInt8614 = -1;

	@OriginalMember(owner = "client!ud", name = "Cc", descriptor = "B")
	private byte aByte100 = 0;

	@OriginalMember(owner = "client!ud", name = "dd", descriptor = "I")
	public int anInt8613 = -1;

	@OriginalMember(owner = "client!ud", name = "Pc", descriptor = "I")
	public int anInt8602 = 0;

	@OriginalMember(owner = "client!ud", name = "Ic", descriptor = "I")
	public int anInt8595 = 0;

	@OriginalMember(owner = "client!ud", name = "ad", descriptor = "B")
	private byte aByte102 = 0;

	@OriginalMember(owner = "client!ud", name = "Fc", descriptor = "Z")
	public boolean aBoolean601 = false;

	@OriginalMember(owner = "client!ud", name = "Yc", descriptor = "I")
	public int anInt8610 = -1;

	@OriginalMember(owner = "client!ud", name = "nd", descriptor = "Z")
	public boolean aBoolean604 = false;

	@OriginalMember(owner = "client!ud", name = "kd", descriptor = "I")
	public int anInt8618 = 255;

	@OriginalMember(owner = "client!ud", name = "ld", descriptor = "I")
	public int anInt8619 = 0;

	@OriginalMember(owner = "client!ud", name = "Mc", descriptor = "I")
	public int anInt8599 = -1;

	@OriginalMember(owner = "client!ud", name = "sd", descriptor = "I")
	public int anInt8623 = 0;

	@OriginalMember(owner = "client!ud", name = "rd", descriptor = "I")
	public int anInt8622 = -1;

	@OriginalMember(owner = "client!ud", name = "gd", descriptor = "Z")
	public boolean aBoolean603 = false;

	@OriginalMember(owner = "client!ud", name = "bd", descriptor = "I")
	public int anInt8611 = -1;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BIII)V")
	public void method7011(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (super.anInt8582 < 9) {
			super.anInt8582++;
		}
		for (@Pc(28) int local28 = super.anInt8582; local28 > 0; local28--) {
			super.anIntArray661[local28] = super.anIntArray661[local28 - 1];
			super.anIntArray660[local28] = super.anIntArray660[local28 - 1];
			super.aByteArray110[local28] = super.aByteArray110[local28 - 1];
		}
		super.anIntArray661[0] = arg1;
		super.aByteArray110[0] = arg0;
		super.anIntArray660[0] = arg2;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		if (this.aClass246_1 == null || !this.method7015(arg2, 131072)) {
			return false;
		}
		@Pc(28) Class34 local28 = arg2.method7096();
		@Pc(33) int local33 = super.aClass293_7.method6528();
		local28.a(local33);
		local28.G(super.anInt9222, super.anInt9223, super.anInt9218);
		@Pc(46) boolean local46 = false;
		for (@Pc(48) int local48 = 0; super.aClass22Array3.length > local48; local48++) {
			if (super.aClass22Array3[local48] != null && super.aClass22Array3[local48].method4698(arg0, arg1, local28, true)) {
				local46 = true;
				break;
			}
		}
		super.aClass22Array3[0] = super.aClass22Array3[1] = super.aClass22Array3[2] = super.aClass22Array3[3] = null;
		return local46;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)I")
	@Override
	protected int method6995() {
		return this.anInt8590;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!bo;ILclient!oa;IIIZ)V")
	@Override
	public void method7543(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILclient!q;Lclient!oa;IIILclient!ba;)V")
	private void method7013(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1, @OriginalArg(3) Class121 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class22 arg6) {
		@Pc(14) int local14 = arg0 * arg0 + arg4 * arg4;
		if (local14 < 262144 || local14 > arg5) {
			return;
		}
		@Pc(32) int local32 = (int) (Math.atan2((double) arg4, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(46) Class22 local46 = Static469.method6574(super.anInt8520, arg2, super.anInt8508, super.anInt8562, arg3, local32);
		if (local46 != null) {
			arg2.method7129(false);
			local46.method4689(arg1, null, 0);
			arg2.method7129(true);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!oa;ZI)Z")
	private boolean method7015(@OriginalArg(0) Class121 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class120 local11 = this.method7009();
		@Pc(26) Class108 local26 = super.anInt8538 != -1 && super.anInt8563 == 0 ? Static31.aClass345_1.method7798(super.anInt8538) : null;
		@Pc(47) Class108 local47 = super.anInt8535 == -1 || this.aBoolean602 || super.aBoolean597 && local26 != null ? null : Static31.aClass345_1.method7798(super.anInt8535);
		@Pc(50) int local50 = local11.anInt2894;
		@Pc(53) int local53 = local11.anInt2899;
		if (local50 != 0 || local53 != 0 || local11.anInt2892 != 0 || local11.anInt2879 != 0) {
			arg1 |= 0x7;
		}
		@Pc(93) boolean local93 = super.aByte98 != 0 && Static358.anInt6263 >= super.anInt8565 && super.anInt8578 > Static358.anInt6263;
		if (local93) {
			arg1 |= 0x80000;
		}
		@Pc(134) Class22 local134 = super.aClass22Array3[0] = this.aClass246_1.method5781(Static505.aClass30_1, super.anInt8532, Static31.aClass345_1, super.anInt8515, super.anInt8540, local47, super.aClass325Array3, Static51.aClass202_1, Static78.aClass344_1, arg0, local26, super.anInt8581, arg1, super.anInt8577, Static492.aClass189_1, Static295.aClass256_2, super.anInt8536);
		@Pc(137) int local137 = Static337.method5123();
		if (Static31.anInt551 < 96 && local137 > 50) {
			Static262.method3723();
		}
		@Pc(166) int local166;
		if (Static192.aClass287_3 != Static376.aClass287_6 && local137 < 50) {
			local166 = 50 - local137;
			while (Static323.anInt5818 < local166) {
				Static101.aByteArrayArray5[Static323.anInt5818] = new byte[102400];
				Static323.anInt5818++;
			}
			while (Static323.anInt5818 > local166) {
				Static323.anInt5818--;
				Static101.aByteArrayArray5[Static323.anInt5818] = null;
			}
		} else if (Static376.aClass287_6 != Static192.aClass287_3) {
			Static323.anInt5818 = 0;
			Static101.aByteArrayArray5 = new byte[50][];
		}
		if (local134 == null) {
			return false;
		}
		super.anInt8557 = local134.DA();
		this.method7002(local134);
		local166 = super.aClass293_7.method6528();
		if (local50 == 0 && local53 == 0) {
			this.method7006(this.method7008() << 9, local166, 0, 0, this.method7008() << 9);
		} else {
			this.method7006(local50, local166, local11.anInt2875, local11.anInt2890, local53);
			if (super.anInt8520 != 0) {
				local134.AA(super.anInt8520);
			}
			if (super.anInt8562 != 0) {
				local134.v(super.anInt8562);
			}
			if (super.anInt8508 != 0) {
				local134.m(0, super.anInt8508, 0);
			}
		}
		if (local93) {
			local134.method4690(super.aByte99, super.lb, super.aByte97, super.aByte98 & 0xFF);
		}
		@Pc(318) Class237 local318;
		@Pc(333) boolean local333;
		@Pc(335) int local335;
		@Pc(381) Class22 local381;
		if (this.aBoolean602 || super.anInt8525 == -1 || super.anInt8542 == -1) {
			super.aClass22Array3[1] = null;
		} else {
			local318 = Static448.aClass117_2.method2317(super.anInt8525);
			local333 = local318.aByte63 == 3 && (local50 != 0 || local53 != 0);
			local335 = local7;
			if (local333) {
				local335 = local7 | 0x7;
			} else {
				if (super.anInt8530 != 0) {
					local335 = local7 | 0x5;
				}
				if (super.anInt8519 != 0) {
					local335 |= 0x2;
				}
			}
			local381 = super.aClass22Array3[1] = local318.method5496(super.anInt8561, super.anInt8529, super.anInt8542, local335, arg0, Static31.aClass345_1);
			if (local381 != null) {
				if (super.anInt8519 != 0) {
					local381.m(0, -super.anInt8519 << 2, 0);
				}
				if (super.anInt8530 != 0) {
					local381.I(super.anInt8530 * 2048);
				}
				if (local333) {
					if (super.anInt8520 != 0) {
						local381.AA(super.anInt8520);
					}
					if (super.anInt8562 != 0) {
						local381.v(super.anInt8562);
					}
					if (super.anInt8508 != 0) {
						local381.m(0, super.anInt8508, 0);
					}
				}
			}
		}
		if (this.aBoolean602 || super.anInt8534 == -1 || super.anInt8555 == -1) {
			super.aClass22Array3[3] = null;
		} else {
			local318 = Static448.aClass117_2.method2317(super.anInt8534);
			local333 = local318.aByte63 == 3 && (local50 != 0 || local53 != 0);
			local335 = local7;
			if (local333) {
				local335 = local7 | 0x7;
			} else {
				if (super.anInt8526 != 0) {
					local335 = local7 | 0x5;
				}
				if (super.anInt8523 != 0) {
					local335 |= 0x2;
				}
			}
			local381 = super.aClass22Array3[3] = local318.method5498(super.anInt8512, local335, Static31.aClass345_1, super.anInt8555, arg0, super.anInt8550);
			if (local381 != null) {
				if (super.anInt8523 != 0) {
					local381.m(0, -super.anInt8523 << 2, 0);
				}
				if (super.anInt8526 != 0) {
					local381.I(super.anInt8526 * 2048);
				}
				if (local333) {
					if (super.anInt8520 != 0) {
						local381.AA(super.anInt8520);
					}
					if (super.anInt8562 != 0) {
						local381.v(super.anInt8562);
					}
					if (super.anInt8508 != 0) {
						local381.m(0, super.anInt8508, 0);
					}
				}
			}
		}
		super.aClass22Array3[2] = null;
		if (!this.aBoolean602 && super.aClass6_Sub4_3 != null) {
			if (super.aClass6_Sub4_3.anInt521 <= Static358.anInt6263) {
				super.aClass6_Sub4_3 = null;
			} else if (super.aClass6_Sub4_3.anInt519 <= Static358.anInt6263) {
				@Pc(624) Class22 local624 = super.aClass6_Sub4_3.method430(local7 | 0x7, arg0);
				if (local624 != null) {
					local624.m(super.aClass6_Sub4_3.anInt516 - super.anInt9222, -super.anInt9223 + 5 + super.aClass6_Sub4_3.anInt517, -super.anInt9218 + super.aClass6_Sub4_3.anInt518);
					if (local166 != 0) {
						local624.I(-local166 & 0x3FFF);
					}
					super.aClass22Array3[2] = local624;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)Z")
	public boolean method7016() {
		return this.aClass246_1 != null;
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7540() {
		return false;
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)I")
	@Override
	public int method7546() {
		return super.anInt8557;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method7017() {
		return this.aString108;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method7018() {
		@Pc(7) String local7 = "";
		if (Static99.aStringArray6 != null) {
			local7 = local7 + Static99.aStringArray6[this.aByte102];
		}
		@Pc(29) int[] local29;
		if (this.aByte100 == 1 && Static536.anIntArray685 != null) {
			local29 = Static536.anIntArray685;
		} else {
			local29 = Static300.anIntArray467;
		}
		if (local29 != null && local29[this.aByte102] != -1) {
			@Pc(49) Class177 local49 = Static447.aClass338_3.method7594(local29[this.aByte102]);
			if (local49.aChar3 == 's') {
				local7 = local7 + local49.method3824(this.aByte101 & 0xFF);
			} else {
				Static169.method2641("gdn1", new Throwable());
				local29[this.aByte102] = -1;
			}
		}
		local7 = local7 + this.aString107;
		if (Static97.aStringArray5 != null) {
			local7 = local7 + Static97.aStringArray5[this.aByte102];
		}
		return local7;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		if (this.aClass246_1 == null || !this.method7015(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class34 local19 = arg0.method7096();
		@Pc(24) int local24 = super.aClass293_7.method6528();
		local19.a(local24);
		local19.G(super.anInt9222, super.anInt9223 - 20, super.anInt9218);
		@Pc(98) int local98;
		if (Static480.aClass6_Sub37_Sub1_1.aBoolean413) {
			@Pc(44) Class120 local44 = this.method7009();
			if (local44.aBoolean191 && (this.aClass246_1.anInt6913 == -1 || Static51.aClass202_1.method4897(this.aClass246_1.anInt6913).aBoolean498)) {
				@Pc(75) Class108 local75 = super.anInt8538 != -1 && super.anInt8563 == 0 ? Static31.aClass345_1.method7798(super.anInt8538) : null;
				@Pc(96) Class108 local96 = super.anInt8535 == -1 || this.aBoolean602 || super.aBoolean597 && local75 != null ? null : Static31.aClass345_1.method7798(super.anInt8535);
				local98 = 0;
				if (super.anInt8553 != 0) {
					local98 = this.method6994();
				}
				@Pc(138) Class22 local138 = Static131.method1968(local96 == null ? super.anInt8536 : super.anInt8581, super.anInt8520, arg0, super.aClass22Array3[0], 240, local96 == null ? local75 : local96, super.anInt8508, 160, 1, super.anInt8562, local24, 0, local98, 0);
				if (local138 != null) {
					arg0.method7129(false);
					local138.method4689(local19, null, 0);
					arg0.method7129(true);
				}
			}
		}
		if (Static426.aClass29_Sub2_Sub1_Sub2_2 == this) {
			local19.GA(super.anInt9222, super.anInt9223, super.anInt9218);
			for (@Pc(167) int local167 = Static34.aClass129Array4.length - 1; local167 >= 0; local167--) {
				@Pc(173) Class129 local173 = Static34.aClass129Array4[local167];
				if (local173 != null && local173.anInt3179 != -1) {
					@Pc(203) int local203;
					if (local173.anInt3170 == 1) {
						@Pc(191) Class6_Sub28 local191 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local173.anInt3177);
						if (local191 != null) {
							@Pc(196) Class29_Sub2_Sub1_Sub1 local196 = local191.aClass29_Sub2_Sub1_Sub1_2;
							local203 = local196.anInt9222 - Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222;
							@Pc(210) int local210 = local196.anInt9218 - Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218;
							this.method7013(local210, local19, arg0, local173.anInt3179, local203, 92160000, super.aClass22Array3[0]);
						}
					}
					if (local173.anInt3170 == 2) {
						@Pc(237) int local237 = local173.anInt3169 + 256 - Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222;
						local98 = local173.anInt3176 + 256 - Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218;
						local203 = local173.anInt3173 << 9;
						local203 *= local203;
						this.method7013(local98, local19, arg0, local173.anInt3179, local237, local203, super.aClass22Array3[0]);
					}
					if (local173.anInt3170 == 10 && local173.anInt3177 >= 0 && local173.anInt3177 < Static346.aClass29_Sub2_Sub1_Sub2Array1.length) {
						@Pc(293) Class29_Sub2_Sub1_Sub2 local293 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local173.anInt3177];
						if (local293 != null) {
							local98 = local293.anInt9222 - Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222;
							local203 = local293.anInt9218 - Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218;
							this.method7013(local203, local19, arg0, local173.anInt3179, local98, 92160000, super.aClass22Array3[0]);
						}
					}
				}
			}
			local19.a(local24);
			local19.G(super.anInt9222, super.anInt9223, super.anInt9218);
		}
		local19.a(local24);
		local19.G(super.anInt9222, super.anInt9223 - 5, super.anInt9218);
		@Pc(359) Class102_Sub2 local359 = Static228.method3369(super.aClass22Array3.length);
		this.method7004(super.aClass22Array3, false, local19, arg0);
		if (super.aClass102_Sub6_8 == null) {
			arg0.method7136(super.aClass22Array3, local19, local359.aClass102_Sub5Array1, Static426.aClass29_Sub2_Sub1_Sub2_2 == this ? 1 : 0);
		} else {
			@Pc(374) Class222 local374 = super.aClass102_Sub6_8.method6847();
			arg0.method7151(super.aClass22Array3, local374, local19, local359.aClass102_Sub5Array1, Static426.aClass29_Sub2_Sub1_Sub2_2 == this ? 1 : 0);
		}
		super.aClass22Array3[0] = super.aClass22Array3[1] = super.aClass22Array3[2] = super.aClass22Array3[3] = null;
		super.anInt8573 = Static43.anInt710;
		return local359;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!dga;)V")
	public void method7020(@OriginalArg(1) Class6_Sub14 arg0) {
		arg0.anInt7244 = 0;
		@Pc(12) int local12 = arg0.method6041();
		this.aByte100 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean604;
		this.aBoolean604 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method7008();
		this.method7005((local12 >> 3 & 0x7) + 1);
		this.aByte102 = (byte) (local12 >> 6 & 0x3);
		super.anInt9222 += this.method7008() - local45 << 8;
		super.anInt9218 += this.method7008() - local45 << 8;
		this.aByte101 = arg0.method6034();
		this.anInt8622 = arg0.method6034();
		this.anInt8594 = arg0.method6034();
		@Pc(105) int local105 = -1;
		this.anInt8595 = 0;
		@Pc(111) int[] local111 = new int[12];
		@Pc(131) int local131;
		@Pc(137) int local137;
		@Pc(176) int local176;
		for (@Pc(113) int local113 = 0; local113 < 12; local113++) {
			@Pc(119) int local119 = arg0.method6041();
			if (local119 == 0) {
				local111[local113] = 0;
			} else {
				local131 = arg0.method6041();
				local137 = local131 + (local119 << 8);
				if (local113 == 0 && local137 == 65535) {
					local105 = arg0.method6006();
					this.anInt8595 = arg0.method6041();
					break;
				}
				if (local137 >= 32768) {
					local137 = Static517.anIntArray634[local137 - 32768];
					local111[local113] = local137 | 0x40000000;
					local176 = Static295.aClass256_2.method5924(local137).anInt2643;
					if (local176 != 0) {
						this.anInt8595 = local176;
					}
				} else {
					local111[local113] = local137 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(198) int[] local198 = new int[5];
		for (local131 = 0; local131 < 5; local131++) {
			local137 = arg0.method6041();
			if (local137 < 0 || Static33.aShortArrayArray2[local131].length <= local137) {
				local137 = 0;
			}
			local198[local131] = local137;
		}
		this.anInt8590 = arg0.method6006();
		this.aString107 = arg0.method5991();
		this.aString108 = this.aString107;
		this.anInt8623 = arg0.method6041();
		if (local41) {
			this.anInt8602 = arg0.method6006();
			this.anInt8604 = this.anInt8623;
			this.anInt8614 = -1;
			if (this.anInt8602 == 65535) {
				this.anInt8602 = -1;
			}
		} else {
			this.anInt8602 = 0;
			this.anInt8604 = arg0.method6041();
			this.anInt8614 = arg0.method6041();
			if (this.anInt8614 == 255) {
				this.anInt8614 = -1;
			}
		}
		local137 = this.anInt8619;
		this.anInt8619 = arg0.method6041();
		@Pc(327) int local327;
		if (this.anInt8619 == 0) {
			Static534.method7435(this);
		} else {
			local176 = this.anInt8599;
			@Pc(324) int local324 = this.anInt8611;
			local327 = this.anInt8613;
			@Pc(330) int local330 = this.anInt8610;
			@Pc(333) int local333 = this.anInt8618;
			this.anInt8599 = arg0.method6006();
			this.anInt8611 = arg0.method6006();
			this.anInt8613 = arg0.method6006();
			this.anInt8610 = arg0.method6006();
			this.anInt8618 = arg0.method6041();
			if (this.aBoolean604 != local21 || this.anInt8619 != local137 || local176 != this.anInt8599 || this.anInt8611 != local324 || local327 != this.anInt8613 || this.anInt8610 != local330 || this.anInt8618 != local333) {
				Static534.method7434(this);
			}
		}
		if (this.aClass246_1 == null) {
			this.aClass246_1 = new Class246();
		}
		local176 = this.aClass246_1.anInt6913;
		@Pc(430) int[] local430 = this.aClass246_1.anIntArray563;
		this.aClass246_1.method5778(this.method6995(), local105, local111, this.aByte100 == 1, local198);
		if (local176 != local105) {
			super.anInt9222 = (super.anIntArray661[0] << 9) + (this.method7008() << 8);
			super.anInt9218 = (super.anIntArray660[0] << 9) + (this.method7008() << 8);
		}
		if (Static44.anInt711 == super.anInt8541 && local430 != null) {
			for (local327 = 0; local327 < local198.length; local327++) {
				if (local198[local327] != local430[local327]) {
					Static295.aClass256_2.method5926();
					break;
				}
			}
		}
		if (super.aClass102_Sub6_8 != null) {
			super.aClass102_Sub6_8.method6836();
		}
		if (super.anInt8535 == -1 || !super.aBoolean597) {
			return;
		}
		@Pc(537) Class120 local537 = this.method7009();
		if (!local537.method2395(super.anInt8535)) {
			super.anInt8535 = -1;
			super.aBoolean597 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	@Override
	public void method7537() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "(I)I")
	@Override
	public int method7008() {
		return this.aClass246_1 == null || this.aClass246_1.anInt6913 == -1 ? super.method7008() : Static51.aClass202_1.method4897(this.aClass246_1.anInt6913).anInt7167;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
		if (this.aClass246_1 == null || !super.aBoolean600 && !this.method7015(arg0, 0)) {
			return;
		}
		@Pc(20) Class34 local20 = arg0.method7096();
		local20.a(super.aClass293_7.method6528());
		local20.G(super.anInt9222, super.anInt9223 - 5, super.anInt9218);
		this.method7004(super.aClass22Array3, super.aBoolean600, local20, arg0);
		super.aClass22Array3[0] = super.aClass22Array3[1] = super.aClass22Array3[2] = super.aClass22Array3[3] = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)I")
	@Override
	public int method7001() {
		return -1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BIBI)V")
	public void method7023(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt8538 != -1 && Static31.aClass345_1.method7798(super.anInt8538).anInt2594 == 1) {
			super.anInt8538 = -1;
		}
		if (super.anInt8525 != -1) {
			@Pc(28) Class237 local28 = Static448.aClass117_2.method2317(super.anInt8525);
			if (local28.aBoolean443 && local28.anInt6458 != -1 && Static31.aClass345_1.method7798(local28.anInt6458).anInt2594 == 1) {
				super.anInt8525 = -1;
			}
		}
		if (super.anInt8534 != -1) {
			@Pc(64) Class237 local64 = Static448.aClass117_2.method2317(super.anInt8534);
			if (local64.aBoolean443 && local64.anInt6458 != -1 && Static31.aClass345_1.method7798(local64.anInt6458).anInt2594 == 1) {
				super.anInt8534 = -1;
			}
		}
		this.anInt8601 = -1;
		if (arg1 < 0 || arg1 >= Static301.anInt4912 || arg2 < 0 || arg2 >= Static473.anInt7969) {
			this.method7024(arg1, arg2);
		} else if (super.anIntArray661[0] >= 0 && Static301.anInt4912 > super.anIntArray661[0] && super.anIntArray660[0] >= 0 && super.anIntArray660[0] < Static473.anInt7969) {
			if (arg0 == 2) {
				Static102.method1657(arg1, arg2, this);
			}
			this.method7011(arg0, arg1, arg2);
		} else {
			this.method7024(arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)V")
	public void method7024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anIntArray661[0] = arg0;
		super.anInt8583 = 0;
		super.anInt8584 = 0;
		super.anInt8582 = 0;
		super.anIntArray660[0] = arg1;
		@Pc(26) int local26 = this.method7008();
		super.anInt9222 = local26 * 256 + super.anIntArray661[0] * 512;
		super.anInt9218 = super.anIntArray660[0] * 512 + local26 * 256;
		if (Static426.aClass29_Sub2_Sub1_Sub2_2 == this) {
			Static528.method7588();
		}
		if (super.aClass102_Sub6_8 != null) {
			super.aClass102_Sub6_8.method6836();
		}
	}
}
