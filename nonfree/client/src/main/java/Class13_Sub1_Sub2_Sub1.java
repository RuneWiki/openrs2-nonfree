import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class13_Sub1_Sub2_Sub1 extends Class13_Sub1_Sub2 implements Interface25 {

	@OriginalMember(owner = "client!fk", name = "Y", descriptor = "Lclient!gp;")
	private Class128 aClass128_1;

	@OriginalMember(owner = "client!fk", name = "R", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!fk", name = "gb", descriptor = "Lclient!mt;")
	public final Class228 aClass228_1;

	@OriginalMember(owner = "client!fk", name = "ib", descriptor = "Z")
	private final boolean aBoolean216;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!ha;Lclient!kha;IIIIIZII)V")
	public Class13_Sub1_Sub2_Sub1(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt4792);
		this.aClass228_1 = new Class228(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean216 = arg1.anInt4828 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBZILclient!ha;ILclient!ig;)V")
	@Override
	public void method8410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub1 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8413() {
		return this.aBoolean215;
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8415(@OriginalArg(1) Class95 arg0) {
		@Pc(20) Class182 local20 = this.aClass228_1.method4865(262144, true, true, arg0);
		if (local20 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt10090 >> 9;
		@Pc(32) int local32 = super.anInt10089 >> 9;
		@Pc(35) Class177 local35 = arg0.method6967();
		local35.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
		this.aClass228_1.method4870(local27, local20, local27, false, local32, local32, arg0, local35);
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aClass228_1.anInt5692;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8426() {
		return this.aClass228_1.method4873();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)I")
	@Override
	public int method8420() {
		return this.aClass228_1.anInt5703;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(ILclient!ha;)Lclient!gp;")
	@Override
	public Class128 method8412(@OriginalArg(1) Class95 arg0) {
		return this.aClass128_1;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8422(@OriginalArg(1) Class95 arg0) {
		this.aClass228_1.method4869(arg0);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8400(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(19) Class182 local19 = this.aClass228_1.method4865(131072, false, false, arg0);
		if (local19 == null) {
			return false;
		} else {
			@Pc(26) Class177 local26 = arg0.method6967();
			local26.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
			return Static449.aBoolean538 ? local19.method6203(arg1, arg2, local26, false, 0, Static638.anInt7982) : local19.method6205(arg1, arg2, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)V")
	@Override
	public void method8414() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)I")
	@Override
	public int method8397() {
		return this.aClass228_1.method4874();
	}

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "(I)I")
	@Override
	public int method8402(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.method8413();
		}
		return this.aClass228_1.method4863((byte) -67);
	}

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8408() {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8404() {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)I")
	@Override
	public int method8421() {
		return this.aClass228_1.anInt5690;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lclient!ha;I)Lclient!jl;")
	@Override
	public Class13_Sub6 method8399(@OriginalArg(0) Class95 arg0) {
		@Pc(14) Class182 local14 = this.aClass228_1.method4865(2048, true, false, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class177 local21 = arg0.method6967();
		local21.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
		@Pc(40) Class13_Sub6 local40 = Static491.method6848(1, this.aBoolean216);
		@Pc(45) int local45 = super.anInt10090 >> 9;
		@Pc(50) int local50 = super.anInt10089 >> 9;
		this.aClass228_1.method4870(local45, local14, local45, true, local50, local50, arg0, local21);
		if (Static449.aBoolean538) {
			local14.method6194(local21, local40.aClass13_Sub2Array1[0], Static638.anInt7982, 0);
		} else {
			local14.method6206(local21, local40.aClass13_Sub2Array1[0], 0);
		}
		if (this.aClass228_1.aClass13_Sub9_5 != null) {
			@Pc(92) Class98 local92 = this.aClass228_1.aClass13_Sub9_5.method5660();
			if (Static449.aBoolean538) {
				arg0.method6977(local92, Static638.anInt7982);
			} else {
				arg0.method6960(local92);
			}
		}
		this.aBoolean215 = local14.F() || this.aClass228_1.aClass13_Sub9_5 != null;
		if (this.aClass128_1 == null) {
			this.aClass128_1 = Static560.method7661(super.anInt10089, local14, super.anInt10097, super.anInt10090);
		} else {
			Static136.method8325(local14, super.anInt10089, super.anInt10097, super.anInt10090, this.aClass128_1);
		}
		return local40;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class95 arg0) {
		this.aClass228_1.method4872(arg0);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	@Override
	public void method8424() {
	}
}
