import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class31_Sub5 extends Class31 {

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "Z")
	private boolean aBoolean559;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "Z")
	private boolean aBoolean557 = false;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "Lclient!ta;")
	private final Class137_Sub1_Sub2 aClass137_Sub1_Sub2_6;

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "Z")
	private final boolean aBoolean558;

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "Lclient!oga;")
	private Interface21 anInterface21_5;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!ta;Lclient!wia;)V")
	public Class31_Sub5(@OriginalArg(0) Class137_Sub1_Sub2 arg0, @OriginalArg(1) Class386 arg1) {
		super(arg0);
		this.aClass137_Sub1_Sub2_6 = arg0;
		if (arg1 == null || (this.aClass137_Sub1_Sub2_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean558 = false;
		} else {
			this.anIDirect3DVertexShader3 = this.aClass137_Sub1_Sub2_6.anIDirect3DDevice1.b(arg1.method9219("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader4 = this.aClass137_Sub1_Sub2_6.anIDirect3DDevice1.b(arg1.method9219("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass137_Sub1_Sub2_6.anIDirect3DDevice1.b(arg1.method9219("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader6 = this.aClass137_Sub1_Sub2_6.anIDirect3DDevice1.b(arg1.method9219("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader6 != null) {
				this.anInterface21_5 = this.aClass137_Sub1_22.method7982(false, 1, new int[] { 0, -1 }, 2);
				this.anInterface21_5.method9033(false, false);
				this.aBoolean558 = true;
			} else {
				this.aBoolean558 = false;
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8592(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(Z)V")
	@Override
	public void method8597() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass137_Sub1_Sub2_6.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass137_Sub1_22.XA();
		@Pc(15) int local15 = this.aClass137_Sub1_22.i();
		@Pc(25) float local25 = (float) local11 - (float) (local11 - local15) * 0.125F;
		@Pc(36) float local36 = -((float) (local11 - local15) * 0.25F) + (float) local11;
		local7.b(10, local36, 1.0F / (local25 - local36), local25, 1.0F / ((float) local11 - local25));
		local7.b(11, 1.0F / (float) this.aClass137_Sub1_22.method8035(), (float) this.aClass137_Sub1_22.method7995() / 255.0F, this.aClass137_Sub1_22.aFloat248, 1.0F / (this.aClass137_Sub1_22.aFloat248 - this.aClass137_Sub1_22.aFloat244));
		this.aClass137_Sub1_22.method8048(this.aClass137_Sub1_22.method7988());
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BILclient!kja;)V")
	@Override
	public void method8588(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
		if (arg1 != null) {
			if (this.aBoolean557) {
				this.aClass137_Sub1_22.method8069(0, Static201.aClass169_3);
				this.aClass137_Sub1_22.method7971(0, Static201.aClass169_3);
				this.aBoolean557 = false;
			}
			this.aClass137_Sub1_22.method8007(arg1);
			this.aClass137_Sub1_22.method8078(arg0);
		} else if (!this.aBoolean557) {
			this.aClass137_Sub1_22.method8007(this.aClass137_Sub1_22.anInterface15_3);
			this.aClass137_Sub1_22.method8078(1);
			this.aClass137_Sub1_22.method8069(0, Static567.aClass169_7);
			this.aClass137_Sub1_22.method7971(0, Static567.aClass169_7);
			this.aBoolean557 = true;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8595(@OriginalArg(1) boolean arg0) {
		this.aBoolean559 = arg0;
		this.aClass137_Sub1_22.method8081(1);
		this.aClass137_Sub1_22.method8007(this.anInterface21_5);
		this.aClass137_Sub1_22.method7969(Static129.aClass87_4, Static461.aClass87_5);
		this.aClass137_Sub1_22.method8069(0, Static490.aClass169_6);
		this.aClass137_Sub1_22.method8047(false, true, Static201.aClass169_3, 2);
		this.aClass137_Sub1_22.method7971(0, Static567.aClass169_7);
		this.aClass137_Sub1_22.method8081(0);
		this.method8599();
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8593() {
		return this.aBoolean558;
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
	private void method6626() {
		if (this.anIDirect3DVertexShader2 == null || !this.aBoolean559) {
			return;
		}
		@Pc(10) Class26_Sub1 local10 = this.aClass137_Sub1_22.method8002();
		@Pc(14) IDirect3DDevice local14 = this.aClass137_Sub1_Sub2_6.anIDirect3DDevice1;
		local14.b(13, this.aClass137_Sub1_22.aFloat250 * this.aClass137_Sub1_22.aFloat235, this.aClass137_Sub1_22.aFloat235 * this.aClass137_Sub1_22.aFloat245, this.aClass137_Sub1_22.aFloat246 * this.aClass137_Sub1_22.aFloat235, 1.0F);
		local14.b(14, this.aClass137_Sub1_22.aFloat250 * this.aClass137_Sub1_22.aFloat238, this.aClass137_Sub1_22.aFloat245 * this.aClass137_Sub1_22.aFloat238, this.aClass137_Sub1_22.aFloat238 * this.aClass137_Sub1_22.aFloat246, 1.0F);
		local14.b(16, this.aClass137_Sub1_22.aFloat250 * this.aClass137_Sub1_22.aFloat251, this.aClass137_Sub1_22.aFloat245 * this.aClass137_Sub1_22.aFloat251, this.aClass137_Sub1_22.aFloat246 * this.aClass137_Sub1_22.aFloat251, 1.0F);
		local10.method800(this.aClass137_Sub1_22.aFloatArray72[2], this.aClass137_Sub1_22.aFloatArray72[1], Static460.aFloatArray60, this.aClass137_Sub1_22.aFloatArray72[0]);
		local14.SetVertexShaderConstantF(15, Static460.aFloatArray60, 1);
		local10.method800(this.aClass137_Sub1_22.aFloatArray73[2], this.aClass137_Sub1_22.aFloatArray73[1], Static460.aFloatArray60, this.aClass137_Sub1_22.aFloatArray73[0]);
		local14.SetVertexShaderConstantF(17, Static460.aFloatArray60, 1);
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V")
	@Override
	public void method8598() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass137_Sub1_Sub2_6.anIDirect3DDevice1;
			local8.a(4, this.aClass137_Sub1_22.method8001(Static460.aFloatArray59));
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)V")
	@Override
	public void method8596() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass137_Sub1_Sub2_6.anIDirect3DDevice1;
			@Pc(18) Class26_Sub1 local18 = this.aClass137_Sub1_22.method8088();
			local13.SetVertexShaderConstantF(8, local18.method785(Static460.aFloatArray59), 2);
		}
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(Z)V")
	@Override
	public void method8599() {
		@Pc(6) IDirect3DDevice local6 = this.aClass137_Sub1_Sub2_6.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass137_Sub1_22.method7985();
		@Pc(16) Class26_Sub1 local16 = this.aClass137_Sub1_22.method8076();
		@Pc(30) IDirect3DVertexShader local30;
		if (this.aBoolean559) {
			local30 = Integer.MAX_VALUE == local11 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader6;
		} else {
			local30 = Integer.MIN_VALUE == ~local11 ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader5;
		}
		if (local30 != this.anIDirect3DVertexShader2) {
			this.anIDirect3DVertexShader2 = local30;
			this.aClass137_Sub1_Sub2_6.method8098(local30);
			this.method6626();
			this.method8598();
			this.method8596();
			this.method8589();
			this.method8586();
			this.method8597();
		}
		local16.method798(0.0F, -1.0F, (float) local11, 0.0F, Static460.aFloatArray60);
		local6.a(12, Static460.aFloatArray60);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
	@Override
	public void method8589() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass137_Sub1_Sub2_6.anIDirect3DDevice1;
			@Pc(18) Class26_Sub1 local18 = this.aClass137_Sub1_Sub2_6.method8016();
			local13.a(0, local18.method780(Static460.aFloatArray59));
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	@Override
	public void method8591() {
		this.aClass137_Sub1_22.method8081(1);
		this.aClass137_Sub1_22.method8007((Interface15) null);
		this.aClass137_Sub1_22.method7969(Static575.aClass87_7, Static575.aClass87_7);
		this.aClass137_Sub1_22.method8069(0, Static201.aClass169_3);
		this.aClass137_Sub1_22.method8069(2, Static490.aClass169_6);
		this.aClass137_Sub1_22.method7971(0, Static201.aClass169_3);
		this.aClass137_Sub1_22.method8081(0);
		if (this.aBoolean557) {
			this.aClass137_Sub1_22.method8069(0, Static201.aClass169_3);
			this.aClass137_Sub1_22.method7971(0, Static201.aClass169_3);
			this.aBoolean557 = false;
		}
		if (this.anIDirect3DVertexShader2 != null) {
			this.aClass137_Sub1_Sub2_6.method8098((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	@Override
	public void method8586() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass137_Sub1_Sub2_6.anIDirect3DDevice1;
			@Pc(17) Class26_Sub1 local17 = this.aClass137_Sub1_Sub2_6.method8016();
			local12.a(0, local17.method780(Static460.aFloatArray59));
		}
	}
}
