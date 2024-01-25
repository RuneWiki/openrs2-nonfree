import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!cca", name = "n", descriptor = "Z")
	private boolean aBoolean145;

	@OriginalMember(owner = "client!cca", name = "p", descriptor = "Lclient!oc;")
	private final Class270 aClass270_2;

	@OriginalMember(owner = "client!cca", name = "m", descriptor = "Lclient!wu;")
	private final Class145_Sub1_Sub2 aClass145_Sub1_Sub2_3;

	@OriginalMember(owner = "client!cca", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!cca", name = "k", descriptor = "Z")
	private final boolean aBoolean144;

	@OriginalMember(owner = "client!cca", name = "l", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!wu;Lclient!nca;Lclient!oc;)V")
	public Class26_Sub2(@OriginalArg(0) Class145_Sub1_Sub2 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class270 arg2) {
		super(arg0);
		this.aClass270_2 = arg2;
		this.aClass145_Sub1_Sub2_3 = arg0;
		if (arg1 != null && this.aClass145_Sub1_21.aBoolean958 && this.aClass145_Sub1_21.aBoolean949 && (this.aClass145_Sub1_Sub2_3.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass145_Sub1_Sub2_3.anIDirect3DDevice1.a(arg1.method6104("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass145_Sub1_Sub2_3.anIDirect3DDevice1.b(arg1.method6104("dx", "environment_mapped_water_f"));
			this.aBoolean144 = this.anIDirect3DVertexShader2 != null && this.anIDirect3DPixelShader1 != null && this.aClass270_2.method6536();
		} else {
			this.anIDirect3DVertexShader2 = null;
			this.aBoolean144 = false;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7998(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "(Z)V")
	@Override
	public void method8008() {
		if (this.aBoolean145) {
			@Pc(8) IDirect3DDevice local8 = this.aClass145_Sub1_Sub2_3.anIDirect3DDevice1;
			@Pc(13) Class86_Sub2 local13 = this.aClass145_Sub1_21.method9756();
			local8.SetVertexShaderConstantF(12, local13.method2725(Static74.aFloatArray8), 2);
		}
	}

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "(I)V")
	@Override
	public void method8002() {
		if (this.aBoolean145) {
			@Pc(17) IDirect3DDevice local17 = this.aClass145_Sub1_Sub2_3.anIDirect3DDevice1;
			@Pc(24) Class86_Sub2 local24 = this.aClass145_Sub1_Sub2_3.method9741();
			local17.a(0, local24.method2714(Static74.aFloatArray8));
		}
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(Z)V")
	@Override
	public void method8000() {
		if (!this.aBoolean145) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass145_Sub1_Sub2_3.anIDirect3DDevice1;
		if (this.aClass145_Sub1_21.anInt11261 > 0) {
			@Pc(15) float local15 = this.aClass145_Sub1_21.aFloat183;
			@Pc(19) float local19 = this.aClass145_Sub1_21.aFloat192;
			local6.b(16, local15, 1.0F / (local15 - local19), 0.0F, 0.0F);
		} else {
			local6.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local6.a(0, (float) (this.aClass145_Sub1_21.anInt11257 >> 16 & 0xFF) / 255.0F, (float) (this.aClass145_Sub1_21.anInt11257 >> 8 & 0xFF) / 255.0F, (float) (this.aClass145_Sub1_21.anInt11257 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
	@Override
	public void method7999() {
		if (this.aBoolean145) {
			@Pc(18) IDirect3DDevice local18 = this.aClass145_Sub1_Sub2_3.anIDirect3DDevice1;
			local18.a(8, this.aClass145_Sub1_21.method9807(Static74.aFloatArray8));
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8006(@OriginalArg(1) boolean arg0) {
		@Pc(4) Interface18 local4 = this.aClass145_Sub1_21.method9785();
		if (!this.aBoolean144 || local4 == null) {
			return;
		}
		@Pc(25) IDirect3DDevice local25 = this.aClass145_Sub1_Sub2_3.anIDirect3DDevice1;
		this.aClass145_Sub1_Sub2_3.method9864(this.anIDirect3DVertexShader2);
		this.aClass145_Sub1_Sub2_3.method9856(this.anIDirect3DPixelShader1);
		this.aClass145_Sub1_21.method9745(1);
		this.aClass145_Sub1_21.method9754(local4);
		this.aClass145_Sub1_21.method9745(0);
		this.aClass145_Sub1_21.method9754(this.aClass270_2.anInterface7_2);
		this.aBoolean145 = true;
		this.method8005();
		this.method8008();
		this.method7999();
		this.method8000();
		local25.a(1, -this.aClass145_Sub1_21.aFloatArray74[0], -this.aClass145_Sub1_21.aFloatArray74[1], -this.aClass145_Sub1_21.aFloatArray74[2], 0.0F);
		local25.a(2, this.aClass145_Sub1_21.aFloat181, this.aClass145_Sub1_21.aFloat188, this.aClass145_Sub1_21.aFloat184, 1.0F);
		local25.a(3, Math.abs(this.aClass145_Sub1_21.aFloatArray74[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "(Z)V")
	@Override
	public void method8005() {
		if (!this.aBoolean145) {
			return;
		}
		@Pc(16) IDirect3DDevice local16 = this.aClass145_Sub1_Sub2_3.anIDirect3DDevice1;
		@Pc(21) Class86_Sub2 local21 = this.aClass145_Sub1_Sub2_3.method9721();
		@Pc(26) Class86_Sub2 local26 = this.aClass145_Sub1_Sub2_3.method9741();
		local16.a(0, local26.method2714(Static74.aFloatArray8));
		local16.a(4, local21.method2716(Static74.aFloatArray8));
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!iba;BI)V")
	@Override
	public void method8004(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(Z)V")
	@Override
	public void method8009() {
		if (!this.aBoolean145) {
			return;
		}
		this.aClass145_Sub1_Sub2_3.method9864((IDirect3DVertexShader) null);
		this.aClass145_Sub1_Sub2_3.method9856((IDirect3DPixelShader) null);
		this.aClass145_Sub1_21.method9745(1);
		this.aClass145_Sub1_21.method9754((Interface9) null);
		this.aClass145_Sub1_21.method9745(0);
		this.aClass145_Sub1_21.method9754((Interface9) null);
		this.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8001() {
		return this.aBoolean144;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)V")
	@Override
	public void method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean145) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass145_Sub1_Sub2_3.anIDirect3DDevice1;
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		local6.b(14, (float) (local12 * this.aClass145_Sub1_21.anInt11263 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local6.b(15, local23, 0.0F, 0.0F, 0.0F);
		local6.a(4, (float) local27, 0.0F, 0.0F, 0.0F);
		local6.a(5, local36, 0.0F, 0.0F, 0.0F);
	}
}
