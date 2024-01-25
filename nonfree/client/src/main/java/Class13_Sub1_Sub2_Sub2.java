import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class13_Sub1_Sub2_Sub2 extends Class13_Sub1_Sub2 implements Interface25 {

	@OriginalMember(owner = "client!ma", name = "W", descriptor = "Lclient!gp;")
	private Class128 aClass128_2;

	@OriginalMember(owner = "client!ma", name = "lb", descriptor = "B")
	private final byte lb;

	@OriginalMember(owner = "client!ma", name = "gb", descriptor = "Z")
	private final boolean aBoolean383;

	@OriginalMember(owner = "client!ma", name = "nb", descriptor = "Z")
	private boolean aBoolean384;

	@OriginalMember(owner = "client!ma", name = "jb", descriptor = "S")
	private final short aShort56;

	@OriginalMember(owner = "client!ma", name = "ob", descriptor = "Z")
	private final boolean aBoolean385;

	@OriginalMember(owner = "client!ma", name = "N", descriptor = "Z")
	private boolean aBoolean382;

	@OriginalMember(owner = "client!ma", name = "pb", descriptor = "Lclient!ka;")
	private Class182 aClass182_1;

	@OriginalMember(owner = "client!ma", name = "mb", descriptor = "Lclient!r;")
	private Class2_Sub2_Sub19 aClass2_Sub2_Sub19_1;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!ha;Lclient!kha;IIIIIZIZ)V")
	public Class13_Sub1_Sub2_Sub2(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt4792);
		this.lb = (byte) arg8;
		super.anInt10090 = arg4;
		this.aBoolean383 = arg1.anInt4828 != 0 && !arg7;
		super.anInt10089 = arg6;
		this.aBoolean384 = arg9;
		this.aShort56 = (short) arg1.anInt4815;
		this.aBoolean385 = arg7;
		this.aBoolean382 = arg0.method6926() && arg1.aBoolean344 && !this.aBoolean385 && Static234.aClass2_Sub5_48.aClass6_Sub24_1.method7575() != 0;
		@Pc(60) int local60 = 2048;
		if (this.aBoolean384) {
			local60 |= 0x10000;
		}
		@Pc(75) Class378 local75 = this.method4542(arg0, this.aBoolean382, local60);
		if (local75 != null) {
			this.aClass182_1 = local75.aClass182_7;
			this.aClass2_Sub2_Sub19_1 = local75.aClass2_Sub2_Sub19_6;
			if (this.aBoolean384) {
				this.aClass182_1 = this.aClass182_1.method6208((byte) 0, local60, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8413() {
		return this.aClass182_1 == null ? false : this.aClass182_1.F();
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)I")
	@Override
	public int method8397() {
		return this.aClass182_1 == null ? 0 : this.aClass182_1.fa();
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(ILclient!ha;)Lclient!gp;")
	@Override
	public Class128 method8412(@OriginalArg(1) Class95 arg0) {
		if (this.aClass128_2 == null) {
			this.aClass128_2 = Static560.method7661(super.anInt10089, this.method4543(arg0, 0), super.anInt10097, super.anInt10090);
		}
		return this.aClass128_2;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aShort56 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ha;BZI)Lclient!ws;")
	private Class378 method4542(@OriginalArg(0) Class95 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class191 local18 = Static319.aClass141_4.method2971(this.aShort56 & 0xFFFF);
		@Pc(26) Class76 local26;
		@Pc(34) Class76 local34;
		if (this.aBoolean385) {
			local34 = Static462.aClass76Array3[0];
			local26 = Static313.aClass76Array1[super.aByte126];
		} else {
			local26 = Static462.aClass76Array3[super.aByte126];
			if (super.aByte126 >= 3) {
				local34 = null;
			} else {
				local34 = Static462.aClass76Array3[super.aByte126 + 1];
			}
		}
		return local18.method4064(arg2, super.anInt10089, arg1, this.lb, arg0, super.anInt10090, super.anInt10097, 22, local26, local34);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8400(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class182 local14 = this.method4543(arg0, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class177 local19 = arg0.method6967();
			local19.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
			return Static449.aBoolean538 ? local14.method6203(arg1, arg2, local19, false, 0, Static638.anInt7982) : local14.method6205(arg1, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8404() {
		return this.aBoolean384;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8422(@OriginalArg(1) Class95 arg0) {
		@Pc(22) Class2_Sub2_Sub19 local22;
		if (this.aClass2_Sub2_Sub19_1 == null && this.aBoolean382) {
			@Pc(33) Class378 local33 = this.method4542(arg0, true, 262144);
			local22 = local33 == null ? null : local33.aClass2_Sub2_Sub19_6;
		} else {
			local22 = this.aClass2_Sub2_Sub19_1;
			this.aClass2_Sub2_Sub19_1 = null;
		}
		if (local22 != null) {
			Static575.method7864(local22, super.aByte126, super.anInt10090, super.anInt10089, null);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBZILclient!ha;ILclient!ig;)V")
	@Override
	public void method8410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub1 arg5) {
		if (arg5 instanceof Class13_Sub1_Sub2_Sub2) {
			@Pc(5) Class13_Sub1_Sub2_Sub2 local5 = (Class13_Sub1_Sub2_Sub2) arg5;
			if (this.aClass182_1 != null && local5.aClass182_1 != null) {
				this.aClass182_1.method6195(local5.aClass182_1, arg4, arg0, arg2, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lclient!ha;I)Lclient!jl;")
	@Override
	public Class13_Sub6 method8399(@OriginalArg(0) Class95 arg0) {
		if (this.aClass182_1 == null) {
			return null;
		}
		@Pc(16) Class177 local16 = arg0.method6967();
		local16.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
		@Pc(30) Class13_Sub6 local30 = Static491.method6848(1, this.aBoolean383);
		if (Static449.aBoolean538) {
			this.aClass182_1.method6194(local16, local30.aClass13_Sub2Array1[0], Static638.anInt7982, 0);
		} else {
			this.aClass182_1.method6206(local16, local30.aClass13_Sub2Array1[0], 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8426() {
		return this.aBoolean382;
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(B)V")
	@Override
	public void method8414() {
		this.aBoolean384 = false;
		if (this.aClass182_1 != null) {
			this.aClass182_1.s(this.aClass182_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)I")
	@Override
	public int method8402(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.aBoolean382 = true;
		}
		return this.aClass182_1 == null ? 0 : this.aClass182_1.ma();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class182 method4543(@OriginalArg(0) Class95 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass182_1 != null && arg0.method6963(this.aClass182_1.ua(), arg1) == 0) {
			return this.aClass182_1;
		} else {
			@Pc(27) Class378 local27 = this.method4542(arg0, false, arg1);
			return local27 == null ? null : local27.aClass182_7;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class95 arg0) {
		@Pc(14) Class2_Sub2_Sub19 local14;
		if (this.aClass2_Sub2_Sub19_1 == null && this.aBoolean382) {
			@Pc(25) Class378 local25 = this.method4542(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass2_Sub2_Sub19_6;
		} else {
			local14 = this.aClass2_Sub2_Sub19_1;
			this.aClass2_Sub2_Sub19_1 = null;
		}
		if (local14 != null) {
			Static247.method3407(local14, super.aByte126, super.anInt10090, super.anInt10089, null);
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)I")
	@Override
	public int method8421() {
		return 22;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
	@Override
	public void method8424() {
		if (this.aClass182_1 != null) {
			this.aClass182_1.method6212();
		}
	}

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8408() {
		if (this.aClass182_1 == null) {
			return true;
		} else {
			return !this.aClass182_1.r();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)I")
	@Override
	public int method8420() {
		return this.lb;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8415(@OriginalArg(1) Class95 arg0) {
	}
}
