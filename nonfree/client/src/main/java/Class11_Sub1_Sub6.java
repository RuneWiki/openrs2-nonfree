import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class11_Sub1_Sub6 extends Class11_Sub1 implements Interface17 {

	@OriginalMember(owner = "client!op", name = "A", descriptor = "Lclient!gr;")
	private Class122 aClass122_7;

	@OriginalMember(owner = "client!op", name = "R", descriptor = "Lclient!pq;")
	public final Class253 aClass253_3;

	@OriginalMember(owner = "client!op", name = "M", descriptor = "Z")
	private final boolean aBoolean527;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!oa;Lclient!bfa;IIIIIZIIIIIII)V")
	public Class11_Sub1_Sub6(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1103 == 1, Static529.method7712(arg12, arg13));
		this.aClass253_3 = new Class253(arg0, arg1, arg12, arg13, super.aByte77, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean527 = arg1.anInt1107 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		@Pc(18) Class23 local18 = this.aClass253_3.method6291(super.anInt7351, false, arg0, 2048, super.anInt7347, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class8 local25 = arg0.method5417();
		local25.GA(super.anInt7347, super.anInt7350, super.anInt7351);
		@Pc(39) Class5_Sub5 local39 = null;
		if (this.aBoolean527) {
			local39 = Static342.method5386(1);
		}
		this.aClass253_3.method6284(super.aShort77, super.aShort79, super.aShort78, local25, super.aShort80, arg0, local18, true);
		if (this.aClass253_3.aClass5_Sub2_7 == null) {
			local18.method7077(local25, local39 == null ? null : local39.aClass5_Sub4Array1[0], 0);
		} else {
			@Pc(71) Class299 local71 = this.aClass253_3.aClass5_Sub2_7.method3789();
			arg0.method5457(local18, local71, local25, local39 == null ? null : local39.aClass5_Sub4Array1[0], 0);
		}
		if (this.aClass122_7 == null) {
			this.aClass122_7 = Static73.method1560(super.anInt7347, local18, super.anInt7351, super.anInt7350);
		} else {
			Static85.method1889(local18, super.anInt7347, this.aClass122_7, super.anInt7351, super.anInt7350);
		}
		return local39;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method8118(@OriginalArg(0) Class9 arg0) {
		this.aClass253_3.method6283(arg0);
	}

	@OriginalMember(owner = "client!op", name = "e", descriptor = "(I)I")
	@Override
	public int method6199() {
		return this.aClass253_3.method6287();
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(B)I")
	@Override
	public int method8121() {
		return this.aClass253_3.anInt7544;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class23 local21 = this.aClass253_3.method6291(super.anInt7351, false, arg1, 131072, super.anInt7347, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class8 local28 = arg1.method5417();
			local28.GA(super.anInt7347, super.anInt7350, super.anInt7351);
			return local21.method7073(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8120(@OriginalArg(0) Class9 arg0) {
		this.aClass253_3.method6290(arg0);
	}

	@OriginalMember(owner = "client!op", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8105() {
		return false;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)I")
	@Override
	public int method8114() {
		return this.aClass253_3.anInt7551;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZIZIILclient!fl;Lclient!oa;)V")
	@Override
	public void method8103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class9 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
		@Pc(16) Class23 local16 = this.aClass253_3.method6291(super.anInt7351, true, arg0, 262144, super.anInt7347, true);
		if (local16 != null) {
			@Pc(25) Class8 local25 = arg0.method5417();
			local25.GA(super.anInt7347, super.anInt7350, super.anInt7351);
			this.aClass253_3.method6284(super.aShort77, super.aShort79, super.aShort78, local25, super.aShort80, arg0, local16, false);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	@Override
	public void method8115() {
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class23 method8117(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.aClass253_3.method6291(0, false, arg1, arg0, 0, false);
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8116() {
		return this.aClass253_3.method6282();
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(B)I")
	@Override
	public int method8119() {
		return this.aClass253_3.anInt7539;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		return this.aClass122_7;
	}

	@OriginalMember(owner = "client!op", name = "d", descriptor = "(I)V")
	@Override
	public void method8107() {
		throw new IllegalStateException();
	}
}
