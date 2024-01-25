import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class16_Sub1_Sub5_Sub2 extends Class16_Sub1_Sub5 {

	@OriginalMember(owner = "client!rs", name = "Pc", descriptor = "Lclient!wh;")
	public Class264 aClass264_1;

	@OriginalMember(owner = "client!rs", name = "vc", descriptor = "I")
	public int anInt6089 = -1;

	@OriginalMember(owner = "client!rs", name = "Cc", descriptor = "I")
	public int anInt6095 = -1;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)I")
	@Override
	protected int method4749() {
		if (this.aClass264_1.anIntArray544 != null) {
			@Pc(20) Class264 local20 = this.aClass264_1.method5574(Static257.aClass114_1);
			if (local20 != null && local20.anInt7241 != -1) {
				return local20.anInt7241;
			}
		}
		return this.aClass264_1.anInt7241;
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5338() {
		return false;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IILclient!fi;BZLclient!ya;I)V")
	@Override
	public void method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIZI)V")
	public void method4760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte82 = (byte) arg0;
		if (super.anInt6021 != -1 && Static182.aClass55_1.method1397(super.anInt6021).anInt4410 == 1) {
			super.anInt6021 = -1;
		}
		@Pc(37) Class161 local37;
		if (super.anInt6029 != -1) {
			local37 = Static352.aClass194_2.method4421(super.anInt6029);
			if (local37.aBoolean459 && local37.anInt5002 != -1 && Static182.aClass55_1.method1397(local37.anInt5002).anInt4410 == 1) {
				super.anInt6029 = -1;
			}
		}
		if (super.anInt6045 != -1) {
			local37 = Static352.aClass194_2.method4421(super.anInt6045);
			if (local37.aBoolean459 && local37.anInt5002 != -1 && Static182.aClass55_1.method1397(local37.anInt5002).anInt4410 == 1) {
				super.anInt6045 = -1;
			}
		}
		if (!arg3) {
			@Pc(96) int local96 = arg1 - super.anIntArray426[0];
			@Pc(104) int local104 = arg4 - super.anIntArray427[0];
			if (local96 >= -8 && local96 <= 8 && local104 >= -8 && local104 <= 8) {
				if (super.anInt6086 < 9) {
					super.anInt6086++;
				}
				for (@Pc(139) int local139 = super.anInt6086; local139 > 0; local139--) {
					super.anIntArray426[local139] = super.anIntArray426[local139 - 1];
					super.anIntArray427[local139] = super.anIntArray427[local139 - 1];
					super.aByteArray84[local139] = super.aByteArray84[local139 - 1];
				}
				super.anIntArray426[0] = arg1;
				super.anIntArray427[0] = arg4;
				super.aByteArray84[0] = 1;
				return;
			}
		}
		super.anIntArray426[0] = arg1;
		super.anInt6086 = 0;
		super.anInt6085 = 0;
		super.anInt6087 = 0;
		super.anIntArray427[0] = arg4;
		super.anInt6892 = (super.anIntArray427[0] << 7) + (arg2 << 6);
		super.anInt6893 = (arg2 << 6) + (super.anIntArray426[0] << 7);
		if (super.aClass3_Sub2_7 != null) {
			super.aClass3_Sub2_7.method164();
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)I")
	@Override
	public int method4755() {
		if (this.aClass264_1.anIntArray544 != null) {
			@Pc(17) Class264 local17 = this.aClass264_1.method5574(Static257.aClass114_1);
			if (local17 != null && local17.anInt7234 != -1) {
				return local17.anInt7234;
			}
		}
		return this.aClass264_1.anInt7234 == -1 ? super.method4755() : this.aClass264_1.anInt7234;
	}

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "(I)I")
	@Override
	public int method5342() {
		return super.anInt6030;
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)V")
	@Override
	public void method5333() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(Lclient!ya;I)Lclient!fk;")
	@Override
	public Class3_Sub3 method5339(@OriginalArg(0) Class19 arg0) {
		if (this.aClass264_1 == null || !this.method4764(arg0, 2048)) {
			return null;
		}
		@Pc(22) Class31 local22 = arg0.method4289();
		@Pc(27) int local27 = super.aClass35_7.method811();
		local22.ra(local27);
		local22.o(super.anInt6893, super.anInt6889, super.anInt6892);
		@Pc(42) Class151 local42 = this.method4757();
		@Pc(55) Class264 local55 = this.aClass264_1.anIntArray544 == null ? this.aClass264_1 : this.aClass264_1.method5574(Static257.aClass114_1);
		if (Static323.aClass50_Sub1_1.aBoolean302 && local55.aBoolean684 && local42.aBoolean428) {
			@Pc(80) Class138 local80 = super.anInt6021 != -1 && super.anInt6046 == 0 ? Static182.aClass55_1.method1397(super.anInt6021) : null;
			@Pc(97) Class138 local97 = super.anInt6076 == -1 || super.aBoolean562 && local80 != null ? null : Static182.aClass55_1.method1397(super.anInt6076);
			@Pc(149) Class110 local149 = Static6.method48(super.anInt6042, super.anInt6070, super.aClass110Array3[0], this.aClass264_1.aShort102 & 0xFFFF, super.anInt6040, this.aClass264_1.aShort101 & 0xFFFF, arg0, this.aClass264_1.aByte98 & 0xFF, this.aClass264_1.anInt7201, local27, local97 == null ? super.anInt6060 : super.anInt6016, super.aBoolean560, local97 == null ? local80 : local97, this.aClass264_1.aByte100 & 0xFF);
			if (local149 != null) {
				@Pc(154) float local154 = arg0.W();
				@Pc(157) float local157 = arg0.xa();
				arg0.method4309(false);
				arg0.g(local154, local157 - 150.0F);
				local149.method4889(local22, null, 0);
				arg0.g(local154, local157);
				arg0.method4309(true);
			}
		}
		@Pc(180) Class3_Sub3 local180 = null;
		if (this.method4765()) {
			local180 = Static38.method672(super.aClass110Array3.length);
		}
		if (super.aClass3_Sub2_7 == null) {
			arg0.method4307(super.aClass110Array3, local22, local180 == null ? null : local180.aClass3_Sub5Array1, 0);
		} else {
			@Pc(211) Class146 local211 = super.aClass3_Sub2_7.method171();
			arg0.method4299(super.aClass110Array3, local211, local22, local180 == null ? null : local180.aClass3_Sub5Array1, 0);
		}
		this.method4741(false, super.aClass110Array3, arg0);
		if (super.aClass110Array3[2] != null) {
			if (local27 != 0) {
				super.aClass110Array3[2].Q(local27);
			}
			super.aClass110Array3[2].JA(super.anInt6893 - super.aClass4_Sub23_3.anInt3198, -super.aClass4_Sub23_3.anInt3188 + super.anInt6889, super.anInt6892 - super.aClass4_Sub23_3.anInt3203);
		}
		super.anInt6061 = Static361.anInt6264;
		super.aClass110Array3[0] = super.aClass110Array3[1] = super.aClass110Array3[2] = super.aClass110Array3[3] = null;
		return local180;
	}

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "(I)Z")
	public boolean method4762() {
		return this.aClass264_1 != null;
	}

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "(B)I")
	@Override
	public int method4756() {
		if (this.aClass264_1.anIntArray544 != null) {
			@Pc(18) Class264 local18 = this.aClass264_1.method5574(Static257.aClass114_1);
			if (local18 != null && local18.anInt7209 != -1) {
				return local18.anInt7209;
			}
		}
		return this.aClass264_1.anInt7209;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IILclient!ya;I)Z")
	@Override
	public boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass264_1 == null || !this.method4764(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class31 local19 = arg1.method4289();
		@Pc(24) int local24 = super.aClass35_7.method811();
		local19.ra(local24);
		local19.o(super.anInt6893, super.anInt6889, super.anInt6892);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass110Array3.length; local39++) {
			if (super.aClass110Array3[local39] != null && super.aClass110Array3[local39].method4894(arg2, arg0, local19, this.aClass264_1.anInt7201 == 1)) {
				local37 = true;
				break;
			}
		}
		super.aClass110Array3[0] = super.aClass110Array3[1] = super.aClass110Array3[2] = super.aClass110Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(III)V")
	public void method4763(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = super.anIntArray426[0];
		@Pc(23) int local23 = super.anIntArray427[0];
		if (arg0 == 0) {
			local23++;
		}
		if (arg0 == 1) {
			local18++;
			local23++;
		}
		if (arg0 == 2) {
			local18++;
		}
		if (arg0 == 3) {
			local23--;
			local18++;
		}
		if (arg0 == 4) {
			local23--;
		}
		if (arg0 == 5) {
			local23--;
			local18--;
		}
		if (arg0 == 6) {
			local18--;
		}
		if (super.anInt6021 != -1 && Static182.aClass55_1.method1397(super.anInt6021).anInt4410 == 1) {
			super.anInt6021 = -1;
		}
		if (arg0 == 7) {
			local18--;
			local23++;
		}
		@Pc(91) Class161 local91;
		if (super.anInt6029 != -1) {
			local91 = Static352.aClass194_2.method4421(super.anInt6029);
			if (local91.aBoolean459 && local91.anInt5002 != -1 && Static182.aClass55_1.method1397(local91.anInt5002).anInt4410 == 1) {
				super.anInt6029 = -1;
			}
		}
		if (super.anInt6045 != -1) {
			local91 = Static352.aClass194_2.method4421(super.anInt6045);
			if (local91.aBoolean459 && local91.anInt5002 != -1 && Static182.aClass55_1.method1397(local91.anInt5002).anInt4410 == 1) {
				super.anInt6045 = -1;
			}
		}
		if (super.anInt6086 < 9) {
			super.anInt6086++;
		}
		for (@Pc(155) int local155 = super.anInt6086; local155 > 0; local155--) {
			super.anIntArray426[local155] = super.anIntArray426[local155 - 1];
			super.anIntArray427[local155] = super.anIntArray427[local155 - 1];
			super.aByteArray84[local155] = super.aByteArray84[local155 - 1];
		}
		super.anIntArray426[0] = local18;
		super.anIntArray427[0] = local23;
		super.aByteArray84[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5335(@OriginalArg(0) Class19 arg0) {
		if (this.aClass264_1 != null && (super.aBoolean563 || this.method4764(arg0, 0))) {
			this.method4741(super.aBoolean563, super.aClass110Array3, arg0);
			super.aClass110Array3[0] = super.aClass110Array3[1] = super.aClass110Array3[2] = super.aClass110Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!ya;I)Z")
	private boolean method4764(@OriginalArg(1) Class19 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class151 local11 = this.method4757();
		@Pc(26) Class138 local26 = super.anInt6021 != -1 && super.anInt6046 == 0 ? Static182.aClass55_1.method1397(super.anInt6021) : null;
		@Pc(43) Class138 local43 = super.anInt6076 == -1 || super.aBoolean562 && local26 != null ? null : Static182.aClass55_1.method1397(super.anInt6076);
		@Pc(46) int local46 = local11.anInt4662;
		@Pc(49) int local49 = local11.anInt4670;
		if (local46 != 0 || local49 != 0 || local11.anInt4674 != 0 || local11.anInt4660 != 0) {
			arg1 |= 0x7;
		}
		@Pc(98) boolean local98 = super.aByte68 != 0 && Static24.anInt5323 >= super.anInt6020 && Static24.anInt5323 < super.anInt6068;
		if (local98) {
			arg1 |= 0x80000;
		}
		@Pc(135) Class110 local135 = super.aClass110Array3[0] = this.aClass264_1.method5575(super.anInt6065, local26, Static257.aClass114_1, super.anInt6058, arg1, super.anInt6073, super.anInt6016, arg0, super.anInt6060, super.anInt6036, super.aClass165Array3, local43, Static182.aClass55_1, Static222.aClass249_1);
		if (local135 == null) {
			return false;
		}
		super.anInt6030 = local135.MA();
		this.method4747(local135);
		@Pc(152) int local152 = super.aClass35_7.method811();
		if (local46 == 0 && local49 == 0) {
			this.method4752(this.method4751() << 7, 0, 0, local152, this.method4751() << 7);
		} else {
			this.method4752(local46, local11.anInt4671, local11.anInt4693, local152, local49);
			if (super.anInt6070 != 0) {
				super.aClass110Array3[0].Z(super.anInt6070);
			}
			if (super.anInt6042 != 0) {
				super.aClass110Array3[0].R(super.anInt6042);
			}
			if (super.anInt6040 != 0) {
				super.aClass110Array3[0].JA(0, super.anInt6040, 0);
			}
		}
		if (local98) {
			local135.method4893(super.aByte71, super.aByte69, super.aByte70, super.aByte68 & 0xFF);
		}
		@Pc(267) Class161 local267;
		@Pc(282) boolean local282;
		@Pc(284) int local284;
		@Pc(324) Class110 local324;
		if (super.anInt6029 == -1 || super.anInt6027 == -1) {
			super.aClass110Array3[1] = null;
		} else {
			local267 = Static352.aClass194_2.method4421(super.anInt6029);
			local282 = local267.aByte47 == 3 && (local46 != 0 || local49 != 0);
			local284 = local7;
			if (local282) {
				local284 = local7 | 0x7;
			} else {
				if (super.anInt6017 != 0) {
					local284 = local7 | 0x5;
				}
				if (super.anInt6014 != 0) {
					local284 |= 0x2;
				}
			}
			local324 = super.aClass110Array3[1] = local267.method3830(super.anInt6027, super.anInt6033, Static182.aClass55_1, super.anInt6083, local284, arg0);
			if (local324 != null) {
				if (super.anInt6014 != 0) {
					local324.JA(0, -super.anInt6014 << 0, 0);
				}
				if (super.anInt6017 != 0) {
					local324.Q(super.anInt6017 * 2048);
				}
				if (local282) {
					if (super.anInt6070 != 0) {
						local324.Z(super.anInt6070);
					}
					if (super.anInt6042 != 0) {
						local324.R(super.anInt6042);
					}
					if (super.anInt6040 != 0) {
						local324.JA(0, super.anInt6040, 0);
					}
				}
			}
		}
		if (super.anInt6045 == -1 || super.anInt6022 == -1) {
			super.aClass110Array3[3] = null;
		} else {
			local267 = Static352.aClass194_2.method4421(super.anInt6045);
			local282 = local267.aByte47 == 3 && (local46 != 0 || local49 != 0);
			local284 = local7;
			if (local282) {
				local284 = local7 | 0x7;
			} else {
				if (super.anInt6056 != 0) {
					local284 = local7 | 0x5;
				}
				if (super.anInt6053 != 0) {
					local284 |= 0x2;
				}
			}
			local324 = super.aClass110Array3[3] = local267.method3837(arg0, super.anInt6062, Static182.aClass55_1, super.anInt6022, local284, super.anInt6069);
			if (local324 != null) {
				if (super.anInt6053 != 0) {
					local324.JA(0, -super.anInt6053 << 0, 0);
				}
				if (super.anInt6056 != 0) {
					local324.Q(super.anInt6056 * 2048);
				}
				if (local282) {
					if (super.anInt6070 != 0) {
						local324.Z(super.anInt6070);
					}
					if (super.anInt6042 != 0) {
						local324.R(super.anInt6042);
					}
					if (super.anInt6040 != 0) {
						local324.JA(0, super.anInt6040, 0);
					}
				}
			}
		}
		super.aClass110Array3[2] = null;
		if (super.aClass4_Sub23_3 != null) {
			if (super.aClass4_Sub23_3.anInt3202 <= Static24.anInt5323) {
				super.aClass4_Sub23_3 = null;
			} else if (super.aClass4_Sub23_3.anInt3191 <= Static24.anInt5323) {
				@Pc(564) Class110 local564 = super.aClass4_Sub23_3.method2719(arg0, local7 | 0x7);
				if (local564 != null) {
					local564.JA(-super.anInt6893 + super.aClass4_Sub23_3.anInt3198, super.aClass4_Sub23_3.anInt3188 + -super.anInt6889, super.aClass4_Sub23_3.anInt3203 - super.anInt6892);
					if (local152 != 0) {
						local564.Q(local152);
					}
					super.aClass110Array3[2] = local564;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "(I)Z")
	private boolean method4765() {
		return this.aClass264_1.aBoolean682;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLclient!wh;)V")
	public void method4766(@OriginalArg(1) Class264 arg0) {
		this.aClass264_1 = arg0;
		if (super.aClass3_Sub2_7 != null) {
			super.aClass3_Sub2_7.method164();
		}
	}
}
