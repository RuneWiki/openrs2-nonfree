import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class3_Sub1_Sub5_Sub1 extends Class3_Sub1_Sub5 implements Interface21 {

	@OriginalMember(owner = "client!ge", name = "db", descriptor = "Lclient!hw;")
	private Class142 aClass142_4;

	@OriginalMember(owner = "client!ge", name = "cb", descriptor = "S")
	private final short aShort48;

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "Z")
	private final boolean aBoolean317;

	@OriginalMember(owner = "client!ge", name = "lb", descriptor = "Z")
	private boolean lb;

	@OriginalMember(owner = "client!ge", name = "X", descriptor = "Z")
	private final boolean aBoolean318;

	@OriginalMember(owner = "client!ge", name = "ab", descriptor = "B")
	private byte aByte69;

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "B")
	private final byte aByte68;

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "Z")
	private final boolean aBoolean316;

	@OriginalMember(owner = "client!ge", name = "pb", descriptor = "Lclient!r;")
	private Class2_Sub6_Sub7 aClass2_Sub6_Sub7_5;

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "Lclient!ka;")
	public Class166 aClass166_5;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!ha;Lclient!iv;IIIIIZIIZ)V")
	public Class3_Sub1_Sub5_Sub1(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static632.method9170(arg9, arg8));
		this.aShort48 = (short) arg1.anInt5398;
		this.aBoolean317 = arg7;
		this.lb = arg10;
		super.anInt10303 = arg4;
		this.aBoolean318 = arg1.anInt5363 != 0 && !arg7;
		super.anInt10310 = arg6;
		this.aByte69 = (byte) arg8;
		this.aByte68 = (byte) arg9;
		this.aBoolean316 = arg0.method7285() && arg1.aBoolean398 && !this.aBoolean317 && Static74.aClass2_Sub13_5.aClass14_Sub15_1.method5864() != 0;
		@Pc(69) int local69 = 2048;
		if (this.lb) {
			local69 |= 0x10000;
		}
		@Pc(84) Class16 local84 = this.method3731(this.aBoolean316, local69, arg0);
		if (local84 != null) {
			this.aClass2_Sub6_Sub7_5 = local84.aClass2_Sub6_Sub7_1;
			this.aClass166_5 = local84.aClass166_1;
			if (this.lb) {
				this.aClass166_5 = this.aClass166_5.method6684((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)I")
	@Override
	public int method8622() {
		return this.aByte69;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	@Override
	public void method8623() {
		if (this.aClass166_5 != null) {
			this.aClass166_5.method6682();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8615(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class166 local9 = this.method3732(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class30 local20 = arg0.method7308();
			local20.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
			return Static639.aBoolean753 ? local9.method6693(arg2, arg1, local20, false, 0, Static380.anInt7419) : local9.method6698(arg2, arg1, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8611(@OriginalArg(0) Class20 arg0) {
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)I")
	@Override
	public int method8624() {
		return this.aByte68;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
	@Override
	public void method8616() {
		this.lb = false;
		if (this.aClass166_5 != null) {
			this.aClass166_5.s(this.aClass166_5.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Lclient!ha;I)Lclient!hw;")
	@Override
	public Class142 method8605(@OriginalArg(0) Class20 arg0) {
		if (this.aClass142_4 == null) {
			this.aClass142_4 = Static268.method4930(super.anInt10303, this.method3732(arg0, 0), super.anInt10310, super.anInt10306);
		}
		return this.aClass142_4;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)I")
	@Override
	public int method8625() {
		return this.aShort48 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)I")
	@Override
	public int method8603(@OriginalArg(0) int arg0) {
		if (arg0 != -25675) {
			this.aByte69 = 53;
		}
		return this.aClass166_5 == null ? 0 : this.aClass166_5.ma();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8621() {
		return this.aBoolean316;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ha;IZLclient!ga;IBI)V")
	@Override
	public void method8604(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class3_Sub1_Sub5_Sub1) {
			@Pc(12) Class3_Sub1_Sub5_Sub1 local12 = (Class3_Sub1_Sub5_Sub1) arg3;
			if (this.aClass166_5 != null && local12.aClass166_5 != null) {
				this.aClass166_5.method6683(local12.aClass166_5, arg5, arg1, arg4, arg2);
			}
		} else if (arg3 instanceof Class3_Sub1_Sub3_Sub1) {
			@Pc(35) Class3_Sub1_Sub3_Sub1 local35 = (Class3_Sub1_Sub3_Sub1) arg3;
			if (this.aClass166_5 != null && local35.aClass166_4 != null) {
				this.aClass166_5.method6683(local35.aClass166_4, arg5, arg1, arg4, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8627(@OriginalArg(1) Class20 arg0) {
		@Pc(25) Class2_Sub6_Sub7 local25;
		if (this.aClass2_Sub6_Sub7_5 == null && this.aBoolean316) {
			@Pc(18) Class16 local18 = this.method3731(true, 262144, arg0);
			local25 = local18 == null ? null : local18.aClass2_Sub6_Sub7_1;
		} else {
			local25 = this.aClass2_Sub6_Sub7_5;
			this.aClass2_Sub6_Sub7_5 = null;
		}
		if (local25 != null) {
			Static378.method2839(local25, super.aByte131, super.anInt10303, super.anInt10310, null);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIILclient!ha;)Lclient!ak;")
	private Class16 method3731(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class20 arg2) {
		@Pc(19) Class161 local19 = Static27.aClass342_3.method8534(this.aShort48 & 0xFFFF);
		@Pc(27) Class65 local27;
		@Pc(40) Class65 local40;
		if (this.aBoolean317) {
			local40 = Static40.aClass65Array2[0];
			local27 = Static103.aClass65Array3[super.aByte131];
		} else {
			local27 = Static40.aClass65Array2[super.aByte131];
			if (super.aByte131 < 3) {
				local40 = Static40.aClass65Array2[super.aByte131 + 1];
			} else {
				local40 = null;
			}
		}
		return local19.method4602(arg2, local40, this.aByte69, arg1, super.anInt10303, arg0, local27, super.anInt10306, super.anInt10310, this.aByte68);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(ILclient!ha;)Lclient!jda;")
	@Override
	public Class3_Sub4 method8610(@OriginalArg(1) Class20 arg0) {
		if (this.aClass166_5 == null) {
			return null;
		}
		@Pc(11) Class30 local11 = arg0.method7308();
		local11.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
		@Pc(25) Class3_Sub4 local25 = Static546.method8162(1, this.aBoolean318);
		if (Static639.aBoolean753) {
			this.aClass166_5.method6678(local11, local25.aClass3_Sub3Array1[0], Static380.anInt7419, 0);
		} else {
			this.aClass166_5.method6685(local11, local25.aClass3_Sub3Array1[0], 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ha;BI)Lclient!ka;")
	private Class166 method3732(@OriginalArg(0) Class20 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass166_5 != null && arg0.method7270(this.aClass166_5.ua(), arg1) == 0) {
			return this.aClass166_5;
		} else {
			@Pc(33) Class16 local33 = this.method3731(false, arg1, arg0);
			return local33 == null ? null : local33.aClass166_1;
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)I")
	@Override
	public int method8618() {
		return this.aClass166_5 == null ? 0 : this.aClass166_5.fa();
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8612() {
		return this.lb;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8601() {
		return this.aClass166_5 == null ? false : this.aClass166_5.F();
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8600() {
		if (this.aClass166_5 == null) {
			return true;
		} else {
			return !this.aClass166_5.r();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8626(@OriginalArg(0) Class20 arg0) {
		@Pc(31) Class2_Sub6_Sub7 local31;
		if (this.aClass2_Sub6_Sub7_5 == null && this.aBoolean316) {
			@Pc(24) Class16 local24 = this.method3731(true, 262144, arg0);
			local31 = local24 == null ? null : local24.aClass2_Sub6_Sub7_1;
		} else {
			local31 = this.aClass2_Sub6_Sub7_5;
			this.aClass2_Sub6_Sub7_5 = null;
		}
		if (local31 != null) {
			Static427.method6848(local31, super.aByte131, super.anInt10303, super.anInt10310, null);
		}
	}
}
