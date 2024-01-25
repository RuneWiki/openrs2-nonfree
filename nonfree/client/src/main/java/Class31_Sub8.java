import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class31_Sub8 extends Class31 {

	@OriginalMember(owner = "client!tca", name = "n", descriptor = "Lclient!ta;")
	private final Class137_Sub1_Sub2 aClass137_Sub1_Sub2_8;

	@OriginalMember(owner = "client!tca", name = "l", descriptor = "Lclient!ui;")
	private final Class353 aClass353_7;

	@OriginalMember(owner = "client!tca", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!ta;Lclient!wia;Lclient!ui;)V")
	public Class31_Sub8(@OriginalArg(0) Class137_Sub1_Sub2 arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Class353 arg2) {
		super(arg0);
		this.aClass137_Sub1_Sub2_8 = arg0;
		this.aClass353_7 = arg2;
		if (arg1 != null && this.aClass353_7.method8486() && (this.aClass137_Sub1_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass137_Sub1_Sub2_8.anIDirect3DDevice1.b(arg1.method9219("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader8 = null;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BILclient!kja;)V")
	@Override
	public void method8588(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) IDirect3DDevice local9 = this.aClass137_Sub1_Sub2_8.anIDirect3DDevice1;
		if (this.aClass353_7.aBoolean715) {
			@Pc(50) float local50 = (float) (this.aClass137_Sub1_22.anInt9719 % 4000) / 4000.0F;
			this.aClass137_Sub1_22.method8007(this.aClass353_7.anInterface9_1);
			local9.b(11, local50, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(23) int local23 = this.aClass137_Sub1_22.anInt9719 % 4000 * 16 / 4000;
			this.aClass137_Sub1_22.method8007(this.aClass353_7.anInterface21Array1[local23]);
			local9.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Z)V")
	@Override
	public void method8589() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass137_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(11) Class26_Sub1 local11 = this.aClass137_Sub1_Sub2_8.method8016();
			local6.a(0, local11.method780(Static564.aFloatArray81));
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V")
	@Override
	public void method8586() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass137_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(19) Class26_Sub1 local19 = this.aClass137_Sub1_Sub2_8.method8016();
			local12.a(0, local19.method780(Static564.aFloatArray81));
		}
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8593() {
		return this.anIDirect3DVertexShader8 != null;
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(Z)V")
	@Override
	public void method8597() {
		if (this.anIDirect3DVertexShader8 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass137_Sub1_Sub2_8.anIDirect3DDevice1;
		if (this.aClass137_Sub1_22.anInt9727 <= 0) {
			local7.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(24) float local24 = this.aClass137_Sub1_22.aFloat248;
			@Pc(28) float local28 = this.aClass137_Sub1_22.aFloat244;
			@Pc(32) float local32 = local28 - 512.0F;
			local7.b(10, local32, 1.0F / (local28 - local32), local28, 1.0F / (local24 - local28));
		}
		this.aClass137_Sub1_22.method8048(this.aClass137_Sub1_22.anInt9723);
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(B)V")
	@Override
	public void method8598() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass137_Sub1_Sub2_8.anIDirect3DDevice1;
			local8.a(4, this.aClass137_Sub1_22.method8001(Static564.aFloatArray81));
		}
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(Z)V")
	@Override
	public void method8596() {
		if (this.anIDirect3DVertexShader8 == null) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass137_Sub1_Sub2_8.anIDirect3DDevice1;
		@Pc(21) Class26_Sub1 local21 = this.aClass137_Sub1_22.method8088();
		local21.method785(Static564.aFloatArray81);
		Static564.aFloatArray81[2] *= 0.25F;
		Static564.aFloatArray81[0] *= 0.25F;
		Static564.aFloatArray81[1] *= 0.25F;
		Static564.aFloatArray81[5] *= 0.25F;
		Static564.aFloatArray81[7] *= 0.25F;
		Static564.aFloatArray81[6] *= 0.25F;
		Static564.aFloatArray81[4] *= 0.25F;
		Static564.aFloatArray81[3] *= 0.25F;
		local12.SetVertexShaderConstantF(8, Static564.aFloatArray81, 2);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8592(@OriginalArg(0) boolean arg0) {
		this.aClass137_Sub1_22.method7969(Static129.aClass87_4, Static15.aClass87_1);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V")
	@Override
	public void method8591() {
		this.aClass137_Sub1_Sub2_8.method8098((IDirect3DVertexShader) null);
		this.aClass137_Sub1_22.method8069(0, Static201.aClass169_3);
		this.aClass137_Sub1_22.method8069(1, Static370.aClass169_8);
		this.aClass137_Sub1_22.method8069(2, Static490.aClass169_6);
		this.aClass137_Sub1_22.method8060(true);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8595(@OriginalArg(1) boolean arg0) {
		this.aClass137_Sub1_22.method8069(0, Static201.aClass169_3);
		this.aClass137_Sub1_22.method8069(1, Static490.aClass169_6);
		this.aClass137_Sub1_22.method8047(true, false, Static370.aClass169_8, 2);
		this.aClass137_Sub1_22.method8060(false);
		this.aClass137_Sub1_Sub2_8.method8098(this.anIDirect3DVertexShader8);
		this.method8589();
		this.method8596();
		this.method8598();
		this.method8597();
	}
}
