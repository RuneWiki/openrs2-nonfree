import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class22_Sub6 extends Class22 {

	@OriginalMember(owner = "client!uba", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!uba", name = "r", descriptor = "Z")
	private boolean aBoolean639;

	@OriginalMember(owner = "client!uba", name = "s", descriptor = "Lclient!tga;")
	private final Class14_Sub2_Sub2 aClass14_Sub2_Sub2_7;

	@OriginalMember(owner = "client!uba", name = "p", descriptor = "Z")
	private final boolean aBoolean638;

	@OriginalMember(owner = "client!uba", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!uba", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!uba", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!uba", name = "j", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lclient!tga;Lclient!pfa;)V")
	public Class22_Sub6(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) Class251 arg1) {
		super(arg0);
		this.aClass14_Sub2_Sub2_7 = arg0;
		if ((this.aClass14_Sub2_Sub2_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean638 = false;
		} else {
			this.anIDirect3DVertexShader2 = this.aClass14_Sub2_Sub2_7.anIDirect3DDevice1.a(arg1.method5762("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass14_Sub2_Sub2_7.anIDirect3DDevice1.a(arg1.method5762("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader3 = this.aClass14_Sub2_Sub2_7.anIDirect3DDevice1.a(arg1.method5762("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader1 = this.aClass14_Sub2_Sub2_7.anIDirect3DDevice1.a(arg1.method5762("uw_model_lit", "dx"));
			this.aBoolean638 = this.anIDirect3DVertexShader1 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader3 != null;
		}
	}

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "(I)V")
	@Override
	public void method7652() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass14_Sub2_Sub2_7.anIDirect3DDevice1;
			@Pc(13) Class54_Sub3 local13 = this.aClass14_Sub2_20.method7031();
			local8.SetVertexShaderConstantF(8, local13.method5460(Static525.aFloatArray70), 2);
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
	@Override
	public void method7643() {
		if (this.anIDirect3DVertexShader4 != null) {
			this.aClass14_Sub2_Sub2_7.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader4 = null;
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BILclient!gl;)V")
	@Override
	public void method7645(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
		this.aClass14_Sub2_20.method7034(arg1);
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)V")
	@Override
	public void method7650() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass14_Sub2_Sub2_7.anIDirect3DDevice1;
			local15.a(4, this.aClass14_Sub2_20.method6993(Static525.aFloatArray70));
		}
	}

	@OriginalMember(owner = "client!uba", name = "d", descriptor = "(I)V")
	@Override
	public void method7653() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass14_Sub2_Sub2_7.anIDirect3DDevice1;
			@Pc(12) Class54_Sub3 local12 = this.aClass14_Sub2_Sub2_7.method7022();
			local7.a(0, local12.method5456(Static525.aFloatArray70));
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)V")
	@Override
	public void method7654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(Z)V")
	@Override
	public void method7649() {
		if (this.anIDirect3DVertexShader4 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass14_Sub2_Sub2_7.anIDirect3DDevice1;
		@Pc(18) int local18 = this.aClass14_Sub2_20.IA();
		@Pc(22) int local22 = this.aClass14_Sub2_20.U();
		@Pc(33) float local33 = (float) local18 - (float) (local18 - local22) * 0.125F;
		@Pc(43) float local43 = (float) local18 - (float) (local18 - local22) * 0.25F;
		local14.a(10, local43, 1.0F / (local33 - local43), local33, 1.0F / ((float) local18 - local33));
		local14.a(11, 1.0F / (float) this.aClass14_Sub2_20.method7035(), (float) this.aClass14_Sub2_20.method6973() / 255.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
	@Override
	public void method7644() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass14_Sub2_Sub2_7.anIDirect3DDevice1;
			@Pc(13) Class54_Sub3 local13 = this.aClass14_Sub2_Sub2_7.method7022();
			local8.a(0, local13.method5456(Static525.aFloatArray70));
		}
	}

	@OriginalMember(owner = "client!uba", name = "e", descriptor = "(I)V")
	private void method7212() {
		if (this.anIDirect3DVertexShader4 == null || !this.aBoolean639) {
			return;
		}
		@Pc(17) Class54_Sub3 local17 = this.aClass14_Sub2_20.method6992();
		@Pc(21) IDirect3DDevice local21 = this.aClass14_Sub2_Sub2_7.anIDirect3DDevice1;
		local21.a(13, this.aClass14_Sub2_20.aFloat182 * this.aClass14_Sub2_20.aFloat176, this.aClass14_Sub2_20.aFloat176 * this.aClass14_Sub2_20.aFloat172, this.aClass14_Sub2_20.aFloat170 * this.aClass14_Sub2_20.aFloat176, 1.0F);
		local21.a(14, this.aClass14_Sub2_20.aFloat167 * this.aClass14_Sub2_20.aFloat182, this.aClass14_Sub2_20.aFloat167 * this.aClass14_Sub2_20.aFloat172, this.aClass14_Sub2_20.aFloat167 * this.aClass14_Sub2_20.aFloat170, 1.0F);
		local21.a(16, this.aClass14_Sub2_20.aFloat178 * this.aClass14_Sub2_20.aFloat182, this.aClass14_Sub2_20.aFloat178 * this.aClass14_Sub2_20.aFloat172, this.aClass14_Sub2_20.aFloat170 * this.aClass14_Sub2_20.aFloat178, 1.0F);
		local17.method5448(this.aClass14_Sub2_20.aFloatArray62[2], this.aClass14_Sub2_20.aFloatArray62[1], Static525.aFloatArray69, this.aClass14_Sub2_20.aFloatArray62[0]);
		local21.SetVertexShaderConstantF(15, Static525.aFloatArray69, 1);
		local17.method5448(this.aClass14_Sub2_20.aFloatArray65[2], this.aClass14_Sub2_20.aFloatArray65[1], Static525.aFloatArray69, this.aClass14_Sub2_20.aFloatArray65[0]);
		local21.SetVertexShaderConstantF(15, Static525.aFloatArray69, 1);
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7647() {
		return this.aBoolean638;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7646(@OriginalArg(0) boolean arg0) {
		this.aBoolean639 = arg0;
	}

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "(B)V")
	@Override
	public void method7651() {
		@Pc(3) IDirect3DDevice local3 = this.aClass14_Sub2_Sub2_7.anIDirect3DDevice1;
		@Pc(16) int local16 = this.aClass14_Sub2_20.method6918();
		@Pc(21) Class54_Sub3 local21 = this.aClass14_Sub2_20.method6992();
		@Pc(33) IDirect3DVertexShader local33;
		if (this.aBoolean639) {
			local33 = local16 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader1;
		} else {
			local33 = Integer.MAX_VALUE == local16 ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader3;
		}
		if (this.anIDirect3DVertexShader4 != local33) {
			this.anIDirect3DVertexShader4 = local33;
			local3.SetVertexShader(local33);
			this.method7212();
			this.method7650();
			this.method7652();
			this.method7644();
			this.method7653();
			this.method7649();
		}
		local21.method5452((float) local16, 0.0F, -1.0F, Static525.aFloatArray69, 0.0F);
		local3.a(12, Static525.aFloatArray69);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7642(@OriginalArg(1) boolean arg0) {
	}
}
