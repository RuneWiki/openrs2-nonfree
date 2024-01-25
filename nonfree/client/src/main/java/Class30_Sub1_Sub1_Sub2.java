import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class30_Sub1_Sub1_Sub2 extends Class30_Sub1_Sub1 {

	@OriginalMember(owner = "client!hh", name = "Bc", descriptor = "Lclient!hg;")
	public Class130 aClass130_1;

	@OriginalMember(owner = "client!hh", name = "Fc", descriptor = "I")
	public int anInt4210 = -1;

	@OriginalMember(owner = "client!hh", name = "Rc", descriptor = "I")
	public int anInt4222 = -1;

	static {
		new Class88("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	@Override
	public Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0) {
		if (this.aClass130_1 == null || !this.method3605(arg0, 2048)) {
			return null;
		}
		@Pc(17) Class91 local17 = arg0.method5847();
		@Pc(22) int local22 = super.aClass221_7.method5389();
		local17.ma(local22);
		local17.TA(super.anInt9418, super.anInt9422, super.anInt9416);
		@Pc(37) Class166 local37 = this.method3602();
		@Pc(50) Class130 local50 = this.aClass130_1.anIntArray308 == null ? this.aClass130_1 : this.aClass130_1.method3570(Static393.aClass31_1);
		if (Static208.aClass12_Sub10_Sub1_1.aBoolean182 && local50.aBoolean326 && local37.aBoolean390) {
			@Pc(74) Class64 local74 = super.anInt4138 != -1 && super.anInt4178 == 0 ? Static47.aClass41_1.method911(super.anInt4138) : null;
			@Pc(91) Class64 local91 = super.anInt4155 == -1 || super.aBoolean335 && local74 != null ? null : Static47.aClass41_1.method911(super.anInt4155);
			@Pc(93) int local93 = 0;
			if (super.anInt4146 != 0) {
				local93 = this.method3593();
			}
			@Pc(151) Class26 local151 = Static226.method4098(this.aClass130_1.aByte50 & 0xFF, this.aClass130_1.aShort57 & 0xFFFF, local91 == null ? super.anInt4142 : super.anInt4187, super.aClass26Array3[0], local22, local93, this.aClass130_1.aByte48 & 0xFF, super.anInt4192, arg0, super.anInt4179, super.anInt4166, this.aClass130_1.anInt4113, local91 == null ? local74 : local91, this.aClass130_1.aShort58 & 0xFFFF);
			if (local151 != null) {
				@Pc(156) float local156 = arg0.P();
				@Pc(159) float local159 = arg0.ra();
				arg0.method5822(false);
				arg0.la(local156, local159 - 150.0F);
				local151.method8003(local17, null, 0);
				arg0.la(local156, local159);
				arg0.method5822(true);
			}
		}
		@Pc(182) Class7_Sub8 local182 = null;
		if (this.method3608()) {
			local182 = Static196.method3703(super.aClass26Array3.length);
		}
		if (super.aClass7_Sub3_3 == null) {
			arg0.method5860(super.aClass26Array3, local17, local182 == null ? null : local182.aClass7_Sub4Array1, 0);
		} else {
			@Pc(213) Class136 local213 = super.aClass7_Sub3_3.method4202();
			arg0.method5809(super.aClass26Array3, local213, local17, local182 == null ? null : local182.aClass7_Sub4Array1, 0);
		}
		this.method3592(false, arg0, super.aClass26Array3);
		super.aClass26Array3[0] = super.aClass26Array3[1] = super.aClass26Array3[2] = super.aClass26Array3[3] = null;
		super.anInt4158 = Static491.anInt8889;
		return local182;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIIIII)V")
	public void method3604(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte99 = (byte) arg3;
		if (super.anInt4138 != -1 && Static47.aClass41_1.method911(super.anInt4138).anInt1975 == 1) {
			super.anInt4138 = -1;
		}
		@Pc(37) Class50 local37;
		if (super.anInt4157 != -1) {
			local37 = Static82.aClass212_2.method5063(super.anInt4157);
			if (local37.aBoolean101 && local37.anInt1432 != -1 && Static47.aClass41_1.method911(local37.anInt1432).anInt1975 == 1) {
				super.anInt4157 = -1;
			}
		}
		if (super.anInt4126 != -1) {
			local37 = Static82.aClass212_2.method5063(super.anInt4126);
			if (local37.aBoolean101 && local37.anInt1432 != -1 && Static47.aClass41_1.method911(local37.anInt1432).anInt1975 == 1) {
				super.anInt4126 = -1;
			}
		}
		if (!arg0) {
			@Pc(95) int local95 = arg1 - super.anIntArray316[0];
			@Pc(102) int local102 = arg2 - super.anIntArray317[0];
			if (local95 >= -8 && local95 <= 8 && local102 >= -8 && local102 <= 8) {
				if (super.anInt4201 < 9) {
					super.anInt4201++;
				}
				for (@Pc(131) int local131 = super.anInt4201; local131 > 0; local131--) {
					super.anIntArray316[local131] = super.anIntArray316[local131 - 1];
					super.anIntArray317[local131] = super.anIntArray317[local131 - 1];
					super.aByteArray49[local131] = super.aByteArray49[local131 - 1];
				}
				super.anIntArray316[0] = arg1;
				super.anIntArray317[0] = arg2;
				super.aByteArray49[0] = 1;
				return;
			}
		}
		super.anInt4203 = 0;
		super.anIntArray316[0] = arg1;
		super.anInt4202 = 0;
		super.anInt4201 = 0;
		super.anIntArray317[0] = arg2;
		super.anInt9416 = (super.anIntArray317[0] << 7) + (arg4 << 6);
		super.anInt9418 = (super.anIntArray316[0] << 7) + (arg4 << 6);
		if (super.aClass7_Sub3_3 != null) {
			super.aClass7_Sub3_3.method4190();
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)I")
	@Override
	protected int method3600() {
		if (this.aClass130_1.anIntArray308 != null) {
			@Pc(18) Class130 local18 = this.aClass130_1.method3570(Static393.aClass31_1);
			if (local18 != null && local18.anInt4086 != -1) {
				return local18.anInt4086;
			}
		}
		return this.aClass130_1.anInt4086;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass130_1 == null || !this.method3605(arg0, 131072)) {
			return false;
		}
		@Pc(19) Class91 local19 = arg0.method5847();
		@Pc(24) int local24 = super.aClass221_7.method5389();
		local19.ma(local24);
		local19.TA(super.anInt9418, super.anInt9422, super.anInt9416);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass26Array3.length; local39++) {
			if (super.aClass26Array3[local39] != null && super.aClass26Array3[local39].method8005(arg1, arg2, local19, this.aClass130_1.anInt4113 == 1)) {
				local37 = true;
				break;
			}
		}
		super.aClass26Array3[0] = super.aClass26Array3[1] = super.aClass26Array3[2] = super.aClass26Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)I")
	@Override
	public int method7815() {
		return super.anInt4190;
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!qa;II)Z")
	private boolean method3605(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class166 local11 = this.method3602();
		@Pc(26) Class64 local26 = super.anInt4138 != -1 && super.anInt4178 == 0 ? Static47.aClass41_1.method911(super.anInt4138) : null;
		@Pc(43) Class64 local43 = super.anInt4155 == -1 || super.aBoolean335 && local26 != null ? null : Static47.aClass41_1.method911(super.anInt4155);
		@Pc(46) int local46 = local11.anInt4977;
		@Pc(49) int local49 = local11.anInt4988;
		if (local46 != 0 || local49 != 0 || local11.anInt4955 != 0 || local11.anInt4995 != 0) {
			arg1 |= 0x7;
		}
		@Pc(90) boolean local90 = super.aByte57 != 0 && Static409.anInt7683 >= super.anInt4139 && super.anInt4198 > Static409.anInt7683;
		if (local90) {
			arg1 |= 0x80000;
		}
		@Pc(127) Class26 local127 = super.aClass26Array3[0] = this.aClass130_1.method3565(arg0, super.anInt4142, super.anInt4187, local43, Static47.aClass41_1, super.anInt4188, super.anInt4124, local26, Static218.aClass160_1, super.anInt4168, super.anInt4164, super.aClass288Array3, arg1, Static393.aClass31_1);
		if (local127 == null) {
			return false;
		}
		super.anInt4190 = local127.TA();
		this.method3596(local127);
		@Pc(144) int local144 = super.aClass221_7.method5389();
		if (local46 == 0 && local49 == 0) {
			this.method3598(this.method3591() << 7, 0, local144, 0, this.method3591() << 7);
		} else {
			this.method3598(local49, local11.anInt4960, local144, local11.anInt4980, local46);
			if (super.anInt4192 != 0) {
				super.aClass26Array3[0].D(super.anInt4192);
			}
			if (super.anInt4179 != 0) {
				super.aClass26Array3[0].b(super.anInt4179);
			}
			if (super.anInt4166 != 0) {
				super.aClass26Array3[0].ca(0, super.anInt4166, 0);
			}
		}
		if (local90) {
			local127.method7995(super.aByte60, super.aByte59, super.aByte58, super.aByte57 & 0xFF);
		}
		@Pc(247) Class50 local247;
		@Pc(259) boolean local259;
		@Pc(261) int local261;
		@Pc(304) Class26 local304;
		if (super.anInt4157 == -1 || super.anInt4145 == -1) {
			super.aClass26Array3[1] = null;
		} else {
			local247 = Static82.aClass212_2.method5063(super.anInt4157);
			local259 = local247.aByte29 == 3 && (local46 != 0 || local49 != 0);
			local261 = local7;
			if (local259) {
				local261 = local7 | 0x7;
			} else {
				if (super.anInt4195 != 0) {
					local261 = local7 | 0x5;
				}
				if (super.anInt4184 != 0) {
					local261 |= 0x2;
				}
			}
			local304 = super.aClass26Array3[1] = local247.method1440(super.anInt4130, local261, super.anInt4145, Static47.aClass41_1, arg0, super.anInt4191);
			if (local304 != null) {
				if (super.anInt4184 != 0) {
					local304.ca(0, -super.anInt4184 << 0, 0);
				}
				if (super.anInt4195 != 0) {
					local304.OA(super.anInt4195 * 2048);
				}
				if (local259) {
					if (super.anInt4192 != 0) {
						local304.D(super.anInt4192);
					}
					if (super.anInt4179 != 0) {
						local304.b(super.anInt4179);
					}
					if (super.anInt4166 != 0) {
						local304.ca(0, super.anInt4166, 0);
					}
				}
			}
		}
		if (super.anInt4126 == -1 || super.anInt4140 == -1) {
			super.aClass26Array3[3] = null;
		} else {
			local247 = Static82.aClass212_2.method5063(super.anInt4126);
			local259 = local247.aByte29 == 3 && (local46 != 0 || local49 != 0);
			local261 = local7;
			if (local259) {
				local261 = local7 | 0x7;
			} else {
				if (super.anInt4136 != 0) {
					local261 = local7 | 0x5;
				}
				if (super.anInt4185 != 0) {
					local261 |= 0x2;
				}
			}
			local304 = super.aClass26Array3[3] = local247.method1439(super.anInt4140, arg0, local261, super.anInt4183, Static47.aClass41_1, super.anInt4134);
			if (local304 != null) {
				if (super.anInt4185 != 0) {
					local304.ca(0, -super.anInt4185 << 0, 0);
				}
				if (super.anInt4136 != 0) {
					local304.OA(super.anInt4136 * 2048);
				}
				if (local259) {
					if (super.anInt4192 != 0) {
						local304.D(super.anInt4192);
					}
					if (super.anInt4179 != 0) {
						local304.b(super.anInt4179);
					}
					if (super.anInt4166 != 0) {
						local304.ca(0, super.anInt4166, 0);
					}
				}
			}
		}
		super.aClass26Array3[2] = null;
		if (super.aClass12_Sub26_3 != null) {
			if (super.aClass12_Sub26_3.anInt4801 <= Static409.anInt7683) {
				super.aClass12_Sub26_3 = null;
			} else if (super.aClass12_Sub26_3.anInt4794 <= Static409.anInt7683) {
				@Pc(529) Class26 local529 = super.aClass12_Sub26_3.method4059(arg0, local7 | 0x7);
				if (local529 != null) {
					local529.ca(super.aClass12_Sub26_3.anInt4802 - super.anInt9418, super.aClass12_Sub26_3.anInt4799 - super.anInt9422, super.aClass12_Sub26_3.anInt4796 - super.anInt9416);
					if (local144 != 0) {
						local529.OA(local144);
					}
					super.aClass26Array3[2] = local529;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "(I)Z")
	public boolean method3606() {
		return this.aClass130_1 != null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7903(@OriginalArg(0) Class42 arg0) {
		if (this.aClass130_1 != null && (super.aBoolean337 || this.method3605(arg0, 0))) {
			this.method3592(super.aBoolean337, arg0, super.aClass26Array3);
			super.aClass26Array3[0] = super.aClass26Array3[1] = super.aClass26Array3[2] = super.aClass26Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "(I)I")
	@Override
	public int method3597() {
		if (this.aClass130_1.anIntArray308 != null) {
			@Pc(23) Class130 local23 = this.aClass130_1.method3570(Static393.aClass31_1);
			if (local23 != null && local23.anInt4082 != -1) {
				return local23.anInt4082;
			}
		}
		return this.aClass130_1.anInt4082 == -1 ? super.method3597() : this.aClass130_1.anInt4082;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	@Override
	public Class218 method7906(@OriginalArg(1) Class42 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BII)V")
	public void method3607(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray316[0];
		@Pc(15) int local15 = super.anIntArray317[0];
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
			local15--;
			local10++;
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
		if (super.anInt4138 != -1 && Static47.aClass41_1.method911(super.anInt4138).anInt1975 == 1) {
			super.anInt4138 = -1;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		@Pc(91) Class50 local91;
		if (super.anInt4157 != -1) {
			local91 = Static82.aClass212_2.method5063(super.anInt4157);
			if (local91.aBoolean101 && local91.anInt1432 != -1 && Static47.aClass41_1.method911(local91.anInt1432).anInt1975 == 1) {
				super.anInt4157 = -1;
			}
		}
		if (super.anInt4126 != -1) {
			local91 = Static82.aClass212_2.method5063(super.anInt4126);
			if (local91.aBoolean101 && local91.anInt1432 != -1 && Static47.aClass41_1.method911(local91.anInt1432).anInt1975 == 1) {
				super.anInt4126 = -1;
			}
		}
		if (super.anInt4201 < 9) {
			super.anInt4201++;
		}
		for (@Pc(153) int local153 = super.anInt4201; local153 > 0; local153--) {
			super.anIntArray316[local153] = super.anIntArray316[local153 - 1];
			super.anIntArray317[local153] = super.anIntArray317[local153 - 1];
			super.aByteArray49[local153] = super.aByteArray49[local153 - 1];
		}
		super.anIntArray316[0] = local10;
		super.aByteArray49[0] = (byte) arg0;
		super.anIntArray317[0] = local15;
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
	@Override
	public void method7909() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(B)Z")
	private boolean method3608() {
		return this.aClass130_1.aBoolean327;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)I")
	@Override
	public int method3590() {
		if (this.aClass130_1.anIntArray308 != null) {
			@Pc(20) Class130 local20 = this.aClass130_1.method3570(Static393.aClass31_1);
			if (local20 != null && local20.anInt4091 != -1) {
				return local20.anInt4091;
			}
		}
		return this.aClass130_1.anInt4091;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZIILclient!jt;ILclient!qa;)V")
	@Override
	public void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!hg;Z)V")
	public void method3609(@OriginalArg(0) Class130 arg0) {
		this.aClass130_1 = arg0;
		if (super.aClass7_Sub3_3 != null) {
			super.aClass7_Sub3_3.method4190();
		}
	}
}
