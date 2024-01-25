import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class9_Sub1_Sub2_Sub2 extends Class9_Sub1_Sub2 implements Interface9 {

	@OriginalMember(owner = "client!hs", name = "N", descriptor = "Lclient!tc;")
	private Class354 aClass354_3;

	@OriginalMember(owner = "client!hs", name = "gb", descriptor = "Z")
	private boolean aBoolean250 = true;

	@OriginalMember(owner = "client!hs", name = "fb", descriptor = "Lclient!gg;")
	public final Class136 aClass136_1;

	@OriginalMember(owner = "client!hs", name = "Y", descriptor = "Z")
	private final boolean aBoolean249;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!ha;Lclient!mf;IIIIIZIII)V")
	public Class9_Sub1_Sub2_Sub2(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static85.method1864(arg8, arg9));
		this.aClass136_1 = new Class136(arg0, arg1, arg8, arg9, super.aByte139, arg3, this, arg7, arg10);
		this.aBoolean249 = arg1.anInt6278 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(Z)I")
	@Override
	public int method9081() {
		return this.aClass136_1.method3097();
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(ILclient!ha;)Lclient!tc;")
	@Override
	public Class354 method9080(@OriginalArg(1) Class22 arg0) {
		return this.aClass354_3;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9104() {
		return this.aClass136_1.method3096();
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)I")
	@Override
	public int method9102() {
		return this.aClass136_1.anInt3394;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9085(@OriginalArg(1) Class22 arg0) {
		@Pc(12) Class170 local12 = this.aClass136_1.method3099(arg0, true, 262144, true);
		if (local12 == null) {
			return;
		}
		@Pc(28) int local28 = super.anInt10694 >> 9;
		@Pc(33) int local33 = super.anInt10695 >> 9;
		@Pc(36) Class58 local36 = arg0.method9354();
		local36.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
		this.aClass136_1.method3107(local33, local33, local28, arg0, local28, local12, false, local36);
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method9077() {
		return false;
	}

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "(B)I")
	@Override
	public int method9095(@OriginalArg(0) byte arg0) {
		if (arg0 > -5) {
			this.method3588((Class165) null);
		}
		return this.aClass136_1.method3100(0);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZLclient!ha;)Lclient!nk;")
	@Override
	public Class9_Sub6 method9092(@OriginalArg(1) Class22 arg0) {
		@Pc(14) Class170 local14 = this.aClass136_1.method3099(arg0, false, 2048, true);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class58 local22 = arg0.method9354();
		local22.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
		@Pc(36) Class9_Sub6 local36 = Static135.method9083(1, this.aBoolean249);
		@Pc(41) int local41 = super.anInt10694 >> 9;
		@Pc(46) int local46 = super.anInt10695 >> 9;
		this.aClass136_1.method3107(local46, local46, local41, arg0, local41, local14, true, local22);
		if (Static444.aBoolean451) {
			local14.method8350(local22, local36.aClass9_Sub9Array1[0], Static668.anInt10260, 0);
		} else {
			local14.method8360(local22, local36.aClass9_Sub9Array1[0], 0);
		}
		if (this.aClass136_1.aClass9_Sub5_4 != null) {
			@Pc(92) Class346 local92 = this.aClass136_1.aClass9_Sub5_4.method5580();
			if (Static444.aBoolean451) {
				arg0.method9360(local92, Static668.anInt10260);
			} else {
				arg0.method9384(local92);
			}
		}
		this.aBoolean250 = local14.F() || this.aClass136_1.aClass9_Sub5_4 != null;
		if (this.aClass354_3 == null) {
			this.aClass354_3 = Static696.method9207(local14, super.anInt10690, super.anInt10695, super.anInt10694);
		} else {
			Static226.method3327(this.aClass354_3, super.anInt10690, super.anInt10695, super.anInt10694, local14);
		}
		return local36;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method9089(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class170 local12 = this.aClass136_1.method3099(arg0, false, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(20) Class58 local20 = arg0.method9354();
			local20.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
			return Static444.aBoolean451 ? local12.method8351(arg1, arg2, local20, false, 0, Static668.anInt10260) : local12.method8349(arg1, arg2, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
	@Override
	public void method9103() {
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9093() {
		return false;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9106(@OriginalArg(1) Class22 arg0) {
		this.aClass136_1.method3098(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method9084() {
		return this.aBoolean250;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9108(@OriginalArg(1) Class22 arg0) {
		this.aClass136_1.method3109(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!hr;I)V")
	public void method3588(@OriginalArg(0) Class165 arg0) {
		this.aClass136_1.method3101(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "(I)V")
	@Override
	public void method9086() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)I")
	@Override
	public int method9107() {
		return this.aClass136_1.anInt3392;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!ee;Lclient!ha;IZIIZ)V")
	@Override
	public void method9091(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)I")
	@Override
	public int method9105() {
		return this.aClass136_1.anInt3398;
	}
}
