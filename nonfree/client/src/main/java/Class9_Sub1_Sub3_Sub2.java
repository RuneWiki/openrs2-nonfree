import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class9_Sub1_Sub3_Sub2 extends Class9_Sub1_Sub3 implements Interface9 {

	@OriginalMember(owner = "client!pf", name = "kb", descriptor = "Lclient!tc;")
	private Class354 aClass354_5;

	@OriginalMember(owner = "client!pf", name = "lb", descriptor = "Z")
	private boolean lb = true;

	@OriginalMember(owner = "client!pf", name = "ib", descriptor = "Lclient!gg;")
	public final Class136 aClass136_3;

	@OriginalMember(owner = "client!pf", name = "V", descriptor = "Z")
	private final boolean aBoolean527;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!ha;Lclient!mf;IIIIIZIIIII)V")
	public Class9_Sub1_Sub3_Sub2(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass136_3 = new Class136(arg0, arg1, arg10, arg11, super.aByte139, arg3, this, arg7, arg12);
		this.aBoolean527 = arg1.anInt6278 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)I")
	@Override
	public int method9107() {
		return this.aClass136_3.anInt3392;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	@Override
	public void method9103() {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9106(@OriginalArg(1) Class22 arg0) {
		this.aClass136_3.method3098(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLclient!ha;)Lclient!nk;")
	@Override
	public Class9_Sub6 method9092(@OriginalArg(1) Class22 arg0) {
		@Pc(14) Class170 local14 = this.aClass136_3.method3099(arg0, false, 2048, true);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class58 local22 = arg0.method9354();
		local22.method9524(super.anInt10694 + super.aShort86, super.anInt10690, super.anInt10695 + super.aShort85);
		@Pc(43) Class9_Sub6 local43 = Static135.method9083(1, this.aBoolean527);
		@Pc(48) int local48 = super.anInt10694 >> 9;
		@Pc(53) int local53 = super.anInt10695 >> 9;
		this.aClass136_3.method3107(local53, local53, local48, arg0, local48, local14, true, local22);
		if (Static444.aBoolean451) {
			local14.method8350(local22, local43.aClass9_Sub9Array1[0], Static668.anInt10260, 0);
		} else {
			local14.method8360(local22, local43.aClass9_Sub9Array1[0], 0);
		}
		if (this.aClass136_3.aClass9_Sub5_4 != null) {
			@Pc(99) Class346 local99 = this.aClass136_3.aClass9_Sub5_4.method5580();
			if (Static444.aBoolean451) {
				arg0.method9360(local99, Static668.anInt10260);
			} else {
				arg0.method9384(local99);
			}
		}
		this.lb = local14.F() || this.aClass136_3.aClass9_Sub5_4 != null;
		if (this.aClass354_5 == null) {
			this.aClass354_5 = Static696.method9207(local14, super.anInt10690, super.anInt10695, super.anInt10694);
		} else {
			Static226.method3327(this.aClass354_5, super.anInt10690, super.anInt10695, super.anInt10694, local14);
		}
		return local43;
	}

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "(B)I")
	@Override
	public int method9095(@OriginalArg(0) byte arg0) {
		if (arg0 >= -5) {
			this.method9085((Class22) null);
		}
		return this.aClass136_3.method3100(0);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9085(@OriginalArg(1) Class22 arg0) {
		@Pc(17) Class170 local17 = this.aClass136_3.method3099(arg0, false, 262144, true);
		if (local17 == null) {
			return;
		}
		@Pc(24) int local24 = super.anInt10694 >> 9;
		@Pc(29) int local29 = super.anInt10695 >> 9;
		@Pc(32) Class58 local32 = arg0.method9354();
		local32.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
		this.aClass136_3.method3107(local29, local29, local24, arg0, local24, local17, false, local32);
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9108(@OriginalArg(1) Class22 arg0) {
		this.aClass136_3.method3109(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9104() {
		return this.aClass136_3.method3096();
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method9084() {
		return this.lb;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method9089(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class170 local12 = this.aClass136_3.method3099(arg0, false, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(20) Class58 local20 = arg0.method9354();
			local20.method9524(super.aShort86 + super.anInt10694, super.anInt10690, super.anInt10695 + super.aShort85);
			return Static444.aBoolean451 ? local12.method8351(arg1, arg2, local20, false, 0, Static668.anInt10260) : local12.method8349(arg1, arg2, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)I")
	@Override
	public int method9102() {
		return this.aClass136_3.anInt3394;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(ILclient!ha;)Lclient!tc;")
	@Override
	public Class354 method9080(@OriginalArg(1) Class22 arg0) {
		return this.aClass354_5;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(Z)I")
	@Override
	public int method9081() {
		return this.aClass136_3.method3097();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!hr;)V")
	public void method6743(@OriginalArg(1) Class165 arg0) {
		this.aClass136_3.method3101(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)I")
	@Override
	public int method9105() {
		return this.aClass136_3.anInt3398;
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9093() {
		return false;
	}
}
