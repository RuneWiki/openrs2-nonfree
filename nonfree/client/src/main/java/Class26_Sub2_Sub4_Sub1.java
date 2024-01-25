import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class26_Sub2_Sub4_Sub1 extends Class26_Sub2_Sub4 {

	@OriginalMember(owner = "client!sr", name = "Xc", descriptor = "Lclient!up;")
	public Class249 aClass249_1;

	@OriginalMember(owner = "client!sr", name = "Lc", descriptor = "I")
	public int anInt6079 = -1;

	@OriginalMember(owner = "client!sr", name = "Nc", descriptor = "I")
	public int anInt6081 = -1;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
	@Override
	public void method5715() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		if (this.aClass249_1 == null || !this.method4828(2048, arg0)) {
			return null;
		}
		@Pc(17) Class33 local17 = arg0.method5285();
		@Pc(22) int local22 = super.aClass158_7.method3356();
		local17.ra(local22);
		local17.o(super.anInt7388, super.anInt7390, super.anInt7383);
		@Pc(39) Class78 local39 = this.method5507();
		@Pc(52) Class249 local52 = this.aClass249_1.anIntArray579 == null ? this.aClass249_1 : this.aClass249_1.method5179(Static224.aClass239_7);
		if (Static130.aClass153_Sub1_1.aBoolean351 && local52.aBoolean424 && local39.aBoolean123) {
			@Pc(80) Class139 local80 = super.anInt7046 != -1 && super.anInt7069 == 0 ? Static364.aClass151_2.method3293(super.anInt7046) : null;
			@Pc(98) Class139 local98 = super.anInt7103 == -1 || super.aBoolean475 && local80 != null ? null : Static364.aClass151_2.method3293(super.anInt7103);
			@Pc(150) Class163 local150 = Static301.method4017(super.aClass163Array3[0], this.aClass249_1.anInt6507, this.aClass249_1.aByte81 & 0xFF, super.aBoolean477, this.aClass249_1.aShort90 & 0xFFFF, arg0, local98 == null ? super.anInt7061 : super.lb, super.anInt7067, this.aClass249_1.aShort91 & 0xFFFF, super.anInt7113, local98 == null ? local80 : local98, super.anInt7089, this.aClass249_1.aByte85 & 0xFF, local22);
			if (local150 != null) {
				@Pc(155) float local155 = arg0.W();
				@Pc(158) float local158 = arg0.xa();
				arg0.method5333(false);
				arg0.g(local155, local158 - 150.0F);
				local150.method4667(local17, null, 0);
				arg0.g(local155, local158);
				arg0.method5333(true);
			}
		}
		@Pc(181) Class28_Sub4 local181 = null;
		if (this.method4822()) {
			local181 = Static329.method4328(super.aClass163Array3.length);
		}
		if (super.aClass28_Sub3_7 == null) {
			arg0.method5334(super.aClass163Array3, local17, local181 == null ? null : local181.aClass28_Sub6Array1, 0);
		} else {
			@Pc(200) Class201 local200 = super.aClass28_Sub3_7.method3164();
			arg0.method5322(super.aClass163Array3, local200, local17, local181 == null ? null : local181.aClass28_Sub6Array1, 0);
		}
		this.method5509(super.aClass163Array3, false, arg0);
		if (super.aClass163Array3[2] != null) {
			if (local22 != 0) {
				super.aClass163Array3[2].Q(local22);
			}
			super.aClass163Array3[2].JA(-super.aClass7_Sub42_3.anInt6164 + super.anInt7388, -super.aClass7_Sub42_3.anInt6169 + super.anInt7390, -super.aClass7_Sub42_3.anInt6176 + super.anInt7383);
		}
		super.aClass163Array3[0] = super.aClass163Array3[1] = super.aClass163Array3[2] = super.aClass163Array3[3] = null;
		super.anInt7045 = Static143.anInt2745;
		return local181;
	}

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "(I)I")
	@Override
	public int method5516() {
		if (this.aClass249_1.anIntArray579 != null) {
			@Pc(18) Class249 local18 = this.aClass249_1.method5179(Static224.aClass239_7);
			if (local18 != null && local18.anInt6533 != -1) {
				return local18.anInt6533;
			}
		}
		return this.aClass249_1.anInt6533 == -1 ? super.method5516() : this.aClass249_1.anInt6533;
	}

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "(I)Z")
	private boolean method4822() {
		return this.aClass249_1.aBoolean428;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)I")
	@Override
	public int method5508() {
		if (this.aClass249_1.anIntArray579 != null) {
			@Pc(13) Class249 local13 = this.aClass249_1.method5179(Static224.aClass239_7);
			if (local13 != null && local13.anInt6522 != -1) {
				return local13.anInt6522;
			}
		}
		return this.aClass249_1.anInt6522;
	}

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(B)I")
	@Override
	protected int method5517() {
		if (this.aClass249_1.anIntArray579 != null) {
			@Pc(18) Class249 local18 = this.aClass249_1.method5179(Static224.aClass239_7);
			if (local18 != null && local18.anInt6518 != -1) {
				return local18.anInt6518;
			}
		}
		return this.aClass249_1.anInt6518;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZIBIII)V")
	public void method4824(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte102 = (byte) arg4;
		if (super.anInt7046 != -1 && Static364.aClass151_2.method3293(super.anInt7046).anInt3932 == 1) {
			super.anInt7046 = -1;
		}
		@Pc(41) Class105 local41;
		if (super.anInt7066 != -1) {
			local41 = Static79.aClass231_1.method4830(super.anInt7066);
			if (local41.aBoolean176 && local41.anInt2900 != -1 && Static364.aClass151_2.method3293(local41.anInt2900).anInt3932 == 1) {
				super.anInt7066 = -1;
			}
		}
		if (super.anInt7065 != -1) {
			local41 = Static79.aClass231_1.method4830(super.anInt7065);
			if (local41.aBoolean176 && local41.anInt2900 != -1 && Static364.aClass151_2.method3293(local41.anInt2900).anInt3932 == 1) {
				super.anInt7065 = -1;
			}
		}
		if (!arg0) {
			@Pc(100) int local100 = arg2 - super.anIntArray603[0];
			@Pc(107) int local107 = arg1 - super.anIntArray604[0];
			if (local100 >= -8 && local100 <= 8 && local107 >= -8 && local107 <= 8) {
				if (super.anInt7117 < 9) {
					super.anInt7117++;
				}
				for (@Pc(136) int local136 = super.anInt7117; local136 > 0; local136--) {
					super.anIntArray603[local136] = super.anIntArray603[local136 - 1];
					super.anIntArray604[local136] = super.anIntArray604[local136 - 1];
					super.aByteArray94[local136] = super.aByteArray94[local136 - 1];
				}
				super.anIntArray603[0] = arg2;
				super.aByteArray94[0] = 1;
				super.anIntArray604[0] = arg1;
				return;
			}
		}
		super.anIntArray603[0] = arg2;
		super.anInt7116 = 0;
		super.anInt7114 = 0;
		super.anInt7117 = 0;
		super.anIntArray604[0] = arg1;
		super.anInt7383 = (arg3 << 6) + (super.anIntArray604[0] << 7);
		super.anInt7388 = (arg3 << 6) + (super.anIntArray603[0] << 7);
		if (super.aClass28_Sub3_7 != null) {
			super.aClass28_Sub3_7.method3168();
		}
	}

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "(I)I")
	@Override
	public int method5695() {
		return super.anInt7102;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V")
	public void method4825(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray603[0];
		@Pc(15) int local15 = super.anIntArray604[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local15++;
			local10++;
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
			local10--;
			local15--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (arg0 == 7) {
			local10--;
			local15++;
		}
		if (super.anInt7046 != -1 && Static364.aClass151_2.method3293(super.anInt7046).anInt3932 == 1) {
			super.anInt7046 = -1;
		}
		@Pc(85) Class105 local85;
		if (super.anInt7066 != -1) {
			local85 = Static79.aClass231_1.method4830(super.anInt7066);
			if (local85.aBoolean176 && local85.anInt2900 != -1 && Static364.aClass151_2.method3293(local85.anInt2900).anInt3932 == 1) {
				super.anInt7066 = -1;
			}
		}
		if (super.anInt7065 != -1) {
			local85 = Static79.aClass231_1.method4830(super.anInt7065);
			if (local85.aBoolean176 && local85.anInt2900 != -1 && Static364.aClass151_2.method3293(local85.anInt2900).anInt3932 == 1) {
				super.anInt7065 = -1;
			}
		}
		if (super.anInt7117 < 9) {
			super.anInt7117++;
		}
		for (@Pc(149) int local149 = super.anInt7117; local149 > 0; local149--) {
			super.anIntArray603[local149] = super.anIntArray603[local149 - 1];
			super.anIntArray604[local149] = super.anIntArray604[local149 - 1];
			super.aByteArray94[local149] = super.aByteArray94[local149 - 1];
		}
		super.anIntArray603[0] = local10;
		super.aByteArray94[0] = (byte) arg1;
		super.anIntArray604[0] = local15;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
		if (this.aClass249_1 != null && (super.aBoolean479 || this.method4828(0, arg0))) {
			this.method5509(super.aClass163Array3, super.aBoolean479, arg0);
			super.aClass163Array3[0] = super.aClass163Array3[1] = super.aClass163Array3[2] = super.aClass163Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "(I)Z")
	public boolean method4826() {
		return this.aClass249_1 != null;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass249_1 == null || !this.method4828(131072, arg1)) {
			return false;
		}
		@Pc(19) Class33 local19 = arg1.method5285();
		@Pc(24) int local24 = super.aClass158_7.method3356();
		local19.ra(local24);
		local19.o(super.anInt7388, super.anInt7390, super.anInt7383);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass163Array3.length; local39++) {
			if (super.aClass163Array3[local39] != null && super.aClass163Array3[local39].method4653(arg0, arg2, local19, this.aClass249_1.anInt6507 == 1)) {
				local37 = true;
				break;
			}
		}
		super.aClass163Array3[0] = super.aClass163Array3[1] = super.aClass163Array3[2] = super.aClass163Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	@Override
	public void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!up;B)V")
	public void method4827(@OriginalArg(0) Class249 arg0) {
		this.aClass249_1 = arg0;
		if (super.aClass28_Sub3_7 != null) {
			super.aClass28_Sub3_7.method3168();
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBLclient!ya;)Z")
	private boolean method4828(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(23) Class78 local23 = this.method5507();
		@Pc(38) Class139 local38 = super.anInt7046 != -1 && super.anInt7069 == 0 ? Static364.aClass151_2.method3293(super.anInt7046) : null;
		@Pc(55) Class139 local55 = super.anInt7103 == -1 || super.aBoolean475 && local38 != null ? null : Static364.aClass151_2.method3293(super.anInt7103);
		@Pc(58) int local58 = local23.anInt2287;
		@Pc(61) int local61 = local23.anInt2295;
		if (local58 != 0 || local61 != 0 || local23.anInt2285 != 0 || local23.anInt2300 != 0) {
			arg0 |= 0x7;
		}
		@Pc(104) boolean local104 = super.aByte94 != 0 && super.anInt7049 <= Static274.anInt4617 && super.anInt7053 > Static274.anInt4617;
		if (local104) {
			arg0 |= 0x80000;
		}
		@Pc(141) Class163 local141 = super.aClass163Array3[0] = this.aClass249_1.method5176(Static223.aClass154_1, super.anInt7055, super.anInt7076, super.anInt7104, arg0, super.lb, super.anInt7061, Static364.aClass151_2, arg1, super.aClass69Array3, Static224.aClass239_7, local38, local55, super.anInt7050);
		if (local141 == null) {
			return false;
		}
		super.anInt7102 = local141.MA();
		this.method5506(local141);
		@Pc(158) int local158 = super.aClass158_7.method3356();
		if (local58 == 0 && local61 == 0) {
			this.method5514(this.method5512() << 7, 0, local158, this.method5512() << 7, 0);
		} else {
			this.method5514(local58, local23.anInt2262, local158, local61, local23.anInt2282);
			if (super.anInt7113 != 0) {
				super.aClass163Array3[0].Z(super.anInt7113);
			}
			if (super.anInt7089 != 0) {
				super.aClass163Array3[0].R(super.anInt7089);
			}
			if (super.anInt7067 != 0) {
				super.aClass163Array3[0].JA(0, super.anInt7067, 0);
			}
		}
		if (local104) {
			local141.method4656(super.aByte93, super.aByte96, super.aByte95, super.aByte94 & 0xFF);
		}
		@Pc(257) Class105 local257;
		@Pc(274) boolean local274;
		@Pc(276) int local276;
		@Pc(319) Class163 local319;
		if (super.anInt7066 == -1 || super.anInt7099 == -1) {
			super.aClass163Array3[1] = null;
		} else {
			local257 = Static79.aClass231_1.method4830(super.anInt7066);
			local274 = local257.aByte28 == 3 && (local58 != 0 || local61 != 0);
			local276 = local7;
			if (local274) {
				local276 = local7 | 0x7;
			} else {
				if (super.anInt7094 != 0) {
					local276 = local7 | 0x5;
				}
				if (super.anInt7047 != 0) {
					local276 |= 0x2;
				}
			}
			local319 = super.aClass163Array3[1] = local257.method2333(super.anInt7042, local276, super.anInt7056, super.anInt7099, arg1, Static364.aClass151_2);
			if (local319 != null) {
				if (super.anInt7047 != 0) {
					local319.JA(0, -super.anInt7047 << 0, 0);
				}
				if (super.anInt7094 != 0) {
					local319.Q(super.anInt7094 * 2048);
				}
				if (local274) {
					if (super.anInt7113 != 0) {
						local319.Z(super.anInt7113);
					}
					if (super.anInt7089 != 0) {
						local319.R(super.anInt7089);
					}
					if (super.anInt7067 != 0) {
						local319.JA(0, super.anInt7067, 0);
					}
				}
			}
		}
		if (super.anInt7065 == -1 || super.anInt7037 == -1) {
			super.aClass163Array3[3] = null;
		} else {
			local257 = Static79.aClass231_1.method4830(super.anInt7065);
			local274 = local257.aByte28 == 3 && (local58 != 0 || local61 != 0);
			local276 = local7;
			if (local274) {
				local276 = local7 | 0x7;
			} else {
				if (super.anInt7068 != 0) {
					local276 = local7 | 0x5;
				}
				if (super.anInt7082 != 0) {
					local276 |= 0x2;
				}
			}
			local319 = super.aClass163Array3[3] = local257.method2338(super.anInt7073, Static364.aClass151_2, local276, super.anInt7037, super.anInt7041, arg1);
			if (local319 != null) {
				if (super.anInt7082 != 0) {
					local319.JA(0, -super.anInt7082 << 0, 0);
				}
				if (super.anInt7068 != 0) {
					local319.Q(super.anInt7068 * 2048);
				}
				if (local274) {
					if (super.anInt7113 != 0) {
						local319.Z(super.anInt7113);
					}
					if (super.anInt7089 != 0) {
						local319.R(super.anInt7089);
					}
					if (super.anInt7067 != 0) {
						local319.JA(0, super.anInt7067, 0);
					}
				}
			}
		}
		super.aClass163Array3[2] = null;
		if (super.aClass7_Sub42_3 != null) {
			if (Static274.anInt4617 >= super.aClass7_Sub42_3.anInt6165) {
				super.aClass7_Sub42_3 = null;
			} else if (Static274.anInt4617 >= super.aClass7_Sub42_3.anInt6171) {
				@Pc(553) Class163 local553 = super.aClass7_Sub42_3.method4917(arg1, local7 | 0x7);
				if (local553 != null) {
					local553.JA(super.aClass7_Sub42_3.anInt6164 - super.anInt7388, -super.anInt7390 + super.aClass7_Sub42_3.anInt6169, super.aClass7_Sub42_3.anInt6176 - super.anInt7383);
					if (local158 != 0) {
						local553.Q(local158);
					}
					super.aClass163Array3[2] = local553;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5721() {
		return false;
	}
}
