import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class38_Sub8 extends Class38 {

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "Z")
	private boolean aBoolean549;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "Lclient!vt;")
	private final Class348 aClass348_8;

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "Lclient!kaa;")
	private final Class44_Sub2_Sub2 aClass44_Sub2_Sub2_8;

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "Z")
	private final boolean aBoolean550;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!kaa;Lclient!jn;Lclient!vt;)V")
	public Class38_Sub8(@OriginalArg(0) Class44_Sub2_Sub2 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class348 arg2) {
		super(arg0);
		this.aClass348_8 = arg2;
		this.aClass44_Sub2_Sub2_8 = arg0;
		if (arg1 != null && this.aClass44_Sub2_21.aBoolean354 && this.aClass44_Sub2_21.aBoolean345 && (this.aClass44_Sub2_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader7 = this.aClass44_Sub2_Sub2_8.anIDirect3DDevice1.b(arg1.method3972("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass44_Sub2_Sub2_8.anIDirect3DDevice1.a(arg1.method3972("dx", "environment_mapped_water_f"));
			this.aBoolean550 = this.anIDirect3DVertexShader7 != null && this.anIDirect3DPixelShader1 != null && this.aClass348_8.method8146();
		} else {
			this.anIDirect3DPixelShader1 = null;
			this.aBoolean550 = false;
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
	@Override
	public void method7429() {
		if (!this.aBoolean549) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass44_Sub2_Sub2_8.anIDirect3DDevice1;
		if (this.aClass44_Sub2_21.anInt4943 <= 0) {
			local7.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(25) float local25 = this.aClass44_Sub2_21.aFloat149;
			@Pc(29) float local29 = this.aClass44_Sub2_21.aFloat152;
			local7.b(16, local25, 1.0F / (local25 - local29), 0.0F, 0.0F);
		}
		local7.a(0, (float) (this.aClass44_Sub2_21.anInt4950 >> 16 & 0xFF) / 255.0F, (float) (this.aClass44_Sub2_21.anInt4950 >> 8 & 0xFF) / 255.0F, (float) (this.aClass44_Sub2_21.anInt4950 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!oa;B)V")
	@Override
	public void method7440(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
	@Override
	public void method7438() {
		if (this.aBoolean549) {
			@Pc(11) IDirect3DDevice local11 = this.aClass44_Sub2_Sub2_8.anIDirect3DDevice1;
			local11.a(8, this.aClass44_Sub2_21.method4342(Static426.aFloatArray56));
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean549) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass44_Sub2_Sub2_8.anIDirect3DDevice1;
		@Pc(19) int local19 = 0x1 << (arg0 & 0x3);
		@Pc(30) float local30 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(34) int local34 = arg1 & 0xFFFF;
		local13.b(14, (float) (local19 * this.aClass44_Sub2_21.anInt4957 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(60) float local60 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local13.b(15, local30, 0.0F, 0.0F, 0.0F);
		local13.a(4, (float) local34, 0.0F, 0.0F, 0.0F);
		local13.a(5, local60, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7427() {
		return this.aBoolean550;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7439(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface13 local8 = this.aClass44_Sub2_21.method4352();
		if (!this.aBoolean550 || local8 == null) {
			return;
		}
		@Pc(18) IDirect3DDevice local18 = this.aClass44_Sub2_Sub2_8.anIDirect3DDevice1;
		local18.SetVertexShader(this.anIDirect3DVertexShader7);
		local18.SetPixelShader(this.anIDirect3DPixelShader1);
		this.aClass44_Sub2_21.method4267(1);
		this.aClass44_Sub2_21.method4265(local8);
		this.aClass44_Sub2_21.method4267(0);
		this.aClass44_Sub2_21.method4265(this.aClass348_8.anInterface4_1);
		this.aBoolean549 = true;
		this.method7443();
		this.method7441();
		this.method7438();
		this.method7429();
		local18.a(1, -this.aClass44_Sub2_21.aFloatArray35[0], -this.aClass44_Sub2_21.aFloatArray35[1], -this.aClass44_Sub2_21.aFloatArray35[2], 0.0F);
		local18.a(2, this.aClass44_Sub2_21.aFloat142, this.aClass44_Sub2_21.aFloat156, this.aClass44_Sub2_21.aFloat150, 1.0F);
		local18.a(3, Math.abs(this.aClass44_Sub2_21.aFloatArray35[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
	@Override
	public void method7434() {
		if (!this.aBoolean549) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass44_Sub2_Sub2_8.anIDirect3DDevice1;
		local7.SetVertexShader(null);
		local7.SetPixelShader(null);
		this.aClass44_Sub2_21.method4267(1);
		this.aClass44_Sub2_21.method4265(null);
		this.aClass44_Sub2_21.method4267(0);
		this.aClass44_Sub2_21.method4265(null);
		this.aBoolean549 = false;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7431(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
	@Override
	public void method7443() {
		if (!this.aBoolean549) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass44_Sub2_Sub2_8.anIDirect3DDevice1;
		@Pc(18) Class8_Sub3 local18 = this.aClass44_Sub2_Sub2_8.method4304();
		@Pc(23) Class8_Sub3 local23 = this.aClass44_Sub2_Sub2_8.method4322();
		local13.a(0, local23.method1573(Static426.aFloatArray56));
		local13.a(4, local18.method1578(Static426.aFloatArray56));
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
	@Override
	public void method7441() {
		if (this.aBoolean549) {
			@Pc(7) IDirect3DDevice local7 = this.aClass44_Sub2_Sub2_8.anIDirect3DDevice1;
			@Pc(12) Class8_Sub3 local12 = this.aClass44_Sub2_21.method4254();
			local7.SetVertexShaderConstantF(12, local12.method1561(Static426.aFloatArray56), 2);
		}
	}

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)V")
	@Override
	public void method7442() {
		if (this.aBoolean549) {
			@Pc(11) IDirect3DDevice local11 = this.aClass44_Sub2_Sub2_8.anIDirect3DDevice1;
			@Pc(16) Class8_Sub3 local16 = this.aClass44_Sub2_Sub2_8.method4322();
			local11.a(0, local16.method1573(Static426.aFloatArray56));
		}
	}
}
