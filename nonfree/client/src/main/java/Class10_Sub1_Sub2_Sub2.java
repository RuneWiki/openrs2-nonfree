import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class10_Sub1_Sub2_Sub2 extends Class10_Sub1_Sub2 {

	@OriginalMember(owner = "client!st", name = "xc", descriptor = "Lclient!wi;")
	public Class355 aClass355_1;

	@OriginalMember(owner = "client!st", name = "Ic", descriptor = "I")
	public int anInt8555;

	@OriginalMember(owner = "client!st", name = "Nc", descriptor = "Ljava/lang/String;")
	public String aString92;

	@OriginalMember(owner = "client!st", name = "Qc", descriptor = "I")
	private int anInt8560;

	@OriginalMember(owner = "client!st", name = "Yc", descriptor = "I")
	public int anInt8567;

	@OriginalMember(owner = "client!st", name = "hd", descriptor = "Ljava/lang/String;")
	public String aString93;

	@OriginalMember(owner = "client!st", name = "zc", descriptor = "I")
	public int anInt8547 = -1;

	@OriginalMember(owner = "client!st", name = "Jc", descriptor = "I")
	public int anInt8556 = 0;

	@OriginalMember(owner = "client!st", name = "Fc", descriptor = "B")
	private byte aByte95 = 0;

	@OriginalMember(owner = "client!st", name = "Rc", descriptor = "I")
	public int anInt8561 = -1;

	@OriginalMember(owner = "client!st", name = "Gc", descriptor = "I")
	public int anInt8553 = 0;

	@OriginalMember(owner = "client!st", name = "dd", descriptor = "Z")
	public boolean aBoolean598 = false;

	@OriginalMember(owner = "client!st", name = "Mc", descriptor = "Z")
	public boolean aBoolean595 = false;

	@OriginalMember(owner = "client!st", name = "Ac", descriptor = "I")
	public int anInt8548 = -1;

	@OriginalMember(owner = "client!st", name = "sc", descriptor = "I")
	public int anInt8541 = 255;

	@OriginalMember(owner = "client!st", name = "Lc", descriptor = "I")
	public int anInt8558 = -1;

	@OriginalMember(owner = "client!st", name = "Sc", descriptor = "I")
	public int anInt8562 = 0;

	@OriginalMember(owner = "client!st", name = "Pc", descriptor = "B")
	private byte aByte96 = 0;

	@OriginalMember(owner = "client!st", name = "jd", descriptor = "I")
	public int anInt8574 = -1;

	@OriginalMember(owner = "client!st", name = "Xc", descriptor = "I")
	public int anInt8566 = -1;

	@OriginalMember(owner = "client!st", name = "Vc", descriptor = "Z")
	public boolean aBoolean596 = false;

	@OriginalMember(owner = "client!st", name = "yc", descriptor = "I")
	public int anInt8546 = -1;

	@OriginalMember(owner = "client!st", name = "bd", descriptor = "I")
	public int anInt8570 = -1;

	@OriginalMember(owner = "client!st", name = "md", descriptor = "B")
	private byte aByte97 = 0;

	@OriginalMember(owner = "client!st", name = "cd", descriptor = "Z")
	public boolean aBoolean597 = false;

	@OriginalMember(owner = "client!st", name = "kd", descriptor = "I")
	public int anInt8575 = 0;

	@OriginalMember(owner = "client!st", name = "gd", descriptor = "I")
	public int anInt8572 = 0;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	@Override
	public void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIBB)V")
	public void method7038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt8537 < 9) {
			super.anInt8537++;
		}
		for (@Pc(20) int local20 = super.anInt8537; local20 > 0; local20--) {
			super.anIntArray653[local20] = super.anIntArray653[local20 - 1];
			super.anIntArray654[local20] = super.anIntArray654[local20 - 1];
			super.aByteArray107[local20] = super.aByteArray107[local20 - 1];
		}
		super.anIntArray653[0] = arg1;
		super.aByteArray107[0] = arg2;
		super.anIntArray654[0] = arg0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
		if (this.aClass355_1 == null || !super.aBoolean594 && !this.method7039(0, arg0)) {
			return;
		}
		@Pc(24) Class134 local24 = arg0.method6842();
		local24.a(super.aClass155_7.method3695());
		local24.G(super.anInt8934, super.anInt8931 - 5, super.anInt8929);
		this.method7025(local24, super.aBoolean594, arg0, super.aClass9Array3);
		super.aClass9Array3[0] = super.aClass9Array3[1] = super.aClass9Array3[2] = super.aClass9Array3[3] = null;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7730() {
		return false;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!oa;Z)Z")
	private boolean method7039(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class130 local11 = this.method7026();
		@Pc(29) Class77 local29 = super.anInt8483 != -1 && super.anInt8510 == 0 ? Static168.aClass327_2.method7326(super.anInt8483) : null;
		@Pc(49) Class77 local49 = super.anInt8491 == -1 || this.aBoolean597 || super.aBoolean592 && local29 != null ? null : Static168.aClass327_2.method7326(super.anInt8491);
		@Pc(52) int local52 = local11.anInt3823;
		@Pc(55) int local55 = local11.anInt3787;
		if (local52 != 0 || local55 != 0 || local11.anInt3784 != 0 || local11.anInt3796 != 0) {
			arg0 |= 0x7;
		}
		@Pc(100) boolean local100 = super.aByte91 != 0 && super.anInt8490 <= Static237.anInt7561 && super.anInt8463 > Static237.anInt7561;
		if (local100) {
			arg0 |= 0x80000;
		}
		@Pc(141) Class9 local141 = super.aClass9Array3[0] = this.aClass355_1.method7924(super.anInt8526, Static511.aClass335_2, super.anInt8484, arg0, super.aClass261Array3, arg1, Static438.aClass237_2, local29, local49, Static168.aClass327_2, Static401.aClass345_2, super.anInt8468, super.anInt8518, Static195.aClass99_1, super.anInt8506, Static251.aClass127_1, super.anInt8521);
		@Pc(144) int local144 = Static138.method7411();
		if (Static87.anInt2262 < 96 && local144 > 50) {
			Static463.method6490();
		}
		@Pc(165) int local165;
		if (Static327.aClass315_8 != Static106.aClass315_4 && local144 < 50) {
			local165 = 50 - local144;
			while (local165 > Static283.anInt5302) {
				Static240.aByteArrayArray22[Static283.anInt5302] = new byte[102400];
				Static283.anInt5302++;
			}
			while (local165 < Static283.anInt5302) {
				Static283.anInt5302--;
				Static240.aByteArrayArray22[Static283.anInt5302] = null;
			}
		} else if (Static106.aClass315_4 != Static327.aClass315_8) {
			Static283.anInt5302 = 0;
			Static240.aByteArrayArray22 = new byte[50][];
		}
		if (local141 == null) {
			return false;
		}
		super.anInt8475 = local141.DA();
		this.method7035(local141);
		local165 = super.aClass155_7.method3695();
		if (local52 == 0 && local55 == 0) {
			this.method7032(this.method7021() << 9, this.method7021() << 9, 0, 0, local165);
		} else {
			this.method7032(local52, local55, local11.anInt3800, local11.anInt3807, local165);
			if (super.anInt8473 != 0) {
				local141.AA(super.anInt8473);
			}
			if (super.anInt8488 != 0) {
				local141.v(super.anInt8488);
			}
			if (super.anInt8466 != 0) {
				local141.m(0, super.anInt8466, 0);
			}
		}
		if (local100) {
			local141.method4020(super.aByte93, super.aByte92, super.aByte94, super.aByte91 & 0xFF);
		}
		@Pc(323) Class318 local323;
		@Pc(335) boolean local335;
		@Pc(337) int local337;
		@Pc(380) Class9 local380;
		if (this.aBoolean597 || super.anInt8504 == -1 || super.anInt8500 == -1) {
			super.aClass9Array3[1] = null;
		} else {
			local323 = Static206.aClass275_1.method6050(super.anInt8504);
			local335 = local323.aByte98 == 3 && (local52 != 0 || local55 != 0);
			local337 = local7;
			if (local335) {
				local337 = local7 | 0x7;
			} else {
				if (super.anInt8494 != 0) {
					local337 = local7 | 0x5;
				}
				if (super.anInt8479 != 0) {
					local337 |= 0x2;
				}
			}
			local380 = super.aClass9Array3[1] = local323.method7218(local337, Static168.aClass327_2, super.anInt8507, super.anInt8481, super.anInt8500, arg1);
			if (local380 != null) {
				if (super.anInt8479 != 0) {
					local380.m(0, -super.anInt8479 << 2, 0);
				}
				if (super.anInt8494 != 0) {
					local380.I(super.anInt8494 * 2048);
				}
				if (local335) {
					if (super.anInt8473 != 0) {
						local380.AA(super.anInt8473);
					}
					if (super.anInt8488 != 0) {
						local380.v(super.anInt8488);
					}
					if (super.anInt8466 != 0) {
						local380.m(0, super.anInt8466, 0);
					}
				}
			}
		}
		if (this.aBoolean597 || super.anInt8529 == -1 || super.anInt8460 == -1) {
			super.aClass9Array3[3] = null;
		} else {
			local323 = Static206.aClass275_1.method6050(super.anInt8529);
			local335 = local323.aByte98 == 3 && (local52 != 0 || local55 != 0);
			local337 = local7;
			if (local335) {
				local337 = local7 | 0x7;
			} else {
				if (super.anInt8489 != 0) {
					local337 = local7 | 0x5;
				}
				if (super.anInt8486 != 0) {
					local337 |= 0x2;
				}
			}
			local380 = super.aClass9Array3[3] = local323.method7217(Static168.aClass327_2, super.anInt8460, arg1, super.anInt8519, super.anInt8515, local337);
			if (local380 != null) {
				if (super.anInt8486 != 0) {
					local380.m(0, -super.anInt8486 << 2, 0);
				}
				if (super.anInt8489 != 0) {
					local380.I(super.anInt8489 * 2048);
				}
				if (local335) {
					if (super.anInt8473 != 0) {
						local380.AA(super.anInt8473);
					}
					if (super.anInt8488 != 0) {
						local380.v(super.anInt8488);
					}
					if (super.anInt8466 != 0) {
						local380.m(0, super.anInt8466, 0);
					}
				}
			}
		}
		super.aClass9Array3[2] = null;
		if (!this.aBoolean597 && super.aClass4_Sub44_3 != null) {
			if (super.aClass4_Sub44_3.anInt8040 <= Static237.anInt7561) {
				super.aClass4_Sub44_3 = null;
			} else if (Static237.anInt7561 >= super.aClass4_Sub44_3.anInt8046) {
				@Pc(634) Class9 local634 = super.aClass4_Sub44_3.method6638(arg1, local7 | 0x7);
				if (local634 != null) {
					local634.m(-super.anInt8934 + super.aClass4_Sub44_3.anInt8035, -super.anInt8931 + 5 + super.aClass4_Sub44_3.anInt8031, super.aClass4_Sub44_3.anInt8038 - super.anInt8929);
					if (local165 != 0) {
						local634.I(-local165 & 0x3FFF);
					}
					super.aClass9Array3[2] = local634;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!st", name = "d", descriptor = "(Z)I")
	@Override
	public int method7342() {
		return super.anInt8475;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!st", name = "h", descriptor = "(I)Z")
	public boolean method7040() {
		return this.aClass355_1 != null;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!oa;IZIIILclient!ba;Lclient!q;)V")
	private void method7041(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class9 arg5, @OriginalArg(7) Class134 arg6) {
		@Pc(15) int local15 = arg3 * arg3 + arg1 * arg1;
		if (local15 < 262144 || arg2 < local15) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg1, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(45) Class9 local45 = Static337.method5027(super.anInt8473, super.anInt8488, arg0, super.anInt8466, arg4, local33);
		if (local45 != null) {
			arg0.method6857(false);
			local45.method4023(arg6, null, 0);
			arg0.method6857(true);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method7042() {
		return this.aString93;
	}

	@OriginalMember(owner = "client!st", name = "f", descriptor = "(B)I")
	@Override
	public int method7037() {
		return -1;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		if (this.aClass355_1 == null || !this.method7039(2048, arg0)) {
			return null;
		}
		@Pc(19) Class134 local19 = arg0.method6842();
		@Pc(24) int local24 = super.aClass155_7.method3695();
		local19.a(local24);
		local19.G(super.anInt8934, super.anInt8931 - 20, super.anInt8929);
		@Pc(100) int local100;
		if (Static189.aClass4_Sub2_Sub1_1.aBoolean649) {
			@Pc(44) Class130 local44 = this.method7026();
			if (local44.aBoolean297 && (this.aClass355_1.anInt9676 == -1 || Static401.aClass345_2.method7602(this.aClass355_1.anInt9676).aBoolean98)) {
				@Pc(76) Class77 local76 = super.anInt8483 != -1 && super.anInt8510 == 0 ? Static168.aClass327_2.method7326(super.anInt8483) : null;
				@Pc(98) Class77 local98 = super.anInt8491 == -1 || this.aBoolean597 || super.aBoolean592 && local76 != null ? null : Static168.aClass327_2.method7326(super.anInt8491);
				local100 = 0;
				if (super.anInt8498 != 0) {
					local100 = this.method7020();
				}
				@Pc(140) Class9 local140 = Static255.method4265(local98 == null ? local76 : local98, local100, 1, super.aClass9Array3[0], 240, super.anInt8466, arg0, local98 == null ? super.anInt8521 : super.anInt8518, 160, 0, 0, super.anInt8473, super.anInt8488, local24);
				if (local140 != null) {
					arg0.method6857(false);
					local140.method4023(local19, null, 0);
					arg0.method6857(true);
				}
			}
		}
		if (Static129.aClass10_Sub1_Sub2_Sub2_1 == this) {
			local19.GA(super.anInt8934, super.anInt8931, super.anInt8929);
			for (@Pc(169) int local169 = Static186.aClass18Array1.length - 1; local169 >= 0; local169--) {
				@Pc(175) Class18 local175 = Static186.aClass18Array1[local169];
				if (local175 != null && local175.anInt383 != -1) {
					@Pc(204) int local204;
					if (local175.anInt388 == 1) {
						@Pc(193) Class4_Sub50 local193 = (Class4_Sub50) Static106.aClass183_8.method4289((long) local175.anInt387);
						if (local193 != null) {
							@Pc(198) Class10_Sub1_Sub2_Sub1 local198 = local193.aClass10_Sub1_Sub2_Sub1_1;
							local204 = local198.anInt8934 - Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934;
							@Pc(211) int local211 = local198.anInt8929 - Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929;
							this.method7041(arg0, local204, 92160000, local211, local175.anInt383, super.aClass9Array3[0], local19);
						}
					}
					if (local175.anInt388 == 2) {
						@Pc(240) int local240 = local175.anInt382 + 256 - Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934;
						local100 = local175.anInt393 + 256 - Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929;
						local204 = local175.anInt381 << 9;
						local204 *= local204;
						this.method7041(arg0, local240, local204, local100, local175.anInt383, super.aClass9Array3[0], local19);
					}
					if (local175.anInt388 == 10 && local175.anInt387 >= 0 && Static246.aClass10_Sub1_Sub2_Sub2Array1.length > local175.anInt387) {
						@Pc(294) Class10_Sub1_Sub2_Sub2 local294 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local175.anInt387];
						if (local294 != null) {
							local100 = local294.anInt8934 - Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934;
							local204 = local294.anInt8929 - Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929;
							this.method7041(arg0, local100, 92160000, local204, local175.anInt383, super.aClass9Array3[0], local19);
						}
					}
				}
			}
			local19.a(local24);
			local19.G(super.anInt8934, super.anInt8931, super.anInt8929);
		}
		local19.a(local24);
		local19.G(super.anInt8934, super.anInt8931 - 5, super.anInt8929);
		@Pc(356) Class26_Sub6 local356 = Static292.method4579(super.aClass9Array3.length);
		this.method7025(local19, false, arg0, super.aClass9Array3);
		if (super.aClass26_Sub3_7 == null) {
			arg0.method6845(super.aClass9Array3, local19, local356.aClass26_Sub5Array1, Static129.aClass10_Sub1_Sub2_Sub2_1 == this ? 1 : 0);
		} else {
			@Pc(376) Class42 local376 = super.aClass26_Sub3_7.method3658();
			arg0.method6798(super.aClass9Array3, local376, local19, local356.aClass26_Sub5Array1, Static129.aClass10_Sub1_Sub2_Sub2_1 == this ? 1 : 0);
		}
		super.aClass9Array3[0] = super.aClass9Array3[1] = super.aClass9Array3[2] = super.aClass9Array3[3] = null;
		super.anInt8535 = Static523.anInt8897;
		return local356;
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(I)I")
	@Override
	protected int method7022() {
		return this.anInt8560;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(III)V")
	public void method7045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt8536 = 0;
		super.anInt8538 = 0;
		super.anIntArray653[0] = arg1;
		super.anInt8537 = 0;
		super.anIntArray654[0] = arg0;
		@Pc(26) int local26 = this.method7021();
		super.anInt8934 = super.anIntArray653[0] * 512 + local26 * 256;
		super.anInt8929 = local26 * 256 + super.anIntArray654[0] * 512;
		if (Static129.aClass10_Sub1_Sub2_Sub2_1 == this) {
			Static114.method2345();
		}
		if (super.aClass26_Sub3_7 != null) {
			super.aClass26_Sub3_7.method3654();
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass355_1 == null || !this.method7039(131072, arg1)) {
			return false;
		}
		@Pc(19) Class134 local19 = arg1.method6842();
		@Pc(32) int local32 = super.aClass155_7.method3695();
		local19.a(local32);
		local19.G(super.anInt8934, super.anInt8931, super.anInt8929);
		@Pc(45) boolean local45 = false;
		for (@Pc(47) int local47 = 0; local47 < super.aClass9Array3.length; local47++) {
			if (super.aClass9Array3[local47] != null && super.aClass9Array3[local47].method4007(arg2, arg0, local19, true)) {
				local45 = true;
				break;
			}
		}
		super.aClass9Array3[0] = super.aClass9Array3[1] = super.aClass9Array3[2] = super.aClass9Array3[3] = null;
		return local45;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIBI)V")
	public void method7046(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt8483 != -1 && Static168.aClass327_2.method7326(super.anInt8483).anInt2581 == 1) {
			super.anIntArray651 = null;
			super.anInt8483 = -1;
		}
		@Pc(31) Class318 local31;
		if (super.anInt8504 != -1) {
			local31 = Static206.aClass275_1.method6050(super.anInt8504);
			if (local31.aBoolean610 && local31.anInt8788 != -1 && Static168.aClass327_2.method7326(local31.anInt8788).anInt2581 == 1) {
				super.anInt8504 = -1;
			}
		}
		if (super.anInt8529 != -1) {
			local31 = Static206.aClass275_1.method6050(super.anInt8529);
			if (local31.aBoolean610 && local31.anInt8788 != -1 && Static168.aClass327_2.method7326(local31.anInt8788).anInt2581 == 1) {
				super.anInt8529 = -1;
			}
		}
		this.anInt8547 = -1;
		if (arg0 < 0 || arg0 >= Static38.anInt740 || arg2 < 0 || Static38.anInt741 <= arg2) {
			this.method7045(arg2, arg0);
		} else if (super.anIntArray653[0] >= 0 && super.anIntArray653[0] < Static38.anInt740 && super.anIntArray654[0] >= 0 && Static38.anInt741 > super.anIntArray654[0]) {
			if (arg1 == 2) {
				Static400.method5801(arg0, this, arg2);
			}
			this.method7038(arg2, arg0, arg1);
		} else {
			this.method7045(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method7047() {
		@Pc(7) String local7 = "";
		if (Static129.aStringArray7 != null) {
			local7 = local7 + Static129.aStringArray7[this.aByte95];
		}
		@Pc(35) int[] local35;
		if (this.aByte96 == 1 && Static202.anIntArray395 != null) {
			local35 = Static202.anIntArray395;
		} else {
			local35 = Static427.anIntArray603;
		}
		if (local35 != null && local35[this.aByte95] != -1) {
			@Pc(55) Class146 local55 = Static244.aClass205_1.method4571(local35[this.aByte95]);
			if (local55.aChar2 == 's') {
				local7 = local7 + local55.method3572(this.aByte97 & 0xFF);
			} else {
				Static473.method6593(new Throwable(), "gdn1");
				local35[this.aByte95] = -1;
			}
		}
		local7 = local7 + this.aString92;
		if (Static404.aStringArray31 != null) {
			local7 = local7 + Static404.aStringArray31[this.aByte95];
		}
		return local7;
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(B)I")
	@Override
	public int method7021() {
		return this.aClass355_1 == null || this.aClass355_1.anInt9676 == -1 ? super.method7021() : Static401.aClass345_2.method7602(this.aClass355_1.anInt9676).anInt1260;
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(B)V")
	@Override
	public void method7733() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!eh;I)V")
	public void method7048(@OriginalArg(0) Class4_Sub9 arg0) {
		arg0.anInt7219 = 0;
		@Pc(12) int local12 = arg0.method6015();
		this.aByte96 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean595;
		this.aBoolean595 = (local12 & 0x2) != 0;
		@Pc(38) boolean local38 = (local12 & 0x4) != 0;
		@Pc(49) int local49 = super.method7021();
		this.method7028((local12 >> 3 & 0x7) + 1);
		this.aByte95 = (byte) (local12 >> 6 & 0x3);
		super.anInt8934 += this.method7021() - local49 << 8;
		super.anInt8929 += this.method7021() - local49 << 8;
		this.aByte97 = arg0.method6021();
		this.anInt8558 = arg0.method6021();
		this.anInt8574 = arg0.method6021();
		this.anInt8572 = 0;
		@Pc(117) int local117 = -1;
		@Pc(120) int[] local120 = new int[12];
		@Pc(140) int local140;
		@Pc(146) int local146;
		@Pc(187) int local187;
		for (@Pc(122) int local122 = 0; local122 < 12; local122++) {
			@Pc(128) int local128 = arg0.method6015();
			if (local128 == 0) {
				local120[local122] = 0;
			} else {
				local140 = arg0.method6015();
				local146 = local140 + (local128 << 8);
				if (local122 == 0 && local146 == 65535) {
					local117 = arg0.method5982();
					this.anInt8572 = arg0.method6015();
					break;
				}
				if (local146 >= 32768) {
					local146 = Static273.anIntArray447[local146 - 32768];
					local120[local122] = local146 | 0x40000000;
					local187 = Static195.aClass99_1.method2798(local146).anInt5832;
					if (local187 != 0) {
						this.anInt8572 = local187;
					}
				} else {
					local120[local122] = Integer.MIN_VALUE | local146 - 256;
				}
			}
		}
		@Pc(209) int[] local209 = new int[5];
		for (local140 = 0; local140 < 5; local140++) {
			local146 = arg0.method6015();
			if (Static296.aShortArrayArrayArray2.length < 1 || local146 < 0 || Static296.aShortArrayArrayArray2[0][local140].length <= local146) {
				local146 = 0;
			}
			local209[local140] = local146;
		}
		this.anInt8560 = arg0.method5982();
		this.aString92 = arg0.method6010();
		this.aString93 = this.aString92;
		this.anInt8575 = arg0.method6015();
		if (local38) {
			this.anInt8553 = arg0.method5982();
			this.anInt8556 = this.anInt8575;
			if (this.anInt8553 == 65535) {
				this.anInt8553 = -1;
			}
			this.anInt8566 = -1;
		} else {
			this.anInt8553 = 0;
			this.anInt8556 = arg0.method6015();
			this.anInt8566 = arg0.method6015();
			if (this.anInt8566 == 255) {
				this.anInt8566 = -1;
			}
		}
		local146 = this.anInt8562;
		this.anInt8562 = arg0.method6015();
		@Pc(343) int local343;
		if (this.anInt8562 == 0) {
			Static326.method4924(this);
		} else {
			local187 = this.anInt8561;
			@Pc(340) int local340 = this.anInt8546;
			local343 = this.anInt8548;
			@Pc(346) int local346 = this.anInt8570;
			@Pc(349) int local349 = this.anInt8541;
			this.anInt8561 = arg0.method5982();
			this.anInt8546 = arg0.method5982();
			this.anInt8548 = arg0.method5982();
			this.anInt8570 = arg0.method5982();
			this.anInt8541 = arg0.method6015();
			if (this.aBoolean595 != local21 || local146 != this.anInt8562 || this.anInt8561 != local187 || this.anInt8546 != local340 || local343 != this.anInt8548 || local346 != this.anInt8570 || this.anInt8541 != local349) {
				Static351.method5201(this);
			}
		}
		if (this.aClass355_1 == null) {
			this.aClass355_1 = new Class355();
		}
		local187 = this.aClass355_1.anInt9676;
		@Pc(437) int[] local437 = this.aClass355_1.anIntArray714;
		this.aClass355_1.method7925(local209, local117, this.aByte96 == 1, this.method7022(), local120);
		if (local117 != local187) {
			super.anInt8934 = (super.anIntArray653[0] << 9) + (this.method7021() << 8);
			super.anInt8929 = (super.anIntArray654[0] << 9) + (this.method7021() << 8);
		}
		if (Static416.anInt7186 == super.anInt8531 && local437 != null) {
			for (local343 = 0; local343 < local209.length; local343++) {
				if (local209[local343] != local437[local343]) {
					Static195.aClass99_1.method2791();
					break;
				}
			}
		}
		if (super.aClass26_Sub3_7 != null) {
			super.aClass26_Sub3_7.method3654();
		}
		if (super.anInt8491 == -1 || !super.aBoolean592) {
			return;
		}
		@Pc(532) Class130 local532 = this.method7026();
		if (!local532.method3357(super.anInt8491)) {
			super.aBoolean592 = false;
			super.anInt8491 = -1;
			return;
		}
	}
}
