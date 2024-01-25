import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class74_Sub2 extends Class74 {

	@OriginalMember(owner = "client!eda", name = "r", descriptor = "Z")
	private boolean aBoolean183;

	@OriginalMember(owner = "client!eda", name = "q", descriptor = "Lclient!wv;")
	private final Class378 aClass378_1;

	@OriginalMember(owner = "client!eda", name = "s", descriptor = "Lclient!lt;")
	private final Class87_Sub1_Sub2 aClass87_Sub1_Sub2_2;

	@OriginalMember(owner = "client!eda", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!eda", name = "p", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!eda", name = "m", descriptor = "Z")
	private final boolean aBoolean182;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lclient!lt;Lclient!eq;Lclient!wv;)V")
	public Class74_Sub2(@OriginalArg(0) Class87_Sub1_Sub2 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class378 arg2) {
		super(arg0);
		this.aClass378_1 = arg2;
		this.aClass87_Sub1_Sub2_2 = arg0;
		if (arg1 != null && this.aClass87_Sub1_22.aBoolean453 && this.aClass87_Sub1_22.aBoolean445 && (this.aClass87_Sub1_Sub2_2.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass87_Sub1_Sub2_2.anIDirect3DDevice1.b(arg1.method2567("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass87_Sub1_Sub2_2.anIDirect3DDevice1.a(arg1.method2567("environment_mapped_water_f", "dx"));
			this.aBoolean182 = this.anIDirect3DVertexShader1 != null && this.anIDirect3DPixelShader1 != null && this.aClass378_1.method8582();
		} else {
			this.anIDirect3DPixelShader1 = null;
			this.aBoolean182 = false;
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8251(@OriginalArg(0) boolean arg0) {
		@Pc(6) Interface22 local6 = this.aClass87_Sub1_22.method5123();
		if (!this.aBoolean182 || local6 == null) {
			return;
		}
		@Pc(22) IDirect3DDevice local22 = this.aClass87_Sub1_Sub2_2.anIDirect3DDevice1;
		this.aClass87_Sub1_Sub2_2.method5157(this.anIDirect3DVertexShader1);
		this.aClass87_Sub1_Sub2_2.method5156(this.anIDirect3DPixelShader1);
		this.aClass87_Sub1_22.method5116(1);
		this.aClass87_Sub1_22.method5079(local6);
		this.aClass87_Sub1_22.method5116(0);
		this.aClass87_Sub1_22.method5079(this.aClass378_1.anInterface11_2);
		this.aBoolean183 = true;
		this.method8247();
		this.method8246();
		this.method8254();
		this.method8242();
		local22.b(1, -this.aClass87_Sub1_22.aFloatArray52[0], -this.aClass87_Sub1_22.aFloatArray52[1], -this.aClass87_Sub1_22.aFloatArray52[2], 0.0F);
		local22.b(2, this.aClass87_Sub1_22.aFloat137, this.aClass87_Sub1_22.aFloat147, this.aClass87_Sub1_22.aFloat148, 1.0F);
		local22.b(3, Math.abs(this.aClass87_Sub1_22.aFloatArray52[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "(I)V")
	@Override
	public void method8254() {
		if (this.aBoolean183) {
			@Pc(7) IDirect3DDevice local7 = this.aClass87_Sub1_Sub2_2.anIDirect3DDevice1;
			local7.a(8, this.aClass87_Sub1_22.method5038(Static114.aFloatArray15));
		}
	}

	@OriginalMember(owner = "client!eda", name = "e", descriptor = "(I)V")
	@Override
	public void method8255() {
		if (this.aBoolean183) {
			@Pc(7) IDirect3DDevice local7 = this.aClass87_Sub1_Sub2_2.anIDirect3DDevice1;
			@Pc(12) Class6_Sub2 local12 = this.aClass87_Sub1_Sub2_2.method5100();
			local7.a(0, local12.method2701(Static114.aFloatArray15));
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8245() {
		return this.aBoolean182;
	}

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(I)V")
	@Override
	public void method8249() {
		if (!this.aBoolean183) {
			return;
		}
		this.aClass87_Sub1_Sub2_2.method5157(null);
		this.aClass87_Sub1_Sub2_2.method5156(null);
		this.aClass87_Sub1_22.method5116(1);
		this.aClass87_Sub1_22.method5079(null);
		this.aClass87_Sub1_22.method5116(0);
		this.aClass87_Sub1_22.method5079(null);
		this.aBoolean183 = false;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
	@Override
	public void method8242() {
		if (!this.aBoolean183) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass87_Sub1_Sub2_2.anIDirect3DDevice1;
		if (this.aClass87_Sub1_22.anInt6122 > 0) {
			@Pc(16) float local16 = this.aClass87_Sub1_22.aFloat145;
			@Pc(20) float local20 = this.aClass87_Sub1_22.aFloat143;
			local7.a(16, local16, 1.0F / (local16 - local20), 0.0F, 0.0F);
		} else {
			local7.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local7.b(0, (float) (this.aClass87_Sub1_22.anInt6149 >> 16 & 0xFF) / 255.0F, (float) (this.aClass87_Sub1_22.anInt6149 >> 8 & 0xFF) / 255.0F, (float) (this.aClass87_Sub1_22.anInt6149 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)V")
	@Override
	public void method8247() {
		if (!this.aBoolean183) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass87_Sub1_Sub2_2.anIDirect3DDevice1;
		@Pc(18) Class6_Sub2 local18 = this.aClass87_Sub1_Sub2_2.method5147();
		@Pc(23) Class6_Sub2 local23 = this.aClass87_Sub1_Sub2_2.method5100();
		local13.a(0, local23.method2701(Static114.aFloatArray15));
		local13.a(4, local18.method2704(Static114.aFloatArray15));
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8253(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(III)V")
	@Override
	public void method8243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean183) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass87_Sub1_Sub2_2.anIDirect3DDevice1;
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local6.a(14, (float) (local12 * this.aClass87_Sub1_22.anInt6123 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local6.a(15, local23, 0.0F, 0.0F, 0.0F);
		local6.b(4, (float) local27, 0.0F, 0.0F, 0.0F);
		local6.b(5, local36, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8250(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)V")
	@Override
	public void method8246() {
		if (this.aBoolean183) {
			@Pc(9) IDirect3DDevice local9 = this.aClass87_Sub1_Sub2_2.anIDirect3DDevice1;
			@Pc(14) Class6_Sub2 local14 = this.aClass87_Sub1_22.method5063();
			local9.SetVertexShaderConstantF(12, local14.method2722(Static114.aFloatArray15), 2);
		}
	}
}
