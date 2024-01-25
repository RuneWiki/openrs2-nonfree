import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class18_Sub9 extends Class18 {

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "Z")
	private boolean aBoolean500;

	@OriginalMember(owner = "client!ou", name = "o", descriptor = "Lclient!tn;")
	private final Class334 aClass334_6;

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "Lclient!ul;")
	private final Class13_Sub3_Sub2 aClass13_Sub3_Sub2_5;

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "Z")
	private final boolean aBoolean499;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!ul;Lclient!nd;Lclient!tn;)V")
	public Class18_Sub9(@OriginalArg(0) Class13_Sub3_Sub2 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class334 arg2) {
		super(arg0);
		this.aClass334_6 = arg2;
		this.aClass13_Sub3_Sub2_5 = arg0;
		if (arg1 != null && this.aClass13_Sub3_23.aBoolean686 && this.aClass13_Sub3_23.aBoolean695 && (this.aClass13_Sub3_Sub2_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass13_Sub3_Sub2_5.anIDirect3DDevice1.a(arg1.method5572("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass13_Sub3_Sub2_5.anIDirect3DDevice1.b(arg1.method5572("dx", "environment_mapped_water_f"));
			this.aBoolean499 = this.anIDirect3DVertexShader2 != null && this.anIDirect3DPixelShader1 != null && this.aClass334_6.method7836();
		} else {
			this.aBoolean499 = false;
			this.anIDirect3DPixelShader1 = null;
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8643() {
		return this.aBoolean499;
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)V")
	@Override
	public void method8639() {
		if (this.aBoolean500) {
			@Pc(11) IDirect3DDevice local11 = this.aClass13_Sub3_Sub2_5.anIDirect3DDevice1;
			@Pc(16) Class51_Sub2 local16 = this.aClass13_Sub3_23.method8256();
			local11.SetVertexShaderConstantF(12, local16.method3243(Static421.aFloatArray61), 2);
		}
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
	@Override
	public void method8636() {
		if (this.aBoolean500) {
			@Pc(14) IDirect3DDevice local14 = this.aClass13_Sub3_Sub2_5.anIDirect3DDevice1;
			local14.a(8, this.aClass13_Sub3_23.method8294(Static421.aFloatArray61));
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean500) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass13_Sub3_Sub2_5.anIDirect3DDevice1;
		@Pc(19) int local19 = 0x1 << (arg0 & 0x3);
		@Pc(30) float local30 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(34) int local34 = arg1 & 0xFFFF;
		local13.a(14, (float) (local19 * this.aClass13_Sub3_23.anInt9736 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(60) float local60 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local13.a(15, local30, 0.0F, 0.0F, 0.0F);
		local13.b(4, (float) local34, 0.0F, 0.0F, 0.0F);
		local13.b(5, local60, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)V")
	@Override
	public void method8640() {
		if (!this.aBoolean500) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass13_Sub3_Sub2_5.anIDirect3DDevice1;
		@Pc(19) Class51_Sub2 local19 = this.aClass13_Sub3_Sub2_5.method8213();
		@Pc(24) Class51_Sub2 local24 = this.aClass13_Sub3_Sub2_5.method8289();
		local14.a(0, local24.method3231(Static421.aFloatArray61));
		local14.a(4, local19.method3246(Static421.aFloatArray61));
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IILclient!fe;)V")
	@Override
	public void method8645(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1) {
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8632(@OriginalArg(1) boolean arg0) {
		@Pc(4) Interface19 local4 = this.aClass13_Sub3_23.method8190();
		if (!this.aBoolean499 || local4 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass13_Sub3_Sub2_5.anIDirect3DDevice1;
		this.aClass13_Sub3_Sub2_5.method8318(this.anIDirect3DVertexShader2);
		this.aClass13_Sub3_Sub2_5.method8312(this.anIDirect3DPixelShader1);
		this.aClass13_Sub3_23.method8230(1);
		this.aClass13_Sub3_23.method8234(local4);
		this.aClass13_Sub3_23.method8230(0);
		this.aClass13_Sub3_23.method8234(this.aClass334_6.anInterface1_2);
		this.aBoolean500 = true;
		this.method8640();
		this.method8639();
		this.method8636();
		this.method8635();
		local14.b(1, -this.aClass13_Sub3_23.aFloatArray91[0], -this.aClass13_Sub3_23.aFloatArray91[1], -this.aClass13_Sub3_23.aFloatArray91[2], 0.0F);
		local14.b(2, this.aClass13_Sub3_23.aFloat199, this.aClass13_Sub3_23.aFloat203, this.aClass13_Sub3_23.aFloat193, 1.0F);
		local14.b(3, Math.abs(this.aClass13_Sub3_23.aFloatArray91[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	@Override
	public void method8634() {
		if (this.aBoolean500) {
			@Pc(6) IDirect3DDevice local6 = this.aClass13_Sub3_Sub2_5.anIDirect3DDevice1;
			@Pc(13) Class51_Sub2 local13 = this.aClass13_Sub3_Sub2_5.method8289();
			local6.a(0, local13.method3231(Static421.aFloatArray61));
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)V")
	@Override
	public void method8642() {
		if (!this.aBoolean500) {
			return;
		}
		this.aClass13_Sub3_Sub2_5.method8318((IDirect3DVertexShader) null);
		this.aClass13_Sub3_Sub2_5.method8312((IDirect3DPixelShader) null);
		this.aClass13_Sub3_23.method8230(1);
		this.aClass13_Sub3_23.method8234((Interface6) null);
		this.aClass13_Sub3_23.method8230(0);
		this.aClass13_Sub3_23.method8234((Interface6) null);
		this.aBoolean500 = false;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8637(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
	@Override
	public void method8635() {
		if (!this.aBoolean500) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass13_Sub3_Sub2_5.anIDirect3DDevice1;
		if (this.aClass13_Sub3_23.anInt9726 > 0) {
			@Pc(23) float local23 = this.aClass13_Sub3_23.aFloat196;
			@Pc(27) float local27 = this.aClass13_Sub3_23.aFloat192;
			local12.a(16, local23, 1.0F / (local23 - local27), 0.0F, 0.0F);
		} else {
			local12.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local12.b(0, (float) (this.aClass13_Sub3_23.anInt9743 >> 16 & 0xFF) / 255.0F, (float) (this.aClass13_Sub3_23.anInt9743 >> 8 & 0xFF) / 255.0F, (float) (this.aClass13_Sub3_23.anInt9743 & 0xFF) / 255.0F, 0.0F);
	}
}
