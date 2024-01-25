import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "Z")
	private boolean aBoolean121;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!tha;")
	private final Class22_Sub2_Sub1 aClass22_Sub2_Sub1_2;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "Lclient!ic;")
	private final Class172 aClass172_2;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "Z")
	private final boolean aBoolean122;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!tha;Lclient!ik;Lclient!ic;)V")
	public Class10_Sub2(@OriginalArg(0) Class22_Sub2_Sub1 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class172 arg2) {
		super(arg0);
		this.aClass22_Sub2_Sub1_2 = arg0;
		this.aClass172_2 = arg2;
		if (arg1 != null && this.aClass22_Sub2_23.aBoolean693 && this.aClass22_Sub2_23.aBoolean700 && (this.aClass22_Sub2_Sub1_2.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass22_Sub2_Sub1_2.anIDirect3DDevice1.b(arg1.method3958("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass22_Sub2_Sub1_2.anIDirect3DDevice1.a(arg1.method3958("environment_mapped_water_f", "dx"));
			this.aBoolean122 = this.anIDirect3DVertexShader1 != null && this.anIDirect3DPixelShader1 != null && this.aClass172_2.method3807();
		} else {
			this.anIDirect3DVertexShader1 = null;
			this.anIDirect3DPixelShader1 = null;
			this.aBoolean122 = false;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9558(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	@Override
	public void method9553() {
		if (this.aBoolean121) {
			@Pc(8) IDirect3DDevice local8 = this.aClass22_Sub2_Sub1_2.anIDirect3DDevice1;
			local8.a(8, this.aClass22_Sub2_23.method8946(Static75.aFloatArray10));
		}
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
	@Override
	public void method9550() {
		if (!this.aBoolean121) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass22_Sub2_Sub1_2.anIDirect3DDevice1;
		if (this.aClass22_Sub2_23.anInt10480 > 0) {
			@Pc(16) float local16 = this.aClass22_Sub2_23.aFloat181;
			@Pc(20) float local20 = this.aClass22_Sub2_23.aFloat187;
			local8.b(16, local16, 1.0F / (local16 - local20), 0.0F, 0.0F);
		} else {
			local8.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local8.a(0, (float) (this.aClass22_Sub2_23.anInt10487 >> 16 & 0xFF) / 255.0F, (float) (this.aClass22_Sub2_23.anInt10487 >> 8 & 0xFF) / 255.0F, (float) (this.aClass22_Sub2_23.anInt10487 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
	@Override
	public void method9547() {
		if (!this.aBoolean121) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass22_Sub2_Sub1_2.anIDirect3DDevice1;
		@Pc(11) Class58_Sub2 local11 = this.aClass22_Sub2_Sub1_2.method8913();
		@Pc(16) Class58_Sub2 local16 = this.aClass22_Sub2_Sub1_2.method8942();
		local6.a(0, local16.method6107(Static75.aFloatArray10));
		local6.a(4, local11.method6097(Static75.aFloatArray10));
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9557() {
		return this.aBoolean122;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9551(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface1 local8 = this.aClass22_Sub2_23.method8886();
		if (!this.aBoolean122 || local8 == null) {
			return;
		}
		@Pc(21) IDirect3DDevice local21 = this.aClass22_Sub2_Sub1_2.anIDirect3DDevice1;
		this.aClass22_Sub2_Sub1_2.method8195(this.anIDirect3DVertexShader1);
		this.aClass22_Sub2_Sub1_2.method8190(this.anIDirect3DPixelShader1);
		this.aClass22_Sub2_23.method8896(1);
		this.aClass22_Sub2_23.method8976(local8);
		this.aClass22_Sub2_23.method8896(0);
		this.aClass22_Sub2_23.method8976(this.aClass172_2.anInterface19_2);
		this.aBoolean121 = true;
		this.method9547();
		this.method9548();
		this.method9553();
		this.method9550();
		local21.a(1, -this.aClass22_Sub2_23.aFloatArray72[0], -this.aClass22_Sub2_23.aFloatArray72[1], -this.aClass22_Sub2_23.aFloatArray72[2], 0.0F);
		local21.a(2, this.aClass22_Sub2_23.aFloat186, this.aClass22_Sub2_23.aFloat178, this.aClass22_Sub2_23.aFloat185, 1.0F);
		local21.a(3, Math.abs(this.aClass22_Sub2_23.aFloatArray72[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	@Override
	public void method9556() {
		if (this.aBoolean121) {
			@Pc(8) IDirect3DDevice local8 = this.aClass22_Sub2_Sub1_2.anIDirect3DDevice1;
			@Pc(13) Class58_Sub2 local13 = this.aClass22_Sub2_Sub1_2.method8942();
			local8.a(0, local13.method6107(Static75.aFloatArray10));
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!sc;II)V")
	@Override
	public void method9546(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBI)V")
	@Override
	public void method9552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean121) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass22_Sub2_Sub1_2.anIDirect3DDevice1;
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		local6.b(14, (float) (this.aClass22_Sub2_23.anInt10466 * local12 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(53) float local53 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local6.b(15, local23, 0.0F, 0.0F, 0.0F);
		local6.a(4, (float) local27, 0.0F, 0.0F, 0.0F);
		local6.a(5, local53, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)V")
	@Override
	public void method9548() {
		if (this.aBoolean121) {
			@Pc(8) IDirect3DDevice local8 = this.aClass22_Sub2_Sub1_2.anIDirect3DDevice1;
			@Pc(13) Class58_Sub2 local13 = this.aClass22_Sub2_23.method8921();
			local8.SetVertexShaderConstantF(12, local13.method6109(Static75.aFloatArray10), 2);
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
	@Override
	public void method9549() {
		if (!this.aBoolean121) {
			return;
		}
		this.aClass22_Sub2_Sub1_2.method8195((IDirect3DVertexShader) null);
		this.aClass22_Sub2_Sub1_2.method8190((IDirect3DPixelShader) null);
		this.aClass22_Sub2_23.method8896(1);
		this.aClass22_Sub2_23.method8976((Interface21) null);
		this.aClass22_Sub2_23.method8896(0);
		this.aClass22_Sub2_23.method8976((Interface21) null);
		this.aBoolean121 = false;
	}
}
