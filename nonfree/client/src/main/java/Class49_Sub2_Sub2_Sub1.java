import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class49_Sub2_Sub2_Sub1 extends Class49_Sub2_Sub2 {

	@OriginalMember(owner = "client!dg", name = "Bc", descriptor = "I")
	private int anInt1744;

	@OriginalMember(owner = "client!dg", name = "Cc", descriptor = "I")
	public int anInt1745;

	@OriginalMember(owner = "client!dg", name = "Pc", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!dg", name = "Vc", descriptor = "I")
	public int anInt1761;

	@OriginalMember(owner = "client!dg", name = "Zc", descriptor = "Ljava/lang/String;")
	public String aString17;

	@OriginalMember(owner = "client!dg", name = "gd", descriptor = "Lclient!nl;")
	public Class206 aClass206_1;

	@OriginalMember(owner = "client!dg", name = "Ac", descriptor = "B")
	private byte aByte33 = 0;

	@OriginalMember(owner = "client!dg", name = "Jc", descriptor = "I")
	public int anInt1751 = -1;

	@OriginalMember(owner = "client!dg", name = "Sc", descriptor = "I")
	public int anInt1758 = -1;

	@OriginalMember(owner = "client!dg", name = "Kc", descriptor = "I")
	public int anInt1752 = 0;

	@OriginalMember(owner = "client!dg", name = "id", descriptor = "Z")
	public boolean aBoolean112 = false;

	@OriginalMember(owner = "client!dg", name = "Qc", descriptor = "I")
	public int anInt1756 = 0;

	@OriginalMember(owner = "client!dg", name = "Gc", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!dg", name = "Rc", descriptor = "I")
	public int anInt1757 = -1;

	@OriginalMember(owner = "client!dg", name = "Xc", descriptor = "I")
	public int anInt1763 = 0;

	@OriginalMember(owner = "client!dg", name = "Tc", descriptor = "I")
	public int anInt1759 = 0;

	@OriginalMember(owner = "client!dg", name = "Mc", descriptor = "I")
	public int anInt1754 = 0;

	@OriginalMember(owner = "client!dg", name = "hd", descriptor = "I")
	public int anInt1770 = -1;

	@OriginalMember(owner = "client!dg", name = "jd", descriptor = "B")
	private byte aByte34 = 0;

	@OriginalMember(owner = "client!dg", name = "ed", descriptor = "I")
	public int anInt1768 = -1;

	@OriginalMember(owner = "client!dg", name = "ld", descriptor = "I")
	public int anInt1772 = 255;

	@OriginalMember(owner = "client!dg", name = "td", descriptor = "B")
	private byte aByte35 = 0;

	@OriginalMember(owner = "client!dg", name = "ud", descriptor = "I")
	public int anInt1780 = -1;

	@OriginalMember(owner = "client!dg", name = "vd", descriptor = "I")
	public int anInt1781 = -1;

	@OriginalMember(owner = "client!dg", name = "Uc", descriptor = "I")
	public int anInt1760 = -1;

	@OriginalMember(owner = "client!dg", name = "dd", descriptor = "Z")
	public boolean aBoolean111 = false;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)I")
	@Override
	public int method5994() {
		return super.anInt4315;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)I")
	@Override
	public int method3788() {
		return this.aClass206_1 == null || this.aClass206_1.anInt5936 == -1 ? super.method3788() : Static538.aClass242_2.method5833(this.aClass206_1.anInt5936).anInt5718;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!qa;I)Z")
	private boolean method1530(@OriginalArg(1) Class122 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class230 local11 = this.method3799();
		@Pc(26) Class199 local26 = super.anInt4297 != -1 && super.anInt4316 == 0 ? Static182.aClass218_1.method5221(super.anInt4297) : null;
		@Pc(46) Class199 local46 = super.anInt4282 == -1 || this.aBoolean110 || super.aBoolean306 && local26 != null ? null : Static182.aClass218_1.method5221(super.anInt4282);
		@Pc(49) int local49 = local11.anInt6414;
		@Pc(62) int local62 = local11.anInt6386;
		if (local49 != 0 || local62 != 0 || local11.anInt6401 != 0 || local11.anInt6389 != 0) {
			arg1 |= 0x7;
		}
		@Pc(101) boolean local101 = super.aByte56 != 0 && Static436.anInt6850 >= super.anInt4261 && Static436.anInt6850 < super.anInt4326;
		if (local101) {
			arg1 |= 0x80000;
		}
		@Pc(142) Class145 local142 = super.aClass145Array3[0] = this.aClass206_1.method5027(arg0, super.anInt4265, super.anInt4305, Static251.aClass119_1, super.anInt4286, Static477.aClass15_1, local26, Static351.aClass228_1, local46, super.aClass166Array3, Static342.aClass250_2, Static182.aClass218_1, super.anInt4291, super.anInt4303, Static538.aClass242_2, arg1, super.anInt4288);
		@Pc(145) int local145 = Static376.method5763();
		if (Static17.anInt454 < 96 && local145 > 50) {
			Static111.method1895();
		}
		@Pc(176) int local176;
		if (Static145.aClass21_4 != Static71.aClass21_1 && local145 < 50) {
			local176 = 50 - local145;
			while (Static272.anInt5158 < local176) {
				Static47.aByteArrayArray2[Static272.anInt5158] = new byte[102400];
				Static272.anInt5158++;
			}
			while (local176 < Static272.anInt5158) {
				Static272.anInt5158--;
				Static47.aByteArrayArray2[Static272.anInt5158] = null;
			}
		} else if (Static145.aClass21_4 != Static71.aClass21_1) {
			Static47.aByteArrayArray2 = new byte[50][];
			Static272.anInt5158 = 0;
		}
		if (local142 == null) {
			return false;
		}
		super.anInt4315 = local142.TA();
		this.method3782(local142);
		local176 = super.aClass143_7.method3599();
		if (local49 == 0 && local62 == 0) {
			this.method3798(0, this.method3788() << 9, local176, this.method3788() << 9, 0);
		} else {
			this.method3798(local11.anInt6383, local49, local176, local62, local11.anInt6397);
			if (super.lb != 0) {
				local142.D(super.lb);
			}
			if (super.anInt4318 != 0) {
				local142.b(super.anInt4318);
			}
			if (super.anInt4331 != 0) {
				local142.ca(0, super.anInt4331, 0);
			}
		}
		if (local101) {
			local142.method6671(super.aByte55, super.aByte58, super.aByte57, super.aByte56 & 0xFF);
		}
		@Pc(316) Class52 local316;
		@Pc(333) boolean local333;
		@Pc(335) int local335;
		@Pc(378) Class145 local378;
		if (this.aBoolean110 || super.anInt4307 == -1 || super.anInt4334 == -1) {
			super.aClass145Array3[1] = null;
		} else {
			local316 = Static489.aClass194_2.method4810(super.anInt4307);
			local333 = local316.aByte13 == 3 && (local49 != 0 || local62 != 0);
			local335 = local7;
			if (local333) {
				local335 = local7 | 0x7;
			} else {
				if (super.anInt4281 != 0) {
					local335 = local7 | 0x5;
				}
				if (super.anInt4302 != 0) {
					local335 |= 0x2;
				}
			}
			local378 = super.aClass145Array3[1] = local316.method1270(super.anInt4313, local335, super.anInt4334, arg0, super.anInt4262, Static182.aClass218_1);
			if (local378 != null) {
				if (super.anInt4302 != 0) {
					local378.ca(0, -super.anInt4302 << 2, 0);
				}
				if (super.anInt4281 != 0) {
					local378.OA(super.anInt4281 * 2048);
				}
				if (local333) {
					if (super.lb != 0) {
						local378.D(super.lb);
					}
					if (super.anInt4318 != 0) {
						local378.b(super.anInt4318);
					}
					if (super.anInt4331 != 0) {
						local378.ca(0, super.anInt4331, 0);
					}
				}
			}
		}
		if (this.aBoolean110 || super.anInt4289 == -1 || super.anInt4284 == -1) {
			super.aClass145Array3[3] = null;
		} else {
			local316 = Static489.aClass194_2.method4810(super.anInt4289);
			local333 = local316.aByte13 == 3 && (local49 != 0 || local62 != 0);
			local335 = local7;
			if (local333) {
				local335 = local7 | 0x7;
			} else {
				if (super.anInt4266 != 0) {
					local335 = local7 | 0x5;
				}
				if (super.anInt4259 != 0) {
					local335 |= 0x2;
				}
			}
			local378 = super.aClass145Array3[3] = local316.method1275(super.anInt4327, super.anInt4284, Static182.aClass218_1, arg0, super.anInt4290, local335);
			if (local378 != null) {
				if (super.anInt4259 != 0) {
					local378.ca(0, -super.anInt4259 << 2, 0);
				}
				if (super.anInt4266 != 0) {
					local378.OA(super.anInt4266 * 2048);
				}
				if (local333) {
					if (super.lb != 0) {
						local378.D(super.lb);
					}
					if (super.anInt4318 != 0) {
						local378.b(super.anInt4318);
					}
					if (super.anInt4331 != 0) {
						local378.ca(0, super.anInt4331, 0);
					}
				}
			}
		}
		super.aClass145Array3[2] = null;
		if (!this.aBoolean110 && super.aClass1_Sub50_3 != null) {
			if (Static436.anInt6850 >= super.aClass1_Sub50_3.anInt8765) {
				super.aClass1_Sub50_3 = null;
			} else if (Static436.anInt6850 >= super.aClass1_Sub50_3.anInt8760) {
				@Pc(625) Class145 local625 = super.aClass1_Sub50_3.method7170(local7 | 0x7, arg0);
				if (local625 != null) {
					local625.ca(-super.anInt7137 + super.aClass1_Sub50_3.anInt8757, super.aClass1_Sub50_3.anInt8766 + 5 - super.anInt7140, -super.anInt7141 + super.aClass1_Sub50_3.anInt8768);
					if (local176 != 0) {
						local625.OA(-local176 & 0x3FFF);
					}
					super.aClass145Array3[2] = local625;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
		if (this.aClass206_1 != null && (super.aBoolean307 || this.method1530(arg0, 0))) {
			this.method3781(super.aBoolean307, super.aClass145Array3, arg0);
			super.aClass145Array3[0] = super.aClass145Array3[1] = super.aClass145Array3[2] = super.aClass145Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method1531() {
		return this.aString16;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBII)V")
	public void method1532(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4338 < 9) {
			super.anInt4338++;
		}
		for (@Pc(24) int local24 = super.anInt4338; local24 > 0; local24--) {
			super.anIntArray428[local24] = super.anIntArray428[local24 - 1];
			super.anIntArray427[local24] = super.anIntArray427[local24 - 1];
			super.aByteArray64[local24] = super.aByteArray64[local24 - 1];
		}
		super.anIntArray428[0] = arg2;
		super.anIntArray427[0] = arg1;
		super.aByteArray64[0] = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method1533(@OriginalArg(0) Class1_Sub6 arg0) {
		arg0.anInt4555 = 0;
		@Pc(14) int local14 = arg0.method3922();
		this.aByte33 = (byte) (local14 & 0x1);
		@Pc(31) boolean local31 = (local14 & 0x2) != 0;
		@Pc(49) boolean local49 = (local14 & 0x4) != 0;
		@Pc(53) int local53 = super.method3788();
		this.method3793((local14 >> 3 & 0x7) + 1);
		this.aByte34 = (byte) (local14 >> 6 & 0x3);
		super.anInt7137 += this.method3788() - local53 << 8;
		super.anInt7141 += this.method3788() - local53 << 8;
		this.aByte35 = arg0.method3928();
		this.anInt1758 = arg0.method3928();
		this.anInt1781 = arg0.method3928();
		this.anInt1752 = 0;
		@Pc(116) int local116 = -1;
		@Pc(119) int[] local119 = new int[12];
		@Pc(139) int local139;
		@Pc(145) int local145;
		@Pc(187) int local187;
		for (@Pc(121) int local121 = 0; local121 < 12; local121++) {
			@Pc(127) int local127 = arg0.method3922();
			if (local127 == 0) {
				local119[local121] = 0;
			} else {
				local139 = arg0.method3922();
				local145 = (local127 << 8) + local139;
				if (local121 == 0 && local145 == 65535) {
					local116 = arg0.method3967();
					this.anInt1752 = arg0.method3922();
					break;
				}
				if (local145 >= 32768) {
					local145 = Static458.anIntArray733[local145 - 32768];
					local119[local121] = local145 | 0x40000000;
					local187 = Static342.aClass250_2.method5980(local145).anInt3910;
					if (local187 != 0) {
						this.anInt1752 = local187;
					}
				} else {
					local119[local121] = local145 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(214) int[] local214 = new int[5];
		for (local139 = 0; local139 < 5; local139++) {
			local145 = arg0.method3922();
			if (local145 < 0 || local145 >= Static293.aShortArrayArray4[local139].length) {
				local145 = 0;
			}
			local214[local139] = local145;
		}
		this.anInt1744 = arg0.method3967();
		this.aString17 = arg0.method3954();
		if (local31) {
			this.aString16 = arg0.method3954();
		} else {
			this.aString16 = this.aString17;
		}
		this.anInt1754 = arg0.method3922();
		if (local49) {
			this.anInt1756 = arg0.method3967();
			this.anInt1757 = -1;
			this.anInt1759 = this.anInt1754;
		} else {
			this.anInt1756 = 0;
			this.anInt1759 = arg0.method3922();
			this.anInt1757 = arg0.method3922();
			if (this.anInt1757 == 255) {
				this.anInt1757 = -1;
			}
		}
		local145 = this.anInt1763;
		this.anInt1763 = arg0.method3922();
		@Pc(340) int local340;
		if (this.anInt1763 == 0) {
			Static381.method5840(this);
		} else {
			local187 = this.anInt1768;
			@Pc(337) int local337 = this.anInt1780;
			local340 = this.anInt1770;
			@Pc(343) int local343 = this.anInt1751;
			@Pc(346) int local346 = this.anInt1772;
			this.anInt1768 = arg0.method3967();
			this.anInt1780 = arg0.method3967();
			this.anInt1770 = arg0.method3967();
			this.anInt1751 = arg0.method3967();
			this.anInt1772 = arg0.method3922();
			if (local145 != this.anInt1763 || this.anInt1768 != local187 || local337 != this.anInt1780 || local340 != this.anInt1770 || this.anInt1751 != local343 || this.anInt1772 != local346) {
				Static298.method4742(this);
			}
		}
		if (this.aClass206_1 == null) {
			this.aClass206_1 = new Class206();
		}
		local187 = this.aClass206_1.anInt5936;
		@Pc(434) int[] local434 = this.aClass206_1.anIntArray590;
		this.aClass206_1.method5029(this.aByte33 == 1, local214, this.method3786(), local116, local119);
		if (local187 != local116) {
			super.anInt7137 = (super.anIntArray428[0] << 9) + (this.method3788() << 8);
			super.anInt7141 = (super.anIntArray427[0] << 9) + (this.method3788() << 8);
		}
		if (super.anInt4295 == Static198.anInt3873 && local434 != null) {
			for (local340 = 0; local340 < local214.length; local340++) {
				if (local214[local340] != local434[local340]) {
					Static342.aClass250_2.method5977();
					break;
				}
			}
		}
		if (super.aClass72_Sub4_5 != null) {
			super.aClass72_Sub4_5.method4528();
		}
		if (super.anInt4282 == -1 || !super.aBoolean306) {
			return;
		}
		@Pc(533) Class230 local533 = this.method3799();
		if (!local533.method5400(super.anInt4282)) {
			super.aBoolean306 = false;
			super.anInt4282 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!qa;Lclient!m;IIILclient!r;II)V")
	private void method1534(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class145 arg5, @OriginalArg(6) int arg6) {
		@Pc(11) int local11 = arg3 * arg3 + arg6 * arg6;
		if (local11 < 262144 || local11 > arg4) {
			return;
		}
		@Pc(29) int local29 = (int) (Math.atan2((double) arg6, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(43) Class145 local43 = Static246.method4195(arg2, arg0, super.anInt4318, super.anInt4331, super.lb, local29);
		if (local43 != null) {
			arg0.method7271(false);
			local43.method6686(arg1, null, 0);
			arg0.method7271(true);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIILclient!qa;IZLclient!lb;)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class49 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method1535() {
		@Pc(7) String local7 = "";
		if (Static430.aStringArray34 != null) {
			local7 = local7 + Static430.aStringArray34[this.aByte34];
		}
		@Pc(31) int[] local31;
		if (this.aByte33 == 1 && Static272.anIntArray524 != null) {
			local31 = Static272.anIntArray524;
		} else {
			local31 = Static171.anIntArray289;
		}
		if (local31 != null && local31[this.aByte34] != -1) {
			@Pc(52) Class214 local52 = Static4.aClass191_1.method4745(local31[this.aByte34]);
			if (local52.aChar3 == 's') {
				local7 = local7 + local52.method5120(this.aByte35 & 0xFF);
			} else {
				Static234.method4051(new Throwable(), "gdn1");
				local31[this.aByte34] = -1;
			}
		}
		local7 = local7 + this.aString17;
		if (Static162.aStringArray14 != null) {
			local7 = local7 + Static162.aStringArray14[this.aByte34];
		}
		return local7;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)I")
	@Override
	protected int method3786() {
		return this.anInt1744;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		if (this.aClass206_1 == null || !this.method1530(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class118 local19 = arg2.method7256();
		@Pc(24) int local24 = super.aClass143_7.method3599();
		local19.ma(local24);
		local19.TA(super.anInt7137, super.anInt7140, super.anInt7141);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; super.aClass145Array3.length > local44; local44++) {
			if (super.aClass145Array3[local44] != null && super.aClass145Array3[local44].method6683(arg0, arg1, local19, true)) {
				local42 = true;
				break;
			}
		}
		super.aClass145Array3[0] = super.aClass145Array3[1] = super.aClass145Array3[2] = super.aClass145Array3[3] = null;
		return local42;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)I")
	@Override
	public int method3785() {
		return -1;
	}

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "(I)Z")
	public boolean method1537() {
		return this.aClass206_1 != null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBBI)V")
	public void method1538(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4297 != -1 && Static182.aClass218_1.method5221(super.anInt4297).anInt5736 == 1) {
			super.anInt4297 = -1;
		}
		@Pc(36) Class52 local36;
		if (super.anInt4307 != -1) {
			local36 = Static489.aClass194_2.method4810(super.anInt4307);
			if (local36.aBoolean84 && local36.anInt1342 != -1 && Static182.aClass218_1.method5221(local36.anInt1342).anInt5736 == 1) {
				super.anInt4307 = -1;
			}
		}
		if (super.anInt4289 != -1) {
			local36 = Static489.aClass194_2.method4810(super.anInt4289);
			if (local36.aBoolean84 && local36.anInt1342 != -1 && Static182.aClass218_1.method5221(local36.anInt1342).anInt5736 == 1) {
				super.anInt4289 = -1;
			}
		}
		this.anInt1760 = -1;
		if (arg0 < 0 || Static459.anInt7799 <= arg0 || arg2 < 0 || Static482.anInt7990 <= arg2) {
			this.method1540(arg0, arg2);
		} else if (super.anIntArray428[0] >= 0 && Static459.anInt7799 > super.anIntArray428[0] && super.anIntArray427[0] >= 0 && super.anIntArray427[0] < Static482.anInt7990) {
			if (arg1 == 2) {
				Static463.method6527(this, arg0, arg2);
			}
			this.method1532(arg1, arg2, arg0);
		} else {
			this.method1540(arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7451() {
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
	public void method1540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt4339 = 0;
		super.anInt4338 = 0;
		super.anInt4337 = 0;
		super.anIntArray428[0] = arg0;
		super.anIntArray427[0] = arg1;
		@Pc(26) int local26 = this.method3788();
		super.anInt7137 = local26 * 256 + super.anIntArray428[0] * 512;
		super.anInt7141 = local26 * 256 + super.anIntArray427[0] * 512;
		if (Static63.aClass49_Sub2_Sub2_Sub1_1 == this) {
			Static283.method4575();
		}
		if (super.aClass72_Sub4_5 != null) {
			super.aClass72_Sub4_5.method4528();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		if (this.aClass206_1 == null || !this.method1530(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class118 local19 = arg0.method7256();
		@Pc(24) int local24 = super.aClass143_7.method3599();
		local19.ma(local24);
		local19.TA(super.anInt7137, super.anInt7140 - 20, super.anInt7141);
		@Pc(98) int local98;
		if (Static544.aClass1_Sub22_Sub1_1.aBoolean394) {
			@Pc(44) Class230 local44 = this.method3799();
			if (local44.aBoolean467 && (this.aClass206_1.anInt5936 == -1 || Static538.aClass242_2.method5833(this.aClass206_1.anInt5936).aBoolean416)) {
				@Pc(76) Class199 local76 = super.anInt4297 != -1 && super.anInt4316 == 0 ? Static182.aClass218_1.method5221(super.anInt4297) : null;
				@Pc(96) Class199 local96 = super.anInt4282 == -1 || this.aBoolean110 || super.aBoolean306 && local76 != null ? null : Static182.aClass218_1.method5221(super.anInt4282);
				local98 = 0;
				if (super.anInt4306 != 0) {
					local98 = this.method3787();
				}
				@Pc(141) Class145 local141 = Static223.method3885(local96 == null ? local76 : local96, local24, arg0, local96 == null ? super.anInt4303 : super.anInt4286, 1, 0, super.anInt4331, 0, 240, local98, 160, super.lb, super.anInt4318, super.aClass145Array3[0]);
				if (local141 != null) {
					arg0.method7271(false);
					local141.method6686(local19, null, 0);
					arg0.method7271(true);
				}
			}
		}
		if (Static63.aClass49_Sub2_Sub2_Sub1_1 == this) {
			local19.oa(super.anInt7137, super.anInt7140, super.anInt7141);
			for (@Pc(170) int local170 = Static384.aClass268Array1.length - 1; local170 >= 0; local170--) {
				@Pc(176) Class268 local176 = Static384.aClass268Array1[local170];
				if (local176 != null && local176.anInt7589 != -1) {
					@Pc(206) int local206;
					if (local176.anInt7597 == 1) {
						@Pc(195) Class1_Sub17 local195 = (Class1_Sub17) Static380.aClass17_29.method738((long) local176.anInt7595);
						if (local195 != null) {
							@Pc(200) Class49_Sub2_Sub2_Sub2 local200 = local195.aClass49_Sub2_Sub2_Sub2_2;
							local206 = local200.anInt7137 - Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137;
							@Pc(213) int local213 = local200.anInt7141 - Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141;
							this.method1534(arg0, local19, local176.anInt7589, local213, 92160000, super.aClass145Array3[0], local206);
						}
					}
					if (local176.anInt7597 == 2) {
						@Pc(242) int local242 = local176.anInt7591 + 256 - Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137;
						local98 = local176.anInt7596 + 256 - Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141;
						local206 = local176.anInt7590 << 9;
						local206 *= local206;
						this.method1534(arg0, local19, local176.anInt7589, local98, local206, super.aClass145Array3[0], local242);
					}
					if (local176.anInt7597 == 10 && local176.anInt7595 >= 0 && local176.anInt7595 < Static349.aClass49_Sub2_Sub2_Sub1Array1.length) {
						@Pc(296) Class49_Sub2_Sub2_Sub1 local296 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local176.anInt7595];
						if (local296 != null) {
							local98 = local296.anInt7137 - Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137;
							local206 = local296.anInt7141 - Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141;
							this.method1534(arg0, local19, local176.anInt7589, local206, 92160000, super.aClass145Array3[0], local98);
						}
					}
				}
			}
			local19.ma(local24);
			local19.TA(super.anInt7137, super.anInt7140, super.anInt7141);
		}
		local19.ma(local24);
		local19.TA(super.anInt7137, super.anInt7140 - 5, super.anInt7141);
		@Pc(359) Class72_Sub7 local359 = Static186.method2914(super.aClass145Array3.length);
		if (super.aClass72_Sub4_5 == null) {
			arg0.method7257(super.aClass145Array3, local19, local359.aClass72_Sub2Array1, Static63.aClass49_Sub2_Sub2_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(366) Class175 local366 = super.aClass72_Sub4_5.method4537();
			arg0.method7283(super.aClass145Array3, local366, local19, local359.aClass72_Sub2Array1, Static63.aClass49_Sub2_Sub2_Sub1_1 == this ? 1 : 0);
		}
		this.method3781(false, super.aClass145Array3, arg0);
		super.aClass145Array3[0] = super.aClass145Array3[1] = super.aClass145Array3[2] = super.aClass145Array3[3] = null;
		super.anInt4312 = Static45.anInt915;
		return local359;
	}
}
