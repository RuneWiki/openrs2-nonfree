import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vka")
public final class Class9_Sub1_Sub1_Sub5 extends Class9_Sub1_Sub1 implements Interface9 {

	@OriginalMember(owner = "client!vka", name = "lb", descriptor = "Lclient!tc;")
	private Class354 lb;

	@OriginalMember(owner = "client!vka", name = "cb", descriptor = "Z")
	private boolean aBoolean727 = true;

	@OriginalMember(owner = "client!vka", name = "mb", descriptor = "Lclient!gg;")
	public final Class136 aClass136_4;

	@OriginalMember(owner = "client!vka", name = "fb", descriptor = "Z")
	private final boolean aBoolean726;

	@OriginalMember(owner = "client!vka", name = "<init>", descriptor = "(Lclient!ha;Lclient!mf;IIIIIZIIIIIII)V")
	public Class9_Sub1_Sub1_Sub5(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt6259 == 1, Static125.method2296(arg12, arg13));
		this.aClass136_4 = new Class136(arg0, arg1, arg12, arg13, super.aByte139, arg3, this, arg7, arg14);
		this.aBoolean726 = arg1.anInt6278 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!vka", name = "c", descriptor = "(I)I")
	@Override
	public int method9102() {
		return this.aClass136_4.anInt3394;
	}

	@OriginalMember(owner = "client!vka", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method9084() {
		return this.aBoolean727;
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9104() {
		return this.aClass136_4.method3096();
	}

	@OriginalMember(owner = "client!vka", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method9077() {
		return false;
	}

	@OriginalMember(owner = "client!vka", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9093() {
		return false;
	}

	@OriginalMember(owner = "client!vka", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9108(@OriginalArg(1) Class22 arg0) {
		this.aClass136_4.method3109(arg0);
	}

	@OriginalMember(owner = "client!vka", name = "c", descriptor = "(Z)I")
	@Override
	public int method9081() {
		return this.aClass136_4.method3097();
	}

	@OriginalMember(owner = "client!vka", name = "b", descriptor = "(ILclient!ha;)Lclient!tc;")
	@Override
	public Class354 method9080(@OriginalArg(1) Class22 arg0) {
		return this.lb;
	}

	@OriginalMember(owner = "client!vka", name = "g", descriptor = "(B)I")
	@Override
	public int method9095(@OriginalArg(0) byte arg0) {
		return arg0 > -5 ? -121 : this.aClass136_4.method3100(0);
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(B)V")
	@Override
	public void method9103() {
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(Lclient!ee;Lclient!ha;IZIIZ)V")
	@Override
	public void method9091(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vka", name = "f", descriptor = "(I)V")
	@Override
	public void method9086() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9106(@OriginalArg(1) Class22 arg0) {
		this.aClass136_4.method3098(arg0);
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(ZLclient!ha;)Lclient!nk;")
	@Override
	public Class9_Sub6 method9092(@OriginalArg(1) Class22 arg0) {
		@Pc(14) Class170 local14 = this.aClass136_4.method3099(arg0, false, 2048, true);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class58 local22 = arg0.method9354();
		local22.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
		@Pc(36) Class9_Sub6 local36 = Static135.method9083(1, this.aBoolean726);
		this.aClass136_4.method3107(super.aShort121, super.aShort120, super.aShort123, arg0, super.aShort122, local14, true, local22);
		if (Static444.aBoolean451) {
			local14.method8350(local22, local36.aClass9_Sub9Array1[0], Static668.anInt10260, 0);
		} else {
			local14.method8360(local22, local36.aClass9_Sub9Array1[0], 0);
		}
		if (this.aClass136_4.aClass9_Sub5_4 != null) {
			@Pc(86) Class346 local86 = this.aClass136_4.aClass9_Sub5_4.method5580();
			if (Static444.aBoolean451) {
				arg0.method9360(local86, Static668.anInt10260);
			} else {
				arg0.method9384(local86);
			}
		}
		this.aBoolean727 = local14.F() || this.aClass136_4.aClass9_Sub5_4 != null;
		if (this.lb == null) {
			this.lb = Static696.method9207(local14, super.anInt10690, super.anInt10695, super.anInt10694);
		} else {
			Static226.method3327(this.lb, super.anInt10690, super.anInt10695, super.anInt10694, local14);
		}
		return local36;
	}

	@OriginalMember(owner = "client!vka", name = "b", descriptor = "(I)I")
	@Override
	public int method9105() {
		return this.aClass136_4.anInt3398;
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method9089(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class170 local12 = this.aClass136_4.method3099(arg0, false, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(20) Class58 local20 = arg0.method9354();
			local20.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
			return Static444.aBoolean451 ? local12.method8351(arg1, arg2, local20, false, 0, Static668.anInt10260) : local12.method8349(arg1, arg2, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(ILclient!hr;)V")
	public void method9112(@OriginalArg(1) Class165 arg0) {
		this.aClass136_4.method3101(arg0);
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9085(@OriginalArg(1) Class22 arg0) {
		@Pc(17) Class170 local17 = this.aClass136_4.method3099(arg0, true, 262144, true);
		if (local17 != null) {
			@Pc(22) Class58 local22 = arg0.method9354();
			local22.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
			this.aClass136_4.method3107(super.aShort121, super.aShort120, super.aShort123, arg0, super.aShort122, local17, false, local22);
		}
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(Z)I")
	@Override
	public int method9107() {
		return this.aClass136_4.anInt3392;
	}
}
