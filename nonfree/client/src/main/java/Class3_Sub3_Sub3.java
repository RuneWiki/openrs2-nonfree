import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class3_Sub3_Sub3 extends Class3_Sub3 implements Interface10 {

	@OriginalMember(owner = "client!rg", name = "B", descriptor = "Lclient!ro;")
	public final Class215 aClass215_4;

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "Z")
	private final boolean aBoolean366;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!eq;Lclient!hn;IIIIIZIII)V")
	public Class3_Sub3_Sub3(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static227.method3404(arg8, arg9));
		this.aClass215_4 = new Class215(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt5872, super.anInt5871, arg7, arg10);
		this.aBoolean366 = arg1.anInt3163 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!eq;Z)Lclient!va;")
	@Override
	public Class224 method5323(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		return this.aClass215_4.method5197(0, 0, arg1, false, arg0, false);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!eq;BI)Z")
	@Override
	public boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) Class224 local24 = this.aClass215_4.method5197(super.anInt5871, super.anInt5872, arg1, false, 131072, false);
		if (local24 == null) {
			return false;
		} else {
			@Pc(31) Class5 local31 = arg1.method5064();
			local31.method3846(super.anInt5872, super.anInt5873, super.anInt5871);
			return local24.method5836(arg0, arg2, local31, false);
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Lclient!eq;Z)Lclient!gl;")
	@Override
	public Class57_Sub2 method5936(@OriginalArg(0) Class66 arg0) {
		@Pc(16) Class224 local16 = this.aClass215_4.method5197(super.anInt5871, super.anInt5872, arg0, false, 2048, true);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class5 local23 = arg0.method5064();
		local23.method3846(super.anInt5872, super.anInt5873, super.anInt5871);
		@Pc(33) Class57_Sub2 local33 = null;
		if (this.aBoolean366) {
			local33 = Static291.method4377(1);
		}
		if (this.aClass215_4.aClass57_Sub4_4 == null) {
			local16.method5798(local23, local33 == null ? null : local33.aClass57_Sub5Array1[0], 0);
		} else {
			@Pc(49) Class32 local49 = this.aClass215_4.aClass57_Sub4_4.method3250();
			arg0.method5021(local16, local49, local23, local33 == null ? null : local33.aClass57_Sub5Array1[0]);
		}
		@Pc(82) int local82 = super.anInt5872 >> 7;
		@Pc(87) int local87 = super.anInt5871 >> 7;
		this.aClass215_4.method5194(local16, local87, local82, true, local82, arg0, local87);
		return local33;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5326() {
		return this.aClass215_4.method5195();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!eq;I)V")
	@Override
	public void method5937(@OriginalArg(0) Class66 arg0) {
		@Pc(16) Class224 local16 = this.aClass215_4.method5197(super.anInt5871, super.anInt5872, arg0, true, 262144, true);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt5872 >> 7;
			@Pc(28) int local28 = super.anInt5871 >> 7;
			this.aClass215_4.method5194(local16, local28, local23, false, local23, arg0, local28);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIILclient!bp;IZLclient!eq;)V")
	@Override
	public void method5941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class66 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)I")
	@Override
	public int method5325() {
		return this.aClass215_4.anInt6229;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
	@Override
	public int method5321() {
		return this.aClass215_4.anInt6249;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!eq;Z)V")
	@Override
	public void method5320(@OriginalArg(0) Class66 arg0) {
		this.aClass215_4.method5185(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
	@Override
	public void method5938() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLclient!eq;)V")
	@Override
	public void method5322(@OriginalArg(1) Class66 arg0) {
		this.aClass215_4.method5188(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)I")
	@Override
	public int method5327() {
		return this.aClass215_4.anInt6227;
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5942() {
		return false;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	@Override
	public void method5324() {
	}
}
