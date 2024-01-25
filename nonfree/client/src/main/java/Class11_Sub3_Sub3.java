import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class11_Sub3_Sub3 extends Class11_Sub3 implements Interface12 {

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "Lclient!em;")
	private Class64 aClass64_5;

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "Lclient!mu;")
	public final Class165 aClass165_2;

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "Z")
	private final boolean aBoolean489;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!qa;Lclient!ku;IIIIIZIIIIII)V")
	public Class11_Sub3_Sub3(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static77.method1651(arg12, arg11));
		this.aClass165_2 = new Class165(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean489 = arg1.anInt4358 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)I")
	@Override
	public int method6316() {
		return this.aClass165_2.anInt4936;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	@Override
	public Class64 method6305(@OriginalArg(0) Class30 arg0) {
		return this.aClass64_5;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(16) Class57 local16 = this.aClass165_2.method4174(131072, false, arg2, super.anInt6733, false, super.anInt6734);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class72 local23 = arg2.method2092();
			local23.C(super.anInt6734 + super.anInt6738, super.anInt6729, super.anInt6733 + super.anInt6739);
			return local16.method6070(arg1, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)I")
	@Override
	public int method6318() {
		return this.aClass165_2.anInt4920;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method6321(@OriginalArg(1) Class30 arg0) {
		this.aClass165_2.method4175(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	@Override
	public Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0) {
		@Pc(18) Class57 local18 = this.aClass165_2.method4174(2048, true, arg0, super.anInt6733, false, super.anInt6734);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class72 local25 = arg0.method2092();
		local25.C(super.anInt6734 + super.anInt6738, super.anInt6729, super.anInt6739 + super.anInt6733);
		@Pc(42) Class71_Sub3 local42 = null;
		if (this.aBoolean489) {
			local42 = Static127.method2399(1);
		}
		if (this.aClass165_2.aClass71_Sub6_4 == null) {
			local18.method6073(local25, local42 == null ? null : local42.aClass71_Sub7Array1[0], 0);
		} else {
			@Pc(80) Class270 local80 = this.aClass165_2.aClass71_Sub6_4.method5794();
			arg0.method2041(local18, local80, local25, local42 == null ? null : local42.aClass71_Sub7Array1[0]);
		}
		if (this.aClass64_5 == null) {
			this.aClass64_5 = Static456.method6200(super.anInt6729, local18, super.anInt6733, super.anInt6734);
		} else {
			Static288.method4461(super.anInt6734, super.anInt6729, local18, this.aClass64_5, super.anInt6733);
		}
		@Pc(126) int local126 = super.anInt6734 >> 7;
		@Pc(131) int local131 = super.anInt6733 >> 7;
		this.aClass165_2.method4178(local18, local126, true, local131, local126, local131, arg0);
		return local42;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class57 method6315(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int arg1) {
		return this.aClass165_2.method4174(arg1, false, arg0, 0, false, 0);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)I")
	@Override
	public int method6320() {
		return this.aClass165_2.anInt4935;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	@Override
	public void method6317() {
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6314(@OriginalArg(0) Class30 arg0) {
		this.aClass165_2.method4177(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6319() {
		return this.aClass165_2.method4179();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6303(@OriginalArg(0) Class30 arg0) {
		@Pc(16) Class57 local16 = this.aClass165_2.method4174(262144, true, arg0, super.anInt6733, false, super.anInt6734);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt6734 >> 7;
			@Pc(28) int local28 = super.anInt6733 >> 7;
			this.aClass165_2.method4178(local16, local23, false, local28, local23, local28, arg0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)I")
	@Override
	public int method5439() {
		return this.aClass165_2.method4172();
	}
}
