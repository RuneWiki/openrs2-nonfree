import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class17_Sub5 extends Class17 {

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "Z")
	private boolean aBoolean323;

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "Lclient!ur;")
	private final Class347 aClass347_5;

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "Lclient!bfa;")
	private final Class20_Sub2_Sub1 aClass20_Sub2_Sub1_5;

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "Z")
	private final boolean aBoolean324;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!bfa;Lclient!in;Lclient!ur;)V")
	public Class17_Sub5(@OriginalArg(0) Class20_Sub2_Sub1 arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class347 arg2) {
		super(arg0);
		this.aClass347_5 = arg2;
		this.aClass20_Sub2_Sub1_5 = arg0;
		if (arg1 != null && this.aClass20_Sub2_22.aBoolean115 && this.aClass20_Sub2_22.aBoolean128 && (this.aClass20_Sub2_Sub1_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass20_Sub2_Sub1_5.anIDirect3DDevice1.b(arg1.method4545("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass20_Sub2_Sub1_5.anIDirect3DDevice1.a(arg1.method4545("dx", "environment_mapped_water_f"));
			this.aBoolean324 = this.anIDirect3DVertexShader8 != null && this.anIDirect3DPixelShader1 != null && this.aClass347_5.method8642();
		} else {
			this.anIDirect3DVertexShader8 = null;
			this.aBoolean324 = false;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean323) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass20_Sub2_Sub1_5.anIDirect3DDevice1;
		@Pc(21) int local21 = 0x1 << (arg0 & 0x3);
		@Pc(32) float local32 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(36) int local36 = arg1 & 0xFFFF;
		@Pc(45) float local45 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local15.a(14, (float) (this.aClass20_Sub2_22.anInt1564 * local21 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local15.a(15, local32, 0.0F, 0.0F, 0.0F);
		local15.b(4, (float) local36, 0.0F, 0.0F, 0.0F);
		local15.b(5, local45, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8058(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V")
	@Override
	public void method8069() {
		if (this.aBoolean323) {
			@Pc(6) IDirect3DDevice local6 = this.aClass20_Sub2_Sub1_5.anIDirect3DDevice1;
			@Pc(13) Class30_Sub2 local13 = this.aClass20_Sub2_22.method1482();
			local6.SetVertexShaderConstantF(12, local13.method4035(Static181.aFloatArray40), 2);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8064(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	@Override
	public void method8059() {
		if (!this.aBoolean323) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass20_Sub2_Sub1_5.anIDirect3DDevice1;
		if (this.aClass20_Sub2_22.anInt1541 <= 0) {
			local6.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(23) float local23 = this.aClass20_Sub2_22.aFloat53;
			@Pc(27) float local27 = this.aClass20_Sub2_22.aFloat61;
			local6.a(16, local23, 1.0F / (local23 - local27), 0.0F, 0.0F);
		}
		local6.b(0, (float) (this.aClass20_Sub2_22.anInt1563 >> 16 & 0xFF) / 255.0F, (float) (this.aClass20_Sub2_22.anInt1563 >> 8 & 0xFF) / 255.0F, (float) (this.aClass20_Sub2_22.anInt1563 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8062(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface19 local8 = this.aClass20_Sub2_22.method1468();
		if (!this.aBoolean324 || local8 == null) {
			return;
		}
		@Pc(18) IDirect3DDevice local18 = this.aClass20_Sub2_Sub1_5.anIDirect3DDevice1;
		this.aClass20_Sub2_Sub1_5.method1330(this.anIDirect3DVertexShader8);
		this.aClass20_Sub2_Sub1_5.method1335(this.anIDirect3DPixelShader1);
		this.aClass20_Sub2_22.method1531(1);
		this.aClass20_Sub2_22.method1484(local8);
		this.aClass20_Sub2_22.method1531(0);
		this.aClass20_Sub2_22.method1484(this.aClass347_5.anInterface13_2);
		this.aBoolean323 = true;
		this.method8068();
		this.method8069();
		this.method8061();
		this.method8059();
		local18.b(1, -this.aClass20_Sub2_22.aFloatArray33[0], -this.aClass20_Sub2_22.aFloatArray33[1], -this.aClass20_Sub2_22.aFloatArray33[2], 0.0F);
		local18.b(2, this.aClass20_Sub2_22.aFloat63, this.aClass20_Sub2_22.aFloat49, this.aClass20_Sub2_22.aFloat59, 1.0F);
		local18.b(3, Math.abs(this.aClass20_Sub2_22.aFloatArray33[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8067() {
		return this.aBoolean324;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
	@Override
	public void method8060() {
		if (this.aBoolean323) {
			@Pc(7) IDirect3DDevice local7 = this.aClass20_Sub2_Sub1_5.anIDirect3DDevice1;
			@Pc(12) Class30_Sub2 local12 = this.aClass20_Sub2_Sub1_5.method1582();
			local7.a(0, local12.method4044(Static181.aFloatArray40));
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
	@Override
	public void method8057() {
		if (!this.aBoolean323) {
			return;
		}
		this.aClass20_Sub2_Sub1_5.method1330(null);
		this.aClass20_Sub2_Sub1_5.method1335(null);
		this.aClass20_Sub2_22.method1531(1);
		this.aClass20_Sub2_22.method1484(null);
		this.aClass20_Sub2_22.method1531(0);
		this.aClass20_Sub2_22.method1484(null);
		this.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	@Override
	public void method8061() {
		if (this.aBoolean323) {
			@Pc(10) IDirect3DDevice local10 = this.aClass20_Sub2_Sub1_5.anIDirect3DDevice1;
			local10.a(8, this.aClass20_Sub2_22.method1469(Static181.aFloatArray40));
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
	@Override
	public void method8068() {
		if (!this.aBoolean323) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass20_Sub2_Sub1_5.anIDirect3DDevice1;
		@Pc(15) Class30_Sub2 local15 = this.aClass20_Sub2_Sub1_5.method1521();
		@Pc(20) Class30_Sub2 local20 = this.aClass20_Sub2_Sub1_5.method1582();
		local10.a(0, local20.method4044(Static181.aFloatArray40));
		local10.a(4, local15.method4050(Static181.aFloatArray40));
	}
}
