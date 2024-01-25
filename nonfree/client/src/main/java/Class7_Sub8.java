import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mha")
public final class Class7_Sub8 extends Class7 {

	@OriginalMember(owner = "client!mha", name = "q", descriptor = "Z")
	private boolean aBoolean429;

	@OriginalMember(owner = "client!mha", name = "m", descriptor = "Lclient!fi;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_9;

	@OriginalMember(owner = "client!mha", name = "o", descriptor = "Lclient!pba;")
	private final Class249 aClass249_6;

	@OriginalMember(owner = "client!mha", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!mha", name = "l", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!mha", name = "p", descriptor = "Z")
	private final boolean aBoolean428;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lclient!fi;Lclient!vd;Lclient!pba;)V")
	public Class7_Sub8(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) Class249 arg2) {
		super(arg0);
		this.aClass100_Sub1_Sub1_9 = arg0;
		this.aClass249_6 = arg2;
		if (arg1 != null && this.aClass100_Sub1_22.aBoolean479 && this.aClass100_Sub1_22.aBoolean474 && (this.aClass100_Sub1_Sub1_9.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1.b(arg1.method8426("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1.a(arg1.method8426("dx", "environment_mapped_water_f"));
			this.aBoolean428 = this.anIDirect3DVertexShader8 != null && this.anIDirect3DPixelShader1 != null && this.aClass249_6.method6663();
		} else {
			this.aBoolean428 = false;
			this.anIDirect3DVertexShader8 = null;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(Z)V")
	@Override
	public void method7184() {
		if (!this.aBoolean429) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1;
		@Pc(15) Class154_Sub2 local15 = this.aClass100_Sub1_Sub1_9.method6086();
		@Pc(20) Class154_Sub2 local20 = this.aClass100_Sub1_Sub1_9.method6077();
		local10.a(0, local20.method4538(Static346.aFloatArray53));
		local10.a(4, local15.method4523(Static346.aFloatArray53));
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(B)V")
	@Override
	public void method7185() {
		if (this.aBoolean429) {
			@Pc(7) IDirect3DDevice local7 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1;
			@Pc(14) Class154_Sub2 local14 = this.aClass100_Sub1_Sub1_9.method6077();
			local7.a(0, local14.method4538(Static346.aFloatArray53));
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7195(@OriginalArg(1) boolean arg0) {
		@Pc(9) Interface19 local9 = this.aClass100_Sub1_22.method6042();
		if (!this.aBoolean428 || local9 == null) {
			return;
		}
		@Pc(20) IDirect3DDevice local20 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1;
		this.aClass100_Sub1_Sub1_9.method2995(this.anIDirect3DVertexShader8);
		this.aClass100_Sub1_Sub1_9.method2991(this.anIDirect3DPixelShader1);
		this.aClass100_Sub1_22.method6114(1);
		this.aClass100_Sub1_22.method6033(local9);
		this.aClass100_Sub1_22.method6114(0);
		this.aClass100_Sub1_22.method6033(this.aClass249_6.anInterface15_2);
		this.aBoolean429 = true;
		this.method7184();
		this.method7196();
		this.method7182();
		this.method7190();
		local20.a(1, -this.aClass100_Sub1_22.aFloatArray60[0], -this.aClass100_Sub1_22.aFloatArray60[1], -this.aClass100_Sub1_22.aFloatArray60[2], 0.0F);
		local20.a(2, this.aClass100_Sub1_22.aFloat130, this.aClass100_Sub1_22.aFloat138, this.aClass100_Sub1_22.aFloat127, 1.0F);
		local20.a(3, Math.abs(this.aClass100_Sub1_22.aFloatArray60[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(BII)V")
	@Override
	public void method7192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean429) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1;
		@Pc(13) int local13 = 0x1 << (arg0 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg1 & 0xFFFF;
		@Pc(37) float local37 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local7.b(14, (float) (local13 * this.aClass100_Sub1_22.anInt7125 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local7.b(15, local24, 0.0F, 0.0F, 0.0F);
		local7.a(4, (float) local28, 0.0F, 0.0F, 0.0F);
		local7.a(5, local37, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(Z)V")
	@Override
	public void method7182() {
		if (this.aBoolean429) {
			@Pc(10) IDirect3DDevice local10 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1;
			local10.a(8, this.aClass100_Sub1_22.method6111(Static346.aFloatArray53));
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7187(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7194() {
		return this.aBoolean428;
	}

	@OriginalMember(owner = "client!mha", name = "e", descriptor = "(Z)V")
	@Override
	public void method7196() {
		if (this.aBoolean429) {
			@Pc(6) IDirect3DDevice local6 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1;
			@Pc(11) Class154_Sub2 local11 = this.aClass100_Sub1_22.method6089();
			local6.SetVertexShaderConstantF(12, local11.method4530(Static346.aFloatArray53), 2);
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lclient!bca;II)V")
	@Override
	public void method7186(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "(I)V")
	@Override
	public void method7197() {
		if (!this.aBoolean429) {
			return;
		}
		this.aClass100_Sub1_Sub1_9.method2995((IDirect3DVertexShader) null);
		this.aClass100_Sub1_Sub1_9.method2991((IDirect3DPixelShader) null);
		this.aClass100_Sub1_22.method6114(1);
		this.aClass100_Sub1_22.method6033((Interface1) null);
		this.aClass100_Sub1_22.method6114(0);
		this.aClass100_Sub1_22.method6033((Interface1) null);
		this.aBoolean429 = false;
	}

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "(Z)V")
	@Override
	public void method7190() {
		if (!this.aBoolean429) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1;
		if (this.aClass100_Sub1_22.anInt7148 <= 0) {
			local7.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(25) float local25 = this.aClass100_Sub1_22.aFloat135;
			@Pc(29) float local29 = this.aClass100_Sub1_22.aFloat137;
			local7.b(16, local25, 1.0F / (local25 - local29), 0.0F, 0.0F);
		}
		local7.a(0, (float) (this.aClass100_Sub1_22.anInt7158 >> 16 & 0xFF) / 255.0F, (float) (this.aClass100_Sub1_22.anInt7158 >> 8 & 0xFF) / 255.0F, (float) (this.aClass100_Sub1_22.anInt7158 & 0xFF) / 255.0F, 0.0F);
	}
}
