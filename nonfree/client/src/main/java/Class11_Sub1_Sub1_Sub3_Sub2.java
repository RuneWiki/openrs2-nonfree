import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class11_Sub1_Sub1_Sub3_Sub2 extends Class11_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!qh", name = "dd", descriptor = "Lclient!wa;")
	public Class354 aClass354_1;

	@OriginalMember(owner = "client!qh", name = "pd", descriptor = "I")
	public int anInt7619 = -1;

	@OriginalMember(owner = "client!qh", name = "gd", descriptor = "I")
	public int anInt7611 = -1;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "(I)V")
	@Override
	public void method7222() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!wa;I)V")
	public void method6080(@OriginalArg(0) Class354 arg0) {
		this.aClass354_1 = arg0;
		if (super.aClass11_Sub9_7 != null) {
			super.aClass11_Sub9_7.method5338();
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!r;)Lclient!cr;")
	@Override
	public Class48 method7205(@OriginalArg(1) Class78 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)V")
	public void method6081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray455[0];
		@Pc(15) int local15 = super.anIntArray454[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local15++;
			local10++;
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
			local15--;
			local10--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt7591 != -1 && Static223.aClass245_1.method5312(super.anInt7591).anInt5064 == 1) {
			super.anIntArray448 = null;
			super.anInt7591 = -1;
		}
		@Pc(91) Class134 local91;
		if (super.anInt7547 != -1) {
			local91 = Static583.aClass256_2.method5466(super.anInt7547);
			if (local91.aBoolean272 && local91.anInt3775 != -1 && Static223.aClass245_1.method5312(local91.anInt3775).anInt5064 == 1) {
				super.anInt7547 = -1;
			}
		}
		if (super.anInt7570 != -1) {
			local91 = Static583.aClass256_2.method5466(super.anInt7570);
			if (local91.aBoolean272 && local91.anInt3775 != -1 && Static223.aClass245_1.method5312(local91.anInt3775).anInt5064 == 1) {
				super.anInt7570 = -1;
			}
		}
		if (super.anInt7604 < 9) {
			super.anInt7604++;
		}
		for (@Pc(155) int local155 = super.anInt7604; local155 > 0; local155--) {
			super.anIntArray455[local155] = super.anIntArray455[local155 - 1];
			super.anIntArray454[local155] = super.anIntArray454[local155 - 1];
			super.aByteArray75[local155] = super.aByteArray75[local155 - 1];
		}
		super.anIntArray455[0] = local10;
		super.aByteArray75[0] = (byte) arg0;
		super.anIntArray454[0] = local15;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIBIZI)V")
	public void method6082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte113 = super.aByte112 = (byte) arg0;
		if (Static34.method641(arg2, arg1)) {
			super.aByte112++;
		}
		if (super.anInt7591 != -1 && Static223.aClass245_1.method5312(super.anInt7591).anInt5064 == 1) {
			super.anIntArray448 = null;
			super.anInt7591 = -1;
		}
		@Pc(55) Class134 local55;
		if (super.anInt7547 != -1) {
			local55 = Static583.aClass256_2.method5466(super.anInt7547);
			if (local55.aBoolean272 && local55.anInt3775 != -1 && Static223.aClass245_1.method5312(local55.anInt3775).anInt5064 == 1) {
				super.anInt7547 = -1;
			}
		}
		if (super.anInt7570 != -1) {
			local55 = Static583.aClass256_2.method5466(super.anInt7570);
			if (local55.aBoolean272 && local55.anInt3775 != -1 && Static223.aClass245_1.method5312(local55.anInt3775).anInt5064 == 1) {
				super.anInt7570 = -1;
			}
		}
		if (!arg3) {
			@Pc(119) int local119 = arg2 - super.anIntArray455[0];
			@Pc(126) int local126 = arg1 - super.anIntArray454[0];
			if (local119 >= -8 && local119 <= 8 && local126 >= -8 && local126 <= 8) {
				if (super.anInt7604 < 9) {
					super.anInt7604++;
				}
				for (@Pc(155) int local155 = super.anInt7604; local155 > 0; local155--) {
					super.anIntArray455[local155] = super.anIntArray455[local155 - 1];
					super.anIntArray454[local155] = super.anIntArray454[local155 - 1];
					super.aByteArray75[local155] = super.aByteArray75[local155 - 1];
				}
				super.anIntArray455[0] = arg2;
				super.aByteArray75[0] = 1;
				super.anIntArray454[0] = arg1;
				return;
			}
		}
		super.anIntArray455[0] = arg2;
		super.anInt7607 = 0;
		super.anInt7604 = 0;
		super.anInt7605 = 0;
		super.anIntArray454[0] = arg1;
		super.anInt8906 = (arg4 << 8) + (super.anIntArray454[0] << 9);
		super.anInt8902 = (super.anIntArray455[0] << 9) + (arg4 << 8);
		if (super.aClass11_Sub9_7 != null) {
			super.aClass11_Sub9_7.method5338();
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!r;I)Z")
	private boolean method6085(@OriginalArg(0) int arg0, @OriginalArg(1) Class78 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(19) Class114 local19 = this.method6073();
		@Pc(37) Class197 local37 = super.anInt7591 != -1 && super.anInt7532 == 0 ? Static223.aClass245_1.method5312(super.anInt7591) : null;
		@Pc(55) Class197 local55 = super.anInt7577 == -1 || super.aBoolean575 && local37 != null ? null : Static223.aClass245_1.method5312(super.anInt7577);
		@Pc(58) int local58 = local19.anInt2990;
		@Pc(61) int local61 = local19.anInt3017;
		if (local58 != 0 || local61 != 0 || local19.anInt3000 != 0 || local19.anInt2995 != 0) {
			arg0 |= 0x7;
		}
		@Pc(100) boolean local100 = super.aByte103 != 0 && super.anInt7589 <= Static518.anInt9331 && Static518.anInt9331 < super.anInt7599;
		if (local100) {
			arg0 |= 0x80000;
		}
		@Pc(113) int local113 = super.aClass106_7.method2484();
		@Pc(147) Class52 local147 = super.aClass52Array3[0] = this.aClass354_1.method7670(Static390.aClass353_29, super.anInt7595, local55, super.anInt7580, local37, super.anInt7558, super.anIntArray453, arg0, local113, super.anInt7593, super.aClass221Array3, arg1, Static241.aClass340_1, super.anInt7530, super.anInt7525, Static223.aClass245_1);
		if (local147 == null) {
			return false;
		}
		super.anInt7551 = local147.J();
		super.anInt7554 = local147.RA();
		this.method6063(local147);
		if (local58 == 0 && local61 == 0) {
			this.method6066(local113, 0, this.method6058() << 9, this.method6058() << 9, 0);
		} else {
			this.method6066(local113, local19.anInt3015, local61, local58, local19.anInt3016);
			if (super.anInt7548 != 0) {
				super.aClass52Array3[0].MA(super.anInt7548);
			}
			if (super.anInt7520 != 0) {
				super.aClass52Array3[0].W(super.anInt7520);
			}
			if (super.anInt7567 != 0) {
				super.aClass52Array3[0].oa(0, super.anInt7567, 0);
			}
		}
		if (local100) {
			local147.method7408(super.aByte106, super.aByte105, super.aByte104, super.aByte103 & 0xFF);
		}
		@Pc(264) Class134 local264;
		@Pc(281) boolean local281;
		@Pc(283) int local283;
		@Pc(326) Class52 local326;
		if (super.anInt7547 == -1 || super.anInt7575 == -1) {
			super.aClass52Array3[1] = null;
		} else {
			local264 = Static583.aClass256_2.method5466(super.anInt7547);
			local281 = local264.aByte52 == 3 && (local58 != 0 || local61 != 0);
			local283 = local7;
			if (local281) {
				local283 = local7 | 0x7;
			} else {
				if (super.anInt7588 != 0) {
					local283 = local7 | 0x5;
				}
				if (super.anInt7560 != 0) {
					local283 |= 0x2;
				}
			}
			local326 = super.aClass52Array3[1] = local264.method3062(super.anInt7574, Static223.aClass245_1, super.anInt7575, arg1, super.anInt7544, local283);
			if (local326 != null) {
				if (super.anInt7560 != 0) {
					local326.oa(0, -super.anInt7560 << 2, 0);
				}
				if (super.anInt7588 != 0) {
					local326.M(super.anInt7588 * 2048);
				}
				if (local281) {
					if (super.anInt7548 != 0) {
						local326.MA(super.anInt7548);
					}
					if (super.anInt7520 != 0) {
						local326.W(super.anInt7520);
					}
					if (super.anInt7567 != 0) {
						local326.oa(0, super.anInt7567, 0);
					}
				}
			}
		}
		if (super.anInt7570 == -1 || super.anInt7600 == -1) {
			super.aClass52Array3[2] = null;
		} else {
			local264 = Static583.aClass256_2.method5466(super.anInt7570);
			local281 = local264.aByte52 == 3 && (local58 != 0 || local61 != 0);
			local283 = local7;
			if (local281) {
				local283 = local7 | 0x7;
			} else {
				if (super.anInt7535 != 0) {
					local283 = local7 | 0x5;
				}
				if (super.anInt7553 != 0) {
					local283 |= 0x2;
				}
			}
			local326 = super.aClass52Array3[2] = local264.method3065(Static223.aClass245_1, super.anInt7600, arg1, super.anInt7592, super.anInt7533, local283);
			if (local326 != null) {
				if (super.anInt7553 != 0) {
					local326.oa(0, -super.anInt7553 << 2, 0);
				}
				if (super.anInt7535 != 0) {
					local326.M(super.anInt7535 * 2048);
				}
				if (local281) {
					if (super.anInt7548 != 0) {
						local326.MA(super.anInt7548);
					}
					if (super.anInt7520 != 0) {
						local326.W(super.anInt7520);
					}
					if (super.anInt7567 != 0) {
						local326.oa(0, super.anInt7567, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIILclient!r;)Z")
	@Override
	public boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		if (this.aClass354_1 == null || !this.method6085(131072, arg2)) {
			return false;
		}
		@Pc(19) Class34 local19 = arg2.method6848();
		@Pc(26) int local26 = super.aClass106_7.method2484();
		local19.o(local26);
		local19.U(super.anInt8902, super.anInt8908, super.anInt8906);
		@Pc(39) boolean local39 = false;
		for (@Pc(41) int local41 = 0; super.aClass52Array3.length > local41; local41++) {
			if (super.aClass52Array3[local41] != null) {
				@Pc(74) boolean local74 = this.aClass354_1.anInt9430 == -1 ? this.aClass354_1.anInt9418 == 1 : this.aClass354_1.anInt9430 == 1;
				@Pc(87) boolean local87;
				if (Static594.aBoolean718) {
					local87 = super.aClass52Array3[local41].method7392(arg1, arg0, local19, local74, Static18.anInt503);
				} else {
					local87 = super.aClass52Array3[local41].method7402(arg1, arg0, local19, local74);
				}
				if (local87) {
					local39 = true;
					break;
				}
			}
		}
		super.aClass52Array3[0] = super.aClass52Array3[1] = super.aClass52Array3[2] = null;
		return local39;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(Lclient!r;I)Lclient!bca;")
	@Override
	public Class11_Sub2 method7219(@OriginalArg(0) Class78 arg0) {
		if (this.aClass354_1 == null || !this.method6085(2048, arg0)) {
			return null;
		}
		@Pc(19) Class34 local19 = arg0.method6848();
		@Pc(26) int local26 = super.aClass106_7.method2484();
		local19.o(local26);
		@Pc(44) Class360 local44 = Static568.aClass360ArrayArrayArray22[super.aByte113][super.anInt8902 >> Static166.anInt7796][super.anInt8906 >> Static166.anInt7796];
		if (local44 == null || local44.aClass11_Sub1_Sub4_1 == null) {
			super.anInt7526 = (int) ((float) super.anInt7526 - (float) super.anInt7526 / 10.0F);
		} else {
			@Pc(57) int local57 = super.anInt7526 - local44.aClass11_Sub1_Sub4_1.aShort109;
			super.anInt7526 = (int) ((float) super.anInt7526 - (float) local57 / 10.0F);
		}
		local19.U(super.anInt8902, super.anInt8908 - super.anInt7526 - 20, super.anInt8906);
		@Pc(99) Class114 local99 = this.method6073();
		@Pc(112) Class354 local112 = this.aClass354_1.anIntArray597 == null ? this.aClass354_1 : this.aClass354_1.method7683(Static390.aClass353_29);
		super.aBoolean578 = false;
		if (Static86.aClass1_Sub30_Sub1_1.aBoolean477 && local112.aBoolean702 && local99.aBoolean222) {
			@Pc(142) Class197 local142 = super.anInt7591 != -1 && super.anInt7532 == 0 ? Static223.aClass245_1.method5312(super.anInt7591) : null;
			@Pc(160) Class197 local160 = super.anInt7577 == -1 || super.aBoolean575 && local142 != null ? null : Static223.aClass245_1.method5312(super.anInt7577);
			@Pc(210) Class52 local210 = Static524.method1214(super.anInt7548, super.anInt7567, this.aClass354_1.anInt9418, local160 == null ? local142 : local160, this.aClass354_1.aShort118 & 0xFFFF, this.aClass354_1.aByte120 & 0xFF, this.aClass354_1.aShort119 & 0xFFFF, local160 == null ? super.anInt7558 : super.anInt7593, super.aClass52Array3[0], arg0, this.aClass354_1.aByte122 & 0xFF, local26, super.anInt7520);
			if (local210 != null) {
				super.aBoolean578 = true;
				arg0.ZA(false);
				if (Static594.aBoolean718) {
					local210.method7405(local19, null, Static18.anInt503, 0);
				} else {
					local210.method7413(local19, null, 0);
				}
				arg0.ZA(true);
			}
		}
		local19.o(local26);
		local19.U(super.anInt8902, -super.anInt7526 + super.anInt8908 - 5, super.anInt8906);
		@Pc(255) Class11_Sub2 local255 = null;
		if (this.method6088()) {
			local255 = Static586.method7842(super.aClass52Array3.length);
		}
		this.method6075(super.aClass52Array3, local19, false, arg0);
		@Pc(279) int local279;
		if (Static594.aBoolean718) {
			for (local279 = 0; super.aClass52Array3.length > local279; local279++) {
				if (super.aClass52Array3[local279] != null) {
					super.aClass52Array3[local279].method7405(local19, local255 == null ? null : local255.aClass11_Sub4Array1[local279], Static18.anInt503, 0);
				}
			}
		} else {
			for (local279 = 0; super.aClass52Array3.length > local279; local279++) {
				if (super.aClass52Array3[local279] != null) {
					super.aClass52Array3[local279].method7413(local19, local255 == null ? null : local255.aClass11_Sub4Array1[local279], 0);
				}
			}
		}
		if (super.aClass11_Sub9_7 != null) {
			@Pc(351) Class64 local351 = super.aClass11_Sub9_7.method5336();
			if (Static594.aBoolean718) {
				arg0.method6850(local351, Static18.anInt503);
			} else {
				arg0.method6796(local351);
			}
		}
		for (local279 = 0; super.aClass52Array3.length > local279; local279++) {
			if (super.aClass52Array3[local279] != null) {
				super.aBoolean578 |= super.aClass52Array3[local279].LA();
			}
		}
		super.anInt7564 = Static450.anInt7909;
		super.aClass52Array3[0] = super.aClass52Array3[1] = super.aClass52Array3[2] = null;
		return local255;
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(Z)I")
	@Override
	public int method6076() {
		if (this.aClass354_1.anIntArray597 != null) {
			@Pc(13) Class354 local13 = this.aClass354_1.method7683(Static390.aClass353_29);
			if (local13 != null && local13.anInt9403 != -1) {
				return local13.anInt9403;
			}
		}
		return this.aClass354_1.anInt9403;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7206(@OriginalArg(0) Class78 arg0) {
		if (this.aClass354_1 == null || !super.aBoolean579 && !this.method6085(0, arg0)) {
			return;
		}
		@Pc(24) Class34 local24 = arg0.method6848();
		local24.o(super.aClass106_7.method2484());
		local24.U(super.anInt8902, super.anInt8908 - 20, super.anInt8906);
		this.method6075(super.aClass52Array3, local24, super.aBoolean579, arg0);
		super.aClass52Array3[0] = super.aClass52Array3[1] = super.aClass52Array3[2] = null;
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(Z)Z")
	public boolean method6087() {
		return this.aClass354_1 != null;
	}

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "(I)Z")
	private boolean method6088() {
		return this.aClass354_1.aBoolean701;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)I")
	@Override
	public int method6061() {
		if (this.aClass354_1.anIntArray597 != null) {
			@Pc(13) Class354 local13 = this.aClass354_1.method7683(Static390.aClass353_29);
			if (local13 != null && local13.anInt9406 != -1) {
				return local13.anInt9406;
			}
		}
		return this.aClass354_1.anInt9406 == -1 ? super.method6061() : this.aClass354_1.anInt9406;
	}

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "(I)I")
	@Override
	protected int method6062() {
		if (this.aClass354_1.anIntArray597 != null) {
			@Pc(23) Class354 local23 = this.aClass354_1.method7683(Static390.aClass353_29);
			if (local23 != null && local23.anInt9421 != -1) {
				return local23.anInt9421;
			}
		}
		return this.aClass354_1.anInt9421;
	}

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7214() {
		return false;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!vv;IIZLclient!r;II)V")
	@Override
	public void method7215(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}
}
