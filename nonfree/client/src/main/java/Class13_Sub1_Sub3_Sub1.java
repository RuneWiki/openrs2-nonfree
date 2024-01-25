import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class13_Sub1_Sub3_Sub1 extends Class13_Sub1_Sub3 implements Interface25 {

	@OriginalMember(owner = "client!mo", name = "V", descriptor = "Lclient!gp;")
	private Class128 aClass128_3;

	@OriginalMember(owner = "client!mo", name = "S", descriptor = "Z")
	private final boolean aBoolean411;

	@OriginalMember(owner = "client!mo", name = "lb", descriptor = "B")
	private final byte lb;

	@OriginalMember(owner = "client!mo", name = "cb", descriptor = "S")
	private final short aShort78;

	@OriginalMember(owner = "client!mo", name = "eb", descriptor = "Z")
	private final boolean aBoolean413;

	@OriginalMember(owner = "client!mo", name = "fb", descriptor = "B")
	private final byte aByte89;

	@OriginalMember(owner = "client!mo", name = "X", descriptor = "Z")
	private final boolean aBoolean412;

	@OriginalMember(owner = "client!mo", name = "bb", descriptor = "Lclient!ka;")
	private Class182 aClass182_2;

	@OriginalMember(owner = "client!mo", name = "M", descriptor = "Lclient!r;")
	private Class2_Sub2_Sub19 aClass2_Sub2_Sub19_2;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!ha;Lclient!kha;IIIIIZIIII)V")
	public Class13_Sub1_Sub3_Sub1(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aBoolean411 = arg7;
		this.lb = (byte) arg11;
		super.anInt10090 = arg4;
		super.anInt10089 = arg6;
		this.aShort78 = (short) arg1.anInt4815;
		this.aBoolean413 = arg1.anInt4828 != 0 && !arg7;
		this.aByte89 = (byte) arg10;
		this.aBoolean412 = arg0.method6926() && arg1.aBoolean344 && !this.aBoolean411 && Static234.aClass2_Sub5_48.aClass6_Sub24_1.method7575() != 0;
		@Pc(73) Class378 local73 = this.method4827(2048, arg0, this.aBoolean412);
		if (local73 != null) {
			this.aClass182_2 = local73.aClass182_7;
			this.aClass2_Sub2_Sub19_2 = local73.aClass2_Sub2_Sub19_6;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class95 arg0) {
		@Pc(20) Class2_Sub2_Sub19 local20;
		if (this.aClass2_Sub2_Sub19_2 == null && this.aBoolean412) {
			@Pc(31) Class378 local31 = this.method4827(262144, arg0, true);
			local20 = local31 == null ? null : local31.aClass2_Sub2_Sub19_6;
		} else {
			local20 = this.aClass2_Sub2_Sub19_2;
			this.aClass2_Sub2_Sub19_2 = null;
		}
		if (local20 != null) {
			Static247.method3407(local20, super.aByte126, super.anInt10090, super.anInt10089, null);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
	@Override
	public void method8424() {
		if (this.aClass182_2 != null) {
			this.aClass182_2.method6212();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8422(@OriginalArg(1) Class95 arg0) {
		@Pc(14) Class2_Sub2_Sub19 local14;
		if (this.aClass2_Sub2_Sub19_2 == null && this.aBoolean412) {
			@Pc(25) Class378 local25 = this.method4827(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass2_Sub2_Sub19_6;
		} else {
			local14 = this.aClass2_Sub2_Sub19_2;
			this.aClass2_Sub2_Sub19_2 = null;
		}
		if (local14 != null) {
			Static575.method7864(local14, super.aByte126, super.anInt10090, super.anInt10089, null);
		}
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8413() {
		return this.aClass182_2 == null ? false : this.aClass182_2.F();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8426() {
		return this.aBoolean412;
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)I")
	@Override
	public int method8402(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return this.aClass182_2 == null ? 0 : this.aClass182_2.ma();
		} else {
			return -62;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class182 method4825(@OriginalArg(0) int arg0, @OriginalArg(2) Class95 arg1) {
		if (this.aClass182_2 != null && arg1.method6963(this.aClass182_2.ua(), arg0) == 0) {
			return this.aClass182_2;
		} else {
			@Pc(31) Class378 local31 = this.method4827(arg0, arg1, false);
			return local31 == null ? null : local31.aClass182_7;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(Lclient!ha;I)Lclient!jl;")
	@Override
	public Class13_Sub6 method8399(@OriginalArg(0) Class95 arg0) {
		if (this.aClass182_2 == null) {
			return null;
		}
		@Pc(11) Class177 local11 = arg0.method6967();
		local11.method7869(super.anInt10090 + super.aShort126, super.anInt10097, super.anInt10089 + super.aShort127);
		@Pc(41) Class13_Sub6 local41 = Static491.method6848(1, this.aBoolean413);
		if (Static449.aBoolean538) {
			this.aClass182_2.method6194(local11, local41.aClass13_Sub2Array1[0], Static638.anInt7982, 0);
		} else {
			this.aClass182_2.method6206(local11, local41.aClass13_Sub2Array1[0], 0);
		}
		return local41;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)I")
	@Override
	public int method8420() {
		return this.lb;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!ha;IZ)Lclient!ws;")
	private Class378 method4827(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(21) Class191 local21 = Static319.aClass141_4.method2971(this.aShort78 & 0xFFFF);
		@Pc(44) Class76 local44;
		@Pc(35) Class76 local35;
		if (this.aBoolean411) {
			local35 = Static462.aClass76Array3[0];
			local44 = Static313.aClass76Array1[super.aByte126];
		} else {
			if (super.aByte126 < 3) {
				local35 = Static462.aClass76Array3[super.aByte126 + 1];
			} else {
				local35 = null;
			}
			local44 = Static462.aClass76Array3[super.aByte126];
		}
		return local21.method4064(arg0, super.anInt10089, arg2, this.lb, arg1, super.anInt10090, super.anInt10097, this.aByte89, local44, local35);
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)I")
	@Override
	public int method8397() {
		return this.aClass182_2 == null ? 0 : this.aClass182_2.fa();
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8415(@OriginalArg(1) Class95 arg0) {
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(ILclient!ha;)Lclient!gp;")
	@Override
	public Class128 method8412(@OriginalArg(1) Class95 arg0) {
		if (this.aClass128_3 == null) {
			this.aClass128_3 = Static560.method7661(super.anInt10089, this.method4825(0, arg0), super.anInt10097, super.anInt10090);
		}
		return this.aClass128_3;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aShort78 & 0xFFFF;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8400(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class182 local15 = this.method4825(131072, arg0);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class177 local20 = arg0.method6967();
			local20.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
			return Static449.aBoolean538 ? local15.method6203(arg1, arg2, local20, false, 0, Static638.anInt7982) : local15.method6205(arg1, arg2, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)I")
	@Override
	public int method8421() {
		return this.aByte89;
	}

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8408() {
		if (this.aClass182_2 == null) {
			return true;
		} else {
			return !this.aClass182_2.r();
		}
	}
}
