import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class16_Sub3 extends Class16 {

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "Z")
	private boolean aBoolean547;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "Lclient!eb;")
	private final Class73 aClass73_4;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "Lclient!cu;")
	private final Class33_Sub1_Sub2 aClass33_Sub1_Sub2_5;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "Z")
	private final boolean aBoolean546;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!cu;Lclient!kha;Lclient!eb;)V")
	public Class16_Sub3(@OriginalArg(0) Class33_Sub1_Sub2 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class73 arg2) {
		super(arg0);
		this.aClass73_4 = arg2;
		this.aClass33_Sub1_Sub2_5 = arg0;
		if (arg1 != null && this.aClass33_Sub1_23.aBoolean179 && this.aClass33_Sub1_23.aBoolean176 && (this.aClass33_Sub1_Sub2_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass33_Sub1_Sub2_5.anIDirect3DDevice1.b(arg1.method5026("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass33_Sub1_Sub2_5.anIDirect3DDevice1.a(arg1.method5026("dx", "environment_mapped_water_f"));
			this.aBoolean546 = this.anIDirect3DVertexShader2 != null && this.anIDirect3DPixelShader1 != null && this.aClass73_4.method2711();
		} else {
			this.aBoolean546 = false;
			this.anIDirect3DVertexShader2 = null;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
	@Override
	public void method8609() {
		if (this.aBoolean547) {
			@Pc(15) IDirect3DDevice local15 = this.aClass33_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(20) Class47_Sub3 local20 = this.aClass33_Sub1_Sub2_5.method2061();
			local15.a(0, local20.method7880(Static317.aFloatArray54));
		}
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8608() {
		return this.aBoolean546;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!bia;BI)V")
	@Override
	public void method8611(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8601(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface24 local8 = this.aClass33_Sub1_23.method1982();
		if (!this.aBoolean546 || local8 == null) {
			return;
		}
		@Pc(17) IDirect3DDevice local17 = this.aClass33_Sub1_Sub2_5.anIDirect3DDevice1;
		this.aClass33_Sub1_Sub2_5.method2119(this.anIDirect3DVertexShader2);
		this.aClass33_Sub1_Sub2_5.method2122(this.anIDirect3DPixelShader1);
		this.aClass33_Sub1_23.method2010(1);
		this.aClass33_Sub1_23.method1987(local8);
		this.aClass33_Sub1_23.method2010(0);
		this.aClass33_Sub1_23.method1987(this.aClass73_4.anInterface17_1);
		this.aBoolean547 = true;
		this.method8600();
		this.method8610();
		this.method8607();
		this.method8599();
		local17.b(1, -this.aClass33_Sub1_23.aFloatArray29[0], -this.aClass33_Sub1_23.aFloatArray29[1], -this.aClass33_Sub1_23.aFloatArray29[2], 0.0F);
		local17.b(2, this.aClass33_Sub1_23.aFloat69, this.aClass33_Sub1_23.aFloat71, this.aClass33_Sub1_23.aFloat77, 1.0F);
		local17.b(3, Math.abs(this.aClass33_Sub1_23.aFloatArray29[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
	@Override
	public void method8600() {
		if (!this.aBoolean547) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass33_Sub1_Sub2_5.anIDirect3DDevice1;
		@Pc(19) Class47_Sub3 local19 = this.aClass33_Sub1_Sub2_5.method1997();
		@Pc(24) Class47_Sub3 local24 = this.aClass33_Sub1_Sub2_5.method2061();
		local14.a(0, local24.method7880(Static317.aFloatArray54));
		local14.a(4, local19.method7898(Static317.aFloatArray54));
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)V")
	@Override
	public void method8610() {
		if (this.aBoolean547) {
			@Pc(13) IDirect3DDevice local13 = this.aClass33_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(18) Class47_Sub3 local18 = this.aClass33_Sub1_23.method2041();
			local13.SetVertexShaderConstantF(12, local18.method7895(Static317.aFloatArray54), 2);
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
	@Override
	public void method8604() {
		if (!this.aBoolean547) {
			return;
		}
		this.aClass33_Sub1_Sub2_5.method2119(null);
		this.aClass33_Sub1_Sub2_5.method2122(null);
		this.aClass33_Sub1_23.method2010(1);
		this.aClass33_Sub1_23.method1987(null);
		this.aClass33_Sub1_23.method2010(0);
		this.aClass33_Sub1_23.method1987(null);
		this.aBoolean547 = false;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8596(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V")
	@Override
	public void method8607() {
		if (this.aBoolean547) {
			@Pc(12) IDirect3DDevice local12 = this.aClass33_Sub1_Sub2_5.anIDirect3DDevice1;
			local12.a(8, this.aClass33_Sub1_23.method2048(Static317.aFloatArray54));
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	@Override
	public void method8599() {
		if (!this.aBoolean547) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass33_Sub1_Sub2_5.anIDirect3DDevice1;
		if (this.aClass33_Sub1_23.anInt2170 > 0) {
			@Pc(16) float local16 = this.aClass33_Sub1_23.aFloat73;
			@Pc(20) float local20 = this.aClass33_Sub1_23.aFloat81;
			local7.a(16, local16, 1.0F / (local16 - local20), 0.0F, 0.0F);
		} else {
			local7.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local7.b(0, (float) (this.aClass33_Sub1_23.anInt2166 >> 16 & 0xFF) / 255.0F, (float) (this.aClass33_Sub1_23.anInt2166 >> 8 & 0xFF) / 255.0F, (float) (this.aClass33_Sub1_23.anInt2166 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean547) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass33_Sub1_Sub2_5.anIDirect3DDevice1;
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local6.a(14, (float) (local12 * this.aClass33_Sub1_23.anInt2179 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local6.a(15, local23, 0.0F, 0.0F, 0.0F);
		local6.b(4, (float) local27, 0.0F, 0.0F, 0.0F);
		local6.b(5, local36, 0.0F, 0.0F, 0.0F);
	}
}
