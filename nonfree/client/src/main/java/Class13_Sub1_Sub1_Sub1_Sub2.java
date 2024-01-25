import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class13_Sub1_Sub1_Sub1_Sub2 extends Class13_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!kc", name = "qd", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!kc", name = "td", descriptor = "I")
	private int anInt4659;

	@OriginalMember(owner = "client!kc", name = "xd", descriptor = "Lclient!me;")
	public Class218 aClass218_1;

	@OriginalMember(owner = "client!kc", name = "yd", descriptor = "I")
	public int anInt4662;

	@OriginalMember(owner = "client!kc", name = "Id", descriptor = "I")
	public int anInt4671;

	@OriginalMember(owner = "client!kc", name = "Md", descriptor = "Ljava/lang/String;")
	public String aString50;

	@OriginalMember(owner = "client!kc", name = "dd", descriptor = "I")
	public int anInt4645 = -1;

	@OriginalMember(owner = "client!kc", name = "ed", descriptor = "I")
	public int anInt4646 = -1;

	@OriginalMember(owner = "client!kc", name = "ld", descriptor = "B")
	private byte aByte70 = 0;

	@OriginalMember(owner = "client!kc", name = "ad", descriptor = "I")
	public int anInt4642 = 255;

	@OriginalMember(owner = "client!kc", name = "Fd", descriptor = "I")
	public int anInt4668 = -1;

	@OriginalMember(owner = "client!kc", name = "Bd", descriptor = "I")
	public int anInt4665 = 0;

	@OriginalMember(owner = "client!kc", name = "Jd", descriptor = "B")
	private byte aByte71 = 0;

	@OriginalMember(owner = "client!kc", name = "Hd", descriptor = "I")
	public int anInt4670 = 0;

	@OriginalMember(owner = "client!kc", name = "Ed", descriptor = "Z")
	public boolean aBoolean323 = false;

	@OriginalMember(owner = "client!kc", name = "id", descriptor = "I")
	public int anInt4650 = 0;

	@OriginalMember(owner = "client!kc", name = "vd", descriptor = "Z")
	public boolean aBoolean322 = false;

	@OriginalMember(owner = "client!kc", name = "nd", descriptor = "I")
	public int anInt4654 = 0;

	@OriginalMember(owner = "client!kc", name = "zd", descriptor = "I")
	public int anInt4663 = -1;

	@OriginalMember(owner = "client!kc", name = "Pd", descriptor = "I")
	public int anInt4674 = 0;

	@OriginalMember(owner = "client!kc", name = "Ld", descriptor = "Z")
	public boolean aBoolean324 = false;

	@OriginalMember(owner = "client!kc", name = "kd", descriptor = "I")
	public int anInt4652 = -1;

	@OriginalMember(owner = "client!kc", name = "pd", descriptor = "I")
	public int anInt4656 = -1;

	@OriginalMember(owner = "client!kc", name = "Kd", descriptor = "B")
	private byte aByte72 = 0;

	@OriginalMember(owner = "client!kc", name = "Qd", descriptor = "Z")
	public boolean aBoolean325 = false;

	@OriginalMember(owner = "client!kc", name = "Ud", descriptor = "Z")
	public boolean aBoolean326 = false;

	@OriginalMember(owner = "client!kc", name = "Gd", descriptor = "I")
	public int anInt4669 = -1;

	@OriginalMember(owner = "client!kc", name = "Wd", descriptor = "I")
	public int anInt4679 = -1;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(ILclient!ha;)Lclient!gp;")
	@Override
	public Class128 method8412(@OriginalArg(1) Class95 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ha;II)Z")
	private boolean method3967(@OriginalArg(0) Class95 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(19) Class334 local19 = this.method3964();
		@Pc(35) Class81 local35 = super.anInt4559 != -1 && super.anInt4622 == 0 ? Static540.aClass173_2.method3791(super.anInt4559) : null;
		@Pc(56) Class81 local56 = super.anInt4553 == -1 || this.aBoolean326 || super.aBoolean319 && local35 != null ? null : Static540.aClass173_2.method3791(super.anInt4553);
		@Pc(59) int local59 = local19.anInt8947;
		@Pc(62) int local62 = local19.anInt8951;
		if (local59 != 0 || local62 != 0 || local19.anInt8911 != 0 || local19.anInt8955 != 0) {
			arg1 |= 0x7;
		}
		@Pc(87) int local87 = super.aClass116_7.method2590();
		@Pc(106) boolean local106 = super.aByte68 != 0 && super.anInt4577 <= Static262.anInt5597 && super.anInt4618 > Static262.anInt5597;
		if (local106) {
			arg1 |= 0x80000;
		}
		@Pc(150) Class182 local150 = super.aClass182Array3[0] = this.aClass218_1.method4614(Static431.aClass205_1, local35, super.anInt4621, super.anIntArray301, super.anInt4612, Static43.aClass283_1, super.anInt4634, Static540.aClass173_2, Static502.aClass23_2, super.anInt4564, super.aClass250Array3, arg0, Static72.aClass225_2, local87, arg1, super.anInt4628, local56, super.anInt4591, Static409.aClass107_2);
		@Pc(153) int local153 = Static27.method502();
		if (Static234.anInt10094 < 96 && local153 > 50) {
			Static237.method3328();
		}
		if (Static252.aClass80_3 != Static162.aClass80_2 && local153 < 50) {
			@Pc(172) int local172 = 50 - local153;
			while (Static51.anInt1080 < local172) {
				Static565.aByteArrayArray30[Static51.anInt1080] = new byte[102400];
				Static51.anInt1080++;
			}
			while (local172 < Static51.anInt1080) {
				Static51.anInt1080--;
				Static565.aByteArrayArray30[Static51.anInt1080] = null;
			}
		} else if (Static252.aClass80_3 != Static162.aClass80_2) {
			Static565.aByteArrayArray30 = new byte[50][];
			Static51.anInt1080 = 0;
		}
		if (local150 == null) {
			return false;
		}
		super.anInt4581 = local150.fa();
		super.anInt4589 = local150.ma();
		this.method3954(local150);
		if (local59 == 0 && local62 == 0) {
			this.method3959(this.method3950() << 9, this.method3950() << 9, 0, local87, 0);
		} else {
			this.method3959(local62, local59, local19.anInt8923, local87, local19.anInt8950);
			if (super.anInt4586 != 0) {
				local150.FA(super.anInt4586);
			}
			if (super.anInt4593 != 0) {
				local150.VA(super.anInt4593);
			}
			if (super.anInt4635 != 0) {
				local150.H(0, super.anInt4635, 0);
			}
		}
		if (local106) {
			local150.method6215(super.aByte69, super.aByte66, super.aByte67, super.aByte68 & 0xFF);
		}
		@Pc(346) boolean local346;
		@Pc(348) int local348;
		@Pc(401) Class182 local401;
		@Pc(431) int local431;
		@Pc(433) int local433;
		@Pc(435) int local435;
		@Pc(525) int local525;
		@Pc(554) int local554;
		@Pc(566) int local566;
		@Pc(570) int local570;
		@Pc(581) int local581;
		@Pc(328) Class39 local328;
		if (this.aBoolean326 || super.anInt4556 == -1 || super.anInt4608 == -1) {
			super.aClass182Array3[1] = null;
		} else {
			local328 = Static460.aClass155_2.method3363(super.anInt4556);
			local346 = local328.aByte22 == 3 && (local59 != 0 || local62 != 0);
			local348 = local7;
			if (local346) {
				local348 = local7 | 0x7;
			} else {
				if (super.anInt4626 != 0) {
					local348 = local7 | 0x5;
				}
				if (super.anInt4562 != 0) {
					local348 |= 0x2;
				}
				if (super.anInt4596 != 0) {
					local348 |= 0x7;
				}
			}
			local401 = super.aClass182Array3[1] = local328.method816(arg0, super.anInt4608, Static540.aClass173_2, local348, super.anInt4575, super.anInt4629);
			if (local401 != null) {
				if (super.anInt4596 >= 0 && local19.anIntArrayArray58 != null && local19.anIntArrayArray58[super.anInt4596] != null) {
					local431 = 0;
					local433 = 0;
					local435 = 0;
					if (local19.anIntArrayArray58 != null && local19.anIntArrayArray58[super.anInt4596] != null) {
						local433 = local19.anIntArrayArray58[super.anInt4596][1];
						local435 = local19.anIntArrayArray58[super.anInt4596][2];
						local431 = local19.anIntArrayArray58[super.anInt4596][0];
					}
					if (local19.anIntArrayArray59 != null && local19.anIntArrayArray59[super.anInt4596] != null) {
						local431 += local19.anIntArrayArray59[super.anInt4596][0];
						local435 += local19.anIntArrayArray59[super.anInt4596][2];
						local433 += local19.anIntArrayArray59[super.anInt4596][1];
					}
					if (local435 != 0 || local431 != 0) {
						local525 = local87;
						if (super.anIntArray301 != null && super.anIntArray301[super.anInt4596] != -1) {
							local525 = super.anIntArray301[super.anInt4596];
						}
						local554 = local525 + super.anInt4626 * 2048 - local87 & 0x3FFF;
						if (local554 != 0) {
							local401.a(local554);
						}
						local566 = Canvas_Sub1.anIntArray497[local554];
						local570 = Canvas_Sub1.anIntArray498[local554];
						local581 = local435 * local566 + local431 * local570 >> 14;
						local435 = local570 * local435 - local431 * local566 >> 14;
						local431 = local581;
					}
					local401.H(local431, local433, local435);
				} else if (super.anInt4626 != 0) {
					local401.a(super.anInt4626 * 2048);
				}
				if (super.anInt4562 != 0) {
					local401.H(0, -super.anInt4562 << 2, 0);
				}
				if (local346) {
					if (super.anInt4586 != 0) {
						local401.FA(super.anInt4586);
					}
					if (super.anInt4593 != 0) {
						local401.VA(super.anInt4593);
					}
					if (super.anInt4635 != 0) {
						local401.H(0, super.anInt4635, 0);
					}
				}
			}
		}
		if (this.aBoolean326 || super.anInt4624 == -1 || super.anInt4592 == -1) {
			super.aClass182Array3[2] = null;
		} else {
			local328 = Static460.aClass155_2.method3363(super.anInt4624);
			local346 = local328.aByte22 == 3 && (local59 != 0 || local62 != 0);
			local348 = local7;
			if (local346) {
				local348 = local7 | 0x7;
			} else {
				if (super.anInt4633 != 0) {
					local348 = local7 | 0x5;
				}
				if (super.anInt4560 != 0) {
					local348 |= 0x2;
				}
				if (super.anInt4558 != 0) {
					local348 |= 0x7;
				}
			}
			local401 = super.aClass182Array3[2] = local328.method819(arg0, super.anInt4592, super.anInt4561, local348, Static540.aClass173_2, super.anInt4603);
			if (local401 != null) {
				if (super.anInt4558 >= 0 && local19.anIntArrayArray58 != null && local19.anIntArrayArray58[super.anInt4558] != null) {
					local431 = 0;
					local433 = 0;
					local435 = 0;
					if (local19.anIntArrayArray58 != null && local19.anIntArrayArray58[super.anInt4558] != null) {
						local433 = local19.anIntArrayArray58[super.anInt4558][1];
						local431 = local19.anIntArrayArray58[super.anInt4558][0];
						local435 = local19.anIntArrayArray58[super.anInt4558][2];
					}
					if (local19.anIntArrayArray59 != null && local19.anIntArrayArray59[super.anInt4558] != null) {
						local433 += local19.anIntArrayArray59[super.anInt4558][1];
						local431 += local19.anIntArrayArray59[super.anInt4558][0];
						local435 += local19.anIntArrayArray59[super.anInt4558][2];
					}
					if (local435 != 0 || local431 != 0) {
						local525 = local87;
						if (super.anIntArray301 != null && super.anIntArray301[super.anInt4558] != -1) {
							local525 = super.anIntArray301[super.anInt4558];
						}
						local554 = local525 + super.anInt4633 * 2048 - local87 & 0x3FFF;
						if (local554 != 0) {
							local401.a(local554);
						}
						local566 = Canvas_Sub1.anIntArray497[local554];
						local570 = Canvas_Sub1.anIntArray498[local554];
						local581 = local570 * local431 + local566 * local435 >> 14;
						local435 = local435 * local570 - local566 * local431 >> 14;
						local431 = local581;
					}
					local401.H(local431, local433, local435);
				} else if (super.anInt4633 != 0) {
					local401.a(super.anInt4633 * 2048);
				}
				if (super.anInt4560 != 0) {
					local401.H(0, -super.anInt4560 << 2, 0);
				}
				if (local346) {
					if (super.anInt4586 != 0) {
						local401.FA(super.anInt4586);
					}
					if (super.anInt4593 != 0) {
						local401.VA(super.anInt4593);
					}
					if (super.anInt4635 != 0) {
						local401.H(0, super.anInt4635, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ha;IILclient!ka;IBILclient!uha;)V")
	private void method3968(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class182 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class177 arg6) {
		@Pc(18) int local18 = arg4 * arg4 + arg1 * arg1;
		if (local18 < 262144 || arg5 < local18) {
			return;
		}
		@Pc(40) int local40 = (int) (Math.atan2((double) arg1, (double) arg4) * 2607.5945876176133D) & 0x3FFF;
		@Pc(52) Class182 local52 = Static203.method2862(super.anInt4593, arg2, super.anInt4586, super.anInt4635, local40, arg0);
		if (local52 != null) {
			arg0.C(false);
			local52.method6206(arg6, null, 0);
			arg0.C(true);
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8415(@OriginalArg(1) Class95 arg0) {
		if (this.aClass218_1 == null || !super.aBoolean321 && !this.method3967(arg0, 0)) {
			return;
		}
		@Pc(28) Class177 local28 = arg0.method6967();
		local28.method7877(super.aClass116_7.method2590());
		local28.method7872(super.anInt10090, super.anInt10097 - 5, super.anInt10089);
		this.method3960(super.aClass182Array3, local28, arg0, super.aBoolean321);
		super.aClass182Array3[0] = super.aClass182Array3[1] = super.aClass182Array3[2] = null;
	}

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "(I)Z")
	public boolean method3969() {
		return this.aClass218_1 != null;
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(B)V")
	@Override
	public void method8414() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "(I)I")
	@Override
	public int method3962() {
		return -1;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8404() {
		return false;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)I")
	@Override
	public int method3950() {
		return this.aClass218_1 == null || this.aClass218_1.anInt5430 == -1 ? super.method3950() : Static409.aClass107_2.method2291(this.aClass218_1.anInt5430).anInt3793;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBBI)V")
	public void method3970(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4559 != -1 && Static540.aClass173_2.method3791(super.anInt4559).anInt2149 == 1) {
			super.anInt4559 = -1;
			super.anIntArray300 = null;
		}
		@Pc(32) Class39 local32;
		if (super.anInt4556 != -1) {
			local32 = Static460.aClass155_2.method3363(super.anInt4556);
			if (local32.aBoolean74 && local32.anInt1044 != -1 && Static540.aClass173_2.method3791(local32.anInt1044).anInt2149 == 1) {
				super.anInt4556 = -1;
			}
		}
		if (super.anInt4624 != -1) {
			local32 = Static460.aClass155_2.method3363(super.anInt4624);
			if (local32.aBoolean74 && local32.anInt1044 != -1 && Static540.aClass173_2.method3791(local32.anInt1044).anInt2149 == 1) {
				super.anInt4624 = -1;
			}
		}
		this.anInt4652 = -1;
		if (arg2 < 0 || Static228.anInt3704 <= arg2 || arg0 < 0 || Static162.anInt2911 <= arg0) {
			this.method3975(arg0, arg2);
		} else if (super.anIntArray307[0] >= 0 && super.anIntArray307[0] < Static228.anInt3704 && super.anIntArray306[0] >= 0 && Static162.anInt2911 > super.anIntArray306[0]) {
			if (arg1 == 2) {
				Static122.method1774(this, arg2, arg0);
			}
			this.method3971(arg2, arg0, arg1);
		} else {
			this.method3975(arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIB)V")
	public void method3971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt4639 < 9) {
			super.anInt4639++;
		}
		for (@Pc(18) int local18 = super.anInt4639; local18 > 0; local18--) {
			super.anIntArray307[local18] = super.anIntArray307[local18 - 1];
			super.anIntArray306[local18] = super.anIntArray306[local18 - 1];
			super.aByteArray52[local18] = super.aByteArray52[local18 - 1];
		}
		super.anIntArray307[0] = arg0;
		super.aByteArray52[0] = arg2;
		super.anIntArray306[0] = arg1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!vj;I)V")
	public void method3973(@OriginalArg(0) Class2_Sub22 arg0) {
		arg0.anInt10247 = 0;
		@Pc(12) int local12 = arg0.method8547();
		this.aByte70 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean324;
		this.aBoolean324 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(47) int local47 = super.method3950();
		this.method3955((local12 >> 3 & 0x7) + 1);
		this.aByte71 = (byte) (local12 >> 6 & 0x3);
		super.anInt10090 += this.method3950() - local47 << 8;
		super.anInt10089 += this.method3950() - local47 << 8;
		this.aByte72 = arg0.method8548();
		this.anInt4663 = arg0.method8548();
		this.anInt4646 = arg0.method8548();
		this.aBoolean322 = arg0.method8548() == 1;
		if (Static252.aClass80_3 == Static162.aClass80_2 && Static165.anInt5949 >= 2) {
			this.aBoolean322 = false;
		}
		this.anInt4665 = 0;
		@Pc(130) int local130 = -1;
		@Pc(133) int[] local133 = new int[12];
		@Pc(153) int local153;
		@Pc(159) int local159;
		@Pc(200) int local200;
		for (@Pc(135) int local135 = 0; local135 < 12; local135++) {
			@Pc(141) int local141 = arg0.method8547();
			if (local141 == 0) {
				local133[local135] = 0;
			} else {
				local153 = arg0.method8547();
				local159 = local153 + (local141 << 8);
				if (local135 == 0 && local159 == 65535) {
					local130 = arg0.method8546();
					this.anInt4665 = arg0.method8547();
					break;
				}
				if (local159 >= 32768) {
					local159 = Static210.anIntArray230[local159 - 32768];
					local133[local135] = local159 | 0x40000000;
					local200 = Static72.aClass225_2.method4789(local159).anInt874;
					if (local200 != 0) {
						this.anInt4665 = local200;
					}
				} else {
					local133[local135] = Integer.MIN_VALUE | local159 - 256;
				}
			}
		}
		@Pc(225) int[] local225 = new int[5];
		for (local153 = 0; local153 < 5; local153++) {
			local159 = arg0.method8547();
			if (Static100.aShortArrayArrayArray5.length < 1 || local159 < 0 || Static100.aShortArrayArrayArray5[0][local153].length <= local159) {
				local159 = 0;
			}
			local225[local153] = local159;
		}
		this.anInt4659 = arg0.method8546();
		this.aString49 = arg0.method8549();
		if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 == this) {
			Static447.aString103 = this.aString49;
		}
		this.aString50 = this.aString49;
		this.anInt4650 = arg0.method8547();
		if (local41) {
			this.anInt4654 = arg0.method8546();
			if (this.anInt4654 == 65535) {
				this.anInt4654 = -1;
			}
			this.anInt4670 = this.anInt4650;
			this.anInt4679 = -1;
		} else {
			this.anInt4654 = 0;
			this.anInt4670 = arg0.method8547();
			this.anInt4679 = arg0.method8547();
			if (this.anInt4679 == 255) {
				this.anInt4679 = -1;
			}
		}
		local159 = this.anInt4674;
		this.anInt4674 = arg0.method8547();
		@Pc(366) int local366;
		if (this.anInt4674 == 0) {
			Static165.method5090(this);
		} else {
			local200 = this.anInt4656;
			@Pc(363) int local363 = this.anInt4645;
			local366 = this.anInt4669;
			@Pc(369) int local369 = this.anInt4668;
			@Pc(372) int local372 = this.anInt4642;
			this.anInt4656 = arg0.method8546();
			this.anInt4645 = arg0.method8546();
			this.anInt4669 = arg0.method8546();
			this.anInt4668 = arg0.method8546();
			this.anInt4642 = arg0.method8547();
			if (local21 != this.aBoolean324 || local159 != this.anInt4674 || this.anInt4656 != local200 || this.anInt4645 != local363 || this.anInt4669 != local366 || this.anInt4668 != local369 || local372 != this.anInt4642) {
				Static433.method5970(this);
			}
		}
		if (this.aClass218_1 == null) {
			this.aClass218_1 = new Class218();
		}
		local200 = this.aClass218_1.anInt5430;
		@Pc(458) int[] local458 = this.aClass218_1.anIntArray370;
		this.aClass218_1.method4619(this.method3951(), local225, local133, local130, this.aByte70 == 1);
		if (local130 != local200) {
			super.anInt10090 = (super.anIntArray307[0] << 9) + (this.method3950() << 8);
			super.anInt10089 = (super.anIntArray306[0] << 9) + (this.method3950() << 8);
		}
		if (Static528.anInt8672 == super.anInt4582 && local458 != null) {
			for (local366 = 0; local366 < local225.length; local366++) {
				if (local458[local366] != local225[local366]) {
					Static72.aClass225_2.method4783();
					break;
				}
			}
		}
		if (super.aClass13_Sub9_3 != null) {
			super.aClass13_Sub9_3.method5652();
		}
		if (super.anInt4553 == -1 || !super.aBoolean319) {
			return;
		}
		@Pc(566) Class334 local566 = this.method3964();
		if (!local566.method7497(super.anInt4553)) {
			super.aBoolean319 = false;
			super.anInt4553 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)I")
	@Override
	protected int method3951() {
		return this.anInt4659;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)V")
	public void method3975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anIntArray307[0] = arg1;
		super.anInt4637 = 0;
		super.anInt4639 = 0;
		super.anInt4640 = 0;
		super.anIntArray306[0] = arg0;
		@Pc(35) int local35 = this.method3950();
		super.anInt10090 = super.anIntArray307[0] * 512 + local35 * 256;
		super.anInt10089 = local35 * 256 + super.anIntArray306[0] * 512;
		if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 == this) {
			Static249.method3418();
		}
		if (super.aClass13_Sub9_3 != null) {
			super.aClass13_Sub9_3.method5652();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8400(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass218_1 == null || !this.method3967(arg0, 131072)) {
			return false;
		}
		@Pc(24) Class177 local24 = arg0.method6967();
		@Pc(29) int local29 = super.aClass116_7.method2590();
		local24.method7877(local29);
		local24.method7872(super.anInt10090, super.anInt10097, super.anInt10089);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; local44 < super.aClass182Array3.length; local44++) {
			if (super.aClass182Array3[local44] != null && (Static449.aBoolean538 ? super.aClass182Array3[local44].method6203(arg1, arg2, local24, true, 0, Static638.anInt7982) : super.aClass182Array3[local44].method6205(arg1, arg2, local24, true, 0))) {
				local42 = true;
				break;
			}
		}
		super.aClass182Array3[0] = super.aClass182Array3[1] = super.aClass182Array3[2] = null;
		return local42;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!ha;Lclient!uha;IIIBILclient!ka;)V")
	private void method3976(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class182 arg7) {
		@Pc(11) int local11 = arg4 * arg4 + arg3 * arg3;
		if (local11 < 262144 || arg6 < local11) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D) & 0x3FFF;
		@Pc(51) Class182 local51 = Static203.method2862(super.anInt4593, arg0, super.anInt4586, super.anInt4635, local39, arg1);
		if (local51 != null) {
			arg1.C(false);
			local51.method6194(arg2, null, arg5, 0);
			arg1.C(true);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method3977() {
		@Pc(7) String local7 = "";
		if (Static427.aStringArray36 != null) {
			local7 = local7 + Static427.aStringArray36[this.aByte71];
		}
		@Pc(29) int[] local29;
		if (this.aByte70 == 1 && Static8.anIntArray32 != null) {
			local29 = Static8.anIntArray32;
		} else {
			local29 = Static343.anIntArray358;
		}
		if (local29 != null && local29[this.aByte71] != -1) {
			@Pc(49) Class159 local49 = Static587.aClass232_1.method5002(local29[this.aByte71]);
			if (local49.aChar2 == 's') {
				local7 = local7 + local49.method3414(this.aByte72 & 0xFF);
			} else {
				Static163.method2447(new Throwable(), "gdn1");
				local29[this.aByte71] = -1;
			}
		}
		local7 = local7 + this.aString49;
		if (Static138.aStringArray10 != null) {
			local7 = local7 + Static138.aStringArray10[this.aByte71];
		}
		return local7;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method3978() {
		return this.aString50;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(Lclient!ha;I)Lclient!jl;")
	@Override
	public Class13_Sub6 method8399(@OriginalArg(0) Class95 arg0) {
		if (this.aClass218_1 == null || !this.method3967(arg0, 2048)) {
			return null;
		}
		@Pc(30) Class177 local30 = arg0.method6967();
		@Pc(37) int local37 = super.aClass116_7.method2590();
		local30.method7877(local37);
		@Pc(55) Class53 local55 = Static28.aClass53ArrayArrayArray1[super.aByte127][super.anInt10090 >> Static609.anInt9827][super.anInt10089 >> Static609.anInt9827];
		if (local55 == null || local55.aClass13_Sub1_Sub2_1 == null) {
			super.anInt4588 = (int) ((float) super.anInt4588 - (float) super.anInt4588 / 10.0F);
		} else {
			@Pc(82) int local82 = super.anInt4588 - local55.aClass13_Sub1_Sub2_1.aShort55;
			super.anInt4588 = (int) ((float) super.anInt4588 - (float) local82 / 10.0F);
		}
		local30.method7872(super.anInt10090, -super.anInt4588 + super.anInt10097 - 20, super.anInt10089);
		@Pc(109) Class13_Sub6 local109 = null;
		super.aBoolean320 = false;
		if (Static234.aClass2_Sub5_48.aClass6_Sub23_1.method7411() == 1) {
			@Pc(124) Class334 local124 = this.method3964();
			if (local124.aBoolean669 && (this.aClass218_1.anInt5430 == -1 || Static409.aClass107_2.method2291(this.aClass218_1.anInt5430).aBoolean268)) {
				@Pc(155) Class81 local155 = super.anInt4559 != -1 && super.anInt4622 == 0 ? Static540.aClass173_2.method3791(super.anInt4559) : null;
				@Pc(176) Class81 local176 = super.anInt4553 == -1 || this.aBoolean326 || super.aBoolean319 && local155 != null ? null : Static540.aClass173_2.method3791(super.anInt4553);
				@Pc(210) Class182 local210 = Static637.method8578(1, super.anInt4593, local37, 240, super.anInt4586, 0, arg0, super.anInt4635, 0, super.aClass182Array3[0], 160, local176 == null ? super.anInt4591 : super.anInt4628, local176 == null ? local155 : local176);
				if (local210 != null) {
					local109 = Static491.method6848(super.aClass182Array3.length + 1, true);
					super.aBoolean320 = true;
					arg0.C(false);
					if (Static449.aBoolean538) {
						local210.method6194(local30, local109.aClass13_Sub2Array1[super.aClass182Array3.length], Static638.anInt7982, 0);
					} else {
						local210.method6206(local30, local109.aClass13_Sub2Array1[super.aClass182Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(271) int local271;
		if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 == this) {
			local30.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
			for (local271 = Static341.aClass372Array1.length - 1; local271 >= 0; local271--) {
				@Pc(277) Class372 local277 = Static341.aClass372Array1[local271];
				if (local277 != null && local277.anInt9979 != -1) {
					@Pc(310) int local310;
					if (local277.anInt9971 == 1) {
						@Pc(298) Class2_Sub43 local298 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local277.anInt9978);
						if (local298 != null) {
							@Pc(303) Class13_Sub1_Sub1_Sub1_Sub1 local303 = local298.aClass13_Sub1_Sub1_Sub1_Sub1_2;
							local310 = local303.anInt10090 - Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090;
							@Pc(317) int local317 = local303.anInt10089 - Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089;
							if (Static449.aBoolean538) {
								this.method3976(local277.anInt9979, arg0, local30, local310, local317, Static638.anInt7982, 92160000, super.aClass182Array3[0]);
							} else {
								this.method3968(arg0, local310, local277.anInt9979, super.aClass182Array3[0], local317, 92160000, local30);
							}
						}
					}
					@Pc(372) int local372;
					if (local277.anInt9971 == 2) {
						@Pc(363) int local363 = local277.anInt9972 + 256 - Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090;
						local372 = local277.anInt9975 + 256 - Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089;
						local310 = local277.anInt9967 << 9;
						local310 *= local310;
						if (Static449.aBoolean538) {
							this.method3976(local277.anInt9979, arg0, local30, local363, local372, Static638.anInt7982, local310, super.aClass182Array3[0]);
						} else {
							this.method3968(arg0, local363, local277.anInt9979, super.aClass182Array3[0], local372, local310, local30);
						}
					}
					if (local277.anInt9971 == 10 && local277.anInt9978 >= 0 && local277.anInt9978 < Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(434) Class13_Sub1_Sub1_Sub1_Sub2 local434 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local277.anInt9978];
						if (local434 != null) {
							local372 = local434.anInt10090 - Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090;
							local310 = local434.anInt10089 - Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089;
							if (Static449.aBoolean538) {
								this.method3976(local277.anInt9979, arg0, local30, local372, local310, Static638.anInt7982, 92160000, super.aClass182Array3[0]);
							} else {
								this.method3968(arg0, local372, local277.anInt9979, super.aClass182Array3[0], local310, 92160000, local30);
							}
						}
					}
				}
			}
			local30.method7877(local37);
			local30.method7872(super.anInt10090, super.anInt10097, super.anInt10089);
		}
		local30.method7877(local37);
		local30.method7872(super.anInt10090, super.anInt10097 - super.anInt4588 - 5, super.anInt10089);
		if (local109 == null) {
			local109 = Static491.method6848(super.aClass182Array3.length, true);
		}
		this.method3960(super.aClass182Array3, local30, arg0, false);
		if (Static449.aBoolean538) {
			for (local271 = 0; super.aClass182Array3.length > local271; local271++) {
				if (super.aClass182Array3[local271] != null) {
					super.aClass182Array3[local271].method6194(local30, local109.aClass13_Sub2Array1[local271], Static638.anInt7982, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local271 = 0; local271 < super.aClass182Array3.length; local271++) {
				if (super.aClass182Array3[local271] != null) {
					super.aClass182Array3[local271].method6206(local30, local109.aClass13_Sub2Array1[local271], Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass13_Sub9_3 != null) {
			@Pc(611) Class98 local611 = super.aClass13_Sub9_3.method5660();
			if (Static449.aBoolean538) {
				arg0.method6977(local611, Static638.anInt7982);
			} else {
				arg0.method6960(local611);
			}
		}
		for (local271 = 0; super.aClass182Array3.length > local271; local271++) {
			if (super.aClass182Array3[local271] != null) {
				super.aBoolean320 |= super.aClass182Array3[local271].F();
			}
		}
		super.anInt4604 = Static482.anInt7692;
		super.aClass182Array3[0] = super.aClass182Array3[1] = super.aClass182Array3[2] = null;
		return local109;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBZILclient!ha;ILclient!ig;)V")
	@Override
	public void method8410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub1 arg5) {
		throw new IllegalStateException();
	}
}
