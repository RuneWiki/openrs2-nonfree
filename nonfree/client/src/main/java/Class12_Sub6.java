import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class12_Sub6 extends Class12 {

	@OriginalMember(owner = "client!me", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "Z")
	private boolean aBoolean471;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "Lclient!hg;")
	private final Class43_Sub1_Sub1 aClass43_Sub1_Sub1_7;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "Z")
	private final boolean aBoolean470;

	@OriginalMember(owner = "client!me", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!me", name = "A", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!me", name = "y", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "Lclient!hi;")
	private Interface10 anInterface10_3;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!hg;Lclient!om;)V")
	public Class12_Sub6(@OriginalArg(0) Class43_Sub1_Sub1 arg0, @OriginalArg(1) Class246 arg1) {
		super(arg0);
		this.aClass43_Sub1_Sub1_7 = arg0;
		if (arg1 == null || (this.aClass43_Sub1_Sub1_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean470 = false;
		} else {
			this.anIDirect3DVertexShader4 = this.aClass43_Sub1_Sub1_7.anIDirect3DDevice1.b(arg1.method5648("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader6 = this.aClass43_Sub1_Sub1_7.anIDirect3DDevice1.b(arg1.method5648("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader3 = this.aClass43_Sub1_Sub1_7.anIDirect3DDevice1.b(arg1.method5648("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader5 = this.aClass43_Sub1_Sub1_7.anIDirect3DDevice1.b(arg1.method5648("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader5 != null) {
				this.anInterface10_3 = this.aClass43_Sub1_21.method4303(1, new int[] { 0, -1 }, false, 2);
				this.anInterface10_3.method6171(false, false);
				this.aBoolean470 = true;
			} else {
				this.aBoolean470 = false;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
	@Override
	public void method6844() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass43_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(12) Class109_Sub3 local12 = this.aClass43_Sub1_21.method4293();
			local7.SetVertexShaderConstantF(8, local12.method7103(Static320.aFloatArray47), 2);
		}
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
	@Override
	public void method6851() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass43_Sub1_Sub1_7.anIDirect3DDevice1;
			local12.a(4, this.aClass43_Sub1_21.method4295(Static320.aFloatArray47));
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
	@Override
	public void method6847() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass43_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(13) Class109_Sub3 local13 = this.aClass43_Sub1_Sub1_7.method4173();
			local8.a(0, local13.method7108(Static320.aFloatArray47));
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V")
	private void method4998() {
		if (this.anIDirect3DVertexShader2 == null || !this.aBoolean471) {
			return;
		}
		@Pc(16) Class109_Sub3 local16 = this.aClass43_Sub1_21.method4277();
		@Pc(20) IDirect3DDevice local20 = this.aClass43_Sub1_Sub1_7.anIDirect3DDevice1;
		local20.a(13, this.aClass43_Sub1_21.aFloat97 * this.aClass43_Sub1_21.aFloat100, this.aClass43_Sub1_21.aFloat98 * this.aClass43_Sub1_21.aFloat97, this.aClass43_Sub1_21.aFloat93 * this.aClass43_Sub1_21.aFloat97, 1.0F);
		local20.a(14, this.aClass43_Sub1_21.aFloat105 * this.aClass43_Sub1_21.aFloat100, this.aClass43_Sub1_21.aFloat105 * this.aClass43_Sub1_21.aFloat98, this.aClass43_Sub1_21.aFloat105 * this.aClass43_Sub1_21.aFloat93, 1.0F);
		local20.a(16, this.aClass43_Sub1_21.aFloat100 * this.aClass43_Sub1_21.aFloat102, this.aClass43_Sub1_21.aFloat98 * this.aClass43_Sub1_21.aFloat102, this.aClass43_Sub1_21.aFloat93 * this.aClass43_Sub1_21.aFloat102, 1.0F);
		local16.method7109(this.aClass43_Sub1_21.aFloatArray28[0], this.aClass43_Sub1_21.aFloatArray28[2], this.aClass43_Sub1_21.aFloatArray28[1], Static320.aFloatArray46);
		local20.SetVertexShaderConstantF(15, Static320.aFloatArray46, 1);
		local16.method7109(this.aClass43_Sub1_21.aFloatArray30[0], this.aClass43_Sub1_21.aFloatArray30[2], this.aClass43_Sub1_21.aFloatArray30[1], Static320.aFloatArray46);
		local20.SetVertexShaderConstantF(17, Static320.aFloatArray46, 1);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
	@Override
	public void method6845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
	@Override
	public void method6852() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass43_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(12) Class109_Sub3 local12 = this.aClass43_Sub1_Sub1_7.method4173();
			local7.a(0, local12.method7108(Static320.aFloatArray47));
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
	@Override
	public void method6841() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass43_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(17) int local17 = this.aClass43_Sub1_21.U();
		@Pc(21) int local21 = this.aClass43_Sub1_21.BA();
		@Pc(33) float local33 = -((float) (local17 - local21) * 0.125F) + (float) local17;
		@Pc(45) float local45 = -((float) (local17 - local21) * 0.25F) + (float) local17;
		local13.a(10, local45, 1.0F / (local33 - local45), local33, 1.0F / ((float) local17 - local33));
		local13.a(11, 1.0F / (float) this.aClass43_Sub1_21.method4244(), (float) this.aClass43_Sub1_21.method4257() / 255.0F, this.aClass43_Sub1_21.aFloat106, 1.0F / (this.aClass43_Sub1_21.aFloat106 - this.aClass43_Sub1_21.aFloat94));
		this.aClass43_Sub1_21.method4266(this.aClass43_Sub1_21.method4187());
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	@Override
	public void method6837() {
		@Pc(3) IDirect3DDevice local3 = this.aClass43_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(14) int local14 = this.aClass43_Sub1_21.method4206();
		@Pc(19) Class109_Sub3 local19 = this.aClass43_Sub1_21.method4195();
		@Pc(33) IDirect3DVertexShader local33;
		if (this.aBoolean471) {
			local33 = ~local14 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader6 : this.anIDirect3DVertexShader5;
		} else {
			local33 = Integer.MAX_VALUE == local14 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader3;
		}
		if (this.anIDirect3DVertexShader2 != local33) {
			this.anIDirect3DVertexShader2 = local33;
			local3.SetVertexShader(local33);
			this.method4998();
			this.method6851();
			this.method6844();
			this.method6852();
			this.method6847();
			this.method6841();
		}
		local19.method7102(0.0F, Static320.aFloatArray46, 0.0F, -1.0F, (float) local14);
		local3.a(12, Static320.aFloatArray46);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	@Override
	public void method6842() {
		this.aClass43_Sub1_21.method4238(1);
		this.aClass43_Sub1_21.method4298(null);
		this.aClass43_Sub1_21.method4253(Static106.aClass37_2, Static106.aClass37_2);
		this.aClass43_Sub1_21.method4251(0, Static74.aClass252_1);
		this.aClass43_Sub1_21.method4251(2, Static88.aClass252_2);
		this.aClass43_Sub1_21.method4241(0, Static74.aClass252_1);
		this.aClass43_Sub1_21.method4238(0);
		this.aClass43_Sub1_21.method4251(0, Static74.aClass252_1);
		this.aClass43_Sub1_21.method4241(0, Static74.aClass252_1);
		if (this.anIDirect3DVertexShader2 != null) {
			this.aClass43_Sub1_Sub1_7.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6836(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BILclient!hw;)V")
	@Override
	public void method6840(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		if (arg1 == null) {
			this.aClass43_Sub1_21.method4298(this.aClass43_Sub1_21.anInterface11_3);
			this.aClass43_Sub1_21.method4183(1);
			this.aClass43_Sub1_21.method4251(0, Static165.aClass252_3);
			this.aClass43_Sub1_21.method4241(0, Static165.aClass252_3);
		} else {
			this.aClass43_Sub1_21.method4298(arg1);
			this.aClass43_Sub1_21.method4183(arg0);
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6846() {
		return this.aBoolean470;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6838(@OriginalArg(0) boolean arg0) {
		this.aBoolean471 = arg0;
		this.aClass43_Sub1_21.method4238(1);
		this.aClass43_Sub1_21.method4298(this.anInterface10_3);
		this.aClass43_Sub1_21.method4253(Static474.aClass37_3, Static587.aClass37_5);
		this.aClass43_Sub1_21.method4251(0, Static88.aClass252_2);
		this.aClass43_Sub1_21.method4268(Static74.aClass252_1, true, false, 2);
		this.aClass43_Sub1_21.method4241(0, Static165.aClass252_3);
		this.aClass43_Sub1_21.method4238(0);
		this.method6837();
	}
}
