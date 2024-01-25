import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "Z")
	private boolean aBoolean677;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "Lclient!rja;")
	private final Class13_Sub1_Sub2 aClass13_Sub1_Sub2_8;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "Lclient!lja;")
	private final Class202 aClass202_7;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "Z")
	private final boolean aBoolean676;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!rja;Lclient!aj;Lclient!lja;)V")
	public Class4_Sub10(@OriginalArg(0) Class13_Sub1_Sub2 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class202 arg2) {
		super(arg0);
		this.aClass13_Sub1_Sub2_8 = arg0;
		this.aClass202_7 = arg2;
		if (arg1 != null && this.aClass13_Sub1_23.aBoolean654 && this.aClass13_Sub1_23.aBoolean660 && (this.aClass13_Sub1_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass13_Sub1_Sub2_8.anIDirect3DDevice1.b(arg1.method533("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass13_Sub1_Sub2_8.anIDirect3DDevice1.a(arg1.method533("dx", "environment_mapped_water_f"));
			this.aBoolean676 = this.anIDirect3DVertexShader8 != null && this.anIDirect3DPixelShader1 != null && this.aClass202_7.method5176();
		} else {
			this.anIDirect3DPixelShader1 = null;
			this.anIDirect3DVertexShader8 = null;
			this.aBoolean676 = false;
		}
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V")
	@Override
	public void method7853() {
		if (!this.aBoolean677) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass13_Sub1_Sub2_8.anIDirect3DDevice1;
		if (this.aClass13_Sub1_23.anInt8627 > 0) {
			@Pc(14) float local14 = this.aClass13_Sub1_23.aFloat175;
			@Pc(18) float local18 = this.aClass13_Sub1_23.aFloat174;
			local6.b(16, local14, 1.0F / (local14 - local18), 0.0F, 0.0F);
		} else {
			local6.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local6.a(0, (float) (this.aClass13_Sub1_23.anInt8598 >> 16 & 0xFF) / 255.0F, (float) (this.aClass13_Sub1_23.anInt8598 >> 8 & 0xFF) / 255.0F, (float) (this.aClass13_Sub1_23.anInt8598 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7848() {
		return this.aBoolean676;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V")
	@Override
	public void method7851() {
		if (this.aBoolean677) {
			@Pc(12) IDirect3DDevice local12 = this.aClass13_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(17) Class239_Sub3 local17 = this.aClass13_Sub1_23.method7420();
			local12.SetVertexShaderConstantF(12, local17.method9264(Static526.aFloatArray75), 2);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7852(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(B)V")
	@Override
	public void method7858() {
		if (!this.aBoolean677) {
			return;
		}
		this.aClass13_Sub1_Sub2_8.method7545((IDirect3DVertexShader) null);
		this.aClass13_Sub1_Sub2_8.method7546((IDirect3DPixelShader) null);
		this.aClass13_Sub1_23.method7461(1);
		this.aClass13_Sub1_23.method7530((Interface3) null);
		this.aClass13_Sub1_23.method7461(0);
		this.aClass13_Sub1_23.method7530((Interface3) null);
		this.aBoolean677 = false;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7856(@OriginalArg(0) boolean arg0) {
		@Pc(4) Interface10 local4 = this.aClass13_Sub1_23.method7529();
		if (!this.aBoolean676 || local4 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass13_Sub1_Sub2_8.anIDirect3DDevice1;
		this.aClass13_Sub1_Sub2_8.method7545(this.anIDirect3DVertexShader8);
		this.aClass13_Sub1_Sub2_8.method7546(this.anIDirect3DPixelShader1);
		this.aClass13_Sub1_23.method7461(1);
		this.aClass13_Sub1_23.method7530(local4);
		this.aClass13_Sub1_23.method7461(0);
		this.aClass13_Sub1_23.method7530(this.aClass202_7.anInterface21_1);
		this.aBoolean677 = true;
		this.method7847();
		this.method7851();
		this.method7857();
		this.method7853();
		local14.a(1, -this.aClass13_Sub1_23.aFloatArray72[0], -this.aClass13_Sub1_23.aFloatArray72[1], -this.aClass13_Sub1_23.aFloatArray72[2], 0.0F);
		local14.a(2, this.aClass13_Sub1_23.aFloat176, this.aClass13_Sub1_23.aFloat187, this.aClass13_Sub1_23.aFloat181, 1.0F);
		local14.a(3, Math.abs(this.aClass13_Sub1_23.aFloatArray72[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBLclient!bm;)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
	@Override
	public void method7857() {
		if (this.aBoolean677) {
			@Pc(6) IDirect3DDevice local6 = this.aClass13_Sub1_Sub2_8.anIDirect3DDevice1;
			local6.a(8, this.aClass13_Sub1_23.method7411(Static526.aFloatArray75));
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
	@Override
	public void method7847() {
		if (!this.aBoolean677) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass13_Sub1_Sub2_8.anIDirect3DDevice1;
		@Pc(20) Class239_Sub3 local20 = this.aClass13_Sub1_Sub2_8.method7412();
		@Pc(25) Class239_Sub3 local25 = this.aClass13_Sub1_Sub2_8.method7431();
		local15.a(0, local25.method9263(Static526.aFloatArray75));
		local15.a(4, local20.method9259(Static526.aFloatArray75));
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
	@Override
	public void method7855() {
		if (this.aBoolean677) {
			@Pc(13) IDirect3DDevice local13 = this.aClass13_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(18) Class239_Sub3 local18 = this.aClass13_Sub1_Sub2_8.method7431();
			local13.a(0, local18.method9263(Static526.aFloatArray75));
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean677) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass13_Sub1_Sub2_8.anIDirect3DDevice1;
		@Pc(19) int local19 = 0x1 << (arg0 & 0x3);
		@Pc(30) float local30 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(34) int local34 = arg1 & 0xFFFF;
		@Pc(43) float local43 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local13.b(14, (float) (local19 * this.aClass13_Sub1_23.anInt8613 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local13.b(15, local30, 0.0F, 0.0F, 0.0F);
		local13.a(4, (float) local34, 0.0F, 0.0F, 0.0F);
		local13.a(5, local43, 0.0F, 0.0F, 0.0F);
	}
}
