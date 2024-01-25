import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class72_Sub7 extends Class72 {

	@OriginalMember(owner = "client!oba", name = "p", descriptor = "Z")
	private boolean aBoolean469;

	@OriginalMember(owner = "client!oba", name = "q", descriptor = "Lclient!eda;")
	private final Class45_Sub2_Sub1 aClass45_Sub2_Sub1_4;

	@OriginalMember(owner = "client!oba", name = "m", descriptor = "Lclient!tt;")
	private final Class331 aClass331_5;

	@OriginalMember(owner = "client!oba", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!oba", name = "r", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!oba", name = "s", descriptor = "Z")
	private final boolean aBoolean470;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lclient!eda;Lclient!tf;Lclient!tt;)V")
	public Class72_Sub7(@OriginalArg(0) Class45_Sub2_Sub1 arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class331 arg2) {
		super(arg0);
		this.aClass45_Sub2_Sub1_4 = arg0;
		this.aClass331_5 = arg2;
		if (arg1 != null && this.aClass45_Sub2_22.aBoolean428 && this.aClass45_Sub2_22.aBoolean409 && (this.aClass45_Sub2_Sub1_4.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass45_Sub2_Sub1_4.anIDirect3DDevice1.a(arg1.method6810("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass45_Sub2_Sub1_4.anIDirect3DDevice1.b(arg1.method6810("environment_mapped_water_f", "dx"));
			this.aBoolean470 = this.anIDirect3DVertexShader1 != null && this.anIDirect3DPixelShader1 != null && this.aClass331_5.method6942();
		} else {
			this.aBoolean470 = false;
			this.anIDirect3DVertexShader1 = null;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V")
	@Override
	public void method7185() {
		if (this.aBoolean469) {
			@Pc(16) IDirect3DDevice local16 = this.aClass45_Sub2_Sub1_4.anIDirect3DDevice1;
			@Pc(23) Class11_Sub1 local23 = this.aClass45_Sub2_Sub1_4.method4989();
			local16.a(0, local23.method174(Static373.aFloatArray75));
		}
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
	@Override
	public void method7186() {
		if (!this.aBoolean469) {
			return;
		}
		@Pc(11) IDirect3DDevice local11 = this.aClass45_Sub2_Sub1_4.anIDirect3DDevice1;
		@Pc(16) Class11_Sub1 local16 = this.aClass45_Sub2_Sub1_4.method4984();
		@Pc(21) Class11_Sub1 local21 = this.aClass45_Sub2_Sub1_4.method4989();
		local11.a(0, local21.method174(Static373.aFloatArray75));
		local11.a(4, local16.method175(Static373.aFloatArray75));
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(B)V")
	@Override
	public void method7184() {
		if (!this.aBoolean469) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass45_Sub2_Sub1_4.anIDirect3DDevice1;
		local14.SetVertexShader(null);
		local14.SetPixelShader(null);
		this.aClass45_Sub2_22.method4961(1);
		this.aClass45_Sub2_22.method4926(null);
		this.aClass45_Sub2_22.method4961(0);
		this.aClass45_Sub2_22.method4926(null);
		this.aBoolean469 = false;
	}

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "(B)V")
	@Override
	public void method7191() {
		if (this.aBoolean469) {
			@Pc(7) IDirect3DDevice local7 = this.aClass45_Sub2_Sub1_4.anIDirect3DDevice1;
			@Pc(12) Class11_Sub1 local12 = this.aClass45_Sub2_22.method4970();
			local7.SetVertexShaderConstantF(12, local12.method178(Static373.aFloatArray75), 2);
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7182(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(B)V")
	@Override
	public void method7190() {
		if (this.aBoolean469) {
			@Pc(10) IDirect3DDevice local10 = this.aClass45_Sub2_Sub1_4.anIDirect3DDevice1;
			local10.a(8, this.aClass45_Sub2_22.method5017(Static373.aFloatArray75));
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)V")
	@Override
	public void method7188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean469) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass45_Sub2_Sub1_4.anIDirect3DDevice1;
		@Pc(18) int local18 = 0x1 << (arg0 & 0x3);
		@Pc(29) float local29 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(33) int local33 = arg1 & 0xFFFF;
		@Pc(42) float local42 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local12.a(14, (float) (local18 * this.aClass45_Sub2_22.anInt5856 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local12.a(15, local29, 0.0F, 0.0F, 0.0F);
		local12.b(4, (float) local33, 0.0F, 0.0F, 0.0F);
		local12.b(5, local42, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7187() {
		return this.aBoolean470;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BILclient!lc;)V")
	@Override
	public void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7193(@OriginalArg(0) boolean arg0) {
		@Pc(12) Interface6 local12 = this.aClass45_Sub2_22.method4985();
		if (!this.aBoolean470 || local12 == null) {
			return;
		}
		@Pc(21) IDirect3DDevice local21 = this.aClass45_Sub2_Sub1_4.anIDirect3DDevice1;
		local21.SetVertexShader(this.anIDirect3DVertexShader1);
		local21.SetPixelShader(this.anIDirect3DPixelShader1);
		this.aClass45_Sub2_22.method4961(1);
		this.aClass45_Sub2_22.method4926(local12);
		this.aClass45_Sub2_22.method4961(0);
		this.aClass45_Sub2_22.method4926(this.aClass331_5.anInterface14_1);
		this.aBoolean469 = true;
		this.method7186();
		this.method7191();
		this.method7190();
		this.method7192();
		local21.b(1, -this.aClass45_Sub2_22.aFloatArray66[0], -this.aClass45_Sub2_22.aFloatArray66[1], -this.aClass45_Sub2_22.aFloatArray66[2], 0.0F);
		local21.b(2, this.aClass45_Sub2_22.aFloat131, this.aClass45_Sub2_22.aFloat123, this.aClass45_Sub2_22.bf, 1.0F);
		local21.b(3, Math.abs(this.aClass45_Sub2_22.aFloatArray66[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "(I)V")
	@Override
	public void method7192() {
		if (!this.aBoolean469) {
			return;
		}
		@Pc(11) IDirect3DDevice local11 = this.aClass45_Sub2_Sub1_4.anIDirect3DDevice1;
		if (this.aClass45_Sub2_22.anInt5837 > 0) {
			@Pc(22) float local22 = this.aClass45_Sub2_22.aFloat128;
			@Pc(26) float local26 = this.aClass45_Sub2_22.aFloat129;
			local11.a(16, local22, 1.0F / (local22 - local26), 0.0F, 0.0F);
		} else {
			local11.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local11.b(0, (float) (this.aClass45_Sub2_22.anInt5847 >> 16 & 0xFF) / 255.0F, (float) (this.aClass45_Sub2_22.anInt5847 >> 8 & 0xFF) / 255.0F, (float) (this.aClass45_Sub2_22.anInt5847 & 0xFF) / 255.0F, 0.0F);
	}
}
