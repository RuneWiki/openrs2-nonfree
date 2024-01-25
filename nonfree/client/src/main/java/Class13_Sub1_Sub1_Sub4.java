import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class13_Sub1_Sub1_Sub4 extends Class13_Sub1_Sub1 implements Interface25 {

	@OriginalMember(owner = "client!sr", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!sr", name = "X", descriptor = "Lclient!gp;")
	private Class128 aClass128_5;

	@OriginalMember(owner = "client!sr", name = "Z", descriptor = "Z")
	private boolean aBoolean657 = false;

	@OriginalMember(owner = "client!sr", name = "db", descriptor = "Lclient!mt;")
	public final Class228 aClass228_3;

	@OriginalMember(owner = "client!sr", name = "kb", descriptor = "Z")
	private boolean aBoolean658;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!ha;Lclient!kha;IIIIIZIIIIIII)V")
	public Class13_Sub1_Sub1_Sub4(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4810 == 1, Static377.method5063(arg12, arg13));
		this.aClass228_3 = new Class228(arg0, arg1, arg12, arg13, super.aByte127, arg3, this, arg7, arg14);
		this.aBoolean658 = arg1.anInt4828 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8408() {
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(Lclient!ha;I)Lclient!jl;")
	@Override
	public Class13_Sub6 method8399(@OriginalArg(0) Class95 arg0) {
		@Pc(14) Class182 local14 = this.aClass228_3.method4865(2048, true, false, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class177 local21 = arg0.method6967();
		local21.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
		@Pc(37) Class13_Sub6 local37 = Static491.method6848(1, this.aBoolean658);
		this.aClass228_3.method4870(super.aShort120, local14, super.aShort117, true, super.aShort119, super.aShort118, arg0, local21);
		if (Static449.aBoolean538) {
			local14.method6194(local21, local37.aClass13_Sub2Array1[0], Static638.anInt7982, 0);
		} else {
			local14.method6206(local21, local37.aClass13_Sub2Array1[0], 0);
		}
		if (this.aClass228_3.aClass13_Sub9_5 != null) {
			@Pc(91) Class98 local91 = this.aClass228_3.aClass13_Sub9_5.method5660();
			if (Static449.aBoolean538) {
				arg0.method6977(local91, Static638.anInt7982);
			} else {
				arg0.method6960(local91);
			}
		}
		this.aBoolean657 = local14.F() || this.aClass228_3.aClass13_Sub9_5 != null;
		if (this.aClass128_5 == null) {
			this.aClass128_5 = Static560.method7661(super.anInt10089, local14, super.anInt10097, super.anInt10090);
		} else {
			Static136.method8325(local14, super.anInt10089, super.anInt10097, super.anInt10090, this.aClass128_5);
		}
		return local37;
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aClass228_3.anInt5692;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(ILclient!ha;)Lclient!gp;")
	@Override
	public Class128 method8412(@OriginalArg(1) Class95 arg0) {
		return this.aClass128_5;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8422(@OriginalArg(1) Class95 arg0) {
		this.aClass228_3.method4869(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8400(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(19) Class182 local19 = this.aClass228_3.method4865(131072, false, false, arg0);
		if (local19 == null) {
			return false;
		} else {
			@Pc(26) Class177 local26 = arg0.method6967();
			local26.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
			return Static449.aBoolean538 ? local19.method6203(arg1, arg2, local26, false, 0, Static638.anInt7982) : local19.method6205(arg1, arg2, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8426() {
		return this.aClass228_3.method4873();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
	@Override
	public void method8424() {
	}

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)I")
	@Override
	public int method8397() {
		return this.aClass228_3.method4874();
	}

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "(B)V")
	@Override
	public void method8414() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8413() {
		return this.aBoolean657;
	}

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "(I)I")
	@Override
	public int method8402(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.aBoolean658 = false;
		}
		return this.aClass228_3.method4863((byte) -67);
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)I")
	@Override
	public int method8421() {
		return this.aClass228_3.anInt5690;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBZILclient!ha;ILclient!ig;)V")
	@Override
	public void method8410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub1 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class95 arg0) {
		this.aClass228_3.method4872(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)I")
	@Override
	public int method8420() {
		return this.aClass228_3.anInt5703;
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8415(@OriginalArg(1) Class95 arg0) {
		@Pc(20) Class182 local20 = this.aClass228_3.method4865(262144, true, true, arg0);
		if (local20 != null) {
			@Pc(25) Class177 local25 = arg0.method6967();
			local25.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
			this.aClass228_3.method4870(super.aShort120, local20, super.aShort117, false, super.aShort119, super.aShort118, arg0, local25);
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8404() {
		return false;
	}
}
