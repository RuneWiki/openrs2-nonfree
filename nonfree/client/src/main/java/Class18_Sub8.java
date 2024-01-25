import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class18_Sub8 extends Class18 {

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "Z")
	private boolean aBoolean740;

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "Lclient!jga;")
	private final Class179 aClass179_7;

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "Lclient!cka;")
	private final Class65_Sub2_Sub1 aClass65_Sub2_Sub1_9;

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "Z")
	private final boolean aBoolean741;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!cka;Lclient!wm;Lclient!jga;)V")
	public Class18_Sub8(@OriginalArg(0) Class65_Sub2_Sub1 arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class179 arg2) {
		super(arg0);
		this.aClass179_7 = arg2;
		this.aClass65_Sub2_Sub1_9 = arg0;
		if (arg1 != null && this.aClass65_Sub2_23.aBoolean429 && this.aClass65_Sub2_23.aBoolean445 && (this.aClass65_Sub2_Sub1_9.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass65_Sub2_Sub1_9.anIDirect3DDevice1.a(arg1.method8917("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass65_Sub2_Sub1_9.anIDirect3DDevice1.b(arg1.method8917("dx", "environment_mapped_water_f"));
			this.aBoolean741 = this.anIDirect3DVertexShader8 != null && this.anIDirect3DPixelShader1 != null && this.aClass179_7.method4544();
		} else {
			this.anIDirect3DVertexShader8 = null;
			this.aBoolean741 = false;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)V")
	@Override
	public void method9010() {
		if (!this.aBoolean740) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass65_Sub2_Sub1_9.anIDirect3DDevice1;
		if (this.aClass65_Sub2_23.anInt5263 <= 0) {
			local14.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(34) float local34 = this.aClass65_Sub2_23.aFloat97;
			@Pc(38) float local38 = this.aClass65_Sub2_23.aFloat102;
			local14.a(16, local34, 1.0F / (local34 - local38), 0.0F, 0.0F);
		}
		local14.b(0, (float) (this.aClass65_Sub2_23.anInt5246 >> 16 & 0xFF) / 255.0F, (float) (this.aClass65_Sub2_23.anInt5246 >> 8 & 0xFF) / 255.0F, (float) (this.aClass65_Sub2_23.anInt5246 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
	@Override
	public void method8997() {
		if (this.aBoolean740) {
			@Pc(15) IDirect3DDevice local15 = this.aClass65_Sub2_Sub1_9.anIDirect3DDevice1;
			@Pc(20) Class254_Sub2 local20 = this.aClass65_Sub2_Sub1_9.method4410();
			local15.a(0, local20.method6242(Static523.aFloatArray87));
		}
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V")
	@Override
	public void method9002() {
		if (this.aBoolean740) {
			@Pc(14) IDirect3DDevice local14 = this.aClass65_Sub2_Sub1_9.anIDirect3DDevice1;
			@Pc(19) Class254_Sub2 local19 = this.aClass65_Sub2_23.method4429();
			local14.SetVertexShaderConstantF(12, local19.method6223(Static523.aFloatArray87), 2);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	@Override
	public void method8999() {
		if (!this.aBoolean740) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass65_Sub2_Sub1_9.anIDirect3DDevice1;
		@Pc(11) Class254_Sub2 local11 = this.aClass65_Sub2_Sub1_9.method4468();
		@Pc(16) Class254_Sub2 local16 = this.aClass65_Sub2_Sub1_9.method4410();
		local6.a(0, local16.method6242(Static523.aFloatArray87));
		local6.a(4, local11.method6235(Static523.aFloatArray87));
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9000() {
		return this.aBoolean741;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9011(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface14 local8 = this.aClass65_Sub2_23.method4390();
		if (!this.aBoolean741 || local8 == null) {
			return;
		}
		@Pc(18) IDirect3DDevice local18 = this.aClass65_Sub2_Sub1_9.anIDirect3DDevice1;
		this.aClass65_Sub2_Sub1_9.method1762(this.anIDirect3DVertexShader8);
		this.aClass65_Sub2_Sub1_9.method1756(this.anIDirect3DPixelShader1);
		this.aClass65_Sub2_23.method4358(1);
		this.aClass65_Sub2_23.method4426(local8);
		this.aClass65_Sub2_23.method4358(0);
		this.aClass65_Sub2_23.method4426(this.aClass179_7.anInterface10_2);
		this.aBoolean740 = true;
		this.method8999();
		this.method9002();
		this.method8998();
		this.method9010();
		local18.b(1, -this.aClass65_Sub2_23.aFloatArray50[0], -this.aClass65_Sub2_23.aFloatArray50[1], -this.aClass65_Sub2_23.aFloatArray50[2], 0.0F);
		local18.b(2, this.aClass65_Sub2_23.aFloat106, this.aClass65_Sub2_23.aFloat107, this.aClass65_Sub2_23.aFloat112, 1.0F);
		local18.b(3, Math.abs(this.aClass65_Sub2_23.aFloatArray50[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9009(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V")
	@Override
	public void method8998() {
		if (this.aBoolean740) {
			@Pc(6) IDirect3DDevice local6 = this.aClass65_Sub2_Sub1_9.anIDirect3DDevice1;
			local6.a(8, this.aClass65_Sub2_23.method4376(Static523.aFloatArray87));
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BII)V")
	@Override
	public void method9012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean740) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass65_Sub2_Sub1_9.anIDirect3DDevice1;
		@Pc(13) int local13 = 0x1 << (arg1 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg0 & 0xFFFF;
		local7.a(14, (float) (local13 * this.aClass65_Sub2_23.anInt5266 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(54) float local54 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		local7.a(15, local24, 0.0F, 0.0F, 0.0F);
		local7.b(4, (float) local28, 0.0F, 0.0F, 0.0F);
		local7.b(5, local54, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
	@Override
	public void method9003() {
		if (!this.aBoolean740) {
			return;
		}
		this.aClass65_Sub2_Sub1_9.method1762((IDirect3DVertexShader) null);
		this.aClass65_Sub2_Sub1_9.method1756((IDirect3DPixelShader) null);
		this.aClass65_Sub2_23.method4358(1);
		this.aClass65_Sub2_23.method4426((Interface25) null);
		this.aClass65_Sub2_23.method4358(0);
		this.aClass65_Sub2_23.method4426((Interface25) null);
		this.aBoolean740 = false;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!sfa;I)V")
	@Override
	public void method9006(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1) {
	}
}
