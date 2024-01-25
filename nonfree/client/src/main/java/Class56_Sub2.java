import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class56_Sub2 extends Class56 {

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Z")
	private boolean aBoolean320;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "Lclient!gaa;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_4;

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "Lclient!bd;")
	private final Class31 aClass31_3;

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "Z")
	private final boolean aBoolean321;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!gaa;Lclient!pl;Lclient!bd;)V")
	public Class56_Sub2(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class31 arg2) {
		super(arg0);
		this.aClass100_Sub1_Sub1_4 = arg0;
		this.aClass31_3 = arg2;
		if (arg1 != null && this.aClass100_Sub1_23.aBoolean438 && this.aClass100_Sub1_23.aBoolean454 && (this.aClass100_Sub1_Sub1_4.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass100_Sub1_Sub1_4.anIDirect3DDevice1.a(arg1.method5965("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass100_Sub1_Sub1_4.anIDirect3DDevice1.b(arg1.method5965("dx", "environment_mapped_water_f"));
			this.aBoolean321 = this.anIDirect3DVertexShader1 != null && this.anIDirect3DPixelShader1 != null && this.aClass31_3.method544();
		} else {
			this.aBoolean321 = false;
			this.anIDirect3DPixelShader1 = null;
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
	@Override
	public void method7176() {
		if (!this.aBoolean320) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass100_Sub1_Sub1_4.anIDirect3DDevice1;
		@Pc(17) Class68_Sub2 local17 = this.aClass100_Sub1_Sub1_4.method4811();
		@Pc(22) Class68_Sub2 local22 = this.aClass100_Sub1_Sub1_4.method4842();
		local12.a(0, local22.method5119(Static190.aFloatArray33));
		local12.a(4, local17.method5106(Static190.aFloatArray33));
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILclient!hfa;)V")
	@Override
	public void method7178(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7174(@OriginalArg(1) boolean arg0) {
		@Pc(12) Interface20 local12 = this.aClass100_Sub1_23.method4845();
		if (!this.aBoolean321 || local12 == null) {
			return;
		}
		@Pc(22) IDirect3DDevice local22 = this.aClass100_Sub1_Sub1_4.anIDirect3DDevice1;
		local22.SetVertexShader(this.anIDirect3DVertexShader1);
		local22.SetPixelShader(this.anIDirect3DPixelShader1);
		this.aClass100_Sub1_23.method4860(1);
		this.aClass100_Sub1_23.method4876(local12);
		this.aClass100_Sub1_23.method4860(0);
		this.aClass100_Sub1_23.method4876(this.aClass31_3.anInterface6_2);
		this.aBoolean320 = true;
		this.method7176();
		this.method7181();
		this.method7179();
		this.method7177();
		local22.b(1, -this.aClass100_Sub1_23.aFloatArray52[0], -this.aClass100_Sub1_23.aFloatArray52[1], -this.aClass100_Sub1_23.aFloatArray52[2], 0.0F);
		local22.b(2, this.aClass100_Sub1_23.aFloat152, this.aClass100_Sub1_23.aFloat161, this.aClass100_Sub1_23.aFloat156, 1.0F);
		local22.b(3, Math.abs(this.aClass100_Sub1_23.aFloatArray52[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean320) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass100_Sub1_Sub1_4.anIDirect3DDevice1;
		@Pc(16) int local16 = 0x1 << (arg0 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg1 & 0xFFFF;
		local10.a(14, (float) (local16 * this.aClass100_Sub1_23.anInt5768 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(57) float local57 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local10.a(15, local27, 0.0F, 0.0F, 0.0F);
		local10.b(4, (float) local31, 0.0F, 0.0F, 0.0F);
		local10.b(5, local57, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	@Override
	public void method7179() {
		if (this.aBoolean320) {
			@Pc(14) IDirect3DDevice local14 = this.aClass100_Sub1_Sub1_4.anIDirect3DDevice1;
			local14.a(8, this.aClass100_Sub1_23.method4809(Static190.aFloatArray33));
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7172() {
		return this.aBoolean321;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
	@Override
	public void method7181() {
		if (this.aBoolean320) {
			@Pc(6) IDirect3DDevice local6 = this.aClass100_Sub1_Sub1_4.anIDirect3DDevice1;
			@Pc(11) Class68_Sub2 local11 = this.aClass100_Sub1_23.method4792();
			local6.SetVertexShaderConstantF(12, local11.method5101(Static190.aFloatArray33), 2);
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	@Override
	public void method7177() {
		if (!this.aBoolean320) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass100_Sub1_Sub1_4.anIDirect3DDevice1;
		if (this.aClass100_Sub1_23.anInt5789 > 0) {
			@Pc(15) float local15 = this.aClass100_Sub1_23.bf;
			@Pc(19) float local19 = this.aClass100_Sub1_23.aFloat151;
			local6.a(16, local15, 1.0F / (local15 - local19), 0.0F, 0.0F);
		} else {
			local6.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local6.b(0, (float) (this.aClass100_Sub1_23.anInt5779 >> 16 & 0xFF) / 255.0F, (float) (this.aClass100_Sub1_23.anInt5779 >> 8 & 0xFF) / 255.0F, (float) (this.aClass100_Sub1_23.anInt5779 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
	@Override
	public void method7183() {
		if (!this.aBoolean320) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass100_Sub1_Sub1_4.anIDirect3DDevice1;
		local12.SetVertexShader(null);
		local12.SetPixelShader(null);
		this.aClass100_Sub1_23.method4860(1);
		this.aClass100_Sub1_23.method4876(null);
		this.aClass100_Sub1_23.method4860(0);
		this.aClass100_Sub1_23.method4876(null);
		this.aBoolean320 = false;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
	@Override
	public void method7175() {
		if (this.aBoolean320) {
			@Pc(6) IDirect3DDevice local6 = this.aClass100_Sub1_Sub1_4.anIDirect3DDevice1;
			@Pc(11) Class68_Sub2 local11 = this.aClass100_Sub1_Sub1_4.method4842();
			local6.a(0, local11.method5119(Static190.aFloatArray33));
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7171(@OriginalArg(1) boolean arg0) {
	}
}
