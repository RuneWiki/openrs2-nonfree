import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "Z")
	private boolean aBoolean214;

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "Lclient!wt;")
	private final Class376 aClass376_4;

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "Lclient!hl;")
	private final Class16_Sub1_Sub2 aClass16_Sub1_Sub2_4;

	@OriginalMember(owner = "client!dq", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!dq", name = "q", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "Z")
	private final boolean aBoolean215;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!hl;Lclient!oh;Lclient!wt;)V")
	public Class11_Sub2(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class376 arg2) {
		super(arg0);
		this.aClass376_4 = arg2;
		this.aClass16_Sub1_Sub2_4 = arg0;
		if (arg1 != null && this.aClass16_Sub1_21.aBoolean357 && this.aClass16_Sub1_21.aBoolean352 && (this.aClass16_Sub1_Sub2_4.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass16_Sub1_Sub2_4.anIDirect3DDevice1.a(arg1.method6304("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass16_Sub1_Sub2_4.anIDirect3DDevice1.b(arg1.method6304("dx", "environment_mapped_water_f"));
			this.aBoolean215 = this.anIDirect3DVertexShader1 != null && this.anIDirect3DPixelShader1 != null && this.aClass376_4.method8614();
		} else {
			this.aBoolean215 = false;
			this.anIDirect3DVertexShader1 = null;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7355(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!ke;BI)V")
	@Override
	public void method7354(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "(B)V")
	@Override
	public void method7365() {
		if (this.aBoolean214) {
			@Pc(15) IDirect3DDevice local15 = this.aClass16_Sub1_Sub2_4.anIDirect3DDevice1;
			@Pc(20) Class54_Sub3 local20 = this.aClass16_Sub1_21.method3940();
			local15.SetVertexShaderConstantF(12, local20.method5157(Static106.aFloatArray37), 2);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7357(@OriginalArg(0) boolean arg0) {
		@Pc(12) Interface25 local12 = this.aClass16_Sub1_21.method3920();
		if (!this.aBoolean215 || local12 == null) {
			return;
		}
		@Pc(21) IDirect3DDevice local21 = this.aClass16_Sub1_Sub2_4.anIDirect3DDevice1;
		this.aClass16_Sub1_Sub2_4.method4008(this.anIDirect3DVertexShader1);
		this.aClass16_Sub1_Sub2_4.method4009(this.anIDirect3DPixelShader1);
		this.aClass16_Sub1_21.method3899(1);
		this.aClass16_Sub1_21.method3889(local12);
		this.aClass16_Sub1_21.method3899(0);
		this.aClass16_Sub1_21.method3889(this.aClass376_4.anInterface1_1);
		this.aBoolean214 = true;
		this.method7366();
		this.method7365();
		this.method7362();
		this.method7363();
		local21.b(1, -this.aClass16_Sub1_21.aFloatArray45[0], -this.aClass16_Sub1_21.aFloatArray45[1], -this.aClass16_Sub1_21.aFloatArray45[2], 0.0F);
		local21.b(2, this.aClass16_Sub1_21.aFloat85, this.aClass16_Sub1_21.aFloat82, this.aClass16_Sub1_21.aFloat86, 1.0F);
		local21.b(3, Math.abs(this.aClass16_Sub1_21.aFloatArray45[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean214) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass16_Sub1_Sub2_4.anIDirect3DDevice1;
		@Pc(16) int local16 = 0x1 << (arg0 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg1 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local10.a(14, (float) (local16 * this.aClass16_Sub1_21.anInt4932 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local10.a(15, local27, 0.0F, 0.0F, 0.0F);
		local10.b(4, (float) local31, 0.0F, 0.0F, 0.0F);
		local10.b(5, local40, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7360() {
		return this.aBoolean215;
	}

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "(B)V")
	@Override
	public void method7366() {
		if (!this.aBoolean214) {
			return;
		}
		@Pc(11) IDirect3DDevice local11 = this.aClass16_Sub1_Sub2_4.anIDirect3DDevice1;
		@Pc(18) Class54_Sub3 local18 = this.aClass16_Sub1_Sub2_4.method3904();
		@Pc(23) Class54_Sub3 local23 = this.aClass16_Sub1_Sub2_4.method3885();
		local11.a(0, local23.method5152(Static106.aFloatArray37));
		local11.a(4, local18.method5153(Static106.aFloatArray37));
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)V")
	@Override
	public void method7363() {
		if (!this.aBoolean214) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass16_Sub1_Sub2_4.anIDirect3DDevice1;
		if (this.aClass16_Sub1_21.anInt4903 > 0) {
			@Pc(21) float local21 = this.aClass16_Sub1_21.aFloat88;
			@Pc(25) float local25 = this.aClass16_Sub1_21.aFloat96;
			local13.a(16, local21, 1.0F / (local21 - local25), 0.0F, 0.0F);
		} else {
			local13.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local13.b(0, (float) (this.aClass16_Sub1_21.anInt4915 >> 16 & 0xFF) / 255.0F, (float) (this.aClass16_Sub1_21.anInt4915 >> 8 & 0xFF) / 255.0F, (float) (this.aClass16_Sub1_21.anInt4915 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
	@Override
	public void method7356() {
		if (!this.aBoolean214) {
			return;
		}
		this.aClass16_Sub1_Sub2_4.method4008(null);
		this.aClass16_Sub1_Sub2_4.method4009(null);
		this.aClass16_Sub1_21.method3899(1);
		this.aClass16_Sub1_21.method3889(null);
		this.aClass16_Sub1_21.method3899(0);
		this.aClass16_Sub1_21.method3889(null);
		this.aBoolean214 = false;
	}

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)V")
	@Override
	public void method7362() {
		if (this.aBoolean214) {
			@Pc(7) IDirect3DDevice local7 = this.aClass16_Sub1_Sub2_4.anIDirect3DDevice1;
			local7.a(8, this.aClass16_Sub1_21.method3944(Static106.aFloatArray37));
		}
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
	@Override
	public void method7358() {
		if (this.aBoolean214) {
			@Pc(7) IDirect3DDevice local7 = this.aClass16_Sub1_Sub2_4.anIDirect3DDevice1;
			@Pc(12) Class54_Sub3 local12 = this.aClass16_Sub1_Sub2_4.method3885();
			local7.a(0, local12.method5152(Static106.aFloatArray37));
		}
	}
}
