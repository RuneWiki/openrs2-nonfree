import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class8_Sub3_Sub3_Sub1_Sub1 extends Class8_Sub3_Sub3_Sub1 {

	@OriginalMember(owner = "client!de", name = "Kc", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!de", name = "Yc", descriptor = "I")
	public int anInt1729;

	@OriginalMember(owner = "client!de", name = "cd", descriptor = "I")
	private int anInt1733;

	@OriginalMember(owner = "client!de", name = "qd", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!de", name = "yd", descriptor = "I")
	public int anInt1749;

	@OriginalMember(owner = "client!de", name = "Cd", descriptor = "Lclient!kga;")
	public Class190 aClass190_1;

	@OriginalMember(owner = "client!de", name = "ad", descriptor = "I")
	public int anInt1731 = 0;

	@OriginalMember(owner = "client!de", name = "Mc", descriptor = "B")
	private byte aByte50 = 0;

	@OriginalMember(owner = "client!de", name = "gd", descriptor = "I")
	public int anInt1736 = 0;

	@OriginalMember(owner = "client!de", name = "kd", descriptor = "Z")
	public boolean aBoolean135 = false;

	@OriginalMember(owner = "client!de", name = "Wc", descriptor = "I")
	public int anInt1727 = -1;

	@OriginalMember(owner = "client!de", name = "Jc", descriptor = "I")
	public int anInt1718 = -1;

	@OriginalMember(owner = "client!de", name = "Xc", descriptor = "I")
	public int anInt1728 = -1;

	@OriginalMember(owner = "client!de", name = "ld", descriptor = "I")
	public int anInt1740 = -1;

	@OriginalMember(owner = "client!de", name = "md", descriptor = "I")
	public int anInt1741 = 0;

	@OriginalMember(owner = "client!de", name = "Qc", descriptor = "B")
	private byte aByte51 = 0;

	@OriginalMember(owner = "client!de", name = "ud", descriptor = "I")
	public int anInt1746 = -1;

	@OriginalMember(owner = "client!de", name = "Rc", descriptor = "Z")
	public boolean aBoolean134 = false;

	@OriginalMember(owner = "client!de", name = "od", descriptor = "I")
	public int anInt1742 = -1;

	@OriginalMember(owner = "client!de", name = "nd", descriptor = "B")
	private byte aByte52 = 0;

	@OriginalMember(owner = "client!de", name = "Gd", descriptor = "I")
	public int anInt1756 = -1;

	@OriginalMember(owner = "client!de", name = "Fd", descriptor = "I")
	public int anInt1755 = 255;

	@OriginalMember(owner = "client!de", name = "fd", descriptor = "I")
	public int anInt1735 = 0;

	@OriginalMember(owner = "client!de", name = "Id", descriptor = "Z")
	public boolean aBoolean137 = false;

	@OriginalMember(owner = "client!de", name = "Hd", descriptor = "Z")
	public boolean aBoolean136 = false;

	@OriginalMember(owner = "client!de", name = "Dd", descriptor = "I")
	public int anInt1753 = -1;

	@OriginalMember(owner = "client!de", name = "vd", descriptor = "I")
	public int anInt1747 = 0;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(ILclient!r;)Lclient!nu;")
	@Override
	public Class242 method7627(@OriginalArg(1) Class134 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!da;Lclient!r;IIILclient!q;)V")
	private void method1435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class63 arg2, @OriginalArg(3) Class134 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class113 arg6) {
		@Pc(11) int local11 = arg5 * arg5 + arg1 * arg1;
		if (local11 < 262144 || local11 > arg0) {
			return;
		}
		@Pc(31) int local31 = (int) (Math.atan2((double) arg1, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(43) Class63 local43 = Static325.method4455(arg3, super.anInt6809, super.anInt6854, arg4, local31, super.anInt6817);
		if (local43 != null) {
			arg3.ZA(false);
			local43.method7429(arg6, null, 0);
			arg3.ZA(true);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7626(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass190_1 == null || !this.method1436(131072, arg1)) {
			return false;
		}
		@Pc(26) Class113 local26 = arg1.method6963();
		@Pc(31) int local31 = super.aClass108_7.method2164();
		local26.o(local31);
		local26.U(super.anInt9365, super.anInt9361, super.anInt9370);
		@Pc(44) boolean local44 = false;
		for (@Pc(46) int local46 = 0; local46 < super.aClass63Array3.length; local46++) {
			if (super.aClass63Array3[local46] != null && (Static181.aBoolean242 ? super.aClass63Array3[local46].method7419(arg2, arg0, local26, true, Static40.anInt631) : super.aClass63Array3[local46].method7415(arg2, arg0, local26, true))) {
				local44 = true;
				break;
			}
		}
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = null;
		return local44;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)I")
	@Override
	protected int method5431() {
		return this.anInt1733;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7625(@OriginalArg(1) Class134 arg0) {
		if (this.aClass190_1 == null || !super.aBoolean555 && !this.method1436(0, arg0)) {
			return;
		}
		@Pc(22) Class113 local22 = arg0.method6963();
		local22.o(super.aClass108_7.method2164());
		local22.U(super.anInt9365, super.anInt9361 - 5, super.anInt9370);
		this.method5430(super.aBoolean555, arg0, super.aClass63Array3, local22);
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!r;)Z")
	private boolean method1436(@OriginalArg(0) int arg0, @OriginalArg(2) Class134 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class140 local11 = this.method5425();
		@Pc(26) Class290 local26 = super.anInt6822 != -1 && super.anInt6785 == 0 ? Static192.aClass211_1.method4277(super.anInt6822) : null;
		@Pc(46) Class290 local46 = super.anInt6829 == -1 || this.aBoolean134 || super.aBoolean553 && local26 != null ? null : Static192.aClass211_1.method4277(super.anInt6829);
		@Pc(49) int local49 = local11.anInt3607;
		@Pc(52) int local52 = local11.anInt3611;
		if (local49 != 0 || local52 != 0 || local11.anInt3624 != 0 || local11.anInt3599 != 0) {
			arg0 |= 0x7;
		}
		@Pc(90) boolean local90 = super.aByte94 != 0 && Static301.anInt5197 >= super.anInt6831 && Static301.anInt5197 < super.anInt6795;
		if (local90) {
			arg0 |= 0x80000;
		}
		@Pc(138) Class63 local138 = super.aClass63Array3[0] = this.aClass190_1.method3834(local46, super.anInt6849, Static175.aClass114_4, Static430.aClass321_1, super.aClass255Array3, super.anInt6803, arg0, arg1, super.anInt6814, super.anInt6826, Static192.aClass211_1, Static384.aClass305_1, Static22.aClass71_1, local26, super.anInt6800, super.anInt6825, Static322.aClass326_2);
		@Pc(141) int local141 = Static419.method5826();
		if (Static117.anInt2297 < 96 && local141 > 50) {
			Static580.method7776();
		}
		@Pc(174) int local174;
		if (Static199.aClass308_3 != Static357.aClass308_6 && local141 < 50) {
			local174 = 50 - local141;
			while (local174 > Static356.anInt5940) {
				Static154.aByteArrayArray14[Static356.anInt5940] = new byte[102400];
				Static356.anInt5940++;
			}
			while (Static356.anInt5940 > local174) {
				Static356.anInt5940--;
				Static154.aByteArrayArray14[Static356.anInt5940] = null;
			}
		} else if (Static357.aClass308_6 != Static199.aClass308_3) {
			Static154.aByteArrayArray14 = new byte[50][];
			Static356.anInt5940 = 0;
		}
		if (local138 == null) {
			return false;
		}
		super.anInt6813 = local138.J();
		super.anInt6844 = local138.RA();
		this.method5438(local138);
		local174 = super.aClass108_7.method2164();
		if (local49 == 0 && local52 == 0) {
			this.method5426(this.method5434() << 9, 0, this.method5434() << 9, 0, local174);
		} else {
			this.method5426(local49, local11.anInt3617, local52, local11.anInt3627, local174);
			if (super.anInt6817 != 0) {
				local138.MA(super.anInt6817);
			}
			if (super.anInt6809 != 0) {
				local138.W(super.anInt6809);
			}
			if (super.anInt6854 != 0) {
				local138.oa(0, super.anInt6854, 0);
			}
		}
		if (local90) {
			local138.method7418(super.lb, super.aByte92, super.aByte93, super.aByte94 & 0xFF);
		}
		@Pc(327) Class60 local327;
		@Pc(345) boolean local345;
		@Pc(347) int local347;
		@Pc(390) Class63 local390;
		if (this.aBoolean134 || super.anInt6830 == -1 || super.anInt6801 == -1) {
			super.aClass63Array3[1] = null;
		} else {
			local327 = Static107.aClass200_3.method3956(super.anInt6830);
			local345 = local327.aByte33 == 3 && (local49 != 0 || local52 != 0);
			local347 = local7;
			if (local345) {
				local347 = local7 | 0x7;
			} else {
				if (super.anInt6786 != 0) {
					local347 = local7 | 0x5;
				}
				if (super.anInt6787 != 0) {
					local347 |= 0x2;
				}
			}
			local390 = super.aClass63Array3[1] = local327.method1219(super.anInt6802, Static192.aClass211_1, super.anInt6801, arg1, local347, super.anInt6775);
			if (local390 != null) {
				if (super.anInt6787 != 0) {
					local390.oa(0, -super.anInt6787 << 2, 0);
				}
				if (super.anInt6786 != 0) {
					local390.M(super.anInt6786 * 2048);
				}
				if (local345) {
					if (super.anInt6817 != 0) {
						local390.MA(super.anInt6817);
					}
					if (super.anInt6809 != 0) {
						local390.W(super.anInt6809);
					}
					if (super.anInt6854 != 0) {
						local390.oa(0, super.anInt6854, 0);
					}
				}
			}
		}
		if (this.aBoolean134 || super.anInt6782 == -1 || super.anInt6807 == -1) {
			super.aClass63Array3[2] = null;
		} else {
			local327 = Static107.aClass200_3.method3956(super.anInt6782);
			local345 = local327.aByte33 == 3 && (local49 != 0 || local52 != 0);
			local347 = local7;
			if (local345) {
				local347 = local7 | 0x7;
			} else {
				if (super.anInt6833 != 0) {
					local347 = local7 | 0x5;
				}
				if (super.anInt6855 != 0) {
					local347 |= 0x2;
				}
			}
			local390 = super.aClass63Array3[2] = local327.method1216(super.anInt6848, Static192.aClass211_1, local347, super.anInt6807, arg1, super.anInt6838);
			if (local390 != null) {
				if (super.anInt6855 != 0) {
					local390.oa(0, -super.anInt6855 << 2, 0);
				}
				if (super.anInt6833 != 0) {
					local390.M(super.anInt6833 * 2048);
				}
				if (local345) {
					if (super.anInt6817 != 0) {
						local390.MA(super.anInt6817);
					}
					if (super.anInt6809 != 0) {
						local390.W(super.anInt6809);
					}
					if (super.anInt6854 != 0) {
						local390.oa(0, super.anInt6854, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!de", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7629() {
		return false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IBLclient!r;ILclient!q;Lclient!da;III)V")
	private void method1437(@OriginalArg(0) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class113 arg3, @OriginalArg(5) Class63 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg5 * arg5 + arg6 * arg6;
		if (local11 < 262144 || local11 > arg7) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg5, (double) arg6) * 2607.5945876176133D) & 0x3FFF;
		@Pc(45) Class63 local45 = Static325.method4455(arg1, super.anInt6809, super.anInt6854, arg2, local33, super.anInt6817);
		if (local45 != null) {
			arg1.ZA(false);
			local45.method7420(arg3, null, arg0, 0);
			arg1.ZA(true);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method1438() {
		@Pc(7) String local7 = "";
		if (Static404.aStringArray30 != null) {
			local7 = local7 + Static404.aStringArray30[this.aByte51];
		}
		@Pc(29) int[] local29;
		if (this.aByte52 == 1 && Static359.anIntArray434 != null) {
			local29 = Static359.anIntArray434;
		} else {
			local29 = Static139.anIntArray225;
		}
		if (local29 != null && local29[this.aByte51] != -1) {
			@Pc(50) Class289 local50 = Static243.aClass118_1.method2290(local29[this.aByte51]);
			if (local50.aChar5 == 's') {
				local7 = local7 + local50.method6237(this.aByte50 & 0xFF);
			} else {
				Static345.method4708(new Throwable(), "gdn1");
				local29[this.aByte51] = -1;
			}
		}
		local7 = local7 + this.aString15;
		if (Static161.aStringArray17 != null) {
			local7 = local7 + Static161.aStringArray17[this.aByte51];
		}
		return local7;
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
	@Override
	public void method7617() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Lclient!r;Z)Lclient!kq;")
	@Override
	public Class8_Sub5 method7630(@OriginalArg(0) Class134 arg0) {
		if (this.aClass190_1 == null || !this.method1436(2048, arg0)) {
			return null;
		}
		@Pc(19) Class113 local19 = arg0.method6963();
		@Pc(24) int local24 = super.aClass108_7.method2164();
		local19.o(local24);
		@Pc(42) Class39 local42 = Static292.aClass39ArrayArrayArray2[super.aByte123][super.anInt9365 >> Static351.anInt5832][super.anInt9370 >> Static351.anInt5832];
		@Pc(54) int local54;
		if (local42 == null || local42.aClass8_Sub3_Sub1_1 == null) {
			super.anInt6818 = (int) ((float) super.anInt6818 - (float) super.anInt6818 / 10.0F);
		} else {
			local54 = super.anInt6818 - local42.aClass8_Sub3_Sub1_1.aShort37;
			super.anInt6818 = (int) ((float) super.anInt6818 - (float) local54 / 10.0F);
		}
		local19.U(super.anInt9365, -super.anInt6818 + super.anInt9361 - 20, super.anInt9370);
		super.aBoolean554 = false;
		if (Static348.aClass1_Sub30_Sub1_1.aBoolean395) {
			@Pc(103) Class140 local103 = this.method5425();
			if (local103.aBoolean271 && (this.aClass190_1.anInt4734 == -1 || Static322.aClass326_2.method7234(this.aClass190_1.anInt4734).aBoolean32)) {
				@Pc(134) Class290 local134 = super.anInt6822 != -1 && super.anInt6785 == 0 ? Static192.aClass211_1.method4277(super.anInt6822) : null;
				@Pc(155) Class290 local155 = super.anInt6829 == -1 || this.aBoolean134 || super.aBoolean553 && local134 != null ? null : Static192.aClass211_1.method4277(super.anInt6829);
				@Pc(187) Class63 local187 = Static161.method2367(super.aClass63Array3[0], super.anInt6817, 1, local155 == null ? local134 : local155, 0, 160, 0, 240, local155 == null ? super.anInt6803 : super.anInt6800, local24, arg0, super.anInt6854, super.anInt6809);
				if (local187 != null) {
					super.aBoolean554 = true;
					arg0.ZA(false);
					if (Static181.aBoolean242) {
						local187.method7420(local19, null, Static40.anInt631, 0);
					} else {
						local187.method7429(local19, null, 0);
					}
					arg0.ZA(true);
				}
			}
		}
		if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == this) {
			local19.NA(super.anInt9365, super.anInt9361, super.anInt9370);
			for (local54 = Static41.aClass154Array1.length - 1; local54 >= 0; local54--) {
				@Pc(235) Class154 local235 = Static41.aClass154Array1[local54];
				if (local235 != null && local235.anInt4118 != -1) {
					@Pc(265) int local265;
					if (local235.anInt4116 == 1) {
						@Pc(254) Class1_Sub42 local254 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local235.anInt4115);
						if (local254 != null) {
							@Pc(259) Class8_Sub3_Sub3_Sub1_Sub2 local259 = local254.aClass8_Sub3_Sub3_Sub1_Sub2_2;
							local265 = local259.anInt9365 - Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365;
							@Pc(272) int local272 = local259.anInt9370 - Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370;
							if (Static181.aBoolean242) {
								this.method1437(Static40.anInt631, arg0, local235.anInt4118, local19, super.aClass63Array3[0], local265, local272, 92160000);
							} else {
								this.method1435(92160000, local265, super.aClass63Array3[0], arg0, local235.anInt4118, local272, local19);
							}
						}
					}
					@Pc(329) int local329;
					if (local235.anInt4116 == 2) {
						@Pc(320) int local320 = local235.anInt4120 + 256 - Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365;
						local329 = local235.anInt4114 + 256 - Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370;
						local265 = local235.anInt4107 << 9;
						local265 *= local265;
						if (Static181.aBoolean242) {
							this.method1437(Static40.anInt631, arg0, local235.anInt4118, local19, super.aClass63Array3[0], local320, local329, local265);
						} else {
							this.method1435(local265, local320, super.aClass63Array3[0], arg0, local235.anInt4118, local329, local19);
						}
					}
					if (local235.anInt4116 == 10 && local235.anInt4115 >= 0 && local235.anInt4115 < Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1.length) {
						@Pc(393) Class8_Sub3_Sub3_Sub1_Sub1 local393 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local235.anInt4115];
						if (local393 != null) {
							local329 = local393.anInt9365 - Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365;
							local265 = local393.anInt9370 - Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370;
							if (Static181.aBoolean242) {
								this.method1437(Static40.anInt631, arg0, local235.anInt4118, local19, super.aClass63Array3[0], local329, local265, 92160000);
							} else {
								this.method1435(92160000, local329, super.aClass63Array3[0], arg0, local235.anInt4118, local265, local19);
							}
						}
					}
				}
			}
			local19.o(local24);
			local19.U(super.anInt9365, super.anInt9361, super.anInt9370);
		}
		local19.o(local24);
		local19.U(super.anInt9365, -super.anInt6818 + super.anInt9361 - 5, super.anInt9370);
		@Pc(482) Class8_Sub5 local482 = Static418.method5818(super.aClass63Array3.length);
		this.method5430(false, arg0, super.aClass63Array3, local19);
		@Pc(494) int local494;
		if (Static181.aBoolean242) {
			for (local494 = 0; super.aClass63Array3.length > local494; local494++) {
				if (super.aClass63Array3[local494] != null) {
					super.aClass63Array3[local494].method7420(local19, local482.aClass8_Sub4Array1[local494], Static40.anInt631, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local494 = 0; super.aClass63Array3.length > local494; local494++) {
				if (super.aClass63Array3[local494] != null) {
					super.aClass63Array3[local494].method7429(local19, local482.aClass8_Sub4Array1[local494], Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass8_Sub7_7 != null) {
			@Pc(571) Class343 local571 = super.aClass8_Sub7_7.method4402();
			if (Static181.aBoolean242) {
				arg0.method6947(local571, Static40.anInt631);
			} else {
				arg0.method6940(local571);
			}
		}
		for (local494 = 0; super.aClass63Array3.length > local494; local494++) {
			if (super.aClass63Array3[local494] != null) {
				super.aBoolean554 |= super.aClass63Array3[local494].LA();
			}
		}
		super.anInt6834 = Static350.anInt5818;
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = null;
		return local482;
	}

	@OriginalMember(owner = "client!de", name = "p", descriptor = "(I)I")
	@Override
	public int method5440() {
		return -1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZLclient!r;Lclient!rga;IIZ)V")
	@Override
	public void method7623(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class8_Sub3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BIII)V")
	public void method1439(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6822 != -1 && Static192.aClass211_1.method4277(super.anInt6822).anInt7796 == 1) {
			super.anIntArray532 = null;
			super.anInt6822 = -1;
		}
		@Pc(34) Class60 local34;
		if (super.anInt6830 != -1) {
			local34 = Static107.aClass200_3.method3956(super.anInt6830);
			if (local34.aBoolean111 && local34.anInt1383 != -1 && Static192.aClass211_1.method4277(local34.anInt1383).anInt7796 == 1) {
				super.anInt6830 = -1;
			}
		}
		if (super.anInt6782 != -1) {
			local34 = Static107.aClass200_3.method3956(super.anInt6782);
			if (local34.aBoolean111 && local34.anInt1383 != -1 && Static192.aClass211_1.method4277(local34.anInt1383).anInt7796 == 1) {
				super.anInt6782 = -1;
			}
		}
		this.anInt1728 = -1;
		if (arg1 < 0 || Static71.anInt1410 <= arg1 || arg2 < 0 || arg2 >= Static471.anInt8012) {
			this.method1444(arg2, arg1);
		} else if (super.anIntArray534[0] >= 0 && super.anIntArray534[0] < Static71.anInt1410 && super.anIntArray533[0] >= 0 && Static471.anInt8012 > super.anIntArray533[0]) {
			if (arg0 == 2) {
				Static229.method3479(this, arg2, arg1);
			}
			this.method1445(arg0, arg2, arg1);
		} else {
			this.method1444(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(B)I")
	@Override
	public int method5434() {
		return this.aClass190_1 == null || this.aClass190_1.anInt4734 == -1 ? super.method5434() : Static322.aClass326_2.method7234(this.aClass190_1.anInt4734).anInt350;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method1441() {
		return this.aString16;
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(B)Z")
	public boolean method1442() {
		return this.aClass190_1 != null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!mo;I)V")
	public void method1443(@OriginalArg(0) Class1_Sub35 arg0) {
		arg0.anInt7214 = 0;
		@Pc(12) int local12 = arg0.method5750();
		this.aByte52 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean136;
		this.aBoolean136 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method5434();
		this.method5429((local12 >> 3 & 0x7) + 1);
		this.aByte51 = (byte) (local12 >> 6 & 0x3);
		super.anInt9365 += this.method5434() - local45 << 8;
		super.anInt9370 += this.method5434() - local45 << 8;
		this.aByte50 = arg0.method5751();
		this.anInt1740 = arg0.method5751();
		this.anInt1718 = arg0.method5751();
		this.anInt1735 = 0;
		@Pc(109) int local109 = -1;
		@Pc(112) int[] local112 = new int[12];
		@Pc(132) int local132;
		@Pc(138) int local138;
		@Pc(178) int local178;
		for (@Pc(114) int local114 = 0; local114 < 12; local114++) {
			@Pc(120) int local120 = arg0.method5750();
			if (local120 == 0) {
				local112[local114] = 0;
			} else {
				local132 = arg0.method5750();
				local138 = local132 + (local120 << 8);
				if (local114 == 0 && local138 == 65535) {
					local109 = arg0.method5771();
					this.anInt1735 = arg0.method5750();
					break;
				}
				if (local138 >= 32768) {
					local138 = Static264.anIntArray368[local138 - 32768];
					local112[local114] = local138 | 0x40000000;
					local178 = Static175.aClass114_4.method2217(local138).anInt6181;
					if (local178 != 0) {
						this.anInt1735 = local178;
					}
				} else {
					local112[local114] = Integer.MIN_VALUE | local138 - 256;
				}
			}
		}
		@Pc(203) int[] local203 = new int[5];
		for (local132 = 0; local132 < 5; local132++) {
			local138 = arg0.method5750();
			if (Static261.aShortArrayArrayArray1.length < 1 || local138 < 0 || Static261.aShortArrayArrayArray1[0][local132].length <= local138) {
				local138 = 0;
			}
			local203[local132] = local138;
		}
		this.anInt1733 = arg0.method5771();
		this.aString15 = arg0.method5760();
		this.aString16 = this.aString15;
		this.anInt1736 = arg0.method5750();
		if (local41) {
			this.anInt1741 = arg0.method5771();
			this.anInt1746 = -1;
			if (this.anInt1741 == 65535) {
				this.anInt1741 = -1;
			}
			this.anInt1731 = this.anInt1736;
		} else {
			this.anInt1741 = 0;
			this.anInt1731 = arg0.method5750();
			this.anInt1746 = arg0.method5750();
			if (this.anInt1746 == 255) {
				this.anInt1746 = -1;
			}
		}
		local138 = this.anInt1747;
		this.anInt1747 = arg0.method5750();
		@Pc(336) int local336;
		if (this.anInt1747 == 0) {
			Static572.method7711(this);
		} else {
			local178 = this.anInt1756;
			@Pc(333) int local333 = this.anInt1727;
			local336 = this.anInt1753;
			@Pc(339) int local339 = this.anInt1742;
			@Pc(342) int local342 = this.anInt1755;
			this.anInt1756 = arg0.method5771();
			this.anInt1727 = arg0.method5771();
			this.anInt1753 = arg0.method5771();
			this.anInt1742 = arg0.method5771();
			this.anInt1755 = arg0.method5750();
			if (this.aBoolean136 != local21 || local138 != this.anInt1747 || local178 != this.anInt1756 || this.anInt1727 != local333 || local336 != this.anInt1753 || this.anInt1742 != local339 || this.anInt1755 != local342) {
				Static164.method7466(this);
			}
		}
		if (this.aClass190_1 == null) {
			this.aClass190_1 = new Class190();
		}
		local178 = this.aClass190_1.anInt4734;
		@Pc(430) int[] local430 = this.aClass190_1.anIntArray369;
		this.aClass190_1.method3832(this.method5431(), local203, this.aByte52 == 1, local112, local109);
		if (local178 != local109) {
			super.anInt9365 = (super.anIntArray534[0] << 9) + (this.method5434() << 8);
			super.anInt9370 = (super.anIntArray533[0] << 9) + (this.method5434() << 8);
		}
		if (Static296.anInt5113 == super.anInt6821 && local430 != null) {
			for (local336 = 0; local336 < local203.length; local336++) {
				if (local430[local336] != local203[local336]) {
					Static175.aClass114_4.method2218();
					break;
				}
			}
		}
		if (super.aClass8_Sub7_7 != null) {
			super.aClass8_Sub7_7.method4401();
		}
		if (super.anInt6829 == -1 || !super.aBoolean553) {
			return;
		}
		@Pc(538) Class140 local538 = this.method5425();
		if (!local538.method2954(super.anInt6829)) {
			super.anInt6829 = -1;
			super.aBoolean553 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
	public void method1444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anIntArray534[0] = arg1;
		super.anInt6859 = 0;
		super.anInt6856 = 0;
		super.anInt6858 = 0;
		super.anIntArray533[0] = arg0;
		@Pc(35) int local35 = this.method5434();
		super.anInt9370 = super.anIntArray533[0] * 512 + local35 * 256;
		super.anInt9365 = local35 * 256 + super.anIntArray534[0] * 512;
		if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == this) {
			Static475.method6481();
		}
		if (super.aClass8_Sub7_7 != null) {
			super.aClass8_Sub7_7.method4401();
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(BIII)V")
	public void method1445(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6859 < 9) {
			super.anInt6859++;
		}
		for (@Pc(18) int local18 = super.anInt6859; local18 > 0; local18--) {
			super.anIntArray534[local18] = super.anIntArray534[local18 - 1];
			super.anIntArray533[local18] = super.anIntArray533[local18 - 1];
			super.aByteArray82[local18] = super.aByteArray82[local18 - 1];
		}
		super.anIntArray534[0] = arg2;
		super.aByteArray82[0] = arg0;
		super.anIntArray533[0] = arg1;
	}
}
