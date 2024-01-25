import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class11_Sub5_Sub4 extends Class11_Sub5 implements Interface12 {

	@OriginalMember(owner = "client!te", name = "T", descriptor = "Lclient!em;")
	private Class64 aClass64_6;

	@OriginalMember(owner = "client!te", name = "R", descriptor = "Lclient!mu;")
	public final Class165 aClass165_3;

	@OriginalMember(owner = "client!te", name = "z", descriptor = "Z")
	private final boolean aBoolean495;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!qa;Lclient!ku;IIIIIZIIIIIII)V")
	public Class11_Sub5_Sub4(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4355 == 1, Static398.method5615(arg12, arg13));
		this.aClass165_3 = new Class165(arg0, arg1, arg12, arg13, super.aByte100, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean495 = arg1.anInt4358 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	@Override
	public Class64 method6305(@OriginalArg(0) Class30 arg0) {
		return this.aClass64_6;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method6321(@OriginalArg(1) Class30 arg0) {
		this.aClass165_3.method4175(arg0);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)I")
	@Override
	public int method6044() {
		return this.aClass165_3.method4172();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)I")
	@Override
	public int method6316() {
		return this.aClass165_3.anInt4936;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6301() {
		return false;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	@Override
	public void method6317() {
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6303(@OriginalArg(0) Class30 arg0) {
		@Pc(16) Class57 local16 = this.aClass165_3.method4174(262144, true, arg0, super.anInt7515, true, super.anInt7514);
		if (local16 != null) {
			this.aClass165_3.method4178(local16, super.aShort95, false, super.aShort92, super.aShort94, super.aShort93, arg0);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I")
	@Override
	public int method6318() {
		return this.aClass165_3.anInt4920;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)I")
	@Override
	public int method6320() {
		return this.aClass165_3.anInt4935;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILclient!qa;ZLclient!ee;Z)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6319() {
		return this.aClass165_3.method4179();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
	@Override
	public void method6307() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(16) Class57 local16 = this.aClass165_3.method4174(131072, false, arg2, super.anInt7515, false, super.anInt7514);
		if (local16 == null) {
			return false;
		} else {
			@Pc(29) Class72 local29 = arg2.method2092();
			local29.C(super.anInt7514, super.anInt7511, super.anInt7515);
			return local16.method6070(arg1, arg0, local29, false);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6314(@OriginalArg(0) Class30 arg0) {
		this.aClass165_3.method4177(arg0);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	@Override
	public Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0) {
		@Pc(18) Class57 local18 = this.aClass165_3.method4174(2048, true, arg0, super.anInt7515, false, super.anInt7514);
		if (local18 == null) {
			return null;
		}
		@Pc(30) Class72 local30 = arg0.method2092();
		local30.C(super.anInt7514, super.anInt7511, super.anInt7515);
		@Pc(40) Class71_Sub3 local40 = null;
		if (this.aBoolean495) {
			local40 = Static127.method2399(1);
		}
		if (this.aClass165_3.aClass71_Sub6_4 == null) {
			local18.method6073(local30, local40 == null ? null : local40.aClass71_Sub7Array1[0], 0);
		} else {
			@Pc(56) Class270 local56 = this.aClass165_3.aClass71_Sub6_4.method5794();
			arg0.method2041(local18, local56, local30, local40 == null ? null : local40.aClass71_Sub7Array1[0]);
		}
		if (this.aClass64_6 == null) {
			this.aClass64_6 = Static456.method6200(super.anInt7511, local18, super.anInt7515, super.anInt7514);
		} else {
			Static288.method4461(super.anInt7514, super.anInt7511, local18, this.aClass64_6, super.anInt7515);
		}
		this.aClass165_3.method4178(local18, super.aShort95, true, super.aShort92, super.aShort94, super.aShort93, arg0);
		return local40;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class57 method6315(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int arg1) {
		return this.aClass165_3.method4174(arg1, false, arg0, 0, false, 0);
	}
}
