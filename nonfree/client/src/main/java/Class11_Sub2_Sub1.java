import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class11_Sub2_Sub1 extends Class11_Sub2 implements Interface12 {

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "Lclient!em;")
	private Class64 aClass64_4;

	@OriginalMember(owner = "client!mw", name = "H", descriptor = "Lclient!mu;")
	public final Class165 aClass165_1;

	@OriginalMember(owner = "client!mw", name = "z", descriptor = "Z")
	private final boolean aBoolean343;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!qa;Lclient!ku;IIIIIZIII)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static48.method1077(arg9, arg8));
		this.aClass165_1 = new Class165(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt7825, super.anInt7829, arg7, arg10);
		this.aBoolean343 = arg1.anInt4358 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIILclient!qa;ZLclient!ee;Z)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V")
	@Override
	public void method6317() {
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(B)I")
	@Override
	public int method6320() {
		return this.aClass165_1.anInt4935;
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6319() {
		return this.aClass165_1.method4179();
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class57 method6315(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int arg1) {
		return this.aClass165_1.method4174(arg1, false, arg0, 0, false, 0);
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	@Override
	public Class64 method6305(@OriginalArg(0) Class30 arg0) {
		return this.aClass64_4;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)I")
	@Override
	public int method6318() {
		return this.aClass165_1.anInt4920;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(21) Class57 local21 = this.aClass165_1.method4174(131072, false, arg2, super.anInt7829, false, super.anInt7825);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class72 local28 = arg2.method2092();
			local28.C(super.anInt7825, super.anInt7824, super.anInt7829);
			return local21.method6070(arg1, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6314(@OriginalArg(0) Class30 arg0) {
		this.aClass165_1.method4177(arg0);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method6321(@OriginalArg(1) Class30 arg0) {
		this.aClass165_1.method4175(arg0);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	@Override
	public Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0) {
		@Pc(22) Class57 local22 = this.aClass165_1.method4174(2048, true, arg0, super.anInt7829, false, super.anInt7825);
		if (local22 == null) {
			return null;
		}
		@Pc(29) Class72 local29 = arg0.method2092();
		local29.C(super.anInt7825, super.anInt7824, super.anInt7829);
		@Pc(39) Class71_Sub3 local39 = null;
		if (this.aBoolean343) {
			local39 = Static127.method2399(1);
		}
		if (this.aClass165_1.aClass71_Sub6_4 == null) {
			local22.method6073(local29, local39 == null ? null : local39.aClass71_Sub7Array1[0], 0);
		} else {
			@Pc(69) Class270 local69 = this.aClass165_1.aClass71_Sub6_4.method5794();
			arg0.method2041(local22, local69, local29, local39 == null ? null : local39.aClass71_Sub7Array1[0]);
		}
		if (this.aClass64_4 == null) {
			this.aClass64_4 = Static456.method6200(super.anInt7824, local22, super.anInt7829, super.anInt7825);
		} else {
			Static288.method4461(super.anInt7825, super.anInt7824, local22, this.aClass64_4, super.anInt7829);
		}
		@Pc(115) int local115 = super.anInt7825 >> 7;
		@Pc(120) int local120 = super.anInt7829 >> 7;
		this.aClass165_1.method4178(local22, local115, true, local120, local115, local120, arg0);
		return local39;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6303(@OriginalArg(0) Class30 arg0) {
		@Pc(20) Class57 local20 = this.aClass165_1.method4174(262144, true, arg0, super.anInt7829, true, super.anInt7825);
		if (local20 != null) {
			@Pc(27) int local27 = super.anInt7825 >> 7;
			@Pc(32) int local32 = super.anInt7829 >> 7;
			this.aClass165_1.method4178(local20, local27, false, local32, local27, local32, arg0);
		}
	}

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6301() {
		return false;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Z)V")
	@Override
	public void method6307() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)I")
	@Override
	public int method6316() {
		return this.aClass165_1.anInt4936;
	}
}
