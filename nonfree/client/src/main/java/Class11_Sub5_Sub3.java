import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class11_Sub5_Sub3 extends Class11_Sub5 implements Interface17 {

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "Lclient!gr;")
	private Class122 aClass122_8;

	@OriginalMember(owner = "client!wp", name = "z", descriptor = "Lclient!pq;")
	public final Class253 aClass253_4;

	@OriginalMember(owner = "client!wp", name = "x", descriptor = "Z")
	private final boolean aBoolean718;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!oa;Lclient!bfa;IIIIIZII)V")
	public Class11_Sub5_Sub3(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt1110, arg1.aBoolean96, arg1.aBoolean86);
		this.aClass253_4 = new Class253(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean718 = arg1.anInt1107 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(B)I")
	@Override
	public int method8121() {
		return this.aClass253_4.anInt7544;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		@Pc(23) Class23 local23 = this.aClass253_4.method6291(super.anInt9740, false, arg1, 131072, super.anInt9744, false);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class8 local30 = arg1.method5417();
			local30.GA(super.anInt9744, super.anInt9742, super.anInt9740);
			return local23.method7073(arg2, arg0, local30, false);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		return this.aClass122_8;
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8105() {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	@Override
	public void method8115() {
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		@Pc(18) Class23 local18 = this.aClass253_4.method6291(super.anInt9740, false, arg0, 2048, super.anInt9744, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class8 local25 = arg0.method5417();
		local25.GA(super.anInt9744, super.anInt9742, super.anInt9740);
		@Pc(35) Class5_Sub5 local35 = null;
		if (this.aBoolean718) {
			local35 = Static342.method5386(1);
		}
		@Pc(47) int local47 = super.anInt9744 >> 9;
		@Pc(52) int local52 = super.anInt9740 >> 9;
		this.aClass253_4.method6284(local52, local47, local47, local25, local52, arg0, local18, true);
		if (this.aClass253_4.aClass5_Sub2_7 == null) {
			local18.method7077(local25, local35 == null ? null : local35.aClass5_Sub4Array1[0], 0);
		} else {
			@Pc(89) Class299 local89 = this.aClass253_4.aClass5_Sub2_7.method3789();
			arg0.method5457(local18, local89, local25, local35 == null ? null : local35.aClass5_Sub4Array1[0], 0);
		}
		if (this.aClass122_8 == null) {
			this.aClass122_8 = Static73.method1560(super.anInt9744, local18, super.anInt9740, super.anInt9742);
		} else {
			Static85.method1889(local18, super.anInt9744, this.aClass122_8, super.anInt9740, super.anInt9742);
		}
		return local35;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8116() {
		return this.aClass253_4.method6282();
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)I")
	@Override
	public int method8119() {
		return this.aClass253_4.anInt7539;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZIZIILclient!fl;Lclient!oa;)V")
	@Override
	public void method8103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class9 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8120(@OriginalArg(0) Class9 arg0) {
		this.aClass253_4.method6290(arg0);
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
		@Pc(22) Class23 local22 = this.aClass253_4.method6291(super.anInt9740, true, arg0, 262144, super.anInt9744, true);
		if (local22 == null) {
			return;
		}
		@Pc(29) int local29 = super.anInt9744 >> 9;
		@Pc(34) int local34 = super.anInt9740 >> 9;
		@Pc(37) Class8 local37 = arg0.method5417();
		local37.GA(super.anInt9744, super.anInt9742, super.anInt9740);
		this.aClass253_4.method6284(local34, local29, local29, local37, local34, arg0, local22, false);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class23 method8117(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.aClass253_4.method6291(0, false, arg1, arg0, 0, false);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method8118(@OriginalArg(0) Class9 arg0) {
		this.aClass253_4.method6283(arg0);
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)V")
	@Override
	public void method8107() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)I")
	@Override
	public int method8114() {
		return this.aClass253_4.anInt7551;
	}
}
