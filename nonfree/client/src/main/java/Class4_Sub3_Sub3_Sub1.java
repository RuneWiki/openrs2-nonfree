import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class4_Sub3_Sub3_Sub1 extends Class4_Sub3_Sub3 {

	@OriginalMember(owner = "client!ffa", name = "N", descriptor = "Lclient!ui;")
	private Class4_Sub8 aClass4_Sub8_2;

	@OriginalMember(owner = "client!ffa", name = "hb", descriptor = "I")
	private int anInt2467 = 0;

	@OriginalMember(owner = "client!ffa", name = "P", descriptor = "Z")
	private boolean aBoolean172 = true;

	@OriginalMember(owner = "client!ffa", name = "Q", descriptor = "I")
	private int anInt2465 = 0;

	@OriginalMember(owner = "client!ffa", name = "K", descriptor = "I")
	private int anInt2460 = 0;

	@OriginalMember(owner = "client!ffa", name = "S", descriptor = "I")
	private final int anInt2463;

	@OriginalMember(owner = "client!ffa", name = "M", descriptor = "Lclient!jaa;")
	private Class181 aClass181_2;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class4_Sub3_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt2467 = arg11;
		this.anInt2463 = arg0;
		@Pc(36) Class203 local36 = Static453.aClass281_2.method6686(this.anInt2463);
		@Pc(39) int local39 = local36.anInt5538;
		if (local39 != -1) {
			this.aClass181_2 = new Class181_Sub2(this, false);
			@Pc(60) int local60 = local36.aBoolean402 ? 0 : 2;
			if (arg12) {
				local60 = 1;
			}
			this.aClass181_2.method8955(local60, false, arg1, local39);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)Z")
	public boolean method2316() {
		return this.aClass181_2 == null || this.aClass181_2.method8962();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!ha;BIIZLclient!haa;I)V")
	@Override
	public void method9480(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class4_Sub3 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "(I)I")
	@Override
	public int method9479() {
		return this.anInt2460;
	}

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method9476() {
		return this.aBoolean172;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(B)Z")
	public boolean method2317() {
		return this.aClass181_2 != null && !this.aClass181_2.method8969();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILclient!rd;Lclient!ka;Lclient!ha;)V")
	private void method2318(@OriginalArg(1) Class263 arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) Class144 arg2) {
		arg1.method5294(arg0);
		@Pc(16) Class352[] local16 = arg1.method5304();
		@Pc(19) Class172[] local19 = arg1.method5310();
		if ((this.aClass4_Sub8_2 == null || this.aClass4_Sub8_2.aBoolean705) && (local16 != null || local19 != null)) {
			this.aClass4_Sub8_2 = Static616.method8682(Static530.anInt9105, true);
		}
		if (this.aClass4_Sub8_2 != null) {
			this.aClass4_Sub8_2.method8667(arg2, (long) Static530.anInt9105, local16, local19);
			this.aClass4_Sub8_2.method8670(super.aByte146, super.aShort108, super.aShort107, super.aShort109, super.aShort110);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(II)V")
	public void method2319(@OriginalArg(0) int arg0) {
		if (this.aClass181_2 != null && !this.aClass181_2.method8962()) {
			this.aClass181_2.method8961(arg0);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9483() {
		return false;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IILclient!ha;I)Lclient!ka;")
	private Class129 method2320(@OriginalArg(0) int arg0, @OriginalArg(2) Class144 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class203 local8 = Static453.aClass281_2.method6686(arg0);
		@Pc(22) Class159 local22 = Static445.aClass159Array3[super.aByte146];
		@Pc(36) Class159 local36 = super.aByte147 < 3 ? Static445.aClass159Array3[super.aByte147 + 1] : null;
		return this.aClass181_2 == null || this.aClass181_2.method8962() ? local8.method5005(arg2, (byte) 2, super.anInt11178, super.anInt11184, (Class181) null, local22, true, super.anInt11182, local36, arg1) : local8.method5005(arg2, (byte) 2, super.anInt11178, super.anInt11184, this.aClass181_2, local22, true, super.anInt11182, local36, arg1);
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Lclient!ha;I)Lclient!th;")
	@Override
	public Class348 method9492(@OriginalArg(0) Class144 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ffa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub8_2 != null) {
			this.aClass4_Sub8_2.method8680();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9489() {
		return false;
	}

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "(I)I")
	@Override
	public int method9485(@OriginalArg(0) int arg0) {
		if (arg0 != 14603) {
			this.method9492((Class144) null);
		}
		return this.anInt2465;
	}

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "(I)V")
	@Override
	public void method9482() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Z)V")
	public void method2322() {
		if (this.aClass4_Sub8_2 != null) {
			this.aClass4_Sub8_2.method8680();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(ILclient!ha;)Lclient!w;")
	@Override
	public Class4_Sub9 method9491(@OriginalArg(1) Class144 arg0) {
		@Pc(24) Class129 local24 = this.method2320(this.anInt2463, arg0, (this.anInt2467 == 0 ? 0 : 5) | 0x800);
		if (local24 == null) {
			return null;
		}
		if (this.anInt2467 != 0) {
			local24.a(this.anInt2467 * 2048);
		}
		@Pc(46) Class263 local46 = arg0.method6907();
		local46.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
		this.method2318(local46, local24, arg0);
		@Pc(69) Class4_Sub9 local69 = Static272.method7693(1, false);
		if (Static6.aBoolean9) {
			local24.method5289(local46, local69.aClass4_Sub1Array1[0], Static481.anInt10749, 0);
		} else {
			local24.method5307(local46, local69.aClass4_Sub1Array1[0], 0);
		}
		if (this.aClass4_Sub8_2 != null) {
			@Pc(101) Class304 local101 = this.aClass4_Sub8_2.method8671();
			if (Static6.aBoolean9) {
				arg0.method6902(local101, Static481.anInt10749);
			} else {
				arg0.method6903(local101);
			}
		}
		this.aBoolean172 = local24.F();
		this.anInt2460 = local24.fa();
		this.anInt2465 = local24.ma();
		return local69;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZILclient!ha;)Z")
	@Override
	public boolean method9478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9490(@OriginalArg(0) Class144 arg0) {
		@Pc(16) Class129 local16 = this.method2320(this.anInt2463, arg0, 0);
		if (local16 != null) {
			@Pc(21) Class263 local21 = arg0.method6907();
			local21.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
			this.method2318(local21, local16, arg0);
		}
	}
}
