import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class15_Sub3_Sub3_Sub3 extends Class15_Sub3_Sub3 {

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
	private int anInt4395;

	@OriginalMember(owner = "client!hc", name = "hb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
	private int anInt4407;

	@OriginalMember(owner = "client!hc", name = "lb", descriptor = "D")
	private double lb;

	@OriginalMember(owner = "client!hc", name = "pb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!hc", name = "vb", descriptor = "Lclient!eea;")
	private Class15_Sub5 aClass15_Sub5_4;

	@OriginalMember(owner = "client!hc", name = "yb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!hc", name = "Ab", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!hc", name = "Eb", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!hc", name = "Mb", descriptor = "D")
	private double aDouble11;

	@OriginalMember(owner = "client!hc", name = "Tb", descriptor = "D")
	private double aDouble12;

	@OriginalMember(owner = "client!hc", name = "nb", descriptor = "I")
	private int anInt4411 = 0;

	@OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
	private int anInt4399 = 0;

	@OriginalMember(owner = "client!hc", name = "mb", descriptor = "I")
	private int anInt4410 = 0;

	@OriginalMember(owner = "client!hc", name = "Fb", descriptor = "Z")
	private boolean aBoolean344 = false;

	@OriginalMember(owner = "client!hc", name = "Jb", descriptor = "I")
	private int anInt4424 = 0;

	@OriginalMember(owner = "client!hc", name = "zb", descriptor = "Z")
	private boolean aBoolean343 = false;

	@OriginalMember(owner = "client!hc", name = "Cb", descriptor = "I")
	private int anInt4420 = -1;

	@OriginalMember(owner = "client!hc", name = "jb", descriptor = "I")
	private final int anInt4408;

	@OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
	private final int anInt4405;

	@OriginalMember(owner = "client!hc", name = "eb", descriptor = "Z")
	private final boolean aBoolean342;

	@OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
	public final int anInt4402;

	@OriginalMember(owner = "client!hc", name = "Lb", descriptor = "I")
	private final int anInt4426;

	@OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
	public final int anInt4401;

	@OriginalMember(owner = "client!hc", name = "Qb", descriptor = "I")
	private final int anInt4429;

	@OriginalMember(owner = "client!hc", name = "rb", descriptor = "I")
	private final int anInt4414;

	@OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
	private final int anInt4400;

	@OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
	public final int anInt4398;

	@OriginalMember(owner = "client!hc", name = "Hb", descriptor = "I")
	public final int anInt4422;

	@OriginalMember(owner = "client!hc", name = "cb", descriptor = "Lclient!je;")
	private final Class178 aClass178_1;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class15_Sub3_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static10.method154(arg4, arg3, arg1) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt4408 = arg8;
		this.anInt4405 = arg14;
		this.aBoolean343 = false;
		this.aBoolean342 = arg13;
		this.anInt4402 = arg6;
		this.anInt4426 = arg0;
		this.anInt4401 = arg7;
		this.anInt4429 = arg9;
		this.anInt4414 = arg10;
		this.anInt4400 = arg5;
		this.anInt4398 = arg12;
		this.anInt4422 = arg11;
		@Pc(91) int local91 = Static391.aClass319_1.method8041(this.anInt4426).anInt9651;
		if (local91 == -1) {
			this.aClass178_1 = null;
		} else {
			this.aClass178_1 = Static354.aClass40_2.method1123(local91);
		}
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)I")
	@Override
	public int method9430() {
		return this.anInt4411;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(BLclient!ha;)Lclient!mg;")
	@Override
	public Class232 method9442(@OriginalArg(1) Class101 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIB)V")
	public void method4011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean343) {
			local13 = (double) (arg3 - super.anInt11022);
			@Pc(20) double local20 = (double) (arg0 - super.anInt11024);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble6 = (double) super.anInt11024 + (double) this.anInt4429 * local20 / local29;
			this.aDouble9 = local13 * (double) this.anInt4429 / local29 + (double) super.anInt11022;
			if (this.aBoolean342) {
				this.aDouble7 = (double) (Static10.method154((int) this.aDouble6, (int) this.aDouble9, super.aByte142) - this.anInt4400);
			} else {
				this.aDouble7 = (double) super.anInt11029;
			}
		}
		local13 = (double) (this.anInt4401 + 1 - arg2);
		this.aDouble10 = ((double) arg3 - this.aDouble9) / local13;
		this.aDouble8 = ((double) arg0 - this.aDouble6) / local13;
		this.aDouble11 = Math.sqrt(this.aDouble10 * this.aDouble10 + this.aDouble8 * this.aDouble8);
		if (this.anInt4408 == -1) {
			this.aDouble12 = ((double) arg1 - this.aDouble7) / local13;
		} else {
			if (!this.aBoolean343) {
				this.aDouble12 = -this.aDouble11 * Math.tan((double) this.anInt4408 * 0.02454369D);
			}
			this.lb = ((double) arg1 - this.aDouble12 * local13 - this.aDouble7) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
	public void method4012(@OriginalArg(1) int arg0) {
		this.aBoolean343 = true;
		this.aDouble9 += this.aDouble10 * (double) arg0;
		this.aDouble6 += this.aDouble8 * (double) arg0;
		if (this.aBoolean342) {
			this.aDouble7 = (double) (Static10.method154((int) this.aDouble6, (int) this.aDouble9, super.aByte142) - this.anInt4400);
		} else if (this.anInt4408 == -1) {
			this.aDouble7 += this.aDouble12 * (double) arg0;
		} else {
			this.aDouble7 += (double) arg0 * this.aDouble12 + this.lb * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble12 += (double) arg0 * this.lb;
		}
		this.anInt4395 = (int) (Math.atan2(this.aDouble10, this.aDouble8) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4407 = (int) (Math.atan2(this.aDouble12, this.aDouble11) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass178_1 == null) {
			return;
		}
		this.anInt4424 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt4424 <= this.aClass178_1.anIntArray257[this.anInt4399]) {
						return;
					}
					this.anInt4424 -= this.aClass178_1.anIntArray257[this.anInt4399];
					this.anInt4399++;
					if (this.aClass178_1.anIntArray259.length <= this.anInt4399) {
						this.anInt4399 -= this.aClass178_1.anInt5142;
						if (this.anInt4399 < 0 || this.aClass178_1.anIntArray259.length <= this.anInt4399) {
							this.anInt4399 = 0;
						}
					}
					this.anInt4420 = this.anInt4399 + 1;
				} while (this.anInt4420 < this.aClass178_1.anIntArray259.length);
				this.anInt4420 -= this.aClass178_1.anInt5142;
			} while (this.anInt4420 >= 0 && this.anInt4420 < this.aClass178_1.anIntArray259.length);
			this.anInt4420 = -1;
		}
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method9434() {
		return this.aBoolean344;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9438(@OriginalArg(1) Class101 arg0) {
		@Pc(15) Class14 local15 = this.method4013(0, arg0);
		if (local15 == null) {
			return;
		}
		@Pc(21) Class76 local21 = arg0.method8085();
		local21.method9637(this.anInt4407);
		local21.method9634(this.anInt4395);
		local21.method9640((int) this.aDouble9, (int) this.aDouble7, (int) this.aDouble6);
		this.anInt4411 = local15.fa();
		this.anInt4410 = local15.ma();
		this.method4017(arg0, local21, local15);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class14 method4013(@OriginalArg(1) int arg0, @OriginalArg(2) Class101 arg1) {
		@Pc(16) Class336 local16 = Static391.aClass319_1.method8041(this.anInt4426);
		return local16.method8460(this.anInt4399, this.anInt4420, arg1, this.anInt4424, arg0, Static354.aClass40_2);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ha;I)Lclient!uh;")
	@Override
	public Class15_Sub9 method9427(@OriginalArg(0) Class101 arg0) {
		@Pc(17) Class14 local17 = this.method4013(2048, arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(24) Class76 local24 = arg0.method8085();
		local24.method9637(this.anInt4407);
		local24.method9634(this.anInt4395);
		local24.method9640((int) this.aDouble9, (int) this.aDouble7, (int) this.aDouble6);
		this.method4017(arg0, local24, local17);
		@Pc(54) Class15_Sub9 local54 = Static401.method6614(1, false);
		if (Static110.aBoolean800) {
			local17.method8623(local24, local54.aClass15_Sub6Array1[0], Static165.anInt3552, 0);
		} else {
			local17.method8641(local24, local54.aClass15_Sub6Array1[0], 0);
		}
		if (this.aClass15_Sub5_4 != null) {
			@Pc(82) Class127 local82 = this.aClass15_Sub5_4.method2300();
			if (Static110.aBoolean800) {
				arg0.method8115(local82, Static165.anInt3552);
			} else {
				arg0.method8065(local82);
			}
		}
		this.aBoolean344 = local17.F();
		this.anInt4411 = local17.fa();
		this.anInt4410 = local17.ma();
		return local54;
	}

	@OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass15_Sub5_4 != null) {
			this.aClass15_Sub5_4.method2298();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public void method4014() {
		if (this.aBoolean343 || this.anInt4414 == 0) {
			return;
		}
		@Pc(19) Class15_Sub3_Sub3_Sub1 local19 = null;
		@Pc(27) int local27;
		if (this.anInt4414 >= 0) {
			local27 = this.anInt4414 - 1;
			@Pc(34) Class2_Sub6 local34 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local27);
			if (local34 != null) {
				local19 = local34.aClass15_Sub3_Sub3_Sub1_Sub2_1;
			}
		} else {
			local27 = -this.anInt4414 - 1;
			if (Static659.anInt11273 == local27) {
				local19 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2;
			} else {
				local19 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local27];
			}
		}
		if (local19 == null) {
			return;
		}
		super.anInt11022 = local19.anInt11022;
		super.anInt11024 = local19.anInt11024;
		super.anInt11029 = Static10.method154(local19.anInt11024, local19.anInt11022, super.aByte142) - this.anInt4400;
		if (this.anInt4405 < 0) {
			return;
		}
		@Pc(90) Class248 local90 = local19.method3673();
		@Pc(92) int local92 = 0;
		@Pc(94) int local94 = 0;
		if (local90.anIntArrayArray35 != null && local90.anIntArrayArray35[this.anInt4405] != null) {
			local94 = local90.anIntArrayArray35[this.anInt4405][2];
			local92 = local90.anIntArrayArray35[this.anInt4405][0];
		}
		if (local90.anIntArrayArray34 != null && local90.anIntArrayArray34[this.anInt4405] != null) {
			local92 += local90.anIntArrayArray34[this.anInt4405][0];
			local94 += local90.anIntArrayArray34[this.anInt4405][2];
		}
		if (local92 != 0 || local94 != 0) {
			@Pc(167) int local167 = local19.aClass106_7.method3290();
			@Pc(169) int local169 = local167;
			if (local19.anIntArray186 != null && local19.anIntArray186[this.anInt4405] != -1) {
				local169 = local19.anIntArray186[this.anInt4405];
			}
			@Pc(193) int local193 = local169 - local167 & 0x3FFF;
			@Pc(197) int local197 = Class12_Sub2.anIntArray204[local193];
			@Pc(201) int local201 = Class12_Sub2.anIntArray203[local193];
			@Pc(212) int local212 = local94 * local197 + local201 * local92 >> 14;
			local94 = local201 * local94 - local92 * local197 >> 14;
			super.anInt11022 += local212;
			super.anInt11024 += local94;
		}
		return;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)I")
	@Override
	public int method9436(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.anInt4410 : -15;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BIILclient!ha;)Z")
	@Override
	public boolean method9431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "(I)V")
	public void method4015() {
		if (this.aClass15_Sub5_4 != null) {
			this.aClass15_Sub5_4.method2298();
		}
	}

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "(I)V")
	@Override
	public void method5328() {
		super.aShort62 = super.aShort63 = (short) (int) (this.aDouble9 / 512.0D);
		super.aShort64 = super.aShort65 = (short) (int) (this.aDouble6 / 512.0D);
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9425() {
		return false;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9439() {
		return false;
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V")
	@Override
	public void method9429() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ha;Lclient!dm;Lclient!ka;B)V")
	private void method4017(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Class14 arg2) {
		arg2.method8632(arg1);
		@Pc(18) Class283[] local18 = arg2.method8630();
		@Pc(21) Class123[] local21 = arg2.method8634();
		if ((this.aClass15_Sub5_4 == null || this.aClass15_Sub5_4.aBoolean183) && (local18 != null || local21 != null)) {
			this.aClass15_Sub5_4 = Static128.method2303(Static62.anInt1184, true);
		}
		if (this.aClass15_Sub5_4 != null) {
			this.aClass15_Sub5_4.method2301(arg0, (long) Static62.anInt1184, local18, local21);
			this.aClass15_Sub5_4.method2309(super.aByte142, super.aShort62, super.aShort63, super.aShort64, super.aShort65);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILclient!ha;Lclient!nfa;ZI)V")
	@Override
	public void method9426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) Class15_Sub3 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
