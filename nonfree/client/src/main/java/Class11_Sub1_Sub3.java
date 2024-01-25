import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class11_Sub1_Sub3 extends Class11_Sub1 implements Interface12 {

	@OriginalMember(owner = "client!wu", name = "J", descriptor = "Lclient!em;")
	private Class64 aClass64_8;

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "Lclient!mu;")
	public final Class165 aClass165_4;

	@OriginalMember(owner = "client!wu", name = "D", descriptor = "Z")
	private final boolean aBoolean586;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!qa;Lclient!ku;IIIIIZII)V")
	public Class11_Sub1_Sub3(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt4402, arg1.aBoolean285, arg1.aBoolean289);
		this.aClass165_4 = new Class165(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean586 = arg1.anInt4358 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)I")
	@Override
	public int method6318() {
		return this.aClass165_4.anInt4920;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)I")
	@Override
	public int method6316() {
		return this.aClass165_4.anInt4936;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6314(@OriginalArg(0) Class30 arg0) {
		this.aClass165_4.method4177(arg0);
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
	@Override
	public void method6317() {
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILclient!qa;ZLclient!ee;Z)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6303(@OriginalArg(0) Class30 arg0) {
		@Pc(22) Class57 local22 = this.aClass165_4.method4174(262144, true, arg0, super.anInt7968, true, super.anInt7969);
		if (local22 != null) {
			@Pc(29) int local29 = super.anInt7969 >> 7;
			@Pc(34) int local34 = super.anInt7968 >> 7;
			this.aClass165_4.method4178(local22, local29, false, local34, local29, local34, arg0);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)V")
	@Override
	public void method6307() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method6321(@OriginalArg(1) Class30 arg0) {
		this.aClass165_4.method4175(arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class57 method6315(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int arg1) {
		return this.aClass165_4.method4174(arg1, false, arg0, 0, false, 0);
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6319() {
		return this.aClass165_4.method4179();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	@Override
	public Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0) {
		@Pc(18) Class57 local18 = this.aClass165_4.method4174(2048, true, arg0, super.anInt7968, false, super.anInt7969);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class72 local25 = arg0.method2092();
		local25.C(super.anInt7969, super.anInt7971, super.anInt7968);
		@Pc(35) Class71_Sub3 local35 = null;
		if (this.aBoolean586) {
			local35 = Static127.method2399(1);
		}
		if (this.aClass165_4.aClass71_Sub6_4 == null) {
			local18.method6073(local25, local35 == null ? null : local35.aClass71_Sub7Array1[0], 0);
		} else {
			@Pc(65) Class270 local65 = this.aClass165_4.aClass71_Sub6_4.method5794();
			arg0.method2041(local18, local65, local25, local35 == null ? null : local35.aClass71_Sub7Array1[0]);
		}
		if (this.aClass64_8 == null) {
			this.aClass64_8 = Static456.method6200(super.anInt7971, local18, super.anInt7968, super.anInt7969);
		} else {
			Static288.method4461(super.anInt7969, super.anInt7971, local18, this.aClass64_8, super.anInt7968);
		}
		@Pc(113) int local113 = super.anInt7969 >> 7;
		@Pc(118) int local118 = super.anInt7968 >> 7;
		this.aClass165_4.method4178(local18, local113, true, local118, local113, local118, arg0);
		return local35;
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6301() {
		return false;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)I")
	@Override
	public int method6320() {
		return this.aClass165_4.anInt4935;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	@Override
	public Class64 method6305(@OriginalArg(0) Class30 arg0) {
		return this.aClass64_8;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(21) Class57 local21 = this.aClass165_4.method4174(131072, false, arg2, super.anInt7968, false, super.anInt7969);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class72 local28 = arg2.method2092();
			local28.C(super.anInt7969, super.anInt7971, super.anInt7968);
			return local21.method6070(arg1, arg0, local28, false);
		}
	}
}
