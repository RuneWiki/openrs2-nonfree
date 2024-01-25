import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class34_Sub8 extends Class34 {

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "Z")
	private boolean aBoolean576;

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "Lclient!vg;")
	private final Class90_Sub3_Sub2 aClass90_Sub3_Sub2_8;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Z")
	private final boolean aBoolean575;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!vg;Lclient!pj;)V")
	public Class34_Sub8(@OriginalArg(0) Class90_Sub3_Sub2 arg0, @OriginalArg(1) Class248 arg1) {
		super(arg0);
		this.aClass90_Sub3_Sub2_8 = arg0;
		if ((this.aClass90_Sub3_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader3 = this.aClass90_Sub3_Sub2_8.anIDirect3DDevice1.a(arg1.method5794("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader6 = this.aClass90_Sub3_Sub2_8.anIDirect3DDevice1.a(arg1.method5794("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader2 = this.aClass90_Sub3_Sub2_8.anIDirect3DDevice1.a(arg1.method5794("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass90_Sub3_Sub2_8.anIDirect3DDevice1.a(arg1.method5794("uw_model_lit", "dx"));
			this.aBoolean575 = this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader5 != null;
		} else {
			this.aBoolean575 = false;
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7271(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	@Override
	public void method7272() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass90_Sub3_Sub2_8.anIDirect3DDevice1;
			@Pc(16) Class93_Sub3 local16 = this.aClass90_Sub3_19.method7527();
			local11.SetVertexShaderConstantF(8, local16.method3769(Static519.aFloatArray77), 2);
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
	@Override
	public void method7280() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass90_Sub3_Sub2_8.anIDirect3DDevice1;
			local6.a(4, this.aClass90_Sub3_19.method7621(Static519.aFloatArray77));
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	@Override
	public void method7273() {
		@Pc(3) IDirect3DDevice local3 = this.aClass90_Sub3_Sub2_8.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass90_Sub3_19.method7544();
		@Pc(13) Class93_Sub3 local13 = this.aClass90_Sub3_19.method7588();
		@Pc(25) IDirect3DVertexShader local25;
		if (this.aBoolean576) {
			local25 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader6 : this.anIDirect3DVertexShader5;
		} else {
			local25 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader2;
		}
		if (this.anIDirect3DVertexShader4 != local25) {
			this.anIDirect3DVertexShader4 = local25;
			local3.SetVertexShader(local25);
			this.method7092();
			this.method7280();
			this.method7272();
			this.method7270();
			this.method7278();
			this.method7279();
		}
		local13.method3764(-1.0F, Static519.aFloatArray78, (float) 0, 0.0F, (float) local8);
		local3.a(12, Static519.aFloatArray78);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7269(@OriginalArg(1) boolean arg0) {
		this.aBoolean576 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
	private void method7092() {
		if (this.anIDirect3DVertexShader4 == null || !this.aBoolean576) {
			return;
		}
		@Pc(11) Class93_Sub3 local11 = this.aClass90_Sub3_19.method7588();
		@Pc(15) IDirect3DDevice local15 = this.aClass90_Sub3_Sub2_8.anIDirect3DDevice1;
		local15.a(13, this.aClass90_Sub3_19.aFloat190 * this.aClass90_Sub3_19.aFloat201, this.aClass90_Sub3_19.aFloat204 * this.aClass90_Sub3_19.aFloat201, this.aClass90_Sub3_19.aFloat206 * this.aClass90_Sub3_19.aFloat201, 1.0F);
		local15.a(14, this.aClass90_Sub3_19.aFloat198 * this.aClass90_Sub3_19.aFloat190, this.aClass90_Sub3_19.aFloat198 * this.aClass90_Sub3_19.aFloat204, this.aClass90_Sub3_19.aFloat198 * this.aClass90_Sub3_19.aFloat206, 1.0F);
		local15.a(16, this.aClass90_Sub3_19.aFloat202 * this.aClass90_Sub3_19.aFloat190, this.aClass90_Sub3_19.aFloat202 * this.aClass90_Sub3_19.aFloat204, this.aClass90_Sub3_19.aFloat202 * this.aClass90_Sub3_19.aFloat206, 1.0F);
		local11.method3760(Static519.aFloatArray78, this.aClass90_Sub3_19.aFloatArray89[2], this.aClass90_Sub3_19.aFloatArray89[1], this.aClass90_Sub3_19.aFloatArray89[0]);
		local15.SetVertexShaderConstantF(15, Static519.aFloatArray78, 1);
		local11.method3760(Static519.aFloatArray78, this.aClass90_Sub3_19.aFloatArray84[2], this.aClass90_Sub3_19.aFloatArray84[1], this.aClass90_Sub3_19.aFloatArray84[0]);
		local15.SetVertexShaderConstantF(15, Static519.aFloatArray78, 1);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method7277(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		this.aClass90_Sub3_19.method7624(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
	@Override
	public void method7279() {
		if (this.anIDirect3DVertexShader4 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass90_Sub3_Sub2_8.anIDirect3DDevice1;
		@Pc(10) int local10 = this.aClass90_Sub3_19.IA();
		@Pc(14) int local14 = this.aClass90_Sub3_19.U();
		@Pc(25) float local25 = -((float) (local10 - local14) * 0.125F) + (float) local10;
		@Pc(36) float local36 = (float) local10 - (float) (local10 - local14) * 0.25F;
		local6.a(10, local36, 1.0F / (local25 - local36), local25, 1.0F / ((float) local10 - local25));
		local6.a(11, 1.0F / (float) this.aClass90_Sub3_19.method7639(), (float) this.aClass90_Sub3_19.method7649() / 255.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	@Override
	public void method7270() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass90_Sub3_Sub2_8.anIDirect3DDevice1;
			@Pc(18) Class93_Sub3 local18 = this.aClass90_Sub3_Sub2_8.method7574();
			local13.a(0, local18.method3756(Static519.aFloatArray77));
		}
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
	@Override
	public void method7278() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass90_Sub3_Sub2_8.anIDirect3DDevice1;
			@Pc(18) Class93_Sub3 local18 = this.aClass90_Sub3_Sub2_8.method7574();
			local13.a(0, local18.method3756(Static519.aFloatArray77));
		}
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7276() {
		return this.aBoolean575;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	@Override
	public void method7282() {
		if (this.anIDirect3DVertexShader4 != null) {
			this.aClass90_Sub3_Sub2_8.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader4 = null;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
