import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4_Sub1_Sub1_Sub1 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!ac", name = "Gc", descriptor = "Lclient!ql;")
	public Class273 aClass273_1;

	@OriginalMember(owner = "client!ac", name = "Ec", descriptor = "I")
	public int anInt227 = -1;

	@OriginalMember(owner = "client!ac", name = "Jc", descriptor = "I")
	public int anInt231 = -1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!ql;)V")
	public void method152(@OriginalArg(1) Class273 arg0) {
		this.aClass273_1 = arg0;
		if (super.aClass98_Sub3_4 != null) {
			super.aClass98_Sub3_4.method4540();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		if (this.aClass273_1 == null || !this.method157(arg0, 2048)) {
			return null;
		}
		@Pc(17) Class54 local17 = arg0.method6851();
		@Pc(30) int local30 = super.aClass354_7.method7776();
		local17.a(local30);
		local17.G(super.anInt9542, super.anInt9541 - 20, super.anInt9540);
		@Pc(47) Class118 local47 = this.method5891();
		@Pc(60) Class273 local60 = this.aClass273_1.anIntArray537 == null ? this.aClass273_1 : this.aClass273_1.method6159(Static498.aClass101_1);
		if (Static140.aClass6_Sub48_Sub1_1.aBoolean685 && local60.aBoolean519 && local47.aBoolean250) {
			@Pc(84) Class57 local84 = super.anInt7085 != -1 && super.anInt7107 == 0 ? Static78.aClass298_2.method6521(super.anInt7085) : null;
			@Pc(102) Class57 local102 = super.anInt7100 == -1 || super.aBoolean495 && local84 != null ? null : Static78.aClass298_2.method6521(super.anInt7100);
			@Pc(104) int local104 = 0;
			if (super.anInt7074 != 0) {
				local104 = this.method5900();
			}
			@Pc(162) Class20 local162 = Static255.method4297(this.aClass273_1.anInt7439, this.aClass273_1.aShort95 & 0xFFFF, this.aClass273_1.aByte72 & 0xFF, this.aClass273_1.aShort96 & 0xFFFF, super.anInt7099, arg0, super.anInt7108, super.aClass20Array3[0], super.anInt7102, local102 == null ? super.anInt7112 : super.anInt7120, local104, local30, this.aClass273_1.aByte75 & 0xFF, local102 == null ? local84 : local102);
			if (local162 != null) {
				arg0.method6880(false);
				local162.method7256(local17, null, 0);
				arg0.method6880(true);
			}
		}
		local17.a(local30);
		local17.G(super.anInt9542, super.anInt9541 - 5, super.anInt9540);
		@Pc(190) Class98_Sub8 local190 = null;
		if (this.method158()) {
			local190 = Static348.method5326(super.aClass20Array3.length);
		}
		this.method5896(arg0, false, super.aClass20Array3, local17);
		if (super.aClass98_Sub3_4 == null) {
			arg0.method6885(super.aClass20Array3, local17, local190 == null ? null : local190.aClass98_Sub5Array1, 0);
		} else {
			@Pc(229) Class144 local229 = super.aClass98_Sub3_4.method4532();
			arg0.method6872(super.aClass20Array3, local229, local17, local190 == null ? null : local190.aClass98_Sub5Array1, 0);
		}
		super.aClass20Array3[0] = super.aClass20Array3[1] = super.aClass20Array3[2] = super.aClass20Array3[3] = null;
		super.anInt7066 = Static534.anInt8855;
		return local190;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)I")
	@Override
	public int method5899() {
		if (this.aClass273_1.anIntArray537 != null) {
			@Pc(13) Class273 local13 = this.aClass273_1.method6159(Static498.aClass101_1);
			if (local13 != null && local13.anInt7436 != -1) {
				return local13.anInt7436;
			}
		}
		return this.aClass273_1.anInt7436;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass273_1 == null || !this.method157(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class54 local19 = arg1.method6851();
		@Pc(32) int local32 = super.aClass354_7.method7776();
		local19.a(local32);
		local19.G(super.anInt9542, super.anInt9541, super.anInt9540);
		@Pc(45) boolean local45 = false;
		for (@Pc(47) int local47 = 0; super.aClass20Array3.length > local47; local47++) {
			if (super.aClass20Array3[local47] != null) {
				@Pc(79) boolean local79 = this.aClass273_1.anInt7442 == -1 ? this.aClass273_1.anInt7439 == 1 : this.aClass273_1.anInt7442 == 1;
				@Pc(89) boolean local89 = super.aClass20Array3[local47].method7266(arg2, arg0, local19, local79);
				if (local89) {
					local45 = true;
					break;
				}
			}
		}
		super.aClass20Array3[0] = super.aClass20Array3[1] = super.aClass20Array3[2] = super.aClass20Array3[3] = null;
		return local45;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)I")
	@Override
	public int method5894() {
		if (this.aClass273_1.anIntArray537 != null) {
			@Pc(19) Class273 local19 = this.aClass273_1.method6159(Static498.aClass101_1);
			if (local19 != null && local19.anInt7459 != -1) {
				return local19.anInt7459;
			}
		}
		return this.aClass273_1.anInt7459 == -1 ? super.method5894() : this.aClass273_1.anInt7459;
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)I")
	@Override
	public int method7790() {
		return super.anInt7093;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIZI)V")
	public void method154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte108 = (byte) arg1;
		if (super.anInt7085 != -1 && Static78.aClass298_2.method6521(super.anInt7085).anInt1541 == 1) {
			super.anIntArray519 = null;
			super.anInt7085 = -1;
		}
		if (super.anInt7069 != -1) {
			@Pc(37) Class10 local37 = Static289.aClass66_7.method1652(super.anInt7069);
			if (local37.aBoolean21 && local37.anInt334 != -1 && Static78.aClass298_2.method6521(local37.anInt334).anInt1541 == 1) {
				super.anInt7069 = -1;
			}
		}
		if (super.anInt7124 != -1) {
			@Pc(77) Class10 local77 = Static289.aClass66_7.method1652(super.anInt7124);
			if (local77.aBoolean21 && local77.anInt334 != -1 && Static78.aClass298_2.method6521(local77.anInt334).anInt1541 == 1) {
				super.anInt7124 = -1;
			}
		}
		if (!arg3) {
			@Pc(107) int local107 = arg2 - super.anIntArray521[0];
			@Pc(115) int local115 = arg0 - super.anIntArray522[0];
			if (local107 >= -8 && local107 <= 8 && local115 >= -8 && local115 <= 8) {
				if (super.anInt7132 < 9) {
					super.anInt7132++;
				}
				for (@Pc(142) int local142 = super.anInt7132; local142 > 0; local142--) {
					super.anIntArray521[local142] = super.anIntArray521[local142 - 1];
					super.anIntArray522[local142] = super.anIntArray522[local142 - 1];
					super.aByteArray90[local142] = super.aByteArray90[local142 - 1];
				}
				super.anIntArray521[0] = arg2;
				super.aByteArray90[0] = 1;
				super.anIntArray522[0] = arg0;
				return;
			}
		}
		super.anInt7132 = 0;
		super.anInt7134 = 0;
		super.anInt7133 = 0;
		super.anIntArray521[0] = arg2;
		super.anIntArray522[0] = arg0;
		super.anInt9540 = (super.anIntArray522[0] << 9) + (arg4 << 8);
		super.anInt9542 = (arg4 << 8) + (super.anIntArray521[0] << 9);
		if (super.aClass98_Sub3_4 != null) {
			super.aClass98_Sub3_4.method4540();
		}
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)I")
	@Override
	protected int method5897() {
		if (this.aClass273_1.anIntArray537 != null) {
			@Pc(18) Class273 local18 = this.aClass273_1.method6159(Static498.aClass101_1);
			if (local18 != null && local18.anInt7454 != -1) {
				return local18.anInt7454;
			}
		}
		return this.aClass273_1.anInt7454;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
	@Override
	public void method7782() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
		if (this.aClass273_1 == null || !super.aBoolean496 && !this.method157(arg0, 0)) {
			return;
		}
		@Pc(24) Class54 local24 = arg0.method6851();
		local24.a(super.aClass354_7.method7776());
		local24.G(super.anInt9542, super.anInt9541 - 20, super.anInt9540);
		this.method5896(arg0, super.aBoolean496, super.aClass20Array3, local24);
		super.aClass20Array3[0] = super.aClass20Array3[1] = super.aClass20Array3[2] = super.aClass20Array3[3] = null;
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(B)Z")
	public boolean method155() {
		return this.aClass273_1 != null;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	public void method156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray521[0];
		@Pc(15) int local15 = super.anIntArray522[0];
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
			local15--;
			local10++;
		}
		if (arg0 == 4) {
			local15--;
		}
		if (arg0 == 5) {
			local10--;
			local15--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (super.anInt7085 != -1 && Static78.aClass298_2.method6521(super.anInt7085).anInt1541 == 1) {
			super.anInt7085 = -1;
			super.anIntArray519 = null;
		}
		if (arg0 == 7) {
			local10--;
			local15++;
		}
		@Pc(96) Class10 local96;
		if (super.anInt7069 != -1) {
			local96 = Static289.aClass66_7.method1652(super.anInt7069);
			if (local96.aBoolean21 && local96.anInt334 != -1 && Static78.aClass298_2.method6521(local96.anInt334).anInt1541 == 1) {
				super.anInt7069 = -1;
			}
		}
		if (super.anInt7124 != -1) {
			local96 = Static289.aClass66_7.method1652(super.anInt7124);
			if (local96.aBoolean21 && local96.anInt334 != -1 && Static78.aClass298_2.method6521(local96.anInt334).anInt1541 == 1) {
				super.anInt7124 = -1;
			}
		}
		if (super.anInt7132 < 9) {
			super.anInt7132++;
		}
		for (@Pc(159) int local159 = super.anInt7132; local159 > 0; local159--) {
			super.anIntArray521[local159] = super.anIntArray521[local159 - 1];
			super.anIntArray522[local159] = super.anIntArray522[local159 - 1];
			super.aByteArray90[local159] = super.aByteArray90[local159 - 1];
		}
		super.anIntArray521[0] = local10;
		super.anIntArray522[0] = local15;
		super.aByteArray90[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!oa;I)Z")
	private boolean method157(@OriginalArg(1) Class14 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class118 local11 = this.method5891();
		@Pc(27) Class57 local27 = super.anInt7085 != -1 && super.anInt7107 == 0 ? Static78.aClass298_2.method6521(super.anInt7085) : null;
		@Pc(45) Class57 local45 = super.anInt7100 == -1 || super.aBoolean495 && local27 != null ? null : Static78.aClass298_2.method6521(super.anInt7100);
		@Pc(48) int local48 = local11.anInt3601;
		@Pc(51) int local51 = local11.anInt3581;
		if (local48 != 0 || local51 != 0 || local11.anInt3580 != 0 || local11.anInt3586 != 0) {
			arg1 |= 0x7;
		}
		@Pc(94) boolean local94 = super.aByte64 != 0 && super.anInt7125 <= Static312.anInt5688 && Static312.anInt5688 < super.anInt7078;
		if (local94) {
			arg1 |= 0x80000;
		}
		@Pc(131) Class20 local131 = super.aClass20Array3[0] = this.aClass273_1.method6160(Static78.aClass298_2, super.anInt7083, Static333.aClass149_1, super.anInt7101, super.aClass286Array3, super.anInt7054, local27, local45, arg1, Static498.aClass101_1, super.anInt7112, arg0, super.anInt7081, super.anInt7120);
		if (local131 == null) {
			return false;
		}
		super.anInt7093 = local131.DA();
		this.method5902(local131);
		@Pc(156) int local156 = super.aClass354_7.method7776();
		if (local48 == 0 && local51 == 0) {
			this.method5893(this.method5892() << 9, local156, this.method5892() << 9, 0, 0);
		} else {
			this.method5893(local48, local156, local51, local11.anInt3587, local11.anInt3591);
			if (super.anInt7108 != 0) {
				super.aClass20Array3[0].AA(super.anInt7108);
			}
			if (super.anInt7099 != 0) {
				super.aClass20Array3[0].v(super.anInt7099);
			}
			if (super.anInt7102 != 0) {
				super.aClass20Array3[0].m(0, super.anInt7102, 0);
			}
		}
		if (local94) {
			local131.method7260(super.aByte66, super.aByte63, super.aByte65, super.aByte64 & 0xFF);
		}
		@Pc(259) Class10 local259;
		@Pc(274) boolean local274;
		@Pc(276) int local276;
		@Pc(322) Class20 local322;
		if (super.anInt7069 == -1 || super.anInt7087 == -1) {
			super.aClass20Array3[1] = null;
		} else {
			local259 = Static289.aClass66_7.method1652(super.anInt7069);
			local274 = local259.aByte18 == 3 && (local48 != 0 || local51 != 0);
			local276 = local7;
			if (local274) {
				local276 = local7 | 0x7;
			} else {
				if (super.anInt7116 != 0) {
					local276 = local7 | 0x5;
				}
				if (super.anInt7097 != 0) {
					local276 |= 0x2;
				}
			}
			local322 = super.aClass20Array3[1] = local259.method256(local276, super.anInt7092, Static78.aClass298_2, super.anInt7109, super.anInt7087, arg0);
			if (local322 != null) {
				if (super.anInt7097 != 0) {
					local322.m(0, -super.anInt7097 << 2, 0);
				}
				if (super.anInt7116 != 0) {
					local322.I(super.anInt7116 * 2048);
				}
				if (local274) {
					if (super.anInt7108 != 0) {
						local322.AA(super.anInt7108);
					}
					if (super.anInt7099 != 0) {
						local322.v(super.anInt7099);
					}
					if (super.anInt7102 != 0) {
						local322.m(0, super.anInt7102, 0);
					}
				}
			}
		}
		if (super.anInt7124 == -1 || super.anInt7077 == -1) {
			super.aClass20Array3[3] = null;
		} else {
			local259 = Static289.aClass66_7.method1652(super.anInt7124);
			local274 = local259.aByte18 == 3 && (local48 != 0 || local51 != 0);
			local276 = local7;
			if (local274) {
				local276 = local7 | 0x7;
			} else {
				if (super.anInt7079 != 0) {
					local276 = local7 | 0x5;
				}
				if (super.anInt7115 != 0) {
					local276 |= 0x2;
				}
			}
			local322 = super.aClass20Array3[3] = local259.method254(local276, super.anInt7077, super.anInt7090, super.anInt7088, Static78.aClass298_2, arg0);
			if (local322 != null) {
				if (super.anInt7115 != 0) {
					local322.m(0, -super.anInt7115 << 2, 0);
				}
				if (super.anInt7079 != 0) {
					local322.I(super.anInt7079 * 2048);
				}
				if (local274) {
					if (super.anInt7108 != 0) {
						local322.AA(super.anInt7108);
					}
					if (super.anInt7099 != 0) {
						local322.v(super.anInt7099);
					}
					if (super.anInt7102 != 0) {
						local322.m(0, super.anInt7102, 0);
					}
				}
			}
		}
		super.aClass20Array3[2] = null;
		if (super.aClass6_Sub29_3 != null) {
			if (super.aClass6_Sub29_3.anInt5268 <= Static312.anInt5688) {
				super.aClass6_Sub29_3 = null;
			} else if (super.aClass6_Sub29_3.anInt5275 <= Static312.anInt5688) {
				@Pc(545) Class20 local545 = super.aClass6_Sub29_3.method4565(local7 | 0x7, arg0);
				if (local545 != null) {
					local545.m(-super.anInt9542 + super.aClass6_Sub29_3.anInt5264, super.aClass6_Sub29_3.anInt5272 + 5 + -super.anInt9541, super.aClass6_Sub29_3.anInt5278 - super.anInt9540);
					if (local156 != 0) {
						local545.I(local156);
					}
					super.aClass20Array3[2] = local545;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7785() {
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "(I)Z")
	private boolean method158() {
		return this.aClass273_1.aBoolean521;
	}
}
