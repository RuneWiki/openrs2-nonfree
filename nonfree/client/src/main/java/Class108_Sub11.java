import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class108_Sub11 extends Class108 {

	@OriginalMember(owner = "client!wea", name = "t", descriptor = "Z")
	private boolean aBoolean826;

	@OriginalMember(owner = "client!wea", name = "s", descriptor = "Lclient!mh;")
	private final Class126_Sub2_Sub2 aClass126_Sub2_Sub2_9;

	@OriginalMember(owner = "client!wea", name = "y", descriptor = "Lclient!wda;")
	private final Class373 aClass373_8;

	@OriginalMember(owner = "client!wea", name = "w", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!wea", name = "x", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!wea", name = "u", descriptor = "Z")
	private final boolean aBoolean827;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lclient!mh;Lclient!wu;Lclient!wda;)V")
	public Class108_Sub11(@OriginalArg(0) Class126_Sub2_Sub2 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class373 arg2) {
		super(arg0);
		this.aClass126_Sub2_Sub2_9 = arg0;
		this.aClass373_8 = arg2;
		if (arg1 != null && this.aClass126_Sub2_23.aBoolean522 && this.aClass126_Sub2_23.aBoolean520 && (this.aClass126_Sub2_Sub2_9.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass126_Sub2_Sub2_9.anIDirect3DDevice1.b(arg1.method8871("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass126_Sub2_Sub2_9.anIDirect3DDevice1.a(arg1.method8871("environment_mapped_water_f", "dx"));
			this.aBoolean827 = this.anIDirect3DVertexShader8 != null && this.anIDirect3DPixelShader1 != null && this.aClass373_8.method8671();
		} else {
			this.anIDirect3DPixelShader1 = null;
			this.anIDirect3DVertexShader8 = null;
			this.aBoolean827 = false;
		}
	}

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)V")
	@Override
	public void method8703() {
		if (this.aBoolean826) {
			@Pc(10) IDirect3DDevice local10 = this.aClass126_Sub2_Sub2_9.anIDirect3DDevice1;
			@Pc(15) Class117_Sub2 local15 = this.aClass126_Sub2_Sub2_9.method5539();
			local10.a(0, local15.method3879(Static628.aFloatArray74));
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8710(@OriginalArg(1) boolean arg0) {
		@Pc(11) Interface18 local11 = this.aClass126_Sub2_23.method5494();
		if (!this.aBoolean827 || local11 == null) {
			return;
		}
		@Pc(20) IDirect3DDevice local20 = this.aClass126_Sub2_Sub2_9.anIDirect3DDevice1;
		this.aClass126_Sub2_Sub2_9.method5575(this.anIDirect3DVertexShader8);
		this.aClass126_Sub2_Sub2_9.method5582(this.anIDirect3DPixelShader1);
		this.aClass126_Sub2_23.method5560(1);
		this.aClass126_Sub2_23.method5449(local11);
		this.aClass126_Sub2_23.method5560(0);
		this.aClass126_Sub2_23.method5449(this.aClass373_8.anInterface19_1);
		this.aBoolean826 = true;
		this.method8705();
		this.method8698();
		this.method8711();
		this.method8704();
		local20.a(1, -this.aClass126_Sub2_23.aFloatArray37[0], -this.aClass126_Sub2_23.aFloatArray37[1], -this.aClass126_Sub2_23.aFloatArray37[2], 0.0F);
		local20.a(2, this.aClass126_Sub2_23.aFloat122, this.aClass126_Sub2_23.aFloat129, this.aClass126_Sub2_23.aFloat126, 1.0F);
		local20.a(3, Math.abs(this.aClass126_Sub2_23.aFloatArray37[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V")
	@Override
	public void method8698() {
		if (this.aBoolean826) {
			@Pc(12) IDirect3DDevice local12 = this.aClass126_Sub2_Sub2_9.anIDirect3DDevice1;
			@Pc(17) Class117_Sub2 local17 = this.aClass126_Sub2_23.method5499();
			local12.SetVertexShaderConstantF(12, local17.method3862(Static628.aFloatArray74), 2);
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)V")
	@Override
	public void method8704() {
		if (!this.aBoolean826) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass126_Sub2_Sub2_9.anIDirect3DDevice1;
		if (this.aClass126_Sub2_23.anInt6255 <= 0) {
			local6.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(24) float local24 = this.aClass126_Sub2_23.aFloat123;
			@Pc(28) float local28 = this.aClass126_Sub2_23.aFloat120;
			local6.b(16, local24, 1.0F / (local24 - local28), 0.0F, 0.0F);
		}
		local6.a(0, (float) (this.aClass126_Sub2_23.anInt6277 >> 16 & 0xFF) / 255.0F, (float) (this.aClass126_Sub2_23.anInt6277 >> 8 & 0xFF) / 255.0F, (float) (this.aClass126_Sub2_23.anInt6277 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!wc;IB)V")
	@Override
	public void method8709(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V")
	@Override
	public void method8705() {
		if (!this.aBoolean826) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass126_Sub2_Sub2_9.anIDirect3DDevice1;
		@Pc(12) Class117_Sub2 local12 = this.aClass126_Sub2_Sub2_9.method5493();
		@Pc(17) Class117_Sub2 local17 = this.aClass126_Sub2_Sub2_9.method5539();
		local7.a(0, local17.method3879(Static628.aFloatArray74));
		local7.a(4, local12.method3857(Static628.aFloatArray74));
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8702(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8699() {
		return this.aBoolean827;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(III)V")
	@Override
	public void method8700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean826) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass126_Sub2_Sub2_9.anIDirect3DDevice1;
		@Pc(13) int local13 = 0x1 << (arg0 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg1 & 0xFFFF;
		local7.b(14, (float) (this.aClass126_Sub2_23.anInt6264 * local13 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(54) float local54 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local7.b(15, local24, 0.0F, 0.0F, 0.0F);
		local7.a(4, (float) local28, 0.0F, 0.0F, 0.0F);
		local7.a(5, local54, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(Z)V")
	@Override
	public void method8708() {
		if (!this.aBoolean826) {
			return;
		}
		this.aClass126_Sub2_Sub2_9.method5575((IDirect3DVertexShader) null);
		this.aClass126_Sub2_Sub2_9.method5582((IDirect3DPixelShader) null);
		this.aClass126_Sub2_23.method5560(1);
		this.aClass126_Sub2_23.method5449((Interface27) null);
		this.aClass126_Sub2_23.method5560(0);
		this.aClass126_Sub2_23.method5449((Interface27) null);
		this.aBoolean826 = false;
	}

	@OriginalMember(owner = "client!wea", name = "e", descriptor = "(I)V")
	@Override
	public void method8711() {
		if (this.aBoolean826) {
			@Pc(11) IDirect3DDevice local11 = this.aClass126_Sub2_Sub2_9.anIDirect3DDevice1;
			local11.a(8, this.aClass126_Sub2_23.method5447(Static628.aFloatArray74));
		}
	}
}
