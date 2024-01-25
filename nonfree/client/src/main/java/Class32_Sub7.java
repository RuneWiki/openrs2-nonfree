import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class32_Sub7 extends Class32 {

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "Z")
	private boolean aBoolean549;

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "Lclient!to;")
	private final Class31_Sub1_Sub2 aClass31_Sub1_Sub2_8;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Lclient!tj;")
	private final Class318 aClass318_6;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Z")
	private final boolean aBoolean550;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!to;Lclient!ri;Lclient!tj;)V")
	public Class32_Sub7(@OriginalArg(0) Class31_Sub1_Sub2 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class318 arg2) {
		super(arg0);
		this.aClass31_Sub1_Sub2_8 = arg0;
		this.aClass318_6 = arg2;
		if (arg1 != null && this.aClass31_Sub1_22.aBoolean612 && this.aClass31_Sub1_22.aBoolean614 && (this.aClass31_Sub1_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader7 = this.aClass31_Sub1_Sub2_8.anIDirect3DDevice1.b(arg1.method6328("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass31_Sub1_Sub2_8.anIDirect3DDevice1.a(arg1.method6328("dx", "environment_mapped_water_f"));
			this.aBoolean550 = this.anIDirect3DVertexShader7 != null && this.anIDirect3DPixelShader1 != null && this.aClass318_6.method6941();
		} else {
			this.anIDirect3DVertexShader7 = null;
			this.anIDirect3DPixelShader1 = null;
			this.aBoolean550 = false;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7459(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	@Override
	public void method7447() {
		if (this.aBoolean549) {
			@Pc(6) IDirect3DDevice local6 = this.aClass31_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(11) Class42_Sub3 local11 = this.aClass31_Sub1_Sub2_8.method7182();
			local6.a(0, local11.method7540(Static453.aFloatArray56));
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7454() {
		return this.aBoolean550;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
	@Override
	public void method7455() {
		if (this.aBoolean549) {
			@Pc(7) IDirect3DDevice local7 = this.aClass31_Sub1_Sub2_8.anIDirect3DDevice1;
			local7.a(8, this.aClass31_Sub1_22.method7110(Static453.aFloatArray56));
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZLclient!wq;)V")
	@Override
	public void method7453(@OriginalArg(0) int arg0, @OriginalArg(2) Interface24 arg1) {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7446(@OriginalArg(0) boolean arg0) {
		@Pc(4) Interface18 local4 = this.aClass31_Sub1_22.method7098();
		if (!this.aBoolean550 || local4 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass31_Sub1_Sub2_8.anIDirect3DDevice1;
		local15.SetVertexShader(this.anIDirect3DVertexShader7);
		local15.SetPixelShader(this.anIDirect3DPixelShader1);
		this.aClass31_Sub1_22.method7092(1);
		this.aClass31_Sub1_22.method7129(local4);
		this.aClass31_Sub1_22.method7092(0);
		this.aClass31_Sub1_22.method7129(this.aClass318_6.anInterface19_1);
		this.aBoolean549 = true;
		this.method7456();
		this.method7457();
		this.method7455();
		this.method7450();
		local15.b(1, -this.aClass31_Sub1_22.aFloatArray67[0], -this.aClass31_Sub1_22.aFloatArray67[1], -this.aClass31_Sub1_22.aFloatArray67[2], 0.0F);
		local15.b(2, this.aClass31_Sub1_22.aFloat189, this.aClass31_Sub1_22.aFloat201, this.aClass31_Sub1_22.aFloat193, 1.0F);
		local15.b(3, Math.abs(this.aClass31_Sub1_22.aFloatArray67[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
	@Override
	public void method7460() {
		if (!this.aBoolean549) {
			return;
		}
		@Pc(16) IDirect3DDevice local16 = this.aClass31_Sub1_Sub2_8.anIDirect3DDevice1;
		local16.SetVertexShader(null);
		local16.SetPixelShader(null);
		this.aClass31_Sub1_22.method7092(1);
		this.aClass31_Sub1_22.method7129(null);
		this.aClass31_Sub1_22.method7092(0);
		this.aClass31_Sub1_22.method7129(null);
		this.aBoolean549 = false;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	@Override
	public void method7450() {
		if (!this.aBoolean549) {
			return;
		}
		@Pc(11) IDirect3DDevice local11 = this.aClass31_Sub1_Sub2_8.anIDirect3DDevice1;
		if (this.aClass31_Sub1_22.anInt9110 > 0) {
			@Pc(19) float local19 = this.aClass31_Sub1_22.aFloat203;
			@Pc(23) float local23 = this.aClass31_Sub1_22.aFloat198;
			local11.a(16, local19, 1.0F / (local19 - local23), 0.0F, 0.0F);
		} else {
			local11.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local11.b(0, (float) (this.aClass31_Sub1_22.anInt9133 >> 16 & 0xFF) / 255.0F, (float) (this.aClass31_Sub1_22.anInt9133 >> 8 & 0xFF) / 255.0F, (float) (this.aClass31_Sub1_22.anInt9133 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
		if (this.aBoolean549) {
			@Pc(13) IDirect3DDevice local13 = this.aClass31_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(18) Class42_Sub3 local18 = this.aClass31_Sub1_22.method7075();
			local13.SetVertexShaderConstantF(12, local18.method7535(Static453.aFloatArray56), 2);
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)V")
	@Override
	public void method7458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean549) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass31_Sub1_Sub2_8.anIDirect3DDevice1;
		@Pc(13) int local13 = 0x1 << (arg0 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg1 & 0xFFFF;
		@Pc(37) float local37 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local7.a(14, (float) (local13 * this.aClass31_Sub1_22.anInt9105 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local7.a(15, local24, 0.0F, 0.0F, 0.0F);
		local7.b(4, (float) local28, 0.0F, 0.0F, 0.0F);
		local7.b(5, local37, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
	@Override
	public void method7456() {
		if (!this.aBoolean549) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass31_Sub1_Sub2_8.anIDirect3DDevice1;
		@Pc(11) Class42_Sub3 local11 = this.aClass31_Sub1_Sub2_8.method7171();
		@Pc(16) Class42_Sub3 local16 = this.aClass31_Sub1_Sub2_8.method7182();
		local6.a(0, local16.method7540(Static453.aFloatArray56));
		local6.a(4, local11.method7530(Static453.aFloatArray56));
	}
}
