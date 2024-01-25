import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!via")
public final class Class7_Sub11 extends Class7 {

	@OriginalMember(owner = "client!via", name = "o", descriptor = "Z")
	private boolean aBoolean710;

	@OriginalMember(owner = "client!via", name = "p", descriptor = "Lclient!jo;")
	private final Class174 aClass174_8;

	@OriginalMember(owner = "client!via", name = "q", descriptor = "Lclient!rd;")
	private final Class95_Sub3_Sub1 aClass95_Sub3_Sub1_9;

	@OriginalMember(owner = "client!via", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!via", name = "t", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!via", name = "r", descriptor = "Z")
	private final boolean aBoolean711;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lclient!rd;Lclient!wu;Lclient!jo;)V")
	public Class7_Sub11(@OriginalArg(0) Class95_Sub3_Sub1 arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class174 arg2) {
		super(arg0);
		this.aClass174_8 = arg2;
		this.aClass95_Sub3_Sub1_9 = arg0;
		if (arg1 != null && this.aClass95_Sub3_23.aBoolean629 && this.aClass95_Sub3_23.aBoolean623 && (this.aClass95_Sub3_Sub1_9.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass95_Sub3_Sub1_9.anIDirect3DDevice1.b(arg1.method8628("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass95_Sub3_Sub1_9.anIDirect3DDevice1.a(arg1.method8628("environment_mapped_water_f", "dx"));
			this.aBoolean711 = this.anIDirect3DVertexShader8 != null && this.anIDirect3DPixelShader1 != null && this.aClass174_8.method3799();
		} else {
			this.anIDirect3DVertexShader8 = null;
			this.anIDirect3DPixelShader1 = null;
			this.aBoolean711 = false;
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean710) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass95_Sub3_Sub1_9.anIDirect3DDevice1;
		@Pc(19) int local19 = 0x1 << (arg0 & 0x3);
		@Pc(30) float local30 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(34) int local34 = arg1 & 0xFFFF;
		local13.b(14, (float) (this.aClass95_Sub3_23.anInt8347 * local19 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(60) float local60 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local13.b(15, local30, 0.0F, 0.0F, 0.0F);
		local13.a(4, (float) local34, 0.0F, 0.0F, 0.0F);
		local13.a(5, local60, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!via", name = "d", descriptor = "(B)V")
	@Override
	public void method8130() {
		if (!this.aBoolean710) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass95_Sub3_Sub1_9.anIDirect3DDevice1;
		if (this.aClass95_Sub3_23.anInt8382 <= 0) {
			local6.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(26) float local26 = this.aClass95_Sub3_23.aFloat179;
			@Pc(30) float local30 = this.aClass95_Sub3_23.aFloat175;
			local6.b(16, local26, 1.0F / (local26 - local30), 0.0F, 0.0F);
		}
		local6.a(0, (float) (this.aClass95_Sub3_23.anInt8359 >> 16 & 0xFF) / 255.0F, (float) (this.aClass95_Sub3_23.anInt8359 >> 8 & 0xFF) / 255.0F, (float) (this.aClass95_Sub3_23.anInt8359 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!via", name = "c", descriptor = "(I)V")
	@Override
	public void method8131() {
		if (this.aBoolean710) {
			@Pc(7) IDirect3DDevice local7 = this.aClass95_Sub3_Sub1_9.anIDirect3DDevice1;
			@Pc(12) Class177_Sub1 local12 = this.aClass95_Sub3_23.method7053();
			local7.SetVertexShaderConstantF(12, local12.method3826(Static603.aFloatArray81), 2);
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(IILclient!lo;)V")
	@Override
	public void method8126(@OriginalArg(0) int arg0, @OriginalArg(2) Interface17 arg1) {
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(I)V")
	@Override
	public void method8127() {
		if (!this.aBoolean710) {
			return;
		}
		this.aClass95_Sub3_Sub1_9.method6738(null);
		this.aClass95_Sub3_Sub1_9.method6734(null);
		this.aClass95_Sub3_23.method7145(1);
		this.aClass95_Sub3_23.method7112(null);
		this.aClass95_Sub3_23.method7145(0);
		this.aClass95_Sub3_23.method7112(null);
		this.aBoolean710 = false;
	}

	@OriginalMember(owner = "client!via", name = "c", descriptor = "(B)V")
	@Override
	public void method8129() {
		if (this.aBoolean710) {
			@Pc(7) IDirect3DDevice local7 = this.aClass95_Sub3_Sub1_9.anIDirect3DDevice1;
			local7.a(8, this.aClass95_Sub3_23.method7038(Static603.aFloatArray81));
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8125(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!via", name = "d", descriptor = "(I)V")
	@Override
	public void method8133() {
		if (!this.aBoolean710) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass95_Sub3_Sub1_9.anIDirect3DDevice1;
		@Pc(14) Class177_Sub1 local14 = this.aClass95_Sub3_Sub1_9.method7084();
		@Pc(19) Class177_Sub1 local19 = this.aClass95_Sub3_Sub1_9.method7113();
		local7.a(0, local19.method3839(Static603.aFloatArray81));
		local7.a(4, local14.method3833(Static603.aFloatArray81));
	}

	@OriginalMember(owner = "client!via", name = "e", descriptor = "(B)V")
	@Override
	public void method8134() {
		if (this.aBoolean710) {
			@Pc(14) IDirect3DDevice local14 = this.aClass95_Sub3_Sub1_9.anIDirect3DDevice1;
			@Pc(19) Class177_Sub1 local19 = this.aClass95_Sub3_Sub1_9.method7113();
			local14.a(0, local19.method3839(Static603.aFloatArray81));
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8120(@OriginalArg(1) boolean arg0) {
		@Pc(4) Interface23 local4 = this.aClass95_Sub3_23.method7055();
		if (!this.aBoolean711 || local4 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass95_Sub3_Sub1_9.anIDirect3DDevice1;
		this.aClass95_Sub3_Sub1_9.method6738(this.anIDirect3DVertexShader8);
		this.aClass95_Sub3_Sub1_9.method6734(this.anIDirect3DPixelShader1);
		this.aClass95_Sub3_23.method7145(1);
		this.aClass95_Sub3_23.method7112(local4);
		this.aClass95_Sub3_23.method7145(0);
		this.aClass95_Sub3_23.method7112(this.aClass174_8.anInterface5_1);
		this.aBoolean710 = true;
		this.method8133();
		this.method8131();
		this.method8129();
		this.method8130();
		local13.a(1, -this.aClass95_Sub3_23.aFloatArray72[0], -this.aClass95_Sub3_23.aFloatArray72[1], -this.aClass95_Sub3_23.aFloatArray72[2], 0.0F);
		local13.a(2, this.aClass95_Sub3_23.aFloat183, this.aClass95_Sub3_23.aFloat172, this.aClass95_Sub3_23.aFloat181, 1.0F);
		local13.a(3, Math.abs(this.aClass95_Sub3_23.aFloatArray72[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!via", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8135() {
		return this.aBoolean711;
	}
}
