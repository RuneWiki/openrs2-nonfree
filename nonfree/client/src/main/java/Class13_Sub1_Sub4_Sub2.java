import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class13_Sub1_Sub4_Sub2 extends Class13_Sub1_Sub4 implements Interface25 {

	@OriginalMember(owner = "client!ur", name = "X", descriptor = "Lclient!gp;")
	private Class128 aClass128_7;

	@OriginalMember(owner = "client!ur", name = "eb", descriptor = "Z")
	private boolean aBoolean700;

	@OriginalMember(owner = "client!ur", name = "ib", descriptor = "S")
	private final short aShort123;

	@OriginalMember(owner = "client!ur", name = "T", descriptor = "Z")
	private final boolean aBoolean699;

	@OriginalMember(owner = "client!ur", name = "M", descriptor = "B")
	private final byte aByte124;

	@OriginalMember(owner = "client!ur", name = "R", descriptor = "Z")
	private final boolean aBoolean698;

	@OriginalMember(owner = "client!ur", name = "O", descriptor = "B")
	private final byte aByte125;

	@OriginalMember(owner = "client!ur", name = "gb", descriptor = "Z")
	private final boolean aBoolean701;

	@OriginalMember(owner = "client!ur", name = "mb", descriptor = "Lclient!ka;")
	public Class182 aClass182_6;

	@OriginalMember(owner = "client!ur", name = "nb", descriptor = "Lclient!r;")
	private Class2_Sub2_Sub19 aClass2_Sub2_Sub19_5;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!ha;Lclient!kha;IIIIIZIIZ)V")
	public Class13_Sub1_Sub4_Sub2(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static426.method5678(arg9, arg8));
		this.aBoolean700 = arg10;
		this.aShort123 = (short) arg1.anInt4815;
		this.aBoolean699 = arg7;
		super.anInt10089 = arg6;
		super.anInt10090 = arg4;
		this.aByte124 = (byte) arg8;
		this.aBoolean698 = arg1.anInt4828 != 0 && !arg7;
		this.aByte125 = (byte) arg9;
		this.aBoolean701 = arg0.method6926() && arg1.aBoolean344 && !this.aBoolean699 && Static234.aClass2_Sub5_48.aClass6_Sub24_1.method7575() != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean700) {
			local66 |= 0x10000;
		}
		@Pc(81) Class378 local81 = this.method7985(arg0, local66, this.aBoolean701);
		if (local81 != null) {
			this.aClass182_6 = local81.aClass182_7;
			this.aClass2_Sub2_Sub19_5 = local81.aClass2_Sub2_Sub19_6;
			if (this.aBoolean700) {
				this.aClass182_6 = this.aClass182_6.method6208((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8422(@OriginalArg(1) Class95 arg0) {
		@Pc(20) Class2_Sub2_Sub19 local20;
		if (this.aClass2_Sub2_Sub19_5 == null && this.aBoolean701) {
			@Pc(31) Class378 local31 = this.method7985(arg0, 262144, true);
			local20 = local31 == null ? null : local31.aClass2_Sub2_Sub19_6;
		} else {
			local20 = this.aClass2_Sub2_Sub19_5;
			this.aClass2_Sub2_Sub19_5 = null;
		}
		if (local20 != null) {
			Static575.method7864(local20, super.aByte126, super.anInt10090, super.anInt10089, null);
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)I")
	@Override
	public int method8421() {
		return this.aByte124;
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8415(@OriginalArg(1) Class95 arg0) {
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8400(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class182 local9 = this.method7986(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class177 local19 = arg0.method6967();
			local19.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
			return Static449.aBoolean538 ? local9.method6203(arg1, arg2, local19, false, 0, Static638.anInt7982) : local9.method6205(arg1, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
	@Override
	public void method8424() {
		if (this.aClass182_6 != null) {
			this.aClass182_6.method6212();
		}
	}

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "(I)I")
	@Override
	public int method8397() {
		return this.aClass182_6 == null ? 0 : this.aClass182_6.fa();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)I")
	@Override
	public int method8420() {
		return this.aByte125;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ha;IBZ)Lclient!ws;")
	private Class378 method7985(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class191 local18 = Static319.aClass141_4.method2971(this.aShort123 & 0xFFFF);
		@Pc(26) Class76 local26;
		@Pc(30) Class76 local30;
		if (this.aBoolean699) {
			local26 = Static313.aClass76Array1[super.aByte126];
			local30 = Static462.aClass76Array3[0];
		} else {
			local26 = Static462.aClass76Array3[super.aByte126];
			if (super.aByte126 >= 3) {
				local30 = null;
			} else {
				local30 = Static462.aClass76Array3[super.aByte126 + 1];
			}
		}
		return local18.method4064(arg1, super.anInt10089, arg2, this.aByte125, arg0, super.anInt10090, super.anInt10097, this.aByte124, local26, local30);
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(B)V")
	@Override
	public void method8414() {
		this.aBoolean700 = false;
		if (this.aClass182_6 != null) {
			this.aClass182_6.s(this.aClass182_6.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(ILclient!ha;)Lclient!gp;")
	@Override
	public Class128 method8412(@OriginalArg(1) Class95 arg0) {
		if (this.aClass128_7 == null) {
			this.aClass128_7 = Static560.method7661(super.anInt10089, this.method7986(0, arg0), super.anInt10097, super.anInt10090);
		}
		return this.aClass128_7;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZLclient!ha;)Lclient!ka;")
	private Class182 method7986(@OriginalArg(0) int arg0, @OriginalArg(2) Class95 arg1) {
		if (this.aClass182_6 != null && arg1.method6963(this.aClass182_6.ua(), arg0) == 0) {
			return this.aClass182_6;
		} else {
			@Pc(32) Class378 local32 = this.method7985(arg1, arg0, false);
			return local32 == null ? null : local32.aClass182_7;
		}
	}

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8408() {
		if (this.aClass182_6 == null) {
			return true;
		} else {
			return !this.aClass182_6.r();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class95 arg0) {
		@Pc(18) Class2_Sub2_Sub19 local18;
		if (this.aClass2_Sub2_Sub19_5 == null && this.aBoolean701) {
			@Pc(29) Class378 local29 = this.method7985(arg0, 262144, true);
			local18 = local29 == null ? null : local29.aClass2_Sub2_Sub19_6;
		} else {
			local18 = this.aClass2_Sub2_Sub19_5;
			this.aClass2_Sub2_Sub19_5 = null;
		}
		if (local18 != null) {
			Static247.method3407(local18, super.aByte126, super.anInt10090, super.anInt10089, null);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8426() {
		return this.aBoolean701;
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aShort123 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBZILclient!ha;ILclient!ig;)V")
	@Override
	public void method8410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub1 arg5) {
		if (arg5 instanceof Class13_Sub1_Sub4_Sub2) {
			@Pc(5) Class13_Sub1_Sub4_Sub2 local5 = (Class13_Sub1_Sub4_Sub2) arg5;
			if (this.aClass182_6 != null && local5.aClass182_6 != null) {
				this.aClass182_6.method6195(local5.aClass182_6, arg4, arg0, arg2, arg1);
			}
		} else if (arg5 instanceof Class13_Sub1_Sub1_Sub5) {
			@Pc(28) Class13_Sub1_Sub1_Sub5 local28 = (Class13_Sub1_Sub1_Sub5) arg5;
			if (this.aClass182_6 != null && local28.aClass182_5 != null) {
				this.aClass182_6.method6195(local28.aClass182_5, arg4, arg0, arg2, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8413() {
		return this.aClass182_6 == null ? false : this.aClass182_6.F();
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8404() {
		return this.aBoolean700;
	}

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "(I)I")
	@Override
	public int method8402(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.method8426();
		}
		return this.aClass182_6 == null ? 0 : this.aClass182_6.ma();
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(Lclient!ha;I)Lclient!jl;")
	@Override
	public Class13_Sub6 method8399(@OriginalArg(0) Class95 arg0) {
		if (this.aClass182_6 == null) {
			return null;
		}
		@Pc(18) Class177 local18 = arg0.method6967();
		local18.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
		@Pc(34) Class13_Sub6 local34 = Static491.method6848(1, this.aBoolean698);
		if (Static449.aBoolean538) {
			this.aClass182_6.method6194(local18, local34.aClass13_Sub2Array1[0], Static638.anInt7982, 0);
		} else {
			this.aClass182_6.method6206(local18, local34.aClass13_Sub2Array1[0], 0);
		}
		return local34;
	}
}
