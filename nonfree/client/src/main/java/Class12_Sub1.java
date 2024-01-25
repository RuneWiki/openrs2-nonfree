import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!am", name = "r", descriptor = "Z")
	private boolean aBoolean28;

	@OriginalMember(owner = "client!am", name = "w", descriptor = "Lclient!hg;")
	private final Class43_Sub1_Sub1 aClass43_Sub1_Sub1_1;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "Lclient!j;")
	private final Class157 aClass157_1;

	@OriginalMember(owner = "client!am", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!am", name = "t", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!am", name = "q", descriptor = "Z")
	private final boolean aBoolean27;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!hg;Lclient!om;Lclient!j;)V")
	public Class12_Sub1(@OriginalArg(0) Class43_Sub1_Sub1 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class157 arg2) {
		super(arg0);
		this.aClass43_Sub1_Sub1_1 = arg0;
		this.aClass157_1 = arg2;
		if (arg1 != null && this.aClass43_Sub1_21.aBoolean356 && this.aClass43_Sub1_21.aBoolean366 && (this.aClass43_Sub1_Sub1_1.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass43_Sub1_Sub1_1.anIDirect3DDevice1.b(arg1.method5648("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass43_Sub1_Sub1_1.anIDirect3DDevice1.a(arg1.method5648("dx", "environment_mapped_water_f"));
			this.aBoolean27 = this.anIDirect3DVertexShader1 != null && this.anIDirect3DPixelShader1 != null && this.aClass157_1.method3972();
		} else {
			this.anIDirect3DVertexShader1 = null;
			this.anIDirect3DPixelShader1 = null;
			this.aBoolean27 = false;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BILclient!hw;)V")
	@Override
	public void method6840(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6836(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V")
	@Override
	public void method6845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean28) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass43_Sub1_Sub1_1.anIDirect3DDevice1;
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local6.a(14, (float) (this.aClass43_Sub1_21.anInt4808 * local12 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local6.a(15, local23, 0.0F, 0.0F, 0.0F);
		local6.b(4, (float) local27, 0.0F, 0.0F, 0.0F);
		local6.b(5, local36, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	@Override
	public void method6847() {
		if (!this.aBoolean28) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass43_Sub1_Sub1_1.anIDirect3DDevice1;
		@Pc(12) Class109_Sub3 local12 = this.aClass43_Sub1_Sub1_1.method4195();
		@Pc(17) Class109_Sub3 local17 = this.aClass43_Sub1_Sub1_1.method4173();
		local7.a(0, local17.method7108(Static18.aFloatArray2));
		local7.a(4, local12.method7117(Static18.aFloatArray2));
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
	@Override
	public void method6842() {
		if (!this.aBoolean28) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass43_Sub1_Sub1_1.anIDirect3DDevice1;
		local10.SetVertexShader(null);
		local10.SetPixelShader(null);
		this.aClass43_Sub1_21.method4238(1);
		this.aClass43_Sub1_21.method4298(null);
		this.aClass43_Sub1_21.method4238(0);
		this.aClass43_Sub1_21.method4298(null);
		this.aBoolean28 = false;
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6846() {
		return this.aBoolean27;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
	@Override
	public void method6841() {
		if (!this.aBoolean28) {
			return;
		}
		@Pc(11) IDirect3DDevice local11 = this.aClass43_Sub1_Sub1_1.anIDirect3DDevice1;
		if (this.aClass43_Sub1_21.anInt4832 <= 0) {
			local11.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(31) float local31 = this.aClass43_Sub1_21.aFloat106;
			@Pc(35) float local35 = this.aClass43_Sub1_21.aFloat94;
			local11.a(16, local31, 1.0F / (local31 - local35), 0.0F, 0.0F);
		}
		local11.b(0, (float) (this.aClass43_Sub1_21.anInt4820 >> 16 & 0xFF) / 255.0F, (float) (this.aClass43_Sub1_21.anInt4820 >> 8 & 0xFF) / 255.0F, (float) (this.aClass43_Sub1_21.anInt4820 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(I)V")
	@Override
	public void method6851() {
		if (this.aBoolean28) {
			@Pc(7) IDirect3DDevice local7 = this.aClass43_Sub1_Sub1_1.anIDirect3DDevice1;
			local7.a(8, this.aClass43_Sub1_21.method4295(Static18.aFloatArray2));
		}
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(B)V")
	@Override
	public void method6852() {
		if (this.aBoolean28) {
			@Pc(7) IDirect3DDevice local7 = this.aClass43_Sub1_Sub1_1.anIDirect3DDevice1;
			@Pc(12) Class109_Sub3 local12 = this.aClass43_Sub1_Sub1_1.method4173();
			local7.a(0, local12.method7108(Static18.aFloatArray2));
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
	@Override
	public void method6844() {
		if (this.aBoolean28) {
			@Pc(12) IDirect3DDevice local12 = this.aClass43_Sub1_Sub1_1.anIDirect3DDevice1;
			@Pc(17) Class109_Sub3 local17 = this.aClass43_Sub1_21.method4293();
			local12.SetVertexShaderConstantF(12, local17.method7103(Static18.aFloatArray2), 2);
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6838(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface20 local8 = this.aClass43_Sub1_21.method4302();
		if (!this.aBoolean27 || local8 == null) {
			return;
		}
		@Pc(17) IDirect3DDevice local17 = this.aClass43_Sub1_Sub1_1.anIDirect3DDevice1;
		local17.SetVertexShader(this.anIDirect3DVertexShader1);
		local17.SetPixelShader(this.anIDirect3DPixelShader1);
		this.aClass43_Sub1_21.method4238(1);
		this.aClass43_Sub1_21.method4298(local8);
		this.aClass43_Sub1_21.method4238(0);
		this.aClass43_Sub1_21.method4298(this.aClass157_1.anInterface9_1);
		this.aBoolean28 = true;
		this.method6847();
		this.method6844();
		this.method6851();
		this.method6841();
		local17.b(1, -this.aClass43_Sub1_21.aFloatArray28[0], -this.aClass43_Sub1_21.aFloatArray28[1], -this.aClass43_Sub1_21.aFloatArray28[2], 0.0F);
		local17.b(2, this.aClass43_Sub1_21.aFloat100, this.aClass43_Sub1_21.aFloat98, this.aClass43_Sub1_21.aFloat93, 1.0F);
		local17.b(3, Math.abs(this.aClass43_Sub1_21.aFloatArray28[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}
}
