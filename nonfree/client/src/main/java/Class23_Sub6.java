import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class23_Sub6 extends Class23 {

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Z")
	private boolean aBoolean360;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Lclient!os;")
	private final Class75_Sub1_Sub2 aClass75_Sub1_Sub2_3;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "Lclient!jd;")
	private final Class184 aClass184_4;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Z")
	private final boolean aBoolean359;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!os;Lclient!lga;Lclient!jd;)V")
	public Class23_Sub6(@OriginalArg(0) Class75_Sub1_Sub2 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class184 arg2) {
		super(arg0);
		this.aClass75_Sub1_Sub2_3 = arg0;
		this.aClass184_4 = arg2;
		if (arg1 != null && this.aClass75_Sub1_22.aBoolean561 && this.aClass75_Sub1_22.aBoolean569 && (this.aClass75_Sub1_Sub2_3.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass75_Sub1_Sub2_3.anIDirect3DDevice1.a(arg1.method5284("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass75_Sub1_Sub2_3.anIDirect3DDevice1.b(arg1.method5284("dx", "environment_mapped_water_f"));
			this.aBoolean359 = this.anIDirect3DVertexShader6 != null && this.anIDirect3DPixelShader1 != null && this.aClass184_4.method4635();
		} else {
			this.aBoolean359 = false;
			this.anIDirect3DVertexShader6 = null;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V")
	@Override
	public void method8170() {
		if (this.aBoolean360) {
			@Pc(17) IDirect3DDevice local17 = this.aClass75_Sub1_Sub2_3.anIDirect3DDevice1;
			@Pc(22) Class109_Sub3 local22 = this.aClass75_Sub1_22.method6836();
			local17.SetVertexShaderConstantF(12, local22.method4360(Static242.aFloatArray46), 2);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8166(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	@Override
	public void method8169() {
		if (!this.aBoolean360) {
			return;
		}
		@Pc(16) IDirect3DDevice local16 = this.aClass75_Sub1_Sub2_3.anIDirect3DDevice1;
		@Pc(21) Class109_Sub3 local21 = this.aClass75_Sub1_Sub2_3.method6722();
		@Pc(26) Class109_Sub3 local26 = this.aClass75_Sub1_Sub2_3.method6848();
		local16.a(0, local26.method4357(Static242.aFloatArray46));
		local16.a(4, local21.method4356(Static242.aFloatArray46));
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	@Override
	public void method8168() {
		if (this.aBoolean360) {
			@Pc(6) IDirect3DDevice local6 = this.aClass75_Sub1_Sub2_3.anIDirect3DDevice1;
			local6.a(8, this.aClass75_Sub1_22.method6800(Static242.aFloatArray46));
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8164() {
		return this.aBoolean359;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBLclient!ah;)V")
	@Override
	public void method8162(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1) {
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	@Override
	public void method8167() {
		if (!this.aBoolean360) {
			return;
		}
		this.aClass75_Sub1_Sub2_3.method6859((IDirect3DVertexShader) null);
		this.aClass75_Sub1_Sub2_3.method6865((IDirect3DPixelShader) null);
		this.aClass75_Sub1_22.method6805(1);
		this.aClass75_Sub1_22.method6814((Interface1) null);
		this.aClass75_Sub1_22.method6805(0);
		this.aClass75_Sub1_22.method6814((Interface1) null);
		this.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
	@Override
	public void method8165() {
		if (this.aBoolean360) {
			@Pc(16) IDirect3DDevice local16 = this.aClass75_Sub1_Sub2_3.anIDirect3DDevice1;
			@Pc(21) Class109_Sub3 local21 = this.aClass75_Sub1_Sub2_3.method6848();
			local16.a(0, local21.method4357(Static242.aFloatArray46));
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean360) {
			return;
		}
		@Pc(17) IDirect3DDevice local17 = this.aClass75_Sub1_Sub2_3.anIDirect3DDevice1;
		@Pc(23) int local23 = 0x1 << (arg0 & 0x3);
		@Pc(34) float local34 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(38) int local38 = arg1 & 0xFFFF;
		local17.a(14, (float) (this.aClass75_Sub1_22.anInt7673 * local23 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(64) float local64 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local17.a(15, local34, 0.0F, 0.0F, 0.0F);
		local17.b(4, (float) local38, 0.0F, 0.0F, 0.0F);
		local17.b(5, local64, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
	@Override
	public void method8171() {
		if (!this.aBoolean360) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass75_Sub1_Sub2_3.anIDirect3DDevice1;
		if (this.aClass75_Sub1_22.anInt7657 > 0) {
			@Pc(22) float local22 = this.aClass75_Sub1_22.aFloat155;
			@Pc(26) float local26 = this.aClass75_Sub1_22.aFloat142;
			local14.a(16, local22, 1.0F / (local22 - local26), 0.0F, 0.0F);
		} else {
			local14.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local14.b(0, (float) (this.aClass75_Sub1_22.anInt7670 >> 16 & 0xFF) / 255.0F, (float) (this.aClass75_Sub1_22.anInt7670 >> 8 & 0xFF) / 255.0F, (float) (this.aClass75_Sub1_22.anInt7670 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8161(@OriginalArg(1) boolean arg0) {
		@Pc(12) Interface19 local12 = this.aClass75_Sub1_22.method6826();
		if (!this.aBoolean359 || local12 == null) {
			return;
		}
		@Pc(26) IDirect3DDevice local26 = this.aClass75_Sub1_Sub2_3.anIDirect3DDevice1;
		this.aClass75_Sub1_Sub2_3.method6859(this.anIDirect3DVertexShader6);
		this.aClass75_Sub1_Sub2_3.method6865(this.anIDirect3DPixelShader1);
		this.aClass75_Sub1_22.method6805(1);
		this.aClass75_Sub1_22.method6814(local12);
		this.aClass75_Sub1_22.method6805(0);
		this.aClass75_Sub1_22.method6814(this.aClass184_4.anInterface13_2);
		this.aBoolean360 = true;
		this.method8169();
		this.method8170();
		this.method8168();
		this.method8171();
		local26.b(1, -this.aClass75_Sub1_22.aFloatArray62[0], -this.aClass75_Sub1_22.aFloatArray62[1], -this.aClass75_Sub1_22.aFloatArray62[2], 0.0F);
		local26.b(2, this.aClass75_Sub1_22.aFloat153, this.aClass75_Sub1_22.aFloat147, this.aClass75_Sub1_22.aFloat146, 1.0F);
		local26.b(3, Math.abs(this.aClass75_Sub1_22.aFloatArray62[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}
}
