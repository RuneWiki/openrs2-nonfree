import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class3_Sub1_Sub2_Sub1 extends Class3_Sub1_Sub2 implements Interface21 {

	@OriginalMember(owner = "client!co", name = "Y", descriptor = "Lclient!hw;")
	private Class142 aClass142_1;

	@OriginalMember(owner = "client!co", name = "bb", descriptor = "Z")
	private final boolean aBoolean213;

	@OriginalMember(owner = "client!co", name = "qb", descriptor = "B")
	private final byte aByte28;

	@OriginalMember(owner = "client!co", name = "ab", descriptor = "S")
	private final short aShort9;

	@OriginalMember(owner = "client!co", name = "jb", descriptor = "Z")
	private final boolean aBoolean215;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "B")
	private final byte aByte27;

	@OriginalMember(owner = "client!co", name = "ib", descriptor = "Z")
	private final boolean aBoolean214;

	@OriginalMember(owner = "client!co", name = "V", descriptor = "Lclient!ka;")
	private Class166 aClass166_3;

	@OriginalMember(owner = "client!co", name = "Z", descriptor = "Lclient!r;")
	private Class2_Sub6_Sub7 aClass2_Sub6_Sub7_3;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!ha;Lclient!iv;IIIIIZIIII)V")
	public Class3_Sub1_Sub2_Sub1(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aBoolean213 = arg1.anInt5363 != 0 && !arg7;
		this.aByte28 = (byte) arg10;
		this.aShort9 = (short) arg1.anInt5398;
		super.anInt10310 = arg6;
		this.aBoolean215 = arg7;
		super.anInt10303 = arg4;
		this.aByte27 = (byte) arg11;
		this.aBoolean214 = arg0.method7285() && arg1.aBoolean398 && !this.aBoolean215 && Static74.aClass2_Sub13_5.aClass14_Sub15_1.method5864() != 0;
		@Pc(70) Class16 local70 = this.method2325(this.aBoolean214, 2048, arg0);
		if (local70 != null) {
			this.aClass166_3 = local70.aClass166_1;
			this.aClass2_Sub6_Sub7_3 = local70.aClass2_Sub6_Sub7_1;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class166 method2322(@OriginalArg(0) int arg0, @OriginalArg(2) Class20 arg1) {
		if (this.aClass166_3 != null && arg1.method7270(this.aClass166_3.ua(), arg0) == 0) {
			return this.aClass166_3;
		} else {
			@Pc(27) Class16 local27 = this.method2325(false, arg0, arg1);
			return local27 == null ? null : local27.aClass166_1;
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(ILclient!ha;)Lclient!jda;")
	@Override
	public Class3_Sub4 method8610(@OriginalArg(1) Class20 arg0) {
		if (this.aClass166_3 == null) {
			return null;
		}
		@Pc(11) Class30 local11 = arg0.method7308();
		local11.method4649(super.anInt10303 + super.aShort108, super.anInt10306, super.anInt10310 + super.aShort107);
		@Pc(33) Class3_Sub4 local33 = Static546.method8162(1, this.aBoolean213);
		if (Static639.aBoolean753) {
			this.aClass166_3.method6678(local11, local33.aClass3_Sub3Array1[0], Static380.anInt7419, 0);
		} else {
			this.aClass166_3.method6685(local11, local33.aClass3_Sub3Array1[0], 0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
	@Override
	public void method8623() {
		if (this.aClass166_3 != null) {
			this.aClass166_3.method6682();
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8601() {
		return this.aClass166_3 == null ? false : this.aClass166_3.F();
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(I)I")
	@Override
	public int method8625() {
		return this.aShort9 & 0xFFFF;
	}

	@OriginalMember(owner = "client!co", name = "i", descriptor = "(I)I")
	@Override
	public int method8603(@OriginalArg(0) int arg0) {
		if (arg0 != -25675) {
			this.aClass166_3 = null;
		}
		return this.aClass166_3 == null ? 0 : this.aClass166_3.ma();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8615(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class166 local9 = this.method2322(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class30 local14 = arg0.method7308();
			local14.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
			return Static639.aBoolean753 ? local9.method6693(arg2, arg1, local14, false, 0, Static380.anInt7419) : local9.method6698(arg2, arg1, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!co", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8600() {
		if (this.aClass166_3 == null) {
			return true;
		} else {
			return !this.aClass166_3.r();
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)I")
	@Override
	public int method8622() {
		return this.aByte28;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8626(@OriginalArg(0) Class20 arg0) {
		@Pc(20) Class2_Sub6_Sub7 local20;
		if (this.aClass2_Sub6_Sub7_3 == null && this.aBoolean214) {
			@Pc(31) Class16 local31 = this.method2325(true, 262144, arg0);
			local20 = local31 == null ? null : local31.aClass2_Sub6_Sub7_1;
		} else {
			local20 = this.aClass2_Sub6_Sub7_3;
			this.aClass2_Sub6_Sub7_3 = null;
		}
		if (local20 != null) {
			Static427.method6848(local20, super.aByte131, super.anInt10303, super.anInt10310, null);
		}
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8611(@OriginalArg(0) Class20 arg0) {
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8627(@OriginalArg(1) Class20 arg0) {
		@Pc(25) Class2_Sub6_Sub7 local25;
		if (this.aClass2_Sub6_Sub7_3 == null && this.aBoolean214) {
			@Pc(18) Class16 local18 = this.method2325(true, 262144, arg0);
			local25 = local18 == null ? null : local18.aClass2_Sub6_Sub7_1;
		} else {
			local25 = this.aClass2_Sub6_Sub7_3;
			this.aClass2_Sub6_Sub7_3 = null;
		}
		if (local25 != null) {
			Static378.method2839(local25, super.aByte131, super.anInt10303, super.anInt10310, null);
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(Lclient!ha;I)Lclient!hw;")
	@Override
	public Class142 method8605(@OriginalArg(0) Class20 arg0) {
		if (this.aClass142_1 == null) {
			this.aClass142_1 = Static268.method4930(super.anInt10303, this.method2322(0, arg0), super.anInt10310, super.anInt10306);
		}
		return this.aClass142_1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BZILclient!ha;)Lclient!ak;")
	private Class16 method2325(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class20 arg2) {
		@Pc(18) Class161 local18 = Static27.aClass342_3.method8534(this.aShort9 & 0xFFFF);
		@Pc(26) Class65 local26;
		@Pc(39) Class65 local39;
		if (this.aBoolean215) {
			local26 = Static103.aClass65Array3[super.aByte131];
			local39 = Static40.aClass65Array2[0];
		} else {
			local26 = Static40.aClass65Array2[super.aByte131];
			if (super.aByte131 < 3) {
				local39 = Static40.aClass65Array2[super.aByte131 + 1];
			} else {
				local39 = null;
			}
		}
		return local18.method4602(arg2, local39, this.aByte28, arg1, super.anInt10303, arg0, local26, super.anInt10306, super.anInt10310, this.aByte27);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(Z)I")
	@Override
	public int method8618() {
		return this.aClass166_3 == null ? 0 : this.aClass166_3.fa();
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(I)I")
	@Override
	public int method8624() {
		return this.aByte27;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8621() {
		return this.aBoolean214;
	}
}
