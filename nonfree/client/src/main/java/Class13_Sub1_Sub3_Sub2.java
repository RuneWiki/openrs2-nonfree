import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class13_Sub1_Sub3_Sub2 extends Class13_Sub1_Sub3 implements Interface25 {

	@OriginalMember(owner = "client!wh", name = "gb", descriptor = "Lclient!gp;")
	private Class128 aClass128_8;

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "Z")
	private boolean aBoolean739 = false;

	@OriginalMember(owner = "client!wh", name = "W", descriptor = "Lclient!mt;")
	public final Class228 aClass228_4;

	@OriginalMember(owner = "client!wh", name = "Z", descriptor = "Z")
	private final boolean aBoolean740;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!ha;Lclient!kha;IIIIIZIIIII)V")
	public Class13_Sub1_Sub3_Sub2(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass228_4 = new Class228(arg0, arg1, arg10, arg11, super.aByte127, arg3, this, arg7, arg12);
		this.aBoolean740 = arg1.anInt4828 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)I")
	@Override
	public int method8397() {
		return this.aClass228_4.method4874();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I")
	@Override
	public int method8420() {
		return this.aClass228_4.anInt5703;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class95 arg0) {
		this.aClass228_4.method4872(arg0);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8415(@OriginalArg(1) Class95 arg0) {
		@Pc(20) Class182 local20 = this.aClass228_4.method4865(262144, true, false, arg0);
		if (local20 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt10090 >> 9;
		@Pc(32) int local32 = super.anInt10089 >> 9;
		@Pc(35) Class177 local35 = arg0.method6967();
		local35.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
		this.aClass228_4.method4870(local27, local20, local27, false, local32, local32, arg0, local35);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8422(@OriginalArg(1) Class95 arg0) {
		this.aClass228_4.method4869(arg0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8400(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class182 local12 = this.aClass228_4.method4865(131072, false, false, arg0);
		if (local12 == null) {
			return false;
		} else {
			@Pc(24) Class177 local24 = arg0.method6967();
			local24.method7869(super.anInt10090 + super.aShort126, super.anInt10097, super.aShort127 + super.anInt10089);
			return Static449.aBoolean538 ? local12.method6203(arg1, arg2, local24, false, 0, Static638.anInt7982) : local12.method6205(arg1, arg2, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(ILclient!ha;)Lclient!gp;")
	@Override
	public Class128 method8412(@OriginalArg(1) Class95 arg0) {
		return this.aClass128_8;
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aClass228_4.anInt5692;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)I")
	@Override
	public int method8421() {
		return this.aClass228_4.anInt5690;
	}

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8408() {
		return false;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Lclient!ha;I)Lclient!jl;")
	@Override
	public Class13_Sub6 method8399(@OriginalArg(0) Class95 arg0) {
		@Pc(14) Class182 local14 = this.aClass228_4.method4865(2048, true, false, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class177 local21 = arg0.method6967();
		local21.method7869(super.anInt10090 + super.aShort126, super.anInt10097, super.aShort127 + super.anInt10089);
		@Pc(47) Class13_Sub6 local47 = Static491.method6848(1, this.aBoolean740);
		@Pc(52) int local52 = super.anInt10090 >> 9;
		@Pc(57) int local57 = super.anInt10089 >> 9;
		this.aClass228_4.method4870(local52, local14, local52, true, local57, local57, arg0, local21);
		if (Static449.aBoolean538) {
			local14.method6194(local21, local47.aClass13_Sub2Array1[0], Static638.anInt7982, 0);
		} else {
			local14.method6206(local21, local47.aClass13_Sub2Array1[0], 0);
		}
		if (this.aClass228_4.aClass13_Sub9_5 != null) {
			@Pc(99) Class98 local99 = this.aClass228_4.aClass13_Sub9_5.method5660();
			if (Static449.aBoolean538) {
				arg0.method6977(local99, Static638.anInt7982);
			} else {
				arg0.method6960(local99);
			}
		}
		this.aBoolean739 = local14.F() || this.aClass228_4.aClass13_Sub9_5 != null;
		if (this.aClass128_8 == null) {
			this.aClass128_8 = Static560.method7661(super.anInt10089, local14, super.anInt10097, super.anInt10090);
		} else {
			Static136.method8325(local14, super.anInt10089, super.anInt10097, super.anInt10090, this.aClass128_8);
		}
		return local47;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	@Override
	public void method8424() {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8426() {
		return this.aClass228_4.method4873();
	}

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "(I)I")
	@Override
	public int method8402(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			Static628.aClass288_353 = null;
		}
		return this.aClass228_4.method4863((byte) -67);
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8413() {
		return this.aBoolean739;
	}
}
