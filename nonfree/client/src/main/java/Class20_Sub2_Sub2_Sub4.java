import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class20_Sub2_Sub2_Sub4 extends Class20_Sub2_Sub2 {

	@OriginalMember(owner = "client!tt", name = "K", descriptor = "D")
	private double aDouble18;

	@OriginalMember(owner = "client!tt", name = "M", descriptor = "Lclient!paa;")
	private Class20_Sub8 aClass20_Sub8_8;

	@OriginalMember(owner = "client!tt", name = "O", descriptor = "D")
	private double aDouble19;

	@OriginalMember(owner = "client!tt", name = "Z", descriptor = "D")
	private double aDouble20;

	@OriginalMember(owner = "client!tt", name = "db", descriptor = "D")
	private double aDouble21;

	@OriginalMember(owner = "client!tt", name = "xb", descriptor = "D")
	private double aDouble22;

	@OriginalMember(owner = "client!tt", name = "zb", descriptor = "D")
	private double aDouble23;

	@OriginalMember(owner = "client!tt", name = "Ab", descriptor = "I")
	private int anInt9539;

	@OriginalMember(owner = "client!tt", name = "Db", descriptor = "D")
	private double aDouble24;

	@OriginalMember(owner = "client!tt", name = "Fb", descriptor = "I")
	private int anInt9543;

	@OriginalMember(owner = "client!tt", name = "Jb", descriptor = "D")
	private double aDouble25;

	@OriginalMember(owner = "client!tt", name = "rb", descriptor = "I")
	private int anInt9532 = 0;

	@OriginalMember(owner = "client!tt", name = "tb", descriptor = "I")
	private int anInt9534 = 0;

	@OriginalMember(owner = "client!tt", name = "Y", descriptor = "Z")
	private boolean aBoolean655 = false;

	@OriginalMember(owner = "client!tt", name = "Cb", descriptor = "I")
	private int anInt9541 = -1;

	@OriginalMember(owner = "client!tt", name = "V", descriptor = "I")
	private int anInt9515 = 0;

	@OriginalMember(owner = "client!tt", name = "Ib", descriptor = "I")
	private int anInt9545 = 0;

	@OriginalMember(owner = "client!tt", name = "Lb", descriptor = "Z")
	private boolean aBoolean656 = false;

	@OriginalMember(owner = "client!tt", name = "Q", descriptor = "I")
	private final int anInt9510;

	@OriginalMember(owner = "client!tt", name = "ab", descriptor = "I")
	private final int anInt9517;

	@OriginalMember(owner = "client!tt", name = "ib", descriptor = "I")
	private final int anInt9524;

	@OriginalMember(owner = "client!tt", name = "bb", descriptor = "I")
	public final int anInt9518;

	@OriginalMember(owner = "client!tt", name = "hb", descriptor = "I")
	public final int anInt9523;

	@OriginalMember(owner = "client!tt", name = "S", descriptor = "I")
	private final int anInt9512;

	@OriginalMember(owner = "client!tt", name = "eb", descriptor = "I")
	private final int anInt9520;

	@OriginalMember(owner = "client!tt", name = "lb", descriptor = "Z")
	private final boolean lb;

	@OriginalMember(owner = "client!tt", name = "Bb", descriptor = "I")
	public final int anInt9540;

	@OriginalMember(owner = "client!tt", name = "sb", descriptor = "I")
	public final int anInt9533;

	@OriginalMember(owner = "client!tt", name = "gb", descriptor = "I")
	private final int anInt9522;

	@OriginalMember(owner = "client!tt", name = "X", descriptor = "Lclient!ao;")
	private final Class21 aClass21_3;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class20_Sub2_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static138.method2248(arg3, arg1, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt9510 = arg8;
		this.anInt9517 = arg5;
		this.anInt9524 = arg14;
		this.anInt9518 = arg12;
		this.anInt9523 = arg11;
		this.anInt9512 = arg9;
		this.anInt9520 = arg10;
		this.lb = arg13;
		this.anInt9540 = arg7;
		this.anInt9533 = arg6;
		this.aBoolean655 = false;
		this.anInt9522 = arg0;
		@Pc(90) int local90 = Static436.aClass292_2.method7401(this.anInt9522).anInt2750;
		if (local90 == -1) {
			this.aClass21_3 = null;
		} else {
			this.aClass21_3 = Static294.aClass373_2.method8738(local90);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IB)V")
	public void method8084(@OriginalArg(0) int arg0) {
		this.aDouble21 += (double) arg0 * this.aDouble20;
		this.aDouble18 += (double) arg0 * this.aDouble22;
		this.aBoolean655 = true;
		if (this.lb) {
			this.aDouble23 = (double) (Static138.method2248((int) this.aDouble21, super.aByte131, (int) this.aDouble18) - this.anInt9517);
		} else if (this.anInt9510 == -1) {
			this.aDouble23 += this.aDouble25 * (double) arg0;
		} else {
			this.aDouble23 += (double) arg0 * 0.5D * this.aDouble24 * (double) arg0 + this.aDouble25 * (double) arg0;
			this.aDouble25 += (double) arg0 * this.aDouble24;
		}
		this.anInt9543 = (int) (Math.atan2(this.aDouble20, this.aDouble22) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt9539 = (int) (Math.atan2(this.aDouble25, this.aDouble19) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass21_3 == null) {
			return;
		}
		this.anInt9515 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass21_3.anIntArray17[this.anInt9545] >= this.anInt9515) {
						return;
					}
					this.anInt9515 -= this.aClass21_3.anIntArray17[this.anInt9545];
					this.anInt9545++;
					if (this.aClass21_3.anIntArray15.length <= this.anInt9545) {
						this.anInt9545 -= this.aClass21_3.anInt346;
						if (this.anInt9545 < 0 || this.aClass21_3.anIntArray15.length <= this.anInt9545) {
							this.anInt9545 = 0;
						}
					}
					this.anInt9541 = this.anInt9545 + 1;
				} while (this.aClass21_3.anIntArray15.length > this.anInt9541);
				this.anInt9541 -= this.aClass21_3.anInt346;
			} while (this.anInt9541 >= 0 && this.anInt9541 < this.aClass21_3.anIntArray15.length);
			this.anInt9541 = -1;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	public void method8085() {
		if (this.aClass20_Sub8_8 != null) {
			this.aClass20_Sub8_8.method6633();
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lclient!ha;B)Lclient!c;")
	@Override
	public Class20_Sub3 method9020(@OriginalArg(0) Class100 arg0) {
		@Pc(11) Class24 local11 = this.method8091(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class154 local18 = arg0.method8785();
		local18.method6558(this.anInt9539);
		local18.method6566(this.anInt9543);
		local18.method6570((int) this.aDouble21, (int) this.aDouble23, (int) this.aDouble18);
		this.method8088(arg0, local18, local11);
		@Pc(56) Class20_Sub3 local56 = Static307.method5201(false, 1);
		if (Static591.aBoolean675) {
			local11.method6845(local18, local56.aClass20_Sub4Array1[0], Static419.anInt7660, 0);
		} else {
			local11.method6862(local18, local56.aClass20_Sub4Array1[0], 0);
		}
		if (this.aClass20_Sub8_8 != null) {
			@Pc(84) Class236 local84 = this.aClass20_Sub8_8.method6631();
			if (Static591.aBoolean675) {
				arg0.method8831(local84, Static419.anInt7660);
			} else {
				arg0.method8844(local84);
			}
		}
		this.aBoolean656 = local11.F();
		this.anInt9532 = local11.fa();
		this.anInt9534 = local11.ma();
		return local56;
	}

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "(B)Z")
	@Override
	public boolean method9021() {
		return false;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ha;I)Lclient!ria;")
	@Override
	public Class290 method9007(@OriginalArg(0) Class100 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "(B)I")
	@Override
	public int method9019() {
		return this.anInt9532;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ha;Lclient!ql;ILclient!ka;)V")
	private void method8088(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class154 arg1, @OriginalArg(3) Class24 arg2) {
		arg2.method6861(arg1);
		@Pc(9) Class382[] local9 = arg2.method6853();
		@Pc(19) Class243[] local19 = arg2.method6865();
		if ((this.aClass20_Sub8_8 == null || this.aClass20_Sub8_8.aBoolean519) && (local9 != null || local19 != null)) {
			this.aClass20_Sub8_8 = Static423.method6632(Static113.anInt2243, true);
		}
		if (this.aClass20_Sub8_8 != null) {
			this.aClass20_Sub8_8.method6634(arg0, (long) Static113.anInt2243, local9, local19);
			this.aClass20_Sub8_8.method6636(super.aByte131, super.aShort124, super.aShort125, super.aShort123, super.aShort122);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIII)V")
	public void method8090(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean655) {
			local8 = (double) (arg2 - super.anInt10725);
			@Pc(15) double local15 = (double) (arg3 - super.anInt10729);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local8 * local8);
			this.aDouble18 = (double) super.anInt10729 + local15 * (double) this.anInt9512 / local24;
			this.aDouble21 = local8 * (double) this.anInt9512 / local24 + (double) super.anInt10725;
			if (this.lb) {
				this.aDouble23 = (double) (Static138.method2248((int) this.aDouble21, super.aByte131, (int) this.aDouble18) - this.anInt9517);
			} else {
				this.aDouble23 = (double) super.anInt10724;
			}
		}
		local8 = (double) (this.anInt9540 + 1 - arg1);
		this.aDouble20 = ((double) arg2 - this.aDouble21) / local8;
		this.aDouble22 = ((double) arg3 - this.aDouble18) / local8;
		this.aDouble19 = Math.sqrt(this.aDouble22 * this.aDouble22 + this.aDouble20 * this.aDouble20);
		if (this.anInt9510 == -1) {
			this.aDouble25 = ((double) arg0 - this.aDouble23) / local8;
		} else {
			if (!this.aBoolean655) {
				this.aDouble25 = -this.aDouble19 * Math.tan((double) this.anInt9510 * 0.02454369D);
			}
			this.aDouble24 = ((double) arg0 - this.aDouble23 - this.aDouble25 * local8) * 2.0D / (local8 * local8);
		}
	}

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "(B)V")
	@Override
	public void method9025() {
		super.aShort124 = super.aShort125 = (short) (int) (this.aDouble21 / 512.0D);
		super.aShort123 = super.aShort122 = (short) (int) (this.aDouble18 / 512.0D);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!vs;ZILclient!ha;II)V")
	@Override
	public void method9018(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method9011() {
		return false;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9016(@OriginalArg(0) Class100 arg0) {
		@Pc(9) Class24 local9 = this.method8091(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class154 local15 = arg0.method8785();
		local15.method6558(this.anInt9539);
		local15.method6566(this.anInt9543);
		local15.method6570((int) this.aDouble21, (int) this.aDouble23, (int) this.aDouble18);
		this.anInt9532 = local9.fa();
		this.anInt9534 = local9.ma();
		this.method8088(arg0, local15, local9);
	}

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "(B)Z")
	@Override
	public boolean method9023() {
		return this.aBoolean656;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ha;BI)Lclient!ka;")
	private Class24 method8091(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class93 local9 = Static436.aClass292_2.method7401(this.anInt9522);
		return local9.method2366(this.anInt9541, this.anInt9515, arg0, arg1, Static294.aClass373_2, this.anInt9545);
	}

	@OriginalMember(owner = "client!tt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub8_8 != null) {
			this.aClass20_Sub8_8.method6633();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBLclient!ha;I)Z")
	@Override
	public boolean method9014(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "(I)V")
	public void method8092() {
		if (this.aBoolean655 || this.anInt9520 == 0) {
			return;
		}
		@Pc(15) Class20_Sub2_Sub2_Sub1 local15 = null;
		@Pc(24) int local24;
		if (this.anInt9520 < 0) {
			local24 = -this.anInt9520 - 1;
			if (local24 == Static229.anInt4561) {
				local15 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1;
			} else {
				local15 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local24];
			}
		} else {
			local24 = this.anInt9520 - 1;
			@Pc(51) Class6_Sub46 local51 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local24);
			if (local51 != null) {
				local15 = local51.aClass20_Sub2_Sub2_Sub1_Sub2_1;
			}
		}
		if (local15 == null) {
			return;
		}
		super.anInt10725 = local15.anInt10725;
		super.anInt10729 = local15.anInt10729;
		super.anInt10724 = Static138.method2248(local15.anInt10725, super.aByte131, local15.anInt10729) - this.anInt9517;
		if (this.anInt9524 < 0) {
			return;
		}
		@Pc(89) Class201 local89 = local15.method4911();
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 0;
		if (local89.anIntArrayArray25 != null && local89.anIntArrayArray25[this.anInt9524] != null) {
			local91 = local89.anIntArrayArray25[this.anInt9524][0];
			local93 = local89.anIntArrayArray25[this.anInt9524][2];
		}
		if (local89.anIntArrayArray26 != null && local89.anIntArrayArray26[this.anInt9524] != null) {
			local91 += local89.anIntArrayArray26[this.anInt9524][0];
			local93 += local89.anIntArrayArray26[this.anInt9524][2];
		}
		if (local91 == 0 && local93 == 0) {
			return;
		}
		@Pc(160) int local160 = local15.aClass278_7.method7147();
		@Pc(162) int local162 = local160;
		if (local15.anIntArray328 != null && local15.anIntArray328[this.anInt9524] != -1) {
			local162 = local15.anIntArray328[this.anInt9524];
		}
		@Pc(185) int local185 = local162 - local160 & 0x3FFF;
		@Pc(189) int local189 = Class100_Sub1.anIntArray428[local185];
		@Pc(193) int local193 = Class100_Sub1.anIntArray429[local185];
		@Pc(203) int local203 = local189 * local93 + local193 * local91 >> 14;
		local93 = local93 * local193 - local189 * local91 >> 14;
		super.anInt10725 += local203;
		super.anInt10729 += local93;
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(I)V")
	@Override
	public void method9017() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "(B)I")
	@Override
	public int method9022(@OriginalArg(0) byte arg0) {
		if (arg0 != 3) {
			this.method9018((Class20_Sub2) null, false, 126, (Class100) null, 94, 116);
		}
		return this.anInt9534;
	}
}
