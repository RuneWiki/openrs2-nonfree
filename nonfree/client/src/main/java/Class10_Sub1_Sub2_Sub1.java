import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public final class Class10_Sub1_Sub2_Sub1 extends Class10_Sub1_Sub2 {

	@OriginalMember(owner = "client!hfa", name = "Ic", descriptor = "Lclient!ci;")
	public Class54 aClass54_1;

	@OriginalMember(owner = "client!hfa", name = "sc", descriptor = "I")
	public int anInt4155 = -1;

	@OriginalMember(owner = "client!hfa", name = "Qc", descriptor = "I")
	public int anInt4177 = -1;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIIIZI)V")
	public void method3524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte101 = (byte) arg1;
		if (super.anInt8483 != -1 && Static168.aClass327_2.method7326(super.anInt8483).anInt2581 == 1) {
			super.anIntArray651 = null;
			super.anInt8483 = -1;
		}
		@Pc(41) Class318 local41;
		if (super.anInt8504 != -1) {
			local41 = Static206.aClass275_1.method6050(super.anInt8504);
			if (local41.aBoolean610 && local41.anInt8788 != -1 && Static168.aClass327_2.method7326(local41.anInt8788).anInt2581 == 1) {
				super.anInt8504 = -1;
			}
		}
		if (super.anInt8529 != -1) {
			local41 = Static206.aClass275_1.method6050(super.anInt8529);
			if (local41.aBoolean610 && local41.anInt8788 != -1 && Static168.aClass327_2.method7326(local41.anInt8788).anInt2581 == 1) {
				super.anInt8529 = -1;
			}
		}
		if (!arg3) {
			@Pc(101) int local101 = arg2 - super.anIntArray653[0];
			@Pc(109) int local109 = arg4 - super.anIntArray654[0];
			if (local101 >= -8 && local101 <= 8 && local109 >= -8 && local109 <= 8) {
				if (super.anInt8537 < 9) {
					super.anInt8537++;
				}
				for (@Pc(138) int local138 = super.anInt8537; local138 > 0; local138--) {
					super.anIntArray653[local138] = super.anIntArray653[local138 - 1];
					super.anIntArray654[local138] = super.anIntArray654[local138 - 1];
					super.aByteArray107[local138] = super.aByteArray107[local138 - 1];
				}
				super.anIntArray653[0] = arg2;
				super.aByteArray107[0] = 1;
				super.anIntArray654[0] = arg4;
				return;
			}
		}
		super.anInt8536 = 0;
		super.anInt8538 = 0;
		super.anIntArray653[0] = arg2;
		super.anInt8537 = 0;
		super.anIntArray654[0] = arg4;
		super.anInt8934 = (arg0 << 8) + (super.anIntArray653[0] << 9);
		super.anInt8929 = (arg0 << 8) + (super.anIntArray654[0] << 9);
		if (super.aClass26_Sub3_7 != null) {
			super.aClass26_Sub3_7.method3654();
		}
	}

	@OriginalMember(owner = "client!hfa", name = "h", descriptor = "(I)Z")
	private boolean method3525() {
		return this.aClass54_1.aBoolean95;
	}

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "(I)I")
	@Override
	protected int method7022() {
		if (this.aClass54_1.anIntArray150 != null) {
			@Pc(19) Class54 local19 = this.aClass54_1.method1118(Static511.aClass335_2);
			if (local19 != null && local19.anInt1281 != -1) {
				return local19.anInt1281;
			}
		}
		return this.aClass54_1.anInt1281;
	}

	@OriginalMember(owner = "client!hfa", name = "e", descriptor = "(I)I")
	@Override
	public int method7027() {
		if (this.aClass54_1.anIntArray150 != null) {
			@Pc(19) Class54 local19 = this.aClass54_1.method1118(Static511.aClass335_2);
			if (local19 != null && local19.anInt1294 != -1) {
				return local19.anInt1294;
			}
		}
		return this.aClass54_1.anInt1294 == -1 ? super.method7027() : this.aClass54_1.anInt1294;
	}

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "(B)V")
	@Override
	public void method7733() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IILclient!oa;)Z")
	private boolean method3528(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class130 local11 = this.method7026();
		@Pc(27) Class77 local27 = super.anInt8483 != -1 && super.anInt8510 == 0 ? Static168.aClass327_2.method7326(super.anInt8483) : null;
		@Pc(45) Class77 local45 = super.anInt8491 == -1 || super.aBoolean592 && local27 != null ? null : Static168.aClass327_2.method7326(super.anInt8491);
		@Pc(48) int local48 = local11.anInt3823;
		@Pc(51) int local51 = local11.anInt3787;
		if (local48 != 0 || local51 != 0 || local11.anInt3784 != 0 || local11.anInt3796 != 0) {
			arg0 |= 0x7;
		}
		@Pc(93) boolean local93 = super.aByte91 != 0 && Static237.anInt7561 >= super.anInt8490 && super.anInt8463 > Static237.anInt7561;
		if (local93) {
			arg0 |= 0x80000;
		}
		@Pc(130) Class9 local130 = super.aClass9Array3[0] = this.aClass54_1.method1119(super.anInt8518, Static251.aClass127_1, arg0, Static511.aClass335_2, super.anInt8484, super.anInt8506, local45, super.anInt8526, super.anInt8521, Static168.aClass327_2, arg1, super.aClass261Array3, local27, super.anInt8468);
		if (local130 == null) {
			return false;
		}
		super.anInt8475 = local130.DA();
		this.method7035(local130);
		@Pc(147) int local147 = super.aClass155_7.method3695();
		if (local48 == 0 && local51 == 0) {
			this.method7032(this.method7021() << 9, this.method7021() << 9, 0, 0, local147);
		} else {
			this.method7032(local48, local51, local11.anInt3800, local11.anInt3807, local147);
			if (super.anInt8473 != 0) {
				super.aClass9Array3[0].AA(super.anInt8473);
			}
			if (super.anInt8488 != 0) {
				super.aClass9Array3[0].v(super.anInt8488);
			}
			if (super.anInt8466 != 0) {
				super.aClass9Array3[0].m(0, super.anInt8466, 0);
			}
		}
		if (local93) {
			local130.method4020(super.aByte93, super.aByte92, super.aByte94, super.aByte91 & 0xFF);
		}
		@Pc(253) Class318 local253;
		@Pc(267) boolean local267;
		@Pc(269) int local269;
		@Pc(312) Class9 local312;
		if (super.anInt8504 == -1 || super.anInt8500 == -1) {
			super.aClass9Array3[1] = null;
		} else {
			local253 = Static206.aClass275_1.method6050(super.anInt8504);
			local267 = local253.aByte98 == 3 && (local48 != 0 || local51 != 0);
			local269 = local7;
			if (local267) {
				local269 = local7 | 0x7;
			} else {
				if (super.anInt8494 != 0) {
					local269 = local7 | 0x5;
				}
				if (super.anInt8479 != 0) {
					local269 |= 0x2;
				}
			}
			local312 = super.aClass9Array3[1] = local253.method7218(local269, Static168.aClass327_2, super.anInt8507, super.anInt8481, super.anInt8500, arg1);
			if (local312 != null) {
				if (super.anInt8479 != 0) {
					local312.m(0, -super.anInt8479 << 2, 0);
				}
				if (super.anInt8494 != 0) {
					local312.I(super.anInt8494 * 2048);
				}
				if (local267) {
					if (super.anInt8473 != 0) {
						local312.AA(super.anInt8473);
					}
					if (super.anInt8488 != 0) {
						local312.v(super.anInt8488);
					}
					if (super.anInt8466 != 0) {
						local312.m(0, super.anInt8466, 0);
					}
				}
			}
		}
		if (super.anInt8529 == -1 || super.anInt8460 == -1) {
			super.aClass9Array3[3] = null;
		} else {
			local253 = Static206.aClass275_1.method6050(super.anInt8529);
			local267 = local253.aByte98 == 3 && (local48 != 0 || local51 != 0);
			local269 = local7;
			if (local267) {
				local269 = local7 | 0x7;
			} else {
				if (super.anInt8489 != 0) {
					local269 = local7 | 0x5;
				}
				if (super.anInt8486 != 0) {
					local269 |= 0x2;
				}
			}
			local312 = super.aClass9Array3[3] = local253.method7217(Static168.aClass327_2, super.anInt8460, arg1, super.anInt8519, super.anInt8515, local269);
			if (local312 != null) {
				if (super.anInt8486 != 0) {
					local312.m(0, -super.anInt8486 << 2, 0);
				}
				if (super.anInt8489 != 0) {
					local312.I(super.anInt8489 * 2048);
				}
				if (local267) {
					if (super.anInt8473 != 0) {
						local312.AA(super.anInt8473);
					}
					if (super.anInt8488 != 0) {
						local312.v(super.anInt8488);
					}
					if (super.anInt8466 != 0) {
						local312.m(0, super.anInt8466, 0);
					}
				}
			}
		}
		super.aClass9Array3[2] = null;
		if (super.aClass4_Sub44_3 != null) {
			if (Static237.anInt7561 >= super.aClass4_Sub44_3.anInt8040) {
				super.aClass4_Sub44_3 = null;
			} else if (Static237.anInt7561 >= super.aClass4_Sub44_3.anInt8046) {
				@Pc(538) Class9 local538 = super.aClass4_Sub44_3.method6638(arg1, local7 | 0x7);
				if (local538 != null) {
					local538.m(-super.anInt8934 + super.aClass4_Sub44_3.anInt8035, super.aClass4_Sub44_3.anInt8031 + 5 - super.anInt8931, super.aClass4_Sub44_3.anInt8038 - super.anInt8929);
					if (local147 != 0) {
						local538.I(local147);
					}
					super.aClass9Array3[2] = local538;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7730() {
		return false;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(III)V")
	public void method3530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray653[0];
		@Pc(15) int local15 = super.anIntArray654[0];
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
		if (super.anInt8483 != -1 && Static168.aClass327_2.method7326(super.anInt8483).anInt2581 == 1) {
			super.anIntArray651 = null;
			super.anInt8483 = -1;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		@Pc(91) Class318 local91;
		if (super.anInt8504 != -1) {
			local91 = Static206.aClass275_1.method6050(super.anInt8504);
			if (local91.aBoolean610 && local91.anInt8788 != -1 && Static168.aClass327_2.method7326(local91.anInt8788).anInt2581 == 1) {
				super.anInt8504 = -1;
			}
		}
		if (super.anInt8529 != -1) {
			local91 = Static206.aClass275_1.method6050(super.anInt8529);
			if (local91.aBoolean610 && local91.anInt8788 != -1 && Static168.aClass327_2.method7326(local91.anInt8788).anInt2581 == 1) {
				super.anInt8529 = -1;
			}
		}
		if (super.anInt8537 < 9) {
			super.anInt8537++;
		}
		for (@Pc(155) int local155 = super.anInt8537; local155 > 0; local155--) {
			super.anIntArray653[local155] = super.anIntArray653[local155 - 1];
			super.anIntArray654[local155] = super.anIntArray654[local155 - 1];
			super.aByteArray107[local155] = super.aByteArray107[local155 - 1];
		}
		super.anIntArray653[0] = local10;
		super.aByteArray107[0] = (byte) arg1;
		super.anIntArray654[0] = local15;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
		if (this.aClass54_1 == null || !super.aBoolean594 && !this.method3528(0, arg0)) {
			return;
		}
		@Pc(20) Class134 local20 = arg0.method6842();
		local20.a(super.aClass155_7.method3695());
		local20.G(super.anInt8934, super.anInt8931 - 20, super.anInt8929);
		this.method7025(local20, super.aBoolean594, arg0, super.aClass9Array3);
		super.aClass9Array3[0] = super.aClass9Array3[1] = super.aClass9Array3[2] = super.aClass9Array3[3] = null;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BLclient!ci;)V")
	public void method3531(@OriginalArg(1) Class54 arg0) {
		this.aClass54_1 = arg0;
		if (super.aClass26_Sub3_7 != null) {
			super.aClass26_Sub3_7.method3654();
		}
	}

	@OriginalMember(owner = "client!hfa", name = "i", descriptor = "(I)Z")
	public boolean method3532() {
		return this.aClass54_1 != null;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass54_1 == null || !this.method3528(131072, arg1)) {
			return false;
		}
		@Pc(19) Class134 local19 = arg1.method6842();
		@Pc(24) int local24 = super.aClass155_7.method3695();
		local19.a(local24);
		local19.G(super.anInt8934, super.anInt8931, super.anInt8929);
		@Pc(37) boolean local37 = false;
		for (@Pc(47) int local47 = 0; super.aClass9Array3.length > local47; local47++) {
			if (super.aClass9Array3[local47] != null) {
				@Pc(77) boolean local77 = this.aClass54_1.anInt1274 == -1 ? this.aClass54_1.anInt1260 == 1 : this.aClass54_1.anInt1274 == 1;
				@Pc(87) boolean local87 = super.aClass9Array3[local47].method4007(arg2, arg0, local19, local77);
				if (local87) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass9Array3[0] = super.aClass9Array3[1] = super.aClass9Array3[2] = super.aClass9Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		if (this.aClass54_1 == null || !this.method3528(2048, arg0)) {
			return null;
		}
		@Pc(24) Class134 local24 = arg0.method6842();
		@Pc(29) int local29 = super.aClass155_7.method3695();
		local24.a(local29);
		local24.G(super.anInt8934, super.anInt8931 - 20, super.anInt8929);
		@Pc(48) Class130 local48 = this.method7026();
		@Pc(61) Class54 local61 = this.aClass54_1.anIntArray150 == null ? this.aClass54_1 : this.aClass54_1.method1118(Static511.aClass335_2);
		if (Static189.aClass4_Sub2_Sub1_1.aBoolean649 && local61.aBoolean98 && local48.aBoolean297) {
			@Pc(89) Class77 local89 = super.anInt8483 != -1 && super.anInt8510 == 0 ? Static168.aClass327_2.method7326(super.anInt8483) : null;
			@Pc(106) Class77 local106 = super.anInt8491 == -1 || super.aBoolean592 && local89 != null ? null : Static168.aClass327_2.method7326(super.anInt8491);
			@Pc(108) int local108 = 0;
			if (super.anInt8498 != 0) {
				local108 = this.method7020();
			}
			@Pc(166) Class9 local166 = Static255.method4265(local106 == null ? local89 : local106, local108, this.aClass54_1.anInt1260, super.aClass9Array3[0], this.aClass54_1.aByte23 & 0xFF, super.anInt8466, arg0, local106 == null ? super.anInt8521 : super.anInt8518, this.aClass54_1.aByte22 & 0xFF, this.aClass54_1.aShort29 & 0xFFFF, this.aClass54_1.aShort30 & 0xFFFF, super.anInt8473, super.anInt8488, local29);
			if (local166 != null) {
				arg0.method6857(false);
				local166.method4023(local24, null, 0);
				arg0.method6857(true);
			}
		}
		local24.a(local29);
		local24.G(super.anInt8934, super.anInt8931 - 5, super.anInt8929);
		@Pc(194) Class26_Sub6 local194 = null;
		if (this.method3525()) {
			local194 = Static292.method4579(super.aClass9Array3.length);
		}
		this.method7025(local24, false, arg0, super.aClass9Array3);
		if (super.aClass26_Sub3_7 == null) {
			arg0.method6845(super.aClass9Array3, local24, local194 == null ? null : local194.aClass26_Sub5Array1, 0);
		} else {
			@Pc(233) Class42 local233 = super.aClass26_Sub3_7.method3658();
			arg0.method6798(super.aClass9Array3, local233, local24, local194 == null ? null : local194.aClass26_Sub5Array1, 0);
		}
		super.aClass9Array3[0] = super.aClass9Array3[1] = super.aClass9Array3[2] = super.aClass9Array3[3] = null;
		super.anInt8535 = Static523.anInt8897;
		return local194;
	}

	@OriginalMember(owner = "client!hfa", name = "f", descriptor = "(B)I")
	@Override
	public int method7037() {
		if (this.aClass54_1.anIntArray150 != null) {
			@Pc(19) Class54 local19 = this.aClass54_1.method1118(Static511.aClass335_2);
			if (local19 != null && local19.anInt1258 != -1) {
				return local19.anInt1258;
			}
		}
		return this.aClass54_1.anInt1258;
	}

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "(Z)I")
	@Override
	public int method7342() {
		return super.anInt8475;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	@Override
	public void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
