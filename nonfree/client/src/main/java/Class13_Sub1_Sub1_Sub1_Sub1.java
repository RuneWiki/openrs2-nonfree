import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class13_Sub1_Sub1_Sub1_Sub1 extends Class13_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!am", name = "ld", descriptor = "Lclient!iea;")
	public Class150 aClass150_1;

	@OriginalMember(owner = "client!am", name = "bd", descriptor = "I")
	public int anInt517 = -1;

	@OriginalMember(owner = "client!am", name = "vd", descriptor = "I")
	public int anInt535 = -1;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Lclient!ha;I)Lclient!jl;")
	@Override
	public Class13_Sub6 method8399(@OriginalArg(0) Class95 arg0) {
		if (this.aClass150_1 == null || !this.method399(arg0, 2048)) {
			return null;
		}
		@Pc(21) Class177 local21 = arg0.method6967();
		@Pc(26) int local26 = super.aClass116_7.method2590();
		local21.method7877(local26);
		@Pc(44) Class53 local44 = Static28.aClass53ArrayArrayArray1[super.aByte127][super.anInt10090 >> Static609.anInt9827][super.anInt10089 >> Static609.anInt9827];
		if (local44 == null || local44.aClass13_Sub1_Sub2_1 == null) {
			super.anInt4588 = (int) ((float) super.anInt4588 - (float) super.anInt4588 / 10.0F);
		} else {
			@Pc(57) int local57 = super.anInt4588 - local44.aClass13_Sub1_Sub2_1.aShort55;
			super.anInt4588 = (int) ((float) super.anInt4588 - (float) local57 / 10.0F);
		}
		local21.method7872(super.anInt10090, -super.anInt4588 + super.anInt10097 - 20, super.anInt10089);
		@Pc(100) Class334 local100 = this.method3964();
		@Pc(113) Class150 local113 = this.aClass150_1.anIntArray262 == null ? this.aClass150_1 : this.aClass150_1.method3196(Static431.aClass205_1);
		super.aBoolean320 = false;
		@Pc(118) Class13_Sub6 local118 = null;
		if (Static234.aClass2_Sub5_48.aClass6_Sub23_1.method7411() == 1 && local113.aBoolean268 && local100.aBoolean669) {
			@Pc(147) Class81 local147 = super.anInt4559 != -1 && super.anInt4622 == 0 ? Static540.aClass173_2.method3791(super.anInt4559) : null;
			@Pc(164) Class81 local164 = super.anInt4553 == -1 || super.aBoolean319 && local147 != null ? null : Static540.aClass173_2.method3791(super.anInt4553);
			@Pc(214) Class182 local214 = Static637.method8578(this.aClass150_1.anInt3793, super.anInt4593, local26, this.aClass150_1.aByte45 & 0xFF, super.anInt4586, this.aClass150_1.aShort42 & 0xFFFF, arg0, super.anInt4635, this.aClass150_1.aShort43 & 0xFFFF, super.aClass182Array3[0], this.aClass150_1.aByte44 & 0xFF, local164 == null ? super.anInt4591 : super.anInt4628, local164 == null ? local147 : local164);
			if (local214 != null) {
				local118 = Static491.method6848(super.aClass182Array3.length + 1, this.method402());
				super.aBoolean320 = true;
				arg0.C(false);
				if (Static449.aBoolean538) {
					local214.method6194(local21, local118.aClass13_Sub2Array1[super.aClass182Array3.length], Static638.anInt7982, 0);
				} else {
					local214.method6206(local21, local118.aClass13_Sub2Array1[super.aClass182Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local21.method7877(local26);
		local21.method7872(super.anInt10090, -super.anInt4588 + super.anInt10097 - 5, super.anInt10089);
		if (local118 == null) {
			local118 = Static491.method6848(super.aClass182Array3.length, this.method402());
		}
		this.method3960(super.aClass182Array3, local21, arg0, false);
		@Pc(301) int local301;
		if (Static449.aBoolean538) {
			for (local301 = 0; super.aClass182Array3.length > local301; local301++) {
				if (super.aClass182Array3[local301] != null) {
					super.aClass182Array3[local301].method6194(local21, local118.aClass13_Sub2Array1[local301], Static638.anInt7982, 0);
				}
			}
		} else {
			for (local301 = 0; local301 < super.aClass182Array3.length; local301++) {
				if (super.aClass182Array3[local301] != null) {
					super.aClass182Array3[local301].method6206(local21, local118.aClass13_Sub2Array1[local301], 0);
				}
			}
		}
		if (super.aClass13_Sub9_3 != null) {
			@Pc(365) Class98 local365 = super.aClass13_Sub9_3.method5660();
			if (Static449.aBoolean538) {
				arg0.method6977(local365, Static638.anInt7982);
			} else {
				arg0.method6960(local365);
			}
		}
		for (local301 = 0; local301 < super.aClass182Array3.length; local301++) {
			if (super.aClass182Array3[local301] != null) {
				super.aBoolean320 |= super.aClass182Array3[local301].F();
			}
		}
		super.anInt4604 = Static482.anInt7692;
		super.aClass182Array3[0] = super.aClass182Array3[1] = super.aClass182Array3[2] = null;
		return local118;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IBZILclient!ha;ILclient!ig;)V")
	@Override
	public void method8410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub1 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZII)V")
	public void method397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray307[0];
		@Pc(15) int local15 = super.anIntArray306[0];
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
		if (super.anInt4559 != -1 && Static540.aClass173_2.method3791(super.anInt4559).anInt2149 == 1) {
			super.anInt4559 = -1;
			super.anIntArray300 = null;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		@Pc(93) Class39 local93;
		if (super.anInt4556 != -1) {
			local93 = Static460.aClass155_2.method3363(super.anInt4556);
			if (local93.aBoolean74 && local93.anInt1044 != -1 && Static540.aClass173_2.method3791(local93.anInt1044).anInt2149 == 1) {
				super.anInt4556 = -1;
			}
		}
		if (super.anInt4624 != -1) {
			local93 = Static460.aClass155_2.method3363(super.anInt4624);
			if (local93.aBoolean74 && local93.anInt1044 != -1 && Static540.aClass173_2.method3791(local93.anInt1044).anInt2149 == 1) {
				super.anInt4624 = -1;
			}
		}
		if (super.anInt4639 < 9) {
			super.anInt4639++;
		}
		for (@Pc(156) int local156 = super.anInt4639; local156 > 0; local156--) {
			super.anIntArray307[local156] = super.anIntArray307[local156 - 1];
			super.anIntArray306[local156] = super.anIntArray306[local156 - 1];
			super.aByteArray52[local156] = super.aByteArray52[local156 - 1];
		}
		super.anIntArray307[0] = local10;
		super.aByteArray52[0] = (byte) arg1;
		super.anIntArray306[0] = local15;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZIII)V")
	public void method398(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte127 = super.aByte126 = (byte) arg0;
		if (Static181.method2642(arg4, arg3)) {
			super.aByte126++;
		}
		if (super.anInt4559 != -1 && Static540.aClass173_2.method3791(super.anInt4559).anInt2149 == 1) {
			super.anInt4559 = -1;
			super.anIntArray300 = null;
		}
		@Pc(54) Class39 local54;
		if (super.anInt4556 != -1) {
			local54 = Static460.aClass155_2.method3363(super.anInt4556);
			if (local54.aBoolean74 && local54.anInt1044 != -1 && Static540.aClass173_2.method3791(local54.anInt1044).anInt2149 == 1) {
				super.anInt4556 = -1;
			}
		}
		if (super.anInt4624 != -1) {
			local54 = Static460.aClass155_2.method3363(super.anInt4624);
			if (local54.aBoolean74 && local54.anInt1044 != -1 && Static540.aClass173_2.method3791(local54.anInt1044).anInt2149 == 1) {
				super.anInt4624 = -1;
			}
		}
		if (!arg1) {
			@Pc(116) int local116 = arg3 - super.anIntArray307[0];
			@Pc(124) int local124 = arg4 - super.anIntArray306[0];
			if (local116 >= -8 && local116 <= 8 && local124 >= -8 && local124 <= 8) {
				if (super.anInt4639 < 9) {
					super.anInt4639++;
				}
				for (@Pc(153) int local153 = super.anInt4639; local153 > 0; local153--) {
					super.anIntArray307[local153] = super.anIntArray307[local153 - 1];
					super.anIntArray306[local153] = super.anIntArray306[local153 - 1];
					super.aByteArray52[local153] = super.aByteArray52[local153 - 1];
				}
				super.anIntArray307[0] = arg3;
				super.aByteArray52[0] = 1;
				super.anIntArray306[0] = arg4;
				return;
			}
		}
		super.anInt4640 = 0;
		super.anInt4637 = 0;
		super.anIntArray307[0] = arg3;
		super.anInt4639 = 0;
		super.anIntArray306[0] = arg4;
		super.anInt10089 = (super.anIntArray306[0] << 9) + (arg2 << 8);
		super.anInt10090 = (super.anIntArray307[0] << 9) + (arg2 << 8);
		if (super.aClass13_Sub9_3 != null) {
			super.aClass13_Sub9_3.method5652();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ha;II)Z")
	private boolean method399(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1;
		@Pc(16) Class334 local16 = this.method3964();
		@Pc(31) Class81 local31 = super.anInt4559 != -1 && super.anInt4622 == 0 ? Static540.aClass173_2.method3791(super.anInt4559) : null;
		@Pc(48) Class81 local48 = super.anInt4553 == -1 || super.aBoolean319 && local31 != null ? null : Static540.aClass173_2.method3791(super.anInt4553);
		@Pc(51) int local51 = local16.anInt8947;
		@Pc(54) int local54 = local16.anInt8951;
		if (local51 != 0 || local54 != 0 || local16.anInt8911 != 0 || local16.anInt8955 != 0) {
			arg1 |= 0x7;
		}
		@Pc(95) boolean local95 = super.aByte68 != 0 && super.anInt4577 <= Static262.anInt5597 && Static262.anInt5597 < super.anInt4618;
		if (local95) {
			arg1 |= 0x80000;
		}
		@Pc(106) int local106 = super.aClass116_7.method2590();
		@Pc(140) Class182 local140 = super.aClass182Array3[0] = this.aClass150_1.method3190(super.anIntArray301, local31, Static431.aClass205_1, local106, super.aClass250Array3, super.anInt4564, super.anInt4628, super.anInt4621, super.anInt4591, Static540.aClass173_2, local48, super.anInt4612, super.anInt4634, arg1, arg0, Static43.aClass283_1);
		if (local140 == null) {
			return false;
		}
		super.anInt4581 = local140.fa();
		super.anInt4589 = local140.ma();
		this.method3954(local140);
		if (local51 == 0 && local54 == 0) {
			this.method3959(this.method3950() << 9, this.method3950() << 9, 0, local106, 0);
		} else {
			this.method3959(local54, local51, local16.anInt8923, local106, local16.anInt8950);
			if (super.anInt4586 != 0) {
				super.aClass182Array3[0].FA(super.anInt4586);
			}
			if (super.anInt4593 != 0) {
				super.aClass182Array3[0].VA(super.anInt4593);
			}
			if (super.anInt4635 != 0) {
				super.aClass182Array3[0].H(0, super.anInt4635, 0);
			}
		}
		if (local95) {
			local140.method6215(super.aByte69, super.aByte66, super.aByte67, super.aByte68 & 0xFF);
		}
		@Pc(252) Class39 local252;
		@Pc(270) boolean local270;
		@Pc(272) int local272;
		@Pc(319) Class182 local319;
		@Pc(329) int local329;
		@Pc(331) int local331;
		@Pc(333) int local333;
		@Pc(420) int local420;
		@Pc(449) int local449;
		@Pc(461) int local461;
		@Pc(465) int local465;
		@Pc(475) int local475;
		if (super.anInt4556 == -1 || super.anInt4608 == -1) {
			super.aClass182Array3[1] = null;
		} else {
			local252 = Static460.aClass155_2.method3363(super.anInt4556);
			local270 = local252.aByte22 == 3 && (local51 != 0 || local54 != 0);
			local272 = local12;
			if (local270) {
				local272 = local12 | 0x7;
			} else {
				if (super.anInt4626 != 0) {
					local272 = local12 | 0x5;
				}
				if (super.anInt4562 != 0) {
					local272 |= 0x2;
				}
				if (super.anInt4596 != 0) {
					local272 |= 0x7;
				}
			}
			local319 = super.aClass182Array3[1] = local252.method816(arg0, super.anInt4608, Static540.aClass173_2, local272, super.anInt4575, super.anInt4629);
			if (local319 != null) {
				if (super.anInt4596 >= 0) {
					local329 = 0;
					local331 = 0;
					local333 = 0;
					if (local16.anIntArrayArray58 != null && local16.anIntArrayArray58[super.anInt4596] != null) {
						local331 = local16.anIntArrayArray58[super.anInt4596][1];
						local329 = local16.anIntArrayArray58[super.anInt4596][0];
						local333 = local16.anIntArrayArray58[super.anInt4596][2];
					}
					if (local16.anIntArrayArray59 != null && local16.anIntArrayArray59[super.anInt4596] != null) {
						local329 += local16.anIntArrayArray59[super.anInt4596][0];
						local333 += local16.anIntArrayArray59[super.anInt4596][2];
						local331 += local16.anIntArrayArray59[super.anInt4596][1];
					}
					if (local333 != 0 || local329 != 0) {
						local420 = local106;
						if (super.anIntArray301 != null && super.anIntArray301[super.anInt4596] != -1) {
							local420 = super.anIntArray301[super.anInt4596];
						}
						local449 = local420 + super.anInt4626 * 2048 - local106 & 0x3FFF;
						if (local449 != 0) {
							local319.a(local449);
						}
						local461 = Canvas_Sub1.anIntArray497[local449];
						local465 = Canvas_Sub1.anIntArray498[local449];
						local475 = local465 * local329 + local461 * local333 >> 14;
						local333 = local333 * local465 - local461 * local329 >> 14;
						local329 = local475;
					}
					local319.H(local329, local331, local333);
				} else if (super.anInt4626 != 0) {
					local319.a(super.anInt4626 * 2048);
				}
				if (super.anInt4562 != 0) {
					local319.H(0, -super.anInt4562 << 2, 0);
				}
				if (local270) {
					if (super.anInt4586 != 0) {
						local319.FA(super.anInt4586);
					}
					if (super.anInt4593 != 0) {
						local319.VA(super.anInt4593);
					}
					if (super.anInt4635 != 0) {
						local319.H(0, super.anInt4635, 0);
					}
				}
			}
		}
		if (super.anInt4624 == -1 || super.anInt4592 == -1) {
			super.aClass182Array3[2] = null;
		} else {
			local252 = Static460.aClass155_2.method3363(super.anInt4624);
			local270 = local252.aByte22 == 3 && (local51 != 0 || local54 != 0);
			local272 = local12;
			if (local270) {
				local272 = local12 | 0x7;
			} else {
				if (super.anInt4633 != 0) {
					local272 = local12 | 0x5;
				}
				if (super.anInt4560 != 0) {
					local272 |= 0x2;
				}
				if (super.anInt4558 != 0) {
					local272 |= 0x7;
				}
			}
			local319 = super.aClass182Array3[2] = local252.method819(arg0, super.anInt4592, super.anInt4561, local272, Static540.aClass173_2, super.anInt4603);
			if (local319 != null) {
				if (super.anInt4558 >= 0 && local16.anIntArrayArray58 != null && local16.anIntArrayArray58[super.anInt4558] != null) {
					local329 = 0;
					local331 = 0;
					local333 = 0;
					if (local16.anIntArrayArray58 != null && local16.anIntArrayArray58[super.anInt4558] != null) {
						local331 = local16.anIntArrayArray58[super.anInt4558][1];
						local329 = local16.anIntArrayArray58[super.anInt4558][0];
						local333 = local16.anIntArrayArray58[super.anInt4558][2];
					}
					if (local16.anIntArrayArray59 != null && local16.anIntArrayArray59[super.anInt4558] != null) {
						local331 += local16.anIntArrayArray59[super.anInt4558][1];
						local333 += local16.anIntArrayArray59[super.anInt4558][2];
						local329 += local16.anIntArrayArray59[super.anInt4558][0];
					}
					if (local333 != 0 || local329 != 0) {
						local420 = local106;
						if (super.anIntArray301 != null && super.anIntArray301[super.anInt4558] != -1) {
							local420 = super.anIntArray301[super.anInt4558];
						}
						local449 = local420 + super.anInt4633 * 2048 - local106 & 0x3FFF;
						if (local449 != 0) {
							local319.a(local449);
						}
						local461 = Canvas_Sub1.anIntArray497[local449];
						local465 = Canvas_Sub1.anIntArray498[local449];
						local475 = local465 * local329 + local461 * local333 >> 14;
						local333 = local333 * local465 - local329 * local461 >> 14;
						local329 = local475;
					}
					local319.H(local329, local331, local333);
				} else if (super.anInt4633 != 0) {
					local319.a(super.anInt4633 * 2048);
				}
				if (super.anInt4560 != 0) {
					local319.H(0, -super.anInt4560 << 2, 0);
				}
				if (local270) {
					if (super.anInt4586 != 0) {
						local319.FA(super.anInt4586);
					}
					if (super.anInt4593 != 0) {
						local319.VA(super.anInt4593);
					}
					if (super.anInt4635 != 0) {
						local319.H(0, super.anInt4635, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!am", name = "o", descriptor = "(I)Z")
	public boolean method401() {
		return this.aClass150_1 != null;
	}

	@OriginalMember(owner = "client!am", name = "l", descriptor = "(I)I")
	@Override
	public int method3962() {
		if (this.aClass150_1.anIntArray262 != null) {
			@Pc(13) Class150 local13 = this.aClass150_1.method3196(Static431.aClass205_1);
			if (local13 != null && local13.anInt3802 != -1) {
				return local13.anInt3802;
			}
		}
		return this.aClass150_1.anInt3802;
	}

	@OriginalMember(owner = "client!am", name = "p", descriptor = "(I)Z")
	private boolean method402() {
		return this.aClass150_1.aBoolean272;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8404() {
		return false;
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(I)I")
	@Override
	public int method3961() {
		if (this.aClass150_1.anIntArray262 != null) {
			@Pc(13) Class150 local13 = this.aClass150_1.method3196(Static431.aClass205_1);
			if (local13 != null && local13.lb != -1) {
				return local13.lb;
			}
		}
		return this.aClass150_1.lb == -1 ? super.method3961() : this.aClass150_1.lb;
	}

	@OriginalMember(owner = "client!am", name = "h", descriptor = "(I)I")
	@Override
	public int method8405() {
		return this.aClass150_1 == null ? 0 : this.aClass150_1.anInt3804;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)I")
	@Override
	protected int method3951() {
		if (this.aClass150_1.anIntArray262 != null) {
			@Pc(20) Class150 local20 = this.aClass150_1.method3196(Static431.aClass205_1);
			if (local20 != null && local20.anInt3776 != -1) {
				return local20.anInt3776;
			}
		}
		return this.aClass150_1.anInt3776;
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8415(@OriginalArg(1) Class95 arg0) {
		if (this.aClass150_1 == null || !super.aBoolean321 && !this.method399(arg0, 0)) {
			return;
		}
		@Pc(20) Class177 local20 = arg0.method6967();
		local20.method7877(super.aClass116_7.method2590());
		local20.method7872(super.anInt10090, super.anInt10097 - 20, super.anInt10089);
		this.method3960(super.aClass182Array3, local20, arg0, super.aBoolean321);
		super.aClass182Array3[0] = super.aClass182Array3[1] = super.aClass182Array3[2] = null;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8400(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass150_1 == null || !this.method399(arg0, 131072)) {
			return false;
		}
		@Pc(19) Class177 local19 = arg0.method6967();
		@Pc(30) int local30 = super.aClass116_7.method2590();
		local19.method7877(local30);
		local19.method7872(super.anInt10090, super.anInt10097, super.anInt10089);
		@Pc(43) boolean local43 = false;
		for (@Pc(45) int local45 = 0; local45 < super.aClass182Array3.length; local45++) {
			if (super.aClass182Array3[local45] != null) {
				@Pc(69) boolean var10000;
				label41: {
					if (this.aClass150_1.anInt3804 <= 0) {
						label39: {
							if (this.aClass150_1.anInt3782 == -1) {
								if (this.aClass150_1.anInt3793 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass150_1.anInt3782 == 1) {
									break label39;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label41;
							}
						}
					}
					var10000 = true;
				}
				@Pc(84) boolean local84 = var10000;
				@Pc(99) boolean local99;
				if (Static449.aBoolean538) {
					local99 = super.aClass182Array3[local45].method6203(arg1, arg2, local19, local84, this.aClass150_1.anInt3804, Static638.anInt7982);
				} else {
					local99 = super.aClass182Array3[local45].method6205(arg1, arg2, local19, local84, this.aClass150_1.anInt3804);
				}
				if (local99) {
					local43 = true;
					break;
				}
			}
		}
		super.aClass182Array3[0] = super.aClass182Array3[1] = super.aClass182Array3[2] = null;
		return local43;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!iea;I)V")
	public void method405(@OriginalArg(0) Class150 arg0) {
		this.aClass150_1 = arg0;
		if (super.aClass13_Sub9_3 != null) {
			super.aClass13_Sub9_3.method5652();
		}
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(B)V")
	@Override
	public void method8414() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(ILclient!ha;)Lclient!gp;")
	@Override
	public Class128 method8412(@OriginalArg(1) Class95 arg0) {
		return null;
	}
}
