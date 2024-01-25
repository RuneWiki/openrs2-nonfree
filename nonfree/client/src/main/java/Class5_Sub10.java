import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public final class Class5_Sub10 extends Class5 {

	@OriginalMember(owner = "client!pea", name = "p", descriptor = "Z")
	private boolean aBoolean542;

	@OriginalMember(owner = "client!pea", name = "o", descriptor = "Lclient!hda;")
	private final Class144_Sub1_Sub1 aClass144_Sub1_Sub1_7;

	@OriginalMember(owner = "client!pea", name = "l", descriptor = "Lclient!lj;")
	private final Class223 aClass223_8;

	@OriginalMember(owner = "client!pea", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!pea", name = "m", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!pea", name = "n", descriptor = "Z")
	private final boolean aBoolean541;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!hda;Lclient!rg;Lclient!lj;)V")
	public Class5_Sub10(@OriginalArg(0) Class144_Sub1_Sub1 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class223 arg2) {
		super(arg0);
		this.aClass144_Sub1_Sub1_7 = arg0;
		this.aClass223_8 = arg2;
		if (arg1 != null && this.aClass144_Sub1_20.aBoolean440 && this.aClass144_Sub1_20.aBoolean449 && (this.aClass144_Sub1_Sub1_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass144_Sub1_Sub1_7.anIDirect3DDevice1.a(arg1.method7801("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass144_Sub1_Sub1_7.anIDirect3DDevice1.b(arg1.method7801("environment_mapped_water_f", "dx"));
			this.aBoolean541 = this.anIDirect3DVertexShader8 != null && this.anIDirect3DPixelShader1 != null && this.aClass223_8.method5332();
		} else {
			this.anIDirect3DVertexShader8 = null;
			this.aBoolean541 = false;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "(B)V")
	@Override
	public void method6872() {
		if (this.aBoolean542) {
			@Pc(12) IDirect3DDevice local12 = this.aClass144_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(17) Class263_Sub2 local17 = this.aClass144_Sub1_20.method5737();
			local12.SetVertexShaderConstantF(12, local17.method7281(Static463.aFloatArray60), 2);
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6878(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "(I)V")
	@Override
	public void method6865() {
		if (!this.aBoolean542) {
			return;
		}
		this.aClass144_Sub1_Sub1_7.method3735((IDirect3DVertexShader) null);
		this.aClass144_Sub1_Sub1_7.method3737((IDirect3DPixelShader) null);
		this.aClass144_Sub1_20.method5706(1);
		this.aClass144_Sub1_20.method5643((Interface25) null);
		this.aClass144_Sub1_20.method5706(0);
		this.aClass144_Sub1_20.method5643((Interface25) null);
		this.aBoolean542 = false;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IILclient!vi;)V")
	@Override
	public void method6877(@OriginalArg(0) int arg0, @OriginalArg(2) Interface25 arg1) {
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "(B)V")
	@Override
	public void method6875() {
		if (!this.aBoolean542) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass144_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(13) Class263_Sub2 local13 = this.aClass144_Sub1_Sub1_7.method5674();
		@Pc(18) Class263_Sub2 local18 = this.aClass144_Sub1_Sub1_7.method5765();
		local8.a(0, local18.method7298(Static463.aFloatArray60));
		local8.a(4, local13.method7294(Static463.aFloatArray60));
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V")
	@Override
	public void method6869() {
		if (this.aBoolean542) {
			@Pc(16) IDirect3DDevice local16 = this.aClass144_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(21) Class263_Sub2 local21 = this.aClass144_Sub1_Sub1_7.method5765();
			local16.a(0, local21.method7298(Static463.aFloatArray60));
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
	@Override
	public void method6868() {
		if (!this.aBoolean542) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass144_Sub1_Sub1_7.anIDirect3DDevice1;
		if (this.aClass144_Sub1_20.anInt6499 > 0) {
			@Pc(22) float local22 = this.aClass144_Sub1_20.aFloat99;
			@Pc(26) float local26 = this.aClass144_Sub1_20.aFloat94;
			local14.b(16, local22, 1.0F / (local22 - local26), 0.0F, 0.0F);
		} else {
			local14.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local14.a(0, (float) (this.aClass144_Sub1_20.anInt6507 >> 16 & 0xFF) / 255.0F, (float) (this.aClass144_Sub1_20.anInt6507 >> 8 & 0xFF) / 255.0F, (float) (this.aClass144_Sub1_20.anInt6507 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6873(@OriginalArg(1) boolean arg0) {
		@Pc(4) Interface20 local4 = this.aClass144_Sub1_20.method5727();
		if (!this.aBoolean541 || local4 == null) {
			return;
		}
		@Pc(16) IDirect3DDevice local16 = this.aClass144_Sub1_Sub1_7.anIDirect3DDevice1;
		this.aClass144_Sub1_Sub1_7.method3735(this.anIDirect3DVertexShader8);
		this.aClass144_Sub1_Sub1_7.method3737(this.anIDirect3DPixelShader1);
		this.aClass144_Sub1_20.method5706(1);
		this.aClass144_Sub1_20.method5643(local4);
		this.aClass144_Sub1_20.method5706(0);
		this.aClass144_Sub1_20.method5643(this.aClass223_8.anInterface18_2);
		this.aBoolean542 = true;
		this.method6875();
		this.method6872();
		this.method6876();
		this.method6868();
		local16.a(1, -this.aClass144_Sub1_20.aFloatArray51[0], -this.aClass144_Sub1_20.aFloatArray51[1], -this.aClass144_Sub1_20.aFloatArray51[2], 0.0F);
		local16.a(2, this.aClass144_Sub1_20.aFloat103, this.aClass144_Sub1_20.aFloat104, this.aClass144_Sub1_20.aFloat106, 1.0F);
		local16.a(3, Math.abs(this.aClass144_Sub1_20.aFloatArray51[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "(I)V")
	@Override
	public void method6876() {
		if (this.aBoolean542) {
			@Pc(17) IDirect3DDevice local17 = this.aClass144_Sub1_Sub1_7.anIDirect3DDevice1;
			local17.a(8, this.aClass144_Sub1_20.method5668(Static463.aFloatArray60));
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean542) {
			return;
		}
		@Pc(16) IDirect3DDevice local16 = this.aClass144_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(22) int local22 = 0x1 << (arg0 & 0x3);
		@Pc(33) float local33 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(37) int local37 = arg1 & 0xFFFF;
		@Pc(46) float local46 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local16.b(14, (float) (local22 * this.aClass144_Sub1_20.anInt6502 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local16.b(15, local33, 0.0F, 0.0F, 0.0F);
		local16.a(4, (float) local37, 0.0F, 0.0F, 0.0F);
		local16.a(5, local46, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6867() {
		return this.aBoolean541;
	}
}
