import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class13_Sub4 extends Class13 {

	@OriginalMember(owner = "client!iw", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!iw", name = "y", descriptor = "Z")
	private boolean aBoolean360;

	@OriginalMember(owner = "client!iw", name = "p", descriptor = "Z")
	private boolean aBoolean361 = false;

	@OriginalMember(owner = "client!iw", name = "o", descriptor = "Lclient!sd;")
	private final Class57_Sub3_Sub2 aClass57_Sub3_Sub2_7;

	@OriginalMember(owner = "client!iw", name = "x", descriptor = "Z")
	private final boolean aBoolean359;

	@OriginalMember(owner = "client!iw", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!iw", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!iw", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!iw", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!iw", name = "r", descriptor = "Lclient!wp;")
	private Interface26 anInterface26_2;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lclient!sd;Lclient!la;)V")
	public Class13_Sub4(@OriginalArg(0) Class57_Sub3_Sub2 arg0, @OriginalArg(1) Class208 arg1) {
		super(arg0);
		this.aClass57_Sub3_Sub2_7 = arg0;
		if (arg1 == null || (this.aClass57_Sub3_Sub2_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean359 = false;
		} else {
			this.anIDirect3DVertexShader5 = this.aClass57_Sub3_Sub2_7.anIDirect3DDevice1.a(arg1.method4999("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader2 = this.aClass57_Sub3_Sub2_7.anIDirect3DDevice1.a(arg1.method4999("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader3 = this.aClass57_Sub3_Sub2_7.anIDirect3DDevice1.a(arg1.method4999("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader4 = this.aClass57_Sub3_Sub2_7.anIDirect3DDevice1.a(arg1.method4999("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null) {
				this.anInterface26_2 = this.aClass57_Sub3_21.method7787(new int[] { 0, -1 }, 2, 1, false);
				this.anInterface26_2.method4348(false, false);
				this.aBoolean359 = true;
			} else {
				this.aBoolean359 = false;
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IILclient!rca;)V")
	@Override
	public void method8274(@OriginalArg(0) int arg0, @OriginalArg(2) Interface22 arg1) {
		if (arg1 != null) {
			if (this.aBoolean361) {
				this.aClass57_Sub3_21.method7866(0, Static57.aClass312_1);
				this.aClass57_Sub3_21.method7781(0, Static57.aClass312_1);
				this.aBoolean361 = false;
			}
			this.aClass57_Sub3_21.method7813(arg1);
			this.aClass57_Sub3_21.method7764(arg0);
		} else if (!this.aBoolean361) {
			this.aClass57_Sub3_21.method7813(this.aClass57_Sub3_21.anInterface22_3);
			this.aClass57_Sub3_21.method7764(1);
			this.aClass57_Sub3_21.method7866(0, Static79.aClass312_2);
			this.aClass57_Sub3_21.method7781(0, Static79.aClass312_2);
			this.aBoolean361 = true;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8270() {
		return this.aBoolean359;
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V")
	@Override
	public void method8272() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass57_Sub3_Sub2_7.anIDirect3DDevice1;
		@Pc(12) int local12 = this.aClass57_Sub3_21.XA();
		@Pc(16) int local16 = this.aClass57_Sub3_21.i();
		@Pc(28) float local28 = -((float) (local12 - local16) * 0.125F) + (float) local12;
		@Pc(39) float local39 = (float) local12 - (float) (local12 - local16) * 0.25F;
		local8.b(10, local39, 1.0F / (local28 - local39), local28, 1.0F / ((float) local12 - local28));
		local8.b(11, 1.0F / (float) this.aClass57_Sub3_21.method7794(), (float) this.aClass57_Sub3_21.method7758() / 255.0F, this.aClass57_Sub3_21.aFloat170, 1.0F / (this.aClass57_Sub3_21.aFloat170 - this.aClass57_Sub3_21.aFloat172));
		this.aClass57_Sub3_21.method7806(this.aClass57_Sub3_21.method7792());
	}

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "(I)V")
	@Override
	public void method8267() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(18) IDirect3DDevice local18 = this.aClass57_Sub3_Sub2_7.anIDirect3DDevice1;
			@Pc(23) Class203_Sub1 local23 = this.aClass57_Sub3_Sub2_7.method7865();
			local18.a(0, local23.method4843(Static266.aFloatArray35));
		}
	}

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "(I)V")
	private void method3901() {
		if (this.anIDirect3DVertexShader1 == null || !this.aBoolean360) {
			return;
		}
		@Pc(12) Class203_Sub1 local12 = this.aClass57_Sub3_21.method7812();
		@Pc(16) IDirect3DDevice local16 = this.aClass57_Sub3_Sub2_7.anIDirect3DDevice1;
		local16.b(13, this.aClass57_Sub3_21.aFloat171 * this.aClass57_Sub3_21.aFloat165, this.aClass57_Sub3_21.aFloat177 * this.aClass57_Sub3_21.aFloat171, this.aClass57_Sub3_21.aFloat171 * this.aClass57_Sub3_21.aFloat179, 1.0F);
		local16.b(14, this.aClass57_Sub3_21.aFloat174 * this.aClass57_Sub3_21.aFloat165, this.aClass57_Sub3_21.aFloat177 * this.aClass57_Sub3_21.aFloat174, this.aClass57_Sub3_21.aFloat174 * this.aClass57_Sub3_21.aFloat179, 1.0F);
		local16.b(16, this.aClass57_Sub3_21.aFloat167 * this.aClass57_Sub3_21.aFloat165, this.aClass57_Sub3_21.aFloat167 * this.aClass57_Sub3_21.aFloat177, this.aClass57_Sub3_21.aFloat167 * this.aClass57_Sub3_21.aFloat179, 1.0F);
		local12.method4849(Static266.aFloatArray36, this.aClass57_Sub3_21.aFloatArray92[0], this.aClass57_Sub3_21.aFloatArray92[1], this.aClass57_Sub3_21.aFloatArray92[2]);
		local16.SetVertexShaderConstantF(15, Static266.aFloatArray36, 1);
		local12.method4849(Static266.aFloatArray36, this.aClass57_Sub3_21.aFloatArray94[0], this.aClass57_Sub3_21.aFloatArray94[1], this.aClass57_Sub3_21.aFloatArray94[2]);
		local16.SetVertexShaderConstantF(17, Static266.aFloatArray36, 1);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
	@Override
	public void method8261() {
		this.aClass57_Sub3_21.method7795(1);
		this.aClass57_Sub3_21.method7813((Interface22) null);
		this.aClass57_Sub3_21.method7733(Static313.aClass34_88, Static313.aClass34_88);
		this.aClass57_Sub3_21.method7866(0, Static57.aClass312_1);
		this.aClass57_Sub3_21.method7866(2, Static291.aClass312_3);
		this.aClass57_Sub3_21.method7781(0, Static57.aClass312_1);
		this.aClass57_Sub3_21.method7795(0);
		if (this.aBoolean361) {
			this.aClass57_Sub3_21.method7866(0, Static57.aClass312_1);
			this.aClass57_Sub3_21.method7781(0, Static57.aClass312_1);
			this.aBoolean361 = false;
		}
		if (this.anIDirect3DVertexShader1 != null) {
			this.aClass57_Sub3_Sub2_7.method7872((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(B)V")
	@Override
	public void method8269() {
		@Pc(11) IDirect3DDevice local11 = this.aClass57_Sub3_Sub2_7.anIDirect3DDevice1;
		@Pc(16) int local16 = this.aClass57_Sub3_21.method7756();
		@Pc(21) Class203_Sub1 local21 = this.aClass57_Sub3_21.method7867();
		@Pc(36) IDirect3DVertexShader local36;
		if (this.aBoolean360) {
			local36 = Integer.MAX_VALUE == local16 ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader4;
		} else {
			local36 = local16 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader3;
		}
		if (this.anIDirect3DVertexShader1 != local36) {
			this.anIDirect3DVertexShader1 = local36;
			this.aClass57_Sub3_Sub2_7.method7872(local36);
			this.method3901();
			this.method8260();
			this.method8268();
			this.method8267();
			this.method8266();
			this.method8272();
		}
		local21.method4840(Static266.aFloatArray36, 0.0F, 0.0F, (float) local16, -1.0F);
		local11.a(12, Static266.aFloatArray36);
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(B)V")
	@Override
	public void method8266() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass57_Sub3_Sub2_7.anIDirect3DDevice1;
			@Pc(13) Class203_Sub1 local13 = this.aClass57_Sub3_Sub2_7.method7865();
			local8.a(0, local13.method4843(Static266.aFloatArray35));
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8262(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V")
	@Override
	public void method8268() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass57_Sub3_Sub2_7.anIDirect3DDevice1;
			@Pc(20) Class203_Sub1 local20 = this.aClass57_Sub3_21.method7761();
			local15.SetVertexShaderConstantF(8, local20.method4835(Static266.aFloatArray35), 2);
		}
	}

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "(I)V")
	@Override
	public void method8260() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(18) IDirect3DDevice local18 = this.aClass57_Sub3_Sub2_7.anIDirect3DDevice1;
			local18.a(4, this.aClass57_Sub3_21.method7823(Static266.aFloatArray35));
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8273(@OriginalArg(0) boolean arg0) {
		this.aBoolean360 = arg0;
		this.aClass57_Sub3_21.method7795(1);
		this.aClass57_Sub3_21.method7813(this.anInterface26_2);
		this.aClass57_Sub3_21.method7733(Static362.aClass34_172, Static141.aClass34_77);
		this.aClass57_Sub3_21.method7866(0, Static291.aClass312_3);
		this.aClass57_Sub3_21.method7750(false, 2, true, Static57.aClass312_1);
		this.aClass57_Sub3_21.method7781(0, Static79.aClass312_2);
		this.aClass57_Sub3_21.method7795(0);
		this.method8269();
	}
}
