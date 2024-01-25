import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class34_Sub6 extends Class34 {

	@OriginalMember(owner = "client!j", name = "u", descriptor = "Z")
	private boolean aBoolean329;

	@OriginalMember(owner = "client!j", name = "r", descriptor = "Lclient!uk;")
	private final Class331 aClass331_4;

	@OriginalMember(owner = "client!j", name = "s", descriptor = "Lclient!tb;")
	private final Class134_Sub1_Sub2 aClass134_Sub1_Sub2_5;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "Z")
	private final boolean aBoolean328;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!tb;Lclient!pu;Lclient!uk;)V")
	public Class34_Sub6(@OriginalArg(0) Class134_Sub1_Sub2 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class331 arg2) {
		super(arg0);
		this.aClass331_4 = arg2;
		this.aClass134_Sub1_Sub2_5 = arg0;
		if (arg1 != null && this.aClass134_Sub1_21.aBoolean647 && this.aClass134_Sub1_21.aBoolean648 && (this.aClass134_Sub1_Sub2_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass134_Sub1_Sub2_5.anIDirect3DDevice1.a(arg1.method5706("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass134_Sub1_Sub2_5.anIDirect3DDevice1.b(arg1.method5706("environment_mapped_water_f", "dx"));
			this.aBoolean328 = this.anIDirect3DVertexShader1 != null && this.anIDirect3DPixelShader1 != null && this.aClass331_4.method7301();
		} else {
			this.anIDirect3DVertexShader1 = null;
			this.aBoolean328 = false;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7017() {
		return this.aBoolean328;
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
	@Override
	public void method7019() {
		if (!this.aBoolean329) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass134_Sub1_Sub2_5.anIDirect3DDevice1;
		if (this.aClass134_Sub1_21.anInt8430 <= 0) {
			local7.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(27) float local27 = this.aClass134_Sub1_21.aFloat187;
			@Pc(31) float local31 = this.aClass134_Sub1_21.aFloat201;
			local7.b(16, local27, 1.0F / (local27 - local31), 0.0F, 0.0F);
		}
		local7.a(0, (float) (this.aClass134_Sub1_21.anInt8460 >> 16 & 0xFF) / 255.0F, (float) (this.aClass134_Sub1_21.anInt8460 >> 8 & 0xFF) / 255.0F, (float) (this.aClass134_Sub1_21.anInt8460 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
	@Override
	public void method7018() {
		if (this.aBoolean329) {
			@Pc(6) IDirect3DDevice local6 = this.aClass134_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(11) Class113_Sub3 local11 = this.aClass134_Sub1_21.method6787();
			local6.SetVertexShaderConstantF(12, local11.method6069(Static231.aFloatArray26), 2);
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
	@Override
	public void method7015() {
		if (this.aBoolean329) {
			@Pc(6) IDirect3DDevice local6 = this.aClass134_Sub1_Sub2_5.anIDirect3DDevice1;
			local6.a(8, this.aClass134_Sub1_21.method6825(Static231.aFloatArray26));
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7016(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
	@Override
	public void method7008() {
		if (this.aBoolean329) {
			@Pc(13) IDirect3DDevice local13 = this.aClass134_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(20) Class113_Sub3 local20 = this.aClass134_Sub1_Sub2_5.method6786();
			local13.a(0, local20.method6055(Static231.aFloatArray26));
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	@Override
	public void method7004() {
		if (!this.aBoolean329) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass134_Sub1_Sub2_5.anIDirect3DDevice1;
		@Pc(13) Class113_Sub3 local13 = this.aClass134_Sub1_Sub2_5.method6847();
		@Pc(18) Class113_Sub3 local18 = this.aClass134_Sub1_Sub2_5.method6786();
		local6.a(0, local18.method6055(Static231.aFloatArray26));
		local6.a(4, local13.method6053(Static231.aFloatArray26));
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
	@Override
	public void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean329) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass134_Sub1_Sub2_5.anIDirect3DDevice1;
		@Pc(13) int local13 = 0x1 << (arg1 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg0 & 0xFFFF;
		local7.b(14, (float) (this.aClass134_Sub1_21.anInt8444 * local13 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(54) float local54 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		local7.b(15, local24, 0.0F, 0.0F, 0.0F);
		local7.a(4, (float) local28, 0.0F, 0.0F, 0.0F);
		local7.a(5, local54, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7009(@OriginalArg(0) boolean arg0) {
		@Pc(11) Interface8 local11 = this.aClass134_Sub1_21.method6802();
		if (!this.aBoolean328 || local11 == null) {
			return;
		}
		@Pc(21) IDirect3DDevice local21 = this.aClass134_Sub1_Sub2_5.anIDirect3DDevice1;
		local21.SetVertexShader(this.anIDirect3DVertexShader1);
		local21.SetPixelShader(this.anIDirect3DPixelShader1);
		this.aClass134_Sub1_21.method6788(1);
		this.aClass134_Sub1_21.method6766(local11);
		this.aClass134_Sub1_21.method6788(0);
		this.aClass134_Sub1_21.method6766(this.aClass331_4.anInterface11_1);
		this.aBoolean329 = true;
		this.method7004();
		this.method7018();
		this.method7015();
		this.method7019();
		local21.a(1, -this.aClass134_Sub1_21.aFloatArray47[0], -this.aClass134_Sub1_21.aFloatArray47[1], -this.aClass134_Sub1_21.aFloatArray47[2], 0.0F);
		local21.a(2, this.aClass134_Sub1_21.aFloat189, this.aClass134_Sub1_21.bf, this.aClass134_Sub1_21.aFloat195, 1.0F);
		local21.a(3, Math.abs(this.aClass134_Sub1_21.aFloatArray47[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	@Override
	public void method7006() {
		if (!this.aBoolean329) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass134_Sub1_Sub2_5.anIDirect3DDevice1;
		local7.SetVertexShader(null);
		local7.SetPixelShader(null);
		this.aClass134_Sub1_21.method6788(1);
		this.aClass134_Sub1_21.method6766(null);
		this.aClass134_Sub1_21.method6788(0);
		this.aClass134_Sub1_21.method6766(null);
		this.aBoolean329 = false;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!bb;II)V")
	@Override
	public void method7011(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
	}
}
