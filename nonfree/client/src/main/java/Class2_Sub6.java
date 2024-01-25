import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Z")
	private boolean aBoolean568;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Lclient!st;")
	private final Class315 aClass315_6;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Lclient!ega;")
	private final Class78_Sub1_Sub1 aClass78_Sub1_Sub1_8;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Z")
	private final boolean aBoolean569;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!ega;Lclient!sea;Lclient!st;)V")
	public Class2_Sub6(@OriginalArg(0) Class78_Sub1_Sub1 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class315 arg2) {
		super(arg0);
		this.aClass315_6 = arg2;
		this.aClass78_Sub1_Sub1_8 = arg0;
		if (arg1 != null && this.aClass78_Sub1_23.aBoolean639 && this.aClass78_Sub1_23.aBoolean635 && (this.aClass78_Sub1_Sub1_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass78_Sub1_Sub1_8.anIDirect3DDevice1.b(arg1.method6557("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass78_Sub1_Sub1_8.anIDirect3DDevice1.a(arg1.method6557("environment_mapped_water_f", "dx"));
			this.aBoolean569 = this.anIDirect3DVertexShader2 != null && this.anIDirect3DPixelShader1 != null && this.aClass315_6.method6725();
		} else {
			this.aBoolean569 = false;
			this.anIDirect3DVertexShader2 = null;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	@Override
	public void method7890() {
		if (this.aBoolean568) {
			@Pc(12) IDirect3DDevice local12 = this.aClass78_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(17) Class34_Sub1 local17 = this.aClass78_Sub1_23.method6893();
			local12.SetVertexShaderConstantF(12, local17.method887(Static418.aFloatArray64), 2);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	@Override
	public void method7891() {
		if (!this.aBoolean568) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass78_Sub1_Sub1_8.anIDirect3DDevice1;
		if (this.aClass78_Sub1_23.anInt8565 <= 0) {
			local7.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(27) float local27 = this.aClass78_Sub1_23.aFloat217;
			@Pc(31) float local31 = this.aClass78_Sub1_23.aFloat223;
			local7.a(16, local27, 1.0F / (local27 - local31), 0.0F, 0.0F);
		}
		local7.b(0, (float) (this.aClass78_Sub1_23.anInt8566 >> 16 & 0xFF) / 255.0F, (float) (this.aClass78_Sub1_23.anInt8566 >> 8 & 0xFF) / 255.0F, (float) (this.aClass78_Sub1_23.anInt8566 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
	@Override
	public void method7899() {
		if (!this.aBoolean568) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass78_Sub1_Sub1_8.anIDirect3DDevice1;
		local7.SetVertexShader(null);
		local7.SetPixelShader(null);
		this.aClass78_Sub1_23.method6867(1);
		this.aClass78_Sub1_23.method6931(null);
		this.aClass78_Sub1_23.method6867(0);
		this.aClass78_Sub1_23.method6931(null);
		this.aBoolean568 = false;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7902() {
		return this.aBoolean569;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!rga;I)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) Interface20 arg1) {
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7901(@OriginalArg(0) boolean arg0) {
		@Pc(11) Interface11 local11 = this.aClass78_Sub1_23.method6861();
		if (!this.aBoolean569 || local11 == null) {
			return;
		}
		@Pc(21) IDirect3DDevice local21 = this.aClass78_Sub1_Sub1_8.anIDirect3DDevice1;
		local21.SetVertexShader(this.anIDirect3DVertexShader2);
		local21.SetPixelShader(this.anIDirect3DPixelShader1);
		this.aClass78_Sub1_23.method6867(1);
		this.aClass78_Sub1_23.method6931(local11);
		this.aClass78_Sub1_23.method6867(0);
		this.aClass78_Sub1_23.method6931(this.aClass315_6.anInterface21_1);
		this.aBoolean568 = true;
		this.method7900();
		this.method7890();
		this.method7896();
		this.method7891();
		local21.b(1, -this.aClass78_Sub1_23.aFloatArray72[0], -this.aClass78_Sub1_23.aFloatArray72[1], -this.aClass78_Sub1_23.aFloatArray72[2], 0.0F);
		local21.b(2, this.aClass78_Sub1_23.aFloat215, this.aClass78_Sub1_23.aFloat220, this.aClass78_Sub1_23.aFloat214, 1.0F);
		local21.b(3, Math.abs(this.aClass78_Sub1_23.aFloatArray72[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean568) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass78_Sub1_Sub1_8.anIDirect3DDevice1;
		@Pc(13) int local13 = 0x1 << (arg1 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg0 & 0xFFFF;
		local7.a(14, (float) (this.aClass78_Sub1_23.anInt8564 * local13 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(54) float local54 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		local7.a(15, local24, 0.0F, 0.0F, 0.0F);
		local7.b(4, (float) local28, 0.0F, 0.0F, 0.0F);
		local7.b(5, local54, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
	@Override
	public void method7900() {
		if (!this.aBoolean568) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass78_Sub1_Sub1_8.anIDirect3DDevice1;
		@Pc(19) Class34_Sub1 local19 = this.aClass78_Sub1_Sub1_8.method6888();
		@Pc(24) Class34_Sub1 local24 = this.aClass78_Sub1_Sub1_8.method6987();
		local14.a(0, local24.method888(Static418.aFloatArray64));
		local14.a(4, local19.method900(Static418.aFloatArray64));
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
	@Override
	public void method7896() {
		if (this.aBoolean568) {
			@Pc(12) IDirect3DDevice local12 = this.aClass78_Sub1_Sub1_8.anIDirect3DDevice1;
			local12.a(8, this.aClass78_Sub1_23.method6930(Static418.aFloatArray64));
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7894(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
	@Override
	public void method7898() {
		if (this.aBoolean568) {
			@Pc(7) IDirect3DDevice local7 = this.aClass78_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(12) Class34_Sub1 local12 = this.aClass78_Sub1_Sub1_8.method6987();
			local7.a(0, local12.method888(Static418.aFloatArray64));
		}
	}
}
