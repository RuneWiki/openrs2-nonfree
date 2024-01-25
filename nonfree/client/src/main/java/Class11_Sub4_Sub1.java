import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class11_Sub4_Sub1 extends Class11_Sub4 implements Interface17 {

	@OriginalMember(owner = "client!di", name = "F", descriptor = "Lclient!gr;")
	private Class122 aClass122_2;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "Lclient!pq;")
	public final Class253 aClass253_1;

	@OriginalMember(owner = "client!di", name = "r", descriptor = "Z")
	private final boolean aBoolean202;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!oa;Lclient!bfa;IIIIIZIII)V")
	public Class11_Sub4_Sub1(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static298.method4856(arg8, arg9));
		this.aClass253_1 = new Class253(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt5484, super.anInt5485, arg7, arg10);
		this.aBoolean202 = arg1.anInt1107 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method8118(@OriginalArg(0) Class9 arg0) {
		this.aClass253_1.method6283(arg0);
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8116() {
		return this.aClass253_1.method6282();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)I")
	@Override
	public int method8114() {
		return this.aClass253_1.anInt7551;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(B)I")
	@Override
	public int method8119() {
		return this.aClass253_1.anInt7539;
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
	@Override
	public void method8107() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class23 local16 = this.aClass253_1.method6291(super.anInt5485, false, arg1, 131072, super.anInt5484, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class8 local28 = arg1.method5417();
			local28.GA(super.anInt5484, super.anInt5483, super.anInt5485);
			return local16.method7073(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(B)I")
	@Override
	public int method8121() {
		return this.aClass253_1.anInt7544;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		@Pc(18) Class23 local18 = this.aClass253_1.method6291(super.anInt5485, false, arg0, 2048, super.anInt5484, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class8 local25 = arg0.method5417();
		local25.GA(super.anInt5484, super.anInt5483, super.anInt5485);
		@Pc(35) Class5_Sub5 local35 = null;
		if (this.aBoolean202) {
			local35 = Static342.method5386(1);
		}
		@Pc(47) int local47 = super.anInt5484 >> 9;
		@Pc(52) int local52 = super.anInt5485 >> 9;
		this.aClass253_1.method6284(local52, local47, local47, local25, local52, arg0, local18, true);
		if (this.aClass253_1.aClass5_Sub2_7 == null) {
			local18.method7077(local25, local35 == null ? null : local35.aClass5_Sub4Array1[0], 0);
		} else {
			@Pc(78) Class299 local78 = this.aClass253_1.aClass5_Sub2_7.method3789();
			arg0.method5457(local18, local78, local25, local35 == null ? null : local35.aClass5_Sub4Array1[0], 0);
		}
		if (this.aClass122_2 == null) {
			this.aClass122_2 = Static73.method1560(super.anInt5484, local18, super.anInt5485, super.anInt5483);
		} else {
			Static85.method1889(local18, super.anInt5484, this.aClass122_2, super.anInt5485, super.anInt5483);
		}
		return local35;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8120(@OriginalArg(0) Class9 arg0) {
		this.aClass253_1.method6290(arg0);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZIZIILclient!fl;Lclient!oa;)V")
	@Override
	public void method8103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class9 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		return this.aClass122_2;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	@Override
	public void method8115() {
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
		@Pc(20) Class23 local20 = this.aClass253_1.method6291(super.anInt5485, true, arg0, 262144, super.anInt5484, true);
		if (local20 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt5484 >> 9;
		@Pc(32) int local32 = super.anInt5485 >> 9;
		@Pc(35) Class8 local35 = arg0.method5417();
		local35.GA(super.anInt5484, super.anInt5483, super.anInt5485);
		this.aClass253_1.method6284(local32, local27, local27, local35, local32, arg0, local20, false);
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8105() {
		return false;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class23 method8117(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.aClass253_1.method6291(0, false, arg1, arg0, 0, false);
	}
}
