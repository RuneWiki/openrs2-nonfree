import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class13_Sub1_Sub4_Sub1 extends Class13_Sub1_Sub4 implements Interface25 {

	@OriginalMember(owner = "client!qca", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!qca", name = "W", descriptor = "Lclient!gp;")
	private Class128 aClass128_4;

	@OriginalMember(owner = "client!qca", name = "R", descriptor = "Z")
	private boolean aBoolean545 = false;

	@OriginalMember(owner = "client!qca", name = "M", descriptor = "Lclient!mt;")
	public final Class228 aClass228_2;

	@OriginalMember(owner = "client!qca", name = "fb", descriptor = "Z")
	private final boolean aBoolean546;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!ha;Lclient!kha;IIIIIZIII)V")
	public Class13_Sub1_Sub4_Sub1(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static181.method2639(arg8, arg9));
		this.aClass228_2 = new Class228(arg0, arg1, arg8, arg9, super.aByte127, arg3, this, arg7, arg10);
		this.aBoolean546 = arg1.anInt4828 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aClass228_2.anInt5692;
	}

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "(B)V")
	@Override
	public void method8414() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)I")
	@Override
	public int method8421() {
		return this.aClass228_2.anInt5690;
	}

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8415(@OriginalArg(1) Class95 arg0) {
		@Pc(12) Class182 local12 = this.aClass228_2.method4865(262144, true, true, arg0);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10090 >> 9;
		@Pc(24) int local24 = super.anInt10089 >> 9;
		@Pc(27) Class177 local27 = arg0.method6967();
		local27.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
		this.aClass228_2.method4870(local19, local12, local19, false, local24, local24, arg0, local27);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8400(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class182 local17 = this.aClass228_2.method4865(131072, false, false, arg0);
		if (local17 == null) {
			return false;
		} else {
			@Pc(24) Class177 local24 = arg0.method6967();
			local24.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
			return Static449.aBoolean538 ? local17.method6203(arg1, arg2, local24, false, 0, Static638.anInt7982) : local17.method6205(arg1, arg2, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(ILclient!ha;)Lclient!gp;")
	@Override
	public Class128 method8412(@OriginalArg(1) Class95 arg0) {
		return this.aClass128_4;
	}

	@OriginalMember(owner = "client!qca", name = "g", descriptor = "(I)I")
	@Override
	public int method8402(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.aClass128_4 = null;
		}
		return this.aClass228_2.method4863((byte) -67);
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(Lclient!ha;I)Lclient!jl;")
	@Override
	public Class13_Sub6 method8399(@OriginalArg(0) Class95 arg0) {
		@Pc(14) Class182 local14 = this.aClass228_2.method4865(2048, true, false, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class177 local21 = arg0.method6967();
		local21.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
		@Pc(35) Class13_Sub6 local35 = Static491.method6848(1, this.aBoolean546);
		@Pc(40) int local40 = super.anInt10090 >> 9;
		@Pc(45) int local45 = super.anInt10089 >> 9;
		this.aClass228_2.method4870(local40, local14, local40, true, local45, local45, arg0, local21);
		if (Static449.aBoolean538) {
			local14.method6194(local21, local35.aClass13_Sub2Array1[0], Static638.anInt7982, 0);
		} else {
			local14.method6206(local21, local35.aClass13_Sub2Array1[0], 0);
		}
		if (this.aClass228_2.aClass13_Sub9_5 != null) {
			@Pc(93) Class98 local93 = this.aClass228_2.aClass13_Sub9_5.method5660();
			if (Static449.aBoolean538) {
				arg0.method6977(local93, Static638.anInt7982);
			} else {
				arg0.method6960(local93);
			}
		}
		this.aBoolean545 = local14.F() || this.aClass228_2.aClass13_Sub9_5 != null;
		if (this.aClass128_4 == null) {
			this.aClass128_4 = Static560.method7661(super.anInt10089, local14, super.anInt10097, super.anInt10090);
		} else {
			Static136.method8325(local14, super.anInt10089, super.anInt10097, super.anInt10090, this.aClass128_4);
		}
		return local35;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8426() {
		return this.aClass228_2.method4873();
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class95 arg0) {
		this.aClass228_2.method4872(arg0);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8422(@OriginalArg(1) Class95 arg0) {
		this.aClass228_2.method4869(arg0);
	}

	@OriginalMember(owner = "client!qca", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8408() {
		return false;
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8404() {
		return false;
	}

	@OriginalMember(owner = "client!qca", name = "f", descriptor = "(I)I")
	@Override
	public int method8397() {
		return this.aClass228_2.method4874();
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V")
	@Override
	public void method8424() {
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)I")
	@Override
	public int method8420() {
		return this.aClass228_2.anInt5703;
	}

	@OriginalMember(owner = "client!qca", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8413() {
		return this.aBoolean545;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IBZILclient!ha;ILclient!ig;)V")
	@Override
	public void method8410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub1 arg5) {
		throw new IllegalStateException();
	}
}
