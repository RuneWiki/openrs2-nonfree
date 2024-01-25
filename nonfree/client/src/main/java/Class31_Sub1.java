import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "Z")
	private boolean aBoolean75;

	@OriginalMember(owner = "client!bfa", name = "r", descriptor = "Lclient!ta;")
	private final Class137_Sub1_Sub2 aClass137_Sub1_Sub2_2;

	@OriginalMember(owner = "client!bfa", name = "n", descriptor = "Lclient!ui;")
	private final Class353 aClass353_1;

	@OriginalMember(owner = "client!bfa", name = "m", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!bfa", name = "q", descriptor = "Z")
	private final boolean aBoolean76;

	@OriginalMember(owner = "client!bfa", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lclient!ta;Lclient!wia;Lclient!ui;)V")
	public Class31_Sub1(@OriginalArg(0) Class137_Sub1_Sub2 arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Class353 arg2) {
		super(arg0);
		this.aClass137_Sub1_Sub2_2 = arg0;
		this.aClass353_1 = arg2;
		if (arg1 != null && this.aClass137_Sub1_22.aBoolean682 && this.aClass137_Sub1_22.aBoolean673 && (this.aClass137_Sub1_Sub2_2.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass137_Sub1_Sub2_2.anIDirect3DDevice1.b(arg1.method9219("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass137_Sub1_Sub2_2.anIDirect3DDevice1.a(arg1.method9219("environment_mapped_water_f", "dx"));
			this.aBoolean76 = this.anIDirect3DVertexShader1 != null && this.anIDirect3DPixelShader1 != null && this.aClass353_1.method8489();
		} else {
			this.anIDirect3DPixelShader1 = null;
			this.aBoolean76 = false;
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "(Z)V")
	@Override
	public void method8597() {
		if (!this.aBoolean75) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass137_Sub1_Sub2_2.anIDirect3DDevice1;
		if (this.aClass137_Sub1_22.anInt9727 > 0) {
			@Pc(18) float local18 = this.aClass137_Sub1_22.aFloat248;
			@Pc(22) float local22 = this.aClass137_Sub1_22.aFloat244;
			local7.b(16, local18, 1.0F / (local18 - local22), 0.0F, 0.0F);
		} else {
			local7.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local7.a(0, (float) (this.aClass137_Sub1_22.anInt9723 >> 16 & 0xFF) / 255.0F, (float) (this.aClass137_Sub1_22.anInt9723 >> 8 & 0xFF) / 255.0F, (float) (this.aClass137_Sub1_22.anInt9723 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8592(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8593() {
		return this.aBoolean76;
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(B)V")
	@Override
	public void method8598() {
		if (this.aBoolean75) {
			@Pc(14) IDirect3DDevice local14 = this.aClass137_Sub1_Sub2_2.anIDirect3DDevice1;
			local14.a(8, this.aClass137_Sub1_22.method8001(Static39.aFloatArray6));
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method8589() {
		if (this.aBoolean75) {
			@Pc(7) IDirect3DDevice local7 = this.aClass137_Sub1_Sub2_2.anIDirect3DDevice1;
			@Pc(12) Class26_Sub1 local12 = this.aClass137_Sub1_Sub2_2.method8016();
			local7.a(0, local12.method780(Static39.aFloatArray6));
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8595(@OriginalArg(1) boolean arg0) {
		@Pc(13) Interface16 local13 = this.aClass137_Sub1_22.method8046();
		if (!this.aBoolean76 || local13 == null) {
			return;
		}
		@Pc(23) IDirect3DDevice local23 = this.aClass137_Sub1_Sub2_2.anIDirect3DDevice1;
		this.aClass137_Sub1_Sub2_2.method8098(this.anIDirect3DVertexShader1);
		this.aClass137_Sub1_Sub2_2.method8089(this.anIDirect3DPixelShader1);
		this.aClass137_Sub1_22.method8081(1);
		this.aClass137_Sub1_22.method8007(local13);
		this.aClass137_Sub1_22.method8081(0);
		this.aClass137_Sub1_22.method8007(this.aClass353_1.anInterface9_2);
		this.aBoolean75 = true;
		this.method8586();
		this.method8596();
		this.method8598();
		this.method8597();
		local23.a(1, -this.aClass137_Sub1_22.aFloatArray72[0], -this.aClass137_Sub1_22.aFloatArray72[1], -this.aClass137_Sub1_22.aFloatArray72[2], 0.0F);
		local23.a(2, this.aClass137_Sub1_22.aFloat250, this.aClass137_Sub1_22.aFloat245, this.aClass137_Sub1_22.aFloat246, 1.0F);
		local23.a(3, Math.abs(this.aClass137_Sub1_22.aFloatArray72[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BILclient!kja;)V")
	@Override
	public void method8588(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8591() {
		if (!this.aBoolean75) {
			return;
		}
		this.aClass137_Sub1_Sub2_2.method8098((IDirect3DVertexShader) null);
		this.aClass137_Sub1_Sub2_2.method8089((IDirect3DPixelShader) null);
		this.aClass137_Sub1_22.method8081(1);
		this.aClass137_Sub1_22.method8007((Interface15) null);
		this.aClass137_Sub1_22.method8081(0);
		this.aClass137_Sub1_22.method8007((Interface15) null);
		this.aBoolean75 = false;
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(Z)V")
	@Override
	public void method8596() {
		if (this.aBoolean75) {
			@Pc(6) IDirect3DDevice local6 = this.aClass137_Sub1_Sub2_2.anIDirect3DDevice1;
			@Pc(11) Class26_Sub1 local11 = this.aClass137_Sub1_22.method8088();
			local6.SetVertexShaderConstantF(12, local11.method785(Static39.aFloatArray6), 2);
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V")
	@Override
	public void method8586() {
		if (!this.aBoolean75) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass137_Sub1_Sub2_2.anIDirect3DDevice1;
		@Pc(11) Class26_Sub1 local11 = this.aClass137_Sub1_Sub2_2.method8076();
		@Pc(16) Class26_Sub1 local16 = this.aClass137_Sub1_Sub2_2.method8016();
		local6.a(0, local16.method780(Static39.aFloatArray6));
		local6.a(4, local11.method796(Static39.aFloatArray6));
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean75) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass137_Sub1_Sub2_2.anIDirect3DDevice1;
		@Pc(13) int local13 = 0x1 << (arg0 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg1 & 0xFFFF;
		local7.b(14, (float) (local13 * this.aClass137_Sub1_22.anInt9719 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(54) float local54 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local7.b(15, local24, 0.0F, 0.0F, 0.0F);
		local7.a(4, (float) local28, 0.0F, 0.0F, 0.0F);
		local7.a(5, local54, 0.0F, 0.0F, 0.0F);
	}
}
