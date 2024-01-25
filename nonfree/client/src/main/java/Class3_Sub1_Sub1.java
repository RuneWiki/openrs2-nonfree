import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 implements Interface10 {

	@OriginalMember(owner = "client!al", name = "u", descriptor = "Lclient!ro;")
	public final Class215 aClass215_1;

	@OriginalMember(owner = "client!al", name = "G", descriptor = "Z")
	private final boolean aBoolean14;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!eq;Lclient!hn;IIIIIZIIIIII)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static82.method4327(arg11, arg12));
		this.aClass215_1 = new Class215(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean14 = arg1.anInt3163 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(Lclient!eq;Z)Lclient!gl;")
	@Override
	public Class57_Sub2 method5936(@OriginalArg(0) Class66 arg0) {
		@Pc(16) Class224 local16 = this.aClass215_1.method5197(super.anInt6384, super.anInt6392, arg0, false, 2048, true);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class5 local23 = arg0.method5064();
		local23.method3846(super.anInt6386 + super.anInt6392, super.anInt6397, super.anInt6384 + super.anInt6394);
		@Pc(39) Class57_Sub2 local39 = null;
		if (this.aBoolean14) {
			local39 = Static291.method4377(1);
		}
		if (this.aClass215_1.aClass57_Sub4_4 == null) {
			local16.method5798(local23, local39 == null ? null : local39.aClass57_Sub5Array1[0], 0);
		} else {
			@Pc(69) Class32 local69 = this.aClass215_1.aClass57_Sub4_4.method3250();
			arg0.method5021(local16, local69, local23, local39 == null ? null : local39.aClass57_Sub5Array1[0]);
		}
		@Pc(88) int local88 = super.anInt6392 >> 7;
		@Pc(93) int local93 = super.anInt6384 >> 7;
		this.aClass215_1.method5194(local16, local93, local88, true, local88, arg0, local93);
		return local39;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!eq;Z)V")
	@Override
	public void method5320(@OriginalArg(0) Class66 arg0) {
		this.aClass215_1.method5185(arg0);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!eq;I)V")
	@Override
	public void method5937(@OriginalArg(0) Class66 arg0) {
		@Pc(16) Class224 local16 = this.aClass215_1.method5197(super.anInt6384, super.anInt6392, arg0, false, 262144, true);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt6392 >> 7;
			@Pc(28) int local28 = super.anInt6384 >> 7;
			this.aClass215_1.method5194(local16, local28, local23, false, local23, arg0, local28);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!eq;BI)Z")
	@Override
	public boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class224 local16 = this.aClass215_1.method5197(super.anInt6384, super.anInt6392, arg1, false, 131072, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(31) Class5 local31 = arg1.method5064();
			local31.method3846(super.anInt6386 + super.anInt6392, super.anInt6397, super.anInt6384 + super.anInt6394);
			return local16.method5836(arg0, arg2, local31, false);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BLclient!eq;)V")
	@Override
	public void method5322(@OriginalArg(1) Class66 arg0) {
		this.aClass215_1.method5188(arg0);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5326() {
		return this.aClass215_1.method5195();
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)I")
	@Override
	public int method5327() {
		return this.aClass215_1.anInt6227;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
	@Override
	public void method5324() {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!eq;Z)Lclient!va;")
	@Override
	public Class224 method5323(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		return this.aClass215_1.method5197(0, 0, arg1, false, arg0, false);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I")
	@Override
	public int method5321() {
		return this.aClass215_1.anInt6249;
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(B)I")
	@Override
	public int method5319() {
		return this.aClass215_1.method5193();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)I")
	@Override
	public int method5325() {
		return this.aClass215_1.anInt6229;
	}
}
