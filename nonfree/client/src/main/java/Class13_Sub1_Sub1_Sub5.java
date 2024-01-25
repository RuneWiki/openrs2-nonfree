import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class13_Sub1_Sub1_Sub5 extends Class13_Sub1_Sub1 implements Interface25 {

	@OriginalMember(owner = "client!tv", name = "wb", descriptor = "Lclient!gp;")
	private Class128 aClass128_6;

	@OriginalMember(owner = "client!tv", name = "tb", descriptor = "B")
	private final byte aByte120;

	@OriginalMember(owner = "client!tv", name = "pb", descriptor = "B")
	private final byte aByte119;

	@OriginalMember(owner = "client!tv", name = "rb", descriptor = "S")
	private final short aShort121;

	@OriginalMember(owner = "client!tv", name = "mb", descriptor = "Z")
	private boolean aBoolean685;

	@OriginalMember(owner = "client!tv", name = "J", descriptor = "Z")
	private final boolean aBoolean681;

	@OriginalMember(owner = "client!tv", name = "eb", descriptor = "Z")
	private final boolean aBoolean684;

	@OriginalMember(owner = "client!tv", name = "Z", descriptor = "Z")
	private final boolean aBoolean683;

	@OriginalMember(owner = "client!tv", name = "ub", descriptor = "Lclient!r;")
	private Class2_Sub2_Sub19 aClass2_Sub2_Sub19_4;

	@OriginalMember(owner = "client!tv", name = "nb", descriptor = "Lclient!ka;")
	public Class182 aClass182_5;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!ha;Lclient!kha;IIIIIZIIIIIIZ)V")
	public Class13_Sub1_Sub1_Sub5(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4810 == 1, Static79.method1107(arg12, arg13));
		this.aByte120 = (byte) arg12;
		super.aByte126 = (byte) arg3;
		this.aByte119 = (byte) arg13;
		this.aShort121 = (short) arg1.anInt4815;
		this.aBoolean685 = arg14;
		this.aBoolean681 = arg7;
		this.aBoolean684 = arg1.anInt4828 != 0 && !arg7;
		this.aBoolean683 = arg0.method6926() && arg1.aBoolean344 && !this.aBoolean681 && Static234.aClass2_Sub5_48.aClass6_Sub24_1.method7575() != 0;
		@Pc(78) int local78 = 2048;
		if (this.aBoolean685) {
			local78 |= 0x10000;
		}
		@Pc(93) Class378 local93 = this.method7700(this.aBoolean683, arg0, local78);
		if (local93 != null) {
			this.aClass2_Sub2_Sub19_4 = local93.aClass2_Sub2_Sub19_6;
			this.aClass182_5 = local93.aClass182_7;
			if (this.aBoolean685) {
				this.aClass182_5 = this.aClass182_5.method6208((byte) 0, local78, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IBZILclient!ha;ILclient!ig;)V")
	@Override
	public void method8410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub1 arg5) {
		if (arg5 instanceof Class13_Sub1_Sub4_Sub2) {
			@Pc(13) Class13_Sub1_Sub4_Sub2 local13 = (Class13_Sub1_Sub4_Sub2) arg5;
			if (this.aClass182_5 != null && local13.aClass182_6 != null) {
				this.aClass182_5.method6195(local13.aClass182_6, arg4, arg0, arg2, arg1);
			}
		} else if (arg5 instanceof Class13_Sub1_Sub1_Sub5) {
			@Pc(35) Class13_Sub1_Sub1_Sub5 local35 = (Class13_Sub1_Sub1_Sub5) arg5;
			if (this.aClass182_5 != null && local35.aClass182_5 != null) {
				this.aClass182_5.method6195(local35.aClass182_5, arg4, arg0, arg2, arg1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "(I)I")
	@Override
	public int method8397() {
		return this.aClass182_5 == null ? 0 : this.aClass182_5.fa();
	}

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "(I)I")
	@Override
	public int method8402(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return this.aClass182_5 == null ? 0 : this.aClass182_5.ma();
		} else {
			return 114;
		}
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8413() {
		return this.aClass182_5 == null ? false : this.aClass182_5.F();
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(Lclient!ha;I)Lclient!jl;")
	@Override
	public Class13_Sub6 method8399(@OriginalArg(0) Class95 arg0) {
		if (this.aClass182_5 == null) {
			return null;
		}
		@Pc(17) Class177 local17 = arg0.method6967();
		local17.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
		@Pc(31) Class13_Sub6 local31 = Static491.method6848(1, this.aBoolean684);
		if (Static449.aBoolean538) {
			this.aClass182_5.method6194(local17, local31.aClass13_Sub2Array1[0], Static638.anInt7982, 0);
		} else {
			this.aClass182_5.method6206(local17, local31.aClass13_Sub2Array1[0], 0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8415(@OriginalArg(1) Class95 arg0) {
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8404() {
		return this.aBoolean685;
	}

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "(I)I")
	public int method7699() {
		return this.aClass182_5 == null ? 15 : this.aClass182_5.na() / 4;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8422(@OriginalArg(1) Class95 arg0) {
		@Pc(27) Class2_Sub2_Sub19 local27;
		if (this.aClass2_Sub2_Sub19_4 == null && this.aBoolean683) {
			@Pc(20) Class378 local20 = this.method7700(true, arg0, 262144);
			local27 = local20 == null ? null : local20.aClass2_Sub2_Sub19_6;
		} else {
			local27 = this.aClass2_Sub2_Sub19_4;
			this.aClass2_Sub2_Sub19_4 = null;
		}
		if (local27 != null) {
			Static575.method7864(local27, super.aByte126, super.anInt10090, super.anInt10089, null);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I")
	@Override
	public int method8420() {
		return this.aByte119;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(ILclient!ha;)Lclient!gp;")
	@Override
	public Class128 method8412(@OriginalArg(1) Class95 arg0) {
		if (this.aClass128_6 == null) {
			this.aClass128_6 = Static560.method7661(super.anInt10089, this.method7701(0, arg0), super.anInt10097, super.anInt10090);
		}
		return this.aClass128_6;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZLclient!ha;II)Lclient!ws;")
	private Class378 method7700(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class191 local13 = Static319.aClass141_4.method2971(this.aShort121 & 0xFFFF);
		@Pc(27) Class76 local27;
		@Pc(38) Class76 local38;
		if (this.aBoolean681) {
			local38 = Static462.aClass76Array3[0];
			local27 = Static313.aClass76Array1[super.aByte126];
		} else {
			local27 = Static462.aClass76Array3[super.aByte126];
			if (super.aByte126 < 3) {
				local38 = Static462.aClass76Array3[super.aByte126 + 1];
			} else {
				local38 = null;
			}
		}
		return local13.method4064(arg2, super.anInt10089, arg0, this.aByte120 == 11 ? this.aByte119 + 4 : this.aByte119, arg1, super.anInt10090, super.anInt10097, this.aByte120 == 11 ? 10 : this.aByte120, local27, local38);
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aShort121 & 0xFFFF;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class95 arg0) {
		@Pc(29) Class2_Sub2_Sub19 local29;
		if (this.aClass2_Sub2_Sub19_4 == null && this.aBoolean683) {
			@Pc(22) Class378 local22 = this.method7700(true, arg0, 262144);
			local29 = local22 == null ? null : local22.aClass2_Sub2_Sub19_6;
		} else {
			local29 = this.aClass2_Sub2_Sub19_4;
			this.aClass2_Sub2_Sub19_4 = null;
		}
		if (local29 != null) {
			Static247.method3407(local29, super.aByte126, super.anInt10090, super.anInt10089, null);
		}
	}

	@OriginalMember(owner = "client!tv", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8408() {
		if (this.aClass182_5 == null) {
			return true;
		} else {
			return !this.aClass182_5.r();
		}
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)I")
	@Override
	public int method8421() {
		return this.aByte120;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8426() {
		return this.aBoolean683;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8400(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class182 local14 = this.method7701(131072, arg0);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class177 local19 = arg0.method6967();
			local19.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
			return Static449.aBoolean538 ? local14.method6203(arg1, arg2, local19, false, 0, Static638.anInt7982) : local14.method6205(arg1, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class182 method7701(@OriginalArg(1) int arg0, @OriginalArg(2) Class95 arg1) {
		if (this.aClass182_5 != null && arg1.method6963(this.aClass182_5.ua(), arg0) == 0) {
			return this.aClass182_5;
		} else {
			@Pc(29) Class378 local29 = this.method7700(false, arg1, arg0);
			return local29 == null ? null : local29.aClass182_7;
		}
	}

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "(B)V")
	@Override
	public void method8414() {
		this.aBoolean685 = false;
		if (this.aClass182_5 != null) {
			this.aClass182_5.s(this.aClass182_5.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
	@Override
	public void method8424() {
		if (this.aClass182_5 != null) {
			this.aClass182_5.method6212();
		}
	}
}
