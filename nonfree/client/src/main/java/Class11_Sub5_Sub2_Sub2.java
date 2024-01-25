import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class11_Sub5_Sub2_Sub2 extends Class11_Sub5_Sub2 {

	@OriginalMember(owner = "client!wq", name = "Ec", descriptor = "Lclient!fm;")
	public Class82 aClass82_1;

	@OriginalMember(owner = "client!wq", name = "yc", descriptor = "I")
	public int anInt7711 = -1;

	@OriginalMember(owner = "client!wq", name = "Ic", descriptor = "I")
	public int anInt7719 = -1;

	static {
		new Class231("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIBZ)V")
	public void method6233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		super.aByte101 = (byte) arg2;
		if (super.anInt7665 != -1 && Static37.aClass80_1.method1879(super.anInt7665).anInt2790 == 1) {
			super.anInt7665 = -1;
		}
		@Pc(40) Class139 local40;
		if (super.anInt7667 != -1) {
			local40 = Static399.aClass100_2.method2197(super.anInt7667);
			if (local40.aBoolean228 && local40.anInt3448 != -1 && Static37.aClass80_1.method1879(local40.anInt3448).anInt2790 == 1) {
				super.anInt7667 = -1;
			}
		}
		if (super.anInt7633 != -1) {
			local40 = Static399.aClass100_2.method2197(super.anInt7633);
			if (local40.aBoolean228 && local40.anInt3448 != -1 && Static37.aClass80_1.method1879(local40.anInt3448).anInt2790 == 1) {
				super.anInt7633 = -1;
			}
		}
		if (!arg4) {
			@Pc(106) int local106 = arg1 - super.anIntArray632[0];
			@Pc(113) int local113 = arg3 - super.anIntArray633[0];
			if (local106 >= -8 && local106 <= 8 && local113 >= -8 && local113 <= 8) {
				if (super.anInt7707 < 9) {
					super.anInt7707++;
				}
				for (@Pc(144) int local144 = super.anInt7707; local144 > 0; local144--) {
					super.anIntArray632[local144] = super.anIntArray632[local144 - 1];
					super.anIntArray633[local144] = super.anIntArray633[local144 - 1];
					super.aByteArray96[local144] = super.aByteArray96[local144 - 1];
				}
				super.anIntArray632[0] = arg1;
				super.aByteArray96[0] = 1;
				super.anIntArray633[0] = arg3;
				return;
			}
		}
		super.anInt7705 = 0;
		super.anIntArray632[0] = arg1;
		super.anInt7707 = 0;
		super.anInt7708 = 0;
		super.anIntArray633[0] = arg3;
		super.anInt7626 = (super.anIntArray632[0] << 7) + (arg0 << 6);
		super.anInt7622 = (arg0 << 6) + (super.anIntArray633[0] << 7);
		if (super.aClass28_Sub1_7 != null) {
			super.aClass28_Sub1_7.method528();
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		if (this.aClass82_1 == null || !this.method6234(arg0, 2048)) {
			return null;
		}
		@Pc(17) Class6 local17 = arg0.method5990();
		@Pc(22) int local22 = super.aClass23_7.method461();
		local17.ca(local22);
		local17.W(super.anInt7626, super.anInt7624, super.anInt7622);
		@Pc(37) Class101 local37 = this.method6218();
		@Pc(50) Class82 local50 = this.aClass82_1.anIntArray149 == null ? this.aClass82_1 : this.aClass82_1.method1888(Static63.aClass120_2);
		if (Static434.aClass165_Sub1_1.aBoolean293 && local50.aBoolean117 && local37.aBoolean167) {
			@Pc(75) Class109 local75 = super.anInt7665 != -1 && super.anInt7662 == 0 ? Static37.aClass80_1.method1879(super.anInt7665) : null;
			@Pc(93) Class109 local93 = super.anInt7663 == -1 || super.aBoolean514 && local75 != null ? null : Static37.aClass80_1.method1879(super.anInt7663);
			@Pc(95) int local95 = 0;
			if (super.anInt7674 != 0) {
				local95 = this.method6216();
			}
			@Pc(156) Class63 local156 = Static420.method5766(super.anInt7632, super.anInt7639, local22, this.aClass82_1.aByte12 & 0xFF, this.aClass82_1.anInt1963, super.anInt7648, this.aClass82_1.aShort9 & 0xFFFF, local95, super.aClass63Array3[0], local93 == null ? super.anInt7693 : super.anInt7701, this.aClass82_1.aByte16 & 0xFF, this.aClass82_1.aShort8 & 0xFFFF, local93 == null ? local75 : local93, arg0);
			if (local156 != null) {
				@Pc(161) float local161 = arg0.T();
				@Pc(164) float local164 = arg0.aa();
				arg0.method5971(false);
				arg0.da(local161, local164 - 150.0F);
				local156.method6293(local17, null, 0);
				arg0.da(local161, local164);
				arg0.method5971(true);
			}
		}
		@Pc(187) Class28_Sub5 local187 = null;
		if (this.method6237()) {
			local187 = Static29.method474(super.aClass63Array3.length);
		}
		if (super.aClass28_Sub1_7 == null) {
			arg0.method6004(super.aClass63Array3, local17, local187 == null ? null : local187.aClass28_Sub4Array1, 0);
		} else {
			@Pc(222) Class56 local222 = super.aClass28_Sub1_7.method536();
			arg0.method5965(super.aClass63Array3, local222, local17, local187 == null ? null : local187.aClass28_Sub4Array1, 0);
		}
		this.method6232(super.aClass63Array3, arg0, false);
		if (super.aClass63Array3[2] != null) {
			if (local22 != 0) {
				super.aClass63Array3[2].ma(local22);
			}
			super.aClass63Array3[2].a(super.anInt7626 - super.aClass2_Sub28_3.anInt5056, super.anInt7624 + -super.aClass2_Sub28_3.anInt5061, -super.aClass2_Sub28_3.anInt5059 + super.anInt7622);
		}
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		super.anInt7695 = Static383.anInt6623;
		return local187;
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(Z)I")
	@Override
	public int method6213() {
		return super.anInt7668;
	}

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "(I)I")
	@Override
	public int method6224() {
		if (this.aClass82_1.anIntArray149 != null) {
			@Pc(17) Class82 local17 = this.aClass82_1.method1888(Static63.aClass120_2);
			if (local17 != null && local17.anInt1970 != -1) {
				return local17.anInt1970;
			}
		}
		return this.aClass82_1.anInt1970 == -1 ? super.method6224() : this.aClass82_1.anInt1970;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!za;II)Z")
	private boolean method6234(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class101 local11 = this.method6218();
		@Pc(26) Class109 local26 = super.anInt7665 != -1 && super.anInt7662 == 0 ? Static37.aClass80_1.method1879(super.anInt7665) : null;
		@Pc(44) Class109 local44 = super.anInt7663 == -1 || super.aBoolean514 && local26 != null ? null : Static37.aClass80_1.method1879(super.anInt7663);
		@Pc(47) int local47 = local11.anInt2653;
		@Pc(50) int local50 = local11.anInt2609;
		if (local47 != 0 || local50 != 0 || local11.anInt2617 != 0 || local11.anInt2634 != 0) {
			arg1 |= 0x7;
		}
		@Pc(89) boolean local89 = super.aByte105 != 0 && Static277.anInt5022 >= super.anInt7652 && super.anInt7698 > Static277.anInt5022;
		if (local89) {
			arg1 |= 0x80000;
		}
		@Pc(126) Class63 local126 = super.aClass63Array3[0] = this.aClass82_1.method1896(local44, super.anInt7654, super.anInt7647, local26, arg0, super.anInt7701, super.anInt7693, arg1, super.anInt7704, Static257.aClass262_1, Static37.aClass80_1, super.anInt7657, Static63.aClass120_2, super.aClass92Array3);
		if (local126 == null) {
			return false;
		}
		super.anInt7668 = local126.B();
		this.method6228(local126);
		@Pc(143) int local143 = super.aClass23_7.method461();
		if (local47 == 0 && local50 == 0) {
			this.method6221(local143, this.method6215() << 7, 0, this.method6215() << 7, 0);
		} else {
			this.method6221(local143, local50, local11.anInt2644, local47, local11.anInt2640);
			if (super.anInt7648 != 0) {
				super.aClass63Array3[0].W(super.anInt7648);
			}
			if (super.anInt7639 != 0) {
				super.aClass63Array3[0].K(super.anInt7639);
			}
			if (super.anInt7632 != 0) {
				super.aClass63Array3[0].a(0, super.anInt7632, 0);
			}
		}
		if (local89) {
			local126.method6282(super.aByte103, super.aByte104, super.aByte102, super.aByte105 & 0xFF);
		}
		@Pc(255) Class139 local255;
		@Pc(270) boolean local270;
		@Pc(272) int local272;
		@Pc(315) Class63 local315;
		if (super.anInt7667 == -1 || super.anInt7694 == -1) {
			super.aClass63Array3[1] = null;
		} else {
			local255 = Static399.aClass100_2.method2197(super.anInt7667);
			local270 = local255.aByte58 == 3 && (local47 != 0 || local50 != 0);
			local272 = local7;
			if (local270) {
				local272 = local7 | 0x7;
			} else {
				if (super.anInt7628 != 0) {
					local272 = local7 | 0x5;
				}
				if (super.anInt7676 != 0) {
					local272 |= 0x2;
				}
			}
			local315 = super.aClass63Array3[1] = local255.method2836(arg0, super.anInt7683, local272, super.anInt7703, Static37.aClass80_1, super.anInt7694);
			if (local315 != null) {
				if (super.anInt7676 != 0) {
					local315.a(0, -super.anInt7676 << 0, 0);
				}
				if (super.anInt7628 != 0) {
					local315.ma(super.anInt7628 * 2048);
				}
				if (local270) {
					if (super.anInt7648 != 0) {
						local315.W(super.anInt7648);
					}
					if (super.anInt7639 != 0) {
						local315.K(super.anInt7639);
					}
					if (super.anInt7632 != 0) {
						local315.a(0, super.anInt7632, 0);
					}
				}
			}
		}
		if (super.anInt7633 == -1 || super.anInt7679 == -1) {
			super.aClass63Array3[3] = null;
		} else {
			local255 = Static399.aClass100_2.method2197(super.anInt7633);
			local270 = local255.aByte58 == 3 && (local47 != 0 || local50 != 0);
			local272 = local7;
			if (local270) {
				local272 = local7 | 0x7;
			} else {
				if (super.anInt7635 != 0) {
					local272 = local7 | 0x5;
				}
				if (super.anInt7684 != 0) {
					local272 |= 0x2;
				}
			}
			local315 = super.aClass63Array3[3] = local255.method2838(Static37.aClass80_1, super.anInt7655, super.anInt7666, local272, arg0, super.anInt7679);
			if (local315 != null) {
				if (super.anInt7684 != 0) {
					local315.a(0, -super.anInt7684 << 0, 0);
				}
				if (super.anInt7635 != 0) {
					local315.ma(super.anInt7635 * 2048);
				}
				if (local270) {
					if (super.anInt7648 != 0) {
						local315.W(super.anInt7648);
					}
					if (super.anInt7639 != 0) {
						local315.K(super.anInt7639);
					}
					if (super.anInt7632 != 0) {
						local315.a(0, super.anInt7632, 0);
					}
				}
			}
		}
		super.aClass63Array3[2] = null;
		if (super.aClass2_Sub28_3 != null) {
			if (super.aClass2_Sub28_3.anInt5050 <= Static277.anInt5022) {
				super.aClass2_Sub28_3 = null;
			} else if (Static277.anInt5022 >= super.aClass2_Sub28_3.anInt5052) {
				@Pc(553) Class63 local553 = super.aClass2_Sub28_3.method3987(arg0, local7 | 0x7);
				if (local553 != null) {
					local553.a(-super.anInt7626 + super.aClass2_Sub28_3.anInt5056, super.aClass2_Sub28_3.anInt5061 + -super.anInt7624, -super.anInt7622 + super.aClass2_Sub28_3.anInt5059);
					if (local143 != 0) {
						local553.ma(local143);
					}
					super.aClass63Array3[2] = local553;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!fm;B)V")
	public void method6235(@OriginalArg(0) Class82 arg0) {
		this.aClass82_1 = arg0;
		if (super.aClass28_Sub1_7 != null) {
			super.aClass28_Sub1_7.method528();
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
	@Override
	public void method6208() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
		if (this.aClass82_1 != null && (super.aBoolean516 || this.method6234(arg0, 0))) {
			this.method6232(super.aClass63Array3, arg0, super.aBoolean516);
			super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6211() {
		return false;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)Z")
	public boolean method6236() {
		return this.aClass82_1 != null;
	}

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "(I)Z")
	private boolean method6237() {
		return this.aClass82_1.aBoolean115;
	}

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "(I)I")
	@Override
	public int method6217() {
		if (this.aClass82_1.anIntArray149 != null) {
			@Pc(13) Class82 local13 = this.aClass82_1.method1888(Static63.aClass120_2);
			if (local13 != null && local13.anInt1952 != -1) {
				return local13.anInt1952;
			}
		}
		return this.aClass82_1.anInt1952;
	}

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "(I)I")
	@Override
	protected int method6230() {
		if (this.aClass82_1.anIntArray149 != null) {
			@Pc(13) Class82 local13 = this.aClass82_1.method1888(Static63.aClass120_2);
			if (local13 != null && local13.anInt1964 != -1) {
				return local13.anInt1964;
			}
		}
		return this.aClass82_1.anInt1964;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V")
	public void method6238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray632[0];
		@Pc(15) int local15 = super.anIntArray633[0];
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
		if (arg1 == 7) {
			local10--;
			local15++;
		}
		if (super.anInt7665 != -1 && Static37.aClass80_1.method1879(super.anInt7665).anInt2790 == 1) {
			super.anInt7665 = -1;
		}
		@Pc(89) Class139 local89;
		if (super.anInt7667 != -1) {
			local89 = Static399.aClass100_2.method2197(super.anInt7667);
			if (local89.aBoolean228 && local89.anInt3448 != -1 && Static37.aClass80_1.method1879(local89.anInt3448).anInt2790 == 1) {
				super.anInt7667 = -1;
			}
		}
		if (super.anInt7633 != -1) {
			local89 = Static399.aClass100_2.method2197(super.anInt7633);
			if (local89.aBoolean228 && local89.anInt3448 != -1 && Static37.aClass80_1.method1879(local89.anInt3448).anInt2790 == 1) {
				super.anInt7633 = -1;
			}
		}
		if (super.anInt7707 < 9) {
			super.anInt7707++;
		}
		for (@Pc(151) int local151 = super.anInt7707; local151 > 0; local151--) {
			super.anIntArray632[local151] = super.anIntArray632[local151 - 1];
			super.anIntArray633[local151] = super.anIntArray633[local151 - 1];
			super.aByteArray96[local151] = super.aByteArray96[local151 - 1];
		}
		super.anIntArray632[0] = local10;
		super.anIntArray633[0] = local15;
		super.aByteArray96[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		if (this.aClass82_1 == null || !this.method6234(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class6 local19 = arg2.method5990();
		@Pc(30) int local30 = super.aClass23_7.method461();
		local19.ca(local30);
		local19.W(super.anInt7626, super.anInt7624, super.anInt7622);
		@Pc(43) boolean local43 = false;
		for (@Pc(45) int local45 = 0; local45 < super.aClass63Array3.length; local45++) {
			if (super.aClass63Array3[local45] != null && super.aClass63Array3[local45].method6292(arg0, arg1, local19, this.aClass82_1.anInt1963 == 1)) {
				local43 = true;
				break;
			}
		}
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		return local43;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!za;IZBILclient!bm;)V")
	@Override
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5) {
		throw new IllegalStateException();
	}
}
