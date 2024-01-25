import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class11_Sub3_Sub2 extends Class11_Sub3 implements Interface17 {

	@OriginalMember(owner = "client!og", name = "P", descriptor = "Lclient!gr;")
	private Class122 aClass122_6;

	@OriginalMember(owner = "client!og", name = "J", descriptor = "Lclient!pq;")
	public final Class253 aClass253_2;

	@OriginalMember(owner = "client!og", name = "M", descriptor = "Z")
	private final boolean aBoolean522;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!oa;Lclient!bfa;IIIIIZIIIIII)V")
	public Class11_Sub3_Sub2(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static186.method3603(arg11, arg12));
		this.aClass253_2 = new Class253(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean522 = arg1.anInt1107 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)I")
	@Override
	public int method7208() {
		return this.aClass253_2.method6287();
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8116() {
		return this.aClass253_2.method6282();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)I")
	@Override
	public int method8114() {
		return this.aClass253_2.anInt7551;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
		@Pc(22) Class23 local22 = this.aClass253_2.method6291(super.anInt8617, false, arg0, 262144, super.anInt8625, true);
		if (local22 == null) {
			return;
		}
		@Pc(29) int local29 = super.anInt8625 >> 9;
		@Pc(34) int local34 = super.anInt8617 >> 9;
		@Pc(37) Class8 local37 = arg0.method5417();
		local37.GA(super.anInt8625, super.anInt8619, super.anInt8617);
		this.aClass253_2.method6284(local34, local29, local29, local37, local34, arg0, local22, false);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class23 local16 = this.aClass253_2.method6291(super.anInt8617, false, arg1, 131072, super.anInt8625, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class8 local28 = arg1.method5417();
			local28.GA(super.anInt8625 + super.anInt8628, super.anInt8619, super.anInt8617 + super.anInt8627);
			return local16.method7073(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		return this.aClass122_6;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method8118(@OriginalArg(0) Class9 arg0) {
		this.aClass253_2.method6283(arg0);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class23 method8117(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.aClass253_2.method6291(0, false, arg1, arg0, 0, false);
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(B)I")
	@Override
	public int method8121() {
		return this.aClass253_2.anInt7544;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)I")
	@Override
	public int method8119() {
		return this.aClass253_2.anInt7539;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8120(@OriginalArg(0) Class9 arg0) {
		this.aClass253_2.method6290(arg0);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		@Pc(18) Class23 local18 = this.aClass253_2.method6291(super.anInt8617, false, arg0, 2048, super.anInt8625, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class8 local25 = arg0.method5417();
		local25.GA(super.anInt8625 + super.anInt8628, super.anInt8619, super.anInt8617 + super.anInt8627);
		@Pc(42) Class5_Sub5 local42 = null;
		if (this.aBoolean522) {
			local42 = Static342.method5386(1);
		}
		@Pc(58) int local58 = super.anInt8625 >> 9;
		@Pc(63) int local63 = super.anInt8617 >> 9;
		this.aClass253_2.method6284(local63, local58, local58, local25, local63, arg0, local18, true);
		if (this.aClass253_2.aClass5_Sub2_7 == null) {
			local18.method7077(local25, local42 == null ? null : local42.aClass5_Sub4Array1[0], 0);
		} else {
			@Pc(84) Class299 local84 = this.aClass253_2.aClass5_Sub2_7.method3789();
			arg0.method5457(local18, local84, local25, local42 == null ? null : local42.aClass5_Sub4Array1[0], 0);
		}
		if (this.aClass122_6 == null) {
			this.aClass122_6 = Static73.method1560(super.anInt8625, local18, super.anInt8617, super.anInt8619);
		} else {
			Static85.method1889(local18, super.anInt8625, this.aClass122_6, super.anInt8617, super.anInt8619);
		}
		return local42;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	@Override
	public void method8115() {
	}
}
